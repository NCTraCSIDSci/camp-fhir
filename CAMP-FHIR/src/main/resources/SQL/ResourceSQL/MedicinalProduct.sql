drop table if exists `MedicinalProduct`;
CREATE TABLE `MedicinalProduct` (
 id varchar(64),
MdcnlPrdct_AddtnlMonitoringIndicator_Cdg_Cd TEXT COMMENT 'MedicinalProduct.AdditionalMonitoringIndicator.Coding.Code',
MdcnlPrdct_AddtnlMonitoringIndicator_Cdg_Dsply TEXT COMMENT 'MedicinalProduct.AdditionalMonitoringIndicator.Coding.Display',
MdcnlPrdct_AddtnlMonitoringIndicator_Cdg_Sys TEXT COMMENT 'MedicinalProduct.AdditionalMonitoringIndicator.Coding.System',
MdcnlPrdct_AddtnlMonitoringIndicator_Cdg_UsrSltd TEXT COMMENT 'MedicinalProduct.AdditionalMonitoringIndicator.Coding.UserSelected',
MdcnlPrdct_AddtnlMonitoringIndicator_Cdg_Vrsn TEXT COMMENT 'MedicinalProduct.AdditionalMonitoringIndicator.Coding.Version',
MdcnlPrdct_AddtnlMonitoringIndicator_Txt TEXT COMMENT 'MedicinalProduct.AdditionalMonitoringIndicator.Text',
MdcnlPrdct_AttachedDoc TEXT COMMENT 'MedicinalProduct.AttachedDocument',
MdcnlPrdct_ClnclTrial TEXT COMMENT 'MedicinalProduct.ClinicalTrial',
MdcnlPrdct_CombinedPhrmctclDoseFrm_Cdg_Cd TEXT COMMENT 'MedicinalProduct.CombinedPharmaceuticalDoseForm.Coding.Code',
MdcnlPrdct_CombinedPhrmctclDoseFrm_Cdg_Dsply TEXT COMMENT 'MedicinalProduct.CombinedPharmaceuticalDoseForm.Coding.Display',
MdcnlPrdct_CombinedPhrmctclDoseFrm_Cdg_Sys TEXT COMMENT 'MedicinalProduct.CombinedPharmaceuticalDoseForm.Coding.System',
MdcnlPrdct_CombinedPhrmctclDoseFrm_Cdg_UsrSltd TEXT COMMENT 'MedicinalProduct.CombinedPharmaceuticalDoseForm.Coding.UserSelected',
MdcnlPrdct_CombinedPhrmctclDoseFrm_Cdg_Vrsn TEXT COMMENT 'MedicinalProduct.CombinedPharmaceuticalDoseForm.Coding.Version',
MdcnlPrdct_CombinedPhrmctclDoseFrm_Txt TEXT COMMENT 'MedicinalProduct.CombinedPharmaceuticalDoseForm.Text',
MdcnlPrdct_Cntct TEXT COMMENT 'MedicinalProduct.Contact',
MdcnlPrdct_CrossRfrnc_Assigner TEXT COMMENT 'MedicinalProduct.CrossReference.Assigner',
MdcnlPrdct_CrossRfrnc_Prd_End TEXT COMMENT 'MedicinalProduct.CrossReference.Period.End',
MdcnlPrdct_CrossRfrnc_Prd_Strt TEXT COMMENT 'MedicinalProduct.CrossReference.Period.Start',
MdcnlPrdct_CrossRfrnc_Sys TEXT COMMENT 'MedicinalProduct.CrossReference.System',
MdcnlPrdct_CrossRfrnc_Typ_Cdg_Cd TEXT COMMENT 'MedicinalProduct.CrossReference.Type.Coding.Code',
MdcnlPrdct_CrossRfrnc_Typ_Cdg_Dsply TEXT COMMENT 'MedicinalProduct.CrossReference.Type.Coding.Display',
MdcnlPrdct_CrossRfrnc_Typ_Cdg_Sys TEXT COMMENT 'MedicinalProduct.CrossReference.Type.Coding.System',
MdcnlPrdct_CrossRfrnc_Typ_Cdg_UsrSltd TEXT COMMENT 'MedicinalProduct.CrossReference.Type.Coding.UserSelected',
MdcnlPrdct_CrossRfrnc_Typ_Cdg_Vrsn TEXT COMMENT 'MedicinalProduct.CrossReference.Type.Coding.Version',
MdcnlPrdct_CrossRfrnc_Typ_Txt TEXT COMMENT 'MedicinalProduct.CrossReference.Type.Text',
MdcnlPrdct_CrossRfrnc_Use TEXT COMMENT 'MedicinalProduct.CrossReference.Use',
MdcnlPrdct_CrossRfrnc_Vl TEXT COMMENT 'MedicinalProduct.CrossReference.Value',
MdcnlPrdct_Domain_Cd TEXT COMMENT 'MedicinalProduct.Domain.Code',
MdcnlPrdct_Domain_Dsply TEXT COMMENT 'MedicinalProduct.Domain.Display',
MdcnlPrdct_Domain_Sys TEXT COMMENT 'MedicinalProduct.Domain.System',
MdcnlPrdct_Domain_UsrSltd TEXT COMMENT 'MedicinalProduct.Domain.UserSelected',
MdcnlPrdct_Domain_Vrsn TEXT COMMENT 'MedicinalProduct.Domain.Version',
MdcnlPrdct_Id_Assigner TEXT COMMENT 'MedicinalProduct.Identifier.Assigner',
MdcnlPrdct_Id_Prd_End TEXT COMMENT 'MedicinalProduct.Identifier.Period.End',
MdcnlPrdct_Id_Prd_Strt TEXT COMMENT 'MedicinalProduct.Identifier.Period.Start',
MdcnlPrdct_Id_Sys TEXT COMMENT 'MedicinalProduct.Identifier.System',
MdcnlPrdct_Id_Typ_Cdg_Cd TEXT COMMENT 'MedicinalProduct.Identifier.Type.Coding.Code',
MdcnlPrdct_Id_Typ_Cdg_Dsply TEXT COMMENT 'MedicinalProduct.Identifier.Type.Coding.Display',
MdcnlPrdct_Id_Typ_Cdg_Sys TEXT COMMENT 'MedicinalProduct.Identifier.Type.Coding.System',
MdcnlPrdct_Id_Typ_Cdg_UsrSltd TEXT COMMENT 'MedicinalProduct.Identifier.Type.Coding.UserSelected',
MdcnlPrdct_Id_Typ_Cdg_Vrsn TEXT COMMENT 'MedicinalProduct.Identifier.Type.Coding.Version',
MdcnlPrdct_Id_Typ_Txt TEXT COMMENT 'MedicinalProduct.Identifier.Type.Text',
MdcnlPrdct_Id_Use TEXT COMMENT 'MedicinalProduct.Identifier.Use',
MdcnlPrdct_Id_Vl TEXT COMMENT 'MedicinalProduct.Identifier.Value',
MdcnlPrdct_LegalStsOfSpply_Cdg_Cd TEXT COMMENT 'MedicinalProduct.LegalStatusOfSupply.Coding.Code',
MdcnlPrdct_LegalStsOfSpply_Cdg_Dsply TEXT COMMENT 'MedicinalProduct.LegalStatusOfSupply.Coding.Display',
MdcnlPrdct_LegalStsOfSpply_Cdg_Sys TEXT COMMENT 'MedicinalProduct.LegalStatusOfSupply.Coding.System',
MdcnlPrdct_LegalStsOfSpply_Cdg_UsrSltd TEXT COMMENT 'MedicinalProduct.LegalStatusOfSupply.Coding.UserSelected',
MdcnlPrdct_LegalStsOfSpply_Cdg_Vrsn TEXT COMMENT 'MedicinalProduct.LegalStatusOfSupply.Coding.Version',
MdcnlPrdct_LegalStsOfSpply_Txt TEXT COMMENT 'MedicinalProduct.LegalStatusOfSupply.Text',
MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Assigner TEXT COMMENT 'MedicinalProduct.ManufacturingBusinessOperation.AuthorisationReferenceNumber.Assigner',
MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Prd_End TEXT COMMENT 'MedicinalProduct.ManufacturingBusinessOperation.AuthorisationReferenceNumber.Period.End',
MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Prd_Strt TEXT COMMENT 'MedicinalProduct.ManufacturingBusinessOperation.AuthorisationReferenceNumber.Period.Start',
MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Sys TEXT COMMENT 'MedicinalProduct.ManufacturingBusinessOperation.AuthorisationReferenceNumber.System',
MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Typ_Cdg_Cd TEXT COMMENT 'MedicinalProduct.ManufacturingBusinessOperation.AuthorisationReferenceNumber.Type.Coding.Code',
MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Typ_Cdg_Dsply TEXT COMMENT 'MedicinalProduct.ManufacturingBusinessOperation.AuthorisationReferenceNumber.Type.Coding.Display',
MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Typ_Cdg_Sys TEXT COMMENT 'MedicinalProduct.ManufacturingBusinessOperation.AuthorisationReferenceNumber.Type.Coding.System',
MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Typ_Cdg_US TEXT COMMENT 'MedicinalProduct.ManufacturingBusinessOperation.AuthorisationReferenceNumber.Type.Coding.UserSelected',
MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Typ_Cdg_Vrsn TEXT COMMENT 'MedicinalProduct.ManufacturingBusinessOperation.AuthorisationReferenceNumber.Type.Coding.Version',
MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Typ_Txt TEXT COMMENT 'MedicinalProduct.ManufacturingBusinessOperation.AuthorisationReferenceNumber.Type.Text',
MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Use TEXT COMMENT 'MedicinalProduct.ManufacturingBusinessOperation.AuthorisationReferenceNumber.Use',
MdcnlPrdct_MnfctrngBsnssOprtn_AthrisationRfrncNmbr_Vl TEXT COMMENT 'MedicinalProduct.ManufacturingBusinessOperation.AuthorisationReferenceNumber.Value',
MdcnlPrdct_MnfctrngBsnssOprtn_CnfdntltyIndctr_Cdg_Cd TEXT COMMENT 'MedicinalProduct.ManufacturingBusinessOperation.ConfidentialityIndicator.Coding.Code',
MdcnlPrdct_MnfctrngBsnssOprtn_CnfdntltyIndctr_Cdg_Dsply TEXT COMMENT 'MedicinalProduct.ManufacturingBusinessOperation.ConfidentialityIndicator.Coding.Display',
MdcnlPrdct_MnfctrngBsnssOprtn_CnfdntltyIndctr_Cdg_Sys TEXT COMMENT 'MedicinalProduct.ManufacturingBusinessOperation.ConfidentialityIndicator.Coding.System',
MdcnlPrdct_MnfctrngBsnssOprtn_CnfdntltyIndctr_Cdg_UsrSltd TEXT COMMENT 'MedicinalProduct.ManufacturingBusinessOperation.ConfidentialityIndicator.Coding.UserSelected',
MdcnlPrdct_MnfctrngBsnssOprtn_CnfdntltyIndctr_Cdg_Vrsn TEXT COMMENT 'MedicinalProduct.ManufacturingBusinessOperation.ConfidentialityIndicator.Coding.Version',
MdcnlPrdct_MnfctrngBsnssOprtn_CnfdntltyIndctr_Txt TEXT COMMENT 'MedicinalProduct.ManufacturingBusinessOperation.ConfidentialityIndicator.Text',
MdcnlPrdct_MnfctrngBsnssOprtn_EfctiveDt TEXT COMMENT 'MedicinalProduct.ManufacturingBusinessOperation.EffectiveDate',
MdcnlPrdct_MnfctrngBsnssOprtn_Manufacturer TEXT COMMENT 'MedicinalProduct.ManufacturingBusinessOperation.Manufacturer',
MdcnlPrdct_MnfctrngBsnssOprtn_OprtnTyp_Cdg_Cd TEXT COMMENT 'MedicinalProduct.ManufacturingBusinessOperation.OperationType.Coding.Code',
MdcnlPrdct_MnfctrngBsnssOprtn_OprtnTyp_Cdg_Dsply TEXT COMMENT 'MedicinalProduct.ManufacturingBusinessOperation.OperationType.Coding.Display',
MdcnlPrdct_MnfctrngBsnssOprtn_OprtnTyp_Cdg_Sys TEXT COMMENT 'MedicinalProduct.ManufacturingBusinessOperation.OperationType.Coding.System',
MdcnlPrdct_MnfctrngBsnssOprtn_OprtnTyp_Cdg_UsrSltd TEXT COMMENT 'MedicinalProduct.ManufacturingBusinessOperation.OperationType.Coding.UserSelected',
MdcnlPrdct_MnfctrngBsnssOprtn_OprtnTyp_Cdg_Vrsn TEXT COMMENT 'MedicinalProduct.ManufacturingBusinessOperation.OperationType.Coding.Version',
MdcnlPrdct_MnfctrngBsnssOprtn_OprtnTyp_Txt TEXT COMMENT 'MedicinalProduct.ManufacturingBusinessOperation.OperationType.Text',
MdcnlPrdct_MnfctrngBsnssOprtn_Regulator TEXT COMMENT 'MedicinalProduct.ManufacturingBusinessOperation.Regulator',
MdcnlPrdct_MarketingSts_Cntry_Cdg_Cd TEXT COMMENT 'MedicinalProduct.MarketingStatus.Country.Coding.Code',
MdcnlPrdct_MarketingSts_Cntry_Cdg_Dsply TEXT COMMENT 'MedicinalProduct.MarketingStatus.Country.Coding.Display',
MdcnlPrdct_MarketingSts_Cntry_Cdg_Sys TEXT COMMENT 'MedicinalProduct.MarketingStatus.Country.Coding.System',
MdcnlPrdct_MarketingSts_Cntry_Cdg_UsrSltd TEXT COMMENT 'MedicinalProduct.MarketingStatus.Country.Coding.UserSelected',
MdcnlPrdct_MarketingSts_Cntry_Cdg_Vrsn TEXT COMMENT 'MedicinalProduct.MarketingStatus.Country.Coding.Version',
MdcnlPrdct_MarketingSts_Cntry_Txt TEXT COMMENT 'MedicinalProduct.MarketingStatus.Country.Text',
MdcnlPrdct_MarketingSts_DtRng_End TEXT COMMENT 'MedicinalProduct.MarketingStatus.DateRange.End',
MdcnlPrdct_MarketingSts_DtRng_Strt TEXT COMMENT 'MedicinalProduct.MarketingStatus.DateRange.Start',
MdcnlPrdct_MarketingSts_Jrsdctn_Cdg_Cd TEXT COMMENT 'MedicinalProduct.MarketingStatus.Jurisdiction.Coding.Code',
MdcnlPrdct_MarketingSts_Jrsdctn_Cdg_Dsply TEXT COMMENT 'MedicinalProduct.MarketingStatus.Jurisdiction.Coding.Display',
MdcnlPrdct_MarketingSts_Jrsdctn_Cdg_Sys TEXT COMMENT 'MedicinalProduct.MarketingStatus.Jurisdiction.Coding.System',
MdcnlPrdct_MarketingSts_Jrsdctn_Cdg_UsrSltd TEXT COMMENT 'MedicinalProduct.MarketingStatus.Jurisdiction.Coding.UserSelected',
MdcnlPrdct_MarketingSts_Jrsdctn_Cdg_Vrsn TEXT COMMENT 'MedicinalProduct.MarketingStatus.Jurisdiction.Coding.Version',
MdcnlPrdct_MarketingSts_Jrsdctn_Txt TEXT COMMENT 'MedicinalProduct.MarketingStatus.Jurisdiction.Text',
MdcnlPrdct_MarketingSts_RestoreDt TEXT COMMENT 'MedicinalProduct.MarketingStatus.RestoreDate',
MdcnlPrdct_MarketingSts_Sts_Cdg_Cd TEXT COMMENT 'MedicinalProduct.MarketingStatus.Status.Coding.Code',
MdcnlPrdct_MarketingSts_Sts_Cdg_Dsply TEXT COMMENT 'MedicinalProduct.MarketingStatus.Status.Coding.Display',
MdcnlPrdct_MarketingSts_Sts_Cdg_Sys TEXT COMMENT 'MedicinalProduct.MarketingStatus.Status.Coding.System',
MdcnlPrdct_MarketingSts_Sts_Cdg_UsrSltd TEXT COMMENT 'MedicinalProduct.MarketingStatus.Status.Coding.UserSelected',
MdcnlPrdct_MarketingSts_Sts_Cdg_Vrsn TEXT COMMENT 'MedicinalProduct.MarketingStatus.Status.Coding.Version',
MdcnlPrdct_MarketingSts_Sts_Txt TEXT COMMENT 'MedicinalProduct.MarketingStatus.Status.Text',
MdcnlPrdct_MasterFile TEXT COMMENT 'MedicinalProduct.MasterFile',
MdcnlPrdct_Nm_CntryLnguage_Cntry_Cdg_Cd TEXT COMMENT 'MedicinalProduct.Name.CountryLanguage.Country.Coding.Code',
MdcnlPrdct_Nm_CntryLnguage_Cntry_Cdg_Dsply TEXT COMMENT 'MedicinalProduct.Name.CountryLanguage.Country.Coding.Display',
MdcnlPrdct_Nm_CntryLnguage_Cntry_Cdg_Sys TEXT COMMENT 'MedicinalProduct.Name.CountryLanguage.Country.Coding.System',
MdcnlPrdct_Nm_CntryLnguage_Cntry_Cdg_UsrSltd TEXT COMMENT 'MedicinalProduct.Name.CountryLanguage.Country.Coding.UserSelected',
MdcnlPrdct_Nm_CntryLnguage_Cntry_Cdg_Vrsn TEXT COMMENT 'MedicinalProduct.Name.CountryLanguage.Country.Coding.Version',
MdcnlPrdct_Nm_CntryLnguage_Cntry_Txt TEXT COMMENT 'MedicinalProduct.Name.CountryLanguage.Country.Text',
MdcnlPrdct_Nm_CntryLnguage_Jrsdctn_Cdg_Cd TEXT COMMENT 'MedicinalProduct.Name.CountryLanguage.Jurisdiction.Coding.Code',
MdcnlPrdct_Nm_CntryLnguage_Jrsdctn_Cdg_Dsply TEXT COMMENT 'MedicinalProduct.Name.CountryLanguage.Jurisdiction.Coding.Display',
MdcnlPrdct_Nm_CntryLnguage_Jrsdctn_Cdg_Sys TEXT COMMENT 'MedicinalProduct.Name.CountryLanguage.Jurisdiction.Coding.System',
MdcnlPrdct_Nm_CntryLnguage_Jrsdctn_Cdg_UsrSltd TEXT COMMENT 'MedicinalProduct.Name.CountryLanguage.Jurisdiction.Coding.UserSelected',
MdcnlPrdct_Nm_CntryLnguage_Jrsdctn_Cdg_Vrsn TEXT COMMENT 'MedicinalProduct.Name.CountryLanguage.Jurisdiction.Coding.Version',
MdcnlPrdct_Nm_CntryLnguage_Jrsdctn_Txt TEXT COMMENT 'MedicinalProduct.Name.CountryLanguage.Jurisdiction.Text',
MdcnlPrdct_Nm_CntryLnguage_Lnguage_Cdg_Cd TEXT COMMENT 'MedicinalProduct.Name.CountryLanguage.Language.Coding.Code',
MdcnlPrdct_Nm_CntryLnguage_Lnguage_Cdg_Dsply TEXT COMMENT 'MedicinalProduct.Name.CountryLanguage.Language.Coding.Display',
MdcnlPrdct_Nm_CntryLnguage_Lnguage_Cdg_Sys TEXT COMMENT 'MedicinalProduct.Name.CountryLanguage.Language.Coding.System',
MdcnlPrdct_Nm_CntryLnguage_Lnguage_Cdg_UsrSltd TEXT COMMENT 'MedicinalProduct.Name.CountryLanguage.Language.Coding.UserSelected',
MdcnlPrdct_Nm_CntryLnguage_Lnguage_Cdg_Vrsn TEXT COMMENT 'MedicinalProduct.Name.CountryLanguage.Language.Coding.Version',
MdcnlPrdct_Nm_CntryLnguage_Lnguage_Txt TEXT COMMENT 'MedicinalProduct.Name.CountryLanguage.Language.Text',
MdcnlPrdct_Nm_NmPart_Part TEXT COMMENT 'MedicinalProduct.Name.NamePart.Part',
MdcnlPrdct_Nm_NmPart_Typ_Cd TEXT COMMENT 'MedicinalProduct.Name.NamePart.Type.Code',
MdcnlPrdct_Nm_NmPart_Typ_Dsply TEXT COMMENT 'MedicinalProduct.Name.NamePart.Type.Display',
MdcnlPrdct_Nm_NmPart_Typ_Sys TEXT COMMENT 'MedicinalProduct.Name.NamePart.Type.System',
MdcnlPrdct_Nm_NmPart_Typ_UsrSltd TEXT COMMENT 'MedicinalProduct.Name.NamePart.Type.UserSelected',
MdcnlPrdct_Nm_NmPart_Typ_Vrsn TEXT COMMENT 'MedicinalProduct.Name.NamePart.Type.Version',
MdcnlPrdct_Nm_PrdctNm TEXT COMMENT 'MedicinalProduct.Name.ProductName',
MdcnlPrdct_PckgedMdcnlPrdct TEXT COMMENT 'MedicinalProduct.PackagedMedicinalProduct',
MdcnlPrdct_PaediatricUseIndicator_Cdg_Cd TEXT COMMENT 'MedicinalProduct.PaediatricUseIndicator.Coding.Code',
MdcnlPrdct_PaediatricUseIndicator_Cdg_Dsply TEXT COMMENT 'MedicinalProduct.PaediatricUseIndicator.Coding.Display',
MdcnlPrdct_PaediatricUseIndicator_Cdg_Sys TEXT COMMENT 'MedicinalProduct.PaediatricUseIndicator.Coding.System',
MdcnlPrdct_PaediatricUseIndicator_Cdg_UsrSltd TEXT COMMENT 'MedicinalProduct.PaediatricUseIndicator.Coding.UserSelected',
MdcnlPrdct_PaediatricUseIndicator_Cdg_Vrsn TEXT COMMENT 'MedicinalProduct.PaediatricUseIndicator.Coding.Version',
MdcnlPrdct_PaediatricUseIndicator_Txt TEXT COMMENT 'MedicinalProduct.PaediatricUseIndicator.Text',
MdcnlPrdct_PhrmctclPrdct TEXT COMMENT 'MedicinalProduct.PharmaceuticalProduct',
MdcnlPrdct_PrdctClsfctn_Cdg_Cd TEXT COMMENT 'MedicinalProduct.ProductClassification.Coding.Code',
MdcnlPrdct_PrdctClsfctn_Cdg_Dsply TEXT COMMENT 'MedicinalProduct.ProductClassification.Coding.Display',
MdcnlPrdct_PrdctClsfctn_Cdg_Sys TEXT COMMENT 'MedicinalProduct.ProductClassification.Coding.System',
MdcnlPrdct_PrdctClsfctn_Cdg_UsrSltd TEXT COMMENT 'MedicinalProduct.ProductClassification.Coding.UserSelected',
MdcnlPrdct_PrdctClsfctn_Cdg_Vrsn TEXT COMMENT 'MedicinalProduct.ProductClassification.Coding.Version',
MdcnlPrdct_PrdctClsfctn_Txt TEXT COMMENT 'MedicinalProduct.ProductClassification.Text',
MdcnlPrdct_SpclDsgnation_Dt TEXT COMMENT 'MedicinalProduct.SpecialDesignation.Date',
MdcnlPrdct_SpclDsgnation_Id_Assigner TEXT COMMENT 'MedicinalProduct.SpecialDesignation.Identifier.Assigner',
MdcnlPrdct_SpclDsgnation_Id_Prd_End TEXT COMMENT 'MedicinalProduct.SpecialDesignation.Identifier.Period.End',
MdcnlPrdct_SpclDsgnation_Id_Prd_Strt TEXT COMMENT 'MedicinalProduct.SpecialDesignation.Identifier.Period.Start',
MdcnlPrdct_SpclDsgnation_Id_Sys TEXT COMMENT 'MedicinalProduct.SpecialDesignation.Identifier.System',
MdcnlPrdct_SpclDsgnation_Id_Typ_Cdg_Cd TEXT COMMENT 'MedicinalProduct.SpecialDesignation.Identifier.Type.Coding.Code',
MdcnlPrdct_SpclDsgnation_Id_Typ_Cdg_Dsply TEXT COMMENT 'MedicinalProduct.SpecialDesignation.Identifier.Type.Coding.Display',
MdcnlPrdct_SpclDsgnation_Id_Typ_Cdg_Sys TEXT COMMENT 'MedicinalProduct.SpecialDesignation.Identifier.Type.Coding.System',
MdcnlPrdct_SpclDsgnation_Id_Typ_Cdg_UsrSltd TEXT COMMENT 'MedicinalProduct.SpecialDesignation.Identifier.Type.Coding.UserSelected',
MdcnlPrdct_SpclDsgnation_Id_Typ_Cdg_Vrsn TEXT COMMENT 'MedicinalProduct.SpecialDesignation.Identifier.Type.Coding.Version',
MdcnlPrdct_SpclDsgnation_Id_Typ_Txt TEXT COMMENT 'MedicinalProduct.SpecialDesignation.Identifier.Type.Text',
MdcnlPrdct_SpclDsgnation_Id_Use TEXT COMMENT 'MedicinalProduct.SpecialDesignation.Identifier.Use',
MdcnlPrdct_SpclDsgnation_Id_Vl TEXT COMMENT 'MedicinalProduct.SpecialDesignation.Identifier.Value',
MdcnlPrdct_SpclDsgnation_IndctnCdbleCncpt_Cdg_Cd TEXT COMMENT 'MedicinalProduct.SpecialDesignation.IndicationCodeableConcept.Coding.Code',
MdcnlPrdct_SpclDsgnation_IndctnCdbleCncpt_Cdg_Dsply TEXT COMMENT 'MedicinalProduct.SpecialDesignation.IndicationCodeableConcept.Coding.Display',
MdcnlPrdct_SpclDsgnation_IndctnCdbleCncpt_Cdg_Sys TEXT COMMENT 'MedicinalProduct.SpecialDesignation.IndicationCodeableConcept.Coding.System',
MdcnlPrdct_SpclDsgnation_IndctnCdbleCncpt_Cdg_UsrSltd TEXT COMMENT 'MedicinalProduct.SpecialDesignation.IndicationCodeableConcept.Coding.UserSelected',
MdcnlPrdct_SpclDsgnation_IndctnCdbleCncpt_Cdg_Vrsn TEXT COMMENT 'MedicinalProduct.SpecialDesignation.IndicationCodeableConcept.Coding.Version',
MdcnlPrdct_SpclDsgnation_IndctnCdbleCncpt_Txt TEXT COMMENT 'MedicinalProduct.SpecialDesignation.IndicationCodeableConcept.Text',
MdcnlPrdct_SpclDsgnation_IndctnRfrnc TEXT COMMENT 'MedicinalProduct.SpecialDesignation.IndicationReference',
MdcnlPrdct_SpclDsgnation_IntendedUse_Cdg_Cd TEXT COMMENT 'MedicinalProduct.SpecialDesignation.IntendedUse.Coding.Code',
MdcnlPrdct_SpclDsgnation_IntendedUse_Cdg_Dsply TEXT COMMENT 'MedicinalProduct.SpecialDesignation.IntendedUse.Coding.Display',
MdcnlPrdct_SpclDsgnation_IntendedUse_Cdg_Sys TEXT COMMENT 'MedicinalProduct.SpecialDesignation.IntendedUse.Coding.System',
MdcnlPrdct_SpclDsgnation_IntendedUse_Cdg_UsrSltd TEXT COMMENT 'MedicinalProduct.SpecialDesignation.IntendedUse.Coding.UserSelected',
MdcnlPrdct_SpclDsgnation_IntendedUse_Cdg_Vrsn TEXT COMMENT 'MedicinalProduct.SpecialDesignation.IntendedUse.Coding.Version',
MdcnlPrdct_SpclDsgnation_IntendedUse_Txt TEXT COMMENT 'MedicinalProduct.SpecialDesignation.IntendedUse.Text',
MdcnlPrdct_SpclDsgnation_Spcs_Cdg_Cd TEXT COMMENT 'MedicinalProduct.SpecialDesignation.Species.Coding.Code',
MdcnlPrdct_SpclDsgnation_Spcs_Cdg_Dsply TEXT COMMENT 'MedicinalProduct.SpecialDesignation.Species.Coding.Display',
MdcnlPrdct_SpclDsgnation_Spcs_Cdg_Sys TEXT COMMENT 'MedicinalProduct.SpecialDesignation.Species.Coding.System',
MdcnlPrdct_SpclDsgnation_Spcs_Cdg_UsrSltd TEXT COMMENT 'MedicinalProduct.SpecialDesignation.Species.Coding.UserSelected',
MdcnlPrdct_SpclDsgnation_Spcs_Cdg_Vrsn TEXT COMMENT 'MedicinalProduct.SpecialDesignation.Species.Coding.Version',
MdcnlPrdct_SpclDsgnation_Spcs_Txt TEXT COMMENT 'MedicinalProduct.SpecialDesignation.Species.Text',
MdcnlPrdct_SpclDsgnation_Sts_Cdg_Cd TEXT COMMENT 'MedicinalProduct.SpecialDesignation.Status.Coding.Code',
MdcnlPrdct_SpclDsgnation_Sts_Cdg_Dsply TEXT COMMENT 'MedicinalProduct.SpecialDesignation.Status.Coding.Display',
MdcnlPrdct_SpclDsgnation_Sts_Cdg_Sys TEXT COMMENT 'MedicinalProduct.SpecialDesignation.Status.Coding.System',
MdcnlPrdct_SpclDsgnation_Sts_Cdg_UsrSltd TEXT COMMENT 'MedicinalProduct.SpecialDesignation.Status.Coding.UserSelected',
MdcnlPrdct_SpclDsgnation_Sts_Cdg_Vrsn TEXT COMMENT 'MedicinalProduct.SpecialDesignation.Status.Coding.Version',
MdcnlPrdct_SpclDsgnation_Sts_Txt TEXT COMMENT 'MedicinalProduct.SpecialDesignation.Status.Text',
MdcnlPrdct_SpclDsgnation_Typ_Cdg_Cd TEXT COMMENT 'MedicinalProduct.SpecialDesignation.Type.Coding.Code',
MdcnlPrdct_SpclDsgnation_Typ_Cdg_Dsply TEXT COMMENT 'MedicinalProduct.SpecialDesignation.Type.Coding.Display',
MdcnlPrdct_SpclDsgnation_Typ_Cdg_Sys TEXT COMMENT 'MedicinalProduct.SpecialDesignation.Type.Coding.System',
MdcnlPrdct_SpclDsgnation_Typ_Cdg_UsrSltd TEXT COMMENT 'MedicinalProduct.SpecialDesignation.Type.Coding.UserSelected',
MdcnlPrdct_SpclDsgnation_Typ_Cdg_Vrsn TEXT COMMENT 'MedicinalProduct.SpecialDesignation.Type.Coding.Version',
MdcnlPrdct_SpclDsgnation_Typ_Txt TEXT COMMENT 'MedicinalProduct.SpecialDesignation.Type.Text',
MdcnlPrdct_SpclMsrs TEXT COMMENT 'MedicinalProduct.SpecialMeasures',
MdcnlPrdct_Typ_Cdg_Cd TEXT COMMENT 'MedicinalProduct.Type.Coding.Code',
MdcnlPrdct_Typ_Cdg_Dsply TEXT COMMENT 'MedicinalProduct.Type.Coding.Display',
MdcnlPrdct_Typ_Cdg_Sys TEXT COMMENT 'MedicinalProduct.Type.Coding.System',
MdcnlPrdct_Typ_Cdg_UsrSltd TEXT COMMENT 'MedicinalProduct.Type.Coding.UserSelected',
MdcnlPrdct_Typ_Cdg_Vrsn TEXT COMMENT 'MedicinalProduct.Type.Coding.Version',
MdcnlPrdct_Typ_Txt TEXT COMMENT 'MedicinalProduct.Type.Text',
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;