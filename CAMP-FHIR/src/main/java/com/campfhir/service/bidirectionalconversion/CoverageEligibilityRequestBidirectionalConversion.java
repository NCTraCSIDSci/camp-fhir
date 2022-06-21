package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.CoverageEligibilityRequest;
public class CoverageEligibilityRequestBidirectionalConversion 
{
	public CoverageEligibilityRequest CoverageEligibilityRequests(org.hl7.fhir.r4.model.CoverageEligibilityRequest coverageeligibilityrequest) throws ParseException
	{
		 main.java.com.campfhir.model.CoverageEligibilityRequest c = new  main.java.com.campfhir.model.CoverageEligibilityRequest();

		/******************** id ********************************************************************************/
		coverageeligibilityrequest.setId(c.getId());

		/******************** coverageeligibilityrequestpriority ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityrequestpriority = coverageeligibilityrequest.getPriority();

		/******************** coverageeligibilityrequestprioritycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageeligibilityrequestprioritycoding = coverageeligibilityrequestpriority.getCodingFirstRep();

		/******************** CvgElgbltyRqst_Priority_Cdg_Dsply ********************************************************************************/
		if(coverageeligibilityrequestprioritycoding.hasDisplay()) {
			c.setCvgElgbltyRqstPriorityCdgDsply(String.valueOf(coverageeligibilityrequestprioritycoding.getDisplay()));
		}
		/******************** CvgElgbltyRqst_Priority_Cdg_Vrsn ********************************************************************************/
		if(coverageeligibilityrequestprioritycoding.hasVersion()) {
			c.setCvgElgbltyRqstPriorityCdgVrsn(String.valueOf(coverageeligibilityrequestprioritycoding.getVersion()));
		}
		/******************** CvgElgbltyRqst_Priority_Cdg_Cd ********************************************************************************/
		if(coverageeligibilityrequestprioritycoding.hasCode()) {
			c.setCvgElgbltyRqstPriorityCdgCd(String.valueOf(coverageeligibilityrequestprioritycoding.getCode()));
		}
		/******************** CvgElgbltyRqst_Priority_Cdg_Sys ********************************************************************************/
		if(coverageeligibilityrequestprioritycoding.hasSystem()) {
			c.setCvgElgbltyRqstPriorityCdgSys(String.valueOf(coverageeligibilityrequestprioritycoding.getSystem()));
		}
		/******************** CvgElgbltyRqst_Priority_Cdg_UsrSltd ********************************************************************************/
		if(coverageeligibilityrequestprioritycoding.hasUserSelected()) {
			c.setCvgElgbltyRqstPriorityCdgUsrSltd(String.valueOf(coverageeligibilityrequestprioritycoding.getUserSelected()));
		}
		/******************** CvgElgbltyRqst_Priority_Txt ********************************************************************************/
		if(coverageeligibilityrequestpriority.hasText()) {
			c.setCvgElgbltyRqstPriorityTxt(String.valueOf(coverageeligibilityrequestpriority.getText()));
		}
		/******************** CvgElgbltyRqst_Provider ********************************************************************************/
		if(coverageeligibilityrequest.hasProvider()) {
			c.setCvgElgbltyRqstProvider(String.valueOf(coverageeligibilityrequest.getProvider()));
		}
		/******************** coverageeligibilityrequeststatus ********************************************************************************/
		org.hl7.fhir.r4.model.CoverageEligibilityRequest.EligibilityRequestStatus coverageeligibilityrequeststatus = coverageeligibilityrequest.getStatus();
		c.setCvgElgbltyRqstSts(coverageeligibilityrequeststatus.toCode());

		/******************** CvgElgbltyRqst_Created ********************************************************************************/
		if(coverageeligibilityrequest.hasCreated()) {
			c.setCvgElgbltyRqstCreated(String.valueOf(coverageeligibilityrequest.getCreated()));
		}
		/******************** CvgElgbltyRqst_Pnt ********************************************************************************/
		if(coverageeligibilityrequest.hasPatient()) {
			c.setCvgElgbltyRqstPnt(String.valueOf(coverageeligibilityrequest.getPatient()));
		}
		/******************** CvgElgbltyRqst_Insurer ********************************************************************************/
		if(coverageeligibilityrequest.hasInsurer()) {
			c.setCvgElgbltyRqstInsurer(String.valueOf(coverageeligibilityrequest.getInsurer()));
		}
		/******************** coverageeligibilityrequestidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier coverageeligibilityrequestidentifier = coverageeligibilityrequest.getIdentifierFirstRep();

		/******************** CvgElgbltyRqst_Id_Vl ********************************************************************************/
		if(coverageeligibilityrequestidentifier.hasValue()) {
			c.setCvgElgbltyRqstIdVl(String.valueOf(coverageeligibilityrequestidentifier.getValue()));
		}
		/******************** coverageeligibilityrequestidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityrequestidentifiertype = coverageeligibilityrequestidentifier.getType();

		/******************** coverageeligibilityrequestidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageeligibilityrequestidentifiertypecoding = coverageeligibilityrequestidentifiertype.getCodingFirstRep();

		/******************** CvgElgbltyRqst_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(coverageeligibilityrequestidentifiertypecoding.hasDisplay()) {
			c.setCvgElgbltyRqstIdTypCdgDsply(String.valueOf(coverageeligibilityrequestidentifiertypecoding.getDisplay()));
		}
		/******************** CvgElgbltyRqst_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(coverageeligibilityrequestidentifiertypecoding.hasVersion()) {
			c.setCvgElgbltyRqstIdTypCdgVrsn(String.valueOf(coverageeligibilityrequestidentifiertypecoding.getVersion()));
		}
		/******************** CvgElgbltyRqst_Id_Typ_Cdg_Cd ********************************************************************************/
		if(coverageeligibilityrequestidentifiertypecoding.hasCode()) {
			c.setCvgElgbltyRqstIdTypCdgCd(String.valueOf(coverageeligibilityrequestidentifiertypecoding.getCode()));
		}
		/******************** CvgElgbltyRqst_Id_Typ_Cdg_Sys ********************************************************************************/
		if(coverageeligibilityrequestidentifiertypecoding.hasSystem()) {
			c.setCvgElgbltyRqstIdTypCdgSys(String.valueOf(coverageeligibilityrequestidentifiertypecoding.getSystem()));
		}
		/******************** CvgElgbltyRqst_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(coverageeligibilityrequestidentifiertypecoding.hasUserSelected()) {
			c.setCvgElgbltyRqstIdTypCdgUsrSltd(String.valueOf(coverageeligibilityrequestidentifiertypecoding.getUserSelected()));
		}
		/******************** CvgElgbltyRqst_Id_Typ_Txt ********************************************************************************/
		if(coverageeligibilityrequestidentifiertype.hasText()) {
			c.setCvgElgbltyRqstIdTypTxt(String.valueOf(coverageeligibilityrequestidentifiertype.getText()));
		}
		/******************** CvgElgbltyRqst_Id_Sys ********************************************************************************/
		if(coverageeligibilityrequestidentifier.hasSystem()) {
			c.setCvgElgbltyRqstIdSys(String.valueOf(coverageeligibilityrequestidentifier.getSystem()));
		}
		/******************** CvgElgbltyRqst_Id_Assigner ********************************************************************************/
		if(coverageeligibilityrequestidentifier.hasAssigner()) {
			c.setCvgElgbltyRqstIdAssigner(String.valueOf(coverageeligibilityrequestidentifier.getAssigner()));
		}
		/******************** coverageeligibilityrequestidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period coverageeligibilityrequestidentifierperiod = coverageeligibilityrequestidentifier.getPeriod();

		/******************** CvgElgbltyRqst_Id_Prd_End ********************************************************************************/
		if(coverageeligibilityrequestidentifierperiod.hasEnd()) {
			c.setCvgElgbltyRqstIdPrdEnd(String.valueOf(coverageeligibilityrequestidentifierperiod.getEnd()));
		}
		/******************** CvgElgbltyRqst_Id_Prd_Strt ********************************************************************************/
		if(coverageeligibilityrequestidentifierperiod.hasStart()) {
			c.setCvgElgbltyRqstIdPrdStrt(String.valueOf(coverageeligibilityrequestidentifierperiod.getStart()));
		}
		/******************** coverageeligibilityrequestidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse coverageeligibilityrequestidentifieruse = coverageeligibilityrequestidentifier.getUse();
		c.setCvgElgbltyRqstIdUse(coverageeligibilityrequestidentifieruse.toCode());

		/******************** coverageeligibilityrequestservicedperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period coverageeligibilityrequestservicedperiod = coverageeligibilityrequest.getServicedPeriod();

		/******************** CvgElgbltyRqst_SrvdPrd_End ********************************************************************************/
		if(coverageeligibilityrequestservicedperiod.hasEnd()) {
			c.setCvgElgbltyRqstSrvdPrdEnd(String.valueOf(coverageeligibilityrequestservicedperiod.getEnd()));
		}
		/******************** CvgElgbltyRqst_SrvdPrd_Strt ********************************************************************************/
		if(coverageeligibilityrequestservicedperiod.hasStart()) {
			c.setCvgElgbltyRqstSrvdPrdStrt(String.valueOf(coverageeligibilityrequestservicedperiod.getStart()));
		}
		/******************** CvgElgbltyRqst_Enterer ********************************************************************************/
		if(coverageeligibilityrequest.hasEnterer()) {
			c.setCvgElgbltyRqstEnterer(String.valueOf(coverageeligibilityrequest.getEnterer()));
		}
		/******************** CvgElgbltyRqst_Facility ********************************************************************************/
		if(coverageeligibilityrequest.hasFacility()) {
			c.setCvgElgbltyRqstFacility(String.valueOf(coverageeligibilityrequest.getFacility()));
		}
		/******************** coverageeligibilityrequestitem ********************************************************************************/
		org.hl7.fhir.r4.model.CoverageEligibilityRequest.DetailsComponent coverageeligibilityrequestitem = coverageeligibilityrequest.getItemFirstRep();

		/******************** CvgElgbltyRqst_Itm_Provider ********************************************************************************/
		if(coverageeligibilityrequestitem.hasProvider()) {
			c.setCvgElgbltyRqstItmProvider(String.valueOf(coverageeligibilityrequestitem.getProvider()));
		}
		/******************** CvgElgbltyRqst_Itm_Dtl ********************************************************************************/
		if(coverageeligibilityrequestitem.hasDetail()) {
			c.setCvgElgbltyRqstItmDtl(String.valueOf(coverageeligibilityrequestitem.getDetailFirstRep()));
		}
		/******************** coverageeligibilityrequestitemcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityrequestitemcategory = coverageeligibilityrequestitem.getCategory();

		/******************** coverageeligibilityrequestitemcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageeligibilityrequestitemcategorycoding = coverageeligibilityrequestitemcategory.getCodingFirstRep();

		/******************** CvgElgbltyRqst_Itm_Ctgry_Cdg_Dsply ********************************************************************************/
		if(coverageeligibilityrequestitemcategorycoding.hasDisplay()) {
			c.setCvgElgbltyRqstItmCtgryCdgDsply(String.valueOf(coverageeligibilityrequestitemcategorycoding.getDisplay()));
		}
		/******************** CvgElgbltyRqst_Itm_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(coverageeligibilityrequestitemcategorycoding.hasVersion()) {
			c.setCvgElgbltyRqstItmCtgryCdgVrsn(String.valueOf(coverageeligibilityrequestitemcategorycoding.getVersion()));
		}
		/******************** CvgElgbltyRqst_Itm_Ctgry_Cdg_Cd ********************************************************************************/
		if(coverageeligibilityrequestitemcategorycoding.hasCode()) {
			c.setCvgElgbltyRqstItmCtgryCdgCd(String.valueOf(coverageeligibilityrequestitemcategorycoding.getCode()));
		}
		/******************** CvgElgbltyRqst_Itm_Ctgry_Cdg_Sys ********************************************************************************/
		if(coverageeligibilityrequestitemcategorycoding.hasSystem()) {
			c.setCvgElgbltyRqstItmCtgryCdgSys(String.valueOf(coverageeligibilityrequestitemcategorycoding.getSystem()));
		}
		/******************** CvgElgbltyRqst_Itm_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(coverageeligibilityrequestitemcategorycoding.hasUserSelected()) {
			c.setCvgElgbltyRqstItmCtgryCdgUsrSltd(String.valueOf(coverageeligibilityrequestitemcategorycoding.getUserSelected()));
		}
		/******************** CvgElgbltyRqst_Itm_Ctgry_Txt ********************************************************************************/
		if(coverageeligibilityrequestitemcategory.hasText()) {
			c.setCvgElgbltyRqstItmCtgryTxt(String.valueOf(coverageeligibilityrequestitemcategory.getText()));
		}
		/******************** coverageeligibilityrequestitemdiagnosis ********************************************************************************/
		org.hl7.fhir.r4.model.CoverageEligibilityRequest.DiagnosisComponent coverageeligibilityrequestitemdiagnosis = coverageeligibilityrequestitem.getDiagnosisFirstRep();

		/******************** coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconcept = coverageeligibilityrequestitemdiagnosis.getDiagnosisCodeableConcept();

		/******************** coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcoding = coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconcept.getCodingFirstRep();

		/******************** CvgElgbltyRqst_Itm_Dgnsis_DgnsisCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcoding.hasDisplay()) {
			c.setCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgDsply(String.valueOf(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcoding.getDisplay()));
		}
		/******************** CvgElgbltyRqst_Itm_Dgnsis_DgnsisCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcoding.hasVersion()) {
			c.setCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgVrsn(String.valueOf(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcoding.getVersion()));
		}
		/******************** CvgElgbltyRqst_Itm_Dgnsis_DgnsisCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcoding.hasCode()) {
			c.setCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgCd(String.valueOf(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcoding.getCode()));
		}
		/******************** CvgElgbltyRqst_Itm_Dgnsis_DgnsisCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcoding.hasSystem()) {
			c.setCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgSys(String.valueOf(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcoding.getSystem()));
		}
		/******************** CvgElgbltyRqst_Itm_Dgnsis_DgnsisCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcoding.hasUserSelected()) {
			c.setCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptCdgUsrSltd(String.valueOf(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconceptcoding.getUserSelected()));
		}
		/******************** CvgElgbltyRqst_Itm_Dgnsis_DgnsisCdbleCncpt_Txt ********************************************************************************/
		if(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconcept.hasText()) {
			c.setCvgElgbltyRqstItmDgnsisDgnsisCdbleCncptTxt(String.valueOf(coverageeligibilityrequestitemdiagnosisdiagnosiscodeableconcept.getText()));
		}
		/******************** coverageeligibilityrequestitemproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityrequestitemproductorservice = coverageeligibilityrequestitem.getProductOrService();

		/******************** coverageeligibilityrequestitemproductorservicecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageeligibilityrequestitemproductorservicecoding = coverageeligibilityrequestitemproductorservice.getCodingFirstRep();

		/******************** CvgElgbltyRqst_Itm_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(coverageeligibilityrequestitemproductorservicecoding.hasDisplay()) {
			c.setCvgElgbltyRqstItmPrdctOrSrvCdgDsply(String.valueOf(coverageeligibilityrequestitemproductorservicecoding.getDisplay()));
		}
		/******************** CvgElgbltyRqst_Itm_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(coverageeligibilityrequestitemproductorservicecoding.hasVersion()) {
			c.setCvgElgbltyRqstItmPrdctOrSrvCdgVrsn(String.valueOf(coverageeligibilityrequestitemproductorservicecoding.getVersion()));
		}
		/******************** CvgElgbltyRqst_Itm_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(coverageeligibilityrequestitemproductorservicecoding.hasCode()) {
			c.setCvgElgbltyRqstItmPrdctOrSrvCdgCd(String.valueOf(coverageeligibilityrequestitemproductorservicecoding.getCode()));
		}
		/******************** CvgElgbltyRqst_Itm_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(coverageeligibilityrequestitemproductorservicecoding.hasSystem()) {
			c.setCvgElgbltyRqstItmPrdctOrSrvCdgSys(String.valueOf(coverageeligibilityrequestitemproductorservicecoding.getSystem()));
		}
		/******************** CvgElgbltyRqst_Itm_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(coverageeligibilityrequestitemproductorservicecoding.hasUserSelected()) {
			c.setCvgElgbltyRqstItmPrdctOrSrvCdgUsrSltd(String.valueOf(coverageeligibilityrequestitemproductorservicecoding.getUserSelected()));
		}
		/******************** CvgElgbltyRqst_Itm_PrdctOrSrv_Txt ********************************************************************************/
		if(coverageeligibilityrequestitemproductorservice.hasText()) {
			c.setCvgElgbltyRqstItmPrdctOrSrvTxt(String.valueOf(coverageeligibilityrequestitemproductorservice.getText()));
		}
		/******************** coverageeligibilityrequestitemmodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept coverageeligibilityrequestitemmodifier = coverageeligibilityrequestitem.getModifierFirstRep();

		/******************** coverageeligibilityrequestitemmodifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding coverageeligibilityrequestitemmodifiercoding = coverageeligibilityrequestitemmodifier.getCodingFirstRep();

		/******************** CvgElgbltyRqst_Itm_Mdfr_Cdg_Dsply ********************************************************************************/
		if(coverageeligibilityrequestitemmodifiercoding.hasDisplay()) {
			c.setCvgElgbltyRqstItmMdfrCdgDsply(String.valueOf(coverageeligibilityrequestitemmodifiercoding.getDisplay()));
		}
		/******************** CvgElgbltyRqst_Itm_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(coverageeligibilityrequestitemmodifiercoding.hasVersion()) {
			c.setCvgElgbltyRqstItmMdfrCdgVrsn(String.valueOf(coverageeligibilityrequestitemmodifiercoding.getVersion()));
		}
		/******************** CvgElgbltyRqst_Itm_Mdfr_Cdg_Cd ********************************************************************************/
		if(coverageeligibilityrequestitemmodifiercoding.hasCode()) {
			c.setCvgElgbltyRqstItmMdfrCdgCd(String.valueOf(coverageeligibilityrequestitemmodifiercoding.getCode()));
		}
		/******************** CvgElgbltyRqst_Itm_Mdfr_Cdg_Sys ********************************************************************************/
		if(coverageeligibilityrequestitemmodifiercoding.hasSystem()) {
			c.setCvgElgbltyRqstItmMdfrCdgSys(String.valueOf(coverageeligibilityrequestitemmodifiercoding.getSystem()));
		}
		/******************** CvgElgbltyRqst_Itm_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(coverageeligibilityrequestitemmodifiercoding.hasUserSelected()) {
			c.setCvgElgbltyRqstItmMdfrCdgUsrSltd(String.valueOf(coverageeligibilityrequestitemmodifiercoding.getUserSelected()));
		}
		/******************** CvgElgbltyRqst_Itm_Mdfr_Txt ********************************************************************************/
		if(coverageeligibilityrequestitemmodifier.hasText()) {
			c.setCvgElgbltyRqstItmMdfrTxt(String.valueOf(coverageeligibilityrequestitemmodifier.getText()));
		}
		/******************** coverageeligibilityrequestitemunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money coverageeligibilityrequestitemunitprice = coverageeligibilityrequestitem.getUnitPrice();

		/******************** CvgElgbltyRqst_Itm_UntPrice_Vl ********************************************************************************/
		if(coverageeligibilityrequestitemunitprice.hasValue()) {
			c.setCvgElgbltyRqstItmUntPriceVl(String.valueOf(coverageeligibilityrequestitemunitprice.getValue()));
		}
		/******************** CvgElgbltyRqst_Itm_UntPrice_Crncy ********************************************************************************/
		if(coverageeligibilityrequestitemunitprice.hasCurrency()) {
			c.setCvgElgbltyRqstItmUntPriceCrncy(String.valueOf(coverageeligibilityrequestitemunitprice.getCurrency()));
		}
		/******************** coverageeligibilityrequestitemquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity coverageeligibilityrequestitemquantity = coverageeligibilityrequestitem.getQuantity();

		/******************** CvgElgbltyRqst_Itm_Qnty_Vl ********************************************************************************/
		if(coverageeligibilityrequestitemquantity.hasValue()) {
			c.setCvgElgbltyRqstItmQntyVl(String.valueOf(coverageeligibilityrequestitemquantity.getValue()));
		}
		/******************** coverageeligibilityrequestitemquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator coverageeligibilityrequestitemquantitycomparator = coverageeligibilityrequestitemquantity.getComparator();
		c.setCvgElgbltyRqstItmQntyCmprtr(coverageeligibilityrequestitemquantitycomparator.toCode());

		/******************** CvgElgbltyRqst_Itm_Qnty_Cd ********************************************************************************/
		if(coverageeligibilityrequestitemquantity.hasCode()) {
			c.setCvgElgbltyRqstItmQntyCd(String.valueOf(coverageeligibilityrequestitemquantity.getCode()));
		}
		/******************** CvgElgbltyRqst_Itm_Qnty_Sys ********************************************************************************/
		if(coverageeligibilityrequestitemquantity.hasSystem()) {
			c.setCvgElgbltyRqstItmQntySys(String.valueOf(coverageeligibilityrequestitemquantity.getSystem()));
		}
		/******************** CvgElgbltyRqst_Itm_Qnty_Unt ********************************************************************************/
		if(coverageeligibilityrequestitemquantity.hasUnit()) {
			c.setCvgElgbltyRqstItmQntyUnt(String.valueOf(coverageeligibilityrequestitemquantity.getUnit()));
		}
		/******************** CvgElgbltyRqst_Itm_Facility ********************************************************************************/
		if(coverageeligibilityrequestitem.hasFacility()) {
			c.setCvgElgbltyRqstItmFacility(String.valueOf(coverageeligibilityrequestitem.getFacility()));
		}
		/******************** CvgElgbltyRqst_SrvdDtTyp ********************************************************************************/
		if(coverageeligibilityrequest.hasServicedDateType()) {
			c.setCvgElgbltyRqstSrvdDtTyp(String.valueOf(coverageeligibilityrequest.getServicedDateType()));
		}
		/******************** coverageeligibilityrequestinsurance ********************************************************************************/
		org.hl7.fhir.r4.model.CoverageEligibilityRequest.InsuranceComponent coverageeligibilityrequestinsurance = coverageeligibilityrequest.getInsuranceFirstRep();

		/******************** CvgElgbltyRqst_Insrnc_Cvg ********************************************************************************/
		if(coverageeligibilityrequestinsurance.hasCoverage()) {
			c.setCvgElgbltyRqstInsrncCvg(String.valueOf(coverageeligibilityrequestinsurance.getCoverage()));
		}
		/******************** CvgElgbltyRqst_Insrnc_BusinessArrangement ********************************************************************************/
		if(coverageeligibilityrequestinsurance.hasBusinessArrangement()) {
			c.setCvgElgbltyRqstInsrncBusinessArrangement(String.valueOf(coverageeligibilityrequestinsurance.getBusinessArrangement()));
		}
		/******************** CvgElgbltyRqst_Insrnc_Focal ********************************************************************************/
		if(coverageeligibilityrequestinsurance.hasFocal()) {
			c.setCvgElgbltyRqstInsrncFocal(String.valueOf(coverageeligibilityrequestinsurance.getFocal()));
		}
		/******************** coverageeligibilityrequestsupportinginfo ********************************************************************************/
		org.hl7.fhir.r4.model.CoverageEligibilityRequest.SupportingInformationComponent coverageeligibilityrequestsupportinginfo = coverageeligibilityrequest.getSupportingInfoFirstRep();

		/******************** CvgElgbltyRqst_SprtingInfo_Info ********************************************************************************/
		if(coverageeligibilityrequestsupportinginfo.hasInformation()) {
			c.setCvgElgbltyRqstSprtingInfoInfo(String.valueOf(coverageeligibilityrequestsupportinginfo.getInformation()));
		}
		/******************** CvgElgbltyRqst_SprtingInfo_AppliesToAll ********************************************************************************/
		if(coverageeligibilityrequestsupportinginfo.hasAppliesToAll()) {
			c.setCvgElgbltyRqstSprtingInfoAppliesToAll(String.valueOf(coverageeligibilityrequestsupportinginfo.getAppliesToAll()));
		}
		/******************** CvgElgbltyRqst_SprtingInfo_Sqnc ********************************************************************************/
		if(coverageeligibilityrequestsupportinginfo.hasSequence()) {
			c.setCvgElgbltyRqstSprtingInfoSqnc(String.valueOf(coverageeligibilityrequestsupportinginfo.getSequence()));
		}
		return c;
	}
}
