package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Invoice.
 * @see .Invoice
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class InvoiceConversion 
{
	public Patient Invoices(main.templateoutput.Model.Invoice invoice) 
	{
			Patient  Invoiceobj = new Patient(); 

						Invoiceobj.addIdentifier(HapiFHIRHelpers.createIdentifier(invoice.getInvoiceIdentifierIdentifierUse() /** { "tree" :"Invoice.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, invoice.getInvcDntfrDntfrTpCcCSstm() /** { "tree" :"Invoice.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, invoice.getInvcDntfrDntfrTpCcCVrsn() /** { "tree" :"Invoice.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, invoice.getInvcDntfrDntfrTpCcCCde() /** { "tree" :"Invoice.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, invoice.getInvcDntfrDntfrTpCcCDsplay() /** { "tree" :"Invoice.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, invoice.getInvcDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Invoice.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, invoice.getInvcDntfrDntfrTpCcTxt() /** { "tree" :"Invoice.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, invoice.getInvcDntfrDntfrPrdPrdStrt() /** { "tree" :"Invoice.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, invoice.getInvcDntfrDntfrPrdPrdNd() /** { "tree" :"Invoice.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, invoice.getInvcDntfrDntfrSsgnr() /** { "tree" :"Invoice.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, invoice.getInvcDntfrDntfrVlue() /** { "tree" :"Invoice.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, invoice.getInvcDntfrDntfrSstm() /** { "tree" :"Invoice.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Invoiceobj.setStatus(HapiFHIRHelpers.createcode(invoice.getInvoiceStatusCode() /** { "tree" :"Invoice.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Invoiceobj.setCancelledReason(HapiFHIRHelpers.createstring(invoice.getInvoiceCancelledReasonString() /** { "tree" :"Invoice.cancelledReason", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCancelledReason"} **/
						));
Invoiceobj.setType(HapiFHIRHelpers.createCodeableConcept(invoice.getInvoiceTypeCcCodingCSystem() /** { "tree" :"Invoice.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setSystem"} **/
						, invoice.getInvoiceTypeCcCodingCVersion() /** { "tree" :"Invoice.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setVersion"} **/
						, invoice.getInvoiceTypeCcCodingCCode() /** { "tree" :"Invoice.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setCode"} **/
						, invoice.getInvoiceTypeCcCodingCDisplay() /** { "tree" :"Invoice.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setDisplay"} **/
						, invoice.getInvcTpCcCdngCSrSlctd() /** { "tree" :"Invoice.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, invoice.getInvoiceTypeCcText() /** { "tree" :"Invoice.type", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, setText"} **/
						));
Invoiceobj.setSubject(HapiFHIRHelpers.createReference(invoice.getInvoiceSubjectReference() /** { "tree" :"Invoice.subject", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubject"} **/
						));
Invoiceobj.setRecipient(HapiFHIRHelpers.createReference(invoice.getInvoiceRecipientReference() /** { "tree" :"Invoice.recipient", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRecipient"} **/
						));
Invoiceobj.setDate(HapiFHIRHelpers.createdateTime(invoice.getInvoiceDateDateTime() /** { "tree" :"Invoice.date", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDate"} **/
						));
Invoiceobj.setRole(HapiFHIRHelpers.createCodeableConcept(invoice.getInvcPrtcpntRlCcCdngCSstm() /** { "tree" :"Invoice.participant.role", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addParticipant"] , "methodName" : "setRole, addCoding, setSystem"} **/
						, invoice.getInvcPrtcpntRlCcCdngCVrsn() /** { "tree" :"Invoice.participant.role", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addParticipant"] , "methodName" : "setRole, addCoding, setVersion"} **/
						, invoice.getInvcPrtcpntRlCcCdngCCde() /** { "tree" :"Invoice.participant.role", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addParticipant"] , "methodName" : "setRole, addCoding, setCode"} **/
						, invoice.getInvcPrtcpntRlCcCdngCDsplay() /** { "tree" :"Invoice.participant.role", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addParticipant"] , "methodName" : "setRole, addCoding, setDisplay"} **/
						, invoice.getInvcPrtcpntRlCcCdngCSrSlctd() /** { "tree" :"Invoice.participant.role", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addParticipant"] , "methodName" : "setRole, addCoding, setUserSelected"} **/
						, invoice.getInvoiceParticipantRoleCcText() /** { "tree" :"Invoice.participant.role", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addParticipant"] , "methodName" : "setRole, setText"} **/
						));
Invoiceobj.setActor(HapiFHIRHelpers.createReference(invoice.getInvcPrtcpntCtrRfrnce() /** { "tree" :"Invoice.participant.actor", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addParticipant"] , "methodName" : "setActor"} **/
						));
Invoiceobj.setIssuer(HapiFHIRHelpers.createReference(invoice.getInvoiceIssuerReference() /** { "tree" :"Invoice.issuer", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIssuer"} **/
						));
Invoiceobj.setAccount(HapiFHIRHelpers.createReference(invoice.getInvoiceAccountReference() /** { "tree" :"Invoice.account", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAccount"} **/
						));
Invoiceobj.setSequence(HapiFHIRHelpers.createpositiveInt(invoice.getInvcLntmSqncPstvnt() /** { "tree" :"Invoice.lineItem.sequence", "datatype" : "positiveInt", "cardinality" : "ZeroOne", "elementtree" : ["addLineItem"] , "methodName" : "setSequence"} **/
						));
Invoiceobj.setChargeItemReference(chargeitem)(HapiFHIRHelpers.createReference(invoice.getInvcLntmChrgtmRfrncRfrnce() /** { "tree" :"Invoice.lineItem.chargeItemReference", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addLineItem"] , "methodName" : "setChargeItemReference(chargeitem)"} **/
						));
Invoiceobj.setChargeItemCodeableconcept(HapiFHIRHelpers.createCodeableConcept(invoice.getInvcLntmChrgtmCdblcncptCcCdngCSstm() /** { "tree" :"Invoice.lineItem.chargeItemCodeableconcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addLineItem"] , "methodName" : "setChargeItemCodeableconcept, addCoding, setSystem"} **/
						, invoice.getInvcLntmChrgtmCdblcncptCcCdngCVrsn() /** { "tree" :"Invoice.lineItem.chargeItemCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addLineItem"] , "methodName" : "setChargeItemCodeableconcept, addCoding, setVersion"} **/
						, invoice.getInvcLntmChrgtmCdblcncptCcCdngCCde() /** { "tree" :"Invoice.lineItem.chargeItemCodeableconcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addLineItem"] , "methodName" : "setChargeItemCodeableconcept, addCoding, setCode"} **/
						, invoice.getInvcLntmChrgtmCdblcncptCcCdngCDsplay() /** { "tree" :"Invoice.lineItem.chargeItemCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addLineItem"] , "methodName" : "setChargeItemCodeableconcept, addCoding, setDisplay"} **/
						, invoice.getInvcLntmChrgtmCdblcncptCcCdngCSrSlctd() /** { "tree" :"Invoice.lineItem.chargeItemCodeableconcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addLineItem"] , "methodName" : "setChargeItemCodeableconcept, addCoding, setUserSelected"} **/
						, invoice.getInvcLntmChrgtmCdblcncptCcTxt() /** { "tree" :"Invoice.lineItem.chargeItemCodeableconcept", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addLineItem"] , "methodName" : "setChargeItemCodeableconcept, setText"} **/
						));
Invoiceobj.setType(HapiFHIRHelpers.createcode(invoice.getInvcLntmPrcCmpnntTpCde() /** { "tree" :"Invoice.lineItem.priceComponent.type", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addLineItem", "addPriceComponent"] , "methodName" : "setType"} **/
						));
Invoiceobj.setCode(HapiFHIRHelpers.createCodeableConcept(invoice.getInvcLntmPrcCmpnntCdCcCdngCSstm() /** { "tree" :"Invoice.lineItem.priceComponent.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addLineItem", "addPriceComponent"] , "methodName" : "setCode, addCoding, setSystem"} **/
						, invoice.getInvcLntmPrcCmpnntCdCcCdngCVrsn() /** { "tree" :"Invoice.lineItem.priceComponent.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addLineItem", "addPriceComponent"] , "methodName" : "setCode, addCoding, setVersion"} **/
						, invoice.getInvcLntmPrcCmpnntCdCcCdngCCde() /** { "tree" :"Invoice.lineItem.priceComponent.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addLineItem", "addPriceComponent"] , "methodName" : "setCode, addCoding, setCode"} **/
						, invoice.getInvcLntmPrcCmpnntCdCcCdngCDsplay() /** { "tree" :"Invoice.lineItem.priceComponent.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addLineItem", "addPriceComponent"] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, invoice.getInvcLntmPrcCmpnntCdCcCdngCSrSlctd() /** { "tree" :"Invoice.lineItem.priceComponent.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addLineItem", "addPriceComponent"] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, invoice.getInvcLntmPrcCmpnntCdCcTxt() /** { "tree" :"Invoice.lineItem.priceComponent.code", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addLineItem", "addPriceComponent"] , "methodName" : "setCode, setText"} **/
						));
Invoiceobj.setFactor(HapiFHIRHelpers.createdecimal(invoice.getInvcLntmPrcCmpnntFctrDcml() /** { "tree" :"Invoice.lineItem.priceComponent.factor", "datatype" : "decimal", "cardinality" : "ZeroOne", "elementtree" : ["addLineItem", "addPriceComponent"] , "methodName" : "setFactor"} **/
						));
Invoiceobj.setAmount(HapiFHIRHelpers.createMoney(invoice.getInvcLntmPrcCmpnntMntMnCrrncy() /** { "tree" :"Invoice.lineItem.priceComponent.amount", "datatype" : "Money, code", "cardinality" : "ZeroOne", "elementtree" : ["addLineItem", "addPriceComponent"] , "methodName" : "setAmount, setCurrency"} **/
						, invoice.getInvcLntmPrcCmpnntMntMnVlue() /** { "tree" :"Invoice.lineItem.priceComponent.amount", "datatype" : "Money, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addLineItem", "addPriceComponent"] , "methodName" : "setAmount, setVal"} **/
						));
Invoiceobj.addTotalPriceComponent(HapiFHIRHelpers.createpriceComponent(invoice.getInvcTtlPrcCmpnntPrcCmpnnt() /** { "tree" :"Invoice.totalPriceComponent", "datatype" : "priceComponent", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTotalPriceComponent"} **/
						));
Invoiceobj.setTotalNet(HapiFHIRHelpers.createMoney(invoice.getInvoiceTotalNetMoneyCurrency() /** { "tree" :"Invoice.totalNet", "datatype" : "Money, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTotalNet, setCurrency"} **/
						, invoice.getInvoiceTotalNetMoneyValue() /** { "tree" :"Invoice.totalNet", "datatype" : "Money, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTotalNet, setVal"} **/
						));
Invoiceobj.setTotalGross(HapiFHIRHelpers.createMoney(invoice.getInvoiceTotalGrossMoneyCurrency() /** { "tree" :"Invoice.totalGross", "datatype" : "Money, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTotalGross, setCurrency"} **/
						, invoice.getInvoiceTotalGrossMoneyValue() /** { "tree" :"Invoice.totalGross", "datatype" : "Money, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTotalGross, setVal"} **/
						));
Invoiceobj.setPaymentTerms(HapiFHIRHelpers.createmarkdown(invoice.getInvoicePaymentTermsMarkdown() /** { "tree" :"Invoice.paymentTerms", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPaymentTerms"} **/
						));
Invoiceobj.addNote(HapiFHIRHelpers.createAnnotation(invoice.getInvoiceNoteAnnotationTime() /** { "tree" :"Invoice.note", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setTime"} **/
						, invoice.getInvoiceNoteAnnotationText() /** { "tree" :"Invoice.note", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setText"} **/
						, invoice.getInvcNtNnttnThrRfrnce() /** { "tree" :"Invoice.note", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorReference"} **/
						, invoice.getInvcNtNnttnThrStrng() /** { "tree" :"Invoice.note", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorString"} **/
		));
	}
}
