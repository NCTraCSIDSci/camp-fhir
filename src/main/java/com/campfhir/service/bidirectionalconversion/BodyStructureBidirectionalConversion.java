package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.BodyStructure;
public class BodyStructureBidirectionalConversion 
{
	public BodyStructure BodyStructures(org.hl7.fhir.r4.model.BodyStructure bodystructure) throws ParseException
	{
		 main.java.com.campfhir.model.BodyStructure b = new  main.java.com.campfhir.model.BodyStructure();

		/******************** id ********************************************************************************/
		b.setId(bodystructure.getIdElement().getIdPart());

		/******************** bodystructurelocation ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept bodystructurelocation = bodystructure.getLocation();

		/******************** BodyStrctr_Lctn_Txt ********************************************************************************/
		if(bodystructurelocation.hasText()) {

			b.addBodyStrctrLctnTxt(String.valueOf(bodystructurelocation.getText()));
		} else {
			b.addBodyStrctrLctnTxt("NULL");
		}


		/******************** bodystructurelocationcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> bodystructurelocationcodinglist = bodystructurelocation.getCoding();
		for(int bodystructurelocationcodingi = 0; bodystructurelocationcodingi<bodystructurelocationcodinglist.size();bodystructurelocationcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  bodystructurelocationcoding = bodystructurelocationcodinglist.get(bodystructurelocationcodingi);

		/******************** BodyStrctr_Lctn_Cdg_Dsply ********************************************************************************/
		if(bodystructurelocationcodingi == 0) {b.addBodyStrctrLctnCdgDsply("[");}
		if(bodystructurelocationcoding.hasDisplay()) {

			b.addBodyStrctrLctnCdgDsply(String.valueOf(bodystructurelocationcoding.getDisplay()));
		} else {
			b.addBodyStrctrLctnCdgDsply("NULL");
		}

		if(bodystructurelocationcodingi == bodystructurelocationcodinglist.size()-1) {b.addBodyStrctrLctnCdgDsply("]");}


		/******************** BodyStrctr_Lctn_Cdg_Vrsn ********************************************************************************/
		if(bodystructurelocationcodingi == 0) {b.addBodyStrctrLctnCdgVrsn("[");}
		if(bodystructurelocationcoding.hasVersion()) {

			b.addBodyStrctrLctnCdgVrsn(String.valueOf(bodystructurelocationcoding.getVersion()));
		} else {
			b.addBodyStrctrLctnCdgVrsn("NULL");
		}

		if(bodystructurelocationcodingi == bodystructurelocationcodinglist.size()-1) {b.addBodyStrctrLctnCdgVrsn("]");}


		/******************** BodyStrctr_Lctn_Cdg_Cd ********************************************************************************/
		if(bodystructurelocationcodingi == 0) {b.addBodyStrctrLctnCdgCd("[");}
		if(bodystructurelocationcoding.hasCode()) {

			b.addBodyStrctrLctnCdgCd(String.valueOf(bodystructurelocationcoding.getCode()));
		} else {
			b.addBodyStrctrLctnCdgCd("NULL");
		}

		if(bodystructurelocationcodingi == bodystructurelocationcodinglist.size()-1) {b.addBodyStrctrLctnCdgCd("]");}


		/******************** BodyStrctr_Lctn_Cdg_UsrSltd ********************************************************************************/
		if(bodystructurelocationcodingi == 0) {b.addBodyStrctrLctnCdgUsrSltd("[");}
		if(bodystructurelocationcoding.hasUserSelected()) {

			b.addBodyStrctrLctnCdgUsrSltd(String.valueOf(bodystructurelocationcoding.getUserSelected()));
		} else {
			b.addBodyStrctrLctnCdgUsrSltd("NULL");
		}

		if(bodystructurelocationcodingi == bodystructurelocationcodinglist.size()-1) {b.addBodyStrctrLctnCdgUsrSltd("]");}


		/******************** BodyStrctr_Lctn_Cdg_Sys ********************************************************************************/
		if(bodystructurelocationcodingi == 0) {b.addBodyStrctrLctnCdgSys("[");}
		if(bodystructurelocationcoding.hasSystem()) {

			b.addBodyStrctrLctnCdgSys(String.valueOf(bodystructurelocationcoding.getSystem()));
		} else {
			b.addBodyStrctrLctnCdgSys("NULL");
		}

		if(bodystructurelocationcodingi == bodystructurelocationcodinglist.size()-1) {b.addBodyStrctrLctnCdgSys("]");}


		 };
		/******************** BodyStrctr_Dscrptn ********************************************************************************/
		if(bodystructure.hasDescription()) {

			b.addBodyStrctrDscrptn(String.valueOf(bodystructure.getDescription()));
		} else {
			b.addBodyStrctrDscrptn("NULL");
		}


