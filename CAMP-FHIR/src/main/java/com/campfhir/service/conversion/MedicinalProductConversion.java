package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProduct;
public class MedicinalProductConversion 
{
	public org.hl7.fhir.r4.model.MedicinalProduct MedicinalProducts(MedicinalProduct m) throws ParseException
	{
		org.hl7.fhir.r4.model.MedicinalProduct medicinalproduct = new org.hl7.fhir.r4.model.MedicinalProduct();

		/******************** id ********************************************************************************/
		medicinalproduct.setId(m.getId());

		/******************** medicinalproductadditionalmonitoringindicator ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductadditionalmonitoringindicator =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproduct.setAdditionalMonitoringIndicator(medicinalproductadditionalmonitoringindicator);

		/******************** medicinalproductadditionalmonitoringindicatorcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductadditionalmonitoringindicatorcoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductadditionalmonitoringindicator.addCoding(medicinalproductadditionalmonitoringindicatorcoding);

		/******************** MdcnlPrdct_AddtnlMonitoringIndicator_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctAddtnlMonitoringIndicatorCdgCd() != null) {
			medicinalproductadditionalmonitoringindicatorcoding.setCode(m.getMdcnlPrdctAddtnlMonitoringIndicatorCdgCd());
		}
		/******************** MdcnlPrdct_AddtnlMonitoringIndicator_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctAddtnlMonitoringIndicatorCdgDsply() != null) {
			medicinalproductadditionalmonitoringindicatorcoding.setDisplay(m.getMdcnlPrdctAddtnlMonitoringIndicatorCdgDsply());
		}
		/******************** MdcnlPrdct_AddtnlMonitoringIndicator_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctAddtnlMonitoringIndicatorCdgSys() != null) {
			medicinalproductadditionalmonitoringindicatorcoding.setSystem(m.getMdcnlPrdctAddtnlMonitoringIndicatorCdgSys());
		}
		/******************** MdcnlPrdct_AddtnlMonitoringIndicator_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctAddtnlMonitoringIndicatorCdgUsrSltd() != null) {
			medicinalproductadditionalmonitoringindicatorcoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctAddtnlMonitoringIndicatorCdgUsrSltd()));
		}
		/******************** MdcnlPrdct_AddtnlMonitoringIndicator_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctAddtnlMonitoringIndicatorCdgVrsn() != null) {
			medicinalproductadditionalmonitoringindicatorcoding.setVersion(m.getMdcnlPrdctAddtnlMonitoringIndicatorCdgVrsn());
		}
		/******************** MdcnlPrdct_AddtnlMonitoringIndicator_Txt ********************************************************************************/
		if(m.getMdcnlPrdctAddtnlMonitoringIndicatorTxt() != null) {
			medicinalproductadditionalmonitoringindicator.setText(m.getMdcnlPrdctAddtnlMonitoringIndicatorTxt());
		}
		/******************** MdcnlPrdct_AttachedDoc ********************************************************************************/
		if(m.getMdcnlPrdctAttachedDoc() != null) {
			medicinalproduct.addAttachedDocument( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctAttachedDoc()));
		}
		/******************** MdcnlPrdct_ClnclTrial ********************************************************************************/
		if(m.getMdcnlPrdctClnclTrial() != null) {
			medicinalproduct.addClinicalTrial( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctClnclTrial()));
		}
		/******************** medicinalproductcombinedpharmaceuticaldoseform ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductcombinedpharmaceuticaldoseform =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproduct.setCombinedPharmaceuticalDoseForm(medicinalproductcombinedpharmaceuticaldoseform);

		/******************** medicinalproductcombinedpharmaceuticaldoseformcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductcombinedpharmaceuticaldoseformcoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductcombinedpharmaceuticaldoseform.addCoding(medicinalproductcombinedpharmaceuticaldoseformcoding);

		/******************** MdcnlPrdct_CombinedPhrmctclDoseFrm_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctCombinedPhrmctclDoseFrmCdgCd() != null) {
			medicinalproductcombinedpharmaceuticaldoseformcoding.setCode(m.getMdcnlPrdctCombinedPhrmctclDoseFrmCdgCd());
		}
		/******************** MdcnlPrdct_CombinedPhrmctclDoseFrm_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctCombinedPhrmctclDoseFrmCdgDsply() != null) {
			medicinalproductcombinedpharmaceuticaldoseformcoding.setDisplay(m.getMdcnlPrdctCombinedPhrmctclDoseFrmCdgDsply());
		}
		/******************** MdcnlPrdct_CombinedPhrmctclDoseFrm_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctCombinedPhrmctclDoseFrmCdgSys() != null) {
			medicinalproductcombinedpharmaceuticaldoseformcoding.setSystem(m.getMdcnlPrdctCombinedPhrmctclDoseFrmCdgSys());
		}
		/******************** MdcnlPrdct_CombinedPhrmctclDoseFrm_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctCombinedPhrmctclDoseFrmCdgUsrSltd() != null) {
			medicinalproductcombinedpharmaceuticaldoseformcoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctCombinedPhrmctclDoseFrmCdgUsrSltd()));
		}
		/******************** MdcnlPrdct_CombinedPhrmctclDoseFrm_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctCombinedPhrmctclDoseFrmCdgVrsn() != null) {
			medicinalproductcombinedpharmaceuticaldoseformcoding.setVersion(m.getMdcnlPrdctCombinedPhrmctclDoseFrmCdgVrsn());
		}
		/******************** MdcnlPrdct_CombinedPhrmctclDoseFrm_Txt ********************************************************************************/
		if(m.getMdcnlPrdctCombinedPhrmctclDoseFrmTxt() != null) {
			medicinalproductcombinedpharmaceuticaldoseform.setText(m.getMdcnlPrdctCombinedPhrmctclDoseFrmTxt());
		}
		/******************** MdcnlPrdct_Cntct ********************************************************************************/
		if(m.getMdcnlPrdctCntct() != null) {
			medicinalproduct.addContact( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctCntct()));
		}
		/******************** medicinalproductcrossreference ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicinalproductcrossreference =  new org.hl7.fhir.r4.model.Identifier();
		medicinalproduct.addCrossReference(medicinalproductcrossreference);

		/******************** MdcnlPrdct_CrossRfrnc_Assigner ********************************************************************************/
		if(m.getMdcnlPrdctCrossRfrncAssigner() != null) {
			medicinalproductcrossreference.setAssigner( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctCrossRfrncAssigner()));
		}
		/******************** medicinalproductcrossreferenceperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductcrossreferenceperiod =  new org.hl7.fhir.r4.model.Period();
		medicinalproductcrossreference.setPeriod(medicinalproductcrossreferenceperiod);

		/******************** MdcnlPrdct_CrossRfrnc_Prd_End ********************************************************************************/
		if(m.getMdcnlPrdctCrossRfrncPrdEnd() != null) {
			java.text.SimpleDateFormat MdcnlPrdct_CrossRfrnc_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdct_CrossRfrnc_Prd_Enddate = MdcnlPrdct_CrossRfrnc_Prd_Endsdf.parse(m.getMdcnlPrdctCrossRfrncPrdEnd());
			medicinalproductcrossreferenceperiod.setEnd(MdcnlPrdct_CrossRfrnc_Prd_Enddate);
		}
		/******************** MdcnlPrdct_CrossRfrnc_Prd_Strt ********************************************************************************/
		if(m.getMdcnlPrdctCrossRfrncPrdStrt() != null) {
			java.text.SimpleDateFormat MdcnlPrdct_CrossRfrnc_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdct_CrossRfrnc_Prd_Strtdate = MdcnlPrdct_CrossRfrnc_Prd_Strtsdf.parse(m.getMdcnlPrdctCrossRfrncPrdStrt());
			medicinalproductcrossreferenceperiod.setStart(MdcnlPrdct_CrossRfrnc_Prd_Strtdate);
		}
		/******************** MdcnlPrdct_CrossRfrnc_Sys ********************************************************************************/
		if(m.getMdcnlPrdctCrossRfrncSys() != null) {
			medicinalproductcrossreference.setSystem(m.getMdcnlPrdctCrossRfrncSys());
		}
		/******************** medicinalproductcrossreferencetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductcrossreferencetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductcrossreference.setType(medicinalproductcrossreferencetype);

		/******************** medicinalproductcrossreferencetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductcrossreferencetypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductcrossreferencetype.addCoding(medicinalproductcrossreferencetypecoding);

		/******************** MdcnlPrdct_CrossRfrnc_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctCrossRfrncTypCdgCd() != null) {
			medicinalproductcrossreferencetypecoding.setCode(m.getMdcnlPrdctCrossRfrncTypCdgCd());
		}
		/******************** MdcnlPrdct_CrossRfrnc_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctCrossRfrncTypCdgDsply() != null) {
			medicinalproductcrossreferencetypecoding.setDisplay(m.getMdcnlPrdctCrossRfrncTypCdgDsply());
		}
		/******************** MdcnlPrdct_CrossRfrnc_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctCrossRfrncTypCdgSys() != null) {
			medicinalproductcrossreferencetypecoding.setSystem(m.getMdcnlPrdctCrossRfrncTypCdgSys());
		}
		/******************** MdcnlPrdct_CrossRfrnc_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctCrossRfrncTypCdgUsrSltd() != null) {
			medicinalproductcrossreferencetypecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctCrossRfrncTypCdgUsrSltd()));
		}
		/******************** MdcnlPrdct_CrossRfrnc_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctCrossRfrncTypCdgVrsn() != null) {
			medicinalproductcrossreferencetypecoding.setVersion(m.getMdcnlPrdctCrossRfrncTypCdgVrsn());
		}
		/******************** MdcnlPrdct_CrossRfrnc_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctCrossRfrncTypTxt() != null) {
			medicinalproductcrossreferencetype.setText(m.getMdcnlPrdctCrossRfrncTypTxt());
		}
		/******************** medicinalproductcrossreferenceuse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory medicinalproductcrossreferenceuse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		medicinalproductcrossreference.setUse(medicinalproductcrossreferenceuse.fromCode(m.getMdcnlPrdctCrossRfrncUse()));

		/******************** MdcnlPrdct_CrossRfrnc_Vl ********************************************************************************/
		if(m.getMdcnlPrdctCrossRfrncVl() != null) {
			medicinalproductcrossreference.setValue(m.getMdcnlPrdctCrossRfrncVl());
		}
		/******************** medicinalproductdomain ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductdomain =  new org.hl7.fhir.r4.model.Coding();
		medicinalproduct.setDomain(medicinalproductdomain);

		/******************** MdcnlPrdct_Domain_Cd ********************************************************************************/
		if(m.getMdcnlPrdctDomainCd() != null) {
			medicinalproductdomain.setCode(m.getMdcnlPrdctDomainCd());
		}
		/******************** MdcnlPrdct_Domain_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctDomainDsply() != null) {
			medicinalproductdomain.setDisplay(m.getMdcnlPrdctDomainDsply());
		}
		/******************** MdcnlPrdct_Domain_Sys ********************************************************************************/
		if(m.getMdcnlPrdctDomainSys() != null) {
			medicinalproductdomain.setSystem(m.getMdcnlPrdctDomainSys());
		}
		/******************** MdcnlPrdct_Domain_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctDomainUsrSltd() != null) {
			medicinalproductdomain.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctDomainUsrSltd()));
		}
		/******************** MdcnlPrdct_Domain_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctDomainVrsn() != null) {
			medicinalproductdomain.setVersion(m.getMdcnlPrdctDomainVrsn());
		}
		/******************** medicinalproductidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicinalproductidentifier =  new org.hl7.fhir.r4.model.Identifier();
		medicinalproduct.addIdentifier(medicinalproductidentifier);

		/******************** MdcnlPrdct_Id_Assigner ********************************************************************************/
		if(m.getMdcnlPrdctIdAssigner() != null) {
			medicinalproductidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctIdAssigner()));
		}
		/******************** medicinalproductidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		medicinalproductidentifier.setPeriod(medicinalproductidentifierperiod);

		/******************** MdcnlPrdct_Id_Prd_End ********************************************************************************/
		if(m.getMdcnlPrdctIdPrdEnd() != null) {
			java.text.SimpleDateFormat MdcnlPrdct_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdct_Id_Prd_Enddate = MdcnlPrdct_Id_Prd_Endsdf.parse(m.getMdcnlPrdctIdPrdEnd());
			medicinalproductidentifierperiod.setEnd(MdcnlPrdct_Id_Prd_Enddate);
		}
		/******************** MdcnlPrdct_Id_Prd_Strt ********************************************************************************/
		if(m.getMdcnlPrdctIdPrdStrt() != null) {
			java.text.SimpleDateFormat MdcnlPrdct_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdct_Id_Prd_Strtdate = MdcnlPrdct_Id_Prd_Strtsdf.parse(m.getMdcnlPrdctIdPrdStrt());
			medicinalproductidentifierperiod.setStart(MdcnlPrdct_Id_Prd_Strtdate);
		}
		/******************** MdcnlPrdct_Id_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIdSys() != null) {
			medicinalproductidentifier.setSystem(m.getMdcnlPrdctIdSys());
		}
		/******************** medicinalproductidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductidentifier.setType(medicinalproductidentifiertype);

		/******************** medicinalproductidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductidentifiertype.addCoding(medicinalproductidentifiertypecoding);

		/******************** MdcnlPrdct_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctIdTypCdgCd() != null) {
			medicinalproductidentifiertypecoding.setCode(m.getMdcnlPrdctIdTypCdgCd());
		}
		/******************** MdcnlPrdct_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctIdTypCdgDsply() != null) {
			medicinalproductidentifiertypecoding.setDisplay(m.getMdcnlPrdctIdTypCdgDsply());
		}
		/******************** MdcnlPrdct_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctIdTypCdgSys() != null) {
			medicinalproductidentifiertypecoding.setSystem(m.getMdcnlPrdctIdTypCdgSys());
		}
		/******************** MdcnlPrdct_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctIdTypCdgUsrSltd() != null) {
			medicinalproductidentifiertypecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctIdTypCdgUsrSltd()));
		}
		/******************** MdcnlPrdct_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctIdTypCdgVrsn() != null) {
			medicinalproductidentifiertypecoding.setVersion(m.getMdcnlPrdctIdTypCdgVrsn());
		}
		/******************** MdcnlPrdct_Id_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctIdTypTxt() != null) {
			medicinalproductidentifiertype.setText(m.getMdcnlPrdctIdTypTxt());
		}
		/******************** medicinalproductidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory medicinalproductidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		medicinalproductidentifier.setUse(medicinalproductidentifieruse.fromCode(m.getMdcnlPrdctIdUse()));

		/******************** MdcnlPrdct_Id_Vl ********************************************************************************/
		if(m.getMdcnlPrdctIdVl() != null) {
			medicinalproductidentifier.setValue(m.getMdcnlPrdctIdVl());
		}
		/******************** medicinalproductlegalstatusofsupply ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductlegalstatusofsupply =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproduct.setLegalStatusOfSupply(medicinalproductlegalstatusofsupply);

		/******************** medicinalproductlegalstatusofsupplycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductlegalstatusofsupplycoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductlegalstatusofsupply.addCoding(medicinalproductlegalstatusofsupplycoding);

		/******************** MdcnlPrdct_LegalStsOfSpply_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctLegalStsOfSpplyCdgCd() != null) {
			medicinalproductlegalstatusofsupplycoding.setCode(m.getMdcnlPrdctLegalStsOfSpplyCdgCd());
		}
		/******************** MdcnlPrdct_LegalStsOfSpply_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctLegalStsOfSpplyCdgDsply() != null) {
			medicinalproductlegalstatusofsupplycoding.setDisplay(m.getMdcnlPrdctLegalStsOfSpplyCdgDsply());
		}
		/******************** MdcnlPrdct_LegalStsOfSpply_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctLegalStsOfSpplyCdgSys() != null) {
			medicinalproductlegalstatusofsupplycoding.setSystem(m.getMdcnlPrdctLegalStsOfSpplyCdgSys());
		}
		/******************** MdcnlPrdct_LegalStsOfSpply_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctLegalStsOfSpplyCdgUsrSltd() != null) {
			medicinalproductlegalstatusofsupplycoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctLegalStsOfSpplyCdgUsrSltd()));
		}
		/******************** MdcnlPrdct_LegalStsOfSpply_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctLegalStsOfSpplyCdgVrsn() != null) {
			medicinalproductlegalstatusofsupplycoding.setVersion(m.getMdcnlPrdctLegalStsOfSpplyCdgVrsn());
		}
		/******************** MdcnlPrdct_LegalStsOfSpply_Txt ********************************************************************************/
		if(m.getMdcnlPrdctLegalStsOfSpplyTxt() != null) {
			medicinalproductlegalstatusofsupply.setText(m.getMdcnlPrdctLegalStsOfSpplyTxt());
		}
		/******************** medicinalproductmanufacturingbusinessoperation ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductManufacturingBusinessOperationComponent medicinalproductmanufacturingbusinessoperation =  new org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductManufacturingBusinessOperationComponent();
		medicinalproduct.addManufacturingBusinessOperation(medicinalproductmanufacturingbusinessoperation);

		/******************** medicinalproductmanufacturingbusinessoperationauthorisationreferencenumber ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicinalproductmanufacturingbusinessoperationauthorisationreferencenumber =  new org.hl7.fhir.r4.model.Identifier();
		medicinalproductmanufacturingbusinessoperation.setAuthorisationReferenceNumber(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumber);

		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Assigner ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrAssigner() != null) {
			medicinalproductmanufacturingbusinessoperationauthorisationreferencenumber.setAssigner( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrAssigner()));
		}
		/******************** medicinalproductmanufacturingbusinessoperationauthorisationreferencenumberperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductmanufacturingbusinessoperationauthorisationreferencenumberperiod =  new org.hl7.fhir.r4.model.Period();
		medicinalproductmanufacturingbusinessoperationauthorisationreferencenumber.setPeriod(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumberperiod);

		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Prd_End ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrPrdEnd() != null) {
			java.text.SimpleDateFormat MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Prd_Enddate = MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Prd_Endsdf.parse(m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrPrdEnd());
			medicinalproductmanufacturingbusinessoperationauthorisationreferencenumberperiod.setEnd(MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Prd_Enddate);
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Prd_Strt ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrPrdStrt() != null) {
			java.text.SimpleDateFormat MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Prd_Strtdate = MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Prd_Strtsdf.parse(m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrPrdStrt());
			medicinalproductmanufacturingbusinessoperationauthorisationreferencenumberperiod.setStart(MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Prd_Strtdate);
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrSys() != null) {
			medicinalproductmanufacturingbusinessoperationauthorisationreferencenumber.setSystem(m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrSys());
		}
		/******************** medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductmanufacturingbusinessoperationauthorisationreferencenumber.setType(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertype);

		/******************** medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertype.addCoding(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecoding);

		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgCd() != null) {
			medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecoding.setCode(m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgCd());
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgDsply() != null) {
			medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecoding.setDisplay(m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgDsply());
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgSys() != null) {
			medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecoding.setSystem(m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgSys());
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Typ_Cdg_US ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgUs() != null) {
			medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgUs()));
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgVrsn() != null) {
			medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecoding.setVersion(m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgVrsn());
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypTxt() != null) {
			medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertype.setText(m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypTxt());
		}
		/******************** medicinalproductmanufacturingbusinessoperationauthorisationreferencenumberuse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory medicinalproductmanufacturingbusinessoperationauthorisationreferencenumberuse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		medicinalproductmanufacturingbusinessoperationauthorisationreferencenumber.setUse(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumberuse.fromCode(m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrUse()));

		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrVl() != null) {
			medicinalproductmanufacturingbusinessoperationauthorisationreferencenumber.setValue(m.getMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrVl());
		}
		/******************** medicinalproductmanufacturingbusinessoperationconfidentialityindicator ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductmanufacturingbusinessoperationconfidentialityindicator =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductmanufacturingbusinessoperation.setConfidentialityIndicator(medicinalproductmanufacturingbusinessoperationconfidentialityindicator);

		/******************** medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductmanufacturingbusinessoperationconfidentialityindicator.addCoding(medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcoding);

		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_CnfdntltyIndctr_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgCd() != null) {
			medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcoding.setCode(m.getMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgCd());
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_CnfdntltyIndctr_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgDsply() != null) {
			medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcoding.setDisplay(m.getMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgDsply());
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_CnfdntltyIndctr_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgSys() != null) {
			medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcoding.setSystem(m.getMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgSys());
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_CnfdntltyIndctr_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgUsrSltd() != null) {
			medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgUsrSltd()));
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_CnfdntltyIndctr_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgVrsn() != null) {
			medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcoding.setVersion(m.getMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgVrsn());
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_CnfdntltyIndctr_Txt ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrTxt() != null) {
			medicinalproductmanufacturingbusinessoperationconfidentialityindicator.setText(m.getMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrTxt());
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_EfctiveDt ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnEfctiveDt() != null) {
			java.text.SimpleDateFormat MdcnlPrdct_MnfctrngBsnssOprtn_EfctiveDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdct_MnfctrngBsnssOprtn_EfctiveDtdate = MdcnlPrdct_MnfctrngBsnssOprtn_EfctiveDtsdf.parse(m.getMdcnlPrdctMnfctrngBsnssOprtnEfctiveDt());
			medicinalproductmanufacturingbusinessoperation.setEffectiveDate(MdcnlPrdct_MnfctrngBsnssOprtn_EfctiveDtdate);
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_Manufacturer ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnManufacturer() != null) {
			medicinalproductmanufacturingbusinessoperation.addManufacturer( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctMnfctrngBsnssOprtnManufacturer()));
		}
		/******************** medicinalproductmanufacturingbusinessoperationoperationtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductmanufacturingbusinessoperationoperationtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductmanufacturingbusinessoperation.setOperationType(medicinalproductmanufacturingbusinessoperationoperationtype);

		/******************** medicinalproductmanufacturingbusinessoperationoperationtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductmanufacturingbusinessoperationoperationtypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductmanufacturingbusinessoperationoperationtype.addCoding(medicinalproductmanufacturingbusinessoperationoperationtypecoding);

		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_OprtnTyp_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgCd() != null) {
			medicinalproductmanufacturingbusinessoperationoperationtypecoding.setCode(m.getMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgCd());
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_OprtnTyp_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgDsply() != null) {
			medicinalproductmanufacturingbusinessoperationoperationtypecoding.setDisplay(m.getMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgDsply());
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_OprtnTyp_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgSys() != null) {
			medicinalproductmanufacturingbusinessoperationoperationtypecoding.setSystem(m.getMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgSys());
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_OprtnTyp_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgUsrSltd() != null) {
			medicinalproductmanufacturingbusinessoperationoperationtypecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgUsrSltd()));
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_OprtnTyp_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgVrsn() != null) {
			medicinalproductmanufacturingbusinessoperationoperationtypecoding.setVersion(m.getMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgVrsn());
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_OprtnTyp_Txt ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnOprtnTypTxt() != null) {
			medicinalproductmanufacturingbusinessoperationoperationtype.setText(m.getMdcnlPrdctMnfctrngBsnssOprtnOprtnTypTxt());
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_Regulator ********************************************************************************/
		if(m.getMdcnlPrdctMnfctrngBsnssOprtnRegulator() != null) {
			medicinalproductmanufacturingbusinessoperation.setRegulator( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctMnfctrngBsnssOprtnRegulator()));
		}
		/******************** medicinalproductmarketingstatus ********************************************************************************/
		org.hl7.fhir.r4.model.MarketingStatus medicinalproductmarketingstatus =  new org.hl7.fhir.r4.model.MarketingStatus();
		medicinalproduct.addMarketingStatus(medicinalproductmarketingstatus);

		/******************** medicinalproductmarketingstatuscountry ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductmarketingstatuscountry =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductmarketingstatus.setCountry(medicinalproductmarketingstatuscountry);

		/******************** medicinalproductmarketingstatuscountrycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductmarketingstatuscountrycoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductmarketingstatuscountry.addCoding(medicinalproductmarketingstatuscountrycoding);

		/******************** MdcnlPrdct_MarketingSts_Cntry_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsCntryCdgCd() != null) {
			medicinalproductmarketingstatuscountrycoding.setCode(m.getMdcnlPrdctMarketingStsCntryCdgCd());
		}
		/******************** MdcnlPrdct_MarketingSts_Cntry_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsCntryCdgDsply() != null) {
			medicinalproductmarketingstatuscountrycoding.setDisplay(m.getMdcnlPrdctMarketingStsCntryCdgDsply());
		}
		/******************** MdcnlPrdct_MarketingSts_Cntry_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsCntryCdgSys() != null) {
			medicinalproductmarketingstatuscountrycoding.setSystem(m.getMdcnlPrdctMarketingStsCntryCdgSys());
		}
		/******************** MdcnlPrdct_MarketingSts_Cntry_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsCntryCdgUsrSltd() != null) {
			medicinalproductmarketingstatuscountrycoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctMarketingStsCntryCdgUsrSltd()));
		}
		/******************** MdcnlPrdct_MarketingSts_Cntry_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsCntryCdgVrsn() != null) {
			medicinalproductmarketingstatuscountrycoding.setVersion(m.getMdcnlPrdctMarketingStsCntryCdgVrsn());
		}
		/******************** MdcnlPrdct_MarketingSts_Cntry_Txt ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsCntryTxt() != null) {
			medicinalproductmarketingstatuscountry.setText(m.getMdcnlPrdctMarketingStsCntryTxt());
		}
		/******************** medicinalproductmarketingstatusdaterange ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductmarketingstatusdaterange =  new org.hl7.fhir.r4.model.Period();
		medicinalproductmarketingstatus.setDateRange(medicinalproductmarketingstatusdaterange);

		/******************** MdcnlPrdct_MarketingSts_DtRng_End ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsDtRngEnd() != null) {
			java.text.SimpleDateFormat MdcnlPrdct_MarketingSts_DtRng_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdct_MarketingSts_DtRng_Enddate = MdcnlPrdct_MarketingSts_DtRng_Endsdf.parse(m.getMdcnlPrdctMarketingStsDtRngEnd());
			medicinalproductmarketingstatusdaterange.setEnd(MdcnlPrdct_MarketingSts_DtRng_Enddate);
		}
		/******************** MdcnlPrdct_MarketingSts_DtRng_Strt ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsDtRngStrt() != null) {
			java.text.SimpleDateFormat MdcnlPrdct_MarketingSts_DtRng_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdct_MarketingSts_DtRng_Strtdate = MdcnlPrdct_MarketingSts_DtRng_Strtsdf.parse(m.getMdcnlPrdctMarketingStsDtRngStrt());
			medicinalproductmarketingstatusdaterange.setStart(MdcnlPrdct_MarketingSts_DtRng_Strtdate);
		}
		/******************** medicinalproductmarketingstatusjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductmarketingstatusjurisdiction =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductmarketingstatus.setJurisdiction(medicinalproductmarketingstatusjurisdiction);

		/******************** medicinalproductmarketingstatusjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductmarketingstatusjurisdictioncoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductmarketingstatusjurisdiction.addCoding(medicinalproductmarketingstatusjurisdictioncoding);

		/******************** MdcnlPrdct_MarketingSts_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsJrsdctnCdgCd() != null) {
			medicinalproductmarketingstatusjurisdictioncoding.setCode(m.getMdcnlPrdctMarketingStsJrsdctnCdgCd());
		}
		/******************** MdcnlPrdct_MarketingSts_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsJrsdctnCdgDsply() != null) {
			medicinalproductmarketingstatusjurisdictioncoding.setDisplay(m.getMdcnlPrdctMarketingStsJrsdctnCdgDsply());
		}
		/******************** MdcnlPrdct_MarketingSts_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsJrsdctnCdgSys() != null) {
			medicinalproductmarketingstatusjurisdictioncoding.setSystem(m.getMdcnlPrdctMarketingStsJrsdctnCdgSys());
		}
		/******************** MdcnlPrdct_MarketingSts_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsJrsdctnCdgUsrSltd() != null) {
			medicinalproductmarketingstatusjurisdictioncoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctMarketingStsJrsdctnCdgUsrSltd()));
		}
		/******************** MdcnlPrdct_MarketingSts_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsJrsdctnCdgVrsn() != null) {
			medicinalproductmarketingstatusjurisdictioncoding.setVersion(m.getMdcnlPrdctMarketingStsJrsdctnCdgVrsn());
		}
		/******************** MdcnlPrdct_MarketingSts_Jrsdctn_Txt ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsJrsdctnTxt() != null) {
			medicinalproductmarketingstatusjurisdiction.setText(m.getMdcnlPrdctMarketingStsJrsdctnTxt());
		}
		/******************** MdcnlPrdct_MarketingSts_RestoreDt ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsRestoreDt() != null) {
			java.text.SimpleDateFormat MdcnlPrdct_MarketingSts_RestoreDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdct_MarketingSts_RestoreDtdate = MdcnlPrdct_MarketingSts_RestoreDtsdf.parse(m.getMdcnlPrdctMarketingStsRestoreDt());
			medicinalproductmarketingstatus.setRestoreDate(MdcnlPrdct_MarketingSts_RestoreDtdate);
		}
		/******************** medicinalproductmarketingstatusstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductmarketingstatusstatus =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductmarketingstatus.setStatus(medicinalproductmarketingstatusstatus);

		/******************** medicinalproductmarketingstatusstatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductmarketingstatusstatuscoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductmarketingstatusstatus.addCoding(medicinalproductmarketingstatusstatuscoding);

		/******************** MdcnlPrdct_MarketingSts_Sts_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsStsCdgCd() != null) {
			medicinalproductmarketingstatusstatuscoding.setCode(m.getMdcnlPrdctMarketingStsStsCdgCd());
		}
		/******************** MdcnlPrdct_MarketingSts_Sts_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsStsCdgDsply() != null) {
			medicinalproductmarketingstatusstatuscoding.setDisplay(m.getMdcnlPrdctMarketingStsStsCdgDsply());
		}
		/******************** MdcnlPrdct_MarketingSts_Sts_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsStsCdgSys() != null) {
			medicinalproductmarketingstatusstatuscoding.setSystem(m.getMdcnlPrdctMarketingStsStsCdgSys());
		}
		/******************** MdcnlPrdct_MarketingSts_Sts_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsStsCdgUsrSltd() != null) {
			medicinalproductmarketingstatusstatuscoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctMarketingStsStsCdgUsrSltd()));
		}
		/******************** MdcnlPrdct_MarketingSts_Sts_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsStsCdgVrsn() != null) {
			medicinalproductmarketingstatusstatuscoding.setVersion(m.getMdcnlPrdctMarketingStsStsCdgVrsn());
		}
		/******************** MdcnlPrdct_MarketingSts_Sts_Txt ********************************************************************************/
		if(m.getMdcnlPrdctMarketingStsStsTxt() != null) {
			medicinalproductmarketingstatusstatus.setText(m.getMdcnlPrdctMarketingStsStsTxt());
		}
		/******************** MdcnlPrdct_MasterFile ********************************************************************************/
		if(m.getMdcnlPrdctMasterFile() != null) {
			medicinalproduct.addMasterFile( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctMasterFile()));
		}
		/******************** medicinalproductname ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductNameComponent medicinalproductname =  new org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductNameComponent();
		medicinalproduct.addName(medicinalproductname);

		/******************** medicinalproductnamecountrylanguage ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductNameCountryLanguageComponent medicinalproductnamecountrylanguage =  new org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductNameCountryLanguageComponent();
		medicinalproductname.addCountryLanguage(medicinalproductnamecountrylanguage);

		/******************** medicinalproductnamecountrylanguagecountry ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductnamecountrylanguagecountry =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductnamecountrylanguage.setCountry(medicinalproductnamecountrylanguagecountry);

		/******************** medicinalproductnamecountrylanguagecountrycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductnamecountrylanguagecountrycoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductnamecountrylanguagecountry.addCoding(medicinalproductnamecountrylanguagecountrycoding);

		/******************** MdcnlPrdct_Nm_CntryLnguage_Cntry_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctNmCntryLnguageCntryCdgCd() != null) {
			medicinalproductnamecountrylanguagecountrycoding.setCode(m.getMdcnlPrdctNmCntryLnguageCntryCdgCd());
		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Cntry_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctNmCntryLnguageCntryCdgDsply() != null) {
			medicinalproductnamecountrylanguagecountrycoding.setDisplay(m.getMdcnlPrdctNmCntryLnguageCntryCdgDsply());
		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Cntry_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctNmCntryLnguageCntryCdgSys() != null) {
			medicinalproductnamecountrylanguagecountrycoding.setSystem(m.getMdcnlPrdctNmCntryLnguageCntryCdgSys());
		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Cntry_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctNmCntryLnguageCntryCdgUsrSltd() != null) {
			medicinalproductnamecountrylanguagecountrycoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctNmCntryLnguageCntryCdgUsrSltd()));
		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Cntry_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctNmCntryLnguageCntryCdgVrsn() != null) {
			medicinalproductnamecountrylanguagecountrycoding.setVersion(m.getMdcnlPrdctNmCntryLnguageCntryCdgVrsn());
		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Cntry_Txt ********************************************************************************/
		if(m.getMdcnlPrdctNmCntryLnguageCntryTxt() != null) {
			medicinalproductnamecountrylanguagecountry.setText(m.getMdcnlPrdctNmCntryLnguageCntryTxt());
		}
		/******************** medicinalproductnamecountrylanguagejurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductnamecountrylanguagejurisdiction =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductnamecountrylanguage.setJurisdiction(medicinalproductnamecountrylanguagejurisdiction);

		/******************** medicinalproductnamecountrylanguagejurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductnamecountrylanguagejurisdictioncoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductnamecountrylanguagejurisdiction.addCoding(medicinalproductnamecountrylanguagejurisdictioncoding);

		/******************** MdcnlPrdct_Nm_CntryLnguage_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctNmCntryLnguageJrsdctnCdgCd() != null) {
			medicinalproductnamecountrylanguagejurisdictioncoding.setCode(m.getMdcnlPrdctNmCntryLnguageJrsdctnCdgCd());
		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctNmCntryLnguageJrsdctnCdgDsply() != null) {
			medicinalproductnamecountrylanguagejurisdictioncoding.setDisplay(m.getMdcnlPrdctNmCntryLnguageJrsdctnCdgDsply());
		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctNmCntryLnguageJrsdctnCdgSys() != null) {
			medicinalproductnamecountrylanguagejurisdictioncoding.setSystem(m.getMdcnlPrdctNmCntryLnguageJrsdctnCdgSys());
		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctNmCntryLnguageJrsdctnCdgUsrSltd() != null) {
			medicinalproductnamecountrylanguagejurisdictioncoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctNmCntryLnguageJrsdctnCdgUsrSltd()));
		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctNmCntryLnguageJrsdctnCdgVrsn() != null) {
			medicinalproductnamecountrylanguagejurisdictioncoding.setVersion(m.getMdcnlPrdctNmCntryLnguageJrsdctnCdgVrsn());
		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Jrsdctn_Txt ********************************************************************************/
		if(m.getMdcnlPrdctNmCntryLnguageJrsdctnTxt() != null) {
			medicinalproductnamecountrylanguagejurisdiction.setText(m.getMdcnlPrdctNmCntryLnguageJrsdctnTxt());
		}
		/******************** medicinalproductnamecountrylanguagelanguage ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductnamecountrylanguagelanguage =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductnamecountrylanguage.setLanguage(medicinalproductnamecountrylanguagelanguage);

		/******************** medicinalproductnamecountrylanguagelanguagecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductnamecountrylanguagelanguagecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductnamecountrylanguagelanguage.addCoding(medicinalproductnamecountrylanguagelanguagecoding);

		/******************** MdcnlPrdct_Nm_CntryLnguage_Lnguage_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctNmCntryLnguageLnguageCdgCd() != null) {
			medicinalproductnamecountrylanguagelanguagecoding.setCode(m.getMdcnlPrdctNmCntryLnguageLnguageCdgCd());
		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Lnguage_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctNmCntryLnguageLnguageCdgDsply() != null) {
			medicinalproductnamecountrylanguagelanguagecoding.setDisplay(m.getMdcnlPrdctNmCntryLnguageLnguageCdgDsply());
		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Lnguage_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctNmCntryLnguageLnguageCdgSys() != null) {
			medicinalproductnamecountrylanguagelanguagecoding.setSystem(m.getMdcnlPrdctNmCntryLnguageLnguageCdgSys());
		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Lnguage_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctNmCntryLnguageLnguageCdgUsrSltd() != null) {
			medicinalproductnamecountrylanguagelanguagecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctNmCntryLnguageLnguageCdgUsrSltd()));
		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Lnguage_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctNmCntryLnguageLnguageCdgVrsn() != null) {
			medicinalproductnamecountrylanguagelanguagecoding.setVersion(m.getMdcnlPrdctNmCntryLnguageLnguageCdgVrsn());
		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Lnguage_Txt ********************************************************************************/
		if(m.getMdcnlPrdctNmCntryLnguageLnguageTxt() != null) {
			medicinalproductnamecountrylanguagelanguage.setText(m.getMdcnlPrdctNmCntryLnguageLnguageTxt());
		}
		/******************** medicinalproductnamenamepart ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductNameNamePartComponent medicinalproductnamenamepart =  new org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductNameNamePartComponent();
		medicinalproductname.addNamePart(medicinalproductnamenamepart);

		/******************** MdcnlPrdct_Nm_NmPart_Part ********************************************************************************/
		if(m.getMdcnlPrdctNmNmPartPart() != null) {
			medicinalproductnamenamepart.setPart(m.getMdcnlPrdctNmNmPartPart());
		}
		/******************** medicinalproductnamenameparttype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductnamenameparttype =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductnamenamepart.setType(medicinalproductnamenameparttype);

		/******************** MdcnlPrdct_Nm_NmPart_Typ_Cd ********************************************************************************/
		if(m.getMdcnlPrdctNmNmPartTypCd() != null) {
			medicinalproductnamenameparttype.setCode(m.getMdcnlPrdctNmNmPartTypCd());
		}
		/******************** MdcnlPrdct_Nm_NmPart_Typ_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctNmNmPartTypDsply() != null) {
			medicinalproductnamenameparttype.setDisplay(m.getMdcnlPrdctNmNmPartTypDsply());
		}
		/******************** MdcnlPrdct_Nm_NmPart_Typ_Sys ********************************************************************************/
		if(m.getMdcnlPrdctNmNmPartTypSys() != null) {
			medicinalproductnamenameparttype.setSystem(m.getMdcnlPrdctNmNmPartTypSys());
		}
		/******************** MdcnlPrdct_Nm_NmPart_Typ_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctNmNmPartTypUsrSltd() != null) {
			medicinalproductnamenameparttype.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctNmNmPartTypUsrSltd()));
		}
		/******************** MdcnlPrdct_Nm_NmPart_Typ_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctNmNmPartTypVrsn() != null) {
			medicinalproductnamenameparttype.setVersion(m.getMdcnlPrdctNmNmPartTypVrsn());
		}
		/******************** MdcnlPrdct_Nm_PrdctNm ********************************************************************************/
		if(m.getMdcnlPrdctNmPrdctNm() != null) {
			medicinalproductname.setProductName(m.getMdcnlPrdctNmPrdctNm());
		}
		/******************** MdcnlPrdct_PckgedMdcnlPrdct ********************************************************************************/
		if(m.getMdcnlPrdctPckgedMdcnlPrdct() != null) {
			medicinalproduct.addPackagedMedicinalProduct( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctPckgedMdcnlPrdct()));
		}
		/******************** medicinalproductpaediatricuseindicator ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpaediatricuseindicator =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproduct.setPaediatricUseIndicator(medicinalproductpaediatricuseindicator);

		/******************** medicinalproductpaediatricuseindicatorcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpaediatricuseindicatorcoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductpaediatricuseindicator.addCoding(medicinalproductpaediatricuseindicatorcoding);

		/******************** MdcnlPrdct_PaediatricUseIndicator_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPaediatricUseIndicatorCdgCd() != null) {
			medicinalproductpaediatricuseindicatorcoding.setCode(m.getMdcnlPrdctPaediatricUseIndicatorCdgCd());
		}
		/******************** MdcnlPrdct_PaediatricUseIndicator_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPaediatricUseIndicatorCdgDsply() != null) {
			medicinalproductpaediatricuseindicatorcoding.setDisplay(m.getMdcnlPrdctPaediatricUseIndicatorCdgDsply());
		}
		/******************** MdcnlPrdct_PaediatricUseIndicator_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPaediatricUseIndicatorCdgSys() != null) {
			medicinalproductpaediatricuseindicatorcoding.setSystem(m.getMdcnlPrdctPaediatricUseIndicatorCdgSys());
		}
		/******************** MdcnlPrdct_PaediatricUseIndicator_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPaediatricUseIndicatorCdgUsrSltd() != null) {
			medicinalproductpaediatricuseindicatorcoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctPaediatricUseIndicatorCdgUsrSltd()));
		}
		/******************** MdcnlPrdct_PaediatricUseIndicator_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPaediatricUseIndicatorCdgVrsn() != null) {
			medicinalproductpaediatricuseindicatorcoding.setVersion(m.getMdcnlPrdctPaediatricUseIndicatorCdgVrsn());
		}
		/******************** MdcnlPrdct_PaediatricUseIndicator_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPaediatricUseIndicatorTxt() != null) {
			medicinalproductpaediatricuseindicator.setText(m.getMdcnlPrdctPaediatricUseIndicatorTxt());
		}
		/******************** MdcnlPrdct_PhrmctclPrdct ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclPrdct() != null) {
			medicinalproduct.addPharmaceuticalProduct( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctPhrmctclPrdct()));
		}
		/******************** medicinalproductproductclassification ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductproductclassification =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproduct.addProductClassification(medicinalproductproductclassification);

		/******************** medicinalproductproductclassificationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductproductclassificationcoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductproductclassification.addCoding(medicinalproductproductclassificationcoding);

		/******************** MdcnlPrdct_PrdctClsfctn_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPrdctClsfctnCdgCd() != null) {
			medicinalproductproductclassificationcoding.setCode(m.getMdcnlPrdctPrdctClsfctnCdgCd());
		}
		/******************** MdcnlPrdct_PrdctClsfctn_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPrdctClsfctnCdgDsply() != null) {
			medicinalproductproductclassificationcoding.setDisplay(m.getMdcnlPrdctPrdctClsfctnCdgDsply());
		}
		/******************** MdcnlPrdct_PrdctClsfctn_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPrdctClsfctnCdgSys() != null) {
			medicinalproductproductclassificationcoding.setSystem(m.getMdcnlPrdctPrdctClsfctnCdgSys());
		}
		/******************** MdcnlPrdct_PrdctClsfctn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPrdctClsfctnCdgUsrSltd() != null) {
			medicinalproductproductclassificationcoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctPrdctClsfctnCdgUsrSltd()));
		}
		/******************** MdcnlPrdct_PrdctClsfctn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPrdctClsfctnCdgVrsn() != null) {
			medicinalproductproductclassificationcoding.setVersion(m.getMdcnlPrdctPrdctClsfctnCdgVrsn());
		}
		/******************** MdcnlPrdct_PrdctClsfctn_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPrdctClsfctnTxt() != null) {
			medicinalproductproductclassification.setText(m.getMdcnlPrdctPrdctClsfctnTxt());
		}
		/******************** medicinalproductspecialdesignation ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductSpecialDesignationComponent medicinalproductspecialdesignation =  new org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductSpecialDesignationComponent();
		medicinalproduct.addSpecialDesignation(medicinalproductspecialdesignation);

		/******************** MdcnlPrdct_SpclDsgnation_Dt ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationDt() != null) {
			java.text.SimpleDateFormat MdcnlPrdct_SpclDsgnation_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdct_SpclDsgnation_Dtdate = MdcnlPrdct_SpclDsgnation_Dtsdf.parse(m.getMdcnlPrdctSpclDsgnationDt());
			medicinalproductspecialdesignation.setDate(MdcnlPrdct_SpclDsgnation_Dtdate);
		}
		/******************** medicinalproductspecialdesignationidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicinalproductspecialdesignationidentifier =  new org.hl7.fhir.r4.model.Identifier();
		medicinalproductspecialdesignation.addIdentifier(medicinalproductspecialdesignationidentifier);

		/******************** MdcnlPrdct_SpclDsgnation_Id_Assigner ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIdAssigner() != null) {
			medicinalproductspecialdesignationidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctSpclDsgnationIdAssigner()));
		}
		/******************** medicinalproductspecialdesignationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductspecialdesignationidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		medicinalproductspecialdesignationidentifier.setPeriod(medicinalproductspecialdesignationidentifierperiod);

		/******************** MdcnlPrdct_SpclDsgnation_Id_Prd_End ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIdPrdEnd() != null) {
			java.text.SimpleDateFormat MdcnlPrdct_SpclDsgnation_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdct_SpclDsgnation_Id_Prd_Enddate = MdcnlPrdct_SpclDsgnation_Id_Prd_Endsdf.parse(m.getMdcnlPrdctSpclDsgnationIdPrdEnd());
			medicinalproductspecialdesignationidentifierperiod.setEnd(MdcnlPrdct_SpclDsgnation_Id_Prd_Enddate);
		}
		/******************** MdcnlPrdct_SpclDsgnation_Id_Prd_Strt ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIdPrdStrt() != null) {
			java.text.SimpleDateFormat MdcnlPrdct_SpclDsgnation_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdct_SpclDsgnation_Id_Prd_Strtdate = MdcnlPrdct_SpclDsgnation_Id_Prd_Strtsdf.parse(m.getMdcnlPrdctSpclDsgnationIdPrdStrt());
			medicinalproductspecialdesignationidentifierperiod.setStart(MdcnlPrdct_SpclDsgnation_Id_Prd_Strtdate);
		}
		/******************** MdcnlPrdct_SpclDsgnation_Id_Sys ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIdSys() != null) {
			medicinalproductspecialdesignationidentifier.setSystem(m.getMdcnlPrdctSpclDsgnationIdSys());
		}
		/******************** medicinalproductspecialdesignationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductspecialdesignationidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductspecialdesignationidentifier.setType(medicinalproductspecialdesignationidentifiertype);

		/******************** medicinalproductspecialdesignationidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductspecialdesignationidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductspecialdesignationidentifiertype.addCoding(medicinalproductspecialdesignationidentifiertypecoding);

		/******************** MdcnlPrdct_SpclDsgnation_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIdTypCdgCd() != null) {
			medicinalproductspecialdesignationidentifiertypecoding.setCode(m.getMdcnlPrdctSpclDsgnationIdTypCdgCd());
		}
		/******************** MdcnlPrdct_SpclDsgnation_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIdTypCdgDsply() != null) {
			medicinalproductspecialdesignationidentifiertypecoding.setDisplay(m.getMdcnlPrdctSpclDsgnationIdTypCdgDsply());
		}
		/******************** MdcnlPrdct_SpclDsgnation_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIdTypCdgSys() != null) {
			medicinalproductspecialdesignationidentifiertypecoding.setSystem(m.getMdcnlPrdctSpclDsgnationIdTypCdgSys());
		}
		/******************** MdcnlPrdct_SpclDsgnation_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIdTypCdgUsrSltd() != null) {
			medicinalproductspecialdesignationidentifiertypecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctSpclDsgnationIdTypCdgUsrSltd()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIdTypCdgVrsn() != null) {
			medicinalproductspecialdesignationidentifiertypecoding.setVersion(m.getMdcnlPrdctSpclDsgnationIdTypCdgVrsn());
		}
		/******************** MdcnlPrdct_SpclDsgnation_Id_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIdTypTxt() != null) {
			medicinalproductspecialdesignationidentifiertype.setText(m.getMdcnlPrdctSpclDsgnationIdTypTxt());
		}
		/******************** medicinalproductspecialdesignationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory medicinalproductspecialdesignationidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		medicinalproductspecialdesignationidentifier.setUse(medicinalproductspecialdesignationidentifieruse.fromCode(m.getMdcnlPrdctSpclDsgnationIdUse()));

		/******************** MdcnlPrdct_SpclDsgnation_Id_Vl ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIdVl() != null) {
			medicinalproductspecialdesignationidentifier.setValue(m.getMdcnlPrdctSpclDsgnationIdVl());
		}
		/******************** medicinalproductspecialdesignationindicationcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductspecialdesignationindicationcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductspecialdesignation.setIndication(medicinalproductspecialdesignationindicationcodeableconcept);

		/******************** medicinalproductspecialdesignationindicationcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductspecialdesignationindicationcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductspecialdesignationindicationcodeableconcept.addCoding(medicinalproductspecialdesignationindicationcodeableconceptcoding);

		/******************** MdcnlPrdct_SpclDsgnation_IndctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgCd() != null) {
			medicinalproductspecialdesignationindicationcodeableconceptcoding.setCode(m.getMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgCd());
		}
		/******************** MdcnlPrdct_SpclDsgnation_IndctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgDsply() != null) {
			medicinalproductspecialdesignationindicationcodeableconceptcoding.setDisplay(m.getMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgDsply());
		}
		/******************** MdcnlPrdct_SpclDsgnation_IndctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgSys() != null) {
			medicinalproductspecialdesignationindicationcodeableconceptcoding.setSystem(m.getMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgSys());
		}
		/******************** MdcnlPrdct_SpclDsgnation_IndctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgUsrSltd() != null) {
			medicinalproductspecialdesignationindicationcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgUsrSltd()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_IndctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgVrsn() != null) {
			medicinalproductspecialdesignationindicationcodeableconceptcoding.setVersion(m.getMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgVrsn());
		}
		/******************** MdcnlPrdct_SpclDsgnation_IndctnCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIndctnCdbleCncptTxt() != null) {
			medicinalproductspecialdesignationindicationcodeableconcept.setText(m.getMdcnlPrdctSpclDsgnationIndctnCdbleCncptTxt());
		}
		/******************** MdcnlPrdct_SpclDsgnation_IndctnRfrnc ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIndctnRfrnc() != null) {
			medicinalproductspecialdesignation.setIndication( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctSpclDsgnationIndctnRfrnc()));
		}
		/******************** medicinalproductspecialdesignationintendeduse ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductspecialdesignationintendeduse =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductspecialdesignation.setIntendedUse(medicinalproductspecialdesignationintendeduse);

		/******************** medicinalproductspecialdesignationintendedusecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductspecialdesignationintendedusecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductspecialdesignationintendeduse.addCoding(medicinalproductspecialdesignationintendedusecoding);

		/******************** MdcnlPrdct_SpclDsgnation_IntendedUse_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIntendedUseCdgCd() != null) {
			medicinalproductspecialdesignationintendedusecoding.setCode(m.getMdcnlPrdctSpclDsgnationIntendedUseCdgCd());
		}
		/******************** MdcnlPrdct_SpclDsgnation_IntendedUse_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIntendedUseCdgDsply() != null) {
			medicinalproductspecialdesignationintendedusecoding.setDisplay(m.getMdcnlPrdctSpclDsgnationIntendedUseCdgDsply());
		}
		/******************** MdcnlPrdct_SpclDsgnation_IntendedUse_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIntendedUseCdgSys() != null) {
			medicinalproductspecialdesignationintendedusecoding.setSystem(m.getMdcnlPrdctSpclDsgnationIntendedUseCdgSys());
		}
		/******************** MdcnlPrdct_SpclDsgnation_IntendedUse_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIntendedUseCdgUsrSltd() != null) {
			medicinalproductspecialdesignationintendedusecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctSpclDsgnationIntendedUseCdgUsrSltd()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_IntendedUse_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIntendedUseCdgVrsn() != null) {
			medicinalproductspecialdesignationintendedusecoding.setVersion(m.getMdcnlPrdctSpclDsgnationIntendedUseCdgVrsn());
		}
		/******************** MdcnlPrdct_SpclDsgnation_IntendedUse_Txt ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationIntendedUseTxt() != null) {
			medicinalproductspecialdesignationintendeduse.setText(m.getMdcnlPrdctSpclDsgnationIntendedUseTxt());
		}
		/******************** medicinalproductspecialdesignationspecies ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductspecialdesignationspecies =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductspecialdesignation.setSpecies(medicinalproductspecialdesignationspecies);

		/******************** medicinalproductspecialdesignationspeciescoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductspecialdesignationspeciescoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductspecialdesignationspecies.addCoding(medicinalproductspecialdesignationspeciescoding);

		/******************** MdcnlPrdct_SpclDsgnation_Spcs_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationSpcsCdgCd() != null) {
			medicinalproductspecialdesignationspeciescoding.setCode(m.getMdcnlPrdctSpclDsgnationSpcsCdgCd());
		}
		/******************** MdcnlPrdct_SpclDsgnation_Spcs_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationSpcsCdgDsply() != null) {
			medicinalproductspecialdesignationspeciescoding.setDisplay(m.getMdcnlPrdctSpclDsgnationSpcsCdgDsply());
		}
		/******************** MdcnlPrdct_SpclDsgnation_Spcs_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationSpcsCdgSys() != null) {
			medicinalproductspecialdesignationspeciescoding.setSystem(m.getMdcnlPrdctSpclDsgnationSpcsCdgSys());
		}
		/******************** MdcnlPrdct_SpclDsgnation_Spcs_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationSpcsCdgUsrSltd() != null) {
			medicinalproductspecialdesignationspeciescoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctSpclDsgnationSpcsCdgUsrSltd()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_Spcs_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationSpcsCdgVrsn() != null) {
			medicinalproductspecialdesignationspeciescoding.setVersion(m.getMdcnlPrdctSpclDsgnationSpcsCdgVrsn());
		}
		/******************** MdcnlPrdct_SpclDsgnation_Spcs_Txt ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationSpcsTxt() != null) {
			medicinalproductspecialdesignationspecies.setText(m.getMdcnlPrdctSpclDsgnationSpcsTxt());
		}
		/******************** medicinalproductspecialdesignationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductspecialdesignationstatus =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductspecialdesignation.setStatus(medicinalproductspecialdesignationstatus);

		/******************** medicinalproductspecialdesignationstatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductspecialdesignationstatuscoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductspecialdesignationstatus.addCoding(medicinalproductspecialdesignationstatuscoding);

		/******************** MdcnlPrdct_SpclDsgnation_Sts_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationStsCdgCd() != null) {
			medicinalproductspecialdesignationstatuscoding.setCode(m.getMdcnlPrdctSpclDsgnationStsCdgCd());
		}
		/******************** MdcnlPrdct_SpclDsgnation_Sts_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationStsCdgDsply() != null) {
			medicinalproductspecialdesignationstatuscoding.setDisplay(m.getMdcnlPrdctSpclDsgnationStsCdgDsply());
		}
		/******************** MdcnlPrdct_SpclDsgnation_Sts_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationStsCdgSys() != null) {
			medicinalproductspecialdesignationstatuscoding.setSystem(m.getMdcnlPrdctSpclDsgnationStsCdgSys());
		}
		/******************** MdcnlPrdct_SpclDsgnation_Sts_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationStsCdgUsrSltd() != null) {
			medicinalproductspecialdesignationstatuscoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctSpclDsgnationStsCdgUsrSltd()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_Sts_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationStsCdgVrsn() != null) {
			medicinalproductspecialdesignationstatuscoding.setVersion(m.getMdcnlPrdctSpclDsgnationStsCdgVrsn());
		}
		/******************** MdcnlPrdct_SpclDsgnation_Sts_Txt ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationStsTxt() != null) {
			medicinalproductspecialdesignationstatus.setText(m.getMdcnlPrdctSpclDsgnationStsTxt());
		}
		/******************** medicinalproductspecialdesignationtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductspecialdesignationtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductspecialdesignation.setType(medicinalproductspecialdesignationtype);

		/******************** medicinalproductspecialdesignationtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductspecialdesignationtypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductspecialdesignationtype.addCoding(medicinalproductspecialdesignationtypecoding);

		/******************** MdcnlPrdct_SpclDsgnation_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationTypCdgCd() != null) {
			medicinalproductspecialdesignationtypecoding.setCode(m.getMdcnlPrdctSpclDsgnationTypCdgCd());
		}
		/******************** MdcnlPrdct_SpclDsgnation_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationTypCdgDsply() != null) {
			medicinalproductspecialdesignationtypecoding.setDisplay(m.getMdcnlPrdctSpclDsgnationTypCdgDsply());
		}
		/******************** MdcnlPrdct_SpclDsgnation_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationTypCdgSys() != null) {
			medicinalproductspecialdesignationtypecoding.setSystem(m.getMdcnlPrdctSpclDsgnationTypCdgSys());
		}
		/******************** MdcnlPrdct_SpclDsgnation_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationTypCdgUsrSltd() != null) {
			medicinalproductspecialdesignationtypecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctSpclDsgnationTypCdgUsrSltd()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationTypCdgVrsn() != null) {
			medicinalproductspecialdesignationtypecoding.setVersion(m.getMdcnlPrdctSpclDsgnationTypCdgVrsn());
		}
		/******************** MdcnlPrdct_SpclDsgnation_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctSpclDsgnationTypTxt() != null) {
			medicinalproductspecialdesignationtype.setText(m.getMdcnlPrdctSpclDsgnationTypTxt());
		}
		/******************** MdcnlPrdct_SpclMsrs ********************************************************************************/
		if(m.getMdcnlPrdctSpclMsrs() != null) {
			medicinalproduct.addSpecialMeasures(m.getMdcnlPrdctSpclMsrs());
		}
		/******************** medicinalproducttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproducttype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproduct.setType(medicinalproducttype);

		/******************** medicinalproducttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproducttypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproducttype.addCoding(medicinalproducttypecoding);

		/******************** MdcnlPrdct_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctTypCdgCd() != null) {
			medicinalproducttypecoding.setCode(m.getMdcnlPrdctTypCdgCd());
		}
		/******************** MdcnlPrdct_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctTypCdgDsply() != null) {
			medicinalproducttypecoding.setDisplay(m.getMdcnlPrdctTypCdgDsply());
		}
		/******************** MdcnlPrdct_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctTypCdgSys() != null) {
			medicinalproducttypecoding.setSystem(m.getMdcnlPrdctTypCdgSys());
		}
		/******************** MdcnlPrdct_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctTypCdgUsrSltd() != null) {
			medicinalproducttypecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctTypCdgUsrSltd()));
		}
		/******************** MdcnlPrdct_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctTypCdgVrsn() != null) {
			medicinalproducttypecoding.setVersion(m.getMdcnlPrdctTypCdgVrsn());
		}
		/******************** MdcnlPrdct_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctTypTxt() != null) {
			medicinalproducttype.setText(m.getMdcnlPrdctTypTxt());
		}
		return medicinalproduct;
	}
}
