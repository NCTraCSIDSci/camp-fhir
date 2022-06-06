package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.CoverageEligibilityRequest;
public class CoverageEligibilityRequestConversion 
{
	public org.hl7.fhir.r4.model.CoverageEligibilityRequest CoverageEligibilityRequests(CoverageEligibilityRequest c) throws ParseException
	{
		org.hl7.fhir.r4.model.CoverageEligibilityRequest coverageeligibilityrequest = new org.hl7.fhir.r4.model.CoverageEligibilityRequest();

		/******************** id ********************************************************************************/
		coverageeligibilityrequest.setId(c.getId());

		/******************** CvgElgbltyRqst_Created ********************************************************************************/
		if(c.getCvgElgbltyRqstCreated() != null) {
			java.text.SimpleDateFormat CvgElgbltyRqst_Createdsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CvgElgbltyRqst_Createddate = CvgElgbltyRqst_Createdsdf.parse(c.getCvgElgbltyRqstCreated());
			coverageeligibilityrequest.setCreated(CvgElgbltyRqst_Createddate);
		}
		/******************** CvgElgbltyRqst_Enterer ********************************************************************************/
		if(c.getCvgElgbltyRqstEnterer() != null) {
			coverageeligibilityrequest.setEnterer( new org.hl7.fhir.r4.model.Reference(c.getCvgElgbltyRqstEnterer()));
		}
		/******************** CvgElgbltyRqst_Facility ********************************************************************************/
		if(c.getCvgElgbltyRqstFacility() != null) {
			coverageeligibilityrequest.setFacility( new org.hl7.fhir.r4.model.Reference(c.getCvgElgbltyRqstFacility()));
		}
		/******************** coverageeligibilityrequestidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier coverageeligibilityrequestidentifier =  new org.hl7.fhir.r4.model.Identifier();
		coverageeligibilityrequest.addIdentifier(coverageeligibilityrequestidentifier);

		/******************** CvgElgbltyRqst_Id_Assigner ********************************************************************************/
		if(c.getCvgElgbltyRqstIdAssigner() != null) {
			coverageeligibilityrequestidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(c.getCvgElgbltyRqstIdAssigner()));
		}
		/******************** coverageeligibilityrequestidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period coverageeligibilityrequestidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		coverageeligibilityrequestidentifier.setPeriod(coverageeligibilityrequestidentifierperiod);

		/******************** CvgElgbltyRqst_Id_Prd_End ********************************************************************************/
		if(c.getCvgElgbltyRqstIdPrdEnd() != null) {
			java.text.SimpleDateFormat CvgElgbltyRqst_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CvgElgbltyRqst_Id_Prd_Enddate = CvgElgbltyRqst_Id_Prd_Endsdf.parse(c.getCvgElgbltyRqstIdPrdEnd());
			coverageeligibilityrequestidentifierperiod.setEnd(CvgElgbltyRqst_Id_Prd_Enddate);
		}
		/******************** CvgElgbltyRqst_Id_Prd_Strt ********************************************************************************/
		if(c.getCvgElgbltyRqstIdPrdStrt() != null) {
			java.text.SimpleDateFormat CvgElgbltyRqst_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CvgElgbltyRqst_Id_Prd_Strtdate = CvgElgbltyRqst_Id_Prd_Strtsdf.parse(c.getCvgElgbltyRqstIdPrdStrt());
			coverageeligibilityrequestidentifierperiod.setStart(CvgElgbltyRqst_Id_Prd_Strtdate);
		}
		/******************** CvgElgbltyRqst_Id_Sys ********************************************************************************/
		if(c.getCvgElgbltyRqstIdSys() != null) {
			coverageeligibilityrequestidentifier.setSystem(c.getCvgElgbltyRqstIdSys());
		}
		/******************** coverageeligibilityrequestidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityrequestidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		coverageeligibilityrequestidentifier.setType(coverageeligibilityrequestidentifiertype);

		/******************** coverageeligibilityrequestidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageeligibilityrequestidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		coverageeligibilityrequestidentifiertype.addCoding(coverageeligibilityrequestidentifiertypecoding);

		/******************** CvgElgbltyRqst_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCvgElgbltyRqstIdTypCdgCd() != null) {
			coverageeligibilityrequestidentifiertypecoding.setCode(c.getCvgElgbltyRqstIdTypCdgCd());
		}
		/******************** CvgElgbltyRqst_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCvgElgbltyRqstIdTypCdgDsply() != null) {
			coverageeligibilityrequestidentifiertypecoding.setDisplay(c.getCvgElgbltyRqstIdTypCdgDsply());
		}
		/******************** CvgElgbltyRqst_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCvgElgbltyRqstIdTypCdgSys() != null) {
			coverageeligibilityrequestidentifiertypecoding.setSystem(c.getCvgElgbltyRqstIdTypCdgSys());
		}
		/******************** CvgElgbltyRqst_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgElgbltyRqstIdTypCdgUsrSltd() != null) {
			coverageeligibilityrequestidentifiertypecoding.setUserSelected(Boolean.parseBoolean(c.getCvgElgbltyRqstIdTypCdgUsrSltd()));
		}
		/******************** CvgElgbltyRqst_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgElgbltyRqstIdTypCdgVrsn() != null) {
			coverageeligibilityrequestidentifiertypecoding.setVersion(c.getCvgElgbltyRqstIdTypCdgVrsn());
		}
		/******************** CvgElgbltyRqst_Id_Typ_Txt ********************************************************************************/
		if(c.getCvgElgbltyRqstIdTypTxt() != null) {
			coverageeligibilityrequestidentifiertype.setText(c.getCvgElgbltyRqstIdTypTxt());
		}
		/******************** coverageeligibilityrequestidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory coverageeligibilityrequestidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		coverageeligibilityrequestidentifier.setUse(coverageeligibilityrequestidentifieruse.fromCode(c.getCvgElgbltyRqstIdUse()));

		/******************** CvgElgbltyRqst_Id_Vl ********************************************************************************/
		if(c.getCvgElgbltyRqstIdVl() != null) {
			coverageeligibilityrequestidentifier.setValue(c.getCvgElgbltyRqstIdVl());
		}
		/******************** coverageeligibilityrequestinsurance ********************************************************************************/
		org.hl7.fhir.r4.model.CoverageEligibilityRequest.InsuranceComponent coverageeligibilityrequestinsurance =  new org.hl7.fhir.r4.model.CoverageEligibilityRequest.InsuranceComponent();
		coverageeligibilityrequest.addInsurance(coverageeligibilityrequestinsurance);

