package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Implementationguide.
 * @see .Implementationguide
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class ImplementationguideConversion 
{
	public Patient Implementationguides(main.templateoutput.Model.Implementationguide implementationguide) 
	{
			Patient  Implementationguideobj = new Patient(); 

						Implementationguideobj.setUrl(HapiFHIRHelpers.createuri(implementationguide.getImplementationGuideUrlUri() /** { "tree" :"ImplementationGuide.url", "datatype" : "uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setUrl"} **/
						));
Implementationguideobj.setVersion(HapiFHIRHelpers.createstring(implementationguide.getImplementationGuideVersionString() /** { "tree" :"ImplementationGuide.version", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setVersion"} **/
						));
Implementationguideobj.setName(HapiFHIRHelpers.createstring(implementationguide.getImplementationGuideNameString() /** { "tree" :"ImplementationGuide.name", "datatype" : "string", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setName"} **/
						));
Implementationguideobj.setTitle(HapiFHIRHelpers.createstring(implementationguide.getImplementationGuideTitleString() /** { "tree" :"ImplementationGuide.title", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTitle"} **/
						));
Implementationguideobj.setStatus(HapiFHIRHelpers.createcode(implementationguide.getImplementationGuideStatusCode() /** { "tree" :"ImplementationGuide.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Implementationguideobj.setExperimental(HapiFHIRHelpers.createboolean(implementationguide.getImplmnttnGdXprmntlBln() /** { "tree" :"ImplementationGuide.experimental", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setExperimental"} **/
						));
Implementationguideobj.setDate(HapiFHIRHelpers.createdateTime(implementationguide.getImplementationGuideDateDateTime() /** { "tree" :"ImplementationGuide.date", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDate"} **/
						));
Implementationguideobj.setPublisher(HapiFHIRHelpers.createstring(implementationguide.getImplmnttnGdPblshrStrng() /** { "tree" :"ImplementationGuide.publisher", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPublisher"} **/
						));
Implementationguideobj.addContact(HapiFHIRHelpers.createContactDetail(implementationguide.getImplmnttnGdCntctCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"ImplementationGuide.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setStart"} **/
						, implementationguide.getImplmnttnGdCntctCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"ImplementationGuide.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setEnd"} **/
						, implementationguide.getImplmnttnGdCntctCntctDtlTlcmCntctPntSstm() /** { "tree" :"ImplementationGuide.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setSystem"} **/
						, implementationguide.getImplmnttnGdCntctCntctDtlTlcmCntctPntVlue() /** { "tree" :"ImplementationGuide.contact", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setValue"} **/
						, implementationguide.getImplmnttnGdCntctCntctDtlTlcmCntctPntSe() /** { "tree" :"ImplementationGuide.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setUse"} **/
						, implementationguide.getImplmnttnGdCntctCntctDtlTlcmCntctPntRnk() /** { "tree" :"ImplementationGuide.contact", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setRank"} **/
						, implementationguide.getImplmnttnGdCntctCntctDtlNme() /** { "tree" :"ImplementationGuide.contact", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, addName"} **/
						));
Implementationguideobj.setDescription(HapiFHIRHelpers.createmarkdown(implementationguide.getImplmnttnGdDscrptnMrkdwn() /** { "tree" :"ImplementationGuide.description", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDescription"} **/
						));