		/******************** bodystructureidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> bodystructureidentifierlist = bodystructure.getIdentifier();
		for(int bodystructureidentifieri = 0; bodystructureidentifieri<bodystructureidentifierlist.size();bodystructureidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  bodystructureidentifier = bodystructureidentifierlist.get(bodystructureidentifieri);

		/******************** BodyStrctr_Id_Vl ********************************************************************************/
		if(bodystructureidentifieri == 0) {b.addBodyStrctrIdVl("[");}
		if(bodystructureidentifier.hasValue()) {

			b.addBodyStrctrIdVl(String.valueOf(bodystructureidentifier.getValue()));
		} else {
			b.addBodyStrctrIdVl("NULL");
		}

		if(bodystructureidentifieri == bodystructureidentifierlist.size()-1) {b.addBodyStrctrIdVl("]");}


		/******************** bodystructureidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept bodystructureidentifiertype = bodystructureidentifier.getType();

		/******************** BodyStrctr_Id_Typ_Txt ********************************************************************************/
		if(bodystructureidentifieri == 0) {b.addBodyStrctrIdTypTxt("[");}
		if(bodystructureidentifiertype.hasText()) {

			b.addBodyStrctrIdTypTxt(String.valueOf(bodystructureidentifiertype.getText()));
		} else {
			b.addBodyStrctrIdTypTxt("NULL");
		}

		if(bodystructureidentifieri == bodystructureidentifierlist.size()-1) {b.addBodyStrctrIdTypTxt("]");}


		/******************** bodystructureidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> bodystructureidentifiertypecodinglist = bodystructureidentifiertype.getCoding();
		for(int bodystructureidentifiertypecodingi = 0; bodystructureidentifiertypecodingi<bodystructureidentifiertypecodinglist.size();bodystructureidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  bodystructureidentifiertypecoding = bodystructureidentifiertypecodinglist.get(bodystructureidentifiertypecodingi);

		/******************** BodyStrctr_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(bodystructureidentifiertypecodingi == 0) {b.addBodyStrctrIdTypCdgDsply("[[");}
		if(bodystructureidentifiertypecoding.hasDisplay()) {

			b.addBodyStrctrIdTypCdgDsply(String.valueOf(bodystructureidentifiertypecoding.getDisplay()));
		} else {
			b.addBodyStrctrIdTypCdgDsply("NULL");
		}

		if(bodystructureidentifiertypecodingi == bodystructureidentifiertypecodinglist.size()-1) {b.addBodyStrctrIdTypCdgDsply("]]");}


		/******************** BodyStrctr_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(bodystructureidentifiertypecodingi == 0) {b.addBodyStrctrIdTypCdgVrsn("[[");}
		if(bodystructureidentifiertypecoding.hasVersion()) {

			b.addBodyStrctrIdTypCdgVrsn(String.valueOf(bodystructureidentifiertypecoding.getVersion()));
		} else {
			b.addBodyStrctrIdTypCdgVrsn("NULL");
		}

		if(bodystructureidentifiertypecodingi == bodystructureidentifiertypecodinglist.size()-1) {b.addBodyStrctrIdTypCdgVrsn("]]");}


		/******************** BodyStrctr_Id_Typ_Cdg_Cd ********************************************************************************/
		if(bodystructureidentifiertypecodingi == 0) {b.addBodyStrctrIdTypCdgCd("[[");}
		if(bodystructureidentifiertypecoding.hasCode()) {

			b.addBodyStrctrIdTypCdgCd(String.valueOf(bodystructureidentifiertypecoding.getCode()));
		} else {
			b.addBodyStrctrIdTypCdgCd("NULL");
		}

