drop table if exists `ChargeItemDefinition`;
CREATE TABLE `ChargeItemDefinition` (
 id varchar(64),
ChrgItmDfn_Applicability_Dscrptn TEXT COMMENT 'ChargeItemDefinition.Applicability.Description',
ChrgItmDfn_Applicability_Exprsn TEXT COMMENT 'ChargeItemDefinition.Applicability.Expression',
ChrgItmDfn_Applicability_Lnguage TEXT COMMENT 'ChargeItemDefinition.Applicability.Language',
ChrgItmDfn_ApprovalDt TEXT COMMENT 'ChargeItemDefinition.ApprovalDate',
ChrgItmDfn_Cd_Cdg_Cd TEXT COMMENT 'ChargeItemDefinition.Code.Coding.Code',
ChrgItmDfn_Cd_Cdg_Dsply TEXT COMMENT 'ChargeItemDefinition.Code.Coding.Display',
ChrgItmDfn_Cd_Cdg_Sys TEXT COMMENT 'ChargeItemDefinition.Code.Coding.System',
ChrgItmDfn_Cd_Cdg_UsrSltd TEXT COMMENT 'ChargeItemDefinition.Code.Coding.UserSelected',
ChrgItmDfn_Cd_Cdg_Vrsn TEXT COMMENT 'ChargeItemDefinition.Code.Coding.Version',
ChrgItmDfn_Cd_Txt TEXT COMMENT 'ChargeItemDefinition.Code.Text',
ChrgItmDfn_Cntct_Nm TEXT COMMENT 'ChargeItemDefinition.Contact.Name',
ChrgItmDfn_Cntct_Tlcm_Prd_End TEXT COMMENT 'ChargeItemDefinition.Contact.Telecom.Period.End',
ChrgItmDfn_Cntct_Tlcm_Prd_Strt TEXT COMMENT 'ChargeItemDefinition.Contact.Telecom.Period.Start',
ChrgItmDfn_Cntct_Tlcm_Rnk TEXT COMMENT 'ChargeItemDefinition.Contact.Telecom.Rank',
ChrgItmDfn_Cntct_Tlcm_Sys TEXT COMMENT 'ChargeItemDefinition.Contact.Telecom.System',
ChrgItmDfn_Cntct_Tlcm_Use TEXT COMMENT 'ChargeItemDefinition.Contact.Telecom.Use',
ChrgItmDfn_Cntct_Tlcm_Vl TEXT COMMENT 'ChargeItemDefinition.Contact.Telecom.Value',
ChrgItmDfn_Copyright TEXT COMMENT 'ChargeItemDefinition.Copyright',
ChrgItmDfn_Dt TEXT COMMENT 'ChargeItemDefinition.Date',
ChrgItmDfn_DerivedFromUri TEXT COMMENT 'ChargeItemDefinition.DerivedFromUri',
ChrgItmDfn_Dscrptn TEXT COMMENT 'ChargeItemDefinition.Description',
ChrgItmDfn_EfctivePrd_End TEXT COMMENT 'ChargeItemDefinition.EffectivePeriod.End',
ChrgItmDfn_EfctivePrd_Strt TEXT COMMENT 'ChargeItemDefinition.EffectivePeriod.Start',
ChrgItmDfn_Exprmtl TEXT COMMENT 'ChargeItemDefinition.Experimental',
ChrgItmDfn_Id_Assigner TEXT COMMENT 'ChargeItemDefinition.Identifier.Assigner',
ChrgItmDfn_Id_Prd_End TEXT COMMENT 'ChargeItemDefinition.Identifier.Period.End',
ChrgItmDfn_Id_Prd_Strt TEXT COMMENT 'ChargeItemDefinition.Identifier.Period.Start',
ChrgItmDfn_Id_Sys TEXT COMMENT 'ChargeItemDefinition.Identifier.System',
ChrgItmDfn_Id_Typ_Cdg_Cd TEXT COMMENT 'ChargeItemDefinition.Identifier.Type.Coding.Code',
ChrgItmDfn_Id_Typ_Cdg_Dsply TEXT COMMENT 'ChargeItemDefinition.Identifier.Type.Coding.Display',
ChrgItmDfn_Id_Typ_Cdg_Sys TEXT COMMENT 'ChargeItemDefinition.Identifier.Type.Coding.System',
ChrgItmDfn_Id_Typ_Cdg_UsrSltd TEXT COMMENT 'ChargeItemDefinition.Identifier.Type.Coding.UserSelected',
ChrgItmDfn_Id_Typ_Cdg_Vrsn TEXT COMMENT 'ChargeItemDefinition.Identifier.Type.Coding.Version',
ChrgItmDfn_Id_Typ_Txt TEXT COMMENT 'ChargeItemDefinition.Identifier.Type.Text',
ChrgItmDfn_Id_Use TEXT COMMENT 'ChargeItemDefinition.Identifier.Use',
ChrgItmDfn_Id_Vl TEXT COMMENT 'ChargeItemDefinition.Identifier.Value',
ChrgItmDfn_Instance TEXT COMMENT 'ChargeItemDefinition.Instance',
ChrgItmDfn_Jrsdctn_Cdg_Cd TEXT COMMENT 'ChargeItemDefinition.Jurisdiction.Coding.Code',
ChrgItmDfn_Jrsdctn_Cdg_Dsply TEXT COMMENT 'ChargeItemDefinition.Jurisdiction.Coding.Display',
ChrgItmDfn_Jrsdctn_Cdg_Sys TEXT COMMENT 'ChargeItemDefinition.Jurisdiction.Coding.System',
ChrgItmDfn_Jrsdctn_Cdg_UsrSltd TEXT COMMENT 'ChargeItemDefinition.Jurisdiction.Coding.UserSelected',
ChrgItmDfn_Jrsdctn_Cdg_Vrsn TEXT COMMENT 'ChargeItemDefinition.Jurisdiction.Coding.Version',
ChrgItmDfn_Jrsdctn_Txt TEXT COMMENT 'ChargeItemDefinition.Jurisdiction.Text',
ChrgItmDfn_LastReviewDt TEXT COMMENT 'ChargeItemDefinition.LastReviewDate',
ChrgItmDfn_PartOf TEXT COMMENT 'ChargeItemDefinition.PartOf',
ChrgItmDfn_PrptyGrp_Applicability_Dscrptn TEXT COMMENT 'ChargeItemDefinition.PropertyGroup.Applicability.Description',
ChrgItmDfn_PrptyGrp_Applicability_Exprsn TEXT COMMENT 'ChargeItemDefinition.PropertyGroup.Applicability.Expression',
ChrgItmDfn_PrptyGrp_Applicability_Lnguage TEXT COMMENT 'ChargeItemDefinition.PropertyGroup.Applicability.Language',
ChrgItmDfn_PrptyGrp_PriceCmpnt_Amnt_Crncy TEXT COMMENT 'ChargeItemDefinition.PropertyGroup.PriceComponent.Amount.Currency',
ChrgItmDfn_PrptyGrp_PriceCmpnt_Amnt_Vl TEXT COMMENT 'ChargeItemDefinition.PropertyGroup.PriceComponent.Amount.Value',
ChrgItmDfn_PrptyGrp_PriceCmpnt_Cd_Cdg_Cd TEXT COMMENT 'ChargeItemDefinition.PropertyGroup.PriceComponent.Code.Coding.Code',
ChrgItmDfn_PrptyGrp_PriceCmpnt_Cd_Cdg_Dsply TEXT COMMENT 'ChargeItemDefinition.PropertyGroup.PriceComponent.Code.Coding.Display',
ChrgItmDfn_PrptyGrp_PriceCmpnt_Cd_Cdg_Sys TEXT COMMENT 'ChargeItemDefinition.PropertyGroup.PriceComponent.Code.Coding.System',
ChrgItmDfn_PrptyGrp_PriceCmpnt_Cd_Cdg_UsrSltd TEXT COMMENT 'ChargeItemDefinition.PropertyGroup.PriceComponent.Code.Coding.UserSelected',
ChrgItmDfn_PrptyGrp_PriceCmpnt_Cd_Cdg_Vrsn TEXT COMMENT 'ChargeItemDefinition.PropertyGroup.PriceComponent.Code.Coding.Version',
ChrgItmDfn_PrptyGrp_PriceCmpnt_Cd_Txt TEXT COMMENT 'ChargeItemDefinition.PropertyGroup.PriceComponent.Code.Text',
ChrgItmDfn_PrptyGrp_PriceCmpnt_Factor TEXT COMMENT 'ChargeItemDefinition.PropertyGroup.PriceComponent.Factor',
ChrgItmDfn_PrptyGrp_PriceCmpnt_Typ TEXT COMMENT 'ChargeItemDefinition.PropertyGroup.PriceComponent.Type',
ChrgItmDfn_Pblshr TEXT COMMENT 'ChargeItemDefinition.Publisher',
ChrgItmDfn_Replaces TEXT COMMENT 'ChargeItemDefinition.Replaces',
ChrgItmDfn_Sts TEXT COMMENT 'ChargeItemDefinition.Status',
ChrgItmDfn_Ttl TEXT COMMENT 'ChargeItemDefinition.Title',
ChrgItmDfn_Url TEXT COMMENT 'ChargeItemDefinition.Url',
ChrgItmDfn_UseCntxt_Cd_Cd TEXT COMMENT 'ChargeItemDefinition.UseContext.Code.Code',
ChrgItmDfn_UseCntxt_Cd_Dsply TEXT COMMENT 'ChargeItemDefinition.UseContext.Code.Display',
ChrgItmDfn_UseCntxt_Cd_Sys TEXT COMMENT 'ChargeItemDefinition.UseContext.Code.System',
ChrgItmDfn_UseCntxt_Cd_UsrSltd TEXT COMMENT 'ChargeItemDefinition.UseContext.Code.UserSelected',
ChrgItmDfn_UseCntxt_Cd_Vrsn TEXT COMMENT 'ChargeItemDefinition.UseContext.Code.Version',
ChrgItmDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd TEXT COMMENT 'ChargeItemDefinition.UseContext.ValueCodeableConcept.Coding.Code',
ChrgItmDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply TEXT COMMENT 'ChargeItemDefinition.UseContext.ValueCodeableConcept.Coding.Display',
ChrgItmDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys TEXT COMMENT 'ChargeItemDefinition.UseContext.ValueCodeableConcept.Coding.System',
ChrgItmDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd TEXT COMMENT 'ChargeItemDefinition.UseContext.ValueCodeableConcept.Coding.UserSelected',
ChrgItmDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn TEXT COMMENT 'ChargeItemDefinition.UseContext.ValueCodeableConcept.Coding.Version',
ChrgItmDfn_UseCntxt_VlCdbleCncpt_Txt TEXT COMMENT 'ChargeItemDefinition.UseContext.ValueCodeableConcept.Text',
ChrgItmDfn_UseCntxt_VlQnty_Cd TEXT COMMENT 'ChargeItemDefinition.UseContext.ValueQuantity.Code',
ChrgItmDfn_UseCntxt_VlQnty_Cmprtr TEXT COMMENT 'ChargeItemDefinition.UseContext.ValueQuantity.Comparator',
ChrgItmDfn_UseCntxt_VlQnty_Sys TEXT COMMENT 'ChargeItemDefinition.UseContext.ValueQuantity.System',
ChrgItmDfn_UseCntxt_VlQnty_Unt TEXT COMMENT 'ChargeItemDefinition.UseContext.ValueQuantity.Unit',
ChrgItmDfn_UseCntxt_VlQnty_Vl TEXT COMMENT 'ChargeItemDefinition.UseContext.ValueQuantity.Value',
ChrgItmDfn_UseCntxt_VlRng_Hi_Cd TEXT COMMENT 'ChargeItemDefinition.UseContext.ValueRange.High.Code',
ChrgItmDfn_UseCntxt_VlRng_Hi_Cmprtr TEXT COMMENT 'ChargeItemDefinition.UseContext.ValueRange.High.Comparator',
ChrgItmDfn_UseCntxt_VlRng_Hi_Sys TEXT COMMENT 'ChargeItemDefinition.UseContext.ValueRange.High.System',
ChrgItmDfn_UseCntxt_VlRng_Hi_Unt TEXT COMMENT 'ChargeItemDefinition.UseContext.ValueRange.High.Unit',
ChrgItmDfn_UseCntxt_VlRng_Hi_Vl TEXT COMMENT 'ChargeItemDefinition.UseContext.ValueRange.High.Value',
ChrgItmDfn_UseCntxt_VlRng_Lw_Cd TEXT COMMENT 'ChargeItemDefinition.UseContext.ValueRange.Low.Code',
ChrgItmDfn_UseCntxt_VlRng_Lw_Cmprtr TEXT COMMENT 'ChargeItemDefinition.UseContext.ValueRange.Low.Comparator',
ChrgItmDfn_UseCntxt_VlRng_Lw_Sys TEXT COMMENT 'ChargeItemDefinition.UseContext.ValueRange.Low.System',
ChrgItmDfn_UseCntxt_VlRng_Lw_Unt TEXT COMMENT 'ChargeItemDefinition.UseContext.ValueRange.Low.Unit',
ChrgItmDfn_UseCntxt_VlRng_Lw_Vl TEXT COMMENT 'ChargeItemDefinition.UseContext.ValueRange.Low.Value',
ChrgItmDfn_UseCntxt_VlRfrnc TEXT COMMENT 'ChargeItemDefinition.UseContext.ValueReference',
ChrgItmDfn_Vrsn TEXT COMMENT 'ChargeItemDefinition.Version',
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;