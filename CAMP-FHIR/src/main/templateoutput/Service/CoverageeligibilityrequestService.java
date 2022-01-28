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
import main.java.com.campfhir.dao.CoverageeligibilityrequestDao;
import main.java.com.campfhir.service.conversion.CoverageeligibilityrequestConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Coverageeligibilityrequest.
 * @see .Coverageeligibilityrequest
 * @author Paul Kovach
 */

public class CoverageeligibilityrequestService {

	private static CoverageeligibilityrequestDao CoverageeligibilityrequestDao;
	private static CoverageeligibilityrequestConversion CoverageeligibilityrequestConversion;

	public CoverageeligibilityrequestService() 
	{
		CoverageeligibilityrequestDao = new CoverageeligibilityrequestDao();
		CoverageeligibilityrequestConversion = new CoverageeligibilityrequestConversion();
	}

	public void persist(main.java.com.campfhir.model.Coverageeligibilityrequest entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 CoverageeligibilityrequestDao.openCurrentSessionwithTransaction();
		 CoverageeligibilityrequestDao.persist(entity);
		 CoverageeligibilityrequestDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Coverageeligibilityrequest entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 CoverageeligibilityrequestDao.openCurrentSessionwithTransaction();
		 CoverageeligibilityrequestDao.update(entity);
		 CoverageeligibilityrequestDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Coverageeligibilityrequest findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		CoverageeligibilityrequestDao.openCurrentSession();
		main.java.com.campfhir.model.Coverageeligibilityrequest resource = CoverageeligibilityrequestDao.findById(id);
		CoverageeligibilityrequestDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Coverageeligibilityrequest> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		CoverageeligibilityrequestDao.openCurrentSession();
		List<main.java.com.campfhir.model.Coverageeligibilityrequest> resource =  CoverageeligibilityrequestDao.findByPatientId(id);
		CoverageeligibilityrequestDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		CoverageeligibilityrequestDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Coverageeligibilityrequest resource =  CoverageeligibilityrequestDao.findById(id);
		CoverageeligibilityrequestDao.delete(resource);
		CoverageeligibilityrequestDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  CoverageeligibilityrequestDao.openCurrentSession();
		ScrollableResults resources =  CoverageeligibilityrequestDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Coverageeligibilityrequest.html")  			   
			   .setResource(CoverageeligibilityrequestConversion.Coverageeligibilityrequests((main.java.com.campfhir.model.Coverageeligibilityrequest) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  CoverageeligibilityrequestDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Coverageeligibilityrequest> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  CoverageeligibilityrequestDao.findAll();
		List<main.java.com.campfhir.model.Coverageeligibilityrequest> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Coverageeligibilityrequest) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 CoverageeligibilityrequestDao.openCurrentSessionwithTransaction();
		 CoverageeligibilityrequestDao.deleteAll();
		 CoverageeligibilityrequestDao.closeCurrentSessionwithTransaction();
	}

	public CoverageeligibilityrequestDao  CoverageeligibilityrequestDao() 
	{
		return  CoverageeligibilityrequestDao;
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

