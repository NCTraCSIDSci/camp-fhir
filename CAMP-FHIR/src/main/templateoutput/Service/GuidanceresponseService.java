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
import main.java.com.campfhir.dao.GuidanceresponseDao;
import main.java.com.campfhir.service.conversion.GuidanceresponseConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Guidanceresponse.
 * @see .Guidanceresponse
 * @author Paul Kovach
 */

public class GuidanceresponseService {

	private static GuidanceresponseDao GuidanceresponseDao;
	private static GuidanceresponseConversion GuidanceresponseConversion;

	public GuidanceresponseService() 
	{
		GuidanceresponseDao = new GuidanceresponseDao();
		GuidanceresponseConversion = new GuidanceresponseConversion();
	}

	public void persist(main.java.com.campfhir.model.Guidanceresponse entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 GuidanceresponseDao.openCurrentSessionwithTransaction();
		 GuidanceresponseDao.persist(entity);
		 GuidanceresponseDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Guidanceresponse entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 GuidanceresponseDao.openCurrentSessionwithTransaction();
		 GuidanceresponseDao.update(entity);
		 GuidanceresponseDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Guidanceresponse findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		GuidanceresponseDao.openCurrentSession();
		main.java.com.campfhir.model.Guidanceresponse resource = GuidanceresponseDao.findById(id);
		GuidanceresponseDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Guidanceresponse> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		GuidanceresponseDao.openCurrentSession();
		List<main.java.com.campfhir.model.Guidanceresponse> resource =  GuidanceresponseDao.findByPatientId(id);
		GuidanceresponseDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		GuidanceresponseDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Guidanceresponse resource =  GuidanceresponseDao.findById(id);
		GuidanceresponseDao.delete(resource);
		GuidanceresponseDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  GuidanceresponseDao.openCurrentSession();
		ScrollableResults resources =  GuidanceresponseDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Guidanceresponse.html")  			   
			   .setResource(GuidanceresponseConversion.Guidanceresponses((main.java.com.campfhir.model.Guidanceresponse) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  GuidanceresponseDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Guidanceresponse> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  GuidanceresponseDao.findAll();
		List<main.java.com.campfhir.model.Guidanceresponse> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Guidanceresponse) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 GuidanceresponseDao.openCurrentSessionwithTransaction();
		 GuidanceresponseDao.deleteAll();
		 GuidanceresponseDao.closeCurrentSessionwithTransaction();
	}

	public GuidanceresponseDao  GuidanceresponseDao() 
	{
		return  GuidanceresponseDao;
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

