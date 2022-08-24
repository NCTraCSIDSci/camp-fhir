package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.PaymentNotice;
public class PaymentNoticeBidirectionalConversion 
{
	public PaymentNotice PaymentNotices(org.hl7.fhir.r4.model.PaymentNotice paymentnotice) throws ParseException
	{
		 main.java.com.campfhir.model.PaymentNotice p = new  main.java.com.campfhir.model.PaymentNotice();

		/******************** id ********************************************************************************/
		p.setId(paymentnotice.getIdElement().getIdPart());

		/******************** PymntNotice_Provider ********************************************************************************/
		if(paymentnotice.hasProvider()) {

			if(paymentnotice.getProvider().getReference() != null) {
			p.addPymntNoticeProvider(paymentnotice.getProvider().getReference());
			}
		} else {
			p.addPymntNoticeProvider("NULL");
		}


		/******************** paymentnoticestatus ********************************************************************************/
		org.hl7.fhir.r4.model.PaymentNotice.PaymentNoticeStatus paymentnoticestatus = paymentnotice.getStatus();
		if(paymentnoticestatus!=null) {
			p.addPymntNoticeSts(paymentnoticestatus.toCode());
		} else {
			p.addPymntNoticeSts("NULL");
		}

		/******************** PymntNotice_Created ********************************************************************************/
		if(paymentnotice.hasCreated()) {

			p.addPymntNoticeCreated("\""+ca.uhn.fhir.util.DateUtils.formatDate(paymentnotice.getCreated())+"\"");
		} else {
			p.addPymntNoticeCreated("NULL");
		}


		/******************** PymntNotice_Rqst ********************************************************************************/
		if(paymentnotice.hasRequest()) {

			if(paymentnotice.getRequest().getReference() != null) {
			p.addPymntNoticeRqst(paymentnotice.getRequest().getReference());
			}
		} else {
			p.addPymntNoticeRqst("NULL");
		}


		/******************** paymentnoticeidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> paymentnoticeidentifierlist = paymentnotice.getIdentifier();
		for(int paymentnoticeidentifieri = 0; paymentnoticeidentifieri<paymentnoticeidentifierlist.size();paymentnoticeidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  paymentnoticeidentifier = paymentnoticeidentifierlist.get(paymentnoticeidentifieri);

		/******************** PymntNotice_Id_Vl ********************************************************************************/
		if(paymentnoticeidentifieri == 0) {p.addPymntNoticeIdVl("[");}
		if(paymentnoticeidentifier.hasValue()) {

			p.addPymntNoticeIdVl(String.valueOf(paymentnoticeidentifier.getValue()));
		} else {
			p.addPymntNoticeIdVl("NULL");
		}

		if(paymentnoticeidentifieri == paymentnoticeidentifierlist.size()-1) {p.addPymntNoticeIdVl("]");}


		/******************** paymentnoticeidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept paymentnoticeidentifiertype = paymentnoticeidentifier.getType();

		/******************** PymntNotice_Id_Typ_Txt ********************************************************************************/
		if(paymentnoticeidentifieri == 0) {p.addPymntNoticeIdTypTxt("[");}
		if(paymentnoticeidentifiertype.hasText()) {

			p.addPymntNoticeIdTypTxt(String.valueOf(paymentnoticeidentifiertype.getText()));
		} else {
			p.addPymntNoticeIdTypTxt("NULL");
		}

		if(paymentnoticeidentifieri == paymentnoticeidentifierlist.size()-1) {p.addPymntNoticeIdTypTxt("]");}


		/******************** paymentnoticeidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> paymentnoticeidentifiertypecodinglist = paymentnoticeidentifiertype.getCoding();
		for(int paymentnoticeidentifiertypecodingi = 0; paymentnoticeidentifiertypecodingi<paymentnoticeidentifiertypecodinglist.size();paymentnoticeidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  paymentnoticeidentifiertypecoding = paymentnoticeidentifiertypecodinglist.get(paymentnoticeidentifiertypecodingi);

		/******************** PymntNotice_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(paymentnoticeidentifiertypecodingi == 0) {p.addPymntNoticeIdTypCdgDsply("[[");}
		if(paymentnoticeidentifiertypecoding.hasDisplay()) {

			p.addPymntNoticeIdTypCdgDsply(String.valueOf(paymentnoticeidentifiertypecoding.getDisplay()));
		} else {
			p.addPymntNoticeIdTypCdgDsply("NULL");
		}

		if(paymentnoticeidentifiertypecodingi == paymentnoticeidentifiertypecodinglist.size()-1) {p.addPymntNoticeIdTypCdgDsply("]]");}


		/******************** PymntNotice_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(paymentnoticeidentifiertypecodingi == 0) {p.addPymntNoticeIdTypCdgVrsn("[[");}
		if(paymentnoticeidentifiertypecoding.hasVersion()) {

			p.addPymntNoticeIdTypCdgVrsn(String.valueOf(paymentnoticeidentifiertypecoding.getVersion()));
		} else {
			p.addPymntNoticeIdTypCdgVrsn("NULL");
		}

		if(paymentnoticeidentifiertypecodingi == paymentnoticeidentifiertypecodinglist.size()-1) {p.addPymntNoticeIdTypCdgVrsn("]]");}


		/******************** PymntNotice_Id_Typ_Cdg_Cd ********************************************************************************/
		if(paymentnoticeidentifiertypecodingi == 0) {p.addPymntNoticeIdTypCdgCd("[[");}
		if(paymentnoticeidentifiertypecoding.hasCode()) {

			p.addPymntNoticeIdTypCdgCd(String.valueOf(paymentnoticeidentifiertypecoding.getCode()));
		} else {
			p.addPymntNoticeIdTypCdgCd("NULL");
		}

		if(paymentnoticeidentifiertypecodingi == paymentnoticeidentifiertypecodinglist.size()-1) {p.addPymntNoticeIdTypCdgCd("]]");}


		/******************** PymntNotice_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(paymentnoticeidentifiertypecodingi == 0) {p.addPymntNoticeIdTypCdgUsrSltd("[[");}
		if(paymentnoticeidentifiertypecoding.hasUserSelected()) {

			p.addPymntNoticeIdTypCdgUsrSltd(String.valueOf(paymentnoticeidentifiertypecoding.getUserSelected()));
		} else {
			p.addPymntNoticeIdTypCdgUsrSltd("NULL");
		}

		if(paymentnoticeidentifiertypecodingi == paymentnoticeidentifiertypecodinglist.size()-1) {p.addPymntNoticeIdTypCdgUsrSltd("]]");}


		/******************** PymntNotice_Id_Typ_Cdg_Sys ********************************************************************************/
		if(paymentnoticeidentifiertypecodingi == 0) {p.addPymntNoticeIdTypCdgSys("[[");}
		if(paymentnoticeidentifiertypecoding.hasSystem()) {

			p.addPymntNoticeIdTypCdgSys(String.valueOf(paymentnoticeidentifiertypecoding.getSystem()));
		} else {
			p.addPymntNoticeIdTypCdgSys("NULL");
		}

		if(paymentnoticeidentifiertypecodingi == paymentnoticeidentifiertypecodinglist.size()-1) {p.addPymntNoticeIdTypCdgSys("]]");}


		 };
		/******************** paymentnoticeidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period paymentnoticeidentifierperiod = paymentnoticeidentifier.getPeriod();

		/******************** PymntNotice_Id_Prd_Strt ********************************************************************************/
		if(paymentnoticeidentifieri == 0) {p.addPymntNoticeIdPrdStrt("[");}
		if(paymentnoticeidentifierperiod.hasStart()) {

			p.addPymntNoticeIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(paymentnoticeidentifierperiod.getStart())+"\"");
		} else {
			p.addPymntNoticeIdPrdStrt("NULL");
		}

		if(paymentnoticeidentifieri == paymentnoticeidentifierlist.size()-1) {p.addPymntNoticeIdPrdStrt("]");}


		/******************** PymntNotice_Id_Prd_End ********************************************************************************/
		if(paymentnoticeidentifieri == 0) {p.addPymntNoticeIdPrdEnd("[");}
		if(paymentnoticeidentifierperiod.hasEnd()) {

			p.addPymntNoticeIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(paymentnoticeidentifierperiod.getEnd())+"\"");
		} else {
			p.addPymntNoticeIdPrdEnd("NULL");
		}

		if(paymentnoticeidentifieri == paymentnoticeidentifierlist.size()-1) {p.addPymntNoticeIdPrdEnd("]");}


		/******************** paymentnoticeidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse paymentnoticeidentifieruse = paymentnoticeidentifier.getUse();
		if(paymentnoticeidentifieruse!=null) {
		if(paymentnoticeidentifieri == 0) {

		p.addPymntNoticeIdUse("[");		}
			p.addPymntNoticeIdUse(paymentnoticeidentifieruse.toCode());
		if(paymentnoticeidentifieri == paymentnoticeidentifierlist.size()-1) {

		p.addPymntNoticeIdUse("]");		}

		} else {
			p.addPymntNoticeIdUse("NULL");
		}

		/******************** PymntNotice_Id_Assigner ********************************************************************************/
		if(paymentnoticeidentifieri == 0) {p.addPymntNoticeIdAssigner("[");}
		if(paymentnoticeidentifier.hasAssigner()) {

			if(paymentnoticeidentifier.getAssigner().getReference() != null) {
			p.addPymntNoticeIdAssigner(paymentnoticeidentifier.getAssigner().getReference());
			}
		} else {
			p.addPymntNoticeIdAssigner("NULL");
		}

		if(paymentnoticeidentifieri == paymentnoticeidentifierlist.size()-1) {p.addPymntNoticeIdAssigner("]");}


		/******************** PymntNotice_Id_Sys ********************************************************************************/
		if(paymentnoticeidentifieri == 0) {p.addPymntNoticeIdSys("[");}
		if(paymentnoticeidentifier.hasSystem()) {

			p.addPymntNoticeIdSys(String.valueOf(paymentnoticeidentifier.getSystem()));
		} else {
			p.addPymntNoticeIdSys("NULL");
		}

		if(paymentnoticeidentifieri == paymentnoticeidentifierlist.size()-1) {p.addPymntNoticeIdSys("]");}


		 };
		/******************** PymntNotice_PymntDt ********************************************************************************/
		if(paymentnotice.hasPaymentDate()) {

			p.addPymntNoticePymntDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(paymentnotice.getPaymentDate())+"\"");
		} else {
			p.addPymntNoticePymntDt("NULL");
		}


		/******************** paymentnoticepaymentstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept paymentnoticepaymentstatus = paymentnotice.getPaymentStatus();

		/******************** PymntNotice_PymntSts_Txt ********************************************************************************/
		if(paymentnoticepaymentstatus.hasText()) {

			p.addPymntNoticePymntStsTxt(String.valueOf(paymentnoticepaymentstatus.getText()));
		} else {
			p.addPymntNoticePymntStsTxt("NULL");
		}


		/******************** paymentnoticepaymentstatuscoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> paymentnoticepaymentstatuscodinglist = paymentnoticepaymentstatus.getCoding();
		for(int paymentnoticepaymentstatuscodingi = 0; paymentnoticepaymentstatuscodingi<paymentnoticepaymentstatuscodinglist.size();paymentnoticepaymentstatuscodingi++ ) {
		org.hl7.fhir.r4.model.Coding  paymentnoticepaymentstatuscoding = paymentnoticepaymentstatuscodinglist.get(paymentnoticepaymentstatuscodingi);

		/******************** PymntNotice_PymntSts_Cdg_Dsply ********************************************************************************/
		if(paymentnoticepaymentstatuscodingi == 0) {p.addPymntNoticePymntStsCdgDsply("[");}
		if(paymentnoticepaymentstatuscoding.hasDisplay()) {

			p.addPymntNoticePymntStsCdgDsply(String.valueOf(paymentnoticepaymentstatuscoding.getDisplay()));
		} else {
			p.addPymntNoticePymntStsCdgDsply("NULL");
		}

		if(paymentnoticepaymentstatuscodingi == paymentnoticepaymentstatuscodinglist.size()-1) {p.addPymntNoticePymntStsCdgDsply("]");}


		/******************** PymntNotice_PymntSts_Cdg_Vrsn ********************************************************************************/
		if(paymentnoticepaymentstatuscodingi == 0) {p.addPymntNoticePymntStsCdgVrsn("[");}
		if(paymentnoticepaymentstatuscoding.hasVersion()) {

			p.addPymntNoticePymntStsCdgVrsn(String.valueOf(paymentnoticepaymentstatuscoding.getVersion()));
		} else {
			p.addPymntNoticePymntStsCdgVrsn("NULL");
		}

		if(paymentnoticepaymentstatuscodingi == paymentnoticepaymentstatuscodinglist.size()-1) {p.addPymntNoticePymntStsCdgVrsn("]");}


		/******************** PymntNotice_PymntSts_Cdg_Cd ********************************************************************************/
		if(paymentnoticepaymentstatuscodingi == 0) {p.addPymntNoticePymntStsCdgCd("[");}
		if(paymentnoticepaymentstatuscoding.hasCode()) {

			p.addPymntNoticePymntStsCdgCd(String.valueOf(paymentnoticepaymentstatuscoding.getCode()));
		} else {
			p.addPymntNoticePymntStsCdgCd("NULL");
		}

		if(paymentnoticepaymentstatuscodingi == paymentnoticepaymentstatuscodinglist.size()-1) {p.addPymntNoticePymntStsCdgCd("]");}


		/******************** PymntNotice_PymntSts_Cdg_UsrSltd ********************************************************************************/
		if(paymentnoticepaymentstatuscodingi == 0) {p.addPymntNoticePymntStsCdgUsrSltd("[");}
		if(paymentnoticepaymentstatuscoding.hasUserSelected()) {

			p.addPymntNoticePymntStsCdgUsrSltd(String.valueOf(paymentnoticepaymentstatuscoding.getUserSelected()));
		} else {
			p.addPymntNoticePymntStsCdgUsrSltd("NULL");
		}

		if(paymentnoticepaymentstatuscodingi == paymentnoticepaymentstatuscodinglist.size()-1) {p.addPymntNoticePymntStsCdgUsrSltd("]");}


		/******************** PymntNotice_PymntSts_Cdg_Sys ********************************************************************************/
		if(paymentnoticepaymentstatuscodingi == 0) {p.addPymntNoticePymntStsCdgSys("[");}
		if(paymentnoticepaymentstatuscoding.hasSystem()) {

			p.addPymntNoticePymntStsCdgSys(String.valueOf(paymentnoticepaymentstatuscoding.getSystem()));
		} else {
			p.addPymntNoticePymntStsCdgSys("NULL");
		}

		if(paymentnoticepaymentstatuscodingi == paymentnoticepaymentstatuscodinglist.size()-1) {p.addPymntNoticePymntStsCdgSys("]");}


		 };
		/******************** PymntNotice_Rsps ********************************************************************************/
		if(paymentnotice.hasResponse()) {

			if(paymentnotice.getResponse().getReference() != null) {
			p.addPymntNoticeRsps(paymentnotice.getResponse().getReference());
			}
		} else {
			p.addPymntNoticeRsps("NULL");
		}


		/******************** PymntNotice_Recipient ********************************************************************************/
		if(paymentnotice.hasRecipient()) {

			if(paymentnotice.getRecipient().getReference() != null) {
			p.addPymntNoticeRecipient(paymentnotice.getRecipient().getReference());
			}
		} else {
			p.addPymntNoticeRecipient("NULL");
		}


		/******************** PymntNotice_Payee ********************************************************************************/
		if(paymentnotice.hasPayee()) {

			if(paymentnotice.getPayee().getReference() != null) {
			p.addPymntNoticePayee(paymentnotice.getPayee().getReference());
			}
		} else {
			p.addPymntNoticePayee("NULL");
		}


		/******************** PymntNotice_Pymnt ********************************************************************************/
		if(paymentnotice.hasPayment()) {

			if(paymentnotice.getPayment().getReference() != null) {
			p.addPymntNoticePymnt(paymentnotice.getPayment().getReference());
			}
		} else {
			p.addPymntNoticePymnt("NULL");
		}


		/******************** paymentnoticeamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money paymentnoticeamount = paymentnotice.getAmount();

		/******************** PymntNotice_Amnt_Vl ********************************************************************************/
		if(paymentnoticeamount.hasValue()) {

			p.addPymntNoticeAmntVl(String.valueOf(paymentnoticeamount.getValue()));
		} else {
			p.addPymntNoticeAmntVl("NULL");
		}


		/******************** PymntNotice_Amnt_Crncy ********************************************************************************/
		if(paymentnoticeamount.hasCurrency()) {

			p.addPymntNoticeAmntCrncy(String.valueOf(paymentnoticeamount.getCurrency()));
		} else {
			p.addPymntNoticeAmntCrncy("NULL");
		}


		return p;
	}
}
