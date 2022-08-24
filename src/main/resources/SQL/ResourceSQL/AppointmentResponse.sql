drop table if exists `AppointmentResponse`;
CREATE TABLE `AppointmentResponse` (
 id varchar(64),
AppmntRsps_Actor TEXT,
AppmntRsps_Appmnt TEXT,
AppmntRsps_Comment TEXT,
AppmntRsps_End TEXT,
AppmntRsps_Id_Assigner TEXT,
AppmntRsps_Id_Prd_End TEXT,
AppmntRsps_Id_Prd_Strt TEXT,
AppmntRsps_Id_Sys TEXT,
AppmntRsps_Id_Typ_Cdg_Cd TEXT,
AppmntRsps_Id_Typ_Cdg_Dsply TEXT,
AppmntRsps_Id_Typ_Cdg_Sys TEXT,
AppmntRsps_Id_Typ_Cdg_UsrSltd TEXT,
AppmntRsps_Id_Typ_Cdg_Vrsn TEXT,
AppmntRsps_Id_Typ_Txt TEXT,
AppmntRsps_Id_Use TEXT,
AppmntRsps_Id_Vl TEXT,
AppmntRsps_PrtcpntSts TEXT,
AppmntRsps_PrtcpntTyp_Cdg_Cd TEXT,
AppmntRsps_PrtcpntTyp_Cdg_Dsply TEXT,
AppmntRsps_PrtcpntTyp_Cdg_Sys TEXT,
AppmntRsps_PrtcpntTyp_Cdg_UsrSltd TEXT,
AppmntRsps_PrtcpntTyp_Cdg_Vrsn TEXT,
AppmntRsps_PrtcpntTyp_Txt TEXT,
AppmntRsps_Strt TEXT,
PRIMARY KEY(id)) ENGINE=MyISAM
    ROW_FORMAT=COMPRESSED 
    KEY_BLOCK_SIZE=8;