package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Conceptmap.
 * @see .Conceptmap
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class ConceptmapConversion 
{
	public Patient Conceptmaps(main.templateoutput.Model.Conceptmap conceptmap) 
	{
			Patient  Conceptmapobj = new Patient(); 

						Conceptmapobj.setUrl(HapiFHIRHelpers.createuri(conceptmap.getConceptMapUrlUri() /** { "tree" :"ConceptMap.url", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setUrl"} **/
						));
Conceptmapobj.setIdentifier(HapiFHIRHelpers.createIdentifier(conceptmap.getCncptMpDntfrDntfrSe() /** { "tree" :"ConceptMap.identifier", "datatype" : "Identifier, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setUse"} **/
						, conceptmap.getCncptMpDntfrDntfrTpCcCSstm() /** { "tree" :"ConceptMap.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, addCoding, setSystem"} **/
						, conceptmap.getCncptMpDntfrDntfrTpCcCVrsn() /** { "tree" :"ConceptMap.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, addCoding, setVersion"} **/
						, conceptmap.getCncptMpDntfrDntfrTpCcCCde() /** { "tree" :"ConceptMap.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, addCoding, setCode"} **/
						, conceptmap.getCncptMpDntfrDntfrTpCcCDsplay() /** { "tree" :"ConceptMap.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, addCoding, setDisplay"} **/
						, conceptmap.getCncptMpDntfrDntfrTpCcCSrSlctd() /** { "tree" :"ConceptMap.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, addCoding, setUserSelected"} **/
						, conceptmap.getCncptMpDntfrDntfrTpCcTxt() /** { "tree" :"ConceptMap.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setType, setText"} **/
						, conceptmap.getCncptMpDntfrDntfrPrdPrdStrt() /** { "tree" :"ConceptMap.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setPeriod, setStart"} **/
						, conceptmap.getCncptMpDntfrDntfrPrdPrdNd() /** { "tree" :"ConceptMap.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setPeriod, setEnd"} **/
						, conceptmap.getCncptMpDntfrDntfrSsgnr() /** { "tree" :"ConceptMap.identifier", "datatype" : "Identifier, Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setAssigner"} **/
						, conceptmap.getCncptMpDntfrDntfrVlue() /** { "tree" :"ConceptMap.identifier", "datatype" : "Identifier, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setValue"} **/
						, conceptmap.getCncptMpDntfrDntfrSstm() /** { "tree" :"ConceptMap.identifier", "datatype" : "Identifier, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setIdentifier, setSystem"} **/
						));
Conceptmapobj.setVersion(HapiFHIRHelpers.createstring(conceptmap.getConceptMapVersionString() /** { "tree" :"ConceptMap.version", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setVersion"} **/
						));
Conceptmapobj.setName(HapiFHIRHelpers.createstring(conceptmap.getConceptMapNameString() /** { "tree" :"ConceptMap.name", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setName"} **/
						));
Conceptmapobj.setTitle(HapiFHIRHelpers.createstring(conceptmap.getConceptMapTitleString() /** { "tree" :"ConceptMap.title", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTitle"} **/
						));
Conceptmapobj.setStatus(HapiFHIRHelpers.createcode(conceptmap.getConceptMapStatusCode() /** { "tree" :"ConceptMap.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Conceptmapobj.setExperimental(HapiFHIRHelpers.createboolean(conceptmap.getConceptMapExperimentalBoolean() /** { "tree" :"ConceptMap.experimental", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setExperimental"} **/
						));
Conceptmapobj.setDate(HapiFHIRHelpers.createdateTime(conceptmap.getConceptMapDateDateTime() /** { "tree" :"ConceptMap.date", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDate"} **/
						));
Conceptmapobj.setPublisher(HapiFHIRHelpers.createstring(conceptmap.getConceptMapPublisherString() /** { "tree" :"ConceptMap.publisher", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPublisher"} **/
						));
Conceptmapobj.addContact(HapiFHIRHelpers.createContactDetail(conceptmap.getCncptMpCntctCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"ConceptMap.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setStart"} **/
						, conceptmap.getCncptMpCntctCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"ConceptMap.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setEnd"} **/
						, conceptmap.getCncptMpCntctCntctDtlTlcmCntctPntSstm() /** { "tree" :"ConceptMap.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setSystem"} **/
						, conceptmap.getCncptMpCntctCntctDtlTlcmCntctPntVlue() /** { "tree" :"ConceptMap.contact", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setValue"} **/
						, conceptmap.getCncptMpCntctCntctDtlTlcmCntctPntSe() /** { "tree" :"ConceptMap.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setUse"} **/
						, conceptmap.getCncptMpCntctCntctDtlTlcmCntctPntRnk() /** { "tree" :"ConceptMap.contact", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setRank"} **/
						, conceptmap.getCncptMpCntctCntctDtlNme() /** { "tree" :"ConceptMap.contact", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, addName"} **/
						));
