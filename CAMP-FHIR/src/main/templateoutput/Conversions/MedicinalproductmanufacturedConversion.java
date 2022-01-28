package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Medicinalproductmanufactured.
 * @see .Medicinalproductmanufactured
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class MedicinalproductmanufacturedConversion 
{
	public Patient Medicinalproductmanufactureds(main.templateoutput.Model.Medicinalproductmanufactured medicinalproductmanufactured) 
	{
			Patient  Medicinalproductmanufacturedobj = new Patient(); 

						Medicinalproductmanufacturedobj.setManufacturedDoseForm(HapiFHIRHelpers.createCodeableConcept(medicinalproductmanufactured.getMpmnfctrdMnfctrdDsFrmCcCdngCSstm() /** { "tree" :"MedicinalProductManufactured.manufacturedDoseForm", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setManufacturedDoseForm, addCoding, setSystem"} **/
						, medicinalproductmanufactured.getMpmnfctrdMnfctrdDsFrmCcCdngCVrsn() /** { "tree" :"MedicinalProductManufactured.manufacturedDoseForm", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setManufacturedDoseForm, addCoding, setVersion"} **/
						, medicinalproductmanufactured.getMpmnfctrdMnfctrdDsFrmCcCdngCCde() /** { "tree" :"MedicinalProductManufactured.manufacturedDoseForm", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setManufacturedDoseForm, addCoding, setCode"} **/
						, medicinalproductmanufactured.getMpmnfctrdMnfctrdDsFrmCcCdngCDsplay() /** { "tree" :"MedicinalProductManufactured.manufacturedDoseForm", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setManufacturedDoseForm, addCoding, setDisplay"} **/
						, medicinalproductmanufactured.getMpmnfctrdMnfctrdDsFrmCcCdngCSrSlctd() /** { "tree" :"MedicinalProductManufactured.manufacturedDoseForm", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setManufacturedDoseForm, addCoding, setUserSelected"} **/
						, medicinalproductmanufactured.getMpmnfctrdMnfctrdDsFrmCcTxt() /** { "tree" :"MedicinalProductManufactured.manufacturedDoseForm", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setManufacturedDoseForm, setText"} **/
						));
Medicinalproductmanufacturedobj.setUnitOfPresentation(HapiFHIRHelpers.createCodeableConcept(medicinalproductmanufactured.getMpmnfctrdNtfPrsnttnCcCdngCSstm() /** { "tree" :"MedicinalProductManufactured.unitOfPresentation", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setUnitOfPresentation, addCoding, setSystem"} **/
						, medicinalproductmanufactured.getMpmnfctrdNtfPrsnttnCcCdngCVrsn() /** { "tree" :"MedicinalProductManufactured.unitOfPresentation", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setUnitOfPresentation, addCoding, setVersion"} **/
						, medicinalproductmanufactured.getMpmnfctrdNtfPrsnttnCcCdngCCde() /** { "tree" :"MedicinalProductManufactured.unitOfPresentation", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setUnitOfPresentation, addCoding, setCode"} **/
						, medicinalproductmanufactured.getMpmnfctrdNtfPrsnttnCcCdngCDsplay() /** { "tree" :"MedicinalProductManufactured.unitOfPresentation", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setUnitOfPresentation, addCoding, setDisplay"} **/
						, medicinalproductmanufactured.getMpmnfctrdNtfPrsnttnCcCdngCSrSlctd() /** { "tree" :"MedicinalProductManufactured.unitOfPresentation", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setUnitOfPresentation, addCoding, setUserSelected"} **/
						, medicinalproductmanufactured.getMpmnfctrdNtfPrsnttnCcTxt() /** { "tree" :"MedicinalProductManufactured.unitOfPresentation", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setUnitOfPresentation, setText"} **/
						));
Medicinalproductmanufacturedobj.setQuantity(HapiFHIRHelpers.createQuantity(medicinalproductmanufactured.getMpmnfctrdQnttQnttCmprtr() /** { "tree" :"MedicinalProductManufactured.quantity", "datatype" : "Quantity, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setQuantity, setComparator"} **/
						, medicinalproductmanufactured.getMpmnfctrdQnttQnttCde() /** { "tree" :"MedicinalProductManufactured.quantity", "datatype" : "Quantity, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setQuantity, setCode"} **/
						, medicinalproductmanufactured.getMpmnfctrdQnttQnttVlue() /** { "tree" :"MedicinalProductManufactured.quantity", "datatype" : "Quantity, decimal", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setQuantity, setValue"} **/
						, medicinalproductmanufactured.getMpmnfctrdQnttQnttNt() /** { "tree" :"MedicinalProductManufactured.quantity", "datatype" : "Quantity, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setQuantity, setUnit"} **/
						, medicinalproductmanufactured.getMpmnfctrdQnttQnttSstm() /** { "tree" :"MedicinalProductManufactured.quantity", "datatype" : "Quantity, uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setQuantity, setSystem"} **/
						));
Medicinalproductmanufacturedobj.addManufacturer(HapiFHIRHelpers.createReference(medicinalproductmanufactured.getMpmnfctrdMnfctrrRfrnce() /** { "tree" :"MedicinalProductManufactured.manufacturer", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addManufacturer"} **/
						));
Medicinalproductmanufacturedobj.addIngredient(HapiFHIRHelpers.createReference(medicinalproductmanufactured.getMpmnfctrdNgrdntRfrnce() /** { "tree" :"MedicinalProductManufactured.ingredient", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIngredient"} **/
						));
Medicinalproductmanufacturedobj.setPhysicalCharacteristics(HapiFHIRHelpers.createProdCharacteristic(medicinalproductmanufactured.getMpmnfctrdPhsclchrctrsPrdChrctrstc() /** { "tree" :"MedicinalProductManufactured.physicalCharacteristics", "datatype" : "ProdCharacteristic", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPhysicalCharacteristics"} **/
						));
Medicinalproductmanufacturedobj.addOtherCharacteristics(HapiFHIRHelpers.createCodeableConcept(medicinalproductmanufactured.getMpmnfctrdThrchrctrsCcCdngCSstm() /** { "tree" :"MedicinalProductManufactured.otherCharacteristics", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addOtherCharacteristics, addCoding, setSystem"} **/
						, medicinalproductmanufactured.getMpmnfctrdThrchrctrsCcCdngCVrsn() /** { "tree" :"MedicinalProductManufactured.otherCharacteristics", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addOtherCharacteristics, addCoding, setVersion"} **/
						, medicinalproductmanufactured.getMpmnfctrdThrchrctrsCcCdngCCde() /** { "tree" :"MedicinalProductManufactured.otherCharacteristics", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addOtherCharacteristics, addCoding, setCode"} **/
						, medicinalproductmanufactured.getMpmnfctrdThrchrctrsCcCdngCDsplay() /** { "tree" :"MedicinalProductManufactured.otherCharacteristics", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addOtherCharacteristics, addCoding, setDisplay"} **/
						, medicinalproductmanufactured.getMpmnfctrdThrchrctrsCcCdngCSrSlctd() /** { "tree" :"MedicinalProductManufactured.otherCharacteristics", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addOtherCharacteristics, addCoding, setUserSelected"} **/
						, medicinalproductmanufactured.getMpmnfctrdThrchrctrsCcTxt() /** { "tree" :"MedicinalProductManufactured.otherCharacteristics", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addOtherCharacteristics, setText"} **/
		));
	}
}
