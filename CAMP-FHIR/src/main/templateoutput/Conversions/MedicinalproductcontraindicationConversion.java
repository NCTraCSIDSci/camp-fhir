package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Medicinalproductcontraindication.
 * @see .Medicinalproductcontraindication
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class MedicinalproductcontraindicationConversion 
{
	public Patient Medicinalproductcontraindications(main.templateoutput.Model.Medicinalproductcontraindication medicinalproductcontraindication) 
	{
			Patient  Medicinalproductcontraindicationobj = new Patient(); 

						Medicinalproductcontraindicationobj.addSubject(HapiFHIRHelpers.createReference(medicinalproductcontraindication.getMpcntrndctnSbjctRfrnce() /** { "tree" :"MedicinalProductContraindication.subject", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSubject"} **/
						));
Medicinalproductcontraindicationobj.setDisease(HapiFHIRHelpers.createCodeableConcept(medicinalproductcontraindication.getMpcntrndctnDssCcCdngCSstm() /** { "tree" :"MedicinalProductContraindication.disease", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDisease, addCoding, setSystem"} **/
						, medicinalproductcontraindication.getMpcntrndctnDssCcCdngCVrsn() /** { "tree" :"MedicinalProductContraindication.disease", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDisease, addCoding, setVersion"} **/
						, medicinalproductcontraindication.getMpcntrndctnDssCcCdngCCde() /** { "tree" :"MedicinalProductContraindication.disease", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDisease, addCoding, setCode"} **/
						, medicinalproductcontraindication.getMpcntrndctnDssCcCdngCDsplay() /** { "tree" :"MedicinalProductContraindication.disease", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDisease, addCoding, setDisplay"} **/
						, medicinalproductcontraindication.getMpcntrndctnDssCcCdngCSrSlctd() /** { "tree" :"MedicinalProductContraindication.disease", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDisease, addCoding, setUserSelected"} **/
						, medicinalproductcontraindication.getMpcontraindicationDiseaseCcText() /** { "tree" :"MedicinalProductContraindication.disease", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDisease, setText"} **/
						));
Medicinalproductcontraindicationobj.setDiseaseStatus(HapiFHIRHelpers.createCodeableConcept(medicinalproductcontraindication.getMpcntrndctnDssSttsCcCdngCSstm() /** { "tree" :"MedicinalProductContraindication.diseaseStatus", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDiseaseStatus, addCoding, setSystem"} **/
						, medicinalproductcontraindication.getMpcntrndctnDssSttsCcCdngCVrsn() /** { "tree" :"MedicinalProductContraindication.diseaseStatus", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDiseaseStatus, addCoding, setVersion"} **/
						, medicinalproductcontraindication.getMpcntrndctnDssSttsCcCdngCCde() /** { "tree" :"MedicinalProductContraindication.diseaseStatus", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDiseaseStatus, addCoding, setCode"} **/
						, medicinalproductcontraindication.getMpcntrndctnDssSttsCcCdngCDsplay() /** { "tree" :"MedicinalProductContraindication.diseaseStatus", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDiseaseStatus, addCoding, setDisplay"} **/
						, medicinalproductcontraindication.getMpcntrndctnDssSttsCcCdngCSrSlctd() /** { "tree" :"MedicinalProductContraindication.diseaseStatus", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDiseaseStatus, addCoding, setUserSelected"} **/
						, medicinalproductcontraindication.getMpcntrndctnDssSttsCcTxt() /** { "tree" :"MedicinalProductContraindication.diseaseStatus", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDiseaseStatus, setText"} **/
						));
Medicinalproductcontraindicationobj.addComorbidity(HapiFHIRHelpers.createCodeableConcept(medicinalproductcontraindication.getMpcntrndctnCmrbdtCcCdngCSstm() /** { "tree" :"MedicinalProductContraindication.comorbidity", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addComorbidity, addCoding, setSystem"} **/
						, medicinalproductcontraindication.getMpcntrndctnCmrbdtCcCdngCVrsn() /** { "tree" :"MedicinalProductContraindication.comorbidity", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addComorbidity, addCoding, setVersion"} **/
						, medicinalproductcontraindication.getMpcntrndctnCmrbdtCcCdngCCde() /** { "tree" :"MedicinalProductContraindication.comorbidity", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addComorbidity, addCoding, setCode"} **/
						, medicinalproductcontraindication.getMpcntrndctnCmrbdtCcCdngCDsplay() /** { "tree" :"MedicinalProductContraindication.comorbidity", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addComorbidity, addCoding, setDisplay"} **/
						, medicinalproductcontraindication.getMpcntrndctnCmrbdtCcCdngCSrSlctd() /** { "tree" :"MedicinalProductContraindication.comorbidity", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addComorbidity, addCoding, setUserSelected"} **/
						, medicinalproductcontraindication.getMpcntrndctnCmrbdtCcTxt() /** { "tree" :"MedicinalProductContraindication.comorbidity", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addComorbidity, setText"} **/
						));
Medicinalproductcontraindicationobj.addTherapeuticIndication(HapiFHIRHelpers.createReference(medicinalproductcontraindication.getMpcntrndctnThrptcndctnRfrnce() /** { "tree" :"MedicinalProductContraindication.therapeuticIndication", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addTherapeuticIndication"} **/
						));
Medicinalproductcontraindicationobj.setTherapyRelationshipType(HapiFHIRHelpers.createCodeableConcept(medicinalproductcontraindication.getMpcntrndctnThrThrpThrpRltnshpTpCcCdngCSstm() /** { "tree" :"MedicinalProductContraindication.otherTherapy.therapyRelationshipType", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addOtherTherapy"] , "methodName" : "setTherapyRelationshipType, addCoding, setSystem"} **/
						, medicinalproductcontraindication.getMpcntrndctnThrThrpThrpRltnshpTpCcCdngCVrsn() /** { "tree" :"MedicinalProductContraindication.otherTherapy.therapyRelationshipType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addOtherTherapy"] , "methodName" : "setTherapyRelationshipType, addCoding, setVersion"} **/
						, medicinalproductcontraindication.getMpcntrndctnThrThrpThrpRltnshpTpCcCdngCCde() /** { "tree" :"MedicinalProductContraindication.otherTherapy.therapyRelationshipType", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addOtherTherapy"] , "methodName" : "setTherapyRelationshipType, addCoding, setCode"} **/
						, medicinalproductcontraindication.getMpcntrndctnThrThrpThrpRltnshpTpCcCdngCDsplay() /** { "tree" :"MedicinalProductContraindication.otherTherapy.therapyRelationshipType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addOtherTherapy"] , "methodName" : "setTherapyRelationshipType, addCoding, setDisplay"} **/
						, medicinalproductcontraindication.getMpcntrndctnThrThrpThrpRltnshpTpCcCdngCSrSlctd() /** { "tree" :"MedicinalProductContraindication.otherTherapy.therapyRelationshipType", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addOtherTherapy"] , "methodName" : "setTherapyRelationshipType, addCoding, setUserSelected"} **/
						, medicinalproductcontraindication.getMpcntrndctnThrThrpThrpRltnshpTpCcTxt() /** { "tree" :"MedicinalProductContraindication.otherTherapy.therapyRelationshipType", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addOtherTherapy"] , "methodName" : "setTherapyRelationshipType, setText"} **/
						));
Medicinalproductcontraindicationobj.setMedicationCodeableconcept(HapiFHIRHelpers.createCodeableConcept(medicinalproductcontraindication.getMpcntrndctnThrThrpMdCdblcncptCcCdngCSstm() /** { "tree" :"MedicinalProductContraindication.otherTherapy.medicationCodeableconcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addOtherTherapy"] , "methodName" : "setMedicationCodeableconcept, addCoding, setSystem"} **/
						, medicinalproductcontraindication.getMpcntrndctnThrThrpMdCdblcncptCcCdngCVrsn() /** { "tree" :"MedicinalProductContraindication.otherTherapy.medicationCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addOtherTherapy"] , "methodName" : "setMedicationCodeableconcept, addCoding, setVersion"} **/
						, medicinalproductcontraindication.getMpcntrndctnThrThrpMdCdblcncptCcCdngCCde() /** { "tree" :"MedicinalProductContraindication.otherTherapy.medicationCodeableconcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addOtherTherapy"] , "methodName" : "setMedicationCodeableconcept, addCoding, setCode"} **/
						, medicinalproductcontraindication.getMpcntrndctnThrThrpMdCdblcncptCcCdngCDsplay() /** { "tree" :"MedicinalProductContraindication.otherTherapy.medicationCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addOtherTherapy"] , "methodName" : "setMedicationCodeableconcept, addCoding, setDisplay"} **/
						, medicinalproductcontraindication.getMpcntrndctnThrThrpMdCdblcncptCcCdngCSrSlctd() /** { "tree" :"MedicinalProductContraindication.otherTherapy.medicationCodeableconcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addOtherTherapy"] , "methodName" : "setMedicationCodeableconcept, addCoding, setUserSelected"} **/
						, medicinalproductcontraindication.getMpcntrndctnThrThrpMdCdblcncptCcTxt() /** { "tree" :"MedicinalProductContraindication.otherTherapy.medicationCodeableconcept", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addOtherTherapy"] , "methodName" : "setMedicationCodeableconcept, setText"} **/
						));
Medicinalproductcontraindicationobj.setMedicationReference(medicinalproduct | medication | substance | substancespecification)(HapiFHIRHelpers.createReference(medicinalproductcontraindication.getMpcntrndctnThrThrpMdRfrncRfrnce() /** { "tree" :"MedicinalProductContraindication.otherTherapy.medicationReference", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addOtherTherapy"] , "methodName" : "setMedicationReference(medicinalproduct | medication | substance | substancespecification)"} **/
						));
Medicinalproductcontraindicationobj.addPopulation(HapiFHIRHelpers.createPopulation(medicinalproductcontraindication.getMpcntrndctnPpltnPpltn() /** { "tree" :"MedicinalProductContraindication.population", "datatype" : "Population", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPopulation"} **/
		));
	}
}
