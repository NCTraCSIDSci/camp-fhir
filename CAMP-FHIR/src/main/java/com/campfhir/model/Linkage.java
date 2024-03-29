// // default package
package main.java.com.campfhir.model;
// Generated Aug 17, 2022, 11:08:48 AM by Hibernate Tools 5.6.1.Final



/**
 * Linkage generated by hbm2java
 */
public class Linkage extends Resource{


	private static final long serialVersionUID = 1L;


     private String id;
     private String linkageActive;
     private String linkageAthr;
     private String linkageItmRsrc;
     private String linkageItmTyp;

    public Linkage() {
    }

   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public void addId(String id) {
    	if( id != null ) {
	    	if( this.id == null ) {
	        	this.id = id;
	        } else if(this.id.substring(this.id.length() - 1).equals("]") & id.equals("[")) {
	        	this.id = this.id+ "," + id;
	        } else if(id.equals("[") | id.equals("]") | this.id.substring(this.id.length() - 1).equals("[")) {
	        	this.id = this.id+id;
	        } else  {
	            this.id = this.id+ "," +id;
	        }
        }
    }
    
    
    
    public String getLinkageActive() {
        return this.linkageActive;
    }
    
    public void setLinkageActive(String linkageActive) {
        this.linkageActive = linkageActive;
    }
    
    public void addLinkageActive(String linkageActive) {
    	if( linkageActive != null ) {
	    	if( this.linkageActive == null ) {
	        	this.linkageActive = linkageActive;
	        } else if(this.linkageActive.substring(this.linkageActive.length() - 1).equals("]") & linkageActive.equals("[")) {
	        	this.linkageActive = this.linkageActive+ "," + linkageActive;
	        } else if(linkageActive.equals("[") | linkageActive.equals("]") | this.linkageActive.substring(this.linkageActive.length() - 1).equals("[")) {
	        	this.linkageActive = this.linkageActive+linkageActive;
	        } else  {
	            this.linkageActive = this.linkageActive+ "," +linkageActive;
	        }
        }
    }
    
    
    
    public String getLinkageAthr() {
        return this.linkageAthr;
    }
    
    public void setLinkageAthr(String linkageAthr) {
        this.linkageAthr = linkageAthr;
    }
    
    public void addLinkageAthr(String linkageAthr) {
    	if( linkageAthr != null ) {
	    	if( this.linkageAthr == null ) {
	        	this.linkageAthr = linkageAthr;
	        } else if(this.linkageAthr.substring(this.linkageAthr.length() - 1).equals("]") & linkageAthr.equals("[")) {
	        	this.linkageAthr = this.linkageAthr+ "," + linkageAthr;
	        } else if(linkageAthr.equals("[") | linkageAthr.equals("]") | this.linkageAthr.substring(this.linkageAthr.length() - 1).equals("[")) {
	        	this.linkageAthr = this.linkageAthr+linkageAthr;
	        } else  {
	            this.linkageAthr = this.linkageAthr+ "," +linkageAthr;
	        }
        }
    }
    
    
    
    public String getLinkageItmRsrc() {
        return this.linkageItmRsrc;
    }
    
    public void setLinkageItmRsrc(String linkageItmRsrc) {
        this.linkageItmRsrc = linkageItmRsrc;
    }
    
    public void addLinkageItmRsrc(String linkageItmRsrc) {
    	if( linkageItmRsrc != null ) {
	    	if( this.linkageItmRsrc == null ) {
	        	this.linkageItmRsrc = linkageItmRsrc;
	        } else if(this.linkageItmRsrc.substring(this.linkageItmRsrc.length() - 1).equals("]") & linkageItmRsrc.equals("[")) {
	        	this.linkageItmRsrc = this.linkageItmRsrc+ "," + linkageItmRsrc;
	        } else if(linkageItmRsrc.equals("[") | linkageItmRsrc.equals("]") | this.linkageItmRsrc.substring(this.linkageItmRsrc.length() - 1).equals("[")) {
	        	this.linkageItmRsrc = this.linkageItmRsrc+linkageItmRsrc;
	        } else  {
	            this.linkageItmRsrc = this.linkageItmRsrc+ "," +linkageItmRsrc;
	        }
        }
    }
    
    
    
    public String getLinkageItmTyp() {
        return this.linkageItmTyp;
    }
    
    public void setLinkageItmTyp(String linkageItmTyp) {
        this.linkageItmTyp = linkageItmTyp;
    }
    
    public void addLinkageItmTyp(String linkageItmTyp) {
    	if( linkageItmTyp != null ) {
	    	if( this.linkageItmTyp == null ) {
	        	this.linkageItmTyp = linkageItmTyp;
	        } else if(this.linkageItmTyp.substring(this.linkageItmTyp.length() - 1).equals("]") & linkageItmTyp.equals("[")) {
	        	this.linkageItmTyp = this.linkageItmTyp+ "," + linkageItmTyp;
	        } else if(linkageItmTyp.equals("[") | linkageItmTyp.equals("]") | this.linkageItmTyp.substring(this.linkageItmTyp.length() - 1).equals("[")) {
	        	this.linkageItmTyp = this.linkageItmTyp+linkageItmTyp;
	        } else  {
	            this.linkageItmTyp = this.linkageItmTyp+ "," +linkageItmTyp;
	        }
        }
    }
    
    
    




}


