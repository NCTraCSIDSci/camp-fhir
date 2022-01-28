package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Devicedefinition.
 * @see .Devicedefinition
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class DevicedefinitionConversion 
{
	public Patient Devicedefinitions(main.templateoutput.Model.Devicedefinition devicedefinition) 
	{
			Patient  Devicedefinitionobj = new Patient(); 

						Devicedefinitionobj.addIdentifier(HapiFHIRHelpers.createIdentifier(devicedefinition.getDvcDfntnDntfrDntfrSe() /** { "tree" :"DeviceDefinition.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, devicedefinition.getDvcDfntnDntfrDntfrTpCcCSstm() /** { "tree" :"DeviceDefinition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, devicedefinition.getDvcDfntnDntfrDntfrTpCcCVrsn() /** { "tree" :"DeviceDefinition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, devicedefinition.getDvcDfntnDntfrDntfrTpCcCCde() /** { "tree" :"DeviceDefinition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, devicedefinition.getDvcDfntnDntfrDntfrTpCcCDsplay() /** { "tree" :"DeviceDefinition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, devicedefinition.getDvcDfntnDntfrDntfrTpCcCSrSlctd() /** { "tree" :"DeviceDefinition.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, devicedefinition.getDvcDfntnDntfrDntfrTpCcTxt() /** { "tree" :"DeviceDefinition.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, devicedefinition.getDvcDfntnDntfrDntfrPrdPrdStrt() /** { "tree" :"DeviceDefinition.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, devicedefinition.getDvcDfntnDntfrDntfrPrdPrdNd() /** { "tree" :"DeviceDefinition.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, devicedefinition.getDvcDfntnDntfrDntfrSsgnr() /** { "tree" :"DeviceDefinition.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, devicedefinition.getDvcDfntnDntfrDntfrVlue() /** { "tree" :"DeviceDefinition.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, devicedefinition.getDvcDfntnDntfrDntfrSstm() /** { "tree" :"DeviceDefinition.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Devicedefinitionobj.setDeviceIdentifier(HapiFHIRHelpers.createstring(devicedefinition.getDvcDfntnDDvcdntfrDvcdntfrStrng() /** { "tree" :"DeviceDefinition.udiDeviceIdentifier.deviceIdentifier", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addUdiDeviceIdentifier"] , "methodName" : "setDeviceIdentifier"} **/
						));
Devicedefinitionobj.setIssuer(HapiFHIRHelpers.createuri(devicedefinition.getDvcDfntnDDvcdntfrSsrRi() /** { "tree" :"DeviceDefinition.udiDeviceIdentifier.issuer", "datatype" : "uri", "cardinality" : "Required", "elementtree" : ["addUdiDeviceIdentifier"] , "methodName" : "setIssuer"} **/
						));
Devicedefinitionobj.setJurisdiction(HapiFHIRHelpers.createuri(devicedefinition.getDvcDfntnDDvcdntfrJrsdctnRi() /** { "tree" :"DeviceDefinition.udiDeviceIdentifier.jurisdiction", "datatype" : "uri", "cardinality" : "Required", "elementtree" : ["addUdiDeviceIdentifier"] , "methodName" : "setJurisdiction"} **/
						));
Devicedefinitionobj.setManufacturerString(HapiFHIRHelpers.createstring(devicedefinition.getDvcDfntnMnfctrrStrngStrng() /** { "tree" :"DeviceDefinition.manufacturerString", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setManufacturerString"} **/
						));
Devicedefinitionobj.setManufacturerReference(organization)(HapiFHIRHelpers.createReference(devicedefinition.getDvcDfntnMnfctrrRfrncRfrnce() /** { "tree" :"DeviceDefinition.manufacturerReference", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setManufacturerReference(organization)"} **/
						));
Devicedefinitionobj.setName(HapiFHIRHelpers.createstring(devicedefinition.getDvcDfntnDvcNmNmStrng() /** { "tree" :"DeviceDefinition.deviceName.name", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addDeviceName"] , "methodName" : "setName"} **/
						));
Devicedefinitionobj.setType(HapiFHIRHelpers.createcode(devicedefinition.getDvcDfntnDvcNmTpCde() /** { "tree" :"DeviceDefinition.deviceName.type", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addDeviceName"] , "methodName" : "setType"} **/
						));
Devicedefinitionobj.setModelNumber(HapiFHIRHelpers.createstring(devicedefinition.getDvcDfntnMdlNmbrStrng() /** { "tree" :"DeviceDefinition.modelNumber", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setModelNumber"} **/
						));
Devicedefinitionobj.setType(HapiFHIRHelpers.createCodeableConcept(devicedefinition.getDvcDfntnTpCcCdngCSstm() /** { "tree" :"DeviceDefinition.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setSystem"} **/
						, devicedefinition.getDvcDfntnTpCcCdngCVrsn() /** { "tree" :"DeviceDefinition.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setVersion"} **/
						, devicedefinition.getDvcDfntnTpCcCdngCCde() /** { "tree" :"DeviceDefinition.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setCode"} **/
						, devicedefinition.getDvcDfntnTpCcCdngCDsplay() /** { "tree" :"DeviceDefinition.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setDisplay"} **/
						, devicedefinition.getDvcDfntnTpCcCdngCSrSlctd() /** { "tree" :"DeviceDefinition.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, devicedefinition.getDeviceDefinitionTypeCcText() /** { "tree" :"DeviceDefinition.type", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, setText"} **/
						));
Devicedefinitionobj.setSystemType(HapiFHIRHelpers.createstring(devicedefinition.getDvcDfntnSpclztnSstmTpStrng() /** { "tree" :"DeviceDefinition.specialization.systemType", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addSpecialization"] , "methodName" : "setSystemType"} **/
						));
Devicedefinitionobj.setVersion(HapiFHIRHelpers.createstring(devicedefinition.getDvcDfntnSpclztnVrsnStrng() /** { "tree" :"DeviceDefinition.specialization.version", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addSpecialization"] , "methodName" : "setVersion"} **/
						));
Devicedefinitionobj.addVersion(HapiFHIRHelpers.createstring(devicedefinition.getDeviceDefinitionVersionString() /** { "tree" :"DeviceDefinition.version", "datatype" : "string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addVersion"} **/
						));
Devicedefinitionobj.addSafety(HapiFHIRHelpers.createCodeableConcept(devicedefinition.getDvcDfntnSftCcCdngCSstm() /** { "tree" :"DeviceDefinition.safety", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSafety, addCoding, setSystem"} **/
						, devicedefinition.getDvcDfntnSftCcCdngCVrsn() /** { "tree" :"DeviceDefinition.safety", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSafety, addCoding, setVersion"} **/
						, devicedefinition.getDvcDfntnSftCcCdngCCde() /** { "tree" :"DeviceDefinition.safety", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSafety, addCoding, setCode"} **/
						, devicedefinition.getDvcDfntnSftCcCdngCDsplay() /** { "tree" :"DeviceDefinition.safety", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSafety, addCoding, setDisplay"} **/
						, devicedefinition.getDvcDfntnSftCcCdngCSrSlctd() /** { "tree" :"DeviceDefinition.safety", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSafety, addCoding, setUserSelected"} **/
						, devicedefinition.getDeviceDefinitionSafetyCcText() /** { "tree" :"DeviceDefinition.safety", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSafety, setText"} **/
						));
Devicedefinitionobj.addShelfLifeStorage(HapiFHIRHelpers.createProductShelfLife(devicedefinition.getDvcDfntnShlfLfStrgPrdctShlfLfe() /** { "tree" :"DeviceDefinition.shelfLifeStorage", "datatype" : "ProductShelfLife", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addShelfLifeStorage"} **/
						));
Devicedefinitionobj.setPhysicalCharacteristics(HapiFHIRHelpers.createProdCharacteristic(devicedefinition.getDvcDfntnPhsclchrctrsPrdChrctrstc() /** { "tree" :"DeviceDefinition.physicalCharacteristics", "datatype" : "ProdCharacteristic", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPhysicalCharacteristics"} **/
						));
Devicedefinitionobj.addLanguageCode(HapiFHIRHelpers.createCodeableConcept(devicedefinition.getDvcDfntnLnggCdCcCdngCSstm() /** { "tree" :"DeviceDefinition.languageCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addLanguageCode, addCoding, setSystem"} **/
						, devicedefinition.getDvcDfntnLnggCdCcCdngCVrsn() /** { "tree" :"DeviceDefinition.languageCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addLanguageCode, addCoding, setVersion"} **/
						, devicedefinition.getDvcDfntnLnggCdCcCdngCCde() /** { "tree" :"DeviceDefinition.languageCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addLanguageCode, addCoding, setCode"} **/
						, devicedefinition.getDvcDfntnLnggCdCcCdngCDsplay() /** { "tree" :"DeviceDefinition.languageCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addLanguageCode, addCoding, setDisplay"} **/
						, devicedefinition.getDvcDfntnLnggCdCcCdngCSrSlctd() /** { "tree" :"DeviceDefinition.languageCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addLanguageCode, addCoding, setUserSelected"} **/
						, devicedefinition.getDvcDfntnLnggCdCcTxt() /** { "tree" :"DeviceDefinition.languageCode", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addLanguageCode, setText"} **/
						));
Devicedefinitionobj.setType(HapiFHIRHelpers.createCodeableConcept(devicedefinition.getDvcDfntnCpbltTpCcCdngCSstm() /** { "tree" :"DeviceDefinition.capability.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addCapability"] , "methodName" : "setType, addCoding, setSystem"} **/
						, devicedefinition.getDvcDfntnCpbltTpCcCdngCVrsn() /** { "tree" :"DeviceDefinition.capability.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addCapability"] , "methodName" : "setType, addCoding, setVersion"} **/
						, devicedefinition.getDvcDfntnCpbltTpCcCdngCCde() /** { "tree" :"DeviceDefinition.capability.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addCapability"] , "methodName" : "setType, addCoding, setCode"} **/
						, devicedefinition.getDvcDfntnCpbltTpCcCdngCDsplay() /** { "tree" :"DeviceDefinition.capability.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addCapability"] , "methodName" : "setType, addCoding, setDisplay"} **/
						, devicedefinition.getDvcDfntnCpbltTpCcCdngCSrSlctd() /** { "tree" :"DeviceDefinition.capability.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addCapability"] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, devicedefinition.getDvcDfntnCpbltTpCcTxt() /** { "tree" :"DeviceDefinition.capability.type", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addCapability"] , "methodName" : "setType, setText"} **/
						));
Devicedefinitionobj.addDescription(HapiFHIRHelpers.createCodeableConcept(devicedefinition.getDvcDfntnCpbltDscrptnCcCdngCSstm() /** { "tree" :"DeviceDefinition.capability.description", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addCapability"] , "methodName" : "addDescription, addCoding, setSystem"} **/
						, devicedefinition.getDvcDfntnCpbltDscrptnCcCdngCVrsn() /** { "tree" :"DeviceDefinition.capability.description", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addCapability"] , "methodName" : "addDescription, addCoding, setVersion"} **/
						, devicedefinition.getDvcDfntnCpbltDscrptnCcCdngCCde() /** { "tree" :"DeviceDefinition.capability.description", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addCapability"] , "methodName" : "addDescription, addCoding, setCode"} **/
						, devicedefinition.getDvcDfntnCpbltDscrptnCcCdngCDsplay() /** { "tree" :"DeviceDefinition.capability.description", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addCapability"] , "methodName" : "addDescription, addCoding, setDisplay"} **/
						, devicedefinition.getDvcDfntnCpbltDscrptnCcCdngCSrSlctd() /** { "tree" :"DeviceDefinition.capability.description", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addCapability"] , "methodName" : "addDescription, addCoding, setUserSelected"} **/
						, devicedefinition.getDvcDfntnCpbltDscrptnCcTxt() /** { "tree" :"DeviceDefinition.capability.description", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addCapability"] , "methodName" : "addDescription, setText"} **/
						));
Devicedefinitionobj.setType(HapiFHIRHelpers.createCodeableConcept(devicedefinition.getDvcDfntnPrprtTpCcCdngCSstm() /** { "tree" :"DeviceDefinition.property.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addProperty"] , "methodName" : "setType, addCoding, setSystem"} **/
						, devicedefinition.getDvcDfntnPrprtTpCcCdngCVrsn() /** { "tree" :"DeviceDefinition.property.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addProperty"] , "methodName" : "setType, addCoding, setVersion"} **/
						, devicedefinition.getDvcDfntnPrprtTpCcCdngCCde() /** { "tree" :"DeviceDefinition.property.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addProperty"] , "methodName" : "setType, addCoding, setCode"} **/
						, devicedefinition.getDvcDfntnPrprtTpCcCdngCDsplay() /** { "tree" :"DeviceDefinition.property.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addProperty"] , "methodName" : "setType, addCoding, setDisplay"} **/
						, devicedefinition.getDvcDfntnPrprtTpCcCdngCSrSlctd() /** { "tree" :"DeviceDefinition.property.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addProperty"] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, devicedefinition.getDvcDfntnPrprtTpCcTxt() /** { "tree" :"DeviceDefinition.property.type", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addProperty"] , "methodName" : "setType, setText"} **/
						));
Devicedefinitionobj.addValueQuantity(HapiFHIRHelpers.createQuantity(devicedefinition.getDvcDfntnPrprtVlQnttQnttCmprtr() /** { "tree" :"DeviceDefinition.property.valueQuantity", "datatype" : "Quantity, code", "cardinality" : "Many", "elementtree" : ["addProperty"] , "methodName" : "addValueQuantity, setComparator"} **/
						, devicedefinition.getDvcDfntnPrprtVlQnttQnttCde() /** { "tree" :"DeviceDefinition.property.valueQuantity", "datatype" : "Quantity, code", "cardinality" : "Many", "elementtree" : ["addProperty"] , "methodName" : "addValueQuantity, setCode"} **/
						, devicedefinition.getDvcDfntnPrprtVlQnttQnttVlue() /** { "tree" :"DeviceDefinition.property.valueQuantity", "datatype" : "Quantity, decimal", "cardinality" : "Many", "elementtree" : ["addProperty"] , "methodName" : "addValueQuantity, setValue"} **/
						, devicedefinition.getDvcDfntnPrprtVlQnttQnttNt() /** { "tree" :"DeviceDefinition.property.valueQuantity", "datatype" : "Quantity, string", "cardinality" : "Many", "elementtree" : ["addProperty"] , "methodName" : "addValueQuantity, setUnit"} **/
						, devicedefinition.getDvcDfntnPrprtVlQnttQnttSstm() /** { "tree" :"DeviceDefinition.property.valueQuantity", "datatype" : "Quantity, uri", "cardinality" : "Many", "elementtree" : ["addProperty"] , "methodName" : "addValueQuantity, setSystem"} **/
						));
Devicedefinitionobj.addValueCode(HapiFHIRHelpers.createCodeableConcept(devicedefinition.getDvcDfntnPrprtVlCdCcCdngCSstm() /** { "tree" :"DeviceDefinition.property.valueCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addProperty"] , "methodName" : "addValueCode, addCoding, setSystem"} **/
						, devicedefinition.getDvcDfntnPrprtVlCdCcCdngCVrsn() /** { "tree" :"DeviceDefinition.property.valueCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addProperty"] , "methodName" : "addValueCode, addCoding, setVersion"} **/
						, devicedefinition.getDvcDfntnPrprtVlCdCcCdngCCde() /** { "tree" :"DeviceDefinition.property.valueCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addProperty"] , "methodName" : "addValueCode, addCoding, setCode"} **/
						, devicedefinition.getDvcDfntnPrprtVlCdCcCdngCDsplay() /** { "tree" :"DeviceDefinition.property.valueCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addProperty"] , "methodName" : "addValueCode, addCoding, setDisplay"} **/
						, devicedefinition.getDvcDfntnPrprtVlCdCcCdngCSrSlctd() /** { "tree" :"DeviceDefinition.property.valueCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addProperty"] , "methodName" : "addValueCode, addCoding, setUserSelected"} **/
						, devicedefinition.getDvcDfntnPrprtVlCdCcTxt() /** { "tree" :"DeviceDefinition.property.valueCode", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addProperty"] , "methodName" : "addValueCode, setText"} **/
						));
Devicedefinitionobj.setOwner(HapiFHIRHelpers.createReference(devicedefinition.getDeviceDefinitionOwnerReference() /** { "tree" :"DeviceDefinition.owner", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOwner"} **/
						));
Devicedefinitionobj.addContact(HapiFHIRHelpers.createContactPoint(devicedefinition.getDvcDfntnCntctCntctPntSstm() /** { "tree" :"DeviceDefinition.contact", "datatype" : "ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setSystem"} **/
						, devicedefinition.getDvcDfntnCntctCntctPntSe() /** { "tree" :"DeviceDefinition.contact", "datatype" : "ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setUse"} **/
						, devicedefinition.getDvcDfntnCntctCntctPntPrdPrdStrt() /** { "tree" :"DeviceDefinition.contact", "datatype" : "ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setPeriod, setStart"} **/
						, devicedefinition.getDvcDfntnCntctCntctPntPrdPrdNd() /** { "tree" :"DeviceDefinition.contact", "datatype" : "ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setPeriod, setEnd"} **/
						, devicedefinition.getDvcDfntnCntctCntctPntRnk() /** { "tree" :"DeviceDefinition.contact", "datatype" : "ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setRank"} **/
						, devicedefinition.getDvcDfntnCntctCntctPntVlue() /** { "tree" :"DeviceDefinition.contact", "datatype" : "ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setValue"} **/
						));
Devicedefinitionobj.setUrl(HapiFHIRHelpers.createuri(devicedefinition.getDeviceDefinitionUrlUri() /** { "tree" :"DeviceDefinition.url", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setUrl"} **/
						));
Devicedefinitionobj.setOnlineInformation(HapiFHIRHelpers.createuri(devicedefinition.getDvcDfntnNlnnfrmtnRi() /** { "tree" :"DeviceDefinition.onlineInformation", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOnlineInformation"} **/
						));
Devicedefinitionobj.addNote(HapiFHIRHelpers.createAnnotation(devicedefinition.getDvcDfntnNtNnttnTme() /** { "tree" :"DeviceDefinition.note", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setTime"} **/
						, devicedefinition.getDvcDfntnNtNnttnTxt() /** { "tree" :"DeviceDefinition.note", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setText"} **/
						, devicedefinition.getDvcDfntnNtNnttnThrRfrnce() /** { "tree" :"DeviceDefinition.note", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorReference"} **/
						, devicedefinition.getDvcDfntnNtNnttnThrStrng() /** { "tree" :"DeviceDefinition.note", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorString"} **/
						));
Devicedefinitionobj.setQuantity(HapiFHIRHelpers.createQuantity(devicedefinition.getDvcDfntnQnttQnttCmprtr() /** { "tree" :"DeviceDefinition.quantity", "datatype" : "Quantity, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setQuantity, setComparator"} **/
						, devicedefinition.getDvcDfntnQnttQnttCde() /** { "tree" :"DeviceDefinition.quantity", "datatype" : "Quantity, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setQuantity, setCode"} **/
						, devicedefinition.getDvcDfntnQnttQnttVlue() /** { "tree" :"DeviceDefinition.quantity", "datatype" : "Quantity, decimal", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setQuantity, setValue"} **/
						, devicedefinition.getDvcDfntnQnttQnttNt() /** { "tree" :"DeviceDefinition.quantity", "datatype" : "Quantity, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setQuantity, setUnit"} **/
						, devicedefinition.getDvcDfntnQnttQnttSstm() /** { "tree" :"DeviceDefinition.quantity", "datatype" : "Quantity, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setQuantity, setSystem"} **/
						));
Devicedefinitionobj.setParentDevice(HapiFHIRHelpers.createReference(devicedefinition.getDvcDfntnPrntDvcRfrnce() /** { "tree" :"DeviceDefinition.parentDevice", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setParentDevice"} **/
						));
Devicedefinitionobj.setSubstance(HapiFHIRHelpers.createCodeableConcept(devicedefinition.getDvcDfntnMtrlSbstncCcCdngCSstm() /** { "tree" :"DeviceDefinition.material.substance", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addMaterial"] , "methodName" : "setSubstance, addCoding, setSystem"} **/
						, devicedefinition.getDvcDfntnMtrlSbstncCcCdngCVrsn() /** { "tree" :"DeviceDefinition.material.substance", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addMaterial"] , "methodName" : "setSubstance, addCoding, setVersion"} **/
						, devicedefinition.getDvcDfntnMtrlSbstncCcCdngCCde() /** { "tree" :"DeviceDefinition.material.substance", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addMaterial"] , "methodName" : "setSubstance, addCoding, setCode"} **/
						, devicedefinition.getDvcDfntnMtrlSbstncCcCdngCDsplay() /** { "tree" :"DeviceDefinition.material.substance", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addMaterial"] , "methodName" : "setSubstance, addCoding, setDisplay"} **/
						, devicedefinition.getDvcDfntnMtrlSbstncCcCdngCSrSlctd() /** { "tree" :"DeviceDefinition.material.substance", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addMaterial"] , "methodName" : "setSubstance, addCoding, setUserSelected"} **/
						, devicedefinition.getDvcDfntnMtrlSbstncCcTxt() /** { "tree" :"DeviceDefinition.material.substance", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addMaterial"] , "methodName" : "setSubstance, setText"} **/
						));
Devicedefinitionobj.setAlternate(HapiFHIRHelpers.createboolean(devicedefinition.getDvcDfntnMtrlLtrntBln() /** { "tree" :"DeviceDefinition.material.alternate", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addMaterial"] , "methodName" : "setAlternate"} **/
						));
Devicedefinitionobj.setAllergenicIndicator(HapiFHIRHelpers.createboolean(devicedefinition.getDvcDfntnMtrlLlrgncndctrBln() /** { "tree" :"DeviceDefinition.material.allergenicIndicator", "datatype" : "boolean", "cardinality" : "ZeroOne", "elementtree" : ["addMaterial"] , "methodName" : "setAllergenicIndicator"} **/
		));
	}
}
