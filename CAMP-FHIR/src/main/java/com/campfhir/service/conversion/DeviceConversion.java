package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Device;
public class DeviceConversion 
{
	public org.hl7.fhir.r4.model.Device Devices(Device d) throws ParseException
	{
		org.hl7.fhir.r4.model.Device device = new org.hl7.fhir.r4.model.Device();

		/******************** id ********************************************************************************/
		device.setId(d.getId());

		/******************** devicecontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint devicecontact =  new org.hl7.fhir.r4.model.ContactPoint();
		device.addContact(devicecontact);

		/******************** devicecontactperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period devicecontactperiod =  new org.hl7.fhir.r4.model.Period();
		devicecontact.setPeriod(devicecontactperiod);

		/******************** Dvc_Cntct_Prd_End ********************************************************************************/
		if(d.getDvcCntctPrdEnd() != null) {
			java.text.SimpleDateFormat Dvc_Cntct_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Dvc_Cntct_Prd_Enddate = Dvc_Cntct_Prd_Endsdf.parse(d.getDvcCntctPrdEnd());
			devicecontactperiod.setEnd(Dvc_Cntct_Prd_Enddate);
		}
		/******************** Dvc_Cntct_Prd_Strt ********************************************************************************/
		if(d.getDvcCntctPrdStrt() != null) {
			java.text.SimpleDateFormat Dvc_Cntct_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Dvc_Cntct_Prd_Strtdate = Dvc_Cntct_Prd_Strtsdf.parse(d.getDvcCntctPrdStrt());
			devicecontactperiod.setStart(Dvc_Cntct_Prd_Strtdate);
		}
		/******************** Dvc_Cntct_Rnk ********************************************************************************/
		if(d.getDvcCntctRnk() != null) {
			devicecontact.setRank(Integer.parseInt(d.getDvcCntctRnk()));
		}
		/******************** devicecontactsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory devicecontactsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		devicecontact.setSystem(devicecontactsystem.fromCode(d.getDvcCntctSys()));

		/******************** devicecontactuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory devicecontactuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		devicecontact.setUse(devicecontactuse.fromCode(d.getDvcCntctUse()));

		/******************** Dvc_Cntct_Vl ********************************************************************************/
		if(d.getDvcCntctVl() != null) {
			devicecontact.setValue(d.getDvcCntctVl());
		}
		/******************** Dvc_Dfn ********************************************************************************/
		if(d.getDvcDfn() != null) {
			device.setDefinition( new org.hl7.fhir.r4.model.Reference(d.getDvcDfn()));
		}
		/******************** devicedevicename ********************************************************************************/
		org.hl7.fhir.r4.model.Device.DeviceDeviceNameComponent devicedevicename =  new org.hl7.fhir.r4.model.Device.DeviceDeviceNameComponent();
		device.addDeviceName(devicedevicename);

		/******************** Dvc_DvcNm_Nm ********************************************************************************/
		if(d.getDvcDvcNmNm() != null) {
			devicedevicename.setName(d.getDvcDvcNmNm());
		}
		/******************** devicedevicenametype ********************************************************************************/
		org.hl7.fhir.r4.model.Device.DeviceNameTypeEnumFactory devicedevicenametype =  new org.hl7.fhir.r4.model.Device.DeviceNameTypeEnumFactory();
		devicedevicename.setType(devicedevicenametype.fromCode(d.getDvcDvcNmTyp()));

		/******************** Dvc_DistinctId ********************************************************************************/
		if(d.getDvcDistinctId() != null) {
			device.setDistinctIdentifier(d.getDvcDistinctId());
		}
		/******************** Dvc_ExpirationDt ********************************************************************************/
		if(d.getDvcExpirationDt() != null) {
			java.text.SimpleDateFormat Dvc_ExpirationDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Dvc_ExpirationDtdate = Dvc_ExpirationDtsdf.parse(d.getDvcExpirationDt());
			device.setExpirationDate(Dvc_ExpirationDtdate);
		}
		/******************** deviceidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier deviceidentifier =  new org.hl7.fhir.r4.model.Identifier();
		device.addIdentifier(deviceidentifier);

		/******************** Dvc_Id_Assigner ********************************************************************************/
		if(d.getDvcIdAssigner() != null) {
			deviceidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(d.getDvcIdAssigner()));
		}
		/******************** deviceidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period deviceidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		deviceidentifier.setPeriod(deviceidentifierperiod);

		/******************** Dvc_Id_Prd_End ********************************************************************************/
		if(d.getDvcIdPrdEnd() != null) {
			java.text.SimpleDateFormat Dvc_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Dvc_Id_Prd_Enddate = Dvc_Id_Prd_Endsdf.parse(d.getDvcIdPrdEnd());
			deviceidentifierperiod.setEnd(Dvc_Id_Prd_Enddate);
		}
		/******************** Dvc_Id_Prd_Strt ********************************************************************************/
		if(d.getDvcIdPrdStrt() != null) {
			java.text.SimpleDateFormat Dvc_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Dvc_Id_Prd_Strtdate = Dvc_Id_Prd_Strtsdf.parse(d.getDvcIdPrdStrt());
			deviceidentifierperiod.setStart(Dvc_Id_Prd_Strtdate);
		}
		/******************** Dvc_Id_Sys ********************************************************************************/
		if(d.getDvcIdSys() != null) {
			deviceidentifier.setSystem(d.getDvcIdSys());
		}
		/******************** deviceidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept deviceidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		deviceidentifier.setType(deviceidentifiertype);

		/******************** deviceidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding deviceidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		deviceidentifiertype.addCoding(deviceidentifiertypecoding);

		/******************** Dvc_Id_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDvcIdTypCdgCd() != null) {
			deviceidentifiertypecoding.setCode(d.getDvcIdTypCdgCd());
		}
		/******************** Dvc_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDvcIdTypCdgDsply() != null) {
			deviceidentifiertypecoding.setDisplay(d.getDvcIdTypCdgDsply());
		}
		/******************** Dvc_Id_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDvcIdTypCdgSys() != null) {
			deviceidentifiertypecoding.setSystem(d.getDvcIdTypCdgSys());
		}
		/******************** Dvc_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcIdTypCdgUsrSltd() != null) {
			deviceidentifiertypecoding.setUserSelected(Boolean.parseBoolean(d.getDvcIdTypCdgUsrSltd()));
		}
		/******************** Dvc_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcIdTypCdgVrsn() != null) {
			deviceidentifiertypecoding.setVersion(d.getDvcIdTypCdgVrsn());
		}
		/******************** Dvc_Id_Typ_Txt ********************************************************************************/
		if(d.getDvcIdTypTxt() != null) {
			deviceidentifiertype.setText(d.getDvcIdTypTxt());
		}
		/******************** deviceidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory deviceidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		deviceidentifier.setUse(deviceidentifieruse.fromCode(d.getDvcIdUse()));

		/******************** Dvc_Id_Vl ********************************************************************************/
		if(d.getDvcIdVl() != null) {
			deviceidentifier.setValue(d.getDvcIdVl());
		}
		/******************** Dvc_Lctn ********************************************************************************/
		if(d.getDvcLctn() != null) {
			device.setLocation( new org.hl7.fhir.r4.model.Reference(d.getDvcLctn()));
		}
		/******************** Dvc_LotNmbr ********************************************************************************/
		if(d.getDvcLotNmbr() != null) {
			device.setLotNumber(d.getDvcLotNmbr());
		}
		/******************** Dvc_ManufactureDt ********************************************************************************/
		if(d.getDvcManufactureDt() != null) {
			java.text.SimpleDateFormat Dvc_ManufactureDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Dvc_ManufactureDtdate = Dvc_ManufactureDtsdf.parse(d.getDvcManufactureDt());
			device.setManufactureDate(Dvc_ManufactureDtdate);
		}
		/******************** Dvc_Manufacturer ********************************************************************************/
		if(d.getDvcManufacturer() != null) {
			device.setManufacturer(d.getDvcManufacturer());
		}
		/******************** Dvc_ModelNmbr ********************************************************************************/
		if(d.getDvcModelNmbr() != null) {
			device.setModelNumber(d.getDvcModelNmbr());
		}
		/******************** devicenote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation devicenote =  new org.hl7.fhir.r4.model.Annotation();
		device.addNote(devicenote);

		/******************** Dvc_Nt_AthrRfrnc ********************************************************************************/
		if(d.getDvcNtAthrRfrnc() != null) {
			devicenote.setAuthor( new org.hl7.fhir.r4.model.Reference(d.getDvcNtAthrRfrnc()));
		}
		/******************** Dvc_Nt_AthrStrgTyp ********************************************************************************/
		if(d.getDvcNtAthrStrgTyp() != null) {
			devicenote.setAuthor( new org.hl7.fhir.r4.model.StringType(d.getDvcNtAthrStrgTyp()));
		}
		/******************** Dvc_Nt_Txt ********************************************************************************/
		if(d.getDvcNtTxt() != null) {
			devicenote.setText(d.getDvcNtTxt());
		}
		/******************** Dvc_Nt_Time ********************************************************************************/
		if(d.getDvcNtTime() != null) {
			java.text.SimpleDateFormat Dvc_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Dvc_Nt_Timedate = Dvc_Nt_Timesdf.parse(d.getDvcNtTime());
			devicenote.setTime(Dvc_Nt_Timedate);
		}
		/******************** Dvc_Owner ********************************************************************************/
		if(d.getDvcOwner() != null) {
			device.setOwner( new org.hl7.fhir.r4.model.Reference(d.getDvcOwner()));
		}
		/******************** Dvc_Parent ********************************************************************************/
		if(d.getDvcParent() != null) {
			device.setParent( new org.hl7.fhir.r4.model.Reference(d.getDvcParent()));
		}
		/******************** Dvc_PartNmbr ********************************************************************************/
		if(d.getDvcPartNmbr() != null) {
			device.setPartNumber(d.getDvcPartNmbr());
		}
		/******************** Dvc_Pnt ********************************************************************************/
		if(d.getDvcPnt() != null) {
			device.setPatient( new org.hl7.fhir.r4.model.Reference(d.getDvcPnt()));
		}
		/******************** deviceproperty ********************************************************************************/
		org.hl7.fhir.r4.model.Device.DevicePropertyComponent deviceproperty =  new org.hl7.fhir.r4.model.Device.DevicePropertyComponent();
		device.addProperty(deviceproperty);

