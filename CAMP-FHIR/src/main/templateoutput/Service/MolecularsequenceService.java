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
import main.java.com.campfhir.dao.MolecularsequenceDao;
import main.java.com.campfhir.service.conversion.MolecularsequenceConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Molecularsequence.
 * @see .Molecularsequence
 * @author Paul Kovach
 */

public class MolecularsequenceService {

	private static MolecularsequenceDao MolecularsequenceDao;
	private static MolecularsequenceConversion MolecularsequenceConversion;

	public MolecularsequenceService() 
	{
		MolecularsequenceDao = new MolecularsequenceDao();
		MolecularsequenceConversion = new MolecularsequenceConversion();
	}

	public void persist(main.java.com.campfhir.model.Molecularsequence entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MolecularsequenceDao.openCurrentSessionwithTransaction();
		 MolecularsequenceDao.persist(entity);
		 MolecularsequenceDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Molecularsequence entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 MolecularsequenceDao.openCurrentSessionwithTransaction();
		 MolecularsequenceDao.update(entity);
		 MolecularsequenceDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Molecularsequence findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MolecularsequenceDao.openCurrentSession();
		main.java.com.campfhir.model.Molecularsequence resource = MolecularsequenceDao.findById(id);
		MolecularsequenceDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Molecularsequence> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MolecularsequenceDao.openCurrentSession();
		List<main.java.com.campfhir.model.Molecularsequence> resource =  MolecularsequenceDao.findByPatientId(id);
		MolecularsequenceDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		MolecularsequenceDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Molecularsequence resource =  MolecularsequenceDao.findById(id);
		MolecularsequenceDao.delete(resource);
		MolecularsequenceDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  MolecularsequenceDao.openCurrentSession();
		ScrollableResults resources =  MolecularsequenceDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Molecularsequence.html")  			   
			   .setResource(MolecularsequenceConversion.Molecularsequences((main.java.com.campfhir.model.Molecularsequence) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  MolecularsequenceDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Molecularsequence> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  MolecularsequenceDao.findAll();
		List<main.java.com.campfhir.model.Molecularsequence> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Molecularsequence) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 MolecularsequenceDao.openCurrentSessionwithTransaction();
		 MolecularsequenceDao.deleteAll();
		 MolecularsequenceDao.closeCurrentSessionwithTransaction();
	}

	public MolecularsequenceDao  MolecularsequenceDao() 
	{
		return  MolecularsequenceDao;
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

