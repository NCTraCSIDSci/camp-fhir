package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.PaymentReconciliation;
public class PaymentReconciliationBidirectionalConversion 
{
	public PaymentReconciliation PaymentReconciliations(org.hl7.fhir.r4.model.PaymentReconciliation paymentreconciliation) throws ParseException
	{
		 main.java.com.campfhir.model.PaymentReconciliation p = new  main.java.com.campfhir.model.PaymentReconciliation();

		/******************** id ********************************************************************************/
		p.setId(paymentreconciliation.getIdElement().getIdPart());

		/******************** paymentreconciliationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.PaymentReconciliation.PaymentReconciliationStatus paymentreconciliationstatus = paymentreconciliation.getStatus();
		if(paymentreconciliationstatus!=null) {
			p.addPymntRecncliatnSts(paymentreconciliationstatus.toCode());
		} else {
			p.addPymntRecncliatnSts("NULL");
		}

		/******************** PymntRecncliatn_PymntIssuer ********************************************************************************/
		if(paymentreconciliation.hasPaymentIssuer()) {

			if(paymentreconciliation.getPaymentIssuer().getReference() != null) {
			p.addPymntRecncliatnPymntIssuer(paymentreconciliation.getPaymentIssuer().getReference());
			}
		} else {
			p.addPymntRecncliatnPymntIssuer("NULL");
		}


		/******************** PymntRecncliatn_Created ********************************************************************************/
		if(paymentreconciliation.hasCreated()) {

			p.addPymntRecncliatnCreated("\""+ca.uhn.fhir.util.DateUtils.formatDate(paymentreconciliation.getCreated())+"\"");
		} else {
			p.addPymntRecncliatnCreated("NULL");
		}


		/******************** PymntRecncliatn_Rqst ********************************************************************************/
		if(paymentreconciliation.hasRequest()) {

			if(paymentreconciliation.getRequest().getReference() != null) {
			p.addPymntRecncliatnRqst(paymentreconciliation.getRequest().getReference());
			}
		} else {
			p.addPymntRecncliatnRqst("NULL");
		}


		/******************** paymentreconciliationperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period paymentreconciliationperiod = paymentreconciliation.getPeriod();

		/******************** PymntRecncliatn_Prd_Strt ********************************************************************************/
		if(paymentreconciliationperiod.hasStart()) {

			p.addPymntRecncliatnPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(paymentreconciliationperiod.getStart())+"\"");
		} else {
			p.addPymntRecncliatnPrdStrt("NULL");
		}


