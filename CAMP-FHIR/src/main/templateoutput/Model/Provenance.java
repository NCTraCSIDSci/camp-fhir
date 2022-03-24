// // default package
package main.templateoutput.Model;
// Generated Jan 28, 2022, 7:59:45 AM by Hibernate Tools 5.6.1.Final



/**
 * Provenance generated by hbm2java
 */
public class Provenance  implements java.io.Serializable {


     private Integer id;
     private String provenanceTargetReference;
     private String prvnncCcrrdPrdPrdStrt;
     private String prvnncCcrrdPrdPrdNd;
     private String prvnncCcrrdDttmDtTme;
     private String provenanceRecordedInstant;
     private String provenancePolicyUri;
     private String provenanceLocationReference;
     private String prvnncRsnCcCdngCSstm;
     private String prvnncRsnCcCdngCVrsn;
     private String provenanceReasonCcCodingCCode;
     private String prvnncRsnCcCdngCDsplay;
     private String prvnncRsnCcCdngCSrSlctd;
     private String provenanceReasonCcText;
     private String prvnncCtvtCcCdngCSstm;
     private String prvnncCtvtCcCdngCVrsn;
     private String prvnncCtvtCcCdngCCde;
     private String prvnncCtvtCcCdngCDsplay;
     private String prvnncCtvtCcCdngCSrSlctd;
     private String provenanceActivityCcText;
     private String prvnncGntTpCcCdngCSstm;
     private String prvnncGntTpCcCdngCVrsn;
     private String prvnncGntTpCcCdngCCde;
     private String prvnncGntTpCcCdngCDsplay;
     private String prvnncGntTpCcCdngCSrSlctd;
     private String provenanceAgentTypeCcText;
     private String prvnncGntRlCcCdngCSstm;
     private String prvnncGntRlCcCdngCVrsn;
     private String prvnncGntRlCcCdngCCde;
     private String prvnncGntRlCcCdngCDsplay;
     private String prvnncGntRlCcCdngCSrSlctd;
     private String provenanceAgentRoleCcText;
     private String provenanceAgentWhoReference;
     private String prvnncGntNBhlffRfrnce;
     private String provenanceEntityRoleCode;
     private String provenanceEntityWhatReference;
     private String provenanceEntityAgentAgent;
     private String prvnncSgntrSgntrDta;
     private String prvnncSgntrSgntrTrgtFrmt;
     private String prvnncSgntrSgntrSgFrmt;
     private String prvnncSgntrSgntrTpCSstm;
     private String prvnncSgntrSgntrTpCVrsn;
     private String prvnncSgntrSgntrTpCCde;
     private String prvnncSgntrSgntrTpCDsplay;
     private String prvnncSgntrSgntrTpCSrSlctd;
     private String prvnncSgntrSgntrWhn;
     private String provenanceSignatureSignatureWho;
     private String prvnncSgntrSgntrNBhlff;

    public Provenance() {
    }