Conceptmapobj.setDescription(HapiFHIRHelpers.createmarkdown(conceptmap.getConceptMapDescriptionMarkdown() /** { "tree" :"ConceptMap.description", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDescription"} **/
						));
Conceptmapobj.addUseContext(HapiFHIRHelpers.createUsageContext(conceptmap.getCncptMpSCntxtSgCntxtVlCcCcCSstm() /** { "tree" :"ConceptMap.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setSystem"} **/
						, conceptmap.getCncptMpSCntxtSgCntxtVlCcCcCVrsn() /** { "tree" :"ConceptMap.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setVersion"} **/
						, conceptmap.getCncptMpSCntxtSgCntxtVlCcCcCCde() /** { "tree" :"ConceptMap.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setCode"} **/
						, conceptmap.getCncptMpSCntxtSgCntxtVlCcCcCDsplay() /** { "tree" :"ConceptMap.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setDisplay"} **/
						, conceptmap.getCncptMpSCntxtSgCntxtVlCcCcCSrSlctd() /** { "tree" :"ConceptMap.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setUserSelected"} **/
						, conceptmap.getCncptMpSCntxtSgCntxtVlCcCcTxt() /** { "tree" :"ConceptMap.useContext", "datatype" : "UsageContext, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, setText"} **/
						, conceptmap.getCncptMpSCntxtSgCntxtCdCSstm() /** { "tree" :"ConceptMap.useContext", "datatype" : "UsageContext, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setSystem"} **/
						, conceptmap.getCncptMpSCntxtSgCntxtCdCVrsn() /** { "tree" :"ConceptMap.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setVersion"} **/
						, conceptmap.getCncptMpSCntxtSgCntxtCdCCde() /** { "tree" :"ConceptMap.useContext", "datatype" : "UsageContext, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setCode"} **/
						, conceptmap.getCncptMpSCntxtSgCntxtCdCDsplay() /** { "tree" :"ConceptMap.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setDisplay"} **/
						, conceptmap.getCncptMpSCntxtSgCntxtCdCSrSlctd() /** { "tree" :"ConceptMap.useContext", "datatype" : "UsageContext, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setUserSelected"} **/
						, conceptmap.getCncptMpSCntxtSgCntxtVlQnttQnttVlue() /** { "tree" :"ConceptMap.useContext", "datatype" : "UsageContext, Quantity, decimal", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setValue"} **/
						, conceptmap.getCncptMpSCntxtSgCntxtVlQnttQnttCmprtr() /** { "tree" :"ConceptMap.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setComparator"} **/
						, conceptmap.getCncptMpSCntxtSgCntxtVlQnttQnttNt() /** { "tree" :"ConceptMap.useContext", "datatype" : "UsageContext, Quantity, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setUnit"} **/
						, conceptmap.getCncptMpSCntxtSgCntxtVlQnttQnttSstm() /** { "tree" :"ConceptMap.useContext", "datatype" : "UsageContext, Quantity, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setSystem"} **/
						, conceptmap.getCncptMpSCntxtSgCntxtVlQnttQnttCde() /** { "tree" :"ConceptMap.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setCode"} **/
						, conceptmap.getCncptMpSCntxtSgCntxtVlRngRngLw() /** { "tree" :"ConceptMap.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setLow"} **/
						, conceptmap.getCncptMpSCntxtSgCntxtVlRngRngHgh() /** { "tree" :"ConceptMap.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setHigh"} **/
						, conceptmap.getCncptMpSCntxtSgCntxtVlRfrnce() /** { "tree" :"ConceptMap.useContext", "datatype" : "UsageContext, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueReference"} **/
						));
