// // default package
package main.java.com.campfhir.model;
// Generated Aug 17, 2022, 11:08:48 AM by Hibernate Tools 5.6.1.Final



/**
 * Account generated by hbm2java
 */
public class Account  implements java.io.Serializable {


     private String id;
     private String accountCvgCvg;
     private String accountCvgPriority;
     private String accountDscrptn;
     private String accountGuarantorOnHold;
     private String accountGuarantorParty;
     private String accountGuarantorPrdEnd;
     private String accountGuarantorPrdStrt;
     private String accountIdAssigner;
     private String accountIdPrdEnd;
     private String accountIdPrdStrt;
     private String accountIdSys;
     private String accountIdTypCdgCd;
     private String accountIdTypCdgDsply;
     private String accountIdTypCdgSys;
     private String accountIdTypCdgUsrSltd;
     private String accountIdTypCdgVrsn;
     private String accountIdTypTxt;
     private String accountIdUse;
     private String accountIdVl;
     private String accountNm;
     private String accountOwner;
     private String accountPartOf;
     private String accountSrvPrdEnd;
     private String accountSrvPrdStrt;
     private String accountSts;
     private String accountSbjct;
     private String accountTypCdgCd;
     private String accountTypCdgDsply;
     private String accountTypCdgSys;
     private String accountTypCdgUsrSltd;
     private String accountTypCdgVrsn;
     private String accountTypTxt;

