drop table if exists `Provenance`;
CREATE TABLE `Provenance` (
 id varchar(64),
Provnce_Actvty_Cdg_Cd TEXT COMMENT 'Provenance.Activity.Coding.Code',
Provnce_Actvty_Cdg_Dsply TEXT COMMENT 'Provenance.Activity.Coding.Display',
Provnce_Actvty_Cdg_Sys TEXT COMMENT 'Provenance.Activity.Coding.System',
Provnce_Actvty_Cdg_UsrSltd TEXT COMMENT 'Provenance.Activity.Coding.UserSelected',
Provnce_Actvty_Cdg_Vrsn TEXT COMMENT 'Provenance.Activity.Coding.Version',
Provnce_Actvty_Txt TEXT COMMENT 'Provenance.Activity.Text',
Provnce_Agnt_OnBehalfOf TEXT COMMENT 'Provenance.Agent.OnBehalfOf',
Provnce_Agnt_Role_Cdg_Cd TEXT COMMENT 'Provenance.Agent.Role.Coding.Code',
Provnce_Agnt_Role_Cdg_Dsply TEXT COMMENT 'Provenance.Agent.Role.Coding.Display',
Provnce_Agnt_Role_Cdg_Sys TEXT COMMENT 'Provenance.Agent.Role.Coding.System',
Provnce_Agnt_Role_Cdg_UsrSltd TEXT COMMENT 'Provenance.Agent.Role.Coding.UserSelected',
Provnce_Agnt_Role_Cdg_Vrsn TEXT COMMENT 'Provenance.Agent.Role.Coding.Version',
Provnce_Agnt_Role_Txt TEXT COMMENT 'Provenance.Agent.Role.Text',
Provnce_Agnt_Typ_Cdg_Cd TEXT COMMENT 'Provenance.Agent.Type.Coding.Code',
Provnce_Agnt_Typ_Cdg_Dsply TEXT COMMENT 'Provenance.Agent.Type.Coding.Display',
Provnce_Agnt_Typ_Cdg_Sys TEXT COMMENT 'Provenance.Agent.Type.Coding.System',
Provnce_Agnt_Typ_Cdg_UsrSltd TEXT COMMENT 'Provenance.Agent.Type.Coding.UserSelected',
Provnce_Agnt_Typ_Cdg_Vrsn TEXT COMMENT 'Provenance.Agent.Type.Coding.Version',
Provnce_Agnt_Typ_Txt TEXT COMMENT 'Provenance.Agent.Type.Text',
Provnce_Agnt_Who TEXT COMMENT 'Provenance.Agent.Who',
Provnce_Entity_Agnt_OnBehalfOf TEXT COMMENT 'Provenance.Entity.Agent.OnBehalfOf',
Provnce_Entity_Agnt_Role_Cdg_Cd TEXT COMMENT 'Provenance.Entity.Agent.Role.Coding.Code',
Provnce_Entity_Agnt_Role_Cdg_Dsply TEXT COMMENT 'Provenance.Entity.Agent.Role.Coding.Display',
Provnce_Entity_Agnt_Role_Cdg_Sys TEXT COMMENT 'Provenance.Entity.Agent.Role.Coding.System',
Provnce_Entity_Agnt_Role_Cdg_UsrSltd TEXT COMMENT 'Provenance.Entity.Agent.Role.Coding.UserSelected',
Provnce_Entity_Agnt_Role_Cdg_Vrsn TEXT COMMENT 'Provenance.Entity.Agent.Role.Coding.Version',
Provnce_Entity_Agnt_Role_Txt TEXT COMMENT 'Provenance.Entity.Agent.Role.Text',
Provnce_Entity_Agnt_Typ_Cdg_Cd TEXT COMMENT 'Provenance.Entity.Agent.Type.Coding.Code',
Provnce_Entity_Agnt_Typ_Cdg_Dsply TEXT COMMENT 'Provenance.Entity.Agent.Type.Coding.Display',
Provnce_Entity_Agnt_Typ_Cdg_Sys TEXT COMMENT 'Provenance.Entity.Agent.Type.Coding.System',
Provnce_Entity_Agnt_Typ_Cdg_UsrSltd TEXT COMMENT 'Provenance.Entity.Agent.Type.Coding.UserSelected',
Provnce_Entity_Agnt_Typ_Cdg_Vrsn TEXT COMMENT 'Provenance.Entity.Agent.Type.Coding.Version',
Provnce_Entity_Agnt_Typ_Txt TEXT COMMENT 'Provenance.Entity.Agent.Type.Text',
Provnce_Entity_Agnt_Who TEXT COMMENT 'Provenance.Entity.Agent.Who',
Provnce_Entity_Role TEXT COMMENT 'Provenance.Entity.Role',
Provnce_Entity_What TEXT COMMENT 'Provenance.Entity.What',
Provnce_Lctn TEXT COMMENT 'Provenance.Location',
Provnce_OccurredDtTimeTyp TEXT COMMENT 'Provenance.OccurredDateTimeType',
Provnce_OccurredPrd_End TEXT COMMENT 'Provenance.OccurredPeriod.End',
Provnce_OccurredPrd_Strt TEXT COMMENT 'Provenance.OccurredPeriod.Start',
Provnce_Policy TEXT COMMENT 'Provenance.Policy',
Provnce_Rsn_Cdg_Cd TEXT COMMENT 'Provenance.Reason.Coding.Code',
Provnce_Rsn_Cdg_Dsply TEXT COMMENT 'Provenance.Reason.Coding.Display',
Provnce_Rsn_Cdg_Sys TEXT COMMENT 'Provenance.Reason.Coding.System',
Provnce_Rsn_Cdg_UsrSltd TEXT COMMENT 'Provenance.Reason.Coding.UserSelected',
Provnce_Rsn_Cdg_Vrsn TEXT COMMENT 'Provenance.Reason.Coding.Version',
Provnce_Rsn_Txt TEXT COMMENT 'Provenance.Reason.Text',
Provnce_Recorded TEXT COMMENT 'Provenance.Recorded',
Provnce_Signature_Data TEXT COMMENT 'Provenance.Signature.Data',
Provnce_Signature_OnBehalfOf TEXT COMMENT 'Provenance.Signature.OnBehalfOf',
Provnce_Signature_SigFrmat TEXT COMMENT 'Provenance.Signature.SigFormat',
Provnce_Signature_TarFrmat TEXT COMMENT 'Provenance.Signature.TarFormat',
Provnce_Signature_Typ_Cd TEXT COMMENT 'Provenance.Signature.Type.Code',
Provnce_Signature_Typ_Dsply TEXT COMMENT 'Provenance.Signature.Type.Display',
Provnce_Signature_Typ_Sys TEXT COMMENT 'Provenance.Signature.Type.System',
Provnce_Signature_Typ_UsrSltd TEXT COMMENT 'Provenance.Signature.Type.UserSelected',
Provnce_Signature_Typ_Vrsn TEXT COMMENT 'Provenance.Signature.Type.Version',
Provnce_Signature_When TEXT COMMENT 'Provenance.Signature.When',
Provnce_Signature_Who TEXT COMMENT 'Provenance.Signature.Who',
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;