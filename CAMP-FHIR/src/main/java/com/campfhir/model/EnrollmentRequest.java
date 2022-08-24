// // default package
package main.java.com.campfhir.model;
// Generated Aug 17, 2022, 11:08:48 AM by Hibernate Tools 5.6.1.Final



/**
 * EnrollmentRequest generated by hbm2java
 */
public class EnrollmentRequest  implements java.io.Serializable {


     private String id;
     private String enrollmentRqstCandidate;
     private String enrollmentRqstCvg;
     private String enrollmentRqstCreated;
     private String enrollmentRqstIdAssigner;
     private String enrollmentRqstIdPrdEnd;
     private String enrollmentRqstIdPrdStrt;
     private String enrollmentRqstIdSys;
     private String enrollmentRqstIdTypCdgCd;
     private String enrollmentRqstIdTypCdgDsply;
     private String enrollmentRqstIdTypCdgSys;
     private String enrollmentRqstIdTypCdgUsrSltd;
     private String enrollmentRqstIdTypCdgVrsn;
     private String enrollmentRqstIdTypTxt;
     private String enrollmentRqstIdUse;
     private String enrollmentRqstIdVl;
     private String enrollmentRqstInsurer;
     private String enrollmentRqstProvider;
     private String enrollmentRqstSts;

