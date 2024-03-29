drop table if exists `AppointmentResponse`;
CREATE TABLE `AppointmentResponse` (
 id varchar(64),
AppmntRsps_Actor TEXT COMMENT 'AppointmentResponse.Actor',
AppmntRsps_Appmnt TEXT COMMENT 'AppointmentResponse.Appointment',
AppmntRsps_Comment TEXT COMMENT 'AppointmentResponse.Comment',
AppmntRsps_End TEXT COMMENT 'AppointmentResponse.End',
AppmntRsps_Id_Assigner TEXT COMMENT 'AppointmentResponse.Identifier.Assigner',
AppmntRsps_Id_Prd_End TEXT COMMENT 'AppointmentResponse.Identifier.Period.End',
AppmntRsps_Id_Prd_Strt TEXT COMMENT 'AppointmentResponse.Identifier.Period.Start',
AppmntRsps_Id_Sys TEXT COMMENT 'AppointmentResponse.Identifier.System',
AppmntRsps_Id_Typ_Cdg_Cd TEXT COMMENT 'AppointmentResponse.Identifier.Type.Coding.Code',
AppmntRsps_Id_Typ_Cdg_Dsply TEXT COMMENT 'AppointmentResponse.Identifier.Type.Coding.Display',
AppmntRsps_Id_Typ_Cdg_Sys TEXT COMMENT 'AppointmentResponse.Identifier.Type.Coding.System',
AppmntRsps_Id_Typ_Cdg_UsrSltd TEXT COMMENT 'AppointmentResponse.Identifier.Type.Coding.UserSelected',
AppmntRsps_Id_Typ_Cdg_Vrsn TEXT COMMENT 'AppointmentResponse.Identifier.Type.Coding.Version',
AppmntRsps_Id_Typ_Txt TEXT COMMENT 'AppointmentResponse.Identifier.Type.Text',
AppmntRsps_Id_Use TEXT COMMENT 'AppointmentResponse.Identifier.Use',
AppmntRsps_Id_Vl TEXT COMMENT 'AppointmentResponse.Identifier.Value',
AppmntRsps_PrtcpntSts TEXT COMMENT 'AppointmentResponse.ParticipantStatus',
AppmntRsps_PrtcpntTyp_Cdg_Cd TEXT COMMENT 'AppointmentResponse.ParticipantType.Coding.Code',
AppmntRsps_PrtcpntTyp_Cdg_Dsply TEXT COMMENT 'AppointmentResponse.ParticipantType.Coding.Display',
AppmntRsps_PrtcpntTyp_Cdg_Sys TEXT COMMENT 'AppointmentResponse.ParticipantType.Coding.System',
AppmntRsps_PrtcpntTyp_Cdg_UsrSltd TEXT COMMENT 'AppointmentResponse.ParticipantType.Coding.UserSelected',
AppmntRsps_PrtcpntTyp_Cdg_Vrsn TEXT COMMENT 'AppointmentResponse.ParticipantType.Coding.Version',
AppmntRsps_PrtcpntTyp_Txt TEXT COMMENT 'AppointmentResponse.ParticipantType.Text',
AppmntRsps_Strt TEXT COMMENT 'AppointmentResponse.Start',
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;