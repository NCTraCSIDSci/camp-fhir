// // default package
package main.java.com.campfhir.model;
// Generated Aug 17, 2022, 11:08:48 AM by Hibernate Tools 5.6.1.Final



public class DocumentReference implements java.io.Serializable extends Resource{


	private static final long serialVersionUID = 1L;


     private String id;
     private String docRfrncAuthenticator;
     private String docRfrncAthr;
     private String docRfrncCtgryCdgCd;
     private String docRfrncCtgryCdgDsply;
     private String docRfrncCtgryCdgSys;
     private String docRfrncCtgryCdgUsrSltd;
     private String docRfrncCtgryCdgVrsn;
     private String docRfrncCtgryTxt;
     private String docRfrncCntntAttchmntCntntTyp;
     private String docRfrncCntntAttchmntCreation;
     private String docRfrncCntntAttchmntData;
     private String docRfrncCntntAttchmntHash;
     private String docRfrncCntntAttchmntLnguage;
     private String docRfrncCntntAttchmntSz;
     private String docRfrncCntntAttchmntTtl;
     private String docRfrncCntntAttchmntUrl;
     private String docRfrncCntntFrmatCd;
     private String docRfrncCntntFrmatDsply;
     private String docRfrncCntntFrmatSys;
     private String docRfrncCntntFrmatUsrSltd;
     private String docRfrncCntntFrmatVrsn;
     private String docRfrncCntxtEnc;
     private String docRfrncCntxtEvntCdgCd;
     private String docRfrncCntxtEvntCdgDsply;
     private String docRfrncCntxtEvntCdgSys;
     private String docRfrncCntxtEvntCdgUsrSltd;
     private String docRfrncCntxtEvntCdgVrsn;
     private String docRfrncCntxtEvntTxt;
     private String docRfrncCntxtFacilityTypCdgCd;
     private String docRfrncCntxtFacilityTypCdgDsply;
     private String docRfrncCntxtFacilityTypCdgSys;
     private String docRfrncCntxtFacilityTypCdgUsrSltd;
     private String docRfrncCntxtFacilityTypCdgVrsn;
     private String docRfrncCntxtFacilityTypTxt;
     private String docRfrncCntxtPrdEnd;
     private String docRfrncCntxtPrdStrt;
     private String docRfrncCntxtPracticeSttingCdgCd;
     private String docRfrncCntxtPracticeSttingCdgDsply;
     private String docRfrncCntxtPracticeSttingCdgSys;
     private String docRfrncCntxtPracticeSttingCdgUsrSltd;
     private String docRfrncCntxtPracticeSttingCdgVrsn;
     private String docRfrncCntxtPracticeSttingTxt;
     private String docRfrncCntxtRlted;
     private String docRfrncCntxtSrcPntInfo;
     private String docRfrncCustodian;
     private String docRfrncDt;
     private String docRfrncDscrptn;
     private String docRfrncDocSts;
     private String docRfrncIdAssigner;
     private String docRfrncIdPrdEnd;
     private String docRfrncIdPrdStrt;
     private String docRfrncIdSys;
     private String docRfrncIdTypCdgCd;
     private String docRfrncIdTypCdgDsply;
     private String docRfrncIdTypCdgSys;
     private String docRfrncIdTypCdgUsrSltd;
     private String docRfrncIdTypCdgVrsn;
     private String docRfrncIdTypTxt;
     private String docRfrncIdUse;
     private String docRfrncIdVl;
     private String docRfrncMasterIdAssigner;
     private String docRfrncMasterIdPrdEnd;
     private String docRfrncMasterIdPrdStrt;
     private String docRfrncMasterIdSys;
     private String docRfrncMasterIdTypCdgCd;
     private String docRfrncMasterIdTypCdgDsply;
     private String docRfrncMasterIdTypCdgSys;
     private String docRfrncMasterIdTypCdgUsrSltd;
     private String docRfrncMasterIdTypCdgVrsn;
     private String docRfrncMasterIdTypTxt;
     private String docRfrncMasterIdUse;
     private String docRfrncMasterIdVl;
     private String docRfrncRelatesToCd;
     private String docRfrncSecurityLblCdgCd;
     private String docRfrncSecurityLblCdgDsply;
     private String docRfrncSecurityLblCdgSys;
     private String docRfrncSecurityLblCdgUsrSltd;
     private String docRfrncSecurityLblCdgVrsn;
     private String docRfrncSecurityLblTxt;
     private String docRfrncSts;
     private String docRfrncSbjct;
     private String docRfrncTypCdgCd;
     private String docRfrncTypCdgDsply;
     private String docRfrncTypCdgSys;
     private String docRfrncTypCdgUsrSltd;
     private String docRfrncTypCdgVrsn;
     private String docRfrncTypTxt;


