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
import main.java.com.campfhir.dao.MedicinalproductcontraindicationDao;
import main.java.com.campfhir.service.conversion.MedicinalproductcontraindicationConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Medicinalproductcontraindication.
 * @see .Medicinalproductcontraindication
 * @author Paul Kovach
 */

public class MedicinalproductcontraindicationService {

	private static MedicinalproductcontraindicationDao MedicinalproductcontraindicationDao;
	private static MedicinalproductcontraindicationConversion MedicinalproductcontraindicationConversion;

	public MedicinalproductcontraindicationService() 
	{
		MedicinalproductcontraindicationDao = new MedicinalproductcontraindicationDao();
		MedicinalproductcontraindicationConversion = new MedicinalproductcontraindicationConversion();
	}

	public void persist(main.java.com.campfhir.model.Medicinalproductcontraindication entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicinalproductcontraindicationDao.openCurrentSessionwithTransaction();
		 MedicinalproductcontraindicationDao.persist(entity);
		 MedicinalproductcontraindicationDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Medicinalproductcontraindication entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicinalproductcontraindicationDao.openCurrentSessionwithTransaction();
		 MedicinalproductcontraindicationDao.update(entity);
		 MedicinalproductcontraindicationDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Medicinalproductcontraindication findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicinalproductcontraindicationDao.openCurrentSession();
		main.java.com.campfhir.model.Medicinalproductcontraindication resource = MedicinalproductcontraindicationDao.findById(id);
		MedicinalproductcontraindicationDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Medicinalproductcontraindication> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicinalproductcontraindicationDao.openCurrentSession();
		List<main.java.com.campfhir.model.Medicinalproductcontraindication> resource =  MedicinalproductcontraindicationDao.findByPatientId(id);
		MedicinalproductcontraindicationDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicinalproductcontraindicationDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Medicinalproductcontraindication resource =  MedicinalproductcontraindicationDao.findById(id);
		MedicinalproductcontraindicationDao.delete(resource);
		MedicinalproductcontraindicationDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  MedicinalproductcontraindicationDao.openCurrentSession();
		ScrollableResults resources =  MedicinalproductcontraindicationDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Medicinalproductcontraindication.html")  			   
			   .setResource(MedicinalproductcontraindicationConversion.Medicinalproductcontraindications((main.java.com.campfhir.model.Medicinalproductcontraindication) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  MedicinalproductcontraindicationDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Medicinalproductcontraindication> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  MedicinalproductcontraindicationDao.findAll();
		List<main.java.com.campfhir.model.Medicinalproductcontraindication> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Medicinalproductcontraindication) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicinalproductcontraindicationDao.openCurrentSessionwithTransaction();
		 MedicinalproductcontraindicationDao.deleteAll();
		 MedicinalproductcontraindicationDao.closeCurrentSessionwithTransaction();
	}

	public MedicinalproductcontraindicationDao  MedicinalproductcontraindicationDao() 
	{
		return  MedicinalproductcontraindicationDao;
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

