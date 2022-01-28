package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Medicationstatement.
 * @see .Medicationstatement
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class MedicationstatementConversion 
{
	public Patient Medicationstatements(main.templateoutput.Model.Medicationstatement medicationstatement) 
	{
			Patient  Medicationstatementobj = new Patient(); 

						Medicationstatementobj.addIdentifier(HapiFHIRHelpers.createIdentifier(medicationstatement.getMdSttmntDntfrDntfrSe() /** { "tree" :"MedicationStatement.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, medicationstatement.getMdSttmntDntfrDntfrTpCcCSstm() /** { "tree" :"MedicationStatement.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, medicationstatement.getMdSttmntDntfrDntfrTpCcCVrsn() /** { "tree" :"MedicationStatement.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, medicationstatement.getMdSttmntDntfrDntfrTpCcCCde() /** { "tree" :"MedicationStatement.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, medicationstatement.getMdSttmntDntfrDntfrTpCcCDsplay() /** { "tree" :"MedicationStatement.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, medicationstatement.getMdSttmntDntfrDntfrTpCcCSrSlctd() /** { "tree" :"MedicationStatement.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, medicationstatement.getMdSttmntDntfrDntfrTpCcTxt() /** { "tree" :"MedicationStatement.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, medicationstatement.getMdSttmntDntfrDntfrPrdPrdStrt() /** { "tree" :"MedicationStatement.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, medicationstatement.getMdSttmntDntfrDntfrPrdPrdNd() /** { "tree" :"MedicationStatement.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, medicationstatement.getMdSttmntDntfrDntfrSsgnr() /** { "tree" :"MedicationStatement.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, medicationstatement.getMdSttmntDntfrDntfrVlue() /** { "tree" :"MedicationStatement.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, medicationstatement.getMdSttmntDntfrDntfrSstm() /** { "tree" :"MedicationStatement.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Medicationstatementobj.addBasedOn(HapiFHIRHelpers.createReference(medicationstatement.getMedStatementBasedOnReference() /** { "tree" :"MedicationStatement.basedOn", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addBasedOn"} **/
						));
Medicationstatementobj.addPartOf(HapiFHIRHelpers.createReference(medicationstatement.getMedStatementPartOfReference() /** { "tree" :"MedicationStatement.partOf", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPartOf"} **/
						));
Medicationstatementobj.setStatus(HapiFHIRHelpers.createcode(medicationstatement.getMedStatementStatusCode() /** { "tree" :"MedicationStatement.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Medicationstatementobj.addStatusReason(HapiFHIRHelpers.createCodeableConcept(medicationstatement.getMdSttmntSttsRsnCcCdngCSstm() /** { "tree" :"MedicationStatement.statusReason", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addStatusReason, addCoding, setSystem"} **/
						, medicationstatement.getMdSttmntSttsRsnCcCdngCVrsn() /** { "tree" :"MedicationStatement.statusReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addStatusReason, addCoding, setVersion"} **/
						, medicationstatement.getMdSttmntSttsRsnCcCdngCCde() /** { "tree" :"MedicationStatement.statusReason", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addStatusReason, addCoding, setCode"} **/
						, medicationstatement.getMdSttmntSttsRsnCcCdngCDsplay() /** { "tree" :"MedicationStatement.statusReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addStatusReason, addCoding, setDisplay"} **/
						, medicationstatement.getMdSttmntSttsRsnCcCdngCSrSlctd() /** { "tree" :"MedicationStatement.statusReason", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addStatusReason, addCoding, setUserSelected"} **/
						, medicationstatement.getMedStatementStatusReasonCcText() /** { "tree" :"MedicationStatement.statusReason", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addStatusReason, setText"} **/
						));
Medicationstatementobj.setCategory(HapiFHIRHelpers.createCodeableConcept(medicationstatement.getMdSttmntCtgrCcCdngCSstm() /** { "tree" :"MedicationStatement.category", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCategory, addCoding, setSystem"} **/
						, medicationstatement.getMdSttmntCtgrCcCdngCVrsn() /** { "tree" :"MedicationStatement.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCategory, addCoding, setVersion"} **/
						, medicationstatement.getMdSttmntCtgrCcCdngCCde() /** { "tree" :"MedicationStatement.category", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCategory, addCoding, setCode"} **/
						, medicationstatement.getMdSttmntCtgrCcCdngCDsplay() /** { "tree" :"MedicationStatement.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCategory, addCoding, setDisplay"} **/
						, medicationstatement.getMdSttmntCtgrCcCdngCSrSlctd() /** { "tree" :"MedicationStatement.category", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCategory, addCoding, setUserSelected"} **/
						, medicationstatement.getMedStatementCategoryCcText() /** { "tree" :"MedicationStatement.category", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCategory, setText"} **/
						));
Medicationstatementobj.setMedicationCodeableconcept(HapiFHIRHelpers.createCodeableConcept(medicationstatement.getMdSttmntMdCdblcncptCcCdngCSstm() /** { "tree" :"MedicationStatement.medicationCodeableconcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setMedicationCodeableconcept, addCoding, setSystem"} **/
						, medicationstatement.getMdSttmntMdCdblcncptCcCdngCVrsn() /** { "tree" :"MedicationStatement.medicationCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setMedicationCodeableconcept, addCoding, setVersion"} **/
						, medicationstatement.getMdSttmntMdCdblcncptCcCdngCCde() /** { "tree" :"MedicationStatement.medicationCodeableconcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setMedicationCodeableconcept, addCoding, setCode"} **/
						, medicationstatement.getMdSttmntMdCdblcncptCcCdngCDsplay() /** { "tree" :"MedicationStatement.medicationCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setMedicationCodeableconcept, addCoding, setDisplay"} **/
						, medicationstatement.getMdSttmntMdCdblcncptCcCdngCSrSlctd() /** { "tree" :"MedicationStatement.medicationCodeableconcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setMedicationCodeableconcept, addCoding, setUserSelected"} **/
						, medicationstatement.getMdSttmntMdCdblcncptCcTxt() /** { "tree" :"MedicationStatement.medicationCodeableconcept", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setMedicationCodeableconcept, setText"} **/
						));
Medicationstatementobj.setMedicationReference(medication)(HapiFHIRHelpers.createReference(medicationstatement.getMdSttmntMdRfrncRfrnce() /** { "tree" :"MedicationStatement.medicationReference", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setMedicationReference(medication)"} **/
						));
Medicationstatementobj.setSubject(HapiFHIRHelpers.createReference(medicationstatement.getMedStatementSubjectReference() /** { "tree" :"MedicationStatement.subject", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setSubject"} **/
						));
Medicationstatementobj.setContext(HapiFHIRHelpers.createReference(medicationstatement.getMedStatementContextReference() /** { "tree" :"MedicationStatement.context", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setContext"} **/
						));
Medicationstatementobj.setEffective(HapiFHIRHelpers.createdateTimetype(medicationstatement.getMdSttmntFfctvDttmDtTme() /** { "tree" :"MedicationStatement.effectiveDatetime", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectiveDatetime"} **/
						));
Medicationstatementobj.setEffectivePeriod(HapiFHIRHelpers.createPeriod(medicationstatement.getMdSttmntFfctvPrdPrdStrt() /** { "tree" :"MedicationStatement.effectivePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectivePeriod, setStart"} **/
						, medicationstatement.getMdSttmntFfctvPrdPrdNd() /** { "tree" :"MedicationStatement.effectivePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectivePeriod, setEnd"} **/
						));
Medicationstatementobj.setDateAsserted(HapiFHIRHelpers.createdateTime(medicationstatement.getMedStatementDateAssertedDateTime() /** { "tree" :"MedicationStatement.dateAsserted", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDateAsserted"} **/
						));
Medicationstatementobj.setInformationSource(HapiFHIRHelpers.createReference(medicationstatement.getMdSttmntNfrmtnSrcRfrnce() /** { "tree" :"MedicationStatement.informationSource", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setInformationSource"} **/
						));
Medicationstatementobj.addDerivedFrom(HapiFHIRHelpers.createReference(medicationstatement.getMedStatementDerivedFromReference() /** { "tree" :"MedicationStatement.derivedFrom", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDerivedFrom"} **/
						));
Medicationstatementobj.addReasonCode(HapiFHIRHelpers.createCodeableConcept(medicationstatement.getMdSttmntRsnCdCcCdngCSstm() /** { "tree" :"MedicationStatement.reasonCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setSystem"} **/
						, medicationstatement.getMdSttmntRsnCdCcCdngCVrsn() /** { "tree" :"MedicationStatement.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setVersion"} **/
						, medicationstatement.getMdSttmntRsnCdCcCdngCCde() /** { "tree" :"MedicationStatement.reasonCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setCode"} **/
						, medicationstatement.getMdSttmntRsnCdCcCdngCDsplay() /** { "tree" :"MedicationStatement.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setDisplay"} **/
						, medicationstatement.getMdSttmntRsnCdCcCdngCSrSlctd() /** { "tree" :"MedicationStatement.reasonCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setUserSelected"} **/
						, medicationstatement.getMedStatementReasonCodeCcText() /** { "tree" :"MedicationStatement.reasonCode", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, setText"} **/
						));
Medicationstatementobj.addReasonReference(HapiFHIRHelpers.createReference(medicationstatement.getMdSttmntRsnRfrncRfrnce() /** { "tree" :"MedicationStatement.reasonReference", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonReference"} **/
						));
Medicationstatementobj.addNote(HapiFHIRHelpers.createAnnotation(medicationstatement.getMedStatementNoteAnnotationTime() /** { "tree" :"MedicationStatement.note", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setTime"} **/
						, medicationstatement.getMedStatementNoteAnnotationText() /** { "tree" :"MedicationStatement.note", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setText"} **/
						, medicationstatement.getMdSttmntNtNnttnThrRfrnce() /** { "tree" :"MedicationStatement.note", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorReference"} **/
						, medicationstatement.getMdSttmntNtNnttnThrStrng() /** { "tree" :"MedicationStatement.note", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorString"} **/
						));
Medicationstatementobj.addDosage(HapiFHIRHelpers.createDosage(medicationstatement.getMedStatementDosageDosage() /** { "tree" :"MedicationStatement.dosage", "datatype" : "Dosage", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDosage"} **/
		));
	}
}
