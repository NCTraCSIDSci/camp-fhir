package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Device;
public class DeviceBidirectionalConversion 
{
	public Device Devices(org.hl7.fhir.r4.model.Device device) throws ParseException
	{
		 main.java.com.campfhir.model.Device d = new  main.java.com.campfhir.model.Device();

		/******************** id ********************************************************************************/
		device.setId(d.getId());

		/******************** Dvc_Owner ********************************************************************************/
		if(device.hasOwner()) {
			d.setDvcOwner(String.valueOf(device.getOwner()));
		}
		/******************** Dvc_Lctn ********************************************************************************/
		if(device.hasLocation()) {
			d.setDvcLctn(String.valueOf(device.getLocation()));
		}
		/******************** Dvc_Parent ********************************************************************************/
		if(device.hasParent()) {
			d.setDvcParent(String.valueOf(device.getParent()));
		}
		/******************** devicetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicetype = device.getType();

		/******************** Dvc_Typ_Txt ********************************************************************************/
		if(devicetype.hasText()) {
			d.setDvcTypTxt(String.valueOf(devicetype.getText()));
		}
		/******************** devicetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicetypecoding = devicetype.getCodingFirstRep();

		/******************** Dvc_Typ_Cdg_Vrsn ********************************************************************************/
		if(devicetypecoding.hasVersion()) {
			d.setDvcTypCdgVrsn(String.valueOf(devicetypecoding.getVersion()));
		}
		/******************** Dvc_Typ_Cdg_Dsply ********************************************************************************/
		if(devicetypecoding.hasDisplay()) {
			d.setDvcTypCdgDsply(String.valueOf(devicetypecoding.getDisplay()));
		}
		/******************** Dvc_Typ_Cdg_Cd ********************************************************************************/
		if(devicetypecoding.hasCode()) {
			d.setDvcTypCdgCd(String.valueOf(devicetypecoding.getCode()));
		}
		/******************** Dvc_Typ_Cdg_UsrSltd ********************************************************************************/
		if(devicetypecoding.hasUserSelected()) {
			d.setDvcTypCdgUsrSltd(String.valueOf(devicetypecoding.getUserSelected()));
		}
		/******************** Dvc_Typ_Cdg_Sys ********************************************************************************/
		if(devicetypecoding.hasSystem()) {
			d.setDvcTypCdgSys(String.valueOf(devicetypecoding.getSystem()));
		}
		/******************** Dvc_Dfn ********************************************************************************/
		if(device.hasDefinition()) {
			d.setDvcDfn(String.valueOf(device.getDefinition()));
		}
		/******************** Dvc_ExpirationDt ********************************************************************************/
		if(device.hasExpirationDate()) {
			d.setDvcExpirationDt(String.valueOf(device.getExpirationDate()));
		}
		/******************** Dvc_ManufactureDt ********************************************************************************/
		if(device.hasManufactureDate()) {
			d.setDvcManufactureDt(String.valueOf(device.getManufactureDate()));
		}
		/******************** Dvc_LotNmbr ********************************************************************************/
		if(device.hasLotNumber()) {
			d.setDvcLotNmbr(String.valueOf(device.getLotNumber()));
		}
		/******************** Dvc_Manufacturer ********************************************************************************/
		if(device.hasManufacturer()) {
			d.setDvcManufacturer(String.valueOf(device.getManufacturer()));
		}
		/******************** Dvc_SerialNmbr ********************************************************************************/
		if(device.hasSerialNumber()) {
			d.setDvcSerialNmbr(String.valueOf(device.getSerialNumber()));
		}
		/******************** deviceversion ********************************************************************************/
		org.hl7.fhir.r4.model.Device.DeviceVersionComponent deviceversion = device.getVersionFirstRep();

		/******************** Dvc_Vrsn_Vl ********************************************************************************/
		if(deviceversion.hasValue()) {
			d.setDvcVrsnVl(String.valueOf(deviceversion.getValue()));
		}
		/******************** deviceversiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept deviceversiontype = deviceversion.getType();

		/******************** Dvc_Vrsn_Typ_Txt ********************************************************************************/
		if(deviceversiontype.hasText()) {
			d.setDvcVrsnTypTxt(String.valueOf(deviceversiontype.getText()));
		}
		/******************** deviceversiontypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding deviceversiontypecoding = deviceversiontype.getCodingFirstRep();

		/******************** Dvc_Vrsn_Typ_Cdg_Vrsn ********************************************************************************/
		if(deviceversiontypecoding.hasVersion()) {
			d.setDvcVrsnTypCdgVrsn(String.valueOf(deviceversiontypecoding.getVersion()));
		}
		/******************** Dvc_Vrsn_Typ_Cdg_Dsply ********************************************************************************/
		if(deviceversiontypecoding.hasDisplay()) {
			d.setDvcVrsnTypCdgDsply(String.valueOf(deviceversiontypecoding.getDisplay()));
		}
		/******************** Dvc_Vrsn_Typ_Cdg_Cd ********************************************************************************/
		if(deviceversiontypecoding.hasCode()) {
			d.setDvcVrsnTypCdgCd(String.valueOf(deviceversiontypecoding.getCode()));
		}
		/******************** Dvc_Vrsn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(deviceversiontypecoding.hasUserSelected()) {
			d.setDvcVrsnTypCdgUsrSltd(String.valueOf(deviceversiontypecoding.getUserSelected()));
		}
		/******************** Dvc_Vrsn_Typ_Cdg_Sys ********************************************************************************/
		if(deviceversiontypecoding.hasSystem()) {
			d.setDvcVrsnTypCdgSys(String.valueOf(deviceversiontypecoding.getSystem()));
		}
		/******************** deviceversioncomponent ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier deviceversioncomponent = deviceversion.getComponent();

		/******************** Dvc_Vrsn_Cmpnt_Vl ********************************************************************************/
		if(deviceversioncomponent.hasValue()) {
			d.setDvcVrsnCmpntVl(String.valueOf(deviceversioncomponent.getValue()));
		}
		/******************** deviceversioncomponenttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept deviceversioncomponenttype = deviceversioncomponent.getType();

		/******************** Dvc_Vrsn_Cmpnt_Typ_Txt ********************************************************************************/
		if(deviceversioncomponenttype.hasText()) {
			d.setDvcVrsnCmpntTypTxt(String.valueOf(deviceversioncomponenttype.getText()));
		}
		/******************** deviceversioncomponenttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding deviceversioncomponenttypecoding = deviceversioncomponenttype.getCodingFirstRep();

		/******************** Dvc_Vrsn_Cmpnt_Typ_Cdg_Vrsn ********************************************************************************/
		if(deviceversioncomponenttypecoding.hasVersion()) {
			d.setDvcVrsnCmpntTypCdgVrsn(String.valueOf(deviceversioncomponenttypecoding.getVersion()));
		}
		/******************** Dvc_Vrsn_Cmpnt_Typ_Cdg_Dsply ********************************************************************************/
		if(deviceversioncomponenttypecoding.hasDisplay()) {
			d.setDvcVrsnCmpntTypCdgDsply(String.valueOf(deviceversioncomponenttypecoding.getDisplay()));
		}
		/******************** Dvc_Vrsn_Cmpnt_Typ_Cdg_Cd ********************************************************************************/
		if(deviceversioncomponenttypecoding.hasCode()) {
			d.setDvcVrsnCmpntTypCdgCd(String.valueOf(deviceversioncomponenttypecoding.getCode()));
		}
		/******************** Dvc_Vrsn_Cmpnt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(deviceversioncomponenttypecoding.hasUserSelected()) {
			d.setDvcVrsnCmpntTypCdgUsrSltd(String.valueOf(deviceversioncomponenttypecoding.getUserSelected()));
		}
		/******************** Dvc_Vrsn_Cmpnt_Typ_Cdg_Sys ********************************************************************************/
		if(deviceversioncomponenttypecoding.hasSystem()) {
			d.setDvcVrsnCmpntTypCdgSys(String.valueOf(deviceversioncomponenttypecoding.getSystem()));
		}
		/******************** deviceversioncomponentperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period deviceversioncomponentperiod = deviceversioncomponent.getPeriod();

		/******************** Dvc_Vrsn_Cmpnt_Prd_Strt ********************************************************************************/
		if(deviceversioncomponentperiod.hasStart()) {
			d.setDvcVrsnCmpntPrdStrt(String.valueOf(deviceversioncomponentperiod.getStart()));
		}
		/******************** Dvc_Vrsn_Cmpnt_Prd_End ********************************************************************************/
		if(deviceversioncomponentperiod.hasEnd()) {
			d.setDvcVrsnCmpntPrdEnd(String.valueOf(deviceversioncomponentperiod.getEnd()));
		}
		/******************** Dvc_Vrsn_Cmpnt_Assigner ********************************************************************************/
		if(deviceversioncomponent.hasAssigner()) {
			d.setDvcVrsnCmpntAssigner(String.valueOf(deviceversioncomponent.getAssigner()));
		}
		/******************** Dvc_Vrsn_Cmpnt_Sys ********************************************************************************/
		if(deviceversioncomponent.hasSystem()) {
			d.setDvcVrsnCmpntSys(String.valueOf(deviceversioncomponent.getSystem()));
		}
		/******************** deviceversioncomponentuse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse deviceversioncomponentuse = deviceversioncomponent.getUse();
		d.setDvcVrsnCmpntUse(deviceversioncomponentuse.toCode());

		/******************** Dvc_ModelNmbr ********************************************************************************/
		if(device.hasModelNumber()) {
			d.setDvcModelNmbr(String.valueOf(device.getModelNumber()));
		}
		/******************** Dvc_PartNmbr ********************************************************************************/
		if(device.hasPartNumber()) {
			d.setDvcPartNmbr(String.valueOf(device.getPartNumber()));
		}
		/******************** devicesafety ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicesafety = device.getSafetyFirstRep();

		/******************** Dvc_Safety_Txt ********************************************************************************/
		if(devicesafety.hasText()) {
			d.setDvcSafetyTxt(String.valueOf(devicesafety.getText()));
		}
		/******************** devicesafetycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicesafetycoding = devicesafety.getCodingFirstRep();

		/******************** Dvc_Safety_Cdg_Vrsn ********************************************************************************/
		if(devicesafetycoding.hasVersion()) {
			d.setDvcSafetyCdgVrsn(String.valueOf(devicesafetycoding.getVersion()));
		}
		/******************** Dvc_Safety_Cdg_Dsply ********************************************************************************/
		if(devicesafetycoding.hasDisplay()) {
			d.setDvcSafetyCdgDsply(String.valueOf(devicesafetycoding.getDisplay()));
		}
		/******************** Dvc_Safety_Cdg_Cd ********************************************************************************/
		if(devicesafetycoding.hasCode()) {
			d.setDvcSafetyCdgCd(String.valueOf(devicesafetycoding.getCode()));
		}
		/******************** Dvc_Safety_Cdg_UsrSltd ********************************************************************************/
		if(devicesafetycoding.hasUserSelected()) {
			d.setDvcSafetyCdgUsrSltd(String.valueOf(devicesafetycoding.getUserSelected()));
		}
		/******************** Dvc_Safety_Cdg_Sys ********************************************************************************/
		if(devicesafetycoding.hasSystem()) {
			d.setDvcSafetyCdgSys(String.valueOf(devicesafetycoding.getSystem()));
		}
		/******************** Dvc_Pnt ********************************************************************************/
		if(device.hasPatient()) {
			d.setDvcPnt(String.valueOf(device.getPatient()));
		}
		/******************** devicestatus ********************************************************************************/
		org.hl7.fhir.r4.model.Device.FHIRDeviceStatus devicestatus = device.getStatus();
		d.setDvcSts(devicestatus.toCode());

		/******************** devicenote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation devicenote = device.getNoteFirstRep();

		/******************** Dvc_Nt_Time ********************************************************************************/
		if(devicenote.hasTime()) {
			d.setDvcNtTime(String.valueOf(devicenote.getTime()));
		}
		/******************** Dvc_Nt_Txt ********************************************************************************/
		if(devicenote.hasText()) {
			d.setDvcNtTxt(String.valueOf(devicenote.getText()));
		}
		/******************** Dvc_Nt_AthrRfrnc ********************************************************************************/
		if(devicenote.hasAuthorReference()) {
			d.setDvcNtAthrRfrnc(String.valueOf(devicenote.getAuthorReference()));
		}
		/******************** Dvc_Nt_AthrStrgTyp ********************************************************************************/
		if(devicenote.hasAuthorStringType()) {
			d.setDvcNtAthrStrgTyp(String.valueOf(devicenote.getAuthorStringType()));
		}
		/******************** Dvc_Url ********************************************************************************/
		if(device.hasUrl()) {
			d.setDvcUrl(String.valueOf(device.getUrl()));
		}
		/******************** devicecontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint devicecontact = device.getContactFirstRep();

		/******************** Dvc_Cntct_Vl ********************************************************************************/
		if(devicecontact.hasValue()) {
			d.setDvcCntctVl(String.valueOf(devicecontact.getValue()));
		}
		/******************** devicecontactperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period devicecontactperiod = devicecontact.getPeriod();

		/******************** Dvc_Cntct_Prd_Strt ********************************************************************************/
		if(devicecontactperiod.hasStart()) {
			d.setDvcCntctPrdStrt(String.valueOf(devicecontactperiod.getStart()));
		}
		/******************** Dvc_Cntct_Prd_End ********************************************************************************/
		if(devicecontactperiod.hasEnd()) {
			d.setDvcCntctPrdEnd(String.valueOf(devicecontactperiod.getEnd()));
		}
		/******************** devicecontactsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem devicecontactsystem = devicecontact.getSystem();
		d.setDvcCntctSys(devicecontactsystem.toCode());

		/******************** devicecontactuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse devicecontactuse = devicecontact.getUse();
		d.setDvcCntctUse(devicecontactuse.toCode());

		/******************** Dvc_Cntct_Rnk ********************************************************************************/
		if(devicecontact.hasRank()) {
			d.setDvcCntctRnk(String.valueOf(devicecontact.getRank()));
		}
		/******************** devicedevicename ********************************************************************************/
		org.hl7.fhir.r4.model.Device.DeviceDeviceNameComponent devicedevicename = device.getDeviceNameFirstRep();

		/******************** Dvc_DvcNm_Nm ********************************************************************************/
		if(devicedevicename.hasName()) {
			d.setDvcDvcNmNm(String.valueOf(devicedevicename.getName()));
		}
		/******************** devicedevicenametype ********************************************************************************/
		org.hl7.fhir.r4.model.Device.DeviceNameType devicedevicenametype = devicedevicename.getType();
		d.setDvcDvcNmTyp(devicedevicenametype.toCode());

		/******************** Dvc_DistinctId ********************************************************************************/
		if(device.hasDistinctIdentifier()) {
			d.setDvcDistinctId(String.valueOf(device.getDistinctIdentifier()));
		}
		/******************** deviceudicarrier ********************************************************************************/
		org.hl7.fhir.r4.model.Device.DeviceUdiCarrierComponent deviceudicarrier = device.getUdiCarrierFirstRep();

		/******************** Dvc_UdiCarrier_CarrierHrf ********************************************************************************/
		if(deviceudicarrier.hasCarrierHRF()) {
			d.setDvcUdiCarrierCarrierHrf(String.valueOf(deviceudicarrier.getCarrierHRF()));
		}
		/******************** Dvc_UdiCarrier_CarrierAidc ********************************************************************************/
		if(deviceudicarrier.hasCarrierAIDC()) {
			d.setDvcUdiCarrierCarrierAidc(String.valueOf(deviceudicarrier.getCarrierAIDC()));
		}

		/******************** deviceudicarrierentrytype ********************************************************************************/
		org.hl7.fhir.r4.model.Device.UDIEntryType deviceudicarrierentrytype = deviceudicarrier.getEntryType();
		d.setDvcUdiCarrierEntryTyp(deviceudicarrierentrytype.toCode());

		/******************** Dvc_UdiCarrier_DvcId ********************************************************************************/
		if(deviceudicarrier.hasDeviceIdentifier()) {
			d.setDvcUdiCarrierDvcId(String.valueOf(deviceudicarrier.getDeviceIdentifier()));
		}
		/******************** Dvc_UdiCarrier_Jrsdctn ********************************************************************************/
		if(deviceudicarrier.hasJurisdiction()) {
			d.setDvcUdiCarrierJrsdctn(String.valueOf(deviceudicarrier.getJurisdiction()));
		}
		/******************** Dvc_UdiCarrier_Issuer ********************************************************************************/
		if(deviceudicarrier.hasIssuer()) {
			d.setDvcUdiCarrierIssuer(String.valueOf(deviceudicarrier.getIssuer()));
		}
		/******************** devicestatusreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicestatusreason = device.getStatusReasonFirstRep();

		/******************** Dvc_StsRsn_Txt ********************************************************************************/
		if(devicestatusreason.hasText()) {
			d.setDvcStsRsnTxt(String.valueOf(devicestatusreason.getText()));
		}
		/******************** devicestatusreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicestatusreasoncoding = devicestatusreason.getCodingFirstRep();

		/******************** Dvc_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(devicestatusreasoncoding.hasVersion()) {
			d.setDvcStsRsnCdgVrsn(String.valueOf(devicestatusreasoncoding.getVersion()));
		}
		/******************** Dvc_StsRsn_Cdg_Dsply ********************************************************************************/
		if(devicestatusreasoncoding.hasDisplay()) {
			d.setDvcStsRsnCdgDsply(String.valueOf(devicestatusreasoncoding.getDisplay()));
		}
		/******************** Dvc_StsRsn_Cdg_Cd ********************************************************************************/
		if(devicestatusreasoncoding.hasCode()) {
			d.setDvcStsRsnCdgCd(String.valueOf(devicestatusreasoncoding.getCode()));
		}
		/******************** Dvc_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(devicestatusreasoncoding.hasUserSelected()) {
			d.setDvcStsRsnCdgUsrSltd(String.valueOf(devicestatusreasoncoding.getUserSelected()));
		}
		/******************** Dvc_StsRsn_Cdg_Sys ********************************************************************************/
		if(devicestatusreasoncoding.hasSystem()) {
			d.setDvcStsRsnCdgSys(String.valueOf(devicestatusreasoncoding.getSystem()));
		}
		/******************** devicespecialization ********************************************************************************/
		org.hl7.fhir.r4.model.Device.DeviceSpecializationComponent devicespecialization = device.getSpecializationFirstRep();

		/******************** devicespecializationsystemtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicespecializationsystemtype = devicespecialization.getSystemType();

		/******************** Dvc_Spclization_SysTyp_Txt ********************************************************************************/
		if(devicespecializationsystemtype.hasText()) {
			d.setDvcSpclizationSysTypTxt(String.valueOf(devicespecializationsystemtype.getText()));
		}
		/******************** devicespecializationsystemtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicespecializationsystemtypecoding = devicespecializationsystemtype.getCodingFirstRep();

		/******************** Dvc_Spclization_SysTyp_Cdg_Vrsn ********************************************************************************/
		if(devicespecializationsystemtypecoding.hasVersion()) {
			d.setDvcSpclizationSysTypCdgVrsn(String.valueOf(devicespecializationsystemtypecoding.getVersion()));
		}
		/******************** Dvc_Spclization_SysTyp_Cdg_Dsply ********************************************************************************/
		if(devicespecializationsystemtypecoding.hasDisplay()) {
			d.setDvcSpclizationSysTypCdgDsply(String.valueOf(devicespecializationsystemtypecoding.getDisplay()));
		}
		/******************** Dvc_Spclization_SysTyp_Cdg_Cd ********************************************************************************/
		if(devicespecializationsystemtypecoding.hasCode()) {
			d.setDvcSpclizationSysTypCdgCd(String.valueOf(devicespecializationsystemtypecoding.getCode()));
		}
		/******************** Dvc_Spclization_SysTyp_Cdg_UsrSltd ********************************************************************************/
		if(devicespecializationsystemtypecoding.hasUserSelected()) {
			d.setDvcSpclizationSysTypCdgUsrSltd(String.valueOf(devicespecializationsystemtypecoding.getUserSelected()));
		}
		/******************** Dvc_Spclization_SysTyp_Cdg_Sys ********************************************************************************/
		if(devicespecializationsystemtypecoding.hasSystem()) {
			d.setDvcSpclizationSysTypCdgSys(String.valueOf(devicespecializationsystemtypecoding.getSystem()));
		}
		/******************** deviceproperty ********************************************************************************/
		org.hl7.fhir.r4.model.Device.DevicePropertyComponent deviceproperty = device.getPropertyFirstRep();

		/******************** devicepropertytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicepropertytype = deviceproperty.getType();

		/******************** Dvc_Prpty_Typ_Txt ********************************************************************************/
		if(devicepropertytype.hasText()) {
			d.setDvcPrptyTypTxt(String.valueOf(devicepropertytype.getText()));
		}
		/******************** devicepropertytypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicepropertytypecoding = devicepropertytype.getCodingFirstRep();

		/******************** Dvc_Prpty_Typ_Cdg_Vrsn ********************************************************************************/
		if(devicepropertytypecoding.hasVersion()) {
			d.setDvcPrptyTypCdgVrsn(String.valueOf(devicepropertytypecoding.getVersion()));
		}
		/******************** Dvc_Prpty_Typ_Cdg_Dsply ********************************************************************************/
		if(devicepropertytypecoding.hasDisplay()) {
			d.setDvcPrptyTypCdgDsply(String.valueOf(devicepropertytypecoding.getDisplay()));
		}
		/******************** Dvc_Prpty_Typ_Cdg_Cd ********************************************************************************/
		if(devicepropertytypecoding.hasCode()) {
			d.setDvcPrptyTypCdgCd(String.valueOf(devicepropertytypecoding.getCode()));
		}
		/******************** Dvc_Prpty_Typ_Cdg_UsrSltd ********************************************************************************/
		if(devicepropertytypecoding.hasUserSelected()) {
			d.setDvcPrptyTypCdgUsrSltd(String.valueOf(devicepropertytypecoding.getUserSelected()));
		}
		/******************** Dvc_Prpty_Typ_Cdg_Sys ********************************************************************************/
		if(devicepropertytypecoding.hasSystem()) {
			d.setDvcPrptyTypCdgSys(String.valueOf(devicepropertytypecoding.getSystem()));
		}
		/******************** devicepropertyvaluecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicepropertyvaluecode = deviceproperty.getValueCodeFirstRep();

		/******************** Dvc_Prpty_VlCd_Txt ********************************************************************************/
		if(devicepropertyvaluecode.hasText()) {
			d.setDvcPrptyVlCdTxt(String.valueOf(devicepropertyvaluecode.getText()));
		}
		/******************** devicepropertyvaluecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicepropertyvaluecodecoding = devicepropertyvaluecode.getCodingFirstRep();

		/******************** Dvc_Prpty_VlCd_Cdg_Vrsn ********************************************************************************/
		if(devicepropertyvaluecodecoding.hasVersion()) {
			d.setDvcPrptyVlCdCdgVrsn(String.valueOf(devicepropertyvaluecodecoding.getVersion()));
		}
		/******************** Dvc_Prpty_VlCd_Cdg_Dsply ********************************************************************************/
		if(devicepropertyvaluecodecoding.hasDisplay()) {
			d.setDvcPrptyVlCdCdgDsply(String.valueOf(devicepropertyvaluecodecoding.getDisplay()));
		}
		/******************** Dvc_Prpty_VlCd_Cdg_Cd ********************************************************************************/
		if(devicepropertyvaluecodecoding.hasCode()) {
			d.setDvcPrptyVlCdCdgCd(String.valueOf(devicepropertyvaluecodecoding.getCode()));
		}
		/******************** Dvc_Prpty_VlCd_Cdg_UsrSltd ********************************************************************************/
		if(devicepropertyvaluecodecoding.hasUserSelected()) {
			d.setDvcPrptyVlCdCdgUsrSltd(String.valueOf(devicepropertyvaluecodecoding.getUserSelected()));
		}
		/******************** Dvc_Prpty_VlCd_Cdg_Sys ********************************************************************************/
		if(devicepropertyvaluecodecoding.hasSystem()) {
			d.setDvcPrptyVlCdCdgSys(String.valueOf(devicepropertyvaluecodecoding.getSystem()));
		}
		/******************** devicepropertyvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicepropertyvaluequantity = deviceproperty.getValueQuantityFirstRep();

		/******************** Dvc_Prpty_VlQnty_Vl ********************************************************************************/
		if(devicepropertyvaluequantity.hasValue()) {
			d.setDvcPrptyVlQntyVl(String.valueOf(devicepropertyvaluequantity.getValue()));
		}
		/******************** devicepropertyvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicepropertyvaluequantitycomparator = devicepropertyvaluequantity.getComparator();
		d.setDvcPrptyVlQntyCmprtr(devicepropertyvaluequantitycomparator.toCode());

		/******************** Dvc_Prpty_VlQnty_Cd ********************************************************************************/
		if(devicepropertyvaluequantity.hasCode()) {
			d.setDvcPrptyVlQntyCd(String.valueOf(devicepropertyvaluequantity.getCode()));
		}
		/******************** Dvc_Prpty_VlQnty_Unt ********************************************************************************/
		if(devicepropertyvaluequantity.hasUnit()) {
			d.setDvcPrptyVlQntyUnt(String.valueOf(devicepropertyvaluequantity.getUnit()));
		}
		/******************** Dvc_Prpty_VlQnty_Sys ********************************************************************************/
		if(devicepropertyvaluequantity.hasSystem()) {
			d.setDvcPrptyVlQntySys(String.valueOf(devicepropertyvaluequantity.getSystem()));
		}
		/******************** deviceidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier deviceidentifier = device.getIdentifierFirstRep();

		/******************** Dvc_Id_Vl ********************************************************************************/
		if(deviceidentifier.hasValue()) {
			d.setDvcIdVl(String.valueOf(deviceidentifier.getValue()));
		}
		/******************** deviceidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept deviceidentifiertype = deviceidentifier.getType();

		/******************** Dvc_Id_Typ_Txt ********************************************************************************/
		if(deviceidentifiertype.hasText()) {
			d.setDvcIdTypTxt(String.valueOf(deviceidentifiertype.getText()));
		}
		/******************** deviceidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding deviceidentifiertypecoding = deviceidentifiertype.getCodingFirstRep();

		/******************** Dvc_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(deviceidentifiertypecoding.hasVersion()) {
			d.setDvcIdTypCdgVrsn(String.valueOf(deviceidentifiertypecoding.getVersion()));
		}
		/******************** Dvc_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(deviceidentifiertypecoding.hasDisplay()) {
			d.setDvcIdTypCdgDsply(String.valueOf(deviceidentifiertypecoding.getDisplay()));
		}
		/******************** Dvc_Id_Typ_Cdg_Cd ********************************************************************************/
		if(deviceidentifiertypecoding.hasCode()) {
			d.setDvcIdTypCdgCd(String.valueOf(deviceidentifiertypecoding.getCode()));
		}
		/******************** Dvc_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(deviceidentifiertypecoding.hasUserSelected()) {
			d.setDvcIdTypCdgUsrSltd(String.valueOf(deviceidentifiertypecoding.getUserSelected()));
		}
		/******************** Dvc_Id_Typ_Cdg_Sys ********************************************************************************/
		if(deviceidentifiertypecoding.hasSystem()) {
			d.setDvcIdTypCdgSys(String.valueOf(deviceidentifiertypecoding.getSystem()));
		}
		/******************** deviceidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period deviceidentifierperiod = deviceidentifier.getPeriod();

		/******************** Dvc_Id_Prd_Strt ********************************************************************************/
		if(deviceidentifierperiod.hasStart()) {
			d.setDvcIdPrdStrt(String.valueOf(deviceidentifierperiod.getStart()));
		}
		/******************** Dvc_Id_Prd_End ********************************************************************************/
		if(deviceidentifierperiod.hasEnd()) {
			d.setDvcIdPrdEnd(String.valueOf(deviceidentifierperiod.getEnd()));
		}
		/******************** Dvc_Id_Assigner ********************************************************************************/
		if(deviceidentifier.hasAssigner()) {
			d.setDvcIdAssigner(String.valueOf(deviceidentifier.getAssigner()));
		}
		/******************** Dvc_Id_Sys ********************************************************************************/
		if(deviceidentifier.hasSystem()) {
			d.setDvcIdSys(String.valueOf(deviceidentifier.getSystem()));
		}
		/******************** deviceidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse deviceidentifieruse = deviceidentifier.getUse();
		d.setDvcIdUse(deviceidentifieruse.toCode());

		return d;
	}
}
