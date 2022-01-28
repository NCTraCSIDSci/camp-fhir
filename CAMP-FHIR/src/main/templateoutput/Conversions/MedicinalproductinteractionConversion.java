package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Medicinalproductinteraction.
 * @see .Medicinalproductinteraction
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class MedicinalproductinteractionConversion 
{
	public Patient Medicinalproductinteractions(main.templateoutput.Model.Medicinalproductinteraction medicinalproductinteraction) 
	{
			Patient  Medicinalproductinteractionobj = new Patient(); 

						Medicinalproductinteractionobj.addSubject(HapiFHIRHelpers.createReference(medicinalproductinteraction.getMpinteractionSubjectReference() /** { "tree" :"MedicinalProductInteraction.subject", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSubject"} **/
						));
Medicinalproductinteractionobj.setDescription(HapiFHIRHelpers.createstring(medicinalproductinteraction.getMpinteractionDescriptionString() /** { "tree" :"MedicinalProductInteraction.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDescription"} **/
						));
Medicinalproductinteractionobj.setItemReference(medicinalproduct | medication | substance | observationdefinition)(HapiFHIRHelpers.createReference(medicinalproductinteraction.getMpntrctnNtrctntTmRfrncRfrnce() /** { "tree" :"MedicinalProductInteraction.interactant.itemReference", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["addInteractant"] , "methodName" : "setItemReference(medicinalproduct | medication | substance | observationdefinition)"} **/
						));
Medicinalproductinteractionobj.setItemCodeableconcept(HapiFHIRHelpers.createCodeableConcept(medicinalproductinteraction.getMpntrctnNtrctntTmCdblcncptCcCdngCSstm() /** { "tree" :"MedicinalProductInteraction.interactant.itemCodeableconcept", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addInteractant"] , "methodName" : "setItemCodeableconcept, addCoding, setSystem"} **/
						, medicinalproductinteraction.getMpntrctnNtrctntTmCdblcncptCcCdngCVrsn() /** { "tree" :"MedicinalProductInteraction.interactant.itemCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addInteractant"] , "methodName" : "setItemCodeableconcept, addCoding, setVersion"} **/
						, medicinalproductinteraction.getMpntrctnNtrctntTmCdblcncptCcCdngCCde() /** { "tree" :"MedicinalProductInteraction.interactant.itemCodeableconcept", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addInteractant"] , "methodName" : "setItemCodeableconcept, addCoding, setCode"} **/
						, medicinalproductinteraction.getMpntrctnNtrctntTmCdblcncptCcCdngCDsplay() /** { "tree" :"MedicinalProductInteraction.interactant.itemCodeableconcept", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addInteractant"] , "methodName" : "setItemCodeableconcept, addCoding, setDisplay"} **/
						, medicinalproductinteraction.getMpntrctnNtrctntTmCdblcncptCcCdngCSrSlctd() /** { "tree" :"MedicinalProductInteraction.interactant.itemCodeableconcept", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addInteractant"] , "methodName" : "setItemCodeableconcept, addCoding, setUserSelected"} **/
						, medicinalproductinteraction.getMpntrctnNtrctntTmCdblcncptCcTxt() /** { "tree" :"MedicinalProductInteraction.interactant.itemCodeableconcept", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addInteractant"] , "methodName" : "setItemCodeableconcept, setText"} **/
						));
Medicinalproductinteractionobj.setType(HapiFHIRHelpers.createCodeableConcept(medicinalproductinteraction.getMpntrctnTpCcCdngCSstm() /** { "tree" :"MedicinalProductInteraction.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setSystem"} **/
						, medicinalproductinteraction.getMpntrctnTpCcCdngCVrsn() /** { "tree" :"MedicinalProductInteraction.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setVersion"} **/
						, medicinalproductinteraction.getMpntrctnTpCcCdngCCde() /** { "tree" :"MedicinalProductInteraction.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setCode"} **/
						, medicinalproductinteraction.getMpntrctnTpCcCdngCDsplay() /** { "tree" :"MedicinalProductInteraction.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setDisplay"} **/
						, medicinalproductinteraction.getMpntrctnTpCcCdngCSrSlctd() /** { "tree" :"MedicinalProductInteraction.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, medicinalproductinteraction.getMpinteractionTypeCcText() /** { "tree" :"MedicinalProductInteraction.type", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, setText"} **/
						));
Medicinalproductinteractionobj.setEffect(HapiFHIRHelpers.createCodeableConcept(medicinalproductinteraction.getMpntrctnFfctCcCdngCSstm() /** { "tree" :"MedicinalProductInteraction.effect", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffect, addCoding, setSystem"} **/
						, medicinalproductinteraction.getMpntrctnFfctCcCdngCVrsn() /** { "tree" :"MedicinalProductInteraction.effect", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffect, addCoding, setVersion"} **/
						, medicinalproductinteraction.getMpntrctnFfctCcCdngCCde() /** { "tree" :"MedicinalProductInteraction.effect", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffect, addCoding, setCode"} **/
						, medicinalproductinteraction.getMpntrctnFfctCcCdngCDsplay() /** { "tree" :"MedicinalProductInteraction.effect", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffect, addCoding, setDisplay"} **/
						, medicinalproductinteraction.getMpntrctnFfctCcCdngCSrSlctd() /** { "tree" :"MedicinalProductInteraction.effect", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffect, addCoding, setUserSelected"} **/
						, medicinalproductinteraction.getMpinteractionEffectCcText() /** { "tree" :"MedicinalProductInteraction.effect", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffect, setText"} **/
						));
Medicinalproductinteractionobj.setIncidence(HapiFHIRHelpers.createCodeableConcept(medicinalproductinteraction.getMpntrctnNcdncCcCdngCSstm() /** { "tree" :"MedicinalProductInteraction.incidence", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIncidence, addCoding, setSystem"} **/
						, medicinalproductinteraction.getMpntrctnNcdncCcCdngCVrsn() /** { "tree" :"MedicinalProductInteraction.incidence", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIncidence, addCoding, setVersion"} **/
						, medicinalproductinteraction.getMpntrctnNcdncCcCdngCCde() /** { "tree" :"MedicinalProductInteraction.incidence", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIncidence, addCoding, setCode"} **/
						, medicinalproductinteraction.getMpntrctnNcdncCcCdngCDsplay() /** { "tree" :"MedicinalProductInteraction.incidence", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIncidence, addCoding, setDisplay"} **/
						, medicinalproductinteraction.getMpntrctnNcdncCcCdngCSrSlctd() /** { "tree" :"MedicinalProductInteraction.incidence", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIncidence, addCoding, setUserSelected"} **/
						, medicinalproductinteraction.getMpinteractionIncidenceCcText() /** { "tree" :"MedicinalProductInteraction.incidence", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIncidence, setText"} **/
						));
Medicinalproductinteractionobj.setManagement(HapiFHIRHelpers.createCodeableConcept(medicinalproductinteraction.getMpntrctnMngmntCcCdngCSstm() /** { "tree" :"MedicinalProductInteraction.management", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setManagement, addCoding, setSystem"} **/
						, medicinalproductinteraction.getMpntrctnMngmntCcCdngCVrsn() /** { "tree" :"MedicinalProductInteraction.management", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setManagement, addCoding, setVersion"} **/
						, medicinalproductinteraction.getMpntrctnMngmntCcCdngCCde() /** { "tree" :"MedicinalProductInteraction.management", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setManagement, addCoding, setCode"} **/
						, medicinalproductinteraction.getMpntrctnMngmntCcCdngCDsplay() /** { "tree" :"MedicinalProductInteraction.management", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setManagement, addCoding, setDisplay"} **/
						, medicinalproductinteraction.getMpntrctnMngmntCcCdngCSrSlctd() /** { "tree" :"MedicinalProductInteraction.management", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setManagement, addCoding, setUserSelected"} **/
						, medicinalproductinteraction.getMpinteractionManagementCcText() /** { "tree" :"MedicinalProductInteraction.management", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setManagement, setText"} **/
		));
	}
}
