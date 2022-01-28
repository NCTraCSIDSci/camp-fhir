package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Imagingstudy.
 * @see .Imagingstudy
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class ImagingstudyConversion 
{
	public Patient Imagingstudys(main.templateoutput.Model.Imagingstudy imagingstudy) 
	{
			Patient  Imagingstudyobj = new Patient(); 

						Imagingstudyobj.addIdentifier(HapiFHIRHelpers.createIdentifier(imagingstudy.getImgngStdDntfrDntfrSe() /** { "tree" :"ImagingStudy.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, imagingstudy.getImgngStdDntfrDntfrTpCcCSstm() /** { "tree" :"ImagingStudy.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, imagingstudy.getImgngStdDntfrDntfrTpCcCVrsn() /** { "tree" :"ImagingStudy.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, imagingstudy.getImgngStdDntfrDntfrTpCcCCde() /** { "tree" :"ImagingStudy.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, imagingstudy.getImgngStdDntfrDntfrTpCcCDsplay() /** { "tree" :"ImagingStudy.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, imagingstudy.getImgngStdDntfrDntfrTpCcCSrSlctd() /** { "tree" :"ImagingStudy.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, imagingstudy.getImgngStdDntfrDntfrTpCcTxt() /** { "tree" :"ImagingStudy.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, imagingstudy.getImgngStdDntfrDntfrPrdPrdStrt() /** { "tree" :"ImagingStudy.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, imagingstudy.getImgngStdDntfrDntfrPrdPrdNd() /** { "tree" :"ImagingStudy.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, imagingstudy.getImgngStdDntfrDntfrSsgnr() /** { "tree" :"ImagingStudy.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, imagingstudy.getImgngStdDntfrDntfrVlue() /** { "tree" :"ImagingStudy.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, imagingstudy.getImgngStdDntfrDntfrSstm() /** { "tree" :"ImagingStudy.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Imagingstudyobj.setStatus(HapiFHIRHelpers.createcode(imagingstudy.getImagingStudyStatusCode() /** { "tree" :"ImagingStudy.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Imagingstudyobj.addModality(HapiFHIRHelpers.createCoding(imagingstudy.getImgngStdMdltCSrSlctd() /** { "tree" :"ImagingStudy.modality", "datatype" : "Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addModality, setUserSelected"} **/
						, imagingstudy.getImagingStudyModalityCCode() /** { "tree" :"ImagingStudy.modality", "datatype" : "Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addModality, setCode"} **/
						, imagingstudy.getImagingStudyModalityCVersion() /** { "tree" :"ImagingStudy.modality", "datatype" : "Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addModality, setVersion"} **/
						, imagingstudy.getImagingStudyModalityCDisplay() /** { "tree" :"ImagingStudy.modality", "datatype" : "Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addModality, setDisplay"} **/
						, imagingstudy.getImagingStudyModalityCSystem() /** { "tree" :"ImagingStudy.modality", "datatype" : "Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addModality, setSystem"} **/
						));
Imagingstudyobj.setSubject(HapiFHIRHelpers.createReference(imagingstudy.getImagingStudySubjectReference() /** { "tree" :"ImagingStudy.subject", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setSubject"} **/
						));
Imagingstudyobj.setEncounter(HapiFHIRHelpers.createReference(imagingstudy.getImagingStudyEncounterReference() /** { "tree" :"ImagingStudy.encounter", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEncounter"} **/
						));
Imagingstudyobj.setStarted(HapiFHIRHelpers.createdateTime(imagingstudy.getImagingStudyStartedDateTime() /** { "tree" :"ImagingStudy.started", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStarted"} **/
						));
Imagingstudyobj.addBasedOn(HapiFHIRHelpers.createReference(imagingstudy.getImagingStudyBasedOnReference() /** { "tree" :"ImagingStudy.basedOn", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBasedOn"} **/
						));
Imagingstudyobj.setReferrer(HapiFHIRHelpers.createReference(imagingstudy.getImagingStudyReferrerReference() /** { "tree" :"ImagingStudy.referrer", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setReferrer"} **/
						));
Imagingstudyobj.addInterpreter(HapiFHIRHelpers.createReference(imagingstudy.getImagingStudyInterpreterReference() /** { "tree" :"ImagingStudy.interpreter", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addInterpreter"} **/
						));
Imagingstudyobj.addEndpoint(HapiFHIRHelpers.createReference(imagingstudy.getImagingStudyEndpointReference() /** { "tree" :"ImagingStudy.endpoint", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEndpoint"} **/
						));
Imagingstudyobj.setNumberOfSeries(HapiFHIRHelpers.createunsignedInt(imagingstudy.getImgngStdNmbrfSrsNsgndnt() /** { "tree" :"ImagingStudy.numberOfSeries", "datatype" : "unsignedInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setNumberOfSeries"} **/
						));
Imagingstudyobj.setNumberOfInstances(HapiFHIRHelpers.createunsignedInt(imagingstudy.getImgngStdNmbrfnstncsNsgndnt() /** { "tree" :"ImagingStudy.numberOfInstances", "datatype" : "unsignedInt", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setNumberOfInstances"} **/
						));
Imagingstudyobj.setProcedureReference(HapiFHIRHelpers.createReference(imagingstudy.getImgngStdPrcdrRfrncRfrnce() /** { "tree" :"ImagingStudy.procedureReference", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setProcedureReference"} **/
						));
Imagingstudyobj.addProcedureCode(HapiFHIRHelpers.createCodeableConcept(imagingstudy.getImgngStdPrcdrCdCcCdngCSstm() /** { "tree" :"ImagingStudy.procedureCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addProcedureCode, addCoding, setSystem"} **/
						, imagingstudy.getImgngStdPrcdrCdCcCdngCVrsn() /** { "tree" :"ImagingStudy.procedureCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addProcedureCode, addCoding, setVersion"} **/
						, imagingstudy.getImgngStdPrcdrCdCcCdngCCde() /** { "tree" :"ImagingStudy.procedureCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addProcedureCode, addCoding, setCode"} **/
						, imagingstudy.getImgngStdPrcdrCdCcCdngCDsplay() /** { "tree" :"ImagingStudy.procedureCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addProcedureCode, addCoding, setDisplay"} **/
						, imagingstudy.getImgngStdPrcdrCdCcCdngCSrSlctd() /** { "tree" :"ImagingStudy.procedureCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addProcedureCode, addCoding, setUserSelected"} **/
						, imagingstudy.getImagingStudyProcedureCodeCcText() /** { "tree" :"ImagingStudy.procedureCode", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addProcedureCode, setText"} **/
						));
Imagingstudyobj.setLocation(HapiFHIRHelpers.createReference(imagingstudy.getImagingStudyLocationReference() /** { "tree" :"ImagingStudy.location", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setLocation"} **/
						));
Imagingstudyobj.addReasonCode(HapiFHIRHelpers.createCodeableConcept(imagingstudy.getImgngStdRsnCdCcCdngCSstm() /** { "tree" :"ImagingStudy.reasonCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setSystem"} **/
						, imagingstudy.getImgngStdRsnCdCcCdngCVrsn() /** { "tree" :"ImagingStudy.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setVersion"} **/
						, imagingstudy.getImgngStdRsnCdCcCdngCCde() /** { "tree" :"ImagingStudy.reasonCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setCode"} **/
						, imagingstudy.getImgngStdRsnCdCcCdngCDsplay() /** { "tree" :"ImagingStudy.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setDisplay"} **/
						, imagingstudy.getImgngStdRsnCdCcCdngCSrSlctd() /** { "tree" :"ImagingStudy.reasonCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setUserSelected"} **/
						, imagingstudy.getImagingStudyReasonCodeCcText() /** { "tree" :"ImagingStudy.reasonCode", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, setText"} **/
						));
Imagingstudyobj.addReasonReference(HapiFHIRHelpers.createReference(imagingstudy.getImgngStdRsnRfrncRfrnce() /** { "tree" :"ImagingStudy.reasonReference", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonReference"} **/
						));
Imagingstudyobj.addNote(HapiFHIRHelpers.createAnnotation(imagingstudy.getImagingStudyNoteAnnotationTime() /** { "tree" :"ImagingStudy.note", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setTime"} **/
						, imagingstudy.getImagingStudyNoteAnnotationText() /** { "tree" :"ImagingStudy.note", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setText"} **/
						, imagingstudy.getImgngStdNtNnttnThrRfrnce() /** { "tree" :"ImagingStudy.note", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorReference"} **/
						, imagingstudy.getImgngStdNtNnttnThrStrng() /** { "tree" :"ImagingStudy.note", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorString"} **/
						));
Imagingstudyobj.setDescription(HapiFHIRHelpers.createstring(imagingstudy.getImagingStudyDescriptionString() /** { "tree" :"ImagingStudy.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDescription"} **/
						));
Imagingstudyobj.setUid(HapiFHIRHelpers.createid(imagingstudy.getImagingStudySeriesUidId() /** { "tree" :"ImagingStudy.series.uid", "datatype" : "id", "cardinality" : "Required", "elementtree" : ["addSeries"] , "methodName" : "setUid"} **/
						));
Imagingstudyobj.setNumber(HapiFHIRHelpers.createunsignedInt(imagingstudy.getImgngStdSrsNmbrNsgndnt() /** { "tree" :"ImagingStudy.series.number", "datatype" : "unsignedInt", "cardinality" : "ZeroOne", "elementtree" : ["addSeries"] , "methodName" : "setNumber"} **/
						));
Imagingstudyobj.setModality(HapiFHIRHelpers.createCoding(imagingstudy.getImgngStdSrsMdltCSrSlctd() /** { "tree" :"ImagingStudy.series.modality", "datatype" : "Coding, boolean", "cardinality" : "Required", "elementtree" : ["addSeries"] , "methodName" : "setModality, setUserSelected"} **/
						, imagingstudy.getImgngStdSrsMdltCCde() /** { "tree" :"ImagingStudy.series.modality", "datatype" : "Coding, code", "cardinality" : "Required", "elementtree" : ["addSeries"] , "methodName" : "setModality, setCode"} **/
						, imagingstudy.getImgngStdSrsMdltCVrsn() /** { "tree" :"ImagingStudy.series.modality", "datatype" : "Coding, string", "cardinality" : "Required", "elementtree" : ["addSeries"] , "methodName" : "setModality, setVersion"} **/
						, imagingstudy.getImgngStdSrsMdltCDsplay() /** { "tree" :"ImagingStudy.series.modality", "datatype" : "Coding, string", "cardinality" : "Required", "elementtree" : ["addSeries"] , "methodName" : "setModality, setDisplay"} **/
						, imagingstudy.getImgngStdSrsMdltCSstm() /** { "tree" :"ImagingStudy.series.modality", "datatype" : "Coding, uri", "cardinality" : "Required", "elementtree" : ["addSeries"] , "methodName" : "setModality, setSystem"} **/
						));
Imagingstudyobj.setDescription(HapiFHIRHelpers.createstring(imagingstudy.getImgngStdSrsDscrptnStrng() /** { "tree" :"ImagingStudy.series.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addSeries"] , "methodName" : "setDescription"} **/
						));
Imagingstudyobj.setNumberOfInstances(HapiFHIRHelpers.createunsignedInt(imagingstudy.getImgngStdSrsNmbrfnstncsNsgndnt() /** { "tree" :"ImagingStudy.series.numberOfInstances", "datatype" : "unsignedInt", "cardinality" : "ZeroOne", "elementtree" : ["addSeries"] , "methodName" : "setNumberOfInstances"} **/
						));
Imagingstudyobj.addEndpoint(HapiFHIRHelpers.createReference(imagingstudy.getImgngStdSrsNdpntRfrnce() /** { "tree" :"ImagingStudy.series.endpoint", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : ["addSeries"] , "methodName" : "addEndpoint"} **/
						));
Imagingstudyobj.setBodySite(HapiFHIRHelpers.createCoding(imagingstudy.getImgngStdSrsBdStCSrSlctd() /** { "tree" :"ImagingStudy.series.bodySite", "datatype" : "Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addSeries"] , "methodName" : "setBodySite, setUserSelected"} **/
						, imagingstudy.getImgngStdSrsBdStCCde() /** { "tree" :"ImagingStudy.series.bodySite", "datatype" : "Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addSeries"] , "methodName" : "setBodySite, setCode"} **/
						, imagingstudy.getImgngStdSrsBdStCVrsn() /** { "tree" :"ImagingStudy.series.bodySite", "datatype" : "Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addSeries"] , "methodName" : "setBodySite, setVersion"} **/
						, imagingstudy.getImgngStdSrsBdStCDsplay() /** { "tree" :"ImagingStudy.series.bodySite", "datatype" : "Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addSeries"] , "methodName" : "setBodySite, setDisplay"} **/
						, imagingstudy.getImgngStdSrsBdStCSstm() /** { "tree" :"ImagingStudy.series.bodySite", "datatype" : "Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addSeries"] , "methodName" : "setBodySite, setSystem"} **/
						));
Imagingstudyobj.setLaterality(HapiFHIRHelpers.createCoding(imagingstudy.getImgngStdSrsLtrltCSrSlctd() /** { "tree" :"ImagingStudy.series.laterality", "datatype" : "Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addSeries"] , "methodName" : "setLaterality, setUserSelected"} **/
						, imagingstudy.getImgngStdSrsLtrltCCde() /** { "tree" :"ImagingStudy.series.laterality", "datatype" : "Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addSeries"] , "methodName" : "setLaterality, setCode"} **/
						, imagingstudy.getImgngStdSrsLtrltCVrsn() /** { "tree" :"ImagingStudy.series.laterality", "datatype" : "Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addSeries"] , "methodName" : "setLaterality, setVersion"} **/
						, imagingstudy.getImgngStdSrsLtrltCDsplay() /** { "tree" :"ImagingStudy.series.laterality", "datatype" : "Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addSeries"] , "methodName" : "setLaterality, setDisplay"} **/
						, imagingstudy.getImgngStdSrsLtrltCSstm() /** { "tree" :"ImagingStudy.series.laterality", "datatype" : "Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addSeries"] , "methodName" : "setLaterality, setSystem"} **/
						));
Imagingstudyobj.addSpecimen(HapiFHIRHelpers.createReference(imagingstudy.getImgngStdSrsSpcmnRfrnce() /** { "tree" :"ImagingStudy.series.specimen", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : ["addSeries"] , "methodName" : "addSpecimen"} **/
						));
Imagingstudyobj.setStarted(HapiFHIRHelpers.createdateTime(imagingstudy.getImgngStdSrsStrtdDtTme() /** { "tree" :"ImagingStudy.series.started", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addSeries"] , "methodName" : "setStarted"} **/
						));
Imagingstudyobj.setFunction(HapiFHIRHelpers.createCodeableConcept(imagingstudy.getImgngStdSrsPrfrmrFnctnCcCdngCSstm() /** { "tree" :"ImagingStudy.series.performer.function", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addSeries", "addPerformer"] , "methodName" : "setFunction, addCoding, setSystem"} **/
						, imagingstudy.getImgngStdSrsPrfrmrFnctnCcCdngCVrsn() /** { "tree" :"ImagingStudy.series.performer.function", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addSeries", "addPerformer"] , "methodName" : "setFunction, addCoding, setVersion"} **/
						, imagingstudy.getImgngStdSrsPrfrmrFnctnCcCdngCCde() /** { "tree" :"ImagingStudy.series.performer.function", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addSeries", "addPerformer"] , "methodName" : "setFunction, addCoding, setCode"} **/
						, imagingstudy.getImgngStdSrsPrfrmrFnctnCcCdngCDsplay() /** { "tree" :"ImagingStudy.series.performer.function", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addSeries", "addPerformer"] , "methodName" : "setFunction, addCoding, setDisplay"} **/
						, imagingstudy.getImgngStdSrsPrfrmrFnctnCcCdngCSrSlctd() /** { "tree" :"ImagingStudy.series.performer.function", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addSeries", "addPerformer"] , "methodName" : "setFunction, addCoding, setUserSelected"} **/
						, imagingstudy.getImgngStdSrsPrfrmrFnctnCcTxt() /** { "tree" :"ImagingStudy.series.performer.function", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addSeries", "addPerformer"] , "methodName" : "setFunction, setText"} **/
						));
Imagingstudyobj.setActor(HapiFHIRHelpers.createReference(imagingstudy.getImgngStdSrsPrfrmrCtrRfrnce() /** { "tree" :"ImagingStudy.series.performer.actor", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addSeries", "addPerformer"] , "methodName" : "setActor"} **/
						));
Imagingstudyobj.setUid(HapiFHIRHelpers.createid(imagingstudy.getImgngStdSrsNstncDD() /** { "tree" :"ImagingStudy.series.instance.uid", "datatype" : "id", "cardinality" : "Required", "elementtree" : ["addSeries", "addPerformer", "addInstance"] , "methodName" : "setUid"} **/
						));
Imagingstudyobj.setSopClass(HapiFHIRHelpers.createCoding(imagingstudy.getImgngStdSrsNstncSpClssCSrSlctd() /** { "tree" :"ImagingStudy.series.instance.sopClass", "datatype" : "Coding, boolean", "cardinality" : "Required", "elementtree" : ["addSeries", "addPerformer", "addInstance"] , "methodName" : "setSopClass, setUserSelected"} **/
						, imagingstudy.getImgngStdSrsNstncSpClssCCde() /** { "tree" :"ImagingStudy.series.instance.sopClass", "datatype" : "Coding, code", "cardinality" : "Required", "elementtree" : ["addSeries", "addPerformer", "addInstance"] , "methodName" : "setSopClass, setCode"} **/
						, imagingstudy.getImgngStdSrsNstncSpClssCVrsn() /** { "tree" :"ImagingStudy.series.instance.sopClass", "datatype" : "Coding, string", "cardinality" : "Required", "elementtree" : ["addSeries", "addPerformer", "addInstance"] , "methodName" : "setSopClass, setVersion"} **/
						, imagingstudy.getImgngStdSrsNstncSpClssCDsplay() /** { "tree" :"ImagingStudy.series.instance.sopClass", "datatype" : "Coding, string", "cardinality" : "Required", "elementtree" : ["addSeries", "addPerformer", "addInstance"] , "methodName" : "setSopClass, setDisplay"} **/
						, imagingstudy.getImgngStdSrsNstncSpClssCSstm() /** { "tree" :"ImagingStudy.series.instance.sopClass", "datatype" : "Coding, uri", "cardinality" : "Required", "elementtree" : ["addSeries", "addPerformer", "addInstance"] , "methodName" : "setSopClass, setSystem"} **/
						));
Imagingstudyobj.setNumber(HapiFHIRHelpers.createunsignedInt(imagingstudy.getImgngStdSrsNstncNmbrNsgndnt() /** { "tree" :"ImagingStudy.series.instance.number", "datatype" : "unsignedInt", "cardinality" : "ZeroOne", "elementtree" : ["addSeries", "addPerformer", "addInstance"] , "methodName" : "setNumber"} **/
						));
Imagingstudyobj.setTitle(HapiFHIRHelpers.createstring(imagingstudy.getImgngStdSrsNstncTtlStrng() /** { "tree" :"ImagingStudy.series.instance.title", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addSeries", "addPerformer", "addInstance"] , "methodName" : "setTitle"} **/
		));
	}
}
