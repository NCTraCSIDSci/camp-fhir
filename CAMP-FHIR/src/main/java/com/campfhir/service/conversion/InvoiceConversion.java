package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Invoice;
public class InvoiceConversion 
{
	public org.hl7.fhir.r4.model.Invoice Invoices(Invoice i) throws ParseException
	{
		org.hl7.fhir.r4.model.Invoice invoice = new org.hl7.fhir.r4.model.Invoice();

		/******************** id ********************************************************************************/
		invoice.setId(i.getId());

		/******************** Invce_Account ********************************************************************************/
		if(i.getInvceAccount() != null) {
			invoice.setAccount( new org.hl7.fhir.r4.model.Reference(i.getInvceAccount()));
		}
		/******************** Invce_CancelledRsn ********************************************************************************/
		if(i.getInvceCancelledRsn() != null) {
			invoice.setCancelledReason(i.getInvceCancelledRsn());
		}
		/******************** Invce_Dt ********************************************************************************/
		if(i.getInvceDt() != null) {
			java.text.SimpleDateFormat Invce_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Invce_Dtdate = Invce_Dtsdf.parse(i.getInvceDt());
			invoice.setDate(Invce_Dtdate);
		}
		/******************** invoiceidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier invoiceidentifier =  new org.hl7.fhir.r4.model.Identifier();
		invoice.addIdentifier(invoiceidentifier);

		/******************** Invce_Id_Assigner ********************************************************************************/
		if(i.getInvceIdAssigner() != null) {
			invoiceidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(i.getInvceIdAssigner()));
		}
		/******************** invoiceidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period invoiceidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		invoiceidentifier.setPeriod(invoiceidentifierperiod);

		/******************** Invce_Id_Prd_End ********************************************************************************/
		if(i.getInvceIdPrdEnd() != null) {
			java.text.SimpleDateFormat Invce_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Invce_Id_Prd_Enddate = Invce_Id_Prd_Endsdf.parse(i.getInvceIdPrdEnd());
			invoiceidentifierperiod.setEnd(Invce_Id_Prd_Enddate);
		}
		/******************** Invce_Id_Prd_Strt ********************************************************************************/
		if(i.getInvceIdPrdStrt() != null) {
			java.text.SimpleDateFormat Invce_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Invce_Id_Prd_Strtdate = Invce_Id_Prd_Strtsdf.parse(i.getInvceIdPrdStrt());
			invoiceidentifierperiod.setStart(Invce_Id_Prd_Strtdate);
		}
		/******************** Invce_Id_Sys ********************************************************************************/
		if(i.getInvceIdSys() != null) {
			invoiceidentifier.setSystem(i.getInvceIdSys());
		}
		/******************** invoiceidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept invoiceidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		invoiceidentifier.setType(invoiceidentifiertype);

		/******************** invoiceidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding invoiceidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		invoiceidentifiertype.addCoding(invoiceidentifiertypecoding);

		/******************** Invce_Id_Typ_Cdg_Cd ********************************************************************************/
		if(i.getInvceIdTypCdgCd() != null) {
			invoiceidentifiertypecoding.setCode(i.getInvceIdTypCdgCd());
		}
		/******************** Invce_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(i.getInvceIdTypCdgDsply() != null) {
			invoiceidentifiertypecoding.setDisplay(i.getInvceIdTypCdgDsply());
		}
		/******************** Invce_Id_Typ_Cdg_Sys ********************************************************************************/
		if(i.getInvceIdTypCdgSys() != null) {
			invoiceidentifiertypecoding.setSystem(i.getInvceIdTypCdgSys());
		}
		/******************** Invce_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(i.getInvceIdTypCdgUsrSltd() != null) {
			invoiceidentifiertypecoding.setUserSelected(Boolean.parseBoolean(i.getInvceIdTypCdgUsrSltd()));
		}
		/******************** Invce_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(i.getInvceIdTypCdgVrsn() != null) {
			invoiceidentifiertypecoding.setVersion(i.getInvceIdTypCdgVrsn());
		}
		/******************** Invce_Id_Typ_Txt ********************************************************************************/
		if(i.getInvceIdTypTxt() != null) {
			invoiceidentifiertype.setText(i.getInvceIdTypTxt());
		}
		/******************** invoiceidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory invoiceidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		invoiceidentifier.setUse(invoiceidentifieruse.fromCode(i.getInvceIdUse()));

		/******************** Invce_Id_Vl ********************************************************************************/
		if(i.getInvceIdVl() != null) {
			invoiceidentifier.setValue(i.getInvceIdVl());
		}
		/******************** Invce_Issuer ********************************************************************************/
		if(i.getInvceIssuer() != null) {
			invoice.setIssuer( new org.hl7.fhir.r4.model.Reference(i.getInvceIssuer()));
		}
		/******************** invoicelineitem ********************************************************************************/
		org.hl7.fhir.r4.model.Invoice.InvoiceLineItemComponent invoicelineitem =  new org.hl7.fhir.r4.model.Invoice.InvoiceLineItemComponent();
		invoice.addLineItem(invoicelineitem);

		/******************** invoicelineitemchargeitemcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept invoicelineitemchargeitemcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		invoicelineitem.setChargeItem(invoicelineitemchargeitemcodeableconcept);

		/******************** invoicelineitemchargeitemcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding invoicelineitemchargeitemcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		invoicelineitemchargeitemcodeableconcept.addCoding(invoicelineitemchargeitemcodeableconceptcoding);

		/******************** Invce_LineItm_ChrgItmCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(i.getInvceLineItmChrgItmCdbleCncptCdgCd() != null) {
			invoicelineitemchargeitemcodeableconceptcoding.setCode(i.getInvceLineItmChrgItmCdbleCncptCdgCd());
		}
		/******************** Invce_LineItm_ChrgItmCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(i.getInvceLineItmChrgItmCdbleCncptCdgDsply() != null) {
			invoicelineitemchargeitemcodeableconceptcoding.setDisplay(i.getInvceLineItmChrgItmCdbleCncptCdgDsply());
		}
		/******************** Invce_LineItm_ChrgItmCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(i.getInvceLineItmChrgItmCdbleCncptCdgSys() != null) {
			invoicelineitemchargeitemcodeableconceptcoding.setSystem(i.getInvceLineItmChrgItmCdbleCncptCdgSys());
		}
		/******************** Invce_LineItm_ChrgItmCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(i.getInvceLineItmChrgItmCdbleCncptCdgUsrSltd() != null) {
			invoicelineitemchargeitemcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(i.getInvceLineItmChrgItmCdbleCncptCdgUsrSltd()));
		}
		/******************** Invce_LineItm_ChrgItmCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(i.getInvceLineItmChrgItmCdbleCncptCdgVrsn() != null) {
			invoicelineitemchargeitemcodeableconceptcoding.setVersion(i.getInvceLineItmChrgItmCdbleCncptCdgVrsn());
		}
		/******************** Invce_LineItm_ChrgItmCdbleCncpt_Txt ********************************************************************************/
		if(i.getInvceLineItmChrgItmCdbleCncptTxt() != null) {
			invoicelineitemchargeitemcodeableconcept.setText(i.getInvceLineItmChrgItmCdbleCncptTxt());
		}
		/******************** Invce_LineItm_ChrgItmRfrnc ********************************************************************************/
		if(i.getInvceLineItmChrgItmRfrnc() != null) {
			invoicelineitem.setChargeItem( new org.hl7.fhir.r4.model.Reference(i.getInvceLineItmChrgItmRfrnc()));
		}
		/******************** invoicelineitempricecomponent ********************************************************************************/
		org.hl7.fhir.r4.model.Invoice.InvoiceLineItemPriceComponentComponent invoicelineitempricecomponent =  new org.hl7.fhir.r4.model.Invoice.InvoiceLineItemPriceComponentComponent();
		invoicelineitem.addPriceComponent(invoicelineitempricecomponent);

		/******************** invoicelineitempricecomponentamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money invoicelineitempricecomponentamount =  new org.hl7.fhir.r4.model.Money();
		invoicelineitempricecomponent.setAmount(invoicelineitempricecomponentamount);

		/******************** Invce_LineItm_PriceCmpnt_Amnt_Crncy ********************************************************************************/
		if(i.getInvceLineItmPriceCmpntAmntCrncy() != null) {
			invoicelineitempricecomponentamount.setCurrency(i.getInvceLineItmPriceCmpntAmntCrncy());
		}
		/******************** Invce_LineItm_PriceCmpnt_Amnt_Vl ********************************************************************************/
		if(i.getInvceLineItmPriceCmpntAmntVl() != null) {
			invoicelineitempricecomponentamount.setValue(Double.parseDouble((i.getInvceLineItmPriceCmpntAmntVl())));
		}
		/******************** invoicelineitempricecomponentcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept invoicelineitempricecomponentcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		invoicelineitempricecomponent.setCode(invoicelineitempricecomponentcode);

		/******************** invoicelineitempricecomponentcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding invoicelineitempricecomponentcodecoding =  new org.hl7.fhir.r4.model.Coding();
		invoicelineitempricecomponentcode.addCoding(invoicelineitempricecomponentcodecoding);

		/******************** Invce_LineItm_PriceCmpnt_Cd_Cdg_Cd ********************************************************************************/
		if(i.getInvceLineItmPriceCmpntCdCdgCd() != null) {
			invoicelineitempricecomponentcodecoding.setCode(i.getInvceLineItmPriceCmpntCdCdgCd());
		}
		/******************** Invce_LineItm_PriceCmpnt_Cd_Cdg_Dsply ********************************************************************************/
		if(i.getInvceLineItmPriceCmpntCdCdgDsply() != null) {
			invoicelineitempricecomponentcodecoding.setDisplay(i.getInvceLineItmPriceCmpntCdCdgDsply());
		}
		/******************** Invce_LineItm_PriceCmpnt_Cd_Cdg_Sys ********************************************************************************/
		if(i.getInvceLineItmPriceCmpntCdCdgSys() != null) {
			invoicelineitempricecomponentcodecoding.setSystem(i.getInvceLineItmPriceCmpntCdCdgSys());
		}
		/******************** Invce_LineItm_PriceCmpnt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(i.getInvceLineItmPriceCmpntCdCdgUsrSltd() != null) {
			invoicelineitempricecomponentcodecoding.setUserSelected(Boolean.parseBoolean(i.getInvceLineItmPriceCmpntCdCdgUsrSltd()));
		}
		/******************** Invce_LineItm_PriceCmpnt_Cd_Cdg_Vrsn ********************************************************************************/
		if(i.getInvceLineItmPriceCmpntCdCdgVrsn() != null) {
			invoicelineitempricecomponentcodecoding.setVersion(i.getInvceLineItmPriceCmpntCdCdgVrsn());
		}
		/******************** Invce_LineItm_PriceCmpnt_Cd_Txt ********************************************************************************/
		if(i.getInvceLineItmPriceCmpntCdTxt() != null) {
			invoicelineitempricecomponentcode.setText(i.getInvceLineItmPriceCmpntCdTxt());
		}
		/******************** Invce_LineItm_PriceCmpnt_Factor ********************************************************************************/
		if(i.getInvceLineItmPriceCmpntFactor() != null) {
			invoicelineitempricecomponent.setFactor(Double.parseDouble((i.getInvceLineItmPriceCmpntFactor())));
		}
		/******************** invoicelineitempricecomponenttype ********************************************************************************/
		org.hl7.fhir.r4.model.Invoice.InvoicePriceComponentTypeEnumFactory invoicelineitempricecomponenttype =  new org.hl7.fhir.r4.model.Invoice.InvoicePriceComponentTypeEnumFactory();
		invoicelineitempricecomponent.setType(invoicelineitempricecomponenttype.fromCode(i.getInvceLineItmPriceCmpntTyp()));

