package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.DeviceDefinition;
public class DeviceDefinitionBidirectionalConversion 
{
	public DeviceDefinition DeviceDefinitions(org.hl7.fhir.r4.model.DeviceDefinition devicedefinition) throws ParseException
	{
		 main.java.com.campfhir.model.DeviceDefinition d = new  main.java.com.campfhir.model.DeviceDefinition();

		/******************** id ********************************************************************************/
		devicedefinition.setId(d.getId());

		/******************** DvcDfn_Owner ********************************************************************************/
		if(devicedefinition.hasOwner()) {
			d.setDvcDfnOwner(String.valueOf(devicedefinition.getOwner()));
		}
		/******************** devicedefinitiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicedefinitiontype = devicedefinition.getType();

		/******************** DvcDfn_Typ_Txt ********************************************************************************/
		if(devicedefinitiontype.hasText()) {
			d.setDvcDfnTypTxt(String.valueOf(devicedefinitiontype.getText()));
		}
		/******************** devicedefinitiontypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicedefinitiontypecoding = devicedefinitiontype.getCodingFirstRep();

		/******************** DvcDfn_Typ_Cdg_Vrsn ********************************************************************************/
		if(devicedefinitiontypecoding.hasVersion()) {
			d.setDvcDfnTypCdgVrsn(String.valueOf(devicedefinitiontypecoding.getVersion()));
		}
		/******************** DvcDfn_Typ_Cdg_Dsply ********************************************************************************/
		if(devicedefinitiontypecoding.hasDisplay()) {
			d.setDvcDfnTypCdgDsply(String.valueOf(devicedefinitiontypecoding.getDisplay()));
		}
		/******************** DvcDfn_Typ_Cdg_Cd ********************************************************************************/
		if(devicedefinitiontypecoding.hasCode()) {
			d.setDvcDfnTypCdgCd(String.valueOf(devicedefinitiontypecoding.getCode()));
		}
		/******************** DvcDfn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(devicedefinitiontypecoding.hasUserSelected()) {
			d.setDvcDfnTypCdgUsrSltd(String.valueOf(devicedefinitiontypecoding.getUserSelected()));
		}
		/******************** DvcDfn_Typ_Cdg_Sys ********************************************************************************/
		if(devicedefinitiontypecoding.hasSystem()) {
			d.setDvcDfnTypCdgSys(String.valueOf(devicedefinitiontypecoding.getSystem()));
		}
		/******************** DvcDfn_ModelNmbr ********************************************************************************/
		if(devicedefinition.hasModelNumber()) {
			d.setDvcDfnModelNmbr(String.valueOf(devicedefinition.getModelNumber()));
		}
		/******************** devicedefinitionsafety ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicedefinitionsafety = devicedefinition.getSafetyFirstRep();

		/******************** DvcDfn_Safety_Txt ********************************************************************************/
		if(devicedefinitionsafety.hasText()) {
			d.setDvcDfnSafetyTxt(String.valueOf(devicedefinitionsafety.getText()));
		}
		/******************** devicedefinitionsafetycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicedefinitionsafetycoding = devicedefinitionsafety.getCodingFirstRep();

		/******************** DvcDfn_Safety_Cdg_Vrsn ********************************************************************************/
		if(devicedefinitionsafetycoding.hasVersion()) {
			d.setDvcDfnSafetyCdgVrsn(String.valueOf(devicedefinitionsafetycoding.getVersion()));
		}
		/******************** DvcDfn_Safety_Cdg_Dsply ********************************************************************************/
		if(devicedefinitionsafetycoding.hasDisplay()) {
			d.setDvcDfnSafetyCdgDsply(String.valueOf(devicedefinitionsafetycoding.getDisplay()));
		}
		/******************** DvcDfn_Safety_Cdg_Cd ********************************************************************************/
		if(devicedefinitionsafetycoding.hasCode()) {
			d.setDvcDfnSafetyCdgCd(String.valueOf(devicedefinitionsafetycoding.getCode()));
		}
		/******************** DvcDfn_Safety_Cdg_UsrSltd ********************************************************************************/
		if(devicedefinitionsafetycoding.hasUserSelected()) {
			d.setDvcDfnSafetyCdgUsrSltd(String.valueOf(devicedefinitionsafetycoding.getUserSelected()));
		}
		/******************** DvcDfn_Safety_Cdg_Sys ********************************************************************************/
		if(devicedefinitionsafetycoding.hasSystem()) {
			d.setDvcDfnSafetyCdgSys(String.valueOf(devicedefinitionsafetycoding.getSystem()));
		}
		/******************** devicedefinitionnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation devicedefinitionnote = devicedefinition.getNoteFirstRep();

		/******************** DvcDfn_Nt_Time ********************************************************************************/
		if(devicedefinitionnote.hasTime()) {
			d.setDvcDfnNtTime(String.valueOf(devicedefinitionnote.getTime()));
		}
		/******************** DvcDfn_Nt_Txt ********************************************************************************/
		if(devicedefinitionnote.hasText()) {
			d.setDvcDfnNtTxt(String.valueOf(devicedefinitionnote.getText()));
		}
		/******************** DvcDfn_Nt_AthrRfrnc ********************************************************************************/
		if(devicedefinitionnote.hasAuthorReference()) {
			d.setDvcDfnNtAthrRfrnc(String.valueOf(devicedefinitionnote.getAuthorReference()));
		}
		/******************** DvcDfn_Nt_AthrStrgTyp ********************************************************************************/
		if(devicedefinitionnote.hasAuthorStringType()) {
			d.setDvcDfnNtAthrStrgTyp(String.valueOf(devicedefinitionnote.getAuthorStringType()));
		}
		/******************** DvcDfn_Url ********************************************************************************/
		if(devicedefinition.hasUrl()) {
			d.setDvcDfnUrl(String.valueOf(devicedefinition.getUrl()));
		}
		/******************** DvcDfn_ParentDvc ********************************************************************************/
		if(devicedefinition.hasParentDevice()) {
			d.setDvcDfnParentDvc(String.valueOf(devicedefinition.getParentDevice()));
		}
		/******************** devicedefinitionquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicedefinitionquantity = devicedefinition.getQuantity();

		/******************** DvcDfn_Qnty_Vl ********************************************************************************/
		if(devicedefinitionquantity.hasValue()) {
			d.setDvcDfnQntyVl(String.valueOf(devicedefinitionquantity.getValue()));
		}
		/******************** devicedefinitionquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicedefinitionquantitycomparator = devicedefinitionquantity.getComparator();
		d.setDvcDfnQntyCmprtr(devicedefinitionquantitycomparator.toCode());

		/******************** DvcDfn_Qnty_Cd ********************************************************************************/
		if(devicedefinitionquantity.hasCode()) {
			d.setDvcDfnQntyCd(String.valueOf(devicedefinitionquantity.getCode()));
		}
		/******************** DvcDfn_Qnty_Unt ********************************************************************************/
		if(devicedefinitionquantity.hasUnit()) {
			d.setDvcDfnQntyUnt(String.valueOf(devicedefinitionquantity.getUnit()));
		}
		/******************** DvcDfn_Qnty_Sys ********************************************************************************/
		if(devicedefinitionquantity.hasSystem()) {
			d.setDvcDfnQntySys(String.valueOf(devicedefinitionquantity.getSystem()));
		}
		/******************** devicedefinitionlanguagecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicedefinitionlanguagecode = devicedefinition.getLanguageCodeFirstRep();

		/******************** DvcDfn_LnguageCd_Txt ********************************************************************************/
		if(devicedefinitionlanguagecode.hasText()) {
			d.setDvcDfnLnguageCdTxt(String.valueOf(devicedefinitionlanguagecode.getText()));
		}
		/******************** devicedefinitionlanguagecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicedefinitionlanguagecodecoding = devicedefinitionlanguagecode.getCodingFirstRep();

		/******************** DvcDfn_LnguageCd_Cdg_Vrsn ********************************************************************************/
		if(devicedefinitionlanguagecodecoding.hasVersion()) {
			d.setDvcDfnLnguageCdCdgVrsn(String.valueOf(devicedefinitionlanguagecodecoding.getVersion()));
		}
		/******************** DvcDfn_LnguageCd_Cdg_Dsply ********************************************************************************/
		if(devicedefinitionlanguagecodecoding.hasDisplay()) {
			d.setDvcDfnLnguageCdCdgDsply(String.valueOf(devicedefinitionlanguagecodecoding.getDisplay()));
		}
		/******************** DvcDfn_LnguageCd_Cdg_Cd ********************************************************************************/
		if(devicedefinitionlanguagecodecoding.hasCode()) {
			d.setDvcDfnLnguageCdCdgCd(String.valueOf(devicedefinitionlanguagecodecoding.getCode()));
		}
		/******************** DvcDfn_LnguageCd_Cdg_UsrSltd ********************************************************************************/
		if(devicedefinitionlanguagecodecoding.hasUserSelected()) {
			d.setDvcDfnLnguageCdCdgUsrSltd(String.valueOf(devicedefinitionlanguagecodecoding.getUserSelected()));
		}
		/******************** DvcDfn_LnguageCd_Cdg_Sys ********************************************************************************/
		if(devicedefinitionlanguagecodecoding.hasSystem()) {
			d.setDvcDfnLnguageCdCdgSys(String.valueOf(devicedefinitionlanguagecodecoding.getSystem()));
		}
		/******************** DvcDfn_ManufacturerStrgTyp ********************************************************************************/
		if(devicedefinition.hasManufacturerStringType()) {
			d.setDvcDfnManufacturerStrgTyp(String.valueOf(devicedefinition.getManufacturerStringType()));
		}
		/******************** devicedefinitionudideviceidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionUdiDeviceIdentifierComponent devicedefinitionudideviceidentifier = devicedefinition.getUdiDeviceIdentifierFirstRep();

		/******************** DvcDfn_UdiDvcId_DvcId ********************************************************************************/
		if(devicedefinitionudideviceidentifier.hasDeviceIdentifier()) {
			d.setDvcDfnUdiDvcIdDvcId(String.valueOf(devicedefinitionudideviceidentifier.getDeviceIdentifier()));
		}
		/******************** DvcDfn_UdiDvcId_Jrsdctn ********************************************************************************/
		if(devicedefinitionudideviceidentifier.hasJurisdiction()) {
			d.setDvcDfnUdiDvcIdJrsdctn(String.valueOf(devicedefinitionudideviceidentifier.getJurisdiction()));
		}
		/******************** DvcDfn_UdiDvcId_Issuer ********************************************************************************/
		if(devicedefinitionudideviceidentifier.hasIssuer()) {
			d.setDvcDfnUdiDvcIdIssuer(String.valueOf(devicedefinitionudideviceidentifier.getIssuer()));
		}
		/******************** devicedefinitioncapability ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionCapabilityComponent devicedefinitioncapability = devicedefinition.getCapabilityFirstRep();

		/******************** devicedefinitioncapabilitytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicedefinitioncapabilitytype = devicedefinitioncapability.getType();

		/******************** DvcDfn_Capblty_Typ_Txt ********************************************************************************/
		if(devicedefinitioncapabilitytype.hasText()) {
			d.setDvcDfnCapbltyTypTxt(String.valueOf(devicedefinitioncapabilitytype.getText()));
		}
		/******************** devicedefinitioncapabilitytypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicedefinitioncapabilitytypecoding = devicedefinitioncapabilitytype.getCodingFirstRep();

		/******************** DvcDfn_Capblty_Typ_Cdg_Vrsn ********************************************************************************/
		if(devicedefinitioncapabilitytypecoding.hasVersion()) {
			d.setDvcDfnCapbltyTypCdgVrsn(String.valueOf(devicedefinitioncapabilitytypecoding.getVersion()));
		}
		/******************** DvcDfn_Capblty_Typ_Cdg_Dsply ********************************************************************************/
		if(devicedefinitioncapabilitytypecoding.hasDisplay()) {
			d.setDvcDfnCapbltyTypCdgDsply(String.valueOf(devicedefinitioncapabilitytypecoding.getDisplay()));
		}
		/******************** DvcDfn_Capblty_Typ_Cdg_Cd ********************************************************************************/
		if(devicedefinitioncapabilitytypecoding.hasCode()) {
			d.setDvcDfnCapbltyTypCdgCd(String.valueOf(devicedefinitioncapabilitytypecoding.getCode()));
		}
		/******************** DvcDfn_Capblty_Typ_Cdg_UsrSltd ********************************************************************************/
		if(devicedefinitioncapabilitytypecoding.hasUserSelected()) {
			d.setDvcDfnCapbltyTypCdgUsrSltd(String.valueOf(devicedefinitioncapabilitytypecoding.getUserSelected()));
		}
		/******************** DvcDfn_Capblty_Typ_Cdg_Sys ********************************************************************************/
		if(devicedefinitioncapabilitytypecoding.hasSystem()) {
			d.setDvcDfnCapbltyTypCdgSys(String.valueOf(devicedefinitioncapabilitytypecoding.getSystem()));
		}
		/******************** devicedefinitioncapabilitydescription ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicedefinitioncapabilitydescription = devicedefinitioncapability.getDescriptionFirstRep();

		/******************** DvcDfn_Capblty_Dscrptn_Txt ********************************************************************************/
		if(devicedefinitioncapabilitydescription.hasText()) {
			d.setDvcDfnCapbltyDscrptnTxt(String.valueOf(devicedefinitioncapabilitydescription.getText()));
		}
		/******************** devicedefinitioncapabilitydescriptioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicedefinitioncapabilitydescriptioncoding = devicedefinitioncapabilitydescription.getCodingFirstRep();

		/******************** DvcDfn_Capblty_Dscrptn_Cdg_Vrsn ********************************************************************************/
		if(devicedefinitioncapabilitydescriptioncoding.hasVersion()) {
			d.setDvcDfnCapbltyDscrptnCdgVrsn(String.valueOf(devicedefinitioncapabilitydescriptioncoding.getVersion()));
		}
		/******************** DvcDfn_Capblty_Dscrptn_Cdg_Dsply ********************************************************************************/
		if(devicedefinitioncapabilitydescriptioncoding.hasDisplay()) {
			d.setDvcDfnCapbltyDscrptnCdgDsply(String.valueOf(devicedefinitioncapabilitydescriptioncoding.getDisplay()));
		}
		/******************** DvcDfn_Capblty_Dscrptn_Cdg_Cd ********************************************************************************/
		if(devicedefinitioncapabilitydescriptioncoding.hasCode()) {
			d.setDvcDfnCapbltyDscrptnCdgCd(String.valueOf(devicedefinitioncapabilitydescriptioncoding.getCode()));
		}
		/******************** DvcDfn_Capblty_Dscrptn_Cdg_UsrSltd ********************************************************************************/
		if(devicedefinitioncapabilitydescriptioncoding.hasUserSelected()) {
			d.setDvcDfnCapbltyDscrptnCdgUsrSltd(String.valueOf(devicedefinitioncapabilitydescriptioncoding.getUserSelected()));
		}
		/******************** DvcDfn_Capblty_Dscrptn_Cdg_Sys ********************************************************************************/
		if(devicedefinitioncapabilitydescriptioncoding.hasSystem()) {
			d.setDvcDfnCapbltyDscrptnCdgSys(String.valueOf(devicedefinitioncapabilitydescriptioncoding.getSystem()));
		}
		/******************** DvcDfn_OnlineInfo ********************************************************************************/
		if(devicedefinition.hasOnlineInformation()) {
			d.setDvcDfnOnlineInfo(String.valueOf(devicedefinition.getOnlineInformation()));
		}
		/******************** devicedefinitionmaterial ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionMaterialComponent devicedefinitionmaterial = devicedefinition.getMaterialFirstRep();

		/******************** DvcDfn_Mtrl_Alternate ********************************************************************************/
		if(devicedefinitionmaterial.hasAlternate()) {
			d.setDvcDfnMtrlAlternate(String.valueOf(devicedefinitionmaterial.getAlternate()));
		}
		/******************** devicedefinitionmaterialsubstance ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicedefinitionmaterialsubstance = devicedefinitionmaterial.getSubstance();

		/******************** DvcDfn_Mtrl_Sbstnc_Txt ********************************************************************************/
		if(devicedefinitionmaterialsubstance.hasText()) {
			d.setDvcDfnMtrlSbstncTxt(String.valueOf(devicedefinitionmaterialsubstance.getText()));
		}
		/******************** devicedefinitionmaterialsubstancecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicedefinitionmaterialsubstancecoding = devicedefinitionmaterialsubstance.getCodingFirstRep();

		/******************** DvcDfn_Mtrl_Sbstnc_Cdg_Vrsn ********************************************************************************/
		if(devicedefinitionmaterialsubstancecoding.hasVersion()) {
			d.setDvcDfnMtrlSbstncCdgVrsn(String.valueOf(devicedefinitionmaterialsubstancecoding.getVersion()));
		}
		/******************** DvcDfn_Mtrl_Sbstnc_Cdg_Dsply ********************************************************************************/
		if(devicedefinitionmaterialsubstancecoding.hasDisplay()) {
			d.setDvcDfnMtrlSbstncCdgDsply(String.valueOf(devicedefinitionmaterialsubstancecoding.getDisplay()));
		}
		/******************** DvcDfn_Mtrl_Sbstnc_Cdg_Cd ********************************************************************************/
		if(devicedefinitionmaterialsubstancecoding.hasCode()) {
			d.setDvcDfnMtrlSbstncCdgCd(String.valueOf(devicedefinitionmaterialsubstancecoding.getCode()));
		}
		/******************** DvcDfn_Mtrl_Sbstnc_Cdg_UsrSltd ********************************************************************************/
		if(devicedefinitionmaterialsubstancecoding.hasUserSelected()) {
			d.setDvcDfnMtrlSbstncCdgUsrSltd(String.valueOf(devicedefinitionmaterialsubstancecoding.getUserSelected()));
		}
		/******************** DvcDfn_Mtrl_Sbstnc_Cdg_Sys ********************************************************************************/
		if(devicedefinitionmaterialsubstancecoding.hasSystem()) {
			d.setDvcDfnMtrlSbstncCdgSys(String.valueOf(devicedefinitionmaterialsubstancecoding.getSystem()));
		}
		/******************** DvcDfn_Mtrl_AllergenicIndicator ********************************************************************************/
		if(devicedefinitionmaterial.hasAllergenicIndicator()) {
			d.setDvcDfnMtrlAllergenicIndicator(String.valueOf(devicedefinitionmaterial.getAllergenicIndicator()));
		}
		/******************** DvcDfn_ManufacturerRfrnc ********************************************************************************/
		if(devicedefinition.hasManufacturerReference()) {
			d.setDvcDfnManufacturerRfrnc(String.valueOf(devicedefinition.getManufacturerReference()));
		}
		/******************** devicedefinitionshelflifestorage ********************************************************************************/
		org.hl7.fhir.r4.model.ProductShelfLife devicedefinitionshelflifestorage = devicedefinition.getShelfLifeStorageFirstRep();

		/******************** devicedefinitionshelflifestoragetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicedefinitionshelflifestoragetype = devicedefinitionshelflifestorage.getType();

		/******************** DvcDfn_ShlfLfStrg_Typ_Txt ********************************************************************************/
		if(devicedefinitionshelflifestoragetype.hasText()) {
			d.setDvcDfnShlfLfStrgTypTxt(String.valueOf(devicedefinitionshelflifestoragetype.getText()));
		}
		/******************** devicedefinitionshelflifestoragetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicedefinitionshelflifestoragetypecoding = devicedefinitionshelflifestoragetype.getCodingFirstRep();

		/******************** DvcDfn_ShlfLfStrg_Typ_Cdg_Vrsn ********************************************************************************/
		if(devicedefinitionshelflifestoragetypecoding.hasVersion()) {
			d.setDvcDfnShlfLfStrgTypCdgVrsn(String.valueOf(devicedefinitionshelflifestoragetypecoding.getVersion()));
		}
		/******************** DvcDfn_ShlfLfStrg_Typ_Cdg_Dsply ********************************************************************************/
		if(devicedefinitionshelflifestoragetypecoding.hasDisplay()) {
			d.setDvcDfnShlfLfStrgTypCdgDsply(String.valueOf(devicedefinitionshelflifestoragetypecoding.getDisplay()));
		}
		/******************** DvcDfn_ShlfLfStrg_Typ_Cdg_Cd ********************************************************************************/
		if(devicedefinitionshelflifestoragetypecoding.hasCode()) {
			d.setDvcDfnShlfLfStrgTypCdgCd(String.valueOf(devicedefinitionshelflifestoragetypecoding.getCode()));
		}
		/******************** DvcDfn_ShlfLfStrg_Typ_Cdg_UsrSltd ********************************************************************************/
		if(devicedefinitionshelflifestoragetypecoding.hasUserSelected()) {
			d.setDvcDfnShlfLfStrgTypCdgUsrSltd(String.valueOf(devicedefinitionshelflifestoragetypecoding.getUserSelected()));
		}
		/******************** DvcDfn_ShlfLfStrg_Typ_Cdg_Sys ********************************************************************************/
		if(devicedefinitionshelflifestoragetypecoding.hasSystem()) {
			d.setDvcDfnShlfLfStrgTypCdgSys(String.valueOf(devicedefinitionshelflifestoragetypecoding.getSystem()));
		}
		/******************** devicedefinitionshelflifestorageperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicedefinitionshelflifestorageperiod = devicedefinitionshelflifestorage.getPeriod();

		/******************** DvcDfn_ShlfLfStrg_Prd_Vl ********************************************************************************/
		if(devicedefinitionshelflifestorageperiod.hasValue()) {
			d.setDvcDfnShlfLfStrgPrdVl(String.valueOf(devicedefinitionshelflifestorageperiod.getValue()));
		}
		/******************** devicedefinitionshelflifestorageperiodcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicedefinitionshelflifestorageperiodcomparator = devicedefinitionshelflifestorageperiod.getComparator();
		d.setDvcDfnShlfLfStrgPrdCmprtr(devicedefinitionshelflifestorageperiodcomparator.toCode());

		/******************** DvcDfn_ShlfLfStrg_Prd_Cd ********************************************************************************/
		if(devicedefinitionshelflifestorageperiod.hasCode()) {
			d.setDvcDfnShlfLfStrgPrdCd(String.valueOf(devicedefinitionshelflifestorageperiod.getCode()));
		}
		/******************** DvcDfn_ShlfLfStrg_Prd_Unt ********************************************************************************/
		if(devicedefinitionshelflifestorageperiod.hasUnit()) {
			d.setDvcDfnShlfLfStrgPrdUnt(String.valueOf(devicedefinitionshelflifestorageperiod.getUnit()));
		}
		/******************** DvcDfn_ShlfLfStrg_Prd_Sys ********************************************************************************/
		if(devicedefinitionshelflifestorageperiod.hasSystem()) {
			d.setDvcDfnShlfLfStrgPrdSys(String.valueOf(devicedefinitionshelflifestorageperiod.getSystem()));
		}
		/******************** devicedefinitionshelflifestorageidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier devicedefinitionshelflifestorageidentifier = devicedefinitionshelflifestorage.getIdentifier();

		/******************** DvcDfn_ShlfLfStrg_Id_Vl ********************************************************************************/
		if(devicedefinitionshelflifestorageidentifier.hasValue()) {
			d.setDvcDfnShlfLfStrgIdVl(String.valueOf(devicedefinitionshelflifestorageidentifier.getValue()));
		}
		/******************** devicedefinitionshelflifestorageidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicedefinitionshelflifestorageidentifiertype = devicedefinitionshelflifestorageidentifier.getType();

		/******************** DvcDfn_ShlfLfStrg_Id_Typ_Txt ********************************************************************************/
		if(devicedefinitionshelflifestorageidentifiertype.hasText()) {
			d.setDvcDfnShlfLfStrgIdTypTxt(String.valueOf(devicedefinitionshelflifestorageidentifiertype.getText()));
		}
		/******************** devicedefinitionshelflifestorageidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicedefinitionshelflifestorageidentifiertypecoding = devicedefinitionshelflifestorageidentifiertype.getCodingFirstRep();

		/******************** DvcDfn_ShlfLfStrg_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(devicedefinitionshelflifestorageidentifiertypecoding.hasVersion()) {
			d.setDvcDfnShlfLfStrgIdTypCdgVrsn(String.valueOf(devicedefinitionshelflifestorageidentifiertypecoding.getVersion()));
		}
		/******************** DvcDfn_ShlfLfStrg_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(devicedefinitionshelflifestorageidentifiertypecoding.hasDisplay()) {
			d.setDvcDfnShlfLfStrgIdTypCdgDsply(String.valueOf(devicedefinitionshelflifestorageidentifiertypecoding.getDisplay()));
		}
		/******************** DvcDfn_ShlfLfStrg_Id_Typ_Cdg_Cd ********************************************************************************/
		if(devicedefinitionshelflifestorageidentifiertypecoding.hasCode()) {
			d.setDvcDfnShlfLfStrgIdTypCdgCd(String.valueOf(devicedefinitionshelflifestorageidentifiertypecoding.getCode()));
		}
		/******************** DvcDfn_ShlfLfStrg_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(devicedefinitionshelflifestorageidentifiertypecoding.hasUserSelected()) {
			d.setDvcDfnShlfLfStrgIdTypCdgUsrSltd(String.valueOf(devicedefinitionshelflifestorageidentifiertypecoding.getUserSelected()));
		}
		/******************** DvcDfn_ShlfLfStrg_Id_Typ_Cdg_Sys ********************************************************************************/
		if(devicedefinitionshelflifestorageidentifiertypecoding.hasSystem()) {
			d.setDvcDfnShlfLfStrgIdTypCdgSys(String.valueOf(devicedefinitionshelflifestorageidentifiertypecoding.getSystem()));
		}
		/******************** devicedefinitionshelflifestorageidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period devicedefinitionshelflifestorageidentifierperiod = devicedefinitionshelflifestorageidentifier.getPeriod();

		/******************** DvcDfn_ShlfLfStrg_Id_Prd_Strt ********************************************************************************/
		if(devicedefinitionshelflifestorageidentifierperiod.hasStart()) {
			d.setDvcDfnShlfLfStrgIdPrdStrt(String.valueOf(devicedefinitionshelflifestorageidentifierperiod.getStart()));
		}
		/******************** DvcDfn_ShlfLfStrg_Id_Prd_End ********************************************************************************/
		if(devicedefinitionshelflifestorageidentifierperiod.hasEnd()) {
			d.setDvcDfnShlfLfStrgIdPrdEnd(String.valueOf(devicedefinitionshelflifestorageidentifierperiod.getEnd()));
		}
		/******************** DvcDfn_ShlfLfStrg_Id_Assigner ********************************************************************************/
		if(devicedefinitionshelflifestorageidentifier.hasAssigner()) {
			d.setDvcDfnShlfLfStrgIdAssigner(String.valueOf(devicedefinitionshelflifestorageidentifier.getAssigner()));
		}
		/******************** DvcDfn_ShlfLfStrg_Id_Sys ********************************************************************************/
		if(devicedefinitionshelflifestorageidentifier.hasSystem()) {
			d.setDvcDfnShlfLfStrgIdSys(String.valueOf(devicedefinitionshelflifestorageidentifier.getSystem()));
		}
		/******************** devicedefinitionshelflifestorageidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse devicedefinitionshelflifestorageidentifieruse = devicedefinitionshelflifestorageidentifier.getUse();
		d.setDvcDfnShlfLfStrgIdUse(devicedefinitionshelflifestorageidentifieruse.toCode());

		/******************** devicedefinitionshelflifestoragespecialprecautionsforstorage ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicedefinitionshelflifestoragespecialprecautionsforstorage = devicedefinitionshelflifestorage.getSpecialPrecautionsForStorageFirstRep();

		/******************** DvcDfn_ShlfLfStrg_SpclPrctnsFrStrg_Txt ********************************************************************************/
		if(devicedefinitionshelflifestoragespecialprecautionsforstorage.hasText()) {
			d.setDvcDfnShlfLfStrgSpclPrctnsFrStrgTxt(String.valueOf(devicedefinitionshelflifestoragespecialprecautionsforstorage.getText()));
		}
		/******************** devicedefinitionshelflifestoragespecialprecautionsforstoragecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicedefinitionshelflifestoragespecialprecautionsforstoragecoding = devicedefinitionshelflifestoragespecialprecautionsforstorage.getCodingFirstRep();

		/******************** DvcDfn_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_Vrsn ********************************************************************************/
		if(devicedefinitionshelflifestoragespecialprecautionsforstoragecoding.hasVersion()) {
			d.setDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgVrsn(String.valueOf(devicedefinitionshelflifestoragespecialprecautionsforstoragecoding.getVersion()));
		}
		/******************** DvcDfn_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_Dsply ********************************************************************************/
		if(devicedefinitionshelflifestoragespecialprecautionsforstoragecoding.hasDisplay()) {
			d.setDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgDsply(String.valueOf(devicedefinitionshelflifestoragespecialprecautionsforstoragecoding.getDisplay()));
		}
		/******************** DvcDfn_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_Cd ********************************************************************************/
		if(devicedefinitionshelflifestoragespecialprecautionsforstoragecoding.hasCode()) {
			d.setDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgCd(String.valueOf(devicedefinitionshelflifestoragespecialprecautionsforstoragecoding.getCode()));
		}
		/******************** DvcDfn_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_UsrSltd ********************************************************************************/
		if(devicedefinitionshelflifestoragespecialprecautionsforstoragecoding.hasUserSelected()) {
			d.setDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgUsrSltd(String.valueOf(devicedefinitionshelflifestoragespecialprecautionsforstoragecoding.getUserSelected()));
		}
		/******************** DvcDfn_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_Sys ********************************************************************************/
		if(devicedefinitionshelflifestoragespecialprecautionsforstoragecoding.hasSystem()) {
			d.setDvcDfnShlfLfStrgSpclPrctnsFrStrgCdgSys(String.valueOf(devicedefinitionshelflifestoragespecialprecautionsforstoragecoding.getSystem()));
		}
		/******************** devicedefinitioncontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint devicedefinitioncontact = devicedefinition.getContactFirstRep();

		/******************** DvcDfn_Cntct_Vl ********************************************************************************/
		if(devicedefinitioncontact.hasValue()) {
			d.setDvcDfnCntctVl(String.valueOf(devicedefinitioncontact.getValue()));
		}
		/******************** devicedefinitioncontactperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period devicedefinitioncontactperiod = devicedefinitioncontact.getPeriod();

		/******************** DvcDfn_Cntct_Prd_Strt ********************************************************************************/
		if(devicedefinitioncontactperiod.hasStart()) {
			d.setDvcDfnCntctPrdStrt(String.valueOf(devicedefinitioncontactperiod.getStart()));
		}
		/******************** DvcDfn_Cntct_Prd_End ********************************************************************************/
		if(devicedefinitioncontactperiod.hasEnd()) {
			d.setDvcDfnCntctPrdEnd(String.valueOf(devicedefinitioncontactperiod.getEnd()));
		}
		/******************** devicedefinitioncontactsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem devicedefinitioncontactsystem = devicedefinitioncontact.getSystem();
		d.setDvcDfnCntctSys(devicedefinitioncontactsystem.toCode());

		/******************** devicedefinitioncontactuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse devicedefinitioncontactuse = devicedefinitioncontact.getUse();
		d.setDvcDfnCntctUse(devicedefinitioncontactuse.toCode());

		/******************** DvcDfn_Cntct_Rnk ********************************************************************************/
		if(devicedefinitioncontact.hasRank()) {
			d.setDvcDfnCntctRnk(String.valueOf(devicedefinitioncontact.getRank()));
		}
		/******************** devicedefinitiondevicename ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionDeviceNameComponent devicedefinitiondevicename = devicedefinition.getDeviceNameFirstRep();

		/******************** DvcDfn_DvcNm_Nm ********************************************************************************/
		if(devicedefinitiondevicename.hasName()) {
			d.setDvcDfnDvcNmNm(String.valueOf(devicedefinitiondevicename.getName()));
		}
		/******************** devicedefinitiondevicenametype ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceDefinition.DeviceNameType devicedefinitiondevicenametype = devicedefinitiondevicename.getType();
		d.setDvcDfnDvcNmTyp(devicedefinitiondevicenametype.toCode());

		/******************** devicedefinitionspecialization ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionSpecializationComponent devicedefinitionspecialization = devicedefinition.getSpecializationFirstRep();

		/******************** DvcDfn_Spclization_SysTyp ********************************************************************************/
		if(devicedefinitionspecialization.hasSystemType()) {
			d.setDvcDfnSpclizationSysTyp(String.valueOf(devicedefinitionspecialization.getSystemType()));
		}
		/******************** devicedefinitionproperty ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceDefinition.DeviceDefinitionPropertyComponent devicedefinitionproperty = devicedefinition.getPropertyFirstRep();

		/******************** devicedefinitionpropertytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicedefinitionpropertytype = devicedefinitionproperty.getType();

		/******************** DvcDfn_Prpty_Typ_Txt ********************************************************************************/
		if(devicedefinitionpropertytype.hasText()) {
			d.setDvcDfnPrptyTypTxt(String.valueOf(devicedefinitionpropertytype.getText()));
		}
		/******************** devicedefinitionpropertytypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicedefinitionpropertytypecoding = devicedefinitionpropertytype.getCodingFirstRep();

		/******************** DvcDfn_Prpty_Typ_Cdg_Vrsn ********************************************************************************/
		if(devicedefinitionpropertytypecoding.hasVersion()) {
			d.setDvcDfnPrptyTypCdgVrsn(String.valueOf(devicedefinitionpropertytypecoding.getVersion()));
		}
		/******************** DvcDfn_Prpty_Typ_Cdg_Dsply ********************************************************************************/
		if(devicedefinitionpropertytypecoding.hasDisplay()) {
			d.setDvcDfnPrptyTypCdgDsply(String.valueOf(devicedefinitionpropertytypecoding.getDisplay()));
		}
		/******************** DvcDfn_Prpty_Typ_Cdg_Cd ********************************************************************************/
		if(devicedefinitionpropertytypecoding.hasCode()) {
			d.setDvcDfnPrptyTypCdgCd(String.valueOf(devicedefinitionpropertytypecoding.getCode()));
		}
		/******************** DvcDfn_Prpty_Typ_Cdg_UsrSltd ********************************************************************************/
		if(devicedefinitionpropertytypecoding.hasUserSelected()) {
			d.setDvcDfnPrptyTypCdgUsrSltd(String.valueOf(devicedefinitionpropertytypecoding.getUserSelected()));
		}
		/******************** DvcDfn_Prpty_Typ_Cdg_Sys ********************************************************************************/
		if(devicedefinitionpropertytypecoding.hasSystem()) {
			d.setDvcDfnPrptyTypCdgSys(String.valueOf(devicedefinitionpropertytypecoding.getSystem()));
		}
		/******************** devicedefinitionpropertyvaluecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicedefinitionpropertyvaluecode = devicedefinitionproperty.getValueCodeFirstRep();

		/******************** DvcDfn_Prpty_VlCd_Txt ********************************************************************************/
		if(devicedefinitionpropertyvaluecode.hasText()) {
			d.setDvcDfnPrptyVlCdTxt(String.valueOf(devicedefinitionpropertyvaluecode.getText()));
		}
		/******************** devicedefinitionpropertyvaluecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicedefinitionpropertyvaluecodecoding = devicedefinitionpropertyvaluecode.getCodingFirstRep();

		/******************** DvcDfn_Prpty_VlCd_Cdg_Vrsn ********************************************************************************/
		if(devicedefinitionpropertyvaluecodecoding.hasVersion()) {
			d.setDvcDfnPrptyVlCdCdgVrsn(String.valueOf(devicedefinitionpropertyvaluecodecoding.getVersion()));
		}
		/******************** DvcDfn_Prpty_VlCd_Cdg_Dsply ********************************************************************************/
		if(devicedefinitionpropertyvaluecodecoding.hasDisplay()) {
			d.setDvcDfnPrptyVlCdCdgDsply(String.valueOf(devicedefinitionpropertyvaluecodecoding.getDisplay()));
		}
		/******************** DvcDfn_Prpty_VlCd_Cdg_Cd ********************************************************************************/
		if(devicedefinitionpropertyvaluecodecoding.hasCode()) {
			d.setDvcDfnPrptyVlCdCdgCd(String.valueOf(devicedefinitionpropertyvaluecodecoding.getCode()));
		}
		/******************** DvcDfn_Prpty_VlCd_Cdg_UsrSltd ********************************************************************************/
		if(devicedefinitionpropertyvaluecodecoding.hasUserSelected()) {
			d.setDvcDfnPrptyVlCdCdgUsrSltd(String.valueOf(devicedefinitionpropertyvaluecodecoding.getUserSelected()));
		}
		/******************** DvcDfn_Prpty_VlCd_Cdg_Sys ********************************************************************************/
		if(devicedefinitionpropertyvaluecodecoding.hasSystem()) {
			d.setDvcDfnPrptyVlCdCdgSys(String.valueOf(devicedefinitionpropertyvaluecodecoding.getSystem()));
		}
		/******************** devicedefinitionpropertyvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicedefinitionpropertyvaluequantity = devicedefinitionproperty.getValueQuantityFirstRep();

		/******************** DvcDfn_Prpty_VlQnty_Vl ********************************************************************************/
		if(devicedefinitionpropertyvaluequantity.hasValue()) {
			d.setDvcDfnPrptyVlQntyVl(String.valueOf(devicedefinitionpropertyvaluequantity.getValue()));
		}
		/******************** devicedefinitionpropertyvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicedefinitionpropertyvaluequantitycomparator = devicedefinitionpropertyvaluequantity.getComparator();
		d.setDvcDfnPrptyVlQntyCmprtr(devicedefinitionpropertyvaluequantitycomparator.toCode());

		/******************** DvcDfn_Prpty_VlQnty_Cd ********************************************************************************/
		if(devicedefinitionpropertyvaluequantity.hasCode()) {
			d.setDvcDfnPrptyVlQntyCd(String.valueOf(devicedefinitionpropertyvaluequantity.getCode()));
		}
		/******************** DvcDfn_Prpty_VlQnty_Unt ********************************************************************************/
		if(devicedefinitionpropertyvaluequantity.hasUnit()) {
			d.setDvcDfnPrptyVlQntyUnt(String.valueOf(devicedefinitionpropertyvaluequantity.getUnit()));
		}
		/******************** DvcDfn_Prpty_VlQnty_Sys ********************************************************************************/
		if(devicedefinitionpropertyvaluequantity.hasSystem()) {
			d.setDvcDfnPrptyVlQntySys(String.valueOf(devicedefinitionpropertyvaluequantity.getSystem()));
		}
		/******************** devicedefinitionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier devicedefinitionidentifier = devicedefinition.getIdentifierFirstRep();

		/******************** DvcDfn_Id_Vl ********************************************************************************/
		if(devicedefinitionidentifier.hasValue()) {
			d.setDvcDfnIdVl(String.valueOf(devicedefinitionidentifier.getValue()));
		}
		/******************** devicedefinitionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicedefinitionidentifiertype = devicedefinitionidentifier.getType();

		/******************** DvcDfn_Id_Typ_Txt ********************************************************************************/
		if(devicedefinitionidentifiertype.hasText()) {
			d.setDvcDfnIdTypTxt(String.valueOf(devicedefinitionidentifiertype.getText()));
		}
		/******************** devicedefinitionidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicedefinitionidentifiertypecoding = devicedefinitionidentifiertype.getCodingFirstRep();

		/******************** DvcDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(devicedefinitionidentifiertypecoding.hasVersion()) {
			d.setDvcDfnIdTypCdgVrsn(String.valueOf(devicedefinitionidentifiertypecoding.getVersion()));
		}
		/******************** DvcDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(devicedefinitionidentifiertypecoding.hasDisplay()) {
			d.setDvcDfnIdTypCdgDsply(String.valueOf(devicedefinitionidentifiertypecoding.getDisplay()));
		}
		/******************** DvcDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(devicedefinitionidentifiertypecoding.hasCode()) {
			d.setDvcDfnIdTypCdgCd(String.valueOf(devicedefinitionidentifiertypecoding.getCode()));
		}
		/******************** DvcDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(devicedefinitionidentifiertypecoding.hasUserSelected()) {
			d.setDvcDfnIdTypCdgUsrSltd(String.valueOf(devicedefinitionidentifiertypecoding.getUserSelected()));
		}
		/******************** DvcDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(devicedefinitionidentifiertypecoding.hasSystem()) {
			d.setDvcDfnIdTypCdgSys(String.valueOf(devicedefinitionidentifiertypecoding.getSystem()));
		}
		/******************** devicedefinitionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period devicedefinitionidentifierperiod = devicedefinitionidentifier.getPeriod();

		/******************** DvcDfn_Id_Prd_Strt ********************************************************************************/
		if(devicedefinitionidentifierperiod.hasStart()) {
			d.setDvcDfnIdPrdStrt(String.valueOf(devicedefinitionidentifierperiod.getStart()));
		}
		/******************** DvcDfn_Id_Prd_End ********************************************************************************/
		if(devicedefinitionidentifierperiod.hasEnd()) {
			d.setDvcDfnIdPrdEnd(String.valueOf(devicedefinitionidentifierperiod.getEnd()));
		}
		/******************** DvcDfn_Id_Assigner ********************************************************************************/
		if(devicedefinitionidentifier.hasAssigner()) {
			d.setDvcDfnIdAssigner(String.valueOf(devicedefinitionidentifier.getAssigner()));
		}
		/******************** DvcDfn_Id_Sys ********************************************************************************/
		if(devicedefinitionidentifier.hasSystem()) {
			d.setDvcDfnIdSys(String.valueOf(devicedefinitionidentifier.getSystem()));
		}
		/******************** devicedefinitionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse devicedefinitionidentifieruse = devicedefinitionidentifier.getUse();
		d.setDvcDfnIdUse(devicedefinitionidentifieruse.toCode());

		/******************** devicedefinitionphysicalcharacteristics ********************************************************************************/
		org.hl7.fhir.r4.model.ProdCharacteristic devicedefinitionphysicalcharacteristics = devicedefinition.getPhysicalCharacteristics();

		/******************** DvcDfn_PhysclCrctrstcs_Shape ********************************************************************************/
		if(devicedefinitionphysicalcharacteristics.hasShape()) {
			d.setDvcDfnPhysclCrctrstcsShape(String.valueOf(devicedefinitionphysicalcharacteristics.getShape()));
		}
		/******************** devicedefinitionphysicalcharacteristicsexternaldiameter ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicedefinitionphysicalcharacteristicsexternaldiameter = devicedefinitionphysicalcharacteristics.getExternalDiameter();

		/******************** DvcDfn_PhysclCrctrstcs_ExternalDiameter_Vl ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsexternaldiameter.hasValue()) {
			d.setDvcDfnPhysclCrctrstcsExternalDiameterVl(String.valueOf(devicedefinitionphysicalcharacteristicsexternaldiameter.getValue()));
		}
		/******************** devicedefinitionphysicalcharacteristicsexternaldiametercomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicedefinitionphysicalcharacteristicsexternaldiametercomparator = devicedefinitionphysicalcharacteristicsexternaldiameter.getComparator();
		d.setDvcDfnPhysclCrctrstcsExternalDiameterCmprtr(devicedefinitionphysicalcharacteristicsexternaldiametercomparator.toCode());

		/******************** DvcDfn_PhysclCrctrstcs_ExternalDiameter_Cd ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsexternaldiameter.hasCode()) {
			d.setDvcDfnPhysclCrctrstcsExternalDiameterCd(String.valueOf(devicedefinitionphysicalcharacteristicsexternaldiameter.getCode()));
		}
		/******************** DvcDfn_PhysclCrctrstcs_ExternalDiameter_Unt ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsexternaldiameter.hasUnit()) {
			d.setDvcDfnPhysclCrctrstcsExternalDiameterUnt(String.valueOf(devicedefinitionphysicalcharacteristicsexternaldiameter.getUnit()));
		}
		/******************** DvcDfn_PhysclCrctrstcs_ExternalDiameter_Sys ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsexternaldiameter.hasSystem()) {
			d.setDvcDfnPhysclCrctrstcsExternalDiameterSys(String.valueOf(devicedefinitionphysicalcharacteristicsexternaldiameter.getSystem()));
		}
		/******************** devicedefinitionphysicalcharacteristicsnominalvolume ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicedefinitionphysicalcharacteristicsnominalvolume = devicedefinitionphysicalcharacteristics.getNominalVolume();

		/******************** DvcDfn_PhysclCrctrstcs_NominalVolume_Vl ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsnominalvolume.hasValue()) {
			d.setDvcDfnPhysclCrctrstcsNominalVolumeVl(String.valueOf(devicedefinitionphysicalcharacteristicsnominalvolume.getValue()));
		}
		/******************** devicedefinitionphysicalcharacteristicsnominalvolumecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicedefinitionphysicalcharacteristicsnominalvolumecomparator = devicedefinitionphysicalcharacteristicsnominalvolume.getComparator();
		d.setDvcDfnPhysclCrctrstcsNominalVolumeCmprtr(devicedefinitionphysicalcharacteristicsnominalvolumecomparator.toCode());

		/******************** DvcDfn_PhysclCrctrstcs_NominalVolume_Cd ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsnominalvolume.hasCode()) {
			d.setDvcDfnPhysclCrctrstcsNominalVolumeCd(String.valueOf(devicedefinitionphysicalcharacteristicsnominalvolume.getCode()));
		}
		/******************** DvcDfn_PhysclCrctrstcs_NominalVolume_Unt ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsnominalvolume.hasUnit()) {
			d.setDvcDfnPhysclCrctrstcsNominalVolumeUnt(String.valueOf(devicedefinitionphysicalcharacteristicsnominalvolume.getUnit()));
		}
		/******************** DvcDfn_PhysclCrctrstcs_NominalVolume_Sys ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsnominalvolume.hasSystem()) {
			d.setDvcDfnPhysclCrctrstcsNominalVolumeSys(String.valueOf(devicedefinitionphysicalcharacteristicsnominalvolume.getSystem()));
		}
		/******************** devicedefinitionphysicalcharacteristicsdepth ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicedefinitionphysicalcharacteristicsdepth = devicedefinitionphysicalcharacteristics.getDepth();

		/******************** DvcDfn_PhysclCrctrstcs_Depth_Vl ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsdepth.hasValue()) {
			d.setDvcDfnPhysclCrctrstcsDepthVl(String.valueOf(devicedefinitionphysicalcharacteristicsdepth.getValue()));
		}
		/******************** devicedefinitionphysicalcharacteristicsdepthcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicedefinitionphysicalcharacteristicsdepthcomparator = devicedefinitionphysicalcharacteristicsdepth.getComparator();
		d.setDvcDfnPhysclCrctrstcsDepthCmprtr(devicedefinitionphysicalcharacteristicsdepthcomparator.toCode());

		/******************** DvcDfn_PhysclCrctrstcs_Depth_Cd ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsdepth.hasCode()) {
			d.setDvcDfnPhysclCrctrstcsDepthCd(String.valueOf(devicedefinitionphysicalcharacteristicsdepth.getCode()));
		}
		/******************** DvcDfn_PhysclCrctrstcs_Depth_Unt ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsdepth.hasUnit()) {
			d.setDvcDfnPhysclCrctrstcsDepthUnt(String.valueOf(devicedefinitionphysicalcharacteristicsdepth.getUnit()));
		}
		/******************** DvcDfn_PhysclCrctrstcs_Depth_Sys ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsdepth.hasSystem()) {
			d.setDvcDfnPhysclCrctrstcsDepthSys(String.valueOf(devicedefinitionphysicalcharacteristicsdepth.getSystem()));
		}
		/******************** devicedefinitionphysicalcharacteristicsweight ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicedefinitionphysicalcharacteristicsweight = devicedefinitionphysicalcharacteristics.getWeight();

		/******************** DvcDfn_PhysclCrctrstcs_Wght_Vl ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsweight.hasValue()) {
			d.setDvcDfnPhysclCrctrstcsWghtVl(String.valueOf(devicedefinitionphysicalcharacteristicsweight.getValue()));
		}
		/******************** devicedefinitionphysicalcharacteristicsweightcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicedefinitionphysicalcharacteristicsweightcomparator = devicedefinitionphysicalcharacteristicsweight.getComparator();
		d.setDvcDfnPhysclCrctrstcsWghtCmprtr(devicedefinitionphysicalcharacteristicsweightcomparator.toCode());

		/******************** DvcDfn_PhysclCrctrstcs_Wght_Cd ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsweight.hasCode()) {
			d.setDvcDfnPhysclCrctrstcsWghtCd(String.valueOf(devicedefinitionphysicalcharacteristicsweight.getCode()));
		}
		/******************** DvcDfn_PhysclCrctrstcs_Wght_Unt ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsweight.hasUnit()) {
			d.setDvcDfnPhysclCrctrstcsWghtUnt(String.valueOf(devicedefinitionphysicalcharacteristicsweight.getUnit()));
		}
		/******************** DvcDfn_PhysclCrctrstcs_Wght_Sys ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsweight.hasSystem()) {
			d.setDvcDfnPhysclCrctrstcsWghtSys(String.valueOf(devicedefinitionphysicalcharacteristicsweight.getSystem()));
		}
		/******************** devicedefinitionphysicalcharacteristicsscoring ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicedefinitionphysicalcharacteristicsscoring = devicedefinitionphysicalcharacteristics.getScoring();

		/******************** DvcDfn_PhysclCrctrstcs_Scoring_Txt ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsscoring.hasText()) {
			d.setDvcDfnPhysclCrctrstcsScoringTxt(String.valueOf(devicedefinitionphysicalcharacteristicsscoring.getText()));
		}
		/******************** devicedefinitionphysicalcharacteristicsscoringcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicedefinitionphysicalcharacteristicsscoringcoding = devicedefinitionphysicalcharacteristicsscoring.getCodingFirstRep();

		/******************** DvcDfn_PhysclCrctrstcs_Scoring_Cdg_Vrsn ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsscoringcoding.hasVersion()) {
			d.setDvcDfnPhysclCrctrstcsScoringCdgVrsn(String.valueOf(devicedefinitionphysicalcharacteristicsscoringcoding.getVersion()));
		}
		/******************** DvcDfn_PhysclCrctrstcs_Scoring_Cdg_Dsply ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsscoringcoding.hasDisplay()) {
			d.setDvcDfnPhysclCrctrstcsScoringCdgDsply(String.valueOf(devicedefinitionphysicalcharacteristicsscoringcoding.getDisplay()));
		}
		/******************** DvcDfn_PhysclCrctrstcs_Scoring_Cdg_Cd ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsscoringcoding.hasCode()) {
			d.setDvcDfnPhysclCrctrstcsScoringCdgCd(String.valueOf(devicedefinitionphysicalcharacteristicsscoringcoding.getCode()));
		}
		/******************** DvcDfn_PhysclCrctrstcs_Scoring_Cdg_UsrSltd ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsscoringcoding.hasUserSelected()) {
			d.setDvcDfnPhysclCrctrstcsScoringCdgUsrSltd(String.valueOf(devicedefinitionphysicalcharacteristicsscoringcoding.getUserSelected()));
		}
		/******************** DvcDfn_PhysclCrctrstcs_Scoring_Cdg_Sys ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsscoringcoding.hasSystem()) {
			d.setDvcDfnPhysclCrctrstcsScoringCdgSys(String.valueOf(devicedefinitionphysicalcharacteristicsscoringcoding.getSystem()));
		}
		/******************** devicedefinitionphysicalcharacteristicsimage ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment devicedefinitionphysicalcharacteristicsimage = devicedefinitionphysicalcharacteristics.getImageFirstRep();

		/******************** DvcDfn_PhysclCrctrstcs_Image_Sz ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsimage.hasSize()) {
			d.setDvcDfnPhysclCrctrstcsImageSz(String.valueOf(devicedefinitionphysicalcharacteristicsimage.getSize()));
		}
		/******************** DvcDfn_PhysclCrctrstcs_Image_Lnguage ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsimage.hasLanguage()) {
			d.setDvcDfnPhysclCrctrstcsImageLnguage(String.valueOf(devicedefinitionphysicalcharacteristicsimage.getLanguage()));
		}
		/******************** DvcDfn_PhysclCrctrstcs_Image_CntntTyp ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsimage.hasContentType()) {
			d.setDvcDfnPhysclCrctrstcsImageCntntTyp(String.valueOf(devicedefinitionphysicalcharacteristicsimage.getContentType()));
		}
		/******************** DvcDfn_PhysclCrctrstcs_Image_Ttl ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsimage.hasTitle()) {
			d.setDvcDfnPhysclCrctrstcsImageTtl(String.valueOf(devicedefinitionphysicalcharacteristicsimage.getTitle()));
		}
		/******************** DvcDfn_PhysclCrctrstcs_Image_Url ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsimage.hasUrl()) {
			d.setDvcDfnPhysclCrctrstcsImageUrl(String.valueOf(devicedefinitionphysicalcharacteristicsimage.getUrl()));
		}
		/******************** DvcDfn_PhysclCrctrstcs_Image_Data ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsimage.hasData()) {
			d.setDvcDfnPhysclCrctrstcsImageData(String.valueOf(devicedefinitionphysicalcharacteristicsimage.getData()));
		}

		/******************** DvcDfn_PhysclCrctrstcs_Image_Hash ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsimage.hasHash()) {
			d.setDvcDfnPhysclCrctrstcsImageHash(String.valueOf(devicedefinitionphysicalcharacteristicsimage.getHash()));
		}

		/******************** DvcDfn_PhysclCrctrstcs_Image_Creation ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsimage.hasCreation()) {
			d.setDvcDfnPhysclCrctrstcsImageCreation(String.valueOf(devicedefinitionphysicalcharacteristicsimage.getCreation()));
		}
		/******************** devicedefinitionphysicalcharacteristicsheight ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicedefinitionphysicalcharacteristicsheight = devicedefinitionphysicalcharacteristics.getHeight();

		/******************** DvcDfn_PhysclCrctrstcs_Height_Vl ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsheight.hasValue()) {
			d.setDvcDfnPhysclCrctrstcsHeightVl(String.valueOf(devicedefinitionphysicalcharacteristicsheight.getValue()));
		}
		/******************** devicedefinitionphysicalcharacteristicsheightcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicedefinitionphysicalcharacteristicsheightcomparator = devicedefinitionphysicalcharacteristicsheight.getComparator();
		d.setDvcDfnPhysclCrctrstcsHeightCmprtr(devicedefinitionphysicalcharacteristicsheightcomparator.toCode());

		/******************** DvcDfn_PhysclCrctrstcs_Height_Cd ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsheight.hasCode()) {
			d.setDvcDfnPhysclCrctrstcsHeightCd(String.valueOf(devicedefinitionphysicalcharacteristicsheight.getCode()));
		}
		/******************** DvcDfn_PhysclCrctrstcs_Height_Unt ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsheight.hasUnit()) {
			d.setDvcDfnPhysclCrctrstcsHeightUnt(String.valueOf(devicedefinitionphysicalcharacteristicsheight.getUnit()));
		}
		/******************** DvcDfn_PhysclCrctrstcs_Height_Sys ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicsheight.hasSystem()) {
			d.setDvcDfnPhysclCrctrstcsHeightSys(String.valueOf(devicedefinitionphysicalcharacteristicsheight.getSystem()));
		}
		/******************** devicedefinitionphysicalcharacteristicswidth ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicedefinitionphysicalcharacteristicswidth = devicedefinitionphysicalcharacteristics.getWidth();

		/******************** DvcDfn_PhysclCrctrstcs_Width_Vl ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicswidth.hasValue()) {
			d.setDvcDfnPhysclCrctrstcsWidthVl(String.valueOf(devicedefinitionphysicalcharacteristicswidth.getValue()));
		}
		/******************** devicedefinitionphysicalcharacteristicswidthcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicedefinitionphysicalcharacteristicswidthcomparator = devicedefinitionphysicalcharacteristicswidth.getComparator();
		d.setDvcDfnPhysclCrctrstcsWidthCmprtr(devicedefinitionphysicalcharacteristicswidthcomparator.toCode());

		/******************** DvcDfn_PhysclCrctrstcs_Width_Cd ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicswidth.hasCode()) {
			d.setDvcDfnPhysclCrctrstcsWidthCd(String.valueOf(devicedefinitionphysicalcharacteristicswidth.getCode()));
		}
		/******************** DvcDfn_PhysclCrctrstcs_Width_Unt ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicswidth.hasUnit()) {
			d.setDvcDfnPhysclCrctrstcsWidthUnt(String.valueOf(devicedefinitionphysicalcharacteristicswidth.getUnit()));
		}
		/******************** DvcDfn_PhysclCrctrstcs_Width_Sys ********************************************************************************/
		if(devicedefinitionphysicalcharacteristicswidth.hasSystem()) {
			d.setDvcDfnPhysclCrctrstcsWidthSys(String.valueOf(devicedefinitionphysicalcharacteristicswidth.getSystem()));
		}
		return d;
	}
}
