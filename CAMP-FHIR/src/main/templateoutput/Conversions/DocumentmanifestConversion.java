package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Documentmanifest.
 * @see .Documentmanifest
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class DocumentmanifestConversion 
{
	public Patient Documentmanifests(main.templateoutput.Model.Documentmanifest documentmanifest) 
	{
			Patient  Documentmanifestobj = new Patient(); 

						Documentmanifestobj.setMasterIdentifier(HapiFHIRHelpers.createIdentifier(documentmanifest.getDcmntMnfstMstrdntfrDntfrSe() /** { "tree" :"DocumentManifest.masterIdentifier", "datatype" : "Identifier, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMasterIdentifier, setUse"} **/
						, documentmanifest.getDcmntMnfstMstrdntfrDntfrTpCcCSstm() /** { "tree" :"DocumentManifest.masterIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMasterIdentifier, setType, addCoding, setSystem"} **/
						, documentmanifest.getDcmntMnfstMstrdntfrDntfrTpCcCVrsn() /** { "tree" :"DocumentManifest.masterIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMasterIdentifier, setType, addCoding, setVersion"} **/
						, documentmanifest.getDcmntMnfstMstrdntfrDntfrTpCcCCde() /** { "tree" :"DocumentManifest.masterIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMasterIdentifier, setType, addCoding, setCode"} **/
						, documentmanifest.getDcmntMnfstMstrdntfrDntfrTpCcCDsplay() /** { "tree" :"DocumentManifest.masterIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMasterIdentifier, setType, addCoding, setDisplay"} **/
						, documentmanifest.getDcmntMnfstMstrdntfrDntfrTpCcCSrSlctd() /** { "tree" :"DocumentManifest.masterIdentifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMasterIdentifier, setType, addCoding, setUserSelected"} **/
						, documentmanifest.getDcmntMnfstMstrdntfrDntfrTpCcTxt() /** { "tree" :"DocumentManifest.masterIdentifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMasterIdentifier, setType, setText"} **/
						, documentmanifest.getDcmntMnfstMstrdntfrDntfrPrdPrdStrt() /** { "tree" :"DocumentManifest.masterIdentifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMasterIdentifier, setPeriod, setStart"} **/
						, documentmanifest.getDcmntMnfstMstrdntfrDntfrPrdPrdNd() /** { "tree" :"DocumentManifest.masterIdentifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMasterIdentifier, setPeriod, setEnd"} **/
						, documentmanifest.getDcmntMnfstMstrdntfrDntfrSsgnr() /** { "tree" :"DocumentManifest.masterIdentifier", "datatype" : "Identifier, Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMasterIdentifier, setAssigner"} **/
						, documentmanifest.getDcmntMnfstMstrdntfrDntfrVlue() /** { "tree" :"DocumentManifest.masterIdentifier", "datatype" : "Identifier, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMasterIdentifier, setValue"} **/
						, documentmanifest.getDcmntMnfstMstrdntfrDntfrSstm() /** { "tree" :"DocumentManifest.masterIdentifier", "datatype" : "Identifier, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setMasterIdentifier, setSystem"} **/
						));
Documentmanifestobj.addIdentifier(HapiFHIRHelpers.createIdentifier(documentmanifest.getDcmntMnfstDntfrDntfrSe() /** { "tree" :"DocumentManifest.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, documentmanifest.getDcmntMnfstDntfrDntfrTpCcCSstm() /** { "tree" :"DocumentManifest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, documentmanifest.getDcmntMnfstDntfrDntfrTpCcCVrsn() /** { "tree" :"DocumentManifest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, documentmanifest.getDcmntMnfstDntfrDntfrTpCcCCde() /** { "tree" :"DocumentManifest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, documentmanifest.getDcmntMnfstDntfrDntfrTpCcCDsplay() /** { "tree" :"DocumentManifest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, documentmanifest.getDcmntMnfstDntfrDntfrTpCcCSrSlctd() /** { "tree" :"DocumentManifest.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, documentmanifest.getDcmntMnfstDntfrDntfrTpCcTxt() /** { "tree" :"DocumentManifest.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, documentmanifest.getDcmntMnfstDntfrDntfrPrdPrdStrt() /** { "tree" :"DocumentManifest.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, documentmanifest.getDcmntMnfstDntfrDntfrPrdPrdNd() /** { "tree" :"DocumentManifest.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, documentmanifest.getDcmntMnfstDntfrDntfrSsgnr() /** { "tree" :"DocumentManifest.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, documentmanifest.getDcmntMnfstDntfrDntfrVlue() /** { "tree" :"DocumentManifest.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, documentmanifest.getDcmntMnfstDntfrDntfrSstm() /** { "tree" :"DocumentManifest.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Documentmanifestobj.setStatus(HapiFHIRHelpers.createcode(documentmanifest.getDocumentManifestStatusCode() /** { "tree" :"DocumentManifest.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Documentmanifestobj.setType(HapiFHIRHelpers.createCodeableConcept(documentmanifest.getDcmntMnfstTpCcCdngCSstm() /** { "tree" :"DocumentManifest.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setSystem"} **/
						, documentmanifest.getDcmntMnfstTpCcCdngCVrsn() /** { "tree" :"DocumentManifest.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setVersion"} **/
						, documentmanifest.getDcmntMnfstTpCcCdngCCde() /** { "tree" :"DocumentManifest.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setCode"} **/
						, documentmanifest.getDcmntMnfstTpCcCdngCDsplay() /** { "tree" :"DocumentManifest.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setDisplay"} **/
						, documentmanifest.getDcmntMnfstTpCcCdngCSrSlctd() /** { "tree" :"DocumentManifest.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, documentmanifest.getDocumentManifestTypeCcText() /** { "tree" :"DocumentManifest.type", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, setText"} **/
						));
Documentmanifestobj.setSubject(HapiFHIRHelpers.createReference(documentmanifest.getDocumentManifestSubjectReference() /** { "tree" :"DocumentManifest.subject", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSubject"} **/
						));
Documentmanifestobj.setCreated(HapiFHIRHelpers.createdateTime(documentmanifest.getDocumentManifestCreatedDateTime() /** { "tree" :"DocumentManifest.created", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCreated"} **/
						));
Documentmanifestobj.addAuthor(HapiFHIRHelpers.createReference(documentmanifest.getDocumentManifestAuthorReference() /** { "tree" :"DocumentManifest.author", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addAuthor"} **/
						));
Documentmanifestobj.addRecipient(HapiFHIRHelpers.createReference(documentmanifest.getDcmntMnfstRcpntRfrnce() /** { "tree" :"DocumentManifest.recipient", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addRecipient"} **/
						));
Documentmanifestobj.setSource(HapiFHIRHelpers.createuri(documentmanifest.getDocumentManifestSourceUri() /** { "tree" :"DocumentManifest.source", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSource"} **/
						));
Documentmanifestobj.setDescription(HapiFHIRHelpers.createstring(documentmanifest.getDcmntMnfstDscrptnStrng() /** { "tree" :"DocumentManifest.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDescription"} **/
						));
Documentmanifestobj.setContent(HapiFHIRHelpers.createReference(documentmanifest.getDocumentManifestContentReference() /** { "tree" :"DocumentManifest.content", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setContent"} **/
						));
Documentmanifestobj.setIdentifier(HapiFHIRHelpers.createIdentifier(documentmanifest.getDcmntMnfstRltdDntfrDntfrSe() /** { "tree" :"DocumentManifest.related.identifier", "datatype" : "Identifier, code", "cardinality" : "ZeroOne", "elementtree" : ["addRelated"] , "methodName" : "setIdentifier, setUse"} **/
						, documentmanifest.getDcmntMnfstRltdDntfrDntfrTpCcCSstm() /** { "tree" :"DocumentManifest.related.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addRelated"] , "methodName" : "setIdentifier, setType, addCoding, setSystem"} **/
						, documentmanifest.getDcmntMnfstRltdDntfrDntfrTpCcCVrsn() /** { "tree" :"DocumentManifest.related.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addRelated"] , "methodName" : "setIdentifier, setType, addCoding, setVersion"} **/
						, documentmanifest.getDcmntMnfstRltdDntfrDntfrTpCcCCde() /** { "tree" :"DocumentManifest.related.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addRelated"] , "methodName" : "setIdentifier, setType, addCoding, setCode"} **/
						, documentmanifest.getDcmntMnfstRltdDntfrDntfrTpCcCDsplay() /** { "tree" :"DocumentManifest.related.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addRelated"] , "methodName" : "setIdentifier, setType, addCoding, setDisplay"} **/
						, documentmanifest.getDcmntMnfstRltdDntfrDntfrTpCcCSrSlctd() /** { "tree" :"DocumentManifest.related.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addRelated"] , "methodName" : "setIdentifier, setType, addCoding, setUserSelected"} **/
						, documentmanifest.getDcmntMnfstRltdDntfrDntfrTpCcTxt() /** { "tree" :"DocumentManifest.related.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addRelated"] , "methodName" : "setIdentifier, setType, setText"} **/
						, documentmanifest.getDcmntMnfstRltdDntfrDntfrPrdPrdStrt() /** { "tree" :"DocumentManifest.related.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addRelated"] , "methodName" : "setIdentifier, setPeriod, setStart"} **/
						, documentmanifest.getDcmntMnfstRltdDntfrDntfrPrdPrdNd() /** { "tree" :"DocumentManifest.related.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addRelated"] , "methodName" : "setIdentifier, setPeriod, setEnd"} **/
						, documentmanifest.getDcmntMnfstRltdDntfrDntfrSsgnr() /** { "tree" :"DocumentManifest.related.identifier", "datatype" : "Identifier, Reference", "cardinality" : "ZeroOne", "elementtree" : ["addRelated"] , "methodName" : "setIdentifier, setAssigner"} **/
						, documentmanifest.getDcmntMnfstRltdDntfrDntfrVlue() /** { "tree" :"DocumentManifest.related.identifier", "datatype" : "Identifier, string", "cardinality" : "ZeroOne", "elementtree" : ["addRelated"] , "methodName" : "setIdentifier, setValue"} **/
						, documentmanifest.getDcmntMnfstRltdDntfrDntfrSstm() /** { "tree" :"DocumentManifest.related.identifier", "datatype" : "Identifier, uri", "cardinality" : "ZeroOne", "elementtree" : ["addRelated"] , "methodName" : "setIdentifier, setSystem"} **/
						));
Documentmanifestobj.setRef(HapiFHIRHelpers.createReference(documentmanifest.getDcmntMnfstRltdRfRfrnce() /** { "tree" :"DocumentManifest.related.ref", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : ["addRelated"] , "methodName" : "setRef"} **/
		));
	}
}
