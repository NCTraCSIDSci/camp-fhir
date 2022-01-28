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
import main.java.com.campfhir.dao.ServicerequestDao;
import main.java.com.campfhir.service.conversion.ServicerequestConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Servicerequest.
 * @see .Servicerequest
 * @author Paul Kovach
 */

public class ServicerequestService {

	private static ServicerequestDao ServicerequestDao;
	private static ServicerequestConversion ServicerequestConversion;

	public ServicerequestService() 
	{
		ServicerequestDao = new ServicerequestDao();
		ServicerequestConversion = new ServicerequestConversion();
	}

	public void persist(main.java.com.campfhir.model.Servicerequest entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ServicerequestDao.openCurrentSessionwithTransaction();
		 ServicerequestDao.persist(entity);
		 ServicerequestDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Servicerequest entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ServicerequestDao.openCurrentSessionwithTransaction();
		 ServicerequestDao.update(entity);
		 ServicerequestDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Servicerequest findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ServicerequestDao.openCurrentSession();
		main.java.com.campfhir.model.Servicerequest resource = ServicerequestDao.findById(id);
		ServicerequestDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Servicerequest> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ServicerequestDao.openCurrentSession();
		List<main.java.com.campfhir.model.Servicerequest> resource =  ServicerequestDao.findByPatientId(id);
		ServicerequestDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ServicerequestDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Servicerequest resource =  ServicerequestDao.findById(id);
		ServicerequestDao.delete(resource);
		ServicerequestDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  ServicerequestDao.openCurrentSession();
		ScrollableResults resources =  ServicerequestDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Servicerequest.html")  			   
			   .setResource(ServicerequestConversion.Servicerequests((main.java.com.campfhir.model.Servicerequest) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  ServicerequestDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Servicerequest> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  ServicerequestDao.findAll();
		List<main.java.com.campfhir.model.Servicerequest> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Servicerequest) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 ServicerequestDao.openCurrentSessionwithTransaction();
		 ServicerequestDao.deleteAll();
		 ServicerequestDao.closeCurrentSessionwithTransaction();
	}

	public ServicerequestDao  ServicerequestDao() 
	{
		return  ServicerequestDao;
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

