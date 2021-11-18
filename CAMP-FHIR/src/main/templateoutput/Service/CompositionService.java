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
import main.java.com.campfhir.dao.CompositionDao;
import main.java.com.campfhir.service.conversion.CompositionConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Composition.
 * @see .Composition
 * @author Paul Kovach
 */

public class CompositionService {

	private static CompositionDao CompositionDao;
	private static CompositionConversion CompositionConversion;

	public CompositionService() 
	{
		CompositionDao = new CompositionDao();
		CompositionConversion = new CompositionConversion();
	}

	public void persist(main.java.com.campfhir.model.Composition entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 CompositionDao.openCurrentSessionwithTransaction();
		 CompositionDao.persist(entity);
		 CompositionDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Composition entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 CompositionDao.openCurrentSessionwithTransaction();
		 CompositionDao.update(entity);
		 CompositionDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Composition findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		CompositionDao.openCurrentSession();
		main.java.com.campfhir.model.Composition resource = CompositionDao.findById(id);
		CompositionDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Composition> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		CompositionDao.openCurrentSession();
		List<main.java.com.campfhir.model.Composition> resource =  CompositionDao.findByPatientId(id);
		CompositionDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		CompositionDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Composition resource =  CompositionDao.findById(id);
		CompositionDao.delete(resource);
		CompositionDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  CompositionDao.openCurrentSession();
		ScrollableResults resources =  CompositionDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Composition.html")  			   
			   .setResource(CompositionConversion.Compositions((main.java.com.campfhir.model.Composition) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  CompositionDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Composition> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  CompositionDao.findAll();
		List<main.java.com.campfhir.model.Composition> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Composition) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 CompositionDao.openCurrentSessionwithTransaction();
		 CompositionDao.deleteAll();
		 CompositionDao.closeCurrentSessionwithTransaction();
	}

	public CompositionDao  CompositionDao() 
	{
		return  CompositionDao;
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

