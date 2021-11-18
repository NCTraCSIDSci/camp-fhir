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
import main.java.com.campfhir.dao.ClinicalimpressionDao;
import main.java.com.campfhir.service.conversion.ClinicalimpressionConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Clinicalimpression.
 * @see .Clinicalimpression
 * @author Paul Kovach
 */

public class ClinicalimpressionService {

	private static ClinicalimpressionDao ClinicalimpressionDao;
	private static ClinicalimpressionConversion ClinicalimpressionConversion;

	public ClinicalimpressionService() 
	{
		ClinicalimpressionDao = new ClinicalimpressionDao();
		ClinicalimpressionConversion = new ClinicalimpressionConversion();
	}

	public void persist(main.java.com.campfhir.model.Clinicalimpression entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ClinicalimpressionDao.openCurrentSessionwithTransaction();
		 ClinicalimpressionDao.persist(entity);
		 ClinicalimpressionDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Clinicalimpression entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ClinicalimpressionDao.openCurrentSessionwithTransaction();
		 ClinicalimpressionDao.update(entity);
		 ClinicalimpressionDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Clinicalimpression findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ClinicalimpressionDao.openCurrentSession();
		main.java.com.campfhir.model.Clinicalimpression resource = ClinicalimpressionDao.findById(id);
		ClinicalimpressionDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Clinicalimpression> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ClinicalimpressionDao.openCurrentSession();
		List<main.java.com.campfhir.model.Clinicalimpression> resource =  ClinicalimpressionDao.findByPatientId(id);
		ClinicalimpressionDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ClinicalimpressionDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Clinicalimpression resource =  ClinicalimpressionDao.findById(id);
		ClinicalimpressionDao.delete(resource);
		ClinicalimpressionDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  ClinicalimpressionDao.openCurrentSession();
		ScrollableResults resources =  ClinicalimpressionDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Clinicalimpression.html")  			   
			   .setResource(ClinicalimpressionConversion.Clinicalimpressions((main.java.com.campfhir.model.Clinicalimpression) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  ClinicalimpressionDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Clinicalimpression> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  ClinicalimpressionDao.findAll();
		List<main.java.com.campfhir.model.Clinicalimpression> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Clinicalimpression) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 ClinicalimpressionDao.openCurrentSessionwithTransaction();
		 ClinicalimpressionDao.deleteAll();
		 ClinicalimpressionDao.closeCurrentSessionwithTransaction();
	}

	public ClinicalimpressionDao  ClinicalimpressionDao() 
	{
		return  ClinicalimpressionDao;
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

