// // default package
package main.templateoutput.Model;
// Generated Nov 18, 2021, 1:47:20 PM by Hibernate Tools 5.6.1.Final



/**
 * Schedule generated by hbm2java
 */
public class Schedule  implements java.io.Serializable {


     private String schdlDntfrDntfrTpCdblCncptCdngCde;
     private String schdlDntfrDntfrSCde;
     private String schdlDntfrDntfrTpCdblCncptCdngSstm;
     private String schdlDntfrDntfrTpCdblCncptCdngVrsn;
     private String schdlDntfrDntfrTpCdblCncptCdngDsplay;
     private String schdlDntfrDntfrTpCdblCncptCdngSrSlctd;
     private String schdlDntfrDntfrCdblCncptTxt;
     private String schdlDntfrDntfrPrdStrt;
     private String schdlDntfrDntfrPrdNd;
     private String schdlDntfrDntfrRfrncRfrnce;
     private String schdlDntfrDntfrRfrncTpe;
     private String schdlDntfrDntfrRfrncDntfr;
     private String schdlDntfrDntfrRfrncDsplay;
     private String schdlDntfrDntfrVlStrng;
     private String schdlDntfrDntfrSstmRi;
     private String scheduleActive;
     private String schdlSrvcCtgrCdblCncptCdngSstm;
     private String schdlSrvcCtgrCdblCncptCdngVrsn;
     private String schdlSrvcCtgrCdblCncptCdngCde;
     private String schdlSrvcCtgrCdblCncptCdngDsplay;
     private String schdlSrvcCtgrCdblCncptCdngSrSlctd;
     private String schdlSrvcCtgrCdblCncptTxtStrng;
     private String schdlSrvcTpCdblCncptCdngSstm;
     private String schdlSrvcTpCdblCncptCdngVrsn;
     private String schdlSrvcTpCdblCncptCdngCde;
     private String schdlSrvcTpCdblCncptCdngDsplay;
     private String schdlSrvcTpCdblCncptCdngSrSlctd;
     private String schdlSrvcTpCdblCncptTxtStrng;
     private String schdlSpcltCdblCncptCdngSstm;
     private String schdlSpcltCdblCncptCdngVrsn;
     private String schdlSpcltCdblCncptCdngCde;
     private String schdlSpcltCdblCncptCdngDsplay;
     private String schdlSpcltCdblCncptCdngSrSlctd;
     private String schdlSpcltCdblCncptTxtStrng;
     private String schdlCtrRfrncDntfrDntfrCdblCncptCdng;
     private String schdlCtrRfrncDntfrDntfrCdblCncptTxt;
     private String schdlCtrRfrncDntfrDntfrPrdStrt;
     private String schdlCtrRfrncDntfrDntfrPrdNd;
     private String schdlCtrRfrncDntfrDntfrRfrncRfrnce;
     private String schdlCtrRfrncDntfrDntfrRfrncTpe;
     private String schdlCtrRfrncDntfrDntfrRfrncDntfr;
     private String schdlCtrRfrncDntfrDntfrRfrncDsplay;
     private String schdlCtrRfrncDntfrSe;
     private String schdlCtrRfrncDntfrSstm;
     private String schdlCtrRfrncDntfrVlue;
     private String schdlCtrRfrncRfrncStrng;
     private String schdlCtrRfrncDsplStrng;
     private String scheduleActorReferenceTypeUri;
     private String schdlPlnnngHrznPrdStrtDtTme;
     private String schdlPlnnngHrznPrdNdDtTme;
     private String scheduleComment;