Conceptmapobj.addJurisdiction(HapiFHIRHelpers.createCodeableConcept(conceptmap.getCncptMpJrsdctnCcCdngCSstm() /** { "tree" :"ConceptMap.jurisdiction", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setSystem"} **/
						, conceptmap.getCncptMpJrsdctnCcCdngCVrsn() /** { "tree" :"ConceptMap.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setVersion"} **/
						, conceptmap.getCncptMpJrsdctnCcCdngCCde() /** { "tree" :"ConceptMap.jurisdiction", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setCode"} **/
						, conceptmap.getCncptMpJrsdctnCcCdngCDsplay() /** { "tree" :"ConceptMap.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setDisplay"} **/
						, conceptmap.getCncptMpJrsdctnCcCdngCSrSlctd() /** { "tree" :"ConceptMap.jurisdiction", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setUserSelected"} **/
						, conceptmap.getConceptMapJurisdictionCcText() /** { "tree" :"ConceptMap.jurisdiction", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, setText"} **/
						));
Conceptmapobj.setPurpose(HapiFHIRHelpers.createmarkdown(conceptmap.getConceptMapPurposeMarkdown() /** { "tree" :"ConceptMap.purpose", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPurpose"} **/
						));
Conceptmapobj.setCopyright(HapiFHIRHelpers.createmarkdown(conceptmap.getConceptMapCopyrightMarkdown() /** { "tree" :"ConceptMap.copyright", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCopyright"} **/
						));
Conceptmapobj.setSourceUri(HapiFHIRHelpers.createuri(conceptmap.getConceptMapSourceUriUri() /** { "tree" :"ConceptMap.sourceUri", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSourceUri"} **/
						));
Conceptmapobj.setSourceCanonical(valueset)(HapiFHIRHelpers.createcanonical(conceptmap.getCncptMpSrcCnnclCnncl() /** { "tree" :"ConceptMap.sourceCanonical", "datatype" : "canonical", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSourceCanonical(valueset)"} **/
						));
Conceptmapobj.setTargetUri(HapiFHIRHelpers.createuri(conceptmap.getConceptMapTargetUriUri() /** { "tree" :"ConceptMap.targetUri", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTargetUri"} **/
						));
Conceptmapobj.setTargetCanonical(valueset)(HapiFHIRHelpers.createcanonical(conceptmap.getCncptMpTrgtCnnclCnncl() /** { "tree" :"ConceptMap.targetCanonical", "datatype" : "canonical", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTargetCanonical(valueset)"} **/
						));
Conceptmapobj.setSource(HapiFHIRHelpers.createuri(conceptmap.getConceptMapGroupSourceUri() /** { "tree" :"ConceptMap.group.source", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : ["addGroup"] , "methodName" : "setSource"} **/
						));
Conceptmapobj.setSourceVersion(HapiFHIRHelpers.createstring(conceptmap.getCncptMpGrpSrcVrsnStrng() /** { "tree" :"ConceptMap.group.sourceVersion", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addGroup"] , "methodName" : "setSourceVersion"} **/
						));
Conceptmapobj.setTarget(HapiFHIRHelpers.createuri(conceptmap.getConceptMapGroupTargetUri() /** { "tree" :"ConceptMap.group.target", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : ["addGroup"] , "methodName" : "setTarget"} **/
						));
Conceptmapobj.setTargetVersion(HapiFHIRHelpers.createstring(conceptmap.getCncptMpGrpTrgtVrsnStrng() /** { "tree" :"ConceptMap.group.targetVersion", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addGroup"] , "methodName" : "setTargetVersion"} **/
						));
Conceptmapobj.setCode(HapiFHIRHelpers.createcode(conceptmap.getConceptMapGroupElementCodeCode() /** { "tree" :"ConceptMap.group.element.code", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "setElement"] , "methodName" : "setCode"} **/
						));
Conceptmapobj.setDisplay(HapiFHIRHelpers.createstring(conceptmap.getCncptMpGrpLmntDsplStrng() /** { "tree" :"ConceptMap.group.element.display", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "setElement"] , "methodName" : "setDisplay"} **/
						));
Conceptmapobj.setCode(HapiFHIRHelpers.createcode(conceptmap.getCncptMpGrpLmntTrgtCdCde() /** { "tree" :"ConceptMap.group.element.target.code", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "setElement", "addTarget"] , "methodName" : "setCode"} **/
						));
