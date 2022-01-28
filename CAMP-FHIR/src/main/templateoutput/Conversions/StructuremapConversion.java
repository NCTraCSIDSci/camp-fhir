package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Structuremap.
 * @see .Structuremap
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class StructuremapConversion 
{
	public Patient Structuremaps(main.templateoutput.Model.Structuremap structuremap) 
	{
			Patient  Structuremapobj = new Patient(); 

						Structuremapobj.setUrl(HapiFHIRHelpers.createuri(structuremap.getStructureMapUrlUri() /** { "tree" :"StructureMap.url", "datatype" : "uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setUrl"} **/
						));
Structuremapobj.addIdentifier(HapiFHIRHelpers.createIdentifier(structuremap.getStrctrMpDntfrDntfrSe() /** { "tree" :"StructureMap.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, structuremap.getStrctrMpDntfrDntfrTpCcCSstm() /** { "tree" :"StructureMap.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, structuremap.getStrctrMpDntfrDntfrTpCcCVrsn() /** { "tree" :"StructureMap.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, structuremap.getStrctrMpDntfrDntfrTpCcCCde() /** { "tree" :"StructureMap.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, structuremap.getStrctrMpDntfrDntfrTpCcCDsplay() /** { "tree" :"StructureMap.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, structuremap.getStrctrMpDntfrDntfrTpCcCSrSlctd() /** { "tree" :"StructureMap.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, structuremap.getStrctrMpDntfrDntfrTpCcTxt() /** { "tree" :"StructureMap.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, structuremap.getStrctrMpDntfrDntfrPrdPrdStrt() /** { "tree" :"StructureMap.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, structuremap.getStrctrMpDntfrDntfrPrdPrdNd() /** { "tree" :"StructureMap.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, structuremap.getStrctrMpDntfrDntfrSsgnr() /** { "tree" :"StructureMap.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, structuremap.getStrctrMpDntfrDntfrVlue() /** { "tree" :"StructureMap.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, structuremap.getStrctrMpDntfrDntfrSstm() /** { "tree" :"StructureMap.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Structuremapobj.setVersion(HapiFHIRHelpers.createstring(structuremap.getStructureMapVersionString() /** { "tree" :"StructureMap.version", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setVersion"} **/
						));
Structuremapobj.setName(HapiFHIRHelpers.createstring(structuremap.getStructureMapNameString() /** { "tree" :"StructureMap.name", "datatype" : "string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setName"} **/
						));
Structuremapobj.setTitle(HapiFHIRHelpers.createstring(structuremap.getStructureMapTitleString() /** { "tree" :"StructureMap.title", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTitle"} **/
						));
Structuremapobj.setStatus(HapiFHIRHelpers.createcode(structuremap.getStructureMapStatusCode() /** { "tree" :"StructureMap.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Structuremapobj.setExperimental(HapiFHIRHelpers.createboolean(structuremap.getStructureMapExperimentalBoolean() /** { "tree" :"StructureMap.experimental", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setExperimental"} **/
						));
Structuremapobj.setDate(HapiFHIRHelpers.createdateTime(structuremap.getStructureMapDateDateTime() /** { "tree" :"StructureMap.date", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDate"} **/
						));
Structuremapobj.setPublisher(HapiFHIRHelpers.createstring(structuremap.getStructureMapPublisherString() /** { "tree" :"StructureMap.publisher", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPublisher"} **/
						));
Structuremapobj.addContact(HapiFHIRHelpers.createContactDetail(structuremap.getStrctrMpCntctCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"StructureMap.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setStart"} **/
						, structuremap.getStrctrMpCntctCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"StructureMap.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setEnd"} **/
						, structuremap.getStrctrMpCntctCntctDtlTlcmCntctPntSstm() /** { "tree" :"StructureMap.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setSystem"} **/
						, structuremap.getStrctrMpCntctCntctDtlTlcmCntctPntVlue() /** { "tree" :"StructureMap.contact", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setValue"} **/
						, structuremap.getStrctrMpCntctCntctDtlTlcmCntctPntSe() /** { "tree" :"StructureMap.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setUse"} **/
						, structuremap.getStrctrMpCntctCntctDtlTlcmCntctPntRnk() /** { "tree" :"StructureMap.contact", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setRank"} **/
						, structuremap.getStrctrMpCntctCntctDtlNme() /** { "tree" :"StructureMap.contact", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, addName"} **/
						));
