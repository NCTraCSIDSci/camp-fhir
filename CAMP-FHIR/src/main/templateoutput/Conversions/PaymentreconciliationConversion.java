package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Paymentreconciliation.
 * @see .Paymentreconciliation
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class PaymentreconciliationConversion 
{
	public Patient Paymentreconciliations(main.templateoutput.Model.Paymentreconciliation paymentreconciliation) 
	{
			Patient  Paymentreconciliationobj = new Patient(); 

						Paymentreconciliationobj.addIdentifier(HapiFHIRHelpers.createIdentifier(paymentreconciliation.getPmntRcncltnDntfrDntfrSe() /** { "tree" :"PaymentReconciliation.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, paymentreconciliation.getPmntRcncltnDntfrDntfrTpCcCSstm() /** { "tree" :"PaymentReconciliation.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, paymentreconciliation.getPmntRcncltnDntfrDntfrTpCcCVrsn() /** { "tree" :"PaymentReconciliation.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, paymentreconciliation.getPmntRcncltnDntfrDntfrTpCcCCde() /** { "tree" :"PaymentReconciliation.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, paymentreconciliation.getPmntRcncltnDntfrDntfrTpCcCDsplay() /** { "tree" :"PaymentReconciliation.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, paymentreconciliation.getPmntRcncltnDntfrDntfrTpCcCSrSlctd() /** { "tree" :"PaymentReconciliation.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, paymentreconciliation.getPmntRcncltnDntfrDntfrTpCcTxt() /** { "tree" :"PaymentReconciliation.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, paymentreconciliation.getPmntRcncltnDntfrDntfrPrdPrdStrt() /** { "tree" :"PaymentReconciliation.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, paymentreconciliation.getPmntRcncltnDntfrDntfrPrdPrdNd() /** { "tree" :"PaymentReconciliation.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, paymentreconciliation.getPmntRcncltnDntfrDntfrSsgnr() /** { "tree" :"PaymentReconciliation.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, paymentreconciliation.getPmntRcncltnDntfrDntfrVlue() /** { "tree" :"PaymentReconciliation.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, paymentreconciliation.getPmntRcncltnDntfrDntfrSstm() /** { "tree" :"PaymentReconciliation.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Paymentreconciliationobj.setStatus(HapiFHIRHelpers.createcode(paymentreconciliation.getPaymentReconciliationStatusCode() /** { "tree" :"PaymentReconciliation.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Paymentreconciliationobj.setPeriod(HapiFHIRHelpers.createPeriod(paymentreconciliation.getPmntRcncltnPrdPrdStrt() /** { "tree" :"PaymentReconciliation.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPeriod, setStart"} **/
						, paymentreconciliation.getPmntRcncltnPrdPrdNd() /** { "tree" :"PaymentReconciliation.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPeriod, setEnd"} **/
						));
Paymentreconciliationobj.setCreated(HapiFHIRHelpers.createdateTime(paymentreconciliation.getPmntRcncltnCrtdDtTme() /** { "tree" :"PaymentReconciliation.created", "datatype" : "dateTime", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCreated"} **/
						));
Paymentreconciliationobj.setPaymentIssuer(HapiFHIRHelpers.createReference(paymentreconciliation.getPmntRcncltnPmntssrRfrnce() /** { "tree" :"PaymentReconciliation.paymentIssuer", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPaymentIssuer"} **/
						));
Paymentreconciliationobj.setRequest(HapiFHIRHelpers.createReference(paymentreconciliation.getPmntRcncltnRqstRfrnce() /** { "tree" :"PaymentReconciliation.request", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequest"} **/
						));
Paymentreconciliationobj.setRequestor(HapiFHIRHelpers.createReference(paymentreconciliation.getPmntRcncltnRqstrRfrnce() /** { "tree" :"PaymentReconciliation.requestor", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequestor"} **/
						));
Paymentreconciliationobj.setOutcome(HapiFHIRHelpers.createcode(paymentreconciliation.getPaymentReconciliationOutcomeCode() /** { "tree" :"PaymentReconciliation.outcome", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOutcome"} **/
						));
Paymentreconciliationobj.setDisposition(HapiFHIRHelpers.createstring(paymentreconciliation.getPmntRcncltnDspstnStrng() /** { "tree" :"PaymentReconciliation.disposition", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDisposition"} **/
						));
Paymentreconciliationobj.setPaymentDate(HapiFHIRHelpers.createdate(paymentreconciliation.getPmntRcncltnPmntDtDte() /** { "tree" :"PaymentReconciliation.paymentDate", "datatype" : "date", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setPaymentDate"} **/
						));
Paymentreconciliationobj.setPaymentAmount(HapiFHIRHelpers.createMoney(paymentreconciliation.getPmntRcncltnPmntmntMnCrrncy() /** { "tree" :"PaymentReconciliation.paymentAmount", "datatype" : "Money, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setPaymentAmount, setCurrency"} **/
						, paymentreconciliation.getPmntRcncltnPmntmntMnVlue() /** { "tree" :"PaymentReconciliation.paymentAmount", "datatype" : "Money, decimal", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setPaymentAmount, setVal"} **/
						));
Paymentreconciliationobj.setPaymentIdentifier(HapiFHIRHelpers.createIdentifier(paymentreconciliation.getPmntRcncltnPmntdntfrDntfrSe() /** { "tree" :"PaymentReconciliation.paymentIdentifier", "datatype" : "Identifier, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPaymentIdentifier, setUse"} **/
						, paymentreconciliation.getPmntRcncltnPmntdntfrDntfrTpCcCSstm() /** { "tree" :"PaymentReconciliation.paymentIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPaymentIdentifier, setType, addCoding, setSystem"} **/
						, paymentreconciliation.getPmntRcncltnPmntdntfrDntfrTpCcCVrsn() /** { "tree" :"PaymentReconciliation.paymentIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPaymentIdentifier, setType, addCoding, setVersion"} **/
						, paymentreconciliation.getPmntRcncltnPmntdntfrDntfrTpCcCCde() /** { "tree" :"PaymentReconciliation.paymentIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPaymentIdentifier, setType, addCoding, setCode"} **/
						, paymentreconciliation.getPmntRcncltnPmntdntfrDntfrTpCcCDsplay() /** { "tree" :"PaymentReconciliation.paymentIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPaymentIdentifier, setType, addCoding, setDisplay"} **/
						, paymentreconciliation.getPmntRcncltnPmntdntfrDntfrTpCcCSrSlctd() /** { "tree" :"PaymentReconciliation.paymentIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPaymentIdentifier, setType, addCoding, setUserSelected"} **/
						, paymentreconciliation.getPmntRcncltnPmntdntfrDntfrTpCcTxt() /** { "tree" :"PaymentReconciliation.paymentIdentifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPaymentIdentifier, setType, setText"} **/
						, paymentreconciliation.getPmntRcncltnPmntdntfrDntfrPrdPrdStrt() /** { "tree" :"PaymentReconciliation.paymentIdentifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPaymentIdentifier, setPeriod, setStart"} **/
						, paymentreconciliation.getPmntRcncltnPmntdntfrDntfrPrdPrdNd() /** { "tree" :"PaymentReconciliation.paymentIdentifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPaymentIdentifier, setPeriod, setEnd"} **/
						, paymentreconciliation.getPmntRcncltnPmntdntfrDntfrSsgnr() /** { "tree" :"PaymentReconciliation.paymentIdentifier", "datatype" : "Identifier, Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPaymentIdentifier, setAssigner"} **/
						, paymentreconciliation.getPmntRcncltnPmntdntfrDntfrVlue() /** { "tree" :"PaymentReconciliation.paymentIdentifier", "datatype" : "Identifier, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPaymentIdentifier, setValue"} **/
						, paymentreconciliation.getPmntRcncltnPmntdntfrDntfrSstm() /** { "tree" :"PaymentReconciliation.paymentIdentifier", "datatype" : "Identifier, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPaymentIdentifier, setSystem"} **/
						));
Paymentreconciliationobj.setIdentifier(HapiFHIRHelpers.createIdentifier(paymentreconciliation.getPmntRcncltnDtlDntfrDntfrSe() /** { "tree" :"PaymentReconciliation.detail.identifier", "datatype" : "Identifier, code", "cardinality" : "ZeroOne", "elementtree" : ["addDetail"] , "methodName" : "setIdentifier, setUse"} **/
						, paymentreconciliation.getPmntRcncltnDtlDntfrDntfrTpCcCSstm() /** { "tree" :"PaymentReconciliation.detail.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addDetail"] , "methodName" : "setIdentifier, setType, addCoding, setSystem"} **/
						, paymentreconciliation.getPmntRcncltnDtlDntfrDntfrTpCcCVrsn() /** { "tree" :"PaymentReconciliation.detail.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addDetail"] , "methodName" : "setIdentifier, setType, addCoding, setVersion"} **/
						, paymentreconciliation.getPmntRcncltnDtlDntfrDntfrTpCcCCde() /** { "tree" :"PaymentReconciliation.detail.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addDetail"] , "methodName" : "setIdentifier, setType, addCoding, setCode"} **/
						, paymentreconciliation.getPmntRcncltnDtlDntfrDntfrTpCcCDsplay() /** { "tree" :"PaymentReconciliation.detail.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addDetail"] , "methodName" : "setIdentifier, setType, addCoding, setDisplay"} **/
						, paymentreconciliation.getPmntRcncltnDtlDntfrDntfrTpCcCSrSlctd() /** { "tree" :"PaymentReconciliation.detail.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addDetail"] , "methodName" : "setIdentifier, setType, addCoding, setUserSelected"} **/
						, paymentreconciliation.getPmntRcncltnDtlDntfrDntfrTpCcTxt() /** { "tree" :"PaymentReconciliation.detail.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addDetail"] , "methodName" : "setIdentifier, setType, setText"} **/
						, paymentreconciliation.getPmntRcncltnDtlDntfrDntfrPrdPrdStrt() /** { "tree" :"PaymentReconciliation.detail.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addDetail"] , "methodName" : "setIdentifier, setPeriod, setStart"} **/
						, paymentreconciliation.getPmntRcncltnDtlDntfrDntfrPrdPrdNd() /** { "tree" :"PaymentReconciliation.detail.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addDetail"] , "methodName" : "setIdentifier, setPeriod, setEnd"} **/
						, paymentreconciliation.getPmntRcncltnDtlDntfrDntfrSsgnr() /** { "tree" :"PaymentReconciliation.detail.identifier", "datatype" : "Identifier, Reference", "cardinality" : "ZeroOne", "elementtree" : ["addDetail"] , "methodName" : "setIdentifier, setAssigner"} **/
						, paymentreconciliation.getPmntRcncltnDtlDntfrDntfrVlue() /** { "tree" :"PaymentReconciliation.detail.identifier", "datatype" : "Identifier, string", "cardinality" : "ZeroOne", "elementtree" : ["addDetail"] , "methodName" : "setIdentifier, setValue"} **/
						, paymentreconciliation.getPmntRcncltnDtlDntfrDntfrSstm() /** { "tree" :"PaymentReconciliation.detail.identifier", "datatype" : "Identifier, uri", "cardinality" : "ZeroOne", "elementtree" : ["addDetail"] , "methodName" : "setIdentifier, setSystem"} **/
						));
Paymentreconciliationobj.setPredecessor(HapiFHIRHelpers.createIdentifier(paymentreconciliation.getPmntRcncltnDtlPrdcssrDntfrSe() /** { "tree" :"PaymentReconciliation.detail.predecessor", "datatype" : "Identifier, code", "cardinality" : "ZeroOne", "elementtree" : ["addDetail"] , "methodName" : "setPredecessor, setUse"} **/
						, paymentreconciliation.getPmntRcncltnDtlPrdcssrDntfrTpCcCSstm() /** { "tree" :"PaymentReconciliation.detail.predecessor", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addDetail"] , "methodName" : "setPredecessor, setType, addCoding, setSystem"} **/
						, paymentreconciliation.getPmntRcncltnDtlPrdcssrDntfrTpCcCVrsn() /** { "tree" :"PaymentReconciliation.detail.predecessor", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addDetail"] , "methodName" : "setPredecessor, setType, addCoding, setVersion"} **/
						, paymentreconciliation.getPmntRcncltnDtlPrdcssrDntfrTpCcCCde() /** { "tree" :"PaymentReconciliation.detail.predecessor", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addDetail"] , "methodName" : "setPredecessor, setType, addCoding, setCode"} **/
						, paymentreconciliation.getPmntRcncltnDtlPrdcssrDntfrTpCcCDsplay() /** { "tree" :"PaymentReconciliation.detail.predecessor", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addDetail"] , "methodName" : "setPredecessor, setType, addCoding, setDisplay"} **/
						, paymentreconciliation.getPmntRcncltnDtlPrdcssrDntfrTpCcCSrSlctd() /** { "tree" :"PaymentReconciliation.detail.predecessor", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addDetail"] , "methodName" : "setPredecessor, setType, addCoding, setUserSelected"} **/
						, paymentreconciliation.getPmntRcncltnDtlPrdcssrDntfrTpCcTxt() /** { "tree" :"PaymentReconciliation.detail.predecessor", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addDetail"] , "methodName" : "setPredecessor, setType, setText"} **/
						, paymentreconciliation.getPmntRcncltnDtlPrdcssrDntfrPrdPrdStrt() /** { "tree" :"PaymentReconciliation.detail.predecessor", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addDetail"] , "methodName" : "setPredecessor, setPeriod, setStart"} **/
						, paymentreconciliation.getPmntRcncltnDtlPrdcssrDntfrPrdPrdNd() /** { "tree" :"PaymentReconciliation.detail.predecessor", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addDetail"] , "methodName" : "setPredecessor, setPeriod, setEnd"} **/
						, paymentreconciliation.getPmntRcncltnDtlPrdcssrDntfrSsgnr() /** { "tree" :"PaymentReconciliation.detail.predecessor", "datatype" : "Identifier, Reference", "cardinality" : "ZeroOne", "elementtree" : ["addDetail"] , "methodName" : "setPredecessor, setAssigner"} **/
						, paymentreconciliation.getPmntRcncltnDtlPrdcssrDntfrVlue() /** { "tree" :"PaymentReconciliation.detail.predecessor", "datatype" : "Identifier, string", "cardinality" : "ZeroOne", "elementtree" : ["addDetail"] , "methodName" : "setPredecessor, setValue"} **/
						, paymentreconciliation.getPmntRcncltnDtlPrdcssrDntfrSstm() /** { "tree" :"PaymentReconciliation.detail.predecessor", "datatype" : "Identifier, uri", "cardinality" : "ZeroOne", "elementtree" : ["addDetail"] , "methodName" : "setPredecessor, setSystem"} **/
						));
Paymentreconciliationobj.setType(HapiFHIRHelpers.createCodeableConcept(paymentreconciliation.getPmntRcncltnDtlTpCcCdngCSstm() /** { "tree" :"PaymentReconciliation.detail.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addDetail"] , "methodName" : "setType, addCoding, setSystem"} **/
						, paymentreconciliation.getPmntRcncltnDtlTpCcCdngCVrsn() /** { "tree" :"PaymentReconciliation.detail.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addDetail"] , "methodName" : "setType, addCoding, setVersion"} **/
						, paymentreconciliation.getPmntRcncltnDtlTpCcCdngCCde() /** { "tree" :"PaymentReconciliation.detail.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addDetail"] , "methodName" : "setType, addCoding, setCode"} **/
						, paymentreconciliation.getPmntRcncltnDtlTpCcCdngCDsplay() /** { "tree" :"PaymentReconciliation.detail.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addDetail"] , "methodName" : "setType, addCoding, setDisplay"} **/
						, paymentreconciliation.getPmntRcncltnDtlTpCcCdngCSrSlctd() /** { "tree" :"PaymentReconciliation.detail.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addDetail"] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, paymentreconciliation.getPmntRcncltnDtlTpCcTxt() /** { "tree" :"PaymentReconciliation.detail.type", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addDetail"] , "methodName" : "setType, setText"} **/
						));
Paymentreconciliationobj.setRequest(HapiFHIRHelpers.createReference(paymentreconciliation.getPmntRcncltnDtlRqstRfrnce() /** { "tree" :"PaymentReconciliation.detail.request", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addDetail"] , "methodName" : "setRequest"} **/
						));
Paymentreconciliationobj.setSubmitter(HapiFHIRHelpers.createReference(paymentreconciliation.getPmntRcncltnDtlSbmttrRfrnce() /** { "tree" :"PaymentReconciliation.detail.submitter", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addDetail"] , "methodName" : "setSubmitter"} **/
						));
Paymentreconciliationobj.setResponse(HapiFHIRHelpers.createReference(paymentreconciliation.getPmntRcncltnDtlRspnsRfrnce() /** { "tree" :"PaymentReconciliation.detail.response", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addDetail"] , "methodName" : "setResponse"} **/
						));
Paymentreconciliationobj.setDate(HapiFHIRHelpers.createdate(paymentreconciliation.getPmntRcncltnDtlDtDte() /** { "tree" :"PaymentReconciliation.detail.date", "datatype" : "date", "cardinality" : "ZeroOne", "elementtree" : ["addDetail"] , "methodName" : "setDate"} **/
						));
Paymentreconciliationobj.setResponsible(HapiFHIRHelpers.createReference(paymentreconciliation.getPmntRcncltnDtlRspnsblRfrnce() /** { "tree" :"PaymentReconciliation.detail.responsible", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addDetail"] , "methodName" : "setResponsible"} **/
						));
Paymentreconciliationobj.setPayee(HapiFHIRHelpers.createReference(paymentreconciliation.getPmntRcncltnDtlPRfrnce() /** { "tree" :"PaymentReconciliation.detail.payee", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addDetail"] , "methodName" : "setPayee"} **/
						));
Paymentreconciliationobj.setAmount(HapiFHIRHelpers.createMoney(paymentreconciliation.getPmntRcncltnDtlMntMnCrrncy() /** { "tree" :"PaymentReconciliation.detail.amount", "datatype" : "Money, code", "cardinality" : "ZeroOne", "elementtree" : ["addDetail"] , "methodName" : "setAmount, setCurrency"} **/
						, paymentreconciliation.getPmntRcncltnDtlMntMnVlue() /** { "tree" :"PaymentReconciliation.detail.amount", "datatype" : "Money, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addDetail"] , "methodName" : "setAmount, setVal"} **/
						));
Paymentreconciliationobj.setFormCode(HapiFHIRHelpers.createCodeableConcept(paymentreconciliation.getPmntRcncltnFrmCdCcCdngCSstm() /** { "tree" :"PaymentReconciliation.formCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFormCode, addCoding, setSystem"} **/
						, paymentreconciliation.getPmntRcncltnFrmCdCcCdngCVrsn() /** { "tree" :"PaymentReconciliation.formCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFormCode, addCoding, setVersion"} **/
						, paymentreconciliation.getPmntRcncltnFrmCdCcCdngCCde() /** { "tree" :"PaymentReconciliation.formCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFormCode, addCoding, setCode"} **/
						, paymentreconciliation.getPmntRcncltnFrmCdCcCdngCDsplay() /** { "tree" :"PaymentReconciliation.formCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFormCode, addCoding, setDisplay"} **/
						, paymentreconciliation.getPmntRcncltnFrmCdCcCdngCSrSlctd() /** { "tree" :"PaymentReconciliation.formCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFormCode, addCoding, setUserSelected"} **/
						, paymentreconciliation.getPmntRcncltnFrmCdCcTxt() /** { "tree" :"PaymentReconciliation.formCode", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFormCode, setText"} **/
						));
Paymentreconciliationobj.setType(HapiFHIRHelpers.createcode(paymentreconciliation.getPmntRcncltnPrcssNtTpCde() /** { "tree" :"PaymentReconciliation.processNote.type", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addProcessNote"] , "methodName" : "setType"} **/
						));
Paymentreconciliationobj.setText(HapiFHIRHelpers.createstring(paymentreconciliation.getPmntRcncltnPrcssNtTxtStrng() /** { "tree" :"PaymentReconciliation.processNote.text", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addProcessNote"] , "methodName" : "setText"} **/
		));
	}
}
