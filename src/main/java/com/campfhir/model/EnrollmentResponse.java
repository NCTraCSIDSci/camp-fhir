// // default package
package main.java.com.campfhir.model;
// Generated Aug 17, 2022, 11:08:48 AM by Hibernate Tools 5.6.1.Final



/**
 * EnrollmentResponse generated by hbm2java
 */
public class EnrollmentResponse  implements java.io.Serializable {


     private String id;
     private String enrollmentRspsCreated;
     private String enrollmentRspsDisposition;
     private String enrollmentRspsIdAssigner;
     private String enrollmentRspsIdPrdEnd;
     private String enrollmentRspsIdPrdStrt;
     private String enrollmentRspsIdSys;
     private String enrollmentRspsIdTypCdgCd;
     private String enrollmentRspsIdTypCdgDsply;
     private String enrollmentRspsIdTypCdgSys;
     private String enrollmentRspsIdTypCdgUsrSltd;
     private String enrollmentRspsIdTypCdgVrsn;
     private String enrollmentRspsIdTypTxt;
     private String enrollmentRspsIdUse;
     private String enrollmentRspsIdVl;
     private String enrollmentRspsOrgnztn;
     private String enrollmentRspsOutcome;
     private String enrollmentRspsRqst;
     private String enrollmentRspsRqstProvider;
     private String enrollmentRspsSts;

