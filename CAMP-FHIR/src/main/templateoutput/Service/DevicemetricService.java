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
import main.java.com.campfhir.dao.DevicemetricDao;
import main.java.com.campfhir.service.conversion.DevicemetricConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Devicemetric.
 * @see .Devicemetric
 * @author Paul Kovach
 */

public class DevicemetricService {

	private static DevicemetricDao DevicemetricDao;
	private static DevicemetricConversion DevicemetricConversion;

	public DevicemetricService() 
	{
		DevicemetricDao = new DevicemetricDao();
		DevicemetricConversion = new DevicemetricConversion();
	}

	public void persist(main.java.com.campfhir.model.Devicemetric entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 DevicemetricDao.openCurrentSessionwithTransaction();
		 DevicemetricDao.persist(entity);
		 DevicemetricDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Devicemetric entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 DevicemetricDao.openCurrentSessionwithTransaction();
		 DevicemetricDao.update(entity);
		 DevicemetricDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Devicemetric findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		DevicemetricDao.openCurrentSession();
		main.java.com.campfhir.model.Devicemetric resource = DevicemetricDao.findById(id);
		DevicemetricDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Devicemetric> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		DevicemetricDao.openCurrentSession();
		List<main.java.com.campfhir.model.Devicemetric> resource =  DevicemetricDao.findByPatientId(id);
		DevicemetricDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		DevicemetricDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Devicemetric resource =  DevicemetricDao.findById(id);
		DevicemetricDao.delete(resource);
		DevicemetricDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  DevicemetricDao.openCurrentSession();
		ScrollableResults resources =  DevicemetricDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Devicemetric.html")  			   
			   .setResource(DevicemetricConversion.Devicemetrics((main.java.com.campfhir.model.Devicemetric) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  DevicemetricDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Devicemetric> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  DevicemetricDao.findAll();
		List<main.java.com.campfhir.model.Devicemetric> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Devicemetric) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 DevicemetricDao.openCurrentSessionwithTransaction();
		 DevicemetricDao.deleteAll();
		 DevicemetricDao.closeCurrentSessionwithTransaction();
	}

	public DevicemetricDao  DevicemetricDao() 
	{
		return  DevicemetricDao;
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

