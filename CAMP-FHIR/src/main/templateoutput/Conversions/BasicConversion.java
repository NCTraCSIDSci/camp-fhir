package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Basic.
 * @see .Basic
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class BasicConversion 
{
	public Patient Basics(main.templateoutput.Model.Basic basic) 
	{
			Patient  Basicobj = new Patient(); 

						Basicobj.addIdentifier(HapiFHIRHelpers.createIdentifier(basic.getBasicIdentifierIdentifierUse() /** { "tree" :"Basic.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, basic.getBscDntfrDntfrTpCcCSstm() /** { "tree" :"Basic.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, basic.getBscDntfrDntfrTpCcCVrsn() /** { "tree" :"Basic.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, basic.getBscDntfrDntfrTpCcCCde() /** { "tree" :"Basic.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, basic.getBscDntfrDntfrTpCcCDsplay() /** { "tree" :"Basic.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, basic.getBscDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Basic.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, basic.getBscDntfrDntfrTpCcTxt() /** { "tree" :"Basic.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, basic.getBscDntfrDntfrPrdPrdStrt() /** { "tree" :"Basic.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, basic.getBscDntfrDntfrPrdPrdNd() /** { "tree" :"Basic.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, basic.getBscDntfrDntfrSsgnr() /** { "tree" :"Basic.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, basic.getBasicIdentifierIdentifierValue() /** { "tree" :"Basic.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, basic.getBasicIdentifierIdentifierSystem() /** { "tree" :"Basic.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Basicobj.setCode(HapiFHIRHelpers.createCodeableConcept(basic.getBasicCodeCcCodingCSystem() /** { "tree" :"Basic.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, addCoding, setSystem"} **/
						, basic.getBasicCodeCcCodingCVersion() /** { "tree" :"Basic.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, addCoding, setVersion"} **/
						, basic.getBasicCodeCcCodingCCode() /** { "tree" :"Basic.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, addCoding, setCode"} **/
						, basic.getBasicCodeCcCodingCDisplay() /** { "tree" :"Basic.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, basic.getBscCdCcCdngCSrSlctd() /** { "tree" :"Basic.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, basic.getBasicCodeCcText() /** { "tree" :"Basic.code", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setCode, setText"} **/
						));
Basicobj.setSubject(HapiFHIRHelpers.createReference(basic.getBasicSubjectReference() /** { "tree" :"Basic.subject", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubject"} **/
						));
Basicobj.setCreated(HapiFHIRHelpers.createdate(basic.getBasicCreatedDate() /** { "tree" :"Basic.created", "datatype" : "date", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCreated"} **/
						));
Basicobj.setAuthor(HapiFHIRHelpers.createReference(basic.getBasicAuthorReference() /** { "tree" :"Basic.author", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAuthor"} **/
		));
	}
}