Implementationguideobj.addUseContext(HapiFHIRHelpers.createUsageContext(implementationguide.getImplmnttnGdSCntxtSgCntxtVlCcCcCSstm() /** { "tree" :"ImplementationGuide.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setSystem"} **/
						, implementationguide.getImplmnttnGdSCntxtSgCntxtVlCcCcCVrsn() /** { "tree" :"ImplementationGuide.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setVersion"} **/
						, implementationguide.getImplmnttnGdSCntxtSgCntxtVlCcCcCCde() /** { "tree" :"ImplementationGuide.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setCode"} **/
						, implementationguide.getImplmnttnGdSCntxtSgCntxtVlCcCcCDsplay() /** { "tree" :"ImplementationGuide.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setDisplay"} **/
						, implementationguide.getImplmnttnGdSCntxtSgCntxtVlCcCcCSrSlctd() /** { "tree" :"ImplementationGuide.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setUserSelected"} **/
						, implementationguide.getImplmnttnGdSCntxtSgCntxtVlCcCcTxt() /** { "tree" :"ImplementationGuide.useContext", "datatype" : "UsageContext, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, setText"} **/
						, implementationguide.getImplmnttnGdSCntxtSgCntxtCdCSstm() /** { "tree" :"ImplementationGuide.useContext", "datatype" : "UsageContext, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setSystem"} **/
						, implementationguide.getImplmnttnGdSCntxtSgCntxtCdCVrsn() /** { "tree" :"ImplementationGuide.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setVersion"} **/
						, implementationguide.getImplmnttnGdSCntxtSgCntxtCdCCde() /** { "tree" :"ImplementationGuide.useContext", "datatype" : "UsageContext, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setCode"} **/
						, implementationguide.getImplmnttnGdSCntxtSgCntxtCdCDsplay() /** { "tree" :"ImplementationGuide.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setDisplay"} **/
						, implementationguide.getImplmnttnGdSCntxtSgCntxtCdCSrSlctd() /** { "tree" :"ImplementationGuide.useContext", "datatype" : "UsageContext, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setUserSelected"} **/
						, implementationguide.getImplmnttnGdSCntxtSgCntxtVlQnttQnttVlue() /** { "tree" :"ImplementationGuide.useContext", "datatype" : "UsageContext, Quantity, decimal", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setValue"} **/
						, implementationguide.getImplmnttnGdSCntxtSgCntxtVlQnttQnttCmprtr() /** { "tree" :"ImplementationGuide.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setComparator"} **/
						, implementationguide.getImplmnttnGdSCntxtSgCntxtVlQnttQnttNt() /** { "tree" :"ImplementationGuide.useContext", "datatype" : "UsageContext, Quantity, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setUnit"} **/
						, implementationguide.getImplmnttnGdSCntxtSgCntxtVlQnttQnttSstm() /** { "tree" :"ImplementationGuide.useContext", "datatype" : "UsageContext, Quantity, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setSystem"} **/
						, implementationguide.getImplmnttnGdSCntxtSgCntxtVlQnttQnttCde() /** { "tree" :"ImplementationGuide.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setCode"} **/
						, implementationguide.getImplmnttnGdSCntxtSgCntxtVlRngRngLw() /** { "tree" :"ImplementationGuide.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setLow"} **/
						, implementationguide.getImplmnttnGdSCntxtSgCntxtVlRngRngHgh() /** { "tree" :"ImplementationGuide.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setHigh"} **/
						, implementationguide.getImplmnttnGdSCntxtSgCntxtVlRfrnce() /** { "tree" :"ImplementationGuide.useContext", "datatype" : "UsageContext, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueReference"} **/
						));
Implementationguideobj.addJurisdiction(HapiFHIRHelpers.createCodeableConcept(implementationguide.getImplmnttnGdJrsdctnCcCdngCSstm() /** { "tree" :"ImplementationGuide.jurisdiction", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setSystem"} **/
						, implementationguide.getImplmnttnGdJrsdctnCcCdngCVrsn() /** { "tree" :"ImplementationGuide.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setVersion"} **/
						, implementationguide.getImplmnttnGdJrsdctnCcCdngCCde() /** { "tree" :"ImplementationGuide.jurisdiction", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setCode"} **/
						, implementationguide.getImplmnttnGdJrsdctnCcCdngCDsplay() /** { "tree" :"ImplementationGuide.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setDisplay"} **/
						, implementationguide.getImplmnttnGdJrsdctnCcCdngCSrSlctd() /** { "tree" :"ImplementationGuide.jurisdiction", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setUserSelected"} **/
						, implementationguide.getImplmnttnGdJrsdctnCcTxt() /** { "tree" :"ImplementationGuide.jurisdiction", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, setText"} **/
						));
Implementationguideobj.setCopyright(HapiFHIRHelpers.createmarkdown(implementationguide.getImplmnttnGdCprghtMrkdwn() /** { "tree" :"ImplementationGuide.copyright", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCopyright"} **/
						));
Implementationguideobj.setPackageId(HapiFHIRHelpers.createid(implementationguide.getImplementationGuidePackageIdId() /** { "tree" :"ImplementationGuide.packageId", "datatype" : "id", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setPackageId"} **/
						));
