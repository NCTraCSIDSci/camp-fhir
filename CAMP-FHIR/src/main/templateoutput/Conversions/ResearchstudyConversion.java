package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Researchstudy.
 * @see .Researchstudy
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class ResearchstudyConversion 
{
	public Patient Researchstudys(main.templateoutput.Model.Researchstudy researchstudy) 
	{
			Patient  Researchstudyobj = new Patient(); 

						Researchstudyobj.addIdentifier(HapiFHIRHelpers.createIdentifier(researchstudy.getRsrchStdDntfrDntfrSe() /** { "tree" :"ResearchStudy.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, researchstudy.getRsrchStdDntfrDntfrTpCcCSstm() /** { "tree" :"ResearchStudy.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, researchstudy.getRsrchStdDntfrDntfrTpCcCVrsn() /** { "tree" :"ResearchStudy.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, researchstudy.getRsrchStdDntfrDntfrTpCcCCde() /** { "tree" :"ResearchStudy.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, researchstudy.getRsrchStdDntfrDntfrTpCcCDsplay() /** { "tree" :"ResearchStudy.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, researchstudy.getRsrchStdDntfrDntfrTpCcCSrSlctd() /** { "tree" :"ResearchStudy.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, researchstudy.getRsrchStdDntfrDntfrTpCcTxt() /** { "tree" :"ResearchStudy.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, researchstudy.getRsrchStdDntfrDntfrPrdPrdStrt() /** { "tree" :"ResearchStudy.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, researchstudy.getRsrchStdDntfrDntfrPrdPrdNd() /** { "tree" :"ResearchStudy.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, researchstudy.getRsrchStdDntfrDntfrSsgnr() /** { "tree" :"ResearchStudy.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, researchstudy.getRsrchStdDntfrDntfrVlue() /** { "tree" :"ResearchStudy.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, researchstudy.getRsrchStdDntfrDntfrSstm() /** { "tree" :"ResearchStudy.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Researchstudyobj.setTitle(HapiFHIRHelpers.createstring(researchstudy.getResearchStudyTitleString() /** { "tree" :"ResearchStudy.title", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTitle"} **/
						));
Researchstudyobj.addProtocol(HapiFHIRHelpers.createReference(researchstudy.getResearchStudyProtocolReference() /** { "tree" :"ResearchStudy.protocol", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addProtocol"} **/
						));
Researchstudyobj.addPartOf(HapiFHIRHelpers.createReference(researchstudy.getResearchStudyPartOfReference() /** { "tree" :"ResearchStudy.partOf", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPartOf"} **/
						));
Researchstudyobj.setStatus(HapiFHIRHelpers.createcode(researchstudy.getResearchStudyStatusCode() /** { "tree" :"ResearchStudy.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Researchstudyobj.setPrimaryPurposeType(HapiFHIRHelpers.createCodeableConcept(researchstudy.getRsrchStdPrmrPrpsTpCcCdngCSstm() /** { "tree" :"ResearchStudy.primaryPurposeType", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPrimaryPurposeType, addCoding, setSystem"} **/
						, researchstudy.getRsrchStdPrmrPrpsTpCcCdngCVrsn() /** { "tree" :"ResearchStudy.primaryPurposeType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPrimaryPurposeType, addCoding, setVersion"} **/
						, researchstudy.getRsrchStdPrmrPrpsTpCcCdngCCde() /** { "tree" :"ResearchStudy.primaryPurposeType", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPrimaryPurposeType, addCoding, setCode"} **/
						, researchstudy.getRsrchStdPrmrPrpsTpCcCdngCDsplay() /** { "tree" :"ResearchStudy.primaryPurposeType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPrimaryPurposeType, addCoding, setDisplay"} **/
						, researchstudy.getRsrchStdPrmrPrpsTpCcCdngCSrSlctd() /** { "tree" :"ResearchStudy.primaryPurposeType", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPrimaryPurposeType, addCoding, setUserSelected"} **/
						, researchstudy.getRsrchStdPrmrPrpsTpCcTxt() /** { "tree" :"ResearchStudy.primaryPurposeType", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPrimaryPurposeType, setText"} **/
						));
Researchstudyobj.setPhase(HapiFHIRHelpers.createCodeableConcept(researchstudy.getRsrchStdPhsCcCdngCSstm() /** { "tree" :"ResearchStudy.phase", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPhase, addCoding, setSystem"} **/
						, researchstudy.getRsrchStdPhsCcCdngCVrsn() /** { "tree" :"ResearchStudy.phase", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPhase, addCoding, setVersion"} **/
						, researchstudy.getRsrchStdPhsCcCdngCCde() /** { "tree" :"ResearchStudy.phase", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPhase, addCoding, setCode"} **/
						, researchstudy.getRsrchStdPhsCcCdngCDsplay() /** { "tree" :"ResearchStudy.phase", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPhase, addCoding, setDisplay"} **/
						, researchstudy.getRsrchStdPhsCcCdngCSrSlctd() /** { "tree" :"ResearchStudy.phase", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPhase, addCoding, setUserSelected"} **/
						, researchstudy.getResearchStudyPhaseCcText() /** { "tree" :"ResearchStudy.phase", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPhase, setText"} **/
						));
Researchstudyobj.addCategory(HapiFHIRHelpers.createCodeableConcept(researchstudy.getRsrchStdCtgrCcCdngCSstm() /** { "tree" :"ResearchStudy.category", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setSystem"} **/
						, researchstudy.getRsrchStdCtgrCcCdngCVrsn() /** { "tree" :"ResearchStudy.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setVersion"} **/
						, researchstudy.getRsrchStdCtgrCcCdngCCde() /** { "tree" :"ResearchStudy.category", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setCode"} **/
						, researchstudy.getRsrchStdCtgrCcCdngCDsplay() /** { "tree" :"ResearchStudy.category", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setDisplay"} **/
						, researchstudy.getRsrchStdCtgrCcCdngCSrSlctd() /** { "tree" :"ResearchStudy.category", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, addCoding, setUserSelected"} **/
						, researchstudy.getResearchStudyCategoryCcText() /** { "tree" :"ResearchStudy.category", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCategory, setText"} **/
						));
Researchstudyobj.addFocus(HapiFHIRHelpers.createCodeableConcept(researchstudy.getRsrchStdFcsCcCdngCSstm() /** { "tree" :"ResearchStudy.focus", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addFocus, addCoding, setSystem"} **/
						, researchstudy.getRsrchStdFcsCcCdngCVrsn() /** { "tree" :"ResearchStudy.focus", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addFocus, addCoding, setVersion"} **/
						, researchstudy.getRsrchStdFcsCcCdngCCde() /** { "tree" :"ResearchStudy.focus", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addFocus, addCoding, setCode"} **/
						, researchstudy.getRsrchStdFcsCcCdngCDsplay() /** { "tree" :"ResearchStudy.focus", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addFocus, addCoding, setDisplay"} **/
						, researchstudy.getRsrchStdFcsCcCdngCSrSlctd() /** { "tree" :"ResearchStudy.focus", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addFocus, addCoding, setUserSelected"} **/
						, researchstudy.getResearchStudyFocusCcText() /** { "tree" :"ResearchStudy.focus", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addFocus, setText"} **/
						));
Researchstudyobj.addCondition(HapiFHIRHelpers.createCodeableConcept(researchstudy.getRsrchStdCndtnCcCdngCSstm() /** { "tree" :"ResearchStudy.condition", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCondition, addCoding, setSystem"} **/
						, researchstudy.getRsrchStdCndtnCcCdngCVrsn() /** { "tree" :"ResearchStudy.condition", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCondition, addCoding, setVersion"} **/
						, researchstudy.getRsrchStdCndtnCcCdngCCde() /** { "tree" :"ResearchStudy.condition", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCondition, addCoding, setCode"} **/
						, researchstudy.getRsrchStdCndtnCcCdngCDsplay() /** { "tree" :"ResearchStudy.condition", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCondition, addCoding, setDisplay"} **/
						, researchstudy.getRsrchStdCndtnCcCdngCSrSlctd() /** { "tree" :"ResearchStudy.condition", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCondition, addCoding, setUserSelected"} **/
						, researchstudy.getResearchStudyConditionCcText() /** { "tree" :"ResearchStudy.condition", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addCondition, setText"} **/
						));
Researchstudyobj.addContact(HapiFHIRHelpers.createContactDetail(researchstudy.getRsrchStdCntctCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"ResearchStudy.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setStart"} **/
						, researchstudy.getRsrchStdCntctCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"ResearchStudy.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setEnd"} **/
						, researchstudy.getRsrchStdCntctCntctDtlTlcmCntctPntSstm() /** { "tree" :"ResearchStudy.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setSystem"} **/
						, researchstudy.getRsrchStdCntctCntctDtlTlcmCntctPntVlue() /** { "tree" :"ResearchStudy.contact", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setValue"} **/
						, researchstudy.getRsrchStdCntctCntctDtlTlcmCntctPntSe() /** { "tree" :"ResearchStudy.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setUse"} **/
						, researchstudy.getRsrchStdCntctCntctDtlTlcmCntctPntRnk() /** { "tree" :"ResearchStudy.contact", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setRank"} **/
						, researchstudy.getRsrchStdCntctCntctDtlNme() /** { "tree" :"ResearchStudy.contact", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, addName"} **/
						));
