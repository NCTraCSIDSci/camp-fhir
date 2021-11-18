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
import main.java.com.campfhir.dao.PractitionerroleDao;
import main.java.com.campfhir.service.conversion.PractitionerroleConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Practitionerrole.
 * @see .Practitionerrole
 * @author Paul Kovach
 */

public class PractitionerroleService {

	private static PractitionerroleDao PractitionerroleDao;
	private static PractitionerroleConversion PractitionerroleConversion;

	public PractitionerroleService() 
	{
		PractitionerroleDao = new PractitionerroleDao();
		PractitionerroleConversion = new PractitionerroleConversion();
	}

	public void persist(main.java.com.campfhir.model.Practitionerrole entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 PractitionerroleDao.openCurrentSessionwithTransaction();
		 PractitionerroleDao.persist(entity);
		 PractitionerroleDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Practitionerrole entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 PractitionerroleDao.openCurrentSessionwithTransaction();
		 PractitionerroleDao.update(entity);
		 PractitionerroleDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Practitionerrole findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		PractitionerroleDao.openCurrentSession();
		main.java.com.campfhir.model.Practitionerrole resource = PractitionerroleDao.findById(id);
		PractitionerroleDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Practitionerrole> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		PractitionerroleDao.openCurrentSession();
		List<main.java.com.campfhir.model.Practitionerrole> resource =  PractitionerroleDao.findByPatientId(id);
		PractitionerroleDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		PractitionerroleDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Practitionerrole resource =  PractitionerroleDao.findById(id);
		PractitionerroleDao.delete(resource);
		PractitionerroleDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  PractitionerroleDao.openCurrentSession();
		ScrollableResults resources =  PractitionerroleDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Practitionerrole.html")  			   
			   .setResource(PractitionerroleConversion.Practitionerroles((main.java.com.campfhir.model.Practitionerrole) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  PractitionerroleDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Practitionerrole> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  PractitionerroleDao.findAll();
		List<main.java.com.campfhir.model.Practitionerrole> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Practitionerrole) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 PractitionerroleDao.openCurrentSessionwithTransaction();
		 PractitionerroleDao.deleteAll();
		 PractitionerroleDao.closeCurrentSessionwithTransaction();
	}

	public PractitionerroleDao  PractitionerroleDao() 
	{
		return  PractitionerroleDao;
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

