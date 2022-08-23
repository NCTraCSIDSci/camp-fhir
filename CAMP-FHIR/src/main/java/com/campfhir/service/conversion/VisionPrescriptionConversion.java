package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.VisionPrescription;
public class VisionPrescriptionConversion 
{
	public org.hl7.fhir.r4.model.VisionPrescription VisionPrescriptions(VisionPrescription v) throws ParseException
	{
		org.hl7.fhir.r4.model.VisionPrescription visionprescription = new org.hl7.fhir.r4.model.VisionPrescription();

		/******************** id ********************************************************************************/
		visionprescription.setId(v.getId());

		/******************** VisionPrescription_Created ********************************************************************************/
		if(v.getVisionPrescriptionCreated() != null ) {

			if(v.getVisionPrescriptionCreated().replace("[","").replace("]","").equals("NULL") | v.getVisionPrescriptionCreated()==null) {} else {
			visionprescription.setCreated(v.getVisionPrescriptionCreated().replace("[","").replace("]","").equals("NULL") | v.getVisionPrescriptionCreated()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(v.getVisionPrescriptionCreated().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VisionPrescription_DtWritten ********************************************************************************/
		if(v.getVisionPrescriptionDtWritten() != null ) {

			if(v.getVisionPrescriptionDtWritten().replace("[","").replace("]","").equals("NULL") | v.getVisionPrescriptionDtWritten()==null) {} else {
			visionprescription.setDateWritten(v.getVisionPrescriptionDtWritten().replace("[","").replace("]","").equals("NULL") | v.getVisionPrescriptionDtWritten()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(v.getVisionPrescriptionDtWritten().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VisionPrescription_Enc ********************************************************************************/
		if(v.getVisionPrescriptionEnc() != null ) {

			if(v.getVisionPrescriptionEnc().replace("[","").replace("]","").equals("NULL") | v.getVisionPrescriptionEnc()==null) {} else {
			visionprescription.setEncounter(new org.hl7.fhir.r4.model.Reference(v.getVisionPrescriptionEnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VisionPrescription_Id_Assigner ********************************************************************************/
		if(v.getVisionPrescriptionIdAssigner() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getIdentifier().size() < i0+1) { visionprescription.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {visionprescription.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VisionPrescription_Id_Prd_End ********************************************************************************/
		if(v.getVisionPrescriptionIdPrdEnd() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getIdentifier().size() < i0+1) { visionprescription.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {visionprescription.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VisionPrescription_Id_Prd_Strt ********************************************************************************/
		if(v.getVisionPrescriptionIdPrdStrt() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getIdentifier().size() < i0+1) { visionprescription.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {visionprescription.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VisionPrescription_Id_Sys ********************************************************************************/
		if(v.getVisionPrescriptionIdSys() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getIdentifier().size() < i0+1) { visionprescription.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {visionprescription.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VisionPrescription_Id_Typ_Cdg_Cd ********************************************************************************/
		if(v.getVisionPrescriptionIdTypCdgCd() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getIdentifier().size() < i0+1) { visionprescription.addIdentifier(); }
				String[] arrayi1 = v.getVisionPrescriptionIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(visionprescription.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { visionprescription.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {visionprescription.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VisionPrescription_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(v.getVisionPrescriptionIdTypCdgDsply() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getIdentifier().size() < i0+1) { visionprescription.addIdentifier(); }
				String[] arrayi1 = v.getVisionPrescriptionIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(visionprescription.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { visionprescription.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {visionprescription.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VisionPrescription_Id_Typ_Cdg_Sys ********************************************************************************/
		if(v.getVisionPrescriptionIdTypCdgSys() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getIdentifier().size() < i0+1) { visionprescription.addIdentifier(); }
				String[] arrayi1 = v.getVisionPrescriptionIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(visionprescription.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { visionprescription.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {visionprescription.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VisionPrescription_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(v.getVisionPrescriptionIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getIdentifier().size() < i0+1) { visionprescription.addIdentifier(); }
				String[] arrayi1 = v.getVisionPrescriptionIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(visionprescription.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { visionprescription.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {visionprescription.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** VisionPrescription_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(v.getVisionPrescriptionIdTypCdgVrsn() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getIdentifier().size() < i0+1) { visionprescription.addIdentifier(); }
				String[] arrayi1 = v.getVisionPrescriptionIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(visionprescription.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { visionprescription.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {visionprescription.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VisionPrescription_Id_Typ_Txt ********************************************************************************/
		if(v.getVisionPrescriptionIdTypTxt() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getIdentifier().size() < i0+1) { visionprescription.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {visionprescription.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VisionPrescription_Id_Use ********************************************************************************/
		if(v.getVisionPrescriptionIdUse() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getIdentifier().size() < i0+1) { visionprescription.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {visionprescription.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VisionPrescription_Id_Vl ********************************************************************************/
		if(v.getVisionPrescriptionIdVl() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getIdentifier().size() < i0+1) { visionprescription.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {visionprescription.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VisionPrescription_LensSpcfctn_Add ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnAdd() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionLensSpcfctnAdd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getLensSpecification().size() < i0+1) { visionprescription.addLensSpecification(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {visionprescription.getLensSpecification().get(i0).setAdd((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** VisionPrescription_LensSpcfctn_Axis ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnAxis() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionLensSpcfctnAxis().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getLensSpecification().size() < i0+1) { visionprescription.addLensSpecification(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {visionprescription.getLensSpecification().get(i0).setAxis(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VisionPrescription_LensSpcfctn_BackCurve ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnBackCurve() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionLensSpcfctnBackCurve().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getLensSpecification().size() < i0+1) { visionprescription.addLensSpecification(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {visionprescription.getLensSpecification().get(i0).setBackCurve((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** VisionPrescription_LensSpcfctn_Brand ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnBrand() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionLensSpcfctnBrand().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getLensSpecification().size() < i0+1) { visionprescription.addLensSpecification(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {visionprescription.getLensSpecification().get(i0).setBrand(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VisionPrescription_LensSpcfctn_Color ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnColor() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionLensSpcfctnColor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getLensSpecification().size() < i0+1) { visionprescription.addLensSpecification(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {visionprescription.getLensSpecification().get(i0).setColor(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VisionPrescription_LensSpcfctn_Cylinder ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnCylinder() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionLensSpcfctnCylinder().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getLensSpecification().size() < i0+1) { visionprescription.addLensSpecification(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {visionprescription.getLensSpecification().get(i0).setCylinder((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** VisionPrescription_LensSpcfctn_Diameter ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnDiameter() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionLensSpcfctnDiameter().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getLensSpecification().size() < i0+1) { visionprescription.addLensSpecification(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {visionprescription.getLensSpecification().get(i0).setDiameter((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** VisionPrescription_LensSpcfctn_Duration_Cd ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnDurationCd() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionLensSpcfctnDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getLensSpecification().size() < i0+1) { visionprescription.addLensSpecification(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {visionprescription.getLensSpecification().get(i0).getDuration().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VisionPrescription_LensSpcfctn_Duration_Cmprtr ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnDurationCmprtr() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionLensSpcfctnDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getLensSpecification().size() < i0+1) { visionprescription.addLensSpecification(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {visionprescription.getLensSpecification().get(i0).getDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VisionPrescription_LensSpcfctn_Duration_Sys ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnDurationSys() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionLensSpcfctnDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getLensSpecification().size() < i0+1) { visionprescription.addLensSpecification(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {visionprescription.getLensSpecification().get(i0).getDuration().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VisionPrescription_LensSpcfctn_Duration_Unt ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnDurationUnt() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionLensSpcfctnDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getLensSpecification().size() < i0+1) { visionprescription.addLensSpecification(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {visionprescription.getLensSpecification().get(i0).getDuration().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VisionPrescription_LensSpcfctn_Duration_Vl ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnDurationVl() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionLensSpcfctnDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getLensSpecification().size() < i0+1) { visionprescription.addLensSpecification(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {visionprescription.getLensSpecification().get(i0).getDuration().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** VisionPrescription_LensSpcfctn_Eye ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnEye() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionLensSpcfctnEye().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getLensSpecification().size() < i0+1) { visionprescription.addLensSpecification(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {visionprescription.getLensSpecification().get(i0).setEye(new org.hl7.fhir.r4.model.VisionPrescription.VisionEyesEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VisionPrescription_LensSpcfctn_Nt_AthrRfrnc ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnNtAthrRfrnc() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionLensSpcfctnNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getLensSpecification().size() < i0+1) { visionprescription.addLensSpecification(); }
				String[] arrayi1 = v.getVisionPrescriptionLensSpcfctnNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(visionprescription.getLensSpecification().get(i0).getNote().size() < i1+1) { visionprescription.getLensSpecification().get(i0).addNote(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {visionprescription.getLensSpecification().get(i0).getNote().get(i1).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** VisionPrescription_LensSpcfctn_Nt_AthrStrgTyp ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnNtAthrStrgTyp() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionLensSpcfctnNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getLensSpecification().size() < i0+1) { visionprescription.addLensSpecification(); }
				String[] arrayi1 = v.getVisionPrescriptionLensSpcfctnNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(visionprescription.getLensSpecification().get(i0).getNote().size() < i1+1) { visionprescription.getLensSpecification().get(i0).addNote(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {visionprescription.getLensSpecification().get(i0).getNote().get(i1).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** VisionPrescription_LensSpcfctn_Nt_Txt ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnNtTxt() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionLensSpcfctnNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getLensSpecification().size() < i0+1) { visionprescription.addLensSpecification(); }
				String[] arrayi1 = v.getVisionPrescriptionLensSpcfctnNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(visionprescription.getLensSpecification().get(i0).getNote().size() < i1+1) { visionprescription.getLensSpecification().get(i0).addNote(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {visionprescription.getLensSpecification().get(i0).getNote().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VisionPrescription_LensSpcfctn_Nt_Time ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnNtTime() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionLensSpcfctnNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getLensSpecification().size() < i0+1) { visionprescription.addLensSpecification(); }
				String[] arrayi1 = v.getVisionPrescriptionLensSpcfctnNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(visionprescription.getLensSpecification().get(i0).getNote().size() < i1+1) { visionprescription.getLensSpecification().get(i0).addNote(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {visionprescription.getLensSpecification().get(i0).getNote().get(i1).setTime(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** VisionPrescription_LensSpcfctn_Power ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnPower() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionLensSpcfctnPower().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getLensSpecification().size() < i0+1) { visionprescription.addLensSpecification(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {visionprescription.getLensSpecification().get(i0).setPower((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** VisionPrescription_LensSpcfctn_Prism_Amnt ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnPrismAmnt() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionLensSpcfctnPrismAmnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getLensSpecification().size() < i0+1) { visionprescription.addLensSpecification(); }
				String[] arrayi1 = v.getVisionPrescriptionLensSpcfctnPrismAmnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(visionprescription.getLensSpecification().get(i0).getPrism().size() < i1+1) { visionprescription.getLensSpecification().get(i0).addPrism(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {visionprescription.getLensSpecification().get(i0).getPrism().get(i1).setAmount((Double.parseDouble((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** VisionPrescription_LensSpcfctn_Prism_Base ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnPrismBase() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionLensSpcfctnPrismBase().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getLensSpecification().size() < i0+1) { visionprescription.addLensSpecification(); }
				String[] arrayi1 = v.getVisionPrescriptionLensSpcfctnPrismBase().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(visionprescription.getLensSpecification().get(i0).getPrism().size() < i1+1) { visionprescription.getLensSpecification().get(i0).addPrism(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {visionprescription.getLensSpecification().get(i0).getPrism().get(i1).setBase(new org.hl7.fhir.r4.model.VisionPrescription.VisionBaseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** VisionPrescription_LensSpcfctn_Prdct_Cdg_Cd ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnPrdctCdgCd() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionLensSpcfctnPrdctCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getLensSpecification().size() < i0+1) { visionprescription.addLensSpecification(); }
				String[] arrayi1 = v.getVisionPrescriptionLensSpcfctnPrdctCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(visionprescription.getLensSpecification().get(i0).getProduct().getCoding().size() < i1+1) { visionprescription.getLensSpecification().get(i0).getProduct().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {visionprescription.getLensSpecification().get(i0).getProduct().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VisionPrescription_LensSpcfctn_Prdct_Cdg_Dsply ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnPrdctCdgDsply() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionLensSpcfctnPrdctCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getLensSpecification().size() < i0+1) { visionprescription.addLensSpecification(); }
				String[] arrayi1 = v.getVisionPrescriptionLensSpcfctnPrdctCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(visionprescription.getLensSpecification().get(i0).getProduct().getCoding().size() < i1+1) { visionprescription.getLensSpecification().get(i0).getProduct().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {visionprescription.getLensSpecification().get(i0).getProduct().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VisionPrescription_LensSpcfctn_Prdct_Cdg_Sys ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnPrdctCdgSys() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionLensSpcfctnPrdctCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getLensSpecification().size() < i0+1) { visionprescription.addLensSpecification(); }
				String[] arrayi1 = v.getVisionPrescriptionLensSpcfctnPrdctCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(visionprescription.getLensSpecification().get(i0).getProduct().getCoding().size() < i1+1) { visionprescription.getLensSpecification().get(i0).getProduct().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {visionprescription.getLensSpecification().get(i0).getProduct().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VisionPrescription_LensSpcfctn_Prdct_Cdg_UsrSltd ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnPrdctCdgUsrSltd() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionLensSpcfctnPrdctCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getLensSpecification().size() < i0+1) { visionprescription.addLensSpecification(); }
				String[] arrayi1 = v.getVisionPrescriptionLensSpcfctnPrdctCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(visionprescription.getLensSpecification().get(i0).getProduct().getCoding().size() < i1+1) { visionprescription.getLensSpecification().get(i0).getProduct().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {visionprescription.getLensSpecification().get(i0).getProduct().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** VisionPrescription_LensSpcfctn_Prdct_Cdg_Vrsn ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnPrdctCdgVrsn() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionLensSpcfctnPrdctCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getLensSpecification().size() < i0+1) { visionprescription.addLensSpecification(); }
				String[] arrayi1 = v.getVisionPrescriptionLensSpcfctnPrdctCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(visionprescription.getLensSpecification().get(i0).getProduct().getCoding().size() < i1+1) { visionprescription.getLensSpecification().get(i0).getProduct().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {visionprescription.getLensSpecification().get(i0).getProduct().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VisionPrescription_LensSpcfctn_Prdct_Txt ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnPrdctTxt() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionLensSpcfctnPrdctTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getLensSpecification().size() < i0+1) { visionprescription.addLensSpecification(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {visionprescription.getLensSpecification().get(i0).getProduct().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VisionPrescription_LensSpcfctn_Sphere ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnSphere() != null ) {

			String[] arrayi0 = v.getVisionPrescriptionLensSpcfctnSphere().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(visionprescription.getLensSpecification().size() < i0+1) { visionprescription.addLensSpecification(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {visionprescription.getLensSpecification().get(i0).setSphere((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** VisionPrescription_Pnt ********************************************************************************/
		if(v.getVisionPrescriptionPnt() != null ) {

			if(v.getVisionPrescriptionPnt().replace("[","").replace("]","").equals("NULL") | v.getVisionPrescriptionPnt()==null) {} else {
			visionprescription.setPatient(new org.hl7.fhir.r4.model.Reference(v.getVisionPrescriptionPnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VisionPrescription_Prescriber ********************************************************************************/
		if(v.getVisionPrescriptionPrescriber() != null ) {

			if(v.getVisionPrescriptionPrescriber().replace("[","").replace("]","").equals("NULL") | v.getVisionPrescriptionPrescriber()==null) {} else {
			visionprescription.setPrescriber(new org.hl7.fhir.r4.model.Reference(v.getVisionPrescriptionPrescriber().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VisionPrescription_Sts ********************************************************************************/
		if(v.getVisionPrescriptionSts() != null ) {

			if(v.getVisionPrescriptionSts().replace("[","").replace("]","").equals("NULL") | v.getVisionPrescriptionSts()==null) {} else {
			visionprescription.setStatus(new org.hl7.fhir.r4.model.VisionPrescription.VisionStatusEnumFactory().fromCode(v.getVisionPrescriptionSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return visionprescription;
	}
}
