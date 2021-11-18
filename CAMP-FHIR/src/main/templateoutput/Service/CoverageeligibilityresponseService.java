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
import main.java.com.campfhir.dao.CoverageeligibilityresponseDao;
import main.java.com.campfhir.service.conversion.CoverageeligibilityresponseConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Coverageeligibilityresponse.
 * @see .Coverageeligibilityresponse
 * @author Paul Kovach
 */

public class CoverageeligibilityresponseService {

	private static CoverageeligibilityresponseDao CoverageeligibilityresponseDao;
	private static CoverageeligibilityresponseConversion CoverageeligibilityresponseConversion;

	public CoverageeligibilityresponseService() 
	{
		CoverageeligibilityresponseDao = new CoverageeligibilityresponseDao();
		CoverageeligibilityresponseConversion = new CoverageeligibilityresponseConversion();
	}

	public void persist(main.java.com.campfhir.model.Coverageeligibilityresponse entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 CoverageeligibilityresponseDao.openCurrentSessionwithTransaction();
		 CoverageeligibilityresponseDao.persist(entity);
		 CoverageeligibilityresponseDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Coverageeligibilityresponse entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 CoverageeligibilityresponseDao.openCurrentSessionwithTransaction();
		 CoverageeligibilityresponseDao.update(entity);
		 CoverageeligibilityresponseDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Coverageeligibilityresponse findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		CoverageeligibilityresponseDao.openCurrentSession();
		main.java.com.campfhir.model.Coverageeligibilityresponse resource = CoverageeligibilityresponseDao.findById(id);
		CoverageeligibilityresponseDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Coverageeligibilityresponse> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		CoverageeligibilityresponseDao.openCurrentSession();
		List<main.java.com.campfhir.model.Coverageeligibilityresponse> resource =  CoverageeligibilityresponseDao.findByPatientId(id);
		CoverageeligibilityresponseDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		CoverageeligibilityresponseDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Coverageeligibilityresponse resource =  CoverageeligibilityresponseDao.findById(id);
		CoverageeligibilityresponseDao.delete(resource);
		CoverageeligibilityresponseDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  CoverageeligibilityresponseDao.openCurrentSession();
		ScrollableResults resources =  CoverageeligibilityresponseDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Coverageeligibilityresponse.html")  			   
			   .setResource(CoverageeligibilityresponseConversion.Coverageeligibilityresponses((main.java.com.campfhir.model.Coverageeligibilityresponse) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  CoverageeligibilityresponseDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Coverageeligibilityresponse> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  CoverageeligibilityresponseDao.findAll();
		List<main.java.com.campfhir.model.Coverageeligibilityresponse> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Coverageeligibilityresponse) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 CoverageeligibilityresponseDao.openCurrentSessionwithTransaction();
		 CoverageeligibilityresponseDao.deleteAll();
		 CoverageeligibilityresponseDao.closeCurrentSessionwithTransaction();
	}

	public CoverageeligibilityresponseDao  CoverageeligibilityresponseDao() 
	{
		return  CoverageeligibilityresponseDao;
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