    public Account() {
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
    
    
    
    public String getAccountCvgCvg() {
        return this.accountCvgCvg;
    }
    
    public void setAccountCvgCvg(String accountCvgCvg) {
        this.accountCvgCvg = accountCvgCvg;
    }
    
    public void addAccountCvgCvg(String accountCvgCvg) {
    	if( accountCvgCvg != null ) {
	    	if( this.accountCvgCvg == null ) {
	        	this.accountCvgCvg = accountCvgCvg;
	        } else if(this.accountCvgCvg.substring(this.accountCvgCvg.length() - 1).equals("]") & accountCvgCvg.equals("[")) {
	        	this.accountCvgCvg = this.accountCvgCvg+ "," + accountCvgCvg;
	        } else if(accountCvgCvg.equals("[") | accountCvgCvg.equals("]") | this.accountCvgCvg.substring(this.accountCvgCvg.length() - 1).equals("[")) {
	        	this.accountCvgCvg = this.accountCvgCvg+accountCvgCvg;
	        } else  {
	            this.accountCvgCvg = this.accountCvgCvg+ "," +accountCvgCvg;
	        }
        }
    }
    
    
    
    public String getAccountCvgPriority() {
        return this.accountCvgPriority;
    }
    
    public void setAccountCvgPriority(String accountCvgPriority) {
        this.accountCvgPriority = accountCvgPriority;
    }
    
    public void addAccountCvgPriority(String accountCvgPriority) {
    	if( accountCvgPriority != null ) {
	    	if( this.accountCvgPriority == null ) {
	        	this.accountCvgPriority = accountCvgPriority;
	        } else if(this.accountCvgPriority.substring(this.accountCvgPriority.length() - 1).equals("]") & accountCvgPriority.equals("[")) {
	        	this.accountCvgPriority = this.accountCvgPriority+ "," + accountCvgPriority;
	        } else if(accountCvgPriority.equals("[") | accountCvgPriority.equals("]") | this.accountCvgPriority.substring(this.accountCvgPriority.length() - 1).equals("[")) {
	        	this.accountCvgPriority = this.accountCvgPriority+accountCvgPriority;
	        } else  {
	            this.accountCvgPriority = this.accountCvgPriority+ "," +accountCvgPriority;
	        }
        }
    }
    
    
    
    public String getAccountDscrptn() {
        return this.accountDscrptn;
    }
    
    public void setAccountDscrptn(String accountDscrptn) {
        this.accountDscrptn = accountDscrptn;
    }
    
    public void addAccountDscrptn(String accountDscrptn) {
    	if( accountDscrptn != null ) {
	    	if( this.accountDscrptn == null ) {
	        	this.accountDscrptn = accountDscrptn;
	        } else if(this.accountDscrptn.substring(this.accountDscrptn.length() - 1).equals("]") & accountDscrptn.equals("[")) {
	        	this.accountDscrptn = this.accountDscrptn+ "," + accountDscrptn;
	        } else if(accountDscrptn.equals("[") | accountDscrptn.equals("]") | this.accountDscrptn.substring(this.accountDscrptn.length() - 1).equals("[")) {
	        	this.accountDscrptn = this.accountDscrptn+accountDscrptn;
	        } else  {
	            this.accountDscrptn = this.accountDscrptn+ "," +accountDscrptn;
	        }
        }
    }
    
    
    
    public String getAccountGuarantorOnHold() {
        return this.accountGuarantorOnHold;
    }
    
    public void setAccountGuarantorOnHold(String accountGuarantorOnHold) {
        this.accountGuarantorOnHold = accountGuarantorOnHold;
    }
    
    public void addAccountGuarantorOnHold(String accountGuarantorOnHold) {
    	if( accountGuarantorOnHold != null ) {
	    	if( this.accountGuarantorOnHold == null ) {
	        	this.accountGuarantorOnHold = accountGuarantorOnHold;
	        } else if(this.accountGuarantorOnHold.substring(this.accountGuarantorOnHold.length() - 1).equals("]") & accountGuarantorOnHold.equals("[")) {
	        	this.accountGuarantorOnHold = this.accountGuarantorOnHold+ "," + accountGuarantorOnHold;
	        } else if(accountGuarantorOnHold.equals("[") | accountGuarantorOnHold.equals("]") | this.accountGuarantorOnHold.substring(this.accountGuarantorOnHold.length() - 1).equals("[")) {
	        	this.accountGuarantorOnHold = this.accountGuarantorOnHold+accountGuarantorOnHold;
	        } else  {
	            this.accountGuarantorOnHold = this.accountGuarantorOnHold+ "," +accountGuarantorOnHold;
	        }
        }
    }
    
    
    
    public String getAccountGuarantorParty() {
        return this.accountGuarantorParty;
    }
    
    public void setAccountGuarantorParty(String accountGuarantorParty) {
        this.accountGuarantorParty = accountGuarantorParty;
    }
    
    public void addAccountGuarantorParty(String accountGuarantorParty) {
    	if( accountGuarantorParty != null ) {
	    	if( this.accountGuarantorParty == null ) {
	        	this.accountGuarantorParty = accountGuarantorParty;
	        } else if(this.accountGuarantorParty.substring(this.accountGuarantorParty.length() - 1).equals("]") & accountGuarantorParty.equals("[")) {
	        	this.accountGuarantorParty = this.accountGuarantorParty+ "," + accountGuarantorParty;
	        } else if(accountGuarantorParty.equals("[") | accountGuarantorParty.equals("]") | this.accountGuarantorParty.substring(this.accountGuarantorParty.length() - 1).equals("[")) {
	        	this.accountGuarantorParty = this.accountGuarantorParty+accountGuarantorParty;
	        } else  {
	            this.accountGuarantorParty = this.accountGuarantorParty+ "," +accountGuarantorParty;
	        }
        }
    }
    
    
    
    public String getAccountGuarantorPrdEnd() {
        return this.accountGuarantorPrdEnd;
    }
    
    public void setAccountGuarantorPrdEnd(String accountGuarantorPrdEnd) {
        this.accountGuarantorPrdEnd = accountGuarantorPrdEnd;
    }
    
    public void addAccountGuarantorPrdEnd(String accountGuarantorPrdEnd) {
    	if( accountGuarantorPrdEnd != null ) {
	    	if( this.accountGuarantorPrdEnd == null ) {
	        	this.accountGuarantorPrdEnd = accountGuarantorPrdEnd;
	        } else if(this.accountGuarantorPrdEnd.substring(this.accountGuarantorPrdEnd.length() - 1).equals("]") & accountGuarantorPrdEnd.equals("[")) {
	        	this.accountGuarantorPrdEnd = this.accountGuarantorPrdEnd+ "," + accountGuarantorPrdEnd;
	        } else if(accountGuarantorPrdEnd.equals("[") | accountGuarantorPrdEnd.equals("]") | this.accountGuarantorPrdEnd.substring(this.accountGuarantorPrdEnd.length() - 1).equals("[")) {
	        	this.accountGuarantorPrdEnd = this.accountGuarantorPrdEnd+accountGuarantorPrdEnd;
	        } else  {
	            this.accountGuarantorPrdEnd = this.accountGuarantorPrdEnd+ "," +accountGuarantorPrdEnd;
	        }
        }
    }
    
    
    
    public String getAccountGuarantorPrdStrt() {
        return this.accountGuarantorPrdStrt;
    }
    
    public void setAccountGuarantorPrdStrt(String accountGuarantorPrdStrt) {
        this.accountGuarantorPrdStrt = accountGuarantorPrdStrt;
    }
    
    public void addAccountGuarantorPrdStrt(String accountGuarantorPrdStrt) {
    	if( accountGuarantorPrdStrt != null ) {
	    	if( this.accountGuarantorPrdStrt == null ) {
	        	this.accountGuarantorPrdStrt = accountGuarantorPrdStrt;
	        } else if(this.accountGuarantorPrdStrt.substring(this.accountGuarantorPrdStrt.length() - 1).equals("]") & accountGuarantorPrdStrt.equals("[")) {
	        	this.accountGuarantorPrdStrt = this.accountGuarantorPrdStrt+ "," + accountGuarantorPrdStrt;
	        } else if(accountGuarantorPrdStrt.equals("[") | accountGuarantorPrdStrt.equals("]") | this.accountGuarantorPrdStrt.substring(this.accountGuarantorPrdStrt.length() - 1).equals("[")) {
	        	this.accountGuarantorPrdStrt = this.accountGuarantorPrdStrt+accountGuarantorPrdStrt;
	        } else  {
	            this.accountGuarantorPrdStrt = this.accountGuarantorPrdStrt+ "," +accountGuarantorPrdStrt;
	        }
        }
    }
    
    
    
    public String getAccountIdAssigner() {
        return this.accountIdAssigner;
    }
    
    public void setAccountIdAssigner(String accountIdAssigner) {
        this.accountIdAssigner = accountIdAssigner;
    }
    
    public void addAccountIdAssigner(String accountIdAssigner) {
    	if( accountIdAssigner != null ) {
	    	if( this.accountIdAssigner == null ) {
	        	this.accountIdAssigner = accountIdAssigner;
	        } else if(this.accountIdAssigner.substring(this.accountIdAssigner.length() - 1).equals("]") & accountIdAssigner.equals("[")) {
	        	this.accountIdAssigner = this.accountIdAssigner+ "," + accountIdAssigner;
	        } else if(accountIdAssigner.equals("[") | accountIdAssigner.equals("]") | this.accountIdAssigner.substring(this.accountIdAssigner.length() - 1).equals("[")) {
	        	this.accountIdAssigner = this.accountIdAssigner+accountIdAssigner;
	        } else  {
	            this.accountIdAssigner = this.accountIdAssigner+ "," +accountIdAssigner;
	        }
        }
    }
    
    
    
    public String getAccountIdPrdEnd() {
        return this.accountIdPrdEnd;
    }
    
    public void setAccountIdPrdEnd(String accountIdPrdEnd) {
        this.accountIdPrdEnd = accountIdPrdEnd;
    }
    
    public void addAccountIdPrdEnd(String accountIdPrdEnd) {
    	if( accountIdPrdEnd != null ) {
	    	if( this.accountIdPrdEnd == null ) {
	        	this.accountIdPrdEnd = accountIdPrdEnd;
	        } else if(this.accountIdPrdEnd.substring(this.accountIdPrdEnd.length() - 1).equals("]") & accountIdPrdEnd.equals("[")) {
	        	this.accountIdPrdEnd = this.accountIdPrdEnd+ "," + accountIdPrdEnd;
	        } else if(accountIdPrdEnd.equals("[") | accountIdPrdEnd.equals("]") | this.accountIdPrdEnd.substring(this.accountIdPrdEnd.length() - 1).equals("[")) {
	        	this.accountIdPrdEnd = this.accountIdPrdEnd+accountIdPrdEnd;
	        } else  {
	            this.accountIdPrdEnd = this.accountIdPrdEnd+ "," +accountIdPrdEnd;
	        }
        }
    }
    
    
    
    public String getAccountIdPrdStrt() {
        return this.accountIdPrdStrt;
    }
    
    public void setAccountIdPrdStrt(String accountIdPrdStrt) {
        this.accountIdPrdStrt = accountIdPrdStrt;
    }
    
    public void addAccountIdPrdStrt(String accountIdPrdStrt) {
    	if( accountIdPrdStrt != null ) {
	    	if( this.accountIdPrdStrt == null ) {
	        	this.accountIdPrdStrt = accountIdPrdStrt;
	        } else if(this.accountIdPrdStrt.substring(this.accountIdPrdStrt.length() - 1).equals("]") & accountIdPrdStrt.equals("[")) {
	        	this.accountIdPrdStrt = this.accountIdPrdStrt+ "," + accountIdPrdStrt;
	        } else if(accountIdPrdStrt.equals("[") | accountIdPrdStrt.equals("]") | this.accountIdPrdStrt.substring(this.accountIdPrdStrt.length() - 1).equals("[")) {
	        	this.accountIdPrdStrt = this.accountIdPrdStrt+accountIdPrdStrt;
	        } else  {
	            this.accountIdPrdStrt = this.accountIdPrdStrt+ "," +accountIdPrdStrt;
	        }
        }
    }
    
    
    
    public String getAccountIdSys() {
        return this.accountIdSys;
    }
    
    public void setAccountIdSys(String accountIdSys) {
        this.accountIdSys = accountIdSys;
    }
    
    public void addAccountIdSys(String accountIdSys) {
    	if( accountIdSys != null ) {
	    	if( this.accountIdSys == null ) {
	        	this.accountIdSys = accountIdSys;
	        } else if(this.accountIdSys.substring(this.accountIdSys.length() - 1).equals("]") & accountIdSys.equals("[")) {
	        	this.accountIdSys = this.accountIdSys+ "," + accountIdSys;
	        } else if(accountIdSys.equals("[") | accountIdSys.equals("]") | this.accountIdSys.substring(this.accountIdSys.length() - 1).equals("[")) {
	        	this.accountIdSys = this.accountIdSys+accountIdSys;
	        } else  {
	            this.accountIdSys = this.accountIdSys+ "," +accountIdSys;
	        }
        }
    }
    
    
    
    public String getAccountIdTypCdgCd() {
        return this.accountIdTypCdgCd;
    }
    
    public void setAccountIdTypCdgCd(String accountIdTypCdgCd) {
        this.accountIdTypCdgCd = accountIdTypCdgCd;
    }
    
    public void addAccountIdTypCdgCd(String accountIdTypCdgCd) {
    	if( accountIdTypCdgCd != null ) {
	    	if( this.accountIdTypCdgCd == null ) {
	        	this.accountIdTypCdgCd = accountIdTypCdgCd;
	        } else if(this.accountIdTypCdgCd.substring(this.accountIdTypCdgCd.length() - 1).equals("]") & accountIdTypCdgCd.equals("[")) {
	        	this.accountIdTypCdgCd = this.accountIdTypCdgCd+ "," + accountIdTypCdgCd;
	        } else if(accountIdTypCdgCd.equals("[") | accountIdTypCdgCd.equals("]") | this.accountIdTypCdgCd.substring(this.accountIdTypCdgCd.length() - 1).equals("[")) {
	        	this.accountIdTypCdgCd = this.accountIdTypCdgCd+accountIdTypCdgCd;
	        } else  {
	            this.accountIdTypCdgCd = this.accountIdTypCdgCd+ "," +accountIdTypCdgCd;
	        }
        }
    }
    
    
    
    public String getAccountIdTypCdgDsply() {
        return this.accountIdTypCdgDsply;
    }
    
    public void setAccountIdTypCdgDsply(String accountIdTypCdgDsply) {
        this.accountIdTypCdgDsply = accountIdTypCdgDsply;
    }
    
    public void addAccountIdTypCdgDsply(String accountIdTypCdgDsply) {
    	if( accountIdTypCdgDsply != null ) {
	    	if( this.accountIdTypCdgDsply == null ) {
	        	this.accountIdTypCdgDsply = accountIdTypCdgDsply;
	        } else if(this.accountIdTypCdgDsply.substring(this.accountIdTypCdgDsply.length() - 1).equals("]") & accountIdTypCdgDsply.equals("[")) {
	        	this.accountIdTypCdgDsply = this.accountIdTypCdgDsply+ "," + accountIdTypCdgDsply;
	        } else if(accountIdTypCdgDsply.equals("[") | accountIdTypCdgDsply.equals("]") | this.accountIdTypCdgDsply.substring(this.accountIdTypCdgDsply.length() - 1).equals("[")) {
	        	this.accountIdTypCdgDsply = this.accountIdTypCdgDsply+accountIdTypCdgDsply;
	        } else  {
	            this.accountIdTypCdgDsply = this.accountIdTypCdgDsply+ "," +accountIdTypCdgDsply;
	        }
        }
    }
    
    
    
    public String getAccountIdTypCdgSys() {
        return this.accountIdTypCdgSys;
    }
    
    public void setAccountIdTypCdgSys(String accountIdTypCdgSys) {
        this.accountIdTypCdgSys = accountIdTypCdgSys;
    }
    
    public void addAccountIdTypCdgSys(String accountIdTypCdgSys) {
    	if( accountIdTypCdgSys != null ) {
	    	if( this.accountIdTypCdgSys == null ) {
	        	this.accountIdTypCdgSys = accountIdTypCdgSys;
	        } else if(this.accountIdTypCdgSys.substring(this.accountIdTypCdgSys.length() - 1).equals("]") & accountIdTypCdgSys.equals("[")) {
	        	this.accountIdTypCdgSys = this.accountIdTypCdgSys+ "," + accountIdTypCdgSys;
	        } else if(accountIdTypCdgSys.equals("[") | accountIdTypCdgSys.equals("]") | this.accountIdTypCdgSys.substring(this.accountIdTypCdgSys.length() - 1).equals("[")) {
	        	this.accountIdTypCdgSys = this.accountIdTypCdgSys+accountIdTypCdgSys;
	        } else  {
	            this.accountIdTypCdgSys = this.accountIdTypCdgSys+ "," +accountIdTypCdgSys;
	        }
        }
    }
    
    
    
    public String getAccountIdTypCdgUsrSltd() {
        return this.accountIdTypCdgUsrSltd;
    }
    
    public void setAccountIdTypCdgUsrSltd(String accountIdTypCdgUsrSltd) {
        this.accountIdTypCdgUsrSltd = accountIdTypCdgUsrSltd;
    }
    
    public void addAccountIdTypCdgUsrSltd(String accountIdTypCdgUsrSltd) {
    	if( accountIdTypCdgUsrSltd != null ) {
	    	if( this.accountIdTypCdgUsrSltd == null ) {
	        	this.accountIdTypCdgUsrSltd = accountIdTypCdgUsrSltd;
	        } else if(this.accountIdTypCdgUsrSltd.substring(this.accountIdTypCdgUsrSltd.length() - 1).equals("]") & accountIdTypCdgUsrSltd.equals("[")) {
	        	this.accountIdTypCdgUsrSltd = this.accountIdTypCdgUsrSltd+ "," + accountIdTypCdgUsrSltd;
	        } else if(accountIdTypCdgUsrSltd.equals("[") | accountIdTypCdgUsrSltd.equals("]") | this.accountIdTypCdgUsrSltd.substring(this.accountIdTypCdgUsrSltd.length() - 1).equals("[")) {
	        	this.accountIdTypCdgUsrSltd = this.accountIdTypCdgUsrSltd+accountIdTypCdgUsrSltd;
	        } else  {
	            this.accountIdTypCdgUsrSltd = this.accountIdTypCdgUsrSltd+ "," +accountIdTypCdgUsrSltd;
	        }
        }
    }
    
    
    
    public String getAccountIdTypCdgVrsn() {
        return this.accountIdTypCdgVrsn;
    }
    
    public void setAccountIdTypCdgVrsn(String accountIdTypCdgVrsn) {
        this.accountIdTypCdgVrsn = accountIdTypCdgVrsn;
    }
    
    public void addAccountIdTypCdgVrsn(String accountIdTypCdgVrsn) {
    	if( accountIdTypCdgVrsn != null ) {
	    	if( this.accountIdTypCdgVrsn == null ) {
	        	this.accountIdTypCdgVrsn = accountIdTypCdgVrsn;
	        } else if(this.accountIdTypCdgVrsn.substring(this.accountIdTypCdgVrsn.length() - 1).equals("]") & accountIdTypCdgVrsn.equals("[")) {
	        	this.accountIdTypCdgVrsn = this.accountIdTypCdgVrsn+ "," + accountIdTypCdgVrsn;
	        } else if(accountIdTypCdgVrsn.equals("[") | accountIdTypCdgVrsn.equals("]") | this.accountIdTypCdgVrsn.substring(this.accountIdTypCdgVrsn.length() - 1).equals("[")) {
	        	this.accountIdTypCdgVrsn = this.accountIdTypCdgVrsn+accountIdTypCdgVrsn;
	        } else  {
	            this.accountIdTypCdgVrsn = this.accountIdTypCdgVrsn+ "," +accountIdTypCdgVrsn;
	        }
        }
    }
    
    
    
    public String getAccountIdTypTxt() {
        return this.accountIdTypTxt;
    }
    
    public void setAccountIdTypTxt(String accountIdTypTxt) {
        this.accountIdTypTxt = accountIdTypTxt;
    }
    
    public void addAccountIdTypTxt(String accountIdTypTxt) {
    	if( accountIdTypTxt != null ) {
	    	if( this.accountIdTypTxt == null ) {
	        	this.accountIdTypTxt = accountIdTypTxt;
	        } else if(this.accountIdTypTxt.substring(this.accountIdTypTxt.length() - 1).equals("]") & accountIdTypTxt.equals("[")) {
	        	this.accountIdTypTxt = this.accountIdTypTxt+ "," + accountIdTypTxt;
	        } else if(accountIdTypTxt.equals("[") | accountIdTypTxt.equals("]") | this.accountIdTypTxt.substring(this.accountIdTypTxt.length() - 1).equals("[")) {
	        	this.accountIdTypTxt = this.accountIdTypTxt+accountIdTypTxt;
	        } else  {
	            this.accountIdTypTxt = this.accountIdTypTxt+ "," +accountIdTypTxt;
	        }
        }
    }
    
    
    
    public String getAccountIdUse() {
        return this.accountIdUse;
    }
    
    public void setAccountIdUse(String accountIdUse) {
        this.accountIdUse = accountIdUse;
    }
    
    public void addAccountIdUse(String accountIdUse) {
    	if( accountIdUse != null ) {
	    	if( this.accountIdUse == null ) {
	        	this.accountIdUse = accountIdUse;
	        } else if(this.accountIdUse.substring(this.accountIdUse.length() - 1).equals("]") & accountIdUse.equals("[")) {
	        	this.accountIdUse = this.accountIdUse+ "," + accountIdUse;
	        } else if(accountIdUse.equals("[") | accountIdUse.equals("]") | this.accountIdUse.substring(this.accountIdUse.length() - 1).equals("[")) {
	        	this.accountIdUse = this.accountIdUse+accountIdUse;
	        } else  {
	            this.accountIdUse = this.accountIdUse+ "," +accountIdUse;
	        }
        }
    }
    
    
    
    public String getAccountIdVl() {
        return this.accountIdVl;
    }
    
    public void setAccountIdVl(String accountIdVl) {
        this.accountIdVl = accountIdVl;
    }
    
    public void addAccountIdVl(String accountIdVl) {
    	if( accountIdVl != null ) {
	    	if( this.accountIdVl == null ) {
	        	this.accountIdVl = accountIdVl;
	        } else if(this.accountIdVl.substring(this.accountIdVl.length() - 1).equals("]") & accountIdVl.equals("[")) {
	        	this.accountIdVl = this.accountIdVl+ "," + accountIdVl;
	        } else if(accountIdVl.equals("[") | accountIdVl.equals("]") | this.accountIdVl.substring(this.accountIdVl.length() - 1).equals("[")) {
	        	this.accountIdVl = this.accountIdVl+accountIdVl;
	        } else  {
	            this.accountIdVl = this.accountIdVl+ "," +accountIdVl;
	        }
        }
    }
    
    
    
    public String getAccountNm() {
        return this.accountNm;
    }
    
    public void setAccountNm(String accountNm) {
        this.accountNm = accountNm;
    }
    
    public void addAccountNm(String accountNm) {
    	if( accountNm != null ) {
	    	if( this.accountNm == null ) {
	        	this.accountNm = accountNm;
	        } else if(this.accountNm.substring(this.accountNm.length() - 1).equals("]") & accountNm.equals("[")) {
	        	this.accountNm = this.accountNm+ "," + accountNm;
	        } else if(accountNm.equals("[") | accountNm.equals("]") | this.accountNm.substring(this.accountNm.length() - 1).equals("[")) {
	        	this.accountNm = this.accountNm+accountNm;
	        } else  {
	            this.accountNm = this.accountNm+ "," +accountNm;
	        }
        }
    }
    
    
    
    public String getAccountOwner() {
        return this.accountOwner;
    }
    
    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }
    
