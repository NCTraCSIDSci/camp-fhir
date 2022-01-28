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
import main.java.com.campfhir.dao.ResearchstudyDao;
import main.java.com.campfhir.service.conversion.ResearchstudyConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Researchstudy.
 * @see .Researchstudy
 * @author Paul Kovach
 */

public class ResearchstudyService {

	private static ResearchstudyDao ResearchstudyDao;
	private static ResearchstudyConversion ResearchstudyConversion;

	public ResearchstudyService() 
	{
		ResearchstudyDao = new ResearchstudyDao();
		ResearchstudyConversion = new ResearchstudyConversion();
	}

	public void persist(main.java.com.campfhir.model.Researchstudy entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ResearchstudyDao.openCurrentSessionwithTransaction();
		 ResearchstudyDao.persist(entity);
		 ResearchstudyDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Researchstudy entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ResearchstudyDao.openCurrentSessionwithTransaction();
		 ResearchstudyDao.update(entity);
		 ResearchstudyDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Researchstudy findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ResearchstudyDao.openCurrentSession();
		main.java.com.campfhir.model.Researchstudy resource = ResearchstudyDao.findById(id);
		ResearchstudyDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Researchstudy> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ResearchstudyDao.openCurrentSession();
		List<main.java.com.campfhir.model.Researchstudy> resource =  ResearchstudyDao.findByPatientId(id);
		ResearchstudyDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ResearchstudyDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Researchstudy resource =  ResearchstudyDao.findById(id);
		ResearchstudyDao.delete(resource);
		ResearchstudyDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  ResearchstudyDao.openCurrentSession();
		ScrollableResults resources =  ResearchstudyDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Researchstudy.html")  			   
			   .setResource(ResearchstudyConversion.Researchstudys((main.java.com.campfhir.model.Researchstudy) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  ResearchstudyDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Researchstudy> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  ResearchstudyDao.findAll();
		List<main.java.com.campfhir.model.Researchstudy> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Researchstudy) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 ResearchstudyDao.openCurrentSessionwithTransaction();
		 ResearchstudyDao.deleteAll();
		 ResearchstudyDao.closeCurrentSessionwithTransaction();
	}

	public ResearchstudyDao  ResearchstudyDao() 
	{
		return  ResearchstudyDao;
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

