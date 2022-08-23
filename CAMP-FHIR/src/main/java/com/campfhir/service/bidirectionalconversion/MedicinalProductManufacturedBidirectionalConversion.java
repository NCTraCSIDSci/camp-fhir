package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProductManufactured;
public class MedicinalProductManufacturedBidirectionalConversion 
{
	public MedicinalProductManufactured MedicinalProductManufactureds(org.hl7.fhir.r4.model.MedicinalProductManufactured medicinalproductmanufactured) throws ParseException
	{
		 main.java.com.campfhir.model.MedicinalProductManufactured m = new  main.java.com.campfhir.model.MedicinalProductManufactured();

		/******************** id ********************************************************************************/
		m.setId(medicinalproductmanufactured.getIdElement().getIdPart());

		/******************** medicinalproductmanufacturedphysicalcharacteristics ********************************************************************************/
		org.hl7.fhir.r4.model.ProdCharacteristic medicinalproductmanufacturedphysicalcharacteristics = medicinalproductmanufactured.getPhysicalCharacteristics();

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Shape ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristics.hasShape()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsShape(String.valueOf(medicinalproductmanufacturedphysicalcharacteristics.getShape()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsShape("NULL");
		}


		/******************** medicinalproductmanufacturedphysicalcharacteristicsimage ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Attachment> medicinalproductmanufacturedphysicalcharacteristicsimagelist = medicinalproductmanufacturedphysicalcharacteristics.getImage();
		for(int medicinalproductmanufacturedphysicalcharacteristicsimagei = 0; medicinalproductmanufacturedphysicalcharacteristicsimagei<medicinalproductmanufacturedphysicalcharacteristicsimagelist.size();medicinalproductmanufacturedphysicalcharacteristicsimagei++ ) {
		org.hl7.fhir.r4.model.Attachment  medicinalproductmanufacturedphysicalcharacteristicsimage = medicinalproductmanufacturedphysicalcharacteristicsimagelist.get(medicinalproductmanufacturedphysicalcharacteristicsimagei);

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Image_Sz ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsimagei == 0) {m.addMdcnlPrdctMnfctredPhysclCrctrstcsImageSz("[");}
		if(medicinalproductmanufacturedphysicalcharacteristicsimage.hasSize()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsImageSz(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsimage.getSize()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsImageSz("NULL");
		}

		if(medicinalproductmanufacturedphysicalcharacteristicsimagei == medicinalproductmanufacturedphysicalcharacteristicsimagelist.size()-1) {m.addMdcnlPrdctMnfctredPhysclCrctrstcsImageSz("]");}


		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Image_Lnguage ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsimagei == 0) {m.addMdcnlPrdctMnfctredPhysclCrctrstcsImageLnguage("[");}
		if(medicinalproductmanufacturedphysicalcharacteristicsimage.hasLanguage()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsImageLnguage(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsimage.getLanguage()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsImageLnguage("NULL");
		}

		if(medicinalproductmanufacturedphysicalcharacteristicsimagei == medicinalproductmanufacturedphysicalcharacteristicsimagelist.size()-1) {m.addMdcnlPrdctMnfctredPhysclCrctrstcsImageLnguage("]");}


		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Image_CntntTyp ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsimagei == 0) {m.addMdcnlPrdctMnfctredPhysclCrctrstcsImageCntntTyp("[");}
		if(medicinalproductmanufacturedphysicalcharacteristicsimage.hasContentType()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsImageCntntTyp(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsimage.getContentType()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsImageCntntTyp("NULL");
		}

		if(medicinalproductmanufacturedphysicalcharacteristicsimagei == medicinalproductmanufacturedphysicalcharacteristicsimagelist.size()-1) {m.addMdcnlPrdctMnfctredPhysclCrctrstcsImageCntntTyp("]");}


		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Image_Hash ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsimagei == 0) {m.addMdcnlPrdctMnfctredPhysclCrctrstcsImageHash("[");}
		if(medicinalproductmanufacturedphysicalcharacteristicsimage.hasHash()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsImageHash(new String(medicinalproductmanufacturedphysicalcharacteristicsimage.getHash()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsImageHash("NULL");
		}

		if(medicinalproductmanufacturedphysicalcharacteristicsimagei == medicinalproductmanufacturedphysicalcharacteristicsimagelist.size()-1) {m.addMdcnlPrdctMnfctredPhysclCrctrstcsImageHash("]");}


		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Image_Data ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsimagei == 0) {m.addMdcnlPrdctMnfctredPhysclCrctrstcsImageData("[");}
		if(medicinalproductmanufacturedphysicalcharacteristicsimage.hasData()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsImageData(new String(medicinalproductmanufacturedphysicalcharacteristicsimage.getData()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsImageData("NULL");
		}

		if(medicinalproductmanufacturedphysicalcharacteristicsimagei == medicinalproductmanufacturedphysicalcharacteristicsimagelist.size()-1) {m.addMdcnlPrdctMnfctredPhysclCrctrstcsImageData("]");}


		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Image_Creation ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsimagei == 0) {m.addMdcnlPrdctMnfctredPhysclCrctrstcsImageCreation("[");}
		if(medicinalproductmanufacturedphysicalcharacteristicsimage.hasCreation()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsImageCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(medicinalproductmanufacturedphysicalcharacteristicsimage.getCreation())+"\"");
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsImageCreation("NULL");
		}

		if(medicinalproductmanufacturedphysicalcharacteristicsimagei == medicinalproductmanufacturedphysicalcharacteristicsimagelist.size()-1) {m.addMdcnlPrdctMnfctredPhysclCrctrstcsImageCreation("]");}


		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Image_Ttl ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsimagei == 0) {m.addMdcnlPrdctMnfctredPhysclCrctrstcsImageTtl("[");}
		if(medicinalproductmanufacturedphysicalcharacteristicsimage.hasTitle()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsImageTtl(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsimage.getTitle()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsImageTtl("NULL");
		}

		if(medicinalproductmanufacturedphysicalcharacteristicsimagei == medicinalproductmanufacturedphysicalcharacteristicsimagelist.size()-1) {m.addMdcnlPrdctMnfctredPhysclCrctrstcsImageTtl("]");}


		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Image_Url ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsimagei == 0) {m.addMdcnlPrdctMnfctredPhysclCrctrstcsImageUrl("[");}
		if(medicinalproductmanufacturedphysicalcharacteristicsimage.hasUrl()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsImageUrl(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsimage.getUrl()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsImageUrl("NULL");
		}

		if(medicinalproductmanufacturedphysicalcharacteristicsimagei == medicinalproductmanufacturedphysicalcharacteristicsimagelist.size()-1) {m.addMdcnlPrdctMnfctredPhysclCrctrstcsImageUrl("]");}


		 };
		/******************** medicinalproductmanufacturedphysicalcharacteristicsheight ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductmanufacturedphysicalcharacteristicsheight = medicinalproductmanufacturedphysicalcharacteristics.getHeight();

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Height_Vl ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsheight.hasValue()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsHeightVl(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsheight.getValue()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsHeightVl("NULL");
		}


		/******************** medicinalproductmanufacturedphysicalcharacteristicsheightcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductmanufacturedphysicalcharacteristicsheightcomparator = medicinalproductmanufacturedphysicalcharacteristicsheight.getComparator();
		if(medicinalproductmanufacturedphysicalcharacteristicsheightcomparator!=null) {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsHeightCmprtr(medicinalproductmanufacturedphysicalcharacteristicsheightcomparator.toCode());
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsHeightCmprtr("NULL");
		}

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Height_Cd ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsheight.hasCode()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsHeightCd(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsheight.getCode()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsHeightCd("NULL");
		}


		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Height_Unt ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsheight.hasUnit()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsHeightUnt(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsheight.getUnit()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsHeightUnt("NULL");
		}


		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Height_Sys ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsheight.hasSystem()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsHeightSys(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsheight.getSystem()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsHeightSys("NULL");
		}


		/******************** medicinalproductmanufacturedphysicalcharacteristicswidth ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductmanufacturedphysicalcharacteristicswidth = medicinalproductmanufacturedphysicalcharacteristics.getWidth();

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Width_Vl ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicswidth.hasValue()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsWidthVl(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicswidth.getValue()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsWidthVl("NULL");
		}


		/******************** medicinalproductmanufacturedphysicalcharacteristicswidthcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductmanufacturedphysicalcharacteristicswidthcomparator = medicinalproductmanufacturedphysicalcharacteristicswidth.getComparator();
		if(medicinalproductmanufacturedphysicalcharacteristicswidthcomparator!=null) {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsWidthCmprtr(medicinalproductmanufacturedphysicalcharacteristicswidthcomparator.toCode());
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsWidthCmprtr("NULL");
		}

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Width_Cd ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicswidth.hasCode()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsWidthCd(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicswidth.getCode()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsWidthCd("NULL");
		}


		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Width_Unt ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicswidth.hasUnit()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsWidthUnt(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicswidth.getUnit()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsWidthUnt("NULL");
		}


		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Width_Sys ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicswidth.hasSystem()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsWidthSys(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicswidth.getSystem()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsWidthSys("NULL");
		}


		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Color ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristics.hasColor()) {

			String  array = "[";
			for(int incr=0; incr<medicinalproductmanufacturedphysicalcharacteristics.getColor().size(); incr++) {
				array = array + medicinalproductmanufacturedphysicalcharacteristics.getColor().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsColor(array);

		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsColor("NULL");
		}


		/******************** medicinalproductmanufacturedphysicalcharacteristicsexternaldiameter ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductmanufacturedphysicalcharacteristicsexternaldiameter = medicinalproductmanufacturedphysicalcharacteristics.getExternalDiameter();

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_ExternalDiameter_Vl ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsexternaldiameter.hasValue()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterVl(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsexternaldiameter.getValue()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterVl("NULL");
		}


		/******************** medicinalproductmanufacturedphysicalcharacteristicsexternaldiametercomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductmanufacturedphysicalcharacteristicsexternaldiametercomparator = medicinalproductmanufacturedphysicalcharacteristicsexternaldiameter.getComparator();
		if(medicinalproductmanufacturedphysicalcharacteristicsexternaldiametercomparator!=null) {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterCmprtr(medicinalproductmanufacturedphysicalcharacteristicsexternaldiametercomparator.toCode());
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterCmprtr("NULL");
		}

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_ExternalDiameter_Cd ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsexternaldiameter.hasCode()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterCd(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsexternaldiameter.getCode()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterCd("NULL");
		}


		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_ExternalDiameter_Unt ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsexternaldiameter.hasUnit()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterUnt(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsexternaldiameter.getUnit()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterUnt("NULL");
		}


		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_ExternalDiameter_Sys ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsexternaldiameter.hasSystem()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterSys(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsexternaldiameter.getSystem()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsExternalDiameterSys("NULL");
		}


		/******************** medicinalproductmanufacturedphysicalcharacteristicsscoring ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductmanufacturedphysicalcharacteristicsscoring = medicinalproductmanufacturedphysicalcharacteristics.getScoring();

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Scoring_Txt ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsscoring.hasText()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsScoringTxt(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsscoring.getText()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsScoringTxt("NULL");
		}


		/******************** medicinalproductmanufacturedphysicalcharacteristicsscoringcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductmanufacturedphysicalcharacteristicsscoringcodinglist = medicinalproductmanufacturedphysicalcharacteristicsscoring.getCoding();
		for(int medicinalproductmanufacturedphysicalcharacteristicsscoringcodingi = 0; medicinalproductmanufacturedphysicalcharacteristicsscoringcodingi<medicinalproductmanufacturedphysicalcharacteristicsscoringcodinglist.size();medicinalproductmanufacturedphysicalcharacteristicsscoringcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductmanufacturedphysicalcharacteristicsscoringcoding = medicinalproductmanufacturedphysicalcharacteristicsscoringcodinglist.get(medicinalproductmanufacturedphysicalcharacteristicsscoringcodingi);

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Scoring_Cdg_Dsply ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsscoringcodingi == 0) {m.addMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgDsply("[");}
		if(medicinalproductmanufacturedphysicalcharacteristicsscoringcoding.hasDisplay()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgDsply(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsscoringcoding.getDisplay()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgDsply("NULL");
		}

		if(medicinalproductmanufacturedphysicalcharacteristicsscoringcodingi == medicinalproductmanufacturedphysicalcharacteristicsscoringcodinglist.size()-1) {m.addMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgDsply("]");}


		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Scoring_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsscoringcodingi == 0) {m.addMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgVrsn("[");}
		if(medicinalproductmanufacturedphysicalcharacteristicsscoringcoding.hasVersion()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgVrsn(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsscoringcoding.getVersion()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgVrsn("NULL");
		}

		if(medicinalproductmanufacturedphysicalcharacteristicsscoringcodingi == medicinalproductmanufacturedphysicalcharacteristicsscoringcodinglist.size()-1) {m.addMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgVrsn("]");}


		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Scoring_Cdg_Cd ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsscoringcodingi == 0) {m.addMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgCd("[");}
		if(medicinalproductmanufacturedphysicalcharacteristicsscoringcoding.hasCode()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgCd(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsscoringcoding.getCode()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgCd("NULL");
		}

		if(medicinalproductmanufacturedphysicalcharacteristicsscoringcodingi == medicinalproductmanufacturedphysicalcharacteristicsscoringcodinglist.size()-1) {m.addMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgCd("]");}


		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Scoring_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsscoringcodingi == 0) {m.addMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgUsrSltd("[");}
		if(medicinalproductmanufacturedphysicalcharacteristicsscoringcoding.hasUserSelected()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgUsrSltd(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsscoringcoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgUsrSltd("NULL");
		}

		if(medicinalproductmanufacturedphysicalcharacteristicsscoringcodingi == medicinalproductmanufacturedphysicalcharacteristicsscoringcodinglist.size()-1) {m.addMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgUsrSltd("]");}


		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Scoring_Cdg_Sys ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsscoringcodingi == 0) {m.addMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgSys("[");}
		if(medicinalproductmanufacturedphysicalcharacteristicsscoringcoding.hasSystem()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgSys(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsscoringcoding.getSystem()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgSys("NULL");
		}

		if(medicinalproductmanufacturedphysicalcharacteristicsscoringcodingi == medicinalproductmanufacturedphysicalcharacteristicsscoringcodinglist.size()-1) {m.addMdcnlPrdctMnfctredPhysclCrctrstcsScoringCdgSys("]");}


		 };
		/******************** medicinalproductmanufacturedphysicalcharacteristicsdepth ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductmanufacturedphysicalcharacteristicsdepth = medicinalproductmanufacturedphysicalcharacteristics.getDepth();

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Depth_Vl ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsdepth.hasValue()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsDepthVl(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsdepth.getValue()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsDepthVl("NULL");
		}


		/******************** medicinalproductmanufacturedphysicalcharacteristicsdepthcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductmanufacturedphysicalcharacteristicsdepthcomparator = medicinalproductmanufacturedphysicalcharacteristicsdepth.getComparator();
		if(medicinalproductmanufacturedphysicalcharacteristicsdepthcomparator!=null) {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsDepthCmprtr(medicinalproductmanufacturedphysicalcharacteristicsdepthcomparator.toCode());
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsDepthCmprtr("NULL");
		}

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Depth_Cd ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsdepth.hasCode()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsDepthCd(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsdepth.getCode()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsDepthCd("NULL");
		}


		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Depth_Unt ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsdepth.hasUnit()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsDepthUnt(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsdepth.getUnit()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsDepthUnt("NULL");
		}


		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Depth_Sys ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsdepth.hasSystem()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsDepthSys(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsdepth.getSystem()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsDepthSys("NULL");
		}


		/******************** medicinalproductmanufacturedphysicalcharacteristicsweight ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductmanufacturedphysicalcharacteristicsweight = medicinalproductmanufacturedphysicalcharacteristics.getWeight();

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Wght_Vl ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsweight.hasValue()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsWghtVl(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsweight.getValue()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsWghtVl("NULL");
		}


		/******************** medicinalproductmanufacturedphysicalcharacteristicsweightcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductmanufacturedphysicalcharacteristicsweightcomparator = medicinalproductmanufacturedphysicalcharacteristicsweight.getComparator();
		if(medicinalproductmanufacturedphysicalcharacteristicsweightcomparator!=null) {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsWghtCmprtr(medicinalproductmanufacturedphysicalcharacteristicsweightcomparator.toCode());
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsWghtCmprtr("NULL");
		}

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Wght_Cd ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsweight.hasCode()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsWghtCd(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsweight.getCode()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsWghtCd("NULL");
		}


		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Wght_Unt ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsweight.hasUnit()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsWghtUnt(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsweight.getUnit()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsWghtUnt("NULL");
		}


		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Wght_Sys ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsweight.hasSystem()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsWghtSys(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsweight.getSystem()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsWghtSys("NULL");
		}


		/******************** medicinalproductmanufacturedphysicalcharacteristicsnominalvolume ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductmanufacturedphysicalcharacteristicsnominalvolume = medicinalproductmanufacturedphysicalcharacteristics.getNominalVolume();

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_NominalVolume_Vl ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsnominalvolume.hasValue()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeVl(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsnominalvolume.getValue()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeVl("NULL");
		}


		/******************** medicinalproductmanufacturedphysicalcharacteristicsnominalvolumecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductmanufacturedphysicalcharacteristicsnominalvolumecomparator = medicinalproductmanufacturedphysicalcharacteristicsnominalvolume.getComparator();
		if(medicinalproductmanufacturedphysicalcharacteristicsnominalvolumecomparator!=null) {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeCmprtr(medicinalproductmanufacturedphysicalcharacteristicsnominalvolumecomparator.toCode());
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeCmprtr("NULL");
		}

		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_NominalVolume_Cd ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsnominalvolume.hasCode()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeCd(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsnominalvolume.getCode()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeCd("NULL");
		}


		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_NominalVolume_Unt ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsnominalvolume.hasUnit()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeUnt(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsnominalvolume.getUnit()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeUnt("NULL");
		}


		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_NominalVolume_Sys ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristicsnominalvolume.hasSystem()) {

			m.addMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeSys(String.valueOf(medicinalproductmanufacturedphysicalcharacteristicsnominalvolume.getSystem()));
		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsNominalVolumeSys("NULL");
		}


		/******************** MdcnlPrdctMnfctred_PhysclCrctrstcs_Imprint ********************************************************************************/
		if(medicinalproductmanufacturedphysicalcharacteristics.hasImprint()) {

			String  array = "[";
			for(int incr=0; incr<medicinalproductmanufacturedphysicalcharacteristics.getImprint().size(); incr++) {
				array = array + medicinalproductmanufacturedphysicalcharacteristics.getImprint().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsImprint(array);

		} else {
			m.addMdcnlPrdctMnfctredPhysclCrctrstcsImprint("NULL");
		}


		/******************** medicinalproductmanufacturedunitofpresentation ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductmanufacturedunitofpresentation = medicinalproductmanufactured.getUnitOfPresentation();

		/******************** MdcnlPrdctMnfctred_UntOfPrsnttn_Txt ********************************************************************************/
		if(medicinalproductmanufacturedunitofpresentation.hasText()) {

			m.addMdcnlPrdctMnfctredUntOfPrsnttnTxt(String.valueOf(medicinalproductmanufacturedunitofpresentation.getText()));
		} else {
			m.addMdcnlPrdctMnfctredUntOfPrsnttnTxt("NULL");
		}


		/******************** medicinalproductmanufacturedunitofpresentationcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductmanufacturedunitofpresentationcodinglist = medicinalproductmanufacturedunitofpresentation.getCoding();
		for(int medicinalproductmanufacturedunitofpresentationcodingi = 0; medicinalproductmanufacturedunitofpresentationcodingi<medicinalproductmanufacturedunitofpresentationcodinglist.size();medicinalproductmanufacturedunitofpresentationcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductmanufacturedunitofpresentationcoding = medicinalproductmanufacturedunitofpresentationcodinglist.get(medicinalproductmanufacturedunitofpresentationcodingi);

		/******************** MdcnlPrdctMnfctred_UntOfPrsnttn_Cdg_Dsply ********************************************************************************/
		if(medicinalproductmanufacturedunitofpresentationcodingi == 0) {m.addMdcnlPrdctMnfctredUntOfPrsnttnCdgDsply("[");}
		if(medicinalproductmanufacturedunitofpresentationcoding.hasDisplay()) {

			m.addMdcnlPrdctMnfctredUntOfPrsnttnCdgDsply(String.valueOf(medicinalproductmanufacturedunitofpresentationcoding.getDisplay()));
		} else {
			m.addMdcnlPrdctMnfctredUntOfPrsnttnCdgDsply("NULL");
		}

		if(medicinalproductmanufacturedunitofpresentationcodingi == medicinalproductmanufacturedunitofpresentationcodinglist.size()-1) {m.addMdcnlPrdctMnfctredUntOfPrsnttnCdgDsply("]");}


		/******************** MdcnlPrdctMnfctred_UntOfPrsnttn_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductmanufacturedunitofpresentationcodingi == 0) {m.addMdcnlPrdctMnfctredUntOfPrsnttnCdgVrsn("[");}
		if(medicinalproductmanufacturedunitofpresentationcoding.hasVersion()) {

			m.addMdcnlPrdctMnfctredUntOfPrsnttnCdgVrsn(String.valueOf(medicinalproductmanufacturedunitofpresentationcoding.getVersion()));
		} else {
			m.addMdcnlPrdctMnfctredUntOfPrsnttnCdgVrsn("NULL");
		}

		if(medicinalproductmanufacturedunitofpresentationcodingi == medicinalproductmanufacturedunitofpresentationcodinglist.size()-1) {m.addMdcnlPrdctMnfctredUntOfPrsnttnCdgVrsn("]");}


		/******************** MdcnlPrdctMnfctred_UntOfPrsnttn_Cdg_Cd ********************************************************************************/
		if(medicinalproductmanufacturedunitofpresentationcodingi == 0) {m.addMdcnlPrdctMnfctredUntOfPrsnttnCdgCd("[");}
		if(medicinalproductmanufacturedunitofpresentationcoding.hasCode()) {

			m.addMdcnlPrdctMnfctredUntOfPrsnttnCdgCd(String.valueOf(medicinalproductmanufacturedunitofpresentationcoding.getCode()));
		} else {
			m.addMdcnlPrdctMnfctredUntOfPrsnttnCdgCd("NULL");
		}

		if(medicinalproductmanufacturedunitofpresentationcodingi == medicinalproductmanufacturedunitofpresentationcodinglist.size()-1) {m.addMdcnlPrdctMnfctredUntOfPrsnttnCdgCd("]");}


		/******************** MdcnlPrdctMnfctred_UntOfPrsnttn_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductmanufacturedunitofpresentationcodingi == 0) {m.addMdcnlPrdctMnfctredUntOfPrsnttnCdgUsrSltd("[");}
		if(medicinalproductmanufacturedunitofpresentationcoding.hasUserSelected()) {

			m.addMdcnlPrdctMnfctredUntOfPrsnttnCdgUsrSltd(String.valueOf(medicinalproductmanufacturedunitofpresentationcoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctMnfctredUntOfPrsnttnCdgUsrSltd("NULL");
		}

		if(medicinalproductmanufacturedunitofpresentationcodingi == medicinalproductmanufacturedunitofpresentationcodinglist.size()-1) {m.addMdcnlPrdctMnfctredUntOfPrsnttnCdgUsrSltd("]");}


		/******************** MdcnlPrdctMnfctred_UntOfPrsnttn_Cdg_Sys ********************************************************************************/
		if(medicinalproductmanufacturedunitofpresentationcodingi == 0) {m.addMdcnlPrdctMnfctredUntOfPrsnttnCdgSys("[");}
		if(medicinalproductmanufacturedunitofpresentationcoding.hasSystem()) {

			m.addMdcnlPrdctMnfctredUntOfPrsnttnCdgSys(String.valueOf(medicinalproductmanufacturedunitofpresentationcoding.getSystem()));
		} else {
			m.addMdcnlPrdctMnfctredUntOfPrsnttnCdgSys("NULL");
		}

		if(medicinalproductmanufacturedunitofpresentationcodingi == medicinalproductmanufacturedunitofpresentationcodinglist.size()-1) {m.addMdcnlPrdctMnfctredUntOfPrsnttnCdgSys("]");}


		 };
		/******************** medicinalproductmanufacturedothercharacteristics ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> medicinalproductmanufacturedothercharacteristicslist = medicinalproductmanufactured.getOtherCharacteristics();
		for(int medicinalproductmanufacturedothercharacteristicsi = 0; medicinalproductmanufacturedothercharacteristicsi<medicinalproductmanufacturedothercharacteristicslist.size();medicinalproductmanufacturedothercharacteristicsi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  medicinalproductmanufacturedothercharacteristics = medicinalproductmanufacturedothercharacteristicslist.get(medicinalproductmanufacturedothercharacteristicsi);

		/******************** MdcnlPrdctMnfctred_OtherCrctrstcs_Txt ********************************************************************************/
		if(medicinalproductmanufacturedothercharacteristicsi == 0) {m.addMdcnlPrdctMnfctredOtherCrctrstcsTxt("[");}
		if(medicinalproductmanufacturedothercharacteristics.hasText()) {

			m.addMdcnlPrdctMnfctredOtherCrctrstcsTxt(String.valueOf(medicinalproductmanufacturedothercharacteristics.getText()));
		} else {
			m.addMdcnlPrdctMnfctredOtherCrctrstcsTxt("NULL");
		}

		if(medicinalproductmanufacturedothercharacteristicsi == medicinalproductmanufacturedothercharacteristicslist.size()-1) {m.addMdcnlPrdctMnfctredOtherCrctrstcsTxt("]");}


		/******************** medicinalproductmanufacturedothercharacteristicscoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductmanufacturedothercharacteristicscodinglist = medicinalproductmanufacturedothercharacteristics.getCoding();
		for(int medicinalproductmanufacturedothercharacteristicscodingi = 0; medicinalproductmanufacturedothercharacteristicscodingi<medicinalproductmanufacturedothercharacteristicscodinglist.size();medicinalproductmanufacturedothercharacteristicscodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductmanufacturedothercharacteristicscoding = medicinalproductmanufacturedothercharacteristicscodinglist.get(medicinalproductmanufacturedothercharacteristicscodingi);

		/******************** MdcnlPrdctMnfctred_OtherCrctrstcs_Cdg_Dsply ********************************************************************************/
		if(medicinalproductmanufacturedothercharacteristicscodingi == 0) {m.addMdcnlPrdctMnfctredOtherCrctrstcsCdgDsply("[[");}
		if(medicinalproductmanufacturedothercharacteristicscoding.hasDisplay()) {

			m.addMdcnlPrdctMnfctredOtherCrctrstcsCdgDsply(String.valueOf(medicinalproductmanufacturedothercharacteristicscoding.getDisplay()));
		} else {
			m.addMdcnlPrdctMnfctredOtherCrctrstcsCdgDsply("NULL");
		}

		if(medicinalproductmanufacturedothercharacteristicscodingi == medicinalproductmanufacturedothercharacteristicscodinglist.size()-1) {m.addMdcnlPrdctMnfctredOtherCrctrstcsCdgDsply("]]");}


		/******************** MdcnlPrdctMnfctred_OtherCrctrstcs_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductmanufacturedothercharacteristicscodingi == 0) {m.addMdcnlPrdctMnfctredOtherCrctrstcsCdgVrsn("[[");}
		if(medicinalproductmanufacturedothercharacteristicscoding.hasVersion()) {

			m.addMdcnlPrdctMnfctredOtherCrctrstcsCdgVrsn(String.valueOf(medicinalproductmanufacturedothercharacteristicscoding.getVersion()));
		} else {
			m.addMdcnlPrdctMnfctredOtherCrctrstcsCdgVrsn("NULL");
		}

		if(medicinalproductmanufacturedothercharacteristicscodingi == medicinalproductmanufacturedothercharacteristicscodinglist.size()-1) {m.addMdcnlPrdctMnfctredOtherCrctrstcsCdgVrsn("]]");}


		/******************** MdcnlPrdctMnfctred_OtherCrctrstcs_Cdg_Cd ********************************************************************************/
		if(medicinalproductmanufacturedothercharacteristicscodingi == 0) {m.addMdcnlPrdctMnfctredOtherCrctrstcsCdgCd("[[");}
		if(medicinalproductmanufacturedothercharacteristicscoding.hasCode()) {

			m.addMdcnlPrdctMnfctredOtherCrctrstcsCdgCd(String.valueOf(medicinalproductmanufacturedothercharacteristicscoding.getCode()));
		} else {
			m.addMdcnlPrdctMnfctredOtherCrctrstcsCdgCd("NULL");
		}

		if(medicinalproductmanufacturedothercharacteristicscodingi == medicinalproductmanufacturedothercharacteristicscodinglist.size()-1) {m.addMdcnlPrdctMnfctredOtherCrctrstcsCdgCd("]]");}


		/******************** MdcnlPrdctMnfctred_OtherCrctrstcs_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductmanufacturedothercharacteristicscodingi == 0) {m.addMdcnlPrdctMnfctredOtherCrctrstcsCdgUsrSltd("[[");}
		if(medicinalproductmanufacturedothercharacteristicscoding.hasUserSelected()) {

			m.addMdcnlPrdctMnfctredOtherCrctrstcsCdgUsrSltd(String.valueOf(medicinalproductmanufacturedothercharacteristicscoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctMnfctredOtherCrctrstcsCdgUsrSltd("NULL");
		}

		if(medicinalproductmanufacturedothercharacteristicscodingi == medicinalproductmanufacturedothercharacteristicscodinglist.size()-1) {m.addMdcnlPrdctMnfctredOtherCrctrstcsCdgUsrSltd("]]");}


		/******************** MdcnlPrdctMnfctred_OtherCrctrstcs_Cdg_Sys ********************************************************************************/
		if(medicinalproductmanufacturedothercharacteristicscodingi == 0) {m.addMdcnlPrdctMnfctredOtherCrctrstcsCdgSys("[[");}
		if(medicinalproductmanufacturedothercharacteristicscoding.hasSystem()) {

			m.addMdcnlPrdctMnfctredOtherCrctrstcsCdgSys(String.valueOf(medicinalproductmanufacturedothercharacteristicscoding.getSystem()));
		} else {
			m.addMdcnlPrdctMnfctredOtherCrctrstcsCdgSys("NULL");
		}

		if(medicinalproductmanufacturedothercharacteristicscodingi == medicinalproductmanufacturedothercharacteristicscodinglist.size()-1) {m.addMdcnlPrdctMnfctredOtherCrctrstcsCdgSys("]]");}


		 };
		 };
		/******************** medicinalproductmanufacturedmanufactureddoseform ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductmanufacturedmanufactureddoseform = medicinalproductmanufactured.getManufacturedDoseForm();

		/******************** MdcnlPrdctMnfctred_MnfctredDoseFrm_Txt ********************************************************************************/
		if(medicinalproductmanufacturedmanufactureddoseform.hasText()) {

			m.addMdcnlPrdctMnfctredMnfctredDoseFrmTxt(String.valueOf(medicinalproductmanufacturedmanufactureddoseform.getText()));
		} else {
			m.addMdcnlPrdctMnfctredMnfctredDoseFrmTxt("NULL");
		}


