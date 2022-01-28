package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Visionprescription.
 * @see .Visionprescription
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class VisionprescriptionConversion 
{
	public Patient Visionprescriptions(main.templateoutput.Model.Visionprescription visionprescription) 
	{
			Patient  Visionprescriptionobj = new Patient(); 

						Visionprescriptionobj.addIdentifier(HapiFHIRHelpers.createIdentifier(visionprescription.getVsnPrscrptnDntfrDntfrSe() /** { "tree" :"VisionPrescription.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, visionprescription.getVsnPrscrptnDntfrDntfrTpCcCSstm() /** { "tree" :"VisionPrescription.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, visionprescription.getVsnPrscrptnDntfrDntfrTpCcCVrsn() /** { "tree" :"VisionPrescription.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, visionprescription.getVsnPrscrptnDntfrDntfrTpCcCCde() /** { "tree" :"VisionPrescription.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, visionprescription.getVsnPrscrptnDntfrDntfrTpCcCDsplay() /** { "tree" :"VisionPrescription.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, visionprescription.getVsnPrscrptnDntfrDntfrTpCcCSrSlctd() /** { "tree" :"VisionPrescription.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, visionprescription.getVsnPrscrptnDntfrDntfrTpCcTxt() /** { "tree" :"VisionPrescription.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, visionprescription.getVsnPrscrptnDntfrDntfrPrdPrdStrt() /** { "tree" :"VisionPrescription.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, visionprescription.getVsnPrscrptnDntfrDntfrPrdPrdNd() /** { "tree" :"VisionPrescription.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, visionprescription.getVsnPrscrptnDntfrDntfrSsgnr() /** { "tree" :"VisionPrescription.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, visionprescription.getVsnPrscrptnDntfrDntfrVlue() /** { "tree" :"VisionPrescription.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, visionprescription.getVsnPrscrptnDntfrDntfrSstm() /** { "tree" :"VisionPrescription.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Visionprescriptionobj.setStatus(HapiFHIRHelpers.createcode(visionprescription.getVisionPrescriptionStatusCode() /** { "tree" :"VisionPrescription.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Visionprescriptionobj.setCreated(HapiFHIRHelpers.createdateTime(visionprescription.getVsnPrscrptnCrtdDtTme() /** { "tree" :"VisionPrescription.created", "datatype" : "dateTime", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCreated"} **/
						));
Visionprescriptionobj.setPatient(HapiFHIRHelpers.createReference(visionprescription.getVisionPrescriptionPntReference() /** { "tree" :"VisionPrescription.patient", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setPatient"} **/
						));
Visionprescriptionobj.setEncounter(HapiFHIRHelpers.createReference(visionprescription.getVsnPrscrptnNcntrRfrnce() /** { "tree" :"VisionPrescription.encounter", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEncounter"} **/
						));
Visionprescriptionobj.setDateWritten(HapiFHIRHelpers.createdateTime(visionprescription.getVsnPrscrptnDtWrttnDtTme() /** { "tree" :"VisionPrescription.dateWritten", "datatype" : "dateTime", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setDateWritten"} **/
						));
Visionprescriptionobj.setPrescriber(HapiFHIRHelpers.createReference(visionprescription.getVsnPrscrptnPrscrbrRfrnce() /** { "tree" :"VisionPrescription.prescriber", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setPrescriber"} **/
						));
Visionprescriptionobj.setProduct(HapiFHIRHelpers.createCodeableConcept(visionprescription.getVsnPrscrptnLnsSpcfctnPrdctCcCdngCSstm() /** { "tree" :"VisionPrescription.lensSpecification.product", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["setLensSpecification"] , "methodName" : "setProduct, addCoding, setSystem"} **/
						, visionprescription.getVsnPrscrptnLnsSpcfctnPrdctCcCdngCVrsn() /** { "tree" :"VisionPrescription.lensSpecification.product", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["setLensSpecification"] , "methodName" : "setProduct, addCoding, setVersion"} **/
						, visionprescription.getVsnPrscrptnLnsSpcfctnPrdctCcCdngCCde() /** { "tree" :"VisionPrescription.lensSpecification.product", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["setLensSpecification"] , "methodName" : "setProduct, addCoding, setCode"} **/
						, visionprescription.getVsnPrscrptnLnsSpcfctnPrdctCcCdngCDsplay() /** { "tree" :"VisionPrescription.lensSpecification.product", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["setLensSpecification"] , "methodName" : "setProduct, addCoding, setDisplay"} **/
						, visionprescription.getVsnPrscrptnLnsSpcfctnPrdctCcCdngCSrSlctd() /** { "tree" :"VisionPrescription.lensSpecification.product", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["setLensSpecification"] , "methodName" : "setProduct, addCoding, setUserSelected"} **/
						, visionprescription.getVsnPrscrptnLnsSpcfctnPrdctCcTxt() /** { "tree" :"VisionPrescription.lensSpecification.product", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["setLensSpecification"] , "methodName" : "setProduct, setText"} **/
						));
Visionprescriptionobj.setEye(HapiFHIRHelpers.createcode(visionprescription.getVsnPrscrptnLnsSpcfctnCde() /** { "tree" :"VisionPrescription.lensSpecification.eye", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["setLensSpecification"] , "methodName" : "setEye"} **/
						));
Visionprescriptionobj.setSphere(HapiFHIRHelpers.createdecimal(visionprescription.getVsnPrscrptnLnsSpcfctnSphrDcml() /** { "tree" :"VisionPrescription.lensSpecification.sphere", "datatype" : "decimal", "cardinality" : "ZeroOne", "elementtree" : ["setLensSpecification"] , "methodName" : "setSphere"} **/
						));
Visionprescriptionobj.setCylinder(HapiFHIRHelpers.createdecimal(visionprescription.getVsnPrscrptnLnsSpcfctnClndrDcml() /** { "tree" :"VisionPrescription.lensSpecification.cylinder", "datatype" : "decimal", "cardinality" : "ZeroOne", "elementtree" : ["setLensSpecification"] , "methodName" : "setCylinder"} **/
						));
Visionprescriptionobj.setAxis(HapiFHIRHelpers.createinteger(visionprescription.getVsnPrscrptnLnsSpcfctnXsNtgr() /** { "tree" :"VisionPrescription.lensSpecification.axis", "datatype" : "integer", "cardinality" : "ZeroOne", "elementtree" : ["setLensSpecification"] , "methodName" : "setAxis"} **/
						));
Visionprescriptionobj.setAmount(HapiFHIRHelpers.createdecimal(visionprescription.getVsnPrscrptnLnsSpcfctnPrsmMntDcml() /** { "tree" :"VisionPrescription.lensSpecification.prism.amount", "datatype" : "decimal", "cardinality" : "Required", "elementtree" : ["setLensSpecification", "addPrism"] , "methodName" : "setAmount"} **/
						));
Visionprescriptionobj.setBase(HapiFHIRHelpers.createcode(visionprescription.getVsnPrscrptnLnsSpcfctnPrsmBsCde() /** { "tree" :"VisionPrescription.lensSpecification.prism.base", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["setLensSpecification", "addPrism"] , "methodName" : "setBase"} **/
						));
Visionprescriptionobj.setAdd(HapiFHIRHelpers.createdecimal(visionprescription.getVsnPrscrptnLnsSpcfctnDdDcml() /** { "tree" :"VisionPrescription.lensSpecification.add", "datatype" : "decimal", "cardinality" : "ZeroOne", "elementtree" : ["setLensSpecification", "addPrism"] , "methodName" : "setAdd"} **/
						));
Visionprescriptionobj.setPower(HapiFHIRHelpers.createdecimal(visionprescription.getVsnPrscrptnLnsSpcfctnPwrDcml() /** { "tree" :"VisionPrescription.lensSpecification.power", "datatype" : "decimal", "cardinality" : "ZeroOne", "elementtree" : ["setLensSpecification", "addPrism"] , "methodName" : "setPower"} **/
						));
Visionprescriptionobj.setBackCurve(HapiFHIRHelpers.createdecimal(visionprescription.getVsnPrscrptnLnsSpcfctnBckCrvDcml() /** { "tree" :"VisionPrescription.lensSpecification.backCurve", "datatype" : "decimal", "cardinality" : "ZeroOne", "elementtree" : ["setLensSpecification", "addPrism"] , "methodName" : "setBackCurve"} **/
						));
Visionprescriptionobj.setDiameter(HapiFHIRHelpers.createdecimal(visionprescription.getVsnPrscrptnLnsSpcfctnDmtrDcml() /** { "tree" :"VisionPrescription.lensSpecification.diameter", "datatype" : "decimal", "cardinality" : "ZeroOne", "elementtree" : ["setLensSpecification", "addPrism"] , "methodName" : "setDiameter"} **/
						));
Visionprescriptionobj.setDuration(HapiFHIRHelpers.createSimpleQuantity(visionprescription.getVsnPrscrptnLnsSpcfctnDrtnSmplQntty() /** { "tree" :"VisionPrescription.lensSpecification.duration", "datatype" : "SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["setLensSpecification", "addPrism"] , "methodName" : "setDuration"} **/
						));
Visionprescriptionobj.setColor(HapiFHIRHelpers.createstring(visionprescription.getVsnPrscrptnLnsSpcfctnClrStrng() /** { "tree" :"VisionPrescription.lensSpecification.color", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setLensSpecification", "addPrism"] , "methodName" : "setColor"} **/
						));
Visionprescriptionobj.setBrand(HapiFHIRHelpers.createstring(visionprescription.getVsnPrscrptnLnsSpcfctnBrndStrng() /** { "tree" :"VisionPrescription.lensSpecification.brand", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setLensSpecification", "addPrism"] , "methodName" : "setBrand"} **/
						));
Visionprescriptionobj.addNote(HapiFHIRHelpers.createAnnotation(visionprescription.getVsnPrscrptnLnsSpcfctnNtNnttnTme() /** { "tree" :"VisionPrescription.lensSpecification.note", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : ["setLensSpecification", "addPrism"] , "methodName" : "addNote, setTime"} **/
						, visionprescription.getVsnPrscrptnLnsSpcfctnNtNnttnTxt() /** { "tree" :"VisionPrescription.lensSpecification.note", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : ["setLensSpecification", "addPrism"] , "methodName" : "addNote, setText"} **/
						, visionprescription.getVsnPrscrptnLnsSpcfctnNtNnttnThrRfrnce() /** { "tree" :"VisionPrescription.lensSpecification.note", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : ["setLensSpecification", "addPrism"] , "methodName" : "addNote, setAuthorReference"} **/
						, visionprescription.getVsnPrscrptnLnsSpcfctnNtNnttnThrStrng() /** { "tree" :"VisionPrescription.lensSpecification.note", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : ["setLensSpecification", "addPrism"] , "methodName" : "addNote, setAuthorString"} **/
		));
	}
}