Structuremapobj.setDescription(HapiFHIRHelpers.createmarkdown(structuremap.getStructureMapDescriptionMarkdown() /** { "tree" :"StructureMap.description", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDescription"} **/
						));
Structuremapobj.addUseContext(HapiFHIRHelpers.createUsageContext(structuremap.getStrctrMpSCntxtSgCntxtVlCcCcCSstm() /** { "tree" :"StructureMap.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setSystem"} **/
						, structuremap.getStrctrMpSCntxtSgCntxtVlCcCcCVrsn() /** { "tree" :"StructureMap.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setVersion"} **/
						, structuremap.getStrctrMpSCntxtSgCntxtVlCcCcCCde() /** { "tree" :"StructureMap.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setCode"} **/
						, structuremap.getStrctrMpSCntxtSgCntxtVlCcCcCDsplay() /** { "tree" :"StructureMap.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setDisplay"} **/
						, structuremap.getStrctrMpSCntxtSgCntxtVlCcCcCSrSlctd() /** { "tree" :"StructureMap.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setUserSelected"} **/
						, structuremap.getStrctrMpSCntxtSgCntxtVlCcCcTxt() /** { "tree" :"StructureMap.useContext", "datatype" : "UsageContext, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, setText"} **/
						, structuremap.getStrctrMpSCntxtSgCntxtCdCSstm() /** { "tree" :"StructureMap.useContext", "datatype" : "UsageContext, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setSystem"} **/
						, structuremap.getStrctrMpSCntxtSgCntxtCdCVrsn() /** { "tree" :"StructureMap.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setVersion"} **/
						, structuremap.getStrctrMpSCntxtSgCntxtCdCCde() /** { "tree" :"StructureMap.useContext", "datatype" : "UsageContext, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setCode"} **/
						, structuremap.getStrctrMpSCntxtSgCntxtCdCDsplay() /** { "tree" :"StructureMap.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setDisplay"} **/
						, structuremap.getStrctrMpSCntxtSgCntxtCdCSrSlctd() /** { "tree" :"StructureMap.useContext", "datatype" : "UsageContext, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setUserSelected"} **/
						, structuremap.getStrctrMpSCntxtSgCntxtVlQnttQnttVlue() /** { "tree" :"StructureMap.useContext", "datatype" : "UsageContext, Quantity, decimal", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setValue"} **/
						, structuremap.getStrctrMpSCntxtSgCntxtVlQnttQnttCmprtr() /** { "tree" :"StructureMap.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setComparator"} **/
						, structuremap.getStrctrMpSCntxtSgCntxtVlQnttQnttNt() /** { "tree" :"StructureMap.useContext", "datatype" : "UsageContext, Quantity, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setUnit"} **/
						, structuremap.getStrctrMpSCntxtSgCntxtVlQnttQnttSstm() /** { "tree" :"StructureMap.useContext", "datatype" : "UsageContext, Quantity, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setSystem"} **/
						, structuremap.getStrctrMpSCntxtSgCntxtVlQnttQnttCde() /** { "tree" :"StructureMap.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setCode"} **/
						, structuremap.getStrctrMpSCntxtSgCntxtVlRngRngLw() /** { "tree" :"StructureMap.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setLow"} **/
						, structuremap.getStrctrMpSCntxtSgCntxtVlRngRngHgh() /** { "tree" :"StructureMap.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setHigh"} **/
						, structuremap.getStrctrMpSCntxtSgCntxtVlRfrnce() /** { "tree" :"StructureMap.useContext", "datatype" : "UsageContext, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueReference"} **/
						));
Structuremapobj.addJurisdiction(HapiFHIRHelpers.createCodeableConcept(structuremap.getStrctrMpJrsdctnCcCdngCSstm() /** { "tree" :"StructureMap.jurisdiction", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setSystem"} **/
						, structuremap.getStrctrMpJrsdctnCcCdngCVrsn() /** { "tree" :"StructureMap.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setVersion"} **/
						, structuremap.getStrctrMpJrsdctnCcCdngCCde() /** { "tree" :"StructureMap.jurisdiction", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setCode"} **/
						, structuremap.getStrctrMpJrsdctnCcCdngCDsplay() /** { "tree" :"StructureMap.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setDisplay"} **/
						, structuremap.getStrctrMpJrsdctnCcCdngCSrSlctd() /** { "tree" :"StructureMap.jurisdiction", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setUserSelected"} **/
						, structuremap.getStructureMapJurisdictionCcText() /** { "tree" :"StructureMap.jurisdiction", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, setText"} **/
						));
