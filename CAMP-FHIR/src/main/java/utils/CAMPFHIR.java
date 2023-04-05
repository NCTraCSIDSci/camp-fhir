package main.java.utils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;

import javax.xml.parsers.ParserConfigurationException;

import org.hibernate.exception.SQLGrammarException;
import org.hl7.fhir.exceptions.FHIRException; 
import org.xml.sax.SAXException;

import com.fasterxml.jackson.databind.ObjectMapper;

import main.java.com.campfhir.dao.ResourceDao;
import main.java.com.campfhir.model.Campfhir;
import main.java.com.campfhir.service.ResourceInService;
import main.java.com.campfhir.service.ResourceOutService;

/**
*
* @author  James Champion	
* @version 1.0
* @since   2019-08-20
*/
public class CAMPFHIR  
{
	public static void main(String[] args) 
			throws ParseException, 
			FHIRException, 
			IOException, 
			ParserConfigurationException, 
			SAXException, 
			InterruptedException, 
			ClassNotFoundException, 
			org.apache.commons.cli.ParseException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException,SQLGrammarException 
	{
		String config = "";
		if (args.length > 0) {
			config = new File("./").getCanonicalPath()+ "/"+args[0];
			System.out.println(config);
		} else {
			config = new File("./").getCanonicalPath()+ "/config.json";
			System.out.println(config);
		}
		
		ObjectMapper mapper = new ObjectMapper();
        Campfhir cf = mapper.readValue(new File(config), Campfhir.class);

        new ResourceInService().run(cf);
        
//        try {
//        	ResourceDao rd = new ResourceDao();
//        	rd.closeCurrentSession();
//        } catch (Exception e) {
//        	
//        }
        
//        for(int i=0;i<100000;i++)
//        {
//        	System.out.println(i);
//        }
		
		System.out.println("Finished");
	}
	
}


