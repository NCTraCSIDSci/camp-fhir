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
import main.java.com.campfhir.dao.MeasureDao;
import main.java.com.campfhir.service.conversion.MeasureConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Measure.
 * @see .Measure
 * @author Paul Kovach
 */

public class MeasureService {

	private static MeasureDao MeasureDao;
	private static MeasureConversion MeasureConversion;

	public MeasureService() 
	{
		MeasureDao = new MeasureDao();
		MeasureConversion = new MeasureConversion();
	}

	public void persist(main.java.com.campfhir.model.Measure entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MeasureDao.openCurrentSessionwithTransaction();
		 MeasureDao.persist(entity);
		 MeasureDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Measure entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MeasureDao.openCurrentSessionwithTransaction();
		 MeasureDao.update(entity);
		 MeasureDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Measure findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MeasureDao.openCurrentSession();
		main.java.com.campfhir.model.Measure resource = MeasureDao.findById(id);
		MeasureDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Measure> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MeasureDao.openCurrentSession();
		List<main.java.com.campfhir.model.Measure> resource =  MeasureDao.findByPatientId(id);
		MeasureDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MeasureDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Measure resource =  MeasureDao.findById(id);
		MeasureDao.delete(resource);
		MeasureDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  MeasureDao.openCurrentSession();
		ScrollableResults resources =  MeasureDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Measure.html")  			   
			   .setResource(MeasureConversion.Measures((main.java.com.campfhir.model.Measure) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  MeasureDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Measure> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  MeasureDao.findAll();
		List<main.java.com.campfhir.model.Measure> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Measure) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 MeasureDao.openCurrentSessionwithTransaction();
		 MeasureDao.deleteAll();
		 MeasureDao.closeCurrentSessionwithTransaction();
	}

	public MeasureDao  MeasureDao() 
	{
		return  MeasureDao;
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

