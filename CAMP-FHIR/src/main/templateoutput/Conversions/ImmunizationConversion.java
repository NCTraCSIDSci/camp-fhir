package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Immunization.
 * @see .Immunization
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class ImmunizationConversion 
{
	public Patient Immunizations(main.templateoutput.Model.Immunization immunization) 
	{
			Patient  Immunizationobj = new Patient(); 

						Immunizationobj.addIdentifier(HapiFHIRHelpers.createIdentifier(immunization.getImmIdentifierIdentifierUse() /** { "tree" :"Immunization.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, immunization.getImmDntfrDntfrTpCcCSstm() /** { "tree" :"Immunization.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, immunization.getImmDntfrDntfrTpCcCVrsn() /** { "tree" :"Immunization.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, immunization.getImmDntfrDntfrTpCcCCde() /** { "tree" :"Immunization.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, immunization.getImmDntfrDntfrTpCcCDsplay() /** { "tree" :"Immunization.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, immunization.getImmDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Immunization.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, immunization.getImmDntfrDntfrTpCcTxt() /** { "tree" :"Immunization.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, immunization.getImmDntfrDntfrPrdPrdStrt() /** { "tree" :"Immunization.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, immunization.getImmDntfrDntfrPrdPrdNd() /** { "tree" :"Immunization.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, immunization.getImmIdentifierIdentifierAssigner() /** { "tree" :"Immunization.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, immunization.getImmIdentifierIdentifierValue() /** { "tree" :"Immunization.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, immunization.getImmIdentifierIdentifierSystem() /** { "tree" :"Immunization.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Immunizationobj.setStatus(HapiFHIRHelpers.createcode(immunization.getImmStatusCode() /** { "tree" :"Immunization.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Immunizationobj.setStatusReason(HapiFHIRHelpers.createCodeableConcept(immunization.getImmSttsRsnCcCdngCSstm() /** { "tree" :"Immunization.statusReason", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, addCoding, setSystem"} **/
						, immunization.getImmSttsRsnCcCdngCVrsn() /** { "tree" :"Immunization.statusReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, addCoding, setVersion"} **/
						, immunization.getImmStatusReasonCcCodingCCode() /** { "tree" :"Immunization.statusReason", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, addCoding, setCode"} **/
						, immunization.getImmSttsRsnCcCdngCDsplay() /** { "tree" :"Immunization.statusReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, addCoding, setDisplay"} **/
						, immunization.getImmSttsRsnCcCdngCSrSlctd() /** { "tree" :"Immunization.statusReason", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, addCoding, setUserSelected"} **/
						, immunization.getImmStatusReasonCcText() /** { "tree" :"Immunization.statusReason", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReason, setText"} **/
						));
Immunizationobj.setVaccineCode(HapiFHIRHelpers.createCodeableConcept(immunization.getImmVaccineCodeCcCodingCSystem() /** { "tree" :"Immunization.vaccineCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setVaccineCode, addCoding, setSystem"} **/
						, immunization.getImmVccnCdCcCdngCVrsn() /** { "tree" :"Immunization.vaccineCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setVaccineCode, addCoding, setVersion"} **/
						, immunization.getImmVaccineCodeCcCodingCCode() /** { "tree" :"Immunization.vaccineCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setVaccineCode, addCoding, setCode"} **/
						, immunization.getImmVccnCdCcCdngCDsplay() /** { "tree" :"Immunization.vaccineCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setVaccineCode, addCoding, setDisplay"} **/
						, immunization.getImmVccnCdCcCdngCSrSlctd() /** { "tree" :"Immunization.vaccineCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setVaccineCode, addCoding, setUserSelected"} **/
						, immunization.getImmVaccineCodeCcText() /** { "tree" :"Immunization.vaccineCode", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setVaccineCode, setText"} **/
						));
Immunizationobj.setPatient(HapiFHIRHelpers.createReference(immunization.getImmPntReference() /** { "tree" :"Immunization.patient", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setPatient"} **/
						));
Immunizationobj.setEncounter(HapiFHIRHelpers.createReference(immunization.getImmEncounterReference() /** { "tree" :"Immunization.encounter", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEncounter"} **/
						));
Immunizationobj.setOccurrence(HapiFHIRHelpers.createdateTimetype(immunization.getImmOccurrenceDatetimeDateTime() /** { "tree" :"Immunization.occurrenceDatetime", "datatype" : "dateTime", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setOccurrenceDatetime"} **/
						));
Immunizationobj.setOccurrenceString(HapiFHIRHelpers.createstring(immunization.getImmOccurrenceStringString() /** { "tree" :"Immunization.occurrenceString", "datatype" : "string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setOccurrenceString"} **/
						));
Immunizationobj.setRecorded(HapiFHIRHelpers.createdateTime(immunization.getImmRecordedDateTime() /** { "tree" :"Immunization.recorded", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRecorded"} **/
						));
Immunizationobj.setPrimarySource(HapiFHIRHelpers.createboolean(immunization.getImmPrimarySourceBoolean() /** { "tree" :"Immunization.primarySource", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPrimarySource"} **/
						));
Immunizationobj.setReportOrigin(HapiFHIRHelpers.createCodeableConcept(immunization.getImmRprtrgnCcCdngCSstm() /** { "tree" :"Immunization.reportOrigin", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setReportOrigin, addCoding, setSystem"} **/
						, immunization.getImmRprtrgnCcCdngCVrsn() /** { "tree" :"Immunization.reportOrigin", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setReportOrigin, addCoding, setVersion"} **/
						, immunization.getImmReportOriginCcCodingCCode() /** { "tree" :"Immunization.reportOrigin", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setReportOrigin, addCoding, setCode"} **/
						, immunization.getImmRprtrgnCcCdngCDsplay() /** { "tree" :"Immunization.reportOrigin", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setReportOrigin, addCoding, setDisplay"} **/
						, immunization.getImmRprtrgnCcCdngCSrSlctd() /** { "tree" :"Immunization.reportOrigin", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setReportOrigin, addCoding, setUserSelected"} **/
						, immunization.getImmReportOriginCcText() /** { "tree" :"Immunization.reportOrigin", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setReportOrigin, setText"} **/
						));
Immunizationobj.setLocation(HapiFHIRHelpers.createReference(immunization.getImmLocationReference() /** { "tree" :"Immunization.location", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setLocation"} **/
						));
Immunizationobj.setManufacturer(HapiFHIRHelpers.createReference(immunization.getImmManufacturerReference() /** { "tree" :"Immunization.manufacturer", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setManufacturer"} **/
						));
Immunizationobj.setLotNumber(HapiFHIRHelpers.createstring(immunization.getImmLotNumberString() /** { "tree" :"Immunization.lotNumber", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setLotNumber"} **/
						));
Immunizationobj.setExpirationDate(HapiFHIRHelpers.createdate(immunization.getImmExpirationDateDate() /** { "tree" :"Immunization.expirationDate", "datatype" : "date", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setExpirationDate"} **/
						));
Immunizationobj.setSite(HapiFHIRHelpers.createCodeableConcept(immunization.getImmSiteCcCodingCSystem() /** { "tree" :"Immunization.site", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSite, addCoding, setSystem"} **/
						, immunization.getImmSiteCcCodingCVersion() /** { "tree" :"Immunization.site", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSite, addCoding, setVersion"} **/
						, immunization.getImmSiteCcCodingCCode() /** { "tree" :"Immunization.site", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSite, addCoding, setCode"} **/
						, immunization.getImmSiteCcCodingCDisplay() /** { "tree" :"Immunization.site", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSite, addCoding, setDisplay"} **/
						, immunization.getImmSiteCcCodingCUserSelected() /** { "tree" :"Immunization.site", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSite, addCoding, setUserSelected"} **/
						, immunization.getImmSiteCcText() /** { "tree" :"Immunization.site", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSite, setText"} **/
						));
Immunizationobj.setRoute(HapiFHIRHelpers.createCodeableConcept(immunization.getImmRouteCcCodingCSystem() /** { "tree" :"Immunization.route", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRoute, addCoding, setSystem"} **/
						, immunization.getImmRouteCcCodingCVersion() /** { "tree" :"Immunization.route", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRoute, addCoding, setVersion"} **/
						, immunization.getImmRouteCcCodingCCode() /** { "tree" :"Immunization.route", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRoute, addCoding, setCode"} **/
						, immunization.getImmRouteCcCodingCDisplay() /** { "tree" :"Immunization.route", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRoute, addCoding, setDisplay"} **/
						, immunization.getImmRouteCcCodingCUserSelected() /** { "tree" :"Immunization.route", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRoute, addCoding, setUserSelected"} **/
						, immunization.getImmRouteCcText() /** { "tree" :"Immunization.route", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRoute, setText"} **/
						));
Immunizationobj.setDoseQuantity(HapiFHIRHelpers.createSimpleQuantity(immunization.getImmDoseQuantitySimpleQuantity() /** { "tree" :"Immunization.doseQuantity", "datatype" : "SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDoseQuantity"} **/
						));
Immunizationobj.setFunction(HapiFHIRHelpers.createCodeableConcept(immunization.getImmPrfrmrFnctnCcCdngCSstm() /** { "tree" :"Immunization.performer.function", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addPerformer"] , "methodName" : "setFunction, addCoding, setSystem"} **/
						, immunization.getImmPrfrmrFnctnCcCdngCVrsn() /** { "tree" :"Immunization.performer.function", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addPerformer"] , "methodName" : "setFunction, addCoding, setVersion"} **/
						, immunization.getImmPrfrmrFnctnCcCdngCCde() /** { "tree" :"Immunization.performer.function", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addPerformer"] , "methodName" : "setFunction, addCoding, setCode"} **/
						, immunization.getImmPrfrmrFnctnCcCdngCDsplay() /** { "tree" :"Immunization.performer.function", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addPerformer"] , "methodName" : "setFunction, addCoding, setDisplay"} **/
						, immunization.getImmPrfrmrFnctnCcCdngCSrSlctd() /** { "tree" :"Immunization.performer.function", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addPerformer"] , "methodName" : "setFunction, addCoding, setUserSelected"} **/
						, immunization.getImmPerformerFunctionCcText() /** { "tree" :"Immunization.performer.function", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addPerformer"] , "methodName" : "setFunction, setText"} **/
						));
Immunizationobj.setActor(HapiFHIRHelpers.createReference(immunization.getImmPerformerActorReference() /** { "tree" :"Immunization.performer.actor", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addPerformer"] , "methodName" : "setActor"} **/
						));
Immunizationobj.addNote(HapiFHIRHelpers.createAnnotation(immunization.getImmNoteAnnotationTime() /** { "tree" :"Immunization.note", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setTime"} **/
						, immunization.getImmNoteAnnotationText() /** { "tree" :"Immunization.note", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setText"} **/
						, immunization.getImmNtNnttnThrRfrnce() /** { "tree" :"Immunization.note", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorReference"} **/
						, immunization.getImmNoteAnnotationAuthorString() /** { "tree" :"Immunization.note", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorString"} **/
						));
Immunizationobj.addReasonCode(HapiFHIRHelpers.createCodeableConcept(immunization.getImmReasonCodeCcCodingCSystem() /** { "tree" :"Immunization.reasonCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setSystem"} **/
						, immunization.getImmReasonCodeCcCodingCVersion() /** { "tree" :"Immunization.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setVersion"} **/
						, immunization.getImmReasonCodeCcCodingCCode() /** { "tree" :"Immunization.reasonCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setCode"} **/
						, immunization.getImmReasonCodeCcCodingCDisplay() /** { "tree" :"Immunization.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setDisplay"} **/
						, immunization.getImmRsnCdCcCdngCSrSlctd() /** { "tree" :"Immunization.reasonCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setUserSelected"} **/
						, immunization.getImmReasonCodeCcText() /** { "tree" :"Immunization.reasonCode", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, setText"} **/
						));
Immunizationobj.addReasonReference(HapiFHIRHelpers.createReference(immunization.getImmReasonReferenceReference() /** { "tree" :"Immunization.reasonReference", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonReference"} **/
						));
Immunizationobj.setIsSubpotent(HapiFHIRHelpers.createboolean(immunization.getImmIsSubpotentBoolean() /** { "tree" :"Immunization.isSubpotent", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIsSubpotent"} **/
						));
Immunizationobj.addSubpotentReason(HapiFHIRHelpers.createCodeableConcept(immunization.getImmSbptntRsnCcCdngCSstm() /** { "tree" :"Immunization.subpotentReason", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSubpotentReason, addCoding, setSystem"} **/
						, immunization.getImmSbptntRsnCcCdngCVrsn() /** { "tree" :"Immunization.subpotentReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSubpotentReason, addCoding, setVersion"} **/
						, immunization.getImmSbptntRsnCcCdngCCde() /** { "tree" :"Immunization.subpotentReason", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSubpotentReason, addCoding, setCode"} **/
						, immunization.getImmSbptntRsnCcCdngCDsplay() /** { "tree" :"Immunization.subpotentReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSubpotentReason, addCoding, setDisplay"} **/
						, immunization.getImmSbptntRsnCcCdngCSrSlctd() /** { "tree" :"Immunization.subpotentReason", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSubpotentReason, addCoding, setUserSelected"} **/
						, immunization.getImmSubpotentReasonCcText() /** { "tree" :"Immunization.subpotentReason", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSubpotentReason, setText"} **/
						));
Immunizationobj.setDocumentType(HapiFHIRHelpers.createstring(immunization.getImmEducationDocumentTypeString() /** { "tree" :"Immunization.education.documentType", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addEducation"] , "methodName" : "setDocumentType"} **/
						));
Immunizationobj.setReference(HapiFHIRHelpers.createuri(immunization.getImmEducationReferenceUri() /** { "tree" :"Immunization.education.reference", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : ["addEducation"] , "methodName" : "setReference"} **/
						));
Immunizationobj.setPublicationDate(HapiFHIRHelpers.createdateTime(immunization.getImmDctnPblctnDtDtTme() /** { "tree" :"Immunization.education.publicationDate", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addEducation"] , "methodName" : "setPublicationDate"} **/
						));
Immunizationobj.setPresentationDate(HapiFHIRHelpers.createdateTime(immunization.getImmDctnPrsnttnDtDtTme() /** { "tree" :"Immunization.education.presentationDate", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addEducation"] , "methodName" : "setPresentationDate"} **/
						));
Immunizationobj.addProgramEligibility(HapiFHIRHelpers.createCodeableConcept(immunization.getImmPrgrmlgbltCcCdngCSstm() /** { "tree" :"Immunization.programEligibility", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addProgramEligibility, addCoding, setSystem"} **/
						, immunization.getImmPrgrmlgbltCcCdngCVrsn() /** { "tree" :"Immunization.programEligibility", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addProgramEligibility, addCoding, setVersion"} **/
						, immunization.getImmPrgrmlgbltCcCdngCCde() /** { "tree" :"Immunization.programEligibility", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addProgramEligibility, addCoding, setCode"} **/
						, immunization.getImmPrgrmlgbltCcCdngCDsplay() /** { "tree" :"Immunization.programEligibility", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addProgramEligibility, addCoding, setDisplay"} **/
						, immunization.getImmPrgrmlgbltCcCdngCSrSlctd() /** { "tree" :"Immunization.programEligibility", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addProgramEligibility, addCoding, setUserSelected"} **/
						, immunization.getImmProgramEligibilityCcText() /** { "tree" :"Immunization.programEligibility", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addProgramEligibility, setText"} **/
						));
Immunizationobj.setFundingSource(HapiFHIRHelpers.createCodeableConcept(immunization.getImmFndngSrcCcCdngCSstm() /** { "tree" :"Immunization.fundingSource", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFundingSource, addCoding, setSystem"} **/
						, immunization.getImmFndngSrcCcCdngCVrsn() /** { "tree" :"Immunization.fundingSource", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFundingSource, addCoding, setVersion"} **/
						, immunization.getImmFundingSourceCcCodingCCode() /** { "tree" :"Immunization.fundingSource", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFundingSource, addCoding, setCode"} **/
						, immunization.getImmFndngSrcCcCdngCDsplay() /** { "tree" :"Immunization.fundingSource", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFundingSource, addCoding, setDisplay"} **/
						, immunization.getImmFndngSrcCcCdngCSrSlctd() /** { "tree" :"Immunization.fundingSource", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFundingSource, addCoding, setUserSelected"} **/
						, immunization.getImmFundingSourceCcText() /** { "tree" :"Immunization.fundingSource", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFundingSource, setText"} **/
						));
Immunizationobj.setDate(HapiFHIRHelpers.createdateTime(immunization.getImmReactionDateDateTime() /** { "tree" :"Immunization.reaction.date", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addReaction"] , "methodName" : "setDate"} **/
						));
Immunizationobj.setDetail(HapiFHIRHelpers.createReference(immunization.getImmReactionDetailReference() /** { "tree" :"Immunization.reaction.detail", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addReaction"] , "methodName" : "setDetail"} **/
						));
Immunizationobj.setReported(HapiFHIRHelpers.createboolean(immunization.getImmReactionReportedBoolean() /** { "tree" :"Immunization.reaction.reported", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addReaction"] , "methodName" : "setReported"} **/
						));
Immunizationobj.setSeries(HapiFHIRHelpers.createstring(immunization.getImmProtocolAppliedSeriesString() /** { "tree" :"Immunization.protocolApplied.series", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addProtocolApplied"] , "methodName" : "setSeries"} **/
						));
Immunizationobj.setAuthority(HapiFHIRHelpers.createReference(immunization.getImmPrtclppldThrtRfrnce() /** { "tree" :"Immunization.protocolApplied.authority", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addProtocolApplied"] , "methodName" : "setAuthority"} **/
						));
Immunizationobj.addTargetDisease(HapiFHIRHelpers.createCodeableConcept(immunization.getImmPrtclppldTrgtDssCcCdngCSstm() /** { "tree" :"Immunization.protocolApplied.targetDisease", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addProtocolApplied"] , "methodName" : "addTargetDisease, addCoding, setSystem"} **/
						, immunization.getImmPrtclppldTrgtDssCcCdngCVrsn() /** { "tree" :"Immunization.protocolApplied.targetDisease", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addProtocolApplied"] , "methodName" : "addTargetDisease, addCoding, setVersion"} **/
						, immunization.getImmPrtclppldTrgtDssCcCdngCCde() /** { "tree" :"Immunization.protocolApplied.targetDisease", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addProtocolApplied"] , "methodName" : "addTargetDisease, addCoding, setCode"} **/
						, immunization.getImmPrtclppldTrgtDssCcCdngCDsplay() /** { "tree" :"Immunization.protocolApplied.targetDisease", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addProtocolApplied"] , "methodName" : "addTargetDisease, addCoding, setDisplay"} **/
						, immunization.getImmPrtclppldTrgtDssCcCdngCSrSlctd() /** { "tree" :"Immunization.protocolApplied.targetDisease", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addProtocolApplied"] , "methodName" : "addTargetDisease, addCoding, setUserSelected"} **/
						, immunization.getImmPrtclppldTrgtDssCcTxt() /** { "tree" :"Immunization.protocolApplied.targetDisease", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addProtocolApplied"] , "methodName" : "addTargetDisease, setText"} **/
						));
Immunizationobj.setDoseNumberPositiveint(HapiFHIRHelpers.createpositiveInt(immunization.getImmPrtclppldDsNmbrPstvntPstvnt() /** { "tree" :"Immunization.protocolApplied.doseNumberPositiveint", "datatype" : "positiveInt", "cardinality" : "Required", "elementtree" : ["addProtocolApplied"] , "methodName" : "setDoseNumberPositiveint"} **/
						));
Immunizationobj.setDoseNumberString(HapiFHIRHelpers.createstring(immunization.getImmPrtclppldDsNmbrStrngStrng() /** { "tree" :"Immunization.protocolApplied.doseNumberString", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addProtocolApplied"] , "methodName" : "setDoseNumberString"} **/
						));
Immunizationobj.setSeriesDosesPositiveint(HapiFHIRHelpers.createpositiveInt(immunization.getImmPrtclppldSrsDssPstvntPstvnt() /** { "tree" :"Immunization.protocolApplied.seriesDosesPositiveint", "datatype" : "positiveInt", "cardinality" : "ZeroOne", "elementtree" : ["addProtocolApplied"] , "methodName" : "setSeriesDosesPositiveint"} **/
						));
Immunizationobj.setSeriesDosesString(HapiFHIRHelpers.createstring(immunization.getImmPrtclppldSrsDssStrngStrng() /** { "tree" :"Immunization.protocolApplied.seriesDosesString", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addProtocolApplied"] , "methodName" : "setSeriesDosesString"} **/
		));
	}
}
