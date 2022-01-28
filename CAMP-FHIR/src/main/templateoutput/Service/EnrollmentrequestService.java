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
import main.java.com.campfhir.dao.EnrollmentrequestDao;
import main.java.com.campfhir.service.conversion.EnrollmentrequestConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Enrollmentrequest.
 * @see .Enrollmentrequest
 * @author Paul Kovach
 */

public class EnrollmentrequestService {

	private static EnrollmentrequestDao EnrollmentrequestDao;
	private static EnrollmentrequestConversion EnrollmentrequestConversion;

	public EnrollmentrequestService() 
	{
		EnrollmentrequestDao = new EnrollmentrequestDao();
		EnrollmentrequestConversion = new EnrollmentrequestConversion();
	}

	public void persist(main.java.com.campfhir.model.Enrollmentrequest entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 EnrollmentrequestDao.openCurrentSessionwithTransaction();
		 EnrollmentrequestDao.persist(entity);
		 EnrollmentrequestDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Enrollmentrequest entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 EnrollmentrequestDao.openCurrentSessionwithTransaction();
		 EnrollmentrequestDao.update(entity);
		 EnrollmentrequestDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Enrollmentrequest findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		EnrollmentrequestDao.openCurrentSession();
		main.java.com.campfhir.model.Enrollmentrequest resource = EnrollmentrequestDao.findById(id);
		EnrollmentrequestDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Enrollmentrequest> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		EnrollmentrequestDao.openCurrentSession();
		List<main.java.com.campfhir.model.Enrollmentrequest> resource =  EnrollmentrequestDao.findByPatientId(id);
		EnrollmentrequestDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		EnrollmentrequestDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Enrollmentrequest resource =  EnrollmentrequestDao.findById(id);
		EnrollmentrequestDao.delete(resource);
		EnrollmentrequestDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  EnrollmentrequestDao.openCurrentSession();
		ScrollableResults resources =  EnrollmentrequestDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Enrollmentrequest.html")  			   
			   .setResource(EnrollmentrequestConversion.Enrollmentrequests((main.java.com.campfhir.model.Enrollmentrequest) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  EnrollmentrequestDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Enrollmentrequest> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  EnrollmentrequestDao.findAll();
		List<main.java.com.campfhir.model.Enrollmentrequest> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Enrollmentrequest) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 EnrollmentrequestDao.openCurrentSessionwithTransaction();
		 EnrollmentrequestDao.deleteAll();
		 EnrollmentrequestDao.closeCurrentSessionwithTransaction();
	}

	public EnrollmentrequestDao  EnrollmentrequestDao() 
	{
		return  EnrollmentrequestDao;
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

