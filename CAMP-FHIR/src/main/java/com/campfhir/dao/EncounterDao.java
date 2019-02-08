package com.campfhir.dao;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.xml.sax.SAXException;

import com.campfhir.model.Encounter;

import utils.HibernateBaseDB;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/
public class EncounterDao implements EncounterDaoInterface<Encounter, String> 
{
	private Session currentSession;
	private SessionFactory sessionFactory;
	
	private Transaction currentTransaction;

	public EncounterDao() {}

	public Session openCurrentSession() throws ParserConfigurationException, SAXException, IOException 
	{
		sessionFactory = HibernateBaseDB.getSessionFactory();
		currentSession = sessionFactory.openSession();
		return currentSession;
	}

	public Session openCurrentSessionwithTransaction() throws ParserConfigurationException, SAXException, IOException 
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

	public void persist(Encounter entity) 
	{
		getCurrentSession().save(entity);
	}

	public void update(Encounter entity) 
	{
		getCurrentSession().update(entity);
	}

	public Encounter findById(String id) 
	{
		Encounter encounter = (Encounter) getCurrentSession().get(Encounter.class, id);
		return encounter; 
	}

	public void delete(Encounter entity) 
	{
		getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public List<Encounter> findAll() 
	{
		Query query = getCurrentSession().createQuery("FROM Encounter");
		
		List<Encounter> encounter = (List<Encounter>) query.list();
		
		return encounter;
	}

	public void deleteAll() 
	{
		List<Encounter> entityList = findAll();
		for (Encounter entity : entityList) {
			delete(entity);
		}
	}
}