		/******************** devicepropertytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicepropertytype =  new org.hl7.fhir.r4.model.CodeableConcept();
		deviceproperty.setType(devicepropertytype);

		/******************** devicepropertytypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicepropertytypecoding =  new org.hl7.fhir.r4.model.Coding();
		devicepropertytype.addCoding(devicepropertytypecoding);

		/******************** Dvc_Prpty_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDvcPrptyTypCdgCd() != null) {
			devicepropertytypecoding.setCode(d.getDvcPrptyTypCdgCd());
		}
		/******************** Dvc_Prpty_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDvcPrptyTypCdgDsply() != null) {
			devicepropertytypecoding.setDisplay(d.getDvcPrptyTypCdgDsply());
		}
		/******************** Dvc_Prpty_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDvcPrptyTypCdgSys() != null) {
			devicepropertytypecoding.setSystem(d.getDvcPrptyTypCdgSys());
		}
		/******************** Dvc_Prpty_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcPrptyTypCdgUsrSltd() != null) {
			devicepropertytypecoding.setUserSelected(Boolean.parseBoolean(d.getDvcPrptyTypCdgUsrSltd()));
		}
		/******************** Dvc_Prpty_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcPrptyTypCdgVrsn() != null) {
			devicepropertytypecoding.setVersion(d.getDvcPrptyTypCdgVrsn());
		}
		/******************** Dvc_Prpty_Typ_Txt ********************************************************************************/
		if(d.getDvcPrptyTypTxt() != null) {
			devicepropertytype.setText(d.getDvcPrptyTypTxt());
		}
		/******************** devicepropertyvaluecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicepropertyvaluecode =  new org.hl7.fhir.r4.model.CodeableConcept();
		deviceproperty.addValueCode(devicepropertyvaluecode);

		/******************** devicepropertyvaluecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicepropertyvaluecodecoding =  new org.hl7.fhir.r4.model.Coding();
		devicepropertyvaluecode.addCoding(devicepropertyvaluecodecoding);

		/******************** Dvc_Prpty_VlCd_Cdg_Cd ********************************************************************************/
		if(d.getDvcPrptyVlCdCdgCd() != null) {
			devicepropertyvaluecodecoding.setCode(d.getDvcPrptyVlCdCdgCd());
		}
		/******************** Dvc_Prpty_VlCd_Cdg_Dsply ********************************************************************************/
		if(d.getDvcPrptyVlCdCdgDsply() != null) {
			devicepropertyvaluecodecoding.setDisplay(d.getDvcPrptyVlCdCdgDsply());
		}
		/******************** Dvc_Prpty_VlCd_Cdg_Sys ********************************************************************************/
		if(d.getDvcPrptyVlCdCdgSys() != null) {
			devicepropertyvaluecodecoding.setSystem(d.getDvcPrptyVlCdCdgSys());
		}
		/******************** Dvc_Prpty_VlCd_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcPrptyVlCdCdgUsrSltd() != null) {
			devicepropertyvaluecodecoding.setUserSelected(Boolean.parseBoolean(d.getDvcPrptyVlCdCdgUsrSltd()));
		}
		/******************** Dvc_Prpty_VlCd_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcPrptyVlCdCdgVrsn() != null) {
			devicepropertyvaluecodecoding.setVersion(d.getDvcPrptyVlCdCdgVrsn());
		}
		/******************** Dvc_Prpty_VlCd_Txt ********************************************************************************/
		if(d.getDvcPrptyVlCdTxt() != null) {
			devicepropertyvaluecode.setText(d.getDvcPrptyVlCdTxt());
		}
		/******************** devicepropertyvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicepropertyvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		deviceproperty.addValueQuantity(devicepropertyvaluequantity);

		/******************** Dvc_Prpty_VlQnty_Cd ********************************************************************************/
		if(d.getDvcPrptyVlQntyCd() != null) {
			devicepropertyvaluequantity.setCode(d.getDvcPrptyVlQntyCd());
		}
		/******************** devicepropertyvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory devicepropertyvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		devicepropertyvaluequantity.setComparator(devicepropertyvaluequantitycomparator.fromCode(d.getDvcPrptyVlQntyCmprtr()));

		/******************** Dvc_Prpty_VlQnty_Sys ********************************************************************************/
		if(d.getDvcPrptyVlQntySys() != null) {
			devicepropertyvaluequantity.setSystem(d.getDvcPrptyVlQntySys());
		}
		/******************** Dvc_Prpty_VlQnty_Unt ********************************************************************************/
		if(d.getDvcPrptyVlQntyUnt() != null) {
			devicepropertyvaluequantity.setUnit(d.getDvcPrptyVlQntyUnt());
		}
		/******************** Dvc_Prpty_VlQnty_Vl ********************************************************************************/
		if(d.getDvcPrptyVlQntyVl() != null) {
			devicepropertyvaluequantity.setValue(Double.parseDouble((d.getDvcPrptyVlQntyVl())));
		}
		/******************** devicesafety ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicesafety =  new org.hl7.fhir.r4.model.CodeableConcept();
		device.addSafety(devicesafety);

		/******************** devicesafetycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicesafetycoding =  new org.hl7.fhir.r4.model.Coding();
		devicesafety.addCoding(devicesafetycoding);

		/******************** Dvc_Safety_Cdg_Cd ********************************************************************************/
		if(d.getDvcSafetyCdgCd() != null) {
			devicesafetycoding.setCode(d.getDvcSafetyCdgCd());
		}
		/******************** Dvc_Safety_Cdg_Dsply ********************************************************************************/
		if(d.getDvcSafetyCdgDsply() != null) {
			devicesafetycoding.setDisplay(d.getDvcSafetyCdgDsply());
		}
		/******************** Dvc_Safety_Cdg_Sys ********************************************************************************/
		if(d.getDvcSafetyCdgSys() != null) {
			devicesafetycoding.setSystem(d.getDvcSafetyCdgSys());
		}
		/******************** Dvc_Safety_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcSafetyCdgUsrSltd() != null) {
			devicesafetycoding.setUserSelected(Boolean.parseBoolean(d.getDvcSafetyCdgUsrSltd()));
		}
		/******************** Dvc_Safety_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcSafetyCdgVrsn() != null) {
			devicesafetycoding.setVersion(d.getDvcSafetyCdgVrsn());
		}
		/******************** Dvc_Safety_Txt ********************************************************************************/
		if(d.getDvcSafetyTxt() != null) {
			devicesafety.setText(d.getDvcSafetyTxt());
		}
		/******************** Dvc_SerialNmbr ********************************************************************************/
		if(d.getDvcSerialNmbr() != null) {
			device.setSerialNumber(d.getDvcSerialNmbr());
		}
		/******************** devicespecialization ********************************************************************************/
		org.hl7.fhir.r4.model.Device.DeviceSpecializationComponent devicespecialization =  new org.hl7.fhir.r4.model.Device.DeviceSpecializationComponent();
		device.addSpecialization(devicespecialization);

