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
import main.java.com.campfhir.dao.DeviceusestatementDao;
import main.java.com.campfhir.service.conversion.DeviceusestatementConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Deviceusestatement.
 * @see .Deviceusestatement
 * @author Paul Kovach
 */

public class DeviceusestatementService {

	private static DeviceusestatementDao DeviceusestatementDao;
	private static DeviceusestatementConversion DeviceusestatementConversion;

	public DeviceusestatementService() 
	{
		DeviceusestatementDao = new DeviceusestatementDao();
		DeviceusestatementConversion = new DeviceusestatementConversion();
	}

	public void persist(main.java.com.campfhir.model.Deviceusestatement entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 DeviceusestatementDao.openCurrentSessionwithTransaction();
		 DeviceusestatementDao.persist(entity);
		 DeviceusestatementDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Deviceusestatement entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 DeviceusestatementDao.openCurrentSessionwithTransaction();
		 DeviceusestatementDao.update(entity);
		 DeviceusestatementDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Deviceusestatement findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		DeviceusestatementDao.openCurrentSession();
		main.java.com.campfhir.model.Deviceusestatement resource = DeviceusestatementDao.findById(id);
		DeviceusestatementDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Deviceusestatement> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		DeviceusestatementDao.openCurrentSession();
		List<main.java.com.campfhir.model.Deviceusestatement> resource =  DeviceusestatementDao.findByPatientId(id);
		DeviceusestatementDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		DeviceusestatementDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Deviceusestatement resource =  DeviceusestatementDao.findById(id);
		DeviceusestatementDao.delete(resource);
		DeviceusestatementDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  DeviceusestatementDao.openCurrentSession();
		ScrollableResults resources =  DeviceusestatementDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Deviceusestatement.html")  			   
			   .setResource(DeviceusestatementConversion.Deviceusestatements((main.java.com.campfhir.model.Deviceusestatement) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  DeviceusestatementDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Deviceusestatement> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  DeviceusestatementDao.findAll();
		List<main.java.com.campfhir.model.Deviceusestatement> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Deviceusestatement) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 DeviceusestatementDao.openCurrentSessionwithTransaction();
		 DeviceusestatementDao.deleteAll();
		 DeviceusestatementDao.closeCurrentSessionwithTransaction();
	}

	public DeviceusestatementDao  DeviceusestatementDao() 
	{
		return  DeviceusestatementDao;
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

