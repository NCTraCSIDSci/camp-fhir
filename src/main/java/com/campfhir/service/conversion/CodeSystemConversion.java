package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.CodeSystem;
public class CodeSystemConversion 
{
	public org.hl7.fhir.r4.model.CodeSystem CodeSystems(CodeSystem c) throws ParseException
	{
		org.hl7.fhir.r4.model.CodeSystem codesystem = new org.hl7.fhir.r4.model.CodeSystem();

		/******************** id ********************************************************************************/
		codesystem.setId(c.getId());

		/******************** CdSys_CaseSensitive ********************************************************************************/
		if(c.getCdSysCaseSensitive() != null ) {

			if(c.getCdSysCaseSensitive().replace("[","").replace("]","").equals("NULL") | c.getCdSysCaseSensitive()==null) {} else {
			codesystem.setCaseSensitive(Boolean.parseBoolean(c.getCdSysCaseSensitive().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CdSys_Cmpsitional ********************************************************************************/
		if(c.getCdSysCmpsitional() != null ) {

			if(c.getCdSysCmpsitional().replace("[","").replace("]","").equals("NULL") | c.getCdSysCmpsitional()==null) {} else {
			codesystem.setCompositional(Boolean.parseBoolean(c.getCdSysCmpsitional().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CdSys_Cncpt_Cd ********************************************************************************/
		if(c.getCdSysCncptCd() != null ) {

			String[] arrayi0 = c.getCdSysCncptCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getConcept().size() < i0+1) { codesystem.addConcept(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getConcept().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CdSys_Cncpt_Dfn ********************************************************************************/
		if(c.getCdSysCncptDfn() != null ) {

			String[] arrayi0 = c.getCdSysCncptDfn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getConcept().size() < i0+1) { codesystem.addConcept(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getConcept().get(i0).setDefinition(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CdSys_Cncpt_Dsgnation_Lnguage ********************************************************************************/
		if(c.getCdSysCncptDsgnationLnguage() != null ) {

			String[] arrayi0 = c.getCdSysCncptDsgnationLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getConcept().size() < i0+1) { codesystem.addConcept(); }
				String[] arrayi1 = c.getCdSysCncptDsgnationLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getConcept().get(i0).getDesignation().size() < i1+1) { codesystem.getConcept().get(i0).addDesignation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getConcept().get(i0).getDesignation().get(i1).setLanguage(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CdSys_Cncpt_Dsgnation_Use_Cd ********************************************************************************/
		if(c.getCdSysCncptDsgnationUseCd() != null ) {

			String[] arrayi0 = c.getCdSysCncptDsgnationUseCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getConcept().size() < i0+1) { codesystem.addConcept(); }
				String[] arrayi1 = c.getCdSysCncptDsgnationUseCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getConcept().get(i0).getDesignation().size() < i1+1) { codesystem.getConcept().get(i0).addDesignation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getConcept().get(i0).getDesignation().get(i1).getUse().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CdSys_Cncpt_Dsgnation_Use_Dsply ********************************************************************************/
		if(c.getCdSysCncptDsgnationUseDsply() != null ) {

			String[] arrayi0 = c.getCdSysCncptDsgnationUseDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getConcept().size() < i0+1) { codesystem.addConcept(); }
				String[] arrayi1 = c.getCdSysCncptDsgnationUseDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getConcept().get(i0).getDesignation().size() < i1+1) { codesystem.getConcept().get(i0).addDesignation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getConcept().get(i0).getDesignation().get(i1).getUse().setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CdSys_Cncpt_Dsgnation_Use_Sys ********************************************************************************/
		if(c.getCdSysCncptDsgnationUseSys() != null ) {

			String[] arrayi0 = c.getCdSysCncptDsgnationUseSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getConcept().size() < i0+1) { codesystem.addConcept(); }
				String[] arrayi1 = c.getCdSysCncptDsgnationUseSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getConcept().get(i0).getDesignation().size() < i1+1) { codesystem.getConcept().get(i0).addDesignation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getConcept().get(i0).getDesignation().get(i1).getUse().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CdSys_Cncpt_Dsgnation_Use_UsrSltd ********************************************************************************/
		if(c.getCdSysCncptDsgnationUseUsrSltd() != null ) {

			String[] arrayi0 = c.getCdSysCncptDsgnationUseUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getConcept().size() < i0+1) { codesystem.addConcept(); }
				String[] arrayi1 = c.getCdSysCncptDsgnationUseUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getConcept().get(i0).getDesignation().size() < i1+1) { codesystem.getConcept().get(i0).addDesignation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getConcept().get(i0).getDesignation().get(i1).getUse().setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CdSys_Cncpt_Dsgnation_Use_Vrsn ********************************************************************************/
		if(c.getCdSysCncptDsgnationUseVrsn() != null ) {

			String[] arrayi0 = c.getCdSysCncptDsgnationUseVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getConcept().size() < i0+1) { codesystem.addConcept(); }
				String[] arrayi1 = c.getCdSysCncptDsgnationUseVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getConcept().get(i0).getDesignation().size() < i1+1) { codesystem.getConcept().get(i0).addDesignation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getConcept().get(i0).getDesignation().get(i1).getUse().setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CdSys_Cncpt_Dsgnation_Vl ********************************************************************************/
		if(c.getCdSysCncptDsgnationVl() != null ) {

			String[] arrayi0 = c.getCdSysCncptDsgnationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getConcept().size() < i0+1) { codesystem.addConcept(); }
				String[] arrayi1 = c.getCdSysCncptDsgnationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getConcept().get(i0).getDesignation().size() < i1+1) { codesystem.getConcept().get(i0).addDesignation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getConcept().get(i0).getDesignation().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CdSys_Cncpt_Dsply ********************************************************************************/
		if(c.getCdSysCncptDsply() != null ) {

			String[] arrayi0 = c.getCdSysCncptDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getConcept().size() < i0+1) { codesystem.addConcept(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getConcept().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CdSys_Cncpt_Prpty_Cd ********************************************************************************/
		if(c.getCdSysCncptPrptyCd() != null ) {

			String[] arrayi0 = c.getCdSysCncptPrptyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getConcept().size() < i0+1) { codesystem.addConcept(); }
				String[] arrayi1 = c.getCdSysCncptPrptyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getConcept().get(i0).getProperty().size() < i1+1) { codesystem.getConcept().get(i0).addProperty(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getConcept().get(i0).getProperty().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CdSys_Cncpt_Prpty_VlBooleanTyp ********************************************************************************/
		if(c.getCdSysCncptPrptyVlBooleanTyp() != null ) {

			String[] arrayi0 = c.getCdSysCncptPrptyVlBooleanTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getConcept().size() < i0+1) { codesystem.addConcept(); }
				String[] arrayi1 = c.getCdSysCncptPrptyVlBooleanTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getConcept().get(i0).getProperty().size() < i1+1) { codesystem.getConcept().get(i0).addProperty(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getConcept().get(i0).getProperty().get(i1).setValue(new org.hl7.fhir.r4.model.BooleanType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CdSys_Cncpt_Prpty_VlCdTyp ********************************************************************************/
		if(c.getCdSysCncptPrptyVlCdTyp() != null ) {

			String[] arrayi0 = c.getCdSysCncptPrptyVlCdTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getConcept().size() < i0+1) { codesystem.addConcept(); }
				String[] arrayi1 = c.getCdSysCncptPrptyVlCdTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getConcept().get(i0).getProperty().size() < i1+1) { codesystem.getConcept().get(i0).addProperty(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getConcept().get(i0).getProperty().get(i1).setValue(new org.hl7.fhir.r4.model.CodeType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CdSys_Cncpt_Prpty_VlCdg_Cd ********************************************************************************/
		if(c.getCdSysCncptPrptyVlCdgCd() != null ) {

			String[] arrayi0 = c.getCdSysCncptPrptyVlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getConcept().size() < i0+1) { codesystem.addConcept(); }
				String[] arrayi1 = c.getCdSysCncptPrptyVlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getConcept().get(i0).getProperty().size() < i1+1) { codesystem.getConcept().get(i0).addProperty(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getConcept().get(i0).getProperty().get(i1).getValueCoding().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CdSys_Cncpt_Prpty_VlCdg_Dsply ********************************************************************************/
		if(c.getCdSysCncptPrptyVlCdgDsply() != null ) {

			String[] arrayi0 = c.getCdSysCncptPrptyVlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getConcept().size() < i0+1) { codesystem.addConcept(); }
				String[] arrayi1 = c.getCdSysCncptPrptyVlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getConcept().get(i0).getProperty().size() < i1+1) { codesystem.getConcept().get(i0).addProperty(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getConcept().get(i0).getProperty().get(i1).getValueCoding().setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CdSys_Cncpt_Prpty_VlCdg_Sys ********************************************************************************/
		if(c.getCdSysCncptPrptyVlCdgSys() != null ) {

			String[] arrayi0 = c.getCdSysCncptPrptyVlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getConcept().size() < i0+1) { codesystem.addConcept(); }
				String[] arrayi1 = c.getCdSysCncptPrptyVlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getConcept().get(i0).getProperty().size() < i1+1) { codesystem.getConcept().get(i0).addProperty(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getConcept().get(i0).getProperty().get(i1).getValueCoding().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CdSys_Cncpt_Prpty_VlCdg_UsrSltd ********************************************************************************/
		if(c.getCdSysCncptPrptyVlCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCdSysCncptPrptyVlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getConcept().size() < i0+1) { codesystem.addConcept(); }
				String[] arrayi1 = c.getCdSysCncptPrptyVlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getConcept().get(i0).getProperty().size() < i1+1) { codesystem.getConcept().get(i0).addProperty(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getConcept().get(i0).getProperty().get(i1).getValueCoding().setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CdSys_Cncpt_Prpty_VlCdg_Vrsn ********************************************************************************/
		if(c.getCdSysCncptPrptyVlCdgVrsn() != null ) {

			String[] arrayi0 = c.getCdSysCncptPrptyVlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getConcept().size() < i0+1) { codesystem.addConcept(); }
				String[] arrayi1 = c.getCdSysCncptPrptyVlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getConcept().get(i0).getProperty().size() < i1+1) { codesystem.getConcept().get(i0).addProperty(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getConcept().get(i0).getProperty().get(i1).getValueCoding().setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CdSys_Cncpt_Prpty_VlDtTimeTyp ********************************************************************************/
		if(c.getCdSysCncptPrptyVlDtTimeTyp() != null ) {

			String[] arrayi0 = c.getCdSysCncptPrptyVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getConcept().size() < i0+1) { codesystem.addConcept(); }
				String[] arrayi1 = c.getCdSysCncptPrptyVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getConcept().get(i0).getProperty().size() < i1+1) { codesystem.getConcept().get(i0).addProperty(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getConcept().get(i0).getProperty().get(i1).setValue(new org.hl7.fhir.r4.model.DateTimeType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CdSys_Cncpt_Prpty_VlDecimalTyp ********************************************************************************/
		if(c.getCdSysCncptPrptyVlDecimalTyp() != null ) {

			String[] arrayi0 = c.getCdSysCncptPrptyVlDecimalTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getConcept().size() < i0+1) { codesystem.addConcept(); }
				String[] arrayi1 = c.getCdSysCncptPrptyVlDecimalTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getConcept().get(i0).getProperty().size() < i1+1) { codesystem.getConcept().get(i0).addProperty(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getConcept().get(i0).getProperty().get(i1).setValue(new org.hl7.fhir.r4.model.DecimalType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CdSys_Cncpt_Prpty_VlIntegerTyp ********************************************************************************/
		if(c.getCdSysCncptPrptyVlIntegerTyp() != null ) {

			String[] arrayi0 = c.getCdSysCncptPrptyVlIntegerTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getConcept().size() < i0+1) { codesystem.addConcept(); }
				String[] arrayi1 = c.getCdSysCncptPrptyVlIntegerTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getConcept().get(i0).getProperty().size() < i1+1) { codesystem.getConcept().get(i0).addProperty(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getConcept().get(i0).getProperty().get(i1).setValue(new org.hl7.fhir.r4.model.IntegerType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CdSys_Cncpt_Prpty_VlStrgTyp ********************************************************************************/
		if(c.getCdSysCncptPrptyVlStrgTyp() != null ) {

			String[] arrayi0 = c.getCdSysCncptPrptyVlStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getConcept().size() < i0+1) { codesystem.addConcept(); }
				String[] arrayi1 = c.getCdSysCncptPrptyVlStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getConcept().get(i0).getProperty().size() < i1+1) { codesystem.getConcept().get(i0).addProperty(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getConcept().get(i0).getProperty().get(i1).setValue(new org.hl7.fhir.r4.model.StringType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CdSys_Cntct_Nm ********************************************************************************/
		if(c.getCdSysCntctNm() != null ) {

			String[] arrayi0 = c.getCdSysCntctNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getContact().size() < i0+1) { codesystem.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getContact().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CdSys_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(c.getCdSysCntctTlcmPrdEnd() != null ) {

			String[] arrayi0 = c.getCdSysCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getContact().size() < i0+1) { codesystem.addContact(); }
				String[] arrayi1 = c.getCdSysCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getContact().get(i0).getTelecom().size() < i1+1) { codesystem.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getContact().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CdSys_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(c.getCdSysCntctTlcmPrdStrt() != null ) {

			String[] arrayi0 = c.getCdSysCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getContact().size() < i0+1) { codesystem.addContact(); }
				String[] arrayi1 = c.getCdSysCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getContact().get(i0).getTelecom().size() < i1+1) { codesystem.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getContact().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CdSys_Cntct_Tlcm_Rnk ********************************************************************************/
		if(c.getCdSysCntctTlcmRnk() != null ) {

			String[] arrayi0 = c.getCdSysCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getContact().size() < i0+1) { codesystem.addContact(); }
				String[] arrayi1 = c.getCdSysCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getContact().get(i0).getTelecom().size() < i1+1) { codesystem.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getContact().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CdSys_Cntct_Tlcm_Sys ********************************************************************************/
		if(c.getCdSysCntctTlcmSys() != null ) {

			String[] arrayi0 = c.getCdSysCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getContact().size() < i0+1) { codesystem.addContact(); }
				String[] arrayi1 = c.getCdSysCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getContact().get(i0).getTelecom().size() < i1+1) { codesystem.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getContact().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CdSys_Cntct_Tlcm_Use ********************************************************************************/
		if(c.getCdSysCntctTlcmUse() != null ) {

			String[] arrayi0 = c.getCdSysCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getContact().size() < i0+1) { codesystem.addContact(); }
				String[] arrayi1 = c.getCdSysCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getContact().get(i0).getTelecom().size() < i1+1) { codesystem.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getContact().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CdSys_Cntct_Tlcm_Vl ********************************************************************************/
		if(c.getCdSysCntctTlcmVl() != null ) {

			String[] arrayi0 = c.getCdSysCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getContact().size() < i0+1) { codesystem.addContact(); }
				String[] arrayi1 = c.getCdSysCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getContact().get(i0).getTelecom().size() < i1+1) { codesystem.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getContact().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CdSys_Cntnt ********************************************************************************/
		if(c.getCdSysCntnt() != null ) {

			if(c.getCdSysCntnt().replace("[","").replace("]","").equals("NULL") | c.getCdSysCntnt()==null) {} else {
			codesystem.setContent(new org.hl7.fhir.r4.model.CodeSystem.CodeSystemContentModeEnumFactory().fromCode(c.getCdSysCntnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CdSys_Copyright ********************************************************************************/
		if(c.getCdSysCopyright() != null ) {

			if(c.getCdSysCopyright().replace("[","").replace("]","").equals("NULL") | c.getCdSysCopyright()==null) {} else {
			codesystem.setCopyright(c.getCdSysCopyright().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CdSys_Cnt ********************************************************************************/
		if(c.getCdSysCnt() != null ) {

			if(c.getCdSysCnt().replace("[","").replace("]","").equals("NULL") | c.getCdSysCnt()==null) {} else {
			codesystem.setCount(Integer.parseInt(c.getCdSysCnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CdSys_Dt ********************************************************************************/
		if(c.getCdSysDt() != null ) {

			if(c.getCdSysDt().replace("[","").replace("]","").equals("NULL") | c.getCdSysDt()==null) {} else {
			codesystem.setDate(c.getCdSysDt().replace("[","").replace("]","").equals("NULL") | c.getCdSysDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCdSysDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CdSys_Dscrptn ********************************************************************************/
		if(c.getCdSysDscrptn() != null ) {

			if(c.getCdSysDscrptn().replace("[","").replace("]","").equals("NULL") | c.getCdSysDscrptn()==null) {} else {
			codesystem.setDescription(c.getCdSysDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CdSys_Exprmtl ********************************************************************************/
		if(c.getCdSysExprmtl() != null ) {

			if(c.getCdSysExprmtl().replace("[","").replace("]","").equals("NULL") | c.getCdSysExprmtl()==null) {} else {
			codesystem.setExperimental(Boolean.parseBoolean(c.getCdSysExprmtl().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CdSys_Fltr_Cd ********************************************************************************/
		if(c.getCdSysFltrCd() != null ) {

			String[] arrayi0 = c.getCdSysFltrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getFilter().size() < i0+1) { codesystem.addFilter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getFilter().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CdSys_Fltr_Dscrptn ********************************************************************************/
		if(c.getCdSysFltrDscrptn() != null ) {

			String[] arrayi0 = c.getCdSysFltrDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getFilter().size() < i0+1) { codesystem.addFilter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getFilter().get(i0).setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CdSys_Fltr_Vl ********************************************************************************/
		if(c.getCdSysFltrVl() != null ) {

			String[] arrayi0 = c.getCdSysFltrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getFilter().size() < i0+1) { codesystem.addFilter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getFilter().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CdSys_HierarchyMeaning ********************************************************************************/
		if(c.getCdSysHierarchyMeaning() != null ) {

			if(c.getCdSysHierarchyMeaning().replace("[","").replace("]","").equals("NULL") | c.getCdSysHierarchyMeaning()==null) {} else {
			codesystem.setHierarchyMeaning(new org.hl7.fhir.r4.model.CodeSystem.CodeSystemHierarchyMeaningEnumFactory().fromCode(c.getCdSysHierarchyMeaning().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CdSys_Id_Assigner ********************************************************************************/
		if(c.getCdSysIdAssigner() != null ) {

			String[] arrayi0 = c.getCdSysIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getIdentifier().size() < i0+1) { codesystem.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CdSys_Id_Prd_End ********************************************************************************/
		if(c.getCdSysIdPrdEnd() != null ) {

			String[] arrayi0 = c.getCdSysIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getIdentifier().size() < i0+1) { codesystem.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CdSys_Id_Prd_Strt ********************************************************************************/
		if(c.getCdSysIdPrdStrt() != null ) {

			String[] arrayi0 = c.getCdSysIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getIdentifier().size() < i0+1) { codesystem.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CdSys_Id_Sys ********************************************************************************/
		if(c.getCdSysIdSys() != null ) {

			String[] arrayi0 = c.getCdSysIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getIdentifier().size() < i0+1) { codesystem.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CdSys_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCdSysIdTypCdgCd() != null ) {

			String[] arrayi0 = c.getCdSysIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getIdentifier().size() < i0+1) { codesystem.addIdentifier(); }
				String[] arrayi1 = c.getCdSysIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { codesystem.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CdSys_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCdSysIdTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCdSysIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getIdentifier().size() < i0+1) { codesystem.addIdentifier(); }
				String[] arrayi1 = c.getCdSysIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { codesystem.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CdSys_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCdSysIdTypCdgSys() != null ) {

			String[] arrayi0 = c.getCdSysIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getIdentifier().size() < i0+1) { codesystem.addIdentifier(); }
				String[] arrayi1 = c.getCdSysIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { codesystem.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CdSys_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCdSysIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCdSysIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getIdentifier().size() < i0+1) { codesystem.addIdentifier(); }
				String[] arrayi1 = c.getCdSysIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { codesystem.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CdSys_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCdSysIdTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCdSysIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getIdentifier().size() < i0+1) { codesystem.addIdentifier(); }
				String[] arrayi1 = c.getCdSysIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { codesystem.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CdSys_Id_Typ_Txt ********************************************************************************/
		if(c.getCdSysIdTypTxt() != null ) {

			String[] arrayi0 = c.getCdSysIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getIdentifier().size() < i0+1) { codesystem.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CdSys_Id_Use ********************************************************************************/
		if(c.getCdSysIdUse() != null ) {

			String[] arrayi0 = c.getCdSysIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getIdentifier().size() < i0+1) { codesystem.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CdSys_Id_Vl ********************************************************************************/
		if(c.getCdSysIdVl() != null ) {

			String[] arrayi0 = c.getCdSysIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getIdentifier().size() < i0+1) { codesystem.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CdSys_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(c.getCdSysJrsdctnCdgCd() != null ) {

			String[] arrayi0 = c.getCdSysJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getJurisdiction().size() < i0+1) { codesystem.addJurisdiction(); }
				String[] arrayi1 = c.getCdSysJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getJurisdiction().get(i0).getCoding().size() < i1+1) { codesystem.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getJurisdiction().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CdSys_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(c.getCdSysJrsdctnCdgDsply() != null ) {

			String[] arrayi0 = c.getCdSysJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getJurisdiction().size() < i0+1) { codesystem.addJurisdiction(); }
				String[] arrayi1 = c.getCdSysJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getJurisdiction().get(i0).getCoding().size() < i1+1) { codesystem.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getJurisdiction().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CdSys_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(c.getCdSysJrsdctnCdgSys() != null ) {

			String[] arrayi0 = c.getCdSysJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getJurisdiction().size() < i0+1) { codesystem.addJurisdiction(); }
				String[] arrayi1 = c.getCdSysJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getJurisdiction().get(i0).getCoding().size() < i1+1) { codesystem.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getJurisdiction().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CdSys_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(c.getCdSysJrsdctnCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCdSysJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getJurisdiction().size() < i0+1) { codesystem.addJurisdiction(); }
				String[] arrayi1 = c.getCdSysJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getJurisdiction().get(i0).getCoding().size() < i1+1) { codesystem.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getJurisdiction().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CdSys_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(c.getCdSysJrsdctnCdgVrsn() != null ) {

			String[] arrayi0 = c.getCdSysJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getJurisdiction().size() < i0+1) { codesystem.addJurisdiction(); }
				String[] arrayi1 = c.getCdSysJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getJurisdiction().get(i0).getCoding().size() < i1+1) { codesystem.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getJurisdiction().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CdSys_Jrsdctn_Txt ********************************************************************************/
		if(c.getCdSysJrsdctnTxt() != null ) {

			String[] arrayi0 = c.getCdSysJrsdctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getJurisdiction().size() < i0+1) { codesystem.addJurisdiction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getJurisdiction().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CdSys_Nm ********************************************************************************/
		if(c.getCdSysNm() != null ) {

			if(c.getCdSysNm().replace("[","").replace("]","").equals("NULL") | c.getCdSysNm()==null) {} else {
			codesystem.setName(c.getCdSysNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CdSys_Prpty_Cd ********************************************************************************/
		if(c.getCdSysPrptyCd() != null ) {

			String[] arrayi0 = c.getCdSysPrptyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getProperty().size() < i0+1) { codesystem.addProperty(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getProperty().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CdSys_Prpty_Dscrptn ********************************************************************************/
		if(c.getCdSysPrptyDscrptn() != null ) {

			String[] arrayi0 = c.getCdSysPrptyDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getProperty().size() < i0+1) { codesystem.addProperty(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getProperty().get(i0).setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CdSys_Prpty_Typ ********************************************************************************/
		if(c.getCdSysPrptyTyp() != null ) {

			String[] arrayi0 = c.getCdSysPrptyTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getProperty().size() < i0+1) { codesystem.addProperty(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getProperty().get(i0).setType(new org.hl7.fhir.r4.model.CodeSystem.PropertyTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CdSys_Prpty_Uri ********************************************************************************/
		if(c.getCdSysPrptyUri() != null ) {

			String[] arrayi0 = c.getCdSysPrptyUri().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getProperty().size() < i0+1) { codesystem.addProperty(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getProperty().get(i0).setUri(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CdSys_Pblshr ********************************************************************************/
		if(c.getCdSysPblshr() != null ) {

			if(c.getCdSysPblshr().replace("[","").replace("]","").equals("NULL") | c.getCdSysPblshr()==null) {} else {
			codesystem.setPublisher(c.getCdSysPblshr().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CdSys_Prpse ********************************************************************************/
		if(c.getCdSysPrpse() != null ) {

			if(c.getCdSysPrpse().replace("[","").replace("]","").equals("NULL") | c.getCdSysPrpse()==null) {} else {
			codesystem.setPurpose(c.getCdSysPrpse().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CdSys_Sts ********************************************************************************/
		if(c.getCdSysSts() != null ) {

			if(c.getCdSysSts().replace("[","").replace("]","").equals("NULL") | c.getCdSysSts()==null) {} else {
			codesystem.setStatus(new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory().fromCode(c.getCdSysSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CdSys_Supplements ********************************************************************************/
		if(c.getCdSysSupplements() != null ) {

			if(c.getCdSysSupplements().replace("[","").replace("]","").equals("NULL") | c.getCdSysSupplements()==null) {} else {
			codesystem.setSupplements(c.getCdSysSupplements().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CdSys_Ttl ********************************************************************************/
		if(c.getCdSysTtl() != null ) {

			if(c.getCdSysTtl().replace("[","").replace("]","").equals("NULL") | c.getCdSysTtl()==null) {} else {
			codesystem.setTitle(c.getCdSysTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CdSys_Url ********************************************************************************/
		if(c.getCdSysUrl() != null ) {

			if(c.getCdSysUrl().replace("[","").replace("]","").equals("NULL") | c.getCdSysUrl()==null) {} else {
			codesystem.setUrl(c.getCdSysUrl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CdSys_UseCntxt_Cd_Cd ********************************************************************************/
		if(c.getCdSysUseCntxtCdCd() != null ) {

			String[] arrayi0 = c.getCdSysUseCntxtCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getUseContext().size() < i0+1) { codesystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getUseContext().get(i0).getCode().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CdSys_UseCntxt_Cd_Dsply ********************************************************************************/
		if(c.getCdSysUseCntxtCdDsply() != null ) {

			String[] arrayi0 = c.getCdSysUseCntxtCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getUseContext().size() < i0+1) { codesystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getUseContext().get(i0).getCode().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CdSys_UseCntxt_Cd_Sys ********************************************************************************/
		if(c.getCdSysUseCntxtCdSys() != null ) {

			String[] arrayi0 = c.getCdSysUseCntxtCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getUseContext().size() < i0+1) { codesystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getUseContext().get(i0).getCode().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CdSys_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(c.getCdSysUseCntxtCdUsrSltd() != null ) {

			String[] arrayi0 = c.getCdSysUseCntxtCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getUseContext().size() < i0+1) { codesystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getUseContext().get(i0).getCode().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CdSys_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(c.getCdSysUseCntxtCdVrsn() != null ) {

			String[] arrayi0 = c.getCdSysUseCntxtCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getUseContext().size() < i0+1) { codesystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getUseContext().get(i0).getCode().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CdSys_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(c.getCdSysUseCntxtVlCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = c.getCdSysUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getUseContext().size() < i0+1) { codesystem.addUseContext(); }
				String[] arrayi1 = c.getCdSysUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { codesystem.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CdSys_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(c.getCdSysUseCntxtVlCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = c.getCdSysUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getUseContext().size() < i0+1) { codesystem.addUseContext(); }
				String[] arrayi1 = c.getCdSysUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { codesystem.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CdSys_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(c.getCdSysUseCntxtVlCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = c.getCdSysUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getUseContext().size() < i0+1) { codesystem.addUseContext(); }
				String[] arrayi1 = c.getCdSysUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { codesystem.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CdSys_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(c.getCdSysUseCntxtVlCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCdSysUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getUseContext().size() < i0+1) { codesystem.addUseContext(); }
				String[] arrayi1 = c.getCdSysUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { codesystem.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CdSys_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(c.getCdSysUseCntxtVlCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = c.getCdSysUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getUseContext().size() < i0+1) { codesystem.addUseContext(); }
				String[] arrayi1 = c.getCdSysUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(codesystem.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { codesystem.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {codesystem.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CdSys_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(c.getCdSysUseCntxtVlCdbleCncptTxt() != null ) {

			String[] arrayi0 = c.getCdSysUseCntxtVlCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getUseContext().size() < i0+1) { codesystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getUseContext().get(i0).getValueCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CdSys_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(c.getCdSysUseCntxtVlQntyCd() != null ) {

			String[] arrayi0 = c.getCdSysUseCntxtVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getUseContext().size() < i0+1) { codesystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getUseContext().get(i0).getValueQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CdSys_UseCntxt_VlQnty_Cmprtr ********************************************************************************/
		if(c.getCdSysUseCntxtVlQntyCmprtr() != null ) {

			String[] arrayi0 = c.getCdSysUseCntxtVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getUseContext().size() < i0+1) { codesystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getUseContext().get(i0).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CdSys_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(c.getCdSysUseCntxtVlQntySys() != null ) {

			String[] arrayi0 = c.getCdSysUseCntxtVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getUseContext().size() < i0+1) { codesystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getUseContext().get(i0).getValueQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CdSys_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(c.getCdSysUseCntxtVlQntyUnt() != null ) {

			String[] arrayi0 = c.getCdSysUseCntxtVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getUseContext().size() < i0+1) { codesystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getUseContext().get(i0).getValueQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CdSys_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(c.getCdSysUseCntxtVlQntyVl() != null ) {

			String[] arrayi0 = c.getCdSysUseCntxtVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getUseContext().size() < i0+1) { codesystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getUseContext().get(i0).getValueQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** CdSys_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(c.getCdSysUseCntxtVlRngHiCd() != null ) {

			String[] arrayi0 = c.getCdSysUseCntxtVlRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getUseContext().size() < i0+1) { codesystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getUseContext().get(i0).getValueRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CdSys_UseCntxt_VlRng_Hi_Cmprtr ********************************************************************************/
		if(c.getCdSysUseCntxtVlRngHiCmprtr() != null ) {

			String[] arrayi0 = c.getCdSysUseCntxtVlRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getUseContext().size() < i0+1) { codesystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getUseContext().get(i0).getValueRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CdSys_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(c.getCdSysUseCntxtVlRngHiSys() != null ) {

			String[] arrayi0 = c.getCdSysUseCntxtVlRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getUseContext().size() < i0+1) { codesystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getUseContext().get(i0).getValueRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CdSys_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(c.getCdSysUseCntxtVlRngHiUnt() != null ) {

			String[] arrayi0 = c.getCdSysUseCntxtVlRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getUseContext().size() < i0+1) { codesystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getUseContext().get(i0).getValueRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CdSys_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(c.getCdSysUseCntxtVlRngHiVl() != null ) {

			String[] arrayi0 = c.getCdSysUseCntxtVlRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getUseContext().size() < i0+1) { codesystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getUseContext().get(i0).getValueRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** CdSys_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(c.getCdSysUseCntxtVlRngLwCd() != null ) {

			String[] arrayi0 = c.getCdSysUseCntxtVlRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getUseContext().size() < i0+1) { codesystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getUseContext().get(i0).getValueRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CdSys_UseCntxt_VlRng_Lw_Cmprtr ********************************************************************************/
		if(c.getCdSysUseCntxtVlRngLwCmprtr() != null ) {

			String[] arrayi0 = c.getCdSysUseCntxtVlRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getUseContext().size() < i0+1) { codesystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getUseContext().get(i0).getValueRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CdSys_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(c.getCdSysUseCntxtVlRngLwSys() != null ) {

			String[] arrayi0 = c.getCdSysUseCntxtVlRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getUseContext().size() < i0+1) { codesystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getUseContext().get(i0).getValueRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CdSys_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(c.getCdSysUseCntxtVlRngLwUnt() != null ) {

			String[] arrayi0 = c.getCdSysUseCntxtVlRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getUseContext().size() < i0+1) { codesystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getUseContext().get(i0).getValueRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CdSys_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(c.getCdSysUseCntxtVlRngLwVl() != null ) {

			String[] arrayi0 = c.getCdSysUseCntxtVlRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getUseContext().size() < i0+1) { codesystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getUseContext().get(i0).getValueRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** CdSys_UseCntxt_VlRfrnc ********************************************************************************/
		if(c.getCdSysUseCntxtVlRfrnc() != null ) {

			String[] arrayi0 = c.getCdSysUseCntxtVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(codesystem.getUseContext().size() < i0+1) { codesystem.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {codesystem.getUseContext().get(i0).setValue(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CdSys_VlSt ********************************************************************************/
		if(c.getCdSysVlSt() != null ) {

			if(c.getCdSysVlSt().replace("[","").replace("]","").equals("NULL") | c.getCdSysVlSt()==null) {} else {
			codesystem.setValueSet(c.getCdSysVlSt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CdSys_Vrsn ********************************************************************************/
		if(c.getCdSysVrsn() != null ) {

			if(c.getCdSysVrsn().replace("[","").replace("]","").equals("NULL") | c.getCdSysVrsn()==null) {} else {
			codesystem.setVersion(c.getCdSysVrsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CdSys_VrsnNeeded ********************************************************************************/
		if(c.getCdSysVrsnNeeded() != null ) {

			if(c.getCdSysVrsnNeeded().replace("[","").replace("]","").equals("NULL") | c.getCdSysVrsnNeeded()==null) {} else {
			codesystem.setVersionNeeded(Boolean.parseBoolean(c.getCdSysVrsnNeeded().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return codesystem;
	}
}
