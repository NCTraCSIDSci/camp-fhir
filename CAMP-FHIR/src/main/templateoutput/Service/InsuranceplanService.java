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
import main.java.com.campfhir.dao.InsuranceplanDao;
import main.java.com.campfhir.service.conversion.InsuranceplanConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Insuranceplan.
 * @see .Insuranceplan
 * @author Paul Kovach
 */

public class InsuranceplanService {

	private static InsuranceplanDao InsuranceplanDao;
	private static InsuranceplanConversion InsuranceplanConversion;

	public InsuranceplanService() 
	{
		InsuranceplanDao = new InsuranceplanDao();
		InsuranceplanConversion = new InsuranceplanConversion();
	}

	public void persist(main.java.com.campfhir.model.Insuranceplan entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 InsuranceplanDao.openCurrentSessionwithTransaction();
		 InsuranceplanDao.persist(entity);
		 InsuranceplanDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Insuranceplan entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 InsuranceplanDao.openCurrentSessionwithTransaction();
		 InsuranceplanDao.update(entity);
		 InsuranceplanDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Insuranceplan findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		InsuranceplanDao.openCurrentSession();
		main.java.com.campfhir.model.Insuranceplan resource = InsuranceplanDao.findById(id);
		InsuranceplanDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Insuranceplan> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		InsuranceplanDao.openCurrentSession();
		List<main.java.com.campfhir.model.Insuranceplan> resource =  InsuranceplanDao.findByPatientId(id);
		InsuranceplanDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		InsuranceplanDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Insuranceplan resource =  InsuranceplanDao.findById(id);
		InsuranceplanDao.delete(resource);
		InsuranceplanDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  InsuranceplanDao.openCurrentSession();
		ScrollableResults resources =  InsuranceplanDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Insuranceplan.html")  			   
			   .setResource(InsuranceplanConversion.Insuranceplans((main.java.com.campfhir.model.Insuranceplan) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  InsuranceplanDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Insuranceplan> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  InsuranceplanDao.findAll();
		List<main.java.com.campfhir.model.Insuranceplan> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Insuranceplan) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 InsuranceplanDao.openCurrentSessionwithTransaction();
		 InsuranceplanDao.deleteAll();
		 InsuranceplanDao.closeCurrentSessionwithTransaction();
	}

	public InsuranceplanDao  InsuranceplanDao() 
	{
		return  InsuranceplanDao;
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

