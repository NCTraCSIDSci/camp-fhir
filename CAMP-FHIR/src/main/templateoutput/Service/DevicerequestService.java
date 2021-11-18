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
import main.java.com.campfhir.dao.DevicerequestDao;
import main.java.com.campfhir.service.conversion.DevicerequestConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Devicerequest.
 * @see .Devicerequest
 * @author Paul Kovach
 */

public class DevicerequestService {

	private static DevicerequestDao DevicerequestDao;
	private static DevicerequestConversion DevicerequestConversion;

	public DevicerequestService() 
	{
		DevicerequestDao = new DevicerequestDao();
		DevicerequestConversion = new DevicerequestConversion();
	}

	public void persist(main.java.com.campfhir.model.Devicerequest entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 DevicerequestDao.openCurrentSessionwithTransaction();
		 DevicerequestDao.persist(entity);
		 DevicerequestDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Devicerequest entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 DevicerequestDao.openCurrentSessionwithTransaction();
		 DevicerequestDao.update(entity);
		 DevicerequestDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Devicerequest findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		DevicerequestDao.openCurrentSession();
		main.java.com.campfhir.model.Devicerequest resource = DevicerequestDao.findById(id);
		DevicerequestDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Devicerequest> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		DevicerequestDao.openCurrentSession();
		List<main.java.com.campfhir.model.Devicerequest> resource =  DevicerequestDao.findByPatientId(id);
		DevicerequestDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		DevicerequestDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Devicerequest resource =  DevicerequestDao.findById(id);
		DevicerequestDao.delete(resource);
		DevicerequestDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  DevicerequestDao.openCurrentSession();
		ScrollableResults resources =  DevicerequestDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Devicerequest.html")  			   
			   .setResource(DevicerequestConversion.Devicerequests((main.java.com.campfhir.model.Devicerequest) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  DevicerequestDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Devicerequest> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  DevicerequestDao.findAll();
		List<main.java.com.campfhir.model.Devicerequest> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Devicerequest) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 DevicerequestDao.openCurrentSessionwithTransaction();
		 DevicerequestDao.deleteAll();
		 DevicerequestDao.closeCurrentSessionwithTransaction();
	}

	public DevicerequestDao  DevicerequestDao() 
	{
		return  DevicerequestDao;
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

