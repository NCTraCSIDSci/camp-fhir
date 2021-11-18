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
import main.java.com.campfhir.dao.CommunicationrequestDao;
import main.java.com.campfhir.service.conversion.CommunicationrequestConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Communicationrequest.
 * @see .Communicationrequest
 * @author Paul Kovach
 */

public class CommunicationrequestService {

	private static CommunicationrequestDao CommunicationrequestDao;
	private static CommunicationrequestConversion CommunicationrequestConversion;

	public CommunicationrequestService() 
	{
		CommunicationrequestDao = new CommunicationrequestDao();
		CommunicationrequestConversion = new CommunicationrequestConversion();
	}

	public void persist(main.java.com.campfhir.model.Communicationrequest entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 CommunicationrequestDao.openCurrentSessionwithTransaction();
		 CommunicationrequestDao.persist(entity);
		 CommunicationrequestDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Communicationrequest entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 CommunicationrequestDao.openCurrentSessionwithTransaction();
		 CommunicationrequestDao.update(entity);
		 CommunicationrequestDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Communicationrequest findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		CommunicationrequestDao.openCurrentSession();
		main.java.com.campfhir.model.Communicationrequest resource = CommunicationrequestDao.findById(id);
		CommunicationrequestDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Communicationrequest> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		CommunicationrequestDao.openCurrentSession();
		List<main.java.com.campfhir.model.Communicationrequest> resource =  CommunicationrequestDao.findByPatientId(id);
		CommunicationrequestDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		CommunicationrequestDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Communicationrequest resource =  CommunicationrequestDao.findById(id);
		CommunicationrequestDao.delete(resource);
		CommunicationrequestDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  CommunicationrequestDao.openCurrentSession();
		ScrollableResults resources =  CommunicationrequestDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Communicationrequest.html")  			   
			   .setResource(CommunicationrequestConversion.Communicationrequests((main.java.com.campfhir.model.Communicationrequest) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  CommunicationrequestDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Communicationrequest> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  CommunicationrequestDao.findAll();
		List<main.java.com.campfhir.model.Communicationrequest> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Communicationrequest) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 CommunicationrequestDao.openCurrentSessionwithTransaction();
		 CommunicationrequestDao.deleteAll();
		 CommunicationrequestDao.closeCurrentSessionwithTransaction();
	}

	public CommunicationrequestDao  CommunicationrequestDao() 
	{
		return  CommunicationrequestDao;
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

