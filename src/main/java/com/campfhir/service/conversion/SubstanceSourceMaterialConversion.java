package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.SubstanceSourceMaterial;
public class SubstanceSourceMaterialConversion 
{
	public org.hl7.fhir.r4.model.SubstanceSourceMaterial SubstanceSourceMaterials(SubstanceSourceMaterial s) throws ParseException
	{
		org.hl7.fhir.r4.model.SubstanceSourceMaterial substancesourcematerial = new org.hl7.fhir.r4.model.SubstanceSourceMaterial();

		/******************** id ********************************************************************************/
		substancesourcematerial.setId(s.getId());

		/******************** SbstncSrcMtrl_CntryOfOrigin_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlCntryOfOriginCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlCntryOfOriginCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getCountryOfOrigin().size() < i0+1) { substancesourcematerial.addCountryOfOrigin(); }
				String[] arrayi1 = s.getSbstncSrcMtrlCntryOfOriginCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancesourcematerial.getCountryOfOrigin().get(i0).getCoding().size() < i1+1) { substancesourcematerial.getCountryOfOrigin().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancesourcematerial.getCountryOfOrigin().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncSrcMtrl_CntryOfOrigin_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlCntryOfOriginCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlCntryOfOriginCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getCountryOfOrigin().size() < i0+1) { substancesourcematerial.addCountryOfOrigin(); }
				String[] arrayi1 = s.getSbstncSrcMtrlCntryOfOriginCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancesourcematerial.getCountryOfOrigin().get(i0).getCoding().size() < i1+1) { substancesourcematerial.getCountryOfOrigin().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancesourcematerial.getCountryOfOrigin().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncSrcMtrl_CntryOfOrigin_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlCntryOfOriginCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlCntryOfOriginCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getCountryOfOrigin().size() < i0+1) { substancesourcematerial.addCountryOfOrigin(); }
				String[] arrayi1 = s.getSbstncSrcMtrlCntryOfOriginCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancesourcematerial.getCountryOfOrigin().get(i0).getCoding().size() < i1+1) { substancesourcematerial.getCountryOfOrigin().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancesourcematerial.getCountryOfOrigin().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncSrcMtrl_CntryOfOrigin_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlCntryOfOriginCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlCntryOfOriginCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getCountryOfOrigin().size() < i0+1) { substancesourcematerial.addCountryOfOrigin(); }
				String[] arrayi1 = s.getSbstncSrcMtrlCntryOfOriginCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancesourcematerial.getCountryOfOrigin().get(i0).getCoding().size() < i1+1) { substancesourcematerial.getCountryOfOrigin().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancesourcematerial.getCountryOfOrigin().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SbstncSrcMtrl_CntryOfOrigin_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlCntryOfOriginCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlCntryOfOriginCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getCountryOfOrigin().size() < i0+1) { substancesourcematerial.addCountryOfOrigin(); }
				String[] arrayi1 = s.getSbstncSrcMtrlCntryOfOriginCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancesourcematerial.getCountryOfOrigin().get(i0).getCoding().size() < i1+1) { substancesourcematerial.getCountryOfOrigin().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancesourcematerial.getCountryOfOrigin().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncSrcMtrl_CntryOfOrigin_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlCntryOfOriginTxt() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlCntryOfOriginTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getCountryOfOrigin().size() < i0+1) { substancesourcematerial.addCountryOfOrigin(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getCountryOfOrigin().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_DevelopmentStage_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlDevelopmentStageCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlDevelopmentStageCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getDevelopmentStage().getCoding().size() < i0+1) { substancesourcematerial.getDevelopmentStage().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getDevelopmentStage().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_DevelopmentStage_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlDevelopmentStageCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlDevelopmentStageCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getDevelopmentStage().getCoding().size() < i0+1) { substancesourcematerial.getDevelopmentStage().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getDevelopmentStage().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_DevelopmentStage_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlDevelopmentStageCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlDevelopmentStageCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getDevelopmentStage().getCoding().size() < i0+1) { substancesourcematerial.getDevelopmentStage().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getDevelopmentStage().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_DevelopmentStage_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlDevelopmentStageCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlDevelopmentStageCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getDevelopmentStage().getCoding().size() < i0+1) { substancesourcematerial.getDevelopmentStage().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getDevelopmentStage().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncSrcMtrl_DevelopmentStage_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlDevelopmentStageCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlDevelopmentStageCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getDevelopmentStage().getCoding().size() < i0+1) { substancesourcematerial.getDevelopmentStage().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getDevelopmentStage().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_DevelopmentStage_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlDevelopmentStageTxt() != null ) {

			if(s.getSbstncSrcMtrlDevelopmentStageTxt().replace("[","").replace("]","").equals("NULL") | s.getSbstncSrcMtrlDevelopmentStageTxt()==null) {} else {
			substancesourcematerial.getDevelopmentStage().setText(s.getSbstncSrcMtrlDevelopmentStageTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SbstncSrcMtrl_FractionDscrptn_Fraction ********************************************************************************/
		if(s.getSbstncSrcMtrlFractionDscrptnFraction() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlFractionDscrptnFraction().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getFractionDescription().size() < i0+1) { substancesourcematerial.addFractionDescription(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getFractionDescription().get(i0).setFraction(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_FractionDscrptn_MtrlTyp_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlFractionDscrptnMtrlTypCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlFractionDscrptnMtrlTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getFractionDescription().size() < i0+1) { substancesourcematerial.addFractionDescription(); }
				String[] arrayi1 = s.getSbstncSrcMtrlFractionDscrptnMtrlTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancesourcematerial.getFractionDescription().get(i0).getMaterialType().getCoding().size() < i1+1) { substancesourcematerial.getFractionDescription().get(i0).getMaterialType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancesourcematerial.getFractionDescription().get(i0).getMaterialType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncSrcMtrl_FractionDscrptn_MtrlTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlFractionDscrptnMtrlTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlFractionDscrptnMtrlTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getFractionDescription().size() < i0+1) { substancesourcematerial.addFractionDescription(); }
				String[] arrayi1 = s.getSbstncSrcMtrlFractionDscrptnMtrlTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancesourcematerial.getFractionDescription().get(i0).getMaterialType().getCoding().size() < i1+1) { substancesourcematerial.getFractionDescription().get(i0).getMaterialType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancesourcematerial.getFractionDescription().get(i0).getMaterialType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncSrcMtrl_FractionDscrptn_MtrlTyp_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlFractionDscrptnMtrlTypCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlFractionDscrptnMtrlTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getFractionDescription().size() < i0+1) { substancesourcematerial.addFractionDescription(); }
				String[] arrayi1 = s.getSbstncSrcMtrlFractionDscrptnMtrlTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancesourcematerial.getFractionDescription().get(i0).getMaterialType().getCoding().size() < i1+1) { substancesourcematerial.getFractionDescription().get(i0).getMaterialType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancesourcematerial.getFractionDescription().get(i0).getMaterialType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncSrcMtrl_FractionDscrptn_MtrlTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlFractionDscrptnMtrlTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlFractionDscrptnMtrlTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getFractionDescription().size() < i0+1) { substancesourcematerial.addFractionDescription(); }
				String[] arrayi1 = s.getSbstncSrcMtrlFractionDscrptnMtrlTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancesourcematerial.getFractionDescription().get(i0).getMaterialType().getCoding().size() < i1+1) { substancesourcematerial.getFractionDescription().get(i0).getMaterialType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancesourcematerial.getFractionDescription().get(i0).getMaterialType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SbstncSrcMtrl_FractionDscrptn_MtrlTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlFractionDscrptnMtrlTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlFractionDscrptnMtrlTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getFractionDescription().size() < i0+1) { substancesourcematerial.addFractionDescription(); }
				String[] arrayi1 = s.getSbstncSrcMtrlFractionDscrptnMtrlTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancesourcematerial.getFractionDescription().get(i0).getMaterialType().getCoding().size() < i1+1) { substancesourcematerial.getFractionDescription().get(i0).getMaterialType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancesourcematerial.getFractionDescription().get(i0).getMaterialType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncSrcMtrl_FractionDscrptn_MtrlTyp_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlFractionDscrptnMtrlTypTxt() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlFractionDscrptnMtrlTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getFractionDescription().size() < i0+1) { substancesourcematerial.addFractionDescription(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getFractionDescription().get(i0).getMaterialType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_GeographicalLctn ********************************************************************************/
		if(s.getSbstncSrcMtrlGeographicalLctn() != null ) {

				for( String currListStrSplit : s.getSbstncSrcMtrlGeographicalLctn().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			substancesourcematerial.addGeographicalLocation(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** SbstncSrcMtrl_Orgnsm_Athr_AthrDscrptn ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmAthrAthrDscrptn() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmAthrAthrDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getAuthor().size() < i0+1) { substancesourcematerial.getOrganism().addAuthor(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getAuthor().get(i0).setAuthorDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_Athr_AthrTyp_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmAthrAthrTypCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmAthrAthrTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getAuthor().size() < i0+1) { substancesourcematerial.getOrganism().addAuthor(); }
				String[] arrayi1 = s.getSbstncSrcMtrlOrgnsmAthrAthrTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancesourcematerial.getOrganism().getAuthor().get(i0).getAuthorType().getCoding().size() < i1+1) { substancesourcematerial.getOrganism().getAuthor().get(i0).getAuthorType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancesourcematerial.getOrganism().getAuthor().get(i0).getAuthorType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_Athr_AthrTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmAthrAthrTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmAthrAthrTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getAuthor().size() < i0+1) { substancesourcematerial.getOrganism().addAuthor(); }
				String[] arrayi1 = s.getSbstncSrcMtrlOrgnsmAthrAthrTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancesourcematerial.getOrganism().getAuthor().get(i0).getAuthorType().getCoding().size() < i1+1) { substancesourcematerial.getOrganism().getAuthor().get(i0).getAuthorType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancesourcematerial.getOrganism().getAuthor().get(i0).getAuthorType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_Athr_AthrTyp_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmAthrAthrTypCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmAthrAthrTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getAuthor().size() < i0+1) { substancesourcematerial.getOrganism().addAuthor(); }
				String[] arrayi1 = s.getSbstncSrcMtrlOrgnsmAthrAthrTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancesourcematerial.getOrganism().getAuthor().get(i0).getAuthorType().getCoding().size() < i1+1) { substancesourcematerial.getOrganism().getAuthor().get(i0).getAuthorType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancesourcematerial.getOrganism().getAuthor().get(i0).getAuthorType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_Athr_AthrTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmAthrAthrTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmAthrAthrTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getAuthor().size() < i0+1) { substancesourcematerial.getOrganism().addAuthor(); }
				String[] arrayi1 = s.getSbstncSrcMtrlOrgnsmAthrAthrTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancesourcematerial.getOrganism().getAuthor().get(i0).getAuthorType().getCoding().size() < i1+1) { substancesourcematerial.getOrganism().getAuthor().get(i0).getAuthorType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancesourcematerial.getOrganism().getAuthor().get(i0).getAuthorType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_Athr_AthrTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmAthrAthrTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmAthrAthrTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getAuthor().size() < i0+1) { substancesourcematerial.getOrganism().addAuthor(); }
				String[] arrayi1 = s.getSbstncSrcMtrlOrgnsmAthrAthrTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancesourcematerial.getOrganism().getAuthor().get(i0).getAuthorType().getCoding().size() < i1+1) { substancesourcematerial.getOrganism().getAuthor().get(i0).getAuthorType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancesourcematerial.getOrganism().getAuthor().get(i0).getAuthorType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_Athr_AthrTyp_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmAthrAthrTypTxt() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmAthrAthrTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getAuthor().size() < i0+1) { substancesourcematerial.getOrganism().addAuthor(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getAuthor().get(i0).getAuthorType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_Fmly_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmFmlyCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmFmlyCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getFamily().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getFamily().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getFamily().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_Fmly_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmFmlyCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmFmlyCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getFamily().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getFamily().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getFamily().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_Fmly_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmFmlyCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmFmlyCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getFamily().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getFamily().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getFamily().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_Fmly_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmFmlyCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmFmlyCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getFamily().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getFamily().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getFamily().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_Fmly_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmFmlyCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmFmlyCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getFamily().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getFamily().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getFamily().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_Fmly_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmFmlyTxt() != null ) {

			if(s.getSbstncSrcMtrlOrgnsmFmlyTxt().replace("[","").replace("]","").equals("NULL") | s.getSbstncSrcMtrlOrgnsmFmlyTxt()==null) {} else {
			substancesourcematerial.getOrganism().getFamily().setText(s.getSbstncSrcMtrlOrgnsmFmlyTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SbstncSrcMtrl_Orgnsm_Genus_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmGenusCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmGenusCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getGenus().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getGenus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getGenus().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_Genus_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmGenusCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmGenusCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getGenus().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getGenus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getGenus().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_Genus_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmGenusCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmGenusCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getGenus().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getGenus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getGenus().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_Genus_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmGenusCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmGenusCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getGenus().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getGenus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getGenus().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_Genus_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmGenusCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmGenusCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getGenus().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getGenus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getGenus().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_Genus_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmGenusTxt() != null ) {

			if(s.getSbstncSrcMtrlOrgnsmGenusTxt().replace("[","").replace("]","").equals("NULL") | s.getSbstncSrcMtrlOrgnsmGenusTxt()==null) {} else {
			substancesourcematerial.getOrganism().getGenus().setText(s.getSbstncSrcMtrlOrgnsmGenusTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_HybridTyp_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmHybridHybridTypCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmHybridHybridTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getHybrid().getHybridType().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getHybrid().getHybridType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getHybrid().getHybridType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_HybridTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmHybridHybridTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmHybridHybridTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getHybrid().getHybridType().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getHybrid().getHybridType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getHybrid().getHybridType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_HybridTyp_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmHybridHybridTypCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmHybridHybridTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getHybrid().getHybridType().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getHybrid().getHybridType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getHybrid().getHybridType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_HybridTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmHybridHybridTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmHybridHybridTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getHybrid().getHybridType().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getHybrid().getHybridType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getHybrid().getHybridType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_HybridTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmHybridHybridTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmHybridHybridTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getHybrid().getHybridType().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getHybrid().getHybridType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getHybrid().getHybridType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_HybridTyp_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmHybridHybridTypTxt() != null ) {

			if(s.getSbstncSrcMtrlOrgnsmHybridHybridTypTxt().replace("[","").replace("]","").equals("NULL") | s.getSbstncSrcMtrlOrgnsmHybridHybridTypTxt()==null) {} else {
			substancesourcematerial.getOrganism().getHybrid().getHybridType().setText(s.getSbstncSrcMtrlOrgnsmHybridHybridTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_MaternalOrgnsmId ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmHybridMaternalOrgnsmId() != null ) {

			if(s.getSbstncSrcMtrlOrgnsmHybridMaternalOrgnsmId().replace("[","").replace("]","").equals("NULL") | s.getSbstncSrcMtrlOrgnsmHybridMaternalOrgnsmId()==null) {} else {
			substancesourcematerial.getOrganism().getHybrid().setMaternalOrganismId(s.getSbstncSrcMtrlOrgnsmHybridMaternalOrgnsmId().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_MaternalOrgnsmNm ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmHybridMaternalOrgnsmNm() != null ) {

			if(s.getSbstncSrcMtrlOrgnsmHybridMaternalOrgnsmNm().replace("[","").replace("]","").equals("NULL") | s.getSbstncSrcMtrlOrgnsmHybridMaternalOrgnsmNm()==null) {} else {
			substancesourcematerial.getOrganism().getHybrid().setMaternalOrganismName(s.getSbstncSrcMtrlOrgnsmHybridMaternalOrgnsmNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_PaternalOrgnsmId ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmHybridPaternalOrgnsmId() != null ) {

			if(s.getSbstncSrcMtrlOrgnsmHybridPaternalOrgnsmId().replace("[","").replace("]","").equals("NULL") | s.getSbstncSrcMtrlOrgnsmHybridPaternalOrgnsmId()==null) {} else {
			substancesourcematerial.getOrganism().getHybrid().setPaternalOrganismId(s.getSbstncSrcMtrlOrgnsmHybridPaternalOrgnsmId().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SbstncSrcMtrl_Orgnsm_Hybrid_PaternalOrgnsmNm ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmHybridPaternalOrgnsmNm() != null ) {

			if(s.getSbstncSrcMtrlOrgnsmHybridPaternalOrgnsmNm().replace("[","").replace("]","").equals("NULL") | s.getSbstncSrcMtrlOrgnsmHybridPaternalOrgnsmNm()==null) {} else {
			substancesourcematerial.getOrganism().getHybrid().setPaternalOrganismName(s.getSbstncSrcMtrlOrgnsmHybridPaternalOrgnsmNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SbstncSrcMtrl_Orgnsm_IntraspecificDscrptn ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIntraspecificDscrptn() != null ) {

			if(s.getSbstncSrcMtrlOrgnsmIntraspecificDscrptn().replace("[","").replace("]","").equals("NULL") | s.getSbstncSrcMtrlOrgnsmIntraspecificDscrptn()==null) {} else {
			substancesourcematerial.getOrganism().setIntraspecificDescription(s.getSbstncSrcMtrlOrgnsmIntraspecificDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SbstncSrcMtrl_Orgnsm_IntraspecificTyp_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIntraspecificTypCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmIntraspecificTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getIntraspecificType().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getIntraspecificType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getIntraspecificType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_IntraspecificTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIntraspecificTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmIntraspecificTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getIntraspecificType().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getIntraspecificType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getIntraspecificType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_IntraspecificTyp_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIntraspecificTypCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmIntraspecificTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getIntraspecificType().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getIntraspecificType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getIntraspecificType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_IntraspecificTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIntraspecificTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmIntraspecificTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getIntraspecificType().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getIntraspecificType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getIntraspecificType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_IntraspecificTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIntraspecificTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmIntraspecificTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getIntraspecificType().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getIntraspecificType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getIntraspecificType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_IntraspecificTyp_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIntraspecificTypTxt() != null ) {

			if(s.getSbstncSrcMtrlOrgnsmIntraspecificTypTxt().replace("[","").replace("]","").equals("NULL") | s.getSbstncSrcMtrlOrgnsmIntraspecificTypTxt()==null) {} else {
			substancesourcematerial.getOrganism().getIntraspecificType().setText(s.getSbstncSrcMtrlOrgnsmIntraspecificTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Cls__Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getOrganismGeneral().getClass_().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getOrganismGeneral().getClass_().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getOrganismGeneral().getClass_().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Cls__Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getOrganismGeneral().getClass_().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getOrganismGeneral().getClass_().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getOrganismGeneral().getClass_().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Cls__Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getOrganismGeneral().getClass_().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getOrganismGeneral().getClass_().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getOrganismGeneral().getClass_().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Cls__Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getOrganismGeneral().getClass_().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getOrganismGeneral().getClass_().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getOrganismGeneral().getClass_().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Cls__Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralClsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getOrganismGeneral().getClass_().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getOrganismGeneral().getClass_().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getOrganismGeneral().getClass_().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Cls__Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralClsTxt() != null ) {

			if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralClsTxt().replace("[","").replace("]","").equals("NULL") | s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralClsTxt()==null) {} else {
			substancesourcematerial.getOrganism().getOrganismGeneral().getClass_().setText(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralClsTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Kingdom_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getOrganismGeneral().getKingdom().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getOrganismGeneral().getKingdom().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getOrganismGeneral().getKingdom().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Kingdom_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getOrganismGeneral().getKingdom().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getOrganismGeneral().getKingdom().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getOrganismGeneral().getKingdom().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Kingdom_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getOrganismGeneral().getKingdom().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getOrganismGeneral().getKingdom().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getOrganismGeneral().getKingdom().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Kingdom_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getOrganismGeneral().getKingdom().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getOrganismGeneral().getKingdom().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getOrganismGeneral().getKingdom().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Kingdom_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getOrganismGeneral().getKingdom().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getOrganismGeneral().getKingdom().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getOrganismGeneral().getKingdom().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Kingdom_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomTxt() != null ) {

			if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomTxt().replace("[","").replace("]","").equals("NULL") | s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomTxt()==null) {} else {
			substancesourcematerial.getOrganism().getOrganismGeneral().getKingdom().setText(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralKingdomTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Ordr_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getOrganismGeneral().getOrder().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getOrganismGeneral().getOrder().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getOrganismGeneral().getOrder().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Ordr_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getOrganismGeneral().getOrder().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getOrganismGeneral().getOrder().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getOrganismGeneral().getOrder().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Ordr_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getOrganismGeneral().getOrder().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getOrganismGeneral().getOrder().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getOrganismGeneral().getOrder().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Ordr_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getOrganismGeneral().getOrder().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getOrganismGeneral().getOrder().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getOrganismGeneral().getOrder().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Ordr_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getOrganismGeneral().getOrder().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getOrganismGeneral().getOrder().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getOrganismGeneral().getOrder().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Ordr_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrTxt() != null ) {

			if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrTxt().replace("[","").replace("]","").equals("NULL") | s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrTxt()==null) {} else {
			substancesourcematerial.getOrganism().getOrganismGeneral().getOrder().setText(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralOrdrTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Phylum_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getOrganismGeneral().getPhylum().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getOrganismGeneral().getPhylum().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getOrganismGeneral().getPhylum().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Phylum_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getOrganismGeneral().getPhylum().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getOrganismGeneral().getPhylum().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getOrganismGeneral().getPhylum().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Phylum_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getOrganismGeneral().getPhylum().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getOrganismGeneral().getPhylum().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getOrganismGeneral().getPhylum().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Phylum_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getOrganismGeneral().getPhylum().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getOrganismGeneral().getPhylum().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getOrganismGeneral().getPhylum().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Phylum_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getOrganismGeneral().getPhylum().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getOrganismGeneral().getPhylum().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getOrganismGeneral().getPhylum().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_OrgnsmGeneral_Phylum_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumTxt() != null ) {

			if(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumTxt().replace("[","").replace("]","").equals("NULL") | s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumTxt()==null) {} else {
			substancesourcematerial.getOrganism().getOrganismGeneral().getPhylum().setText(s.getSbstncSrcMtrlOrgnsmOrgnsmGeneralPhylumTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SbstncSrcMtrl_Orgnsm_Spcs_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmSpcsCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmSpcsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getSpecies().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getSpecies().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getSpecies().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_Spcs_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmSpcsCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmSpcsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getSpecies().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getSpecies().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getSpecies().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_Spcs_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmSpcsCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmSpcsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getSpecies().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getSpecies().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getSpecies().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_Spcs_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmSpcsCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmSpcsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getSpecies().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getSpecies().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getSpecies().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_Spcs_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmSpcsCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmSpcsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganism().getSpecies().getCoding().size() < i0+1) { substancesourcematerial.getOrganism().getSpecies().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganism().getSpecies().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_Orgnsm_Spcs_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmSpcsTxt() != null ) {

			if(s.getSbstncSrcMtrlOrgnsmSpcsTxt().replace("[","").replace("]","").equals("NULL") | s.getSbstncSrcMtrlOrgnsmSpcsTxt()==null) {} else {
			substancesourcematerial.getOrganism().getSpecies().setText(s.getSbstncSrcMtrlOrgnsmSpcsTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SbstncSrcMtrl_OrgnsmId_Assigner ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIdAssigner() != null ) {

			if(s.getSbstncSrcMtrlOrgnsmIdAssigner().replace("[","").replace("]","").equals("NULL") | s.getSbstncSrcMtrlOrgnsmIdAssigner()==null) {} else {
			substancesourcematerial.getOrganismId().setAssigner(new org.hl7.fhir.r4.model.Reference(s.getSbstncSrcMtrlOrgnsmIdAssigner().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SbstncSrcMtrl_OrgnsmId_Prd_End ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIdPrdEnd() != null ) {

			if(s.getSbstncSrcMtrlOrgnsmIdPrdEnd().replace("[","").replace("]","").equals("NULL") | s.getSbstncSrcMtrlOrgnsmIdPrdEnd()==null) {} else {
			substancesourcematerial.getOrganismId().getPeriod().setEnd(s.getSbstncSrcMtrlOrgnsmIdPrdEnd().replace("[","").replace("]","").equals("NULL") | s.getSbstncSrcMtrlOrgnsmIdPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(s.getSbstncSrcMtrlOrgnsmIdPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SbstncSrcMtrl_OrgnsmId_Prd_Strt ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIdPrdStrt() != null ) {

			if(s.getSbstncSrcMtrlOrgnsmIdPrdStrt().replace("[","").replace("]","").equals("NULL") | s.getSbstncSrcMtrlOrgnsmIdPrdStrt()==null) {} else {
			substancesourcematerial.getOrganismId().getPeriod().setStart(s.getSbstncSrcMtrlOrgnsmIdPrdStrt().replace("[","").replace("]","").equals("NULL") | s.getSbstncSrcMtrlOrgnsmIdPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(s.getSbstncSrcMtrlOrgnsmIdPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SbstncSrcMtrl_OrgnsmId_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIdSys() != null ) {

			if(s.getSbstncSrcMtrlOrgnsmIdSys().replace("[","").replace("]","").equals("NULL") | s.getSbstncSrcMtrlOrgnsmIdSys()==null) {} else {
			substancesourcematerial.getOrganismId().setSystem(s.getSbstncSrcMtrlOrgnsmIdSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SbstncSrcMtrl_OrgnsmId_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIdTypCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganismId().getType().getCoding().size() < i0+1) { substancesourcematerial.getOrganismId().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganismId().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_OrgnsmId_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIdTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganismId().getType().getCoding().size() < i0+1) { substancesourcematerial.getOrganismId().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganismId().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_OrgnsmId_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIdTypCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganismId().getType().getCoding().size() < i0+1) { substancesourcematerial.getOrganismId().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganismId().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_OrgnsmId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganismId().getType().getCoding().size() < i0+1) { substancesourcematerial.getOrganismId().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganismId().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncSrcMtrl_OrgnsmId_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIdTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlOrgnsmIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getOrganismId().getType().getCoding().size() < i0+1) { substancesourcematerial.getOrganismId().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getOrganismId().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_OrgnsmId_Typ_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIdTypTxt() != null ) {

			if(s.getSbstncSrcMtrlOrgnsmIdTypTxt().replace("[","").replace("]","").equals("NULL") | s.getSbstncSrcMtrlOrgnsmIdTypTxt()==null) {} else {
			substancesourcematerial.getOrganismId().getType().setText(s.getSbstncSrcMtrlOrgnsmIdTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SbstncSrcMtrl_OrgnsmId_Use ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIdUse() != null ) {

			if(s.getSbstncSrcMtrlOrgnsmIdUse().replace("[","").replace("]","").equals("NULL") | s.getSbstncSrcMtrlOrgnsmIdUse()==null) {} else {
			substancesourcematerial.getOrganismId().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(s.getSbstncSrcMtrlOrgnsmIdUse().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SbstncSrcMtrl_OrgnsmId_Vl ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmIdVl() != null ) {

			if(s.getSbstncSrcMtrlOrgnsmIdVl().replace("[","").replace("]","").equals("NULL") | s.getSbstncSrcMtrlOrgnsmIdVl()==null) {} else {
			substancesourcematerial.getOrganismId().setValue(s.getSbstncSrcMtrlOrgnsmIdVl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SbstncSrcMtrl_OrgnsmNm ********************************************************************************/
		if(s.getSbstncSrcMtrlOrgnsmNm() != null ) {

			if(s.getSbstncSrcMtrlOrgnsmNm().replace("[","").replace("]","").equals("NULL") | s.getSbstncSrcMtrlOrgnsmNm()==null) {} else {
			substancesourcematerial.setOrganismName(s.getSbstncSrcMtrlOrgnsmNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SbstncSrcMtrl_ParentSbstncId_Assigner ********************************************************************************/
		if(s.getSbstncSrcMtrlParentSbstncIdAssigner() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlParentSbstncIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getParentSubstanceId().size() < i0+1) { substancesourcematerial.addParentSubstanceId(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getParentSubstanceId().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncSrcMtrl_ParentSbstncId_Prd_End ********************************************************************************/
		if(s.getSbstncSrcMtrlParentSbstncIdPrdEnd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlParentSbstncIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getParentSubstanceId().size() < i0+1) { substancesourcematerial.addParentSubstanceId(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getParentSubstanceId().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncSrcMtrl_ParentSbstncId_Prd_Strt ********************************************************************************/
		if(s.getSbstncSrcMtrlParentSbstncIdPrdStrt() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlParentSbstncIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getParentSubstanceId().size() < i0+1) { substancesourcematerial.addParentSubstanceId(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getParentSubstanceId().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncSrcMtrl_ParentSbstncId_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlParentSbstncIdSys() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlParentSbstncIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getParentSubstanceId().size() < i0+1) { substancesourcematerial.addParentSubstanceId(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getParentSubstanceId().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_ParentSbstncId_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlParentSbstncIdTypCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlParentSbstncIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getParentSubstanceId().size() < i0+1) { substancesourcematerial.addParentSubstanceId(); }
				String[] arrayi1 = s.getSbstncSrcMtrlParentSbstncIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancesourcematerial.getParentSubstanceId().get(i0).getType().getCoding().size() < i1+1) { substancesourcematerial.getParentSubstanceId().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancesourcematerial.getParentSubstanceId().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncSrcMtrl_ParentSbstncId_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlParentSbstncIdTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlParentSbstncIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getParentSubstanceId().size() < i0+1) { substancesourcematerial.addParentSubstanceId(); }
				String[] arrayi1 = s.getSbstncSrcMtrlParentSbstncIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancesourcematerial.getParentSubstanceId().get(i0).getType().getCoding().size() < i1+1) { substancesourcematerial.getParentSubstanceId().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancesourcematerial.getParentSubstanceId().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncSrcMtrl_ParentSbstncId_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlParentSbstncIdTypCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlParentSbstncIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getParentSubstanceId().size() < i0+1) { substancesourcematerial.addParentSubstanceId(); }
				String[] arrayi1 = s.getSbstncSrcMtrlParentSbstncIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancesourcematerial.getParentSubstanceId().get(i0).getType().getCoding().size() < i1+1) { substancesourcematerial.getParentSubstanceId().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancesourcematerial.getParentSubstanceId().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncSrcMtrl_ParentSbstncId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlParentSbstncIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlParentSbstncIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getParentSubstanceId().size() < i0+1) { substancesourcematerial.addParentSubstanceId(); }
				String[] arrayi1 = s.getSbstncSrcMtrlParentSbstncIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancesourcematerial.getParentSubstanceId().get(i0).getType().getCoding().size() < i1+1) { substancesourcematerial.getParentSubstanceId().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancesourcematerial.getParentSubstanceId().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SbstncSrcMtrl_ParentSbstncId_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlParentSbstncIdTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlParentSbstncIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getParentSubstanceId().size() < i0+1) { substancesourcematerial.addParentSubstanceId(); }
				String[] arrayi1 = s.getSbstncSrcMtrlParentSbstncIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancesourcematerial.getParentSubstanceId().get(i0).getType().getCoding().size() < i1+1) { substancesourcematerial.getParentSubstanceId().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancesourcematerial.getParentSubstanceId().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncSrcMtrl_ParentSbstncId_Typ_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlParentSbstncIdTypTxt() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlParentSbstncIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getParentSubstanceId().size() < i0+1) { substancesourcematerial.addParentSubstanceId(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getParentSubstanceId().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_ParentSbstncId_Use ********************************************************************************/
		if(s.getSbstncSrcMtrlParentSbstncIdUse() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlParentSbstncIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getParentSubstanceId().size() < i0+1) { substancesourcematerial.addParentSubstanceId(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getParentSubstanceId().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncSrcMtrl_ParentSbstncId_Vl ********************************************************************************/
		if(s.getSbstncSrcMtrlParentSbstncIdVl() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlParentSbstncIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getParentSubstanceId().size() < i0+1) { substancesourcematerial.addParentSubstanceId(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getParentSubstanceId().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_ParentSbstncNm ********************************************************************************/
		if(s.getSbstncSrcMtrlParentSbstncNm() != null ) {

				for( String currListStrSplit : s.getSbstncSrcMtrlParentSbstncNm().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			substancesourcematerial.addParentSubstanceName(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** SbstncSrcMtrl_PartDscrptn_Part_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlPartDscrptnPartCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlPartDscrptnPartCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getPartDescription().size() < i0+1) { substancesourcematerial.addPartDescription(); }
				String[] arrayi1 = s.getSbstncSrcMtrlPartDscrptnPartCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancesourcematerial.getPartDescription().get(i0).getPart().getCoding().size() < i1+1) { substancesourcematerial.getPartDescription().get(i0).getPart().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancesourcematerial.getPartDescription().get(i0).getPart().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncSrcMtrl_PartDscrptn_Part_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlPartDscrptnPartCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlPartDscrptnPartCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getPartDescription().size() < i0+1) { substancesourcematerial.addPartDescription(); }
				String[] arrayi1 = s.getSbstncSrcMtrlPartDscrptnPartCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancesourcematerial.getPartDescription().get(i0).getPart().getCoding().size() < i1+1) { substancesourcematerial.getPartDescription().get(i0).getPart().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancesourcematerial.getPartDescription().get(i0).getPart().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncSrcMtrl_PartDscrptn_Part_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlPartDscrptnPartCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlPartDscrptnPartCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getPartDescription().size() < i0+1) { substancesourcematerial.addPartDescription(); }
				String[] arrayi1 = s.getSbstncSrcMtrlPartDscrptnPartCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancesourcematerial.getPartDescription().get(i0).getPart().getCoding().size() < i1+1) { substancesourcematerial.getPartDescription().get(i0).getPart().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancesourcematerial.getPartDescription().get(i0).getPart().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncSrcMtrl_PartDscrptn_Part_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlPartDscrptnPartCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlPartDscrptnPartCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getPartDescription().size() < i0+1) { substancesourcematerial.addPartDescription(); }
				String[] arrayi1 = s.getSbstncSrcMtrlPartDscrptnPartCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancesourcematerial.getPartDescription().get(i0).getPart().getCoding().size() < i1+1) { substancesourcematerial.getPartDescription().get(i0).getPart().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancesourcematerial.getPartDescription().get(i0).getPart().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SbstncSrcMtrl_PartDscrptn_Part_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlPartDscrptnPartCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlPartDscrptnPartCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getPartDescription().size() < i0+1) { substancesourcematerial.addPartDescription(); }
				String[] arrayi1 = s.getSbstncSrcMtrlPartDscrptnPartCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancesourcematerial.getPartDescription().get(i0).getPart().getCoding().size() < i1+1) { substancesourcematerial.getPartDescription().get(i0).getPart().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancesourcematerial.getPartDescription().get(i0).getPart().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncSrcMtrl_PartDscrptn_Part_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlPartDscrptnPartTxt() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlPartDscrptnPartTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getPartDescription().size() < i0+1) { substancesourcematerial.addPartDescription(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getPartDescription().get(i0).getPart().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_PartDscrptn_PartLctn_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlPartDscrptnPartLctnCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlPartDscrptnPartLctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getPartDescription().size() < i0+1) { substancesourcematerial.addPartDescription(); }
				String[] arrayi1 = s.getSbstncSrcMtrlPartDscrptnPartLctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancesourcematerial.getPartDescription().get(i0).getPartLocation().getCoding().size() < i1+1) { substancesourcematerial.getPartDescription().get(i0).getPartLocation().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancesourcematerial.getPartDescription().get(i0).getPartLocation().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncSrcMtrl_PartDscrptn_PartLctn_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlPartDscrptnPartLctnCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlPartDscrptnPartLctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getPartDescription().size() < i0+1) { substancesourcematerial.addPartDescription(); }
				String[] arrayi1 = s.getSbstncSrcMtrlPartDscrptnPartLctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancesourcematerial.getPartDescription().get(i0).getPartLocation().getCoding().size() < i1+1) { substancesourcematerial.getPartDescription().get(i0).getPartLocation().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancesourcematerial.getPartDescription().get(i0).getPartLocation().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncSrcMtrl_PartDscrptn_PartLctn_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlPartDscrptnPartLctnCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlPartDscrptnPartLctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getPartDescription().size() < i0+1) { substancesourcematerial.addPartDescription(); }
				String[] arrayi1 = s.getSbstncSrcMtrlPartDscrptnPartLctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancesourcematerial.getPartDescription().get(i0).getPartLocation().getCoding().size() < i1+1) { substancesourcematerial.getPartDescription().get(i0).getPartLocation().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancesourcematerial.getPartDescription().get(i0).getPartLocation().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncSrcMtrl_PartDscrptn_PartLctn_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlPartDscrptnPartLctnCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlPartDscrptnPartLctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getPartDescription().size() < i0+1) { substancesourcematerial.addPartDescription(); }
				String[] arrayi1 = s.getSbstncSrcMtrlPartDscrptnPartLctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancesourcematerial.getPartDescription().get(i0).getPartLocation().getCoding().size() < i1+1) { substancesourcematerial.getPartDescription().get(i0).getPartLocation().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancesourcematerial.getPartDescription().get(i0).getPartLocation().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SbstncSrcMtrl_PartDscrptn_PartLctn_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlPartDscrptnPartLctnCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlPartDscrptnPartLctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getPartDescription().size() < i0+1) { substancesourcematerial.addPartDescription(); }
				String[] arrayi1 = s.getSbstncSrcMtrlPartDscrptnPartLctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(substancesourcematerial.getPartDescription().get(i0).getPartLocation().getCoding().size() < i1+1) { substancesourcematerial.getPartDescription().get(i0).getPartLocation().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {substancesourcematerial.getPartDescription().get(i0).getPartLocation().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SbstncSrcMtrl_PartDscrptn_PartLctn_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlPartDscrptnPartLctnTxt() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlPartDscrptnPartLctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getPartDescription().size() < i0+1) { substancesourcematerial.addPartDescription(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getPartDescription().get(i0).getPartLocation().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_SrcMtrlCls_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlSrcMtrlClsCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlSrcMtrlClsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getSourceMaterialClass().getCoding().size() < i0+1) { substancesourcematerial.getSourceMaterialClass().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getSourceMaterialClass().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_SrcMtrlCls_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlSrcMtrlClsCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlSrcMtrlClsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getSourceMaterialClass().getCoding().size() < i0+1) { substancesourcematerial.getSourceMaterialClass().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getSourceMaterialClass().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_SrcMtrlCls_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlSrcMtrlClsCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlSrcMtrlClsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getSourceMaterialClass().getCoding().size() < i0+1) { substancesourcematerial.getSourceMaterialClass().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getSourceMaterialClass().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_SrcMtrlCls_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlSrcMtrlClsCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlSrcMtrlClsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getSourceMaterialClass().getCoding().size() < i0+1) { substancesourcematerial.getSourceMaterialClass().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getSourceMaterialClass().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncSrcMtrl_SrcMtrlCls_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlSrcMtrlClsCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlSrcMtrlClsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getSourceMaterialClass().getCoding().size() < i0+1) { substancesourcematerial.getSourceMaterialClass().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getSourceMaterialClass().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_SrcMtrlCls_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlSrcMtrlClsTxt() != null ) {

			if(s.getSbstncSrcMtrlSrcMtrlClsTxt().replace("[","").replace("]","").equals("NULL") | s.getSbstncSrcMtrlSrcMtrlClsTxt()==null) {} else {
			substancesourcematerial.getSourceMaterialClass().setText(s.getSbstncSrcMtrlSrcMtrlClsTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SbstncSrcMtrl_SrcMtrlState_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlSrcMtrlStateCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlSrcMtrlStateCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getSourceMaterialState().getCoding().size() < i0+1) { substancesourcematerial.getSourceMaterialState().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getSourceMaterialState().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_SrcMtrlState_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlSrcMtrlStateCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlSrcMtrlStateCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getSourceMaterialState().getCoding().size() < i0+1) { substancesourcematerial.getSourceMaterialState().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getSourceMaterialState().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_SrcMtrlState_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlSrcMtrlStateCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlSrcMtrlStateCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getSourceMaterialState().getCoding().size() < i0+1) { substancesourcematerial.getSourceMaterialState().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getSourceMaterialState().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_SrcMtrlState_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlSrcMtrlStateCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlSrcMtrlStateCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getSourceMaterialState().getCoding().size() < i0+1) { substancesourcematerial.getSourceMaterialState().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getSourceMaterialState().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncSrcMtrl_SrcMtrlState_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlSrcMtrlStateCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlSrcMtrlStateCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getSourceMaterialState().getCoding().size() < i0+1) { substancesourcematerial.getSourceMaterialState().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getSourceMaterialState().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_SrcMtrlState_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlSrcMtrlStateTxt() != null ) {

			if(s.getSbstncSrcMtrlSrcMtrlStateTxt().replace("[","").replace("]","").equals("NULL") | s.getSbstncSrcMtrlSrcMtrlStateTxt()==null) {} else {
			substancesourcematerial.getSourceMaterialState().setText(s.getSbstncSrcMtrlSrcMtrlStateTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SbstncSrcMtrl_SrcMtrlTyp_Cdg_Cd ********************************************************************************/
		if(s.getSbstncSrcMtrlSrcMtrlTypCdgCd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlSrcMtrlTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getSourceMaterialType().getCoding().size() < i0+1) { substancesourcematerial.getSourceMaterialType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getSourceMaterialType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_SrcMtrlTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSbstncSrcMtrlSrcMtrlTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlSrcMtrlTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getSourceMaterialType().getCoding().size() < i0+1) { substancesourcematerial.getSourceMaterialType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getSourceMaterialType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_SrcMtrlTyp_Cdg_Sys ********************************************************************************/
		if(s.getSbstncSrcMtrlSrcMtrlTypCdgSys() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlSrcMtrlTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getSourceMaterialType().getCoding().size() < i0+1) { substancesourcematerial.getSourceMaterialType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getSourceMaterialType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_SrcMtrlTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSbstncSrcMtrlSrcMtrlTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlSrcMtrlTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getSourceMaterialType().getCoding().size() < i0+1) { substancesourcematerial.getSourceMaterialType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getSourceMaterialType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SbstncSrcMtrl_SrcMtrlTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSbstncSrcMtrlSrcMtrlTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSbstncSrcMtrlSrcMtrlTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(substancesourcematerial.getSourceMaterialType().getCoding().size() < i0+1) { substancesourcematerial.getSourceMaterialType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {substancesourcematerial.getSourceMaterialType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SbstncSrcMtrl_SrcMtrlTyp_Txt ********************************************************************************/
		if(s.getSbstncSrcMtrlSrcMtrlTypTxt() != null ) {

			if(s.getSbstncSrcMtrlSrcMtrlTypTxt().replace("[","").replace("]","").equals("NULL") | s.getSbstncSrcMtrlSrcMtrlTypTxt()==null) {} else {
			substancesourcematerial.getSourceMaterialType().setText(s.getSbstncSrcMtrlSrcMtrlTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return substancesourcematerial;
	}
}
