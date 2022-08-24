package main.java.com.campfhir.dao;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.hibernate.ScrollMode;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.xml.sax.SAXException;

import main.java.com.campfhir.model.Campfhir;
import main.java.com.campfhir.model.Observation;
import main.java.utils.HibernateBaseDB;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/
public class ObservationDao implements ObservationDaoInterface<Observation, String> 
{
	private Session currentSession;
	private SessionFactory sessionFactory;
	
	private Transaction currentTransaction;

	public ObservationDao() {}

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

	public void persist(Observation entity) 
	{
		getCurrentSession().save(entity);
	}

	public void update(Observation entity) 
	{
		getCurrentSession().update(entity);
	}

	public Observation findById(String id) 
	{
		Observation observation = (Observation) getCurrentSession().get(Observation.class, id);
		return observation; 
	}

	public void delete(Observation entity) 
	{
		getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public ScrollableResults findAll() 
	{		
		ScrollableResults o = getCurrentSession().createQuery("FROM Observation")
			    .scroll(ScrollMode.FORWARD_ONLY);
		return o;
	}

	@SuppressWarnings("unchecked")
	public ScrollableResults findAllLab() 
	{		
		ScrollableResults labs = getCurrentSession().createQuery("FROM Lab")
				.setReadOnly(true)
		        .setCacheable(true)
			    .scroll(ScrollMode.FORWARD_ONLY);
		return labs;
	}

	@SuppressWarnings("unchecked")
	public ScrollableResults findAllVital() 
	{		
		ScrollableResults vitals = getCurrentSession().createQuery("FROM Vital")
				.setReadOnly(true)
		        .setCacheable(true)
			    .scroll(ScrollMode.FORWARD_ONLY);
		return vitals;
	}
	
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