Implementationguideobj.setLicense(HapiFHIRHelpers.createcode(implementationguide.getImplementationGuideLicenseCode() /** { "tree" :"ImplementationGuide.license", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setLicense"} **/
						));
Implementationguideobj.setFhirVersion(HapiFHIRHelpers.createcode(implementationguide.getImplmnttnGdFhrVrsnCde() /** { "tree" :"ImplementationGuide.fhirVersion", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setFhirVersion"} **/
						));
Implementationguideobj.setUri(HapiFHIRHelpers.createcanonical(implementationguide.getImplmnttnGdDpndsnRCnncl() /** { "tree" :"ImplementationGuide.dependsOn.uri", "datatype" : "canonical", "cardinality" : "Required", "elementtree" : ["addDependsOn"] , "methodName" : "setUri"} **/
						));
Implementationguideobj.setPackageId(HapiFHIRHelpers.createid(implementationguide.getImplmnttnGdDpndsnPckgdD() /** { "tree" :"ImplementationGuide.dependsOn.packageId", "datatype" : "id", "cardinality" : "ZeroOne", "elementtree" : ["addDependsOn"] , "methodName" : "setPackageId"} **/
						));
Implementationguideobj.setVersion(HapiFHIRHelpers.createstring(implementationguide.getImplmnttnGdDpndsnVrsnStrng() /** { "tree" :"ImplementationGuide.dependsOn.version", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addDependsOn"] , "methodName" : "setVersion"} **/
						));
Implementationguideobj.setType(HapiFHIRHelpers.createcode(implementationguide.getImplmnttnGdGlblTpCde() /** { "tree" :"ImplementationGuide.global.type", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addGlobal"] , "methodName" : "setType"} **/
						));
Implementationguideobj.setProfile(HapiFHIRHelpers.createcanonical(implementationguide.getImplmnttnGdGlblPrflCnncl() /** { "tree" :"ImplementationGuide.global.profile", "datatype" : "canonical", "cardinality" : "Required", "elementtree" : ["addGlobal"] , "methodName" : "setProfile"} **/
						));
Implementationguideobj.setName(HapiFHIRHelpers.createstring(implementationguide.getImplmnttnGdDfntnGrpngNmStrng() /** { "tree" :"ImplementationGuide.definition.grouping.name", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["setDefinition", "addGrouping"] , "methodName" : "setName"} **/
						));
Implementationguideobj.setDescription(HapiFHIRHelpers.createstring(implementationguide.getImplmnttnGdDfntnGrpngDscrptnStrng() /** { "tree" :"ImplementationGuide.definition.grouping.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setDefinition", "addGrouping"] , "methodName" : "setDescription"} **/
						));
Implementationguideobj.setReference(HapiFHIRHelpers.createReference(implementationguide.getImplmnttnGdDfntnRsrcRfrncRfrnce() /** { "tree" :"ImplementationGuide.definition.resource.reference", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["setDefinition", "addGrouping", "setResource"] , "methodName" : "setReference"} **/
						));
Implementationguideobj.addFhirVersion(HapiFHIRHelpers.createcode(implementationguide.getImplmnttnGdDfntnRsrcFhrVrsnCde() /** { "tree" :"ImplementationGuide.definition.resource.fhirVersion", "datatype" : "code", "cardinality" : "Many", "elementtree" : ["setDefinition", "addGrouping", "setResource"] , "methodName" : "addFhirVersion"} **/
						));
Implementationguideobj.setName(HapiFHIRHelpers.createstring(implementationguide.getImplmnttnGdDfntnRsrcNmStrng() /** { "tree" :"ImplementationGuide.definition.resource.name", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setDefinition", "addGrouping", "setResource"] , "methodName" : "setName"} **/
						));
Implementationguideobj.setDescription(HapiFHIRHelpers.createstring(implementationguide.getImplmnttnGdDfntnRsrcDscrptnStrng() /** { "tree" :"ImplementationGuide.definition.resource.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setDefinition", "addGrouping", "setResource"] , "methodName" : "setDescription"} **/
						));
