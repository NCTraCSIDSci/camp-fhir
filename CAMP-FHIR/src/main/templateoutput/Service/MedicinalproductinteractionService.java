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
import main.java.com.campfhir.dao.MedicinalproductinteractionDao;
import main.java.com.campfhir.service.conversion.MedicinalproductinteractionConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Medicinalproductinteraction.
 * @see .Medicinalproductinteraction
 * @author Paul Kovach
 */

public class MedicinalproductinteractionService {

	private static MedicinalproductinteractionDao MedicinalproductinteractionDao;
	private static MedicinalproductinteractionConversion MedicinalproductinteractionConversion;

	public MedicinalproductinteractionService() 
	{
		MedicinalproductinteractionDao = new MedicinalproductinteractionDao();
		MedicinalproductinteractionConversion = new MedicinalproductinteractionConversion();
	}

	public void persist(main.java.com.campfhir.model.Medicinalproductinteraction entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicinalproductinteractionDao.openCurrentSessionwithTransaction();
		 MedicinalproductinteractionDao.persist(entity);
		 MedicinalproductinteractionDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Medicinalproductinteraction entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicinalproductinteractionDao.openCurrentSessionwithTransaction();
		 MedicinalproductinteractionDao.update(entity);
		 MedicinalproductinteractionDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Medicinalproductinteraction findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicinalproductinteractionDao.openCurrentSession();
		main.java.com.campfhir.model.Medicinalproductinteraction resource = MedicinalproductinteractionDao.findById(id);
		MedicinalproductinteractionDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Medicinalproductinteraction> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicinalproductinteractionDao.openCurrentSession();
		List<main.java.com.campfhir.model.Medicinalproductinteraction> resource =  MedicinalproductinteractionDao.findByPatientId(id);
		MedicinalproductinteractionDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicinalproductinteractionDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Medicinalproductinteraction resource =  MedicinalproductinteractionDao.findById(id);
		MedicinalproductinteractionDao.delete(resource);
		MedicinalproductinteractionDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  MedicinalproductinteractionDao.openCurrentSession();
		ScrollableResults resources =  MedicinalproductinteractionDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Medicinalproductinteraction.html")  			   
			   .setResource(MedicinalproductinteractionConversion.Medicinalproductinteractions((main.java.com.campfhir.model.Medicinalproductinteraction) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  MedicinalproductinteractionDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Medicinalproductinteraction> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  MedicinalproductinteractionDao.findAll();
		List<main.java.com.campfhir.model.Medicinalproductinteraction> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Medicinalproductinteraction) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicinalproductinteractionDao.openCurrentSessionwithTransaction();
		 MedicinalproductinteractionDao.deleteAll();
		 MedicinalproductinteractionDao.closeCurrentSessionwithTransaction();
	}

	public MedicinalproductinteractionDao  MedicinalproductinteractionDao() 
	{
		return  MedicinalproductinteractionDao;
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

