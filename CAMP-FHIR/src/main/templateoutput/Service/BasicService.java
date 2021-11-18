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
import main.java.com.campfhir.dao.BasicDao;
import main.java.com.campfhir.service.conversion.BasicConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Basic.
 * @see .Basic
 * @author Paul Kovach
 */

public class BasicService {

	private static BasicDao BasicDao;
	private static BasicConversion BasicConversion;

	public BasicService() 
	{
		BasicDao = new BasicDao();
		BasicConversion = new BasicConversion();
	}

	public void persist(main.java.com.campfhir.model.Basic entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 BasicDao.openCurrentSessionwithTransaction();
		 BasicDao.persist(entity);
		 BasicDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Basic entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 BasicDao.openCurrentSessionwithTransaction();
		 BasicDao.update(entity);
		 BasicDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Basic findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		BasicDao.openCurrentSession();
		main.java.com.campfhir.model.Basic resource = BasicDao.findById(id);
		BasicDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Basic> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		BasicDao.openCurrentSession();
		List<main.java.com.campfhir.model.Basic> resource =  BasicDao.findByPatientId(id);
		BasicDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		BasicDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Basic resource =  BasicDao.findById(id);
		BasicDao.delete(resource);
		BasicDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  BasicDao.openCurrentSession();
		ScrollableResults resources =  BasicDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Basic.html")  			   
			   .setResource(BasicConversion.Basics((main.java.com.campfhir.model.Basic) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  BasicDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Basic> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  BasicDao.findAll();
		List<main.java.com.campfhir.model.Basic> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Basic) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 BasicDao.openCurrentSessionwithTransaction();
		 BasicDao.deleteAll();
		 BasicDao.closeCurrentSessionwithTransaction();
	}

	public BasicDao  BasicDao() 
	{
		return  BasicDao;
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