		/******************** CvgElgbltyRqst_Insrnc_BusinessArrangement ********************************************************************************/
		if(c.getCvgElgbltyRqstInsrncBusinessArrangement() != null) {
			coverageeligibilityrequestinsurance.setBusinessArrangement(c.getCvgElgbltyRqstInsrncBusinessArrangement());
		}
		/******************** CvgElgbltyRqst_Insrnc_Cvg ********************************************************************************/
		if(c.getCvgElgbltyRqstInsrncCvg() != null) {
			coverageeligibilityrequestinsurance.setCoverage( new org.hl7.fhir.r4.model.Reference(c.getCvgElgbltyRqstInsrncCvg()));
		}
		/******************** CvgElgbltyRqst_Insrnc_Focal ********************************************************************************/
		if(c.getCvgElgbltyRqstInsrncFocal() != null) {
			coverageeligibilityrequestinsurance.setFocal(Boolean.parseBoolean(c.getCvgElgbltyRqstInsrncFocal()));
		}
		/******************** CvgElgbltyRqst_Insurer ********************************************************************************/
		if(c.getCvgElgbltyRqstInsurer() != null) {
			coverageeligibilityrequest.setInsurer( new org.hl7.fhir.r4.model.Reference(c.getCvgElgbltyRqstInsurer()));
		}
		/******************** coverageeligibilityrequestitem ********************************************************************************/
		org.hl7.fhir.r4.model.CoverageEligibilityRequest.DetailsComponent coverageeligibilityrequestitem =  new org.hl7.fhir.r4.model.CoverageEligibilityRequest.DetailsComponent();
		coverageeligibilityrequest.addItem(coverageeligibilityrequestitem);

		/******************** coverageeligibilityrequestitemcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityrequestitemcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		coverageeligibilityrequestitem.setCategory(coverageeligibilityrequestitemcategory);

		/******************** coverageeligibilityrequestitemcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageeligibilityrequestitemcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		coverageeligibilityrequestitemcategory.addCoding(coverageeligibilityrequestitemcategorycoding);

		/******************** CvgElgbltyRqst_Itm_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getCvgElgbltyRqstItmCtgryCdgCd() != null) {
			coverageeligibilityrequestitemcategorycoding.setCode(c.getCvgElgbltyRqstItmCtgryCdgCd());
		}
		/******************** CvgElgbltyRqst_Itm_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getCvgElgbltyRqstItmCtgryCdgDsply() != null) {
			coverageeligibilityrequestitemcategorycoding.setDisplay(c.getCvgElgbltyRqstItmCtgryCdgDsply());
		}
		/******************** CvgElgbltyRqst_Itm_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getCvgElgbltyRqstItmCtgryCdgSys() != null) {
			coverageeligibilityrequestitemcategorycoding.setSystem(c.getCvgElgbltyRqstItmCtgryCdgSys());
		}
		/******************** CvgElgbltyRqst_Itm_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgElgbltyRqstItmCtgryCdgUsrSltd() != null) {
			coverageeligibilityrequestitemcategorycoding.setUserSelected(Boolean.parseBoolean(c.getCvgElgbltyRqstItmCtgryCdgUsrSltd()));
		}
		/******************** CvgElgbltyRqst_Itm_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgElgbltyRqstItmCtgryCdgVrsn() != null) {
			coverageeligibilityrequestitemcategorycoding.setVersion(c.getCvgElgbltyRqstItmCtgryCdgVrsn());
		}
		/******************** CvgElgbltyRqst_Itm_Ctgry_Txt ********************************************************************************/
		if(c.getCvgElgbltyRqstItmCtgryTxt() != null) {
			coverageeligibilityrequestitemcategory.setText(c.getCvgElgbltyRqstItmCtgryTxt());
		}
		/******************** CvgElgbltyRqst_Itm_Dtl ********************************************************************************/
		if(c.getCvgElgbltyRqstItmDtl() != null) {
			coverageeligibilityrequestitem.addDetail( new org.hl7.fhir.r4.model.Reference(c.getCvgElgbltyRqstItmDtl()));
		}
		/******************** coverageeligibilityrequestitemdiagnosis ********************************************************************************/
		org.hl7.fhir.r4.model.CoverageEligibilityRequest.DiagnosisComponent coverageeligibilityrequestitemdiagnosis =  new org.hl7.fhir.r4.model.CoverageEligibilityRequest.DiagnosisComponent();
		coverageeligibilityrequestitem.addDiagnosis(coverageeligibilityrequestitemdiagnosis);

