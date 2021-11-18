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
import main.java.com.campfhir.dao.CompartmentdefinitionDao;
import main.java.com.campfhir.service.conversion.CompartmentdefinitionConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Compartmentdefinition.
 * @see .Compartmentdefinition
 * @author Paul Kovach
 */

public class CompartmentdefinitionService {

	private static CompartmentdefinitionDao CompartmentdefinitionDao;
	private static CompartmentdefinitionConversion CompartmentdefinitionConversion;

	public CompartmentdefinitionService() 
	{
		CompartmentdefinitionDao = new CompartmentdefinitionDao();
		CompartmentdefinitionConversion = new CompartmentdefinitionConversion();
	}

	public void persist(main.java.com.campfhir.model.Compartmentdefinition entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 CompartmentdefinitionDao.openCurrentSessionwithTransaction();
		 CompartmentdefinitionDao.persist(entity);
		 CompartmentdefinitionDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Compartmentdefinition entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 CompartmentdefinitionDao.openCurrentSessionwithTransaction();
		 CompartmentdefinitionDao.update(entity);
		 CompartmentdefinitionDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Compartmentdefinition findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		CompartmentdefinitionDao.openCurrentSession();
		main.java.com.campfhir.model.Compartmentdefinition resource = CompartmentdefinitionDao.findById(id);
		CompartmentdefinitionDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Compartmentdefinition> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		CompartmentdefinitionDao.openCurrentSession();
		List<main.java.com.campfhir.model.Compartmentdefinition> resource =  CompartmentdefinitionDao.findByPatientId(id);
		CompartmentdefinitionDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		CompartmentdefinitionDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Compartmentdefinition resource =  CompartmentdefinitionDao.findById(id);
		CompartmentdefinitionDao.delete(resource);
		CompartmentdefinitionDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  CompartmentdefinitionDao.openCurrentSession();
		ScrollableResults resources =  CompartmentdefinitionDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Compartmentdefinition.html")  			   
			   .setResource(CompartmentdefinitionConversion.Compartmentdefinitions((main.java.com.campfhir.model.Compartmentdefinition) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  CompartmentdefinitionDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Compartmentdefinition> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  CompartmentdefinitionDao.findAll();
		List<main.java.com.campfhir.model.Compartmentdefinition> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Compartmentdefinition) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 CompartmentdefinitionDao.openCurrentSessionwithTransaction();
		 CompartmentdefinitionDao.deleteAll();
		 CompartmentdefinitionDao.closeCurrentSessionwithTransaction();
	}

	public CompartmentdefinitionDao  CompartmentdefinitionDao() 
	{
		return  CompartmentdefinitionDao;
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

