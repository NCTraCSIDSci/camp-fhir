package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Medicationdispense.
 * @see .Medicationdispense
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class MedicationdispenseConversion 
{
	public Patient Medicationdispenses(main.templateoutput.Model.Medicationdispense medicationdispense) 
	{
			Patient  Medicationdispenseobj = new Patient(); 

						Medicationdispenseobj.addIdentifier(HapiFHIRHelpers.createIdentifier(medicationdispense.getMdDspnsDntfrDntfrSe() /** { "tree" :"MedicationDispense.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, medicationdispense.getMdDspnsDntfrDntfrTpCcCSstm() /** { "tree" :"MedicationDispense.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, medicationdispense.getMdDspnsDntfrDntfrTpCcCVrsn() /** { "tree" :"MedicationDispense.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, medicationdispense.getMdDspnsDntfrDntfrTpCcCCde() /** { "tree" :"MedicationDispense.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, medicationdispense.getMdDspnsDntfrDntfrTpCcCDsplay() /** { "tree" :"MedicationDispense.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, medicationdispense.getMdDspnsDntfrDntfrTpCcCSrSlctd() /** { "tree" :"MedicationDispense.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, medicationdispense.getMdDspnsDntfrDntfrTpCcTxt() /** { "tree" :"MedicationDispense.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, medicationdispense.getMdDspnsDntfrDntfrPrdPrdStrt() /** { "tree" :"MedicationDispense.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, medicationdispense.getMdDspnsDntfrDntfrPrdPrdNd() /** { "tree" :"MedicationDispense.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, medicationdispense.getMdDspnsDntfrDntfrSsgnr() /** { "tree" :"MedicationDispense.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, medicationdispense.getMdDspnsDntfrDntfrVlue() /** { "tree" :"MedicationDispense.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, medicationdispense.getMdDspnsDntfrDntfrSstm() /** { "tree" :"MedicationDispense.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Medicationdispenseobj.addPartOf(HapiFHIRHelpers.createReference(medicationdispense.getMedDispensePartOfReference() /** { "tree" :"MedicationDispense.partOf", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPartOf"} **/
						));
Medicationdispenseobj.setStatus(HapiFHIRHelpers.createcode(medicationdispense.getMedDispenseStatusCode() /** { "tree" :"MedicationDispense.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Medicationdispenseobj.setStatusReasonCodeableconcept(HapiFHIRHelpers.createCodeableConcept(medicationdispense.getMdDspnsSttsRsnCdblcncptCcCdngCSstm() /** { "tree" :"MedicationDispense.statusReasonCodeableconcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReasonCodeableconcept, addCoding, setSystem"} **/
						, medicationdispense.getMdDspnsSttsRsnCdblcncptCcCdngCVrsn() /** { "tree" :"MedicationDispense.statusReasonCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReasonCodeableconcept, addCoding, setVersion"} **/
						, medicationdispense.getMdDspnsSttsRsnCdblcncptCcCdngCCde() /** { "tree" :"MedicationDispense.statusReasonCodeableconcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReasonCodeableconcept, addCoding, setCode"} **/
						, medicationdispense.getMdDspnsSttsRsnCdblcncptCcCdngCDsplay() /** { "tree" :"MedicationDispense.statusReasonCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReasonCodeableconcept, addCoding, setDisplay"} **/
						, medicationdispense.getMdDspnsSttsRsnCdblcncptCcCdngCSrSlctd() /** { "tree" :"MedicationDispense.statusReasonCodeableconcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReasonCodeableconcept, addCoding, setUserSelected"} **/
						, medicationdispense.getMdDspnsSttsRsnCdblcncptCcTxt() /** { "tree" :"MedicationDispense.statusReasonCodeableconcept", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReasonCodeableconcept, setText"} **/
						));
Medicationdispenseobj.setStatusReasonReference(detectedissue)(HapiFHIRHelpers.createReference(medicationdispense.getMdDspnsSttsRsnRfrncRfrnce() /** { "tree" :"MedicationDispense.statusReasonReference", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatusReasonReference(detectedissue)"} **/
						));
Medicationdispenseobj.setCategory(HapiFHIRHelpers.createCodeableConcept(medicationdispense.getMdDspnsCtgrCcCdngCSstm() /** { "tree" :"MedicationDispense.category", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCategory, addCoding, setSystem"} **/
						, medicationdispense.getMdDspnsCtgrCcCdngCVrsn() /** { "tree" :"MedicationDispense.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCategory, addCoding, setVersion"} **/
						, medicationdispense.getMdDspnsCtgrCcCdngCCde() /** { "tree" :"MedicationDispense.category", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCategory, addCoding, setCode"} **/
						, medicationdispense.getMdDspnsCtgrCcCdngCDsplay() /** { "tree" :"MedicationDispense.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCategory, addCoding, setDisplay"} **/
						, medicationdispense.getMdDspnsCtgrCcCdngCSrSlctd() /** { "tree" :"MedicationDispense.category", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCategory, addCoding, setUserSelected"} **/
						, medicationdispense.getMedDispenseCategoryCcText() /** { "tree" :"MedicationDispense.category", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCategory, setText"} **/
						));
Medicationdispenseobj.setMedicationCodeableconcept(HapiFHIRHelpers.createCodeableConcept(medicationdispense.getMdDspnsMdCdblcncptCcCdngCSstm() /** { "tree" :"MedicationDispense.medicationCodeableconcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setMedicationCodeableconcept, addCoding, setSystem"} **/
						, medicationdispense.getMdDspnsMdCdblcncptCcCdngCVrsn() /** { "tree" :"MedicationDispense.medicationCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setMedicationCodeableconcept, addCoding, setVersion"} **/
						, medicationdispense.getMdDspnsMdCdblcncptCcCdngCCde() /** { "tree" :"MedicationDispense.medicationCodeableconcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setMedicationCodeableconcept, addCoding, setCode"} **/
						, medicationdispense.getMdDspnsMdCdblcncptCcCdngCDsplay() /** { "tree" :"MedicationDispense.medicationCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setMedicationCodeableconcept, addCoding, setDisplay"} **/
						, medicationdispense.getMdDspnsMdCdblcncptCcCdngCSrSlctd() /** { "tree" :"MedicationDispense.medicationCodeableconcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setMedicationCodeableconcept, addCoding, setUserSelected"} **/
						, medicationdispense.getMdDspnsMdCdblcncptCcTxt() /** { "tree" :"MedicationDispense.medicationCodeableconcept", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setMedicationCodeableconcept, setText"} **/
						));
Medicationdispenseobj.setMedicationReference(medication)(HapiFHIRHelpers.createReference(medicationdispense.getMedDispenseMedReferenceReference() /** { "tree" :"MedicationDispense.medicationReference", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setMedicationReference(medication)"} **/
						));
Medicationdispenseobj.setSubject(HapiFHIRHelpers.createReference(medicationdispense.getMedDispenseSubjectReference() /** { "tree" :"MedicationDispense.subject", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubject"} **/
						));
Medicationdispenseobj.setContext(HapiFHIRHelpers.createReference(medicationdispense.getMedDispenseContextReference() /** { "tree" :"MedicationDispense.context", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setContext"} **/
						));
Medicationdispenseobj.addSupportingInformation(HapiFHIRHelpers.createReference(medicationdispense.getMdDspnsSpprtngnfrmtnRfrnce() /** { "tree" :"MedicationDispense.supportingInformation", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSupportingInformation"} **/
						));
Medicationdispenseobj.setFunction(HapiFHIRHelpers.createCodeableConcept(medicationdispense.getMdDspnsPrfrmrFnctnCcCdngCSstm() /** { "tree" :"MedicationDispense.performer.function", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addPerformer"] , "methodName" : "setFunction, addCoding, setSystem"} **/
						, medicationdispense.getMdDspnsPrfrmrFnctnCcCdngCVrsn() /** { "tree" :"MedicationDispense.performer.function", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addPerformer"] , "methodName" : "setFunction, addCoding, setVersion"} **/
						, medicationdispense.getMdDspnsPrfrmrFnctnCcCdngCCde() /** { "tree" :"MedicationDispense.performer.function", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addPerformer"] , "methodName" : "setFunction, addCoding, setCode"} **/
						, medicationdispense.getMdDspnsPrfrmrFnctnCcCdngCDsplay() /** { "tree" :"MedicationDispense.performer.function", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addPerformer"] , "methodName" : "setFunction, addCoding, setDisplay"} **/
						, medicationdispense.getMdDspnsPrfrmrFnctnCcCdngCSrSlctd() /** { "tree" :"MedicationDispense.performer.function", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addPerformer"] , "methodName" : "setFunction, addCoding, setUserSelected"} **/
						, medicationdispense.getMdDspnsPrfrmrFnctnCcTxt() /** { "tree" :"MedicationDispense.performer.function", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addPerformer"] , "methodName" : "setFunction, setText"} **/
						));
Medicationdispenseobj.setActor(HapiFHIRHelpers.createReference(medicationdispense.getMdDspnsPrfrmrCtrRfrnce() /** { "tree" :"MedicationDispense.performer.actor", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addPerformer"] , "methodName" : "setActor"} **/
						));
Medicationdispenseobj.setLocation(HapiFHIRHelpers.createReference(medicationdispense.getMedDispenseLocationReference() /** { "tree" :"MedicationDispense.location", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setLocation"} **/
						));
Medicationdispenseobj.addAuthorizingPrescription(HapiFHIRHelpers.createReference(medicationdispense.getMdDspnsThrzngPrscrptnRfrnce() /** { "tree" :"MedicationDispense.authorizingPrescription", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAuthorizingPrescription"} **/
						));
Medicationdispenseobj.setType(HapiFHIRHelpers.createCodeableConcept(medicationdispense.getMdDspnsTpCcCdngCSstm() /** { "tree" :"MedicationDispense.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setSystem"} **/
						, medicationdispense.getMdDspnsTpCcCdngCVrsn() /** { "tree" :"MedicationDispense.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setVersion"} **/
						, medicationdispense.getMedDispenseTypeCcCodingCCode() /** { "tree" :"MedicationDispense.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setCode"} **/
						, medicationdispense.getMdDspnsTpCcCdngCDsplay() /** { "tree" :"MedicationDispense.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setDisplay"} **/
						, medicationdispense.getMdDspnsTpCcCdngCSrSlctd() /** { "tree" :"MedicationDispense.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, medicationdispense.getMedDispenseTypeCcText() /** { "tree" :"MedicationDispense.type", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, setText"} **/
						));
Medicationdispenseobj.setQuantity(HapiFHIRHelpers.createSimpleQuantity(medicationdispense.getMdDspnsQnttSmplQntty() /** { "tree" :"MedicationDispense.quantity", "datatype" : "SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setQuantity"} **/
						));
Medicationdispenseobj.setDaysSupply(HapiFHIRHelpers.createSimpleQuantity(medicationdispense.getMdDspnsDsSpplSmplQntty() /** { "tree" :"MedicationDispense.daysSupply", "datatype" : "SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDaysSupply"} **/
						));
Medicationdispenseobj.setWhenPrepared(HapiFHIRHelpers.createdateTime(medicationdispense.getMedDispenseWhenPreparedDateTime() /** { "tree" :"MedicationDispense.whenPrepared", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setWhenPrepared"} **/
						));
Medicationdispenseobj.setWhenHandedOver(HapiFHIRHelpers.createdateTime(medicationdispense.getMdDspnsWhnHnddvrDtTme() /** { "tree" :"MedicationDispense.whenHandedOver", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setWhenHandedOver"} **/
						));
Medicationdispenseobj.setDestination(HapiFHIRHelpers.createReference(medicationdispense.getMedDispenseDestinationReference() /** { "tree" :"MedicationDispense.destination", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDestination"} **/
						));
Medicationdispenseobj.addReceiver(HapiFHIRHelpers.createReference(medicationdispense.getMedDispenseReceiverReference() /** { "tree" :"MedicationDispense.receiver", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReceiver"} **/
						));
Medicationdispenseobj.addNote(HapiFHIRHelpers.createAnnotation(medicationdispense.getMedDispenseNoteAnnotationTime() /** { "tree" :"MedicationDispense.note", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setTime"} **/
						, medicationdispense.getMedDispenseNoteAnnotationText() /** { "tree" :"MedicationDispense.note", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setText"} **/
						, medicationdispense.getMdDspnsNtNnttnThrRfrnce() /** { "tree" :"MedicationDispense.note", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorReference"} **/
						, medicationdispense.getMdDspnsNtNnttnThrStrng() /** { "tree" :"MedicationDispense.note", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorString"} **/
						));
Medicationdispenseobj.addDosageInstruction(HapiFHIRHelpers.createDosage(medicationdispense.getMdDspnsDsgnstrctnDsge() /** { "tree" :"MedicationDispense.dosageInstruction", "datatype" : "Dosage", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDosageInstruction"} **/
						));
Medicationdispenseobj.setWasSubstituted(HapiFHIRHelpers.createboolean(medicationdispense.getMdDspnsSbstttnWsSbstttdBln() /** { "tree" :"MedicationDispense.substitution.wasSubstituted", "datatype" : "boolean", "cardinality" : "Required", "elementtree" : ["setSubstitution"] , "methodName" : "setWasSubstituted"} **/
						));
Medicationdispenseobj.setType(HapiFHIRHelpers.createCodeableConcept(medicationdispense.getMdDspnsSbstttnTpCcCdngCSstm() /** { "tree" :"MedicationDispense.substitution.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["setSubstitution"] , "methodName" : "setType, addCoding, setSystem"} **/
						, medicationdispense.getMdDspnsSbstttnTpCcCdngCVrsn() /** { "tree" :"MedicationDispense.substitution.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setSubstitution"] , "methodName" : "setType, addCoding, setVersion"} **/
						, medicationdispense.getMdDspnsSbstttnTpCcCdngCCde() /** { "tree" :"MedicationDispense.substitution.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["setSubstitution"] , "methodName" : "setType, addCoding, setCode"} **/
						, medicationdispense.getMdDspnsSbstttnTpCcCdngCDsplay() /** { "tree" :"MedicationDispense.substitution.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setSubstitution"] , "methodName" : "setType, addCoding, setDisplay"} **/
						, medicationdispense.getMdDspnsSbstttnTpCcCdngCSrSlctd() /** { "tree" :"MedicationDispense.substitution.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["setSubstitution"] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, medicationdispense.getMdDspnsSbstttnTpCcTxt() /** { "tree" :"MedicationDispense.substitution.type", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["setSubstitution"] , "methodName" : "setType, setText"} **/
						));
Medicationdispenseobj.addReason(HapiFHIRHelpers.createCodeableConcept(medicationdispense.getMdDspnsSbstttnRsnCcCdngCSstm() /** { "tree" :"MedicationDispense.substitution.reason", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["setSubstitution"] , "methodName" : "addReason, addCoding, setSystem"} **/
						, medicationdispense.getMdDspnsSbstttnRsnCcCdngCVrsn() /** { "tree" :"MedicationDispense.substitution.reason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["setSubstitution"] , "methodName" : "addReason, addCoding, setVersion"} **/
						, medicationdispense.getMdDspnsSbstttnRsnCcCdngCCde() /** { "tree" :"MedicationDispense.substitution.reason", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["setSubstitution"] , "methodName" : "addReason, addCoding, setCode"} **/
						, medicationdispense.getMdDspnsSbstttnRsnCcCdngCDsplay() /** { "tree" :"MedicationDispense.substitution.reason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["setSubstitution"] , "methodName" : "addReason, addCoding, setDisplay"} **/
						, medicationdispense.getMdDspnsSbstttnRsnCcCdngCSrSlctd() /** { "tree" :"MedicationDispense.substitution.reason", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["setSubstitution"] , "methodName" : "addReason, addCoding, setUserSelected"} **/
						, medicationdispense.getMdDspnsSbstttnRsnCcTxt() /** { "tree" :"MedicationDispense.substitution.reason", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["setSubstitution"] , "methodName" : "addReason, setText"} **/
						));
Medicationdispenseobj.addResponsibleParty(HapiFHIRHelpers.createReference(medicationdispense.getMdDspnsSbstttnRspnsblPrtRfrnce() /** { "tree" :"MedicationDispense.substitution.responsibleParty", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : ["setSubstitution"] , "methodName" : "addResponsibleParty"} **/
						));
Medicationdispenseobj.addDetectedIssue(HapiFHIRHelpers.createReference(medicationdispense.getMdDspnsDtctdssRfrnce() /** { "tree" :"MedicationDispense.detectedIssue", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDetectedIssue"} **/
						));
Medicationdispenseobj.addEventHistory(HapiFHIRHelpers.createReference(medicationdispense.getMedDispenseEventHistoryReference() /** { "tree" :"MedicationDispense.eventHistory", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEventHistory"} **/
		));
	}
}
