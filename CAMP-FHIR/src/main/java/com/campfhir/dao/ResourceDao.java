package main.java.com.campfhir.dao;

import java.io.IOException;


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
import main.java.com.campfhir.model.Patient;
import main.java.com.campfhir.model.Resource;
import main.java.utils.HibernateBaseDB;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/
public class ResourceDao implements ResourceDaoInterface<Resource, String> 
{
	private Session currentSession;
	private SessionFactory sessionFactory;
	
	private Transaction currentTransaction;

	public ResourceDao() {}

	public Session openCurrentSession(Campfhir cf, String direction) 
			throws ParserConfigurationException, SAXException, IOException 
	{
		sessionFactory = HibernateBaseDB.getSessionFactory(cf, direction);
//		currentSession = sessionFactory.openSession();
		currentSession = sessionFactory.getCurrentSession();
		return currentSession;
	}

	public Session openCurrentSessionwithTransaction(Campfhir cf, String direction) 
			throws ParserConfigurationException, SAXException, IOException 
	{
		sessionFactory = HibernateBaseDB.getSessionFactory( cf,  direction);
//		currentSession = sessionFactory.openSession();
		currentSession = sessionFactory.getCurrentSession();
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
	
	public  SessionFactory getSessionFactory() {
		return this.sessionFactory;
	}
//	private static SessionFactory getSessionFactory() 
//	{
//		Configuration configuration = new Configuration().configure();
//		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
//				.applySettings(configuration.getProperties());
//		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
//		return sessionFactory;
//	}

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

	public void persist(Resource entity) 
	{
//		Transaction currtransaction = getCurrentSession().beginTransaction();
		getCurrentSession().save((Resource) entity);
//		currtransaction.commit();
		
		
		
	}
	
	public ScrollableResults findAll(Campfhir cf) 
	{
		ScrollableResults patients = null;
		
		patients = currentSession.createQuery("FROM "+cf.getResource())
				.setReadOnly(true)
		        .setCacheable(true)
		    .scroll(ScrollMode.FORWARD_ONLY);

		return patients;
	}
}
