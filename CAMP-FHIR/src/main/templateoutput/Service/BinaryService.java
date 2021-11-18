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
import main.java.com.campfhir.dao.BinaryDao;
import main.java.com.campfhir.service.conversion.BinaryConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Binary.
 * @see .Binary
 * @author Paul Kovach
 */

public class BinaryService {

	private static BinaryDao BinaryDao;
	private static BinaryConversion BinaryConversion;

	public BinaryService() 
	{
		BinaryDao = new BinaryDao();
		BinaryConversion = new BinaryConversion();
	}

	public void persist(main.java.com.campfhir.model.Binary entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 BinaryDao.openCurrentSessionwithTransaction();
		 BinaryDao.persist(entity);
		 BinaryDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Binary entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 BinaryDao.openCurrentSessionwithTransaction();
		 BinaryDao.update(entity);
		 BinaryDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Binary findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		BinaryDao.openCurrentSession();
		main.java.com.campfhir.model.Binary resource = BinaryDao.findById(id);
		BinaryDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Binary> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		BinaryDao.openCurrentSession();
		List<main.java.com.campfhir.model.Binary> resource =  BinaryDao.findByPatientId(id);
		BinaryDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		BinaryDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Binary resource =  BinaryDao.findById(id);
		BinaryDao.delete(resource);
		BinaryDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  BinaryDao.openCurrentSession();
		ScrollableResults resources =  BinaryDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Binary.html")  			   
			   .setResource(BinaryConversion.Binarys((main.java.com.campfhir.model.Binary) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  BinaryDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Binary> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  BinaryDao.findAll();
		List<main.java.com.campfhir.model.Binary> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Binary) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 BinaryDao.openCurrentSessionwithTransaction();
		 BinaryDao.deleteAll();
		 BinaryDao.closeCurrentSessionwithTransaction();
	}

	public BinaryDao  BinaryDao() 
	{
		return  BinaryDao;
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

