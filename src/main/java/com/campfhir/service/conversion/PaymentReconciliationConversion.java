package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.PaymentReconciliation;
public class PaymentReconciliationConversion 
{
	public org.hl7.fhir.r4.model.PaymentReconciliation PaymentReconciliations(PaymentReconciliation p) throws ParseException
	{
		org.hl7.fhir.r4.model.PaymentReconciliation paymentreconciliation = new org.hl7.fhir.r4.model.PaymentReconciliation();

		/******************** id ********************************************************************************/
		paymentreconciliation.setId(p.getId());

		/******************** PymntRecncliatn_Created ********************************************************************************/
		if(p.getPymntRecncliatnCreated() != null ) {

			if(p.getPymntRecncliatnCreated().replace("[","").replace("]","").equals("NULL") | p.getPymntRecncliatnCreated()==null) {} else {
			paymentreconciliation.setCreated(p.getPymntRecncliatnCreated().replace("[","").replace("]","").equals("NULL") | p.getPymntRecncliatnCreated()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(p.getPymntRecncliatnCreated().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** PymntRecncliatn_Dtl_Amnt_Crncy ********************************************************************************/
		if(p.getPymntRecncliatnDtlAmntCrncy() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlAmntCrncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getDetail().get(i0).getAmount().setCurrency(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PymntRecncliatn_Dtl_Amnt_Vl ********************************************************************************/
		if(p.getPymntRecncliatnDtlAmntVl() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getDetail().get(i0).getAmount().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** PymntRecncliatn_Dtl_Dt ********************************************************************************/
		if(p.getPymntRecncliatnDtlDt() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlDt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getDetail().get(i0).setDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PymntRecncliatn_Dtl_Id_Assigner ********************************************************************************/
		if(p.getPymntRecncliatnDtlIdAssigner() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getDetail().get(i0).getIdentifier().setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PymntRecncliatn_Dtl_Id_Prd_End ********************************************************************************/
		if(p.getPymntRecncliatnDtlIdPrdEnd() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getDetail().get(i0).getIdentifier().getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PymntRecncliatn_Dtl_Id_Prd_Strt ********************************************************************************/
		if(p.getPymntRecncliatnDtlIdPrdStrt() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getDetail().get(i0).getIdentifier().getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PymntRecncliatn_Dtl_Id_Sys ********************************************************************************/
		if(p.getPymntRecncliatnDtlIdSys() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getDetail().get(i0).getIdentifier().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PymntRecncliatn_Dtl_Id_Typ_Cdg_Cd ********************************************************************************/
		if(p.getPymntRecncliatnDtlIdTypCdgCd() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				String[] arrayi1 = p.getPymntRecncliatnDtlIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(paymentreconciliation.getDetail().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { paymentreconciliation.getDetail().get(i0).getIdentifier().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {paymentreconciliation.getDetail().get(i0).getIdentifier().getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PymntRecncliatn_Dtl_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(p.getPymntRecncliatnDtlIdTypCdgDsply() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				String[] arrayi1 = p.getPymntRecncliatnDtlIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(paymentreconciliation.getDetail().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { paymentreconciliation.getDetail().get(i0).getIdentifier().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {paymentreconciliation.getDetail().get(i0).getIdentifier().getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PymntRecncliatn_Dtl_Id_Typ_Cdg_Sys ********************************************************************************/
		if(p.getPymntRecncliatnDtlIdTypCdgSys() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				String[] arrayi1 = p.getPymntRecncliatnDtlIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(paymentreconciliation.getDetail().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { paymentreconciliation.getDetail().get(i0).getIdentifier().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {paymentreconciliation.getDetail().get(i0).getIdentifier().getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PymntRecncliatn_Dtl_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(p.getPymntRecncliatnDtlIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				String[] arrayi1 = p.getPymntRecncliatnDtlIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(paymentreconciliation.getDetail().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { paymentreconciliation.getDetail().get(i0).getIdentifier().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {paymentreconciliation.getDetail().get(i0).getIdentifier().getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PymntRecncliatn_Dtl_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(p.getPymntRecncliatnDtlIdTypCdgVrsn() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				String[] arrayi1 = p.getPymntRecncliatnDtlIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(paymentreconciliation.getDetail().get(i0).getIdentifier().getType().getCoding().size() < i1+1) { paymentreconciliation.getDetail().get(i0).getIdentifier().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {paymentreconciliation.getDetail().get(i0).getIdentifier().getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PymntRecncliatn_Dtl_Id_Typ_Txt ********************************************************************************/
		if(p.getPymntRecncliatnDtlIdTypTxt() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getDetail().get(i0).getIdentifier().getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PymntRecncliatn_Dtl_Id_Use ********************************************************************************/
		if(p.getPymntRecncliatnDtlIdUse() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getDetail().get(i0).getIdentifier().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PymntRecncliatn_Dtl_Id_Vl ********************************************************************************/
		if(p.getPymntRecncliatnDtlIdVl() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getDetail().get(i0).getIdentifier().setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PymntRecncliatn_Dtl_Payee ********************************************************************************/
		if(p.getPymntRecncliatnDtlPayee() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlPayee().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getDetail().get(i0).setPayee(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PymntRecncliatn_Dtl_Predecessor_Assigner ********************************************************************************/
		if(p.getPymntRecncliatnDtlPredecessorAssigner() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlPredecessorAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getDetail().get(i0).getPredecessor().setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PymntRecncliatn_Dtl_Predecessor_Prd_End ********************************************************************************/
		if(p.getPymntRecncliatnDtlPredecessorPrdEnd() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlPredecessorPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getDetail().get(i0).getPredecessor().getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PymntRecncliatn_Dtl_Predecessor_Prd_Strt ********************************************************************************/
		if(p.getPymntRecncliatnDtlPredecessorPrdStrt() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlPredecessorPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getDetail().get(i0).getPredecessor().getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PymntRecncliatn_Dtl_Predecessor_Sys ********************************************************************************/
		if(p.getPymntRecncliatnDtlPredecessorSys() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlPredecessorSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getDetail().get(i0).getPredecessor().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PymntRecncliatn_Dtl_Predecessor_Typ_Cdg_Cd ********************************************************************************/
		if(p.getPymntRecncliatnDtlPredecessorTypCdgCd() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlPredecessorTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				String[] arrayi1 = p.getPymntRecncliatnDtlPredecessorTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(paymentreconciliation.getDetail().get(i0).getPredecessor().getType().getCoding().size() < i1+1) { paymentreconciliation.getDetail().get(i0).getPredecessor().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {paymentreconciliation.getDetail().get(i0).getPredecessor().getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PymntRecncliatn_Dtl_Predecessor_Typ_Cdg_Dsply ********************************************************************************/
		if(p.getPymntRecncliatnDtlPredecessorTypCdgDsply() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlPredecessorTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				String[] arrayi1 = p.getPymntRecncliatnDtlPredecessorTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(paymentreconciliation.getDetail().get(i0).getPredecessor().getType().getCoding().size() < i1+1) { paymentreconciliation.getDetail().get(i0).getPredecessor().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {paymentreconciliation.getDetail().get(i0).getPredecessor().getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PymntRecncliatn_Dtl_Predecessor_Typ_Cdg_Sys ********************************************************************************/
		if(p.getPymntRecncliatnDtlPredecessorTypCdgSys() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlPredecessorTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				String[] arrayi1 = p.getPymntRecncliatnDtlPredecessorTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(paymentreconciliation.getDetail().get(i0).getPredecessor().getType().getCoding().size() < i1+1) { paymentreconciliation.getDetail().get(i0).getPredecessor().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {paymentreconciliation.getDetail().get(i0).getPredecessor().getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PymntRecncliatn_Dtl_Predecessor_Typ_Cdg_UsrSltd ********************************************************************************/
		if(p.getPymntRecncliatnDtlPredecessorTypCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlPredecessorTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				String[] arrayi1 = p.getPymntRecncliatnDtlPredecessorTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(paymentreconciliation.getDetail().get(i0).getPredecessor().getType().getCoding().size() < i1+1) { paymentreconciliation.getDetail().get(i0).getPredecessor().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {paymentreconciliation.getDetail().get(i0).getPredecessor().getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PymntRecncliatn_Dtl_Predecessor_Typ_Cdg_Vrsn ********************************************************************************/
		if(p.getPymntRecncliatnDtlPredecessorTypCdgVrsn() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlPredecessorTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				String[] arrayi1 = p.getPymntRecncliatnDtlPredecessorTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(paymentreconciliation.getDetail().get(i0).getPredecessor().getType().getCoding().size() < i1+1) { paymentreconciliation.getDetail().get(i0).getPredecessor().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {paymentreconciliation.getDetail().get(i0).getPredecessor().getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PymntRecncliatn_Dtl_Predecessor_Typ_Txt ********************************************************************************/
		if(p.getPymntRecncliatnDtlPredecessorTypTxt() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlPredecessorTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getDetail().get(i0).getPredecessor().getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PymntRecncliatn_Dtl_Predecessor_Use ********************************************************************************/
		if(p.getPymntRecncliatnDtlPredecessorUse() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlPredecessorUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getDetail().get(i0).getPredecessor().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PymntRecncliatn_Dtl_Predecessor_Vl ********************************************************************************/
		if(p.getPymntRecncliatnDtlPredecessorVl() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlPredecessorVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getDetail().get(i0).getPredecessor().setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PymntRecncliatn_Dtl_Rqst ********************************************************************************/
		if(p.getPymntRecncliatnDtlRqst() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlRqst().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getDetail().get(i0).setRequest(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PymntRecncliatn_Dtl_Rsps ********************************************************************************/
		if(p.getPymntRecncliatnDtlRsps() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlRsps().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getDetail().get(i0).setResponse(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PymntRecncliatn_Dtl_Responsible ********************************************************************************/
		if(p.getPymntRecncliatnDtlResponsible() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlResponsible().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getDetail().get(i0).setResponsible(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PymntRecncliatn_Dtl_Submitter ********************************************************************************/
		if(p.getPymntRecncliatnDtlSubmitter() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlSubmitter().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getDetail().get(i0).setSubmitter(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PymntRecncliatn_Dtl_Typ_Cdg_Cd ********************************************************************************/
		if(p.getPymntRecncliatnDtlTypCdgCd() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				String[] arrayi1 = p.getPymntRecncliatnDtlTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(paymentreconciliation.getDetail().get(i0).getType().getCoding().size() < i1+1) { paymentreconciliation.getDetail().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {paymentreconciliation.getDetail().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PymntRecncliatn_Dtl_Typ_Cdg_Dsply ********************************************************************************/
		if(p.getPymntRecncliatnDtlTypCdgDsply() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				String[] arrayi1 = p.getPymntRecncliatnDtlTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(paymentreconciliation.getDetail().get(i0).getType().getCoding().size() < i1+1) { paymentreconciliation.getDetail().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {paymentreconciliation.getDetail().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PymntRecncliatn_Dtl_Typ_Cdg_Sys ********************************************************************************/
		if(p.getPymntRecncliatnDtlTypCdgSys() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				String[] arrayi1 = p.getPymntRecncliatnDtlTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(paymentreconciliation.getDetail().get(i0).getType().getCoding().size() < i1+1) { paymentreconciliation.getDetail().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {paymentreconciliation.getDetail().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PymntRecncliatn_Dtl_Typ_Cdg_UsrSltd ********************************************************************************/
		if(p.getPymntRecncliatnDtlTypCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				String[] arrayi1 = p.getPymntRecncliatnDtlTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(paymentreconciliation.getDetail().get(i0).getType().getCoding().size() < i1+1) { paymentreconciliation.getDetail().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {paymentreconciliation.getDetail().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PymntRecncliatn_Dtl_Typ_Cdg_Vrsn ********************************************************************************/
		if(p.getPymntRecncliatnDtlTypCdgVrsn() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				String[] arrayi1 = p.getPymntRecncliatnDtlTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(paymentreconciliation.getDetail().get(i0).getType().getCoding().size() < i1+1) { paymentreconciliation.getDetail().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {paymentreconciliation.getDetail().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PymntRecncliatn_Dtl_Typ_Txt ********************************************************************************/
		if(p.getPymntRecncliatnDtlTypTxt() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnDtlTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getDetail().size() < i0+1) { paymentreconciliation.addDetail(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getDetail().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PymntRecncliatn_Disposition ********************************************************************************/
		if(p.getPymntRecncliatnDisposition() != null ) {

			if(p.getPymntRecncliatnDisposition().replace("[","").replace("]","").equals("NULL") | p.getPymntRecncliatnDisposition()==null) {} else {
			paymentreconciliation.setDisposition(p.getPymntRecncliatnDisposition().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** PymntRecncliatn_FrmCd_Cdg_Cd ********************************************************************************/
		if(p.getPymntRecncliatnFrmCdCdgCd() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnFrmCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getFormCode().getCoding().size() < i0+1) { paymentreconciliation.getFormCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getFormCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PymntRecncliatn_FrmCd_Cdg_Dsply ********************************************************************************/
		if(p.getPymntRecncliatnFrmCdCdgDsply() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnFrmCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getFormCode().getCoding().size() < i0+1) { paymentreconciliation.getFormCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getFormCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PymntRecncliatn_FrmCd_Cdg_Sys ********************************************************************************/
		if(p.getPymntRecncliatnFrmCdCdgSys() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnFrmCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getFormCode().getCoding().size() < i0+1) { paymentreconciliation.getFormCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getFormCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PymntRecncliatn_FrmCd_Cdg_UsrSltd ********************************************************************************/
		if(p.getPymntRecncliatnFrmCdCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnFrmCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getFormCode().getCoding().size() < i0+1) { paymentreconciliation.getFormCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getFormCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PymntRecncliatn_FrmCd_Cdg_Vrsn ********************************************************************************/
		if(p.getPymntRecncliatnFrmCdCdgVrsn() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnFrmCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getFormCode().getCoding().size() < i0+1) { paymentreconciliation.getFormCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getFormCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PymntRecncliatn_FrmCd_Txt ********************************************************************************/
		if(p.getPymntRecncliatnFrmCdTxt() != null ) {

			if(p.getPymntRecncliatnFrmCdTxt().replace("[","").replace("]","").equals("NULL") | p.getPymntRecncliatnFrmCdTxt()==null) {} else {
			paymentreconciliation.getFormCode().setText(p.getPymntRecncliatnFrmCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** PymntRecncliatn_Id_Assigner ********************************************************************************/
		if(p.getPymntRecncliatnIdAssigner() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getIdentifier().size() < i0+1) { paymentreconciliation.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PymntRecncliatn_Id_Prd_End ********************************************************************************/
		if(p.getPymntRecncliatnIdPrdEnd() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getIdentifier().size() < i0+1) { paymentreconciliation.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PymntRecncliatn_Id_Prd_Strt ********************************************************************************/
		if(p.getPymntRecncliatnIdPrdStrt() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getIdentifier().size() < i0+1) { paymentreconciliation.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PymntRecncliatn_Id_Sys ********************************************************************************/
		if(p.getPymntRecncliatnIdSys() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getIdentifier().size() < i0+1) { paymentreconciliation.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PymntRecncliatn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(p.getPymntRecncliatnIdTypCdgCd() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getIdentifier().size() < i0+1) { paymentreconciliation.addIdentifier(); }
				String[] arrayi1 = p.getPymntRecncliatnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(paymentreconciliation.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { paymentreconciliation.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {paymentreconciliation.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PymntRecncliatn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(p.getPymntRecncliatnIdTypCdgDsply() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getIdentifier().size() < i0+1) { paymentreconciliation.addIdentifier(); }
				String[] arrayi1 = p.getPymntRecncliatnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(paymentreconciliation.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { paymentreconciliation.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {paymentreconciliation.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PymntRecncliatn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(p.getPymntRecncliatnIdTypCdgSys() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getIdentifier().size() < i0+1) { paymentreconciliation.addIdentifier(); }
				String[] arrayi1 = p.getPymntRecncliatnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(paymentreconciliation.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { paymentreconciliation.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {paymentreconciliation.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PymntRecncliatn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(p.getPymntRecncliatnIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getIdentifier().size() < i0+1) { paymentreconciliation.addIdentifier(); }
				String[] arrayi1 = p.getPymntRecncliatnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(paymentreconciliation.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { paymentreconciliation.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {paymentreconciliation.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PymntRecncliatn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(p.getPymntRecncliatnIdTypCdgVrsn() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getIdentifier().size() < i0+1) { paymentreconciliation.addIdentifier(); }
				String[] arrayi1 = p.getPymntRecncliatnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(paymentreconciliation.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { paymentreconciliation.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {paymentreconciliation.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PymntRecncliatn_Id_Typ_Txt ********************************************************************************/
		if(p.getPymntRecncliatnIdTypTxt() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getIdentifier().size() < i0+1) { paymentreconciliation.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PymntRecncliatn_Id_Use ********************************************************************************/
		if(p.getPymntRecncliatnIdUse() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getIdentifier().size() < i0+1) { paymentreconciliation.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PymntRecncliatn_Id_Vl ********************************************************************************/
		if(p.getPymntRecncliatnIdVl() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getIdentifier().size() < i0+1) { paymentreconciliation.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PymntRecncliatn_Outcome ********************************************************************************/
		if(p.getPymntRecncliatnOutcome() != null ) {

			if(p.getPymntRecncliatnOutcome().replace("[","").replace("]","").equals("NULL") | p.getPymntRecncliatnOutcome()==null) {} else {
			paymentreconciliation.setOutcome(new org.hl7.fhir.r4.model.Enumerations.RemittanceOutcomeEnumFactory().fromCode(p.getPymntRecncliatnOutcome().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** PymntRecncliatn_PymntAmnt_Crncy ********************************************************************************/
		if(p.getPymntRecncliatnPymntAmntCrncy() != null ) {

			if(p.getPymntRecncliatnPymntAmntCrncy().replace("[","").replace("]","").equals("NULL") | p.getPymntRecncliatnPymntAmntCrncy()==null) {} else {
			paymentreconciliation.getPaymentAmount().setCurrency(p.getPymntRecncliatnPymntAmntCrncy().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** PymntRecncliatn_PymntAmnt_Vl ********************************************************************************/
		if(p.getPymntRecncliatnPymntAmntVl() != null ) {

			if(p.getPymntRecncliatnPymntAmntVl().replace("[","").replace("]","").equals("NULL") | p.getPymntRecncliatnPymntAmntVl()==null) {} else {
			paymentreconciliation.getPaymentAmount().setValue((new java.math.BigDecimal((p.getPymntRecncliatnPymntAmntVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** PymntRecncliatn_PymntDt ********************************************************************************/
		if(p.getPymntRecncliatnPymntDt() != null ) {

			if(p.getPymntRecncliatnPymntDt().replace("[","").replace("]","").equals("NULL") | p.getPymntRecncliatnPymntDt()==null) {} else {
			paymentreconciliation.setPaymentDate(p.getPymntRecncliatnPymntDt().replace("[","").replace("]","").equals("NULL") | p.getPymntRecncliatnPymntDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(p.getPymntRecncliatnPymntDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** PymntRecncliatn_PymntId_Assigner ********************************************************************************/
		if(p.getPymntRecncliatnPymntIdAssigner() != null ) {

			if(p.getPymntRecncliatnPymntIdAssigner().replace("[","").replace("]","").equals("NULL") | p.getPymntRecncliatnPymntIdAssigner()==null) {} else {
			paymentreconciliation.getPaymentIdentifier().setAssigner(new org.hl7.fhir.r4.model.Reference(p.getPymntRecncliatnPymntIdAssigner().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** PymntRecncliatn_PymntId_Prd_End ********************************************************************************/
		if(p.getPymntRecncliatnPymntIdPrdEnd() != null ) {

			if(p.getPymntRecncliatnPymntIdPrdEnd().replace("[","").replace("]","").equals("NULL") | p.getPymntRecncliatnPymntIdPrdEnd()==null) {} else {
			paymentreconciliation.getPaymentIdentifier().getPeriod().setEnd(p.getPymntRecncliatnPymntIdPrdEnd().replace("[","").replace("]","").equals("NULL") | p.getPymntRecncliatnPymntIdPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(p.getPymntRecncliatnPymntIdPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** PymntRecncliatn_PymntId_Prd_Strt ********************************************************************************/
		if(p.getPymntRecncliatnPymntIdPrdStrt() != null ) {

			if(p.getPymntRecncliatnPymntIdPrdStrt().replace("[","").replace("]","").equals("NULL") | p.getPymntRecncliatnPymntIdPrdStrt()==null) {} else {
			paymentreconciliation.getPaymentIdentifier().getPeriod().setStart(p.getPymntRecncliatnPymntIdPrdStrt().replace("[","").replace("]","").equals("NULL") | p.getPymntRecncliatnPymntIdPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(p.getPymntRecncliatnPymntIdPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** PymntRecncliatn_PymntId_Sys ********************************************************************************/
		if(p.getPymntRecncliatnPymntIdSys() != null ) {

			if(p.getPymntRecncliatnPymntIdSys().replace("[","").replace("]","").equals("NULL") | p.getPymntRecncliatnPymntIdSys()==null) {} else {
			paymentreconciliation.getPaymentIdentifier().setSystem(p.getPymntRecncliatnPymntIdSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** PymntRecncliatn_PymntId_Typ_Cdg_Cd ********************************************************************************/
		if(p.getPymntRecncliatnPymntIdTypCdgCd() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnPymntIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getPaymentIdentifier().getType().getCoding().size() < i0+1) { paymentreconciliation.getPaymentIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getPaymentIdentifier().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PymntRecncliatn_PymntId_Typ_Cdg_Dsply ********************************************************************************/
		if(p.getPymntRecncliatnPymntIdTypCdgDsply() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnPymntIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getPaymentIdentifier().getType().getCoding().size() < i0+1) { paymentreconciliation.getPaymentIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getPaymentIdentifier().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PymntRecncliatn_PymntId_Typ_Cdg_Sys ********************************************************************************/
		if(p.getPymntRecncliatnPymntIdTypCdgSys() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnPymntIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getPaymentIdentifier().getType().getCoding().size() < i0+1) { paymentreconciliation.getPaymentIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getPaymentIdentifier().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PymntRecncliatn_PymntId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(p.getPymntRecncliatnPymntIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnPymntIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getPaymentIdentifier().getType().getCoding().size() < i0+1) { paymentreconciliation.getPaymentIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getPaymentIdentifier().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PymntRecncliatn_PymntId_Typ_Cdg_Vrsn ********************************************************************************/
		if(p.getPymntRecncliatnPymntIdTypCdgVrsn() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnPymntIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getPaymentIdentifier().getType().getCoding().size() < i0+1) { paymentreconciliation.getPaymentIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getPaymentIdentifier().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PymntRecncliatn_PymntId_Typ_Txt ********************************************************************************/
		if(p.getPymntRecncliatnPymntIdTypTxt() != null ) {

			if(p.getPymntRecncliatnPymntIdTypTxt().replace("[","").replace("]","").equals("NULL") | p.getPymntRecncliatnPymntIdTypTxt()==null) {} else {
			paymentreconciliation.getPaymentIdentifier().getType().setText(p.getPymntRecncliatnPymntIdTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** PymntRecncliatn_PymntId_Use ********************************************************************************/
		if(p.getPymntRecncliatnPymntIdUse() != null ) {

			if(p.getPymntRecncliatnPymntIdUse().replace("[","").replace("]","").equals("NULL") | p.getPymntRecncliatnPymntIdUse()==null) {} else {
			paymentreconciliation.getPaymentIdentifier().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(p.getPymntRecncliatnPymntIdUse().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** PymntRecncliatn_PymntId_Vl ********************************************************************************/
		if(p.getPymntRecncliatnPymntIdVl() != null ) {

			if(p.getPymntRecncliatnPymntIdVl().replace("[","").replace("]","").equals("NULL") | p.getPymntRecncliatnPymntIdVl()==null) {} else {
			paymentreconciliation.getPaymentIdentifier().setValue(p.getPymntRecncliatnPymntIdVl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** PymntRecncliatn_PymntIssuer ********************************************************************************/
		if(p.getPymntRecncliatnPymntIssuer() != null ) {

			if(p.getPymntRecncliatnPymntIssuer().replace("[","").replace("]","").equals("NULL") | p.getPymntRecncliatnPymntIssuer()==null) {} else {
			paymentreconciliation.setPaymentIssuer(new org.hl7.fhir.r4.model.Reference(p.getPymntRecncliatnPymntIssuer().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** PymntRecncliatn_Prd_End ********************************************************************************/
		if(p.getPymntRecncliatnPrdEnd() != null ) {

			if(p.getPymntRecncliatnPrdEnd().replace("[","").replace("]","").equals("NULL") | p.getPymntRecncliatnPrdEnd()==null) {} else {
			paymentreconciliation.getPeriod().setEnd(p.getPymntRecncliatnPrdEnd().replace("[","").replace("]","").equals("NULL") | p.getPymntRecncliatnPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(p.getPymntRecncliatnPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** PymntRecncliatn_Prd_Strt ********************************************************************************/
		if(p.getPymntRecncliatnPrdStrt() != null ) {

			if(p.getPymntRecncliatnPrdStrt().replace("[","").replace("]","").equals("NULL") | p.getPymntRecncliatnPrdStrt()==null) {} else {
			paymentreconciliation.getPeriod().setStart(p.getPymntRecncliatnPrdStrt().replace("[","").replace("]","").equals("NULL") | p.getPymntRecncliatnPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(p.getPymntRecncliatnPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** PymntRecncliatn_ProcessNt_Txt ********************************************************************************/
		if(p.getPymntRecncliatnProcessNtTxt() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnProcessNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getProcessNote().size() < i0+1) { paymentreconciliation.addProcessNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getProcessNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PymntRecncliatn_ProcessNt_Typ ********************************************************************************/
		if(p.getPymntRecncliatnProcessNtTyp() != null ) {

			String[] arrayi0 = p.getPymntRecncliatnProcessNtTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentreconciliation.getProcessNote().size() < i0+1) { paymentreconciliation.addProcessNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentreconciliation.getProcessNote().get(i0).setType(new org.hl7.fhir.r4.model.Enumerations.NoteTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PymntRecncliatn_Rqst ********************************************************************************/
		if(p.getPymntRecncliatnRqst() != null ) {

			if(p.getPymntRecncliatnRqst().replace("[","").replace("]","").equals("NULL") | p.getPymntRecncliatnRqst()==null) {} else {
			paymentreconciliation.setRequest(new org.hl7.fhir.r4.model.Reference(p.getPymntRecncliatnRqst().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** PymntRecncliatn_Rqstor ********************************************************************************/
		if(p.getPymntRecncliatnRqstor() != null ) {

			if(p.getPymntRecncliatnRqstor().replace("[","").replace("]","").equals("NULL") | p.getPymntRecncliatnRqstor()==null) {} else {
			paymentreconciliation.setRequestor(new org.hl7.fhir.r4.model.Reference(p.getPymntRecncliatnRqstor().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** PymntRecncliatn_Sts ********************************************************************************/
		if(p.getPymntRecncliatnSts() != null ) {

			if(p.getPymntRecncliatnSts().replace("[","").replace("]","").equals("NULL") | p.getPymntRecncliatnSts()==null) {} else {
			paymentreconciliation.setStatus(new org.hl7.fhir.r4.model.PaymentReconciliation.PaymentReconciliationStatusEnumFactory().fromCode(p.getPymntRecncliatnSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return paymentreconciliation;
	}
}
