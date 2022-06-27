package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.BodyStructure;
public class BodyStructureBidirectionalConversion 
{
	public BodyStructure BodyStructures(org.hl7.fhir.r4.model.BodyStructure bodystructure) throws ParseException
	{
		 main.java.com.campfhir.model.BodyStructure b = new  main.java.com.campfhir.model.BodyStructure();

		/******************** id ********************************************************************************/
		bodystructure.setId(b.getId());

		/******************** bodystructurelocation ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept bodystructurelocation = bodystructure.getLocation();

		/******************** BodyStrctr_Lctn_Txt ********************************************************************************/
		if(bodystructurelocation.hasText()) {
			b.setBodyStrctrLctnTxt(String.valueOf(bodystructurelocation.getText()));
		}
		/******************** bodystructurelocationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding bodystructurelocationcoding = bodystructurelocation.getCodingFirstRep();

		/******************** BodyStrctr_Lctn_Cdg_Vrsn ********************************************************************************/
		if(bodystructurelocationcoding.hasVersion()) {
			b.setBodyStrctrLctnCdgVrsn(String.valueOf(bodystructurelocationcoding.getVersion()));
		}
		/******************** BodyStrctr_Lctn_Cdg_Dsply ********************************************************************************/
		if(bodystructurelocationcoding.hasDisplay()) {
			b.setBodyStrctrLctnCdgDsply(String.valueOf(bodystructurelocationcoding.getDisplay()));
		}
		/******************** BodyStrctr_Lctn_Cdg_Cd ********************************************************************************/
		if(bodystructurelocationcoding.hasCode()) {
			b.setBodyStrctrLctnCdgCd(String.valueOf(bodystructurelocationcoding.getCode()));
		}
		/******************** BodyStrctr_Lctn_Cdg_UsrSltd ********************************************************************************/
		if(bodystructurelocationcoding.hasUserSelected()) {
			b.setBodyStrctrLctnCdgUsrSltd(String.valueOf(bodystructurelocationcoding.getUserSelected()));
		}
		/******************** BodyStrctr_Lctn_Cdg_Sys ********************************************************************************/
		if(bodystructurelocationcoding.hasSystem()) {
			b.setBodyStrctrLctnCdgSys(String.valueOf(bodystructurelocationcoding.getSystem()));
		}
		/******************** BodyStrctr_Pnt ********************************************************************************/
		if(bodystructure.hasPatient()) {
			b.setBodyStrctrPnt(String.valueOf(bodystructure.getPatient()));
		}
		/******************** BodyStrctr_Dscrptn ********************************************************************************/
		if(bodystructure.hasDescription()) {
			b.setBodyStrctrDscrptn(String.valueOf(bodystructure.getDescription()));
		}
		/******************** bodystructurelocationqualifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept bodystructurelocationqualifier = bodystructure.getLocationQualifierFirstRep();

		/******************** BodyStrctr_LctnQualifier_Txt ********************************************************************************/
		if(bodystructurelocationqualifier.hasText()) {
			b.setBodyStrctrLctnQualifierTxt(String.valueOf(bodystructurelocationqualifier.getText()));
		}
		/******************** bodystructurelocationqualifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding bodystructurelocationqualifiercoding = bodystructurelocationqualifier.getCodingFirstRep();

		/******************** BodyStrctr_LctnQualifier_Cdg_Vrsn ********************************************************************************/
		if(bodystructurelocationqualifiercoding.hasVersion()) {
			b.setBodyStrctrLctnQualifierCdgVrsn(String.valueOf(bodystructurelocationqualifiercoding.getVersion()));
		}
		/******************** BodyStrctr_LctnQualifier_Cdg_Dsply ********************************************************************************/
		if(bodystructurelocationqualifiercoding.hasDisplay()) {
			b.setBodyStrctrLctnQualifierCdgDsply(String.valueOf(bodystructurelocationqualifiercoding.getDisplay()));
		}
		/******************** BodyStrctr_LctnQualifier_Cdg_Cd ********************************************************************************/
		if(bodystructurelocationqualifiercoding.hasCode()) {
			b.setBodyStrctrLctnQualifierCdgCd(String.valueOf(bodystructurelocationqualifiercoding.getCode()));
		}
		/******************** BodyStrctr_LctnQualifier_Cdg_UsrSltd ********************************************************************************/
		if(bodystructurelocationqualifiercoding.hasUserSelected()) {
			b.setBodyStrctrLctnQualifierCdgUsrSltd(String.valueOf(bodystructurelocationqualifiercoding.getUserSelected()));
		}
		/******************** BodyStrctr_LctnQualifier_Cdg_Sys ********************************************************************************/
		if(bodystructurelocationqualifiercoding.hasSystem()) {
			b.setBodyStrctrLctnQualifierCdgSys(String.valueOf(bodystructurelocationqualifiercoding.getSystem()));
		}
		/******************** bodystructuremorphology ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept bodystructuremorphology = bodystructure.getMorphology();

		/******************** BodyStrctr_Morphology_Txt ********************************************************************************/
		if(bodystructuremorphology.hasText()) {
			b.setBodyStrctrMorphologyTxt(String.valueOf(bodystructuremorphology.getText()));
		}
		/******************** bodystructuremorphologycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding bodystructuremorphologycoding = bodystructuremorphology.getCodingFirstRep();

		/******************** BodyStrctr_Morphology_Cdg_Vrsn ********************************************************************************/
		if(bodystructuremorphologycoding.hasVersion()) {
			b.setBodyStrctrMorphologyCdgVrsn(String.valueOf(bodystructuremorphologycoding.getVersion()));
		}
		/******************** BodyStrctr_Morphology_Cdg_Dsply ********************************************************************************/
		if(bodystructuremorphologycoding.hasDisplay()) {
			b.setBodyStrctrMorphologyCdgDsply(String.valueOf(bodystructuremorphologycoding.getDisplay()));
		}
		/******************** BodyStrctr_Morphology_Cdg_Cd ********************************************************************************/
		if(bodystructuremorphologycoding.hasCode()) {
			b.setBodyStrctrMorphologyCdgCd(String.valueOf(bodystructuremorphologycoding.getCode()));
		}
		/******************** BodyStrctr_Morphology_Cdg_UsrSltd ********************************************************************************/
		if(bodystructuremorphologycoding.hasUserSelected()) {
			b.setBodyStrctrMorphologyCdgUsrSltd(String.valueOf(bodystructuremorphologycoding.getUserSelected()));
		}
		/******************** BodyStrctr_Morphology_Cdg_Sys ********************************************************************************/
		if(bodystructuremorphologycoding.hasSystem()) {
			b.setBodyStrctrMorphologyCdgSys(String.valueOf(bodystructuremorphologycoding.getSystem()));
		}
		/******************** bodystructureimage ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment bodystructureimage = bodystructure.getImageFirstRep();

		/******************** BodyStrctr_Image_Sz ********************************************************************************/
		if(bodystructureimage.hasSize()) {
			b.setBodyStrctrImageSz(String.valueOf(bodystructureimage.getSize()));
		}
		/******************** BodyStrctr_Image_Lnguage ********************************************************************************/
		if(bodystructureimage.hasLanguage()) {
			b.setBodyStrctrImageLnguage(String.valueOf(bodystructureimage.getLanguage()));
		}
		/******************** BodyStrctr_Image_CntntTyp ********************************************************************************/
		if(bodystructureimage.hasContentType()) {
			b.setBodyStrctrImageCntntTyp(String.valueOf(bodystructureimage.getContentType()));
		}
		/******************** BodyStrctr_Image_Ttl ********************************************************************************/
		if(bodystructureimage.hasTitle()) {
			b.setBodyStrctrImageTtl(String.valueOf(bodystructureimage.getTitle()));
		}
		/******************** BodyStrctr_Image_Url ********************************************************************************/
		if(bodystructureimage.hasUrl()) {
			b.setBodyStrctrImageUrl(String.valueOf(bodystructureimage.getUrl()));
		}
		/******************** BodyStrctr_Image_Data ********************************************************************************/
		if(bodystructureimage.hasData()) {
			b.setBodyStrctrImageData(String.valueOf(bodystructureimage.getData()));
		}

		/******************** BodyStrctr_Image_Hash ********************************************************************************/
		if(bodystructureimage.hasHash()) {
			b.setBodyStrctrImageHash(String.valueOf(bodystructureimage.getHash()));
		}

		/******************** BodyStrctr_Image_Creation ********************************************************************************/
		if(bodystructureimage.hasCreation()) {
			b.setBodyStrctrImageCreation(String.valueOf(bodystructureimage.getCreation()));
		}
		/******************** BodyStrctr_Active ********************************************************************************/
		if(bodystructure.hasActive()) {
			b.setBodyStrctrActive(String.valueOf(bodystructure.getActive()));
		}
		/******************** bodystructureidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier bodystructureidentifier = bodystructure.getIdentifierFirstRep();

		/******************** BodyStrctr_Id_Vl ********************************************************************************/
		if(bodystructureidentifier.hasValue()) {
			b.setBodyStrctrIdVl(String.valueOf(bodystructureidentifier.getValue()));
		}
		/******************** bodystructureidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept bodystructureidentifiertype = bodystructureidentifier.getType();

		/******************** BodyStrctr_Id_Typ_Txt ********************************************************************************/
		if(bodystructureidentifiertype.hasText()) {
			b.setBodyStrctrIdTypTxt(String.valueOf(bodystructureidentifiertype.getText()));
		}
		/******************** bodystructureidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding bodystructureidentifiertypecoding = bodystructureidentifiertype.getCodingFirstRep();

		/******************** BodyStrctr_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(bodystructureidentifiertypecoding.hasVersion()) {
			b.setBodyStrctrIdTypCdgVrsn(String.valueOf(bodystructureidentifiertypecoding.getVersion()));
		}
		/******************** BodyStrctr_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(bodystructureidentifiertypecoding.hasDisplay()) {
			b.setBodyStrctrIdTypCdgDsply(String.valueOf(bodystructureidentifiertypecoding.getDisplay()));
		}
		/******************** BodyStrctr_Id_Typ_Cdg_Cd ********************************************************************************/
		if(bodystructureidentifiertypecoding.hasCode()) {
			b.setBodyStrctrIdTypCdgCd(String.valueOf(bodystructureidentifiertypecoding.getCode()));
		}
		/******************** BodyStrctr_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(bodystructureidentifiertypecoding.hasUserSelected()) {
			b.setBodyStrctrIdTypCdgUsrSltd(String.valueOf(bodystructureidentifiertypecoding.getUserSelected()));
		}
		/******************** BodyStrctr_Id_Typ_Cdg_Sys ********************************************************************************/
		if(bodystructureidentifiertypecoding.hasSystem()) {
			b.setBodyStrctrIdTypCdgSys(String.valueOf(bodystructureidentifiertypecoding.getSystem()));
		}
		/******************** bodystructureidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period bodystructureidentifierperiod = bodystructureidentifier.getPeriod();

		/******************** BodyStrctr_Id_Prd_Strt ********************************************************************************/
		if(bodystructureidentifierperiod.hasStart()) {
			b.setBodyStrctrIdPrdStrt(String.valueOf(bodystructureidentifierperiod.getStart()));
		}
		/******************** BodyStrctr_Id_Prd_End ********************************************************************************/
		if(bodystructureidentifierperiod.hasEnd()) {
			b.setBodyStrctrIdPrdEnd(String.valueOf(bodystructureidentifierperiod.getEnd()));
		}
		/******************** BodyStrctr_Id_Assigner ********************************************************************************/
		if(bodystructureidentifier.hasAssigner()) {
			b.setBodyStrctrIdAssigner(String.valueOf(bodystructureidentifier.getAssigner()));
		}
		/******************** BodyStrctr_Id_Sys ********************************************************************************/
		if(bodystructureidentifier.hasSystem()) {
			b.setBodyStrctrIdSys(String.valueOf(bodystructureidentifier.getSystem()));
		}
		/******************** bodystructureidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse bodystructureidentifieruse = bodystructureidentifier.getUse();
		b.setBodyStrctrIdUse(bodystructureidentifieruse.toCode());

		return b;
	}
}
