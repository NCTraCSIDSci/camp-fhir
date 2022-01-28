package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Servicerequest.
 * @see .Servicerequest
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class ServicerequestConversion 
{
	public Patient Servicerequests(main.templateoutput.Model.Servicerequest servicerequest) 
	{
			Patient  Servicerequestobj = new Patient(); 

						Servicerequestobj.addIdentifier(HapiFHIRHelpers.createIdentifier(servicerequest.getSrvcRqstDntfrDntfrSe() /** { "tree" :"ServiceRequest.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, servicerequest.getSrvcRqstDntfrDntfrTpCcCSstm() /** { "tree" :"ServiceRequest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, servicerequest.getSrvcRqstDntfrDntfrTpCcCVrsn() /** { "tree" :"ServiceRequest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, servicerequest.getSrvcRqstDntfrDntfrTpCcCCde() /** { "tree" :"ServiceRequest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, servicerequest.getSrvcRqstDntfrDntfrTpCcCDsplay() /** { "tree" :"ServiceRequest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, servicerequest.getSrvcRqstDntfrDntfrTpCcCSrSlctd() /** { "tree" :"ServiceRequest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, servicerequest.getSrvcRqstDntfrDntfrTpCcTxt() /** { "tree" :"ServiceRequest.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, servicerequest.getSrvcRqstDntfrDntfrPrdPrdStrt() /** { "tree" :"ServiceRequest.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, servicerequest.getSrvcRqstDntfrDntfrPrdPrdNd() /** { "tree" :"ServiceRequest.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, servicerequest.getSrvcRqstDntfrDntfrSsgnr() /** { "tree" :"ServiceRequest.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, servicerequest.getSrvcRqstDntfrDntfrVlue() /** { "tree" :"ServiceRequest.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, servicerequest.getSrvcRqstDntfrDntfrSstm() /** { "tree" :"ServiceRequest.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Servicerequestobj.addInstantiatesCanonical(HapiFHIRHelpers.createcanonical(servicerequest.getSrvcRqstNstnttsCnnclCnncl() /** { "tree" :"ServiceRequest.instantiatesCanonical", "datatype" : "canonical", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addInstantiatesCanonical"} **/
						));
Servicerequestobj.addInstantiatesUri(HapiFHIRHelpers.createuri(servicerequest.getServiceRequestInstantiatesUriUri() /** { "tree" :"ServiceRequest.instantiatesUri", "datatype" : "uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addInstantiatesUri"} **/
						));
Servicerequestobj.addBasedOn(HapiFHIRHelpers.createReference(servicerequest.getServiceRequestBasedOnReference() /** { "tree" :"ServiceRequest.basedOn", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBasedOn"} **/
						));
Servicerequestobj.addReplaces(HapiFHIRHelpers.createReference(servicerequest.getServiceRequestReplacesReference() /** { "tree" :"ServiceRequest.replaces", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReplaces"} **/
						));
Servicerequestobj.setRequisition(HapiFHIRHelpers.createIdentifier(servicerequest.getSrvcRqstRqstnDntfrSe() /** { "tree" :"ServiceRequest.requisition", "datatype" : "Identifier, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequisition, setUse"} **/
						, servicerequest.getSrvcRqstRqstnDntfrTpCcCSstm() /** { "tree" :"ServiceRequest.requisition", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequisition, setType, addCoding, setSystem"} **/
						, servicerequest.getSrvcRqstRqstnDntfrTpCcCVrsn() /** { "tree" :"ServiceRequest.requisition", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequisition, setType, addCoding, setVersion"} **/
						, servicerequest.getSrvcRqstRqstnDntfrTpCcCCde() /** { "tree" :"ServiceRequest.requisition", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequisition, setType, addCoding, setCode"} **/
						, servicerequest.getSrvcRqstRqstnDntfrTpCcCDsplay() /** { "tree" :"ServiceRequest.requisition", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequisition, setType, addCoding, setDisplay"} **/
						, servicerequest.getSrvcRqstRqstnDntfrTpCcCSrSlctd() /** { "tree" :"ServiceRequest.requisition", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequisition, setType, addCoding, setUserSelected"} **/
						, servicerequest.getSrvcRqstRqstnDntfrTpCcTxt() /** { "tree" :"ServiceRequest.requisition", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequisition, setType, setText"} **/
						, servicerequest.getSrvcRqstRqstnDntfrPrdPrdStrt() /** { "tree" :"ServiceRequest.requisition", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequisition, setPeriod, setStart"} **/
						, servicerequest.getSrvcRqstRqstnDntfrPrdPrdNd() /** { "tree" :"ServiceRequest.requisition", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequisition, setPeriod, setEnd"} **/
						, servicerequest.getSrvcRqstRqstnDntfrSsgnr() /** { "tree" :"ServiceRequest.requisition", "datatype" : "Identifier, Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequisition, setAssigner"} **/
						, servicerequest.getSrvcRqstRqstnDntfrVlue() /** { "tree" :"ServiceRequest.requisition", "datatype" : "Identifier, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequisition, setValue"} **/
						, servicerequest.getSrvcRqstRqstnDntfrSstm() /** { "tree" :"ServiceRequest.requisition", "datatype" : "Identifier, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequisition, setSystem"} **/
						));
Servicerequestobj.setStatus(HapiFHIRHelpers.createcode(servicerequest.getServiceRequestStatusCode() /** { "tree" :"ServiceRequest.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Servicerequestobj.setIntent(HapiFHIRHelpers.createcode(servicerequest.getServiceRequestIntentCode() /** { "tree" :"ServiceRequest.intent", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setIntent"} **/
						));
Servicerequestobj.addCategory(HapiFHIRHelpers.createCodeableConcept(servicerequest.getSrvcRqstCtgrCcCdngCSstm() /** { "tree" :"ServiceRequest.category", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setSystem"} **/
						, servicerequest.getSrvcRqstCtgrCcCdngCVrsn() /** { "tree" :"ServiceRequest.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setVersion"} **/
						, servicerequest.getSrvcRqstCtgrCcCdngCCde() /** { "tree" :"ServiceRequest.category", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setCode"} **/
						, servicerequest.getSrvcRqstCtgrCcCdngCDsplay() /** { "tree" :"ServiceRequest.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setDisplay"} **/
						, servicerequest.getSrvcRqstCtgrCcCdngCSrSlctd() /** { "tree" :"ServiceRequest.category", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setUserSelected"} **/
						, servicerequest.getServiceRequestCategoryCcText() /** { "tree" :"ServiceRequest.category", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, setText"} **/
						));
Servicerequestobj.setPriority(HapiFHIRHelpers.createcode(servicerequest.getServiceRequestPriorityCode() /** { "tree" :"ServiceRequest.priority", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPriority"} **/
						));
Servicerequestobj.setDoNotPerform(HapiFHIRHelpers.createboolean(servicerequest.getSrvcRqstDNtPrfrmBln() /** { "tree" :"ServiceRequest.doNotPerform", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDoNotPerform"} **/
						));
Servicerequestobj.setCode(HapiFHIRHelpers.createCodeableConcept(servicerequest.getSrvcRqstCdCcCdngCSstm() /** { "tree" :"ServiceRequest.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setSystem"} **/
						, servicerequest.getSrvcRqstCdCcCdngCVrsn() /** { "tree" :"ServiceRequest.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setVersion"} **/
						, servicerequest.getSrvcRqstCdCcCdngCCde() /** { "tree" :"ServiceRequest.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setCode"} **/
						, servicerequest.getSrvcRqstCdCcCdngCDsplay() /** { "tree" :"ServiceRequest.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, servicerequest.getSrvcRqstCdCcCdngCSrSlctd() /** { "tree" :"ServiceRequest.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, servicerequest.getServiceRequestCodeCcText() /** { "tree" :"ServiceRequest.code", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, setText"} **/
						));
Servicerequestobj.addOrderDetail(HapiFHIRHelpers.createCodeableConcept(servicerequest.getSrvcRqstRdrDtlCcCdngCSstm() /** { "tree" :"ServiceRequest.orderDetail", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addOrderDetail, addCoding, setSystem"} **/
						, servicerequest.getSrvcRqstRdrDtlCcCdngCVrsn() /** { "tree" :"ServiceRequest.orderDetail", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addOrderDetail, addCoding, setVersion"} **/
						, servicerequest.getSrvcRqstRdrDtlCcCdngCCde() /** { "tree" :"ServiceRequest.orderDetail", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addOrderDetail, addCoding, setCode"} **/
						, servicerequest.getSrvcRqstRdrDtlCcCdngCDsplay() /** { "tree" :"ServiceRequest.orderDetail", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addOrderDetail, addCoding, setDisplay"} **/
						, servicerequest.getSrvcRqstRdrDtlCcCdngCSrSlctd() /** { "tree" :"ServiceRequest.orderDetail", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addOrderDetail, addCoding, setUserSelected"} **/
						, servicerequest.getServiceRequestOrderDetailCcText() /** { "tree" :"ServiceRequest.orderDetail", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addOrderDetail, setText"} **/
						));
Servicerequestobj.setQuantityQuantity(HapiFHIRHelpers.createQuantity(servicerequest.getSrvcRqstQnttQnttQnttCmprtr() /** { "tree" :"ServiceRequest.quantityQuantity", "datatype" : "Quantity, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setQuantityQuantity, setComparator"} **/
						, servicerequest.getSrvcRqstQnttQnttQnttCde() /** { "tree" :"ServiceRequest.quantityQuantity", "datatype" : "Quantity, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setQuantityQuantity, setCode"} **/
						, servicerequest.getSrvcRqstQnttQnttQnttVlue() /** { "tree" :"ServiceRequest.quantityQuantity", "datatype" : "Quantity, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setQuantityQuantity, setValue"} **/
						, servicerequest.getSrvcRqstQnttQnttQnttNt() /** { "tree" :"ServiceRequest.quantityQuantity", "datatype" : "Quantity, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setQuantityQuantity, setUnit"} **/
						, servicerequest.getSrvcRqstQnttQnttQnttSstm() /** { "tree" :"ServiceRequest.quantityQuantity", "datatype" : "Quantity, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setQuantityQuantity, setSystem"} **/
						));
Servicerequestobj.setQuantityRatio(HapiFHIRHelpers.createRatio(servicerequest.getSrvcRqstQnttRtRtNmrtrQnttVlue() /** { "tree" :"ServiceRequest.quantityRatio", "datatype" : "Ratio, Quantity, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setQuantityRatio, setNumerator, setValue"} **/
						, servicerequest.getSrvcRqstQnttRtRtDnmntrQnttVlue() /** { "tree" :"ServiceRequest.quantityRatio", "datatype" : "Ratio, Quantity, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setQuantityRatio, setDenominator, setValue"} **/
						, servicerequest.getSrvcRqstQnttRtRtNmrtrQnttCmprtr() /** { "tree" :"ServiceRequest.quantityRatio", "datatype" : "Ratio, Quantity, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setQuantityRatio, setNumerator, setComparator"} **/
						, servicerequest.getSrvcRqstQnttRtRtDnmntrQnttCmprtr() /** { "tree" :"ServiceRequest.quantityRatio", "datatype" : "Ratio, Quantity, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setQuantityRatio, setDenominator, setComparator"} **/
						, servicerequest.getSrvcRqstQnttRtRtNmrtrQnttNt() /** { "tree" :"ServiceRequest.quantityRatio", "datatype" : "Ratio, Quantity, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setQuantityRatio, setNumerator, setUnit"} **/
						, servicerequest.getSrvcRqstQnttRtRtDnmntrQnttNt() /** { "tree" :"ServiceRequest.quantityRatio", "datatype" : "Ratio, Quantity, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setQuantityRatio, setDenominator, setUnit"} **/
						, servicerequest.getSrvcRqstQnttRtRtNmrtrQnttSstm() /** { "tree" :"ServiceRequest.quantityRatio", "datatype" : "Ratio, Quantity, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setQuantityRatio, setNumerator, setSystem"} **/
						, servicerequest.getSrvcRqstQnttRtRtDnmntrQnttSstm() /** { "tree" :"ServiceRequest.quantityRatio", "datatype" : "Ratio, Quantity, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setQuantityRatio, setDenominator, setSystem"} **/
						, servicerequest.getSrvcRqstQnttRtRtNmrtrQnttCde() /** { "tree" :"ServiceRequest.quantityRatio", "datatype" : "Ratio, Quantity, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setQuantityRatio, setNumerator, setCode"} **/
						, servicerequest.getSrvcRqstQnttRtRtDnmntrQnttCde() /** { "tree" :"ServiceRequest.quantityRatio", "datatype" : "Ratio, Quantity, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setQuantityRatio, setDenominator, setCode"} **/
						));
Servicerequestobj.setQuantityRange(HapiFHIRHelpers.createRange(servicerequest.getSrvcRqstQnttRngRngLw() /** { "tree" :"ServiceRequest.quantityRange", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setQuantityRange, setLow"} **/
						, servicerequest.getSrvcRqstQnttRngRngHgh() /** { "tree" :"ServiceRequest.quantityRange", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setQuantityRange, setHigh"} **/
						));
Servicerequestobj.setSubject(HapiFHIRHelpers.createReference(servicerequest.getServiceRequestSubjectReference() /** { "tree" :"ServiceRequest.subject", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setSubject"} **/
						));
Servicerequestobj.setEncounter(HapiFHIRHelpers.createReference(servicerequest.getServiceRequestEncounterReference() /** { "tree" :"ServiceRequest.encounter", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEncounter"} **/
						));
Servicerequestobj.setOccurrence(HapiFHIRHelpers.createdateTimetype(servicerequest.getSrvcRqstCcrrncDttmDtTme() /** { "tree" :"ServiceRequest.occurrenceDatetime", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceDatetime"} **/
						));
Servicerequestobj.setOccurrencePeriod(HapiFHIRHelpers.createPeriod(servicerequest.getSrvcRqstCcrrncPrdPrdStrt() /** { "tree" :"ServiceRequest.occurrencePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrencePeriod, setStart"} **/
						, servicerequest.getSrvcRqstCcrrncPrdPrdNd() /** { "tree" :"ServiceRequest.occurrencePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrencePeriod, setEnd"} **/
						));
Servicerequestobj.setOccurrenceTiming(HapiFHIRHelpers.createTiming(servicerequest.getSrvcRqstCcrrncTmngTmngCdCcCSstm() /** { "tree" :"ServiceRequest.occurrenceTiming", "datatype" : "Timing, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setCode, addCoding, setSystem"} **/
						, servicerequest.getSrvcRqstCcrrncTmngTmngCdCcCVrsn() /** { "tree" :"ServiceRequest.occurrenceTiming", "datatype" : "Timing, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setCode, addCoding, setVersion"} **/
						, servicerequest.getSrvcRqstCcrrncTmngTmngCdCcCCde() /** { "tree" :"ServiceRequest.occurrenceTiming", "datatype" : "Timing, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setCode, addCoding, setCode"} **/
						, servicerequest.getSrvcRqstCcrrncTmngTmngCdCcCDsplay() /** { "tree" :"ServiceRequest.occurrenceTiming", "datatype" : "Timing, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setCode, addCoding, setDisplay"} **/
						, servicerequest.getSrvcRqstCcrrncTmngTmngCdCcCSrSlctd() /** { "tree" :"ServiceRequest.occurrenceTiming", "datatype" : "Timing, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setCode, addCoding, setUserSelected"} **/
						, servicerequest.getSrvcRqstCcrrncTmngTmngCdCcTxt() /** { "tree" :"ServiceRequest.occurrenceTiming", "datatype" : "Timing, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setCode, setText"} **/
						, servicerequest.getSrvcRqstCcrrncTmngTmngVnt() /** { "tree" :"ServiceRequest.occurrenceTiming", "datatype" : "Timing, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, addEvent"} **/
						, servicerequest.getSrvcRqstCcrrncTmngTmngRptDrtnnt() /** { "tree" :"ServiceRequest.occurrenceTiming", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setDurationUnit"} **/
						, servicerequest.getSrvcRqstCcrrncTmngTmngRptPrdnt() /** { "tree" :"ServiceRequest.occurrenceTiming", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setPeriodUnit"} **/
						, servicerequest.getSrvcRqstCcrrncTmngTmngRptDfWk() /** { "tree" :"ServiceRequest.occurrenceTiming", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, addDayOfWeek"} **/
						, servicerequest.getSrvcRqstCcrrncTmngTmngRptWhn() /** { "tree" :"ServiceRequest.occurrenceTiming", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, addWhen"} **/
						, servicerequest.getSrvcRqstCcrrncTmngTmngRptDrtn() /** { "tree" :"ServiceRequest.occurrenceTiming", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setDuration"} **/
						, servicerequest.getSrvcRqstCcrrncTmngTmngRptDrtnMx() /** { "tree" :"ServiceRequest.occurrenceTiming", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setDurationMax"} **/
						, servicerequest.getSrvcRqstCcrrncTmngTmngRptPrd() /** { "tree" :"ServiceRequest.occurrenceTiming", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setPeriod"} **/
						, servicerequest.getSrvcRqstCcrrncTmngTmngRptPrdMx() /** { "tree" :"ServiceRequest.occurrenceTiming", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setPeriodMax"} **/
						, servicerequest.getSrvcRqstCcrrncTmngTmngRptBndsDrtn() /** { "tree" :"ServiceRequest.occurrenceTiming", "datatype" : "Timing, Element, Duration", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setBoundsDuration"} **/
						, servicerequest.getSrvcRqstCcrrncTmngTmngRptBndsPrd() /** { "tree" :"ServiceRequest.occurrenceTiming", "datatype" : "Timing, Element, Period", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setBoundsPeriod"} **/
						, servicerequest.getSrvcRqstCcrrncTmngTmngRptCnt() /** { "tree" :"ServiceRequest.occurrenceTiming", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setCount"} **/
						, servicerequest.getSrvcRqstCcrrncTmngTmngRptCntMx() /** { "tree" :"ServiceRequest.occurrenceTiming", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setCountMax"} **/
						, servicerequest.getSrvcRqstCcrrncTmngTmngRptFrqncy() /** { "tree" :"ServiceRequest.occurrenceTiming", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setFrequency"} **/
						, servicerequest.getSrvcRqstCcrrncTmngTmngRptFrqncMx() /** { "tree" :"ServiceRequest.occurrenceTiming", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setFrequencyMax"} **/
						, servicerequest.getSrvcRqstCcrrncTmngTmngRptBndsRnge() /** { "tree" :"ServiceRequest.occurrenceTiming", "datatype" : "Timing, Element, Range", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setBoundsRange"} **/
						, servicerequest.getSrvcRqstCcrrncTmngTmngRptTmfDay() /** { "tree" :"ServiceRequest.occurrenceTiming", "datatype" : "Timing, Element, time", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, addTimeOfDay"} **/
						, servicerequest.getSrvcRqstCcrrncTmngTmngRptFfst() /** { "tree" :"ServiceRequest.occurrenceTiming", "datatype" : "Timing, Element, unsignedInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setOffset"} **/
						));
Servicerequestobj.setAsNeeded(HapiFHIRHelpers.createbooleantype(servicerequest.getSrvcRqstSNddBlnBln() /** { "tree" :"ServiceRequest.asNeededBoolean", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAsNeededBoolean"} **/
						));
Servicerequestobj.setAsNeededCodeableconcept(HapiFHIRHelpers.createCodeableConcept(servicerequest.getSrvcRqstSNddCdblcncptCcCdngCSstm() /** { "tree" :"ServiceRequest.asNeededCodeableconcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAsNeededCodeableconcept, addCoding, setSystem"} **/
						, servicerequest.getSrvcRqstSNddCdblcncptCcCdngCVrsn() /** { "tree" :"ServiceRequest.asNeededCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAsNeededCodeableconcept, addCoding, setVersion"} **/
						, servicerequest.getSrvcRqstSNddCdblcncptCcCdngCCde() /** { "tree" :"ServiceRequest.asNeededCodeableconcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAsNeededCodeableconcept, addCoding, setCode"} **/
						, servicerequest.getSrvcRqstSNddCdblcncptCcCdngCDsplay() /** { "tree" :"ServiceRequest.asNeededCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAsNeededCodeableconcept, addCoding, setDisplay"} **/
						, servicerequest.getSrvcRqstSNddCdblcncptCcCdngCSrSlctd() /** { "tree" :"ServiceRequest.asNeededCodeableconcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAsNeededCodeableconcept, addCoding, setUserSelected"} **/
						, servicerequest.getSrvcRqstSNddCdblcncptCcTxt() /** { "tree" :"ServiceRequest.asNeededCodeableconcept", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAsNeededCodeableconcept, setText"} **/
						));
Servicerequestobj.setAuthoredOn(HapiFHIRHelpers.createdateTime(servicerequest.getServiceRequestAuthoredOnDateTime() /** { "tree" :"ServiceRequest.authoredOn", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAuthoredOn"} **/
						));
Servicerequestobj.setRequester(HapiFHIRHelpers.createReference(servicerequest.getServiceRequestRequesterReference() /** { "tree" :"ServiceRequest.requester", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequester"} **/
						));
Servicerequestobj.setPerformerType(HapiFHIRHelpers.createCodeableConcept(servicerequest.getSrvcRqstPrfrmrTpCcCdngCSstm() /** { "tree" :"ServiceRequest.performerType", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPerformerType, addCoding, setSystem"} **/
						, servicerequest.getSrvcRqstPrfrmrTpCcCdngCVrsn() /** { "tree" :"ServiceRequest.performerType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPerformerType, addCoding, setVersion"} **/
						, servicerequest.getSrvcRqstPrfrmrTpCcCdngCCde() /** { "tree" :"ServiceRequest.performerType", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPerformerType, addCoding, setCode"} **/
						, servicerequest.getSrvcRqstPrfrmrTpCcCdngCDsplay() /** { "tree" :"ServiceRequest.performerType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPerformerType, addCoding, setDisplay"} **/
						, servicerequest.getSrvcRqstPrfrmrTpCcCdngCSrSlctd() /** { "tree" :"ServiceRequest.performerType", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPerformerType, addCoding, setUserSelected"} **/
						, servicerequest.getSrvcRqstPrfrmrTpCcTxt() /** { "tree" :"ServiceRequest.performerType", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPerformerType, setText"} **/
						));
Servicerequestobj.addPerformer(HapiFHIRHelpers.createReference(servicerequest.getServiceRequestPerformerReference() /** { "tree" :"ServiceRequest.performer", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPerformer"} **/
						));
Servicerequestobj.addLocationCode(HapiFHIRHelpers.createCodeableConcept(servicerequest.getSrvcRqstLctnCdCcCdngCSstm() /** { "tree" :"ServiceRequest.locationCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addLocationCode, addCoding, setSystem"} **/
						, servicerequest.getSrvcRqstLctnCdCcCdngCVrsn() /** { "tree" :"ServiceRequest.locationCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addLocationCode, addCoding, setVersion"} **/
						, servicerequest.getSrvcRqstLctnCdCcCdngCCde() /** { "tree" :"ServiceRequest.locationCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addLocationCode, addCoding, setCode"} **/
						, servicerequest.getSrvcRqstLctnCdCcCdngCDsplay() /** { "tree" :"ServiceRequest.locationCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addLocationCode, addCoding, setDisplay"} **/
						, servicerequest.getSrvcRqstLctnCdCcCdngCSrSlctd() /** { "tree" :"ServiceRequest.locationCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addLocationCode, addCoding, setUserSelected"} **/
						, servicerequest.getSrvcRqstLctnCdCcTxt() /** { "tree" :"ServiceRequest.locationCode", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addLocationCode, setText"} **/
						));
Servicerequestobj.addLocationReference(HapiFHIRHelpers.createReference(servicerequest.getSrvcRqstLctnRfrncRfrnce() /** { "tree" :"ServiceRequest.locationReference", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addLocationReference"} **/
						));
Servicerequestobj.addReasonCode(HapiFHIRHelpers.createCodeableConcept(servicerequest.getSrvcRqstRsnCdCcCdngCSstm() /** { "tree" :"ServiceRequest.reasonCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setSystem"} **/
						, servicerequest.getSrvcRqstRsnCdCcCdngCVrsn() /** { "tree" :"ServiceRequest.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setVersion"} **/
						, servicerequest.getSrvcRqstRsnCdCcCdngCCde() /** { "tree" :"ServiceRequest.reasonCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setCode"} **/
						, servicerequest.getSrvcRqstRsnCdCcCdngCDsplay() /** { "tree" :"ServiceRequest.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setDisplay"} **/
						, servicerequest.getSrvcRqstRsnCdCcCdngCSrSlctd() /** { "tree" :"ServiceRequest.reasonCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setUserSelected"} **/
						, servicerequest.getServiceRequestReasonCodeCcText() /** { "tree" :"ServiceRequest.reasonCode", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, setText"} **/
						));
Servicerequestobj.addReasonReference(HapiFHIRHelpers.createReference(servicerequest.getSrvcRqstRsnRfrncRfrnce() /** { "tree" :"ServiceRequest.reasonReference", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonReference"} **/
						));
Servicerequestobj.addInsurance(HapiFHIRHelpers.createReference(servicerequest.getServiceRequestInsuranceReference() /** { "tree" :"ServiceRequest.insurance", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addInsurance"} **/
						));
Servicerequestobj.addSupportingInfo(HapiFHIRHelpers.createReference(servicerequest.getSrvcRqstSpprtngnfRfrnce() /** { "tree" :"ServiceRequest.supportingInfo", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSupportingInfo"} **/
						));
Servicerequestobj.addSpecimen(HapiFHIRHelpers.createReference(servicerequest.getServiceRequestSpecimenReference() /** { "tree" :"ServiceRequest.specimen", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecimen"} **/
						));
Servicerequestobj.addBodySite(HapiFHIRHelpers.createCodeableConcept(servicerequest.getSrvcRqstBdStCcCdngCSstm() /** { "tree" :"ServiceRequest.bodySite", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBodySite, addCoding, setSystem"} **/
						, servicerequest.getSrvcRqstBdStCcCdngCVrsn() /** { "tree" :"ServiceRequest.bodySite", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBodySite, addCoding, setVersion"} **/
						, servicerequest.getSrvcRqstBdStCcCdngCCde() /** { "tree" :"ServiceRequest.bodySite", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBodySite, addCoding, setCode"} **/
						, servicerequest.getSrvcRqstBdStCcCdngCDsplay() /** { "tree" :"ServiceRequest.bodySite", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBodySite, addCoding, setDisplay"} **/
						, servicerequest.getSrvcRqstBdStCcCdngCSrSlctd() /** { "tree" :"ServiceRequest.bodySite", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBodySite, addCoding, setUserSelected"} **/
						, servicerequest.getServiceRequestBodySiteCcText() /** { "tree" :"ServiceRequest.bodySite", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBodySite, setText"} **/
						));
Servicerequestobj.addNote(HapiFHIRHelpers.createAnnotation(servicerequest.getSrvcRqstNtNnttnTme() /** { "tree" :"ServiceRequest.note", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setTime"} **/
						, servicerequest.getSrvcRqstNtNnttnTxt() /** { "tree" :"ServiceRequest.note", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setText"} **/
						, servicerequest.getSrvcRqstNtNnttnThrRfrnce() /** { "tree" :"ServiceRequest.note", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorReference"} **/
						, servicerequest.getSrvcRqstNtNnttnThrStrng() /** { "tree" :"ServiceRequest.note", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorString"} **/
						));
Servicerequestobj.setPatientInstruction(HapiFHIRHelpers.createstring(servicerequest.getSrvcRqstPntnstrctnStrng() /** { "tree" :"ServiceRequest.patientInstruction", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPatientInstruction"} **/
						));
Servicerequestobj.addRelevantHistory(HapiFHIRHelpers.createReference(servicerequest.getSrvcRqstRlvntHstrRfrnce() /** { "tree" :"ServiceRequest.relevantHistory", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelevantHistory"} **/
		));
	}
}