    public Schedule() {
    }

	
    public Schedule(String schdlDntfrDntfrTpCdblCncptCdngCde) {
        this.schdlDntfrDntfrTpCdblCncptCdngCde = schdlDntfrDntfrTpCdblCncptCdngCde;
    }
    public Schedule(String schdlDntfrDntfrTpCdblCncptCdngCde, String schdlDntfrDntfrSCde, String schdlDntfrDntfrTpCdblCncptCdngSstm, String schdlDntfrDntfrTpCdblCncptCdngVrsn, String schdlDntfrDntfrTpCdblCncptCdngDsplay, String schdlDntfrDntfrTpCdblCncptCdngSrSlctd, String schdlDntfrDntfrCdblCncptTxt, String schdlDntfrDntfrPrdStrt, String schdlDntfrDntfrPrdNd, String schdlDntfrDntfrRfrncRfrnce, String schdlDntfrDntfrRfrncTpe, String schdlDntfrDntfrRfrncDntfr, String schdlDntfrDntfrRfrncDsplay, String schdlDntfrDntfrVlStrng, String schdlDntfrDntfrSstmRi, String scheduleActive, String schdlSrvcCtgrCdblCncptCdngSstm, String schdlSrvcCtgrCdblCncptCdngVrsn, String schdlSrvcCtgrCdblCncptCdngCde, String schdlSrvcCtgrCdblCncptCdngDsplay, String schdlSrvcCtgrCdblCncptCdngSrSlctd, String schdlSrvcCtgrCdblCncptTxtStrng, String schdlSrvcTpCdblCncptCdngSstm, String schdlSrvcTpCdblCncptCdngVrsn, String schdlSrvcTpCdblCncptCdngCde, String schdlSrvcTpCdblCncptCdngDsplay, String schdlSrvcTpCdblCncptCdngSrSlctd, String schdlSrvcTpCdblCncptTxtStrng, String schdlSpcltCdblCncptCdngSstm, String schdlSpcltCdblCncptCdngVrsn, String schdlSpcltCdblCncptCdngCde, String schdlSpcltCdblCncptCdngDsplay, String schdlSpcltCdblCncptCdngSrSlctd, String schdlSpcltCdblCncptTxtStrng, String schdlCtrRfrncDntfrDntfrCdblCncptCdng, String schdlCtrRfrncDntfrDntfrCdblCncptTxt, String schdlCtrRfrncDntfrDntfrPrdStrt, String schdlCtrRfrncDntfrDntfrPrdNd, String schdlCtrRfrncDntfrDntfrRfrncRfrnce, String schdlCtrRfrncDntfrDntfrRfrncTpe, String schdlCtrRfrncDntfrDntfrRfrncDntfr, String schdlCtrRfrncDntfrDntfrRfrncDsplay, String schdlCtrRfrncDntfrSe, String schdlCtrRfrncDntfrSstm, String schdlCtrRfrncDntfrVlue, String schdlCtrRfrncRfrncStrng, String schdlCtrRfrncDsplStrng, String scheduleActorReferenceTypeUri, String schdlPlnnngHrznPrdStrtDtTme, String schdlPlnnngHrznPrdNdDtTme, String scheduleComment) {
       this.schdlDntfrDntfrTpCdblCncptCdngCde = schdlDntfrDntfrTpCdblCncptCdngCde;
       this.schdlDntfrDntfrSCde = schdlDntfrDntfrSCde;
       this.schdlDntfrDntfrTpCdblCncptCdngSstm = schdlDntfrDntfrTpCdblCncptCdngSstm;
       this.schdlDntfrDntfrTpCdblCncptCdngVrsn = schdlDntfrDntfrTpCdblCncptCdngVrsn;
       this.schdlDntfrDntfrTpCdblCncptCdngDsplay = schdlDntfrDntfrTpCdblCncptCdngDsplay;
       this.schdlDntfrDntfrTpCdblCncptCdngSrSlctd = schdlDntfrDntfrTpCdblCncptCdngSrSlctd;
       this.schdlDntfrDntfrCdblCncptTxt = schdlDntfrDntfrCdblCncptTxt;
       this.schdlDntfrDntfrPrdStrt = schdlDntfrDntfrPrdStrt;
       this.schdlDntfrDntfrPrdNd = schdlDntfrDntfrPrdNd;
       this.schdlDntfrDntfrRfrncRfrnce = schdlDntfrDntfrRfrncRfrnce;
       this.schdlDntfrDntfrRfrncTpe = schdlDntfrDntfrRfrncTpe;
       this.schdlDntfrDntfrRfrncDntfr = schdlDntfrDntfrRfrncDntfr;
       this.schdlDntfrDntfrRfrncDsplay = schdlDntfrDntfrRfrncDsplay;
       this.schdlDntfrDntfrVlStrng = schdlDntfrDntfrVlStrng;
       this.schdlDntfrDntfrSstmRi = schdlDntfrDntfrSstmRi;
       this.scheduleActive = scheduleActive;
       this.schdlSrvcCtgrCdblCncptCdngSstm = schdlSrvcCtgrCdblCncptCdngSstm;
       this.schdlSrvcCtgrCdblCncptCdngVrsn = schdlSrvcCtgrCdblCncptCdngVrsn;
       this.schdlSrvcCtgrCdblCncptCdngCde = schdlSrvcCtgrCdblCncptCdngCde;
       this.schdlSrvcCtgrCdblCncptCdngDsplay = schdlSrvcCtgrCdblCncptCdngDsplay;
       this.schdlSrvcCtgrCdblCncptCdngSrSlctd = schdlSrvcCtgrCdblCncptCdngSrSlctd;
       this.schdlSrvcCtgrCdblCncptTxtStrng = schdlSrvcCtgrCdblCncptTxtStrng;
       this.schdlSrvcTpCdblCncptCdngSstm = schdlSrvcTpCdblCncptCdngSstm;
       this.schdlSrvcTpCdblCncptCdngVrsn = schdlSrvcTpCdblCncptCdngVrsn;
       this.schdlSrvcTpCdblCncptCdngCde = schdlSrvcTpCdblCncptCdngCde;
       this.schdlSrvcTpCdblCncptCdngDsplay = schdlSrvcTpCdblCncptCdngDsplay;
       this.schdlSrvcTpCdblCncptCdngSrSlctd = schdlSrvcTpCdblCncptCdngSrSlctd;
       this.schdlSrvcTpCdblCncptTxtStrng = schdlSrvcTpCdblCncptTxtStrng;
       this.schdlSpcltCdblCncptCdngSstm = schdlSpcltCdblCncptCdngSstm;
       this.schdlSpcltCdblCncptCdngVrsn = schdlSpcltCdblCncptCdngVrsn;
       this.schdlSpcltCdblCncptCdngCde = schdlSpcltCdblCncptCdngCde;
       this.schdlSpcltCdblCncptCdngDsplay = schdlSpcltCdblCncptCdngDsplay;
       this.schdlSpcltCdblCncptCdngSrSlctd = schdlSpcltCdblCncptCdngSrSlctd;
       this.schdlSpcltCdblCncptTxtStrng = schdlSpcltCdblCncptTxtStrng;
       this.schdlCtrRfrncDntfrDntfrCdblCncptCdng = schdlCtrRfrncDntfrDntfrCdblCncptCdng;
       this.schdlCtrRfrncDntfrDntfrCdblCncptTxt = schdlCtrRfrncDntfrDntfrCdblCncptTxt;
       this.schdlCtrRfrncDntfrDntfrPrdStrt = schdlCtrRfrncDntfrDntfrPrdStrt;
       this.schdlCtrRfrncDntfrDntfrPrdNd = schdlCtrRfrncDntfrDntfrPrdNd;
       this.schdlCtrRfrncDntfrDntfrRfrncRfrnce = schdlCtrRfrncDntfrDntfrRfrncRfrnce;
       this.schdlCtrRfrncDntfrDntfrRfrncTpe = schdlCtrRfrncDntfrDntfrRfrncTpe;
       this.schdlCtrRfrncDntfrDntfrRfrncDntfr = schdlCtrRfrncDntfrDntfrRfrncDntfr;
       this.schdlCtrRfrncDntfrDntfrRfrncDsplay = schdlCtrRfrncDntfrDntfrRfrncDsplay;
       this.schdlCtrRfrncDntfrSe = schdlCtrRfrncDntfrSe;
       this.schdlCtrRfrncDntfrSstm = schdlCtrRfrncDntfrSstm;
       this.schdlCtrRfrncDntfrVlue = schdlCtrRfrncDntfrVlue;
       this.schdlCtrRfrncRfrncStrng = schdlCtrRfrncRfrncStrng;
       this.schdlCtrRfrncDsplStrng = schdlCtrRfrncDsplStrng;
       this.scheduleActorReferenceTypeUri = scheduleActorReferenceTypeUri;
       this.schdlPlnnngHrznPrdStrtDtTme = schdlPlnnngHrznPrdStrtDtTme;
       this.schdlPlnnngHrznPrdNdDtTme = schdlPlnnngHrznPrdNdDtTme;
       this.scheduleComment = scheduleComment;
    }
   
