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
import main.java.com.campfhir.dao.LibraryDao;
import main.java.com.campfhir.service.conversion.LibraryConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Library.
 * @see .Library
 * @author Paul Kovach
 */

public class LibraryService {

	private static LibraryDao LibraryDao;
	private static LibraryConversion LibraryConversion;

	public LibraryService() 
	{
		LibraryDao = new LibraryDao();
		LibraryConversion = new LibraryConversion();
	}

	public void persist(main.java.com.campfhir.model.Library entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 LibraryDao.openCurrentSessionwithTransaction();
		 LibraryDao.persist(entity);
		 LibraryDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Library entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 LibraryDao.openCurrentSessionwithTransaction();
		 LibraryDao.update(entity);
		 LibraryDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Library findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		LibraryDao.openCurrentSession();
		main.java.com.campfhir.model.Library resource = LibraryDao.findById(id);
		LibraryDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Library> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		LibraryDao.openCurrentSession();
		List<main.java.com.campfhir.model.Library> resource =  LibraryDao.findByPatientId(id);
		LibraryDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		LibraryDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Library resource =  LibraryDao.findById(id);
		LibraryDao.delete(resource);
		LibraryDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  LibraryDao.openCurrentSession();
		ScrollableResults resources =  LibraryDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Library.html")  			   
			   .setResource(LibraryConversion.Librarys((main.java.com.campfhir.model.Library) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  LibraryDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Library> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  LibraryDao.findAll();
		List<main.java.com.campfhir.model.Library> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Library) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 LibraryDao.openCurrentSessionwithTransaction();
		 LibraryDao.deleteAll();
		 LibraryDao.closeCurrentSessionwithTransaction();
	}

	public LibraryDao  LibraryDao() 
	{
		return  LibraryDao;
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

