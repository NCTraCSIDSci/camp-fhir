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
import main.java.com.campfhir.dao.ImplementationguideDao;
import main.java.com.campfhir.service.conversion.ImplementationguideConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Implementationguide.
 * @see .Implementationguide
 * @author Paul Kovach
 */

public class ImplementationguideService {

	private static ImplementationguideDao ImplementationguideDao;
	private static ImplementationguideConversion ImplementationguideConversion;

	public ImplementationguideService() 
	{
		ImplementationguideDao = new ImplementationguideDao();
		ImplementationguideConversion = new ImplementationguideConversion();
	}

	public void persist(main.java.com.campfhir.model.Implementationguide entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ImplementationguideDao.openCurrentSessionwithTransaction();
		 ImplementationguideDao.persist(entity);
		 ImplementationguideDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Implementationguide entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ImplementationguideDao.openCurrentSessionwithTransaction();
		 ImplementationguideDao.update(entity);
		 ImplementationguideDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Implementationguide findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ImplementationguideDao.openCurrentSession();
		main.java.com.campfhir.model.Implementationguide resource = ImplementationguideDao.findById(id);
		ImplementationguideDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Implementationguide> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ImplementationguideDao.openCurrentSession();
		List<main.java.com.campfhir.model.Implementationguide> resource =  ImplementationguideDao.findByPatientId(id);
		ImplementationguideDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ImplementationguideDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Implementationguide resource =  ImplementationguideDao.findById(id);
		ImplementationguideDao.delete(resource);
		ImplementationguideDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  ImplementationguideDao.openCurrentSession();
		ScrollableResults resources =  ImplementationguideDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Implementationguide.html")  			   
			   .setResource(ImplementationguideConversion.Implementationguides((main.java.com.campfhir.model.Implementationguide) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  ImplementationguideDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Implementationguide> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  ImplementationguideDao.findAll();
		List<main.java.com.campfhir.model.Implementationguide> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Implementationguide) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 ImplementationguideDao.openCurrentSessionwithTransaction();
		 ImplementationguideDao.deleteAll();
		 ImplementationguideDao.closeCurrentSessionwithTransaction();
	}

	public ImplementationguideDao  ImplementationguideDao() 
	{
		return  ImplementationguideDao;
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