Structuremapobj.setPurpose(HapiFHIRHelpers.createmarkdown(structuremap.getStructureMapPurposeMarkdown() /** { "tree" :"StructureMap.purpose", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPurpose"} **/
						));
Structuremapobj.setCopyright(HapiFHIRHelpers.createmarkdown(structuremap.getStructureMapCopyrightMarkdown() /** { "tree" :"StructureMap.copyright", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCopyright"} **/
						));
Structuremapobj.setUrl(HapiFHIRHelpers.createcanonical(structuremap.getStrctrMpStrctrRlCnncl() /** { "tree" :"StructureMap.structure.url", "datatype" : "canonical", "cardinality" : "Required", "elementtree" : ["addStructure"] , "methodName" : "setUrl"} **/
						));
Structuremapobj.setMode(HapiFHIRHelpers.createcode(structuremap.getStructureMapStructureModeCode() /** { "tree" :"StructureMap.structure.mode", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addStructure"] , "methodName" : "setMode"} **/
						));
Structuremapobj.setAlias(HapiFHIRHelpers.createstring(structuremap.getStrctrMpStrctrLsStrng() /** { "tree" :"StructureMap.structure.alias", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addStructure"] , "methodName" : "setAlias"} **/
						));
Structuremapobj.setDocumentation(HapiFHIRHelpers.createstring(structuremap.getStrctrMpStrctrDcmnttnStrng() /** { "tree" :"StructureMap.structure.documentation", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addStructure"] , "methodName" : "setDocumentation"} **/
						));
Structuremapobj.addImport(HapiFHIRHelpers.createcanonical(structuremap.getStructureMapImportCanonical() /** { "tree" :"StructureMap.import", "datatype" : "canonical", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addImport"} **/
						));
Structuremapobj.setName(HapiFHIRHelpers.createid(structuremap.getStructureMapGroupNameId() /** { "tree" :"StructureMap.group.name", "datatype" : "id", "cardinality" : "Required", "elementtree" : ["addGroup"] , "methodName" : "setName"} **/
						));
Structuremapobj.setExtends(HapiFHIRHelpers.createid(structuremap.getStructureMapGroupExtendsId() /** { "tree" :"StructureMap.group.extends", "datatype" : "id", "cardinality" : "ZeroOne", "elementtree" : ["addGroup"] , "methodName" : "setExtends"} **/
						));
Structuremapobj.setTypeMode(HapiFHIRHelpers.createcode(structuremap.getStructureMapGroupTypeModeCode() /** { "tree" :"StructureMap.group.typeMode", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addGroup"] , "methodName" : "setTypeMode"} **/
						));
Structuremapobj.setDocumentation(HapiFHIRHelpers.createstring(structuremap.getStrctrMpGrpDcmnttnStrng() /** { "tree" :"StructureMap.group.documentation", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addGroup"] , "methodName" : "setDocumentation"} **/
						));
Structuremapobj.setName(HapiFHIRHelpers.createid(structuremap.getStructureMapGroupInputNameId() /** { "tree" :"StructureMap.group.input.name", "datatype" : "id", "cardinality" : "Required", "elementtree" : ["addGroup", "setInput"] , "methodName" : "setName"} **/
						));
Structuremapobj.setType(HapiFHIRHelpers.createstring(structuremap.getStrctrMpGrpNptTpStrng() /** { "tree" :"StructureMap.group.input.type", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "setInput"] , "methodName" : "setType"} **/
						));
Structuremapobj.setMode(HapiFHIRHelpers.createcode(structuremap.getStructureMapGroupInputModeCode() /** { "tree" :"StructureMap.group.input.mode", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addGroup", "setInput"] , "methodName" : "setMode"} **/
						));
Structuremapobj.setDocumentation(HapiFHIRHelpers.createstring(structuremap.getStrctrMpGrpNptDcmnttnStrng() /** { "tree" :"StructureMap.group.input.documentation", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "setInput"] , "methodName" : "setDocumentation"} **/
						));
Structuremapobj.setName(HapiFHIRHelpers.createid(structuremap.getStructureMapGroupRuleNameId() /** { "tree" :"StructureMap.group.rule.name", "datatype" : "id", "cardinality" : "Required", "elementtree" : ["addGroup", "setInput", "setRule"] , "methodName" : "setName"} **/
						));
Structuremapobj.setContext(HapiFHIRHelpers.createid(structuremap.getStrctrMpGrpRlSrcCntxtD() /** { "tree" :"StructureMap.group.rule.source.context", "datatype" : "id", "cardinality" : "Required", "elementtree" : ["addGroup", "setInput", "setRule", "setSource"] , "methodName" : "setContext"} **/
						));
