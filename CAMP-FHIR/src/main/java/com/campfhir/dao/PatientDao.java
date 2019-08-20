package com.campfhir.dao;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.xml.parsers.ParserConfigurationException;

import org.hibernate.Query;
import org.hibernate.ScrollMode;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.xml.sax.SAXException;

import com.campfhir.model.Encounter;
import com.campfhir.model.Patient;

import utils.HibernateBaseDB;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-08-20 
*/
public class PatientDao implements PatientDaoInterface<Patient, String> 
{
	private Session currentSession;
	private SessionFactory sessionFactory;
	
	private Transaction currentTransaction;

	public PatientDao() {}

	public Session openCurrentSession() 
			throws ParserConfigurationException, SAXException, IOException 
	{
		sessionFactory = HibernateBaseDB.getSessionFactory();
		currentSession = sessionFactory.openSession();
		return currentSession;
	}

	public Session openCurrentSessionwithTransaction() 
			throws ParserConfigurationException, SAXException, IOException 
	{
		sessionFactory = HibernateBaseDB.getSessionFactory();
		currentSession = sessionFactory.openSession();
		currentTransaction = currentSession.beginTransaction();
		return currentSession;
	}
	
	public void closeCurrentSession() 
	{
		currentSession.close();
	}
	
	public void closeCurrentSessionwithTransaction() 
	{
		currentTransaction.commit();
		currentSession.close();
	}
	
	private static SessionFactory getSessionFactory() 
	{
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
		return sessionFactory;
	}

	public Session getCurrentSession() 
	{
		return currentSession;
	}

	public void setCurrentSession(Session currentSession) 
	{
		this.currentSession = currentSession;
	}

	public Transaction getCurrentTransaction() 
	{
		return currentTransaction;
	}

	public void setCurrentTransaction(Transaction currentTransaction) 
	{
		this.currentTransaction = currentTransaction;
	}

	public void persist(Patient entity) 
	{
		getCurrentSession().save(entity);
	}

	public void update(Patient entity) 
	{
		getCurrentSession().update(entity);
	}

	public Patient findById(String id) 
	{
		Patient patient = (Patient) getCurrentSession().get(Patient.class, id);
		return patient; 
	}

	public void delete(Patient entity) 
	{
		getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public ScrollableResults findAll() 
	{
		ScrollableResults patients = getCurrentSession().createQuery("FROM Patient")
				.setReadOnly(true)
		        .setCacheable(true)
		    .scroll(ScrollMode.FORWARD_ONLY);

		return patients;
	}

	public void deleteAll() 
	{

	}
}
