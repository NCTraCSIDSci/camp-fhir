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
import main.java.com.campfhir.dao.StructuredefinitionDao;
import main.java.com.campfhir.service.conversion.StructuredefinitionConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Structuredefinition.
 * @see .Structuredefinition
 * @author Paul Kovach
 */

public class StructuredefinitionService {

	private static StructuredefinitionDao StructuredefinitionDao;
	private static StructuredefinitionConversion StructuredefinitionConversion;

	public StructuredefinitionService() 
	{
		StructuredefinitionDao = new StructuredefinitionDao();
		StructuredefinitionConversion = new StructuredefinitionConversion();
	}

	public void persist(main.java.com.campfhir.model.Structuredefinition entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 StructuredefinitionDao.openCurrentSessionwithTransaction();
		 StructuredefinitionDao.persist(entity);
		 StructuredefinitionDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Structuredefinition entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 StructuredefinitionDao.openCurrentSessionwithTransaction();
		 StructuredefinitionDao.update(entity);
		 StructuredefinitionDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Structuredefinition findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		StructuredefinitionDao.openCurrentSession();
		main.java.com.campfhir.model.Structuredefinition resource = StructuredefinitionDao.findById(id);
		StructuredefinitionDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Structuredefinition> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		StructuredefinitionDao.openCurrentSession();
		List<main.java.com.campfhir.model.Structuredefinition> resource =  StructuredefinitionDao.findByPatientId(id);
		StructuredefinitionDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		StructuredefinitionDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Structuredefinition resource =  StructuredefinitionDao.findById(id);
		StructuredefinitionDao.delete(resource);
		StructuredefinitionDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  StructuredefinitionDao.openCurrentSession();
		ScrollableResults resources =  StructuredefinitionDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Structuredefinition.html")  			   
			   .setResource(StructuredefinitionConversion.Structuredefinitions((main.java.com.campfhir.model.Structuredefinition) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  StructuredefinitionDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Structuredefinition> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  StructuredefinitionDao.findAll();
		List<main.java.com.campfhir.model.Structuredefinition> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Structuredefinition) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 StructuredefinitionDao.openCurrentSessionwithTransaction();
		 StructuredefinitionDao.deleteAll();
		 StructuredefinitionDao.closeCurrentSessionwithTransaction();
	}

	public StructuredefinitionDao  StructuredefinitionDao() 
	{
		return  StructuredefinitionDao;
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