Structuremapobj.setMin(HapiFHIRHelpers.createinteger(structuremap.getStrctrMpGrpRlSrcMnNtgr() /** { "tree" :"StructureMap.group.rule.source.min", "datatype" : "integer", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "setInput", "setRule", "setSource"] , "methodName" : "setMin"} **/
						));
Structuremapobj.setMax(HapiFHIRHelpers.createstring(structuremap.getStrctrMpGrpRlSrcMxStrng() /** { "tree" :"StructureMap.group.rule.source.max", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "setInput", "setRule", "setSource"] , "methodName" : "setMax"} **/
						));
Structuremapobj.setType(HapiFHIRHelpers.createstring(structuremap.getStrctrMpGrpRlSrcTpStrng() /** { "tree" :"StructureMap.group.rule.source.type", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "setInput", "setRule", "setSource"] , "methodName" : "setType"} **/
						));
Structuremapobj.setElement(HapiFHIRHelpers.createstring(structuremap.getStrctrMpGrpRlSrcLmntStrng() /** { "tree" :"StructureMap.group.rule.source.element", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "setInput", "setRule", "setSource"] , "methodName" : "setElement"} **/
						));
Structuremapobj.setListMode(HapiFHIRHelpers.createcode(structuremap.getStrctrMpGrpRlSrcLstMdCde() /** { "tree" :"StructureMap.group.rule.source.listMode", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "setInput", "setRule", "setSource"] , "methodName" : "setListMode"} **/
						));
Structuremapobj.setVariable(HapiFHIRHelpers.createid(structuremap.getStrctrMpGrpRlSrcVrblD() /** { "tree" :"StructureMap.group.rule.source.variable", "datatype" : "id", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "setInput", "setRule", "setSource"] , "methodName" : "setVariable"} **/
						));
Structuremapobj.setCondition(HapiFHIRHelpers.createstring(structuremap.getStrctrMpGrpRlSrcCndtnStrng() /** { "tree" :"StructureMap.group.rule.source.condition", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "setInput", "setRule", "setSource"] , "methodName" : "setCondition"} **/
						));
Structuremapobj.setCheck(HapiFHIRHelpers.createstring(structuremap.getStrctrMpGrpRlSrcChckStrng() /** { "tree" :"StructureMap.group.rule.source.check", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "setInput", "setRule", "setSource"] , "methodName" : "setCheck"} **/
						));
Structuremapobj.setLogMessage(HapiFHIRHelpers.createstring(structuremap.getStrctrMpGrpRlSrcLgMssgStrng() /** { "tree" :"StructureMap.group.rule.source.logMessage", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "setInput", "setRule", "setSource"] , "methodName" : "setLogMessage"} **/
						));
Structuremapobj.setContext(HapiFHIRHelpers.createid(structuremap.getStrctrMpGrpRlTrgtCntxtD() /** { "tree" :"StructureMap.group.rule.target.context", "datatype" : "id", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "setInput", "setRule", "setSource", "addTarget"] , "methodName" : "setContext"} **/
						));
Structuremapobj.setContextType(HapiFHIRHelpers.createcode(structuremap.getStrctrMpGrpRlTrgtCntxtTpCde() /** { "tree" :"StructureMap.group.rule.target.contextType", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "setInput", "setRule", "setSource", "addTarget"] , "methodName" : "setContextType"} **/
						));
Structuremapobj.setElement(HapiFHIRHelpers.createstring(structuremap.getStrctrMpGrpRlTrgtLmntStrng() /** { "tree" :"StructureMap.group.rule.target.element", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "setInput", "setRule", "setSource", "addTarget"] , "methodName" : "setElement"} **/
						));
Structuremapobj.setVariable(HapiFHIRHelpers.createid(structuremap.getStrctrMpGrpRlTrgtVrblD() /** { "tree" :"StructureMap.group.rule.target.variable", "datatype" : "id", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "setInput", "setRule", "setSource", "addTarget"] , "methodName" : "setVariable"} **/
						));
Structuremapobj.addListMode(HapiFHIRHelpers.createcode(structuremap.getStrctrMpGrpRlTrgtLstMdCde() /** { "tree" :"StructureMap.group.rule.target.listMode", "datatype" : "code", "cardinality" : "Many", "elementtree" : ["addGroup", "setInput", "setRule", "setSource", "addTarget"] , "methodName" : "addListMode"} **/
						));