		/******************** Invce_LineItm_Sqnc ********************************************************************************/
		if(i.getInvceLineItmSqnc() != null) {
			invoicelineitem.setSequence(Integer.parseInt(i.getInvceLineItmSqnc()));
		}
		/******************** invoicenote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation invoicenote =  new org.hl7.fhir.r4.model.Annotation();
		invoice.addNote(invoicenote);

		/******************** Invce_Nt_AthrRfrnc ********************************************************************************/
		if(i.getInvceNtAthrRfrnc() != null) {
			invoicenote.setAuthor( new org.hl7.fhir.r4.model.Reference(i.getInvceNtAthrRfrnc()));
		}
		/******************** Invce_Nt_AthrStrgTyp ********************************************************************************/
		if(i.getInvceNtAthrStrgTyp() != null) {
			invoicenote.setAuthor( new org.hl7.fhir.r4.model.StringType(i.getInvceNtAthrStrgTyp()));
		}
		/******************** Invce_Nt_Txt ********************************************************************************/
		if(i.getInvceNtTxt() != null) {
			invoicenote.setText(i.getInvceNtTxt());
		}
		/******************** Invce_Nt_Time ********************************************************************************/
		if(i.getInvceNtTime() != null) {
			java.text.SimpleDateFormat Invce_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Invce_Nt_Timedate = Invce_Nt_Timesdf.parse(i.getInvceNtTime());
			invoicenote.setTime(Invce_Nt_Timedate);
		}
		/******************** invoiceparticipant ********************************************************************************/
		org.hl7.fhir.r4.model.Invoice.InvoiceParticipantComponent invoiceparticipant =  new org.hl7.fhir.r4.model.Invoice.InvoiceParticipantComponent();
		invoice.addParticipant(invoiceparticipant);

		/******************** Invce_Prtcpnt_Actor ********************************************************************************/
		if(i.getInvcePrtcpntActor() != null) {
			invoiceparticipant.setActor( new org.hl7.fhir.r4.model.Reference(i.getInvcePrtcpntActor()));
		}
		/******************** invoiceparticipantrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept invoiceparticipantrole =  new org.hl7.fhir.r4.model.CodeableConcept();
		invoiceparticipant.setRole(invoiceparticipantrole);

		/******************** invoiceparticipantrolecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding invoiceparticipantrolecoding =  new org.hl7.fhir.r4.model.Coding();
		invoiceparticipantrole.addCoding(invoiceparticipantrolecoding);

		/******************** Invce_Prtcpnt_Role_Cdg_Cd ********************************************************************************/
		if(i.getInvcePrtcpntRoleCdgCd() != null) {
			invoiceparticipantrolecoding.setCode(i.getInvcePrtcpntRoleCdgCd());
		}
		/******************** Invce_Prtcpnt_Role_Cdg_Dsply ********************************************************************************/
		if(i.getInvcePrtcpntRoleCdgDsply() != null) {
			invoiceparticipantrolecoding.setDisplay(i.getInvcePrtcpntRoleCdgDsply());
		}
		/******************** Invce_Prtcpnt_Role_Cdg_Sys ********************************************************************************/
		if(i.getInvcePrtcpntRoleCdgSys() != null) {
			invoiceparticipantrolecoding.setSystem(i.getInvcePrtcpntRoleCdgSys());
		}
		/******************** Invce_Prtcpnt_Role_Cdg_UsrSltd ********************************************************************************/
		if(i.getInvcePrtcpntRoleCdgUsrSltd() != null) {
			invoiceparticipantrolecoding.setUserSelected(Boolean.parseBoolean(i.getInvcePrtcpntRoleCdgUsrSltd()));
		}
		/******************** Invce_Prtcpnt_Role_Cdg_Vrsn ********************************************************************************/
		if(i.getInvcePrtcpntRoleCdgVrsn() != null) {
			invoiceparticipantrolecoding.setVersion(i.getInvcePrtcpntRoleCdgVrsn());
		}
		/******************** Invce_Prtcpnt_Role_Txt ********************************************************************************/
		if(i.getInvcePrtcpntRoleTxt() != null) {
			invoiceparticipantrole.setText(i.getInvcePrtcpntRoleTxt());
		}
		/******************** Invce_PymntTrms ********************************************************************************/
		if(i.getInvcePymntTrms() != null) {
			invoice.setPaymentTerms(i.getInvcePymntTrms());
		}
		/******************** Invce_Recipient ********************************************************************************/
		if(i.getInvceRecipient() != null) {
			invoice.setRecipient( new org.hl7.fhir.r4.model.Reference(i.getInvceRecipient()));
		}
		/******************** invoicestatus ********************************************************************************/
		org.hl7.fhir.r4.model.Invoice.InvoiceStatusEnumFactory invoicestatus =  new org.hl7.fhir.r4.model.Invoice.InvoiceStatusEnumFactory();
		invoice.setStatus(invoicestatus.fromCode(i.getInvceSts()));