    public String getSchdlDntfrDntfrTpCdblCncptCdngCde() {
        return this.schdlDntfrDntfrTpCdblCncptCdngCde;
    }
    
    public void setSchdlDntfrDntfrTpCdblCncptCdngCde(String schdlDntfrDntfrTpCdblCncptCdngCde) {
        this.schdlDntfrDntfrTpCdblCncptCdngCde = schdlDntfrDntfrTpCdblCncptCdngCde;
    }
    
    
    
    public String getSchdlDntfrDntfrSCde() {
        return this.schdlDntfrDntfrSCde;
    }
    
    public void setSchdlDntfrDntfrSCde(String schdlDntfrDntfrSCde) {
        this.schdlDntfrDntfrSCde = schdlDntfrDntfrSCde;
    }
    
    
    
    public String getSchdlDntfrDntfrTpCdblCncptCdngSstm() {
        return this.schdlDntfrDntfrTpCdblCncptCdngSstm;
    }
    
    public void setSchdlDntfrDntfrTpCdblCncptCdngSstm(String schdlDntfrDntfrTpCdblCncptCdngSstm) {
        this.schdlDntfrDntfrTpCdblCncptCdngSstm = schdlDntfrDntfrTpCdblCncptCdngSstm;
    }
    
    
    
    public String getSchdlDntfrDntfrTpCdblCncptCdngVrsn() {
        return this.schdlDntfrDntfrTpCdblCncptCdngVrsn;
    }
    
