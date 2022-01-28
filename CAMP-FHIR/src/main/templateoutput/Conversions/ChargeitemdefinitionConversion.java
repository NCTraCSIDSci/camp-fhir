package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Chargeitemdefinition.
 * @see .Chargeitemdefinition
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class ChargeitemdefinitionConversion 
{
	public Patient Chargeitemdefinitions(main.templateoutput.Model.Chargeitemdefinition chargeitemdefinition) 
	{
			Patient  Chargeitemdefinitionobj = new Patient(); 

						Chargeitemdefinitionobj.setUrl(HapiFHIRHelpers.createuri(chargeitemdefinition.getChargeItemDefinitionUrlUri() /** { "tree" :"ChargeItemDefinition.url", "datatype" : "uri", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setUrl"} **/
						));
Chargeitemdefinitionobj.addIdentifier(HapiFHIRHelpers.createIdentifier(chargeitemdefinition.getChrgtmDfntnDntfrDntfrSe() /** { "tree" :"ChargeItemDefinition.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, chargeitemdefinition.getChrgtmDfntnDntfrDntfrTpCcCSstm() /** { "tree" :"ChargeItemDefinition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, chargeitemdefinition.getChrgtmDfntnDntfrDntfrTpCcCVrsn() /** { "tree" :"ChargeItemDefinition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, chargeitemdefinition.getChrgtmDfntnDntfrDntfrTpCcCCde() /** { "tree" :"ChargeItemDefinition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, chargeitemdefinition.getChrgtmDfntnDntfrDntfrTpCcCDsplay() /** { "tree" :"ChargeItemDefinition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, chargeitemdefinition.getChrgtmDfntnDntfrDntfrTpCcCSrSlctd() /** { "tree" :"ChargeItemDefinition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, chargeitemdefinition.getChrgtmDfntnDntfrDntfrTpCcTxt() /** { "tree" :"ChargeItemDefinition.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, chargeitemdefinition.getChrgtmDfntnDntfrDntfrPrdPrdStrt() /** { "tree" :"ChargeItemDefinition.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, chargeitemdefinition.getChrgtmDfntnDntfrDntfrPrdPrdNd() /** { "tree" :"ChargeItemDefinition.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, chargeitemdefinition.getChrgtmDfntnDntfrDntfrSsgnr() /** { "tree" :"ChargeItemDefinition.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, chargeitemdefinition.getChrgtmDfntnDntfrDntfrVlue() /** { "tree" :"ChargeItemDefinition.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, chargeitemdefinition.getChrgtmDfntnDntfrDntfrSstm() /** { "tree" :"ChargeItemDefinition.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Chargeitemdefinitionobj.setVersion(HapiFHIRHelpers.createstring(chargeitemdefinition.getChrgtmDfntnVrsnStrng() /** { "tree" :"ChargeItemDefinition.version", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setVersion"} **/
						));
Chargeitemdefinitionobj.setTitle(HapiFHIRHelpers.createstring(chargeitemdefinition.getChargeItemDefinitionTitleString() /** { "tree" :"ChargeItemDefinition.title", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setTitle"} **/
						));
Chargeitemdefinitionobj.addDerivedFromUri(HapiFHIRHelpers.createuri(chargeitemdefinition.getChrgtmDfntnDrvdFrmrRi() /** { "tree" :"ChargeItemDefinition.derivedFromUri", "datatype" : "uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addDerivedFromUri"} **/
						));
Chargeitemdefinitionobj.addPartOf(HapiFHIRHelpers.createcanonical(chargeitemdefinition.getChrgtmDfntnPrtfCnncl() /** { "tree" :"ChargeItemDefinition.partOf", "datatype" : "canonical", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addPartOf"} **/
						));
Chargeitemdefinitionobj.addReplaces(HapiFHIRHelpers.createcanonical(chargeitemdefinition.getChrgtmDfntnRplcsCnncl() /** { "tree" :"ChargeItemDefinition.replaces", "datatype" : "canonical", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addReplaces"} **/
						));
Chargeitemdefinitionobj.setStatus(HapiFHIRHelpers.createcode(chargeitemdefinition.getChargeItemDefinitionStatusCode() /** { "tree" :"ChargeItemDefinition.status", "datatype" : "code", "cardinality" : "Required", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Chargeitemdefinitionobj.setExperimental(HapiFHIRHelpers.createboolean(chargeitemdefinition.getChrgtmDfntnXprmntlBln() /** { "tree" :"ChargeItemDefinition.experimental", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setExperimental"} **/
						));
Chargeitemdefinitionobj.setDate(HapiFHIRHelpers.createdateTime(chargeitemdefinition.getChargeItemDefinitionDateDateTime() /** { "tree" :"ChargeItemDefinition.date", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDate"} **/
						));
Chargeitemdefinitionobj.setPublisher(HapiFHIRHelpers.createstring(chargeitemdefinition.getChrgtmDfntnPblshrStrng() /** { "tree" :"ChargeItemDefinition.publisher", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPublisher"} **/
						));
Chargeitemdefinitionobj.addContact(HapiFHIRHelpers.createContactDetail(chargeitemdefinition.getChrgtmDfntnCntctCntctDtlTlcmCntctPntPrdStrt() /** { "tree" :"ChargeItemDefinition.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setStart"} **/
						, chargeitemdefinition.getChrgtmDfntnCntctCntctDtlTlcmCntctPntPrdNd() /** { "tree" :"ChargeItemDefinition.contact", "datatype" : "ContactDetail, ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setPeriod, setEnd"} **/
						, chargeitemdefinition.getChrgtmDfntnCntctCntctDtlTlcmCntctPntSstm() /** { "tree" :"ChargeItemDefinition.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setSystem"} **/
						, chargeitemdefinition.getChrgtmDfntnCntctCntctDtlTlcmCntctPntVlue() /** { "tree" :"ChargeItemDefinition.contact", "datatype" : "ContactDetail, ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setValue"} **/
						, chargeitemdefinition.getChrgtmDfntnCntctCntctDtlTlcmCntctPntSe() /** { "tree" :"ChargeItemDefinition.contact", "datatype" : "ContactDetail, ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setUse"} **/
						, chargeitemdefinition.getChrgtmDfntnCntctCntctDtlTlcmCntctPntRnk() /** { "tree" :"ChargeItemDefinition.contact", "datatype" : "ContactDetail, ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setTelecom, setRank"} **/
						, chargeitemdefinition.getChrgtmDfntnCntctCntctDtlNme() /** { "tree" :"ChargeItemDefinition.contact", "datatype" : "ContactDetail, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, addName"} **/
						));
Chargeitemdefinitionobj.setDescription(HapiFHIRHelpers.createmarkdown(chargeitemdefinition.getChrgtmDfntnDscrptnMrkdwn() /** { "tree" :"ChargeItemDefinition.description", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDescription"} **/
						));
Chargeitemdefinitionobj.addUseContext(HapiFHIRHelpers.createUsageContext(chargeitemdefinition.getChrgtmDfntnSCntxtSgCntxtVlCcCcCSstm() /** { "tree" :"ChargeItemDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setSystem"} **/
						, chargeitemdefinition.getChrgtmDfntnSCntxtSgCntxtVlCcCcCVrsn() /** { "tree" :"ChargeItemDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setVersion"} **/
						, chargeitemdefinition.getChrgtmDfntnSCntxtSgCntxtVlCcCcCCde() /** { "tree" :"ChargeItemDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setCode"} **/
						, chargeitemdefinition.getChrgtmDfntnSCntxtSgCntxtVlCcCcCDsplay() /** { "tree" :"ChargeItemDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setDisplay"} **/
						, chargeitemdefinition.getChrgtmDfntnSCntxtSgCntxtVlCcCcCSrSlctd() /** { "tree" :"ChargeItemDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, addCoding, setUserSelected"} **/
						, chargeitemdefinition.getChrgtmDfntnSCntxtSgCntxtVlCcCcTxt() /** { "tree" :"ChargeItemDefinition.useContext", "datatype" : "UsageContext, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueCodeableConcept, setText"} **/
						, chargeitemdefinition.getChrgtmDfntnSCntxtSgCntxtCdCSstm() /** { "tree" :"ChargeItemDefinition.useContext", "datatype" : "UsageContext, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setSystem"} **/
						, chargeitemdefinition.getChrgtmDfntnSCntxtSgCntxtCdCVrsn() /** { "tree" :"ChargeItemDefinition.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setVersion"} **/
						, chargeitemdefinition.getChrgtmDfntnSCntxtSgCntxtCdCCde() /** { "tree" :"ChargeItemDefinition.useContext", "datatype" : "UsageContext, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setCode"} **/
						, chargeitemdefinition.getChrgtmDfntnSCntxtSgCntxtCdCDsplay() /** { "tree" :"ChargeItemDefinition.useContext", "datatype" : "UsageContext, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setDisplay"} **/
						, chargeitemdefinition.getChrgtmDfntnSCntxtSgCntxtCdCSrSlctd() /** { "tree" :"ChargeItemDefinition.useContext", "datatype" : "UsageContext, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addCode, setUserSelected"} **/
						, chargeitemdefinition.getChrgtmDfntnSCntxtSgCntxtVlQnttQnttVlue() /** { "tree" :"ChargeItemDefinition.useContext", "datatype" : "UsageContext, Quantity, decimal", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setValue"} **/
						, chargeitemdefinition.getChrgtmDfntnSCntxtSgCntxtVlQnttQnttCmprtr() /** { "tree" :"ChargeItemDefinition.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setComparator"} **/
						, chargeitemdefinition.getChrgtmDfntnSCntxtSgCntxtVlQnttQnttNt() /** { "tree" :"ChargeItemDefinition.useContext", "datatype" : "UsageContext, Quantity, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setUnit"} **/
						, chargeitemdefinition.getChrgtmDfntnSCntxtSgCntxtVlQnttQnttSstm() /** { "tree" :"ChargeItemDefinition.useContext", "datatype" : "UsageContext, Quantity, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setSystem"} **/
						, chargeitemdefinition.getChrgtmDfntnSCntxtSgCntxtVlQnttQnttCde() /** { "tree" :"ChargeItemDefinition.useContext", "datatype" : "UsageContext, Quantity, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueQuantity, setCode"} **/
						, chargeitemdefinition.getChrgtmDfntnSCntxtSgCntxtVlRngRngLw() /** { "tree" :"ChargeItemDefinition.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setLow"} **/
						, chargeitemdefinition.getChrgtmDfntnSCntxtSgCntxtVlRngRngHgh() /** { "tree" :"ChargeItemDefinition.useContext", "datatype" : "UsageContext, Range, SimpleQuantity", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueRange, setHigh"} **/
						, chargeitemdefinition.getChrgtmDfntnSCntxtSgCntxtVlRfrnce() /** { "tree" :"ChargeItemDefinition.useContext", "datatype" : "UsageContext, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addUseContext, addValueReference"} **/
						));
Chargeitemdefinitionobj.addJurisdiction(HapiFHIRHelpers.createCodeableConcept(chargeitemdefinition.getChrgtmDfntnJrsdctnCcCdngCSstm() /** { "tree" :"ChargeItemDefinition.jurisdiction", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setSystem"} **/
						, chargeitemdefinition.getChrgtmDfntnJrsdctnCcCdngCVrsn() /** { "tree" :"ChargeItemDefinition.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setVersion"} **/
						, chargeitemdefinition.getChrgtmDfntnJrsdctnCcCdngCCde() /** { "tree" :"ChargeItemDefinition.jurisdiction", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setCode"} **/
						, chargeitemdefinition.getChrgtmDfntnJrsdctnCcCdngCDsplay() /** { "tree" :"ChargeItemDefinition.jurisdiction", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setDisplay"} **/
						, chargeitemdefinition.getChrgtmDfntnJrsdctnCcCdngCSrSlctd() /** { "tree" :"ChargeItemDefinition.jurisdiction", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, addCoding, setUserSelected"} **/
						, chargeitemdefinition.getChrgtmDfntnJrsdctnCcTxt() /** { "tree" :"ChargeItemDefinition.jurisdiction", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addJurisdiction, setText"} **/
						));
Chargeitemdefinitionobj.setCopyright(HapiFHIRHelpers.createmarkdown(chargeitemdefinition.getChrgtmDfntnCprghtMrkdwn() /** { "tree" :"ChargeItemDefinition.copyright", "datatype" : "markdown", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCopyright"} **/
						));
Chargeitemdefinitionobj.setApprovalDate(HapiFHIRHelpers.createdate(chargeitemdefinition.getChrgtmDfntnPprvlDtDte() /** { "tree" :"ChargeItemDefinition.approvalDate", "datatype" : "date", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setApprovalDate"} **/
						));
Chargeitemdefinitionobj.setLastReviewDate(HapiFHIRHelpers.createdate(chargeitemdefinition.getChrgtmDfntnLstRvwDtDte() /** { "tree" :"ChargeItemDefinition.lastReviewDate", "datatype" : "date", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setLastReviewDate"} **/
						));
Chargeitemdefinitionobj.setEffectivePeriod(HapiFHIRHelpers.createPeriod(chargeitemdefinition.getChrgtmDfntnFfctvPrdPrdStrt() /** { "tree" :"ChargeItemDefinition.effectivePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectivePeriod, setStart"} **/
						, chargeitemdefinition.getChrgtmDfntnFfctvPrdPrdNd() /** { "tree" :"ChargeItemDefinition.effectivePeriod", "datatype" : "Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setEffectivePeriod, setEnd"} **/
						));
Chargeitemdefinitionobj.setCode(HapiFHIRHelpers.createCodeableConcept(chargeitemdefinition.getChrgtmDfntnCdCcCdngCSstm() /** { "tree" :"ChargeItemDefinition.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setSystem"} **/
						, chargeitemdefinition.getChrgtmDfntnCdCcCdngCVrsn() /** { "tree" :"ChargeItemDefinition.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setVersion"} **/
						, chargeitemdefinition.getChrgtmDfntnCdCcCdngCCde() /** { "tree" :"ChargeItemDefinition.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setCode"} **/
						, chargeitemdefinition.getChrgtmDfntnCdCcCdngCDsplay() /** { "tree" :"ChargeItemDefinition.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, chargeitemdefinition.getChrgtmDfntnCdCcCdngCSrSlctd() /** { "tree" :"ChargeItemDefinition.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, chargeitemdefinition.getChargeItemDefinitionCodeCcText() /** { "tree" :"ChargeItemDefinition.code", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setCode, setText"} **/
						));
Chargeitemdefinitionobj.addInstance(HapiFHIRHelpers.createReference(chargeitemdefinition.getChrgtmDfntnNstncRfrnce() /** { "tree" :"ChargeItemDefinition.instance", "datatype" : "Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addInstance"} **/
						));
Chargeitemdefinitionobj.setDescription(HapiFHIRHelpers.createstring(chargeitemdefinition.getChrgtmDfntnPplcbltDscrptnStrng() /** { "tree" :"ChargeItemDefinition.applicability.description", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addApplicability"] , "methodName" : "setDescription"} **/
						));
Chargeitemdefinitionobj.setLanguage(HapiFHIRHelpers.createstring(chargeitemdefinition.getChrgtmDfntnPplcbltLnggStrng() /** { "tree" :"ChargeItemDefinition.applicability.language", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addApplicability"] , "methodName" : "setLanguage"} **/
						));
Chargeitemdefinitionobj.setExpression(HapiFHIRHelpers.createstring(chargeitemdefinition.getChrgtmDfntnPplcbltXprssnStrng() /** { "tree" :"ChargeItemDefinition.applicability.expression", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addApplicability"] , "methodName" : "setExpression"} **/
						));
Chargeitemdefinitionobj.addApplicability(HapiFHIRHelpers.createapplicability(chargeitemdefinition.getChrgtmDfntnPrprtGrpPplcbltPplcblty() /** { "tree" :"ChargeItemDefinition.propertyGroup.applicability", "datatype" : "applicability", "cardinality" : "Many", "elementtree" : ["addPropertyGroup"] , "methodName" : "addApplicability"} **/
						));
Chargeitemdefinitionobj.setType(HapiFHIRHelpers.createcode(chargeitemdefinition.getChrgtmDfntnPrprtGrpPrcCmpnntTpCde() /** { "tree" :"ChargeItemDefinition.propertyGroup.priceComponent.type", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addPropertyGroup", "addPriceComponent"] , "methodName" : "setType"} **/
						));
Chargeitemdefinitionobj.setCode(HapiFHIRHelpers.createCodeableConcept(chargeitemdefinition.getChrgtmDfntnPrprtGrpPrcCmpnntCdCcCdngCSstm() /** { "tree" :"ChargeItemDefinition.propertyGroup.priceComponent.code", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addPropertyGroup", "addPriceComponent"] , "methodName" : "setCode, addCoding, setSystem"} **/
						, chargeitemdefinition.getChrgtmDfntnPrprtGrpPrcCmpnntCdCcCdngCVrsn() /** { "tree" :"ChargeItemDefinition.propertyGroup.priceComponent.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addPropertyGroup", "addPriceComponent"] , "methodName" : "setCode, addCoding, setVersion"} **/
						, chargeitemdefinition.getChrgtmDfntnPrprtGrpPrcCmpnntCdCcCdngCCde() /** { "tree" :"ChargeItemDefinition.propertyGroup.priceComponent.code", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addPropertyGroup", "addPriceComponent"] , "methodName" : "setCode, addCoding, setCode"} **/
						, chargeitemdefinition.getChrgtmDfntnPrprtGrpPrcCmpnntCdCcCdngCDsplay() /** { "tree" :"ChargeItemDefinition.propertyGroup.priceComponent.code", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addPropertyGroup", "addPriceComponent"] , "methodName" : "setCode, addCoding, setDisplay"} **/
						, chargeitemdefinition.getChrgtmDfntnPrprtGrpPrcCmpnntCdCcCdngCSrSlctd() /** { "tree" :"ChargeItemDefinition.propertyGroup.priceComponent.code", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addPropertyGroup", "addPriceComponent"] , "methodName" : "setCode, addCoding, setUserSelected"} **/
						, chargeitemdefinition.getChrgtmDfntnPrprtGrpPrcCmpnntCdCcTxt() /** { "tree" :"ChargeItemDefinition.propertyGroup.priceComponent.code", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addPropertyGroup", "addPriceComponent"] , "methodName" : "setCode, setText"} **/
						));
Chargeitemdefinitionobj.setFactor(HapiFHIRHelpers.createdecimal(chargeitemdefinition.getChrgtmDfntnPrprtGrpPrcCmpnntFctrDcml() /** { "tree" :"ChargeItemDefinition.propertyGroup.priceComponent.factor", "datatype" : "decimal", "cardinality" : "ZeroOne", "elementtree" : ["addPropertyGroup", "addPriceComponent"] , "methodName" : "setFactor"} **/
						));
Chargeitemdefinitionobj.setAmount(HapiFHIRHelpers.createMoney(chargeitemdefinition.getChrgtmDfntnPrprtGrpPrcCmpnntMntMnCrrncy() /** { "tree" :"ChargeItemDefinition.propertyGroup.priceComponent.amount", "datatype" : "Money, code", "cardinality" : "ZeroOne", "elementtree" : ["addPropertyGroup", "addPriceComponent"] , "methodName" : "setAmount, setCurrency"} **/
						, chargeitemdefinition.getChrgtmDfntnPrprtGrpPrcCmpnntMntMnVlue() /** { "tree" :"ChargeItemDefinition.propertyGroup.priceComponent.amount", "datatype" : "Money, decimal", "cardinality" : "ZeroOne", "elementtree" : ["addPropertyGroup", "addPriceComponent"] , "methodName" : "setAmount, setVal"} **/
		));
	}
}
