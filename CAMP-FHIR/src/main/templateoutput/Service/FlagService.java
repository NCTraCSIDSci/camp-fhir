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
import main.java.com.campfhir.dao.FlagDao;
import main.java.com.campfhir.service.conversion.FlagConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Flag.
 * @see .Flag
 * @author Paul Kovach
 */

public class FlagService {

	private static FlagDao FlagDao;
	private static FlagConversion FlagConversion;

	public FlagService() 
	{
		FlagDao = new FlagDao();
		FlagConversion = new FlagConversion();
	}

	public void persist(main.java.com.campfhir.model.Flag entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 FlagDao.openCurrentSessionwithTransaction();
		 FlagDao.persist(entity);
		 FlagDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Flag entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 FlagDao.openCurrentSessionwithTransaction();
		 FlagDao.update(entity);
		 FlagDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Flag findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		FlagDao.openCurrentSession();
		main.java.com.campfhir.model.Flag resource = FlagDao.findById(id);
		FlagDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Flag> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		FlagDao.openCurrentSession();
		List<main.java.com.campfhir.model.Flag> resource =  FlagDao.findByPatientId(id);
		FlagDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		FlagDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Flag resource =  FlagDao.findById(id);
		FlagDao.delete(resource);
		FlagDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  FlagDao.openCurrentSession();
		ScrollableResults resources =  FlagDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Flag.html")  			   
			   .setResource(FlagConversion.Flags((main.java.com.campfhir.model.Flag) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  FlagDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Flag> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  FlagDao.findAll();
		List<main.java.com.campfhir.model.Flag> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Flag) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 FlagDao.openCurrentSessionwithTransaction();
		 FlagDao.deleteAll();
		 FlagDao.closeCurrentSessionwithTransaction();
	}

	public FlagDao  FlagDao() 
	{
		return  FlagDao;
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

