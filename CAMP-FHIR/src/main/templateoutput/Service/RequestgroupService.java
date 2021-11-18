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
import main.java.com.campfhir.dao.RequestgroupDao;
import main.java.com.campfhir.service.conversion.RequestgroupConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Requestgroup.
 * @see .Requestgroup
 * @author Paul Kovach
 */

public class RequestgroupService {

	private static RequestgroupDao RequestgroupDao;
	private static RequestgroupConversion RequestgroupConversion;

	public RequestgroupService() 
	{
		RequestgroupDao = new RequestgroupDao();
		RequestgroupConversion = new RequestgroupConversion();
	}

	public void persist(main.java.com.campfhir.model.Requestgroup entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 RequestgroupDao.openCurrentSessionwithTransaction();
		 RequestgroupDao.persist(entity);
		 RequestgroupDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Requestgroup entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 RequestgroupDao.openCurrentSessionwithTransaction();
		 RequestgroupDao.update(entity);
		 RequestgroupDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Requestgroup findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		RequestgroupDao.openCurrentSession();
		main.java.com.campfhir.model.Requestgroup resource = RequestgroupDao.findById(id);
		RequestgroupDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Requestgroup> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		RequestgroupDao.openCurrentSession();
		List<main.java.com.campfhir.model.Requestgroup> resource =  RequestgroupDao.findByPatientId(id);
		RequestgroupDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		RequestgroupDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Requestgroup resource =  RequestgroupDao.findById(id);
		RequestgroupDao.delete(resource);
		RequestgroupDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  RequestgroupDao.openCurrentSession();
		ScrollableResults resources =  RequestgroupDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Requestgroup.html")  			   
			   .setResource(RequestgroupConversion.Requestgroups((main.java.com.campfhir.model.Requestgroup) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  RequestgroupDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Requestgroup> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  RequestgroupDao.findAll();
		List<main.java.com.campfhir.model.Requestgroup> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Requestgroup) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 RequestgroupDao.openCurrentSessionwithTransaction();
		 RequestgroupDao.deleteAll();
		 RequestgroupDao.closeCurrentSessionwithTransaction();
	}

	public RequestgroupDao  RequestgroupDao() 
	{
		return  RequestgroupDao;
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

