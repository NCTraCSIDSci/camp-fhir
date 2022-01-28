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
import main.java.com.campfhir.dao.MedicinalproductundesirableeffectDao;
import main.java.com.campfhir.service.conversion.MedicinalproductundesirableeffectConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Medicinalproductundesirableeffect.
 * @see .Medicinalproductundesirableeffect
 * @author Paul Kovach
 */

public class MedicinalproductundesirableeffectService {

	private static MedicinalproductundesirableeffectDao MedicinalproductundesirableeffectDao;
	private static MedicinalproductundesirableeffectConversion MedicinalproductundesirableeffectConversion;

	public MedicinalproductundesirableeffectService() 
	{
		MedicinalproductundesirableeffectDao = new MedicinalproductundesirableeffectDao();
		MedicinalproductundesirableeffectConversion = new MedicinalproductundesirableeffectConversion();
	}

	public void persist(main.java.com.campfhir.model.Medicinalproductundesirableeffect entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicinalproductundesirableeffectDao.openCurrentSessionwithTransaction();
		 MedicinalproductundesirableeffectDao.persist(entity);
		 MedicinalproductundesirableeffectDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Medicinalproductundesirableeffect entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicinalproductundesirableeffectDao.openCurrentSessionwithTransaction();
		 MedicinalproductundesirableeffectDao.update(entity);
		 MedicinalproductundesirableeffectDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Medicinalproductundesirableeffect findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicinalproductundesirableeffectDao.openCurrentSession();
		main.java.com.campfhir.model.Medicinalproductundesirableeffect resource = MedicinalproductundesirableeffectDao.findById(id);
		MedicinalproductundesirableeffectDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Medicinalproductundesirableeffect> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicinalproductundesirableeffectDao.openCurrentSession();
		List<main.java.com.campfhir.model.Medicinalproductundesirableeffect> resource =  MedicinalproductundesirableeffectDao.findByPatientId(id);
		MedicinalproductundesirableeffectDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicinalproductundesirableeffectDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Medicinalproductundesirableeffect resource =  MedicinalproductundesirableeffectDao.findById(id);
		MedicinalproductundesirableeffectDao.delete(resource);
		MedicinalproductundesirableeffectDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  MedicinalproductundesirableeffectDao.openCurrentSession();
		ScrollableResults resources =  MedicinalproductundesirableeffectDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Medicinalproductundesirableeffect.html")  			   
			   .setResource(MedicinalproductundesirableeffectConversion.Medicinalproductundesirableeffects((main.java.com.campfhir.model.Medicinalproductundesirableeffect) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  MedicinalproductundesirableeffectDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Medicinalproductundesirableeffect> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  MedicinalproductundesirableeffectDao.findAll();
		List<main.java.com.campfhir.model.Medicinalproductundesirableeffect> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Medicinalproductundesirableeffect) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicinalproductundesirableeffectDao.openCurrentSessionwithTransaction();
		 MedicinalproductundesirableeffectDao.deleteAll();
		 MedicinalproductundesirableeffectDao.closeCurrentSessionwithTransaction();
	}

	public MedicinalproductundesirableeffectDao  MedicinalproductundesirableeffectDao() 
	{
		return  MedicinalproductundesirableeffectDao;
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