    public Provenance(String provenanceTargetReference, String prvnncCcrrdPrdPrdStrt, String prvnncCcrrdPrdPrdNd, String prvnncCcrrdDttmDtTme, String provenanceRecordedInstant, String provenancePolicyUri, String provenanceLocationReference, String prvnncRsnCcCdngCSstm, String prvnncRsnCcCdngCVrsn, String provenanceReasonCcCodingCCode, String prvnncRsnCcCdngCDsplay, String prvnncRsnCcCdngCSrSlctd, String provenanceReasonCcText, String prvnncCtvtCcCdngCSstm, String prvnncCtvtCcCdngCVrsn, String prvnncCtvtCcCdngCCde, String prvnncCtvtCcCdngCDsplay, String prvnncCtvtCcCdngCSrSlctd, String provenanceActivityCcText, String prvnncGntTpCcCdngCSstm, String prvnncGntTpCcCdngCVrsn, String prvnncGntTpCcCdngCCde, String prvnncGntTpCcCdngCDsplay, String prvnncGntTpCcCdngCSrSlctd, String provenanceAgentTypeCcText, String prvnncGntRlCcCdngCSstm, String prvnncGntRlCcCdngCVrsn, String prvnncGntRlCcCdngCCde, String prvnncGntRlCcCdngCDsplay, String prvnncGntRlCcCdngCSrSlctd, String provenanceAgentRoleCcText, String provenanceAgentWhoReference, String prvnncGntNBhlffRfrnce, String provenanceEntityRoleCode, String provenanceEntityWhatReference, String provenanceEntityAgentAgent, String prvnncSgntrSgntrDta, String prvnncSgntrSgntrTrgtFrmt, String prvnncSgntrSgntrSgFrmt, String prvnncSgntrSgntrTpCSstm, String prvnncSgntrSgntrTpCVrsn, String prvnncSgntrSgntrTpCCde, String prvnncSgntrSgntrTpCDsplay, String prvnncSgntrSgntrTpCSrSlctd, String prvnncSgntrSgntrWhn, String provenanceSignatureSignatureWho, String prvnncSgntrSgntrNBhlff) {
       this.provenanceTargetReference = provenanceTargetReference;
       this.prvnncCcrrdPrdPrdStrt = prvnncCcrrdPrdPrdStrt;
       this.prvnncCcrrdPrdPrdNd = prvnncCcrrdPrdPrdNd;
       this.prvnncCcrrdDttmDtTme = prvnncCcrrdDttmDtTme;
       this.provenanceRecordedInstant = provenanceRecordedInstant;
       this.provenancePolicyUri = provenancePolicyUri;
       this.provenanceLocationReference = provenanceLocationReference;
       this.prvnncRsnCcCdngCSstm = prvnncRsnCcCdngCSstm;
       this.prvnncRsnCcCdngCVrsn = prvnncRsnCcCdngCVrsn;
       this.provenanceReasonCcCodingCCode = provenanceReasonCcCodingCCode;
       this.prvnncRsnCcCdngCDsplay = prvnncRsnCcCdngCDsplay;
       this.prvnncRsnCcCdngCSrSlctd = prvnncRsnCcCdngCSrSlctd;
       this.provenanceReasonCcText = provenanceReasonCcText;
       this.prvnncCtvtCcCdngCSstm = prvnncCtvtCcCdngCSstm;
       this.prvnncCtvtCcCdngCVrsn = prvnncCtvtCcCdngCVrsn;
       this.prvnncCtvtCcCdngCCde = prvnncCtvtCcCdngCCde;
       this.prvnncCtvtCcCdngCDsplay = prvnncCtvtCcCdngCDsplay;
       this.prvnncCtvtCcCdngCSrSlctd = prvnncCtvtCcCdngCSrSlctd;
       this.provenanceActivityCcText = provenanceActivityCcText;
       this.prvnncGntTpCcCdngCSstm = prvnncGntTpCcCdngCSstm;
       this.prvnncGntTpCcCdngCVrsn = prvnncGntTpCcCdngCVrsn;
       this.prvnncGntTpCcCdngCCde = prvnncGntTpCcCdngCCde;
       this.prvnncGntTpCcCdngCDsplay = prvnncGntTpCcCdngCDsplay;
       this.prvnncGntTpCcCdngCSrSlctd = prvnncGntTpCcCdngCSrSlctd;
       this.provenanceAgentTypeCcText = provenanceAgentTypeCcText;
       this.prvnncGntRlCcCdngCSstm = prvnncGntRlCcCdngCSstm;
       this.prvnncGntRlCcCdngCVrsn = prvnncGntRlCcCdngCVrsn;
       this.prvnncGntRlCcCdngCCde = prvnncGntRlCcCdngCCde;
       this.prvnncGntRlCcCdngCDsplay = prvnncGntRlCcCdngCDsplay;
       this.prvnncGntRlCcCdngCSrSlctd = prvnncGntRlCcCdngCSrSlctd;
       this.provenanceAgentRoleCcText = provenanceAgentRoleCcText;
       this.provenanceAgentWhoReference = provenanceAgentWhoReference;
       this.prvnncGntNBhlffRfrnce = prvnncGntNBhlffRfrnce;
       this.provenanceEntityRoleCode = provenanceEntityRoleCode;
       this.provenanceEntityWhatReference = provenanceEntityWhatReference;
       this.provenanceEntityAgentAgent = provenanceEntityAgentAgent;
       this.prvnncSgntrSgntrDta = prvnncSgntrSgntrDta;
       this.prvnncSgntrSgntrTrgtFrmt = prvnncSgntrSgntrTrgtFrmt;
       this.prvnncSgntrSgntrSgFrmt = prvnncSgntrSgntrSgFrmt;
       this.prvnncSgntrSgntrTpCSstm = prvnncSgntrSgntrTpCSstm;
       this.prvnncSgntrSgntrTpCVrsn = prvnncSgntrSgntrTpCVrsn;
       this.prvnncSgntrSgntrTpCCde = prvnncSgntrSgntrTpCCde;
       this.prvnncSgntrSgntrTpCDsplay = prvnncSgntrSgntrTpCDsplay;
       this.prvnncSgntrSgntrTpCSrSlctd = prvnncSgntrSgntrTpCSrSlctd;
       this.prvnncSgntrSgntrWhn = prvnncSgntrSgntrWhn;
       this.provenanceSignatureSignatureWho = provenanceSignatureSignatureWho;
       this.prvnncSgntrSgntrNBhlff = prvnncSgntrSgntrNBhlff;
    }
   
