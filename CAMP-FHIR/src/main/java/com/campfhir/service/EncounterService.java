package com.campfhir.service;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.campfhir.dao.EncounterDao;
import com.campfhir.model.Encounter;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/
public class EncounterService 
{

	private static EncounterDao encounterDao;

	public EncounterService() 
	{
		encounterDao = new EncounterDao();
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

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		encounterDao.openCurrentSessionwithTransaction();
		Encounter encounter = encounterDao.findById(id);
		encounterDao.delete(encounter);
		encounterDao.closeCurrentSessionwithTransaction();
	}

	public List<Encounter> findAll() throws ParserConfigurationException, SAXException, IOException 
	{
		encounterDao.openCurrentSession();
		List<Encounter> encounters = encounterDao.findAll();
		encounterDao.closeCurrentSession();
		return encounters;
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
}
