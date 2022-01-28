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
import main.java.com.campfhir.dao.EnrollmentresponseDao;
import main.java.com.campfhir.service.conversion.EnrollmentresponseConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Enrollmentresponse.
 * @see .Enrollmentresponse
 * @author Paul Kovach
 */

public class EnrollmentresponseService {

	private static EnrollmentresponseDao EnrollmentresponseDao;
	private static EnrollmentresponseConversion EnrollmentresponseConversion;

	public EnrollmentresponseService() 
	{
		EnrollmentresponseDao = new EnrollmentresponseDao();
		EnrollmentresponseConversion = new EnrollmentresponseConversion();
	}

	public void persist(main.java.com.campfhir.model.Enrollmentresponse entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 EnrollmentresponseDao.openCurrentSessionwithTransaction();
		 EnrollmentresponseDao.persist(entity);
		 EnrollmentresponseDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Enrollmentresponse entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 EnrollmentresponseDao.openCurrentSessionwithTransaction();
		 EnrollmentresponseDao.update(entity);
		 EnrollmentresponseDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Enrollmentresponse findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		EnrollmentresponseDao.openCurrentSession();
		main.java.com.campfhir.model.Enrollmentresponse resource = EnrollmentresponseDao.findById(id);
		EnrollmentresponseDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Enrollmentresponse> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		EnrollmentresponseDao.openCurrentSession();
		List<main.java.com.campfhir.model.Enrollmentresponse> resource =  EnrollmentresponseDao.findByPatientId(id);
		EnrollmentresponseDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		EnrollmentresponseDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Enrollmentresponse resource =  EnrollmentresponseDao.findById(id);
		EnrollmentresponseDao.delete(resource);
		EnrollmentresponseDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  EnrollmentresponseDao.openCurrentSession();
		ScrollableResults resources =  EnrollmentresponseDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Enrollmentresponse.html")  			   
			   .setResource(EnrollmentresponseConversion.Enrollmentresponses((main.java.com.campfhir.model.Enrollmentresponse) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  EnrollmentresponseDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Enrollmentresponse> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  EnrollmentresponseDao.findAll();
		List<main.java.com.campfhir.model.Enrollmentresponse> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Enrollmentresponse) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 EnrollmentresponseDao.openCurrentSessionwithTransaction();
		 EnrollmentresponseDao.deleteAll();
		 EnrollmentresponseDao.closeCurrentSessionwithTransaction();
	}

	public EnrollmentresponseDao  EnrollmentresponseDao() 
	{
		return  EnrollmentresponseDao;
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