    public 
    Integer 
    getId()
    {
        return this.id;
    }
    
    public void setId
        (Integer id) 
        {
      this.id = id;
}
    public 
    String 
    getProvenanceTargetReference()
    {
        return this.provenanceTargetReference;
    }
    
    public void setProvenanceTargetReference
        (String provenanceTargetReference) 
        {
      this.provenanceTargetReference = provenanceTargetReference;
}
    public 
    String 
    getPrvnncCcrrdPrdPrdStrt()
    {
        return this.prvnncCcrrdPrdPrdStrt;
    }
    
    public void setPrvnncCcrrdPrdPrdStrt
        (String prvnncCcrrdPrdPrdStrt) 
        {
      this.prvnncCcrrdPrdPrdStrt = prvnncCcrrdPrdPrdStrt;
}
    public 
    String 
    getPrvnncCcrrdPrdPrdNd()
    {
        return this.prvnncCcrrdPrdPrdNd;
    }
    
    public void setPrvnncCcrrdPrdPrdNd
        (String prvnncCcrrdPrdPrdNd) 
        {
      this.prvnncCcrrdPrdPrdNd = prvnncCcrrdPrdPrdNd;
}
    public 
    String 
    getPrvnncCcrrdDttmDtTme()
    {
        return this.prvnncCcrrdDttmDtTme;
    }
    
    public void setPrvnncCcrrdDttmDtTme
        (String prvnncCcrrdDttmDtTme) 
        {
      this.prvnncCcrrdDttmDtTme = prvnncCcrrdDttmDtTme;
}
    public 
    String 
    getProvenanceRecordedInstant()
    {
        return this.provenanceRecordedInstant;
    }
    
    public void setProvenanceRecordedInstant
        (String provenanceRecordedInstant) 
        {
      this.provenanceRecordedInstant = provenanceRecordedInstant;
}
    public 
    String 
    getProvenancePolicyUri()
    {
        return this.provenancePolicyUri;
    }
    
    public void setProvenancePolicyUri
        (String provenancePolicyUri) 
        {
      this.provenancePolicyUri = provenancePolicyUri;
}
    public 
    String 
    getProvenanceLocationReference()
    {
        return this.provenanceLocationReference;
    }
    
    public void setProvenanceLocationReference
        (String provenanceLocationReference) 
        {
      this.provenanceLocationReference = provenanceLocationReference;
}
    public 
    String 
    getPrvnncRsnCcCdngCSstm()
    {
        return this.prvnncRsnCcCdngCSstm;
    }
    
    public void setPrvnncRsnCcCdngCSstm
        (String prvnncRsnCcCdngCSstm) 
        {
      this.prvnncRsnCcCdngCSstm = prvnncRsnCcCdngCSstm;
}
    public 
    String 
    getPrvnncRsnCcCdngCVrsn()
    {
        return this.prvnncRsnCcCdngCVrsn;
    }
    
    public void setPrvnncRsnCcCdngCVrsn
        (String prvnncRsnCcCdngCVrsn) 
        {
      this.prvnncRsnCcCdngCVrsn = prvnncRsnCcCdngCVrsn;
}
    public 
    String 
    getProvenanceReasonCcCodingCCode()
    {
        return this.provenanceReasonCcCodingCCode;
    }
    
    public void setProvenanceReasonCcCodingCCode
        (String provenanceReasonCcCodingCCode) 
        {
      this.provenanceReasonCcCodingCCode = provenanceReasonCcCodingCCode;
}
    public 
    String 
    getPrvnncRsnCcCdngCDsplay()
    {
        return this.prvnncRsnCcCdngCDsplay;
    }
    
    public void setPrvnncRsnCcCdngCDsplay
        (String prvnncRsnCcCdngCDsplay) 
        {
      this.prvnncRsnCcCdngCDsplay = prvnncRsnCcCdngCDsplay;
}
    public 
    String 
    getPrvnncRsnCcCdngCSrSlctd()
    {
        return this.prvnncRsnCcCdngCSrSlctd;
    }
    
