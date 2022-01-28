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
import main.java.com.campfhir.dao.MedicationdispenseDao;
import main.java.com.campfhir.service.conversion.MedicationdispenseConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Medicationdispense.
 * @see .Medicationdispense
 * @author Paul Kovach
 */

public class MedicationdispenseService {

	private static MedicationdispenseDao MedicationdispenseDao;
	private static MedicationdispenseConversion MedicationdispenseConversion;

	public MedicationdispenseService() 
	{
		MedicationdispenseDao = new MedicationdispenseDao();
		MedicationdispenseConversion = new MedicationdispenseConversion();
	}

	public void persist(main.java.com.campfhir.model.Medicationdispense entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicationdispenseDao.openCurrentSessionwithTransaction();
		 MedicationdispenseDao.persist(entity);
		 MedicationdispenseDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Medicationdispense entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicationdispenseDao.openCurrentSessionwithTransaction();
		 MedicationdispenseDao.update(entity);
		 MedicationdispenseDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Medicationdispense findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicationdispenseDao.openCurrentSession();
		main.java.com.campfhir.model.Medicationdispense resource = MedicationdispenseDao.findById(id);
		MedicationdispenseDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Medicationdispense> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicationdispenseDao.openCurrentSession();
		List<main.java.com.campfhir.model.Medicationdispense> resource =  MedicationdispenseDao.findByPatientId(id);
		MedicationdispenseDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicationdispenseDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Medicationdispense resource =  MedicationdispenseDao.findById(id);
		MedicationdispenseDao.delete(resource);
		MedicationdispenseDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  MedicationdispenseDao.openCurrentSession();
		ScrollableResults resources =  MedicationdispenseDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Medicationdispense.html")  			   
			   .setResource(MedicationdispenseConversion.Medicationdispenses((main.java.com.campfhir.model.Medicationdispense) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  MedicationdispenseDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Medicationdispense> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  MedicationdispenseDao.findAll();
		List<main.java.com.campfhir.model.Medicationdispense> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Medicationdispense) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicationdispenseDao.openCurrentSessionwithTransaction();
		 MedicationdispenseDao.deleteAll();
		 MedicationdispenseDao.closeCurrentSessionwithTransaction();
	}

	public MedicationdispenseDao  MedicationdispenseDao() 
	{
		return  MedicationdispenseDao;
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

