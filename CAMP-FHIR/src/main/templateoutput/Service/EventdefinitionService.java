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
import main.java.com.campfhir.dao.EventdefinitionDao;
import main.java.com.campfhir.service.conversion.EventdefinitionConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Eventdefinition.
 * @see .Eventdefinition
 * @author Paul Kovach
 */

public class EventdefinitionService {

	private static EventdefinitionDao EventdefinitionDao;
	private static EventdefinitionConversion EventdefinitionConversion;

	public EventdefinitionService() 
	{
		EventdefinitionDao = new EventdefinitionDao();
		EventdefinitionConversion = new EventdefinitionConversion();
	}

	public void persist(main.java.com.campfhir.model.Eventdefinition entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 EventdefinitionDao.openCurrentSessionwithTransaction();
		 EventdefinitionDao.persist(entity);
		 EventdefinitionDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Eventdefinition entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 EventdefinitionDao.openCurrentSessionwithTransaction();
		 EventdefinitionDao.update(entity);
		 EventdefinitionDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Eventdefinition findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		EventdefinitionDao.openCurrentSession();
		main.java.com.campfhir.model.Eventdefinition resource = EventdefinitionDao.findById(id);
		EventdefinitionDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Eventdefinition> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		EventdefinitionDao.openCurrentSession();
		List<main.java.com.campfhir.model.Eventdefinition> resource =  EventdefinitionDao.findByPatientId(id);
		EventdefinitionDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		EventdefinitionDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Eventdefinition resource =  EventdefinitionDao.findById(id);
		EventdefinitionDao.delete(resource);
		EventdefinitionDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  EventdefinitionDao.openCurrentSession();
		ScrollableResults resources =  EventdefinitionDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Eventdefinition.html")  			   
			   .setResource(EventdefinitionConversion.Eventdefinitions((main.java.com.campfhir.model.Eventdefinition) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  EventdefinitionDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Eventdefinition> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  EventdefinitionDao.findAll();
		List<main.java.com.campfhir.model.Eventdefinition> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Eventdefinition) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 EventdefinitionDao.openCurrentSessionwithTransaction();
		 EventdefinitionDao.deleteAll();
		 EventdefinitionDao.closeCurrentSessionwithTransaction();
	}

	public EventdefinitionDao  EventdefinitionDao() 
	{
		return  EventdefinitionDao;
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

