package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Invoice;
public class InvoiceBidirectionalConversion 
{
	public Invoice Invoices(org.hl7.fhir.r4.model.Invoice invoice) throws ParseException
	{
		 main.java.com.campfhir.model.Invoice i = new  main.java.com.campfhir.model.Invoice();

		/******************** id ********************************************************************************/
		invoice.setId(i.getId());

		/******************** invoicetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept invoicetype = invoice.getType();

		/******************** invoicetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding invoicetypecoding = invoicetype.getCodingFirstRep();

		/******************** Invce_Typ_Cdg_Dsply ********************************************************************************/
		if(invoicetypecoding.hasDisplay()) {
			i.setInvceTypCdgDsply(String.valueOf(invoicetypecoding.getDisplay()));
		}
		/******************** Invce_Typ_Cdg_Vrsn ********************************************************************************/
		if(invoicetypecoding.hasVersion()) {
			i.setInvceTypCdgVrsn(String.valueOf(invoicetypecoding.getVersion()));
		}
		/******************** Invce_Typ_Cdg_Cd ********************************************************************************/
		if(invoicetypecoding.hasCode()) {
			i.setInvceTypCdgCd(String.valueOf(invoicetypecoding.getCode()));
		}
		/******************** Invce_Typ_Cdg_Sys ********************************************************************************/
		if(invoicetypecoding.hasSystem()) {
			i.setInvceTypCdgSys(String.valueOf(invoicetypecoding.getSystem()));
		}
		/******************** Invce_Typ_Cdg_UsrSltd ********************************************************************************/
		if(invoicetypecoding.hasUserSelected()) {
			i.setInvceTypCdgUsrSltd(String.valueOf(invoicetypecoding.getUserSelected()));
		}
		/******************** Invce_Typ_Txt ********************************************************************************/
		if(invoicetype.hasText()) {
			i.setInvceTypTxt(String.valueOf(invoicetype.getText()));
		}
		/******************** Invce_Dt ********************************************************************************/
		if(invoice.hasDate()) {
			i.setInvceDt(String.valueOf(invoice.getDate()));
		}
		/******************** invoicelineitem ********************************************************************************/
		org.hl7.fhir.r4.model.Invoice.InvoiceLineItemComponent invoicelineitem = invoice.getLineItemFirstRep();

		/******************** Invce_LineItm_Sqnc ********************************************************************************/
		if(invoicelineitem.hasSequence()) {
			i.setInvceLineItmSqnc(String.valueOf(invoicelineitem.getSequence()));
		}
		/******************** Invce_LineItm_ChrgItmRfrnc ********************************************************************************/
		if(invoicelineitem.hasChargeItemReference()) {
			i.setInvceLineItmChrgItmRfrnc(String.valueOf(invoicelineitem.getChargeItemReference()));
		}
		/******************** invoicelineitemchargeitemcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept invoicelineitemchargeitemcodeableconcept = invoicelineitem.getChargeItemCodeableConcept();

		/******************** invoicelineitemchargeitemcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding invoicelineitemchargeitemcodeableconceptcoding = invoicelineitemchargeitemcodeableconcept.getCodingFirstRep();

		/******************** Invce_LineItm_ChrgItmCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(invoicelineitemchargeitemcodeableconceptcoding.hasDisplay()) {
			i.setInvceLineItmChrgItmCdbleCncptCdgDsply(String.valueOf(invoicelineitemchargeitemcodeableconceptcoding.getDisplay()));
		}
		/******************** Invce_LineItm_ChrgItmCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(invoicelineitemchargeitemcodeableconceptcoding.hasVersion()) {
			i.setInvceLineItmChrgItmCdbleCncptCdgVrsn(String.valueOf(invoicelineitemchargeitemcodeableconceptcoding.getVersion()));
		}
		/******************** Invce_LineItm_ChrgItmCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(invoicelineitemchargeitemcodeableconceptcoding.hasCode()) {
			i.setInvceLineItmChrgItmCdbleCncptCdgCd(String.valueOf(invoicelineitemchargeitemcodeableconceptcoding.getCode()));
		}
		/******************** Invce_LineItm_ChrgItmCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(invoicelineitemchargeitemcodeableconceptcoding.hasSystem()) {
			i.setInvceLineItmChrgItmCdbleCncptCdgSys(String.valueOf(invoicelineitemchargeitemcodeableconceptcoding.getSystem()));
		}
		/******************** Invce_LineItm_ChrgItmCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(invoicelineitemchargeitemcodeableconceptcoding.hasUserSelected()) {
			i.setInvceLineItmChrgItmCdbleCncptCdgUsrSltd(String.valueOf(invoicelineitemchargeitemcodeableconceptcoding.getUserSelected()));
		}
		/******************** Invce_LineItm_ChrgItmCdbleCncpt_Txt ********************************************************************************/
		if(invoicelineitemchargeitemcodeableconcept.hasText()) {
			i.setInvceLineItmChrgItmCdbleCncptTxt(String.valueOf(invoicelineitemchargeitemcodeableconcept.getText()));
		}
		/******************** invoicelineitempricecomponent ********************************************************************************/
		org.hl7.fhir.r4.model.Invoice.InvoiceLineItemPriceComponentComponent invoicelineitempricecomponent = invoicelineitem.getPriceComponentFirstRep();

		/******************** invoicelineitempricecomponenttype ********************************************************************************/
		org.hl7.fhir.r4.model.Invoice.InvoicePriceComponentType invoicelineitempricecomponenttype = invoicelineitempricecomponent.getType();
		i.setInvceLineItmPriceCmpntTyp(invoicelineitempricecomponenttype.toCode());

		/******************** invoicelineitempricecomponentcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept invoicelineitempricecomponentcode = invoicelineitempricecomponent.getCode();

		/******************** invoicelineitempricecomponentcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding invoicelineitempricecomponentcodecoding = invoicelineitempricecomponentcode.getCodingFirstRep();

		/******************** Invce_LineItm_PriceCmpnt_Cd_Cdg_Dsply ********************************************************************************/
		if(invoicelineitempricecomponentcodecoding.hasDisplay()) {
			i.setInvceLineItmPriceCmpntCdCdgDsply(String.valueOf(invoicelineitempricecomponentcodecoding.getDisplay()));
		}
		/******************** Invce_LineItm_PriceCmpnt_Cd_Cdg_Vrsn ********************************************************************************/
		if(invoicelineitempricecomponentcodecoding.hasVersion()) {
			i.setInvceLineItmPriceCmpntCdCdgVrsn(String.valueOf(invoicelineitempricecomponentcodecoding.getVersion()));
		}
		/******************** Invce_LineItm_PriceCmpnt_Cd_Cdg_Cd ********************************************************************************/
		if(invoicelineitempricecomponentcodecoding.hasCode()) {
			i.setInvceLineItmPriceCmpntCdCdgCd(String.valueOf(invoicelineitempricecomponentcodecoding.getCode()));
		}
		/******************** Invce_LineItm_PriceCmpnt_Cd_Cdg_Sys ********************************************************************************/
		if(invoicelineitempricecomponentcodecoding.hasSystem()) {
			i.setInvceLineItmPriceCmpntCdCdgSys(String.valueOf(invoicelineitempricecomponentcodecoding.getSystem()));
		}
		/******************** Invce_LineItm_PriceCmpnt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(invoicelineitempricecomponentcodecoding.hasUserSelected()) {
			i.setInvceLineItmPriceCmpntCdCdgUsrSltd(String.valueOf(invoicelineitempricecomponentcodecoding.getUserSelected()));
		}
		/******************** Invce_LineItm_PriceCmpnt_Cd_Txt ********************************************************************************/
		if(invoicelineitempricecomponentcode.hasText()) {
			i.setInvceLineItmPriceCmpntCdTxt(String.valueOf(invoicelineitempricecomponentcode.getText()));
		}
		/******************** invoicelineitempricecomponentamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money invoicelineitempricecomponentamount = invoicelineitempricecomponent.getAmount();

		/******************** Invce_LineItm_PriceCmpnt_Amnt_Vl ********************************************************************************/
		if(invoicelineitempricecomponentamount.hasValue()) {
			i.setInvceLineItmPriceCmpntAmntVl(String.valueOf(invoicelineitempricecomponentamount.getValue()));
		}
		/******************** Invce_LineItm_PriceCmpnt_Amnt_Crncy ********************************************************************************/
		if(invoicelineitempricecomponentamount.hasCurrency()) {
			i.setInvceLineItmPriceCmpntAmntCrncy(String.valueOf(invoicelineitempricecomponentamount.getCurrency()));
		}
		/******************** Invce_LineItm_PriceCmpnt_Factor ********************************************************************************/
		if(invoicelineitempricecomponent.hasFactor()) {
			i.setInvceLineItmPriceCmpntFactor(String.valueOf(invoicelineitempricecomponent.getFactor()));
		}
		/******************** invoicetotalpricecomponent ********************************************************************************/
		org.hl7.fhir.r4.model.Invoice.InvoiceLineItemPriceComponentComponent invoicetotalpricecomponent = invoice.getTotalPriceComponentFirstRep();

		/******************** invoicetotalpricecomponenttype ********************************************************************************/
		org.hl7.fhir.r4.model.Invoice.InvoicePriceComponentType invoicetotalpricecomponenttype = invoicetotalpricecomponent.getType();
		i.setInvceTotalPriceCmpntTyp(invoicetotalpricecomponenttype.toCode());

		/******************** invoicetotalpricecomponentcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept invoicetotalpricecomponentcode = invoicetotalpricecomponent.getCode();

		/******************** invoicetotalpricecomponentcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding invoicetotalpricecomponentcodecoding = invoicetotalpricecomponentcode.getCodingFirstRep();

		/******************** Invce_TotalPriceCmpnt_Cd_Cdg_Dsply ********************************************************************************/
		if(invoicetotalpricecomponentcodecoding.hasDisplay()) {
			i.setInvceTotalPriceCmpntCdCdgDsply(String.valueOf(invoicetotalpricecomponentcodecoding.getDisplay()));
		}
		/******************** Invce_TotalPriceCmpnt_Cd_Cdg_Vrsn ********************************************************************************/
		if(invoicetotalpricecomponentcodecoding.hasVersion()) {
			i.setInvceTotalPriceCmpntCdCdgVrsn(String.valueOf(invoicetotalpricecomponentcodecoding.getVersion()));
		}
		/******************** Invce_TotalPriceCmpnt_Cd_Cdg_Cd ********************************************************************************/
		if(invoicetotalpricecomponentcodecoding.hasCode()) {
			i.setInvceTotalPriceCmpntCdCdgCd(String.valueOf(invoicetotalpricecomponentcodecoding.getCode()));
		}
		/******************** Invce_TotalPriceCmpnt_Cd_Cdg_Sys ********************************************************************************/
		if(invoicetotalpricecomponentcodecoding.hasSystem()) {
			i.setInvceTotalPriceCmpntCdCdgSys(String.valueOf(invoicetotalpricecomponentcodecoding.getSystem()));
		}
		/******************** Invce_TotalPriceCmpnt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(invoicetotalpricecomponentcodecoding.hasUserSelected()) {
			i.setInvceTotalPriceCmpntCdCdgUsrSltd(String.valueOf(invoicetotalpricecomponentcodecoding.getUserSelected()));
		}
		/******************** Invce_TotalPriceCmpnt_Cd_Txt ********************************************************************************/
		if(invoicetotalpricecomponentcode.hasText()) {
			i.setInvceTotalPriceCmpntCdTxt(String.valueOf(invoicetotalpricecomponentcode.getText()));
		}
		/******************** invoicetotalpricecomponentamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money invoicetotalpricecomponentamount = invoicetotalpricecomponent.getAmount();

		/******************** Invce_TotalPriceCmpnt_Amnt_Vl ********************************************************************************/
		if(invoicetotalpricecomponentamount.hasValue()) {
			i.setInvceTotalPriceCmpntAmntVl(String.valueOf(invoicetotalpricecomponentamount.getValue()));
		}
		/******************** Invce_TotalPriceCmpnt_Amnt_Crncy ********************************************************************************/
		if(invoicetotalpricecomponentamount.hasCurrency()) {
			i.setInvceTotalPriceCmpntAmntCrncy(String.valueOf(invoicetotalpricecomponentamount.getCurrency()));
		}
		/******************** Invce_TotalPriceCmpnt_Factor ********************************************************************************/
		if(invoicetotalpricecomponent.hasFactor()) {
			i.setInvceTotalPriceCmpntFactor(String.valueOf(invoicetotalpricecomponent.getFactor()));
		}
		/******************** Invce_Sbjct ********************************************************************************/
		if(invoice.hasSubject()) {
			i.setInvceSbjct(String.valueOf(invoice.getSubject()));
		}
		/******************** invoicestatus ********************************************************************************/
		org.hl7.fhir.r4.model.Invoice.InvoiceStatus invoicestatus = invoice.getStatus();
		i.setInvceSts(invoicestatus.toCode());

		/******************** invoicenote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation invoicenote = invoice.getNoteFirstRep();

		/******************** Invce_Nt_Time ********************************************************************************/
		if(invoicenote.hasTime()) {
			i.setInvceNtTime(String.valueOf(invoicenote.getTime()));
		}
		/******************** Invce_Nt_AthrRfrnc ********************************************************************************/
		if(invoicenote.hasAuthorReference()) {
			i.setInvceNtAthrRfrnc(String.valueOf(invoicenote.getAuthorReference()));
		}
		/******************** Invce_Nt_Txt ********************************************************************************/
		if(invoicenote.hasText()) {
			i.setInvceNtTxt(String.valueOf(invoicenote.getText()));
		}
		/******************** Invce_Nt_AthrStrgTyp ********************************************************************************/
		if(invoicenote.hasAuthorStringType()) {
			i.setInvceNtAthrStrgTyp(String.valueOf(invoicenote.getAuthorStringType()));
		}
		/******************** Invce_Account ********************************************************************************/
		if(invoice.hasAccount()) {
			i.setInvceAccount(String.valueOf(invoice.getAccount()));
		}
		/******************** invoiceparticipant ********************************************************************************/
		org.hl7.fhir.r4.model.Invoice.InvoiceParticipantComponent invoiceparticipant = invoice.getParticipantFirstRep();

		/******************** Invce_Prtcpnt_Actor ********************************************************************************/
		if(invoiceparticipant.hasActor()) {
			i.setInvcePrtcpntActor(String.valueOf(invoiceparticipant.getActor()));
		}
		/******************** invoiceparticipantrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept invoiceparticipantrole = invoiceparticipant.getRole();

		/******************** invoiceparticipantrolecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding invoiceparticipantrolecoding = invoiceparticipantrole.getCodingFirstRep();

		/******************** Invce_Prtcpnt_Role_Cdg_Dsply ********************************************************************************/
		if(invoiceparticipantrolecoding.hasDisplay()) {
			i.setInvcePrtcpntRoleCdgDsply(String.valueOf(invoiceparticipantrolecoding.getDisplay()));
		}
		/******************** Invce_Prtcpnt_Role_Cdg_Vrsn ********************************************************************************/
		if(invoiceparticipantrolecoding.hasVersion()) {
			i.setInvcePrtcpntRoleCdgVrsn(String.valueOf(invoiceparticipantrolecoding.getVersion()));
		}
		/******************** Invce_Prtcpnt_Role_Cdg_Cd ********************************************************************************/
		if(invoiceparticipantrolecoding.hasCode()) {
			i.setInvcePrtcpntRoleCdgCd(String.valueOf(invoiceparticipantrolecoding.getCode()));
		}
		/******************** Invce_Prtcpnt_Role_Cdg_Sys ********************************************************************************/
		if(invoiceparticipantrolecoding.hasSystem()) {
			i.setInvcePrtcpntRoleCdgSys(String.valueOf(invoiceparticipantrolecoding.getSystem()));
		}
		/******************** Invce_Prtcpnt_Role_Cdg_UsrSltd ********************************************************************************/
		if(invoiceparticipantrolecoding.hasUserSelected()) {
			i.setInvcePrtcpntRoleCdgUsrSltd(String.valueOf(invoiceparticipantrolecoding.getUserSelected()));
		}
		/******************** Invce_Prtcpnt_Role_Txt ********************************************************************************/
		if(invoiceparticipantrole.hasText()) {
			i.setInvcePrtcpntRoleTxt(String.valueOf(invoiceparticipantrole.getText()));
		}
		/******************** invoiceidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier invoiceidentifier = invoice.getIdentifierFirstRep();

		/******************** Invce_Id_Vl ********************************************************************************/
		if(invoiceidentifier.hasValue()) {
			i.setInvceIdVl(String.valueOf(invoiceidentifier.getValue()));
		}
		/******************** invoiceidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept invoiceidentifiertype = invoiceidentifier.getType();

		/******************** invoiceidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding invoiceidentifiertypecoding = invoiceidentifiertype.getCodingFirstRep();

		/******************** Invce_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(invoiceidentifiertypecoding.hasDisplay()) {
			i.setInvceIdTypCdgDsply(String.valueOf(invoiceidentifiertypecoding.getDisplay()));
		}
		/******************** Invce_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(invoiceidentifiertypecoding.hasVersion()) {
			i.setInvceIdTypCdgVrsn(String.valueOf(invoiceidentifiertypecoding.getVersion()));
		}
		/******************** Invce_Id_Typ_Cdg_Cd ********************************************************************************/
		if(invoiceidentifiertypecoding.hasCode()) {
			i.setInvceIdTypCdgCd(String.valueOf(invoiceidentifiertypecoding.getCode()));
		}
		/******************** Invce_Id_Typ_Cdg_Sys ********************************************************************************/
		if(invoiceidentifiertypecoding.hasSystem()) {
			i.setInvceIdTypCdgSys(String.valueOf(invoiceidentifiertypecoding.getSystem()));
		}
		/******************** Invce_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(invoiceidentifiertypecoding.hasUserSelected()) {
			i.setInvceIdTypCdgUsrSltd(String.valueOf(invoiceidentifiertypecoding.getUserSelected()));
		}
		/******************** Invce_Id_Typ_Txt ********************************************************************************/
		if(invoiceidentifiertype.hasText()) {
			i.setInvceIdTypTxt(String.valueOf(invoiceidentifiertype.getText()));
		}
		/******************** Invce_Id_Sys ********************************************************************************/
		if(invoiceidentifier.hasSystem()) {
			i.setInvceIdSys(String.valueOf(invoiceidentifier.getSystem()));
		}
		/******************** Invce_Id_Assigner ********************************************************************************/
		if(invoiceidentifier.hasAssigner()) {
			i.setInvceIdAssigner(String.valueOf(invoiceidentifier.getAssigner()));
		}
		/******************** invoiceidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period invoiceidentifierperiod = invoiceidentifier.getPeriod();

		/******************** Invce_Id_Prd_End ********************************************************************************/
		if(invoiceidentifierperiod.hasEnd()) {
			i.setInvceIdPrdEnd(String.valueOf(invoiceidentifierperiod.getEnd()));
		}
		/******************** Invce_Id_Prd_Strt ********************************************************************************/
		if(invoiceidentifierperiod.hasStart()) {
			i.setInvceIdPrdStrt(String.valueOf(invoiceidentifierperiod.getStart()));
		}
		/******************** invoiceidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse invoiceidentifieruse = invoiceidentifier.getUse();
		i.setInvceIdUse(invoiceidentifieruse.toCode());

		/******************** Invce_Recipient ********************************************************************************/
		if(invoice.hasRecipient()) {
			i.setInvceRecipient(String.valueOf(invoice.getRecipient()));
		}
		/******************** Invce_Issuer ********************************************************************************/
		if(invoice.hasIssuer()) {
			i.setInvceIssuer(String.valueOf(invoice.getIssuer()));
		}
		/******************** Invce_CancelledRsn ********************************************************************************/
		if(invoice.hasCancelledReason()) {
			i.setInvceCancelledRsn(String.valueOf(invoice.getCancelledReason()));
		}
		/******************** invoicetotalnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money invoicetotalnet = invoice.getTotalNet();

		/******************** Invce_TotalNet_Vl ********************************************************************************/
		if(invoicetotalnet.hasValue()) {
			i.setInvceTotalNetVl(String.valueOf(invoicetotalnet.getValue()));
		}
		/******************** Invce_TotalNet_Crncy ********************************************************************************/
		if(invoicetotalnet.hasCurrency()) {
			i.setInvceTotalNetCrncy(String.valueOf(invoicetotalnet.getCurrency()));
		}
		/******************** Invce_PymntTrms ********************************************************************************/
		if(invoice.hasPaymentTerms()) {
			i.setInvcePymntTrms(String.valueOf(invoice.getPaymentTerms()));
		}
		/******************** invoicetotalgross ********************************************************************************/
		org.hl7.fhir.r4.model.Money invoicetotalgross = invoice.getTotalGross();

		/******************** Invce_TotalGross_Vl ********************************************************************************/
		if(invoicetotalgross.hasValue()) {
			i.setInvceTotalGrossVl(String.valueOf(invoicetotalgross.getValue()));
		}
		/******************** Invce_TotalGross_Crncy ********************************************************************************/
		if(invoicetotalgross.hasCurrency()) {
			i.setInvceTotalGrossCrncy(String.valueOf(invoicetotalgross.getCurrency()));
		}
		return i;
	}
}