    public void setPrvnncRsnCcCdngCSrSlctd
        (String prvnncRsnCcCdngCSrSlctd) 
        {
      this.prvnncRsnCcCdngCSrSlctd = prvnncRsnCcCdngCSrSlctd;
}
    public 
    String 
    getProvenanceReasonCcText()
    {
        return this.provenanceReasonCcText;
    }
    
    public void setProvenanceReasonCcText
        (String provenanceReasonCcText) 
        {
      this.provenanceReasonCcText = provenanceReasonCcText;
}
    public 
    String 
    getPrvnncCtvtCcCdngCSstm()
    {
        return this.prvnncCtvtCcCdngCSstm;
    }
    
    public void setPrvnncCtvtCcCdngCSstm
        (String prvnncCtvtCcCdngCSstm) 
        {
      this.prvnncCtvtCcCdngCSstm = prvnncCtvtCcCdngCSstm;
}
    public 
    String 
    getPrvnncCtvtCcCdngCVrsn()
    {
        return this.prvnncCtvtCcCdngCVrsn;
    }
    
    public void setPrvnncCtvtCcCdngCVrsn
        (String prvnncCtvtCcCdngCVrsn) 
        {
      this.prvnncCtvtCcCdngCVrsn = prvnncCtvtCcCdngCVrsn;
}
    public 
    String 
    getPrvnncCtvtCcCdngCCde()
    {
        return this.prvnncCtvtCcCdngCCde;
    }
    
    public void setPrvnncCtvtCcCdngCCde
        (String prvnncCtvtCcCdngCCde) 
        {
      this.prvnncCtvtCcCdngCCde = prvnncCtvtCcCdngCCde;
}
    public 
    String 
    getPrvnncCtvtCcCdngCDsplay()
    {
        return this.prvnncCtvtCcCdngCDsplay;
    }
    
    public void setPrvnncCtvtCcCdngCDsplay
        (String prvnncCtvtCcCdngCDsplay) 
        {
      this.prvnncCtvtCcCdngCDsplay = prvnncCtvtCcCdngCDsplay;
}
    public 
    String 
    getPrvnncCtvtCcCdngCSrSlctd()
    {
        return this.prvnncCtvtCcCdngCSrSlctd;
    }
    
    public void setPrvnncCtvtCcCdngCSrSlctd
        (String prvnncCtvtCcCdngCSrSlctd) 
        {
      this.prvnncCtvtCcCdngCSrSlctd = prvnncCtvtCcCdngCSrSlctd;
}
    public 
    String 
    getProvenanceActivityCcText()
    {
        return this.provenanceActivityCcText;
    }
    
    public void setProvenanceActivityCcText
        (String provenanceActivityCcText) 
        {
      this.provenanceActivityCcText = provenanceActivityCcText;
}
    public 
    String 
    getPrvnncGntTpCcCdngCSstm()
    {
        return this.prvnncGntTpCcCdngCSstm;
    }
    
    public void setPrvnncGntTpCcCdngCSstm
        (String prvnncGntTpCcCdngCSstm) 
        {
      this.prvnncGntTpCcCdngCSstm = prvnncGntTpCcCdngCSstm;
}
    public 
    String 
    getPrvnncGntTpCcCdngCVrsn()
    {
        return this.prvnncGntTpCcCdngCVrsn;
    }
    
    public void setPrvnncGntTpCcCdngCVrsn
        (String prvnncGntTpCcCdngCVrsn) 
        {
      this.prvnncGntTpCcCdngCVrsn = prvnncGntTpCcCdngCVrsn;
}
    public 
    String 
    getPrvnncGntTpCcCdngCCde()
    {
        return this.prvnncGntTpCcCdngCCde;
    }
    
    public void setPrvnncGntTpCcCdngCCde
        (String prvnncGntTpCcCdngCCde) 
        {
      this.prvnncGntTpCcCdngCCde = prvnncGntTpCcCdngCCde;
}
    public 
    String 
    getPrvnncGntTpCcCdngCDsplay()
    {
        return this.prvnncGntTpCcCdngCDsplay;
    }
    
    public void setPrvnncGntTpCcCdngCDsplay
        (String prvnncGntTpCcCdngCDsplay) 
        {
      this.prvnncGntTpCcCdngCDsplay = prvnncGntTpCcCdngCDsplay;
}
    public 
    String 
    getPrvnncGntTpCcCdngCSrSlctd()
    {
        return this.prvnncGntTpCcCdngCSrSlctd;
    }
    
