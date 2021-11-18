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
import main.java.com.campfhir.dao.PractitionerDao;
import main.java.com.campfhir.service.conversion.PractitionerConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Practitioner.
 * @see .Practitioner
 * @author Paul Kovach
 */

public class PractitionerService {

	private static PractitionerDao PractitionerDao;
	private static PractitionerConversion PractitionerConversion;

	public PractitionerService() 
	{
		PractitionerDao = new PractitionerDao();
		PractitionerConversion = new PractitionerConversion();
	}

	public void persist(main.java.com.campfhir.model.Practitioner entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 PractitionerDao.openCurrentSessionwithTransaction();
		 PractitionerDao.persist(entity);
		 PractitionerDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Practitioner entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 PractitionerDao.openCurrentSessionwithTransaction();
		 PractitionerDao.update(entity);
		 PractitionerDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Practitioner findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		PractitionerDao.openCurrentSession();
		main.java.com.campfhir.model.Practitioner resource = PractitionerDao.findById(id);
		PractitionerDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Practitioner> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		PractitionerDao.openCurrentSession();
		List<main.java.com.campfhir.model.Practitioner> resource =  PractitionerDao.findByPatientId(id);
		PractitionerDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		PractitionerDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Practitioner resource =  PractitionerDao.findById(id);
		PractitionerDao.delete(resource);
		PractitionerDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  PractitionerDao.openCurrentSession();
		ScrollableResults resources =  PractitionerDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Practitioner.html")  			   
			   .setResource(PractitionerConversion.Practitioners((main.java.com.campfhir.model.Practitioner) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  PractitionerDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Practitioner> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  PractitionerDao.findAll();
		List<main.java.com.campfhir.model.Practitioner> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Practitioner) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 PractitionerDao.openCurrentSessionwithTransaction();
		 PractitionerDao.deleteAll();
		 PractitionerDao.closeCurrentSessionwithTransaction();
	}

	public PractitionerDao  PractitionerDao() 
	{
		return  PractitionerDao;
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