		/******************** coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		coverageeligibilityrequestitemdiagnosis.setDiagnosis(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconcept);

		/******************** coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconcept.addCoding(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcoding);

		/******************** CvgElgbltyRqst_Itm_Dgnsis_DgnsisCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(c.getCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgCd() != null) {
			coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcoding.setCode(c.getCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgCd());
		}
		/******************** CvgElgbltyRqst_Itm_Dgnsis_DgnsisCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(c.getCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgDsply() != null) {
			coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcoding.setDisplay(c.getCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgDsply());
		}
		/******************** CvgElgbltyRqst_Itm_Dgnsis_DgnsisCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(c.getCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgSys() != null) {
			coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcoding.setSystem(c.getCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgSys());
		}
		/******************** CvgElgbltyRqst_Itm_Dgnsis_DgnsisCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgUsrSltd() != null) {
			coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcoding.setUserSelected(Boolean.parseBoolean(c.getCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgUsrSltd()));
		}
		/******************** CvgElgbltyRqst_Itm_Dgnsis_DgnsisCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgVrsn() != null) {
			coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcoding.setVersion(c.getCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgVrsn());
		}
		/******************** CvgElgbltyRqst_Itm_Dgnsis_DgnsisCdbleCncpt_Txt ********************************************************************************/
		if(c.getCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptTxt() != null) {
			coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconcept.setText(c.getCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptTxt());
		}
		/******************** CvgElgbltyRqst_Itm_Dgnsis_DgnsisRfrnc ********************************************************************************/
		if(c.getCvgElgbltyRqstItmDgnsisDgnsisRfrnc() != null) {
			coverageeligibilityrequestitemdiagnosis.setDiagnosis( new org.hl7.fhir.r4.model.Reference(c.getCvgElgbltyRqstItmDgnsisDgnsisRfrnc()));
		}
		/******************** CvgElgbltyRqst_Itm_Facility ********************************************************************************/
		if(c.getCvgElgbltyRqstItmFacility() != null) {
			coverageeligibilityrequestitem.setFacility( new org.hl7.fhir.r4.model.Reference(c.getCvgElgbltyRqstItmFacility()));
		}
		/******************** coverageeligibilityrequestitemmodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityrequestitemmodifier =  new org.hl7.fhir.r4.model.CodeableConcept();
		coverageeligibilityrequestitem.addModifier(coverageeligibilityrequestitemmodifier);

		/******************** coverageeligibilityrequestitemmodifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageeligibilityrequestitemmodifiercoding =  new org.hl7.fhir.r4.model.Coding();
		coverageeligibilityrequestitemmodifier.addCoding(coverageeligibilityrequestitemmodifiercoding);

		/******************** CvgElgbltyRqst_Itm_Mdfr_Cdg_Cd ********************************************************************************/
		if(c.getCvgElgbltyRqstItmMdfrCdgCd() != null) {
			coverageeligibilityrequestitemmodifiercoding.setCode(c.getCvgElgbltyRqstItmMdfrCdgCd());
		}
		/******************** CvgElgbltyRqst_Itm_Mdfr_Cdg_Dsply ********************************************************************************/
		if(c.getCvgElgbltyRqstItmMdfrCdgDsply() != null) {
			coverageeligibilityrequestitemmodifiercoding.setDisplay(c.getCvgElgbltyRqstItmMdfrCdgDsply());
		}
		/******************** CvgElgbltyRqst_Itm_Mdfr_Cdg_Sys ********************************************************************************/
		if(c.getCvgElgbltyRqstItmMdfrCdgSys() != null) {
			coverageeligibilityrequestitemmodifiercoding.setSystem(c.getCvgElgbltyRqstItmMdfrCdgSys());
		}
		/******************** CvgElgbltyRqst_Itm_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgElgbltyRqstItmMdfrCdgUsrSltd() != null) {
			coverageeligibilityrequestitemmodifiercoding.setUserSelected(Boolean.parseBoolean(c.getCvgElgbltyRqstItmMdfrCdgUsrSltd()));
		}
		/******************** CvgElgbltyRqst_Itm_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgElgbltyRqstItmMdfrCdgVrsn() != null) {
			coverageeligibilityrequestitemmodifiercoding.setVersion(c.getCvgElgbltyRqstItmMdfrCdgVrsn());
		}
		/******************** CvgElgbltyRqst_Itm_Mdfr_Txt ********************************************************************************/
		if(c.getCvgElgbltyRqstItmMdfrTxt() != null) {
			coverageeligibilityrequestitemmodifier.setText(c.getCvgElgbltyRqstItmMdfrTxt());
		}
		/******************** coverageeligibilityrequestitemproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityrequestitemproductorservice =  new org.hl7.fhir.r4.model.CodeableConcept();
		coverageeligibilityrequestitem.setProductOrService(coverageeligibilityrequestitemproductorservice);

		/******************** coverageeligibilityrequestitemproductorservicecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageeligibilityrequestitemproductorservicecoding =  new org.hl7.fhir.r4.model.Coding();
		coverageeligibilityrequestitemproductorservice.addCoding(coverageeligibilityrequestitemproductorservicecoding);

		/******************** CvgElgbltyRqst_Itm_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(c.getCvgElgbltyRqstItmPrdctOrSrvCdgCd() != null) {
			coverageeligibilityrequestitemproductorservicecoding.setCode(c.getCvgElgbltyRqstItmPrdctOrSrvCdgCd());
		}
		/******************** CvgElgbltyRqst_Itm_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(c.getCvgElgbltyRqstItmPrdctOrSrvCdgDsply() != null) {
			coverageeligibilityrequestitemproductorservicecoding.setDisplay(c.getCvgElgbltyRqstItmPrdctOrSrvCdgDsply());
		}
		/******************** CvgElgbltyRqst_Itm_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(c.getCvgElgbltyRqstItmPrdctOrSrvCdgSys() != null) {
			coverageeligibilityrequestitemproductorservicecoding.setSystem(c.getCvgElgbltyRqstItmPrdctOrSrvCdgSys());
		}
		/******************** CvgElgbltyRqst_Itm_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgElgbltyRqstItmPrdctOrSrvCdgUsrSltd() != null) {
			coverageeligibilityrequestitemproductorservicecoding.setUserSelected(Boolean.parseBoolean(c.getCvgElgbltyRqstItmPrdctOrSrvCdgUsrSltd()));
		}
		/******************** CvgElgbltyRqst_Itm_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgElgbltyRqstItmPrdctOrSrvCdgVrsn() != null) {
			coverageeligibilityrequestitemproductorservicecoding.setVersion(c.getCvgElgbltyRqstItmPrdctOrSrvCdgVrsn());
		}
		/******************** CvgElgbltyRqst_Itm_PrdctOrSrv_Txt ********************************************************************************/
		if(c.getCvgElgbltyRqstItmPrdctOrSrvTxt() != null) {
			coverageeligibilityrequestitemproductorservice.setText(c.getCvgElgbltyRqstItmPrdctOrSrvTxt());
		}
		/******************** CvgElgbltyRqst_Itm_Provider ********************************************************************************/
		if(c.getCvgElgbltyRqstItmProvider() != null) {
			coverageeligibilityrequestitem.setProvider( new org.hl7.fhir.r4.model.Reference(c.getCvgElgbltyRqstItmProvider()));
		}
		/******************** coverageeligibilityrequestitemquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity coverageeligibilityrequestitemquantity =  new org.hl7.fhir.r4.model.Quantity();
		coverageeligibilityrequestitem.setQuantity(coverageeligibilityrequestitemquantity);

		/******************** CvgElgbltyRqst_Itm_Qnty_Cd ********************************************************************************/
		if(c.getCvgElgbltyRqstItmQntyCd() != null) {
			coverageeligibilityrequestitemquantity.setCode(c.getCvgElgbltyRqstItmQntyCd());
		}
		/******************** coverageeligibilityrequestitemquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory coverageeligibilityrequestitemquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		coverageeligibilityrequestitemquantity.setComparator(coverageeligibilityrequestitemquantitycomparator.fromCode(c.getCvgElgbltyRqstItmQntyCmprtr()));

		/******************** CvgElgbltyRqst_Itm_Qnty_Sys ********************************************************************************/
		if(c.getCvgElgbltyRqstItmQntySys() != null) {
			coverageeligibilityrequestitemquantity.setSystem(c.getCvgElgbltyRqstItmQntySys());
		}
		/******************** CvgElgbltyRqst_Itm_Qnty_Unt ********************************************************************************/
		if(c.getCvgElgbltyRqstItmQntyUnt() != null) {
			coverageeligibilityrequestitemquantity.setUnit(c.getCvgElgbltyRqstItmQntyUnt());
		}
		/******************** CvgElgbltyRqst_Itm_Qnty_Vl ********************************************************************************/
		if(c.getCvgElgbltyRqstItmQntyVl() != null) {
			coverageeligibilityrequestitemquantity.setValue(Double.parseDouble((c.getCvgElgbltyRqstItmQntyVl())));
		}
		/******************** CvgElgbltyRqst_Itm_SprtingInfoSqnc ********************************************************************************/
		if(c.getCvgElgbltyRqstItmSprtingInfoSqnc() != null) {
			coverageeligibilityrequestitem.addSupportingInfoSequence(Integer.parseInt(c.getCvgElgbltyRqstItmSprtingInfoSqnc()));
		}
		/******************** coverageeligibilityrequestitemunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money coverageeligibilityrequestitemunitprice =  new org.hl7.fhir.r4.model.Money();
		coverageeligibilityrequestitem.setUnitPrice(coverageeligibilityrequestitemunitprice);

		/******************** CvgElgbltyRqst_Itm_UntPrice_Crncy ********************************************************************************/
		if(c.getCvgElgbltyRqstItmUntPriceCrncy() != null) {
			coverageeligibilityrequestitemunitprice.setCurrency(c.getCvgElgbltyRqstItmUntPriceCrncy());
		}
		/******************** CvgElgbltyRqst_Itm_UntPrice_Vl ********************************************************************************/
		if(c.getCvgElgbltyRqstItmUntPriceVl() != null) {
			coverageeligibilityrequestitemunitprice.setValue(Double.parseDouble((c.getCvgElgbltyRqstItmUntPriceVl())));
		}
		/******************** CvgElgbltyRqst_Pnt ********************************************************************************/
		if(c.getCvgElgbltyRqstPnt() != null) {
			coverageeligibilityrequest.setPatient( new org.hl7.fhir.r4.model.Reference(c.getCvgElgbltyRqstPnt()));
		}
		/******************** coverageeligibilityrequestpriority ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityrequestpriority =  new org.hl7.fhir.r4.model.CodeableConcept();
		coverageeligibilityrequest.setPriority(coverageeligibilityrequestpriority);

		/******************** coverageeligibilityrequestprioritycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageeligibilityrequestprioritycoding =  new org.hl7.fhir.r4.model.Coding();
		coverageeligibilityrequestpriority.addCoding(coverageeligibilityrequestprioritycoding);

		/******************** CvgElgbltyRqst_Priority_Cdg_Cd ********************************************************************************/
		if(c.getCvgElgbltyRqstPriorityCdgCd() != null) {
			coverageeligibilityrequestprioritycoding.setCode(c.getCvgElgbltyRqstPriorityCdgCd());
		}
		/******************** CvgElgbltyRqst_Priority_Cdg_Dsply ********************************************************************************/
		if(c.getCvgElgbltyRqstPriorityCdgDsply() != null) {
			coverageeligibilityrequestprioritycoding.setDisplay(c.getCvgElgbltyRqstPriorityCdgDsply());
		}
		/******************** CvgElgbltyRqst_Priority_Cdg_Sys ********************************************************************************/
		if(c.getCvgElgbltyRqstPriorityCdgSys() != null) {
			coverageeligibilityrequestprioritycoding.setSystem(c.getCvgElgbltyRqstPriorityCdgSys());
		}
		/******************** CvgElgbltyRqst_Priority_Cdg_UsrSltd ********************************************************************************/
		if(c.getCvgElgbltyRqstPriorityCdgUsrSltd() != null) {
			coverageeligibilityrequestprioritycoding.setUserSelected(Boolean.parseBoolean(c.getCvgElgbltyRqstPriorityCdgUsrSltd()));
		}
		/******************** CvgElgbltyRqst_Priority_Cdg_Vrsn ********************************************************************************/
		if(c.getCvgElgbltyRqstPriorityCdgVrsn() != null) {
			coverageeligibilityrequestprioritycoding.setVersion(c.getCvgElgbltyRqstPriorityCdgVrsn());
		}
		/******************** CvgElgbltyRqst_Priority_Txt ********************************************************************************/
		if(c.getCvgElgbltyRqstPriorityTxt() != null) {
			coverageeligibilityrequestpriority.setText(c.getCvgElgbltyRqstPriorityTxt());
		}
		/******************** CvgElgbltyRqst_Provider ********************************************************************************/
		if(c.getCvgElgbltyRqstProvider() != null) {
			coverageeligibilityrequest.setProvider( new org.hl7.fhir.r4.model.Reference(c.getCvgElgbltyRqstProvider()));
		}
		/******************** coverageeligibilityrequestpurpose ********************************************************************************/
		org.hl7.fhir.r4.model.CoverageEligibilityRequest.EligibilityRequestPurposeEnumFactory coverageeligibilityrequestpurpose =  new org.hl7.fhir.r4.model.CoverageEligibilityRequest.EligibilityRequestPurposeEnumFactory();
		coverageeligibilityrequest.addPurpose(coverageeligibilityrequestpurpose.fromCode(c.getCvgElgbltyRqstPrpse()));

