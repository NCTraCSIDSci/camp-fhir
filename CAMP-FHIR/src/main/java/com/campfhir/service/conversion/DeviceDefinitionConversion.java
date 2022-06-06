package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.DeviceDefinition;
public class DeviceDefinitionConversion 
{
	public org.hl7.fhir.r4.model.DeviceDefinition DeviceDefinitions(DeviceDefinition d) throws ParseException
	{
		org.hl7.fhir.r4.model.DeviceDefinition devicedefinition = new org.hl7.fhir.r4.model.DeviceDefinition();

		/******************** id ********************************************************************************/
		devicedefinition.setId(d.getId());

		/******************** devicedefinitioncapability ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionCapabilityComponent devicedefinitioncapability =  new org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionCapabilityComponent();
		devicedefinition.addCapability(devicedefinitioncapability);

		/******************** devicedefinitioncapabilitydescription ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicedefinitioncapabilitydescription =  new org.hl7.fhir.r4.model.CodeableConcept();
		devicedefinitioncapability.addDescription(devicedefinitioncapabilitydescription);

		/******************** devicedefinitioncapabilitydescriptioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicedefinitioncapabilitydescriptioncoding =  new org.hl7.fhir.r4.model.Coding();
		devicedefinitioncapabilitydescription.addCoding(devicedefinitioncapabilitydescriptioncoding);

		/******************** DvcDfn_Capblty_Dscrptn_Cdg_Cd ********************************************************************************/
		if(d.getDvcDfnCapbltyDscrptnCdgCd() != null) {
			devicedefinitioncapabilitydescriptioncoding.setCode(d.getDvcDfnCapbltyDscrptnCdgCd());
		}
		/******************** DvcDfn_Capblty_Dscrptn_Cdg_Dsply ********************************************************************************/
		if(d.getDvcDfnCapbltyDscrptnCdgDsply() != null) {
			devicedefinitioncapabilitydescriptioncoding.setDisplay(d.getDvcDfnCapbltyDscrptnCdgDsply());
		}
		/******************** DvcDfn_Capblty_Dscrptn_Cdg_Sys ********************************************************************************/
		if(d.getDvcDfnCapbltyDscrptnCdgSys() != null) {
			devicedefinitioncapabilitydescriptioncoding.setSystem(d.getDvcDfnCapbltyDscrptnCdgSys());
		}
		/******************** DvcDfn_Capblty_Dscrptn_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcDfnCapbltyDscrptnCdgUsrSltd() != null) {
			devicedefinitioncapabilitydescriptioncoding.setUserSelected(Boolean.parseBoolean(d.getDvcDfnCapbltyDscrptnCdgUsrSltd()));
		}
		/******************** DvcDfn_Capblty_Dscrptn_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcDfnCapbltyDscrptnCdgVrsn() != null) {
			devicedefinitioncapabilitydescriptioncoding.setVersion(d.getDvcDfnCapbltyDscrptnCdgVrsn());
		}
		/******************** DvcDfn_Capblty_Dscrptn_Txt ********************************************************************************/
		if(d.getDvcDfnCapbltyDscrptnTxt() != null) {
			devicedefinitioncapabilitydescription.setText(d.getDvcDfnCapbltyDscrptnTxt());
		}
		/******************** devicedefinitioncapabilitytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicedefinitioncapabilitytype =  new org.hl7.fhir.r4.model.CodeableConcept();
		devicedefinitioncapability.setType(devicedefinitioncapabilitytype);

		/******************** devicedefinitioncapabilitytypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicedefinitioncapabilitytypecoding =  new org.hl7.fhir.r4.model.Coding();
		devicedefinitioncapabilitytype.addCoding(devicedefinitioncapabilitytypecoding);

		/******************** DvcDfn_Capblty_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDvcDfnCapbltyTypCdgCd() != null) {
			devicedefinitioncapabilitytypecoding.setCode(d.getDvcDfnCapbltyTypCdgCd());
		}
		/******************** DvcDfn_Capblty_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDvcDfnCapbltyTypCdgDsply() != null) {
			devicedefinitioncapabilitytypecoding.setDisplay(d.getDvcDfnCapbltyTypCdgDsply());
		}
		/******************** DvcDfn_Capblty_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDvcDfnCapbltyTypCdgSys() != null) {
			devicedefinitioncapabilitytypecoding.setSystem(d.getDvcDfnCapbltyTypCdgSys());
		}
		/******************** DvcDfn_Capblty_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcDfnCapbltyTypCdgUsrSltd() != null) {
			devicedefinitioncapabilitytypecoding.setUserSelected(Boolean.parseBoolean(d.getDvcDfnCapbltyTypCdgUsrSltd()));
		}
		/******************** DvcDfn_Capblty_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcDfnCapbltyTypCdgVrsn() != null) {
			devicedefinitioncapabilitytypecoding.setVersion(d.getDvcDfnCapbltyTypCdgVrsn());
		}
		/******************** DvcDfn_Capblty_Typ_Txt ********************************************************************************/
		if(d.getDvcDfnCapbltyTypTxt() != null) {
			devicedefinitioncapabilitytype.setText(d.getDvcDfnCapbltyTypTxt());
		}
		/******************** devicedefinitioncontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint devicedefinitioncontact =  new org.hl7.fhir.r4.model.ContactPoint();
		devicedefinition.addContact(devicedefinitioncontact);

		/******************** devicedefinitioncontactperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period devicedefinitioncontactperiod =  new org.hl7.fhir.r4.model.Period();
		devicedefinitioncontact.setPeriod(devicedefinitioncontactperiod);

		/******************** DvcDfn_Cntct_Prd_End ********************************************************************************/
		if(d.getDvcDfnCntctPrdEnd() != null) {
			java.text.SimpleDateFormat DvcDfn_Cntct_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DvcDfn_Cntct_Prd_Enddate = DvcDfn_Cntct_Prd_Endsdf.parse(d.getDvcDfnCntctPrdEnd());
			devicedefinitioncontactperiod.setEnd(DvcDfn_Cntct_Prd_Enddate);
		}
		/******************** DvcDfn_Cntct_Prd_Strt ********************************************************************************/
		if(d.getDvcDfnCntctPrdStrt() != null) {
			java.text.SimpleDateFormat DvcDfn_Cntct_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DvcDfn_Cntct_Prd_Strtdate = DvcDfn_Cntct_Prd_Strtsdf.parse(d.getDvcDfnCntctPrdStrt());
			devicedefinitioncontactperiod.setStart(DvcDfn_Cntct_Prd_Strtdate);
		}
		/******************** DvcDfn_Cntct_Rnk ********************************************************************************/
		if(d.getDvcDfnCntctRnk() != null) {
			devicedefinitioncontact.setRank(Integer.parseInt(d.getDvcDfnCntctRnk()));
		}
		/******************** devicedefinitioncontactsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory devicedefinitioncontactsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		devicedefinitioncontact.setSystem(devicedefinitioncontactsystem.fromCode(d.getDvcDfnCntctSys()));

		/******************** devicedefinitioncontactuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory devicedefinitioncontactuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		devicedefinitioncontact.setUse(devicedefinitioncontactuse.fromCode(d.getDvcDfnCntctUse()));

		/******************** DvcDfn_Cntct_Vl ********************************************************************************/
		if(d.getDvcDfnCntctVl() != null) {
			devicedefinitioncontact.setValue(d.getDvcDfnCntctVl());
		}
		/******************** devicedefinitiondevicename ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionDeviceNameComponent devicedefinitiondevicename =  new org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionDeviceNameComponent();
		devicedefinition.addDeviceName(devicedefinitiondevicename);

		/******************** DvcDfn_DvcNm_Nm ********************************************************************************/
		if(d.getDvcDfnDvcNmNm() != null) {
			devicedefinitiondevicename.setName(d.getDvcDfnDvcNmNm());
		}
		/******************** devicedefinitiondevicenametype ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceDefinition.DeviceNameTypeEnumFactory devicedefinitiondevicenametype =  new org.hl7.fhir.r4.model.DeviceDefinition.DeviceNameTypeEnumFactory();
		devicedefinitiondevicename.setType(devicedefinitiondevicenametype.fromCode(d.getDvcDfnDvcNmTyp()));

		/******************** devicedefinitionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier devicedefinitionidentifier =  new org.hl7.fhir.r4.model.Identifier();
		devicedefinition.addIdentifier(devicedefinitionidentifier);

		/******************** DvcDfn_Id_Assigner ********************************************************************************/
		if(d.getDvcDfnIdAssigner() != null) {
			devicedefinitionidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(d.getDvcDfnIdAssigner()));
		}
		/******************** devicedefinitionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period devicedefinitionidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		devicedefinitionidentifier.setPeriod(devicedefinitionidentifierperiod);

		/******************** DvcDfn_Id_Prd_End ********************************************************************************/
		if(d.getDvcDfnIdPrdEnd() != null) {
			java.text.SimpleDateFormat DvcDfn_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DvcDfn_Id_Prd_Enddate = DvcDfn_Id_Prd_Endsdf.parse(d.getDvcDfnIdPrdEnd());
			devicedefinitionidentifierperiod.setEnd(DvcDfn_Id_Prd_Enddate);
		}
		/******************** DvcDfn_Id_Prd_Strt ********************************************************************************/
		if(d.getDvcDfnIdPrdStrt() != null) {
			java.text.SimpleDateFormat DvcDfn_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DvcDfn_Id_Prd_Strtdate = DvcDfn_Id_Prd_Strtsdf.parse(d.getDvcDfnIdPrdStrt());
			devicedefinitionidentifierperiod.setStart(DvcDfn_Id_Prd_Strtdate);
		}
		/******************** DvcDfn_Id_Sys ********************************************************************************/
		if(d.getDvcDfnIdSys() != null) {
			devicedefinitionidentifier.setSystem(d.getDvcDfnIdSys());
		}
		/******************** devicedefinitionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicedefinitionidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		devicedefinitionidentifier.setType(devicedefinitionidentifiertype);

		/******************** devicedefinitionidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicedefinitionidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		devicedefinitionidentifiertype.addCoding(devicedefinitionidentifiertypecoding);

		/******************** DvcDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDvcDfnIdTypCdgCd() != null) {
			devicedefinitionidentifiertypecoding.setCode(d.getDvcDfnIdTypCdgCd());
		}
		/******************** DvcDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDvcDfnIdTypCdgDsply() != null) {
			devicedefinitionidentifiertypecoding.setDisplay(d.getDvcDfnIdTypCdgDsply());
		}
		/******************** DvcDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDvcDfnIdTypCdgSys() != null) {
			devicedefinitionidentifiertypecoding.setSystem(d.getDvcDfnIdTypCdgSys());
		}
		/******************** DvcDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcDfnIdTypCdgUsrSltd() != null) {
			devicedefinitionidentifiertypecoding.setUserSelected(Boolean.parseBoolean(d.getDvcDfnIdTypCdgUsrSltd()));
		}
		/******************** DvcDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcDfnIdTypCdgVrsn() != null) {
			devicedefinitionidentifiertypecoding.setVersion(d.getDvcDfnIdTypCdgVrsn());
		}
		/******************** DvcDfn_Id_Typ_Txt ********************************************************************************/
		if(d.getDvcDfnIdTypTxt() != null) {
			devicedefinitionidentifiertype.setText(d.getDvcDfnIdTypTxt());
		}
		/******************** devicedefinitionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory devicedefinitionidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		devicedefinitionidentifier.setUse(devicedefinitionidentifieruse.fromCode(d.getDvcDfnIdUse()));

		/******************** DvcDfn_Id_Vl ********************************************************************************/
		if(d.getDvcDfnIdVl() != null) {
			devicedefinitionidentifier.setValue(d.getDvcDfnIdVl());
		}
		/******************** devicedefinitionlanguagecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicedefinitionlanguagecode =  new org.hl7.fhir.r4.model.CodeableConcept();
		devicedefinition.addLanguageCode(devicedefinitionlanguagecode);

		/******************** devicedefinitionlanguagecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicedefinitionlanguagecodecoding =  new org.hl7.fhir.r4.model.Coding();
		devicedefinitionlanguagecode.addCoding(devicedefinitionlanguagecodecoding);

		/******************** DvcDfn_LnguageCd_Cdg_Cd ********************************************************************************/
		if(d.getDvcDfnLnguageCdCdgCd() != null) {
			devicedefinitionlanguagecodecoding.setCode(d.getDvcDfnLnguageCdCdgCd());
		}
		/******************** DvcDfn_LnguageCd_Cdg_Dsply ********************************************************************************/
		if(d.getDvcDfnLnguageCdCdgDsply() != null) {
			devicedefinitionlanguagecodecoding.setDisplay(d.getDvcDfnLnguageCdCdgDsply());
		}
		/******************** DvcDfn_LnguageCd_Cdg_Sys ********************************************************************************/
		if(d.getDvcDfnLnguageCdCdgSys() != null) {
			devicedefinitionlanguagecodecoding.setSystem(d.getDvcDfnLnguageCdCdgSys());
		}
		/******************** DvcDfn_LnguageCd_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcDfnLnguageCdCdgUsrSltd() != null) {
			devicedefinitionlanguagecodecoding.setUserSelected(Boolean.parseBoolean(d.getDvcDfnLnguageCdCdgUsrSltd()));
		}
		/******************** DvcDfn_LnguageCd_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcDfnLnguageCdCdgVrsn() != null) {
			devicedefinitionlanguagecodecoding.setVersion(d.getDvcDfnLnguageCdCdgVrsn());
		}
		/******************** DvcDfn_LnguageCd_Txt ********************************************************************************/
		if(d.getDvcDfnLnguageCdTxt() != null) {
			devicedefinitionlanguagecode.setText(d.getDvcDfnLnguageCdTxt());
		}
		/******************** DvcDfn_ManufacturerRfrnc ********************************************************************************/
		if(d.getDvcDfnManufacturerRfrnc() != null) {
			devicedefinition.setManufacturer( new org.hl7.fhir.r4.model.Reference(d.getDvcDfnManufacturerRfrnc()));
		}
		/******************** DvcDfn_ManufacturerStrgTyp ********************************************************************************/
		if(d.getDvcDfnManufacturerStrgTyp() != null) {
			devicedefinition.setManufacturer( new org.hl7.fhir.r4.model.StringType(d.getDvcDfnManufacturerStrgTyp()));
		}
		/******************** devicedefinitionmaterial ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionMaterialComponent devicedefinitionmaterial =  new org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionMaterialComponent();
		devicedefinition.addMaterial(devicedefinitionmaterial);

		/******************** DvcDfn_Mtrl_AllergenicIndicator ********************************************************************************/
		if(d.getDvcDfnMtrlAllergenicIndicator() != null) {
			devicedefinitionmaterial.setAllergenicIndicator(Boolean.parseBoolean(d.getDvcDfnMtrlAllergenicIndicator()));
		}
		/******************** DvcDfn_Mtrl_Alternate ********************************************************************************/
		if(d.getDvcDfnMtrlAlternate() != null) {
			devicedefinitionmaterial.setAlternate(Boolean.parseBoolean(d.getDvcDfnMtrlAlternate()));
		}
		/******************** devicedefinitionmaterialsubstance ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicedefinitionmaterialsubstance =  new org.hl7.fhir.r4.model.CodeableConcept();
		devicedefinitionmaterial.setSubstance(devicedefinitionmaterialsubstance);

		/******************** devicedefinitionmaterialsubstancecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicedefinitionmaterialsubstancecoding =  new org.hl7.fhir.r4.model.Coding();
		devicedefinitionmaterialsubstance.addCoding(devicedefinitionmaterialsubstancecoding);

		/******************** DvcDfn_Mtrl_Sbstnc_Cdg_Cd ********************************************************************************/
		if(d.getDvcDfnMtrlSbstncCdgCd() != null) {
			devicedefinitionmaterialsubstancecoding.setCode(d.getDvcDfnMtrlSbstncCdgCd());
		}
		/******************** DvcDfn_Mtrl_Sbstnc_Cdg_Dsply ********************************************************************************/
		if(d.getDvcDfnMtrlSbstncCdgDsply() != null) {
			devicedefinitionmaterialsubstancecoding.setDisplay(d.getDvcDfnMtrlSbstncCdgDsply());
		}
		/******************** DvcDfn_Mtrl_Sbstnc_Cdg_Sys ********************************************************************************/
		if(d.getDvcDfnMtrlSbstncCdgSys() != null) {
			devicedefinitionmaterialsubstancecoding.setSystem(d.getDvcDfnMtrlSbstncCdgSys());
		}
		/******************** DvcDfn_Mtrl_Sbstnc_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcDfnMtrlSbstncCdgUsrSltd() != null) {
			devicedefinitionmaterialsubstancecoding.setUserSelected(Boolean.parseBoolean(d.getDvcDfnMtrlSbstncCdgUsrSltd()));
		}
		/******************** DvcDfn_Mtrl_Sbstnc_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcDfnMtrlSbstncCdgVrsn() != null) {
			devicedefinitionmaterialsubstancecoding.setVersion(d.getDvcDfnMtrlSbstncCdgVrsn());
		}
		/******************** DvcDfn_Mtrl_Sbstnc_Txt ********************************************************************************/
		if(d.getDvcDfnMtrlSbstncTxt() != null) {
			devicedefinitionmaterialsubstance.setText(d.getDvcDfnMtrlSbstncTxt());
		}
		/******************** DvcDfn_ModelNmbr ********************************************************************************/
		if(d.getDvcDfnModelNmbr() != null) {
			devicedefinition.setModelNumber(d.getDvcDfnModelNmbr());
		}
		/******************** devicedefinitionnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation devicedefinitionnote =  new org.hl7.fhir.r4.model.Annotation();
		devicedefinition.addNote(devicedefinitionnote);

		/******************** DvcDfn_Nt_AthrRfrnc ********************************************************************************/
		if(d.getDvcDfnNtAthrRfrnc() != null) {
			devicedefinitionnote.setAuthor( new org.hl7.fhir.r4.model.Reference(d.getDvcDfnNtAthrRfrnc()));
		}
		/******************** DvcDfn_Nt_AthrStrgTyp ********************************************************************************/
		if(d.getDvcDfnNtAthrStrgTyp() != null) {
			devicedefinitionnote.setAuthor( new org.hl7.fhir.r4.model.StringType(d.getDvcDfnNtAthrStrgTyp()));
		}
		/******************** DvcDfn_Nt_Txt ********************************************************************************/
		if(d.getDvcDfnNtTxt() != null) {
			devicedefinitionnote.setText(d.getDvcDfnNtTxt());
		}
		/******************** DvcDfn_Nt_Time ********************************************************************************/
		if(d.getDvcDfnNtTime() != null) {
			java.text.SimpleDateFormat DvcDfn_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DvcDfn_Nt_Timedate = DvcDfn_Nt_Timesdf.parse(d.getDvcDfnNtTime());
			devicedefinitionnote.setTime(DvcDfn_Nt_Timedate);
		}
		/******************** DvcDfn_OnlineInfo ********************************************************************************/
		if(d.getDvcDfnOnlineInfo() != null) {
			devicedefinition.setOnlineInformation(d.getDvcDfnOnlineInfo());
		}
		/******************** DvcDfn_Owner ********************************************************************************/
		if(d.getDvcDfnOwner() != null) {
			devicedefinition.setOwner( new org.hl7.fhir.r4.model.Reference(d.getDvcDfnOwner()));
		}
		/******************** DvcDfn_ParentDvc ********************************************************************************/
		if(d.getDvcDfnParentDvc() != null) {
			devicedefinition.setParentDevice( new org.hl7.fhir.r4.model.Reference(d.getDvcDfnParentDvc()));
		}
		/******************** devicedefinitionphysicalcharacteristics ********************************************************************************/
		org.hl7.fhir.r4.model.ProdCharacteristic devicedefinitionphysicalcharacteristics =  new org.hl7.fhir.r4.model.ProdCharacteristic();
		devicedefinition.setPhysicalCharacteristics(devicedefinitionphysicalcharacteristics);

