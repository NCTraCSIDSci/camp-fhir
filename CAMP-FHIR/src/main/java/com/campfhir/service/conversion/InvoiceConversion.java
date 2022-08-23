package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Invoice;
public class InvoiceConversion 
{
	public org.hl7.fhir.r4.model.Invoice Invoices(Invoice i) throws ParseException
	{
		org.hl7.fhir.r4.model.Invoice invoice = new org.hl7.fhir.r4.model.Invoice();

		/******************** id ********************************************************************************/
		invoice.setId(i.getId());

		/******************** Invce_Account ********************************************************************************/
		if(i.getInvceAccount() != null ) {

			if(i.getInvceAccount().replace("[","").replace("]","").equals("NULL") | i.getInvceAccount()==null) {} else {
			invoice.setAccount(new org.hl7.fhir.r4.model.Reference(i.getInvceAccount().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Invce_CancelledRsn ********************************************************************************/
		if(i.getInvceCancelledRsn() != null ) {

			if(i.getInvceCancelledRsn().replace("[","").replace("]","").equals("NULL") | i.getInvceCancelledRsn()==null) {} else {
			invoice.setCancelledReason(i.getInvceCancelledRsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Invce_Dt ********************************************************************************/
		if(i.getInvceDt() != null ) {

			if(i.getInvceDt().replace("[","").replace("]","").equals("NULL") | i.getInvceDt()==null) {} else {
			invoice.setDate(i.getInvceDt().replace("[","").replace("]","").equals("NULL") | i.getInvceDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(i.getInvceDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Invce_Id_Assigner ********************************************************************************/
		if(i.getInvceIdAssigner() != null ) {

			String[] arrayi0 = i.getInvceIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getIdentifier().size() < i0+1) { invoice.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {invoice.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Invce_Id_Prd_End ********************************************************************************/
		if(i.getInvceIdPrdEnd() != null ) {

			String[] arrayi0 = i.getInvceIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getIdentifier().size() < i0+1) { invoice.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {invoice.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Invce_Id_Prd_Strt ********************************************************************************/
		if(i.getInvceIdPrdStrt() != null ) {

			String[] arrayi0 = i.getInvceIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getIdentifier().size() < i0+1) { invoice.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {invoice.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Invce_Id_Sys ********************************************************************************/
		if(i.getInvceIdSys() != null ) {

			String[] arrayi0 = i.getInvceIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getIdentifier().size() < i0+1) { invoice.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {invoice.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Invce_Id_Typ_Cdg_Cd ********************************************************************************/
		if(i.getInvceIdTypCdgCd() != null ) {

			String[] arrayi0 = i.getInvceIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getIdentifier().size() < i0+1) { invoice.addIdentifier(); }
				String[] arrayi1 = i.getInvceIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(invoice.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { invoice.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {invoice.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Invce_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(i.getInvceIdTypCdgDsply() != null ) {

			String[] arrayi0 = i.getInvceIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getIdentifier().size() < i0+1) { invoice.addIdentifier(); }
				String[] arrayi1 = i.getInvceIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(invoice.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { invoice.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {invoice.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Invce_Id_Typ_Cdg_Sys ********************************************************************************/
		if(i.getInvceIdTypCdgSys() != null ) {

			String[] arrayi0 = i.getInvceIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getIdentifier().size() < i0+1) { invoice.addIdentifier(); }
				String[] arrayi1 = i.getInvceIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(invoice.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { invoice.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {invoice.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Invce_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(i.getInvceIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getInvceIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getIdentifier().size() < i0+1) { invoice.addIdentifier(); }
				String[] arrayi1 = i.getInvceIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(invoice.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { invoice.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {invoice.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Invce_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(i.getInvceIdTypCdgVrsn() != null ) {

			String[] arrayi0 = i.getInvceIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getIdentifier().size() < i0+1) { invoice.addIdentifier(); }
				String[] arrayi1 = i.getInvceIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(invoice.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { invoice.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {invoice.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Invce_Id_Typ_Txt ********************************************************************************/
		if(i.getInvceIdTypTxt() != null ) {

			String[] arrayi0 = i.getInvceIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getIdentifier().size() < i0+1) { invoice.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {invoice.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Invce_Id_Use ********************************************************************************/
		if(i.getInvceIdUse() != null ) {

			String[] arrayi0 = i.getInvceIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getIdentifier().size() < i0+1) { invoice.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {invoice.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Invce_Id_Vl ********************************************************************************/
		if(i.getInvceIdVl() != null ) {

			String[] arrayi0 = i.getInvceIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getIdentifier().size() < i0+1) { invoice.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {invoice.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Invce_Issuer ********************************************************************************/
		if(i.getInvceIssuer() != null ) {

			if(i.getInvceIssuer().replace("[","").replace("]","").equals("NULL") | i.getInvceIssuer()==null) {} else {
			invoice.setIssuer(new org.hl7.fhir.r4.model.Reference(i.getInvceIssuer().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Invce_LineItm_ChrgItmCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(i.getInvceLineItmChrgItmCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = i.getInvceLineItmChrgItmCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getLineItem().size() < i0+1) { invoice.addLineItem(); }
				String[] arrayi1 = i.getInvceLineItmChrgItmCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(invoice.getLineItem().get(i0).getChargeItemCodeableConcept().getCoding().size() < i1+1) { invoice.getLineItem().get(i0).getChargeItemCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {invoice.getLineItem().get(i0).getChargeItemCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Invce_LineItm_ChrgItmCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(i.getInvceLineItmChrgItmCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = i.getInvceLineItmChrgItmCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getLineItem().size() < i0+1) { invoice.addLineItem(); }
				String[] arrayi1 = i.getInvceLineItmChrgItmCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(invoice.getLineItem().get(i0).getChargeItemCodeableConcept().getCoding().size() < i1+1) { invoice.getLineItem().get(i0).getChargeItemCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {invoice.getLineItem().get(i0).getChargeItemCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Invce_LineItm_ChrgItmCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(i.getInvceLineItmChrgItmCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = i.getInvceLineItmChrgItmCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getLineItem().size() < i0+1) { invoice.addLineItem(); }
				String[] arrayi1 = i.getInvceLineItmChrgItmCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(invoice.getLineItem().get(i0).getChargeItemCodeableConcept().getCoding().size() < i1+1) { invoice.getLineItem().get(i0).getChargeItemCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {invoice.getLineItem().get(i0).getChargeItemCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Invce_LineItm_ChrgItmCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(i.getInvceLineItmChrgItmCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getInvceLineItmChrgItmCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getLineItem().size() < i0+1) { invoice.addLineItem(); }
				String[] arrayi1 = i.getInvceLineItmChrgItmCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(invoice.getLineItem().get(i0).getChargeItemCodeableConcept().getCoding().size() < i1+1) { invoice.getLineItem().get(i0).getChargeItemCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {invoice.getLineItem().get(i0).getChargeItemCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Invce_LineItm_ChrgItmCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(i.getInvceLineItmChrgItmCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = i.getInvceLineItmChrgItmCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getLineItem().size() < i0+1) { invoice.addLineItem(); }
				String[] arrayi1 = i.getInvceLineItmChrgItmCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(invoice.getLineItem().get(i0).getChargeItemCodeableConcept().getCoding().size() < i1+1) { invoice.getLineItem().get(i0).getChargeItemCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {invoice.getLineItem().get(i0).getChargeItemCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Invce_LineItm_ChrgItmCdbleCncpt_Txt ********************************************************************************/
		if(i.getInvceLineItmChrgItmCdbleCncptTxt() != null ) {

			String[] arrayi0 = i.getInvceLineItmChrgItmCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getLineItem().size() < i0+1) { invoice.addLineItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {invoice.getLineItem().get(i0).getChargeItemCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Invce_LineItm_ChrgItmRfrnc ********************************************************************************/
		if(i.getInvceLineItmChrgItmRfrnc() != null ) {

			String[] arrayi0 = i.getInvceLineItmChrgItmRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getLineItem().size() < i0+1) { invoice.addLineItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {invoice.getLineItem().get(i0).setChargeItem(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Invce_LineItm_PriceCmpnt_Amnt_Crncy ********************************************************************************/
		if(i.getInvceLineItmPriceCmpntAmntCrncy() != null ) {

			String[] arrayi0 = i.getInvceLineItmPriceCmpntAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getLineItem().size() < i0+1) { invoice.addLineItem(); }
				String[] arrayi1 = i.getInvceLineItmPriceCmpntAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(invoice.getLineItem().get(i0).getPriceComponent().size() < i1+1) { invoice.getLineItem().get(i0).addPriceComponent(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {invoice.getLineItem().get(i0).getPriceComponent().get(i1).getAmount().setCurrency(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Invce_LineItm_PriceCmpnt_Amnt_Vl ********************************************************************************/
		if(i.getInvceLineItmPriceCmpntAmntVl() != null ) {

			String[] arrayi0 = i.getInvceLineItmPriceCmpntAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getLineItem().size() < i0+1) { invoice.addLineItem(); }
				String[] arrayi1 = i.getInvceLineItmPriceCmpntAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(invoice.getLineItem().get(i0).getPriceComponent().size() < i1+1) { invoice.getLineItem().get(i0).addPriceComponent(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {invoice.getLineItem().get(i0).getPriceComponent().get(i1).getAmount().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** Invce_LineItm_PriceCmpnt_Cd_Cdg_Cd ********************************************************************************/
		if(i.getInvceLineItmPriceCmpntCdCdgCd() != null ) {

			String[] arrayi0 = i.getInvceLineItmPriceCmpntCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getLineItem().size() < i0+1) { invoice.addLineItem(); }
				String[] arrayi1 = i.getInvceLineItmPriceCmpntCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(invoice.getLineItem().get(i0).getPriceComponent().size() < i1+1) { invoice.getLineItem().get(i0).addPriceComponent(); }
					String[] arrayi2 = i.getInvceLineItmPriceCmpntCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(invoice.getLineItem().get(i0).getPriceComponent().get(i1).getCode().getCoding().size() < i2+1) { invoice.getLineItem().get(i0).getPriceComponent().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {invoice.getLineItem().get(i0).getPriceComponent().get(i1).getCode().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Invce_LineItm_PriceCmpnt_Cd_Cdg_Dsply ********************************************************************************/
		if(i.getInvceLineItmPriceCmpntCdCdgDsply() != null ) {

			String[] arrayi0 = i.getInvceLineItmPriceCmpntCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getLineItem().size() < i0+1) { invoice.addLineItem(); }
				String[] arrayi1 = i.getInvceLineItmPriceCmpntCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(invoice.getLineItem().get(i0).getPriceComponent().size() < i1+1) { invoice.getLineItem().get(i0).addPriceComponent(); }
					String[] arrayi2 = i.getInvceLineItmPriceCmpntCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(invoice.getLineItem().get(i0).getPriceComponent().get(i1).getCode().getCoding().size() < i2+1) { invoice.getLineItem().get(i0).getPriceComponent().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {invoice.getLineItem().get(i0).getPriceComponent().get(i1).getCode().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Invce_LineItm_PriceCmpnt_Cd_Cdg_Sys ********************************************************************************/
		if(i.getInvceLineItmPriceCmpntCdCdgSys() != null ) {

			String[] arrayi0 = i.getInvceLineItmPriceCmpntCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getLineItem().size() < i0+1) { invoice.addLineItem(); }
				String[] arrayi1 = i.getInvceLineItmPriceCmpntCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(invoice.getLineItem().get(i0).getPriceComponent().size() < i1+1) { invoice.getLineItem().get(i0).addPriceComponent(); }
					String[] arrayi2 = i.getInvceLineItmPriceCmpntCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(invoice.getLineItem().get(i0).getPriceComponent().get(i1).getCode().getCoding().size() < i2+1) { invoice.getLineItem().get(i0).getPriceComponent().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {invoice.getLineItem().get(i0).getPriceComponent().get(i1).getCode().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Invce_LineItm_PriceCmpnt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(i.getInvceLineItmPriceCmpntCdCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getInvceLineItmPriceCmpntCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getLineItem().size() < i0+1) { invoice.addLineItem(); }
				String[] arrayi1 = i.getInvceLineItmPriceCmpntCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(invoice.getLineItem().get(i0).getPriceComponent().size() < i1+1) { invoice.getLineItem().get(i0).addPriceComponent(); }
					String[] arrayi2 = i.getInvceLineItmPriceCmpntCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(invoice.getLineItem().get(i0).getPriceComponent().get(i1).getCode().getCoding().size() < i2+1) { invoice.getLineItem().get(i0).getPriceComponent().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {invoice.getLineItem().get(i0).getPriceComponent().get(i1).getCode().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Invce_LineItm_PriceCmpnt_Cd_Cdg_Vrsn ********************************************************************************/
		if(i.getInvceLineItmPriceCmpntCdCdgVrsn() != null ) {

			String[] arrayi0 = i.getInvceLineItmPriceCmpntCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getLineItem().size() < i0+1) { invoice.addLineItem(); }
				String[] arrayi1 = i.getInvceLineItmPriceCmpntCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(invoice.getLineItem().get(i0).getPriceComponent().size() < i1+1) { invoice.getLineItem().get(i0).addPriceComponent(); }
					String[] arrayi2 = i.getInvceLineItmPriceCmpntCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(invoice.getLineItem().get(i0).getPriceComponent().get(i1).getCode().getCoding().size() < i2+1) { invoice.getLineItem().get(i0).getPriceComponent().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {invoice.getLineItem().get(i0).getPriceComponent().get(i1).getCode().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Invce_LineItm_PriceCmpnt_Cd_Txt ********************************************************************************/
		if(i.getInvceLineItmPriceCmpntCdTxt() != null ) {

			String[] arrayi0 = i.getInvceLineItmPriceCmpntCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getLineItem().size() < i0+1) { invoice.addLineItem(); }
				String[] arrayi1 = i.getInvceLineItmPriceCmpntCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(invoice.getLineItem().get(i0).getPriceComponent().size() < i1+1) { invoice.getLineItem().get(i0).addPriceComponent(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {invoice.getLineItem().get(i0).getPriceComponent().get(i1).getCode().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Invce_LineItm_PriceCmpnt_Factor ********************************************************************************/
		if(i.getInvceLineItmPriceCmpntFactor() != null ) {

			String[] arrayi0 = i.getInvceLineItmPriceCmpntFactor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getLineItem().size() < i0+1) { invoice.addLineItem(); }
				String[] arrayi1 = i.getInvceLineItmPriceCmpntFactor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(invoice.getLineItem().get(i0).getPriceComponent().size() < i1+1) { invoice.getLineItem().get(i0).addPriceComponent(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {invoice.getLineItem().get(i0).getPriceComponent().get(i1).setFactor((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** Invce_LineItm_PriceCmpnt_Typ ********************************************************************************/
		if(i.getInvceLineItmPriceCmpntTyp() != null ) {

			String[] arrayi0 = i.getInvceLineItmPriceCmpntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getLineItem().size() < i0+1) { invoice.addLineItem(); }
				String[] arrayi1 = i.getInvceLineItmPriceCmpntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(invoice.getLineItem().get(i0).getPriceComponent().size() < i1+1) { invoice.getLineItem().get(i0).addPriceComponent(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {invoice.getLineItem().get(i0).getPriceComponent().get(i1).setType(new org.hl7.fhir.r4.model.Invoice.InvoicePriceComponentTypeEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Invce_LineItm_Sqnc ********************************************************************************/
		if(i.getInvceLineItmSqnc() != null ) {

			String[] arrayi0 = i.getInvceLineItmSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getLineItem().size() < i0+1) { invoice.addLineItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {invoice.getLineItem().get(i0).setSequence(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Invce_Nt_AthrRfrnc ********************************************************************************/
		if(i.getInvceNtAthrRfrnc() != null ) {

			String[] arrayi0 = i.getInvceNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getNote().size() < i0+1) { invoice.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {invoice.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Invce_Nt_AthrStrgTyp ********************************************************************************/
		if(i.getInvceNtAthrStrgTyp() != null ) {

			String[] arrayi0 = i.getInvceNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getNote().size() < i0+1) { invoice.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {invoice.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Invce_Nt_Txt ********************************************************************************/
		if(i.getInvceNtTxt() != null ) {

			String[] arrayi0 = i.getInvceNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getNote().size() < i0+1) { invoice.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {invoice.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Invce_Nt_Time ********************************************************************************/
		if(i.getInvceNtTime() != null ) {

			String[] arrayi0 = i.getInvceNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getNote().size() < i0+1) { invoice.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {invoice.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Invce_Prtcpnt_Actor ********************************************************************************/
		if(i.getInvcePrtcpntActor() != null ) {

			String[] arrayi0 = i.getInvcePrtcpntActor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getParticipant().size() < i0+1) { invoice.addParticipant(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {invoice.getParticipant().get(i0).setActor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Invce_Prtcpnt_Role_Cdg_Cd ********************************************************************************/
		if(i.getInvcePrtcpntRoleCdgCd() != null ) {

			String[] arrayi0 = i.getInvcePrtcpntRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getParticipant().size() < i0+1) { invoice.addParticipant(); }
				String[] arrayi1 = i.getInvcePrtcpntRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(invoice.getParticipant().get(i0).getRole().getCoding().size() < i1+1) { invoice.getParticipant().get(i0).getRole().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {invoice.getParticipant().get(i0).getRole().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Invce_Prtcpnt_Role_Cdg_Dsply ********************************************************************************/
		if(i.getInvcePrtcpntRoleCdgDsply() != null ) {

			String[] arrayi0 = i.getInvcePrtcpntRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getParticipant().size() < i0+1) { invoice.addParticipant(); }
				String[] arrayi1 = i.getInvcePrtcpntRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(invoice.getParticipant().get(i0).getRole().getCoding().size() < i1+1) { invoice.getParticipant().get(i0).getRole().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {invoice.getParticipant().get(i0).getRole().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Invce_Prtcpnt_Role_Cdg_Sys ********************************************************************************/
		if(i.getInvcePrtcpntRoleCdgSys() != null ) {

			String[] arrayi0 = i.getInvcePrtcpntRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getParticipant().size() < i0+1) { invoice.addParticipant(); }
				String[] arrayi1 = i.getInvcePrtcpntRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(invoice.getParticipant().get(i0).getRole().getCoding().size() < i1+1) { invoice.getParticipant().get(i0).getRole().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {invoice.getParticipant().get(i0).getRole().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Invce_Prtcpnt_Role_Cdg_UsrSltd ********************************************************************************/
		if(i.getInvcePrtcpntRoleCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getInvcePrtcpntRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getParticipant().size() < i0+1) { invoice.addParticipant(); }
				String[] arrayi1 = i.getInvcePrtcpntRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(invoice.getParticipant().get(i0).getRole().getCoding().size() < i1+1) { invoice.getParticipant().get(i0).getRole().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {invoice.getParticipant().get(i0).getRole().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Invce_Prtcpnt_Role_Cdg_Vrsn ********************************************************************************/
		if(i.getInvcePrtcpntRoleCdgVrsn() != null ) {

			String[] arrayi0 = i.getInvcePrtcpntRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getParticipant().size() < i0+1) { invoice.addParticipant(); }
				String[] arrayi1 = i.getInvcePrtcpntRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(invoice.getParticipant().get(i0).getRole().getCoding().size() < i1+1) { invoice.getParticipant().get(i0).getRole().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {invoice.getParticipant().get(i0).getRole().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Invce_Prtcpnt_Role_Txt ********************************************************************************/
		if(i.getInvcePrtcpntRoleTxt() != null ) {

			String[] arrayi0 = i.getInvcePrtcpntRoleTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getParticipant().size() < i0+1) { invoice.addParticipant(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {invoice.getParticipant().get(i0).getRole().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Invce_PymntTrms ********************************************************************************/
		if(i.getInvcePymntTrms() != null ) {

			if(i.getInvcePymntTrms().replace("[","").replace("]","").equals("NULL") | i.getInvcePymntTrms()==null) {} else {
			invoice.setPaymentTerms(i.getInvcePymntTrms().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Invce_Recipient ********************************************************************************/
		if(i.getInvceRecipient() != null ) {

			if(i.getInvceRecipient().replace("[","").replace("]","").equals("NULL") | i.getInvceRecipient()==null) {} else {
			invoice.setRecipient(new org.hl7.fhir.r4.model.Reference(i.getInvceRecipient().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Invce_Sts ********************************************************************************/
		if(i.getInvceSts() != null ) {

			if(i.getInvceSts().replace("[","").replace("]","").equals("NULL") | i.getInvceSts()==null) {} else {
			invoice.setStatus(new org.hl7.fhir.r4.model.Invoice.InvoiceStatusEnumFactory().fromCode(i.getInvceSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Invce_Sbjct ********************************************************************************/
		if(i.getInvceSbjct() != null ) {

			if(i.getInvceSbjct().replace("[","").replace("]","").equals("NULL") | i.getInvceSbjct()==null) {} else {
			invoice.setSubject(new org.hl7.fhir.r4.model.Reference(i.getInvceSbjct().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Invce_TotalGross_Crncy ********************************************************************************/
		if(i.getInvceTotalGrossCrncy() != null ) {

			if(i.getInvceTotalGrossCrncy().replace("[","").replace("]","").equals("NULL") | i.getInvceTotalGrossCrncy()==null) {} else {
			invoice.getTotalGross().setCurrency(i.getInvceTotalGrossCrncy().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Invce_TotalGross_Vl ********************************************************************************/
		if(i.getInvceTotalGrossVl() != null ) {

			if(i.getInvceTotalGrossVl().replace("[","").replace("]","").equals("NULL") | i.getInvceTotalGrossVl()==null) {} else {
			invoice.getTotalGross().setValue((new java.math.BigDecimal((i.getInvceTotalGrossVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Invce_TotalNet_Crncy ********************************************************************************/
		if(i.getInvceTotalNetCrncy() != null ) {

			if(i.getInvceTotalNetCrncy().replace("[","").replace("]","").equals("NULL") | i.getInvceTotalNetCrncy()==null) {} else {
			invoice.getTotalNet().setCurrency(i.getInvceTotalNetCrncy().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Invce_TotalNet_Vl ********************************************************************************/
		if(i.getInvceTotalNetVl() != null ) {

			if(i.getInvceTotalNetVl().replace("[","").replace("]","").equals("NULL") | i.getInvceTotalNetVl()==null) {} else {
			invoice.getTotalNet().setValue((new java.math.BigDecimal((i.getInvceTotalNetVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Invce_TotalPriceCmpnt_Amnt_Crncy ********************************************************************************/
		if(i.getInvceTotalPriceCmpntAmntCrncy() != null ) {

			String[] arrayi0 = i.getInvceTotalPriceCmpntAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getTotalPriceComponent().size() < i0+1) { invoice.addTotalPriceComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {invoice.getTotalPriceComponent().get(i0).getAmount().setCurrency(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Invce_TotalPriceCmpnt_Amnt_Vl ********************************************************************************/
		if(i.getInvceTotalPriceCmpntAmntVl() != null ) {

			String[] arrayi0 = i.getInvceTotalPriceCmpntAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getTotalPriceComponent().size() < i0+1) { invoice.addTotalPriceComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {invoice.getTotalPriceComponent().get(i0).getAmount().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Invce_TotalPriceCmpnt_Cd_Cdg_Cd ********************************************************************************/
		if(i.getInvceTotalPriceCmpntCdCdgCd() != null ) {

			String[] arrayi0 = i.getInvceTotalPriceCmpntCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getTotalPriceComponent().size() < i0+1) { invoice.addTotalPriceComponent(); }
				String[] arrayi1 = i.getInvceTotalPriceCmpntCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(invoice.getTotalPriceComponent().get(i0).getCode().getCoding().size() < i1+1) { invoice.getTotalPriceComponent().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {invoice.getTotalPriceComponent().get(i0).getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Invce_TotalPriceCmpnt_Cd_Cdg_Dsply ********************************************************************************/
		if(i.getInvceTotalPriceCmpntCdCdgDsply() != null ) {

			String[] arrayi0 = i.getInvceTotalPriceCmpntCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getTotalPriceComponent().size() < i0+1) { invoice.addTotalPriceComponent(); }
				String[] arrayi1 = i.getInvceTotalPriceCmpntCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(invoice.getTotalPriceComponent().get(i0).getCode().getCoding().size() < i1+1) { invoice.getTotalPriceComponent().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {invoice.getTotalPriceComponent().get(i0).getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Invce_TotalPriceCmpnt_Cd_Cdg_Sys ********************************************************************************/
		if(i.getInvceTotalPriceCmpntCdCdgSys() != null ) {

			String[] arrayi0 = i.getInvceTotalPriceCmpntCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getTotalPriceComponent().size() < i0+1) { invoice.addTotalPriceComponent(); }
				String[] arrayi1 = i.getInvceTotalPriceCmpntCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(invoice.getTotalPriceComponent().get(i0).getCode().getCoding().size() < i1+1) { invoice.getTotalPriceComponent().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {invoice.getTotalPriceComponent().get(i0).getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Invce_TotalPriceCmpnt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(i.getInvceTotalPriceCmpntCdCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getInvceTotalPriceCmpntCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getTotalPriceComponent().size() < i0+1) { invoice.addTotalPriceComponent(); }
				String[] arrayi1 = i.getInvceTotalPriceCmpntCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(invoice.getTotalPriceComponent().get(i0).getCode().getCoding().size() < i1+1) { invoice.getTotalPriceComponent().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {invoice.getTotalPriceComponent().get(i0).getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Invce_TotalPriceCmpnt_Cd_Cdg_Vrsn ********************************************************************************/
		if(i.getInvceTotalPriceCmpntCdCdgVrsn() != null ) {

			String[] arrayi0 = i.getInvceTotalPriceCmpntCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getTotalPriceComponent().size() < i0+1) { invoice.addTotalPriceComponent(); }
				String[] arrayi1 = i.getInvceTotalPriceCmpntCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(invoice.getTotalPriceComponent().get(i0).getCode().getCoding().size() < i1+1) { invoice.getTotalPriceComponent().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {invoice.getTotalPriceComponent().get(i0).getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Invce_TotalPriceCmpnt_Cd_Txt ********************************************************************************/
		if(i.getInvceTotalPriceCmpntCdTxt() != null ) {

			String[] arrayi0 = i.getInvceTotalPriceCmpntCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getTotalPriceComponent().size() < i0+1) { invoice.addTotalPriceComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {invoice.getTotalPriceComponent().get(i0).getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Invce_TotalPriceCmpnt_Factor ********************************************************************************/
		if(i.getInvceTotalPriceCmpntFactor() != null ) {

			String[] arrayi0 = i.getInvceTotalPriceCmpntFactor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getTotalPriceComponent().size() < i0+1) { invoice.addTotalPriceComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {invoice.getTotalPriceComponent().get(i0).setFactor((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Invce_TotalPriceCmpnt_Typ ********************************************************************************/
		if(i.getInvceTotalPriceCmpntTyp() != null ) {

			String[] arrayi0 = i.getInvceTotalPriceCmpntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getTotalPriceComponent().size() < i0+1) { invoice.addTotalPriceComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {invoice.getTotalPriceComponent().get(i0).setType(new org.hl7.fhir.r4.model.Invoice.InvoicePriceComponentTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Invce_Typ_Cdg_Cd ********************************************************************************/
		if(i.getInvceTypCdgCd() != null ) {

			String[] arrayi0 = i.getInvceTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getType().getCoding().size() < i0+1) { invoice.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {invoice.getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Invce_Typ_Cdg_Dsply ********************************************************************************/
		if(i.getInvceTypCdgDsply() != null ) {

			String[] arrayi0 = i.getInvceTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getType().getCoding().size() < i0+1) { invoice.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {invoice.getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Invce_Typ_Cdg_Sys ********************************************************************************/
		if(i.getInvceTypCdgSys() != null ) {

			String[] arrayi0 = i.getInvceTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getType().getCoding().size() < i0+1) { invoice.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {invoice.getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Invce_Typ_Cdg_UsrSltd ********************************************************************************/
		if(i.getInvceTypCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getInvceTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getType().getCoding().size() < i0+1) { invoice.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {invoice.getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Invce_Typ_Cdg_Vrsn ********************************************************************************/
		if(i.getInvceTypCdgVrsn() != null ) {

			String[] arrayi0 = i.getInvceTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(invoice.getType().getCoding().size() < i0+1) { invoice.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {invoice.getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Invce_Typ_Txt ********************************************************************************/
		if(i.getInvceTypTxt() != null ) {

			if(i.getInvceTypTxt().replace("[","").replace("]","").equals("NULL") | i.getInvceTypTxt()==null) {} else {
			invoice.getType().setText(i.getInvceTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return invoice;
	}
}
