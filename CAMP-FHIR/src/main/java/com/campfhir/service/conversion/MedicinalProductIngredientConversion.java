package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProductIngredient;
public class MedicinalProductIngredientConversion 
{
	public org.hl7.fhir.r4.model.MedicinalProductIngredient MedicinalProductIngredients(MedicinalProductIngredient m) throws ParseException
	{
		org.hl7.fhir.r4.model.MedicinalProductIngredient medicinalproductingredient = new org.hl7.fhir.r4.model.MedicinalProductIngredient();

		/******************** id ********************************************************************************/
		medicinalproductingredient.setId(m.getId());

		/******************** MdcnlPrdctIgrdnt_AllergenicIndicator ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntAllergenicIndicator() != null ) {

			if(m.getMdcnlPrdctIgrdntAllergenicIndicator().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctIgrdntAllergenicIndicator()==null) {} else {
			medicinalproductingredient.setAllergenicIndicator(Boolean.parseBoolean(m.getMdcnlPrdctIgrdntAllergenicIndicator().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdcnlPrdctIgrdnt_Id_Assigner ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntIdAssigner() != null ) {

			if(m.getMdcnlPrdctIgrdntIdAssigner().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctIgrdntIdAssigner()==null) {} else {
			medicinalproductingredient.getIdentifier().setAssigner(new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctIgrdntIdAssigner().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdcnlPrdctIgrdnt_Id_Prd_End ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntIdPrdEnd() != null ) {

			if(m.getMdcnlPrdctIgrdntIdPrdEnd().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctIgrdntIdPrdEnd()==null) {} else {
			medicinalproductingredient.getIdentifier().getPeriod().setEnd(m.getMdcnlPrdctIgrdntIdPrdEnd().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctIgrdntIdPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMdcnlPrdctIgrdntIdPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdcnlPrdctIgrdnt_Id_Prd_Strt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntIdPrdStrt() != null ) {

			if(m.getMdcnlPrdctIgrdntIdPrdStrt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctIgrdntIdPrdStrt()==null) {} else {
			medicinalproductingredient.getIdentifier().getPeriod().setStart(m.getMdcnlPrdctIgrdntIdPrdStrt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctIgrdntIdPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMdcnlPrdctIgrdntIdPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdcnlPrdctIgrdnt_Id_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntIdSys() != null ) {

			if(m.getMdcnlPrdctIgrdntIdSys().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctIgrdntIdSys()==null) {} else {
			medicinalproductingredient.getIdentifier().setSystem(m.getMdcnlPrdctIgrdntIdSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctIgrdnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntIdTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getIdentifier().getType().getCoding().size() < i0+1) { medicinalproductingredient.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getIdentifier().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntIdTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getIdentifier().getType().getCoding().size() < i0+1) { medicinalproductingredient.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getIdentifier().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntIdTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getIdentifier().getType().getCoding().size() < i0+1) { medicinalproductingredient.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getIdentifier().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getIdentifier().getType().getCoding().size() < i0+1) { medicinalproductingredient.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getIdentifier().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntIdTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getIdentifier().getType().getCoding().size() < i0+1) { medicinalproductingredient.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getIdentifier().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Id_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntIdTypTxt() != null ) {

			if(m.getMdcnlPrdctIgrdntIdTypTxt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctIgrdntIdTypTxt()==null) {} else {
			medicinalproductingredient.getIdentifier().getType().setText(m.getMdcnlPrdctIgrdntIdTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctIgrdnt_Id_Use ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntIdUse() != null ) {

			if(m.getMdcnlPrdctIgrdntIdUse().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctIgrdntIdUse()==null) {} else {
			medicinalproductingredient.getIdentifier().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(m.getMdcnlPrdctIgrdntIdUse().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdcnlPrdctIgrdnt_Id_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntIdVl() != null ) {

			if(m.getMdcnlPrdctIgrdntIdVl().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctIgrdntIdVl()==null) {} else {
			medicinalproductingredient.getIdentifier().setValue(m.getMdcnlPrdctIgrdntIdVl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctIgrdnt_Manufacturer ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntManufacturer() != null ) {

				for( String currListStrSplit : m.getMdcnlPrdctIgrdntManufacturer().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicinalproductingredient.addManufacturer(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdcnlPrdctIgrdnt_Role_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntRoleCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getRole().getCoding().size() < i0+1) { medicinalproductingredient.getRole().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getRole().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Role_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntRoleCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getRole().getCoding().size() < i0+1) { medicinalproductingredient.getRole().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getRole().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Role_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntRoleCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getRole().getCoding().size() < i0+1) { medicinalproductingredient.getRole().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getRole().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Role_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntRoleCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getRole().getCoding().size() < i0+1) { medicinalproductingredient.getRole().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getRole().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Role_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntRoleCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getRole().getCoding().size() < i0+1) { medicinalproductingredient.getRole().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getRole().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Role_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntRoleTxt() != null ) {

			if(m.getMdcnlPrdctIgrdntRoleTxt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctIgrdntRoleTxt()==null) {} else {
			medicinalproductingredient.getRole().setText(m.getMdcnlPrdctIgrdntRoleTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncCdCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getCode().getCoding().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncCdCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getCode().getCoding().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncCdCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getCode().getCoding().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncCdCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getCode().getCoding().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncCdCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getCode().getCoding().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Cd_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncCdTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Confidentiality_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getConfidentiality().getCoding().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getConfidentiality().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getConfidentiality().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Confidentiality_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getConfidentiality().getCoding().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getConfidentiality().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getConfidentiality().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Confidentiality_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getConfidentiality().getCoding().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getConfidentiality().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getConfidentiality().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Confidentiality_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getConfidentiality().getCoding().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getConfidentiality().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getConfidentiality().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Confidentiality_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncConfidentialityCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getConfidentiality().getCoding().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getConfidentiality().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getConfidentiality().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Confidentiality_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncConfidentialityTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncConfidentialityTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getConfidentiality().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Grp_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncGrpCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncGrpCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncGrpCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getGroup().getCoding().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getGroup().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getGroup().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Grp_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncGrpCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncGrpCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncGrpCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getGroup().getCoding().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getGroup().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getGroup().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Grp_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncGrpCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncGrpCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncGrpCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getGroup().getCoding().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getGroup().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getGroup().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Grp_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncGrpCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncGrpCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncGrpCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getGroup().getCoding().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getGroup().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getGroup().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Grp_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncGrpCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncGrpCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncGrpCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getGroup().getCoding().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getGroup().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getGroup().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Grp_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncGrpTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncGrpTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getGroup().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Dnmntr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getConcentration().getDenominator().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Dnmntr_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getConcentration().getDenominator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Dnmntr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getConcentration().getDenominator().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Dnmntr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getConcentration().getDenominator().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Dnmntr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getConcentration().getDenominator().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Nmrtr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getConcentration().getNumerator().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Nmrtr_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getConcentration().getNumerator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Nmrtr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getConcentration().getNumerator().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Nmrtr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getConcentration().getNumerator().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cncntrtn_Nmrtr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getConcentration().getNumerator().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Dnmntr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getConcentrationLowLimit().getDenominator().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Dnmntr_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getConcentrationLowLimit().getDenominator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Dnmntr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getConcentrationLowLimit().getDenominator().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Dnmntr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getConcentrationLowLimit().getDenominator().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Dnmntr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getConcentrationLowLimit().getDenominator().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Nmrtr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getConcentrationLowLimit().getNumerator().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Nmrtr_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getConcentrationLowLimit().getNumerator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Nmrtr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getConcentrationLowLimit().getNumerator().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Nmrtr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getConcentrationLowLimit().getNumerator().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_CncntrtnLwLmt_Nmrtr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCncntrtnLwLmtNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getConcentrationLowLimit().getNumerator().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cntry_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getCountry().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).addCountry(); }
						String[] arrayi3 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getCountry().get(i2).getCoding().size() < i3+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getCountry().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getCountry().get(i2).getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cntry_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getCountry().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).addCountry(); }
						String[] arrayi3 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getCountry().get(i2).getCoding().size() < i3+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getCountry().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getCountry().get(i2).getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cntry_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getCountry().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).addCountry(); }
						String[] arrayi3 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getCountry().get(i2).getCoding().size() < i3+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getCountry().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getCountry().get(i2).getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cntry_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getCountry().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).addCountry(); }
						String[] arrayi3 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getCountry().get(i2).getCoding().size() < i3+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getCountry().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getCountry().get(i2).getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cntry_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getCountry().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).addCountry(); }
						String[] arrayi3 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getCountry().get(i2).getCoding().size() < i3+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getCountry().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getCountry().get(i2).getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Cntry_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrCntryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getCountry().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).addCountry(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getCountry().get(i2).setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_MsrmentPoint ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrMsrmentPoint() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrMsrmentPoint().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrMsrmentPoint().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).setMeasurementPoint(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Dnmntr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getPresentation().getDenominator().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Dnmntr_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getPresentation().getDenominator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Dnmntr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getPresentation().getDenominator().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Dnmntr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getPresentation().getDenominator().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Dnmntr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getPresentation().getDenominator().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Nmrtr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getPresentation().getNumerator().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Nmrtr_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getPresentation().getNumerator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Nmrtr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getPresentation().getNumerator().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Nmrtr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getPresentation().getNumerator().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_Prsnttn_Nmrtr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getPresentation().getNumerator().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Dnmntr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getPresentationLowLimit().getDenominator().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Dnmntr_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getPresentationLowLimit().getDenominator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Dnmntr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getPresentationLowLimit().getDenominator().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Dnmntr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getPresentationLowLimit().getDenominator().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Dnmntr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getPresentationLowLimit().getDenominator().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Nmrtr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getPresentationLowLimit().getNumerator().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Nmrtr_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getPresentationLowLimit().getNumerator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Nmrtr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getPresentationLowLimit().getNumerator().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Nmrtr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getPresentationLowLimit().getNumerator().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_PrsnttnLwLmt_Nmrtr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrPrsnttnLwLmtNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getPresentationLowLimit().getNumerator().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Cntry_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).addReferenceStrength(); }
						String[] arrayi3 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).getCountry().size() < i3+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).addCountry(); }
							String[] arrayi4 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).getCountry().get(i3).getCoding().size() < i4+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).getCountry().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).getCountry().get(i3).getCoding().get(i4).setCode(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Cntry_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).addReferenceStrength(); }
						String[] arrayi3 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).getCountry().size() < i3+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).addCountry(); }
							String[] arrayi4 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).getCountry().get(i3).getCoding().size() < i4+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).getCountry().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).getCountry().get(i3).getCoding().get(i4).setDisplay(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Cntry_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).addReferenceStrength(); }
						String[] arrayi3 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).getCountry().size() < i3+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).addCountry(); }
							String[] arrayi4 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).getCountry().get(i3).getCoding().size() < i4+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).getCountry().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).getCountry().get(i3).getCoding().get(i4).setSystem(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Cntry_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).addReferenceStrength(); }
						String[] arrayi3 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).getCountry().size() < i3+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).addCountry(); }
							String[] arrayi4 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).getCountry().get(i3).getCoding().size() < i4+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).getCountry().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).getCountry().get(i3).getCoding().get(i4).setUserSelected(Boolean.parseBoolean(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
							}
						}
					}
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Cntry_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).addReferenceStrength(); }
						String[] arrayi3 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).getCountry().size() < i3+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).addCountry(); }
							String[] arrayi4 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).getCountry().get(i3).getCoding().size() < i4+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).getCountry().get(i3).addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).getCountry().get(i3).getCoding().get(i4).setVersion(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Cntry_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).addReferenceStrength(); }
						String[] arrayi3 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrCntryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).getCountry().size() < i3+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).addCountry(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).getCountry().get(i3).setText(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_MsrmentPoint ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrMsrmentPoint() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrMsrmentPoint().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrMsrmentPoint().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrMsrmentPoint().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).addReferenceStrength(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).setMeasurementPoint(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Dnmntr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).addReferenceStrength(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).getStrength().getDenominator().setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Dnmntr_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).addReferenceStrength(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).getStrength().getDenominator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Dnmntr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).addReferenceStrength(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).getStrength().getDenominator().setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Dnmntr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).addReferenceStrength(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).getStrength().getDenominator().setUnit(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Dnmntr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).addReferenceStrength(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).getStrength().getDenominator().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Nmrtr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).addReferenceStrength(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).getStrength().getNumerator().setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Nmrtr_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).addReferenceStrength(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).getStrength().getNumerator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Nmrtr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).addReferenceStrength(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).getStrength().getNumerator().setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Nmrtr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).addReferenceStrength(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).getStrength().getNumerator().setUnit(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Str_Nmrtr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().size() < i1+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addStrength(); }
					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).addReferenceStrength(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getStrength().get(i1).getReferenceStrength().get(i2).getStrength().getNumerator().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
//		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Cd ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrCd() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
//					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addReferenceStrength(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().get(i2).getStrengthLowLimit().getDenominator().setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//					}
//				}
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Cmprtr ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrCmprtr() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
//					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addReferenceStrength(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().get(i2).getStrengthLowLimit().getDenominator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//					}
//				}
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Sys ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrSys() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
//					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addReferenceStrength(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().get(i2).getStrengthLowLimit().getDenominator().setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//					}
//				}
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Unt ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrUnt() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
//					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addReferenceStrength(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().get(i2).getStrengthLowLimit().getDenominator().setUnit(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//					}
//				}
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Vl ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrVl() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
//					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addReferenceStrength(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().get(i2).getStrengthLowLimit().getDenominator().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
//					}
//				}
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Cd ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrCd() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
//					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addReferenceStrength(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().get(i2).getStrengthLowLimit().getNumerator().setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//					}
//				}
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Cmprtr ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrCmprtr() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
//					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addReferenceStrength(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().get(i2).getStrengthLowLimit().getNumerator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//					}
//				}
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Sys ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrSys() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
//					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addReferenceStrength(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().get(i2).getStrengthLowLimit().getNumerator().setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//					}
//				}
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Unt ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrUnt() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
//					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addReferenceStrength(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().get(i2).getStrengthLowLimit().getNumerator().setUnit(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//					}
//				}
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Vl ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrVl() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
//					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrStrLwLmtNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addReferenceStrength(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().get(i2).getStrengthLowLimit().getNumerator().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
//					}
//				}
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Sbstnc_Cdg_Cd ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgCd() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
//					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addReferenceStrength(); }
//						String[] arrayi3 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//						for(int i3 = 0; i3 < arrayi3.length; i3++) {
//							if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().get(i2).getSubstance().getCoding().size() < i3+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().get(i2).getSubstance().addCoding(); }
//							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().get(i2).getSubstance().getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//						}
//					}
//				}
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Sbstnc_Cdg_Dsply ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgDsply() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
//					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addReferenceStrength(); }
//						String[] arrayi3 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//						for(int i3 = 0; i3 < arrayi3.length; i3++) {
//							if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().get(i2).getSubstance().getCoding().size() < i3+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().get(i2).getSubstance().addCoding(); }
//							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().get(i2).getSubstance().getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//						}
//					}
//				}
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Sbstnc_Cdg_Sys ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgSys() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
//					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addReferenceStrength(); }
//						String[] arrayi3 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//						for(int i3 = 0; i3 < arrayi3.length; i3++) {
//							if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().get(i2).getSubstance().getCoding().size() < i3+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().get(i2).getSubstance().addCoding(); }
//							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().get(i2).getSubstance().getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//						}
//					}
//				}
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Sbstnc_Cdg_UsrSltd ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
//					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addReferenceStrength(); }
//						String[] arrayi3 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//						for(int i3 = 0; i3 < arrayi3.length; i3++) {
//							if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().get(i2).getSubstance().getCoding().size() < i3+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().get(i2).getSubstance().addCoding(); }
//							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().get(i2).getSubstance().getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//						}
//					}
//				}
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Sbstnc_Cdg_Vrsn ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgVrsn() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
//					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addReferenceStrength(); }
//						String[] arrayi3 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//						for(int i3 = 0; i3 < arrayi3.length; i3++) {
//							if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().get(i2).getSubstance().getCoding().size() < i3+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().get(i2).getSubstance().addCoding(); }
//							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().get(i2).getSubstance().getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//						}
//					}
//				}
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_SpcfdSbstnc_Str_RfrncStr_Sbstnc_Txt ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncTxt() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSpecifiedSubstance().size() < i0+1) { medicinalproductingredient.addSpecifiedSubstance(); }
//					String[] arrayi2 = m.getMdcnlPrdctIgrdntSpcfdSbstncStrRfrncStrSbstncTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().size() < i2+1) { medicinalproductingredient.getSpecifiedSubstance().get(i0).addReferenceStrength(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductingredient.getSpecifiedSubstance().get(i0).getReferenceStrength().get(i2).getSubstance().setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//					}
//				}
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_Sbstnc_Cd_Cdg_Cd ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSbstncCdCdgCd() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSubstance().getCode().getCoding().size() < i0+1) { medicinalproductingredient.getSubstance().getCode().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_Sbstnc_Cd_Cdg_Dsply ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSbstncCdCdgDsply() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSubstance().getCode().getCoding().size() < i0+1) { medicinalproductingredient.getSubstance().getCode().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_Sbstnc_Cd_Cdg_Sys ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSbstncCdCdgSys() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSubstance().getCode().getCoding().size() < i0+1) { medicinalproductingredient.getSubstance().getCode().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_Sbstnc_Cd_Cdg_UsrSltd ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSbstncCdCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSubstance().getCode().getCoding().size() < i0+1) { medicinalproductingredient.getSubstance().getCode().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_Sbstnc_Cd_Cdg_Vrsn ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSbstncCdCdgVrsn() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSubstance().getCode().getCoding().size() < i0+1) { medicinalproductingredient.getSubstance().getCode().addCoding(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_Sbstnc_Cd_Txt ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSbstncCdTxt() != null ) {
//
//			if(m.getMdcnlPrdctIgrdntSbstncCdTxt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctIgrdntSbstncCdTxt()==null) {} else {
//			medicinalproductingredient.getSubstance().getCode().setText(m.getMdcnlPrdctIgrdntSbstncCdTxt().replace("[","").replace("]","").replace("\"",""));
//			}
//		}
//		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Dnmntr_Cd ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnDnmntrCd() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrCncntrtnDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getConcentration().getDenominator().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Dnmntr_Cmprtr ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnDnmntrCmprtr() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrCncntrtnDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getConcentration().getDenominator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Dnmntr_Sys ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnDnmntrSys() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrCncntrtnDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getConcentration().getDenominator().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Dnmntr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnDnmntrUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrCncntrtnDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getConcentration().getDenominator().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Dnmntr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnDnmntrVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrCncntrtnDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getConcentration().getDenominator().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Nmrtr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnNmrtrCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrCncntrtnNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getConcentration().getNumerator().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Nmrtr_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnNmrtrCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrCncntrtnNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getConcentration().getNumerator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Nmrtr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnNmrtrSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrCncntrtnNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getConcentration().getNumerator().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Nmrtr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnNmrtrUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrCncntrtnNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getConcentration().getNumerator().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cncntrtn_Nmrtr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnNmrtrVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrCncntrtnNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getConcentration().getNumerator().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Dnmntr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtDnmntrCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getConcentrationLowLimit().getDenominator().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Dnmntr_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtDnmntrCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getConcentrationLowLimit().getDenominator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Dnmntr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtDnmntrSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getConcentrationLowLimit().getDenominator().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Dnmntr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtDnmntrUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getConcentrationLowLimit().getDenominator().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Dnmntr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtDnmntrVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getConcentrationLowLimit().getDenominator().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Nmrtr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtNmrtrCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getConcentrationLowLimit().getNumerator().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Nmrtr_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtNmrtrCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getConcentrationLowLimit().getNumerator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Nmrtr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtNmrtrSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getConcentrationLowLimit().getNumerator().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Nmrtr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtNmrtrUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getConcentrationLowLimit().getNumerator().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_CncntrtnLwLmt_Nmrtr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtNmrtrVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrCncntrtnLwLmtNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getConcentrationLowLimit().getNumerator().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cntry_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCntryCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrCntryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrCntryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSubstance().getStrength().get(i0).getCountry().size() < i1+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).addCountry(); }
					String[] arrayi2 = m.getMdcnlPrdctIgrdntSbstncStrCntryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductingredient.getSubstance().getStrength().get(i0).getCountry().get(i1).getCoding().size() < i2+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).getCountry().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getCountry().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cntry_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCntryCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrCntryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrCntryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSubstance().getStrength().get(i0).getCountry().size() < i1+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).addCountry(); }
					String[] arrayi2 = m.getMdcnlPrdctIgrdntSbstncStrCntryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductingredient.getSubstance().getStrength().get(i0).getCountry().get(i1).getCoding().size() < i2+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).getCountry().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getCountry().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cntry_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCntryCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrCntryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrCntryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSubstance().getStrength().get(i0).getCountry().size() < i1+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).addCountry(); }
					String[] arrayi2 = m.getMdcnlPrdctIgrdntSbstncStrCntryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductingredient.getSubstance().getStrength().get(i0).getCountry().get(i1).getCoding().size() < i2+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).getCountry().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getCountry().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cntry_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCntryCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrCntryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrCntryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSubstance().getStrength().get(i0).getCountry().size() < i1+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).addCountry(); }
					String[] arrayi2 = m.getMdcnlPrdctIgrdntSbstncStrCntryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductingredient.getSubstance().getStrength().get(i0).getCountry().get(i1).getCoding().size() < i2+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).getCountry().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getCountry().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cntry_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCntryCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrCntryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrCntryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSubstance().getStrength().get(i0).getCountry().size() < i1+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).addCountry(); }
					String[] arrayi2 = m.getMdcnlPrdctIgrdntSbstncStrCntryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductingredient.getSubstance().getStrength().get(i0).getCountry().get(i1).getCoding().size() < i2+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).getCountry().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getCountry().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Cntry_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrCntryTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrCntryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrCntryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSubstance().getStrength().get(i0).getCountry().size() < i1+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).addCountry(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getCountry().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_MsrmentPoint ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrMsrmentPoint() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrMsrmentPoint().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).setMeasurementPoint(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Dnmntr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnDnmntrCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrPrsnttnDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getPresentation().getDenominator().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Dnmntr_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnDnmntrCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrPrsnttnDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getPresentation().getDenominator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Dnmntr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnDnmntrSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrPrsnttnDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getPresentation().getDenominator().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Dnmntr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnDnmntrUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrPrsnttnDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getPresentation().getDenominator().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Dnmntr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnDnmntrVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrPrsnttnDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getPresentation().getDenominator().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Nmrtr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnNmrtrCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrPrsnttnNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getPresentation().getNumerator().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Nmrtr_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnNmrtrCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrPrsnttnNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getPresentation().getNumerator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Nmrtr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnNmrtrSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrPrsnttnNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getPresentation().getNumerator().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Nmrtr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnNmrtrUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrPrsnttnNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getPresentation().getNumerator().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_Prsnttn_Nmrtr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnNmrtrVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrPrsnttnNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getPresentation().getNumerator().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Dnmntr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtDnmntrCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getPresentationLowLimit().getDenominator().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Dnmntr_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtDnmntrCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getPresentationLowLimit().getDenominator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Dnmntr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtDnmntrSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getPresentationLowLimit().getDenominator().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Dnmntr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtDnmntrUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getPresentationLowLimit().getDenominator().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Dnmntr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtDnmntrVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getPresentationLowLimit().getDenominator().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Nmrtr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtNmrtrCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getPresentationLowLimit().getNumerator().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Nmrtr_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtNmrtrCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getPresentationLowLimit().getNumerator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Nmrtr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtNmrtrSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getPresentationLowLimit().getNumerator().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Nmrtr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtNmrtrUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getPresentationLowLimit().getNumerator().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_PrsnttnLwLmt_Nmrtr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtNmrtrVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrPrsnttnLwLmtNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getPresentationLowLimit().getNumerator().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Cntry_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().size() < i1+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).addReferenceStrength(); }
					String[] arrayi2 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).getCountry().size() < i2+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).addCountry(); }
						String[] arrayi3 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).getCountry().get(i2).getCoding().size() < i3+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).getCountry().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).getCountry().get(i2).getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Cntry_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().size() < i1+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).addReferenceStrength(); }
					String[] arrayi2 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).getCountry().size() < i2+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).addCountry(); }
						String[] arrayi3 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).getCountry().get(i2).getCoding().size() < i3+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).getCountry().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).getCountry().get(i2).getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Cntry_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().size() < i1+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).addReferenceStrength(); }
					String[] arrayi2 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).getCountry().size() < i2+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).addCountry(); }
						String[] arrayi3 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).getCountry().get(i2).getCoding().size() < i3+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).getCountry().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).getCountry().get(i2).getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Cntry_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().size() < i1+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).addReferenceStrength(); }
					String[] arrayi2 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).getCountry().size() < i2+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).addCountry(); }
						String[] arrayi3 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).getCountry().get(i2).getCoding().size() < i3+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).getCountry().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).getCountry().get(i2).getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Cntry_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().size() < i1+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).addReferenceStrength(); }
					String[] arrayi2 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).getCountry().size() < i2+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).addCountry(); }
						String[] arrayi3 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).getCountry().get(i2).getCoding().size() < i3+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).getCountry().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).getCountry().get(i2).getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Cntry_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().size() < i1+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).addReferenceStrength(); }
					String[] arrayi2 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrCntryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).getCountry().size() < i2+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).addCountry(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).getCountry().get(i2).setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_MsrmentPoint ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrMsrmentPoint() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrMsrmentPoint().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrMsrmentPoint().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().size() < i1+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).addReferenceStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).setMeasurementPoint(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Dnmntr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().size() < i1+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).addReferenceStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).getStrength().getDenominator().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Dnmntr_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().size() < i1+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).addReferenceStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).getStrength().getDenominator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Dnmntr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().size() < i1+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).addReferenceStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).getStrength().getDenominator().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Dnmntr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().size() < i1+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).addReferenceStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).getStrength().getDenominator().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Dnmntr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().size() < i1+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).addReferenceStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).getStrength().getDenominator().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Nmrtr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().size() < i1+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).addReferenceStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).getStrength().getNumerator().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Nmrtr_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrCmprtr() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().size() < i1+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).addReferenceStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).getStrength().getNumerator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Nmrtr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().size() < i1+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).addReferenceStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).getStrength().getNumerator().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Nmrtr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrUnt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().size() < i1+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).addReferenceStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).getStrength().getNumerator().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Str_Nmrtr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrVl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductingredient.getSubstance().getStrength().size() < i0+1) { medicinalproductingredient.getSubstance().addStrength(); }
				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().size() < i1+1) { medicinalproductingredient.getSubstance().getStrength().get(i0).addReferenceStrength(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSubstance().getStrength().get(i0).getReferenceStrength().get(i1).getStrength().getNumerator().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
//		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Cd ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrCd() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSubstance().size() < i0+1) { medicinalproductingredient.addSubstance(); }
//				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().size() < i1+1) { medicinalproductingredient.getSubstance().get(i0).addReferenceStrength(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().get(i1).getStrengthLowLimit().getDenominator().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Cmprtr ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrCmprtr() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSubstance().size() < i0+1) { medicinalproductingredient.addSubstance(); }
//				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().size() < i1+1) { medicinalproductingredient.getSubstance().get(i0).addReferenceStrength(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().get(i1).getStrengthLowLimit().getDenominator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//				}
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Sys ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrSys() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSubstance().size() < i0+1) { medicinalproductingredient.addSubstance(); }
//				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().size() < i1+1) { medicinalproductingredient.getSubstance().get(i0).addReferenceStrength(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().get(i1).getStrengthLowLimit().getDenominator().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Unt ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrUnt() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSubstance().size() < i0+1) { medicinalproductingredient.addSubstance(); }
//				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().size() < i1+1) { medicinalproductingredient.getSubstance().get(i0).addReferenceStrength(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().get(i1).getStrengthLowLimit().getDenominator().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Dnmntr_Vl ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrVl() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSubstance().size() < i0+1) { medicinalproductingredient.addSubstance(); }
//				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().size() < i1+1) { medicinalproductingredient.getSubstance().get(i0).addReferenceStrength(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().get(i1).getStrengthLowLimit().getDenominator().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
//				}
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Cd ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrCd() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSubstance().size() < i0+1) { medicinalproductingredient.addSubstance(); }
//				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().size() < i1+1) { medicinalproductingredient.getSubstance().get(i0).addReferenceStrength(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().get(i1).getStrengthLowLimit().getNumerator().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Cmprtr ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrCmprtr() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSubstance().size() < i0+1) { medicinalproductingredient.addSubstance(); }
//				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().size() < i1+1) { medicinalproductingredient.getSubstance().get(i0).addReferenceStrength(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().get(i1).getStrengthLowLimit().getNumerator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//				}
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Sys ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrSys() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSubstance().size() < i0+1) { medicinalproductingredient.addSubstance(); }
//				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().size() < i1+1) { medicinalproductingredient.getSubstance().get(i0).addReferenceStrength(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().get(i1).getStrengthLowLimit().getNumerator().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Unt ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrUnt() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSubstance().size() < i0+1) { medicinalproductingredient.addSubstance(); }
//				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().size() < i1+1) { medicinalproductingredient.getSubstance().get(i0).addReferenceStrength(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().get(i1).getStrengthLowLimit().getNumerator().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_StrLwLmt_Nmrtr_Vl ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrVl() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSubstance().size() < i0+1) { medicinalproductingredient.addSubstance(); }
//				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrStrLwLmtNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().size() < i1+1) { medicinalproductingredient.getSubstance().get(i0).addReferenceStrength(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().get(i1).getStrengthLowLimit().getNumerator().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
//				}
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Sbstnc_Cdg_Cd ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgCd() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSubstance().size() < i0+1) { medicinalproductingredient.addSubstance(); }
//				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().size() < i1+1) { medicinalproductingredient.getSubstance().get(i0).addReferenceStrength(); }
//					String[] arrayi2 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().get(i1).getSubstance().getCoding().size() < i2+1) { medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().get(i1).getSubstance().addCoding(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().get(i1).getSubstance().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//					}
//				}
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Sbstnc_Cdg_Dsply ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgDsply() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSubstance().size() < i0+1) { medicinalproductingredient.addSubstance(); }
//				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().size() < i1+1) { medicinalproductingredient.getSubstance().get(i0).addReferenceStrength(); }
//					String[] arrayi2 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().get(i1).getSubstance().getCoding().size() < i2+1) { medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().get(i1).getSubstance().addCoding(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().get(i1).getSubstance().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//					}
//				}
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Sbstnc_Cdg_Sys ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgSys() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSubstance().size() < i0+1) { medicinalproductingredient.addSubstance(); }
//				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().size() < i1+1) { medicinalproductingredient.getSubstance().get(i0).addReferenceStrength(); }
//					String[] arrayi2 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().get(i1).getSubstance().getCoding().size() < i2+1) { medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().get(i1).getSubstance().addCoding(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().get(i1).getSubstance().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//					}
//				}
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Sbstnc_Cdg_UsrSltd ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgUsrSltd() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSubstance().size() < i0+1) { medicinalproductingredient.addSubstance(); }
//				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().size() < i1+1) { medicinalproductingredient.getSubstance().get(i0).addReferenceStrength(); }
//					String[] arrayi2 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().get(i1).getSubstance().getCoding().size() < i2+1) { medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().get(i1).getSubstance().addCoding(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().get(i1).getSubstance().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
//					}
//				}
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Sbstnc_Cdg_Vrsn ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgVrsn() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSubstance().size() < i0+1) { medicinalproductingredient.addSubstance(); }
//				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().size() < i1+1) { medicinalproductingredient.getSubstance().get(i0).addReferenceStrength(); }
//					String[] arrayi2 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//					for(int i2 = 0; i2 < arrayi2.length; i2++) {
//						if(medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().get(i1).getSubstance().getCoding().size() < i2+1) { medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().get(i1).getSubstance().addCoding(); }
//						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().get(i1).getSubstance().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//					}
//				}
//			}
//
//		}
//		/******************** MdcnlPrdctIgrdnt_Sbstnc_Str_RfrncStr_Sbstnc_Txt ********************************************************************************/
//		if(m.getMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncTxt() != null ) {
//
//			String[] arrayi0 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(medicinalproductingredient.getSubstance().size() < i0+1) { medicinalproductingredient.addSubstance(); }
//				String[] arrayi1 = m.getMdcnlPrdctIgrdntSbstncStrRfrncStrSbstncTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//				for(int i1 = 0; i1 < arrayi1.length; i1++) {
//					if(medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().size() < i1+1) { medicinalproductingredient.getSubstance().get(i0).addReferenceStrength(); }
//					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductingredient.getSubstance().get(i0).getReferenceStrength().get(i1).getSubstance().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//				}
//			}
//
//		}
		return medicinalproductingredient;
	}
}