    public void setPrvnncGntTpCcCdngCSrSlctd
        (String prvnncGntTpCcCdngCSrSlctd) 
        {
      this.prvnncGntTpCcCdngCSrSlctd = prvnncGntTpCcCdngCSrSlctd;
}
    public 
    String 
    getProvenanceAgentTypeCcText()
    {
        return this.provenanceAgentTypeCcText;
    }
    
    public void setProvenanceAgentTypeCcText
        (String provenanceAgentTypeCcText) 
        {
      this.provenanceAgentTypeCcText = provenanceAgentTypeCcText;
}
    public 
    String 
    getPrvnncGntRlCcCdngCSstm()
    {
        return this.prvnncGntRlCcCdngCSstm;
    }
    
    public void setPrvnncGntRlCcCdngCSstm
        (String prvnncGntRlCcCdngCSstm) 
        {
      this.prvnncGntRlCcCdngCSstm = prvnncGntRlCcCdngCSstm;
}
    public 
    String 
    getPrvnncGntRlCcCdngCVrsn()
    {
        return this.prvnncGntRlCcCdngCVrsn;
    }
    
    public void setPrvnncGntRlCcCdngCVrsn
        (String prvnncGntRlCcCdngCVrsn) 
        {
      this.prvnncGntRlCcCdngCVrsn = prvnncGntRlCcCdngCVrsn;
}
    public 
    String 
    getPrvnncGntRlCcCdngCCde()
    {
        return this.prvnncGntRlCcCdngCCde;
    }
    
    public void setPrvnncGntRlCcCdngCCde
        (String prvnncGntRlCcCdngCCde) 
        {
      this.prvnncGntRlCcCdngCCde = prvnncGntRlCcCdngCCde;
}
    public 
    String 
    getPrvnncGntRlCcCdngCDsplay()
    {
        return this.prvnncGntRlCcCdngCDsplay;
    }
    
    public void setPrvnncGntRlCcCdngCDsplay
        (String prvnncGntRlCcCdngCDsplay) 
        {
      this.prvnncGntRlCcCdngCDsplay = prvnncGntRlCcCdngCDsplay;
}
    public 
    String 
    getPrvnncGntRlCcCdngCSrSlctd()
    {
        return this.prvnncGntRlCcCdngCSrSlctd;
    }
    
    public void setPrvnncGntRlCcCdngCSrSlctd
        (String prvnncGntRlCcCdngCSrSlctd) 
        {
      this.prvnncGntRlCcCdngCSrSlctd = prvnncGntRlCcCdngCSrSlctd;
}
    public 
    String 
    getProvenanceAgentRoleCcText()
    {
        return this.provenanceAgentRoleCcText;
    }
    
    public void setProvenanceAgentRoleCcText
        (String provenanceAgentRoleCcText) 
        {
      this.provenanceAgentRoleCcText = provenanceAgentRoleCcText;
}
    public 
    String 
    getProvenanceAgentWhoReference()
    {
        return this.provenanceAgentWhoReference;
    }
    
    public void setProvenanceAgentWhoReference
        (String provenanceAgentWhoReference) 
        {
      this.provenanceAgentWhoReference = provenanceAgentWhoReference;
}
    public 
    String 
    getPrvnncGntNBhlffRfrnce()
    {
        return this.prvnncGntNBhlffRfrnce;
    }
    
    public void setPrvnncGntNBhlffRfrnce
        (String prvnncGntNBhlffRfrnce) 
        {
      this.prvnncGntNBhlffRfrnce = prvnncGntNBhlffRfrnce;
}
    public 
    String 
    getProvenanceEntityRoleCode()
    {
        return this.provenanceEntityRoleCode;
    }
    
    public void setProvenanceEntityRoleCode
        (String provenanceEntityRoleCode) 
        {
      this.provenanceEntityRoleCode = provenanceEntityRoleCode;
}
    public 
    String 
    getProvenanceEntityWhatReference()
    {
        return this.provenanceEntityWhatReference;
    }
    
    public void setProvenanceEntityWhatReference
        (String provenanceEntityWhatReference) 
        {
      this.provenanceEntityWhatReference = provenanceEntityWhatReference;
}
    public 
    String 
    getProvenanceEntityAgentAgent()
    {
        return this.provenanceEntityAgentAgent;
    }
    
