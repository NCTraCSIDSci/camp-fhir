package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Invoice;
public class InvoiceBidirectionalConversion 
{
	public Invoice Invoices(org.hl7.fhir.r4.model.Invoice invoice) throws ParseException
	{
		 main.java.com.campfhir.model.Invoice i = new  main.java.com.campfhir.model.Invoice();

		/******************** id ********************************************************************************/
		i.setId(invoice.getIdElement().getIdPart());

		/******************** invoicetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept invoicetype = invoice.getType();

		/******************** Invce_Typ_Txt ********************************************************************************/
		if(invoicetype.hasText()) {

			i.addInvceTypTxt(String.valueOf(invoicetype.getText()));
		} else {
			i.addInvceTypTxt("NULL");
		}


		/******************** invoicetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> invoicetypecodinglist = invoicetype.getCoding();
		for(int invoicetypecodingi = 0; invoicetypecodingi<invoicetypecodinglist.size();invoicetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  invoicetypecoding = invoicetypecodinglist.get(invoicetypecodingi);

		/******************** Invce_Typ_Cdg_Dsply ********************************************************************************/
		if(invoicetypecodingi == 0) {i.addInvceTypCdgDsply("[");}
		if(invoicetypecoding.hasDisplay()) {

			i.addInvceTypCdgDsply(String.valueOf(invoicetypecoding.getDisplay()));
		} else {
			i.addInvceTypCdgDsply("NULL");
		}

		if(invoicetypecodingi == invoicetypecodinglist.size()-1) {i.addInvceTypCdgDsply("]");}


		/******************** Invce_Typ_Cdg_Vrsn ********************************************************************************/
		if(invoicetypecodingi == 0) {i.addInvceTypCdgVrsn("[");}
		if(invoicetypecoding.hasVersion()) {

			i.addInvceTypCdgVrsn(String.valueOf(invoicetypecoding.getVersion()));
		} else {
			i.addInvceTypCdgVrsn("NULL");
		}

		if(invoicetypecodingi == invoicetypecodinglist.size()-1) {i.addInvceTypCdgVrsn("]");}


		/******************** Invce_Typ_Cdg_Cd ********************************************************************************/
		if(invoicetypecodingi == 0) {i.addInvceTypCdgCd("[");}
		if(invoicetypecoding.hasCode()) {

			i.addInvceTypCdgCd(String.valueOf(invoicetypecoding.getCode()));
		} else {
			i.addInvceTypCdgCd("NULL");
		}

		if(invoicetypecodingi == invoicetypecodinglist.size()-1) {i.addInvceTypCdgCd("]");}


		/******************** Invce_Typ_Cdg_UsrSltd ********************************************************************************/
		if(invoicetypecodingi == 0) {i.addInvceTypCdgUsrSltd("[");}
		if(invoicetypecoding.hasUserSelected()) {

			i.addInvceTypCdgUsrSltd(String.valueOf(invoicetypecoding.getUserSelected()));
		} else {
			i.addInvceTypCdgUsrSltd("NULL");
		}

		if(invoicetypecodingi == invoicetypecodinglist.size()-1) {i.addInvceTypCdgUsrSltd("]");}


		/******************** Invce_Typ_Cdg_Sys ********************************************************************************/
		if(invoicetypecodingi == 0) {i.addInvceTypCdgSys("[");}
		if(invoicetypecoding.hasSystem()) {

			i.addInvceTypCdgSys(String.valueOf(invoicetypecoding.getSystem()));
		} else {
			i.addInvceTypCdgSys("NULL");
		}

		if(invoicetypecodingi == invoicetypecodinglist.size()-1) {i.addInvceTypCdgSys("]");}


		 };
		/******************** Invce_Dt ********************************************************************************/
		if(invoice.hasDate()) {

			i.addInvceDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(invoice.getDate())+"\"");
		} else {
			i.addInvceDt("NULL");
		}


		/******************** Invce_Sbjct ********************************************************************************/
		if(invoice.hasSubject()) {

			if(invoice.getSubject().getReference() != null) {
			i.addInvceSbjct(invoice.getSubject().getReference());
			}
		} else {
			i.addInvceSbjct("NULL");
		}


		/******************** invoicestatus ********************************************************************************/
		org.hl7.fhir.r4.model.Invoice.InvoiceStatus invoicestatus = invoice.getStatus();
		if(invoicestatus!=null) {
			i.addInvceSts(invoicestatus.toCode());
		} else {
			i.addInvceSts("NULL");
		}

		/******************** invoicenote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> invoicenotelist = invoice.getNote();
		for(int invoicenotei = 0; invoicenotei<invoicenotelist.size();invoicenotei++ ) {
		org.hl7.fhir.r4.model.Annotation  invoicenote = invoicenotelist.get(invoicenotei);

		/******************** Invce_Nt_Time ********************************************************************************/
		if(invoicenotei == 0) {i.addInvceNtTime("[");}
		if(invoicenote.hasTime()) {

			i.addInvceNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(invoicenote.getTime())+"\"");
		} else {
			i.addInvceNtTime("NULL");
		}

		if(invoicenotei == invoicenotelist.size()-1) {i.addInvceNtTime("]");}


		/******************** Invce_Nt_AthrRfrnc ********************************************************************************/
		if(invoicenotei == 0) {i.addInvceNtAthrRfrnc("[");}
		if(invoicenote.hasAuthorReference()) {

			if(invoicenote.getAuthorReference().getReference() != null) {
			i.addInvceNtAthrRfrnc(invoicenote.getAuthorReference().getReference());
			}
		} else {
			i.addInvceNtAthrRfrnc("NULL");
		}

		if(invoicenotei == invoicenotelist.size()-1) {i.addInvceNtAthrRfrnc("]");}


		/******************** Invce_Nt_Txt ********************************************************************************/
		if(invoicenotei == 0) {i.addInvceNtTxt("[");}
		if(invoicenote.hasText()) {

			i.addInvceNtTxt(String.valueOf(invoicenote.getText()));
		} else {
			i.addInvceNtTxt("NULL");
		}

		if(invoicenotei == invoicenotelist.size()-1) {i.addInvceNtTxt("]");}


		/******************** Invce_Nt_AthrStrgTyp ********************************************************************************/
		if(invoicenotei == 0) {i.addInvceNtAthrStrgTyp("[");}
		if(invoicenote.hasAuthorStringType()) {

			i.addInvceNtAthrStrgTyp("\""+invoicenote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			i.addInvceNtAthrStrgTyp("NULL");
		}

		if(invoicenotei == invoicenotelist.size()-1) {i.addInvceNtAthrStrgTyp("]");}


		 };
		/******************** invoiceidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> invoiceidentifierlist = invoice.getIdentifier();
		for(int invoiceidentifieri = 0; invoiceidentifieri<invoiceidentifierlist.size();invoiceidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  invoiceidentifier = invoiceidentifierlist.get(invoiceidentifieri);

		/******************** Invce_Id_Vl ********************************************************************************/
		if(invoiceidentifieri == 0) {i.addInvceIdVl("[");}
		if(invoiceidentifier.hasValue()) {

			i.addInvceIdVl(String.valueOf(invoiceidentifier.getValue()));
		} else {
			i.addInvceIdVl("NULL");
		}

		if(invoiceidentifieri == invoiceidentifierlist.size()-1) {i.addInvceIdVl("]");}


		/******************** invoiceidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept invoiceidentifiertype = invoiceidentifier.getType();

		/******************** Invce_Id_Typ_Txt ********************************************************************************/
		if(invoiceidentifieri == 0) {i.addInvceIdTypTxt("[");}
		if(invoiceidentifiertype.hasText()) {

			i.addInvceIdTypTxt(String.valueOf(invoiceidentifiertype.getText()));
		} else {
			i.addInvceIdTypTxt("NULL");
		}

		if(invoiceidentifieri == invoiceidentifierlist.size()-1) {i.addInvceIdTypTxt("]");}


		/******************** invoiceidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> invoiceidentifiertypecodinglist = invoiceidentifiertype.getCoding();
		for(int invoiceidentifiertypecodingi = 0; invoiceidentifiertypecodingi<invoiceidentifiertypecodinglist.size();invoiceidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  invoiceidentifiertypecoding = invoiceidentifiertypecodinglist.get(invoiceidentifiertypecodingi);

		/******************** Invce_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(invoiceidentifiertypecodingi == 0) {i.addInvceIdTypCdgDsply("[[");}
		if(invoiceidentifiertypecoding.hasDisplay()) {

			i.addInvceIdTypCdgDsply(String.valueOf(invoiceidentifiertypecoding.getDisplay()));
		} else {
			i.addInvceIdTypCdgDsply("NULL");
		}

		if(invoiceidentifiertypecodingi == invoiceidentifiertypecodinglist.size()-1) {i.addInvceIdTypCdgDsply("]]");}


		/******************** Invce_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(invoiceidentifiertypecodingi == 0) {i.addInvceIdTypCdgVrsn("[[");}
		if(invoiceidentifiertypecoding.hasVersion()) {

			i.addInvceIdTypCdgVrsn(String.valueOf(invoiceidentifiertypecoding.getVersion()));
		} else {
			i.addInvceIdTypCdgVrsn("NULL");
		}

		if(invoiceidentifiertypecodingi == invoiceidentifiertypecodinglist.size()-1) {i.addInvceIdTypCdgVrsn("]]");}


		/******************** Invce_Id_Typ_Cdg_Cd ********************************************************************************/
		if(invoiceidentifiertypecodingi == 0) {i.addInvceIdTypCdgCd("[[");}
		if(invoiceidentifiertypecoding.hasCode()) {

			i.addInvceIdTypCdgCd(String.valueOf(invoiceidentifiertypecoding.getCode()));
		} else {
			i.addInvceIdTypCdgCd("NULL");
		}

		if(invoiceidentifiertypecodingi == invoiceidentifiertypecodinglist.size()-1) {i.addInvceIdTypCdgCd("]]");}


		/******************** Invce_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(invoiceidentifiertypecodingi == 0) {i.addInvceIdTypCdgUsrSltd("[[");}
		if(invoiceidentifiertypecoding.hasUserSelected()) {

			i.addInvceIdTypCdgUsrSltd(String.valueOf(invoiceidentifiertypecoding.getUserSelected()));
		} else {
			i.addInvceIdTypCdgUsrSltd("NULL");
		}

		if(invoiceidentifiertypecodingi == invoiceidentifiertypecodinglist.size()-1) {i.addInvceIdTypCdgUsrSltd("]]");}


		/******************** Invce_Id_Typ_Cdg_Sys ********************************************************************************/
		if(invoiceidentifiertypecodingi == 0) {i.addInvceIdTypCdgSys("[[");}
		if(invoiceidentifiertypecoding.hasSystem()) {

			i.addInvceIdTypCdgSys(String.valueOf(invoiceidentifiertypecoding.getSystem()));
		} else {
			i.addInvceIdTypCdgSys("NULL");
		}

		if(invoiceidentifiertypecodingi == invoiceidentifiertypecodinglist.size()-1) {i.addInvceIdTypCdgSys("]]");}


		 };
		/******************** invoiceidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period invoiceidentifierperiod = invoiceidentifier.getPeriod();

		/******************** Invce_Id_Prd_Strt ********************************************************************************/
		if(invoiceidentifieri == 0) {i.addInvceIdPrdStrt("[");}
		if(invoiceidentifierperiod.hasStart()) {

			i.addInvceIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(invoiceidentifierperiod.getStart())+"\"");
		} else {
			i.addInvceIdPrdStrt("NULL");
		}

		if(invoiceidentifieri == invoiceidentifierlist.size()-1) {i.addInvceIdPrdStrt("]");}


		/******************** Invce_Id_Prd_End ********************************************************************************/
		if(invoiceidentifieri == 0) {i.addInvceIdPrdEnd("[");}
		if(invoiceidentifierperiod.hasEnd()) {

			i.addInvceIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(invoiceidentifierperiod.getEnd())+"\"");
		} else {
			i.addInvceIdPrdEnd("NULL");
		}

		if(invoiceidentifieri == invoiceidentifierlist.size()-1) {i.addInvceIdPrdEnd("]");}


		/******************** invoiceidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse invoiceidentifieruse = invoiceidentifier.getUse();
		if(invoiceidentifieruse!=null) {
		if(invoiceidentifieri == 0) {

		i.addInvceIdUse("[");		}
			i.addInvceIdUse(invoiceidentifieruse.toCode());
		if(invoiceidentifieri == invoiceidentifierlist.size()-1) {

		i.addInvceIdUse("]");		}

		} else {
			i.addInvceIdUse("NULL");
		}

		/******************** Invce_Id_Assigner ********************************************************************************/
		if(invoiceidentifieri == 0) {i.addInvceIdAssigner("[");}
		if(invoiceidentifier.hasAssigner()) {

			if(invoiceidentifier.getAssigner().getReference() != null) {
			i.addInvceIdAssigner(invoiceidentifier.getAssigner().getReference());
			}
		} else {
			i.addInvceIdAssigner("NULL");
		}

		if(invoiceidentifieri == invoiceidentifierlist.size()-1) {i.addInvceIdAssigner("]");}


		/******************** Invce_Id_Sys ********************************************************************************/
		if(invoiceidentifieri == 0) {i.addInvceIdSys("[");}
		if(invoiceidentifier.hasSystem()) {

			i.addInvceIdSys(String.valueOf(invoiceidentifier.getSystem()));
		} else {
			i.addInvceIdSys("NULL");
		}

		if(invoiceidentifieri == invoiceidentifierlist.size()-1) {i.addInvceIdSys("]");}


		 };
		/******************** invoicetotalpricecomponent ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Invoice.InvoiceLineItemPriceComponentComponent> invoicetotalpricecomponentlist = invoice.getTotalPriceComponent();
		for(int invoicetotalpricecomponenti = 0; invoicetotalpricecomponenti<invoicetotalpricecomponentlist.size();invoicetotalpricecomponenti++ ) {
		org.hl7.fhir.r4.model.Invoice.InvoiceLineItemPriceComponentComponent  invoicetotalpricecomponent = invoicetotalpricecomponentlist.get(invoicetotalpricecomponenti);

		/******************** invoicetotalpricecomponenttype ********************************************************************************/
		org.hl7.fhir.r4.model.Invoice.InvoicePriceComponentType invoicetotalpricecomponenttype = invoicetotalpricecomponent.getType();
		if(invoicetotalpricecomponenttype!=null) {
		if(invoicetotalpricecomponenti == 0) {

		i.addInvceTotalPriceCmpntTyp("[");		}
			i.addInvceTotalPriceCmpntTyp(invoicetotalpricecomponenttype.toCode());
		if(invoicetotalpricecomponenti == invoicetotalpricecomponentlist.size()-1) {

		i.addInvceTotalPriceCmpntTyp("]");		}

		} else {
			i.addInvceTotalPriceCmpntTyp("NULL");
		}

		/******************** invoicetotalpricecomponentcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept invoicetotalpricecomponentcode = invoicetotalpricecomponent.getCode();

		/******************** Invce_TotalPriceCmpnt_Cd_Txt ********************************************************************************/
		if(invoicetotalpricecomponenti == 0) {i.addInvceTotalPriceCmpntCdTxt("[");}
		if(invoicetotalpricecomponentcode.hasText()) {

			i.addInvceTotalPriceCmpntCdTxt(String.valueOf(invoicetotalpricecomponentcode.getText()));
		} else {
			i.addInvceTotalPriceCmpntCdTxt("NULL");
		}

		if(invoicetotalpricecomponenti == invoicetotalpricecomponentlist.size()-1) {i.addInvceTotalPriceCmpntCdTxt("]");}


		/******************** invoicetotalpricecomponentcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> invoicetotalpricecomponentcodecodinglist = invoicetotalpricecomponentcode.getCoding();
		for(int invoicetotalpricecomponentcodecodingi = 0; invoicetotalpricecomponentcodecodingi<invoicetotalpricecomponentcodecodinglist.size();invoicetotalpricecomponentcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  invoicetotalpricecomponentcodecoding = invoicetotalpricecomponentcodecodinglist.get(invoicetotalpricecomponentcodecodingi);

		/******************** Invce_TotalPriceCmpnt_Cd_Cdg_Dsply ********************************************************************************/
		if(invoicetotalpricecomponentcodecodingi == 0) {i.addInvceTotalPriceCmpntCdCdgDsply("[[");}
		if(invoicetotalpricecomponentcodecoding.hasDisplay()) {

			i.addInvceTotalPriceCmpntCdCdgDsply(String.valueOf(invoicetotalpricecomponentcodecoding.getDisplay()));
		} else {
			i.addInvceTotalPriceCmpntCdCdgDsply("NULL");
		}

		if(invoicetotalpricecomponentcodecodingi == invoicetotalpricecomponentcodecodinglist.size()-1) {i.addInvceTotalPriceCmpntCdCdgDsply("]]");}


		/******************** Invce_TotalPriceCmpnt_Cd_Cdg_Vrsn ********************************************************************************/
		if(invoicetotalpricecomponentcodecodingi == 0) {i.addInvceTotalPriceCmpntCdCdgVrsn("[[");}
		if(invoicetotalpricecomponentcodecoding.hasVersion()) {

			i.addInvceTotalPriceCmpntCdCdgVrsn(String.valueOf(invoicetotalpricecomponentcodecoding.getVersion()));
		} else {
			i.addInvceTotalPriceCmpntCdCdgVrsn("NULL");
		}

		if(invoicetotalpricecomponentcodecodingi == invoicetotalpricecomponentcodecodinglist.size()-1) {i.addInvceTotalPriceCmpntCdCdgVrsn("]]");}


		/******************** Invce_TotalPriceCmpnt_Cd_Cdg_Cd ********************************************************************************/
		if(invoicetotalpricecomponentcodecodingi == 0) {i.addInvceTotalPriceCmpntCdCdgCd("[[");}
		if(invoicetotalpricecomponentcodecoding.hasCode()) {

			i.addInvceTotalPriceCmpntCdCdgCd(String.valueOf(invoicetotalpricecomponentcodecoding.getCode()));
		} else {
			i.addInvceTotalPriceCmpntCdCdgCd("NULL");
		}

		if(invoicetotalpricecomponentcodecodingi == invoicetotalpricecomponentcodecodinglist.size()-1) {i.addInvceTotalPriceCmpntCdCdgCd("]]");}


		/******************** Invce_TotalPriceCmpnt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(invoicetotalpricecomponentcodecodingi == 0) {i.addInvceTotalPriceCmpntCdCdgUsrSltd("[[");}
		if(invoicetotalpricecomponentcodecoding.hasUserSelected()) {

			i.addInvceTotalPriceCmpntCdCdgUsrSltd(String.valueOf(invoicetotalpricecomponentcodecoding.getUserSelected()));
		} else {
			i.addInvceTotalPriceCmpntCdCdgUsrSltd("NULL");
		}

		if(invoicetotalpricecomponentcodecodingi == invoicetotalpricecomponentcodecodinglist.size()-1) {i.addInvceTotalPriceCmpntCdCdgUsrSltd("]]");}


		/******************** Invce_TotalPriceCmpnt_Cd_Cdg_Sys ********************************************************************************/
		if(invoicetotalpricecomponentcodecodingi == 0) {i.addInvceTotalPriceCmpntCdCdgSys("[[");}
		if(invoicetotalpricecomponentcodecoding.hasSystem()) {

			i.addInvceTotalPriceCmpntCdCdgSys(String.valueOf(invoicetotalpricecomponentcodecoding.getSystem()));
		} else {
			i.addInvceTotalPriceCmpntCdCdgSys("NULL");
		}

		if(invoicetotalpricecomponentcodecodingi == invoicetotalpricecomponentcodecodinglist.size()-1) {i.addInvceTotalPriceCmpntCdCdgSys("]]");}


		 };
		/******************** Invce_TotalPriceCmpnt_Factor ********************************************************************************/
		if(invoicetotalpricecomponenti == 0) {i.addInvceTotalPriceCmpntFactor("[");}
		if(invoicetotalpricecomponent.hasFactor()) {

			i.addInvceTotalPriceCmpntFactor(String.valueOf(invoicetotalpricecomponent.getFactor()));
		} else {
			i.addInvceTotalPriceCmpntFactor("NULL");
		}

		if(invoicetotalpricecomponenti == invoicetotalpricecomponentlist.size()-1) {i.addInvceTotalPriceCmpntFactor("]");}


		/******************** invoicetotalpricecomponentamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money invoicetotalpricecomponentamount = invoicetotalpricecomponent.getAmount();

		/******************** Invce_TotalPriceCmpnt_Amnt_Vl ********************************************************************************/
		if(invoicetotalpricecomponenti == 0) {i.addInvceTotalPriceCmpntAmntVl("[");}
		if(invoicetotalpricecomponentamount.hasValue()) {

			i.addInvceTotalPriceCmpntAmntVl(String.valueOf(invoicetotalpricecomponentamount.getValue()));
		} else {
			i.addInvceTotalPriceCmpntAmntVl("NULL");
		}

		if(invoicetotalpricecomponenti == invoicetotalpricecomponentlist.size()-1) {i.addInvceTotalPriceCmpntAmntVl("]");}


		/******************** Invce_TotalPriceCmpnt_Amnt_Crncy ********************************************************************************/
		if(invoicetotalpricecomponenti == 0) {i.addInvceTotalPriceCmpntAmntCrncy("[");}
		if(invoicetotalpricecomponentamount.hasCurrency()) {

			i.addInvceTotalPriceCmpntAmntCrncy(String.valueOf(invoicetotalpricecomponentamount.getCurrency()));
		} else {
			i.addInvceTotalPriceCmpntAmntCrncy("NULL");
		}

		if(invoicetotalpricecomponenti == invoicetotalpricecomponentlist.size()-1) {i.addInvceTotalPriceCmpntAmntCrncy("]");}


		 };
		/******************** Invce_Recipient ********************************************************************************/
		if(invoice.hasRecipient()) {

			if(invoice.getRecipient().getReference() != null) {
			i.addInvceRecipient(invoice.getRecipient().getReference());
			}
		} else {
			i.addInvceRecipient("NULL");
		}


		/******************** invoiceparticipant ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Invoice.InvoiceParticipantComponent> invoiceparticipantlist = invoice.getParticipant();
		for(int invoiceparticipanti = 0; invoiceparticipanti<invoiceparticipantlist.size();invoiceparticipanti++ ) {
		org.hl7.fhir.r4.model.Invoice.InvoiceParticipantComponent  invoiceparticipant = invoiceparticipantlist.get(invoiceparticipanti);

		/******************** invoiceparticipantrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept invoiceparticipantrole = invoiceparticipant.getRole();

		/******************** Invce_Prtcpnt_Role_Txt ********************************************************************************/
		if(invoiceparticipanti == 0) {i.addInvcePrtcpntRoleTxt("[");}
		if(invoiceparticipantrole.hasText()) {

			i.addInvcePrtcpntRoleTxt(String.valueOf(invoiceparticipantrole.getText()));
		} else {
			i.addInvcePrtcpntRoleTxt("NULL");
		}

		if(invoiceparticipanti == invoiceparticipantlist.size()-1) {i.addInvcePrtcpntRoleTxt("]");}


		/******************** invoiceparticipantrolecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> invoiceparticipantrolecodinglist = invoiceparticipantrole.getCoding();
		for(int invoiceparticipantrolecodingi = 0; invoiceparticipantrolecodingi<invoiceparticipantrolecodinglist.size();invoiceparticipantrolecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  invoiceparticipantrolecoding = invoiceparticipantrolecodinglist.get(invoiceparticipantrolecodingi);

		/******************** Invce_Prtcpnt_Role_Cdg_Dsply ********************************************************************************/
		if(invoiceparticipantrolecodingi == 0) {i.addInvcePrtcpntRoleCdgDsply("[[");}
		if(invoiceparticipantrolecoding.hasDisplay()) {

			i.addInvcePrtcpntRoleCdgDsply(String.valueOf(invoiceparticipantrolecoding.getDisplay()));
		} else {
			i.addInvcePrtcpntRoleCdgDsply("NULL");
		}

		if(invoiceparticipantrolecodingi == invoiceparticipantrolecodinglist.size()-1) {i.addInvcePrtcpntRoleCdgDsply("]]");}


		/******************** Invce_Prtcpnt_Role_Cdg_Vrsn ********************************************************************************/
		if(invoiceparticipantrolecodingi == 0) {i.addInvcePrtcpntRoleCdgVrsn("[[");}
		if(invoiceparticipantrolecoding.hasVersion()) {

			i.addInvcePrtcpntRoleCdgVrsn(String.valueOf(invoiceparticipantrolecoding.getVersion()));
		} else {
			i.addInvcePrtcpntRoleCdgVrsn("NULL");
		}

		if(invoiceparticipantrolecodingi == invoiceparticipantrolecodinglist.size()-1) {i.addInvcePrtcpntRoleCdgVrsn("]]");}


		/******************** Invce_Prtcpnt_Role_Cdg_Cd ********************************************************************************/
		if(invoiceparticipantrolecodingi == 0) {i.addInvcePrtcpntRoleCdgCd("[[");}
		if(invoiceparticipantrolecoding.hasCode()) {

			i.addInvcePrtcpntRoleCdgCd(String.valueOf(invoiceparticipantrolecoding.getCode()));
		} else {
			i.addInvcePrtcpntRoleCdgCd("NULL");
		}

		if(invoiceparticipantrolecodingi == invoiceparticipantrolecodinglist.size()-1) {i.addInvcePrtcpntRoleCdgCd("]]");}


		/******************** Invce_Prtcpnt_Role_Cdg_UsrSltd ********************************************************************************/
		if(invoiceparticipantrolecodingi == 0) {i.addInvcePrtcpntRoleCdgUsrSltd("[[");}
		if(invoiceparticipantrolecoding.hasUserSelected()) {

			i.addInvcePrtcpntRoleCdgUsrSltd(String.valueOf(invoiceparticipantrolecoding.getUserSelected()));
		} else {
			i.addInvcePrtcpntRoleCdgUsrSltd("NULL");
		}

		if(invoiceparticipantrolecodingi == invoiceparticipantrolecodinglist.size()-1) {i.addInvcePrtcpntRoleCdgUsrSltd("]]");}


		/******************** Invce_Prtcpnt_Role_Cdg_Sys ********************************************************************************/
		if(invoiceparticipantrolecodingi == 0) {i.addInvcePrtcpntRoleCdgSys("[[");}
		if(invoiceparticipantrolecoding.hasSystem()) {

			i.addInvcePrtcpntRoleCdgSys(String.valueOf(invoiceparticipantrolecoding.getSystem()));
		} else {
			i.addInvcePrtcpntRoleCdgSys("NULL");
		}

		if(invoiceparticipantrolecodingi == invoiceparticipantrolecodinglist.size()-1) {i.addInvcePrtcpntRoleCdgSys("]]");}


		 };
		/******************** Invce_Prtcpnt_Actor ********************************************************************************/
		if(invoiceparticipanti == 0) {i.addInvcePrtcpntActor("[");}
		if(invoiceparticipant.hasActor()) {

			if(invoiceparticipant.getActor().getReference() != null) {
			i.addInvcePrtcpntActor(invoiceparticipant.getActor().getReference());
			}
		} else {
			i.addInvcePrtcpntActor("NULL");
		}

		if(invoiceparticipanti == invoiceparticipantlist.size()-1) {i.addInvcePrtcpntActor("]");}


		 };
		/******************** Invce_Account ********************************************************************************/
		if(invoice.hasAccount()) {

			if(invoice.getAccount().getReference() != null) {
			i.addInvceAccount(invoice.getAccount().getReference());
			}
		} else {
			i.addInvceAccount("NULL");
		}


		/******************** invoicetotalnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money invoicetotalnet = invoice.getTotalNet();

		/******************** Invce_TotalNet_Vl ********************************************************************************/
		if(invoicetotalnet.hasValue()) {

			i.addInvceTotalNetVl(String.valueOf(invoicetotalnet.getValue()));
		} else {
			i.addInvceTotalNetVl("NULL");
		}


		/******************** Invce_TotalNet_Crncy ********************************************************************************/
		if(invoicetotalnet.hasCurrency()) {

			i.addInvceTotalNetCrncy(String.valueOf(invoicetotalnet.getCurrency()));
		} else {
			i.addInvceTotalNetCrncy("NULL");
		}


		/******************** invoicelineitem ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Invoice.InvoiceLineItemComponent> invoicelineitemlist = invoice.getLineItem();
		for(int invoicelineitemi = 0; invoicelineitemi<invoicelineitemlist.size();invoicelineitemi++ ) {
		org.hl7.fhir.r4.model.Invoice.InvoiceLineItemComponent  invoicelineitem = invoicelineitemlist.get(invoicelineitemi);

		/******************** Invce_LineItm_Sqnc ********************************************************************************/
		if(invoicelineitemi == 0) {i.addInvceLineItmSqnc("[");}
		if(invoicelineitem.hasSequence()) {

			i.addInvceLineItmSqnc(String.valueOf(invoicelineitem.getSequence()));
		} else {
			i.addInvceLineItmSqnc("NULL");
		}

		if(invoicelineitemi == invoicelineitemlist.size()-1) {i.addInvceLineItmSqnc("]");}


		/******************** Invce_LineItm_ChrgItmRfrnc ********************************************************************************/
		if(invoicelineitemi == 0) {i.addInvceLineItmChrgItmRfrnc("[");}
		if(invoicelineitem.hasChargeItemReference()) {

			if(invoicelineitem.getChargeItemReference().getReference() != null) {
			i.addInvceLineItmChrgItmRfrnc(invoicelineitem.getChargeItemReference().getReference());
			}
		} else {
			i.addInvceLineItmChrgItmRfrnc("NULL");
		}

		if(invoicelineitemi == invoicelineitemlist.size()-1) {i.addInvceLineItmChrgItmRfrnc("]");}


		/******************** invoicelineitemchargeitemcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept invoicelineitemchargeitemcodeableconcept = invoicelineitem.getChargeItemCodeableConcept();

		/******************** Invce_LineItm_ChrgItmCdbleCncpt_Txt ********************************************************************************/
		if(invoicelineitemi == 0) {i.addInvceLineItmChrgItmCdbleCncptTxt("[");}
		if(invoicelineitemchargeitemcodeableconcept.hasText()) {

			i.addInvceLineItmChrgItmCdbleCncptTxt(String.valueOf(invoicelineitemchargeitemcodeableconcept.getText()));
		} else {
			i.addInvceLineItmChrgItmCdbleCncptTxt("NULL");
		}

		if(invoicelineitemi == invoicelineitemlist.size()-1) {i.addInvceLineItmChrgItmCdbleCncptTxt("]");}


		/******************** invoicelineitemchargeitemcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> invoicelineitemchargeitemcodeableconceptcodinglist = invoicelineitemchargeitemcodeableconcept.getCoding();
		for(int invoicelineitemchargeitemcodeableconceptcodingi = 0; invoicelineitemchargeitemcodeableconceptcodingi<invoicelineitemchargeitemcodeableconceptcodinglist.size();invoicelineitemchargeitemcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  invoicelineitemchargeitemcodeableconceptcoding = invoicelineitemchargeitemcodeableconceptcodinglist.get(invoicelineitemchargeitemcodeableconceptcodingi);

		/******************** Invce_LineItm_ChrgItmCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(invoicelineitemchargeitemcodeableconceptcodingi == 0) {i.addInvceLineItmChrgItmCdbleCncptCdgDsply("[[");}
		if(invoicelineitemchargeitemcodeableconceptcoding.hasDisplay()) {

			i.addInvceLineItmChrgItmCdbleCncptCdgDsply(String.valueOf(invoicelineitemchargeitemcodeableconceptcoding.getDisplay()));
		} else {
			i.addInvceLineItmChrgItmCdbleCncptCdgDsply("NULL");
		}

		if(invoicelineitemchargeitemcodeableconceptcodingi == invoicelineitemchargeitemcodeableconceptcodinglist.size()-1) {i.addInvceLineItmChrgItmCdbleCncptCdgDsply("]]");}


		/******************** Invce_LineItm_ChrgItmCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(invoicelineitemchargeitemcodeableconceptcodingi == 0) {i.addInvceLineItmChrgItmCdbleCncptCdgVrsn("[[");}
		if(invoicelineitemchargeitemcodeableconceptcoding.hasVersion()) {

			i.addInvceLineItmChrgItmCdbleCncptCdgVrsn(String.valueOf(invoicelineitemchargeitemcodeableconceptcoding.getVersion()));
		} else {
			i.addInvceLineItmChrgItmCdbleCncptCdgVrsn("NULL");
		}

		if(invoicelineitemchargeitemcodeableconceptcodingi == invoicelineitemchargeitemcodeableconceptcodinglist.size()-1) {i.addInvceLineItmChrgItmCdbleCncptCdgVrsn("]]");}


		/******************** Invce_LineItm_ChrgItmCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(invoicelineitemchargeitemcodeableconceptcodingi == 0) {i.addInvceLineItmChrgItmCdbleCncptCdgCd("[[");}
		if(invoicelineitemchargeitemcodeableconceptcoding.hasCode()) {

			i.addInvceLineItmChrgItmCdbleCncptCdgCd(String.valueOf(invoicelineitemchargeitemcodeableconceptcoding.getCode()));
		} else {
			i.addInvceLineItmChrgItmCdbleCncptCdgCd("NULL");
		}

		if(invoicelineitemchargeitemcodeableconceptcodingi == invoicelineitemchargeitemcodeableconceptcodinglist.size()-1) {i.addInvceLineItmChrgItmCdbleCncptCdgCd("]]");}


		/******************** Invce_LineItm_ChrgItmCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(invoicelineitemchargeitemcodeableconceptcodingi == 0) {i.addInvceLineItmChrgItmCdbleCncptCdgUsrSltd("[[");}
		if(invoicelineitemchargeitemcodeableconceptcoding.hasUserSelected()) {

			i.addInvceLineItmChrgItmCdbleCncptCdgUsrSltd(String.valueOf(invoicelineitemchargeitemcodeableconceptcoding.getUserSelected()));
		} else {
			i.addInvceLineItmChrgItmCdbleCncptCdgUsrSltd("NULL");
		}

		if(invoicelineitemchargeitemcodeableconceptcodingi == invoicelineitemchargeitemcodeableconceptcodinglist.size()-1) {i.addInvceLineItmChrgItmCdbleCncptCdgUsrSltd("]]");}


		/******************** Invce_LineItm_ChrgItmCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(invoicelineitemchargeitemcodeableconceptcodingi == 0) {i.addInvceLineItmChrgItmCdbleCncptCdgSys("[[");}
		if(invoicelineitemchargeitemcodeableconceptcoding.hasSystem()) {

			i.addInvceLineItmChrgItmCdbleCncptCdgSys(String.valueOf(invoicelineitemchargeitemcodeableconceptcoding.getSystem()));
		} else {
			i.addInvceLineItmChrgItmCdbleCncptCdgSys("NULL");
		}

		if(invoicelineitemchargeitemcodeableconceptcodingi == invoicelineitemchargeitemcodeableconceptcodinglist.size()-1) {i.addInvceLineItmChrgItmCdbleCncptCdgSys("]]");}


		 };
		/******************** invoicelineitempricecomponent ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Invoice.InvoiceLineItemPriceComponentComponent> invoicelineitempricecomponentlist = invoicelineitem.getPriceComponent();
		for(int invoicelineitempricecomponenti = 0; invoicelineitempricecomponenti<invoicelineitempricecomponentlist.size();invoicelineitempricecomponenti++ ) {
		org.hl7.fhir.r4.model.Invoice.InvoiceLineItemPriceComponentComponent  invoicelineitempricecomponent = invoicelineitempricecomponentlist.get(invoicelineitempricecomponenti);

		/******************** invoicelineitempricecomponenttype ********************************************************************************/
		org.hl7.fhir.r4.model.Invoice.InvoicePriceComponentType invoicelineitempricecomponenttype = invoicelineitempricecomponent.getType();
		if(invoicelineitempricecomponenttype!=null) {
		if(invoicelineitempricecomponenti == 0) {

		i.addInvceLineItmPriceCmpntTyp("[[");		}
			i.addInvceLineItmPriceCmpntTyp(invoicelineitempricecomponenttype.toCode());
		if(invoicelineitempricecomponenti == invoicelineitempricecomponentlist.size()-1) {

		i.addInvceLineItmPriceCmpntTyp("]]");		}

		} else {
			i.addInvceLineItmPriceCmpntTyp("NULL");
		}

		/******************** invoicelineitempricecomponentcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept invoicelineitempricecomponentcode = invoicelineitempricecomponent.getCode();

		/******************** Invce_LineItm_PriceCmpnt_Cd_Txt ********************************************************************************/
		if(invoicelineitempricecomponenti == 0) {i.addInvceLineItmPriceCmpntCdTxt("[[");}
		if(invoicelineitempricecomponentcode.hasText()) {

			i.addInvceLineItmPriceCmpntCdTxt(String.valueOf(invoicelineitempricecomponentcode.getText()));
		} else {
			i.addInvceLineItmPriceCmpntCdTxt("NULL");
		}

		if(invoicelineitempricecomponenti == invoicelineitempricecomponentlist.size()-1) {i.addInvceLineItmPriceCmpntCdTxt("]]");}


		/******************** invoicelineitempricecomponentcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> invoicelineitempricecomponentcodecodinglist = invoicelineitempricecomponentcode.getCoding();
		for(int invoicelineitempricecomponentcodecodingi = 0; invoicelineitempricecomponentcodecodingi<invoicelineitempricecomponentcodecodinglist.size();invoicelineitempricecomponentcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  invoicelineitempricecomponentcodecoding = invoicelineitempricecomponentcodecodinglist.get(invoicelineitempricecomponentcodecodingi);

		/******************** Invce_LineItm_PriceCmpnt_Cd_Cdg_Dsply ********************************************************************************/
		if(invoicelineitempricecomponentcodecodingi == 0) {i.addInvceLineItmPriceCmpntCdCdgDsply("[[[");}
		if(invoicelineitempricecomponentcodecoding.hasDisplay()) {

			i.addInvceLineItmPriceCmpntCdCdgDsply(String.valueOf(invoicelineitempricecomponentcodecoding.getDisplay()));
		} else {
			i.addInvceLineItmPriceCmpntCdCdgDsply("NULL");
		}

		if(invoicelineitempricecomponentcodecodingi == invoicelineitempricecomponentcodecodinglist.size()-1) {i.addInvceLineItmPriceCmpntCdCdgDsply("]]]");}


		/******************** Invce_LineItm_PriceCmpnt_Cd_Cdg_Vrsn ********************************************************************************/
		if(invoicelineitempricecomponentcodecodingi == 0) {i.addInvceLineItmPriceCmpntCdCdgVrsn("[[[");}
		if(invoicelineitempricecomponentcodecoding.hasVersion()) {

			i.addInvceLineItmPriceCmpntCdCdgVrsn(String.valueOf(invoicelineitempricecomponentcodecoding.getVersion()));
		} else {
			i.addInvceLineItmPriceCmpntCdCdgVrsn("NULL");
		}

		if(invoicelineitempricecomponentcodecodingi == invoicelineitempricecomponentcodecodinglist.size()-1) {i.addInvceLineItmPriceCmpntCdCdgVrsn("]]]");}


		/******************** Invce_LineItm_PriceCmpnt_Cd_Cdg_Cd ********************************************************************************/
		if(invoicelineitempricecomponentcodecodingi == 0) {i.addInvceLineItmPriceCmpntCdCdgCd("[[[");}
		if(invoicelineitempricecomponentcodecoding.hasCode()) {

			i.addInvceLineItmPriceCmpntCdCdgCd(String.valueOf(invoicelineitempricecomponentcodecoding.getCode()));
		} else {
			i.addInvceLineItmPriceCmpntCdCdgCd("NULL");
		}

		if(invoicelineitempricecomponentcodecodingi == invoicelineitempricecomponentcodecodinglist.size()-1) {i.addInvceLineItmPriceCmpntCdCdgCd("]]]");}


		/******************** Invce_LineItm_PriceCmpnt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(invoicelineitempricecomponentcodecodingi == 0) {i.addInvceLineItmPriceCmpntCdCdgUsrSltd("[[[");}
		if(invoicelineitempricecomponentcodecoding.hasUserSelected()) {

			i.addInvceLineItmPriceCmpntCdCdgUsrSltd(String.valueOf(invoicelineitempricecomponentcodecoding.getUserSelected()));
		} else {
			i.addInvceLineItmPriceCmpntCdCdgUsrSltd("NULL");
		}

		if(invoicelineitempricecomponentcodecodingi == invoicelineitempricecomponentcodecodinglist.size()-1) {i.addInvceLineItmPriceCmpntCdCdgUsrSltd("]]]");}


		/******************** Invce_LineItm_PriceCmpnt_Cd_Cdg_Sys ********************************************************************************/
		if(invoicelineitempricecomponentcodecodingi == 0) {i.addInvceLineItmPriceCmpntCdCdgSys("[[[");}
		if(invoicelineitempricecomponentcodecoding.hasSystem()) {

			i.addInvceLineItmPriceCmpntCdCdgSys(String.valueOf(invoicelineitempricecomponentcodecoding.getSystem()));
		} else {
			i.addInvceLineItmPriceCmpntCdCdgSys("NULL");
		}

		if(invoicelineitempricecomponentcodecodingi == invoicelineitempricecomponentcodecodinglist.size()-1) {i.addInvceLineItmPriceCmpntCdCdgSys("]]]");}


		 };
		/******************** Invce_LineItm_PriceCmpnt_Factor ********************************************************************************/
		if(invoicelineitempricecomponenti == 0) {i.addInvceLineItmPriceCmpntFactor("[[");}
		if(invoicelineitempricecomponent.hasFactor()) {

			i.addInvceLineItmPriceCmpntFactor(String.valueOf(invoicelineitempricecomponent.getFactor()));
		} else {
			i.addInvceLineItmPriceCmpntFactor("NULL");
		}

		if(invoicelineitempricecomponenti == invoicelineitempricecomponentlist.size()-1) {i.addInvceLineItmPriceCmpntFactor("]]");}


		/******************** invoicelineitempricecomponentamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money invoicelineitempricecomponentamount = invoicelineitempricecomponent.getAmount();

		/******************** Invce_LineItm_PriceCmpnt_Amnt_Vl ********************************************************************************/
		if(invoicelineitempricecomponenti == 0) {i.addInvceLineItmPriceCmpntAmntVl("[[");}
		if(invoicelineitempricecomponentamount.hasValue()) {

			i.addInvceLineItmPriceCmpntAmntVl(String.valueOf(invoicelineitempricecomponentamount.getValue()));
		} else {
			i.addInvceLineItmPriceCmpntAmntVl("NULL");
		}

		if(invoicelineitempricecomponenti == invoicelineitempricecomponentlist.size()-1) {i.addInvceLineItmPriceCmpntAmntVl("]]");}


		/******************** Invce_LineItm_PriceCmpnt_Amnt_Crncy ********************************************************************************/
		if(invoicelineitempricecomponenti == 0) {i.addInvceLineItmPriceCmpntAmntCrncy("[[");}
		if(invoicelineitempricecomponentamount.hasCurrency()) {

			i.addInvceLineItmPriceCmpntAmntCrncy(String.valueOf(invoicelineitempricecomponentamount.getCurrency()));
		} else {
			i.addInvceLineItmPriceCmpntAmntCrncy("NULL");
		}

		if(invoicelineitempricecomponenti == invoicelineitempricecomponentlist.size()-1) {i.addInvceLineItmPriceCmpntAmntCrncy("]]");}


		 };
		 };
		/******************** Invce_Issuer ********************************************************************************/
		if(invoice.hasIssuer()) {

			if(invoice.getIssuer().getReference() != null) {
			i.addInvceIssuer(invoice.getIssuer().getReference());
			}
		} else {
			i.addInvceIssuer("NULL");
		}


		/******************** Invce_CancelledRsn ********************************************************************************/
		if(invoice.hasCancelledReason()) {

			i.addInvceCancelledRsn(String.valueOf(invoice.getCancelledReason()));
		} else {
			i.addInvceCancelledRsn("NULL");
		}


		/******************** invoicetotalgross ********************************************************************************/
		org.hl7.fhir.r4.model.Money invoicetotalgross = invoice.getTotalGross();

		/******************** Invce_TotalGross_Vl ********************************************************************************/
		if(invoicetotalgross.hasValue()) {

			i.addInvceTotalGrossVl(String.valueOf(invoicetotalgross.getValue()));
		} else {
			i.addInvceTotalGrossVl("NULL");
		}


		/******************** Invce_TotalGross_Crncy ********************************************************************************/
		if(invoicetotalgross.hasCurrency()) {

			i.addInvceTotalGrossCrncy(String.valueOf(invoicetotalgross.getCurrency()));
		} else {
			i.addInvceTotalGrossCrncy("NULL");
		}


		/******************** Invce_PymntTrms ********************************************************************************/
		if(invoice.hasPaymentTerms()) {

			i.addInvcePymntTrms(String.valueOf(invoice.getPaymentTerms()));
		} else {
			i.addInvcePymntTrms("NULL");
		}


		return i;
	}
}
