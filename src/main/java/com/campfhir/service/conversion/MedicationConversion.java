package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Medication;
public class MedicationConversion 
{
	public org.hl7.fhir.r4.model.Medication Medications(Medication m) throws ParseException
	{
		org.hl7.fhir.r4.model.Medication medication = new org.hl7.fhir.r4.model.Medication();

		/******************** id ********************************************************************************/
		medication.setId(m.getId());

		/******************** Mdctn_Amnt_Dnmntr_Cd ********************************************************************************/
		if(m.getMdctnAmntDnmntrCd() != null ) {

			if(m.getMdctnAmntDnmntrCd().replace("[","").replace("]","").equals("NULL") | m.getMdctnAmntDnmntrCd()==null) {} else {
			medication.getAmount().getDenominator().setCode(m.getMdctnAmntDnmntrCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Mdctn_Amnt_Dnmntr_Cmprtr ********************************************************************************/
		if(m.getMdctnAmntDnmntrCmprtr() != null ) {

			if(m.getMdctnAmntDnmntrCmprtr().replace("[","").replace("]","").equals("NULL") | m.getMdctnAmntDnmntrCmprtr()==null) {} else {
			medication.getAmount().getDenominator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(m.getMdctnAmntDnmntrCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Mdctn_Amnt_Dnmntr_Sys ********************************************************************************/
		if(m.getMdctnAmntDnmntrSys() != null ) {

			if(m.getMdctnAmntDnmntrSys().replace("[","").replace("]","").equals("NULL") | m.getMdctnAmntDnmntrSys()==null) {} else {
			medication.getAmount().getDenominator().setSystem(m.getMdctnAmntDnmntrSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Mdctn_Amnt_Dnmntr_Unt ********************************************************************************/
		if(m.getMdctnAmntDnmntrUnt() != null ) {

			if(m.getMdctnAmntDnmntrUnt().replace("[","").replace("]","").equals("NULL") | m.getMdctnAmntDnmntrUnt()==null) {} else {
			medication.getAmount().getDenominator().setUnit(m.getMdctnAmntDnmntrUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Mdctn_Amnt_Dnmntr_Vl ********************************************************************************/
		if(m.getMdctnAmntDnmntrVl() != null ) {

			if(m.getMdctnAmntDnmntrVl().replace("[","").replace("]","").equals("NULL") | m.getMdctnAmntDnmntrVl()==null) {} else {
			medication.getAmount().getDenominator().setValue((new java.math.BigDecimal((m.getMdctnAmntDnmntrVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Mdctn_Amnt_Nmrtr_Cd ********************************************************************************/
		if(m.getMdctnAmntNmrtrCd() != null ) {

			if(m.getMdctnAmntNmrtrCd().replace("[","").replace("]","").equals("NULL") | m.getMdctnAmntNmrtrCd()==null) {} else {
			medication.getAmount().getNumerator().setCode(m.getMdctnAmntNmrtrCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Mdctn_Amnt_Nmrtr_Cmprtr ********************************************************************************/
		if(m.getMdctnAmntNmrtrCmprtr() != null ) {

			if(m.getMdctnAmntNmrtrCmprtr().replace("[","").replace("]","").equals("NULL") | m.getMdctnAmntNmrtrCmprtr()==null) {} else {
			medication.getAmount().getNumerator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(m.getMdctnAmntNmrtrCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Mdctn_Amnt_Nmrtr_Sys ********************************************************************************/
		if(m.getMdctnAmntNmrtrSys() != null ) {

			if(m.getMdctnAmntNmrtrSys().replace("[","").replace("]","").equals("NULL") | m.getMdctnAmntNmrtrSys()==null) {} else {
			medication.getAmount().getNumerator().setSystem(m.getMdctnAmntNmrtrSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Mdctn_Amnt_Nmrtr_Unt ********************************************************************************/
		if(m.getMdctnAmntNmrtrUnt() != null ) {

			if(m.getMdctnAmntNmrtrUnt().replace("[","").replace("]","").equals("NULL") | m.getMdctnAmntNmrtrUnt()==null) {} else {
			medication.getAmount().getNumerator().setUnit(m.getMdctnAmntNmrtrUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Mdctn_Amnt_Nmrtr_Vl ********************************************************************************/
		if(m.getMdctnAmntNmrtrVl() != null ) {

			if(m.getMdctnAmntNmrtrVl().replace("[","").replace("]","").equals("NULL") | m.getMdctnAmntNmrtrVl()==null) {} else {
			medication.getAmount().getNumerator().setValue((new java.math.BigDecimal((m.getMdctnAmntNmrtrVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Mdctn_Batch_ExpirationDt ********************************************************************************/
		if(m.getMdctnBatchExpirationDt() != null ) {

			if(m.getMdctnBatchExpirationDt().replace("[","").replace("]","").equals("NULL") | m.getMdctnBatchExpirationDt()==null) {} else {
			medication.getBatch().setExpirationDate(m.getMdctnBatchExpirationDt().replace("[","").replace("]","").equals("NULL") | m.getMdctnBatchExpirationDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMdctnBatchExpirationDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Mdctn_Batch_LotNmbr ********************************************************************************/
		if(m.getMdctnBatchLotNmbr() != null ) {

			if(m.getMdctnBatchLotNmbr().replace("[","").replace("]","").equals("NULL") | m.getMdctnBatchLotNmbr()==null) {} else {
			medication.getBatch().setLotNumber(m.getMdctnBatchLotNmbr().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Mdctn_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMdctnCdCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getCode().getCoding().size() < i0+1) { medication.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medication.getCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Mdctn_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnCdCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getCode().getCoding().size() < i0+1) { medication.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medication.getCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Mdctn_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMdctnCdCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getCode().getCoding().size() < i0+1) { medication.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medication.getCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Mdctn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getCode().getCoding().size() < i0+1) { medication.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medication.getCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Mdctn_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnCdCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getCode().getCoding().size() < i0+1) { medication.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medication.getCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Mdctn_Cd_Txt ********************************************************************************/
		if(m.getMdctnCdTxt() != null ) {

			if(m.getMdctnCdTxt().replace("[","").replace("]","").equals("NULL") | m.getMdctnCdTxt()==null) {} else {
			medication.getCode().setText(m.getMdctnCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Mdctn_Frm_Cdg_Cd ********************************************************************************/
		if(m.getMdctnFrmCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnFrmCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getForm().getCoding().size() < i0+1) { medication.getForm().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medication.getForm().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Mdctn_Frm_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnFrmCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnFrmCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getForm().getCoding().size() < i0+1) { medication.getForm().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medication.getForm().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Mdctn_Frm_Cdg_Sys ********************************************************************************/
		if(m.getMdctnFrmCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnFrmCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getForm().getCoding().size() < i0+1) { medication.getForm().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medication.getForm().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Mdctn_Frm_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnFrmCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnFrmCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getForm().getCoding().size() < i0+1) { medication.getForm().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medication.getForm().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Mdctn_Frm_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnFrmCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnFrmCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getForm().getCoding().size() < i0+1) { medication.getForm().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medication.getForm().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Mdctn_Frm_Txt ********************************************************************************/
		if(m.getMdctnFrmTxt() != null ) {

			if(m.getMdctnFrmTxt().replace("[","").replace("]","").equals("NULL") | m.getMdctnFrmTxt()==null) {} else {
			medication.getForm().setText(m.getMdctnFrmTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Mdctn_Id_Assigner ********************************************************************************/
		if(m.getMdctnIdAssigner() != null ) {

			String[] arrayi0 = m.getMdctnIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getIdentifier().size() < i0+1) { medication.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medication.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Mdctn_Id_Prd_End ********************************************************************************/
		if(m.getMdctnIdPrdEnd() != null ) {

			String[] arrayi0 = m.getMdctnIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getIdentifier().size() < i0+1) { medication.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medication.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Mdctn_Id_Prd_Strt ********************************************************************************/
		if(m.getMdctnIdPrdStrt() != null ) {

			String[] arrayi0 = m.getMdctnIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getIdentifier().size() < i0+1) { medication.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medication.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Mdctn_Id_Sys ********************************************************************************/
		if(m.getMdctnIdSys() != null ) {

			String[] arrayi0 = m.getMdctnIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getIdentifier().size() < i0+1) { medication.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medication.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Mdctn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnIdTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getIdentifier().size() < i0+1) { medication.addIdentifier(); }
				String[] arrayi1 = m.getMdctnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medication.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medication.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medication.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Mdctn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnIdTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getIdentifier().size() < i0+1) { medication.addIdentifier(); }
				String[] arrayi1 = m.getMdctnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medication.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medication.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medication.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Mdctn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnIdTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getIdentifier().size() < i0+1) { medication.addIdentifier(); }
				String[] arrayi1 = m.getMdctnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medication.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medication.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medication.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Mdctn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getIdentifier().size() < i0+1) { medication.addIdentifier(); }
				String[] arrayi1 = m.getMdctnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medication.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medication.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medication.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Mdctn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnIdTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getIdentifier().size() < i0+1) { medication.addIdentifier(); }
				String[] arrayi1 = m.getMdctnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medication.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medication.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medication.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Mdctn_Id_Typ_Txt ********************************************************************************/
		if(m.getMdctnIdTypTxt() != null ) {

			String[] arrayi0 = m.getMdctnIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getIdentifier().size() < i0+1) { medication.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medication.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Mdctn_Id_Use ********************************************************************************/
		if(m.getMdctnIdUse() != null ) {

			String[] arrayi0 = m.getMdctnIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getIdentifier().size() < i0+1) { medication.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medication.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Mdctn_Id_Vl ********************************************************************************/
		if(m.getMdctnIdVl() != null ) {

			String[] arrayi0 = m.getMdctnIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getIdentifier().size() < i0+1) { medication.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medication.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Mdctn_Igrdnt_IsActive ********************************************************************************/
		if(m.getMdctnIgrdntIsActive() != null ) {

			String[] arrayi0 = m.getMdctnIgrdntIsActive().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getIngredient().size() < i0+1) { medication.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medication.getIngredient().get(i0).setIsActive(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Mdctn_Igrdnt_ItmCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdctnIgrdntItmCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnIgrdntItmCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getIngredient().size() < i0+1) { medication.addIngredient(); }
				String[] arrayi1 = m.getMdctnIgrdntItmCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medication.getIngredient().get(i0).getItemCodeableConcept().getCoding().size() < i1+1) { medication.getIngredient().get(i0).getItemCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medication.getIngredient().get(i0).getItemCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Mdctn_Igrdnt_ItmCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnIgrdntItmCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnIgrdntItmCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getIngredient().size() < i0+1) { medication.addIngredient(); }
				String[] arrayi1 = m.getMdctnIgrdntItmCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medication.getIngredient().get(i0).getItemCodeableConcept().getCoding().size() < i1+1) { medication.getIngredient().get(i0).getItemCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medication.getIngredient().get(i0).getItemCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Mdctn_Igrdnt_ItmCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdctnIgrdntItmCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnIgrdntItmCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getIngredient().size() < i0+1) { medication.addIngredient(); }
				String[] arrayi1 = m.getMdctnIgrdntItmCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medication.getIngredient().get(i0).getItemCodeableConcept().getCoding().size() < i1+1) { medication.getIngredient().get(i0).getItemCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medication.getIngredient().get(i0).getItemCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Mdctn_Igrdnt_ItmCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnIgrdntItmCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnIgrdntItmCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getIngredient().size() < i0+1) { medication.addIngredient(); }
				String[] arrayi1 = m.getMdctnIgrdntItmCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medication.getIngredient().get(i0).getItemCodeableConcept().getCoding().size() < i1+1) { medication.getIngredient().get(i0).getItemCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medication.getIngredient().get(i0).getItemCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Mdctn_Igrdnt_ItmCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnIgrdntItmCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnIgrdntItmCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getIngredient().size() < i0+1) { medication.addIngredient(); }
				String[] arrayi1 = m.getMdctnIgrdntItmCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medication.getIngredient().get(i0).getItemCodeableConcept().getCoding().size() < i1+1) { medication.getIngredient().get(i0).getItemCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medication.getIngredient().get(i0).getItemCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Mdctn_Igrdnt_ItmCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdctnIgrdntItmCdbleCncptTxt() != null ) {

			String[] arrayi0 = m.getMdctnIgrdntItmCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getIngredient().size() < i0+1) { medication.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medication.getIngredient().get(i0).getItemCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Mdctn_Igrdnt_ItmRfrnc ********************************************************************************/
		if(m.getMdctnIgrdntItmRfrnc() != null ) {

			String[] arrayi0 = m.getMdctnIgrdntItmRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getIngredient().size() < i0+1) { medication.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medication.getIngredient().get(i0).setItem(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Mdctn_Igrdnt_Str_Dnmntr_Cd ********************************************************************************/
		if(m.getMdctnIgrdntStrDnmntrCd() != null ) {

			String[] arrayi0 = m.getMdctnIgrdntStrDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getIngredient().size() < i0+1) { medication.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medication.getIngredient().get(i0).getStrength().getDenominator().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Mdctn_Igrdnt_Str_Dnmntr_Cmprtr ********************************************************************************/
		if(m.getMdctnIgrdntStrDnmntrCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnIgrdntStrDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getIngredient().size() < i0+1) { medication.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medication.getIngredient().get(i0).getStrength().getDenominator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Mdctn_Igrdnt_Str_Dnmntr_Sys ********************************************************************************/
		if(m.getMdctnIgrdntStrDnmntrSys() != null ) {

			String[] arrayi0 = m.getMdctnIgrdntStrDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getIngredient().size() < i0+1) { medication.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medication.getIngredient().get(i0).getStrength().getDenominator().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Mdctn_Igrdnt_Str_Dnmntr_Unt ********************************************************************************/
		if(m.getMdctnIgrdntStrDnmntrUnt() != null ) {

			String[] arrayi0 = m.getMdctnIgrdntStrDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getIngredient().size() < i0+1) { medication.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medication.getIngredient().get(i0).getStrength().getDenominator().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Mdctn_Igrdnt_Str_Dnmntr_Vl ********************************************************************************/
		if(m.getMdctnIgrdntStrDnmntrVl() != null ) {

			String[] arrayi0 = m.getMdctnIgrdntStrDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getIngredient().size() < i0+1) { medication.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medication.getIngredient().get(i0).getStrength().getDenominator().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Mdctn_Igrdnt_Str_Nmrtr_Cd ********************************************************************************/
		if(m.getMdctnIgrdntStrNmrtrCd() != null ) {

			String[] arrayi0 = m.getMdctnIgrdntStrNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getIngredient().size() < i0+1) { medication.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medication.getIngredient().get(i0).getStrength().getNumerator().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Mdctn_Igrdnt_Str_Nmrtr_Cmprtr ********************************************************************************/
		if(m.getMdctnIgrdntStrNmrtrCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnIgrdntStrNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getIngredient().size() < i0+1) { medication.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medication.getIngredient().get(i0).getStrength().getNumerator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Mdctn_Igrdnt_Str_Nmrtr_Sys ********************************************************************************/
		if(m.getMdctnIgrdntStrNmrtrSys() != null ) {

			String[] arrayi0 = m.getMdctnIgrdntStrNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getIngredient().size() < i0+1) { medication.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medication.getIngredient().get(i0).getStrength().getNumerator().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Mdctn_Igrdnt_Str_Nmrtr_Unt ********************************************************************************/
		if(m.getMdctnIgrdntStrNmrtrUnt() != null ) {

			String[] arrayi0 = m.getMdctnIgrdntStrNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getIngredient().size() < i0+1) { medication.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medication.getIngredient().get(i0).getStrength().getNumerator().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Mdctn_Igrdnt_Str_Nmrtr_Vl ********************************************************************************/
		if(m.getMdctnIgrdntStrNmrtrVl() != null ) {

			String[] arrayi0 = m.getMdctnIgrdntStrNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medication.getIngredient().size() < i0+1) { medication.addIngredient(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medication.getIngredient().get(i0).getStrength().getNumerator().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Mdctn_Manufacturer ********************************************************************************/
		if(m.getMdctnManufacturer() != null ) {

			if(m.getMdctnManufacturer().replace("[","").replace("]","").equals("NULL") | m.getMdctnManufacturer()==null) {} else {
			medication.setManufacturer(new org.hl7.fhir.r4.model.Reference(m.getMdctnManufacturer().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Mdctn_Sts ********************************************************************************/
		if(m.getMdctnSts() != null ) {

			if(m.getMdctnSts().replace("[","").replace("]","").equals("NULL") | m.getMdctnSts()==null) {} else {
			medication.setStatus(new org.hl7.fhir.r4.model.Medication.MedicationStatusEnumFactory().fromCode(m.getMdctnSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return medication;
	}
}
