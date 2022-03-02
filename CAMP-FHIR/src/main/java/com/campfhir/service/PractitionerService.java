package main.java.com.campfhir.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

import main.java.com.campfhir.dao.PractitionerDao;
import main.java.com.campfhir.model.Campfhir;
import main.java.com.campfhir.model.Practitioner;
import main.java.com.campfhir.service.conversion.PractitionerConversion;

import ca.uhn.fhir.context.FhirContext;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/
public class PractitionerService 
{

	private static PractitionerDao practitionerDao;
	private static PractitionerConversion pc;

	public PractitionerService() 
	{
		practitionerDao = new PractitionerDao();
		pc = new PractitionerConversion();
	}
/*
	public void persist(List<Practitioner> practitionerList) throws ParserConfigurationException, SAXException, IOException 
	{
		Iterator<Practitioner> practitionerIterator = practitionerList.iterator();
		
		practitionerDao.openCurrentSessionwithTransaction();
		
		while (practitionerIterator.hasNext()) 
		{
			practitionerDao.persist(practitionerIterator.next());
		}
		
		practitionerDao.closeCurrentSessionwithTransaction();
	}

	public void update(Practitioner entity) throws ParserConfigurationException, SAXException, IOException 
	{
		practitionerDao.openCurrentSessionwithTransaction();
		practitionerDao.update(entity);
		practitionerDao.closeCurrentSessionwithTransaction();
	}

	public Practitioner findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		practitionerDao.openCurrentSession();
		Practitioner practitioner = practitionerDao.findById(id);
		practitionerDao.closeCurrentSession();
		return practitioner;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		practitionerDao.openCurrentSessionwithTransaction();
		Practitioner practitioner = practitionerDao.findById(id);
		practitionerDao.delete(practitioner);
		practitionerDao.closeCurrentSessionwithTransaction();
	}
*/
	public void findAll(int partition, Campfhir cf) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session = practitionerDao.openCurrentSession(cf);
		
		 ScrollableResults practitioner = practitionerDao.findAll();
	     int i = 1;
	     System.out.println("start");
	     Bundle bundle = new Bundle().setType(BundleType.COLLECTION);
	     

	     while ( practitioner.next() ) 
	     {	
			if ((i % partition) == 0)
			{
				System.out.println(i);
				session.clear();
				
				writeFile(cf.getOutputfolder(), i, bundle);
			    bundle = new Bundle().setType(BundleType.COLLECTION);
			}
			
			i++;
			
			bundle.addEntry()
			   .setFullUrl("https://www.hl7.org/fhir/practitioner.html")  			   
			   .setResource(pc.Practitioners((Practitioner) practitioner.get(0)));
			
	     }
	     
	     writeFile(cf.getOutputfolder(), i, bundle);
	     practitionerDao.closeCurrentSession();
	}
/*
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		practitionerDao.openCurrentSessionwithTransaction();
		practitionerDao.deleteAll();
		practitionerDao.closeCurrentSessionwithTransaction();
	}
*/
	public PractitionerDao practitionerDao() 
	{
		return practitionerDao;
	}
	
    
public static void writeFile(String path, int domain, Bundle bundle)
{			
	FhirContext ctx = FhirContext.forR4();
	String file = ctx.newJsonParser().setPrettyPrint(false).encodeResourceToString(bundle);
	

	
	try 
	{
	    BufferedWriter writer;
		writer = new BufferedWriter(new FileWriter(path+"/"+domain+".json"));
	    writer.write(file);
	    writer.close();
	} 
	catch (IOException e) 
	{
		e.printStackTrace();
	}
}
}