    public void setSchdlDntfrDntfrTpCdblCncptCdngVrsn(String schdlDntfrDntfrTpCdblCncptCdngVrsn) {
        this.schdlDntfrDntfrTpCdblCncptCdngVrsn = schdlDntfrDntfrTpCdblCncptCdngVrsn;
    }
    
    
    
    public String getSchdlDntfrDntfrTpCdblCncptCdngDsplay() {
        return this.schdlDntfrDntfrTpCdblCncptCdngDsplay;
    }
    
    public void setSchdlDntfrDntfrTpCdblCncptCdngDsplay(String schdlDntfrDntfrTpCdblCncptCdngDsplay) {
        this.schdlDntfrDntfrTpCdblCncptCdngDsplay = schdlDntfrDntfrTpCdblCncptCdngDsplay;
    }
    
    
    
    public String getSchdlDntfrDntfrTpCdblCncptCdngSrSlctd() {
        return this.schdlDntfrDntfrTpCdblCncptCdngSrSlctd;
    }
    
    public void setSchdlDntfrDntfrTpCdblCncptCdngSrSlctd(String schdlDntfrDntfrTpCdblCncptCdngSrSlctd) {
        this.schdlDntfrDntfrTpCdblCncptCdngSrSlctd = schdlDntfrDntfrTpCdblCncptCdngSrSlctd;
    }
    
    
    
    public String getSchdlDntfrDntfrCdblCncptTxt() {
        return this.schdlDntfrDntfrCdblCncptTxt;
    }
    
    public void setSchdlDntfrDntfrCdblCncptTxt(String schdlDntfrDntfrCdblCncptTxt) {
        this.schdlDntfrDntfrCdblCncptTxt = schdlDntfrDntfrCdblCncptTxt;
    }
    
    
    
    public String getSchdlDntfrDntfrPrdStrt() {
        return this.schdlDntfrDntfrPrdStrt;
    }
    
    public void setSchdlDntfrDntfrPrdStrt(String schdlDntfrDntfrPrdStrt) {
        this.schdlDntfrDntfrPrdStrt = schdlDntfrDntfrPrdStrt;
    }
    
    
    
    public String getSchdlDntfrDntfrPrdNd() {
        return this.schdlDntfrDntfrPrdNd;
    }
    
    public void setSchdlDntfrDntfrPrdNd(String schdlDntfrDntfrPrdNd) {
        this.schdlDntfrDntfrPrdNd = schdlDntfrDntfrPrdNd;
    }
    
    
    
    public String getSchdlDntfrDntfrRfrncRfrnce() {
        return this.schdlDntfrDntfrRfrncRfrnce;
    }
    
    public void setSchdlDntfrDntfrRfrncRfrnce(String schdlDntfrDntfrRfrncRfrnce) {
        this.schdlDntfrDntfrRfrncRfrnce = schdlDntfrDntfrRfrncRfrnce;
    }
    
    
    
