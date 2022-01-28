package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Allergyintolerance.
 * @see .Allergyintolerance
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class AllergyintoleranceConversion 
{
	public Patient Allergyintolerances(main.templateoutput.Model.Allergyintolerance allergyintolerance) 
	{
			Patient  Allergyintoleranceobj = new Patient(); 

						Allergyintoleranceobj.addIdentifier(HapiFHIRHelpers.createIdentifier(allergyintolerance.getAllrgntlrncDntfrDntfrSe() /** { "tree" :"AllergyIntolerance.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, allergyintolerance.getAllrgntlrncDntfrDntfrTpCcCSstm() /** { "tree" :"AllergyIntolerance.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, allergyintolerance.getAllrgntlrncDntfrDntfrTpCcCVrsn() /** { "tree" :"AllergyIntolerance.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, allergyintolerance.getAllrgntlrncDntfrDntfrTpCcCCde() /** { "tree" :"AllergyIntolerance.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, allergyintolerance.getAllrgntlrncDntfrDntfrTpCcCDsplay() /** { "tree" :"AllergyIntolerance.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, allergyintolerance.getAllrgntlrncDntfrDntfrTpCcCSrSlctd() /** { "tree" :"AllergyIntolerance.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, allergyintolerance.getAllrgntlrncDntfrDntfrTpCcTxt() /** { "tree" :"AllergyIntolerance.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, allergyintolerance.getAllrgntlrncDntfrDntfrPrdPrdStrt() /** { "tree" :"AllergyIntolerance.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, allergyintolerance.getAllrgntlrncDntfrDntfrPrdPrdNd() /** { "tree" :"AllergyIntolerance.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, allergyintolerance.getAllrgntlrncDntfrDntfrSsgnr() /** { "tree" :"AllergyIntolerance.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, allergyintolerance.getAllrgntlrncDntfrDntfrVlue() /** { "tree" :"AllergyIntolerance.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, allergyintolerance.getAllrgntlrncDntfrDntfrSstm() /** { "tree" :"AllergyIntolerance.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Allergyintoleranceobj.setClinicalStatus(HapiFHIRHelpers.createCodeableConcept(allergyintolerance.getAllrgntlrncClnclSttsCcCdngCSstm() /** { "tree" :"AllergyIntolerance.clinicalStatus", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setClinicalStatus, addCoding, setSystem"} **/
						, allergyintolerance.getAllrgntlrncClnclSttsCcCdngCVrsn() /** { "tree" :"AllergyIntolerance.clinicalStatus", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setClinicalStatus, addCoding, setVersion"} **/
						, allergyintolerance.getAllrgntlrncClnclSttsCcCdngCCde() /** { "tree" :"AllergyIntolerance.clinicalStatus", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setClinicalStatus, addCoding, setCode"} **/
						, allergyintolerance.getAllrgntlrncClnclSttsCcCdngCDsplay() /** { "tree" :"AllergyIntolerance.clinicalStatus", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setClinicalStatus, addCoding, setDisplay"} **/
						, allergyintolerance.getAllrgntlrncClnclSttsCcCdngCSrSlctd() /** { "tree" :"AllergyIntolerance.clinicalStatus", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setClinicalStatus, addCoding, setUserSelected"} **/
						, allergyintolerance.getAllrgntlrncClnclSttsCcTxt() /** { "tree" :"AllergyIntolerance.clinicalStatus", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setClinicalStatus, setText"} **/
						));
Allergyintoleranceobj.setVerificationStatus(HapiFHIRHelpers.createCodeableConcept(allergyintolerance.getAllrgntlrncVrfctnSttsCcCdngCSstm() /** { "tree" :"AllergyIntolerance.verificationStatus", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setVerificationStatus, addCoding, setSystem"} **/
						, allergyintolerance.getAllrgntlrncVrfctnSttsCcCdngCVrsn() /** { "tree" :"AllergyIntolerance.verificationStatus", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setVerificationStatus, addCoding, setVersion"} **/
						, allergyintolerance.getAllrgntlrncVrfctnSttsCcCdngCCde() /** { "tree" :"AllergyIntolerance.verificationStatus", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setVerificationStatus, addCoding, setCode"} **/
						, allergyintolerance.getAllrgntlrncVrfctnSttsCcCdngCDsplay() /** { "tree" :"AllergyIntolerance.verificationStatus", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setVerificationStatus, addCoding, setDisplay"} **/
						, allergyintolerance.getAllrgntlrncVrfctnSttsCcCdngCSrSlctd() /** { "tree" :"AllergyIntolerance.verificationStatus", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setVerificationStatus, addCoding, setUserSelected"} **/
						, allergyintolerance.getAllrgntlrncVrfctnSttsCcTxt() /** { "tree" :"AllergyIntolerance.verificationStatus", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setVerificationStatus, setText"} **/
						));
Allergyintoleranceobj.setType(HapiFHIRHelpers.createcode(allergyintolerance.getAllergyIntoleranceTypeCode() /** { "tree" :"AllergyIntolerance.type", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType"} **/
						));
Allergyintoleranceobj.addCategory(HapiFHIRHelpers.createcode(allergyintolerance.getAllergyIntoleranceCategoryCode() /** { "tree" :"AllergyIntolerance.category", "datatype" : "code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory"} **/
						));
Allergyintoleranceobj.setCriticality(HapiFHIRHelpers.createcode(allergyintolerance.getAllrgntlrncCrtcltCde() /** { "tree" :"AllergyIntolerance.criticality", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCriticality"} **/
						));
Allergyintoleranceobj.setCode(HapiFHIRHelpers.createCodeableConcept(allergyintolerance.getAllrgntlrncCdCcCdngCSstm() /** { "tree" :"AllergyIntolerance.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setSystem"} **/
						, allergyintolerance.getAllrgntlrncCdCcCdngCVrsn() /** { "tree" :"AllergyIntolerance.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setVersion"} **/
						, allergyintolerance.getAllrgntlrncCdCcCdngCCde() /** { "tree" :"AllergyIntolerance.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setCode"} **/
						, allergyintolerance.getAllrgntlrncCdCcCdngCDsplay() /** { "tree" :"AllergyIntolerance.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, allergyintolerance.getAllrgntlrncCdCcCdngCSrSlctd() /** { "tree" :"AllergyIntolerance.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, allergyintolerance.getAllergyIntoleranceCodeCcText() /** { "tree" :"AllergyIntolerance.code", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, setText"} **/
						));
Allergyintoleranceobj.setPatient(HapiFHIRHelpers.createReference(allergyintolerance.getAllergyIntolerancePntReference() /** { "tree" :"AllergyIntolerance.patient", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setPatient"} **/
						));
Allergyintoleranceobj.setEncounter(HapiFHIRHelpers.createReference(allergyintolerance.getAllrgntlrncNcntrRfrnce() /** { "tree" :"AllergyIntolerance.encounter", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEncounter"} **/
						));
Allergyintoleranceobj.setOnset(HapiFHIRHelpers.createdateTimetype(allergyintolerance.getAllrgntlrncNstDttmDtTme() /** { "tree" :"AllergyIntolerance.onsetDatetime", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOnsetDatetime"} **/
						));
Allergyintoleranceobj.setOnsetAge(HapiFHIRHelpers.createAge(allergyintolerance.getAllergyIntoleranceOnsetAgeAge() /** { "tree" :"AllergyIntolerance.onsetAge", "datatype" : "Age", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOnsetAge"} **/
						));
Allergyintoleranceobj.setOnsetPeriod(HapiFHIRHelpers.createPeriod(allergyintolerance.getAllrgntlrncNstPrdPrdStrt() /** { "tree" :"AllergyIntolerance.onsetPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOnsetPeriod, setStart"} **/
						, allergyintolerance.getAllrgntlrncNstPrdPrdNd() /** { "tree" :"AllergyIntolerance.onsetPeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOnsetPeriod, setEnd"} **/
						));
Allergyintoleranceobj.setOnsetRange(HapiFHIRHelpers.createRange(allergyintolerance.getAllrgntlrncNstRngRngLw() /** { "tree" :"AllergyIntolerance.onsetRange", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOnsetRange, setLow"} **/
						, allergyintolerance.getAllrgntlrncNstRngRngHgh() /** { "tree" :"AllergyIntolerance.onsetRange", "datatype" : "Range, SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOnsetRange, setHigh"} **/
						));
Allergyintoleranceobj.setOnsetString(HapiFHIRHelpers.createstring(allergyintolerance.getAllrgntlrncNstStrngStrng() /** { "tree" :"AllergyIntolerance.onsetString", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOnsetString"} **/
						));
Allergyintoleranceobj.setRecordedDate(HapiFHIRHelpers.createdateTime(allergyintolerance.getAllrgntlrncRcrddDtDtTme() /** { "tree" :"AllergyIntolerance.recordedDate", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRecordedDate"} **/
						));
Allergyintoleranceobj.setRecorder(HapiFHIRHelpers.createReference(allergyintolerance.getAllrgntlrncRcrdrRfrnce() /** { "tree" :"AllergyIntolerance.recorder", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRecorder"} **/
						));
Allergyintoleranceobj.setAsserter(HapiFHIRHelpers.createReference(allergyintolerance.getAllrgntlrncSsrtrRfrnce() /** { "tree" :"AllergyIntolerance.asserter", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAsserter"} **/
						));
Allergyintoleranceobj.setLastOccurrence(HapiFHIRHelpers.createdateTime(allergyintolerance.getAllrgntlrncLstccrrncDtTme() /** { "tree" :"AllergyIntolerance.lastOccurrence", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setLastOccurrence"} **/
						));
Allergyintoleranceobj.addNote(HapiFHIRHelpers.createAnnotation(allergyintolerance.getAllrgntlrncNtNnttnTme() /** { "tree" :"AllergyIntolerance.note", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setTime"} **/
						, allergyintolerance.getAllrgntlrncNtNnttnTxt() /** { "tree" :"AllergyIntolerance.note", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setText"} **/
						, allergyintolerance.getAllrgntlrncNtNnttnThrRfrnce() /** { "tree" :"AllergyIntolerance.note", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorReference"} **/
						, allergyintolerance.getAllrgntlrncNtNnttnThrStrng() /** { "tree" :"AllergyIntolerance.note", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorString"} **/
						));
Allergyintoleranceobj.setSubstance(HapiFHIRHelpers.createCodeableConcept(allergyintolerance.getAllrgntlrncRctnSbstncCcCdngCSstm() /** { "tree" :"AllergyIntolerance.reaction.substance", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addReaction"] , "methodName" : "setSubstance, addCoding, setSystem"} **/
						, allergyintolerance.getAllrgntlrncRctnSbstncCcCdngCVrsn() /** { "tree" :"AllergyIntolerance.reaction.substance", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addReaction"] , "methodName" : "setSubstance, addCoding, setVersion"} **/
						, allergyintolerance.getAllrgntlrncRctnSbstncCcCdngCCde() /** { "tree" :"AllergyIntolerance.reaction.substance", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addReaction"] , "methodName" : "setSubstance, addCoding, setCode"} **/
						, allergyintolerance.getAllrgntlrncRctnSbstncCcCdngCDsplay() /** { "tree" :"AllergyIntolerance.reaction.substance", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addReaction"] , "methodName" : "setSubstance, addCoding, setDisplay"} **/
						, allergyintolerance.getAllrgntlrncRctnSbstncCcCdngCSrSlctd() /** { "tree" :"AllergyIntolerance.reaction.substance", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addReaction"] , "methodName" : "setSubstance, addCoding, setUserSelected"} **/
						, allergyintolerance.getAllrgntlrncRctnSbstncCcTxt() /** { "tree" :"AllergyIntolerance.reaction.substance", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addReaction"] , "methodName" : "setSubstance, setText"} **/
						));
Allergyintoleranceobj.setManifestation(HapiFHIRHelpers.createCodeableConcept(allergyintolerance.getAllrgntlrncRctnMnfsttnCcCdngCSstm() /** { "tree" :"AllergyIntolerance.reaction.manifestation", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addReaction"] , "methodName" : "setManifestation, addCoding, setSystem"} **/
						, allergyintolerance.getAllrgntlrncRctnMnfsttnCcCdngCVrsn() /** { "tree" :"AllergyIntolerance.reaction.manifestation", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addReaction"] , "methodName" : "setManifestation, addCoding, setVersion"} **/
						, allergyintolerance.getAllrgntlrncRctnMnfsttnCcCdngCCde() /** { "tree" :"AllergyIntolerance.reaction.manifestation", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addReaction"] , "methodName" : "setManifestation, addCoding, setCode"} **/
						, allergyintolerance.getAllrgntlrncRctnMnfsttnCcCdngCDsplay() /** { "tree" :"AllergyIntolerance.reaction.manifestation", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addReaction"] , "methodName" : "setManifestation, addCoding, setDisplay"} **/
						, allergyintolerance.getAllrgntlrncRctnMnfsttnCcCdngCSrSlctd() /** { "tree" :"AllergyIntolerance.reaction.manifestation", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addReaction"] , "methodName" : "setManifestation, addCoding, setUserSelected"} **/
						, allergyintolerance.getAllrgntlrncRctnMnfsttnCcTxt() /** { "tree" :"AllergyIntolerance.reaction.manifestation", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addReaction"] , "methodName" : "setManifestation, setText"} **/
						));
Allergyintoleranceobj.setDescription(HapiFHIRHelpers.createstring(allergyintolerance.getAllrgntlrncRctnDscrptnStrng() /** { "tree" :"AllergyIntolerance.reaction.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addReaction"] , "methodName" : "setDescription"} **/
						));
Allergyintoleranceobj.setOnset(HapiFHIRHelpers.createdateTime(allergyintolerance.getAllrgntlrncRctnNstDtTme() /** { "tree" :"AllergyIntolerance.reaction.onset", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addReaction"] , "methodName" : "setOnset"} **/
						));
Allergyintoleranceobj.setSeverity(HapiFHIRHelpers.createcode(allergyintolerance.getAllrgntlrncRctnSvrtCde() /** { "tree" :"AllergyIntolerance.reaction.severity", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addReaction"] , "methodName" : "setSeverity"} **/
						));
Allergyintoleranceobj.setExposureRoute(HapiFHIRHelpers.createCodeableConcept(allergyintolerance.getAllrgntlrncRctnXpsrRtCcCdngCSstm() /** { "tree" :"AllergyIntolerance.reaction.exposureRoute", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addReaction"] , "methodName" : "setExposureRoute, addCoding, setSystem"} **/
						, allergyintolerance.getAllrgntlrncRctnXpsrRtCcCdngCVrsn() /** { "tree" :"AllergyIntolerance.reaction.exposureRoute", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addReaction"] , "methodName" : "setExposureRoute, addCoding, setVersion"} **/
						, allergyintolerance.getAllrgntlrncRctnXpsrRtCcCdngCCde() /** { "tree" :"AllergyIntolerance.reaction.exposureRoute", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addReaction"] , "methodName" : "setExposureRoute, addCoding, setCode"} **/
						, allergyintolerance.getAllrgntlrncRctnXpsrRtCcCdngCDsplay() /** { "tree" :"AllergyIntolerance.reaction.exposureRoute", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addReaction"] , "methodName" : "setExposureRoute, addCoding, setDisplay"} **/
						, allergyintolerance.getAllrgntlrncRctnXpsrRtCcCdngCSrSlctd() /** { "tree" :"AllergyIntolerance.reaction.exposureRoute", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addReaction"] , "methodName" : "setExposureRoute, addCoding, setUserSelected"} **/
						, allergyintolerance.getAllrgntlrncRctnXpsrRtCcTxt() /** { "tree" :"AllergyIntolerance.reaction.exposureRoute", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addReaction"] , "methodName" : "setExposureRoute, setText"} **/
						));
Allergyintoleranceobj.addNote(HapiFHIRHelpers.createAnnotation(allergyintolerance.getAllrgntlrncRctnNtNnttnTme() /** { "tree" :"AllergyIntolerance.reaction.note", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : ["addReaction"] , "methodName" : "addNote, setTime"} **/
						, allergyintolerance.getAllrgntlrncRctnNtNnttnTxt() /** { "tree" :"AllergyIntolerance.reaction.note", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : ["addReaction"] , "methodName" : "addNote, setText"} **/
						, allergyintolerance.getAllrgntlrncRctnNtNnttnThrRfrnce() /** { "tree" :"AllergyIntolerance.reaction.note", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : ["addReaction"] , "methodName" : "addNote, setAuthorReference"} **/
						, allergyintolerance.getAllrgntlrncRctnNtNnttnThrStrng() /** { "tree" :"AllergyIntolerance.reaction.note", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : ["addReaction"] , "methodName" : "addNote, setAuthorString"} **/
		));
	}
}
