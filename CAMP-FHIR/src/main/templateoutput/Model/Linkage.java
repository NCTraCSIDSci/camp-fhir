// // default package
package main.templateoutput.Model;
// Generated Jan 28, 2022, 7:59:45 AM by Hibernate Tools 5.6.1.Final



/**
 * Linkage generated by hbm2java
 */
public class Linkage  implements java.io.Serializable {


     private Integer id;
     private String linkageActiveBoolean;
     private String linkageAuthorReference;
     private String linkageItemTypeCode;
     private String linkageItemResourceReference;

    public Linkage() {
    }

    public Linkage(String linkageActiveBoolean, String linkageAuthorReference, String linkageItemTypeCode, String linkageItemResourceReference) {
       this.linkageActiveBoolean = linkageActiveBoolean;
       this.linkageAuthorReference = linkageAuthorReference;
       this.linkageItemTypeCode = linkageItemTypeCode;
       this.linkageItemResourceReference = linkageItemResourceReference;
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
    getLinkageActiveBoolean()
    {
        return this.linkageActiveBoolean;
    }
    
    public void setLinkageActiveBoolean
        (String linkageActiveBoolean) 
        {
      this.linkageActiveBoolean = linkageActiveBoolean;
}
    public 
    String 
    getLinkageAuthorReference()
    {
        return this.linkageAuthorReference;
    }
    
    public void setLinkageAuthorReference
        (String linkageAuthorReference) 
        {
      this.linkageAuthorReference = linkageAuthorReference;
}
    public 
    String 
    getLinkageItemTypeCode()
    {
        return this.linkageItemTypeCode;
    }
    
    public void setLinkageItemTypeCode
        (String linkageItemTypeCode) 
        {
      this.linkageItemTypeCode = linkageItemTypeCode;
}
    public 
    String 
    getLinkageItemResourceReference()
    {
        return this.linkageItemResourceReference;
    }
    
    public void setLinkageItemResourceReference
        (String linkageItemResourceReference) 
        {
      this.linkageItemResourceReference = linkageItemResourceReference;
}




}

