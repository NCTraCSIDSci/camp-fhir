package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Supplyrequest.
 * @see .Supplyrequest
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class SupplyrequestConversion 
{
	public Patient Supplyrequests(main.templateoutput.Model.Supplyrequest supplyrequest) 
	{
			Patient  Supplyrequestobj = new Patient(); 

						Supplyrequestobj.addIdentifier(HapiFHIRHelpers.createIdentifier(supplyrequest.getSpplRqstDntfrDntfrSe() /** { "tree" :"SupplyRequest.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, supplyrequest.getSpplRqstDntfrDntfrTpCcCSstm() /** { "tree" :"SupplyRequest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, supplyrequest.getSpplRqstDntfrDntfrTpCcCVrsn() /** { "tree" :"SupplyRequest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, supplyrequest.getSpplRqstDntfrDntfrTpCcCCde() /** { "tree" :"SupplyRequest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, supplyrequest.getSpplRqstDntfrDntfrTpCcCDsplay() /** { "tree" :"SupplyRequest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, supplyrequest.getSpplRqstDntfrDntfrTpCcCSrSlctd() /** { "tree" :"SupplyRequest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, supplyrequest.getSpplRqstDntfrDntfrTpCcTxt() /** { "tree" :"SupplyRequest.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, supplyrequest.getSpplRqstDntfrDntfrPrdPrdStrt() /** { "tree" :"SupplyRequest.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, supplyrequest.getSpplRqstDntfrDntfrPrdPrdNd() /** { "tree" :"SupplyRequest.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, supplyrequest.getSpplRqstDntfrDntfrSsgnr() /** { "tree" :"SupplyRequest.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, supplyrequest.getSpplRqstDntfrDntfrVlue() /** { "tree" :"SupplyRequest.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, supplyrequest.getSpplRqstDntfrDntfrSstm() /** { "tree" :"SupplyRequest.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Supplyrequestobj.setStatus(HapiFHIRHelpers.createcode(supplyrequest.getSupplyRequestStatusCode() /** { "tree" :"SupplyRequest.status", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Supplyrequestobj.setCategory(HapiFHIRHelpers.createCodeableConcept(supplyrequest.getSpplRqstCtgrCcCdngCSstm() /** { "tree" :"SupplyRequest.category", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCategory, addCoding, setSystem"} **/
						, supplyrequest.getSpplRqstCtgrCcCdngCVrsn() /** { "tree" :"SupplyRequest.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCategory, addCoding, setVersion"} **/
						, supplyrequest.getSpplRqstCtgrCcCdngCCde() /** { "tree" :"SupplyRequest.category", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCategory, addCoding, setCode"} **/
						, supplyrequest.getSpplRqstCtgrCcCdngCDsplay() /** { "tree" :"SupplyRequest.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCategory, addCoding, setDisplay"} **/
						, supplyrequest.getSpplRqstCtgrCcCdngCSrSlctd() /** { "tree" :"SupplyRequest.category", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCategory, addCoding, setUserSelected"} **/
						, supplyrequest.getSupplyRequestCategoryCcText() /** { "tree" :"SupplyRequest.category", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCategory, setText"} **/
						));
Supplyrequestobj.setPriority(HapiFHIRHelpers.createcode(supplyrequest.getSupplyRequestPriorityCode() /** { "tree" :"SupplyRequest.priority", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPriority"} **/
						));
Supplyrequestobj.setItemCodeableconcept(HapiFHIRHelpers.createCodeableConcept(supplyrequest.getSpplRqstTmCdblcncptCcCdngCSstm() /** { "tree" :"SupplyRequest.itemCodeableconcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setItemCodeableconcept, addCoding, setSystem"} **/
						, supplyrequest.getSpplRqstTmCdblcncptCcCdngCVrsn() /** { "tree" :"SupplyRequest.itemCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setItemCodeableconcept, addCoding, setVersion"} **/
						, supplyrequest.getSpplRqstTmCdblcncptCcCdngCCde() /** { "tree" :"SupplyRequest.itemCodeableconcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setItemCodeableconcept, addCoding, setCode"} **/
						, supplyrequest.getSpplRqstTmCdblcncptCcCdngCDsplay() /** { "tree" :"SupplyRequest.itemCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setItemCodeableconcept, addCoding, setDisplay"} **/
						, supplyrequest.getSpplRqstTmCdblcncptCcCdngCSrSlctd() /** { "tree" :"SupplyRequest.itemCodeableconcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setItemCodeableconcept, addCoding, setUserSelected"} **/
						, supplyrequest.getSpplRqstTmCdblcncptCcTxt() /** { "tree" :"SupplyRequest.itemCodeableconcept", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setItemCodeableconcept, setText"} **/
						));
Supplyrequestobj.setItemReference(medication | substance | device)(HapiFHIRHelpers.createReference(supplyrequest.getSpplRqstTmRfrncRfrnce() /** { "tree" :"SupplyRequest.itemReference", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setItemReference(medication | substance | device)"} **/
						));
Supplyrequestobj.setQuantity(HapiFHIRHelpers.createQuantity(supplyrequest.getSpplRqstQnttQnttCmprtr() /** { "tree" :"SupplyRequest.quantity", "datatype" : "Quantity, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setQuantity, setComparator"} **/
						, supplyrequest.getSpplRqstQnttQnttCde() /** { "tree" :"SupplyRequest.quantity", "datatype" : "Quantity, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setQuantity, setCode"} **/
						, supplyrequest.getSpplRqstQnttQnttVlue() /** { "tree" :"SupplyRequest.quantity", "datatype" : "Quantity, decimal", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setQuantity, setValue"} **/
						, supplyrequest.getSpplRqstQnttQnttNt() /** { "tree" :"SupplyRequest.quantity", "datatype" : "Quantity, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setQuantity, setUnit"} **/
						, supplyrequest.getSpplRqstQnttQnttSstm() /** { "tree" :"SupplyRequest.quantity", "datatype" : "Quantity, uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setQuantity, setSystem"} **/
						));
Supplyrequestobj.setCode(HapiFHIRHelpers.createCodeableConcept(supplyrequest.getSpplRqstPrmtrCdCcCdngCSstm() /** { "tree" :"SupplyRequest.parameter.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setCode, addCoding, setSystem"} **/
						, supplyrequest.getSpplRqstPrmtrCdCcCdngCVrsn() /** { "tree" :"SupplyRequest.parameter.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setCode, addCoding, setVersion"} **/
						, supplyrequest.getSpplRqstPrmtrCdCcCdngCCde() /** { "tree" :"SupplyRequest.parameter.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setCode, addCoding, setCode"} **/
						, supplyrequest.getSpplRqstPrmtrCdCcCdngCDsplay() /** { "tree" :"SupplyRequest.parameter.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, supplyrequest.getSpplRqstPrmtrCdCcCdngCSrSlctd() /** { "tree" :"SupplyRequest.parameter.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, supplyrequest.getSpplRqstPrmtrCdCcTxt() /** { "tree" :"SupplyRequest.parameter.code", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setCode, setText"} **/
						));
Supplyrequestobj.setValueCodeableconcept(HapiFHIRHelpers.createCodeableConcept(supplyrequest.getSpplRqstPrmtrVlCdblcncptCcCdngCSstm() /** { "tree" :"SupplyRequest.parameter.valueCodeableconcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setValueCodeableconcept, addCoding, setSystem"} **/
						, supplyrequest.getSpplRqstPrmtrVlCdblcncptCcCdngCVrsn() /** { "tree" :"SupplyRequest.parameter.valueCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setValueCodeableconcept, addCoding, setVersion"} **/
						, supplyrequest.getSpplRqstPrmtrVlCdblcncptCcCdngCCde() /** { "tree" :"SupplyRequest.parameter.valueCodeableconcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setValueCodeableconcept, addCoding, setCode"} **/
						, supplyrequest.getSpplRqstPrmtrVlCdblcncptCcCdngCDsplay() /** { "tree" :"SupplyRequest.parameter.valueCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setValueCodeableconcept, addCoding, setDisplay"} **/
						, supplyrequest.getSpplRqstPrmtrVlCdblcncptCcCdngCSrSlctd() /** { "tree" :"SupplyRequest.parameter.valueCodeableconcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setValueCodeableconcept, addCoding, setUserSelected"} **/
						, supplyrequest.getSpplRqstPrmtrVlCdblcncptCcTxt() /** { "tree" :"SupplyRequest.parameter.valueCodeableconcept", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setValueCodeableconcept, setText"} **/
						));
Supplyrequestobj.setValueQuantity(HapiFHIRHelpers.createQuantity(supplyrequest.getSpplRqstPrmtrVlQnttQnttCmprtr() /** { "tree" :"SupplyRequest.parameter.valueQuantity", "datatype" : "Quantity, code", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setValueQuantity, setComparator"} **/
						, supplyrequest.getSpplRqstPrmtrVlQnttQnttCde() /** { "tree" :"SupplyRequest.parameter.valueQuantity", "datatype" : "Quantity, code", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setValueQuantity, setCode"} **/
						, supplyrequest.getSpplRqstPrmtrVlQnttQnttVlue() /** { "tree" :"SupplyRequest.parameter.valueQuantity", "datatype" : "Quantity, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setValueQuantity, setValue"} **/
						, supplyrequest.getSpplRqstPrmtrVlQnttQnttNt() /** { "tree" :"SupplyRequest.parameter.valueQuantity", "datatype" : "Quantity, string", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setValueQuantity, setUnit"} **/
						, supplyrequest.getSpplRqstPrmtrVlQnttQnttSstm() /** { "tree" :"SupplyRequest.parameter.valueQuantity", "datatype" : "Quantity, uri", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setValueQuantity, setSystem"} **/
						));
Supplyrequestobj.setValueRange(HapiFHIRHelpers.createRange(supplyrequest.getSpplRqstPrmtrVlRngRngLw() /** { "tree" :"SupplyRequest.parameter.valueRange", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setValueRange, setLow"} **/
						, supplyrequest.getSpplRqstPrmtrVlRngRngHgh() /** { "tree" :"SupplyRequest.parameter.valueRange", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setValueRange, setHigh"} **/
						));
Supplyrequestobj.setValue(HapiFHIRHelpers.createbooleantype(supplyrequest.getSpplRqstPrmtrVlBlnBln() /** { "tree" :"SupplyRequest.parameter.valueBoolean", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setValueBoolean"} **/
						));
Supplyrequestobj.setOccurrence(HapiFHIRHelpers.createdateTimetype(supplyrequest.getSpplRqstCcrrncDttmDtTme() /** { "tree" :"SupplyRequest.occurrenceDatetime", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceDatetime"} **/
						));
Supplyrequestobj.setOccurrencePeriod(HapiFHIRHelpers.createPeriod(supplyrequest.getSpplRqstCcrrncPrdPrdStrt() /** { "tree" :"SupplyRequest.occurrencePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrencePeriod, setStart"} **/
						, supplyrequest.getSpplRqstCcrrncPrdPrdNd() /** { "tree" :"SupplyRequest.occurrencePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrencePeriod, setEnd"} **/
						));
Supplyrequestobj.setOccurrenceTiming(HapiFHIRHelpers.createTiming(supplyrequest.getSpplRqstCcrrncTmngTmngCdCcCSstm() /** { "tree" :"SupplyRequest.occurrenceTiming", "datatype" : "Timing, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setCode, addCoding, setSystem"} **/
						, supplyrequest.getSpplRqstCcrrncTmngTmngCdCcCVrsn() /** { "tree" :"SupplyRequest.occurrenceTiming", "datatype" : "Timing, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setCode, addCoding, setVersion"} **/
						, supplyrequest.getSpplRqstCcrrncTmngTmngCdCcCCde() /** { "tree" :"SupplyRequest.occurrenceTiming", "datatype" : "Timing, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setCode, addCoding, setCode"} **/
						, supplyrequest.getSpplRqstCcrrncTmngTmngCdCcCDsplay() /** { "tree" :"SupplyRequest.occurrenceTiming", "datatype" : "Timing, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setCode, addCoding, setDisplay"} **/
						, supplyrequest.getSpplRqstCcrrncTmngTmngCdCcCSrSlctd() /** { "tree" :"SupplyRequest.occurrenceTiming", "datatype" : "Timing, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setCode, addCoding, setUserSelected"} **/
						, supplyrequest.getSpplRqstCcrrncTmngTmngCdCcTxt() /** { "tree" :"SupplyRequest.occurrenceTiming", "datatype" : "Timing, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setCode, setText"} **/
						, supplyrequest.getSpplRqstCcrrncTmngTmngVnt() /** { "tree" :"SupplyRequest.occurrenceTiming", "datatype" : "Timing, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, addEvent"} **/
						, supplyrequest.getSpplRqstCcrrncTmngTmngRptDrtnnt() /** { "tree" :"SupplyRequest.occurrenceTiming", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setDurationUnit"} **/
						, supplyrequest.getSpplRqstCcrrncTmngTmngRptPrdnt() /** { "tree" :"SupplyRequest.occurrenceTiming", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setPeriodUnit"} **/
						, supplyrequest.getSpplRqstCcrrncTmngTmngRptDfWk() /** { "tree" :"SupplyRequest.occurrenceTiming", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, addDayOfWeek"} **/
						, supplyrequest.getSpplRqstCcrrncTmngTmngRptWhn() /** { "tree" :"SupplyRequest.occurrenceTiming", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, addWhen"} **/
						, supplyrequest.getSpplRqstCcrrncTmngTmngRptDrtn() /** { "tree" :"SupplyRequest.occurrenceTiming", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setDuration"} **/
						, supplyrequest.getSpplRqstCcrrncTmngTmngRptDrtnMx() /** { "tree" :"SupplyRequest.occurrenceTiming", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setDurationMax"} **/
						, supplyrequest.getSpplRqstCcrrncTmngTmngRptPrd() /** { "tree" :"SupplyRequest.occurrenceTiming", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setPeriod"} **/
						, supplyrequest.getSpplRqstCcrrncTmngTmngRptPrdMx() /** { "tree" :"SupplyRequest.occurrenceTiming", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setPeriodMax"} **/
						, supplyrequest.getSpplRqstCcrrncTmngTmngRptBndsDrtn() /** { "tree" :"SupplyRequest.occurrenceTiming", "datatype" : "Timing, Element, Duration", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setBoundsDuration"} **/
						, supplyrequest.getSpplRqstCcrrncTmngTmngRptBndsPrd() /** { "tree" :"SupplyRequest.occurrenceTiming", "datatype" : "Timing, Element, Period", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setBoundsPeriod"} **/
						, supplyrequest.getSpplRqstCcrrncTmngTmngRptCnt() /** { "tree" :"SupplyRequest.occurrenceTiming", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setCount"} **/
						, supplyrequest.getSpplRqstCcrrncTmngTmngRptCntMx() /** { "tree" :"SupplyRequest.occurrenceTiming", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setCountMax"} **/
						, supplyrequest.getSpplRqstCcrrncTmngTmngRptFrqncy() /** { "tree" :"SupplyRequest.occurrenceTiming", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setFrequency"} **/
						, supplyrequest.getSpplRqstCcrrncTmngTmngRptFrqncMx() /** { "tree" :"SupplyRequest.occurrenceTiming", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setFrequencyMax"} **/
						, supplyrequest.getSpplRqstCcrrncTmngTmngRptBndsRnge() /** { "tree" :"SupplyRequest.occurrenceTiming", "datatype" : "Timing, Element, Range", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setBoundsRange"} **/
						, supplyrequest.getSpplRqstCcrrncTmngTmngRptTmfDay() /** { "tree" :"SupplyRequest.occurrenceTiming", "datatype" : "Timing, Element, time", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, addTimeOfDay"} **/
						, supplyrequest.getSpplRqstCcrrncTmngTmngRptFfst() /** { "tree" :"SupplyRequest.occurrenceTiming", "datatype" : "Timing, Element, unsignedInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setOffset"} **/
						));
Supplyrequestobj.setAuthoredOn(HapiFHIRHelpers.createdateTime(supplyrequest.getSupplyRequestAuthoredOnDateTime() /** { "tree" :"SupplyRequest.authoredOn", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAuthoredOn"} **/
						));
Supplyrequestobj.setRequester(HapiFHIRHelpers.createReference(supplyrequest.getSupplyRequestRequesterReference() /** { "tree" :"SupplyRequest.requester", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequester"} **/
						));
Supplyrequestobj.addSupplier(HapiFHIRHelpers.createReference(supplyrequest.getSupplyRequestSupplierReference() /** { "tree" :"SupplyRequest.supplier", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSupplier"} **/
						));
Supplyrequestobj.addReasonCode(HapiFHIRHelpers.createCodeableConcept(supplyrequest.getSpplRqstRsnCdCcCdngCSstm() /** { "tree" :"SupplyRequest.reasonCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setSystem"} **/
						, supplyrequest.getSpplRqstRsnCdCcCdngCVrsn() /** { "tree" :"SupplyRequest.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setVersion"} **/
						, supplyrequest.getSpplRqstRsnCdCcCdngCCde() /** { "tree" :"SupplyRequest.reasonCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setCode"} **/
						, supplyrequest.getSpplRqstRsnCdCcCdngCDsplay() /** { "tree" :"SupplyRequest.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setDisplay"} **/
						, supplyrequest.getSpplRqstRsnCdCcCdngCSrSlctd() /** { "tree" :"SupplyRequest.reasonCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setUserSelected"} **/
						, supplyrequest.getSupplyRequestReasonCodeCcText() /** { "tree" :"SupplyRequest.reasonCode", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, setText"} **/
						));
Supplyrequestobj.addReasonReference(HapiFHIRHelpers.createReference(supplyrequest.getSpplRqstRsnRfrncRfrnce() /** { "tree" :"SupplyRequest.reasonReference", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonReference"} **/
						));
Supplyrequestobj.setDeliverFrom(HapiFHIRHelpers.createReference(supplyrequest.getSpplRqstDlvrFrmRfrnce() /** { "tree" :"SupplyRequest.deliverFrom", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDeliverFrom"} **/
						));
Supplyrequestobj.setDeliverTo(HapiFHIRHelpers.createReference(supplyrequest.getSupplyRequestDeliverToReference() /** { "tree" :"SupplyRequest.deliverTo", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDeliverTo"} **/
		));
	}
}
