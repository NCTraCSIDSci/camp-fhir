//// default package
package main.templateoutput.Service;

// Generated on Jan 28, 2022, 7:59:48 AM 


import ca.uhn.fhir.context.FhirContext;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import main.java.com.campfhir.dao.ExamplescenarioDao;
import main.java.com.campfhir.service.conversion.ExamplescenarioConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Examplescenario.
 * @see .Examplescenario
 * @author Paul Kovach
 */

public class ExamplescenarioService {

	private static ExamplescenarioDao ExamplescenarioDao;
	private static ExamplescenarioConversion ExamplescenarioConversion;

	public ExamplescenarioService() 
	{
		ExamplescenarioDao = new ExamplescenarioDao();
		ExamplescenarioConversion = new ExamplescenarioConversion();
	}

	public void persist(main.java.com.campfhir.model.Examplescenario entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ExamplescenarioDao.openCurrentSessionwithTransaction();
		 ExamplescenarioDao.persist(entity);
		 ExamplescenarioDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Examplescenario entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ExamplescenarioDao.openCurrentSessionwithTransaction();
		 ExamplescenarioDao.update(entity);
		 ExamplescenarioDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Examplescenario findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ExamplescenarioDao.openCurrentSession();
		main.java.com.campfhir.model.Examplescenario resource = ExamplescenarioDao.findById(id);
		ExamplescenarioDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Examplescenario> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ExamplescenarioDao.openCurrentSession();
		List<main.java.com.campfhir.model.Examplescenario> resource =  ExamplescenarioDao.findByPatientId(id);
		ExamplescenarioDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ExamplescenarioDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Examplescenario resource =  ExamplescenarioDao.findById(id);
		ExamplescenarioDao.delete(resource);
		ExamplescenarioDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  ExamplescenarioDao.openCurrentSession();
		ScrollableResults resources =  ExamplescenarioDao.findAll();
		
	     int i = 0;
	     System.out.println("start");
	     Bundle bundle = new Bundle().setType(BundleType.COLLECTION);
	     

	     while ( resources.next() ) 
	     {	
			if ((i % partition) == 0)
			{
				session.clear();
				
		    	writeFile(path, i, bundle);
			    bundle = new Bundle().setType(BundleType.COLLECTION);
			}
			
			i++;
			
			bundle.addEntry()
			   .setFullUrl("https://www.hl7.org/fhir/Examplescenario.html")  			   
			   .setResource(ExamplescenarioConversion.Examplescenarios((main.java.com.campfhir.model.Examplescenario) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  ExamplescenarioDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Examplescenario> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  ExamplescenarioDao.findAll();
		List<main.java.com.campfhir.model.Examplescenario> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Examplescenario) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 ExamplescenarioDao.openCurrentSessionwithTransaction();
		 ExamplescenarioDao.deleteAll();
		 ExamplescenarioDao.closeCurrentSessionwithTransaction();
	}

	public ExamplescenarioDao  ExamplescenarioDao() 
	{
		return  ExamplescenarioDao;
	}
	
	public static void writeFile(String path, int domain, Bundle bundle)
	{			
	    
		
		try 
		{
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path+"/"+domain+".json", true), StandardCharsets.UTF_8));
			
			String file = FhirContext.forR4().newJsonParser().setPrettyPrint(false).encodeResourceToString(bundle);			
			
		    writer.write(file);
		    writer.close();

		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}

	    
	}
}

