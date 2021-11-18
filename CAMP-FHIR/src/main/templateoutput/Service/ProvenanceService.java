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
import main.java.com.campfhir.dao.ProvenanceDao;
import main.java.com.campfhir.service.conversion.ProvenanceConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Provenance.
 * @see .Provenance
 * @author Paul Kovach
 */

public class ProvenanceService {

	private static ProvenanceDao ProvenanceDao;
	private static ProvenanceConversion ProvenanceConversion;

	public ProvenanceService() 
	{
		ProvenanceDao = new ProvenanceDao();
		ProvenanceConversion = new ProvenanceConversion();
	}

	public void persist(main.java.com.campfhir.model.Provenance entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ProvenanceDao.openCurrentSessionwithTransaction();
		 ProvenanceDao.persist(entity);
		 ProvenanceDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Provenance entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ProvenanceDao.openCurrentSessionwithTransaction();
		 ProvenanceDao.update(entity);
		 ProvenanceDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Provenance findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ProvenanceDao.openCurrentSession();
		main.java.com.campfhir.model.Provenance resource = ProvenanceDao.findById(id);
		ProvenanceDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Provenance> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ProvenanceDao.openCurrentSession();
		List<main.java.com.campfhir.model.Provenance> resource =  ProvenanceDao.findByPatientId(id);
		ProvenanceDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ProvenanceDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Provenance resource =  ProvenanceDao.findById(id);
		ProvenanceDao.delete(resource);
		ProvenanceDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  ProvenanceDao.openCurrentSession();
		ScrollableResults resources =  ProvenanceDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Provenance.html")  			   
			   .setResource(ProvenanceConversion.Provenances((main.java.com.campfhir.model.Provenance) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  ProvenanceDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Provenance> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  ProvenanceDao.findAll();
		List<main.java.com.campfhir.model.Provenance> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Provenance) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 ProvenanceDao.openCurrentSessionwithTransaction();
		 ProvenanceDao.deleteAll();
		 ProvenanceDao.closeCurrentSessionwithTransaction();
	}

	public ProvenanceDao  ProvenanceDao() 
	{
		return  ProvenanceDao;
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

