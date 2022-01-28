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
import main.java.com.campfhir.dao.EvidenceDao;
import main.java.com.campfhir.service.conversion.EvidenceConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Evidence.
 * @see .Evidence
 * @author Paul Kovach
 */

public class EvidenceService {

	private static EvidenceDao EvidenceDao;
	private static EvidenceConversion EvidenceConversion;

	public EvidenceService() 
	{
		EvidenceDao = new EvidenceDao();
		EvidenceConversion = new EvidenceConversion();
	}

	public void persist(main.java.com.campfhir.model.Evidence entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 EvidenceDao.openCurrentSessionwithTransaction();
		 EvidenceDao.persist(entity);
		 EvidenceDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Evidence entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 EvidenceDao.openCurrentSessionwithTransaction();
		 EvidenceDao.update(entity);
		 EvidenceDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Evidence findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		EvidenceDao.openCurrentSession();
		main.java.com.campfhir.model.Evidence resource = EvidenceDao.findById(id);
		EvidenceDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Evidence> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		EvidenceDao.openCurrentSession();
		List<main.java.com.campfhir.model.Evidence> resource =  EvidenceDao.findByPatientId(id);
		EvidenceDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		EvidenceDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Evidence resource =  EvidenceDao.findById(id);
		EvidenceDao.delete(resource);
		EvidenceDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  EvidenceDao.openCurrentSession();
		ScrollableResults resources =  EvidenceDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Evidence.html")  			   
			   .setResource(EvidenceConversion.Evidences((main.java.com.campfhir.model.Evidence) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  EvidenceDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Evidence> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  EvidenceDao.findAll();
		List<main.java.com.campfhir.model.Evidence> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Evidence) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 EvidenceDao.openCurrentSessionwithTransaction();
		 EvidenceDao.deleteAll();
		 EvidenceDao.closeCurrentSessionwithTransaction();
	}

	public EvidenceDao  EvidenceDao() 
	{
		return  EvidenceDao;
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

