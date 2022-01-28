package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Deviceusestatement.
 * @see .Deviceusestatement
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class DeviceusestatementConversion 
{
	public Patient Deviceusestatements(main.templateoutput.Model.Deviceusestatement deviceusestatement) 
	{
			Patient  Deviceusestatementobj = new Patient(); 

						Deviceusestatementobj.addIdentifier(HapiFHIRHelpers.createIdentifier(deviceusestatement.getDvcsSttmntDntfrDntfrSe() /** { "tree" :"DeviceUseStatement.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, deviceusestatement.getDvcsSttmntDntfrDntfrTpCcCSstm() /** { "tree" :"DeviceUseStatement.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, deviceusestatement.getDvcsSttmntDntfrDntfrTpCcCVrsn() /** { "tree" :"DeviceUseStatement.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, deviceusestatement.getDvcsSttmntDntfrDntfrTpCcCCde() /** { "tree" :"DeviceUseStatement.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, deviceusestatement.getDvcsSttmntDntfrDntfrTpCcCDsplay() /** { "tree" :"DeviceUseStatement.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, deviceusestatement.getDvcsSttmntDntfrDntfrTpCcCSrSlctd() /** { "tree" :"DeviceUseStatement.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, deviceusestatement.getDvcsSttmntDntfrDntfrTpCcTxt() /** { "tree" :"DeviceUseStatement.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, deviceusestatement.getDvcsSttmntDntfrDntfrPrdPrdStrt() /** { "tree" :"DeviceUseStatement.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, deviceusestatement.getDvcsSttmntDntfrDntfrPrdPrdNd() /** { "tree" :"DeviceUseStatement.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, deviceusestatement.getDvcsSttmntDntfrDntfrSsgnr() /** { "tree" :"DeviceUseStatement.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, deviceusestatement.getDvcsSttmntDntfrDntfrVlue() /** { "tree" :"DeviceUseStatement.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, deviceusestatement.getDvcsSttmntDntfrDntfrSstm() /** { "tree" :"DeviceUseStatement.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Deviceusestatementobj.addBasedOn(HapiFHIRHelpers.createReference(deviceusestatement.getDvcsSttmntBsdnRfrnce() /** { "tree" :"DeviceUseStatement.basedOn", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBasedOn"} **/
						));
Deviceusestatementobj.setStatus(HapiFHIRHelpers.createcode(deviceusestatement.getDeviceUseStatementStatusCode() /** { "tree" :"DeviceUseStatement.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Deviceusestatementobj.setSubject(HapiFHIRHelpers.createReference(deviceusestatement.getDvcsSttmntSbjctRfrnce() /** { "tree" :"DeviceUseStatement.subject", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setSubject"} **/
						));
Deviceusestatementobj.addDerivedFrom(HapiFHIRHelpers.createReference(deviceusestatement.getDvcsSttmntDrvdFrmRfrnce() /** { "tree" :"DeviceUseStatement.derivedFrom", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDerivedFrom"} **/
						));
Deviceusestatementobj.setTimingTiming(HapiFHIRHelpers.createTiming(deviceusestatement.getDvcsSttmntTmngTmngTmngCdCcCSstm() /** { "tree" :"DeviceUseStatement.timingTiming", "datatype" : "Timing, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTimingTiming, setCode, addCoding, setSystem"} **/
						, deviceusestatement.getDvcsSttmntTmngTmngTmngCdCcCVrsn() /** { "tree" :"DeviceUseStatement.timingTiming", "datatype" : "Timing, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTimingTiming, setCode, addCoding, setVersion"} **/
						, deviceusestatement.getDvcsSttmntTmngTmngTmngCdCcCCde() /** { "tree" :"DeviceUseStatement.timingTiming", "datatype" : "Timing, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTimingTiming, setCode, addCoding, setCode"} **/
						, deviceusestatement.getDvcsSttmntTmngTmngTmngCdCcCDsplay() /** { "tree" :"DeviceUseStatement.timingTiming", "datatype" : "Timing, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTimingTiming, setCode, addCoding, setDisplay"} **/
						, deviceusestatement.getDvcsSttmntTmngTmngTmngCdCcCSrSlctd() /** { "tree" :"DeviceUseStatement.timingTiming", "datatype" : "Timing, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTimingTiming, setCode, addCoding, setUserSelected"} **/
						, deviceusestatement.getDvcsSttmntTmngTmngTmngCdCcTxt() /** { "tree" :"DeviceUseStatement.timingTiming", "datatype" : "Timing, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTimingTiming, setCode, setText"} **/
						, deviceusestatement.getDvcsSttmntTmngTmngTmngVnt() /** { "tree" :"DeviceUseStatement.timingTiming", "datatype" : "Timing, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTimingTiming, addEvent"} **/
						, deviceusestatement.getDvcsSttmntTmngTmngTmngRptDrtnnt() /** { "tree" :"DeviceUseStatement.timingTiming", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTimingTiming, setRepeat, setDurationUnit"} **/
						, deviceusestatement.getDvcsSttmntTmngTmngTmngRptPrdnt() /** { "tree" :"DeviceUseStatement.timingTiming", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTimingTiming, setRepeat, setPeriodUnit"} **/
						, deviceusestatement.getDvcsSttmntTmngTmngTmngRptDfWk() /** { "tree" :"DeviceUseStatement.timingTiming", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTimingTiming, setRepeat, addDayOfWeek"} **/
						, deviceusestatement.getDvcsSttmntTmngTmngTmngRptWhn() /** { "tree" :"DeviceUseStatement.timingTiming", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTimingTiming, setRepeat, addWhen"} **/
						, deviceusestatement.getDvcsSttmntTmngTmngTmngRptDrtn() /** { "tree" :"DeviceUseStatement.timingTiming", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTimingTiming, setRepeat, setDuration"} **/
						, deviceusestatement.getDvcsSttmntTmngTmngTmngRptDrtnMx() /** { "tree" :"DeviceUseStatement.timingTiming", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTimingTiming, setRepeat, setDurationMax"} **/
						, deviceusestatement.getDvcsSttmntTmngTmngTmngRptPrd() /** { "tree" :"DeviceUseStatement.timingTiming", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTimingTiming, setRepeat, setPeriod"} **/
						, deviceusestatement.getDvcsSttmntTmngTmngTmngRptPrdMx() /** { "tree" :"DeviceUseStatement.timingTiming", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTimingTiming, setRepeat, setPeriodMax"} **/
						, deviceusestatement.getDvcsSttmntTmngTmngTmngRptBndsDrtn() /** { "tree" :"DeviceUseStatement.timingTiming", "datatype" : "Timing, Element, Duration", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTimingTiming, setRepeat, setBoundsDuration"} **/
						, deviceusestatement.getDvcsSttmntTmngTmngTmngRptBndsPrd() /** { "tree" :"DeviceUseStatement.timingTiming", "datatype" : "Timing, Element, Period", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTimingTiming, setRepeat, setBoundsPeriod"} **/
						, deviceusestatement.getDvcsSttmntTmngTmngTmngRptCnt() /** { "tree" :"DeviceUseStatement.timingTiming", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTimingTiming, setRepeat, setCount"} **/
						, deviceusestatement.getDvcsSttmntTmngTmngTmngRptCntMx() /** { "tree" :"DeviceUseStatement.timingTiming", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTimingTiming, setRepeat, setCountMax"} **/
						, deviceusestatement.getDvcsSttmntTmngTmngTmngRptFrqncy() /** { "tree" :"DeviceUseStatement.timingTiming", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTimingTiming, setRepeat, setFrequency"} **/
						, deviceusestatement.getDvcsSttmntTmngTmngTmngRptFrqncMx() /** { "tree" :"DeviceUseStatement.timingTiming", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTimingTiming, setRepeat, setFrequencyMax"} **/
						, deviceusestatement.getDvcsSttmntTmngTmngTmngRptBndsRnge() /** { "tree" :"DeviceUseStatement.timingTiming", "datatype" : "Timing, Element, Range", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTimingTiming, setRepeat, setBoundsRange"} **/
						, deviceusestatement.getDvcsSttmntTmngTmngTmngRptTmfDay() /** { "tree" :"DeviceUseStatement.timingTiming", "datatype" : "Timing, Element, time", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTimingTiming, setRepeat, addTimeOfDay"} **/
						, deviceusestatement.getDvcsSttmntTmngTmngTmngRptFfst() /** { "tree" :"DeviceUseStatement.timingTiming", "datatype" : "Timing, Element, unsignedInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTimingTiming, setRepeat, setOffset"} **/
						));
Deviceusestatementobj.setTimingPeriod(HapiFHIRHelpers.createPeriod(deviceusestatement.getDvcsSttmntTmngPrdPrdStrt() /** { "tree" :"DeviceUseStatement.timingPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTimingPeriod, setStart"} **/
						, deviceusestatement.getDvcsSttmntTmngPrdPrdNd() /** { "tree" :"DeviceUseStatement.timingPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTimingPeriod, setEnd"} **/
						));
Deviceusestatementobj.setTiming(HapiFHIRHelpers.createdateTimetype(deviceusestatement.getDvcsSttmntTmngDttmDtTme() /** { "tree" :"DeviceUseStatement.timingDatetime", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTimingDatetime"} **/
						));
Deviceusestatementobj.setRecordedOn(HapiFHIRHelpers.createdateTime(deviceusestatement.getDvcsSttmntRcrddnDtTme() /** { "tree" :"DeviceUseStatement.recordedOn", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRecordedOn"} **/
						));
Deviceusestatementobj.setSource(HapiFHIRHelpers.createReference(deviceusestatement.getDvcsSttmntSrcRfrnce() /** { "tree" :"DeviceUseStatement.source", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSource"} **/
						));
Deviceusestatementobj.setDevice(HapiFHIRHelpers.createReference(deviceusestatement.getDvcsSttmntDvcRfrnce() /** { "tree" :"DeviceUseStatement.device", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setDevice"} **/
						));
Deviceusestatementobj.addReasonCode(HapiFHIRHelpers.createCodeableConcept(deviceusestatement.getDvcsSttmntRsnCdCcCdngCSstm() /** { "tree" :"DeviceUseStatement.reasonCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setSystem"} **/
						, deviceusestatement.getDvcsSttmntRsnCdCcCdngCVrsn() /** { "tree" :"DeviceUseStatement.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setVersion"} **/
						, deviceusestatement.getDvcsSttmntRsnCdCcCdngCCde() /** { "tree" :"DeviceUseStatement.reasonCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setCode"} **/
						, deviceusestatement.getDvcsSttmntRsnCdCcCdngCDsplay() /** { "tree" :"DeviceUseStatement.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setDisplay"} **/
						, deviceusestatement.getDvcsSttmntRsnCdCcCdngCSrSlctd() /** { "tree" :"DeviceUseStatement.reasonCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setUserSelected"} **/
						, deviceusestatement.getDvcsSttmntRsnCdCcTxt() /** { "tree" :"DeviceUseStatement.reasonCode", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, setText"} **/
						));
Deviceusestatementobj.addReasonReference(HapiFHIRHelpers.createReference(deviceusestatement.getDvcsSttmntRsnRfrncRfrnce() /** { "tree" :"DeviceUseStatement.reasonReference", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonReference"} **/
						));
Deviceusestatementobj.setBodySite(HapiFHIRHelpers.createCodeableConcept(deviceusestatement.getDvcsSttmntBdStCcCdngCSstm() /** { "tree" :"DeviceUseStatement.bodySite", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBodySite, addCoding, setSystem"} **/
						, deviceusestatement.getDvcsSttmntBdStCcCdngCVrsn() /** { "tree" :"DeviceUseStatement.bodySite", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBodySite, addCoding, setVersion"} **/
						, deviceusestatement.getDvcsSttmntBdStCcCdngCCde() /** { "tree" :"DeviceUseStatement.bodySite", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBodySite, addCoding, setCode"} **/
						, deviceusestatement.getDvcsSttmntBdStCcCdngCDsplay() /** { "tree" :"DeviceUseStatement.bodySite", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBodySite, addCoding, setDisplay"} **/
						, deviceusestatement.getDvcsSttmntBdStCcCdngCSrSlctd() /** { "tree" :"DeviceUseStatement.bodySite", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBodySite, addCoding, setUserSelected"} **/
						, deviceusestatement.getDvcsSttmntBdStCcTxt() /** { "tree" :"DeviceUseStatement.bodySite", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBodySite, setText"} **/
						));
Deviceusestatementobj.addNote(HapiFHIRHelpers.createAnnotation(deviceusestatement.getDvcsSttmntNtNnttnTme() /** { "tree" :"DeviceUseStatement.note", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setTime"} **/
						, deviceusestatement.getDvcsSttmntNtNnttnTxt() /** { "tree" :"DeviceUseStatement.note", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setText"} **/
						, deviceusestatement.getDvcsSttmntNtNnttnThrRfrnce() /** { "tree" :"DeviceUseStatement.note", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorReference"} **/
						, deviceusestatement.getDvcsSttmntNtNnttnThrStrng() /** { "tree" :"DeviceUseStatement.note", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorString"} **/
		));
	}
}
