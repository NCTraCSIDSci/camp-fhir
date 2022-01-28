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
import main.java.com.campfhir.dao.LocationDao;
import main.java.com.campfhir.service.conversion.LocationConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Location.
 * @see .Location
 * @author Paul Kovach
 */

public class LocationService {

	private static LocationDao LocationDao;
	private static LocationConversion LocationConversion;

	public LocationService() 
	{
		LocationDao = new LocationDao();
		LocationConversion = new LocationConversion();
	}

	public void persist(main.java.com.campfhir.model.Location entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 LocationDao.openCurrentSessionwithTransaction();
		 LocationDao.persist(entity);
		 LocationDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Location entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 LocationDao.openCurrentSessionwithTransaction();
		 LocationDao.update(entity);
		 LocationDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Location findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		LocationDao.openCurrentSession();
		main.java.com.campfhir.model.Location resource = LocationDao.findById(id);
		LocationDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Location> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		LocationDao.openCurrentSession();
		List<main.java.com.campfhir.model.Location> resource =  LocationDao.findByPatientId(id);
		LocationDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		LocationDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Location resource =  LocationDao.findById(id);
		LocationDao.delete(resource);
		LocationDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  LocationDao.openCurrentSession();
		ScrollableResults resources =  LocationDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Location.html")  			   
			   .setResource(LocationConversion.Locations((main.java.com.campfhir.model.Location) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  LocationDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Location> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  LocationDao.findAll();
		List<main.java.com.campfhir.model.Location> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Location) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 LocationDao.openCurrentSessionwithTransaction();
		 LocationDao.deleteAll();
		 LocationDao.closeCurrentSessionwithTransaction();
	}

	public LocationDao  LocationDao() 
	{
		return  LocationDao;
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