		/******************** devicespecializationsystemtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicespecializationsystemtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		devicespecialization.setSystemType(devicespecializationsystemtype);

		/******************** devicespecializationsystemtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicespecializationsystemtypecoding =  new org.hl7.fhir.r4.model.Coding();
		devicespecializationsystemtype.addCoding(devicespecializationsystemtypecoding);

		/******************** Dvc_Spclization_SysTyp_Cdg_Cd ********************************************************************************/
		if(d.getDvcSpclizationSysTypCdgCd() != null) {
			devicespecializationsystemtypecoding.setCode(d.getDvcSpclizationSysTypCdgCd());
		}
		/******************** Dvc_Spclization_SysTyp_Cdg_Dsply ********************************************************************************/
		if(d.getDvcSpclizationSysTypCdgDsply() != null) {
			devicespecializationsystemtypecoding.setDisplay(d.getDvcSpclizationSysTypCdgDsply());
		}
		/******************** Dvc_Spclization_SysTyp_Cdg_Sys ********************************************************************************/
		if(d.getDvcSpclizationSysTypCdgSys() != null) {
			devicespecializationsystemtypecoding.setSystem(d.getDvcSpclizationSysTypCdgSys());
		}
		/******************** Dvc_Spclization_SysTyp_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcSpclizationSysTypCdgUsrSltd() != null) {
			devicespecializationsystemtypecoding.setUserSelected(Boolean.parseBoolean(d.getDvcSpclizationSysTypCdgUsrSltd()));
		}
		/******************** Dvc_Spclization_SysTyp_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcSpclizationSysTypCdgVrsn() != null) {
			devicespecializationsystemtypecoding.setVersion(d.getDvcSpclizationSysTypCdgVrsn());
		}
		/******************** Dvc_Spclization_SysTyp_Txt ********************************************************************************/
		if(d.getDvcSpclizationSysTypTxt() != null) {
			devicespecializationsystemtype.setText(d.getDvcSpclizationSysTypTxt());
		}
		/******************** Dvc_Spclization_Vrsn ********************************************************************************/
		if(d.getDvcSpclizationVrsn() != null) {
			devicespecialization.setVersion(d.getDvcSpclizationVrsn());
		}
		/******************** devicestatus ********************************************************************************/
		org.hl7.fhir.r4.model.Device.FHIRDeviceStatusEnumFactory devicestatus =  new org.hl7.fhir.r4.model.Device.FHIRDeviceStatusEnumFactory();
		device.setStatus(devicestatus.fromCode(d.getDvcSts()));

