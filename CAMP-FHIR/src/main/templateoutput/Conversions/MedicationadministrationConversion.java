package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Medicationadministration.
 * @see .Medicationadministration
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class MedicationadministrationConversion 
{
	public Patient Medicationadministrations(main.templateoutput.Model.Medicationadministration medicationadministration) 
	{
			Patient  Medicationadministrationobj = new Patient(); 

						Medicationadministrationobj.addIdentifier(HapiFHIRHelpers.createIdentifier(medicationadministration.getMedadminIdentifierIdentifierUse() /** { "tree" :"MedicationAdministration.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, medicationadministration.getMddmnDntfrDntfrTpCcCSstm() /** { "tree" :"MedicationAdministration.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, medicationadministration.getMddmnDntfrDntfrTpCcCVrsn() /** { "tree" :"MedicationAdministration.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, medicationadministration.getMddmnDntfrDntfrTpCcCCde() /** { "tree" :"MedicationAdministration.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, medicationadministration.getMddmnDntfrDntfrTpCcCDsplay() /** { "tree" :"MedicationAdministration.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, medicationadministration.getMddmnDntfrDntfrTpCcCSrSlctd() /** { "tree" :"MedicationAdministration.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, medicationadministration.getMddmnDntfrDntfrTpCcTxt() /** { "tree" :"MedicationAdministration.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, medicationadministration.getMddmnDntfrDntfrPrdPrdStrt() /** { "tree" :"MedicationAdministration.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, medicationadministration.getMddmnDntfrDntfrPrdPrdNd() /** { "tree" :"MedicationAdministration.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, medicationadministration.getMddmnDntfrDntfrSsgnr() /** { "tree" :"MedicationAdministration.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, medicationadministration.getMddmnDntfrDntfrVlue() /** { "tree" :"MedicationAdministration.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, medicationadministration.getMddmnDntfrDntfrSstm() /** { "tree" :"MedicationAdministration.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Medicationadministrationobj.addInstantiates(HapiFHIRHelpers.createuri(medicationadministration.getMedadminInstantiatesUri() /** { "tree" :"MedicationAdministration.instantiates", "datatype" : "uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addInstantiates"} **/
						));
Medicationadministrationobj.addPartOf(HapiFHIRHelpers.createReference(medicationadministration.getMedadminPartOfReference() /** { "tree" :"MedicationAdministration.partOf", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPartOf"} **/
						));
Medicationadministrationobj.setStatus(HapiFHIRHelpers.createcode(medicationadministration.getMedadminStatusCode() /** { "tree" :"MedicationAdministration.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Medicationadministrationobj.addStatusReason(HapiFHIRHelpers.createCodeableConcept(medicationadministration.getMddmnSttsRsnCcCdngCSstm() /** { "tree" :"MedicationAdministration.statusReason", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addStatusReason, addCoding, setSystem"} **/
						, medicationadministration.getMddmnSttsRsnCcCdngCVrsn() /** { "tree" :"MedicationAdministration.statusReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addStatusReason, addCoding, setVersion"} **/
						, medicationadministration.getMddmnSttsRsnCcCdngCCde() /** { "tree" :"MedicationAdministration.statusReason", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addStatusReason, addCoding, setCode"} **/
						, medicationadministration.getMddmnSttsRsnCcCdngCDsplay() /** { "tree" :"MedicationAdministration.statusReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addStatusReason, addCoding, setDisplay"} **/
						, medicationadministration.getMddmnSttsRsnCcCdngCSrSlctd() /** { "tree" :"MedicationAdministration.statusReason", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addStatusReason, addCoding, setUserSelected"} **/
						, medicationadministration.getMedadminStatusReasonCcText() /** { "tree" :"MedicationAdministration.statusReason", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addStatusReason, setText"} **/
						));
Medicationadministrationobj.setCategory(HapiFHIRHelpers.createCodeableConcept(medicationadministration.getMddmnCtgrCcCdngCSstm() /** { "tree" :"MedicationAdministration.category", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCategory, addCoding, setSystem"} **/
						, medicationadministration.getMddmnCtgrCcCdngCVrsn() /** { "tree" :"MedicationAdministration.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCategory, addCoding, setVersion"} **/
						, medicationadministration.getMedadminCategoryCcCodingCCode() /** { "tree" :"MedicationAdministration.category", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCategory, addCoding, setCode"} **/
						, medicationadministration.getMddmnCtgrCcCdngCDsplay() /** { "tree" :"MedicationAdministration.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCategory, addCoding, setDisplay"} **/
						, medicationadministration.getMddmnCtgrCcCdngCSrSlctd() /** { "tree" :"MedicationAdministration.category", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCategory, addCoding, setUserSelected"} **/
						, medicationadministration.getMedadminCategoryCcText() /** { "tree" :"MedicationAdministration.category", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCategory, setText"} **/
						));
Medicationadministrationobj.setMedicationCodeableconcept(HapiFHIRHelpers.createCodeableConcept(medicationadministration.getMddmnMdCdblcncptCcCdngCSstm() /** { "tree" :"MedicationAdministration.medicationCodeableconcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setMedicationCodeableconcept, addCoding, setSystem"} **/
						, medicationadministration.getMddmnMdCdblcncptCcCdngCVrsn() /** { "tree" :"MedicationAdministration.medicationCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setMedicationCodeableconcept, addCoding, setVersion"} **/
						, medicationadministration.getMddmnMdCdblcncptCcCdngCCde() /** { "tree" :"MedicationAdministration.medicationCodeableconcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setMedicationCodeableconcept, addCoding, setCode"} **/
						, medicationadministration.getMddmnMdCdblcncptCcCdngCDsplay() /** { "tree" :"MedicationAdministration.medicationCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setMedicationCodeableconcept, addCoding, setDisplay"} **/
						, medicationadministration.getMddmnMdCdblcncptCcCdngCSrSlctd() /** { "tree" :"MedicationAdministration.medicationCodeableconcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setMedicationCodeableconcept, addCoding, setUserSelected"} **/
						, medicationadministration.getMddmnMdCdblcncptCcTxt() /** { "tree" :"MedicationAdministration.medicationCodeableconcept", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setMedicationCodeableconcept, setText"} **/
						));
Medicationadministrationobj.setMedicationReference(medication)(HapiFHIRHelpers.createReference(medicationadministration.getMedadminMedReferenceReference() /** { "tree" :"MedicationAdministration.medicationReference", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setMedicationReference(medication)"} **/
						));
Medicationadministrationobj.setSubject(HapiFHIRHelpers.createReference(medicationadministration.getMedadminSubjectReference() /** { "tree" :"MedicationAdministration.subject", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setSubject"} **/
						));
Medicationadministrationobj.setContext(HapiFHIRHelpers.createReference(medicationadministration.getMedadminContextReference() /** { "tree" :"MedicationAdministration.context", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setContext"} **/
						));
Medicationadministrationobj.addSupportingInformation(HapiFHIRHelpers.createReference(medicationadministration.getMddmnSpprtngnfrmtnRfrnce() /** { "tree" :"MedicationAdministration.supportingInformation", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSupportingInformation"} **/
						));
Medicationadministrationobj.setEffective(HapiFHIRHelpers.createdateTimetype(medicationadministration.getMddmnFfctvDttmDtTme() /** { "tree" :"MedicationAdministration.effectiveDatetime", "datatype" : "dateTime", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setEffectiveDatetime"} **/
						));
Medicationadministrationobj.setEffectivePeriod(HapiFHIRHelpers.createPeriod(medicationadministration.getMddmnFfctvPrdPrdStrt() /** { "tree" :"MedicationAdministration.effectivePeriod", "datatype" : "Period, dateTime", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setEffectivePeriod, setStart"} **/
						, medicationadministration.getMddmnFfctvPrdPrdNd() /** { "tree" :"MedicationAdministration.effectivePeriod", "datatype" : "Period, dateTime", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setEffectivePeriod, setEnd"} **/
						));
Medicationadministrationobj.setFunction(HapiFHIRHelpers.createCodeableConcept(medicationadministration.getMddmnPrfrmrFnctnCcCdngCSstm() /** { "tree" :"MedicationAdministration.performer.function", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addPerformer"] , "methodName" : "setFunction, addCoding, setSystem"} **/
						, medicationadministration.getMddmnPrfrmrFnctnCcCdngCVrsn() /** { "tree" :"MedicationAdministration.performer.function", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addPerformer"] , "methodName" : "setFunction, addCoding, setVersion"} **/
						, medicationadministration.getMddmnPrfrmrFnctnCcCdngCCde() /** { "tree" :"MedicationAdministration.performer.function", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addPerformer"] , "methodName" : "setFunction, addCoding, setCode"} **/
						, medicationadministration.getMddmnPrfrmrFnctnCcCdngCDsplay() /** { "tree" :"MedicationAdministration.performer.function", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addPerformer"] , "methodName" : "setFunction, addCoding, setDisplay"} **/
						, medicationadministration.getMddmnPrfrmrFnctnCcCdngCSrSlctd() /** { "tree" :"MedicationAdministration.performer.function", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addPerformer"] , "methodName" : "setFunction, addCoding, setUserSelected"} **/
						, medicationadministration.getMddmnPrfrmrFnctnCcTxt() /** { "tree" :"MedicationAdministration.performer.function", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addPerformer"] , "methodName" : "setFunction, setText"} **/
						));
Medicationadministrationobj.setActor(HapiFHIRHelpers.createReference(medicationadministration.getMedadminPerformerActorReference() /** { "tree" :"MedicationAdministration.performer.actor", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addPerformer"] , "methodName" : "setActor"} **/
						));
Medicationadministrationobj.addReasonCode(HapiFHIRHelpers.createCodeableConcept(medicationadministration.getMddmnRsnCdCcCdngCSstm() /** { "tree" :"MedicationAdministration.reasonCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setSystem"} **/
						, medicationadministration.getMddmnRsnCdCcCdngCVrsn() /** { "tree" :"MedicationAdministration.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setVersion"} **/
						, medicationadministration.getMddmnRsnCdCcCdngCCde() /** { "tree" :"MedicationAdministration.reasonCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setCode"} **/
						, medicationadministration.getMddmnRsnCdCcCdngCDsplay() /** { "tree" :"MedicationAdministration.reasonCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setDisplay"} **/
						, medicationadministration.getMddmnRsnCdCcCdngCSrSlctd() /** { "tree" :"MedicationAdministration.reasonCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, addCoding, setUserSelected"} **/
						, medicationadministration.getMedadminReasonCodeCcText() /** { "tree" :"MedicationAdministration.reasonCode", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonCode, setText"} **/
						));
Medicationadministrationobj.addReasonReference(HapiFHIRHelpers.createReference(medicationadministration.getMedadminReasonReferenceReference() /** { "tree" :"MedicationAdministration.reasonReference", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReasonReference"} **/
						));
Medicationadministrationobj.setRequest(HapiFHIRHelpers.createReference(medicationadministration.getMedadminRequestReference() /** { "tree" :"MedicationAdministration.request", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setRequest"} **/
						));
Medicationadministrationobj.addDevice(HapiFHIRHelpers.createReference(medicationadministration.getMedadminDeviceReference() /** { "tree" :"MedicationAdministration.device", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDevice"} **/
						));
Medicationadministrationobj.addNote(HapiFHIRHelpers.createAnnotation(medicationadministration.getMedadminNoteAnnotationTime() /** { "tree" :"MedicationAdministration.note", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setTime"} **/
						, medicationadministration.getMedadminNoteAnnotationText() /** { "tree" :"MedicationAdministration.note", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setText"} **/
						, medicationadministration.getMddmnNtNnttnThrRfrnce() /** { "tree" :"MedicationAdministration.note", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorReference"} **/
						, medicationadministration.getMddmnNtNnttnThrStrng() /** { "tree" :"MedicationAdministration.note", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorString"} **/
						));
Medicationadministrationobj.setText(HapiFHIRHelpers.createstring(medicationadministration.getMedadminDosageTextString() /** { "tree" :"MedicationAdministration.dosage.text", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setDosage"] , "methodName" : "setText"} **/
						));
Medicationadministrationobj.setSite(HapiFHIRHelpers.createCodeableConcept(medicationadministration.getMddmnDsgStCcCdngCSstm() /** { "tree" :"MedicationAdministration.dosage.site", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["setDosage"] , "methodName" : "setSite, addCoding, setSystem"} **/
						, medicationadministration.getMddmnDsgStCcCdngCVrsn() /** { "tree" :"MedicationAdministration.dosage.site", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setDosage"] , "methodName" : "setSite, addCoding, setVersion"} **/
						, medicationadministration.getMddmnDsgStCcCdngCCde() /** { "tree" :"MedicationAdministration.dosage.site", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["setDosage"] , "methodName" : "setSite, addCoding, setCode"} **/
						, medicationadministration.getMddmnDsgStCcCdngCDsplay() /** { "tree" :"MedicationAdministration.dosage.site", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setDosage"] , "methodName" : "setSite, addCoding, setDisplay"} **/
						, medicationadministration.getMddmnDsgStCcCdngCSrSlctd() /** { "tree" :"MedicationAdministration.dosage.site", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["setDosage"] , "methodName" : "setSite, addCoding, setUserSelected"} **/
						, medicationadministration.getMedadminDosageSiteCcText() /** { "tree" :"MedicationAdministration.dosage.site", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["setDosage"] , "methodName" : "setSite, setText"} **/
						));
Medicationadministrationobj.setRoute(HapiFHIRHelpers.createCodeableConcept(medicationadministration.getMddmnDsgRtCcCdngCSstm() /** { "tree" :"MedicationAdministration.dosage.route", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["setDosage"] , "methodName" : "setRoute, addCoding, setSystem"} **/
						, medicationadministration.getMddmnDsgRtCcCdngCVrsn() /** { "tree" :"MedicationAdministration.dosage.route", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setDosage"] , "methodName" : "setRoute, addCoding, setVersion"} **/
						, medicationadministration.getMddmnDsgRtCcCdngCCde() /** { "tree" :"MedicationAdministration.dosage.route", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["setDosage"] , "methodName" : "setRoute, addCoding, setCode"} **/
						, medicationadministration.getMddmnDsgRtCcCdngCDsplay() /** { "tree" :"MedicationAdministration.dosage.route", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setDosage"] , "methodName" : "setRoute, addCoding, setDisplay"} **/
						, medicationadministration.getMddmnDsgRtCcCdngCSrSlctd() /** { "tree" :"MedicationAdministration.dosage.route", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["setDosage"] , "methodName" : "setRoute, addCoding, setUserSelected"} **/
						, medicationadministration.getMedadminDosageRouteCcText() /** { "tree" :"MedicationAdministration.dosage.route", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["setDosage"] , "methodName" : "setRoute, setText"} **/
						));
Medicationadministrationobj.setMethod(HapiFHIRHelpers.createCodeableConcept(medicationadministration.getMddmnDsgMthdCcCdngCSstm() /** { "tree" :"MedicationAdministration.dosage.method", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["setDosage"] , "methodName" : "setMethod, addCoding, setSystem"} **/
						, medicationadministration.getMddmnDsgMthdCcCdngCVrsn() /** { "tree" :"MedicationAdministration.dosage.method", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setDosage"] , "methodName" : "setMethod, addCoding, setVersion"} **/
						, medicationadministration.getMddmnDsgMthdCcCdngCCde() /** { "tree" :"MedicationAdministration.dosage.method", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["setDosage"] , "methodName" : "setMethod, addCoding, setCode"} **/
						, medicationadministration.getMddmnDsgMthdCcCdngCDsplay() /** { "tree" :"MedicationAdministration.dosage.method", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["setDosage"] , "methodName" : "setMethod, addCoding, setDisplay"} **/
						, medicationadministration.getMddmnDsgMthdCcCdngCSrSlctd() /** { "tree" :"MedicationAdministration.dosage.method", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["setDosage"] , "methodName" : "setMethod, addCoding, setUserSelected"} **/
						, medicationadministration.getMedadminDosageMethodCcText() /** { "tree" :"MedicationAdministration.dosage.method", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["setDosage"] , "methodName" : "setMethod, setText"} **/
						));
Medicationadministrationobj.setDose(HapiFHIRHelpers.createSimpleQuantity(medicationadministration.getMddmnDsgDsSmplQntty() /** { "tree" :"MedicationAdministration.dosage.dose", "datatype" : "SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["setDosage"] , "methodName" : "setDose"} **/
						));
Medicationadministrationobj.setRateRatio(HapiFHIRHelpers.createRatio(medicationadministration.getMddmnDsgRtRtRtNmrtrQnttVlue() /** { "tree" :"MedicationAdministration.dosage.rateRatio", "datatype" : "Ratio, Quantity, decimal", "cardinality" : "ZeroOne", "elementtree" : ["setDosage"] , "methodName" : "setRateRatio, setNumerator, setValue"} **/
						, medicationadministration.getMddmnDsgRtRtRtDnmntrQnttVlue() /** { "tree" :"MedicationAdministration.dosage.rateRatio", "datatype" : "Ratio, Quantity, decimal", "cardinality" : "ZeroOne", "elementtree" : ["setDosage"] , "methodName" : "setRateRatio, setDenominator, setValue"} **/
						, medicationadministration.getMddmnDsgRtRtRtNmrtrQnttCmprtr() /** { "tree" :"MedicationAdministration.dosage.rateRatio", "datatype" : "Ratio, Quantity, code", "cardinality" : "ZeroOne", "elementtree" : ["setDosage"] , "methodName" : "setRateRatio, setNumerator, setComparator"} **/
						, medicationadministration.getMddmnDsgRtRtRtDnmntrQnttCmprtr() /** { "tree" :"MedicationAdministration.dosage.rateRatio", "datatype" : "Ratio, Quantity, code", "cardinality" : "ZeroOne", "elementtree" : ["setDosage"] , "methodName" : "setRateRatio, setDenominator, setComparator"} **/
						, medicationadministration.getMddmnDsgRtRtRtNmrtrQnttNt() /** { "tree" :"MedicationAdministration.dosage.rateRatio", "datatype" : "Ratio, Quantity, string", "cardinality" : "ZeroOne", "elementtree" : ["setDosage"] , "methodName" : "setRateRatio, setNumerator, setUnit"} **/
						, medicationadministration.getMddmnDsgRtRtRtDnmntrQnttNt() /** { "tree" :"MedicationAdministration.dosage.rateRatio", "datatype" : "Ratio, Quantity, string", "cardinality" : "ZeroOne", "elementtree" : ["setDosage"] , "methodName" : "setRateRatio, setDenominator, setUnit"} **/
						, medicationadministration.getMddmnDsgRtRtRtNmrtrQnttSstm() /** { "tree" :"MedicationAdministration.dosage.rateRatio", "datatype" : "Ratio, Quantity, uri", "cardinality" : "ZeroOne", "elementtree" : ["setDosage"] , "methodName" : "setRateRatio, setNumerator, setSystem"} **/
						, medicationadministration.getMddmnDsgRtRtRtDnmntrQnttSstm() /** { "tree" :"MedicationAdministration.dosage.rateRatio", "datatype" : "Ratio, Quantity, uri", "cardinality" : "ZeroOne", "elementtree" : ["setDosage"] , "methodName" : "setRateRatio, setDenominator, setSystem"} **/
						, medicationadministration.getMddmnDsgRtRtRtNmrtrQnttCde() /** { "tree" :"MedicationAdministration.dosage.rateRatio", "datatype" : "Ratio, Quantity, code", "cardinality" : "ZeroOne", "elementtree" : ["setDosage"] , "methodName" : "setRateRatio, setNumerator, setCode"} **/
						, medicationadministration.getMddmnDsgRtRtRtDnmntrQnttCde() /** { "tree" :"MedicationAdministration.dosage.rateRatio", "datatype" : "Ratio, Quantity, code", "cardinality" : "ZeroOne", "elementtree" : ["setDosage"] , "methodName" : "setRateRatio, setDenominator, setCode"} **/
						));
Medicationadministrationobj.setRateSimplequantity(HapiFHIRHelpers.createSimpleQuantity(medicationadministration.getMddmnDsgRtSmplqnttSmplQntty() /** { "tree" :"MedicationAdministration.dosage.rateSimplequantity", "datatype" : "SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["setDosage"] , "methodName" : "setRateSimplequantity"} **/
						));
Medicationadministrationobj.addEventHistory(HapiFHIRHelpers.createReference(medicationadministration.getMedadminEventHistoryReference() /** { "tree" :"MedicationAdministration.eventHistory", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEventHistory"} **/
		));
	}
}
