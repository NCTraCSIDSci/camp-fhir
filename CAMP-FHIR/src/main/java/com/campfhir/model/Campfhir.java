package main.java.com.campfhir.model;


public class Campfhir 
{
	
	//Input values
	////Database values
	private String iSqldialects;
	private String iSqlDriverClass;
	private String iDburl;
	private String iDbusername;
	private String iDbpassword;
	

	////Flat file
	private String iInputfolder;
	private String iFileType;
	private String iPartition;
	
	
	//Output values
	////Database values
	private String oSqldialects;
	private String oSqlDriverClass;
	private String oDburl;
	private String oDbusername;
	private String oDbpassword;
	
	////Flat file
	private String oOutputfolder;
	private String oFileType;
	private String oPartition;

	
	
	private String resource;


	public String getiSqldialects() {
		return iSqldialects;
	}


	public void setiSqldialects(String iSqldialects) {
		this.iSqldialects = iSqldialects;
	}
	
	public String getiSqlDriverClass() {
		return iSqlDriverClass;
	}


	public void setiSqlDriverClass(String iSqlDriverClass) {
		this.iSqlDriverClass = iSqlDriverClass;
	}



	public String getiDburl() {
		return iDburl;
	}


	public void setiDburl(String iDburl) {
		this.iDburl = iDburl;
	}


	public String getiDbusername() {
		return iDbusername;
	}


	public void setiDbusername(String iDbusername) {
		this.iDbusername = iDbusername;
	}


	public String getiDbpassword() {
		return iDbpassword;
	}


	public void setiDbpassword(String iDbpassword) {
		this.iDbpassword = iDbpassword;
	}


	public String getoPartition() {
		return oPartition;
	}


	public void setoPartition(String oPartition) {
		this.oPartition = oPartition;
	}
	
	public String getiPartition() {
		return iPartition;
	}


	public void setiPartition(String iPartition) {
		this.iPartition = iPartition;
	}

	public String getiInputfolder() {
		return iInputfolder;
	}


	public void setiInpoutfolder(String iInpoutfolder) {
		this.iInputfolder = iInpoutfolder;
	}


	public String getoSqldialects() {
		return oSqldialects;
	}


	public void setoSqldialects(String oSqldialects) {
		this.oSqldialects = oSqldialects;
	}


	
	public String getoSqlDriverClass() {
		return oSqlDriverClass;
	}


	public void setoSqlDriverClass(String oSqlDriverClass) {
		this.oSqlDriverClass = oSqlDriverClass;
	}

	
	public String getoDburl() {
		return oDburl;
	}


	public void setoDburl(String oDburl) {
		this.oDburl = oDburl;
	}


	public String getoDbusername() {
		return oDbusername;
	}


	public void setoDbusername(String oDbusername) {
		this.oDbusername = oDbusername;
	}


	public String getoDbpassword() {
		return oDbpassword;
	}


	public void setoDbpassword(String oDbpassword) {
		this.oDbpassword = oDbpassword;
	}


	public String getoOutputfolder() {
		return oOutputfolder;
	}


	public void setoOutputfolder(String oOutputfolder) {
		this.oOutputfolder = oOutputfolder;
	}


	public String getResource() {
		return resource;
	}


	public void setResource(String resource) {
		this.resource = resource;
	}


	public String getiFileType() {
		return iFileType;
	}


	public void setiFileType(String iFileType) {
		this.iFileType = iFileType;
	}


	public String getoFileType() {
		return oFileType;
	}


	public void setoFileType(String oFileType) {
		this.oFileType = oFileType;
	}




}