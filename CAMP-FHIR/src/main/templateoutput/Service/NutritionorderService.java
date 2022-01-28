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
import main.java.com.campfhir.dao.NutritionorderDao;
import main.java.com.campfhir.service.conversion.NutritionorderConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Nutritionorder.
 * @see .Nutritionorder
 * @author Paul Kovach
 */

public class NutritionorderService {

	private static NutritionorderDao NutritionorderDao;
	private static NutritionorderConversion NutritionorderConversion;

	public NutritionorderService() 
	{
		NutritionorderDao = new NutritionorderDao();
		NutritionorderConversion = new NutritionorderConversion();
	}

	public void persist(main.java.com.campfhir.model.Nutritionorder entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 NutritionorderDao.openCurrentSessionwithTransaction();
		 NutritionorderDao.persist(entity);
		 NutritionorderDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Nutritionorder entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 NutritionorderDao.openCurrentSessionwithTransaction();
		 NutritionorderDao.update(entity);
		 NutritionorderDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Nutritionorder findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		NutritionorderDao.openCurrentSession();
		main.java.com.campfhir.model.Nutritionorder resource = NutritionorderDao.findById(id);
		NutritionorderDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Nutritionorder> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		NutritionorderDao.openCurrentSession();
		List<main.java.com.campfhir.model.Nutritionorder> resource =  NutritionorderDao.findByPatientId(id);
		NutritionorderDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		NutritionorderDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Nutritionorder resource =  NutritionorderDao.findById(id);
		NutritionorderDao.delete(resource);
		NutritionorderDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  NutritionorderDao.openCurrentSession();
		ScrollableResults resources =  NutritionorderDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Nutritionorder.html")  			   
			   .setResource(NutritionorderConversion.Nutritionorders((main.java.com.campfhir.model.Nutritionorder) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  NutritionorderDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Nutritionorder> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  NutritionorderDao.findAll();
		List<main.java.com.campfhir.model.Nutritionorder> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Nutritionorder) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 NutritionorderDao.openCurrentSessionwithTransaction();
		 NutritionorderDao.deleteAll();
		 NutritionorderDao.closeCurrentSessionwithTransaction();
	}

	public NutritionorderDao  NutritionorderDao() 
	{
		return  NutritionorderDao;
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

