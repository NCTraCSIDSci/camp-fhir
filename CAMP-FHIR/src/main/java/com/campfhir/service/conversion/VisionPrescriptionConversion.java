package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.VisionPrescription;
public class VisionPrescriptionConversion 
{
	public org.hl7.fhir.r4.model.VisionPrescription VisionPrescriptions(VisionPrescription v) throws ParseException
	{
		org.hl7.fhir.r4.model.VisionPrescription visionprescription = new org.hl7.fhir.r4.model.VisionPrescription();

		/******************** id ********************************************************************************/
		visionprescription.setId(v.getId());

		/******************** VisionPrescription_Created ********************************************************************************/
		if(v.getVisionPrescriptionCreated() != null) {
			java.text.SimpleDateFormat VisionPrescription_Createdsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date VisionPrescription_Createddate = VisionPrescription_Createdsdf.parse(v.getVisionPrescriptionCreated());
			visionprescription.setCreated(VisionPrescription_Createddate);
		}
		/******************** VisionPrescription_DtWritten ********************************************************************************/
		if(v.getVisionPrescriptionDtWritten() != null) {
			java.text.SimpleDateFormat VisionPrescription_DtWrittensdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date VisionPrescription_DtWrittendate = VisionPrescription_DtWrittensdf.parse(v.getVisionPrescriptionDtWritten());
			visionprescription.setDateWritten(VisionPrescription_DtWrittendate);
		}
		/******************** VisionPrescription_Enc ********************************************************************************/
		if(v.getVisionPrescriptionEnc() != null) {
			visionprescription.setEncounter( new org.hl7.fhir.r4.model.Reference(v.getVisionPrescriptionEnc()));
		}
		/******************** visionprescriptionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier visionprescriptionidentifier =  new org.hl7.fhir.r4.model.Identifier();
		visionprescription.addIdentifier(visionprescriptionidentifier);

		/******************** VisionPrescription_Id_Assigner ********************************************************************************/
		if(v.getVisionPrescriptionIdAssigner() != null) {
			visionprescriptionidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(v.getVisionPrescriptionIdAssigner()));
		}
		/******************** visionprescriptionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period visionprescriptionidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		visionprescriptionidentifier.setPeriod(visionprescriptionidentifierperiod);

		/******************** VisionPrescription_Id_Prd_End ********************************************************************************/
		if(v.getVisionPrescriptionIdPrdEnd() != null) {
			java.text.SimpleDateFormat VisionPrescription_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date VisionPrescription_Id_Prd_Enddate = VisionPrescription_Id_Prd_Endsdf.parse(v.getVisionPrescriptionIdPrdEnd());
			visionprescriptionidentifierperiod.setEnd(VisionPrescription_Id_Prd_Enddate);
		}
		/******************** VisionPrescription_Id_Prd_Strt ********************************************************************************/
		if(v.getVisionPrescriptionIdPrdStrt() != null) {
			java.text.SimpleDateFormat VisionPrescription_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date VisionPrescription_Id_Prd_Strtdate = VisionPrescription_Id_Prd_Strtsdf.parse(v.getVisionPrescriptionIdPrdStrt());
			visionprescriptionidentifierperiod.setStart(VisionPrescription_Id_Prd_Strtdate);
		}
		/******************** VisionPrescription_Id_Sys ********************************************************************************/
		if(v.getVisionPrescriptionIdSys() != null) {
			visionprescriptionidentifier.setSystem(v.getVisionPrescriptionIdSys());
		}
		/******************** visionprescriptionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept visionprescriptionidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		visionprescriptionidentifier.setType(visionprescriptionidentifiertype);

		/******************** visionprescriptionidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding visionprescriptionidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		visionprescriptionidentifiertype.addCoding(visionprescriptionidentifiertypecoding);

		/******************** VisionPrescription_Id_Typ_Cdg_Cd ********************************************************************************/
		if(v.getVisionPrescriptionIdTypCdgCd() != null) {
			visionprescriptionidentifiertypecoding.setCode(v.getVisionPrescriptionIdTypCdgCd());
		}
		/******************** VisionPrescription_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(v.getVisionPrescriptionIdTypCdgDsply() != null) {
			visionprescriptionidentifiertypecoding.setDisplay(v.getVisionPrescriptionIdTypCdgDsply());
		}
		/******************** VisionPrescription_Id_Typ_Cdg_Sys ********************************************************************************/
		if(v.getVisionPrescriptionIdTypCdgSys() != null) {
			visionprescriptionidentifiertypecoding.setSystem(v.getVisionPrescriptionIdTypCdgSys());
		}
		/******************** VisionPrescription_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(v.getVisionPrescriptionIdTypCdgUsrSltd() != null) {
			visionprescriptionidentifiertypecoding.setUserSelected(Boolean.parseBoolean(v.getVisionPrescriptionIdTypCdgUsrSltd()));
		}
		/******************** VisionPrescription_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(v.getVisionPrescriptionIdTypCdgVrsn() != null) {
			visionprescriptionidentifiertypecoding.setVersion(v.getVisionPrescriptionIdTypCdgVrsn());
		}
		/******************** VisionPrescription_Id_Typ_Txt ********************************************************************************/
		if(v.getVisionPrescriptionIdTypTxt() != null) {
			visionprescriptionidentifiertype.setText(v.getVisionPrescriptionIdTypTxt());
		}
		/******************** visionprescriptionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory visionprescriptionidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		visionprescriptionidentifier.setUse(visionprescriptionidentifieruse.fromCode(v.getVisionPrescriptionIdUse()));

		/******************** VisionPrescription_Id_Vl ********************************************************************************/
		if(v.getVisionPrescriptionIdVl() != null) {
			visionprescriptionidentifier.setValue(v.getVisionPrescriptionIdVl());
		}
		/******************** visionprescriptionlensspecification ********************************************************************************/
		org.hl7.fhir.r4.model.VisionPrescription.VisionPrescriptionLensSpecificationComponent visionprescriptionlensspecification =  new org.hl7.fhir.r4.model.VisionPrescription.VisionPrescriptionLensSpecificationComponent();
		visionprescription.addLensSpecification(visionprescriptionlensspecification);

