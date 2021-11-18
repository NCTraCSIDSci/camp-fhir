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
import main.java.com.campfhir.dao.MessagedefinitionDao;
import main.java.com.campfhir.service.conversion.MessagedefinitionConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Messagedefinition.
 * @see .Messagedefinition
 * @author Paul Kovach
 */

public class MessagedefinitionService {

	private static MessagedefinitionDao MessagedefinitionDao;
	private static MessagedefinitionConversion MessagedefinitionConversion;

	public MessagedefinitionService() 
	{
		MessagedefinitionDao = new MessagedefinitionDao();
		MessagedefinitionConversion = new MessagedefinitionConversion();
	}

	public void persist(main.java.com.campfhir.model.Messagedefinition entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MessagedefinitionDao.openCurrentSessionwithTransaction();
		 MessagedefinitionDao.persist(entity);
		 MessagedefinitionDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Messagedefinition entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MessagedefinitionDao.openCurrentSessionwithTransaction();
		 MessagedefinitionDao.update(entity);
		 MessagedefinitionDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Messagedefinition findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MessagedefinitionDao.openCurrentSession();
		main.java.com.campfhir.model.Messagedefinition resource = MessagedefinitionDao.findById(id);
		MessagedefinitionDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Messagedefinition> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MessagedefinitionDao.openCurrentSession();
		List<main.java.com.campfhir.model.Messagedefinition> resource =  MessagedefinitionDao.findByPatientId(id);
		MessagedefinitionDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MessagedefinitionDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Messagedefinition resource =  MessagedefinitionDao.findById(id);
		MessagedefinitionDao.delete(resource);
		MessagedefinitionDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  MessagedefinitionDao.openCurrentSession();
		ScrollableResults resources =  MessagedefinitionDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Messagedefinition.html")  			   
			   .setResource(MessagedefinitionConversion.Messagedefinitions((main.java.com.campfhir.model.Messagedefinition) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  MessagedefinitionDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Messagedefinition> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  MessagedefinitionDao.findAll();
		List<main.java.com.campfhir.model.Messagedefinition> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Messagedefinition) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 MessagedefinitionDao.openCurrentSessionwithTransaction();
		 MessagedefinitionDao.deleteAll();
		 MessagedefinitionDao.closeCurrentSessionwithTransaction();
	}

	public MessagedefinitionDao  MessagedefinitionDao() 
	{
		return  MessagedefinitionDao;
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

