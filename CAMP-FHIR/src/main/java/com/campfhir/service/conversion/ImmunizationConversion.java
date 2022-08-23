package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Immunization;
public class ImmunizationConversion 
{
	public org.hl7.fhir.r4.model.Immunization Immunizations(Immunization i) throws ParseException
	{
		org.hl7.fhir.r4.model.Immunization immunization = new org.hl7.fhir.r4.model.Immunization();

		/******************** id ********************************************************************************/
		immunization.setId(i.getId());

		/******************** Immnztn_DoseQnty_Cd ********************************************************************************/
		if(i.getImmnztnDoseQntyCd() != null ) {

			if(i.getImmnztnDoseQntyCd().replace("[","").replace("]","").equals("NULL") | i.getImmnztnDoseQntyCd()==null) {} else {
			immunization.getDoseQuantity().setCode(i.getImmnztnDoseQntyCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Immnztn_DoseQnty_Cmprtr ********************************************************************************/
		if(i.getImmnztnDoseQntyCmprtr() != null ) {

			if(i.getImmnztnDoseQntyCmprtr().replace("[","").replace("]","").equals("NULL") | i.getImmnztnDoseQntyCmprtr()==null) {} else {
			immunization.getDoseQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(i.getImmnztnDoseQntyCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Immnztn_DoseQnty_Sys ********************************************************************************/
		if(i.getImmnztnDoseQntySys() != null ) {

			if(i.getImmnztnDoseQntySys().replace("[","").replace("]","").equals("NULL") | i.getImmnztnDoseQntySys()==null) {} else {
			immunization.getDoseQuantity().setSystem(i.getImmnztnDoseQntySys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Immnztn_DoseQnty_Unt ********************************************************************************/
		if(i.getImmnztnDoseQntyUnt() != null ) {

			if(i.getImmnztnDoseQntyUnt().replace("[","").replace("]","").equals("NULL") | i.getImmnztnDoseQntyUnt()==null) {} else {
			immunization.getDoseQuantity().setUnit(i.getImmnztnDoseQntyUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Immnztn_DoseQnty_Vl ********************************************************************************/
		if(i.getImmnztnDoseQntyVl() != null ) {

			if(i.getImmnztnDoseQntyVl().replace("[","").replace("]","").equals("NULL") | i.getImmnztnDoseQntyVl()==null) {} else {
			immunization.getDoseQuantity().setValue((new java.math.BigDecimal((i.getImmnztnDoseQntyVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Immnztn_Education_DocTyp ********************************************************************************/
		if(i.getImmnztnEducationDocTyp() != null ) {

			String[] arrayi0 = i.getImmnztnEducationDocTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getEducation().size() < i0+1) { immunization.addEducation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getEducation().get(i0).setDocumentType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Immnztn_Education_PrsnttnDt ********************************************************************************/
		if(i.getImmnztnEducationPrsnttnDt() != null ) {

			String[] arrayi0 = i.getImmnztnEducationPrsnttnDt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getEducation().size() < i0+1) { immunization.addEducation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getEducation().get(i0).setPresentationDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Immnztn_Education_PublicationDt ********************************************************************************/
		if(i.getImmnztnEducationPublicationDt() != null ) {

			String[] arrayi0 = i.getImmnztnEducationPublicationDt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getEducation().size() < i0+1) { immunization.addEducation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getEducation().get(i0).setPublicationDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Immnztn_Education_Rfrnc ********************************************************************************/
		if(i.getImmnztnEducationRfrnc() != null ) {

			String[] arrayi0 = i.getImmnztnEducationRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getEducation().size() < i0+1) { immunization.addEducation(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getEducation().get(i0).setReference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Immnztn_Enc ********************************************************************************/
		if(i.getImmnztnEnc() != null ) {

			if(i.getImmnztnEnc().replace("[","").replace("]","").equals("NULL") | i.getImmnztnEnc()==null) {} else {
			immunization.setEncounter(new org.hl7.fhir.r4.model.Reference(i.getImmnztnEnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Immnztn_ExpirationDt ********************************************************************************/
		if(i.getImmnztnExpirationDt() != null ) {

			if(i.getImmnztnExpirationDt().replace("[","").replace("]","").equals("NULL") | i.getImmnztnExpirationDt()==null) {} else {
			immunization.setExpirationDate(i.getImmnztnExpirationDt().replace("[","").replace("]","").equals("NULL") | i.getImmnztnExpirationDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(i.getImmnztnExpirationDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Immnztn_FundingSrc_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnFundingSrcCdgCd() != null ) {

			String[] arrayi0 = i.getImmnztnFundingSrcCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getFundingSource().getCoding().size() < i0+1) { immunization.getFundingSource().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getFundingSource().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Immnztn_FundingSrc_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnFundingSrcCdgDsply() != null ) {

			String[] arrayi0 = i.getImmnztnFundingSrcCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getFundingSource().getCoding().size() < i0+1) { immunization.getFundingSource().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getFundingSource().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Immnztn_FundingSrc_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnFundingSrcCdgSys() != null ) {

			String[] arrayi0 = i.getImmnztnFundingSrcCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getFundingSource().getCoding().size() < i0+1) { immunization.getFundingSource().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getFundingSource().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Immnztn_FundingSrc_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnFundingSrcCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getImmnztnFundingSrcCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getFundingSource().getCoding().size() < i0+1) { immunization.getFundingSource().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getFundingSource().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Immnztn_FundingSrc_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnFundingSrcCdgVrsn() != null ) {

			String[] arrayi0 = i.getImmnztnFundingSrcCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getFundingSource().getCoding().size() < i0+1) { immunization.getFundingSource().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getFundingSource().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Immnztn_FundingSrc_Txt ********************************************************************************/
		if(i.getImmnztnFundingSrcTxt() != null ) {

			if(i.getImmnztnFundingSrcTxt().replace("[","").replace("]","").equals("NULL") | i.getImmnztnFundingSrcTxt()==null) {} else {
			immunization.getFundingSource().setText(i.getImmnztnFundingSrcTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Immnztn_Id_Assigner ********************************************************************************/
		if(i.getImmnztnIdAssigner() != null ) {

			String[] arrayi0 = i.getImmnztnIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getIdentifier().size() < i0+1) { immunization.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Immnztn_Id_Prd_End ********************************************************************************/
		if(i.getImmnztnIdPrdEnd() != null ) {

			String[] arrayi0 = i.getImmnztnIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getIdentifier().size() < i0+1) { immunization.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Immnztn_Id_Prd_Strt ********************************************************************************/
		if(i.getImmnztnIdPrdStrt() != null ) {

			String[] arrayi0 = i.getImmnztnIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getIdentifier().size() < i0+1) { immunization.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Immnztn_Id_Sys ********************************************************************************/
		if(i.getImmnztnIdSys() != null ) {

			String[] arrayi0 = i.getImmnztnIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getIdentifier().size() < i0+1) { immunization.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Immnztn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnIdTypCdgCd() != null ) {

			String[] arrayi0 = i.getImmnztnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getIdentifier().size() < i0+1) { immunization.addIdentifier(); }
				String[] arrayi1 = i.getImmnztnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunization.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { immunization.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunization.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Immnztn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnIdTypCdgDsply() != null ) {

			String[] arrayi0 = i.getImmnztnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getIdentifier().size() < i0+1) { immunization.addIdentifier(); }
				String[] arrayi1 = i.getImmnztnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunization.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { immunization.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunization.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Immnztn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnIdTypCdgSys() != null ) {

			String[] arrayi0 = i.getImmnztnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getIdentifier().size() < i0+1) { immunization.addIdentifier(); }
				String[] arrayi1 = i.getImmnztnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunization.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { immunization.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunization.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Immnztn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getImmnztnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getIdentifier().size() < i0+1) { immunization.addIdentifier(); }
				String[] arrayi1 = i.getImmnztnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunization.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { immunization.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunization.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Immnztn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnIdTypCdgVrsn() != null ) {

			String[] arrayi0 = i.getImmnztnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getIdentifier().size() < i0+1) { immunization.addIdentifier(); }
				String[] arrayi1 = i.getImmnztnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunization.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { immunization.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunization.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Immnztn_Id_Typ_Txt ********************************************************************************/
		if(i.getImmnztnIdTypTxt() != null ) {

			String[] arrayi0 = i.getImmnztnIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getIdentifier().size() < i0+1) { immunization.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Immnztn_Id_Use ********************************************************************************/
		if(i.getImmnztnIdUse() != null ) {

			String[] arrayi0 = i.getImmnztnIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getIdentifier().size() < i0+1) { immunization.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Immnztn_Id_Vl ********************************************************************************/
		if(i.getImmnztnIdVl() != null ) {

			String[] arrayi0 = i.getImmnztnIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getIdentifier().size() < i0+1) { immunization.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Immnztn_IsSubpotent ********************************************************************************/
		if(i.getImmnztnIsSubpotent() != null ) {

			if(i.getImmnztnIsSubpotent().replace("[","").replace("]","").equals("NULL") | i.getImmnztnIsSubpotent()==null) {} else {
			immunization.setIsSubpotent(Boolean.parseBoolean(i.getImmnztnIsSubpotent().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Immnztn_Lctn ********************************************************************************/
		if(i.getImmnztnLctn() != null ) {

			if(i.getImmnztnLctn().replace("[","").replace("]","").equals("NULL") | i.getImmnztnLctn()==null) {} else {
			immunization.setLocation(new org.hl7.fhir.r4.model.Reference(i.getImmnztnLctn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Immnztn_LotNmbr ********************************************************************************/
		if(i.getImmnztnLotNmbr() != null ) {

			if(i.getImmnztnLotNmbr().replace("[","").replace("]","").equals("NULL") | i.getImmnztnLotNmbr()==null) {} else {
			immunization.setLotNumber(i.getImmnztnLotNmbr().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Immnztn_Manufacturer ********************************************************************************/
		if(i.getImmnztnManufacturer() != null ) {

			if(i.getImmnztnManufacturer().replace("[","").replace("]","").equals("NULL") | i.getImmnztnManufacturer()==null) {} else {
			immunization.setManufacturer(new org.hl7.fhir.r4.model.Reference(i.getImmnztnManufacturer().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Immnztn_Nt_AthrRfrnc ********************************************************************************/
		if(i.getImmnztnNtAthrRfrnc() != null ) {

			String[] arrayi0 = i.getImmnztnNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getNote().size() < i0+1) { immunization.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Immnztn_Nt_AthrStrgTyp ********************************************************************************/
		if(i.getImmnztnNtAthrStrgTyp() != null ) {

			String[] arrayi0 = i.getImmnztnNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getNote().size() < i0+1) { immunization.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Immnztn_Nt_Txt ********************************************************************************/
		if(i.getImmnztnNtTxt() != null ) {

			String[] arrayi0 = i.getImmnztnNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getNote().size() < i0+1) { immunization.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Immnztn_Nt_Time ********************************************************************************/
		if(i.getImmnztnNtTime() != null ) {

			String[] arrayi0 = i.getImmnztnNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getNote().size() < i0+1) { immunization.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Immnztn_OccrnceDtTimeTyp ********************************************************************************/
		if(i.getImmnztnOccrnceDtTimeTyp() != null ) {

			if(i.getImmnztnOccrnceDtTimeTyp().replace("[","").replace("]","").equals("NULL") | i.getImmnztnOccrnceDtTimeTyp()==null) {} else {
			immunization.setOccurrence(new org.hl7.fhir.r4.model.DateTimeType(i.getImmnztnOccrnceDtTimeTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Immnztn_OccrnceStrgTyp ********************************************************************************/
		if(i.getImmnztnOccrnceStrgTyp() != null ) {

			if(i.getImmnztnOccrnceStrgTyp().replace("[","").replace("]","").equals("NULL") | i.getImmnztnOccrnceStrgTyp()==null) {} else {
			immunization.setOccurrence(new org.hl7.fhir.r4.model.StringType(i.getImmnztnOccrnceStrgTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Immnztn_Pnt ********************************************************************************/
		if(i.getImmnztnPnt() != null ) {

			if(i.getImmnztnPnt().replace("[","").replace("]","").equals("NULL") | i.getImmnztnPnt()==null) {} else {
			immunization.setPatient(new org.hl7.fhir.r4.model.Reference(i.getImmnztnPnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Immnztn_Prfrmr_Actor ********************************************************************************/
		if(i.getImmnztnPrfrmrActor() != null ) {

			String[] arrayi0 = i.getImmnztnPrfrmrActor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getPerformer().size() < i0+1) { immunization.addPerformer(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getPerformer().get(i0).setActor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Immnztn_Prfrmr_Function_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnPrfrmrFunctionCdgCd() != null ) {

			String[] arrayi0 = i.getImmnztnPrfrmrFunctionCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getPerformer().size() < i0+1) { immunization.addPerformer(); }
				String[] arrayi1 = i.getImmnztnPrfrmrFunctionCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunization.getPerformer().get(i0).getFunction().getCoding().size() < i1+1) { immunization.getPerformer().get(i0).getFunction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunization.getPerformer().get(i0).getFunction().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Immnztn_Prfrmr_Function_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnPrfrmrFunctionCdgDsply() != null ) {

			String[] arrayi0 = i.getImmnztnPrfrmrFunctionCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getPerformer().size() < i0+1) { immunization.addPerformer(); }
				String[] arrayi1 = i.getImmnztnPrfrmrFunctionCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunization.getPerformer().get(i0).getFunction().getCoding().size() < i1+1) { immunization.getPerformer().get(i0).getFunction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunization.getPerformer().get(i0).getFunction().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Immnztn_Prfrmr_Function_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnPrfrmrFunctionCdgSys() != null ) {

			String[] arrayi0 = i.getImmnztnPrfrmrFunctionCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getPerformer().size() < i0+1) { immunization.addPerformer(); }
				String[] arrayi1 = i.getImmnztnPrfrmrFunctionCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunization.getPerformer().get(i0).getFunction().getCoding().size() < i1+1) { immunization.getPerformer().get(i0).getFunction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunization.getPerformer().get(i0).getFunction().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Immnztn_Prfrmr_Function_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnPrfrmrFunctionCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getImmnztnPrfrmrFunctionCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getPerformer().size() < i0+1) { immunization.addPerformer(); }
				String[] arrayi1 = i.getImmnztnPrfrmrFunctionCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunization.getPerformer().get(i0).getFunction().getCoding().size() < i1+1) { immunization.getPerformer().get(i0).getFunction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunization.getPerformer().get(i0).getFunction().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Immnztn_Prfrmr_Function_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnPrfrmrFunctionCdgVrsn() != null ) {

			String[] arrayi0 = i.getImmnztnPrfrmrFunctionCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getPerformer().size() < i0+1) { immunization.addPerformer(); }
				String[] arrayi1 = i.getImmnztnPrfrmrFunctionCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunization.getPerformer().get(i0).getFunction().getCoding().size() < i1+1) { immunization.getPerformer().get(i0).getFunction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunization.getPerformer().get(i0).getFunction().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Immnztn_Prfrmr_Function_Txt ********************************************************************************/
		if(i.getImmnztnPrfrmrFunctionTxt() != null ) {

			String[] arrayi0 = i.getImmnztnPrfrmrFunctionTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getPerformer().size() < i0+1) { immunization.addPerformer(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getPerformer().get(i0).getFunction().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Immnztn_PrimarySrc ********************************************************************************/
		if(i.getImmnztnPrimarySrc() != null ) {

			if(i.getImmnztnPrimarySrc().replace("[","").replace("]","").equals("NULL") | i.getImmnztnPrimarySrc()==null) {} else {
			immunization.setPrimarySource(Boolean.parseBoolean(i.getImmnztnPrimarySrc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Immnztn_PrgrmElgblty_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnPrgrmElgbltyCdgCd() != null ) {

			String[] arrayi0 = i.getImmnztnPrgrmElgbltyCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getProgramEligibility().size() < i0+1) { immunization.addProgramEligibility(); }
				String[] arrayi1 = i.getImmnztnPrgrmElgbltyCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunization.getProgramEligibility().get(i0).getCoding().size() < i1+1) { immunization.getProgramEligibility().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunization.getProgramEligibility().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Immnztn_PrgrmElgblty_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnPrgrmElgbltyCdgDsply() != null ) {

			String[] arrayi0 = i.getImmnztnPrgrmElgbltyCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getProgramEligibility().size() < i0+1) { immunization.addProgramEligibility(); }
				String[] arrayi1 = i.getImmnztnPrgrmElgbltyCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunization.getProgramEligibility().get(i0).getCoding().size() < i1+1) { immunization.getProgramEligibility().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunization.getProgramEligibility().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Immnztn_PrgrmElgblty_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnPrgrmElgbltyCdgSys() != null ) {

			String[] arrayi0 = i.getImmnztnPrgrmElgbltyCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getProgramEligibility().size() < i0+1) { immunization.addProgramEligibility(); }
				String[] arrayi1 = i.getImmnztnPrgrmElgbltyCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunization.getProgramEligibility().get(i0).getCoding().size() < i1+1) { immunization.getProgramEligibility().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunization.getProgramEligibility().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Immnztn_PrgrmElgblty_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnPrgrmElgbltyCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getImmnztnPrgrmElgbltyCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getProgramEligibility().size() < i0+1) { immunization.addProgramEligibility(); }
				String[] arrayi1 = i.getImmnztnPrgrmElgbltyCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunization.getProgramEligibility().get(i0).getCoding().size() < i1+1) { immunization.getProgramEligibility().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunization.getProgramEligibility().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Immnztn_PrgrmElgblty_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnPrgrmElgbltyCdgVrsn() != null ) {

			String[] arrayi0 = i.getImmnztnPrgrmElgbltyCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getProgramEligibility().size() < i0+1) { immunization.addProgramEligibility(); }
				String[] arrayi1 = i.getImmnztnPrgrmElgbltyCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunization.getProgramEligibility().get(i0).getCoding().size() < i1+1) { immunization.getProgramEligibility().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunization.getProgramEligibility().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Immnztn_PrgrmElgblty_Txt ********************************************************************************/
		if(i.getImmnztnPrgrmElgbltyTxt() != null ) {

			String[] arrayi0 = i.getImmnztnPrgrmElgbltyTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getProgramEligibility().size() < i0+1) { immunization.addProgramEligibility(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getProgramEligibility().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Immnztn_ProtocolApplied_Athrity ********************************************************************************/
		if(i.getImmnztnProtocolAppliedAthrity() != null ) {

			String[] arrayi0 = i.getImmnztnProtocolAppliedAthrity().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getProtocolApplied().size() < i0+1) { immunization.addProtocolApplied(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getProtocolApplied().get(i0).setAuthority(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Immnztn_ProtocolApplied_DoseNmbrPositiveIntTyp ********************************************************************************/
		if(i.getImmnztnProtocolAppliedDoseNmbrPositiveIntTyp() != null ) {

			String[] arrayi0 = i.getImmnztnProtocolAppliedDoseNmbrPositiveIntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getProtocolApplied().size() < i0+1) { immunization.addProtocolApplied(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getProtocolApplied().get(i0).setDoseNumber(new org.hl7.fhir.r4.model.PositiveIntType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Immnztn_ProtocolApplied_DoseNmbrStrgTyp ********************************************************************************/
		if(i.getImmnztnProtocolAppliedDoseNmbrStrgTyp() != null ) {

			String[] arrayi0 = i.getImmnztnProtocolAppliedDoseNmbrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getProtocolApplied().size() < i0+1) { immunization.addProtocolApplied(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getProtocolApplied().get(i0).setDoseNumber(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Immnztn_ProtocolApplied_Series ********************************************************************************/
		if(i.getImmnztnProtocolAppliedSeries() != null ) {

			String[] arrayi0 = i.getImmnztnProtocolAppliedSeries().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getProtocolApplied().size() < i0+1) { immunization.addProtocolApplied(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getProtocolApplied().get(i0).setSeries(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Immnztn_ProtocolApplied_SeriesDosesPositiveIntTyp ********************************************************************************/
		if(i.getImmnztnProtocolAppliedSeriesDosesPositiveIntTyp() != null ) {

			String[] arrayi0 = i.getImmnztnProtocolAppliedSeriesDosesPositiveIntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getProtocolApplied().size() < i0+1) { immunization.addProtocolApplied(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getProtocolApplied().get(i0).setSeriesDoses(new org.hl7.fhir.r4.model.PositiveIntType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Immnztn_ProtocolApplied_SeriesDosesStrgTyp ********************************************************************************/
		if(i.getImmnztnProtocolAppliedSeriesDosesStrgTyp() != null ) {

			String[] arrayi0 = i.getImmnztnProtocolAppliedSeriesDosesStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getProtocolApplied().size() < i0+1) { immunization.addProtocolApplied(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getProtocolApplied().get(i0).setSeriesDoses(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Immnztn_ProtocolApplied_TarDisease_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnProtocolAppliedTarDiseaseCdgCd() != null ) {

			String[] arrayi0 = i.getImmnztnProtocolAppliedTarDiseaseCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getProtocolApplied().size() < i0+1) { immunization.addProtocolApplied(); }
				String[] arrayi1 = i.getImmnztnProtocolAppliedTarDiseaseCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunization.getProtocolApplied().get(i0).getTargetDisease().size() < i1+1) { immunization.getProtocolApplied().get(i0).getTargetDisease(); }
					String[] arrayi2 = i.getImmnztnProtocolAppliedTarDiseaseCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(immunization.getProtocolApplied().get(i0).getTargetDisease().get(i1).getCoding().size() < i2+1) { immunization.getProtocolApplied().get(i0).getTargetDisease().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {immunization.getProtocolApplied().get(i0).getTargetDisease().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Immnztn_ProtocolApplied_TarDisease_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnProtocolAppliedTarDiseaseCdgDsply() != null ) {

			String[] arrayi0 = i.getImmnztnProtocolAppliedTarDiseaseCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getProtocolApplied().size() < i0+1) { immunization.addProtocolApplied(); }
				String[] arrayi1 = i.getImmnztnProtocolAppliedTarDiseaseCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunization.getProtocolApplied().get(i0).getTargetDisease().size() < i1+1) { immunization.getProtocolApplied().get(i0).getTargetDisease(); }
					String[] arrayi2 = i.getImmnztnProtocolAppliedTarDiseaseCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(immunization.getProtocolApplied().get(i0).getTargetDisease().get(i1).getCoding().size() < i2+1) { immunization.getProtocolApplied().get(i0).getTargetDisease().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {immunization.getProtocolApplied().get(i0).getTargetDisease().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Immnztn_ProtocolApplied_TarDisease_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnProtocolAppliedTarDiseaseCdgSys() != null ) {

			String[] arrayi0 = i.getImmnztnProtocolAppliedTarDiseaseCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getProtocolApplied().size() < i0+1) { immunization.addProtocolApplied(); }
				String[] arrayi1 = i.getImmnztnProtocolAppliedTarDiseaseCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunization.getProtocolApplied().get(i0).getTargetDisease().size() < i1+1) { immunization.getProtocolApplied().get(i0).getTargetDisease(); }
					String[] arrayi2 = i.getImmnztnProtocolAppliedTarDiseaseCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(immunization.getProtocolApplied().get(i0).getTargetDisease().get(i1).getCoding().size() < i2+1) { immunization.getProtocolApplied().get(i0).getTargetDisease().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {immunization.getProtocolApplied().get(i0).getTargetDisease().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Immnztn_ProtocolApplied_TarDisease_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnProtocolAppliedTarDiseaseCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getImmnztnProtocolAppliedTarDiseaseCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getProtocolApplied().size() < i0+1) { immunization.addProtocolApplied(); }
				String[] arrayi1 = i.getImmnztnProtocolAppliedTarDiseaseCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunization.getProtocolApplied().get(i0).getTargetDisease().size() < i1+1) { immunization.getProtocolApplied().get(i0).getTargetDisease(); }
					String[] arrayi2 = i.getImmnztnProtocolAppliedTarDiseaseCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(immunization.getProtocolApplied().get(i0).getTargetDisease().get(i1).getCoding().size() < i2+1) { immunization.getProtocolApplied().get(i0).getTargetDisease().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {immunization.getProtocolApplied().get(i0).getTargetDisease().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Immnztn_ProtocolApplied_TarDisease_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnProtocolAppliedTarDiseaseCdgVrsn() != null ) {

			String[] arrayi0 = i.getImmnztnProtocolAppliedTarDiseaseCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getProtocolApplied().size() < i0+1) { immunization.addProtocolApplied(); }
				String[] arrayi1 = i.getImmnztnProtocolAppliedTarDiseaseCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunization.getProtocolApplied().get(i0).getTargetDisease().size() < i1+1) { immunization.getProtocolApplied().get(i0).getTargetDisease(); }
					String[] arrayi2 = i.getImmnztnProtocolAppliedTarDiseaseCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(immunization.getProtocolApplied().get(i0).getTargetDisease().get(i1).getCoding().size() < i2+1) { immunization.getProtocolApplied().get(i0).getTargetDisease().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {immunization.getProtocolApplied().get(i0).getTargetDisease().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Immnztn_ProtocolApplied_TarDisease_Txt ********************************************************************************/
		if(i.getImmnztnProtocolAppliedTarDiseaseTxt() != null ) {

			String[] arrayi0 = i.getImmnztnProtocolAppliedTarDiseaseTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getProtocolApplied().size() < i0+1) { immunization.addProtocolApplied(); }
				String[] arrayi1 = i.getImmnztnProtocolAppliedTarDiseaseTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunization.getProtocolApplied().get(i0).getTargetDisease().size() < i1+1) { immunization.getProtocolApplied().get(i0).getTargetDisease(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunization.getProtocolApplied().get(i0).getTargetDisease().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Immnztn_Reaction_Dt ********************************************************************************/
		if(i.getImmnztnReactionDt() != null ) {

			String[] arrayi0 = i.getImmnztnReactionDt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getReaction().size() < i0+1) { immunization.addReaction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getReaction().get(i0).setDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Immnztn_Reaction_Dtl ********************************************************************************/
		if(i.getImmnztnReactionDtl() != null ) {

			String[] arrayi0 = i.getImmnztnReactionDtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getReaction().size() < i0+1) { immunization.addReaction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getReaction().get(i0).setDetail(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Immnztn_Reaction_Rpted ********************************************************************************/
		if(i.getImmnztnReactionRpted() != null ) {

			String[] arrayi0 = i.getImmnztnReactionRpted().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getReaction().size() < i0+1) { immunization.addReaction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getReaction().get(i0).setReported(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Immnztn_RsnCd_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnRsnCdCdgCd() != null ) {

			String[] arrayi0 = i.getImmnztnRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getReasonCode().size() < i0+1) { immunization.addReasonCode(); }
				String[] arrayi1 = i.getImmnztnRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunization.getReasonCode().get(i0).getCoding().size() < i1+1) { immunization.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunization.getReasonCode().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Immnztn_RsnCd_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnRsnCdCdgDsply() != null ) {

			String[] arrayi0 = i.getImmnztnRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getReasonCode().size() < i0+1) { immunization.addReasonCode(); }
				String[] arrayi1 = i.getImmnztnRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunization.getReasonCode().get(i0).getCoding().size() < i1+1) { immunization.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunization.getReasonCode().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Immnztn_RsnCd_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnRsnCdCdgSys() != null ) {

			String[] arrayi0 = i.getImmnztnRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getReasonCode().size() < i0+1) { immunization.addReasonCode(); }
				String[] arrayi1 = i.getImmnztnRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunization.getReasonCode().get(i0).getCoding().size() < i1+1) { immunization.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunization.getReasonCode().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Immnztn_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnRsnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getImmnztnRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getReasonCode().size() < i0+1) { immunization.addReasonCode(); }
				String[] arrayi1 = i.getImmnztnRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunization.getReasonCode().get(i0).getCoding().size() < i1+1) { immunization.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunization.getReasonCode().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Immnztn_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnRsnCdCdgVrsn() != null ) {

			String[] arrayi0 = i.getImmnztnRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getReasonCode().size() < i0+1) { immunization.addReasonCode(); }
				String[] arrayi1 = i.getImmnztnRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunization.getReasonCode().get(i0).getCoding().size() < i1+1) { immunization.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunization.getReasonCode().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Immnztn_RsnCd_Txt ********************************************************************************/
		if(i.getImmnztnRsnCdTxt() != null ) {

			String[] arrayi0 = i.getImmnztnRsnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getReasonCode().size() < i0+1) { immunization.addReasonCode(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getReasonCode().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Immnztn_RsnRfrnc ********************************************************************************/
		if(i.getImmnztnRsnRfrnc() != null ) {

				for( String currListStrSplit : i.getImmnztnRsnRfrnc().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			immunization.addReasonReference(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Immnztn_Recorded ********************************************************************************/
		if(i.getImmnztnRecorded() != null ) {

			if(i.getImmnztnRecorded().replace("[","").replace("]","").equals("NULL") | i.getImmnztnRecorded()==null) {} else {
			immunization.setRecorded(i.getImmnztnRecorded().replace("[","").replace("]","").equals("NULL") | i.getImmnztnRecorded()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(i.getImmnztnRecorded().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Immnztn_RptOrigin_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnRptOriginCdgCd() != null ) {

			String[] arrayi0 = i.getImmnztnRptOriginCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getReportOrigin().getCoding().size() < i0+1) { immunization.getReportOrigin().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getReportOrigin().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Immnztn_RptOrigin_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnRptOriginCdgDsply() != null ) {

			String[] arrayi0 = i.getImmnztnRptOriginCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getReportOrigin().getCoding().size() < i0+1) { immunization.getReportOrigin().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getReportOrigin().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Immnztn_RptOrigin_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnRptOriginCdgSys() != null ) {

			String[] arrayi0 = i.getImmnztnRptOriginCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getReportOrigin().getCoding().size() < i0+1) { immunization.getReportOrigin().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getReportOrigin().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Immnztn_RptOrigin_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnRptOriginCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getImmnztnRptOriginCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getReportOrigin().getCoding().size() < i0+1) { immunization.getReportOrigin().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getReportOrigin().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Immnztn_RptOrigin_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnRptOriginCdgVrsn() != null ) {

			String[] arrayi0 = i.getImmnztnRptOriginCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getReportOrigin().getCoding().size() < i0+1) { immunization.getReportOrigin().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getReportOrigin().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Immnztn_RptOrigin_Txt ********************************************************************************/
		if(i.getImmnztnRptOriginTxt() != null ) {

			if(i.getImmnztnRptOriginTxt().replace("[","").replace("]","").equals("NULL") | i.getImmnztnRptOriginTxt()==null) {} else {
			immunization.getReportOrigin().setText(i.getImmnztnRptOriginTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Immnztn_Route_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnRouteCdgCd() != null ) {

			String[] arrayi0 = i.getImmnztnRouteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getRoute().getCoding().size() < i0+1) { immunization.getRoute().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getRoute().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Immnztn_Route_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnRouteCdgDsply() != null ) {

			String[] arrayi0 = i.getImmnztnRouteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getRoute().getCoding().size() < i0+1) { immunization.getRoute().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getRoute().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Immnztn_Route_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnRouteCdgSys() != null ) {

			String[] arrayi0 = i.getImmnztnRouteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getRoute().getCoding().size() < i0+1) { immunization.getRoute().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getRoute().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Immnztn_Route_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnRouteCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getImmnztnRouteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getRoute().getCoding().size() < i0+1) { immunization.getRoute().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getRoute().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Immnztn_Route_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnRouteCdgVrsn() != null ) {

			String[] arrayi0 = i.getImmnztnRouteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getRoute().getCoding().size() < i0+1) { immunization.getRoute().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getRoute().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Immnztn_Route_Txt ********************************************************************************/
		if(i.getImmnztnRouteTxt() != null ) {

			if(i.getImmnztnRouteTxt().replace("[","").replace("]","").equals("NULL") | i.getImmnztnRouteTxt()==null) {} else {
			immunization.getRoute().setText(i.getImmnztnRouteTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Immnztn_Site_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnSiteCdgCd() != null ) {

			String[] arrayi0 = i.getImmnztnSiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getSite().getCoding().size() < i0+1) { immunization.getSite().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getSite().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Immnztn_Site_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnSiteCdgDsply() != null ) {

			String[] arrayi0 = i.getImmnztnSiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getSite().getCoding().size() < i0+1) { immunization.getSite().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getSite().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Immnztn_Site_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnSiteCdgSys() != null ) {

			String[] arrayi0 = i.getImmnztnSiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getSite().getCoding().size() < i0+1) { immunization.getSite().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getSite().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Immnztn_Site_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnSiteCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getImmnztnSiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getSite().getCoding().size() < i0+1) { immunization.getSite().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getSite().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Immnztn_Site_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnSiteCdgVrsn() != null ) {

			String[] arrayi0 = i.getImmnztnSiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getSite().getCoding().size() < i0+1) { immunization.getSite().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getSite().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Immnztn_Site_Txt ********************************************************************************/
		if(i.getImmnztnSiteTxt() != null ) {

			if(i.getImmnztnSiteTxt().replace("[","").replace("]","").equals("NULL") | i.getImmnztnSiteTxt()==null) {} else {
			immunization.getSite().setText(i.getImmnztnSiteTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Immnztn_Sts ********************************************************************************/
		if(i.getImmnztnSts() != null ) {

			if(i.getImmnztnSts().replace("[","").replace("]","").equals("NULL") | i.getImmnztnSts()==null) {} else {
			immunization.setStatus(new org.hl7.fhir.r4.model.Immunization.ImmunizationStatusEnumFactory().fromCode(i.getImmnztnSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Immnztn_StsRsn_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnStsRsnCdgCd() != null ) {

			String[] arrayi0 = i.getImmnztnStsRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getStatusReason().getCoding().size() < i0+1) { immunization.getStatusReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getStatusReason().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Immnztn_StsRsn_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnStsRsnCdgDsply() != null ) {

			String[] arrayi0 = i.getImmnztnStsRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getStatusReason().getCoding().size() < i0+1) { immunization.getStatusReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getStatusReason().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Immnztn_StsRsn_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnStsRsnCdgSys() != null ) {

			String[] arrayi0 = i.getImmnztnStsRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getStatusReason().getCoding().size() < i0+1) { immunization.getStatusReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getStatusReason().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Immnztn_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnStsRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getImmnztnStsRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getStatusReason().getCoding().size() < i0+1) { immunization.getStatusReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getStatusReason().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Immnztn_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnStsRsnCdgVrsn() != null ) {

			String[] arrayi0 = i.getImmnztnStsRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getStatusReason().getCoding().size() < i0+1) { immunization.getStatusReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getStatusReason().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Immnztn_StsRsn_Txt ********************************************************************************/
		if(i.getImmnztnStsRsnTxt() != null ) {

			if(i.getImmnztnStsRsnTxt().replace("[","").replace("]","").equals("NULL") | i.getImmnztnStsRsnTxt()==null) {} else {
			immunization.getStatusReason().setText(i.getImmnztnStsRsnTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Immnztn_SubpotentRsn_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnSubpotentRsnCdgCd() != null ) {

			String[] arrayi0 = i.getImmnztnSubpotentRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getSubpotentReason().size() < i0+1) { immunization.addSubpotentReason(); }
				String[] arrayi1 = i.getImmnztnSubpotentRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunization.getSubpotentReason().get(i0).getCoding().size() < i1+1) { immunization.getSubpotentReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunization.getSubpotentReason().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Immnztn_SubpotentRsn_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnSubpotentRsnCdgDsply() != null ) {

			String[] arrayi0 = i.getImmnztnSubpotentRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getSubpotentReason().size() < i0+1) { immunization.addSubpotentReason(); }
				String[] arrayi1 = i.getImmnztnSubpotentRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunization.getSubpotentReason().get(i0).getCoding().size() < i1+1) { immunization.getSubpotentReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunization.getSubpotentReason().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Immnztn_SubpotentRsn_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnSubpotentRsnCdgSys() != null ) {

			String[] arrayi0 = i.getImmnztnSubpotentRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getSubpotentReason().size() < i0+1) { immunization.addSubpotentReason(); }
				String[] arrayi1 = i.getImmnztnSubpotentRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunization.getSubpotentReason().get(i0).getCoding().size() < i1+1) { immunization.getSubpotentReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunization.getSubpotentReason().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Immnztn_SubpotentRsn_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnSubpotentRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getImmnztnSubpotentRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getSubpotentReason().size() < i0+1) { immunization.addSubpotentReason(); }
				String[] arrayi1 = i.getImmnztnSubpotentRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunization.getSubpotentReason().get(i0).getCoding().size() < i1+1) { immunization.getSubpotentReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunization.getSubpotentReason().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Immnztn_SubpotentRsn_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnSubpotentRsnCdgVrsn() != null ) {

			String[] arrayi0 = i.getImmnztnSubpotentRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getSubpotentReason().size() < i0+1) { immunization.addSubpotentReason(); }
				String[] arrayi1 = i.getImmnztnSubpotentRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunization.getSubpotentReason().get(i0).getCoding().size() < i1+1) { immunization.getSubpotentReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunization.getSubpotentReason().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Immnztn_SubpotentRsn_Txt ********************************************************************************/
		if(i.getImmnztnSubpotentRsnTxt() != null ) {

			String[] arrayi0 = i.getImmnztnSubpotentRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getSubpotentReason().size() < i0+1) { immunization.addSubpotentReason(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getSubpotentReason().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Immnztn_VaccineCd_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnVaccineCdCdgCd() != null ) {

			String[] arrayi0 = i.getImmnztnVaccineCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getVaccineCode().getCoding().size() < i0+1) { immunization.getVaccineCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getVaccineCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Immnztn_VaccineCd_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnVaccineCdCdgDsply() != null ) {

			String[] arrayi0 = i.getImmnztnVaccineCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getVaccineCode().getCoding().size() < i0+1) { immunization.getVaccineCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getVaccineCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Immnztn_VaccineCd_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnVaccineCdCdgSys() != null ) {

			String[] arrayi0 = i.getImmnztnVaccineCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getVaccineCode().getCoding().size() < i0+1) { immunization.getVaccineCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getVaccineCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Immnztn_VaccineCd_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnVaccineCdCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getImmnztnVaccineCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getVaccineCode().getCoding().size() < i0+1) { immunization.getVaccineCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getVaccineCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Immnztn_VaccineCd_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnVaccineCdCdgVrsn() != null ) {

			String[] arrayi0 = i.getImmnztnVaccineCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunization.getVaccineCode().getCoding().size() < i0+1) { immunization.getVaccineCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunization.getVaccineCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Immnztn_VaccineCd_Txt ********************************************************************************/
		if(i.getImmnztnVaccineCdTxt() != null ) {

			if(i.getImmnztnVaccineCdTxt().replace("[","").replace("]","").equals("NULL") | i.getImmnztnVaccineCdTxt()==null) {} else {
			immunization.getVaccineCode().setText(i.getImmnztnVaccineCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return immunization;
	}
}
