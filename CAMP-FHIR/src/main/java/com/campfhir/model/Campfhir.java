package main.java.com.campfhir.model;

public class Campfhir 
{

	private String resource;
	private String resourceconfiguration;
	private String outputfolder;
	private String partition;
	private String dburl;
	private String dbusername;
	private String dbpassword;
	private String sqldialects;
	private String custommapping;	
	private String driverclass;
	
	public String getResource() 
	{
		return resource;
	}
	
	public void setResource(String resource) 
	{
		this.resource = resource;
	}
	
	public String getOutputfolder() {
		return outputfolder;
	}
	
	public void setOutputfolder(String outputfolder) 
	{
		this.outputfolder = outputfolder;
	}
	
	public String getPartition() 
	{
		return partition;
	}
	
	public void setPartition(String partition) 
	{
		this.partition = partition;
	}
	
	public String getDburl() 
	{
		return dburl;
	}
	
	public void setDburl(String dburl) 
	{
		this.dburl = dburl;
	}
	
	public String getDbusername() 
	{
		return dbusername;
	}
	
	public void setDbusername(String dbusername) 
	{
		this.dbusername = dbusername;
	}
	
	public String getDbpassword() 
	{
		return dbpassword;
	}
	
	public void setDbpassword(String dbpassword) 
	{
		this.dbpassword = dbpassword;
	}
	
	public String getSqldialects() 
	{
		return sqldialects;
	}
	
	public void setSqlialects(String sqldialects) 
	{
		this.sqldialects = sqldialects;
	}

	public String getResourceconfiguration() 
	{
		return resourceconfiguration;
	}

	public void setResourceconfiguration(String resourceconfiguration) 
	{
		this.resourceconfiguration = resourceconfiguration;
	}
	
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("***** Parsed From String *****\n");
		sb.append("SQLDialects="+ getSqldialects() +"\n");
		sb.append("dburl="+ getDburl() +"\n");

		sb.append("dbusername="+ getDbusername() +"\n");
		sb.append("dbpassword=" + getDbpassword() +"\n");
		sb.append("resource="+ getResource() +"\n");
		sb.append("outputfolder="+ getOutputfolder() +"\n");
		sb.append("dbpartition=" + getPartition() +"\n");
		
		sb.append("*****************************");
		
		return sb.toString();
	}

	public String getCustommapping() {
		return custommapping;
	}

	public void setCustommapping(String custommapping) {
		this.custommapping = custommapping;
	}

	public String getDriverclass() {
		return driverclass;
	}

	public void setDriverclass(String driverclass) {
		this.driverclass = driverclass;
	}


}
