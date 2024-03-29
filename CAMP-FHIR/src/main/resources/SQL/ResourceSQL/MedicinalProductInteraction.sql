drop table if exists `MedicinalProductInteraction`;
CREATE TABLE `MedicinalProductInteraction` (
 id varchar(64),
MdcnlPrdctInteraction_Dscrptn TEXT COMMENT 'MedicinalProductInteraction.Description',
MdcnlPrdctInteraction_Efct_Cdg_Cd TEXT COMMENT 'MedicinalProductInteraction.Effect.Coding.Code',
MdcnlPrdctInteraction_Efct_Cdg_Dsply TEXT COMMENT 'MedicinalProductInteraction.Effect.Coding.Display',
MdcnlPrdctInteraction_Efct_Cdg_Sys TEXT COMMENT 'MedicinalProductInteraction.Effect.Coding.System',
MdcnlPrdctInteraction_Efct_Cdg_UsrSltd TEXT COMMENT 'MedicinalProductInteraction.Effect.Coding.UserSelected',
MdcnlPrdctInteraction_Efct_Cdg_Vrsn TEXT COMMENT 'MedicinalProductInteraction.Effect.Coding.Version',
MdcnlPrdctInteraction_Efct_Txt TEXT COMMENT 'MedicinalProductInteraction.Effect.Text',
MdcnlPrdctInteraction_Incidence_Cdg_Cd TEXT COMMENT 'MedicinalProductInteraction.Incidence.Coding.Code',
MdcnlPrdctInteraction_Incidence_Cdg_Dsply TEXT COMMENT 'MedicinalProductInteraction.Incidence.Coding.Display',
MdcnlPrdctInteraction_Incidence_Cdg_Sys TEXT COMMENT 'MedicinalProductInteraction.Incidence.Coding.System',
MdcnlPrdctInteraction_Incidence_Cdg_UsrSltd TEXT COMMENT 'MedicinalProductInteraction.Incidence.Coding.UserSelected',
MdcnlPrdctInteraction_Incidence_Cdg_Vrsn TEXT COMMENT 'MedicinalProductInteraction.Incidence.Coding.Version',
MdcnlPrdctInteraction_Incidence_Txt TEXT COMMENT 'MedicinalProductInteraction.Incidence.Text',
MdcnlPrdctInteraction_Interactant_ItmCdbleCncpt_Cdg_Cd TEXT COMMENT 'MedicinalProductInteraction.Interactant.ItemCodeableConcept.Coding.Code',
MdcnlPrdctInteraction_Interactant_ItmCdbleCncpt_Cdg_Dsply TEXT COMMENT 'MedicinalProductInteraction.Interactant.ItemCodeableConcept.Coding.Display',
MdcnlPrdctInteraction_Interactant_ItmCdbleCncpt_Cdg_Sys TEXT COMMENT 'MedicinalProductInteraction.Interactant.ItemCodeableConcept.Coding.System',
MdcnlPrdctInteraction_Interactant_ItmCdbleCncpt_Cdg_UsrSltd TEXT COMMENT 'MedicinalProductInteraction.Interactant.ItemCodeableConcept.Coding.UserSelected',
MdcnlPrdctInteraction_Interactant_ItmCdbleCncpt_Cdg_Vrsn TEXT COMMENT 'MedicinalProductInteraction.Interactant.ItemCodeableConcept.Coding.Version',
MdcnlPrdctInteraction_Interactant_ItmCdbleCncpt_Txt TEXT COMMENT 'MedicinalProductInteraction.Interactant.ItemCodeableConcept.Text',
MdcnlPrdctInteraction_Interactant_ItmRfrnc TEXT COMMENT 'MedicinalProductInteraction.Interactant.ItemReference',
MdcnlPrdctInteraction_Management_Cdg_Cd TEXT COMMENT 'MedicinalProductInteraction.Management.Coding.Code',
MdcnlPrdctInteraction_Management_Cdg_Dsply TEXT COMMENT 'MedicinalProductInteraction.Management.Coding.Display',
MdcnlPrdctInteraction_Management_Cdg_Sys TEXT COMMENT 'MedicinalProductInteraction.Management.Coding.System',
MdcnlPrdctInteraction_Management_Cdg_UsrSltd TEXT COMMENT 'MedicinalProductInteraction.Management.Coding.UserSelected',
MdcnlPrdctInteraction_Management_Cdg_Vrsn TEXT COMMENT 'MedicinalProductInteraction.Management.Coding.Version',
MdcnlPrdctInteraction_Management_Txt TEXT COMMENT 'MedicinalProductInteraction.Management.Text',
MdcnlPrdctInteraction_Sbjct TEXT COMMENT 'MedicinalProductInteraction.Subject',
MdcnlPrdctInteraction_Typ_Cdg_Cd TEXT COMMENT 'MedicinalProductInteraction.Type.Coding.Code',
MdcnlPrdctInteraction_Typ_Cdg_Dsply TEXT COMMENT 'MedicinalProductInteraction.Type.Coding.Display',
MdcnlPrdctInteraction_Typ_Cdg_Sys TEXT COMMENT 'MedicinalProductInteraction.Type.Coding.System',
MdcnlPrdctInteraction_Typ_Cdg_UsrSltd TEXT COMMENT 'MedicinalProductInteraction.Type.Coding.UserSelected',
MdcnlPrdctInteraction_Typ_Cdg_Vrsn TEXT COMMENT 'MedicinalProductInteraction.Type.Coding.Version',
MdcnlPrdctInteraction_Typ_Txt TEXT COMMENT 'MedicinalProductInteraction.Type.Text',
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;