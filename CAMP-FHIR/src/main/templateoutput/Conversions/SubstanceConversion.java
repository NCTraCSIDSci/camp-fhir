package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Substance.
 * @see .Substance
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class SubstanceConversion 
{
	public Patient Substances(main.templateoutput.Model.Substance substance) 
	{
			Patient  Substanceobj = new Patient(); 

						Substanceobj.addIdentifier(HapiFHIRHelpers.createIdentifier(substance.getSbstncDntfrDntfrSe() /** { "tree" :"Substance.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, substance.getSbstncDntfrDntfrTpCcCSstm() /** { "tree" :"Substance.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, substance.getSbstncDntfrDntfrTpCcCVrsn() /** { "tree" :"Substance.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, substance.getSbstncDntfrDntfrTpCcCCde() /** { "tree" :"Substance.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, substance.getSbstncDntfrDntfrTpCcCDsplay() /** { "tree" :"Substance.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, substance.getSbstncDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Substance.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, substance.getSbstncDntfrDntfrTpCcTxt() /** { "tree" :"Substance.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, substance.getSbstncDntfrDntfrPrdPrdStrt() /** { "tree" :"Substance.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, substance.getSbstncDntfrDntfrPrdPrdNd() /** { "tree" :"Substance.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, substance.getSbstncDntfrDntfrSsgnr() /** { "tree" :"Substance.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, substance.getSbstncDntfrDntfrVlue() /** { "tree" :"Substance.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, substance.getSbstncDntfrDntfrSstm() /** { "tree" :"Substance.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Substanceobj.setStatus(HapiFHIRHelpers.createcode(substance.getSubstanceStatusCode() /** { "tree" :"Substance.status", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Substanceobj.addCategory(HapiFHIRHelpers.createCodeableConcept(substance.getSbstncCtgrCcCdngCSstm() /** { "tree" :"Substance.category", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setSystem"} **/
						, substance.getSbstncCtgrCcCdngCVrsn() /** { "tree" :"Substance.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setVersion"} **/
						, substance.getSbstncCtgrCcCdngCCde() /** { "tree" :"Substance.category", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setCode"} **/
						, substance.getSbstncCtgrCcCdngCDsplay() /** { "tree" :"Substance.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setDisplay"} **/
						, substance.getSbstncCtgrCcCdngCSrSlctd() /** { "tree" :"Substance.category", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setUserSelected"} **/
						, substance.getSubstanceCategoryCcText() /** { "tree" :"Substance.category", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, setText"} **/
						));
Substanceobj.setCode(HapiFHIRHelpers.createCodeableConcept(substance.getSubstanceCodeCcCodingCSystem() /** { "tree" :"Substance.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, addCoding, setSystem"} **/
						, substance.getSubstanceCodeCcCodingCVersion() /** { "tree" :"Substance.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, addCoding, setVersion"} **/
						, substance.getSubstanceCodeCcCodingCCode() /** { "tree" :"Substance.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, addCoding, setCode"} **/
						, substance.getSubstanceCodeCcCodingCDisplay() /** { "tree" :"Substance.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, substance.getSbstncCdCcCdngCSrSlctd() /** { "tree" :"Substance.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, substance.getSubstanceCodeCcText() /** { "tree" :"Substance.code", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, setText"} **/
						));
Substanceobj.setDescription(HapiFHIRHelpers.createstring(substance.getSubstanceDescriptionString() /** { "tree" :"Substance.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDescription"} **/
						));
Substanceobj.setIdentifier(HapiFHIRHelpers.createIdentifier(substance.getSbstncNstncDntfrDntfrSe() /** { "tree" :"Substance.instance.identifier", "datatype" : "Identifier, code", "cardinality" : "ZeroOne", "elementtree" : ["addInstance"] , "methodName" : "setIdentifier, setUse"} **/
						, substance.getSbstncNstncDntfrDntfrTpCcCSstm() /** { "tree" :"Substance.instance.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addInstance"] , "methodName" : "setIdentifier, setType, addCoding, setSystem"} **/
						, substance.getSbstncNstncDntfrDntfrTpCcCVrsn() /** { "tree" :"Substance.instance.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addInstance"] , "methodName" : "setIdentifier, setType, addCoding, setVersion"} **/
						, substance.getSbstncNstncDntfrDntfrTpCcCCde() /** { "tree" :"Substance.instance.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addInstance"] , "methodName" : "setIdentifier, setType, addCoding, setCode"} **/
						, substance.getSbstncNstncDntfrDntfrTpCcCDsplay() /** { "tree" :"Substance.instance.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addInstance"] , "methodName" : "setIdentifier, setType, addCoding, setDisplay"} **/
						, substance.getSbstncNstncDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Substance.instance.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addInstance"] , "methodName" : "setIdentifier, setType, addCoding, setUserSelected"} **/
						, substance.getSbstncNstncDntfrDntfrTpCcTxt() /** { "tree" :"Substance.instance.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addInstance"] , "methodName" : "setIdentifier, setType, setText"} **/
						, substance.getSbstncNstncDntfrDntfrPrdPrdStrt() /** { "tree" :"Substance.instance.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addInstance"] , "methodName" : "setIdentifier, setPeriod, setStart"} **/
						, substance.getSbstncNstncDntfrDntfrPrdPrdNd() /** { "tree" :"Substance.instance.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addInstance"] , "methodName" : "setIdentifier, setPeriod, setEnd"} **/
						, substance.getSbstncNstncDntfrDntfrSsgnr() /** { "tree" :"Substance.instance.identifier", "datatype" : "Identifier, Reference", "cardinality" : "ZeroOne", "elementtree" : ["addInstance"] , "methodName" : "setIdentifier, setAssigner"} **/
						, substance.getSbstncNstncDntfrDntfrVlue() /** { "tree" :"Substance.instance.identifier", "datatype" : "Identifier, string", "cardinality" : "ZeroOne", "elementtree" : ["addInstance"] , "methodName" : "setIdentifier, setValue"} **/
						, substance.getSbstncNstncDntfrDntfrSstm() /** { "tree" :"Substance.instance.identifier", "datatype" : "Identifier, uri", "cardinality" : "ZeroOne", "elementtree" : ["addInstance"] , "methodName" : "setIdentifier, setSystem"} **/
						));
Substanceobj.setExpiry(HapiFHIRHelpers.createdateTime(substance.getSubstanceInstanceExpiryDateTime() /** { "tree" :"Substance.instance.expiry", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addInstance"] , "methodName" : "setExpiry"} **/
						));
Substanceobj.setQuantity(HapiFHIRHelpers.createSimpleQuantity(substance.getSbstncNstncQnttSmplQntty() /** { "tree" :"Substance.instance.quantity", "datatype" : "SimpleQuantity", "cardinality" : "ZeroOne", "elementtree" : ["addInstance"] , "methodName" : "setQuantity"} **/
						));
Substanceobj.setQuantity(HapiFHIRHelpers.createRatio(substance.getSbstncNgrdntQnttRtNmrtrQnttVlue() /** { "tree" :"Substance.ingredient.quantity", "datatype" : "Ratio, Quantity, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addIngredient"] , "methodName" : "setQuantity, setNumerator, setValue"} **/
						, substance.getSbstncNgrdntQnttRtDnmntrQnttVlue() /** { "tree" :"Substance.ingredient.quantity", "datatype" : "Ratio, Quantity, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addIngredient"] , "methodName" : "setQuantity, setDenominator, setValue"} **/
						, substance.getSbstncNgrdntQnttRtNmrtrQnttCmprtr() /** { "tree" :"Substance.ingredient.quantity", "datatype" : "Ratio, Quantity, code", "cardinality" : "ZeroOne", "elementtree" : ["addIngredient"] , "methodName" : "setQuantity, setNumerator, setComparator"} **/
						, substance.getSbstncNgrdntQnttRtDnmntrQnttCmprtr() /** { "tree" :"Substance.ingredient.quantity", "datatype" : "Ratio, Quantity, code", "cardinality" : "ZeroOne", "elementtree" : ["addIngredient"] , "methodName" : "setQuantity, setDenominator, setComparator"} **/
						, substance.getSbstncNgrdntQnttRtNmrtrQnttNt() /** { "tree" :"Substance.ingredient.quantity", "datatype" : "Ratio, Quantity, string", "cardinality" : "ZeroOne", "elementtree" : ["addIngredient"] , "methodName" : "setQuantity, setNumerator, setUnit"} **/
						, substance.getSbstncNgrdntQnttRtDnmntrQnttNt() /** { "tree" :"Substance.ingredient.quantity", "datatype" : "Ratio, Quantity, string", "cardinality" : "ZeroOne", "elementtree" : ["addIngredient"] , "methodName" : "setQuantity, setDenominator, setUnit"} **/
						, substance.getSbstncNgrdntQnttRtNmrtrQnttSstm() /** { "tree" :"Substance.ingredient.quantity", "datatype" : "Ratio, Quantity, uri", "cardinality" : "ZeroOne", "elementtree" : ["addIngredient"] , "methodName" : "setQuantity, setNumerator, setSystem"} **/
						, substance.getSbstncNgrdntQnttRtDnmntrQnttSstm() /** { "tree" :"Substance.ingredient.quantity", "datatype" : "Ratio, Quantity, uri", "cardinality" : "ZeroOne", "elementtree" : ["addIngredient"] , "methodName" : "setQuantity, setDenominator, setSystem"} **/
						, substance.getSbstncNgrdntQnttRtNmrtrQnttCde() /** { "tree" :"Substance.ingredient.quantity", "datatype" : "Ratio, Quantity, code", "cardinality" : "ZeroOne", "elementtree" : ["addIngredient"] , "methodName" : "setQuantity, setNumerator, setCode"} **/
						, substance.getSbstncNgrdntQnttRtDnmntrQnttCde() /** { "tree" :"Substance.ingredient.quantity", "datatype" : "Ratio, Quantity, code", "cardinality" : "ZeroOne", "elementtree" : ["addIngredient"] , "methodName" : "setQuantity, setDenominator, setCode"} **/
						));
Substanceobj.setSubstanceCodeableconcept(HapiFHIRHelpers.createCodeableConcept(substance.getSbstncNgrdntSbstncCdblcncptCcCdngCSstm() /** { "tree" :"Substance.ingredient.substanceCodeableconcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addIngredient"] , "methodName" : "setSubstanceCodeableconcept, addCoding, setSystem"} **/
						, substance.getSbstncNgrdntSbstncCdblcncptCcCdngCVrsn() /** { "tree" :"Substance.ingredient.substanceCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addIngredient"] , "methodName" : "setSubstanceCodeableconcept, addCoding, setVersion"} **/
						, substance.getSbstncNgrdntSbstncCdblcncptCcCdngCCde() /** { "tree" :"Substance.ingredient.substanceCodeableconcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addIngredient"] , "methodName" : "setSubstanceCodeableconcept, addCoding, setCode"} **/
						, substance.getSbstncNgrdntSbstncCdblcncptCcCdngCDsplay() /** { "tree" :"Substance.ingredient.substanceCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addIngredient"] , "methodName" : "setSubstanceCodeableconcept, addCoding, setDisplay"} **/
						, substance.getSbstncNgrdntSbstncCdblcncptCcCdngCSrSlctd() /** { "tree" :"Substance.ingredient.substanceCodeableconcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addIngredient"] , "methodName" : "setSubstanceCodeableconcept, addCoding, setUserSelected"} **/
						, substance.getSbstncNgrdntSbstncCdblcncptCcTxt() /** { "tree" :"Substance.ingredient.substanceCodeableconcept", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addIngredient"] , "methodName" : "setSubstanceCodeableconcept, setText"} **/
						));
Substanceobj.setSubstanceReference(substance)(HapiFHIRHelpers.createReference(substance.getSbstncNgrdntSbstncRfrncRfrnce() /** { "tree" :"Substance.ingredient.substanceReference", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addIngredient"] , "methodName" : "setSubstanceReference(substance)"} **/
		));
	}
}