		/******************** medicinalproductmanufacturedmanufactureddoseformcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> medicinalproductmanufacturedmanufactureddoseformcodinglist = medicinalproductmanufacturedmanufactureddoseform.getCoding();
		for(int medicinalproductmanufacturedmanufactureddoseformcodingi = 0; medicinalproductmanufacturedmanufactureddoseformcodingi<medicinalproductmanufacturedmanufactureddoseformcodinglist.size();medicinalproductmanufacturedmanufactureddoseformcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  medicinalproductmanufacturedmanufactureddoseformcoding = medicinalproductmanufacturedmanufactureddoseformcodinglist.get(medicinalproductmanufacturedmanufactureddoseformcodingi);

		/******************** MdcnlPrdctMnfctred_MnfctredDoseFrm_Cdg_Dsply ********************************************************************************/
		if(medicinalproductmanufacturedmanufactureddoseformcodingi == 0) {m.addMdcnlPrdctMnfctredMnfctredDoseFrmCdgDsply("[");}
		if(medicinalproductmanufacturedmanufactureddoseformcoding.hasDisplay()) {

			m.addMdcnlPrdctMnfctredMnfctredDoseFrmCdgDsply(String.valueOf(medicinalproductmanufacturedmanufactureddoseformcoding.getDisplay()));
		} else {
			m.addMdcnlPrdctMnfctredMnfctredDoseFrmCdgDsply("NULL");
		}

