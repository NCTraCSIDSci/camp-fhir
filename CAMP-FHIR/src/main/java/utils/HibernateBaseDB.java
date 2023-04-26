package main.java.utils;

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
* @since   2023-04-18
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
        properties.put("hibernate.connection.driver_class",driverClass().get(driver_class));
        properties.put("hibernate.connection.url", url);
        properties.put("hibernate.connection.username", username);
        properties.put("hibernate.connection.password", password);
        properties.put("hibernate.current_session_context_class", "thread");
        properties.put("show_sql", "true");
        properties.put("hibernate.default_catalog", "true");

        configuration.setProperties(properties);
        configuration.addResource(cf.getResource()+".hbm.xml");
               
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
        .applySettings(configuration.getProperties()).build();

        SessionFactory sessionFactory = configuration
        .buildSessionFactory(serviceRegistry);
        return sessionFactory;
    }
    
    public static HashMap<String, String> driverClass()
    {
    	   HashMap<String, String> dc = new HashMap<String, String>();
    	   
    	   dc.put("org.hibernate.dialect.H2Dialect", "org.h2.Driver");
    	   dc.put("org.hibernate.dialect.PostgreSQLDialect", "org.postgresql.Driver");
    	   dc.put("org.hibernate.dialect.OracleDialect", "oracle.jdbc.OracleDriver");
    	   dc.put("org.hibernate.dialect.SQLServerDialect", "com.microsoft.sqlserver.jdbc.SQLServerDriver");
    	   dc.put("org.xbib.jdbc.csv.CsvDriver", "oracle.jdbc.OracleDriver");

    	   dc.put("org.hibernate.dialect.DB2Dialect", "");
    	   dc.put("org.hibernate.dialect.DB2400Dialect", "");
    	   dc.put("org.hibernate.dialect.DB2390Dialect", "");
    	   dc.put("org.hibernate.dialect.MySQL5Dialect", "");
    	   dc.put("org.hibernate.dialect.MySQL5InnoDBDialect", "");
    	   dc.put("org.hibernate.dialect.MySQLMyISAMDialect", "");    	   
    	   dc.put("org.hibernate.dialect.Oracle9iDialect", "");
    	   dc.put("org.hibernate.dialect.SybaseASE15Dialect", "");
    	   dc.put("org.hibernate.dialect.SQLServer2008Dialect", "");
    	   dc.put("org.hibernate.dialect.SAPDBDialect", "");
    	   dc.put("org.hibernate.dialect.InformixDialect", "");
    	   dc.put("org.hibernate.dialect.HSQLDialect", ""); 
    	   dc.put("org.hibernate.dialect.IngresDialect", "");
    	   dc.put("org.hibernate.dialect.ProgressDialect", "");
    	   dc.put("org.hibernate.dialect.MckoiDialect", "");
    	   dc.put("org.hibernate.dialect.InterbaseDialect", "");
    	   dc.put("org.hibernate.dialect.PointbaseDialect", "");
    	   dc.put("org.hibernate.dialect.FrontbaseDialect", "");
    	   dc.put("org.hibernate.dialect.FirebirdDialect", "");
    	    
    	   return dc;

    }

}
