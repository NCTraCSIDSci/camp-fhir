package main.java.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;

import javax.xml.parsers.ParserConfigurationException;

import org.hl7.fhir.exceptions.FHIRException; 
import org.xml.sax.SAXException;

import com.fasterxml.jackson.databind.ObjectMapper;

import main.java.com.campfhir.model.Campfhir;
import main.java.com.campfhir.service.ResourceInService;

/**
*
* @author  James Champion	
* @version 1.0
* @since   2019-08-20
*/
public class run 
{
	public static void main(String[] args) 
			throws ParseException, 
			FHIRException, 
			IOException, 
			ParserConfigurationException, 
			SAXException, 
			InterruptedException, 
			ClassNotFoundException, org.apache.commons.cli.ParseException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException 
	{
		
		//Process process = Runtime.getRuntime()
		        //.exec("java -jar /Users/jameschampion/git/camp-fhir/CAMP-FHIR/target/CAMPFHIR.jar");
				//.exec("pwd");
		      //.exec("sh -c ls", null, new File("Pathname")); for non-Windows users
		//printResults(process);
		
		System.out.println(new File(".").getCanonicalPath());
	}
	
	public static void printResults(Process process) throws IOException {
	    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	    String line = "";
	    System.out.println("test");
	    while ((line = reader.readLine()) != null) {
	        System.out.println(line);
	    }
	}
	
}


