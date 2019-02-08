package com.campfhir.service;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.campfhir.dao.MedicationRequestDao;
import com.campfhir.model.MedicationRequest;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/
public class MedicationRequestService 
{

	private static MedicationRequestDao medicationRequestDao;

	public MedicationRequestService() 
	{
		medicationRequestDao = new MedicationRequestDao();
	}

	public void persist(MedicationRequest entity) throws ParserConfigurationException, SAXException, IOException 
	{
		medicationRequestDao.openCurrentSessionwithTransaction();
		medicationRequestDao.persist(entity);
		medicationRequestDao.closeCurrentSessionwithTransaction();
	}
	
	public void persist(List<MedicationRequest> medicationList) throws ParserConfigurationException, SAXException, IOException 
	{
		Iterator<MedicationRequest> medicationIterator = medicationList.iterator();
		
		medicationRequestDao.openCurrentSessionwithTransaction();
		
		while (medicationIterator.hasNext()) 
		{
			medicationRequestDao.persist(medicationIterator.next());
		}
		
		medicationRequestDao.closeCurrentSessionwithTransaction();
	}

	public void update(MedicationRequest entity) throws ParserConfigurationException, SAXException, IOException 
	{
		medicationRequestDao.openCurrentSessionwithTransaction();
		medicationRequestDao.update(entity);
		medicationRequestDao.closeCurrentSessionwithTransaction();
	}

	public MedicationRequest findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		medicationRequestDao.openCurrentSession();
		MedicationRequest medication = medicationRequestDao.findById(id);
		medicationRequestDao.closeCurrentSession();
		return medication;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		medicationRequestDao.openCurrentSessionwithTransaction();
		MedicationRequest medication = medicationRequestDao.findById(id);
		medicationRequestDao.delete(medication);
		medicationRequestDao.closeCurrentSessionwithTransaction();
	}

	public List<MedicationRequest> findAll() throws ParserConfigurationException, SAXException, IOException 
	{
		medicationRequestDao.openCurrentSession();
		List<MedicationRequest> medications = medicationRequestDao.findAll();
		medicationRequestDao.closeCurrentSession();
		return medications;
	}

	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		medicationRequestDao.openCurrentSessionwithTransaction();
		medicationRequestDao.deleteAll();
		medicationRequestDao.closeCurrentSessionwithTransaction();
	}

	public MedicationRequestDao medicationRequestDao() 
	{
		return medicationRequestDao;
	}
}
