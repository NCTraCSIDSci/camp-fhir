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
import main.java.com.campfhir.dao.MedicationadministrationDao;
import main.java.com.campfhir.service.conversion.MedicationadministrationConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Medicationadministration.
 * @see .Medicationadministration
 * @author Paul Kovach
 */

public class MedicationadministrationService {

	private static MedicationadministrationDao MedicationadministrationDao;
	private static MedicationadministrationConversion MedicationadministrationConversion;

	public MedicationadministrationService() 
	{
		MedicationadministrationDao = new MedicationadministrationDao();
		MedicationadministrationConversion = new MedicationadministrationConversion();
	}

	public void persist(main.java.com.campfhir.model.Medicationadministration entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicationadministrationDao.openCurrentSessionwithTransaction();
		 MedicationadministrationDao.persist(entity);
		 MedicationadministrationDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Medicationadministration entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicationadministrationDao.openCurrentSessionwithTransaction();
		 MedicationadministrationDao.update(entity);
		 MedicationadministrationDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Medicationadministration findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicationadministrationDao.openCurrentSession();
		main.java.com.campfhir.model.Medicationadministration resource = MedicationadministrationDao.findById(id);
		MedicationadministrationDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Medicationadministration> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicationadministrationDao.openCurrentSession();
		List<main.java.com.campfhir.model.Medicationadministration> resource =  MedicationadministrationDao.findByPatientId(id);
		MedicationadministrationDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicationadministrationDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Medicationadministration resource =  MedicationadministrationDao.findById(id);
		MedicationadministrationDao.delete(resource);
		MedicationadministrationDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  MedicationadministrationDao.openCurrentSession();
		ScrollableResults resources =  MedicationadministrationDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Medicationadministration.html")  			   
			   .setResource(MedicationadministrationConversion.Medicationadministrations((main.java.com.campfhir.model.Medicationadministration) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  MedicationadministrationDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Medicationadministration> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  MedicationadministrationDao.findAll();
		List<main.java.com.campfhir.model.Medicationadministration> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Medicationadministration) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicationadministrationDao.openCurrentSessionwithTransaction();
		 MedicationadministrationDao.deleteAll();
		 MedicationadministrationDao.closeCurrentSessionwithTransaction();
	}

	public MedicationadministrationDao  MedicationadministrationDao() 
	{
		return  MedicationadministrationDao;
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

