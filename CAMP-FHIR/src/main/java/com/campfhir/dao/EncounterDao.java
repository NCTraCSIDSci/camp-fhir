package main.java.com.campfhir.dao;

import java.io.IOException;
import java.util.List;

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

import main.java.com.campfhir.model.Campfhir;
import main.java.com.campfhir.model.Encounter;

import main.java.utils.HibernateBaseDB;

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

	public Session openCurrentSession(Campfhir cf) throws ParserConfigurationException, SAXException, IOException 
	{
		sessionFactory = HibernateBaseDB.getSessionFactory(cf);
		currentSession = sessionFactory.openSession();
		return currentSession;
	}
/*
	public Session openCurrentSessionwithTransaction() throws ParserConfigurationException, SAXException, IOException 
	{
		sessionFactory = HibernateBaseDB.getSessionFactory();
		currentSession = sessionFactory.openSession();
		currentTransaction = currentSession.beginTransaction();
		return currentSession;
	}
*/	
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

	public List<Encounter> findByPatientId(String id) 
	{
		Query query = getCurrentSession().createQuery("FROM Encounter where ENC_SUBJECT_REFERENCE = 'Patient/"+id+"'");
		
		List<Encounter> encounters = (List<Encounter>) query.list();
		
		return encounters; 
	}

	public void delete(Encounter entity) 
	{
		getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public ScrollableResults findAll() 
	{
		ScrollableResults encounters = getCurrentSession().createQuery("FROM Encounter")
				.setReadOnly(true)
		        .setCacheable(true)
		    .scroll(ScrollMode.FORWARD_ONLY);
		
		return encounters;
	}

	public void deleteAll() 
	{
//		List<Encounter> entityList = findAll();
//		for (Encounter entity : entityList) {
//			delete(entity);
//		}
	}
}
