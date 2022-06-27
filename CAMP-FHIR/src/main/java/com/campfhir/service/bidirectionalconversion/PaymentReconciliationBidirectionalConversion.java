package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.PaymentReconciliation;
public class PaymentReconciliationBidirectionalConversion 
{
	public PaymentReconciliation PaymentReconciliations(org.hl7.fhir.r4.model.PaymentReconciliation paymentreconciliation) throws ParseException
	{
		 main.java.com.campfhir.model.PaymentReconciliation p = new  main.java.com.campfhir.model.PaymentReconciliation();

		/******************** id ********************************************************************************/
		paymentreconciliation.setId(p.getId());

		/******************** paymentreconciliationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.PaymentReconciliation.PaymentReconciliationStatus paymentreconciliationstatus = paymentreconciliation.getStatus();
		p.setPymntRecncliatnSts(paymentreconciliationstatus.toCode());

		/******************** PymntRecncliatn_Rqst ********************************************************************************/
		if(paymentreconciliation.hasRequest()) {
			p.setPymntRecncliatnRqst(String.valueOf(paymentreconciliation.getRequest()));
		}
		/******************** PymntRecncliatn_Created ********************************************************************************/
		if(paymentreconciliation.hasCreated()) {
			p.setPymntRecncliatnCreated(String.valueOf(paymentreconciliation.getCreated()));
		}
		/******************** PymntRecncliatn_PymntIssuer ********************************************************************************/
		if(paymentreconciliation.hasPaymentIssuer()) {
			p.setPymntRecncliatnPymntIssuer(String.valueOf(paymentreconciliation.getPaymentIssuer()));
		}
		/******************** paymentreconciliationperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period paymentreconciliationperiod = paymentreconciliation.getPeriod();

		/******************** PymntRecncliatn_Prd_Strt ********************************************************************************/
		if(paymentreconciliationperiod.hasStart()) {
			p.setPymntRecncliatnPrdStrt(String.valueOf(paymentreconciliationperiod.getStart()));
		}
		/******************** PymntRecncliatn_Prd_End ********************************************************************************/
		if(paymentreconciliationperiod.hasEnd()) {
			p.setPymntRecncliatnPrdEnd(String.valueOf(paymentreconciliationperiod.getEnd()));
		}
		/******************** PymntRecncliatn_Rqstor ********************************************************************************/
		if(paymentreconciliation.hasRequestor()) {
			p.setPymntRecncliatnRqstor(String.valueOf(paymentreconciliation.getRequestor()));
		}
		/******************** PymntRecncliatn_PymntDt ********************************************************************************/
		if(paymentreconciliation.hasPaymentDate()) {
			p.setPymntRecncliatnPymntDt(String.valueOf(paymentreconciliation.getPaymentDate()));
		}
		/******************** paymentreconciliationoutcome ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.RemittanceOutcome paymentreconciliationoutcome = paymentreconciliation.getOutcome();
		p.setPymntRecncliatnOutcome(paymentreconciliationoutcome.toCode());

		/******************** PymntRecncliatn_Disposition ********************************************************************************/
		if(paymentreconciliation.hasDisposition()) {
			p.setPymntRecncliatnDisposition(String.valueOf(paymentreconciliation.getDisposition()));
		}
		/******************** paymentreconciliationpaymentamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money paymentreconciliationpaymentamount = paymentreconciliation.getPaymentAmount();

		/******************** PymntRecncliatn_PymntAmnt_Vl ********************************************************************************/
		if(paymentreconciliationpaymentamount.hasValue()) {
			p.setPymntRecncliatnPymntAmntVl(String.valueOf(paymentreconciliationpaymentamount.getValue()));
		}
		/******************** PymntRecncliatn_PymntAmnt_Crncy ********************************************************************************/
		if(paymentreconciliationpaymentamount.hasCurrency()) {
			p.setPymntRecncliatnPymntAmntCrncy(String.valueOf(paymentreconciliationpaymentamount.getCurrency()));
		}
		/******************** paymentreconciliationdetail ********************************************************************************/
		org.hl7.fhir.r4.model.PaymentReconciliation.DetailsComponent paymentreconciliationdetail = paymentreconciliation.getDetailFirstRep();

		/******************** paymentreconciliationdetailtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept paymentreconciliationdetailtype = paymentreconciliationdetail.getType();

		/******************** PymntRecncliatn_Dtl_Typ_Txt ********************************************************************************/
		if(paymentreconciliationdetailtype.hasText()) {
			p.setPymntRecncliatnDtlTypTxt(String.valueOf(paymentreconciliationdetailtype.getText()));
		}
		/******************** paymentreconciliationdetailtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding paymentreconciliationdetailtypecoding = paymentreconciliationdetailtype.getCodingFirstRep();

		/******************** PymntRecncliatn_Dtl_Typ_Cdg_Vrsn ********************************************************************************/
		if(paymentreconciliationdetailtypecoding.hasVersion()) {
			p.setPymntRecncliatnDtlTypCdgVrsn(String.valueOf(paymentreconciliationdetailtypecoding.getVersion()));
		}
		/******************** PymntRecncliatn_Dtl_Typ_Cdg_Dsply ********************************************************************************/
		if(paymentreconciliationdetailtypecoding.hasDisplay()) {
			p.setPymntRecncliatnDtlTypCdgDsply(String.valueOf(paymentreconciliationdetailtypecoding.getDisplay()));
		}
		/******************** PymntRecncliatn_Dtl_Typ_Cdg_Cd ********************************************************************************/
		if(paymentreconciliationdetailtypecoding.hasCode()) {
			p.setPymntRecncliatnDtlTypCdgCd(String.valueOf(paymentreconciliationdetailtypecoding.getCode()));
		}
		/******************** PymntRecncliatn_Dtl_Typ_Cdg_UsrSltd ********************************************************************************/
		if(paymentreconciliationdetailtypecoding.hasUserSelected()) {
			p.setPymntRecncliatnDtlTypCdgUsrSltd(String.valueOf(paymentreconciliationdetailtypecoding.getUserSelected()));
		}
		/******************** PymntRecncliatn_Dtl_Typ_Cdg_Sys ********************************************************************************/
		if(paymentreconciliationdetailtypecoding.hasSystem()) {
			p.setPymntRecncliatnDtlTypCdgSys(String.valueOf(paymentreconciliationdetailtypecoding.getSystem()));
		}
		/******************** PymntRecncliatn_Dtl_Dt ********************************************************************************/
		if(paymentreconciliationdetail.hasDate()) {
			p.setPymntRecncliatnDtlDt(String.valueOf(paymentreconciliationdetail.getDate()));
		}
		/******************** PymntRecncliatn_Dtl_Rqst ********************************************************************************/
		if(paymentreconciliationdetail.hasRequest()) {
			p.setPymntRecncliatnDtlRqst(String.valueOf(paymentreconciliationdetail.getRequest()));
		}
		/******************** paymentreconciliationdetailpredecessor ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier paymentreconciliationdetailpredecessor = paymentreconciliationdetail.getPredecessor();

		/******************** PymntRecncliatn_Dtl_Predecessor_Vl ********************************************************************************/
		if(paymentreconciliationdetailpredecessor.hasValue()) {
			p.setPymntRecncliatnDtlPredecessorVl(String.valueOf(paymentreconciliationdetailpredecessor.getValue()));
		}
		/******************** paymentreconciliationdetailpredecessortype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept paymentreconciliationdetailpredecessortype = paymentreconciliationdetailpredecessor.getType();

		/******************** PymntRecncliatn_Dtl_Predecessor_Typ_Txt ********************************************************************************/
		if(paymentreconciliationdetailpredecessortype.hasText()) {
			p.setPymntRecncliatnDtlPredecessorTypTxt(String.valueOf(paymentreconciliationdetailpredecessortype.getText()));
		}
		/******************** paymentreconciliationdetailpredecessortypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding paymentreconciliationdetailpredecessortypecoding = paymentreconciliationdetailpredecessortype.getCodingFirstRep();

		/******************** PymntRecncliatn_Dtl_Predecessor_Typ_Cdg_Vrsn ********************************************************************************/
		if(paymentreconciliationdetailpredecessortypecoding.hasVersion()) {
			p.setPymntRecncliatnDtlPredecessorTypCdgVrsn(String.valueOf(paymentreconciliationdetailpredecessortypecoding.getVersion()));
		}
		/******************** PymntRecncliatn_Dtl_Predecessor_Typ_Cdg_Dsply ********************************************************************************/
		if(paymentreconciliationdetailpredecessortypecoding.hasDisplay()) {
			p.setPymntRecncliatnDtlPredecessorTypCdgDsply(String.valueOf(paymentreconciliationdetailpredecessortypecoding.getDisplay()));
		}
		/******************** PymntRecncliatn_Dtl_Predecessor_Typ_Cdg_Cd ********************************************************************************/
		if(paymentreconciliationdetailpredecessortypecoding.hasCode()) {
			p.setPymntRecncliatnDtlPredecessorTypCdgCd(String.valueOf(paymentreconciliationdetailpredecessortypecoding.getCode()));
		}
		/******************** PymntRecncliatn_Dtl_Predecessor_Typ_Cdg_UsrSltd ********************************************************************************/
		if(paymentreconciliationdetailpredecessortypecoding.hasUserSelected()) {
			p.setPymntRecncliatnDtlPredecessorTypCdgUsrSltd(String.valueOf(paymentreconciliationdetailpredecessortypecoding.getUserSelected()));
		}
		/******************** PymntRecncliatn_Dtl_Predecessor_Typ_Cdg_Sys ********************************************************************************/
		if(paymentreconciliationdetailpredecessortypecoding.hasSystem()) {
			p.setPymntRecncliatnDtlPredecessorTypCdgSys(String.valueOf(paymentreconciliationdetailpredecessortypecoding.getSystem()));
		}
		/******************** paymentreconciliationdetailpredecessorperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period paymentreconciliationdetailpredecessorperiod = paymentreconciliationdetailpredecessor.getPeriod();

		/******************** PymntRecncliatn_Dtl_Predecessor_Prd_Strt ********************************************************************************/
		if(paymentreconciliationdetailpredecessorperiod.hasStart()) {
			p.setPymntRecncliatnDtlPredecessorPrdStrt(String.valueOf(paymentreconciliationdetailpredecessorperiod.getStart()));
		}
		/******************** PymntRecncliatn_Dtl_Predecessor_Prd_End ********************************************************************************/
		if(paymentreconciliationdetailpredecessorperiod.hasEnd()) {
			p.setPymntRecncliatnDtlPredecessorPrdEnd(String.valueOf(paymentreconciliationdetailpredecessorperiod.getEnd()));
		}
		/******************** PymntRecncliatn_Dtl_Predecessor_Assigner ********************************************************************************/
		if(paymentreconciliationdetailpredecessor.hasAssigner()) {
			p.setPymntRecncliatnDtlPredecessorAssigner(String.valueOf(paymentreconciliationdetailpredecessor.getAssigner()));
		}
		/******************** PymntRecncliatn_Dtl_Predecessor_Sys ********************************************************************************/
		if(paymentreconciliationdetailpredecessor.hasSystem()) {
			p.setPymntRecncliatnDtlPredecessorSys(String.valueOf(paymentreconciliationdetailpredecessor.getSystem()));
		}
		/******************** paymentreconciliationdetailpredecessoruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse paymentreconciliationdetailpredecessoruse = paymentreconciliationdetailpredecessor.getUse();
		p.setPymntRecncliatnDtlPredecessorUse(paymentreconciliationdetailpredecessoruse.toCode());

		/******************** PymntRecncliatn_Dtl_Submitter ********************************************************************************/
		if(paymentreconciliationdetail.hasSubmitter()) {
			p.setPymntRecncliatnDtlSubmitter(String.valueOf(paymentreconciliationdetail.getSubmitter()));
		}
		/******************** paymentreconciliationdetailidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier paymentreconciliationdetailidentifier = paymentreconciliationdetail.getIdentifier();

		/******************** PymntRecncliatn_Dtl_Id_Vl ********************************************************************************/
		if(paymentreconciliationdetailidentifier.hasValue()) {
			p.setPymntRecncliatnDtlIdVl(String.valueOf(paymentreconciliationdetailidentifier.getValue()));
		}
		/******************** paymentreconciliationdetailidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept paymentreconciliationdetailidentifiertype = paymentreconciliationdetailidentifier.getType();

		/******************** PymntRecncliatn_Dtl_Id_Typ_Txt ********************************************************************************/
		if(paymentreconciliationdetailidentifiertype.hasText()) {
			p.setPymntRecncliatnDtlIdTypTxt(String.valueOf(paymentreconciliationdetailidentifiertype.getText()));
		}
		/******************** paymentreconciliationdetailidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding paymentreconciliationdetailidentifiertypecoding = paymentreconciliationdetailidentifiertype.getCodingFirstRep();

		/******************** PymntRecncliatn_Dtl_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(paymentreconciliationdetailidentifiertypecoding.hasVersion()) {
			p.setPymntRecncliatnDtlIdTypCdgVrsn(String.valueOf(paymentreconciliationdetailidentifiertypecoding.getVersion()));
		}
		/******************** PymntRecncliatn_Dtl_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(paymentreconciliationdetailidentifiertypecoding.hasDisplay()) {
			p.setPymntRecncliatnDtlIdTypCdgDsply(String.valueOf(paymentreconciliationdetailidentifiertypecoding.getDisplay()));
		}
		/******************** PymntRecncliatn_Dtl_Id_Typ_Cdg_Cd ********************************************************************************/
		if(paymentreconciliationdetailidentifiertypecoding.hasCode()) {
			p.setPymntRecncliatnDtlIdTypCdgCd(String.valueOf(paymentreconciliationdetailidentifiertypecoding.getCode()));
		}
		/******************** PymntRecncliatn_Dtl_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(paymentreconciliationdetailidentifiertypecoding.hasUserSelected()) {
			p.setPymntRecncliatnDtlIdTypCdgUsrSltd(String.valueOf(paymentreconciliationdetailidentifiertypecoding.getUserSelected()));
		}
		/******************** PymntRecncliatn_Dtl_Id_Typ_Cdg_Sys ********************************************************************************/
		if(paymentreconciliationdetailidentifiertypecoding.hasSystem()) {
			p.setPymntRecncliatnDtlIdTypCdgSys(String.valueOf(paymentreconciliationdetailidentifiertypecoding.getSystem()));
		}
		/******************** paymentreconciliationdetailidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period paymentreconciliationdetailidentifierperiod = paymentreconciliationdetailidentifier.getPeriod();

		/******************** PymntRecncliatn_Dtl_Id_Prd_Strt ********************************************************************************/
		if(paymentreconciliationdetailidentifierperiod.hasStart()) {
			p.setPymntRecncliatnDtlIdPrdStrt(String.valueOf(paymentreconciliationdetailidentifierperiod.getStart()));
		}
		/******************** PymntRecncliatn_Dtl_Id_Prd_End ********************************************************************************/
		if(paymentreconciliationdetailidentifierperiod.hasEnd()) {
			p.setPymntRecncliatnDtlIdPrdEnd(String.valueOf(paymentreconciliationdetailidentifierperiod.getEnd()));
		}
		/******************** PymntRecncliatn_Dtl_Id_Assigner ********************************************************************************/
		if(paymentreconciliationdetailidentifier.hasAssigner()) {
			p.setPymntRecncliatnDtlIdAssigner(String.valueOf(paymentreconciliationdetailidentifier.getAssigner()));
		}
		/******************** PymntRecncliatn_Dtl_Id_Sys ********************************************************************************/
		if(paymentreconciliationdetailidentifier.hasSystem()) {
			p.setPymntRecncliatnDtlIdSys(String.valueOf(paymentreconciliationdetailidentifier.getSystem()));
		}
		/******************** paymentreconciliationdetailidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse paymentreconciliationdetailidentifieruse = paymentreconciliationdetailidentifier.getUse();
		p.setPymntRecncliatnDtlIdUse(paymentreconciliationdetailidentifieruse.toCode());

		/******************** PymntRecncliatn_Dtl_Responsible ********************************************************************************/
		if(paymentreconciliationdetail.hasResponsible()) {
			p.setPymntRecncliatnDtlResponsible(String.valueOf(paymentreconciliationdetail.getResponsible()));
		}
		/******************** PymntRecncliatn_Dtl_Rsps ********************************************************************************/
		if(paymentreconciliationdetail.hasResponse()) {
			p.setPymntRecncliatnDtlRsps(String.valueOf(paymentreconciliationdetail.getResponse()));
		}
		/******************** PymntRecncliatn_Dtl_Payee ********************************************************************************/
		if(paymentreconciliationdetail.hasPayee()) {
			p.setPymntRecncliatnDtlPayee(String.valueOf(paymentreconciliationdetail.getPayee()));
		}
		/******************** paymentreconciliationdetailamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money paymentreconciliationdetailamount = paymentreconciliationdetail.getAmount();

		/******************** PymntRecncliatn_Dtl_Amnt_Vl ********************************************************************************/
		if(paymentreconciliationdetailamount.hasValue()) {
			p.setPymntRecncliatnDtlAmntVl(String.valueOf(paymentreconciliationdetailamount.getValue()));
		}
		/******************** PymntRecncliatn_Dtl_Amnt_Crncy ********************************************************************************/
		if(paymentreconciliationdetailamount.hasCurrency()) {
			p.setPymntRecncliatnDtlAmntCrncy(String.valueOf(paymentreconciliationdetailamount.getCurrency()));
		}
		/******************** paymentreconciliationformcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept paymentreconciliationformcode = paymentreconciliation.getFormCode();

		/******************** PymntRecncliatn_FrmCd_Txt ********************************************************************************/
		if(paymentreconciliationformcode.hasText()) {
			p.setPymntRecncliatnFrmCdTxt(String.valueOf(paymentreconciliationformcode.getText()));
		}
		/******************** paymentreconciliationformcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding paymentreconciliationformcodecoding = paymentreconciliationformcode.getCodingFirstRep();

		/******************** PymntRecncliatn_FrmCd_Cdg_Vrsn ********************************************************************************/
		if(paymentreconciliationformcodecoding.hasVersion()) {
			p.setPymntRecncliatnFrmCdCdgVrsn(String.valueOf(paymentreconciliationformcodecoding.getVersion()));
		}
		/******************** PymntRecncliatn_FrmCd_Cdg_Dsply ********************************************************************************/
		if(paymentreconciliationformcodecoding.hasDisplay()) {
			p.setPymntRecncliatnFrmCdCdgDsply(String.valueOf(paymentreconciliationformcodecoding.getDisplay()));
		}
		/******************** PymntRecncliatn_FrmCd_Cdg_Cd ********************************************************************************/
		if(paymentreconciliationformcodecoding.hasCode()) {
			p.setPymntRecncliatnFrmCdCdgCd(String.valueOf(paymentreconciliationformcodecoding.getCode()));
		}
		/******************** PymntRecncliatn_FrmCd_Cdg_UsrSltd ********************************************************************************/
		if(paymentreconciliationformcodecoding.hasUserSelected()) {
			p.setPymntRecncliatnFrmCdCdgUsrSltd(String.valueOf(paymentreconciliationformcodecoding.getUserSelected()));
		}
		/******************** PymntRecncliatn_FrmCd_Cdg_Sys ********************************************************************************/
		if(paymentreconciliationformcodecoding.hasSystem()) {
			p.setPymntRecncliatnFrmCdCdgSys(String.valueOf(paymentreconciliationformcodecoding.getSystem()));
		}
		/******************** paymentreconciliationidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier paymentreconciliationidentifier = paymentreconciliation.getIdentifierFirstRep();

		/******************** PymntRecncliatn_Id_Vl ********************************************************************************/
		if(paymentreconciliationidentifier.hasValue()) {
			p.setPymntRecncliatnIdVl(String.valueOf(paymentreconciliationidentifier.getValue()));
		}
		/******************** paymentreconciliationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept paymentreconciliationidentifiertype = paymentreconciliationidentifier.getType();

		/******************** PymntRecncliatn_Id_Typ_Txt ********************************************************************************/
		if(paymentreconciliationidentifiertype.hasText()) {
			p.setPymntRecncliatnIdTypTxt(String.valueOf(paymentreconciliationidentifiertype.getText()));
		}
		/******************** paymentreconciliationidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding paymentreconciliationidentifiertypecoding = paymentreconciliationidentifiertype.getCodingFirstRep();

		/******************** PymntRecncliatn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(paymentreconciliationidentifiertypecoding.hasVersion()) {
			p.setPymntRecncliatnIdTypCdgVrsn(String.valueOf(paymentreconciliationidentifiertypecoding.getVersion()));
		}
		/******************** PymntRecncliatn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(paymentreconciliationidentifiertypecoding.hasDisplay()) {
			p.setPymntRecncliatnIdTypCdgDsply(String.valueOf(paymentreconciliationidentifiertypecoding.getDisplay()));
		}
		/******************** PymntRecncliatn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(paymentreconciliationidentifiertypecoding.hasCode()) {
			p.setPymntRecncliatnIdTypCdgCd(String.valueOf(paymentreconciliationidentifiertypecoding.getCode()));
		}
		/******************** PymntRecncliatn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(paymentreconciliationidentifiertypecoding.hasUserSelected()) {
			p.setPymntRecncliatnIdTypCdgUsrSltd(String.valueOf(paymentreconciliationidentifiertypecoding.getUserSelected()));
		}
		/******************** PymntRecncliatn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(paymentreconciliationidentifiertypecoding.hasSystem()) {
			p.setPymntRecncliatnIdTypCdgSys(String.valueOf(paymentreconciliationidentifiertypecoding.getSystem()));
		}
		/******************** paymentreconciliationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period paymentreconciliationidentifierperiod = paymentreconciliationidentifier.getPeriod();

		/******************** PymntRecncliatn_Id_Prd_Strt ********************************************************************************/
		if(paymentreconciliationidentifierperiod.hasStart()) {
			p.setPymntRecncliatnIdPrdStrt(String.valueOf(paymentreconciliationidentifierperiod.getStart()));
		}
		/******************** PymntRecncliatn_Id_Prd_End ********************************************************************************/
		if(paymentreconciliationidentifierperiod.hasEnd()) {
			p.setPymntRecncliatnIdPrdEnd(String.valueOf(paymentreconciliationidentifierperiod.getEnd()));
		}
		/******************** PymntRecncliatn_Id_Assigner ********************************************************************************/
		if(paymentreconciliationidentifier.hasAssigner()) {
			p.setPymntRecncliatnIdAssigner(String.valueOf(paymentreconciliationidentifier.getAssigner()));
		}
		/******************** PymntRecncliatn_Id_Sys ********************************************************************************/
		if(paymentreconciliationidentifier.hasSystem()) {
			p.setPymntRecncliatnIdSys(String.valueOf(paymentreconciliationidentifier.getSystem()));
		}
		/******************** paymentreconciliationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse paymentreconciliationidentifieruse = paymentreconciliationidentifier.getUse();
		p.setPymntRecncliatnIdUse(paymentreconciliationidentifieruse.toCode());

		/******************** paymentreconciliationpaymentidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier paymentreconciliationpaymentidentifier = paymentreconciliation.getPaymentIdentifier();

		/******************** PymntRecncliatn_PymntId_Vl ********************************************************************************/
		if(paymentreconciliationpaymentidentifier.hasValue()) {
			p.setPymntRecncliatnPymntIdVl(String.valueOf(paymentreconciliationpaymentidentifier.getValue()));
		}
		/******************** paymentreconciliationpaymentidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept paymentreconciliationpaymentidentifiertype = paymentreconciliationpaymentidentifier.getType();

		/******************** PymntRecncliatn_PymntId_Typ_Txt ********************************************************************************/
		if(paymentreconciliationpaymentidentifiertype.hasText()) {
			p.setPymntRecncliatnPymntIdTypTxt(String.valueOf(paymentreconciliationpaymentidentifiertype.getText()));
		}
		/******************** paymentreconciliationpaymentidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding paymentreconciliationpaymentidentifiertypecoding = paymentreconciliationpaymentidentifiertype.getCodingFirstRep();

		/******************** PymntRecncliatn_PymntId_Typ_Cdg_Vrsn ********************************************************************************/
		if(paymentreconciliationpaymentidentifiertypecoding.hasVersion()) {
			p.setPymntRecncliatnPymntIdTypCdgVrsn(String.valueOf(paymentreconciliationpaymentidentifiertypecoding.getVersion()));
		}
		/******************** PymntRecncliatn_PymntId_Typ_Cdg_Dsply ********************************************************************************/
		if(paymentreconciliationpaymentidentifiertypecoding.hasDisplay()) {
			p.setPymntRecncliatnPymntIdTypCdgDsply(String.valueOf(paymentreconciliationpaymentidentifiertypecoding.getDisplay()));
		}
		/******************** PymntRecncliatn_PymntId_Typ_Cdg_Cd ********************************************************************************/
		if(paymentreconciliationpaymentidentifiertypecoding.hasCode()) {
			p.setPymntRecncliatnPymntIdTypCdgCd(String.valueOf(paymentreconciliationpaymentidentifiertypecoding.getCode()));
		}
		/******************** PymntRecncliatn_PymntId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(paymentreconciliationpaymentidentifiertypecoding.hasUserSelected()) {
			p.setPymntRecncliatnPymntIdTypCdgUsrSltd(String.valueOf(paymentreconciliationpaymentidentifiertypecoding.getUserSelected()));
		}
		/******************** PymntRecncliatn_PymntId_Typ_Cdg_Sys ********************************************************************************/
		if(paymentreconciliationpaymentidentifiertypecoding.hasSystem()) {
			p.setPymntRecncliatnPymntIdTypCdgSys(String.valueOf(paymentreconciliationpaymentidentifiertypecoding.getSystem()));
		}
		/******************** paymentreconciliationpaymentidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period paymentreconciliationpaymentidentifierperiod = paymentreconciliationpaymentidentifier.getPeriod();

		/******************** PymntRecncliatn_PymntId_Prd_Strt ********************************************************************************/
		if(paymentreconciliationpaymentidentifierperiod.hasStart()) {
			p.setPymntRecncliatnPymntIdPrdStrt(String.valueOf(paymentreconciliationpaymentidentifierperiod.getStart()));
		}
		/******************** PymntRecncliatn_PymntId_Prd_End ********************************************************************************/
		if(paymentreconciliationpaymentidentifierperiod.hasEnd()) {
			p.setPymntRecncliatnPymntIdPrdEnd(String.valueOf(paymentreconciliationpaymentidentifierperiod.getEnd()));
		}
		/******************** PymntRecncliatn_PymntId_Assigner ********************************************************************************/
		if(paymentreconciliationpaymentidentifier.hasAssigner()) {
			p.setPymntRecncliatnPymntIdAssigner(String.valueOf(paymentreconciliationpaymentidentifier.getAssigner()));
		}
		/******************** PymntRecncliatn_PymntId_Sys ********************************************************************************/
		if(paymentreconciliationpaymentidentifier.hasSystem()) {
			p.setPymntRecncliatnPymntIdSys(String.valueOf(paymentreconciliationpaymentidentifier.getSystem()));
		}
		/******************** paymentreconciliationpaymentidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse paymentreconciliationpaymentidentifieruse = paymentreconciliationpaymentidentifier.getUse();
		p.setPymntRecncliatnPymntIdUse(paymentreconciliationpaymentidentifieruse.toCode());

		/******************** paymentreconciliationprocessnote ********************************************************************************/
		org.hl7.fhir.r4.model.PaymentReconciliation.NotesComponent paymentreconciliationprocessnote = paymentreconciliation.getProcessNoteFirstRep();

		/******************** paymentreconciliationprocessnotetype ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.NoteType paymentreconciliationprocessnotetype = paymentreconciliationprocessnote.getType();
		p.setPymntRecncliatnProcessNtTyp(paymentreconciliationprocessnotetype.toCode());

		/******************** PymntRecncliatn_ProcessNt_Txt ********************************************************************************/
		if(paymentreconciliationprocessnote.hasText()) {
			p.setPymntRecncliatnProcessNtTxt(String.valueOf(paymentreconciliationprocessnote.getText()));
		}
		return p;
	}
}
