package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProductContraindication;
public class MedicinalProductContraindicationConversion 
{
	public org.hl7.fhir.r4.model.MedicinalProductContraindication MedicinalProductContraindications(MedicinalProductContraindication m) throws ParseException
	{
		org.hl7.fhir.r4.model.MedicinalProductContraindication medicinalproductcontraindication = new org.hl7.fhir.r4.model.MedicinalProductContraindication();

		/******************** id ********************************************************************************/
		medicinalproductcontraindication.setId(m.getId());

		/******************** MdcnlPrdctCntraindctn_Comorbidity_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnComorbidityCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnComorbidityCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getComorbidity().size() < i0+1) { medicinalproductcontraindication.addComorbidity(); }
				String[] arrayi1 = m.getMdcnlPrdctCntraindctnComorbidityCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductcontraindication.getComorbidity().get(i0).getCoding().size() < i1+1) { medicinalproductcontraindication.getComorbidity().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductcontraindication.getComorbidity().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctCntraindctn_Comorbidity_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnComorbidityCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnComorbidityCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getComorbidity().size() < i0+1) { medicinalproductcontraindication.addComorbidity(); }
				String[] arrayi1 = m.getMdcnlPrdctCntraindctnComorbidityCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductcontraindication.getComorbidity().get(i0).getCoding().size() < i1+1) { medicinalproductcontraindication.getComorbidity().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductcontraindication.getComorbidity().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctCntraindctn_Comorbidity_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnComorbidityCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnComorbidityCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getComorbidity().size() < i0+1) { medicinalproductcontraindication.addComorbidity(); }
				String[] arrayi1 = m.getMdcnlPrdctCntraindctnComorbidityCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductcontraindication.getComorbidity().get(i0).getCoding().size() < i1+1) { medicinalproductcontraindication.getComorbidity().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductcontraindication.getComorbidity().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctCntraindctn_Comorbidity_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnComorbidityCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnComorbidityCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getComorbidity().size() < i0+1) { medicinalproductcontraindication.addComorbidity(); }
				String[] arrayi1 = m.getMdcnlPrdctCntraindctnComorbidityCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductcontraindication.getComorbidity().get(i0).getCoding().size() < i1+1) { medicinalproductcontraindication.getComorbidity().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductcontraindication.getComorbidity().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctCntraindctn_Comorbidity_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnComorbidityCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnComorbidityCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getComorbidity().size() < i0+1) { medicinalproductcontraindication.addComorbidity(); }
				String[] arrayi1 = m.getMdcnlPrdctCntraindctnComorbidityCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductcontraindication.getComorbidity().get(i0).getCoding().size() < i1+1) { medicinalproductcontraindication.getComorbidity().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductcontraindication.getComorbidity().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctCntraindctn_Comorbidity_Txt ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnComorbidityTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnComorbidityTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getComorbidity().size() < i0+1) { medicinalproductcontraindication.addComorbidity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductcontraindication.getComorbidity().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctCntraindctn_Disease_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnDiseaseCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnDiseaseCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getDisease().getCoding().size() < i0+1) { medicinalproductcontraindication.getDisease().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductcontraindication.getDisease().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctCntraindctn_Disease_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnDiseaseCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnDiseaseCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getDisease().getCoding().size() < i0+1) { medicinalproductcontraindication.getDisease().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductcontraindication.getDisease().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctCntraindctn_Disease_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnDiseaseCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnDiseaseCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getDisease().getCoding().size() < i0+1) { medicinalproductcontraindication.getDisease().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductcontraindication.getDisease().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctCntraindctn_Disease_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnDiseaseCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnDiseaseCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getDisease().getCoding().size() < i0+1) { medicinalproductcontraindication.getDisease().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductcontraindication.getDisease().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctCntraindctn_Disease_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnDiseaseCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnDiseaseCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getDisease().getCoding().size() < i0+1) { medicinalproductcontraindication.getDisease().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductcontraindication.getDisease().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctCntraindctn_Disease_Txt ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnDiseaseTxt() != null ) {

			if(m.getMdcnlPrdctCntraindctnDiseaseTxt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctCntraindctnDiseaseTxt()==null) {} else {
			medicinalproductcontraindication.getDisease().setText(m.getMdcnlPrdctCntraindctnDiseaseTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctCntraindctn_DiseaseSts_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnDiseaseStsCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnDiseaseStsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getDiseaseStatus().getCoding().size() < i0+1) { medicinalproductcontraindication.getDiseaseStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductcontraindication.getDiseaseStatus().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctCntraindctn_DiseaseSts_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnDiseaseStsCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnDiseaseStsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getDiseaseStatus().getCoding().size() < i0+1) { medicinalproductcontraindication.getDiseaseStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductcontraindication.getDiseaseStatus().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctCntraindctn_DiseaseSts_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnDiseaseStsCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnDiseaseStsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getDiseaseStatus().getCoding().size() < i0+1) { medicinalproductcontraindication.getDiseaseStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductcontraindication.getDiseaseStatus().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctCntraindctn_DiseaseSts_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnDiseaseStsCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnDiseaseStsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getDiseaseStatus().getCoding().size() < i0+1) { medicinalproductcontraindication.getDiseaseStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductcontraindication.getDiseaseStatus().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctCntraindctn_DiseaseSts_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnDiseaseStsCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnDiseaseStsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getDiseaseStatus().getCoding().size() < i0+1) { medicinalproductcontraindication.getDiseaseStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductcontraindication.getDiseaseStatus().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctCntraindctn_DiseaseSts_Txt ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnDiseaseStsTxt() != null ) {

			if(m.getMdcnlPrdctCntraindctnDiseaseStsTxt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctCntraindctnDiseaseStsTxt()==null) {} else {
			medicinalproductcontraindication.getDiseaseStatus().setText(m.getMdcnlPrdctCntraindctnDiseaseStsTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctCntraindctn_OtherThrpy_MdctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getOtherTherapy().size() < i0+1) { medicinalproductcontraindication.addOtherTherapy(); }
				String[] arrayi1 = m.getMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductcontraindication.getOtherTherapy().get(i0).getMedicationCodeableConcept().getCoding().size() < i1+1) { medicinalproductcontraindication.getOtherTherapy().get(i0).getMedicationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductcontraindication.getOtherTherapy().get(i0).getMedicationCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctCntraindctn_OtherThrpy_MdctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getOtherTherapy().size() < i0+1) { medicinalproductcontraindication.addOtherTherapy(); }
				String[] arrayi1 = m.getMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductcontraindication.getOtherTherapy().get(i0).getMedicationCodeableConcept().getCoding().size() < i1+1) { medicinalproductcontraindication.getOtherTherapy().get(i0).getMedicationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductcontraindication.getOtherTherapy().get(i0).getMedicationCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctCntraindctn_OtherThrpy_MdctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getOtherTherapy().size() < i0+1) { medicinalproductcontraindication.addOtherTherapy(); }
				String[] arrayi1 = m.getMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductcontraindication.getOtherTherapy().get(i0).getMedicationCodeableConcept().getCoding().size() < i1+1) { medicinalproductcontraindication.getOtherTherapy().get(i0).getMedicationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductcontraindication.getOtherTherapy().get(i0).getMedicationCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctCntraindctn_OtherThrpy_MdctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getOtherTherapy().size() < i0+1) { medicinalproductcontraindication.addOtherTherapy(); }
				String[] arrayi1 = m.getMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductcontraindication.getOtherTherapy().get(i0).getMedicationCodeableConcept().getCoding().size() < i1+1) { medicinalproductcontraindication.getOtherTherapy().get(i0).getMedicationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductcontraindication.getOtherTherapy().get(i0).getMedicationCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctCntraindctn_OtherThrpy_MdctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getOtherTherapy().size() < i0+1) { medicinalproductcontraindication.addOtherTherapy(); }
				String[] arrayi1 = m.getMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductcontraindication.getOtherTherapy().get(i0).getMedicationCodeableConcept().getCoding().size() < i1+1) { medicinalproductcontraindication.getOtherTherapy().get(i0).getMedicationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductcontraindication.getOtherTherapy().get(i0).getMedicationCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctCntraindctn_OtherThrpy_MdctnCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnOtherThrpyMdctnCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getOtherTherapy().size() < i0+1) { medicinalproductcontraindication.addOtherTherapy(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductcontraindication.getOtherTherapy().get(i0).getMedicationCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctCntraindctn_OtherThrpy_MdctnRfrnc ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnOtherThrpyMdctnRfrnc() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnOtherThrpyMdctnRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getOtherTherapy().size() < i0+1) { medicinalproductcontraindication.addOtherTherapy(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductcontraindication.getOtherTherapy().get(i0).setMedication(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctCntraindctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getOtherTherapy().size() < i0+1) { medicinalproductcontraindication.addOtherTherapy(); }
				String[] arrayi1 = m.getMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductcontraindication.getOtherTherapy().get(i0).getTherapyRelationshipType().getCoding().size() < i1+1) { medicinalproductcontraindication.getOtherTherapy().get(i0).getTherapyRelationshipType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductcontraindication.getOtherTherapy().get(i0).getTherapyRelationshipType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctCntraindctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getOtherTherapy().size() < i0+1) { medicinalproductcontraindication.addOtherTherapy(); }
				String[] arrayi1 = m.getMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductcontraindication.getOtherTherapy().get(i0).getTherapyRelationshipType().getCoding().size() < i1+1) { medicinalproductcontraindication.getOtherTherapy().get(i0).getTherapyRelationshipType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductcontraindication.getOtherTherapy().get(i0).getTherapyRelationshipType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctCntraindctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getOtherTherapy().size() < i0+1) { medicinalproductcontraindication.addOtherTherapy(); }
				String[] arrayi1 = m.getMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductcontraindication.getOtherTherapy().get(i0).getTherapyRelationshipType().getCoding().size() < i1+1) { medicinalproductcontraindication.getOtherTherapy().get(i0).getTherapyRelationshipType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductcontraindication.getOtherTherapy().get(i0).getTherapyRelationshipType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctCntraindctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getOtherTherapy().size() < i0+1) { medicinalproductcontraindication.addOtherTherapy(); }
				String[] arrayi1 = m.getMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductcontraindication.getOtherTherapy().get(i0).getTherapyRelationshipType().getCoding().size() < i1+1) { medicinalproductcontraindication.getOtherTherapy().get(i0).getTherapyRelationshipType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductcontraindication.getOtherTherapy().get(i0).getTherapyRelationshipType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctCntraindctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getOtherTherapy().size() < i0+1) { medicinalproductcontraindication.addOtherTherapy(); }
				String[] arrayi1 = m.getMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductcontraindication.getOtherTherapy().get(i0).getTherapyRelationshipType().getCoding().size() < i1+1) { medicinalproductcontraindication.getOtherTherapy().get(i0).getTherapyRelationshipType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductcontraindication.getOtherTherapy().get(i0).getTherapyRelationshipType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctCntraindctn_OtherThrpy_ThrpyRltnshipTyp_Txt ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnOtherThrpyThrpyRltnshipTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getOtherTherapy().size() < i0+1) { medicinalproductcontraindication.addOtherTherapy(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductcontraindication.getOtherTherapy().get(i0).getTherapyRelationshipType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctCntraindctn_Popln_AgeCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getPopulation().size() < i0+1) { medicinalproductcontraindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductcontraindication.getPopulation().get(i0).getAgeCodeableConcept().getCoding().size() < i1+1) { medicinalproductcontraindication.getPopulation().get(i0).getAgeCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductcontraindication.getPopulation().get(i0).getAgeCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctCntraindctn_Popln_AgeCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getPopulation().size() < i0+1) { medicinalproductcontraindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductcontraindication.getPopulation().get(i0).getAgeCodeableConcept().getCoding().size() < i1+1) { medicinalproductcontraindication.getPopulation().get(i0).getAgeCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductcontraindication.getPopulation().get(i0).getAgeCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctCntraindctn_Popln_AgeCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getPopulation().size() < i0+1) { medicinalproductcontraindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductcontraindication.getPopulation().get(i0).getAgeCodeableConcept().getCoding().size() < i1+1) { medicinalproductcontraindication.getPopulation().get(i0).getAgeCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductcontraindication.getPopulation().get(i0).getAgeCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctCntraindctn_Popln_AgeCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getPopulation().size() < i0+1) { medicinalproductcontraindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductcontraindication.getPopulation().get(i0).getAgeCodeableConcept().getCoding().size() < i1+1) { medicinalproductcontraindication.getPopulation().get(i0).getAgeCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductcontraindication.getPopulation().get(i0).getAgeCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctCntraindctn_Popln_AgeCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getPopulation().size() < i0+1) { medicinalproductcontraindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctCntraindctnPoplnAgeCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductcontraindication.getPopulation().get(i0).getAgeCodeableConcept().getCoding().size() < i1+1) { medicinalproductcontraindication.getPopulation().get(i0).getAgeCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductcontraindication.getPopulation().get(i0).getAgeCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctCntraindctn_Popln_AgeCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnAgeCdbleCncptTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnPoplnAgeCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getPopulation().size() < i0+1) { medicinalproductcontraindication.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductcontraindication.getPopulation().get(i0).getAgeCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctCntraindctn_Popln_AgeRng_Hi_Cd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnAgeRngHiCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnPoplnAgeRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getPopulation().size() < i0+1) { medicinalproductcontraindication.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductcontraindication.getPopulation().get(i0).getAgeRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctCntraindctn_Popln_AgeRng_Hi_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnAgeRngHiCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnPoplnAgeRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getPopulation().size() < i0+1) { medicinalproductcontraindication.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductcontraindication.getPopulation().get(i0).getAgeRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctCntraindctn_Popln_AgeRng_Hi_Sys ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnAgeRngHiSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnPoplnAgeRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getPopulation().size() < i0+1) { medicinalproductcontraindication.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductcontraindication.getPopulation().get(i0).getAgeRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctCntraindctn_Popln_AgeRng_Hi_Unt ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnAgeRngHiUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnPoplnAgeRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getPopulation().size() < i0+1) { medicinalproductcontraindication.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductcontraindication.getPopulation().get(i0).getAgeRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctCntraindctn_Popln_AgeRng_Hi_Vl ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnAgeRngHiVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnPoplnAgeRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getPopulation().size() < i0+1) { medicinalproductcontraindication.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductcontraindication.getPopulation().get(i0).getAgeRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdcnlPrdctCntraindctn_Popln_AgeRng_Lw_Cd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnAgeRngLwCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnPoplnAgeRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getPopulation().size() < i0+1) { medicinalproductcontraindication.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductcontraindication.getPopulation().get(i0).getAgeRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctCntraindctn_Popln_AgeRng_Lw_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnAgeRngLwCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnPoplnAgeRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getPopulation().size() < i0+1) { medicinalproductcontraindication.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductcontraindication.getPopulation().get(i0).getAgeRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctCntraindctn_Popln_AgeRng_Lw_Sys ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnAgeRngLwSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnPoplnAgeRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getPopulation().size() < i0+1) { medicinalproductcontraindication.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductcontraindication.getPopulation().get(i0).getAgeRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctCntraindctn_Popln_AgeRng_Lw_Unt ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnAgeRngLwUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnPoplnAgeRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getPopulation().size() < i0+1) { medicinalproductcontraindication.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductcontraindication.getPopulation().get(i0).getAgeRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctCntraindctn_Popln_AgeRng_Lw_Vl ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnAgeRngLwVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnPoplnAgeRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getPopulation().size() < i0+1) { medicinalproductcontraindication.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductcontraindication.getPopulation().get(i0).getAgeRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdcnlPrdctCntraindctn_Popln_Gender_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnGenderCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnPoplnGenderCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getPopulation().size() < i0+1) { medicinalproductcontraindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctCntraindctnPoplnGenderCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductcontraindication.getPopulation().get(i0).getGender().getCoding().size() < i1+1) { medicinalproductcontraindication.getPopulation().get(i0).getGender().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductcontraindication.getPopulation().get(i0).getGender().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctCntraindctn_Popln_Gender_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnGenderCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnPoplnGenderCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getPopulation().size() < i0+1) { medicinalproductcontraindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctCntraindctnPoplnGenderCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductcontraindication.getPopulation().get(i0).getGender().getCoding().size() < i1+1) { medicinalproductcontraindication.getPopulation().get(i0).getGender().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductcontraindication.getPopulation().get(i0).getGender().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctCntraindctn_Popln_Gender_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnGenderCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnPoplnGenderCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getPopulation().size() < i0+1) { medicinalproductcontraindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctCntraindctnPoplnGenderCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductcontraindication.getPopulation().get(i0).getGender().getCoding().size() < i1+1) { medicinalproductcontraindication.getPopulation().get(i0).getGender().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductcontraindication.getPopulation().get(i0).getGender().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctCntraindctn_Popln_Gender_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnGenderCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnPoplnGenderCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getPopulation().size() < i0+1) { medicinalproductcontraindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctCntraindctnPoplnGenderCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductcontraindication.getPopulation().get(i0).getGender().getCoding().size() < i1+1) { medicinalproductcontraindication.getPopulation().get(i0).getGender().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductcontraindication.getPopulation().get(i0).getGender().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctCntraindctn_Popln_Gender_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnGenderCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnPoplnGenderCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getPopulation().size() < i0+1) { medicinalproductcontraindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctCntraindctnPoplnGenderCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductcontraindication.getPopulation().get(i0).getGender().getCoding().size() < i1+1) { medicinalproductcontraindication.getPopulation().get(i0).getGender().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductcontraindication.getPopulation().get(i0).getGender().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctCntraindctn_Popln_Gender_Txt ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnGenderTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnPoplnGenderTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getPopulation().size() < i0+1) { medicinalproductcontraindication.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductcontraindication.getPopulation().get(i0).getGender().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctCntraindctn_Popln_PhysiologicalCndtn_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getPopulation().size() < i0+1) { medicinalproductcontraindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductcontraindication.getPopulation().get(i0).getPhysiologicalCondition().getCoding().size() < i1+1) { medicinalproductcontraindication.getPopulation().get(i0).getPhysiologicalCondition().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductcontraindication.getPopulation().get(i0).getPhysiologicalCondition().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctCntraindctn_Popln_PhysiologicalCndtn_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getPopulation().size() < i0+1) { medicinalproductcontraindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductcontraindication.getPopulation().get(i0).getPhysiologicalCondition().getCoding().size() < i1+1) { medicinalproductcontraindication.getPopulation().get(i0).getPhysiologicalCondition().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductcontraindication.getPopulation().get(i0).getPhysiologicalCondition().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctCntraindctn_Popln_PhysiologicalCndtn_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getPopulation().size() < i0+1) { medicinalproductcontraindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductcontraindication.getPopulation().get(i0).getPhysiologicalCondition().getCoding().size() < i1+1) { medicinalproductcontraindication.getPopulation().get(i0).getPhysiologicalCondition().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductcontraindication.getPopulation().get(i0).getPhysiologicalCondition().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctCntraindctn_Popln_PhysiologicalCndtn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getPopulation().size() < i0+1) { medicinalproductcontraindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductcontraindication.getPopulation().get(i0).getPhysiologicalCondition().getCoding().size() < i1+1) { medicinalproductcontraindication.getPopulation().get(i0).getPhysiologicalCondition().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductcontraindication.getPopulation().get(i0).getPhysiologicalCondition().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctCntraindctn_Popln_PhysiologicalCndtn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getPopulation().size() < i0+1) { medicinalproductcontraindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductcontraindication.getPopulation().get(i0).getPhysiologicalCondition().getCoding().size() < i1+1) { medicinalproductcontraindication.getPopulation().get(i0).getPhysiologicalCondition().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductcontraindication.getPopulation().get(i0).getPhysiologicalCondition().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctCntraindctn_Popln_PhysiologicalCndtn_Txt ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnPoplnPhysiologicalCndtnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getPopulation().size() < i0+1) { medicinalproductcontraindication.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductcontraindication.getPopulation().get(i0).getPhysiologicalCondition().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctCntraindctn_Popln_Race_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnRaceCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnPoplnRaceCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getPopulation().size() < i0+1) { medicinalproductcontraindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctCntraindctnPoplnRaceCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductcontraindication.getPopulation().get(i0).getRace().getCoding().size() < i1+1) { medicinalproductcontraindication.getPopulation().get(i0).getRace().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductcontraindication.getPopulation().get(i0).getRace().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctCntraindctn_Popln_Race_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnRaceCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnPoplnRaceCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getPopulation().size() < i0+1) { medicinalproductcontraindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctCntraindctnPoplnRaceCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductcontraindication.getPopulation().get(i0).getRace().getCoding().size() < i1+1) { medicinalproductcontraindication.getPopulation().get(i0).getRace().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductcontraindication.getPopulation().get(i0).getRace().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctCntraindctn_Popln_Race_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnRaceCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnPoplnRaceCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getPopulation().size() < i0+1) { medicinalproductcontraindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctCntraindctnPoplnRaceCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductcontraindication.getPopulation().get(i0).getRace().getCoding().size() < i1+1) { medicinalproductcontraindication.getPopulation().get(i0).getRace().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductcontraindication.getPopulation().get(i0).getRace().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctCntraindctn_Popln_Race_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnRaceCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnPoplnRaceCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getPopulation().size() < i0+1) { medicinalproductcontraindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctCntraindctnPoplnRaceCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductcontraindication.getPopulation().get(i0).getRace().getCoding().size() < i1+1) { medicinalproductcontraindication.getPopulation().get(i0).getRace().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductcontraindication.getPopulation().get(i0).getRace().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctCntraindctn_Popln_Race_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnRaceCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnPoplnRaceCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getPopulation().size() < i0+1) { medicinalproductcontraindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctCntraindctnPoplnRaceCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductcontraindication.getPopulation().get(i0).getRace().getCoding().size() < i1+1) { medicinalproductcontraindication.getPopulation().get(i0).getRace().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductcontraindication.getPopulation().get(i0).getRace().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctCntraindctn_Popln_Race_Txt ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnPoplnRaceTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctCntraindctnPoplnRaceTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductcontraindication.getPopulation().size() < i0+1) { medicinalproductcontraindication.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductcontraindication.getPopulation().get(i0).getRace().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctCntraindctn_Sbjct ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnSbjct() != null ) {

				for( String currListStrSplit : m.getMdcnlPrdctCntraindctnSbjct().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicinalproductcontraindication.addSubject(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdcnlPrdctCntraindctn_TherapeuticIndctn ********************************************************************************/
		if(m.getMdcnlPrdctCntraindctnTherapeuticIndctn() != null ) {

				for( String currListStrSplit : m.getMdcnlPrdctCntraindctnTherapeuticIndctn().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicinalproductcontraindication.addTherapeuticIndication(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		return medicinalproductcontraindication;
	}
}
