package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.PaymentNotice;
public class PaymentNoticeConversion 
{
	public org.hl7.fhir.r4.model.PaymentNotice PaymentNotices(PaymentNotice p) throws ParseException
	{
		org.hl7.fhir.r4.model.PaymentNotice paymentnotice = new org.hl7.fhir.r4.model.PaymentNotice();

		/******************** id ********************************************************************************/
		paymentnotice.setId(p.getId());

		/******************** PymntNotice_Amnt_Crncy ********************************************************************************/
		if(p.getPymntNoticeAmntCrncy() != null ) {

			if(p.getPymntNoticeAmntCrncy().replace("[","").replace("]","").equals("NULL") | p.getPymntNoticeAmntCrncy()==null) {} else {
			paymentnotice.getAmount().setCurrency(p.getPymntNoticeAmntCrncy().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** PymntNotice_Amnt_Vl ********************************************************************************/
		if(p.getPymntNoticeAmntVl() != null ) {

			if(p.getPymntNoticeAmntVl().replace("[","").replace("]","").equals("NULL") | p.getPymntNoticeAmntVl()==null) {} else {
			paymentnotice.getAmount().setValue((new java.math.BigDecimal((p.getPymntNoticeAmntVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** PymntNotice_Created ********************************************************************************/
		if(p.getPymntNoticeCreated() != null ) {

			if(p.getPymntNoticeCreated().replace("[","").replace("]","").equals("NULL") | p.getPymntNoticeCreated()==null) {} else {
			paymentnotice.setCreated(p.getPymntNoticeCreated().replace("[","").replace("]","").equals("NULL") | p.getPymntNoticeCreated()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(p.getPymntNoticeCreated().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** PymntNotice_Id_Assigner ********************************************************************************/
		if(p.getPymntNoticeIdAssigner() != null ) {

			String[] arrayi0 = p.getPymntNoticeIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentnotice.getIdentifier().size() < i0+1) { paymentnotice.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentnotice.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PymntNotice_Id_Prd_End ********************************************************************************/
		if(p.getPymntNoticeIdPrdEnd() != null ) {

			String[] arrayi0 = p.getPymntNoticeIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentnotice.getIdentifier().size() < i0+1) { paymentnotice.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentnotice.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PymntNotice_Id_Prd_Strt ********************************************************************************/
		if(p.getPymntNoticeIdPrdStrt() != null ) {

			String[] arrayi0 = p.getPymntNoticeIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentnotice.getIdentifier().size() < i0+1) { paymentnotice.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentnotice.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PymntNotice_Id_Sys ********************************************************************************/
		if(p.getPymntNoticeIdSys() != null ) {

			String[] arrayi0 = p.getPymntNoticeIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentnotice.getIdentifier().size() < i0+1) { paymentnotice.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentnotice.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PymntNotice_Id_Typ_Cdg_Cd ********************************************************************************/
		if(p.getPymntNoticeIdTypCdgCd() != null ) {

			String[] arrayi0 = p.getPymntNoticeIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentnotice.getIdentifier().size() < i0+1) { paymentnotice.addIdentifier(); }
				String[] arrayi1 = p.getPymntNoticeIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(paymentnotice.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { paymentnotice.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {paymentnotice.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PymntNotice_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(p.getPymntNoticeIdTypCdgDsply() != null ) {

			String[] arrayi0 = p.getPymntNoticeIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentnotice.getIdentifier().size() < i0+1) { paymentnotice.addIdentifier(); }
				String[] arrayi1 = p.getPymntNoticeIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(paymentnotice.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { paymentnotice.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {paymentnotice.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PymntNotice_Id_Typ_Cdg_Sys ********************************************************************************/
		if(p.getPymntNoticeIdTypCdgSys() != null ) {

			String[] arrayi0 = p.getPymntNoticeIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentnotice.getIdentifier().size() < i0+1) { paymentnotice.addIdentifier(); }
				String[] arrayi1 = p.getPymntNoticeIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(paymentnotice.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { paymentnotice.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {paymentnotice.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PymntNotice_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(p.getPymntNoticeIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPymntNoticeIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentnotice.getIdentifier().size() < i0+1) { paymentnotice.addIdentifier(); }
				String[] arrayi1 = p.getPymntNoticeIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(paymentnotice.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { paymentnotice.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {paymentnotice.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PymntNotice_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(p.getPymntNoticeIdTypCdgVrsn() != null ) {

			String[] arrayi0 = p.getPymntNoticeIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentnotice.getIdentifier().size() < i0+1) { paymentnotice.addIdentifier(); }
				String[] arrayi1 = p.getPymntNoticeIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(paymentnotice.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { paymentnotice.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {paymentnotice.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PymntNotice_Id_Typ_Txt ********************************************************************************/
		if(p.getPymntNoticeIdTypTxt() != null ) {

			String[] arrayi0 = p.getPymntNoticeIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentnotice.getIdentifier().size() < i0+1) { paymentnotice.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentnotice.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PymntNotice_Id_Use ********************************************************************************/
		if(p.getPymntNoticeIdUse() != null ) {

			String[] arrayi0 = p.getPymntNoticeIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentnotice.getIdentifier().size() < i0+1) { paymentnotice.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentnotice.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PymntNotice_Id_Vl ********************************************************************************/
		if(p.getPymntNoticeIdVl() != null ) {

			String[] arrayi0 = p.getPymntNoticeIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentnotice.getIdentifier().size() < i0+1) { paymentnotice.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentnotice.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PymntNotice_Payee ********************************************************************************/
		if(p.getPymntNoticePayee() != null ) {

			if(p.getPymntNoticePayee().replace("[","").replace("]","").equals("NULL") | p.getPymntNoticePayee()==null) {} else {
			paymentnotice.setPayee(new org.hl7.fhir.r4.model.Reference(p.getPymntNoticePayee().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** PymntNotice_Pymnt ********************************************************************************/
		if(p.getPymntNoticePymnt() != null ) {

			if(p.getPymntNoticePymnt().replace("[","").replace("]","").equals("NULL") | p.getPymntNoticePymnt()==null) {} else {
			paymentnotice.setPayment(new org.hl7.fhir.r4.model.Reference(p.getPymntNoticePymnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** PymntNotice_PymntDt ********************************************************************************/
		if(p.getPymntNoticePymntDt() != null ) {

			if(p.getPymntNoticePymntDt().replace("[","").replace("]","").equals("NULL") | p.getPymntNoticePymntDt()==null) {} else {
			paymentnotice.setPaymentDate(p.getPymntNoticePymntDt().replace("[","").replace("]","").equals("NULL") | p.getPymntNoticePymntDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(p.getPymntNoticePymntDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** PymntNotice_PymntSts_Cdg_Cd ********************************************************************************/
		if(p.getPymntNoticePymntStsCdgCd() != null ) {

			String[] arrayi0 = p.getPymntNoticePymntStsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentnotice.getPaymentStatus().getCoding().size() < i0+1) { paymentnotice.getPaymentStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentnotice.getPaymentStatus().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PymntNotice_PymntSts_Cdg_Dsply ********************************************************************************/
		if(p.getPymntNoticePymntStsCdgDsply() != null ) {

			String[] arrayi0 = p.getPymntNoticePymntStsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentnotice.getPaymentStatus().getCoding().size() < i0+1) { paymentnotice.getPaymentStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentnotice.getPaymentStatus().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PymntNotice_PymntSts_Cdg_Sys ********************************************************************************/
		if(p.getPymntNoticePymntStsCdgSys() != null ) {

			String[] arrayi0 = p.getPymntNoticePymntStsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentnotice.getPaymentStatus().getCoding().size() < i0+1) { paymentnotice.getPaymentStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentnotice.getPaymentStatus().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PymntNotice_PymntSts_Cdg_UsrSltd ********************************************************************************/
		if(p.getPymntNoticePymntStsCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPymntNoticePymntStsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentnotice.getPaymentStatus().getCoding().size() < i0+1) { paymentnotice.getPaymentStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentnotice.getPaymentStatus().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PymntNotice_PymntSts_Cdg_Vrsn ********************************************************************************/
		if(p.getPymntNoticePymntStsCdgVrsn() != null ) {

			String[] arrayi0 = p.getPymntNoticePymntStsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(paymentnotice.getPaymentStatus().getCoding().size() < i0+1) { paymentnotice.getPaymentStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {paymentnotice.getPaymentStatus().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PymntNotice_PymntSts_Txt ********************************************************************************/
		if(p.getPymntNoticePymntStsTxt() != null ) {

			if(p.getPymntNoticePymntStsTxt().replace("[","").replace("]","").equals("NULL") | p.getPymntNoticePymntStsTxt()==null) {} else {
			paymentnotice.getPaymentStatus().setText(p.getPymntNoticePymntStsTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** PymntNotice_Provider ********************************************************************************/
		if(p.getPymntNoticeProvider() != null ) {

			if(p.getPymntNoticeProvider().replace("[","").replace("]","").equals("NULL") | p.getPymntNoticeProvider()==null) {} else {
			paymentnotice.setProvider(new org.hl7.fhir.r4.model.Reference(p.getPymntNoticeProvider().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** PymntNotice_Recipient ********************************************************************************/
		if(p.getPymntNoticeRecipient() != null ) {

			if(p.getPymntNoticeRecipient().replace("[","").replace("]","").equals("NULL") | p.getPymntNoticeRecipient()==null) {} else {
			paymentnotice.setRecipient(new org.hl7.fhir.r4.model.Reference(p.getPymntNoticeRecipient().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** PymntNotice_Rqst ********************************************************************************/
		if(p.getPymntNoticeRqst() != null ) {

			if(p.getPymntNoticeRqst().replace("[","").replace("]","").equals("NULL") | p.getPymntNoticeRqst()==null) {} else {
			paymentnotice.setRequest(new org.hl7.fhir.r4.model.Reference(p.getPymntNoticeRqst().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** PymntNotice_Rsps ********************************************************************************/
		if(p.getPymntNoticeRsps() != null ) {

			if(p.getPymntNoticeRsps().replace("[","").replace("]","").equals("NULL") | p.getPymntNoticeRsps()==null) {} else {
			paymentnotice.setResponse(new org.hl7.fhir.r4.model.Reference(p.getPymntNoticeRsps().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** PymntNotice_Sts ********************************************************************************/
		if(p.getPymntNoticeSts() != null ) {

			if(p.getPymntNoticeSts().replace("[","").replace("]","").equals("NULL") | p.getPymntNoticeSts()==null) {} else {
			paymentnotice.setStatus(new org.hl7.fhir.r4.model.PaymentNotice.PaymentNoticeStatusEnumFactory().fromCode(p.getPymntNoticeSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return paymentnotice;
	}
}
