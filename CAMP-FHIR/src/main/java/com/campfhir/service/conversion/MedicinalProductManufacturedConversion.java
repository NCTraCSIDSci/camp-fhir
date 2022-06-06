package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProductManufactured;
public class MedicinalProductManufacturedConversion 
{
	public org.hl7.fhir.r4.model.MedicinalProductManufactured MedicinalProductManufactureds(MedicinalProductManufactured m) throws ParseException
	{
		org.hl7.fhir.r4.model.MedicinalProductManufactured medicinalproductmanufactured = new org.hl7.fhir.r4.model.MedicinalProductManufactured();

		/******************** id ********************************************************************************/
		medicinalproductmanufactured.setId(m.getId());

		/******************** MdcnlPrdctMnfctred_Igrdnt ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredIgrdnt() != null) {
			medicinalproductmanufactured.addIngredient( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctMnfctredIgrdnt()));
		}
		/******************** medicinalproductmanufacturedmanufactureddoseform ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductmanufacturedmanufactureddoseform =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductmanufactured.setManufacturedDoseForm(medicinalproductmanufacturedmanufactureddoseform);

		/******************** medicinalproductmanufacturedmanufactureddoseformcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductmanufacturedmanufactureddoseformcoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductmanufacturedmanufactureddoseform.addCoding(medicinalproductmanufacturedmanufactureddoseformcoding);

		/******************** MdcnlPrdctMnfctred_MnfctredDoseFrm_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredMnfctredDoseFrmCdgCd() != null) {
			medicinalproductmanufacturedmanufactureddoseformcoding.setCode(m.getMdcnlPrdctMnfctredMnfctredDoseFrmCdgCd());
		}
		/******************** MdcnlPrdctMnfctred_MnfctredDoseFrm_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredMnfctredDoseFrmCdgDsply() != null) {
			medicinalproductmanufacturedmanufactureddoseformcoding.setDisplay(m.getMdcnlPrdctMnfctredMnfctredDoseFrmCdgDsply());
		}
		/******************** MdcnlPrdctMnfctred_MnfctredDoseFrm_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredMnfctredDoseFrmCdgSys() != null) {
			medicinalproductmanufacturedmanufactureddoseformcoding.setSystem(m.getMdcnlPrdctMnfctredMnfctredDoseFrmCdgSys());
		}
		/******************** MdcnlPrdctMnfctred_MnfctredDoseFrm_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredMnfctredDoseFrmCdgUsrSltd() != null) {
			medicinalproductmanufacturedmanufactureddoseformcoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctMnfctredMnfctredDoseFrmCdgUsrSltd()));
		}
		/******************** MdcnlPrdctMnfctred_MnfctredDoseFrm_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredMnfctredDoseFrmCdgVrsn() != null) {
			medicinalproductmanufacturedmanufactureddoseformcoding.setVersion(m.getMdcnlPrdctMnfctredMnfctredDoseFrmCdgVrsn());
		}
		/******************** MdcnlPrdctMnfctred_MnfctredDoseFrm_Txt ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredMnfctredDoseFrmTxt() != null) {
			medicinalproductmanufacturedmanufactureddoseform.setText(m.getMdcnlPrdctMnfctredMnfctredDoseFrmTxt());
		}
		/******************** MdcnlPrdctMnfctred_Manufacturer ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredManufacturer() != null) {
			medicinalproductmanufactured.addManufacturer( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctMnfctredManufacturer()));
		}
		/******************** medicinalproductmanufacturedothercharacteristics ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductmanufacturedothercharacteristics =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductmanufactured.addOtherCharacteristics(medicinalproductmanufacturedothercharacteristics);

		/******************** medicinalproductmanufacturedothercharacteristicscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductmanufacturedothercharacteristicscoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductmanufacturedothercharacteristics.addCoding(medicinalproductmanufacturedothercharacteristicscoding);

		/******************** MdcnlPrdctMnfctred_OtherCrctrstcs_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredOtherCrctrstcsCdgCd() != null) {
			medicinalproductmanufacturedothercharacteristicscoding.setCode(m.getMdcnlPrdctMnfctredOtherCrctrstcsCdgCd());
		}
		/******************** MdcnlPrdctMnfctred_OtherCrctrstcs_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredOtherCrctrstcsCdgDsply() != null) {
			medicinalproductmanufacturedothercharacteristicscoding.setDisplay(m.getMdcnlPrdctMnfctredOtherCrctrstcsCdgDsply());
		}
		/******************** MdcnlPrdctMnfctred_OtherCrctrstcs_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredOtherCrctrstcsCdgSys() != null) {
			medicinalproductmanufacturedothercharacteristicscoding.setSystem(m.getMdcnlPrdctMnfctredOtherCrctrstcsCdgSys());
		}
		/******************** MdcnlPrdctMnfctred_OtherCrctrstcs_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredOtherCrctrstcsCdgUsrSltd() != null) {
			medicinalproductmanufacturedothercharacteristicscoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctMnfctredOtherCrctrstcsCdgUsrSltd()));
		}
		/******************** MdcnlPrdctMnfctred_OtherCrctrstcs_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredOtherCrctrstcsCdgVrsn() != null) {
			medicinalproductmanufacturedothercharacteristicscoding.setVersion(m.getMdcnlPrdctMnfctredOtherCrctrstcsCdgVrsn());
		}
		/******************** MdcnlPrdctMnfctred_OtherCrctrstcs_Txt ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredOtherCrctrstcsTxt() != null) {
			medicinalproductmanufacturedothercharacteristics.setText(m.getMdcnlPrdctMnfctredOtherCrctrstcsTxt());
		}
		/******************** medicinalproductmanufacturedphysicalcharacteristics ********************************************************************************/
		org.hl7.fhir.r4.model.ProdCharacteristic medicinalproductmanufacturedphysicalcharacteristics =  new org.hl7.fhir.r4.model.ProdCharacteristic();
		medicinalproductmanufactured.setPhysicalCharacteristics(medicinalproductmanufacturedphysicalcharacteristics);

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Color ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsColor() != null) {
			medicinalproductmanufacturedphysicalcharacteristics.addColor(m.getMdcnlPrdctMnfctredPhysclCrctrstcsColor());
		}
		/******************** medicinalproductmanufacturedphysicalcharacteristicsdepth ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductmanufacturedphysicalcharacteristicsdepth =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductmanufacturedphysicalcharacteristics.setDepth(medicinalproductmanufacturedphysicalcharacteristicsdepth);

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Depth_Cd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsDepthCd() != null) {
			medicinalproductmanufacturedphysicalcharacteristicsdepth.setCode(m.getMdcnlPrdctMnfctredPhysclCrctrstcsDepthCd());
		}
		/******************** medicinalproductmanufacturedphysicalcharacteristicsdepthcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductmanufacturedphysicalcharacteristicsdepthcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductmanufacturedphysicalcharacteristicsdepth.setComparator(medicinalproductmanufacturedphysicalcharacteristicsdepthcomparator.fromCode(m.getMdcnlPrdctMnfctredPhysclCrctrstcsDepthCmprtr()));

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Depth_Sys ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsDepthSys() != null) {
			medicinalproductmanufacturedphysicalcharacteristicsdepth.setSystem(m.getMdcnlPrdctMnfctredPhysclCrctrstcsDepthSys());
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Depth_Unt ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsDepthUnt() != null) {
			medicinalproductmanufacturedphysicalcharacteristicsdepth.setUnit(m.getMdcnlPrdctMnfctredPhysclCrctrstcsDepthUnt());
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Depth_Vl ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsDepthVl() != null) {
			medicinalproductmanufacturedphysicalcharacteristicsdepth.setValue(Double.parseDouble((m.getMdcnlPrdctMnfctredPhysclCrctrstcsDepthVl())));
		}
		/******************** medicinalproductmanufacturedphysicalcharacteristicsexternaldiameter ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductmanufacturedphysicalcharacteristicsexternaldiameter =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductmanufacturedphysicalcharacteristics.setExternalDiameter(medicinalproductmanufacturedphysicalcharacteristicsexternaldiameter);

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_ExternalDiameter_Cd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterCd() != null) {
			medicinalproductmanufacturedphysicalcharacteristicsexternaldiameter.setCode(m.getMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterCd());
		}
		/******************** medicinalproductmanufacturedphysicalcharacteristicsexternaldiametercomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductmanufacturedphysicalcharacteristicsexternaldiametercomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductmanufacturedphysicalcharacteristicsexternaldiameter.setComparator(medicinalproductmanufacturedphysicalcharacteristicsexternaldiametercomparator.fromCode(m.getMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterCmprtr()));

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_ExternalDiameter_Sys ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterSys() != null) {
			medicinalproductmanufacturedphysicalcharacteristicsexternaldiameter.setSystem(m.getMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterSys());
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_ExternalDiameter_Unt ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterUnt() != null) {
			medicinalproductmanufacturedphysicalcharacteristicsexternaldiameter.setUnit(m.getMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterUnt());
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_ExternalDiameter_Vl ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterVl() != null) {
			medicinalproductmanufacturedphysicalcharacteristicsexternaldiameter.setValue(Double.parseDouble((m.getMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterVl())));
		}
		/******************** medicinalproductmanufacturedphysicalcharacteristicsheight ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductmanufacturedphysicalcharacteristicsheight =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductmanufacturedphysicalcharacteristics.setHeight(medicinalproductmanufacturedphysicalcharacteristicsheight);

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Height_Cd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsHeightCd() != null) {
			medicinalproductmanufacturedphysicalcharacteristicsheight.setCode(m.getMdcnlPrdctMnfctredPhysclCrctrstcsHeightCd());
		}
		/******************** medicinalproductmanufacturedphysicalcharacteristicsheightcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductmanufacturedphysicalcharacteristicsheightcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductmanufacturedphysicalcharacteristicsheight.setComparator(medicinalproductmanufacturedphysicalcharacteristicsheightcomparator.fromCode(m.getMdcnlPrdctMnfctredPhysclCrctrstcsHeightCmprtr()));

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Height_Sys ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsHeightSys() != null) {
			medicinalproductmanufacturedphysicalcharacteristicsheight.setSystem(m.getMdcnlPrdctMnfctredPhysclCrctrstcsHeightSys());
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Height_Unt ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsHeightUnt() != null) {
			medicinalproductmanufacturedphysicalcharacteristicsheight.setUnit(m.getMdcnlPrdctMnfctredPhysclCrctrstcsHeightUnt());
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Height_Vl ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsHeightVl() != null) {
			medicinalproductmanufacturedphysicalcharacteristicsheight.setValue(Double.parseDouble((m.getMdcnlPrdctMnfctredPhysclCrctrstcsHeightVl())));
		}
		/******************** medicinalproductmanufacturedphysicalcharacteristicsimage ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment medicinalproductmanufacturedphysicalcharacteristicsimage =  new org.hl7.fhir.r4.model.Attachment();
		medicinalproductmanufacturedphysicalcharacteristics.addImage(medicinalproductmanufacturedphysicalcharacteristicsimage);

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Image_CntntTyp ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsImageCntntTyp() != null) {
			medicinalproductmanufacturedphysicalcharacteristicsimage.setContentType(m.getMdcnlPrdctMnfctredPhysclCrctrstcsImageCntntTyp());
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Image_Creation ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsImageCreation() != null) {
			java.text.SimpleDateFormat MdcnlPrdctMnfctred_PhysclCrctrstcs_Image_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctMnfctred_PhysclCrctrstcs_Image_Creationdate = MdcnlPrdctMnfctred_PhysclCrctrstcs_Image_Creationsdf.parse(m.getMdcnlPrdctMnfctredPhysclCrctrstcsImageCreation());
			medicinalproductmanufacturedphysicalcharacteristicsimage.setCreation(MdcnlPrdctMnfctred_PhysclCrctrstcs_Image_Creationdate);
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Image_Data ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsImageData() != null) {
			medicinalproductmanufacturedphysicalcharacteristicsimage.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(m.getMdcnlPrdctMnfctredPhysclCrctrstcsImageData()));
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Image_Hash ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsImageHash() != null) {
			medicinalproductmanufacturedphysicalcharacteristicsimage.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(m.getMdcnlPrdctMnfctredPhysclCrctrstcsImageHash()));
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Image_Lnguage ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsImageLnguage() != null) {
			medicinalproductmanufacturedphysicalcharacteristicsimage.setLanguage(m.getMdcnlPrdctMnfctredPhysclCrctrstcsImageLnguage());
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Image_Sz ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsImageSz() != null) {
			medicinalproductmanufacturedphysicalcharacteristicsimage.setSize(Integer.parseInt(m.getMdcnlPrdctMnfctredPhysclCrctrstcsImageSz()));
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Image_Ttl ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsImageTtl() != null) {
			medicinalproductmanufacturedphysicalcharacteristicsimage.setTitle(m.getMdcnlPrdctMnfctredPhysclCrctrstcsImageTtl());
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Image_Url ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsImageUrl() != null) {
			medicinalproductmanufacturedphysicalcharacteristicsimage.setUrl(m.getMdcnlPrdctMnfctredPhysclCrctrstcsImageUrl());
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Imprint ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsImprint() != null) {
			medicinalproductmanufacturedphysicalcharacteristics.addImprint(m.getMdcnlPrdctMnfctredPhysclCrctrstcsImprint());
		}
		/******************** medicinalproductmanufacturedphysicalcharacteristicsnominalvolume ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductmanufacturedphysicalcharacteristicsnominalvolume =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductmanufacturedphysicalcharacteristics.setNominalVolume(medicinalproductmanufacturedphysicalcharacteristicsnominalvolume);

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_NominalVolume_Cd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeCd() != null) {
			medicinalproductmanufacturedphysicalcharacteristicsnominalvolume.setCode(m.getMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeCd());
		}
		/******************** medicinalproductmanufacturedphysicalcharacteristicsnominalvolumecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductmanufacturedphysicalcharacteristicsnominalvolumecomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductmanufacturedphysicalcharacteristicsnominalvolume.setComparator(medicinalproductmanufacturedphysicalcharacteristicsnominalvolumecomparator.fromCode(m.getMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeCmprtr()));

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_NominalVolume_Sys ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeSys() != null) {
			medicinalproductmanufacturedphysicalcharacteristicsnominalvolume.setSystem(m.getMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeSys());
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_NominalVolume_Unt ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeUnt() != null) {
			medicinalproductmanufacturedphysicalcharacteristicsnominalvolume.setUnit(m.getMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeUnt());
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_NominalVolume_Vl ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeVl() != null) {
			medicinalproductmanufacturedphysicalcharacteristicsnominalvolume.setValue(Double.parseDouble((m.getMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeVl())));
		}
		/******************** medicinalproductmanufacturedphysicalcharacteristicsscoring ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductmanufacturedphysicalcharacteristicsscoring =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductmanufacturedphysicalcharacteristics.setScoring(medicinalproductmanufacturedphysicalcharacteristicsscoring);

		/******************** medicinalproductmanufacturedphysicalcharacteristicsscoringcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductmanufacturedphysicalcharacteristicsscoringcoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductmanufacturedphysicalcharacteristicsscoring.addCoding(medicinalproductmanufacturedphysicalcharacteristicsscoringcoding);

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Scoring_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgCd() != null) {
			medicinalproductmanufacturedphysicalcharacteristicsscoringcoding.setCode(m.getMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgCd());
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Scoring_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgDsply() != null) {
			medicinalproductmanufacturedphysicalcharacteristicsscoringcoding.setDisplay(m.getMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgDsply());
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Scoring_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgSys() != null) {
			medicinalproductmanufacturedphysicalcharacteristicsscoringcoding.setSystem(m.getMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgSys());
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Scoring_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgUsrSltd() != null) {
			medicinalproductmanufacturedphysicalcharacteristicsscoringcoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgUsrSltd()));
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Scoring_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgVrsn() != null) {
			medicinalproductmanufacturedphysicalcharacteristicsscoringcoding.setVersion(m.getMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgVrsn());
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Scoring_Txt ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsScoringTxt() != null) {
			medicinalproductmanufacturedphysicalcharacteristicsscoring.setText(m.getMdcnlPrdctMnfctredPhysclCrctrstcsScoringTxt());
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Shape ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsShape() != null) {
			medicinalproductmanufacturedphysicalcharacteristics.setShape(m.getMdcnlPrdctMnfctredPhysclCrctrstcsShape());
		}
		/******************** medicinalproductmanufacturedphysicalcharacteristicsweight ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductmanufacturedphysicalcharacteristicsweight =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductmanufacturedphysicalcharacteristics.setWeight(medicinalproductmanufacturedphysicalcharacteristicsweight);

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Wght_Cd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWghtCd() != null) {
			medicinalproductmanufacturedphysicalcharacteristicsweight.setCode(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWghtCd());
		}
		/******************** medicinalproductmanufacturedphysicalcharacteristicsweightcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductmanufacturedphysicalcharacteristicsweightcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductmanufacturedphysicalcharacteristicsweight.setComparator(medicinalproductmanufacturedphysicalcharacteristicsweightcomparator.fromCode(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWghtCmprtr()));

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Wght_Sys ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWghtSys() != null) {
			medicinalproductmanufacturedphysicalcharacteristicsweight.setSystem(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWghtSys());
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Wght_Unt ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWghtUnt() != null) {
			medicinalproductmanufacturedphysicalcharacteristicsweight.setUnit(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWghtUnt());
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Wght_Vl ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWghtVl() != null) {
			medicinalproductmanufacturedphysicalcharacteristicsweight.setValue(Double.parseDouble((m.getMdcnlPrdctMnfctredPhysclCrctrstcsWghtVl())));
		}
		/******************** medicinalproductmanufacturedphysicalcharacteristicswidth ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductmanufacturedphysicalcharacteristicswidth =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductmanufacturedphysicalcharacteristics.setWidth(medicinalproductmanufacturedphysicalcharacteristicswidth);

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Width_Cd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWidthCd() != null) {
			medicinalproductmanufacturedphysicalcharacteristicswidth.setCode(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWidthCd());
		}
		/******************** medicinalproductmanufacturedphysicalcharacteristicswidthcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductmanufacturedphysicalcharacteristicswidthcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductmanufacturedphysicalcharacteristicswidth.setComparator(medicinalproductmanufacturedphysicalcharacteristicswidthcomparator.fromCode(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWidthCmprtr()));

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Width_Sys ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWidthSys() != null) {
			medicinalproductmanufacturedphysicalcharacteristicswidth.setSystem(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWidthSys());
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Width_Unt ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWidthUnt() != null) {
			medicinalproductmanufacturedphysicalcharacteristicswidth.setUnit(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWidthUnt());
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Width_Vl ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredPhysclCrctrstcsWidthVl() != null) {
			medicinalproductmanufacturedphysicalcharacteristicswidth.setValue(Double.parseDouble((m.getMdcnlPrdctMnfctredPhysclCrctrstcsWidthVl())));
		}
		/******************** medicinalproductmanufacturedquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductmanufacturedquantity =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductmanufactured.setQuantity(medicinalproductmanufacturedquantity);

		/******************** MdcnlPrdctMnfctred_Qnty_Cd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredQntyCd() != null) {
			medicinalproductmanufacturedquantity.setCode(m.getMdcnlPrdctMnfctredQntyCd());
		}
		/******************** medicinalproductmanufacturedquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductmanufacturedquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductmanufacturedquantity.setComparator(medicinalproductmanufacturedquantitycomparator.fromCode(m.getMdcnlPrdctMnfctredQntyCmprtr()));

		/******************** MdcnlPrdctMnfctred_Qnty_Sys ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredQntySys() != null) {
			medicinalproductmanufacturedquantity.setSystem(m.getMdcnlPrdctMnfctredQntySys());
		}
		/******************** MdcnlPrdctMnfctred_Qnty_Unt ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredQntyUnt() != null) {
			medicinalproductmanufacturedquantity.setUnit(m.getMdcnlPrdctMnfctredQntyUnt());
		}
		/******************** MdcnlPrdctMnfctred_Qnty_Vl ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredQntyVl() != null) {
			medicinalproductmanufacturedquantity.setValue(Double.parseDouble((m.getMdcnlPrdctMnfctredQntyVl())));
		}
		/******************** medicinalproductmanufacturedunitofpresentation ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductmanufacturedunitofpresentation =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductmanufactured.setUnitOfPresentation(medicinalproductmanufacturedunitofpresentation);

		/******************** medicinalproductmanufacturedunitofpresentationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductmanufacturedunitofpresentationcoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductmanufacturedunitofpresentation.addCoding(medicinalproductmanufacturedunitofpresentationcoding);

		/******************** MdcnlPrdctMnfctred_UntOfPrsnttn_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredUntOfPrsnttnCdgCd() != null) {
			medicinalproductmanufacturedunitofpresentationcoding.setCode(m.getMdcnlPrdctMnfctredUntOfPrsnttnCdgCd());
		}
		/******************** MdcnlPrdctMnfctred_UntOfPrsnttn_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredUntOfPrsnttnCdgDsply() != null) {
			medicinalproductmanufacturedunitofpresentationcoding.setDisplay(m.getMdcnlPrdctMnfctredUntOfPrsnttnCdgDsply());
		}
		/******************** MdcnlPrdctMnfctred_UntOfPrsnttn_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredUntOfPrsnttnCdgSys() != null) {
			medicinalproductmanufacturedunitofpresentationcoding.setSystem(m.getMdcnlPrdctMnfctredUntOfPrsnttnCdgSys());
		}
		/******************** MdcnlPrdctMnfctred_UntOfPrsnttn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredUntOfPrsnttnCdgUsrSltd() != null) {
			medicinalproductmanufacturedunitofpresentationcoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctMnfctredUntOfPrsnttnCdgUsrSltd()));
		}
		/******************** MdcnlPrdctMnfctred_UntOfPrsnttn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredUntOfPrsnttnCdgVrsn() != null) {
			medicinalproductmanufacturedunitofpresentationcoding.setVersion(m.getMdcnlPrdctMnfctredUntOfPrsnttnCdgVrsn());
		}
		/******************** MdcnlPrdctMnfctred_UntOfPrsnttn_Txt ********************************************************************************/
		if(m.getMdcnlPrdctMnfctredUntOfPrsnttnTxt() != null) {
			medicinalproductmanufacturedunitofpresentation.setText(m.getMdcnlPrdctMnfctredUntOfPrsnttnTxt());
		}
		return medicinalproductmanufactured;
	}
}
