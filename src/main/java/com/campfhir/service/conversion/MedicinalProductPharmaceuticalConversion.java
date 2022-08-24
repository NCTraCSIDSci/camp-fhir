package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProductPharmaceutical;
public class MedicinalProductPharmaceuticalConversion 
{
	public org.hl7.fhir.r4.model.MedicinalProductPharmaceutical MedicinalProductPharmaceuticals(MedicinalProductPharmaceutical m) throws ParseException
	{
		org.hl7.fhir.r4.model.MedicinalProductPharmaceutical medicinalproductpharmaceutical = new org.hl7.fhir.r4.model.MedicinalProductPharmaceutical();

		/******************** id ********************************************************************************/
		medicinalproductpharmaceutical.setId(m.getId());

		/******************** MdcnlPrdctPhrmctcl_AdministrableDoseFrm_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclAdministrableDoseFrmCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclAdministrableDoseFrmCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getAdministrableDoseForm().getCoding().size() < i0+1) { medicinalproductpharmaceutical.getAdministrableDoseForm().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getAdministrableDoseForm().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_AdministrableDoseFrm_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclAdministrableDoseFrmCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclAdministrableDoseFrmCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getAdministrableDoseForm().getCoding().size() < i0+1) { medicinalproductpharmaceutical.getAdministrableDoseForm().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getAdministrableDoseForm().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_AdministrableDoseFrm_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclAdministrableDoseFrmCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclAdministrableDoseFrmCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getAdministrableDoseForm().getCoding().size() < i0+1) { medicinalproductpharmaceutical.getAdministrableDoseForm().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getAdministrableDoseForm().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_AdministrableDoseFrm_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclAdministrableDoseFrmCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclAdministrableDoseFrmCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getAdministrableDoseForm().getCoding().size() < i0+1) { medicinalproductpharmaceutical.getAdministrableDoseForm().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getAdministrableDoseForm().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_AdministrableDoseFrm_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclAdministrableDoseFrmCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclAdministrableDoseFrmCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getAdministrableDoseForm().getCoding().size() < i0+1) { medicinalproductpharmaceutical.getAdministrableDoseForm().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getAdministrableDoseForm().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_AdministrableDoseFrm_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclAdministrableDoseFrmTxt() != null ) {

			if(m.getMdcnlPrdctPhrmctclAdministrableDoseFrmTxt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctPhrmctclAdministrableDoseFrmTxt()==null) {} else {
			medicinalproductpharmaceutical.getAdministrableDoseForm().setText(m.getMdcnlPrdctPhrmctclAdministrableDoseFrmTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclCrctrstcsCdCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclCrctrstcsCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getCharacteristics().size() < i0+1) { medicinalproductpharmaceutical.addCharacteristics(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclCrctrstcsCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getCharacteristics().get(i0).getCode().getCoding().size() < i1+1) { medicinalproductpharmaceutical.getCharacteristics().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpharmaceutical.getCharacteristics().get(i0).getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclCrctrstcsCdCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclCrctrstcsCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getCharacteristics().size() < i0+1) { medicinalproductpharmaceutical.addCharacteristics(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclCrctrstcsCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getCharacteristics().get(i0).getCode().getCoding().size() < i1+1) { medicinalproductpharmaceutical.getCharacteristics().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpharmaceutical.getCharacteristics().get(i0).getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclCrctrstcsCdCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclCrctrstcsCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getCharacteristics().size() < i0+1) { medicinalproductpharmaceutical.addCharacteristics(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclCrctrstcsCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getCharacteristics().get(i0).getCode().getCoding().size() < i1+1) { medicinalproductpharmaceutical.getCharacteristics().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpharmaceutical.getCharacteristics().get(i0).getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclCrctrstcsCdCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclCrctrstcsCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getCharacteristics().size() < i0+1) { medicinalproductpharmaceutical.addCharacteristics(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclCrctrstcsCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getCharacteristics().get(i0).getCode().getCoding().size() < i1+1) { medicinalproductpharmaceutical.getCharacteristics().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpharmaceutical.getCharacteristics().get(i0).getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclCrctrstcsCdCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclCrctrstcsCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getCharacteristics().size() < i0+1) { medicinalproductpharmaceutical.addCharacteristics(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclCrctrstcsCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getCharacteristics().get(i0).getCode().getCoding().size() < i1+1) { medicinalproductpharmaceutical.getCharacteristics().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpharmaceutical.getCharacteristics().get(i0).getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Cd_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclCrctrstcsCdTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclCrctrstcsCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getCharacteristics().size() < i0+1) { medicinalproductpharmaceutical.addCharacteristics(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getCharacteristics().get(i0).getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Sts_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclCrctrstcsStsCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclCrctrstcsStsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getCharacteristics().size() < i0+1) { medicinalproductpharmaceutical.addCharacteristics(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclCrctrstcsStsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getCharacteristics().get(i0).getStatus().getCoding().size() < i1+1) { medicinalproductpharmaceutical.getCharacteristics().get(i0).getStatus().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpharmaceutical.getCharacteristics().get(i0).getStatus().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Sts_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclCrctrstcsStsCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclCrctrstcsStsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getCharacteristics().size() < i0+1) { medicinalproductpharmaceutical.addCharacteristics(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclCrctrstcsStsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getCharacteristics().get(i0).getStatus().getCoding().size() < i1+1) { medicinalproductpharmaceutical.getCharacteristics().get(i0).getStatus().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpharmaceutical.getCharacteristics().get(i0).getStatus().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Sts_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclCrctrstcsStsCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclCrctrstcsStsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getCharacteristics().size() < i0+1) { medicinalproductpharmaceutical.addCharacteristics(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclCrctrstcsStsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getCharacteristics().get(i0).getStatus().getCoding().size() < i1+1) { medicinalproductpharmaceutical.getCharacteristics().get(i0).getStatus().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpharmaceutical.getCharacteristics().get(i0).getStatus().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Sts_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclCrctrstcsStsCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclCrctrstcsStsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getCharacteristics().size() < i0+1) { medicinalproductpharmaceutical.addCharacteristics(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclCrctrstcsStsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getCharacteristics().get(i0).getStatus().getCoding().size() < i1+1) { medicinalproductpharmaceutical.getCharacteristics().get(i0).getStatus().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpharmaceutical.getCharacteristics().get(i0).getStatus().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Sts_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclCrctrstcsStsCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclCrctrstcsStsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getCharacteristics().size() < i0+1) { medicinalproductpharmaceutical.addCharacteristics(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclCrctrstcsStsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getCharacteristics().get(i0).getStatus().getCoding().size() < i1+1) { medicinalproductpharmaceutical.getCharacteristics().get(i0).getStatus().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpharmaceutical.getCharacteristics().get(i0).getStatus().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Sts_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclCrctrstcsStsTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclCrctrstcsStsTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getCharacteristics().size() < i0+1) { medicinalproductpharmaceutical.addCharacteristics(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getCharacteristics().get(i0).getStatus().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_Dvc ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclDvc() != null ) {

				for( String currListStrSplit : m.getMdcnlPrdctPhrmctclDvc().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicinalproductpharmaceutical.addDevice(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdcnlPrdctPhrmctcl_Id_Assigner ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclIdAssigner() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getIdentifier().size() < i0+1) { medicinalproductpharmaceutical.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_Id_Prd_End ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclIdPrdEnd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getIdentifier().size() < i0+1) { medicinalproductpharmaceutical.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_Id_Prd_Strt ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclIdPrdStrt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getIdentifier().size() < i0+1) { medicinalproductpharmaceutical.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_Id_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclIdSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getIdentifier().size() < i0+1) { medicinalproductpharmaceutical.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclIdTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getIdentifier().size() < i0+1) { medicinalproductpharmaceutical.addIdentifier(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicinalproductpharmaceutical.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpharmaceutical.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclIdTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getIdentifier().size() < i0+1) { medicinalproductpharmaceutical.addIdentifier(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicinalproductpharmaceutical.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpharmaceutical.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclIdTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getIdentifier().size() < i0+1) { medicinalproductpharmaceutical.addIdentifier(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicinalproductpharmaceutical.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpharmaceutical.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getIdentifier().size() < i0+1) { medicinalproductpharmaceutical.addIdentifier(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicinalproductpharmaceutical.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpharmaceutical.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclIdTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getIdentifier().size() < i0+1) { medicinalproductpharmaceutical.addIdentifier(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicinalproductpharmaceutical.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpharmaceutical.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_Id_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclIdTypTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getIdentifier().size() < i0+1) { medicinalproductpharmaceutical.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_Id_Use ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclIdUse() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getIdentifier().size() < i0+1) { medicinalproductpharmaceutical.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_Id_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclIdVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getIdentifier().size() < i0+1) { medicinalproductpharmaceutical.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_Igrdnt ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclIgrdnt() != null ) {

				for( String currListStrSplit : m.getMdcnlPrdctPhrmctclIgrdnt().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicinalproductpharmaceutical.addIngredient(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getCode().getCoding().size() < i1+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getCode().getCoding().size() < i1+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getCode().getCoding().size() < i1+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getCode().getCoding().size() < i1+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getCode().getCoding().size() < i1+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_Cd_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnCdTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_FirstDose_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getFirstDose().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_FirstDose_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getFirstDose().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_FirstDose_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getFirstDose().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_FirstDose_Unt ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getFirstDose().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_FirstDose_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getFirstDose().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerDay_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDayCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDayCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getMaxDosePerDay().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerDay_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDayCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDayCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getMaxDosePerDay().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerDay_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDaySys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDaySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getMaxDosePerDay().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerDay_Unt ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDayUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDayUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getMaxDosePerDay().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerDay_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDayVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDayVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getMaxDosePerDay().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerTrtmntPrd_Dnmntr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getMaxDosePerTreatmentPeriod().getDenominator().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerTrtmntPrd_Dnmntr_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getMaxDosePerTreatmentPeriod().getDenominator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerTrtmntPrd_Dnmntr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getMaxDosePerTreatmentPeriod().getDenominator().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerTrtmntPrd_Dnmntr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getMaxDosePerTreatmentPeriod().getDenominator().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerTrtmntPrd_Dnmntr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getMaxDosePerTreatmentPeriod().getDenominator().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerTrtmntPrd_Nmrtr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getMaxDosePerTreatmentPeriod().getNumerator().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerTrtmntPrd_Nmrtr_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getMaxDosePerTreatmentPeriod().getNumerator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerTrtmntPrd_Nmrtr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getMaxDosePerTreatmentPeriod().getNumerator().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerTrtmntPrd_Nmrtr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getMaxDosePerTreatmentPeriod().getNumerator().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerTrtmntPrd_Nmrtr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getMaxDosePerTreatmentPeriod().getNumerator().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxSingleDose_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxSingleDoseCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxSingleDoseCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getMaxSingleDose().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxSingleDose_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxSingleDoseCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxSingleDoseCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getMaxSingleDose().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxSingleDose_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxSingleDoseSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxSingleDoseSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getMaxSingleDose().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxSingleDose_Unt ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxSingleDoseUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxSingleDoseUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getMaxSingleDose().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxSingleDose_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxSingleDoseVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxSingleDoseVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getMaxSingleDose().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxTrtmntPrd_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getMaxTreatmentPeriod().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxTrtmntPrd_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getMaxTreatmentPeriod().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxTrtmntPrd_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getMaxTreatmentPeriod().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxTrtmntPrd_Unt ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getMaxTreatmentPeriod().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxTrtmntPrd_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getMaxTreatmentPeriod().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().size() < i1+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies(); }
					String[] arrayi2 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getCode().getCoding().size() < i2+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getCode().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().size() < i1+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies(); }
					String[] arrayi2 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getCode().getCoding().size() < i2+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getCode().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().size() < i1+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies(); }
					String[] arrayi2 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getCode().getCoding().size() < i2+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getCode().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().size() < i1+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies(); }
					String[] arrayi2 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getCode().getCoding().size() < i2+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getCode().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().size() < i1+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies(); }
					String[] arrayi2 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getCode().getCoding().size() < i2+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getCode().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_Cd_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().size() < i1+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getCode().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_WthdrwlPrd_SprtingInfo ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdSprtingInfo() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdSprtingInfo().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdSprtingInfo().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().size() < i1+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies(); }
					String[] arrayi2 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdSprtingInfo().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getWithdrawalPeriod().size() < i2+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).addWithdrawalPeriod(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getWithdrawalPeriod().get(i2).setSupportingInformation(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_WthdrwlPrd_Tissue_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTissueCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTissueCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTissueCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().size() < i1+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies(); }
					String[] arrayi2 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTissueCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getWithdrawalPeriod().size() < i2+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).addWithdrawalPeriod(); }
						String[] arrayi3 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTissueCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getWithdrawalPeriod().get(i2).getTissue().getCoding().size() < i3+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getWithdrawalPeriod().get(i2).getTissue().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getWithdrawalPeriod().get(i2).getTissue().getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_WthdrwlPrd_Tssue_Cdg_Dsp ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTssueCdgDsp() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTssueCdgDsp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTssueCdgDsp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().size() < i1+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies(); }
					String[] arrayi2 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTssueCdgDsp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getWithdrawalPeriod().size() < i2+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).addWithdrawalPeriod(); }
						String[] arrayi3 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTssueCdgDsp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getWithdrawalPeriod().get(i2).getTissue().getCoding().size() < i3+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getWithdrawalPeriod().get(i2).getTissue().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getWithdrawalPeriod().get(i2).getTissue().getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_WthdrwlPrd_Tissue_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTissueCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTissueCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTissueCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().size() < i1+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies(); }
					String[] arrayi2 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTissueCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getWithdrawalPeriod().size() < i2+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).addWithdrawalPeriod(); }
						String[] arrayi3 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTissueCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getWithdrawalPeriod().get(i2).getTissue().getCoding().size() < i3+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getWithdrawalPeriod().get(i2).getTissue().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getWithdrawalPeriod().get(i2).getTissue().getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_WthdrwlPrd_Tssue_Cdg_US ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTssueCdgUs() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTssueCdgUs().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTssueCdgUs().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().size() < i1+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies(); }
					String[] arrayi2 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTssueCdgUs().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getWithdrawalPeriod().size() < i2+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).addWithdrawalPeriod(); }
						String[] arrayi3 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTssueCdgUs().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getWithdrawalPeriod().get(i2).getTissue().getCoding().size() < i3+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getWithdrawalPeriod().get(i2).getTissue().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getWithdrawalPeriod().get(i2).getTissue().getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_WthdrwlPrd_Tssue_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTssueCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTssueCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTssueCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().size() < i1+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies(); }
					String[] arrayi2 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTssueCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getWithdrawalPeriod().size() < i2+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).addWithdrawalPeriod(); }
						String[] arrayi3 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTssueCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getWithdrawalPeriod().get(i2).getTissue().getCoding().size() < i3+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getWithdrawalPeriod().get(i2).getTissue().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getWithdrawalPeriod().get(i2).getTissue().getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_WthdrwlPrd_Tissue_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTissueTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTissueTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTissueTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().size() < i1+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies(); }
					String[] arrayi2 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTissueTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getWithdrawalPeriod().size() < i2+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).addWithdrawalPeriod(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getWithdrawalPeriod().get(i2).getTissue().setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_WthdrwlPrd_Vl_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().size() < i1+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies(); }
					String[] arrayi2 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getWithdrawalPeriod().size() < i2+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).addWithdrawalPeriod(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getWithdrawalPeriod().get(i2).getValue().setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_WthdrwlPrd_Vl_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().size() < i1+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies(); }
					String[] arrayi2 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getWithdrawalPeriod().size() < i2+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).addWithdrawalPeriod(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getWithdrawalPeriod().get(i2).getValue().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_WthdrwlPrd_Vl_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().size() < i1+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies(); }
					String[] arrayi2 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getWithdrawalPeriod().size() < i2+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).addWithdrawalPeriod(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getWithdrawalPeriod().get(i2).getValue().setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_WthdrwlPrd_Vl_Unt ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().size() < i1+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies(); }
					String[] arrayi2 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getWithdrawalPeriod().size() < i2+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).addWithdrawalPeriod(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getWithdrawalPeriod().get(i2).getValue().setUnit(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_WthdrwlPrd_Vl_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getRouteOfAdministration().size() < i0+1) { medicinalproductpharmaceutical.addRouteOfAdministration(); }
				String[] arrayi1 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().size() < i1+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies(); }
					String[] arrayi2 = m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getWithdrawalPeriod().size() < i2+1) { medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).addWithdrawalPeriod(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductpharmaceutical.getRouteOfAdministration().get(i0).getTargetSpecies().get(i1).getWithdrawalPeriod().get(i2).getValue().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** MdcnlPrdctPhrmctcl_UntOfPrsnttn_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclUntOfPrsnttnCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclUntOfPrsnttnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getUnitOfPresentation().getCoding().size() < i0+1) { medicinalproductpharmaceutical.getUnitOfPresentation().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getUnitOfPresentation().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_UntOfPrsnttn_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclUntOfPrsnttnCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclUntOfPrsnttnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getUnitOfPresentation().getCoding().size() < i0+1) { medicinalproductpharmaceutical.getUnitOfPresentation().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getUnitOfPresentation().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_UntOfPrsnttn_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclUntOfPrsnttnCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclUntOfPrsnttnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getUnitOfPresentation().getCoding().size() < i0+1) { medicinalproductpharmaceutical.getUnitOfPresentation().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getUnitOfPresentation().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_UntOfPrsnttn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclUntOfPrsnttnCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclUntOfPrsnttnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getUnitOfPresentation().getCoding().size() < i0+1) { medicinalproductpharmaceutical.getUnitOfPresentation().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getUnitOfPresentation().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_UntOfPrsnttn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclUntOfPrsnttnCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctPhrmctclUntOfPrsnttnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductpharmaceutical.getUnitOfPresentation().getCoding().size() < i0+1) { medicinalproductpharmaceutical.getUnitOfPresentation().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductpharmaceutical.getUnitOfPresentation().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctPhrmctcl_UntOfPrsnttn_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclUntOfPrsnttnTxt() != null ) {

			if(m.getMdcnlPrdctPhrmctclUntOfPrsnttnTxt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctPhrmctclUntOfPrsnttnTxt()==null) {} else {
			medicinalproductpharmaceutical.getUnitOfPresentation().setText(m.getMdcnlPrdctPhrmctclUntOfPrsnttnTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return medicinalproductpharmaceutical;
	}
}
