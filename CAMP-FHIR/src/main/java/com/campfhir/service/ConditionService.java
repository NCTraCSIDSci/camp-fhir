package com.campfhir.service;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.campfhir.dao.ConditionDao;
import com.campfhir.model.Condition;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/
public class ConditionService 
{

	private static ConditionDao conditionDao;

	public ConditionService() 
	{
		conditionDao = new ConditionDao();
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

	public List<Condition> findAll() throws ParserConfigurationException, SAXException, IOException 
	{
		conditionDao.openCurrentSession();
		List<Condition> conditions = conditionDao.findAll();
		conditionDao.closeCurrentSession();
		return conditions;
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
}
