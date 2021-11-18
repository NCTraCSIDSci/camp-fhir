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
import main.java.com.campfhir.dao.SupplyrequestDao;
import main.java.com.campfhir.service.conversion.SupplyrequestConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Supplyrequest.
 * @see .Supplyrequest
 * @author Paul Kovach
 */

public class SupplyrequestService {

	private static SupplyrequestDao SupplyrequestDao;
	private static SupplyrequestConversion SupplyrequestConversion;

	public SupplyrequestService() 
	{
		SupplyrequestDao = new SupplyrequestDao();
		SupplyrequestConversion = new SupplyrequestConversion();
	}

	public void persist(main.java.com.campfhir.model.Supplyrequest entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 SupplyrequestDao.openCurrentSessionwithTransaction();
		 SupplyrequestDao.persist(entity);
		 SupplyrequestDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Supplyrequest entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 SupplyrequestDao.openCurrentSessionwithTransaction();
		 SupplyrequestDao.update(entity);
		 SupplyrequestDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Supplyrequest findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SupplyrequestDao.openCurrentSession();
		main.java.com.campfhir.model.Supplyrequest resource = SupplyrequestDao.findById(id);
		SupplyrequestDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Supplyrequest> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SupplyrequestDao.openCurrentSession();
		List<main.java.com.campfhir.model.Supplyrequest> resource =  SupplyrequestDao.findByPatientId(id);
		SupplyrequestDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SupplyrequestDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Supplyrequest resource =  SupplyrequestDao.findById(id);
		SupplyrequestDao.delete(resource);
		SupplyrequestDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  SupplyrequestDao.openCurrentSession();
		ScrollableResults resources =  SupplyrequestDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Supplyrequest.html")  			   
			   .setResource(SupplyrequestConversion.Supplyrequests((main.java.com.campfhir.model.Supplyrequest) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  SupplyrequestDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Supplyrequest> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  SupplyrequestDao.findAll();
		List<main.java.com.campfhir.model.Supplyrequest> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Supplyrequest) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 SupplyrequestDao.openCurrentSessionwithTransaction();
		 SupplyrequestDao.deleteAll();
		 SupplyrequestDao.closeCurrentSessionwithTransaction();
	}

	public SupplyrequestDao  SupplyrequestDao() 
	{
		return  SupplyrequestDao;
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

