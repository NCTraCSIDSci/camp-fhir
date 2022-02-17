package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Device;
public class DeviceConversion 
{
	public org.hl7.fhir.r4.model.Device Devices(Device d) throws ParseException
	{
		org.hl7.fhir.r4.model.Device device = new org.hl7.fhir.r4.model.Device();

		org.hl7.fhir.r4.model.ContactPoint deviceaddcontact = device.addContact();


		org.hl7.fhir.r4.model.Period deviceaddcontactsetperiod = new org.hl7.fhir.r4.model.Period();
		deviceaddcontact.setPeriod(deviceaddcontactsetperiod);

		/******************** Device_Contact_Period_End ********************************************************************************/
		if(d.getDeviceContactPeriodEnd() != null) {
			java.text.SimpleDateFormat DeviceContactPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DeviceContactPeriodEnddate = DeviceContactPeriodEndsdf.parse(d.getDeviceContactPeriodEnd());
			deviceaddcontactsetperiod.setEnd(DeviceContactPeriodEnddate);
		}
		/******************** Device_Contact_Period_Start ********************************************************************************/
		if(d.getDeviceContactPeriodStart() != null) {
			java.text.SimpleDateFormat DeviceContactPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DeviceContactPeriodStartdate = DeviceContactPeriodStartsdf.parse(d.getDeviceContactPeriodStart());
			deviceaddcontactsetperiod.setStart(DeviceContactPeriodStartdate);
		}
		/******************** Device_Contact_Rank ********************************************************************************/
		if(d.getDeviceContactRank() != null) {
			deviceaddcontact.setRank(Integer.parseInt(d.getDeviceContactRank()));
		}

		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory deviceaddcontactsetsystemEnumFactory = new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();

		/******************** Device_Contact_System_Code ********************************************************************************/
		if(d.getDeviceContactSystemCode() != null) {
			deviceaddcontact.setSystem(deviceaddcontactsetsystemEnumFactory.fromCode(d.getDeviceContactSystemCode()));

		}

		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory deviceaddcontactsetuseEnumFactory = new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();

		/******************** Device_Contact_Use_Code ********************************************************************************/
		if(d.getDeviceContactUseCode() != null) {
			deviceaddcontact.setUse(deviceaddcontactsetuseEnumFactory.fromCode(d.getDeviceContactUseCode()));

		}
		/******************** Device_Contact_Value ********************************************************************************/
		if(d.getDeviceContactValue() != null) {
			deviceaddcontact.setValue(d.getDeviceContactValue());
		}
		/******************** Device_Definition ********************************************************************************/
		if(d.getDeviceDefinition() != null) {
			org.hl7.fhir.r4.model.Reference DeviceDefinitionref = new org.hl7.fhir.r4.model.Reference();
			device.setDefinition(DeviceDefinitionref.setReference(d.getDeviceDefinition()));
		}

		org.hl7.fhir.r4.model.Device.DeviceDeviceNameComponent deviceadddevicename = device.addDeviceName();

		/******************** Device_DeviceName_Name ********************************************************************************/
		if(d.getDeviceDeviceNameName() != null) {
			deviceadddevicename.setName(d.getDeviceDeviceNameName());
		}

		org.hl7.fhir.r4.model.Device.DeviceNameTypeEnumFactory deviceadddevicenamesettypeEnumFactory = new org.hl7.fhir.r4.model.Device.DeviceNameTypeEnumFactory();

		/******************** Device_DeviceName_Type_Code ********************************************************************************/
		if(d.getDeviceDeviceNameTypeCode() != null) {
			deviceadddevicename.setType(deviceadddevicenamesettypeEnumFactory.fromCode(d.getDeviceDeviceNameTypeCode()));

		}
		/******************** Device_DistinctIdentifier ********************************************************************************/
		if(d.getDeviceDistinctIdentifier() != null) {
			device.setDistinctIdentifier(d.getDeviceDistinctIdentifier());
		}
		/******************** Device_ExpirationDate ********************************************************************************/
		if(d.getDeviceExpirationDate() != null) {
			java.text.SimpleDateFormat DeviceExpirationDatesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DeviceExpirationDatedate = DeviceExpirationDatesdf.parse(d.getDeviceExpirationDate());
			device.setExpirationDate(DeviceExpirationDatedate);
		}

		org.hl7.fhir.r4.model.Identifier deviceaddidentifier = device.addIdentifier();

		/******************** Device_Identifier_Assigner ********************************************************************************/
		if(d.getDeviceIdentifierAssigner() != null) {
			org.hl7.fhir.r4.model.Reference DeviceIdentifierAssignerref = new org.hl7.fhir.r4.model.Reference();
			deviceaddidentifier.setAssigner(DeviceIdentifierAssignerref.setReference(d.getDeviceIdentifierAssigner()));
		}

		org.hl7.fhir.r4.model.Period deviceaddidentifiersetperiod = new org.hl7.fhir.r4.model.Period();
		deviceaddidentifier.setPeriod(deviceaddidentifiersetperiod);

		/******************** Device_Identifier_Period_End ********************************************************************************/
		if(d.getDeviceIdentifierPeriodEnd() != null) {
			java.text.SimpleDateFormat DeviceIdentifierPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DeviceIdentifierPeriodEnddate = DeviceIdentifierPeriodEndsdf.parse(d.getDeviceIdentifierPeriodEnd());
			deviceaddidentifiersetperiod.setEnd(DeviceIdentifierPeriodEnddate);
		}
		/******************** Device_Identifier_Period_Start ********************************************************************************/
		if(d.getDeviceIdentifierPeriodStart() != null) {
			java.text.SimpleDateFormat DeviceIdentifierPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DeviceIdentifierPeriodStartdate = DeviceIdentifierPeriodStartsdf.parse(d.getDeviceIdentifierPeriodStart());
			deviceaddidentifiersetperiod.setStart(DeviceIdentifierPeriodStartdate);
		}
		/******************** Device_Identifier_System ********************************************************************************/
		if(d.getDeviceIdentifierSystem() != null) {
			deviceaddidentifier.setSystem(d.getDeviceIdentifierSystem());
		}

		org.hl7.fhir.r4.model.CodeableConcept deviceaddidentifiersettype = new org.hl7.fhir.r4.model.CodeableConcept();
		deviceaddidentifier.setType(deviceaddidentifiersettype);


		org.hl7.fhir.r4.model.Coding deviceaddidentifiersettypeaddcoding = deviceaddidentifiersettype.addCoding();

		/******************** Device_Identifier_Type_Coding_Code ********************************************************************************/
		if(d.getDeviceIdentifierTypeCodingCode() != null) {
			deviceaddidentifiersettypeaddcoding.setCode(d.getDeviceIdentifierTypeCodingCode());
		}
		/******************** Device_Identifier_Type_Coding_Display ********************************************************************************/
		if(d.getDeviceIdentifierTypeCodingDisplay() != null) {
			deviceaddidentifiersettypeaddcoding.setDisplay(d.getDeviceIdentifierTypeCodingDisplay());
		}
		/******************** Device_Identifier_Type_Coding_System ********************************************************************************/
		if(d.getDeviceIdentifierTypeCodingSystem() != null) {
			deviceaddidentifiersettypeaddcoding.setSystem(d.getDeviceIdentifierTypeCodingSystem());
		}
		/******************** Device_Identifier_Type_Coding_UserSelected ********************************************************************************/
		if(d.getDeviceIdentifierTypeCodingUserSelected() != null) {
			deviceaddidentifiersettypeaddcoding.setUserSelected(Boolean.parseBoolean(d.getDeviceIdentifierTypeCodingUserSelected()));
		}
		/******************** Device_Identifier_Type_Coding_Version ********************************************************************************/
		if(d.getDeviceIdentifierTypeCodingVersion() != null) {
			deviceaddidentifiersettypeaddcoding.setVersion(d.getDeviceIdentifierTypeCodingVersion());
		}
		/******************** Device_Identifier_Type_Text ********************************************************************************/
		if(d.getDeviceIdentifierTypeText() != null) {
			deviceaddidentifiersettype.setText(d.getDeviceIdentifierTypeText());
		}

		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory deviceaddidentifiersetuseEnumFactory = new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();

		/******************** Device_Identifier_Use_Code ********************************************************************************/
		if(d.getDeviceIdentifierUseCode() != null) {
			deviceaddidentifier.setUse(deviceaddidentifiersetuseEnumFactory.fromCode(d.getDeviceIdentifierUseCode()));

		}
		/******************** Device_Identifier_Value ********************************************************************************/
		if(d.getDeviceIdentifierValue() != null) {
			deviceaddidentifier.setValue(d.getDeviceIdentifierValue());
		}
		/******************** Device_Location ********************************************************************************/
		if(d.getDeviceLocation() != null) {
			org.hl7.fhir.r4.model.Reference DeviceLocationref = new org.hl7.fhir.r4.model.Reference();
			device.setLocation(DeviceLocationref.setReference(d.getDeviceLocation()));
		}
		/******************** Device_LotNumber ********************************************************************************/
		if(d.getDeviceLotNumber() != null) {
			device.setLotNumber(d.getDeviceLotNumber());
		}
		/******************** Device_ManufactureDate ********************************************************************************/
		if(d.getDeviceManufactureDate() != null) {
			java.text.SimpleDateFormat DeviceManufactureDatesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DeviceManufactureDatedate = DeviceManufactureDatesdf.parse(d.getDeviceManufactureDate());
			device.setManufactureDate(DeviceManufactureDatedate);
		}
		/******************** Device_Manufacturer ********************************************************************************/
		if(d.getDeviceManufacturer() != null) {
			device.setManufacturer(d.getDeviceManufacturer());
		}
		/******************** Device_ModelNumber ********************************************************************************/
		if(d.getDeviceModelNumber() != null) {
			device.setModelNumber(d.getDeviceModelNumber());
		}

		org.hl7.fhir.r4.model.Annotation deviceaddnote = device.addNote();

		/******************** Device_Note_Author ********************************************************************************/
		if(d.getDeviceNoteAuthor() != null) {
			deviceaddnote.setAuthor(new org.hl7.fhir.r4.model.StringType(d.getDeviceNoteAuthor()));
		}
		/******************** Device_Note_Text ********************************************************************************/
		if(d.getDeviceNoteText() != null) {
			deviceaddnote.setText(d.getDeviceNoteText());
		}
		/******************** Device_Note_Time ********************************************************************************/
		if(d.getDeviceNoteTime() != null) {
			java.text.SimpleDateFormat DeviceNoteTimesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DeviceNoteTimedate = DeviceNoteTimesdf.parse(d.getDeviceNoteTime());
			deviceaddnote.setTime(DeviceNoteTimedate);
		}
		/******************** Device_Owner ********************************************************************************/
		if(d.getDeviceOwner() != null) {
			org.hl7.fhir.r4.model.Reference DeviceOwnerref = new org.hl7.fhir.r4.model.Reference();
			device.setOwner(DeviceOwnerref.setReference(d.getDeviceOwner()));
		}
		/******************** Device_Parent ********************************************************************************/
		if(d.getDeviceParent() != null) {
			org.hl7.fhir.r4.model.Reference DeviceParentref = new org.hl7.fhir.r4.model.Reference();
			device.setParent(DeviceParentref.setReference(d.getDeviceParent()));
		}
		/******************** Device_PartNumber ********************************************************************************/
		if(d.getDevicePartNumber() != null) {
			device.setPartNumber(d.getDevicePartNumber());
		}
		/******************** Device_Patient ********************************************************************************/
		if(d.getDevicePatient() != null) {
			org.hl7.fhir.r4.model.Reference DevicePatientref = new org.hl7.fhir.r4.model.Reference();
			device.setPatient(DevicePatientref.setReference(d.getDevicePatient()));
		}

		org.hl7.fhir.r4.model.Device.DevicePropertyComponent deviceaddproperty = device.addProperty();


		org.hl7.fhir.r4.model.CodeableConcept deviceaddpropertysettype = new org.hl7.fhir.r4.model.CodeableConcept();
		deviceaddproperty.setType(deviceaddpropertysettype);


		org.hl7.fhir.r4.model.Coding deviceaddpropertysettypeaddcoding = deviceaddpropertysettype.addCoding();

		/******************** Device_Property_Type_Coding_Code ********************************************************************************/
		if(d.getDevicePropertyTypeCodingCode() != null) {
			deviceaddpropertysettypeaddcoding.setCode(d.getDevicePropertyTypeCodingCode());
		}
		/******************** Device_Property_Type_Coding_Display ********************************************************************************/
		if(d.getDevicePropertyTypeCodingDisplay() != null) {
			deviceaddpropertysettypeaddcoding.setDisplay(d.getDevicePropertyTypeCodingDisplay());
		}
		/******************** Device_Property_Type_Coding_System ********************************************************************************/
		if(d.getDevicePropertyTypeCodingSystem() != null) {
			deviceaddpropertysettypeaddcoding.setSystem(d.getDevicePropertyTypeCodingSystem());
		}
		/******************** Device_Property_Type_Coding_UserSelected ********************************************************************************/
		if(d.getDevicePropertyTypeCodingUserSelected() != null) {
			deviceaddpropertysettypeaddcoding.setUserSelected(Boolean.parseBoolean(d.getDevicePropertyTypeCodingUserSelected()));
		}
		/******************** Device_Property_Type_Coding_Version ********************************************************************************/
		if(d.getDevicePropertyTypeCodingVersion() != null) {
			deviceaddpropertysettypeaddcoding.setVersion(d.getDevicePropertyTypeCodingVersion());
		}
		/******************** Device_Property_Type_Text ********************************************************************************/
		if(d.getDevicePropertyTypeText() != null) {
			deviceaddpropertysettype.setText(d.getDevicePropertyTypeText());
		}

		org.hl7.fhir.r4.model.CodeableConcept deviceaddpropertyaddvaluecode = deviceaddproperty.addValueCode();


		org.hl7.fhir.r4.model.Coding deviceaddpropertyaddvaluecodeaddcoding = deviceaddpropertyaddvaluecode.addCoding();

		/******************** Device_Property_ValueCode_Coding_Code ********************************************************************************/
		if(d.getDevicePropertyValueCodeCodingCode() != null) {
			deviceaddpropertyaddvaluecodeaddcoding.setCode(d.getDevicePropertyValueCodeCodingCode());
		}
		/******************** Device_Property_ValueCode_Coding_Display ********************************************************************************/
		if(d.getDevicePropertyValueCodeCodingDisplay() != null) {
			deviceaddpropertyaddvaluecodeaddcoding.setDisplay(d.getDevicePropertyValueCodeCodingDisplay());
		}
		/******************** Device_Property_ValueCode_Coding_System ********************************************************************************/
		if(d.getDevicePropertyValueCodeCodingSystem() != null) {
			deviceaddpropertyaddvaluecodeaddcoding.setSystem(d.getDevicePropertyValueCodeCodingSystem());
		}
		/******************** Device_Property_ValueCode_Coding_UserSelected ********************************************************************************/
		if(d.getDevicePropertyValueCodeCodingUserSelected() != null) {
			deviceaddpropertyaddvaluecodeaddcoding.setUserSelected(Boolean.parseBoolean(d.getDevicePropertyValueCodeCodingUserSelected()));
		}
		/******************** Device_Property_ValueCode_Coding_Version ********************************************************************************/
		if(d.getDevicePropertyValueCodeCodingVersion() != null) {
			deviceaddpropertyaddvaluecodeaddcoding.setVersion(d.getDevicePropertyValueCodeCodingVersion());
		}
		/******************** Device_Property_ValueCode_Text ********************************************************************************/
		if(d.getDevicePropertyValueCodeText() != null) {
			deviceaddpropertyaddvaluecode.setText(d.getDevicePropertyValueCodeText());
		}

		org.hl7.fhir.r4.model.Quantity deviceaddpropertyaddvaluequantity = deviceaddproperty.addValueQuantity();

		/******************** Device_Property_ValueQuantity_Code ********************************************************************************/
		if(d.getDevicePropertyValueQuantityCode() != null) {
			deviceaddpropertyaddvaluequantity.setCode(d.getDevicePropertyValueQuantityCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory deviceaddpropertyaddvaluequantitysetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Device_Property_ValueQuantity_Comparator_Code ********************************************************************************/
		if(d.getDevicePropertyValueQuantityComparatorCode() != null) {
			deviceaddpropertyaddvaluequantity.setComparator(deviceaddpropertyaddvaluequantitysetcomparatorEnumFactory.fromCode(d.getDevicePropertyValueQuantityComparatorCode()));

		}
		/******************** Device_Property_ValueQuantity_System ********************************************************************************/
		if(d.getDevicePropertyValueQuantitySystem() != null) {
			deviceaddpropertyaddvaluequantity.setSystem(d.getDevicePropertyValueQuantitySystem());
		}
		/******************** Device_Property_ValueQuantity_Unit ********************************************************************************/
		if(d.getDevicePropertyValueQuantityUnit() != null) {
			deviceaddpropertyaddvaluequantity.setUnit(d.getDevicePropertyValueQuantityUnit());
		}
		/******************** Device_Property_ValueQuantity_Value ********************************************************************************/
		if(d.getDevicePropertyValueQuantityValue() != null) {
			deviceaddpropertyaddvaluequantity.setValue(Double.parseDouble((d.getDevicePropertyValueQuantityValue())));
		}

		org.hl7.fhir.r4.model.CodeableConcept deviceaddsafety = device.addSafety();


		org.hl7.fhir.r4.model.Coding deviceaddsafetyaddcoding = deviceaddsafety.addCoding();

		/******************** Device_Safety_Coding_Code ********************************************************************************/
		if(d.getDeviceSafetyCodingCode() != null) {
			deviceaddsafetyaddcoding.setCode(d.getDeviceSafetyCodingCode());
		}
		/******************** Device_Safety_Coding_Display ********************************************************************************/
		if(d.getDeviceSafetyCodingDisplay() != null) {
			deviceaddsafetyaddcoding.setDisplay(d.getDeviceSafetyCodingDisplay());
		}
		/******************** Device_Safety_Coding_System ********************************************************************************/
		if(d.getDeviceSafetyCodingSystem() != null) {
			deviceaddsafetyaddcoding.setSystem(d.getDeviceSafetyCodingSystem());
		}
		/******************** Device_Safety_Coding_UserSelected ********************************************************************************/
		if(d.getDeviceSafetyCodingUserSelected() != null) {
			deviceaddsafetyaddcoding.setUserSelected(Boolean.parseBoolean(d.getDeviceSafetyCodingUserSelected()));
		}
		/******************** Device_Safety_Coding_Version ********************************************************************************/
		if(d.getDeviceSafetyCodingVersion() != null) {
			deviceaddsafetyaddcoding.setVersion(d.getDeviceSafetyCodingVersion());
		}
		/******************** Device_Safety_Text ********************************************************************************/
		if(d.getDeviceSafetyText() != null) {
			deviceaddsafety.setText(d.getDeviceSafetyText());
		}
		/******************** Device_SerialNumber ********************************************************************************/
		if(d.getDeviceSerialNumber() != null) {
			device.setSerialNumber(d.getDeviceSerialNumber());
		}

		org.hl7.fhir.r4.model.Device.DeviceSpecializationComponent deviceaddspecialization = device.addSpecialization();


		org.hl7.fhir.r4.model.CodeableConcept deviceaddspecializationsetsystemtype = new org.hl7.fhir.r4.model.CodeableConcept();
		deviceaddspecialization.setSystemType(deviceaddspecializationsetsystemtype);


		org.hl7.fhir.r4.model.Coding deviceaddspecializationsetsystemtypeaddcoding = deviceaddspecializationsetsystemtype.addCoding();

		/******************** Device_Specialization_SystemType_Coding_Code ********************************************************************************/
		if(d.getDeviceSpecializationSystemTypeCodingCode() != null) {
			deviceaddspecializationsetsystemtypeaddcoding.setCode(d.getDeviceSpecializationSystemTypeCodingCode());
		}
		/******************** Device_Specialization_SystemType_Coding_Display ********************************************************************************/
		if(d.getDeviceSpecializationSystemTypeCodingDisplay() != null) {
			deviceaddspecializationsetsystemtypeaddcoding.setDisplay(d.getDeviceSpecializationSystemTypeCodingDisplay());
		}
		/******************** Device_Specialization_SystemType_Coding_System ********************************************************************************/
		if(d.getDeviceSpecializationSystemTypeCodingSystem() != null) {
			deviceaddspecializationsetsystemtypeaddcoding.setSystem(d.getDeviceSpecializationSystemTypeCodingSystem());
		}
		/******************** Device_Specialization_SystemType_Coding_UserSelected ********************************************************************************/
		if(d.getDeviceSpecializationSystemTypeCodingUserSelected() != null) {
			deviceaddspecializationsetsystemtypeaddcoding.setUserSelected(Boolean.parseBoolean(d.getDeviceSpecializationSystemTypeCodingUserSelected()));
		}
		/******************** Device_Specialization_SystemType_Coding_Version ********************************************************************************/
		if(d.getDeviceSpecializationSystemTypeCodingVersion() != null) {
			deviceaddspecializationsetsystemtypeaddcoding.setVersion(d.getDeviceSpecializationSystemTypeCodingVersion());
		}
		/******************** Device_Specialization_SystemType_Text ********************************************************************************/
		if(d.getDeviceSpecializationSystemTypeText() != null) {
			deviceaddspecializationsetsystemtype.setText(d.getDeviceSpecializationSystemTypeText());
		}
		/******************** Device_Specialization_Version ********************************************************************************/
		if(d.getDeviceSpecializationVersion() != null) {
			deviceaddspecialization.setVersion(d.getDeviceSpecializationVersion());
		}

		org.hl7.fhir.r4.model.Device.FHIRDeviceStatusEnumFactory devicesetstatusEnumFactory = new org.hl7.fhir.r4.model.Device.FHIRDeviceStatusEnumFactory();

		/******************** Device_Status_Code ********************************************************************************/
		if(d.getDeviceStatusCode() != null) {
			device.setStatus(devicesetstatusEnumFactory.fromCode(d.getDeviceStatusCode()));

		}

		org.hl7.fhir.r4.model.CodeableConcept deviceaddstatusreason = device.addStatusReason();


		org.hl7.fhir.r4.model.Coding deviceaddstatusreasonaddcoding = deviceaddstatusreason.addCoding();

		/******************** Device_StatusReason_Coding_Code ********************************************************************************/
		if(d.getDeviceStatusReasonCodingCode() != null) {
			deviceaddstatusreasonaddcoding.setCode(d.getDeviceStatusReasonCodingCode());
		}
		/******************** Device_StatusReason_Coding_Display ********************************************************************************/
		if(d.getDeviceStatusReasonCodingDisplay() != null) {
			deviceaddstatusreasonaddcoding.setDisplay(d.getDeviceStatusReasonCodingDisplay());
		}
		/******************** Device_StatusReason_Coding_System ********************************************************************************/
		if(d.getDeviceStatusReasonCodingSystem() != null) {
			deviceaddstatusreasonaddcoding.setSystem(d.getDeviceStatusReasonCodingSystem());
		}
		/******************** Device_StatusReason_Coding_UserSelected ********************************************************************************/
		if(d.getDeviceStatusReasonCodingUserSelected() != null) {
			deviceaddstatusreasonaddcoding.setUserSelected(Boolean.parseBoolean(d.getDeviceStatusReasonCodingUserSelected()));
		}
		/******************** Device_StatusReason_Coding_Version ********************************************************************************/
		if(d.getDeviceStatusReasonCodingVersion() != null) {
			deviceaddstatusreasonaddcoding.setVersion(d.getDeviceStatusReasonCodingVersion());
		}
		/******************** Device_StatusReason_Text ********************************************************************************/
		if(d.getDeviceStatusReasonText() != null) {
			deviceaddstatusreason.setText(d.getDeviceStatusReasonText());
		}

		org.hl7.fhir.r4.model.CodeableConcept devicesettype = new org.hl7.fhir.r4.model.CodeableConcept();
		device.setType(devicesettype);


		org.hl7.fhir.r4.model.Coding devicesettypeaddcoding = devicesettype.addCoding();

		/******************** Device_Type_Coding_Code ********************************************************************************/
		if(d.getDeviceTypeCodingCode() != null) {
			devicesettypeaddcoding.setCode(d.getDeviceTypeCodingCode());
		}
		/******************** Device_Type_Coding_Display ********************************************************************************/
		if(d.getDeviceTypeCodingDisplay() != null) {
			devicesettypeaddcoding.setDisplay(d.getDeviceTypeCodingDisplay());
		}
		/******************** Device_Type_Coding_System ********************************************************************************/
		if(d.getDeviceTypeCodingSystem() != null) {
			devicesettypeaddcoding.setSystem(d.getDeviceTypeCodingSystem());
		}
		/******************** Device_Type_Coding_UserSelected ********************************************************************************/
		if(d.getDeviceTypeCodingUserSelected() != null) {
			devicesettypeaddcoding.setUserSelected(Boolean.parseBoolean(d.getDeviceTypeCodingUserSelected()));
		}
		/******************** Device_Type_Coding_Version ********************************************************************************/
		if(d.getDeviceTypeCodingVersion() != null) {
			devicesettypeaddcoding.setVersion(d.getDeviceTypeCodingVersion());
		}
		/******************** Device_Type_Text ********************************************************************************/
		if(d.getDeviceTypeText() != null) {
			devicesettype.setText(d.getDeviceTypeText());
		}

		org.hl7.fhir.r4.model.Device.DeviceUdiCarrierComponent deviceaddudicarrier = device.addUdiCarrier();

		/******************** Device_UdiCarrier_CarrierAIDC ********************************************************************************/
		if(d.getDeviceUdiCarrierCarrierAidc() != null) {
			deviceaddudicarrier.setCarrierAIDCElement(new org.hl7.fhir.r4.model.Base64BinaryType(d.getDeviceUdiCarrierCarrierAidc()));
		}
		/******************** Device_UdiCarrier_CarrierHRF ********************************************************************************/
		if(d.getDeviceUdiCarrierCarrierHrf() != null) {
			deviceaddudicarrier.setCarrierHRF(d.getDeviceUdiCarrierCarrierHrf());
		}
		/******************** Device_UdiCarrier_DeviceIdentifier ********************************************************************************/
		if(d.getDeviceUdiCarrierDeviceIdentifier() != null) {
			deviceaddudicarrier.setDeviceIdentifier(d.getDeviceUdiCarrierDeviceIdentifier());
		}

		org.hl7.fhir.r4.model.Device.UDIEntryTypeEnumFactory deviceaddudicarriersetentrytypeEnumFactory = new org.hl7.fhir.r4.model.Device.UDIEntryTypeEnumFactory();

		/******************** Device_UdiCarrier_EntryType_Code ********************************************************************************/
		if(d.getDeviceUdiCarrierEntryTypeCode() != null) {
			deviceaddudicarrier.setEntryType(deviceaddudicarriersetentrytypeEnumFactory.fromCode(d.getDeviceUdiCarrierEntryTypeCode()));

		}
		/******************** Device_UdiCarrier_Issuer ********************************************************************************/
		if(d.getDeviceUdiCarrierIssuer() != null) {
			deviceaddudicarrier.setIssuer(d.getDeviceUdiCarrierIssuer());
		}
		/******************** Device_UdiCarrier_Jurisdiction ********************************************************************************/
		if(d.getDeviceUdiCarrierJurisdiction() != null) {
			deviceaddudicarrier.setJurisdiction(d.getDeviceUdiCarrierJurisdiction());
		}
		/******************** Device_Url ********************************************************************************/
		if(d.getDeviceUrl() != null) {
			device.setUrl(d.getDeviceUrl());
		}

		org.hl7.fhir.r4.model.Device.DeviceVersionComponent deviceaddversion = device.addVersion();


		org.hl7.fhir.r4.model.Identifier deviceaddversionsetcomponent = new org.hl7.fhir.r4.model.Identifier();
		deviceaddversion.setComponent(deviceaddversionsetcomponent);

		/******************** Device_Version_Component_Assigner ********************************************************************************/
		if(d.getDeviceVersionComponentAssigner() != null) {
			org.hl7.fhir.r4.model.Reference DeviceVersionComponentAssignerref = new org.hl7.fhir.r4.model.Reference();
			deviceaddversionsetcomponent.setAssigner(DeviceVersionComponentAssignerref.setReference(d.getDeviceVersionComponentAssigner()));
		}

		org.hl7.fhir.r4.model.Period deviceaddversionsetcomponentsetperiod = new org.hl7.fhir.r4.model.Period();
		deviceaddversionsetcomponent.setPeriod(deviceaddversionsetcomponentsetperiod);

		/******************** Device_Version_Component_Period_End ********************************************************************************/
		if(d.getDeviceVersionComponentPeriodEnd() != null) {
			java.text.SimpleDateFormat DeviceVersionComponentPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DeviceVersionComponentPeriodEnddate = DeviceVersionComponentPeriodEndsdf.parse(d.getDeviceVersionComponentPeriodEnd());
			deviceaddversionsetcomponentsetperiod.setEnd(DeviceVersionComponentPeriodEnddate);
		}
		/******************** Device_Version_Component_Period_Start ********************************************************************************/
		if(d.getDeviceVersionComponentPeriodStart() != null) {
			java.text.SimpleDateFormat DeviceVersionComponentPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DeviceVersionComponentPeriodStartdate = DeviceVersionComponentPeriodStartsdf.parse(d.getDeviceVersionComponentPeriodStart());
			deviceaddversionsetcomponentsetperiod.setStart(DeviceVersionComponentPeriodStartdate);
		}
		/******************** Device_Version_Component_System ********************************************************************************/
		if(d.getDeviceVersionComponentSystem() != null) {
			deviceaddversionsetcomponent.setSystem(d.getDeviceVersionComponentSystem());
		}

		org.hl7.fhir.r4.model.CodeableConcept deviceaddversionsetcomponentsettype = new org.hl7.fhir.r4.model.CodeableConcept();
		deviceaddversionsetcomponent.setType(deviceaddversionsetcomponentsettype);


		org.hl7.fhir.r4.model.Coding deviceaddversionsetcomponentsettypeaddcoding = deviceaddversionsetcomponentsettype.addCoding();

		/******************** Device_Version_Component_Type_Coding_Code ********************************************************************************/
		if(d.getDeviceVersionComponentTypeCodingCode() != null) {
			deviceaddversionsetcomponentsettypeaddcoding.setCode(d.getDeviceVersionComponentTypeCodingCode());
		}
		/******************** Device_Version_Component_Type_Coding_Display ********************************************************************************/
		if(d.getDeviceVersionComponentTypeCodingDisplay() != null) {
			deviceaddversionsetcomponentsettypeaddcoding.setDisplay(d.getDeviceVersionComponentTypeCodingDisplay());
		}
		/******************** Device_Version_Component_Type_Coding_System ********************************************************************************/
		if(d.getDeviceVersionComponentTypeCodingSystem() != null) {
			deviceaddversionsetcomponentsettypeaddcoding.setSystem(d.getDeviceVersionComponentTypeCodingSystem());
		}
		/******************** Device_Version_Component_Type_Coding_UserSelected ********************************************************************************/
		if(d.getDeviceVersionComponentTypeCodingUserSelected() != null) {
			deviceaddversionsetcomponentsettypeaddcoding.setUserSelected(Boolean.parseBoolean(d.getDeviceVersionComponentTypeCodingUserSelected()));
		}
		/******************** Device_Version_Component_Type_Coding_Version ********************************************************************************/
		if(d.getDeviceVersionComponentTypeCodingVersion() != null) {
			deviceaddversionsetcomponentsettypeaddcoding.setVersion(d.getDeviceVersionComponentTypeCodingVersion());
		}
		/******************** Device_Version_Component_Type_Text ********************************************************************************/
		if(d.getDeviceVersionComponentTypeText() != null) {
			deviceaddversionsetcomponentsettype.setText(d.getDeviceVersionComponentTypeText());
		}

		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory deviceaddversionsetcomponentsetuseEnumFactory = new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();

		/******************** Device_Version_Component_Use_Code ********************************************************************************/
		if(d.getDeviceVersionComponentUseCode() != null) {
			deviceaddversionsetcomponent.setUse(deviceaddversionsetcomponentsetuseEnumFactory.fromCode(d.getDeviceVersionComponentUseCode()));

		}
		/******************** Device_Version_Component_Value ********************************************************************************/
		if(d.getDeviceVersionComponentValue() != null) {
			deviceaddversionsetcomponent.setValue(d.getDeviceVersionComponentValue());
		}

		org.hl7.fhir.r4.model.CodeableConcept deviceaddversionsettype = new org.hl7.fhir.r4.model.CodeableConcept();
		deviceaddversion.setType(deviceaddversionsettype);


		org.hl7.fhir.r4.model.Coding deviceaddversionsettypeaddcoding = deviceaddversionsettype.addCoding();

		/******************** Device_Version_Type_Coding_Code ********************************************************************************/
		if(d.getDeviceVersionTypeCodingCode() != null) {
			deviceaddversionsettypeaddcoding.setCode(d.getDeviceVersionTypeCodingCode());
		}
		/******************** Device_Version_Type_Coding_Display ********************************************************************************/
		if(d.getDeviceVersionTypeCodingDisplay() != null) {
			deviceaddversionsettypeaddcoding.setDisplay(d.getDeviceVersionTypeCodingDisplay());
		}
		/******************** Device_Version_Type_Coding_System ********************************************************************************/
		if(d.getDeviceVersionTypeCodingSystem() != null) {
			deviceaddversionsettypeaddcoding.setSystem(d.getDeviceVersionTypeCodingSystem());
		}
		/******************** Device_Version_Type_Coding_UserSelected ********************************************************************************/
		if(d.getDeviceVersionTypeCodingUserSelected() != null) {
			deviceaddversionsettypeaddcoding.setUserSelected(Boolean.parseBoolean(d.getDeviceVersionTypeCodingUserSelected()));
		}
		/******************** Device_Version_Type_Coding_Version ********************************************************************************/
		if(d.getDeviceVersionTypeCodingVersion() != null) {
			deviceaddversionsettypeaddcoding.setVersion(d.getDeviceVersionTypeCodingVersion());
		}
		/******************** Device_Version_Type_Text ********************************************************************************/
		if(d.getDeviceVersionTypeText() != null) {
			deviceaddversionsettype.setText(d.getDeviceVersionTypeText());
		}
		return device;
	}
}
