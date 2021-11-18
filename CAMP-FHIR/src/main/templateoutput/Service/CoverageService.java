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
import main.java.com.campfhir.dao.CoverageDao;
import main.java.com.campfhir.service.conversion.CoverageConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Coverage.
 * @see .Coverage
 * @author Paul Kovach
 */

public class CoverageService {

	private static CoverageDao CoverageDao;
	private static CoverageConversion CoverageConversion;

	public CoverageService() 
	{
		CoverageDao = new CoverageDao();
		CoverageConversion = new CoverageConversion();
	}

	public void persist(main.java.com.campfhir.model.Coverage entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 CoverageDao.openCurrentSessionwithTransaction();
		 CoverageDao.persist(entity);
		 CoverageDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Coverage entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 CoverageDao.openCurrentSessionwithTransaction();
		 CoverageDao.update(entity);
		 CoverageDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Coverage findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		CoverageDao.openCurrentSession();
		main.java.com.campfhir.model.Coverage resource = CoverageDao.findById(id);
		CoverageDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Coverage> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		CoverageDao.openCurrentSession();
		List<main.java.com.campfhir.model.Coverage> resource =  CoverageDao.findByPatientId(id);
		CoverageDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		CoverageDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Coverage resource =  CoverageDao.findById(id);
		CoverageDao.delete(resource);
		CoverageDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  CoverageDao.openCurrentSession();
		ScrollableResults resources =  CoverageDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Coverage.html")  			   
			   .setResource(CoverageConversion.Coverages((main.java.com.campfhir.model.Coverage) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  CoverageDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Coverage> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  CoverageDao.findAll();
		List<main.java.com.campfhir.model.Coverage> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Coverage) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 CoverageDao.openCurrentSessionwithTransaction();
		 CoverageDao.deleteAll();
		 CoverageDao.closeCurrentSessionwithTransaction();
	}

	public CoverageDao  CoverageDao() 
	{
		return  CoverageDao;
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

