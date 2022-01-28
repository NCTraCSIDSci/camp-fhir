package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Researchsubject.
 * @see .Researchsubject
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class ResearchsubjectConversion 
{
	public Patient Researchsubjects(main.templateoutput.Model.Researchsubject researchsubject) 
	{
			Patient  Researchsubjectobj = new Patient(); 

						Researchsubjectobj.addIdentifier(HapiFHIRHelpers.createIdentifier(researchsubject.getRsrchSbjctDntfrDntfrSe() /** { "tree" :"ResearchSubject.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, researchsubject.getRsrchSbjctDntfrDntfrTpCcCSstm() /** { "tree" :"ResearchSubject.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, researchsubject.getRsrchSbjctDntfrDntfrTpCcCVrsn() /** { "tree" :"ResearchSubject.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, researchsubject.getRsrchSbjctDntfrDntfrTpCcCCde() /** { "tree" :"ResearchSubject.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, researchsubject.getRsrchSbjctDntfrDntfrTpCcCDsplay() /** { "tree" :"ResearchSubject.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, researchsubject.getRsrchSbjctDntfrDntfrTpCcCSrSlctd() /** { "tree" :"ResearchSubject.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, researchsubject.getRsrchSbjctDntfrDntfrTpCcTxt() /** { "tree" :"ResearchSubject.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, researchsubject.getRsrchSbjctDntfrDntfrPrdPrdStrt() /** { "tree" :"ResearchSubject.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, researchsubject.getRsrchSbjctDntfrDntfrPrdPrdNd() /** { "tree" :"ResearchSubject.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, researchsubject.getRsrchSbjctDntfrDntfrSsgnr() /** { "tree" :"ResearchSubject.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, researchsubject.getRsrchSbjctDntfrDntfrVlue() /** { "tree" :"ResearchSubject.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, researchsubject.getRsrchSbjctDntfrDntfrSstm() /** { "tree" :"ResearchSubject.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Researchsubjectobj.setStatus(HapiFHIRHelpers.createcode(researchsubject.getResearchSubjectStatusCode() /** { "tree" :"ResearchSubject.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Researchsubjectobj.setPeriod(HapiFHIRHelpers.createPeriod(researchsubject.getRsrchSbjctPrdPrdStrt() /** { "tree" :"ResearchSubject.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPeriod, setStart"} **/
						, researchsubject.getResearchSubjectPeriodPeriodEnd() /** { "tree" :"ResearchSubject.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPeriod, setEnd"} **/
						));
Researchsubjectobj.setStudy(HapiFHIRHelpers.createReference(researchsubject.getResearchSubjectStudyReference() /** { "tree" :"ResearchSubject.study", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStudy"} **/
						));
Researchsubjectobj.setIndividual(HapiFHIRHelpers.createReference(researchsubject.getRsrchSbjctNdvdlRfrnce() /** { "tree" :"ResearchSubject.individual", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setIndividual"} **/
						));
Researchsubjectobj.setAssignedArm(HapiFHIRHelpers.createstring(researchsubject.getResearchSubjectAssignedArmString() /** { "tree" :"ResearchSubject.assignedArm", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setAssignedArm"} **/
						));
Researchsubjectobj.setActualArm(HapiFHIRHelpers.createstring(researchsubject.getResearchSubjectActualArmString() /** { "tree" :"ResearchSubject.actualArm", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setActualArm"} **/
						));
Researchsubjectobj.setConsent(HapiFHIRHelpers.createReference(researchsubject.getResearchSubjectConsentReference() /** { "tree" :"ResearchSubject.consent", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setConsent"} **/
		));
	}
}
