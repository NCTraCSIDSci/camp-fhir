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
import main.java.com.campfhir.dao.LinkageDao;
import main.java.com.campfhir.service.conversion.LinkageConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Linkage.
 * @see .Linkage
 * @author Paul Kovach
 */

public class LinkageService {

	private static LinkageDao LinkageDao;
	private static LinkageConversion LinkageConversion;

	public LinkageService() 
	{
		LinkageDao = new LinkageDao();
		LinkageConversion = new LinkageConversion();
	}

	public void persist(main.java.com.campfhir.model.Linkage entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 LinkageDao.openCurrentSessionwithTransaction();
		 LinkageDao.persist(entity);
		 LinkageDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Linkage entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 LinkageDao.openCurrentSessionwithTransaction();
		 LinkageDao.update(entity);
		 LinkageDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Linkage findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		LinkageDao.openCurrentSession();
		main.java.com.campfhir.model.Linkage resource = LinkageDao.findById(id);
		LinkageDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Linkage> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		LinkageDao.openCurrentSession();
		List<main.java.com.campfhir.model.Linkage> resource =  LinkageDao.findByPatientId(id);
		LinkageDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		LinkageDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Linkage resource =  LinkageDao.findById(id);
		LinkageDao.delete(resource);
		LinkageDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  LinkageDao.openCurrentSession();
		ScrollableResults resources =  LinkageDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Linkage.html")  			   
			   .setResource(LinkageConversion.Linkages((main.java.com.campfhir.model.Linkage) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  LinkageDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Linkage> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  LinkageDao.findAll();
		List<main.java.com.campfhir.model.Linkage> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Linkage) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 LinkageDao.openCurrentSessionwithTransaction();
		 LinkageDao.deleteAll();
		 LinkageDao.closeCurrentSessionwithTransaction();
	}

	public LinkageDao  LinkageDao() 
	{
		return  LinkageDao;
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