    public EnrollmentRequest() {
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
    
    
    
    public String getEnrollmentRqstCandidate() {
        return this.enrollmentRqstCandidate;
    }
    
    public void setEnrollmentRqstCandidate(String enrollmentRqstCandidate) {
        this.enrollmentRqstCandidate = enrollmentRqstCandidate;
    }
    
    public void addEnrollmentRqstCandidate(String enrollmentRqstCandidate) {
    	if( enrollmentRqstCandidate != null ) {
	    	if( this.enrollmentRqstCandidate == null ) {
	        	this.enrollmentRqstCandidate = enrollmentRqstCandidate;
	        } else if(this.enrollmentRqstCandidate.substring(this.enrollmentRqstCandidate.length() - 1).equals("]") & enrollmentRqstCandidate.equals("[")) {
	        	this.enrollmentRqstCandidate = this.enrollmentRqstCandidate+ "," + enrollmentRqstCandidate;
	        } else if(enrollmentRqstCandidate.equals("[") | enrollmentRqstCandidate.equals("]") | this.enrollmentRqstCandidate.substring(this.enrollmentRqstCandidate.length() - 1).equals("[")) {
	        	this.enrollmentRqstCandidate = this.enrollmentRqstCandidate+enrollmentRqstCandidate;
	        } else  {
	            this.enrollmentRqstCandidate = this.enrollmentRqstCandidate+ "," +enrollmentRqstCandidate;
	        }
        }
    }
    
    
    
    public String getEnrollmentRqstCvg() {
        return this.enrollmentRqstCvg;
    }
    
    public void setEnrollmentRqstCvg(String enrollmentRqstCvg) {
        this.enrollmentRqstCvg = enrollmentRqstCvg;
    }
    
    public void addEnrollmentRqstCvg(String enrollmentRqstCvg) {
    	if( enrollmentRqstCvg != null ) {
	    	if( this.enrollmentRqstCvg == null ) {
	        	this.enrollmentRqstCvg = enrollmentRqstCvg;
	        } else if(this.enrollmentRqstCvg.substring(this.enrollmentRqstCvg.length() - 1).equals("]") & enrollmentRqstCvg.equals("[")) {
	        	this.enrollmentRqstCvg = this.enrollmentRqstCvg+ "," + enrollmentRqstCvg;
	        } else if(enrollmentRqstCvg.equals("[") | enrollmentRqstCvg.equals("]") | this.enrollmentRqstCvg.substring(this.enrollmentRqstCvg.length() - 1).equals("[")) {
	        	this.enrollmentRqstCvg = this.enrollmentRqstCvg+enrollmentRqstCvg;
	        } else  {
	            this.enrollmentRqstCvg = this.enrollmentRqstCvg+ "," +enrollmentRqstCvg;
	        }
        }
    }
    
    
    
    public String getEnrollmentRqstCreated() {
        return this.enrollmentRqstCreated;
    }
    
    public void setEnrollmentRqstCreated(String enrollmentRqstCreated) {
        this.enrollmentRqstCreated = enrollmentRqstCreated;
    }
    
    public void addEnrollmentRqstCreated(String enrollmentRqstCreated) {
    	if( enrollmentRqstCreated != null ) {
	    	if( this.enrollmentRqstCreated == null ) {
	        	this.enrollmentRqstCreated = enrollmentRqstCreated;
	        } else if(this.enrollmentRqstCreated.substring(this.enrollmentRqstCreated.length() - 1).equals("]") & enrollmentRqstCreated.equals("[")) {
	        	this.enrollmentRqstCreated = this.enrollmentRqstCreated+ "," + enrollmentRqstCreated;
	        } else if(enrollmentRqstCreated.equals("[") | enrollmentRqstCreated.equals("]") | this.enrollmentRqstCreated.substring(this.enrollmentRqstCreated.length() - 1).equals("[")) {
	        	this.enrollmentRqstCreated = this.enrollmentRqstCreated+enrollmentRqstCreated;
	        } else  {
	            this.enrollmentRqstCreated = this.enrollmentRqstCreated+ "," +enrollmentRqstCreated;
	        }
        }
    }
    
    
    
    public String getEnrollmentRqstIdAssigner() {
        return this.enrollmentRqstIdAssigner;
    }
    
    public void setEnrollmentRqstIdAssigner(String enrollmentRqstIdAssigner) {
        this.enrollmentRqstIdAssigner = enrollmentRqstIdAssigner;
    }
    
    public void addEnrollmentRqstIdAssigner(String enrollmentRqstIdAssigner) {
    	if( enrollmentRqstIdAssigner != null ) {
	    	if( this.enrollmentRqstIdAssigner == null ) {
	        	this.enrollmentRqstIdAssigner = enrollmentRqstIdAssigner;
	        } else if(this.enrollmentRqstIdAssigner.substring(this.enrollmentRqstIdAssigner.length() - 1).equals("]") & enrollmentRqstIdAssigner.equals("[")) {
	        	this.enrollmentRqstIdAssigner = this.enrollmentRqstIdAssigner+ "," + enrollmentRqstIdAssigner;
	        } else if(enrollmentRqstIdAssigner.equals("[") | enrollmentRqstIdAssigner.equals("]") | this.enrollmentRqstIdAssigner.substring(this.enrollmentRqstIdAssigner.length() - 1).equals("[")) {
	        	this.enrollmentRqstIdAssigner = this.enrollmentRqstIdAssigner+enrollmentRqstIdAssigner;
	        } else  {
	            this.enrollmentRqstIdAssigner = this.enrollmentRqstIdAssigner+ "," +enrollmentRqstIdAssigner;
	        }
        }
    }
    
    
    
    public String getEnrollmentRqstIdPrdEnd() {
        return this.enrollmentRqstIdPrdEnd;
    }
    
    public void setEnrollmentRqstIdPrdEnd(String enrollmentRqstIdPrdEnd) {
        this.enrollmentRqstIdPrdEnd = enrollmentRqstIdPrdEnd;
    }
    
    public void addEnrollmentRqstIdPrdEnd(String enrollmentRqstIdPrdEnd) {
    	if( enrollmentRqstIdPrdEnd != null ) {
	    	if( this.enrollmentRqstIdPrdEnd == null ) {
	        	this.enrollmentRqstIdPrdEnd = enrollmentRqstIdPrdEnd;
	        } else if(this.enrollmentRqstIdPrdEnd.substring(this.enrollmentRqstIdPrdEnd.length() - 1).equals("]") & enrollmentRqstIdPrdEnd.equals("[")) {
	        	this.enrollmentRqstIdPrdEnd = this.enrollmentRqstIdPrdEnd+ "," + enrollmentRqstIdPrdEnd;
	        } else if(enrollmentRqstIdPrdEnd.equals("[") | enrollmentRqstIdPrdEnd.equals("]") | this.enrollmentRqstIdPrdEnd.substring(this.enrollmentRqstIdPrdEnd.length() - 1).equals("[")) {
	        	this.enrollmentRqstIdPrdEnd = this.enrollmentRqstIdPrdEnd+enrollmentRqstIdPrdEnd;
	        } else  {
	            this.enrollmentRqstIdPrdEnd = this.enrollmentRqstIdPrdEnd+ "," +enrollmentRqstIdPrdEnd;
	        }
        }
    }
    
    
    
    public String getEnrollmentRqstIdPrdStrt() {
        return this.enrollmentRqstIdPrdStrt;
    }
    
    public void setEnrollmentRqstIdPrdStrt(String enrollmentRqstIdPrdStrt) {
        this.enrollmentRqstIdPrdStrt = enrollmentRqstIdPrdStrt;
    }
    
    public void addEnrollmentRqstIdPrdStrt(String enrollmentRqstIdPrdStrt) {
    	if( enrollmentRqstIdPrdStrt != null ) {
	    	if( this.enrollmentRqstIdPrdStrt == null ) {
	        	this.enrollmentRqstIdPrdStrt = enrollmentRqstIdPrdStrt;
	        } else if(this.enrollmentRqstIdPrdStrt.substring(this.enrollmentRqstIdPrdStrt.length() - 1).equals("]") & enrollmentRqstIdPrdStrt.equals("[")) {
	        	this.enrollmentRqstIdPrdStrt = this.enrollmentRqstIdPrdStrt+ "," + enrollmentRqstIdPrdStrt;
	        } else if(enrollmentRqstIdPrdStrt.equals("[") | enrollmentRqstIdPrdStrt.equals("]") | this.enrollmentRqstIdPrdStrt.substring(this.enrollmentRqstIdPrdStrt.length() - 1).equals("[")) {
	        	this.enrollmentRqstIdPrdStrt = this.enrollmentRqstIdPrdStrt+enrollmentRqstIdPrdStrt;
	        } else  {
	            this.enrollmentRqstIdPrdStrt = this.enrollmentRqstIdPrdStrt+ "," +enrollmentRqstIdPrdStrt;
	        }
        }
    }
    
    
    
    public String getEnrollmentRqstIdSys() {
        return this.enrollmentRqstIdSys;
    }
    
    public void setEnrollmentRqstIdSys(String enrollmentRqstIdSys) {
        this.enrollmentRqstIdSys = enrollmentRqstIdSys;
    }
    
    public void addEnrollmentRqstIdSys(String enrollmentRqstIdSys) {
    	if( enrollmentRqstIdSys != null ) {
	    	if( this.enrollmentRqstIdSys == null ) {
	        	this.enrollmentRqstIdSys = enrollmentRqstIdSys;
	        } else if(this.enrollmentRqstIdSys.substring(this.enrollmentRqstIdSys.length() - 1).equals("]") & enrollmentRqstIdSys.equals("[")) {
	        	this.enrollmentRqstIdSys = this.enrollmentRqstIdSys+ "," + enrollmentRqstIdSys;
	        } else if(enrollmentRqstIdSys.equals("[") | enrollmentRqstIdSys.equals("]") | this.enrollmentRqstIdSys.substring(this.enrollmentRqstIdSys.length() - 1).equals("[")) {
	        	this.enrollmentRqstIdSys = this.enrollmentRqstIdSys+enrollmentRqstIdSys;
	        } else  {
	            this.enrollmentRqstIdSys = this.enrollmentRqstIdSys+ "," +enrollmentRqstIdSys;
	        }
        }
    }
    
    
    
    public String getEnrollmentRqstIdTypCdgCd() {
        return this.enrollmentRqstIdTypCdgCd;
    }
    
    public void setEnrollmentRqstIdTypCdgCd(String enrollmentRqstIdTypCdgCd) {
        this.enrollmentRqstIdTypCdgCd = enrollmentRqstIdTypCdgCd;
    }
    
    public void addEnrollmentRqstIdTypCdgCd(String enrollmentRqstIdTypCdgCd) {
    	if( enrollmentRqstIdTypCdgCd != null ) {
	    	if( this.enrollmentRqstIdTypCdgCd == null ) {
	        	this.enrollmentRqstIdTypCdgCd = enrollmentRqstIdTypCdgCd;
	        } else if(this.enrollmentRqstIdTypCdgCd.substring(this.enrollmentRqstIdTypCdgCd.length() - 1).equals("]") & enrollmentRqstIdTypCdgCd.equals("[")) {
	        	this.enrollmentRqstIdTypCdgCd = this.enrollmentRqstIdTypCdgCd+ "," + enrollmentRqstIdTypCdgCd;
	        } else if(enrollmentRqstIdTypCdgCd.equals("[") | enrollmentRqstIdTypCdgCd.equals("]") | this.enrollmentRqstIdTypCdgCd.substring(this.enrollmentRqstIdTypCdgCd.length() - 1).equals("[")) {
	        	this.enrollmentRqstIdTypCdgCd = this.enrollmentRqstIdTypCdgCd+enrollmentRqstIdTypCdgCd;
	        } else  {
	            this.enrollmentRqstIdTypCdgCd = this.enrollmentRqstIdTypCdgCd+ "," +enrollmentRqstIdTypCdgCd;
	        }
        }
    }
    
    
    
    public String getEnrollmentRqstIdTypCdgDsply() {
        return this.enrollmentRqstIdTypCdgDsply;
    }
    
    public void setEnrollmentRqstIdTypCdgDsply(String enrollmentRqstIdTypCdgDsply) {
        this.enrollmentRqstIdTypCdgDsply = enrollmentRqstIdTypCdgDsply;
    }
    
    public void addEnrollmentRqstIdTypCdgDsply(String enrollmentRqstIdTypCdgDsply) {
    	if( enrollmentRqstIdTypCdgDsply != null ) {
	    	if( this.enrollmentRqstIdTypCdgDsply == null ) {
	        	this.enrollmentRqstIdTypCdgDsply = enrollmentRqstIdTypCdgDsply;
	        } else if(this.enrollmentRqstIdTypCdgDsply.substring(this.enrollmentRqstIdTypCdgDsply.length() - 1).equals("]") & enrollmentRqstIdTypCdgDsply.equals("[")) {
	        	this.enrollmentRqstIdTypCdgDsply = this.enrollmentRqstIdTypCdgDsply+ "," + enrollmentRqstIdTypCdgDsply;
	        } else if(enrollmentRqstIdTypCdgDsply.equals("[") | enrollmentRqstIdTypCdgDsply.equals("]") | this.enrollmentRqstIdTypCdgDsply.substring(this.enrollmentRqstIdTypCdgDsply.length() - 1).equals("[")) {
	        	this.enrollmentRqstIdTypCdgDsply = this.enrollmentRqstIdTypCdgDsply+enrollmentRqstIdTypCdgDsply;
	        } else  {
	            this.enrollmentRqstIdTypCdgDsply = this.enrollmentRqstIdTypCdgDsply+ "," +enrollmentRqstIdTypCdgDsply;
	        }
        }
    }
    
    
    
    public String getEnrollmentRqstIdTypCdgSys() {
        return this.enrollmentRqstIdTypCdgSys;
    }
    
    public void setEnrollmentRqstIdTypCdgSys(String enrollmentRqstIdTypCdgSys) {
        this.enrollmentRqstIdTypCdgSys = enrollmentRqstIdTypCdgSys;
    }
    
    public void addEnrollmentRqstIdTypCdgSys(String enrollmentRqstIdTypCdgSys) {
    	if( enrollmentRqstIdTypCdgSys != null ) {
	    	if( this.enrollmentRqstIdTypCdgSys == null ) {
	        	this.enrollmentRqstIdTypCdgSys = enrollmentRqstIdTypCdgSys;
	        } else if(this.enrollmentRqstIdTypCdgSys.substring(this.enrollmentRqstIdTypCdgSys.length() - 1).equals("]") & enrollmentRqstIdTypCdgSys.equals("[")) {
	        	this.enrollmentRqstIdTypCdgSys = this.enrollmentRqstIdTypCdgSys+ "," + enrollmentRqstIdTypCdgSys;
	        } else if(enrollmentRqstIdTypCdgSys.equals("[") | enrollmentRqstIdTypCdgSys.equals("]") | this.enrollmentRqstIdTypCdgSys.substring(this.enrollmentRqstIdTypCdgSys.length() - 1).equals("[")) {
	        	this.enrollmentRqstIdTypCdgSys = this.enrollmentRqstIdTypCdgSys+enrollmentRqstIdTypCdgSys;
	        } else  {
	            this.enrollmentRqstIdTypCdgSys = this.enrollmentRqstIdTypCdgSys+ "," +enrollmentRqstIdTypCdgSys;
	        }
        }
    }
    
    
    
    public String getEnrollmentRqstIdTypCdgUsrSltd() {
        return this.enrollmentRqstIdTypCdgUsrSltd;
    }
    
    public void setEnrollmentRqstIdTypCdgUsrSltd(String enrollmentRqstIdTypCdgUsrSltd) {
        this.enrollmentRqstIdTypCdgUsrSltd = enrollmentRqstIdTypCdgUsrSltd;
    }
    
    public void addEnrollmentRqstIdTypCdgUsrSltd(String enrollmentRqstIdTypCdgUsrSltd) {
    	if( enrollmentRqstIdTypCdgUsrSltd != null ) {
	    	if( this.enrollmentRqstIdTypCdgUsrSltd == null ) {
	        	this.enrollmentRqstIdTypCdgUsrSltd = enrollmentRqstIdTypCdgUsrSltd;
	        } else if(this.enrollmentRqstIdTypCdgUsrSltd.substring(this.enrollmentRqstIdTypCdgUsrSltd.length() - 1).equals("]") & enrollmentRqstIdTypCdgUsrSltd.equals("[")) {
	        	this.enrollmentRqstIdTypCdgUsrSltd = this.enrollmentRqstIdTypCdgUsrSltd+ "," + enrollmentRqstIdTypCdgUsrSltd;
	        } else if(enrollmentRqstIdTypCdgUsrSltd.equals("[") | enrollmentRqstIdTypCdgUsrSltd.equals("]") | this.enrollmentRqstIdTypCdgUsrSltd.substring(this.enrollmentRqstIdTypCdgUsrSltd.length() - 1).equals("[")) {
	        	this.enrollmentRqstIdTypCdgUsrSltd = this.enrollmentRqstIdTypCdgUsrSltd+enrollmentRqstIdTypCdgUsrSltd;
	        } else  {
	            this.enrollmentRqstIdTypCdgUsrSltd = this.enrollmentRqstIdTypCdgUsrSltd+ "," +enrollmentRqstIdTypCdgUsrSltd;
	        }
        }
    }
    
    
    
    public String getEnrollmentRqstIdTypCdgVrsn() {
        return this.enrollmentRqstIdTypCdgVrsn;
    }
    
    public void setEnrollmentRqstIdTypCdgVrsn(String enrollmentRqstIdTypCdgVrsn) {
        this.enrollmentRqstIdTypCdgVrsn = enrollmentRqstIdTypCdgVrsn;
    }
    
    public void addEnrollmentRqstIdTypCdgVrsn(String enrollmentRqstIdTypCdgVrsn) {
    	if( enrollmentRqstIdTypCdgVrsn != null ) {
	    	if( this.enrollmentRqstIdTypCdgVrsn == null ) {
	        	this.enrollmentRqstIdTypCdgVrsn = enrollmentRqstIdTypCdgVrsn;
	        } else if(this.enrollmentRqstIdTypCdgVrsn.substring(this.enrollmentRqstIdTypCdgVrsn.length() - 1).equals("]") & enrollmentRqstIdTypCdgVrsn.equals("[")) {
	        	this.enrollmentRqstIdTypCdgVrsn = this.enrollmentRqstIdTypCdgVrsn+ "," + enrollmentRqstIdTypCdgVrsn;
	        } else if(enrollmentRqstIdTypCdgVrsn.equals("[") | enrollmentRqstIdTypCdgVrsn.equals("]") | this.enrollmentRqstIdTypCdgVrsn.substring(this.enrollmentRqstIdTypCdgVrsn.length() - 1).equals("[")) {
	        	this.enrollmentRqstIdTypCdgVrsn = this.enrollmentRqstIdTypCdgVrsn+enrollmentRqstIdTypCdgVrsn;
	        } else  {
	            this.enrollmentRqstIdTypCdgVrsn = this.enrollmentRqstIdTypCdgVrsn+ "," +enrollmentRqstIdTypCdgVrsn;
	        }
        }
    }
    
    
    
    public String getEnrollmentRqstIdTypTxt() {
        return this.enrollmentRqstIdTypTxt;
    }
    
    public void setEnrollmentRqstIdTypTxt(String enrollmentRqstIdTypTxt) {
        this.enrollmentRqstIdTypTxt = enrollmentRqstIdTypTxt;
    }
    
    public void addEnrollmentRqstIdTypTxt(String enrollmentRqstIdTypTxt) {
    	if( enrollmentRqstIdTypTxt != null ) {
	    	if( this.enrollmentRqstIdTypTxt == null ) {
	        	this.enrollmentRqstIdTypTxt = enrollmentRqstIdTypTxt;
	        } else if(this.enrollmentRqstIdTypTxt.substring(this.enrollmentRqstIdTypTxt.length() - 1).equals("]") & enrollmentRqstIdTypTxt.equals("[")) {
	        	this.enrollmentRqstIdTypTxt = this.enrollmentRqstIdTypTxt+ "," + enrollmentRqstIdTypTxt;
	        } else if(enrollmentRqstIdTypTxt.equals("[") | enrollmentRqstIdTypTxt.equals("]") | this.enrollmentRqstIdTypTxt.substring(this.enrollmentRqstIdTypTxt.length() - 1).equals("[")) {
	        	this.enrollmentRqstIdTypTxt = this.enrollmentRqstIdTypTxt+enrollmentRqstIdTypTxt;
	        } else  {
	            this.enrollmentRqstIdTypTxt = this.enrollmentRqstIdTypTxt+ "," +enrollmentRqstIdTypTxt;
	        }
        }
    }
    
    
    
    public String getEnrollmentRqstIdUse() {
        return this.enrollmentRqstIdUse;
    }
    
    public void setEnrollmentRqstIdUse(String enrollmentRqstIdUse) {
        this.enrollmentRqstIdUse = enrollmentRqstIdUse;
    }
    
    public void addEnrollmentRqstIdUse(String enrollmentRqstIdUse) {
    	if( enrollmentRqstIdUse != null ) {
	    	if( this.enrollmentRqstIdUse == null ) {
	        	this.enrollmentRqstIdUse = enrollmentRqstIdUse;
	        } else if(this.enrollmentRqstIdUse.substring(this.enrollmentRqstIdUse.length() - 1).equals("]") & enrollmentRqstIdUse.equals("[")) {
	        	this.enrollmentRqstIdUse = this.enrollmentRqstIdUse+ "," + enrollmentRqstIdUse;
	        } else if(enrollmentRqstIdUse.equals("[") | enrollmentRqstIdUse.equals("]") | this.enrollmentRqstIdUse.substring(this.enrollmentRqstIdUse.length() - 1).equals("[")) {
	        	this.enrollmentRqstIdUse = this.enrollmentRqstIdUse+enrollmentRqstIdUse;
	        } else  {
	            this.enrollmentRqstIdUse = this.enrollmentRqstIdUse+ "," +enrollmentRqstIdUse;
	        }
        }
    }
    
    
    
    public String getEnrollmentRqstIdVl() {
        return this.enrollmentRqstIdVl;
    }
    
    public void setEnrollmentRqstIdVl(String enrollmentRqstIdVl) {
        this.enrollmentRqstIdVl = enrollmentRqstIdVl;
    }
    
    public void addEnrollmentRqstIdVl(String enrollmentRqstIdVl) {
    	if( enrollmentRqstIdVl != null ) {
	    	if( this.enrollmentRqstIdVl == null ) {
	        	this.enrollmentRqstIdVl = enrollmentRqstIdVl;
	        } else if(this.enrollmentRqstIdVl.substring(this.enrollmentRqstIdVl.length() - 1).equals("]") & enrollmentRqstIdVl.equals("[")) {
	        	this.enrollmentRqstIdVl = this.enrollmentRqstIdVl+ "," + enrollmentRqstIdVl;
	        } else if(enrollmentRqstIdVl.equals("[") | enrollmentRqstIdVl.equals("]") | this.enrollmentRqstIdVl.substring(this.enrollmentRqstIdVl.length() - 1).equals("[")) {
	        	this.enrollmentRqstIdVl = this.enrollmentRqstIdVl+enrollmentRqstIdVl;
	        } else  {
	            this.enrollmentRqstIdVl = this.enrollmentRqstIdVl+ "," +enrollmentRqstIdVl;
	        }
        }
    }
    
    
    
    public String getEnrollmentRqstInsurer() {
        return this.enrollmentRqstInsurer;
    }
    
    public void setEnrollmentRqstInsurer(String enrollmentRqstInsurer) {
        this.enrollmentRqstInsurer = enrollmentRqstInsurer;
    }
    
    public void addEnrollmentRqstInsurer(String enrollmentRqstInsurer) {
    	if( enrollmentRqstInsurer != null ) {
	    	if( this.enrollmentRqstInsurer == null ) {
	        	this.enrollmentRqstInsurer = enrollmentRqstInsurer;
	        } else if(this.enrollmentRqstInsurer.substring(this.enrollmentRqstInsurer.length() - 1).equals("]") & enrollmentRqstInsurer.equals("[")) {
	        	this.enrollmentRqstInsurer = this.enrollmentRqstInsurer+ "," + enrollmentRqstInsurer;
	        } else if(enrollmentRqstInsurer.equals("[") | enrollmentRqstInsurer.equals("]") | this.enrollmentRqstInsurer.substring(this.enrollmentRqstInsurer.length() - 1).equals("[")) {
	        	this.enrollmentRqstInsurer = this.enrollmentRqstInsurer+enrollmentRqstInsurer;
	        } else  {
	            this.enrollmentRqstInsurer = this.enrollmentRqstInsurer+ "," +enrollmentRqstInsurer;
	        }
        }
    }
    
    
    
    public String getEnrollmentRqstProvider() {
        return this.enrollmentRqstProvider;
    }
    
    public void setEnrollmentRqstProvider(String enrollmentRqstProvider) {
        this.enrollmentRqstProvider = enrollmentRqstProvider;
    }
    
    public void addEnrollmentRqstProvider(String enrollmentRqstProvider) {
    	if( enrollmentRqstProvider != null ) {
	    	if( this.enrollmentRqstProvider == null ) {
	        	this.enrollmentRqstProvider = enrollmentRqstProvider;
	        } else if(this.enrollmentRqstProvider.substring(this.enrollmentRqstProvider.length() - 1).equals("]") & enrollmentRqstProvider.equals("[")) {
	        	this.enrollmentRqstProvider = this.enrollmentRqstProvider+ "," + enrollmentRqstProvider;
	        } else if(enrollmentRqstProvider.equals("[") | enrollmentRqstProvider.equals("]") | this.enrollmentRqstProvider.substring(this.enrollmentRqstProvider.length() - 1).equals("[")) {
	        	this.enrollmentRqstProvider = this.enrollmentRqstProvider+enrollmentRqstProvider;
	        } else  {
	            this.enrollmentRqstProvider = this.enrollmentRqstProvider+ "," +enrollmentRqstProvider;
	        }
        }
    }
    
    
    
    public String getEnrollmentRqstSts() {
        return this.enrollmentRqstSts;
    }
    
    public void setEnrollmentRqstSts(String enrollmentRqstSts) {
        this.enrollmentRqstSts = enrollmentRqstSts;
    }
    
    public void addEnrollmentRqstSts(String enrollmentRqstSts) {
    	if( enrollmentRqstSts != null ) {
	    	if( this.enrollmentRqstSts == null ) {
	        	this.enrollmentRqstSts = enrollmentRqstSts;
	        } else if(this.enrollmentRqstSts.substring(this.enrollmentRqstSts.length() - 1).equals("]") & enrollmentRqstSts.equals("[")) {
	        	this.enrollmentRqstSts = this.enrollmentRqstSts+ "," + enrollmentRqstSts;
	        } else if(enrollmentRqstSts.equals("[") | enrollmentRqstSts.equals("]") | this.enrollmentRqstSts.substring(this.enrollmentRqstSts.length() - 1).equals("[")) {
	        	this.enrollmentRqstSts = this.enrollmentRqstSts+enrollmentRqstSts;
	        } else  {
	            this.enrollmentRqstSts = this.enrollmentRqstSts+ "," +enrollmentRqstSts;
	        }
        }
    }
    
    
    




}

