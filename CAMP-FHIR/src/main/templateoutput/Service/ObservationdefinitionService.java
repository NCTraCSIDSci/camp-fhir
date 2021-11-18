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
import main.java.com.campfhir.dao.ObservationdefinitionDao;
import main.java.com.campfhir.service.conversion.ObservationdefinitionConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Observationdefinition.
 * @see .Observationdefinition
 * @author Paul Kovach
 */

public class ObservationdefinitionService {

	private static ObservationdefinitionDao ObservationdefinitionDao;
	private static ObservationdefinitionConversion ObservationdefinitionConversion;

	public ObservationdefinitionService() 
	{
		ObservationdefinitionDao = new ObservationdefinitionDao();
		ObservationdefinitionConversion = new ObservationdefinitionConversion();
	}

	public void persist(main.java.com.campfhir.model.Observationdefinition entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ObservationdefinitionDao.openCurrentSessionwithTransaction();
		 ObservationdefinitionDao.persist(entity);
		 ObservationdefinitionDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Observationdefinition entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ObservationdefinitionDao.openCurrentSessionwithTransaction();
		 ObservationdefinitionDao.update(entity);
		 ObservationdefinitionDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Observationdefinition findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ObservationdefinitionDao.openCurrentSession();
		main.java.com.campfhir.model.Observationdefinition resource = ObservationdefinitionDao.findById(id);
		ObservationdefinitionDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Observationdefinition> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ObservationdefinitionDao.openCurrentSession();
		List<main.java.com.campfhir.model.Observationdefinition> resource =  ObservationdefinitionDao.findByPatientId(id);
		ObservationdefinitionDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ObservationdefinitionDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Observationdefinition resource =  ObservationdefinitionDao.findById(id);
		ObservationdefinitionDao.delete(resource);
		ObservationdefinitionDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  ObservationdefinitionDao.openCurrentSession();
		ScrollableResults resources =  ObservationdefinitionDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Observationdefinition.html")  			   
			   .setResource(ObservationdefinitionConversion.Observationdefinitions((main.java.com.campfhir.model.Observationdefinition) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  ObservationdefinitionDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Observationdefinition> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  ObservationdefinitionDao.findAll();
		List<main.java.com.campfhir.model.Observationdefinition> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Observationdefinition) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 ObservationdefinitionDao.openCurrentSessionwithTransaction();
		 ObservationdefinitionDao.deleteAll();
		 ObservationdefinitionDao.closeCurrentSessionwithTransaction();
	}

	public ObservationdefinitionDao  ObservationdefinitionDao() 
	{
		return  ObservationdefinitionDao;
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

