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
import main.java.com.campfhir.dao.PlandefinitionDao;
import main.java.com.campfhir.service.conversion.PlandefinitionConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Plandefinition.
 * @see .Plandefinition
 * @author Paul Kovach
 */

public class PlandefinitionService {

	private static PlandefinitionDao PlandefinitionDao;
	private static PlandefinitionConversion PlandefinitionConversion;

	public PlandefinitionService() 
	{
		PlandefinitionDao = new PlandefinitionDao();
		PlandefinitionConversion = new PlandefinitionConversion();
	}

	public void persist(main.java.com.campfhir.model.Plandefinition entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 PlandefinitionDao.openCurrentSessionwithTransaction();
		 PlandefinitionDao.persist(entity);
		 PlandefinitionDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Plandefinition entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 PlandefinitionDao.openCurrentSessionwithTransaction();
		 PlandefinitionDao.update(entity);
		 PlandefinitionDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Plandefinition findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		PlandefinitionDao.openCurrentSession();
		main.java.com.campfhir.model.Plandefinition resource = PlandefinitionDao.findById(id);
		PlandefinitionDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Plandefinition> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		PlandefinitionDao.openCurrentSession();
		List<main.java.com.campfhir.model.Plandefinition> resource =  PlandefinitionDao.findByPatientId(id);
		PlandefinitionDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		PlandefinitionDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Plandefinition resource =  PlandefinitionDao.findById(id);
		PlandefinitionDao.delete(resource);
		PlandefinitionDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  PlandefinitionDao.openCurrentSession();
		ScrollableResults resources =  PlandefinitionDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Plandefinition.html")  			   
			   .setResource(PlandefinitionConversion.Plandefinitions((main.java.com.campfhir.model.Plandefinition) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  PlandefinitionDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Plandefinition> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  PlandefinitionDao.findAll();
		List<main.java.com.campfhir.model.Plandefinition> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Plandefinition) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 PlandefinitionDao.openCurrentSessionwithTransaction();
		 PlandefinitionDao.deleteAll();
		 PlandefinitionDao.closeCurrentSessionwithTransaction();
	}

	public PlandefinitionDao  PlandefinitionDao() 
	{
		return  PlandefinitionDao;
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

