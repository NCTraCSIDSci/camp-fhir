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
import main.java.com.campfhir.dao.MedicinalproductauthorizationDao;
import main.java.com.campfhir.service.conversion.MedicinalproductauthorizationConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Medicinalproductauthorization.
 * @see .Medicinalproductauthorization
 * @author Paul Kovach
 */

public class MedicinalproductauthorizationService {

	private static MedicinalproductauthorizationDao MedicinalproductauthorizationDao;
	private static MedicinalproductauthorizationConversion MedicinalproductauthorizationConversion;

	public MedicinalproductauthorizationService() 
	{
		MedicinalproductauthorizationDao = new MedicinalproductauthorizationDao();
		MedicinalproductauthorizationConversion = new MedicinalproductauthorizationConversion();
	}

	public void persist(main.java.com.campfhir.model.Medicinalproductauthorization entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicinalproductauthorizationDao.openCurrentSessionwithTransaction();
		 MedicinalproductauthorizationDao.persist(entity);
		 MedicinalproductauthorizationDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Medicinalproductauthorization entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicinalproductauthorizationDao.openCurrentSessionwithTransaction();
		 MedicinalproductauthorizationDao.update(entity);
		 MedicinalproductauthorizationDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Medicinalproductauthorization findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicinalproductauthorizationDao.openCurrentSession();
		main.java.com.campfhir.model.Medicinalproductauthorization resource = MedicinalproductauthorizationDao.findById(id);
		MedicinalproductauthorizationDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Medicinalproductauthorization> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicinalproductauthorizationDao.openCurrentSession();
		List<main.java.com.campfhir.model.Medicinalproductauthorization> resource =  MedicinalproductauthorizationDao.findByPatientId(id);
		MedicinalproductauthorizationDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicinalproductauthorizationDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Medicinalproductauthorization resource =  MedicinalproductauthorizationDao.findById(id);
		MedicinalproductauthorizationDao.delete(resource);
		MedicinalproductauthorizationDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  MedicinalproductauthorizationDao.openCurrentSession();
		ScrollableResults resources =  MedicinalproductauthorizationDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Medicinalproductauthorization.html")  			   
			   .setResource(MedicinalproductauthorizationConversion.Medicinalproductauthorizations((main.java.com.campfhir.model.Medicinalproductauthorization) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  MedicinalproductauthorizationDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Medicinalproductauthorization> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  MedicinalproductauthorizationDao.findAll();
		List<main.java.com.campfhir.model.Medicinalproductauthorization> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Medicinalproductauthorization) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicinalproductauthorizationDao.openCurrentSessionwithTransaction();
		 MedicinalproductauthorizationDao.deleteAll();
		 MedicinalproductauthorizationDao.closeCurrentSessionwithTransaction();
	}

	public MedicinalproductauthorizationDao  MedicinalproductauthorizationDao() 
	{
		return  MedicinalproductauthorizationDao;
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

