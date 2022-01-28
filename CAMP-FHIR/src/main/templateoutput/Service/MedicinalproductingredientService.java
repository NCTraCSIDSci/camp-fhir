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
import main.java.com.campfhir.dao.MedicinalproductingredientDao;
import main.java.com.campfhir.service.conversion.MedicinalproductingredientConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Medicinalproductingredient.
 * @see .Medicinalproductingredient
 * @author Paul Kovach
 */

public class MedicinalproductingredientService {

	private static MedicinalproductingredientDao MedicinalproductingredientDao;
	private static MedicinalproductingredientConversion MedicinalproductingredientConversion;

	public MedicinalproductingredientService() 
	{
		MedicinalproductingredientDao = new MedicinalproductingredientDao();
		MedicinalproductingredientConversion = new MedicinalproductingredientConversion();
	}

	public void persist(main.java.com.campfhir.model.Medicinalproductingredient entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicinalproductingredientDao.openCurrentSessionwithTransaction();
		 MedicinalproductingredientDao.persist(entity);
		 MedicinalproductingredientDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Medicinalproductingredient entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicinalproductingredientDao.openCurrentSessionwithTransaction();
		 MedicinalproductingredientDao.update(entity);
		 MedicinalproductingredientDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Medicinalproductingredient findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicinalproductingredientDao.openCurrentSession();
		main.java.com.campfhir.model.Medicinalproductingredient resource = MedicinalproductingredientDao.findById(id);
		MedicinalproductingredientDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Medicinalproductingredient> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicinalproductingredientDao.openCurrentSession();
		List<main.java.com.campfhir.model.Medicinalproductingredient> resource =  MedicinalproductingredientDao.findByPatientId(id);
		MedicinalproductingredientDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicinalproductingredientDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Medicinalproductingredient resource =  MedicinalproductingredientDao.findById(id);
		MedicinalproductingredientDao.delete(resource);
		MedicinalproductingredientDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  MedicinalproductingredientDao.openCurrentSession();
		ScrollableResults resources =  MedicinalproductingredientDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Medicinalproductingredient.html")  			   
			   .setResource(MedicinalproductingredientConversion.Medicinalproductingredients((main.java.com.campfhir.model.Medicinalproductingredient) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  MedicinalproductingredientDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Medicinalproductingredient> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  MedicinalproductingredientDao.findAll();
		List<main.java.com.campfhir.model.Medicinalproductingredient> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Medicinalproductingredient) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicinalproductingredientDao.openCurrentSessionwithTransaction();
		 MedicinalproductingredientDao.deleteAll();
		 MedicinalproductingredientDao.closeCurrentSessionwithTransaction();
	}

	public MedicinalproductingredientDao  MedicinalproductingredientDao() 
	{
		return  MedicinalproductingredientDao;
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

