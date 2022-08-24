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
import main.java.com.campfhir.model.DocumentReference;
import main.java.utils.HibernateBaseDB;

/**
*
* @author  James Champion
* @version 1.0
* @since   2021-02-22 
*/
public class DocumentReferenceDao implements DocumentReferenceDaoInterface<DocumentReference, String> 
{
	private Session currentSession;
	private SessionFactory sessionFactory;
	
	private Transaction currentTransaction;

	public DocumentReferenceDao() {}

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

	public void persist(DocumentReference entity) 
	{
		getCurrentSession().save(entity);
	}

	public void update(DocumentReference entity) 
	{
		getCurrentSession().update(entity);
	}

	public DocumentReference findById(String id) 
	{
		DocumentReference documentReference = (DocumentReference) getCurrentSession().get(DocumentReference.class, id);
		return documentReference; 
	}
	
	@SuppressWarnings("unchecked")
	public List<DocumentReference> findByPatientId(String id)
	{
//		Query query = getCurrentSession().createQuery("FROM DocumentReference");
//		
//		List<DocumentReference> documentReference = (List<DocumentReference>) query.list();
//		
		return null;//documentReference;
	}

	public void delete(DocumentReference entity) 
	{
		getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public ScrollableResults findAll() 
	{
		return getCurrentSession().createQuery("FROM DocumentReference")
				.setReadOnly(true)
		        .setCacheable(true)
		    .scroll(ScrollMode.FORWARD_ONLY);
	}

	public void deleteAll() 
	{
//		List<DocumentReference> entityList = findAll();
//		for (DocumentReference entity : entityList) {
//			delete(entity);
//		}
	}
}
