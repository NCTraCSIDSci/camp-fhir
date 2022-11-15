// // default package
package main.java.com.campfhir.model;
// Generated Aug 17, 2022, 11:08:48 AM by Hibernate Tools 5.6.1.Final



/**
 * OperationOutcome generated by hbm2java
 */
public class OperationOutcome extends Resource{


	private static final long serialVersionUID = 1L;


     private String id;
     private String oprtnOutcomeIssueCd;
     private String oprtnOutcomeIssueDtlsCdgCd;
     private String oprtnOutcomeIssueDtlsCdgDsply;
     private String oprtnOutcomeIssueDtlsCdgSys;
     private String oprtnOutcomeIssueDtlsCdgUsrSltd;
     private String oprtnOutcomeIssueDtlsCdgVrsn;
     private String oprtnOutcomeIssueDtlsTxt;
     private String oprtnOutcomeIssueDiagnostics;
     private String oprtnOutcomeIssueExprsn;
     private String oprtnOutcomeIssueLctn;
     private String oprtnOutcomeIssueSeverity;

    public OperationOutcome() {
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
    
    
    
    public String getOprtnOutcomeIssueCd() {
        return this.oprtnOutcomeIssueCd;
    }
    
    public void setOprtnOutcomeIssueCd(String oprtnOutcomeIssueCd) {
        this.oprtnOutcomeIssueCd = oprtnOutcomeIssueCd;
    }
    
    public void addOprtnOutcomeIssueCd(String oprtnOutcomeIssueCd) {
    	if( oprtnOutcomeIssueCd != null ) {
	    	if( this.oprtnOutcomeIssueCd == null ) {
	        	this.oprtnOutcomeIssueCd = oprtnOutcomeIssueCd;
	        } else if(this.oprtnOutcomeIssueCd.substring(this.oprtnOutcomeIssueCd.length() - 1).equals("]") & oprtnOutcomeIssueCd.equals("[")) {
	        	this.oprtnOutcomeIssueCd = this.oprtnOutcomeIssueCd+ "," + oprtnOutcomeIssueCd;
	        } else if(oprtnOutcomeIssueCd.equals("[") | oprtnOutcomeIssueCd.equals("]") | this.oprtnOutcomeIssueCd.substring(this.oprtnOutcomeIssueCd.length() - 1).equals("[")) {
	        	this.oprtnOutcomeIssueCd = this.oprtnOutcomeIssueCd+oprtnOutcomeIssueCd;
	        } else  {
	            this.oprtnOutcomeIssueCd = this.oprtnOutcomeIssueCd+ "," +oprtnOutcomeIssueCd;
	        }
        }
    }
    
    
    
    public String getOprtnOutcomeIssueDtlsCdgCd() {
        return this.oprtnOutcomeIssueDtlsCdgCd;
    }
    
    public void setOprtnOutcomeIssueDtlsCdgCd(String oprtnOutcomeIssueDtlsCdgCd) {
        this.oprtnOutcomeIssueDtlsCdgCd = oprtnOutcomeIssueDtlsCdgCd;
    }
    
    public void addOprtnOutcomeIssueDtlsCdgCd(String oprtnOutcomeIssueDtlsCdgCd) {
    	if( oprtnOutcomeIssueDtlsCdgCd != null ) {
	    	if( this.oprtnOutcomeIssueDtlsCdgCd == null ) {
	        	this.oprtnOutcomeIssueDtlsCdgCd = oprtnOutcomeIssueDtlsCdgCd;
	        } else if(this.oprtnOutcomeIssueDtlsCdgCd.substring(this.oprtnOutcomeIssueDtlsCdgCd.length() - 1).equals("]") & oprtnOutcomeIssueDtlsCdgCd.equals("[")) {
	        	this.oprtnOutcomeIssueDtlsCdgCd = this.oprtnOutcomeIssueDtlsCdgCd+ "," + oprtnOutcomeIssueDtlsCdgCd;
	        } else if(oprtnOutcomeIssueDtlsCdgCd.equals("[") | oprtnOutcomeIssueDtlsCdgCd.equals("]") | this.oprtnOutcomeIssueDtlsCdgCd.substring(this.oprtnOutcomeIssueDtlsCdgCd.length() - 1).equals("[")) {
	        	this.oprtnOutcomeIssueDtlsCdgCd = this.oprtnOutcomeIssueDtlsCdgCd+oprtnOutcomeIssueDtlsCdgCd;
	        } else  {
	            this.oprtnOutcomeIssueDtlsCdgCd = this.oprtnOutcomeIssueDtlsCdgCd+ "," +oprtnOutcomeIssueDtlsCdgCd;
	        }
        }
    }
    
    
    
    public String getOprtnOutcomeIssueDtlsCdgDsply() {
        return this.oprtnOutcomeIssueDtlsCdgDsply;
    }
    
    public void setOprtnOutcomeIssueDtlsCdgDsply(String oprtnOutcomeIssueDtlsCdgDsply) {
        this.oprtnOutcomeIssueDtlsCdgDsply = oprtnOutcomeIssueDtlsCdgDsply;
    }
    
    public void addOprtnOutcomeIssueDtlsCdgDsply(String oprtnOutcomeIssueDtlsCdgDsply) {
    	if( oprtnOutcomeIssueDtlsCdgDsply != null ) {
	    	if( this.oprtnOutcomeIssueDtlsCdgDsply == null ) {
	        	this.oprtnOutcomeIssueDtlsCdgDsply = oprtnOutcomeIssueDtlsCdgDsply;
	        } else if(this.oprtnOutcomeIssueDtlsCdgDsply.substring(this.oprtnOutcomeIssueDtlsCdgDsply.length() - 1).equals("]") & oprtnOutcomeIssueDtlsCdgDsply.equals("[")) {
	        	this.oprtnOutcomeIssueDtlsCdgDsply = this.oprtnOutcomeIssueDtlsCdgDsply+ "," + oprtnOutcomeIssueDtlsCdgDsply;
	        } else if(oprtnOutcomeIssueDtlsCdgDsply.equals("[") | oprtnOutcomeIssueDtlsCdgDsply.equals("]") | this.oprtnOutcomeIssueDtlsCdgDsply.substring(this.oprtnOutcomeIssueDtlsCdgDsply.length() - 1).equals("[")) {
	        	this.oprtnOutcomeIssueDtlsCdgDsply = this.oprtnOutcomeIssueDtlsCdgDsply+oprtnOutcomeIssueDtlsCdgDsply;
	        } else  {
	            this.oprtnOutcomeIssueDtlsCdgDsply = this.oprtnOutcomeIssueDtlsCdgDsply+ "," +oprtnOutcomeIssueDtlsCdgDsply;
	        }
        }
    }
    
    
    
    public String getOprtnOutcomeIssueDtlsCdgSys() {
        return this.oprtnOutcomeIssueDtlsCdgSys;
    }
    
    public void setOprtnOutcomeIssueDtlsCdgSys(String oprtnOutcomeIssueDtlsCdgSys) {
        this.oprtnOutcomeIssueDtlsCdgSys = oprtnOutcomeIssueDtlsCdgSys;
    }
    
    public void addOprtnOutcomeIssueDtlsCdgSys(String oprtnOutcomeIssueDtlsCdgSys) {
    	if( oprtnOutcomeIssueDtlsCdgSys != null ) {
	    	if( this.oprtnOutcomeIssueDtlsCdgSys == null ) {
	        	this.oprtnOutcomeIssueDtlsCdgSys = oprtnOutcomeIssueDtlsCdgSys;
	        } else if(this.oprtnOutcomeIssueDtlsCdgSys.substring(this.oprtnOutcomeIssueDtlsCdgSys.length() - 1).equals("]") & oprtnOutcomeIssueDtlsCdgSys.equals("[")) {
	        	this.oprtnOutcomeIssueDtlsCdgSys = this.oprtnOutcomeIssueDtlsCdgSys+ "," + oprtnOutcomeIssueDtlsCdgSys;
	        } else if(oprtnOutcomeIssueDtlsCdgSys.equals("[") | oprtnOutcomeIssueDtlsCdgSys.equals("]") | this.oprtnOutcomeIssueDtlsCdgSys.substring(this.oprtnOutcomeIssueDtlsCdgSys.length() - 1).equals("[")) {
	        	this.oprtnOutcomeIssueDtlsCdgSys = this.oprtnOutcomeIssueDtlsCdgSys+oprtnOutcomeIssueDtlsCdgSys;
	        } else  {
	            this.oprtnOutcomeIssueDtlsCdgSys = this.oprtnOutcomeIssueDtlsCdgSys+ "," +oprtnOutcomeIssueDtlsCdgSys;
	        }
        }
    }
    
    
    
    public String getOprtnOutcomeIssueDtlsCdgUsrSltd() {
        return this.oprtnOutcomeIssueDtlsCdgUsrSltd;
    }
    
    public void setOprtnOutcomeIssueDtlsCdgUsrSltd(String oprtnOutcomeIssueDtlsCdgUsrSltd) {
        this.oprtnOutcomeIssueDtlsCdgUsrSltd = oprtnOutcomeIssueDtlsCdgUsrSltd;
    }
    
    public void addOprtnOutcomeIssueDtlsCdgUsrSltd(String oprtnOutcomeIssueDtlsCdgUsrSltd) {
    	if( oprtnOutcomeIssueDtlsCdgUsrSltd != null ) {
	    	if( this.oprtnOutcomeIssueDtlsCdgUsrSltd == null ) {
	        	this.oprtnOutcomeIssueDtlsCdgUsrSltd = oprtnOutcomeIssueDtlsCdgUsrSltd;
	        } else if(this.oprtnOutcomeIssueDtlsCdgUsrSltd.substring(this.oprtnOutcomeIssueDtlsCdgUsrSltd.length() - 1).equals("]") & oprtnOutcomeIssueDtlsCdgUsrSltd.equals("[")) {
	        	this.oprtnOutcomeIssueDtlsCdgUsrSltd = this.oprtnOutcomeIssueDtlsCdgUsrSltd+ "," + oprtnOutcomeIssueDtlsCdgUsrSltd;
	        } else if(oprtnOutcomeIssueDtlsCdgUsrSltd.equals("[") | oprtnOutcomeIssueDtlsCdgUsrSltd.equals("]") | this.oprtnOutcomeIssueDtlsCdgUsrSltd.substring(this.oprtnOutcomeIssueDtlsCdgUsrSltd.length() - 1).equals("[")) {
	        	this.oprtnOutcomeIssueDtlsCdgUsrSltd = this.oprtnOutcomeIssueDtlsCdgUsrSltd+oprtnOutcomeIssueDtlsCdgUsrSltd;
	        } else  {
	            this.oprtnOutcomeIssueDtlsCdgUsrSltd = this.oprtnOutcomeIssueDtlsCdgUsrSltd+ "," +oprtnOutcomeIssueDtlsCdgUsrSltd;
	        }
        }
    }
    
    
    
    public String getOprtnOutcomeIssueDtlsCdgVrsn() {
        return this.oprtnOutcomeIssueDtlsCdgVrsn;
    }
    
    public void setOprtnOutcomeIssueDtlsCdgVrsn(String oprtnOutcomeIssueDtlsCdgVrsn) {
        this.oprtnOutcomeIssueDtlsCdgVrsn = oprtnOutcomeIssueDtlsCdgVrsn;
    }
    
    public void addOprtnOutcomeIssueDtlsCdgVrsn(String oprtnOutcomeIssueDtlsCdgVrsn) {
    	if( oprtnOutcomeIssueDtlsCdgVrsn != null ) {
	    	if( this.oprtnOutcomeIssueDtlsCdgVrsn == null ) {
	        	this.oprtnOutcomeIssueDtlsCdgVrsn = oprtnOutcomeIssueDtlsCdgVrsn;
	        } else if(this.oprtnOutcomeIssueDtlsCdgVrsn.substring(this.oprtnOutcomeIssueDtlsCdgVrsn.length() - 1).equals("]") & oprtnOutcomeIssueDtlsCdgVrsn.equals("[")) {
	        	this.oprtnOutcomeIssueDtlsCdgVrsn = this.oprtnOutcomeIssueDtlsCdgVrsn+ "," + oprtnOutcomeIssueDtlsCdgVrsn;
	        } else if(oprtnOutcomeIssueDtlsCdgVrsn.equals("[") | oprtnOutcomeIssueDtlsCdgVrsn.equals("]") | this.oprtnOutcomeIssueDtlsCdgVrsn.substring(this.oprtnOutcomeIssueDtlsCdgVrsn.length() - 1).equals("[")) {
	        	this.oprtnOutcomeIssueDtlsCdgVrsn = this.oprtnOutcomeIssueDtlsCdgVrsn+oprtnOutcomeIssueDtlsCdgVrsn;
	        } else  {
	            this.oprtnOutcomeIssueDtlsCdgVrsn = this.oprtnOutcomeIssueDtlsCdgVrsn+ "," +oprtnOutcomeIssueDtlsCdgVrsn;
	        }
        }
    }
    
    
    
    public String getOprtnOutcomeIssueDtlsTxt() {
        return this.oprtnOutcomeIssueDtlsTxt;
    }
    
    public void setOprtnOutcomeIssueDtlsTxt(String oprtnOutcomeIssueDtlsTxt) {
        this.oprtnOutcomeIssueDtlsTxt = oprtnOutcomeIssueDtlsTxt;
    }
    
    public void addOprtnOutcomeIssueDtlsTxt(String oprtnOutcomeIssueDtlsTxt) {
    	if( oprtnOutcomeIssueDtlsTxt != null ) {
	    	if( this.oprtnOutcomeIssueDtlsTxt == null ) {
	        	this.oprtnOutcomeIssueDtlsTxt = oprtnOutcomeIssueDtlsTxt;
	        } else if(this.oprtnOutcomeIssueDtlsTxt.substring(this.oprtnOutcomeIssueDtlsTxt.length() - 1).equals("]") & oprtnOutcomeIssueDtlsTxt.equals("[")) {
	        	this.oprtnOutcomeIssueDtlsTxt = this.oprtnOutcomeIssueDtlsTxt+ "," + oprtnOutcomeIssueDtlsTxt;
	        } else if(oprtnOutcomeIssueDtlsTxt.equals("[") | oprtnOutcomeIssueDtlsTxt.equals("]") | this.oprtnOutcomeIssueDtlsTxt.substring(this.oprtnOutcomeIssueDtlsTxt.length() - 1).equals("[")) {
	        	this.oprtnOutcomeIssueDtlsTxt = this.oprtnOutcomeIssueDtlsTxt+oprtnOutcomeIssueDtlsTxt;
	        } else  {
	            this.oprtnOutcomeIssueDtlsTxt = this.oprtnOutcomeIssueDtlsTxt+ "," +oprtnOutcomeIssueDtlsTxt;
	        }
        }
    }
    
    
    
    public String getOprtnOutcomeIssueDiagnostics() {
        return this.oprtnOutcomeIssueDiagnostics;
    }
    
    public void setOprtnOutcomeIssueDiagnostics(String oprtnOutcomeIssueDiagnostics) {
        this.oprtnOutcomeIssueDiagnostics = oprtnOutcomeIssueDiagnostics;
    }
    
    public void addOprtnOutcomeIssueDiagnostics(String oprtnOutcomeIssueDiagnostics) {
    	if( oprtnOutcomeIssueDiagnostics != null ) {
	    	if( this.oprtnOutcomeIssueDiagnostics == null ) {
	        	this.oprtnOutcomeIssueDiagnostics = oprtnOutcomeIssueDiagnostics;
	        } else if(this.oprtnOutcomeIssueDiagnostics.substring(this.oprtnOutcomeIssueDiagnostics.length() - 1).equals("]") & oprtnOutcomeIssueDiagnostics.equals("[")) {
	        	this.oprtnOutcomeIssueDiagnostics = this.oprtnOutcomeIssueDiagnostics+ "," + oprtnOutcomeIssueDiagnostics;
	        } else if(oprtnOutcomeIssueDiagnostics.equals("[") | oprtnOutcomeIssueDiagnostics.equals("]") | this.oprtnOutcomeIssueDiagnostics.substring(this.oprtnOutcomeIssueDiagnostics.length() - 1).equals("[")) {
	        	this.oprtnOutcomeIssueDiagnostics = this.oprtnOutcomeIssueDiagnostics+oprtnOutcomeIssueDiagnostics;
	        } else  {
	            this.oprtnOutcomeIssueDiagnostics = this.oprtnOutcomeIssueDiagnostics+ "," +oprtnOutcomeIssueDiagnostics;
	        }
        }
    }
    
    
    
    public String getOprtnOutcomeIssueExprsn() {
        return this.oprtnOutcomeIssueExprsn;
    }
    
    public void setOprtnOutcomeIssueExprsn(String oprtnOutcomeIssueExprsn) {
        this.oprtnOutcomeIssueExprsn = oprtnOutcomeIssueExprsn;
    }
    
    public void addOprtnOutcomeIssueExprsn(String oprtnOutcomeIssueExprsn) {
    	if( oprtnOutcomeIssueExprsn != null ) {
	    	if( this.oprtnOutcomeIssueExprsn == null ) {
	        	this.oprtnOutcomeIssueExprsn = oprtnOutcomeIssueExprsn;
	        } else if(this.oprtnOutcomeIssueExprsn.substring(this.oprtnOutcomeIssueExprsn.length() - 1).equals("]") & oprtnOutcomeIssueExprsn.equals("[")) {
	        	this.oprtnOutcomeIssueExprsn = this.oprtnOutcomeIssueExprsn+ "," + oprtnOutcomeIssueExprsn;
	        } else if(oprtnOutcomeIssueExprsn.equals("[") | oprtnOutcomeIssueExprsn.equals("]") | this.oprtnOutcomeIssueExprsn.substring(this.oprtnOutcomeIssueExprsn.length() - 1).equals("[")) {
	        	this.oprtnOutcomeIssueExprsn = this.oprtnOutcomeIssueExprsn+oprtnOutcomeIssueExprsn;
	        } else  {
	            this.oprtnOutcomeIssueExprsn = this.oprtnOutcomeIssueExprsn+ "," +oprtnOutcomeIssueExprsn;
	        }
        }
    }
    
    
    
    public String getOprtnOutcomeIssueLctn() {
        return this.oprtnOutcomeIssueLctn;
    }
    
    public void setOprtnOutcomeIssueLctn(String oprtnOutcomeIssueLctn) {
        this.oprtnOutcomeIssueLctn = oprtnOutcomeIssueLctn;
    }
    
    public void addOprtnOutcomeIssueLctn(String oprtnOutcomeIssueLctn) {
    	if( oprtnOutcomeIssueLctn != null ) {
	    	if( this.oprtnOutcomeIssueLctn == null ) {
	        	this.oprtnOutcomeIssueLctn = oprtnOutcomeIssueLctn;
	        } else if(this.oprtnOutcomeIssueLctn.substring(this.oprtnOutcomeIssueLctn.length() - 1).equals("]") & oprtnOutcomeIssueLctn.equals("[")) {
	        	this.oprtnOutcomeIssueLctn = this.oprtnOutcomeIssueLctn+ "," + oprtnOutcomeIssueLctn;
	        } else if(oprtnOutcomeIssueLctn.equals("[") | oprtnOutcomeIssueLctn.equals("]") | this.oprtnOutcomeIssueLctn.substring(this.oprtnOutcomeIssueLctn.length() - 1).equals("[")) {
	        	this.oprtnOutcomeIssueLctn = this.oprtnOutcomeIssueLctn+oprtnOutcomeIssueLctn;
	        } else  {
	            this.oprtnOutcomeIssueLctn = this.oprtnOutcomeIssueLctn+ "," +oprtnOutcomeIssueLctn;
	        }
        }
    }
    
    
    
    public String getOprtnOutcomeIssueSeverity() {
        return this.oprtnOutcomeIssueSeverity;
    }
    
    public void setOprtnOutcomeIssueSeverity(String oprtnOutcomeIssueSeverity) {
        this.oprtnOutcomeIssueSeverity = oprtnOutcomeIssueSeverity;
    }
    
    public void addOprtnOutcomeIssueSeverity(String oprtnOutcomeIssueSeverity) {
    	if( oprtnOutcomeIssueSeverity != null ) {
	    	if( this.oprtnOutcomeIssueSeverity == null ) {
	        	this.oprtnOutcomeIssueSeverity = oprtnOutcomeIssueSeverity;
	        } else if(this.oprtnOutcomeIssueSeverity.substring(this.oprtnOutcomeIssueSeverity.length() - 1).equals("]") & oprtnOutcomeIssueSeverity.equals("[")) {
	        	this.oprtnOutcomeIssueSeverity = this.oprtnOutcomeIssueSeverity+ "," + oprtnOutcomeIssueSeverity;
	        } else if(oprtnOutcomeIssueSeverity.equals("[") | oprtnOutcomeIssueSeverity.equals("]") | this.oprtnOutcomeIssueSeverity.substring(this.oprtnOutcomeIssueSeverity.length() - 1).equals("[")) {
	        	this.oprtnOutcomeIssueSeverity = this.oprtnOutcomeIssueSeverity+oprtnOutcomeIssueSeverity;
	        } else  {
	            this.oprtnOutcomeIssueSeverity = this.oprtnOutcomeIssueSeverity+ "," +oprtnOutcomeIssueSeverity;
	        }
        }
    }
    
    
    




}