    public String getSchdlDntfrDntfrRfrncTpe() {
        return this.schdlDntfrDntfrRfrncTpe;
    }
    
    public void setSchdlDntfrDntfrRfrncTpe(String schdlDntfrDntfrRfrncTpe) {
        this.schdlDntfrDntfrRfrncTpe = schdlDntfrDntfrRfrncTpe;
    }
    
    
    
    public String getSchdlDntfrDntfrRfrncDntfr() {
        return this.schdlDntfrDntfrRfrncDntfr;
    }
    
    public void setSchdlDntfrDntfrRfrncDntfr(String schdlDntfrDntfrRfrncDntfr) {
        this.schdlDntfrDntfrRfrncDntfr = schdlDntfrDntfrRfrncDntfr;
    }
    
    
    
    public String getSchdlDntfrDntfrRfrncDsplay() {
        return this.schdlDntfrDntfrRfrncDsplay;
    }
    
    public void setSchdlDntfrDntfrRfrncDsplay(String schdlDntfrDntfrRfrncDsplay) {
        this.schdlDntfrDntfrRfrncDsplay = schdlDntfrDntfrRfrncDsplay;
    }
    
    
    
    public String getSchdlDntfrDntfrVlStrng() {
        return this.schdlDntfrDntfrVlStrng;
    }
    
    public void setSchdlDntfrDntfrVlStrng(String schdlDntfrDntfrVlStrng) {
        this.schdlDntfrDntfrVlStrng = schdlDntfrDntfrVlStrng;
    }
    
    
    
    public String getSchdlDntfrDntfrSstmRi() {
        return this.schdlDntfrDntfrSstmRi;
    }
    
    public void setSchdlDntfrDntfrSstmRi(String schdlDntfrDntfrSstmRi) {
        this.schdlDntfrDntfrSstmRi = schdlDntfrDntfrSstmRi;
    }
    
    
    
    public String getScheduleActive() {
        return this.scheduleActive;
    }
    
    public void setScheduleActive(String scheduleActive) {
        this.scheduleActive = scheduleActive;
    }
    
    
    
    public String getSchdlSrvcCtgrCdblCncptCdngSstm() {
        return this.schdlSrvcCtgrCdblCncptCdngSstm;
    }
    
    public void setSchdlSrvcCtgrCdblCncptCdngSstm(String schdlSrvcCtgrCdblCncptCdngSstm) {
        this.schdlSrvcCtgrCdblCncptCdngSstm = schdlSrvcCtgrCdblCncptCdngSstm;
    }
    
    
    
    public String getSchdlSrvcCtgrCdblCncptCdngVrsn() {
        return this.schdlSrvcCtgrCdblCncptCdngVrsn;
    }
    
    public void setSchdlSrvcCtgrCdblCncptCdngVrsn(String schdlSrvcCtgrCdblCncptCdngVrsn) {
        this.schdlSrvcCtgrCdblCncptCdngVrsn = schdlSrvcCtgrCdblCncptCdngVrsn;
    }
    
    
    
    public String getSchdlSrvcCtgrCdblCncptCdngCde() {
        return this.schdlSrvcCtgrCdblCncptCdngCde;
    }
    
    public void setSchdlSrvcCtgrCdblCncptCdngCde(String schdlSrvcCtgrCdblCncptCdngCde) {
        this.schdlSrvcCtgrCdblCncptCdngCde = schdlSrvcCtgrCdblCncptCdngCde;
    }
    
    
    
    public String getSchdlSrvcCtgrCdblCncptCdngDsplay() {
        return this.schdlSrvcCtgrCdblCncptCdngDsplay;
    }
    
    public void setSchdlSrvcCtgrCdblCncptCdngDsplay(String schdlSrvcCtgrCdblCncptCdngDsplay) {
        this.schdlSrvcCtgrCdblCncptCdngDsplay = schdlSrvcCtgrCdblCncptCdngDsplay;
    }
    
    
    
    public String getSchdlSrvcCtgrCdblCncptCdngSrSlctd() {
        return this.schdlSrvcCtgrCdblCncptCdngSrSlctd;
    }
    