		/******************** CvgElgbltyRqst_SrvdDtTyp ********************************************************************************/
		if(c.getCvgElgbltyRqstSrvdDtTyp() != null) {
			coverageeligibilityrequest.setServiced( new org.hl7.fhir.r4.model.DateType(c.getCvgElgbltyRqstSrvdDtTyp()));
		}
		/******************** coverageeligibilityrequestservicedperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period coverageeligibilityrequestservicedperiod =  new org.hl7.fhir.r4.model.Period();
		coverageeligibilityrequest.setServiced(coverageeligibilityrequestservicedperiod);

		/******************** CvgElgbltyRqst_SrvdPrd_End ********************************************************************************/
		if(c.getCvgElgbltyRqstSrvdPrdEnd() != null) {
			java.text.SimpleDateFormat CvgElgbltyRqst_SrvdPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CvgElgbltyRqst_SrvdPrd_Enddate = CvgElgbltyRqst_SrvdPrd_Endsdf.parse(c.getCvgElgbltyRqstSrvdPrdEnd());
			coverageeligibilityrequestservicedperiod.setEnd(CvgElgbltyRqst_SrvdPrd_Enddate);
		}
		/******************** CvgElgbltyRqst_SrvdPrd_Strt ********************************************************************************/
		if(c.getCvgElgbltyRqstSrvdPrdStrt() != null) {
			java.text.SimpleDateFormat CvgElgbltyRqst_SrvdPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CvgElgbltyRqst_SrvdPrd_Strtdate = CvgElgbltyRqst_SrvdPrd_Strtsdf.parse(c.getCvgElgbltyRqstSrvdPrdStrt());
			coverageeligibilityrequestservicedperiod.setStart(CvgElgbltyRqst_SrvdPrd_Strtdate);
		}
		/******************** coverageeligibilityrequeststatus ********************************************************************************/
		org.hl7.fhir.r4.model.CoverageEligibilityRequest.EligibilityRequestStatusEnumFactory coverageeligibilityrequeststatus =  new org.hl7.fhir.r4.model.CoverageEligibilityRequest.EligibilityRequestStatusEnumFactory();
		coverageeligibilityrequest.setStatus(coverageeligibilityrequeststatus.fromCode(c.getCvgElgbltyRqstSts()));

