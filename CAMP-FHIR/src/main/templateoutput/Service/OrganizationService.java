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
import main.java.com.campfhir.dao.OrganizationDao;
import main.java.com.campfhir.service.conversion.OrganizationConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Organization.
 * @see .Organization
 * @author Paul Kovach
 */

public class OrganizationService {

	private static OrganizationDao OrganizationDao;
	private static OrganizationConversion OrganizationConversion;

	public OrganizationService() 
	{
		OrganizationDao = new OrganizationDao();
		OrganizationConversion = new OrganizationConversion();
	}

	public void persist(main.java.com.campfhir.model.Organization entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 OrganizationDao.openCurrentSessionwithTransaction();
		 OrganizationDao.persist(entity);
		 OrganizationDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Organization entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 OrganizationDao.openCurrentSessionwithTransaction();
		 OrganizationDao.update(entity);
		 OrganizationDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Organization findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		OrganizationDao.openCurrentSession();
		main.java.com.campfhir.model.Organization resource = OrganizationDao.findById(id);
		OrganizationDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Organization> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		OrganizationDao.openCurrentSession();
		List<main.java.com.campfhir.model.Organization> resource =  OrganizationDao.findByPatientId(id);
		OrganizationDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		OrganizationDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Organization resource =  OrganizationDao.findById(id);
		OrganizationDao.delete(resource);
		OrganizationDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  OrganizationDao.openCurrentSession();
		ScrollableResults resources =  OrganizationDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Organization.html")  			   
			   .setResource(OrganizationConversion.Organizations((main.java.com.campfhir.model.Organization) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  OrganizationDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Organization> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  OrganizationDao.findAll();
		List<main.java.com.campfhir.model.Organization> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Organization) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 OrganizationDao.openCurrentSessionwithTransaction();
		 OrganizationDao.deleteAll();
		 OrganizationDao.closeCurrentSessionwithTransaction();
	}

	public OrganizationDao  OrganizationDao() 
	{
		return  OrganizationDao;
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

