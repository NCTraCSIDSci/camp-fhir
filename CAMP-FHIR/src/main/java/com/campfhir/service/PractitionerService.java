package com.campfhir.service;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.campfhir.dao.PractitionerDao;
import com.campfhir.model.Practitioner;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/
public class PractitionerService 
{

	private static PractitionerDao practitionerDao;

	public PractitionerService() 
	{
		practitionerDao = new PractitionerDao();
	}

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

	public List<Practitioner> findAll() throws ParserConfigurationException, SAXException, IOException 
	{
		practitionerDao.openCurrentSession();
		List<Practitioner> practitioners = practitionerDao.findAll();
		
		practitionerDao.closeCurrentSession();
		return practitioners;
	}

	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		practitionerDao.openCurrentSessionwithTransaction();
		practitionerDao.deleteAll();
		practitionerDao.closeCurrentSessionwithTransaction();
	}

	public PractitionerDao practitionerDao() 
	{
		return practitionerDao;
	}
}
