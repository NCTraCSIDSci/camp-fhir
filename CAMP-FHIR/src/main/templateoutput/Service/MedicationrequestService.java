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
import main.java.com.campfhir.dao.MedicationrequestDao;
import main.java.com.campfhir.service.conversion.MedicationrequestConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Medicationrequest.
 * @see .Medicationrequest
 * @author Paul Kovach
 */

public class MedicationrequestService {

	private static MedicationrequestDao MedicationrequestDao;
	private static MedicationrequestConversion MedicationrequestConversion;

	public MedicationrequestService() 
	{
		MedicationrequestDao = new MedicationrequestDao();
		MedicationrequestConversion = new MedicationrequestConversion();
	}

	public void persist(main.java.com.campfhir.model.Medicationrequest entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicationrequestDao.openCurrentSessionwithTransaction();
		 MedicationrequestDao.persist(entity);
		 MedicationrequestDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Medicationrequest entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicationrequestDao.openCurrentSessionwithTransaction();
		 MedicationrequestDao.update(entity);
		 MedicationrequestDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Medicationrequest findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicationrequestDao.openCurrentSession();
		main.java.com.campfhir.model.Medicationrequest resource = MedicationrequestDao.findById(id);
		MedicationrequestDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Medicationrequest> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicationrequestDao.openCurrentSession();
		List<main.java.com.campfhir.model.Medicationrequest> resource =  MedicationrequestDao.findByPatientId(id);
		MedicationrequestDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicationrequestDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Medicationrequest resource =  MedicationrequestDao.findById(id);
		MedicationrequestDao.delete(resource);
		MedicationrequestDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  MedicationrequestDao.openCurrentSession();
		ScrollableResults resources =  MedicationrequestDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Medicationrequest.html")  			   
			   .setResource(MedicationrequestConversion.Medicationrequests((main.java.com.campfhir.model.Medicationrequest) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  MedicationrequestDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Medicationrequest> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  MedicationrequestDao.findAll();
		List<main.java.com.campfhir.model.Medicationrequest> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Medicationrequest) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicationrequestDao.openCurrentSessionwithTransaction();
		 MedicationrequestDao.deleteAll();
		 MedicationrequestDao.closeCurrentSessionwithTransaction();
	}

	public MedicationrequestDao  MedicationrequestDao() 
	{
		return  MedicationrequestDao;
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

