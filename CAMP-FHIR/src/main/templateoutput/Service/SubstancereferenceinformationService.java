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
import main.java.com.campfhir.dao.SubstancereferenceinformationDao;
import main.java.com.campfhir.service.conversion.SubstancereferenceinformationConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Substancereferenceinformation.
 * @see .Substancereferenceinformation
 * @author Paul Kovach
 */

public class SubstancereferenceinformationService {

	private static SubstancereferenceinformationDao SubstancereferenceinformationDao;
	private static SubstancereferenceinformationConversion SubstancereferenceinformationConversion;

	public SubstancereferenceinformationService() 
	{
		SubstancereferenceinformationDao = new SubstancereferenceinformationDao();
		SubstancereferenceinformationConversion = new SubstancereferenceinformationConversion();
	}

	public void persist(main.java.com.campfhir.model.Substancereferenceinformation entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 SubstancereferenceinformationDao.openCurrentSessionwithTransaction();
		 SubstancereferenceinformationDao.persist(entity);
		 SubstancereferenceinformationDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Substancereferenceinformation entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 SubstancereferenceinformationDao.openCurrentSessionwithTransaction();
		 SubstancereferenceinformationDao.update(entity);
		 SubstancereferenceinformationDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Substancereferenceinformation findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SubstancereferenceinformationDao.openCurrentSession();
		main.java.com.campfhir.model.Substancereferenceinformation resource = SubstancereferenceinformationDao.findById(id);
		SubstancereferenceinformationDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Substancereferenceinformation> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SubstancereferenceinformationDao.openCurrentSession();
		List<main.java.com.campfhir.model.Substancereferenceinformation> resource =  SubstancereferenceinformationDao.findByPatientId(id);
		SubstancereferenceinformationDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SubstancereferenceinformationDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Substancereferenceinformation resource =  SubstancereferenceinformationDao.findById(id);
		SubstancereferenceinformationDao.delete(resource);
		SubstancereferenceinformationDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  SubstancereferenceinformationDao.openCurrentSession();
		ScrollableResults resources =  SubstancereferenceinformationDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Substancereferenceinformation.html")  			   
			   .setResource(SubstancereferenceinformationConversion.Substancereferenceinformations((main.java.com.campfhir.model.Substancereferenceinformation) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  SubstancereferenceinformationDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Substancereferenceinformation> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  SubstancereferenceinformationDao.findAll();
		List<main.java.com.campfhir.model.Substancereferenceinformation> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Substancereferenceinformation) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 SubstancereferenceinformationDao.openCurrentSessionwithTransaction();
		 SubstancereferenceinformationDao.deleteAll();
		 SubstancereferenceinformationDao.closeCurrentSessionwithTransaction();
	}

	public SubstancereferenceinformationDao  SubstancereferenceinformationDao() 
	{
		return  SubstancereferenceinformationDao;
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

