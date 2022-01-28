package main.templateoutput.Conversions;
// Generated on Jan 28, 2022, 8:02:40 AM 


import org.hl7.fhir.r4.model.Patient;

/**
 *  object for conversion model class Device.
 * @see .Device
 * @author Paul Kovach
 */
import main.java.com.campfhir.service.conversion.HapiFHIRHelpers;

public class DeviceConversion 
{
	public Patient Devices(main.templateoutput.Model.Device device) 
	{
			Patient  Deviceobj = new Patient(); 

						Deviceobj.addIdentifier(HapiFHIRHelpers.createIdentifier(device.getDeviceIdentifierIdentifierUse() /** { "tree" :"Device.identifier", "datatype" : "Identifier, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setUse"} **/
						, device.getDvcDntfrDntfrTpCcCSstm() /** { "tree" :"Device.identifier", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setSystem"} **/
						, device.getDvcDntfrDntfrTpCcCVrsn() /** { "tree" :"Device.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setVersion"} **/
						, device.getDvcDntfrDntfrTpCcCCde() /** { "tree" :"Device.identifier", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setCode"} **/
						, device.getDvcDntfrDntfrTpCcCDsplay() /** { "tree" :"Device.identifier", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setDisplay"} **/
						, device.getDvcDntfrDntfrTpCcCSrSlctd() /** { "tree" :"Device.identifier", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, addCoding, setUserSelected"} **/
						, device.getDvcDntfrDntfrTpCcTxt() /** { "tree" :"Device.identifier", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setType, setText"} **/
						, device.getDvcDntfrDntfrPrdPrdStrt() /** { "tree" :"Device.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setStart"} **/
						, device.getDvcDntfrDntfrPrdPrdNd() /** { "tree" :"Device.identifier", "datatype" : "Identifier, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setPeriod, setEnd"} **/
						, device.getDvcDntfrDntfrSsgnr() /** { "tree" :"Device.identifier", "datatype" : "Identifier, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setAssigner"} **/
						, device.getDeviceIdentifierIdentifierValue() /** { "tree" :"Device.identifier", "datatype" : "Identifier, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setValue"} **/
						, device.getDvcDntfrDntfrSstm() /** { "tree" :"Device.identifier", "datatype" : "Identifier, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addIdentifier, setSystem"} **/
						));
Deviceobj.setDefinition(HapiFHIRHelpers.createReference(device.getDeviceDefinitionReference() /** { "tree" :"Device.definition", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDefinition"} **/
						));
Deviceobj.setDeviceIdentifier(HapiFHIRHelpers.createstring(device.getDvcDCrrrDvcdntfrStrng() /** { "tree" :"Device.udiCarrier.deviceIdentifier", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addUdiCarrier"] , "methodName" : "setDeviceIdentifier"} **/
						));
Deviceobj.setIssuer(HapiFHIRHelpers.createuri(device.getDeviceUdiCarrierIssuerUri() /** { "tree" :"Device.udiCarrier.issuer", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : ["addUdiCarrier"] , "methodName" : "setIssuer"} **/
						));
Deviceobj.setJurisdiction(HapiFHIRHelpers.createuri(device.getDeviceUdiCarrierJurisdictionUri() /** { "tree" :"Device.udiCarrier.jurisdiction", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : ["addUdiCarrier"] , "methodName" : "setJurisdiction"} **/
						));
Deviceobj.setCarrierAIDC(HapiFHIRHelpers.createbase64Binary(device.getDvcDCrrrCrrrDcBs64bnry() /** { "tree" :"Device.udiCarrier.carrierAIDC", "datatype" : "base64Binary", "cardinality" : "ZeroOne", "elementtree" : ["addUdiCarrier"] , "methodName" : "setCarrierAIDC"} **/
						));
Deviceobj.setCarrierHRF(HapiFHIRHelpers.createstring(device.getDvcDCrrrCrrrHrfStrng() /** { "tree" :"Device.udiCarrier.carrierHRF", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addUdiCarrier"] , "methodName" : "setCarrierHRF"} **/
						));
Deviceobj.setEntryType(HapiFHIRHelpers.createcode(device.getDeviceUdiCarrierEntryTypeCode() /** { "tree" :"Device.udiCarrier.entryType", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : ["addUdiCarrier"] , "methodName" : "setEntryType"} **/
						));
Deviceobj.setStatus(HapiFHIRHelpers.createcode(device.getDeviceStatusCode() /** { "tree" :"Device.status", "datatype" : "code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setStatus"} **/
						));
Deviceobj.addStatusReason(HapiFHIRHelpers.createCodeableConcept(device.getDvcSttsRsnCcCdngCSstm() /** { "tree" :"Device.statusReason", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addStatusReason, addCoding, setSystem"} **/
						, device.getDvcSttsRsnCcCdngCVrsn() /** { "tree" :"Device.statusReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addStatusReason, addCoding, setVersion"} **/
						, device.getDvcSttsRsnCcCdngCCde() /** { "tree" :"Device.statusReason", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addStatusReason, addCoding, setCode"} **/
						, device.getDvcSttsRsnCcCdngCDsplay() /** { "tree" :"Device.statusReason", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addStatusReason, addCoding, setDisplay"} **/
						, device.getDvcSttsRsnCcCdngCSrSlctd() /** { "tree" :"Device.statusReason", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addStatusReason, addCoding, setUserSelected"} **/
						, device.getDeviceStatusReasonCcText() /** { "tree" :"Device.statusReason", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addStatusReason, setText"} **/
						));
Deviceobj.setDistinctIdentifier(HapiFHIRHelpers.createstring(device.getDeviceDistinctIdentifierString() /** { "tree" :"Device.distinctIdentifier", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setDistinctIdentifier"} **/
						));
Deviceobj.setManufacturer(HapiFHIRHelpers.createstring(device.getDeviceManufacturerString() /** { "tree" :"Device.manufacturer", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setManufacturer"} **/
						));
Deviceobj.setManufactureDate(HapiFHIRHelpers.createdateTime(device.getDeviceManufactureDateDateTime() /** { "tree" :"Device.manufactureDate", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setManufactureDate"} **/
						));
Deviceobj.setExpirationDate(HapiFHIRHelpers.createdateTime(device.getDeviceExpirationDateDateTime() /** { "tree" :"Device.expirationDate", "datatype" : "dateTime", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setExpirationDate"} **/
						));
Deviceobj.setLotNumber(HapiFHIRHelpers.createstring(device.getDeviceLotNumberString() /** { "tree" :"Device.lotNumber", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setLotNumber"} **/
						));
Deviceobj.setSerialNumber(HapiFHIRHelpers.createstring(device.getDeviceSerialNumberString() /** { "tree" :"Device.serialNumber", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setSerialNumber"} **/
						));
Deviceobj.setName(HapiFHIRHelpers.createstring(device.getDeviceDeviceNameNameString() /** { "tree" :"Device.deviceName.name", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addDeviceName"] , "methodName" : "setName"} **/
						));
Deviceobj.setType(HapiFHIRHelpers.createcode(device.getDeviceDeviceNameTypeCode() /** { "tree" :"Device.deviceName.type", "datatype" : "code", "cardinality" : "Required", "elementtree" : ["addDeviceName"] , "methodName" : "setType"} **/
						));
Deviceobj.setModelNumber(HapiFHIRHelpers.createstring(device.getDeviceModelNumberString() /** { "tree" :"Device.modelNumber", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setModelNumber"} **/
						));
Deviceobj.setPartNumber(HapiFHIRHelpers.createstring(device.getDevicePartNumberString() /** { "tree" :"Device.partNumber", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPartNumber"} **/
						));
Deviceobj.setType(HapiFHIRHelpers.createCodeableConcept(device.getDeviceTypeCcCodingCSystem() /** { "tree" :"Device.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setSystem"} **/
						, device.getDeviceTypeCcCodingCVersion() /** { "tree" :"Device.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setVersion"} **/
						, device.getDeviceTypeCcCodingCCode() /** { "tree" :"Device.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setCode"} **/
						, device.getDeviceTypeCcCodingCDisplay() /** { "tree" :"Device.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setDisplay"} **/
						, device.getDvcTpCcCdngCSrSlctd() /** { "tree" :"Device.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, device.getDeviceTypeCcText() /** { "tree" :"Device.type", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setType, setText"} **/
						));
Deviceobj.setSystemType(HapiFHIRHelpers.createCodeableConcept(device.getDvcSpclztnSstmTpCcCdngCSstm() /** { "tree" :"Device.specialization.systemType", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addSpecialization"] , "methodName" : "setSystemType, addCoding, setSystem"} **/
						, device.getDvcSpclztnSstmTpCcCdngCVrsn() /** { "tree" :"Device.specialization.systemType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addSpecialization"] , "methodName" : "setSystemType, addCoding, setVersion"} **/
						, device.getDvcSpclztnSstmTpCcCdngCCde() /** { "tree" :"Device.specialization.systemType", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addSpecialization"] , "methodName" : "setSystemType, addCoding, setCode"} **/
						, device.getDvcSpclztnSstmTpCcCdngCDsplay() /** { "tree" :"Device.specialization.systemType", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addSpecialization"] , "methodName" : "setSystemType, addCoding, setDisplay"} **/
						, device.getDvcSpclztnSstmTpCcCdngCSrSlctd() /** { "tree" :"Device.specialization.systemType", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addSpecialization"] , "methodName" : "setSystemType, addCoding, setUserSelected"} **/
						, device.getDvcSpclztnSstmTpCcTxt() /** { "tree" :"Device.specialization.systemType", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addSpecialization"] , "methodName" : "setSystemType, setText"} **/
						));
Deviceobj.setVersion(HapiFHIRHelpers.createstring(device.getDvcSpclztnVrsnStrng() /** { "tree" :"Device.specialization.version", "datatype" : "string", "cardinality" : "ZeroOne", "elementtree" : ["addSpecialization"] , "methodName" : "setVersion"} **/
						));
Deviceobj.setType(HapiFHIRHelpers.createCodeableConcept(device.getDvcVrsnTpCcCdngCSstm() /** { "tree" :"Device.version.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addVersion"] , "methodName" : "setType, addCoding, setSystem"} **/
						, device.getDvcVrsnTpCcCdngCVrsn() /** { "tree" :"Device.version.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addVersion"] , "methodName" : "setType, addCoding, setVersion"} **/
						, device.getDvcVrsnTpCcCdngCCde() /** { "tree" :"Device.version.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addVersion"] , "methodName" : "setType, addCoding, setCode"} **/
						, device.getDvcVrsnTpCcCdngCDsplay() /** { "tree" :"Device.version.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addVersion"] , "methodName" : "setType, addCoding, setDisplay"} **/
						, device.getDvcVrsnTpCcCdngCSrSlctd() /** { "tree" :"Device.version.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addVersion"] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, device.getDeviceVersionTypeCcText() /** { "tree" :"Device.version.type", "datatype" : "CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addVersion"] , "methodName" : "setType, setText"} **/
						));
Deviceobj.setComponent(HapiFHIRHelpers.createIdentifier(device.getDvcVrsnCmpnntDntfrSe() /** { "tree" :"Device.version.component", "datatype" : "Identifier, code", "cardinality" : "ZeroOne", "elementtree" : ["addVersion"] , "methodName" : "setComponent, setUse"} **/
						, device.getDvcVrsnCmpnntDntfrTpCcCSstm() /** { "tree" :"Device.version.component", "datatype" : "Identifier, CodeableConcept, Coding, uri", "cardinality" : "ZeroOne", "elementtree" : ["addVersion"] , "methodName" : "setComponent, setType, addCoding, setSystem"} **/
						, device.getDvcVrsnCmpnntDntfrTpCcCVrsn() /** { "tree" :"Device.version.component", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addVersion"] , "methodName" : "setComponent, setType, addCoding, setVersion"} **/
						, device.getDvcVrsnCmpnntDntfrTpCcCCde() /** { "tree" :"Device.version.component", "datatype" : "Identifier, CodeableConcept, Coding, code", "cardinality" : "ZeroOne", "elementtree" : ["addVersion"] , "methodName" : "setComponent, setType, addCoding, setCode"} **/
						, device.getDvcVrsnCmpnntDntfrTpCcCDsplay() /** { "tree" :"Device.version.component", "datatype" : "Identifier, CodeableConcept, Coding, string", "cardinality" : "ZeroOne", "elementtree" : ["addVersion"] , "methodName" : "setComponent, setType, addCoding, setDisplay"} **/
						, device.getDvcVrsnCmpnntDntfrTpCcCSrSlctd() /** { "tree" :"Device.version.component", "datatype" : "Identifier, CodeableConcept, Coding, boolean", "cardinality" : "ZeroOne", "elementtree" : ["addVersion"] , "methodName" : "setComponent, setType, addCoding, setUserSelected"} **/
						, device.getDvcVrsnCmpnntDntfrTpCcTxt() /** { "tree" :"Device.version.component", "datatype" : "Identifier, CodeableConcept, string", "cardinality" : "ZeroOne", "elementtree" : ["addVersion"] , "methodName" : "setComponent, setType, setText"} **/
						, device.getDvcVrsnCmpnntDntfrPrdPrdStrt() /** { "tree" :"Device.version.component", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addVersion"] , "methodName" : "setComponent, setPeriod, setStart"} **/
						, device.getDvcVrsnCmpnntDntfrPrdPrdNd() /** { "tree" :"Device.version.component", "datatype" : "Identifier, Period, dateTime", "cardinality" : "ZeroOne", "elementtree" : ["addVersion"] , "methodName" : "setComponent, setPeriod, setEnd"} **/
						, device.getDvcVrsnCmpnntDntfrSsgnr() /** { "tree" :"Device.version.component", "datatype" : "Identifier, Reference", "cardinality" : "ZeroOne", "elementtree" : ["addVersion"] , "methodName" : "setComponent, setAssigner"} **/
						, device.getDvcVrsnCmpnntDntfrVlue() /** { "tree" :"Device.version.component", "datatype" : "Identifier, string", "cardinality" : "ZeroOne", "elementtree" : ["addVersion"] , "methodName" : "setComponent, setValue"} **/
						, device.getDvcVrsnCmpnntDntfrSstm() /** { "tree" :"Device.version.component", "datatype" : "Identifier, uri", "cardinality" : "ZeroOne", "elementtree" : ["addVersion"] , "methodName" : "setComponent, setSystem"} **/
						));
Deviceobj.setValue(HapiFHIRHelpers.createstring(device.getDeviceVersionValueString() /** { "tree" :"Device.version.value", "datatype" : "string", "cardinality" : "Required", "elementtree" : ["addVersion"] , "methodName" : "setValue"} **/
						));
Deviceobj.setType(HapiFHIRHelpers.createCodeableConcept(device.getDvcPrprtTpCcCdngCSstm() /** { "tree" :"Device.property.type", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Required", "elementtree" : ["addProperty"] , "methodName" : "setType, addCoding, setSystem"} **/
						, device.getDvcPrprtTpCcCdngCVrsn() /** { "tree" :"Device.property.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addProperty"] , "methodName" : "setType, addCoding, setVersion"} **/
						, device.getDvcPrprtTpCcCdngCCde() /** { "tree" :"Device.property.type", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Required", "elementtree" : ["addProperty"] , "methodName" : "setType, addCoding, setCode"} **/
						, device.getDvcPrprtTpCcCdngCDsplay() /** { "tree" :"Device.property.type", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Required", "elementtree" : ["addProperty"] , "methodName" : "setType, addCoding, setDisplay"} **/
						, device.getDvcPrprtTpCcCdngCSrSlctd() /** { "tree" :"Device.property.type", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Required", "elementtree" : ["addProperty"] , "methodName" : "setType, addCoding, setUserSelected"} **/
						, device.getDevicePropertyTypeCcText() /** { "tree" :"Device.property.type", "datatype" : "CodeableConcept, string", "cardinality" : "Required", "elementtree" : ["addProperty"] , "methodName" : "setType, setText"} **/
						));
Deviceobj.addValueQuantity(HapiFHIRHelpers.createQuantity(device.getDvcPrprtVlQnttQnttCmprtr() /** { "tree" :"Device.property.valueQuantity", "datatype" : "Quantity, code", "cardinality" : "Many", "elementtree" : ["addProperty"] , "methodName" : "addValueQuantity, setComparator"} **/
						, device.getDvcPrprtVlQnttQnttCde() /** { "tree" :"Device.property.valueQuantity", "datatype" : "Quantity, code", "cardinality" : "Many", "elementtree" : ["addProperty"] , "methodName" : "addValueQuantity, setCode"} **/
						, device.getDvcPrprtVlQnttQnttVlue() /** { "tree" :"Device.property.valueQuantity", "datatype" : "Quantity, decimal", "cardinality" : "Many", "elementtree" : ["addProperty"] , "methodName" : "addValueQuantity, setValue"} **/
						, device.getDvcPrprtVlQnttQnttNt() /** { "tree" :"Device.property.valueQuantity", "datatype" : "Quantity, string", "cardinality" : "Many", "elementtree" : ["addProperty"] , "methodName" : "addValueQuantity, setUnit"} **/
						, device.getDvcPrprtVlQnttQnttSstm() /** { "tree" :"Device.property.valueQuantity", "datatype" : "Quantity, uri", "cardinality" : "Many", "elementtree" : ["addProperty"] , "methodName" : "addValueQuantity, setSystem"} **/
						));
Deviceobj.addValueCode(HapiFHIRHelpers.createCodeableConcept(device.getDvcPrprtVlCdCcCdngCSstm() /** { "tree" :"Device.property.valueCode", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : ["addProperty"] , "methodName" : "addValueCode, addCoding, setSystem"} **/
						, device.getDvcPrprtVlCdCcCdngCVrsn() /** { "tree" :"Device.property.valueCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addProperty"] , "methodName" : "addValueCode, addCoding, setVersion"} **/
						, device.getDvcPrprtVlCdCcCdngCCde() /** { "tree" :"Device.property.valueCode", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : ["addProperty"] , "methodName" : "addValueCode, addCoding, setCode"} **/
						, device.getDvcPrprtVlCdCcCdngCDsplay() /** { "tree" :"Device.property.valueCode", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : ["addProperty"] , "methodName" : "addValueCode, addCoding, setDisplay"} **/
						, device.getDvcPrprtVlCdCcCdngCSrSlctd() /** { "tree" :"Device.property.valueCode", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : ["addProperty"] , "methodName" : "addValueCode, addCoding, setUserSelected"} **/
						, device.getDevicePropertyValueCodeCcText() /** { "tree" :"Device.property.valueCode", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : ["addProperty"] , "methodName" : "addValueCode, setText"} **/
						));
Deviceobj.setPatient(HapiFHIRHelpers.createReference(device.getDevicePntReference() /** { "tree" :"Device.patient", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setPatient"} **/
						));
Deviceobj.setOwner(HapiFHIRHelpers.createReference(device.getDeviceOwnerReference() /** { "tree" :"Device.owner", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setOwner"} **/
						));
Deviceobj.addContact(HapiFHIRHelpers.createContactPoint(device.getDeviceContactContactPointSystem() /** { "tree" :"Device.contact", "datatype" : "ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setSystem"} **/
						, device.getDeviceContactContactPointUse() /** { "tree" :"Device.contact", "datatype" : "ContactPoint, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setUse"} **/
						, device.getDvcCntctCntctPntPrdPrdStrt() /** { "tree" :"Device.contact", "datatype" : "ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setPeriod, setStart"} **/
						, device.getDvcCntctCntctPntPrdPrdNd() /** { "tree" :"Device.contact", "datatype" : "ContactPoint, Period, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setPeriod, setEnd"} **/
						, device.getDeviceContactContactPointRank() /** { "tree" :"Device.contact", "datatype" : "ContactPoint, positiveInt", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setRank"} **/
						, device.getDeviceContactContactPointValue() /** { "tree" :"Device.contact", "datatype" : "ContactPoint, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addContact, setValue"} **/
						));
Deviceobj.setLocation(HapiFHIRHelpers.createReference(device.getDeviceLocationReference() /** { "tree" :"Device.location", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setLocation"} **/
						));
Deviceobj.setUrl(HapiFHIRHelpers.createuri(device.getDeviceUrlUri() /** { "tree" :"Device.url", "datatype" : "uri", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setUrl"} **/
						));
Deviceobj.addNote(HapiFHIRHelpers.createAnnotation(device.getDeviceNoteAnnotationTime() /** { "tree" :"Device.note", "datatype" : "Annotation, dateTime", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setTime"} **/
						, device.getDeviceNoteAnnotationText() /** { "tree" :"Device.note", "datatype" : "Annotation, markdown", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setText"} **/
						, device.getDvcNtNnttnThrRfrnce() /** { "tree" :"Device.note", "datatype" : "Annotation, Reference", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorReference"} **/
						, device.getDvcNtNnttnThrStrng() /** { "tree" :"Device.note", "datatype" : "Annotation, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addNote, setAuthorString"} **/
						));
Deviceobj.addSafety(HapiFHIRHelpers.createCodeableConcept(device.getDeviceSafetyCcCodingCSystem() /** { "tree" :"Device.safety", "datatype" : "CodeableConcept, Coding, uri", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSafety, addCoding, setSystem"} **/
						, device.getDeviceSafetyCcCodingCVersion() /** { "tree" :"Device.safety", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSafety, addCoding, setVersion"} **/
						, device.getDeviceSafetyCcCodingCCode() /** { "tree" :"Device.safety", "datatype" : "CodeableConcept, Coding, code", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSafety, addCoding, setCode"} **/
						, device.getDeviceSafetyCcCodingCDisplay() /** { "tree" :"Device.safety", "datatype" : "CodeableConcept, Coding, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSafety, addCoding, setDisplay"} **/
						, device.getDvcSftCcCdngCSrSlctd() /** { "tree" :"Device.safety", "datatype" : "CodeableConcept, Coding, boolean", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSafety, addCoding, setUserSelected"} **/
						, device.getDeviceSafetyCcText() /** { "tree" :"Device.safety", "datatype" : "CodeableConcept, string", "cardinality" : "Many", "elementtree" : [] , "methodName" : "addSafety, setText"} **/
						));
Deviceobj.setParent(HapiFHIRHelpers.createReference(device.getDeviceParentReference() /** { "tree" :"Device.parent", "datatype" : "Reference", "cardinality" : "ZeroOne", "elementtree" : [] , "methodName" : "setParent"} **/
		));
	}
}
