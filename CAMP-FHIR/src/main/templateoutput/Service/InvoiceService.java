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
import main.java.com.campfhir.dao.InvoiceDao;
import main.java.com.campfhir.service.conversion.InvoiceConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Invoice.
 * @see .Invoice
 * @author Paul Kovach
 */

public class InvoiceService {

	private static InvoiceDao InvoiceDao;
	private static InvoiceConversion InvoiceConversion;

	public InvoiceService() 
	{
		InvoiceDao = new InvoiceDao();
		InvoiceConversion = new InvoiceConversion();
	}

	public void persist(main.java.com.campfhir.model.Invoice entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 InvoiceDao.openCurrentSessionwithTransaction();
		 InvoiceDao.persist(entity);
		 InvoiceDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Invoice entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 InvoiceDao.openCurrentSessionwithTransaction();
		 InvoiceDao.update(entity);
		 InvoiceDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Invoice findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		InvoiceDao.openCurrentSession();
		main.java.com.campfhir.model.Invoice resource = InvoiceDao.findById(id);
		InvoiceDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Invoice> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		InvoiceDao.openCurrentSession();
		List<main.java.com.campfhir.model.Invoice> resource =  InvoiceDao.findByPatientId(id);
		InvoiceDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		InvoiceDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Invoice resource =  InvoiceDao.findById(id);
		InvoiceDao.delete(resource);
		InvoiceDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  InvoiceDao.openCurrentSession();
		ScrollableResults resources =  InvoiceDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Invoice.html")  			   
			   .setResource(InvoiceConversion.Invoices((main.java.com.campfhir.model.Invoice) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  InvoiceDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Invoice> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  InvoiceDao.findAll();
		List<main.java.com.campfhir.model.Invoice> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Invoice) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 InvoiceDao.openCurrentSessionwithTransaction();
		 InvoiceDao.deleteAll();
		 InvoiceDao.closeCurrentSessionwithTransaction();
	}

	public InvoiceDao  InvoiceDao() 
	{
		return  InvoiceDao;
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

