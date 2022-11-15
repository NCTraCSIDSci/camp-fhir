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
//import org.hl7.fhir.r4.model.Resource;
import main.java.com.campfhir.model.Resource;
import org.xml.sax.SAXException;

import main.java.com.campfhir.model.Campfhir;

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

	public Session openCurrentSession(Campfhir cf) 
			throws ParserConfigurationException, SAXException, IOException 
	{
		sessionFactory = HibernateBaseDB.getSessionFactory(cf);
		currentSession = sessionFactory.openSession();
		return currentSession;
	}

	public Session openCurrentSessionwithTransaction(Campfhir cf) 
			throws ParserConfigurationException, SAXException, IOException 
	{
		sessionFactory = HibernateBaseDB.getSessionFactory(cf);
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


//	public ScrollableResults findAll(int start, int max) 
//	{
//		ScrollableResults patients = getCurrentSession().createQuery("FROM Patient order by ID ASC")
//				.setFirstResult(start)
//				.setMaxResults(max)
//				.setReadOnly(true)
//		        .setCacheable(true)
//		    .scroll(ScrollMode.FORWARD_ONLY);
//		
//
//
//		return patients;
//	}
	
	public ScrollableResults findAll(Campfhir cf) 
	{
		ScrollableResults patients = getCurrentSession().createQuery("FROM "+cf.getResource())
				.setReadOnly(true)
		        .setCacheable(true)
		    .scroll(ScrollMode.FORWARD_ONLY);
		
		return patients;
	}

//	@SuppressWarnings("deprecation")
//	public void persist(Campfhir cf, main.java.com.campfhir.model.Resource resource) {
//		getCurrentSession().save(cf.getResource(), resource);
//
//		
//	}

	@Override
	public void persist(Resource entity) {
		getCurrentSession().save(entity);
		
	}
}
