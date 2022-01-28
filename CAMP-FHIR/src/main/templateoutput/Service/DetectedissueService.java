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
import main.java.com.campfhir.dao.DetectedissueDao;
import main.java.com.campfhir.service.conversion.DetectedissueConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Detectedissue.
 * @see .Detectedissue
 * @author Paul Kovach
 */

public class DetectedissueService {

	private static DetectedissueDao DetectedissueDao;
	private static DetectedissueConversion DetectedissueConversion;

	public DetectedissueService() 
	{
		DetectedissueDao = new DetectedissueDao();
		DetectedissueConversion = new DetectedissueConversion();
	}

	public void persist(main.java.com.campfhir.model.Detectedissue entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 DetectedissueDao.openCurrentSessionwithTransaction();
		 DetectedissueDao.persist(entity);
		 DetectedissueDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Detectedissue entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 DetectedissueDao.openCurrentSessionwithTransaction();
		 DetectedissueDao.update(entity);
		 DetectedissueDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Detectedissue findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		DetectedissueDao.openCurrentSession();
		main.java.com.campfhir.model.Detectedissue resource = DetectedissueDao.findById(id);
		DetectedissueDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Detectedissue> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		DetectedissueDao.openCurrentSession();
		List<main.java.com.campfhir.model.Detectedissue> resource =  DetectedissueDao.findByPatientId(id);
		DetectedissueDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		DetectedissueDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Detectedissue resource =  DetectedissueDao.findById(id);
		DetectedissueDao.delete(resource);
		DetectedissueDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  DetectedissueDao.openCurrentSession();
		ScrollableResults resources =  DetectedissueDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Detectedissue.html")  			   
			   .setResource(DetectedissueConversion.Detectedissues((main.java.com.campfhir.model.Detectedissue) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  DetectedissueDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Detectedissue> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  DetectedissueDao.findAll();
		List<main.java.com.campfhir.model.Detectedissue> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Detectedissue) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 DetectedissueDao.openCurrentSessionwithTransaction();
		 DetectedissueDao.deleteAll();
		 DetectedissueDao.closeCurrentSessionwithTransaction();
	}

	public DetectedissueDao  DetectedissueDao() 
	{
		return  DetectedissueDao;
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