    public void setProvenanceEntityAgentAgent
        (String provenanceEntityAgentAgent) 
        {
      this.provenanceEntityAgentAgent = provenanceEntityAgentAgent;
}
    public 
    String 
    getPrvnncSgntrSgntrDta()
    {
        return this.prvnncSgntrSgntrDta;
    }
    
    public void setPrvnncSgntrSgntrDta
        (String prvnncSgntrSgntrDta) 
        {
      this.prvnncSgntrSgntrDta = prvnncSgntrSgntrDta;
}
    public 
    String 
    getPrvnncSgntrSgntrTrgtFrmt()
    {
        return this.prvnncSgntrSgntrTrgtFrmt;
    }
    
    public void setPrvnncSgntrSgntrTrgtFrmt
        (String prvnncSgntrSgntrTrgtFrmt) 
        {
      this.prvnncSgntrSgntrTrgtFrmt = prvnncSgntrSgntrTrgtFrmt;
}
    public 
    String 
    getPrvnncSgntrSgntrSgFrmt()
    {
        return this.prvnncSgntrSgntrSgFrmt;
    }
    
    public void setPrvnncSgntrSgntrSgFrmt
        (String prvnncSgntrSgntrSgFrmt) 
        {
      this.prvnncSgntrSgntrSgFrmt = prvnncSgntrSgntrSgFrmt;
}
    public 
    String 
    getPrvnncSgntrSgntrTpCSstm()
    {
        return this.prvnncSgntrSgntrTpCSstm;
    }
    
    public void setPrvnncSgntrSgntrTpCSstm
        (String prvnncSgntrSgntrTpCSstm) 
        {
      this.prvnncSgntrSgntrTpCSstm = prvnncSgntrSgntrTpCSstm;
}
    public 
    String 
    getPrvnncSgntrSgntrTpCVrsn()
    {
        return this.prvnncSgntrSgntrTpCVrsn;
    }
    
    public void setPrvnncSgntrSgntrTpCVrsn
        (String prvnncSgntrSgntrTpCVrsn) 
        {
      this.prvnncSgntrSgntrTpCVrsn = prvnncSgntrSgntrTpCVrsn;
}
    public 
    String 
    getPrvnncSgntrSgntrTpCCde()
    {
        return this.prvnncSgntrSgntrTpCCde;
    }
    
    public void setPrvnncSgntrSgntrTpCCde
        (String prvnncSgntrSgntrTpCCde) 
        {
      this.prvnncSgntrSgntrTpCCde = prvnncSgntrSgntrTpCCde;
}
    public 
    String 
    getPrvnncSgntrSgntrTpCDsplay()
    {
        return this.prvnncSgntrSgntrTpCDsplay;
    }
    
    public void setPrvnncSgntrSgntrTpCDsplay
        (String prvnncSgntrSgntrTpCDsplay) 
        {
      this.prvnncSgntrSgntrTpCDsplay = prvnncSgntrSgntrTpCDsplay;
}
    public 
    String 
    getPrvnncSgntrSgntrTpCSrSlctd()
    {
        return this.prvnncSgntrSgntrTpCSrSlctd;
    }
    
    public void setPrvnncSgntrSgntrTpCSrSlctd
        (String prvnncSgntrSgntrTpCSrSlctd) 
        {
      this.prvnncSgntrSgntrTpCSrSlctd = prvnncSgntrSgntrTpCSrSlctd;
}
    public 
    String 
    getPrvnncSgntrSgntrWhn()
    {
        return this.prvnncSgntrSgntrWhn;
    }
    
    public void setPrvnncSgntrSgntrWhn
        (String prvnncSgntrSgntrWhn) 
        {
      this.prvnncSgntrSgntrWhn = prvnncSgntrSgntrWhn;
}
    public 
    String 
    getProvenanceSignatureSignatureWho()
    {
        return this.provenanceSignatureSignatureWho;
    }
    
    public void setProvenanceSignatureSignatureWho
        (String provenanceSignatureSignatureWho) 
        {
      this.provenanceSignatureSignatureWho = provenanceSignatureSignatureWho;
}
    public 
    String 
    getPrvnncSgntrSgntrNBhlff()
    {
        return this.prvnncSgntrSgntrNBhlff;
    }
    
    public void setPrvnncSgntrSgntrNBhlff
        (String prvnncSgntrSgntrNBhlff) 
        {
      this.prvnncSgntrSgntrNBhlff = prvnncSgntrSgntrNBhlff;
}




}