		if(bodystructureidentifiertypecodingi == bodystructureidentifiertypecodinglist.size()-1) {b.addBodyStrctrIdTypCdgCd("]]");}


		/******************** BodyStrctr_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(bodystructureidentifiertypecodingi == 0) {b.addBodyStrctrIdTypCdgUsrSltd("[[");}
		if(bodystructureidentifiertypecoding.hasUserSelected()) {

			b.addBodyStrctrIdTypCdgUsrSltd(String.valueOf(bodystructureidentifiertypecoding.getUserSelected()));
		} else {
			b.addBodyStrctrIdTypCdgUsrSltd("NULL");
		}

		if(bodystructureidentifiertypecodingi == bodystructureidentifiertypecodinglist.size()-1) {b.addBodyStrctrIdTypCdgUsrSltd("]]");}


		/******************** BodyStrctr_Id_Typ_Cdg_Sys ********************************************************************************/
		if(bodystructureidentifiertypecodingi == 0) {b.addBodyStrctrIdTypCdgSys("[[");}
		if(bodystructureidentifiertypecoding.hasSystem()) {

			b.addBodyStrctrIdTypCdgSys(String.valueOf(bodystructureidentifiertypecoding.getSystem()));
		} else {
			b.addBodyStrctrIdTypCdgSys("NULL");
		}

