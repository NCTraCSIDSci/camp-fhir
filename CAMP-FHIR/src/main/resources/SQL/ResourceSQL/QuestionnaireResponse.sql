drop table if exists `QuestionnaireResponse`;
CREATE TABLE `QuestionnaireResponse` (
 id varchar(64),
QstnaireRsps_Athr TEXT COMMENT 'QuestionnaireResponse.Author',
QstnaireRsps_Athred TEXT COMMENT 'QuestionnaireResponse.Authored',
QstnaireRsps_BasedOn TEXT COMMENT 'QuestionnaireResponse.BasedOn',
QstnaireRsps_Enc TEXT COMMENT 'QuestionnaireResponse.Encounter',
QstnaireRsps_Id_Assigner TEXT COMMENT 'QuestionnaireResponse.Identifier.Assigner',
QstnaireRsps_Id_Prd_End TEXT COMMENT 'QuestionnaireResponse.Identifier.Period.End',
QstnaireRsps_Id_Prd_Strt TEXT COMMENT 'QuestionnaireResponse.Identifier.Period.Start',
QstnaireRsps_Id_Sys TEXT COMMENT 'QuestionnaireResponse.Identifier.System',
QstnaireRsps_Id_Typ_Cdg_Cd TEXT COMMENT 'QuestionnaireResponse.Identifier.Type.Coding.Code',
QstnaireRsps_Id_Typ_Cdg_Dsply TEXT COMMENT 'QuestionnaireResponse.Identifier.Type.Coding.Display',
QstnaireRsps_Id_Typ_Cdg_Sys TEXT COMMENT 'QuestionnaireResponse.Identifier.Type.Coding.System',
QstnaireRsps_Id_Typ_Cdg_UsrSltd TEXT COMMENT 'QuestionnaireResponse.Identifier.Type.Coding.UserSelected',
QstnaireRsps_Id_Typ_Cdg_Vrsn TEXT COMMENT 'QuestionnaireResponse.Identifier.Type.Coding.Version',
QstnaireRsps_Id_Typ_Txt TEXT COMMENT 'QuestionnaireResponse.Identifier.Type.Text',
QstnaireRsps_Id_Use TEXT COMMENT 'QuestionnaireResponse.Identifier.Use',
QstnaireRsps_Id_Vl TEXT COMMENT 'QuestionnaireResponse.Identifier.Value',
QstnaireRsps_Itm_Ans_VlAttchmnt_CntntTyp TEXT COMMENT 'QuestionnaireResponse.Item.Answer.ValueAttachment.ContentType',
QstnaireRsps_Itm_Ans_VlAttchmnt_Creation TEXT COMMENT 'QuestionnaireResponse.Item.Answer.ValueAttachment.Creation',
QstnaireRsps_Itm_Ans_VlAttchmnt_Data TEXT COMMENT 'QuestionnaireResponse.Item.Answer.ValueAttachment.Data',
QstnaireRsps_Itm_Ans_VlAttchmnt_Hash TEXT COMMENT 'QuestionnaireResponse.Item.Answer.ValueAttachment.Hash',
QstnaireRsps_Itm_Ans_VlAttchmnt_Lnguage TEXT COMMENT 'QuestionnaireResponse.Item.Answer.ValueAttachment.Language',
QstnaireRsps_Itm_Ans_VlAttchmnt_Sz TEXT COMMENT 'QuestionnaireResponse.Item.Answer.ValueAttachment.Size',
QstnaireRsps_Itm_Ans_VlAttchmnt_Ttl TEXT COMMENT 'QuestionnaireResponse.Item.Answer.ValueAttachment.Title',
QstnaireRsps_Itm_Ans_VlAttchmnt_Url TEXT COMMENT 'QuestionnaireResponse.Item.Answer.ValueAttachment.Url',
QstnaireRsps_Itm_Ans_VlBooleanTyp TEXT COMMENT 'QuestionnaireResponse.Item.Answer.ValueBooleanType',
QstnaireRsps_Itm_Ans_VlCdg_Cd TEXT COMMENT 'QuestionnaireResponse.Item.Answer.ValueCoding.Code',
QstnaireRsps_Itm_Ans_VlCdg_Dsply TEXT COMMENT 'QuestionnaireResponse.Item.Answer.ValueCoding.Display',
QstnaireRsps_Itm_Ans_VlCdg_Sys TEXT COMMENT 'QuestionnaireResponse.Item.Answer.ValueCoding.System',
QstnaireRsps_Itm_Ans_VlCdg_UsrSltd TEXT COMMENT 'QuestionnaireResponse.Item.Answer.ValueCoding.UserSelected',
QstnaireRsps_Itm_Ans_VlCdg_Vrsn TEXT COMMENT 'QuestionnaireResponse.Item.Answer.ValueCoding.Version',
QstnaireRsps_Itm_Ans_VlDtTimeTyp TEXT COMMENT 'QuestionnaireResponse.Item.Answer.ValueDateTimeType',
QstnaireRsps_Itm_Ans_VlDtTyp TEXT COMMENT 'QuestionnaireResponse.Item.Answer.ValueDateType',
QstnaireRsps_Itm_Ans_VlDecimalTyp TEXT COMMENT 'QuestionnaireResponse.Item.Answer.ValueDecimalType',
QstnaireRsps_Itm_Ans_VlIntegerTyp TEXT COMMENT 'QuestionnaireResponse.Item.Answer.ValueIntegerType',
QstnaireRsps_Itm_Ans_VlQnty_Cd TEXT COMMENT 'QuestionnaireResponse.Item.Answer.ValueQuantity.Code',
QstnaireRsps_Itm_Ans_VlQnty_Cmprtr TEXT COMMENT 'QuestionnaireResponse.Item.Answer.ValueQuantity.Comparator',
QstnaireRsps_Itm_Ans_VlQnty_Sys TEXT COMMENT 'QuestionnaireResponse.Item.Answer.ValueQuantity.System',
QstnaireRsps_Itm_Ans_VlQnty_Unt TEXT COMMENT 'QuestionnaireResponse.Item.Answer.ValueQuantity.Unit',
QstnaireRsps_Itm_Ans_VlQnty_Vl TEXT COMMENT 'QuestionnaireResponse.Item.Answer.ValueQuantity.Value',
QstnaireRsps_Itm_Ans_VlRfrnc TEXT COMMENT 'QuestionnaireResponse.Item.Answer.ValueReference',
QstnaireRsps_Itm_Ans_VlStrgTyp TEXT COMMENT 'QuestionnaireResponse.Item.Answer.ValueStringType',
QstnaireRsps_Itm_Ans_VlTimeTyp TEXT COMMENT 'QuestionnaireResponse.Item.Answer.ValueTimeType',
QstnaireRsps_Itm_Ans_VlUriTyp TEXT COMMENT 'QuestionnaireResponse.Item.Answer.ValueUriType',
QstnaireRsps_Itm_Dfn TEXT COMMENT 'QuestionnaireResponse.Item.Definition',
QstnaireRsps_Itm_LinkId TEXT COMMENT 'QuestionnaireResponse.Item.LinkId',
QstnaireRsps_Itm_Txt TEXT COMMENT 'QuestionnaireResponse.Item.Text',
QstnaireRsps_PartOf TEXT COMMENT 'QuestionnaireResponse.PartOf',
QstnaireRsps_Qstnaire TEXT COMMENT 'QuestionnaireResponse.Questionnaire',
QstnaireRsps_Src TEXT COMMENT 'QuestionnaireResponse.Source',
QstnaireRsps_Sts TEXT COMMENT 'QuestionnaireResponse.Status',
QstnaireRsps_Sbjct TEXT COMMENT 'QuestionnaireResponse.Subject',
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;