Structuremapobj.setListRuleId(HapiFHIRHelpers.createid(structuremap.getStrctrMpGrpRlTrgtLstRldD() /** { "tree" :"StructureMap.group.rule.target.listRuleId", "datatype" : "id", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "setInput", "setRule", "setSource", "addTarget"] , "methodName" : "setListRuleId"} **/
						));
Structuremapobj.setTransform(HapiFHIRHelpers.createcode(structuremap.getStrctrMpGrpRlTrgtTrnsfrmCde() /** { "tree" :"StructureMap.group.rule.target.transform", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "setInput", "setRule", "setSource", "addTarget"] , "methodName" : "setTransform"} **/
						));
Structuremapobj.setValueId(HapiFHIRHelpers.createid(structuremap.getStrctrMpGrpRlTrgtPrmtrVldD() /** { "tree" :"StructureMap.group.rule.target.parameter.valueId", "datatype" : "id", "cardinality" : "Required", "elementtree" : ["addGroup", "setInput", "setRule", "setSource", "addTarget", "addParameter"] , "methodName" : "setValueId"} **/
						));
Structuremapobj.setValueString(HapiFHIRHelpers.createstring(structuremap.getStrctrMpGrpRlTrgtPrmtrVlStrngStrng() /** { "tree" :"StructureMap.group.rule.target.parameter.valueString", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addGroup", "setInput", "setRule", "setSource", "addTarget", "addParameter"] , "methodName" : "setValueString"} **/
						));
Structuremapobj.setValue(HapiFHIRHelpers.createbooleantype(structuremap.getStrctrMpGrpRlTrgtPrmtrVlBlnBln() /** { "tree" :"StructureMap.group.rule.target.parameter.valueBoolean", "datatype" : "boolean", "cardinality" : "Required", "elementtree" : ["addGroup", "setInput", "setRule", "setSource", "addTarget", "addParameter"] , "methodName" : "setValueBoolean"} **/
						));
Structuremapobj.setValue(HapiFHIRHelpers.createintegertype(structuremap.getStrctrMpGrpRlTrgtPrmtrVlntgrNtgr() /** { "tree" :"StructureMap.group.rule.target.parameter.valueInteger", "datatype" : "integer", "cardinality" : "Required", "elementtree" : ["addGroup", "setInput", "setRule", "setSource", "addTarget", "addParameter"] , "methodName" : "setValueInteger"} **/
						));
Structuremapobj.setValueDecimal(HapiFHIRHelpers.createdecimal(structuremap.getStrctrMpGrpRlTrgtPrmtrVlDcmlDcml() /** { "tree" :"StructureMap.group.rule.target.parameter.valueDecimal", "datatype" : "decimal", "cardinality" : "Required", "elementtree" : ["addGroup", "setInput", "setRule", "setSource", "addTarget", "addParameter"] , "methodName" : "setValueDecimal"} **/
						));
Structuremapobj.addRule(HapiFHIRHelpers.createrule(structuremap.getStructureMapGroupRuleRuleRule() /** { "tree" :"StructureMap.group.rule.rule", "datatype" : "rule", "cardinality" : "Many", "elementtree" : ["addGroup", "setInput", "setRule", "setSource", "addTarget", "addParameter"] , "methodName" : "addRule"} **/
						));
Structuremapobj.setName(HapiFHIRHelpers.createid(structuremap.getStrctrMpGrpRlDpndntNmD() /** { "tree" :"StructureMap.group.rule.dependent.name", "datatype" : "id", "cardinality" : "Required", "elementtree" : ["addGroup", "setInput", "setRule", "setSource", "addTarget", "addParameter", "addDependent"] , "methodName" : "setName"} **/
						));
Structuremapobj.setVariable(HapiFHIRHelpers.createstring(structuremap.getStrctrMpGrpRlDpndntVrblStrng() /** { "tree" :"StructureMap.group.rule.dependent.variable", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addGroup", "setInput", "setRule", "setSource", "addTarget", "addParameter", "addDependent"] , "methodName" : "setVariable"} **/
						));
Structuremapobj.setDocumentation(HapiFHIRHelpers.createstring(structuremap.getStrctrMpGrpRlDcmnttnStrng() /** { "tree" :"StructureMap.group.rule.documentation", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addGroup", "setInput", "setRule", "setSource", "addTarget", "addParameter", "addDependent"] , "methodName" : "setDocumentation"} **/
		));
	}
}