		/******************** DvcDfn_PhysclCrctrstcs_Color ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsColor() != null) {
			devicedefinitionphysicalcharacteristics.addColor(d.getDvcDfnPhysclCrctrstcsColor());
		}
		/******************** devicedefinitionphysicalcharacteristicsdepth ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicedefinitionphysicalcharacteristicsdepth =  new org.hl7.fhir.r4.model.Quantity();
		devicedefinitionphysicalcharacteristics.setDepth(devicedefinitionphysicalcharacteristicsdepth);

		/******************** DvcDfn_PhysclCrctrstcs_Depth_Cd ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsDepthCd() != null) {
			devicedefinitionphysicalcharacteristicsdepth.setCode(d.getDvcDfnPhysclCrctrstcsDepthCd());
		}
		/******************** devicedefinitionphysicalcharacteristicsdepthcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory devicedefinitionphysicalcharacteristicsdepthcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		devicedefinitionphysicalcharacteristicsdepth.setComparator(devicedefinitionphysicalcharacteristicsdepthcomparator.fromCode(d.getDvcDfnPhysclCrctrstcsDepthCmprtr()));

		/******************** DvcDfn_PhysclCrctrstcs_Depth_Sys ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsDepthSys() != null) {
			devicedefinitionphysicalcharacteristicsdepth.setSystem(d.getDvcDfnPhysclCrctrstcsDepthSys());
		}
		/******************** DvcDfn_PhysclCrctrstcs_Depth_Unt ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsDepthUnt() != null) {
			devicedefinitionphysicalcharacteristicsdepth.setUnit(d.getDvcDfnPhysclCrctrstcsDepthUnt());
		}
		/******************** DvcDfn_PhysclCrctrstcs_Depth_Vl ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsDepthVl() != null) {
			devicedefinitionphysicalcharacteristicsdepth.setValue(Double.parseDouble((d.getDvcDfnPhysclCrctrstcsDepthVl())));
		}
		/******************** devicedefinitionphysicalcharacteristicsexternaldiameter ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicedefinitionphysicalcharacteristicsexternaldiameter =  new org.hl7.fhir.r4.model.Quantity();
		devicedefinitionphysicalcharacteristics.setExternalDiameter(devicedefinitionphysicalcharacteristicsexternaldiameter);

		/******************** DvcDfn_PhysclCrctrstcs_ExternalDiameter_Cd ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsExternalDiameterCd() != null) {
			devicedefinitionphysicalcharacteristicsexternaldiameter.setCode(d.getDvcDfnPhysclCrctrstcsExternalDiameterCd());
		}
		/******************** devicedefinitionphysicalcharacteristicsexternaldiametercomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory devicedefinitionphysicalcharacteristicsexternaldiametercomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		devicedefinitionphysicalcharacteristicsexternaldiameter.setComparator(devicedefinitionphysicalcharacteristicsexternaldiametercomparator.fromCode(d.getDvcDfnPhysclCrctrstcsExternalDiameterCmprtr()));

		/******************** DvcDfn_PhysclCrctrstcs_ExternalDiameter_Sys ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsExternalDiameterSys() != null) {
			devicedefinitionphysicalcharacteristicsexternaldiameter.setSystem(d.getDvcDfnPhysclCrctrstcsExternalDiameterSys());
		}
		/******************** DvcDfn_PhysclCrctrstcs_ExternalDiameter_Unt ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsExternalDiameterUnt() != null) {
			devicedefinitionphysicalcharacteristicsexternaldiameter.setUnit(d.getDvcDfnPhysclCrctrstcsExternalDiameterUnt());
		}
		/******************** DvcDfn_PhysclCrctrstcs_ExternalDiameter_Vl ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsExternalDiameterVl() != null) {
			devicedefinitionphysicalcharacteristicsexternaldiameter.setValue(Double.parseDouble((d.getDvcDfnPhysclCrctrstcsExternalDiameterVl())));
		}
		/******************** devicedefinitionphysicalcharacteristicsheight ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicedefinitionphysicalcharacteristicsheight =  new org.hl7.fhir.r4.model.Quantity();
		devicedefinitionphysicalcharacteristics.setHeight(devicedefinitionphysicalcharacteristicsheight);

		/******************** DvcDfn_PhysclCrctrstcs_Height_Cd ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsHeightCd() != null) {
			devicedefinitionphysicalcharacteristicsheight.setCode(d.getDvcDfnPhysclCrctrstcsHeightCd());
		}
		/******************** devicedefinitionphysicalcharacteristicsheightcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory devicedefinitionphysicalcharacteristicsheightcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		devicedefinitionphysicalcharacteristicsheight.setComparator(devicedefinitionphysicalcharacteristicsheightcomparator.fromCode(d.getDvcDfnPhysclCrctrstcsHeightCmprtr()));

		/******************** DvcDfn_PhysclCrctrstcs_Height_Sys ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsHeightSys() != null) {
			devicedefinitionphysicalcharacteristicsheight.setSystem(d.getDvcDfnPhysclCrctrstcsHeightSys());
		}
		/******************** DvcDfn_PhysclCrctrstcs_Height_Unt ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsHeightUnt() != null) {
			devicedefinitionphysicalcharacteristicsheight.setUnit(d.getDvcDfnPhysclCrctrstcsHeightUnt());
		}
		/******************** DvcDfn_PhysclCrctrstcs_Height_Vl ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsHeightVl() != null) {
			devicedefinitionphysicalcharacteristicsheight.setValue(Double.parseDouble((d.getDvcDfnPhysclCrctrstcsHeightVl())));
		}
		/******************** devicedefinitionphysicalcharacteristicsimage ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment devicedefinitionphysicalcharacteristicsimage =  new org.hl7.fhir.r4.model.Attachment();
		devicedefinitionphysicalcharacteristics.addImage(devicedefinitionphysicalcharacteristicsimage);

		/******************** DvcDfn_PhysclCrctrstcs_Image_CntntTyp ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsImageCntntTyp() != null) {
			devicedefinitionphysicalcharacteristicsimage.setContentType(d.getDvcDfnPhysclCrctrstcsImageCntntTyp());
		}
		/******************** DvcDfn_PhysclCrctrstcs_Image_Creation ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsImageCreation() != null) {
			java.text.SimpleDateFormat DvcDfn_PhysclCrctrstcs_Image_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DvcDfn_PhysclCrctrstcs_Image_Creationdate = DvcDfn_PhysclCrctrstcs_Image_Creationsdf.parse(d.getDvcDfnPhysclCrctrstcsImageCreation());
			devicedefinitionphysicalcharacteristicsimage.setCreation(DvcDfn_PhysclCrctrstcs_Image_Creationdate);
		}
		/******************** DvcDfn_PhysclCrctrstcs_Image_Data ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsImageData() != null) {
			devicedefinitionphysicalcharacteristicsimage.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(d.getDvcDfnPhysclCrctrstcsImageData()));
		}
		/******************** DvcDfn_PhysclCrctrstcs_Image_Hash ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsImageHash() != null) {
			devicedefinitionphysicalcharacteristicsimage.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(d.getDvcDfnPhysclCrctrstcsImageHash()));
		}
		/******************** DvcDfn_PhysclCrctrstcs_Image_Lnguage ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsImageLnguage() != null) {
			devicedefinitionphysicalcharacteristicsimage.setLanguage(d.getDvcDfnPhysclCrctrstcsImageLnguage());
		}
		/******************** DvcDfn_PhysclCrctrstcs_Image_Sz ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsImageSz() != null) {
			devicedefinitionphysicalcharacteristicsimage.setSize(Integer.parseInt(d.getDvcDfnPhysclCrctrstcsImageSz()));
		}
		/******************** DvcDfn_PhysclCrctrstcs_Image_Ttl ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsImageTtl() != null) {
			devicedefinitionphysicalcharacteristicsimage.setTitle(d.getDvcDfnPhysclCrctrstcsImageTtl());
		}
		/******************** DvcDfn_PhysclCrctrstcs_Image_Url ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsImageUrl() != null) {
			devicedefinitionphysicalcharacteristicsimage.setUrl(d.getDvcDfnPhysclCrctrstcsImageUrl());
		}
		/******************** DvcDfn_PhysclCrctrstcs_Imprint ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsImprint() != null) {
			devicedefinitionphysicalcharacteristics.addImprint(d.getDvcDfnPhysclCrctrstcsImprint());
		}
		/******************** devicedefinitionphysicalcharacteristicsnominalvolume ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicedefinitionphysicalcharacteristicsnominalvolume =  new org.hl7.fhir.r4.model.Quantity();
		devicedefinitionphysicalcharacteristics.setNominalVolume(devicedefinitionphysicalcharacteristicsnominalvolume);

		/******************** DvcDfn_PhysclCrctrstcs_NominalVolume_Cd ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsNominalVolumeCd() != null) {
			devicedefinitionphysicalcharacteristicsnominalvolume.setCode(d.getDvcDfnPhysclCrctrstcsNominalVolumeCd());
		}
		/******************** devicedefinitionphysicalcharacteristicsnominalvolumecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory devicedefinitionphysicalcharacteristicsnominalvolumecomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		devicedefinitionphysicalcharacteristicsnominalvolume.setComparator(devicedefinitionphysicalcharacteristicsnominalvolumecomparator.fromCode(d.getDvcDfnPhysclCrctrstcsNominalVolumeCmprtr()));

		/******************** DvcDfn_PhysclCrctrstcs_NominalVolume_Sys ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsNominalVolumeSys() != null) {
			devicedefinitionphysicalcharacteristicsnominalvolume.setSystem(d.getDvcDfnPhysclCrctrstcsNominalVolumeSys());
		}
		/******************** DvcDfn_PhysclCrctrstcs_NominalVolume_Unt ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsNominalVolumeUnt() != null) {
			devicedefinitionphysicalcharacteristicsnominalvolume.setUnit(d.getDvcDfnPhysclCrctrstcsNominalVolumeUnt());
		}
		/******************** DvcDfn_PhysclCrctrstcs_NominalVolume_Vl ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsNominalVolumeVl() != null) {
			devicedefinitionphysicalcharacteristicsnominalvolume.setValue(Double.parseDouble((d.getDvcDfnPhysclCrctrstcsNominalVolumeVl())));
		}
		/******************** devicedefinitionphysicalcharacteristicsscoring ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicedefinitionphysicalcharacteristicsscoring =  new org.hl7.fhir.r4.model.CodeableConcept();
		devicedefinitionphysicalcharacteristics.setScoring(devicedefinitionphysicalcharacteristicsscoring);

		/******************** devicedefinitionphysicalcharacteristicsscoringcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicedefinitionphysicalcharacteristicsscoringcoding =  new org.hl7.fhir.r4.model.Coding();
		devicedefinitionphysicalcharacteristicsscoring.addCoding(devicedefinitionphysicalcharacteristicsscoringcoding);

		/******************** DvcDfn_PhysclCrctrstcs_Scoring_Cdg_Cd ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsScoringCdgCd() != null) {
			devicedefinitionphysicalcharacteristicsscoringcoding.setCode(d.getDvcDfnPhysclCrctrstcsScoringCdgCd());
		}
		/******************** DvcDfn_PhysclCrctrstcs_Scoring_Cdg_Dsply ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsScoringCdgDsply() != null) {
			devicedefinitionphysicalcharacteristicsscoringcoding.setDisplay(d.getDvcDfnPhysclCrctrstcsScoringCdgDsply());
		}
		/******************** DvcDfn_PhysclCrctrstcs_Scoring_Cdg_Sys ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsScoringCdgSys() != null) {
			devicedefinitionphysicalcharacteristicsscoringcoding.setSystem(d.getDvcDfnPhysclCrctrstcsScoringCdgSys());
		}
		/******************** DvcDfn_PhysclCrctrstcs_Scoring_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsScoringCdgUsrSltd() != null) {
			devicedefinitionphysicalcharacteristicsscoringcoding.setUserSelected(Boolean.parseBoolean(d.getDvcDfnPhysclCrctrstcsScoringCdgUsrSltd()));
		}
		/******************** DvcDfn_PhysclCrctrstcs_Scoring_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsScoringCdgVrsn() != null) {
			devicedefinitionphysicalcharacteristicsscoringcoding.setVersion(d.getDvcDfnPhysclCrctrstcsScoringCdgVrsn());
		}
		/******************** DvcDfn_PhysclCrctrstcs_Scoring_Txt ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsScoringTxt() != null) {
			devicedefinitionphysicalcharacteristicsscoring.setText(d.getDvcDfnPhysclCrctrstcsScoringTxt());
		}
		/******************** DvcDfn_PhysclCrctrstcs_Shape ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsShape() != null) {
			devicedefinitionphysicalcharacteristics.setShape(d.getDvcDfnPhysclCrctrstcsShape());
		}
		/******************** devicedefinitionphysicalcharacteristicsweight ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicedefinitionphysicalcharacteristicsweight =  new org.hl7.fhir.r4.model.Quantity();
		devicedefinitionphysicalcharacteristics.setWeight(devicedefinitionphysicalcharacteristicsweight);

		/******************** DvcDfn_PhysclCrctrstcs_Wght_Cd ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsWghtCd() != null) {
			devicedefinitionphysicalcharacteristicsweight.setCode(d.getDvcDfnPhysclCrctrstcsWghtCd());
		}
		/******************** devicedefinitionphysicalcharacteristicsweightcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory devicedefinitionphysicalcharacteristicsweightcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		devicedefinitionphysicalcharacteristicsweight.setComparator(devicedefinitionphysicalcharacteristicsweightcomparator.fromCode(d.getDvcDfnPhysclCrctrstcsWghtCmprtr()));

		/******************** DvcDfn_PhysclCrctrstcs_Wght_Sys ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsWghtSys() != null) {
			devicedefinitionphysicalcharacteristicsweight.setSystem(d.getDvcDfnPhysclCrctrstcsWghtSys());
		}
		/******************** DvcDfn_PhysclCrctrstcs_Wght_Unt ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsWghtUnt() != null) {
			devicedefinitionphysicalcharacteristicsweight.setUnit(d.getDvcDfnPhysclCrctrstcsWghtUnt());
		}
		/******************** DvcDfn_PhysclCrctrstcs_Wght_Vl ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsWghtVl() != null) {
			devicedefinitionphysicalcharacteristicsweight.setValue(Double.parseDouble((d.getDvcDfnPhysclCrctrstcsWghtVl())));
		}
		/******************** devicedefinitionphysicalcharacteristicswidth ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicedefinitionphysicalcharacteristicswidth =  new org.hl7.fhir.r4.model.Quantity();
		devicedefinitionphysicalcharacteristics.setWidth(devicedefinitionphysicalcharacteristicswidth);

		/******************** DvcDfn_PhysclCrctrstcs_Width_Cd ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsWidthCd() != null) {
			devicedefinitionphysicalcharacteristicswidth.setCode(d.getDvcDfnPhysclCrctrstcsWidthCd());
		}
		/******************** devicedefinitionphysicalcharacteristicswidthcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory devicedefinitionphysicalcharacteristicswidthcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		devicedefinitionphysicalcharacteristicswidth.setComparator(devicedefinitionphysicalcharacteristicswidthcomparator.fromCode(d.getDvcDfnPhysclCrctrstcsWidthCmprtr()));

		/******************** DvcDfn_PhysclCrctrstcs_Width_Sys ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsWidthSys() != null) {
			devicedefinitionphysicalcharacteristicswidth.setSystem(d.getDvcDfnPhysclCrctrstcsWidthSys());
		}
		/******************** DvcDfn_PhysclCrctrstcs_Width_Unt ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsWidthUnt() != null) {
			devicedefinitionphysicalcharacteristicswidth.setUnit(d.getDvcDfnPhysclCrctrstcsWidthUnt());
		}
		/******************** DvcDfn_PhysclCrctrstcs_Width_Vl ********************************************************************************/
		if(d.getDvcDfnPhysclCrctrstcsWidthVl() != null) {
			devicedefinitionphysicalcharacteristicswidth.setValue(Double.parseDouble((d.getDvcDfnPhysclCrctrstcsWidthVl())));
		}
		/******************** devicedefinitionproperty ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionPropertyComponent devicedefinitionproperty =  new org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionPropertyComponent();
		devicedefinition.addProperty(devicedefinitionproperty);

		/******************** devicedefinitionpropertytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicedefinitionpropertytype =  new org.hl7.fhir.r4.model.CodeableConcept();
		devicedefinitionproperty.setType(devicedefinitionpropertytype);

		/******************** devicedefinitionpropertytypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicedefinitionpropertytypecoding =  new org.hl7.fhir.r4.model.Coding();
		devicedefinitionpropertytype.addCoding(devicedefinitionpropertytypecoding);

		/******************** DvcDfn_Prpty_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDvcDfnPrptyTypCdgCd() != null) {
			devicedefinitionpropertytypecoding.setCode(d.getDvcDfnPrptyTypCdgCd());
		}
		/******************** DvcDfn_Prpty_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDvcDfnPrptyTypCdgDsply() != null) {
			devicedefinitionpropertytypecoding.setDisplay(d.getDvcDfnPrptyTypCdgDsply());
		}
		/******************** DvcDfn_Prpty_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDvcDfnPrptyTypCdgSys() != null) {
			devicedefinitionpropertytypecoding.setSystem(d.getDvcDfnPrptyTypCdgSys());
		}
		/******************** DvcDfn_Prpty_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcDfnPrptyTypCdgUsrSltd() != null) {
			devicedefinitionpropertytypecoding.setUserSelected(Boolean.parseBoolean(d.getDvcDfnPrptyTypCdgUsrSltd()));
		}
		/******************** DvcDfn_Prpty_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcDfnPrptyTypCdgVrsn() != null) {
			devicedefinitionpropertytypecoding.setVersion(d.getDvcDfnPrptyTypCdgVrsn());
		}
		/******************** DvcDfn_Prpty_Typ_Txt ********************************************************************************/
		if(d.getDvcDfnPrptyTypTxt() != null) {
			devicedefinitionpropertytype.setText(d.getDvcDfnPrptyTypTxt());
		}
		/******************** devicedefinitionpropertyvaluecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicedefinitionpropertyvaluecode =  new org.hl7.fhir.r4.model.CodeableConcept();
		devicedefinitionproperty.addValueCode(devicedefinitionpropertyvaluecode);

		/******************** devicedefinitionpropertyvaluecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicedefinitionpropertyvaluecodecoding =  new org.hl7.fhir.r4.model.Coding();
		devicedefinitionpropertyvaluecode.addCoding(devicedefinitionpropertyvaluecodecoding);

		/******************** DvcDfn_Prpty_VlCd_Cdg_Cd ********************************************************************************/
		if(d.getDvcDfnPrptyVlCdCdgCd() != null) {
			devicedefinitionpropertyvaluecodecoding.setCode(d.getDvcDfnPrptyVlCdCdgCd());
		}
		/******************** DvcDfn_Prpty_VlCd_Cdg_Dsply ********************************************************************************/
		if(d.getDvcDfnPrptyVlCdCdgDsply() != null) {
			devicedefinitionpropertyvaluecodecoding.setDisplay(d.getDvcDfnPrptyVlCdCdgDsply());
		}
		/******************** DvcDfn_Prpty_VlCd_Cdg_Sys ********************************************************************************/
		if(d.getDvcDfnPrptyVlCdCdgSys() != null) {
			devicedefinitionpropertyvaluecodecoding.setSystem(d.getDvcDfnPrptyVlCdCdgSys());
		}
		/******************** DvcDfn_Prpty_VlCd_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcDfnPrptyVlCdCdgUsrSltd() != null) {
			devicedefinitionpropertyvaluecodecoding.setUserSelected(Boolean.parseBoolean(d.getDvcDfnPrptyVlCdCdgUsrSltd()));
		}
		/******************** DvcDfn_Prpty_VlCd_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcDfnPrptyVlCdCdgVrsn() != null) {
			devicedefinitionpropertyvaluecodecoding.setVersion(d.getDvcDfnPrptyVlCdCdgVrsn());
		}
		/******************** DvcDfn_Prpty_VlCd_Txt ********************************************************************************/
		if(d.getDvcDfnPrptyVlCdTxt() != null) {
			devicedefinitionpropertyvaluecode.setText(d.getDvcDfnPrptyVlCdTxt());
		}
		/******************** devicedefinitionpropertyvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicedefinitionpropertyvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		devicedefinitionproperty.addValueQuantity(devicedefinitionpropertyvaluequantity);

		/******************** DvcDfn_Prpty_VlQnty_Cd ********************************************************************************/
		if(d.getDvcDfnPrptyVlQntyCd() != null) {
			devicedefinitionpropertyvaluequantity.setCode(d.getDvcDfnPrptyVlQntyCd());
		}
		/******************** devicedefinitionpropertyvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory devicedefinitionpropertyvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		devicedefinitionpropertyvaluequantity.setComparator(devicedefinitionpropertyvaluequantitycomparator.fromCode(d.getDvcDfnPrptyVlQntyCmprtr()));

		/******************** DvcDfn_Prpty_VlQnty_Sys ********************************************************************************/
		if(d.getDvcDfnPrptyVlQntySys() != null) {
			devicedefinitionpropertyvaluequantity.setSystem(d.getDvcDfnPrptyVlQntySys());
		}
		/******************** DvcDfn_Prpty_VlQnty_Unt ********************************************************************************/
		if(d.getDvcDfnPrptyVlQntyUnt() != null) {
			devicedefinitionpropertyvaluequantity.setUnit(d.getDvcDfnPrptyVlQntyUnt());
		}
		/******************** DvcDfn_Prpty_VlQnty_Vl ********************************************************************************/
		if(d.getDvcDfnPrptyVlQntyVl() != null) {
			devicedefinitionpropertyvaluequantity.setValue(Double.parseDouble((d.getDvcDfnPrptyVlQntyVl())));
		}
		/******************** devicedefinitionquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicedefinitionquantity =  new org.hl7.fhir.r4.model.Quantity();
		devicedefinition.setQuantity(devicedefinitionquantity);

		/******************** DvcDfn_Qnty_Cd ********************************************************************************/
		if(d.getDvcDfnQntyCd() != null) {
			devicedefinitionquantity.setCode(d.getDvcDfnQntyCd());
		}
		/******************** devicedefinitionquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory devicedefinitionquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		devicedefinitionquantity.setComparator(devicedefinitionquantitycomparator.fromCode(d.getDvcDfnQntyCmprtr()));

		/******************** DvcDfn_Qnty_Sys ********************************************************************************/
		if(d.getDvcDfnQntySys() != null) {
			devicedefinitionquantity.setSystem(d.getDvcDfnQntySys());
		}
		/******************** DvcDfn_Qnty_Unt ********************************************************************************/
		if(d.getDvcDfnQntyUnt() != null) {
			devicedefinitionquantity.setUnit(d.getDvcDfnQntyUnt());
		}
		/******************** DvcDfn_Qnty_Vl ********************************************************************************/
		if(d.getDvcDfnQntyVl() != null) {
			devicedefinitionquantity.setValue(Double.parseDouble((d.getDvcDfnQntyVl())));
		}
		/******************** devicedefinitionsafety ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicedefinitionsafety =  new org.hl7.fhir.r4.model.CodeableConcept();
		devicedefinition.addSafety(devicedefinitionsafety);

		/******************** devicedefinitionsafetycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicedefinitionsafetycoding =  new org.hl7.fhir.r4.model.Coding();
		devicedefinitionsafety.addCoding(devicedefinitionsafetycoding);

		/******************** DvcDfn_Safety_Cdg_Cd ********************************************************************************/
		if(d.getDvcDfnSafetyCdgCd() != null) {
			devicedefinitionsafetycoding.setCode(d.getDvcDfnSafetyCdgCd());
		}
		/******************** DvcDfn_Safety_Cdg_Dsply ********************************************************************************/
		if(d.getDvcDfnSafetyCdgDsply() != null) {
			devicedefinitionsafetycoding.setDisplay(d.getDvcDfnSafetyCdgDsply());
		}
		/******************** DvcDfn_Safety_Cdg_Sys ********************************************************************************/
		if(d.getDvcDfnSafetyCdgSys() != null) {
			devicedefinitionsafetycoding.setSystem(d.getDvcDfnSafetyCdgSys());
		}
		/******************** DvcDfn_Safety_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcDfnSafetyCdgUsrSltd() != null) {
			devicedefinitionsafetycoding.setUserSelected(Boolean.parseBoolean(d.getDvcDfnSafetyCdgUsrSltd()));
		}
		/******************** DvcDfn_Safety_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcDfnSafetyCdgVrsn() != null) {
			devicedefinitionsafetycoding.setVersion(d.getDvcDfnSafetyCdgVrsn());
		}
		/******************** DvcDfn_Safety_Txt ********************************************************************************/
		if(d.getDvcDfnSafetyTxt() != null) {
			devicedefinitionsafety.setText(d.getDvcDfnSafetyTxt());
		}
		/******************** devicedefinitionshelflifestorage ********************************************************************************/
		org.hl7.fhir.r4.model.ProductShelfLife devicedefinitionshelflifestorage =  new org.hl7.fhir.r4.model.ProductShelfLife();
		devicedefinition.addShelfLifeStorage(devicedefinitionshelflifestorage);

		/******************** devicedefinitionshelflifestorageidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier devicedefinitionshelflifestorageidentifier =  new org.hl7.fhir.r4.model.Identifier();
		devicedefinitionshelflifestorage.setIdentifier(devicedefinitionshelflifestorageidentifier);

		/******************** DvcDfn_ShlfLfStrg_Id_Assigner ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgIdAssigner() != null) {
			devicedefinitionshelflifestorageidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(d.getDvcDfnShlfLfStrgIdAssigner()));
		}
		/******************** devicedefinitionshelflifestorageidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period devicedefinitionshelflifestorageidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		devicedefinitionshelflifestorageidentifier.setPeriod(devicedefinitionshelflifestorageidentifierperiod);

		/******************** DvcDfn_ShlfLfStrg_Id_Prd_End ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgIdPrdEnd() != null) {
			java.text.SimpleDateFormat DvcDfn_ShlfLfStrg_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DvcDfn_ShlfLfStrg_Id_Prd_Enddate = DvcDfn_ShlfLfStrg_Id_Prd_Endsdf.parse(d.getDvcDfnShlfLfStrgIdPrdEnd());
			devicedefinitionshelflifestorageidentifierperiod.setEnd(DvcDfn_ShlfLfStrg_Id_Prd_Enddate);
		}
		/******************** DvcDfn_ShlfLfStrg_Id_Prd_Strt ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgIdPrdStrt() != null) {
			java.text.SimpleDateFormat DvcDfn_ShlfLfStrg_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DvcDfn_ShlfLfStrg_Id_Prd_Strtdate = DvcDfn_ShlfLfStrg_Id_Prd_Strtsdf.parse(d.getDvcDfnShlfLfStrgIdPrdStrt());
			devicedefinitionshelflifestorageidentifierperiod.setStart(DvcDfn_ShlfLfStrg_Id_Prd_Strtdate);
		}
		/******************** DvcDfn_ShlfLfStrg_Id_Sys ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgIdSys() != null) {
			devicedefinitionshelflifestorageidentifier.setSystem(d.getDvcDfnShlfLfStrgIdSys());
		}
		/******************** devicedefinitionshelflifestorageidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicedefinitionshelflifestorageidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		devicedefinitionshelflifestorageidentifier.setType(devicedefinitionshelflifestorageidentifiertype);

		/******************** devicedefinitionshelflifestorageidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicedefinitionshelflifestorageidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		devicedefinitionshelflifestorageidentifiertype.addCoding(devicedefinitionshelflifestorageidentifiertypecoding);

		/******************** DvcDfn_ShlfLfStrg_Id_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgIdTypCdgCd() != null) {
			devicedefinitionshelflifestorageidentifiertypecoding.setCode(d.getDvcDfnShlfLfStrgIdTypCdgCd());
		}
		/******************** DvcDfn_ShlfLfStrg_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgIdTypCdgDsply() != null) {
			devicedefinitionshelflifestorageidentifiertypecoding.setDisplay(d.getDvcDfnShlfLfStrgIdTypCdgDsply());
		}
		/******************** DvcDfn_ShlfLfStrg_Id_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgIdTypCdgSys() != null) {
			devicedefinitionshelflifestorageidentifiertypecoding.setSystem(d.getDvcDfnShlfLfStrgIdTypCdgSys());
		}
		/******************** DvcDfn_ShlfLfStrg_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgIdTypCdgUsrSltd() != null) {
			devicedefinitionshelflifestorageidentifiertypecoding.setUserSelected(Boolean.parseBoolean(d.getDvcDfnShlfLfStrgIdTypCdgUsrSltd()));
		}
		/******************** DvcDfn_ShlfLfStrg_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgIdTypCdgVrsn() != null) {
			devicedefinitionshelflifestorageidentifiertypecoding.setVersion(d.getDvcDfnShlfLfStrgIdTypCdgVrsn());
		}
		/******************** DvcDfn_ShlfLfStrg_Id_Typ_Txt ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgIdTypTxt() != null) {
			devicedefinitionshelflifestorageidentifiertype.setText(d.getDvcDfnShlfLfStrgIdTypTxt());
		}
		/******************** devicedefinitionshelflifestorageidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory devicedefinitionshelflifestorageidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		devicedefinitionshelflifestorageidentifier.setUse(devicedefinitionshelflifestorageidentifieruse.fromCode(d.getDvcDfnShlfLfStrgIdUse()));

		/******************** DvcDfn_ShlfLfStrg_Id_Vl ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgIdVl() != null) {
			devicedefinitionshelflifestorageidentifier.setValue(d.getDvcDfnShlfLfStrgIdVl());
		}
		/******************** devicedefinitionshelflifestorageperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicedefinitionshelflifestorageperiod =  new org.hl7.fhir.r4.model.Quantity();
		devicedefinitionshelflifestorage.setPeriod(devicedefinitionshelflifestorageperiod);

		/******************** DvcDfn_ShlfLfStrg_Prd_Cd ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgPrdCd() != null) {
			devicedefinitionshelflifestorageperiod.setCode(d.getDvcDfnShlfLfStrgPrdCd());
		}
		/******************** devicedefinitionshelflifestorageperiodcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory devicedefinitionshelflifestorageperiodcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		devicedefinitionshelflifestorageperiod.setComparator(devicedefinitionshelflifestorageperiodcomparator.fromCode(d.getDvcDfnShlfLfStrgPrdCmprtr()));

		/******************** DvcDfn_ShlfLfStrg_Prd_Sys ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgPrdSys() != null) {
			devicedefinitionshelflifestorageperiod.setSystem(d.getDvcDfnShlfLfStrgPrdSys());
		}
		/******************** DvcDfn_ShlfLfStrg_Prd_Unt ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgPrdUnt() != null) {
			devicedefinitionshelflifestorageperiod.setUnit(d.getDvcDfnShlfLfStrgPrdUnt());
		}
		/******************** DvcDfn_ShlfLfStrg_Prd_Vl ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgPrdVl() != null) {
			devicedefinitionshelflifestorageperiod.setValue(Double.parseDouble((d.getDvcDfnShlfLfStrgPrdVl())));
		}
		/******************** devicedefinitionshelflifestoragespecialprecautionsforstorage ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicedefinitionshelflifestoragespecialprecautionsforstorage =  new org.hl7.fhir.r4.model.CodeableConcept();
		devicedefinitionshelflifestorage.addSpecialPrecautionsForStorage(devicedefinitionshelflifestoragespecialprecautionsforstorage);

		/******************** devicedefinitionshelflifestoragespecialprecautionsforstoragecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicedefinitionshelflifestoragespecialprecautionsforstoragecoding =  new org.hl7.fhir.r4.model.Coding();
		devicedefinitionshelflifestoragespecialprecautionsforstorage.addCoding(devicedefinitionshelflifestoragespecialprecautionsforstoragecoding);

		/******************** DvcDfn_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_Cd ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgCd() != null) {
			devicedefinitionshelflifestoragespecialprecautionsforstoragecoding.setCode(d.getDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgCd());
		}
		/******************** DvcDfn_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_Dsply ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgDsply() != null) {
			devicedefinitionshelflifestoragespecialprecautionsforstoragecoding.setDisplay(d.getDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgDsply());
		}
		/******************** DvcDfn_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_Sys ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgSys() != null) {
			devicedefinitionshelflifestoragespecialprecautionsforstoragecoding.setSystem(d.getDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgSys());
		}
		/******************** DvcDfn_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgUsrSltd() != null) {
			devicedefinitionshelflifestoragespecialprecautionsforstoragecoding.setUserSelected(Boolean.parseBoolean(d.getDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgUsrSltd()));
		}
		/******************** DvcDfn_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgVrsn() != null) {
			devicedefinitionshelflifestoragespecialprecautionsforstoragecoding.setVersion(d.getDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgVrsn());
		}
		/******************** DvcDfn_ShlfLfStrg_SpclPrctnsFrStrg_Txt ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgSpclPrctnsFrStrgTxt() != null) {
			devicedefinitionshelflifestoragespecialprecautionsforstorage.setText(d.getDvcDfnShlfLfStrgSpclPrctnsFrStrgTxt());
		}
		/******************** devicedefinitionshelflifestoragetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicedefinitionshelflifestoragetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		devicedefinitionshelflifestorage.setType(devicedefinitionshelflifestoragetype);

		/******************** devicedefinitionshelflifestoragetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicedefinitionshelflifestoragetypecoding =  new org.hl7.fhir.r4.model.Coding();
		devicedefinitionshelflifestoragetype.addCoding(devicedefinitionshelflifestoragetypecoding);

		/******************** DvcDfn_ShlfLfStrg_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgTypCdgCd() != null) {
			devicedefinitionshelflifestoragetypecoding.setCode(d.getDvcDfnShlfLfStrgTypCdgCd());
		}
		/******************** DvcDfn_ShlfLfStrg_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgTypCdgDsply() != null) {
			devicedefinitionshelflifestoragetypecoding.setDisplay(d.getDvcDfnShlfLfStrgTypCdgDsply());
		}
		/******************** DvcDfn_ShlfLfStrg_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgTypCdgSys() != null) {
			devicedefinitionshelflifestoragetypecoding.setSystem(d.getDvcDfnShlfLfStrgTypCdgSys());
		}
		/******************** DvcDfn_ShlfLfStrg_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgTypCdgUsrSltd() != null) {
			devicedefinitionshelflifestoragetypecoding.setUserSelected(Boolean.parseBoolean(d.getDvcDfnShlfLfStrgTypCdgUsrSltd()));
		}
		/******************** DvcDfn_ShlfLfStrg_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgTypCdgVrsn() != null) {
			devicedefinitionshelflifestoragetypecoding.setVersion(d.getDvcDfnShlfLfStrgTypCdgVrsn());
		}
		/******************** DvcDfn_ShlfLfStrg_Typ_Txt ********************************************************************************/
		if(d.getDvcDfnShlfLfStrgTypTxt() != null) {
			devicedefinitionshelflifestoragetype.setText(d.getDvcDfnShlfLfStrgTypTxt());
		}
		/******************** devicedefinitionspecialization ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionSpecializationComponent devicedefinitionspecialization =  new org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionSpecializationComponent();
		devicedefinition.addSpecialization(devicedefinitionspecialization);

		/******************** DvcDfn_Spclization_SysTyp ********************************************************************************/
		if(d.getDvcDfnSpclizationSysTyp() != null) {
			devicedefinitionspecialization.setSystemType(d.getDvcDfnSpclizationSysTyp());
		}
		/******************** DvcDfn_Spclization_Vrsn ********************************************************************************/
		if(d.getDvcDfnSpclizationVrsn() != null) {
			devicedefinitionspecialization.setVersion(d.getDvcDfnSpclizationVrsn());
		}
		/******************** devicedefinitiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicedefinitiontype =  new org.hl7.fhir.r4.model.CodeableConcept();
		devicedefinition.setType(devicedefinitiontype);

		/******************** devicedefinitiontypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicedefinitiontypecoding =  new org.hl7.fhir.r4.model.Coding();
		devicedefinitiontype.addCoding(devicedefinitiontypecoding);

		/******************** DvcDfn_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDvcDfnTypCdgCd() != null) {
			devicedefinitiontypecoding.setCode(d.getDvcDfnTypCdgCd());
		}
		/******************** DvcDfn_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDvcDfnTypCdgDsply() != null) {
			devicedefinitiontypecoding.setDisplay(d.getDvcDfnTypCdgDsply());
		}
		/******************** DvcDfn_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDvcDfnTypCdgSys() != null) {
			devicedefinitiontypecoding.setSystem(d.getDvcDfnTypCdgSys());
		}
		/******************** DvcDfn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcDfnTypCdgUsrSltd() != null) {
			devicedefinitiontypecoding.setUserSelected(Boolean.parseBoolean(d.getDvcDfnTypCdgUsrSltd()));
		}
		/******************** DvcDfn_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcDfnTypCdgVrsn() != null) {
			devicedefinitiontypecoding.setVersion(d.getDvcDfnTypCdgVrsn());
		}
		/******************** DvcDfn_Typ_Txt ********************************************************************************/
		if(d.getDvcDfnTypTxt() != null) {
			devicedefinitiontype.setText(d.getDvcDfnTypTxt());
		}
		/******************** devicedefinitionudideviceidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionUdiDeviceIdentifierComponent devicedefinitionudideviceidentifier =  new org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionUdiDeviceIdentifierComponent();
		devicedefinition.addUdiDeviceIdentifier(devicedefinitionudideviceidentifier);

		/******************** DvcDfn_UdiDvcId_DvcId ********************************************************************************/
		if(d.getDvcDfnUdiDvcIdDvcId() != null) {
			devicedefinitionudideviceidentifier.setDeviceIdentifier(d.getDvcDfnUdiDvcIdDvcId());
		}
		/******************** DvcDfn_UdiDvcId_Issuer ********************************************************************************/
		if(d.getDvcDfnUdiDvcIdIssuer() != null) {
			devicedefinitionudideviceidentifier.setIssuer(d.getDvcDfnUdiDvcIdIssuer());
		}
		/******************** DvcDfn_UdiDvcId_Jrsdctn ********************************************************************************/
		if(d.getDvcDfnUdiDvcIdJrsdctn() != null) {
			devicedefinitionudideviceidentifier.setJurisdiction(d.getDvcDfnUdiDvcIdJrsdctn());
		}
		/******************** DvcDfn_Url ********************************************************************************/
		if(d.getDvcDfnUrl() != null) {
			devicedefinition.setUrl(d.getDvcDfnUrl());
		}
		/******************** DvcDfn_Vrsn ********************************************************************************/
		if(d.getDvcDfnVrsn() != null) {
			devicedefinition.addVersion(d.getDvcDfnVrsn());
		}
		return devicedefinition;
	}
}
