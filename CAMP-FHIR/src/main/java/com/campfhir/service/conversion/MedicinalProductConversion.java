package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProduct;
public class MedicinalProductConversion 
{
	public org.hl7.fhir.r4.model.MedicinalProduct MedicinalProducts(MedicinalProduct m) throws ParseException
	{
		org.hl7.fhir.r4.model.MedicinalProduct medicinalproduct = new org.hl7.fhir.r4.model.MedicinalProduct();

		/******************** id ********************************************************************************/
		medicinalproduct.setId(m.getId());

		/******************** MdcnlPrdct_AddtnlMonitoringIndicator_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctAddtnlMonitoringIndicatorCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAddtnlMonitoringIndicatorCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getAdditionalMonitoringIndicator().getCoding().size() < i0+1) { medicinalproduct.getAdditionalMonitoringIndicator().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getAdditionalMonitoringIndicator().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_AddtnlMonitoringIndicator_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctAddtnlMonitoringIndicatorCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAddtnlMonitoringIndicatorCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getAdditionalMonitoringIndicator().getCoding().size() < i0+1) { medicinalproduct.getAdditionalMonitoringIndicator().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getAdditionalMonitoringIndicator().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_AddtnlMonitoringIndicator_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctAddtnlMonitoringIndicatorCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAddtnlMonitoringIndicatorCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getAdditionalMonitoringIndicator().getCoding().size() < i0+1) { medicinalproduct.getAdditionalMonitoringIndicator().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getAdditionalMonitoringIndicator().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_AddtnlMonitoringIndicator_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctAddtnlMonitoringIndicatorCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAddtnlMonitoringIndicatorCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getAdditionalMonitoringIndicator().getCoding().size() < i0+1) { medicinalproduct.getAdditionalMonitoringIndicator().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getAdditionalMonitoringIndicator().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdct_AddtnlMonitoringIndicator_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctAddtnlMonitoringIndicatorCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctAddtnlMonitoringIndicatorCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getAdditionalMonitoringIndicator().getCoding().size() < i0+1) { medicinalproduct.getAdditionalMonitoringIndicator().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getAdditionalMonitoringIndicator().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_AddtnlMonitoringIndicator_Txt ********************************************************************************/
		if(m.getMdcnlPrdctAddtnlMonitoringIndicatorTxt() != null ) {

			if(m.getMdcnlPrdctAddtnlMonitoringIndicatorTxt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctAddtnlMonitoringIndicatorTxt()==null) {} else {
			medicinalproduct.getAdditionalMonitoringIndicator().setText(m.getMdcnlPrdctAddtnlMonitoringIndicatorTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdct_AttachedDoc ********************************************************************************/
		if(m.getMdcnlPrdctAttachedDoc() != null ) {

				for( String currListStrSplit : m.getMdcnlPrdctAttachedDoc().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicinalproduct.addAttachedDocument(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdcnlPrdct_ClnclTrial ********************************************************************************/
		if(m.getMdcnlPrdctClnclTrial() != null ) {

				for( String currListStrSplit : m.getMdcnlPrdctClnclTrial().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicinalproduct.addClinicalTrial(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdcnlPrdct_CombinedPhrmctclDoseFrm_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctCombinedPhrmctclDoseFrmCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCombinedPhrmctclDoseFrmCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getCombinedPharmaceuticalDoseForm().getCoding().size() < i0+1) { medicinalproduct.getCombinedPharmaceuticalDoseForm().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getCombinedPharmaceuticalDoseForm().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_CombinedPhrmctclDoseFrm_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctCombinedPhrmctclDoseFrmCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCombinedPhrmctclDoseFrmCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getCombinedPharmaceuticalDoseForm().getCoding().size() < i0+1) { medicinalproduct.getCombinedPharmaceuticalDoseForm().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getCombinedPharmaceuticalDoseForm().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_CombinedPhrmctclDoseFrm_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctCombinedPhrmctclDoseFrmCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCombinedPhrmctclDoseFrmCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getCombinedPharmaceuticalDoseForm().getCoding().size() < i0+1) { medicinalproduct.getCombinedPharmaceuticalDoseForm().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getCombinedPharmaceuticalDoseForm().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_CombinedPhrmctclDoseFrm_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctCombinedPhrmctclDoseFrmCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCombinedPhrmctclDoseFrmCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getCombinedPharmaceuticalDoseForm().getCoding().size() < i0+1) { medicinalproduct.getCombinedPharmaceuticalDoseForm().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getCombinedPharmaceuticalDoseForm().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdct_CombinedPhrmctclDoseFrm_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctCombinedPhrmctclDoseFrmCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCombinedPhrmctclDoseFrmCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getCombinedPharmaceuticalDoseForm().getCoding().size() < i0+1) { medicinalproduct.getCombinedPharmaceuticalDoseForm().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getCombinedPharmaceuticalDoseForm().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_CombinedPhrmctclDoseFrm_Txt ********************************************************************************/
		if(m.getMdcnlPrdctCombinedPhrmctclDoseFrmTxt() != null ) {

			if(m.getMdcnlPrdctCombinedPhrmctclDoseFrmTxt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctCombinedPhrmctclDoseFrmTxt()==null) {} else {
			medicinalproduct.getCombinedPharmaceuticalDoseForm().setText(m.getMdcnlPrdctCombinedPhrmctclDoseFrmTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdct_Cntct ********************************************************************************/
		if(m.getMdcnlPrdctCntct() != null ) {

				for( String currListStrSplit : m.getMdcnlPrdctCntct().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicinalproduct.addContact(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdcnlPrdct_CrossRfrnc_Assigner ********************************************************************************/
		if(m.getMdcnlPrdctCrossRfrncAssigner() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCrossRfrncAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getCrossReference().size() < i0+1) { medicinalproduct.addCrossReference(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getCrossReference().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdct_CrossRfrnc_Prd_End ********************************************************************************/
		if(m.getMdcnlPrdctCrossRfrncPrdEnd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCrossRfrncPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getCrossReference().size() < i0+1) { medicinalproduct.addCrossReference(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getCrossReference().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdct_CrossRfrnc_Prd_Strt ********************************************************************************/
		if(m.getMdcnlPrdctCrossRfrncPrdStrt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCrossRfrncPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getCrossReference().size() < i0+1) { medicinalproduct.addCrossReference(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getCrossReference().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdct_CrossRfrnc_Sys ********************************************************************************/
		if(m.getMdcnlPrdctCrossRfrncSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCrossRfrncSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getCrossReference().size() < i0+1) { medicinalproduct.addCrossReference(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getCrossReference().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_CrossRfrnc_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctCrossRfrncTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCrossRfrncTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getCrossReference().size() < i0+1) { medicinalproduct.addCrossReference(); }
				String[] arrayi1 = m.getMdcnlPrdctCrossRfrncTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getCrossReference().get(i0).getType().getCoding().size() < i1+1) { medicinalproduct.getCrossReference().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getCrossReference().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_CrossRfrnc_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctCrossRfrncTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCrossRfrncTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getCrossReference().size() < i0+1) { medicinalproduct.addCrossReference(); }
				String[] arrayi1 = m.getMdcnlPrdctCrossRfrncTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getCrossReference().get(i0).getType().getCoding().size() < i1+1) { medicinalproduct.getCrossReference().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getCrossReference().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_CrossRfrnc_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctCrossRfrncTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCrossRfrncTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getCrossReference().size() < i0+1) { medicinalproduct.addCrossReference(); }
				String[] arrayi1 = m.getMdcnlPrdctCrossRfrncTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getCrossReference().get(i0).getType().getCoding().size() < i1+1) { medicinalproduct.getCrossReference().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getCrossReference().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_CrossRfrnc_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctCrossRfrncTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCrossRfrncTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getCrossReference().size() < i0+1) { medicinalproduct.addCrossReference(); }
				String[] arrayi1 = m.getMdcnlPrdctCrossRfrncTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getCrossReference().get(i0).getType().getCoding().size() < i1+1) { medicinalproduct.getCrossReference().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getCrossReference().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdct_CrossRfrnc_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctCrossRfrncTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCrossRfrncTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getCrossReference().size() < i0+1) { medicinalproduct.addCrossReference(); }
				String[] arrayi1 = m.getMdcnlPrdctCrossRfrncTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getCrossReference().get(i0).getType().getCoding().size() < i1+1) { medicinalproduct.getCrossReference().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getCrossReference().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_CrossRfrnc_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctCrossRfrncTypTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCrossRfrncTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getCrossReference().size() < i0+1) { medicinalproduct.addCrossReference(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getCrossReference().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_CrossRfrnc_Use ********************************************************************************/
		if(m.getMdcnlPrdctCrossRfrncUse() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCrossRfrncUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getCrossReference().size() < i0+1) { medicinalproduct.addCrossReference(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getCrossReference().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdct_CrossRfrnc_Vl ********************************************************************************/
		if(m.getMdcnlPrdctCrossRfrncVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCrossRfrncVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getCrossReference().size() < i0+1) { medicinalproduct.addCrossReference(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getCrossReference().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_Domain_Cd ********************************************************************************/
		if(m.getMdcnlPrdctDomainCd() != null ) {

			if(m.getMdcnlPrdctDomainCd().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctDomainCd()==null) {} else {
			medicinalproduct.getDomain().setCode(m.getMdcnlPrdctDomainCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdct_Domain_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctDomainDsply() != null ) {

			if(m.getMdcnlPrdctDomainDsply().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctDomainDsply()==null) {} else {
			medicinalproduct.getDomain().setDisplay(m.getMdcnlPrdctDomainDsply().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdct_Domain_Sys ********************************************************************************/
		if(m.getMdcnlPrdctDomainSys() != null ) {

			if(m.getMdcnlPrdctDomainSys().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctDomainSys()==null) {} else {
			medicinalproduct.getDomain().setSystem(m.getMdcnlPrdctDomainSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdct_Domain_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctDomainUsrSltd() != null ) {

			if(m.getMdcnlPrdctDomainUsrSltd().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctDomainUsrSltd()==null) {} else {
			medicinalproduct.getDomain().setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctDomainUsrSltd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdcnlPrdct_Domain_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctDomainVrsn() != null ) {

			if(m.getMdcnlPrdctDomainVrsn().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctDomainVrsn()==null) {} else {
			medicinalproduct.getDomain().setVersion(m.getMdcnlPrdctDomainVrsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdct_Id_Assigner ********************************************************************************/
		if(m.getMdcnlPrdctIdAssigner() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getIdentifier().size() < i0+1) { medicinalproduct.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdct_Id_Prd_End ********************************************************************************/
		if(m.getMdcnlPrdctIdPrdEnd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getIdentifier().size() < i0+1) { medicinalproduct.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdct_Id_Prd_Strt ********************************************************************************/
		if(m.getMdcnlPrdctIdPrdStrt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getIdentifier().size() < i0+1) { medicinalproduct.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdct_Id_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIdSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getIdentifier().size() < i0+1) { medicinalproduct.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIdTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getIdentifier().size() < i0+1) { medicinalproduct.addIdentifier(); }
				String[] arrayi1 = m.getMdcnlPrdctIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicinalproduct.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIdTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getIdentifier().size() < i0+1) { medicinalproduct.addIdentifier(); }
				String[] arrayi1 = m.getMdcnlPrdctIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicinalproduct.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIdTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getIdentifier().size() < i0+1) { medicinalproduct.addIdentifier(); }
				String[] arrayi1 = m.getMdcnlPrdctIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicinalproduct.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getIdentifier().size() < i0+1) { medicinalproduct.addIdentifier(); }
				String[] arrayi1 = m.getMdcnlPrdctIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicinalproduct.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdct_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIdTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getIdentifier().size() < i0+1) { medicinalproduct.addIdentifier(); }
				String[] arrayi1 = m.getMdcnlPrdctIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicinalproduct.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_Id_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIdTypTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getIdentifier().size() < i0+1) { medicinalproduct.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_Id_Use ********************************************************************************/
		if(m.getMdcnlPrdctIdUse() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getIdentifier().size() < i0+1) { medicinalproduct.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdct_Id_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIdVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getIdentifier().size() < i0+1) { medicinalproduct.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_LegalStsOfSpply_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctLegalStsOfSpplyCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctLegalStsOfSpplyCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getLegalStatusOfSupply().getCoding().size() < i0+1) { medicinalproduct.getLegalStatusOfSupply().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getLegalStatusOfSupply().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_LegalStsOfSpply_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctLegalStsOfSpplyCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctLegalStsOfSpplyCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getLegalStatusOfSupply().getCoding().size() < i0+1) { medicinalproduct.getLegalStatusOfSupply().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getLegalStatusOfSupply().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_LegalStsOfSpply_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctLegalStsOfSpplyCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctLegalStsOfSpplyCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getLegalStatusOfSupply().getCoding().size() < i0+1) { medicinalproduct.getLegalStatusOfSupply().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getLegalStatusOfSupply().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_LegalStsOfSpply_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctLegalStsOfSpplyCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctLegalStsOfSpplyCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getLegalStatusOfSupply().getCoding().size() < i0+1) { medicinalproduct.getLegalStatusOfSupply().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getLegalStatusOfSupply().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdct_LegalStsOfSpply_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctLegalStsOfSpplyCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctLegalStsOfSpplyCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getLegalStatusOfSupply().getCoding().size() < i0+1) { medicinalproduct.getLegalStatusOfSupply().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getLegalStatusOfSupply().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_LegalStsOfSpply_Txt ********************************************************************************/
		if(m.getMdcnlPrdctLegalStsOfSpplyTxt() != null ) {

			if(m.getMdcnlPrdctLegalStsOfSpplyTxt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctLegalStsOfSpplyTxt()==null) {} else {
			medicinalproduct.getLegalStatusOfSupply().setText(m.getMdcnlPrdctLegalStsOfSpplyTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Assigner ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrAssigner() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getManufacturingBusinessOperation().size() < i0+1) { medicinalproduct.addManufacturingBusinessOperation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getManufacturingBusinessOperation().get(i0).getAuthorisationReferenceNumber().setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Prd_End ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrPrdEnd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getManufacturingBusinessOperation().size() < i0+1) { medicinalproduct.addManufacturingBusinessOperation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getManufacturingBusinessOperation().get(i0).getAuthorisationReferenceNumber().getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Prd_Strt ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrPrdStrt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getManufacturingBusinessOperation().size() < i0+1) { medicinalproduct.addManufacturingBusinessOperation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getManufacturingBusinessOperation().get(i0).getAuthorisationReferenceNumber().getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getManufacturingBusinessOperation().size() < i0+1) { medicinalproduct.addManufacturingBusinessOperation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getManufacturingBusinessOperation().get(i0).getAuthorisationReferenceNumber().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getManufacturingBusinessOperation().size() < i0+1) { medicinalproduct.addManufacturingBusinessOperation(); }
				String[] arrayi1 = m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getManufacturingBusinessOperation().get(i0).getAuthorisationReferenceNumber().getType().getCoding().size() < i1+1) { medicinalproduct.getManufacturingBusinessOperation().get(i0).getAuthorisationReferenceNumber().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getManufacturingBusinessOperation().get(i0).getAuthorisationReferenceNumber().getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getManufacturingBusinessOperation().size() < i0+1) { medicinalproduct.addManufacturingBusinessOperation(); }
				String[] arrayi1 = m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getManufacturingBusinessOperation().get(i0).getAuthorisationReferenceNumber().getType().getCoding().size() < i1+1) { medicinalproduct.getManufacturingBusinessOperation().get(i0).getAuthorisationReferenceNumber().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getManufacturingBusinessOperation().get(i0).getAuthorisationReferenceNumber().getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getManufacturingBusinessOperation().size() < i0+1) { medicinalproduct.addManufacturingBusinessOperation(); }
				String[] arrayi1 = m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getManufacturingBusinessOperation().get(i0).getAuthorisationReferenceNumber().getType().getCoding().size() < i1+1) { medicinalproduct.getManufacturingBusinessOperation().get(i0).getAuthorisationReferenceNumber().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getManufacturingBusinessOperation().get(i0).getAuthorisationReferenceNumber().getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Typ_Cdg_US ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgUs() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgUs().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getManufacturingBusinessOperation().size() < i0+1) { medicinalproduct.addManufacturingBusinessOperation(); }
				String[] arrayi1 = m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgUs().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getManufacturingBusinessOperation().get(i0).getAuthorisationReferenceNumber().getType().getCoding().size() < i1+1) { medicinalproduct.getManufacturingBusinessOperation().get(i0).getAuthorisationReferenceNumber().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getManufacturingBusinessOperation().get(i0).getAuthorisationReferenceNumber().getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getManufacturingBusinessOperation().size() < i0+1) { medicinalproduct.addManufacturingBusinessOperation(); }
				String[] arrayi1 = m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getManufacturingBusinessOperation().get(i0).getAuthorisationReferenceNumber().getType().getCoding().size() < i1+1) { medicinalproduct.getManufacturingBusinessOperation().get(i0).getAuthorisationReferenceNumber().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getManufacturingBusinessOperation().get(i0).getAuthorisationReferenceNumber().getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getManufacturingBusinessOperation().size() < i0+1) { medicinalproduct.addManufacturingBusinessOperation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getManufacturingBusinessOperation().get(i0).getAuthorisationReferenceNumber().getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Use ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrUse() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getManufacturingBusinessOperation().size() < i0+1) { medicinalproduct.addManufacturingBusinessOperation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getManufacturingBusinessOperation().get(i0).getAuthorisationReferenceNumber().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getManufacturingBusinessOperation().size() < i0+1) { medicinalproduct.addManufacturingBusinessOperation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getManufacturingBusinessOperation().get(i0).getAuthorisationReferenceNumber().setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_CnfdntltyIndctr_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getManufacturingBusinessOperation().size() < i0+1) { medicinalproduct.addManufacturingBusinessOperation(); }
				String[] arrayi1 = m.getMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getManufacturingBusinessOperation().get(i0).getConfidentialityIndicator().getCoding().size() < i1+1) { medicinalproduct.getManufacturingBusinessOperation().get(i0).getConfidentialityIndicator().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getManufacturingBusinessOperation().get(i0).getConfidentialityIndicator().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_CnfdntltyIndctr_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getManufacturingBusinessOperation().size() < i0+1) { medicinalproduct.addManufacturingBusinessOperation(); }
				String[] arrayi1 = m.getMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getManufacturingBusinessOperation().get(i0).getConfidentialityIndicator().getCoding().size() < i1+1) { medicinalproduct.getManufacturingBusinessOperation().get(i0).getConfidentialityIndicator().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getManufacturingBusinessOperation().get(i0).getConfidentialityIndicator().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_CnfdntltyIndctr_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getManufacturingBusinessOperation().size() < i0+1) { medicinalproduct.addManufacturingBusinessOperation(); }
				String[] arrayi1 = m.getMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getManufacturingBusinessOperation().get(i0).getConfidentialityIndicator().getCoding().size() < i1+1) { medicinalproduct.getManufacturingBusinessOperation().get(i0).getConfidentialityIndicator().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getManufacturingBusinessOperation().get(i0).getConfidentialityIndicator().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_CnfdntltyIndctr_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getManufacturingBusinessOperation().size() < i0+1) { medicinalproduct.addManufacturingBusinessOperation(); }
				String[] arrayi1 = m.getMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getManufacturingBusinessOperation().get(i0).getConfidentialityIndicator().getCoding().size() < i1+1) { medicinalproduct.getManufacturingBusinessOperation().get(i0).getConfidentialityIndicator().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getManufacturingBusinessOperation().get(i0).getConfidentialityIndicator().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_CnfdntltyIndctr_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getManufacturingBusinessOperation().size() < i0+1) { medicinalproduct.addManufacturingBusinessOperation(); }
				String[] arrayi1 = m.getMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getManufacturingBusinessOperation().get(i0).getConfidentialityIndicator().getCoding().size() < i1+1) { medicinalproduct.getManufacturingBusinessOperation().get(i0).getConfidentialityIndicator().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getManufacturingBusinessOperation().get(i0).getConfidentialityIndicator().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_CnfdntltyIndctr_Txt ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getManufacturingBusinessOperation().size() < i0+1) { medicinalproduct.addManufacturingBusinessOperation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getManufacturingBusinessOperation().get(i0).getConfidentialityIndicator().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_EfctiveDt ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnEfctiveDt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctrngBsnssOprtnEfctiveDt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getManufacturingBusinessOperation().size() < i0+1) { medicinalproduct.addManufacturingBusinessOperation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getManufacturingBusinessOperation().get(i0).setEffectiveDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_Manufacturer ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnManufacturer() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctrngBsnssOprtnManufacturer().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getManufacturingBusinessOperation().size() < i0+1) { medicinalproduct.addManufacturingBusinessOperation(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {medicinalproduct.getManufacturingBusinessOperation().get(i0).addManufacturer(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_OprtnTyp_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getManufacturingBusinessOperation().size() < i0+1) { medicinalproduct.addManufacturingBusinessOperation(); }
				String[] arrayi1 = m.getMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getManufacturingBusinessOperation().get(i0).getOperationType().getCoding().size() < i1+1) { medicinalproduct.getManufacturingBusinessOperation().get(i0).getOperationType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getManufacturingBusinessOperation().get(i0).getOperationType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_OprtnTyp_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getManufacturingBusinessOperation().size() < i0+1) { medicinalproduct.addManufacturingBusinessOperation(); }
				String[] arrayi1 = m.getMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getManufacturingBusinessOperation().get(i0).getOperationType().getCoding().size() < i1+1) { medicinalproduct.getManufacturingBusinessOperation().get(i0).getOperationType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getManufacturingBusinessOperation().get(i0).getOperationType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_OprtnTyp_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getManufacturingBusinessOperation().size() < i0+1) { medicinalproduct.addManufacturingBusinessOperation(); }
				String[] arrayi1 = m.getMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getManufacturingBusinessOperation().get(i0).getOperationType().getCoding().size() < i1+1) { medicinalproduct.getManufacturingBusinessOperation().get(i0).getOperationType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getManufacturingBusinessOperation().get(i0).getOperationType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_OprtnTyp_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getManufacturingBusinessOperation().size() < i0+1) { medicinalproduct.addManufacturingBusinessOperation(); }
				String[] arrayi1 = m.getMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getManufacturingBusinessOperation().get(i0).getOperationType().getCoding().size() < i1+1) { medicinalproduct.getManufacturingBusinessOperation().get(i0).getOperationType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getManufacturingBusinessOperation().get(i0).getOperationType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_OprtnTyp_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getManufacturingBusinessOperation().size() < i0+1) { medicinalproduct.addManufacturingBusinessOperation(); }
				String[] arrayi1 = m.getMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getManufacturingBusinessOperation().get(i0).getOperationType().getCoding().size() < i1+1) { medicinalproduct.getManufacturingBusinessOperation().get(i0).getOperationType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getManufacturingBusinessOperation().get(i0).getOperationType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_OprtnTyp_Txt ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnOprtnTypTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctrngBsnssOprtnOprtnTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getManufacturingBusinessOperation().size() < i0+1) { medicinalproduct.addManufacturingBusinessOperation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getManufacturingBusinessOperation().get(i0).getOperationType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_Regulator ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnRegulator() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctrngBsnssOprtnRegulator().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getManufacturingBusinessOperation().size() < i0+1) { medicinalproduct.addManufacturingBusinessOperation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getManufacturingBusinessOperation().get(i0).setRegulator(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdct_MarketingSts_Cntry_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsCntryCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMarketingStsCntryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getMarketingStatus().size() < i0+1) { medicinalproduct.addMarketingStatus(); }
				String[] arrayi1 = m.getMdcnlPrdctMarketingStsCntryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getMarketingStatus().get(i0).getCountry().getCoding().size() < i1+1) { medicinalproduct.getMarketingStatus().get(i0).getCountry().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getMarketingStatus().get(i0).getCountry().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_MarketingSts_Cntry_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsCntryCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMarketingStsCntryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getMarketingStatus().size() < i0+1) { medicinalproduct.addMarketingStatus(); }
				String[] arrayi1 = m.getMdcnlPrdctMarketingStsCntryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getMarketingStatus().get(i0).getCountry().getCoding().size() < i1+1) { medicinalproduct.getMarketingStatus().get(i0).getCountry().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getMarketingStatus().get(i0).getCountry().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_MarketingSts_Cntry_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsCntryCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMarketingStsCntryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getMarketingStatus().size() < i0+1) { medicinalproduct.addMarketingStatus(); }
				String[] arrayi1 = m.getMdcnlPrdctMarketingStsCntryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getMarketingStatus().get(i0).getCountry().getCoding().size() < i1+1) { medicinalproduct.getMarketingStatus().get(i0).getCountry().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getMarketingStatus().get(i0).getCountry().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_MarketingSts_Cntry_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsCntryCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMarketingStsCntryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getMarketingStatus().size() < i0+1) { medicinalproduct.addMarketingStatus(); }
				String[] arrayi1 = m.getMdcnlPrdctMarketingStsCntryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getMarketingStatus().get(i0).getCountry().getCoding().size() < i1+1) { medicinalproduct.getMarketingStatus().get(i0).getCountry().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getMarketingStatus().get(i0).getCountry().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdct_MarketingSts_Cntry_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsCntryCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMarketingStsCntryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getMarketingStatus().size() < i0+1) { medicinalproduct.addMarketingStatus(); }
				String[] arrayi1 = m.getMdcnlPrdctMarketingStsCntryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getMarketingStatus().get(i0).getCountry().getCoding().size() < i1+1) { medicinalproduct.getMarketingStatus().get(i0).getCountry().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getMarketingStatus().get(i0).getCountry().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_MarketingSts_Cntry_Txt ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsCntryTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMarketingStsCntryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getMarketingStatus().size() < i0+1) { medicinalproduct.addMarketingStatus(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getMarketingStatus().get(i0).getCountry().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_MarketingSts_DtRng_End ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsDtRngEnd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMarketingStsDtRngEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getMarketingStatus().size() < i0+1) { medicinalproduct.addMarketingStatus(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getMarketingStatus().get(i0).getDateRange().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdct_MarketingSts_DtRng_Strt ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsDtRngStrt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMarketingStsDtRngStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getMarketingStatus().size() < i0+1) { medicinalproduct.addMarketingStatus(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getMarketingStatus().get(i0).getDateRange().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdct_MarketingSts_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsJrsdctnCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMarketingStsJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getMarketingStatus().size() < i0+1) { medicinalproduct.addMarketingStatus(); }
				String[] arrayi1 = m.getMdcnlPrdctMarketingStsJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getMarketingStatus().get(i0).getJurisdiction().getCoding().size() < i1+1) { medicinalproduct.getMarketingStatus().get(i0).getJurisdiction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getMarketingStatus().get(i0).getJurisdiction().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_MarketingSts_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsJrsdctnCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMarketingStsJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getMarketingStatus().size() < i0+1) { medicinalproduct.addMarketingStatus(); }
				String[] arrayi1 = m.getMdcnlPrdctMarketingStsJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getMarketingStatus().get(i0).getJurisdiction().getCoding().size() < i1+1) { medicinalproduct.getMarketingStatus().get(i0).getJurisdiction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getMarketingStatus().get(i0).getJurisdiction().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_MarketingSts_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsJrsdctnCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMarketingStsJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getMarketingStatus().size() < i0+1) { medicinalproduct.addMarketingStatus(); }
				String[] arrayi1 = m.getMdcnlPrdctMarketingStsJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getMarketingStatus().get(i0).getJurisdiction().getCoding().size() < i1+1) { medicinalproduct.getMarketingStatus().get(i0).getJurisdiction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getMarketingStatus().get(i0).getJurisdiction().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_MarketingSts_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsJrsdctnCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMarketingStsJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getMarketingStatus().size() < i0+1) { medicinalproduct.addMarketingStatus(); }
				String[] arrayi1 = m.getMdcnlPrdctMarketingStsJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getMarketingStatus().get(i0).getJurisdiction().getCoding().size() < i1+1) { medicinalproduct.getMarketingStatus().get(i0).getJurisdiction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getMarketingStatus().get(i0).getJurisdiction().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdct_MarketingSts_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsJrsdctnCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMarketingStsJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getMarketingStatus().size() < i0+1) { medicinalproduct.addMarketingStatus(); }
				String[] arrayi1 = m.getMdcnlPrdctMarketingStsJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getMarketingStatus().get(i0).getJurisdiction().getCoding().size() < i1+1) { medicinalproduct.getMarketingStatus().get(i0).getJurisdiction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getMarketingStatus().get(i0).getJurisdiction().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_MarketingSts_Jrsdctn_Txt ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsJrsdctnTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMarketingStsJrsdctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getMarketingStatus().size() < i0+1) { medicinalproduct.addMarketingStatus(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getMarketingStatus().get(i0).getJurisdiction().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_MarketingSts_RestoreDt ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsRestoreDt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMarketingStsRestoreDt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getMarketingStatus().size() < i0+1) { medicinalproduct.addMarketingStatus(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getMarketingStatus().get(i0).setRestoreDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdct_MarketingSts_Sts_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsStsCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMarketingStsStsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getMarketingStatus().size() < i0+1) { medicinalproduct.addMarketingStatus(); }
				String[] arrayi1 = m.getMdcnlPrdctMarketingStsStsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getMarketingStatus().get(i0).getStatus().getCoding().size() < i1+1) { medicinalproduct.getMarketingStatus().get(i0).getStatus().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getMarketingStatus().get(i0).getStatus().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_MarketingSts_Sts_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsStsCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMarketingStsStsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getMarketingStatus().size() < i0+1) { medicinalproduct.addMarketingStatus(); }
				String[] arrayi1 = m.getMdcnlPrdctMarketingStsStsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getMarketingStatus().get(i0).getStatus().getCoding().size() < i1+1) { medicinalproduct.getMarketingStatus().get(i0).getStatus().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getMarketingStatus().get(i0).getStatus().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_MarketingSts_Sts_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsStsCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMarketingStsStsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getMarketingStatus().size() < i0+1) { medicinalproduct.addMarketingStatus(); }
				String[] arrayi1 = m.getMdcnlPrdctMarketingStsStsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getMarketingStatus().get(i0).getStatus().getCoding().size() < i1+1) { medicinalproduct.getMarketingStatus().get(i0).getStatus().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getMarketingStatus().get(i0).getStatus().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_MarketingSts_Sts_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsStsCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMarketingStsStsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getMarketingStatus().size() < i0+1) { medicinalproduct.addMarketingStatus(); }
				String[] arrayi1 = m.getMdcnlPrdctMarketingStsStsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getMarketingStatus().get(i0).getStatus().getCoding().size() < i1+1) { medicinalproduct.getMarketingStatus().get(i0).getStatus().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getMarketingStatus().get(i0).getStatus().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdct_MarketingSts_Sts_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsStsCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMarketingStsStsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getMarketingStatus().size() < i0+1) { medicinalproduct.addMarketingStatus(); }
				String[] arrayi1 = m.getMdcnlPrdctMarketingStsStsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getMarketingStatus().get(i0).getStatus().getCoding().size() < i1+1) { medicinalproduct.getMarketingStatus().get(i0).getStatus().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getMarketingStatus().get(i0).getStatus().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_MarketingSts_Sts_Txt ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsStsTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMarketingStsStsTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getMarketingStatus().size() < i0+1) { medicinalproduct.addMarketingStatus(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getMarketingStatus().get(i0).getStatus().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_MasterFile ********************************************************************************/
		if(m.getMdcnlPrdctMasterFile() != null ) {

				for( String currListStrSplit : m.getMdcnlPrdctMasterFile().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicinalproduct.addMasterFile(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Cntry_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctNmCntryLnguageCntryCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctNmCntryLnguageCntryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getName().size() < i0+1) { medicinalproduct.addName(); }
				String[] arrayi1 = m.getMdcnlPrdctNmCntryLnguageCntryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getName().get(i0).getCountryLanguage().size() < i1+1) { medicinalproduct.getName().get(i0).addCountryLanguage(); }
					String[] arrayi2 = m.getMdcnlPrdctNmCntryLnguageCntryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getCountry().getCoding().size() < i2+1) { medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getCountry().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getCountry().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Cntry_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctNmCntryLnguageCntryCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctNmCntryLnguageCntryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getName().size() < i0+1) { medicinalproduct.addName(); }
				String[] arrayi1 = m.getMdcnlPrdctNmCntryLnguageCntryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getName().get(i0).getCountryLanguage().size() < i1+1) { medicinalproduct.getName().get(i0).addCountryLanguage(); }
					String[] arrayi2 = m.getMdcnlPrdctNmCntryLnguageCntryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getCountry().getCoding().size() < i2+1) { medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getCountry().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getCountry().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Cntry_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctNmCntryLnguageCntryCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctNmCntryLnguageCntryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getName().size() < i0+1) { medicinalproduct.addName(); }
				String[] arrayi1 = m.getMdcnlPrdctNmCntryLnguageCntryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getName().get(i0).getCountryLanguage().size() < i1+1) { medicinalproduct.getName().get(i0).addCountryLanguage(); }
					String[] arrayi2 = m.getMdcnlPrdctNmCntryLnguageCntryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getCountry().getCoding().size() < i2+1) { medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getCountry().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getCountry().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Cntry_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctNmCntryLnguageCntryCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctNmCntryLnguageCntryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getName().size() < i0+1) { medicinalproduct.addName(); }
				String[] arrayi1 = m.getMdcnlPrdctNmCntryLnguageCntryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getName().get(i0).getCountryLanguage().size() < i1+1) { medicinalproduct.getName().get(i0).addCountryLanguage(); }
					String[] arrayi2 = m.getMdcnlPrdctNmCntryLnguageCntryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getCountry().getCoding().size() < i2+1) { medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getCountry().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getCountry().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Cntry_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctNmCntryLnguageCntryCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctNmCntryLnguageCntryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getName().size() < i0+1) { medicinalproduct.addName(); }
				String[] arrayi1 = m.getMdcnlPrdctNmCntryLnguageCntryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getName().get(i0).getCountryLanguage().size() < i1+1) { medicinalproduct.getName().get(i0).addCountryLanguage(); }
					String[] arrayi2 = m.getMdcnlPrdctNmCntryLnguageCntryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getCountry().getCoding().size() < i2+1) { medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getCountry().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getCountry().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Cntry_Txt ********************************************************************************/
		if(m.getMdcnlPrdctNmCntryLnguageCntryTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctNmCntryLnguageCntryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getName().size() < i0+1) { medicinalproduct.addName(); }
				String[] arrayi1 = m.getMdcnlPrdctNmCntryLnguageCntryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getName().get(i0).getCountryLanguage().size() < i1+1) { medicinalproduct.getName().get(i0).addCountryLanguage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getCountry().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctNmCntryLnguageJrsdctnCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctNmCntryLnguageJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getName().size() < i0+1) { medicinalproduct.addName(); }
				String[] arrayi1 = m.getMdcnlPrdctNmCntryLnguageJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getName().get(i0).getCountryLanguage().size() < i1+1) { medicinalproduct.getName().get(i0).addCountryLanguage(); }
					String[] arrayi2 = m.getMdcnlPrdctNmCntryLnguageJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getJurisdiction().getCoding().size() < i2+1) { medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getJurisdiction().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getJurisdiction().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctNmCntryLnguageJrsdctnCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctNmCntryLnguageJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getName().size() < i0+1) { medicinalproduct.addName(); }
				String[] arrayi1 = m.getMdcnlPrdctNmCntryLnguageJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getName().get(i0).getCountryLanguage().size() < i1+1) { medicinalproduct.getName().get(i0).addCountryLanguage(); }
					String[] arrayi2 = m.getMdcnlPrdctNmCntryLnguageJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getJurisdiction().getCoding().size() < i2+1) { medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getJurisdiction().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getJurisdiction().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctNmCntryLnguageJrsdctnCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctNmCntryLnguageJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getName().size() < i0+1) { medicinalproduct.addName(); }
				String[] arrayi1 = m.getMdcnlPrdctNmCntryLnguageJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getName().get(i0).getCountryLanguage().size() < i1+1) { medicinalproduct.getName().get(i0).addCountryLanguage(); }
					String[] arrayi2 = m.getMdcnlPrdctNmCntryLnguageJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getJurisdiction().getCoding().size() < i2+1) { medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getJurisdiction().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getJurisdiction().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctNmCntryLnguageJrsdctnCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctNmCntryLnguageJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getName().size() < i0+1) { medicinalproduct.addName(); }
				String[] arrayi1 = m.getMdcnlPrdctNmCntryLnguageJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getName().get(i0).getCountryLanguage().size() < i1+1) { medicinalproduct.getName().get(i0).addCountryLanguage(); }
					String[] arrayi2 = m.getMdcnlPrdctNmCntryLnguageJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getJurisdiction().getCoding().size() < i2+1) { medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getJurisdiction().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getJurisdiction().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctNmCntryLnguageJrsdctnCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctNmCntryLnguageJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getName().size() < i0+1) { medicinalproduct.addName(); }
				String[] arrayi1 = m.getMdcnlPrdctNmCntryLnguageJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getName().get(i0).getCountryLanguage().size() < i1+1) { medicinalproduct.getName().get(i0).addCountryLanguage(); }
					String[] arrayi2 = m.getMdcnlPrdctNmCntryLnguageJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getJurisdiction().getCoding().size() < i2+1) { medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getJurisdiction().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getJurisdiction().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Jrsdctn_Txt ********************************************************************************/
		if(m.getMdcnlPrdctNmCntryLnguageJrsdctnTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctNmCntryLnguageJrsdctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getName().size() < i0+1) { medicinalproduct.addName(); }
				String[] arrayi1 = m.getMdcnlPrdctNmCntryLnguageJrsdctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getName().get(i0).getCountryLanguage().size() < i1+1) { medicinalproduct.getName().get(i0).addCountryLanguage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getJurisdiction().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Lnguage_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctNmCntryLnguageLnguageCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctNmCntryLnguageLnguageCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getName().size() < i0+1) { medicinalproduct.addName(); }
				String[] arrayi1 = m.getMdcnlPrdctNmCntryLnguageLnguageCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getName().get(i0).getCountryLanguage().size() < i1+1) { medicinalproduct.getName().get(i0).addCountryLanguage(); }
					String[] arrayi2 = m.getMdcnlPrdctNmCntryLnguageLnguageCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getLanguage().getCoding().size() < i2+1) { medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getLanguage().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getLanguage().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Lnguage_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctNmCntryLnguageLnguageCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctNmCntryLnguageLnguageCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getName().size() < i0+1) { medicinalproduct.addName(); }
				String[] arrayi1 = m.getMdcnlPrdctNmCntryLnguageLnguageCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getName().get(i0).getCountryLanguage().size() < i1+1) { medicinalproduct.getName().get(i0).addCountryLanguage(); }
					String[] arrayi2 = m.getMdcnlPrdctNmCntryLnguageLnguageCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getLanguage().getCoding().size() < i2+1) { medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getLanguage().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getLanguage().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Lnguage_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctNmCntryLnguageLnguageCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctNmCntryLnguageLnguageCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getName().size() < i0+1) { medicinalproduct.addName(); }
				String[] arrayi1 = m.getMdcnlPrdctNmCntryLnguageLnguageCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getName().get(i0).getCountryLanguage().size() < i1+1) { medicinalproduct.getName().get(i0).addCountryLanguage(); }
					String[] arrayi2 = m.getMdcnlPrdctNmCntryLnguageLnguageCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getLanguage().getCoding().size() < i2+1) { medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getLanguage().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getLanguage().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Lnguage_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctNmCntryLnguageLnguageCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctNmCntryLnguageLnguageCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getName().size() < i0+1) { medicinalproduct.addName(); }
				String[] arrayi1 = m.getMdcnlPrdctNmCntryLnguageLnguageCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getName().get(i0).getCountryLanguage().size() < i1+1) { medicinalproduct.getName().get(i0).addCountryLanguage(); }
					String[] arrayi2 = m.getMdcnlPrdctNmCntryLnguageLnguageCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getLanguage().getCoding().size() < i2+1) { medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getLanguage().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getLanguage().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Lnguage_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctNmCntryLnguageLnguageCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctNmCntryLnguageLnguageCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getName().size() < i0+1) { medicinalproduct.addName(); }
				String[] arrayi1 = m.getMdcnlPrdctNmCntryLnguageLnguageCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getName().get(i0).getCountryLanguage().size() < i1+1) { medicinalproduct.getName().get(i0).addCountryLanguage(); }
					String[] arrayi2 = m.getMdcnlPrdctNmCntryLnguageLnguageCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getLanguage().getCoding().size() < i2+1) { medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getLanguage().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getLanguage().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Lnguage_Txt ********************************************************************************/
		if(m.getMdcnlPrdctNmCntryLnguageLnguageTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctNmCntryLnguageLnguageTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getName().size() < i0+1) { medicinalproduct.addName(); }
				String[] arrayi1 = m.getMdcnlPrdctNmCntryLnguageLnguageTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getName().get(i0).getCountryLanguage().size() < i1+1) { medicinalproduct.getName().get(i0).addCountryLanguage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getName().get(i0).getCountryLanguage().get(i1).getLanguage().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_Nm_NmPart_Part ********************************************************************************/
		if(m.getMdcnlPrdctNmNmPartPart() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctNmNmPartPart().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getName().size() < i0+1) { medicinalproduct.addName(); }
				String[] arrayi1 = m.getMdcnlPrdctNmNmPartPart().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getName().get(i0).getNamePart().size() < i1+1) { medicinalproduct.getName().get(i0).addNamePart(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getName().get(i0).getNamePart().get(i1).setPart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_Nm_NmPart_Typ_Cd ********************************************************************************/
		if(m.getMdcnlPrdctNmNmPartTypCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctNmNmPartTypCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getName().size() < i0+1) { medicinalproduct.addName(); }
				String[] arrayi1 = m.getMdcnlPrdctNmNmPartTypCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getName().get(i0).getNamePart().size() < i1+1) { medicinalproduct.getName().get(i0).addNamePart(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getName().get(i0).getNamePart().get(i1).getType().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_Nm_NmPart_Typ_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctNmNmPartTypDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctNmNmPartTypDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getName().size() < i0+1) { medicinalproduct.addName(); }
				String[] arrayi1 = m.getMdcnlPrdctNmNmPartTypDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getName().get(i0).getNamePart().size() < i1+1) { medicinalproduct.getName().get(i0).addNamePart(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getName().get(i0).getNamePart().get(i1).getType().setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_Nm_NmPart_Typ_Sys ********************************************************************************/
		if(m.getMdcnlPrdctNmNmPartTypSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctNmNmPartTypSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getName().size() < i0+1) { medicinalproduct.addName(); }
				String[] arrayi1 = m.getMdcnlPrdctNmNmPartTypSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getName().get(i0).getNamePart().size() < i1+1) { medicinalproduct.getName().get(i0).addNamePart(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getName().get(i0).getNamePart().get(i1).getType().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_Nm_NmPart_Typ_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctNmNmPartTypUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctNmNmPartTypUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getName().size() < i0+1) { medicinalproduct.addName(); }
				String[] arrayi1 = m.getMdcnlPrdctNmNmPartTypUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getName().get(i0).getNamePart().size() < i1+1) { medicinalproduct.getName().get(i0).addNamePart(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getName().get(i0).getNamePart().get(i1).getType().setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdct_Nm_NmPart_Typ_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctNmNmPartTypVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctNmNmPartTypVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getName().size() < i0+1) { medicinalproduct.addName(); }
				String[] arrayi1 = m.getMdcnlPrdctNmNmPartTypVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getName().get(i0).getNamePart().size() < i1+1) { medicinalproduct.getName().get(i0).addNamePart(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getName().get(i0).getNamePart().get(i1).getType().setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_Nm_PrdctNm ********************************************************************************/
		if(m.getMdcnlPrdctNmPrdctNm() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctNmPrdctNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getName().size() < i0+1) { medicinalproduct.addName(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getName().get(i0).setProductName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_PckgedMdcnlPrdct ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMdcnlPrdct() != null ) {

				for( String currListStrSplit : m.getMdcnlPrdctPckgedMdcnlPrdct().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicinalproduct.addPackagedMedicinalProduct(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdcnlPrdct_PaediatricUseIndicator_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPaediatricUseIndicatorCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPaediatricUseIndicatorCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getPaediatricUseIndicator().getCoding().size() < i0+1) { medicinalproduct.getPaediatricUseIndicator().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getPaediatricUseIndicator().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_PaediatricUseIndicator_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPaediatricUseIndicatorCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPaediatricUseIndicatorCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getPaediatricUseIndicator().getCoding().size() < i0+1) { medicinalproduct.getPaediatricUseIndicator().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getPaediatricUseIndicator().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_PaediatricUseIndicator_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPaediatricUseIndicatorCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPaediatricUseIndicatorCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getPaediatricUseIndicator().getCoding().size() < i0+1) { medicinalproduct.getPaediatricUseIndicator().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getPaediatricUseIndicator().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_PaediatricUseIndicator_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPaediatricUseIndicatorCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPaediatricUseIndicatorCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getPaediatricUseIndicator().getCoding().size() < i0+1) { medicinalproduct.getPaediatricUseIndicator().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getPaediatricUseIndicator().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdct_PaediatricUseIndicator_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPaediatricUseIndicatorCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPaediatricUseIndicatorCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getPaediatricUseIndicator().getCoding().size() < i0+1) { medicinalproduct.getPaediatricUseIndicator().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getPaediatricUseIndicator().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_PaediatricUseIndicator_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPaediatricUseIndicatorTxt() != null ) {

			if(m.getMdcnlPrdctPaediatricUseIndicatorTxt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctPaediatricUseIndicatorTxt()==null) {} else {
			medicinalproduct.getPaediatricUseIndicator().setText(m.getMdcnlPrdctPaediatricUseIndicatorTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdct_PhrmctclPrdct ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclPrdct() != null ) {

				for( String currListStrSplit : m.getMdcnlPrdctPhrmctclPrdct().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicinalproduct.addPharmaceuticalProduct(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdcnlPrdct_PrdctClsfctn_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPrdctClsfctnCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPrdctClsfctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getProductClassification().size() < i0+1) { medicinalproduct.addProductClassification(); }
				String[] arrayi1 = m.getMdcnlPrdctPrdctClsfctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getProductClassification().get(i0).getCoding().size() < i1+1) { medicinalproduct.getProductClassification().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getProductClassification().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_PrdctClsfctn_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPrdctClsfctnCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPrdctClsfctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getProductClassification().size() < i0+1) { medicinalproduct.addProductClassification(); }
				String[] arrayi1 = m.getMdcnlPrdctPrdctClsfctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getProductClassification().get(i0).getCoding().size() < i1+1) { medicinalproduct.getProductClassification().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getProductClassification().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_PrdctClsfctn_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPrdctClsfctnCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPrdctClsfctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getProductClassification().size() < i0+1) { medicinalproduct.addProductClassification(); }
				String[] arrayi1 = m.getMdcnlPrdctPrdctClsfctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getProductClassification().get(i0).getCoding().size() < i1+1) { medicinalproduct.getProductClassification().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getProductClassification().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_PrdctClsfctn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPrdctClsfctnCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPrdctClsfctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getProductClassification().size() < i0+1) { medicinalproduct.addProductClassification(); }
				String[] arrayi1 = m.getMdcnlPrdctPrdctClsfctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getProductClassification().get(i0).getCoding().size() < i1+1) { medicinalproduct.getProductClassification().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getProductClassification().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdct_PrdctClsfctn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPrdctClsfctnCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPrdctClsfctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getProductClassification().size() < i0+1) { medicinalproduct.addProductClassification(); }
				String[] arrayi1 = m.getMdcnlPrdctPrdctClsfctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getProductClassification().get(i0).getCoding().size() < i1+1) { medicinalproduct.getProductClassification().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getProductClassification().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_PrdctClsfctn_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPrdctClsfctnTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPrdctClsfctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getProductClassification().size() < i0+1) { medicinalproduct.addProductClassification(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getProductClassification().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_Dt ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationDt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationDt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).setDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_Id_Assigner ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIdAssigner() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getIdentifier().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getIdentifier().get(i1).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_Id_Prd_End ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIdPrdEnd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getIdentifier().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getIdentifier().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_Id_Prd_Strt ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIdPrdStrt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getIdentifier().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getIdentifier().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_Id_Sys ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIdSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getIdentifier().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getIdentifier().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIdTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getIdentifier().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).addIdentifier(); }
					String[] arrayi2 = m.getMdcnlPrdctSpclDsgnationIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproduct.getSpecialDesignation().get(i0).getIdentifier().get(i1).getType().getCoding().size() < i2+1) { medicinalproduct.getSpecialDesignation().get(i0).getIdentifier().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getIdentifier().get(i1).getType().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIdTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getIdentifier().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).addIdentifier(); }
					String[] arrayi2 = m.getMdcnlPrdctSpclDsgnationIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproduct.getSpecialDesignation().get(i0).getIdentifier().get(i1).getType().getCoding().size() < i2+1) { medicinalproduct.getSpecialDesignation().get(i0).getIdentifier().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getIdentifier().get(i1).getType().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIdTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getIdentifier().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).addIdentifier(); }
					String[] arrayi2 = m.getMdcnlPrdctSpclDsgnationIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproduct.getSpecialDesignation().get(i0).getIdentifier().get(i1).getType().getCoding().size() < i2+1) { medicinalproduct.getSpecialDesignation().get(i0).getIdentifier().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getIdentifier().get(i1).getType().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getIdentifier().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).addIdentifier(); }
					String[] arrayi2 = m.getMdcnlPrdctSpclDsgnationIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproduct.getSpecialDesignation().get(i0).getIdentifier().get(i1).getType().getCoding().size() < i2+1) { medicinalproduct.getSpecialDesignation().get(i0).getIdentifier().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getIdentifier().get(i1).getType().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIdTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getIdentifier().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).addIdentifier(); }
					String[] arrayi2 = m.getMdcnlPrdctSpclDsgnationIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproduct.getSpecialDesignation().get(i0).getIdentifier().get(i1).getType().getCoding().size() < i2+1) { medicinalproduct.getSpecialDesignation().get(i0).getIdentifier().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getIdentifier().get(i1).getType().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_Id_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIdTypTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getIdentifier().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getIdentifier().get(i1).getType().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_Id_Use ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIdUse() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getIdentifier().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getIdentifier().get(i1).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_Id_Vl ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIdVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getIdentifier().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getIdentifier().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_IndctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getIndicationCodeableConcept().getCoding().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).getIndicationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getIndicationCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_IndctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getIndicationCodeableConcept().getCoding().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).getIndicationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getIndicationCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_IndctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getIndicationCodeableConcept().getCoding().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).getIndicationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getIndicationCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_IndctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getIndicationCodeableConcept().getCoding().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).getIndicationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getIndicationCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_IndctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getIndicationCodeableConcept().getCoding().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).getIndicationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getIndicationCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_IndctnCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIndctnCdbleCncptTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationIndctnCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getIndicationCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_IndctnRfrnc ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIndctnRfrnc() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationIndctnRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).setIndication(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_IntendedUse_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIntendedUseCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationIntendedUseCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationIntendedUseCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getIntendedUse().getCoding().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).getIntendedUse().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getIntendedUse().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_IntendedUse_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIntendedUseCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationIntendedUseCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationIntendedUseCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getIntendedUse().getCoding().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).getIntendedUse().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getIntendedUse().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_IntendedUse_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIntendedUseCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationIntendedUseCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationIntendedUseCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getIntendedUse().getCoding().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).getIntendedUse().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getIntendedUse().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_IntendedUse_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIntendedUseCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationIntendedUseCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationIntendedUseCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getIntendedUse().getCoding().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).getIntendedUse().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getIntendedUse().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_IntendedUse_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIntendedUseCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationIntendedUseCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationIntendedUseCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getIntendedUse().getCoding().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).getIntendedUse().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getIntendedUse().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_IntendedUse_Txt ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIntendedUseTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationIntendedUseTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getIntendedUse().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_Spcs_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationSpcsCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationSpcsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationSpcsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getSpecies().getCoding().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).getSpecies().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getSpecies().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_Spcs_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationSpcsCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationSpcsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationSpcsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getSpecies().getCoding().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).getSpecies().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getSpecies().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_Spcs_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationSpcsCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationSpcsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationSpcsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getSpecies().getCoding().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).getSpecies().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getSpecies().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_Spcs_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationSpcsCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationSpcsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationSpcsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getSpecies().getCoding().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).getSpecies().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getSpecies().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_Spcs_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationSpcsCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationSpcsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationSpcsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getSpecies().getCoding().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).getSpecies().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getSpecies().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_Spcs_Txt ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationSpcsTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationSpcsTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getSpecies().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_Sts_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationStsCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationStsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationStsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getStatus().getCoding().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).getStatus().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getStatus().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_Sts_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationStsCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationStsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationStsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getStatus().getCoding().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).getStatus().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getStatus().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_Sts_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationStsCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationStsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationStsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getStatus().getCoding().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).getStatus().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getStatus().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_Sts_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationStsCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationStsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationStsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getStatus().getCoding().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).getStatus().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getStatus().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_Sts_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationStsCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationStsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationStsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getStatus().getCoding().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).getStatus().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getStatus().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_Sts_Txt ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationStsTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationStsTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getStatus().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getType().getCoding().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getType().getCoding().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getType().getCoding().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getType().getCoding().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				String[] arrayi1 = m.getMdcnlPrdctSpclDsgnationTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproduct.getSpecialDesignation().get(i0).getType().getCoding().size() < i1+1) { medicinalproduct.getSpecialDesignation().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdct_SpclDsgnation_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationTypTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctSpclDsgnationTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getSpecialDesignation().size() < i0+1) { medicinalproduct.addSpecialDesignation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getSpecialDesignation().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_SpclMsrs ********************************************************************************/
		if(m.getMdcnlPrdctSpclMsrs() != null ) {

				for( String currListStrSplit : m.getMdcnlPrdctSpclMsrs().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicinalproduct.addSpecialMeasures(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** MdcnlPrdct_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getType().getCoding().size() < i0+1) { medicinalproduct.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getType().getCoding().size() < i0+1) { medicinalproduct.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getType().getCoding().size() < i0+1) { medicinalproduct.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getType().getCoding().size() < i0+1) { medicinalproduct.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdct_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproduct.getType().getCoding().size() < i0+1) { medicinalproduct.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproduct.getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdct_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctTypTxt() != null ) {

			if(m.getMdcnlPrdctTypTxt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctTypTxt()==null) {} else {
			medicinalproduct.getType().setText(m.getMdcnlPrdctTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return medicinalproduct;
	}
}
