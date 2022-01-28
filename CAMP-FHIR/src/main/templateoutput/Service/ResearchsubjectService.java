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
import main.java.com.campfhir.dao.ResearchsubjectDao;
import main.java.com.campfhir.service.conversion.ResearchsubjectConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Researchsubject.
 * @see .Researchsubject
 * @author Paul Kovach
 */

public class ResearchsubjectService {

	private static ResearchsubjectDao ResearchsubjectDao;
	private static ResearchsubjectConversion ResearchsubjectConversion;

	public ResearchsubjectService() 
	{
		ResearchsubjectDao = new ResearchsubjectDao();
		ResearchsubjectConversion = new ResearchsubjectConversion();
	}

	public void persist(main.java.com.campfhir.model.Researchsubject entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ResearchsubjectDao.openCurrentSessionwithTransaction();
		 ResearchsubjectDao.persist(entity);
		 ResearchsubjectDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Researchsubject entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ResearchsubjectDao.openCurrentSessionwithTransaction();
		 ResearchsubjectDao.update(entity);
		 ResearchsubjectDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Researchsubject findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ResearchsubjectDao.openCurrentSession();
		main.java.com.campfhir.model.Researchsubject resource = ResearchsubjectDao.findById(id);
		ResearchsubjectDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Researchsubject> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ResearchsubjectDao.openCurrentSession();
		List<main.java.com.campfhir.model.Researchsubject> resource =  ResearchsubjectDao.findByPatientId(id);
		ResearchsubjectDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ResearchsubjectDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Researchsubject resource =  ResearchsubjectDao.findById(id);
		ResearchsubjectDao.delete(resource);
		ResearchsubjectDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  ResearchsubjectDao.openCurrentSession();
		ScrollableResults resources =  ResearchsubjectDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Researchsubject.html")  			   
			   .setResource(ResearchsubjectConversion.Researchsubjects((main.java.com.campfhir.model.Researchsubject) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  ResearchsubjectDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Researchsubject> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  ResearchsubjectDao.findAll();
		List<main.java.com.campfhir.model.Researchsubject> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Researchsubject) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 ResearchsubjectDao.openCurrentSessionwithTransaction();
		 ResearchsubjectDao.deleteAll();
		 ResearchsubjectDao.closeCurrentSessionwithTransaction();
	}

	public ResearchsubjectDao  ResearchsubjectDao() 
	{
		return  ResearchsubjectDao;
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