    public void addAccountOwner(String accountOwner) {
    	if( accountOwner != null ) {
	    	if( this.accountOwner == null ) {
	        	this.accountOwner = accountOwner;
	        } else if(this.accountOwner.substring(this.accountOwner.length() - 1).equals("]") & accountOwner.equals("[")) {
	        	this.accountOwner = this.accountOwner+ "," + accountOwner;
	        } else if(accountOwner.equals("[") | accountOwner.equals("]") | this.accountOwner.substring(this.accountOwner.length() - 1).equals("[")) {
	        	this.accountOwner = this.accountOwner+accountOwner;
	        } else  {
	            this.accountOwner = this.accountOwner+ "," +accountOwner;
	        }
        }
    }
    
    
    
    public String getAccountPartOf() {
        return this.accountPartOf;
    }
    
    public void setAccountPartOf(String accountPartOf) {
        this.accountPartOf = accountPartOf;
    }
    
    public void addAccountPartOf(String accountPartOf) {
    	if( accountPartOf != null ) {
	    	if( this.accountPartOf == null ) {
	        	this.accountPartOf = accountPartOf;
	        } else if(this.accountPartOf.substring(this.accountPartOf.length() - 1).equals("]") & accountPartOf.equals("[")) {
	        	this.accountPartOf = this.accountPartOf+ "," + accountPartOf;
	        } else if(accountPartOf.equals("[") | accountPartOf.equals("]") | this.accountPartOf.substring(this.accountPartOf.length() - 1).equals("[")) {
	        	this.accountPartOf = this.accountPartOf+accountPartOf;
	        } else  {
	            this.accountPartOf = this.accountPartOf+ "," +accountPartOf;
	        }
        }
    }
    
    
    