Researchstudyobj.addRelatedArtifact(HapiFHIRHelpers.createRelatedArtifact(researchstudy.getRsrchStdRltdrtfctRltdrtfctDcmntTtchmntCntntTpe() /** { "tree" :"ResearchStudy.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setContentType"} **/
						, researchstudy.getRsrchStdRltdrtfctRltdrtfctDcmntTtchmntLngge() /** { "tree" :"ResearchStudy.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setLanguage"} **/
						, researchstudy.getRsrchStdRltdrtfctRltdrtfctDcmntTtchmntDta() /** { "tree" :"ResearchStudy.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, base64Binary", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setData"} **/
						, researchstudy.getRsrchStdRltdrtfctRltdrtfctDcmntTtchmntRl() /** { "tree" :"ResearchStudy.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, url", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setUrl"} **/
						, researchstudy.getRsrchStdRltdrtfctRltdrtfctDcmntTtchmntSze() /** { "tree" :"ResearchStudy.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, unsignedInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setSize"} **/
						, researchstudy.getRsrchStdRltdrtfctRltdrtfctDcmntTtchmntHsh() /** { "tree" :"ResearchStudy.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, base64Binary", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setHash"} **/
						, researchstudy.getRsrchStdRltdrtfctRltdrtfctDcmntTtchmntTtle() /** { "tree" :"ResearchStudy.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setTitle"} **/
						, researchstudy.getRsrchStdRltdrtfctRltdrtfctDcmntTtchmntCrtn() /** { "tree" :"ResearchStudy.relatedArtifact", "datatype" : "RelatedArtifact, Attachment, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDocument, setCreation"} **/
						, researchstudy.getRsrchStdRltdrtfctRltdrtfctRsrce() /** { "tree" :"ResearchStudy.relatedArtifact", "datatype" : "RelatedArtifact, canonical", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setResource"} **/
						, researchstudy.getRsrchStdRltdrtfctRltdrtfctTpe() /** { "tree" :"ResearchStudy.relatedArtifact", "datatype" : "RelatedArtifact, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setType"} **/
						, researchstudy.getRsrchStdRltdrtfctRltdrtfctCttn() /** { "tree" :"ResearchStudy.relatedArtifact", "datatype" : "RelatedArtifact, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setCitation"} **/
						, researchstudy.getRsrchStdRltdrtfctRltdrtfctLbl() /** { "tree" :"ResearchStudy.relatedArtifact", "datatype" : "RelatedArtifact, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setLabel"} **/
						, researchstudy.getRsrchStdRltdrtfctRltdrtfctDsplay() /** { "tree" :"ResearchStudy.relatedArtifact", "datatype" : "RelatedArtifact, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setDisplay"} **/
						, researchstudy.getRsrchStdRltdrtfctRltdrtfctRl() /** { "tree" :"ResearchStudy.relatedArtifact", "datatype" : "RelatedArtifact, url", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRelatedArtifact, setUrl"} **/
						));
