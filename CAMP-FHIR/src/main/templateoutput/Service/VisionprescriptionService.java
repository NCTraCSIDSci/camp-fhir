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
import main.java.com.campfhir.dao.VisionprescriptionDao;
import main.java.com.campfhir.service.conversion.VisionprescriptionConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Visionprescription.
 * @see .Visionprescription
 * @author Paul Kovach
 */

public class VisionprescriptionService {

	private static VisionprescriptionDao VisionprescriptionDao;
	private static VisionprescriptionConversion VisionprescriptionConversion;

	public VisionprescriptionService() 
	{
		VisionprescriptionDao = new VisionprescriptionDao();
		VisionprescriptionConversion = new VisionprescriptionConversion();
	}

	public void persist(main.java.com.campfhir.model.Visionprescription entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 VisionprescriptionDao.openCurrentSessionwithTransaction();
		 VisionprescriptionDao.persist(entity);
		 VisionprescriptionDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Visionprescription entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 VisionprescriptionDao.openCurrentSessionwithTransaction();
		 VisionprescriptionDao.update(entity);
		 VisionprescriptionDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Visionprescription findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		VisionprescriptionDao.openCurrentSession();
		main.java.com.campfhir.model.Visionprescription resource = VisionprescriptionDao.findById(id);
		VisionprescriptionDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Visionprescription> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		VisionprescriptionDao.openCurrentSession();
		List<main.java.com.campfhir.model.Visionprescription> resource =  VisionprescriptionDao.findByPatientId(id);
		VisionprescriptionDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		VisionprescriptionDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Visionprescription resource =  VisionprescriptionDao.findById(id);
		VisionprescriptionDao.delete(resource);
		VisionprescriptionDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  VisionprescriptionDao.openCurrentSession();
		ScrollableResults resources =  VisionprescriptionDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Visionprescription.html")  			   
			   .setResource(VisionprescriptionConversion.Visionprescriptions((main.java.com.campfhir.model.Visionprescription) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  VisionprescriptionDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Visionprescription> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  VisionprescriptionDao.findAll();
		List<main.java.com.campfhir.model.Visionprescription> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Visionprescription) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 VisionprescriptionDao.openCurrentSessionwithTransaction();
		 VisionprescriptionDao.deleteAll();
		 VisionprescriptionDao.closeCurrentSessionwithTransaction();
	}

	public VisionprescriptionDao  VisionprescriptionDao() 
	{
		return  VisionprescriptionDao;
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