		/******************** devicestatusreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicestatusreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		device.addStatusReason(devicestatusreason);

		/******************** devicestatusreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicestatusreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		devicestatusreason.addCoding(devicestatusreasoncoding);

		/******************** Dvc_StsRsn_Cdg_Cd ********************************************************************************/
		if(d.getDvcStsRsnCdgCd() != null) {
			devicestatusreasoncoding.setCode(d.getDvcStsRsnCdgCd());
		}
		/******************** Dvc_StsRsn_Cdg_Dsply ********************************************************************************/
		if(d.getDvcStsRsnCdgDsply() != null) {
			devicestatusreasoncoding.setDisplay(d.getDvcStsRsnCdgDsply());
		}
		/******************** Dvc_StsRsn_Cdg_Sys ********************************************************************************/
		if(d.getDvcStsRsnCdgSys() != null) {
			devicestatusreasoncoding.setSystem(d.getDvcStsRsnCdgSys());
		}
		/******************** Dvc_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcStsRsnCdgUsrSltd() != null) {
			devicestatusreasoncoding.setUserSelected(Boolean.parseBoolean(d.getDvcStsRsnCdgUsrSltd()));
		}
		/******************** Dvc_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcStsRsnCdgVrsn() != null) {
			devicestatusreasoncoding.setVersion(d.getDvcStsRsnCdgVrsn());
		}
		/******************** Dvc_StsRsn_Txt ********************************************************************************/
		if(d.getDvcStsRsnTxt() != null) {
			devicestatusreason.setText(d.getDvcStsRsnTxt());
		}
		/******************** devicetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		device.setType(devicetype);

		/******************** devicetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicetypecoding =  new org.hl7.fhir.r4.model.Coding();
		devicetype.addCoding(devicetypecoding);

		/******************** Dvc_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDvcTypCdgCd() != null) {
			devicetypecoding.setCode(d.getDvcTypCdgCd());
		}
		/******************** Dvc_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDvcTypCdgDsply() != null) {
			devicetypecoding.setDisplay(d.getDvcTypCdgDsply());
		}
		/******************** Dvc_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDvcTypCdgSys() != null) {
			devicetypecoding.setSystem(d.getDvcTypCdgSys());
		}
		/******************** Dvc_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcTypCdgUsrSltd() != null) {
			devicetypecoding.setUserSelected(Boolean.parseBoolean(d.getDvcTypCdgUsrSltd()));
		}
		/******************** Dvc_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcTypCdgVrsn() != null) {
			devicetypecoding.setVersion(d.getDvcTypCdgVrsn());
		}
		/******************** Dvc_Typ_Txt ********************************************************************************/
		if(d.getDvcTypTxt() != null) {
			devicetype.setText(d.getDvcTypTxt());
		}
		/******************** deviceudicarrier ********************************************************************************/
		org.hl7.fhir.r4.model.Device.DeviceUdiCarrierComponent deviceudicarrier =  new org.hl7.fhir.r4.model.Device.DeviceUdiCarrierComponent();
		device.addUdiCarrier(deviceudicarrier);

