// // default package
package main.templateoutput.Model;
// Generated Jan 28, 2022, 7:59:45 AM by Hibernate Tools 5.6.1.Final



/**
 * Medicinalproductindication generated by hbm2java
 */
public class Medicinalproductindication  implements java.io.Serializable {


     private Integer id;
     private String mpindicationSubjectReference;
     private String mpndctnDssSmptmPrcdrCcCdngCSstm;
     private String mpndctnDssSmptmPrcdrCcCdngCVrsn;
     private String mpndctnDssSmptmPrcdrCcCdngCCde;
     private String mpndctnDssSmptmPrcdrCcCdngCDsplay;
     private String mpndctnDssSmptmPrcdrCcCdngCSrSlctd;
     private String mpndctnDssSmptmPrcdrCcTxt;
     private String mpndctnDssSttsCcCdngCSstm;
     private String mpndctnDssSttsCcCdngCVrsn;
     private String mpndctnDssSttsCcCdngCCde;
     private String mpndctnDssSttsCcCdngCDsplay;
     private String mpndctnDssSttsCcCdngCSrSlctd;
     private String mpindicationDiseaseStatusCcText;
     private String mpndctnCmrbdtCcCdngCSstm;
     private String mpndctnCmrbdtCcCdngCVrsn;
     private String mpndctnCmrbdtCcCdngCCde;
     private String mpndctnCmrbdtCcCdngCDsplay;
     private String mpndctnCmrbdtCcCdngCSrSlctd;
     private String mpindicationComorbidityCcText;
     private String mpndctnNtnddffctCcCdngCSstm;
     private String mpndctnNtnddffctCcCdngCVrsn;
     private String mpndctnNtnddffctCcCdngCCde;
     private String mpndctnNtnddffctCcCdngCDsplay;
     private String mpndctnNtnddffctCcCdngCSrSlctd;
     private String mpndctnNtnddffctCcTxt;
     private String mpndctnDrtnQnttCmprtr;
     private String mpndctnDrtnQnttCde;
     private String mpndctnDrtnQnttVlue;
     private String mpndctnDrtnQnttNt;
     private String mpndctnDrtnQnttSstm;
     private String mpndctnThrThrpThrpRltnshpTpCcCdngCSstm;
     private String mpndctnThrThrpThrpRltnshpTpCcCdngCVrsn;
     private String mpndctnThrThrpThrpRltnshpTpCcCdngCCde;
     private String mpndctnThrThrpThrpRltnshpTpCcCdngCDsplay;
     private String mpndctnThrThrpThrpRltnshpTpCcCdngCSrSlctd;
     private String mpndctnThrThrpThrpRltnshpTpCcTxt;
     private String mpndctnThrThrpMdCdblcncptCcCdngCSstm;
     private String mpndctnThrThrpMdCdblcncptCcCdngCVrsn;
     private String mpndctnThrThrpMdCdblcncptCcCdngCCde;
     private String mpndctnThrThrpMdCdblcncptCcCdngCDsplay;
     private String mpndctnThrThrpMdCdblcncptCcCdngCSrSlctd;
     private String mpndctnThrThrpMdCdblcncptCcTxt;
     private String mpndctnThrThrpMdRfrncRfrnce;
     private String mpndctnNdsrblffctRfrnce;
     private String mpindicationPopulationPopulation;

    public Medicinalproductindication() {
    }

