package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.BodyStructure;
public class BodyStructureConversion 
{
	public org.hl7.fhir.r4.model.BodyStructure BodyStructures(BodyStructure b) throws ParseException
	{
		org.hl7.fhir.r4.model.BodyStructure bodystructure = new org.hl7.fhir.r4.model.BodyStructure();

		/******************** id ********************************************************************************/
		bodystructure.setId(b.getId());

		/******************** BodyStrctr_Active ********************************************************************************/
		if(b.getBodyStrctrActive() != null) {
			bodystructure.setActive(Boolean.parseBoolean(b.getBodyStrctrActive()));
		}
		/******************** BodyStrctr_Dscrptn ********************************************************************************/
		if(b.getBodyStrctrDscrptn() != null) {
			bodystructure.setDescription(b.getBodyStrctrDscrptn());
		}
		/******************** bodystructureidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier bodystructureidentifier =  new org.hl7.fhir.r4.model.Identifier();
		bodystructure.addIdentifier(bodystructureidentifier);

		/******************** BodyStrctr_Id_Assigner ********************************************************************************/
		if(b.getBodyStrctrIdAssigner() != null) {
			bodystructureidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(b.getBodyStrctrIdAssigner()));
		}
		/******************** bodystructureidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period bodystructureidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		bodystructureidentifier.setPeriod(bodystructureidentifierperiod);

		/******************** BodyStrctr_Id_Prd_End ********************************************************************************/
		if(b.getBodyStrctrIdPrdEnd() != null) {
			java.text.SimpleDateFormat BodyStrctr_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date BodyStrctr_Id_Prd_Enddate = BodyStrctr_Id_Prd_Endsdf.parse(b.getBodyStrctrIdPrdEnd());
			bodystructureidentifierperiod.setEnd(BodyStrctr_Id_Prd_Enddate);
		}
		/******************** BodyStrctr_Id_Prd_Strt ********************************************************************************/
		if(b.getBodyStrctrIdPrdStrt() != null) {
			java.text.SimpleDateFormat BodyStrctr_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date BodyStrctr_Id_Prd_Strtdate = BodyStrctr_Id_Prd_Strtsdf.parse(b.getBodyStrctrIdPrdStrt());
			bodystructureidentifierperiod.setStart(BodyStrctr_Id_Prd_Strtdate);
		}
		/******************** BodyStrctr_Id_Sys ********************************************************************************/
		if(b.getBodyStrctrIdSys() != null) {
			bodystructureidentifier.setSystem(b.getBodyStrctrIdSys());
		}
		/******************** bodystructureidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept bodystructureidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		bodystructureidentifier.setType(bodystructureidentifiertype);

		/******************** bodystructureidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding bodystructureidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		bodystructureidentifiertype.addCoding(bodystructureidentifiertypecoding);

		/******************** BodyStrctr_Id_Typ_Cdg_Cd ********************************************************************************/
		if(b.getBodyStrctrIdTypCdgCd() != null) {
			bodystructureidentifiertypecoding.setCode(b.getBodyStrctrIdTypCdgCd());
		}
		/******************** BodyStrctr_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(b.getBodyStrctrIdTypCdgDsply() != null) {
			bodystructureidentifiertypecoding.setDisplay(b.getBodyStrctrIdTypCdgDsply());
		}
		/******************** BodyStrctr_Id_Typ_Cdg_Sys ********************************************************************************/
		if(b.getBodyStrctrIdTypCdgSys() != null) {
			bodystructureidentifiertypecoding.setSystem(b.getBodyStrctrIdTypCdgSys());
		}
		/******************** BodyStrctr_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(b.getBodyStrctrIdTypCdgUsrSltd() != null) {
			bodystructureidentifiertypecoding.setUserSelected(Boolean.parseBoolean(b.getBodyStrctrIdTypCdgUsrSltd()));
		}
		/******************** BodyStrctr_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(b.getBodyStrctrIdTypCdgVrsn() != null) {
			bodystructureidentifiertypecoding.setVersion(b.getBodyStrctrIdTypCdgVrsn());
		}
		/******************** BodyStrctr_Id_Typ_Txt ********************************************************************************/
		if(b.getBodyStrctrIdTypTxt() != null) {
			bodystructureidentifiertype.setText(b.getBodyStrctrIdTypTxt());
		}
		/******************** bodystructureidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory bodystructureidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		bodystructureidentifier.setUse(bodystructureidentifieruse.fromCode(b.getBodyStrctrIdUse()));

		/******************** BodyStrctr_Id_Vl ********************************************************************************/
		if(b.getBodyStrctrIdVl() != null) {
			bodystructureidentifier.setValue(b.getBodyStrctrIdVl());
		}
		/******************** bodystructureimage ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment bodystructureimage =  new org.hl7.fhir.r4.model.Attachment();
		bodystructure.addImage(bodystructureimage);

		/******************** BodyStrctr_Image_CntntTyp ********************************************************************************/
		if(b.getBodyStrctrImageCntntTyp() != null) {
			bodystructureimage.setContentType(b.getBodyStrctrImageCntntTyp());
		}
		/******************** BodyStrctr_Image_Creation ********************************************************************************/
		if(b.getBodyStrctrImageCreation() != null) {
			java.text.SimpleDateFormat BodyStrctr_Image_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date BodyStrctr_Image_Creationdate = BodyStrctr_Image_Creationsdf.parse(b.getBodyStrctrImageCreation());
			bodystructureimage.setCreation(BodyStrctr_Image_Creationdate);
		}
		/******************** BodyStrctr_Image_Data ********************************************************************************/
		if(b.getBodyStrctrImageData() != null) {
			bodystructureimage.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(b.getBodyStrctrImageData()));
		}
		/******************** BodyStrctr_Image_Hash ********************************************************************************/
		if(b.getBodyStrctrImageHash() != null) {
			bodystructureimage.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(b.getBodyStrctrImageHash()));
		}
		/******************** BodyStrctr_Image_Lnguage ********************************************************************************/
		if(b.getBodyStrctrImageLnguage() != null) {
			bodystructureimage.setLanguage(b.getBodyStrctrImageLnguage());
		}
		/******************** BodyStrctr_Image_Sz ********************************************************************************/
		if(b.getBodyStrctrImageSz() != null) {
			bodystructureimage.setSize(Integer.parseInt(b.getBodyStrctrImageSz()));
		}
		/******************** BodyStrctr_Image_Ttl ********************************************************************************/
		if(b.getBodyStrctrImageTtl() != null) {
			bodystructureimage.setTitle(b.getBodyStrctrImageTtl());
		}
		/******************** BodyStrctr_Image_Url ********************************************************************************/
		if(b.getBodyStrctrImageUrl() != null) {
			bodystructureimage.setUrl(b.getBodyStrctrImageUrl());
		}
		/******************** bodystructurelocation ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept bodystructurelocation =  new org.hl7.fhir.r4.model.CodeableConcept();
		bodystructure.setLocation(bodystructurelocation);

		/******************** bodystructurelocationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding bodystructurelocationcoding =  new org.hl7.fhir.r4.model.Coding();
		bodystructurelocation.addCoding(bodystructurelocationcoding);

		/******************** BodyStrctr_Lctn_Cdg_Cd ********************************************************************************/
		if(b.getBodyStrctrLctnCdgCd() != null) {
			bodystructurelocationcoding.setCode(b.getBodyStrctrLctnCdgCd());
		}
		/******************** BodyStrctr_Lctn_Cdg_Dsply ********************************************************************************/
		if(b.getBodyStrctrLctnCdgDsply() != null) {
			bodystructurelocationcoding.setDisplay(b.getBodyStrctrLctnCdgDsply());
		}
		/******************** BodyStrctr_Lctn_Cdg_Sys ********************************************************************************/
		if(b.getBodyStrctrLctnCdgSys() != null) {
			bodystructurelocationcoding.setSystem(b.getBodyStrctrLctnCdgSys());
		}
		/******************** BodyStrctr_Lctn_Cdg_UsrSltd ********************************************************************************/
		if(b.getBodyStrctrLctnCdgUsrSltd() != null) {
			bodystructurelocationcoding.setUserSelected(Boolean.parseBoolean(b.getBodyStrctrLctnCdgUsrSltd()));
		}
		/******************** BodyStrctr_Lctn_Cdg_Vrsn ********************************************************************************/
		if(b.getBodyStrctrLctnCdgVrsn() != null) {
			bodystructurelocationcoding.setVersion(b.getBodyStrctrLctnCdgVrsn());
		}
		/******************** BodyStrctr_Lctn_Txt ********************************************************************************/
		if(b.getBodyStrctrLctnTxt() != null) {
			bodystructurelocation.setText(b.getBodyStrctrLctnTxt());
		}
		/******************** bodystructurelocationqualifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept bodystructurelocationqualifier =  new org.hl7.fhir.r4.model.CodeableConcept();
		bodystructure.addLocationQualifier(bodystructurelocationqualifier);

		/******************** bodystructurelocationqualifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding bodystructurelocationqualifiercoding =  new org.hl7.fhir.r4.model.Coding();
		bodystructurelocationqualifier.addCoding(bodystructurelocationqualifiercoding);

		/******************** BodyStrctr_LctnQualifier_Cdg_Cd ********************************************************************************/
		if(b.getBodyStrctrLctnQualifierCdgCd() != null) {
			bodystructurelocationqualifiercoding.setCode(b.getBodyStrctrLctnQualifierCdgCd());
		}
		/******************** BodyStrctr_LctnQualifier_Cdg_Dsply ********************************************************************************/
		if(b.getBodyStrctrLctnQualifierCdgDsply() != null) {
			bodystructurelocationqualifiercoding.setDisplay(b.getBodyStrctrLctnQualifierCdgDsply());
		}
		/******************** BodyStrctr_LctnQualifier_Cdg_Sys ********************************************************************************/
		if(b.getBodyStrctrLctnQualifierCdgSys() != null) {
			bodystructurelocationqualifiercoding.setSystem(b.getBodyStrctrLctnQualifierCdgSys());
		}
		/******************** BodyStrctr_LctnQualifier_Cdg_UsrSltd ********************************************************************************/
		if(b.getBodyStrctrLctnQualifierCdgUsrSltd() != null) {
			bodystructurelocationqualifiercoding.setUserSelected(Boolean.parseBoolean(b.getBodyStrctrLctnQualifierCdgUsrSltd()));
		}
		/******************** BodyStrctr_LctnQualifier_Cdg_Vrsn ********************************************************************************/
		if(b.getBodyStrctrLctnQualifierCdgVrsn() != null) {
			bodystructurelocationqualifiercoding.setVersion(b.getBodyStrctrLctnQualifierCdgVrsn());
		}
		/******************** BodyStrctr_LctnQualifier_Txt ********************************************************************************/
		if(b.getBodyStrctrLctnQualifierTxt() != null) {
			bodystructurelocationqualifier.setText(b.getBodyStrctrLctnQualifierTxt());
		}
		/******************** bodystructuremorphology ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept bodystructuremorphology =  new org.hl7.fhir.r4.model.CodeableConcept();
		bodystructure.setMorphology(bodystructuremorphology);

		/******************** bodystructuremorphologycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding bodystructuremorphologycoding =  new org.hl7.fhir.r4.model.Coding();
		bodystructuremorphology.addCoding(bodystructuremorphologycoding);

		/******************** BodyStrctr_Morphology_Cdg_Cd ********************************************************************************/
		if(b.getBodyStrctrMorphologyCdgCd() != null) {
			bodystructuremorphologycoding.setCode(b.getBodyStrctrMorphologyCdgCd());
		}
		/******************** BodyStrctr_Morphology_Cdg_Dsply ********************************************************************************/
		if(b.getBodyStrctrMorphologyCdgDsply() != null) {
			bodystructuremorphologycoding.setDisplay(b.getBodyStrctrMorphologyCdgDsply());
		}
		/******************** BodyStrctr_Morphology_Cdg_Sys ********************************************************************************/
		if(b.getBodyStrctrMorphologyCdgSys() != null) {
			bodystructuremorphologycoding.setSystem(b.getBodyStrctrMorphologyCdgSys());
		}
		/******************** BodyStrctr_Morphology_Cdg_UsrSltd ********************************************************************************/
		if(b.getBodyStrctrMorphologyCdgUsrSltd() != null) {
			bodystructuremorphologycoding.setUserSelected(Boolean.parseBoolean(b.getBodyStrctrMorphologyCdgUsrSltd()));
		}
		/******************** BodyStrctr_Morphology_Cdg_Vrsn ********************************************************************************/
		if(b.getBodyStrctrMorphologyCdgVrsn() != null) {
			bodystructuremorphologycoding.setVersion(b.getBodyStrctrMorphologyCdgVrsn());
		}
		/******************** BodyStrctr_Morphology_Txt ********************************************************************************/
		if(b.getBodyStrctrMorphologyTxt() != null) {
			bodystructuremorphology.setText(b.getBodyStrctrMorphologyTxt());
		}
		/******************** BodyStrctr_Pnt ********************************************************************************/
		if(b.getBodyStrctrPnt() != null) {
			bodystructure.setPatient( new org.hl7.fhir.r4.model.Reference(b.getBodyStrctrPnt()));
		}
		return bodystructure;
	}
}
