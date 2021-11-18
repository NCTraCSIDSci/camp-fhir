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
import main.java.com.campfhir.dao.ValuesetDao;
import main.java.com.campfhir.service.conversion.ValuesetConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Valueset.
 * @see .Valueset
 * @author Paul Kovach
 */

public class ValuesetService {

	private static ValuesetDao ValuesetDao;
	private static ValuesetConversion ValuesetConversion;

	public ValuesetService() 
	{
		ValuesetDao = new ValuesetDao();
		ValuesetConversion = new ValuesetConversion();
	}

	public void persist(main.java.com.campfhir.model.Valueset entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ValuesetDao.openCurrentSessionwithTransaction();
		 ValuesetDao.persist(entity);
		 ValuesetDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Valueset entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ValuesetDao.openCurrentSessionwithTransaction();
		 ValuesetDao.update(entity);
		 ValuesetDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Valueset findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ValuesetDao.openCurrentSession();
		main.java.com.campfhir.model.Valueset resource = ValuesetDao.findById(id);
		ValuesetDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Valueset> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ValuesetDao.openCurrentSession();
		List<main.java.com.campfhir.model.Valueset> resource =  ValuesetDao.findByPatientId(id);
		ValuesetDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ValuesetDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Valueset resource =  ValuesetDao.findById(id);
		ValuesetDao.delete(resource);
		ValuesetDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  ValuesetDao.openCurrentSession();
		ScrollableResults resources =  ValuesetDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Valueset.html")  			   
			   .setResource(ValuesetConversion.Valuesets((main.java.com.campfhir.model.Valueset) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  ValuesetDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Valueset> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  ValuesetDao.findAll();
		List<main.java.com.campfhir.model.Valueset> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Valueset) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 ValuesetDao.openCurrentSessionwithTransaction();
		 ValuesetDao.deleteAll();
		 ValuesetDao.closeCurrentSessionwithTransaction();
	}

	public ValuesetDao  ValuesetDao() 
	{
		return  ValuesetDao;
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

