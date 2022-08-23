package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProductInteraction;
public class MedicinalProductInteractionConversion 
{
	public org.hl7.fhir.r4.model.MedicinalProductInteraction MedicinalProductInteractions(MedicinalProductInteraction m) throws ParseException
	{
		org.hl7.fhir.r4.model.MedicinalProductInteraction medicinalproductinteraction = new org.hl7.fhir.r4.model.MedicinalProductInteraction();

		/******************** id ********************************************************************************/
		medicinalproductinteraction.setId(m.getId());

		/******************** MdcnlPrdctInteraction_Dscrptn ********************************************************************************/
		if(m.getMdcnlPrdctInteractionDscrptn() != null ) {

			if(m.getMdcnlPrdctInteractionDscrptn().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctInteractionDscrptn()==null) {} else {
			medicinalproductinteraction.setDescription(m.getMdcnlPrdctInteractionDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctInteraction_Efct_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctInteractionEfctCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctInteractionEfctCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductinteraction.getEffect().getCoding().size() < i0+1) { medicinalproductinteraction.getEffect().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductinteraction.getEffect().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctInteraction_Efct_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctInteractionEfctCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctInteractionEfctCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductinteraction.getEffect().getCoding().size() < i0+1) { medicinalproductinteraction.getEffect().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductinteraction.getEffect().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctInteraction_Efct_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctInteractionEfctCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctInteractionEfctCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductinteraction.getEffect().getCoding().size() < i0+1) { medicinalproductinteraction.getEffect().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductinteraction.getEffect().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctInteraction_Efct_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctInteractionEfctCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctInteractionEfctCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductinteraction.getEffect().getCoding().size() < i0+1) { medicinalproductinteraction.getEffect().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductinteraction.getEffect().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctInteraction_Efct_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctInteractionEfctCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctInteractionEfctCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductinteraction.getEffect().getCoding().size() < i0+1) { medicinalproductinteraction.getEffect().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductinteraction.getEffect().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctInteraction_Efct_Txt ********************************************************************************/
		if(m.getMdcnlPrdctInteractionEfctTxt() != null ) {

			if(m.getMdcnlPrdctInteractionEfctTxt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctInteractionEfctTxt()==null) {} else {
			medicinalproductinteraction.getEffect().setText(m.getMdcnlPrdctInteractionEfctTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctInteraction_Incidence_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctInteractionIncidenceCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctInteractionIncidenceCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductinteraction.getIncidence().getCoding().size() < i0+1) { medicinalproductinteraction.getIncidence().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductinteraction.getIncidence().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctInteraction_Incidence_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctInteractionIncidenceCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctInteractionIncidenceCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductinteraction.getIncidence().getCoding().size() < i0+1) { medicinalproductinteraction.getIncidence().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductinteraction.getIncidence().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctInteraction_Incidence_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctInteractionIncidenceCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctInteractionIncidenceCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductinteraction.getIncidence().getCoding().size() < i0+1) { medicinalproductinteraction.getIncidence().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductinteraction.getIncidence().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctInteraction_Incidence_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctInteractionIncidenceCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctInteractionIncidenceCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductinteraction.getIncidence().getCoding().size() < i0+1) { medicinalproductinteraction.getIncidence().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductinteraction.getIncidence().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctInteraction_Incidence_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctInteractionIncidenceCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctInteractionIncidenceCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductinteraction.getIncidence().getCoding().size() < i0+1) { medicinalproductinteraction.getIncidence().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductinteraction.getIncidence().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctInteraction_Incidence_Txt ********************************************************************************/
		if(m.getMdcnlPrdctInteractionIncidenceTxt() != null ) {

			if(m.getMdcnlPrdctInteractionIncidenceTxt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctInteractionIncidenceTxt()==null) {} else {
			medicinalproductinteraction.getIncidence().setText(m.getMdcnlPrdctInteractionIncidenceTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctInteraction_Interactant_ItmCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctInteractionInteractantItmCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctInteractionInteractantItmCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductinteraction.getInteractant().size() < i0+1) { medicinalproductinteraction.addInteractant(); }
				String[] arrayi1 = m.getMdcnlPrdctInteractionInteractantItmCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductinteraction.getInteractant().get(i0).getItemCodeableConcept().getCoding().size() < i1+1) { medicinalproductinteraction.getInteractant().get(i0).getItemCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductinteraction.getInteractant().get(i0).getItemCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctInteraction_Interactant_ItmCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctInteractionInteractantItmCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctInteractionInteractantItmCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductinteraction.getInteractant().size() < i0+1) { medicinalproductinteraction.addInteractant(); }
				String[] arrayi1 = m.getMdcnlPrdctInteractionInteractantItmCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductinteraction.getInteractant().get(i0).getItemCodeableConcept().getCoding().size() < i1+1) { medicinalproductinteraction.getInteractant().get(i0).getItemCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductinteraction.getInteractant().get(i0).getItemCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctInteraction_Interactant_ItmCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctInteractionInteractantItmCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctInteractionInteractantItmCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductinteraction.getInteractant().size() < i0+1) { medicinalproductinteraction.addInteractant(); }
				String[] arrayi1 = m.getMdcnlPrdctInteractionInteractantItmCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductinteraction.getInteractant().get(i0).getItemCodeableConcept().getCoding().size() < i1+1) { medicinalproductinteraction.getInteractant().get(i0).getItemCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductinteraction.getInteractant().get(i0).getItemCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctInteraction_Interactant_ItmCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctInteractionInteractantItmCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctInteractionInteractantItmCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductinteraction.getInteractant().size() < i0+1) { medicinalproductinteraction.addInteractant(); }
				String[] arrayi1 = m.getMdcnlPrdctInteractionInteractantItmCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductinteraction.getInteractant().get(i0).getItemCodeableConcept().getCoding().size() < i1+1) { medicinalproductinteraction.getInteractant().get(i0).getItemCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductinteraction.getInteractant().get(i0).getItemCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctInteraction_Interactant_ItmCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctInteractionInteractantItmCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctInteractionInteractantItmCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductinteraction.getInteractant().size() < i0+1) { medicinalproductinteraction.addInteractant(); }
				String[] arrayi1 = m.getMdcnlPrdctInteractionInteractantItmCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductinteraction.getInteractant().get(i0).getItemCodeableConcept().getCoding().size() < i1+1) { medicinalproductinteraction.getInteractant().get(i0).getItemCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductinteraction.getInteractant().get(i0).getItemCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctInteraction_Interactant_ItmCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdcnlPrdctInteractionInteractantItmCdbleCncptTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctInteractionInteractantItmCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductinteraction.getInteractant().size() < i0+1) { medicinalproductinteraction.addInteractant(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductinteraction.getInteractant().get(i0).getItemCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctInteraction_Interactant_ItmRfrnc ********************************************************************************/
		if(m.getMdcnlPrdctInteractionInteractantItmRfrnc() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctInteractionInteractantItmRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductinteraction.getInteractant().size() < i0+1) { medicinalproductinteraction.addInteractant(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductinteraction.getInteractant().get(i0).setItem(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctInteraction_Management_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctInteractionManagementCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctInteractionManagementCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductinteraction.getManagement().getCoding().size() < i0+1) { medicinalproductinteraction.getManagement().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductinteraction.getManagement().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctInteraction_Management_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctInteractionManagementCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctInteractionManagementCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductinteraction.getManagement().getCoding().size() < i0+1) { medicinalproductinteraction.getManagement().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductinteraction.getManagement().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctInteraction_Management_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctInteractionManagementCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctInteractionManagementCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductinteraction.getManagement().getCoding().size() < i0+1) { medicinalproductinteraction.getManagement().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductinteraction.getManagement().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctInteraction_Management_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctInteractionManagementCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctInteractionManagementCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductinteraction.getManagement().getCoding().size() < i0+1) { medicinalproductinteraction.getManagement().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductinteraction.getManagement().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctInteraction_Management_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctInteractionManagementCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctInteractionManagementCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductinteraction.getManagement().getCoding().size() < i0+1) { medicinalproductinteraction.getManagement().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductinteraction.getManagement().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctInteraction_Management_Txt ********************************************************************************/
		if(m.getMdcnlPrdctInteractionManagementTxt() != null ) {

			if(m.getMdcnlPrdctInteractionManagementTxt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctInteractionManagementTxt()==null) {} else {
			medicinalproductinteraction.getManagement().setText(m.getMdcnlPrdctInteractionManagementTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctInteraction_Sbjct ********************************************************************************/
		if(m.getMdcnlPrdctInteractionSbjct() != null ) {

				for( String currListStrSplit : m.getMdcnlPrdctInteractionSbjct().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicinalproductinteraction.addSubject(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdcnlPrdctInteraction_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctInteractionTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctInteractionTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductinteraction.getType().getCoding().size() < i0+1) { medicinalproductinteraction.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductinteraction.getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctInteraction_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctInteractionTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctInteractionTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductinteraction.getType().getCoding().size() < i0+1) { medicinalproductinteraction.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductinteraction.getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctInteraction_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctInteractionTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctInteractionTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductinteraction.getType().getCoding().size() < i0+1) { medicinalproductinteraction.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductinteraction.getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctInteraction_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctInteractionTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctInteractionTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductinteraction.getType().getCoding().size() < i0+1) { medicinalproductinteraction.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductinteraction.getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctInteraction_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctInteractionTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctInteractionTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductinteraction.getType().getCoding().size() < i0+1) { medicinalproductinteraction.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductinteraction.getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctInteraction_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctInteractionTypTxt() != null ) {

			if(m.getMdcnlPrdctInteractionTypTxt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctInteractionTypTxt()==null) {} else {
			medicinalproductinteraction.getType().setText(m.getMdcnlPrdctInteractionTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return medicinalproductinteraction;
	}
}
