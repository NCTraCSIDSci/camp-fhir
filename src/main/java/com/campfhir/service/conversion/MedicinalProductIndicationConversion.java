package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProductIndication;
public class MedicinalProductIndicationConversion 
{
	public org.hl7.fhir.r4.model.MedicinalProductIndication MedicinalProductIndications(MedicinalProductIndication m) throws ParseException
	{
		org.hl7.fhir.r4.model.MedicinalProductIndication medicinalproductindication = new org.hl7.fhir.r4.model.MedicinalProductIndication();

		/******************** id ********************************************************************************/
		medicinalproductindication.setId(m.getId());

		/******************** MdcnlPrdctIndctn_Comorbidity_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnComorbidityCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnComorbidityCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getComorbidity().size() < i0+1) { medicinalproductindication.addComorbidity(); }
				String[] arrayi1 = m.getMdcnlPrdctIndctnComorbidityCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductindication.getComorbidity().get(i0).getCoding().size() < i1+1) { medicinalproductindication.getComorbidity().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductindication.getComorbidity().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIndctn_Comorbidity_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIndctnComorbidityCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnComorbidityCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getComorbidity().size() < i0+1) { medicinalproductindication.addComorbidity(); }
				String[] arrayi1 = m.getMdcnlPrdctIndctnComorbidityCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductindication.getComorbidity().get(i0).getCoding().size() < i1+1) { medicinalproductindication.getComorbidity().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductindication.getComorbidity().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIndctn_Comorbidity_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIndctnComorbidityCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnComorbidityCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getComorbidity().size() < i0+1) { medicinalproductindication.addComorbidity(); }
				String[] arrayi1 = m.getMdcnlPrdctIndctnComorbidityCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductindication.getComorbidity().get(i0).getCoding().size() < i1+1) { medicinalproductindication.getComorbidity().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductindication.getComorbidity().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIndctn_Comorbidity_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnComorbidityCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnComorbidityCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getComorbidity().size() < i0+1) { medicinalproductindication.addComorbidity(); }
				String[] arrayi1 = m.getMdcnlPrdctIndctnComorbidityCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductindication.getComorbidity().get(i0).getCoding().size() < i1+1) { medicinalproductindication.getComorbidity().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductindication.getComorbidity().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctIndctn_Comorbidity_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIndctnComorbidityCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnComorbidityCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getComorbidity().size() < i0+1) { medicinalproductindication.addComorbidity(); }
				String[] arrayi1 = m.getMdcnlPrdctIndctnComorbidityCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductindication.getComorbidity().get(i0).getCoding().size() < i1+1) { medicinalproductindication.getComorbidity().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductindication.getComorbidity().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIndctn_Comorbidity_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIndctnComorbidityTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnComorbidityTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getComorbidity().size() < i0+1) { medicinalproductindication.addComorbidity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductindication.getComorbidity().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIndctn_DiseaseSts_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnDiseaseStsCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnDiseaseStsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getDiseaseStatus().getCoding().size() < i0+1) { medicinalproductindication.getDiseaseStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductindication.getDiseaseStatus().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIndctn_DiseaseSts_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIndctnDiseaseStsCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnDiseaseStsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getDiseaseStatus().getCoding().size() < i0+1) { medicinalproductindication.getDiseaseStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductindication.getDiseaseStatus().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIndctn_DiseaseSts_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIndctnDiseaseStsCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnDiseaseStsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getDiseaseStatus().getCoding().size() < i0+1) { medicinalproductindication.getDiseaseStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductindication.getDiseaseStatus().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIndctn_DiseaseSts_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnDiseaseStsCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnDiseaseStsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getDiseaseStatus().getCoding().size() < i0+1) { medicinalproductindication.getDiseaseStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductindication.getDiseaseStatus().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctIndctn_DiseaseSts_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIndctnDiseaseStsCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnDiseaseStsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getDiseaseStatus().getCoding().size() < i0+1) { medicinalproductindication.getDiseaseStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductindication.getDiseaseStatus().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIndctn_DiseaseSts_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIndctnDiseaseStsTxt() != null ) {

			if(m.getMdcnlPrdctIndctnDiseaseStsTxt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctIndctnDiseaseStsTxt()==null) {} else {
			medicinalproductindication.getDiseaseStatus().setText(m.getMdcnlPrdctIndctnDiseaseStsTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctIndctn_DiseaseSymptomPrcdr_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getDiseaseSymptomProcedure().getCoding().size() < i0+1) { medicinalproductindication.getDiseaseSymptomProcedure().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductindication.getDiseaseSymptomProcedure().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIndctn_DiseaseSymptomPrcdr_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getDiseaseSymptomProcedure().getCoding().size() < i0+1) { medicinalproductindication.getDiseaseSymptomProcedure().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductindication.getDiseaseSymptomProcedure().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIndctn_DiseaseSymptomPrcdr_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getDiseaseSymptomProcedure().getCoding().size() < i0+1) { medicinalproductindication.getDiseaseSymptomProcedure().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductindication.getDiseaseSymptomProcedure().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIndctn_DiseaseSymptomPrcdr_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getDiseaseSymptomProcedure().getCoding().size() < i0+1) { medicinalproductindication.getDiseaseSymptomProcedure().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductindication.getDiseaseSymptomProcedure().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctIndctn_DiseaseSymptomPrcdr_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnDiseaseSymptomPrcdrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getDiseaseSymptomProcedure().getCoding().size() < i0+1) { medicinalproductindication.getDiseaseSymptomProcedure().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductindication.getDiseaseSymptomProcedure().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIndctn_DiseaseSymptomPrcdr_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIndctnDiseaseSymptomPrcdrTxt() != null ) {

			if(m.getMdcnlPrdctIndctnDiseaseSymptomPrcdrTxt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctIndctnDiseaseSymptomPrcdrTxt()==null) {} else {
			medicinalproductindication.getDiseaseSymptomProcedure().setText(m.getMdcnlPrdctIndctnDiseaseSymptomPrcdrTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctIndctn_Duration_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnDurationCd() != null ) {

			if(m.getMdcnlPrdctIndctnDurationCd().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctIndctnDurationCd()==null) {} else {
			medicinalproductindication.getDuration().setCode(m.getMdcnlPrdctIndctnDurationCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctIndctn_Duration_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctIndctnDurationCmprtr() != null ) {

			if(m.getMdcnlPrdctIndctnDurationCmprtr().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctIndctnDurationCmprtr()==null) {} else {
			medicinalproductindication.getDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(m.getMdcnlPrdctIndctnDurationCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdcnlPrdctIndctn_Duration_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIndctnDurationSys() != null ) {

			if(m.getMdcnlPrdctIndctnDurationSys().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctIndctnDurationSys()==null) {} else {
			medicinalproductindication.getDuration().setSystem(m.getMdcnlPrdctIndctnDurationSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctIndctn_Duration_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIndctnDurationUnt() != null ) {

			if(m.getMdcnlPrdctIndctnDurationUnt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctIndctnDurationUnt()==null) {} else {
			medicinalproductindication.getDuration().setUnit(m.getMdcnlPrdctIndctnDurationUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctIndctn_Duration_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIndctnDurationVl() != null ) {

			if(m.getMdcnlPrdctIndctnDurationVl().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctIndctnDurationVl()==null) {} else {
			medicinalproductindication.getDuration().setValue((new java.math.BigDecimal((m.getMdcnlPrdctIndctnDurationVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** MdcnlPrdctIndctn_IntendedEfct_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnIntendedEfctCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnIntendedEfctCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getIntendedEffect().getCoding().size() < i0+1) { medicinalproductindication.getIntendedEffect().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductindication.getIntendedEffect().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIndctn_IntendedEfct_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIndctnIntendedEfctCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnIntendedEfctCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getIntendedEffect().getCoding().size() < i0+1) { medicinalproductindication.getIntendedEffect().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductindication.getIntendedEffect().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIndctn_IntendedEfct_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIndctnIntendedEfctCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnIntendedEfctCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getIntendedEffect().getCoding().size() < i0+1) { medicinalproductindication.getIntendedEffect().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductindication.getIntendedEffect().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIndctn_IntendedEfct_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnIntendedEfctCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnIntendedEfctCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getIntendedEffect().getCoding().size() < i0+1) { medicinalproductindication.getIntendedEffect().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductindication.getIntendedEffect().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctIndctn_IntendedEfct_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIndctnIntendedEfctCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnIntendedEfctCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getIntendedEffect().getCoding().size() < i0+1) { medicinalproductindication.getIntendedEffect().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductindication.getIntendedEffect().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIndctn_IntendedEfct_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIndctnIntendedEfctTxt() != null ) {

			if(m.getMdcnlPrdctIndctnIntendedEfctTxt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctIndctnIntendedEfctTxt()==null) {} else {
			medicinalproductindication.getIntendedEffect().setText(m.getMdcnlPrdctIndctnIntendedEfctTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctIndctn_OtherThrpy_MdctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getOtherTherapy().size() < i0+1) { medicinalproductindication.addOtherTherapy(); }
				String[] arrayi1 = m.getMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductindication.getOtherTherapy().get(i0).getMedicationCodeableConcept().getCoding().size() < i1+1) { medicinalproductindication.getOtherTherapy().get(i0).getMedicationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductindication.getOtherTherapy().get(i0).getMedicationCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIndctn_OtherThrpy_MdctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getOtherTherapy().size() < i0+1) { medicinalproductindication.addOtherTherapy(); }
				String[] arrayi1 = m.getMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductindication.getOtherTherapy().get(i0).getMedicationCodeableConcept().getCoding().size() < i1+1) { medicinalproductindication.getOtherTherapy().get(i0).getMedicationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductindication.getOtherTherapy().get(i0).getMedicationCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIndctn_OtherThrpy_MdctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getOtherTherapy().size() < i0+1) { medicinalproductindication.addOtherTherapy(); }
				String[] arrayi1 = m.getMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductindication.getOtherTherapy().get(i0).getMedicationCodeableConcept().getCoding().size() < i1+1) { medicinalproductindication.getOtherTherapy().get(i0).getMedicationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductindication.getOtherTherapy().get(i0).getMedicationCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIndctn_OtherThrpy_MdctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getOtherTherapy().size() < i0+1) { medicinalproductindication.addOtherTherapy(); }
				String[] arrayi1 = m.getMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductindication.getOtherTherapy().get(i0).getMedicationCodeableConcept().getCoding().size() < i1+1) { medicinalproductindication.getOtherTherapy().get(i0).getMedicationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductindication.getOtherTherapy().get(i0).getMedicationCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctIndctn_OtherThrpy_MdctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getOtherTherapy().size() < i0+1) { medicinalproductindication.addOtherTherapy(); }
				String[] arrayi1 = m.getMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductindication.getOtherTherapy().get(i0).getMedicationCodeableConcept().getCoding().size() < i1+1) { medicinalproductindication.getOtherTherapy().get(i0).getMedicationCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductindication.getOtherTherapy().get(i0).getMedicationCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIndctn_OtherThrpy_MdctnCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnOtherThrpyMdctnCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getOtherTherapy().size() < i0+1) { medicinalproductindication.addOtherTherapy(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductindication.getOtherTherapy().get(i0).getMedicationCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIndctn_OtherThrpy_MdctnRfrnc ********************************************************************************/
		if(m.getMdcnlPrdctIndctnOtherThrpyMdctnRfrnc() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnOtherThrpyMdctnRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getOtherTherapy().size() < i0+1) { medicinalproductindication.addOtherTherapy(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductindication.getOtherTherapy().get(i0).setMedication(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctIndctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getOtherTherapy().size() < i0+1) { medicinalproductindication.addOtherTherapy(); }
				String[] arrayi1 = m.getMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductindication.getOtherTherapy().get(i0).getTherapyRelationshipType().getCoding().size() < i1+1) { medicinalproductindication.getOtherTherapy().get(i0).getTherapyRelationshipType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductindication.getOtherTherapy().get(i0).getTherapyRelationshipType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIndctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getOtherTherapy().size() < i0+1) { medicinalproductindication.addOtherTherapy(); }
				String[] arrayi1 = m.getMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductindication.getOtherTherapy().get(i0).getTherapyRelationshipType().getCoding().size() < i1+1) { medicinalproductindication.getOtherTherapy().get(i0).getTherapyRelationshipType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductindication.getOtherTherapy().get(i0).getTherapyRelationshipType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIndctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getOtherTherapy().size() < i0+1) { medicinalproductindication.addOtherTherapy(); }
				String[] arrayi1 = m.getMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductindication.getOtherTherapy().get(i0).getTherapyRelationshipType().getCoding().size() < i1+1) { medicinalproductindication.getOtherTherapy().get(i0).getTherapyRelationshipType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductindication.getOtherTherapy().get(i0).getTherapyRelationshipType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIndctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getOtherTherapy().size() < i0+1) { medicinalproductindication.addOtherTherapy(); }
				String[] arrayi1 = m.getMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductindication.getOtherTherapy().get(i0).getTherapyRelationshipType().getCoding().size() < i1+1) { medicinalproductindication.getOtherTherapy().get(i0).getTherapyRelationshipType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductindication.getOtherTherapy().get(i0).getTherapyRelationshipType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctIndctn_OtherThrpy_ThrpyRltnshipTyp_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getOtherTherapy().size() < i0+1) { medicinalproductindication.addOtherTherapy(); }
				String[] arrayi1 = m.getMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductindication.getOtherTherapy().get(i0).getTherapyRelationshipType().getCoding().size() < i1+1) { medicinalproductindication.getOtherTherapy().get(i0).getTherapyRelationshipType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductindication.getOtherTherapy().get(i0).getTherapyRelationshipType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIndctn_OtherThrpy_ThrpyRltnshipTyp_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnOtherThrpyThrpyRltnshipTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getOtherTherapy().size() < i0+1) { medicinalproductindication.addOtherTherapy(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductindication.getOtherTherapy().get(i0).getTherapyRelationshipType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIndctn_Popln_AgeCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getPopulation().size() < i0+1) { medicinalproductindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductindication.getPopulation().get(i0).getAgeCodeableConcept().getCoding().size() < i1+1) { medicinalproductindication.getPopulation().get(i0).getAgeCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductindication.getPopulation().get(i0).getAgeCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIndctn_Popln_AgeCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getPopulation().size() < i0+1) { medicinalproductindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductindication.getPopulation().get(i0).getAgeCodeableConcept().getCoding().size() < i1+1) { medicinalproductindication.getPopulation().get(i0).getAgeCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductindication.getPopulation().get(i0).getAgeCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIndctn_Popln_AgeCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getPopulation().size() < i0+1) { medicinalproductindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductindication.getPopulation().get(i0).getAgeCodeableConcept().getCoding().size() < i1+1) { medicinalproductindication.getPopulation().get(i0).getAgeCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductindication.getPopulation().get(i0).getAgeCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIndctn_Popln_AgeCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getPopulation().size() < i0+1) { medicinalproductindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductindication.getPopulation().get(i0).getAgeCodeableConcept().getCoding().size() < i1+1) { medicinalproductindication.getPopulation().get(i0).getAgeCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductindication.getPopulation().get(i0).getAgeCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctIndctn_Popln_AgeCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getPopulation().size() < i0+1) { medicinalproductindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctIndctnPoplnAgeCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductindication.getPopulation().get(i0).getAgeCodeableConcept().getCoding().size() < i1+1) { medicinalproductindication.getPopulation().get(i0).getAgeCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductindication.getPopulation().get(i0).getAgeCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIndctn_Popln_AgeCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnAgeCdbleCncptTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnPoplnAgeCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getPopulation().size() < i0+1) { medicinalproductindication.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductindication.getPopulation().get(i0).getAgeCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIndctn_Popln_AgeRng_Hi_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnAgeRngHiCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnPoplnAgeRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getPopulation().size() < i0+1) { medicinalproductindication.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductindication.getPopulation().get(i0).getAgeRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIndctn_Popln_AgeRng_Hi_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnAgeRngHiCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnPoplnAgeRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getPopulation().size() < i0+1) { medicinalproductindication.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductindication.getPopulation().get(i0).getAgeRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctIndctn_Popln_AgeRng_Hi_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnAgeRngHiSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnPoplnAgeRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getPopulation().size() < i0+1) { medicinalproductindication.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductindication.getPopulation().get(i0).getAgeRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIndctn_Popln_AgeRng_Hi_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnAgeRngHiUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnPoplnAgeRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getPopulation().size() < i0+1) { medicinalproductindication.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductindication.getPopulation().get(i0).getAgeRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIndctn_Popln_AgeRng_Hi_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnAgeRngHiVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnPoplnAgeRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getPopulation().size() < i0+1) { medicinalproductindication.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductindication.getPopulation().get(i0).getAgeRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdcnlPrdctIndctn_Popln_AgeRng_Lw_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnAgeRngLwCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnPoplnAgeRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getPopulation().size() < i0+1) { medicinalproductindication.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductindication.getPopulation().get(i0).getAgeRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIndctn_Popln_AgeRng_Lw_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnAgeRngLwCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnPoplnAgeRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getPopulation().size() < i0+1) { medicinalproductindication.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductindication.getPopulation().get(i0).getAgeRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctIndctn_Popln_AgeRng_Lw_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnAgeRngLwSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnPoplnAgeRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getPopulation().size() < i0+1) { medicinalproductindication.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductindication.getPopulation().get(i0).getAgeRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIndctn_Popln_AgeRng_Lw_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnAgeRngLwUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnPoplnAgeRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getPopulation().size() < i0+1) { medicinalproductindication.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductindication.getPopulation().get(i0).getAgeRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIndctn_Popln_AgeRng_Lw_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnAgeRngLwVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnPoplnAgeRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getPopulation().size() < i0+1) { medicinalproductindication.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductindication.getPopulation().get(i0).getAgeRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdcnlPrdctIndctn_Popln_Gender_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnGenderCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnPoplnGenderCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getPopulation().size() < i0+1) { medicinalproductindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctIndctnPoplnGenderCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductindication.getPopulation().get(i0).getGender().getCoding().size() < i1+1) { medicinalproductindication.getPopulation().get(i0).getGender().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductindication.getPopulation().get(i0).getGender().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIndctn_Popln_Gender_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnGenderCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnPoplnGenderCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getPopulation().size() < i0+1) { medicinalproductindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctIndctnPoplnGenderCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductindication.getPopulation().get(i0).getGender().getCoding().size() < i1+1) { medicinalproductindication.getPopulation().get(i0).getGender().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductindication.getPopulation().get(i0).getGender().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIndctn_Popln_Gender_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnGenderCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnPoplnGenderCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getPopulation().size() < i0+1) { medicinalproductindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctIndctnPoplnGenderCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductindication.getPopulation().get(i0).getGender().getCoding().size() < i1+1) { medicinalproductindication.getPopulation().get(i0).getGender().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductindication.getPopulation().get(i0).getGender().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIndctn_Popln_Gender_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnGenderCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnPoplnGenderCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getPopulation().size() < i0+1) { medicinalproductindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctIndctnPoplnGenderCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductindication.getPopulation().get(i0).getGender().getCoding().size() < i1+1) { medicinalproductindication.getPopulation().get(i0).getGender().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductindication.getPopulation().get(i0).getGender().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctIndctn_Popln_Gender_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnGenderCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnPoplnGenderCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getPopulation().size() < i0+1) { medicinalproductindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctIndctnPoplnGenderCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductindication.getPopulation().get(i0).getGender().getCoding().size() < i1+1) { medicinalproductindication.getPopulation().get(i0).getGender().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductindication.getPopulation().get(i0).getGender().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIndctn_Popln_Gender_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnGenderTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnPoplnGenderTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getPopulation().size() < i0+1) { medicinalproductindication.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductindication.getPopulation().get(i0).getGender().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIndctn_Popln_PhysiologicalCndtn_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getPopulation().size() < i0+1) { medicinalproductindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductindication.getPopulation().get(i0).getPhysiologicalCondition().getCoding().size() < i1+1) { medicinalproductindication.getPopulation().get(i0).getPhysiologicalCondition().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductindication.getPopulation().get(i0).getPhysiologicalCondition().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIndctn_Popln_PhysiologicalCndtn_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getPopulation().size() < i0+1) { medicinalproductindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductindication.getPopulation().get(i0).getPhysiologicalCondition().getCoding().size() < i1+1) { medicinalproductindication.getPopulation().get(i0).getPhysiologicalCondition().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductindication.getPopulation().get(i0).getPhysiologicalCondition().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIndctn_Popln_PhysiologicalCndtn_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getPopulation().size() < i0+1) { medicinalproductindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductindication.getPopulation().get(i0).getPhysiologicalCondition().getCoding().size() < i1+1) { medicinalproductindication.getPopulation().get(i0).getPhysiologicalCondition().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductindication.getPopulation().get(i0).getPhysiologicalCondition().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIndctn_Popln_PhysiologicalCndtn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getPopulation().size() < i0+1) { medicinalproductindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductindication.getPopulation().get(i0).getPhysiologicalCondition().getCoding().size() < i1+1) { medicinalproductindication.getPopulation().get(i0).getPhysiologicalCondition().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductindication.getPopulation().get(i0).getPhysiologicalCondition().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctIndctn_Popln_PhysiologicalCndtn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getPopulation().size() < i0+1) { medicinalproductindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctIndctnPoplnPhysiologicalCndtnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductindication.getPopulation().get(i0).getPhysiologicalCondition().getCoding().size() < i1+1) { medicinalproductindication.getPopulation().get(i0).getPhysiologicalCondition().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductindication.getPopulation().get(i0).getPhysiologicalCondition().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIndctn_Popln_PhysiologicalCndtn_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnPhysiologicalCndtnTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnPoplnPhysiologicalCndtnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getPopulation().size() < i0+1) { medicinalproductindication.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductindication.getPopulation().get(i0).getPhysiologicalCondition().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIndctn_Popln_Race_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnRaceCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnPoplnRaceCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getPopulation().size() < i0+1) { medicinalproductindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctIndctnPoplnRaceCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductindication.getPopulation().get(i0).getRace().getCoding().size() < i1+1) { medicinalproductindication.getPopulation().get(i0).getRace().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductindication.getPopulation().get(i0).getRace().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIndctn_Popln_Race_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnRaceCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnPoplnRaceCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getPopulation().size() < i0+1) { medicinalproductindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctIndctnPoplnRaceCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductindication.getPopulation().get(i0).getRace().getCoding().size() < i1+1) { medicinalproductindication.getPopulation().get(i0).getRace().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductindication.getPopulation().get(i0).getRace().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIndctn_Popln_Race_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnRaceCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnPoplnRaceCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getPopulation().size() < i0+1) { medicinalproductindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctIndctnPoplnRaceCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductindication.getPopulation().get(i0).getRace().getCoding().size() < i1+1) { medicinalproductindication.getPopulation().get(i0).getRace().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductindication.getPopulation().get(i0).getRace().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIndctn_Popln_Race_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnRaceCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnPoplnRaceCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getPopulation().size() < i0+1) { medicinalproductindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctIndctnPoplnRaceCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductindication.getPopulation().get(i0).getRace().getCoding().size() < i1+1) { medicinalproductindication.getPopulation().get(i0).getRace().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductindication.getPopulation().get(i0).getRace().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctIndctn_Popln_Race_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnRaceCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnPoplnRaceCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getPopulation().size() < i0+1) { medicinalproductindication.addPopulation(); }
				String[] arrayi1 = m.getMdcnlPrdctIndctnPoplnRaceCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductindication.getPopulation().get(i0).getRace().getCoding().size() < i1+1) { medicinalproductindication.getPopulation().get(i0).getRace().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductindication.getPopulation().get(i0).getRace().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIndctn_Popln_Race_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIndctnPoplnRaceTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIndctnPoplnRaceTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductindication.getPopulation().size() < i0+1) { medicinalproductindication.addPopulation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductindication.getPopulation().get(i0).getRace().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIndctn_Sbjct ********************************************************************************/
		if(m.getMdcnlPrdctIndctnSbjct() != null ) {

				for( String currListStrSplit : m.getMdcnlPrdctIndctnSbjct().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicinalproductindication.addSubject(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdcnlPrdctIndctn_UndesirableEfct ********************************************************************************/
		if(m.getMdcnlPrdctIndctnUndesirableEfct() != null ) {

				for( String currListStrSplit : m.getMdcnlPrdctIndctnUndesirableEfct().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicinalproductindication.addUndesirableEffect(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		return medicinalproductindication;
	}
}