    public String getAccountSrvPrdEnd() {
        return this.accountSrvPrdEnd;
    }
    
    public void setAccountSrvPrdEnd(String accountSrvPrdEnd) {
        this.accountSrvPrdEnd = accountSrvPrdEnd;
    }
    
    public void addAccountSrvPrdEnd(String accountSrvPrdEnd) {
    	if( accountSrvPrdEnd != null ) {
	    	if( this.accountSrvPrdEnd == null ) {
	        	this.accountSrvPrdEnd = accountSrvPrdEnd;
	        } else if(this.accountSrvPrdEnd.substring(this.accountSrvPrdEnd.length() - 1).equals("]") & accountSrvPrdEnd.equals("[")) {
	        	this.accountSrvPrdEnd = this.accountSrvPrdEnd+ "," + accountSrvPrdEnd;
	        } else if(accountSrvPrdEnd.equals("[") | accountSrvPrdEnd.equals("]") | this.accountSrvPrdEnd.substring(this.accountSrvPrdEnd.length() - 1).equals("[")) {
	        	this.accountSrvPrdEnd = this.accountSrvPrdEnd+accountSrvPrdEnd;
	        } else  {
	            this.accountSrvPrdEnd = this.accountSrvPrdEnd+ "," +accountSrvPrdEnd;
	        }
        }
    }
    
    
    