    public void setSchdlSrvcCtgrCdblCncptCdngSrSlctd(String schdlSrvcCtgrCdblCncptCdngSrSlctd) {
        this.schdlSrvcCtgrCdblCncptCdngSrSlctd = schdlSrvcCtgrCdblCncptCdngSrSlctd;
    }
    
    
    
    public String getSchdlSrvcCtgrCdblCncptTxtStrng() {
        return this.schdlSrvcCtgrCdblCncptTxtStrng;
    }
    
    public void setSchdlSrvcCtgrCdblCncptTxtStrng(String schdlSrvcCtgrCdblCncptTxtStrng) {
        this.schdlSrvcCtgrCdblCncptTxtStrng = schdlSrvcCtgrCdblCncptTxtStrng;
    }
    
    
    
    public String getSchdlSrvcTpCdblCncptCdngSstm() {
        return this.schdlSrvcTpCdblCncptCdngSstm;
    }
    
    public void setSchdlSrvcTpCdblCncptCdngSstm(String schdlSrvcTpCdblCncptCdngSstm) {
        this.schdlSrvcTpCdblCncptCdngSstm = schdlSrvcTpCdblCncptCdngSstm;
    }
    
    
    
    public String getSchdlSrvcTpCdblCncptCdngVrsn() {
        return this.schdlSrvcTpCdblCncptCdngVrsn;
    }
    
    public void setSchdlSrvcTpCdblCncptCdngVrsn(String schdlSrvcTpCdblCncptCdngVrsn) {
        this.schdlSrvcTpCdblCncptCdngVrsn = schdlSrvcTpCdblCncptCdngVrsn;
    }
    
    
    
    public String getSchdlSrvcTpCdblCncptCdngCde() {
        return this.schdlSrvcTpCdblCncptCdngCde;
    }
    
    public void setSchdlSrvcTpCdblCncptCdngCde(String schdlSrvcTpCdblCncptCdngCde) {
        this.schdlSrvcTpCdblCncptCdngCde = schdlSrvcTpCdblCncptCdngCde;
    }
    
    
    
    public String getSchdlSrvcTpCdblCncptCdngDsplay() {
        return this.schdlSrvcTpCdblCncptCdngDsplay;
    }
    
    public void setSchdlSrvcTpCdblCncptCdngDsplay(String schdlSrvcTpCdblCncptCdngDsplay) {
        this.schdlSrvcTpCdblCncptCdngDsplay = schdlSrvcTpCdblCncptCdngDsplay;
    }
    
    
    
    public String getSchdlSrvcTpCdblCncptCdngSrSlctd() {
        return this.schdlSrvcTpCdblCncptCdngSrSlctd;
    }
    
    public void setSchdlSrvcTpCdblCncptCdngSrSlctd(String schdlSrvcTpCdblCncptCdngSrSlctd) {
        this.schdlSrvcTpCdblCncptCdngSrSlctd = schdlSrvcTpCdblCncptCdngSrSlctd;
    }
    
    
    
    public String getSchdlSrvcTpCdblCncptTxtStrng() {
        return this.schdlSrvcTpCdblCncptTxtStrng;
    }
    
    public void setSchdlSrvcTpCdblCncptTxtStrng(String schdlSrvcTpCdblCncptTxtStrng) {
        this.schdlSrvcTpCdblCncptTxtStrng = schdlSrvcTpCdblCncptTxtStrng;
    }
    
    
    
    public String getSchdlSpcltCdblCncptCdngSstm() {
        return this.schdlSpcltCdblCncptCdngSstm;
    }
    
    public void setSchdlSpcltCdblCncptCdngSstm(String schdlSpcltCdblCncptCdngSstm) {
        this.schdlSpcltCdblCncptCdngSstm = schdlSpcltCdblCncptCdngSstm;
    }
    
    
    
    public String getSchdlSpcltCdblCncptCdngVrsn() {
        return this.schdlSpcltCdblCncptCdngVrsn;
    }
    
    public void setSchdlSpcltCdblCncptCdngVrsn(String schdlSpcltCdblCncptCdngVrsn) {
        this.schdlSpcltCdblCncptCdngVrsn = schdlSpcltCdblCncptCdngVrsn;
    }
    
    
    
    public String getSchdlSpcltCdblCncptCdngCde() {
        return this.schdlSpcltCdblCncptCdngCde;
    }
    
