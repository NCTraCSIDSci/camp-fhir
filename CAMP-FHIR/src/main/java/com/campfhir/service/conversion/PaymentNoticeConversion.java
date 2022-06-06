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

		/******************** paymentnoticeamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money paymentnoticeamount =  new org.hl7.fhir.r4.model.Money();
		paymentnotice.setAmount(paymentnoticeamount);

		/******************** PymntNotice_Amnt_Crncy ********************************************************************************/
		if(p.getPymntNoticeAmntCrncy() != null) {
			paymentnoticeamount.setCurrency(p.getPymntNoticeAmntCrncy());
		}
		/******************** PymntNotice_Amnt_Vl ********************************************************************************/
		if(p.getPymntNoticeAmntVl() != null) {
			paymentnoticeamount.setValue(Double.parseDouble((p.getPymntNoticeAmntVl())));
		}
		/******************** PymntNotice_Created ********************************************************************************/
		if(p.getPymntNoticeCreated() != null) {
			java.text.SimpleDateFormat PymntNotice_Createdsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PymntNotice_Createddate = PymntNotice_Createdsdf.parse(p.getPymntNoticeCreated());
			paymentnotice.setCreated(PymntNotice_Createddate);
		}
		/******************** paymentnoticeidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier paymentnoticeidentifier =  new org.hl7.fhir.r4.model.Identifier();
		paymentnotice.addIdentifier(paymentnoticeidentifier);

		/******************** PymntNotice_Id_Assigner ********************************************************************************/
		if(p.getPymntNoticeIdAssigner() != null) {
			paymentnoticeidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(p.getPymntNoticeIdAssigner()));
		}
		/******************** paymentnoticeidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period paymentnoticeidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		paymentnoticeidentifier.setPeriod(paymentnoticeidentifierperiod);

		/******************** PymntNotice_Id_Prd_End ********************************************************************************/
		if(p.getPymntNoticeIdPrdEnd() != null) {
			java.text.SimpleDateFormat PymntNotice_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PymntNotice_Id_Prd_Enddate = PymntNotice_Id_Prd_Endsdf.parse(p.getPymntNoticeIdPrdEnd());
			paymentnoticeidentifierperiod.setEnd(PymntNotice_Id_Prd_Enddate);
		}
		/******************** PymntNotice_Id_Prd_Strt ********************************************************************************/
		if(p.getPymntNoticeIdPrdStrt() != null) {
			java.text.SimpleDateFormat PymntNotice_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PymntNotice_Id_Prd_Strtdate = PymntNotice_Id_Prd_Strtsdf.parse(p.getPymntNoticeIdPrdStrt());
			paymentnoticeidentifierperiod.setStart(PymntNotice_Id_Prd_Strtdate);
		}
		/******************** PymntNotice_Id_Sys ********************************************************************************/
		if(p.getPymntNoticeIdSys() != null) {
			paymentnoticeidentifier.setSystem(p.getPymntNoticeIdSys());
		}
		/******************** paymentnoticeidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept paymentnoticeidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		paymentnoticeidentifier.setType(paymentnoticeidentifiertype);

		/******************** paymentnoticeidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding paymentnoticeidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		paymentnoticeidentifiertype.addCoding(paymentnoticeidentifiertypecoding);

		/******************** PymntNotice_Id_Typ_Cdg_Cd ********************************************************************************/
		if(p.getPymntNoticeIdTypCdgCd() != null) {
			paymentnoticeidentifiertypecoding.setCode(p.getPymntNoticeIdTypCdgCd());
		}
		/******************** PymntNotice_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(p.getPymntNoticeIdTypCdgDsply() != null) {
			paymentnoticeidentifiertypecoding.setDisplay(p.getPymntNoticeIdTypCdgDsply());
		}
		/******************** PymntNotice_Id_Typ_Cdg_Sys ********************************************************************************/
		if(p.getPymntNoticeIdTypCdgSys() != null) {
			paymentnoticeidentifiertypecoding.setSystem(p.getPymntNoticeIdTypCdgSys());
		}
		/******************** PymntNotice_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(p.getPymntNoticeIdTypCdgUsrSltd() != null) {
			paymentnoticeidentifiertypecoding.setUserSelected(Boolean.parseBoolean(p.getPymntNoticeIdTypCdgUsrSltd()));
		}
		/******************** PymntNotice_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(p.getPymntNoticeIdTypCdgVrsn() != null) {
			paymentnoticeidentifiertypecoding.setVersion(p.getPymntNoticeIdTypCdgVrsn());
		}
		/******************** PymntNotice_Id_Typ_Txt ********************************************************************************/
		if(p.getPymntNoticeIdTypTxt() != null) {
			paymentnoticeidentifiertype.setText(p.getPymntNoticeIdTypTxt());
		}
		/******************** paymentnoticeidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory paymentnoticeidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		paymentnoticeidentifier.setUse(paymentnoticeidentifieruse.fromCode(p.getPymntNoticeIdUse()));

		/******************** PymntNotice_Id_Vl ********************************************************************************/
		if(p.getPymntNoticeIdVl() != null) {
			paymentnoticeidentifier.setValue(p.getPymntNoticeIdVl());
		}
		/******************** PymntNotice_Payee ********************************************************************************/
		if(p.getPymntNoticePayee() != null) {
			paymentnotice.setPayee( new org.hl7.fhir.r4.model.Reference(p.getPymntNoticePayee()));
		}
		/******************** PymntNotice_Pymnt ********************************************************************************/
		if(p.getPymntNoticePymnt() != null) {
			paymentnotice.setPayment( new org.hl7.fhir.r4.model.Reference(p.getPymntNoticePymnt()));
		}
		/******************** PymntNotice_PymntDt ********************************************************************************/
		if(p.getPymntNoticePymntDt() != null) {
			java.text.SimpleDateFormat PymntNotice_PymntDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PymntNotice_PymntDtdate = PymntNotice_PymntDtsdf.parse(p.getPymntNoticePymntDt());
			paymentnotice.setPaymentDate(PymntNotice_PymntDtdate);
		}
		/******************** paymentnoticepaymentstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept paymentnoticepaymentstatus =  new org.hl7.fhir.r4.model.CodeableConcept();
		paymentnotice.setPaymentStatus(paymentnoticepaymentstatus);

		/******************** paymentnoticepaymentstatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding paymentnoticepaymentstatuscoding =  new org.hl7.fhir.r4.model.Coding();
		paymentnoticepaymentstatus.addCoding(paymentnoticepaymentstatuscoding);

		/******************** PymntNotice_PymntSts_Cdg_Cd ********************************************************************************/
		if(p.getPymntNoticePymntStsCdgCd() != null) {
			paymentnoticepaymentstatuscoding.setCode(p.getPymntNoticePymntStsCdgCd());
		}
		/******************** PymntNotice_PymntSts_Cdg_Dsply ********************************************************************************/
		if(p.getPymntNoticePymntStsCdgDsply() != null) {
			paymentnoticepaymentstatuscoding.setDisplay(p.getPymntNoticePymntStsCdgDsply());
		}
		/******************** PymntNotice_PymntSts_Cdg_Sys ********************************************************************************/
		if(p.getPymntNoticePymntStsCdgSys() != null) {
			paymentnoticepaymentstatuscoding.setSystem(p.getPymntNoticePymntStsCdgSys());
		}
		/******************** PymntNotice_PymntSts_Cdg_UsrSltd ********************************************************************************/
		if(p.getPymntNoticePymntStsCdgUsrSltd() != null) {
			paymentnoticepaymentstatuscoding.setUserSelected(Boolean.parseBoolean(p.getPymntNoticePymntStsCdgUsrSltd()));
		}
		/******************** PymntNotice_PymntSts_Cdg_Vrsn ********************************************************************************/
		if(p.getPymntNoticePymntStsCdgVrsn() != null) {
			paymentnoticepaymentstatuscoding.setVersion(p.getPymntNoticePymntStsCdgVrsn());
		}
		/******************** PymntNotice_PymntSts_Txt ********************************************************************************/
		if(p.getPymntNoticePymntStsTxt() != null) {
			paymentnoticepaymentstatus.setText(p.getPymntNoticePymntStsTxt());
		}
		/******************** PymntNotice_Provider ********************************************************************************/
		if(p.getPymntNoticeProvider() != null) {
			paymentnotice.setProvider( new org.hl7.fhir.r4.model.Reference(p.getPymntNoticeProvider()));
		}
		/******************** PymntNotice_Recipient ********************************************************************************/
		if(p.getPymntNoticeRecipient() != null) {
			paymentnotice.setRecipient( new org.hl7.fhir.r4.model.Reference(p.getPymntNoticeRecipient()));
		}
		/******************** PymntNotice_Rqst ********************************************************************************/
		if(p.getPymntNoticeRqst() != null) {
			paymentnotice.setRequest( new org.hl7.fhir.r4.model.Reference(p.getPymntNoticeRqst()));
		}
		/******************** PymntNotice_Rsps ********************************************************************************/
		if(p.getPymntNoticeRsps() != null) {
			paymentnotice.setResponse( new org.hl7.fhir.r4.model.Reference(p.getPymntNoticeRsps()));
		}
		/******************** paymentnoticestatus ********************************************************************************/
		org.hl7.fhir.r4.model.PaymentNotice.PaymentNoticeStatusEnumFactory paymentnoticestatus =  new org.hl7.fhir.r4.model.PaymentNotice.PaymentNoticeStatusEnumFactory();
		paymentnotice.setStatus(paymentnoticestatus.fromCode(p.getPymntNoticeSts()));

		return paymentnotice;
	}
}
