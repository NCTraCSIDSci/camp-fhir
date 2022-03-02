package main.java.com.campfhir.service;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import javax.xml.parsers.ParserConfigurationException;

import org.hibernate.HibernateException;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleEntryComponent;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

import main.java.com.campfhir.dao.ObservationDao;
import main.java.com.campfhir.model.Campfhir;
import main.java.com.campfhir.model.Observation;
import main.java.com.campfhir.service.conversion.ObservationConversion;

import ca.uhn.fhir.context.FhirContext;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/
public class ObservationService 
{
	private static ObservationDao observationDao;

	public ObservationService() 
	{
		observationDao = new ObservationDao();
	}
/*
	public void persist(Observation entity) throws ParserConfigurationException, SAXException, IOException 
	{
		observationDao.openCurrentSessionwithTransaction();
		observationDao.persist(entity);
		observationDao.closeCurrentSessionwithTransaction();
	}

	public void update(Observation entity) throws ParserConfigurationException, SAXException, IOException 
	{
		observationDao.openCurrentSessionwithTransaction();
		observationDao.update(entity);
		observationDao.closeCurrentSessionwithTransaction();
	}

	public Observation findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		observationDao.openCurrentSession();
		Observation observation = observationDao.findById(id);
		observationDao.closeCurrentSession();
		return observation;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		observationDao.openCurrentSessionwithTransaction();
		Observation observation = observationDao.findById(id);
		observationDao.delete(observation);
		observationDao.closeCurrentSessionwithTransaction();
	}
*/


	public void findAll(int partition, Campfhir cf) throws ParserConfigurationException, SAXException, IOException, ParseException, HibernateException, FHIRException 
	{
		Session session = observationDao.openCurrentSession(cf);
		ScrollableResults observations = observationDao.findAllLab();
			
		int i = 1;
		System.out.println("start");
		
		Bundle bundle = new Bundle().setType(BundleType.COLLECTION);
		BundleEntryComponent b = new BundleEntryComponent();
		
		while ( observations.next() ) 
		{	
			if ((i % partition) == 0)
			{
				System.out.println(i);
				session.clear();
				
				writeFile(cf.getOutputfolder(), i, bundle);
				bundle = new Bundle().setType(BundleType.COLLECTION);
				//b = new BundleEntryComponent();
			}
				
			i++;
			
			b = new BundleEntryComponent();
			
			b.setFullUrl("https://www.hl7.org/fhir/lab.html")
			   .setResource(new ObservationConversion().Observations((Observation) observations.get(0)));
			
			bundle.addEntry(b);
		}
		     
		writeFile(cf.getOutputfolder(), i, bundle);
		observationDao.closeCurrentSession();
	}
/*
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		observationDao.openCurrentSessionwithTransaction();
		observationDao.deleteAll();
		observationDao.closeCurrentSessionwithTransaction();
	}
*/
	public ObservationDao observationDao() 
	{
		return observationDao;
	}
	
	public static void writeFile(String path, int domain, Bundle bundle)
	{			
		FhirContext ctx = FhirContext.forR4();
		String file = ctx.newJsonParser().setPrettyPrint(false).encodeResourceToString(bundle);
		
	    
		
		try 
		{
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path+"/"+domain+".json", true), StandardCharsets.UTF_8));
		    writer.write(file);
		    writer.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