    public void setSchdlSpcltCdblCncptCdngCde(String schdlSpcltCdblCncptCdngCde) {
        this.schdlSpcltCdblCncptCdngCde = schdlSpcltCdblCncptCdngCde;
    }
    
    
    
    public String getSchdlSpcltCdblCncptCdngDsplay() {
        return this.schdlSpcltCdblCncptCdngDsplay;
    }
    
    public void setSchdlSpcltCdblCncptCdngDsplay(String schdlSpcltCdblCncptCdngDsplay) {
        this.schdlSpcltCdblCncptCdngDsplay = schdlSpcltCdblCncptCdngDsplay;
    }
    
    
    
    public String getSchdlSpcltCdblCncptCdngSrSlctd() {
        return this.schdlSpcltCdblCncptCdngSrSlctd;
    }
    
    public void setSchdlSpcltCdblCncptCdngSrSlctd(String schdlSpcltCdblCncptCdngSrSlctd) {
        this.schdlSpcltCdblCncptCdngSrSlctd = schdlSpcltCdblCncptCdngSrSlctd;
    }
    
    
    
    public String getSchdlSpcltCdblCncptTxtStrng() {
        return this.schdlSpcltCdblCncptTxtStrng;
    }
    
    public void setSchdlSpcltCdblCncptTxtStrng(String schdlSpcltCdblCncptTxtStrng) {
        this.schdlSpcltCdblCncptTxtStrng = schdlSpcltCdblCncptTxtStrng;
    }
    
    
    
    public String getSchdlCtrRfrncDntfrDntfrCdblCncptCdng() {
        return this.schdlCtrRfrncDntfrDntfrCdblCncptCdng;
    }
    
    public void setSchdlCtrRfrncDntfrDntfrCdblCncptCdng(String schdlCtrRfrncDntfrDntfrCdblCncptCdng) {
        this.schdlCtrRfrncDntfrDntfrCdblCncptCdng = schdlCtrRfrncDntfrDntfrCdblCncptCdng;
    }
    
    
    
    public String getSchdlCtrRfrncDntfrDntfrCdblCncptTxt() {
        return this.schdlCtrRfrncDntfrDntfrCdblCncptTxt;
    }
    
    public void setSchdlCtrRfrncDntfrDntfrCdblCncptTxt(String schdlCtrRfrncDntfrDntfrCdblCncptTxt) {
        this.schdlCtrRfrncDntfrDntfrCdblCncptTxt = schdlCtrRfrncDntfrDntfrCdblCncptTxt;
    }
    
    
    
    public String getSchdlCtrRfrncDntfrDntfrPrdStrt() {
        return this.schdlCtrRfrncDntfrDntfrPrdStrt;
    }
    
    public void setSchdlCtrRfrncDntfrDntfrPrdStrt(String schdlCtrRfrncDntfrDntfrPrdStrt) {
        this.schdlCtrRfrncDntfrDntfrPrdStrt = schdlCtrRfrncDntfrDntfrPrdStrt;
    }
    
    
    
    public String getSchdlCtrRfrncDntfrDntfrPrdNd() {
        return this.schdlCtrRfrncDntfrDntfrPrdNd;
    }
    
    public void setSchdlCtrRfrncDntfrDntfrPrdNd(String schdlCtrRfrncDntfrDntfrPrdNd) {
        this.schdlCtrRfrncDntfrDntfrPrdNd = schdlCtrRfrncDntfrDntfrPrdNd;
    }
    
    
    
    public String getSchdlCtrRfrncDntfrDntfrRfrncRfrnce() {
        return this.schdlCtrRfrncDntfrDntfrRfrncRfrnce;
    }
    
    public void setSchdlCtrRfrncDntfrDntfrRfrncRfrnce(String schdlCtrRfrncDntfrDntfrRfrncRfrnce) {
        this.schdlCtrRfrncDntfrDntfrRfrncRfrnce = schdlCtrRfrncDntfrDntfrRfrncRfrnce;
    }
    
    
    
    public String getSchdlCtrRfrncDntfrDntfrRfrncTpe() {
        return this.schdlCtrRfrncDntfrDntfrRfrncTpe;
    }
    
    public void setSchdlCtrRfrncDntfrDntfrRfrncTpe(String schdlCtrRfrncDntfrDntfrRfrncTpe) {
        this.schdlCtrRfrncDntfrDntfrRfrncTpe = schdlCtrRfrncDntfrDntfrRfrncTpe;
    }
    
    
    