		/******************** Dvc_UdiCarrier_CarrierAidc ********************************************************************************/
		if(d.getDvcUdiCarrierCarrierAidc() != null) {
			deviceudicarrier.setCarrierAIDCElement(new org.hl7.fhir.r4.model.Base64BinaryType(d.getDvcUdiCarrierCarrierAidc()));
		}
		/******************** Dvc_UdiCarrier_CarrierHrf ********************************************************************************/
		if(d.getDvcUdiCarrierCarrierHrf() != null) {
			deviceudicarrier.setCarrierHRF(d.getDvcUdiCarrierCarrierHrf());
		}
		/******************** Dvc_UdiCarrier_DvcId ********************************************************************************/
		if(d.getDvcUdiCarrierDvcId() != null) {
			deviceudicarrier.setDeviceIdentifier(d.getDvcUdiCarrierDvcId());
		}
		/******************** deviceudicarrierentrytype ********************************************************************************/
		org.hl7.fhir.r4.model.Device.UDIEntryTypeEnumFactory deviceudicarrierentrytype =  new org.hl7.fhir.r4.model.Device.UDIEntryTypeEnumFactory();
		deviceudicarrier.setEntryType(deviceudicarrierentrytype.fromCode(d.getDvcUdiCarrierEntryTyp()));

