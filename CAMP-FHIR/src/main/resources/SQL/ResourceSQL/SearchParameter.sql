drop table if exists `SearchParameter`;
CREATE TABLE `SearchParameter` (
 id varchar(64),
SrchPrmtr_Base TEXT COMMENT 'SearchParameter.Base',
SrchPrmtr_Chain TEXT COMMENT 'SearchParameter.Chain',
SrchPrmtr_Cd TEXT COMMENT 'SearchParameter.Code',
SrchPrmtr_Cmpnt_Dfn TEXT COMMENT 'SearchParameter.Component.Definition',
SrchPrmtr_Cmpnt_Exprsn TEXT COMMENT 'SearchParameter.Component.Expression',
SrchPrmtr_Cntct_Nm TEXT COMMENT 'SearchParameter.Contact.Name',
SrchPrmtr_Cntct_Tlcm_Prd_End TEXT COMMENT 'SearchParameter.Contact.Telecom.Period.End',
SrchPrmtr_Cntct_Tlcm_Prd_Strt TEXT COMMENT 'SearchParameter.Contact.Telecom.Period.Start',
SrchPrmtr_Cntct_Tlcm_Rnk TEXT COMMENT 'SearchParameter.Contact.Telecom.Rank',
SrchPrmtr_Cntct_Tlcm_Sys TEXT COMMENT 'SearchParameter.Contact.Telecom.System',
SrchPrmtr_Cntct_Tlcm_Use TEXT COMMENT 'SearchParameter.Contact.Telecom.Use',
SrchPrmtr_Cntct_Tlcm_Vl TEXT COMMENT 'SearchParameter.Contact.Telecom.Value',
SrchPrmtr_Dt TEXT COMMENT 'SearchParameter.Date',
SrchPrmtr_DerivedFrom TEXT COMMENT 'SearchParameter.DerivedFrom',
SrchPrmtr_Dscrptn TEXT COMMENT 'SearchParameter.Description',
SrchPrmtr_Exprmtl TEXT COMMENT 'SearchParameter.Experimental',
SrchPrmtr_Exprsn TEXT COMMENT 'SearchParameter.Expression',
SrchPrmtr_Jrsdctn_Cdg_Cd TEXT COMMENT 'SearchParameter.Jurisdiction.Coding.Code',
SrchPrmtr_Jrsdctn_Cdg_Dsply TEXT COMMENT 'SearchParameter.Jurisdiction.Coding.Display',
SrchPrmtr_Jrsdctn_Cdg_Sys TEXT COMMENT 'SearchParameter.Jurisdiction.Coding.System',
SrchPrmtr_Jrsdctn_Cdg_UsrSltd TEXT COMMENT 'SearchParameter.Jurisdiction.Coding.UserSelected',
SrchPrmtr_Jrsdctn_Cdg_Vrsn TEXT COMMENT 'SearchParameter.Jurisdiction.Coding.Version',
SrchPrmtr_Jrsdctn_Txt TEXT COMMENT 'SearchParameter.Jurisdiction.Text',
SrchPrmtr_MultipleAnd TEXT COMMENT 'SearchParameter.MultipleAnd',
SrchPrmtr_MultipleOr TEXT COMMENT 'SearchParameter.MultipleOr',
SrchPrmtr_Nm TEXT COMMENT 'SearchParameter.Name',
SrchPrmtr_Pblshr TEXT COMMENT 'SearchParameter.Publisher',
SrchPrmtr_Prpse TEXT COMMENT 'SearchParameter.Purpose',
SrchPrmtr_Sts TEXT COMMENT 'SearchParameter.Status',
SrchPrmtr_Typ TEXT COMMENT 'SearchParameter.Type',
SrchPrmtr_Url TEXT COMMENT 'SearchParameter.Url',
SrchPrmtr_UseCntxt_Cd_Cd TEXT COMMENT 'SearchParameter.UseContext.Code.Code',
SrchPrmtr_UseCntxt_Cd_Dsply TEXT COMMENT 'SearchParameter.UseContext.Code.Display',
SrchPrmtr_UseCntxt_Cd_Sys TEXT COMMENT 'SearchParameter.UseContext.Code.System',
SrchPrmtr_UseCntxt_Cd_UsrSltd TEXT COMMENT 'SearchParameter.UseContext.Code.UserSelected',
SrchPrmtr_UseCntxt_Cd_Vrsn TEXT COMMENT 'SearchParameter.UseContext.Code.Version',
SrchPrmtr_UseCntxt_VlCdbleCncpt_Cdg_Cd TEXT COMMENT 'SearchParameter.UseContext.ValueCodeableConcept.Coding.Code',
SrchPrmtr_UseCntxt_VlCdbleCncpt_Cdg_Dsply TEXT COMMENT 'SearchParameter.UseContext.ValueCodeableConcept.Coding.Display',
SrchPrmtr_UseCntxt_VlCdbleCncpt_Cdg_Sys TEXT COMMENT 'SearchParameter.UseContext.ValueCodeableConcept.Coding.System',
SrchPrmtr_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd TEXT COMMENT 'SearchParameter.UseContext.ValueCodeableConcept.Coding.UserSelected',
SrchPrmtr_UseCntxt_VlCdbleCncpt_Cdg_Vrsn TEXT COMMENT 'SearchParameter.UseContext.ValueCodeableConcept.Coding.Version',
SrchPrmtr_UseCntxt_VlCdbleCncpt_Txt TEXT COMMENT 'SearchParameter.UseContext.ValueCodeableConcept.Text',
SrchPrmtr_UseCntxt_VlQnty_Cd TEXT COMMENT 'SearchParameter.UseContext.ValueQuantity.Code',
SrchPrmtr_UseCntxt_VlQnty_Cmprtr TEXT COMMENT 'SearchParameter.UseContext.ValueQuantity.Comparator',
SrchPrmtr_UseCntxt_VlQnty_Sys TEXT COMMENT 'SearchParameter.UseContext.ValueQuantity.System',
SrchPrmtr_UseCntxt_VlQnty_Unt TEXT COMMENT 'SearchParameter.UseContext.ValueQuantity.Unit',
SrchPrmtr_UseCntxt_VlQnty_Vl TEXT COMMENT 'SearchParameter.UseContext.ValueQuantity.Value',
SrchPrmtr_UseCntxt_VlRng_Hi_Cd TEXT COMMENT 'SearchParameter.UseContext.ValueRange.High.Code',
SrchPrmtr_UseCntxt_VlRng_Hi_Cmprtr TEXT COMMENT 'SearchParameter.UseContext.ValueRange.High.Comparator',
SrchPrmtr_UseCntxt_VlRng_Hi_Sys TEXT COMMENT 'SearchParameter.UseContext.ValueRange.High.System',
SrchPrmtr_UseCntxt_VlRng_Hi_Unt TEXT COMMENT 'SearchParameter.UseContext.ValueRange.High.Unit',
SrchPrmtr_UseCntxt_VlRng_Hi_Vl TEXT COMMENT 'SearchParameter.UseContext.ValueRange.High.Value',
SrchPrmtr_UseCntxt_VlRng_Lw_Cd TEXT COMMENT 'SearchParameter.UseContext.ValueRange.Low.Code',
SrchPrmtr_UseCntxt_VlRng_Lw_Cmprtr TEXT COMMENT 'SearchParameter.UseContext.ValueRange.Low.Comparator',
SrchPrmtr_UseCntxt_VlRng_Lw_Sys TEXT COMMENT 'SearchParameter.UseContext.ValueRange.Low.System',
SrchPrmtr_UseCntxt_VlRng_Lw_Unt TEXT COMMENT 'SearchParameter.UseContext.ValueRange.Low.Unit',
SrchPrmtr_UseCntxt_VlRng_Lw_Vl TEXT COMMENT 'SearchParameter.UseContext.ValueRange.Low.Value',
SrchPrmtr_UseCntxt_VlRfrnc TEXT COMMENT 'SearchParameter.UseContext.ValueReference',
SrchPrmtr_Vrsn TEXT COMMENT 'SearchParameter.Version',
SrchPrmtr_Xpath TEXT COMMENT 'SearchParameter.Xpath',
SrchPrmtr_XpathUsg TEXT COMMENT 'SearchParameter.XpathUsage',
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;