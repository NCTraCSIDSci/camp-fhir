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
import main.java.com.campfhir.dao.AuditeventDao;
import main.java.com.campfhir.service.conversion.AuditeventConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Auditevent.
 * @see .Auditevent
 * @author Paul Kovach
 */

public class AuditeventService {

	private static AuditeventDao AuditeventDao;
	private static AuditeventConversion AuditeventConversion;

	public AuditeventService() 
	{
		AuditeventDao = new AuditeventDao();
		AuditeventConversion = new AuditeventConversion();
	}

	public void persist(main.java.com.campfhir.model.Auditevent entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 AuditeventDao.openCurrentSessionwithTransaction();
		 AuditeventDao.persist(entity);
		 AuditeventDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Auditevent entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 AuditeventDao.openCurrentSessionwithTransaction();
		 AuditeventDao.update(entity);
		 AuditeventDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Auditevent findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		AuditeventDao.openCurrentSession();
		main.java.com.campfhir.model.Auditevent resource = AuditeventDao.findById(id);
		AuditeventDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Auditevent> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		AuditeventDao.openCurrentSession();
		List<main.java.com.campfhir.model.Auditevent> resource =  AuditeventDao.findByPatientId(id);
		AuditeventDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		AuditeventDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Auditevent resource =  AuditeventDao.findById(id);
		AuditeventDao.delete(resource);
		AuditeventDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  AuditeventDao.openCurrentSession();
		ScrollableResults resources =  AuditeventDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Auditevent.html")  			   
			   .setResource(AuditeventConversion.Auditevents((main.java.com.campfhir.model.Auditevent) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  AuditeventDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Auditevent> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  AuditeventDao.findAll();
		List<main.java.com.campfhir.model.Auditevent> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Auditevent) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 AuditeventDao.openCurrentSessionwithTransaction();
		 AuditeventDao.deleteAll();
		 AuditeventDao.closeCurrentSessionwithTransaction();
	}

	public AuditeventDao  AuditeventDao() 
	{
		return  AuditeventDao;
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

