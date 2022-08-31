package main.java.com.campfhir.service.conversion.test;
import java.io.File;


import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.hibernate.HibernateException;

import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Condition;
import org.hl7.fhir.r4.model.Bundle.BundleEntryComponent;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import ca.uhn.fhir.rest.gclient.TokenClientParam;
import main.java.com.campfhir.model.Campfhir;
import main.java.com.campfhir.service.ConditionService;
import main.java.com.campfhir.service.bidirectionalconversion.ConditionBidirectionalConversion;
import main.java.com.campfhir.service.conversion.ConditionConversion;

import main.java.com.campfhir.dao.ConditionDao;
public class ConditionConversionTest {
	
private static ConditionConversion pc;
private static ConditionService patientService;
private static ConditionDao patientDao;
private static ConditionBidirectionalConversion ConditionBidirectionalConversion;


FhirContext ctx = FhirContext.forR4();
IGenericClient client = ctx.newRestfulGenericClient("http://hapi.fhir.org/baseR4");
@Test
	void testBiConversion() throws ParseException, JsonParseException, JsonMappingException, IOException, HibernateException, FHIRException, ParserConfigurationException, SAXException 
	{

		File directory = new File("config.json");
		ObjectMapper mapper = new ObjectMapper();
	    Campfhir cf = mapper.readValue(new File(directory.getAbsolutePath()), Campfhir.class);
	
		int p = Integer.parseInt(cf.getPartition());
	
//		 if(cf.getResource().equals("Condition"))
//		{
//		
		 @SuppressWarnings("deprecation")
		Bundle bundle = (Bundle) client.search().forResource(Condition.class)
				 .where(new TokenClientParam("_id").exactly().code("1992366"))
			//	 .where(new TokenClientParam("active").exactly().code("true"))
				 .prettyPrint()
			//	 .limitTo(100)
				 .execute();
		ConditionBidirectionalConversion pbc = new ConditionBidirectionalConversion();
		List<main.java.com.campfhir.model.Condition> patList = new ArrayList<main.java.com.campfhir.model.Condition>();
		System.out.println(ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(bundle));
		for (BundleEntryComponent bec :  bundle.getEntry()) 
		{ 
		    Condition pat = (Condition) bec.getResource();
		    main.java.com.campfhir.model.Condition pathibernate =  pbc.Conditions(pat);
		    patList.add(pathibernate);
		}
		
		new ConditionService().persist(patList, cf);
			     
	//	}
		System.out.println("Finished");
		
		//fail("Not yet implemented");
	}

	@Test
	void testConversion() throws ParseException, JsonParseException, JsonMappingException, IOException, HibernateException, FHIRException, ParserConfigurationException, SAXException 
	{
	
		File directory = new File("config.json"); 
		ObjectMapper mapper = new ObjectMapper();
	    Campfhir cf = mapper.readValue(new File(directory.getAbsolutePath()), Campfhir.class);
	
		int p = Integer.parseInt(cf.getPartition());
		new ConditionService().findAll(p, cf);
		

		
			
	}
}