    public String getAccountSrvPrdStrt() {
        return this.accountSrvPrdStrt;
    }
    
    public void setAccountSrvPrdStrt(String accountSrvPrdStrt) {
        this.accountSrvPrdStrt = accountSrvPrdStrt;
    }
    
    public void addAccountSrvPrdStrt(String accountSrvPrdStrt) {
    	if( accountSrvPrdStrt != null ) {
	    	if( this.accountSrvPrdStrt == null ) {
	        	this.accountSrvPrdStrt = accountSrvPrdStrt;
	        } else if(this.accountSrvPrdStrt.substring(this.accountSrvPrdStrt.length() - 1).equals("]") & accountSrvPrdStrt.equals("[")) {
	        	this.accountSrvPrdStrt = this.accountSrvPrdStrt+ "," + accountSrvPrdStrt;
	        } else if(accountSrvPrdStrt.equals("[") | accountSrvPrdStrt.equals("]") | this.accountSrvPrdStrt.substring(this.accountSrvPrdStrt.length() - 1).equals("[")) {
	        	this.accountSrvPrdStrt = this.accountSrvPrdStrt+accountSrvPrdStrt;
	        } else  {
	            this.accountSrvPrdStrt = this.accountSrvPrdStrt+ "," +accountSrvPrdStrt;
	        }
        }
    }
    
    
    