		/******************** VisionPrescription_LensSpcfctn_Add ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnAdd() != null) {
			visionprescriptionlensspecification.setAdd(Double.parseDouble((v.getVisionPrescriptionLensSpcfctnAdd())));
		}
		/******************** VisionPrescription_LensSpcfctn_Axis ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnAxis() != null) {
			visionprescriptionlensspecification.setAxis(Integer.parseInt(v.getVisionPrescriptionLensSpcfctnAxis()));
		}
		/******************** VisionPrescription_LensSpcfctn_BackCurve ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnBackCurve() != null) {
			visionprescriptionlensspecification.setBackCurve(Double.parseDouble((v.getVisionPrescriptionLensSpcfctnBackCurve())));
		}
		/******************** VisionPrescription_LensSpcfctn_Brand ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnBrand() != null) {
			visionprescriptionlensspecification.setBrand(v.getVisionPrescriptionLensSpcfctnBrand());
		}
		/******************** VisionPrescription_LensSpcfctn_Color ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnColor() != null) {
			visionprescriptionlensspecification.setColor(v.getVisionPrescriptionLensSpcfctnColor());
		}
		/******************** VisionPrescription_LensSpcfctn_Cylinder ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnCylinder() != null) {
			visionprescriptionlensspecification.setCylinder(Double.parseDouble((v.getVisionPrescriptionLensSpcfctnCylinder())));
		}
		/******************** VisionPrescription_LensSpcfctn_Diameter ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnDiameter() != null) {
			visionprescriptionlensspecification.setDiameter(new java.math.BigDecimal((v.getVisionPrescriptionLensSpcfctnDiameter())));
		}
		/******************** visionprescriptionlensspecificationduration ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity visionprescriptionlensspecificationduration =  new org.hl7.fhir.r4.model.Quantity();
		visionprescriptionlensspecification.setDuration(visionprescriptionlensspecificationduration);

		/******************** VisionPrescription_LensSpcfctn_Duration_Cd ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnDurationCd() != null) {
			visionprescriptionlensspecificationduration.setCode(v.getVisionPrescriptionLensSpcfctnDurationCd());
		}
		/******************** visionprescriptionlensspecificationdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory visionprescriptionlensspecificationdurationcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		visionprescriptionlensspecificationduration.setComparator(visionprescriptionlensspecificationdurationcomparator.fromCode(v.getVisionPrescriptionLensSpcfctnDurationCmprtr()));

		/******************** VisionPrescription_LensSpcfctn_Duration_Sys ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnDurationSys() != null) {
			visionprescriptionlensspecificationduration.setSystem(v.getVisionPrescriptionLensSpcfctnDurationSys());
		}
		/******************** VisionPrescription_LensSpcfctn_Duration_Unt ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnDurationUnt() != null) {
			visionprescriptionlensspecificationduration.setUnit(v.getVisionPrescriptionLensSpcfctnDurationUnt());
		}
		/******************** VisionPrescription_LensSpcfctn_Duration_Vl ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnDurationVl() != null) {
			visionprescriptionlensspecificationduration.setValue(Double.parseDouble((v.getVisionPrescriptionLensSpcfctnDurationVl())));
		}
		/******************** visionprescriptionlensspecificationeye ********************************************************************************/
		org.hl7.fhir.r4.model.VisionPrescription.VisionEyesEnumFactory visionprescriptionlensspecificationeye =  new org.hl7.fhir.r4.model.VisionPrescription.VisionEyesEnumFactory();
		visionprescriptionlensspecification.setEye(visionprescriptionlensspecificationeye.fromCode(v.getVisionPrescriptionLensSpcfctnEye()));

		/******************** visionprescriptionlensspecificationnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation visionprescriptionlensspecificationnote =  new org.hl7.fhir.r4.model.Annotation();
		visionprescriptionlensspecification.addNote(visionprescriptionlensspecificationnote);

		/******************** VisionPrescription_LensSpcfctn_Nt_AthrRfrnc ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnNtAthrRfrnc() != null) {
			visionprescriptionlensspecificationnote.setAuthor( new org.hl7.fhir.r4.model.Reference(v.getVisionPrescriptionLensSpcfctnNtAthrRfrnc()));
		}
		/******************** VisionPrescription_LensSpcfctn_Nt_AthrStrgTyp ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnNtAthrStrgTyp() != null) {
			visionprescriptionlensspecificationnote.setAuthor( new org.hl7.fhir.r4.model.StringType(v.getVisionPrescriptionLensSpcfctnNtAthrStrgTyp()));
		}
		/******************** VisionPrescription_LensSpcfctn_Nt_Txt ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnNtTxt() != null) {
			visionprescriptionlensspecificationnote.setText(v.getVisionPrescriptionLensSpcfctnNtTxt());
		}
		/******************** VisionPrescription_LensSpcfctn_Nt_Time ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnNtTime() != null) {
			java.text.SimpleDateFormat VisionPrescription_LensSpcfctn_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date VisionPrescription_LensSpcfctn_Nt_Timedate = VisionPrescription_LensSpcfctn_Nt_Timesdf.parse(v.getVisionPrescriptionLensSpcfctnNtTime());
			visionprescriptionlensspecificationnote.setTime(VisionPrescription_LensSpcfctn_Nt_Timedate);
		}
		/******************** VisionPrescription_LensSpcfctn_Power ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnPower() != null) {
			visionprescriptionlensspecification.setPower(new java.math.BigDecimal((v.getVisionPrescriptionLensSpcfctnPower())));
		}
		/******************** visionprescriptionlensspecificationprism ********************************************************************************/
		org.hl7.fhir.r4.model.VisionPrescription.PrismComponent visionprescriptionlensspecificationprism =  new org.hl7.fhir.r4.model.VisionPrescription.PrismComponent();
		visionprescriptionlensspecification.addPrism(visionprescriptionlensspecificationprism);

