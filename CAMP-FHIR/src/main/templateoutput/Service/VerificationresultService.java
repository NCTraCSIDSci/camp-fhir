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
import main.java.com.campfhir.dao.VerificationresultDao;
import main.java.com.campfhir.service.conversion.VerificationresultConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Verificationresult.
 * @see .Verificationresult
 * @author Paul Kovach
 */

public class VerificationresultService {

	private static VerificationresultDao VerificationresultDao;
	private static VerificationresultConversion VerificationresultConversion;

	public VerificationresultService() 
	{
		VerificationresultDao = new VerificationresultDao();
		VerificationresultConversion = new VerificationresultConversion();
	}

	public void persist(main.java.com.campfhir.model.Verificationresult entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 VerificationresultDao.openCurrentSessionwithTransaction();
		 VerificationresultDao.persist(entity);
		 VerificationresultDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Verificationresult entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 VerificationresultDao.openCurrentSessionwithTransaction();
		 VerificationresultDao.update(entity);
		 VerificationresultDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Verificationresult findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		VerificationresultDao.openCurrentSession();
		main.java.com.campfhir.model.Verificationresult resource = VerificationresultDao.findById(id);
		VerificationresultDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Verificationresult> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		VerificationresultDao.openCurrentSession();
		List<main.java.com.campfhir.model.Verificationresult> resource =  VerificationresultDao.findByPatientId(id);
		VerificationresultDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		VerificationresultDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Verificationresult resource =  VerificationresultDao.findById(id);
		VerificationresultDao.delete(resource);
		VerificationresultDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  VerificationresultDao.openCurrentSession();
		ScrollableResults resources =  VerificationresultDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Verificationresult.html")  			   
			   .setResource(VerificationresultConversion.Verificationresults((main.java.com.campfhir.model.Verificationresult) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  VerificationresultDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Verificationresult> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  VerificationresultDao.findAll();
		List<main.java.com.campfhir.model.Verificationresult> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Verificationresult) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 VerificationresultDao.openCurrentSessionwithTransaction();
		 VerificationresultDao.deleteAll();
		 VerificationresultDao.closeCurrentSessionwithTransaction();
	}

	public VerificationresultDao  VerificationresultDao() 
	{
		return  VerificationresultDao;
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

