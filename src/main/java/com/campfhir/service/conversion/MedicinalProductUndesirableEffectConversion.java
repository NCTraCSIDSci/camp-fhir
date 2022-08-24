package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProductUndesirableEffect;
public class MedicinalProductUndesirableEffectConversion 
{
	public org.hl7.fhir.r4.model.MedicinalProductUndesirableEffect MedicinalProductUndesirableEffects(MedicinalProductUndesirableEffect m) throws ParseException
	{
		org.hl7.fhir.r4.model.MedicinalProductUndesirableEffect medicinalproductundesirableeffect = new org.hl7.fhir.r4.model.MedicinalProductUndesirableEffect();

		/******************** id ********************************************************************************/
		medicinalproductundesirableeffect.setId(m.getId());

		/******************** MdcnlPrdctUndesirableEfct_Clsfctn_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctClsfctnCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctClsfctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getClassification().getCoding().size() < i0+1) { medicinalproductundesirableeffect.getClassification().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductundesirableeffect.getClassification().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Clsfctn_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctClsfctnCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctClsfctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getClassification().getCoding().size() < i0+1) { medicinalproductundesirableeffect.getClassification().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductundesirableeffect.getClassification().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Clsfctn_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctClsfctnCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctClsfctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getClassification().getCoding().size() < i0+1) { medicinalproductundesirableeffect.getClassification().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductundesirableeffect.getClassification().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Clsfctn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctClsfctnCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctClsfctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getClassification().getCoding().size() < i0+1) { medicinalproductundesirableeffect.getClassification().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductundesirableeffect.getClassification().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Clsfctn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctClsfctnCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctClsfctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getClassification().getCoding().size() < i0+1) { medicinalproductundesirableeffect.getClassification().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductundesirableeffect.getClassification().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Clsfctn_Txt ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctClsfctnTxt() != null ) {

			if(m.getMdcnlPrdctUndesirableEfctClsfctnTxt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctUndesirableEfctClsfctnTxt()==null) {} else {
			medicinalproductundesirableeffect.getClassification().setText(m.getMdcnlPrdctUndesirableEfctClsfctnTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctUndesirableEfct_FrqncyOfOccrnce_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getFrequencyOfOccurrence().getCoding().size() < i0+1) { medicinalproductundesirableeffect.getFrequencyOfOccurrence().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductundesirableeffect.getFrequencyOfOccurrence().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_FrqncyOfOccrnce_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getFrequencyOfOccurrence().getCoding().size() < i0+1) { medicinalproductundesirableeffect.getFrequencyOfOccurrence().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductundesirableeffect.getFrequencyOfOccurrence().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_FrqncyOfOccrnce_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getFrequencyOfOccurrence().getCoding().size() < i0+1) { medicinalproductundesirableeffect.getFrequencyOfOccurrence().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductundesirableeffect.getFrequencyOfOccurrence().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_FrqncyOfOccrnce_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getFrequencyOfOccurrence().getCoding().size() < i0+1) { medicinalproductundesirableeffect.getFrequencyOfOccurrence().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductundesirableeffect.getFrequencyOfOccurrence().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_FrqncyOfOccrnce_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctFrqncyOfOccrnceCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getFrequencyOfOccurrence().getCoding().size() < i0+1) { medicinalproductundesirableeffect.getFrequencyOfOccurrence().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductundesirableeffect.getFrequencyOfOccurrence().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_FrqncyOfOccrnce_Txt ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctFrqncyOfOccrnceTxt() != null ) {

			if(m.getMdcnlPrdctUndesirableEfctFrqncyOfOccrnceTxt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctUndesirableEfctFrqncyOfOccrnceTxt()==null) {} else {
			medicinalproductundesirableeffect.getFrequencyOfOccurrence().setText(m.getMdcnlPrdctUndesirableEfctFrqncyOfOccrnceTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getPopulation().size() < i0+1) { medicinalproductundesirableeffect.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductundesirableeffect.getPopulation().get(i0).getAgeCodeableConcept().getCoding().size() < i1+1) { medicinalproductundesirableeffect.getPopulation().get(i0).getAgeCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductundesirableeffect.getPopulation().get(i0).getAgeCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getPopulation().size() < i0+1) { medicinalproductundesirableeffect.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductundesirableeffect.getPopulation().get(i0).getAgeCodeableConcept().getCoding().size() < i1+1) { medicinalproductundesirableeffect.getPopulation().get(i0).getAgeCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductundesirableeffect.getPopulation().get(i0).getAgeCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getPopulation().size() < i0+1) { medicinalproductundesirableeffect.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductundesirableeffect.getPopulation().get(i0).getAgeCodeableConcept().getCoding().size() < i1+1) { medicinalproductundesirableeffect.getPopulation().get(i0).getAgeCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductundesirableeffect.getPopulation().get(i0).getAgeCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getPopulation().size() < i0+1) { medicinalproductundesirableeffect.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductundesirableeffect.getPopulation().get(i0).getAgeCodeableConcept().getCoding().size() < i1+1) { medicinalproductundesirableeffect.getPopulation().get(i0).getAgeCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductundesirableeffect.getPopulation().get(i0).getAgeCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getPopulation().size() < i0+1) { medicinalproductundesirableeffect.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductundesirableeffect.getPopulation().get(i0).getAgeCodeableConcept().getCoding().size() < i1+1) { medicinalproductundesirableeffect.getPopulation().get(i0).getAgeCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductundesirableeffect.getPopulation().get(i0).getAgeCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctPoplnAgeCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getPopulation().size() < i0+1) { medicinalproductundesirableeffect.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductundesirableeffect.getPopulation().get(i0).getAgeCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeRng_Hi_Cd ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnAgeRngHiCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctPoplnAgeRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getPopulation().size() < i0+1) { medicinalproductundesirableeffect.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductundesirableeffect.getPopulation().get(i0).getAgeRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeRng_Hi_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnAgeRngHiCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctPoplnAgeRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getPopulation().size() < i0+1) { medicinalproductundesirableeffect.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductundesirableeffect.getPopulation().get(i0).getAgeRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeRng_Hi_Sys ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnAgeRngHiSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctPoplnAgeRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getPopulation().size() < i0+1) { medicinalproductundesirableeffect.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductundesirableeffect.getPopulation().get(i0).getAgeRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeRng_Hi_Unt ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnAgeRngHiUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctPoplnAgeRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getPopulation().size() < i0+1) { medicinalproductundesirableeffect.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductundesirableeffect.getPopulation().get(i0).getAgeRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeRng_Hi_Vl ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnAgeRngHiVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctPoplnAgeRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getPopulation().size() < i0+1) { medicinalproductundesirableeffect.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductundesirableeffect.getPopulation().get(i0).getAgeRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeRng_Lw_Cd ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnAgeRngLwCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctPoplnAgeRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getPopulation().size() < i0+1) { medicinalproductundesirableeffect.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductundesirableeffect.getPopulation().get(i0).getAgeRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeRng_Lw_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnAgeRngLwCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctPoplnAgeRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getPopulation().size() < i0+1) { medicinalproductundesirableeffect.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductundesirableeffect.getPopulation().get(i0).getAgeRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeRng_Lw_Sys ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnAgeRngLwSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctPoplnAgeRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getPopulation().size() < i0+1) { medicinalproductundesirableeffect.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductundesirableeffect.getPopulation().get(i0).getAgeRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeRng_Lw_Unt ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnAgeRngLwUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctPoplnAgeRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getPopulation().size() < i0+1) { medicinalproductundesirableeffect.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductundesirableeffect.getPopulation().get(i0).getAgeRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_AgeRng_Lw_Vl ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnAgeRngLwVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctPoplnAgeRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getPopulation().size() < i0+1) { medicinalproductundesirableeffect.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductundesirableeffect.getPopulation().get(i0).getAgeRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_Gender_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnGenderCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctPoplnGenderCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getPopulation().size() < i0+1) { medicinalproductundesirableeffect.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctUndesirableEfctPoplnGenderCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductundesirableeffect.getPopulation().get(i0).getGender().getCoding().size() < i1+1) { medicinalproductundesirableeffect.getPopulation().get(i0).getGender().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductundesirableeffect.getPopulation().get(i0).getGender().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_Gender_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnGenderCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctPoplnGenderCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getPopulation().size() < i0+1) { medicinalproductundesirableeffect.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctUndesirableEfctPoplnGenderCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductundesirableeffect.getPopulation().get(i0).getGender().getCoding().size() < i1+1) { medicinalproductundesirableeffect.getPopulation().get(i0).getGender().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductundesirableeffect.getPopulation().get(i0).getGender().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_Gender_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnGenderCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctPoplnGenderCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getPopulation().size() < i0+1) { medicinalproductundesirableeffect.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctUndesirableEfctPoplnGenderCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductundesirableeffect.getPopulation().get(i0).getGender().getCoding().size() < i1+1) { medicinalproductundesirableeffect.getPopulation().get(i0).getGender().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductundesirableeffect.getPopulation().get(i0).getGender().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_Gender_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnGenderCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctPoplnGenderCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getPopulation().size() < i0+1) { medicinalproductundesirableeffect.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctUndesirableEfctPoplnGenderCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductundesirableeffect.getPopulation().get(i0).getGender().getCoding().size() < i1+1) { medicinalproductundesirableeffect.getPopulation().get(i0).getGender().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductundesirableeffect.getPopulation().get(i0).getGender().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_Gender_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnGenderCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctPoplnGenderCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getPopulation().size() < i0+1) { medicinalproductundesirableeffect.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctUndesirableEfctPoplnGenderCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductundesirableeffect.getPopulation().get(i0).getGender().getCoding().size() < i1+1) { medicinalproductundesirableeffect.getPopulation().get(i0).getGender().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductundesirableeffect.getPopulation().get(i0).getGender().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_Gender_Txt ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnGenderTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctPoplnGenderTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getPopulation().size() < i0+1) { medicinalproductundesirableeffect.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductundesirableeffect.getPopulation().get(i0).getGender().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_PhysiologicalCndtn_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getPopulation().size() < i0+1) { medicinalproductundesirableeffect.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductundesirableeffect.getPopulation().get(i0).getPhysiologicalCondition().getCoding().size() < i1+1) { medicinalproductundesirableeffect.getPopulation().get(i0).getPhysiologicalCondition().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductundesirableeffect.getPopulation().get(i0).getPhysiologicalCondition().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_PhysiologicalCndtn_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getPopulation().size() < i0+1) { medicinalproductundesirableeffect.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductundesirableeffect.getPopulation().get(i0).getPhysiologicalCondition().getCoding().size() < i1+1) { medicinalproductundesirableeffect.getPopulation().get(i0).getPhysiologicalCondition().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductundesirableeffect.getPopulation().get(i0).getPhysiologicalCondition().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_PhysiologicalCndtn_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getPopulation().size() < i0+1) { medicinalproductundesirableeffect.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductundesirableeffect.getPopulation().get(i0).getPhysiologicalCondition().getCoding().size() < i1+1) { medicinalproductundesirableeffect.getPopulation().get(i0).getPhysiologicalCondition().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductundesirableeffect.getPopulation().get(i0).getPhysiologicalCondition().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_PhysiologicalCndtn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getPopulation().size() < i0+1) { medicinalproductundesirableeffect.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductundesirableeffect.getPopulation().get(i0).getPhysiologicalCondition().getCoding().size() < i1+1) { medicinalproductundesirableeffect.getPopulation().get(i0).getPhysiologicalCondition().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductundesirableeffect.getPopulation().get(i0).getPhysiologicalCondition().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_PhysiologicalCndtn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getPopulation().size() < i0+1) { medicinalproductundesirableeffect.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductundesirableeffect.getPopulation().get(i0).getPhysiologicalCondition().getCoding().size() < i1+1) { medicinalproductundesirableeffect.getPopulation().get(i0).getPhysiologicalCondition().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductundesirableeffect.getPopulation().get(i0).getPhysiologicalCondition().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_PhysiologicalCndtn_Txt ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctPoplnPhysiologicalCndtnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getPopulation().size() < i0+1) { medicinalproductundesirableeffect.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductundesirableeffect.getPopulation().get(i0).getPhysiologicalCondition().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_Race_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnRaceCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctPoplnRaceCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getPopulation().size() < i0+1) { medicinalproductundesirableeffect.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctUndesirableEfctPoplnRaceCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductundesirableeffect.getPopulation().get(i0).getRace().getCoding().size() < i1+1) { medicinalproductundesirableeffect.getPopulation().get(i0).getRace().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductundesirableeffect.getPopulation().get(i0).getRace().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_Race_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnRaceCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctPoplnRaceCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getPopulation().size() < i0+1) { medicinalproductundesirableeffect.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctUndesirableEfctPoplnRaceCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductundesirableeffect.getPopulation().get(i0).getRace().getCoding().size() < i1+1) { medicinalproductundesirableeffect.getPopulation().get(i0).getRace().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductundesirableeffect.getPopulation().get(i0).getRace().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_Race_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnRaceCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctPoplnRaceCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getPopulation().size() < i0+1) { medicinalproductundesirableeffect.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctUndesirableEfctPoplnRaceCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductundesirableeffect.getPopulation().get(i0).getRace().getCoding().size() < i1+1) { medicinalproductundesirableeffect.getPopulation().get(i0).getRace().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductundesirableeffect.getPopulation().get(i0).getRace().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_Race_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnRaceCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctPoplnRaceCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getPopulation().size() < i0+1) { medicinalproductundesirableeffect.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctUndesirableEfctPoplnRaceCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductundesirableeffect.getPopulation().get(i0).getRace().getCoding().size() < i1+1) { medicinalproductundesirableeffect.getPopulation().get(i0).getRace().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductundesirableeffect.getPopulation().get(i0).getRace().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_Race_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnRaceCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctPoplnRaceCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getPopulation().size() < i0+1) { medicinalproductundesirableeffect.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctUndesirableEfctPoplnRaceCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductundesirableeffect.getPopulation().get(i0).getRace().getCoding().size() < i1+1) { medicinalproductundesirableeffect.getPopulation().get(i0).getRace().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductundesirableeffect.getPopulation().get(i0).getRace().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Popln_Race_Txt ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctPoplnRaceTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctPoplnRaceTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getPopulation().size() < i0+1) { medicinalproductundesirableeffect.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductundesirableeffect.getPopulation().get(i0).getRace().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_Sbjct ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctSbjct() != null ) {

				for( String currListStrSplit : m.getMdcnlPrdctUndesirableEfctSbjct().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicinalproductundesirableeffect.addSubject(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdcnlPrdctUndesirableEfct_SymptomCndtnEfct_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getSymptomConditionEffect().getCoding().size() < i0+1) { medicinalproductundesirableeffect.getSymptomConditionEffect().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductundesirableeffect.getSymptomConditionEffect().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_SymptomCndtnEfct_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getSymptomConditionEffect().getCoding().size() < i0+1) { medicinalproductundesirableeffect.getSymptomConditionEffect().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductundesirableeffect.getSymptomConditionEffect().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_SymptomCndtnEfct_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getSymptomConditionEffect().getCoding().size() < i0+1) { medicinalproductundesirableeffect.getSymptomConditionEffect().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductundesirableeffect.getSymptomConditionEffect().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_SymptomCndtnEfct_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getSymptomConditionEffect().getCoding().size() < i0+1) { medicinalproductundesirableeffect.getSymptomConditionEffect().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductundesirableeffect.getSymptomConditionEffect().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_SymptomCndtnEfct_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctUndesirableEfctSymptomCndtnEfctCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductundesirableeffect.getSymptomConditionEffect().getCoding().size() < i0+1) { medicinalproductundesirableeffect.getSymptomConditionEffect().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductundesirableeffect.getSymptomConditionEffect().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctUndesirableEfct_SymptomCndtnEfct_Txt ********************************************************************************/
		if(m.getMdcnlPrdctUndesirableEfctSymptomCndtnEfctTxt() != null ) {

			if(m.getMdcnlPrdctUndesirableEfctSymptomCndtnEfctTxt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctUndesirableEfctSymptomCndtnEfctTxt()==null) {} else {
			medicinalproductundesirableeffect.getSymptomConditionEffect().setText(m.getMdcnlPrdctUndesirableEfctSymptomCndtnEfctTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return medicinalproductundesirableeffect;
	}
}
