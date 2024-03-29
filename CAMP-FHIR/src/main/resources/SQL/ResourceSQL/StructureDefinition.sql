drop table if exists `StructureDefinition`;
CREATE TABLE `StructureDefinition` (
 id varchar(64),
StrctrDfn_Abstract TEXT COMMENT 'StructureDefinition.Abstract',
StrctrDfn_BaseDfn TEXT COMMENT 'StructureDefinition.BaseDefinition',
StrctrDfn_Cntct_Nm TEXT COMMENT 'StructureDefinition.Contact.Name',
StrctrDfn_Cntct_Tlcm_Prd_End TEXT COMMENT 'StructureDefinition.Contact.Telecom.Period.End',
StrctrDfn_Cntct_Tlcm_Prd_Strt TEXT COMMENT 'StructureDefinition.Contact.Telecom.Period.Start',
StrctrDfn_Cntct_Tlcm_Rnk TEXT COMMENT 'StructureDefinition.Contact.Telecom.Rank',
StrctrDfn_Cntct_Tlcm_Sys TEXT COMMENT 'StructureDefinition.Contact.Telecom.System',
StrctrDfn_Cntct_Tlcm_Use TEXT COMMENT 'StructureDefinition.Contact.Telecom.Use',
StrctrDfn_Cntct_Tlcm_Vl TEXT COMMENT 'StructureDefinition.Contact.Telecom.Value',
StrctrDfn_Cntxt_Exprsn TEXT COMMENT 'StructureDefinition.Context.Expression',
StrctrDfn_Cntxt_Typ TEXT COMMENT 'StructureDefinition.Context.Type',
StrctrDfn_CntxtInvariant TEXT COMMENT 'StructureDefinition.ContextInvariant',
StrctrDfn_Copyright TEXT COMMENT 'StructureDefinition.Copyright',
StrctrDfn_Dt TEXT COMMENT 'StructureDefinition.Date',
StrctrDfn_Derivation TEXT COMMENT 'StructureDefinition.Derivation',
StrctrDfn_Dscrptn TEXT COMMENT 'StructureDefinition.Description',
StrctrDfn_Exprmtl TEXT COMMENT 'StructureDefinition.Experimental',
StrctrDfn_FhirVrsn TEXT COMMENT 'StructureDefinition.FhirVersion',
StrctrDfn_Id_Assigner TEXT COMMENT 'StructureDefinition.Identifier.Assigner',
StrctrDfn_Id_Prd_End TEXT COMMENT 'StructureDefinition.Identifier.Period.End',
StrctrDfn_Id_Prd_Strt TEXT COMMENT 'StructureDefinition.Identifier.Period.Start',
StrctrDfn_Id_Sys TEXT COMMENT 'StructureDefinition.Identifier.System',
StrctrDfn_Id_Typ_Cdg_Cd TEXT COMMENT 'StructureDefinition.Identifier.Type.Coding.Code',
StrctrDfn_Id_Typ_Cdg_Dsply TEXT COMMENT 'StructureDefinition.Identifier.Type.Coding.Display',
StrctrDfn_Id_Typ_Cdg_Sys TEXT COMMENT 'StructureDefinition.Identifier.Type.Coding.System',
StrctrDfn_Id_Typ_Cdg_UsrSltd TEXT COMMENT 'StructureDefinition.Identifier.Type.Coding.UserSelected',
StrctrDfn_Id_Typ_Cdg_Vrsn TEXT COMMENT 'StructureDefinition.Identifier.Type.Coding.Version',
StrctrDfn_Id_Typ_Txt TEXT COMMENT 'StructureDefinition.Identifier.Type.Text',
StrctrDfn_Id_Use TEXT COMMENT 'StructureDefinition.Identifier.Use',
StrctrDfn_Id_Vl TEXT COMMENT 'StructureDefinition.Identifier.Value',
StrctrDfn_Jrsdctn_Cdg_Cd TEXT COMMENT 'StructureDefinition.Jurisdiction.Coding.Code',
StrctrDfn_Jrsdctn_Cdg_Dsply TEXT COMMENT 'StructureDefinition.Jurisdiction.Coding.Display',
StrctrDfn_Jrsdctn_Cdg_Sys TEXT COMMENT 'StructureDefinition.Jurisdiction.Coding.System',
StrctrDfn_Jrsdctn_Cdg_UsrSltd TEXT COMMENT 'StructureDefinition.Jurisdiction.Coding.UserSelected',
StrctrDfn_Jrsdctn_Cdg_Vrsn TEXT COMMENT 'StructureDefinition.Jurisdiction.Coding.Version',
StrctrDfn_Jrsdctn_Txt TEXT COMMENT 'StructureDefinition.Jurisdiction.Text',
StrctrDfn_Keyword_Cd TEXT COMMENT 'StructureDefinition.Keyword.Code',
StrctrDfn_Keyword_Dsply TEXT COMMENT 'StructureDefinition.Keyword.Display',
StrctrDfn_Keyword_Sys TEXT COMMENT 'StructureDefinition.Keyword.System',
StrctrDfn_Keyword_UsrSltd TEXT COMMENT 'StructureDefinition.Keyword.UserSelected',
StrctrDfn_Keyword_Vrsn TEXT COMMENT 'StructureDefinition.Keyword.Version',
StrctrDfn_Kind TEXT COMMENT 'StructureDefinition.Kind',
StrctrDfn_Mapping_Comment TEXT COMMENT 'StructureDefinition.Mapping.Comment',
StrctrDfn_Mapping_Identity TEXT COMMENT 'StructureDefinition.Mapping.Identity',
StrctrDfn_Mapping_Nm TEXT COMMENT 'StructureDefinition.Mapping.Name',
StrctrDfn_Mapping_Uri TEXT COMMENT 'StructureDefinition.Mapping.Uri',
StrctrDfn_Nm TEXT COMMENT 'StructureDefinition.Name',
StrctrDfn_Pblshr TEXT COMMENT 'StructureDefinition.Publisher',
StrctrDfn_Prpse TEXT COMMENT 'StructureDefinition.Purpose',
StrctrDfn_Sts TEXT COMMENT 'StructureDefinition.Status',
StrctrDfn_Ttl TEXT COMMENT 'StructureDefinition.Title',
StrctrDfn_Typ TEXT COMMENT 'StructureDefinition.Type',
StrctrDfn_Url TEXT COMMENT 'StructureDefinition.Url',
StrctrDfn_UseCntxt_Cd_Cd TEXT COMMENT 'StructureDefinition.UseContext.Code.Code',
StrctrDfn_UseCntxt_Cd_Dsply TEXT COMMENT 'StructureDefinition.UseContext.Code.Display',
StrctrDfn_UseCntxt_Cd_Sys TEXT COMMENT 'StructureDefinition.UseContext.Code.System',
StrctrDfn_UseCntxt_Cd_UsrSltd TEXT COMMENT 'StructureDefinition.UseContext.Code.UserSelected',
StrctrDfn_UseCntxt_Cd_Vrsn TEXT COMMENT 'StructureDefinition.UseContext.Code.Version',
StrctrDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd TEXT COMMENT 'StructureDefinition.UseContext.ValueCodeableConcept.Coding.Code',
StrctrDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply TEXT COMMENT 'StructureDefinition.UseContext.ValueCodeableConcept.Coding.Display',
StrctrDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys TEXT COMMENT 'StructureDefinition.UseContext.ValueCodeableConcept.Coding.System',
StrctrDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd TEXT COMMENT 'StructureDefinition.UseContext.ValueCodeableConcept.Coding.UserSelected',
StrctrDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn TEXT COMMENT 'StructureDefinition.UseContext.ValueCodeableConcept.Coding.Version',
StrctrDfn_UseCntxt_VlCdbleCncpt_Txt TEXT COMMENT 'StructureDefinition.UseContext.ValueCodeableConcept.Text',
StrctrDfn_UseCntxt_VlQnty_Cd TEXT COMMENT 'StructureDefinition.UseContext.ValueQuantity.Code',
StrctrDfn_UseCntxt_VlQnty_Cmprtr TEXT COMMENT 'StructureDefinition.UseContext.ValueQuantity.Comparator',
StrctrDfn_UseCntxt_VlQnty_Sys TEXT COMMENT 'StructureDefinition.UseContext.ValueQuantity.System',
StrctrDfn_UseCntxt_VlQnty_Unt TEXT COMMENT 'StructureDefinition.UseContext.ValueQuantity.Unit',
StrctrDfn_UseCntxt_VlQnty_Vl TEXT COMMENT 'StructureDefinition.UseContext.ValueQuantity.Value',
StrctrDfn_UseCntxt_VlRng_Hi_Cd TEXT COMMENT 'StructureDefinition.UseContext.ValueRange.High.Code',
StrctrDfn_UseCntxt_VlRng_Hi_Cmprtr TEXT COMMENT 'StructureDefinition.UseContext.ValueRange.High.Comparator',
StrctrDfn_UseCntxt_VlRng_Hi_Sys TEXT COMMENT 'StructureDefinition.UseContext.ValueRange.High.System',
StrctrDfn_UseCntxt_VlRng_Hi_Unt TEXT COMMENT 'StructureDefinition.UseContext.ValueRange.High.Unit',
StrctrDfn_UseCntxt_VlRng_Hi_Vl TEXT COMMENT 'StructureDefinition.UseContext.ValueRange.High.Value',
StrctrDfn_UseCntxt_VlRng_Lw_Cd TEXT COMMENT 'StructureDefinition.UseContext.ValueRange.Low.Code',
StrctrDfn_UseCntxt_VlRng_Lw_Cmprtr TEXT COMMENT 'StructureDefinition.UseContext.ValueRange.Low.Comparator',
StrctrDfn_UseCntxt_VlRng_Lw_Sys TEXT COMMENT 'StructureDefinition.UseContext.ValueRange.Low.System',
StrctrDfn_UseCntxt_VlRng_Lw_Unt TEXT COMMENT 'StructureDefinition.UseContext.ValueRange.Low.Unit',
StrctrDfn_UseCntxt_VlRng_Lw_Vl TEXT COMMENT 'StructureDefinition.UseContext.ValueRange.Low.Value',
StrctrDfn_UseCntxt_VlRfrnc TEXT COMMENT 'StructureDefinition.UseContext.ValueReference',
StrctrDfn_Vrsn TEXT COMMENT 'StructureDefinition.Version',
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;