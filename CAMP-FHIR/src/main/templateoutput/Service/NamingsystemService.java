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
import main.java.com.campfhir.dao.NamingsystemDao;
import main.java.com.campfhir.service.conversion.NamingsystemConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Namingsystem.
 * @see .Namingsystem
 * @author Paul Kovach
 */

public class NamingsystemService {

	private static NamingsystemDao NamingsystemDao;
	private static NamingsystemConversion NamingsystemConversion;

	public NamingsystemService() 
	{
		NamingsystemDao = new NamingsystemDao();
		NamingsystemConversion = new NamingsystemConversion();
	}

	public void persist(main.java.com.campfhir.model.Namingsystem entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 NamingsystemDao.openCurrentSessionwithTransaction();
		 NamingsystemDao.persist(entity);
		 NamingsystemDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Namingsystem entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 NamingsystemDao.openCurrentSessionwithTransaction();
		 NamingsystemDao.update(entity);
		 NamingsystemDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Namingsystem findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		NamingsystemDao.openCurrentSession();
		main.java.com.campfhir.model.Namingsystem resource = NamingsystemDao.findById(id);
		NamingsystemDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Namingsystem> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		NamingsystemDao.openCurrentSession();
		List<main.java.com.campfhir.model.Namingsystem> resource =  NamingsystemDao.findByPatientId(id);
		NamingsystemDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		NamingsystemDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Namingsystem resource =  NamingsystemDao.findById(id);
		NamingsystemDao.delete(resource);
		NamingsystemDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  NamingsystemDao.openCurrentSession();
		ScrollableResults resources =  NamingsystemDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Namingsystem.html")  			   
			   .setResource(NamingsystemConversion.Namingsystems((main.java.com.campfhir.model.Namingsystem) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  NamingsystemDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Namingsystem> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  NamingsystemDao.findAll();
		List<main.java.com.campfhir.model.Namingsystem> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Namingsystem) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 NamingsystemDao.openCurrentSessionwithTransaction();
		 NamingsystemDao.deleteAll();
		 NamingsystemDao.closeCurrentSessionwithTransaction();
	}

	public NamingsystemDao  NamingsystemDao() 
	{
		return  NamingsystemDao;
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

