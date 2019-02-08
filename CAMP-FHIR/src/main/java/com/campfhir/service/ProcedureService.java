package com.campfhir.service;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.campfhir.dao.ProcedureDao;
import com.campfhir.model.Procedure;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/
public class ProcedureService 
{

	private static ProcedureDao procedureDao;

	public ProcedureService() 
	{
		procedureDao = new ProcedureDao();
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

	public List<Procedure> findAll() throws ParserConfigurationException, SAXException, IOException 
	{
		procedureDao.openCurrentSession();
		List<Procedure> procedures = procedureDao.findAll();
		procedureDao.closeCurrentSession();
		return procedures;
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
}
