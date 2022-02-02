package com.journaldev.jackson.json;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.journaldev.jackson.model.CAMPFHIRJackson;

public class JacksonStreamingReadExample {

	public static void main(String[] args) throws JsonParseException, IOException {
		
		//create JsonParser object
		JsonParser jsonParser = new JsonFactory().createParser(new File("employee.txt"));
		
		//loop through the tokens
		CAMPFHIRJackson emp = new CAMPFHIRJackson();


		List<Long> phoneNums = new ArrayList<Long>();
		boolean insidePropertiesObj=false;
		
		parseJSON(jsonParser, emp, phoneNums, insidePropertiesObj);
		
		long[] nums = new long[phoneNums.size()];
		int index = 0;
		for(Long l :phoneNums){
			nums[index++] = l;
		}
		
		jsonParser.close();
		//print employee object
		System.out.println("Employee Object\n\n"+emp);
	}

	private static void parseJSON(JsonParser jsonParser, CAMPFHIRJackson emp,
			List<Long> phoneNums, boolean insidePropertiesObj) throws JsonParseException, IOException {
		
		//loop through the JsonTokens
		while(jsonParser.nextToken() != JsonToken.END_OBJECT){
			String name = jsonParser.getCurrentName();
			if("SQLDialects".equals(name)){
				jsonParser.nextToken();
				emp.setResource(jsonParser.getText());
			}else if("db_url".equals(name)){
				jsonParser.nextToken();
				emp.setOutputFolder(jsonParser.getText());
			}else if("db_username".equals(name)){
				jsonParser.nextToken();
				emp.setPartition(jsonParser.getText());
			}else if("db_password".equals(name)){
				jsonParser.nextToken();
				emp.setConfigPath(jsonParser.getText());
			}else if("resource".equals(name)){
				jsonParser.nextToken();
				emp.setConfigPath(jsonParser.getText());
			}else if("output_folder".equals(name)){
				jsonParser.nextToken();
				emp.setConfigPath(jsonParser.getText());
			}else if("db_partition".equals(name)){
				jsonParser.nextToken();
				emp.setConfigPath(jsonParser.getText());
			}
		}
	}

}
