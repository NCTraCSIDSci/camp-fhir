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
import main.java.com.campfhir.dao.MediaDao;
import main.java.com.campfhir.service.conversion.MediaConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Media.
 * @see .Media
 * @author Paul Kovach
 */

public class MediaService {

	private static MediaDao MediaDao;
	private static MediaConversion MediaConversion;

	public MediaService() 
	{
		MediaDao = new MediaDao();
		MediaConversion = new MediaConversion();
	}

	public void persist(main.java.com.campfhir.model.Media entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MediaDao.openCurrentSessionwithTransaction();
		 MediaDao.persist(entity);
		 MediaDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Media entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MediaDao.openCurrentSessionwithTransaction();
		 MediaDao.update(entity);
		 MediaDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Media findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MediaDao.openCurrentSession();
		main.java.com.campfhir.model.Media resource = MediaDao.findById(id);
		MediaDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Media> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MediaDao.openCurrentSession();
		List<main.java.com.campfhir.model.Media> resource =  MediaDao.findByPatientId(id);
		MediaDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MediaDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Media resource =  MediaDao.findById(id);
		MediaDao.delete(resource);
		MediaDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  MediaDao.openCurrentSession();
		ScrollableResults resources =  MediaDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Media.html")  			   
			   .setResource(MediaConversion.Medias((main.java.com.campfhir.model.Media) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  MediaDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Media> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  MediaDao.findAll();
		List<main.java.com.campfhir.model.Media> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Media) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 MediaDao.openCurrentSessionwithTransaction();
		 MediaDao.deleteAll();
		 MediaDao.closeCurrentSessionwithTransaction();
	}

	public MediaDao  MediaDao() 
	{
		return  MediaDao;
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

