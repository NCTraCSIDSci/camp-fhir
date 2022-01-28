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
import main.java.com.campfhir.dao.ConditionDao;
import main.java.com.campfhir.service.conversion.ConditionConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Condition.
 * @see .Condition
 * @author Paul Kovach
 */

public class ConditionService {

	private static ConditionDao ConditionDao;
	private static ConditionConversion ConditionConversion;

	public ConditionService() 
	{
		ConditionDao = new ConditionDao();
		ConditionConversion = new ConditionConversion();
	}

	public void persist(main.java.com.campfhir.model.Condition entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ConditionDao.openCurrentSessionwithTransaction();
		 ConditionDao.persist(entity);
		 ConditionDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Condition entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ConditionDao.openCurrentSessionwithTransaction();
		 ConditionDao.update(entity);
		 ConditionDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Condition findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ConditionDao.openCurrentSession();
		main.java.com.campfhir.model.Condition resource = ConditionDao.findById(id);
		ConditionDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Condition> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ConditionDao.openCurrentSession();
		List<main.java.com.campfhir.model.Condition> resource =  ConditionDao.findByPatientId(id);
		ConditionDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ConditionDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Condition resource =  ConditionDao.findById(id);
		ConditionDao.delete(resource);
		ConditionDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  ConditionDao.openCurrentSession();
		ScrollableResults resources =  ConditionDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Condition.html")  			   
			   .setResource(ConditionConversion.Conditions((main.java.com.campfhir.model.Condition) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  ConditionDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Condition> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  ConditionDao.findAll();
		List<main.java.com.campfhir.model.Condition> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Condition) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 ConditionDao.openCurrentSessionwithTransaction();
		 ConditionDao.deleteAll();
		 ConditionDao.closeCurrentSessionwithTransaction();
	}

	public ConditionDao  ConditionDao() 
	{
		return  ConditionDao;
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