    public String getSchdlCtrRfrncDntfrDntfrRfrncDntfr() {
        return this.schdlCtrRfrncDntfrDntfrRfrncDntfr;
    }
    
    public void setSchdlCtrRfrncDntfrDntfrRfrncDntfr(String schdlCtrRfrncDntfrDntfrRfrncDntfr) {
        this.schdlCtrRfrncDntfrDntfrRfrncDntfr = schdlCtrRfrncDntfrDntfrRfrncDntfr;
    }
    
    
    
    public String getSchdlCtrRfrncDntfrDntfrRfrncDsplay() {
        return this.schdlCtrRfrncDntfrDntfrRfrncDsplay;
    }
    
    public void setSchdlCtrRfrncDntfrDntfrRfrncDsplay(String schdlCtrRfrncDntfrDntfrRfrncDsplay) {
        this.schdlCtrRfrncDntfrDntfrRfrncDsplay = schdlCtrRfrncDntfrDntfrRfrncDsplay;
    }
    
    
    
    public String getSchdlCtrRfrncDntfrSe() {
        return this.schdlCtrRfrncDntfrSe;
    }
    
    public void setSchdlCtrRfrncDntfrSe(String schdlCtrRfrncDntfrSe) {
        this.schdlCtrRfrncDntfrSe = schdlCtrRfrncDntfrSe;
    }
    
    
    
    public String getSchdlCtrRfrncDntfrSstm() {
        return this.schdlCtrRfrncDntfrSstm;
    }
    
    public void setSchdlCtrRfrncDntfrSstm(String schdlCtrRfrncDntfrSstm) {
        this.schdlCtrRfrncDntfrSstm = schdlCtrRfrncDntfrSstm;
    }
    
    
    
    public String getSchdlCtrRfrncDntfrVlue() {
        return this.schdlCtrRfrncDntfrVlue;
    }
    
    public void setSchdlCtrRfrncDntfrVlue(String schdlCtrRfrncDntfrVlue) {
        this.schdlCtrRfrncDntfrVlue = schdlCtrRfrncDntfrVlue;
    }
    
    
    
    public String getSchdlCtrRfrncRfrncStrng() {
        return this.schdlCtrRfrncRfrncStrng;
    }
    
    public void setSchdlCtrRfrncRfrncStrng(String schdlCtrRfrncRfrncStrng) {
        this.schdlCtrRfrncRfrncStrng = schdlCtrRfrncRfrncStrng;
    }
    
    
    
    public String getSchdlCtrRfrncDsplStrng() {
        return this.schdlCtrRfrncDsplStrng;
    }
    
    public void setSchdlCtrRfrncDsplStrng(String schdlCtrRfrncDsplStrng) {
        this.schdlCtrRfrncDsplStrng = schdlCtrRfrncDsplStrng;
    }
    
    
    
    public String getScheduleActorReferenceTypeUri() {
        return this.scheduleActorReferenceTypeUri;
    }
    
    public void setScheduleActorReferenceTypeUri(String scheduleActorReferenceTypeUri) {
        this.scheduleActorReferenceTypeUri = scheduleActorReferenceTypeUri;
    }
    
    
    
    public String getSchdlPlnnngHrznPrdStrtDtTme() {
        return this.schdlPlnnngHrznPrdStrtDtTme;
    }
    
    public void setSchdlPlnnngHrznPrdStrtDtTme(String schdlPlnnngHrznPrdStrtDtTme) {
        this.schdlPlnnngHrznPrdStrtDtTme = schdlPlnnngHrznPrdStrtDtTme;
    }
    
    
    
    public String getSchdlPlnnngHrznPrdNdDtTme() {
        return this.schdlPlnnngHrznPrdNdDtTme;
    }
    
    public void setSchdlPlnnngHrznPrdNdDtTme(String schdlPlnnngHrznPrdNdDtTme) {
        this.schdlPlnnngHrznPrdNdDtTme = schdlPlnnngHrznPrdNdDtTme;
    }
    
    
    
    public String getScheduleComment() {
        return this.scheduleComment;
    }
    
    public void setScheduleComment(String scheduleComment) {
        this.scheduleComment = scheduleComment;
    }
    
    
    




}

