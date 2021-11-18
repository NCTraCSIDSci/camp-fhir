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
import main.java.com.campfhir.dao.MedicinalproductpharmaceuticalDao;
import main.java.com.campfhir.service.conversion.MedicinalproductpharmaceuticalConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Medicinalproductpharmaceutical.
 * @see .Medicinalproductpharmaceutical
 * @author Paul Kovach
 */

public class MedicinalproductpharmaceuticalService {

	private static MedicinalproductpharmaceuticalDao MedicinalproductpharmaceuticalDao;
	private static MedicinalproductpharmaceuticalConversion MedicinalproductpharmaceuticalConversion;

	public MedicinalproductpharmaceuticalService() 
	{
		MedicinalproductpharmaceuticalDao = new MedicinalproductpharmaceuticalDao();
		MedicinalproductpharmaceuticalConversion = new MedicinalproductpharmaceuticalConversion();
	}

	public void persist(main.java.com.campfhir.model.Medicinalproductpharmaceutical entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicinalproductpharmaceuticalDao.openCurrentSessionwithTransaction();
		 MedicinalproductpharmaceuticalDao.persist(entity);
		 MedicinalproductpharmaceuticalDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Medicinalproductpharmaceutical entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicinalproductpharmaceuticalDao.openCurrentSessionwithTransaction();
		 MedicinalproductpharmaceuticalDao.update(entity);
		 MedicinalproductpharmaceuticalDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Medicinalproductpharmaceutical findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicinalproductpharmaceuticalDao.openCurrentSession();
		main.java.com.campfhir.model.Medicinalproductpharmaceutical resource = MedicinalproductpharmaceuticalDao.findById(id);
		MedicinalproductpharmaceuticalDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Medicinalproductpharmaceutical> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicinalproductpharmaceuticalDao.openCurrentSession();
		List<main.java.com.campfhir.model.Medicinalproductpharmaceutical> resource =  MedicinalproductpharmaceuticalDao.findByPatientId(id);
		MedicinalproductpharmaceuticalDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicinalproductpharmaceuticalDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Medicinalproductpharmaceutical resource =  MedicinalproductpharmaceuticalDao.findById(id);
		MedicinalproductpharmaceuticalDao.delete(resource);
		MedicinalproductpharmaceuticalDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  MedicinalproductpharmaceuticalDao.openCurrentSession();
		ScrollableResults resources =  MedicinalproductpharmaceuticalDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Medicinalproductpharmaceutical.html")  			   
			   .setResource(MedicinalproductpharmaceuticalConversion.Medicinalproductpharmaceuticals((main.java.com.campfhir.model.Medicinalproductpharmaceutical) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  MedicinalproductpharmaceuticalDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Medicinalproductpharmaceutical> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  MedicinalproductpharmaceuticalDao.findAll();
		List<main.java.com.campfhir.model.Medicinalproductpharmaceutical> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Medicinalproductpharmaceutical) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicinalproductpharmaceuticalDao.openCurrentSessionwithTransaction();
		 MedicinalproductpharmaceuticalDao.deleteAll();
		 MedicinalproductpharmaceuticalDao.closeCurrentSessionwithTransaction();
	}

	public MedicinalproductpharmaceuticalDao  MedicinalproductpharmaceuticalDao() 
	{
		return  MedicinalproductpharmaceuticalDao;
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

