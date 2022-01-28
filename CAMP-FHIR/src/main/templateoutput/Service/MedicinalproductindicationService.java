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
import main.java.com.campfhir.dao.MedicinalproductindicationDao;
import main.java.com.campfhir.service.conversion.MedicinalproductindicationConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Medicinalproductindication.
 * @see .Medicinalproductindication
 * @author Paul Kovach
 */

public class MedicinalproductindicationService {

	private static MedicinalproductindicationDao MedicinalproductindicationDao;
	private static MedicinalproductindicationConversion MedicinalproductindicationConversion;

	public MedicinalproductindicationService() 
	{
		MedicinalproductindicationDao = new MedicinalproductindicationDao();
		MedicinalproductindicationConversion = new MedicinalproductindicationConversion();
	}

	public void persist(main.java.com.campfhir.model.Medicinalproductindication entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicinalproductindicationDao.openCurrentSessionwithTransaction();
		 MedicinalproductindicationDao.persist(entity);
		 MedicinalproductindicationDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Medicinalproductindication entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicinalproductindicationDao.openCurrentSessionwithTransaction();
		 MedicinalproductindicationDao.update(entity);
		 MedicinalproductindicationDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Medicinalproductindication findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicinalproductindicationDao.openCurrentSession();
		main.java.com.campfhir.model.Medicinalproductindication resource = MedicinalproductindicationDao.findById(id);
		MedicinalproductindicationDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Medicinalproductindication> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicinalproductindicationDao.openCurrentSession();
		List<main.java.com.campfhir.model.Medicinalproductindication> resource =  MedicinalproductindicationDao.findByPatientId(id);
		MedicinalproductindicationDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicinalproductindicationDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Medicinalproductindication resource =  MedicinalproductindicationDao.findById(id);
		MedicinalproductindicationDao.delete(resource);
		MedicinalproductindicationDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  MedicinalproductindicationDao.openCurrentSession();
		ScrollableResults resources =  MedicinalproductindicationDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Medicinalproductindication.html")  			   
			   .setResource(MedicinalproductindicationConversion.Medicinalproductindications((main.java.com.campfhir.model.Medicinalproductindication) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  MedicinalproductindicationDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Medicinalproductindication> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  MedicinalproductindicationDao.findAll();
		List<main.java.com.campfhir.model.Medicinalproductindication> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Medicinalproductindication) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicinalproductindicationDao.openCurrentSessionwithTransaction();
		 MedicinalproductindicationDao.deleteAll();
		 MedicinalproductindicationDao.closeCurrentSessionwithTransaction();
	}

	public MedicinalproductindicationDao  MedicinalproductindicationDao() 
	{
		return  MedicinalproductindicationDao;
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

