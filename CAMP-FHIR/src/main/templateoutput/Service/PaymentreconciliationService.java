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
import main.java.com.campfhir.dao.PaymentreconciliationDao;
import main.java.com.campfhir.service.conversion.PaymentreconciliationConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Paymentreconciliation.
 * @see .Paymentreconciliation
 * @author Paul Kovach
 */

public class PaymentreconciliationService {

	private static PaymentreconciliationDao PaymentreconciliationDao;
	private static PaymentreconciliationConversion PaymentreconciliationConversion;

	public PaymentreconciliationService() 
	{
		PaymentreconciliationDao = new PaymentreconciliationDao();
		PaymentreconciliationConversion = new PaymentreconciliationConversion();
	}

	public void persist(main.java.com.campfhir.model.Paymentreconciliation entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 PaymentreconciliationDao.openCurrentSessionwithTransaction();
		 PaymentreconciliationDao.persist(entity);
		 PaymentreconciliationDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Paymentreconciliation entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 PaymentreconciliationDao.openCurrentSessionwithTransaction();
		 PaymentreconciliationDao.update(entity);
		 PaymentreconciliationDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Paymentreconciliation findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		PaymentreconciliationDao.openCurrentSession();
		main.java.com.campfhir.model.Paymentreconciliation resource = PaymentreconciliationDao.findById(id);
		PaymentreconciliationDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Paymentreconciliation> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		PaymentreconciliationDao.openCurrentSession();
		List<main.java.com.campfhir.model.Paymentreconciliation> resource =  PaymentreconciliationDao.findByPatientId(id);
		PaymentreconciliationDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		PaymentreconciliationDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Paymentreconciliation resource =  PaymentreconciliationDao.findById(id);
		PaymentreconciliationDao.delete(resource);
		PaymentreconciliationDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  PaymentreconciliationDao.openCurrentSession();
		ScrollableResults resources =  PaymentreconciliationDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Paymentreconciliation.html")  			   
			   .setResource(PaymentreconciliationConversion.Paymentreconciliations((main.java.com.campfhir.model.Paymentreconciliation) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  PaymentreconciliationDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Paymentreconciliation> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  PaymentreconciliationDao.findAll();
		List<main.java.com.campfhir.model.Paymentreconciliation> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Paymentreconciliation) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 PaymentreconciliationDao.openCurrentSessionwithTransaction();
		 PaymentreconciliationDao.deleteAll();
		 PaymentreconciliationDao.closeCurrentSessionwithTransaction();
	}

	public PaymentreconciliationDao  PaymentreconciliationDao() 
	{
		return  PaymentreconciliationDao;
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

