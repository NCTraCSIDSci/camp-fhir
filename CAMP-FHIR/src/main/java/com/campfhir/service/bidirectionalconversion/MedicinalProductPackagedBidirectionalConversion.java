package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProductPackaged;
public class MedicinalProductPackagedBidirectionalConversion 
{
	public MedicinalProductPackaged MedicinalProductPackageds(org.hl7.fhir.r4.model.MedicinalProductPackaged medicinalproductpackaged) throws ParseException
	{
		 main.java.com.campfhir.model.MedicinalProductPackaged m = new  main.java.com.campfhir.model.MedicinalProductPackaged();

		/******************** id ********************************************************************************/
		medicinalproductpackaged.setId(m.getId());

		/******************** MdcnlPrdctPckged_Manufacturer ********************************************************************************/
		if(medicinalproductpackaged.hasManufacturer()) {
			m.setMdcnlPrdctPckgedManufacturer(String.valueOf(medicinalproductpackaged.getManufacturerFirstRep()));
		}
		/******************** medicinalproductpackagedpackageitem ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProductPackaged.MedicinalProductPackagedPackageItemComponent medicinalproductpackagedpackageitem = medicinalproductpackaged.getPackageItemFirstRep();

		/******************** medicinalproductpackagedpackageitemtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedpackageitemtype = medicinalproductpackagedpackageitem.getType();

		/******************** medicinalproductpackagedpackageitemtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpackagedpackageitemtypecoding = medicinalproductpackagedpackageitemtype.getCodingFirstRep();

		/******************** MdcnlPrdctPckged_PckgItm_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpackagedpackageitemtypecoding.hasDisplay()) {
			m.setMdcnlPrdctPckgedPckgItmTypCdgDsply(String.valueOf(medicinalproductpackagedpackageitemtypecoding.getDisplay()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpackagedpackageitemtypecoding.hasVersion()) {
			m.setMdcnlPrdctPckgedPckgItmTypCdgVrsn(String.valueOf(medicinalproductpackagedpackageitemtypecoding.getVersion()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductpackagedpackageitemtypecoding.hasCode()) {
			m.setMdcnlPrdctPckgedPckgItmTypCdgCd(String.valueOf(medicinalproductpackagedpackageitemtypecoding.getCode()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemtypecoding.hasSystem()) {
			m.setMdcnlPrdctPckgedPckgItmTypCdgSys(String.valueOf(medicinalproductpackagedpackageitemtypecoding.getSystem()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpackagedpackageitemtypecoding.hasUserSelected()) {
			m.setMdcnlPrdctPckgedPckgItmTypCdgUsrSltd(String.valueOf(medicinalproductpackagedpackageitemtypecoding.getUserSelected()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_Typ_Txt ********************************************************************************/
		if(medicinalproductpackagedpackageitemtype.hasText()) {
			m.setMdcnlPrdctPckgedPckgItmTypTxt(String.valueOf(medicinalproductpackagedpackageitemtype.getText()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_Manufacturer ********************************************************************************/
		if(medicinalproductpackagedpackageitem.hasManufacturer()) {
			m.setMdcnlPrdctPckgedPckgItmManufacturer(String.valueOf(medicinalproductpackagedpackageitem.getManufacturerFirstRep()));
		}
		/******************** medicinalproductpackagedpackageitemphysicalcharacteristics ********************************************************************************/
		org.hl7.fhir.r4.model.ProdCharacteristic medicinalproductpackagedpackageitemphysicalcharacteristics = medicinalproductpackagedpackageitem.getPhysicalCharacteristics();

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Shape ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristics.hasShape()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsShape(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristics.getShape()));
		}
		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiameter ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiameter = medicinalproductpackagedpackageitemphysicalcharacteristics.getExternalDiameter();

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_ExternalDiameter_Vl ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiameter.hasValue()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsExternalDiameterVl(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiameter.getValue()));
		}
		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiametercomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiametercomparator = medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiameter.getComparator();
		m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsExternalDiameterCmprtr(medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiametercomparator.toCode());

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_ExternalDiameter_Cd ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiameter.hasCode()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsExternalDiameterCd(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiameter.getCode()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_ExternalDiameter_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiameter.hasSystem()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsExternalDiameterSys(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiameter.getSystem()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_ExternalDiameter_Unt ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiameter.hasUnit()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsExternalDiameterUnt(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsexternaldiameter.getUnit()));
		}
		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsimage ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment medicinalproductpackagedpackageitemphysicalcharacteristicsimage = medicinalproductpackagedpackageitemphysicalcharacteristics.getImageFirstRep();

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Image_Sz ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsimage.hasSize()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageSz(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsimage.getSize()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Image_Lnguage ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsimage.hasLanguage()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageLnguage(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsimage.getLanguage()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Image_CntntTyp ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsimage.hasContentType()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageCntntTyp(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsimage.getContentType()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Image_Url ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsimage.hasUrl()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageUrl(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsimage.getUrl()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Image_Ttl ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsimage.hasTitle()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageTtl(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsimage.getTitle()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Image_Hash ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsimage.hasHash()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageHash(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsimage.getHash()));
		}

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Image_Data ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsimage.hasData()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageData(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsimage.getData()));
		}

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Image_Creation ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsimage.hasCreation()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsImageCreation(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsimage.getCreation()));
		}
		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsheight ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpackagedpackageitemphysicalcharacteristicsheight = medicinalproductpackagedpackageitemphysicalcharacteristics.getHeight();

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Height_Vl ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsheight.hasValue()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsHeightVl(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsheight.getValue()));
		}
		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsheightcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductpackagedpackageitemphysicalcharacteristicsheightcomparator = medicinalproductpackagedpackageitemphysicalcharacteristicsheight.getComparator();
		m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsHeightCmprtr(medicinalproductpackagedpackageitemphysicalcharacteristicsheightcomparator.toCode());

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Height_Cd ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsheight.hasCode()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsHeightCd(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsheight.getCode()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Height_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsheight.hasSystem()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsHeightSys(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsheight.getSystem()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Height_Unt ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsheight.hasUnit()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsHeightUnt(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsheight.getUnit()));
		}
		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicswidth ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpackagedpackageitemphysicalcharacteristicswidth = medicinalproductpackagedpackageitemphysicalcharacteristics.getWidth();

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Width_Vl ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicswidth.hasValue()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWidthVl(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicswidth.getValue()));
		}
		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicswidthcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductpackagedpackageitemphysicalcharacteristicswidthcomparator = medicinalproductpackagedpackageitemphysicalcharacteristicswidth.getComparator();
		m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWidthCmprtr(medicinalproductpackagedpackageitemphysicalcharacteristicswidthcomparator.toCode());

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Width_Cd ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicswidth.hasCode()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWidthCd(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicswidth.getCode()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Width_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicswidth.hasSystem()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWidthSys(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicswidth.getSystem()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Width_Unt ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicswidth.hasUnit()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWidthUnt(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicswidth.getUnit()));
		}
		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolume ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolume = medicinalproductpackagedpackageitemphysicalcharacteristics.getNominalVolume();

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_NominalVolume_Vl ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolume.hasValue()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsNominalVolumeVl(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolume.getValue()));
		}
		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolumecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolumecomparator = medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolume.getComparator();
		m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsNominalVolumeCmprtr(medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolumecomparator.toCode());

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_NominalVolume_Cd ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolume.hasCode()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsNominalVolumeCd(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolume.getCode()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_NominalVolume_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolume.hasSystem()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsNominalVolumeSys(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolume.getSystem()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_NominalVolume_Unt ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolume.hasUnit()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsNominalVolumeUnt(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsnominalvolume.getUnit()));
		}
		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsweight ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpackagedpackageitemphysicalcharacteristicsweight = medicinalproductpackagedpackageitemphysicalcharacteristics.getWeight();

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Wght_Vl ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsweight.hasValue()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWghtVl(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsweight.getValue()));
		}
		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsweightcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductpackagedpackageitemphysicalcharacteristicsweightcomparator = medicinalproductpackagedpackageitemphysicalcharacteristicsweight.getComparator();
		m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWghtCmprtr(medicinalproductpackagedpackageitemphysicalcharacteristicsweightcomparator.toCode());

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Wght_Cd ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsweight.hasCode()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWghtCd(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsweight.getCode()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Wght_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsweight.hasSystem()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWghtSys(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsweight.getSystem()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Wght_Unt ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsweight.hasUnit()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsWghtUnt(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsweight.getUnit()));
		}
		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsdepth ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpackagedpackageitemphysicalcharacteristicsdepth = medicinalproductpackagedpackageitemphysicalcharacteristics.getDepth();

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Depth_Vl ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsdepth.hasValue()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsDepthVl(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsdepth.getValue()));
		}
		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsdepthcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductpackagedpackageitemphysicalcharacteristicsdepthcomparator = medicinalproductpackagedpackageitemphysicalcharacteristicsdepth.getComparator();
		m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsDepthCmprtr(medicinalproductpackagedpackageitemphysicalcharacteristicsdepthcomparator.toCode());

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Depth_Cd ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsdepth.hasCode()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsDepthCd(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsdepth.getCode()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Depth_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsdepth.hasSystem()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsDepthSys(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsdepth.getSystem()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Depth_Unt ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsdepth.hasUnit()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsDepthUnt(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsdepth.getUnit()));
		}
		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsscoring ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedpackageitemphysicalcharacteristicsscoring = medicinalproductpackagedpackageitemphysicalcharacteristics.getScoring();

		/******************** medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcoding = medicinalproductpackagedpackageitemphysicalcharacteristicsscoring.getCodingFirstRep();

		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Scoring_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcoding.hasDisplay()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgDsply(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcoding.getDisplay()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Scoring_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcoding.hasVersion()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgVrsn(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcoding.getVersion()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Scoring_Cdg_Cd ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcoding.hasCode()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgCd(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcoding.getCode()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Scoring_Cdg_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcoding.hasSystem()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgSys(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcoding.getSystem()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Scoring_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcoding.hasUserSelected()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringCdgUsrSltd(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsscoringcoding.getUserSelected()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_PhysclCrctrstcs_Scoring_Txt ********************************************************************************/
		if(medicinalproductpackagedpackageitemphysicalcharacteristicsscoring.hasText()) {
			m.setMdcnlPrdctPckgedPckgItmPhysclCrctrstcsScoringTxt(String.valueOf(medicinalproductpackagedpackageitemphysicalcharacteristicsscoring.getText()));
		}
		/******************** medicinalproductpackagedpackageitemothercharacteristics ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedpackageitemothercharacteristics = medicinalproductpackagedpackageitem.getOtherCharacteristicsFirstRep();

		/******************** medicinalproductpackagedpackageitemothercharacteristicscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpackagedpackageitemothercharacteristicscoding = medicinalproductpackagedpackageitemothercharacteristics.getCodingFirstRep();

		/******************** MdcnlPrdctPckged_PckgItm_OtherCrctrstcs_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpackagedpackageitemothercharacteristicscoding.hasDisplay()) {
			m.setMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgDsply(String.valueOf(medicinalproductpackagedpackageitemothercharacteristicscoding.getDisplay()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_OtherCrctrstcs_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpackagedpackageitemothercharacteristicscoding.hasVersion()) {
			m.setMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgVrsn(String.valueOf(medicinalproductpackagedpackageitemothercharacteristicscoding.getVersion()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_OtherCrctrstcs_Cdg_Cd ********************************************************************************/
		if(medicinalproductpackagedpackageitemothercharacteristicscoding.hasCode()) {
			m.setMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgCd(String.valueOf(medicinalproductpackagedpackageitemothercharacteristicscoding.getCode()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_OtherCrctrstcs_Cdg_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemothercharacteristicscoding.hasSystem()) {
			m.setMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgSys(String.valueOf(medicinalproductpackagedpackageitemothercharacteristicscoding.getSystem()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_OtherCrctrstcs_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpackagedpackageitemothercharacteristicscoding.hasUserSelected()) {
			m.setMdcnlPrdctPckgedPckgItmOtherCrctrstcsCdgUsrSltd(String.valueOf(medicinalproductpackagedpackageitemothercharacteristicscoding.getUserSelected()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_OtherCrctrstcs_Txt ********************************************************************************/
		if(medicinalproductpackagedpackageitemothercharacteristics.hasText()) {
			m.setMdcnlPrdctPckgedPckgItmOtherCrctrstcsTxt(String.valueOf(medicinalproductpackagedpackageitemothercharacteristics.getText()));
		}
		/******************** medicinalproductpackagedpackageitemshelflifestorage ********************************************************************************/
		org.hl7.fhir.r4.model.ProductShelfLife medicinalproductpackagedpackageitemshelflifestorage = medicinalproductpackagedpackageitem.getShelfLifeStorageFirstRep();

		/******************** medicinalproductpackagedpackageitemshelflifestoragetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedpackageitemshelflifestoragetype = medicinalproductpackagedpackageitemshelflifestorage.getType();

		/******************** medicinalproductpackagedpackageitemshelflifestoragetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpackagedpackageitemshelflifestoragetypecoding = medicinalproductpackagedpackageitemshelflifestoragetype.getCodingFirstRep();

		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestoragetypecoding.hasDisplay()) {
			m.setMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgDsply(String.valueOf(medicinalproductpackagedpackageitemshelflifestoragetypecoding.getDisplay()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestoragetypecoding.hasVersion()) {
			m.setMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgVrsn(String.valueOf(medicinalproductpackagedpackageitemshelflifestoragetypecoding.getVersion()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestoragetypecoding.hasCode()) {
			m.setMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgCd(String.valueOf(medicinalproductpackagedpackageitemshelflifestoragetypecoding.getCode()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestoragetypecoding.hasSystem()) {
			m.setMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgSys(String.valueOf(medicinalproductpackagedpackageitemshelflifestoragetypecoding.getSystem()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestoragetypecoding.hasUserSelected()) {
			m.setMdcnlPrdctPckgedPckgItmShlfLfStrgTypCdgUsrSltd(String.valueOf(medicinalproductpackagedpackageitemshelflifestoragetypecoding.getUserSelected()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Typ_Txt ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestoragetype.hasText()) {
			m.setMdcnlPrdctPckgedPckgItmShlfLfStrgTypTxt(String.valueOf(medicinalproductpackagedpackageitemshelflifestoragetype.getText()));
		}
		/******************** medicinalproductpackagedpackageitemshelflifestorageperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpackagedpackageitemshelflifestorageperiod = medicinalproductpackagedpackageitemshelflifestorage.getPeriod();

		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Prd_Vl ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestorageperiod.hasValue()) {
			m.setMdcnlPrdctPckgedPckgItmShlfLfStrgPrdVl(String.valueOf(medicinalproductpackagedpackageitemshelflifestorageperiod.getValue()));
		}
		/******************** medicinalproductpackagedpackageitemshelflifestorageperiodcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductpackagedpackageitemshelflifestorageperiodcomparator = medicinalproductpackagedpackageitemshelflifestorageperiod.getComparator();
		m.setMdcnlPrdctPckgedPckgItmShlfLfStrgPrdCmprtr(medicinalproductpackagedpackageitemshelflifestorageperiodcomparator.toCode());

		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Prd_Cd ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestorageperiod.hasCode()) {
			m.setMdcnlPrdctPckgedPckgItmShlfLfStrgPrdCd(String.valueOf(medicinalproductpackagedpackageitemshelflifestorageperiod.getCode()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Prd_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestorageperiod.hasSystem()) {
			m.setMdcnlPrdctPckgedPckgItmShlfLfStrgPrdSys(String.valueOf(medicinalproductpackagedpackageitemshelflifestorageperiod.getSystem()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Prd_Unt ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestorageperiod.hasUnit()) {
			m.setMdcnlPrdctPckgedPckgItmShlfLfStrgPrdUnt(String.valueOf(medicinalproductpackagedpackageitemshelflifestorageperiod.getUnit()));
		}
		/******************** medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstorage ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstorage = medicinalproductpackagedpackageitemshelflifestorage.getSpecialPrecautionsForStorageFirstRep();

		/******************** medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecoding = medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstorage.getCodingFirstRep();

		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecoding.hasDisplay()) {
			m.setMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgDsply(String.valueOf(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecoding.getDisplay()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecoding.hasVersion()) {
			m.setMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgVrsn(String.valueOf(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecoding.getVersion()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_Cd ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecoding.hasCode()) {
			m.setMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgCd(String.valueOf(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecoding.getCode()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecoding.hasSystem()) {
			m.setMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgSys(String.valueOf(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecoding.getSystem()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_SpclPrctnsFrStrg_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecoding.hasUserSelected()) {
			m.setMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgCdgUsrSltd(String.valueOf(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstoragecoding.getUserSelected()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_SpclPrctnsFrStrg_Txt ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstorage.hasText()) {
			m.setMdcnlPrdctPckgedPckgItmShlfLfStrgSpclPrctnsFrStrgTxt(String.valueOf(medicinalproductpackagedpackageitemshelflifestoragespecialprecautionsforstorage.getText()));
		}
		/******************** medicinalproductpackagedpackageitemshelflifestorageidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicinalproductpackagedpackageitemshelflifestorageidentifier = medicinalproductpackagedpackageitemshelflifestorage.getIdentifier();

		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Vl ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestorageidentifier.hasValue()) {
			m.setMdcnlPrdctPckgedPckgItmShlfLfStrgIdVl(String.valueOf(medicinalproductpackagedpackageitemshelflifestorageidentifier.getValue()));
		}
		/******************** medicinalproductpackagedpackageitemshelflifestorageidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedpackageitemshelflifestorageidentifiertype = medicinalproductpackagedpackageitemshelflifestorageidentifier.getType();

		/******************** medicinalproductpackagedpackageitemshelflifestorageidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpackagedpackageitemshelflifestorageidentifiertypecoding = medicinalproductpackagedpackageitemshelflifestorageidentifiertype.getCodingFirstRep();

		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestorageidentifiertypecoding.hasDisplay()) {
			m.setMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgDsply(String.valueOf(medicinalproductpackagedpackageitemshelflifestorageidentifiertypecoding.getDisplay()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestorageidentifiertypecoding.hasVersion()) {
			m.setMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgVrsn(String.valueOf(medicinalproductpackagedpackageitemshelflifestorageidentifiertypecoding.getVersion()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestorageidentifiertypecoding.hasCode()) {
			m.setMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgCd(String.valueOf(medicinalproductpackagedpackageitemshelflifestorageidentifiertypecoding.getCode()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestorageidentifiertypecoding.hasSystem()) {
			m.setMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgSys(String.valueOf(medicinalproductpackagedpackageitemshelflifestorageidentifiertypecoding.getSystem()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestorageidentifiertypecoding.hasUserSelected()) {
			m.setMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypCdgUsrSltd(String.valueOf(medicinalproductpackagedpackageitemshelflifestorageidentifiertypecoding.getUserSelected()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Typ_Txt ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestorageidentifiertype.hasText()) {
			m.setMdcnlPrdctPckgedPckgItmShlfLfStrgIdTypTxt(String.valueOf(medicinalproductpackagedpackageitemshelflifestorageidentifiertype.getText()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestorageidentifier.hasSystem()) {
			m.setMdcnlPrdctPckgedPckgItmShlfLfStrgIdSys(String.valueOf(medicinalproductpackagedpackageitemshelflifestorageidentifier.getSystem()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Assigner ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestorageidentifier.hasAssigner()) {
			m.setMdcnlPrdctPckgedPckgItmShlfLfStrgIdAssigner(String.valueOf(medicinalproductpackagedpackageitemshelflifestorageidentifier.getAssigner()));
		}
		/******************** medicinalproductpackagedpackageitemshelflifestorageidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductpackagedpackageitemshelflifestorageidentifierperiod = medicinalproductpackagedpackageitemshelflifestorageidentifier.getPeriod();

		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Prd_End ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestorageidentifierperiod.hasEnd()) {
			m.setMdcnlPrdctPckgedPckgItmShlfLfStrgIdPrdEnd(String.valueOf(medicinalproductpackagedpackageitemshelflifestorageidentifierperiod.getEnd()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_ShlfLfStrg_Id_Prd_Strt ********************************************************************************/
		if(medicinalproductpackagedpackageitemshelflifestorageidentifierperiod.hasStart()) {
			m.setMdcnlPrdctPckgedPckgItmShlfLfStrgIdPrdStrt(String.valueOf(medicinalproductpackagedpackageitemshelflifestorageidentifierperiod.getStart()));
		}
		/******************** medicinalproductpackagedpackageitemshelflifestorageidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicinalproductpackagedpackageitemshelflifestorageidentifieruse = medicinalproductpackagedpackageitemshelflifestorageidentifier.getUse();
		m.setMdcnlPrdctPckgedPckgItmShlfLfStrgIdUse(medicinalproductpackagedpackageitemshelflifestorageidentifieruse.toCode());

		/******************** medicinalproductpackagedpackageitemmaterial ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedpackageitemmaterial = medicinalproductpackagedpackageitem.getMaterialFirstRep();

		/******************** medicinalproductpackagedpackageitemmaterialcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpackagedpackageitemmaterialcoding = medicinalproductpackagedpackageitemmaterial.getCodingFirstRep();

		/******************** MdcnlPrdctPckged_PckgItm_Mtrl_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpackagedpackageitemmaterialcoding.hasDisplay()) {
			m.setMdcnlPrdctPckgedPckgItmMtrlCdgDsply(String.valueOf(medicinalproductpackagedpackageitemmaterialcoding.getDisplay()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_Mtrl_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpackagedpackageitemmaterialcoding.hasVersion()) {
			m.setMdcnlPrdctPckgedPckgItmMtrlCdgVrsn(String.valueOf(medicinalproductpackagedpackageitemmaterialcoding.getVersion()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_Mtrl_Cdg_Cd ********************************************************************************/
		if(medicinalproductpackagedpackageitemmaterialcoding.hasCode()) {
			m.setMdcnlPrdctPckgedPckgItmMtrlCdgCd(String.valueOf(medicinalproductpackagedpackageitemmaterialcoding.getCode()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_Mtrl_Cdg_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemmaterialcoding.hasSystem()) {
			m.setMdcnlPrdctPckgedPckgItmMtrlCdgSys(String.valueOf(medicinalproductpackagedpackageitemmaterialcoding.getSystem()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_Mtrl_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpackagedpackageitemmaterialcoding.hasUserSelected()) {
			m.setMdcnlPrdctPckgedPckgItmMtrlCdgUsrSltd(String.valueOf(medicinalproductpackagedpackageitemmaterialcoding.getUserSelected()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_Mtrl_Txt ********************************************************************************/
		if(medicinalproductpackagedpackageitemmaterial.hasText()) {
			m.setMdcnlPrdctPckgedPckgItmMtrlTxt(String.valueOf(medicinalproductpackagedpackageitemmaterial.getText()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_MnfctredItm ********************************************************************************/
		if(medicinalproductpackagedpackageitem.hasManufacturedItem()) {
			m.setMdcnlPrdctPckgedPckgItmMnfctredItm(String.valueOf(medicinalproductpackagedpackageitem.getManufacturedItemFirstRep()));
		}
		/******************** medicinalproductpackagedpackageitemalternatematerial ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedpackageitemalternatematerial = medicinalproductpackagedpackageitem.getAlternateMaterialFirstRep();

		/******************** medicinalproductpackagedpackageitemalternatematerialcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpackagedpackageitemalternatematerialcoding = medicinalproductpackagedpackageitemalternatematerial.getCodingFirstRep();

		/******************** MdcnlPrdctPckged_PckgItm_AlternateMtrl_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpackagedpackageitemalternatematerialcoding.hasDisplay()) {
			m.setMdcnlPrdctPckgedPckgItmAlternateMtrlCdgDsply(String.valueOf(medicinalproductpackagedpackageitemalternatematerialcoding.getDisplay()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_AlternateMtrl_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpackagedpackageitemalternatematerialcoding.hasVersion()) {
			m.setMdcnlPrdctPckgedPckgItmAlternateMtrlCdgVrsn(String.valueOf(medicinalproductpackagedpackageitemalternatematerialcoding.getVersion()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_AlternateMtrl_Cdg_Cd ********************************************************************************/
		if(medicinalproductpackagedpackageitemalternatematerialcoding.hasCode()) {
			m.setMdcnlPrdctPckgedPckgItmAlternateMtrlCdgCd(String.valueOf(medicinalproductpackagedpackageitemalternatematerialcoding.getCode()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_AlternateMtrl_Cdg_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemalternatematerialcoding.hasSystem()) {
			m.setMdcnlPrdctPckgedPckgItmAlternateMtrlCdgSys(String.valueOf(medicinalproductpackagedpackageitemalternatematerialcoding.getSystem()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_AlternateMtrl_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpackagedpackageitemalternatematerialcoding.hasUserSelected()) {
			m.setMdcnlPrdctPckgedPckgItmAlternateMtrlCdgUsrSltd(String.valueOf(medicinalproductpackagedpackageitemalternatematerialcoding.getUserSelected()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_AlternateMtrl_Txt ********************************************************************************/
		if(medicinalproductpackagedpackageitemalternatematerial.hasText()) {
			m.setMdcnlPrdctPckgedPckgItmAlternateMtrlTxt(String.valueOf(medicinalproductpackagedpackageitemalternatematerial.getText()));
		}
		/******************** medicinalproductpackagedpackageitemidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicinalproductpackagedpackageitemidentifier = medicinalproductpackagedpackageitem.getIdentifierFirstRep();

		/******************** MdcnlPrdctPckged_PckgItm_Id_Vl ********************************************************************************/
		if(medicinalproductpackagedpackageitemidentifier.hasValue()) {
			m.setMdcnlPrdctPckgedPckgItmIdVl(String.valueOf(medicinalproductpackagedpackageitemidentifier.getValue()));
		}
		/******************** medicinalproductpackagedpackageitemidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedpackageitemidentifiertype = medicinalproductpackagedpackageitemidentifier.getType();

		/******************** medicinalproductpackagedpackageitemidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpackagedpackageitemidentifiertypecoding = medicinalproductpackagedpackageitemidentifiertype.getCodingFirstRep();

		/******************** MdcnlPrdctPckged_PckgItm_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpackagedpackageitemidentifiertypecoding.hasDisplay()) {
			m.setMdcnlPrdctPckgedPckgItmIdTypCdgDsply(String.valueOf(medicinalproductpackagedpackageitemidentifiertypecoding.getDisplay()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpackagedpackageitemidentifiertypecoding.hasVersion()) {
			m.setMdcnlPrdctPckgedPckgItmIdTypCdgVrsn(String.valueOf(medicinalproductpackagedpackageitemidentifiertypecoding.getVersion()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_Id_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductpackagedpackageitemidentifiertypecoding.hasCode()) {
			m.setMdcnlPrdctPckgedPckgItmIdTypCdgCd(String.valueOf(medicinalproductpackagedpackageitemidentifiertypecoding.getCode()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_Id_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemidentifiertypecoding.hasSystem()) {
			m.setMdcnlPrdctPckgedPckgItmIdTypCdgSys(String.valueOf(medicinalproductpackagedpackageitemidentifiertypecoding.getSystem()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpackagedpackageitemidentifiertypecoding.hasUserSelected()) {
			m.setMdcnlPrdctPckgedPckgItmIdTypCdgUsrSltd(String.valueOf(medicinalproductpackagedpackageitemidentifiertypecoding.getUserSelected()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_Id_Typ_Txt ********************************************************************************/
		if(medicinalproductpackagedpackageitemidentifiertype.hasText()) {
			m.setMdcnlPrdctPckgedPckgItmIdTypTxt(String.valueOf(medicinalproductpackagedpackageitemidentifiertype.getText()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_Id_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemidentifier.hasSystem()) {
			m.setMdcnlPrdctPckgedPckgItmIdSys(String.valueOf(medicinalproductpackagedpackageitemidentifier.getSystem()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_Id_Assigner ********************************************************************************/
		if(medicinalproductpackagedpackageitemidentifier.hasAssigner()) {
			m.setMdcnlPrdctPckgedPckgItmIdAssigner(String.valueOf(medicinalproductpackagedpackageitemidentifier.getAssigner()));
		}
		/******************** medicinalproductpackagedpackageitemidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductpackagedpackageitemidentifierperiod = medicinalproductpackagedpackageitemidentifier.getPeriod();

		/******************** MdcnlPrdctPckged_PckgItm_Id_Prd_End ********************************************************************************/
		if(medicinalproductpackagedpackageitemidentifierperiod.hasEnd()) {
			m.setMdcnlPrdctPckgedPckgItmIdPrdEnd(String.valueOf(medicinalproductpackagedpackageitemidentifierperiod.getEnd()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_Id_Prd_Strt ********************************************************************************/
		if(medicinalproductpackagedpackageitemidentifierperiod.hasStart()) {
			m.setMdcnlPrdctPckgedPckgItmIdPrdStrt(String.valueOf(medicinalproductpackagedpackageitemidentifierperiod.getStart()));
		}
		/******************** medicinalproductpackagedpackageitemidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicinalproductpackagedpackageitemidentifieruse = medicinalproductpackagedpackageitemidentifier.getUse();
		m.setMdcnlPrdctPckgedPckgItmIdUse(medicinalproductpackagedpackageitemidentifieruse.toCode());

		/******************** medicinalproductpackagedpackageitemquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpackagedpackageitemquantity = medicinalproductpackagedpackageitem.getQuantity();

		/******************** MdcnlPrdctPckged_PckgItm_Qnty_Vl ********************************************************************************/
		if(medicinalproductpackagedpackageitemquantity.hasValue()) {
			m.setMdcnlPrdctPckgedPckgItmQntyVl(String.valueOf(medicinalproductpackagedpackageitemquantity.getValue()));
		}
		/******************** medicinalproductpackagedpackageitemquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductpackagedpackageitemquantitycomparator = medicinalproductpackagedpackageitemquantity.getComparator();
		m.setMdcnlPrdctPckgedPckgItmQntyCmprtr(medicinalproductpackagedpackageitemquantitycomparator.toCode());

		/******************** MdcnlPrdctPckged_PckgItm_Qnty_Cd ********************************************************************************/
		if(medicinalproductpackagedpackageitemquantity.hasCode()) {
			m.setMdcnlPrdctPckgedPckgItmQntyCd(String.valueOf(medicinalproductpackagedpackageitemquantity.getCode()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_Qnty_Sys ********************************************************************************/
		if(medicinalproductpackagedpackageitemquantity.hasSystem()) {
			m.setMdcnlPrdctPckgedPckgItmQntySys(String.valueOf(medicinalproductpackagedpackageitemquantity.getSystem()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_Qnty_Unt ********************************************************************************/
		if(medicinalproductpackagedpackageitemquantity.hasUnit()) {
			m.setMdcnlPrdctPckgedPckgItmQntyUnt(String.valueOf(medicinalproductpackagedpackageitemquantity.getUnit()));
		}
		/******************** MdcnlPrdctPckged_PckgItm_Dvc ********************************************************************************/
		if(medicinalproductpackagedpackageitem.hasDevice()) {
			m.setMdcnlPrdctPckgedPckgItmDvc(String.valueOf(medicinalproductpackagedpackageitem.getDeviceFirstRep()));
		}
		/******************** medicinalproductpackagedbatchidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProductPackaged.MedicinalProductPackagedBatchIdentifierComponent medicinalproductpackagedbatchidentifier = medicinalproductpackaged.getBatchIdentifierFirstRep();

		/******************** medicinalproductpackagedbatchidentifierimmediatepackaging ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicinalproductpackagedbatchidentifierimmediatepackaging = medicinalproductpackagedbatchidentifier.getImmediatePackaging();

		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Vl ********************************************************************************/
		if(medicinalproductpackagedbatchidentifierimmediatepackaging.hasValue()) {
			m.setMdcnlPrdctPckgedBatchIdImmediatePackagingVl(String.valueOf(medicinalproductpackagedbatchidentifierimmediatepackaging.getValue()));
		}
		/******************** medicinalproductpackagedbatchidentifierimmediatepackagingtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedbatchidentifierimmediatepackagingtype = medicinalproductpackagedbatchidentifierimmediatepackaging.getType();

		/******************** medicinalproductpackagedbatchidentifierimmediatepackagingtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpackagedbatchidentifierimmediatepackagingtypecoding = medicinalproductpackagedbatchidentifierimmediatepackagingtype.getCodingFirstRep();

		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpackagedbatchidentifierimmediatepackagingtypecoding.hasDisplay()) {
			m.setMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgDsply(String.valueOf(medicinalproductpackagedbatchidentifierimmediatepackagingtypecoding.getDisplay()));
		}
		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpackagedbatchidentifierimmediatepackagingtypecoding.hasVersion()) {
			m.setMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgVrsn(String.valueOf(medicinalproductpackagedbatchidentifierimmediatepackagingtypecoding.getVersion()));
		}
		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductpackagedbatchidentifierimmediatepackagingtypecoding.hasCode()) {
			m.setMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgCd(String.valueOf(medicinalproductpackagedbatchidentifierimmediatepackagingtypecoding.getCode()));
		}
		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductpackagedbatchidentifierimmediatepackagingtypecoding.hasSystem()) {
			m.setMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgSys(String.valueOf(medicinalproductpackagedbatchidentifierimmediatepackagingtypecoding.getSystem()));
		}
		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpackagedbatchidentifierimmediatepackagingtypecoding.hasUserSelected()) {
			m.setMdcnlPrdctPckgedBatchIdImmediatePackagingTypCdgUsrSltd(String.valueOf(medicinalproductpackagedbatchidentifierimmediatepackagingtypecoding.getUserSelected()));
		}
		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Typ_Txt ********************************************************************************/
		if(medicinalproductpackagedbatchidentifierimmediatepackagingtype.hasText()) {
			m.setMdcnlPrdctPckgedBatchIdImmediatePackagingTypTxt(String.valueOf(medicinalproductpackagedbatchidentifierimmediatepackagingtype.getText()));
		}
		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Sys ********************************************************************************/
		if(medicinalproductpackagedbatchidentifierimmediatepackaging.hasSystem()) {
			m.setMdcnlPrdctPckgedBatchIdImmediatePackagingSys(String.valueOf(medicinalproductpackagedbatchidentifierimmediatepackaging.getSystem()));
		}
		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Assigner ********************************************************************************/
		if(medicinalproductpackagedbatchidentifierimmediatepackaging.hasAssigner()) {
			m.setMdcnlPrdctPckgedBatchIdImmediatePackagingAssigner(String.valueOf(medicinalproductpackagedbatchidentifierimmediatepackaging.getAssigner()));
		}
		/******************** medicinalproductpackagedbatchidentifierimmediatepackagingperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductpackagedbatchidentifierimmediatepackagingperiod = medicinalproductpackagedbatchidentifierimmediatepackaging.getPeriod();

		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Prd_End ********************************************************************************/
		if(medicinalproductpackagedbatchidentifierimmediatepackagingperiod.hasEnd()) {
			m.setMdcnlPrdctPckgedBatchIdImmediatePackagingPrdEnd(String.valueOf(medicinalproductpackagedbatchidentifierimmediatepackagingperiod.getEnd()));
		}
		/******************** MdcnlPrdctPckged_BatchId_ImmediatePackaging_Prd_Strt ********************************************************************************/
		if(medicinalproductpackagedbatchidentifierimmediatepackagingperiod.hasStart()) {
			m.setMdcnlPrdctPckgedBatchIdImmediatePackagingPrdStrt(String.valueOf(medicinalproductpackagedbatchidentifierimmediatepackagingperiod.getStart()));
		}
		/******************** medicinalproductpackagedbatchidentifierimmediatepackaginguse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicinalproductpackagedbatchidentifierimmediatepackaginguse = medicinalproductpackagedbatchidentifierimmediatepackaging.getUse();
		m.setMdcnlPrdctPckgedBatchIdImmediatePackagingUse(medicinalproductpackagedbatchidentifierimmediatepackaginguse.toCode());

		/******************** medicinalproductpackagedbatchidentifierouterpackaging ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicinalproductpackagedbatchidentifierouterpackaging = medicinalproductpackagedbatchidentifier.getOuterPackaging();

		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Vl ********************************************************************************/
		if(medicinalproductpackagedbatchidentifierouterpackaging.hasValue()) {
			m.setMdcnlPrdctPckgedBatchIdOuterPackagingVl(String.valueOf(medicinalproductpackagedbatchidentifierouterpackaging.getValue()));
		}
		/******************** medicinalproductpackagedbatchidentifierouterpackagingtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedbatchidentifierouterpackagingtype = medicinalproductpackagedbatchidentifierouterpackaging.getType();

		/******************** medicinalproductpackagedbatchidentifierouterpackagingtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpackagedbatchidentifierouterpackagingtypecoding = medicinalproductpackagedbatchidentifierouterpackagingtype.getCodingFirstRep();

		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpackagedbatchidentifierouterpackagingtypecoding.hasDisplay()) {
			m.setMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgDsply(String.valueOf(medicinalproductpackagedbatchidentifierouterpackagingtypecoding.getDisplay()));
		}
		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpackagedbatchidentifierouterpackagingtypecoding.hasVersion()) {
			m.setMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgVrsn(String.valueOf(medicinalproductpackagedbatchidentifierouterpackagingtypecoding.getVersion()));
		}
		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductpackagedbatchidentifierouterpackagingtypecoding.hasCode()) {
			m.setMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgCd(String.valueOf(medicinalproductpackagedbatchidentifierouterpackagingtypecoding.getCode()));
		}
		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductpackagedbatchidentifierouterpackagingtypecoding.hasSystem()) {
			m.setMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgSys(String.valueOf(medicinalproductpackagedbatchidentifierouterpackagingtypecoding.getSystem()));
		}
		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpackagedbatchidentifierouterpackagingtypecoding.hasUserSelected()) {
			m.setMdcnlPrdctPckgedBatchIdOuterPackagingTypCdgUsrSltd(String.valueOf(medicinalproductpackagedbatchidentifierouterpackagingtypecoding.getUserSelected()));
		}
		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Typ_Txt ********************************************************************************/
		if(medicinalproductpackagedbatchidentifierouterpackagingtype.hasText()) {
			m.setMdcnlPrdctPckgedBatchIdOuterPackagingTypTxt(String.valueOf(medicinalproductpackagedbatchidentifierouterpackagingtype.getText()));
		}
		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Sys ********************************************************************************/
		if(medicinalproductpackagedbatchidentifierouterpackaging.hasSystem()) {
			m.setMdcnlPrdctPckgedBatchIdOuterPackagingSys(String.valueOf(medicinalproductpackagedbatchidentifierouterpackaging.getSystem()));
		}
		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Assigner ********************************************************************************/
		if(medicinalproductpackagedbatchidentifierouterpackaging.hasAssigner()) {
			m.setMdcnlPrdctPckgedBatchIdOuterPackagingAssigner(String.valueOf(medicinalproductpackagedbatchidentifierouterpackaging.getAssigner()));
		}
		/******************** medicinalproductpackagedbatchidentifierouterpackagingperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductpackagedbatchidentifierouterpackagingperiod = medicinalproductpackagedbatchidentifierouterpackaging.getPeriod();

		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Prd_End ********************************************************************************/
		if(medicinalproductpackagedbatchidentifierouterpackagingperiod.hasEnd()) {
			m.setMdcnlPrdctPckgedBatchIdOuterPackagingPrdEnd(String.valueOf(medicinalproductpackagedbatchidentifierouterpackagingperiod.getEnd()));
		}
		/******************** MdcnlPrdctPckged_BatchId_OuterPackaging_Prd_Strt ********************************************************************************/
		if(medicinalproductpackagedbatchidentifierouterpackagingperiod.hasStart()) {
			m.setMdcnlPrdctPckgedBatchIdOuterPackagingPrdStrt(String.valueOf(medicinalproductpackagedbatchidentifierouterpackagingperiod.getStart()));
		}
		/******************** medicinalproductpackagedbatchidentifierouterpackaginguse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicinalproductpackagedbatchidentifierouterpackaginguse = medicinalproductpackagedbatchidentifierouterpackaging.getUse();
		m.setMdcnlPrdctPckgedBatchIdOuterPackagingUse(medicinalproductpackagedbatchidentifierouterpackaginguse.toCode());

		/******************** MdcnlPrdctPckged_MarketingAthztn ********************************************************************************/
		if(medicinalproductpackaged.hasMarketingAuthorization()) {
			m.setMdcnlPrdctPckgedMarketingAthztn(String.valueOf(medicinalproductpackaged.getMarketingAuthorization()));
		}
		/******************** medicinalproductpackagedlegalstatusofsupply ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedlegalstatusofsupply = medicinalproductpackaged.getLegalStatusOfSupply();

		/******************** medicinalproductpackagedlegalstatusofsupplycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpackagedlegalstatusofsupplycoding = medicinalproductpackagedlegalstatusofsupply.getCodingFirstRep();

		/******************** MdcnlPrdctPckged_LegalStsOfSpply_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpackagedlegalstatusofsupplycoding.hasDisplay()) {
			m.setMdcnlPrdctPckgedLegalStsOfSpplyCdgDsply(String.valueOf(medicinalproductpackagedlegalstatusofsupplycoding.getDisplay()));
		}
		/******************** MdcnlPrdctPckged_LegalStsOfSpply_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpackagedlegalstatusofsupplycoding.hasVersion()) {
			m.setMdcnlPrdctPckgedLegalStsOfSpplyCdgVrsn(String.valueOf(medicinalproductpackagedlegalstatusofsupplycoding.getVersion()));
		}
		/******************** MdcnlPrdctPckged_LegalStsOfSpply_Cdg_Cd ********************************************************************************/
		if(medicinalproductpackagedlegalstatusofsupplycoding.hasCode()) {
			m.setMdcnlPrdctPckgedLegalStsOfSpplyCdgCd(String.valueOf(medicinalproductpackagedlegalstatusofsupplycoding.getCode()));
		}
		/******************** MdcnlPrdctPckged_LegalStsOfSpply_Cdg_Sys ********************************************************************************/
		if(medicinalproductpackagedlegalstatusofsupplycoding.hasSystem()) {
			m.setMdcnlPrdctPckgedLegalStsOfSpplyCdgSys(String.valueOf(medicinalproductpackagedlegalstatusofsupplycoding.getSystem()));
		}
		/******************** MdcnlPrdctPckged_LegalStsOfSpply_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpackagedlegalstatusofsupplycoding.hasUserSelected()) {
			m.setMdcnlPrdctPckgedLegalStsOfSpplyCdgUsrSltd(String.valueOf(medicinalproductpackagedlegalstatusofsupplycoding.getUserSelected()));
		}
		/******************** MdcnlPrdctPckged_LegalStsOfSpply_Txt ********************************************************************************/
		if(medicinalproductpackagedlegalstatusofsupply.hasText()) {
			m.setMdcnlPrdctPckgedLegalStsOfSpplyTxt(String.valueOf(medicinalproductpackagedlegalstatusofsupply.getText()));
		}
		/******************** medicinalproductpackagedmarketingstatus ********************************************************************************/
		org.hl7.fhir.r4.model.MarketingStatus medicinalproductpackagedmarketingstatus = medicinalproductpackaged.getMarketingStatusFirstRep();

		/******************** medicinalproductpackagedmarketingstatuscountry ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedmarketingstatuscountry = medicinalproductpackagedmarketingstatus.getCountry();

		/******************** medicinalproductpackagedmarketingstatuscountrycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpackagedmarketingstatuscountrycoding = medicinalproductpackagedmarketingstatuscountry.getCodingFirstRep();

		/******************** MdcnlPrdctPckged_MarketingSts_Cntry_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpackagedmarketingstatuscountrycoding.hasDisplay()) {
			m.setMdcnlPrdctPckgedMarketingStsCntryCdgDsply(String.valueOf(medicinalproductpackagedmarketingstatuscountrycoding.getDisplay()));
		}
		/******************** MdcnlPrdctPckged_MarketingSts_Cntry_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpackagedmarketingstatuscountrycoding.hasVersion()) {
			m.setMdcnlPrdctPckgedMarketingStsCntryCdgVrsn(String.valueOf(medicinalproductpackagedmarketingstatuscountrycoding.getVersion()));
		}
		/******************** MdcnlPrdctPckged_MarketingSts_Cntry_Cdg_Cd ********************************************************************************/
		if(medicinalproductpackagedmarketingstatuscountrycoding.hasCode()) {
			m.setMdcnlPrdctPckgedMarketingStsCntryCdgCd(String.valueOf(medicinalproductpackagedmarketingstatuscountrycoding.getCode()));
		}
		/******************** MdcnlPrdctPckged_MarketingSts_Cntry_Cdg_Sys ********************************************************************************/
		if(medicinalproductpackagedmarketingstatuscountrycoding.hasSystem()) {
			m.setMdcnlPrdctPckgedMarketingStsCntryCdgSys(String.valueOf(medicinalproductpackagedmarketingstatuscountrycoding.getSystem()));
		}
		/******************** MdcnlPrdctPckged_MarketingSts_Cntry_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpackagedmarketingstatuscountrycoding.hasUserSelected()) {
			m.setMdcnlPrdctPckgedMarketingStsCntryCdgUsrSltd(String.valueOf(medicinalproductpackagedmarketingstatuscountrycoding.getUserSelected()));
		}
		/******************** MdcnlPrdctPckged_MarketingSts_Cntry_Txt ********************************************************************************/
		if(medicinalproductpackagedmarketingstatuscountry.hasText()) {
			m.setMdcnlPrdctPckgedMarketingStsCntryTxt(String.valueOf(medicinalproductpackagedmarketingstatuscountry.getText()));
		}
		/******************** MdcnlPrdctPckged_MarketingSts_RestoreDt ********************************************************************************/
		if(medicinalproductpackagedmarketingstatus.hasRestoreDate()) {
			m.setMdcnlPrdctPckgedMarketingStsRestoreDt(String.valueOf(medicinalproductpackagedmarketingstatus.getRestoreDate()));
		}
		/******************** medicinalproductpackagedmarketingstatusstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedmarketingstatusstatus = medicinalproductpackagedmarketingstatus.getStatus();

		/******************** medicinalproductpackagedmarketingstatusstatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpackagedmarketingstatusstatuscoding = medicinalproductpackagedmarketingstatusstatus.getCodingFirstRep();

		/******************** MdcnlPrdctPckged_MarketingSts_Sts_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpackagedmarketingstatusstatuscoding.hasDisplay()) {
			m.setMdcnlPrdctPckgedMarketingStsStsCdgDsply(String.valueOf(medicinalproductpackagedmarketingstatusstatuscoding.getDisplay()));
		}
		/******************** MdcnlPrdctPckged_MarketingSts_Sts_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpackagedmarketingstatusstatuscoding.hasVersion()) {
			m.setMdcnlPrdctPckgedMarketingStsStsCdgVrsn(String.valueOf(medicinalproductpackagedmarketingstatusstatuscoding.getVersion()));
		}
		/******************** MdcnlPrdctPckged_MarketingSts_Sts_Cdg_Cd ********************************************************************************/
		if(medicinalproductpackagedmarketingstatusstatuscoding.hasCode()) {
			m.setMdcnlPrdctPckgedMarketingStsStsCdgCd(String.valueOf(medicinalproductpackagedmarketingstatusstatuscoding.getCode()));
		}
		/******************** MdcnlPrdctPckged_MarketingSts_Sts_Cdg_Sys ********************************************************************************/
		if(medicinalproductpackagedmarketingstatusstatuscoding.hasSystem()) {
			m.setMdcnlPrdctPckgedMarketingStsStsCdgSys(String.valueOf(medicinalproductpackagedmarketingstatusstatuscoding.getSystem()));
		}
		/******************** MdcnlPrdctPckged_MarketingSts_Sts_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpackagedmarketingstatusstatuscoding.hasUserSelected()) {
			m.setMdcnlPrdctPckgedMarketingStsStsCdgUsrSltd(String.valueOf(medicinalproductpackagedmarketingstatusstatuscoding.getUserSelected()));
		}
		/******************** MdcnlPrdctPckged_MarketingSts_Sts_Txt ********************************************************************************/
		if(medicinalproductpackagedmarketingstatusstatus.hasText()) {
			m.setMdcnlPrdctPckgedMarketingStsStsTxt(String.valueOf(medicinalproductpackagedmarketingstatusstatus.getText()));
		}
		/******************** medicinalproductpackagedmarketingstatusjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedmarketingstatusjurisdiction = medicinalproductpackagedmarketingstatus.getJurisdiction();

		/******************** medicinalproductpackagedmarketingstatusjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpackagedmarketingstatusjurisdictioncoding = medicinalproductpackagedmarketingstatusjurisdiction.getCodingFirstRep();

		/******************** MdcnlPrdctPckged_MarketingSts_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpackagedmarketingstatusjurisdictioncoding.hasDisplay()) {
			m.setMdcnlPrdctPckgedMarketingStsJrsdctnCdgDsply(String.valueOf(medicinalproductpackagedmarketingstatusjurisdictioncoding.getDisplay()));
		}
		/******************** MdcnlPrdctPckged_MarketingSts_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpackagedmarketingstatusjurisdictioncoding.hasVersion()) {
			m.setMdcnlPrdctPckgedMarketingStsJrsdctnCdgVrsn(String.valueOf(medicinalproductpackagedmarketingstatusjurisdictioncoding.getVersion()));
		}
		/******************** MdcnlPrdctPckged_MarketingSts_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(medicinalproductpackagedmarketingstatusjurisdictioncoding.hasCode()) {
			m.setMdcnlPrdctPckgedMarketingStsJrsdctnCdgCd(String.valueOf(medicinalproductpackagedmarketingstatusjurisdictioncoding.getCode()));
		}
		/******************** MdcnlPrdctPckged_MarketingSts_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(medicinalproductpackagedmarketingstatusjurisdictioncoding.hasSystem()) {
			m.setMdcnlPrdctPckgedMarketingStsJrsdctnCdgSys(String.valueOf(medicinalproductpackagedmarketingstatusjurisdictioncoding.getSystem()));
		}
		/******************** MdcnlPrdctPckged_MarketingSts_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpackagedmarketingstatusjurisdictioncoding.hasUserSelected()) {
			m.setMdcnlPrdctPckgedMarketingStsJrsdctnCdgUsrSltd(String.valueOf(medicinalproductpackagedmarketingstatusjurisdictioncoding.getUserSelected()));
		}
		/******************** MdcnlPrdctPckged_MarketingSts_Jrsdctn_Txt ********************************************************************************/
		if(medicinalproductpackagedmarketingstatusjurisdiction.hasText()) {
			m.setMdcnlPrdctPckgedMarketingStsJrsdctnTxt(String.valueOf(medicinalproductpackagedmarketingstatusjurisdiction.getText()));
		}
		/******************** medicinalproductpackagedmarketingstatusdaterange ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductpackagedmarketingstatusdaterange = medicinalproductpackagedmarketingstatus.getDateRange();

		/******************** MdcnlPrdctPckged_MarketingSts_DtRng_End ********************************************************************************/
		if(medicinalproductpackagedmarketingstatusdaterange.hasEnd()) {
			m.setMdcnlPrdctPckgedMarketingStsDtRngEnd(String.valueOf(medicinalproductpackagedmarketingstatusdaterange.getEnd()));
		}
		/******************** MdcnlPrdctPckged_MarketingSts_DtRng_Strt ********************************************************************************/
		if(medicinalproductpackagedmarketingstatusdaterange.hasStart()) {
			m.setMdcnlPrdctPckgedMarketingStsDtRngStrt(String.valueOf(medicinalproductpackagedmarketingstatusdaterange.getStart()));
		}
		/******************** MdcnlPrdctPckged_Dscrptn ********************************************************************************/
		if(medicinalproductpackaged.hasDescription()) {
			m.setMdcnlPrdctPckgedDscrptn(String.valueOf(medicinalproductpackaged.getDescription()));
		}
		/******************** MdcnlPrdctPckged_Sbjct ********************************************************************************/
		if(medicinalproductpackaged.hasSubject()) {
			m.setMdcnlPrdctPckgedSbjct(String.valueOf(medicinalproductpackaged.getSubjectFirstRep()));
		}
		/******************** medicinalproductpackagedidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicinalproductpackagedidentifier = medicinalproductpackaged.getIdentifierFirstRep();

		/******************** MdcnlPrdctPckged_Id_Vl ********************************************************************************/
		if(medicinalproductpackagedidentifier.hasValue()) {
			m.setMdcnlPrdctPckgedIdVl(String.valueOf(medicinalproductpackagedidentifier.getValue()));
		}
		/******************** medicinalproductpackagedidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpackagedidentifiertype = medicinalproductpackagedidentifier.getType();

		/******************** medicinalproductpackagedidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpackagedidentifiertypecoding = medicinalproductpackagedidentifiertype.getCodingFirstRep();

		/******************** MdcnlPrdctPckged_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpackagedidentifiertypecoding.hasDisplay()) {
			m.setMdcnlPrdctPckgedIdTypCdgDsply(String.valueOf(medicinalproductpackagedidentifiertypecoding.getDisplay()));
		}
		/******************** MdcnlPrdctPckged_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpackagedidentifiertypecoding.hasVersion()) {
			m.setMdcnlPrdctPckgedIdTypCdgVrsn(String.valueOf(medicinalproductpackagedidentifiertypecoding.getVersion()));
		}
		/******************** MdcnlPrdctPckged_Id_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductpackagedidentifiertypecoding.hasCode()) {
			m.setMdcnlPrdctPckgedIdTypCdgCd(String.valueOf(medicinalproductpackagedidentifiertypecoding.getCode()));
		}
		/******************** MdcnlPrdctPckged_Id_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductpackagedidentifiertypecoding.hasSystem()) {
			m.setMdcnlPrdctPckgedIdTypCdgSys(String.valueOf(medicinalproductpackagedidentifiertypecoding.getSystem()));
		}
		/******************** MdcnlPrdctPckged_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpackagedidentifiertypecoding.hasUserSelected()) {
			m.setMdcnlPrdctPckgedIdTypCdgUsrSltd(String.valueOf(medicinalproductpackagedidentifiertypecoding.getUserSelected()));
		}
		/******************** MdcnlPrdctPckged_Id_Typ_Txt ********************************************************************************/
		if(medicinalproductpackagedidentifiertype.hasText()) {
			m.setMdcnlPrdctPckgedIdTypTxt(String.valueOf(medicinalproductpackagedidentifiertype.getText()));
		}
		/******************** MdcnlPrdctPckged_Id_Sys ********************************************************************************/
		if(medicinalproductpackagedidentifier.hasSystem()) {
			m.setMdcnlPrdctPckgedIdSys(String.valueOf(medicinalproductpackagedidentifier.getSystem()));
		}
		/******************** MdcnlPrdctPckged_Id_Assigner ********************************************************************************/
		if(medicinalproductpackagedidentifier.hasAssigner()) {
			m.setMdcnlPrdctPckgedIdAssigner(String.valueOf(medicinalproductpackagedidentifier.getAssigner()));
		}
		/******************** medicinalproductpackagedidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductpackagedidentifierperiod = medicinalproductpackagedidentifier.getPeriod();

		/******************** MdcnlPrdctPckged_Id_Prd_End ********************************************************************************/
		if(medicinalproductpackagedidentifierperiod.hasEnd()) {
			m.setMdcnlPrdctPckgedIdPrdEnd(String.valueOf(medicinalproductpackagedidentifierperiod.getEnd()));
		}
		/******************** MdcnlPrdctPckged_Id_Prd_Strt ********************************************************************************/
		if(medicinalproductpackagedidentifierperiod.hasStart()) {
			m.setMdcnlPrdctPckgedIdPrdStrt(String.valueOf(medicinalproductpackagedidentifierperiod.getStart()));
		}
		/******************** medicinalproductpackagedidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicinalproductpackagedidentifieruse = medicinalproductpackagedidentifier.getUse();
		m.setMdcnlPrdctPckgedIdUse(medicinalproductpackagedidentifieruse.toCode());

		return m;
	}
}