		/******************** VisionPrescription_LensSpcfctn_Prism_Amnt ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnPrismAmnt() != null) {
			visionprescriptionlensspecificationprism.setAmount(new java.math.BigDecimal((v.getVisionPrescriptionLensSpcfctnPrismAmnt())));
		}
		/******************** visionprescriptionlensspecificationprismbase ********************************************************************************/
		org.hl7.fhir.r4.model.VisionPrescription.VisionBaseEnumFactory visionprescriptionlensspecificationprismbase =  new org.hl7.fhir.r4.model.VisionPrescription.VisionBaseEnumFactory();
		visionprescriptionlensspecificationprism.setBase(visionprescriptionlensspecificationprismbase.fromCode(v.getVisionPrescriptionLensSpcfctnPrismBase()));

		/******************** visionprescriptionlensspecificationproduct ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept visionprescriptionlensspecificationproduct =  new org.hl7.fhir.r4.model.CodeableConcept();
		visionprescriptionlensspecification.setProduct(visionprescriptionlensspecificationproduct);

		/******************** visionprescriptionlensspecificationproductcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding visionprescriptionlensspecificationproductcoding =  new org.hl7.fhir.r4.model.Coding();
		visionprescriptionlensspecificationproduct.addCoding(visionprescriptionlensspecificationproductcoding);

		/******************** VisionPrescription_LensSpcfctn_Prdct_Cdg_Cd ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnPrdctCdgCd() != null) {
			visionprescriptionlensspecificationproductcoding.setCode(v.getVisionPrescriptionLensSpcfctnPrdctCdgCd());
		}
		/******************** VisionPrescription_LensSpcfctn_Prdct_Cdg_Dsply ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnPrdctCdgDsply() != null) {
			visionprescriptionlensspecificationproductcoding.setDisplay(v.getVisionPrescriptionLensSpcfctnPrdctCdgDsply());
		}
		/******************** VisionPrescription_LensSpcfctn_Prdct_Cdg_Sys ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnPrdctCdgSys() != null) {
			visionprescriptionlensspecificationproductcoding.setSystem(v.getVisionPrescriptionLensSpcfctnPrdctCdgSys());
		}
		/******************** VisionPrescription_LensSpcfctn_Prdct_Cdg_UsrSltd ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnPrdctCdgUsrSltd() != null) {
			visionprescriptionlensspecificationproductcoding.setUserSelected(Boolean.parseBoolean(v.getVisionPrescriptionLensSpcfctnPrdctCdgUsrSltd()));
		}
		/******************** VisionPrescription_LensSpcfctn_Prdct_Cdg_Vrsn ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnPrdctCdgVrsn() != null) {
			visionprescriptionlensspecificationproductcoding.setVersion(v.getVisionPrescriptionLensSpcfctnPrdctCdgVrsn());
		}
		/******************** VisionPrescription_LensSpcfctn_Prdct_Txt ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnPrdctTxt() != null) {
			visionprescriptionlensspecificationproduct.setText(v.getVisionPrescriptionLensSpcfctnPrdctTxt());
		}
		/******************** VisionPrescription_LensSpcfctn_Sphere ********************************************************************************/
		if(v.getVisionPrescriptionLensSpcfctnSphere() != null) {
			visionprescriptionlensspecification.setSphere(new java.math.BigDecimal((v.getVisionPrescriptionLensSpcfctnSphere())));
		}
		/******************** VisionPrescription_Pnt ********************************************************************************/
		if(v.getVisionPrescriptionPnt() != null) {
			visionprescription.setPatient( new org.hl7.fhir.r4.model.Reference(v.getVisionPrescriptionPnt()));
		}
		/******************** VisionPrescription_Prescriber ********************************************************************************/
		if(v.getVisionPrescriptionPrescriber() != null) {
			visionprescription.setPrescriber( new org.hl7.fhir.r4.model.Reference(v.getVisionPrescriptionPrescriber()));
		}
		/******************** visionprescriptionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.VisionPrescription.VisionStatusEnumFactory visionprescriptionstatus =  new org.hl7.fhir.r4.model.VisionPrescription.VisionStatusEnumFactory();
		visionprescription.setStatus(visionprescriptionstatus.fromCode(v.getVisionPrescriptionSts()));

		return visionprescription;
	}
}
