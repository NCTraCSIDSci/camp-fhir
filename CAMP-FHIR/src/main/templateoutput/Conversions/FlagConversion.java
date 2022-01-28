package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Flag.
 * @see .Flag
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class FlagConversion 
{
	public Patient Flags(main.templateoutput.Model.Flag flag) 
	{
			Patient  Flagobj = new Patient(); 

						Flagobj.addIdentifier(HapiFHIRHelpers.createIdentifier(flag.getFlagIdentifierIdentifierUse() /** { "tree" :"Flag.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, flag.getFlgDntfrDntfrTpCcCSstm() /** { "tree" :"Flag.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, flag.getFlgDntfrDntfrTpCcCVrsn() /** { "tree" :"Flag.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, flag.getFlgDntfrDntfrTpCcCCde() /** { "tree" :"Flag.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, flag.getFlgDntfrDntfrTpCcCDsplay() /** { "tree" :"Flag.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, flag.getFlgDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Flag.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, flag.getFlgDntfrDntfrTpCcTxt() /** { "tree" :"Flag.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, flag.getFlgDntfrDntfrPrdPrdStrt() /** { "tree" :"Flag.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, flag.getFlgDntfrDntfrPrdPrdNd() /** { "tree" :"Flag.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, flag.getFlgDntfrDntfrSsgnr() /** { "tree" :"Flag.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, flag.getFlagIdentifierIdentifierValue() /** { "tree" :"Flag.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, flag.getFlagIdentifierIdentifierSystem() /** { "tree" :"Flag.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Flagobj.setStatus(HapiFHIRHelpers.createcode(flag.getFlagStatusCode() /** { "tree" :"Flag.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Flagobj.addCategory(HapiFHIRHelpers.createCodeableConcept(flag.getFlagCategoryCcCodingCSystem() /** { "tree" :"Flag.category", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setSystem"} **/
						, flag.getFlagCategoryCcCodingCVersion() /** { "tree" :"Flag.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setVersion"} **/
						, flag.getFlagCategoryCcCodingCCode() /** { "tree" :"Flag.category", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setCode"} **/
						, flag.getFlagCategoryCcCodingCDisplay() /** { "tree" :"Flag.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setDisplay"} **/
						, flag.getFlgCtgrCcCdngCSrSlctd() /** { "tree" :"Flag.category", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setUserSelected"} **/
						, flag.getFlagCategoryCcText() /** { "tree" :"Flag.category", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, setText"} **/
						));
Flagobj.setCode(HapiFHIRHelpers.createCodeableConcept(flag.getFlagCodeCcCodingCSystem() /** { "tree" :"Flag.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, addCoding, setSystem"} **/
						, flag.getFlagCodeCcCodingCVersion() /** { "tree" :"Flag.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, addCoding, setVersion"} **/
						, flag.getFlagCodeCcCodingCCode() /** { "tree" :"Flag.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, addCoding, setCode"} **/
						, flag.getFlagCodeCcCodingCDisplay() /** { "tree" :"Flag.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, flag.getFlagCodeCcCodingCUserSelected() /** { "tree" :"Flag.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, flag.getFlagCodeCcText() /** { "tree" :"Flag.code", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, setText"} **/
						));
Flagobj.setSubject(HapiFHIRHelpers.createReference(flag.getFlagSubjectReference() /** { "tree" :"Flag.subject", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setSubject"} **/
						));
Flagobj.setPeriod(HapiFHIRHelpers.createPeriod(flag.getFlagPeriodPeriodStart() /** { "tree" :"Flag.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPeriod, setStart"} **/
						, flag.getFlagPeriodPeriodEnd() /** { "tree" :"Flag.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPeriod, setEnd"} **/
						));
Flagobj.setEncounter(HapiFHIRHelpers.createReference(flag.getFlagEncounterReference() /** { "tree" :"Flag.encounter", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEncounter"} **/
						));
Flagobj.setAuthor(HapiFHIRHelpers.createReference(flag.getFlagAuthorReference() /** { "tree" :"Flag.author", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAuthor"} **/
		));
	}
}
