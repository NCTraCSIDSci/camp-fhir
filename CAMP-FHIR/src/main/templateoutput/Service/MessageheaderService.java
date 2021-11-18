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
import main.java.com.campfhir.dao.MessageheaderDao;
import main.java.com.campfhir.service.conversion.MessageheaderConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Messageheader.
 * @see .Messageheader
 * @author Paul Kovach
 */

public class MessageheaderService {

	private static MessageheaderDao MessageheaderDao;
	private static MessageheaderConversion MessageheaderConversion;

	public MessageheaderService() 
	{
		MessageheaderDao = new MessageheaderDao();
		MessageheaderConversion = new MessageheaderConversion();
	}

	public void persist(main.java.com.campfhir.model.Messageheader entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MessageheaderDao.openCurrentSessionwithTransaction();
		 MessageheaderDao.persist(entity);
		 MessageheaderDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Messageheader entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MessageheaderDao.openCurrentSessionwithTransaction();
		 MessageheaderDao.update(entity);
		 MessageheaderDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Messageheader findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MessageheaderDao.openCurrentSession();
		main.java.com.campfhir.model.Messageheader resource = MessageheaderDao.findById(id);
		MessageheaderDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Messageheader> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MessageheaderDao.openCurrentSession();
		List<main.java.com.campfhir.model.Messageheader> resource =  MessageheaderDao.findByPatientId(id);
		MessageheaderDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MessageheaderDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Messageheader resource =  MessageheaderDao.findById(id);
		MessageheaderDao.delete(resource);
		MessageheaderDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  MessageheaderDao.openCurrentSession();
		ScrollableResults resources =  MessageheaderDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Messageheader.html")  			   
			   .setResource(MessageheaderConversion.Messageheaders((main.java.com.campfhir.model.Messageheader) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  MessageheaderDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Messageheader> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  MessageheaderDao.findAll();
		List<main.java.com.campfhir.model.Messageheader> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Messageheader) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 MessageheaderDao.openCurrentSessionwithTransaction();
		 MessageheaderDao.deleteAll();
		 MessageheaderDao.closeCurrentSessionwithTransaction();
	}

	public MessageheaderDao  MessageheaderDao() 
	{
		return  MessageheaderDao;
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

