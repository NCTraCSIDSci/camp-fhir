package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProduct;
public class MedicinalProductBidirectionalConversion 
{
	public MedicinalProduct MedicinalProducts(org.hl7.fhir.r4.model.MedicinalProduct medicinalproduct) throws ParseException
	{
		 main.java.com.campfhir.model.MedicinalProduct m = new  main.java.com.campfhir.model.MedicinalProduct();

		/******************** id ********************************************************************************/
		medicinalproduct.setId(m.getId());

		/******************** medicinalproducttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproducttype = medicinalproduct.getType();

		/******************** medicinalproducttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproducttypecoding = medicinalproducttype.getCodingFirstRep();

		/******************** MdcnlPrdct_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproducttypecoding.hasDisplay()) {
			m.setMdcnlPrdctTypCdgDsply(String.valueOf(medicinalproducttypecoding.getDisplay()));
		}
		/******************** MdcnlPrdct_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproducttypecoding.hasVersion()) {
			m.setMdcnlPrdctTypCdgVrsn(String.valueOf(medicinalproducttypecoding.getVersion()));
		}
		/******************** MdcnlPrdct_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproducttypecoding.hasCode()) {
			m.setMdcnlPrdctTypCdgCd(String.valueOf(medicinalproducttypecoding.getCode()));
		}
		/******************** MdcnlPrdct_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproducttypecoding.hasSystem()) {
			m.setMdcnlPrdctTypCdgSys(String.valueOf(medicinalproducttypecoding.getSystem()));
		}
		/******************** MdcnlPrdct_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproducttypecoding.hasUserSelected()) {
			m.setMdcnlPrdctTypCdgUsrSltd(String.valueOf(medicinalproducttypecoding.getUserSelected()));
		}
		/******************** MdcnlPrdct_Typ_Txt ********************************************************************************/
		if(medicinalproducttype.hasText()) {
			m.setMdcnlPrdctTypTxt(String.valueOf(medicinalproducttype.getText()));
		}
		/******************** medicinalproductlegalstatusofsupply ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductlegalstatusofsupply = medicinalproduct.getLegalStatusOfSupply();

		/******************** medicinalproductlegalstatusofsupplycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductlegalstatusofsupplycoding = medicinalproductlegalstatusofsupply.getCodingFirstRep();

		/******************** MdcnlPrdct_LegalStsOfSpply_Cdg_Dsply ********************************************************************************/
		if(medicinalproductlegalstatusofsupplycoding.hasDisplay()) {
			m.setMdcnlPrdctLegalStsOfSpplyCdgDsply(String.valueOf(medicinalproductlegalstatusofsupplycoding.getDisplay()));
		}
		/******************** MdcnlPrdct_LegalStsOfSpply_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductlegalstatusofsupplycoding.hasVersion()) {
			m.setMdcnlPrdctLegalStsOfSpplyCdgVrsn(String.valueOf(medicinalproductlegalstatusofsupplycoding.getVersion()));
		}
		/******************** MdcnlPrdct_LegalStsOfSpply_Cdg_Cd ********************************************************************************/
		if(medicinalproductlegalstatusofsupplycoding.hasCode()) {
			m.setMdcnlPrdctLegalStsOfSpplyCdgCd(String.valueOf(medicinalproductlegalstatusofsupplycoding.getCode()));
		}
		/******************** MdcnlPrdct_LegalStsOfSpply_Cdg_Sys ********************************************************************************/
		if(medicinalproductlegalstatusofsupplycoding.hasSystem()) {
			m.setMdcnlPrdctLegalStsOfSpplyCdgSys(String.valueOf(medicinalproductlegalstatusofsupplycoding.getSystem()));
		}
		/******************** MdcnlPrdct_LegalStsOfSpply_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductlegalstatusofsupplycoding.hasUserSelected()) {
			m.setMdcnlPrdctLegalStsOfSpplyCdgUsrSltd(String.valueOf(medicinalproductlegalstatusofsupplycoding.getUserSelected()));
		}
		/******************** MdcnlPrdct_LegalStsOfSpply_Txt ********************************************************************************/
		if(medicinalproductlegalstatusofsupply.hasText()) {
			m.setMdcnlPrdctLegalStsOfSpplyTxt(String.valueOf(medicinalproductlegalstatusofsupply.getText()));
		}
		/******************** medicinalproductmarketingstatus ********************************************************************************/
		org.hl7.fhir.r4.model.MarketingStatus medicinalproductmarketingstatus = medicinalproduct.getMarketingStatusFirstRep();

		/******************** medicinalproductmarketingstatuscountry ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductmarketingstatuscountry = medicinalproductmarketingstatus.getCountry();

		/******************** medicinalproductmarketingstatuscountrycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductmarketingstatuscountrycoding = medicinalproductmarketingstatuscountry.getCodingFirstRep();

		/******************** MdcnlPrdct_MarketingSts_Cntry_Cdg_Dsply ********************************************************************************/
		if(medicinalproductmarketingstatuscountrycoding.hasDisplay()) {
			m.setMdcnlPrdctMarketingStsCntryCdgDsply(String.valueOf(medicinalproductmarketingstatuscountrycoding.getDisplay()));
		}
		/******************** MdcnlPrdct_MarketingSts_Cntry_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductmarketingstatuscountrycoding.hasVersion()) {
			m.setMdcnlPrdctMarketingStsCntryCdgVrsn(String.valueOf(medicinalproductmarketingstatuscountrycoding.getVersion()));
		}
		/******************** MdcnlPrdct_MarketingSts_Cntry_Cdg_Cd ********************************************************************************/
		if(medicinalproductmarketingstatuscountrycoding.hasCode()) {
			m.setMdcnlPrdctMarketingStsCntryCdgCd(String.valueOf(medicinalproductmarketingstatuscountrycoding.getCode()));
		}
		/******************** MdcnlPrdct_MarketingSts_Cntry_Cdg_Sys ********************************************************************************/
		if(medicinalproductmarketingstatuscountrycoding.hasSystem()) {
			m.setMdcnlPrdctMarketingStsCntryCdgSys(String.valueOf(medicinalproductmarketingstatuscountrycoding.getSystem()));
		}
		/******************** MdcnlPrdct_MarketingSts_Cntry_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductmarketingstatuscountrycoding.hasUserSelected()) {
			m.setMdcnlPrdctMarketingStsCntryCdgUsrSltd(String.valueOf(medicinalproductmarketingstatuscountrycoding.getUserSelected()));
		}
		/******************** MdcnlPrdct_MarketingSts_Cntry_Txt ********************************************************************************/
		if(medicinalproductmarketingstatuscountry.hasText()) {
			m.setMdcnlPrdctMarketingStsCntryTxt(String.valueOf(medicinalproductmarketingstatuscountry.getText()));
		}
		/******************** MdcnlPrdct_MarketingSts_RestoreDt ********************************************************************************/
		if(medicinalproductmarketingstatus.hasRestoreDate()) {
			m.setMdcnlPrdctMarketingStsRestoreDt(String.valueOf(medicinalproductmarketingstatus.getRestoreDate()));
		}
		/******************** medicinalproductmarketingstatusstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductmarketingstatusstatus = medicinalproductmarketingstatus.getStatus();

		/******************** medicinalproductmarketingstatusstatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductmarketingstatusstatuscoding = medicinalproductmarketingstatusstatus.getCodingFirstRep();

		/******************** MdcnlPrdct_MarketingSts_Sts_Cdg_Dsply ********************************************************************************/
		if(medicinalproductmarketingstatusstatuscoding.hasDisplay()) {
			m.setMdcnlPrdctMarketingStsStsCdgDsply(String.valueOf(medicinalproductmarketingstatusstatuscoding.getDisplay()));
		}
		/******************** MdcnlPrdct_MarketingSts_Sts_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductmarketingstatusstatuscoding.hasVersion()) {
			m.setMdcnlPrdctMarketingStsStsCdgVrsn(String.valueOf(medicinalproductmarketingstatusstatuscoding.getVersion()));
		}
		/******************** MdcnlPrdct_MarketingSts_Sts_Cdg_Cd ********************************************************************************/
		if(medicinalproductmarketingstatusstatuscoding.hasCode()) {
			m.setMdcnlPrdctMarketingStsStsCdgCd(String.valueOf(medicinalproductmarketingstatusstatuscoding.getCode()));
		}
		/******************** MdcnlPrdct_MarketingSts_Sts_Cdg_Sys ********************************************************************************/
		if(medicinalproductmarketingstatusstatuscoding.hasSystem()) {
			m.setMdcnlPrdctMarketingStsStsCdgSys(String.valueOf(medicinalproductmarketingstatusstatuscoding.getSystem()));
		}
		/******************** MdcnlPrdct_MarketingSts_Sts_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductmarketingstatusstatuscoding.hasUserSelected()) {
			m.setMdcnlPrdctMarketingStsStsCdgUsrSltd(String.valueOf(medicinalproductmarketingstatusstatuscoding.getUserSelected()));
		}
		/******************** MdcnlPrdct_MarketingSts_Sts_Txt ********************************************************************************/
		if(medicinalproductmarketingstatusstatus.hasText()) {
			m.setMdcnlPrdctMarketingStsStsTxt(String.valueOf(medicinalproductmarketingstatusstatus.getText()));
		}
		/******************** medicinalproductmarketingstatusjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductmarketingstatusjurisdiction = medicinalproductmarketingstatus.getJurisdiction();

		/******************** medicinalproductmarketingstatusjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductmarketingstatusjurisdictioncoding = medicinalproductmarketingstatusjurisdiction.getCodingFirstRep();

		/******************** MdcnlPrdct_MarketingSts_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(medicinalproductmarketingstatusjurisdictioncoding.hasDisplay()) {
			m.setMdcnlPrdctMarketingStsJrsdctnCdgDsply(String.valueOf(medicinalproductmarketingstatusjurisdictioncoding.getDisplay()));
		}
		/******************** MdcnlPrdct_MarketingSts_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductmarketingstatusjurisdictioncoding.hasVersion()) {
			m.setMdcnlPrdctMarketingStsJrsdctnCdgVrsn(String.valueOf(medicinalproductmarketingstatusjurisdictioncoding.getVersion()));
		}
		/******************** MdcnlPrdct_MarketingSts_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(medicinalproductmarketingstatusjurisdictioncoding.hasCode()) {
			m.setMdcnlPrdctMarketingStsJrsdctnCdgCd(String.valueOf(medicinalproductmarketingstatusjurisdictioncoding.getCode()));
		}
		/******************** MdcnlPrdct_MarketingSts_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(medicinalproductmarketingstatusjurisdictioncoding.hasSystem()) {
			m.setMdcnlPrdctMarketingStsJrsdctnCdgSys(String.valueOf(medicinalproductmarketingstatusjurisdictioncoding.getSystem()));
		}
		/******************** MdcnlPrdct_MarketingSts_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductmarketingstatusjurisdictioncoding.hasUserSelected()) {
			m.setMdcnlPrdctMarketingStsJrsdctnCdgUsrSltd(String.valueOf(medicinalproductmarketingstatusjurisdictioncoding.getUserSelected()));
		}
		/******************** MdcnlPrdct_MarketingSts_Jrsdctn_Txt ********************************************************************************/
		if(medicinalproductmarketingstatusjurisdiction.hasText()) {
			m.setMdcnlPrdctMarketingStsJrsdctnTxt(String.valueOf(medicinalproductmarketingstatusjurisdiction.getText()));
		}
		/******************** medicinalproductmarketingstatusdaterange ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductmarketingstatusdaterange = medicinalproductmarketingstatus.getDateRange();

		/******************** MdcnlPrdct_MarketingSts_DtRng_End ********************************************************************************/
		if(medicinalproductmarketingstatusdaterange.hasEnd()) {
			m.setMdcnlPrdctMarketingStsDtRngEnd(String.valueOf(medicinalproductmarketingstatusdaterange.getEnd()));
		}
		/******************** MdcnlPrdct_MarketingSts_DtRng_Strt ********************************************************************************/
		if(medicinalproductmarketingstatusdaterange.hasStart()) {
			m.setMdcnlPrdctMarketingStsDtRngStrt(String.valueOf(medicinalproductmarketingstatusdaterange.getStart()));
		}
		/******************** MdcnlPrdct_Cntct ********************************************************************************/
		if(medicinalproduct.hasContact()) {
			m.setMdcnlPrdctCntct(String.valueOf(medicinalproduct.getContactFirstRep()));
		}
		/******************** MdcnlPrdct_AttachedDoc ********************************************************************************/
		if(medicinalproduct.hasAttachedDocument()) {
			m.setMdcnlPrdctAttachedDoc(String.valueOf(medicinalproduct.getAttachedDocumentFirstRep()));
		}
		/******************** MdcnlPrdct_MasterFile ********************************************************************************/
		if(medicinalproduct.hasMasterFile()) {
			m.setMdcnlPrdctMasterFile(String.valueOf(medicinalproduct.getMasterFileFirstRep()));
		}
		/******************** MdcnlPrdct_ClnclTrial ********************************************************************************/
		if(medicinalproduct.hasClinicalTrial()) {
			m.setMdcnlPrdctClnclTrial(String.valueOf(medicinalproduct.getClinicalTrialFirstRep()));
		}
		/******************** medicinalproductcombinedpharmaceuticaldoseform ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductcombinedpharmaceuticaldoseform = medicinalproduct.getCombinedPharmaceuticalDoseForm();

		/******************** medicinalproductcombinedpharmaceuticaldoseformcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductcombinedpharmaceuticaldoseformcoding = medicinalproductcombinedpharmaceuticaldoseform.getCodingFirstRep();

		/******************** MdcnlPrdct_CombinedPhrmctclDoseFrm_Cdg_Dsply ********************************************************************************/
		if(medicinalproductcombinedpharmaceuticaldoseformcoding.hasDisplay()) {
			m.setMdcnlPrdctCombinedPhrmctclDoseFrmCdgDsply(String.valueOf(medicinalproductcombinedpharmaceuticaldoseformcoding.getDisplay()));
		}
		/******************** MdcnlPrdct_CombinedPhrmctclDoseFrm_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductcombinedpharmaceuticaldoseformcoding.hasVersion()) {
			m.setMdcnlPrdctCombinedPhrmctclDoseFrmCdgVrsn(String.valueOf(medicinalproductcombinedpharmaceuticaldoseformcoding.getVersion()));
		}
		/******************** MdcnlPrdct_CombinedPhrmctclDoseFrm_Cdg_Cd ********************************************************************************/
		if(medicinalproductcombinedpharmaceuticaldoseformcoding.hasCode()) {
			m.setMdcnlPrdctCombinedPhrmctclDoseFrmCdgCd(String.valueOf(medicinalproductcombinedpharmaceuticaldoseformcoding.getCode()));
		}
		/******************** MdcnlPrdct_CombinedPhrmctclDoseFrm_Cdg_Sys ********************************************************************************/
		if(medicinalproductcombinedpharmaceuticaldoseformcoding.hasSystem()) {
			m.setMdcnlPrdctCombinedPhrmctclDoseFrmCdgSys(String.valueOf(medicinalproductcombinedpharmaceuticaldoseformcoding.getSystem()));
		}
		/******************** MdcnlPrdct_CombinedPhrmctclDoseFrm_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductcombinedpharmaceuticaldoseformcoding.hasUserSelected()) {
			m.setMdcnlPrdctCombinedPhrmctclDoseFrmCdgUsrSltd(String.valueOf(medicinalproductcombinedpharmaceuticaldoseformcoding.getUserSelected()));
		}
		/******************** MdcnlPrdct_CombinedPhrmctclDoseFrm_Txt ********************************************************************************/
		if(medicinalproductcombinedpharmaceuticaldoseform.hasText()) {
			m.setMdcnlPrdctCombinedPhrmctclDoseFrmTxt(String.valueOf(medicinalproductcombinedpharmaceuticaldoseform.getText()));
		}
		/******************** MdcnlPrdct_PhrmctclPrdct ********************************************************************************/
		if(medicinalproduct.hasPharmaceuticalProduct()) {
			m.setMdcnlPrdctPhrmctclPrdct(String.valueOf(medicinalproduct.getPharmaceuticalProductFirstRep()));
		}
		/******************** medicinalproductadditionalmonitoringindicator ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductadditionalmonitoringindicator = medicinalproduct.getAdditionalMonitoringIndicator();

		/******************** medicinalproductadditionalmonitoringindicatorcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductadditionalmonitoringindicatorcoding = medicinalproductadditionalmonitoringindicator.getCodingFirstRep();

		/******************** MdcnlPrdct_AddtnlMonitoringIndicator_Cdg_Dsply ********************************************************************************/
		if(medicinalproductadditionalmonitoringindicatorcoding.hasDisplay()) {
			m.setMdcnlPrdctAddtnlMonitoringIndicatorCdgDsply(String.valueOf(medicinalproductadditionalmonitoringindicatorcoding.getDisplay()));
		}
		/******************** MdcnlPrdct_AddtnlMonitoringIndicator_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductadditionalmonitoringindicatorcoding.hasVersion()) {
			m.setMdcnlPrdctAddtnlMonitoringIndicatorCdgVrsn(String.valueOf(medicinalproductadditionalmonitoringindicatorcoding.getVersion()));
		}
		/******************** MdcnlPrdct_AddtnlMonitoringIndicator_Cdg_Cd ********************************************************************************/
		if(medicinalproductadditionalmonitoringindicatorcoding.hasCode()) {
			m.setMdcnlPrdctAddtnlMonitoringIndicatorCdgCd(String.valueOf(medicinalproductadditionalmonitoringindicatorcoding.getCode()));
		}
		/******************** MdcnlPrdct_AddtnlMonitoringIndicator_Cdg_Sys ********************************************************************************/
		if(medicinalproductadditionalmonitoringindicatorcoding.hasSystem()) {
			m.setMdcnlPrdctAddtnlMonitoringIndicatorCdgSys(String.valueOf(medicinalproductadditionalmonitoringindicatorcoding.getSystem()));
		}
		/******************** MdcnlPrdct_AddtnlMonitoringIndicator_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductadditionalmonitoringindicatorcoding.hasUserSelected()) {
			m.setMdcnlPrdctAddtnlMonitoringIndicatorCdgUsrSltd(String.valueOf(medicinalproductadditionalmonitoringindicatorcoding.getUserSelected()));
		}
		/******************** MdcnlPrdct_AddtnlMonitoringIndicator_Txt ********************************************************************************/
		if(medicinalproductadditionalmonitoringindicator.hasText()) {
			m.setMdcnlPrdctAddtnlMonitoringIndicatorTxt(String.valueOf(medicinalproductadditionalmonitoringindicator.getText()));
		}
		/******************** medicinalproductpaediatricuseindicator ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpaediatricuseindicator = medicinalproduct.getPaediatricUseIndicator();

		/******************** medicinalproductpaediatricuseindicatorcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpaediatricuseindicatorcoding = medicinalproductpaediatricuseindicator.getCodingFirstRep();

		/******************** MdcnlPrdct_PaediatricUseIndicator_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpaediatricuseindicatorcoding.hasDisplay()) {
			m.setMdcnlPrdctPaediatricUseIndicatorCdgDsply(String.valueOf(medicinalproductpaediatricuseindicatorcoding.getDisplay()));
		}
		/******************** MdcnlPrdct_PaediatricUseIndicator_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpaediatricuseindicatorcoding.hasVersion()) {
			m.setMdcnlPrdctPaediatricUseIndicatorCdgVrsn(String.valueOf(medicinalproductpaediatricuseindicatorcoding.getVersion()));
		}
		/******************** MdcnlPrdct_PaediatricUseIndicator_Cdg_Cd ********************************************************************************/
		if(medicinalproductpaediatricuseindicatorcoding.hasCode()) {
			m.setMdcnlPrdctPaediatricUseIndicatorCdgCd(String.valueOf(medicinalproductpaediatricuseindicatorcoding.getCode()));
		}
		/******************** MdcnlPrdct_PaediatricUseIndicator_Cdg_Sys ********************************************************************************/
		if(medicinalproductpaediatricuseindicatorcoding.hasSystem()) {
			m.setMdcnlPrdctPaediatricUseIndicatorCdgSys(String.valueOf(medicinalproductpaediatricuseindicatorcoding.getSystem()));
		}
		/******************** MdcnlPrdct_PaediatricUseIndicator_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpaediatricuseindicatorcoding.hasUserSelected()) {
			m.setMdcnlPrdctPaediatricUseIndicatorCdgUsrSltd(String.valueOf(medicinalproductpaediatricuseindicatorcoding.getUserSelected()));
		}
		/******************** MdcnlPrdct_PaediatricUseIndicator_Txt ********************************************************************************/
		if(medicinalproductpaediatricuseindicator.hasText()) {
			m.setMdcnlPrdctPaediatricUseIndicatorTxt(String.valueOf(medicinalproductpaediatricuseindicator.getText()));
		}
		/******************** medicinalproductproductclassification ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductproductclassification = medicinalproduct.getProductClassificationFirstRep();

		/******************** medicinalproductproductclassificationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductproductclassificationcoding = medicinalproductproductclassification.getCodingFirstRep();

		/******************** MdcnlPrdct_PrdctClsfctn_Cdg_Dsply ********************************************************************************/
		if(medicinalproductproductclassificationcoding.hasDisplay()) {
			m.setMdcnlPrdctPrdctClsfctnCdgDsply(String.valueOf(medicinalproductproductclassificationcoding.getDisplay()));
		}
		/******************** MdcnlPrdct_PrdctClsfctn_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductproductclassificationcoding.hasVersion()) {
			m.setMdcnlPrdctPrdctClsfctnCdgVrsn(String.valueOf(medicinalproductproductclassificationcoding.getVersion()));
		}
		/******************** MdcnlPrdct_PrdctClsfctn_Cdg_Cd ********************************************************************************/
		if(medicinalproductproductclassificationcoding.hasCode()) {
			m.setMdcnlPrdctPrdctClsfctnCdgCd(String.valueOf(medicinalproductproductclassificationcoding.getCode()));
		}
		/******************** MdcnlPrdct_PrdctClsfctn_Cdg_Sys ********************************************************************************/
		if(medicinalproductproductclassificationcoding.hasSystem()) {
			m.setMdcnlPrdctPrdctClsfctnCdgSys(String.valueOf(medicinalproductproductclassificationcoding.getSystem()));
		}
		/******************** MdcnlPrdct_PrdctClsfctn_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductproductclassificationcoding.hasUserSelected()) {
			m.setMdcnlPrdctPrdctClsfctnCdgUsrSltd(String.valueOf(medicinalproductproductclassificationcoding.getUserSelected()));
		}
		/******************** MdcnlPrdct_PrdctClsfctn_Txt ********************************************************************************/
		if(medicinalproductproductclassification.hasText()) {
			m.setMdcnlPrdctPrdctClsfctnTxt(String.valueOf(medicinalproductproductclassification.getText()));
		}
		/******************** medicinalproductcrossreference ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicinalproductcrossreference = medicinalproduct.getCrossReferenceFirstRep();

		/******************** MdcnlPrdct_CrossRfrnc_Vl ********************************************************************************/
		if(medicinalproductcrossreference.hasValue()) {
			m.setMdcnlPrdctCrossRfrncVl(String.valueOf(medicinalproductcrossreference.getValue()));
		}
		/******************** medicinalproductcrossreferencetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductcrossreferencetype = medicinalproductcrossreference.getType();

		/******************** medicinalproductcrossreferencetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductcrossreferencetypecoding = medicinalproductcrossreferencetype.getCodingFirstRep();

		/******************** MdcnlPrdct_CrossRfrnc_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductcrossreferencetypecoding.hasDisplay()) {
			m.setMdcnlPrdctCrossRfrncTypCdgDsply(String.valueOf(medicinalproductcrossreferencetypecoding.getDisplay()));
		}
		/******************** MdcnlPrdct_CrossRfrnc_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductcrossreferencetypecoding.hasVersion()) {
			m.setMdcnlPrdctCrossRfrncTypCdgVrsn(String.valueOf(medicinalproductcrossreferencetypecoding.getVersion()));
		}
		/******************** MdcnlPrdct_CrossRfrnc_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductcrossreferencetypecoding.hasCode()) {
			m.setMdcnlPrdctCrossRfrncTypCdgCd(String.valueOf(medicinalproductcrossreferencetypecoding.getCode()));
		}
		/******************** MdcnlPrdct_CrossRfrnc_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductcrossreferencetypecoding.hasSystem()) {
			m.setMdcnlPrdctCrossRfrncTypCdgSys(String.valueOf(medicinalproductcrossreferencetypecoding.getSystem()));
		}
		/******************** MdcnlPrdct_CrossRfrnc_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductcrossreferencetypecoding.hasUserSelected()) {
			m.setMdcnlPrdctCrossRfrncTypCdgUsrSltd(String.valueOf(medicinalproductcrossreferencetypecoding.getUserSelected()));
		}
		/******************** MdcnlPrdct_CrossRfrnc_Typ_Txt ********************************************************************************/
		if(medicinalproductcrossreferencetype.hasText()) {
			m.setMdcnlPrdctCrossRfrncTypTxt(String.valueOf(medicinalproductcrossreferencetype.getText()));
		}
		/******************** MdcnlPrdct_CrossRfrnc_Sys ********************************************************************************/
		if(medicinalproductcrossreference.hasSystem()) {
			m.setMdcnlPrdctCrossRfrncSys(String.valueOf(medicinalproductcrossreference.getSystem()));
		}
		/******************** MdcnlPrdct_CrossRfrnc_Assigner ********************************************************************************/
		if(medicinalproductcrossreference.hasAssigner()) {
			m.setMdcnlPrdctCrossRfrncAssigner(String.valueOf(medicinalproductcrossreference.getAssigner()));
		}
		/******************** medicinalproductcrossreferenceperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductcrossreferenceperiod = medicinalproductcrossreference.getPeriod();

		/******************** MdcnlPrdct_CrossRfrnc_Prd_End ********************************************************************************/
		if(medicinalproductcrossreferenceperiod.hasEnd()) {
			m.setMdcnlPrdctCrossRfrncPrdEnd(String.valueOf(medicinalproductcrossreferenceperiod.getEnd()));
		}
		/******************** MdcnlPrdct_CrossRfrnc_Prd_Strt ********************************************************************************/
		if(medicinalproductcrossreferenceperiod.hasStart()) {
			m.setMdcnlPrdctCrossRfrncPrdStrt(String.valueOf(medicinalproductcrossreferenceperiod.getStart()));
		}
		/******************** medicinalproductcrossreferenceuse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicinalproductcrossreferenceuse = medicinalproductcrossreference.getUse();
		m.setMdcnlPrdctCrossRfrncUse(medicinalproductcrossreferenceuse.toCode());

		/******************** medicinalproductspecialdesignation ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductSpecialDesignationComponent medicinalproductspecialdesignation = medicinalproduct.getSpecialDesignationFirstRep();

		/******************** medicinalproductspecialdesignationtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductspecialdesignationtype = medicinalproductspecialdesignation.getType();

		/******************** medicinalproductspecialdesignationtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductspecialdesignationtypecoding = medicinalproductspecialdesignationtype.getCodingFirstRep();

		/******************** MdcnlPrdct_SpclDsgnation_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductspecialdesignationtypecoding.hasDisplay()) {
			m.setMdcnlPrdctSpclDsgnationTypCdgDsply(String.valueOf(medicinalproductspecialdesignationtypecoding.getDisplay()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductspecialdesignationtypecoding.hasVersion()) {
			m.setMdcnlPrdctSpclDsgnationTypCdgVrsn(String.valueOf(medicinalproductspecialdesignationtypecoding.getVersion()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductspecialdesignationtypecoding.hasCode()) {
			m.setMdcnlPrdctSpclDsgnationTypCdgCd(String.valueOf(medicinalproductspecialdesignationtypecoding.getCode()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductspecialdesignationtypecoding.hasSystem()) {
			m.setMdcnlPrdctSpclDsgnationTypCdgSys(String.valueOf(medicinalproductspecialdesignationtypecoding.getSystem()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductspecialdesignationtypecoding.hasUserSelected()) {
			m.setMdcnlPrdctSpclDsgnationTypCdgUsrSltd(String.valueOf(medicinalproductspecialdesignationtypecoding.getUserSelected()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_Typ_Txt ********************************************************************************/
		if(medicinalproductspecialdesignationtype.hasText()) {
			m.setMdcnlPrdctSpclDsgnationTypTxt(String.valueOf(medicinalproductspecialdesignationtype.getText()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_Dt ********************************************************************************/
		if(medicinalproductspecialdesignation.hasDate()) {
			m.setMdcnlPrdctSpclDsgnationDt(String.valueOf(medicinalproductspecialdesignation.getDate()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_IndctnRfrnc ********************************************************************************/
		if(medicinalproductspecialdesignation.hasIndicationReference()) {
			m.setMdcnlPrdctSpclDsgnationIndctnRfrnc(String.valueOf(medicinalproductspecialdesignation.getIndicationReference()));
		}
		/******************** medicinalproductspecialdesignationindicationcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductspecialdesignationindicationcodeableconcept = medicinalproductspecialdesignation.getIndicationCodeableConcept();

		/******************** medicinalproductspecialdesignationindicationcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductspecialdesignationindicationcodeableconceptcoding = medicinalproductspecialdesignationindicationcodeableconcept.getCodingFirstRep();

		/******************** MdcnlPrdct_SpclDsgnation_IndctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(medicinalproductspecialdesignationindicationcodeableconceptcoding.hasDisplay()) {
			m.setMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgDsply(String.valueOf(medicinalproductspecialdesignationindicationcodeableconceptcoding.getDisplay()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_IndctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductspecialdesignationindicationcodeableconceptcoding.hasVersion()) {
			m.setMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgVrsn(String.valueOf(medicinalproductspecialdesignationindicationcodeableconceptcoding.getVersion()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_IndctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(medicinalproductspecialdesignationindicationcodeableconceptcoding.hasCode()) {
			m.setMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgCd(String.valueOf(medicinalproductspecialdesignationindicationcodeableconceptcoding.getCode()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_IndctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(medicinalproductspecialdesignationindicationcodeableconceptcoding.hasSystem()) {
			m.setMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgSys(String.valueOf(medicinalproductspecialdesignationindicationcodeableconceptcoding.getSystem()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_IndctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductspecialdesignationindicationcodeableconceptcoding.hasUserSelected()) {
			m.setMdcnlPrdctSpclDsgnationIndctnCdbleCncptCdgUsrSltd(String.valueOf(medicinalproductspecialdesignationindicationcodeableconceptcoding.getUserSelected()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_IndctnCdbleCncpt_Txt ********************************************************************************/
		if(medicinalproductspecialdesignationindicationcodeableconcept.hasText()) {
			m.setMdcnlPrdctSpclDsgnationIndctnCdbleCncptTxt(String.valueOf(medicinalproductspecialdesignationindicationcodeableconcept.getText()));
		}
		/******************** medicinalproductspecialdesignationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductspecialdesignationstatus = medicinalproductspecialdesignation.getStatus();

		/******************** medicinalproductspecialdesignationstatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductspecialdesignationstatuscoding = medicinalproductspecialdesignationstatus.getCodingFirstRep();

		/******************** MdcnlPrdct_SpclDsgnation_Sts_Cdg_Dsply ********************************************************************************/
		if(medicinalproductspecialdesignationstatuscoding.hasDisplay()) {
			m.setMdcnlPrdctSpclDsgnationStsCdgDsply(String.valueOf(medicinalproductspecialdesignationstatuscoding.getDisplay()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_Sts_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductspecialdesignationstatuscoding.hasVersion()) {
			m.setMdcnlPrdctSpclDsgnationStsCdgVrsn(String.valueOf(medicinalproductspecialdesignationstatuscoding.getVersion()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_Sts_Cdg_Cd ********************************************************************************/
		if(medicinalproductspecialdesignationstatuscoding.hasCode()) {
			m.setMdcnlPrdctSpclDsgnationStsCdgCd(String.valueOf(medicinalproductspecialdesignationstatuscoding.getCode()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_Sts_Cdg_Sys ********************************************************************************/
		if(medicinalproductspecialdesignationstatuscoding.hasSystem()) {
			m.setMdcnlPrdctSpclDsgnationStsCdgSys(String.valueOf(medicinalproductspecialdesignationstatuscoding.getSystem()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_Sts_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductspecialdesignationstatuscoding.hasUserSelected()) {
			m.setMdcnlPrdctSpclDsgnationStsCdgUsrSltd(String.valueOf(medicinalproductspecialdesignationstatuscoding.getUserSelected()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_Sts_Txt ********************************************************************************/
		if(medicinalproductspecialdesignationstatus.hasText()) {
			m.setMdcnlPrdctSpclDsgnationStsTxt(String.valueOf(medicinalproductspecialdesignationstatus.getText()));
		}
		/******************** medicinalproductspecialdesignationidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicinalproductspecialdesignationidentifier = medicinalproductspecialdesignation.getIdentifierFirstRep();

		/******************** MdcnlPrdct_SpclDsgnation_Id_Vl ********************************************************************************/
		if(medicinalproductspecialdesignationidentifier.hasValue()) {
			m.setMdcnlPrdctSpclDsgnationIdVl(String.valueOf(medicinalproductspecialdesignationidentifier.getValue()));
		}
		/******************** medicinalproductspecialdesignationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductspecialdesignationidentifiertype = medicinalproductspecialdesignationidentifier.getType();

		/******************** medicinalproductspecialdesignationidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductspecialdesignationidentifiertypecoding = medicinalproductspecialdesignationidentifiertype.getCodingFirstRep();

		/******************** MdcnlPrdct_SpclDsgnation_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductspecialdesignationidentifiertypecoding.hasDisplay()) {
			m.setMdcnlPrdctSpclDsgnationIdTypCdgDsply(String.valueOf(medicinalproductspecialdesignationidentifiertypecoding.getDisplay()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductspecialdesignationidentifiertypecoding.hasVersion()) {
			m.setMdcnlPrdctSpclDsgnationIdTypCdgVrsn(String.valueOf(medicinalproductspecialdesignationidentifiertypecoding.getVersion()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_Id_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductspecialdesignationidentifiertypecoding.hasCode()) {
			m.setMdcnlPrdctSpclDsgnationIdTypCdgCd(String.valueOf(medicinalproductspecialdesignationidentifiertypecoding.getCode()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_Id_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductspecialdesignationidentifiertypecoding.hasSystem()) {
			m.setMdcnlPrdctSpclDsgnationIdTypCdgSys(String.valueOf(medicinalproductspecialdesignationidentifiertypecoding.getSystem()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductspecialdesignationidentifiertypecoding.hasUserSelected()) {
			m.setMdcnlPrdctSpclDsgnationIdTypCdgUsrSltd(String.valueOf(medicinalproductspecialdesignationidentifiertypecoding.getUserSelected()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_Id_Typ_Txt ********************************************************************************/
		if(medicinalproductspecialdesignationidentifiertype.hasText()) {
			m.setMdcnlPrdctSpclDsgnationIdTypTxt(String.valueOf(medicinalproductspecialdesignationidentifiertype.getText()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_Id_Sys ********************************************************************************/
		if(medicinalproductspecialdesignationidentifier.hasSystem()) {
			m.setMdcnlPrdctSpclDsgnationIdSys(String.valueOf(medicinalproductspecialdesignationidentifier.getSystem()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_Id_Assigner ********************************************************************************/
		if(medicinalproductspecialdesignationidentifier.hasAssigner()) {
			m.setMdcnlPrdctSpclDsgnationIdAssigner(String.valueOf(medicinalproductspecialdesignationidentifier.getAssigner()));
		}
		/******************** medicinalproductspecialdesignationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductspecialdesignationidentifierperiod = medicinalproductspecialdesignationidentifier.getPeriod();

		/******************** MdcnlPrdct_SpclDsgnation_Id_Prd_End ********************************************************************************/
		if(medicinalproductspecialdesignationidentifierperiod.hasEnd()) {
			m.setMdcnlPrdctSpclDsgnationIdPrdEnd(String.valueOf(medicinalproductspecialdesignationidentifierperiod.getEnd()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_Id_Prd_Strt ********************************************************************************/
		if(medicinalproductspecialdesignationidentifierperiod.hasStart()) {
			m.setMdcnlPrdctSpclDsgnationIdPrdStrt(String.valueOf(medicinalproductspecialdesignationidentifierperiod.getStart()));
		}
		/******************** medicinalproductspecialdesignationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicinalproductspecialdesignationidentifieruse = medicinalproductspecialdesignationidentifier.getUse();
		m.setMdcnlPrdctSpclDsgnationIdUse(medicinalproductspecialdesignationidentifieruse.toCode());

		/******************** medicinalproductspecialdesignationspecies ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductspecialdesignationspecies = medicinalproductspecialdesignation.getSpecies();

		/******************** medicinalproductspecialdesignationspeciescoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductspecialdesignationspeciescoding = medicinalproductspecialdesignationspecies.getCodingFirstRep();

		/******************** MdcnlPrdct_SpclDsgnation_Spcs_Cdg_Dsply ********************************************************************************/
		if(medicinalproductspecialdesignationspeciescoding.hasDisplay()) {
			m.setMdcnlPrdctSpclDsgnationSpcsCdgDsply(String.valueOf(medicinalproductspecialdesignationspeciescoding.getDisplay()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_Spcs_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductspecialdesignationspeciescoding.hasVersion()) {
			m.setMdcnlPrdctSpclDsgnationSpcsCdgVrsn(String.valueOf(medicinalproductspecialdesignationspeciescoding.getVersion()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_Spcs_Cdg_Cd ********************************************************************************/
		if(medicinalproductspecialdesignationspeciescoding.hasCode()) {
			m.setMdcnlPrdctSpclDsgnationSpcsCdgCd(String.valueOf(medicinalproductspecialdesignationspeciescoding.getCode()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_Spcs_Cdg_Sys ********************************************************************************/
		if(medicinalproductspecialdesignationspeciescoding.hasSystem()) {
			m.setMdcnlPrdctSpclDsgnationSpcsCdgSys(String.valueOf(medicinalproductspecialdesignationspeciescoding.getSystem()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_Spcs_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductspecialdesignationspeciescoding.hasUserSelected()) {
			m.setMdcnlPrdctSpclDsgnationSpcsCdgUsrSltd(String.valueOf(medicinalproductspecialdesignationspeciescoding.getUserSelected()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_Spcs_Txt ********************************************************************************/
		if(medicinalproductspecialdesignationspecies.hasText()) {
			m.setMdcnlPrdctSpclDsgnationSpcsTxt(String.valueOf(medicinalproductspecialdesignationspecies.getText()));
		}
		/******************** medicinalproductspecialdesignationintendeduse ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductspecialdesignationintendeduse = medicinalproductspecialdesignation.getIntendedUse();

		/******************** medicinalproductspecialdesignationintendedusecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductspecialdesignationintendedusecoding = medicinalproductspecialdesignationintendeduse.getCodingFirstRep();

		/******************** MdcnlPrdct_SpclDsgnation_IntendedUse_Cdg_Dsply ********************************************************************************/
		if(medicinalproductspecialdesignationintendedusecoding.hasDisplay()) {
			m.setMdcnlPrdctSpclDsgnationIntendedUseCdgDsply(String.valueOf(medicinalproductspecialdesignationintendedusecoding.getDisplay()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_IntendedUse_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductspecialdesignationintendedusecoding.hasVersion()) {
			m.setMdcnlPrdctSpclDsgnationIntendedUseCdgVrsn(String.valueOf(medicinalproductspecialdesignationintendedusecoding.getVersion()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_IntendedUse_Cdg_Cd ********************************************************************************/
		if(medicinalproductspecialdesignationintendedusecoding.hasCode()) {
			m.setMdcnlPrdctSpclDsgnationIntendedUseCdgCd(String.valueOf(medicinalproductspecialdesignationintendedusecoding.getCode()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_IntendedUse_Cdg_Sys ********************************************************************************/
		if(medicinalproductspecialdesignationintendedusecoding.hasSystem()) {
			m.setMdcnlPrdctSpclDsgnationIntendedUseCdgSys(String.valueOf(medicinalproductspecialdesignationintendedusecoding.getSystem()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_IntendedUse_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductspecialdesignationintendedusecoding.hasUserSelected()) {
			m.setMdcnlPrdctSpclDsgnationIntendedUseCdgUsrSltd(String.valueOf(medicinalproductspecialdesignationintendedusecoding.getUserSelected()));
		}
		/******************** MdcnlPrdct_SpclDsgnation_IntendedUse_Txt ********************************************************************************/
		if(medicinalproductspecialdesignationintendeduse.hasText()) {
			m.setMdcnlPrdctSpclDsgnationIntendedUseTxt(String.valueOf(medicinalproductspecialdesignationintendeduse.getText()));
		}
		/******************** medicinalproductdomain ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductdomain = medicinalproduct.getDomain();

		/******************** MdcnlPrdct_Domain_Dsply ********************************************************************************/
		if(medicinalproductdomain.hasDisplay()) {
			m.setMdcnlPrdctDomainDsply(String.valueOf(medicinalproductdomain.getDisplay()));
		}
		/******************** MdcnlPrdct_Domain_Vrsn ********************************************************************************/
		if(medicinalproductdomain.hasVersion()) {
			m.setMdcnlPrdctDomainVrsn(String.valueOf(medicinalproductdomain.getVersion()));
		}
		/******************** MdcnlPrdct_Domain_Cd ********************************************************************************/
		if(medicinalproductdomain.hasCode()) {
			m.setMdcnlPrdctDomainCd(String.valueOf(medicinalproductdomain.getCode()));
		}
		/******************** MdcnlPrdct_Domain_Sys ********************************************************************************/
		if(medicinalproductdomain.hasSystem()) {
			m.setMdcnlPrdctDomainSys(String.valueOf(medicinalproductdomain.getSystem()));
		}
		/******************** MdcnlPrdct_Domain_UsrSltd ********************************************************************************/
		if(medicinalproductdomain.hasUserSelected()) {
			m.setMdcnlPrdctDomainUsrSltd(String.valueOf(medicinalproductdomain.getUserSelected()));
		}
		/******************** medicinalproductidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicinalproductidentifier = medicinalproduct.getIdentifierFirstRep();

		/******************** MdcnlPrdct_Id_Vl ********************************************************************************/
		if(medicinalproductidentifier.hasValue()) {
			m.setMdcnlPrdctIdVl(String.valueOf(medicinalproductidentifier.getValue()));
		}
		/******************** medicinalproductidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductidentifiertype = medicinalproductidentifier.getType();

		/******************** medicinalproductidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductidentifiertypecoding = medicinalproductidentifiertype.getCodingFirstRep();

		/******************** MdcnlPrdct_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductidentifiertypecoding.hasDisplay()) {
			m.setMdcnlPrdctIdTypCdgDsply(String.valueOf(medicinalproductidentifiertypecoding.getDisplay()));
		}
		/******************** MdcnlPrdct_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductidentifiertypecoding.hasVersion()) {
			m.setMdcnlPrdctIdTypCdgVrsn(String.valueOf(medicinalproductidentifiertypecoding.getVersion()));
		}
		/******************** MdcnlPrdct_Id_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductidentifiertypecoding.hasCode()) {
			m.setMdcnlPrdctIdTypCdgCd(String.valueOf(medicinalproductidentifiertypecoding.getCode()));
		}
		/******************** MdcnlPrdct_Id_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductidentifiertypecoding.hasSystem()) {
			m.setMdcnlPrdctIdTypCdgSys(String.valueOf(medicinalproductidentifiertypecoding.getSystem()));
		}
		/******************** MdcnlPrdct_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductidentifiertypecoding.hasUserSelected()) {
			m.setMdcnlPrdctIdTypCdgUsrSltd(String.valueOf(medicinalproductidentifiertypecoding.getUserSelected()));
		}
		/******************** MdcnlPrdct_Id_Typ_Txt ********************************************************************************/
		if(medicinalproductidentifiertype.hasText()) {
			m.setMdcnlPrdctIdTypTxt(String.valueOf(medicinalproductidentifiertype.getText()));
		}
		/******************** MdcnlPrdct_Id_Sys ********************************************************************************/
		if(medicinalproductidentifier.hasSystem()) {
			m.setMdcnlPrdctIdSys(String.valueOf(medicinalproductidentifier.getSystem()));
		}
		/******************** MdcnlPrdct_Id_Assigner ********************************************************************************/
		if(medicinalproductidentifier.hasAssigner()) {
			m.setMdcnlPrdctIdAssigner(String.valueOf(medicinalproductidentifier.getAssigner()));
		}
		/******************** medicinalproductidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductidentifierperiod = medicinalproductidentifier.getPeriod();

		/******************** MdcnlPrdct_Id_Prd_End ********************************************************************************/
		if(medicinalproductidentifierperiod.hasEnd()) {
			m.setMdcnlPrdctIdPrdEnd(String.valueOf(medicinalproductidentifierperiod.getEnd()));
		}
		/******************** MdcnlPrdct_Id_Prd_Strt ********************************************************************************/
		if(medicinalproductidentifierperiod.hasStart()) {
			m.setMdcnlPrdctIdPrdStrt(String.valueOf(medicinalproductidentifierperiod.getStart()));
		}
		/******************** medicinalproductidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicinalproductidentifieruse = medicinalproductidentifier.getUse();
		m.setMdcnlPrdctIdUse(medicinalproductidentifieruse.toCode());

		/******************** medicinalproductname ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductNameComponent medicinalproductname = medicinalproduct.getNameFirstRep();

		/******************** MdcnlPrdct_Nm_PrdctNm ********************************************************************************/
		if(medicinalproductname.hasProductName()) {
			m.setMdcnlPrdctNmPrdctNm(String.valueOf(medicinalproductname.getProductName()));
		}
		/******************** medicinalproductnamenamepart ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductNameNamePartComponent medicinalproductnamenamepart = medicinalproductname.getNamePartFirstRep();

		/******************** medicinalproductnamenameparttype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductnamenameparttype = medicinalproductnamenamepart.getType();

		/******************** MdcnlPrdct_Nm_NmPart_Typ_Dsply ********************************************************************************/
		if(medicinalproductnamenameparttype.hasDisplay()) {
			m.setMdcnlPrdctNmNmPartTypDsply(String.valueOf(medicinalproductnamenameparttype.getDisplay()));
		}
		/******************** MdcnlPrdct_Nm_NmPart_Typ_Vrsn ********************************************************************************/
		if(medicinalproductnamenameparttype.hasVersion()) {
			m.setMdcnlPrdctNmNmPartTypVrsn(String.valueOf(medicinalproductnamenameparttype.getVersion()));
		}
		/******************** MdcnlPrdct_Nm_NmPart_Typ_Cd ********************************************************************************/
		if(medicinalproductnamenameparttype.hasCode()) {
			m.setMdcnlPrdctNmNmPartTypCd(String.valueOf(medicinalproductnamenameparttype.getCode()));
		}
		/******************** MdcnlPrdct_Nm_NmPart_Typ_Sys ********************************************************************************/
		if(medicinalproductnamenameparttype.hasSystem()) {
			m.setMdcnlPrdctNmNmPartTypSys(String.valueOf(medicinalproductnamenameparttype.getSystem()));
		}
		/******************** MdcnlPrdct_Nm_NmPart_Typ_UsrSltd ********************************************************************************/
		if(medicinalproductnamenameparttype.hasUserSelected()) {
			m.setMdcnlPrdctNmNmPartTypUsrSltd(String.valueOf(medicinalproductnamenameparttype.getUserSelected()));
		}
		/******************** MdcnlPrdct_Nm_NmPart_Part ********************************************************************************/
		if(medicinalproductnamenamepart.hasPart()) {
			m.setMdcnlPrdctNmNmPartPart(String.valueOf(medicinalproductnamenamepart.getPart()));
		}
		/******************** medicinalproductnamecountrylanguage ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductNameCountryLanguageComponent medicinalproductnamecountrylanguage = medicinalproductname.getCountryLanguageFirstRep();

		/******************** medicinalproductnamecountrylanguagelanguage ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductnamecountrylanguagelanguage = medicinalproductnamecountrylanguage.getLanguage();

		/******************** medicinalproductnamecountrylanguagelanguagecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductnamecountrylanguagelanguagecoding = medicinalproductnamecountrylanguagelanguage.getCodingFirstRep();

		/******************** MdcnlPrdct_Nm_CntryLnguage_Lnguage_Cdg_Dsply ********************************************************************************/
		if(medicinalproductnamecountrylanguagelanguagecoding.hasDisplay()) {
			m.setMdcnlPrdctNmCntryLnguageLnguageCdgDsply(String.valueOf(medicinalproductnamecountrylanguagelanguagecoding.getDisplay()));
		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Lnguage_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductnamecountrylanguagelanguagecoding.hasVersion()) {
			m.setMdcnlPrdctNmCntryLnguageLnguageCdgVrsn(String.valueOf(medicinalproductnamecountrylanguagelanguagecoding.getVersion()));
		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Lnguage_Cdg_Cd ********************************************************************************/
		if(medicinalproductnamecountrylanguagelanguagecoding.hasCode()) {
			m.setMdcnlPrdctNmCntryLnguageLnguageCdgCd(String.valueOf(medicinalproductnamecountrylanguagelanguagecoding.getCode()));
		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Lnguage_Cdg_Sys ********************************************************************************/
		if(medicinalproductnamecountrylanguagelanguagecoding.hasSystem()) {
			m.setMdcnlPrdctNmCntryLnguageLnguageCdgSys(String.valueOf(medicinalproductnamecountrylanguagelanguagecoding.getSystem()));
		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Lnguage_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductnamecountrylanguagelanguagecoding.hasUserSelected()) {
			m.setMdcnlPrdctNmCntryLnguageLnguageCdgUsrSltd(String.valueOf(medicinalproductnamecountrylanguagelanguagecoding.getUserSelected()));
		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Lnguage_Txt ********************************************************************************/
		if(medicinalproductnamecountrylanguagelanguage.hasText()) {
			m.setMdcnlPrdctNmCntryLnguageLnguageTxt(String.valueOf(medicinalproductnamecountrylanguagelanguage.getText()));
		}
		/******************** medicinalproductnamecountrylanguagecountry ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductnamecountrylanguagecountry = medicinalproductnamecountrylanguage.getCountry();

		/******************** medicinalproductnamecountrylanguagecountrycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductnamecountrylanguagecountrycoding = medicinalproductnamecountrylanguagecountry.getCodingFirstRep();

		/******************** MdcnlPrdct_Nm_CntryLnguage_Cntry_Cdg_Dsply ********************************************************************************/
		if(medicinalproductnamecountrylanguagecountrycoding.hasDisplay()) {
			m.setMdcnlPrdctNmCntryLnguageCntryCdgDsply(String.valueOf(medicinalproductnamecountrylanguagecountrycoding.getDisplay()));
		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Cntry_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductnamecountrylanguagecountrycoding.hasVersion()) {
			m.setMdcnlPrdctNmCntryLnguageCntryCdgVrsn(String.valueOf(medicinalproductnamecountrylanguagecountrycoding.getVersion()));
		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Cntry_Cdg_Cd ********************************************************************************/
		if(medicinalproductnamecountrylanguagecountrycoding.hasCode()) {
			m.setMdcnlPrdctNmCntryLnguageCntryCdgCd(String.valueOf(medicinalproductnamecountrylanguagecountrycoding.getCode()));
		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Cntry_Cdg_Sys ********************************************************************************/
		if(medicinalproductnamecountrylanguagecountrycoding.hasSystem()) {
			m.setMdcnlPrdctNmCntryLnguageCntryCdgSys(String.valueOf(medicinalproductnamecountrylanguagecountrycoding.getSystem()));
		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Cntry_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductnamecountrylanguagecountrycoding.hasUserSelected()) {
			m.setMdcnlPrdctNmCntryLnguageCntryCdgUsrSltd(String.valueOf(medicinalproductnamecountrylanguagecountrycoding.getUserSelected()));
		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Cntry_Txt ********************************************************************************/
		if(medicinalproductnamecountrylanguagecountry.hasText()) {
			m.setMdcnlPrdctNmCntryLnguageCntryTxt(String.valueOf(medicinalproductnamecountrylanguagecountry.getText()));
		}
		/******************** medicinalproductnamecountrylanguagejurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductnamecountrylanguagejurisdiction = medicinalproductnamecountrylanguage.getJurisdiction();

		/******************** medicinalproductnamecountrylanguagejurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductnamecountrylanguagejurisdictioncoding = medicinalproductnamecountrylanguagejurisdiction.getCodingFirstRep();

		/******************** MdcnlPrdct_Nm_CntryLnguage_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(medicinalproductnamecountrylanguagejurisdictioncoding.hasDisplay()) {
			m.setMdcnlPrdctNmCntryLnguageJrsdctnCdgDsply(String.valueOf(medicinalproductnamecountrylanguagejurisdictioncoding.getDisplay()));
		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductnamecountrylanguagejurisdictioncoding.hasVersion()) {
			m.setMdcnlPrdctNmCntryLnguageJrsdctnCdgVrsn(String.valueOf(medicinalproductnamecountrylanguagejurisdictioncoding.getVersion()));
		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(medicinalproductnamecountrylanguagejurisdictioncoding.hasCode()) {
			m.setMdcnlPrdctNmCntryLnguageJrsdctnCdgCd(String.valueOf(medicinalproductnamecountrylanguagejurisdictioncoding.getCode()));
		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(medicinalproductnamecountrylanguagejurisdictioncoding.hasSystem()) {
			m.setMdcnlPrdctNmCntryLnguageJrsdctnCdgSys(String.valueOf(medicinalproductnamecountrylanguagejurisdictioncoding.getSystem()));
		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductnamecountrylanguagejurisdictioncoding.hasUserSelected()) {
			m.setMdcnlPrdctNmCntryLnguageJrsdctnCdgUsrSltd(String.valueOf(medicinalproductnamecountrylanguagejurisdictioncoding.getUserSelected()));
		}
		/******************** MdcnlPrdct_Nm_CntryLnguage_Jrsdctn_Txt ********************************************************************************/
		if(medicinalproductnamecountrylanguagejurisdiction.hasText()) {
			m.setMdcnlPrdctNmCntryLnguageJrsdctnTxt(String.valueOf(medicinalproductnamecountrylanguagejurisdiction.getText()));
		}
		/******************** medicinalproductmanufacturingbusinessoperation ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProduct.MedicinalProductManufacturingBusinessOperationComponent medicinalproductmanufacturingbusinessoperation = medicinalproduct.getManufacturingBusinessOperationFirstRep();

		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_Manufacturer ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperation.hasManufacturer()) {
			m.setMdcnlPrdctMnfctrngBsnssOprtnManufacturer(String.valueOf(medicinalproductmanufacturingbusinessoperation.getManufacturerFirstRep()));
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_Regulator ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperation.hasRegulator()) {
			m.setMdcnlPrdctMnfctrngBsnssOprtnRegulator(String.valueOf(medicinalproductmanufacturingbusinessoperation.getRegulator()));
		}
		/******************** medicinalproductmanufacturingbusinessoperationconfidentialityindicator ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductmanufacturingbusinessoperationconfidentialityindicator = medicinalproductmanufacturingbusinessoperation.getConfidentialityIndicator();

		/******************** medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcoding = medicinalproductmanufacturingbusinessoperationconfidentialityindicator.getCodingFirstRep();

		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_CnfdntltyIndctr_Cdg_Dsply ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcoding.hasDisplay()) {
			m.setMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgDsply(String.valueOf(medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcoding.getDisplay()));
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_CnfdntltyIndctr_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcoding.hasVersion()) {
			m.setMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgVrsn(String.valueOf(medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcoding.getVersion()));
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_CnfdntltyIndctr_Cdg_Cd ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcoding.hasCode()) {
			m.setMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgCd(String.valueOf(medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcoding.getCode()));
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_CnfdntltyIndctr_Cdg_Sys ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcoding.hasSystem()) {
			m.setMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgSys(String.valueOf(medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcoding.getSystem()));
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_CnfdntltyIndctr_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcoding.hasUserSelected()) {
			m.setMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrCdgUsrSltd(String.valueOf(medicinalproductmanufacturingbusinessoperationconfidentialityindicatorcoding.getUserSelected()));
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_CnfdntltyIndctr_Txt ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationconfidentialityindicator.hasText()) {
			m.setMdcnlPrdctMnfctrngBsnssOprtnCnfdntltyIndctrTxt(String.valueOf(medicinalproductmanufacturingbusinessoperationconfidentialityindicator.getText()));
		}
		/******************** medicinalproductmanufacturingbusinessoperationauthorisationreferencenumber ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicinalproductmanufacturingbusinessoperationauthorisationreferencenumber = medicinalproductmanufacturingbusinessoperation.getAuthorisationReferenceNumber();

		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Vl ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumber.hasValue()) {
			m.setMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrVl(String.valueOf(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumber.getValue()));
		}
		/******************** medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertype = medicinalproductmanufacturingbusinessoperationauthorisationreferencenumber.getType();

		/******************** medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecoding = medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertype.getCodingFirstRep();

		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecoding.hasDisplay()) {
			m.setMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgDsply(String.valueOf(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecoding.getDisplay()));
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecoding.hasVersion()) {
			m.setMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgVrsn(String.valueOf(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecoding.getVersion()));
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecoding.hasCode()) {
			m.setMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgCd(String.valueOf(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecoding.getCode()));
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecoding.hasSystem()) {
			m.setMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgSys(String.valueOf(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecoding.getSystem()));
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Typ_Cdg_US ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecoding.hasUserSelected()) {
			m.setMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypCdgUs(String.valueOf(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertypecoding.getUserSelected()));
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Typ_Txt ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertype.hasText()) {
			m.setMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrTypTxt(String.valueOf(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumbertype.getText()));
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Sys ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumber.hasSystem()) {
			m.setMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrSys(String.valueOf(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumber.getSystem()));
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Assigner ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumber.hasAssigner()) {
			m.setMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrAssigner(String.valueOf(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumber.getAssigner()));
		}
		/******************** medicinalproductmanufacturingbusinessoperationauthorisationreferencenumberperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductmanufacturingbusinessoperationauthorisationreferencenumberperiod = medicinalproductmanufacturingbusinessoperationauthorisationreferencenumber.getPeriod();

		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Prd_End ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumberperiod.hasEnd()) {
			m.setMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrPrdEnd(String.valueOf(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumberperiod.getEnd()));
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Prd_Strt ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumberperiod.hasStart()) {
			m.setMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrPrdStrt(String.valueOf(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumberperiod.getStart()));
		}
		/******************** medicinalproductmanufacturingbusinessoperationauthorisationreferencenumberuse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicinalproductmanufacturingbusinessoperationauthorisationreferencenumberuse = medicinalproductmanufacturingbusinessoperationauthorisationreferencenumber.getUse();
		m.setMdcnlPrdctMnfctrngBsnssOprtnAthrisationRfrncNmbrUse(medicinalproductmanufacturingbusinessoperationauthorisationreferencenumberuse.toCode());

		/******************** medicinalproductmanufacturingbusinessoperationoperationtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductmanufacturingbusinessoperationoperationtype = medicinalproductmanufacturingbusinessoperation.getOperationType();

		/******************** medicinalproductmanufacturingbusinessoperationoperationtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductmanufacturingbusinessoperationoperationtypecoding = medicinalproductmanufacturingbusinessoperationoperationtype.getCodingFirstRep();

		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_OprtnTyp_Cdg_Dsply ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationoperationtypecoding.hasDisplay()) {
			m.setMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgDsply(String.valueOf(medicinalproductmanufacturingbusinessoperationoperationtypecoding.getDisplay()));
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_OprtnTyp_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationoperationtypecoding.hasVersion()) {
			m.setMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgVrsn(String.valueOf(medicinalproductmanufacturingbusinessoperationoperationtypecoding.getVersion()));
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_OprtnTyp_Cdg_Cd ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationoperationtypecoding.hasCode()) {
			m.setMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgCd(String.valueOf(medicinalproductmanufacturingbusinessoperationoperationtypecoding.getCode()));
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_OprtnTyp_Cdg_Sys ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationoperationtypecoding.hasSystem()) {
			m.setMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgSys(String.valueOf(medicinalproductmanufacturingbusinessoperationoperationtypecoding.getSystem()));
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_OprtnTyp_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationoperationtypecoding.hasUserSelected()) {
			m.setMdcnlPrdctMnfctrngBsnssOprtnOprtnTypCdgUsrSltd(String.valueOf(medicinalproductmanufacturingbusinessoperationoperationtypecoding.getUserSelected()));
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_OprtnTyp_Txt ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperationoperationtype.hasText()) {
			m.setMdcnlPrdctMnfctrngBsnssOprtnOprtnTypTxt(String.valueOf(medicinalproductmanufacturingbusinessoperationoperationtype.getText()));
		}
		/******************** MdcnlPrdct_MnfctrngBsnssOprtn_EfctiveDt ********************************************************************************/
		if(medicinalproductmanufacturingbusinessoperation.hasEffectiveDate()) {
			m.setMdcnlPrdctMnfctrngBsnssOprtnEfctiveDt(String.valueOf(medicinalproductmanufacturingbusinessoperation.getEffectiveDate()));
		}
		/******************** MdcnlPrdct_PckgedMdcnlPrdct ********************************************************************************/
		if(medicinalproduct.hasPackagedMedicinalProduct()) {
			m.setMdcnlPrdctPckgedMdcnlPrdct(String.valueOf(medicinalproduct.getPackagedMedicinalProductFirstRep()));
		}
		return m;
	}
}
