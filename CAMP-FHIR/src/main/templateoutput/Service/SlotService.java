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
import main.java.com.campfhir.dao.SlotDao;
import main.java.com.campfhir.service.conversion.SlotConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Slot.
 * @see .Slot
 * @author Paul Kovach
 */

public class SlotService {

	private static SlotDao SlotDao;
	private static SlotConversion SlotConversion;

	public SlotService() 
	{
		SlotDao = new SlotDao();
		SlotConversion = new SlotConversion();
	}

	public void persist(main.java.com.campfhir.model.Slot entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 SlotDao.openCurrentSessionwithTransaction();
		 SlotDao.persist(entity);
		 SlotDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Slot entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 SlotDao.openCurrentSessionwithTransaction();
		 SlotDao.update(entity);
		 SlotDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Slot findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SlotDao.openCurrentSession();
		main.java.com.campfhir.model.Slot resource = SlotDao.findById(id);
		SlotDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Slot> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SlotDao.openCurrentSession();
		List<main.java.com.campfhir.model.Slot> resource =  SlotDao.findByPatientId(id);
		SlotDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SlotDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Slot resource =  SlotDao.findById(id);
		SlotDao.delete(resource);
		SlotDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  SlotDao.openCurrentSession();
		ScrollableResults resources =  SlotDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Slot.html")  			   
			   .setResource(SlotConversion.Slots((main.java.com.campfhir.model.Slot) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  SlotDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Slot> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  SlotDao.findAll();
		List<main.java.com.campfhir.model.Slot> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Slot) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 SlotDao.openCurrentSessionwithTransaction();
		 SlotDao.deleteAll();
		 SlotDao.closeCurrentSessionwithTransaction();
	}

	public SlotDao  SlotDao() 
	{
		return  SlotDao;
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