		if(medicinalproductmanufacturedmanufactureddoseformcodingi == medicinalproductmanufacturedmanufactureddoseformcodinglist.size()-1) {m.addMdcnlPrdctMnfctredMnfctredDoseFrmCdgDsply("]");}


		/******************** MdcnlPrdctMnfctred_MnfctredDoseFrm_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductmanufacturedmanufactureddoseformcodingi == 0) {m.addMdcnlPrdctMnfctredMnfctredDoseFrmCdgVrsn("[");}
		if(medicinalproductmanufacturedmanufactureddoseformcoding.hasVersion()) {

			m.addMdcnlPrdctMnfctredMnfctredDoseFrmCdgVrsn(String.valueOf(medicinalproductmanufacturedmanufactureddoseformcoding.getVersion()));
		} else {
			m.addMdcnlPrdctMnfctredMnfctredDoseFrmCdgVrsn("NULL");
		}

		if(medicinalproductmanufacturedmanufactureddoseformcodingi == medicinalproductmanufacturedmanufactureddoseformcodinglist.size()-1) {m.addMdcnlPrdctMnfctredMnfctredDoseFrmCdgVrsn("]");}


		/******************** MdcnlPrdctMnfctred_MnfctredDoseFrm_Cdg_Cd ********************************************************************************/
		if(medicinalproductmanufacturedmanufactureddoseformcodingi == 0) {m.addMdcnlPrdctMnfctredMnfctredDoseFrmCdgCd("[");}
		if(medicinalproductmanufacturedmanufactureddoseformcoding.hasCode()) {

			m.addMdcnlPrdctMnfctredMnfctredDoseFrmCdgCd(String.valueOf(medicinalproductmanufacturedmanufactureddoseformcoding.getCode()));
		} else {
			m.addMdcnlPrdctMnfctredMnfctredDoseFrmCdgCd("NULL");
		}

