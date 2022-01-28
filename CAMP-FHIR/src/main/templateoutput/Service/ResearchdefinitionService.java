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
import main.java.com.campfhir.dao.ResearchdefinitionDao;
import main.java.com.campfhir.service.conversion.ResearchdefinitionConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Researchdefinition.
 * @see .Researchdefinition
 * @author Paul Kovach
 */

public class ResearchdefinitionService {

	private static ResearchdefinitionDao ResearchdefinitionDao;
	private static ResearchdefinitionConversion ResearchdefinitionConversion;

	public ResearchdefinitionService() 
	{
		ResearchdefinitionDao = new ResearchdefinitionDao();
		ResearchdefinitionConversion = new ResearchdefinitionConversion();
	}

	public void persist(main.java.com.campfhir.model.Researchdefinition entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ResearchdefinitionDao.openCurrentSessionwithTransaction();
		 ResearchdefinitionDao.persist(entity);
		 ResearchdefinitionDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Researchdefinition entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ResearchdefinitionDao.openCurrentSessionwithTransaction();
		 ResearchdefinitionDao.update(entity);
		 ResearchdefinitionDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Researchdefinition findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ResearchdefinitionDao.openCurrentSession();
		main.java.com.campfhir.model.Researchdefinition resource = ResearchdefinitionDao.findById(id);
		ResearchdefinitionDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Researchdefinition> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ResearchdefinitionDao.openCurrentSession();
		List<main.java.com.campfhir.model.Researchdefinition> resource =  ResearchdefinitionDao.findByPatientId(id);
		ResearchdefinitionDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ResearchdefinitionDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Researchdefinition resource =  ResearchdefinitionDao.findById(id);
		ResearchdefinitionDao.delete(resource);
		ResearchdefinitionDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  ResearchdefinitionDao.openCurrentSession();
		ScrollableResults resources =  ResearchdefinitionDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Researchdefinition.html")  			   
			   .setResource(ResearchdefinitionConversion.Researchdefinitions((main.java.com.campfhir.model.Researchdefinition) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  ResearchdefinitionDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Researchdefinition> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  ResearchdefinitionDao.findAll();
		List<main.java.com.campfhir.model.Researchdefinition> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Researchdefinition) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 ResearchdefinitionDao.openCurrentSessionwithTransaction();
		 ResearchdefinitionDao.deleteAll();
		 ResearchdefinitionDao.closeCurrentSessionwithTransaction();
	}

	public ResearchdefinitionDao  ResearchdefinitionDao() 
	{
		return  ResearchdefinitionDao;
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