Researchstudyobj.addKeyword(HapiFHIRHelpers.createCodeableConcept(researchstudy.getRsrchStdKwrdCcCdngCSstm() /** { "tree" :"ResearchStudy.keyword", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addKeyword, addCoding, setSystem"} **/
						, researchstudy.getRsrchStdKwrdCcCdngCVrsn() /** { "tree" :"ResearchStudy.keyword", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addKeyword, addCoding, setVersion"} **/
						, researchstudy.getRsrchStdKwrdCcCdngCCde() /** { "tree" :"ResearchStudy.keyword", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addKeyword, addCoding, setCode"} **/
						, researchstudy.getRsrchStdKwrdCcCdngCDsplay() /** { "tree" :"ResearchStudy.keyword", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addKeyword, addCoding, setDisplay"} **/
						, researchstudy.getRsrchStdKwrdCcCdngCSrSlctd() /** { "tree" :"ResearchStudy.keyword", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addKeyword, addCoding, setUserSelected"} **/
						, researchstudy.getResearchStudyKeywordCcText() /** { "tree" :"ResearchStudy.keyword", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addKeyword, setText"} **/
						));
Researchstudyobj.addLocation(HapiFHIRHelpers.createCodeableConcept(researchstudy.getRsrchStdLctnCcCdngCSstm() /** { "tree" :"ResearchStudy.location", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addLocation, addCoding, setSystem"} **/
						, researchstudy.getRsrchStdLctnCcCdngCVrsn() /** { "tree" :"ResearchStudy.location", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addLocation, addCoding, setVersion"} **/
						, researchstudy.getRsrchStdLctnCcCdngCCde() /** { "tree" :"ResearchStudy.location", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addLocation, addCoding, setCode"} **/
						, researchstudy.getRsrchStdLctnCcCdngCDsplay() /** { "tree" :"ResearchStudy.location", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addLocation, addCoding, setDisplay"} **/
						, researchstudy.getRsrchStdLctnCcCdngCSrSlctd() /** { "tree" :"ResearchStudy.location", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addLocation, addCoding, setUserSelected"} **/
						, researchstudy.getResearchStudyLocationCcText() /** { "tree" :"ResearchStudy.location", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addLocation, setText"} **/
						));
