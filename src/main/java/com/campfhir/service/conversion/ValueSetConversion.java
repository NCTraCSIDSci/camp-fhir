package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ValueSet;
public class ValueSetConversion 
{
	public org.hl7.fhir.r4.model.ValueSet ValueSets(ValueSet v) throws ParseException
	{
		org.hl7.fhir.r4.model.ValueSet valueset = new org.hl7.fhir.r4.model.ValueSet();

		/******************** id ********************************************************************************/
		valueset.setId(v.getId());

		/******************** VlSt_Compose_Exclude_Cncpt_Cd ********************************************************************************/
		if(v.getVlStComposeExcludeCncptCd() != null ) {

			String[] arrayi0 = v.getVlStComposeExcludeCncptCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getCompose().getExclude().size() < i0+1) { valueset.getCompose().addExclude(); }
				String[] arrayi1 = v.getVlStComposeExcludeCncptCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getCompose().getExclude().get(i0).getConcept().size() < i1+1) { valueset.getCompose().getExclude().get(i0).addConcept(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getCompose().getExclude().get(i0).getConcept().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VlSt_Compose_Exclude_Cncpt_Dsgnation_Lnguage ********************************************************************************/
		if(v.getVlStComposeExcludeCncptDsgnationLnguage() != null ) {

			String[] arrayi0 = v.getVlStComposeExcludeCncptDsgnationLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getCompose().getExclude().size() < i0+1) { valueset.getCompose().addExclude(); }
				String[] arrayi1 = v.getVlStComposeExcludeCncptDsgnationLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getCompose().getExclude().get(i0).getConcept().size() < i1+1) { valueset.getCompose().getExclude().get(i0).addConcept(); }
					String[] arrayi2 = v.getVlStComposeExcludeCncptDsgnationLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(valueset.getCompose().getExclude().get(i0).getConcept().get(i1).getDesignation().size() < i2+1) { valueset.getCompose().getExclude().get(i0).getConcept().get(i1).addDesignation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {valueset.getCompose().getExclude().get(i0).getConcept().get(i1).getDesignation().get(i2).setLanguage(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** VlSt_Compose_Exclude_Cncpt_Dsgnation_Use_Cd ********************************************************************************/
		if(v.getVlStComposeExcludeCncptDsgnationUseCd() != null ) {

			String[] arrayi0 = v.getVlStComposeExcludeCncptDsgnationUseCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getCompose().getExclude().size() < i0+1) { valueset.getCompose().addExclude(); }
				String[] arrayi1 = v.getVlStComposeExcludeCncptDsgnationUseCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getCompose().getExclude().get(i0).getConcept().size() < i1+1) { valueset.getCompose().getExclude().get(i0).addConcept(); }
					String[] arrayi2 = v.getVlStComposeExcludeCncptDsgnationUseCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(valueset.getCompose().getExclude().get(i0).getConcept().get(i1).getDesignation().size() < i2+1) { valueset.getCompose().getExclude().get(i0).getConcept().get(i1).addDesignation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {valueset.getCompose().getExclude().get(i0).getConcept().get(i1).getDesignation().get(i2).getUse().setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** VlSt_Compose_Exclude_Cncpt_Dsgnation_Use_Dsply ********************************************************************************/
		if(v.getVlStComposeExcludeCncptDsgnationUseDsply() != null ) {

			String[] arrayi0 = v.getVlStComposeExcludeCncptDsgnationUseDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getCompose().getExclude().size() < i0+1) { valueset.getCompose().addExclude(); }
				String[] arrayi1 = v.getVlStComposeExcludeCncptDsgnationUseDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getCompose().getExclude().get(i0).getConcept().size() < i1+1) { valueset.getCompose().getExclude().get(i0).addConcept(); }
					String[] arrayi2 = v.getVlStComposeExcludeCncptDsgnationUseDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(valueset.getCompose().getExclude().get(i0).getConcept().get(i1).getDesignation().size() < i2+1) { valueset.getCompose().getExclude().get(i0).getConcept().get(i1).addDesignation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {valueset.getCompose().getExclude().get(i0).getConcept().get(i1).getDesignation().get(i2).getUse().setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** VlSt_Compose_Exclude_Cncpt_Dsgnation_Use_Sys ********************************************************************************/
		if(v.getVlStComposeExcludeCncptDsgnationUseSys() != null ) {

			String[] arrayi0 = v.getVlStComposeExcludeCncptDsgnationUseSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getCompose().getExclude().size() < i0+1) { valueset.getCompose().addExclude(); }
				String[] arrayi1 = v.getVlStComposeExcludeCncptDsgnationUseSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getCompose().getExclude().get(i0).getConcept().size() < i1+1) { valueset.getCompose().getExclude().get(i0).addConcept(); }
					String[] arrayi2 = v.getVlStComposeExcludeCncptDsgnationUseSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(valueset.getCompose().getExclude().get(i0).getConcept().get(i1).getDesignation().size() < i2+1) { valueset.getCompose().getExclude().get(i0).getConcept().get(i1).addDesignation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {valueset.getCompose().getExclude().get(i0).getConcept().get(i1).getDesignation().get(i2).getUse().setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** VlSt_Compose_Exclude_Cncpt_Dsgnation_Use_UsrSltd ********************************************************************************/
		if(v.getVlStComposeExcludeCncptDsgnationUseUsrSltd() != null ) {

			String[] arrayi0 = v.getVlStComposeExcludeCncptDsgnationUseUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getCompose().getExclude().size() < i0+1) { valueset.getCompose().addExclude(); }
				String[] arrayi1 = v.getVlStComposeExcludeCncptDsgnationUseUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getCompose().getExclude().get(i0).getConcept().size() < i1+1) { valueset.getCompose().getExclude().get(i0).addConcept(); }
					String[] arrayi2 = v.getVlStComposeExcludeCncptDsgnationUseUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(valueset.getCompose().getExclude().get(i0).getConcept().get(i1).getDesignation().size() < i2+1) { valueset.getCompose().getExclude().get(i0).getConcept().get(i1).addDesignation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {valueset.getCompose().getExclude().get(i0).getConcept().get(i1).getDesignation().get(i2).getUse().setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** VlSt_Compose_Exclude_Cncpt_Dsgnation_Use_Vrsn ********************************************************************************/
		if(v.getVlStComposeExcludeCncptDsgnationUseVrsn() != null ) {

			String[] arrayi0 = v.getVlStComposeExcludeCncptDsgnationUseVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getCompose().getExclude().size() < i0+1) { valueset.getCompose().addExclude(); }
				String[] arrayi1 = v.getVlStComposeExcludeCncptDsgnationUseVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getCompose().getExclude().get(i0).getConcept().size() < i1+1) { valueset.getCompose().getExclude().get(i0).addConcept(); }
					String[] arrayi2 = v.getVlStComposeExcludeCncptDsgnationUseVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(valueset.getCompose().getExclude().get(i0).getConcept().get(i1).getDesignation().size() < i2+1) { valueset.getCompose().getExclude().get(i0).getConcept().get(i1).addDesignation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {valueset.getCompose().getExclude().get(i0).getConcept().get(i1).getDesignation().get(i2).getUse().setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** VlSt_Compose_Exclude_Cncpt_Dsgnation_Vl ********************************************************************************/
		if(v.getVlStComposeExcludeCncptDsgnationVl() != null ) {

			String[] arrayi0 = v.getVlStComposeExcludeCncptDsgnationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getCompose().getExclude().size() < i0+1) { valueset.getCompose().addExclude(); }
				String[] arrayi1 = v.getVlStComposeExcludeCncptDsgnationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getCompose().getExclude().get(i0).getConcept().size() < i1+1) { valueset.getCompose().getExclude().get(i0).addConcept(); }
					String[] arrayi2 = v.getVlStComposeExcludeCncptDsgnationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(valueset.getCompose().getExclude().get(i0).getConcept().get(i1).getDesignation().size() < i2+1) { valueset.getCompose().getExclude().get(i0).getConcept().get(i1).addDesignation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {valueset.getCompose().getExclude().get(i0).getConcept().get(i1).getDesignation().get(i2).setValue(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** VlSt_Compose_Exclude_Cncpt_Dsply ********************************************************************************/
		if(v.getVlStComposeExcludeCncptDsply() != null ) {

			String[] arrayi0 = v.getVlStComposeExcludeCncptDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getCompose().getExclude().size() < i0+1) { valueset.getCompose().addExclude(); }
				String[] arrayi1 = v.getVlStComposeExcludeCncptDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getCompose().getExclude().get(i0).getConcept().size() < i1+1) { valueset.getCompose().getExclude().get(i0).addConcept(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getCompose().getExclude().get(i0).getConcept().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VlSt_Compose_Exclude_Fltr_Op ********************************************************************************/
		if(v.getVlStComposeExcludeFltrOp() != null ) {

			String[] arrayi0 = v.getVlStComposeExcludeFltrOp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getCompose().getExclude().size() < i0+1) { valueset.getCompose().addExclude(); }
				String[] arrayi1 = v.getVlStComposeExcludeFltrOp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getCompose().getExclude().get(i0).getFilter().size() < i1+1) { valueset.getCompose().getExclude().get(i0).addFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getCompose().getExclude().get(i0).getFilter().get(i1).setOp(new org.hl7.fhir.r4.model.ValueSet.FilterOperatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** VlSt_Compose_Exclude_Fltr_Prpty ********************************************************************************/
		if(v.getVlStComposeExcludeFltrPrpty() != null ) {

			String[] arrayi0 = v.getVlStComposeExcludeFltrPrpty().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getCompose().getExclude().size() < i0+1) { valueset.getCompose().addExclude(); }
				String[] arrayi1 = v.getVlStComposeExcludeFltrPrpty().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getCompose().getExclude().get(i0).getFilter().size() < i1+1) { valueset.getCompose().getExclude().get(i0).addFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getCompose().getExclude().get(i0).getFilter().get(i1).setProperty(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VlSt_Compose_Exclude_Fltr_Vl ********************************************************************************/
		if(v.getVlStComposeExcludeFltrVl() != null ) {

			String[] arrayi0 = v.getVlStComposeExcludeFltrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getCompose().getExclude().size() < i0+1) { valueset.getCompose().addExclude(); }
				String[] arrayi1 = v.getVlStComposeExcludeFltrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getCompose().getExclude().get(i0).getFilter().size() < i1+1) { valueset.getCompose().getExclude().get(i0).addFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getCompose().getExclude().get(i0).getFilter().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VlSt_Compose_Exclude_Sys ********************************************************************************/
		if(v.getVlStComposeExcludeSys() != null ) {

			String[] arrayi0 = v.getVlStComposeExcludeSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getCompose().getExclude().size() < i0+1) { valueset.getCompose().addExclude(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getCompose().getExclude().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VlSt_Compose_Exclude_VlSt ********************************************************************************/
		if(v.getVlStComposeExcludeVlSt() != null ) {

			String[] arrayi0 = v.getVlStComposeExcludeVlSt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getCompose().getExclude().size() < i0+1) { valueset.getCompose().addExclude(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {valueset.getCompose().getExclude().get(i0).addValueSet(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VlSt_Compose_Exclude_Vrsn ********************************************************************************/
		if(v.getVlStComposeExcludeVrsn() != null ) {

			String[] arrayi0 = v.getVlStComposeExcludeVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getCompose().getExclude().size() < i0+1) { valueset.getCompose().addExclude(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getCompose().getExclude().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VlSt_Compose_Inactive ********************************************************************************/
		if(v.getVlStComposeInactive() != null ) {

			if(v.getVlStComposeInactive().replace("[","").replace("]","").equals("NULL") | v.getVlStComposeInactive()==null) {} else {
			valueset.getCompose().setInactive(Boolean.parseBoolean(v.getVlStComposeInactive().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VlSt_Compose_Include_Cncpt_Cd ********************************************************************************/
		if(v.getVlStComposeIncludeCncptCd() != null ) {

			String[] arrayi0 = v.getVlStComposeIncludeCncptCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getCompose().getInclude().size() < i0+1) { valueset.getCompose().addInclude(); }
				String[] arrayi1 = v.getVlStComposeIncludeCncptCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getCompose().getInclude().get(i0).getConcept().size() < i1+1) { valueset.getCompose().getInclude().get(i0).addConcept(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getCompose().getInclude().get(i0).getConcept().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VlSt_Compose_Include_Cncpt_Dsgnation_Lnguage ********************************************************************************/
		if(v.getVlStComposeIncludeCncptDsgnationLnguage() != null ) {

			String[] arrayi0 = v.getVlStComposeIncludeCncptDsgnationLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getCompose().getInclude().size() < i0+1) { valueset.getCompose().addInclude(); }
				String[] arrayi1 = v.getVlStComposeIncludeCncptDsgnationLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getCompose().getInclude().get(i0).getConcept().size() < i1+1) { valueset.getCompose().getInclude().get(i0).addConcept(); }
					String[] arrayi2 = v.getVlStComposeIncludeCncptDsgnationLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(valueset.getCompose().getInclude().get(i0).getConcept().get(i1).getDesignation().size() < i2+1) { valueset.getCompose().getInclude().get(i0).getConcept().get(i1).addDesignation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {valueset.getCompose().getInclude().get(i0).getConcept().get(i1).getDesignation().get(i2).setLanguage(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** VlSt_Compose_Include_Cncpt_Dsgnation_Use_Cd ********************************************************************************/
		if(v.getVlStComposeIncludeCncptDsgnationUseCd() != null ) {

			String[] arrayi0 = v.getVlStComposeIncludeCncptDsgnationUseCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getCompose().getInclude().size() < i0+1) { valueset.getCompose().addInclude(); }
				String[] arrayi1 = v.getVlStComposeIncludeCncptDsgnationUseCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getCompose().getInclude().get(i0).getConcept().size() < i1+1) { valueset.getCompose().getInclude().get(i0).addConcept(); }
					String[] arrayi2 = v.getVlStComposeIncludeCncptDsgnationUseCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(valueset.getCompose().getInclude().get(i0).getConcept().get(i1).getDesignation().size() < i2+1) { valueset.getCompose().getInclude().get(i0).getConcept().get(i1).addDesignation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {valueset.getCompose().getInclude().get(i0).getConcept().get(i1).getDesignation().get(i2).getUse().setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** VlSt_Compose_Include_Cncpt_Dsgnation_Use_Dsply ********************************************************************************/
		if(v.getVlStComposeIncludeCncptDsgnationUseDsply() != null ) {

			String[] arrayi0 = v.getVlStComposeIncludeCncptDsgnationUseDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getCompose().getInclude().size() < i0+1) { valueset.getCompose().addInclude(); }
				String[] arrayi1 = v.getVlStComposeIncludeCncptDsgnationUseDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getCompose().getInclude().get(i0).getConcept().size() < i1+1) { valueset.getCompose().getInclude().get(i0).addConcept(); }
					String[] arrayi2 = v.getVlStComposeIncludeCncptDsgnationUseDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(valueset.getCompose().getInclude().get(i0).getConcept().get(i1).getDesignation().size() < i2+1) { valueset.getCompose().getInclude().get(i0).getConcept().get(i1).addDesignation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {valueset.getCompose().getInclude().get(i0).getConcept().get(i1).getDesignation().get(i2).getUse().setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** VlSt_Compose_Include_Cncpt_Dsgnation_Use_Sys ********************************************************************************/
		if(v.getVlStComposeIncludeCncptDsgnationUseSys() != null ) {

			String[] arrayi0 = v.getVlStComposeIncludeCncptDsgnationUseSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getCompose().getInclude().size() < i0+1) { valueset.getCompose().addInclude(); }
				String[] arrayi1 = v.getVlStComposeIncludeCncptDsgnationUseSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getCompose().getInclude().get(i0).getConcept().size() < i1+1) { valueset.getCompose().getInclude().get(i0).addConcept(); }
					String[] arrayi2 = v.getVlStComposeIncludeCncptDsgnationUseSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(valueset.getCompose().getInclude().get(i0).getConcept().get(i1).getDesignation().size() < i2+1) { valueset.getCompose().getInclude().get(i0).getConcept().get(i1).addDesignation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {valueset.getCompose().getInclude().get(i0).getConcept().get(i1).getDesignation().get(i2).getUse().setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** VlSt_Compose_Include_Cncpt_Dsgnation_Use_UsrSltd ********************************************************************************/
		if(v.getVlStComposeIncludeCncptDsgnationUseUsrSltd() != null ) {

			String[] arrayi0 = v.getVlStComposeIncludeCncptDsgnationUseUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getCompose().getInclude().size() < i0+1) { valueset.getCompose().addInclude(); }
				String[] arrayi1 = v.getVlStComposeIncludeCncptDsgnationUseUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getCompose().getInclude().get(i0).getConcept().size() < i1+1) { valueset.getCompose().getInclude().get(i0).addConcept(); }
					String[] arrayi2 = v.getVlStComposeIncludeCncptDsgnationUseUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(valueset.getCompose().getInclude().get(i0).getConcept().get(i1).getDesignation().size() < i2+1) { valueset.getCompose().getInclude().get(i0).getConcept().get(i1).addDesignation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {valueset.getCompose().getInclude().get(i0).getConcept().get(i1).getDesignation().get(i2).getUse().setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** VlSt_Compose_Include_Cncpt_Dsgnation_Use_Vrsn ********************************************************************************/
		if(v.getVlStComposeIncludeCncptDsgnationUseVrsn() != null ) {

			String[] arrayi0 = v.getVlStComposeIncludeCncptDsgnationUseVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getCompose().getInclude().size() < i0+1) { valueset.getCompose().addInclude(); }
				String[] arrayi1 = v.getVlStComposeIncludeCncptDsgnationUseVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getCompose().getInclude().get(i0).getConcept().size() < i1+1) { valueset.getCompose().getInclude().get(i0).addConcept(); }
					String[] arrayi2 = v.getVlStComposeIncludeCncptDsgnationUseVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(valueset.getCompose().getInclude().get(i0).getConcept().get(i1).getDesignation().size() < i2+1) { valueset.getCompose().getInclude().get(i0).getConcept().get(i1).addDesignation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {valueset.getCompose().getInclude().get(i0).getConcept().get(i1).getDesignation().get(i2).getUse().setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** VlSt_Compose_Include_Cncpt_Dsgnation_Vl ********************************************************************************/
		if(v.getVlStComposeIncludeCncptDsgnationVl() != null ) {

			String[] arrayi0 = v.getVlStComposeIncludeCncptDsgnationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getCompose().getInclude().size() < i0+1) { valueset.getCompose().addInclude(); }
				String[] arrayi1 = v.getVlStComposeIncludeCncptDsgnationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getCompose().getInclude().get(i0).getConcept().size() < i1+1) { valueset.getCompose().getInclude().get(i0).addConcept(); }
					String[] arrayi2 = v.getVlStComposeIncludeCncptDsgnationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(valueset.getCompose().getInclude().get(i0).getConcept().get(i1).getDesignation().size() < i2+1) { valueset.getCompose().getInclude().get(i0).getConcept().get(i1).addDesignation(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {valueset.getCompose().getInclude().get(i0).getConcept().get(i1).getDesignation().get(i2).setValue(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** VlSt_Compose_Include_Cncpt_Dsply ********************************************************************************/
		if(v.getVlStComposeIncludeCncptDsply() != null ) {

			String[] arrayi0 = v.getVlStComposeIncludeCncptDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getCompose().getInclude().size() < i0+1) { valueset.getCompose().addInclude(); }
				String[] arrayi1 = v.getVlStComposeIncludeCncptDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getCompose().getInclude().get(i0).getConcept().size() < i1+1) { valueset.getCompose().getInclude().get(i0).addConcept(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getCompose().getInclude().get(i0).getConcept().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VlSt_Compose_Include_Fltr_Op ********************************************************************************/
		if(v.getVlStComposeIncludeFltrOp() != null ) {

			String[] arrayi0 = v.getVlStComposeIncludeFltrOp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getCompose().getInclude().size() < i0+1) { valueset.getCompose().addInclude(); }
				String[] arrayi1 = v.getVlStComposeIncludeFltrOp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getCompose().getInclude().get(i0).getFilter().size() < i1+1) { valueset.getCompose().getInclude().get(i0).addFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getCompose().getInclude().get(i0).getFilter().get(i1).setOp(new org.hl7.fhir.r4.model.ValueSet.FilterOperatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** VlSt_Compose_Include_Fltr_Prpty ********************************************************************************/
		if(v.getVlStComposeIncludeFltrPrpty() != null ) {

			String[] arrayi0 = v.getVlStComposeIncludeFltrPrpty().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getCompose().getInclude().size() < i0+1) { valueset.getCompose().addInclude(); }
				String[] arrayi1 = v.getVlStComposeIncludeFltrPrpty().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getCompose().getInclude().get(i0).getFilter().size() < i1+1) { valueset.getCompose().getInclude().get(i0).addFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getCompose().getInclude().get(i0).getFilter().get(i1).setProperty(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VlSt_Compose_Include_Fltr_Vl ********************************************************************************/
		if(v.getVlStComposeIncludeFltrVl() != null ) {

			String[] arrayi0 = v.getVlStComposeIncludeFltrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getCompose().getInclude().size() < i0+1) { valueset.getCompose().addInclude(); }
				String[] arrayi1 = v.getVlStComposeIncludeFltrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getCompose().getInclude().get(i0).getFilter().size() < i1+1) { valueset.getCompose().getInclude().get(i0).addFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getCompose().getInclude().get(i0).getFilter().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VlSt_Compose_Include_Sys ********************************************************************************/
		if(v.getVlStComposeIncludeSys() != null ) {

			String[] arrayi0 = v.getVlStComposeIncludeSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getCompose().getInclude().size() < i0+1) { valueset.getCompose().addInclude(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getCompose().getInclude().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VlSt_Compose_Include_VlSt ********************************************************************************/
		if(v.getVlStComposeIncludeVlSt() != null ) {

			String[] arrayi0 = v.getVlStComposeIncludeVlSt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getCompose().getInclude().size() < i0+1) { valueset.getCompose().addInclude(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {valueset.getCompose().getInclude().get(i0).addValueSet(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VlSt_Compose_Include_Vrsn ********************************************************************************/
		if(v.getVlStComposeIncludeVrsn() != null ) {

			String[] arrayi0 = v.getVlStComposeIncludeVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getCompose().getInclude().size() < i0+1) { valueset.getCompose().addInclude(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getCompose().getInclude().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VlSt_Compose_LockedDt ********************************************************************************/
		if(v.getVlStComposeLockedDt() != null ) {

			if(v.getVlStComposeLockedDt().replace("[","").replace("]","").equals("NULL") | v.getVlStComposeLockedDt()==null) {} else {
			valueset.getCompose().setLockedDate(v.getVlStComposeLockedDt().replace("[","").replace("]","").equals("NULL") | v.getVlStComposeLockedDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(v.getVlStComposeLockedDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VlSt_Cntct_Nm ********************************************************************************/
		if(v.getVlStCntctNm() != null ) {

			String[] arrayi0 = v.getVlStCntctNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getContact().size() < i0+1) { valueset.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getContact().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VlSt_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(v.getVlStCntctTlcmPrdEnd() != null ) {

			String[] arrayi0 = v.getVlStCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getContact().size() < i0+1) { valueset.addContact(); }
				String[] arrayi1 = v.getVlStCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getContact().get(i0).getTelecom().size() < i1+1) { valueset.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getContact().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** VlSt_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(v.getVlStCntctTlcmPrdStrt() != null ) {

			String[] arrayi0 = v.getVlStCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getContact().size() < i0+1) { valueset.addContact(); }
				String[] arrayi1 = v.getVlStCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getContact().get(i0).getTelecom().size() < i1+1) { valueset.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getContact().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** VlSt_Cntct_Tlcm_Rnk ********************************************************************************/
		if(v.getVlStCntctTlcmRnk() != null ) {

			String[] arrayi0 = v.getVlStCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getContact().size() < i0+1) { valueset.addContact(); }
				String[] arrayi1 = v.getVlStCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getContact().get(i0).getTelecom().size() < i1+1) { valueset.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getContact().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** VlSt_Cntct_Tlcm_Sys ********************************************************************************/
		if(v.getVlStCntctTlcmSys() != null ) {

			String[] arrayi0 = v.getVlStCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getContact().size() < i0+1) { valueset.addContact(); }
				String[] arrayi1 = v.getVlStCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getContact().get(i0).getTelecom().size() < i1+1) { valueset.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getContact().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** VlSt_Cntct_Tlcm_Use ********************************************************************************/
		if(v.getVlStCntctTlcmUse() != null ) {

			String[] arrayi0 = v.getVlStCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getContact().size() < i0+1) { valueset.addContact(); }
				String[] arrayi1 = v.getVlStCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getContact().get(i0).getTelecom().size() < i1+1) { valueset.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getContact().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** VlSt_Cntct_Tlcm_Vl ********************************************************************************/
		if(v.getVlStCntctTlcmVl() != null ) {

			String[] arrayi0 = v.getVlStCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getContact().size() < i0+1) { valueset.addContact(); }
				String[] arrayi1 = v.getVlStCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getContact().get(i0).getTelecom().size() < i1+1) { valueset.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getContact().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VlSt_Copyright ********************************************************************************/
		if(v.getVlStCopyright() != null ) {

			if(v.getVlStCopyright().replace("[","").replace("]","").equals("NULL") | v.getVlStCopyright()==null) {} else {
			valueset.setCopyright(v.getVlStCopyright().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** VlSt_Dt ********************************************************************************/
		if(v.getVlStDt() != null ) {

			if(v.getVlStDt().replace("[","").replace("]","").equals("NULL") | v.getVlStDt()==null) {} else {
			valueset.setDate(v.getVlStDt().replace("[","").replace("]","").equals("NULL") | v.getVlStDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(v.getVlStDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VlSt_Dscrptn ********************************************************************************/
		if(v.getVlStDscrptn() != null ) {

			if(v.getVlStDscrptn().replace("[","").replace("]","").equals("NULL") | v.getVlStDscrptn()==null) {} else {
			valueset.setDescription(v.getVlStDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** VlSt_Expansion_Contains_Abstract ********************************************************************************/
		if(v.getVlStExpansionContainsAbstract() != null ) {

			String[] arrayi0 = v.getVlStExpansionContainsAbstract().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getExpansion().getContains().size() < i0+1) { valueset.getExpansion().addContains(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getExpansion().getContains().get(i0).setAbstract(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VlSt_Expansion_Contains_Cd ********************************************************************************/
		if(v.getVlStExpansionContainsCd() != null ) {

			String[] arrayi0 = v.getVlStExpansionContainsCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getExpansion().getContains().size() < i0+1) { valueset.getExpansion().addContains(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getExpansion().getContains().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VlSt_Expansion_Contains_Dsgnation_Lnguage ********************************************************************************/
		if(v.getVlStExpansionContainsDsgnationLnguage() != null ) {

			String[] arrayi0 = v.getVlStExpansionContainsDsgnationLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getExpansion().getContains().size() < i0+1) { valueset.getExpansion().addContains(); }
				String[] arrayi1 = v.getVlStExpansionContainsDsgnationLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getExpansion().getContains().get(i0).getDesignation().size() < i1+1) { valueset.getExpansion().getContains().get(i0).addDesignation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getExpansion().getContains().get(i0).getDesignation().get(i1).setLanguage(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VlSt_Expansion_Contains_Dsgnation_Use_Cd ********************************************************************************/
		if(v.getVlStExpansionContainsDsgnationUseCd() != null ) {

			String[] arrayi0 = v.getVlStExpansionContainsDsgnationUseCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getExpansion().getContains().size() < i0+1) { valueset.getExpansion().addContains(); }
				String[] arrayi1 = v.getVlStExpansionContainsDsgnationUseCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getExpansion().getContains().get(i0).getDesignation().size() < i1+1) { valueset.getExpansion().getContains().get(i0).addDesignation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getExpansion().getContains().get(i0).getDesignation().get(i1).getUse().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VlSt_Expansion_Contains_Dsgnation_Use_Dsply ********************************************************************************/
		if(v.getVlStExpansionContainsDsgnationUseDsply() != null ) {

			String[] arrayi0 = v.getVlStExpansionContainsDsgnationUseDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getExpansion().getContains().size() < i0+1) { valueset.getExpansion().addContains(); }
				String[] arrayi1 = v.getVlStExpansionContainsDsgnationUseDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getExpansion().getContains().get(i0).getDesignation().size() < i1+1) { valueset.getExpansion().getContains().get(i0).addDesignation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getExpansion().getContains().get(i0).getDesignation().get(i1).getUse().setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VlSt_Expansion_Contains_Dsgnation_Use_Sys ********************************************************************************/
		if(v.getVlStExpansionContainsDsgnationUseSys() != null ) {

			String[] arrayi0 = v.getVlStExpansionContainsDsgnationUseSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getExpansion().getContains().size() < i0+1) { valueset.getExpansion().addContains(); }
				String[] arrayi1 = v.getVlStExpansionContainsDsgnationUseSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getExpansion().getContains().get(i0).getDesignation().size() < i1+1) { valueset.getExpansion().getContains().get(i0).addDesignation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getExpansion().getContains().get(i0).getDesignation().get(i1).getUse().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VlSt_Expansion_Contains_Dsgnation_Use_UsrSltd ********************************************************************************/
		if(v.getVlStExpansionContainsDsgnationUseUsrSltd() != null ) {

			String[] arrayi0 = v.getVlStExpansionContainsDsgnationUseUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getExpansion().getContains().size() < i0+1) { valueset.getExpansion().addContains(); }
				String[] arrayi1 = v.getVlStExpansionContainsDsgnationUseUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getExpansion().getContains().get(i0).getDesignation().size() < i1+1) { valueset.getExpansion().getContains().get(i0).addDesignation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getExpansion().getContains().get(i0).getDesignation().get(i1).getUse().setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** VlSt_Expansion_Contains_Dsgnation_Use_Vrsn ********************************************************************************/
		if(v.getVlStExpansionContainsDsgnationUseVrsn() != null ) {

			String[] arrayi0 = v.getVlStExpansionContainsDsgnationUseVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getExpansion().getContains().size() < i0+1) { valueset.getExpansion().addContains(); }
				String[] arrayi1 = v.getVlStExpansionContainsDsgnationUseVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getExpansion().getContains().get(i0).getDesignation().size() < i1+1) { valueset.getExpansion().getContains().get(i0).addDesignation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getExpansion().getContains().get(i0).getDesignation().get(i1).getUse().setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VlSt_Expansion_Contains_Dsgnation_Vl ********************************************************************************/
		if(v.getVlStExpansionContainsDsgnationVl() != null ) {

			String[] arrayi0 = v.getVlStExpansionContainsDsgnationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getExpansion().getContains().size() < i0+1) { valueset.getExpansion().addContains(); }
				String[] arrayi1 = v.getVlStExpansionContainsDsgnationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getExpansion().getContains().get(i0).getDesignation().size() < i1+1) { valueset.getExpansion().getContains().get(i0).addDesignation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getExpansion().getContains().get(i0).getDesignation().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VlSt_Expansion_Contains_Dsply ********************************************************************************/
		if(v.getVlStExpansionContainsDsply() != null ) {

			String[] arrayi0 = v.getVlStExpansionContainsDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getExpansion().getContains().size() < i0+1) { valueset.getExpansion().addContains(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getExpansion().getContains().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VlSt_Expansion_Contains_Inactive ********************************************************************************/
		if(v.getVlStExpansionContainsInactive() != null ) {

			String[] arrayi0 = v.getVlStExpansionContainsInactive().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getExpansion().getContains().size() < i0+1) { valueset.getExpansion().addContains(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getExpansion().getContains().get(i0).setInactive(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VlSt_Expansion_Contains_Sys ********************************************************************************/
		if(v.getVlStExpansionContainsSys() != null ) {

			String[] arrayi0 = v.getVlStExpansionContainsSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getExpansion().getContains().size() < i0+1) { valueset.getExpansion().addContains(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getExpansion().getContains().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VlSt_Expansion_Contains_Vrsn ********************************************************************************/
		if(v.getVlStExpansionContainsVrsn() != null ) {

			String[] arrayi0 = v.getVlStExpansionContainsVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getExpansion().getContains().size() < i0+1) { valueset.getExpansion().addContains(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getExpansion().getContains().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VlSt_Expansion_Id ********************************************************************************/
		if(v.getVlStExpansionId() != null ) {

			if(v.getVlStExpansionId().replace("[","").replace("]","").equals("NULL") | v.getVlStExpansionId()==null) {} else {
			valueset.getExpansion().setIdentifier(v.getVlStExpansionId().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** VlSt_Expansion_Off ********************************************************************************/
		if(v.getVlStExpansionOff() != null ) {

			if(v.getVlStExpansionOff().replace("[","").replace("]","").equals("NULL") | v.getVlStExpansionOff()==null) {} else {
			valueset.getExpansion().setOffset(Integer.parseInt(v.getVlStExpansionOff().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VlSt_Expansion_Prmtr_Nm ********************************************************************************/
		if(v.getVlStExpansionPrmtrNm() != null ) {

			String[] arrayi0 = v.getVlStExpansionPrmtrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getExpansion().getParameter().size() < i0+1) { valueset.getExpansion().addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getExpansion().getParameter().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VlSt_Expansion_Prmtr_VlBooleanTyp ********************************************************************************/
		if(v.getVlStExpansionPrmtrVlBooleanTyp() != null ) {

			String[] arrayi0 = v.getVlStExpansionPrmtrVlBooleanTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getExpansion().getParameter().size() < i0+1) { valueset.getExpansion().addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getExpansion().getParameter().get(i0).setValue(new org.hl7.fhir.r4.model.BooleanType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VlSt_Expansion_Prmtr_VlCdTyp ********************************************************************************/
		if(v.getVlStExpansionPrmtrVlCdTyp() != null ) {

			String[] arrayi0 = v.getVlStExpansionPrmtrVlCdTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getExpansion().getParameter().size() < i0+1) { valueset.getExpansion().addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getExpansion().getParameter().get(i0).setValue(new org.hl7.fhir.r4.model.CodeType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VlSt_Expansion_Prmtr_VlDtTimeTyp ********************************************************************************/
		if(v.getVlStExpansionPrmtrVlDtTimeTyp() != null ) {

			String[] arrayi0 = v.getVlStExpansionPrmtrVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getExpansion().getParameter().size() < i0+1) { valueset.getExpansion().addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getExpansion().getParameter().get(i0).setValue(new org.hl7.fhir.r4.model.DateTimeType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VlSt_Expansion_Prmtr_VlDecimalTyp ********************************************************************************/
		if(v.getVlStExpansionPrmtrVlDecimalTyp() != null ) {

			String[] arrayi0 = v.getVlStExpansionPrmtrVlDecimalTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getExpansion().getParameter().size() < i0+1) { valueset.getExpansion().addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getExpansion().getParameter().get(i0).setValue(new org.hl7.fhir.r4.model.DecimalType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VlSt_Expansion_Prmtr_VlIntegerTyp ********************************************************************************/
		if(v.getVlStExpansionPrmtrVlIntegerTyp() != null ) {

			String[] arrayi0 = v.getVlStExpansionPrmtrVlIntegerTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getExpansion().getParameter().size() < i0+1) { valueset.getExpansion().addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getExpansion().getParameter().get(i0).setValue(new org.hl7.fhir.r4.model.IntegerType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VlSt_Expansion_Prmtr_VlStrgTyp ********************************************************************************/
		if(v.getVlStExpansionPrmtrVlStrgTyp() != null ) {

			String[] arrayi0 = v.getVlStExpansionPrmtrVlStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getExpansion().getParameter().size() < i0+1) { valueset.getExpansion().addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getExpansion().getParameter().get(i0).setValue(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VlSt_Expansion_Prmtr_VlUriTyp ********************************************************************************/
		if(v.getVlStExpansionPrmtrVlUriTyp() != null ) {

			String[] arrayi0 = v.getVlStExpansionPrmtrVlUriTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getExpansion().getParameter().size() < i0+1) { valueset.getExpansion().addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getExpansion().getParameter().get(i0).setValue(new org.hl7.fhir.r4.model.UriType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VlSt_Expansion_Timestamp ********************************************************************************/
		if(v.getVlStExpansionTimestamp() != null ) {

			if(v.getVlStExpansionTimestamp().replace("[","").replace("]","").equals("NULL") | v.getVlStExpansionTimestamp()==null) {} else {
			valueset.getExpansion().setTimestamp(v.getVlStExpansionTimestamp().replace("[","").replace("]","").equals("NULL") | v.getVlStExpansionTimestamp()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(v.getVlStExpansionTimestamp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VlSt_Expansion_Total ********************************************************************************/
		if(v.getVlStExpansionTotal() != null ) {

			if(v.getVlStExpansionTotal().replace("[","").replace("]","").equals("NULL") | v.getVlStExpansionTotal()==null) {} else {
			valueset.getExpansion().setTotal(Integer.parseInt(v.getVlStExpansionTotal().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VlSt_Exprmtl ********************************************************************************/
		if(v.getVlStExprmtl() != null ) {

			if(v.getVlStExprmtl().replace("[","").replace("]","").equals("NULL") | v.getVlStExprmtl()==null) {} else {
			valueset.setExperimental(Boolean.parseBoolean(v.getVlStExprmtl().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VlSt_Id_Assigner ********************************************************************************/
		if(v.getVlStIdAssigner() != null ) {

			String[] arrayi0 = v.getVlStIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getIdentifier().size() < i0+1) { valueset.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VlSt_Id_Prd_End ********************************************************************************/
		if(v.getVlStIdPrdEnd() != null ) {

			String[] arrayi0 = v.getVlStIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getIdentifier().size() < i0+1) { valueset.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VlSt_Id_Prd_Strt ********************************************************************************/
		if(v.getVlStIdPrdStrt() != null ) {

			String[] arrayi0 = v.getVlStIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getIdentifier().size() < i0+1) { valueset.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VlSt_Id_Sys ********************************************************************************/
		if(v.getVlStIdSys() != null ) {

			String[] arrayi0 = v.getVlStIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getIdentifier().size() < i0+1) { valueset.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VlSt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(v.getVlStIdTypCdgCd() != null ) {

			String[] arrayi0 = v.getVlStIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getIdentifier().size() < i0+1) { valueset.addIdentifier(); }
				String[] arrayi1 = v.getVlStIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { valueset.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VlSt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(v.getVlStIdTypCdgDsply() != null ) {

			String[] arrayi0 = v.getVlStIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getIdentifier().size() < i0+1) { valueset.addIdentifier(); }
				String[] arrayi1 = v.getVlStIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { valueset.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VlSt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(v.getVlStIdTypCdgSys() != null ) {

			String[] arrayi0 = v.getVlStIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getIdentifier().size() < i0+1) { valueset.addIdentifier(); }
				String[] arrayi1 = v.getVlStIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { valueset.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VlSt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(v.getVlStIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = v.getVlStIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getIdentifier().size() < i0+1) { valueset.addIdentifier(); }
				String[] arrayi1 = v.getVlStIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { valueset.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** VlSt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(v.getVlStIdTypCdgVrsn() != null ) {

			String[] arrayi0 = v.getVlStIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getIdentifier().size() < i0+1) { valueset.addIdentifier(); }
				String[] arrayi1 = v.getVlStIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { valueset.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VlSt_Id_Typ_Txt ********************************************************************************/
		if(v.getVlStIdTypTxt() != null ) {

			String[] arrayi0 = v.getVlStIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getIdentifier().size() < i0+1) { valueset.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VlSt_Id_Use ********************************************************************************/
		if(v.getVlStIdUse() != null ) {

			String[] arrayi0 = v.getVlStIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getIdentifier().size() < i0+1) { valueset.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VlSt_Id_Vl ********************************************************************************/
		if(v.getVlStIdVl() != null ) {

			String[] arrayi0 = v.getVlStIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getIdentifier().size() < i0+1) { valueset.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VlSt_Immutable ********************************************************************************/
		if(v.getVlStImmutable() != null ) {

			if(v.getVlStImmutable().replace("[","").replace("]","").equals("NULL") | v.getVlStImmutable()==null) {} else {
			valueset.setImmutable(Boolean.parseBoolean(v.getVlStImmutable().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VlSt_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(v.getVlStJrsdctnCdgCd() != null ) {

			String[] arrayi0 = v.getVlStJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getJurisdiction().size() < i0+1) { valueset.addJurisdiction(); }
				String[] arrayi1 = v.getVlStJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getJurisdiction().get(i0).getCoding().size() < i1+1) { valueset.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getJurisdiction().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VlSt_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(v.getVlStJrsdctnCdgDsply() != null ) {

			String[] arrayi0 = v.getVlStJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getJurisdiction().size() < i0+1) { valueset.addJurisdiction(); }
				String[] arrayi1 = v.getVlStJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getJurisdiction().get(i0).getCoding().size() < i1+1) { valueset.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getJurisdiction().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VlSt_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(v.getVlStJrsdctnCdgSys() != null ) {

			String[] arrayi0 = v.getVlStJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getJurisdiction().size() < i0+1) { valueset.addJurisdiction(); }
				String[] arrayi1 = v.getVlStJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getJurisdiction().get(i0).getCoding().size() < i1+1) { valueset.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getJurisdiction().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VlSt_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(v.getVlStJrsdctnCdgUsrSltd() != null ) {

			String[] arrayi0 = v.getVlStJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getJurisdiction().size() < i0+1) { valueset.addJurisdiction(); }
				String[] arrayi1 = v.getVlStJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getJurisdiction().get(i0).getCoding().size() < i1+1) { valueset.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getJurisdiction().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** VlSt_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(v.getVlStJrsdctnCdgVrsn() != null ) {

			String[] arrayi0 = v.getVlStJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getJurisdiction().size() < i0+1) { valueset.addJurisdiction(); }
				String[] arrayi1 = v.getVlStJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getJurisdiction().get(i0).getCoding().size() < i1+1) { valueset.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getJurisdiction().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VlSt_Jrsdctn_Txt ********************************************************************************/
		if(v.getVlStJrsdctnTxt() != null ) {

			String[] arrayi0 = v.getVlStJrsdctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getJurisdiction().size() < i0+1) { valueset.addJurisdiction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getJurisdiction().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VlSt_Nm ********************************************************************************/
		if(v.getVlStNm() != null ) {

			if(v.getVlStNm().replace("[","").replace("]","").equals("NULL") | v.getVlStNm()==null) {} else {
			valueset.setName(v.getVlStNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** VlSt_Pblshr ********************************************************************************/
		if(v.getVlStPblshr() != null ) {

			if(v.getVlStPblshr().replace("[","").replace("]","").equals("NULL") | v.getVlStPblshr()==null) {} else {
			valueset.setPublisher(v.getVlStPblshr().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** VlSt_Prpse ********************************************************************************/
		if(v.getVlStPrpse() != null ) {

			if(v.getVlStPrpse().replace("[","").replace("]","").equals("NULL") | v.getVlStPrpse()==null) {} else {
			valueset.setPurpose(v.getVlStPrpse().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** VlSt_Sts ********************************************************************************/
		if(v.getVlStSts() != null ) {

			if(v.getVlStSts().replace("[","").replace("]","").equals("NULL") | v.getVlStSts()==null) {} else {
			valueset.setStatus(new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory().fromCode(v.getVlStSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VlSt_Ttl ********************************************************************************/
		if(v.getVlStTtl() != null ) {

			if(v.getVlStTtl().replace("[","").replace("]","").equals("NULL") | v.getVlStTtl()==null) {} else {
			valueset.setTitle(v.getVlStTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** VlSt_Url ********************************************************************************/
		if(v.getVlStUrl() != null ) {

			if(v.getVlStUrl().replace("[","").replace("]","").equals("NULL") | v.getVlStUrl()==null) {} else {
			valueset.setUrl(v.getVlStUrl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** VlSt_UseCntxt_Cd_Cd ********************************************************************************/
		if(v.getVlStUseCntxtCdCd() != null ) {

			String[] arrayi0 = v.getVlStUseCntxtCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getUseContext().size() < i0+1) { valueset.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getUseContext().get(i0).getCode().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VlSt_UseCntxt_Cd_Dsply ********************************************************************************/
		if(v.getVlStUseCntxtCdDsply() != null ) {

			String[] arrayi0 = v.getVlStUseCntxtCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getUseContext().size() < i0+1) { valueset.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getUseContext().get(i0).getCode().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VlSt_UseCntxt_Cd_Sys ********************************************************************************/
		if(v.getVlStUseCntxtCdSys() != null ) {

			String[] arrayi0 = v.getVlStUseCntxtCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getUseContext().size() < i0+1) { valueset.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getUseContext().get(i0).getCode().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VlSt_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(v.getVlStUseCntxtCdUsrSltd() != null ) {

			String[] arrayi0 = v.getVlStUseCntxtCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getUseContext().size() < i0+1) { valueset.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getUseContext().get(i0).getCode().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VlSt_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(v.getVlStUseCntxtCdVrsn() != null ) {

			String[] arrayi0 = v.getVlStUseCntxtCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getUseContext().size() < i0+1) { valueset.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getUseContext().get(i0).getCode().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VlSt_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(v.getVlStUseCntxtVlCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = v.getVlStUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getUseContext().size() < i0+1) { valueset.addUseContext(); }
				String[] arrayi1 = v.getVlStUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { valueset.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VlSt_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(v.getVlStUseCntxtVlCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = v.getVlStUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getUseContext().size() < i0+1) { valueset.addUseContext(); }
				String[] arrayi1 = v.getVlStUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { valueset.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VlSt_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(v.getVlStUseCntxtVlCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = v.getVlStUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getUseContext().size() < i0+1) { valueset.addUseContext(); }
				String[] arrayi1 = v.getVlStUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { valueset.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VlSt_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(v.getVlStUseCntxtVlCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = v.getVlStUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getUseContext().size() < i0+1) { valueset.addUseContext(); }
				String[] arrayi1 = v.getVlStUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { valueset.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** VlSt_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(v.getVlStUseCntxtVlCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = v.getVlStUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getUseContext().size() < i0+1) { valueset.addUseContext(); }
				String[] arrayi1 = v.getVlStUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(valueset.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { valueset.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {valueset.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VlSt_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(v.getVlStUseCntxtVlCdbleCncptTxt() != null ) {

			String[] arrayi0 = v.getVlStUseCntxtVlCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getUseContext().size() < i0+1) { valueset.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getUseContext().get(i0).getValueCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VlSt_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(v.getVlStUseCntxtVlQntyCd() != null ) {

			String[] arrayi0 = v.getVlStUseCntxtVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getUseContext().size() < i0+1) { valueset.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getUseContext().get(i0).getValueQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VlSt_UseCntxt_VlQnty_Cmprtr ********************************************************************************/
		if(v.getVlStUseCntxtVlQntyCmprtr() != null ) {

			String[] arrayi0 = v.getVlStUseCntxtVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getUseContext().size() < i0+1) { valueset.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getUseContext().get(i0).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VlSt_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(v.getVlStUseCntxtVlQntySys() != null ) {

			String[] arrayi0 = v.getVlStUseCntxtVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getUseContext().size() < i0+1) { valueset.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getUseContext().get(i0).getValueQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VlSt_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(v.getVlStUseCntxtVlQntyUnt() != null ) {

			String[] arrayi0 = v.getVlStUseCntxtVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getUseContext().size() < i0+1) { valueset.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getUseContext().get(i0).getValueQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VlSt_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(v.getVlStUseCntxtVlQntyVl() != null ) {

			String[] arrayi0 = v.getVlStUseCntxtVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getUseContext().size() < i0+1) { valueset.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getUseContext().get(i0).getValueQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** VlSt_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(v.getVlStUseCntxtVlRngHiCd() != null ) {

			String[] arrayi0 = v.getVlStUseCntxtVlRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getUseContext().size() < i0+1) { valueset.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getUseContext().get(i0).getValueRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VlSt_UseCntxt_VlRng_Hi_Cmprtr ********************************************************************************/
		if(v.getVlStUseCntxtVlRngHiCmprtr() != null ) {

			String[] arrayi0 = v.getVlStUseCntxtVlRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getUseContext().size() < i0+1) { valueset.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getUseContext().get(i0).getValueRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VlSt_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(v.getVlStUseCntxtVlRngHiSys() != null ) {

			String[] arrayi0 = v.getVlStUseCntxtVlRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getUseContext().size() < i0+1) { valueset.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getUseContext().get(i0).getValueRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VlSt_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(v.getVlStUseCntxtVlRngHiUnt() != null ) {

			String[] arrayi0 = v.getVlStUseCntxtVlRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getUseContext().size() < i0+1) { valueset.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getUseContext().get(i0).getValueRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VlSt_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(v.getVlStUseCntxtVlRngHiVl() != null ) {

			String[] arrayi0 = v.getVlStUseCntxtVlRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getUseContext().size() < i0+1) { valueset.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getUseContext().get(i0).getValueRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** VlSt_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(v.getVlStUseCntxtVlRngLwCd() != null ) {

			String[] arrayi0 = v.getVlStUseCntxtVlRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getUseContext().size() < i0+1) { valueset.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getUseContext().get(i0).getValueRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VlSt_UseCntxt_VlRng_Lw_Cmprtr ********************************************************************************/
		if(v.getVlStUseCntxtVlRngLwCmprtr() != null ) {

			String[] arrayi0 = v.getVlStUseCntxtVlRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getUseContext().size() < i0+1) { valueset.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getUseContext().get(i0).getValueRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VlSt_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(v.getVlStUseCntxtVlRngLwSys() != null ) {

			String[] arrayi0 = v.getVlStUseCntxtVlRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getUseContext().size() < i0+1) { valueset.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getUseContext().get(i0).getValueRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VlSt_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(v.getVlStUseCntxtVlRngLwUnt() != null ) {

			String[] arrayi0 = v.getVlStUseCntxtVlRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getUseContext().size() < i0+1) { valueset.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getUseContext().get(i0).getValueRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VlSt_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(v.getVlStUseCntxtVlRngLwVl() != null ) {

			String[] arrayi0 = v.getVlStUseCntxtVlRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getUseContext().size() < i0+1) { valueset.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getUseContext().get(i0).getValueRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** VlSt_UseCntxt_VlRfrnc ********************************************************************************/
		if(v.getVlStUseCntxtVlRfrnc() != null ) {

			String[] arrayi0 = v.getVlStUseCntxtVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(valueset.getUseContext().size() < i0+1) { valueset.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {valueset.getUseContext().get(i0).setValue(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VlSt_Vrsn ********************************************************************************/
		if(v.getVlStVrsn() != null ) {

			if(v.getVlStVrsn().replace("[","").replace("]","").equals("NULL") | v.getVlStVrsn()==null) {} else {
			valueset.setVersion(v.getVlStVrsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return valueset;
	}
}
