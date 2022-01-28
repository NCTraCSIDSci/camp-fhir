package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class List.
 * @see .List
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class ListConversion 
{
	public Patient Lists(main.templateoutput.Model.List list) 
	{
			Patient  Listobj = new Patient(); 

						Listobj.addIdentifier(HapiFHIRHelpers.createIdentifier(list.getListIdentifierIdentifierUse() /** { "tree" :"List.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, list.getLstDntfrDntfrTpCcCSstm() /** { "tree" :"List.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, list.getLstDntfrDntfrTpCcCVrsn() /** { "tree" :"List.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, list.getLstDntfrDntfrTpCcCCde() /** { "tree" :"List.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, list.getLstDntfrDntfrTpCcCDsplay() /** { "tree" :"List.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, list.getLstDntfrDntfrTpCcCSrSlctd() /** { "tree" :"List.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, list.getLstDntfrDntfrTpCcTxt() /** { "tree" :"List.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, list.getLstDntfrDntfrPrdPrdStrt() /** { "tree" :"List.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, list.getLstDntfrDntfrPrdPrdNd() /** { "tree" :"List.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, list.getLstDntfrDntfrSsgnr() /** { "tree" :"List.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, list.getListIdentifierIdentifierValue() /** { "tree" :"List.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, list.getListIdentifierIdentifierSystem() /** { "tree" :"List.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Listobj.setStatus(HapiFHIRHelpers.createcode(list.getListStatusCode() /** { "tree" :"List.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Listobj.setMode(HapiFHIRHelpers.createcode(list.getListModeCode() /** { "tree" :"List.mode", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setMode"} **/
						));
Listobj.setTitle(HapiFHIRHelpers.createstring(list.getListTitleString() /** { "tree" :"List.title", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTitle"} **/
						));
Listobj.setCode(HapiFHIRHelpers.createCodeableConcept(list.getListCodeCcCodingCSystem() /** { "tree" :"List.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setSystem"} **/
						, list.getListCodeCcCodingCVersion() /** { "tree" :"List.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setVersion"} **/
						, list.getListCodeCcCodingCCode() /** { "tree" :"List.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setCode"} **/
						, list.getListCodeCcCodingCDisplay() /** { "tree" :"List.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, list.getListCodeCcCodingCUserSelected() /** { "tree" :"List.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, list.getListCodeCcText() /** { "tree" :"List.code", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, setText"} **/
						));
Listobj.setSubject(HapiFHIRHelpers.createReference(list.getListSubjectReference() /** { "tree" :"List.subject", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubject"} **/
						));
Listobj.setEncounter(HapiFHIRHelpers.createReference(list.getListEncounterReference() /** { "tree" :"List.encounter", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEncounter"} **/
						));
Listobj.setDate(HapiFHIRHelpers.createdateTime(list.getListDateDateTime() /** { "tree" :"List.date", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDate"} **/
						));
Listobj.setSource(HapiFHIRHelpers.createReference(list.getListSourceReference() /** { "tree" :"List.source", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSource"} **/
						));
Listobj.setOrderedBy(HapiFHIRHelpers.createCodeableConcept(list.getListOrderedByCcCodingCSystem() /** { "tree" :"List.orderedBy", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOrderedBy, addCoding, setSystem"} **/
						, list.getListOrderedByCcCodingCVersion() /** { "tree" :"List.orderedBy", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOrderedBy, addCoding, setVersion"} **/
						, list.getListOrderedByCcCodingCCode() /** { "tree" :"List.orderedBy", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOrderedBy, addCoding, setCode"} **/
						, list.getListOrderedByCcCodingCDisplay() /** { "tree" :"List.orderedBy", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOrderedBy, addCoding, setDisplay"} **/
						, list.getLstRdrdBCcCdngCSrSlctd() /** { "tree" :"List.orderedBy", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOrderedBy, addCoding, setUserSelected"} **/
						, list.getListOrderedByCcText() /** { "tree" :"List.orderedBy", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOrderedBy, setText"} **/
						));
Listobj.addNote(HapiFHIRHelpers.createAnnotation(list.getListNoteAnnotationTime() /** { "tree" :"List.note", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setTime"} **/
						, list.getListNoteAnnotationText() /** { "tree" :"List.note", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setText"} **/
						, list.getLstNtNnttnThrRfrnce() /** { "tree" :"List.note", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorReference"} **/
						, list.getListNoteAnnotationAuthorString() /** { "tree" :"List.note", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorString"} **/
						));
Listobj.setFlag(HapiFHIRHelpers.createCodeableConcept(list.getListEntryFlagCcCodingCSystem() /** { "tree" :"List.entry.flag", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addEntry"] , "methodName" : "setFlag, addCoding, setSystem"} **/
						, list.getLstNtrFlgCcCdngCVrsn() /** { "tree" :"List.entry.flag", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addEntry"] , "methodName" : "setFlag, addCoding, setVersion"} **/
						, list.getListEntryFlagCcCodingCCode() /** { "tree" :"List.entry.flag", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addEntry"] , "methodName" : "setFlag, addCoding, setCode"} **/
						, list.getLstNtrFlgCcCdngCDsplay() /** { "tree" :"List.entry.flag", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addEntry"] , "methodName" : "setFlag, addCoding, setDisplay"} **/
						, list.getLstNtrFlgCcCdngCSrSlctd() /** { "tree" :"List.entry.flag", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addEntry"] , "methodName" : "setFlag, addCoding, setUserSelected"} **/
						, list.getListEntryFlagCcText() /** { "tree" :"List.entry.flag", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addEntry"] , "methodName" : "setFlag, setText"} **/
						));
Listobj.setDeleted(HapiFHIRHelpers.createboolean(list.getListEntryDeletedBoolean() /** { "tree" :"List.entry.deleted", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addEntry"] , "methodName" : "setDeleted"} **/
						));
Listobj.setDate(HapiFHIRHelpers.createdateTime(list.getListEntryDateDateTime() /** { "tree" :"List.entry.date", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addEntry"] , "methodName" : "setDate"} **/
						));
Listobj.setItem(HapiFHIRHelpers.createReference(list.getListEntryItemReference() /** { "tree" :"List.entry.item", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addEntry"] , "methodName" : "setItem"} **/
						));
Listobj.setEmptyReason(HapiFHIRHelpers.createCodeableConcept(list.getLstMptRsnCcCdngCSstm() /** { "tree" :"List.emptyReason", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEmptyReason, addCoding, setSystem"} **/
						, list.getLstMptRsnCcCdngCVrsn() /** { "tree" :"List.emptyReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEmptyReason, addCoding, setVersion"} **/
						, list.getListEmptyReasonCcCodingCCode() /** { "tree" :"List.emptyReason", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEmptyReason, addCoding, setCode"} **/
						, list.getLstMptRsnCcCdngCDsplay() /** { "tree" :"List.emptyReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEmptyReason, addCoding, setDisplay"} **/
						, list.getLstMptRsnCcCdngCSrSlctd() /** { "tree" :"List.emptyReason", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEmptyReason, addCoding, setUserSelected"} **/
						, list.getListEmptyReasonCcText() /** { "tree" :"List.emptyReason", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEmptyReason, setText"} **/
		));
	}
}