		/******************** Invce_Sbjct ********************************************************************************/
		if(i.getInvceSbjct() != null) {
			invoice.setSubject( new org.hl7.fhir.r4.model.Reference(i.getInvceSbjct()));
		}
		/******************** invoicetotalgross ********************************************************************************/
		org.hl7.fhir.r4.model.Money invoicetotalgross =  new org.hl7.fhir.r4.model.Money();
		invoice.setTotalGross(invoicetotalgross);

		/******************** Invce_TotalGross_Crncy ********************************************************************************/
		if(i.getInvceTotalGrossCrncy() != null) {
			invoicetotalgross.setCurrency(i.getInvceTotalGrossCrncy());
		}
		/******************** Invce_TotalGross_Vl ********************************************************************************/
		if(i.getInvceTotalGrossVl() != null) {
			invoicetotalgross.setValue(Double.parseDouble((i.getInvceTotalGrossVl())));
		}
		/******************** invoicetotalnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money invoicetotalnet =  new org.hl7.fhir.r4.model.Money();
		invoice.setTotalNet(invoicetotalnet);

		/******************** Invce_TotalNet_Crncy ********************************************************************************/
		if(i.getInvceTotalNetCrncy() != null) {
			invoicetotalnet.setCurrency(i.getInvceTotalNetCrncy());
		}
		/******************** Invce_TotalNet_Vl ********************************************************************************/
		if(i.getInvceTotalNetVl() != null) {
			invoicetotalnet.setValue(Double.parseDouble((i.getInvceTotalNetVl())));
		}
		/******************** invoicetotalpricecomponent ********************************************************************************/
		org.hl7.fhir.r4.model.Invoice.InvoiceLineItemPriceComponentComponent invoicetotalpricecomponent =  new org.hl7.fhir.r4.model.Invoice.InvoiceLineItemPriceComponentComponent();
		invoice.addTotalPriceComponent(invoicetotalpricecomponent);

		/******************** invoicetotalpricecomponentamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money invoicetotalpricecomponentamount =  new org.hl7.fhir.r4.model.Money();
		invoicetotalpricecomponent.setAmount(invoicetotalpricecomponentamount);

		/******************** Invce_TotalPriceCmpnt_Amnt_Crncy ********************************************************************************/
		if(i.getInvceTotalPriceCmpntAmntCrncy() != null) {
			invoicetotalpricecomponentamount.setCurrency(i.getInvceTotalPriceCmpntAmntCrncy());
		}
		/******************** Invce_TotalPriceCmpnt_Amnt_Vl ********************************************************************************/
		if(i.getInvceTotalPriceCmpntAmntVl() != null) {
			invoicetotalpricecomponentamount.setValue(Double.parseDouble((i.getInvceTotalPriceCmpntAmntVl())));
		}
		/******************** invoicetotalpricecomponentcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept invoicetotalpricecomponentcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		invoicetotalpricecomponent.setCode(invoicetotalpricecomponentcode);

		/******************** invoicetotalpricecomponentcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding invoicetotalpricecomponentcodecoding =  new org.hl7.fhir.r4.model.Coding();
		invoicetotalpricecomponentcode.addCoding(invoicetotalpricecomponentcodecoding);

		/******************** Invce_TotalPriceCmpnt_Cd_Cdg_Cd ********************************************************************************/
		if(i.getInvceTotalPriceCmpntCdCdgCd() != null) {
			invoicetotalpricecomponentcodecoding.setCode(i.getInvceTotalPriceCmpntCdCdgCd());
		}
		/******************** Invce_TotalPriceCmpnt_Cd_Cdg_Dsply ********************************************************************************/
		if(i.getInvceTotalPriceCmpntCdCdgDsply() != null) {
			invoicetotalpricecomponentcodecoding.setDisplay(i.getInvceTotalPriceCmpntCdCdgDsply());
		}
		/******************** Invce_TotalPriceCmpnt_Cd_Cdg_Sys ********************************************************************************/
		if(i.getInvceTotalPriceCmpntCdCdgSys() != null) {
			invoicetotalpricecomponentcodecoding.setSystem(i.getInvceTotalPriceCmpntCdCdgSys());
		}
		/******************** Invce_TotalPriceCmpnt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(i.getInvceTotalPriceCmpntCdCdgUsrSltd() != null) {
			invoicetotalpricecomponentcodecoding.setUserSelected(Boolean.parseBoolean(i.getInvceTotalPriceCmpntCdCdgUsrSltd()));
		}
		/******************** Invce_TotalPriceCmpnt_Cd_Cdg_Vrsn ********************************************************************************/
		if(i.getInvceTotalPriceCmpntCdCdgVrsn() != null) {
			invoicetotalpricecomponentcodecoding.setVersion(i.getInvceTotalPriceCmpntCdCdgVrsn());
		}
		/******************** Invce_TotalPriceCmpnt_Cd_Txt ********************************************************************************/
		if(i.getInvceTotalPriceCmpntCdTxt() != null) {
			invoicetotalpricecomponentcode.setText(i.getInvceTotalPriceCmpntCdTxt());
		}
		/******************** Invce_TotalPriceCmpnt_Factor ********************************************************************************/
		if(i.getInvceTotalPriceCmpntFactor() != null) {
			invoicetotalpricecomponent.setFactor(Double.parseDouble((i.getInvceTotalPriceCmpntFactor())));
		}
		/******************** invoicetotalpricecomponenttype ********************************************************************************/
		org.hl7.fhir.r4.model.Invoice.InvoicePriceComponentTypeEnumFactory invoicetotalpricecomponenttype =  new org.hl7.fhir.r4.model.Invoice.InvoicePriceComponentTypeEnumFactory();
		invoicetotalpricecomponent.setType(invoicetotalpricecomponenttype.fromCode(i.getInvceTotalPriceCmpntTyp()));

		/******************** invoicetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept invoicetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		invoice.setType(invoicetype);

		/******************** invoicetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding invoicetypecoding =  new org.hl7.fhir.r4.model.Coding();
		invoicetype.addCoding(invoicetypecoding);

		/******************** Invce_Typ_Cdg_Cd ********************************************************************************/
		if(i.getInvceTypCdgCd() != null) {
			invoicetypecoding.setCode(i.getInvceTypCdgCd());
		}
		/******************** Invce_Typ_Cdg_Dsply ********************************************************************************/
		if(i.getInvceTypCdgDsply() != null) {
			invoicetypecoding.setDisplay(i.getInvceTypCdgDsply());
		}
		/******************** Invce_Typ_Cdg_Sys ********************************************************************************/
		if(i.getInvceTypCdgSys() != null) {
			invoicetypecoding.setSystem(i.getInvceTypCdgSys());
		}
		/******************** Invce_Typ_Cdg_UsrSltd ********************************************************************************/
		if(i.getInvceTypCdgUsrSltd() != null) {
			invoicetypecoding.setUserSelected(Boolean.parseBoolean(i.getInvceTypCdgUsrSltd()));
		}
		/******************** Invce_Typ_Cdg_Vrsn ********************************************************************************/
		if(i.getInvceTypCdgVrsn() != null) {
			invoicetypecoding.setVersion(i.getInvceTypCdgVrsn());
		}
		/******************** Invce_Typ_Txt ********************************************************************************/
		if(i.getInvceTypTxt() != null) {
			invoicetype.setText(i.getInvceTypTxt());
		}
		return invoice;
	}
}
