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
import main.java.com.campfhir.dao.CapabilitystatementDao;
import main.java.com.campfhir.service.conversion.CapabilitystatementConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Capabilitystatement.
 * @see .Capabilitystatement
 * @author Paul Kovach
 */

public class CapabilitystatementService {

	private static CapabilitystatementDao CapabilitystatementDao;
	private static CapabilitystatementConversion CapabilitystatementConversion;

	public CapabilitystatementService() 
	{
		CapabilitystatementDao = new CapabilitystatementDao();
		CapabilitystatementConversion = new CapabilitystatementConversion();
	}

	public void persist(main.java.com.campfhir.model.Capabilitystatement entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 CapabilitystatementDao.openCurrentSessionwithTransaction();
		 CapabilitystatementDao.persist(entity);
		 CapabilitystatementDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Capabilitystatement entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 CapabilitystatementDao.openCurrentSessionwithTransaction();
		 CapabilitystatementDao.update(entity);
		 CapabilitystatementDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Capabilitystatement findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		CapabilitystatementDao.openCurrentSession();
		main.java.com.campfhir.model.Capabilitystatement resource = CapabilitystatementDao.findById(id);
		CapabilitystatementDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Capabilitystatement> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		CapabilitystatementDao.openCurrentSession();
		List<main.java.com.campfhir.model.Capabilitystatement> resource =  CapabilitystatementDao.findByPatientId(id);
		CapabilitystatementDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		CapabilitystatementDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Capabilitystatement resource =  CapabilitystatementDao.findById(id);
		CapabilitystatementDao.delete(resource);
		CapabilitystatementDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  CapabilitystatementDao.openCurrentSession();
		ScrollableResults resources =  CapabilitystatementDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Capabilitystatement.html")  			   
			   .setResource(CapabilitystatementConversion.Capabilitystatements((main.java.com.campfhir.model.Capabilitystatement) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  CapabilitystatementDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Capabilitystatement> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  CapabilitystatementDao.findAll();
		List<main.java.com.campfhir.model.Capabilitystatement> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Capabilitystatement) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 CapabilitystatementDao.openCurrentSessionwithTransaction();
		 CapabilitystatementDao.deleteAll();
		 CapabilitystatementDao.closeCurrentSessionwithTransaction();
	}

	public CapabilitystatementDao  CapabilitystatementDao() 
	{
		return  CapabilitystatementDao;
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