		/******************** coverageeligibilityrequestsupportinginfo ********************************************************************************/
		org.hl7.fhir.r4.model.CoverageEligibilityRequest.SupportingInformationComponent coverageeligibilityrequestsupportinginfo =  new org.hl7.fhir.r4.model.CoverageEligibilityRequest.SupportingInformationComponent();
		coverageeligibilityrequest.addSupportingInfo(coverageeligibilityrequestsupportinginfo);

		/******************** CvgElgbltyRqst_SprtingInfo_AppliesToAll ********************************************************************************/
		if(c.getCvgElgbltyRqstSprtingInfoAppliesToAll() != null) {
			coverageeligibilityrequestsupportinginfo.setAppliesToAll(Boolean.parseBoolean(c.getCvgElgbltyRqstSprtingInfoAppliesToAll()));
		}
		/******************** CvgElgbltyRqst_SprtingInfo_Info ********************************************************************************/
		if(c.getCvgElgbltyRqstSprtingInfoInfo() != null) {
			coverageeligibilityrequestsupportinginfo.setInformation( new org.hl7.fhir.r4.model.Reference(c.getCvgElgbltyRqstSprtingInfoInfo()));
		}
		/******************** CvgElgbltyRqst_SprtingInfo_Sqnc ********************************************************************************/
		if(c.getCvgElgbltyRqstSprtingInfoSqnc() != null) {
			coverageeligibilityrequestsupportinginfo.setSequence(Integer.parseInt(c.getCvgElgbltyRqstSprtingInfoSqnc()));
		}
		return coverageeligibilityrequest;
	}
}
