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
import main.java.com.campfhir.dao.ClaimDao;
import main.java.com.campfhir.service.conversion.ClaimConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Claim.
 * @see .Claim
 * @author Paul Kovach
 */

public class ClaimService {

	private static ClaimDao ClaimDao;
	private static ClaimConversion ClaimConversion;

	public ClaimService() 
	{
		ClaimDao = new ClaimDao();
		ClaimConversion = new ClaimConversion();
	}

	public void persist(main.java.com.campfhir.model.Claim entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ClaimDao.openCurrentSessionwithTransaction();
		 ClaimDao.persist(entity);
		 ClaimDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Claim entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ClaimDao.openCurrentSessionwithTransaction();
		 ClaimDao.update(entity);
		 ClaimDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Claim findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ClaimDao.openCurrentSession();
		main.java.com.campfhir.model.Claim resource = ClaimDao.findById(id);
		ClaimDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Claim> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ClaimDao.openCurrentSession();
		List<main.java.com.campfhir.model.Claim> resource =  ClaimDao.findByPatientId(id);
		ClaimDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ClaimDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Claim resource =  ClaimDao.findById(id);
		ClaimDao.delete(resource);
		ClaimDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  ClaimDao.openCurrentSession();
		ScrollableResults resources =  ClaimDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Claim.html")  			   
			   .setResource(ClaimConversion.Claims((main.java.com.campfhir.model.Claim) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  ClaimDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Claim> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  ClaimDao.findAll();
		List<main.java.com.campfhir.model.Claim> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Claim) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 ClaimDao.openCurrentSessionwithTransaction();
		 ClaimDao.deleteAll();
		 ClaimDao.closeCurrentSessionwithTransaction();
	}

	public ClaimDao  ClaimDao() 
	{
		return  ClaimDao;
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