		/******************** PymntRecncliatn_Prd_End ********************************************************************************/
		if(paymentreconciliationperiod.hasEnd()) {

			p.addPymntRecncliatnPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(paymentreconciliationperiod.getEnd())+"\"");
		} else {
			p.addPymntRecncliatnPrdEnd("NULL");
		}


		/******************** paymentreconciliationidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> paymentreconciliationidentifierlist = paymentreconciliation.getIdentifier();
		for(int paymentreconciliationidentifieri = 0; paymentreconciliationidentifieri<paymentreconciliationidentifierlist.size();paymentreconciliationidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  paymentreconciliationidentifier = paymentreconciliationidentifierlist.get(paymentreconciliationidentifieri);

		/******************** PymntRecncliatn_Id_Vl ********************************************************************************/
		if(paymentreconciliationidentifieri == 0) {p.addPymntRecncliatnIdVl("[");}
		if(paymentreconciliationidentifier.hasValue()) {

			p.addPymntRecncliatnIdVl(String.valueOf(paymentreconciliationidentifier.getValue()));
		} else {
			p.addPymntRecncliatnIdVl("NULL");
		}

		if(paymentreconciliationidentifieri == paymentreconciliationidentifierlist.size()-1) {p.addPymntRecncliatnIdVl("]");}


		/******************** paymentreconciliationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept paymentreconciliationidentifiertype = paymentreconciliationidentifier.getType();

		/******************** PymntRecncliatn_Id_Typ_Txt ********************************************************************************/
		if(paymentreconciliationidentifieri == 0) {p.addPymntRecncliatnIdTypTxt("[");}
		if(paymentreconciliationidentifiertype.hasText()) {

			p.addPymntRecncliatnIdTypTxt(String.valueOf(paymentreconciliationidentifiertype.getText()));
		} else {
			p.addPymntRecncliatnIdTypTxt("NULL");
		}

		if(paymentreconciliationidentifieri == paymentreconciliationidentifierlist.size()-1) {p.addPymntRecncliatnIdTypTxt("]");}


		/******************** paymentreconciliationidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> paymentreconciliationidentifiertypecodinglist = paymentreconciliationidentifiertype.getCoding();
		for(int paymentreconciliationidentifiertypecodingi = 0; paymentreconciliationidentifiertypecodingi<paymentreconciliationidentifiertypecodinglist.size();paymentreconciliationidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  paymentreconciliationidentifiertypecoding = paymentreconciliationidentifiertypecodinglist.get(paymentreconciliationidentifiertypecodingi);

		/******************** PymntRecncliatn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(paymentreconciliationidentifiertypecodingi == 0) {p.addPymntRecncliatnIdTypCdgDsply("[[");}
		if(paymentreconciliationidentifiertypecoding.hasDisplay()) {

			p.addPymntRecncliatnIdTypCdgDsply(String.valueOf(paymentreconciliationidentifiertypecoding.getDisplay()));
		} else {
			p.addPymntRecncliatnIdTypCdgDsply("NULL");
		}

		if(paymentreconciliationidentifiertypecodingi == paymentreconciliationidentifiertypecodinglist.size()-1) {p.addPymntRecncliatnIdTypCdgDsply("]]");}


		/******************** PymntRecncliatn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(paymentreconciliationidentifiertypecodingi == 0) {p.addPymntRecncliatnIdTypCdgVrsn("[[");}
		if(paymentreconciliationidentifiertypecoding.hasVersion()) {

			p.addPymntRecncliatnIdTypCdgVrsn(String.valueOf(paymentreconciliationidentifiertypecoding.getVersion()));
		} else {
			p.addPymntRecncliatnIdTypCdgVrsn("NULL");
		}

		if(paymentreconciliationidentifiertypecodingi == paymentreconciliationidentifiertypecodinglist.size()-1) {p.addPymntRecncliatnIdTypCdgVrsn("]]");}


		/******************** PymntRecncliatn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(paymentreconciliationidentifiertypecodingi == 0) {p.addPymntRecncliatnIdTypCdgCd("[[");}
		if(paymentreconciliationidentifiertypecoding.hasCode()) {

			p.addPymntRecncliatnIdTypCdgCd(String.valueOf(paymentreconciliationidentifiertypecoding.getCode()));
		} else {
			p.addPymntRecncliatnIdTypCdgCd("NULL");
		}

		if(paymentreconciliationidentifiertypecodingi == paymentreconciliationidentifiertypecodinglist.size()-1) {p.addPymntRecncliatnIdTypCdgCd("]]");}


		/******************** PymntRecncliatn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(paymentreconciliationidentifiertypecodingi == 0) {p.addPymntRecncliatnIdTypCdgUsrSltd("[[");}
		if(paymentreconciliationidentifiertypecoding.hasUserSelected()) {

			p.addPymntRecncliatnIdTypCdgUsrSltd(String.valueOf(paymentreconciliationidentifiertypecoding.getUserSelected()));
		} else {
			p.addPymntRecncliatnIdTypCdgUsrSltd("NULL");
		}

		if(paymentreconciliationidentifiertypecodingi == paymentreconciliationidentifiertypecodinglist.size()-1) {p.addPymntRecncliatnIdTypCdgUsrSltd("]]");}


		/******************** PymntRecncliatn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(paymentreconciliationidentifiertypecodingi == 0) {p.addPymntRecncliatnIdTypCdgSys("[[");}
		if(paymentreconciliationidentifiertypecoding.hasSystem()) {

			p.addPymntRecncliatnIdTypCdgSys(String.valueOf(paymentreconciliationidentifiertypecoding.getSystem()));
		} else {
			p.addPymntRecncliatnIdTypCdgSys("NULL");
		}

		if(paymentreconciliationidentifiertypecodingi == paymentreconciliationidentifiertypecodinglist.size()-1) {p.addPymntRecncliatnIdTypCdgSys("]]");}


		 };
		/******************** paymentreconciliationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period paymentreconciliationidentifierperiod = paymentreconciliationidentifier.getPeriod();

		/******************** PymntRecncliatn_Id_Prd_Strt ********************************************************************************/
		if(paymentreconciliationidentifieri == 0) {p.addPymntRecncliatnIdPrdStrt("[");}
		if(paymentreconciliationidentifierperiod.hasStart()) {

			p.addPymntRecncliatnIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(paymentreconciliationidentifierperiod.getStart())+"\"");
		} else {
			p.addPymntRecncliatnIdPrdStrt("NULL");
		}

		if(paymentreconciliationidentifieri == paymentreconciliationidentifierlist.size()-1) {p.addPymntRecncliatnIdPrdStrt("]");}


		/******************** PymntRecncliatn_Id_Prd_End ********************************************************************************/
		if(paymentreconciliationidentifieri == 0) {p.addPymntRecncliatnIdPrdEnd("[");}
		if(paymentreconciliationidentifierperiod.hasEnd()) {

			p.addPymntRecncliatnIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(paymentreconciliationidentifierperiod.getEnd())+"\"");
		} else {
			p.addPymntRecncliatnIdPrdEnd("NULL");
		}

		if(paymentreconciliationidentifieri == paymentreconciliationidentifierlist.size()-1) {p.addPymntRecncliatnIdPrdEnd("]");}


		/******************** paymentreconciliationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse paymentreconciliationidentifieruse = paymentreconciliationidentifier.getUse();
		if(paymentreconciliationidentifieruse!=null) {
		if(paymentreconciliationidentifieri == 0) {

		p.addPymntRecncliatnIdUse("[");		}
			p.addPymntRecncliatnIdUse(paymentreconciliationidentifieruse.toCode());
		if(paymentreconciliationidentifieri == paymentreconciliationidentifierlist.size()-1) {

		p.addPymntRecncliatnIdUse("]");		}

		} else {
			p.addPymntRecncliatnIdUse("NULL");
		}

		/******************** PymntRecncliatn_Id_Assigner ********************************************************************************/
		if(paymentreconciliationidentifieri == 0) {p.addPymntRecncliatnIdAssigner("[");}
		if(paymentreconciliationidentifier.hasAssigner()) {

			if(paymentreconciliationidentifier.getAssigner().getReference() != null) {
			p.addPymntRecncliatnIdAssigner(paymentreconciliationidentifier.getAssigner().getReference());
			}
		} else {
			p.addPymntRecncliatnIdAssigner("NULL");
		}

		if(paymentreconciliationidentifieri == paymentreconciliationidentifierlist.size()-1) {p.addPymntRecncliatnIdAssigner("]");}


		/******************** PymntRecncliatn_Id_Sys ********************************************************************************/
		if(paymentreconciliationidentifieri == 0) {p.addPymntRecncliatnIdSys("[");}
		if(paymentreconciliationidentifier.hasSystem()) {

			p.addPymntRecncliatnIdSys(String.valueOf(paymentreconciliationidentifier.getSystem()));
		} else {
			p.addPymntRecncliatnIdSys("NULL");
		}

		if(paymentreconciliationidentifieri == paymentreconciliationidentifierlist.size()-1) {p.addPymntRecncliatnIdSys("]");}


		 };
		/******************** PymntRecncliatn_Disposition ********************************************************************************/
		if(paymentreconciliation.hasDisposition()) {

			p.addPymntRecncliatnDisposition(String.valueOf(paymentreconciliation.getDisposition()));
		} else {
			p.addPymntRecncliatnDisposition("NULL");
		}


		/******************** paymentreconciliationdetail ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.PaymentReconciliation.DetailsComponent> paymentreconciliationdetaillist = paymentreconciliation.getDetail();
		for(int paymentreconciliationdetaili = 0; paymentreconciliationdetaili<paymentreconciliationdetaillist.size();paymentreconciliationdetaili++ ) {
		org.hl7.fhir.r4.model.PaymentReconciliation.DetailsComponent  paymentreconciliationdetail = paymentreconciliationdetaillist.get(paymentreconciliationdetaili);

		/******************** paymentreconciliationdetailtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept paymentreconciliationdetailtype = paymentreconciliationdetail.getType();

		/******************** PymntRecncliatn_Dtl_Typ_Txt ********************************************************************************/
		if(paymentreconciliationdetaili == 0) {p.addPymntRecncliatnDtlTypTxt("[");}
		if(paymentreconciliationdetailtype.hasText()) {

			p.addPymntRecncliatnDtlTypTxt(String.valueOf(paymentreconciliationdetailtype.getText()));
		} else {
			p.addPymntRecncliatnDtlTypTxt("NULL");
		}

		if(paymentreconciliationdetaili == paymentreconciliationdetaillist.size()-1) {p.addPymntRecncliatnDtlTypTxt("]");}


		/******************** paymentreconciliationdetailtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> paymentreconciliationdetailtypecodinglist = paymentreconciliationdetailtype.getCoding();
		for(int paymentreconciliationdetailtypecodingi = 0; paymentreconciliationdetailtypecodingi<paymentreconciliationdetailtypecodinglist.size();paymentreconciliationdetailtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  paymentreconciliationdetailtypecoding = paymentreconciliationdetailtypecodinglist.get(paymentreconciliationdetailtypecodingi);

		/******************** PymntRecncliatn_Dtl_Typ_Cdg_Dsply ********************************************************************************/
		if(paymentreconciliationdetailtypecodingi == 0) {p.addPymntRecncliatnDtlTypCdgDsply("[[");}
		if(paymentreconciliationdetailtypecoding.hasDisplay()) {

			p.addPymntRecncliatnDtlTypCdgDsply(String.valueOf(paymentreconciliationdetailtypecoding.getDisplay()));
		} else {
			p.addPymntRecncliatnDtlTypCdgDsply("NULL");
		}

		if(paymentreconciliationdetailtypecodingi == paymentreconciliationdetailtypecodinglist.size()-1) {p.addPymntRecncliatnDtlTypCdgDsply("]]");}


		/******************** PymntRecncliatn_Dtl_Typ_Cdg_Vrsn ********************************************************************************/
		if(paymentreconciliationdetailtypecodingi == 0) {p.addPymntRecncliatnDtlTypCdgVrsn("[[");}
		if(paymentreconciliationdetailtypecoding.hasVersion()) {

			p.addPymntRecncliatnDtlTypCdgVrsn(String.valueOf(paymentreconciliationdetailtypecoding.getVersion()));
		} else {
			p.addPymntRecncliatnDtlTypCdgVrsn("NULL");
		}

		if(paymentreconciliationdetailtypecodingi == paymentreconciliationdetailtypecodinglist.size()-1) {p.addPymntRecncliatnDtlTypCdgVrsn("]]");}


		/******************** PymntRecncliatn_Dtl_Typ_Cdg_Cd ********************************************************************************/
		if(paymentreconciliationdetailtypecodingi == 0) {p.addPymntRecncliatnDtlTypCdgCd("[[");}
		if(paymentreconciliationdetailtypecoding.hasCode()) {

			p.addPymntRecncliatnDtlTypCdgCd(String.valueOf(paymentreconciliationdetailtypecoding.getCode()));
		} else {
			p.addPymntRecncliatnDtlTypCdgCd("NULL");
		}

		if(paymentreconciliationdetailtypecodingi == paymentreconciliationdetailtypecodinglist.size()-1) {p.addPymntRecncliatnDtlTypCdgCd("]]");}


		/******************** PymntRecncliatn_Dtl_Typ_Cdg_UsrSltd ********************************************************************************/
		if(paymentreconciliationdetailtypecodingi == 0) {p.addPymntRecncliatnDtlTypCdgUsrSltd("[[");}
		if(paymentreconciliationdetailtypecoding.hasUserSelected()) {

			p.addPymntRecncliatnDtlTypCdgUsrSltd(String.valueOf(paymentreconciliationdetailtypecoding.getUserSelected()));
		} else {
			p.addPymntRecncliatnDtlTypCdgUsrSltd("NULL");
		}

		if(paymentreconciliationdetailtypecodingi == paymentreconciliationdetailtypecodinglist.size()-1) {p.addPymntRecncliatnDtlTypCdgUsrSltd("]]");}


		/******************** PymntRecncliatn_Dtl_Typ_Cdg_Sys ********************************************************************************/
		if(paymentreconciliationdetailtypecodingi == 0) {p.addPymntRecncliatnDtlTypCdgSys("[[");}
		if(paymentreconciliationdetailtypecoding.hasSystem()) {

			p.addPymntRecncliatnDtlTypCdgSys(String.valueOf(paymentreconciliationdetailtypecoding.getSystem()));
		} else {
			p.addPymntRecncliatnDtlTypCdgSys("NULL");
		}

		if(paymentreconciliationdetailtypecodingi == paymentreconciliationdetailtypecodinglist.size()-1) {p.addPymntRecncliatnDtlTypCdgSys("]]");}


		 };
		/******************** PymntRecncliatn_Dtl_Dt ********************************************************************************/
		if(paymentreconciliationdetaili == 0) {p.addPymntRecncliatnDtlDt("[");}
		if(paymentreconciliationdetail.hasDate()) {

			p.addPymntRecncliatnDtlDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(paymentreconciliationdetail.getDate())+"\"");
		} else {
			p.addPymntRecncliatnDtlDt("NULL");
		}

		if(paymentreconciliationdetaili == paymentreconciliationdetaillist.size()-1) {p.addPymntRecncliatnDtlDt("]");}


		/******************** PymntRecncliatn_Dtl_Rqst ********************************************************************************/
		if(paymentreconciliationdetaili == 0) {p.addPymntRecncliatnDtlRqst("[");}
		if(paymentreconciliationdetail.hasRequest()) {

			if(paymentreconciliationdetail.getRequest().getReference() != null) {
			p.addPymntRecncliatnDtlRqst(paymentreconciliationdetail.getRequest().getReference());
			}
		} else {
			p.addPymntRecncliatnDtlRqst("NULL");
		}

		if(paymentreconciliationdetaili == paymentreconciliationdetaillist.size()-1) {p.addPymntRecncliatnDtlRqst("]");}


		/******************** paymentreconciliationdetailidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier paymentreconciliationdetailidentifier = paymentreconciliationdetail.getIdentifier();

		/******************** PymntRecncliatn_Dtl_Id_Vl ********************************************************************************/
		if(paymentreconciliationdetaili == 0) {p.addPymntRecncliatnDtlIdVl("[");}
		if(paymentreconciliationdetailidentifier.hasValue()) {

			p.addPymntRecncliatnDtlIdVl(String.valueOf(paymentreconciliationdetailidentifier.getValue()));
		} else {
			p.addPymntRecncliatnDtlIdVl("NULL");
		}

		if(paymentreconciliationdetaili == paymentreconciliationdetaillist.size()-1) {p.addPymntRecncliatnDtlIdVl("]");}


		/******************** paymentreconciliationdetailidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept paymentreconciliationdetailidentifiertype = paymentreconciliationdetailidentifier.getType();

		/******************** PymntRecncliatn_Dtl_Id_Typ_Txt ********************************************************************************/
		if(paymentreconciliationdetaili == 0) {p.addPymntRecncliatnDtlIdTypTxt("[");}
		if(paymentreconciliationdetailidentifiertype.hasText()) {

			p.addPymntRecncliatnDtlIdTypTxt(String.valueOf(paymentreconciliationdetailidentifiertype.getText()));
		} else {
			p.addPymntRecncliatnDtlIdTypTxt("NULL");
		}

		if(paymentreconciliationdetaili == paymentreconciliationdetaillist.size()-1) {p.addPymntRecncliatnDtlIdTypTxt("]");}


		/******************** paymentreconciliationdetailidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> paymentreconciliationdetailidentifiertypecodinglist = paymentreconciliationdetailidentifiertype.getCoding();
		for(int paymentreconciliationdetailidentifiertypecodingi = 0; paymentreconciliationdetailidentifiertypecodingi<paymentreconciliationdetailidentifiertypecodinglist.size();paymentreconciliationdetailidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  paymentreconciliationdetailidentifiertypecoding = paymentreconciliationdetailidentifiertypecodinglist.get(paymentreconciliationdetailidentifiertypecodingi);

		/******************** PymntRecncliatn_Dtl_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(paymentreconciliationdetailidentifiertypecodingi == 0) {p.addPymntRecncliatnDtlIdTypCdgDsply("[[");}
		if(paymentreconciliationdetailidentifiertypecoding.hasDisplay()) {

			p.addPymntRecncliatnDtlIdTypCdgDsply(String.valueOf(paymentreconciliationdetailidentifiertypecoding.getDisplay()));
		} else {
			p.addPymntRecncliatnDtlIdTypCdgDsply("NULL");
		}

		if(paymentreconciliationdetailidentifiertypecodingi == paymentreconciliationdetailidentifiertypecodinglist.size()-1) {p.addPymntRecncliatnDtlIdTypCdgDsply("]]");}


		/******************** PymntRecncliatn_Dtl_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(paymentreconciliationdetailidentifiertypecodingi == 0) {p.addPymntRecncliatnDtlIdTypCdgVrsn("[[");}
		if(paymentreconciliationdetailidentifiertypecoding.hasVersion()) {

			p.addPymntRecncliatnDtlIdTypCdgVrsn(String.valueOf(paymentreconciliationdetailidentifiertypecoding.getVersion()));
		} else {
			p.addPymntRecncliatnDtlIdTypCdgVrsn("NULL");
		}

		if(paymentreconciliationdetailidentifiertypecodingi == paymentreconciliationdetailidentifiertypecodinglist.size()-1) {p.addPymntRecncliatnDtlIdTypCdgVrsn("]]");}


		/******************** PymntRecncliatn_Dtl_Id_Typ_Cdg_Cd ********************************************************************************/
		if(paymentreconciliationdetailidentifiertypecodingi == 0) {p.addPymntRecncliatnDtlIdTypCdgCd("[[");}
		if(paymentreconciliationdetailidentifiertypecoding.hasCode()) {

			p.addPymntRecncliatnDtlIdTypCdgCd(String.valueOf(paymentreconciliationdetailidentifiertypecoding.getCode()));
		} else {
			p.addPymntRecncliatnDtlIdTypCdgCd("NULL");
		}

		if(paymentreconciliationdetailidentifiertypecodingi == paymentreconciliationdetailidentifiertypecodinglist.size()-1) {p.addPymntRecncliatnDtlIdTypCdgCd("]]");}


		/******************** PymntRecncliatn_Dtl_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(paymentreconciliationdetailidentifiertypecodingi == 0) {p.addPymntRecncliatnDtlIdTypCdgUsrSltd("[[");}
		if(paymentreconciliationdetailidentifiertypecoding.hasUserSelected()) {

			p.addPymntRecncliatnDtlIdTypCdgUsrSltd(String.valueOf(paymentreconciliationdetailidentifiertypecoding.getUserSelected()));
		} else {
			p.addPymntRecncliatnDtlIdTypCdgUsrSltd("NULL");
		}

		if(paymentreconciliationdetailidentifiertypecodingi == paymentreconciliationdetailidentifiertypecodinglist.size()-1) {p.addPymntRecncliatnDtlIdTypCdgUsrSltd("]]");}


		/******************** PymntRecncliatn_Dtl_Id_Typ_Cdg_Sys ********************************************************************************/
		if(paymentreconciliationdetailidentifiertypecodingi == 0) {p.addPymntRecncliatnDtlIdTypCdgSys("[[");}
		if(paymentreconciliationdetailidentifiertypecoding.hasSystem()) {

			p.addPymntRecncliatnDtlIdTypCdgSys(String.valueOf(paymentreconciliationdetailidentifiertypecoding.getSystem()));
		} else {
			p.addPymntRecncliatnDtlIdTypCdgSys("NULL");
		}

		if(paymentreconciliationdetailidentifiertypecodingi == paymentreconciliationdetailidentifiertypecodinglist.size()-1) {p.addPymntRecncliatnDtlIdTypCdgSys("]]");}


		 };
		/******************** paymentreconciliationdetailidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period paymentreconciliationdetailidentifierperiod = paymentreconciliationdetailidentifier.getPeriod();

		/******************** PymntRecncliatn_Dtl_Id_Prd_Strt ********************************************************************************/
		if(paymentreconciliationdetaili == 0) {p.addPymntRecncliatnDtlIdPrdStrt("[");}
		if(paymentreconciliationdetailidentifierperiod.hasStart()) {

			p.addPymntRecncliatnDtlIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(paymentreconciliationdetailidentifierperiod.getStart())+"\"");
		} else {
			p.addPymntRecncliatnDtlIdPrdStrt("NULL");
		}

		if(paymentreconciliationdetaili == paymentreconciliationdetaillist.size()-1) {p.addPymntRecncliatnDtlIdPrdStrt("]");}


		/******************** PymntRecncliatn_Dtl_Id_Prd_End ********************************************************************************/
		if(paymentreconciliationdetaili == 0) {p.addPymntRecncliatnDtlIdPrdEnd("[");}
		if(paymentreconciliationdetailidentifierperiod.hasEnd()) {

			p.addPymntRecncliatnDtlIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(paymentreconciliationdetailidentifierperiod.getEnd())+"\"");
		} else {
			p.addPymntRecncliatnDtlIdPrdEnd("NULL");
		}

		if(paymentreconciliationdetaili == paymentreconciliationdetaillist.size()-1) {p.addPymntRecncliatnDtlIdPrdEnd("]");}


		/******************** paymentreconciliationdetailidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse paymentreconciliationdetailidentifieruse = paymentreconciliationdetailidentifier.getUse();
		if(paymentreconciliationdetailidentifieruse!=null) {
		if(paymentreconciliationdetaili == 0) {

		p.addPymntRecncliatnDtlIdUse("[");		}
			p.addPymntRecncliatnDtlIdUse(paymentreconciliationdetailidentifieruse.toCode());
		if(paymentreconciliationdetaili == paymentreconciliationdetaillist.size()-1) {

		p.addPymntRecncliatnDtlIdUse("]");		}

		} else {
			p.addPymntRecncliatnDtlIdUse("NULL");
		}

		/******************** PymntRecncliatn_Dtl_Id_Assigner ********************************************************************************/
		if(paymentreconciliationdetaili == 0) {p.addPymntRecncliatnDtlIdAssigner("[");}
		if(paymentreconciliationdetailidentifier.hasAssigner()) {

			if(paymentreconciliationdetailidentifier.getAssigner().getReference() != null) {
			p.addPymntRecncliatnDtlIdAssigner(paymentreconciliationdetailidentifier.getAssigner().getReference());
			}
		} else {
			p.addPymntRecncliatnDtlIdAssigner("NULL");
		}

		if(paymentreconciliationdetaili == paymentreconciliationdetaillist.size()-1) {p.addPymntRecncliatnDtlIdAssigner("]");}


		/******************** PymntRecncliatn_Dtl_Id_Sys ********************************************************************************/
		if(paymentreconciliationdetaili == 0) {p.addPymntRecncliatnDtlIdSys("[");}
		if(paymentreconciliationdetailidentifier.hasSystem()) {

			p.addPymntRecncliatnDtlIdSys(String.valueOf(paymentreconciliationdetailidentifier.getSystem()));
		} else {
			p.addPymntRecncliatnDtlIdSys("NULL");
		}

		if(paymentreconciliationdetaili == paymentreconciliationdetaillist.size()-1) {p.addPymntRecncliatnDtlIdSys("]");}


		/******************** PymntRecncliatn_Dtl_Rsps ********************************************************************************/
		if(paymentreconciliationdetaili == 0) {p.addPymntRecncliatnDtlRsps("[");}
		if(paymentreconciliationdetail.hasResponse()) {

			if(paymentreconciliationdetail.getResponse().getReference() != null) {
			p.addPymntRecncliatnDtlRsps(paymentreconciliationdetail.getResponse().getReference());
			}
		} else {
			p.addPymntRecncliatnDtlRsps("NULL");
		}

		if(paymentreconciliationdetaili == paymentreconciliationdetaillist.size()-1) {p.addPymntRecncliatnDtlRsps("]");}


		/******************** PymntRecncliatn_Dtl_Payee ********************************************************************************/
		if(paymentreconciliationdetaili == 0) {p.addPymntRecncliatnDtlPayee("[");}
		if(paymentreconciliationdetail.hasPayee()) {

			if(paymentreconciliationdetail.getPayee().getReference() != null) {
			p.addPymntRecncliatnDtlPayee(paymentreconciliationdetail.getPayee().getReference());
			}
		} else {
			p.addPymntRecncliatnDtlPayee("NULL");
		}

		if(paymentreconciliationdetaili == paymentreconciliationdetaillist.size()-1) {p.addPymntRecncliatnDtlPayee("]");}


		/******************** paymentreconciliationdetailamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money paymentreconciliationdetailamount = paymentreconciliationdetail.getAmount();

		/******************** PymntRecncliatn_Dtl_Amnt_Vl ********************************************************************************/
		if(paymentreconciliationdetaili == 0) {p.addPymntRecncliatnDtlAmntVl("[");}
		if(paymentreconciliationdetailamount.hasValue()) {

			p.addPymntRecncliatnDtlAmntVl(String.valueOf(paymentreconciliationdetailamount.getValue()));
		} else {
			p.addPymntRecncliatnDtlAmntVl("NULL");
		}

		if(paymentreconciliationdetaili == paymentreconciliationdetaillist.size()-1) {p.addPymntRecncliatnDtlAmntVl("]");}


		/******************** PymntRecncliatn_Dtl_Amnt_Crncy ********************************************************************************/
		if(paymentreconciliationdetaili == 0) {p.addPymntRecncliatnDtlAmntCrncy("[");}
		if(paymentreconciliationdetailamount.hasCurrency()) {

			p.addPymntRecncliatnDtlAmntCrncy(String.valueOf(paymentreconciliationdetailamount.getCurrency()));
		} else {
			p.addPymntRecncliatnDtlAmntCrncy("NULL");
		}

		if(paymentreconciliationdetaili == paymentreconciliationdetaillist.size()-1) {p.addPymntRecncliatnDtlAmntCrncy("]");}


		/******************** PymntRecncliatn_Dtl_Submitter ********************************************************************************/
		if(paymentreconciliationdetaili == 0) {p.addPymntRecncliatnDtlSubmitter("[");}
		if(paymentreconciliationdetail.hasSubmitter()) {

			if(paymentreconciliationdetail.getSubmitter().getReference() != null) {
			p.addPymntRecncliatnDtlSubmitter(paymentreconciliationdetail.getSubmitter().getReference());
			}
		} else {
			p.addPymntRecncliatnDtlSubmitter("NULL");
		}

		if(paymentreconciliationdetaili == paymentreconciliationdetaillist.size()-1) {p.addPymntRecncliatnDtlSubmitter("]");}


		/******************** paymentreconciliationdetailpredecessor ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier paymentreconciliationdetailpredecessor = paymentreconciliationdetail.getPredecessor();

		/******************** PymntRecncliatn_Dtl_Predecessor_Vl ********************************************************************************/
		if(paymentreconciliationdetaili == 0) {p.addPymntRecncliatnDtlPredecessorVl("[");}
		if(paymentreconciliationdetailpredecessor.hasValue()) {

			p.addPymntRecncliatnDtlPredecessorVl(String.valueOf(paymentreconciliationdetailpredecessor.getValue()));
		} else {
			p.addPymntRecncliatnDtlPredecessorVl("NULL");
		}

		if(paymentreconciliationdetaili == paymentreconciliationdetaillist.size()-1) {p.addPymntRecncliatnDtlPredecessorVl("]");}


		/******************** paymentreconciliationdetailpredecessortype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept paymentreconciliationdetailpredecessortype = paymentreconciliationdetailpredecessor.getType();

		/******************** PymntRecncliatn_Dtl_Predecessor_Typ_Txt ********************************************************************************/
		if(paymentreconciliationdetaili == 0) {p.addPymntRecncliatnDtlPredecessorTypTxt("[");}
		if(paymentreconciliationdetailpredecessortype.hasText()) {

			p.addPymntRecncliatnDtlPredecessorTypTxt(String.valueOf(paymentreconciliationdetailpredecessortype.getText()));
		} else {
			p.addPymntRecncliatnDtlPredecessorTypTxt("NULL");
		}

		if(paymentreconciliationdetaili == paymentreconciliationdetaillist.size()-1) {p.addPymntRecncliatnDtlPredecessorTypTxt("]");}


		/******************** paymentreconciliationdetailpredecessortypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> paymentreconciliationdetailpredecessortypecodinglist = paymentreconciliationdetailpredecessortype.getCoding();
		for(int paymentreconciliationdetailpredecessortypecodingi = 0; paymentreconciliationdetailpredecessortypecodingi<paymentreconciliationdetailpredecessortypecodinglist.size();paymentreconciliationdetailpredecessortypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  paymentreconciliationdetailpredecessortypecoding = paymentreconciliationdetailpredecessortypecodinglist.get(paymentreconciliationdetailpredecessortypecodingi);

		/******************** PymntRecncliatn_Dtl_Predecessor_Typ_Cdg_Dsply ********************************************************************************/
		if(paymentreconciliationdetailpredecessortypecodingi == 0) {p.addPymntRecncliatnDtlPredecessorTypCdgDsply("[[");}
		if(paymentreconciliationdetailpredecessortypecoding.hasDisplay()) {

			p.addPymntRecncliatnDtlPredecessorTypCdgDsply(String.valueOf(paymentreconciliationdetailpredecessortypecoding.getDisplay()));
		} else {
			p.addPymntRecncliatnDtlPredecessorTypCdgDsply("NULL");
		}

		if(paymentreconciliationdetailpredecessortypecodingi == paymentreconciliationdetailpredecessortypecodinglist.size()-1) {p.addPymntRecncliatnDtlPredecessorTypCdgDsply("]]");}


		/******************** PymntRecncliatn_Dtl_Predecessor_Typ_Cdg_Vrsn ********************************************************************************/
		if(paymentreconciliationdetailpredecessortypecodingi == 0) {p.addPymntRecncliatnDtlPredecessorTypCdgVrsn("[[");}
		if(paymentreconciliationdetailpredecessortypecoding.hasVersion()) {

			p.addPymntRecncliatnDtlPredecessorTypCdgVrsn(String.valueOf(paymentreconciliationdetailpredecessortypecoding.getVersion()));
		} else {
			p.addPymntRecncliatnDtlPredecessorTypCdgVrsn("NULL");
		}

		if(paymentreconciliationdetailpredecessortypecodingi == paymentreconciliationdetailpredecessortypecodinglist.size()-1) {p.addPymntRecncliatnDtlPredecessorTypCdgVrsn("]]");}


		/******************** PymntRecncliatn_Dtl_Predecessor_Typ_Cdg_Cd ********************************************************************************/
		if(paymentreconciliationdetailpredecessortypecodingi == 0) {p.addPymntRecncliatnDtlPredecessorTypCdgCd("[[");}
		if(paymentreconciliationdetailpredecessortypecoding.hasCode()) {

			p.addPymntRecncliatnDtlPredecessorTypCdgCd(String.valueOf(paymentreconciliationdetailpredecessortypecoding.getCode()));
		} else {
			p.addPymntRecncliatnDtlPredecessorTypCdgCd("NULL");
		}

		if(paymentreconciliationdetailpredecessortypecodingi == paymentreconciliationdetailpredecessortypecodinglist.size()-1) {p.addPymntRecncliatnDtlPredecessorTypCdgCd("]]");}


		/******************** PymntRecncliatn_Dtl_Predecessor_Typ_Cdg_UsrSltd ********************************************************************************/
		if(paymentreconciliationdetailpredecessortypecodingi == 0) {p.addPymntRecncliatnDtlPredecessorTypCdgUsrSltd("[[");}
		if(paymentreconciliationdetailpredecessortypecoding.hasUserSelected()) {

			p.addPymntRecncliatnDtlPredecessorTypCdgUsrSltd(String.valueOf(paymentreconciliationdetailpredecessortypecoding.getUserSelected()));
		} else {
			p.addPymntRecncliatnDtlPredecessorTypCdgUsrSltd("NULL");
		}

		if(paymentreconciliationdetailpredecessortypecodingi == paymentreconciliationdetailpredecessortypecodinglist.size()-1) {p.addPymntRecncliatnDtlPredecessorTypCdgUsrSltd("]]");}


		/******************** PymntRecncliatn_Dtl_Predecessor_Typ_Cdg_Sys ********************************************************************************/
		if(paymentreconciliationdetailpredecessortypecodingi == 0) {p.addPymntRecncliatnDtlPredecessorTypCdgSys("[[");}
		if(paymentreconciliationdetailpredecessortypecoding.hasSystem()) {

			p.addPymntRecncliatnDtlPredecessorTypCdgSys(String.valueOf(paymentreconciliationdetailpredecessortypecoding.getSystem()));
		} else {
			p.addPymntRecncliatnDtlPredecessorTypCdgSys("NULL");
		}

		if(paymentreconciliationdetailpredecessortypecodingi == paymentreconciliationdetailpredecessortypecodinglist.size()-1) {p.addPymntRecncliatnDtlPredecessorTypCdgSys("]]");}


		 };
		/******************** paymentreconciliationdetailpredecessorperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period paymentreconciliationdetailpredecessorperiod = paymentreconciliationdetailpredecessor.getPeriod();

		/******************** PymntRecncliatn_Dtl_Predecessor_Prd_Strt ********************************************************************************/
		if(paymentreconciliationdetaili == 0) {p.addPymntRecncliatnDtlPredecessorPrdStrt("[");}
		if(paymentreconciliationdetailpredecessorperiod.hasStart()) {

			p.addPymntRecncliatnDtlPredecessorPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(paymentreconciliationdetailpredecessorperiod.getStart())+"\"");
		} else {
			p.addPymntRecncliatnDtlPredecessorPrdStrt("NULL");
		}

		if(paymentreconciliationdetaili == paymentreconciliationdetaillist.size()-1) {p.addPymntRecncliatnDtlPredecessorPrdStrt("]");}


		/******************** PymntRecncliatn_Dtl_Predecessor_Prd_End ********************************************************************************/
		if(paymentreconciliationdetaili == 0) {p.addPymntRecncliatnDtlPredecessorPrdEnd("[");}
		if(paymentreconciliationdetailpredecessorperiod.hasEnd()) {

			p.addPymntRecncliatnDtlPredecessorPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(paymentreconciliationdetailpredecessorperiod.getEnd())+"\"");
		} else {
			p.addPymntRecncliatnDtlPredecessorPrdEnd("NULL");
		}

		if(paymentreconciliationdetaili == paymentreconciliationdetaillist.size()-1) {p.addPymntRecncliatnDtlPredecessorPrdEnd("]");}


		/******************** paymentreconciliationdetailpredecessoruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse paymentreconciliationdetailpredecessoruse = paymentreconciliationdetailpredecessor.getUse();
		if(paymentreconciliationdetailpredecessoruse!=null) {
		if(paymentreconciliationdetaili == 0) {

		p.addPymntRecncliatnDtlPredecessorUse("[");		}
			p.addPymntRecncliatnDtlPredecessorUse(paymentreconciliationdetailpredecessoruse.toCode());
		if(paymentreconciliationdetaili == paymentreconciliationdetaillist.size()-1) {

		p.addPymntRecncliatnDtlPredecessorUse("]");		}

		} else {
			p.addPymntRecncliatnDtlPredecessorUse("NULL");
		}

		/******************** PymntRecncliatn_Dtl_Predecessor_Assigner ********************************************************************************/
		if(paymentreconciliationdetaili == 0) {p.addPymntRecncliatnDtlPredecessorAssigner("[");}
		if(paymentreconciliationdetailpredecessor.hasAssigner()) {

			if(paymentreconciliationdetailpredecessor.getAssigner().getReference() != null) {
			p.addPymntRecncliatnDtlPredecessorAssigner(paymentreconciliationdetailpredecessor.getAssigner().getReference());
			}
		} else {
			p.addPymntRecncliatnDtlPredecessorAssigner("NULL");
		}

		if(paymentreconciliationdetaili == paymentreconciliationdetaillist.size()-1) {p.addPymntRecncliatnDtlPredecessorAssigner("]");}


		/******************** PymntRecncliatn_Dtl_Predecessor_Sys ********************************************************************************/
		if(paymentreconciliationdetaili == 0) {p.addPymntRecncliatnDtlPredecessorSys("[");}
		if(paymentreconciliationdetailpredecessor.hasSystem()) {

			p.addPymntRecncliatnDtlPredecessorSys(String.valueOf(paymentreconciliationdetailpredecessor.getSystem()));
		} else {
			p.addPymntRecncliatnDtlPredecessorSys("NULL");
		}

		if(paymentreconciliationdetaili == paymentreconciliationdetaillist.size()-1) {p.addPymntRecncliatnDtlPredecessorSys("]");}


		/******************** PymntRecncliatn_Dtl_Responsible ********************************************************************************/
		if(paymentreconciliationdetaili == 0) {p.addPymntRecncliatnDtlResponsible("[");}
		if(paymentreconciliationdetail.hasResponsible()) {

			if(paymentreconciliationdetail.getResponsible().getReference() != null) {
			p.addPymntRecncliatnDtlResponsible(paymentreconciliationdetail.getResponsible().getReference());
			}
		} else {
			p.addPymntRecncliatnDtlResponsible("NULL");
		}

		if(paymentreconciliationdetaili == paymentreconciliationdetaillist.size()-1) {p.addPymntRecncliatnDtlResponsible("]");}


		 };
		/******************** paymentreconciliationpaymentamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money paymentreconciliationpaymentamount = paymentreconciliation.getPaymentAmount();

		/******************** PymntRecncliatn_PymntAmnt_Vl ********************************************************************************/
		if(paymentreconciliationpaymentamount.hasValue()) {

			p.addPymntRecncliatnPymntAmntVl(String.valueOf(paymentreconciliationpaymentamount.getValue()));
		} else {
			p.addPymntRecncliatnPymntAmntVl("NULL");
		}


		/******************** PymntRecncliatn_PymntAmnt_Crncy ********************************************************************************/
		if(paymentreconciliationpaymentamount.hasCurrency()) {

			p.addPymntRecncliatnPymntAmntCrncy(String.valueOf(paymentreconciliationpaymentamount.getCurrency()));
		} else {
			p.addPymntRecncliatnPymntAmntCrncy("NULL");
		}


		/******************** PymntRecncliatn_PymntDt ********************************************************************************/
		if(paymentreconciliation.hasPaymentDate()) {

			p.addPymntRecncliatnPymntDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(paymentreconciliation.getPaymentDate())+"\"");
		} else {
			p.addPymntRecncliatnPymntDt("NULL");
		}


		/******************** paymentreconciliationoutcome ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.RemittanceOutcome paymentreconciliationoutcome = paymentreconciliation.getOutcome();
		if(paymentreconciliationoutcome!=null) {
			p.addPymntRecncliatnOutcome(paymentreconciliationoutcome.toCode());
		} else {
			p.addPymntRecncliatnOutcome("NULL");
		}

		/******************** PymntRecncliatn_Rqstor ********************************************************************************/
		if(paymentreconciliation.hasRequestor()) {

			if(paymentreconciliation.getRequestor().getReference() != null) {
			p.addPymntRecncliatnRqstor(paymentreconciliation.getRequestor().getReference());
			}
		} else {
			p.addPymntRecncliatnRqstor("NULL");
		}


		/******************** paymentreconciliationformcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept paymentreconciliationformcode = paymentreconciliation.getFormCode();

		/******************** PymntRecncliatn_FrmCd_Txt ********************************************************************************/
		if(paymentreconciliationformcode.hasText()) {

			p.addPymntRecncliatnFrmCdTxt(String.valueOf(paymentreconciliationformcode.getText()));
		} else {
			p.addPymntRecncliatnFrmCdTxt("NULL");
		}


		/******************** paymentreconciliationformcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> paymentreconciliationformcodecodinglist = paymentreconciliationformcode.getCoding();
		for(int paymentreconciliationformcodecodingi = 0; paymentreconciliationformcodecodingi<paymentreconciliationformcodecodinglist.size();paymentreconciliationformcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  paymentreconciliationformcodecoding = paymentreconciliationformcodecodinglist.get(paymentreconciliationformcodecodingi);

		/******************** PymntRecncliatn_FrmCd_Cdg_Dsply ********************************************************************************/
		if(paymentreconciliationformcodecodingi == 0) {p.addPymntRecncliatnFrmCdCdgDsply("[");}
		if(paymentreconciliationformcodecoding.hasDisplay()) {

			p.addPymntRecncliatnFrmCdCdgDsply(String.valueOf(paymentreconciliationformcodecoding.getDisplay()));
		} else {
			p.addPymntRecncliatnFrmCdCdgDsply("NULL");
		}

		if(paymentreconciliationformcodecodingi == paymentreconciliationformcodecodinglist.size()-1) {p.addPymntRecncliatnFrmCdCdgDsply("]");}


		/******************** PymntRecncliatn_FrmCd_Cdg_Vrsn ********************************************************************************/
		if(paymentreconciliationformcodecodingi == 0) {p.addPymntRecncliatnFrmCdCdgVrsn("[");}
		if(paymentreconciliationformcodecoding.hasVersion()) {

			p.addPymntRecncliatnFrmCdCdgVrsn(String.valueOf(paymentreconciliationformcodecoding.getVersion()));
		} else {
			p.addPymntRecncliatnFrmCdCdgVrsn("NULL");
		}

		if(paymentreconciliationformcodecodingi == paymentreconciliationformcodecodinglist.size()-1) {p.addPymntRecncliatnFrmCdCdgVrsn("]");}


		/******************** PymntRecncliatn_FrmCd_Cdg_Cd ********************************************************************************/
		if(paymentreconciliationformcodecodingi == 0) {p.addPymntRecncliatnFrmCdCdgCd("[");}
		if(paymentreconciliationformcodecoding.hasCode()) {

			p.addPymntRecncliatnFrmCdCdgCd(String.valueOf(paymentreconciliationformcodecoding.getCode()));
		} else {
			p.addPymntRecncliatnFrmCdCdgCd("NULL");
		}

		if(paymentreconciliationformcodecodingi == paymentreconciliationformcodecodinglist.size()-1) {p.addPymntRecncliatnFrmCdCdgCd("]");}


		/******************** PymntRecncliatn_FrmCd_Cdg_UsrSltd ********************************************************************************/
		if(paymentreconciliationformcodecodingi == 0) {p.addPymntRecncliatnFrmCdCdgUsrSltd("[");}
		if(paymentreconciliationformcodecoding.hasUserSelected()) {

			p.addPymntRecncliatnFrmCdCdgUsrSltd(String.valueOf(paymentreconciliationformcodecoding.getUserSelected()));
		} else {
			p.addPymntRecncliatnFrmCdCdgUsrSltd("NULL");
		}

		if(paymentreconciliationformcodecodingi == paymentreconciliationformcodecodinglist.size()-1) {p.addPymntRecncliatnFrmCdCdgUsrSltd("]");}


		/******************** PymntRecncliatn_FrmCd_Cdg_Sys ********************************************************************************/
		if(paymentreconciliationformcodecodingi == 0) {p.addPymntRecncliatnFrmCdCdgSys("[");}
		if(paymentreconciliationformcodecoding.hasSystem()) {

			p.addPymntRecncliatnFrmCdCdgSys(String.valueOf(paymentreconciliationformcodecoding.getSystem()));
		} else {
			p.addPymntRecncliatnFrmCdCdgSys("NULL");
		}

		if(paymentreconciliationformcodecodingi == paymentreconciliationformcodecodinglist.size()-1) {p.addPymntRecncliatnFrmCdCdgSys("]");}


		 };
		/******************** paymentreconciliationprocessnote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.PaymentReconciliation.NotesComponent> paymentreconciliationprocessnotelist = paymentreconciliation.getProcessNote();
		for(int paymentreconciliationprocessnotei = 0; paymentreconciliationprocessnotei<paymentreconciliationprocessnotelist.size();paymentreconciliationprocessnotei++ ) {
		org.hl7.fhir.r4.model.PaymentReconciliation.NotesComponent  paymentreconciliationprocessnote = paymentreconciliationprocessnotelist.get(paymentreconciliationprocessnotei);

		/******************** paymentreconciliationprocessnotetype ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.NoteType paymentreconciliationprocessnotetype = paymentreconciliationprocessnote.getType();
		if(paymentreconciliationprocessnotetype!=null) {
		if(paymentreconciliationprocessnotei == 0) {

		p.addPymntRecncliatnProcessNtTyp("[");		}
			p.addPymntRecncliatnProcessNtTyp(paymentreconciliationprocessnotetype.toCode());
		if(paymentreconciliationprocessnotei == paymentreconciliationprocessnotelist.size()-1) {

		p.addPymntRecncliatnProcessNtTyp("]");		}

		} else {
			p.addPymntRecncliatnProcessNtTyp("NULL");
		}

		/******************** PymntRecncliatn_ProcessNt_Txt ********************************************************************************/
		if(paymentreconciliationprocessnotei == 0) {p.addPymntRecncliatnProcessNtTxt("[");}
		if(paymentreconciliationprocessnote.hasText()) {

			p.addPymntRecncliatnProcessNtTxt(String.valueOf(paymentreconciliationprocessnote.getText()));
		} else {
			p.addPymntRecncliatnProcessNtTxt("NULL");
		}

		if(paymentreconciliationprocessnotei == paymentreconciliationprocessnotelist.size()-1) {p.addPymntRecncliatnProcessNtTxt("]");}


		 };
		/******************** paymentreconciliationpaymentidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier paymentreconciliationpaymentidentifier = paymentreconciliation.getPaymentIdentifier();

		/******************** PymntRecncliatn_PymntId_Vl ********************************************************************************/
		if(paymentreconciliationpaymentidentifier.hasValue()) {

			p.addPymntRecncliatnPymntIdVl(String.valueOf(paymentreconciliationpaymentidentifier.getValue()));
		} else {
			p.addPymntRecncliatnPymntIdVl("NULL");
		}


		/******************** paymentreconciliationpaymentidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept paymentreconciliationpaymentidentifiertype = paymentreconciliationpaymentidentifier.getType();

		/******************** PymntRecncliatn_PymntId_Typ_Txt ********************************************************************************/
		if(paymentreconciliationpaymentidentifiertype.hasText()) {

			p.addPymntRecncliatnPymntIdTypTxt(String.valueOf(paymentreconciliationpaymentidentifiertype.getText()));
		} else {
			p.addPymntRecncliatnPymntIdTypTxt("NULL");
		}


		/******************** paymentreconciliationpaymentidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> paymentreconciliationpaymentidentifiertypecodinglist = paymentreconciliationpaymentidentifiertype.getCoding();
		for(int paymentreconciliationpaymentidentifiertypecodingi = 0; paymentreconciliationpaymentidentifiertypecodingi<paymentreconciliationpaymentidentifiertypecodinglist.size();paymentreconciliationpaymentidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  paymentreconciliationpaymentidentifiertypecoding = paymentreconciliationpaymentidentifiertypecodinglist.get(paymentreconciliationpaymentidentifiertypecodingi);

		/******************** PymntRecncliatn_PymntId_Typ_Cdg_Dsply ********************************************************************************/
		if(paymentreconciliationpaymentidentifiertypecodingi == 0) {p.addPymntRecncliatnPymntIdTypCdgDsply("[");}
		if(paymentreconciliationpaymentidentifiertypecoding.hasDisplay()) {

			p.addPymntRecncliatnPymntIdTypCdgDsply(String.valueOf(paymentreconciliationpaymentidentifiertypecoding.getDisplay()));
		} else {
			p.addPymntRecncliatnPymntIdTypCdgDsply("NULL");
		}

		if(paymentreconciliationpaymentidentifiertypecodingi == paymentreconciliationpaymentidentifiertypecodinglist.size()-1) {p.addPymntRecncliatnPymntIdTypCdgDsply("]");}


		/******************** PymntRecncliatn_PymntId_Typ_Cdg_Vrsn ********************************************************************************/
		if(paymentreconciliationpaymentidentifiertypecodingi == 0) {p.addPymntRecncliatnPymntIdTypCdgVrsn("[");}
		if(paymentreconciliationpaymentidentifiertypecoding.hasVersion()) {

			p.addPymntRecncliatnPymntIdTypCdgVrsn(String.valueOf(paymentreconciliationpaymentidentifiertypecoding.getVersion()));
		} else {
			p.addPymntRecncliatnPymntIdTypCdgVrsn("NULL");
		}

		if(paymentreconciliationpaymentidentifiertypecodingi == paymentreconciliationpaymentidentifiertypecodinglist.size()-1) {p.addPymntRecncliatnPymntIdTypCdgVrsn("]");}


		/******************** PymntRecncliatn_PymntId_Typ_Cdg_Cd ********************************************************************************/
		if(paymentreconciliationpaymentidentifiertypecodingi == 0) {p.addPymntRecncliatnPymntIdTypCdgCd("[");}
		if(paymentreconciliationpaymentidentifiertypecoding.hasCode()) {

			p.addPymntRecncliatnPymntIdTypCdgCd(String.valueOf(paymentreconciliationpaymentidentifiertypecoding.getCode()));
		} else {
			p.addPymntRecncliatnPymntIdTypCdgCd("NULL");
		}

		if(paymentreconciliationpaymentidentifiertypecodingi == paymentreconciliationpaymentidentifiertypecodinglist.size()-1) {p.addPymntRecncliatnPymntIdTypCdgCd("]");}


		/******************** PymntRecncliatn_PymntId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(paymentreconciliationpaymentidentifiertypecodingi == 0) {p.addPymntRecncliatnPymntIdTypCdgUsrSltd("[");}
		if(paymentreconciliationpaymentidentifiertypecoding.hasUserSelected()) {

			p.addPymntRecncliatnPymntIdTypCdgUsrSltd(String.valueOf(paymentreconciliationpaymentidentifiertypecoding.getUserSelected()));
		} else {
			p.addPymntRecncliatnPymntIdTypCdgUsrSltd("NULL");
		}

		if(paymentreconciliationpaymentidentifiertypecodingi == paymentreconciliationpaymentidentifiertypecodinglist.size()-1) {p.addPymntRecncliatnPymntIdTypCdgUsrSltd("]");}


		/******************** PymntRecncliatn_PymntId_Typ_Cdg_Sys ********************************************************************************/
		if(paymentreconciliationpaymentidentifiertypecodingi == 0) {p.addPymntRecncliatnPymntIdTypCdgSys("[");}
		if(paymentreconciliationpaymentidentifiertypecoding.hasSystem()) {

			p.addPymntRecncliatnPymntIdTypCdgSys(String.valueOf(paymentreconciliationpaymentidentifiertypecoding.getSystem()));
		} else {
			p.addPymntRecncliatnPymntIdTypCdgSys("NULL");
		}

		if(paymentreconciliationpaymentidentifiertypecodingi == paymentreconciliationpaymentidentifiertypecodinglist.size()-1) {p.addPymntRecncliatnPymntIdTypCdgSys("]");}


		 };
		/******************** paymentreconciliationpaymentidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period paymentreconciliationpaymentidentifierperiod = paymentreconciliationpaymentidentifier.getPeriod();

		/******************** PymntRecncliatn_PymntId_Prd_Strt ********************************************************************************/
		if(paymentreconciliationpaymentidentifierperiod.hasStart()) {

			p.addPymntRecncliatnPymntIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(paymentreconciliationpaymentidentifierperiod.getStart())+"\"");
		} else {
			p.addPymntRecncliatnPymntIdPrdStrt("NULL");
		}


		/******************** PymntRecncliatn_PymntId_Prd_End ********************************************************************************/
		if(paymentreconciliationpaymentidentifierperiod.hasEnd()) {

			p.addPymntRecncliatnPymntIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(paymentreconciliationpaymentidentifierperiod.getEnd())+"\"");
		} else {
			p.addPymntRecncliatnPymntIdPrdEnd("NULL");
		}


		/******************** paymentreconciliationpaymentidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse paymentreconciliationpaymentidentifieruse = paymentreconciliationpaymentidentifier.getUse();
		if(paymentreconciliationpaymentidentifieruse!=null) {
			p.addPymntRecncliatnPymntIdUse(paymentreconciliationpaymentidentifieruse.toCode());
		} else {
			p.addPymntRecncliatnPymntIdUse("NULL");
		}

		/******************** PymntRecncliatn_PymntId_Assigner ********************************************************************************/
		if(paymentreconciliationpaymentidentifier.hasAssigner()) {

			if(paymentreconciliationpaymentidentifier.getAssigner().getReference() != null) {
			p.addPymntRecncliatnPymntIdAssigner(paymentreconciliationpaymentidentifier.getAssigner().getReference());
			}
		} else {
			p.addPymntRecncliatnPymntIdAssigner("NULL");
		}


		/******************** PymntRecncliatn_PymntId_Sys ********************************************************************************/
		if(paymentreconciliationpaymentidentifier.hasSystem()) {

			p.addPymntRecncliatnPymntIdSys(String.valueOf(paymentreconciliationpaymentidentifier.getSystem()));
		} else {
			p.addPymntRecncliatnPymntIdSys("NULL");
		}


		return p;
	}
}
