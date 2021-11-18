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
import main.java.com.campfhir.dao.MedicinalproductDao;
import main.java.com.campfhir.service.conversion.MedicinalproductConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Medicinalproduct.
 * @see .Medicinalproduct
 * @author Paul Kovach
 */

public class MedicinalproductService {

	private static MedicinalproductDao MedicinalproductDao;
	private static MedicinalproductConversion MedicinalproductConversion;

	public MedicinalproductService() 
	{
		MedicinalproductDao = new MedicinalproductDao();
		MedicinalproductConversion = new MedicinalproductConversion();
	}

	public void persist(main.java.com.campfhir.model.Medicinalproduct entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicinalproductDao.openCurrentSessionwithTransaction();
		 MedicinalproductDao.persist(entity);
		 MedicinalproductDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Medicinalproduct entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicinalproductDao.openCurrentSessionwithTransaction();
		 MedicinalproductDao.update(entity);
		 MedicinalproductDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Medicinalproduct findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicinalproductDao.openCurrentSession();
		main.java.com.campfhir.model.Medicinalproduct resource = MedicinalproductDao.findById(id);
		MedicinalproductDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Medicinalproduct> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicinalproductDao.openCurrentSession();
		List<main.java.com.campfhir.model.Medicinalproduct> resource =  MedicinalproductDao.findByPatientId(id);
		MedicinalproductDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicinalproductDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Medicinalproduct resource =  MedicinalproductDao.findById(id);
		MedicinalproductDao.delete(resource);
		MedicinalproductDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  MedicinalproductDao.openCurrentSession();
		ScrollableResults resources =  MedicinalproductDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Medicinalproduct.html")  			   
			   .setResource(MedicinalproductConversion.Medicinalproducts((main.java.com.campfhir.model.Medicinalproduct) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  MedicinalproductDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Medicinalproduct> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  MedicinalproductDao.findAll();
		List<main.java.com.campfhir.model.Medicinalproduct> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Medicinalproduct) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicinalproductDao.openCurrentSessionwithTransaction();
		 MedicinalproductDao.deleteAll();
		 MedicinalproductDao.closeCurrentSessionwithTransaction();
	}

	public MedicinalproductDao  MedicinalproductDao() 
	{
		return  MedicinalproductDao;
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

