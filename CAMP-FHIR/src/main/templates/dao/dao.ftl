//${pojo.getPackageDeclaration()}
package main.java.com.campfhir.dao;
// Generated on ${date} 

<#assign classbody>
<#assign declarationName = pojo.importType(pojo.getDeclarationName())>/**
 *  object for domain model class ${declarationName}.
 * @see ${pojo.getQualifiedDeclarationName()}
 * @author Paul Kovach
 */

public class ${declarationName}Dao {

	private ${pojo.importType("org.hibernate.Session")} currentSession;
	private ${pojo.importType("org.hibernate.SessionFactory")} sessionFactory;
	
	private ${pojo.importType("org.hibernate.Transaction")} currentTransaction;

	public ${declarationName}Dao() {}
	
    public ${pojo.importType("org.hibernate.Session")} openCurrentSession() throws ${pojo.importType("javax.xml.parsers.ParserConfigurationException")}, ${pojo.importType("org.xml.sax.SAXException")}, ${pojo.importType("java.io.IOException")} 
	{
		sessionFactory =  ${pojo.importType("main.java.utils.HibernateBaseDB")}.getSessionFactory();
		currentSession = sessionFactory.openSession();
		return currentSession;
	}
    
    public ${pojo.importType("org.hibernate.Session")} openCurrentSessionwithTransaction() throws ${pojo.importType("javax.xml.parsers.ParserConfigurationException")}, ${pojo.importType("org.xml.sax.SAXException")}, ${pojo.importType("java.io.IOException")} 
	{
		sessionFactory = ${pojo.importType("main.java.utils.HibernateBaseDB")}.getSessionFactory();
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
    
    private static ${pojo.importType("org.hibernate.SessionFactory")} getSessionFactory() 
	{ 
		${pojo.importType("org.hibernate.cfg.Configuration")} configuration = new Configuration().configure();
		${pojo.importType("org.hibernate.boot.registry.StandardServiceRegistryBuilder")} builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		${pojo.importType("org.hibernate.SessionFactory")} sessionFactory = configuration.buildSessionFactory(builder.build());
		return sessionFactory;
	}
	
	public ${pojo.importType("org.hibernate.Session")} getCurrentSession() 
	{
		return currentSession;
	}

	public void setCurrentSession(${pojo.importType("org.hibernate.Session")} currentSession) 
	{
		this.currentSession = currentSession;
	}

	public ${pojo.importType("org.hibernate.Transaction")} getCurrentTransaction() 
	{
		return currentTransaction;
	}

	public void setCurrentTransaction(${pojo.importType("org.hibernate.Transaction")} currentTransaction) 
	{
		this.currentTransaction = currentTransaction;
	}

	public void persist( ${pojo.importType("main.java.com.campfhir.model.${declarationName}")} entity) 
	{
		getCurrentSession().save(entity);
	}

	public void update( ${pojo.importType("main.java.com.campfhir.model.${declarationName}")} entity) 
	{
		getCurrentSession().update(entity);
	}

	public  ${pojo.importType("main.java.com.campfhir.model.${declarationName}")} findById(String id) 
	{
		${pojo.importType("main.java.com.campfhir.model.${declarationName}")} resource = (${pojo.importType("main.java.com.campfhir.model.${declarationName}")}) getCurrentSession().get(${pojo.importType("main.java.com.campfhir.model.${declarationName}")}.class, id);
		return resource; 
	}
	
	public void delete(${pojo.importType("main.java.com.campfhir.model.${declarationName}")} entity) 
	{
		getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public ${pojo.importType("org.hibernate.ScrollableResults")} findAll() 
	{
		return getCurrentSession().createQuery("FROM ${declarationName}")
				.setReadOnly(true)

		        .setCacheable(true)
		    .scroll(${pojo.importType("org.hibernate.ScrollMode")}.FORWARD_ONLY);
	}
	
	public ${pojo.importType("org.hibernate.ScrollableResults")} findAll(int start, int max) 
	{
		ScrollableResults resources = getCurrentSession().createQuery("FROM ${declarationName}")
				.setFirstResult(start)
				.setMaxResults(max)
				.setReadOnly(true)
		        .setCacheable(true)
		    .scroll(${pojo.importType("org.hibernate.ScrollMode")}.FORWARD_ONLY);
		return resources;
	}


}
</#assign>

${pojo.generateImports()}
${classbody}