		if(medicinalproductmanufacturedmanufactureddoseformcodingi == medicinalproductmanufacturedmanufactureddoseformcodinglist.size()-1) {m.addMdcnlPrdctMnfctredMnfctredDoseFrmCdgCd("]");}


		/******************** MdcnlPrdctMnfctred_MnfctredDoseFrm_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductmanufacturedmanufactureddoseformcodingi == 0) {m.addMdcnlPrdctMnfctredMnfctredDoseFrmCdgUsrSltd("[");}
		if(medicinalproductmanufacturedmanufactureddoseformcoding.hasUserSelected()) {

			m.addMdcnlPrdctMnfctredMnfctredDoseFrmCdgUsrSltd(String.valueOf(medicinalproductmanufacturedmanufactureddoseformcoding.getUserSelected()));
		} else {
			m.addMdcnlPrdctMnfctredMnfctredDoseFrmCdgUsrSltd("NULL");
		}

		if(medicinalproductmanufacturedmanufactureddoseformcodingi == medicinalproductmanufacturedmanufactureddoseformcodinglist.size()-1) {m.addMdcnlPrdctMnfctredMnfctredDoseFrmCdgUsrSltd("]");}


		/******************** MdcnlPrdctMnfctred_MnfctredDoseFrm_Cdg_Sys ********************************************************************************/
		if(medicinalproductmanufacturedmanufactureddoseformcodingi == 0) {m.addMdcnlPrdctMnfctredMnfctredDoseFrmCdgSys("[");}
		if(medicinalproductmanufacturedmanufactureddoseformcoding.hasSystem()) {

			m.addMdcnlPrdctMnfctredMnfctredDoseFrmCdgSys(String.valueOf(medicinalproductmanufacturedmanufactureddoseformcoding.getSystem()));
		} else {
			m.addMdcnlPrdctMnfctredMnfctredDoseFrmCdgSys("NULL");
		}

