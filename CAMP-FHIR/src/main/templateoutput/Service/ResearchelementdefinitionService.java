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
import main.java.com.campfhir.dao.ResearchelementdefinitionDao;
import main.java.com.campfhir.service.conversion.ResearchelementdefinitionConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Researchelementdefinition.
 * @see .Researchelementdefinition
 * @author Paul Kovach
 */

public class ResearchelementdefinitionService {

	private static ResearchelementdefinitionDao ResearchelementdefinitionDao;
	private static ResearchelementdefinitionConversion ResearchelementdefinitionConversion;

	public ResearchelementdefinitionService() 
	{
		ResearchelementdefinitionDao = new ResearchelementdefinitionDao();
		ResearchelementdefinitionConversion = new ResearchelementdefinitionConversion();
	}

	public void persist(main.java.com.campfhir.model.Researchelementdefinition entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ResearchelementdefinitionDao.openCurrentSessionwithTransaction();
		 ResearchelementdefinitionDao.persist(entity);
		 ResearchelementdefinitionDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Researchelementdefinition entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ResearchelementdefinitionDao.openCurrentSessionwithTransaction();
		 ResearchelementdefinitionDao.update(entity);
		 ResearchelementdefinitionDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Researchelementdefinition findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ResearchelementdefinitionDao.openCurrentSession();
		main.java.com.campfhir.model.Researchelementdefinition resource = ResearchelementdefinitionDao.findById(id);
		ResearchelementdefinitionDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Researchelementdefinition> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ResearchelementdefinitionDao.openCurrentSession();
		List<main.java.com.campfhir.model.Researchelementdefinition> resource =  ResearchelementdefinitionDao.findByPatientId(id);
		ResearchelementdefinitionDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ResearchelementdefinitionDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Researchelementdefinition resource =  ResearchelementdefinitionDao.findById(id);
		ResearchelementdefinitionDao.delete(resource);
		ResearchelementdefinitionDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  ResearchelementdefinitionDao.openCurrentSession();
		ScrollableResults resources =  ResearchelementdefinitionDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Researchelementdefinition.html")  			   
			   .setResource(ResearchelementdefinitionConversion.Researchelementdefinitions((main.java.com.campfhir.model.Researchelementdefinition) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  ResearchelementdefinitionDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Researchelementdefinition> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  ResearchelementdefinitionDao.findAll();
		List<main.java.com.campfhir.model.Researchelementdefinition> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Researchelementdefinition) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 ResearchelementdefinitionDao.openCurrentSessionwithTransaction();
		 ResearchelementdefinitionDao.deleteAll();
		 ResearchelementdefinitionDao.closeCurrentSessionwithTransaction();
	}

	public ResearchelementdefinitionDao  ResearchelementdefinitionDao() 
	{
		return  ResearchelementdefinitionDao;
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

