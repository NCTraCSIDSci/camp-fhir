package com.campfhir.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.hibernate.HibernateException;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.dstu3.model.Bundle;
import org.hl7.fhir.dstu3.model.Bundle.BundleType;
import org.hl7.fhir.exceptions.FHIRException;
import org.xml.sax.SAXException;

import com.campfhir.dao.ObservationDao;
import com.campfhir.model.Encounter;
import com.campfhir.model.Lab;
import com.campfhir.model.MedicationRequest;
import com.campfhir.model.Observation;
import com.campfhir.model.Vital;
import com.campfhir.service.conversion.EncounterConversion;
import com.campfhir.service.conversion.LabConversion;
import com.campfhir.service.conversion.MedicationRequestConversion;
import com.campfhir.service.conversion.VitalConversion;

import ca.uhn.fhir.context.FhirContext;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-08-20 
*/
public class ObservationService 
{
	private static ObservationDao observationDao;

	public ObservationService() 
	{
		observationDao = new ObservationDao();
	}

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

	public ScrollableResults findAll() throws ParserConfigurationException, SAXException, IOException 
	{
		observationDao.openCurrentSession();
		ScrollableResults observations = observationDao.findAll();
		observationDao.closeCurrentSession();
		return observations;
	}

	public void findAllLab(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException, HibernateException, FHIRException 
	{
		Session session = observationDao.openCurrentSession();
		ScrollableResults labs = observationDao.findAllLab();
			
		int i = 0;
		System.out.println("start");
		Bundle bundle = new Bundle().setType(BundleType.COLLECTION);
		while ( labs.next() ) 
		{	
			if ((i % partition) == 0)
			{
				System.out.println("Write");				
				writeFile(path, i, bundle);
			    session.flush();
			    session.clear();
				bundle = new Bundle().setType(BundleType.COLLECTION);
			}
				
			i++;
				
			bundle.addEntry()
			   .setFullUrl("https://www.hl7.org/fhir/lab.html")
			   .setResource(new LabConversion().Labs((Lab) labs.get(0)));
				
			System.out.println(i);
		}
		     
		writeFile(path, i, bundle);
		observationDao.closeCurrentSession();
	}
	
	public List<Lab> findPatientAllLab() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults labs = observationDao.findAll();
		List<Lab> e = new ArrayList<>();  

		while ( labs.next() ) 
		{		
			e.add((Lab) labs.get(0));
		}

		return e;
	}

	public void findAllVital(int partition, String path) throws ParserConfigurationException, SAXException, IOException, HibernateException, ParseException, FHIRException 
	{
		Session session = observationDao.openCurrentSession();
		 ScrollableResults vitals = observationDao.findAllVital();
			
	     int i = 0;
	     System.out.println("start");
	     Bundle bundle = new Bundle().setType(BundleType.COLLECTION);
	     while ( vitals.next() ) 
	     {	
			if ((i % partition) == 0)
			{
				System.out.println("Write");				
				writeFile("/opt/Observation_VitalsSmoking/", i, bundle);
		    	session.flush();
		    	session.clear();
			    bundle = new Bundle().setType(BundleType.COLLECTION);
			}
			
			i++;
			
			bundle.addEntry()
			   .setFullUrl("https://www.hl7.org/fhir/vital.html")
			   .setResource(new VitalConversion().Vitals((Vital) vitals.get(0)));
			
			System.out.println(i);
	     }
	     
	     writeFile("/opt/Observation_VitalsSmoking/", i, bundle);
		observationDao.closeCurrentSession();
	}
	
	public List<Vital> findPatientAllVital() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults vitals = observationDao.findAll();
		List<Vital> e = new ArrayList<>();  

		while ( vitals.next() ) 
		{		
			e.add((Vital) vitals.get(0));
		}

		return e;
	}

	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		observationDao.openCurrentSessionwithTransaction();
		observationDao.deleteAll();
		observationDao.closeCurrentSessionwithTransaction();
	}

	public ObservationDao observationDao() 
	{
		return observationDao;
	}
	
	public static void writeFile(String path, int domain, Bundle bundle)
	{			
		FhirContext ctx = FhirContext.forDstu3();
		String file = ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(bundle);
		
	    
		
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
