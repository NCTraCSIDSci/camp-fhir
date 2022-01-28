package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Observation.
 * @see .Observation
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class ObservationConversion 
{
	public Patient Observations(main.templateoutput.Model.Observation observation) 
	{
			Patient  Observationobj = new Patient(); 

						Observationobj.addIdentifier(HapiFHIRHelpers.createIdentifier(observation.getObsrvtnDntfrDntfrSe() /** { "tree" :"Observation.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, observation.getObsrvtnDntfrDntfrTpCcCSstm() /** { "tree" :"Observation.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, observation.getObsrvtnDntfrDntfrTpCcCVrsn() /** { "tree" :"Observation.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, observation.getObsrvtnDntfrDntfrTpCcCCde() /** { "tree" :"Observation.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, observation.getObsrvtnDntfrDntfrTpCcCDsplay() /** { "tree" :"Observation.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, observation.getObsrvtnDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Observation.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, observation.getObsrvtnDntfrDntfrTpCcTxt() /** { "tree" :"Observation.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, observation.getObsrvtnDntfrDntfrPrdPrdStrt() /** { "tree" :"Observation.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, observation.getObsrvtnDntfrDntfrPrdPrdNd() /** { "tree" :"Observation.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, observation.getObsrvtnDntfrDntfrSsgnr() /** { "tree" :"Observation.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, observation.getObsrvtnDntfrDntfrVlue() /** { "tree" :"Observation.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, observation.getObsrvtnDntfrDntfrSstm() /** { "tree" :"Observation.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Observationobj.addBasedOn(HapiFHIRHelpers.createReference(observation.getObservationBasedOnReference() /** { "tree" :"Observation.basedOn", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBasedOn"} **/
						));
Observationobj.addPartOf(HapiFHIRHelpers.createReference(observation.getObservationPartOfReference() /** { "tree" :"Observation.partOf", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPartOf"} **/
						));
Observationobj.setStatus(HapiFHIRHelpers.createcode(observation.getObservationStatusCode() /** { "tree" :"Observation.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Observationobj.addCategory(HapiFHIRHelpers.createCodeableConcept(observation.getObsrvtnCtgrCcCdngCSstm() /** { "tree" :"Observation.category", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setSystem"} **/
						, observation.getObsrvtnCtgrCcCdngCVrsn() /** { "tree" :"Observation.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setVersion"} **/
						, observation.getObsrvtnCtgrCcCdngCCde() /** { "tree" :"Observation.category", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setCode"} **/
						, observation.getObsrvtnCtgrCcCdngCDsplay() /** { "tree" :"Observation.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setDisplay"} **/
						, observation.getObsrvtnCtgrCcCdngCSrSlctd() /** { "tree" :"Observation.category", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setUserSelected"} **/
						, observation.getObservationCategoryCcText() /** { "tree" :"Observation.category", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, setText"} **/
						));
Observationobj.setCode(HapiFHIRHelpers.createCodeableConcept(observation.getObsrvtnCdCcCdngCSstm() /** { "tree" :"Observation.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, addCoding, setSystem"} **/
						, observation.getObsrvtnCdCcCdngCVrsn() /** { "tree" :"Observation.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, addCoding, setVersion"} **/
						, observation.getObservationCodeCcCodingCCode() /** { "tree" :"Observation.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, addCoding, setCode"} **/
						, observation.getObsrvtnCdCcCdngCDsplay() /** { "tree" :"Observation.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, observation.getObsrvtnCdCcCdngCSrSlctd() /** { "tree" :"Observation.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, observation.getObservationCodeCcText() /** { "tree" :"Observation.code", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, setText"} **/
						));
Observationobj.setSubject(HapiFHIRHelpers.createReference(observation.getObservationSubjectReference() /** { "tree" :"Observation.subject", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubject"} **/
						));
Observationobj.addFocus(HapiFHIRHelpers.createReference(observation.getObservationFocusReference() /** { "tree" :"Observation.focus", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addFocus"} **/
						));
Observationobj.setEncounter(HapiFHIRHelpers.createReference(observation.getObservationEncounterReference() /** { "tree" :"Observation.encounter", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEncounter"} **/
						));
Observationobj.setEffective(HapiFHIRHelpers.createdateTimetype(observation.getObsrvtnFfctvDttmDtTme() /** { "tree" :"Observation.effectiveDatetime", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectiveDatetime"} **/
						));
Observationobj.setEffectivePeriod(HapiFHIRHelpers.createPeriod(observation.getObsrvtnFfctvPrdPrdStrt() /** { "tree" :"Observation.effectivePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectivePeriod, setStart"} **/
						, observation.getObsrvtnFfctvPrdPrdNd() /** { "tree" :"Observation.effectivePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectivePeriod, setEnd"} **/
						));
Observationobj.setEffectiveTiming(HapiFHIRHelpers.createTiming(observation.getObsrvtnFfctvTmngTmngCdCcCSstm() /** { "tree" :"Observation.effectiveTiming", "datatype" : "Timing, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectiveTiming, setCode, addCoding, setSystem"} **/
						, observation.getObsrvtnFfctvTmngTmngCdCcCVrsn() /** { "tree" :"Observation.effectiveTiming", "datatype" : "Timing, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectiveTiming, setCode, addCoding, setVersion"} **/
						, observation.getObsrvtnFfctvTmngTmngCdCcCCde() /** { "tree" :"Observation.effectiveTiming", "datatype" : "Timing, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectiveTiming, setCode, addCoding, setCode"} **/
						, observation.getObsrvtnFfctvTmngTmngCdCcCDsplay() /** { "tree" :"Observation.effectiveTiming", "datatype" : "Timing, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectiveTiming, setCode, addCoding, setDisplay"} **/
						, observation.getObsrvtnFfctvTmngTmngCdCcCSrSlctd() /** { "tree" :"Observation.effectiveTiming", "datatype" : "Timing, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectiveTiming, setCode, addCoding, setUserSelected"} **/
						, observation.getObsrvtnFfctvTmngTmngCdCcTxt() /** { "tree" :"Observation.effectiveTiming", "datatype" : "Timing, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectiveTiming, setCode, setText"} **/
						, observation.getObsrvtnFfctvTmngTmngVnt() /** { "tree" :"Observation.effectiveTiming", "datatype" : "Timing, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectiveTiming, addEvent"} **/
						, observation.getObsrvtnFfctvTmngTmngRptDrtnnt() /** { "tree" :"Observation.effectiveTiming", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectiveTiming, setRepeat, setDurationUnit"} **/
						, observation.getObsrvtnFfctvTmngTmngRptPrdnt() /** { "tree" :"Observation.effectiveTiming", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectiveTiming, setRepeat, setPeriodUnit"} **/
						, observation.getObsrvtnFfctvTmngTmngRptDfWk() /** { "tree" :"Observation.effectiveTiming", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectiveTiming, setRepeat, addDayOfWeek"} **/
						, observation.getObsrvtnFfctvTmngTmngRptWhn() /** { "tree" :"Observation.effectiveTiming", "datatype" : "Timing, Element, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectiveTiming, setRepeat, addWhen"} **/
						, observation.getObsrvtnFfctvTmngTmngRptDrtn() /** { "tree" :"Observation.effectiveTiming", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectiveTiming, setRepeat, setDuration"} **/
						, observation.getObsrvtnFfctvTmngTmngRptDrtnMx() /** { "tree" :"Observation.effectiveTiming", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectiveTiming, setRepeat, setDurationMax"} **/
						, observation.getObsrvtnFfctvTmngTmngRptPrd() /** { "tree" :"Observation.effectiveTiming", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectiveTiming, setRepeat, setPeriod"} **/
						, observation.getObsrvtnFfctvTmngTmngRptPrdMx() /** { "tree" :"Observation.effectiveTiming", "datatype" : "Timing, Element, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectiveTiming, setRepeat, setPeriodMax"} **/
						, observation.getObsrvtnFfctvTmngTmngRptBndsDrtn() /** { "tree" :"Observation.effectiveTiming", "datatype" : "Timing, Element, Duration", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectiveTiming, setRepeat, setBoundsDuration"} **/
						, observation.getObsrvtnFfctvTmngTmngRptBndsPrd() /** { "tree" :"Observation.effectiveTiming", "datatype" : "Timing, Element, Period", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectiveTiming, setRepeat, setBoundsPeriod"} **/
						, observation.getObsrvtnFfctvTmngTmngRptCnt() /** { "tree" :"Observation.effectiveTiming", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectiveTiming, setRepeat, setCount"} **/
						, observation.getObsrvtnFfctvTmngTmngRptCntMx() /** { "tree" :"Observation.effectiveTiming", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectiveTiming, setRepeat, setCountMax"} **/
						, observation.getObsrvtnFfctvTmngTmngRptFrqncy() /** { "tree" :"Observation.effectiveTiming", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectiveTiming, setRepeat, setFrequency"} **/
						, observation.getObsrvtnFfctvTmngTmngRptFrqncMx() /** { "tree" :"Observation.effectiveTiming", "datatype" : "Timing, Element, positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectiveTiming, setRepeat, setFrequencyMax"} **/
						, observation.getObsrvtnFfctvTmngTmngRptBndsRnge() /** { "tree" :"Observation.effectiveTiming", "datatype" : "Timing, Element, Range", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectiveTiming, setRepeat, setBoundsRange"} **/
						, observation.getObsrvtnFfctvTmngTmngRptTmfDay() /** { "tree" :"Observation.effectiveTiming", "datatype" : "Timing, Element, time", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectiveTiming, setRepeat, addTimeOfDay"} **/
						, observation.getObsrvtnFfctvTmngTmngRptFfst() /** { "tree" :"Observation.effectiveTiming", "datatype" : "Timing, Element, unsignedInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectiveTiming, setRepeat, setOffset"} **/
						));
Observationobj.setEffectiveInstant(HapiFHIRHelpers.createinstant(observation.getObsrvtnFfctvnstntNstnt() /** { "tree" :"Observation.effectiveInstant", "datatype" : "instant", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectiveInstant"} **/
						));
Observationobj.setIssued(HapiFHIRHelpers.createinstant(observation.getObservationIssuedInstant() /** { "tree" :"Observation.issued", "datatype" : "instant", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIssued"} **/
						));
Observationobj.addPerformer(HapiFHIRHelpers.createReference(observation.getObservationPerformerReference() /** { "tree" :"Observation.performer", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPerformer"} **/
						));
Observationobj.setValueQuantity(HapiFHIRHelpers.createQuantity(observation.getObsrvtnVlQnttQnttCmprtr() /** { "tree" :"Observation.valueQuantity", "datatype" : "Quantity, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValueQuantity, setComparator"} **/
						, observation.getObsrvtnVlQnttQnttCde() /** { "tree" :"Observation.valueQuantity", "datatype" : "Quantity, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValueQuantity, setCode"} **/
						, observation.getObsrvtnVlQnttQnttVlue() /** { "tree" :"Observation.valueQuantity", "datatype" : "Quantity, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValueQuantity, setValue"} **/
						, observation.getObsrvtnVlQnttQnttNt() /** { "tree" :"Observation.valueQuantity", "datatype" : "Quantity, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValueQuantity, setUnit"} **/
						, observation.getObsrvtnVlQnttQnttSstm() /** { "tree" :"Observation.valueQuantity", "datatype" : "Quantity, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValueQuantity, setSystem"} **/
						));
Observationobj.setValueCodeableconcept(HapiFHIRHelpers.createCodeableConcept(observation.getObsrvtnVlCdblcncptCcCdngCSstm() /** { "tree" :"Observation.valueCodeableconcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValueCodeableconcept, addCoding, setSystem"} **/
						, observation.getObsrvtnVlCdblcncptCcCdngCVrsn() /** { "tree" :"Observation.valueCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValueCodeableconcept, addCoding, setVersion"} **/
						, observation.getObsrvtnVlCdblcncptCcCdngCCde() /** { "tree" :"Observation.valueCodeableconcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValueCodeableconcept, addCoding, setCode"} **/
						, observation.getObsrvtnVlCdblcncptCcCdngCDsplay() /** { "tree" :"Observation.valueCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValueCodeableconcept, addCoding, setDisplay"} **/
						, observation.getObsrvtnVlCdblcncptCcCdngCSrSlctd() /** { "tree" :"Observation.valueCodeableconcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValueCodeableconcept, addCoding, setUserSelected"} **/
						, observation.getObsrvtnVlCdblcncptCcTxt() /** { "tree" :"Observation.valueCodeableconcept", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValueCodeableconcept, setText"} **/
						));
Observationobj.setValueString(HapiFHIRHelpers.createstring(observation.getObservationValueStringString() /** { "tree" :"Observation.valueString", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValueString"} **/
						));
Observationobj.setValue(HapiFHIRHelpers.createbooleantype(observation.getObservationValueBooleanBoolean() /** { "tree" :"Observation.valueBoolean", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValueBoolean"} **/
						));
Observationobj.setValue(HapiFHIRHelpers.createintegertype(observation.getObservationValueIntegerInteger() /** { "tree" :"Observation.valueInteger", "datatype" : "integer", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValueInteger"} **/
						));
Observationobj.setValueRange(HapiFHIRHelpers.createRange(observation.getObservationValueRangeRangeLow() /** { "tree" :"Observation.valueRange", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValueRange, setLow"} **/
						, observation.getObservationValueRangeRangeHigh() /** { "tree" :"Observation.valueRange", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValueRange, setHigh"} **/
						));
Observationobj.setValueRatio(HapiFHIRHelpers.createRatio(observation.getObsrvtnVlRtRtNmrtrQnttVlue() /** { "tree" :"Observation.valueRatio", "datatype" : "Ratio, Quantity, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValueRatio, setNumerator, setValue"} **/
						, observation.getObsrvtnVlRtRtDnmntrQnttVlue() /** { "tree" :"Observation.valueRatio", "datatype" : "Ratio, Quantity, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValueRatio, setDenominator, setValue"} **/
						, observation.getObsrvtnVlRtRtNmrtrQnttCmprtr() /** { "tree" :"Observation.valueRatio", "datatype" : "Ratio, Quantity, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValueRatio, setNumerator, setComparator"} **/
						, observation.getObsrvtnVlRtRtDnmntrQnttCmprtr() /** { "tree" :"Observation.valueRatio", "datatype" : "Ratio, Quantity, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValueRatio, setDenominator, setComparator"} **/
						, observation.getObsrvtnVlRtRtNmrtrQnttNt() /** { "tree" :"Observation.valueRatio", "datatype" : "Ratio, Quantity, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValueRatio, setNumerator, setUnit"} **/
						, observation.getObsrvtnVlRtRtDnmntrQnttNt() /** { "tree" :"Observation.valueRatio", "datatype" : "Ratio, Quantity, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValueRatio, setDenominator, setUnit"} **/
						, observation.getObsrvtnVlRtRtNmrtrQnttSstm() /** { "tree" :"Observation.valueRatio", "datatype" : "Ratio, Quantity, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValueRatio, setNumerator, setSystem"} **/
						, observation.getObsrvtnVlRtRtDnmntrQnttSstm() /** { "tree" :"Observation.valueRatio", "datatype" : "Ratio, Quantity, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValueRatio, setDenominator, setSystem"} **/
						, observation.getObsrvtnVlRtRtNmrtrQnttCde() /** { "tree" :"Observation.valueRatio", "datatype" : "Ratio, Quantity, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValueRatio, setNumerator, setCode"} **/
						, observation.getObsrvtnVlRtRtDnmntrQnttCde() /** { "tree" :"Observation.valueRatio", "datatype" : "Ratio, Quantity, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValueRatio, setDenominator, setCode"} **/
						));
Observationobj.setValueSampleddata(HapiFHIRHelpers.createSampledData(observation.getObsrvtnVlSmplddtSmpldDtPrd() /** { "tree" :"Observation.valueSampleddata", "datatype" : "SampledData, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValueSampleddata, setPeriod"} **/
						, observation.getObsrvtnVlSmplddtSmpldDtFctr() /** { "tree" :"Observation.valueSampleddata", "datatype" : "SampledData, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValueSampleddata, setFactor"} **/
						, observation.getObsrvtnVlSmplddtSmpldDtLwrLmt() /** { "tree" :"Observation.valueSampleddata", "datatype" : "SampledData, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValueSampleddata, setLowerLimit"} **/
						, observation.getObsrvtnVlSmplddtSmpldDtPprLmt() /** { "tree" :"Observation.valueSampleddata", "datatype" : "SampledData, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValueSampleddata, setUpperLimit"} **/
						, observation.getObsrvtnVlSmplddtSmpldDtDmnsns() /** { "tree" :"Observation.valueSampleddata", "datatype" : "SampledData, positiveInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValueSampleddata, setDimensions"} **/
						, observation.getObsrvtnVlSmplddtSmpldDtRgn() /** { "tree" :"Observation.valueSampleddata", "datatype" : "SampledData, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValueSampleddata, setOrigin"} **/
						, observation.getObsrvtnVlSmplddtSmpldDtDta() /** { "tree" :"Observation.valueSampleddata", "datatype" : "SampledData, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValueSampleddata, setData"} **/
						));
Observationobj.setValueTime(HapiFHIRHelpers.createtime(observation.getObservationValueTimeTime() /** { "tree" :"Observation.valueTime", "datatype" : "time", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValueTime"} **/
						));
Observationobj.setValue(HapiFHIRHelpers.createdateTimetype(observation.getObservationValueDatetimeDateTime() /** { "tree" :"Observation.valueDatetime", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValueDatetime"} **/
						));
Observationobj.setValuePeriod(HapiFHIRHelpers.createPeriod(observation.getObsrvtnVlPrdPrdStrt() /** { "tree" :"Observation.valuePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValuePeriod, setStart"} **/
						, observation.getObservationValuePeriodPeriodEnd() /** { "tree" :"Observation.valuePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValuePeriod, setEnd"} **/
						));
Observationobj.setDataAbsentReason(HapiFHIRHelpers.createCodeableConcept(observation.getObsrvtnDtbsntRsnCcCdngCSstm() /** { "tree" :"Observation.dataAbsentReason", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDataAbsentReason, addCoding, setSystem"} **/
						, observation.getObsrvtnDtbsntRsnCcCdngCVrsn() /** { "tree" :"Observation.dataAbsentReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDataAbsentReason, addCoding, setVersion"} **/
						, observation.getObsrvtnDtbsntRsnCcCdngCCde() /** { "tree" :"Observation.dataAbsentReason", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDataAbsentReason, addCoding, setCode"} **/
						, observation.getObsrvtnDtbsntRsnCcCdngCDsplay() /** { "tree" :"Observation.dataAbsentReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDataAbsentReason, addCoding, setDisplay"} **/
						, observation.getObsrvtnDtbsntRsnCcCdngCSrSlctd() /** { "tree" :"Observation.dataAbsentReason", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDataAbsentReason, addCoding, setUserSelected"} **/
						, observation.getObsrvtnDtbsntRsnCcTxt() /** { "tree" :"Observation.dataAbsentReason", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDataAbsentReason, setText"} **/
						));
Observationobj.addInterpretation(HapiFHIRHelpers.createCodeableConcept(observation.getObsrvtnNtrprttnCcCdngCSstm() /** { "tree" :"Observation.interpretation", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addInterpretation, addCoding, setSystem"} **/
						, observation.getObsrvtnNtrprttnCcCdngCVrsn() /** { "tree" :"Observation.interpretation", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addInterpretation, addCoding, setVersion"} **/
						, observation.getObsrvtnNtrprttnCcCdngCCde() /** { "tree" :"Observation.interpretation", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addInterpretation, addCoding, setCode"} **/
						, observation.getObsrvtnNtrprttnCcCdngCDsplay() /** { "tree" :"Observation.interpretation", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addInterpretation, addCoding, setDisplay"} **/
						, observation.getObsrvtnNtrprttnCcCdngCSrSlctd() /** { "tree" :"Observation.interpretation", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addInterpretation, addCoding, setUserSelected"} **/
						, observation.getObservationInterpretationCcText() /** { "tree" :"Observation.interpretation", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addInterpretation, setText"} **/
						));
Observationobj.addNote(HapiFHIRHelpers.createAnnotation(observation.getObservationNoteAnnotationTime() /** { "tree" :"Observation.note", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setTime"} **/
						, observation.getObservationNoteAnnotationText() /** { "tree" :"Observation.note", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setText"} **/
						, observation.getObsrvtnNtNnttnThrRfrnce() /** { "tree" :"Observation.note", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorReference"} **/
						, observation.getObsrvtnNtNnttnThrStrng() /** { "tree" :"Observation.note", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorString"} **/
						));
Observationobj.setBodySite(HapiFHIRHelpers.createCodeableConcept(observation.getObsrvtnBdStCcCdngCSstm() /** { "tree" :"Observation.bodySite", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBodySite, addCoding, setSystem"} **/
						, observation.getObsrvtnBdStCcCdngCVrsn() /** { "tree" :"Observation.bodySite", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBodySite, addCoding, setVersion"} **/
						, observation.getObsrvtnBdStCcCdngCCde() /** { "tree" :"Observation.bodySite", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBodySite, addCoding, setCode"} **/
						, observation.getObsrvtnBdStCcCdngCDsplay() /** { "tree" :"Observation.bodySite", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBodySite, addCoding, setDisplay"} **/
						, observation.getObsrvtnBdStCcCdngCSrSlctd() /** { "tree" :"Observation.bodySite", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBodySite, addCoding, setUserSelected"} **/
						, observation.getObservationBodySiteCcText() /** { "tree" :"Observation.bodySite", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setBodySite, setText"} **/
						));
Observationobj.setMethod(HapiFHIRHelpers.createCodeableConcept(observation.getObsrvtnMthdCcCdngCSstm() /** { "tree" :"Observation.method", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMethod, addCoding, setSystem"} **/
						, observation.getObsrvtnMthdCcCdngCVrsn() /** { "tree" :"Observation.method", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMethod, addCoding, setVersion"} **/
						, observation.getObsrvtnMthdCcCdngCCde() /** { "tree" :"Observation.method", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMethod, addCoding, setCode"} **/
						, observation.getObsrvtnMthdCcCdngCDsplay() /** { "tree" :"Observation.method", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMethod, addCoding, setDisplay"} **/
						, observation.getObsrvtnMthdCcCdngCSrSlctd() /** { "tree" :"Observation.method", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMethod, addCoding, setUserSelected"} **/
						, observation.getObservationMethodCcText() /** { "tree" :"Observation.method", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMethod, setText"} **/
						));
Observationobj.setSpecimen(HapiFHIRHelpers.createReference(observation.getObservationSpecimenReference() /** { "tree" :"Observation.specimen", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSpecimen"} **/
						));
Observationobj.setDevice(HapiFHIRHelpers.createReference(observation.getObservationDeviceReference() /** { "tree" :"Observation.device", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDevice"} **/
						));
Observationobj.setLow(HapiFHIRHelpers.createSimpleQuantity(observation.getObsrvtnRfrncRngLwSmplQntty() /** { "tree" :"Observation.referenceRange.low", "datatype" : "SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addReferenceRange"] , "methodName" : "setLow"} **/
						));
Observationobj.setHigh(HapiFHIRHelpers.createSimpleQuantity(observation.getObsrvtnRfrncRngHghSmplQntty() /** { "tree" :"Observation.referenceRange.high", "datatype" : "SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addReferenceRange"] , "methodName" : "setHigh"} **/
						));
Observationobj.setType(HapiFHIRHelpers.createCodeableConcept(observation.getObsrvtnRfrncRngTpCcCdngCSstm() /** { "tree" :"Observation.referenceRange.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addReferenceRange"] , "methodName" : "setType, addCoding, setSystem"} **/
						, observation.getObsrvtnRfrncRngTpCcCdngCVrsn() /** { "tree" :"Observation.referenceRange.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addReferenceRange"] , "methodName" : "setType, addCoding, setVersion"} **/
						, observation.getObsrvtnRfrncRngTpCcCdngCCde() /** { "tree" :"Observation.referenceRange.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addReferenceRange"] , "methodName" : "setType, addCoding, setCode"} **/
						, observation.getObsrvtnRfrncRngTpCcCdngCDsplay() /** { "tree" :"Observation.referenceRange.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addReferenceRange"] , "methodName" : "setType, addCoding, setDisplay"} **/
						, observation.getObsrvtnRfrncRngTpCcCdngCSrSlctd() /** { "tree" :"Observation.referenceRange.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addReferenceRange"] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, observation.getObsrvtnRfrncRngTpCcTxt() /** { "tree" :"Observation.referenceRange.type", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addReferenceRange"] , "methodName" : "setType, setText"} **/
						));
Observationobj.addAppliesTo(HapiFHIRHelpers.createCodeableConcept(observation.getObsrvtnRfrncRngPplsTCcCdngCSstm() /** { "tree" :"Observation.referenceRange.appliesTo", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addReferenceRange"] , "methodName" : "addAppliesTo, addCoding, setSystem"} **/
						, observation.getObsrvtnRfrncRngPplsTCcCdngCVrsn() /** { "tree" :"Observation.referenceRange.appliesTo", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addReferenceRange"] , "methodName" : "addAppliesTo, addCoding, setVersion"} **/
						, observation.getObsrvtnRfrncRngPplsTCcCdngCCde() /** { "tree" :"Observation.referenceRange.appliesTo", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addReferenceRange"] , "methodName" : "addAppliesTo, addCoding, setCode"} **/
						, observation.getObsrvtnRfrncRngPplsTCcCdngCDsplay() /** { "tree" :"Observation.referenceRange.appliesTo", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addReferenceRange"] , "methodName" : "addAppliesTo, addCoding, setDisplay"} **/
						, observation.getObsrvtnRfrncRngPplsTCcCdngCSrSlctd() /** { "tree" :"Observation.referenceRange.appliesTo", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addReferenceRange"] , "methodName" : "addAppliesTo, addCoding, setUserSelected"} **/
						, observation.getObsrvtnRfrncRngPplsTCcTxt() /** { "tree" :"Observation.referenceRange.appliesTo", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addReferenceRange"] , "methodName" : "addAppliesTo, setText"} **/
						));
Observationobj.setAge(HapiFHIRHelpers.createRange(observation.getObsrvtnRfrncRngGRngLw() /** { "tree" :"Observation.referenceRange.age", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addReferenceRange"] , "methodName" : "setAge, setLow"} **/
						, observation.getObsrvtnRfrncRngGRngHgh() /** { "tree" :"Observation.referenceRange.age", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addReferenceRange"] , "methodName" : "setAge, setHigh"} **/
						));
Observationobj.setText(HapiFHIRHelpers.createstring(observation.getObsrvtnRfrncRngTxtStrng() /** { "tree" :"Observation.referenceRange.text", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addReferenceRange"] , "methodName" : "setText"} **/
						));
Observationobj.addHasMember(HapiFHIRHelpers.createReference(observation.getObservationHasMemberReference() /** { "tree" :"Observation.hasMember", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addHasMember"} **/
						));
Observationobj.addDerivedFrom(HapiFHIRHelpers.createReference(observation.getObservationDerivedFromReference() /** { "tree" :"Observation.derivedFrom", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDerivedFrom"} **/
						));
Observationobj.setCode(HapiFHIRHelpers.createCodeableConcept(observation.getObsrvtnCmpnntCdCcCdngCSstm() /** { "tree" :"Observation.component.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addComponent"] , "methodName" : "setCode, addCoding, setSystem"} **/
						, observation.getObsrvtnCmpnntCdCcCdngCVrsn() /** { "tree" :"Observation.component.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addComponent"] , "methodName" : "setCode, addCoding, setVersion"} **/
						, observation.getObsrvtnCmpnntCdCcCdngCCde() /** { "tree" :"Observation.component.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addComponent"] , "methodName" : "setCode, addCoding, setCode"} **/
						, observation.getObsrvtnCmpnntCdCcCdngCDsplay() /** { "tree" :"Observation.component.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addComponent"] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, observation.getObsrvtnCmpnntCdCcCdngCSrSlctd() /** { "tree" :"Observation.component.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addComponent"] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, observation.getObservationComponentCodeCcText() /** { "tree" :"Observation.component.code", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addComponent"] , "methodName" : "setCode, setText"} **/
						));
Observationobj.setValueQuantity(HapiFHIRHelpers.createQuantity(observation.getObsrvtnCmpnntVlQnttQnttCmprtr() /** { "tree" :"Observation.component.valueQuantity", "datatype" : "Quantity, code", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValueQuantity, setComparator"} **/
						, observation.getObsrvtnCmpnntVlQnttQnttCde() /** { "tree" :"Observation.component.valueQuantity", "datatype" : "Quantity, code", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValueQuantity, setCode"} **/
						, observation.getObsrvtnCmpnntVlQnttQnttVlue() /** { "tree" :"Observation.component.valueQuantity", "datatype" : "Quantity, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValueQuantity, setValue"} **/
						, observation.getObsrvtnCmpnntVlQnttQnttNt() /** { "tree" :"Observation.component.valueQuantity", "datatype" : "Quantity, string", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValueQuantity, setUnit"} **/
						, observation.getObsrvtnCmpnntVlQnttQnttSstm() /** { "tree" :"Observation.component.valueQuantity", "datatype" : "Quantity, uri", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValueQuantity, setSystem"} **/
						));
Observationobj.setValueCodeableconcept(HapiFHIRHelpers.createCodeableConcept(observation.getObsrvtnCmpnntVlCdblcncptCcCdngCSstm() /** { "tree" :"Observation.component.valueCodeableconcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValueCodeableconcept, addCoding, setSystem"} **/
						, observation.getObsrvtnCmpnntVlCdblcncptCcCdngCVrsn() /** { "tree" :"Observation.component.valueCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValueCodeableconcept, addCoding, setVersion"} **/
						, observation.getObsrvtnCmpnntVlCdblcncptCcCdngCCde() /** { "tree" :"Observation.component.valueCodeableconcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValueCodeableconcept, addCoding, setCode"} **/
						, observation.getObsrvtnCmpnntVlCdblcncptCcCdngCDsplay() /** { "tree" :"Observation.component.valueCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValueCodeableconcept, addCoding, setDisplay"} **/
						, observation.getObsrvtnCmpnntVlCdblcncptCcCdngCSrSlctd() /** { "tree" :"Observation.component.valueCodeableconcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValueCodeableconcept, addCoding, setUserSelected"} **/
						, observation.getObsrvtnCmpnntVlCdblcncptCcTxt() /** { "tree" :"Observation.component.valueCodeableconcept", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValueCodeableconcept, setText"} **/
						));
Observationobj.setValueString(HapiFHIRHelpers.createstring(observation.getObsrvtnCmpnntVlStrngStrng() /** { "tree" :"Observation.component.valueString", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValueString"} **/
						));
Observationobj.setValue(HapiFHIRHelpers.createbooleantype(observation.getObsrvtnCmpnntVlBlnBln() /** { "tree" :"Observation.component.valueBoolean", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValueBoolean"} **/
						));
Observationobj.setValue(HapiFHIRHelpers.createintegertype(observation.getObsrvtnCmpnntVlntgrNtgr() /** { "tree" :"Observation.component.valueInteger", "datatype" : "integer", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValueInteger"} **/
						));
Observationobj.setValueRange(HapiFHIRHelpers.createRange(observation.getObsrvtnCmpnntVlRngRngLw() /** { "tree" :"Observation.component.valueRange", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValueRange, setLow"} **/
						, observation.getObsrvtnCmpnntVlRngRngHgh() /** { "tree" :"Observation.component.valueRange", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValueRange, setHigh"} **/
						));
Observationobj.setValueRatio(HapiFHIRHelpers.createRatio(observation.getObsrvtnCmpnntVlRtRtNmrtrQnttVlue() /** { "tree" :"Observation.component.valueRatio", "datatype" : "Ratio, Quantity, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValueRatio, setNumerator, setValue"} **/
						, observation.getObsrvtnCmpnntVlRtRtDnmntrQnttVlue() /** { "tree" :"Observation.component.valueRatio", "datatype" : "Ratio, Quantity, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValueRatio, setDenominator, setValue"} **/
						, observation.getObsrvtnCmpnntVlRtRtNmrtrQnttCmprtr() /** { "tree" :"Observation.component.valueRatio", "datatype" : "Ratio, Quantity, code", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValueRatio, setNumerator, setComparator"} **/
						, observation.getObsrvtnCmpnntVlRtRtDnmntrQnttCmprtr() /** { "tree" :"Observation.component.valueRatio", "datatype" : "Ratio, Quantity, code", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValueRatio, setDenominator, setComparator"} **/
						, observation.getObsrvtnCmpnntVlRtRtNmrtrQnttNt() /** { "tree" :"Observation.component.valueRatio", "datatype" : "Ratio, Quantity, string", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValueRatio, setNumerator, setUnit"} **/
						, observation.getObsrvtnCmpnntVlRtRtDnmntrQnttNt() /** { "tree" :"Observation.component.valueRatio", "datatype" : "Ratio, Quantity, string", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValueRatio, setDenominator, setUnit"} **/
						, observation.getObsrvtnCmpnntVlRtRtNmrtrQnttSstm() /** { "tree" :"Observation.component.valueRatio", "datatype" : "Ratio, Quantity, uri", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValueRatio, setNumerator, setSystem"} **/
						, observation.getObsrvtnCmpnntVlRtRtDnmntrQnttSstm() /** { "tree" :"Observation.component.valueRatio", "datatype" : "Ratio, Quantity, uri", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValueRatio, setDenominator, setSystem"} **/
						, observation.getObsrvtnCmpnntVlRtRtNmrtrQnttCde() /** { "tree" :"Observation.component.valueRatio", "datatype" : "Ratio, Quantity, code", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValueRatio, setNumerator, setCode"} **/
						, observation.getObsrvtnCmpnntVlRtRtDnmntrQnttCde() /** { "tree" :"Observation.component.valueRatio", "datatype" : "Ratio, Quantity, code", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValueRatio, setDenominator, setCode"} **/
						));
Observationobj.setValueSampleddata(HapiFHIRHelpers.createSampledData(observation.getObsrvtnCmpnntVlSmplddtSmpldDtPrd() /** { "tree" :"Observation.component.valueSampleddata", "datatype" : "SampledData, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValueSampleddata, setPeriod"} **/
						, observation.getObsrvtnCmpnntVlSmplddtSmpldDtFctr() /** { "tree" :"Observation.component.valueSampleddata", "datatype" : "SampledData, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValueSampleddata, setFactor"} **/
						, observation.getObsrvtnCmpnntVlSmplddtSmpldDtLwrLmt() /** { "tree" :"Observation.component.valueSampleddata", "datatype" : "SampledData, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValueSampleddata, setLowerLimit"} **/
						, observation.getObsrvtnCmpnntVlSmplddtSmpldDtPprLmt() /** { "tree" :"Observation.component.valueSampleddata", "datatype" : "SampledData, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValueSampleddata, setUpperLimit"} **/
						, observation.getObsrvtnCmpnntVlSmplddtSmpldDtDmnsns() /** { "tree" :"Observation.component.valueSampleddata", "datatype" : "SampledData, positiveInt", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValueSampleddata, setDimensions"} **/
						, observation.getObsrvtnCmpnntVlSmplddtSmpldDtRgn() /** { "tree" :"Observation.component.valueSampleddata", "datatype" : "SampledData, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValueSampleddata, setOrigin"} **/
						, observation.getObsrvtnCmpnntVlSmplddtSmpldDtDta() /** { "tree" :"Observation.component.valueSampleddata", "datatype" : "SampledData, string", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValueSampleddata, setData"} **/
						));
Observationobj.setValueTime(HapiFHIRHelpers.createtime(observation.getObsrvtnCmpnntVlTmTme() /** { "tree" :"Observation.component.valueTime", "datatype" : "time", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValueTime"} **/
						));
Observationobj.setValue(HapiFHIRHelpers.createdateTimetype(observation.getObsrvtnCmpnntVlDttmDtTme() /** { "tree" :"Observation.component.valueDatetime", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValueDatetime"} **/
						));
Observationobj.setValuePeriod(HapiFHIRHelpers.createPeriod(observation.getObsrvtnCmpnntVlPrdPrdStrt() /** { "tree" :"Observation.component.valuePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValuePeriod, setStart"} **/
						, observation.getObsrvtnCmpnntVlPrdPrdNd() /** { "tree" :"Observation.component.valuePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setValuePeriod, setEnd"} **/
						));
Observationobj.setDataAbsentReason(HapiFHIRHelpers.createCodeableConcept(observation.getObsrvtnCmpnntDtbsntRsnCcCdngCSstm() /** { "tree" :"Observation.component.dataAbsentReason", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setDataAbsentReason, addCoding, setSystem"} **/
						, observation.getObsrvtnCmpnntDtbsntRsnCcCdngCVrsn() /** { "tree" :"Observation.component.dataAbsentReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setDataAbsentReason, addCoding, setVersion"} **/
						, observation.getObsrvtnCmpnntDtbsntRsnCcCdngCCde() /** { "tree" :"Observation.component.dataAbsentReason", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setDataAbsentReason, addCoding, setCode"} **/
						, observation.getObsrvtnCmpnntDtbsntRsnCcCdngCDsplay() /** { "tree" :"Observation.component.dataAbsentReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setDataAbsentReason, addCoding, setDisplay"} **/
						, observation.getObsrvtnCmpnntDtbsntRsnCcCdngCSrSlctd() /** { "tree" :"Observation.component.dataAbsentReason", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setDataAbsentReason, addCoding, setUserSelected"} **/
						, observation.getObsrvtnCmpnntDtbsntRsnCcTxt() /** { "tree" :"Observation.component.dataAbsentReason", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addComponent"] , "methodName" : "setDataAbsentReason, setText"} **/
						));
Observationobj.addInterpretation(HapiFHIRHelpers.createCodeableConcept(observation.getObsrvtnCmpnntNtrprttnCcCdngCSstm() /** { "tree" :"Observation.component.interpretation", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addComponent"] , "methodName" : "addInterpretation, addCoding, setSystem"} **/
						, observation.getObsrvtnCmpnntNtrprttnCcCdngCVrsn() /** { "tree" :"Observation.component.interpretation", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addComponent"] , "methodName" : "addInterpretation, addCoding, setVersion"} **/
						, observation.getObsrvtnCmpnntNtrprttnCcCdngCCde() /** { "tree" :"Observation.component.interpretation", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addComponent"] , "methodName" : "addInterpretation, addCoding, setCode"} **/
						, observation.getObsrvtnCmpnntNtrprttnCcCdngCDsplay() /** { "tree" :"Observation.component.interpretation", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addComponent"] , "methodName" : "addInterpretation, addCoding, setDisplay"} **/
						, observation.getObsrvtnCmpnntNtrprttnCcCdngCSrSlctd() /** { "tree" :"Observation.component.interpretation", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addComponent"] , "methodName" : "addInterpretation, addCoding, setUserSelected"} **/
						, observation.getObsrvtnCmpnntNtrprttnCcTxt() /** { "tree" :"Observation.component.interpretation", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addComponent"] , "methodName" : "addInterpretation, setText"} **/
						));
Observationobj.addReferenceRange(HapiFHIRHelpers.createreferenceRange(observation.getObsrvtnCmpnntRfrncRngRfrncRnge() /** { "tree" :"Observation.component.referenceRange", "datatype" : "referenceRange", "cardinality" : "Many", "elementtree" : ["addComponent"] , "methodName" : "addReferenceRange"} **/
		));
	}
}
