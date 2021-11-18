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
import main.java.com.campfhir.dao.ScheduleDao;
import main.java.com.campfhir.service.conversion.ScheduleConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Schedule.
 * @see .Schedule
 * @author Paul Kovach
 */

public class ScheduleService {

	private static ScheduleDao ScheduleDao;
	private static ScheduleConversion ScheduleConversion;

	public ScheduleService() 
	{
		ScheduleDao = new ScheduleDao();
		ScheduleConversion = new ScheduleConversion();
	}

	public void persist(main.java.com.campfhir.model.Schedule entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ScheduleDao.openCurrentSessionwithTransaction();
		 ScheduleDao.persist(entity);
		 ScheduleDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Schedule entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ScheduleDao.openCurrentSessionwithTransaction();
		 ScheduleDao.update(entity);
		 ScheduleDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Schedule findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ScheduleDao.openCurrentSession();
		main.java.com.campfhir.model.Schedule resource = ScheduleDao.findById(id);
		ScheduleDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Schedule> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ScheduleDao.openCurrentSession();
		List<main.java.com.campfhir.model.Schedule> resource =  ScheduleDao.findByPatientId(id);
		ScheduleDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ScheduleDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Schedule resource =  ScheduleDao.findById(id);
		ScheduleDao.delete(resource);
		ScheduleDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  ScheduleDao.openCurrentSession();
		ScrollableResults resources =  ScheduleDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Schedule.html")  			   
			   .setResource(ScheduleConversion.Schedules((main.java.com.campfhir.model.Schedule) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  ScheduleDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Schedule> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  ScheduleDao.findAll();
		List<main.java.com.campfhir.model.Schedule> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Schedule) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 ScheduleDao.openCurrentSessionwithTransaction();
		 ScheduleDao.deleteAll();
		 ScheduleDao.closeCurrentSessionwithTransaction();
	}

	public ScheduleDao  ScheduleDao() 
	{
		return  ScheduleDao;
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

