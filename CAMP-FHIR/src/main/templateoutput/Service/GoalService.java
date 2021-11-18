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
import main.java.com.campfhir.dao.GoalDao;
import main.java.com.campfhir.service.conversion.GoalConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Goal.
 * @see .Goal
 * @author Paul Kovach
 */

public class GoalService {

	private static GoalDao GoalDao;
	private static GoalConversion GoalConversion;

	public GoalService() 
	{
		GoalDao = new GoalDao();
		GoalConversion = new GoalConversion();
	}

	public void persist(main.java.com.campfhir.model.Goal entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 GoalDao.openCurrentSessionwithTransaction();
		 GoalDao.persist(entity);
		 GoalDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Goal entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 GoalDao.openCurrentSessionwithTransaction();
		 GoalDao.update(entity);
		 GoalDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Goal findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		GoalDao.openCurrentSession();
		main.java.com.campfhir.model.Goal resource = GoalDao.findById(id);
		GoalDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Goal> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		GoalDao.openCurrentSession();
		List<main.java.com.campfhir.model.Goal> resource =  GoalDao.findByPatientId(id);
		GoalDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		GoalDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Goal resource =  GoalDao.findById(id);
		GoalDao.delete(resource);
		GoalDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  GoalDao.openCurrentSession();
		ScrollableResults resources =  GoalDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Goal.html")  			   
			   .setResource(GoalConversion.Goals((main.java.com.campfhir.model.Goal) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  GoalDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Goal> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  GoalDao.findAll();
		List<main.java.com.campfhir.model.Goal> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Goal) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 GoalDao.openCurrentSessionwithTransaction();
		 GoalDao.deleteAll();
		 GoalDao.closeCurrentSessionwithTransaction();
	}

	public GoalDao  GoalDao() 
	{
		return  GoalDao;
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

