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
import main.java.com.campfhir.dao.OperationdefinitionDao;
import main.java.com.campfhir.service.conversion.OperationdefinitionConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Operationdefinition.
 * @see .Operationdefinition
 * @author Paul Kovach
 */

public class OperationdefinitionService {

	private static OperationdefinitionDao OperationdefinitionDao;
	private static OperationdefinitionConversion OperationdefinitionConversion;

	public OperationdefinitionService() 
	{
		OperationdefinitionDao = new OperationdefinitionDao();
		OperationdefinitionConversion = new OperationdefinitionConversion();
	}

	public void persist(main.java.com.campfhir.model.Operationdefinition entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 OperationdefinitionDao.openCurrentSessionwithTransaction();
		 OperationdefinitionDao.persist(entity);
		 OperationdefinitionDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Operationdefinition entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 OperationdefinitionDao.openCurrentSessionwithTransaction();
		 OperationdefinitionDao.update(entity);
		 OperationdefinitionDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Operationdefinition findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		OperationdefinitionDao.openCurrentSession();
		main.java.com.campfhir.model.Operationdefinition resource = OperationdefinitionDao.findById(id);
		OperationdefinitionDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Operationdefinition> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		OperationdefinitionDao.openCurrentSession();
		List<main.java.com.campfhir.model.Operationdefinition> resource =  OperationdefinitionDao.findByPatientId(id);
		OperationdefinitionDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		OperationdefinitionDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Operationdefinition resource =  OperationdefinitionDao.findById(id);
		OperationdefinitionDao.delete(resource);
		OperationdefinitionDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  OperationdefinitionDao.openCurrentSession();
		ScrollableResults resources =  OperationdefinitionDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Operationdefinition.html")  			   
			   .setResource(OperationdefinitionConversion.Operationdefinitions((main.java.com.campfhir.model.Operationdefinition) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  OperationdefinitionDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Operationdefinition> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  OperationdefinitionDao.findAll();
		List<main.java.com.campfhir.model.Operationdefinition> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Operationdefinition) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 OperationdefinitionDao.openCurrentSessionwithTransaction();
		 OperationdefinitionDao.deleteAll();
		 OperationdefinitionDao.closeCurrentSessionwithTransaction();
	}

	public OperationdefinitionDao  OperationdefinitionDao() 
	{
		return  OperationdefinitionDao;
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