Implementationguideobj.setExample(HapiFHIRHelpers.createbooleantype(implementationguide.getImplmnttnGdDfntnRsrcXmplBlnBln() /** { "tree" :"ImplementationGuide.definition.resource.exampleBoolean", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["setDefinition", "addGrouping", "setResource"] , "methodName" : "setExampleBoolean"} **/
						));
Implementationguideobj.setExampleCanonical(structuredefinition)(HapiFHIRHelpers.createcanonical(implementationguide.getImplmnttnGdDfntnRsrcXmplCnnclCnncl() /** { "tree" :"ImplementationGuide.definition.resource.exampleCanonical", "datatype" : "canonical", "cardinality" : "ZeroOne", "elementtree" : ["setDefinition", "addGrouping", "setResource"] , "methodName" : "setExampleCanonical(structuredefinition)"} **/
						));
Implementationguideobj.setGroupingId(HapiFHIRHelpers.createid(implementationguide.getImplmnttnGdDfntnRsrcGrpngdD() /** { "tree" :"ImplementationGuide.definition.resource.groupingId", "datatype" : "id", "cardinality" : "ZeroOne", "elementtree" : ["setDefinition", "addGrouping", "setResource"] , "methodName" : "setGroupingId"} **/
						));
Implementationguideobj.setNameUrl(HapiFHIRHelpers.createurl(implementationguide.getImplmnttnGdDfntnPgNmrlRl() /** { "tree" :"ImplementationGuide.definition.page.nameUrl", "datatype" : "url", "cardinality" : "Required", "elementtree" : ["setDefinition", "addGrouping", "setResource", "setPage"] , "methodName" : "setNameUrl"} **/
						));
Implementationguideobj.setNameReference(binary)(HapiFHIRHelpers.createReference(implementationguide.getImplmnttnGdDfntnPgNmRfrncRfrnce() /** { "tree" :"ImplementationGuide.definition.page.nameReference", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["setDefinition", "addGrouping", "setResource", "setPage"] , "methodName" : "setNameReference(binary)"} **/
						));
Implementationguideobj.setTitle(HapiFHIRHelpers.createstring(implementationguide.getImplmnttnGdDfntnPgTtlStrng() /** { "tree" :"ImplementationGuide.definition.page.title", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["setDefinition", "addGrouping", "setResource", "setPage"] , "methodName" : "setTitle"} **/
						));
Implementationguideobj.setGeneration(HapiFHIRHelpers.createcode(implementationguide.getImplmnttnGdDfntnPgGnrtnCde() /** { "tree" :"ImplementationGuide.definition.page.generation", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["setDefinition", "addGrouping", "setResource", "setPage"] , "methodName" : "setGeneration"} **/
						));
Implementationguideobj.addPage(HapiFHIRHelpers.createpage(implementationguide.getImplmnttnGdDfntnPgPgPge() /** { "tree" :"ImplementationGuide.definition.page.page", "datatype" : "page", "cardinality" : "Many", "elementtree" : ["setDefinition", "addGrouping", "setResource", "setPage"] , "methodName" : "addPage"} **/
						));
Implementationguideobj.setCode(HapiFHIRHelpers.createcode(implementationguide.getImplmnttnGdDfntnPrmtrCdCde() /** { "tree" :"ImplementationGuide.definition.parameter.code", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["setDefinition", "addGrouping", "setResource", "setPage", "addParameter"] , "methodName" : "setCode"} **/
						));
Implementationguideobj.setValue(HapiFHIRHelpers.createstring(implementationguide.getImplmnttnGdDfntnPrmtrVlStrng() /** { "tree" :"ImplementationGuide.definition.parameter.value", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["setDefinition", "addGrouping", "setResource", "setPage", "addParameter"] , "methodName" : "setValue"} **/
						));
Implementationguideobj.setCode(HapiFHIRHelpers.createcode(implementationguide.getImplmnttnGdDfntnTmpltCdCde() /** { "tree" :"ImplementationGuide.definition.template.code", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["setDefinition", "addGrouping", "setResource", "setPage", "addParameter", "addTemplate"] , "methodName" : "setCode"} **/
						));
