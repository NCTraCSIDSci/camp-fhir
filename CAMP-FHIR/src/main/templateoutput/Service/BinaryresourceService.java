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
import main.java.com.campfhir.dao.BinaryresourceDao;
import main.java.com.campfhir.service.conversion.BinaryresourceConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Binaryresource.
 * @see .Binaryresource
 * @author Paul Kovach
 */

public class BinaryresourceService {

	private static BinaryresourceDao BinaryresourceDao;
	private static BinaryresourceConversion BinaryresourceConversion;

	public BinaryresourceService() 
	{
		BinaryresourceDao = new BinaryresourceDao();
		BinaryresourceConversion = new BinaryresourceConversion();
	}

	public void persist(main.java.com.campfhir.model.Binaryresource entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 BinaryresourceDao.openCurrentSessionwithTransaction();
		 BinaryresourceDao.persist(entity);
		 BinaryresourceDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Binaryresource entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 BinaryresourceDao.openCurrentSessionwithTransaction();
		 BinaryresourceDao.update(entity);
		 BinaryresourceDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Binaryresource findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		BinaryresourceDao.openCurrentSession();
		main.java.com.campfhir.model.Binaryresource resource = BinaryresourceDao.findById(id);
		BinaryresourceDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Binaryresource> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		BinaryresourceDao.openCurrentSession();
		List<main.java.com.campfhir.model.Binaryresource> resource =  BinaryresourceDao.findByPatientId(id);
		BinaryresourceDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		BinaryresourceDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Binaryresource resource =  BinaryresourceDao.findById(id);
		BinaryresourceDao.delete(resource);
		BinaryresourceDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  BinaryresourceDao.openCurrentSession();
		ScrollableResults resources =  BinaryresourceDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Binaryresource.html")  			   
			   .setResource(BinaryresourceConversion.Binaryresources((main.java.com.campfhir.model.Binaryresource) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  BinaryresourceDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Binaryresource> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  BinaryresourceDao.findAll();
		List<main.java.com.campfhir.model.Binaryresource> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Binaryresource) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 BinaryresourceDao.openCurrentSessionwithTransaction();
		 BinaryresourceDao.deleteAll();
		 BinaryresourceDao.closeCurrentSessionwithTransaction();
	}

	public BinaryresourceDao  BinaryresourceDao() 
	{
		return  BinaryresourceDao;
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

