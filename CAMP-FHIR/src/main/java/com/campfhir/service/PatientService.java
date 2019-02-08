package com.campfhir.service;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.campfhir.dao.PatientDao;
import com.campfhir.model.Patient;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/
public class PatientService 
{

	private static PatientDao patientDao;

	public PatientService() 
	{
		patientDao = new PatientDao();
	}

	public void persist(List<Patient> patientList) throws ParserConfigurationException, SAXException, IOException 
	{
		Iterator<Patient> patientIterator = patientList.iterator();
		
		patientDao.openCurrentSessionwithTransaction();
		
		while (patientIterator.hasNext()) 
		{
			patientDao.persist(patientIterator.next());
		}
		
		patientDao.closeCurrentSessionwithTransaction();
	}

	public void update(Patient entity) throws ParserConfigurationException, SAXException, IOException 
	{
		patientDao.openCurrentSessionwithTransaction();
		patientDao.update(entity);
		patientDao.closeCurrentSessionwithTransaction();
	}

	public Patient findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		patientDao.openCurrentSession();
		Patient patient = patientDao.findById(id);
		patientDao.closeCurrentSession();
		return patient;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		patientDao.openCurrentSessionwithTransaction();
		Patient patient = patientDao.findById(id);
		patientDao.delete(patient);
		patientDao.closeCurrentSessionwithTransaction();
	}

	public List<Patient> findAll() throws ParserConfigurationException, SAXException, IOException 
	{
		patientDao.openCurrentSession();
		List<Patient> patients = patientDao.findAll();

	
		patientDao.closeCurrentSession();
		return patients;
	}

	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		patientDao.openCurrentSessionwithTransaction();
		patientDao.deleteAll();
		patientDao.closeCurrentSessionwithTransaction();
	}

	public PatientDao patientDao() 
	{
		return patientDao;
	}
}
