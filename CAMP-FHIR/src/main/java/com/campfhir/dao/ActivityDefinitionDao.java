//// default package
package main.java.com.campfhir.dao;
// Generated on Jun 27, 2022, 10:40:29 AM 


import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import main.java.utils.HibernateBaseDB;
import org.hibernate.ScrollMode;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.xml.sax.SAXException;

/**
 *  object for domain model class ActivityDefinition.
 * @see .ActivityDefinition
 * @author Paul Kovach
 */

public class ActivityDefinitionDao {

	private Session currentSession;
	private SessionFactory sessionFactory;
	
	private Transaction currentTransaction;

	public ActivityDefinitionDao() {}
	
    public Session openCurrentSession() throws ParserConfigurationException, SAXException, IOException 
	{
		sessionFactory =  HibernateBaseDB.getSessionFactory();
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

	public void persist( main.java.com.campfhir.model.ActivityDefinition entity) 
	{
		getCurrentSession().save(entity);
	}

	public void update( main.java.com.campfhir.model.ActivityDefinition entity) 
	{
		getCurrentSession().update(entity);
	}

	public  main.java.com.campfhir.model.ActivityDefinition findById(String id) 
	{
		main.java.com.campfhir.model.ActivityDefinition resource = (main.java.com.campfhir.model.ActivityDefinition) getCurrentSession().get(main.java.com.campfhir.model.ActivityDefinition.class, id);
		return resource; 
	}
	
	public void delete(main.java.com.campfhir.model.ActivityDefinition entity) 
	{
		getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public ScrollableResults findAll() 
	{
		return getCurrentSession().createQuery("FROM ActivityDefinition")
				.setReadOnly(true)

		        .setCacheable(true)
		    .scroll(ScrollMode.FORWARD_ONLY);
	}
	
	public ScrollableResults findAll(int start, int max) 
	{
		ScrollableResults resources = getCurrentSession().createQuery("FROM ActivityDefinition")
				.setFirstResult(start)
				.setMaxResults(max)
				.setReadOnly(true)
		        .setCacheable(true)
		    .scroll(ScrollMode.FORWARD_ONLY);
		return resources;
	}


}

