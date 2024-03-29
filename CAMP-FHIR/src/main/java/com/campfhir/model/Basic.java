// // default package
package main.java.com.campfhir.model;
// Generated Aug 17, 2022, 11:08:48 AM by Hibernate Tools 5.6.1.Final



/**
 * Basic generated by hbm2java
 */
public class Basic extends Resource{


	private static final long serialVersionUID = 1L;


     private String id;
     private String basicAthr;
     private String basicCdCdgCd;
     private String basicCdCdgDsply;
     private String basicCdCdgSys;
     private String basicCdCdgUsrSltd;
     private String basicCdCdgVrsn;
     private String basicCdTxt;
     private String basicCreated;
     private String basicIdAssigner;
     private String basicIdPrdEnd;
     private String basicIdPrdStrt;
     private String basicIdSys;
     private String basicIdTypCdgCd;
     private String basicIdTypCdgDsply;
     private String basicIdTypCdgSys;
     private String basicIdTypCdgUsrSltd;
     private String basicIdTypCdgVrsn;
     private String basicIdTypTxt;
     private String basicIdUse;
     private String basicIdVl;
     private String basicSbjct;

    public Basic() {
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
    
    
    
    public String getBasicAthr() {
        return this.basicAthr;
    }
    
    public void setBasicAthr(String basicAthr) {
        this.basicAthr = basicAthr;
    }
    
    public void addBasicAthr(String basicAthr) {
    	if( basicAthr != null ) {
	    	if( this.basicAthr == null ) {
	        	this.basicAthr = basicAthr;
	        } else if(this.basicAthr.substring(this.basicAthr.length() - 1).equals("]") & basicAthr.equals("[")) {
	        	this.basicAthr = this.basicAthr+ "," + basicAthr;
	        } else if(basicAthr.equals("[") | basicAthr.equals("]") | this.basicAthr.substring(this.basicAthr.length() - 1).equals("[")) {
	        	this.basicAthr = this.basicAthr+basicAthr;
	        } else  {
	            this.basicAthr = this.basicAthr+ "," +basicAthr;
	        }
        }
    }
    
    
    
    public String getBasicCdCdgCd() {
        return this.basicCdCdgCd;
    }
    
    public void setBasicCdCdgCd(String basicCdCdgCd) {
        this.basicCdCdgCd = basicCdCdgCd;
    }
    
    public void addBasicCdCdgCd(String basicCdCdgCd) {
    	if( basicCdCdgCd != null ) {
	    	if( this.basicCdCdgCd == null ) {
	        	this.basicCdCdgCd = basicCdCdgCd;
	        } else if(this.basicCdCdgCd.substring(this.basicCdCdgCd.length() - 1).equals("]") & basicCdCdgCd.equals("[")) {
	        	this.basicCdCdgCd = this.basicCdCdgCd+ "," + basicCdCdgCd;
	        } else if(basicCdCdgCd.equals("[") | basicCdCdgCd.equals("]") | this.basicCdCdgCd.substring(this.basicCdCdgCd.length() - 1).equals("[")) {
	        	this.basicCdCdgCd = this.basicCdCdgCd+basicCdCdgCd;
	        } else  {
	            this.basicCdCdgCd = this.basicCdCdgCd+ "," +basicCdCdgCd;
	        }
        }
    }
    
    
    
    public String getBasicCdCdgDsply() {
        return this.basicCdCdgDsply;
    }
    
    public void setBasicCdCdgDsply(String basicCdCdgDsply) {
        this.basicCdCdgDsply = basicCdCdgDsply;
    }
    
    public void addBasicCdCdgDsply(String basicCdCdgDsply) {
    	if( basicCdCdgDsply != null ) {
	    	if( this.basicCdCdgDsply == null ) {
	        	this.basicCdCdgDsply = basicCdCdgDsply;
	        } else if(this.basicCdCdgDsply.substring(this.basicCdCdgDsply.length() - 1).equals("]") & basicCdCdgDsply.equals("[")) {
	        	this.basicCdCdgDsply = this.basicCdCdgDsply+ "," + basicCdCdgDsply;
	        } else if(basicCdCdgDsply.equals("[") | basicCdCdgDsply.equals("]") | this.basicCdCdgDsply.substring(this.basicCdCdgDsply.length() - 1).equals("[")) {
	        	this.basicCdCdgDsply = this.basicCdCdgDsply+basicCdCdgDsply;
	        } else  {
	            this.basicCdCdgDsply = this.basicCdCdgDsply+ "," +basicCdCdgDsply;
	        }
        }
    }
    
    
    
    public String getBasicCdCdgSys() {
        return this.basicCdCdgSys;
    }
    
    public void setBasicCdCdgSys(String basicCdCdgSys) {
        this.basicCdCdgSys = basicCdCdgSys;
    }
    
    public void addBasicCdCdgSys(String basicCdCdgSys) {
    	if( basicCdCdgSys != null ) {
	    	if( this.basicCdCdgSys == null ) {
	        	this.basicCdCdgSys = basicCdCdgSys;
	        } else if(this.basicCdCdgSys.substring(this.basicCdCdgSys.length() - 1).equals("]") & basicCdCdgSys.equals("[")) {
	        	this.basicCdCdgSys = this.basicCdCdgSys+ "," + basicCdCdgSys;
	        } else if(basicCdCdgSys.equals("[") | basicCdCdgSys.equals("]") | this.basicCdCdgSys.substring(this.basicCdCdgSys.length() - 1).equals("[")) {
	        	this.basicCdCdgSys = this.basicCdCdgSys+basicCdCdgSys;
	        } else  {
	            this.basicCdCdgSys = this.basicCdCdgSys+ "," +basicCdCdgSys;
	        }
        }
    }
    
    
    
    public String getBasicCdCdgUsrSltd() {
        return this.basicCdCdgUsrSltd;
    }
    
    public void setBasicCdCdgUsrSltd(String basicCdCdgUsrSltd) {
        this.basicCdCdgUsrSltd = basicCdCdgUsrSltd;
    }
    
    public void addBasicCdCdgUsrSltd(String basicCdCdgUsrSltd) {
    	if( basicCdCdgUsrSltd != null ) {
	    	if( this.basicCdCdgUsrSltd == null ) {
	        	this.basicCdCdgUsrSltd = basicCdCdgUsrSltd;
	        } else if(this.basicCdCdgUsrSltd.substring(this.basicCdCdgUsrSltd.length() - 1).equals("]") & basicCdCdgUsrSltd.equals("[")) {
	        	this.basicCdCdgUsrSltd = this.basicCdCdgUsrSltd+ "," + basicCdCdgUsrSltd;
	        } else if(basicCdCdgUsrSltd.equals("[") | basicCdCdgUsrSltd.equals("]") | this.basicCdCdgUsrSltd.substring(this.basicCdCdgUsrSltd.length() - 1).equals("[")) {
	        	this.basicCdCdgUsrSltd = this.basicCdCdgUsrSltd+basicCdCdgUsrSltd;
	        } else  {
	            this.basicCdCdgUsrSltd = this.basicCdCdgUsrSltd+ "," +basicCdCdgUsrSltd;
	        }
        }
    }
    
    
    
    public String getBasicCdCdgVrsn() {
        return this.basicCdCdgVrsn;
    }
    
    public void setBasicCdCdgVrsn(String basicCdCdgVrsn) {
        this.basicCdCdgVrsn = basicCdCdgVrsn;
    }
    
    public void addBasicCdCdgVrsn(String basicCdCdgVrsn) {
    	if( basicCdCdgVrsn != null ) {
	    	if( this.basicCdCdgVrsn == null ) {
	        	this.basicCdCdgVrsn = basicCdCdgVrsn;
	        } else if(this.basicCdCdgVrsn.substring(this.basicCdCdgVrsn.length() - 1).equals("]") & basicCdCdgVrsn.equals("[")) {
	        	this.basicCdCdgVrsn = this.basicCdCdgVrsn+ "," + basicCdCdgVrsn;
	        } else if(basicCdCdgVrsn.equals("[") | basicCdCdgVrsn.equals("]") | this.basicCdCdgVrsn.substring(this.basicCdCdgVrsn.length() - 1).equals("[")) {
	        	this.basicCdCdgVrsn = this.basicCdCdgVrsn+basicCdCdgVrsn;
	        } else  {
	            this.basicCdCdgVrsn = this.basicCdCdgVrsn+ "," +basicCdCdgVrsn;
	        }
        }
    }
    
    
    
    public String getBasicCdTxt() {
        return this.basicCdTxt;
    }
    
    public void setBasicCdTxt(String basicCdTxt) {
        this.basicCdTxt = basicCdTxt;
    }
    
    public void addBasicCdTxt(String basicCdTxt) {
    	if( basicCdTxt != null ) {
	    	if( this.basicCdTxt == null ) {
	        	this.basicCdTxt = basicCdTxt;
	        } else if(this.basicCdTxt.substring(this.basicCdTxt.length() - 1).equals("]") & basicCdTxt.equals("[")) {
	        	this.basicCdTxt = this.basicCdTxt+ "," + basicCdTxt;
	        } else if(basicCdTxt.equals("[") | basicCdTxt.equals("]") | this.basicCdTxt.substring(this.basicCdTxt.length() - 1).equals("[")) {
	        	this.basicCdTxt = this.basicCdTxt+basicCdTxt;
	        } else  {
	            this.basicCdTxt = this.basicCdTxt+ "," +basicCdTxt;
	        }
        }
    }
    
    
    
    public String getBasicCreated() {
        return this.basicCreated;
    }
    
    public void setBasicCreated(String basicCreated) {
        this.basicCreated = basicCreated;
    }
    
    public void addBasicCreated(String basicCreated) {
    	if( basicCreated != null ) {
	    	if( this.basicCreated == null ) {
	        	this.basicCreated = basicCreated;
	        } else if(this.basicCreated.substring(this.basicCreated.length() - 1).equals("]") & basicCreated.equals("[")) {
	        	this.basicCreated = this.basicCreated+ "," + basicCreated;
	        } else if(basicCreated.equals("[") | basicCreated.equals("]") | this.basicCreated.substring(this.basicCreated.length() - 1).equals("[")) {
	        	this.basicCreated = this.basicCreated+basicCreated;
	        } else  {
	            this.basicCreated = this.basicCreated+ "," +basicCreated;
	        }
        }
    }
    
    
    
    public String getBasicIdAssigner() {
        return this.basicIdAssigner;
    }
    
    public void setBasicIdAssigner(String basicIdAssigner) {
        this.basicIdAssigner = basicIdAssigner;
    }
    
    public void addBasicIdAssigner(String basicIdAssigner) {
    	if( basicIdAssigner != null ) {
	    	if( this.basicIdAssigner == null ) {
	        	this.basicIdAssigner = basicIdAssigner;
	        } else if(this.basicIdAssigner.substring(this.basicIdAssigner.length() - 1).equals("]") & basicIdAssigner.equals("[")) {
	        	this.basicIdAssigner = this.basicIdAssigner+ "," + basicIdAssigner;
	        } else if(basicIdAssigner.equals("[") | basicIdAssigner.equals("]") | this.basicIdAssigner.substring(this.basicIdAssigner.length() - 1).equals("[")) {
	        	this.basicIdAssigner = this.basicIdAssigner+basicIdAssigner;
	        } else  {
	            this.basicIdAssigner = this.basicIdAssigner+ "," +basicIdAssigner;
	        }
        }
    }
    
    
    
    public String getBasicIdPrdEnd() {
        return this.basicIdPrdEnd;
    }
    
    public void setBasicIdPrdEnd(String basicIdPrdEnd) {
        this.basicIdPrdEnd = basicIdPrdEnd;
    }
    
    public void addBasicIdPrdEnd(String basicIdPrdEnd) {
    	if( basicIdPrdEnd != null ) {
	    	if( this.basicIdPrdEnd == null ) {
	        	this.basicIdPrdEnd = basicIdPrdEnd;
	        } else if(this.basicIdPrdEnd.substring(this.basicIdPrdEnd.length() - 1).equals("]") & basicIdPrdEnd.equals("[")) {
	        	this.basicIdPrdEnd = this.basicIdPrdEnd+ "," + basicIdPrdEnd;
	        } else if(basicIdPrdEnd.equals("[") | basicIdPrdEnd.equals("]") | this.basicIdPrdEnd.substring(this.basicIdPrdEnd.length() - 1).equals("[")) {
	        	this.basicIdPrdEnd = this.basicIdPrdEnd+basicIdPrdEnd;
	        } else  {
	            this.basicIdPrdEnd = this.basicIdPrdEnd+ "," +basicIdPrdEnd;
	        }
        }
    }
    
    
    
    public String getBasicIdPrdStrt() {
        return this.basicIdPrdStrt;
    }
    
    public void setBasicIdPrdStrt(String basicIdPrdStrt) {
        this.basicIdPrdStrt = basicIdPrdStrt;
    }
    
    public void addBasicIdPrdStrt(String basicIdPrdStrt) {
    	if( basicIdPrdStrt != null ) {
	    	if( this.basicIdPrdStrt == null ) {
	        	this.basicIdPrdStrt = basicIdPrdStrt;
	        } else if(this.basicIdPrdStrt.substring(this.basicIdPrdStrt.length() - 1).equals("]") & basicIdPrdStrt.equals("[")) {
	        	this.basicIdPrdStrt = this.basicIdPrdStrt+ "," + basicIdPrdStrt;
	        } else if(basicIdPrdStrt.equals("[") | basicIdPrdStrt.equals("]") | this.basicIdPrdStrt.substring(this.basicIdPrdStrt.length() - 1).equals("[")) {
	        	this.basicIdPrdStrt = this.basicIdPrdStrt+basicIdPrdStrt;
	        } else  {
	            this.basicIdPrdStrt = this.basicIdPrdStrt+ "," +basicIdPrdStrt;
	        }
        }
    }
    
    
    
    public String getBasicIdSys() {
        return this.basicIdSys;
    }
    
    public void setBasicIdSys(String basicIdSys) {
        this.basicIdSys = basicIdSys;
    }
    
    public void addBasicIdSys(String basicIdSys) {
    	if( basicIdSys != null ) {
	    	if( this.basicIdSys == null ) {
	        	this.basicIdSys = basicIdSys;
	        } else if(this.basicIdSys.substring(this.basicIdSys.length() - 1).equals("]") & basicIdSys.equals("[")) {
	        	this.basicIdSys = this.basicIdSys+ "," + basicIdSys;
	        } else if(basicIdSys.equals("[") | basicIdSys.equals("]") | this.basicIdSys.substring(this.basicIdSys.length() - 1).equals("[")) {
	        	this.basicIdSys = this.basicIdSys+basicIdSys;
	        } else  {
	            this.basicIdSys = this.basicIdSys+ "," +basicIdSys;
	        }
        }
    }
    
    
    
    public String getBasicIdTypCdgCd() {
        return this.basicIdTypCdgCd;
    }
    
    public void setBasicIdTypCdgCd(String basicIdTypCdgCd) {
        this.basicIdTypCdgCd = basicIdTypCdgCd;
    }
    
    public void addBasicIdTypCdgCd(String basicIdTypCdgCd) {
    	if( basicIdTypCdgCd != null ) {
	    	if( this.basicIdTypCdgCd == null ) {
	        	this.basicIdTypCdgCd = basicIdTypCdgCd;
	        } else if(this.basicIdTypCdgCd.substring(this.basicIdTypCdgCd.length() - 1).equals("]") & basicIdTypCdgCd.equals("[")) {
	        	this.basicIdTypCdgCd = this.basicIdTypCdgCd+ "," + basicIdTypCdgCd;
	        } else if(basicIdTypCdgCd.equals("[") | basicIdTypCdgCd.equals("]") | this.basicIdTypCdgCd.substring(this.basicIdTypCdgCd.length() - 1).equals("[")) {
	        	this.basicIdTypCdgCd = this.basicIdTypCdgCd+basicIdTypCdgCd;
	        } else  {
	            this.basicIdTypCdgCd = this.basicIdTypCdgCd+ "," +basicIdTypCdgCd;
	        }
        }
    }
    
    
    
    public String getBasicIdTypCdgDsply() {
        return this.basicIdTypCdgDsply;
    }
    
    public void setBasicIdTypCdgDsply(String basicIdTypCdgDsply) {
        this.basicIdTypCdgDsply = basicIdTypCdgDsply;
    }
    
    public void addBasicIdTypCdgDsply(String basicIdTypCdgDsply) {
    	if( basicIdTypCdgDsply != null ) {
	    	if( this.basicIdTypCdgDsply == null ) {
	        	this.basicIdTypCdgDsply = basicIdTypCdgDsply;
	        } else if(this.basicIdTypCdgDsply.substring(this.basicIdTypCdgDsply.length() - 1).equals("]") & basicIdTypCdgDsply.equals("[")) {
	        	this.basicIdTypCdgDsply = this.basicIdTypCdgDsply+ "," + basicIdTypCdgDsply;
	        } else if(basicIdTypCdgDsply.equals("[") | basicIdTypCdgDsply.equals("]") | this.basicIdTypCdgDsply.substring(this.basicIdTypCdgDsply.length() - 1).equals("[")) {
	        	this.basicIdTypCdgDsply = this.basicIdTypCdgDsply+basicIdTypCdgDsply;
	        } else  {
	            this.basicIdTypCdgDsply = this.basicIdTypCdgDsply+ "," +basicIdTypCdgDsply;
	        }
        }
    }
    
    
    
    public String getBasicIdTypCdgSys() {
        return this.basicIdTypCdgSys;
    }
    
    public void setBasicIdTypCdgSys(String basicIdTypCdgSys) {
        this.basicIdTypCdgSys = basicIdTypCdgSys;
    }
    
    public void addBasicIdTypCdgSys(String basicIdTypCdgSys) {
    	if( basicIdTypCdgSys != null ) {
	    	if( this.basicIdTypCdgSys == null ) {
	        	this.basicIdTypCdgSys = basicIdTypCdgSys;
	        } else if(this.basicIdTypCdgSys.substring(this.basicIdTypCdgSys.length() - 1).equals("]") & basicIdTypCdgSys.equals("[")) {
	        	this.basicIdTypCdgSys = this.basicIdTypCdgSys+ "," + basicIdTypCdgSys;
	        } else if(basicIdTypCdgSys.equals("[") | basicIdTypCdgSys.equals("]") | this.basicIdTypCdgSys.substring(this.basicIdTypCdgSys.length() - 1).equals("[")) {
	        	this.basicIdTypCdgSys = this.basicIdTypCdgSys+basicIdTypCdgSys;
	        } else  {
	            this.basicIdTypCdgSys = this.basicIdTypCdgSys+ "," +basicIdTypCdgSys;
	        }
        }
    }
    
    
    
    public String getBasicIdTypCdgUsrSltd() {
        return this.basicIdTypCdgUsrSltd;
    }
    
    public void setBasicIdTypCdgUsrSltd(String basicIdTypCdgUsrSltd) {
        this.basicIdTypCdgUsrSltd = basicIdTypCdgUsrSltd;
    }
    
    public void addBasicIdTypCdgUsrSltd(String basicIdTypCdgUsrSltd) {
    	if( basicIdTypCdgUsrSltd != null ) {
	    	if( this.basicIdTypCdgUsrSltd == null ) {
	        	this.basicIdTypCdgUsrSltd = basicIdTypCdgUsrSltd;
	        } else if(this.basicIdTypCdgUsrSltd.substring(this.basicIdTypCdgUsrSltd.length() - 1).equals("]") & basicIdTypCdgUsrSltd.equals("[")) {
	        	this.basicIdTypCdgUsrSltd = this.basicIdTypCdgUsrSltd+ "," + basicIdTypCdgUsrSltd;
	        } else if(basicIdTypCdgUsrSltd.equals("[") | basicIdTypCdgUsrSltd.equals("]") | this.basicIdTypCdgUsrSltd.substring(this.basicIdTypCdgUsrSltd.length() - 1).equals("[")) {
	        	this.basicIdTypCdgUsrSltd = this.basicIdTypCdgUsrSltd+basicIdTypCdgUsrSltd;
	        } else  {
	            this.basicIdTypCdgUsrSltd = this.basicIdTypCdgUsrSltd+ "," +basicIdTypCdgUsrSltd;
	        }
        }
    }
    
    
    
    public String getBasicIdTypCdgVrsn() {
        return this.basicIdTypCdgVrsn;
    }
    
    public void setBasicIdTypCdgVrsn(String basicIdTypCdgVrsn) {
        this.basicIdTypCdgVrsn = basicIdTypCdgVrsn;
    }
    
    public void addBasicIdTypCdgVrsn(String basicIdTypCdgVrsn) {
    	if( basicIdTypCdgVrsn != null ) {
	    	if( this.basicIdTypCdgVrsn == null ) {
	        	this.basicIdTypCdgVrsn = basicIdTypCdgVrsn;
	        } else if(this.basicIdTypCdgVrsn.substring(this.basicIdTypCdgVrsn.length() - 1).equals("]") & basicIdTypCdgVrsn.equals("[")) {
	        	this.basicIdTypCdgVrsn = this.basicIdTypCdgVrsn+ "," + basicIdTypCdgVrsn;
	        } else if(basicIdTypCdgVrsn.equals("[") | basicIdTypCdgVrsn.equals("]") | this.basicIdTypCdgVrsn.substring(this.basicIdTypCdgVrsn.length() - 1).equals("[")) {
	        	this.basicIdTypCdgVrsn = this.basicIdTypCdgVrsn+basicIdTypCdgVrsn;
	        } else  {
	            this.basicIdTypCdgVrsn = this.basicIdTypCdgVrsn+ "," +basicIdTypCdgVrsn;
	        }
        }
    }
    
    
    
    public String getBasicIdTypTxt() {
        return this.basicIdTypTxt;
    }
    
    public void setBasicIdTypTxt(String basicIdTypTxt) {
        this.basicIdTypTxt = basicIdTypTxt;
    }
    
    public void addBasicIdTypTxt(String basicIdTypTxt) {
    	if( basicIdTypTxt != null ) {
	    	if( this.basicIdTypTxt == null ) {
	        	this.basicIdTypTxt = basicIdTypTxt;
	        } else if(this.basicIdTypTxt.substring(this.basicIdTypTxt.length() - 1).equals("]") & basicIdTypTxt.equals("[")) {
	        	this.basicIdTypTxt = this.basicIdTypTxt+ "," + basicIdTypTxt;
	        } else if(basicIdTypTxt.equals("[") | basicIdTypTxt.equals("]") | this.basicIdTypTxt.substring(this.basicIdTypTxt.length() - 1).equals("[")) {
	        	this.basicIdTypTxt = this.basicIdTypTxt+basicIdTypTxt;
	        } else  {
	            this.basicIdTypTxt = this.basicIdTypTxt+ "," +basicIdTypTxt;
	        }
        }
    }
    
    
    
    public String getBasicIdUse() {
        return this.basicIdUse;
    }
    
    public void setBasicIdUse(String basicIdUse) {
        this.basicIdUse = basicIdUse;
    }
    
    public void addBasicIdUse(String basicIdUse) {
    	if( basicIdUse != null ) {
	    	if( this.basicIdUse == null ) {
	        	this.basicIdUse = basicIdUse;
	        } else if(this.basicIdUse.substring(this.basicIdUse.length() - 1).equals("]") & basicIdUse.equals("[")) {
	        	this.basicIdUse = this.basicIdUse+ "," + basicIdUse;
	        } else if(basicIdUse.equals("[") | basicIdUse.equals("]") | this.basicIdUse.substring(this.basicIdUse.length() - 1).equals("[")) {
	        	this.basicIdUse = this.basicIdUse+basicIdUse;
	        } else  {
	            this.basicIdUse = this.basicIdUse+ "," +basicIdUse;
	        }
        }
    }
    
    
    
    public String getBasicIdVl() {
        return this.basicIdVl;
    }
    
    public void setBasicIdVl(String basicIdVl) {
        this.basicIdVl = basicIdVl;
    }
    
    public void addBasicIdVl(String basicIdVl) {
    	if( basicIdVl != null ) {
	    	if( this.basicIdVl == null ) {
	        	this.basicIdVl = basicIdVl;
	        } else if(this.basicIdVl.substring(this.basicIdVl.length() - 1).equals("]") & basicIdVl.equals("[")) {
	        	this.basicIdVl = this.basicIdVl+ "," + basicIdVl;
	        } else if(basicIdVl.equals("[") | basicIdVl.equals("]") | this.basicIdVl.substring(this.basicIdVl.length() - 1).equals("[")) {
	        	this.basicIdVl = this.basicIdVl+basicIdVl;
	        } else  {
	            this.basicIdVl = this.basicIdVl+ "," +basicIdVl;
	        }
        }
    }
    
    
    
    public String getBasicSbjct() {
        return this.basicSbjct;
    }
    
    public void setBasicSbjct(String basicSbjct) {
        this.basicSbjct = basicSbjct;
    }
    
    public void addBasicSbjct(String basicSbjct) {
    	if( basicSbjct != null ) {
	    	if( this.basicSbjct == null ) {
	        	this.basicSbjct = basicSbjct;
	        } else if(this.basicSbjct.substring(this.basicSbjct.length() - 1).equals("]") & basicSbjct.equals("[")) {
	        	this.basicSbjct = this.basicSbjct+ "," + basicSbjct;
	        } else if(basicSbjct.equals("[") | basicSbjct.equals("]") | this.basicSbjct.substring(this.basicSbjct.length() - 1).equals("[")) {
	        	this.basicSbjct = this.basicSbjct+basicSbjct;
	        } else  {
	            this.basicSbjct = this.basicSbjct+ "," +basicSbjct;
	        }
        }
    }
    
    
    




}


