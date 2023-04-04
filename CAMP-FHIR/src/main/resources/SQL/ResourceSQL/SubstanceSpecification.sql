drop table if exists `SubstanceSpecification`;
CREATE TABLE `SubstanceSpecification` (
 id varchar(64),
SbstncSpcfctn_Cd_Cd_Cdg_Cd TEXT COMMENT 'SubstanceSpecification.Code.Code.Coding.Code',
SbstncSpcfctn_Cd_Cd_Cdg_Dsply TEXT COMMENT 'SubstanceSpecification.Code.Code.Coding.Display',
SbstncSpcfctn_Cd_Cd_Cdg_Sys TEXT COMMENT 'SubstanceSpecification.Code.Code.Coding.System',
SbstncSpcfctn_Cd_Cd_Cdg_UsrSltd TEXT COMMENT 'SubstanceSpecification.Code.Code.Coding.UserSelected',
SbstncSpcfctn_Cd_Cd_Cdg_Vrsn TEXT COMMENT 'SubstanceSpecification.Code.Code.Coding.Version',
SbstncSpcfctn_Cd_Cd_Txt TEXT COMMENT 'SubstanceSpecification.Code.Code.Text',
SbstncSpcfctn_Cd_Comment TEXT COMMENT 'SubstanceSpecification.Code.Comment',
SbstncSpcfctn_Cd_Src TEXT COMMENT 'SubstanceSpecification.Code.Source',
SbstncSpcfctn_Cd_Sts_Cdg_Cd TEXT COMMENT 'SubstanceSpecification.Code.Status.Coding.Code',
SbstncSpcfctn_Cd_Sts_Cdg_Dsply TEXT COMMENT 'SubstanceSpecification.Code.Status.Coding.Display',
SbstncSpcfctn_Cd_Sts_Cdg_Sys TEXT COMMENT 'SubstanceSpecification.Code.Status.Coding.System',
SbstncSpcfctn_Cd_Sts_Cdg_UsrSltd TEXT COMMENT 'SubstanceSpecification.Code.Status.Coding.UserSelected',
SbstncSpcfctn_Cd_Sts_Cdg_Vrsn TEXT COMMENT 'SubstanceSpecification.Code.Status.Coding.Version',
SbstncSpcfctn_Cd_Sts_Txt TEXT COMMENT 'SubstanceSpecification.Code.Status.Text',
SbstncSpcfctn_Cd_StsDt TEXT COMMENT 'SubstanceSpecification.Code.StatusDate',
SbstncSpcfctn_Comment TEXT COMMENT 'SubstanceSpecification.Comment',
SbstncSpcfctn_Dscrptn TEXT COMMENT 'SubstanceSpecification.Description',
SbstncSpcfctn_Domain_Cdg_Cd TEXT COMMENT 'SubstanceSpecification.Domain.Coding.Code',
SbstncSpcfctn_Domain_Cdg_Dsply TEXT COMMENT 'SubstanceSpecification.Domain.Coding.Display',
SbstncSpcfctn_Domain_Cdg_Sys TEXT COMMENT 'SubstanceSpecification.Domain.Coding.System',
SbstncSpcfctn_Domain_Cdg_UsrSltd TEXT COMMENT 'SubstanceSpecification.Domain.Coding.UserSelected',
SbstncSpcfctn_Domain_Cdg_Vrsn TEXT COMMENT 'SubstanceSpecification.Domain.Coding.Version',
SbstncSpcfctn_Domain_Txt TEXT COMMENT 'SubstanceSpecification.Domain.Text',
SbstncSpcfctn_Id_Assigner TEXT COMMENT 'SubstanceSpecification.Identifier.Assigner',
SbstncSpcfctn_Id_Prd_End TEXT COMMENT 'SubstanceSpecification.Identifier.Period.End',
SbstncSpcfctn_Id_Prd_Strt TEXT COMMENT 'SubstanceSpecification.Identifier.Period.Start',
SbstncSpcfctn_Id_Sys TEXT COMMENT 'SubstanceSpecification.Identifier.System',
SbstncSpcfctn_Id_Typ_Cdg_Cd TEXT COMMENT 'SubstanceSpecification.Identifier.Type.Coding.Code',
SbstncSpcfctn_Id_Typ_Cdg_Dsply TEXT COMMENT 'SubstanceSpecification.Identifier.Type.Coding.Display',
SbstncSpcfctn_Id_Typ_Cdg_Sys TEXT COMMENT 'SubstanceSpecification.Identifier.Type.Coding.System',
SbstncSpcfctn_Id_Typ_Cdg_UsrSltd TEXT COMMENT 'SubstanceSpecification.Identifier.Type.Coding.UserSelected',
SbstncSpcfctn_Id_Typ_Cdg_Vrsn TEXT COMMENT 'SubstanceSpecification.Identifier.Type.Coding.Version',
SbstncSpcfctn_Id_Typ_Txt TEXT COMMENT 'SubstanceSpecification.Identifier.Type.Text',
SbstncSpcfctn_Id_Use TEXT COMMENT 'SubstanceSpecification.Identifier.Use',
SbstncSpcfctn_Id_Vl TEXT COMMENT 'SubstanceSpecification.Identifier.Value',
SbstncSpcfctn_Moiety_AmntQnty_Cd TEXT COMMENT 'SubstanceSpecification.Moiety.AmountQuantity.Code',
SbstncSpcfctn_Moiety_AmntQnty_Cmprtr TEXT COMMENT 'SubstanceSpecification.Moiety.AmountQuantity.Comparator',
SbstncSpcfctn_Moiety_AmntQnty_Sys TEXT COMMENT 'SubstanceSpecification.Moiety.AmountQuantity.System',
SbstncSpcfctn_Moiety_AmntQnty_Unt TEXT COMMENT 'SubstanceSpecification.Moiety.AmountQuantity.Unit',
SbstncSpcfctn_Moiety_AmntQnty_Vl TEXT COMMENT 'SubstanceSpecification.Moiety.AmountQuantity.Value',
SbstncSpcfctn_Moiety_AmntStrgTyp TEXT COMMENT 'SubstanceSpecification.Moiety.AmountStringType',
SbstncSpcfctn_Moiety_Id_Assigner TEXT COMMENT 'SubstanceSpecification.Moiety.Identifier.Assigner',
SbstncSpcfctn_Moiety_Id_Prd_End TEXT COMMENT 'SubstanceSpecification.Moiety.Identifier.Period.End',
SbstncSpcfctn_Moiety_Id_Prd_Strt TEXT COMMENT 'SubstanceSpecification.Moiety.Identifier.Period.Start',
SbstncSpcfctn_Moiety_Id_Sys TEXT COMMENT 'SubstanceSpecification.Moiety.Identifier.System',
SbstncSpcfctn_Moiety_Id_Typ_Cdg_Cd TEXT COMMENT 'SubstanceSpecification.Moiety.Identifier.Type.Coding.Code',
SbstncSpcfctn_Moiety_Id_Typ_Cdg_Dsply TEXT COMMENT 'SubstanceSpecification.Moiety.Identifier.Type.Coding.Display',
SbstncSpcfctn_Moiety_Id_Typ_Cdg_Sys TEXT COMMENT 'SubstanceSpecification.Moiety.Identifier.Type.Coding.System',
SbstncSpcfctn_Moiety_Id_Typ_Cdg_UsrSltd TEXT COMMENT 'SubstanceSpecification.Moiety.Identifier.Type.Coding.UserSelected',
SbstncSpcfctn_Moiety_Id_Typ_Cdg_Vrsn TEXT COMMENT 'SubstanceSpecification.Moiety.Identifier.Type.Coding.Version',
SbstncSpcfctn_Moiety_Id_Typ_Txt TEXT COMMENT 'SubstanceSpecification.Moiety.Identifier.Type.Text',
SbstncSpcfctn_Moiety_Id_Use TEXT COMMENT 'SubstanceSpecification.Moiety.Identifier.Use',
SbstncSpcfctn_Moiety_Id_Vl TEXT COMMENT 'SubstanceSpecification.Moiety.Identifier.Value',
SbstncSpcfctn_Moiety_MoleclrFrmula TEXT COMMENT 'SubstanceSpecification.Moiety.MolecularFormula',
SbstncSpcfctn_Moiety_Nm TEXT COMMENT 'SubstanceSpecification.Moiety.Name',
SbstncSpcfctn_Moiety_OpticalActvty_Cdg_Cd TEXT COMMENT 'SubstanceSpecification.Moiety.OpticalActivity.Coding.Code',
SbstncSpcfctn_Moiety_OpticalActvty_Cdg_Dsply TEXT COMMENT 'SubstanceSpecification.Moiety.OpticalActivity.Coding.Display',
SbstncSpcfctn_Moiety_OpticalActvty_Cdg_Sys TEXT COMMENT 'SubstanceSpecification.Moiety.OpticalActivity.Coding.System',
SbstncSpcfctn_Moiety_OpticalActvty_Cdg_UsrSltd TEXT COMMENT 'SubstanceSpecification.Moiety.OpticalActivity.Coding.UserSelected',
SbstncSpcfctn_Moiety_OpticalActvty_Cdg_Vrsn TEXT COMMENT 'SubstanceSpecification.Moiety.OpticalActivity.Coding.Version',
SbstncSpcfctn_Moiety_OpticalActvty_Txt TEXT COMMENT 'SubstanceSpecification.Moiety.OpticalActivity.Text',
SbstncSpcfctn_Moiety_Role_Cdg_Cd TEXT COMMENT 'SubstanceSpecification.Moiety.Role.Coding.Code',
SbstncSpcfctn_Moiety_Role_Cdg_Dsply TEXT COMMENT 'SubstanceSpecification.Moiety.Role.Coding.Display',
SbstncSpcfctn_Moiety_Role_Cdg_Sys TEXT COMMENT 'SubstanceSpecification.Moiety.Role.Coding.System',
SbstncSpcfctn_Moiety_Role_Cdg_UsrSltd TEXT COMMENT 'SubstanceSpecification.Moiety.Role.Coding.UserSelected',
SbstncSpcfctn_Moiety_Role_Cdg_Vrsn TEXT COMMENT 'SubstanceSpecification.Moiety.Role.Coding.Version',
SbstncSpcfctn_Moiety_Role_Txt TEXT COMMENT 'SubstanceSpecification.Moiety.Role.Text',
SbstncSpcfctn_Moiety_Stereochemistry_Cdg_Cd TEXT COMMENT 'SubstanceSpecification.Moiety.Stereochemistry.Coding.Code',
SbstncSpcfctn_Moiety_Stereochemistry_Cdg_Dsply TEXT COMMENT 'SubstanceSpecification.Moiety.Stereochemistry.Coding.Display',
SbstncSpcfctn_Moiety_Stereochemistry_Cdg_Sys TEXT COMMENT 'SubstanceSpecification.Moiety.Stereochemistry.Coding.System',
SbstncSpcfctn_Moiety_Stereochemistry_Cdg_UsrSltd TEXT COMMENT 'SubstanceSpecification.Moiety.Stereochemistry.Coding.UserSelected',
SbstncSpcfctn_Moiety_Stereochemistry_Cdg_Vrsn TEXT COMMENT 'SubstanceSpecification.Moiety.Stereochemistry.Coding.Version',
SbstncSpcfctn_Moiety_Stereochemistry_Txt TEXT COMMENT 'SubstanceSpecification.Moiety.Stereochemistry.Text',
SbstncSpcfctn_MoleclrWght_Amnt_Cd TEXT COMMENT 'SubstanceSpecification.MolecularWeight.Amount.Code',
SbstncSpcfctn_MoleclrWght_Amnt_Cmprtr TEXT COMMENT 'SubstanceSpecification.MolecularWeight.Amount.Comparator',
SbstncSpcfctn_MoleclrWght_Amnt_Sys TEXT COMMENT 'SubstanceSpecification.MolecularWeight.Amount.System',
SbstncSpcfctn_MoleclrWght_Amnt_Unt TEXT COMMENT 'SubstanceSpecification.MolecularWeight.Amount.Unit',
SbstncSpcfctn_MoleclrWght_Amnt_Vl TEXT COMMENT 'SubstanceSpecification.MolecularWeight.Amount.Value',
SbstncSpcfctn_MoleclrWght_Mthd_Cdg_Cd TEXT COMMENT 'SubstanceSpecification.MolecularWeight.Method.Coding.Code',
SbstncSpcfctn_MoleclrWght_Mthd_Cdg_Dsply TEXT COMMENT 'SubstanceSpecification.MolecularWeight.Method.Coding.Display',
SbstncSpcfctn_MoleclrWght_Mthd_Cdg_Sys TEXT COMMENT 'SubstanceSpecification.MolecularWeight.Method.Coding.System',
SbstncSpcfctn_MoleclrWght_Mthd_Cdg_UsrSltd TEXT COMMENT 'SubstanceSpecification.MolecularWeight.Method.Coding.UserSelected',
SbstncSpcfctn_MoleclrWght_Mthd_Cdg_Vrsn TEXT COMMENT 'SubstanceSpecification.MolecularWeight.Method.Coding.Version',
SbstncSpcfctn_MoleclrWght_Mthd_Txt TEXT COMMENT 'SubstanceSpecification.MolecularWeight.Method.Text',
SbstncSpcfctn_MoleclrWght_Typ_Cdg_Cd TEXT COMMENT 'SubstanceSpecification.MolecularWeight.Type.Coding.Code',
SbstncSpcfctn_MoleclrWght_Typ_Cdg_Dsply TEXT COMMENT 'SubstanceSpecification.MolecularWeight.Type.Coding.Display',
SbstncSpcfctn_MoleclrWght_Typ_Cdg_Sys TEXT COMMENT 'SubstanceSpecification.MolecularWeight.Type.Coding.System',
SbstncSpcfctn_MoleclrWght_Typ_Cdg_UsrSltd TEXT COMMENT 'SubstanceSpecification.MolecularWeight.Type.Coding.UserSelected',
SbstncSpcfctn_MoleclrWght_Typ_Cdg_Vrsn TEXT COMMENT 'SubstanceSpecification.MolecularWeight.Type.Coding.Version',
SbstncSpcfctn_MoleclrWght_Typ_Txt TEXT COMMENT 'SubstanceSpecification.MolecularWeight.Type.Text',
SbstncSpcfctn_Nm_Domain_Cdg_Cd TEXT COMMENT 'SubstanceSpecification.Name.Domain.Coding.Code',
SbstncSpcfctn_Nm_Domain_Cdg_Dsply TEXT COMMENT 'SubstanceSpecification.Name.Domain.Coding.Display',
SbstncSpcfctn_Nm_Domain_Cdg_Sys TEXT COMMENT 'SubstanceSpecification.Name.Domain.Coding.System',
SbstncSpcfctn_Nm_Domain_Cdg_UsrSltd TEXT COMMENT 'SubstanceSpecification.Name.Domain.Coding.UserSelected',
SbstncSpcfctn_Nm_Domain_Cdg_Vrsn TEXT COMMENT 'SubstanceSpecification.Name.Domain.Coding.Version',
SbstncSpcfctn_Nm_Domain_Txt TEXT COMMENT 'SubstanceSpecification.Name.Domain.Text',
SbstncSpcfctn_Nm_Jrsdctn_Cdg_Cd TEXT COMMENT 'SubstanceSpecification.Name.Jurisdiction.Coding.Code',
SbstncSpcfctn_Nm_Jrsdctn_Cdg_Dsply TEXT COMMENT 'SubstanceSpecification.Name.Jurisdiction.Coding.Display',
SbstncSpcfctn_Nm_Jrsdctn_Cdg_Sys TEXT COMMENT 'SubstanceSpecification.Name.Jurisdiction.Coding.System',
SbstncSpcfctn_Nm_Jrsdctn_Cdg_UsrSltd TEXT COMMENT 'SubstanceSpecification.Name.Jurisdiction.Coding.UserSelected',
SbstncSpcfctn_Nm_Jrsdctn_Cdg_Vrsn TEXT COMMENT 'SubstanceSpecification.Name.Jurisdiction.Coding.Version',
SbstncSpcfctn_Nm_Jrsdctn_Txt TEXT COMMENT 'SubstanceSpecification.Name.Jurisdiction.Text',
SbstncSpcfctn_Nm_Lnguage_Cdg_Cd TEXT COMMENT 'SubstanceSpecification.Name.Language.Coding.Code',
SbstncSpcfctn_Nm_Lnguage_Cdg_Dsply TEXT COMMENT 'SubstanceSpecification.Name.Language.Coding.Display',
SbstncSpcfctn_Nm_Lnguage_Cdg_Sys TEXT COMMENT 'SubstanceSpecification.Name.Language.Coding.System',
SbstncSpcfctn_Nm_Lnguage_Cdg_UsrSltd TEXT COMMENT 'SubstanceSpecification.Name.Language.Coding.UserSelected',
SbstncSpcfctn_Nm_Lnguage_Cdg_Vrsn TEXT COMMENT 'SubstanceSpecification.Name.Language.Coding.Version',
SbstncSpcfctn_Nm_Lnguage_Txt TEXT COMMENT 'SubstanceSpecification.Name.Language.Text',
SbstncSpcfctn_Nm_Nm TEXT COMMENT 'SubstanceSpecification.Name.Name',
SbstncSpcfctn_Nm_Official_Athrity_Cdg_Cd TEXT COMMENT 'SubstanceSpecification.Name.Official.Authority.Coding.Code',
SbstncSpcfctn_Nm_Official_Athrity_Cdg_Dsply TEXT COMMENT 'SubstanceSpecification.Name.Official.Authority.Coding.Display',
SbstncSpcfctn_Nm_Official_Athrity_Cdg_Sys TEXT COMMENT 'SubstanceSpecification.Name.Official.Authority.Coding.System',
SbstncSpcfctn_Nm_Official_Athrity_Cdg_UsrSltd TEXT COMMENT 'SubstanceSpecification.Name.Official.Authority.Coding.UserSelected',
SbstncSpcfctn_Nm_Official_Athrity_Cdg_Vrsn TEXT COMMENT 'SubstanceSpecification.Name.Official.Authority.Coding.Version',
SbstncSpcfctn_Nm_Official_Athrity_Txt TEXT COMMENT 'SubstanceSpecification.Name.Official.Authority.Text',
SbstncSpcfctn_Nm_Official_Dt TEXT COMMENT 'SubstanceSpecification.Name.Official.Date',
SbstncSpcfctn_Nm_Official_Sts_Cdg_Cd TEXT COMMENT 'SubstanceSpecification.Name.Official.Status.Coding.Code',
SbstncSpcfctn_Nm_Official_Sts_Cdg_Dsply TEXT COMMENT 'SubstanceSpecification.Name.Official.Status.Coding.Display',
SbstncSpcfctn_Nm_Official_Sts_Cdg_Sys TEXT COMMENT 'SubstanceSpecification.Name.Official.Status.Coding.System',
SbstncSpcfctn_Nm_Official_Sts_Cdg_UsrSltd TEXT COMMENT 'SubstanceSpecification.Name.Official.Status.Coding.UserSelected',
SbstncSpcfctn_Nm_Official_Sts_Cdg_Vrsn TEXT COMMENT 'SubstanceSpecification.Name.Official.Status.Coding.Version',
SbstncSpcfctn_Nm_Official_Sts_Txt TEXT COMMENT 'SubstanceSpecification.Name.Official.Status.Text',
SbstncSpcfctn_Nm_Preferred TEXT COMMENT 'SubstanceSpecification.Name.Preferred',
SbstncSpcfctn_Nm_Src TEXT COMMENT 'SubstanceSpecification.Name.Source',
SbstncSpcfctn_Nm_Sts_Cdg_Cd TEXT COMMENT 'SubstanceSpecification.Name.Status.Coding.Code',
SbstncSpcfctn_Nm_Sts_Cdg_Dsply TEXT COMMENT 'SubstanceSpecification.Name.Status.Coding.Display',
SbstncSpcfctn_Nm_Sts_Cdg_Sys TEXT COMMENT 'SubstanceSpecification.Name.Status.Coding.System',
SbstncSpcfctn_Nm_Sts_Cdg_UsrSltd TEXT COMMENT 'SubstanceSpecification.Name.Status.Coding.UserSelected',
SbstncSpcfctn_Nm_Sts_Cdg_Vrsn TEXT COMMENT 'SubstanceSpecification.Name.Status.Coding.Version',
SbstncSpcfctn_Nm_Sts_Txt TEXT COMMENT 'SubstanceSpecification.Name.Status.Text',
SbstncSpcfctn_Nm_Typ_Cdg_Cd TEXT COMMENT 'SubstanceSpecification.Name.Type.Coding.Code',
SbstncSpcfctn_Nm_Typ_Cdg_Dsply TEXT COMMENT 'SubstanceSpecification.Name.Type.Coding.Display',
SbstncSpcfctn_Nm_Typ_Cdg_Sys TEXT COMMENT 'SubstanceSpecification.Name.Type.Coding.System',
SbstncSpcfctn_Nm_Typ_Cdg_UsrSltd TEXT COMMENT 'SubstanceSpecification.Name.Type.Coding.UserSelected',
SbstncSpcfctn_Nm_Typ_Cdg_Vrsn TEXT COMMENT 'SubstanceSpecification.Name.Type.Coding.Version',
SbstncSpcfctn_Nm_Typ_Txt TEXT COMMENT 'SubstanceSpecification.Name.Type.Text',
SbstncSpcfctn_NclicAcid TEXT COMMENT 'SubstanceSpecification.NucleicAcid',
SbstncSpcfctn_Plymr TEXT COMMENT 'SubstanceSpecification.Polymer',
SbstncSpcfctn_Prpty_AmntQnty_Cd TEXT COMMENT 'SubstanceSpecification.Property.AmountQuantity.Code',
SbstncSpcfctn_Prpty_AmntQnty_Cmprtr TEXT COMMENT 'SubstanceSpecification.Property.AmountQuantity.Comparator',
SbstncSpcfctn_Prpty_AmntQnty_Sys TEXT COMMENT 'SubstanceSpecification.Property.AmountQuantity.System',
SbstncSpcfctn_Prpty_AmntQnty_Unt TEXT COMMENT 'SubstanceSpecification.Property.AmountQuantity.Unit',
SbstncSpcfctn_Prpty_AmntQnty_Vl TEXT COMMENT 'SubstanceSpecification.Property.AmountQuantity.Value',
SbstncSpcfctn_Prpty_AmntStrgTyp TEXT COMMENT 'SubstanceSpecification.Property.AmountStringType',
SbstncSpcfctn_Prpty_Ctgry_Cdg_Cd TEXT COMMENT 'SubstanceSpecification.Property.Category.Coding.Code',
SbstncSpcfctn_Prpty_Ctgry_Cdg_Dsply TEXT COMMENT 'SubstanceSpecification.Property.Category.Coding.Display',
SbstncSpcfctn_Prpty_Ctgry_Cdg_Sys TEXT COMMENT 'SubstanceSpecification.Property.Category.Coding.System',
SbstncSpcfctn_Prpty_Ctgry_Cdg_UsrSltd TEXT COMMENT 'SubstanceSpecification.Property.Category.Coding.UserSelected',
SbstncSpcfctn_Prpty_Ctgry_Cdg_Vrsn TEXT COMMENT 'SubstanceSpecification.Property.Category.Coding.Version',
SbstncSpcfctn_Prpty_Ctgry_Txt TEXT COMMENT 'SubstanceSpecification.Property.Category.Text',
SbstncSpcfctn_Prpty_Cd_Cdg_Cd TEXT COMMENT 'SubstanceSpecification.Property.Code.Coding.Code',
SbstncSpcfctn_Prpty_Cd_Cdg_Dsply TEXT COMMENT 'SubstanceSpecification.Property.Code.Coding.Display',
SbstncSpcfctn_Prpty_Cd_Cdg_Sys TEXT COMMENT 'SubstanceSpecification.Property.Code.Coding.System',
SbstncSpcfctn_Prpty_Cd_Cdg_UsrSltd TEXT COMMENT 'SubstanceSpecification.Property.Code.Coding.UserSelected',
SbstncSpcfctn_Prpty_Cd_Cdg_Vrsn TEXT COMMENT 'SubstanceSpecification.Property.Code.Coding.Version',
SbstncSpcfctn_Prpty_Cd_Txt TEXT COMMENT 'SubstanceSpecification.Property.Code.Text',
SbstncSpcfctn_Prpty_DefiningSbstncCdbleCncpt_Cdg_Cd TEXT COMMENT 'SubstanceSpecification.Property.DefiningSubstanceCodeableConcept.Coding.Code',
SbstncSpcfctn_Prpty_DefiningSbstncCdbleCncpt_Cdg_Dsply TEXT COMMENT 'SubstanceSpecification.Property.DefiningSubstanceCodeableConcept.Coding.Display',
SbstncSpcfctn_Prpty_DefiningSbstncCdbleCncpt_Cdg_Sys TEXT COMMENT 'SubstanceSpecification.Property.DefiningSubstanceCodeableConcept.Coding.System',
SbstncSpcfctn_Prpty_DefiningSbstncCdbleCncpt_Cdg_UsrSltd TEXT COMMENT 'SubstanceSpecification.Property.DefiningSubstanceCodeableConcept.Coding.UserSelected',
SbstncSpcfctn_Prpty_DefiningSbstncCdbleCncpt_Cdg_Vrsn TEXT COMMENT 'SubstanceSpecification.Property.DefiningSubstanceCodeableConcept.Coding.Version',
SbstncSpcfctn_Prpty_DefiningSbstncCdbleCncpt_Txt TEXT COMMENT 'SubstanceSpecification.Property.DefiningSubstanceCodeableConcept.Text',
SbstncSpcfctn_Prpty_DefiningSbstncRfrnc TEXT COMMENT 'SubstanceSpecification.Property.DefiningSubstanceReference',
SbstncSpcfctn_Prpty_Prmtrs TEXT COMMENT 'SubstanceSpecification.Property.Parameters',
SbstncSpcfctn_Protein TEXT COMMENT 'SubstanceSpecification.Protein',
SbstncSpcfctn_RfrncInfo TEXT COMMENT 'SubstanceSpecification.ReferenceInformation',
SbstncSpcfctn_Rltnship_AmntQnty_Cd TEXT COMMENT 'SubstanceSpecification.Relationship.AmountQuantity.Code',
SbstncSpcfctn_Rltnship_AmntQnty_Cmprtr TEXT COMMENT 'SubstanceSpecification.Relationship.AmountQuantity.Comparator',
SbstncSpcfctn_Rltnship_AmntQnty_Sys TEXT COMMENT 'SubstanceSpecification.Relationship.AmountQuantity.System',
SbstncSpcfctn_Rltnship_AmntQnty_Unt TEXT COMMENT 'SubstanceSpecification.Relationship.AmountQuantity.Unit',
SbstncSpcfctn_Rltnship_AmntQnty_Vl TEXT COMMENT 'SubstanceSpecification.Relationship.AmountQuantity.Value',
SbstncSpcfctn_Rltnship_AmntRng_Hi_Cd TEXT COMMENT 'SubstanceSpecification.Relationship.AmountRange.High.Code',
SbstncSpcfctn_Rltnship_AmntRng_Hi_Cmprtr TEXT COMMENT 'SubstanceSpecification.Relationship.AmountRange.High.Comparator',
SbstncSpcfctn_Rltnship_AmntRng_Hi_Sys TEXT COMMENT 'SubstanceSpecification.Relationship.AmountRange.High.System',
SbstncSpcfctn_Rltnship_AmntRng_Hi_Unt TEXT COMMENT 'SubstanceSpecification.Relationship.AmountRange.High.Unit',
SbstncSpcfctn_Rltnship_AmntRng_Hi_Vl TEXT COMMENT 'SubstanceSpecification.Relationship.AmountRange.High.Value',
SbstncSpcfctn_Rltnship_AmntRng_Lw_Cd TEXT COMMENT 'SubstanceSpecification.Relationship.AmountRange.Low.Code',
SbstncSpcfctn_Rltnship_AmntRng_Lw_Cmprtr TEXT COMMENT 'SubstanceSpecification.Relationship.AmountRange.Low.Comparator',
SbstncSpcfctn_Rltnship_AmntRng_Lw_Sys TEXT COMMENT 'SubstanceSpecification.Relationship.AmountRange.Low.System',
SbstncSpcfctn_Rltnship_AmntRng_Lw_Unt TEXT COMMENT 'SubstanceSpecification.Relationship.AmountRange.Low.Unit',
SbstncSpcfctn_Rltnship_AmntRng_Lw_Vl TEXT COMMENT 'SubstanceSpecification.Relationship.AmountRange.Low.Value',
SbstncSpcfctn_Rltnship_AmntRtio_Dnmntr_Cd TEXT COMMENT 'SubstanceSpecification.Relationship.AmountRatio.Denominator.Code',
SbstncSpcfctn_Rltnship_AmntRtio_Dnmntr_Cmprtr TEXT COMMENT 'SubstanceSpecification.Relationship.AmountRatio.Denominator.Comparator',
SbstncSpcfctn_Rltnship_AmntRtio_Dnmntr_Sys TEXT COMMENT 'SubstanceSpecification.Relationship.AmountRatio.Denominator.System',
SbstncSpcfctn_Rltnship_AmntRtio_Dnmntr_Unt TEXT COMMENT 'SubstanceSpecification.Relationship.AmountRatio.Denominator.Unit',
SbstncSpcfctn_Rltnship_AmntRtio_Dnmntr_Vl TEXT COMMENT 'SubstanceSpecification.Relationship.AmountRatio.Denominator.Value',
SbstncSpcfctn_Rltnship_AmntRtio_Nmrtr_Cd TEXT COMMENT 'SubstanceSpecification.Relationship.AmountRatio.Numerator.Code',
SbstncSpcfctn_Rltnship_AmntRtio_Nmrtr_Cmprtr TEXT COMMENT 'SubstanceSpecification.Relationship.AmountRatio.Numerator.Comparator',
SbstncSpcfctn_Rltnship_AmntRtio_Nmrtr_Sys TEXT COMMENT 'SubstanceSpecification.Relationship.AmountRatio.Numerator.System',
SbstncSpcfctn_Rltnship_AmntRtio_Nmrtr_Unt TEXT COMMENT 'SubstanceSpecification.Relationship.AmountRatio.Numerator.Unit',
SbstncSpcfctn_Rltnship_AmntRtio_Nmrtr_Vl TEXT COMMENT 'SubstanceSpecification.Relationship.AmountRatio.Numerator.Value',
SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Dnmntr_Cd TEXT COMMENT 'SubstanceSpecification.Relationship.AmountRatioLowLimit.Denominator.Code',
SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Dnmntr_Cmprtr TEXT COMMENT 'SubstanceSpecification.Relationship.AmountRatioLowLimit.Denominator.Comparator',
SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Dnmntr_Sys TEXT COMMENT 'SubstanceSpecification.Relationship.AmountRatioLowLimit.Denominator.System',
SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Dnmntr_Unt TEXT COMMENT 'SubstanceSpecification.Relationship.AmountRatioLowLimit.Denominator.Unit',
SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Dnmntr_Vl TEXT COMMENT 'SubstanceSpecification.Relationship.AmountRatioLowLimit.Denominator.Value',
SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Nmrtr_Cd TEXT COMMENT 'SubstanceSpecification.Relationship.AmountRatioLowLimit.Numerator.Code',
SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Nmrtr_Cmprtr TEXT COMMENT 'SubstanceSpecification.Relationship.AmountRatioLowLimit.Numerator.Comparator',
SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Nmrtr_Sys TEXT COMMENT 'SubstanceSpecification.Relationship.AmountRatioLowLimit.Numerator.System',
SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Nmrtr_Unt TEXT COMMENT 'SubstanceSpecification.Relationship.AmountRatioLowLimit.Numerator.Unit',
SbstncSpcfctn_Rltnship_AmntRtioLwLmt_Nmrtr_Vl TEXT COMMENT 'SubstanceSpecification.Relationship.AmountRatioLowLimit.Numerator.Value',
SbstncSpcfctn_Rltnship_AmntStrgTyp TEXT COMMENT 'SubstanceSpecification.Relationship.AmountStringType',
SbstncSpcfctn_Rltnship_AmntTyp_Cdg_Cd TEXT COMMENT 'SubstanceSpecification.Relationship.AmountType.Coding.Code',
SbstncSpcfctn_Rltnship_AmntTyp_Cdg_Dsply TEXT COMMENT 'SubstanceSpecification.Relationship.AmountType.Coding.Display',
SbstncSpcfctn_Rltnship_AmntTyp_Cdg_Sys TEXT COMMENT 'SubstanceSpecification.Relationship.AmountType.Coding.System',
SbstncSpcfctn_Rltnship_AmntTyp_Cdg_UsrSltd TEXT COMMENT 'SubstanceSpecification.Relationship.AmountType.Coding.UserSelected',
SbstncSpcfctn_Rltnship_AmntTyp_Cdg_Vrsn TEXT COMMENT 'SubstanceSpecification.Relationship.AmountType.Coding.Version',
SbstncSpcfctn_Rltnship_AmntTyp_Txt TEXT COMMENT 'SubstanceSpecification.Relationship.AmountType.Text',
SbstncSpcfctn_Rltnship_IsDefining TEXT COMMENT 'SubstanceSpecification.Relationship.IsDefining',
SbstncSpcfctn_Rltnship_Rltnship_Cdg_Cd TEXT COMMENT 'SubstanceSpecification.Relationship.Relationship.Coding.Code',
SbstncSpcfctn_Rltnship_Rltnship_Cdg_Dsply TEXT COMMENT 'SubstanceSpecification.Relationship.Relationship.Coding.Display',
SbstncSpcfctn_Rltnship_Rltnship_Cdg_Sys TEXT COMMENT 'SubstanceSpecification.Relationship.Relationship.Coding.System',
SbstncSpcfctn_Rltnship_Rltnship_Cdg_UsrSltd TEXT COMMENT 'SubstanceSpecification.Relationship.Relationship.Coding.UserSelected',
SbstncSpcfctn_Rltnship_Rltnship_Cdg_Vrsn TEXT COMMENT 'SubstanceSpecification.Relationship.Relationship.Coding.Version',
SbstncSpcfctn_Rltnship_Rltnship_Txt TEXT COMMENT 'SubstanceSpecification.Relationship.Relationship.Text',
SbstncSpcfctn_Rltnship_Src TEXT COMMENT 'SubstanceSpecification.Relationship.Source',
SbstncSpcfctn_Rltnship_SbstncCdbleCncpt_Cdg_Cd TEXT COMMENT 'SubstanceSpecification.Relationship.SubstanceCodeableConcept.Coding.Code',
SbstncSpcfctn_Rltnship_SbstncCdbleCncpt_Cdg_Dsply TEXT COMMENT 'SubstanceSpecification.Relationship.SubstanceCodeableConcept.Coding.Display',
SbstncSpcfctn_Rltnship_SbstncCdbleCncpt_Cdg_Sys TEXT COMMENT 'SubstanceSpecification.Relationship.SubstanceCodeableConcept.Coding.System',
SbstncSpcfctn_Rltnship_SbstncCdbleCncpt_Cdg_UsrSltd TEXT COMMENT 'SubstanceSpecification.Relationship.SubstanceCodeableConcept.Coding.UserSelected',
SbstncSpcfctn_Rltnship_SbstncCdbleCncpt_Cdg_Vrsn TEXT COMMENT 'SubstanceSpecification.Relationship.SubstanceCodeableConcept.Coding.Version',
SbstncSpcfctn_Rltnship_SbstncCdbleCncpt_Txt TEXT COMMENT 'SubstanceSpecification.Relationship.SubstanceCodeableConcept.Text',
SbstncSpcfctn_Rltnship_SbstncRfrnc TEXT COMMENT 'SubstanceSpecification.Relationship.SubstanceReference',
SbstncSpcfctn_Src TEXT COMMENT 'SubstanceSpecification.Source',
SbstncSpcfctn_SrcMtrl TEXT COMMENT 'SubstanceSpecification.SourceMaterial',
SbstncSpcfctn_Sts_Cdg_Cd TEXT COMMENT 'SubstanceSpecification.Status.Coding.Code',
SbstncSpcfctn_Sts_Cdg_Dsply TEXT COMMENT 'SubstanceSpecification.Status.Coding.Display',
SbstncSpcfctn_Sts_Cdg_Sys TEXT COMMENT 'SubstanceSpecification.Status.Coding.System',
SbstncSpcfctn_Sts_Cdg_UsrSltd TEXT COMMENT 'SubstanceSpecification.Status.Coding.UserSelected',
SbstncSpcfctn_Sts_Cdg_Vrsn TEXT COMMENT 'SubstanceSpecification.Status.Coding.Version',
SbstncSpcfctn_Sts_Txt TEXT COMMENT 'SubstanceSpecification.Status.Text',
SbstncSpcfctn_Strctr_Isotope_HalfLife_Cd TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.HalfLife.Code',
SbstncSpcfctn_Strctr_Isotope_HalfLife_Cmprtr TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.HalfLife.Comparator',
SbstncSpcfctn_Strctr_Isotope_HalfLife_Sys TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.HalfLife.System',
SbstncSpcfctn_Strctr_Isotope_HalfLife_Unt TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.HalfLife.Unit',
SbstncSpcfctn_Strctr_Isotope_HalfLife_Vl TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.HalfLife.Value',
SbstncSpcfctn_Strctr_Isotope_Id_Assigner TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.Identifier.Assigner',
SbstncSpcfctn_Strctr_Isotope_Id_Prd_End TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.Identifier.Period.End',
SbstncSpcfctn_Strctr_Isotope_Id_Prd_Strt TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.Identifier.Period.Start',
SbstncSpcfctn_Strctr_Isotope_Id_Sys TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.Identifier.System',
SbstncSpcfctn_Strctr_Isotope_Id_Typ_Cdg_Cd TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.Identifier.Type.Coding.Code',
SbstncSpcfctn_Strctr_Isotope_Id_Typ_Cdg_Dsply TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.Identifier.Type.Coding.Display',
SbstncSpcfctn_Strctr_Isotope_Id_Typ_Cdg_Sys TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.Identifier.Type.Coding.System',
SbstncSpcfctn_Strctr_Isotope_Id_Typ_Cdg_UsrSltd TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.Identifier.Type.Coding.UserSelected',
SbstncSpcfctn_Strctr_Isotope_Id_Typ_Cdg_Vrsn TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.Identifier.Type.Coding.Version',
SbstncSpcfctn_Strctr_Isotope_Id_Typ_Txt TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.Identifier.Type.Text',
SbstncSpcfctn_Strctr_Isotope_Id_Use TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.Identifier.Use',
SbstncSpcfctn_Strctr_Isotope_Id_Vl TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.Identifier.Value',
SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Amnt_Cd TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.MolecularWeight.Amount.Code',
SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Amnt_Cmprtr TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.MolecularWeight.Amount.Comparator',
SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Amnt_Sys TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.MolecularWeight.Amount.System',
SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Amnt_Unt TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.MolecularWeight.Amount.Unit',
SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Amnt_Vl TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.MolecularWeight.Amount.Value',
SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Mthd_Cdg_Cd TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.MolecularWeight.Method.Coding.Code',
SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Mthd_Cdg_Dsply TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.MolecularWeight.Method.Coding.Display',
SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Mthd_Cdg_Sys TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.MolecularWeight.Method.Coding.System',
SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Mthd_Cdg_UsrSltd TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.MolecularWeight.Method.Coding.UserSelected',
SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Mthd_Cdg_Vrsn TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.MolecularWeight.Method.Coding.Version',
SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Mthd_Txt TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.MolecularWeight.Method.Text',
SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Typ_Cdg_Cd TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.MolecularWeight.Type.Coding.Code',
SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Typ_Cdg_Dsply TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.MolecularWeight.Type.Coding.Display',
SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Typ_Cdg_Sys TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.MolecularWeight.Type.Coding.System',
SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Typ_Cdg_UsrSltd TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.MolecularWeight.Type.Coding.UserSelected',
SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Typ_Cdg_Vrsn TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.MolecularWeight.Type.Coding.Version',
SbstncSpcfctn_Strctr_Isotope_MoleclrWght_Typ_Txt TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.MolecularWeight.Type.Text',
SbstncSpcfctn_Strctr_Isotope_Nm_Cdg_Cd TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.Name.Coding.Code',
SbstncSpcfctn_Strctr_Isotope_Nm_Cdg_Dsply TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.Name.Coding.Display',
SbstncSpcfctn_Strctr_Isotope_Nm_Cdg_Sys TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.Name.Coding.System',
SbstncSpcfctn_Strctr_Isotope_Nm_Cdg_UsrSltd TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.Name.Coding.UserSelected',
SbstncSpcfctn_Strctr_Isotope_Nm_Cdg_Vrsn TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.Name.Coding.Version',
SbstncSpcfctn_Strctr_Isotope_Nm_Txt TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.Name.Text',
SbstncSpcfctn_Strctr_Isotope_Substitution_Cdg_Cd TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.Substitution.Coding.Code',
SbstncSpcfctn_Strctr_Isotope_Substitution_Cdg_Dsply TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.Substitution.Coding.Display',
SbstncSpcfctn_Strctr_Isotope_Substitution_Cdg_Sys TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.Substitution.Coding.System',
SbstncSpcfctn_Strctr_Isotope_Substitution_Cdg_UsrSltd TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.Substitution.Coding.UserSelected',
SbstncSpcfctn_Strctr_Isotope_Substitution_Cdg_Vrsn TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.Substitution.Coding.Version',
SbstncSpcfctn_Strctr_Isotope_Substitution_Txt TEXT COMMENT 'SubstanceSpecification.Structure.Isotope.Substitution.Text',
SbstncSpcfctn_Strctr_MoleclrFrmula TEXT COMMENT 'SubstanceSpecification.Structure.MolecularFormula',
SbstncSpcfctn_Strctr_MoleclrFrmulaByMoiety TEXT COMMENT 'SubstanceSpecification.Structure.MolecularFormulaByMoiety',
SbstncSpcfctn_Strctr_MoleclrWght_Amnt_Cd TEXT COMMENT 'SubstanceSpecification.Structure.MolecularWeight.Amount.Code',
SbstncSpcfctn_Strctr_MoleclrWght_Amnt_Cmprtr TEXT COMMENT 'SubstanceSpecification.Structure.MolecularWeight.Amount.Comparator',
SbstncSpcfctn_Strctr_MoleclrWght_Amnt_Sys TEXT COMMENT 'SubstanceSpecification.Structure.MolecularWeight.Amount.System',
SbstncSpcfctn_Strctr_MoleclrWght_Amnt_Unt TEXT COMMENT 'SubstanceSpecification.Structure.MolecularWeight.Amount.Unit',
SbstncSpcfctn_Strctr_MoleclrWght_Amnt_Vl TEXT COMMENT 'SubstanceSpecification.Structure.MolecularWeight.Amount.Value',
SbstncSpcfctn_Strctr_MoleclrWght_Mthd_Cdg_Cd TEXT COMMENT 'SubstanceSpecification.Structure.MolecularWeight.Method.Coding.Code',
SbstncSpcfctn_Strctr_MoleclrWght_Mthd_Cdg_Dsply TEXT COMMENT 'SubstanceSpecification.Structure.MolecularWeight.Method.Coding.Display',
SbstncSpcfctn_Strctr_MoleclrWght_Mthd_Cdg_Sys TEXT COMMENT 'SubstanceSpecification.Structure.MolecularWeight.Method.Coding.System',
SbstncSpcfctn_Strctr_MoleclrWght_Mthd_Cdg_UsrSltd TEXT COMMENT 'SubstanceSpecification.Structure.MolecularWeight.Method.Coding.UserSelected',
SbstncSpcfctn_Strctr_MoleclrWght_Mthd_Cdg_Vrsn TEXT COMMENT 'SubstanceSpecification.Structure.MolecularWeight.Method.Coding.Version',
SbstncSpcfctn_Strctr_MoleclrWght_Mthd_Txt TEXT COMMENT 'SubstanceSpecification.Structure.MolecularWeight.Method.Text',
SbstncSpcfctn_Strctr_MoleclrWght_Typ_Cdg_Cd TEXT COMMENT 'SubstanceSpecification.Structure.MolecularWeight.Type.Coding.Code',
SbstncSpcfctn_Strctr_MoleclrWght_Typ_Cdg_Dsply TEXT COMMENT 'SubstanceSpecification.Structure.MolecularWeight.Type.Coding.Display',
SbstncSpcfctn_Strctr_MoleclrWght_Typ_Cdg_Sys TEXT COMMENT 'SubstanceSpecification.Structure.MolecularWeight.Type.Coding.System',
SbstncSpcfctn_Strctr_MoleclrWght_Typ_Cdg_UsrSltd TEXT COMMENT 'SubstanceSpecification.Structure.MolecularWeight.Type.Coding.UserSelected',
SbstncSpcfctn_Strctr_MoleclrWght_Typ_Cdg_Vrsn TEXT COMMENT 'SubstanceSpecification.Structure.MolecularWeight.Type.Coding.Version',
SbstncSpcfctn_Strctr_MoleclrWght_Typ_Txt TEXT COMMENT 'SubstanceSpecification.Structure.MolecularWeight.Type.Text',
SbstncSpcfctn_Strctr_OpticalActvty_Cdg_Cd TEXT COMMENT 'SubstanceSpecification.Structure.OpticalActivity.Coding.Code',
SbstncSpcfctn_Strctr_OpticalActvty_Cdg_Dsply TEXT COMMENT 'SubstanceSpecification.Structure.OpticalActivity.Coding.Display',
SbstncSpcfctn_Strctr_OpticalActvty_Cdg_Sys TEXT COMMENT 'SubstanceSpecification.Structure.OpticalActivity.Coding.System',
SbstncSpcfctn_Strctr_OpticalActvty_Cdg_UsrSltd TEXT COMMENT 'SubstanceSpecification.Structure.OpticalActivity.Coding.UserSelected',
SbstncSpcfctn_Strctr_OpticalActvty_Cdg_Vrsn TEXT COMMENT 'SubstanceSpecification.Structure.OpticalActivity.Coding.Version',
SbstncSpcfctn_Strctr_OpticalActvty_Txt TEXT COMMENT 'SubstanceSpecification.Structure.OpticalActivity.Text',
SbstncSpcfctn_Strctr_Representation_Attchmnt_CntntTyp TEXT COMMENT 'SubstanceSpecification.Structure.Representation.Attachment.ContentType',
SbstncSpcfctn_Strctr_Representation_Attchmnt_Creation TEXT COMMENT 'SubstanceSpecification.Structure.Representation.Attachment.Creation',
SbstncSpcfctn_Strctr_Representation_Attchmnt_Data TEXT COMMENT 'SubstanceSpecification.Structure.Representation.Attachment.Data',
SbstncSpcfctn_Strctr_Representation_Attchmnt_Hash TEXT COMMENT 'SubstanceSpecification.Structure.Representation.Attachment.Hash',
SbstncSpcfctn_Strctr_Representation_Attchmnt_Lnguage TEXT COMMENT 'SubstanceSpecification.Structure.Representation.Attachment.Language',
SbstncSpcfctn_Strctr_Representation_Attchmnt_Sz TEXT COMMENT 'SubstanceSpecification.Structure.Representation.Attachment.Size',
SbstncSpcfctn_Strctr_Representation_Attchmnt_Ttl TEXT COMMENT 'SubstanceSpecification.Structure.Representation.Attachment.Title',
SbstncSpcfctn_Strctr_Representation_Attchmnt_Url TEXT COMMENT 'SubstanceSpecification.Structure.Representation.Attachment.Url',
SbstncSpcfctn_Strctr_Representation_Representation TEXT COMMENT 'SubstanceSpecification.Structure.Representation.Representation',
SbstncSpcfctn_Strctr_Representation_Typ_Cdg_Cd TEXT COMMENT 'SubstanceSpecification.Structure.Representation.Type.Coding.Code',
SbstncSpcfctn_Strctr_Representation_Typ_Cdg_Dsply TEXT COMMENT 'SubstanceSpecification.Structure.Representation.Type.Coding.Display',
SbstncSpcfctn_Strctr_Representation_Typ_Cdg_Sys TEXT COMMENT 'SubstanceSpecification.Structure.Representation.Type.Coding.System',
SbstncSpcfctn_Strctr_Representation_Typ_Cdg_UsrSltd TEXT COMMENT 'SubstanceSpecification.Structure.Representation.Type.Coding.UserSelected',
SbstncSpcfctn_Strctr_Representation_Typ_Cdg_Vrsn TEXT COMMENT 'SubstanceSpecification.Structure.Representation.Type.Coding.Version',
SbstncSpcfctn_Strctr_Representation_Typ_Txt TEXT COMMENT 'SubstanceSpecification.Structure.Representation.Type.Text',
SbstncSpcfctn_Strctr_Src TEXT COMMENT 'SubstanceSpecification.Structure.Source',
SbstncSpcfctn_Strctr_Stereochemistry_Cdg_Cd TEXT COMMENT 'SubstanceSpecification.Structure.Stereochemistry.Coding.Code',
SbstncSpcfctn_Strctr_Stereochemistry_Cdg_Dsply TEXT COMMENT 'SubstanceSpecification.Structure.Stereochemistry.Coding.Display',
SbstncSpcfctn_Strctr_Stereochemistry_Cdg_Sys TEXT COMMENT 'SubstanceSpecification.Structure.Stereochemistry.Coding.System',
SbstncSpcfctn_Strctr_Stereochemistry_Cdg_UsrSltd TEXT COMMENT 'SubstanceSpecification.Structure.Stereochemistry.Coding.UserSelected',
SbstncSpcfctn_Strctr_Stereochemistry_Cdg_Vrsn TEXT COMMENT 'SubstanceSpecification.Structure.Stereochemistry.Coding.Version',
SbstncSpcfctn_Strctr_Stereochemistry_Txt TEXT COMMENT 'SubstanceSpecification.Structure.Stereochemistry.Text',
SbstncSpcfctn_Typ_Cdg_Cd TEXT COMMENT 'SubstanceSpecification.Type.Coding.Code',
SbstncSpcfctn_Typ_Cdg_Dsply TEXT COMMENT 'SubstanceSpecification.Type.Coding.Display',
SbstncSpcfctn_Typ_Cdg_Sys TEXT COMMENT 'SubstanceSpecification.Type.Coding.System',
SbstncSpcfctn_Typ_Cdg_UsrSltd TEXT COMMENT 'SubstanceSpecification.Type.Coding.UserSelected',
SbstncSpcfctn_Typ_Cdg_Vrsn TEXT COMMENT 'SubstanceSpecification.Type.Coding.Version',
SbstncSpcfctn_Typ_Txt TEXT COMMENT 'SubstanceSpecification.Type.Text',
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;