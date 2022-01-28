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
import main.java.com.campfhir.dao.ContractDao;
import main.java.com.campfhir.service.conversion.ContractConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Contract.
 * @see .Contract
 * @author Paul Kovach
 */

public class ContractService {

	private static ContractDao ContractDao;
	private static ContractConversion ContractConversion;

	public ContractService() 
	{
		ContractDao = new ContractDao();
		ContractConversion = new ContractConversion();
	}

	public void persist(main.java.com.campfhir.model.Contract entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ContractDao.openCurrentSessionwithTransaction();
		 ContractDao.persist(entity);
		 ContractDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Contract entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ContractDao.openCurrentSessionwithTransaction();
		 ContractDao.update(entity);
		 ContractDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Contract findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ContractDao.openCurrentSession();
		main.java.com.campfhir.model.Contract resource = ContractDao.findById(id);
		ContractDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Contract> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ContractDao.openCurrentSession();
		List<main.java.com.campfhir.model.Contract> resource =  ContractDao.findByPatientId(id);
		ContractDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ContractDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Contract resource =  ContractDao.findById(id);
		ContractDao.delete(resource);
		ContractDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  ContractDao.openCurrentSession();
		ScrollableResults resources =  ContractDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Contract.html")  			   
			   .setResource(ContractConversion.Contracts((main.java.com.campfhir.model.Contract) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  ContractDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Contract> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  ContractDao.findAll();
		List<main.java.com.campfhir.model.Contract> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Contract) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 ContractDao.openCurrentSessionwithTransaction();
		 ContractDao.deleteAll();
		 ContractDao.closeCurrentSessionwithTransaction();
	}

	public ContractDao  ContractDao() 
	{
		return  ContractDao;
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