Researchstudyobj.setDescription(HapiFHIRHelpers.createmarkdown(researchstudy.getResearchStudyDescriptionMarkdown() /** { "tree" :"ResearchStudy.description", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDescription"} **/
						));
Researchstudyobj.addEnrollment(HapiFHIRHelpers.createReference(researchstudy.getResearchStudyEnrollmentReference() /** { "tree" :"ResearchStudy.enrollment", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addEnrollment"} **/
						));
Researchstudyobj.setPeriod(HapiFHIRHelpers.createPeriod(researchstudy.getResearchStudyPeriodPeriodStart() /** { "tree" :"ResearchStudy.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPeriod, setStart"} **/
						, researchstudy.getResearchStudyPeriodPeriodEnd() /** { "tree" :"ResearchStudy.period", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPeriod, setEnd"} **/
						));
Researchstudyobj.setSponsor(HapiFHIRHelpers.createReference(researchstudy.getResearchStudySponsorReference() /** { "tree" :"ResearchStudy.sponsor", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSponsor"} **/
						));
Researchstudyobj.setPrincipalInvestigator(HapiFHIRHelpers.createReference(researchstudy.getRsrchStdPrncplnvstgtrRfrnce() /** { "tree" :"ResearchStudy.principalInvestigator", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPrincipalInvestigator"} **/
						));
Researchstudyobj.addSite(HapiFHIRHelpers.createReference(researchstudy.getResearchStudySiteReference() /** { "tree" :"ResearchStudy.site", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSite"} **/
						));
Researchstudyobj.setReasonStopped(HapiFHIRHelpers.createCodeableConcept(researchstudy.getRsrchStdRsnStppdCcCdngCSstm() /** { "tree" :"ResearchStudy.reasonStopped", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setReasonStopped, addCoding, setSystem"} **/
						, researchstudy.getRsrchStdRsnStppdCcCdngCVrsn() /** { "tree" :"ResearchStudy.reasonStopped", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setReasonStopped, addCoding, setVersion"} **/
						, researchstudy.getRsrchStdRsnStppdCcCdngCCde() /** { "tree" :"ResearchStudy.reasonStopped", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setReasonStopped, addCoding, setCode"} **/
						, researchstudy.getRsrchStdRsnStppdCcCdngCDsplay() /** { "tree" :"ResearchStudy.reasonStopped", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setReasonStopped, addCoding, setDisplay"} **/
						, researchstudy.getRsrchStdRsnStppdCcCdngCSrSlctd() /** { "tree" :"ResearchStudy.reasonStopped", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setReasonStopped, addCoding, setUserSelected"} **/
						, researchstudy.getRsrchStdRsnStppdCcTxt() /** { "tree" :"ResearchStudy.reasonStopped", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setReasonStopped, setText"} **/
						));