    public Medicinalproductindication(String mpindicationSubjectReference, String mpndctnDssSmptmPrcdrCcCdngCSstm, String mpndctnDssSmptmPrcdrCcCdngCVrsn, String mpndctnDssSmptmPrcdrCcCdngCCde, String mpndctnDssSmptmPrcdrCcCdngCDsplay, String mpndctnDssSmptmPrcdrCcCdngCSrSlctd, String mpndctnDssSmptmPrcdrCcTxt, String mpndctnDssSttsCcCdngCSstm, String mpndctnDssSttsCcCdngCVrsn, String mpndctnDssSttsCcCdngCCde, String mpndctnDssSttsCcCdngCDsplay, String mpndctnDssSttsCcCdngCSrSlctd, String mpindicationDiseaseStatusCcText, String mpndctnCmrbdtCcCdngCSstm, String mpndctnCmrbdtCcCdngCVrsn, String mpndctnCmrbdtCcCdngCCde, String mpndctnCmrbdtCcCdngCDsplay, String mpndctnCmrbdtCcCdngCSrSlctd, String mpindicationComorbidityCcText, String mpndctnNtnddffctCcCdngCSstm, String mpndctnNtnddffctCcCdngCVrsn, String mpndctnNtnddffctCcCdngCCde, String mpndctnNtnddffctCcCdngCDsplay, String mpndctnNtnddffctCcCdngCSrSlctd, String mpndctnNtnddffctCcTxt, String mpndctnDrtnQnttCmprtr, String mpndctnDrtnQnttCde, String mpndctnDrtnQnttVlue, String mpndctnDrtnQnttNt, String mpndctnDrtnQnttSstm, String mpndctnThrThrpThrpRltnshpTpCcCdngCSstm, String mpndctnThrThrpThrpRltnshpTpCcCdngCVrsn, String mpndctnThrThrpThrpRltnshpTpCcCdngCCde, String mpndctnThrThrpThrpRltnshpTpCcCdngCDsplay, String mpndctnThrThrpThrpRltnshpTpCcCdngCSrSlctd, String mpndctnThrThrpThrpRltnshpTpCcTxt, String mpndctnThrThrpMdCdblcncptCcCdngCSstm, String mpndctnThrThrpMdCdblcncptCcCdngCVrsn, String mpndctnThrThrpMdCdblcncptCcCdngCCde, String mpndctnThrThrpMdCdblcncptCcCdngCDsplay, String mpndctnThrThrpMdCdblcncptCcCdngCSrSlctd, String mpndctnThrThrpMdCdblcncptCcTxt, String mpndctnThrThrpMdRfrncRfrnce, String mpndctnNdsrblffctRfrnce, String mpindicationPopulationPopulation) {
       this.mpindicationSubjectReference = mpindicationSubjectReference;
       this.mpndctnDssSmptmPrcdrCcCdngCSstm = mpndctnDssSmptmPrcdrCcCdngCSstm;
       this.mpndctnDssSmptmPrcdrCcCdngCVrsn = mpndctnDssSmptmPrcdrCcCdngCVrsn;
       this.mpndctnDssSmptmPrcdrCcCdngCCde = mpndctnDssSmptmPrcdrCcCdngCCde;
       this.mpndctnDssSmptmPrcdrCcCdngCDsplay = mpndctnDssSmptmPrcdrCcCdngCDsplay;
       this.mpndctnDssSmptmPrcdrCcCdngCSrSlctd = mpndctnDssSmptmPrcdrCcCdngCSrSlctd;
       this.mpndctnDssSmptmPrcdrCcTxt = mpndctnDssSmptmPrcdrCcTxt;
       this.mpndctnDssSttsCcCdngCSstm = mpndctnDssSttsCcCdngCSstm;
       this.mpndctnDssSttsCcCdngCVrsn = mpndctnDssSttsCcCdngCVrsn;
       this.mpndctnDssSttsCcCdngCCde = mpndctnDssSttsCcCdngCCde;
       this.mpndctnDssSttsCcCdngCDsplay = mpndctnDssSttsCcCdngCDsplay;
       this.mpndctnDssSttsCcCdngCSrSlctd = mpndctnDssSttsCcCdngCSrSlctd;
       this.mpindicationDiseaseStatusCcText = mpindicationDiseaseStatusCcText;
       this.mpndctnCmrbdtCcCdngCSstm = mpndctnCmrbdtCcCdngCSstm;
       this.mpndctnCmrbdtCcCdngCVrsn = mpndctnCmrbdtCcCdngCVrsn;
       this.mpndctnCmrbdtCcCdngCCde = mpndctnCmrbdtCcCdngCCde;
       this.mpndctnCmrbdtCcCdngCDsplay = mpndctnCmrbdtCcCdngCDsplay;
       this.mpndctnCmrbdtCcCdngCSrSlctd = mpndctnCmrbdtCcCdngCSrSlctd;
       this.mpindicationComorbidityCcText = mpindicationComorbidityCcText;
       this.mpndctnNtnddffctCcCdngCSstm = mpndctnNtnddffctCcCdngCSstm;
       this.mpndctnNtnddffctCcCdngCVrsn = mpndctnNtnddffctCcCdngCVrsn;
       this.mpndctnNtnddffctCcCdngCCde = mpndctnNtnddffctCcCdngCCde;
       this.mpndctnNtnddffctCcCdngCDsplay = mpndctnNtnddffctCcCdngCDsplay;
       this.mpndctnNtnddffctCcCdngCSrSlctd = mpndctnNtnddffctCcCdngCSrSlctd;
       this.mpndctnNtnddffctCcTxt = mpndctnNtnddffctCcTxt;
       this.mpndctnDrtnQnttCmprtr = mpndctnDrtnQnttCmprtr;
       this.mpndctnDrtnQnttCde = mpndctnDrtnQnttCde;
       this.mpndctnDrtnQnttVlue = mpndctnDrtnQnttVlue;
       this.mpndctnDrtnQnttNt = mpndctnDrtnQnttNt;
       this.mpndctnDrtnQnttSstm = mpndctnDrtnQnttSstm;
       this.mpndctnThrThrpThrpRltnshpTpCcCdngCSstm = mpndctnThrThrpThrpRltnshpTpCcCdngCSstm;
       this.mpndctnThrThrpThrpRltnshpTpCcCdngCVrsn = mpndctnThrThrpThrpRltnshpTpCcCdngCVrsn;
       this.mpndctnThrThrpThrpRltnshpTpCcCdngCCde = mpndctnThrThrpThrpRltnshpTpCcCdngCCde;
       this.mpndctnThrThrpThrpRltnshpTpCcCdngCDsplay = mpndctnThrThrpThrpRltnshpTpCcCdngCDsplay;
       this.mpndctnThrThrpThrpRltnshpTpCcCdngCSrSlctd = mpndctnThrThrpThrpRltnshpTpCcCdngCSrSlctd;
       this.mpndctnThrThrpThrpRltnshpTpCcTxt = mpndctnThrThrpThrpRltnshpTpCcTxt;
       this.mpndctnThrThrpMdCdblcncptCcCdngCSstm = mpndctnThrThrpMdCdblcncptCcCdngCSstm;
       this.mpndctnThrThrpMdCdblcncptCcCdngCVrsn = mpndctnThrThrpMdCdblcncptCcCdngCVrsn;
       this.mpndctnThrThrpMdCdblcncptCcCdngCCde = mpndctnThrThrpMdCdblcncptCcCdngCCde;
       this.mpndctnThrThrpMdCdblcncptCcCdngCDsplay = mpndctnThrThrpMdCdblcncptCcCdngCDsplay;
       this.mpndctnThrThrpMdCdblcncptCcCdngCSrSlctd = mpndctnThrThrpMdCdblcncptCcCdngCSrSlctd;
       this.mpndctnThrThrpMdCdblcncptCcTxt = mpndctnThrThrpMdCdblcncptCcTxt;
       this.mpndctnThrThrpMdRfrncRfrnce = mpndctnThrThrpMdRfrncRfrnce;
       this.mpndctnNdsrblffctRfrnce = mpndctnNdsrblffctRfrnce;
       this.mpindicationPopulationPopulation = mpindicationPopulationPopulation;
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
    getMpindicationSubjectReference()
    {
        return this.mpindicationSubjectReference;
    }
    
    public void setMpindicationSubjectReference
        (String mpindicationSubjectReference) 
        {
      this.mpindicationSubjectReference = mpindicationSubjectReference;
}
    public 
    String 
    getMpndctnDssSmptmPrcdrCcCdngCSstm()
    {
        return this.mpndctnDssSmptmPrcdrCcCdngCSstm;
    }
    
    public void setMpndctnDssSmptmPrcdrCcCdngCSstm
        (String mpndctnDssSmptmPrcdrCcCdngCSstm) 
        {
      this.mpndctnDssSmptmPrcdrCcCdngCSstm = mpndctnDssSmptmPrcdrCcCdngCSstm;
}
    public 
    String 
    getMpndctnDssSmptmPrcdrCcCdngCVrsn()
    {
        return this.mpndctnDssSmptmPrcdrCcCdngCVrsn;
    }
    
    public void setMpndctnDssSmptmPrcdrCcCdngCVrsn
        (String mpndctnDssSmptmPrcdrCcCdngCVrsn) 
        {
      this.mpndctnDssSmptmPrcdrCcCdngCVrsn = mpndctnDssSmptmPrcdrCcCdngCVrsn;
}
    public 
    String 
    getMpndctnDssSmptmPrcdrCcCdngCCde()
    {
        return this.mpndctnDssSmptmPrcdrCcCdngCCde;
    }
    
    public void setMpndctnDssSmptmPrcdrCcCdngCCde
        (String mpndctnDssSmptmPrcdrCcCdngCCde) 
        {
      this.mpndctnDssSmptmPrcdrCcCdngCCde = mpndctnDssSmptmPrcdrCcCdngCCde;
}
    public 
    String 
    getMpndctnDssSmptmPrcdrCcCdngCDsplay()
    {
        return this.mpndctnDssSmptmPrcdrCcCdngCDsplay;
    }
    
    public void setMpndctnDssSmptmPrcdrCcCdngCDsplay
        (String mpndctnDssSmptmPrcdrCcCdngCDsplay) 
        {
      this.mpndctnDssSmptmPrcdrCcCdngCDsplay = mpndctnDssSmptmPrcdrCcCdngCDsplay;
}
    public 
    String 
    getMpndctnDssSmptmPrcdrCcCdngCSrSlctd()
    {
        return this.mpndctnDssSmptmPrcdrCcCdngCSrSlctd;
    }
    
    public void setMpndctnDssSmptmPrcdrCcCdngCSrSlctd
        (String mpndctnDssSmptmPrcdrCcCdngCSrSlctd) 
        {
      this.mpndctnDssSmptmPrcdrCcCdngCSrSlctd = mpndctnDssSmptmPrcdrCcCdngCSrSlctd;
}
    public 
    String 
    getMpndctnDssSmptmPrcdrCcTxt()
    {
        return this.mpndctnDssSmptmPrcdrCcTxt;
    }
    
    public void setMpndctnDssSmptmPrcdrCcTxt
        (String mpndctnDssSmptmPrcdrCcTxt) 
        {
      this.mpndctnDssSmptmPrcdrCcTxt = mpndctnDssSmptmPrcdrCcTxt;
}
    public 
    String 
    getMpndctnDssSttsCcCdngCSstm()
    {
        return this.mpndctnDssSttsCcCdngCSstm;
    }
    
    public void setMpndctnDssSttsCcCdngCSstm
        (String mpndctnDssSttsCcCdngCSstm) 
        {
      this.mpndctnDssSttsCcCdngCSstm = mpndctnDssSttsCcCdngCSstm;
}
    public 
    String 
    getMpndctnDssSttsCcCdngCVrsn()
    {
        return this.mpndctnDssSttsCcCdngCVrsn;
    }
    
    public void setMpndctnDssSttsCcCdngCVrsn
        (String mpndctnDssSttsCcCdngCVrsn) 
        {
      this.mpndctnDssSttsCcCdngCVrsn = mpndctnDssSttsCcCdngCVrsn;
}
    public 
    String 
    getMpndctnDssSttsCcCdngCCde()
    {
        return this.mpndctnDssSttsCcCdngCCde;
    }
    
    public void setMpndctnDssSttsCcCdngCCde
        (String mpndctnDssSttsCcCdngCCde) 
        {
      this.mpndctnDssSttsCcCdngCCde = mpndctnDssSttsCcCdngCCde;
}
    public 
    String 
    getMpndctnDssSttsCcCdngCDsplay()
    {
        return this.mpndctnDssSttsCcCdngCDsplay;
    }
    
    public void setMpndctnDssSttsCcCdngCDsplay
        (String mpndctnDssSttsCcCdngCDsplay) 
        {
      this.mpndctnDssSttsCcCdngCDsplay = mpndctnDssSttsCcCdngCDsplay;
}
    public 
    String 
    getMpndctnDssSttsCcCdngCSrSlctd()
    {
        return this.mpndctnDssSttsCcCdngCSrSlctd;
    }
    
    public void setMpndctnDssSttsCcCdngCSrSlctd
        (String mpndctnDssSttsCcCdngCSrSlctd) 
        {
      this.mpndctnDssSttsCcCdngCSrSlctd = mpndctnDssSttsCcCdngCSrSlctd;
}
    public 
    String 
    getMpindicationDiseaseStatusCcText()
    {
        return this.mpindicationDiseaseStatusCcText;
    }
    
    public void setMpindicationDiseaseStatusCcText
        (String mpindicationDiseaseStatusCcText) 
        {
      this.mpindicationDiseaseStatusCcText = mpindicationDiseaseStatusCcText;
}
    public 
    String 
    getMpndctnCmrbdtCcCdngCSstm()
    {
        return this.mpndctnCmrbdtCcCdngCSstm;
    }
    
    public void setMpndctnCmrbdtCcCdngCSstm
        (String mpndctnCmrbdtCcCdngCSstm) 
        {
      this.mpndctnCmrbdtCcCdngCSstm = mpndctnCmrbdtCcCdngCSstm;
}
    public 
    String 
    getMpndctnCmrbdtCcCdngCVrsn()
    {
        return this.mpndctnCmrbdtCcCdngCVrsn;
    }
    
    public void setMpndctnCmrbdtCcCdngCVrsn
        (String mpndctnCmrbdtCcCdngCVrsn) 
        {
      this.mpndctnCmrbdtCcCdngCVrsn = mpndctnCmrbdtCcCdngCVrsn;
}
    public 
    String 
    getMpndctnCmrbdtCcCdngCCde()
    {
        return this.mpndctnCmrbdtCcCdngCCde;
    }
    
    public void setMpndctnCmrbdtCcCdngCCde
        (String mpndctnCmrbdtCcCdngCCde) 
        {
      this.mpndctnCmrbdtCcCdngCCde = mpndctnCmrbdtCcCdngCCde;
}
    public 
    String 
    getMpndctnCmrbdtCcCdngCDsplay()
    {
        return this.mpndctnCmrbdtCcCdngCDsplay;
    }
    
    public void setMpndctnCmrbdtCcCdngCDsplay
        (String mpndctnCmrbdtCcCdngCDsplay) 
        {
      this.mpndctnCmrbdtCcCdngCDsplay = mpndctnCmrbdtCcCdngCDsplay;
}
    public 
    String 
    getMpndctnCmrbdtCcCdngCSrSlctd()
    {
        return this.mpndctnCmrbdtCcCdngCSrSlctd;
    }
    
    public void setMpndctnCmrbdtCcCdngCSrSlctd
        (String mpndctnCmrbdtCcCdngCSrSlctd) 
        {
      this.mpndctnCmrbdtCcCdngCSrSlctd = mpndctnCmrbdtCcCdngCSrSlctd;
}
    public 
    String 
    getMpindicationComorbidityCcText()
    {
        return this.mpindicationComorbidityCcText;
    }
    
    public void setMpindicationComorbidityCcText
        (String mpindicationComorbidityCcText) 
        {
      this.mpindicationComorbidityCcText = mpindicationComorbidityCcText;
}
    public 
    String 
    getMpndctnNtnddffctCcCdngCSstm()
    {
        return this.mpndctnNtnddffctCcCdngCSstm;
    }
    
    public void setMpndctnNtnddffctCcCdngCSstm
        (String mpndctnNtnddffctCcCdngCSstm) 
        {
      this.mpndctnNtnddffctCcCdngCSstm = mpndctnNtnddffctCcCdngCSstm;
}
    public 
    String 
    getMpndctnNtnddffctCcCdngCVrsn()
    {
        return this.mpndctnNtnddffctCcCdngCVrsn;
    }
    
    public void setMpndctnNtnddffctCcCdngCVrsn
        (String mpndctnNtnddffctCcCdngCVrsn) 
        {
      this.mpndctnNtnddffctCcCdngCVrsn = mpndctnNtnddffctCcCdngCVrsn;
}
    public 
    String 
    getMpndctnNtnddffctCcCdngCCde()
    {
        return this.mpndctnNtnddffctCcCdngCCde;
    }
    
    public void setMpndctnNtnddffctCcCdngCCde
        (String mpndctnNtnddffctCcCdngCCde) 
        {
      this.mpndctnNtnddffctCcCdngCCde = mpndctnNtnddffctCcCdngCCde;
}
    public 
    String 
    getMpndctnNtnddffctCcCdngCDsplay()
    {
        return this.mpndctnNtnddffctCcCdngCDsplay;
    }
    
    public void setMpndctnNtnddffctCcCdngCDsplay
        (String mpndctnNtnddffctCcCdngCDsplay) 
        {
      this.mpndctnNtnddffctCcCdngCDsplay = mpndctnNtnddffctCcCdngCDsplay;
}
    public 
    String 
    getMpndctnNtnddffctCcCdngCSrSlctd()
    {
        return this.mpndctnNtnddffctCcCdngCSrSlctd;
    }
    
    public void setMpndctnNtnddffctCcCdngCSrSlctd
        (String mpndctnNtnddffctCcCdngCSrSlctd) 
        {
      this.mpndctnNtnddffctCcCdngCSrSlctd = mpndctnNtnddffctCcCdngCSrSlctd;
}
    public 
    String 
    getMpndctnNtnddffctCcTxt()
    {
        return this.mpndctnNtnddffctCcTxt;
    }
    
    public void setMpndctnNtnddffctCcTxt
        (String mpndctnNtnddffctCcTxt) 
        {
      this.mpndctnNtnddffctCcTxt = mpndctnNtnddffctCcTxt;
}
    public 
    String 
    getMpndctnDrtnQnttCmprtr()
    {
        return this.mpndctnDrtnQnttCmprtr;
    }
    
    public void setMpndctnDrtnQnttCmprtr
        (String mpndctnDrtnQnttCmprtr) 
        {
      this.mpndctnDrtnQnttCmprtr = mpndctnDrtnQnttCmprtr;
}
    public 
    String 
    getMpndctnDrtnQnttCde()
    {
        return this.mpndctnDrtnQnttCde;
    }
    
    public void setMpndctnDrtnQnttCde
        (String mpndctnDrtnQnttCde) 
        {
      this.mpndctnDrtnQnttCde = mpndctnDrtnQnttCde;
}
    public 
    String 
    getMpndctnDrtnQnttVlue()
    {
        return this.mpndctnDrtnQnttVlue;
    }
    
    public void setMpndctnDrtnQnttVlue
        (String mpndctnDrtnQnttVlue) 
        {
      this.mpndctnDrtnQnttVlue = mpndctnDrtnQnttVlue;
}
    public 
    String 
    getMpndctnDrtnQnttNt()
    {
        return this.mpndctnDrtnQnttNt;
    }
    
    public void setMpndctnDrtnQnttNt
        (String mpndctnDrtnQnttNt) 
        {
      this.mpndctnDrtnQnttNt = mpndctnDrtnQnttNt;
}
    public 
    String 
    getMpndctnDrtnQnttSstm()
    {
        return this.mpndctnDrtnQnttSstm;
    }
    
    public void setMpndctnDrtnQnttSstm
        (String mpndctnDrtnQnttSstm) 
        {
      this.mpndctnDrtnQnttSstm = mpndctnDrtnQnttSstm;
}
    public 
    String 
    getMpndctnThrThrpThrpRltnshpTpCcCdngCSstm()
    {
        return this.mpndctnThrThrpThrpRltnshpTpCcCdngCSstm;
    }
    
    public void setMpndctnThrThrpThrpRltnshpTpCcCdngCSstm
        (String mpndctnThrThrpThrpRltnshpTpCcCdngCSstm) 
        {
      this.mpndctnThrThrpThrpRltnshpTpCcCdngCSstm = mpndctnThrThrpThrpRltnshpTpCcCdngCSstm;
}
    public 
    String 
    getMpndctnThrThrpThrpRltnshpTpCcCdngCVrsn()
    {
        return this.mpndctnThrThrpThrpRltnshpTpCcCdngCVrsn;
    }
    
    public void setMpndctnThrThrpThrpRltnshpTpCcCdngCVrsn
        (String mpndctnThrThrpThrpRltnshpTpCcCdngCVrsn) 
        {
      this.mpndctnThrThrpThrpRltnshpTpCcCdngCVrsn = mpndctnThrThrpThrpRltnshpTpCcCdngCVrsn;
}
    public 
    String 
    getMpndctnThrThrpThrpRltnshpTpCcCdngCCde()
    {
        return this.mpndctnThrThrpThrpRltnshpTpCcCdngCCde;
    }
    
    public void setMpndctnThrThrpThrpRltnshpTpCcCdngCCde
        (String mpndctnThrThrpThrpRltnshpTpCcCdngCCde) 
        {
      this.mpndctnThrThrpThrpRltnshpTpCcCdngCCde = mpndctnThrThrpThrpRltnshpTpCcCdngCCde;
}
    public 
    String 
    getMpndctnThrThrpThrpRltnshpTpCcCdngCDsplay()
    {
        return this.mpndctnThrThrpThrpRltnshpTpCcCdngCDsplay;
    }
    
    public void setMpndctnThrThrpThrpRltnshpTpCcCdngCDsplay
        (String mpndctnThrThrpThrpRltnshpTpCcCdngCDsplay) 
        {
      this.mpndctnThrThrpThrpRltnshpTpCcCdngCDsplay = mpndctnThrThrpThrpRltnshpTpCcCdngCDsplay;
}
    public 
    String 
    getMpndctnThrThrpThrpRltnshpTpCcCdngCSrSlctd()
    {
        return this.mpndctnThrThrpThrpRltnshpTpCcCdngCSrSlctd;
    }
    
    public void setMpndctnThrThrpThrpRltnshpTpCcCdngCSrSlctd
        (String mpndctnThrThrpThrpRltnshpTpCcCdngCSrSlctd) 
        {
      this.mpndctnThrThrpThrpRltnshpTpCcCdngCSrSlctd = mpndctnThrThrpThrpRltnshpTpCcCdngCSrSlctd;
}
    public 
    String 
    getMpndctnThrThrpThrpRltnshpTpCcTxt()
    {
        return this.mpndctnThrThrpThrpRltnshpTpCcTxt;
    }
    
    public void setMpndctnThrThrpThrpRltnshpTpCcTxt
        (String mpndctnThrThrpThrpRltnshpTpCcTxt) 
        {
      this.mpndctnThrThrpThrpRltnshpTpCcTxt = mpndctnThrThrpThrpRltnshpTpCcTxt;
}
    public 
    String 
    getMpndctnThrThrpMdCdblcncptCcCdngCSstm()
    {
        return this.mpndctnThrThrpMdCdblcncptCcCdngCSstm;
    }
    
    public void setMpndctnThrThrpMdCdblcncptCcCdngCSstm
        (String mpndctnThrThrpMdCdblcncptCcCdngCSstm) 
        {
      this.mpndctnThrThrpMdCdblcncptCcCdngCSstm = mpndctnThrThrpMdCdblcncptCcCdngCSstm;
}
    public 
    String 
    getMpndctnThrThrpMdCdblcncptCcCdngCVrsn()
    {
        return this.mpndctnThrThrpMdCdblcncptCcCdngCVrsn;
    }
    
    public void setMpndctnThrThrpMdCdblcncptCcCdngCVrsn
        (String mpndctnThrThrpMdCdblcncptCcCdngCVrsn) 
        {
      this.mpndctnThrThrpMdCdblcncptCcCdngCVrsn = mpndctnThrThrpMdCdblcncptCcCdngCVrsn;
}
    public 
    String 
    getMpndctnThrThrpMdCdblcncptCcCdngCCde()
    {
        return this.mpndctnThrThrpMdCdblcncptCcCdngCCde;
    }
    
    public void setMpndctnThrThrpMdCdblcncptCcCdngCCde
        (String mpndctnThrThrpMdCdblcncptCcCdngCCde) 
        {
      this.mpndctnThrThrpMdCdblcncptCcCdngCCde = mpndctnThrThrpMdCdblcncptCcCdngCCde;
}
    public 
    String 
    getMpndctnThrThrpMdCdblcncptCcCdngCDsplay()
    {
        return this.mpndctnThrThrpMdCdblcncptCcCdngCDsplay;
    }
    
    public void setMpndctnThrThrpMdCdblcncptCcCdngCDsplay
        (String mpndctnThrThrpMdCdblcncptCcCdngCDsplay) 
        {
      this.mpndctnThrThrpMdCdblcncptCcCdngCDsplay = mpndctnThrThrpMdCdblcncptCcCdngCDsplay;
}
    public 
    String 
    getMpndctnThrThrpMdCdblcncptCcCdngCSrSlctd()
    {
        return this.mpndctnThrThrpMdCdblcncptCcCdngCSrSlctd;
    }
    
    public void setMpndctnThrThrpMdCdblcncptCcCdngCSrSlctd
        (String mpndctnThrThrpMdCdblcncptCcCdngCSrSlctd) 
        {
      this.mpndctnThrThrpMdCdblcncptCcCdngCSrSlctd = mpndctnThrThrpMdCdblcncptCcCdngCSrSlctd;
}
    public 
    String 
    getMpndctnThrThrpMdCdblcncptCcTxt()
    {
        return this.mpndctnThrThrpMdCdblcncptCcTxt;
    }
    
    public void setMpndctnThrThrpMdCdblcncptCcTxt
        (String mpndctnThrThrpMdCdblcncptCcTxt) 
        {
      this.mpndctnThrThrpMdCdblcncptCcTxt = mpndctnThrThrpMdCdblcncptCcTxt;
}
    public 
    String 
    getMpndctnThrThrpMdRfrncRfrnce()
    {
        return this.mpndctnThrThrpMdRfrncRfrnce;
    }
    
    public void setMpndctnThrThrpMdRfrncRfrnce
        (String mpndctnThrThrpMdRfrncRfrnce) 
        {
      this.mpndctnThrThrpMdRfrncRfrnce = mpndctnThrThrpMdRfrncRfrnce;
}
    public 
    String 
    getMpndctnNdsrblffctRfrnce()
    {
        return this.mpndctnNdsrblffctRfrnce;
    }
    
    public void setMpndctnNdsrblffctRfrnce
        (String mpndctnNdsrblffctRfrnce) 
        {
      this.mpndctnNdsrblffctRfrnce = mpndctnNdsrblffctRfrnce;
}
    public 
    String 
    getMpindicationPopulationPopulation()
    {
        return this.mpindicationPopulationPopulation;
    }
    
    public void setMpindicationPopulationPopulation
        (String mpindicationPopulationPopulation) 
        {
      this.mpindicationPopulationPopulation = mpindicationPopulationPopulation;
}




}