    public EnrollmentResponse() {
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
    
    
    
    public String getEnrollmentRspsCreated() {
        return this.enrollmentRspsCreated;
    }
    
    public void setEnrollmentRspsCreated(String enrollmentRspsCreated) {
        this.enrollmentRspsCreated = enrollmentRspsCreated;
    }
    
    public void addEnrollmentRspsCreated(String enrollmentRspsCreated) {
    	if( enrollmentRspsCreated != null ) {
	    	if( this.enrollmentRspsCreated == null ) {
	        	this.enrollmentRspsCreated = enrollmentRspsCreated;
	        } else if(this.enrollmentRspsCreated.substring(this.enrollmentRspsCreated.length() - 1).equals("]") & enrollmentRspsCreated.equals("[")) {
	        	this.enrollmentRspsCreated = this.enrollmentRspsCreated+ "," + enrollmentRspsCreated;
	        } else if(enrollmentRspsCreated.equals("[") | enrollmentRspsCreated.equals("]") | this.enrollmentRspsCreated.substring(this.enrollmentRspsCreated.length() - 1).equals("[")) {
	        	this.enrollmentRspsCreated = this.enrollmentRspsCreated+enrollmentRspsCreated;
	        } else  {
	            this.enrollmentRspsCreated = this.enrollmentRspsCreated+ "," +enrollmentRspsCreated;
	        }
        }
    }
    
    
    
    public String getEnrollmentRspsDisposition() {
        return this.enrollmentRspsDisposition;
    }
    
    public void setEnrollmentRspsDisposition(String enrollmentRspsDisposition) {
        this.enrollmentRspsDisposition = enrollmentRspsDisposition;
    }
    
    public void addEnrollmentRspsDisposition(String enrollmentRspsDisposition) {
    	if( enrollmentRspsDisposition != null ) {
	    	if( this.enrollmentRspsDisposition == null ) {
	        	this.enrollmentRspsDisposition = enrollmentRspsDisposition;
	        } else if(this.enrollmentRspsDisposition.substring(this.enrollmentRspsDisposition.length() - 1).equals("]") & enrollmentRspsDisposition.equals("[")) {
	        	this.enrollmentRspsDisposition = this.enrollmentRspsDisposition+ "," + enrollmentRspsDisposition;
	        } else if(enrollmentRspsDisposition.equals("[") | enrollmentRspsDisposition.equals("]") | this.enrollmentRspsDisposition.substring(this.enrollmentRspsDisposition.length() - 1).equals("[")) {
	        	this.enrollmentRspsDisposition = this.enrollmentRspsDisposition+enrollmentRspsDisposition;
	        } else  {
	            this.enrollmentRspsDisposition = this.enrollmentRspsDisposition+ "," +enrollmentRspsDisposition;
	        }
        }
    }
    
    
    
    public String getEnrollmentRspsIdAssigner() {
        return this.enrollmentRspsIdAssigner;
    }
    
    public void setEnrollmentRspsIdAssigner(String enrollmentRspsIdAssigner) {
        this.enrollmentRspsIdAssigner = enrollmentRspsIdAssigner;
    }
    
    public void addEnrollmentRspsIdAssigner(String enrollmentRspsIdAssigner) {
    	if( enrollmentRspsIdAssigner != null ) {
	    	if( this.enrollmentRspsIdAssigner == null ) {
	        	this.enrollmentRspsIdAssigner = enrollmentRspsIdAssigner;
	        } else if(this.enrollmentRspsIdAssigner.substring(this.enrollmentRspsIdAssigner.length() - 1).equals("]") & enrollmentRspsIdAssigner.equals("[")) {
	        	this.enrollmentRspsIdAssigner = this.enrollmentRspsIdAssigner+ "," + enrollmentRspsIdAssigner;
	        } else if(enrollmentRspsIdAssigner.equals("[") | enrollmentRspsIdAssigner.equals("]") | this.enrollmentRspsIdAssigner.substring(this.enrollmentRspsIdAssigner.length() - 1).equals("[")) {
	        	this.enrollmentRspsIdAssigner = this.enrollmentRspsIdAssigner+enrollmentRspsIdAssigner;
	        } else  {
	            this.enrollmentRspsIdAssigner = this.enrollmentRspsIdAssigner+ "," +enrollmentRspsIdAssigner;
	        }
        }
    }
    
    
    
    public String getEnrollmentRspsIdPrdEnd() {
        return this.enrollmentRspsIdPrdEnd;
    }
    
    public void setEnrollmentRspsIdPrdEnd(String enrollmentRspsIdPrdEnd) {
        this.enrollmentRspsIdPrdEnd = enrollmentRspsIdPrdEnd;
    }
    
    public void addEnrollmentRspsIdPrdEnd(String enrollmentRspsIdPrdEnd) {
    	if( enrollmentRspsIdPrdEnd != null ) {
	    	if( this.enrollmentRspsIdPrdEnd == null ) {
	        	this.enrollmentRspsIdPrdEnd = enrollmentRspsIdPrdEnd;
	        } else if(this.enrollmentRspsIdPrdEnd.substring(this.enrollmentRspsIdPrdEnd.length() - 1).equals("]") & enrollmentRspsIdPrdEnd.equals("[")) {
	        	this.enrollmentRspsIdPrdEnd = this.enrollmentRspsIdPrdEnd+ "," + enrollmentRspsIdPrdEnd;
	        } else if(enrollmentRspsIdPrdEnd.equals("[") | enrollmentRspsIdPrdEnd.equals("]") | this.enrollmentRspsIdPrdEnd.substring(this.enrollmentRspsIdPrdEnd.length() - 1).equals("[")) {
	        	this.enrollmentRspsIdPrdEnd = this.enrollmentRspsIdPrdEnd+enrollmentRspsIdPrdEnd;
	        } else  {
	            this.enrollmentRspsIdPrdEnd = this.enrollmentRspsIdPrdEnd+ "," +enrollmentRspsIdPrdEnd;
	        }
        }
    }
    
    
    
    public String getEnrollmentRspsIdPrdStrt() {
        return this.enrollmentRspsIdPrdStrt;
    }
    
    public void setEnrollmentRspsIdPrdStrt(String enrollmentRspsIdPrdStrt) {
        this.enrollmentRspsIdPrdStrt = enrollmentRspsIdPrdStrt;
    }
    
    public void addEnrollmentRspsIdPrdStrt(String enrollmentRspsIdPrdStrt) {
    	if( enrollmentRspsIdPrdStrt != null ) {
	    	if( this.enrollmentRspsIdPrdStrt == null ) {
	        	this.enrollmentRspsIdPrdStrt = enrollmentRspsIdPrdStrt;
	        } else if(this.enrollmentRspsIdPrdStrt.substring(this.enrollmentRspsIdPrdStrt.length() - 1).equals("]") & enrollmentRspsIdPrdStrt.equals("[")) {
	        	this.enrollmentRspsIdPrdStrt = this.enrollmentRspsIdPrdStrt+ "," + enrollmentRspsIdPrdStrt;
	        } else if(enrollmentRspsIdPrdStrt.equals("[") | enrollmentRspsIdPrdStrt.equals("]") | this.enrollmentRspsIdPrdStrt.substring(this.enrollmentRspsIdPrdStrt.length() - 1).equals("[")) {
	        	this.enrollmentRspsIdPrdStrt = this.enrollmentRspsIdPrdStrt+enrollmentRspsIdPrdStrt;
	        } else  {
	            this.enrollmentRspsIdPrdStrt = this.enrollmentRspsIdPrdStrt+ "," +enrollmentRspsIdPrdStrt;
	        }
        }
    }
    
    
    
    public String getEnrollmentRspsIdSys() {
        return this.enrollmentRspsIdSys;
    }
    
    public void setEnrollmentRspsIdSys(String enrollmentRspsIdSys) {
        this.enrollmentRspsIdSys = enrollmentRspsIdSys;
    }
    
    public void addEnrollmentRspsIdSys(String enrollmentRspsIdSys) {
    	if( enrollmentRspsIdSys != null ) {
	    	if( this.enrollmentRspsIdSys == null ) {
	        	this.enrollmentRspsIdSys = enrollmentRspsIdSys;
	        } else if(this.enrollmentRspsIdSys.substring(this.enrollmentRspsIdSys.length() - 1).equals("]") & enrollmentRspsIdSys.equals("[")) {
	        	this.enrollmentRspsIdSys = this.enrollmentRspsIdSys+ "," + enrollmentRspsIdSys;
	        } else if(enrollmentRspsIdSys.equals("[") | enrollmentRspsIdSys.equals("]") | this.enrollmentRspsIdSys.substring(this.enrollmentRspsIdSys.length() - 1).equals("[")) {
	        	this.enrollmentRspsIdSys = this.enrollmentRspsIdSys+enrollmentRspsIdSys;
	        } else  {
	            this.enrollmentRspsIdSys = this.enrollmentRspsIdSys+ "," +enrollmentRspsIdSys;
	        }
        }
    }
    
    
    
    public String getEnrollmentRspsIdTypCdgCd() {
        return this.enrollmentRspsIdTypCdgCd;
    }
    
    public void setEnrollmentRspsIdTypCdgCd(String enrollmentRspsIdTypCdgCd) {
        this.enrollmentRspsIdTypCdgCd = enrollmentRspsIdTypCdgCd;
    }
    
    public void addEnrollmentRspsIdTypCdgCd(String enrollmentRspsIdTypCdgCd) {
    	if( enrollmentRspsIdTypCdgCd != null ) {
	    	if( this.enrollmentRspsIdTypCdgCd == null ) {
	        	this.enrollmentRspsIdTypCdgCd = enrollmentRspsIdTypCdgCd;
	        } else if(this.enrollmentRspsIdTypCdgCd.substring(this.enrollmentRspsIdTypCdgCd.length() - 1).equals("]") & enrollmentRspsIdTypCdgCd.equals("[")) {
	        	this.enrollmentRspsIdTypCdgCd = this.enrollmentRspsIdTypCdgCd+ "," + enrollmentRspsIdTypCdgCd;
	        } else if(enrollmentRspsIdTypCdgCd.equals("[") | enrollmentRspsIdTypCdgCd.equals("]") | this.enrollmentRspsIdTypCdgCd.substring(this.enrollmentRspsIdTypCdgCd.length() - 1).equals("[")) {
	        	this.enrollmentRspsIdTypCdgCd = this.enrollmentRspsIdTypCdgCd+enrollmentRspsIdTypCdgCd;
	        } else  {
	            this.enrollmentRspsIdTypCdgCd = this.enrollmentRspsIdTypCdgCd+ "," +enrollmentRspsIdTypCdgCd;
	        }
        }
    }
    
    
    
    public String getEnrollmentRspsIdTypCdgDsply() {
        return this.enrollmentRspsIdTypCdgDsply;
    }
    
    public void setEnrollmentRspsIdTypCdgDsply(String enrollmentRspsIdTypCdgDsply) {
        this.enrollmentRspsIdTypCdgDsply = enrollmentRspsIdTypCdgDsply;
    }
    
    public void addEnrollmentRspsIdTypCdgDsply(String enrollmentRspsIdTypCdgDsply) {
    	if( enrollmentRspsIdTypCdgDsply != null ) {
	    	if( this.enrollmentRspsIdTypCdgDsply == null ) {
	        	this.enrollmentRspsIdTypCdgDsply = enrollmentRspsIdTypCdgDsply;
	        } else if(this.enrollmentRspsIdTypCdgDsply.substring(this.enrollmentRspsIdTypCdgDsply.length() - 1).equals("]") & enrollmentRspsIdTypCdgDsply.equals("[")) {
	        	this.enrollmentRspsIdTypCdgDsply = this.enrollmentRspsIdTypCdgDsply+ "," + enrollmentRspsIdTypCdgDsply;
	        } else if(enrollmentRspsIdTypCdgDsply.equals("[") | enrollmentRspsIdTypCdgDsply.equals("]") | this.enrollmentRspsIdTypCdgDsply.substring(this.enrollmentRspsIdTypCdgDsply.length() - 1).equals("[")) {
	        	this.enrollmentRspsIdTypCdgDsply = this.enrollmentRspsIdTypCdgDsply+enrollmentRspsIdTypCdgDsply;
	        } else  {
	            this.enrollmentRspsIdTypCdgDsply = this.enrollmentRspsIdTypCdgDsply+ "," +enrollmentRspsIdTypCdgDsply;
	        }
        }
    }
    
    
    
    public String getEnrollmentRspsIdTypCdgSys() {
        return this.enrollmentRspsIdTypCdgSys;
    }
    
    public void setEnrollmentRspsIdTypCdgSys(String enrollmentRspsIdTypCdgSys) {
        this.enrollmentRspsIdTypCdgSys = enrollmentRspsIdTypCdgSys;
    }
    
    public void addEnrollmentRspsIdTypCdgSys(String enrollmentRspsIdTypCdgSys) {
    	if( enrollmentRspsIdTypCdgSys != null ) {
	    	if( this.enrollmentRspsIdTypCdgSys == null ) {
	        	this.enrollmentRspsIdTypCdgSys = enrollmentRspsIdTypCdgSys;
	        } else if(this.enrollmentRspsIdTypCdgSys.substring(this.enrollmentRspsIdTypCdgSys.length() - 1).equals("]") & enrollmentRspsIdTypCdgSys.equals("[")) {
	        	this.enrollmentRspsIdTypCdgSys = this.enrollmentRspsIdTypCdgSys+ "," + enrollmentRspsIdTypCdgSys;
	        } else if(enrollmentRspsIdTypCdgSys.equals("[") | enrollmentRspsIdTypCdgSys.equals("]") | this.enrollmentRspsIdTypCdgSys.substring(this.enrollmentRspsIdTypCdgSys.length() - 1).equals("[")) {
	        	this.enrollmentRspsIdTypCdgSys = this.enrollmentRspsIdTypCdgSys+enrollmentRspsIdTypCdgSys;
	        } else  {
	            this.enrollmentRspsIdTypCdgSys = this.enrollmentRspsIdTypCdgSys+ "," +enrollmentRspsIdTypCdgSys;
	        }
        }
    }
    
    
    
    public String getEnrollmentRspsIdTypCdgUsrSltd() {
        return this.enrollmentRspsIdTypCdgUsrSltd;
    }
    
    public void setEnrollmentRspsIdTypCdgUsrSltd(String enrollmentRspsIdTypCdgUsrSltd) {
        this.enrollmentRspsIdTypCdgUsrSltd = enrollmentRspsIdTypCdgUsrSltd;
    }
    
    public void addEnrollmentRspsIdTypCdgUsrSltd(String enrollmentRspsIdTypCdgUsrSltd) {
    	if( enrollmentRspsIdTypCdgUsrSltd != null ) {
	    	if( this.enrollmentRspsIdTypCdgUsrSltd == null ) {
	        	this.enrollmentRspsIdTypCdgUsrSltd = enrollmentRspsIdTypCdgUsrSltd;
	        } else if(this.enrollmentRspsIdTypCdgUsrSltd.substring(this.enrollmentRspsIdTypCdgUsrSltd.length() - 1).equals("]") & enrollmentRspsIdTypCdgUsrSltd.equals("[")) {
	        	this.enrollmentRspsIdTypCdgUsrSltd = this.enrollmentRspsIdTypCdgUsrSltd+ "," + enrollmentRspsIdTypCdgUsrSltd;
	        } else if(enrollmentRspsIdTypCdgUsrSltd.equals("[") | enrollmentRspsIdTypCdgUsrSltd.equals("]") | this.enrollmentRspsIdTypCdgUsrSltd.substring(this.enrollmentRspsIdTypCdgUsrSltd.length() - 1).equals("[")) {
	        	this.enrollmentRspsIdTypCdgUsrSltd = this.enrollmentRspsIdTypCdgUsrSltd+enrollmentRspsIdTypCdgUsrSltd;
	        } else  {
	            this.enrollmentRspsIdTypCdgUsrSltd = this.enrollmentRspsIdTypCdgUsrSltd+ "," +enrollmentRspsIdTypCdgUsrSltd;
	        }
        }
    }
    
    
    
    public String getEnrollmentRspsIdTypCdgVrsn() {
        return this.enrollmentRspsIdTypCdgVrsn;
    }
    
    public void setEnrollmentRspsIdTypCdgVrsn(String enrollmentRspsIdTypCdgVrsn) {
        this.enrollmentRspsIdTypCdgVrsn = enrollmentRspsIdTypCdgVrsn;
    }
    
    public void addEnrollmentRspsIdTypCdgVrsn(String enrollmentRspsIdTypCdgVrsn) {
    	if( enrollmentRspsIdTypCdgVrsn != null ) {
	    	if( this.enrollmentRspsIdTypCdgVrsn == null ) {
	        	this.enrollmentRspsIdTypCdgVrsn = enrollmentRspsIdTypCdgVrsn;
	        } else if(this.enrollmentRspsIdTypCdgVrsn.substring(this.enrollmentRspsIdTypCdgVrsn.length() - 1).equals("]") & enrollmentRspsIdTypCdgVrsn.equals("[")) {
	        	this.enrollmentRspsIdTypCdgVrsn = this.enrollmentRspsIdTypCdgVrsn+ "," + enrollmentRspsIdTypCdgVrsn;
	        } else if(enrollmentRspsIdTypCdgVrsn.equals("[") | enrollmentRspsIdTypCdgVrsn.equals("]") | this.enrollmentRspsIdTypCdgVrsn.substring(this.enrollmentRspsIdTypCdgVrsn.length() - 1).equals("[")) {
	        	this.enrollmentRspsIdTypCdgVrsn = this.enrollmentRspsIdTypCdgVrsn+enrollmentRspsIdTypCdgVrsn;
	        } else  {
	            this.enrollmentRspsIdTypCdgVrsn = this.enrollmentRspsIdTypCdgVrsn+ "," +enrollmentRspsIdTypCdgVrsn;
	        }
        }
    }
    
    
    
    public String getEnrollmentRspsIdTypTxt() {
        return this.enrollmentRspsIdTypTxt;
    }
    
    public void setEnrollmentRspsIdTypTxt(String enrollmentRspsIdTypTxt) {
        this.enrollmentRspsIdTypTxt = enrollmentRspsIdTypTxt;
    }
    
    public void addEnrollmentRspsIdTypTxt(String enrollmentRspsIdTypTxt) {
    	if( enrollmentRspsIdTypTxt != null ) {
	    	if( this.enrollmentRspsIdTypTxt == null ) {
	        	this.enrollmentRspsIdTypTxt = enrollmentRspsIdTypTxt;
	        } else if(this.enrollmentRspsIdTypTxt.substring(this.enrollmentRspsIdTypTxt.length() - 1).equals("]") & enrollmentRspsIdTypTxt.equals("[")) {
	        	this.enrollmentRspsIdTypTxt = this.enrollmentRspsIdTypTxt+ "," + enrollmentRspsIdTypTxt;
	        } else if(enrollmentRspsIdTypTxt.equals("[") | enrollmentRspsIdTypTxt.equals("]") | this.enrollmentRspsIdTypTxt.substring(this.enrollmentRspsIdTypTxt.length() - 1).equals("[")) {
	        	this.enrollmentRspsIdTypTxt = this.enrollmentRspsIdTypTxt+enrollmentRspsIdTypTxt;
	        } else  {
	            this.enrollmentRspsIdTypTxt = this.enrollmentRspsIdTypTxt+ "," +enrollmentRspsIdTypTxt;
	        }
        }
    }
    
    
    
    public String getEnrollmentRspsIdUse() {
        return this.enrollmentRspsIdUse;
    }
    
    public void setEnrollmentRspsIdUse(String enrollmentRspsIdUse) {
        this.enrollmentRspsIdUse = enrollmentRspsIdUse;
    }
    
    public void addEnrollmentRspsIdUse(String enrollmentRspsIdUse) {
    	if( enrollmentRspsIdUse != null ) {
	    	if( this.enrollmentRspsIdUse == null ) {
	        	this.enrollmentRspsIdUse = enrollmentRspsIdUse;
	        } else if(this.enrollmentRspsIdUse.substring(this.enrollmentRspsIdUse.length() - 1).equals("]") & enrollmentRspsIdUse.equals("[")) {
	        	this.enrollmentRspsIdUse = this.enrollmentRspsIdUse+ "," + enrollmentRspsIdUse;
	        } else if(enrollmentRspsIdUse.equals("[") | enrollmentRspsIdUse.equals("]") | this.enrollmentRspsIdUse.substring(this.enrollmentRspsIdUse.length() - 1).equals("[")) {
	        	this.enrollmentRspsIdUse = this.enrollmentRspsIdUse+enrollmentRspsIdUse;
	        } else  {
	            this.enrollmentRspsIdUse = this.enrollmentRspsIdUse+ "," +enrollmentRspsIdUse;
	        }
        }
    }
    
    
    
    public String getEnrollmentRspsIdVl() {
        return this.enrollmentRspsIdVl;
    }
    
    public void setEnrollmentRspsIdVl(String enrollmentRspsIdVl) {
        this.enrollmentRspsIdVl = enrollmentRspsIdVl;
    }
    
    public void addEnrollmentRspsIdVl(String enrollmentRspsIdVl) {
    	if( enrollmentRspsIdVl != null ) {
	    	if( this.enrollmentRspsIdVl == null ) {
	        	this.enrollmentRspsIdVl = enrollmentRspsIdVl;
	        } else if(this.enrollmentRspsIdVl.substring(this.enrollmentRspsIdVl.length() - 1).equals("]") & enrollmentRspsIdVl.equals("[")) {
	        	this.enrollmentRspsIdVl = this.enrollmentRspsIdVl+ "," + enrollmentRspsIdVl;
	        } else if(enrollmentRspsIdVl.equals("[") | enrollmentRspsIdVl.equals("]") | this.enrollmentRspsIdVl.substring(this.enrollmentRspsIdVl.length() - 1).equals("[")) {
	        	this.enrollmentRspsIdVl = this.enrollmentRspsIdVl+enrollmentRspsIdVl;
	        } else  {
	            this.enrollmentRspsIdVl = this.enrollmentRspsIdVl+ "," +enrollmentRspsIdVl;
	        }
        }
    }
    
    
    
    public String getEnrollmentRspsOrgnztn() {
        return this.enrollmentRspsOrgnztn;
    }
    
    public void setEnrollmentRspsOrgnztn(String enrollmentRspsOrgnztn) {
        this.enrollmentRspsOrgnztn = enrollmentRspsOrgnztn;
    }
    
    public void addEnrollmentRspsOrgnztn(String enrollmentRspsOrgnztn) {
    	if( enrollmentRspsOrgnztn != null ) {
	    	if( this.enrollmentRspsOrgnztn == null ) {
	        	this.enrollmentRspsOrgnztn = enrollmentRspsOrgnztn;
	        } else if(this.enrollmentRspsOrgnztn.substring(this.enrollmentRspsOrgnztn.length() - 1).equals("]") & enrollmentRspsOrgnztn.equals("[")) {
	        	this.enrollmentRspsOrgnztn = this.enrollmentRspsOrgnztn+ "," + enrollmentRspsOrgnztn;
	        } else if(enrollmentRspsOrgnztn.equals("[") | enrollmentRspsOrgnztn.equals("]") | this.enrollmentRspsOrgnztn.substring(this.enrollmentRspsOrgnztn.length() - 1).equals("[")) {
	        	this.enrollmentRspsOrgnztn = this.enrollmentRspsOrgnztn+enrollmentRspsOrgnztn;
	        } else  {
	            this.enrollmentRspsOrgnztn = this.enrollmentRspsOrgnztn+ "," +enrollmentRspsOrgnztn;
	        }
        }
    }
    
    
    
    public String getEnrollmentRspsOutcome() {
        return this.enrollmentRspsOutcome;
    }
    
    public void setEnrollmentRspsOutcome(String enrollmentRspsOutcome) {
        this.enrollmentRspsOutcome = enrollmentRspsOutcome;
    }
    
    public void addEnrollmentRspsOutcome(String enrollmentRspsOutcome) {
    	if( enrollmentRspsOutcome != null ) {
	    	if( this.enrollmentRspsOutcome == null ) {
	        	this.enrollmentRspsOutcome = enrollmentRspsOutcome;
	        } else if(this.enrollmentRspsOutcome.substring(this.enrollmentRspsOutcome.length() - 1).equals("]") & enrollmentRspsOutcome.equals("[")) {
	        	this.enrollmentRspsOutcome = this.enrollmentRspsOutcome+ "," + enrollmentRspsOutcome;
	        } else if(enrollmentRspsOutcome.equals("[") | enrollmentRspsOutcome.equals("]") | this.enrollmentRspsOutcome.substring(this.enrollmentRspsOutcome.length() - 1).equals("[")) {
	        	this.enrollmentRspsOutcome = this.enrollmentRspsOutcome+enrollmentRspsOutcome;
	        } else  {
	            this.enrollmentRspsOutcome = this.enrollmentRspsOutcome+ "," +enrollmentRspsOutcome;
	        }
        }
    }
    
    
    
    public String getEnrollmentRspsRqst() {
        return this.enrollmentRspsRqst;
    }
    
    public void setEnrollmentRspsRqst(String enrollmentRspsRqst) {
        this.enrollmentRspsRqst = enrollmentRspsRqst;
    }
    
    public void addEnrollmentRspsRqst(String enrollmentRspsRqst) {
    	if( enrollmentRspsRqst != null ) {
	    	if( this.enrollmentRspsRqst == null ) {
	        	this.enrollmentRspsRqst = enrollmentRspsRqst;
	        } else if(this.enrollmentRspsRqst.substring(this.enrollmentRspsRqst.length() - 1).equals("]") & enrollmentRspsRqst.equals("[")) {
	        	this.enrollmentRspsRqst = this.enrollmentRspsRqst+ "," + enrollmentRspsRqst;
	        } else if(enrollmentRspsRqst.equals("[") | enrollmentRspsRqst.equals("]") | this.enrollmentRspsRqst.substring(this.enrollmentRspsRqst.length() - 1).equals("[")) {
	        	this.enrollmentRspsRqst = this.enrollmentRspsRqst+enrollmentRspsRqst;
	        } else  {
	            this.enrollmentRspsRqst = this.enrollmentRspsRqst+ "," +enrollmentRspsRqst;
	        }
        }
    }
    
    
    
    public String getEnrollmentRspsRqstProvider() {
        return this.enrollmentRspsRqstProvider;
    }
    
    public void setEnrollmentRspsRqstProvider(String enrollmentRspsRqstProvider) {
        this.enrollmentRspsRqstProvider = enrollmentRspsRqstProvider;
    }
    
    public void addEnrollmentRspsRqstProvider(String enrollmentRspsRqstProvider) {
    	if( enrollmentRspsRqstProvider != null ) {
	    	if( this.enrollmentRspsRqstProvider == null ) {
	        	this.enrollmentRspsRqstProvider = enrollmentRspsRqstProvider;
	        } else if(this.enrollmentRspsRqstProvider.substring(this.enrollmentRspsRqstProvider.length() - 1).equals("]") & enrollmentRspsRqstProvider.equals("[")) {
	        	this.enrollmentRspsRqstProvider = this.enrollmentRspsRqstProvider+ "," + enrollmentRspsRqstProvider;
	        } else if(enrollmentRspsRqstProvider.equals("[") | enrollmentRspsRqstProvider.equals("]") | this.enrollmentRspsRqstProvider.substring(this.enrollmentRspsRqstProvider.length() - 1).equals("[")) {
	        	this.enrollmentRspsRqstProvider = this.enrollmentRspsRqstProvider+enrollmentRspsRqstProvider;
	        } else  {
	            this.enrollmentRspsRqstProvider = this.enrollmentRspsRqstProvider+ "," +enrollmentRspsRqstProvider;
	        }
        }
    }
    
    
    
    public String getEnrollmentRspsSts() {
        return this.enrollmentRspsSts;
    }
    
    public void setEnrollmentRspsSts(String enrollmentRspsSts) {
        this.enrollmentRspsSts = enrollmentRspsSts;
    }
    
    public void addEnrollmentRspsSts(String enrollmentRspsSts) {
    	if( enrollmentRspsSts != null ) {
	    	if( this.enrollmentRspsSts == null ) {
	        	this.enrollmentRspsSts = enrollmentRspsSts;
	        } else if(this.enrollmentRspsSts.substring(this.enrollmentRspsSts.length() - 1).equals("]") & enrollmentRspsSts.equals("[")) {
	        	this.enrollmentRspsSts = this.enrollmentRspsSts+ "," + enrollmentRspsSts;
	        } else if(enrollmentRspsSts.equals("[") | enrollmentRspsSts.equals("]") | this.enrollmentRspsSts.substring(this.enrollmentRspsSts.length() - 1).equals("[")) {
	        	this.enrollmentRspsSts = this.enrollmentRspsSts+enrollmentRspsSts;
	        } else  {
	            this.enrollmentRspsSts = this.enrollmentRspsSts+ "," +enrollmentRspsSts;
	        }
        }
    }
    
    
    




}


