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
import main.java.com.campfhir.dao.AdverseeventDao;
import main.java.com.campfhir.service.conversion.AdverseeventConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Adverseevent.
 * @see .Adverseevent
 * @author Paul Kovach
 */

public class AdverseeventService {

	private static AdverseeventDao AdverseeventDao;
	private static AdverseeventConversion AdverseeventConversion;

	public AdverseeventService() 
	{
		AdverseeventDao = new AdverseeventDao();
		AdverseeventConversion = new AdverseeventConversion();
	}

	public void persist(main.java.com.campfhir.model.Adverseevent entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 AdverseeventDao.openCurrentSessionwithTransaction();
		 AdverseeventDao.persist(entity);
		 AdverseeventDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Adverseevent entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 AdverseeventDao.openCurrentSessionwithTransaction();
		 AdverseeventDao.update(entity);
		 AdverseeventDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Adverseevent findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		AdverseeventDao.openCurrentSession();
		main.java.com.campfhir.model.Adverseevent resource = AdverseeventDao.findById(id);
		AdverseeventDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Adverseevent> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		AdverseeventDao.openCurrentSession();
		List<main.java.com.campfhir.model.Adverseevent> resource =  AdverseeventDao.findByPatientId(id);
		AdverseeventDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		AdverseeventDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Adverseevent resource =  AdverseeventDao.findById(id);
		AdverseeventDao.delete(resource);
		AdverseeventDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  AdverseeventDao.openCurrentSession();
		ScrollableResults resources =  AdverseeventDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Adverseevent.html")  			   
			   .setResource(AdverseeventConversion.Adverseevents((main.java.com.campfhir.model.Adverseevent) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  AdverseeventDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Adverseevent> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  AdverseeventDao.findAll();
		List<main.java.com.campfhir.model.Adverseevent> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Adverseevent) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 AdverseeventDao.openCurrentSessionwithTransaction();
		 AdverseeventDao.deleteAll();
		 AdverseeventDao.closeCurrentSessionwithTransaction();
	}

	public AdverseeventDao  AdverseeventDao() 
	{
		return  AdverseeventDao;
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

