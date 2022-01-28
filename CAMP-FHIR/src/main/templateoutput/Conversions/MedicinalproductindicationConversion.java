package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Medicinalproductindication.
 * @see .Medicinalproductindication
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class MedicinalproductindicationConversion 
{
	public Patient Medicinalproductindications(main.templateoutput.Model.Medicinalproductindication medicinalproductindication) 
	{
			Patient  Medicinalproductindicationobj = new Patient(); 

						Medicinalproductindicationobj.addSubject(HapiFHIRHelpers.createReference(medicinalproductindication.getMpindicationSubjectReference() /** { "tree" :"MedicinalProductIndication.subject", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSubject"} **/
						));
Medicinalproductindicationobj.setDiseaseSymptomProcedure(HapiFHIRHelpers.createCodeableConcept(medicinalproductindication.getMpndctnDssSmptmPrcdrCcCdngCSstm() /** { "tree" :"MedicinalProductIndication.diseaseSymptomProcedure", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDiseaseSymptomProcedure, addCoding, setSystem"} **/
						, medicinalproductindication.getMpndctnDssSmptmPrcdrCcCdngCVrsn() /** { "tree" :"MedicinalProductIndication.diseaseSymptomProcedure", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDiseaseSymptomProcedure, addCoding, setVersion"} **/
						, medicinalproductindication.getMpndctnDssSmptmPrcdrCcCdngCCde() /** { "tree" :"MedicinalProductIndication.diseaseSymptomProcedure", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDiseaseSymptomProcedure, addCoding, setCode"} **/
						, medicinalproductindication.getMpndctnDssSmptmPrcdrCcCdngCDsplay() /** { "tree" :"MedicinalProductIndication.diseaseSymptomProcedure", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDiseaseSymptomProcedure, addCoding, setDisplay"} **/
						, medicinalproductindication.getMpndctnDssSmptmPrcdrCcCdngCSrSlctd() /** { "tree" :"MedicinalProductIndication.diseaseSymptomProcedure", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDiseaseSymptomProcedure, addCoding, setUserSelected"} **/
						, medicinalproductindication.getMpndctnDssSmptmPrcdrCcTxt() /** { "tree" :"MedicinalProductIndication.diseaseSymptomProcedure", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDiseaseSymptomProcedure, setText"} **/
						));
Medicinalproductindicationobj.setDiseaseStatus(HapiFHIRHelpers.createCodeableConcept(medicinalproductindication.getMpndctnDssSttsCcCdngCSstm() /** { "tree" :"MedicinalProductIndication.diseaseStatus", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDiseaseStatus, addCoding, setSystem"} **/
						, medicinalproductindication.getMpndctnDssSttsCcCdngCVrsn() /** { "tree" :"MedicinalProductIndication.diseaseStatus", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDiseaseStatus, addCoding, setVersion"} **/
						, medicinalproductindication.getMpndctnDssSttsCcCdngCCde() /** { "tree" :"MedicinalProductIndication.diseaseStatus", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDiseaseStatus, addCoding, setCode"} **/
						, medicinalproductindication.getMpndctnDssSttsCcCdngCDsplay() /** { "tree" :"MedicinalProductIndication.diseaseStatus", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDiseaseStatus, addCoding, setDisplay"} **/
						, medicinalproductindication.getMpndctnDssSttsCcCdngCSrSlctd() /** { "tree" :"MedicinalProductIndication.diseaseStatus", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDiseaseStatus, addCoding, setUserSelected"} **/
						, medicinalproductindication.getMpindicationDiseaseStatusCcText() /** { "tree" :"MedicinalProductIndication.diseaseStatus", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDiseaseStatus, setText"} **/
						));
Medicinalproductindicationobj.addComorbidity(HapiFHIRHelpers.createCodeableConcept(medicinalproductindication.getMpndctnCmrbdtCcCdngCSstm() /** { "tree" :"MedicinalProductIndication.comorbidity", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addComorbidity, addCoding, setSystem"} **/
						, medicinalproductindication.getMpndctnCmrbdtCcCdngCVrsn() /** { "tree" :"MedicinalProductIndication.comorbidity", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addComorbidity, addCoding, setVersion"} **/
						, medicinalproductindication.getMpndctnCmrbdtCcCdngCCde() /** { "tree" :"MedicinalProductIndication.comorbidity", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addComorbidity, addCoding, setCode"} **/
						, medicinalproductindication.getMpndctnCmrbdtCcCdngCDsplay() /** { "tree" :"MedicinalProductIndication.comorbidity", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addComorbidity, addCoding, setDisplay"} **/
						, medicinalproductindication.getMpndctnCmrbdtCcCdngCSrSlctd() /** { "tree" :"MedicinalProductIndication.comorbidity", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addComorbidity, addCoding, setUserSelected"} **/
						, medicinalproductindication.getMpindicationComorbidityCcText() /** { "tree" :"MedicinalProductIndication.comorbidity", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addComorbidity, setText"} **/
						));
Medicinalproductindicationobj.setIntendedEffect(HapiFHIRHelpers.createCodeableConcept(medicinalproductindication.getMpndctnNtnddffctCcCdngCSstm() /** { "tree" :"MedicinalProductIndication.intendedEffect", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIntendedEffect, addCoding, setSystem"} **/
						, medicinalproductindication.getMpndctnNtnddffctCcCdngCVrsn() /** { "tree" :"MedicinalProductIndication.intendedEffect", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIntendedEffect, addCoding, setVersion"} **/
						, medicinalproductindication.getMpndctnNtnddffctCcCdngCCde() /** { "tree" :"MedicinalProductIndication.intendedEffect", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIntendedEffect, addCoding, setCode"} **/
						, medicinalproductindication.getMpndctnNtnddffctCcCdngCDsplay() /** { "tree" :"MedicinalProductIndication.intendedEffect", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIntendedEffect, addCoding, setDisplay"} **/
						, medicinalproductindication.getMpndctnNtnddffctCcCdngCSrSlctd() /** { "tree" :"MedicinalProductIndication.intendedEffect", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIntendedEffect, addCoding, setUserSelected"} **/
						, medicinalproductindication.getMpndctnNtnddffctCcTxt() /** { "tree" :"MedicinalProductIndication.intendedEffect", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIntendedEffect, setText"} **/
						));
Medicinalproductindicationobj.setDuration(HapiFHIRHelpers.createQuantity(medicinalproductindication.getMpndctnDrtnQnttCmprtr() /** { "tree" :"MedicinalProductIndication.duration", "datatype" : "Quantity, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDuration, setComparator"} **/
						, medicinalproductindication.getMpndctnDrtnQnttCde() /** { "tree" :"MedicinalProductIndication.duration", "datatype" : "Quantity, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDuration, setCode"} **/
						, medicinalproductindication.getMpndctnDrtnQnttVlue() /** { "tree" :"MedicinalProductIndication.duration", "datatype" : "Quantity, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDuration, setValue"} **/
						, medicinalproductindication.getMpndctnDrtnQnttNt() /** { "tree" :"MedicinalProductIndication.duration", "datatype" : "Quantity, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDuration, setUnit"} **/
						, medicinalproductindication.getMpndctnDrtnQnttSstm() /** { "tree" :"MedicinalProductIndication.duration", "datatype" : "Quantity, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDuration, setSystem"} **/
						));
Medicinalproductindicationobj.setTherapyRelationshipType(HapiFHIRHelpers.createCodeableConcept(medicinalproductindication.getMpndctnThrThrpThrpRltnshpTpCcCdngCSstm() /** { "tree" :"MedicinalProductIndication.otherTherapy.therapyRelationshipType", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addOtherTherapy"] , "methodName" : "setTherapyRelationshipType, addCoding, setSystem"} **/
						, medicinalproductindication.getMpndctnThrThrpThrpRltnshpTpCcCdngCVrsn() /** { "tree" :"MedicinalProductIndication.otherTherapy.therapyRelationshipType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addOtherTherapy"] , "methodName" : "setTherapyRelationshipType, addCoding, setVersion"} **/
						, medicinalproductindication.getMpndctnThrThrpThrpRltnshpTpCcCdngCCde() /** { "tree" :"MedicinalProductIndication.otherTherapy.therapyRelationshipType", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addOtherTherapy"] , "methodName" : "setTherapyRelationshipType, addCoding, setCode"} **/
						, medicinalproductindication.getMpndctnThrThrpThrpRltnshpTpCcCdngCDsplay() /** { "tree" :"MedicinalProductIndication.otherTherapy.therapyRelationshipType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addOtherTherapy"] , "methodName" : "setTherapyRelationshipType, addCoding, setDisplay"} **/
						, medicinalproductindication.getMpndctnThrThrpThrpRltnshpTpCcCdngCSrSlctd() /** { "tree" :"MedicinalProductIndication.otherTherapy.therapyRelationshipType", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addOtherTherapy"] , "methodName" : "setTherapyRelationshipType, addCoding, setUserSelected"} **/
						, medicinalproductindication.getMpndctnThrThrpThrpRltnshpTpCcTxt() /** { "tree" :"MedicinalProductIndication.otherTherapy.therapyRelationshipType", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addOtherTherapy"] , "methodName" : "setTherapyRelationshipType, setText"} **/
						));
Medicinalproductindicationobj.setMedicationCodeableconcept(HapiFHIRHelpers.createCodeableConcept(medicinalproductindication.getMpndctnThrThrpMdCdblcncptCcCdngCSstm() /** { "tree" :"MedicinalProductIndication.otherTherapy.medicationCodeableconcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addOtherTherapy"] , "methodName" : "setMedicationCodeableconcept, addCoding, setSystem"} **/
						, medicinalproductindication.getMpndctnThrThrpMdCdblcncptCcCdngCVrsn() /** { "tree" :"MedicinalProductIndication.otherTherapy.medicationCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addOtherTherapy"] , "methodName" : "setMedicationCodeableconcept, addCoding, setVersion"} **/
						, medicinalproductindication.getMpndctnThrThrpMdCdblcncptCcCdngCCde() /** { "tree" :"MedicinalProductIndication.otherTherapy.medicationCodeableconcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addOtherTherapy"] , "methodName" : "setMedicationCodeableconcept, addCoding, setCode"} **/
						, medicinalproductindication.getMpndctnThrThrpMdCdblcncptCcCdngCDsplay() /** { "tree" :"MedicinalProductIndication.otherTherapy.medicationCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addOtherTherapy"] , "methodName" : "setMedicationCodeableconcept, addCoding, setDisplay"} **/
						, medicinalproductindication.getMpndctnThrThrpMdCdblcncptCcCdngCSrSlctd() /** { "tree" :"MedicinalProductIndication.otherTherapy.medicationCodeableconcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addOtherTherapy"] , "methodName" : "setMedicationCodeableconcept, addCoding, setUserSelected"} **/
						, medicinalproductindication.getMpndctnThrThrpMdCdblcncptCcTxt() /** { "tree" :"MedicinalProductIndication.otherTherapy.medicationCodeableconcept", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addOtherTherapy"] , "methodName" : "setMedicationCodeableconcept, setText"} **/
						));
Medicinalproductindicationobj.setMedicationReference(medicinalproduct | medication | substance | substancespecification)(HapiFHIRHelpers.createReference(medicinalproductindication.getMpndctnThrThrpMdRfrncRfrnce() /** { "tree" :"MedicinalProductIndication.otherTherapy.medicationReference", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addOtherTherapy"] , "methodName" : "setMedicationReference(medicinalproduct | medication | substance | substancespecification)"} **/
						));
Medicinalproductindicationobj.addUndesirableEffect(HapiFHIRHelpers.createReference(medicinalproductindication.getMpndctnNdsrblffctRfrnce() /** { "tree" :"MedicinalProductIndication.undesirableEffect", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUndesirableEffect"} **/
						));
Medicinalproductindicationobj.addPopulation(HapiFHIRHelpers.createPopulation(medicinalproductindication.getMpindicationPopulationPopulation() /** { "tree" :"MedicinalProductIndication.population", "datatype" : "Population", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPopulation"} **/
		));
	}
}
