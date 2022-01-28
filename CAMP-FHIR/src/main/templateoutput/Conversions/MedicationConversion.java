package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Medication.
 * @see .Medication
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class MedicationConversion 
{
	public Patient Medications(main.templateoutput.Model.Medication medication) 
	{
			Patient  Medicationobj = new Patient(); 

						Medicationobj.addIdentifier(HapiFHIRHelpers.createIdentifier(medication.getMedIdentifierIdentifierUse() /** { "tree" :"Medication.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, medication.getMdDntfrDntfrTpCcCSstm() /** { "tree" :"Medication.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, medication.getMdDntfrDntfrTpCcCVrsn() /** { "tree" :"Medication.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, medication.getMdDntfrDntfrTpCcCCde() /** { "tree" :"Medication.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, medication.getMdDntfrDntfrTpCcCDsplay() /** { "tree" :"Medication.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, medication.getMdDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Medication.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, medication.getMdDntfrDntfrTpCcTxt() /** { "tree" :"Medication.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, medication.getMdDntfrDntfrPrdPrdStrt() /** { "tree" :"Medication.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, medication.getMdDntfrDntfrPrdPrdNd() /** { "tree" :"Medication.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, medication.getMedIdentifierIdentifierAssigner() /** { "tree" :"Medication.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, medication.getMedIdentifierIdentifierValue() /** { "tree" :"Medication.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, medication.getMedIdentifierIdentifierSystem() /** { "tree" :"Medication.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Medicationobj.setCode(HapiFHIRHelpers.createCodeableConcept(medication.getMedCodeCcCodingCSystem() /** { "tree" :"Medication.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setSystem"} **/
						, medication.getMedCodeCcCodingCVersion() /** { "tree" :"Medication.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setVersion"} **/
						, medication.getMedCodeCcCodingCCode() /** { "tree" :"Medication.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setCode"} **/
						, medication.getMedCodeCcCodingCDisplay() /** { "tree" :"Medication.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, medication.getMedCodeCcCodingCUserSelected() /** { "tree" :"Medication.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, medication.getMedCodeCcText() /** { "tree" :"Medication.code", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, setText"} **/
						));
Medicationobj.setStatus(HapiFHIRHelpers.createcode(medication.getMedStatusCode() /** { "tree" :"Medication.status", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Medicationobj.setManufacturer(HapiFHIRHelpers.createReference(medication.getMedManufacturerReference() /** { "tree" :"Medication.manufacturer", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setManufacturer"} **/
						));
Medicationobj.setForm(HapiFHIRHelpers.createCodeableConcept(medication.getMedFormCcCodingCSystem() /** { "tree" :"Medication.form", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setForm, addCoding, setSystem"} **/
						, medication.getMedFormCcCodingCVersion() /** { "tree" :"Medication.form", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setForm, addCoding, setVersion"} **/
						, medication.getMedFormCcCodingCCode() /** { "tree" :"Medication.form", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setForm, addCoding, setCode"} **/
						, medication.getMedFormCcCodingCDisplay() /** { "tree" :"Medication.form", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setForm, addCoding, setDisplay"} **/
						, medication.getMedFormCcCodingCUserSelected() /** { "tree" :"Medication.form", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setForm, addCoding, setUserSelected"} **/
						, medication.getMedFormCcText() /** { "tree" :"Medication.form", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setForm, setText"} **/
						));
Medicationobj.setAmount(HapiFHIRHelpers.createRatio(medication.getMdMntRtNmrtrQnttVlue() /** { "tree" :"Medication.amount", "datatype" : "Ratio, Quantity, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAmount, setNumerator, setValue"} **/
						, medication.getMdMntRtDnmntrQnttVlue() /** { "tree" :"Medication.amount", "datatype" : "Ratio, Quantity, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAmount, setDenominator, setValue"} **/
						, medication.getMdMntRtNmrtrQnttCmprtr() /** { "tree" :"Medication.amount", "datatype" : "Ratio, Quantity, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAmount, setNumerator, setComparator"} **/
						, medication.getMdMntRtDnmntrQnttCmprtr() /** { "tree" :"Medication.amount", "datatype" : "Ratio, Quantity, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAmount, setDenominator, setComparator"} **/
						, medication.getMdMntRtNmrtrQnttNt() /** { "tree" :"Medication.amount", "datatype" : "Ratio, Quantity, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAmount, setNumerator, setUnit"} **/
						, medication.getMdMntRtDnmntrQnttNt() /** { "tree" :"Medication.amount", "datatype" : "Ratio, Quantity, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAmount, setDenominator, setUnit"} **/
						, medication.getMdMntRtNmrtrQnttSstm() /** { "tree" :"Medication.amount", "datatype" : "Ratio, Quantity, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAmount, setNumerator, setSystem"} **/
						, medication.getMdMntRtDnmntrQnttSstm() /** { "tree" :"Medication.amount", "datatype" : "Ratio, Quantity, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAmount, setDenominator, setSystem"} **/
						, medication.getMdMntRtNmrtrQnttCde() /** { "tree" :"Medication.amount", "datatype" : "Ratio, Quantity, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAmount, setNumerator, setCode"} **/
						, medication.getMdMntRtDnmntrQnttCde() /** { "tree" :"Medication.amount", "datatype" : "Ratio, Quantity, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAmount, setDenominator, setCode"} **/
						));
Medicationobj.setItemCodeableconcept(HapiFHIRHelpers.createCodeableConcept(medication.getMdNgrdntTmCdblcncptCcCdngCSstm() /** { "tree" :"Medication.ingredient.itemCodeableconcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addIngredient"] , "methodName" : "setItemCodeableconcept, addCoding, setSystem"} **/
						, medication.getMdNgrdntTmCdblcncptCcCdngCVrsn() /** { "tree" :"Medication.ingredient.itemCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addIngredient"] , "methodName" : "setItemCodeableconcept, addCoding, setVersion"} **/
						, medication.getMdNgrdntTmCdblcncptCcCdngCCde() /** { "tree" :"Medication.ingredient.itemCodeableconcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addIngredient"] , "methodName" : "setItemCodeableconcept, addCoding, setCode"} **/
						, medication.getMdNgrdntTmCdblcncptCcCdngCDsplay() /** { "tree" :"Medication.ingredient.itemCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addIngredient"] , "methodName" : "setItemCodeableconcept, addCoding, setDisplay"} **/
						, medication.getMdNgrdntTmCdblcncptCcCdngCSrSlctd() /** { "tree" :"Medication.ingredient.itemCodeableconcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addIngredient"] , "methodName" : "setItemCodeableconcept, addCoding, setUserSelected"} **/
						, medication.getMdNgrdntTmCdblcncptCcTxt() /** { "tree" :"Medication.ingredient.itemCodeableconcept", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addIngredient"] , "methodName" : "setItemCodeableconcept, setText"} **/
						));
Medicationobj.setItemReference(substance | medication)(HapiFHIRHelpers.createReference(medication.getMdNgrdntTmRfrncRfrnce() /** { "tree" :"Medication.ingredient.itemReference", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addIngredient"] , "methodName" : "setItemReference(substance | medication)"} **/
						));
Medicationobj.setIsActive(HapiFHIRHelpers.createboolean(medication.getMedIngredientIsActiveBoolean() /** { "tree" :"Medication.ingredient.isActive", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addIngredient"] , "methodName" : "setIsActive"} **/
						));
Medicationobj.setStrength(HapiFHIRHelpers.createRatio(medication.getMdNgrdntStrRtNmrtrQnttVlue() /** { "tree" :"Medication.ingredient.strength", "datatype" : "Ratio, Quantity, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addIngredient"] , "methodName" : "setStrength, setNumerator, setValue"} **/
						, medication.getMdNgrdntStrRtDnmntrQnttVlue() /** { "tree" :"Medication.ingredient.strength", "datatype" : "Ratio, Quantity, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addIngredient"] , "methodName" : "setStrength, setDenominator, setValue"} **/
						, medication.getMdNgrdntStrRtNmrtrQnttCmprtr() /** { "tree" :"Medication.ingredient.strength", "datatype" : "Ratio, Quantity, code", "cardinality" : "ZeroOne", "elementtree" : ["addIngredient"] , "methodName" : "setStrength, setNumerator, setComparator"} **/
						, medication.getMdNgrdntStrRtDnmntrQnttCmprtr() /** { "tree" :"Medication.ingredient.strength", "datatype" : "Ratio, Quantity, code", "cardinality" : "ZeroOne", "elementtree" : ["addIngredient"] , "methodName" : "setStrength, setDenominator, setComparator"} **/
						, medication.getMdNgrdntStrRtNmrtrQnttNt() /** { "tree" :"Medication.ingredient.strength", "datatype" : "Ratio, Quantity, string", "cardinality" : "ZeroOne", "elementtree" : ["addIngredient"] , "methodName" : "setStrength, setNumerator, setUnit"} **/
						, medication.getMdNgrdntStrRtDnmntrQnttNt() /** { "tree" :"Medication.ingredient.strength", "datatype" : "Ratio, Quantity, string", "cardinality" : "ZeroOne", "elementtree" : ["addIngredient"] , "methodName" : "setStrength, setDenominator, setUnit"} **/
						, medication.getMdNgrdntStrRtNmrtrQnttSstm() /** { "tree" :"Medication.ingredient.strength", "datatype" : "Ratio, Quantity, uri", "cardinality" : "ZeroOne", "elementtree" : ["addIngredient"] , "methodName" : "setStrength, setNumerator, setSystem"} **/
						, medication.getMdNgrdntStrRtDnmntrQnttSstm() /** { "tree" :"Medication.ingredient.strength", "datatype" : "Ratio, Quantity, uri", "cardinality" : "ZeroOne", "elementtree" : ["addIngredient"] , "methodName" : "setStrength, setDenominator, setSystem"} **/
						, medication.getMdNgrdntStrRtNmrtrQnttCde() /** { "tree" :"Medication.ingredient.strength", "datatype" : "Ratio, Quantity, code", "cardinality" : "ZeroOne", "elementtree" : ["addIngredient"] , "methodName" : "setStrength, setNumerator, setCode"} **/
						, medication.getMdNgrdntStrRtDnmntrQnttCde() /** { "tree" :"Medication.ingredient.strength", "datatype" : "Ratio, Quantity, code", "cardinality" : "ZeroOne", "elementtree" : ["addIngredient"] , "methodName" : "setStrength, setDenominator, setCode"} **/
						));
Medicationobj.setLotNumber(HapiFHIRHelpers.createstring(medication.getMedBatchLotNumberString() /** { "tree" :"Medication.batch.lotNumber", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setBatch"] , "methodName" : "setLotNumber"} **/
						));
Medicationobj.setExpirationDate(HapiFHIRHelpers.createdateTime(medication.getMedBatchExpirationDateDateTime() /** { "tree" :"Medication.batch.expirationDate", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : ["setBatch"] , "methodName" : "setExpirationDate"} **/
		));
	}
}
