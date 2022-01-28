package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Devicemetric.
 * @see .Devicemetric
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class DevicemetricConversion 
{
	public Patient Devicemetrics(main.templateoutput.Model.Devicemetric devicemetric) 
	{
			Patient  Devicemetricobj = new Patient(); 

						Devicemetricobj.addIdentifier(HapiFHIRHelpers.createIdentifier(devicemetric.getDvcMtrcDntfrDntfrSe() /** { "tree" :"DeviceMetric.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, devicemetric.getDvcMtrcDntfrDntfrTpCcCSstm() /** { "tree" :"DeviceMetric.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, devicemetric.getDvcMtrcDntfrDntfrTpCcCVrsn() /** { "tree" :"DeviceMetric.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, devicemetric.getDvcMtrcDntfrDntfrTpCcCCde() /** { "tree" :"DeviceMetric.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, devicemetric.getDvcMtrcDntfrDntfrTpCcCDsplay() /** { "tree" :"DeviceMetric.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, devicemetric.getDvcMtrcDntfrDntfrTpCcCSrSlctd() /** { "tree" :"DeviceMetric.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, devicemetric.getDvcMtrcDntfrDntfrTpCcTxt() /** { "tree" :"DeviceMetric.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, devicemetric.getDvcMtrcDntfrDntfrPrdPrdStrt() /** { "tree" :"DeviceMetric.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, devicemetric.getDvcMtrcDntfrDntfrPrdPrdNd() /** { "tree" :"DeviceMetric.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, devicemetric.getDvcMtrcDntfrDntfrSsgnr() /** { "tree" :"DeviceMetric.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, devicemetric.getDvcMtrcDntfrDntfrVlue() /** { "tree" :"DeviceMetric.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, devicemetric.getDvcMtrcDntfrDntfrSstm() /** { "tree" :"DeviceMetric.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Devicemetricobj.setType(HapiFHIRHelpers.createCodeableConcept(devicemetric.getDvcMtrcTpCcCdngCSstm() /** { "tree" :"DeviceMetric.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType, addCoding, setSystem"} **/
						, devicemetric.getDvcMtrcTpCcCdngCVrsn() /** { "tree" :"DeviceMetric.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType, addCoding, setVersion"} **/
						, devicemetric.getDeviceMetricTypeCcCodingCCode() /** { "tree" :"DeviceMetric.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType, addCoding, setCode"} **/
						, devicemetric.getDvcMtrcTpCcCdngCDsplay() /** { "tree" :"DeviceMetric.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType, addCoding, setDisplay"} **/
						, devicemetric.getDvcMtrcTpCcCdngCSrSlctd() /** { "tree" :"DeviceMetric.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, devicemetric.getDeviceMetricTypeCcText() /** { "tree" :"DeviceMetric.type", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setType, setText"} **/
						));
Devicemetricobj.setUnit(HapiFHIRHelpers.createCodeableConcept(devicemetric.getDvcMtrcNtCcCdngCSstm() /** { "tree" :"DeviceMetric.unit", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setUnit, addCoding, setSystem"} **/
						, devicemetric.getDvcMtrcNtCcCdngCVrsn() /** { "tree" :"DeviceMetric.unit", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setUnit, addCoding, setVersion"} **/
						, devicemetric.getDeviceMetricUnitCcCodingCCode() /** { "tree" :"DeviceMetric.unit", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setUnit, addCoding, setCode"} **/
						, devicemetric.getDvcMtrcNtCcCdngCDsplay() /** { "tree" :"DeviceMetric.unit", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setUnit, addCoding, setDisplay"} **/
						, devicemetric.getDvcMtrcNtCcCdngCSrSlctd() /** { "tree" :"DeviceMetric.unit", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setUnit, addCoding, setUserSelected"} **/
						, devicemetric.getDeviceMetricUnitCcText() /** { "tree" :"DeviceMetric.unit", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setUnit, setText"} **/
						));
Devicemetricobj.setSource(HapiFHIRHelpers.createReference(devicemetric.getDeviceMetricSourceReference() /** { "tree" :"DeviceMetric.source", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSource"} **/
						));
Devicemetricobj.setParent(HapiFHIRHelpers.createReference(devicemetric.getDeviceMetricParentReference() /** { "tree" :"DeviceMetric.parent", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setParent"} **/
						));
Devicemetricobj.setOperationalStatus(HapiFHIRHelpers.createcode(devicemetric.getDvcMtrcPrtnlSttsCde() /** { "tree" :"DeviceMetric.operationalStatus", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOperationalStatus"} **/
						));
Devicemetricobj.setColor(HapiFHIRHelpers.createcode(devicemetric.getDeviceMetricColorCode() /** { "tree" :"DeviceMetric.color", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setColor"} **/
						));
Devicemetricobj.setCategory(HapiFHIRHelpers.createcode(devicemetric.getDeviceMetricCategoryCode() /** { "tree" :"DeviceMetric.category", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCategory"} **/
						));
Devicemetricobj.setMeasurementPeriod(HapiFHIRHelpers.createTiming(devicemetric.getDvcMtrcMsrmntPrdTmngCdCcCSstm() /** { "tree" :"DeviceMetric.measurementPeriod", "datatype" : "Timing, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMeasurementPeriod, setCode, addCoding, setSystem"} **/
						, devicemetric.getDvcMtrcMsrmntPrdTmngCdCcCVrsn() /** { "tree" :"DeviceMetric.measurementPeriod", "datatype" : "Timing, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMeasurementPeriod, setCode, addCoding, setVersion"} **/
						, devicemetric.getDvcMtrcMsrmntPrdTmngCdCcCCde() /** { "tree" :"DeviceMetric.measurementPeriod", "datatype" : "Timing, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMeasurementPeriod, setCode, addCoding, setCode"} **/
						, devicemetric.getDvcMtrcMsrmntPrdTmngCdCcCDsplay() /** { "tree" :"DeviceMetric.measurementPeriod", "datatype" : "Timing, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMeasurementPeriod, setCode, addCoding, setDisplay"} **/
						, devicemetric.getDvcMtrcMsrmntPrdTmngCdCcCSrSlctd() /** { "tree" :"DeviceMetric.measurementPeriod", "datatype" : "Timing, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMeasurementPeriod, setCode, addCoding, setUserSelected"} **/
						, devicemetric.getDvcMtrcMsrmntPrdTmngCdCcTxt() /** { "tree" :"DeviceMetric.measurementPeriod", "datatype" : "Timing, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMeasurementPeriod, setCode, setText"} **/
						, devicemetric.getDvcMtrcMsrmntPrdTmngVnt() /** { "tree" :"DeviceMetric.measurementPeriod", "datatype" : "Timing, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMeasurementPeriod, addEvent"} **/
						, devicemetric.getDvcMtrcMsrmntPrdTmngRptDrtnnt() /** { "tree" :"DeviceMetric.measurementPeriod", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMeasurementPeriod, setRepeat, setDurationUnit"} **/
						, devicemetric.getDvcMtrcMsrmntPrdTmngRptPrdnt() /** { "tree" :"DeviceMetric.measurementPeriod", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMeasurementPeriod, setRepeat, setPeriodUnit"} **/
						, devicemetric.getDvcMtrcMsrmntPrdTmngRptDfWk() /** { "tree" :"DeviceMetric.measurementPeriod", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMeasurementPeriod, setRepeat, addDayOfWeek"} **/
						, devicemetric.getDvcMtrcMsrmntPrdTmngRptWhn() /** { "tree" :"DeviceMetric.measurementPeriod", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMeasurementPeriod, setRepeat, addWhen"} **/
						, devicemetric.getDvcMtrcMsrmntPrdTmngRptDrtn() /** { "tree" :"DeviceMetric.measurementPeriod", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMeasurementPeriod, setRepeat, setDuration"} **/
						, devicemetric.getDvcMtrcMsrmntPrdTmngRptDrtnMx() /** { "tree" :"DeviceMetric.measurementPeriod", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMeasurementPeriod, setRepeat, setDurationMax"} **/
						, devicemetric.getDvcMtrcMsrmntPrdTmngRptPrd() /** { "tree" :"DeviceMetric.measurementPeriod", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMeasurementPeriod, setRepeat, setPeriod"} **/
						, devicemetric.getDvcMtrcMsrmntPrdTmngRptPrdMx() /** { "tree" :"DeviceMetric.measurementPeriod", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMeasurementPeriod, setRepeat, setPeriodMax"} **/
						, devicemetric.getDvcMtrcMsrmntPrdTmngRptBndsDrtn() /** { "tree" :"DeviceMetric.measurementPeriod", "datatype" : "Timing, Element, Duration", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMeasurementPeriod, setRepeat, setBoundsDuration"} **/
						, devicemetric.getDvcMtrcMsrmntPrdTmngRptBndsPrd() /** { "tree" :"DeviceMetric.measurementPeriod", "datatype" : "Timing, Element, Period", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMeasurementPeriod, setRepeat, setBoundsPeriod"} **/
						, devicemetric.getDvcMtrcMsrmntPrdTmngRptCnt() /** { "tree" :"DeviceMetric.measurementPeriod", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMeasurementPeriod, setRepeat, setCount"} **/
						, devicemetric.getDvcMtrcMsrmntPrdTmngRptCntMx() /** { "tree" :"DeviceMetric.measurementPeriod", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMeasurementPeriod, setRepeat, setCountMax"} **/
						, devicemetric.getDvcMtrcMsrmntPrdTmngRptFrqncy() /** { "tree" :"DeviceMetric.measurementPeriod", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMeasurementPeriod, setRepeat, setFrequency"} **/
						, devicemetric.getDvcMtrcMsrmntPrdTmngRptFrqncMx() /** { "tree" :"DeviceMetric.measurementPeriod", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMeasurementPeriod, setRepeat, setFrequencyMax"} **/
						, devicemetric.getDvcMtrcMsrmntPrdTmngRptBndsRnge() /** { "tree" :"DeviceMetric.measurementPeriod", "datatype" : "Timing, Element, Range", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMeasurementPeriod, setRepeat, setBoundsRange"} **/
						, devicemetric.getDvcMtrcMsrmntPrdTmngRptTmfDay() /** { "tree" :"DeviceMetric.measurementPeriod", "datatype" : "Timing, Element, time", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMeasurementPeriod, setRepeat, addTimeOfDay"} **/
						, devicemetric.getDvcMtrcMsrmntPrdTmngRptFfst() /** { "tree" :"DeviceMetric.measurementPeriod", "datatype" : "Timing, Element, unsignedInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMeasurementPeriod, setRepeat, setOffset"} **/
						));
Devicemetricobj.setType(HapiFHIRHelpers.createcode(devicemetric.getDeviceMetricCalibrationTypeCode() /** { "tree" :"DeviceMetric.calibration.type", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addCalibration"] , "methodName" : "setType"} **/
						));
Devicemetricobj.setState(HapiFHIRHelpers.createcode(devicemetric.getDvcMtrcClbrtnSttCde() /** { "tree" :"DeviceMetric.calibration.state", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addCalibration"] , "methodName" : "setState"} **/
						));
Devicemetricobj.setTime(HapiFHIRHelpers.createinstant(devicemetric.getDvcMtrcClbrtnTmNstnt() /** { "tree" :"DeviceMetric.calibration.time", "datatype" : "instant", "cardinality" : "ZeroOne", "elementtree" : ["addCalibration"] , "methodName" : "setTime"} **/
		));
	}
}
