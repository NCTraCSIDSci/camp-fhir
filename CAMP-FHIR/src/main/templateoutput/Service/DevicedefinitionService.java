//// default package
package main.templateoutput.Service;

// Generated on Nov 18, 2021, 1:48:14 PM 


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
import main.java.com.campfhir.dao.DevicedefinitionDao;
import main.java.com.campfhir.service.conversion.DevicedefinitionConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Devicedefinition.
 * @see .Devicedefinition
 * @author Paul Kovach
 */

public class DevicedefinitionService {

	private static DevicedefinitionDao DevicedefinitionDao;
	private static DevicedefinitionConversion DevicedefinitionConversion;

	public DevicedefinitionService() 
	{
		DevicedefinitionDao = new DevicedefinitionDao();
		DevicedefinitionConversion = new DevicedefinitionConversion();
	}

	public void persist(main.java.com.campfhir.model.Devicedefinition entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 DevicedefinitionDao.openCurrentSessionwithTransaction();
		 DevicedefinitionDao.persist(entity);
		 DevicedefinitionDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Devicedefinition entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 DevicedefinitionDao.openCurrentSessionwithTransaction();
		 DevicedefinitionDao.update(entity);
		 DevicedefinitionDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Devicedefinition findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		DevicedefinitionDao.openCurrentSession();
		main.java.com.campfhir.model.Devicedefinition resource = DevicedefinitionDao.findById(id);
		DevicedefinitionDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Devicedefinition> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		DevicedefinitionDao.openCurrentSession();
		List<main.java.com.campfhir.model.Devicedefinition> resource =  DevicedefinitionDao.findByPatientId(id);
		DevicedefinitionDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		DevicedefinitionDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Devicedefinition resource =  DevicedefinitionDao.findById(id);
		DevicedefinitionDao.delete(resource);
		DevicedefinitionDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  DevicedefinitionDao.openCurrentSession();
		ScrollableResults resources =  DevicedefinitionDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Devicedefinition.html")  			   
			   .setResource(DevicedefinitionConversion.Devicedefinitions((main.java.com.campfhir.model.Devicedefinition) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  DevicedefinitionDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Devicedefinition> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  DevicedefinitionDao.findAll();
		List<main.java.com.campfhir.model.Devicedefinition> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Devicedefinition) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 DevicedefinitionDao.openCurrentSessionwithTransaction();
		 DevicedefinitionDao.deleteAll();
		 DevicedefinitionDao.closeCurrentSessionwithTransaction();
	}

	public DevicedefinitionDao  DevicedefinitionDao() 
	{
		return  DevicedefinitionDao;
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

