package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Guidanceresponse.
 * @see .Guidanceresponse
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class GuidanceresponseConversion 
{
	public Patient Guidanceresponses(main.templateoutput.Model.Guidanceresponse guidanceresponse) 
	{
			Patient  Guidanceresponseobj = new Patient(); 

						Guidanceresponseobj.setRequestIdentifier(HapiFHIRHelpers.createIdentifier(guidanceresponse.getGdncRspnsRqstdntfrDntfrSe() /** { "tree" :"GuidanceResponse.requestIdentifier", "datatype" : "Identifier, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequestIdentifier, setUse"} **/
						, guidanceresponse.getGdncRspnsRqstdntfrDntfrTpCcCSstm() /** { "tree" :"GuidanceResponse.requestIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequestIdentifier, setType, addCoding, setSystem"} **/
						, guidanceresponse.getGdncRspnsRqstdntfrDntfrTpCcCVrsn() /** { "tree" :"GuidanceResponse.requestIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequestIdentifier, setType, addCoding, setVersion"} **/
						, guidanceresponse.getGdncRspnsRqstdntfrDntfrTpCcCCde() /** { "tree" :"GuidanceResponse.requestIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequestIdentifier, setType, addCoding, setCode"} **/
						, guidanceresponse.getGdncRspnsRqstdntfrDntfrTpCcCDsplay() /** { "tree" :"GuidanceResponse.requestIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequestIdentifier, setType, addCoding, setDisplay"} **/
						, guidanceresponse.getGdncRspnsRqstdntfrDntfrTpCcCSrSlctd() /** { "tree" :"GuidanceResponse.requestIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequestIdentifier, setType, addCoding, setUserSelected"} **/
						, guidanceresponse.getGdncRspnsRqstdntfrDntfrTpCcTxt() /** { "tree" :"GuidanceResponse.requestIdentifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequestIdentifier, setType, setText"} **/
						, guidanceresponse.getGdncRspnsRqstdntfrDntfrPrdPrdStrt() /** { "tree" :"GuidanceResponse.requestIdentifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequestIdentifier, setPeriod, setStart"} **/
						, guidanceresponse.getGdncRspnsRqstdntfrDntfrPrdPrdNd() /** { "tree" :"GuidanceResponse.requestIdentifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequestIdentifier, setPeriod, setEnd"} **/
						, guidanceresponse.getGdncRspnsRqstdntfrDntfrSsgnr() /** { "tree" :"GuidanceResponse.requestIdentifier", "datatype" : "Identifier, Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequestIdentifier, setAssigner"} **/
						, guidanceresponse.getGdncRspnsRqstdntfrDntfrVlue() /** { "tree" :"GuidanceResponse.requestIdentifier", "datatype" : "Identifier, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequestIdentifier, setValue"} **/
						, guidanceresponse.getGdncRspnsRqstdntfrDntfrSstm() /** { "tree" :"GuidanceResponse.requestIdentifier", "datatype" : "Identifier, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequestIdentifier, setSystem"} **/
						));
Guidanceresponseobj.addIdentifier(HapiFHIRHelpers.createIdentifier(guidanceresponse.getGdncRspnsDntfrDntfrSe() /** { "tree" :"GuidanceResponse.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, guidanceresponse.getGdncRspnsDntfrDntfrTpCcCSstm() /** { "tree" :"GuidanceResponse.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, guidanceresponse.getGdncRspnsDntfrDntfrTpCcCVrsn() /** { "tree" :"GuidanceResponse.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, guidanceresponse.getGdncRspnsDntfrDntfrTpCcCCde() /** { "tree" :"GuidanceResponse.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, guidanceresponse.getGdncRspnsDntfrDntfrTpCcCDsplay() /** { "tree" :"GuidanceResponse.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, guidanceresponse.getGdncRspnsDntfrDntfrTpCcCSrSlctd() /** { "tree" :"GuidanceResponse.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, guidanceresponse.getGdncRspnsDntfrDntfrTpCcTxt() /** { "tree" :"GuidanceResponse.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, guidanceresponse.getGdncRspnsDntfrDntfrPrdPrdStrt() /** { "tree" :"GuidanceResponse.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, guidanceresponse.getGdncRspnsDntfrDntfrPrdPrdNd() /** { "tree" :"GuidanceResponse.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, guidanceresponse.getGdncRspnsDntfrDntfrSsgnr() /** { "tree" :"GuidanceResponse.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, guidanceresponse.getGdncRspnsDntfrDntfrVlue() /** { "tree" :"GuidanceResponse.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, guidanceresponse.getGdncRspnsDntfrDntfrSstm() /** { "tree" :"GuidanceResponse.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Guidanceresponseobj.setModuleUri(HapiFHIRHelpers.createuri(guidanceresponse.getGuidanceResponseModuleUriUri() /** { "tree" :"GuidanceResponse.moduleUri", "datatype" : "uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setModuleUri"} **/
						));
Guidanceresponseobj.setModuleCanonical()(HapiFHIRHelpers.createcanonical(guidanceresponse.getGdncRspnsMdlCnnclCnncl() /** { "tree" :"GuidanceResponse.moduleCanonical", "datatype" : "canonical", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setModuleCanonical()"} **/
						));
Guidanceresponseobj.setModuleCodeableconcept(HapiFHIRHelpers.createCodeableConcept(guidanceresponse.getGdncRspnsMdlCdblcncptCcCdngCSstm() /** { "tree" :"GuidanceResponse.moduleCodeableconcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setModuleCodeableconcept, addCoding, setSystem"} **/
						, guidanceresponse.getGdncRspnsMdlCdblcncptCcCdngCVrsn() /** { "tree" :"GuidanceResponse.moduleCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setModuleCodeableconcept, addCoding, setVersion"} **/
						, guidanceresponse.getGdncRspnsMdlCdblcncptCcCdngCCde() /** { "tree" :"GuidanceResponse.moduleCodeableconcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setModuleCodeableconcept, addCoding, setCode"} **/
						, guidanceresponse.getGdncRspnsMdlCdblcncptCcCdngCDsplay() /** { "tree" :"GuidanceResponse.moduleCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setModuleCodeableconcept, addCoding, setDisplay"} **/
						, guidanceresponse.getGdncRspnsMdlCdblcncptCcCdngCSrSlctd() /** { "tree" :"GuidanceResponse.moduleCodeableconcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setModuleCodeableconcept, addCoding, setUserSelected"} **/
						, guidanceresponse.getGdncRspnsMdlCdblcncptCcTxt() /** { "tree" :"GuidanceResponse.moduleCodeableconcept", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setModuleCodeableconcept, setText"} **/
						));
Guidanceresponseobj.setStatus(HapiFHIRHelpers.createcode(guidanceresponse.getGuidanceResponseStatusCode() /** { "tree" :"GuidanceResponse.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Guidanceresponseobj.setSubject(HapiFHIRHelpers.createReference(guidanceresponse.getGuidanceResponseSubjectReference() /** { "tree" :"GuidanceResponse.subject", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubject"} **/
						));
Guidanceresponseobj.setEncounter(HapiFHIRHelpers.createReference(guidanceresponse.getGdncRspnsNcntrRfrnce() /** { "tree" :"GuidanceResponse.encounter", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEncounter"} **/
						));
Guidanceresponseobj.setOccurrenceDateTime(HapiFHIRHelpers.createdateTime(guidanceresponse.getGdncRspnsCcrrncDtTmDtTme() /** { "tree" :"GuidanceResponse.occurrenceDateTime", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOccurrenceDateTime"} **/
						));
Guidanceresponseobj.setPerformer(HapiFHIRHelpers.createReference(guidanceresponse.getGdncRspnsPrfrmrRfrnce() /** { "tree" :"GuidanceResponse.performer", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPerformer"} **/
						));
Guidanceresponseobj.addReasonCode(HapiFHIRHelpers.createCodeableConcept(guidanceresponse.getGdncRspnsRsnCdCcCdngCSstm() /** { "tree" :"GuidanceResponse.reasonCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setSystem"} **/
						, guidanceresponse.getGdncRspnsRsnCdCcCdngCVrsn() /** { "tree" :"GuidanceResponse.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setVersion"} **/
						, guidanceresponse.getGdncRspnsRsnCdCcCdngCCde() /** { "tree" :"GuidanceResponse.reasonCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setCode"} **/
						, guidanceresponse.getGdncRspnsRsnCdCcCdngCDsplay() /** { "tree" :"GuidanceResponse.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setDisplay"} **/
						, guidanceresponse.getGdncRspnsRsnCdCcCdngCSrSlctd() /** { "tree" :"GuidanceResponse.reasonCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setUserSelected"} **/
						, guidanceresponse.getGdncRspnsRsnCdCcTxt() /** { "tree" :"GuidanceResponse.reasonCode", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, setText"} **/
						));
Guidanceresponseobj.addReasonReference(HapiFHIRHelpers.createReference(guidanceresponse.getGdncRspnsRsnRfrncRfrnce() /** { "tree" :"GuidanceResponse.reasonReference", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonReference"} **/
						));
Guidanceresponseobj.addNote(HapiFHIRHelpers.createAnnotation(guidanceresponse.getGdncRspnsNtNnttnTme() /** { "tree" :"GuidanceResponse.note", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setTime"} **/
						, guidanceresponse.getGdncRspnsNtNnttnTxt() /** { "tree" :"GuidanceResponse.note", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setText"} **/
						, guidanceresponse.getGdncRspnsNtNnttnThrRfrnce() /** { "tree" :"GuidanceResponse.note", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorReference"} **/
						, guidanceresponse.getGdncRspnsNtNnttnThrStrng() /** { "tree" :"GuidanceResponse.note", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorString"} **/
						));
Guidanceresponseobj.addEvaluationMessage(HapiFHIRHelpers.createReference(guidanceresponse.getGdncRspnsVltnMssgRfrnce() /** { "tree" :"GuidanceResponse.evaluationMessage", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEvaluationMessage"} **/
						));
Guidanceresponseobj.setOutputParameters(HapiFHIRHelpers.createReference(guidanceresponse.getGdncRspnsTptPrmtrsRfrnce() /** { "tree" :"GuidanceResponse.outputParameters", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOutputParameters"} **/
						));
Guidanceresponseobj.setResult(HapiFHIRHelpers.createReference(guidanceresponse.getGuidanceResponseResultReference() /** { "tree" :"GuidanceResponse.result", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setResult"} **/
						));
Guidanceresponseobj.addDataRequirement(HapiFHIRHelpers.createDataRequirement(guidanceresponse.getGdncRspnsDtRqrmntDtRqrmntPrfle() /** { "tree" :"GuidanceResponse.dataRequirement", "datatype" : "DataRequirement, canonical", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, addProfile"} **/
						, guidanceresponse.getGdncRspnsDtRqrmntDtRqrmntTpe() /** { "tree" :"GuidanceResponse.dataRequirement", "datatype" : "DataRequirement, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, setType"} **/
						, guidanceresponse.getGdncRspnsDtRqrmntDtRqrmntSbjctCcCcCSstm() /** { "tree" :"GuidanceResponse.dataRequirement", "datatype" : "DataRequirement, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, setSubjectCodeableConcept, addCoding, setSystem"} **/
						, guidanceresponse.getGdncRspnsDtRqrmntDtRqrmntSbjctCcCcCVrsn() /** { "tree" :"GuidanceResponse.dataRequirement", "datatype" : "DataRequirement, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, setSubjectCodeableConcept, addCoding, setVersion"} **/
						, guidanceresponse.getGdncRspnsDtRqrmntDtRqrmntSbjctCcCcCCde() /** { "tree" :"GuidanceResponse.dataRequirement", "datatype" : "DataRequirement, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, setSubjectCodeableConcept, addCoding, setCode"} **/
						, guidanceresponse.getGdncRspnsDtRqrmntDtRqrmntSbjctCcCcCDsplay() /** { "tree" :"GuidanceResponse.dataRequirement", "datatype" : "DataRequirement, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, setSubjectCodeableConcept, addCoding, setDisplay"} **/
						, guidanceresponse.getGdncRspnsDtRqrmntDtRqrmntSbjctCcCcCSrSlctd() /** { "tree" :"GuidanceResponse.dataRequirement", "datatype" : "DataRequirement, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, setSubjectCodeableConcept, addCoding, setUserSelected"} **/
						, guidanceresponse.getGdncRspnsDtRqrmntDtRqrmntSbjctCcCcTxt() /** { "tree" :"GuidanceResponse.dataRequirement", "datatype" : "DataRequirement, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, setSubjectCodeableConcept, setText"} **/
						, guidanceresponse.getGdncRspnsDtRqrmntDtRqrmntCdFltrVlSt() /** { "tree" :"GuidanceResponse.dataRequirement", "datatype" : "DataRequirement, Element, canonical", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, addCodeFilter, setValueSet"} **/
						, guidanceresponse.getGdncRspnsDtRqrmntDtRqrmntSrtDrctn() /** { "tree" :"GuidanceResponse.dataRequirement", "datatype" : "DataRequirement, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, addSort, setDirection"} **/
						, guidanceresponse.getGdncRspnsDtRqrmntDtRqrmntCdFltrCde() /** { "tree" :"GuidanceResponse.dataRequirement", "datatype" : "DataRequirement, Element, Coding", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, addCodeFilter, addCode"} **/
						, guidanceresponse.getGdncRspnsDtRqrmntDtRqrmntDtFltrVlDtTme() /** { "tree" :"GuidanceResponse.dataRequirement", "datatype" : "DataRequirement, Element, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, addDateFilter, setValueDateTime"} **/
						, guidanceresponse.getGdncRspnsDtRqrmntDtRqrmntDtFltrVlDrtn() /** { "tree" :"GuidanceResponse.dataRequirement", "datatype" : "DataRequirement, Element, Duration", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, addDateFilter, setValueDuration"} **/
						, guidanceresponse.getGdncRspnsDtRqrmntDtRqrmntDtFltrVlPrd() /** { "tree" :"GuidanceResponse.dataRequirement", "datatype" : "DataRequirement, Element, Period", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, addDateFilter, setValuePeriod"} **/
						, guidanceresponse.getGdncRspnsDtRqrmntDtRqrmntCdFltrPth() /** { "tree" :"GuidanceResponse.dataRequirement", "datatype" : "DataRequirement, Element, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, addCodeFilter, setPath"} **/
						, guidanceresponse.getGdncRspnsDtRqrmntDtRqrmntCdFltrSrchPrm() /** { "tree" :"GuidanceResponse.dataRequirement", "datatype" : "DataRequirement, Element, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, addCodeFilter, setSearchParam"} **/
						, guidanceresponse.getGdncRspnsDtRqrmntDtRqrmntDtFltrPth() /** { "tree" :"GuidanceResponse.dataRequirement", "datatype" : "DataRequirement, Element, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, addDateFilter, setPath"} **/
						, guidanceresponse.getGdncRspnsDtRqrmntDtRqrmntDtFltrSrchPrm() /** { "tree" :"GuidanceResponse.dataRequirement", "datatype" : "DataRequirement, Element, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, addDateFilter, setSearchParam"} **/
						, guidanceresponse.getGdncRspnsDtRqrmntDtRqrmntSrtPth() /** { "tree" :"GuidanceResponse.dataRequirement", "datatype" : "DataRequirement, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, addSort, setPath"} **/
						, guidanceresponse.getGdncRspnsDtRqrmntDtRqrmntLmt() /** { "tree" :"GuidanceResponse.dataRequirement", "datatype" : "DataRequirement, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, setLimit"} **/
						, guidanceresponse.getGdncRspnsDtRqrmntDtRqrmntSbjctRfrnce() /** { "tree" :"GuidanceResponse.dataRequirement", "datatype" : "DataRequirement, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, setSubjectReference"} **/
						, guidanceresponse.getGdncRspnsDtRqrmntDtRqrmntMstSpprt() /** { "tree" :"GuidanceResponse.dataRequirement", "datatype" : "DataRequirement, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDataRequirement, addMustSupport"} **/
		));
	}
}
