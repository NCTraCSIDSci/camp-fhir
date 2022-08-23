package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProductManufactured;
public class MedicinalProductManufacturedConversion 
{
	public org.hl7.fhir.r4.model.MedicinalProductManufactured MedicinalProductManufactureds(MedicinalProductManufactured m) throws ParseException
	{
		org.hl7.fhir.r4.model.MedicinalProductManufactured medicinalproductmanufactured = new org.hl7.fhir.r4.model.MedicinalProductManufactured();

		/******************** id ********************************************************************************/
		medicinalproductmanufactured.setId(m.getId());

		/******************** MdcnlPrdctMnfctred_Igrdnt ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredIgrdnt() != null ) {

				for( String currListStrSplit : m.getMdcnlPrdctMnfctredIgrdnt().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicinalproductmanufactured.addIngredient(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdcnlPrdctMnfctred_MnfctredDoseFrm_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredMnfctredDoseFrmCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctredMnfctredDoseFrmCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductmanufactured.getManufacturedDoseForm().getCoding().size() < i0+1) { medicinalproductmanufactured.getManufacturedDoseForm().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductmanufactured.getManufacturedDoseForm().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctMnfctred_MnfctredDoseFrm_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredMnfctredDoseFrmCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctredMnfctredDoseFrmCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductmanufactured.getManufacturedDoseForm().getCoding().size() < i0+1) { medicinalproductmanufactured.getManufacturedDoseForm().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductmanufactured.getManufacturedDoseForm().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctMnfctred_MnfctredDoseFrm_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredMnfctredDoseFrmCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctredMnfctredDoseFrmCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductmanufactured.getManufacturedDoseForm().getCoding().size() < i0+1) { medicinalproductmanufactured.getManufacturedDoseForm().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductmanufactured.getManufacturedDoseForm().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctMnfctred_MnfctredDoseFrm_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredMnfctredDoseFrmCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctredMnfctredDoseFrmCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductmanufactured.getManufacturedDoseForm().getCoding().size() < i0+1) { medicinalproductmanufactured.getManufacturedDoseForm().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductmanufactured.getManufacturedDoseForm().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctMnfctred_MnfctredDoseFrm_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredMnfctredDoseFrmCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctredMnfctredDoseFrmCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductmanufactured.getManufacturedDoseForm().getCoding().size() < i0+1) { medicinalproductmanufactured.getManufacturedDoseForm().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductmanufactured.getManufacturedDoseForm().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctMnfctred_MnfctredDoseFrm_Txt ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredMnfctredDoseFrmTxt() != null ) {

			if(m.getMdcnlPrdctMnfctredMnfctredDoseFrmTxt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredMnfctredDoseFrmTxt()==null) {} else {
			medicinalproductmanufactured.getManufacturedDoseForm().setText(m.getMdcnlPrdctMnfctredMnfctredDoseFrmTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctMnfctred_Manufacturer ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredManufacturer() != null ) {

				for( String currListStrSplit : m.getMdcnlPrdctMnfctredManufacturer().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicinalproductmanufactured.addManufacturer(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdcnlPrdctMnfctred_OtherCrctrstcs_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredOtherCrctrstcsCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctredOtherCrctrstcsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductmanufactured.getOtherCharacteristics().size() < i0+1) { medicinalproductmanufactured.addOtherCharacteristics(); }
				String[] arrayi1 = m.getMdcnlPrdctMnfctredOtherCrctrstcsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductmanufactured.getOtherCharacteristics().get(i0).getCoding().size() < i1+1) { medicinalproductmanufactured.getOtherCharacteristics().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductmanufactured.getOtherCharacteristics().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctMnfctred_OtherCrctrstcs_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredOtherCrctrstcsCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctredOtherCrctrstcsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductmanufactured.getOtherCharacteristics().size() < i0+1) { medicinalproductmanufactured.addOtherCharacteristics(); }
				String[] arrayi1 = m.getMdcnlPrdctMnfctredOtherCrctrstcsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductmanufactured.getOtherCharacteristics().get(i0).getCoding().size() < i1+1) { medicinalproductmanufactured.getOtherCharacteristics().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductmanufactured.getOtherCharacteristics().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctMnfctred_OtherCrctrstcs_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredOtherCrctrstcsCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctredOtherCrctrstcsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductmanufactured.getOtherCharacteristics().size() < i0+1) { medicinalproductmanufactured.addOtherCharacteristics(); }
				String[] arrayi1 = m.getMdcnlPrdctMnfctredOtherCrctrstcsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductmanufactured.getOtherCharacteristics().get(i0).getCoding().size() < i1+1) { medicinalproductmanufactured.getOtherCharacteristics().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductmanufactured.getOtherCharacteristics().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctMnfctred_OtherCrctrstcs_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredOtherCrctrstcsCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctredOtherCrctrstcsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductmanufactured.getOtherCharacteristics().size() < i0+1) { medicinalproductmanufactured.addOtherCharacteristics(); }
				String[] arrayi1 = m.getMdcnlPrdctMnfctredOtherCrctrstcsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductmanufactured.getOtherCharacteristics().get(i0).getCoding().size() < i1+1) { medicinalproductmanufactured.getOtherCharacteristics().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductmanufactured.getOtherCharacteristics().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdcnlPrdctMnfctred_OtherCrctrstcs_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredOtherCrctrstcsCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctredOtherCrctrstcsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductmanufactured.getOtherCharacteristics().size() < i0+1) { medicinalproductmanufactured.addOtherCharacteristics(); }
				String[] arrayi1 = m.getMdcnlPrdctMnfctredOtherCrctrstcsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicinalproductmanufactured.getOtherCharacteristics().get(i0).getCoding().size() < i1+1) { medicinalproductmanufactured.getOtherCharacteristics().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicinalproductmanufactured.getOtherCharacteristics().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdcnlPrdctMnfctred_OtherCrctrstcs_Txt ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredOtherCrctrstcsTxt() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctredOtherCrctrstcsTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductmanufactured.getOtherCharacteristics().size() < i0+1) { medicinalproductmanufactured.addOtherCharacteristics(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductmanufactured.getOtherCharacteristics().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Color ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsColor() != null ) {

				for( String currListStrSplit : m.getMdcnlPrdctMnfctredPhysclCrctrstcsColor().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicinalproductmanufactured.getPhysicalCharacteristics().addColor(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Depth_Cd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsDepthCd() != null ) {

			if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsDepthCd().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredPhysclCrctrstcsDepthCd()==null) {} else {
			medicinalproductmanufactured.getPhysicalCharacteristics().getDepth().setCode(m.getMdcnlPrdctMnfctredPhysclCrctrstcsDepthCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Depth_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsDepthCmprtr() != null ) {

			if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsDepthCmprtr().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredPhysclCrctrstcsDepthCmprtr()==null) {} else {
			medicinalproductmanufactured.getPhysicalCharacteristics().getDepth().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(m.getMdcnlPrdctMnfctredPhysclCrctrstcsDepthCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Depth_Sys ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsDepthSys() != null ) {

			if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsDepthSys().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredPhysclCrctrstcsDepthSys()==null) {} else {
			medicinalproductmanufactured.getPhysicalCharacteristics().getDepth().setSystem(m.getMdcnlPrdctMnfctredPhysclCrctrstcsDepthSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Depth_Unt ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsDepthUnt() != null ) {

			if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsDepthUnt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredPhysclCrctrstcsDepthUnt()==null) {} else {
			medicinalproductmanufactured.getPhysicalCharacteristics().getDepth().setUnit(m.getMdcnlPrdctMnfctredPhysclCrctrstcsDepthUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Depth_Vl ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsDepthVl() != null ) {

			if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsDepthVl().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredPhysclCrctrstcsDepthVl()==null) {} else {
			medicinalproductmanufactured.getPhysicalCharacteristics().getDepth().setValue((new java.math.BigDecimal((m.getMdcnlPrdctMnfctredPhysclCrctrstcsDepthVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_ExternalDiameter_Cd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterCd() != null ) {

			if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterCd().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterCd()==null) {} else {
			medicinalproductmanufactured.getPhysicalCharacteristics().getExternalDiameter().setCode(m.getMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_ExternalDiameter_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterCmprtr() != null ) {

			if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterCmprtr().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterCmprtr()==null) {} else {
			medicinalproductmanufactured.getPhysicalCharacteristics().getExternalDiameter().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(m.getMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_ExternalDiameter_Sys ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterSys() != null ) {

			if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterSys().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterSys()==null) {} else {
			medicinalproductmanufactured.getPhysicalCharacteristics().getExternalDiameter().setSystem(m.getMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_ExternalDiameter_Unt ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterUnt() != null ) {

			if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterUnt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterUnt()==null) {} else {
			medicinalproductmanufactured.getPhysicalCharacteristics().getExternalDiameter().setUnit(m.getMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_ExternalDiameter_Vl ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterVl() != null ) {

			if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterVl().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterVl()==null) {} else {
			medicinalproductmanufactured.getPhysicalCharacteristics().getExternalDiameter().setValue((new java.math.BigDecimal((m.getMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Height_Cd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsHeightCd() != null ) {

			if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsHeightCd().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredPhysclCrctrstcsHeightCd()==null) {} else {
			medicinalproductmanufactured.getPhysicalCharacteristics().getHeight().setCode(m.getMdcnlPrdctMnfctredPhysclCrctrstcsHeightCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Height_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsHeightCmprtr() != null ) {

			if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsHeightCmprtr().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredPhysclCrctrstcsHeightCmprtr()==null) {} else {
			medicinalproductmanufactured.getPhysicalCharacteristics().getHeight().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(m.getMdcnlPrdctMnfctredPhysclCrctrstcsHeightCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Height_Sys ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsHeightSys() != null ) {

			if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsHeightSys().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredPhysclCrctrstcsHeightSys()==null) {} else {
			medicinalproductmanufactured.getPhysicalCharacteristics().getHeight().setSystem(m.getMdcnlPrdctMnfctredPhysclCrctrstcsHeightSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Height_Unt ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsHeightUnt() != null ) {

			if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsHeightUnt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredPhysclCrctrstcsHeightUnt()==null) {} else {
			medicinalproductmanufactured.getPhysicalCharacteristics().getHeight().setUnit(m.getMdcnlPrdctMnfctredPhysclCrctrstcsHeightUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Height_Vl ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsHeightVl() != null ) {

			if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsHeightVl().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredPhysclCrctrstcsHeightVl()==null) {} else {
			medicinalproductmanufactured.getPhysicalCharacteristics().getHeight().setValue((new java.math.BigDecimal((m.getMdcnlPrdctMnfctredPhysclCrctrstcsHeightVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Image_CntntTyp ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsImageCntntTyp() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctredPhysclCrctrstcsImageCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductmanufactured.getPhysicalCharacteristics().getImage().size() < i0+1) { medicinalproductmanufactured.getPhysicalCharacteristics().addImage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductmanufactured.getPhysicalCharacteristics().getImage().get(i0).setContentType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Image_Creation ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsImageCreation() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctredPhysclCrctrstcsImageCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductmanufactured.getPhysicalCharacteristics().getImage().size() < i0+1) { medicinalproductmanufactured.getPhysicalCharacteristics().addImage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductmanufactured.getPhysicalCharacteristics().getImage().get(i0).setCreation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Image_Data ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsImageData() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctredPhysclCrctrstcsImageData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductmanufactured.getPhysicalCharacteristics().getImage().size() < i0+1) { medicinalproductmanufactured.getPhysicalCharacteristics().addImage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductmanufactured.getPhysicalCharacteristics().getImage().get(i0).setData(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Image_Hash ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsImageHash() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctredPhysclCrctrstcsImageHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductmanufactured.getPhysicalCharacteristics().getImage().size() < i0+1) { medicinalproductmanufactured.getPhysicalCharacteristics().addImage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductmanufactured.getPhysicalCharacteristics().getImage().get(i0).setHash(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Image_Lnguage ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsImageLnguage() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctredPhysclCrctrstcsImageLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductmanufactured.getPhysicalCharacteristics().getImage().size() < i0+1) { medicinalproductmanufactured.getPhysicalCharacteristics().addImage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductmanufactured.getPhysicalCharacteristics().getImage().get(i0).setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Image_Sz ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsImageSz() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctredPhysclCrctrstcsImageSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductmanufactured.getPhysicalCharacteristics().getImage().size() < i0+1) { medicinalproductmanufactured.getPhysicalCharacteristics().addImage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductmanufactured.getPhysicalCharacteristics().getImage().get(i0).setSize(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Image_Ttl ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsImageTtl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctredPhysclCrctrstcsImageTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductmanufactured.getPhysicalCharacteristics().getImage().size() < i0+1) { medicinalproductmanufactured.getPhysicalCharacteristics().addImage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductmanufactured.getPhysicalCharacteristics().getImage().get(i0).setTitle(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Image_Url ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsImageUrl() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctredPhysclCrctrstcsImageUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductmanufactured.getPhysicalCharacteristics().getImage().size() < i0+1) { medicinalproductmanufactured.getPhysicalCharacteristics().addImage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductmanufactured.getPhysicalCharacteristics().getImage().get(i0).setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Imprint ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsImprint() != null ) {

				for( String currListStrSplit : m.getMdcnlPrdctMnfctredPhysclCrctrstcsImprint().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicinalproductmanufactured.getPhysicalCharacteristics().addImprint(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_NominalVolume_Cd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeCd() != null ) {

			if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeCd().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeCd()==null) {} else {
			medicinalproductmanufactured.getPhysicalCharacteristics().getNominalVolume().setCode(m.getMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_NominalVolume_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeCmprtr() != null ) {

			if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeCmprtr().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeCmprtr()==null) {} else {
			medicinalproductmanufactured.getPhysicalCharacteristics().getNominalVolume().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(m.getMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_NominalVolume_Sys ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeSys() != null ) {

			if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeSys().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeSys()==null) {} else {
			medicinalproductmanufactured.getPhysicalCharacteristics().getNominalVolume().setSystem(m.getMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_NominalVolume_Unt ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeUnt() != null ) {

			if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeUnt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeUnt()==null) {} else {
			medicinalproductmanufactured.getPhysicalCharacteristics().getNominalVolume().setUnit(m.getMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_NominalVolume_Vl ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeVl() != null ) {

			if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeVl().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeVl()==null) {} else {
			medicinalproductmanufactured.getPhysicalCharacteristics().getNominalVolume().setValue((new java.math.BigDecimal((m.getMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Scoring_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductmanufactured.getPhysicalCharacteristics().getScoring().getCoding().size() < i0+1) { medicinalproductmanufactured.getPhysicalCharacteristics().getScoring().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductmanufactured.getPhysicalCharacteristics().getScoring().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Scoring_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductmanufactured.getPhysicalCharacteristics().getScoring().getCoding().size() < i0+1) { medicinalproductmanufactured.getPhysicalCharacteristics().getScoring().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductmanufactured.getPhysicalCharacteristics().getScoring().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Scoring_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductmanufactured.getPhysicalCharacteristics().getScoring().getCoding().size() < i0+1) { medicinalproductmanufactured.getPhysicalCharacteristics().getScoring().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductmanufactured.getPhysicalCharacteristics().getScoring().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Scoring_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductmanufactured.getPhysicalCharacteristics().getScoring().getCoding().size() < i0+1) { medicinalproductmanufactured.getPhysicalCharacteristics().getScoring().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductmanufactured.getPhysicalCharacteristics().getScoring().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Scoring_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductmanufactured.getPhysicalCharacteristics().getScoring().getCoding().size() < i0+1) { medicinalproductmanufactured.getPhysicalCharacteristics().getScoring().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductmanufactured.getPhysicalCharacteristics().getScoring().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Scoring_Txt ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsScoringTxt() != null ) {

			if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsScoringTxt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredPhysclCrctrstcsScoringTxt()==null) {} else {
			medicinalproductmanufactured.getPhysicalCharacteristics().getScoring().setText(m.getMdcnlPrdctMnfctredPhysclCrctrstcsScoringTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Shape ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsShape() != null ) {

			if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsShape().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredPhysclCrctrstcsShape()==null) {} else {
			medicinalproductmanufactured.getPhysicalCharacteristics().setShape(m.getMdcnlPrdctMnfctredPhysclCrctrstcsShape().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Wght_Cd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWghtCd() != null ) {

			if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWghtCd().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredPhysclCrctrstcsWghtCd()==null) {} else {
			medicinalproductmanufactured.getPhysicalCharacteristics().getWeight().setCode(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWghtCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Wght_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWghtCmprtr() != null ) {

			if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWghtCmprtr().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredPhysclCrctrstcsWghtCmprtr()==null) {} else {
			medicinalproductmanufactured.getPhysicalCharacteristics().getWeight().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWghtCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Wght_Sys ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWghtSys() != null ) {

			if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWghtSys().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredPhysclCrctrstcsWghtSys()==null) {} else {
			medicinalproductmanufactured.getPhysicalCharacteristics().getWeight().setSystem(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWghtSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Wght_Unt ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWghtUnt() != null ) {

			if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWghtUnt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredPhysclCrctrstcsWghtUnt()==null) {} else {
			medicinalproductmanufactured.getPhysicalCharacteristics().getWeight().setUnit(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWghtUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Wght_Vl ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWghtVl() != null ) {

			if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWghtVl().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredPhysclCrctrstcsWghtVl()==null) {} else {
			medicinalproductmanufactured.getPhysicalCharacteristics().getWeight().setValue((new java.math.BigDecimal((m.getMdcnlPrdctMnfctredPhysclCrctrstcsWghtVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Width_Cd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWidthCd() != null ) {

			if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWidthCd().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredPhysclCrctrstcsWidthCd()==null) {} else {
			medicinalproductmanufactured.getPhysicalCharacteristics().getWidth().setCode(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWidthCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Width_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWidthCmprtr() != null ) {

			if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWidthCmprtr().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredPhysclCrctrstcsWidthCmprtr()==null) {} else {
			medicinalproductmanufactured.getPhysicalCharacteristics().getWidth().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWidthCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Width_Sys ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWidthSys() != null ) {

			if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWidthSys().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredPhysclCrctrstcsWidthSys()==null) {} else {
			medicinalproductmanufactured.getPhysicalCharacteristics().getWidth().setSystem(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWidthSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Width_Unt ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWidthUnt() != null ) {

			if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWidthUnt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredPhysclCrctrstcsWidthUnt()==null) {} else {
			medicinalproductmanufactured.getPhysicalCharacteristics().getWidth().setUnit(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWidthUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Width_Vl ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWidthVl() != null ) {

			if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWidthVl().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredPhysclCrctrstcsWidthVl()==null) {} else {
			medicinalproductmanufactured.getPhysicalCharacteristics().getWidth().setValue((new java.math.BigDecimal((m.getMdcnlPrdctMnfctredPhysclCrctrstcsWidthVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** MdcnlPrdctMnfctred_Qnty_Cd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredQntyCd() != null ) {

			if(m.getMdcnlPrdctMnfctredQntyCd().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredQntyCd()==null) {} else {
			medicinalproductmanufactured.getQuantity().setCode(m.getMdcnlPrdctMnfctredQntyCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctMnfctred_Qnty_Cmprtr ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredQntyCmprtr() != null ) {

			if(m.getMdcnlPrdctMnfctredQntyCmprtr().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredQntyCmprtr()==null) {} else {
			medicinalproductmanufactured.getQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(m.getMdcnlPrdctMnfctredQntyCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdcnlPrdctMnfctred_Qnty_Sys ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredQntySys() != null ) {

			if(m.getMdcnlPrdctMnfctredQntySys().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredQntySys()==null) {} else {
			medicinalproductmanufactured.getQuantity().setSystem(m.getMdcnlPrdctMnfctredQntySys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctMnfctred_Qnty_Unt ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredQntyUnt() != null ) {

			if(m.getMdcnlPrdctMnfctredQntyUnt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredQntyUnt()==null) {} else {
			medicinalproductmanufactured.getQuantity().setUnit(m.getMdcnlPrdctMnfctredQntyUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdcnlPrdctMnfctred_Qnty_Vl ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredQntyVl() != null ) {

			if(m.getMdcnlPrdctMnfctredQntyVl().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredQntyVl()==null) {} else {
			medicinalproductmanufactured.getQuantity().setValue((new java.math.BigDecimal((m.getMdcnlPrdctMnfctredQntyVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** MdcnlPrdctMnfctred_UntOfPrsnttn_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredUntOfPrsnttnCdgCd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctredUntOfPrsnttnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductmanufactured.getUnitOfPresentation().getCoding().size() < i0+1) { medicinalproductmanufactured.getUnitOfPresentation().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductmanufactured.getUnitOfPresentation().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctMnfctred_UntOfPrsnttn_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredUntOfPrsnttnCdgDsply() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctredUntOfPrsnttnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductmanufactured.getUnitOfPresentation().getCoding().size() < i0+1) { medicinalproductmanufactured.getUnitOfPresentation().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductmanufactured.getUnitOfPresentation().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctMnfctred_UntOfPrsnttn_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredUntOfPrsnttnCdgSys() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctredUntOfPrsnttnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductmanufactured.getUnitOfPresentation().getCoding().size() < i0+1) { medicinalproductmanufactured.getUnitOfPresentation().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductmanufactured.getUnitOfPresentation().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctMnfctred_UntOfPrsnttn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredUntOfPrsnttnCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctredUntOfPrsnttnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductmanufactured.getUnitOfPresentation().getCoding().size() < i0+1) { medicinalproductmanufactured.getUnitOfPresentation().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductmanufactured.getUnitOfPresentation().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdcnlPrdctMnfctred_UntOfPrsnttn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredUntOfPrsnttnCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdcnlPrdctMnfctredUntOfPrsnttnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicinalproductmanufactured.getUnitOfPresentation().getCoding().size() < i0+1) { medicinalproductmanufactured.getUnitOfPresentation().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicinalproductmanufactured.getUnitOfPresentation().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdcnlPrdctMnfctred_UntOfPrsnttn_Txt ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredUntOfPrsnttnTxt() != null ) {

			if(m.getMdcnlPrdctMnfctredUntOfPrsnttnTxt().replace("[","").replace("]","").equals("NULL") | m.getMdcnlPrdctMnfctredUntOfPrsnttnTxt()==null) {} else {
			medicinalproductmanufactured.getUnitOfPresentation().setText(m.getMdcnlPrdctMnfctredUntOfPrsnttnTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return medicinalproductmanufactured;
	}
}
