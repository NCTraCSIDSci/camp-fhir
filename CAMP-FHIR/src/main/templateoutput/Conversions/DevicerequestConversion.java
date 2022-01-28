package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Devicerequest.
 * @see .Devicerequest
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class DevicerequestConversion 
{
	public Patient Devicerequests(main.templateoutput.Model.Devicerequest devicerequest) 
	{
			Patient  Devicerequestobj = new Patient(); 

						Devicerequestobj.addIdentifier(HapiFHIRHelpers.createIdentifier(devicerequest.getDvcRqstDntfrDntfrSe() /** { "tree" :"DeviceRequest.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, devicerequest.getDvcRqstDntfrDntfrTpCcCSstm() /** { "tree" :"DeviceRequest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, devicerequest.getDvcRqstDntfrDntfrTpCcCVrsn() /** { "tree" :"DeviceRequest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, devicerequest.getDvcRqstDntfrDntfrTpCcCCde() /** { "tree" :"DeviceRequest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, devicerequest.getDvcRqstDntfrDntfrTpCcCDsplay() /** { "tree" :"DeviceRequest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, devicerequest.getDvcRqstDntfrDntfrTpCcCSrSlctd() /** { "tree" :"DeviceRequest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, devicerequest.getDvcRqstDntfrDntfrTpCcTxt() /** { "tree" :"DeviceRequest.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, devicerequest.getDvcRqstDntfrDntfrPrdPrdStrt() /** { "tree" :"DeviceRequest.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, devicerequest.getDvcRqstDntfrDntfrPrdPrdNd() /** { "tree" :"DeviceRequest.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, devicerequest.getDvcRqstDntfrDntfrSsgnr() /** { "tree" :"DeviceRequest.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, devicerequest.getDvcRqstDntfrDntfrVlue() /** { "tree" :"DeviceRequest.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, devicerequest.getDvcRqstDntfrDntfrSstm() /** { "tree" :"DeviceRequest.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Devicerequestobj.addInstantiatesCanonical(HapiFHIRHelpers.createcanonical(devicerequest.getDvcRqstNstnttsCnnclCnncl() /** { "tree" :"DeviceRequest.instantiatesCanonical", "datatype" : "canonical", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addInstantiatesCanonical"} **/
						));
Devicerequestobj.addInstantiatesUri(HapiFHIRHelpers.createuri(devicerequest.getDeviceRequestInstantiatesUriUri() /** { "tree" :"DeviceRequest.instantiatesUri", "datatype" : "uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addInstantiatesUri"} **/
						));
Devicerequestobj.addBasedOn(HapiFHIRHelpers.createReference(devicerequest.getDeviceRequestBasedOnReference() /** { "tree" :"DeviceRequest.basedOn", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBasedOn"} **/
						));
Devicerequestobj.addPriorRequest(HapiFHIRHelpers.createReference(devicerequest.getDvcRqstPrrRqstRfrnce() /** { "tree" :"DeviceRequest.priorRequest", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPriorRequest"} **/
						));
Devicerequestobj.setGroupIdentifier(HapiFHIRHelpers.createIdentifier(devicerequest.getDvcRqstGrpdntfrDntfrSe() /** { "tree" :"DeviceRequest.groupIdentifier", "datatype" : "Identifier, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setUse"} **/
						, devicerequest.getDvcRqstGrpdntfrDntfrTpCcCSstm() /** { "tree" :"DeviceRequest.groupIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setType, addCoding, setSystem"} **/
						, devicerequest.getDvcRqstGrpdntfrDntfrTpCcCVrsn() /** { "tree" :"DeviceRequest.groupIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setType, addCoding, setVersion"} **/
						, devicerequest.getDvcRqstGrpdntfrDntfrTpCcCCde() /** { "tree" :"DeviceRequest.groupIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setType, addCoding, setCode"} **/
						, devicerequest.getDvcRqstGrpdntfrDntfrTpCcCDsplay() /** { "tree" :"DeviceRequest.groupIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setType, addCoding, setDisplay"} **/
						, devicerequest.getDvcRqstGrpdntfrDntfrTpCcCSrSlctd() /** { "tree" :"DeviceRequest.groupIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setType, addCoding, setUserSelected"} **/
						, devicerequest.getDvcRqstGrpdntfrDntfrTpCcTxt() /** { "tree" :"DeviceRequest.groupIdentifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setType, setText"} **/
						, devicerequest.getDvcRqstGrpdntfrDntfrPrdPrdStrt() /** { "tree" :"DeviceRequest.groupIdentifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setPeriod, setStart"} **/
						, devicerequest.getDvcRqstGrpdntfrDntfrPrdPrdNd() /** { "tree" :"DeviceRequest.groupIdentifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setPeriod, setEnd"} **/
						, devicerequest.getDvcRqstGrpdntfrDntfrSsgnr() /** { "tree" :"DeviceRequest.groupIdentifier", "datatype" : "Identifier, Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setAssigner"} **/
						, devicerequest.getDvcRqstGrpdntfrDntfrVlue() /** { "tree" :"DeviceRequest.groupIdentifier", "datatype" : "Identifier, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setValue"} **/
						, devicerequest.getDvcRqstGrpdntfrDntfrSstm() /** { "tree" :"DeviceRequest.groupIdentifier", "datatype" : "Identifier, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setGroupIdentifier, setSystem"} **/
						));
Devicerequestobj.setStatus(HapiFHIRHelpers.createcode(devicerequest.getDeviceRequestStatusCode() /** { "tree" :"DeviceRequest.status", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Devicerequestobj.setIntent(HapiFHIRHelpers.createcode(devicerequest.getDeviceRequestIntentCode() /** { "tree" :"DeviceRequest.intent", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setIntent"} **/
						));
Devicerequestobj.setPriority(HapiFHIRHelpers.createcode(devicerequest.getDeviceRequestPriorityCode() /** { "tree" :"DeviceRequest.priority", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPriority"} **/
						));
Devicerequestobj.setCodeReference(device)(HapiFHIRHelpers.createReference(devicerequest.getDvcRqstCdRfrncRfrnce() /** { "tree" :"DeviceRequest.codeReference", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCodeReference(device)"} **/
						));
Devicerequestobj.setCodeCodeableconcept(HapiFHIRHelpers.createCodeableConcept(devicerequest.getDvcRqstCdCdblcncptCcCdngCSstm() /** { "tree" :"DeviceRequest.codeCodeableconcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCodeCodeableconcept, addCoding, setSystem"} **/
						, devicerequest.getDvcRqstCdCdblcncptCcCdngCVrsn() /** { "tree" :"DeviceRequest.codeCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCodeCodeableconcept, addCoding, setVersion"} **/
						, devicerequest.getDvcRqstCdCdblcncptCcCdngCCde() /** { "tree" :"DeviceRequest.codeCodeableconcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCodeCodeableconcept, addCoding, setCode"} **/
						, devicerequest.getDvcRqstCdCdblcncptCcCdngCDsplay() /** { "tree" :"DeviceRequest.codeCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCodeCodeableconcept, addCoding, setDisplay"} **/
						, devicerequest.getDvcRqstCdCdblcncptCcCdngCSrSlctd() /** { "tree" :"DeviceRequest.codeCodeableconcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCodeCodeableconcept, addCoding, setUserSelected"} **/
						, devicerequest.getDvcRqstCdCdblcncptCcTxt() /** { "tree" :"DeviceRequest.codeCodeableconcept", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCodeCodeableconcept, setText"} **/
						));
Devicerequestobj.setCode(HapiFHIRHelpers.createCodeableConcept(devicerequest.getDvcRqstPrmtrCdCcCdngCSstm() /** { "tree" :"DeviceRequest.parameter.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setCode, addCoding, setSystem"} **/
						, devicerequest.getDvcRqstPrmtrCdCcCdngCVrsn() /** { "tree" :"DeviceRequest.parameter.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setCode, addCoding, setVersion"} **/
						, devicerequest.getDvcRqstPrmtrCdCcCdngCCde() /** { "tree" :"DeviceRequest.parameter.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setCode, addCoding, setCode"} **/
						, devicerequest.getDvcRqstPrmtrCdCcCdngCDsplay() /** { "tree" :"DeviceRequest.parameter.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, devicerequest.getDvcRqstPrmtrCdCcCdngCSrSlctd() /** { "tree" :"DeviceRequest.parameter.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, devicerequest.getDvcRqstPrmtrCdCcTxt() /** { "tree" :"DeviceRequest.parameter.code", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setCode, setText"} **/
						));
Devicerequestobj.setValueCodeableconcept(HapiFHIRHelpers.createCodeableConcept(devicerequest.getDvcRqstPrmtrVlCdblcncptCcCdngCSstm() /** { "tree" :"DeviceRequest.parameter.valueCodeableconcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setValueCodeableconcept, addCoding, setSystem"} **/
						, devicerequest.getDvcRqstPrmtrVlCdblcncptCcCdngCVrsn() /** { "tree" :"DeviceRequest.parameter.valueCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setValueCodeableconcept, addCoding, setVersion"} **/
						, devicerequest.getDvcRqstPrmtrVlCdblcncptCcCdngCCde() /** { "tree" :"DeviceRequest.parameter.valueCodeableconcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setValueCodeableconcept, addCoding, setCode"} **/
						, devicerequest.getDvcRqstPrmtrVlCdblcncptCcCdngCDsplay() /** { "tree" :"DeviceRequest.parameter.valueCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setValueCodeableconcept, addCoding, setDisplay"} **/
						, devicerequest.getDvcRqstPrmtrVlCdblcncptCcCdngCSrSlctd() /** { "tree" :"DeviceRequest.parameter.valueCodeableconcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setValueCodeableconcept, addCoding, setUserSelected"} **/
						, devicerequest.getDvcRqstPrmtrVlCdblcncptCcTxt() /** { "tree" :"DeviceRequest.parameter.valueCodeableconcept", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setValueCodeableconcept, setText"} **/
						));
Devicerequestobj.setValueQuantity(HapiFHIRHelpers.createQuantity(devicerequest.getDvcRqstPrmtrVlQnttQnttCmprtr() /** { "tree" :"DeviceRequest.parameter.valueQuantity", "datatype" : "Quantity, code", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setValueQuantity, setComparator"} **/
						, devicerequest.getDvcRqstPrmtrVlQnttQnttCde() /** { "tree" :"DeviceRequest.parameter.valueQuantity", "datatype" : "Quantity, code", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setValueQuantity, setCode"} **/
						, devicerequest.getDvcRqstPrmtrVlQnttQnttVlue() /** { "tree" :"DeviceRequest.parameter.valueQuantity", "datatype" : "Quantity, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setValueQuantity, setValue"} **/
						, devicerequest.getDvcRqstPrmtrVlQnttQnttNt() /** { "tree" :"DeviceRequest.parameter.valueQuantity", "datatype" : "Quantity, string", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setValueQuantity, setUnit"} **/
						, devicerequest.getDvcRqstPrmtrVlQnttQnttSstm() /** { "tree" :"DeviceRequest.parameter.valueQuantity", "datatype" : "Quantity, uri", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setValueQuantity, setSystem"} **/
						));
Devicerequestobj.setValueRange(HapiFHIRHelpers.createRange(devicerequest.getDvcRqstPrmtrVlRngRngLw() /** { "tree" :"DeviceRequest.parameter.valueRange", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setValueRange, setLow"} **/
						, devicerequest.getDvcRqstPrmtrVlRngRngHgh() /** { "tree" :"DeviceRequest.parameter.valueRange", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setValueRange, setHigh"} **/
						));
Devicerequestobj.setValue(HapiFHIRHelpers.createbooleantype(devicerequest.getDvcRqstPrmtrVlBlnBln() /** { "tree" :"DeviceRequest.parameter.valueBoolean", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addParameter"] , "methodName" : "setValueBoolean"} **/
						));
Devicerequestobj.setSubject(HapiFHIRHelpers.createReference(devicerequest.getDeviceRequestSubjectReference() /** { "tree" :"DeviceRequest.subject", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setSubject"} **/
						));
Devicerequestobj.setEncounter(HapiFHIRHelpers.createReference(devicerequest.getDeviceRequestEncounterReference() /** { "tree" :"DeviceRequest.encounter", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEncounter"} **/
						));
Devicerequestobj.setOccurrence(HapiFHIRHelpers.createdateTimetype(devicerequest.getDvcRqstCcrrncDttmDtTme() /** { "tree" :"DeviceRequest.occurrenceDatetime", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceDatetime"} **/
						));
Devicerequestobj.setOccurrencePeriod(HapiFHIRHelpers.createPeriod(devicerequest.getDvcRqstCcrrncPrdPrdStrt() /** { "tree" :"DeviceRequest.occurrencePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrencePeriod, setStart"} **/
						, devicerequest.getDvcRqstCcrrncPrdPrdNd() /** { "tree" :"DeviceRequest.occurrencePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrencePeriod, setEnd"} **/
						));
Devicerequestobj.setOccurrenceTiming(HapiFHIRHelpers.createTiming(devicerequest.getDvcRqstCcrrncTmngTmngCdCcCSstm() /** { "tree" :"DeviceRequest.occurrenceTiming", "datatype" : "Timing, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setCode, addCoding, setSystem"} **/
						, devicerequest.getDvcRqstCcrrncTmngTmngCdCcCVrsn() /** { "tree" :"DeviceRequest.occurrenceTiming", "datatype" : "Timing, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setCode, addCoding, setVersion"} **/
						, devicerequest.getDvcRqstCcrrncTmngTmngCdCcCCde() /** { "tree" :"DeviceRequest.occurrenceTiming", "datatype" : "Timing, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setCode, addCoding, setCode"} **/
						, devicerequest.getDvcRqstCcrrncTmngTmngCdCcCDsplay() /** { "tree" :"DeviceRequest.occurrenceTiming", "datatype" : "Timing, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setCode, addCoding, setDisplay"} **/
						, devicerequest.getDvcRqstCcrrncTmngTmngCdCcCSrSlctd() /** { "tree" :"DeviceRequest.occurrenceTiming", "datatype" : "Timing, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setCode, addCoding, setUserSelected"} **/
						, devicerequest.getDvcRqstCcrrncTmngTmngCdCcTxt() /** { "tree" :"DeviceRequest.occurrenceTiming", "datatype" : "Timing, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setCode, setText"} **/
						, devicerequest.getDvcRqstCcrrncTmngTmngVnt() /** { "tree" :"DeviceRequest.occurrenceTiming", "datatype" : "Timing, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, addEvent"} **/
						, devicerequest.getDvcRqstCcrrncTmngTmngRptDrtnnt() /** { "tree" :"DeviceRequest.occurrenceTiming", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setDurationUnit"} **/
						, devicerequest.getDvcRqstCcrrncTmngTmngRptPrdnt() /** { "tree" :"DeviceRequest.occurrenceTiming", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setPeriodUnit"} **/
						, devicerequest.getDvcRqstCcrrncTmngTmngRptDfWk() /** { "tree" :"DeviceRequest.occurrenceTiming", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, addDayOfWeek"} **/
						, devicerequest.getDvcRqstCcrrncTmngTmngRptWhn() /** { "tree" :"DeviceRequest.occurrenceTiming", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, addWhen"} **/
						, devicerequest.getDvcRqstCcrrncTmngTmngRptDrtn() /** { "tree" :"DeviceRequest.occurrenceTiming", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setDuration"} **/
						, devicerequest.getDvcRqstCcrrncTmngTmngRptDrtnMx() /** { "tree" :"DeviceRequest.occurrenceTiming", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setDurationMax"} **/
						, devicerequest.getDvcRqstCcrrncTmngTmngRptPrd() /** { "tree" :"DeviceRequest.occurrenceTiming", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setPeriod"} **/
						, devicerequest.getDvcRqstCcrrncTmngTmngRptPrdMx() /** { "tree" :"DeviceRequest.occurrenceTiming", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setPeriodMax"} **/
						, devicerequest.getDvcRqstCcrrncTmngTmngRptBndsDrtn() /** { "tree" :"DeviceRequest.occurrenceTiming", "datatype" : "Timing, Element, Duration", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setBoundsDuration"} **/
						, devicerequest.getDvcRqstCcrrncTmngTmngRptBndsPrd() /** { "tree" :"DeviceRequest.occurrenceTiming", "datatype" : "Timing, Element, Period", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setBoundsPeriod"} **/
						, devicerequest.getDvcRqstCcrrncTmngTmngRptCnt() /** { "tree" :"DeviceRequest.occurrenceTiming", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setCount"} **/
						, devicerequest.getDvcRqstCcrrncTmngTmngRptCntMx() /** { "tree" :"DeviceRequest.occurrenceTiming", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setCountMax"} **/
						, devicerequest.getDvcRqstCcrrncTmngTmngRptFrqncy() /** { "tree" :"DeviceRequest.occurrenceTiming", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setFrequency"} **/
						, devicerequest.getDvcRqstCcrrncTmngTmngRptFrqncMx() /** { "tree" :"DeviceRequest.occurrenceTiming", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setFrequencyMax"} **/
						, devicerequest.getDvcRqstCcrrncTmngTmngRptBndsRnge() /** { "tree" :"DeviceRequest.occurrenceTiming", "datatype" : "Timing, Element, Range", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setBoundsRange"} **/
						, devicerequest.getDvcRqstCcrrncTmngTmngRptTmfDay() /** { "tree" :"DeviceRequest.occurrenceTiming", "datatype" : "Timing, Element, time", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, addTimeOfDay"} **/
						, devicerequest.getDvcRqstCcrrncTmngTmngRptFfst() /** { "tree" :"DeviceRequest.occurrenceTiming", "datatype" : "Timing, Element, unsignedInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceTiming, setRepeat, setOffset"} **/
						));
Devicerequestobj.setAuthoredOn(HapiFHIRHelpers.createdateTime(devicerequest.getDeviceRequestAuthoredOnDateTime() /** { "tree" :"DeviceRequest.authoredOn", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAuthoredOn"} **/
						));
Devicerequestobj.setRequester(HapiFHIRHelpers.createReference(devicerequest.getDeviceRequestRequesterReference() /** { "tree" :"DeviceRequest.requester", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequester"} **/
						));
Devicerequestobj.setPerformerType(HapiFHIRHelpers.createCodeableConcept(devicerequest.getDvcRqstPrfrmrTpCcCdngCSstm() /** { "tree" :"DeviceRequest.performerType", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPerformerType, addCoding, setSystem"} **/
						, devicerequest.getDvcRqstPrfrmrTpCcCdngCVrsn() /** { "tree" :"DeviceRequest.performerType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPerformerType, addCoding, setVersion"} **/
						, devicerequest.getDvcRqstPrfrmrTpCcCdngCCde() /** { "tree" :"DeviceRequest.performerType", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPerformerType, addCoding, setCode"} **/
						, devicerequest.getDvcRqstPrfrmrTpCcCdngCDsplay() /** { "tree" :"DeviceRequest.performerType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPerformerType, addCoding, setDisplay"} **/
						, devicerequest.getDvcRqstPrfrmrTpCcCdngCSrSlctd() /** { "tree" :"DeviceRequest.performerType", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPerformerType, addCoding, setUserSelected"} **/
						, devicerequest.getDvcRqstPrfrmrTpCcTxt() /** { "tree" :"DeviceRequest.performerType", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPerformerType, setText"} **/
						));
Devicerequestobj.setPerformer(HapiFHIRHelpers.createReference(devicerequest.getDeviceRequestPerformerReference() /** { "tree" :"DeviceRequest.performer", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPerformer"} **/
						));
Devicerequestobj.addReasonCode(HapiFHIRHelpers.createCodeableConcept(devicerequest.getDvcRqstRsnCdCcCdngCSstm() /** { "tree" :"DeviceRequest.reasonCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setSystem"} **/
						, devicerequest.getDvcRqstRsnCdCcCdngCVrsn() /** { "tree" :"DeviceRequest.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setVersion"} **/
						, devicerequest.getDvcRqstRsnCdCcCdngCCde() /** { "tree" :"DeviceRequest.reasonCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setCode"} **/
						, devicerequest.getDvcRqstRsnCdCcCdngCDsplay() /** { "tree" :"DeviceRequest.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setDisplay"} **/
						, devicerequest.getDvcRqstRsnCdCcCdngCSrSlctd() /** { "tree" :"DeviceRequest.reasonCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setUserSelected"} **/
						, devicerequest.getDeviceRequestReasonCodeCcText() /** { "tree" :"DeviceRequest.reasonCode", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, setText"} **/
						));
Devicerequestobj.addReasonReference(HapiFHIRHelpers.createReference(devicerequest.getDvcRqstRsnRfrncRfrnce() /** { "tree" :"DeviceRequest.reasonReference", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonReference"} **/
						));
Devicerequestobj.addInsurance(HapiFHIRHelpers.createReference(devicerequest.getDeviceRequestInsuranceReference() /** { "tree" :"DeviceRequest.insurance", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addInsurance"} **/
						));
Devicerequestobj.addSupportingInfo(HapiFHIRHelpers.createReference(devicerequest.getDvcRqstSpprtngnfRfrnce() /** { "tree" :"DeviceRequest.supportingInfo", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSupportingInfo"} **/
						));
Devicerequestobj.addNote(HapiFHIRHelpers.createAnnotation(devicerequest.getDeviceRequestNoteAnnotationTime() /** { "tree" :"DeviceRequest.note", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setTime"} **/
						, devicerequest.getDeviceRequestNoteAnnotationText() /** { "tree" :"DeviceRequest.note", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setText"} **/
						, devicerequest.getDvcRqstNtNnttnThrRfrnce() /** { "tree" :"DeviceRequest.note", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorReference"} **/
						, devicerequest.getDvcRqstNtNnttnThrStrng() /** { "tree" :"DeviceRequest.note", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorString"} **/
						));
Devicerequestobj.addRelevantHistory(HapiFHIRHelpers.createReference(devicerequest.getDvcRqstRlvntHstrRfrnce() /** { "tree" :"DeviceRequest.relevantHistory", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelevantHistory"} **/
		));
	}
}
