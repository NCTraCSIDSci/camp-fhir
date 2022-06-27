package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.PaymentNotice;
public class PaymentNoticeBidirectionalConversion 
{
	public PaymentNotice PaymentNotices(org.hl7.fhir.r4.model.PaymentNotice paymentnotice) throws ParseException
	{
		 main.java.com.campfhir.model.PaymentNotice p = new  main.java.com.campfhir.model.PaymentNotice();

		/******************** id ********************************************************************************/
		paymentnotice.setId(p.getId());

		/******************** PymntNotice_Provider ********************************************************************************/
		if(paymentnotice.hasProvider()) {
			p.setPymntNoticeProvider(String.valueOf(paymentnotice.getProvider()));
		}
		/******************** paymentnoticestatus ********************************************************************************/
		org.hl7.fhir.r4.model.PaymentNotice.PaymentNoticeStatus paymentnoticestatus = paymentnotice.getStatus();
		p.setPymntNoticeSts(paymentnoticestatus.toCode());

		/******************** PymntNotice_Rqst ********************************************************************************/
		if(paymentnotice.hasRequest()) {
			p.setPymntNoticeRqst(String.valueOf(paymentnotice.getRequest()));
		}
		/******************** PymntNotice_Created ********************************************************************************/
		if(paymentnotice.hasCreated()) {
			p.setPymntNoticeCreated(String.valueOf(paymentnotice.getCreated()));
		}
		/******************** PymntNotice_PymntDt ********************************************************************************/
		if(paymentnotice.hasPaymentDate()) {
			p.setPymntNoticePymntDt(String.valueOf(paymentnotice.getPaymentDate()));
		}
		/******************** PymntNotice_Rsps ********************************************************************************/
		if(paymentnotice.hasResponse()) {
			p.setPymntNoticeRsps(String.valueOf(paymentnotice.getResponse()));
		}
		/******************** PymntNotice_Payee ********************************************************************************/
		if(paymentnotice.hasPayee()) {
			p.setPymntNoticePayee(String.valueOf(paymentnotice.getPayee()));
		}
		/******************** PymntNotice_Recipient ********************************************************************************/
		if(paymentnotice.hasRecipient()) {
			p.setPymntNoticeRecipient(String.valueOf(paymentnotice.getRecipient()));
		}
		/******************** PymntNotice_Pymnt ********************************************************************************/
		if(paymentnotice.hasPayment()) {
			p.setPymntNoticePymnt(String.valueOf(paymentnotice.getPayment()));
		}
		/******************** paymentnoticepaymentstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept paymentnoticepaymentstatus = paymentnotice.getPaymentStatus();

		/******************** PymntNotice_PymntSts_Txt ********************************************************************************/
		if(paymentnoticepaymentstatus.hasText()) {
			p.setPymntNoticePymntStsTxt(String.valueOf(paymentnoticepaymentstatus.getText()));
		}
		/******************** paymentnoticepaymentstatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding paymentnoticepaymentstatuscoding = paymentnoticepaymentstatus.getCodingFirstRep();

		/******************** PymntNotice_PymntSts_Cdg_Vrsn ********************************************************************************/
		if(paymentnoticepaymentstatuscoding.hasVersion()) {
			p.setPymntNoticePymntStsCdgVrsn(String.valueOf(paymentnoticepaymentstatuscoding.getVersion()));
		}
		/******************** PymntNotice_PymntSts_Cdg_Dsply ********************************************************************************/
		if(paymentnoticepaymentstatuscoding.hasDisplay()) {
			p.setPymntNoticePymntStsCdgDsply(String.valueOf(paymentnoticepaymentstatuscoding.getDisplay()));
		}
		/******************** PymntNotice_PymntSts_Cdg_Cd ********************************************************************************/
		if(paymentnoticepaymentstatuscoding.hasCode()) {
			p.setPymntNoticePymntStsCdgCd(String.valueOf(paymentnoticepaymentstatuscoding.getCode()));
		}
		/******************** PymntNotice_PymntSts_Cdg_UsrSltd ********************************************************************************/
		if(paymentnoticepaymentstatuscoding.hasUserSelected()) {
			p.setPymntNoticePymntStsCdgUsrSltd(String.valueOf(paymentnoticepaymentstatuscoding.getUserSelected()));
		}
		/******************** PymntNotice_PymntSts_Cdg_Sys ********************************************************************************/
		if(paymentnoticepaymentstatuscoding.hasSystem()) {
			p.setPymntNoticePymntStsCdgSys(String.valueOf(paymentnoticepaymentstatuscoding.getSystem()));
		}
		/******************** paymentnoticeidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier paymentnoticeidentifier = paymentnotice.getIdentifierFirstRep();

		/******************** PymntNotice_Id_Vl ********************************************************************************/
		if(paymentnoticeidentifier.hasValue()) {
			p.setPymntNoticeIdVl(String.valueOf(paymentnoticeidentifier.getValue()));
		}
		/******************** paymentnoticeidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept paymentnoticeidentifiertype = paymentnoticeidentifier.getType();

		/******************** PymntNotice_Id_Typ_Txt ********************************************************************************/
		if(paymentnoticeidentifiertype.hasText()) {
			p.setPymntNoticeIdTypTxt(String.valueOf(paymentnoticeidentifiertype.getText()));
		}
		/******************** paymentnoticeidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding paymentnoticeidentifiertypecoding = paymentnoticeidentifiertype.getCodingFirstRep();

		/******************** PymntNotice_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(paymentnoticeidentifiertypecoding.hasVersion()) {
			p.setPymntNoticeIdTypCdgVrsn(String.valueOf(paymentnoticeidentifiertypecoding.getVersion()));
		}
		/******************** PymntNotice_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(paymentnoticeidentifiertypecoding.hasDisplay()) {
			p.setPymntNoticeIdTypCdgDsply(String.valueOf(paymentnoticeidentifiertypecoding.getDisplay()));
		}
		/******************** PymntNotice_Id_Typ_Cdg_Cd ********************************************************************************/
		if(paymentnoticeidentifiertypecoding.hasCode()) {
			p.setPymntNoticeIdTypCdgCd(String.valueOf(paymentnoticeidentifiertypecoding.getCode()));
		}
		/******************** PymntNotice_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(paymentnoticeidentifiertypecoding.hasUserSelected()) {
			p.setPymntNoticeIdTypCdgUsrSltd(String.valueOf(paymentnoticeidentifiertypecoding.getUserSelected()));
		}
		/******************** PymntNotice_Id_Typ_Cdg_Sys ********************************************************************************/
		if(paymentnoticeidentifiertypecoding.hasSystem()) {
			p.setPymntNoticeIdTypCdgSys(String.valueOf(paymentnoticeidentifiertypecoding.getSystem()));
		}
		/******************** paymentnoticeidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period paymentnoticeidentifierperiod = paymentnoticeidentifier.getPeriod();

		/******************** PymntNotice_Id_Prd_Strt ********************************************************************************/
		if(paymentnoticeidentifierperiod.hasStart()) {
			p.setPymntNoticeIdPrdStrt(String.valueOf(paymentnoticeidentifierperiod.getStart()));
		}
		/******************** PymntNotice_Id_Prd_End ********************************************************************************/
		if(paymentnoticeidentifierperiod.hasEnd()) {
			p.setPymntNoticeIdPrdEnd(String.valueOf(paymentnoticeidentifierperiod.getEnd()));
		}
		/******************** PymntNotice_Id_Assigner ********************************************************************************/
		if(paymentnoticeidentifier.hasAssigner()) {
			p.setPymntNoticeIdAssigner(String.valueOf(paymentnoticeidentifier.getAssigner()));
		}
		/******************** PymntNotice_Id_Sys ********************************************************************************/
		if(paymentnoticeidentifier.hasSystem()) {
			p.setPymntNoticeIdSys(String.valueOf(paymentnoticeidentifier.getSystem()));
		}
		/******************** paymentnoticeidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse paymentnoticeidentifieruse = paymentnoticeidentifier.getUse();
		p.setPymntNoticeIdUse(paymentnoticeidentifieruse.toCode());

		/******************** paymentnoticeamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money paymentnoticeamount = paymentnotice.getAmount();

		/******************** PymntNotice_Amnt_Vl ********************************************************************************/
		if(paymentnoticeamount.hasValue()) {
			p.setPymntNoticeAmntVl(String.valueOf(paymentnoticeamount.getValue()));
		}
		/******************** PymntNotice_Amnt_Crncy ********************************************************************************/
		if(paymentnoticeamount.hasCurrency()) {
			p.setPymntNoticeAmntCrncy(String.valueOf(paymentnoticeamount.getCurrency()));
		}
		return p;
	}
}
