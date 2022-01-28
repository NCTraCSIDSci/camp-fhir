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
import main.java.com.campfhir.dao.SpecimenDao;
import main.java.com.campfhir.service.conversion.SpecimenConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Specimen.
 * @see .Specimen
 * @author Paul Kovach
 */

public class SpecimenService {

	private static SpecimenDao SpecimenDao;
	private static SpecimenConversion SpecimenConversion;

	public SpecimenService() 
	{
		SpecimenDao = new SpecimenDao();
		SpecimenConversion = new SpecimenConversion();
	}

	public void persist(main.java.com.campfhir.model.Specimen entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 SpecimenDao.openCurrentSessionwithTransaction();
		 SpecimenDao.persist(entity);
		 SpecimenDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Specimen entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 SpecimenDao.openCurrentSessionwithTransaction();
		 SpecimenDao.update(entity);
		 SpecimenDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Specimen findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SpecimenDao.openCurrentSession();
		main.java.com.campfhir.model.Specimen resource = SpecimenDao.findById(id);
		SpecimenDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Specimen> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SpecimenDao.openCurrentSession();
		List<main.java.com.campfhir.model.Specimen> resource =  SpecimenDao.findByPatientId(id);
		SpecimenDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SpecimenDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Specimen resource =  SpecimenDao.findById(id);
		SpecimenDao.delete(resource);
		SpecimenDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  SpecimenDao.openCurrentSession();
		ScrollableResults resources =  SpecimenDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Specimen.html")  			   
			   .setResource(SpecimenConversion.Specimens((main.java.com.campfhir.model.Specimen) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  SpecimenDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Specimen> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  SpecimenDao.findAll();
		List<main.java.com.campfhir.model.Specimen> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Specimen) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 SpecimenDao.openCurrentSessionwithTransaction();
		 SpecimenDao.deleteAll();
		 SpecimenDao.closeCurrentSessionwithTransaction();
	}

	public SpecimenDao  SpecimenDao() 
	{
		return  SpecimenDao;
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

