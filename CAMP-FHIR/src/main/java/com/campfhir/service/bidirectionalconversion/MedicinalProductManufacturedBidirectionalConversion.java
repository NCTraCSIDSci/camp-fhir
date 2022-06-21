package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProductManufactured;
public class MedicinalProductManufacturedBidirectionalConversion 
{
	public MedicinalProductManufactured MedicinalProductManufactureds(org.hl7.fhir.r4.model.MedicinalProductManufactured medicinalproductmanufactured) throws ParseException
	{
		 main.java.com.campfhir.model.MedicinalProductManufactured m = new  main.java.com.campfhir.model.MedicinalProductManufactured();

		/******************** id ********************************************************************************/
		medicinalproductmanufactured.setId(m.getId());

		/******************** MdcnlPrdctMnfctred_Manufacturer ********************************************************************************/
		if(medicinalproductmanufactured.hasManufacturer()) {
			m.setMdcnlPrdctMnfctredManufacturer(String.valueOf(medicinalproductmanufactured.getManufacturerFirstRep()));
		}
		/******************** medicinalproductmanufacturedunitofpresentation ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductmanufacturedunitofpresentation = medicinalproductmanufactured.getUnitOfPresentation();

		/******************** medicinalproductmanufacturedunitofpresentationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductmanufacturedunitofpresentationcoding = medicinalproductmanufacturedunitofpresentation.getCodingFirstRep();

		/******************** MdcnlPrdctMnfctred_UntOfPrsnttn_Cdg_Dsply ********************************************************************************/
		if(medicinalproductmanufacturedunitofpresentationcoding.hasDisplay()) {
			m.setMdcnlPrdctMnfctredUntOfPrsnttnCdgDsply(String.valueOf(medicinalproductmanufacturedunitofpresentationcoding.getDisplay()));
		}
		/******************** MdcnlPrdctMnfctred_UntOfPrsnttn_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductmanufacturedunitofpresentationcoding.hasVersion()) {
			m.setMdcnlPrdctMnfctredUntOfPrsnttnCdgVrsn(String.valueOf(medicinalproductmanufacturedunitofpresentationcoding.getVersion()));
		}
		/******************** MdcnlPrdctMnfctred_UntOfPrsnttn_Cdg_Cd ********************************************************************************/
		if(medicinalproductmanufacturedunitofpresentationcoding.hasCode()) {
			m.setMdcnlPrdctMnfctredUntOfPrsnttnCdgCd(String.valueOf(medicinalproductmanufacturedunitofpresentationcoding.getCode()));
		}
		/******************** MdcnlPrdctMnfctred_UntOfPrsnttn_Cdg_Sys ********************************************************************************/
		if(medicinalproductmanufacturedunitofpresentationcoding.hasSystem()) {
			m.setMdcnlPrdctMnfctredUntOfPrsnttnCdgSys(String.valueOf(medicinalproductmanufacturedunitofpresentationcoding.getSystem()));
		}
		/******************** MdcnlPrdctMnfctred_UntOfPrsnttn_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductmanufacturedunitofpresentationcoding.hasUserSelected()) {
			m.setMdcnlPrdctMnfctredUntOfPrsnttnCdgUsrSltd(String.valueOf(medicinalproductmanufacturedunitofpresentationcoding.getUserSelected()));
		}
		/******************** MdcnlPrdctMnfctred_UntOfPrsnttn_Txt ********************************************************************************/
		if(medicinalproductmanufacturedunitofpresentation.hasText()) {
			m.setMdcnlPrdctMnfctredUntOfPrsnttnTxt(String.valueOf(medicinalproductmanufacturedunitofpresentation.getText()));
		}
		/******************** medicinalproductmanufacturedphysicalcharacteristics ********************************************************************************/
		org.hl7.fhir.r4.model.ProdCharacteristic medicinalproductmanufacturedphysicalcharacteristics = medicinalproductmanufactured.getPhysicalCharacteristics();

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Shape ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristics.hasShape()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsShape(String.valueOf(medicinalproductmanufacturedphysicalcharacteristics.getShape()));
		}
		/******************** medicinalproductmanufacturedphysicalcharacteristicsexternaldiameter ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductmanufacturedphysicalcharacteristicsexternaldiameter = medicinalproductmanufacturedphysicalcharacteristics.getExternalDiameter();

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_ExternalDiameter_Vl ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsexternaldiameter.hasValue()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterVl(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsexternaldiameter.getValue()));
		}
		/******************** medicinalproductmanufacturedphysicalcharacteristicsexternaldiametercomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductmanufacturedphysicalcharacteristicsexternaldiametercomparator = medicinalproductmanufacturedphysicalcharacteristicsexternaldiameter.getComparator();
		m.setMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterCmprtr(medicinalproductmanufacturedphysicalcharacteristicsexternaldiametercomparator.toCode());

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_ExternalDiameter_Cd ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsexternaldiameter.hasCode()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterCd(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsexternaldiameter.getCode()));
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_ExternalDiameter_Sys ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsexternaldiameter.hasSystem()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterSys(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsexternaldiameter.getSystem()));
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_ExternalDiameter_Unt ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsexternaldiameter.hasUnit()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterUnt(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsexternaldiameter.getUnit()));
		}
		/******************** medicinalproductmanufacturedphysicalcharacteristicsimage ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment medicinalproductmanufacturedphysicalcharacteristicsimage = medicinalproductmanufacturedphysicalcharacteristics.getImageFirstRep();

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Image_Sz ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsimage.hasSize()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsImageSz(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsimage.getSize()));
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Image_Lnguage ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsimage.hasLanguage()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsImageLnguage(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsimage.getLanguage()));
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Image_CntntTyp ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsimage.hasContentType()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsImageCntntTyp(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsimage.getContentType()));
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Image_Url ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsimage.hasUrl()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsImageUrl(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsimage.getUrl()));
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Image_Ttl ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsimage.hasTitle()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsImageTtl(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsimage.getTitle()));
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Image_Hash ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsimage.hasHash()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsImageHash(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsimage.getHash()));
		}

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Image_Data ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsimage.hasData()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsImageData(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsimage.getData()));
		}

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Image_Creation ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsimage.hasCreation()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsImageCreation(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsimage.getCreation()));
		}
		/******************** medicinalproductmanufacturedphysicalcharacteristicsheight ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductmanufacturedphysicalcharacteristicsheight = medicinalproductmanufacturedphysicalcharacteristics.getHeight();

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Height_Vl ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsheight.hasValue()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsHeightVl(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsheight.getValue()));
		}
		/******************** medicinalproductmanufacturedphysicalcharacteristicsheightcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductmanufacturedphysicalcharacteristicsheightcomparator = medicinalproductmanufacturedphysicalcharacteristicsheight.getComparator();
		m.setMdcnlPrdctMnfctredPhysclCrctrstcsHeightCmprtr(medicinalproductmanufacturedphysicalcharacteristicsheightcomparator.toCode());

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Height_Cd ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsheight.hasCode()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsHeightCd(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsheight.getCode()));
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Height_Sys ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsheight.hasSystem()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsHeightSys(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsheight.getSystem()));
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Height_Unt ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsheight.hasUnit()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsHeightUnt(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsheight.getUnit()));
		}
		/******************** medicinalproductmanufacturedphysicalcharacteristicswidth ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductmanufacturedphysicalcharacteristicswidth = medicinalproductmanufacturedphysicalcharacteristics.getWidth();

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Width_Vl ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicswidth.hasValue()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsWidthVl(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicswidth.getValue()));
		}
		/******************** medicinalproductmanufacturedphysicalcharacteristicswidthcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductmanufacturedphysicalcharacteristicswidthcomparator = medicinalproductmanufacturedphysicalcharacteristicswidth.getComparator();
		m.setMdcnlPrdctMnfctredPhysclCrctrstcsWidthCmprtr(medicinalproductmanufacturedphysicalcharacteristicswidthcomparator.toCode());

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Width_Cd ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicswidth.hasCode()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsWidthCd(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicswidth.getCode()));
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Width_Sys ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicswidth.hasSystem()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsWidthSys(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicswidth.getSystem()));
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Width_Unt ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicswidth.hasUnit()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsWidthUnt(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicswidth.getUnit()));
		}
		/******************** medicinalproductmanufacturedphysicalcharacteristicsnominalvolume ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductmanufacturedphysicalcharacteristicsnominalvolume = medicinalproductmanufacturedphysicalcharacteristics.getNominalVolume();

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_NominalVolume_Vl ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsnominalvolume.hasValue()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeVl(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsnominalvolume.getValue()));
		}
		/******************** medicinalproductmanufacturedphysicalcharacteristicsnominalvolumecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductmanufacturedphysicalcharacteristicsnominalvolumecomparator = medicinalproductmanufacturedphysicalcharacteristicsnominalvolume.getComparator();
		m.setMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeCmprtr(medicinalproductmanufacturedphysicalcharacteristicsnominalvolumecomparator.toCode());

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_NominalVolume_Cd ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsnominalvolume.hasCode()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeCd(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsnominalvolume.getCode()));
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_NominalVolume_Sys ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsnominalvolume.hasSystem()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeSys(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsnominalvolume.getSystem()));
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_NominalVolume_Unt ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsnominalvolume.hasUnit()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeUnt(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsnominalvolume.getUnit()));
		}
		/******************** medicinalproductmanufacturedphysicalcharacteristicsweight ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductmanufacturedphysicalcharacteristicsweight = medicinalproductmanufacturedphysicalcharacteristics.getWeight();

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Wght_Vl ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsweight.hasValue()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsWghtVl(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsweight.getValue()));
		}
		/******************** medicinalproductmanufacturedphysicalcharacteristicsweightcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductmanufacturedphysicalcharacteristicsweightcomparator = medicinalproductmanufacturedphysicalcharacteristicsweight.getComparator();
		m.setMdcnlPrdctMnfctredPhysclCrctrstcsWghtCmprtr(medicinalproductmanufacturedphysicalcharacteristicsweightcomparator.toCode());

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Wght_Cd ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsweight.hasCode()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsWghtCd(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsweight.getCode()));
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Wght_Sys ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsweight.hasSystem()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsWghtSys(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsweight.getSystem()));
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Wght_Unt ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsweight.hasUnit()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsWghtUnt(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsweight.getUnit()));
		}
		/******************** medicinalproductmanufacturedphysicalcharacteristicsdepth ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductmanufacturedphysicalcharacteristicsdepth = medicinalproductmanufacturedphysicalcharacteristics.getDepth();

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Depth_Vl ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsdepth.hasValue()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsDepthVl(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsdepth.getValue()));
		}
		/******************** medicinalproductmanufacturedphysicalcharacteristicsdepthcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductmanufacturedphysicalcharacteristicsdepthcomparator = medicinalproductmanufacturedphysicalcharacteristicsdepth.getComparator();
		m.setMdcnlPrdctMnfctredPhysclCrctrstcsDepthCmprtr(medicinalproductmanufacturedphysicalcharacteristicsdepthcomparator.toCode());

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Depth_Cd ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsdepth.hasCode()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsDepthCd(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsdepth.getCode()));
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Depth_Sys ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsdepth.hasSystem()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsDepthSys(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsdepth.getSystem()));
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Depth_Unt ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsdepth.hasUnit()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsDepthUnt(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsdepth.getUnit()));
		}
		/******************** medicinalproductmanufacturedphysicalcharacteristicsscoring ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductmanufacturedphysicalcharacteristicsscoring = medicinalproductmanufacturedphysicalcharacteristics.getScoring();

		/******************** medicinalproductmanufacturedphysicalcharacteristicsscoringcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductmanufacturedphysicalcharacteristicsscoringcoding = medicinalproductmanufacturedphysicalcharacteristicsscoring.getCodingFirstRep();

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Scoring_Cdg_Dsply ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsscoringcoding.hasDisplay()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgDsply(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsscoringcoding.getDisplay()));
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Scoring_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsscoringcoding.hasVersion()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgVrsn(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsscoringcoding.getVersion()));
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Scoring_Cdg_Cd ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsscoringcoding.hasCode()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgCd(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsscoringcoding.getCode()));
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Scoring_Cdg_Sys ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsscoringcoding.hasSystem()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgSys(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsscoringcoding.getSystem()));
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Scoring_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsscoringcoding.hasUserSelected()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgUsrSltd(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsscoringcoding.getUserSelected()));
		}
		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Scoring_Txt ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsscoring.hasText()) {
			m.setMdcnlPrdctMnfctredPhysclCrctrstcsScoringTxt(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsscoring.getText()));
		}
		/******************** medicinalproductmanufacturedothercharacteristics ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductmanufacturedothercharacteristics = medicinalproductmanufactured.getOtherCharacteristicsFirstRep();

		/******************** medicinalproductmanufacturedothercharacteristicscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductmanufacturedothercharacteristicscoding = medicinalproductmanufacturedothercharacteristics.getCodingFirstRep();

		/******************** MdcnlPrdctMnfctred_OtherCrctrstcs_Cdg_Dsply ********************************************************************************/
		if(medicinalproductmanufacturedothercharacteristicscoding.hasDisplay()) {
			m.setMdcnlPrdctMnfctredOtherCrctrstcsCdgDsply(String.valueOf(medicinalproductmanufacturedothercharacteristicscoding.getDisplay()));
		}
		/******************** MdcnlPrdctMnfctred_OtherCrctrstcs_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductmanufacturedothercharacteristicscoding.hasVersion()) {
			m.setMdcnlPrdctMnfctredOtherCrctrstcsCdgVrsn(String.valueOf(medicinalproductmanufacturedothercharacteristicscoding.getVersion()));
		}
		/******************** MdcnlPrdctMnfctred_OtherCrctrstcs_Cdg_Cd ********************************************************************************/
		if(medicinalproductmanufacturedothercharacteristicscoding.hasCode()) {
			m.setMdcnlPrdctMnfctredOtherCrctrstcsCdgCd(String.valueOf(medicinalproductmanufacturedothercharacteristicscoding.getCode()));
		}
		/******************** MdcnlPrdctMnfctred_OtherCrctrstcs_Cdg_Sys ********************************************************************************/
		if(medicinalproductmanufacturedothercharacteristicscoding.hasSystem()) {
			m.setMdcnlPrdctMnfctredOtherCrctrstcsCdgSys(String.valueOf(medicinalproductmanufacturedothercharacteristicscoding.getSystem()));
		}
		/******************** MdcnlPrdctMnfctred_OtherCrctrstcs_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductmanufacturedothercharacteristicscoding.hasUserSelected()) {
			m.setMdcnlPrdctMnfctredOtherCrctrstcsCdgUsrSltd(String.valueOf(medicinalproductmanufacturedothercharacteristicscoding.getUserSelected()));
		}
		/******************** MdcnlPrdctMnfctred_OtherCrctrstcs_Txt ********************************************************************************/
		if(medicinalproductmanufacturedothercharacteristics.hasText()) {
			m.setMdcnlPrdctMnfctredOtherCrctrstcsTxt(String.valueOf(medicinalproductmanufacturedothercharacteristics.getText()));
		}
		/******************** medicinalproductmanufacturedmanufactureddoseform ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductmanufacturedmanufactureddoseform = medicinalproductmanufactured.getManufacturedDoseForm();

		/******************** medicinalproductmanufacturedmanufactureddoseformcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductmanufacturedmanufactureddoseformcoding = medicinalproductmanufacturedmanufactureddoseform.getCodingFirstRep();

		/******************** MdcnlPrdctMnfctred_MnfctredDoseFrm_Cdg_Dsply ********************************************************************************/
		if(medicinalproductmanufacturedmanufactureddoseformcoding.hasDisplay()) {
			m.setMdcnlPrdctMnfctredMnfctredDoseFrmCdgDsply(String.valueOf(medicinalproductmanufacturedmanufactureddoseformcoding.getDisplay()));
		}
		/******************** MdcnlPrdctMnfctred_MnfctredDoseFrm_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductmanufacturedmanufactureddoseformcoding.hasVersion()) {
			m.setMdcnlPrdctMnfctredMnfctredDoseFrmCdgVrsn(String.valueOf(medicinalproductmanufacturedmanufactureddoseformcoding.getVersion()));
		}
		/******************** MdcnlPrdctMnfctred_MnfctredDoseFrm_Cdg_Cd ********************************************************************************/
		if(medicinalproductmanufacturedmanufactureddoseformcoding.hasCode()) {
			m.setMdcnlPrdctMnfctredMnfctredDoseFrmCdgCd(String.valueOf(medicinalproductmanufacturedmanufactureddoseformcoding.getCode()));
		}
		/******************** MdcnlPrdctMnfctred_MnfctredDoseFrm_Cdg_Sys ********************************************************************************/
		if(medicinalproductmanufacturedmanufactureddoseformcoding.hasSystem()) {
			m.setMdcnlPrdctMnfctredMnfctredDoseFrmCdgSys(String.valueOf(medicinalproductmanufacturedmanufactureddoseformcoding.getSystem()));
		}
		/******************** MdcnlPrdctMnfctred_MnfctredDoseFrm_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductmanufacturedmanufactureddoseformcoding.hasUserSelected()) {
			m.setMdcnlPrdctMnfctredMnfctredDoseFrmCdgUsrSltd(String.valueOf(medicinalproductmanufacturedmanufactureddoseformcoding.getUserSelected()));
		}
		/******************** MdcnlPrdctMnfctred_MnfctredDoseFrm_Txt ********************************************************************************/
		if(medicinalproductmanufacturedmanufactureddoseform.hasText()) {
			m.setMdcnlPrdctMnfctredMnfctredDoseFrmTxt(String.valueOf(medicinalproductmanufacturedmanufactureddoseform.getText()));
		}
		/******************** medicinalproductmanufacturedquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductmanufacturedquantity = medicinalproductmanufactured.getQuantity();

		/******************** MdcnlPrdctMnfctred_Qnty_Vl ********************************************************************************/
		if(medicinalproductmanufacturedquantity.hasValue()) {
			m.setMdcnlPrdctMnfctredQntyVl(String.valueOf(medicinalproductmanufacturedquantity.getValue()));
		}
		/******************** medicinalproductmanufacturedquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductmanufacturedquantitycomparator = medicinalproductmanufacturedquantity.getComparator();
		m.setMdcnlPrdctMnfctredQntyCmprtr(medicinalproductmanufacturedquantitycomparator.toCode());

		/******************** MdcnlPrdctMnfctred_Qnty_Cd ********************************************************************************/
		if(medicinalproductmanufacturedquantity.hasCode()) {
			m.setMdcnlPrdctMnfctredQntyCd(String.valueOf(medicinalproductmanufacturedquantity.getCode()));
		}
		/******************** MdcnlPrdctMnfctred_Qnty_Sys ********************************************************************************/
		if(medicinalproductmanufacturedquantity.hasSystem()) {
			m.setMdcnlPrdctMnfctredQntySys(String.valueOf(medicinalproductmanufacturedquantity.getSystem()));
		}
		/******************** MdcnlPrdctMnfctred_Qnty_Unt ********************************************************************************/
		if(medicinalproductmanufacturedquantity.hasUnit()) {
			m.setMdcnlPrdctMnfctredQntyUnt(String.valueOf(medicinalproductmanufacturedquantity.getUnit()));
		}
		/******************** MdcnlPrdctMnfctred_Igrdnt ********************************************************************************/
		if(medicinalproductmanufactured.hasIngredient()) {
			m.setMdcnlPrdctMnfctredIgrdnt(String.valueOf(medicinalproductmanufactured.getIngredientFirstRep()));
		}
		return m;
	}
}
