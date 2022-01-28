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
import main.java.com.campfhir.dao.PaymentnoticeDao;
import main.java.com.campfhir.service.conversion.PaymentnoticeConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Paymentnotice.
 * @see .Paymentnotice
 * @author Paul Kovach
 */

public class PaymentnoticeService {

	private static PaymentnoticeDao PaymentnoticeDao;
	private static PaymentnoticeConversion PaymentnoticeConversion;

	public PaymentnoticeService() 
	{
		PaymentnoticeDao = new PaymentnoticeDao();
		PaymentnoticeConversion = new PaymentnoticeConversion();
	}

	public void persist(main.java.com.campfhir.model.Paymentnotice entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 PaymentnoticeDao.openCurrentSessionwithTransaction();
		 PaymentnoticeDao.persist(entity);
		 PaymentnoticeDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Paymentnotice entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 PaymentnoticeDao.openCurrentSessionwithTransaction();
		 PaymentnoticeDao.update(entity);
		 PaymentnoticeDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Paymentnotice findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		PaymentnoticeDao.openCurrentSession();
		main.java.com.campfhir.model.Paymentnotice resource = PaymentnoticeDao.findById(id);
		PaymentnoticeDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Paymentnotice> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		PaymentnoticeDao.openCurrentSession();
		List<main.java.com.campfhir.model.Paymentnotice> resource =  PaymentnoticeDao.findByPatientId(id);
		PaymentnoticeDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		PaymentnoticeDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Paymentnotice resource =  PaymentnoticeDao.findById(id);
		PaymentnoticeDao.delete(resource);
		PaymentnoticeDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  PaymentnoticeDao.openCurrentSession();
		ScrollableResults resources =  PaymentnoticeDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Paymentnotice.html")  			   
			   .setResource(PaymentnoticeConversion.Paymentnotices((main.java.com.campfhir.model.Paymentnotice) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  PaymentnoticeDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Paymentnotice> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  PaymentnoticeDao.findAll();
		List<main.java.com.campfhir.model.Paymentnotice> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Paymentnotice) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 PaymentnoticeDao.openCurrentSessionwithTransaction();
		 PaymentnoticeDao.deleteAll();
		 PaymentnoticeDao.closeCurrentSessionwithTransaction();
	}

	public PaymentnoticeDao  PaymentnoticeDao() 
	{
		return  PaymentnoticeDao;
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

