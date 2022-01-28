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
import main.java.com.campfhir.dao.TestscriptDao;
import main.java.com.campfhir.service.conversion.TestscriptConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Testscript.
 * @see .Testscript
 * @author Paul Kovach
 */

public class TestscriptService {

	private static TestscriptDao TestscriptDao;
	private static TestscriptConversion TestscriptConversion;

	public TestscriptService() 
	{
		TestscriptDao = new TestscriptDao();
		TestscriptConversion = new TestscriptConversion();
	}

	public void persist(main.java.com.campfhir.model.Testscript entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 TestscriptDao.openCurrentSessionwithTransaction();
		 TestscriptDao.persist(entity);
		 TestscriptDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Testscript entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 TestscriptDao.openCurrentSessionwithTransaction();
		 TestscriptDao.update(entity);
		 TestscriptDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Testscript findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		TestscriptDao.openCurrentSession();
		main.java.com.campfhir.model.Testscript resource = TestscriptDao.findById(id);
		TestscriptDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Testscript> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		TestscriptDao.openCurrentSession();
		List<main.java.com.campfhir.model.Testscript> resource =  TestscriptDao.findByPatientId(id);
		TestscriptDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		TestscriptDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Testscript resource =  TestscriptDao.findById(id);
		TestscriptDao.delete(resource);
		TestscriptDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  TestscriptDao.openCurrentSession();
		ScrollableResults resources =  TestscriptDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Testscript.html")  			   
			   .setResource(TestscriptConversion.Testscripts((main.java.com.campfhir.model.Testscript) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  TestscriptDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Testscript> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  TestscriptDao.findAll();
		List<main.java.com.campfhir.model.Testscript> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Testscript) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 TestscriptDao.openCurrentSessionwithTransaction();
		 TestscriptDao.deleteAll();
		 TestscriptDao.closeCurrentSessionwithTransaction();
	}

	public TestscriptDao  TestscriptDao() 
	{
		return  TestscriptDao;
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

