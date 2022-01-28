package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Paymentnotice.
 * @see .Paymentnotice
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class PaymentnoticeConversion 
{
	public Patient Paymentnotices(main.templateoutput.Model.Paymentnotice paymentnotice) 
	{
			Patient  Paymentnoticeobj = new Patient(); 

						Paymentnoticeobj.addIdentifier(HapiFHIRHelpers.createIdentifier(paymentnotice.getPmntNtcDntfrDntfrSe() /** { "tree" :"PaymentNotice.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, paymentnotice.getPmntNtcDntfrDntfrTpCcCSstm() /** { "tree" :"PaymentNotice.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, paymentnotice.getPmntNtcDntfrDntfrTpCcCVrsn() /** { "tree" :"PaymentNotice.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, paymentnotice.getPmntNtcDntfrDntfrTpCcCCde() /** { "tree" :"PaymentNotice.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, paymentnotice.getPmntNtcDntfrDntfrTpCcCDsplay() /** { "tree" :"PaymentNotice.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, paymentnotice.getPmntNtcDntfrDntfrTpCcCSrSlctd() /** { "tree" :"PaymentNotice.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, paymentnotice.getPmntNtcDntfrDntfrTpCcTxt() /** { "tree" :"PaymentNotice.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, paymentnotice.getPmntNtcDntfrDntfrPrdPrdStrt() /** { "tree" :"PaymentNotice.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, paymentnotice.getPmntNtcDntfrDntfrPrdPrdNd() /** { "tree" :"PaymentNotice.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, paymentnotice.getPmntNtcDntfrDntfrSsgnr() /** { "tree" :"PaymentNotice.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, paymentnotice.getPmntNtcDntfrDntfrVlue() /** { "tree" :"PaymentNotice.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, paymentnotice.getPmntNtcDntfrDntfrSstm() /** { "tree" :"PaymentNotice.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Paymentnoticeobj.setStatus(HapiFHIRHelpers.createcode(paymentnotice.getPaymentNoticeStatusCode() /** { "tree" :"PaymentNotice.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Paymentnoticeobj.setRequest(HapiFHIRHelpers.createReference(paymentnotice.getPaymentNoticeRequestReference() /** { "tree" :"PaymentNotice.request", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequest"} **/
						));
Paymentnoticeobj.setResponse(HapiFHIRHelpers.createReference(paymentnotice.getPaymentNoticeResponseReference() /** { "tree" :"PaymentNotice.response", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setResponse"} **/
						));
Paymentnoticeobj.setCreated(HapiFHIRHelpers.createdateTime(paymentnotice.getPaymentNoticeCreatedDateTime() /** { "tree" :"PaymentNotice.created", "datatype" : "dateTime", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCreated"} **/
						));
Paymentnoticeobj.setProvider(HapiFHIRHelpers.createReference(paymentnotice.getPaymentNoticeProviderReference() /** { "tree" :"PaymentNotice.provider", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setProvider"} **/
						));
Paymentnoticeobj.setPayment(HapiFHIRHelpers.createReference(paymentnotice.getPaymentNoticePaymentReference() /** { "tree" :"PaymentNotice.payment", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setPayment"} **/
						));
Paymentnoticeobj.setPaymentDate(HapiFHIRHelpers.createdate(paymentnotice.getPaymentNoticePaymentDateDate() /** { "tree" :"PaymentNotice.paymentDate", "datatype" : "date", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPaymentDate"} **/
						));
Paymentnoticeobj.setPayee(HapiFHIRHelpers.createReference(paymentnotice.getPaymentNoticePayeeReference() /** { "tree" :"PaymentNotice.payee", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPayee"} **/
						));
Paymentnoticeobj.setRecipient(HapiFHIRHelpers.createReference(paymentnotice.getPaymentNoticeRecipientReference() /** { "tree" :"PaymentNotice.recipient", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setRecipient"} **/
						));
Paymentnoticeobj.setAmount(HapiFHIRHelpers.createMoney(paymentnotice.getPmntNtcMntMnCrrncy() /** { "tree" :"PaymentNotice.amount", "datatype" : "Money, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setAmount, setCurrency"} **/
						, paymentnotice.getPaymentNoticeAmountMoneyValue() /** { "tree" :"PaymentNotice.amount", "datatype" : "Money, decimal", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setAmount, setVal"} **/
						));
Paymentnoticeobj.setPaymentStatus(HapiFHIRHelpers.createCodeableConcept(paymentnotice.getPmntNtcPmntSttsCcCdngCSstm() /** { "tree" :"PaymentNotice.paymentStatus", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPaymentStatus, addCoding, setSystem"} **/
						, paymentnotice.getPmntNtcPmntSttsCcCdngCVrsn() /** { "tree" :"PaymentNotice.paymentStatus", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPaymentStatus, addCoding, setVersion"} **/
						, paymentnotice.getPmntNtcPmntSttsCcCdngCCde() /** { "tree" :"PaymentNotice.paymentStatus", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPaymentStatus, addCoding, setCode"} **/
						, paymentnotice.getPmntNtcPmntSttsCcCdngCDsplay() /** { "tree" :"PaymentNotice.paymentStatus", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPaymentStatus, addCoding, setDisplay"} **/
						, paymentnotice.getPmntNtcPmntSttsCcCdngCSrSlctd() /** { "tree" :"PaymentNotice.paymentStatus", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPaymentStatus, addCoding, setUserSelected"} **/
						, paymentnotice.getPmntNtcPmntSttsCcTxt() /** { "tree" :"PaymentNotice.paymentStatus", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPaymentStatus, setText"} **/
		));
	}
}
