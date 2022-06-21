package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.VisionPrescription;
public class VisionPrescriptionBidirectionalConversion 
{
	public VisionPrescription VisionPrescriptions(org.hl7.fhir.r4.model.VisionPrescription visionprescription) throws ParseException
	{
		 main.java.com.campfhir.model.VisionPrescription v = new  main.java.com.campfhir.model.VisionPrescription();

		/******************** id ********************************************************************************/
		visionprescription.setId(v.getId());

		/******************** visionprescriptionlensspecification ********************************************************************************/
		org.hl7.fhir.r4.model.VisionPrescription.VisionPrescriptionLensSpecificationComponent visionprescriptionlensspecification = visionprescription.getLensSpecificationFirstRep();

		/******************** visionprescriptionlensspecificationnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation visionprescriptionlensspecificationnote = visionprescriptionlensspecification.getNoteFirstRep();

		/******************** VisionPrescription_LensSpcfctn_Nt_Time ********************************************************************************/
		if(visionprescriptionlensspecificationnote.hasTime()) {
			v.setVisionPrescriptionLensSpcfctnNtTime(String.valueOf(visionprescriptionlensspecificationnote.getTime()));
		}
		/******************** VisionPrescription_LensSpcfctn_Nt_AthrRfrnc ********************************************************************************/
		if(visionprescriptionlensspecificationnote.hasAuthorReference()) {
			v.setVisionPrescriptionLensSpcfctnNtAthrRfrnc(String.valueOf(visionprescriptionlensspecificationnote.getAuthorReference()));
		}
		/******************** VisionPrescription_LensSpcfctn_Nt_Txt ********************************************************************************/
		if(visionprescriptionlensspecificationnote.hasText()) {
			v.setVisionPrescriptionLensSpcfctnNtTxt(String.valueOf(visionprescriptionlensspecificationnote.getText()));
		}
		/******************** VisionPrescription_LensSpcfctn_Nt_AthrStrgTyp ********************************************************************************/
		if(visionprescriptionlensspecificationnote.hasAuthorStringType()) {
			v.setVisionPrescriptionLensSpcfctnNtAthrStrgTyp(String.valueOf(visionprescriptionlensspecificationnote.getAuthorStringType()));
		}
		/******************** VisionPrescription_LensSpcfctn_Color ********************************************************************************/
		if(visionprescriptionlensspecification.hasColor()) {
			v.setVisionPrescriptionLensSpcfctnColor(String.valueOf(visionprescriptionlensspecification.getColor()));
		}
		/******************** visionprescriptionlensspecificationduration ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity visionprescriptionlensspecificationduration = visionprescriptionlensspecification.getDuration();

		/******************** VisionPrescription_LensSpcfctn_Duration_Vl ********************************************************************************/
		if(visionprescriptionlensspecificationduration.hasValue()) {
			v.setVisionPrescriptionLensSpcfctnDurationVl(String.valueOf(visionprescriptionlensspecificationduration.getValue()));
		}
		/******************** visionprescriptionlensspecificationdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator visionprescriptionlensspecificationdurationcomparator = visionprescriptionlensspecificationduration.getComparator();
		v.setVisionPrescriptionLensSpcfctnDurationCmprtr(visionprescriptionlensspecificationdurationcomparator.toCode());

		/******************** VisionPrescription_LensSpcfctn_Duration_Cd ********************************************************************************/
		if(visionprescriptionlensspecificationduration.hasCode()) {
			v.setVisionPrescriptionLensSpcfctnDurationCd(String.valueOf(visionprescriptionlensspecificationduration.getCode()));
		}
		/******************** VisionPrescription_LensSpcfctn_Duration_Sys ********************************************************************************/
		if(visionprescriptionlensspecificationduration.hasSystem()) {
			v.setVisionPrescriptionLensSpcfctnDurationSys(String.valueOf(visionprescriptionlensspecificationduration.getSystem()));
		}
		/******************** VisionPrescription_LensSpcfctn_Duration_Unt ********************************************************************************/
		if(visionprescriptionlensspecificationduration.hasUnit()) {
			v.setVisionPrescriptionLensSpcfctnDurationUnt(String.valueOf(visionprescriptionlensspecificationduration.getUnit()));
		}
		/******************** visionprescriptionlensspecificationeye ********************************************************************************/
		org.hl7.fhir.r4.model.VisionPrescription.VisionEyes visionprescriptionlensspecificationeye = visionprescriptionlensspecification.getEye();
		v.setVisionPrescriptionLensSpcfctnEye(visionprescriptionlensspecificationeye.toCode());

		/******************** VisionPrescription_LensSpcfctn_Sphere ********************************************************************************/
		if(visionprescriptionlensspecification.hasSphere()) {
			v.setVisionPrescriptionLensSpcfctnSphere(String.valueOf(visionprescriptionlensspecification.getSphere()));
		}
		/******************** VisionPrescription_LensSpcfctn_Add ********************************************************************************/
		if(visionprescriptionlensspecification.hasAdd()) {
			v.setVisionPrescriptionLensSpcfctnAdd(String.valueOf(visionprescriptionlensspecification.getAdd()));
		}
		/******************** visionprescriptionlensspecificationprism ********************************************************************************/
		org.hl7.fhir.r4.model.VisionPrescription.PrismComponent visionprescriptionlensspecificationprism = visionprescriptionlensspecification.getPrismFirstRep();

		/******************** visionprescriptionlensspecificationprismbase ********************************************************************************/
		org.hl7.fhir.r4.model.VisionPrescription.VisionBase visionprescriptionlensspecificationprismbase = visionprescriptionlensspecificationprism.getBase();
		v.setVisionPrescriptionLensSpcfctnPrismBase(visionprescriptionlensspecificationprismbase.toCode());

		/******************** VisionPrescription_LensSpcfctn_Prism_Amnt ********************************************************************************/
		if(visionprescriptionlensspecificationprism.hasAmount()) {
			v.setVisionPrescriptionLensSpcfctnPrismAmnt(String.valueOf(visionprescriptionlensspecificationprism.getAmount()));
		}
		/******************** VisionPrescription_LensSpcfctn_Power ********************************************************************************/
		if(visionprescriptionlensspecification.hasPower()) {
			v.setVisionPrescriptionLensSpcfctnPower(String.valueOf(visionprescriptionlensspecification.getPower()));
		}
		/******************** VisionPrescription_LensSpcfctn_Cylinder ********************************************************************************/
		if(visionprescriptionlensspecification.hasCylinder()) {
			v.setVisionPrescriptionLensSpcfctnCylinder(String.valueOf(visionprescriptionlensspecification.getCylinder()));
		}
		/******************** VisionPrescription_LensSpcfctn_Axis ********************************************************************************/
		if(visionprescriptionlensspecification.hasAxis()) {
			v.setVisionPrescriptionLensSpcfctnAxis(String.valueOf(visionprescriptionlensspecification.getAxis()));
		}
		/******************** VisionPrescription_LensSpcfctn_BackCurve ********************************************************************************/
		if(visionprescriptionlensspecification.hasBackCurve()) {
			v.setVisionPrescriptionLensSpcfctnBackCurve(String.valueOf(visionprescriptionlensspecification.getBackCurve()));
		}
		/******************** VisionPrescription_LensSpcfctn_Brand ********************************************************************************/
		if(visionprescriptionlensspecification.hasBrand()) {
			v.setVisionPrescriptionLensSpcfctnBrand(String.valueOf(visionprescriptionlensspecification.getBrand()));
		}
		/******************** VisionPrescription_LensSpcfctn_Diameter ********************************************************************************/
		if(visionprescriptionlensspecification.hasDiameter()) {
			v.setVisionPrescriptionLensSpcfctnDiameter(String.valueOf(visionprescriptionlensspecification.getDiameter()));
		}
		/******************** visionprescriptionlensspecificationproduct ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept visionprescriptionlensspecificationproduct = visionprescriptionlensspecification.getProduct();

		/******************** visionprescriptionlensspecificationproductcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding visionprescriptionlensspecificationproductcoding = visionprescriptionlensspecificationproduct.getCodingFirstRep();

		/******************** VisionPrescription_LensSpcfctn_Prdct_Cdg_Dsply ********************************************************************************/
		if(visionprescriptionlensspecificationproductcoding.hasDisplay()) {
			v.setVisionPrescriptionLensSpcfctnPrdctCdgDsply(String.valueOf(visionprescriptionlensspecificationproductcoding.getDisplay()));
		}
		/******************** VisionPrescription_LensSpcfctn_Prdct_Cdg_Vrsn ********************************************************************************/
		if(visionprescriptionlensspecificationproductcoding.hasVersion()) {
			v.setVisionPrescriptionLensSpcfctnPrdctCdgVrsn(String.valueOf(visionprescriptionlensspecificationproductcoding.getVersion()));
		}
		/******************** VisionPrescription_LensSpcfctn_Prdct_Cdg_Cd ********************************************************************************/
		if(visionprescriptionlensspecificationproductcoding.hasCode()) {
			v.setVisionPrescriptionLensSpcfctnPrdctCdgCd(String.valueOf(visionprescriptionlensspecificationproductcoding.getCode()));
		}
		/******************** VisionPrescription_LensSpcfctn_Prdct_Cdg_Sys ********************************************************************************/
		if(visionprescriptionlensspecificationproductcoding.hasSystem()) {
			v.setVisionPrescriptionLensSpcfctnPrdctCdgSys(String.valueOf(visionprescriptionlensspecificationproductcoding.getSystem()));
		}
		/******************** VisionPrescription_LensSpcfctn_Prdct_Cdg_UsrSltd ********************************************************************************/
		if(visionprescriptionlensspecificationproductcoding.hasUserSelected()) {
			v.setVisionPrescriptionLensSpcfctnPrdctCdgUsrSltd(String.valueOf(visionprescriptionlensspecificationproductcoding.getUserSelected()));
		}
		/******************** VisionPrescription_LensSpcfctn_Prdct_Txt ********************************************************************************/
		if(visionprescriptionlensspecificationproduct.hasText()) {
			v.setVisionPrescriptionLensSpcfctnPrdctTxt(String.valueOf(visionprescriptionlensspecificationproduct.getText()));
		}
		/******************** visionprescriptionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.VisionPrescription.VisionStatus visionprescriptionstatus = visionprescription.getStatus();
		v.setVisionPrescriptionSts(visionprescriptionstatus.toCode());

		/******************** VisionPrescription_Enc ********************************************************************************/
		if(visionprescription.hasEncounter()) {
			v.setVisionPrescriptionEnc(String.valueOf(visionprescription.getEncounter()));
		}
		/******************** VisionPrescription_Created ********************************************************************************/
		if(visionprescription.hasCreated()) {
			v.setVisionPrescriptionCreated(String.valueOf(visionprescription.getCreated()));
		}
		/******************** VisionPrescription_Pnt ********************************************************************************/
		if(visionprescription.hasPatient()) {
			v.setVisionPrescriptionPnt(String.valueOf(visionprescription.getPatient()));
		}
		/******************** visionprescriptionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier visionprescriptionidentifier = visionprescription.getIdentifierFirstRep();

		/******************** VisionPrescription_Id_Vl ********************************************************************************/
		if(visionprescriptionidentifier.hasValue()) {
			v.setVisionPrescriptionIdVl(String.valueOf(visionprescriptionidentifier.getValue()));
		}
		/******************** visionprescriptionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept visionprescriptionidentifiertype = visionprescriptionidentifier.getType();

		/******************** visionprescriptionidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding visionprescriptionidentifiertypecoding = visionprescriptionidentifiertype.getCodingFirstRep();

		/******************** VisionPrescription_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(visionprescriptionidentifiertypecoding.hasDisplay()) {
			v.setVisionPrescriptionIdTypCdgDsply(String.valueOf(visionprescriptionidentifiertypecoding.getDisplay()));
		}
		/******************** VisionPrescription_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(visionprescriptionidentifiertypecoding.hasVersion()) {
			v.setVisionPrescriptionIdTypCdgVrsn(String.valueOf(visionprescriptionidentifiertypecoding.getVersion()));
		}
		/******************** VisionPrescription_Id_Typ_Cdg_Cd ********************************************************************************/
		if(visionprescriptionidentifiertypecoding.hasCode()) {
			v.setVisionPrescriptionIdTypCdgCd(String.valueOf(visionprescriptionidentifiertypecoding.getCode()));
		}
		/******************** VisionPrescription_Id_Typ_Cdg_Sys ********************************************************************************/
		if(visionprescriptionidentifiertypecoding.hasSystem()) {
			v.setVisionPrescriptionIdTypCdgSys(String.valueOf(visionprescriptionidentifiertypecoding.getSystem()));
		}
		/******************** VisionPrescription_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(visionprescriptionidentifiertypecoding.hasUserSelected()) {
			v.setVisionPrescriptionIdTypCdgUsrSltd(String.valueOf(visionprescriptionidentifiertypecoding.getUserSelected()));
		}
		/******************** VisionPrescription_Id_Typ_Txt ********************************************************************************/
		if(visionprescriptionidentifiertype.hasText()) {
			v.setVisionPrescriptionIdTypTxt(String.valueOf(visionprescriptionidentifiertype.getText()));
		}
		/******************** VisionPrescription_Id_Sys ********************************************************************************/
		if(visionprescriptionidentifier.hasSystem()) {
			v.setVisionPrescriptionIdSys(String.valueOf(visionprescriptionidentifier.getSystem()));
		}
		/******************** VisionPrescription_Id_Assigner ********************************************************************************/
		if(visionprescriptionidentifier.hasAssigner()) {
			v.setVisionPrescriptionIdAssigner(String.valueOf(visionprescriptionidentifier.getAssigner()));
		}
		/******************** visionprescriptionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period visionprescriptionidentifierperiod = visionprescriptionidentifier.getPeriod();

		/******************** VisionPrescription_Id_Prd_End ********************************************************************************/
		if(visionprescriptionidentifierperiod.hasEnd()) {
			v.setVisionPrescriptionIdPrdEnd(String.valueOf(visionprescriptionidentifierperiod.getEnd()));
		}
		/******************** VisionPrescription_Id_Prd_Strt ********************************************************************************/
		if(visionprescriptionidentifierperiod.hasStart()) {
			v.setVisionPrescriptionIdPrdStrt(String.valueOf(visionprescriptionidentifierperiod.getStart()));
		}
		/******************** visionprescriptionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse visionprescriptionidentifieruse = visionprescriptionidentifier.getUse();
		v.setVisionPrescriptionIdUse(visionprescriptionidentifieruse.toCode());

		/******************** VisionPrescription_Prescriber ********************************************************************************/
		if(visionprescription.hasPrescriber()) {
			v.setVisionPrescriptionPrescriber(String.valueOf(visionprescription.getPrescriber()));
		}
		/******************** VisionPrescription_DtWritten ********************************************************************************/
		if(visionprescription.hasDateWritten()) {
			v.setVisionPrescriptionDtWritten(String.valueOf(visionprescription.getDateWritten()));
		}
		return v;
	}
}
