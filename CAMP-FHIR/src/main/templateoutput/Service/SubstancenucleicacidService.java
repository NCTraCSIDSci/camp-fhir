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
import main.java.com.campfhir.dao.SubstancenucleicacidDao;
import main.java.com.campfhir.service.conversion.SubstancenucleicacidConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Substancenucleicacid.
 * @see .Substancenucleicacid
 * @author Paul Kovach
 */

public class SubstancenucleicacidService {

	private static SubstancenucleicacidDao SubstancenucleicacidDao;
	private static SubstancenucleicacidConversion SubstancenucleicacidConversion;

	public SubstancenucleicacidService() 
	{
		SubstancenucleicacidDao = new SubstancenucleicacidDao();
		SubstancenucleicacidConversion = new SubstancenucleicacidConversion();
	}

	public void persist(main.java.com.campfhir.model.Substancenucleicacid entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 SubstancenucleicacidDao.openCurrentSessionwithTransaction();
		 SubstancenucleicacidDao.persist(entity);
		 SubstancenucleicacidDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Substancenucleicacid entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 SubstancenucleicacidDao.openCurrentSessionwithTransaction();
		 SubstancenucleicacidDao.update(entity);
		 SubstancenucleicacidDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Substancenucleicacid findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SubstancenucleicacidDao.openCurrentSession();
		main.java.com.campfhir.model.Substancenucleicacid resource = SubstancenucleicacidDao.findById(id);
		SubstancenucleicacidDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Substancenucleicacid> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SubstancenucleicacidDao.openCurrentSession();
		List<main.java.com.campfhir.model.Substancenucleicacid> resource =  SubstancenucleicacidDao.findByPatientId(id);
		SubstancenucleicacidDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SubstancenucleicacidDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Substancenucleicacid resource =  SubstancenucleicacidDao.findById(id);
		SubstancenucleicacidDao.delete(resource);
		SubstancenucleicacidDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  SubstancenucleicacidDao.openCurrentSession();
		ScrollableResults resources =  SubstancenucleicacidDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Substancenucleicacid.html")  			   
			   .setResource(SubstancenucleicacidConversion.Substancenucleicacids((main.java.com.campfhir.model.Substancenucleicacid) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  SubstancenucleicacidDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Substancenucleicacid> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  SubstancenucleicacidDao.findAll();
		List<main.java.com.campfhir.model.Substancenucleicacid> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Substancenucleicacid) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 SubstancenucleicacidDao.openCurrentSessionwithTransaction();
		 SubstancenucleicacidDao.deleteAll();
		 SubstancenucleicacidDao.closeCurrentSessionwithTransaction();
	}

	public SubstancenucleicacidDao  SubstancenucleicacidDao() 
	{
		return  SubstancenucleicacidDao;
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

