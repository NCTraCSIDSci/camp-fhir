drop table if exists `SubstanceNucleicAcid`;
CREATE TABLE `SubstanceNucleicAcid` (
 id varchar(64),
SbstncNclicAcid_AreaOfHybridisation TEXT COMMENT 'SubstanceNucleicAcid.AreaOfHybridisation',
SbstncNclicAcid_NmbrOfSubunts TEXT COMMENT 'SubstanceNucleicAcid.NumberOfSubunits',
SbstncNclicAcid_OligoNucleotideTyp_Cdg_Cd TEXT COMMENT 'SubstanceNucleicAcid.OligoNucleotideType.Coding.Code',
SbstncNclicAcid_OligoNucleotideTyp_Cdg_Dsply TEXT COMMENT 'SubstanceNucleicAcid.OligoNucleotideType.Coding.Display',
SbstncNclicAcid_OligoNucleotideTyp_Cdg_Sys TEXT COMMENT 'SubstanceNucleicAcid.OligoNucleotideType.Coding.System',
SbstncNclicAcid_OligoNucleotideTyp_Cdg_UsrSltd TEXT COMMENT 'SubstanceNucleicAcid.OligoNucleotideType.Coding.UserSelected',
SbstncNclicAcid_OligoNucleotideTyp_Cdg_Vrsn TEXT COMMENT 'SubstanceNucleicAcid.OligoNucleotideType.Coding.Version',
SbstncNclicAcid_OligoNucleotideTyp_Txt TEXT COMMENT 'SubstanceNucleicAcid.OligoNucleotideType.Text',
SbstncNclicAcid_SqncTyp_Cdg_Cd TEXT COMMENT 'SubstanceNucleicAcid.SequenceType.Coding.Code',
SbstncNclicAcid_SqncTyp_Cdg_Dsply TEXT COMMENT 'SubstanceNucleicAcid.SequenceType.Coding.Display',
SbstncNclicAcid_SqncTyp_Cdg_Sys TEXT COMMENT 'SubstanceNucleicAcid.SequenceType.Coding.System',
SbstncNclicAcid_SqncTyp_Cdg_UsrSltd TEXT COMMENT 'SubstanceNucleicAcid.SequenceType.Coding.UserSelected',
SbstncNclicAcid_SqncTyp_Cdg_Vrsn TEXT COMMENT 'SubstanceNucleicAcid.SequenceType.Coding.Version',
SbstncNclicAcid_SqncTyp_Txt TEXT COMMENT 'SubstanceNucleicAcid.SequenceType.Text',
SbstncNclicAcid_Subunt_FivePrime_Cdg_Cd TEXT COMMENT 'SubstanceNucleicAcid.Subunit.FivePrime.Coding.Code',
SbstncNclicAcid_Subunt_FivePrime_Cdg_Dsply TEXT COMMENT 'SubstanceNucleicAcid.Subunit.FivePrime.Coding.Display',
SbstncNclicAcid_Subunt_FivePrime_Cdg_Sys TEXT COMMENT 'SubstanceNucleicAcid.Subunit.FivePrime.Coding.System',
SbstncNclicAcid_Subunt_FivePrime_Cdg_UsrSltd TEXT COMMENT 'SubstanceNucleicAcid.Subunit.FivePrime.Coding.UserSelected',
SbstncNclicAcid_Subunt_FivePrime_Cdg_Vrsn TEXT COMMENT 'SubstanceNucleicAcid.Subunit.FivePrime.Coding.Version',
SbstncNclicAcid_Subunt_FivePrime_Txt TEXT COMMENT 'SubstanceNucleicAcid.Subunit.FivePrime.Text',
SbstncNclicAcid_Subunt_Length TEXT COMMENT 'SubstanceNucleicAcid.Subunit.Length',
SbstncNclicAcid_Subunt_Linkage_Connectivity TEXT COMMENT 'SubstanceNucleicAcid.Subunit.Linkage.Connectivity',
SbstncNclicAcid_Subunt_Linkage_Id_Assigner TEXT COMMENT 'SubstanceNucleicAcid.Subunit.Linkage.Identifier.Assigner',
SbstncNclicAcid_Subunt_Linkage_Id_Prd_End TEXT COMMENT 'SubstanceNucleicAcid.Subunit.Linkage.Identifier.Period.End',
SbstncNclicAcid_Subunt_Linkage_Id_Prd_Strt TEXT COMMENT 'SubstanceNucleicAcid.Subunit.Linkage.Identifier.Period.Start',
SbstncNclicAcid_Subunt_Linkage_Id_Sys TEXT COMMENT 'SubstanceNucleicAcid.Subunit.Linkage.Identifier.System',
SbstncNclicAcid_Subunt_Linkage_Id_Typ_Cdg_Cd TEXT COMMENT 'SubstanceNucleicAcid.Subunit.Linkage.Identifier.Type.Coding.Code',
SbstncNclicAcid_Subunt_Linkage_Id_Typ_Cdg_Dsply TEXT COMMENT 'SubstanceNucleicAcid.Subunit.Linkage.Identifier.Type.Coding.Display',
SbstncNclicAcid_Subunt_Linkage_Id_Typ_Cdg_Sys TEXT COMMENT 'SubstanceNucleicAcid.Subunit.Linkage.Identifier.Type.Coding.System',
SbstncNclicAcid_Subunt_Linkage_Id_Typ_Cdg_UsrSltd TEXT COMMENT 'SubstanceNucleicAcid.Subunit.Linkage.Identifier.Type.Coding.UserSelected',
SbstncNclicAcid_Subunt_Linkage_Id_Typ_Cdg_Vrsn TEXT COMMENT 'SubstanceNucleicAcid.Subunit.Linkage.Identifier.Type.Coding.Version',
SbstncNclicAcid_Subunt_Linkage_Id_Typ_Txt TEXT COMMENT 'SubstanceNucleicAcid.Subunit.Linkage.Identifier.Type.Text',
SbstncNclicAcid_Subunt_Linkage_Id_Use TEXT COMMENT 'SubstanceNucleicAcid.Subunit.Linkage.Identifier.Use',
SbstncNclicAcid_Subunt_Linkage_Id_Vl TEXT COMMENT 'SubstanceNucleicAcid.Subunit.Linkage.Identifier.Value',
SbstncNclicAcid_Subunt_Linkage_Nm TEXT COMMENT 'SubstanceNucleicAcid.Subunit.Linkage.Name',
SbstncNclicAcid_Subunt_Linkage_ResidueSite TEXT COMMENT 'SubstanceNucleicAcid.Subunit.Linkage.ResidueSite',
SbstncNclicAcid_Subunt_Sqnc TEXT COMMENT 'SubstanceNucleicAcid.Subunit.Sequence',
SbstncNclicAcid_Subunt_SqncAttchmnt_CntntTyp TEXT COMMENT 'SubstanceNucleicAcid.Subunit.SequenceAttachment.ContentType',
SbstncNclicAcid_Subunt_SqncAttchmnt_Creation TEXT COMMENT 'SubstanceNucleicAcid.Subunit.SequenceAttachment.Creation',
SbstncNclicAcid_Subunt_SqncAttchmnt_Data TEXT COMMENT 'SubstanceNucleicAcid.Subunit.SequenceAttachment.Data',
SbstncNclicAcid_Subunt_SqncAttchmnt_Hash TEXT COMMENT 'SubstanceNucleicAcid.Subunit.SequenceAttachment.Hash',
SbstncNclicAcid_Subunt_SqncAttchmnt_Lnguage TEXT COMMENT 'SubstanceNucleicAcid.Subunit.SequenceAttachment.Language',
SbstncNclicAcid_Subunt_SqncAttchmnt_Sz TEXT COMMENT 'SubstanceNucleicAcid.Subunit.SequenceAttachment.Size',
SbstncNclicAcid_Subunt_SqncAttchmnt_Ttl TEXT COMMENT 'SubstanceNucleicAcid.Subunit.SequenceAttachment.Title',
SbstncNclicAcid_Subunt_SqncAttchmnt_Url TEXT COMMENT 'SubstanceNucleicAcid.Subunit.SequenceAttachment.Url',
SbstncNclicAcid_Subunt_Subunt TEXT COMMENT 'SubstanceNucleicAcid.Subunit.Subunit',
SbstncNclicAcid_Subunt_Sugar_Id_Assigner TEXT COMMENT 'SubstanceNucleicAcid.Subunit.Sugar.Identifier.Assigner',
SbstncNclicAcid_Subunt_Sugar_Id_Prd_End TEXT COMMENT 'SubstanceNucleicAcid.Subunit.Sugar.Identifier.Period.End',
SbstncNclicAcid_Subunt_Sugar_Id_Prd_Strt TEXT COMMENT 'SubstanceNucleicAcid.Subunit.Sugar.Identifier.Period.Start',
SbstncNclicAcid_Subunt_Sugar_Id_Sys TEXT COMMENT 'SubstanceNucleicAcid.Subunit.Sugar.Identifier.System',
SbstncNclicAcid_Subunt_Sugar_Id_Typ_Cdg_Cd TEXT COMMENT 'SubstanceNucleicAcid.Subunit.Sugar.Identifier.Type.Coding.Code',
SbstncNclicAcid_Subunt_Sugar_Id_Typ_Cdg_Dsply TEXT COMMENT 'SubstanceNucleicAcid.Subunit.Sugar.Identifier.Type.Coding.Display',
SbstncNclicAcid_Subunt_Sugar_Id_Typ_Cdg_Sys TEXT COMMENT 'SubstanceNucleicAcid.Subunit.Sugar.Identifier.Type.Coding.System',
SbstncNclicAcid_Subunt_Sugar_Id_Typ_Cdg_UsrSltd TEXT COMMENT 'SubstanceNucleicAcid.Subunit.Sugar.Identifier.Type.Coding.UserSelected',
SbstncNclicAcid_Subunt_Sugar_Id_Typ_Cdg_Vrsn TEXT COMMENT 'SubstanceNucleicAcid.Subunit.Sugar.Identifier.Type.Coding.Version',
SbstncNclicAcid_Subunt_Sugar_Id_Typ_Txt TEXT COMMENT 'SubstanceNucleicAcid.Subunit.Sugar.Identifier.Type.Text',
SbstncNclicAcid_Subunt_Sugar_Id_Use TEXT COMMENT 'SubstanceNucleicAcid.Subunit.Sugar.Identifier.Use',
SbstncNclicAcid_Subunt_Sugar_Id_Vl TEXT COMMENT 'SubstanceNucleicAcid.Subunit.Sugar.Identifier.Value',
SbstncNclicAcid_Subunt_Sugar_Nm TEXT COMMENT 'SubstanceNucleicAcid.Subunit.Sugar.Name',
SbstncNclicAcid_Subunt_Sugar_ResidueSite TEXT COMMENT 'SubstanceNucleicAcid.Subunit.Sugar.ResidueSite',
SbstncNclicAcid_Subunt_ThreePrime_Cdg_Cd TEXT COMMENT 'SubstanceNucleicAcid.Subunit.ThreePrime.Coding.Code',
SbstncNclicAcid_Subunt_ThreePrime_Cdg_Dsply TEXT COMMENT 'SubstanceNucleicAcid.Subunit.ThreePrime.Coding.Display',
SbstncNclicAcid_Subunt_ThreePrime_Cdg_Sys TEXT COMMENT 'SubstanceNucleicAcid.Subunit.ThreePrime.Coding.System',
SbstncNclicAcid_Subunt_ThreePrime_Cdg_UsrSltd TEXT COMMENT 'SubstanceNucleicAcid.Subunit.ThreePrime.Coding.UserSelected',
SbstncNclicAcid_Subunt_ThreePrime_Cdg_Vrsn TEXT COMMENT 'SubstanceNucleicAcid.Subunit.ThreePrime.Coding.Version',
SbstncNclicAcid_Subunt_ThreePrime_Txt TEXT COMMENT 'SubstanceNucleicAcid.Subunit.ThreePrime.Text',
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;