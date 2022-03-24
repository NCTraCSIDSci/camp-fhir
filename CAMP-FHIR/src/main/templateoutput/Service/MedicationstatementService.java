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
import main.java.com.campfhir.dao.MedicationstatementDao;
import main.java.com.campfhir.service.conversion.MedicationstatementConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Medicationstatement.
 * @see .Medicationstatement
 * @author Paul Kovach
 */

public class MedicationstatementService {

	private static MedicationstatementDao MedicationstatementDao;
	private static MedicationstatementConversion MedicationstatementConversion;

	public MedicationstatementService() 
	{
		MedicationstatementDao = new MedicationstatementDao();
		MedicationstatementConversion = new MedicationstatementConversion();
	}

	public void persist(main.java.com.campfhir.model.Medicationstatement entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicationstatementDao.openCurrentSessionwithTransaction();
		 MedicationstatementDao.persist(entity);
		 MedicationstatementDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Medicationstatement entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicationstatementDao.openCurrentSessionwithTransaction();
		 MedicationstatementDao.update(entity);
		 MedicationstatementDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Medicationstatement findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicationstatementDao.openCurrentSession();
		main.java.com.campfhir.model.Medicationstatement resource = MedicationstatementDao.findById(id);
		MedicationstatementDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Medicationstatement> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicationstatementDao.openCurrentSession();
		List<main.java.com.campfhir.model.Medicationstatement> resource =  MedicationstatementDao.findByPatientId(id);
		MedicationstatementDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicationstatementDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Medicationstatement resource =  MedicationstatementDao.findById(id);
		MedicationstatementDao.delete(resource);
		MedicationstatementDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  MedicationstatementDao.openCurrentSession();
		ScrollableResults resources =  MedicationstatementDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Medicationstatement.html")  			   
			   .setResource(MedicationstatementConversion.Medicationstatements((main.java.com.campfhir.model.Medicationstatement) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  MedicationstatementDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Medicationstatement> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  MedicationstatementDao.findAll();
		List<main.java.com.campfhir.model.Medicationstatement> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Medicationstatement) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicationstatementDao.openCurrentSessionwithTransaction();
		 MedicationstatementDao.deleteAll();
		 MedicationstatementDao.closeCurrentSessionwithTransaction();
	}

	public MedicationstatementDao  MedicationstatementDao() 
	{
		return  MedicationstatementDao;
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
