package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Bodystructure.
 * @see .Bodystructure
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class BodystructureConversion 
{
	public Patient Bodystructures(main.templateoutput.Model.Bodystructure bodystructure) 
	{
			Patient  Bodystructureobj = new Patient(); 

						Bodystructureobj.addIdentifier(HapiFHIRHelpers.createIdentifier(bodystructure.getBdStrctrDntfrDntfrSe() /** { "tree" :"BodyStructure.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, bodystructure.getBdStrctrDntfrDntfrTpCcCSstm() /** { "tree" :"BodyStructure.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, bodystructure.getBdStrctrDntfrDntfrTpCcCVrsn() /** { "tree" :"BodyStructure.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, bodystructure.getBdStrctrDntfrDntfrTpCcCCde() /** { "tree" :"BodyStructure.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, bodystructure.getBdStrctrDntfrDntfrTpCcCDsplay() /** { "tree" :"BodyStructure.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, bodystructure.getBdStrctrDntfrDntfrTpCcCSrSlctd() /** { "tree" :"BodyStructure.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, bodystructure.getBdStrctrDntfrDntfrTpCcTxt() /** { "tree" :"BodyStructure.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, bodystructure.getBdStrctrDntfrDntfrPrdPrdStrt() /** { "tree" :"BodyStructure.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, bodystructure.getBdStrctrDntfrDntfrPrdPrdNd() /** { "tree" :"BodyStructure.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, bodystructure.getBdStrctrDntfrDntfrSsgnr() /** { "tree" :"BodyStructure.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, bodystructure.getBdStrctrDntfrDntfrVlue() /** { "tree" :"BodyStructure.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, bodystructure.getBdStrctrDntfrDntfrSstm() /** { "tree" :"BodyStructure.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Bodystructureobj.setActive(HapiFHIRHelpers.createboolean(bodystructure.getBodyStructureActiveBoolean() /** { "tree" :"BodyStructure.active", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setActive"} **/
						));
Bodystructureobj.setMorphology(HapiFHIRHelpers.createCodeableConcept(bodystructure.getBdStrctrMrphlgCcCdngCSstm() /** { "tree" :"BodyStructure.morphology", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMorphology, addCoding, setSystem"} **/
						, bodystructure.getBdStrctrMrphlgCcCdngCVrsn() /** { "tree" :"BodyStructure.morphology", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMorphology, addCoding, setVersion"} **/
						, bodystructure.getBdStrctrMrphlgCcCdngCCde() /** { "tree" :"BodyStructure.morphology", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMorphology, addCoding, setCode"} **/
						, bodystructure.getBdStrctrMrphlgCcCdngCDsplay() /** { "tree" :"BodyStructure.morphology", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMorphology, addCoding, setDisplay"} **/
						, bodystructure.getBdStrctrMrphlgCcCdngCSrSlctd() /** { "tree" :"BodyStructure.morphology", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMorphology, addCoding, setUserSelected"} **/
						, bodystructure.getBodyStructureMorphologyCcText() /** { "tree" :"BodyStructure.morphology", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMorphology, setText"} **/
						));
Bodystructureobj.setLocation(HapiFHIRHelpers.createCodeableConcept(bodystructure.getBdStrctrLctnCcCdngCSstm() /** { "tree" :"BodyStructure.location", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setLocation, addCoding, setSystem"} **/
						, bodystructure.getBdStrctrLctnCcCdngCVrsn() /** { "tree" :"BodyStructure.location", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setLocation, addCoding, setVersion"} **/
						, bodystructure.getBdStrctrLctnCcCdngCCde() /** { "tree" :"BodyStructure.location", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setLocation, addCoding, setCode"} **/
						, bodystructure.getBdStrctrLctnCcCdngCDsplay() /** { "tree" :"BodyStructure.location", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setLocation, addCoding, setDisplay"} **/
						, bodystructure.getBdStrctrLctnCcCdngCSrSlctd() /** { "tree" :"BodyStructure.location", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setLocation, addCoding, setUserSelected"} **/
						, bodystructure.getBodyStructureLocationCcText() /** { "tree" :"BodyStructure.location", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setLocation, setText"} **/
						));
Bodystructureobj.addLocationQualifier(HapiFHIRHelpers.createCodeableConcept(bodystructure.getBdStrctrLctnQlfrCcCdngCSstm() /** { "tree" :"BodyStructure.locationQualifier", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addLocationQualifier, addCoding, setSystem"} **/
						, bodystructure.getBdStrctrLctnQlfrCcCdngCVrsn() /** { "tree" :"BodyStructure.locationQualifier", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addLocationQualifier, addCoding, setVersion"} **/
						, bodystructure.getBdStrctrLctnQlfrCcCdngCCde() /** { "tree" :"BodyStructure.locationQualifier", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addLocationQualifier, addCoding, setCode"} **/
						, bodystructure.getBdStrctrLctnQlfrCcCdngCDsplay() /** { "tree" :"BodyStructure.locationQualifier", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addLocationQualifier, addCoding, setDisplay"} **/
						, bodystructure.getBdStrctrLctnQlfrCcCdngCSrSlctd() /** { "tree" :"BodyStructure.locationQualifier", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addLocationQualifier, addCoding, setUserSelected"} **/
						, bodystructure.getBdStrctrLctnQlfrCcTxt() /** { "tree" :"BodyStructure.locationQualifier", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addLocationQualifier, setText"} **/
						));
Bodystructureobj.setDescription(HapiFHIRHelpers.createstring(bodystructure.getBodyStructureDescriptionString() /** { "tree" :"BodyStructure.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDescription"} **/
						));
Bodystructureobj.addImage(HapiFHIRHelpers.createAttachment(bodystructure.getBdStrctrMgTtchmntDta() /** { "tree" :"BodyStructure.image", "datatype" : "Attachment, base64Binary", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addImage, setData"} **/
						, bodystructure.getBdStrctrMgTtchmntHsh() /** { "tree" :"BodyStructure.image", "datatype" : "Attachment, base64Binary", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addImage, setHash"} **/
						, bodystructure.getBdStrctrMgTtchmntCntntTpe() /** { "tree" :"BodyStructure.image", "datatype" : "Attachment, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addImage, setContentType"} **/
						, bodystructure.getBdStrctrMgTtchmntLngge() /** { "tree" :"BodyStructure.image", "datatype" : "Attachment, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addImage, setLanguage"} **/
						, bodystructure.getBdStrctrMgTtchmntCrtn() /** { "tree" :"BodyStructure.image", "datatype" : "Attachment, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addImage, setCreation"} **/
						, bodystructure.getBdStrctrMgTtchmntTtle() /** { "tree" :"BodyStructure.image", "datatype" : "Attachment, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addImage, setTitle"} **/
						, bodystructure.getBdStrctrMgTtchmntSze() /** { "tree" :"BodyStructure.image", "datatype" : "Attachment, unsignedInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addImage, setSize"} **/
						, bodystructure.getBodyStructureImageAttachmentUrl() /** { "tree" :"BodyStructure.image", "datatype" : "Attachment, url", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addImage, setUrl"} **/
						));
Bodystructureobj.setPatient(HapiFHIRHelpers.createReference(bodystructure.getBodyStructurePntReference() /** { "tree" :"BodyStructure.patient", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setPatient"} **/
		));
	}
}
