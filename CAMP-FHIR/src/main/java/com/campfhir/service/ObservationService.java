package com.campfhir.service;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.campfhir.dao.ObservationDao;
import com.campfhir.model.Lab;
import com.campfhir.model.Observation;
import com.campfhir.model.Vital;

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

	public List<Observation> findAll() throws ParserConfigurationException, SAXException, IOException 
	{
		observationDao.openCurrentSession();
		List<Observation> observations = observationDao.findAll();
		observationDao.closeCurrentSession();
		return observations;
	}

	public List<Lab> findAllLab() throws ParserConfigurationException, SAXException, IOException 
	{
		observationDao.openCurrentSession();
		List<Lab> observations = observationDao.findAllLab();
		observationDao.closeCurrentSession();
		return observations;
	}

	public List<Vital> findAllVital() throws ParserConfigurationException, SAXException, IOException 
	{
		observationDao.openCurrentSession();
		List<Vital> observations = observationDao.findAllVital();
		observationDao.closeCurrentSession();
		return observations;
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
}
