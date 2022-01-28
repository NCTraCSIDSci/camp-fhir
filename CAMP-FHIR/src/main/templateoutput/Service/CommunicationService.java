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
import main.java.com.campfhir.dao.CommunicationDao;
import main.java.com.campfhir.service.conversion.CommunicationConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Communication.
 * @see .Communication
 * @author Paul Kovach
 */

public class CommunicationService {

	private static CommunicationDao CommunicationDao;
	private static CommunicationConversion CommunicationConversion;

	public CommunicationService() 
	{
		CommunicationDao = new CommunicationDao();
		CommunicationConversion = new CommunicationConversion();
	}

	public void persist(main.java.com.campfhir.model.Communication entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 CommunicationDao.openCurrentSessionwithTransaction();
		 CommunicationDao.persist(entity);
		 CommunicationDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Communication entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 CommunicationDao.openCurrentSessionwithTransaction();
		 CommunicationDao.update(entity);
		 CommunicationDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Communication findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		CommunicationDao.openCurrentSession();
		main.java.com.campfhir.model.Communication resource = CommunicationDao.findById(id);
		CommunicationDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Communication> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		CommunicationDao.openCurrentSession();
		List<main.java.com.campfhir.model.Communication> resource =  CommunicationDao.findByPatientId(id);
		CommunicationDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		CommunicationDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Communication resource =  CommunicationDao.findById(id);
		CommunicationDao.delete(resource);
		CommunicationDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  CommunicationDao.openCurrentSession();
		ScrollableResults resources =  CommunicationDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Communication.html")  			   
			   .setResource(CommunicationConversion.Communications((main.java.com.campfhir.model.Communication) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  CommunicationDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Communication> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  CommunicationDao.findAll();
		List<main.java.com.campfhir.model.Communication> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Communication) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 CommunicationDao.openCurrentSessionwithTransaction();
		 CommunicationDao.deleteAll();
		 CommunicationDao.closeCurrentSessionwithTransaction();
	}

	public CommunicationDao  CommunicationDao() 
	{
		return  CommunicationDao;
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

