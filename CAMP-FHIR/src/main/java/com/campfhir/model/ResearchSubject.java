// // default package
package main.java.com.campfhir.model;
// Generated Aug 17, 2022, 11:08:48 AM by Hibernate Tools 5.6.1.Final



/**
 * ResearchSubject generated by hbm2java
 */
public class ResearchSubject implements java.io.Serializable extends Resource{


	private static final long serialVersionUID = 1L;


     private String id;
     private String rsrchSbjctActualArm;
     private String rsrchSbjctAssignedArm;
     private String rsrchSbjctCnsnt;
     private String rsrchSbjctIdAssigner;
     private String rsrchSbjctIdPrdEnd;
     private String rsrchSbjctIdPrdStrt;
     private String rsrchSbjctIdSys;
     private String rsrchSbjctIdTypCdgCd;
     private String rsrchSbjctIdTypCdgDsply;
     private String rsrchSbjctIdTypCdgSys;
     private String rsrchSbjctIdTypCdgUsrSltd;
     private String rsrchSbjctIdTypCdgVrsn;
     private String rsrchSbjctIdTypTxt;
     private String rsrchSbjctIdUse;
     private String rsrchSbjctIdVl;
     private String rsrchSbjctIndividual;
     private String rsrchSbjctPrdEnd;
     private String rsrchSbjctPrdStrt;
     private String rsrchSbjctSts;
     private String rsrchSbjctStdy;

