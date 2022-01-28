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
import main.java.com.campfhir.dao.MeasurereportDao;
import main.java.com.campfhir.service.conversion.MeasurereportConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Measurereport.
 * @see .Measurereport
 * @author Paul Kovach
 */

public class MeasurereportService {

	private static MeasurereportDao MeasurereportDao;
	private static MeasurereportConversion MeasurereportConversion;

	public MeasurereportService() 
	{
		MeasurereportDao = new MeasurereportDao();
		MeasurereportConversion = new MeasurereportConversion();
	}

	public void persist(main.java.com.campfhir.model.Measurereport entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MeasurereportDao.openCurrentSessionwithTransaction();
		 MeasurereportDao.persist(entity);
		 MeasurereportDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Measurereport entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MeasurereportDao.openCurrentSessionwithTransaction();
		 MeasurereportDao.update(entity);
		 MeasurereportDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Measurereport findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MeasurereportDao.openCurrentSession();
		main.java.com.campfhir.model.Measurereport resource = MeasurereportDao.findById(id);
		MeasurereportDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Measurereport> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MeasurereportDao.openCurrentSession();
		List<main.java.com.campfhir.model.Measurereport> resource =  MeasurereportDao.findByPatientId(id);
		MeasurereportDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MeasurereportDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Measurereport resource =  MeasurereportDao.findById(id);
		MeasurereportDao.delete(resource);
		MeasurereportDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  MeasurereportDao.openCurrentSession();
		ScrollableResults resources =  MeasurereportDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Measurereport.html")  			   
			   .setResource(MeasurereportConversion.Measurereports((main.java.com.campfhir.model.Measurereport) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  MeasurereportDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Measurereport> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  MeasurereportDao.findAll();
		List<main.java.com.campfhir.model.Measurereport> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Measurereport) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 MeasurereportDao.openCurrentSessionwithTransaction();
		 MeasurereportDao.deleteAll();
		 MeasurereportDao.closeCurrentSessionwithTransaction();
	}

	public MeasurereportDao  MeasurereportDao() 
	{
		return  MeasurereportDao;
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

