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
import main.java.com.campfhir.dao.CareplanDao;
import main.java.com.campfhir.service.conversion.CareplanConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Careplan.
 * @see .Careplan
 * @author Paul Kovach
 */

public class CareplanService {

	private static CareplanDao CareplanDao;
	private static CareplanConversion CareplanConversion;

	public CareplanService() 
	{
		CareplanDao = new CareplanDao();
		CareplanConversion = new CareplanConversion();
	}

	public void persist(main.java.com.campfhir.model.Careplan entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 CareplanDao.openCurrentSessionwithTransaction();
		 CareplanDao.persist(entity);
		 CareplanDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Careplan entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 CareplanDao.openCurrentSessionwithTransaction();
		 CareplanDao.update(entity);
		 CareplanDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Careplan findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		CareplanDao.openCurrentSession();
		main.java.com.campfhir.model.Careplan resource = CareplanDao.findById(id);
		CareplanDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Careplan> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		CareplanDao.openCurrentSession();
		List<main.java.com.campfhir.model.Careplan> resource =  CareplanDao.findByPatientId(id);
		CareplanDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		CareplanDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Careplan resource =  CareplanDao.findById(id);
		CareplanDao.delete(resource);
		CareplanDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  CareplanDao.openCurrentSession();
		ScrollableResults resources =  CareplanDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Careplan.html")  			   
			   .setResource(CareplanConversion.Careplans((main.java.com.campfhir.model.Careplan) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  CareplanDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Careplan> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  CareplanDao.findAll();
		List<main.java.com.campfhir.model.Careplan> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Careplan) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 CareplanDao.openCurrentSessionwithTransaction();
		 CareplanDao.deleteAll();
		 CareplanDao.closeCurrentSessionwithTransaction();
	}

	public CareplanDao  CareplanDao() 
	{
		return  CareplanDao;
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

