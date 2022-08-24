package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.VisionPrescription;
public class VisionPrescriptionBidirectionalConversion 
{
	public VisionPrescription VisionPrescriptions(org.hl7.fhir.r4.model.VisionPrescription visionprescription) throws ParseException
	{
		 main.java.com.campfhir.model.VisionPrescription v = new  main.java.com.campfhir.model.VisionPrescription();

		/******************** id ********************************************************************************/
		v.setId(visionprescription.getIdElement().getIdPart());

		/******************** visionprescriptionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.VisionPrescription.VisionStatus visionprescriptionstatus = visionprescription.getStatus();
		if(visionprescriptionstatus!=null) {
			v.addVisionPrescriptionSts(visionprescriptionstatus.toCode());
		} else {
			v.addVisionPrescriptionSts("NULL");
		}

		/******************** VisionPrescription_Enc ********************************************************************************/
		if(visionprescription.hasEncounter()) {

			if(visionprescription.getEncounter().getReference() != null) {
			v.addVisionPrescriptionEnc(visionprescription.getEncounter().getReference());
			}
		} else {
			v.addVisionPrescriptionEnc("NULL");
		}


		/******************** VisionPrescription_Created ********************************************************************************/
		if(visionprescription.hasCreated()) {

			v.addVisionPrescriptionCreated("\""+ca.uhn.fhir.util.DateUtils.formatDate(visionprescription.getCreated())+"\"");
		} else {
			v.addVisionPrescriptionCreated("NULL");
		}


		/******************** visionprescriptionidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> visionprescriptionidentifierlist = visionprescription.getIdentifier();
		for(int visionprescriptionidentifieri = 0; visionprescriptionidentifieri<visionprescriptionidentifierlist.size();visionprescriptionidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  visionprescriptionidentifier = visionprescriptionidentifierlist.get(visionprescriptionidentifieri);

		/******************** VisionPrescription_Id_Vl ********************************************************************************/
		if(visionprescriptionidentifieri == 0) {v.addVisionPrescriptionIdVl("[");}
		if(visionprescriptionidentifier.hasValue()) {

			v.addVisionPrescriptionIdVl(String.valueOf(visionprescriptionidentifier.getValue()));
		} else {
			v.addVisionPrescriptionIdVl("NULL");
		}

		if(visionprescriptionidentifieri == visionprescriptionidentifierlist.size()-1) {v.addVisionPrescriptionIdVl("]");}


		/******************** visionprescriptionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept visionprescriptionidentifiertype = visionprescriptionidentifier.getType();

		/******************** VisionPrescription_Id_Typ_Txt ********************************************************************************/
		if(visionprescriptionidentifieri == 0) {v.addVisionPrescriptionIdTypTxt("[");}
		if(visionprescriptionidentifiertype.hasText()) {

			v.addVisionPrescriptionIdTypTxt(String.valueOf(visionprescriptionidentifiertype.getText()));
		} else {
			v.addVisionPrescriptionIdTypTxt("NULL");
		}

		if(visionprescriptionidentifieri == visionprescriptionidentifierlist.size()-1) {v.addVisionPrescriptionIdTypTxt("]");}


		/******************** visionprescriptionidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> visionprescriptionidentifiertypecodinglist = visionprescriptionidentifiertype.getCoding();
		for(int visionprescriptionidentifiertypecodingi = 0; visionprescriptionidentifiertypecodingi<visionprescriptionidentifiertypecodinglist.size();visionprescriptionidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  visionprescriptionidentifiertypecoding = visionprescriptionidentifiertypecodinglist.get(visionprescriptionidentifiertypecodingi);

		/******************** VisionPrescription_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(visionprescriptionidentifiertypecodingi == 0) {v.addVisionPrescriptionIdTypCdgDsply("[[");}
		if(visionprescriptionidentifiertypecoding.hasDisplay()) {

			v.addVisionPrescriptionIdTypCdgDsply(String.valueOf(visionprescriptionidentifiertypecoding.getDisplay()));
		} else {
			v.addVisionPrescriptionIdTypCdgDsply("NULL");
		}

		if(visionprescriptionidentifiertypecodingi == visionprescriptionidentifiertypecodinglist.size()-1) {v.addVisionPrescriptionIdTypCdgDsply("]]");}


		/******************** VisionPrescription_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(visionprescriptionidentifiertypecodingi == 0) {v.addVisionPrescriptionIdTypCdgVrsn("[[");}
		if(visionprescriptionidentifiertypecoding.hasVersion()) {

			v.addVisionPrescriptionIdTypCdgVrsn(String.valueOf(visionprescriptionidentifiertypecoding.getVersion()));
		} else {
			v.addVisionPrescriptionIdTypCdgVrsn("NULL");
		}

		if(visionprescriptionidentifiertypecodingi == visionprescriptionidentifiertypecodinglist.size()-1) {v.addVisionPrescriptionIdTypCdgVrsn("]]");}


		/******************** VisionPrescription_Id_Typ_Cdg_Cd ********************************************************************************/
		if(visionprescriptionidentifiertypecodingi == 0) {v.addVisionPrescriptionIdTypCdgCd("[[");}
		if(visionprescriptionidentifiertypecoding.hasCode()) {

			v.addVisionPrescriptionIdTypCdgCd(String.valueOf(visionprescriptionidentifiertypecoding.getCode()));
		} else {
			v.addVisionPrescriptionIdTypCdgCd("NULL");
		}

		if(visionprescriptionidentifiertypecodingi == visionprescriptionidentifiertypecodinglist.size()-1) {v.addVisionPrescriptionIdTypCdgCd("]]");}


		/******************** VisionPrescription_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(visionprescriptionidentifiertypecodingi == 0) {v.addVisionPrescriptionIdTypCdgUsrSltd("[[");}
		if(visionprescriptionidentifiertypecoding.hasUserSelected()) {

			v.addVisionPrescriptionIdTypCdgUsrSltd(String.valueOf(visionprescriptionidentifiertypecoding.getUserSelected()));
		} else {
			v.addVisionPrescriptionIdTypCdgUsrSltd("NULL");
		}

		if(visionprescriptionidentifiertypecodingi == visionprescriptionidentifiertypecodinglist.size()-1) {v.addVisionPrescriptionIdTypCdgUsrSltd("]]");}


		/******************** VisionPrescription_Id_Typ_Cdg_Sys ********************************************************************************/
		if(visionprescriptionidentifiertypecodingi == 0) {v.addVisionPrescriptionIdTypCdgSys("[[");}
		if(visionprescriptionidentifiertypecoding.hasSystem()) {

			v.addVisionPrescriptionIdTypCdgSys(String.valueOf(visionprescriptionidentifiertypecoding.getSystem()));
		} else {
			v.addVisionPrescriptionIdTypCdgSys("NULL");
		}

		if(visionprescriptionidentifiertypecodingi == visionprescriptionidentifiertypecodinglist.size()-1) {v.addVisionPrescriptionIdTypCdgSys("]]");}


		 };
		/******************** visionprescriptionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period visionprescriptionidentifierperiod = visionprescriptionidentifier.getPeriod();

		/******************** VisionPrescription_Id_Prd_Strt ********************************************************************************/
		if(visionprescriptionidentifieri == 0) {v.addVisionPrescriptionIdPrdStrt("[");}
		if(visionprescriptionidentifierperiod.hasStart()) {

			v.addVisionPrescriptionIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(visionprescriptionidentifierperiod.getStart())+"\"");
		} else {
			v.addVisionPrescriptionIdPrdStrt("NULL");
		}

		if(visionprescriptionidentifieri == visionprescriptionidentifierlist.size()-1) {v.addVisionPrescriptionIdPrdStrt("]");}


		/******************** VisionPrescription_Id_Prd_End ********************************************************************************/
		if(visionprescriptionidentifieri == 0) {v.addVisionPrescriptionIdPrdEnd("[");}
		if(visionprescriptionidentifierperiod.hasEnd()) {

			v.addVisionPrescriptionIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(visionprescriptionidentifierperiod.getEnd())+"\"");
		} else {
			v.addVisionPrescriptionIdPrdEnd("NULL");
		}

		if(visionprescriptionidentifieri == visionprescriptionidentifierlist.size()-1) {v.addVisionPrescriptionIdPrdEnd("]");}


		/******************** visionprescriptionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse visionprescriptionidentifieruse = visionprescriptionidentifier.getUse();
		if(visionprescriptionidentifieruse!=null) {
		if(visionprescriptionidentifieri == 0) {

		v.addVisionPrescriptionIdUse("[");		}
			v.addVisionPrescriptionIdUse(visionprescriptionidentifieruse.toCode());
		if(visionprescriptionidentifieri == visionprescriptionidentifierlist.size()-1) {

		v.addVisionPrescriptionIdUse("]");		}

		} else {
			v.addVisionPrescriptionIdUse("NULL");
		}

		/******************** VisionPrescription_Id_Assigner ********************************************************************************/
		if(visionprescriptionidentifieri == 0) {v.addVisionPrescriptionIdAssigner("[");}
		if(visionprescriptionidentifier.hasAssigner()) {

			if(visionprescriptionidentifier.getAssigner().getReference() != null) {
			v.addVisionPrescriptionIdAssigner(visionprescriptionidentifier.getAssigner().getReference());
			}
		} else {
			v.addVisionPrescriptionIdAssigner("NULL");
		}

		if(visionprescriptionidentifieri == visionprescriptionidentifierlist.size()-1) {v.addVisionPrescriptionIdAssigner("]");}


		/******************** VisionPrescription_Id_Sys ********************************************************************************/
		if(visionprescriptionidentifieri == 0) {v.addVisionPrescriptionIdSys("[");}
		if(visionprescriptionidentifier.hasSystem()) {

			v.addVisionPrescriptionIdSys(String.valueOf(visionprescriptionidentifier.getSystem()));
		} else {
			v.addVisionPrescriptionIdSys("NULL");
		}

		if(visionprescriptionidentifieri == visionprescriptionidentifierlist.size()-1) {v.addVisionPrescriptionIdSys("]");}


		 };
		/******************** VisionPrescription_Prescriber ********************************************************************************/
		if(visionprescription.hasPrescriber()) {

			if(visionprescription.getPrescriber().getReference() != null) {
			v.addVisionPrescriptionPrescriber(visionprescription.getPrescriber().getReference());
			}
		} else {
			v.addVisionPrescriptionPrescriber("NULL");
		}


		/******************** VisionPrescription_DtWritten ********************************************************************************/
		if(visionprescription.hasDateWritten()) {

			v.addVisionPrescriptionDtWritten("\""+ca.uhn.fhir.util.DateUtils.formatDate(visionprescription.getDateWritten())+"\"");
		} else {
			v.addVisionPrescriptionDtWritten("NULL");
		}


		/******************** visionprescriptionlensspecification ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.VisionPrescription.VisionPrescriptionLensSpecificationComponent> visionprescriptionlensspecificationlist = visionprescription.getLensSpecification();
		for(int visionprescriptionlensspecificationi = 0; visionprescriptionlensspecificationi<visionprescriptionlensspecificationlist.size();visionprescriptionlensspecificationi++ ) {
		org.hl7.fhir.r4.model.VisionPrescription.VisionPrescriptionLensSpecificationComponent  visionprescriptionlensspecification = visionprescriptionlensspecificationlist.get(visionprescriptionlensspecificationi);

		/******************** visionprescriptionlensspecificationnote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> visionprescriptionlensspecificationnotelist = visionprescriptionlensspecification.getNote();
		for(int visionprescriptionlensspecificationnotei = 0; visionprescriptionlensspecificationnotei<visionprescriptionlensspecificationnotelist.size();visionprescriptionlensspecificationnotei++ ) {
		org.hl7.fhir.r4.model.Annotation  visionprescriptionlensspecificationnote = visionprescriptionlensspecificationnotelist.get(visionprescriptionlensspecificationnotei);

		/******************** VisionPrescription_LensSpcfctn_Nt_Time ********************************************************************************/
		if(visionprescriptionlensspecificationnotei == 0) {v.addVisionPrescriptionLensSpcfctnNtTime("[[");}
		if(visionprescriptionlensspecificationnote.hasTime()) {

			v.addVisionPrescriptionLensSpcfctnNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(visionprescriptionlensspecificationnote.getTime())+"\"");
		} else {
			v.addVisionPrescriptionLensSpcfctnNtTime("NULL");
		}

		if(visionprescriptionlensspecificationnotei == visionprescriptionlensspecificationnotelist.size()-1) {v.addVisionPrescriptionLensSpcfctnNtTime("]]");}


		/******************** VisionPrescription_LensSpcfctn_Nt_AthrRfrnc ********************************************************************************/
		if(visionprescriptionlensspecificationnotei == 0) {v.addVisionPrescriptionLensSpcfctnNtAthrRfrnc("[[");}
		if(visionprescriptionlensspecificationnote.hasAuthorReference()) {

			if(visionprescriptionlensspecificationnote.getAuthorReference().getReference() != null) {
			v.addVisionPrescriptionLensSpcfctnNtAthrRfrnc(visionprescriptionlensspecificationnote.getAuthorReference().getReference());
			}
		} else {
			v.addVisionPrescriptionLensSpcfctnNtAthrRfrnc("NULL");
		}

		if(visionprescriptionlensspecificationnotei == visionprescriptionlensspecificationnotelist.size()-1) {v.addVisionPrescriptionLensSpcfctnNtAthrRfrnc("]]");}


		/******************** VisionPrescription_LensSpcfctn_Nt_Txt ********************************************************************************/
		if(visionprescriptionlensspecificationnotei == 0) {v.addVisionPrescriptionLensSpcfctnNtTxt("[[");}
		if(visionprescriptionlensspecificationnote.hasText()) {

			v.addVisionPrescriptionLensSpcfctnNtTxt(String.valueOf(visionprescriptionlensspecificationnote.getText()));
		} else {
			v.addVisionPrescriptionLensSpcfctnNtTxt("NULL");
		}

		if(visionprescriptionlensspecificationnotei == visionprescriptionlensspecificationnotelist.size()-1) {v.addVisionPrescriptionLensSpcfctnNtTxt("]]");}


		/******************** VisionPrescription_LensSpcfctn_Nt_AthrStrgTyp ********************************************************************************/
		if(visionprescriptionlensspecificationnotei == 0) {v.addVisionPrescriptionLensSpcfctnNtAthrStrgTyp("[[");}
		if(visionprescriptionlensspecificationnote.hasAuthorStringType()) {

			v.addVisionPrescriptionLensSpcfctnNtAthrStrgTyp("\""+visionprescriptionlensspecificationnote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			v.addVisionPrescriptionLensSpcfctnNtAthrStrgTyp("NULL");
		}

		if(visionprescriptionlensspecificationnotei == visionprescriptionlensspecificationnotelist.size()-1) {v.addVisionPrescriptionLensSpcfctnNtAthrStrgTyp("]]");}


		 };
		/******************** visionprescriptionlensspecificationproduct ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept visionprescriptionlensspecificationproduct = visionprescriptionlensspecification.getProduct();

		/******************** VisionPrescription_LensSpcfctn_Prdct_Txt ********************************************************************************/
		if(visionprescriptionlensspecificationproduct.hasText()) {

			v.addVisionPrescriptionLensSpcfctnPrdctTxt(String.valueOf(visionprescriptionlensspecificationproduct.getText()));
		} else {
			v.addVisionPrescriptionLensSpcfctnPrdctTxt("NULL");
		}


		/******************** visionprescriptionlensspecificationproductcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> visionprescriptionlensspecificationproductcodinglist = visionprescriptionlensspecificationproduct.getCoding();
		for(int visionprescriptionlensspecificationproductcodingi = 0; visionprescriptionlensspecificationproductcodingi<visionprescriptionlensspecificationproductcodinglist.size();visionprescriptionlensspecificationproductcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  visionprescriptionlensspecificationproductcoding = visionprescriptionlensspecificationproductcodinglist.get(visionprescriptionlensspecificationproductcodingi);

		/******************** VisionPrescription_LensSpcfctn_Prdct_Cdg_Dsply ********************************************************************************/
		if(visionprescriptionlensspecificationproductcodingi == 0) {v.addVisionPrescriptionLensSpcfctnPrdctCdgDsply("[[");}
		if(visionprescriptionlensspecificationproductcoding.hasDisplay()) {

			v.addVisionPrescriptionLensSpcfctnPrdctCdgDsply(String.valueOf(visionprescriptionlensspecificationproductcoding.getDisplay()));
		} else {
			v.addVisionPrescriptionLensSpcfctnPrdctCdgDsply("NULL");
		}

		if(visionprescriptionlensspecificationproductcodingi == visionprescriptionlensspecificationproductcodinglist.size()-1) {v.addVisionPrescriptionLensSpcfctnPrdctCdgDsply("]]");}


		/******************** VisionPrescription_LensSpcfctn_Prdct_Cdg_Vrsn ********************************************************************************/
		if(visionprescriptionlensspecificationproductcodingi == 0) {v.addVisionPrescriptionLensSpcfctnPrdctCdgVrsn("[[");}
		if(visionprescriptionlensspecificationproductcoding.hasVersion()) {

			v.addVisionPrescriptionLensSpcfctnPrdctCdgVrsn(String.valueOf(visionprescriptionlensspecificationproductcoding.getVersion()));
		} else {
			v.addVisionPrescriptionLensSpcfctnPrdctCdgVrsn("NULL");
		}

		if(visionprescriptionlensspecificationproductcodingi == visionprescriptionlensspecificationproductcodinglist.size()-1) {v.addVisionPrescriptionLensSpcfctnPrdctCdgVrsn("]]");}


		/******************** VisionPrescription_LensSpcfctn_Prdct_Cdg_Cd ********************************************************************************/
		if(visionprescriptionlensspecificationproductcodingi == 0) {v.addVisionPrescriptionLensSpcfctnPrdctCdgCd("[[");}
		if(visionprescriptionlensspecificationproductcoding.hasCode()) {

			v.addVisionPrescriptionLensSpcfctnPrdctCdgCd(String.valueOf(visionprescriptionlensspecificationproductcoding.getCode()));
		} else {
			v.addVisionPrescriptionLensSpcfctnPrdctCdgCd("NULL");
		}

		if(visionprescriptionlensspecificationproductcodingi == visionprescriptionlensspecificationproductcodinglist.size()-1) {v.addVisionPrescriptionLensSpcfctnPrdctCdgCd("]]");}


		/******************** VisionPrescription_LensSpcfctn_Prdct_Cdg_UsrSltd ********************************************************************************/
		if(visionprescriptionlensspecificationproductcodingi == 0) {v.addVisionPrescriptionLensSpcfctnPrdctCdgUsrSltd("[[");}
		if(visionprescriptionlensspecificationproductcoding.hasUserSelected()) {

			v.addVisionPrescriptionLensSpcfctnPrdctCdgUsrSltd(String.valueOf(visionprescriptionlensspecificationproductcoding.getUserSelected()));
		} else {
			v.addVisionPrescriptionLensSpcfctnPrdctCdgUsrSltd("NULL");
		}

		if(visionprescriptionlensspecificationproductcodingi == visionprescriptionlensspecificationproductcodinglist.size()-1) {v.addVisionPrescriptionLensSpcfctnPrdctCdgUsrSltd("]]");}


		/******************** VisionPrescription_LensSpcfctn_Prdct_Cdg_Sys ********************************************************************************/
		if(visionprescriptionlensspecificationproductcodingi == 0) {v.addVisionPrescriptionLensSpcfctnPrdctCdgSys("[[");}
		if(visionprescriptionlensspecificationproductcoding.hasSystem()) {

			v.addVisionPrescriptionLensSpcfctnPrdctCdgSys(String.valueOf(visionprescriptionlensspecificationproductcoding.getSystem()));
		} else {
			v.addVisionPrescriptionLensSpcfctnPrdctCdgSys("NULL");
		}

		if(visionprescriptionlensspecificationproductcodingi == visionprescriptionlensspecificationproductcodinglist.size()-1) {v.addVisionPrescriptionLensSpcfctnPrdctCdgSys("]]");}


		 };
		/******************** VisionPrescription_LensSpcfctn_Color ********************************************************************************/
		if(visionprescriptionlensspecification.hasColor()) {

			v.addVisionPrescriptionLensSpcfctnColor(String.valueOf(visionprescriptionlensspecification.getColor()));
		} else {
			v.addVisionPrescriptionLensSpcfctnColor("NULL");
		}


		/******************** visionprescriptionlensspecificationeye ********************************************************************************/
		org.hl7.fhir.r4.model.VisionPrescription.VisionEyes visionprescriptionlensspecificationeye = visionprescriptionlensspecification.getEye();
		if(visionprescriptionlensspecificationeye!=null) {
			v.addVisionPrescriptionLensSpcfctnEye(visionprescriptionlensspecificationeye.toCode());
		} else {
			v.addVisionPrescriptionLensSpcfctnEye("NULL");
		}

		/******************** VisionPrescription_LensSpcfctn_Axis ********************************************************************************/
		if(visionprescriptionlensspecification.hasAxis()) {

			v.addVisionPrescriptionLensSpcfctnAxis(String.valueOf(visionprescriptionlensspecification.getAxis()));
		} else {
			v.addVisionPrescriptionLensSpcfctnAxis("NULL");
		}


		/******************** visionprescriptionlensspecificationprism ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.VisionPrescription.PrismComponent> visionprescriptionlensspecificationprismlist = visionprescriptionlensspecification.getPrism();
		for(int visionprescriptionlensspecificationprismi = 0; visionprescriptionlensspecificationprismi<visionprescriptionlensspecificationprismlist.size();visionprescriptionlensspecificationprismi++ ) {
		org.hl7.fhir.r4.model.VisionPrescription.PrismComponent  visionprescriptionlensspecificationprism = visionprescriptionlensspecificationprismlist.get(visionprescriptionlensspecificationprismi);

		/******************** visionprescriptionlensspecificationprismbase ********************************************************************************/
		org.hl7.fhir.r4.model.VisionPrescription.VisionBase visionprescriptionlensspecificationprismbase = visionprescriptionlensspecificationprism.getBase();
		if(visionprescriptionlensspecificationprismbase!=null) {
		if(visionprescriptionlensspecificationprismi == 0) {

		v.addVisionPrescriptionLensSpcfctnPrismBase("[[");		}
			v.addVisionPrescriptionLensSpcfctnPrismBase(visionprescriptionlensspecificationprismbase.toCode());
		if(visionprescriptionlensspecificationprismi == visionprescriptionlensspecificationprismlist.size()-1) {

		v.addVisionPrescriptionLensSpcfctnPrismBase("]]");		}

		} else {
			v.addVisionPrescriptionLensSpcfctnPrismBase("NULL");
		}

		/******************** VisionPrescription_LensSpcfctn_Prism_Amnt ********************************************************************************/
		if(visionprescriptionlensspecificationprismi == 0) {v.addVisionPrescriptionLensSpcfctnPrismAmnt("[[");}
		if(visionprescriptionlensspecificationprism.hasAmount()) {

			v.addVisionPrescriptionLensSpcfctnPrismAmnt(String.valueOf(visionprescriptionlensspecificationprism.getAmount()));
		} else {
			v.addVisionPrescriptionLensSpcfctnPrismAmnt("NULL");
		}

		if(visionprescriptionlensspecificationprismi == visionprescriptionlensspecificationprismlist.size()-1) {v.addVisionPrescriptionLensSpcfctnPrismAmnt("]]");}


		 };
		/******************** VisionPrescription_LensSpcfctn_Cylinder ********************************************************************************/
		if(visionprescriptionlensspecification.hasCylinder()) {

			v.addVisionPrescriptionLensSpcfctnCylinder(String.valueOf(visionprescriptionlensspecification.getCylinder()));
		} else {
			v.addVisionPrescriptionLensSpcfctnCylinder("NULL");
		}


		/******************** VisionPrescription_LensSpcfctn_Sphere ********************************************************************************/
		if(visionprescriptionlensspecification.hasSphere()) {

			v.addVisionPrescriptionLensSpcfctnSphere(String.valueOf(visionprescriptionlensspecification.getSphere()));
		} else {
			v.addVisionPrescriptionLensSpcfctnSphere("NULL");
		}


		/******************** VisionPrescription_LensSpcfctn_Brand ********************************************************************************/
		if(visionprescriptionlensspecification.hasBrand()) {

			v.addVisionPrescriptionLensSpcfctnBrand(String.valueOf(visionprescriptionlensspecification.getBrand()));
		} else {
			v.addVisionPrescriptionLensSpcfctnBrand("NULL");
		}


		/******************** VisionPrescription_LensSpcfctn_Power ********************************************************************************/
		if(visionprescriptionlensspecification.hasPower()) {

			v.addVisionPrescriptionLensSpcfctnPower(String.valueOf(visionprescriptionlensspecification.getPower()));
		} else {
			v.addVisionPrescriptionLensSpcfctnPower("NULL");
		}


		/******************** VisionPrescription_LensSpcfctn_Add ********************************************************************************/
		if(visionprescriptionlensspecification.hasAdd()) {

			v.addVisionPrescriptionLensSpcfctnAdd(String.valueOf(visionprescriptionlensspecification.getAdd()));
		} else {
			v.addVisionPrescriptionLensSpcfctnAdd("NULL");
		}


		/******************** VisionPrescription_LensSpcfctn_Diameter ********************************************************************************/
		if(visionprescriptionlensspecification.hasDiameter()) {

			v.addVisionPrescriptionLensSpcfctnDiameter(String.valueOf(visionprescriptionlensspecification.getDiameter()));
		} else {
			v.addVisionPrescriptionLensSpcfctnDiameter("NULL");
		}


		/******************** VisionPrescription_LensSpcfctn_BackCurve ********************************************************************************/
		if(visionprescriptionlensspecification.hasBackCurve()) {

			v.addVisionPrescriptionLensSpcfctnBackCurve(String.valueOf(visionprescriptionlensspecification.getBackCurve()));
		} else {
			v.addVisionPrescriptionLensSpcfctnBackCurve("NULL");
		}


		/******************** visionprescriptionlensspecificationduration ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity visionprescriptionlensspecificationduration = visionprescriptionlensspecification.getDuration();

		/******************** VisionPrescription_LensSpcfctn_Duration_Vl ********************************************************************************/
		if(visionprescriptionlensspecificationduration.hasValue()) {

			v.addVisionPrescriptionLensSpcfctnDurationVl(String.valueOf(visionprescriptionlensspecificationduration.getValue()));
		} else {
			v.addVisionPrescriptionLensSpcfctnDurationVl("NULL");
		}


		/******************** visionprescriptionlensspecificationdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator visionprescriptionlensspecificationdurationcomparator = visionprescriptionlensspecificationduration.getComparator();
		if(visionprescriptionlensspecificationdurationcomparator!=null) {
			v.addVisionPrescriptionLensSpcfctnDurationCmprtr(visionprescriptionlensspecificationdurationcomparator.toCode());
		} else {
			v.addVisionPrescriptionLensSpcfctnDurationCmprtr("NULL");
		}

		/******************** VisionPrescription_LensSpcfctn_Duration_Cd ********************************************************************************/
		if(visionprescriptionlensspecificationduration.hasCode()) {

			v.addVisionPrescriptionLensSpcfctnDurationCd(String.valueOf(visionprescriptionlensspecificationduration.getCode()));
		} else {
			v.addVisionPrescriptionLensSpcfctnDurationCd("NULL");
		}


		/******************** VisionPrescription_LensSpcfctn_Duration_Unt ********************************************************************************/
		if(visionprescriptionlensspecificationduration.hasUnit()) {

			v.addVisionPrescriptionLensSpcfctnDurationUnt(String.valueOf(visionprescriptionlensspecificationduration.getUnit()));
		} else {
			v.addVisionPrescriptionLensSpcfctnDurationUnt("NULL");
		}


		/******************** VisionPrescription_LensSpcfctn_Duration_Sys ********************************************************************************/
		if(visionprescriptionlensspecificationduration.hasSystem()) {

			v.addVisionPrescriptionLensSpcfctnDurationSys(String.valueOf(visionprescriptionlensspecificationduration.getSystem()));
		} else {
			v.addVisionPrescriptionLensSpcfctnDurationSys("NULL");
		}


		 };
		/******************** VisionPrescription_Pnt ********************************************************************************/
		if(visionprescription.hasPatient()) {

			if(visionprescription.getPatient().getReference() != null) {
			v.addVisionPrescriptionPnt(visionprescription.getPatient().getReference());
			}
		} else {
			v.addVisionPrescriptionPnt("NULL");
		}


		return v;
	}
}