    public ResearchSubject() {
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
    
    
    
    public String getRsrchSbjctActualArm() {
        return this.rsrchSbjctActualArm;
    }
    
    public void setRsrchSbjctActualArm(String rsrchSbjctActualArm) {
        this.rsrchSbjctActualArm = rsrchSbjctActualArm;
    }
    
    public void addRsrchSbjctActualArm(String rsrchSbjctActualArm) {
    	if( rsrchSbjctActualArm != null ) {
	    	if( this.rsrchSbjctActualArm == null ) {
	        	this.rsrchSbjctActualArm = rsrchSbjctActualArm;
	        } else if(this.rsrchSbjctActualArm.substring(this.rsrchSbjctActualArm.length() - 1).equals("]") & rsrchSbjctActualArm.equals("[")) {
	        	this.rsrchSbjctActualArm = this.rsrchSbjctActualArm+ "," + rsrchSbjctActualArm;
	        } else if(rsrchSbjctActualArm.equals("[") | rsrchSbjctActualArm.equals("]") | this.rsrchSbjctActualArm.substring(this.rsrchSbjctActualArm.length() - 1).equals("[")) {
	        	this.rsrchSbjctActualArm = this.rsrchSbjctActualArm+rsrchSbjctActualArm;
	        } else  {
	            this.rsrchSbjctActualArm = this.rsrchSbjctActualArm+ "," +rsrchSbjctActualArm;
	        }
        }
    }
    
    
    
    public String getRsrchSbjctAssignedArm() {
        return this.rsrchSbjctAssignedArm;
    }
    
    public void setRsrchSbjctAssignedArm(String rsrchSbjctAssignedArm) {
        this.rsrchSbjctAssignedArm = rsrchSbjctAssignedArm;
    }
    
    public void addRsrchSbjctAssignedArm(String rsrchSbjctAssignedArm) {
    	if( rsrchSbjctAssignedArm != null ) {
	    	if( this.rsrchSbjctAssignedArm == null ) {
	        	this.rsrchSbjctAssignedArm = rsrchSbjctAssignedArm;
	        } else if(this.rsrchSbjctAssignedArm.substring(this.rsrchSbjctAssignedArm.length() - 1).equals("]") & rsrchSbjctAssignedArm.equals("[")) {
	        	this.rsrchSbjctAssignedArm = this.rsrchSbjctAssignedArm+ "," + rsrchSbjctAssignedArm;
	        } else if(rsrchSbjctAssignedArm.equals("[") | rsrchSbjctAssignedArm.equals("]") | this.rsrchSbjctAssignedArm.substring(this.rsrchSbjctAssignedArm.length() - 1).equals("[")) {
	        	this.rsrchSbjctAssignedArm = this.rsrchSbjctAssignedArm+rsrchSbjctAssignedArm;
	        } else  {
	            this.rsrchSbjctAssignedArm = this.rsrchSbjctAssignedArm+ "," +rsrchSbjctAssignedArm;
	        }
        }
    }
    
    
    
    public String getRsrchSbjctCnsnt() {
        return this.rsrchSbjctCnsnt;
    }
    
    public void setRsrchSbjctCnsnt(String rsrchSbjctCnsnt) {
        this.rsrchSbjctCnsnt = rsrchSbjctCnsnt;
    }
    
    public void addRsrchSbjctCnsnt(String rsrchSbjctCnsnt) {
    	if( rsrchSbjctCnsnt != null ) {
	    	if( this.rsrchSbjctCnsnt == null ) {
	        	this.rsrchSbjctCnsnt = rsrchSbjctCnsnt;
	        } else if(this.rsrchSbjctCnsnt.substring(this.rsrchSbjctCnsnt.length() - 1).equals("]") & rsrchSbjctCnsnt.equals("[")) {
	        	this.rsrchSbjctCnsnt = this.rsrchSbjctCnsnt+ "," + rsrchSbjctCnsnt;
	        } else if(rsrchSbjctCnsnt.equals("[") | rsrchSbjctCnsnt.equals("]") | this.rsrchSbjctCnsnt.substring(this.rsrchSbjctCnsnt.length() - 1).equals("[")) {
	        	this.rsrchSbjctCnsnt = this.rsrchSbjctCnsnt+rsrchSbjctCnsnt;
	        } else  {
	            this.rsrchSbjctCnsnt = this.rsrchSbjctCnsnt+ "," +rsrchSbjctCnsnt;
	        }
        }
    }
    
    
    
    public String getRsrchSbjctIdAssigner() {
        return this.rsrchSbjctIdAssigner;
    }
    
    public void setRsrchSbjctIdAssigner(String rsrchSbjctIdAssigner) {
        this.rsrchSbjctIdAssigner = rsrchSbjctIdAssigner;
    }
    
    public void addRsrchSbjctIdAssigner(String rsrchSbjctIdAssigner) {
    	if( rsrchSbjctIdAssigner != null ) {
	    	if( this.rsrchSbjctIdAssigner == null ) {
	        	this.rsrchSbjctIdAssigner = rsrchSbjctIdAssigner;
	        } else if(this.rsrchSbjctIdAssigner.substring(this.rsrchSbjctIdAssigner.length() - 1).equals("]") & rsrchSbjctIdAssigner.equals("[")) {
	        	this.rsrchSbjctIdAssigner = this.rsrchSbjctIdAssigner+ "," + rsrchSbjctIdAssigner;
	        } else if(rsrchSbjctIdAssigner.equals("[") | rsrchSbjctIdAssigner.equals("]") | this.rsrchSbjctIdAssigner.substring(this.rsrchSbjctIdAssigner.length() - 1).equals("[")) {
	        	this.rsrchSbjctIdAssigner = this.rsrchSbjctIdAssigner+rsrchSbjctIdAssigner;
	        } else  {
	            this.rsrchSbjctIdAssigner = this.rsrchSbjctIdAssigner+ "," +rsrchSbjctIdAssigner;
	        }
        }
    }
    
    
    
    public String getRsrchSbjctIdPrdEnd() {
        return this.rsrchSbjctIdPrdEnd;
    }
    
    public void setRsrchSbjctIdPrdEnd(String rsrchSbjctIdPrdEnd) {
        this.rsrchSbjctIdPrdEnd = rsrchSbjctIdPrdEnd;
    }
    
    public void addRsrchSbjctIdPrdEnd(String rsrchSbjctIdPrdEnd) {
    	if( rsrchSbjctIdPrdEnd != null ) {
	    	if( this.rsrchSbjctIdPrdEnd == null ) {
	        	this.rsrchSbjctIdPrdEnd = rsrchSbjctIdPrdEnd;
	        } else if(this.rsrchSbjctIdPrdEnd.substring(this.rsrchSbjctIdPrdEnd.length() - 1).equals("]") & rsrchSbjctIdPrdEnd.equals("[")) {
	        	this.rsrchSbjctIdPrdEnd = this.rsrchSbjctIdPrdEnd+ "," + rsrchSbjctIdPrdEnd;
	        } else if(rsrchSbjctIdPrdEnd.equals("[") | rsrchSbjctIdPrdEnd.equals("]") | this.rsrchSbjctIdPrdEnd.substring(this.rsrchSbjctIdPrdEnd.length() - 1).equals("[")) {
	        	this.rsrchSbjctIdPrdEnd = this.rsrchSbjctIdPrdEnd+rsrchSbjctIdPrdEnd;
	        } else  {
	            this.rsrchSbjctIdPrdEnd = this.rsrchSbjctIdPrdEnd+ "," +rsrchSbjctIdPrdEnd;
	        }
        }
    }
    
    
    
    public String getRsrchSbjctIdPrdStrt() {
        return this.rsrchSbjctIdPrdStrt;
    }
    
    public void setRsrchSbjctIdPrdStrt(String rsrchSbjctIdPrdStrt) {
        this.rsrchSbjctIdPrdStrt = rsrchSbjctIdPrdStrt;
    }
    
    public void addRsrchSbjctIdPrdStrt(String rsrchSbjctIdPrdStrt) {
    	if( rsrchSbjctIdPrdStrt != null ) {
	    	if( this.rsrchSbjctIdPrdStrt == null ) {
	        	this.rsrchSbjctIdPrdStrt = rsrchSbjctIdPrdStrt;
	        } else if(this.rsrchSbjctIdPrdStrt.substring(this.rsrchSbjctIdPrdStrt.length() - 1).equals("]") & rsrchSbjctIdPrdStrt.equals("[")) {
	        	this.rsrchSbjctIdPrdStrt = this.rsrchSbjctIdPrdStrt+ "," + rsrchSbjctIdPrdStrt;
	        } else if(rsrchSbjctIdPrdStrt.equals("[") | rsrchSbjctIdPrdStrt.equals("]") | this.rsrchSbjctIdPrdStrt.substring(this.rsrchSbjctIdPrdStrt.length() - 1).equals("[")) {
	        	this.rsrchSbjctIdPrdStrt = this.rsrchSbjctIdPrdStrt+rsrchSbjctIdPrdStrt;
	        } else  {
	            this.rsrchSbjctIdPrdStrt = this.rsrchSbjctIdPrdStrt+ "," +rsrchSbjctIdPrdStrt;
	        }
        }
    }
    
    
    
    public String getRsrchSbjctIdSys() {
        return this.rsrchSbjctIdSys;
    }
    
    public void setRsrchSbjctIdSys(String rsrchSbjctIdSys) {
        this.rsrchSbjctIdSys = rsrchSbjctIdSys;
    }
    
    public void addRsrchSbjctIdSys(String rsrchSbjctIdSys) {
    	if( rsrchSbjctIdSys != null ) {
	    	if( this.rsrchSbjctIdSys == null ) {
	        	this.rsrchSbjctIdSys = rsrchSbjctIdSys;
	        } else if(this.rsrchSbjctIdSys.substring(this.rsrchSbjctIdSys.length() - 1).equals("]") & rsrchSbjctIdSys.equals("[")) {
	        	this.rsrchSbjctIdSys = this.rsrchSbjctIdSys+ "," + rsrchSbjctIdSys;
	        } else if(rsrchSbjctIdSys.equals("[") | rsrchSbjctIdSys.equals("]") | this.rsrchSbjctIdSys.substring(this.rsrchSbjctIdSys.length() - 1).equals("[")) {
	        	this.rsrchSbjctIdSys = this.rsrchSbjctIdSys+rsrchSbjctIdSys;
	        } else  {
	            this.rsrchSbjctIdSys = this.rsrchSbjctIdSys+ "," +rsrchSbjctIdSys;
	        }
        }
    }
    
    
    
    public String getRsrchSbjctIdTypCdgCd() {
        return this.rsrchSbjctIdTypCdgCd;
    }
    
    public void setRsrchSbjctIdTypCdgCd(String rsrchSbjctIdTypCdgCd) {
        this.rsrchSbjctIdTypCdgCd = rsrchSbjctIdTypCdgCd;
    }
    
    public void addRsrchSbjctIdTypCdgCd(String rsrchSbjctIdTypCdgCd) {
    	if( rsrchSbjctIdTypCdgCd != null ) {
	    	if( this.rsrchSbjctIdTypCdgCd == null ) {
	        	this.rsrchSbjctIdTypCdgCd = rsrchSbjctIdTypCdgCd;
	        } else if(this.rsrchSbjctIdTypCdgCd.substring(this.rsrchSbjctIdTypCdgCd.length() - 1).equals("]") & rsrchSbjctIdTypCdgCd.equals("[")) {
	        	this.rsrchSbjctIdTypCdgCd = this.rsrchSbjctIdTypCdgCd+ "," + rsrchSbjctIdTypCdgCd;
	        } else if(rsrchSbjctIdTypCdgCd.equals("[") | rsrchSbjctIdTypCdgCd.equals("]") | this.rsrchSbjctIdTypCdgCd.substring(this.rsrchSbjctIdTypCdgCd.length() - 1).equals("[")) {
	        	this.rsrchSbjctIdTypCdgCd = this.rsrchSbjctIdTypCdgCd+rsrchSbjctIdTypCdgCd;
	        } else  {
	            this.rsrchSbjctIdTypCdgCd = this.rsrchSbjctIdTypCdgCd+ "," +rsrchSbjctIdTypCdgCd;
	        }
        }
    }
    
    
    
    public String getRsrchSbjctIdTypCdgDsply() {
        return this.rsrchSbjctIdTypCdgDsply;
    }
    
    public void setRsrchSbjctIdTypCdgDsply(String rsrchSbjctIdTypCdgDsply) {
        this.rsrchSbjctIdTypCdgDsply = rsrchSbjctIdTypCdgDsply;
    }
    
    public void addRsrchSbjctIdTypCdgDsply(String rsrchSbjctIdTypCdgDsply) {
    	if( rsrchSbjctIdTypCdgDsply != null ) {
	    	if( this.rsrchSbjctIdTypCdgDsply == null ) {
	        	this.rsrchSbjctIdTypCdgDsply = rsrchSbjctIdTypCdgDsply;
	        } else if(this.rsrchSbjctIdTypCdgDsply.substring(this.rsrchSbjctIdTypCdgDsply.length() - 1).equals("]") & rsrchSbjctIdTypCdgDsply.equals("[")) {
	        	this.rsrchSbjctIdTypCdgDsply = this.rsrchSbjctIdTypCdgDsply+ "," + rsrchSbjctIdTypCdgDsply;
	        } else if(rsrchSbjctIdTypCdgDsply.equals("[") | rsrchSbjctIdTypCdgDsply.equals("]") | this.rsrchSbjctIdTypCdgDsply.substring(this.rsrchSbjctIdTypCdgDsply.length() - 1).equals("[")) {
	        	this.rsrchSbjctIdTypCdgDsply = this.rsrchSbjctIdTypCdgDsply+rsrchSbjctIdTypCdgDsply;
	        } else  {
	            this.rsrchSbjctIdTypCdgDsply = this.rsrchSbjctIdTypCdgDsply+ "," +rsrchSbjctIdTypCdgDsply;
	        }
        }
    }
    
    
    
    public String getRsrchSbjctIdTypCdgSys() {
        return this.rsrchSbjctIdTypCdgSys;
    }
    
    public void setRsrchSbjctIdTypCdgSys(String rsrchSbjctIdTypCdgSys) {
        this.rsrchSbjctIdTypCdgSys = rsrchSbjctIdTypCdgSys;
    }
    
    public void addRsrchSbjctIdTypCdgSys(String rsrchSbjctIdTypCdgSys) {
    	if( rsrchSbjctIdTypCdgSys != null ) {
	    	if( this.rsrchSbjctIdTypCdgSys == null ) {
	        	this.rsrchSbjctIdTypCdgSys = rsrchSbjctIdTypCdgSys;
	        } else if(this.rsrchSbjctIdTypCdgSys.substring(this.rsrchSbjctIdTypCdgSys.length() - 1).equals("]") & rsrchSbjctIdTypCdgSys.equals("[")) {
	        	this.rsrchSbjctIdTypCdgSys = this.rsrchSbjctIdTypCdgSys+ "," + rsrchSbjctIdTypCdgSys;
	        } else if(rsrchSbjctIdTypCdgSys.equals("[") | rsrchSbjctIdTypCdgSys.equals("]") | this.rsrchSbjctIdTypCdgSys.substring(this.rsrchSbjctIdTypCdgSys.length() - 1).equals("[")) {
	        	this.rsrchSbjctIdTypCdgSys = this.rsrchSbjctIdTypCdgSys+rsrchSbjctIdTypCdgSys;
	        } else  {
	            this.rsrchSbjctIdTypCdgSys = this.rsrchSbjctIdTypCdgSys+ "," +rsrchSbjctIdTypCdgSys;
	        }
        }
    }
    
    
    
    public String getRsrchSbjctIdTypCdgUsrSltd() {
        return this.rsrchSbjctIdTypCdgUsrSltd;
    }
    
    public void setRsrchSbjctIdTypCdgUsrSltd(String rsrchSbjctIdTypCdgUsrSltd) {
        this.rsrchSbjctIdTypCdgUsrSltd = rsrchSbjctIdTypCdgUsrSltd;
    }
    
    public void addRsrchSbjctIdTypCdgUsrSltd(String rsrchSbjctIdTypCdgUsrSltd) {
    	if( rsrchSbjctIdTypCdgUsrSltd != null ) {
	    	if( this.rsrchSbjctIdTypCdgUsrSltd == null ) {
	        	this.rsrchSbjctIdTypCdgUsrSltd = rsrchSbjctIdTypCdgUsrSltd;
	        } else if(this.rsrchSbjctIdTypCdgUsrSltd.substring(this.rsrchSbjctIdTypCdgUsrSltd.length() - 1).equals("]") & rsrchSbjctIdTypCdgUsrSltd.equals("[")) {
	        	this.rsrchSbjctIdTypCdgUsrSltd = this.rsrchSbjctIdTypCdgUsrSltd+ "," + rsrchSbjctIdTypCdgUsrSltd;
	        } else if(rsrchSbjctIdTypCdgUsrSltd.equals("[") | rsrchSbjctIdTypCdgUsrSltd.equals("]") | this.rsrchSbjctIdTypCdgUsrSltd.substring(this.rsrchSbjctIdTypCdgUsrSltd.length() - 1).equals("[")) {
	        	this.rsrchSbjctIdTypCdgUsrSltd = this.rsrchSbjctIdTypCdgUsrSltd+rsrchSbjctIdTypCdgUsrSltd;
	        } else  {
	            this.rsrchSbjctIdTypCdgUsrSltd = this.rsrchSbjctIdTypCdgUsrSltd+ "," +rsrchSbjctIdTypCdgUsrSltd;
	        }
        }
    }
    
    
    
    public String getRsrchSbjctIdTypCdgVrsn() {
        return this.rsrchSbjctIdTypCdgVrsn;
    }
    
    public void setRsrchSbjctIdTypCdgVrsn(String rsrchSbjctIdTypCdgVrsn) {
        this.rsrchSbjctIdTypCdgVrsn = rsrchSbjctIdTypCdgVrsn;
    }
    
    public void addRsrchSbjctIdTypCdgVrsn(String rsrchSbjctIdTypCdgVrsn) {
    	if( rsrchSbjctIdTypCdgVrsn != null ) {
	    	if( this.rsrchSbjctIdTypCdgVrsn == null ) {
	        	this.rsrchSbjctIdTypCdgVrsn = rsrchSbjctIdTypCdgVrsn;
	        } else if(this.rsrchSbjctIdTypCdgVrsn.substring(this.rsrchSbjctIdTypCdgVrsn.length() - 1).equals("]") & rsrchSbjctIdTypCdgVrsn.equals("[")) {
	        	this.rsrchSbjctIdTypCdgVrsn = this.rsrchSbjctIdTypCdgVrsn+ "," + rsrchSbjctIdTypCdgVrsn;
	        } else if(rsrchSbjctIdTypCdgVrsn.equals("[") | rsrchSbjctIdTypCdgVrsn.equals("]") | this.rsrchSbjctIdTypCdgVrsn.substring(this.rsrchSbjctIdTypCdgVrsn.length() - 1).equals("[")) {
	        	this.rsrchSbjctIdTypCdgVrsn = this.rsrchSbjctIdTypCdgVrsn+rsrchSbjctIdTypCdgVrsn;
	        } else  {
	            this.rsrchSbjctIdTypCdgVrsn = this.rsrchSbjctIdTypCdgVrsn+ "," +rsrchSbjctIdTypCdgVrsn;
	        }
        }
    }
    
    
    
    public String getRsrchSbjctIdTypTxt() {
        return this.rsrchSbjctIdTypTxt;
    }
    
    public void setRsrchSbjctIdTypTxt(String rsrchSbjctIdTypTxt) {
        this.rsrchSbjctIdTypTxt = rsrchSbjctIdTypTxt;
    }
    
    public void addRsrchSbjctIdTypTxt(String rsrchSbjctIdTypTxt) {
    	if( rsrchSbjctIdTypTxt != null ) {
	    	if( this.rsrchSbjctIdTypTxt == null ) {
	        	this.rsrchSbjctIdTypTxt = rsrchSbjctIdTypTxt;
	        } else if(this.rsrchSbjctIdTypTxt.substring(this.rsrchSbjctIdTypTxt.length() - 1).equals("]") & rsrchSbjctIdTypTxt.equals("[")) {
	        	this.rsrchSbjctIdTypTxt = this.rsrchSbjctIdTypTxt+ "," + rsrchSbjctIdTypTxt;
	        } else if(rsrchSbjctIdTypTxt.equals("[") | rsrchSbjctIdTypTxt.equals("]") | this.rsrchSbjctIdTypTxt.substring(this.rsrchSbjctIdTypTxt.length() - 1).equals("[")) {
	        	this.rsrchSbjctIdTypTxt = this.rsrchSbjctIdTypTxt+rsrchSbjctIdTypTxt;
	        } else  {
	            this.rsrchSbjctIdTypTxt = this.rsrchSbjctIdTypTxt+ "," +rsrchSbjctIdTypTxt;
	        }
        }
    }
    
    
    
    public String getRsrchSbjctIdUse() {
        return this.rsrchSbjctIdUse;
    }
    
    public void setRsrchSbjctIdUse(String rsrchSbjctIdUse) {
        this.rsrchSbjctIdUse = rsrchSbjctIdUse;
    }
    
    public void addRsrchSbjctIdUse(String rsrchSbjctIdUse) {
    	if( rsrchSbjctIdUse != null ) {
	    	if( this.rsrchSbjctIdUse == null ) {
	        	this.rsrchSbjctIdUse = rsrchSbjctIdUse;
	        } else if(this.rsrchSbjctIdUse.substring(this.rsrchSbjctIdUse.length() - 1).equals("]") & rsrchSbjctIdUse.equals("[")) {
	        	this.rsrchSbjctIdUse = this.rsrchSbjctIdUse+ "," + rsrchSbjctIdUse;
	        } else if(rsrchSbjctIdUse.equals("[") | rsrchSbjctIdUse.equals("]") | this.rsrchSbjctIdUse.substring(this.rsrchSbjctIdUse.length() - 1).equals("[")) {
	        	this.rsrchSbjctIdUse = this.rsrchSbjctIdUse+rsrchSbjctIdUse;
	        } else  {
	            this.rsrchSbjctIdUse = this.rsrchSbjctIdUse+ "," +rsrchSbjctIdUse;
	        }
        }
    }
    
    
    
    public String getRsrchSbjctIdVl() {
        return this.rsrchSbjctIdVl;
    }
    
    public void setRsrchSbjctIdVl(String rsrchSbjctIdVl) {
        this.rsrchSbjctIdVl = rsrchSbjctIdVl;
    }
    
    public void addRsrchSbjctIdVl(String rsrchSbjctIdVl) {
    	if( rsrchSbjctIdVl != null ) {
	    	if( this.rsrchSbjctIdVl == null ) {
	        	this.rsrchSbjctIdVl = rsrchSbjctIdVl;
	        } else if(this.rsrchSbjctIdVl.substring(this.rsrchSbjctIdVl.length() - 1).equals("]") & rsrchSbjctIdVl.equals("[")) {
	        	this.rsrchSbjctIdVl = this.rsrchSbjctIdVl+ "," + rsrchSbjctIdVl;
	        } else if(rsrchSbjctIdVl.equals("[") | rsrchSbjctIdVl.equals("]") | this.rsrchSbjctIdVl.substring(this.rsrchSbjctIdVl.length() - 1).equals("[")) {
	        	this.rsrchSbjctIdVl = this.rsrchSbjctIdVl+rsrchSbjctIdVl;
	        } else  {
	            this.rsrchSbjctIdVl = this.rsrchSbjctIdVl+ "," +rsrchSbjctIdVl;
	        }
        }
    }
    
    
    
    public String getRsrchSbjctIndividual() {
        return this.rsrchSbjctIndividual;
    }
    
    public void setRsrchSbjctIndividual(String rsrchSbjctIndividual) {
        this.rsrchSbjctIndividual = rsrchSbjctIndividual;
    }
    
    public void addRsrchSbjctIndividual(String rsrchSbjctIndividual) {
    	if( rsrchSbjctIndividual != null ) {
	    	if( this.rsrchSbjctIndividual == null ) {
	        	this.rsrchSbjctIndividual = rsrchSbjctIndividual;
	        } else if(this.rsrchSbjctIndividual.substring(this.rsrchSbjctIndividual.length() - 1).equals("]") & rsrchSbjctIndividual.equals("[")) {
	        	this.rsrchSbjctIndividual = this.rsrchSbjctIndividual+ "," + rsrchSbjctIndividual;
	        } else if(rsrchSbjctIndividual.equals("[") | rsrchSbjctIndividual.equals("]") | this.rsrchSbjctIndividual.substring(this.rsrchSbjctIndividual.length() - 1).equals("[")) {
	        	this.rsrchSbjctIndividual = this.rsrchSbjctIndividual+rsrchSbjctIndividual;
	        } else  {
	            this.rsrchSbjctIndividual = this.rsrchSbjctIndividual+ "," +rsrchSbjctIndividual;
	        }
        }
    }
    
    
    
    public String getRsrchSbjctPrdEnd() {
        return this.rsrchSbjctPrdEnd;
    }
    
    public void setRsrchSbjctPrdEnd(String rsrchSbjctPrdEnd) {
        this.rsrchSbjctPrdEnd = rsrchSbjctPrdEnd;
    }
    
    public void addRsrchSbjctPrdEnd(String rsrchSbjctPrdEnd) {
    	if( rsrchSbjctPrdEnd != null ) {
	    	if( this.rsrchSbjctPrdEnd == null ) {
	        	this.rsrchSbjctPrdEnd = rsrchSbjctPrdEnd;
	        } else if(this.rsrchSbjctPrdEnd.substring(this.rsrchSbjctPrdEnd.length() - 1).equals("]") & rsrchSbjctPrdEnd.equals("[")) {
	        	this.rsrchSbjctPrdEnd = this.rsrchSbjctPrdEnd+ "," + rsrchSbjctPrdEnd;
	        } else if(rsrchSbjctPrdEnd.equals("[") | rsrchSbjctPrdEnd.equals("]") | this.rsrchSbjctPrdEnd.substring(this.rsrchSbjctPrdEnd.length() - 1).equals("[")) {
	        	this.rsrchSbjctPrdEnd = this.rsrchSbjctPrdEnd+rsrchSbjctPrdEnd;
	        } else  {
	            this.rsrchSbjctPrdEnd = this.rsrchSbjctPrdEnd+ "," +rsrchSbjctPrdEnd;
	        }
        }
    }
    
    
    
    public String getRsrchSbjctPrdStrt() {
        return this.rsrchSbjctPrdStrt;
    }
    
    public void setRsrchSbjctPrdStrt(String rsrchSbjctPrdStrt) {
        this.rsrchSbjctPrdStrt = rsrchSbjctPrdStrt;
    }
    
    public void addRsrchSbjctPrdStrt(String rsrchSbjctPrdStrt) {
    	if( rsrchSbjctPrdStrt != null ) {
	    	if( this.rsrchSbjctPrdStrt == null ) {
	        	this.rsrchSbjctPrdStrt = rsrchSbjctPrdStrt;
	        } else if(this.rsrchSbjctPrdStrt.substring(this.rsrchSbjctPrdStrt.length() - 1).equals("]") & rsrchSbjctPrdStrt.equals("[")) {
	        	this.rsrchSbjctPrdStrt = this.rsrchSbjctPrdStrt+ "," + rsrchSbjctPrdStrt;
	        } else if(rsrchSbjctPrdStrt.equals("[") | rsrchSbjctPrdStrt.equals("]") | this.rsrchSbjctPrdStrt.substring(this.rsrchSbjctPrdStrt.length() - 1).equals("[")) {
	        	this.rsrchSbjctPrdStrt = this.rsrchSbjctPrdStrt+rsrchSbjctPrdStrt;
	        } else  {
	            this.rsrchSbjctPrdStrt = this.rsrchSbjctPrdStrt+ "," +rsrchSbjctPrdStrt;
	        }
        }
    }
    
    
    
    public String getRsrchSbjctSts() {
        return this.rsrchSbjctSts;
    }
    
    public void setRsrchSbjctSts(String rsrchSbjctSts) {
        this.rsrchSbjctSts = rsrchSbjctSts;
    }
    
    public void addRsrchSbjctSts(String rsrchSbjctSts) {
    	if( rsrchSbjctSts != null ) {
	    	if( this.rsrchSbjctSts == null ) {
	        	this.rsrchSbjctSts = rsrchSbjctSts;
	        } else if(this.rsrchSbjctSts.substring(this.rsrchSbjctSts.length() - 1).equals("]") & rsrchSbjctSts.equals("[")) {
	        	this.rsrchSbjctSts = this.rsrchSbjctSts+ "," + rsrchSbjctSts;
	        } else if(rsrchSbjctSts.equals("[") | rsrchSbjctSts.equals("]") | this.rsrchSbjctSts.substring(this.rsrchSbjctSts.length() - 1).equals("[")) {
	        	this.rsrchSbjctSts = this.rsrchSbjctSts+rsrchSbjctSts;
	        } else  {
	            this.rsrchSbjctSts = this.rsrchSbjctSts+ "," +rsrchSbjctSts;
	        }
        }
    }
    
    
    
    public String getRsrchSbjctStdy() {
        return this.rsrchSbjctStdy;
    }
    
    public void setRsrchSbjctStdy(String rsrchSbjctStdy) {
        this.rsrchSbjctStdy = rsrchSbjctStdy;
    }
    
    public void addRsrchSbjctStdy(String rsrchSbjctStdy) {
    	if( rsrchSbjctStdy != null ) {
	    	if( this.rsrchSbjctStdy == null ) {
	        	this.rsrchSbjctStdy = rsrchSbjctStdy;
	        } else if(this.rsrchSbjctStdy.substring(this.rsrchSbjctStdy.length() - 1).equals("]") & rsrchSbjctStdy.equals("[")) {
	        	this.rsrchSbjctStdy = this.rsrchSbjctStdy+ "," + rsrchSbjctStdy;
	        } else if(rsrchSbjctStdy.equals("[") | rsrchSbjctStdy.equals("]") | this.rsrchSbjctStdy.substring(this.rsrchSbjctStdy.length() - 1).equals("[")) {
	        	this.rsrchSbjctStdy = this.rsrchSbjctStdy+rsrchSbjctStdy;
	        } else  {
	            this.rsrchSbjctStdy = this.rsrchSbjctStdy+ "," +rsrchSbjctStdy;
	        }
        }
    }
    
    
    




}


