package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicationAdministration;
public class MedicationAdministrationConversion 
{
	public org.hl7.fhir.r4.model.MedicationAdministration MedicationAdministrations(MedicationAdministration m) throws ParseException
	{
		org.hl7.fhir.r4.model.MedicationAdministration medicationadministration = new org.hl7.fhir.r4.model.MedicationAdministration();

		/******************** id ********************************************************************************/
		medicationadministration.setId(m.getId());

		/******************** MdctnAdmnstn_Ctgry_Cdg_Cd ********************************************************************************/
		if(m.getMdctnAdmnstnCtgryCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getCategory().getCoding().size() < i0+1) { medicationadministration.getCategory().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getCategory().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnAdmnstn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnAdmnstnCtgryCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getCategory().getCoding().size() < i0+1) { medicationadministration.getCategory().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getCategory().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnAdmnstn_Ctgry_Cdg_Sys ********************************************************************************/
		if(m.getMdctnAdmnstnCtgryCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getCategory().getCoding().size() < i0+1) { medicationadministration.getCategory().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getCategory().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnAdmnstn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnAdmnstnCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getCategory().getCoding().size() < i0+1) { medicationadministration.getCategory().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getCategory().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnAdmnstn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnAdmnstnCtgryCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getCategory().getCoding().size() < i0+1) { medicationadministration.getCategory().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getCategory().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnAdmnstn_Ctgry_Txt ********************************************************************************/
		if(m.getMdctnAdmnstnCtgryTxt() != null ) {

			if(m.getMdctnAdmnstnCtgryTxt().replace("[","").replace("]","").equals("NULL") | m.getMdctnAdmnstnCtgryTxt()==null) {} else {
			medicationadministration.getCategory().setText(m.getMdctnAdmnstnCtgryTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnAdmnstn_Cntxt ********************************************************************************/
		if(m.getMdctnAdmnstnCntxt() != null ) {

			if(m.getMdctnAdmnstnCntxt().replace("[","").replace("]","").equals("NULL") | m.getMdctnAdmnstnCntxt()==null) {} else {
			medicationadministration.setContext(new org.hl7.fhir.r4.model.Reference(m.getMdctnAdmnstnCntxt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnAdmnstn_Dvc ********************************************************************************/
		if(m.getMdctnAdmnstnDvc() != null ) {

				for( String currListStrSplit : m.getMdctnAdmnstnDvc().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicationadministration.addDevice(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdctnAdmnstn_Dsg_Dose_Cd ********************************************************************************/
		if(m.getMdctnAdmnstnDsgDoseCd() != null ) {

			if(m.getMdctnAdmnstnDsgDoseCd().replace("[","").replace("]","").equals("NULL") | m.getMdctnAdmnstnDsgDoseCd()==null) {} else {
			medicationadministration.getDosage().getDose().setCode(m.getMdctnAdmnstnDsgDoseCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnAdmnstn_Dsg_Dose_Cmprtr ********************************************************************************/
		if(m.getMdctnAdmnstnDsgDoseCmprtr() != null ) {

			if(m.getMdctnAdmnstnDsgDoseCmprtr().replace("[","").replace("]","").equals("NULL") | m.getMdctnAdmnstnDsgDoseCmprtr()==null) {} else {
			medicationadministration.getDosage().getDose().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(m.getMdctnAdmnstnDsgDoseCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnAdmnstn_Dsg_Dose_Sys ********************************************************************************/
		if(m.getMdctnAdmnstnDsgDoseSys() != null ) {

			if(m.getMdctnAdmnstnDsgDoseSys().replace("[","").replace("]","").equals("NULL") | m.getMdctnAdmnstnDsgDoseSys()==null) {} else {
			medicationadministration.getDosage().getDose().setSystem(m.getMdctnAdmnstnDsgDoseSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnAdmnstn_Dsg_Dose_Unt ********************************************************************************/
		if(m.getMdctnAdmnstnDsgDoseUnt() != null ) {

			if(m.getMdctnAdmnstnDsgDoseUnt().replace("[","").replace("]","").equals("NULL") | m.getMdctnAdmnstnDsgDoseUnt()==null) {} else {
			medicationadministration.getDosage().getDose().setUnit(m.getMdctnAdmnstnDsgDoseUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnAdmnstn_Dsg_Dose_Vl ********************************************************************************/
		if(m.getMdctnAdmnstnDsgDoseVl() != null ) {

			if(m.getMdctnAdmnstnDsgDoseVl().replace("[","").replace("]","").equals("NULL") | m.getMdctnAdmnstnDsgDoseVl()==null) {} else {
			medicationadministration.getDosage().getDose().setValue((new java.math.BigDecimal((m.getMdctnAdmnstnDsgDoseVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** MdctnAdmnstn_Dsg_Mthd_Cdg_Cd ********************************************************************************/
		if(m.getMdctnAdmnstnDsgMthdCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnDsgMthdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getDosage().getMethod().getCoding().size() < i0+1) { medicationadministration.getDosage().getMethod().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getDosage().getMethod().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnAdmnstn_Dsg_Mthd_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnAdmnstnDsgMthdCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnDsgMthdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getDosage().getMethod().getCoding().size() < i0+1) { medicationadministration.getDosage().getMethod().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getDosage().getMethod().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnAdmnstn_Dsg_Mthd_Cdg_Sys ********************************************************************************/
		if(m.getMdctnAdmnstnDsgMthdCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnDsgMthdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getDosage().getMethod().getCoding().size() < i0+1) { medicationadministration.getDosage().getMethod().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getDosage().getMethod().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnAdmnstn_Dsg_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnAdmnstnDsgMthdCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnDsgMthdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getDosage().getMethod().getCoding().size() < i0+1) { medicationadministration.getDosage().getMethod().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getDosage().getMethod().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnAdmnstn_Dsg_Mthd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnAdmnstnDsgMthdCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnDsgMthdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getDosage().getMethod().getCoding().size() < i0+1) { medicationadministration.getDosage().getMethod().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getDosage().getMethod().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnAdmnstn_Dsg_Mthd_Txt ********************************************************************************/
		if(m.getMdctnAdmnstnDsgMthdTxt() != null ) {

			if(m.getMdctnAdmnstnDsgMthdTxt().replace("[","").replace("]","").equals("NULL") | m.getMdctnAdmnstnDsgMthdTxt()==null) {} else {
			medicationadministration.getDosage().getMethod().setText(m.getMdctnAdmnstnDsgMthdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnAdmnstn_Dsg_RtQnty_Cd ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRtQntyCd() != null ) {

			if(m.getMdctnAdmnstnDsgRtQntyCd().replace("[","").replace("]","").equals("NULL") | m.getMdctnAdmnstnDsgRtQntyCd()==null) {} else {
			medicationadministration.getDosage().getRateQuantity().setCode(m.getMdctnAdmnstnDsgRtQntyCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnAdmnstn_Dsg_RtQnty_Cmprtr ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRtQntyCmprtr() != null ) {

			if(m.getMdctnAdmnstnDsgRtQntyCmprtr().replace("[","").replace("]","").equals("NULL") | m.getMdctnAdmnstnDsgRtQntyCmprtr()==null) {} else {
			medicationadministration.getDosage().getRateQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(m.getMdctnAdmnstnDsgRtQntyCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnAdmnstn_Dsg_RtQnty_Sys ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRtQntySys() != null ) {

			if(m.getMdctnAdmnstnDsgRtQntySys().replace("[","").replace("]","").equals("NULL") | m.getMdctnAdmnstnDsgRtQntySys()==null) {} else {
			medicationadministration.getDosage().getRateQuantity().setSystem(m.getMdctnAdmnstnDsgRtQntySys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnAdmnstn_Dsg_RtQnty_Unt ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRtQntyUnt() != null ) {

			if(m.getMdctnAdmnstnDsgRtQntyUnt().replace("[","").replace("]","").equals("NULL") | m.getMdctnAdmnstnDsgRtQntyUnt()==null) {} else {
			medicationadministration.getDosage().getRateQuantity().setUnit(m.getMdctnAdmnstnDsgRtQntyUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnAdmnstn_Dsg_RtQnty_Vl ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRtQntyVl() != null ) {

			if(m.getMdctnAdmnstnDsgRtQntyVl().replace("[","").replace("]","").equals("NULL") | m.getMdctnAdmnstnDsgRtQntyVl()==null) {} else {
			medicationadministration.getDosage().getRateQuantity().setValue((new java.math.BigDecimal((m.getMdctnAdmnstnDsgRtQntyVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** MdctnAdmnstn_Dsg_RtRtio_Dnmntr_Cd ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRtRtioDnmntrCd() != null ) {

			if(m.getMdctnAdmnstnDsgRtRtioDnmntrCd().replace("[","").replace("]","").equals("NULL") | m.getMdctnAdmnstnDsgRtRtioDnmntrCd()==null) {} else {
			medicationadministration.getDosage().getRateRatio().getDenominator().setCode(m.getMdctnAdmnstnDsgRtRtioDnmntrCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnAdmnstn_Dsg_RtRtio_Dnmntr_Cmprtr ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRtRtioDnmntrCmprtr() != null ) {

			if(m.getMdctnAdmnstnDsgRtRtioDnmntrCmprtr().replace("[","").replace("]","").equals("NULL") | m.getMdctnAdmnstnDsgRtRtioDnmntrCmprtr()==null) {} else {
			medicationadministration.getDosage().getRateRatio().getDenominator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(m.getMdctnAdmnstnDsgRtRtioDnmntrCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnAdmnstn_Dsg_RtRtio_Dnmntr_Sys ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRtRtioDnmntrSys() != null ) {

			if(m.getMdctnAdmnstnDsgRtRtioDnmntrSys().replace("[","").replace("]","").equals("NULL") | m.getMdctnAdmnstnDsgRtRtioDnmntrSys()==null) {} else {
			medicationadministration.getDosage().getRateRatio().getDenominator().setSystem(m.getMdctnAdmnstnDsgRtRtioDnmntrSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnAdmnstn_Dsg_RtRtio_Dnmntr_Unt ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRtRtioDnmntrUnt() != null ) {

			if(m.getMdctnAdmnstnDsgRtRtioDnmntrUnt().replace("[","").replace("]","").equals("NULL") | m.getMdctnAdmnstnDsgRtRtioDnmntrUnt()==null) {} else {
			medicationadministration.getDosage().getRateRatio().getDenominator().setUnit(m.getMdctnAdmnstnDsgRtRtioDnmntrUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnAdmnstn_Dsg_RtRtio_Dnmntr_Vl ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRtRtioDnmntrVl() != null ) {

			if(m.getMdctnAdmnstnDsgRtRtioDnmntrVl().replace("[","").replace("]","").equals("NULL") | m.getMdctnAdmnstnDsgRtRtioDnmntrVl()==null) {} else {
			medicationadministration.getDosage().getRateRatio().getDenominator().setValue((new java.math.BigDecimal((m.getMdctnAdmnstnDsgRtRtioDnmntrVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** MdctnAdmnstn_Dsg_RtRtio_Nmrtr_Cd ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRtRtioNmrtrCd() != null ) {

			if(m.getMdctnAdmnstnDsgRtRtioNmrtrCd().replace("[","").replace("]","").equals("NULL") | m.getMdctnAdmnstnDsgRtRtioNmrtrCd()==null) {} else {
			medicationadministration.getDosage().getRateRatio().getNumerator().setCode(m.getMdctnAdmnstnDsgRtRtioNmrtrCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnAdmnstn_Dsg_RtRtio_Nmrtr_Cmprtr ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRtRtioNmrtrCmprtr() != null ) {

			if(m.getMdctnAdmnstnDsgRtRtioNmrtrCmprtr().replace("[","").replace("]","").equals("NULL") | m.getMdctnAdmnstnDsgRtRtioNmrtrCmprtr()==null) {} else {
			medicationadministration.getDosage().getRateRatio().getNumerator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(m.getMdctnAdmnstnDsgRtRtioNmrtrCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnAdmnstn_Dsg_RtRtio_Nmrtr_Sys ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRtRtioNmrtrSys() != null ) {

			if(m.getMdctnAdmnstnDsgRtRtioNmrtrSys().replace("[","").replace("]","").equals("NULL") | m.getMdctnAdmnstnDsgRtRtioNmrtrSys()==null) {} else {
			medicationadministration.getDosage().getRateRatio().getNumerator().setSystem(m.getMdctnAdmnstnDsgRtRtioNmrtrSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnAdmnstn_Dsg_RtRtio_Nmrtr_Unt ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRtRtioNmrtrUnt() != null ) {

			if(m.getMdctnAdmnstnDsgRtRtioNmrtrUnt().replace("[","").replace("]","").equals("NULL") | m.getMdctnAdmnstnDsgRtRtioNmrtrUnt()==null) {} else {
			medicationadministration.getDosage().getRateRatio().getNumerator().setUnit(m.getMdctnAdmnstnDsgRtRtioNmrtrUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnAdmnstn_Dsg_RtRtio_Nmrtr_Vl ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRtRtioNmrtrVl() != null ) {

			if(m.getMdctnAdmnstnDsgRtRtioNmrtrVl().replace("[","").replace("]","").equals("NULL") | m.getMdctnAdmnstnDsgRtRtioNmrtrVl()==null) {} else {
			medicationadministration.getDosage().getRateRatio().getNumerator().setValue((new java.math.BigDecimal((m.getMdctnAdmnstnDsgRtRtioNmrtrVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** MdctnAdmnstn_Dsg_Route_Cdg_Cd ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRouteCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnDsgRouteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getDosage().getRoute().getCoding().size() < i0+1) { medicationadministration.getDosage().getRoute().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getDosage().getRoute().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnAdmnstn_Dsg_Route_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRouteCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnDsgRouteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getDosage().getRoute().getCoding().size() < i0+1) { medicationadministration.getDosage().getRoute().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getDosage().getRoute().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnAdmnstn_Dsg_Route_Cdg_Sys ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRouteCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnDsgRouteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getDosage().getRoute().getCoding().size() < i0+1) { medicationadministration.getDosage().getRoute().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getDosage().getRoute().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnAdmnstn_Dsg_Route_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRouteCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnDsgRouteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getDosage().getRoute().getCoding().size() < i0+1) { medicationadministration.getDosage().getRoute().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getDosage().getRoute().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnAdmnstn_Dsg_Route_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRouteCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnDsgRouteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getDosage().getRoute().getCoding().size() < i0+1) { medicationadministration.getDosage().getRoute().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getDosage().getRoute().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnAdmnstn_Dsg_Route_Txt ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRouteTxt() != null ) {

			if(m.getMdctnAdmnstnDsgRouteTxt().replace("[","").replace("]","").equals("NULL") | m.getMdctnAdmnstnDsgRouteTxt()==null) {} else {
			medicationadministration.getDosage().getRoute().setText(m.getMdctnAdmnstnDsgRouteTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnAdmnstn_Dsg_Site_Cdg_Cd ********************************************************************************/
		if(m.getMdctnAdmnstnDsgSiteCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnDsgSiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getDosage().getSite().getCoding().size() < i0+1) { medicationadministration.getDosage().getSite().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getDosage().getSite().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnAdmnstn_Dsg_Site_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnAdmnstnDsgSiteCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnDsgSiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getDosage().getSite().getCoding().size() < i0+1) { medicationadministration.getDosage().getSite().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getDosage().getSite().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnAdmnstn_Dsg_Site_Cdg_Sys ********************************************************************************/
		if(m.getMdctnAdmnstnDsgSiteCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnDsgSiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getDosage().getSite().getCoding().size() < i0+1) { medicationadministration.getDosage().getSite().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getDosage().getSite().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnAdmnstn_Dsg_Site_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnAdmnstnDsgSiteCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnDsgSiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getDosage().getSite().getCoding().size() < i0+1) { medicationadministration.getDosage().getSite().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getDosage().getSite().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnAdmnstn_Dsg_Site_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnAdmnstnDsgSiteCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnDsgSiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getDosage().getSite().getCoding().size() < i0+1) { medicationadministration.getDosage().getSite().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getDosage().getSite().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnAdmnstn_Dsg_Site_Txt ********************************************************************************/
		if(m.getMdctnAdmnstnDsgSiteTxt() != null ) {

			if(m.getMdctnAdmnstnDsgSiteTxt().replace("[","").replace("]","").equals("NULL") | m.getMdctnAdmnstnDsgSiteTxt()==null) {} else {
			medicationadministration.getDosage().getSite().setText(m.getMdctnAdmnstnDsgSiteTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnAdmnstn_Dsg_Txt ********************************************************************************/
		if(m.getMdctnAdmnstnDsgTxt() != null ) {

			if(m.getMdctnAdmnstnDsgTxt().replace("[","").replace("]","").equals("NULL") | m.getMdctnAdmnstnDsgTxt()==null) {} else {
			medicationadministration.getDosage().setText(m.getMdctnAdmnstnDsgTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnAdmnstn_EfctiveDtTimeTyp ********************************************************************************/
		if(m.getMdctnAdmnstnEfctiveDtTimeTyp() != null ) {

			if(m.getMdctnAdmnstnEfctiveDtTimeTyp().replace("[","").replace("]","").equals("NULL") | m.getMdctnAdmnstnEfctiveDtTimeTyp()==null) {} else {
			medicationadministration.setEffective(new org.hl7.fhir.r4.model.DateTimeType(m.getMdctnAdmnstnEfctiveDtTimeTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnAdmnstn_EfctivePrd_End ********************************************************************************/
		if(m.getMdctnAdmnstnEfctivePrdEnd() != null ) {

			if(m.getMdctnAdmnstnEfctivePrdEnd().replace("[","").replace("]","").equals("NULL") | m.getMdctnAdmnstnEfctivePrdEnd()==null) {} else {
			medicationadministration.getEffectivePeriod().setEnd(m.getMdctnAdmnstnEfctivePrdEnd().replace("[","").replace("]","").equals("NULL") | m.getMdctnAdmnstnEfctivePrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMdctnAdmnstnEfctivePrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnAdmnstn_EfctivePrd_Strt ********************************************************************************/
		if(m.getMdctnAdmnstnEfctivePrdStrt() != null ) {

			if(m.getMdctnAdmnstnEfctivePrdStrt().replace("[","").replace("]","").equals("NULL") | m.getMdctnAdmnstnEfctivePrdStrt()==null) {} else {
			medicationadministration.getEffectivePeriod().setStart(m.getMdctnAdmnstnEfctivePrdStrt().replace("[","").replace("]","").equals("NULL") | m.getMdctnAdmnstnEfctivePrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMdctnAdmnstnEfctivePrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnAdmnstn_EvntHis ********************************************************************************/
		if(m.getMdctnAdmnstnEvntHis() != null ) {

				for( String currListStrSplit : m.getMdctnAdmnstnEvntHis().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicationadministration.addEventHistory(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdctnAdmnstn_Id_Assigner ********************************************************************************/
		if(m.getMdctnAdmnstnIdAssigner() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getIdentifier().size() < i0+1) { medicationadministration.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnAdmnstn_Id_Prd_End ********************************************************************************/
		if(m.getMdctnAdmnstnIdPrdEnd() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getIdentifier().size() < i0+1) { medicationadministration.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnAdmnstn_Id_Prd_Strt ********************************************************************************/
		if(m.getMdctnAdmnstnIdPrdStrt() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getIdentifier().size() < i0+1) { medicationadministration.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnAdmnstn_Id_Sys ********************************************************************************/
		if(m.getMdctnAdmnstnIdSys() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getIdentifier().size() < i0+1) { medicationadministration.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnAdmnstn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnAdmnstnIdTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getIdentifier().size() < i0+1) { medicationadministration.addIdentifier(); }
				String[] arrayi1 = m.getMdctnAdmnstnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationadministration.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicationadministration.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationadministration.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnAdmnstn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnAdmnstnIdTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getIdentifier().size() < i0+1) { medicationadministration.addIdentifier(); }
				String[] arrayi1 = m.getMdctnAdmnstnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationadministration.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicationadministration.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationadministration.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnAdmnstn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnAdmnstnIdTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getIdentifier().size() < i0+1) { medicationadministration.addIdentifier(); }
				String[] arrayi1 = m.getMdctnAdmnstnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationadministration.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicationadministration.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationadministration.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnAdmnstn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnAdmnstnIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getIdentifier().size() < i0+1) { medicationadministration.addIdentifier(); }
				String[] arrayi1 = m.getMdctnAdmnstnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationadministration.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicationadministration.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationadministration.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnAdmnstn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnAdmnstnIdTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getIdentifier().size() < i0+1) { medicationadministration.addIdentifier(); }
				String[] arrayi1 = m.getMdctnAdmnstnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationadministration.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicationadministration.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationadministration.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnAdmnstn_Id_Typ_Txt ********************************************************************************/
		if(m.getMdctnAdmnstnIdTypTxt() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getIdentifier().size() < i0+1) { medicationadministration.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnAdmnstn_Id_Use ********************************************************************************/
		if(m.getMdctnAdmnstnIdUse() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getIdentifier().size() < i0+1) { medicationadministration.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnAdmnstn_Id_Vl ********************************************************************************/
		if(m.getMdctnAdmnstnIdVl() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getIdentifier().size() < i0+1) { medicationadministration.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnAdmnstn_Instantiates ********************************************************************************/
		if(m.getMdctnAdmnstnInstantiates() != null ) {

				for( String currListStrSplit : m.getMdctnAdmnstnInstantiates().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicationadministration.addInstantiates(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** MdctnAdmnstn_MdctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdctnAdmnstnMdctnCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnMdctnCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getMedicationCodeableConcept().getCoding().size() < i0+1) { medicationadministration.getMedicationCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getMedicationCodeableConcept().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnAdmnstn_MdctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnAdmnstnMdctnCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnMdctnCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getMedicationCodeableConcept().getCoding().size() < i0+1) { medicationadministration.getMedicationCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getMedicationCodeableConcept().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnAdmnstn_MdctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdctnAdmnstnMdctnCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnMdctnCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getMedicationCodeableConcept().getCoding().size() < i0+1) { medicationadministration.getMedicationCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getMedicationCodeableConcept().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnAdmnstn_MdctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnAdmnstnMdctnCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnMdctnCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getMedicationCodeableConcept().getCoding().size() < i0+1) { medicationadministration.getMedicationCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getMedicationCodeableConcept().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnAdmnstn_MdctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnAdmnstnMdctnCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnMdctnCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getMedicationCodeableConcept().getCoding().size() < i0+1) { medicationadministration.getMedicationCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getMedicationCodeableConcept().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnAdmnstn_MdctnCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdctnAdmnstnMdctnCdbleCncptTxt() != null ) {

			if(m.getMdctnAdmnstnMdctnCdbleCncptTxt().replace("[","").replace("]","").equals("NULL") | m.getMdctnAdmnstnMdctnCdbleCncptTxt()==null) {} else {
			medicationadministration.getMedicationCodeableConcept().setText(m.getMdctnAdmnstnMdctnCdbleCncptTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnAdmnstn_MdctnRfrnc ********************************************************************************/
		if(m.getMdctnAdmnstnMdctnRfrnc() != null ) {

			if(m.getMdctnAdmnstnMdctnRfrnc().replace("[","").replace("]","").equals("NULL") | m.getMdctnAdmnstnMdctnRfrnc()==null) {} else {
			medicationadministration.setMedication(new org.hl7.fhir.r4.model.Reference(m.getMdctnAdmnstnMdctnRfrnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnAdmnstn_Nt_AthrRfrnc ********************************************************************************/
		if(m.getMdctnAdmnstnNtAthrRfrnc() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getNote().size() < i0+1) { medicationadministration.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnAdmnstn_Nt_AthrStrgTyp ********************************************************************************/
		if(m.getMdctnAdmnstnNtAthrStrgTyp() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getNote().size() < i0+1) { medicationadministration.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnAdmnstn_Nt_Txt ********************************************************************************/
		if(m.getMdctnAdmnstnNtTxt() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getNote().size() < i0+1) { medicationadministration.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnAdmnstn_Nt_Time ********************************************************************************/
		if(m.getMdctnAdmnstnNtTime() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getNote().size() < i0+1) { medicationadministration.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnAdmnstn_PartOf ********************************************************************************/
		if(m.getMdctnAdmnstnPartOf() != null ) {

				for( String currListStrSplit : m.getMdctnAdmnstnPartOf().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicationadministration.addPartOf(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdctnAdmnstn_Prfrmr_Actor ********************************************************************************/
		if(m.getMdctnAdmnstnPrfrmrActor() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnPrfrmrActor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getPerformer().size() < i0+1) { medicationadministration.addPerformer(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getPerformer().get(i0).setActor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnAdmnstn_Prfrmr_Function_Cdg_Cd ********************************************************************************/
		if(m.getMdctnAdmnstnPrfrmrFunctionCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnPrfrmrFunctionCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getPerformer().size() < i0+1) { medicationadministration.addPerformer(); }
				String[] arrayi1 = m.getMdctnAdmnstnPrfrmrFunctionCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationadministration.getPerformer().get(i0).getFunction().getCoding().size() < i1+1) { medicationadministration.getPerformer().get(i0).getFunction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationadministration.getPerformer().get(i0).getFunction().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnAdmnstn_Prfrmr_Function_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnAdmnstnPrfrmrFunctionCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnPrfrmrFunctionCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getPerformer().size() < i0+1) { medicationadministration.addPerformer(); }
				String[] arrayi1 = m.getMdctnAdmnstnPrfrmrFunctionCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationadministration.getPerformer().get(i0).getFunction().getCoding().size() < i1+1) { medicationadministration.getPerformer().get(i0).getFunction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationadministration.getPerformer().get(i0).getFunction().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnAdmnstn_Prfrmr_Function_Cdg_Sys ********************************************************************************/
		if(m.getMdctnAdmnstnPrfrmrFunctionCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnPrfrmrFunctionCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getPerformer().size() < i0+1) { medicationadministration.addPerformer(); }
				String[] arrayi1 = m.getMdctnAdmnstnPrfrmrFunctionCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationadministration.getPerformer().get(i0).getFunction().getCoding().size() < i1+1) { medicationadministration.getPerformer().get(i0).getFunction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationadministration.getPerformer().get(i0).getFunction().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnAdmnstn_Prfrmr_Function_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnAdmnstnPrfrmrFunctionCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnPrfrmrFunctionCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getPerformer().size() < i0+1) { medicationadministration.addPerformer(); }
				String[] arrayi1 = m.getMdctnAdmnstnPrfrmrFunctionCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationadministration.getPerformer().get(i0).getFunction().getCoding().size() < i1+1) { medicationadministration.getPerformer().get(i0).getFunction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationadministration.getPerformer().get(i0).getFunction().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnAdmnstn_Prfrmr_Function_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnAdmnstnPrfrmrFunctionCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnPrfrmrFunctionCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getPerformer().size() < i0+1) { medicationadministration.addPerformer(); }
				String[] arrayi1 = m.getMdctnAdmnstnPrfrmrFunctionCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationadministration.getPerformer().get(i0).getFunction().getCoding().size() < i1+1) { medicationadministration.getPerformer().get(i0).getFunction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationadministration.getPerformer().get(i0).getFunction().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnAdmnstn_Prfrmr_Function_Txt ********************************************************************************/
		if(m.getMdctnAdmnstnPrfrmrFunctionTxt() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnPrfrmrFunctionTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getPerformer().size() < i0+1) { medicationadministration.addPerformer(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getPerformer().get(i0).getFunction().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnAdmnstn_RsnCd_Cdg_Cd ********************************************************************************/
		if(m.getMdctnAdmnstnRsnCdCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getReasonCode().size() < i0+1) { medicationadministration.addReasonCode(); }
				String[] arrayi1 = m.getMdctnAdmnstnRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationadministration.getReasonCode().get(i0).getCoding().size() < i1+1) { medicationadministration.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationadministration.getReasonCode().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnAdmnstn_RsnCd_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnAdmnstnRsnCdCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getReasonCode().size() < i0+1) { medicationadministration.addReasonCode(); }
				String[] arrayi1 = m.getMdctnAdmnstnRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationadministration.getReasonCode().get(i0).getCoding().size() < i1+1) { medicationadministration.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationadministration.getReasonCode().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnAdmnstn_RsnCd_Cdg_Sys ********************************************************************************/
		if(m.getMdctnAdmnstnRsnCdCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getReasonCode().size() < i0+1) { medicationadministration.addReasonCode(); }
				String[] arrayi1 = m.getMdctnAdmnstnRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationadministration.getReasonCode().get(i0).getCoding().size() < i1+1) { medicationadministration.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationadministration.getReasonCode().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnAdmnstn_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnAdmnstnRsnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getReasonCode().size() < i0+1) { medicationadministration.addReasonCode(); }
				String[] arrayi1 = m.getMdctnAdmnstnRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationadministration.getReasonCode().get(i0).getCoding().size() < i1+1) { medicationadministration.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationadministration.getReasonCode().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnAdmnstn_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnAdmnstnRsnCdCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getReasonCode().size() < i0+1) { medicationadministration.addReasonCode(); }
				String[] arrayi1 = m.getMdctnAdmnstnRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationadministration.getReasonCode().get(i0).getCoding().size() < i1+1) { medicationadministration.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationadministration.getReasonCode().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnAdmnstn_RsnCd_Txt ********************************************************************************/
		if(m.getMdctnAdmnstnRsnCdTxt() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnRsnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getReasonCode().size() < i0+1) { medicationadministration.addReasonCode(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getReasonCode().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnAdmnstn_RsnRfrnc ********************************************************************************/
		if(m.getMdctnAdmnstnRsnRfrnc() != null ) {

				for( String currListStrSplit : m.getMdctnAdmnstnRsnRfrnc().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicationadministration.addReasonReference(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdctnAdmnstn_Rqst ********************************************************************************/
		if(m.getMdctnAdmnstnRqst() != null ) {

			if(m.getMdctnAdmnstnRqst().replace("[","").replace("]","").equals("NULL") | m.getMdctnAdmnstnRqst()==null) {} else {
			medicationadministration.setRequest(new org.hl7.fhir.r4.model.Reference(m.getMdctnAdmnstnRqst().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnAdmnstn_Sts ********************************************************************************/
		if(m.getMdctnAdmnstnSts() != null ) {

			if(m.getMdctnAdmnstnSts().replace("[","").replace("]","").equals("NULL") | m.getMdctnAdmnstnSts()==null) {} else {
			medicationadministration.setStatus(new org.hl7.fhir.r4.model.MedicationAdministration.MedicationAdministrationStatusEnumFactory().fromCode(m.getMdctnAdmnstnSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnAdmnstn_StsRsn_Cdg_Cd ********************************************************************************/
		if(m.getMdctnAdmnstnStsRsnCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnStsRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getStatusReason().size() < i0+1) { medicationadministration.addStatusReason(); }
				String[] arrayi1 = m.getMdctnAdmnstnStsRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationadministration.getStatusReason().get(i0).getCoding().size() < i1+1) { medicationadministration.getStatusReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationadministration.getStatusReason().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnAdmnstn_StsRsn_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnAdmnstnStsRsnCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnStsRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getStatusReason().size() < i0+1) { medicationadministration.addStatusReason(); }
				String[] arrayi1 = m.getMdctnAdmnstnStsRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationadministration.getStatusReason().get(i0).getCoding().size() < i1+1) { medicationadministration.getStatusReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationadministration.getStatusReason().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnAdmnstn_StsRsn_Cdg_Sys ********************************************************************************/
		if(m.getMdctnAdmnstnStsRsnCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnStsRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getStatusReason().size() < i0+1) { medicationadministration.addStatusReason(); }
				String[] arrayi1 = m.getMdctnAdmnstnStsRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationadministration.getStatusReason().get(i0).getCoding().size() < i1+1) { medicationadministration.getStatusReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationadministration.getStatusReason().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnAdmnstn_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnAdmnstnStsRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnStsRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getStatusReason().size() < i0+1) { medicationadministration.addStatusReason(); }
				String[] arrayi1 = m.getMdctnAdmnstnStsRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationadministration.getStatusReason().get(i0).getCoding().size() < i1+1) { medicationadministration.getStatusReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationadministration.getStatusReason().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnAdmnstn_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnAdmnstnStsRsnCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnStsRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getStatusReason().size() < i0+1) { medicationadministration.addStatusReason(); }
				String[] arrayi1 = m.getMdctnAdmnstnStsRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationadministration.getStatusReason().get(i0).getCoding().size() < i1+1) { medicationadministration.getStatusReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationadministration.getStatusReason().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnAdmnstn_StsRsn_Txt ********************************************************************************/
		if(m.getMdctnAdmnstnStsRsnTxt() != null ) {

			String[] arrayi0 = m.getMdctnAdmnstnStsRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationadministration.getStatusReason().size() < i0+1) { medicationadministration.addStatusReason(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationadministration.getStatusReason().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnAdmnstn_Sbjct ********************************************************************************/
		if(m.getMdctnAdmnstnSbjct() != null ) {

			if(m.getMdctnAdmnstnSbjct().replace("[","").replace("]","").equals("NULL") | m.getMdctnAdmnstnSbjct()==null) {} else {
			medicationadministration.setSubject(new org.hl7.fhir.r4.model.Reference(m.getMdctnAdmnstnSbjct().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnAdmnstn_SprtingInfo ********************************************************************************/
		if(m.getMdctnAdmnstnSprtingInfo() != null ) {

				for( String currListStrSplit : m.getMdctnAdmnstnSprtingInfo().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicationadministration.addSupportingInformation(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		return medicationadministration;
	}
}
