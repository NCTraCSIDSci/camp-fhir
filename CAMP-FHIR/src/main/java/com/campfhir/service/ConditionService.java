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
import org.hl7.fhir.exceptions.FHIRException;
import org.xml.sax.SAXException;

import com.campfhir.dao.ConditionDao;
import com.campfhir.model.Condition;
import com.campfhir.model.Encounter;
import com.campfhir.service.conversion.ConditionConversion;

import ca.uhn.fhir.context.FhirContext;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-08-20 
*/
public class ConditionService 
{

	private static ConditionDao conditionDao;
	private static ConditionConversion cc;

	public ConditionService() 
	{
		conditionDao = new ConditionDao();
		cc = new ConditionConversion();
	}

	public void persist(Condition entity) throws ParserConfigurationException, SAXException, IOException 
	{
		conditionDao.openCurrentSessionwithTransaction();
		conditionDao.persist(entity);
		conditionDao.closeCurrentSessionwithTransaction();
	}

	public void update(Condition entity) throws ParserConfigurationException, SAXException, IOException 
	{
		conditionDao.openCurrentSessionwithTransaction();
		conditionDao.update(entity);
		conditionDao.closeCurrentSessionwithTransaction();
	}

	public Condition findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		conditionDao.openCurrentSession();
		Condition condition = conditionDao.findById(id);
		conditionDao.closeCurrentSession();
		return condition;
	}
	
	public List<Condition> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		conditionDao.openCurrentSession();
		List<Condition> conditions = conditionDao.findByPatientId(id);
		conditionDao.closeCurrentSession();
		return conditions;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		conditionDao.openCurrentSessionwithTransaction();
		Condition condition = conditionDao.findById(id);
		conditionDao.delete(condition);
		conditionDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session = conditionDao.openCurrentSession();
		ScrollableResults conditions = conditionDao.findAll();
		
	     int i = 0;
	     System.out.println("start");
	     Bundle bundle = new Bundle().setType(BundleType.COLLECTION);
	     

	     while ( conditions.next() ) 
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
			   .setFullUrl("https://www.hl7.org/fhir/condition.html")  			   
			   .setResource(cc.Conditions((Condition) conditions.get(0)));
			
			
			System.out.println(i);
	     }
	     
	     writeFile(path, i, bundle);
		 conditionDao.closeCurrentSession();
	}
	
	public List<Condition> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults conditions = conditionDao.findAll();
		List<Condition> e = new ArrayList<>();  

		while ( conditions.next() ) 
		{		
			e.add((Condition) conditions.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		conditionDao.openCurrentSessionwithTransaction();
		conditionDao.deleteAll();
		conditionDao.closeCurrentSessionwithTransaction();
	}

	public ConditionDao conditionDao() 
	{
		return conditionDao;
	}
	
	public static void writeFile(String path, int domain, Bundle bundle)
	{			
	    
		
		try 
		{
			BufferedWriter writer;
			
			writer = new BufferedWriter(new FileWriter(path+"/"+domain+".json"));
			
			String file = FhirContext.forDstu3().newJsonParser().setPrettyPrint(true).encodeResourceToString(bundle);
			
		    writer.write(file);
		    writer.close();

		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}

	    
	}
}
