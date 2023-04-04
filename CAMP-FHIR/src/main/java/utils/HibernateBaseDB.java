package main.java.utils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import javax.xml.parsers.ParserConfigurationException;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.xml.sax.SAXException;

import main.java.com.campfhir.model.Campfhir;

/**
* HibernateBaseDB is a class that programmatically constructs
* hibernates databse configurations by reading in from external files
* outside of the applications classpath. 
*
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/
public class HibernateBaseDB 
{
	
    static String dialect;
    static String driver_class;
    static String url;
    static String username;
    static String password;
    
    public static SessionFactory getSessionFactory(Campfhir cf, String direction) 
    		throws ParserConfigurationException, SAXException, IOException 
    {
        Configuration configuration = new Configuration();
        
        if(direction.equals("in"))
        {
	        dialect = cf.getiSqldialects();
	        driver_class = cf.getiSqlDriverClass();
	        url = cf.getiDburl();
	        username = cf.getiDbusername();
	        password = cf.getiDbpassword();
        }
        else if(direction.equals("out"))
        {
	        dialect = cf.getoSqldialects();
	        driver_class = cf.getoSqlDriverClass();
	        url = cf.getoDburl();
	        username = cf.getoDbusername();
	        password = cf.getoDbpassword();
        }
        
        
        
        Properties properties = new Properties();
        properties.put("hibernate.dialect", dialect);
        properties.put("hibernate.connection.driver_class", driver_class);
        properties.put("hibernate.connection.url", url);
        properties.put("hibernate.connection.username", username);
        properties.put("hibernate.connection.password", password);
        properties.put("hibernate.current_session_context_class", "thread");
        properties.put("show_sql", "true");

        configuration.setProperties(properties);
        configuration.addFile(new File("./").getCanonicalPath()+"/"+cf.getResource()+".hbm.xml"); // C:\Users\pikovach\camp-fhir\CAMP-FHIR\Patient.hbm.xml

        // configuration.addResource(cf.getResource()+".hbm.xml");
//        configuration.addResource("C:\\Users\\pikovach\\camp-fhir\\CAMP-FHIR\\Patient.hbm.xml");
        
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
        .applySettings(configuration.getProperties()).build();

        SessionFactory sessionFactory = configuration
        .buildSessionFactory(serviceRegistry);
        return sessionFactory;
    }
    
    public static HashMap<String, String> driverClass(String Dialect)
    {
    	   HashMap<String, String> classfiles = new HashMap<String, String>();

    	    // Add keys and values (Country, City)
    	    classfiles.put("org.hibernate.dialect.DB2Dialect", "");
    	    classfiles.put("org.hibernate.dialect.DB2400Dialect", "");
    	    classfiles.put("org.hibernate.dialect.DB2390Dialect", "");
    	    classfiles.put("org.hibernate.dialect.PostgreSQLDialect", "");
    	    classfiles.put("org.hibernate.dialect.MySQL5Dialect", "");
    	    classfiles.put("org.hibernate.dialect.MySQL5InnoDBDialect", "");
    	    classfiles.put("org.hibernate.dialect.MySQLMyISAMDialect", "");
    	    classfiles.put("org.hibernate.dialect.OracleDialect", "");
    	    classfiles.put("org.hibernate.dialect.Oracle9iDialect", "");
    	    classfiles.put("org.hibernate.dialect.SybaseASE15Dialect", "");
    	    classfiles.put("org.hibernate.dialect.SQLServerDialect", "");
    	    classfiles.put("org.hibernate.dialect.SQLServer2008Dialect", "");
    	    classfiles.put("org.hibernate.dialect.SAPDBDialect", "");
    	    classfiles.put("org.hibernate.dialect.InformixDialect", "");
    	    classfiles.put("org.hibernate.dialect.HSQLDialect", "");
    	    classfiles.put("org.hibernate.dialect.H2Dialect", "org.h2.Driver");
    	    classfiles.put("org.hibernate.dialect.IngresDialect", "");
    	    classfiles.put("org.hibernate.dialect.ProgressDialect", "");
    	    classfiles.put("org.hibernate.dialect.MckoiDialect", "");
    	    classfiles.put("org.hibernate.dialect.InterbaseDialect", "");
    	    classfiles.put("org.hibernate.dialect.PointbaseDialect", "");
    	    classfiles.put("org.hibernate.dialect.FrontbaseDialect", "");
    	    classfiles.put("org.hibernate.dialect.FirebirdDialect", "");
    	    
    	    return classfiles;

    }
}
