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
import main.java.com.campfhir.dao.OrganizationaffiliationDao;
import main.java.com.campfhir.service.conversion.OrganizationaffiliationConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Organizationaffiliation.
 * @see .Organizationaffiliation
 * @author Paul Kovach
 */

public class OrganizationaffiliationService {

	private static OrganizationaffiliationDao OrganizationaffiliationDao;
	private static OrganizationaffiliationConversion OrganizationaffiliationConversion;

	public OrganizationaffiliationService() 
	{
		OrganizationaffiliationDao = new OrganizationaffiliationDao();
		OrganizationaffiliationConversion = new OrganizationaffiliationConversion();
	}

	public void persist(main.java.com.campfhir.model.Organizationaffiliation entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 OrganizationaffiliationDao.openCurrentSessionwithTransaction();
		 OrganizationaffiliationDao.persist(entity);
		 OrganizationaffiliationDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Organizationaffiliation entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 OrganizationaffiliationDao.openCurrentSessionwithTransaction();
		 OrganizationaffiliationDao.update(entity);
		 OrganizationaffiliationDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Organizationaffiliation findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		OrganizationaffiliationDao.openCurrentSession();
		main.java.com.campfhir.model.Organizationaffiliation resource = OrganizationaffiliationDao.findById(id);
		OrganizationaffiliationDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Organizationaffiliation> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		OrganizationaffiliationDao.openCurrentSession();
		List<main.java.com.campfhir.model.Organizationaffiliation> resource =  OrganizationaffiliationDao.findByPatientId(id);
		OrganizationaffiliationDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		OrganizationaffiliationDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Organizationaffiliation resource =  OrganizationaffiliationDao.findById(id);
		OrganizationaffiliationDao.delete(resource);
		OrganizationaffiliationDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  OrganizationaffiliationDao.openCurrentSession();
		ScrollableResults resources =  OrganizationaffiliationDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Organizationaffiliation.html")  			   
			   .setResource(OrganizationaffiliationConversion.Organizationaffiliations((main.java.com.campfhir.model.Organizationaffiliation) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  OrganizationaffiliationDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Organizationaffiliation> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  OrganizationaffiliationDao.findAll();
		List<main.java.com.campfhir.model.Organizationaffiliation> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Organizationaffiliation) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 OrganizationaffiliationDao.openCurrentSessionwithTransaction();
		 OrganizationaffiliationDao.deleteAll();
		 OrganizationaffiliationDao.closeCurrentSessionwithTransaction();
	}

	public OrganizationaffiliationDao  OrganizationaffiliationDao() 
	{
		return  OrganizationaffiliationDao;
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

