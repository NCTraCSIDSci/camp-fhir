package com.journaldev.jackson.json;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.journaldev.jackson.model.CAMPFHIRJackson;

public class JacksonStreamingWriteExample {

	public static void main(String[] args) throws IOException {
		CAMPFHIRJackson emp = JacksonObjectMapperExample.createEmployee();

		JsonGenerator jsonGenerator = new JsonFactory()
				.createGenerator(new FileOutputStream("stream_emp.txt"));
		//for pretty printing
		jsonGenerator.setPrettyPrinter(new DefaultPrettyPrinter());
		
		jsonGenerator.writeStartObject(); // start root object
		
		jsonGenerator.writeStringField("SQLDialects", emp.getSQLDialects());
		jsonGenerator.writeStringField("db_url", emp.getOutputFolder());
		jsonGenerator.writeStringField("db_username", emp.getUsername());
		
		jsonGenerator.writeStringField("db_password", emp.getPassword());
		
		jsonGenerator.writeStringField("resource", emp.getResource());
		jsonGenerator.writeStringField("output_folder", emp.getOutputFolder());
		jsonGenerator.writeStringField("db_partition", emp.getPartition());
		
		

		jsonGenerator.writeEndObject(); //closing root object
		
		jsonGenerator.flush();
		jsonGenerator.close();
	}

}
