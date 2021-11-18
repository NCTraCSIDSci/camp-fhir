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
import main.java.com.campfhir.dao.TerminologycapabilitiesDao;
import main.java.com.campfhir.service.conversion.TerminologycapabilitiesConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Terminologycapabilities.
 * @see .Terminologycapabilities
 * @author Paul Kovach
 */

public class TerminologycapabilitiesService {

	private static TerminologycapabilitiesDao TerminologycapabilitiesDao;
	private static TerminologycapabilitiesConversion TerminologycapabilitiesConversion;

	public TerminologycapabilitiesService() 
	{
		TerminologycapabilitiesDao = new TerminologycapabilitiesDao();
		TerminologycapabilitiesConversion = new TerminologycapabilitiesConversion();
	}

	public void persist(main.java.com.campfhir.model.Terminologycapabilities entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 TerminologycapabilitiesDao.openCurrentSessionwithTransaction();
		 TerminologycapabilitiesDao.persist(entity);
		 TerminologycapabilitiesDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Terminologycapabilities entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 TerminologycapabilitiesDao.openCurrentSessionwithTransaction();
		 TerminologycapabilitiesDao.update(entity);
		 TerminologycapabilitiesDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Terminologycapabilities findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		TerminologycapabilitiesDao.openCurrentSession();
		main.java.com.campfhir.model.Terminologycapabilities resource = TerminologycapabilitiesDao.findById(id);
		TerminologycapabilitiesDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Terminologycapabilities> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		TerminologycapabilitiesDao.openCurrentSession();
		List<main.java.com.campfhir.model.Terminologycapabilities> resource =  TerminologycapabilitiesDao.findByPatientId(id);
		TerminologycapabilitiesDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		TerminologycapabilitiesDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Terminologycapabilities resource =  TerminologycapabilitiesDao.findById(id);
		TerminologycapabilitiesDao.delete(resource);
		TerminologycapabilitiesDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  TerminologycapabilitiesDao.openCurrentSession();
		ScrollableResults resources =  TerminologycapabilitiesDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Terminologycapabilities.html")  			   
			   .setResource(TerminologycapabilitiesConversion.Terminologycapabilitiess((main.java.com.campfhir.model.Terminologycapabilities) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  TerminologycapabilitiesDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Terminologycapabilities> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  TerminologycapabilitiesDao.findAll();
		List<main.java.com.campfhir.model.Terminologycapabilities> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Terminologycapabilities) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 TerminologycapabilitiesDao.openCurrentSessionwithTransaction();
		 TerminologycapabilitiesDao.deleteAll();
		 TerminologycapabilitiesDao.closeCurrentSessionwithTransaction();
	}

	public TerminologycapabilitiesDao  TerminologycapabilitiesDao() 
	{
		return  TerminologycapabilitiesDao;
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