		/******************** Dvc_UdiCarrier_Issuer ********************************************************************************/
		if(d.getDvcUdiCarrierIssuer() != null) {
			deviceudicarrier.setIssuer(d.getDvcUdiCarrierIssuer());
		}
		/******************** Dvc_UdiCarrier_Jrsdctn ********************************************************************************/
		if(d.getDvcUdiCarrierJrsdctn() != null) {
			deviceudicarrier.setJurisdiction(d.getDvcUdiCarrierJrsdctn());
		}
		/******************** Dvc_Url ********************************************************************************/
		if(d.getDvcUrl() != null) {
			device.setUrl(d.getDvcUrl());
		}
		/******************** deviceversion ********************************************************************************/
		org.hl7.fhir.r4.model.Device.DeviceVersionComponent deviceversion =  new org.hl7.fhir.r4.model.Device.DeviceVersionComponent();
		device.addVersion(deviceversion);

		/******************** deviceversioncomponent ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier deviceversioncomponent =  new org.hl7.fhir.r4.model.Identifier();
		deviceversion.setComponent(deviceversioncomponent);

		/******************** Dvc_Vrsn_Cmpnt_Assigner ********************************************************************************/
		if(d.getDvcVrsnCmpntAssigner() != null) {
			deviceversioncomponent.setAssigner( new org.hl7.fhir.r4.model.Reference(d.getDvcVrsnCmpntAssigner()));
		}
		/******************** deviceversioncomponentperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period deviceversioncomponentperiod =  new org.hl7.fhir.r4.model.Period();
		deviceversioncomponent.setPeriod(deviceversioncomponentperiod);

		/******************** Dvc_Vrsn_Cmpnt_Prd_End ********************************************************************************/
		if(d.getDvcVrsnCmpntPrdEnd() != null) {
			java.text.SimpleDateFormat Dvc_Vrsn_Cmpnt_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Dvc_Vrsn_Cmpnt_Prd_Enddate = Dvc_Vrsn_Cmpnt_Prd_Endsdf.parse(d.getDvcVrsnCmpntPrdEnd());
			deviceversioncomponentperiod.setEnd(Dvc_Vrsn_Cmpnt_Prd_Enddate);
		}
		/******************** Dvc_Vrsn_Cmpnt_Prd_Strt ********************************************************************************/
		if(d.getDvcVrsnCmpntPrdStrt() != null) {
			java.text.SimpleDateFormat Dvc_Vrsn_Cmpnt_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Dvc_Vrsn_Cmpnt_Prd_Strtdate = Dvc_Vrsn_Cmpnt_Prd_Strtsdf.parse(d.getDvcVrsnCmpntPrdStrt());
			deviceversioncomponentperiod.setStart(Dvc_Vrsn_Cmpnt_Prd_Strtdate);
		}
		/******************** Dvc_Vrsn_Cmpnt_Sys ********************************************************************************/
		if(d.getDvcVrsnCmpntSys() != null) {
			deviceversioncomponent.setSystem(d.getDvcVrsnCmpntSys());
		}
		/******************** deviceversioncomponenttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept deviceversioncomponenttype =  new org.hl7.fhir.r4.model.CodeableConcept();
		deviceversioncomponent.setType(deviceversioncomponenttype);

		/******************** deviceversioncomponenttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding deviceversioncomponenttypecoding =  new org.hl7.fhir.r4.model.Coding();
		deviceversioncomponenttype.addCoding(deviceversioncomponenttypecoding);

		/******************** Dvc_Vrsn_Cmpnt_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDvcVrsnCmpntTypCdgCd() != null) {
			deviceversioncomponenttypecoding.setCode(d.getDvcVrsnCmpntTypCdgCd());
		}
		/******************** Dvc_Vrsn_Cmpnt_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDvcVrsnCmpntTypCdgDsply() != null) {
			deviceversioncomponenttypecoding.setDisplay(d.getDvcVrsnCmpntTypCdgDsply());
		}
		/******************** Dvc_Vrsn_Cmpnt_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDvcVrsnCmpntTypCdgSys() != null) {
			deviceversioncomponenttypecoding.setSystem(d.getDvcVrsnCmpntTypCdgSys());
		}
		/******************** Dvc_Vrsn_Cmpnt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcVrsnCmpntTypCdgUsrSltd() != null) {
			deviceversioncomponenttypecoding.setUserSelected(Boolean.parseBoolean(d.getDvcVrsnCmpntTypCdgUsrSltd()));
		}
		/******************** Dvc_Vrsn_Cmpnt_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcVrsnCmpntTypCdgVrsn() != null) {
			deviceversioncomponenttypecoding.setVersion(d.getDvcVrsnCmpntTypCdgVrsn());
		}
		/******************** Dvc_Vrsn_Cmpnt_Typ_Txt ********************************************************************************/
		if(d.getDvcVrsnCmpntTypTxt() != null) {
			deviceversioncomponenttype.setText(d.getDvcVrsnCmpntTypTxt());
		}
		/******************** deviceversioncomponentuse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory deviceversioncomponentuse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		deviceversioncomponent.setUse(deviceversioncomponentuse.fromCode(d.getDvcVrsnCmpntUse()));

		/******************** Dvc_Vrsn_Cmpnt_Vl ********************************************************************************/
		if(d.getDvcVrsnCmpntVl() != null) {
			deviceversioncomponent.setValue(d.getDvcVrsnCmpntVl());
		}
		/******************** deviceversiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept deviceversiontype =  new org.hl7.fhir.r4.model.CodeableConcept();
		deviceversion.setType(deviceversiontype);

		/******************** deviceversiontypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding deviceversiontypecoding =  new org.hl7.fhir.r4.model.Coding();
		deviceversiontype.addCoding(deviceversiontypecoding);

		/******************** Dvc_Vrsn_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDvcVrsnTypCdgCd() != null) {
			deviceversiontypecoding.setCode(d.getDvcVrsnTypCdgCd());
		}
		/******************** Dvc_Vrsn_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDvcVrsnTypCdgDsply() != null) {
			deviceversiontypecoding.setDisplay(d.getDvcVrsnTypCdgDsply());
		}
		/******************** Dvc_Vrsn_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDvcVrsnTypCdgSys() != null) {
			deviceversiontypecoding.setSystem(d.getDvcVrsnTypCdgSys());
		}
		/******************** Dvc_Vrsn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcVrsnTypCdgUsrSltd() != null) {
			deviceversiontypecoding.setUserSelected(Boolean.parseBoolean(d.getDvcVrsnTypCdgUsrSltd()));
		}
		/******************** Dvc_Vrsn_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcVrsnTypCdgVrsn() != null) {
			deviceversiontypecoding.setVersion(d.getDvcVrsnTypCdgVrsn());
		}
		/******************** Dvc_Vrsn_Typ_Txt ********************************************************************************/
		if(d.getDvcVrsnTypTxt() != null) {
			deviceversiontype.setText(d.getDvcVrsnTypTxt());
		}
		/******************** Dvc_Vrsn_Vl ********************************************************************************/
		if(d.getDvcVrsnVl() != null) {
			deviceversion.setValue(d.getDvcVrsnVl());
		}
		return device;
	}
}
