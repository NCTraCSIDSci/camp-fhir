package com.campfhir.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.dstu3.model.Bundle;
import org.hl7.fhir.dstu3.model.Bundle.BundleType;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.exceptions.FHIRException;
import org.xml.sax.SAXException;

import com.campfhir.dao.EncounterDao;
import com.campfhir.model.Condition;
import com.campfhir.model.Encounter;
import com.campfhir.service.conversion.ConditionConversion;
import com.campfhir.service.conversion.EncounterConversion;

import ca.uhn.fhir.context.FhirContext;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-08-20 
*/
public class EncounterService 
{

	private static EncounterDao encounterDao;
	private static EncounterConversion en;

	public EncounterService() 
	{
		encounterDao = new EncounterDao();
		en = new EncounterConversion();
	}

	public void persist(Encounter entity) throws ParserConfigurationException, SAXException, IOException 
	{
		encounterDao.openCurrentSessionwithTransaction();
		encounterDao.persist(entity);
		encounterDao.closeCurrentSessionwithTransaction();
	}

	public void update(Encounter entity) throws ParserConfigurationException, SAXException, IOException 
	{
		encounterDao.openCurrentSessionwithTransaction();
		encounterDao.update(entity);
		encounterDao.closeCurrentSessionwithTransaction();
	}

	public Encounter findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		encounterDao.openCurrentSession();
		Encounter encounter = encounterDao.findById(id);
		encounterDao.closeCurrentSession();
		return encounter;
	}
	
	public List<Encounter> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		encounterDao.openCurrentSession();
		List<Encounter> encounter = encounterDao.findByPatientId(id);
		encounterDao.closeCurrentSession();
		return encounter;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		encounterDao.openCurrentSessionwithTransaction();
		Encounter encounter = encounterDao.findById(id);
		encounterDao.delete(encounter);
		encounterDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		Session session = encounterDao.openCurrentSession();
		ScrollableResults encounters = encounterDao.findAll();
		
				
	     int i = 0;
	     System.out.println("start");	     
  		 Bundle bundle = new Bundle().setType(BundleType.COLLECTION);
	     
	     while ( encounters.next() ) 
	     {	
			if ((i % partition) == 0)
			{
		    	session.flush();
		    	session.clear();
		    	writeFile(path, i, bundle);
			    bundle = new Bundle().setType(BundleType.COLLECTION);
			}
			
			i++;
			
			bundle.addEntry()
			   .setFullUrl("https://www.hl7.org/fhir/encounter.html")  			   
			   .setResource(en.Encounters((Encounter) encounters.get(0)));
			
			
			System.out.println(i);
	     }
	     
	    writeFile(path, i, bundle);
		encounterDao.closeCurrentSession();
	}
	
	public List<Encounter> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults encounters = encounterDao.findAll();
		List<Encounter> e = new ArrayList<>();  

		while ( encounters.next() ) 
		{		
			e.add((Encounter) encounters.get(0));
		}

		return e;
	}
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		encounterDao.openCurrentSessionwithTransaction();
		encounterDao.deleteAll();
		encounterDao.closeCurrentSessionwithTransaction();
	}

	public EncounterDao encounterDao() 
	{
		return encounterDao;
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
