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
import main.java.com.campfhir.dao.MedicinalproductmanufacturedDao;
import main.java.com.campfhir.service.conversion.MedicinalproductmanufacturedConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Medicinalproductmanufactured.
 * @see .Medicinalproductmanufactured
 * @author Paul Kovach
 */

public class MedicinalproductmanufacturedService {

	private static MedicinalproductmanufacturedDao MedicinalproductmanufacturedDao;
	private static MedicinalproductmanufacturedConversion MedicinalproductmanufacturedConversion;

	public MedicinalproductmanufacturedService() 
	{
		MedicinalproductmanufacturedDao = new MedicinalproductmanufacturedDao();
		MedicinalproductmanufacturedConversion = new MedicinalproductmanufacturedConversion();
	}

	public void persist(main.java.com.campfhir.model.Medicinalproductmanufactured entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicinalproductmanufacturedDao.openCurrentSessionwithTransaction();
		 MedicinalproductmanufacturedDao.persist(entity);
		 MedicinalproductmanufacturedDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Medicinalproductmanufactured entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicinalproductmanufacturedDao.openCurrentSessionwithTransaction();
		 MedicinalproductmanufacturedDao.update(entity);
		 MedicinalproductmanufacturedDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Medicinalproductmanufactured findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicinalproductmanufacturedDao.openCurrentSession();
		main.java.com.campfhir.model.Medicinalproductmanufactured resource = MedicinalproductmanufacturedDao.findById(id);
		MedicinalproductmanufacturedDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Medicinalproductmanufactured> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicinalproductmanufacturedDao.openCurrentSession();
		List<main.java.com.campfhir.model.Medicinalproductmanufactured> resource =  MedicinalproductmanufacturedDao.findByPatientId(id);
		MedicinalproductmanufacturedDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicinalproductmanufacturedDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Medicinalproductmanufactured resource =  MedicinalproductmanufacturedDao.findById(id);
		MedicinalproductmanufacturedDao.delete(resource);
		MedicinalproductmanufacturedDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  MedicinalproductmanufacturedDao.openCurrentSession();
		ScrollableResults resources =  MedicinalproductmanufacturedDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Medicinalproductmanufactured.html")  			   
			   .setResource(MedicinalproductmanufacturedConversion.Medicinalproductmanufactureds((main.java.com.campfhir.model.Medicinalproductmanufactured) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  MedicinalproductmanufacturedDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Medicinalproductmanufactured> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  MedicinalproductmanufacturedDao.findAll();
		List<main.java.com.campfhir.model.Medicinalproductmanufactured> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Medicinalproductmanufactured) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicinalproductmanufacturedDao.openCurrentSessionwithTransaction();
		 MedicinalproductmanufacturedDao.deleteAll();
		 MedicinalproductmanufacturedDao.closeCurrentSessionwithTransaction();
	}

	public MedicinalproductmanufacturedDao  MedicinalproductmanufacturedDao() 
	{
		return  MedicinalproductmanufacturedDao;
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

