//package com.journaldev.jackson.model;
//
//public class CAMPFHIRJackson {
//
//	private String resource;
//	private String outputfolder;
//	private String partition;
//	private String db_url;
//	private String db_username;
//	private String db_password;
//	private String SQLDialects;
//	
//	
//	public String getResource() {
//		return resource;
//	}
//	public void setResource(String resource) {
//		this.resource = resource;
//	}
//	public String getOutputFolder() {
//		return outputfolder;
//	}
//	public void setOutputFolder(String outputfolder) {
//		this.outputfolder = outputfolder;
//	}
//	public String getPartition() {
//		return partition;
//	}
//	public void setPartition(String db_url) {
//		this.partition = partition;
//	}
//	public String getURL() {
//		return db_url;
//	}
//	public void setURL(String db_url) {
//		this.db_url = db_url;
//	}
//	public String getUsername() {
//		return db_username;
//	}
//	public void setUsername(String db_username) {
//		this.db_username = db_username;
//	}
//	public String getPassword() {
//		return db_password;
//	}
//	public void setPassword(String db_password) {
//		this.db_password = db_password;
//	}
//	public String getSQLDialects() {
//		return SQLDialects;
//	}
//	public void setSQLDialects(String SQLDialects) {
//		this.SQLDialects = SQLDialects;
//	}
//	
//	
//	@Override
//	public String toString(){
//		StringBuilder sb = new StringBuilder();
//		sb.append("***** Parsed From String *****\n");
//		sb.append("SQLDialects="+ getSQLDialects() +"\n");
//		sb.append("db_url="+ getURL() +"\n");
//
//		sb.append("db_username="+ getUsername() +"\n");
//		sb.append("db_password=" + getPassword() +"\n");
//		sb.append("resource="+ getResource() +"\n");
//		sb.append("output_folder="+ getOutputFolder() +"\n");
//		sb.append("db_partition=" + getPartition() +"\n");
//		
//		sb.append("*****************************");
//		
//		return sb.toString();
//	}
//
//}
