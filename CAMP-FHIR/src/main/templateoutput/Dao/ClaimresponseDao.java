//// default package
package main.templateoutput.Dao;
// Generated on Jan 28, 2022, 7:59:50 AM 


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
 *  object for domain model class Claimresponse.
 * @see .Claimresponse
 * @author Paul Kovach
 */

public class ClaimresponseDao {

	private Session currentSession;
	private SessionFactory sessionFactory;
	
	private Transaction currentTransaction;

	public ClaimresponseDao() {}
	
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

	public void persist( main.templateoutput.Model.Claimresponse entity) 
	{
		getCurrentSession().save(entity);
	}

	public void update( main.templateoutput.Model.Claimresponse entity) 
	{
		getCurrentSession().update(entity);
	}

	public  main.templateoutput.Model.Claimresponse findById(String id) 
	{
		main.templateoutput.Model.Claimresponse resource = (main.templateoutput.Model.Claimresponse) getCurrentSession().get(main.templateoutput.Model.Claimresponse.class, id);
		return resource; 
	}
	
	public void delete(main.templateoutput.Model.Claimresponse entity) 
	{
		getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public ScrollableResults findAll() 
	{
		return getCurrentSession().createQuery("FROM Claimresponse")
				.setReadOnly(true)

		        .setCacheable(true)
		    .scroll(ScrollMode.FORWARD_ONLY);
	}
	
	public ScrollableResults findAll(int start, int max) 
	{
		ScrollableResults resources = getCurrentSession().createQuery("FROM Claimresponse")
				.setFirstResult(start)
				.setMaxResults(max)
				.setReadOnly(true)
		        .setCacheable(true)
		    .scroll(ScrollMode.FORWARD_ONLY);
		return resources;
	}


}
