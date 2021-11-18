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
import main.java.com.campfhir.dao.EncounterDao;
import main.java.com.campfhir.service.conversion.EncounterConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Encounter.
 * @see .Encounter
 * @author Paul Kovach
 */

public class EncounterService {

	private static EncounterDao EncounterDao;
	private static EncounterConversion EncounterConversion;

	public EncounterService() 
	{
		EncounterDao = new EncounterDao();
		EncounterConversion = new EncounterConversion();
	}

	public void persist(main.java.com.campfhir.model.Encounter entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 EncounterDao.openCurrentSessionwithTransaction();
		 EncounterDao.persist(entity);
		 EncounterDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Encounter entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 EncounterDao.openCurrentSessionwithTransaction();
		 EncounterDao.update(entity);
		 EncounterDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Encounter findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		EncounterDao.openCurrentSession();
		main.java.com.campfhir.model.Encounter resource = EncounterDao.findById(id);
		EncounterDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Encounter> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		EncounterDao.openCurrentSession();
		List<main.java.com.campfhir.model.Encounter> resource =  EncounterDao.findByPatientId(id);
		EncounterDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		EncounterDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Encounter resource =  EncounterDao.findById(id);
		EncounterDao.delete(resource);
		EncounterDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  EncounterDao.openCurrentSession();
		ScrollableResults resources =  EncounterDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Encounter.html")  			   
			   .setResource(EncounterConversion.Encounters((main.java.com.campfhir.model.Encounter) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  EncounterDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Encounter> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  EncounterDao.findAll();
		List<main.java.com.campfhir.model.Encounter> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Encounter) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 EncounterDao.openCurrentSessionwithTransaction();
		 EncounterDao.deleteAll();
		 EncounterDao.closeCurrentSessionwithTransaction();
	}

	public EncounterDao  EncounterDao() 
	{
		return  EncounterDao;
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