		if(medicinalproductmanufacturedmanufactureddoseformcodingi == medicinalproductmanufacturedmanufactureddoseformcodinglist.size()-1) {m.addMdcnlPrdctMnfctredMnfctredDoseFrmCdgSys("]");}


		 };
		/******************** MdcnlPrdctMnfctred_Igrdnt ********************************************************************************/
		if(medicinalproductmanufactured.hasIngredient()) {

			String  array = "[";
			for(int incr=0; incr<medicinalproductmanufactured.getIngredient().size(); incr++) {
				array = array + medicinalproductmanufactured.getIngredient().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdcnlPrdctMnfctredIgrdnt(array);

		} else {
			m.addMdcnlPrdctMnfctredIgrdnt("NULL");
		}


		/******************** medicinalproductmanufacturedquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductmanufacturedquantity = medicinalproductmanufactured.getQuantity();

		/******************** MdcnlPrdctMnfctred_Qnty_Vl ********************************************************************************/
		if(medicinalproductmanufacturedquantity.hasValue()) {

			m.addMdcnlPrdctMnfctredQntyVl(String.valueOf(medicinalproductmanufacturedquantity.getValue()));
		} else {
			m.addMdcnlPrdctMnfctredQntyVl("NULL");
		}


		/******************** medicinalproductmanufacturedquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductmanufacturedquantitycomparator = medicinalproductmanufacturedquantity.getComparator();
		if(medicinalproductmanufacturedquantitycomparator!=null) {
			m.addMdcnlPrdctMnfctredQntyCmprtr(medicinalproductmanufacturedquantitycomparator.toCode());
		} else {
			m.addMdcnlPrdctMnfctredQntyCmprtr("NULL");
		}

		/******************** MdcnlPrdctMnfctred_Qnty_Cd ********************************************************************************/
		if(medicinalproductmanufacturedquantity.hasCode()) {

			m.addMdcnlPrdctMnfctredQntyCd(String.valueOf(medicinalproductmanufacturedquantity.getCode()));
		} else {
			m.addMdcnlPrdctMnfctredQntyCd("NULL");
		}


		/******************** MdcnlPrdctMnfctred_Qnty_Unt ********************************************************************************/
		if(medicinalproductmanufacturedquantity.hasUnit()) {

			m.addMdcnlPrdctMnfctredQntyUnt(String.valueOf(medicinalproductmanufacturedquantity.getUnit()));
		} else {
			m.addMdcnlPrdctMnfctredQntyUnt("NULL");
		}


		/******************** MdcnlPrdctMnfctred_Qnty_Sys ********************************************************************************/
		if(medicinalproductmanufacturedquantity.hasSystem()) {

			m.addMdcnlPrdctMnfctredQntySys(String.valueOf(medicinalproductmanufacturedquantity.getSystem()));
		} else {
			m.addMdcnlPrdctMnfctredQntySys("NULL");
		}


		/******************** MdcnlPrdctMnfctred_Manufacturer ********************************************************************************/
		if(medicinalproductmanufactured.hasManufacturer()) {

			String  array = "[";
			for(int incr=0; incr<medicinalproductmanufactured.getManufacturer().size(); incr++) {
				array = array + medicinalproductmanufactured.getManufacturer().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMdcnlPrdctMnfctredManufacturer(array);

		} else {
			m.addMdcnlPrdctMnfctredManufacturer("NULL");
		}


		return m;
	}
}
