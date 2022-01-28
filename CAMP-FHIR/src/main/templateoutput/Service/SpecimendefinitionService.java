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
import main.java.com.campfhir.dao.SpecimendefinitionDao;
import main.java.com.campfhir.service.conversion.SpecimendefinitionConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Specimendefinition.
 * @see .Specimendefinition
 * @author Paul Kovach
 */

public class SpecimendefinitionService {

	private static SpecimendefinitionDao SpecimendefinitionDao;
	private static SpecimendefinitionConversion SpecimendefinitionConversion;

	public SpecimendefinitionService() 
	{
		SpecimendefinitionDao = new SpecimendefinitionDao();
		SpecimendefinitionConversion = new SpecimendefinitionConversion();
	}

	public void persist(main.java.com.campfhir.model.Specimendefinition entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 SpecimendefinitionDao.openCurrentSessionwithTransaction();
		 SpecimendefinitionDao.persist(entity);
		 SpecimendefinitionDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Specimendefinition entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 SpecimendefinitionDao.openCurrentSessionwithTransaction();
		 SpecimendefinitionDao.update(entity);
		 SpecimendefinitionDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Specimendefinition findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SpecimendefinitionDao.openCurrentSession();
		main.java.com.campfhir.model.Specimendefinition resource = SpecimendefinitionDao.findById(id);
		SpecimendefinitionDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Specimendefinition> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SpecimendefinitionDao.openCurrentSession();
		List<main.java.com.campfhir.model.Specimendefinition> resource =  SpecimendefinitionDao.findByPatientId(id);
		SpecimendefinitionDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SpecimendefinitionDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Specimendefinition resource =  SpecimendefinitionDao.findById(id);
		SpecimendefinitionDao.delete(resource);
		SpecimendefinitionDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  SpecimendefinitionDao.openCurrentSession();
		ScrollableResults resources =  SpecimendefinitionDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Specimendefinition.html")  			   
			   .setResource(SpecimendefinitionConversion.Specimendefinitions((main.java.com.campfhir.model.Specimendefinition) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  SpecimendefinitionDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Specimendefinition> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  SpecimendefinitionDao.findAll();
		List<main.java.com.campfhir.model.Specimendefinition> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Specimendefinition) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 SpecimendefinitionDao.openCurrentSessionwithTransaction();
		 SpecimendefinitionDao.deleteAll();
		 SpecimendefinitionDao.closeCurrentSessionwithTransaction();
	}

	public SpecimendefinitionDao  SpecimendefinitionDao() 
	{
		return  SpecimendefinitionDao;
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

