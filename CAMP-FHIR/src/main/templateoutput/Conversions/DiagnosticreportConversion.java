package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Diagnosticreport.
 * @see .Diagnosticreport
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class DiagnosticreportConversion 
{
	public Patient Diagnosticreports(main.templateoutput.Model.Diagnosticreport diagnosticreport) 
	{
			Patient  Diagnosticreportobj = new Patient(); 

						Diagnosticreportobj.addIdentifier(HapiFHIRHelpers.createIdentifier(diagnosticreport.getDgnstcRprtDntfrDntfrSe() /** { "tree" :"DiagnosticReport.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, diagnosticreport.getDgnstcRprtDntfrDntfrTpCcCSstm() /** { "tree" :"DiagnosticReport.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, diagnosticreport.getDgnstcRprtDntfrDntfrTpCcCVrsn() /** { "tree" :"DiagnosticReport.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, diagnosticreport.getDgnstcRprtDntfrDntfrTpCcCCde() /** { "tree" :"DiagnosticReport.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, diagnosticreport.getDgnstcRprtDntfrDntfrTpCcCDsplay() /** { "tree" :"DiagnosticReport.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, diagnosticreport.getDgnstcRprtDntfrDntfrTpCcCSrSlctd() /** { "tree" :"DiagnosticReport.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, diagnosticreport.getDgnstcRprtDntfrDntfrTpCcTxt() /** { "tree" :"DiagnosticReport.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, diagnosticreport.getDgnstcRprtDntfrDntfrPrdPrdStrt() /** { "tree" :"DiagnosticReport.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, diagnosticreport.getDgnstcRprtDntfrDntfrPrdPrdNd() /** { "tree" :"DiagnosticReport.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, diagnosticreport.getDgnstcRprtDntfrDntfrSsgnr() /** { "tree" :"DiagnosticReport.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, diagnosticreport.getDgnstcRprtDntfrDntfrVlue() /** { "tree" :"DiagnosticReport.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, diagnosticreport.getDgnstcRprtDntfrDntfrSstm() /** { "tree" :"DiagnosticReport.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Diagnosticreportobj.addBasedOn(HapiFHIRHelpers.createReference(diagnosticreport.getDiagnosticReportBasedOnReference() /** { "tree" :"DiagnosticReport.basedOn", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBasedOn"} **/
						));
Diagnosticreportobj.setStatus(HapiFHIRHelpers.createcode(diagnosticreport.getDiagnosticReportStatusCode() /** { "tree" :"DiagnosticReport.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Diagnosticreportobj.addCategory(HapiFHIRHelpers.createCodeableConcept(diagnosticreport.getDgnstcRprtCtgrCcCdngCSstm() /** { "tree" :"DiagnosticReport.category", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setSystem"} **/
						, diagnosticreport.getDgnstcRprtCtgrCcCdngCVrsn() /** { "tree" :"DiagnosticReport.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setVersion"} **/
						, diagnosticreport.getDgnstcRprtCtgrCcCdngCCde() /** { "tree" :"DiagnosticReport.category", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setCode"} **/
						, diagnosticreport.getDgnstcRprtCtgrCcCdngCDsplay() /** { "tree" :"DiagnosticReport.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setDisplay"} **/
						, diagnosticreport.getDgnstcRprtCtgrCcCdngCSrSlctd() /** { "tree" :"DiagnosticReport.category", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setUserSelected"} **/
						, diagnosticreport.getDiagnosticReportCategoryCcText() /** { "tree" :"DiagnosticReport.category", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, setText"} **/
						));
Diagnosticreportobj.setCode(HapiFHIRHelpers.createCodeableConcept(diagnosticreport.getDgnstcRprtCdCcCdngCSstm() /** { "tree" :"DiagnosticReport.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, addCoding, setSystem"} **/
						, diagnosticreport.getDgnstcRprtCdCcCdngCVrsn() /** { "tree" :"DiagnosticReport.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, addCoding, setVersion"} **/
						, diagnosticreport.getDgnstcRprtCdCcCdngCCde() /** { "tree" :"DiagnosticReport.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, addCoding, setCode"} **/
						, diagnosticreport.getDgnstcRprtCdCcCdngCDsplay() /** { "tree" :"DiagnosticReport.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, diagnosticreport.getDgnstcRprtCdCcCdngCSrSlctd() /** { "tree" :"DiagnosticReport.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, diagnosticreport.getDiagnosticReportCodeCcText() /** { "tree" :"DiagnosticReport.code", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, setText"} **/
						));
Diagnosticreportobj.setSubject(HapiFHIRHelpers.createReference(diagnosticreport.getDiagnosticReportSubjectReference() /** { "tree" :"DiagnosticReport.subject", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubject"} **/
						));
Diagnosticreportobj.setEncounter(HapiFHIRHelpers.createReference(diagnosticreport.getDgnstcRprtNcntrRfrnce() /** { "tree" :"DiagnosticReport.encounter", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEncounter"} **/
						));
Diagnosticreportobj.setEffective(HapiFHIRHelpers.createdateTimetype(diagnosticreport.getDgnstcRprtFfctvDttmDtTme() /** { "tree" :"DiagnosticReport.effectiveDatetime", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectiveDatetime"} **/
						));
Diagnosticreportobj.setEffectivePeriod(HapiFHIRHelpers.createPeriod(diagnosticreport.getDgnstcRprtFfctvPrdPrdStrt() /** { "tree" :"DiagnosticReport.effectivePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectivePeriod, setStart"} **/
						, diagnosticreport.getDgnstcRprtFfctvPrdPrdNd() /** { "tree" :"DiagnosticReport.effectivePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectivePeriod, setEnd"} **/
						));
Diagnosticreportobj.setIssued(HapiFHIRHelpers.createinstant(diagnosticreport.getDiagnosticReportIssuedInstant() /** { "tree" :"DiagnosticReport.issued", "datatype" : "instant", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIssued"} **/
						));
Diagnosticreportobj.addPerformer(HapiFHIRHelpers.createReference(diagnosticreport.getDgnstcRprtPrfrmrRfrnce() /** { "tree" :"DiagnosticReport.performer", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPerformer"} **/
						));
Diagnosticreportobj.addResultsInterpreter(HapiFHIRHelpers.createReference(diagnosticreport.getDgnstcRprtRsltsntrprtrRfrnce() /** { "tree" :"DiagnosticReport.resultsInterpreter", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addResultsInterpreter"} **/
						));
Diagnosticreportobj.addSpecimen(HapiFHIRHelpers.createReference(diagnosticreport.getDgnstcRprtSpcmnRfrnce() /** { "tree" :"DiagnosticReport.specimen", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSpecimen"} **/
						));
Diagnosticreportobj.addResult(HapiFHIRHelpers.createReference(diagnosticreport.getDiagnosticReportResultReference() /** { "tree" :"DiagnosticReport.result", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addResult"} **/
						));
Diagnosticreportobj.addImagingStudy(HapiFHIRHelpers.createReference(diagnosticreport.getDgnstcRprtMgngStdRfrnce() /** { "tree" :"DiagnosticReport.imagingStudy", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addImagingStudy"} **/
						));
Diagnosticreportobj.setComment(HapiFHIRHelpers.createstring(diagnosticreport.getDgnstcRprtMdCmmntStrng() /** { "tree" :"DiagnosticReport.media.comment", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addMedia"] , "methodName" : "setComment"} **/
						));
Diagnosticreportobj.setLink(HapiFHIRHelpers.createReference(diagnosticreport.getDgnstcRprtMdLnkRfrnce() /** { "tree" :"DiagnosticReport.media.link", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addMedia"] , "methodName" : "setLink"} **/
						));
Diagnosticreportobj.setConclusion(HapiFHIRHelpers.createstring(diagnosticreport.getDiagnosticReportConclusionString() /** { "tree" :"DiagnosticReport.conclusion", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setConclusion"} **/
						));
Diagnosticreportobj.addConclusionCode(HapiFHIRHelpers.createCodeableConcept(diagnosticreport.getDgnstcRprtCnclsnCdCcCdngCSstm() /** { "tree" :"DiagnosticReport.conclusionCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addConclusionCode, addCoding, setSystem"} **/
						, diagnosticreport.getDgnstcRprtCnclsnCdCcCdngCVrsn() /** { "tree" :"DiagnosticReport.conclusionCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addConclusionCode, addCoding, setVersion"} **/
						, diagnosticreport.getDgnstcRprtCnclsnCdCcCdngCCde() /** { "tree" :"DiagnosticReport.conclusionCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addConclusionCode, addCoding, setCode"} **/
						, diagnosticreport.getDgnstcRprtCnclsnCdCcCdngCDsplay() /** { "tree" :"DiagnosticReport.conclusionCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addConclusionCode, addCoding, setDisplay"} **/
						, diagnosticreport.getDgnstcRprtCnclsnCdCcCdngCSrSlctd() /** { "tree" :"DiagnosticReport.conclusionCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addConclusionCode, addCoding, setUserSelected"} **/
						, diagnosticreport.getDgnstcRprtCnclsnCdCcTxt() /** { "tree" :"DiagnosticReport.conclusionCode", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addConclusionCode, setText"} **/
						));
Diagnosticreportobj.addPresentedForm(HapiFHIRHelpers.createAttachment(diagnosticreport.getDgnstcRprtPrsntdFrmTtchmntDta() /** { "tree" :"DiagnosticReport.presentedForm", "datatype" : "Attachment, base64Binary", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPresentedForm, setData"} **/
						, diagnosticreport.getDgnstcRprtPrsntdFrmTtchmntHsh() /** { "tree" :"DiagnosticReport.presentedForm", "datatype" : "Attachment, base64Binary", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPresentedForm, setHash"} **/
						, diagnosticreport.getDgnstcRprtPrsntdFrmTtchmntCntntTpe() /** { "tree" :"DiagnosticReport.presentedForm", "datatype" : "Attachment, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPresentedForm, setContentType"} **/
						, diagnosticreport.getDgnstcRprtPrsntdFrmTtchmntLngge() /** { "tree" :"DiagnosticReport.presentedForm", "datatype" : "Attachment, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPresentedForm, setLanguage"} **/
						, diagnosticreport.getDgnstcRprtPrsntdFrmTtchmntCrtn() /** { "tree" :"DiagnosticReport.presentedForm", "datatype" : "Attachment, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPresentedForm, setCreation"} **/
						, diagnosticreport.getDgnstcRprtPrsntdFrmTtchmntTtle() /** { "tree" :"DiagnosticReport.presentedForm", "datatype" : "Attachment, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPresentedForm, setTitle"} **/
						, diagnosticreport.getDgnstcRprtPrsntdFrmTtchmntSze() /** { "tree" :"DiagnosticReport.presentedForm", "datatype" : "Attachment, unsignedInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPresentedForm, setSize"} **/
						, diagnosticreport.getDgnstcRprtPrsntdFrmTtchmntRl() /** { "tree" :"DiagnosticReport.presentedForm", "datatype" : "Attachment, url", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPresentedForm, setUrl"} **/
		));
	}
}