    public String getAccountSts() {
        return this.accountSts;
    }
    
    public void setAccountSts(String accountSts) {
        this.accountSts = accountSts;
    }
    
    public void addAccountSts(String accountSts) {
    	if( accountSts != null ) {
	    	if( this.accountSts == null ) {
	        	this.accountSts = accountSts;
	        } else if(this.accountSts.substring(this.accountSts.length() - 1).equals("]") & accountSts.equals("[")) {
	        	this.accountSts = this.accountSts+ "," + accountSts;
	        } else if(accountSts.equals("[") | accountSts.equals("]") | this.accountSts.substring(this.accountSts.length() - 1).equals("[")) {
	        	this.accountSts = this.accountSts+accountSts;
	        } else  {
	            this.accountSts = this.accountSts+ "," +accountSts;
	        }
        }
    }
    
    
    
    public String getAccountSbjct() {
        return this.accountSbjct;
    }
    
    public void setAccountSbjct(String accountSbjct) {
        this.accountSbjct = accountSbjct;
    }
    
    public void addAccountSbjct(String accountSbjct) {
    	if( accountSbjct != null ) {
	    	if( this.accountSbjct == null ) {
	        	this.accountSbjct = accountSbjct;
	        } else if(this.accountSbjct.substring(this.accountSbjct.length() - 1).equals("]") & accountSbjct.equals("[")) {
	        	this.accountSbjct = this.accountSbjct+ "," + accountSbjct;
	        } else if(accountSbjct.equals("[") | accountSbjct.equals("]") | this.accountSbjct.substring(this.accountSbjct.length() - 1).equals("[")) {
	        	this.accountSbjct = this.accountSbjct+accountSbjct;
	        } else  {
	            this.accountSbjct = this.accountSbjct+ "," +accountSbjct;
	        }
        }
    }
    
    
    
