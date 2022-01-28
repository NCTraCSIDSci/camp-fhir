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
import main.java.com.campfhir.dao.MedicinalproductpackagedDao;
import main.java.com.campfhir.service.conversion.MedicinalproductpackagedConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Medicinalproductpackaged.
 * @see .Medicinalproductpackaged
 * @author Paul Kovach
 */

public class MedicinalproductpackagedService {

	private static MedicinalproductpackagedDao MedicinalproductpackagedDao;
	private static MedicinalproductpackagedConversion MedicinalproductpackagedConversion;

	public MedicinalproductpackagedService() 
	{
		MedicinalproductpackagedDao = new MedicinalproductpackagedDao();
		MedicinalproductpackagedConversion = new MedicinalproductpackagedConversion();
	}

	public void persist(main.java.com.campfhir.model.Medicinalproductpackaged entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicinalproductpackagedDao.openCurrentSessionwithTransaction();
		 MedicinalproductpackagedDao.persist(entity);
		 MedicinalproductpackagedDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Medicinalproductpackaged entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicinalproductpackagedDao.openCurrentSessionwithTransaction();
		 MedicinalproductpackagedDao.update(entity);
		 MedicinalproductpackagedDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Medicinalproductpackaged findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicinalproductpackagedDao.openCurrentSession();
		main.java.com.campfhir.model.Medicinalproductpackaged resource = MedicinalproductpackagedDao.findById(id);
		MedicinalproductpackagedDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Medicinalproductpackaged> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicinalproductpackagedDao.openCurrentSession();
		List<main.java.com.campfhir.model.Medicinalproductpackaged> resource =  MedicinalproductpackagedDao.findByPatientId(id);
		MedicinalproductpackagedDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MedicinalproductpackagedDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Medicinalproductpackaged resource =  MedicinalproductpackagedDao.findById(id);
		MedicinalproductpackagedDao.delete(resource);
		MedicinalproductpackagedDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  MedicinalproductpackagedDao.openCurrentSession();
		ScrollableResults resources =  MedicinalproductpackagedDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Medicinalproductpackaged.html")  			   
			   .setResource(MedicinalproductpackagedConversion.Medicinalproductpackageds((main.java.com.campfhir.model.Medicinalproductpackaged) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  MedicinalproductpackagedDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Medicinalproductpackaged> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  MedicinalproductpackagedDao.findAll();
		List<main.java.com.campfhir.model.Medicinalproductpackaged> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Medicinalproductpackaged) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 MedicinalproductpackagedDao.openCurrentSessionwithTransaction();
		 MedicinalproductpackagedDao.deleteAll();
		 MedicinalproductpackagedDao.closeCurrentSessionwithTransaction();
	}

	public MedicinalproductpackagedDao  MedicinalproductpackagedDao() 
	{
		return  MedicinalproductpackagedDao;
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

