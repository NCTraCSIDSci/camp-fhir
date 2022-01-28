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
import main.java.com.campfhir.dao.ImmunizationDao;
import main.java.com.campfhir.service.conversion.ImmunizationConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Immunization.
 * @see .Immunization
 * @author Paul Kovach
 */

public class ImmunizationService {

	private static ImmunizationDao ImmunizationDao;
	private static ImmunizationConversion ImmunizationConversion;

	public ImmunizationService() 
	{
		ImmunizationDao = new ImmunizationDao();
		ImmunizationConversion = new ImmunizationConversion();
	}

	public void persist(main.java.com.campfhir.model.Immunization entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ImmunizationDao.openCurrentSessionwithTransaction();
		 ImmunizationDao.persist(entity);
		 ImmunizationDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Immunization entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ImmunizationDao.openCurrentSessionwithTransaction();
		 ImmunizationDao.update(entity);
		 ImmunizationDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Immunization findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ImmunizationDao.openCurrentSession();
		main.java.com.campfhir.model.Immunization resource = ImmunizationDao.findById(id);
		ImmunizationDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Immunization> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ImmunizationDao.openCurrentSession();
		List<main.java.com.campfhir.model.Immunization> resource =  ImmunizationDao.findByPatientId(id);
		ImmunizationDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ImmunizationDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Immunization resource =  ImmunizationDao.findById(id);
		ImmunizationDao.delete(resource);
		ImmunizationDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  ImmunizationDao.openCurrentSession();
		ScrollableResults resources =  ImmunizationDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Immunization.html")  			   
			   .setResource(ImmunizationConversion.Immunizations((main.java.com.campfhir.model.Immunization) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  ImmunizationDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Immunization> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  ImmunizationDao.findAll();
		List<main.java.com.campfhir.model.Immunization> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Immunization) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 ImmunizationDao.openCurrentSessionwithTransaction();
		 ImmunizationDao.deleteAll();
		 ImmunizationDao.closeCurrentSessionwithTransaction();
	}

	public ImmunizationDao  ImmunizationDao() 
	{
		return  ImmunizationDao;
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