    public String getAccountTypCdgCd() {
        return this.accountTypCdgCd;
    }
    
    public void setAccountTypCdgCd(String accountTypCdgCd) {
        this.accountTypCdgCd = accountTypCdgCd;
    }
    
    public void addAccountTypCdgCd(String accountTypCdgCd) {
    	if( accountTypCdgCd != null ) {
	    	if( this.accountTypCdgCd == null ) {
	        	this.accountTypCdgCd = accountTypCdgCd;
	        } else if(this.accountTypCdgCd.substring(this.accountTypCdgCd.length() - 1).equals("]") & accountTypCdgCd.equals("[")) {
	        	this.accountTypCdgCd = this.accountTypCdgCd+ "," + accountTypCdgCd;
	        } else if(accountTypCdgCd.equals("[") | accountTypCdgCd.equals("]") | this.accountTypCdgCd.substring(this.accountTypCdgCd.length() - 1).equals("[")) {
	        	this.accountTypCdgCd = this.accountTypCdgCd+accountTypCdgCd;
	        } else  {
	            this.accountTypCdgCd = this.accountTypCdgCd+ "," +accountTypCdgCd;
	        }
        }
    }
    
    
    
    public String getAccountTypCdgDsply() {
        return this.accountTypCdgDsply;
    }
    
    public void setAccountTypCdgDsply(String accountTypCdgDsply) {
        this.accountTypCdgDsply = accountTypCdgDsply;
    }
    
    public void addAccountTypCdgDsply(String accountTypCdgDsply) {
    	if( accountTypCdgDsply != null ) {
	    	if( this.accountTypCdgDsply == null ) {
	        	this.accountTypCdgDsply = accountTypCdgDsply;
	        } else if(this.accountTypCdgDsply.substring(this.accountTypCdgDsply.length() - 1).equals("]") & accountTypCdgDsply.equals("[")) {
	        	this.accountTypCdgDsply = this.accountTypCdgDsply+ "," + accountTypCdgDsply;
	        } else if(accountTypCdgDsply.equals("[") | accountTypCdgDsply.equals("]") | this.accountTypCdgDsply.substring(this.accountTypCdgDsply.length() - 1).equals("[")) {
	        	this.accountTypCdgDsply = this.accountTypCdgDsply+accountTypCdgDsply;
	        } else  {
	            this.accountTypCdgDsply = this.accountTypCdgDsply+ "," +accountTypCdgDsply;
	        }
        }
    }
    
    
    
    public String getAccountTypCdgSys() {
        return this.accountTypCdgSys;
    }
    
