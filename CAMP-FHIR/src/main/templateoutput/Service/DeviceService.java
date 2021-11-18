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
import main.java.com.campfhir.dao.DeviceDao;
import main.java.com.campfhir.service.conversion.DeviceConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Device.
 * @see .Device
 * @author Paul Kovach
 */

public class DeviceService {

	private static DeviceDao DeviceDao;
	private static DeviceConversion DeviceConversion;

	public DeviceService() 
	{
		DeviceDao = new DeviceDao();
		DeviceConversion = new DeviceConversion();
	}

	public void persist(main.java.com.campfhir.model.Device entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 DeviceDao.openCurrentSessionwithTransaction();
		 DeviceDao.persist(entity);
		 DeviceDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Device entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 DeviceDao.openCurrentSessionwithTransaction();
		 DeviceDao.update(entity);
		 DeviceDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Device findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		DeviceDao.openCurrentSession();
		main.java.com.campfhir.model.Device resource = DeviceDao.findById(id);
		DeviceDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Device> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		DeviceDao.openCurrentSession();
		List<main.java.com.campfhir.model.Device> resource =  DeviceDao.findByPatientId(id);
		DeviceDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		DeviceDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Device resource =  DeviceDao.findById(id);
		DeviceDao.delete(resource);
		DeviceDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  DeviceDao.openCurrentSession();
		ScrollableResults resources =  DeviceDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Device.html")  			   
			   .setResource(DeviceConversion.Devices((main.java.com.campfhir.model.Device) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  DeviceDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Device> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  DeviceDao.findAll();
		List<main.java.com.campfhir.model.Device> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Device) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 DeviceDao.openCurrentSessionwithTransaction();
		 DeviceDao.deleteAll();
		 DeviceDao.closeCurrentSessionwithTransaction();
	}

	public DeviceDao  DeviceDao() 
	{
		return  DeviceDao;
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

