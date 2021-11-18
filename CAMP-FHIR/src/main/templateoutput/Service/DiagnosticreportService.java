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
import main.java.com.campfhir.dao.DiagnosticreportDao;
import main.java.com.campfhir.service.conversion.DiagnosticreportConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Diagnosticreport.
 * @see .Diagnosticreport
 * @author Paul Kovach
 */

public class DiagnosticreportService {

	private static DiagnosticreportDao DiagnosticreportDao;
	private static DiagnosticreportConversion DiagnosticreportConversion;

	public DiagnosticreportService() 
	{
		DiagnosticreportDao = new DiagnosticreportDao();
		DiagnosticreportConversion = new DiagnosticreportConversion();
	}

	public void persist(main.java.com.campfhir.model.Diagnosticreport entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 DiagnosticreportDao.openCurrentSessionwithTransaction();
		 DiagnosticreportDao.persist(entity);
		 DiagnosticreportDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Diagnosticreport entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 DiagnosticreportDao.openCurrentSessionwithTransaction();
		 DiagnosticreportDao.update(entity);
		 DiagnosticreportDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Diagnosticreport findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		DiagnosticreportDao.openCurrentSession();
		main.java.com.campfhir.model.Diagnosticreport resource = DiagnosticreportDao.findById(id);
		DiagnosticreportDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Diagnosticreport> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		DiagnosticreportDao.openCurrentSession();
		List<main.java.com.campfhir.model.Diagnosticreport> resource =  DiagnosticreportDao.findByPatientId(id);
		DiagnosticreportDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		DiagnosticreportDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Diagnosticreport resource =  DiagnosticreportDao.findById(id);
		DiagnosticreportDao.delete(resource);
		DiagnosticreportDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  DiagnosticreportDao.openCurrentSession();
		ScrollableResults resources =  DiagnosticreportDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Diagnosticreport.html")  			   
			   .setResource(DiagnosticreportConversion.Diagnosticreports((main.java.com.campfhir.model.Diagnosticreport) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  DiagnosticreportDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Diagnosticreport> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  DiagnosticreportDao.findAll();
		List<main.java.com.campfhir.model.Diagnosticreport> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Diagnosticreport) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 DiagnosticreportDao.openCurrentSessionwithTransaction();
		 DiagnosticreportDao.deleteAll();
		 DiagnosticreportDao.closeCurrentSessionwithTransaction();
	}

	public DiagnosticreportDao  DiagnosticreportDao() 
	{
		return  DiagnosticreportDao;
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