    public void setAccountTypCdgSys(String accountTypCdgSys) {
        this.accountTypCdgSys = accountTypCdgSys;
    }
    
    public void addAccountTypCdgSys(String accountTypCdgSys) {
    	if( accountTypCdgSys != null ) {
	    	if( this.accountTypCdgSys == null ) {
	        	this.accountTypCdgSys = accountTypCdgSys;
	        } else if(this.accountTypCdgSys.substring(this.accountTypCdgSys.length() - 1).equals("]") & accountTypCdgSys.equals("[")) {
	        	this.accountTypCdgSys = this.accountTypCdgSys+ "," + accountTypCdgSys;
	        } else if(accountTypCdgSys.equals("[") | accountTypCdgSys.equals("]") | this.accountTypCdgSys.substring(this.accountTypCdgSys.length() - 1).equals("[")) {
	        	this.accountTypCdgSys = this.accountTypCdgSys+accountTypCdgSys;
	        } else  {
	            this.accountTypCdgSys = this.accountTypCdgSys+ "," +accountTypCdgSys;
	        }
        }
    }
    
    
    
    public String getAccountTypCdgUsrSltd() {
        return this.accountTypCdgUsrSltd;
    }
    
    public void setAccountTypCdgUsrSltd(String accountTypCdgUsrSltd) {
        this.accountTypCdgUsrSltd = accountTypCdgUsrSltd;
    }
    
    public void addAccountTypCdgUsrSltd(String accountTypCdgUsrSltd) {
    	if( accountTypCdgUsrSltd != null ) {
	    	if( this.accountTypCdgUsrSltd == null ) {
	        	this.accountTypCdgUsrSltd = accountTypCdgUsrSltd;
	        } else if(this.accountTypCdgUsrSltd.substring(this.accountTypCdgUsrSltd.length() - 1).equals("]") & accountTypCdgUsrSltd.equals("[")) {
	        	this.accountTypCdgUsrSltd = this.accountTypCdgUsrSltd+ "," + accountTypCdgUsrSltd;
	        } else if(accountTypCdgUsrSltd.equals("[") | accountTypCdgUsrSltd.equals("]") | this.accountTypCdgUsrSltd.substring(this.accountTypCdgUsrSltd.length() - 1).equals("[")) {
	        	this.accountTypCdgUsrSltd = this.accountTypCdgUsrSltd+accountTypCdgUsrSltd;
	        } else  {
	            this.accountTypCdgUsrSltd = this.accountTypCdgUsrSltd+ "," +accountTypCdgUsrSltd;
	        }
        }
    }
    
    
    
    public String getAccountTypCdgVrsn() {
        return this.accountTypCdgVrsn;
    }
    
    public void setAccountTypCdgVrsn(String accountTypCdgVrsn) {
        this.accountTypCdgVrsn = accountTypCdgVrsn;
    }
    
    public void addAccountTypCdgVrsn(String accountTypCdgVrsn) {
    	if( accountTypCdgVrsn != null ) {
	    	if( this.accountTypCdgVrsn == null ) {
	        	this.accountTypCdgVrsn = accountTypCdgVrsn;
	        } else if(this.accountTypCdgVrsn.substring(this.accountTypCdgVrsn.length() - 1).equals("]") & accountTypCdgVrsn.equals("[")) {
	        	this.accountTypCdgVrsn = this.accountTypCdgVrsn+ "," + accountTypCdgVrsn;
	        } else if(accountTypCdgVrsn.equals("[") | accountTypCdgVrsn.equals("]") | this.accountTypCdgVrsn.substring(this.accountTypCdgVrsn.length() - 1).equals("[")) {
	        	this.accountTypCdgVrsn = this.accountTypCdgVrsn+accountTypCdgVrsn;
	        } else  {
	            this.accountTypCdgVrsn = this.accountTypCdgVrsn+ "," +accountTypCdgVrsn;
	        }
        }
    }
    
    
    
    public String getAccountTypTxt() {
        return this.accountTypTxt;
    }
    
    public void setAccountTypTxt(String accountTypTxt) {
        this.accountTypTxt = accountTypTxt;
    }
    
    public void addAccountTypTxt(String accountTypTxt) {
    	if( accountTypTxt != null ) {
	    	if( this.accountTypTxt == null ) {
	        	this.accountTypTxt = accountTypTxt;
	        } else if(this.accountTypTxt.substring(this.accountTypTxt.length() - 1).equals("]") & accountTypTxt.equals("[")) {
	        	this.accountTypTxt = this.accountTypTxt+ "," + accountTypTxt;
	        } else if(accountTypTxt.equals("[") | accountTypTxt.equals("]") | this.accountTypTxt.substring(this.accountTypTxt.length() - 1).equals("[")) {
	        	this.accountTypTxt = this.accountTypTxt+accountTypTxt;
	        } else  {
	            this.accountTypTxt = this.accountTypTxt+ "," +accountTypTxt;
	        }
        }
    }
    
    
    




}


