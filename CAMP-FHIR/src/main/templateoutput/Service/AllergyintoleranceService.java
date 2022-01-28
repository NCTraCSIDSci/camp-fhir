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
import main.java.com.campfhir.dao.AllergyintoleranceDao;
import main.java.com.campfhir.service.conversion.AllergyintoleranceConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Allergyintolerance.
 * @see .Allergyintolerance
 * @author Paul Kovach
 */

public class AllergyintoleranceService {

	private static AllergyintoleranceDao AllergyintoleranceDao;
	private static AllergyintoleranceConversion AllergyintoleranceConversion;

	public AllergyintoleranceService() 
	{
		AllergyintoleranceDao = new AllergyintoleranceDao();
		AllergyintoleranceConversion = new AllergyintoleranceConversion();
	}

	public void persist(main.java.com.campfhir.model.Allergyintolerance entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 AllergyintoleranceDao.openCurrentSessionwithTransaction();
		 AllergyintoleranceDao.persist(entity);
		 AllergyintoleranceDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Allergyintolerance entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 AllergyintoleranceDao.openCurrentSessionwithTransaction();
		 AllergyintoleranceDao.update(entity);
		 AllergyintoleranceDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Allergyintolerance findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		AllergyintoleranceDao.openCurrentSession();
		main.java.com.campfhir.model.Allergyintolerance resource = AllergyintoleranceDao.findById(id);
		AllergyintoleranceDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Allergyintolerance> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		AllergyintoleranceDao.openCurrentSession();
		List<main.java.com.campfhir.model.Allergyintolerance> resource =  AllergyintoleranceDao.findByPatientId(id);
		AllergyintoleranceDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		AllergyintoleranceDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Allergyintolerance resource =  AllergyintoleranceDao.findById(id);
		AllergyintoleranceDao.delete(resource);
		AllergyintoleranceDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  AllergyintoleranceDao.openCurrentSession();
		ScrollableResults resources =  AllergyintoleranceDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Allergyintolerance.html")  			   
			   .setResource(AllergyintoleranceConversion.Allergyintolerances((main.java.com.campfhir.model.Allergyintolerance) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  AllergyintoleranceDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Allergyintolerance> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  AllergyintoleranceDao.findAll();
		List<main.java.com.campfhir.model.Allergyintolerance> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Allergyintolerance) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 AllergyintoleranceDao.openCurrentSessionwithTransaction();
		 AllergyintoleranceDao.deleteAll();
		 AllergyintoleranceDao.closeCurrentSessionwithTransaction();
	}

	public AllergyintoleranceDao  AllergyintoleranceDao() 
	{
		return  AllergyintoleranceDao;
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