		if(bodystructureidentifiertypecodingi == bodystructureidentifiertypecodinglist.size()-1) {b.addBodyStrctrIdTypCdgSys("]]");}


		 };
		/******************** bodystructureidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period bodystructureidentifierperiod = bodystructureidentifier.getPeriod();

		/******************** BodyStrctr_Id_Prd_Strt ********************************************************************************/
		if(bodystructureidentifieri == 0) {b.addBodyStrctrIdPrdStrt("[");}
		if(bodystructureidentifierperiod.hasStart()) {

			b.addBodyStrctrIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(bodystructureidentifierperiod.getStart())+"\"");
		} else {
			b.addBodyStrctrIdPrdStrt("NULL");
		}

		if(bodystructureidentifieri == bodystructureidentifierlist.size()-1) {b.addBodyStrctrIdPrdStrt("]");}


		/******************** BodyStrctr_Id_Prd_End ********************************************************************************/
		if(bodystructureidentifieri == 0) {b.addBodyStrctrIdPrdEnd("[");}
		if(bodystructureidentifierperiod.hasEnd()) {

			b.addBodyStrctrIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(bodystructureidentifierperiod.getEnd())+"\"");
		} else {
			b.addBodyStrctrIdPrdEnd("NULL");
		}

		if(bodystructureidentifieri == bodystructureidentifierlist.size()-1) {b.addBodyStrctrIdPrdEnd("]");}


		/******************** bodystructureidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse bodystructureidentifieruse = bodystructureidentifier.getUse();
		if(bodystructureidentifieruse!=null) {
		if(bodystructureidentifieri == 0) {

		b.addBodyStrctrIdUse("[");		}
			b.addBodyStrctrIdUse(bodystructureidentifieruse.toCode());
		if(bodystructureidentifieri == bodystructureidentifierlist.size()-1) {

		b.addBodyStrctrIdUse("]");		}

		} else {
			b.addBodyStrctrIdUse("NULL");
		}

		/******************** BodyStrctr_Id_Assigner ********************************************************************************/
		if(bodystructureidentifieri == 0) {b.addBodyStrctrIdAssigner("[");}
		if(bodystructureidentifier.hasAssigner()) {

			if(bodystructureidentifier.getAssigner().getReference() != null) {
			b.addBodyStrctrIdAssigner(bodystructureidentifier.getAssigner().getReference());
			}
		} else {
			b.addBodyStrctrIdAssigner("NULL");
		}

		if(bodystructureidentifieri == bodystructureidentifierlist.size()-1) {b.addBodyStrctrIdAssigner("]");}


		/******************** BodyStrctr_Id_Sys ********************************************************************************/
		if(bodystructureidentifieri == 0) {b.addBodyStrctrIdSys("[");}
		if(bodystructureidentifier.hasSystem()) {

			b.addBodyStrctrIdSys(String.valueOf(bodystructureidentifier.getSystem()));
		} else {
			b.addBodyStrctrIdSys("NULL");
		}

		if(bodystructureidentifieri == bodystructureidentifierlist.size()-1) {b.addBodyStrctrIdSys("]");}


		 };
		/******************** bodystructureimage ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Attachment> bodystructureimagelist = bodystructure.getImage();
		for(int bodystructureimagei = 0; bodystructureimagei<bodystructureimagelist.size();bodystructureimagei++ ) {
		org.hl7.fhir.r4.model.Attachment  bodystructureimage = bodystructureimagelist.get(bodystructureimagei);

		/******************** BodyStrctr_Image_Sz ********************************************************************************/
		if(bodystructureimagei == 0) {b.addBodyStrctrImageSz("[");}
		if(bodystructureimage.hasSize()) {

			b.addBodyStrctrImageSz(String.valueOf(bodystructureimage.getSize()));
		} else {
			b.addBodyStrctrImageSz("NULL");
		}

		if(bodystructureimagei == bodystructureimagelist.size()-1) {b.addBodyStrctrImageSz("]");}


		/******************** BodyStrctr_Image_Lnguage ********************************************************************************/
		if(bodystructureimagei == 0) {b.addBodyStrctrImageLnguage("[");}
		if(bodystructureimage.hasLanguage()) {

			b.addBodyStrctrImageLnguage(String.valueOf(bodystructureimage.getLanguage()));
		} else {
			b.addBodyStrctrImageLnguage("NULL");
		}

		if(bodystructureimagei == bodystructureimagelist.size()-1) {b.addBodyStrctrImageLnguage("]");}


		/******************** BodyStrctr_Image_CntntTyp ********************************************************************************/
		if(bodystructureimagei == 0) {b.addBodyStrctrImageCntntTyp("[");}
		if(bodystructureimage.hasContentType()) {

			b.addBodyStrctrImageCntntTyp(String.valueOf(bodystructureimage.getContentType()));
		} else {
			b.addBodyStrctrImageCntntTyp("NULL");
		}

		if(bodystructureimagei == bodystructureimagelist.size()-1) {b.addBodyStrctrImageCntntTyp("]");}


		/******************** BodyStrctr_Image_Hash ********************************************************************************/
		if(bodystructureimagei == 0) {b.addBodyStrctrImageHash("[");}
		if(bodystructureimage.hasHash()) {

			b.addBodyStrctrImageHash(new String(bodystructureimage.getHash()));
		} else {
			b.addBodyStrctrImageHash("NULL");
		}

		if(bodystructureimagei == bodystructureimagelist.size()-1) {b.addBodyStrctrImageHash("]");}


		/******************** BodyStrctr_Image_Data ********************************************************************************/
		if(bodystructureimagei == 0) {b.addBodyStrctrImageData("[");}
		if(bodystructureimage.hasData()) {

			b.addBodyStrctrImageData(new String(bodystructureimage.getData()));
		} else {
			b.addBodyStrctrImageData("NULL");
		}

		if(bodystructureimagei == bodystructureimagelist.size()-1) {b.addBodyStrctrImageData("]");}


		/******************** BodyStrctr_Image_Creation ********************************************************************************/
		if(bodystructureimagei == 0) {b.addBodyStrctrImageCreation("[");}
		if(bodystructureimage.hasCreation()) {

			b.addBodyStrctrImageCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(bodystructureimage.getCreation())+"\"");
		} else {
			b.addBodyStrctrImageCreation("NULL");
		}

		if(bodystructureimagei == bodystructureimagelist.size()-1) {b.addBodyStrctrImageCreation("]");}


		/******************** BodyStrctr_Image_Ttl ********************************************************************************/
		if(bodystructureimagei == 0) {b.addBodyStrctrImageTtl("[");}
		if(bodystructureimage.hasTitle()) {

			b.addBodyStrctrImageTtl(String.valueOf(bodystructureimage.getTitle()));
		} else {
			b.addBodyStrctrImageTtl("NULL");
		}

		if(bodystructureimagei == bodystructureimagelist.size()-1) {b.addBodyStrctrImageTtl("]");}


		/******************** BodyStrctr_Image_Url ********************************************************************************/
		if(bodystructureimagei == 0) {b.addBodyStrctrImageUrl("[");}
		if(bodystructureimage.hasUrl()) {

			b.addBodyStrctrImageUrl(String.valueOf(bodystructureimage.getUrl()));
		} else {
			b.addBodyStrctrImageUrl("NULL");
		}

		if(bodystructureimagei == bodystructureimagelist.size()-1) {b.addBodyStrctrImageUrl("]");}


		 };
		/******************** bodystructuremorphology ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept bodystructuremorphology = bodystructure.getMorphology();

		/******************** BodyStrctr_Morphology_Txt ********************************************************************************/
		if(bodystructuremorphology.hasText()) {

			b.addBodyStrctrMorphologyTxt(String.valueOf(bodystructuremorphology.getText()));
		} else {
			b.addBodyStrctrMorphologyTxt("NULL");
		}


		/******************** bodystructuremorphologycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> bodystructuremorphologycodinglist = bodystructuremorphology.getCoding();
		for(int bodystructuremorphologycodingi = 0; bodystructuremorphologycodingi<bodystructuremorphologycodinglist.size();bodystructuremorphologycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  bodystructuremorphologycoding = bodystructuremorphologycodinglist.get(bodystructuremorphologycodingi);

		/******************** BodyStrctr_Morphology_Cdg_Dsply ********************************************************************************/
		if(bodystructuremorphologycodingi == 0) {b.addBodyStrctrMorphologyCdgDsply("[");}
		if(bodystructuremorphologycoding.hasDisplay()) {

			b.addBodyStrctrMorphologyCdgDsply(String.valueOf(bodystructuremorphologycoding.getDisplay()));
		} else {
			b.addBodyStrctrMorphologyCdgDsply("NULL");
		}

		if(bodystructuremorphologycodingi == bodystructuremorphologycodinglist.size()-1) {b.addBodyStrctrMorphologyCdgDsply("]");}


		/******************** BodyStrctr_Morphology_Cdg_Vrsn ********************************************************************************/
		if(bodystructuremorphologycodingi == 0) {b.addBodyStrctrMorphologyCdgVrsn("[");}
		if(bodystructuremorphologycoding.hasVersion()) {

			b.addBodyStrctrMorphologyCdgVrsn(String.valueOf(bodystructuremorphologycoding.getVersion()));
		} else {
			b.addBodyStrctrMorphologyCdgVrsn("NULL");
		}

		if(bodystructuremorphologycodingi == bodystructuremorphologycodinglist.size()-1) {b.addBodyStrctrMorphologyCdgVrsn("]");}


		/******************** BodyStrctr_Morphology_Cdg_Cd ********************************************************************************/
		if(bodystructuremorphologycodingi == 0) {b.addBodyStrctrMorphologyCdgCd("[");}
		if(bodystructuremorphologycoding.hasCode()) {

			b.addBodyStrctrMorphologyCdgCd(String.valueOf(bodystructuremorphologycoding.getCode()));
		} else {
			b.addBodyStrctrMorphologyCdgCd("NULL");
		}

		if(bodystructuremorphologycodingi == bodystructuremorphologycodinglist.size()-1) {b.addBodyStrctrMorphologyCdgCd("]");}


		/******************** BodyStrctr_Morphology_Cdg_UsrSltd ********************************************************************************/
		if(bodystructuremorphologycodingi == 0) {b.addBodyStrctrMorphologyCdgUsrSltd("[");}
		if(bodystructuremorphologycoding.hasUserSelected()) {

			b.addBodyStrctrMorphologyCdgUsrSltd(String.valueOf(bodystructuremorphologycoding.getUserSelected()));
		} else {
			b.addBodyStrctrMorphologyCdgUsrSltd("NULL");
		}

		if(bodystructuremorphologycodingi == bodystructuremorphologycodinglist.size()-1) {b.addBodyStrctrMorphologyCdgUsrSltd("]");}


		/******************** BodyStrctr_Morphology_Cdg_Sys ********************************************************************************/
		if(bodystructuremorphologycodingi == 0) {b.addBodyStrctrMorphologyCdgSys("[");}
		if(bodystructuremorphologycoding.hasSystem()) {

			b.addBodyStrctrMorphologyCdgSys(String.valueOf(bodystructuremorphologycoding.getSystem()));
		} else {
			b.addBodyStrctrMorphologyCdgSys("NULL");
		}

		if(bodystructuremorphologycodingi == bodystructuremorphologycodinglist.size()-1) {b.addBodyStrctrMorphologyCdgSys("]");}


		 };
		/******************** bodystructurelocationqualifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> bodystructurelocationqualifierlist = bodystructure.getLocationQualifier();
		for(int bodystructurelocationqualifieri = 0; bodystructurelocationqualifieri<bodystructurelocationqualifierlist.size();bodystructurelocationqualifieri++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  bodystructurelocationqualifier = bodystructurelocationqualifierlist.get(bodystructurelocationqualifieri);

		/******************** BodyStrctr_LctnQualifier_Txt ********************************************************************************/
		if(bodystructurelocationqualifieri == 0) {b.addBodyStrctrLctnQualifierTxt("[");}
		if(bodystructurelocationqualifier.hasText()) {

			b.addBodyStrctrLctnQualifierTxt(String.valueOf(bodystructurelocationqualifier.getText()));
		} else {
			b.addBodyStrctrLctnQualifierTxt("NULL");
		}

		if(bodystructurelocationqualifieri == bodystructurelocationqualifierlist.size()-1) {b.addBodyStrctrLctnQualifierTxt("]");}


		/******************** bodystructurelocationqualifiercoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> bodystructurelocationqualifiercodinglist = bodystructurelocationqualifier.getCoding();
		for(int bodystructurelocationqualifiercodingi = 0; bodystructurelocationqualifiercodingi<bodystructurelocationqualifiercodinglist.size();bodystructurelocationqualifiercodingi++ ) {
		org.hl7.fhir.r4.model.Coding  bodystructurelocationqualifiercoding = bodystructurelocationqualifiercodinglist.get(bodystructurelocationqualifiercodingi);

		/******************** BodyStrctr_LctnQualifier_Cdg_Dsply ********************************************************************************/
		if(bodystructurelocationqualifiercodingi == 0) {b.addBodyStrctrLctnQualifierCdgDsply("[[");}
		if(bodystructurelocationqualifiercoding.hasDisplay()) {

			b.addBodyStrctrLctnQualifierCdgDsply(String.valueOf(bodystructurelocationqualifiercoding.getDisplay()));
		} else {
			b.addBodyStrctrLctnQualifierCdgDsply("NULL");
		}

		if(bodystructurelocationqualifiercodingi == bodystructurelocationqualifiercodinglist.size()-1) {b.addBodyStrctrLctnQualifierCdgDsply("]]");}


		/******************** BodyStrctr_LctnQualifier_Cdg_Vrsn ********************************************************************************/
		if(bodystructurelocationqualifiercodingi == 0) {b.addBodyStrctrLctnQualifierCdgVrsn("[[");}
		if(bodystructurelocationqualifiercoding.hasVersion()) {

			b.addBodyStrctrLctnQualifierCdgVrsn(String.valueOf(bodystructurelocationqualifiercoding.getVersion()));
		} else {
			b.addBodyStrctrLctnQualifierCdgVrsn("NULL");
		}

		if(bodystructurelocationqualifiercodingi == bodystructurelocationqualifiercodinglist.size()-1) {b.addBodyStrctrLctnQualifierCdgVrsn("]]");}


		/******************** BodyStrctr_LctnQualifier_Cdg_Cd ********************************************************************************/
		if(bodystructurelocationqualifiercodingi == 0) {b.addBodyStrctrLctnQualifierCdgCd("[[");}
		if(bodystructurelocationqualifiercoding.hasCode()) {

			b.addBodyStrctrLctnQualifierCdgCd(String.valueOf(bodystructurelocationqualifiercoding.getCode()));
		} else {
			b.addBodyStrctrLctnQualifierCdgCd("NULL");
		}

		if(bodystructurelocationqualifiercodingi == bodystructurelocationqualifiercodinglist.size()-1) {b.addBodyStrctrLctnQualifierCdgCd("]]");}


		/******************** BodyStrctr_LctnQualifier_Cdg_UsrSltd ********************************************************************************/
		if(bodystructurelocationqualifiercodingi == 0) {b.addBodyStrctrLctnQualifierCdgUsrSltd("[[");}
		if(bodystructurelocationqualifiercoding.hasUserSelected()) {

			b.addBodyStrctrLctnQualifierCdgUsrSltd(String.valueOf(bodystructurelocationqualifiercoding.getUserSelected()));
		} else {
			b.addBodyStrctrLctnQualifierCdgUsrSltd("NULL");
		}

		if(bodystructurelocationqualifiercodingi == bodystructurelocationqualifiercodinglist.size()-1) {b.addBodyStrctrLctnQualifierCdgUsrSltd("]]");}


		/******************** BodyStrctr_LctnQualifier_Cdg_Sys ********************************************************************************/
		if(bodystructurelocationqualifiercodingi == 0) {b.addBodyStrctrLctnQualifierCdgSys("[[");}
		if(bodystructurelocationqualifiercoding.hasSystem()) {

			b.addBodyStrctrLctnQualifierCdgSys(String.valueOf(bodystructurelocationqualifiercoding.getSystem()));
		} else {
			b.addBodyStrctrLctnQualifierCdgSys("NULL");
		}

		if(bodystructurelocationqualifiercodingi == bodystructurelocationqualifiercodinglist.size()-1) {b.addBodyStrctrLctnQualifierCdgSys("]]");}


		 };
		 };
		/******************** BodyStrctr_Active ********************************************************************************/
		if(bodystructure.hasActive()) {

			b.addBodyStrctrActive(String.valueOf(bodystructure.getActive()));
		} else {
			b.addBodyStrctrActive("NULL");
		}


		/******************** BodyStrctr_Pnt ********************************************************************************/
		if(bodystructure.hasPatient()) {

			if(bodystructure.getPatient().getReference() != null) {
			b.addBodyStrctrPnt(bodystructure.getPatient().getReference());
			}
		} else {
			b.addBodyStrctrPnt("NULL");
		}


		return b;
	}
}