Conceptmapobj.setDisplay(HapiFHIRHelpers.createstring(conceptmap.getCncptMpGrpLmntTrgtDsplStrng() /** { "tree" :"ConceptMap.group.element.target.display", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "setElement", "addTarget"] , "methodName" : "setDisplay"} **/
						));
Conceptmapobj.setEquivalence(HapiFHIRHelpers.createcode(conceptmap.getCncptMpGrpLmntTrgtQvlncCde() /** { "tree" :"ConceptMap.group.element.target.equivalence", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addGroup", "setElement", "addTarget"] , "methodName" : "setEquivalence"} **/
						));
Conceptmapobj.setComment(HapiFHIRHelpers.createstring(conceptmap.getCncptMpGrpLmntTrgtCmmntStrng() /** { "tree" :"ConceptMap.group.element.target.comment", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "setElement", "addTarget"] , "methodName" : "setComment"} **/
						));
Conceptmapobj.setProperty(HapiFHIRHelpers.createuri(conceptmap.getCncptMpGrpLmntTrgtDpndsnPrprtRi() /** { "tree" :"ConceptMap.group.element.target.dependsOn.property", "datatype" : "uri", "cardinality" : "Required", "elementtree" : ["addGroup", "setElement", "addTarget", "addDependsOn"] , "methodName" : "setProperty"} **/
						));
Conceptmapobj.setSystem(HapiFHIRHelpers.createcanonical(conceptmap.getCncptMpGrpLmntTrgtDpndsnSstmCnncl() /** { "tree" :"ConceptMap.group.element.target.dependsOn.system", "datatype" : "canonical", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "setElement", "addTarget", "addDependsOn"] , "methodName" : "setSystem"} **/
						));
Conceptmapobj.setValue(HapiFHIRHelpers.createstring(conceptmap.getCncptMpGrpLmntTrgtDpndsnVlStrng() /** { "tree" :"ConceptMap.group.element.target.dependsOn.value", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addGroup", "setElement", "addTarget", "addDependsOn"] , "methodName" : "setValue"} **/
						));
Conceptmapobj.setDisplay(HapiFHIRHelpers.createstring(conceptmap.getCncptMpGrpLmntTrgtDpndsnDsplStrng() /** { "tree" :"ConceptMap.group.element.target.dependsOn.display", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "setElement", "addTarget", "addDependsOn"] , "methodName" : "setDisplay"} **/
						));
Conceptmapobj.addProduct(HapiFHIRHelpers.createdependsOn(conceptmap.getCncptMpGrpLmntTrgtPrdctDpndsn() /** { "tree" :"ConceptMap.group.element.target.product", "datatype" : "dependsOn", "cardinality" : "Many", "elementtree" : ["addGroup", "setElement", "addTarget", "addDependsOn"] , "methodName" : "addProduct"} **/
						));
Conceptmapobj.setMode(HapiFHIRHelpers.createcode(conceptmap.getCncptMpGrpNmppdMdCde() /** { "tree" :"ConceptMap.group.unmapped.mode", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addGroup", "setElement", "addTarget", "addDependsOn", "setUnmapped"] , "methodName" : "setMode"} **/
						));
Conceptmapobj.setCode(HapiFHIRHelpers.createcode(conceptmap.getCncptMpGrpNmppdCdCde() /** { "tree" :"ConceptMap.group.unmapped.code", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "setElement", "addTarget", "addDependsOn", "setUnmapped"] , "methodName" : "setCode"} **/
						));
Conceptmapobj.setDisplay(HapiFHIRHelpers.createstring(conceptmap.getCncptMpGrpNmppdDsplStrng() /** { "tree" :"ConceptMap.group.unmapped.display", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "setElement", "addTarget", "addDependsOn", "setUnmapped"] , "methodName" : "setDisplay"} **/
						));
Conceptmapobj.setUrl(HapiFHIRHelpers.createcanonical(conceptmap.getCncptMpGrpNmppdRlCnncl() /** { "tree" :"ConceptMap.group.unmapped.url", "datatype" : "canonical", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "setElement", "addTarget", "addDependsOn", "setUnmapped"] , "methodName" : "setUrl"} **/
		));
	}
}