    public DocumentReference() {
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
    
    
    
    public String getDocRfrncAuthenticator() {
        return this.docRfrncAuthenticator;
    }
    
    public void setDocRfrncAuthenticator(String docRfrncAuthenticator) {
        this.docRfrncAuthenticator = docRfrncAuthenticator;
    }
    
    public void addDocRfrncAuthenticator(String docRfrncAuthenticator) {
    	if( docRfrncAuthenticator != null ) {
	    	if( this.docRfrncAuthenticator == null ) {
	        	this.docRfrncAuthenticator = docRfrncAuthenticator;
	        } else if(this.docRfrncAuthenticator.substring(this.docRfrncAuthenticator.length() - 1).equals("]") & docRfrncAuthenticator.equals("[")) {
	        	this.docRfrncAuthenticator = this.docRfrncAuthenticator+ "," + docRfrncAuthenticator;
	        } else if(docRfrncAuthenticator.equals("[") | docRfrncAuthenticator.equals("]") | this.docRfrncAuthenticator.substring(this.docRfrncAuthenticator.length() - 1).equals("[")) {
	        	this.docRfrncAuthenticator = this.docRfrncAuthenticator+docRfrncAuthenticator;
	        } else  {
	            this.docRfrncAuthenticator = this.docRfrncAuthenticator+ "," +docRfrncAuthenticator;
	        }
        }
    }
    
    
    
    public String getDocRfrncAthr() {
        return this.docRfrncAthr;
    }
    
    public void setDocRfrncAthr(String docRfrncAthr) {
        this.docRfrncAthr = docRfrncAthr;
    }
    
    public void addDocRfrncAthr(String docRfrncAthr) {
    	if( docRfrncAthr != null ) {
	    	if( this.docRfrncAthr == null ) {
	        	this.docRfrncAthr = docRfrncAthr;
	        } else if(this.docRfrncAthr.substring(this.docRfrncAthr.length() - 1).equals("]") & docRfrncAthr.equals("[")) {
	        	this.docRfrncAthr = this.docRfrncAthr+ "," + docRfrncAthr;
	        } else if(docRfrncAthr.equals("[") | docRfrncAthr.equals("]") | this.docRfrncAthr.substring(this.docRfrncAthr.length() - 1).equals("[")) {
	        	this.docRfrncAthr = this.docRfrncAthr+docRfrncAthr;
	        } else  {
	            this.docRfrncAthr = this.docRfrncAthr+ "," +docRfrncAthr;
	        }
        }
    }
    
    
    
    public String getDocRfrncCtgryCdgCd() {
        return this.docRfrncCtgryCdgCd;
    }
    
    public void setDocRfrncCtgryCdgCd(String docRfrncCtgryCdgCd) {
        this.docRfrncCtgryCdgCd = docRfrncCtgryCdgCd;
    }
    
    public void addDocRfrncCtgryCdgCd(String docRfrncCtgryCdgCd) {
    	if( docRfrncCtgryCdgCd != null ) {
	    	if( this.docRfrncCtgryCdgCd == null ) {
	        	this.docRfrncCtgryCdgCd = docRfrncCtgryCdgCd;
	        } else if(this.docRfrncCtgryCdgCd.substring(this.docRfrncCtgryCdgCd.length() - 1).equals("]") & docRfrncCtgryCdgCd.equals("[")) {
	        	this.docRfrncCtgryCdgCd = this.docRfrncCtgryCdgCd+ "," + docRfrncCtgryCdgCd;
	        } else if(docRfrncCtgryCdgCd.equals("[") | docRfrncCtgryCdgCd.equals("]") | this.docRfrncCtgryCdgCd.substring(this.docRfrncCtgryCdgCd.length() - 1).equals("[")) {
	        	this.docRfrncCtgryCdgCd = this.docRfrncCtgryCdgCd+docRfrncCtgryCdgCd;
	        } else  {
	            this.docRfrncCtgryCdgCd = this.docRfrncCtgryCdgCd+ "," +docRfrncCtgryCdgCd;
	        }
        }
    }
    
    
    
    public String getDocRfrncCtgryCdgDsply() {
        return this.docRfrncCtgryCdgDsply;
    }
    
    public void setDocRfrncCtgryCdgDsply(String docRfrncCtgryCdgDsply) {
        this.docRfrncCtgryCdgDsply = docRfrncCtgryCdgDsply;
    }
    
    public void addDocRfrncCtgryCdgDsply(String docRfrncCtgryCdgDsply) {
    	if( docRfrncCtgryCdgDsply != null ) {
	    	if( this.docRfrncCtgryCdgDsply == null ) {
	        	this.docRfrncCtgryCdgDsply = docRfrncCtgryCdgDsply;
	        } else if(this.docRfrncCtgryCdgDsply.substring(this.docRfrncCtgryCdgDsply.length() - 1).equals("]") & docRfrncCtgryCdgDsply.equals("[")) {
	        	this.docRfrncCtgryCdgDsply = this.docRfrncCtgryCdgDsply+ "," + docRfrncCtgryCdgDsply;
	        } else if(docRfrncCtgryCdgDsply.equals("[") | docRfrncCtgryCdgDsply.equals("]") | this.docRfrncCtgryCdgDsply.substring(this.docRfrncCtgryCdgDsply.length() - 1).equals("[")) {
	        	this.docRfrncCtgryCdgDsply = this.docRfrncCtgryCdgDsply+docRfrncCtgryCdgDsply;
	        } else  {
	            this.docRfrncCtgryCdgDsply = this.docRfrncCtgryCdgDsply+ "," +docRfrncCtgryCdgDsply;
	        }
        }
    }
    
    
    
    public String getDocRfrncCtgryCdgSys() {
        return this.docRfrncCtgryCdgSys;
    }
    
    public void setDocRfrncCtgryCdgSys(String docRfrncCtgryCdgSys) {
        this.docRfrncCtgryCdgSys = docRfrncCtgryCdgSys;
    }
    
    public void addDocRfrncCtgryCdgSys(String docRfrncCtgryCdgSys) {
    	if( docRfrncCtgryCdgSys != null ) {
	    	if( this.docRfrncCtgryCdgSys == null ) {
	        	this.docRfrncCtgryCdgSys = docRfrncCtgryCdgSys;
	        } else if(this.docRfrncCtgryCdgSys.substring(this.docRfrncCtgryCdgSys.length() - 1).equals("]") & docRfrncCtgryCdgSys.equals("[")) {
	        	this.docRfrncCtgryCdgSys = this.docRfrncCtgryCdgSys+ "," + docRfrncCtgryCdgSys;
	        } else if(docRfrncCtgryCdgSys.equals("[") | docRfrncCtgryCdgSys.equals("]") | this.docRfrncCtgryCdgSys.substring(this.docRfrncCtgryCdgSys.length() - 1).equals("[")) {
	        	this.docRfrncCtgryCdgSys = this.docRfrncCtgryCdgSys+docRfrncCtgryCdgSys;
	        } else  {
	            this.docRfrncCtgryCdgSys = this.docRfrncCtgryCdgSys+ "," +docRfrncCtgryCdgSys;
	        }
        }
    }
    
    
    
    public String getDocRfrncCtgryCdgUsrSltd() {
        return this.docRfrncCtgryCdgUsrSltd;
    }
    
    public void setDocRfrncCtgryCdgUsrSltd(String docRfrncCtgryCdgUsrSltd) {
        this.docRfrncCtgryCdgUsrSltd = docRfrncCtgryCdgUsrSltd;
    }
    
    public void addDocRfrncCtgryCdgUsrSltd(String docRfrncCtgryCdgUsrSltd) {
    	if( docRfrncCtgryCdgUsrSltd != null ) {
	    	if( this.docRfrncCtgryCdgUsrSltd == null ) {
	        	this.docRfrncCtgryCdgUsrSltd = docRfrncCtgryCdgUsrSltd;
	        } else if(this.docRfrncCtgryCdgUsrSltd.substring(this.docRfrncCtgryCdgUsrSltd.length() - 1).equals("]") & docRfrncCtgryCdgUsrSltd.equals("[")) {
	        	this.docRfrncCtgryCdgUsrSltd = this.docRfrncCtgryCdgUsrSltd+ "," + docRfrncCtgryCdgUsrSltd;
	        } else if(docRfrncCtgryCdgUsrSltd.equals("[") | docRfrncCtgryCdgUsrSltd.equals("]") | this.docRfrncCtgryCdgUsrSltd.substring(this.docRfrncCtgryCdgUsrSltd.length() - 1).equals("[")) {
	        	this.docRfrncCtgryCdgUsrSltd = this.docRfrncCtgryCdgUsrSltd+docRfrncCtgryCdgUsrSltd;
	        } else  {
	            this.docRfrncCtgryCdgUsrSltd = this.docRfrncCtgryCdgUsrSltd+ "," +docRfrncCtgryCdgUsrSltd;
	        }
        }
    }
    
    
    
    public String getDocRfrncCtgryCdgVrsn() {
        return this.docRfrncCtgryCdgVrsn;
    }
    
    public void setDocRfrncCtgryCdgVrsn(String docRfrncCtgryCdgVrsn) {
        this.docRfrncCtgryCdgVrsn = docRfrncCtgryCdgVrsn;
    }
    
    public void addDocRfrncCtgryCdgVrsn(String docRfrncCtgryCdgVrsn) {
    	if( docRfrncCtgryCdgVrsn != null ) {
	    	if( this.docRfrncCtgryCdgVrsn == null ) {
	        	this.docRfrncCtgryCdgVrsn = docRfrncCtgryCdgVrsn;
	        } else if(this.docRfrncCtgryCdgVrsn.substring(this.docRfrncCtgryCdgVrsn.length() - 1).equals("]") & docRfrncCtgryCdgVrsn.equals("[")) {
	        	this.docRfrncCtgryCdgVrsn = this.docRfrncCtgryCdgVrsn+ "," + docRfrncCtgryCdgVrsn;
	        } else if(docRfrncCtgryCdgVrsn.equals("[") | docRfrncCtgryCdgVrsn.equals("]") | this.docRfrncCtgryCdgVrsn.substring(this.docRfrncCtgryCdgVrsn.length() - 1).equals("[")) {
	        	this.docRfrncCtgryCdgVrsn = this.docRfrncCtgryCdgVrsn+docRfrncCtgryCdgVrsn;
	        } else  {
	            this.docRfrncCtgryCdgVrsn = this.docRfrncCtgryCdgVrsn+ "," +docRfrncCtgryCdgVrsn;
	        }
        }
    }
    
    
    
    public String getDocRfrncCtgryTxt() {
        return this.docRfrncCtgryTxt;
    }
    
    public void setDocRfrncCtgryTxt(String docRfrncCtgryTxt) {
        this.docRfrncCtgryTxt = docRfrncCtgryTxt;
    }
    
    public void addDocRfrncCtgryTxt(String docRfrncCtgryTxt) {
    	if( docRfrncCtgryTxt != null ) {
	    	if( this.docRfrncCtgryTxt == null ) {
	        	this.docRfrncCtgryTxt = docRfrncCtgryTxt;
	        } else if(this.docRfrncCtgryTxt.substring(this.docRfrncCtgryTxt.length() - 1).equals("]") & docRfrncCtgryTxt.equals("[")) {
	        	this.docRfrncCtgryTxt = this.docRfrncCtgryTxt+ "," + docRfrncCtgryTxt;
	        } else if(docRfrncCtgryTxt.equals("[") | docRfrncCtgryTxt.equals("]") | this.docRfrncCtgryTxt.substring(this.docRfrncCtgryTxt.length() - 1).equals("[")) {
	        	this.docRfrncCtgryTxt = this.docRfrncCtgryTxt+docRfrncCtgryTxt;
	        } else  {
	            this.docRfrncCtgryTxt = this.docRfrncCtgryTxt+ "," +docRfrncCtgryTxt;
	        }
        }
    }
    
    
    
    public String getDocRfrncCntntAttchmntCntntTyp() {
        return this.docRfrncCntntAttchmntCntntTyp;
    }
    
    public void setDocRfrncCntntAttchmntCntntTyp(String docRfrncCntntAttchmntCntntTyp) {
        this.docRfrncCntntAttchmntCntntTyp = docRfrncCntntAttchmntCntntTyp;
    }
    
    public void addDocRfrncCntntAttchmntCntntTyp(String docRfrncCntntAttchmntCntntTyp) {
    	if( docRfrncCntntAttchmntCntntTyp != null ) {
	    	if( this.docRfrncCntntAttchmntCntntTyp == null ) {
	        	this.docRfrncCntntAttchmntCntntTyp = docRfrncCntntAttchmntCntntTyp;
	        } else if(this.docRfrncCntntAttchmntCntntTyp.substring(this.docRfrncCntntAttchmntCntntTyp.length() - 1).equals("]") & docRfrncCntntAttchmntCntntTyp.equals("[")) {
	        	this.docRfrncCntntAttchmntCntntTyp = this.docRfrncCntntAttchmntCntntTyp+ "," + docRfrncCntntAttchmntCntntTyp;
	        } else if(docRfrncCntntAttchmntCntntTyp.equals("[") | docRfrncCntntAttchmntCntntTyp.equals("]") | this.docRfrncCntntAttchmntCntntTyp.substring(this.docRfrncCntntAttchmntCntntTyp.length() - 1).equals("[")) {
	        	this.docRfrncCntntAttchmntCntntTyp = this.docRfrncCntntAttchmntCntntTyp+docRfrncCntntAttchmntCntntTyp;
	        } else  {
	            this.docRfrncCntntAttchmntCntntTyp = this.docRfrncCntntAttchmntCntntTyp+ "," +docRfrncCntntAttchmntCntntTyp;
	        }
        }
    }
    
    
    
    public String getDocRfrncCntntAttchmntCreation() {
        return this.docRfrncCntntAttchmntCreation;
    }
    
    public void setDocRfrncCntntAttchmntCreation(String docRfrncCntntAttchmntCreation) {
        this.docRfrncCntntAttchmntCreation = docRfrncCntntAttchmntCreation;
    }
    
    public void addDocRfrncCntntAttchmntCreation(String docRfrncCntntAttchmntCreation) {
    	if( docRfrncCntntAttchmntCreation != null ) {
	    	if( this.docRfrncCntntAttchmntCreation == null ) {
	        	this.docRfrncCntntAttchmntCreation = docRfrncCntntAttchmntCreation;
	        } else if(this.docRfrncCntntAttchmntCreation.substring(this.docRfrncCntntAttchmntCreation.length() - 1).equals("]") & docRfrncCntntAttchmntCreation.equals("[")) {
	        	this.docRfrncCntntAttchmntCreation = this.docRfrncCntntAttchmntCreation+ "," + docRfrncCntntAttchmntCreation;
	        } else if(docRfrncCntntAttchmntCreation.equals("[") | docRfrncCntntAttchmntCreation.equals("]") | this.docRfrncCntntAttchmntCreation.substring(this.docRfrncCntntAttchmntCreation.length() - 1).equals("[")) {
	        	this.docRfrncCntntAttchmntCreation = this.docRfrncCntntAttchmntCreation+docRfrncCntntAttchmntCreation;
	        } else  {
	            this.docRfrncCntntAttchmntCreation = this.docRfrncCntntAttchmntCreation+ "," +docRfrncCntntAttchmntCreation;
	        }
        }
    }
    
    
    
    public String getDocRfrncCntntAttchmntData() {
        return this.docRfrncCntntAttchmntData;
    }
    
    public void setDocRfrncCntntAttchmntData(String docRfrncCntntAttchmntData) {
        this.docRfrncCntntAttchmntData = docRfrncCntntAttchmntData;
    }
    
    public void addDocRfrncCntntAttchmntData(String docRfrncCntntAttchmntData) {
    	if( docRfrncCntntAttchmntData != null ) {
	    	if( this.docRfrncCntntAttchmntData == null ) {
	        	this.docRfrncCntntAttchmntData = docRfrncCntntAttchmntData;
	        } else if(this.docRfrncCntntAttchmntData.substring(this.docRfrncCntntAttchmntData.length() - 1).equals("]") & docRfrncCntntAttchmntData.equals("[")) {
	        	this.docRfrncCntntAttchmntData = this.docRfrncCntntAttchmntData+ "," + docRfrncCntntAttchmntData;
	        } else if(docRfrncCntntAttchmntData.equals("[") | docRfrncCntntAttchmntData.equals("]") | this.docRfrncCntntAttchmntData.substring(this.docRfrncCntntAttchmntData.length() - 1).equals("[")) {
	        	this.docRfrncCntntAttchmntData = this.docRfrncCntntAttchmntData+docRfrncCntntAttchmntData;
	        } else  {
	            this.docRfrncCntntAttchmntData = this.docRfrncCntntAttchmntData+ "," +docRfrncCntntAttchmntData;
	        }
        }
    }
    
    
    
    public String getDocRfrncCntntAttchmntHash() {
        return this.docRfrncCntntAttchmntHash;
    }
    
    public void setDocRfrncCntntAttchmntHash(String docRfrncCntntAttchmntHash) {
        this.docRfrncCntntAttchmntHash = docRfrncCntntAttchmntHash;
    }
    
    public void addDocRfrncCntntAttchmntHash(String docRfrncCntntAttchmntHash) {
    	if( docRfrncCntntAttchmntHash != null ) {
	    	if( this.docRfrncCntntAttchmntHash == null ) {
	        	this.docRfrncCntntAttchmntHash = docRfrncCntntAttchmntHash;
	        } else if(this.docRfrncCntntAttchmntHash.substring(this.docRfrncCntntAttchmntHash.length() - 1).equals("]") & docRfrncCntntAttchmntHash.equals("[")) {
	        	this.docRfrncCntntAttchmntHash = this.docRfrncCntntAttchmntHash+ "," + docRfrncCntntAttchmntHash;
	        } else if(docRfrncCntntAttchmntHash.equals("[") | docRfrncCntntAttchmntHash.equals("]") | this.docRfrncCntntAttchmntHash.substring(this.docRfrncCntntAttchmntHash.length() - 1).equals("[")) {
	        	this.docRfrncCntntAttchmntHash = this.docRfrncCntntAttchmntHash+docRfrncCntntAttchmntHash;
	        } else  {
	            this.docRfrncCntntAttchmntHash = this.docRfrncCntntAttchmntHash+ "," +docRfrncCntntAttchmntHash;
	        }
        }
    }
    
    
    
    public String getDocRfrncCntntAttchmntLnguage() {
        return this.docRfrncCntntAttchmntLnguage;
    }
    
    public void setDocRfrncCntntAttchmntLnguage(String docRfrncCntntAttchmntLnguage) {
        this.docRfrncCntntAttchmntLnguage = docRfrncCntntAttchmntLnguage;
    }
    
    public void addDocRfrncCntntAttchmntLnguage(String docRfrncCntntAttchmntLnguage) {
    	if( docRfrncCntntAttchmntLnguage != null ) {
	    	if( this.docRfrncCntntAttchmntLnguage == null ) {
	        	this.docRfrncCntntAttchmntLnguage = docRfrncCntntAttchmntLnguage;
	        } else if(this.docRfrncCntntAttchmntLnguage.substring(this.docRfrncCntntAttchmntLnguage.length() - 1).equals("]") & docRfrncCntntAttchmntLnguage.equals("[")) {
	        	this.docRfrncCntntAttchmntLnguage = this.docRfrncCntntAttchmntLnguage+ "," + docRfrncCntntAttchmntLnguage;
	        } else if(docRfrncCntntAttchmntLnguage.equals("[") | docRfrncCntntAttchmntLnguage.equals("]") | this.docRfrncCntntAttchmntLnguage.substring(this.docRfrncCntntAttchmntLnguage.length() - 1).equals("[")) {
	        	this.docRfrncCntntAttchmntLnguage = this.docRfrncCntntAttchmntLnguage+docRfrncCntntAttchmntLnguage;
	        } else  {
	            this.docRfrncCntntAttchmntLnguage = this.docRfrncCntntAttchmntLnguage+ "," +docRfrncCntntAttchmntLnguage;
	        }
        }
    }
    
    
    
    public String getDocRfrncCntntAttchmntSz() {
        return this.docRfrncCntntAttchmntSz;
    }
    
    public void setDocRfrncCntntAttchmntSz(String docRfrncCntntAttchmntSz) {
        this.docRfrncCntntAttchmntSz = docRfrncCntntAttchmntSz;
    }
    
    public void addDocRfrncCntntAttchmntSz(String docRfrncCntntAttchmntSz) {
    	if( docRfrncCntntAttchmntSz != null ) {
	    	if( this.docRfrncCntntAttchmntSz == null ) {
	        	this.docRfrncCntntAttchmntSz = docRfrncCntntAttchmntSz;
	        } else if(this.docRfrncCntntAttchmntSz.substring(this.docRfrncCntntAttchmntSz.length() - 1).equals("]") & docRfrncCntntAttchmntSz.equals("[")) {
	        	this.docRfrncCntntAttchmntSz = this.docRfrncCntntAttchmntSz+ "," + docRfrncCntntAttchmntSz;
	        } else if(docRfrncCntntAttchmntSz.equals("[") | docRfrncCntntAttchmntSz.equals("]") | this.docRfrncCntntAttchmntSz.substring(this.docRfrncCntntAttchmntSz.length() - 1).equals("[")) {
	        	this.docRfrncCntntAttchmntSz = this.docRfrncCntntAttchmntSz+docRfrncCntntAttchmntSz;
	        } else  {
	            this.docRfrncCntntAttchmntSz = this.docRfrncCntntAttchmntSz+ "," +docRfrncCntntAttchmntSz;
	        }
        }
    }
    
    
    
    public String getDocRfrncCntntAttchmntTtl() {
        return this.docRfrncCntntAttchmntTtl;
    }
    
    public void setDocRfrncCntntAttchmntTtl(String docRfrncCntntAttchmntTtl) {
        this.docRfrncCntntAttchmntTtl = docRfrncCntntAttchmntTtl;
    }
    
    public void addDocRfrncCntntAttchmntTtl(String docRfrncCntntAttchmntTtl) {
    	if( docRfrncCntntAttchmntTtl != null ) {
	    	if( this.docRfrncCntntAttchmntTtl == null ) {
	        	this.docRfrncCntntAttchmntTtl = docRfrncCntntAttchmntTtl;
	        } else if(this.docRfrncCntntAttchmntTtl.substring(this.docRfrncCntntAttchmntTtl.length() - 1).equals("]") & docRfrncCntntAttchmntTtl.equals("[")) {
	        	this.docRfrncCntntAttchmntTtl = this.docRfrncCntntAttchmntTtl+ "," + docRfrncCntntAttchmntTtl;
	        } else if(docRfrncCntntAttchmntTtl.equals("[") | docRfrncCntntAttchmntTtl.equals("]") | this.docRfrncCntntAttchmntTtl.substring(this.docRfrncCntntAttchmntTtl.length() - 1).equals("[")) {
	        	this.docRfrncCntntAttchmntTtl = this.docRfrncCntntAttchmntTtl+docRfrncCntntAttchmntTtl;
	        } else  {
	            this.docRfrncCntntAttchmntTtl = this.docRfrncCntntAttchmntTtl+ "," +docRfrncCntntAttchmntTtl;
	        }
        }
    }
    
    
    
    public String getDocRfrncCntntAttchmntUrl() {
        return this.docRfrncCntntAttchmntUrl;
    }
    
    public void setDocRfrncCntntAttchmntUrl(String docRfrncCntntAttchmntUrl) {
        this.docRfrncCntntAttchmntUrl = docRfrncCntntAttchmntUrl;
    }
    
    public void addDocRfrncCntntAttchmntUrl(String docRfrncCntntAttchmntUrl) {
    	if( docRfrncCntntAttchmntUrl != null ) {
	    	if( this.docRfrncCntntAttchmntUrl == null ) {
	        	this.docRfrncCntntAttchmntUrl = docRfrncCntntAttchmntUrl;
	        } else if(this.docRfrncCntntAttchmntUrl.substring(this.docRfrncCntntAttchmntUrl.length() - 1).equals("]") & docRfrncCntntAttchmntUrl.equals("[")) {
	        	this.docRfrncCntntAttchmntUrl = this.docRfrncCntntAttchmntUrl+ "," + docRfrncCntntAttchmntUrl;
	        } else if(docRfrncCntntAttchmntUrl.equals("[") | docRfrncCntntAttchmntUrl.equals("]") | this.docRfrncCntntAttchmntUrl.substring(this.docRfrncCntntAttchmntUrl.length() - 1).equals("[")) {
	        	this.docRfrncCntntAttchmntUrl = this.docRfrncCntntAttchmntUrl+docRfrncCntntAttchmntUrl;
	        } else  {
	            this.docRfrncCntntAttchmntUrl = this.docRfrncCntntAttchmntUrl+ "," +docRfrncCntntAttchmntUrl;
	        }
        }
    }
    
    
    
    public String getDocRfrncCntntFrmatCd() {
        return this.docRfrncCntntFrmatCd;
    }
    
    public void setDocRfrncCntntFrmatCd(String docRfrncCntntFrmatCd) {
        this.docRfrncCntntFrmatCd = docRfrncCntntFrmatCd;
    }
    
    public void addDocRfrncCntntFrmatCd(String docRfrncCntntFrmatCd) {
    	if( docRfrncCntntFrmatCd != null ) {
	    	if( this.docRfrncCntntFrmatCd == null ) {
	        	this.docRfrncCntntFrmatCd = docRfrncCntntFrmatCd;
	        } else if(this.docRfrncCntntFrmatCd.substring(this.docRfrncCntntFrmatCd.length() - 1).equals("]") & docRfrncCntntFrmatCd.equals("[")) {
	        	this.docRfrncCntntFrmatCd = this.docRfrncCntntFrmatCd+ "," + docRfrncCntntFrmatCd;
	        } else if(docRfrncCntntFrmatCd.equals("[") | docRfrncCntntFrmatCd.equals("]") | this.docRfrncCntntFrmatCd.substring(this.docRfrncCntntFrmatCd.length() - 1).equals("[")) {
	        	this.docRfrncCntntFrmatCd = this.docRfrncCntntFrmatCd+docRfrncCntntFrmatCd;
	        } else  {
	            this.docRfrncCntntFrmatCd = this.docRfrncCntntFrmatCd+ "," +docRfrncCntntFrmatCd;
	        }
        }
    }
    
    
    
    public String getDocRfrncCntntFrmatDsply() {
        return this.docRfrncCntntFrmatDsply;
    }
    
    public void setDocRfrncCntntFrmatDsply(String docRfrncCntntFrmatDsply) {
        this.docRfrncCntntFrmatDsply = docRfrncCntntFrmatDsply;
    }
    
    public void addDocRfrncCntntFrmatDsply(String docRfrncCntntFrmatDsply) {
    	if( docRfrncCntntFrmatDsply != null ) {
	    	if( this.docRfrncCntntFrmatDsply == null ) {
	        	this.docRfrncCntntFrmatDsply = docRfrncCntntFrmatDsply;
	        } else if(this.docRfrncCntntFrmatDsply.substring(this.docRfrncCntntFrmatDsply.length() - 1).equals("]") & docRfrncCntntFrmatDsply.equals("[")) {
	        	this.docRfrncCntntFrmatDsply = this.docRfrncCntntFrmatDsply+ "," + docRfrncCntntFrmatDsply;
	        } else if(docRfrncCntntFrmatDsply.equals("[") | docRfrncCntntFrmatDsply.equals("]") | this.docRfrncCntntFrmatDsply.substring(this.docRfrncCntntFrmatDsply.length() - 1).equals("[")) {
	        	this.docRfrncCntntFrmatDsply = this.docRfrncCntntFrmatDsply+docRfrncCntntFrmatDsply;
	        } else  {
	            this.docRfrncCntntFrmatDsply = this.docRfrncCntntFrmatDsply+ "," +docRfrncCntntFrmatDsply;
	        }
        }
    }
    
    
    
    public String getDocRfrncCntntFrmatSys() {
        return this.docRfrncCntntFrmatSys;
    }
    
    public void setDocRfrncCntntFrmatSys(String docRfrncCntntFrmatSys) {
        this.docRfrncCntntFrmatSys = docRfrncCntntFrmatSys;
    }
    
    public void addDocRfrncCntntFrmatSys(String docRfrncCntntFrmatSys) {
    	if( docRfrncCntntFrmatSys != null ) {
	    	if( this.docRfrncCntntFrmatSys == null ) {
	        	this.docRfrncCntntFrmatSys = docRfrncCntntFrmatSys;
	        } else if(this.docRfrncCntntFrmatSys.substring(this.docRfrncCntntFrmatSys.length() - 1).equals("]") & docRfrncCntntFrmatSys.equals("[")) {
	        	this.docRfrncCntntFrmatSys = this.docRfrncCntntFrmatSys+ "," + docRfrncCntntFrmatSys;
	        } else if(docRfrncCntntFrmatSys.equals("[") | docRfrncCntntFrmatSys.equals("]") | this.docRfrncCntntFrmatSys.substring(this.docRfrncCntntFrmatSys.length() - 1).equals("[")) {
	        	this.docRfrncCntntFrmatSys = this.docRfrncCntntFrmatSys+docRfrncCntntFrmatSys;
	        } else  {
	            this.docRfrncCntntFrmatSys = this.docRfrncCntntFrmatSys+ "," +docRfrncCntntFrmatSys;
	        }
        }
    }
    
    
    
    public String getDocRfrncCntntFrmatUsrSltd() {
        return this.docRfrncCntntFrmatUsrSltd;
    }
    
    public void setDocRfrncCntntFrmatUsrSltd(String docRfrncCntntFrmatUsrSltd) {
        this.docRfrncCntntFrmatUsrSltd = docRfrncCntntFrmatUsrSltd;
    }
    
    public void addDocRfrncCntntFrmatUsrSltd(String docRfrncCntntFrmatUsrSltd) {
    	if( docRfrncCntntFrmatUsrSltd != null ) {
	    	if( this.docRfrncCntntFrmatUsrSltd == null ) {
	        	this.docRfrncCntntFrmatUsrSltd = docRfrncCntntFrmatUsrSltd;
	        } else if(this.docRfrncCntntFrmatUsrSltd.substring(this.docRfrncCntntFrmatUsrSltd.length() - 1).equals("]") & docRfrncCntntFrmatUsrSltd.equals("[")) {
	        	this.docRfrncCntntFrmatUsrSltd = this.docRfrncCntntFrmatUsrSltd+ "," + docRfrncCntntFrmatUsrSltd;
	        } else if(docRfrncCntntFrmatUsrSltd.equals("[") | docRfrncCntntFrmatUsrSltd.equals("]") | this.docRfrncCntntFrmatUsrSltd.substring(this.docRfrncCntntFrmatUsrSltd.length() - 1).equals("[")) {
	        	this.docRfrncCntntFrmatUsrSltd = this.docRfrncCntntFrmatUsrSltd+docRfrncCntntFrmatUsrSltd;
	        } else  {
	            this.docRfrncCntntFrmatUsrSltd = this.docRfrncCntntFrmatUsrSltd+ "," +docRfrncCntntFrmatUsrSltd;
	        }
        }
    }
    
    
    
    public String getDocRfrncCntntFrmatVrsn() {
        return this.docRfrncCntntFrmatVrsn;
    }
    
    public void setDocRfrncCntntFrmatVrsn(String docRfrncCntntFrmatVrsn) {
        this.docRfrncCntntFrmatVrsn = docRfrncCntntFrmatVrsn;
    }
    
    public void addDocRfrncCntntFrmatVrsn(String docRfrncCntntFrmatVrsn) {
    	if( docRfrncCntntFrmatVrsn != null ) {
	    	if( this.docRfrncCntntFrmatVrsn == null ) {
	        	this.docRfrncCntntFrmatVrsn = docRfrncCntntFrmatVrsn;
	        } else if(this.docRfrncCntntFrmatVrsn.substring(this.docRfrncCntntFrmatVrsn.length() - 1).equals("]") & docRfrncCntntFrmatVrsn.equals("[")) {
	        	this.docRfrncCntntFrmatVrsn = this.docRfrncCntntFrmatVrsn+ "," + docRfrncCntntFrmatVrsn;
	        } else if(docRfrncCntntFrmatVrsn.equals("[") | docRfrncCntntFrmatVrsn.equals("]") | this.docRfrncCntntFrmatVrsn.substring(this.docRfrncCntntFrmatVrsn.length() - 1).equals("[")) {
	        	this.docRfrncCntntFrmatVrsn = this.docRfrncCntntFrmatVrsn+docRfrncCntntFrmatVrsn;
	        } else  {
	            this.docRfrncCntntFrmatVrsn = this.docRfrncCntntFrmatVrsn+ "," +docRfrncCntntFrmatVrsn;
	        }
        }
    }
    
    
    
    public String getDocRfrncCntxtEnc() {
        return this.docRfrncCntxtEnc;
    }
    
    public void setDocRfrncCntxtEnc(String docRfrncCntxtEnc) {
        this.docRfrncCntxtEnc = docRfrncCntxtEnc;
    }
    
    public void addDocRfrncCntxtEnc(String docRfrncCntxtEnc) {
    	if( docRfrncCntxtEnc != null ) {
	    	if( this.docRfrncCntxtEnc == null ) {
	        	this.docRfrncCntxtEnc = docRfrncCntxtEnc;
	        } else if(this.docRfrncCntxtEnc.substring(this.docRfrncCntxtEnc.length() - 1).equals("]") & docRfrncCntxtEnc.equals("[")) {
	        	this.docRfrncCntxtEnc = this.docRfrncCntxtEnc+ "," + docRfrncCntxtEnc;
	        } else if(docRfrncCntxtEnc.equals("[") | docRfrncCntxtEnc.equals("]") | this.docRfrncCntxtEnc.substring(this.docRfrncCntxtEnc.length() - 1).equals("[")) {
	        	this.docRfrncCntxtEnc = this.docRfrncCntxtEnc+docRfrncCntxtEnc;
	        } else  {
	            this.docRfrncCntxtEnc = this.docRfrncCntxtEnc+ "," +docRfrncCntxtEnc;
	        }
        }
    }
    
    
    
    public String getDocRfrncCntxtEvntCdgCd() {
        return this.docRfrncCntxtEvntCdgCd;
    }
    
    public void setDocRfrncCntxtEvntCdgCd(String docRfrncCntxtEvntCdgCd) {
        this.docRfrncCntxtEvntCdgCd = docRfrncCntxtEvntCdgCd;
    }
    
    public void addDocRfrncCntxtEvntCdgCd(String docRfrncCntxtEvntCdgCd) {
    	if( docRfrncCntxtEvntCdgCd != null ) {
	    	if( this.docRfrncCntxtEvntCdgCd == null ) {
	        	this.docRfrncCntxtEvntCdgCd = docRfrncCntxtEvntCdgCd;
	        } else if(this.docRfrncCntxtEvntCdgCd.substring(this.docRfrncCntxtEvntCdgCd.length() - 1).equals("]") & docRfrncCntxtEvntCdgCd.equals("[")) {
	        	this.docRfrncCntxtEvntCdgCd = this.docRfrncCntxtEvntCdgCd+ "," + docRfrncCntxtEvntCdgCd;
	        } else if(docRfrncCntxtEvntCdgCd.equals("[") | docRfrncCntxtEvntCdgCd.equals("]") | this.docRfrncCntxtEvntCdgCd.substring(this.docRfrncCntxtEvntCdgCd.length() - 1).equals("[")) {
	        	this.docRfrncCntxtEvntCdgCd = this.docRfrncCntxtEvntCdgCd+docRfrncCntxtEvntCdgCd;
	        } else  {
	            this.docRfrncCntxtEvntCdgCd = this.docRfrncCntxtEvntCdgCd+ "," +docRfrncCntxtEvntCdgCd;
	        }
        }
    }
    
    
    
    public String getDocRfrncCntxtEvntCdgDsply() {
        return this.docRfrncCntxtEvntCdgDsply;
    }
    
    public void setDocRfrncCntxtEvntCdgDsply(String docRfrncCntxtEvntCdgDsply) {
        this.docRfrncCntxtEvntCdgDsply = docRfrncCntxtEvntCdgDsply;
    }
    
    public void addDocRfrncCntxtEvntCdgDsply(String docRfrncCntxtEvntCdgDsply) {
    	if( docRfrncCntxtEvntCdgDsply != null ) {
	    	if( this.docRfrncCntxtEvntCdgDsply == null ) {
	        	this.docRfrncCntxtEvntCdgDsply = docRfrncCntxtEvntCdgDsply;
	        } else if(this.docRfrncCntxtEvntCdgDsply.substring(this.docRfrncCntxtEvntCdgDsply.length() - 1).equals("]") & docRfrncCntxtEvntCdgDsply.equals("[")) {
	        	this.docRfrncCntxtEvntCdgDsply = this.docRfrncCntxtEvntCdgDsply+ "," + docRfrncCntxtEvntCdgDsply;
	        } else if(docRfrncCntxtEvntCdgDsply.equals("[") | docRfrncCntxtEvntCdgDsply.equals("]") | this.docRfrncCntxtEvntCdgDsply.substring(this.docRfrncCntxtEvntCdgDsply.length() - 1).equals("[")) {
	        	this.docRfrncCntxtEvntCdgDsply = this.docRfrncCntxtEvntCdgDsply+docRfrncCntxtEvntCdgDsply;
	        } else  {
	            this.docRfrncCntxtEvntCdgDsply = this.docRfrncCntxtEvntCdgDsply+ "," +docRfrncCntxtEvntCdgDsply;
	        }
        }
    }
    
    
    
    public String getDocRfrncCntxtEvntCdgSys() {
        return this.docRfrncCntxtEvntCdgSys;
    }
    
    public void setDocRfrncCntxtEvntCdgSys(String docRfrncCntxtEvntCdgSys) {
        this.docRfrncCntxtEvntCdgSys = docRfrncCntxtEvntCdgSys;
    }
    
    public void addDocRfrncCntxtEvntCdgSys(String docRfrncCntxtEvntCdgSys) {
    	if( docRfrncCntxtEvntCdgSys != null ) {
	    	if( this.docRfrncCntxtEvntCdgSys == null ) {
	        	this.docRfrncCntxtEvntCdgSys = docRfrncCntxtEvntCdgSys;
	        } else if(this.docRfrncCntxtEvntCdgSys.substring(this.docRfrncCntxtEvntCdgSys.length() - 1).equals("]") & docRfrncCntxtEvntCdgSys.equals("[")) {
	        	this.docRfrncCntxtEvntCdgSys = this.docRfrncCntxtEvntCdgSys+ "," + docRfrncCntxtEvntCdgSys;
	        } else if(docRfrncCntxtEvntCdgSys.equals("[") | docRfrncCntxtEvntCdgSys.equals("]") | this.docRfrncCntxtEvntCdgSys.substring(this.docRfrncCntxtEvntCdgSys.length() - 1).equals("[")) {
	        	this.docRfrncCntxtEvntCdgSys = this.docRfrncCntxtEvntCdgSys+docRfrncCntxtEvntCdgSys;
	        } else  {
	            this.docRfrncCntxtEvntCdgSys = this.docRfrncCntxtEvntCdgSys+ "," +docRfrncCntxtEvntCdgSys;
	        }
        }
    }
    
    
    
    public String getDocRfrncCntxtEvntCdgUsrSltd() {
        return this.docRfrncCntxtEvntCdgUsrSltd;
    }
    
    public void setDocRfrncCntxtEvntCdgUsrSltd(String docRfrncCntxtEvntCdgUsrSltd) {
        this.docRfrncCntxtEvntCdgUsrSltd = docRfrncCntxtEvntCdgUsrSltd;
    }
    
    public void addDocRfrncCntxtEvntCdgUsrSltd(String docRfrncCntxtEvntCdgUsrSltd) {
    	if( docRfrncCntxtEvntCdgUsrSltd != null ) {
	    	if( this.docRfrncCntxtEvntCdgUsrSltd == null ) {
	        	this.docRfrncCntxtEvntCdgUsrSltd = docRfrncCntxtEvntCdgUsrSltd;
	        } else if(this.docRfrncCntxtEvntCdgUsrSltd.substring(this.docRfrncCntxtEvntCdgUsrSltd.length() - 1).equals("]") & docRfrncCntxtEvntCdgUsrSltd.equals("[")) {
	        	this.docRfrncCntxtEvntCdgUsrSltd = this.docRfrncCntxtEvntCdgUsrSltd+ "," + docRfrncCntxtEvntCdgUsrSltd;
	        } else if(docRfrncCntxtEvntCdgUsrSltd.equals("[") | docRfrncCntxtEvntCdgUsrSltd.equals("]") | this.docRfrncCntxtEvntCdgUsrSltd.substring(this.docRfrncCntxtEvntCdgUsrSltd.length() - 1).equals("[")) {
	        	this.docRfrncCntxtEvntCdgUsrSltd = this.docRfrncCntxtEvntCdgUsrSltd+docRfrncCntxtEvntCdgUsrSltd;
	        } else  {
	            this.docRfrncCntxtEvntCdgUsrSltd = this.docRfrncCntxtEvntCdgUsrSltd+ "," +docRfrncCntxtEvntCdgUsrSltd;
	        }
        }
    }
    
    
    
    public String getDocRfrncCntxtEvntCdgVrsn() {
        return this.docRfrncCntxtEvntCdgVrsn;
    }
    
    public void setDocRfrncCntxtEvntCdgVrsn(String docRfrncCntxtEvntCdgVrsn) {
        this.docRfrncCntxtEvntCdgVrsn = docRfrncCntxtEvntCdgVrsn;
    }
    
    public void addDocRfrncCntxtEvntCdgVrsn(String docRfrncCntxtEvntCdgVrsn) {
    	if( docRfrncCntxtEvntCdgVrsn != null ) {
	    	if( this.docRfrncCntxtEvntCdgVrsn == null ) {
	        	this.docRfrncCntxtEvntCdgVrsn = docRfrncCntxtEvntCdgVrsn;
	        } else if(this.docRfrncCntxtEvntCdgVrsn.substring(this.docRfrncCntxtEvntCdgVrsn.length() - 1).equals("]") & docRfrncCntxtEvntCdgVrsn.equals("[")) {
	        	this.docRfrncCntxtEvntCdgVrsn = this.docRfrncCntxtEvntCdgVrsn+ "," + docRfrncCntxtEvntCdgVrsn;
	        } else if(docRfrncCntxtEvntCdgVrsn.equals("[") | docRfrncCntxtEvntCdgVrsn.equals("]") | this.docRfrncCntxtEvntCdgVrsn.substring(this.docRfrncCntxtEvntCdgVrsn.length() - 1).equals("[")) {
	        	this.docRfrncCntxtEvntCdgVrsn = this.docRfrncCntxtEvntCdgVrsn+docRfrncCntxtEvntCdgVrsn;
	        } else  {
	            this.docRfrncCntxtEvntCdgVrsn = this.docRfrncCntxtEvntCdgVrsn+ "," +docRfrncCntxtEvntCdgVrsn;
	        }
        }
    }
    
    
    
    public String getDocRfrncCntxtEvntTxt() {
        return this.docRfrncCntxtEvntTxt;
    }
    
    public void setDocRfrncCntxtEvntTxt(String docRfrncCntxtEvntTxt) {
        this.docRfrncCntxtEvntTxt = docRfrncCntxtEvntTxt;
    }
    
    public void addDocRfrncCntxtEvntTxt(String docRfrncCntxtEvntTxt) {
    	if( docRfrncCntxtEvntTxt != null ) {
	    	if( this.docRfrncCntxtEvntTxt == null ) {
	        	this.docRfrncCntxtEvntTxt = docRfrncCntxtEvntTxt;
	        } else if(this.docRfrncCntxtEvntTxt.substring(this.docRfrncCntxtEvntTxt.length() - 1).equals("]") & docRfrncCntxtEvntTxt.equals("[")) {
	        	this.docRfrncCntxtEvntTxt = this.docRfrncCntxtEvntTxt+ "," + docRfrncCntxtEvntTxt;
	        } else if(docRfrncCntxtEvntTxt.equals("[") | docRfrncCntxtEvntTxt.equals("]") | this.docRfrncCntxtEvntTxt.substring(this.docRfrncCntxtEvntTxt.length() - 1).equals("[")) {
	        	this.docRfrncCntxtEvntTxt = this.docRfrncCntxtEvntTxt+docRfrncCntxtEvntTxt;
	        } else  {
	            this.docRfrncCntxtEvntTxt = this.docRfrncCntxtEvntTxt+ "," +docRfrncCntxtEvntTxt;
	        }
        }
    }
    
    
    
    public String getDocRfrncCntxtFacilityTypCdgCd() {
        return this.docRfrncCntxtFacilityTypCdgCd;
    }
    
    public void setDocRfrncCntxtFacilityTypCdgCd(String docRfrncCntxtFacilityTypCdgCd) {
        this.docRfrncCntxtFacilityTypCdgCd = docRfrncCntxtFacilityTypCdgCd;
    }
    
    public void addDocRfrncCntxtFacilityTypCdgCd(String docRfrncCntxtFacilityTypCdgCd) {
    	if( docRfrncCntxtFacilityTypCdgCd != null ) {
	    	if( this.docRfrncCntxtFacilityTypCdgCd == null ) {
	        	this.docRfrncCntxtFacilityTypCdgCd = docRfrncCntxtFacilityTypCdgCd;
	        } else if(this.docRfrncCntxtFacilityTypCdgCd.substring(this.docRfrncCntxtFacilityTypCdgCd.length() - 1).equals("]") & docRfrncCntxtFacilityTypCdgCd.equals("[")) {
	        	this.docRfrncCntxtFacilityTypCdgCd = this.docRfrncCntxtFacilityTypCdgCd+ "," + docRfrncCntxtFacilityTypCdgCd;
	        } else if(docRfrncCntxtFacilityTypCdgCd.equals("[") | docRfrncCntxtFacilityTypCdgCd.equals("]") | this.docRfrncCntxtFacilityTypCdgCd.substring(this.docRfrncCntxtFacilityTypCdgCd.length() - 1).equals("[")) {
	        	this.docRfrncCntxtFacilityTypCdgCd = this.docRfrncCntxtFacilityTypCdgCd+docRfrncCntxtFacilityTypCdgCd;
	        } else  {
	            this.docRfrncCntxtFacilityTypCdgCd = this.docRfrncCntxtFacilityTypCdgCd+ "," +docRfrncCntxtFacilityTypCdgCd;
	        }
        }
    }
    
    
    
    public String getDocRfrncCntxtFacilityTypCdgDsply() {
        return this.docRfrncCntxtFacilityTypCdgDsply;
    }
    
    public void setDocRfrncCntxtFacilityTypCdgDsply(String docRfrncCntxtFacilityTypCdgDsply) {
        this.docRfrncCntxtFacilityTypCdgDsply = docRfrncCntxtFacilityTypCdgDsply;
    }
    
    public void addDocRfrncCntxtFacilityTypCdgDsply(String docRfrncCntxtFacilityTypCdgDsply) {
    	if( docRfrncCntxtFacilityTypCdgDsply != null ) {
	    	if( this.docRfrncCntxtFacilityTypCdgDsply == null ) {
	        	this.docRfrncCntxtFacilityTypCdgDsply = docRfrncCntxtFacilityTypCdgDsply;
	        } else if(this.docRfrncCntxtFacilityTypCdgDsply.substring(this.docRfrncCntxtFacilityTypCdgDsply.length() - 1).equals("]") & docRfrncCntxtFacilityTypCdgDsply.equals("[")) {
	        	this.docRfrncCntxtFacilityTypCdgDsply = this.docRfrncCntxtFacilityTypCdgDsply+ "," + docRfrncCntxtFacilityTypCdgDsply;
	        } else if(docRfrncCntxtFacilityTypCdgDsply.equals("[") | docRfrncCntxtFacilityTypCdgDsply.equals("]") | this.docRfrncCntxtFacilityTypCdgDsply.substring(this.docRfrncCntxtFacilityTypCdgDsply.length() - 1).equals("[")) {
	        	this.docRfrncCntxtFacilityTypCdgDsply = this.docRfrncCntxtFacilityTypCdgDsply+docRfrncCntxtFacilityTypCdgDsply;
	        } else  {
	            this.docRfrncCntxtFacilityTypCdgDsply = this.docRfrncCntxtFacilityTypCdgDsply+ "," +docRfrncCntxtFacilityTypCdgDsply;
	        }
        }
    }
    
    
    
    public String getDocRfrncCntxtFacilityTypCdgSys() {
        return this.docRfrncCntxtFacilityTypCdgSys;
    }
    
    public void setDocRfrncCntxtFacilityTypCdgSys(String docRfrncCntxtFacilityTypCdgSys) {
        this.docRfrncCntxtFacilityTypCdgSys = docRfrncCntxtFacilityTypCdgSys;
    }
    
    public void addDocRfrncCntxtFacilityTypCdgSys(String docRfrncCntxtFacilityTypCdgSys) {
    	if( docRfrncCntxtFacilityTypCdgSys != null ) {
	    	if( this.docRfrncCntxtFacilityTypCdgSys == null ) {
	        	this.docRfrncCntxtFacilityTypCdgSys = docRfrncCntxtFacilityTypCdgSys;
	        } else if(this.docRfrncCntxtFacilityTypCdgSys.substring(this.docRfrncCntxtFacilityTypCdgSys.length() - 1).equals("]") & docRfrncCntxtFacilityTypCdgSys.equals("[")) {
	        	this.docRfrncCntxtFacilityTypCdgSys = this.docRfrncCntxtFacilityTypCdgSys+ "," + docRfrncCntxtFacilityTypCdgSys;
	        } else if(docRfrncCntxtFacilityTypCdgSys.equals("[") | docRfrncCntxtFacilityTypCdgSys.equals("]") | this.docRfrncCntxtFacilityTypCdgSys.substring(this.docRfrncCntxtFacilityTypCdgSys.length() - 1).equals("[")) {
	        	this.docRfrncCntxtFacilityTypCdgSys = this.docRfrncCntxtFacilityTypCdgSys+docRfrncCntxtFacilityTypCdgSys;
	        } else  {
	            this.docRfrncCntxtFacilityTypCdgSys = this.docRfrncCntxtFacilityTypCdgSys+ "," +docRfrncCntxtFacilityTypCdgSys;
	        }
        }
    }
    
    
    
    public String getDocRfrncCntxtFacilityTypCdgUsrSltd() {
        return this.docRfrncCntxtFacilityTypCdgUsrSltd;
    }
    
    public void setDocRfrncCntxtFacilityTypCdgUsrSltd(String docRfrncCntxtFacilityTypCdgUsrSltd) {
        this.docRfrncCntxtFacilityTypCdgUsrSltd = docRfrncCntxtFacilityTypCdgUsrSltd;
    }
    
    public void addDocRfrncCntxtFacilityTypCdgUsrSltd(String docRfrncCntxtFacilityTypCdgUsrSltd) {
    	if( docRfrncCntxtFacilityTypCdgUsrSltd != null ) {
	    	if( this.docRfrncCntxtFacilityTypCdgUsrSltd == null ) {
	        	this.docRfrncCntxtFacilityTypCdgUsrSltd = docRfrncCntxtFacilityTypCdgUsrSltd;
	        } else if(this.docRfrncCntxtFacilityTypCdgUsrSltd.substring(this.docRfrncCntxtFacilityTypCdgUsrSltd.length() - 1).equals("]") & docRfrncCntxtFacilityTypCdgUsrSltd.equals("[")) {
	        	this.docRfrncCntxtFacilityTypCdgUsrSltd = this.docRfrncCntxtFacilityTypCdgUsrSltd+ "," + docRfrncCntxtFacilityTypCdgUsrSltd;
	        } else if(docRfrncCntxtFacilityTypCdgUsrSltd.equals("[") | docRfrncCntxtFacilityTypCdgUsrSltd.equals("]") | this.docRfrncCntxtFacilityTypCdgUsrSltd.substring(this.docRfrncCntxtFacilityTypCdgUsrSltd.length() - 1).equals("[")) {
	        	this.docRfrncCntxtFacilityTypCdgUsrSltd = this.docRfrncCntxtFacilityTypCdgUsrSltd+docRfrncCntxtFacilityTypCdgUsrSltd;
	        } else  {
	            this.docRfrncCntxtFacilityTypCdgUsrSltd = this.docRfrncCntxtFacilityTypCdgUsrSltd+ "," +docRfrncCntxtFacilityTypCdgUsrSltd;
	        }
        }
    }
    
    
    
    public String getDocRfrncCntxtFacilityTypCdgVrsn() {
        return this.docRfrncCntxtFacilityTypCdgVrsn;
    }
    
    public void setDocRfrncCntxtFacilityTypCdgVrsn(String docRfrncCntxtFacilityTypCdgVrsn) {
        this.docRfrncCntxtFacilityTypCdgVrsn = docRfrncCntxtFacilityTypCdgVrsn;
    }
    
    public void addDocRfrncCntxtFacilityTypCdgVrsn(String docRfrncCntxtFacilityTypCdgVrsn) {
    	if( docRfrncCntxtFacilityTypCdgVrsn != null ) {
	    	if( this.docRfrncCntxtFacilityTypCdgVrsn == null ) {
	        	this.docRfrncCntxtFacilityTypCdgVrsn = docRfrncCntxtFacilityTypCdgVrsn;
	        } else if(this.docRfrncCntxtFacilityTypCdgVrsn.substring(this.docRfrncCntxtFacilityTypCdgVrsn.length() - 1).equals("]") & docRfrncCntxtFacilityTypCdgVrsn.equals("[")) {
	        	this.docRfrncCntxtFacilityTypCdgVrsn = this.docRfrncCntxtFacilityTypCdgVrsn+ "," + docRfrncCntxtFacilityTypCdgVrsn;
	        } else if(docRfrncCntxtFacilityTypCdgVrsn.equals("[") | docRfrncCntxtFacilityTypCdgVrsn.equals("]") | this.docRfrncCntxtFacilityTypCdgVrsn.substring(this.docRfrncCntxtFacilityTypCdgVrsn.length() - 1).equals("[")) {
	        	this.docRfrncCntxtFacilityTypCdgVrsn = this.docRfrncCntxtFacilityTypCdgVrsn+docRfrncCntxtFacilityTypCdgVrsn;
	        } else  {
	            this.docRfrncCntxtFacilityTypCdgVrsn = this.docRfrncCntxtFacilityTypCdgVrsn+ "," +docRfrncCntxtFacilityTypCdgVrsn;
	        }
        }
    }
    
    
    
    public String getDocRfrncCntxtFacilityTypTxt() {
        return this.docRfrncCntxtFacilityTypTxt;
    }
    
    public void setDocRfrncCntxtFacilityTypTxt(String docRfrncCntxtFacilityTypTxt) {
        this.docRfrncCntxtFacilityTypTxt = docRfrncCntxtFacilityTypTxt;
    }
    
    public void addDocRfrncCntxtFacilityTypTxt(String docRfrncCntxtFacilityTypTxt) {
    	if( docRfrncCntxtFacilityTypTxt != null ) {
	    	if( this.docRfrncCntxtFacilityTypTxt == null ) {
	        	this.docRfrncCntxtFacilityTypTxt = docRfrncCntxtFacilityTypTxt;
	        } else if(this.docRfrncCntxtFacilityTypTxt.substring(this.docRfrncCntxtFacilityTypTxt.length() - 1).equals("]") & docRfrncCntxtFacilityTypTxt.equals("[")) {
	        	this.docRfrncCntxtFacilityTypTxt = this.docRfrncCntxtFacilityTypTxt+ "," + docRfrncCntxtFacilityTypTxt;
	        } else if(docRfrncCntxtFacilityTypTxt.equals("[") | docRfrncCntxtFacilityTypTxt.equals("]") | this.docRfrncCntxtFacilityTypTxt.substring(this.docRfrncCntxtFacilityTypTxt.length() - 1).equals("[")) {
	        	this.docRfrncCntxtFacilityTypTxt = this.docRfrncCntxtFacilityTypTxt+docRfrncCntxtFacilityTypTxt;
	        } else  {
	            this.docRfrncCntxtFacilityTypTxt = this.docRfrncCntxtFacilityTypTxt+ "," +docRfrncCntxtFacilityTypTxt;
	        }
        }
    }
    
    
    
    public String getDocRfrncCntxtPrdEnd() {
        return this.docRfrncCntxtPrdEnd;
    }
    
    public void setDocRfrncCntxtPrdEnd(String docRfrncCntxtPrdEnd) {
        this.docRfrncCntxtPrdEnd = docRfrncCntxtPrdEnd;
    }
    
    public void addDocRfrncCntxtPrdEnd(String docRfrncCntxtPrdEnd) {
    	if( docRfrncCntxtPrdEnd != null ) {
	    	if( this.docRfrncCntxtPrdEnd == null ) {
	        	this.docRfrncCntxtPrdEnd = docRfrncCntxtPrdEnd;
	        } else if(this.docRfrncCntxtPrdEnd.substring(this.docRfrncCntxtPrdEnd.length() - 1).equals("]") & docRfrncCntxtPrdEnd.equals("[")) {
	        	this.docRfrncCntxtPrdEnd = this.docRfrncCntxtPrdEnd+ "," + docRfrncCntxtPrdEnd;
	        } else if(docRfrncCntxtPrdEnd.equals("[") | docRfrncCntxtPrdEnd.equals("]") | this.docRfrncCntxtPrdEnd.substring(this.docRfrncCntxtPrdEnd.length() - 1).equals("[")) {
	        	this.docRfrncCntxtPrdEnd = this.docRfrncCntxtPrdEnd+docRfrncCntxtPrdEnd;
	        } else  {
	            this.docRfrncCntxtPrdEnd = this.docRfrncCntxtPrdEnd+ "," +docRfrncCntxtPrdEnd;
	        }
        }
    }
    
    
    
    public String getDocRfrncCntxtPrdStrt() {
        return this.docRfrncCntxtPrdStrt;
    }
    
    public void setDocRfrncCntxtPrdStrt(String docRfrncCntxtPrdStrt) {
        this.docRfrncCntxtPrdStrt = docRfrncCntxtPrdStrt;
    }
    
    public void addDocRfrncCntxtPrdStrt(String docRfrncCntxtPrdStrt) {
    	if( docRfrncCntxtPrdStrt != null ) {
	    	if( this.docRfrncCntxtPrdStrt == null ) {
	        	this.docRfrncCntxtPrdStrt = docRfrncCntxtPrdStrt;
	        } else if(this.docRfrncCntxtPrdStrt.substring(this.docRfrncCntxtPrdStrt.length() - 1).equals("]") & docRfrncCntxtPrdStrt.equals("[")) {
	        	this.docRfrncCntxtPrdStrt = this.docRfrncCntxtPrdStrt+ "," + docRfrncCntxtPrdStrt;
	        } else if(docRfrncCntxtPrdStrt.equals("[") | docRfrncCntxtPrdStrt.equals("]") | this.docRfrncCntxtPrdStrt.substring(this.docRfrncCntxtPrdStrt.length() - 1).equals("[")) {
	        	this.docRfrncCntxtPrdStrt = this.docRfrncCntxtPrdStrt+docRfrncCntxtPrdStrt;
	        } else  {
	            this.docRfrncCntxtPrdStrt = this.docRfrncCntxtPrdStrt+ "," +docRfrncCntxtPrdStrt;
	        }
        }
    }
    
    
    
    public String getDocRfrncCntxtPracticeSttingCdgCd() {
        return this.docRfrncCntxtPracticeSttingCdgCd;
    }
    
    public void setDocRfrncCntxtPracticeSttingCdgCd(String docRfrncCntxtPracticeSttingCdgCd) {
        this.docRfrncCntxtPracticeSttingCdgCd = docRfrncCntxtPracticeSttingCdgCd;
    }
    
    public void addDocRfrncCntxtPracticeSttingCdgCd(String docRfrncCntxtPracticeSttingCdgCd) {
    	if( docRfrncCntxtPracticeSttingCdgCd != null ) {
	    	if( this.docRfrncCntxtPracticeSttingCdgCd == null ) {
	        	this.docRfrncCntxtPracticeSttingCdgCd = docRfrncCntxtPracticeSttingCdgCd;
	        } else if(this.docRfrncCntxtPracticeSttingCdgCd.substring(this.docRfrncCntxtPracticeSttingCdgCd.length() - 1).equals("]") & docRfrncCntxtPracticeSttingCdgCd.equals("[")) {
	        	this.docRfrncCntxtPracticeSttingCdgCd = this.docRfrncCntxtPracticeSttingCdgCd+ "," + docRfrncCntxtPracticeSttingCdgCd;
	        } else if(docRfrncCntxtPracticeSttingCdgCd.equals("[") | docRfrncCntxtPracticeSttingCdgCd.equals("]") | this.docRfrncCntxtPracticeSttingCdgCd.substring(this.docRfrncCntxtPracticeSttingCdgCd.length() - 1).equals("[")) {
	        	this.docRfrncCntxtPracticeSttingCdgCd = this.docRfrncCntxtPracticeSttingCdgCd+docRfrncCntxtPracticeSttingCdgCd;
	        } else  {
	            this.docRfrncCntxtPracticeSttingCdgCd = this.docRfrncCntxtPracticeSttingCdgCd+ "," +docRfrncCntxtPracticeSttingCdgCd;
	        }
        }
    }
    
    
    
    public String getDocRfrncCntxtPracticeSttingCdgDsply() {
        return this.docRfrncCntxtPracticeSttingCdgDsply;
    }
    
    public void setDocRfrncCntxtPracticeSttingCdgDsply(String docRfrncCntxtPracticeSttingCdgDsply) {
        this.docRfrncCntxtPracticeSttingCdgDsply = docRfrncCntxtPracticeSttingCdgDsply;
    }
    
    public void addDocRfrncCntxtPracticeSttingCdgDsply(String docRfrncCntxtPracticeSttingCdgDsply) {
    	if( docRfrncCntxtPracticeSttingCdgDsply != null ) {
	    	if( this.docRfrncCntxtPracticeSttingCdgDsply == null ) {
	        	this.docRfrncCntxtPracticeSttingCdgDsply = docRfrncCntxtPracticeSttingCdgDsply;
	        } else if(this.docRfrncCntxtPracticeSttingCdgDsply.substring(this.docRfrncCntxtPracticeSttingCdgDsply.length() - 1).equals("]") & docRfrncCntxtPracticeSttingCdgDsply.equals("[")) {
	        	this.docRfrncCntxtPracticeSttingCdgDsply = this.docRfrncCntxtPracticeSttingCdgDsply+ "," + docRfrncCntxtPracticeSttingCdgDsply;
	        } else if(docRfrncCntxtPracticeSttingCdgDsply.equals("[") | docRfrncCntxtPracticeSttingCdgDsply.equals("]") | this.docRfrncCntxtPracticeSttingCdgDsply.substring(this.docRfrncCntxtPracticeSttingCdgDsply.length() - 1).equals("[")) {
	        	this.docRfrncCntxtPracticeSttingCdgDsply = this.docRfrncCntxtPracticeSttingCdgDsply+docRfrncCntxtPracticeSttingCdgDsply;
	        } else  {
	            this.docRfrncCntxtPracticeSttingCdgDsply = this.docRfrncCntxtPracticeSttingCdgDsply+ "," +docRfrncCntxtPracticeSttingCdgDsply;
	        }
        }
    }
    
    
    
    public String getDocRfrncCntxtPracticeSttingCdgSys() {
        return this.docRfrncCntxtPracticeSttingCdgSys;
    }
    
    public void setDocRfrncCntxtPracticeSttingCdgSys(String docRfrncCntxtPracticeSttingCdgSys) {
        this.docRfrncCntxtPracticeSttingCdgSys = docRfrncCntxtPracticeSttingCdgSys;
    }
    
    public void addDocRfrncCntxtPracticeSttingCdgSys(String docRfrncCntxtPracticeSttingCdgSys) {
    	if( docRfrncCntxtPracticeSttingCdgSys != null ) {
	    	if( this.docRfrncCntxtPracticeSttingCdgSys == null ) {
	        	this.docRfrncCntxtPracticeSttingCdgSys = docRfrncCntxtPracticeSttingCdgSys;
	        } else if(this.docRfrncCntxtPracticeSttingCdgSys.substring(this.docRfrncCntxtPracticeSttingCdgSys.length() - 1).equals("]") & docRfrncCntxtPracticeSttingCdgSys.equals("[")) {
	        	this.docRfrncCntxtPracticeSttingCdgSys = this.docRfrncCntxtPracticeSttingCdgSys+ "," + docRfrncCntxtPracticeSttingCdgSys;
	        } else if(docRfrncCntxtPracticeSttingCdgSys.equals("[") | docRfrncCntxtPracticeSttingCdgSys.equals("]") | this.docRfrncCntxtPracticeSttingCdgSys.substring(this.docRfrncCntxtPracticeSttingCdgSys.length() - 1).equals("[")) {
	        	this.docRfrncCntxtPracticeSttingCdgSys = this.docRfrncCntxtPracticeSttingCdgSys+docRfrncCntxtPracticeSttingCdgSys;
	        } else  {
	            this.docRfrncCntxtPracticeSttingCdgSys = this.docRfrncCntxtPracticeSttingCdgSys+ "," +docRfrncCntxtPracticeSttingCdgSys;
	        }
        }
    }
    
    
    
    public String getDocRfrncCntxtPracticeSttingCdgUsrSltd() {
        return this.docRfrncCntxtPracticeSttingCdgUsrSltd;
    }
    
    public void setDocRfrncCntxtPracticeSttingCdgUsrSltd(String docRfrncCntxtPracticeSttingCdgUsrSltd) {
        this.docRfrncCntxtPracticeSttingCdgUsrSltd = docRfrncCntxtPracticeSttingCdgUsrSltd;
    }
    
    public void addDocRfrncCntxtPracticeSttingCdgUsrSltd(String docRfrncCntxtPracticeSttingCdgUsrSltd) {
    	if( docRfrncCntxtPracticeSttingCdgUsrSltd != null ) {
	    	if( this.docRfrncCntxtPracticeSttingCdgUsrSltd == null ) {
	        	this.docRfrncCntxtPracticeSttingCdgUsrSltd = docRfrncCntxtPracticeSttingCdgUsrSltd;
	        } else if(this.docRfrncCntxtPracticeSttingCdgUsrSltd.substring(this.docRfrncCntxtPracticeSttingCdgUsrSltd.length() - 1).equals("]") & docRfrncCntxtPracticeSttingCdgUsrSltd.equals("[")) {
	        	this.docRfrncCntxtPracticeSttingCdgUsrSltd = this.docRfrncCntxtPracticeSttingCdgUsrSltd+ "," + docRfrncCntxtPracticeSttingCdgUsrSltd;
	        } else if(docRfrncCntxtPracticeSttingCdgUsrSltd.equals("[") | docRfrncCntxtPracticeSttingCdgUsrSltd.equals("]") | this.docRfrncCntxtPracticeSttingCdgUsrSltd.substring(this.docRfrncCntxtPracticeSttingCdgUsrSltd.length() - 1).equals("[")) {
	        	this.docRfrncCntxtPracticeSttingCdgUsrSltd = this.docRfrncCntxtPracticeSttingCdgUsrSltd+docRfrncCntxtPracticeSttingCdgUsrSltd;
	        } else  {
	            this.docRfrncCntxtPracticeSttingCdgUsrSltd = this.docRfrncCntxtPracticeSttingCdgUsrSltd+ "," +docRfrncCntxtPracticeSttingCdgUsrSltd;
	        }
        }
    }
    
    
    
    public String getDocRfrncCntxtPracticeSttingCdgVrsn() {
        return this.docRfrncCntxtPracticeSttingCdgVrsn;
    }
    
    public void setDocRfrncCntxtPracticeSttingCdgVrsn(String docRfrncCntxtPracticeSttingCdgVrsn) {
        this.docRfrncCntxtPracticeSttingCdgVrsn = docRfrncCntxtPracticeSttingCdgVrsn;
    }
    
    public void addDocRfrncCntxtPracticeSttingCdgVrsn(String docRfrncCntxtPracticeSttingCdgVrsn) {
    	if( docRfrncCntxtPracticeSttingCdgVrsn != null ) {
	    	if( this.docRfrncCntxtPracticeSttingCdgVrsn == null ) {
	        	this.docRfrncCntxtPracticeSttingCdgVrsn = docRfrncCntxtPracticeSttingCdgVrsn;
	        } else if(this.docRfrncCntxtPracticeSttingCdgVrsn.substring(this.docRfrncCntxtPracticeSttingCdgVrsn.length() - 1).equals("]") & docRfrncCntxtPracticeSttingCdgVrsn.equals("[")) {
	        	this.docRfrncCntxtPracticeSttingCdgVrsn = this.docRfrncCntxtPracticeSttingCdgVrsn+ "," + docRfrncCntxtPracticeSttingCdgVrsn;
	        } else if(docRfrncCntxtPracticeSttingCdgVrsn.equals("[") | docRfrncCntxtPracticeSttingCdgVrsn.equals("]") | this.docRfrncCntxtPracticeSttingCdgVrsn.substring(this.docRfrncCntxtPracticeSttingCdgVrsn.length() - 1).equals("[")) {
	        	this.docRfrncCntxtPracticeSttingCdgVrsn = this.docRfrncCntxtPracticeSttingCdgVrsn+docRfrncCntxtPracticeSttingCdgVrsn;
	        } else  {
	            this.docRfrncCntxtPracticeSttingCdgVrsn = this.docRfrncCntxtPracticeSttingCdgVrsn+ "," +docRfrncCntxtPracticeSttingCdgVrsn;
	        }
        }
    }
    
    
    
    public String getDocRfrncCntxtPracticeSttingTxt() {
        return this.docRfrncCntxtPracticeSttingTxt;
    }
    
    public void setDocRfrncCntxtPracticeSttingTxt(String docRfrncCntxtPracticeSttingTxt) {
        this.docRfrncCntxtPracticeSttingTxt = docRfrncCntxtPracticeSttingTxt;
    }
    
    public void addDocRfrncCntxtPracticeSttingTxt(String docRfrncCntxtPracticeSttingTxt) {
    	if( docRfrncCntxtPracticeSttingTxt != null ) {
	    	if( this.docRfrncCntxtPracticeSttingTxt == null ) {
	        	this.docRfrncCntxtPracticeSttingTxt = docRfrncCntxtPracticeSttingTxt;
	        } else if(this.docRfrncCntxtPracticeSttingTxt.substring(this.docRfrncCntxtPracticeSttingTxt.length() - 1).equals("]") & docRfrncCntxtPracticeSttingTxt.equals("[")) {
	        	this.docRfrncCntxtPracticeSttingTxt = this.docRfrncCntxtPracticeSttingTxt+ "," + docRfrncCntxtPracticeSttingTxt;
	        } else if(docRfrncCntxtPracticeSttingTxt.equals("[") | docRfrncCntxtPracticeSttingTxt.equals("]") | this.docRfrncCntxtPracticeSttingTxt.substring(this.docRfrncCntxtPracticeSttingTxt.length() - 1).equals("[")) {
	        	this.docRfrncCntxtPracticeSttingTxt = this.docRfrncCntxtPracticeSttingTxt+docRfrncCntxtPracticeSttingTxt;
	        } else  {
	            this.docRfrncCntxtPracticeSttingTxt = this.docRfrncCntxtPracticeSttingTxt+ "," +docRfrncCntxtPracticeSttingTxt;
	        }
        }
    }
    
    
    
    public String getDocRfrncCntxtRlted() {
        return this.docRfrncCntxtRlted;
    }
    
    public void setDocRfrncCntxtRlted(String docRfrncCntxtRlted) {
        this.docRfrncCntxtRlted = docRfrncCntxtRlted;
    }
    
    public void addDocRfrncCntxtRlted(String docRfrncCntxtRlted) {
    	if( docRfrncCntxtRlted != null ) {
	    	if( this.docRfrncCntxtRlted == null ) {
	        	this.docRfrncCntxtRlted = docRfrncCntxtRlted;
	        } else if(this.docRfrncCntxtRlted.substring(this.docRfrncCntxtRlted.length() - 1).equals("]") & docRfrncCntxtRlted.equals("[")) {
	        	this.docRfrncCntxtRlted = this.docRfrncCntxtRlted+ "," + docRfrncCntxtRlted;
	        } else if(docRfrncCntxtRlted.equals("[") | docRfrncCntxtRlted.equals("]") | this.docRfrncCntxtRlted.substring(this.docRfrncCntxtRlted.length() - 1).equals("[")) {
	        	this.docRfrncCntxtRlted = this.docRfrncCntxtRlted+docRfrncCntxtRlted;
	        } else  {
	            this.docRfrncCntxtRlted = this.docRfrncCntxtRlted+ "," +docRfrncCntxtRlted;
	        }
        }
    }
    
    
    
    public String getDocRfrncCntxtSrcPntInfo() {
        return this.docRfrncCntxtSrcPntInfo;
    }
    
    public void setDocRfrncCntxtSrcPntInfo(String docRfrncCntxtSrcPntInfo) {
        this.docRfrncCntxtSrcPntInfo = docRfrncCntxtSrcPntInfo;
    }
    
    public void addDocRfrncCntxtSrcPntInfo(String docRfrncCntxtSrcPntInfo) {
    	if( docRfrncCntxtSrcPntInfo != null ) {
	    	if( this.docRfrncCntxtSrcPntInfo == null ) {
	        	this.docRfrncCntxtSrcPntInfo = docRfrncCntxtSrcPntInfo;
	        } else if(this.docRfrncCntxtSrcPntInfo.substring(this.docRfrncCntxtSrcPntInfo.length() - 1).equals("]") & docRfrncCntxtSrcPntInfo.equals("[")) {
	        	this.docRfrncCntxtSrcPntInfo = this.docRfrncCntxtSrcPntInfo+ "," + docRfrncCntxtSrcPntInfo;
	        } else if(docRfrncCntxtSrcPntInfo.equals("[") | docRfrncCntxtSrcPntInfo.equals("]") | this.docRfrncCntxtSrcPntInfo.substring(this.docRfrncCntxtSrcPntInfo.length() - 1).equals("[")) {
	        	this.docRfrncCntxtSrcPntInfo = this.docRfrncCntxtSrcPntInfo+docRfrncCntxtSrcPntInfo;
	        } else  {
	            this.docRfrncCntxtSrcPntInfo = this.docRfrncCntxtSrcPntInfo+ "," +docRfrncCntxtSrcPntInfo;
	        }
        }
    }
    
    
    
    public String getDocRfrncCustodian() {
        return this.docRfrncCustodian;
    }
    
    public void setDocRfrncCustodian(String docRfrncCustodian) {
        this.docRfrncCustodian = docRfrncCustodian;
    }
    
    public void addDocRfrncCustodian(String docRfrncCustodian) {
    	if( docRfrncCustodian != null ) {
	    	if( this.docRfrncCustodian == null ) {
	        	this.docRfrncCustodian = docRfrncCustodian;
	        } else if(this.docRfrncCustodian.substring(this.docRfrncCustodian.length() - 1).equals("]") & docRfrncCustodian.equals("[")) {
	        	this.docRfrncCustodian = this.docRfrncCustodian+ "," + docRfrncCustodian;
	        } else if(docRfrncCustodian.equals("[") | docRfrncCustodian.equals("]") | this.docRfrncCustodian.substring(this.docRfrncCustodian.length() - 1).equals("[")) {
	        	this.docRfrncCustodian = this.docRfrncCustodian+docRfrncCustodian;
	        } else  {
	            this.docRfrncCustodian = this.docRfrncCustodian+ "," +docRfrncCustodian;
	        }
        }
    }
    
    
    
    public String getDocRfrncDt() {
        return this.docRfrncDt;
    }
    
    public void setDocRfrncDt(String docRfrncDt) {
        this.docRfrncDt = docRfrncDt;
    }
    
    public void addDocRfrncDt(String docRfrncDt) {
    	if( docRfrncDt != null ) {
	    	if( this.docRfrncDt == null ) {
	        	this.docRfrncDt = docRfrncDt;
	        } else if(this.docRfrncDt.substring(this.docRfrncDt.length() - 1).equals("]") & docRfrncDt.equals("[")) {
	        	this.docRfrncDt = this.docRfrncDt+ "," + docRfrncDt;
	        } else if(docRfrncDt.equals("[") | docRfrncDt.equals("]") | this.docRfrncDt.substring(this.docRfrncDt.length() - 1).equals("[")) {
	        	this.docRfrncDt = this.docRfrncDt+docRfrncDt;
	        } else  {
	            this.docRfrncDt = this.docRfrncDt+ "," +docRfrncDt;
	        }
        }
    }
    
    
    
    public String getDocRfrncDscrptn() {
        return this.docRfrncDscrptn;
    }
    
    public void setDocRfrncDscrptn(String docRfrncDscrptn) {
        this.docRfrncDscrptn = docRfrncDscrptn;
    }
    
    public void addDocRfrncDscrptn(String docRfrncDscrptn) {
    	if( docRfrncDscrptn != null ) {
	    	if( this.docRfrncDscrptn == null ) {
	        	this.docRfrncDscrptn = docRfrncDscrptn;
	        } else if(this.docRfrncDscrptn.substring(this.docRfrncDscrptn.length() - 1).equals("]") & docRfrncDscrptn.equals("[")) {
	        	this.docRfrncDscrptn = this.docRfrncDscrptn+ "," + docRfrncDscrptn;
	        } else if(docRfrncDscrptn.equals("[") | docRfrncDscrptn.equals("]") | this.docRfrncDscrptn.substring(this.docRfrncDscrptn.length() - 1).equals("[")) {
	        	this.docRfrncDscrptn = this.docRfrncDscrptn+docRfrncDscrptn;
	        } else  {
	            this.docRfrncDscrptn = this.docRfrncDscrptn+ "," +docRfrncDscrptn;
	        }
        }
    }
    
    
    
    public String getDocRfrncDocSts() {
        return this.docRfrncDocSts;
    }
    
    public void setDocRfrncDocSts(String docRfrncDocSts) {
        this.docRfrncDocSts = docRfrncDocSts;
    }
    
    public void addDocRfrncDocSts(String docRfrncDocSts) {
    	if( docRfrncDocSts != null ) {
	    	if( this.docRfrncDocSts == null ) {
	        	this.docRfrncDocSts = docRfrncDocSts;
	        } else if(this.docRfrncDocSts.substring(this.docRfrncDocSts.length() - 1).equals("]") & docRfrncDocSts.equals("[")) {
	        	this.docRfrncDocSts = this.docRfrncDocSts+ "," + docRfrncDocSts;
	        } else if(docRfrncDocSts.equals("[") | docRfrncDocSts.equals("]") | this.docRfrncDocSts.substring(this.docRfrncDocSts.length() - 1).equals("[")) {
	        	this.docRfrncDocSts = this.docRfrncDocSts+docRfrncDocSts;
	        } else  {
	            this.docRfrncDocSts = this.docRfrncDocSts+ "," +docRfrncDocSts;
	        }
        }
    }
    
    
    
    public String getDocRfrncIdAssigner() {
        return this.docRfrncIdAssigner;
    }
    
    public void setDocRfrncIdAssigner(String docRfrncIdAssigner) {
        this.docRfrncIdAssigner = docRfrncIdAssigner;
    }
    
    public void addDocRfrncIdAssigner(String docRfrncIdAssigner) {
    	if( docRfrncIdAssigner != null ) {
	    	if( this.docRfrncIdAssigner == null ) {
	        	this.docRfrncIdAssigner = docRfrncIdAssigner;
	        } else if(this.docRfrncIdAssigner.substring(this.docRfrncIdAssigner.length() - 1).equals("]") & docRfrncIdAssigner.equals("[")) {
	        	this.docRfrncIdAssigner = this.docRfrncIdAssigner+ "," + docRfrncIdAssigner;
	        } else if(docRfrncIdAssigner.equals("[") | docRfrncIdAssigner.equals("]") | this.docRfrncIdAssigner.substring(this.docRfrncIdAssigner.length() - 1).equals("[")) {
	        	this.docRfrncIdAssigner = this.docRfrncIdAssigner+docRfrncIdAssigner;
	        } else  {
	            this.docRfrncIdAssigner = this.docRfrncIdAssigner+ "," +docRfrncIdAssigner;
	        }
        }
    }
    
    
    
    public String getDocRfrncIdPrdEnd() {
        return this.docRfrncIdPrdEnd;
    }
    
    public void setDocRfrncIdPrdEnd(String docRfrncIdPrdEnd) {
        this.docRfrncIdPrdEnd = docRfrncIdPrdEnd;
    }
    
    public void addDocRfrncIdPrdEnd(String docRfrncIdPrdEnd) {
    	if( docRfrncIdPrdEnd != null ) {
	    	if( this.docRfrncIdPrdEnd == null ) {
	        	this.docRfrncIdPrdEnd = docRfrncIdPrdEnd;
	        } else if(this.docRfrncIdPrdEnd.substring(this.docRfrncIdPrdEnd.length() - 1).equals("]") & docRfrncIdPrdEnd.equals("[")) {
	        	this.docRfrncIdPrdEnd = this.docRfrncIdPrdEnd+ "," + docRfrncIdPrdEnd;
	        } else if(docRfrncIdPrdEnd.equals("[") | docRfrncIdPrdEnd.equals("]") | this.docRfrncIdPrdEnd.substring(this.docRfrncIdPrdEnd.length() - 1).equals("[")) {
	        	this.docRfrncIdPrdEnd = this.docRfrncIdPrdEnd+docRfrncIdPrdEnd;
	        } else  {
	            this.docRfrncIdPrdEnd = this.docRfrncIdPrdEnd+ "," +docRfrncIdPrdEnd;
	        }
        }
    }
    
    
    
    public String getDocRfrncIdPrdStrt() {
        return this.docRfrncIdPrdStrt;
    }
    
    public void setDocRfrncIdPrdStrt(String docRfrncIdPrdStrt) {
        this.docRfrncIdPrdStrt = docRfrncIdPrdStrt;
    }
    
    public void addDocRfrncIdPrdStrt(String docRfrncIdPrdStrt) {
    	if( docRfrncIdPrdStrt != null ) {
	    	if( this.docRfrncIdPrdStrt == null ) {
	        	this.docRfrncIdPrdStrt = docRfrncIdPrdStrt;
	        } else if(this.docRfrncIdPrdStrt.substring(this.docRfrncIdPrdStrt.length() - 1).equals("]") & docRfrncIdPrdStrt.equals("[")) {
	        	this.docRfrncIdPrdStrt = this.docRfrncIdPrdStrt+ "," + docRfrncIdPrdStrt;
	        } else if(docRfrncIdPrdStrt.equals("[") | docRfrncIdPrdStrt.equals("]") | this.docRfrncIdPrdStrt.substring(this.docRfrncIdPrdStrt.length() - 1).equals("[")) {
	        	this.docRfrncIdPrdStrt = this.docRfrncIdPrdStrt+docRfrncIdPrdStrt;
	        } else  {
	            this.docRfrncIdPrdStrt = this.docRfrncIdPrdStrt+ "," +docRfrncIdPrdStrt;
	        }
        }
    }
    
    
    
    public String getDocRfrncIdSys() {
        return this.docRfrncIdSys;
    }
    
    public void setDocRfrncIdSys(String docRfrncIdSys) {
        this.docRfrncIdSys = docRfrncIdSys;
    }
    
    public void addDocRfrncIdSys(String docRfrncIdSys) {
    	if( docRfrncIdSys != null ) {
	    	if( this.docRfrncIdSys == null ) {
	        	this.docRfrncIdSys = docRfrncIdSys;
	        } else if(this.docRfrncIdSys.substring(this.docRfrncIdSys.length() - 1).equals("]") & docRfrncIdSys.equals("[")) {
	        	this.docRfrncIdSys = this.docRfrncIdSys+ "," + docRfrncIdSys;
	        } else if(docRfrncIdSys.equals("[") | docRfrncIdSys.equals("]") | this.docRfrncIdSys.substring(this.docRfrncIdSys.length() - 1).equals("[")) {
	        	this.docRfrncIdSys = this.docRfrncIdSys+docRfrncIdSys;
	        } else  {
	            this.docRfrncIdSys = this.docRfrncIdSys+ "," +docRfrncIdSys;
	        }
        }
    }
    
    
    
    public String getDocRfrncIdTypCdgCd() {
        return this.docRfrncIdTypCdgCd;
    }
    
    public void setDocRfrncIdTypCdgCd(String docRfrncIdTypCdgCd) {
        this.docRfrncIdTypCdgCd = docRfrncIdTypCdgCd;
    }
    
    public void addDocRfrncIdTypCdgCd(String docRfrncIdTypCdgCd) {
    	if( docRfrncIdTypCdgCd != null ) {
	    	if( this.docRfrncIdTypCdgCd == null ) {
	        	this.docRfrncIdTypCdgCd = docRfrncIdTypCdgCd;
	        } else if(this.docRfrncIdTypCdgCd.substring(this.docRfrncIdTypCdgCd.length() - 1).equals("]") & docRfrncIdTypCdgCd.equals("[")) {
	        	this.docRfrncIdTypCdgCd = this.docRfrncIdTypCdgCd+ "," + docRfrncIdTypCdgCd;
	        } else if(docRfrncIdTypCdgCd.equals("[") | docRfrncIdTypCdgCd.equals("]") | this.docRfrncIdTypCdgCd.substring(this.docRfrncIdTypCdgCd.length() - 1).equals("[")) {
	        	this.docRfrncIdTypCdgCd = this.docRfrncIdTypCdgCd+docRfrncIdTypCdgCd;
	        } else  {
	            this.docRfrncIdTypCdgCd = this.docRfrncIdTypCdgCd+ "," +docRfrncIdTypCdgCd;
	        }
        }
    }
    
    
    
    public String getDocRfrncIdTypCdgDsply() {
        return this.docRfrncIdTypCdgDsply;
    }
    
    public void setDocRfrncIdTypCdgDsply(String docRfrncIdTypCdgDsply) {
        this.docRfrncIdTypCdgDsply = docRfrncIdTypCdgDsply;
    }
    
    public void addDocRfrncIdTypCdgDsply(String docRfrncIdTypCdgDsply) {
    	if( docRfrncIdTypCdgDsply != null ) {
	    	if( this.docRfrncIdTypCdgDsply == null ) {
	        	this.docRfrncIdTypCdgDsply = docRfrncIdTypCdgDsply;
	        } else if(this.docRfrncIdTypCdgDsply.substring(this.docRfrncIdTypCdgDsply.length() - 1).equals("]") & docRfrncIdTypCdgDsply.equals("[")) {
	        	this.docRfrncIdTypCdgDsply = this.docRfrncIdTypCdgDsply+ "," + docRfrncIdTypCdgDsply;
	        } else if(docRfrncIdTypCdgDsply.equals("[") | docRfrncIdTypCdgDsply.equals("]") | this.docRfrncIdTypCdgDsply.substring(this.docRfrncIdTypCdgDsply.length() - 1).equals("[")) {
	        	this.docRfrncIdTypCdgDsply = this.docRfrncIdTypCdgDsply+docRfrncIdTypCdgDsply;
	        } else  {
	            this.docRfrncIdTypCdgDsply = this.docRfrncIdTypCdgDsply+ "," +docRfrncIdTypCdgDsply;
	        }
        }
    }
    
    
    
    public String getDocRfrncIdTypCdgSys() {
        return this.docRfrncIdTypCdgSys;
    }
    
    public void setDocRfrncIdTypCdgSys(String docRfrncIdTypCdgSys) {
        this.docRfrncIdTypCdgSys = docRfrncIdTypCdgSys;
    }
    
    public void addDocRfrncIdTypCdgSys(String docRfrncIdTypCdgSys) {
    	if( docRfrncIdTypCdgSys != null ) {
	    	if( this.docRfrncIdTypCdgSys == null ) {
	        	this.docRfrncIdTypCdgSys = docRfrncIdTypCdgSys;
	        } else if(this.docRfrncIdTypCdgSys.substring(this.docRfrncIdTypCdgSys.length() - 1).equals("]") & docRfrncIdTypCdgSys.equals("[")) {
	        	this.docRfrncIdTypCdgSys = this.docRfrncIdTypCdgSys+ "," + docRfrncIdTypCdgSys;
	        } else if(docRfrncIdTypCdgSys.equals("[") | docRfrncIdTypCdgSys.equals("]") | this.docRfrncIdTypCdgSys.substring(this.docRfrncIdTypCdgSys.length() - 1).equals("[")) {
	        	this.docRfrncIdTypCdgSys = this.docRfrncIdTypCdgSys+docRfrncIdTypCdgSys;
	        } else  {
	            this.docRfrncIdTypCdgSys = this.docRfrncIdTypCdgSys+ "," +docRfrncIdTypCdgSys;
	        }
        }
    }
    
    
    
    public String getDocRfrncIdTypCdgUsrSltd() {
        return this.docRfrncIdTypCdgUsrSltd;
    }
    
    public void setDocRfrncIdTypCdgUsrSltd(String docRfrncIdTypCdgUsrSltd) {
        this.docRfrncIdTypCdgUsrSltd = docRfrncIdTypCdgUsrSltd;
    }
    
    public void addDocRfrncIdTypCdgUsrSltd(String docRfrncIdTypCdgUsrSltd) {
    	if( docRfrncIdTypCdgUsrSltd != null ) {
	    	if( this.docRfrncIdTypCdgUsrSltd == null ) {
	        	this.docRfrncIdTypCdgUsrSltd = docRfrncIdTypCdgUsrSltd;
	        } else if(this.docRfrncIdTypCdgUsrSltd.substring(this.docRfrncIdTypCdgUsrSltd.length() - 1).equals("]") & docRfrncIdTypCdgUsrSltd.equals("[")) {
	        	this.docRfrncIdTypCdgUsrSltd = this.docRfrncIdTypCdgUsrSltd+ "," + docRfrncIdTypCdgUsrSltd;
	        } else if(docRfrncIdTypCdgUsrSltd.equals("[") | docRfrncIdTypCdgUsrSltd.equals("]") | this.docRfrncIdTypCdgUsrSltd.substring(this.docRfrncIdTypCdgUsrSltd.length() - 1).equals("[")) {
	        	this.docRfrncIdTypCdgUsrSltd = this.docRfrncIdTypCdgUsrSltd+docRfrncIdTypCdgUsrSltd;
	        } else  {
	            this.docRfrncIdTypCdgUsrSltd = this.docRfrncIdTypCdgUsrSltd+ "," +docRfrncIdTypCdgUsrSltd;
	        }
        }
    }
    
    
    
    public String getDocRfrncIdTypCdgVrsn() {
        return this.docRfrncIdTypCdgVrsn;
    }
    
    public void setDocRfrncIdTypCdgVrsn(String docRfrncIdTypCdgVrsn) {
        this.docRfrncIdTypCdgVrsn = docRfrncIdTypCdgVrsn;
    }
    
    public void addDocRfrncIdTypCdgVrsn(String docRfrncIdTypCdgVrsn) {
    	if( docRfrncIdTypCdgVrsn != null ) {
	    	if( this.docRfrncIdTypCdgVrsn == null ) {
	        	this.docRfrncIdTypCdgVrsn = docRfrncIdTypCdgVrsn;
	        } else if(this.docRfrncIdTypCdgVrsn.substring(this.docRfrncIdTypCdgVrsn.length() - 1).equals("]") & docRfrncIdTypCdgVrsn.equals("[")) {
	        	this.docRfrncIdTypCdgVrsn = this.docRfrncIdTypCdgVrsn+ "," + docRfrncIdTypCdgVrsn;
	        } else if(docRfrncIdTypCdgVrsn.equals("[") | docRfrncIdTypCdgVrsn.equals("]") | this.docRfrncIdTypCdgVrsn.substring(this.docRfrncIdTypCdgVrsn.length() - 1).equals("[")) {
	        	this.docRfrncIdTypCdgVrsn = this.docRfrncIdTypCdgVrsn+docRfrncIdTypCdgVrsn;
	        } else  {
	            this.docRfrncIdTypCdgVrsn = this.docRfrncIdTypCdgVrsn+ "," +docRfrncIdTypCdgVrsn;
	        }
        }
    }
    
    
    
    public String getDocRfrncIdTypTxt() {
        return this.docRfrncIdTypTxt;
    }
    
    public void setDocRfrncIdTypTxt(String docRfrncIdTypTxt) {
        this.docRfrncIdTypTxt = docRfrncIdTypTxt;
    }
    
    public void addDocRfrncIdTypTxt(String docRfrncIdTypTxt) {
    	if( docRfrncIdTypTxt != null ) {
	    	if( this.docRfrncIdTypTxt == null ) {
	        	this.docRfrncIdTypTxt = docRfrncIdTypTxt;
	        } else if(this.docRfrncIdTypTxt.substring(this.docRfrncIdTypTxt.length() - 1).equals("]") & docRfrncIdTypTxt.equals("[")) {
	        	this.docRfrncIdTypTxt = this.docRfrncIdTypTxt+ "," + docRfrncIdTypTxt;
	        } else if(docRfrncIdTypTxt.equals("[") | docRfrncIdTypTxt.equals("]") | this.docRfrncIdTypTxt.substring(this.docRfrncIdTypTxt.length() - 1).equals("[")) {
	        	this.docRfrncIdTypTxt = this.docRfrncIdTypTxt+docRfrncIdTypTxt;
	        } else  {
	            this.docRfrncIdTypTxt = this.docRfrncIdTypTxt+ "," +docRfrncIdTypTxt;
	        }
        }
    }
    
    
    
    public String getDocRfrncIdUse() {
        return this.docRfrncIdUse;
    }
    
    public void setDocRfrncIdUse(String docRfrncIdUse) {
        this.docRfrncIdUse = docRfrncIdUse;
    }
    
    public void addDocRfrncIdUse(String docRfrncIdUse) {
    	if( docRfrncIdUse != null ) {
	    	if( this.docRfrncIdUse == null ) {
	        	this.docRfrncIdUse = docRfrncIdUse;
	        } else if(this.docRfrncIdUse.substring(this.docRfrncIdUse.length() - 1).equals("]") & docRfrncIdUse.equals("[")) {
	        	this.docRfrncIdUse = this.docRfrncIdUse+ "," + docRfrncIdUse;
	        } else if(docRfrncIdUse.equals("[") | docRfrncIdUse.equals("]") | this.docRfrncIdUse.substring(this.docRfrncIdUse.length() - 1).equals("[")) {
	        	this.docRfrncIdUse = this.docRfrncIdUse+docRfrncIdUse;
	        } else  {
	            this.docRfrncIdUse = this.docRfrncIdUse+ "," +docRfrncIdUse;
	        }
        }
    }
    
    
    
    public String getDocRfrncIdVl() {
        return this.docRfrncIdVl;
    }
    
    public void setDocRfrncIdVl(String docRfrncIdVl) {
        this.docRfrncIdVl = docRfrncIdVl;
    }
    
    public void addDocRfrncIdVl(String docRfrncIdVl) {
    	if( docRfrncIdVl != null ) {
	    	if( this.docRfrncIdVl == null ) {
	        	this.docRfrncIdVl = docRfrncIdVl;
	        } else if(this.docRfrncIdVl.substring(this.docRfrncIdVl.length() - 1).equals("]") & docRfrncIdVl.equals("[")) {
	        	this.docRfrncIdVl = this.docRfrncIdVl+ "," + docRfrncIdVl;
	        } else if(docRfrncIdVl.equals("[") | docRfrncIdVl.equals("]") | this.docRfrncIdVl.substring(this.docRfrncIdVl.length() - 1).equals("[")) {
	        	this.docRfrncIdVl = this.docRfrncIdVl+docRfrncIdVl;
	        } else  {
	            this.docRfrncIdVl = this.docRfrncIdVl+ "," +docRfrncIdVl;
	        }
        }
    }
    
    
    
    public String getDocRfrncMasterIdAssigner() {
        return this.docRfrncMasterIdAssigner;
    }
    
    public void setDocRfrncMasterIdAssigner(String docRfrncMasterIdAssigner) {
        this.docRfrncMasterIdAssigner = docRfrncMasterIdAssigner;
    }
    
    public void addDocRfrncMasterIdAssigner(String docRfrncMasterIdAssigner) {
    	if( docRfrncMasterIdAssigner != null ) {
	    	if( this.docRfrncMasterIdAssigner == null ) {
	        	this.docRfrncMasterIdAssigner = docRfrncMasterIdAssigner;
	        } else if(this.docRfrncMasterIdAssigner.substring(this.docRfrncMasterIdAssigner.length() - 1).equals("]") & docRfrncMasterIdAssigner.equals("[")) {
	        	this.docRfrncMasterIdAssigner = this.docRfrncMasterIdAssigner+ "," + docRfrncMasterIdAssigner;
	        } else if(docRfrncMasterIdAssigner.equals("[") | docRfrncMasterIdAssigner.equals("]") | this.docRfrncMasterIdAssigner.substring(this.docRfrncMasterIdAssigner.length() - 1).equals("[")) {
	        	this.docRfrncMasterIdAssigner = this.docRfrncMasterIdAssigner+docRfrncMasterIdAssigner;
	        } else  {
	            this.docRfrncMasterIdAssigner = this.docRfrncMasterIdAssigner+ "," +docRfrncMasterIdAssigner;
	        }
        }
    }
    
    
    
    public String getDocRfrncMasterIdPrdEnd() {
        return this.docRfrncMasterIdPrdEnd;
    }
    
    public void setDocRfrncMasterIdPrdEnd(String docRfrncMasterIdPrdEnd) {
        this.docRfrncMasterIdPrdEnd = docRfrncMasterIdPrdEnd;
    }
    
    public void addDocRfrncMasterIdPrdEnd(String docRfrncMasterIdPrdEnd) {
    	if( docRfrncMasterIdPrdEnd != null ) {
	    	if( this.docRfrncMasterIdPrdEnd == null ) {
	        	this.docRfrncMasterIdPrdEnd = docRfrncMasterIdPrdEnd;
	        } else if(this.docRfrncMasterIdPrdEnd.substring(this.docRfrncMasterIdPrdEnd.length() - 1).equals("]") & docRfrncMasterIdPrdEnd.equals("[")) {
	        	this.docRfrncMasterIdPrdEnd = this.docRfrncMasterIdPrdEnd+ "," + docRfrncMasterIdPrdEnd;
	        } else if(docRfrncMasterIdPrdEnd.equals("[") | docRfrncMasterIdPrdEnd.equals("]") | this.docRfrncMasterIdPrdEnd.substring(this.docRfrncMasterIdPrdEnd.length() - 1).equals("[")) {
	        	this.docRfrncMasterIdPrdEnd = this.docRfrncMasterIdPrdEnd+docRfrncMasterIdPrdEnd;
	        } else  {
	            this.docRfrncMasterIdPrdEnd = this.docRfrncMasterIdPrdEnd+ "," +docRfrncMasterIdPrdEnd;
	        }
        }
    }
    
    
    
    public String getDocRfrncMasterIdPrdStrt() {
        return this.docRfrncMasterIdPrdStrt;
    }
    
    public void setDocRfrncMasterIdPrdStrt(String docRfrncMasterIdPrdStrt) {
        this.docRfrncMasterIdPrdStrt = docRfrncMasterIdPrdStrt;
    }
    
    public void addDocRfrncMasterIdPrdStrt(String docRfrncMasterIdPrdStrt) {
    	if( docRfrncMasterIdPrdStrt != null ) {
	    	if( this.docRfrncMasterIdPrdStrt == null ) {
	        	this.docRfrncMasterIdPrdStrt = docRfrncMasterIdPrdStrt;
	        } else if(this.docRfrncMasterIdPrdStrt.substring(this.docRfrncMasterIdPrdStrt.length() - 1).equals("]") & docRfrncMasterIdPrdStrt.equals("[")) {
	        	this.docRfrncMasterIdPrdStrt = this.docRfrncMasterIdPrdStrt+ "," + docRfrncMasterIdPrdStrt;
	        } else if(docRfrncMasterIdPrdStrt.equals("[") | docRfrncMasterIdPrdStrt.equals("]") | this.docRfrncMasterIdPrdStrt.substring(this.docRfrncMasterIdPrdStrt.length() - 1).equals("[")) {
	        	this.docRfrncMasterIdPrdStrt = this.docRfrncMasterIdPrdStrt+docRfrncMasterIdPrdStrt;
	        } else  {
	            this.docRfrncMasterIdPrdStrt = this.docRfrncMasterIdPrdStrt+ "," +docRfrncMasterIdPrdStrt;
	        }
        }
    }
    
    
    
    public String getDocRfrncMasterIdSys() {
        return this.docRfrncMasterIdSys;
    }
    
    public void setDocRfrncMasterIdSys(String docRfrncMasterIdSys) {
        this.docRfrncMasterIdSys = docRfrncMasterIdSys;
    }
    
    public void addDocRfrncMasterIdSys(String docRfrncMasterIdSys) {
    	if( docRfrncMasterIdSys != null ) {
	    	if( this.docRfrncMasterIdSys == null ) {
	        	this.docRfrncMasterIdSys = docRfrncMasterIdSys;
	        } else if(this.docRfrncMasterIdSys.substring(this.docRfrncMasterIdSys.length() - 1).equals("]") & docRfrncMasterIdSys.equals("[")) {
	        	this.docRfrncMasterIdSys = this.docRfrncMasterIdSys+ "," + docRfrncMasterIdSys;
	        } else if(docRfrncMasterIdSys.equals("[") | docRfrncMasterIdSys.equals("]") | this.docRfrncMasterIdSys.substring(this.docRfrncMasterIdSys.length() - 1).equals("[")) {
	        	this.docRfrncMasterIdSys = this.docRfrncMasterIdSys+docRfrncMasterIdSys;
	        } else  {
	            this.docRfrncMasterIdSys = this.docRfrncMasterIdSys+ "," +docRfrncMasterIdSys;
	        }
        }
    }
    
    
    
    public String getDocRfrncMasterIdTypCdgCd() {
        return this.docRfrncMasterIdTypCdgCd;
    }
    
    public void setDocRfrncMasterIdTypCdgCd(String docRfrncMasterIdTypCdgCd) {
        this.docRfrncMasterIdTypCdgCd = docRfrncMasterIdTypCdgCd;
    }
    
    public void addDocRfrncMasterIdTypCdgCd(String docRfrncMasterIdTypCdgCd) {
    	if( docRfrncMasterIdTypCdgCd != null ) {
	    	if( this.docRfrncMasterIdTypCdgCd == null ) {
	        	this.docRfrncMasterIdTypCdgCd = docRfrncMasterIdTypCdgCd;
	        } else if(this.docRfrncMasterIdTypCdgCd.substring(this.docRfrncMasterIdTypCdgCd.length() - 1).equals("]") & docRfrncMasterIdTypCdgCd.equals("[")) {
	        	this.docRfrncMasterIdTypCdgCd = this.docRfrncMasterIdTypCdgCd+ "," + docRfrncMasterIdTypCdgCd;
	        } else if(docRfrncMasterIdTypCdgCd.equals("[") | docRfrncMasterIdTypCdgCd.equals("]") | this.docRfrncMasterIdTypCdgCd.substring(this.docRfrncMasterIdTypCdgCd.length() - 1).equals("[")) {
	        	this.docRfrncMasterIdTypCdgCd = this.docRfrncMasterIdTypCdgCd+docRfrncMasterIdTypCdgCd;
	        } else  {
	            this.docRfrncMasterIdTypCdgCd = this.docRfrncMasterIdTypCdgCd+ "," +docRfrncMasterIdTypCdgCd;
	        }
        }
    }
    
    
    
    public String getDocRfrncMasterIdTypCdgDsply() {
        return this.docRfrncMasterIdTypCdgDsply;
    }
    
    public void setDocRfrncMasterIdTypCdgDsply(String docRfrncMasterIdTypCdgDsply) {
        this.docRfrncMasterIdTypCdgDsply = docRfrncMasterIdTypCdgDsply;
    }
    
    public void addDocRfrncMasterIdTypCdgDsply(String docRfrncMasterIdTypCdgDsply) {
    	if( docRfrncMasterIdTypCdgDsply != null ) {
	    	if( this.docRfrncMasterIdTypCdgDsply == null ) {
	        	this.docRfrncMasterIdTypCdgDsply = docRfrncMasterIdTypCdgDsply;
	        } else if(this.docRfrncMasterIdTypCdgDsply.substring(this.docRfrncMasterIdTypCdgDsply.length() - 1).equals("]") & docRfrncMasterIdTypCdgDsply.equals("[")) {
	        	this.docRfrncMasterIdTypCdgDsply = this.docRfrncMasterIdTypCdgDsply+ "," + docRfrncMasterIdTypCdgDsply;
	        } else if(docRfrncMasterIdTypCdgDsply.equals("[") | docRfrncMasterIdTypCdgDsply.equals("]") | this.docRfrncMasterIdTypCdgDsply.substring(this.docRfrncMasterIdTypCdgDsply.length() - 1).equals("[")) {
	        	this.docRfrncMasterIdTypCdgDsply = this.docRfrncMasterIdTypCdgDsply+docRfrncMasterIdTypCdgDsply;
	        } else  {
	            this.docRfrncMasterIdTypCdgDsply = this.docRfrncMasterIdTypCdgDsply+ "," +docRfrncMasterIdTypCdgDsply;
	        }
        }
    }
    
    
    
    public String getDocRfrncMasterIdTypCdgSys() {
        return this.docRfrncMasterIdTypCdgSys;
    }
    
    public void setDocRfrncMasterIdTypCdgSys(String docRfrncMasterIdTypCdgSys) {
        this.docRfrncMasterIdTypCdgSys = docRfrncMasterIdTypCdgSys;
    }
    
    public void addDocRfrncMasterIdTypCdgSys(String docRfrncMasterIdTypCdgSys) {
    	if( docRfrncMasterIdTypCdgSys != null ) {
	    	if( this.docRfrncMasterIdTypCdgSys == null ) {
	        	this.docRfrncMasterIdTypCdgSys = docRfrncMasterIdTypCdgSys;
	        } else if(this.docRfrncMasterIdTypCdgSys.substring(this.docRfrncMasterIdTypCdgSys.length() - 1).equals("]") & docRfrncMasterIdTypCdgSys.equals("[")) {
	        	this.docRfrncMasterIdTypCdgSys = this.docRfrncMasterIdTypCdgSys+ "," + docRfrncMasterIdTypCdgSys;
	        } else if(docRfrncMasterIdTypCdgSys.equals("[") | docRfrncMasterIdTypCdgSys.equals("]") | this.docRfrncMasterIdTypCdgSys.substring(this.docRfrncMasterIdTypCdgSys.length() - 1).equals("[")) {
	        	this.docRfrncMasterIdTypCdgSys = this.docRfrncMasterIdTypCdgSys+docRfrncMasterIdTypCdgSys;
	        } else  {
	            this.docRfrncMasterIdTypCdgSys = this.docRfrncMasterIdTypCdgSys+ "," +docRfrncMasterIdTypCdgSys;
	        }
        }
    }
    
    
    
    public String getDocRfrncMasterIdTypCdgUsrSltd() {
        return this.docRfrncMasterIdTypCdgUsrSltd;
    }
    
    public void setDocRfrncMasterIdTypCdgUsrSltd(String docRfrncMasterIdTypCdgUsrSltd) {
        this.docRfrncMasterIdTypCdgUsrSltd = docRfrncMasterIdTypCdgUsrSltd;
    }
    
    public void addDocRfrncMasterIdTypCdgUsrSltd(String docRfrncMasterIdTypCdgUsrSltd) {
    	if( docRfrncMasterIdTypCdgUsrSltd != null ) {
	    	if( this.docRfrncMasterIdTypCdgUsrSltd == null ) {
	        	this.docRfrncMasterIdTypCdgUsrSltd = docRfrncMasterIdTypCdgUsrSltd;
	        } else if(this.docRfrncMasterIdTypCdgUsrSltd.substring(this.docRfrncMasterIdTypCdgUsrSltd.length() - 1).equals("]") & docRfrncMasterIdTypCdgUsrSltd.equals("[")) {
	        	this.docRfrncMasterIdTypCdgUsrSltd = this.docRfrncMasterIdTypCdgUsrSltd+ "," + docRfrncMasterIdTypCdgUsrSltd;
	        } else if(docRfrncMasterIdTypCdgUsrSltd.equals("[") | docRfrncMasterIdTypCdgUsrSltd.equals("]") | this.docRfrncMasterIdTypCdgUsrSltd.substring(this.docRfrncMasterIdTypCdgUsrSltd.length() - 1).equals("[")) {
	        	this.docRfrncMasterIdTypCdgUsrSltd = this.docRfrncMasterIdTypCdgUsrSltd+docRfrncMasterIdTypCdgUsrSltd;
	        } else  {
	            this.docRfrncMasterIdTypCdgUsrSltd = this.docRfrncMasterIdTypCdgUsrSltd+ "," +docRfrncMasterIdTypCdgUsrSltd;
	        }
        }
    }
    
    
    
    public String getDocRfrncMasterIdTypCdgVrsn() {
        return this.docRfrncMasterIdTypCdgVrsn;
    }
    
    public void setDocRfrncMasterIdTypCdgVrsn(String docRfrncMasterIdTypCdgVrsn) {
        this.docRfrncMasterIdTypCdgVrsn = docRfrncMasterIdTypCdgVrsn;
    }
    
    public void addDocRfrncMasterIdTypCdgVrsn(String docRfrncMasterIdTypCdgVrsn) {
    	if( docRfrncMasterIdTypCdgVrsn != null ) {
	    	if( this.docRfrncMasterIdTypCdgVrsn == null ) {
	        	this.docRfrncMasterIdTypCdgVrsn = docRfrncMasterIdTypCdgVrsn;
	        } else if(this.docRfrncMasterIdTypCdgVrsn.substring(this.docRfrncMasterIdTypCdgVrsn.length() - 1).equals("]") & docRfrncMasterIdTypCdgVrsn.equals("[")) {
	        	this.docRfrncMasterIdTypCdgVrsn = this.docRfrncMasterIdTypCdgVrsn+ "," + docRfrncMasterIdTypCdgVrsn;
	        } else if(docRfrncMasterIdTypCdgVrsn.equals("[") | docRfrncMasterIdTypCdgVrsn.equals("]") | this.docRfrncMasterIdTypCdgVrsn.substring(this.docRfrncMasterIdTypCdgVrsn.length() - 1).equals("[")) {
	        	this.docRfrncMasterIdTypCdgVrsn = this.docRfrncMasterIdTypCdgVrsn+docRfrncMasterIdTypCdgVrsn;
	        } else  {
	            this.docRfrncMasterIdTypCdgVrsn = this.docRfrncMasterIdTypCdgVrsn+ "," +docRfrncMasterIdTypCdgVrsn;
	        }
        }
    }
    
    
    
    public String getDocRfrncMasterIdTypTxt() {
        return this.docRfrncMasterIdTypTxt;
    }
    
    public void setDocRfrncMasterIdTypTxt(String docRfrncMasterIdTypTxt) {
        this.docRfrncMasterIdTypTxt = docRfrncMasterIdTypTxt;
    }
    
    public void addDocRfrncMasterIdTypTxt(String docRfrncMasterIdTypTxt) {
    	if( docRfrncMasterIdTypTxt != null ) {
	    	if( this.docRfrncMasterIdTypTxt == null ) {
	        	this.docRfrncMasterIdTypTxt = docRfrncMasterIdTypTxt;
	        } else if(this.docRfrncMasterIdTypTxt.substring(this.docRfrncMasterIdTypTxt.length() - 1).equals("]") & docRfrncMasterIdTypTxt.equals("[")) {
	        	this.docRfrncMasterIdTypTxt = this.docRfrncMasterIdTypTxt+ "," + docRfrncMasterIdTypTxt;
	        } else if(docRfrncMasterIdTypTxt.equals("[") | docRfrncMasterIdTypTxt.equals("]") | this.docRfrncMasterIdTypTxt.substring(this.docRfrncMasterIdTypTxt.length() - 1).equals("[")) {
	        	this.docRfrncMasterIdTypTxt = this.docRfrncMasterIdTypTxt+docRfrncMasterIdTypTxt;
	        } else  {
	            this.docRfrncMasterIdTypTxt = this.docRfrncMasterIdTypTxt+ "," +docRfrncMasterIdTypTxt;
	        }
        }
    }
    
    
    
    public String getDocRfrncMasterIdUse() {
        return this.docRfrncMasterIdUse;
    }
    
    public void setDocRfrncMasterIdUse(String docRfrncMasterIdUse) {
        this.docRfrncMasterIdUse = docRfrncMasterIdUse;
    }
    
    public void addDocRfrncMasterIdUse(String docRfrncMasterIdUse) {
    	if( docRfrncMasterIdUse != null ) {
	    	if( this.docRfrncMasterIdUse == null ) {
	        	this.docRfrncMasterIdUse = docRfrncMasterIdUse;
	        } else if(this.docRfrncMasterIdUse.substring(this.docRfrncMasterIdUse.length() - 1).equals("]") & docRfrncMasterIdUse.equals("[")) {
	        	this.docRfrncMasterIdUse = this.docRfrncMasterIdUse+ "," + docRfrncMasterIdUse;
	        } else if(docRfrncMasterIdUse.equals("[") | docRfrncMasterIdUse.equals("]") | this.docRfrncMasterIdUse.substring(this.docRfrncMasterIdUse.length() - 1).equals("[")) {
	        	this.docRfrncMasterIdUse = this.docRfrncMasterIdUse+docRfrncMasterIdUse;
	        } else  {
	            this.docRfrncMasterIdUse = this.docRfrncMasterIdUse+ "," +docRfrncMasterIdUse;
	        }
        }
    }
    
    
    
    public String getDocRfrncMasterIdVl() {
        return this.docRfrncMasterIdVl;
    }
    
    public void setDocRfrncMasterIdVl(String docRfrncMasterIdVl) {
        this.docRfrncMasterIdVl = docRfrncMasterIdVl;
    }
    
    public void addDocRfrncMasterIdVl(String docRfrncMasterIdVl) {
    	if( docRfrncMasterIdVl != null ) {
	    	if( this.docRfrncMasterIdVl == null ) {
	        	this.docRfrncMasterIdVl = docRfrncMasterIdVl;
	        } else if(this.docRfrncMasterIdVl.substring(this.docRfrncMasterIdVl.length() - 1).equals("]") & docRfrncMasterIdVl.equals("[")) {
	        	this.docRfrncMasterIdVl = this.docRfrncMasterIdVl+ "," + docRfrncMasterIdVl;
	        } else if(docRfrncMasterIdVl.equals("[") | docRfrncMasterIdVl.equals("]") | this.docRfrncMasterIdVl.substring(this.docRfrncMasterIdVl.length() - 1).equals("[")) {
	        	this.docRfrncMasterIdVl = this.docRfrncMasterIdVl+docRfrncMasterIdVl;
	        } else  {
	            this.docRfrncMasterIdVl = this.docRfrncMasterIdVl+ "," +docRfrncMasterIdVl;
	        }
        }
    }
    
    
    
    public String getDocRfrncRelatesToCd() {
        return this.docRfrncRelatesToCd;
    }
    
    public void setDocRfrncRelatesToCd(String docRfrncRelatesToCd) {
        this.docRfrncRelatesToCd = docRfrncRelatesToCd;
    }
    
    public void addDocRfrncRelatesToCd(String docRfrncRelatesToCd) {
    	if( docRfrncRelatesToCd != null ) {
	    	if( this.docRfrncRelatesToCd == null ) {
	        	this.docRfrncRelatesToCd = docRfrncRelatesToCd;
	        } else if(this.docRfrncRelatesToCd.substring(this.docRfrncRelatesToCd.length() - 1).equals("]") & docRfrncRelatesToCd.equals("[")) {
	        	this.docRfrncRelatesToCd = this.docRfrncRelatesToCd+ "," + docRfrncRelatesToCd;
	        } else if(docRfrncRelatesToCd.equals("[") | docRfrncRelatesToCd.equals("]") | this.docRfrncRelatesToCd.substring(this.docRfrncRelatesToCd.length() - 1).equals("[")) {
	        	this.docRfrncRelatesToCd = this.docRfrncRelatesToCd+docRfrncRelatesToCd;
	        } else  {
	            this.docRfrncRelatesToCd = this.docRfrncRelatesToCd+ "," +docRfrncRelatesToCd;
	        }
        }
    }
    
    
    
    public String getDocRfrncSecurityLblCdgCd() {
        return this.docRfrncSecurityLblCdgCd;
    }
    
    public void setDocRfrncSecurityLblCdgCd(String docRfrncSecurityLblCdgCd) {
        this.docRfrncSecurityLblCdgCd = docRfrncSecurityLblCdgCd;
    }
    
    public void addDocRfrncSecurityLblCdgCd(String docRfrncSecurityLblCdgCd) {
    	if( docRfrncSecurityLblCdgCd != null ) {
	    	if( this.docRfrncSecurityLblCdgCd == null ) {
	        	this.docRfrncSecurityLblCdgCd = docRfrncSecurityLblCdgCd;
	        } else if(this.docRfrncSecurityLblCdgCd.substring(this.docRfrncSecurityLblCdgCd.length() - 1).equals("]") & docRfrncSecurityLblCdgCd.equals("[")) {
	        	this.docRfrncSecurityLblCdgCd = this.docRfrncSecurityLblCdgCd+ "," + docRfrncSecurityLblCdgCd;
	        } else if(docRfrncSecurityLblCdgCd.equals("[") | docRfrncSecurityLblCdgCd.equals("]") | this.docRfrncSecurityLblCdgCd.substring(this.docRfrncSecurityLblCdgCd.length() - 1).equals("[")) {
	        	this.docRfrncSecurityLblCdgCd = this.docRfrncSecurityLblCdgCd+docRfrncSecurityLblCdgCd;
	        } else  {
	            this.docRfrncSecurityLblCdgCd = this.docRfrncSecurityLblCdgCd+ "," +docRfrncSecurityLblCdgCd;
	        }
        }
    }
    
    
    
    public String getDocRfrncSecurityLblCdgDsply() {
        return this.docRfrncSecurityLblCdgDsply;
    }
    
    public void setDocRfrncSecurityLblCdgDsply(String docRfrncSecurityLblCdgDsply) {
        this.docRfrncSecurityLblCdgDsply = docRfrncSecurityLblCdgDsply;
    }
    
    public void addDocRfrncSecurityLblCdgDsply(String docRfrncSecurityLblCdgDsply) {
    	if( docRfrncSecurityLblCdgDsply != null ) {
	    	if( this.docRfrncSecurityLblCdgDsply == null ) {
	        	this.docRfrncSecurityLblCdgDsply = docRfrncSecurityLblCdgDsply;
	        } else if(this.docRfrncSecurityLblCdgDsply.substring(this.docRfrncSecurityLblCdgDsply.length() - 1).equals("]") & docRfrncSecurityLblCdgDsply.equals("[")) {
	        	this.docRfrncSecurityLblCdgDsply = this.docRfrncSecurityLblCdgDsply+ "," + docRfrncSecurityLblCdgDsply;
	        } else if(docRfrncSecurityLblCdgDsply.equals("[") | docRfrncSecurityLblCdgDsply.equals("]") | this.docRfrncSecurityLblCdgDsply.substring(this.docRfrncSecurityLblCdgDsply.length() - 1).equals("[")) {
	        	this.docRfrncSecurityLblCdgDsply = this.docRfrncSecurityLblCdgDsply+docRfrncSecurityLblCdgDsply;
	        } else  {
	            this.docRfrncSecurityLblCdgDsply = this.docRfrncSecurityLblCdgDsply+ "," +docRfrncSecurityLblCdgDsply;
	        }
        }
    }
    
    
    
    public String getDocRfrncSecurityLblCdgSys() {
        return this.docRfrncSecurityLblCdgSys;
    }
    
    public void setDocRfrncSecurityLblCdgSys(String docRfrncSecurityLblCdgSys) {
        this.docRfrncSecurityLblCdgSys = docRfrncSecurityLblCdgSys;
    }
    
    public void addDocRfrncSecurityLblCdgSys(String docRfrncSecurityLblCdgSys) {
    	if( docRfrncSecurityLblCdgSys != null ) {
	    	if( this.docRfrncSecurityLblCdgSys == null ) {
	        	this.docRfrncSecurityLblCdgSys = docRfrncSecurityLblCdgSys;
	        } else if(this.docRfrncSecurityLblCdgSys.substring(this.docRfrncSecurityLblCdgSys.length() - 1).equals("]") & docRfrncSecurityLblCdgSys.equals("[")) {
	        	this.docRfrncSecurityLblCdgSys = this.docRfrncSecurityLblCdgSys+ "," + docRfrncSecurityLblCdgSys;
	        } else if(docRfrncSecurityLblCdgSys.equals("[") | docRfrncSecurityLblCdgSys.equals("]") | this.docRfrncSecurityLblCdgSys.substring(this.docRfrncSecurityLblCdgSys.length() - 1).equals("[")) {
	        	this.docRfrncSecurityLblCdgSys = this.docRfrncSecurityLblCdgSys+docRfrncSecurityLblCdgSys;
	        } else  {
	            this.docRfrncSecurityLblCdgSys = this.docRfrncSecurityLblCdgSys+ "," +docRfrncSecurityLblCdgSys;
	        }
        }
    }
    
    
    
    public String getDocRfrncSecurityLblCdgUsrSltd() {
        return this.docRfrncSecurityLblCdgUsrSltd;
    }
    
    public void setDocRfrncSecurityLblCdgUsrSltd(String docRfrncSecurityLblCdgUsrSltd) {
        this.docRfrncSecurityLblCdgUsrSltd = docRfrncSecurityLblCdgUsrSltd;
    }
    
    public void addDocRfrncSecurityLblCdgUsrSltd(String docRfrncSecurityLblCdgUsrSltd) {
    	if( docRfrncSecurityLblCdgUsrSltd != null ) {
	    	if( this.docRfrncSecurityLblCdgUsrSltd == null ) {
	        	this.docRfrncSecurityLblCdgUsrSltd = docRfrncSecurityLblCdgUsrSltd;
	        } else if(this.docRfrncSecurityLblCdgUsrSltd.substring(this.docRfrncSecurityLblCdgUsrSltd.length() - 1).equals("]") & docRfrncSecurityLblCdgUsrSltd.equals("[")) {
	        	this.docRfrncSecurityLblCdgUsrSltd = this.docRfrncSecurityLblCdgUsrSltd+ "," + docRfrncSecurityLblCdgUsrSltd;
	        } else if(docRfrncSecurityLblCdgUsrSltd.equals("[") | docRfrncSecurityLblCdgUsrSltd.equals("]") | this.docRfrncSecurityLblCdgUsrSltd.substring(this.docRfrncSecurityLblCdgUsrSltd.length() - 1).equals("[")) {
	        	this.docRfrncSecurityLblCdgUsrSltd = this.docRfrncSecurityLblCdgUsrSltd+docRfrncSecurityLblCdgUsrSltd;
	        } else  {
	            this.docRfrncSecurityLblCdgUsrSltd = this.docRfrncSecurityLblCdgUsrSltd+ "," +docRfrncSecurityLblCdgUsrSltd;
	        }
        }
    }
    
    
    
    public String getDocRfrncSecurityLblCdgVrsn() {
        return this.docRfrncSecurityLblCdgVrsn;
    }
    
    public void setDocRfrncSecurityLblCdgVrsn(String docRfrncSecurityLblCdgVrsn) {
        this.docRfrncSecurityLblCdgVrsn = docRfrncSecurityLblCdgVrsn;
    }
    
    public void addDocRfrncSecurityLblCdgVrsn(String docRfrncSecurityLblCdgVrsn) {
    	if( docRfrncSecurityLblCdgVrsn != null ) {
	    	if( this.docRfrncSecurityLblCdgVrsn == null ) {
	        	this.docRfrncSecurityLblCdgVrsn = docRfrncSecurityLblCdgVrsn;
	        } else if(this.docRfrncSecurityLblCdgVrsn.substring(this.docRfrncSecurityLblCdgVrsn.length() - 1).equals("]") & docRfrncSecurityLblCdgVrsn.equals("[")) {
	        	this.docRfrncSecurityLblCdgVrsn = this.docRfrncSecurityLblCdgVrsn+ "," + docRfrncSecurityLblCdgVrsn;
	        } else if(docRfrncSecurityLblCdgVrsn.equals("[") | docRfrncSecurityLblCdgVrsn.equals("]") | this.docRfrncSecurityLblCdgVrsn.substring(this.docRfrncSecurityLblCdgVrsn.length() - 1).equals("[")) {
	        	this.docRfrncSecurityLblCdgVrsn = this.docRfrncSecurityLblCdgVrsn+docRfrncSecurityLblCdgVrsn;
	        } else  {
	            this.docRfrncSecurityLblCdgVrsn = this.docRfrncSecurityLblCdgVrsn+ "," +docRfrncSecurityLblCdgVrsn;
	        }
        }
    }
    
    
    
    public String getDocRfrncSecurityLblTxt() {
        return this.docRfrncSecurityLblTxt;
    }
    
    public void setDocRfrncSecurityLblTxt(String docRfrncSecurityLblTxt) {
        this.docRfrncSecurityLblTxt = docRfrncSecurityLblTxt;
    }
    
    public void addDocRfrncSecurityLblTxt(String docRfrncSecurityLblTxt) {
    	if( docRfrncSecurityLblTxt != null ) {
	    	if( this.docRfrncSecurityLblTxt == null ) {
	        	this.docRfrncSecurityLblTxt = docRfrncSecurityLblTxt;
	        } else if(this.docRfrncSecurityLblTxt.substring(this.docRfrncSecurityLblTxt.length() - 1).equals("]") & docRfrncSecurityLblTxt.equals("[")) {
	        	this.docRfrncSecurityLblTxt = this.docRfrncSecurityLblTxt+ "," + docRfrncSecurityLblTxt;
	        } else if(docRfrncSecurityLblTxt.equals("[") | docRfrncSecurityLblTxt.equals("]") | this.docRfrncSecurityLblTxt.substring(this.docRfrncSecurityLblTxt.length() - 1).equals("[")) {
	        	this.docRfrncSecurityLblTxt = this.docRfrncSecurityLblTxt+docRfrncSecurityLblTxt;
	        } else  {
	            this.docRfrncSecurityLblTxt = this.docRfrncSecurityLblTxt+ "," +docRfrncSecurityLblTxt;
	        }
        }
    }
    
    
    
    public String getDocRfrncSts() {
        return this.docRfrncSts;
    }
    
    public void setDocRfrncSts(String docRfrncSts) {
        this.docRfrncSts = docRfrncSts;
    }
    
    public void addDocRfrncSts(String docRfrncSts) {
    	if( docRfrncSts != null ) {
	    	if( this.docRfrncSts == null ) {
	        	this.docRfrncSts = docRfrncSts;
	        } else if(this.docRfrncSts.substring(this.docRfrncSts.length() - 1).equals("]") & docRfrncSts.equals("[")) {
	        	this.docRfrncSts = this.docRfrncSts+ "," + docRfrncSts;
	        } else if(docRfrncSts.equals("[") | docRfrncSts.equals("]") | this.docRfrncSts.substring(this.docRfrncSts.length() - 1).equals("[")) {
	        	this.docRfrncSts = this.docRfrncSts+docRfrncSts;
	        } else  {
	            this.docRfrncSts = this.docRfrncSts+ "," +docRfrncSts;
	        }
        }
    }
    
    
    
    public String getDocRfrncSbjct() {
        return this.docRfrncSbjct;
    }
    
    public void setDocRfrncSbjct(String docRfrncSbjct) {
        this.docRfrncSbjct = docRfrncSbjct;
    }
    
    public void addDocRfrncSbjct(String docRfrncSbjct) {
    	if( docRfrncSbjct != null ) {
	    	if( this.docRfrncSbjct == null ) {
	        	this.docRfrncSbjct = docRfrncSbjct;
	        } else if(this.docRfrncSbjct.substring(this.docRfrncSbjct.length() - 1).equals("]") & docRfrncSbjct.equals("[")) {
	        	this.docRfrncSbjct = this.docRfrncSbjct+ "," + docRfrncSbjct;
	        } else if(docRfrncSbjct.equals("[") | docRfrncSbjct.equals("]") | this.docRfrncSbjct.substring(this.docRfrncSbjct.length() - 1).equals("[")) {
	        	this.docRfrncSbjct = this.docRfrncSbjct+docRfrncSbjct;
	        } else  {
	            this.docRfrncSbjct = this.docRfrncSbjct+ "," +docRfrncSbjct;
	        }
        }
    }
    
    
    
    public String getDocRfrncTypCdgCd() {
        return this.docRfrncTypCdgCd;
    }
    
    public void setDocRfrncTypCdgCd(String docRfrncTypCdgCd) {
        this.docRfrncTypCdgCd = docRfrncTypCdgCd;
    }
    
    public void addDocRfrncTypCdgCd(String docRfrncTypCdgCd) {
    	if( docRfrncTypCdgCd != null ) {
	    	if( this.docRfrncTypCdgCd == null ) {
	        	this.docRfrncTypCdgCd = docRfrncTypCdgCd;
	        } else if(this.docRfrncTypCdgCd.substring(this.docRfrncTypCdgCd.length() - 1).equals("]") & docRfrncTypCdgCd.equals("[")) {
	        	this.docRfrncTypCdgCd = this.docRfrncTypCdgCd+ "," + docRfrncTypCdgCd;
	        } else if(docRfrncTypCdgCd.equals("[") | docRfrncTypCdgCd.equals("]") | this.docRfrncTypCdgCd.substring(this.docRfrncTypCdgCd.length() - 1).equals("[")) {
	        	this.docRfrncTypCdgCd = this.docRfrncTypCdgCd+docRfrncTypCdgCd;
	        } else  {
	            this.docRfrncTypCdgCd = this.docRfrncTypCdgCd+ "," +docRfrncTypCdgCd;
	        }
        }
    }
    
    
    
    public String getDocRfrncTypCdgDsply() {
        return this.docRfrncTypCdgDsply;
    }
    
    public void setDocRfrncTypCdgDsply(String docRfrncTypCdgDsply) {
        this.docRfrncTypCdgDsply = docRfrncTypCdgDsply;
    }
    
    public void addDocRfrncTypCdgDsply(String docRfrncTypCdgDsply) {
    	if( docRfrncTypCdgDsply != null ) {
	    	if( this.docRfrncTypCdgDsply == null ) {
	        	this.docRfrncTypCdgDsply = docRfrncTypCdgDsply;
	        } else if(this.docRfrncTypCdgDsply.substring(this.docRfrncTypCdgDsply.length() - 1).equals("]") & docRfrncTypCdgDsply.equals("[")) {
	        	this.docRfrncTypCdgDsply = this.docRfrncTypCdgDsply+ "," + docRfrncTypCdgDsply;
	        } else if(docRfrncTypCdgDsply.equals("[") | docRfrncTypCdgDsply.equals("]") | this.docRfrncTypCdgDsply.substring(this.docRfrncTypCdgDsply.length() - 1).equals("[")) {
	        	this.docRfrncTypCdgDsply = this.docRfrncTypCdgDsply+docRfrncTypCdgDsply;
	        } else  {
	            this.docRfrncTypCdgDsply = this.docRfrncTypCdgDsply+ "," +docRfrncTypCdgDsply;
	        }
        }
    }
    
    
    
    public String getDocRfrncTypCdgSys() {
        return this.docRfrncTypCdgSys;
    }
    
    public void setDocRfrncTypCdgSys(String docRfrncTypCdgSys) {
        this.docRfrncTypCdgSys = docRfrncTypCdgSys;
    }
    
    public void addDocRfrncTypCdgSys(String docRfrncTypCdgSys) {
    	if( docRfrncTypCdgSys != null ) {
	    	if( this.docRfrncTypCdgSys == null ) {
	        	this.docRfrncTypCdgSys = docRfrncTypCdgSys;
	        } else if(this.docRfrncTypCdgSys.substring(this.docRfrncTypCdgSys.length() - 1).equals("]") & docRfrncTypCdgSys.equals("[")) {
	        	this.docRfrncTypCdgSys = this.docRfrncTypCdgSys+ "," + docRfrncTypCdgSys;
	        } else if(docRfrncTypCdgSys.equals("[") | docRfrncTypCdgSys.equals("]") | this.docRfrncTypCdgSys.substring(this.docRfrncTypCdgSys.length() - 1).equals("[")) {
	        	this.docRfrncTypCdgSys = this.docRfrncTypCdgSys+docRfrncTypCdgSys;
	        } else  {
	            this.docRfrncTypCdgSys = this.docRfrncTypCdgSys+ "," +docRfrncTypCdgSys;
	        }
        }
    }
    
    
    
    public String getDocRfrncTypCdgUsrSltd() {
        return this.docRfrncTypCdgUsrSltd;
    }
    
    public void setDocRfrncTypCdgUsrSltd(String docRfrncTypCdgUsrSltd) {
        this.docRfrncTypCdgUsrSltd = docRfrncTypCdgUsrSltd;
    }
    
    public void addDocRfrncTypCdgUsrSltd(String docRfrncTypCdgUsrSltd) {
    	if( docRfrncTypCdgUsrSltd != null ) {
	    	if( this.docRfrncTypCdgUsrSltd == null ) {
	        	this.docRfrncTypCdgUsrSltd = docRfrncTypCdgUsrSltd;
	        } else if(this.docRfrncTypCdgUsrSltd.substring(this.docRfrncTypCdgUsrSltd.length() - 1).equals("]") & docRfrncTypCdgUsrSltd.equals("[")) {
	        	this.docRfrncTypCdgUsrSltd = this.docRfrncTypCdgUsrSltd+ "," + docRfrncTypCdgUsrSltd;
	        } else if(docRfrncTypCdgUsrSltd.equals("[") | docRfrncTypCdgUsrSltd.equals("]") | this.docRfrncTypCdgUsrSltd.substring(this.docRfrncTypCdgUsrSltd.length() - 1).equals("[")) {
	        	this.docRfrncTypCdgUsrSltd = this.docRfrncTypCdgUsrSltd+docRfrncTypCdgUsrSltd;
	        } else  {
	            this.docRfrncTypCdgUsrSltd = this.docRfrncTypCdgUsrSltd+ "," +docRfrncTypCdgUsrSltd;
	        }
        }
    }
    
    
    
    public String getDocRfrncTypCdgVrsn() {
        return this.docRfrncTypCdgVrsn;
    }
    
    public void setDocRfrncTypCdgVrsn(String docRfrncTypCdgVrsn) {
        this.docRfrncTypCdgVrsn = docRfrncTypCdgVrsn;
    }
    
    public void addDocRfrncTypCdgVrsn(String docRfrncTypCdgVrsn) {
    	if( docRfrncTypCdgVrsn != null ) {
	    	if( this.docRfrncTypCdgVrsn == null ) {
	        	this.docRfrncTypCdgVrsn = docRfrncTypCdgVrsn;
	        } else if(this.docRfrncTypCdgVrsn.substring(this.docRfrncTypCdgVrsn.length() - 1).equals("]") & docRfrncTypCdgVrsn.equals("[")) {
	        	this.docRfrncTypCdgVrsn = this.docRfrncTypCdgVrsn+ "," + docRfrncTypCdgVrsn;
	        } else if(docRfrncTypCdgVrsn.equals("[") | docRfrncTypCdgVrsn.equals("]") | this.docRfrncTypCdgVrsn.substring(this.docRfrncTypCdgVrsn.length() - 1).equals("[")) {
	        	this.docRfrncTypCdgVrsn = this.docRfrncTypCdgVrsn+docRfrncTypCdgVrsn;
	        } else  {
	            this.docRfrncTypCdgVrsn = this.docRfrncTypCdgVrsn+ "," +docRfrncTypCdgVrsn;
	        }
        }
    }
    
    
    
    public String getDocRfrncTypTxt() {
        return this.docRfrncTypTxt;
    }
    
    public void setDocRfrncTypTxt(String docRfrncTypTxt) {
        this.docRfrncTypTxt = docRfrncTypTxt;
    }
    
    public void addDocRfrncTypTxt(String docRfrncTypTxt) {
    	if( docRfrncTypTxt != null ) {
	    	if( this.docRfrncTypTxt == null ) {
	        	this.docRfrncTypTxt = docRfrncTypTxt;
	        } else if(this.docRfrncTypTxt.substring(this.docRfrncTypTxt.length() - 1).equals("]") & docRfrncTypTxt.equals("[")) {
	        	this.docRfrncTypTxt = this.docRfrncTypTxt+ "," + docRfrncTypTxt;
	        } else if(docRfrncTypTxt.equals("[") | docRfrncTypTxt.equals("]") | this.docRfrncTypTxt.substring(this.docRfrncTypTxt.length() - 1).equals("[")) {
	        	this.docRfrncTypTxt = this.docRfrncTypTxt+docRfrncTypTxt;
	        } else  {
	            this.docRfrncTypTxt = this.docRfrncTypTxt+ "," +docRfrncTypTxt;
	        }
        }
    }
    
    
    


}