Researchstudyobj.addNote(HapiFHIRHelpers.createAnnotation(researchstudy.getResearchStudyNoteAnnotationTime() /** { "tree" :"ResearchStudy.note", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setTime"} **/
						, researchstudy.getResearchStudyNoteAnnotationText() /** { "tree" :"ResearchStudy.note", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setText"} **/
						, researchstudy.getRsrchStdNtNnttnThrRfrnce() /** { "tree" :"ResearchStudy.note", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorReference"} **/
						, researchstudy.getRsrchStdNtNnttnThrStrng() /** { "tree" :"ResearchStudy.note", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorString"} **/
						));
Researchstudyobj.setName(HapiFHIRHelpers.createstring(researchstudy.getResearchStudyArmNameString() /** { "tree" :"ResearchStudy.arm.name", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addArm"] , "methodName" : "setName"} **/
						));
Researchstudyobj.setType(HapiFHIRHelpers.createCodeableConcept(researchstudy.getRsrchStdRmTpCcCdngCSstm() /** { "tree" :"ResearchStudy.arm.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addArm"] , "methodName" : "setType, addCoding, setSystem"} **/
						, researchstudy.getRsrchStdRmTpCcCdngCVrsn() /** { "tree" :"ResearchStudy.arm.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addArm"] , "methodName" : "setType, addCoding, setVersion"} **/
						, researchstudy.getRsrchStdRmTpCcCdngCCde() /** { "tree" :"ResearchStudy.arm.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addArm"] , "methodName" : "setType, addCoding, setCode"} **/
						, researchstudy.getRsrchStdRmTpCcCdngCDsplay() /** { "tree" :"ResearchStudy.arm.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addArm"] , "methodName" : "setType, addCoding, setDisplay"} **/
						, researchstudy.getRsrchStdRmTpCcCdngCSrSlctd() /** { "tree" :"ResearchStudy.arm.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addArm"] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, researchstudy.getResearchStudyArmTypeCcText() /** { "tree" :"ResearchStudy.arm.type", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addArm"] , "methodName" : "setType, setText"} **/
						));
Researchstudyobj.setDescription(HapiFHIRHelpers.createstring(researchstudy.getRsrchStdRmDscrptnStrng() /** { "tree" :"ResearchStudy.arm.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addArm"] , "methodName" : "setDescription"} **/
						));
Researchstudyobj.setName(HapiFHIRHelpers.createstring(researchstudy.getRsrchStdBjctvNmStrng() /** { "tree" :"ResearchStudy.objective.name", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addObjective"] , "methodName" : "setName"} **/
						));
Researchstudyobj.setType(HapiFHIRHelpers.createCodeableConcept(researchstudy.getRsrchStdBjctvTpCcCdngCSstm() /** { "tree" :"ResearchStudy.objective.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addObjective"] , "methodName" : "setType, addCoding, setSystem"} **/
						, researchstudy.getRsrchStdBjctvTpCcCdngCVrsn() /** { "tree" :"ResearchStudy.objective.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addObjective"] , "methodName" : "setType, addCoding, setVersion"} **/
						, researchstudy.getRsrchStdBjctvTpCcCdngCCde() /** { "tree" :"ResearchStudy.objective.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addObjective"] , "methodName" : "setType, addCoding, setCode"} **/
						, researchstudy.getRsrchStdBjctvTpCcCdngCDsplay() /** { "tree" :"ResearchStudy.objective.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addObjective"] , "methodName" : "setType, addCoding, setDisplay"} **/
						, researchstudy.getRsrchStdBjctvTpCcCdngCSrSlctd() /** { "tree" :"ResearchStudy.objective.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addObjective"] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, researchstudy.getRsrchStdBjctvTpCcTxt() /** { "tree" :"ResearchStudy.objective.type", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addObjective"] , "methodName" : "setType, setText"} **/
		));
	}
}
