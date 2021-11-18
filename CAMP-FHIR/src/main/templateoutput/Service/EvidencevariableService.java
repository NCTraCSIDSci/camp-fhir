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
import main.java.com.campfhir.dao.EvidencevariableDao;
import main.java.com.campfhir.service.conversion.EvidencevariableConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Evidencevariable.
 * @see .Evidencevariable
 * @author Paul Kovach
 */

public class EvidencevariableService {

	private static EvidencevariableDao EvidencevariableDao;
	private static EvidencevariableConversion EvidencevariableConversion;

	public EvidencevariableService() 
	{
		EvidencevariableDao = new EvidencevariableDao();
		EvidencevariableConversion = new EvidencevariableConversion();
	}

	public void persist(main.java.com.campfhir.model.Evidencevariable entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 EvidencevariableDao.openCurrentSessionwithTransaction();
		 EvidencevariableDao.persist(entity);
		 EvidencevariableDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Evidencevariable entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 EvidencevariableDao.openCurrentSessionwithTransaction();
		 EvidencevariableDao.update(entity);
		 EvidencevariableDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Evidencevariable findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		EvidencevariableDao.openCurrentSession();
		main.java.com.campfhir.model.Evidencevariable resource = EvidencevariableDao.findById(id);
		EvidencevariableDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Evidencevariable> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		EvidencevariableDao.openCurrentSession();
		List<main.java.com.campfhir.model.Evidencevariable> resource =  EvidencevariableDao.findByPatientId(id);
		EvidencevariableDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		EvidencevariableDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Evidencevariable resource =  EvidencevariableDao.findById(id);
		EvidencevariableDao.delete(resource);
		EvidencevariableDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  EvidencevariableDao.openCurrentSession();
		ScrollableResults resources =  EvidencevariableDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Evidencevariable.html")  			   
			   .setResource(EvidencevariableConversion.Evidencevariables((main.java.com.campfhir.model.Evidencevariable) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  EvidencevariableDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Evidencevariable> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  EvidencevariableDao.findAll();
		List<main.java.com.campfhir.model.Evidencevariable> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Evidencevariable) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 EvidencevariableDao.openCurrentSessionwithTransaction();
		 EvidencevariableDao.deleteAll();
		 EvidencevariableDao.closeCurrentSessionwithTransaction();
	}

	public EvidencevariableDao  EvidencevariableDao() 
	{
		return  EvidencevariableDao;
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

