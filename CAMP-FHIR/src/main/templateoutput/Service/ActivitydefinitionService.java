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
import main.java.com.campfhir.dao.ActivitydefinitionDao;
import main.java.com.campfhir.service.conversion.ActivitydefinitionConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Activitydefinition.
 * @see .Activitydefinition
 * @author Paul Kovach
 */

public class ActivitydefinitionService {

	private static ActivitydefinitionDao ActivitydefinitionDao;
	private static ActivitydefinitionConversion ActivitydefinitionConversion;

	public ActivitydefinitionService() 
	{
		ActivitydefinitionDao = new ActivitydefinitionDao();
		ActivitydefinitionConversion = new ActivitydefinitionConversion();
	}

	public void persist(main.java.com.campfhir.model.Activitydefinition entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ActivitydefinitionDao.openCurrentSessionwithTransaction();
		 ActivitydefinitionDao.persist(entity);
		 ActivitydefinitionDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Activitydefinition entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ActivitydefinitionDao.openCurrentSessionwithTransaction();
		 ActivitydefinitionDao.update(entity);
		 ActivitydefinitionDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Activitydefinition findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ActivitydefinitionDao.openCurrentSession();
		main.java.com.campfhir.model.Activitydefinition resource = ActivitydefinitionDao.findById(id);
		ActivitydefinitionDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Activitydefinition> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ActivitydefinitionDao.openCurrentSession();
		List<main.java.com.campfhir.model.Activitydefinition> resource =  ActivitydefinitionDao.findByPatientId(id);
		ActivitydefinitionDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ActivitydefinitionDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Activitydefinition resource =  ActivitydefinitionDao.findById(id);
		ActivitydefinitionDao.delete(resource);
		ActivitydefinitionDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  ActivitydefinitionDao.openCurrentSession();
		ScrollableResults resources =  ActivitydefinitionDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Activitydefinition.html")  			   
			   .setResource(ActivitydefinitionConversion.Activitydefinitions((main.java.com.campfhir.model.Activitydefinition) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  ActivitydefinitionDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Activitydefinition> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  ActivitydefinitionDao.findAll();
		List<main.java.com.campfhir.model.Activitydefinition> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Activitydefinition) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 ActivitydefinitionDao.openCurrentSessionwithTransaction();
		 ActivitydefinitionDao.deleteAll();
		 ActivitydefinitionDao.closeCurrentSessionwithTransaction();
	}

	public ActivitydefinitionDao  ActivitydefinitionDao() 
	{
		return  ActivitydefinitionDao;
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