Implementationguideobj.setSource(HapiFHIRHelpers.createstring(implementationguide.getImplmnttnGdDfntnTmpltSrcStrng() /** { "tree" :"ImplementationGuide.definition.template.source", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["setDefinition", "addGrouping", "setResource", "setPage", "addParameter", "addTemplate"] , "methodName" : "setSource"} **/
						));
Implementationguideobj.setScope(HapiFHIRHelpers.createstring(implementationguide.getImplmnttnGdDfntnTmpltScpStrng() /** { "tree" :"ImplementationGuide.definition.template.scope", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setDefinition", "addGrouping", "setResource", "setPage", "addParameter", "addTemplate"] , "methodName" : "setScope"} **/
						));
Implementationguideobj.setRendering(HapiFHIRHelpers.createurl(implementationguide.getImplmnttnGdMnfstRndrngRl() /** { "tree" :"ImplementationGuide.manifest.rendering", "datatype" : "url", "cardinality" : "ZeroOne", "elementtree" : ["setManifest"] , "methodName" : "setRendering"} **/
						));
Implementationguideobj.setReference(HapiFHIRHelpers.createReference(implementationguide.getImplmnttnGdMnfstRsrcRfrncRfrnce() /** { "tree" :"ImplementationGuide.manifest.resource.reference", "datatype" : "Reference", "cardinality" : "Required", "elementtree" : ["setManifest", "setResource"] , "methodName" : "setReference"} **/
						));
Implementationguideobj.setExample(HapiFHIRHelpers.createbooleantype(implementationguide.getImplmnttnGdMnfstRsrcXmplBlnBln() /** { "tree" :"ImplementationGuide.manifest.resource.exampleBoolean", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["setManifest", "setResource"] , "methodName" : "setExampleBoolean"} **/
						));
Implementationguideobj.setExampleCanonical(structuredefinition)(HapiFHIRHelpers.createcanonical(implementationguide.getImplmnttnGdMnfstRsrcXmplCnnclCnncl() /** { "tree" :"ImplementationGuide.manifest.resource.exampleCanonical", "datatype" : "canonical", "cardinality" : "ZeroOne", "elementtree" : ["setManifest", "setResource"] , "methodName" : "setExampleCanonical(structuredefinition)"} **/
						));
Implementationguideobj.setRelativePath(HapiFHIRHelpers.createurl(implementationguide.getImplmnttnGdMnfstRsrcRltvPthRl() /** { "tree" :"ImplementationGuide.manifest.resource.relativePath", "datatype" : "url", "cardinality" : "ZeroOne", "elementtree" : ["setManifest", "setResource"] , "methodName" : "setRelativePath"} **/
						));
Implementationguideobj.setName(HapiFHIRHelpers.createstring(implementationguide.getImplmnttnGdMnfstPgNmStrng() /** { "tree" :"ImplementationGuide.manifest.page.name", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["setManifest", "setResource", "addPage"] , "methodName" : "setName"} **/
						));
Implementationguideobj.setTitle(HapiFHIRHelpers.createstring(implementationguide.getImplmnttnGdMnfstPgTtlStrng() /** { "tree" :"ImplementationGuide.manifest.page.title", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["setManifest", "setResource", "addPage"] , "methodName" : "setTitle"} **/
						));
Implementationguideobj.addAnchor(HapiFHIRHelpers.createstring(implementationguide.getImplmnttnGdMnfstPgNchrStrng() /** { "tree" :"ImplementationGuide.manifest.page.anchor", "datatype" : "string", "cardinality" : "Many", "elementtree" : ["setManifest", "setResource", "addPage"] , "methodName" : "addAnchor"} **/
						));
Implementationguideobj.addImage(HapiFHIRHelpers.createstring(implementationguide.getImplmnttnGdMnfstMgStrng() /** { "tree" :"ImplementationGuide.manifest.image", "datatype" : "string", "cardinality" : "Many", "elementtree" : ["setManifest", "setResource", "addPage"] , "methodName" : "addImage"} **/
						));
Implementationguideobj.addOther(HapiFHIRHelpers.createstring(implementationguide.getImplmnttnGdMnfstThrStrng() /** { "tree" :"ImplementationGuide.manifest.other", "datatype" : "string", "cardinality" : "Many", "elementtree" : ["setManifest", "setResource", "addPage"] , "methodName" : "addOther"} **/
		));
	}
}
