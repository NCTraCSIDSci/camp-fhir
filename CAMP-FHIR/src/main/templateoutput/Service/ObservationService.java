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
import main.java.com.campfhir.dao.ObservationDao;
import main.java.com.campfhir.service.conversion.ObservationConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Observation.
 * @see .Observation
 * @author Paul Kovach
 */

public class ObservationService {

	private static ObservationDao ObservationDao;
	private static ObservationConversion ObservationConversion;

	public ObservationService() 
	{
		ObservationDao = new ObservationDao();
		ObservationConversion = new ObservationConversion();
	}

	public void persist(main.java.com.campfhir.model.Observation entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ObservationDao.openCurrentSessionwithTransaction();
		 ObservationDao.persist(entity);
		 ObservationDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Observation entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ObservationDao.openCurrentSessionwithTransaction();
		 ObservationDao.update(entity);
		 ObservationDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Observation findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ObservationDao.openCurrentSession();
		main.java.com.campfhir.model.Observation resource = ObservationDao.findById(id);
		ObservationDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Observation> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ObservationDao.openCurrentSession();
		List<main.java.com.campfhir.model.Observation> resource =  ObservationDao.findByPatientId(id);
		ObservationDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ObservationDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Observation resource =  ObservationDao.findById(id);
		ObservationDao.delete(resource);
		ObservationDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  ObservationDao.openCurrentSession();
		ScrollableResults resources =  ObservationDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Observation.html")  			   
			   .setResource(ObservationConversion.Observations((main.java.com.campfhir.model.Observation) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  ObservationDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Observation> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  ObservationDao.findAll();
		List<main.java.com.campfhir.model.Observation> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Observation) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 ObservationDao.openCurrentSessionwithTransaction();
		 ObservationDao.deleteAll();
		 ObservationDao.closeCurrentSessionwithTransaction();
	}

	public ObservationDao  ObservationDao() 
	{
		return  ObservationDao;
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

