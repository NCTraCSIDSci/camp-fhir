package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Observationdefinition.
 * @see .Observationdefinition
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class ObservationdefinitionConversion 
{
	public Patient Observationdefinitions(main.templateoutput.Model.Observationdefinition observationdefinition) 
	{
			Patient  Observationdefinitionobj = new Patient(); 

						Observationdefinitionobj.addCategory(HapiFHIRHelpers.createCodeableConcept(observationdefinition.getObsrvtnDfntnCtgrCcCdngCSstm() /** { "tree" :"ObservationDefinition.category", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setSystem"} **/
						, observationdefinition.getObsrvtnDfntnCtgrCcCdngCVrsn() /** { "tree" :"ObservationDefinition.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setVersion"} **/
						, observationdefinition.getObsrvtnDfntnCtgrCcCdngCCde() /** { "tree" :"ObservationDefinition.category", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setCode"} **/
						, observationdefinition.getObsrvtnDfntnCtgrCcCdngCDsplay() /** { "tree" :"ObservationDefinition.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setDisplay"} **/
						, observationdefinition.getObsrvtnDfntnCtgrCcCdngCSrSlctd() /** { "tree" :"ObservationDefinition.category", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setUserSelected"} **/
						, observationdefinition.getObsrvtnDfntnCtgrCcTxt() /** { "tree" :"ObservationDefinition.category", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, setText"} **/
						));
Observationdefinitionobj.setCode(HapiFHIRHelpers.createCodeableConcept(observationdefinition.getObsrvtnDfntnCdCcCdngCSstm() /** { "tree" :"ObservationDefinition.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, addCoding, setSystem"} **/
						, observationdefinition.getObsrvtnDfntnCdCcCdngCVrsn() /** { "tree" :"ObservationDefinition.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, addCoding, setVersion"} **/
						, observationdefinition.getObsrvtnDfntnCdCcCdngCCde() /** { "tree" :"ObservationDefinition.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, addCoding, setCode"} **/
						, observationdefinition.getObsrvtnDfntnCdCcCdngCDsplay() /** { "tree" :"ObservationDefinition.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, observationdefinition.getObsrvtnDfntnCdCcCdngCSrSlctd() /** { "tree" :"ObservationDefinition.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, observationdefinition.getObservationDefinitionCodeCcText() /** { "tree" :"ObservationDefinition.code", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, setText"} **/
						));
Observationdefinitionobj.addIdentifier(HapiFHIRHelpers.createIdentifier(observationdefinition.getObsrvtnDfntnDntfrDntfrSe() /** { "tree" :"ObservationDefinition.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, observationdefinition.getObsrvtnDfntnDntfrDntfrTpCcCSstm() /** { "tree" :"ObservationDefinition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, observationdefinition.getObsrvtnDfntnDntfrDntfrTpCcCVrsn() /** { "tree" :"ObservationDefinition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, observationdefinition.getObsrvtnDfntnDntfrDntfrTpCcCCde() /** { "tree" :"ObservationDefinition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, observationdefinition.getObsrvtnDfntnDntfrDntfrTpCcCDsplay() /** { "tree" :"ObservationDefinition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, observationdefinition.getObsrvtnDfntnDntfrDntfrTpCcCSrSlctd() /** { "tree" :"ObservationDefinition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, observationdefinition.getObsrvtnDfntnDntfrDntfrTpCcTxt() /** { "tree" :"ObservationDefinition.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, observationdefinition.getObsrvtnDfntnDntfrDntfrPrdPrdStrt() /** { "tree" :"ObservationDefinition.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, observationdefinition.getObsrvtnDfntnDntfrDntfrPrdPrdNd() /** { "tree" :"ObservationDefinition.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, observationdefinition.getObsrvtnDfntnDntfrDntfrSsgnr() /** { "tree" :"ObservationDefinition.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, observationdefinition.getObsrvtnDfntnDntfrDntfrVlue() /** { "tree" :"ObservationDefinition.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, observationdefinition.getObsrvtnDfntnDntfrDntfrSstm() /** { "tree" :"ObservationDefinition.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Observationdefinitionobj.addPermittedDataType(HapiFHIRHelpers.createcode(observationdefinition.getObsrvtnDfntnPrmttdDtTpCde() /** { "tree" :"ObservationDefinition.permittedDataType", "datatype" : "code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPermittedDataType"} **/
						));
Observationdefinitionobj.setMultipleResultsAllowed(HapiFHIRHelpers.createboolean(observationdefinition.getObsrvtnDfntnMltplRsltsllwdBln() /** { "tree" :"ObservationDefinition.multipleResultsAllowed", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMultipleResultsAllowed"} **/
						));
Observationdefinitionobj.setMethod(HapiFHIRHelpers.createCodeableConcept(observationdefinition.getObsrvtnDfntnMthdCcCdngCSstm() /** { "tree" :"ObservationDefinition.method", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMethod, addCoding, setSystem"} **/
						, observationdefinition.getObsrvtnDfntnMthdCcCdngCVrsn() /** { "tree" :"ObservationDefinition.method", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMethod, addCoding, setVersion"} **/
						, observationdefinition.getObsrvtnDfntnMthdCcCdngCCde() /** { "tree" :"ObservationDefinition.method", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMethod, addCoding, setCode"} **/
						, observationdefinition.getObsrvtnDfntnMthdCcCdngCDsplay() /** { "tree" :"ObservationDefinition.method", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMethod, addCoding, setDisplay"} **/
						, observationdefinition.getObsrvtnDfntnMthdCcCdngCSrSlctd() /** { "tree" :"ObservationDefinition.method", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMethod, addCoding, setUserSelected"} **/
						, observationdefinition.getObsrvtnDfntnMthdCcTxt() /** { "tree" :"ObservationDefinition.method", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMethod, setText"} **/
						));
Observationdefinitionobj.setPreferredReportName(HapiFHIRHelpers.createstring(observationdefinition.getObsrvtnDfntnPrfrrdRprtNmStrng() /** { "tree" :"ObservationDefinition.preferredReportName", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPreferredReportName"} **/
						));
Observationdefinitionobj.setCustomaryUnit(HapiFHIRHelpers.createCodeableConcept(observationdefinition.getObsrvtnDfntnQntttvDtlsCstmrntCcCdngCSstm() /** { "tree" :"ObservationDefinition.quantitativeDetails.customaryUnit", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["setQuantitativeDetails"] , "methodName" : "setCustomaryUnit, addCoding, setSystem"} **/
						, observationdefinition.getObsrvtnDfntnQntttvDtlsCstmrntCcCdngCVrsn() /** { "tree" :"ObservationDefinition.quantitativeDetails.customaryUnit", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setQuantitativeDetails"] , "methodName" : "setCustomaryUnit, addCoding, setVersion"} **/
						, observationdefinition.getObsrvtnDfntnQntttvDtlsCstmrntCcCdngCCde() /** { "tree" :"ObservationDefinition.quantitativeDetails.customaryUnit", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["setQuantitativeDetails"] , "methodName" : "setCustomaryUnit, addCoding, setCode"} **/
						, observationdefinition.getObsrvtnDfntnQntttvDtlsCstmrntCcCdngCDsplay() /** { "tree" :"ObservationDefinition.quantitativeDetails.customaryUnit", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setQuantitativeDetails"] , "methodName" : "setCustomaryUnit, addCoding, setDisplay"} **/
						, observationdefinition.getObsrvtnDfntnQntttvDtlsCstmrntCcCdngCSrSlctd() /** { "tree" :"ObservationDefinition.quantitativeDetails.customaryUnit", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["setQuantitativeDetails"] , "methodName" : "setCustomaryUnit, addCoding, setUserSelected"} **/
						, observationdefinition.getObsrvtnDfntnQntttvDtlsCstmrntCcTxt() /** { "tree" :"ObservationDefinition.quantitativeDetails.customaryUnit", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["setQuantitativeDetails"] , "methodName" : "setCustomaryUnit, setText"} **/
						));
Observationdefinitionobj.setUnit(HapiFHIRHelpers.createCodeableConcept(observationdefinition.getObsrvtnDfntnQntttvDtlsNtCcCdngCSstm() /** { "tree" :"ObservationDefinition.quantitativeDetails.unit", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["setQuantitativeDetails"] , "methodName" : "setUnit, addCoding, setSystem"} **/
						, observationdefinition.getObsrvtnDfntnQntttvDtlsNtCcCdngCVrsn() /** { "tree" :"ObservationDefinition.quantitativeDetails.unit", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setQuantitativeDetails"] , "methodName" : "setUnit, addCoding, setVersion"} **/
						, observationdefinition.getObsrvtnDfntnQntttvDtlsNtCcCdngCCde() /** { "tree" :"ObservationDefinition.quantitativeDetails.unit", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["setQuantitativeDetails"] , "methodName" : "setUnit, addCoding, setCode"} **/
						, observationdefinition.getObsrvtnDfntnQntttvDtlsNtCcCdngCDsplay() /** { "tree" :"ObservationDefinition.quantitativeDetails.unit", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setQuantitativeDetails"] , "methodName" : "setUnit, addCoding, setDisplay"} **/
						, observationdefinition.getObsrvtnDfntnQntttvDtlsNtCcCdngCSrSlctd() /** { "tree" :"ObservationDefinition.quantitativeDetails.unit", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["setQuantitativeDetails"] , "methodName" : "setUnit, addCoding, setUserSelected"} **/
						, observationdefinition.getObsrvtnDfntnQntttvDtlsNtCcTxt() /** { "tree" :"ObservationDefinition.quantitativeDetails.unit", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["setQuantitativeDetails"] , "methodName" : "setUnit, setText"} **/
						));
Observationdefinitionobj.setConversionFactor(HapiFHIRHelpers.createdecimal(observationdefinition.getObsrvtnDfntnQntttvDtlsCnvrsnFctrDcml() /** { "tree" :"ObservationDefinition.quantitativeDetails.conversionFactor", "datatype" : "decimal", "cardinality" : "ZeroOne", "elementtree" : ["setQuantitativeDetails"] , "methodName" : "setConversionFactor"} **/
						));
Observationdefinitionobj.setDecimalPrecision(HapiFHIRHelpers.createinteger(observationdefinition.getObsrvtnDfntnQntttvDtlsDcmlPrcsnNtgr() /** { "tree" :"ObservationDefinition.quantitativeDetails.decimalPrecision", "datatype" : "integer", "cardinality" : "ZeroOne", "elementtree" : ["setQuantitativeDetails"] , "methodName" : "setDecimalPrecision"} **/
						));
Observationdefinitionobj.setCategory(HapiFHIRHelpers.createcode(observationdefinition.getObsrvtnDfntnQlfdntrvlCtgrCde() /** { "tree" :"ObservationDefinition.qualifiedInterval.category", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addQualifiedInterval"] , "methodName" : "setCategory"} **/
						));
Observationdefinitionobj.setRange(HapiFHIRHelpers.createRange(observationdefinition.getObsrvtnDfntnQlfdntrvlRngRngLw() /** { "tree" :"ObservationDefinition.qualifiedInterval.range", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addQualifiedInterval"] , "methodName" : "setRange, setLow"} **/
						, observationdefinition.getObsrvtnDfntnQlfdntrvlRngRngHgh() /** { "tree" :"ObservationDefinition.qualifiedInterval.range", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addQualifiedInterval"] , "methodName" : "setRange, setHigh"} **/
						));
Observationdefinitionobj.setContext(HapiFHIRHelpers.createCodeableConcept(observationdefinition.getObsrvtnDfntnQlfdntrvlCntxtCcCdngCSstm() /** { "tree" :"ObservationDefinition.qualifiedInterval.context", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addQualifiedInterval"] , "methodName" : "setContext, addCoding, setSystem"} **/
						, observationdefinition.getObsrvtnDfntnQlfdntrvlCntxtCcCdngCVrsn() /** { "tree" :"ObservationDefinition.qualifiedInterval.context", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addQualifiedInterval"] , "methodName" : "setContext, addCoding, setVersion"} **/
						, observationdefinition.getObsrvtnDfntnQlfdntrvlCntxtCcCdngCCde() /** { "tree" :"ObservationDefinition.qualifiedInterval.context", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addQualifiedInterval"] , "methodName" : "setContext, addCoding, setCode"} **/
						, observationdefinition.getObsrvtnDfntnQlfdntrvlCntxtCcCdngCDsplay() /** { "tree" :"ObservationDefinition.qualifiedInterval.context", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addQualifiedInterval"] , "methodName" : "setContext, addCoding, setDisplay"} **/
						, observationdefinition.getObsrvtnDfntnQlfdntrvlCntxtCcCdngCSrSlctd() /** { "tree" :"ObservationDefinition.qualifiedInterval.context", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addQualifiedInterval"] , "methodName" : "setContext, addCoding, setUserSelected"} **/
						, observationdefinition.getObsrvtnDfntnQlfdntrvlCntxtCcTxt() /** { "tree" :"ObservationDefinition.qualifiedInterval.context", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addQualifiedInterval"] , "methodName" : "setContext, setText"} **/
						));
Observationdefinitionobj.addAppliesTo(HapiFHIRHelpers.createCodeableConcept(observationdefinition.getObsrvtnDfntnQlfdntrvlPplsTCcCdngCSstm() /** { "tree" :"ObservationDefinition.qualifiedInterval.appliesTo", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addQualifiedInterval"] , "methodName" : "addAppliesTo, addCoding, setSystem"} **/
						, observationdefinition.getObsrvtnDfntnQlfdntrvlPplsTCcCdngCVrsn() /** { "tree" :"ObservationDefinition.qualifiedInterval.appliesTo", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addQualifiedInterval"] , "methodName" : "addAppliesTo, addCoding, setVersion"} **/
						, observationdefinition.getObsrvtnDfntnQlfdntrvlPplsTCcCdngCCde() /** { "tree" :"ObservationDefinition.qualifiedInterval.appliesTo", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addQualifiedInterval"] , "methodName" : "addAppliesTo, addCoding, setCode"} **/
						, observationdefinition.getObsrvtnDfntnQlfdntrvlPplsTCcCdngCDsplay() /** { "tree" :"ObservationDefinition.qualifiedInterval.appliesTo", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addQualifiedInterval"] , "methodName" : "addAppliesTo, addCoding, setDisplay"} **/
						, observationdefinition.getObsrvtnDfntnQlfdntrvlPplsTCcCdngCSrSlctd() /** { "tree" :"ObservationDefinition.qualifiedInterval.appliesTo", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addQualifiedInterval"] , "methodName" : "addAppliesTo, addCoding, setUserSelected"} **/
						, observationdefinition.getObsrvtnDfntnQlfdntrvlPplsTCcTxt() /** { "tree" :"ObservationDefinition.qualifiedInterval.appliesTo", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addQualifiedInterval"] , "methodName" : "addAppliesTo, setText"} **/
						));
Observationdefinitionobj.setGender(HapiFHIRHelpers.createcode(observationdefinition.getObsrvtnDfntnQlfdntrvlGndrCde() /** { "tree" :"ObservationDefinition.qualifiedInterval.gender", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addQualifiedInterval"] , "methodName" : "setGender"} **/
						));
Observationdefinitionobj.setAge(HapiFHIRHelpers.createRange(observationdefinition.getObsrvtnDfntnQlfdntrvlGRngLw() /** { "tree" :"ObservationDefinition.qualifiedInterval.age", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addQualifiedInterval"] , "methodName" : "setAge, setLow"} **/
						, observationdefinition.getObsrvtnDfntnQlfdntrvlGRngHgh() /** { "tree" :"ObservationDefinition.qualifiedInterval.age", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addQualifiedInterval"] , "methodName" : "setAge, setHigh"} **/
						));
Observationdefinitionobj.setGestationalAge(HapiFHIRHelpers.createRange(observationdefinition.getObsrvtnDfntnQlfdntrvlGsttnlgRngLw() /** { "tree" :"ObservationDefinition.qualifiedInterval.gestationalAge", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addQualifiedInterval"] , "methodName" : "setGestationalAge, setLow"} **/
						, observationdefinition.getObsrvtnDfntnQlfdntrvlGsttnlgRngHgh() /** { "tree" :"ObservationDefinition.qualifiedInterval.gestationalAge", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addQualifiedInterval"] , "methodName" : "setGestationalAge, setHigh"} **/
						));
Observationdefinitionobj.setCondition(HapiFHIRHelpers.createstring(observationdefinition.getObsrvtnDfntnQlfdntrvlCndtnStrng() /** { "tree" :"ObservationDefinition.qualifiedInterval.condition", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addQualifiedInterval"] , "methodName" : "setCondition"} **/
						));
Observationdefinitionobj.setValidCodedValueSet(HapiFHIRHelpers.createReference(observationdefinition.getObsrvtnDfntnVldCddVlStRfrnce() /** { "tree" :"ObservationDefinition.validCodedValueSet", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setValidCodedValueSet"} **/
						));
Observationdefinitionobj.setNormalCodedValueSet(HapiFHIRHelpers.createReference(observationdefinition.getObsrvtnDfntnNrmlCddVlStRfrnce() /** { "tree" :"ObservationDefinition.normalCodedValueSet", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setNormalCodedValueSet"} **/
						));
Observationdefinitionobj.setAbnormalCodedValueSet(HapiFHIRHelpers.createReference(observationdefinition.getObsrvtnDfntnBnrmlCddVlStRfrnce() /** { "tree" :"ObservationDefinition.abnormalCodedValueSet", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAbnormalCodedValueSet"} **/
						));
Observationdefinitionobj.setCriticalCodedValueSet(HapiFHIRHelpers.createReference(observationdefinition.getObsrvtnDfntnCrtclCddVlStRfrnce() /** { "tree" :"ObservationDefinition.criticalCodedValueSet", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCriticalCodedValueSet"} **/
		));
	}
}
