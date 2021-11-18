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
import main.java.com.campfhir.dao.BundleDao;
import main.java.com.campfhir.service.conversion.BundleConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Bundle.
 * @see .Bundle
 * @author Paul Kovach
 */

public class BundleService {

	private static BundleDao BundleDao;
	private static BundleConversion BundleConversion;

	public BundleService() 
	{
		BundleDao = new BundleDao();
		BundleConversion = new BundleConversion();
	}

	public void persist(main.java.com.campfhir.model.Bundle entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 BundleDao.openCurrentSessionwithTransaction();
		 BundleDao.persist(entity);
		 BundleDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Bundle entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 BundleDao.openCurrentSessionwithTransaction();
		 BundleDao.update(entity);
		 BundleDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Bundle findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		BundleDao.openCurrentSession();
		main.java.com.campfhir.model.Bundle resource = BundleDao.findById(id);
		BundleDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Bundle> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		BundleDao.openCurrentSession();
		List<main.java.com.campfhir.model.Bundle> resource =  BundleDao.findByPatientId(id);
		BundleDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		BundleDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Bundle resource =  BundleDao.findById(id);
		BundleDao.delete(resource);
		BundleDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  BundleDao.openCurrentSession();
		ScrollableResults resources =  BundleDao.findAll();
		
	     int i = 0;
	     System.out.println("start");
	     org.hl7.fhir.r4.model.Bundle bundle = new org.hl7.fhir.r4.model.Bundle().setType(BundleType.COLLECTION);
	     

	     while ( resources.next() ) 
	     {	
			if ((i % partition) == 0)
			{
				session.clear();
				
		    	writeFile(path, i, bundle);
			    bundle = new org.hl7.fhir.r4.model.Bundle().setType(BundleType.COLLECTION);
			}
			
			i++;
			
			bundle.addEntry()
			   .setFullUrl("https://www.hl7.org/fhir/Bundle.html")  			   
			   .setResource(BundleConversion.Bundles((main.java.com.campfhir.model.Bundle) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  BundleDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Bundle> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  BundleDao.findAll();
		List<main.java.com.campfhir.model.Bundle> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Bundle) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 BundleDao.openCurrentSessionwithTransaction();
		 BundleDao.deleteAll();
		 BundleDao.closeCurrentSessionwithTransaction();
	}

	public BundleDao  BundleDao() 
	{
		return  BundleDao;
	}
	
	public static void writeFile(String path, int domain, org.hl7.fhir.r4.model.Bundle bundle)
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

