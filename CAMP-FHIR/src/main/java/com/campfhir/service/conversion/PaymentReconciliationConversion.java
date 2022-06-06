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
		if(p.getPymntRecncliatnCreated() != null) {
			java.text.SimpleDateFormat PymntRecncliatn_Createdsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PymntRecncliatn_Createddate = PymntRecncliatn_Createdsdf.parse(p.getPymntRecncliatnCreated());
			paymentreconciliation.setCreated(PymntRecncliatn_Createddate);
		}
		/******************** paymentreconciliationdetail ********************************************************************************/
		org.hl7.fhir.r4.model.PaymentReconciliation.DetailsComponent paymentreconciliationdetail =  new org.hl7.fhir.r4.model.PaymentReconciliation.DetailsComponent();
		paymentreconciliation.addDetail(paymentreconciliationdetail);

		/******************** paymentreconciliationdetailamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money paymentreconciliationdetailamount =  new org.hl7.fhir.r4.model.Money();
		paymentreconciliationdetail.setAmount(paymentreconciliationdetailamount);

		/******************** PymntRecncliatn_Dtl_Amnt_Crncy ********************************************************************************/
		if(p.getPymntRecncliatnDtlAmntCrncy() != null) {
			paymentreconciliationdetailamount.setCurrency(p.getPymntRecncliatnDtlAmntCrncy());
		}
		/******************** PymntRecncliatn_Dtl_Amnt_Vl ********************************************************************************/
		if(p.getPymntRecncliatnDtlAmntVl() != null) {
			paymentreconciliationdetailamount.setValue(Double.parseDouble((p.getPymntRecncliatnDtlAmntVl())));
		}
		/******************** PymntRecncliatn_Dtl_Dt ********************************************************************************/
		if(p.getPymntRecncliatnDtlDt() != null) {
			java.text.SimpleDateFormat PymntRecncliatn_Dtl_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PymntRecncliatn_Dtl_Dtdate = PymntRecncliatn_Dtl_Dtsdf.parse(p.getPymntRecncliatnDtlDt());
			paymentreconciliationdetail.setDate(PymntRecncliatn_Dtl_Dtdate);
		}
		/******************** paymentreconciliationdetailidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier paymentreconciliationdetailidentifier =  new org.hl7.fhir.r4.model.Identifier();
		paymentreconciliationdetail.setIdentifier(paymentreconciliationdetailidentifier);

		/******************** PymntRecncliatn_Dtl_Id_Assigner ********************************************************************************/
		if(p.getPymntRecncliatnDtlIdAssigner() != null) {
			paymentreconciliationdetailidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(p.getPymntRecncliatnDtlIdAssigner()));
		}
		/******************** paymentreconciliationdetailidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period paymentreconciliationdetailidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		paymentreconciliationdetailidentifier.setPeriod(paymentreconciliationdetailidentifierperiod);

		/******************** PymntRecncliatn_Dtl_Id_Prd_End ********************************************************************************/
		if(p.getPymntRecncliatnDtlIdPrdEnd() != null) {
			java.text.SimpleDateFormat PymntRecncliatn_Dtl_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PymntRecncliatn_Dtl_Id_Prd_Enddate = PymntRecncliatn_Dtl_Id_Prd_Endsdf.parse(p.getPymntRecncliatnDtlIdPrdEnd());
			paymentreconciliationdetailidentifierperiod.setEnd(PymntRecncliatn_Dtl_Id_Prd_Enddate);
		}
		/******************** PymntRecncliatn_Dtl_Id_Prd_Strt ********************************************************************************/
		if(p.getPymntRecncliatnDtlIdPrdStrt() != null) {
			java.text.SimpleDateFormat PymntRecncliatn_Dtl_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PymntRecncliatn_Dtl_Id_Prd_Strtdate = PymntRecncliatn_Dtl_Id_Prd_Strtsdf.parse(p.getPymntRecncliatnDtlIdPrdStrt());
			paymentreconciliationdetailidentifierperiod.setStart(PymntRecncliatn_Dtl_Id_Prd_Strtdate);
		}
		/******************** PymntRecncliatn_Dtl_Id_Sys ********************************************************************************/
		if(p.getPymntRecncliatnDtlIdSys() != null) {
			paymentreconciliationdetailidentifier.setSystem(p.getPymntRecncliatnDtlIdSys());
		}
		/******************** paymentreconciliationdetailidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept paymentreconciliationdetailidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		paymentreconciliationdetailidentifier.setType(paymentreconciliationdetailidentifiertype);

		/******************** paymentreconciliationdetailidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding paymentreconciliationdetailidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		paymentreconciliationdetailidentifiertype.addCoding(paymentreconciliationdetailidentifiertypecoding);

		/******************** PymntRecncliatn_Dtl_Id_Typ_Cdg_Cd ********************************************************************************/
		if(p.getPymntRecncliatnDtlIdTypCdgCd() != null) {
			paymentreconciliationdetailidentifiertypecoding.setCode(p.getPymntRecncliatnDtlIdTypCdgCd());
		}
		/******************** PymntRecncliatn_Dtl_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(p.getPymntRecncliatnDtlIdTypCdgDsply() != null) {
			paymentreconciliationdetailidentifiertypecoding.setDisplay(p.getPymntRecncliatnDtlIdTypCdgDsply());
		}
		/******************** PymntRecncliatn_Dtl_Id_Typ_Cdg_Sys ********************************************************************************/
		if(p.getPymntRecncliatnDtlIdTypCdgSys() != null) {
			paymentreconciliationdetailidentifiertypecoding.setSystem(p.getPymntRecncliatnDtlIdTypCdgSys());
		}
		/******************** PymntRecncliatn_Dtl_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(p.getPymntRecncliatnDtlIdTypCdgUsrSltd() != null) {
			paymentreconciliationdetailidentifiertypecoding.setUserSelected(Boolean.parseBoolean(p.getPymntRecncliatnDtlIdTypCdgUsrSltd()));
		}
		/******************** PymntRecncliatn_Dtl_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(p.getPymntRecncliatnDtlIdTypCdgVrsn() != null) {
			paymentreconciliationdetailidentifiertypecoding.setVersion(p.getPymntRecncliatnDtlIdTypCdgVrsn());
		}
		/******************** PymntRecncliatn_Dtl_Id_Typ_Txt ********************************************************************************/
		if(p.getPymntRecncliatnDtlIdTypTxt() != null) {
			paymentreconciliationdetailidentifiertype.setText(p.getPymntRecncliatnDtlIdTypTxt());
		}
		/******************** paymentreconciliationdetailidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory paymentreconciliationdetailidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		paymentreconciliationdetailidentifier.setUse(paymentreconciliationdetailidentifieruse.fromCode(p.getPymntRecncliatnDtlIdUse()));

		/******************** PymntRecncliatn_Dtl_Id_Vl ********************************************************************************/
		if(p.getPymntRecncliatnDtlIdVl() != null) {
			paymentreconciliationdetailidentifier.setValue(p.getPymntRecncliatnDtlIdVl());
		}
		/******************** PymntRecncliatn_Dtl_Payee ********************************************************************************/
		if(p.getPymntRecncliatnDtlPayee() != null) {
			paymentreconciliationdetail.setPayee( new org.hl7.fhir.r4.model.Reference(p.getPymntRecncliatnDtlPayee()));
		}
		/******************** paymentreconciliationdetailpredecessor ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier paymentreconciliationdetailpredecessor =  new org.hl7.fhir.r4.model.Identifier();
		paymentreconciliationdetail.setPredecessor(paymentreconciliationdetailpredecessor);

		/******************** PymntRecncliatn_Dtl_Predecessor_Assigner ********************************************************************************/
		if(p.getPymntRecncliatnDtlPredecessorAssigner() != null) {
			paymentreconciliationdetailpredecessor.setAssigner( new org.hl7.fhir.r4.model.Reference(p.getPymntRecncliatnDtlPredecessorAssigner()));
		}
		/******************** paymentreconciliationdetailpredecessorperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period paymentreconciliationdetailpredecessorperiod =  new org.hl7.fhir.r4.model.Period();
		paymentreconciliationdetailpredecessor.setPeriod(paymentreconciliationdetailpredecessorperiod);

		/******************** PymntRecncliatn_Dtl_Predecessor_Prd_End ********************************************************************************/
		if(p.getPymntRecncliatnDtlPredecessorPrdEnd() != null) {
			java.text.SimpleDateFormat PymntRecncliatn_Dtl_Predecessor_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PymntRecncliatn_Dtl_Predecessor_Prd_Enddate = PymntRecncliatn_Dtl_Predecessor_Prd_Endsdf.parse(p.getPymntRecncliatnDtlPredecessorPrdEnd());
			paymentreconciliationdetailpredecessorperiod.setEnd(PymntRecncliatn_Dtl_Predecessor_Prd_Enddate);
		}
		/******************** PymntRecncliatn_Dtl_Predecessor_Prd_Strt ********************************************************************************/
		if(p.getPymntRecncliatnDtlPredecessorPrdStrt() != null) {
			java.text.SimpleDateFormat PymntRecncliatn_Dtl_Predecessor_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PymntRecncliatn_Dtl_Predecessor_Prd_Strtdate = PymntRecncliatn_Dtl_Predecessor_Prd_Strtsdf.parse(p.getPymntRecncliatnDtlPredecessorPrdStrt());
			paymentreconciliationdetailpredecessorperiod.setStart(PymntRecncliatn_Dtl_Predecessor_Prd_Strtdate);
		}
		/******************** PymntRecncliatn_Dtl_Predecessor_Sys ********************************************************************************/
		if(p.getPymntRecncliatnDtlPredecessorSys() != null) {
			paymentreconciliationdetailpredecessor.setSystem(p.getPymntRecncliatnDtlPredecessorSys());
		}
		/******************** paymentreconciliationdetailpredecessortype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept paymentreconciliationdetailpredecessortype =  new org.hl7.fhir.r4.model.CodeableConcept();
		paymentreconciliationdetailpredecessor.setType(paymentreconciliationdetailpredecessortype);

		/******************** paymentreconciliationdetailpredecessortypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding paymentreconciliationdetailpredecessortypecoding =  new org.hl7.fhir.r4.model.Coding();
		paymentreconciliationdetailpredecessortype.addCoding(paymentreconciliationdetailpredecessortypecoding);

		/******************** PymntRecncliatn_Dtl_Predecessor_Typ_Cdg_Cd ********************************************************************************/
		if(p.getPymntRecncliatnDtlPredecessorTypCdgCd() != null) {
			paymentreconciliationdetailpredecessortypecoding.setCode(p.getPymntRecncliatnDtlPredecessorTypCdgCd());
		}
		/******************** PymntRecncliatn_Dtl_Predecessor_Typ_Cdg_Dsply ********************************************************************************/
		if(p.getPymntRecncliatnDtlPredecessorTypCdgDsply() != null) {
			paymentreconciliationdetailpredecessortypecoding.setDisplay(p.getPymntRecncliatnDtlPredecessorTypCdgDsply());
		}
		/******************** PymntRecncliatn_Dtl_Predecessor_Typ_Cdg_Sys ********************************************************************************/
		if(p.getPymntRecncliatnDtlPredecessorTypCdgSys() != null) {
			paymentreconciliationdetailpredecessortypecoding.setSystem(p.getPymntRecncliatnDtlPredecessorTypCdgSys());
		}
		/******************** PymntRecncliatn_Dtl_Predecessor_Typ_Cdg_UsrSltd ********************************************************************************/
		if(p.getPymntRecncliatnDtlPredecessorTypCdgUsrSltd() != null) {
			paymentreconciliationdetailpredecessortypecoding.setUserSelected(Boolean.parseBoolean(p.getPymntRecncliatnDtlPredecessorTypCdgUsrSltd()));
		}
		/******************** PymntRecncliatn_Dtl_Predecessor_Typ_Cdg_Vrsn ********************************************************************************/
		if(p.getPymntRecncliatnDtlPredecessorTypCdgVrsn() != null) {
			paymentreconciliationdetailpredecessortypecoding.setVersion(p.getPymntRecncliatnDtlPredecessorTypCdgVrsn());
		}
		/******************** PymntRecncliatn_Dtl_Predecessor_Typ_Txt ********************************************************************************/
		if(p.getPymntRecncliatnDtlPredecessorTypTxt() != null) {
			paymentreconciliationdetailpredecessortype.setText(p.getPymntRecncliatnDtlPredecessorTypTxt());
		}
		/******************** paymentreconciliationdetailpredecessoruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory paymentreconciliationdetailpredecessoruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		paymentreconciliationdetailpredecessor.setUse(paymentreconciliationdetailpredecessoruse.fromCode(p.getPymntRecncliatnDtlPredecessorUse()));

		/******************** PymntRecncliatn_Dtl_Predecessor_Vl ********************************************************************************/
		if(p.getPymntRecncliatnDtlPredecessorVl() != null) {
			paymentreconciliationdetailpredecessor.setValue(p.getPymntRecncliatnDtlPredecessorVl());
		}
		/******************** PymntRecncliatn_Dtl_Rqst ********************************************************************************/
		if(p.getPymntRecncliatnDtlRqst() != null) {
			paymentreconciliationdetail.setRequest( new org.hl7.fhir.r4.model.Reference(p.getPymntRecncliatnDtlRqst()));
		}
		/******************** PymntRecncliatn_Dtl_Rsps ********************************************************************************/
		if(p.getPymntRecncliatnDtlRsps() != null) {
			paymentreconciliationdetail.setResponse( new org.hl7.fhir.r4.model.Reference(p.getPymntRecncliatnDtlRsps()));
		}
		/******************** PymntRecncliatn_Dtl_Responsible ********************************************************************************/
		if(p.getPymntRecncliatnDtlResponsible() != null) {
			paymentreconciliationdetail.setResponsible( new org.hl7.fhir.r4.model.Reference(p.getPymntRecncliatnDtlResponsible()));
		}
		/******************** PymntRecncliatn_Dtl_Submitter ********************************************************************************/
		if(p.getPymntRecncliatnDtlSubmitter() != null) {
			paymentreconciliationdetail.setSubmitter( new org.hl7.fhir.r4.model.Reference(p.getPymntRecncliatnDtlSubmitter()));
		}
		/******************** paymentreconciliationdetailtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept paymentreconciliationdetailtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		paymentreconciliationdetail.setType(paymentreconciliationdetailtype);

		/******************** paymentreconciliationdetailtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding paymentreconciliationdetailtypecoding =  new org.hl7.fhir.r4.model.Coding();
		paymentreconciliationdetailtype.addCoding(paymentreconciliationdetailtypecoding);

		/******************** PymntRecncliatn_Dtl_Typ_Cdg_Cd ********************************************************************************/
		if(p.getPymntRecncliatnDtlTypCdgCd() != null) {
			paymentreconciliationdetailtypecoding.setCode(p.getPymntRecncliatnDtlTypCdgCd());
		}
		/******************** PymntRecncliatn_Dtl_Typ_Cdg_Dsply ********************************************************************************/
		if(p.getPymntRecncliatnDtlTypCdgDsply() != null) {
			paymentreconciliationdetailtypecoding.setDisplay(p.getPymntRecncliatnDtlTypCdgDsply());
		}
		/******************** PymntRecncliatn_Dtl_Typ_Cdg_Sys ********************************************************************************/
		if(p.getPymntRecncliatnDtlTypCdgSys() != null) {
			paymentreconciliationdetailtypecoding.setSystem(p.getPymntRecncliatnDtlTypCdgSys());
		}
		/******************** PymntRecncliatn_Dtl_Typ_Cdg_UsrSltd ********************************************************************************/
		if(p.getPymntRecncliatnDtlTypCdgUsrSltd() != null) {
			paymentreconciliationdetailtypecoding.setUserSelected(Boolean.parseBoolean(p.getPymntRecncliatnDtlTypCdgUsrSltd()));
		}
		/******************** PymntRecncliatn_Dtl_Typ_Cdg_Vrsn ********************************************************************************/
		if(p.getPymntRecncliatnDtlTypCdgVrsn() != null) {
			paymentreconciliationdetailtypecoding.setVersion(p.getPymntRecncliatnDtlTypCdgVrsn());
		}
		/******************** PymntRecncliatn_Dtl_Typ_Txt ********************************************************************************/
		if(p.getPymntRecncliatnDtlTypTxt() != null) {
			paymentreconciliationdetailtype.setText(p.getPymntRecncliatnDtlTypTxt());
		}
		/******************** PymntRecncliatn_Disposition ********************************************************************************/
		if(p.getPymntRecncliatnDisposition() != null) {
			paymentreconciliation.setDisposition(p.getPymntRecncliatnDisposition());
		}
		/******************** paymentreconciliationformcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept paymentreconciliationformcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		paymentreconciliation.setFormCode(paymentreconciliationformcode);

		/******************** paymentreconciliationformcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding paymentreconciliationformcodecoding =  new org.hl7.fhir.r4.model.Coding();
		paymentreconciliationformcode.addCoding(paymentreconciliationformcodecoding);

		/******************** PymntRecncliatn_FrmCd_Cdg_Cd ********************************************************************************/
		if(p.getPymntRecncliatnFrmCdCdgCd() != null) {
			paymentreconciliationformcodecoding.setCode(p.getPymntRecncliatnFrmCdCdgCd());
		}
		/******************** PymntRecncliatn_FrmCd_Cdg_Dsply ********************************************************************************/
		if(p.getPymntRecncliatnFrmCdCdgDsply() != null) {
			paymentreconciliationformcodecoding.setDisplay(p.getPymntRecncliatnFrmCdCdgDsply());
		}
		/******************** PymntRecncliatn_FrmCd_Cdg_Sys ********************************************************************************/
		if(p.getPymntRecncliatnFrmCdCdgSys() != null) {
			paymentreconciliationformcodecoding.setSystem(p.getPymntRecncliatnFrmCdCdgSys());
		}
		/******************** PymntRecncliatn_FrmCd_Cdg_UsrSltd ********************************************************************************/
		if(p.getPymntRecncliatnFrmCdCdgUsrSltd() != null) {
			paymentreconciliationformcodecoding.setUserSelected(Boolean.parseBoolean(p.getPymntRecncliatnFrmCdCdgUsrSltd()));
		}
		/******************** PymntRecncliatn_FrmCd_Cdg_Vrsn ********************************************************************************/
		if(p.getPymntRecncliatnFrmCdCdgVrsn() != null) {
			paymentreconciliationformcodecoding.setVersion(p.getPymntRecncliatnFrmCdCdgVrsn());
		}
		/******************** PymntRecncliatn_FrmCd_Txt ********************************************************************************/
		if(p.getPymntRecncliatnFrmCdTxt() != null) {
			paymentreconciliationformcode.setText(p.getPymntRecncliatnFrmCdTxt());
		}
		/******************** paymentreconciliationidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier paymentreconciliationidentifier =  new org.hl7.fhir.r4.model.Identifier();
		paymentreconciliation.addIdentifier(paymentreconciliationidentifier);

		/******************** PymntRecncliatn_Id_Assigner ********************************************************************************/
		if(p.getPymntRecncliatnIdAssigner() != null) {
			paymentreconciliationidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(p.getPymntRecncliatnIdAssigner()));
		}
		/******************** paymentreconciliationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period paymentreconciliationidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		paymentreconciliationidentifier.setPeriod(paymentreconciliationidentifierperiod);

		/******************** PymntRecncliatn_Id_Prd_End ********************************************************************************/
		if(p.getPymntRecncliatnIdPrdEnd() != null) {
			java.text.SimpleDateFormat PymntRecncliatn_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PymntRecncliatn_Id_Prd_Enddate = PymntRecncliatn_Id_Prd_Endsdf.parse(p.getPymntRecncliatnIdPrdEnd());
			paymentreconciliationidentifierperiod.setEnd(PymntRecncliatn_Id_Prd_Enddate);
		}
		/******************** PymntRecncliatn_Id_Prd_Strt ********************************************************************************/
		if(p.getPymntRecncliatnIdPrdStrt() != null) {
			java.text.SimpleDateFormat PymntRecncliatn_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PymntRecncliatn_Id_Prd_Strtdate = PymntRecncliatn_Id_Prd_Strtsdf.parse(p.getPymntRecncliatnIdPrdStrt());
			paymentreconciliationidentifierperiod.setStart(PymntRecncliatn_Id_Prd_Strtdate);
		}
		/******************** PymntRecncliatn_Id_Sys ********************************************************************************/
		if(p.getPymntRecncliatnIdSys() != null) {
			paymentreconciliationidentifier.setSystem(p.getPymntRecncliatnIdSys());
		}
		/******************** paymentreconciliationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept paymentreconciliationidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		paymentreconciliationidentifier.setType(paymentreconciliationidentifiertype);

		/******************** paymentreconciliationidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding paymentreconciliationidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		paymentreconciliationidentifiertype.addCoding(paymentreconciliationidentifiertypecoding);

		/******************** PymntRecncliatn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(p.getPymntRecncliatnIdTypCdgCd() != null) {
			paymentreconciliationidentifiertypecoding.setCode(p.getPymntRecncliatnIdTypCdgCd());
		}
		/******************** PymntRecncliatn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(p.getPymntRecncliatnIdTypCdgDsply() != null) {
			paymentreconciliationidentifiertypecoding.setDisplay(p.getPymntRecncliatnIdTypCdgDsply());
		}
		/******************** PymntRecncliatn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(p.getPymntRecncliatnIdTypCdgSys() != null) {
			paymentreconciliationidentifiertypecoding.setSystem(p.getPymntRecncliatnIdTypCdgSys());
		}
		/******************** PymntRecncliatn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(p.getPymntRecncliatnIdTypCdgUsrSltd() != null) {
			paymentreconciliationidentifiertypecoding.setUserSelected(Boolean.parseBoolean(p.getPymntRecncliatnIdTypCdgUsrSltd()));
		}
		/******************** PymntRecncliatn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(p.getPymntRecncliatnIdTypCdgVrsn() != null) {
			paymentreconciliationidentifiertypecoding.setVersion(p.getPymntRecncliatnIdTypCdgVrsn());
		}
		/******************** PymntRecncliatn_Id_Typ_Txt ********************************************************************************/
		if(p.getPymntRecncliatnIdTypTxt() != null) {
			paymentreconciliationidentifiertype.setText(p.getPymntRecncliatnIdTypTxt());
		}
		/******************** paymentreconciliationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory paymentreconciliationidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		paymentreconciliationidentifier.setUse(paymentreconciliationidentifieruse.fromCode(p.getPymntRecncliatnIdUse()));

		/******************** PymntRecncliatn_Id_Vl ********************************************************************************/
		if(p.getPymntRecncliatnIdVl() != null) {
			paymentreconciliationidentifier.setValue(p.getPymntRecncliatnIdVl());
		}
		/******************** paymentreconciliationoutcome ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.RemittanceOutcomeEnumFactory paymentreconciliationoutcome =  new org.hl7.fhir.r4.model.Enumerations.RemittanceOutcomeEnumFactory();
		paymentreconciliation.setOutcome(paymentreconciliationoutcome.fromCode(p.getPymntRecncliatnOutcome()));

		/******************** paymentreconciliationpaymentamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money paymentreconciliationpaymentamount =  new org.hl7.fhir.r4.model.Money();
		paymentreconciliation.setPaymentAmount(paymentreconciliationpaymentamount);

		/******************** PymntRecncliatn_PymntAmnt_Crncy ********************************************************************************/
		if(p.getPymntRecncliatnPymntAmntCrncy() != null) {
			paymentreconciliationpaymentamount.setCurrency(p.getPymntRecncliatnPymntAmntCrncy());
		}
		/******************** PymntRecncliatn_PymntAmnt_Vl ********************************************************************************/
		if(p.getPymntRecncliatnPymntAmntVl() != null) {
			paymentreconciliationpaymentamount.setValue(Double.parseDouble((p.getPymntRecncliatnPymntAmntVl())));
		}
		/******************** PymntRecncliatn_PymntDt ********************************************************************************/
		if(p.getPymntRecncliatnPymntDt() != null) {
			java.text.SimpleDateFormat PymntRecncliatn_PymntDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PymntRecncliatn_PymntDtdate = PymntRecncliatn_PymntDtsdf.parse(p.getPymntRecncliatnPymntDt());
			paymentreconciliation.setPaymentDate(PymntRecncliatn_PymntDtdate);
		}
		/******************** paymentreconciliationpaymentidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier paymentreconciliationpaymentidentifier =  new org.hl7.fhir.r4.model.Identifier();
		paymentreconciliation.setPaymentIdentifier(paymentreconciliationpaymentidentifier);

		/******************** PymntRecncliatn_PymntId_Assigner ********************************************************************************/
		if(p.getPymntRecncliatnPymntIdAssigner() != null) {
			paymentreconciliationpaymentidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(p.getPymntRecncliatnPymntIdAssigner()));
		}
		/******************** paymentreconciliationpaymentidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period paymentreconciliationpaymentidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		paymentreconciliationpaymentidentifier.setPeriod(paymentreconciliationpaymentidentifierperiod);

		/******************** PymntRecncliatn_PymntId_Prd_End ********************************************************************************/
		if(p.getPymntRecncliatnPymntIdPrdEnd() != null) {
			java.text.SimpleDateFormat PymntRecncliatn_PymntId_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PymntRecncliatn_PymntId_Prd_Enddate = PymntRecncliatn_PymntId_Prd_Endsdf.parse(p.getPymntRecncliatnPymntIdPrdEnd());
			paymentreconciliationpaymentidentifierperiod.setEnd(PymntRecncliatn_PymntId_Prd_Enddate);
		}
		/******************** PymntRecncliatn_PymntId_Prd_Strt ********************************************************************************/
		if(p.getPymntRecncliatnPymntIdPrdStrt() != null) {
			java.text.SimpleDateFormat PymntRecncliatn_PymntId_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PymntRecncliatn_PymntId_Prd_Strtdate = PymntRecncliatn_PymntId_Prd_Strtsdf.parse(p.getPymntRecncliatnPymntIdPrdStrt());
			paymentreconciliationpaymentidentifierperiod.setStart(PymntRecncliatn_PymntId_Prd_Strtdate);
		}
		/******************** PymntRecncliatn_PymntId_Sys ********************************************************************************/
		if(p.getPymntRecncliatnPymntIdSys() != null) {
			paymentreconciliationpaymentidentifier.setSystem(p.getPymntRecncliatnPymntIdSys());
		}
		/******************** paymentreconciliationpaymentidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept paymentreconciliationpaymentidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		paymentreconciliationpaymentidentifier.setType(paymentreconciliationpaymentidentifiertype);

		/******************** paymentreconciliationpaymentidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding paymentreconciliationpaymentidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		paymentreconciliationpaymentidentifiertype.addCoding(paymentreconciliationpaymentidentifiertypecoding);

		/******************** PymntRecncliatn_PymntId_Typ_Cdg_Cd ********************************************************************************/
		if(p.getPymntRecncliatnPymntIdTypCdgCd() != null) {
			paymentreconciliationpaymentidentifiertypecoding.setCode(p.getPymntRecncliatnPymntIdTypCdgCd());
		}
		/******************** PymntRecncliatn_PymntId_Typ_Cdg_Dsply ********************************************************************************/
		if(p.getPymntRecncliatnPymntIdTypCdgDsply() != null) {
			paymentreconciliationpaymentidentifiertypecoding.setDisplay(p.getPymntRecncliatnPymntIdTypCdgDsply());
		}
		/******************** PymntRecncliatn_PymntId_Typ_Cdg_Sys ********************************************************************************/
		if(p.getPymntRecncliatnPymntIdTypCdgSys() != null) {
			paymentreconciliationpaymentidentifiertypecoding.setSystem(p.getPymntRecncliatnPymntIdTypCdgSys());
		}
		/******************** PymntRecncliatn_PymntId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(p.getPymntRecncliatnPymntIdTypCdgUsrSltd() != null) {
			paymentreconciliationpaymentidentifiertypecoding.setUserSelected(Boolean.parseBoolean(p.getPymntRecncliatnPymntIdTypCdgUsrSltd()));
		}
		/******************** PymntRecncliatn_PymntId_Typ_Cdg_Vrsn ********************************************************************************/
		if(p.getPymntRecncliatnPymntIdTypCdgVrsn() != null) {
			paymentreconciliationpaymentidentifiertypecoding.setVersion(p.getPymntRecncliatnPymntIdTypCdgVrsn());
		}
		/******************** PymntRecncliatn_PymntId_Typ_Txt ********************************************************************************/
		if(p.getPymntRecncliatnPymntIdTypTxt() != null) {
			paymentreconciliationpaymentidentifiertype.setText(p.getPymntRecncliatnPymntIdTypTxt());
		}
		/******************** paymentreconciliationpaymentidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory paymentreconciliationpaymentidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		paymentreconciliationpaymentidentifier.setUse(paymentreconciliationpaymentidentifieruse.fromCode(p.getPymntRecncliatnPymntIdUse()));

		/******************** PymntRecncliatn_PymntId_Vl ********************************************************************************/
		if(p.getPymntRecncliatnPymntIdVl() != null) {
			paymentreconciliationpaymentidentifier.setValue(p.getPymntRecncliatnPymntIdVl());
		}
		/******************** PymntRecncliatn_PymntIssuer ********************************************************************************/
		if(p.getPymntRecncliatnPymntIssuer() != null) {
			paymentreconciliation.setPaymentIssuer( new org.hl7.fhir.r4.model.Reference(p.getPymntRecncliatnPymntIssuer()));
		}
		/******************** paymentreconciliationperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period paymentreconciliationperiod =  new org.hl7.fhir.r4.model.Period();
		paymentreconciliation.setPeriod(paymentreconciliationperiod);

		/******************** PymntRecncliatn_Prd_End ********************************************************************************/
		if(p.getPymntRecncliatnPrdEnd() != null) {
			java.text.SimpleDateFormat PymntRecncliatn_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PymntRecncliatn_Prd_Enddate = PymntRecncliatn_Prd_Endsdf.parse(p.getPymntRecncliatnPrdEnd());
			paymentreconciliationperiod.setEnd(PymntRecncliatn_Prd_Enddate);
		}
		/******************** PymntRecncliatn_Prd_Strt ********************************************************************************/
		if(p.getPymntRecncliatnPrdStrt() != null) {
			java.text.SimpleDateFormat PymntRecncliatn_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PymntRecncliatn_Prd_Strtdate = PymntRecncliatn_Prd_Strtsdf.parse(p.getPymntRecncliatnPrdStrt());
			paymentreconciliationperiod.setStart(PymntRecncliatn_Prd_Strtdate);
		}
		/******************** paymentreconciliationprocessnote ********************************************************************************/
		org.hl7.fhir.r4.model.PaymentReconciliation.NotesComponent paymentreconciliationprocessnote =  new org.hl7.fhir.r4.model.PaymentReconciliation.NotesComponent();
		paymentreconciliation.addProcessNote(paymentreconciliationprocessnote);

		/******************** PymntRecncliatn_ProcessNt_Txt ********************************************************************************/
		if(p.getPymntRecncliatnProcessNtTxt() != null) {
			paymentreconciliationprocessnote.setText(p.getPymntRecncliatnProcessNtTxt());
		}
		/******************** paymentreconciliationprocessnotetype ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.NoteTypeEnumFactory paymentreconciliationprocessnotetype =  new org.hl7.fhir.r4.model.Enumerations.NoteTypeEnumFactory();
		paymentreconciliationprocessnote.setType(paymentreconciliationprocessnotetype.fromCode(p.getPymntRecncliatnProcessNtTyp()));

		/******************** PymntRecncliatn_Rqst ********************************************************************************/
		if(p.getPymntRecncliatnRqst() != null) {
			paymentreconciliation.setRequest( new org.hl7.fhir.r4.model.Reference(p.getPymntRecncliatnRqst()));
		}
		/******************** PymntRecncliatn_Rqstor ********************************************************************************/
		if(p.getPymntRecncliatnRqstor() != null) {
			paymentreconciliation.setRequestor( new org.hl7.fhir.r4.model.Reference(p.getPymntRecncliatnRqstor()));
		}
		/******************** paymentreconciliationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.PaymentReconciliation.PaymentReconciliationStatusEnumFactory paymentreconciliationstatus =  new org.hl7.fhir.r4.model.PaymentReconciliation.PaymentReconciliationStatusEnumFactory();
		paymentreconciliation.setStatus(paymentreconciliationstatus.fromCode(p.getPymntRecncliatnSts()));

		return paymentreconciliation;
	}
}
