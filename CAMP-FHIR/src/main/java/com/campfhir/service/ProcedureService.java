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

import com.campfhir.dao.ProcedureDao;
import com.campfhir.model.Condition;
import com.campfhir.model.Procedure;
import com.campfhir.model.Vital;
import com.campfhir.service.conversion.ConditionConversion;
import com.campfhir.service.conversion.EncounterConversion;
import com.campfhir.service.conversion.ProcedureConversion;

import ca.uhn.fhir.context.FhirContext;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-08-20 
*/
public class ProcedureService 
{

	private static ProcedureDao procedureDao;
	private static ProcedureConversion pr;

	public ProcedureService() 
	{
		procedureDao = new ProcedureDao();
		pr = new ProcedureConversion();
	}

	public void persist(Procedure entity) throws ParserConfigurationException, SAXException, IOException 
	{
		procedureDao.openCurrentSessionwithTransaction();
		procedureDao.persist(entity);
		procedureDao.closeCurrentSessionwithTransaction();
	}

	public void update(Procedure entity) throws ParserConfigurationException, SAXException, IOException 
	{
		procedureDao.openCurrentSessionwithTransaction();
		procedureDao.update(entity);
		procedureDao.closeCurrentSessionwithTransaction();
	}

	public Procedure findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		procedureDao.openCurrentSession();
		Procedure procedure = procedureDao.findById(id);
		procedureDao.closeCurrentSession();
		return procedure;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		procedureDao.openCurrentSessionwithTransaction();
		Procedure procedure = procedureDao.findById(id);
		procedureDao.delete(procedure);
		procedureDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException, HibernateException, FHIRException 
	{
		Session session = procedureDao.openCurrentSession();
		
		ScrollableResults procedures = procedureDao.findAll();
	     int i = 0;
	     System.out.println("start");
	     Bundle bundle = new Bundle().setType(BundleType.COLLECTION);
	     

	     while ( procedures.next() ) 
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
			   .setFullUrl("https://www.hl7.org/fhir/procedure.html")  			   
			   .setResource(pr.Procedures((Procedure) procedures.get(0)));
			
			
			System.out.println(i);
	     }
	     
	     writeFile("/opt/Procedure/", i, bundle);
		procedureDao.closeCurrentSession();
	}
	
	public List<Procedure> findPatientAllProcedure() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults procedures = procedureDao.findAll();
		List<Procedure> e = new ArrayList<>();  

		while ( procedures.next() ) 
		{		
			e.add((Procedure) procedures.get(0));
		}

		return e;
	}

	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		procedureDao.openCurrentSessionwithTransaction();
		procedureDao.deleteAll();
		procedureDao.closeCurrentSessionwithTransaction();
	}

	public ProcedureDao procedureDao() 
	{
		return procedureDao;
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
