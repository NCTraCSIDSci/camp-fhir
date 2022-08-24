package main.java.utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.io.IOUtils;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

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
	    private static FileInputStream fileInputStream;

		public static SessionFactory getSessionFactory() 
	    		throws ParserConfigurationException, SAXException, IOException 
	    {
	    	java.util.Properties properties = new Properties();
	    	try 
	    	{
				//fileInputStream = new FileInputStream("//unch/dfs/home/u168465/config.properties");	
	    		fileInputStream = new FileInputStream(System.getProperty("CONFIG").concat("/config.properties"));				
				properties.load(fileInputStream);
			} 
	    	catch (FileNotFoundException e) 
	    	{
				e.printStackTrace();
			} 
	    	catch (IOException e) 
	    	{
				e.printStackTrace();
			}
	  
	        Configuration configuration = new Configuration();

	        DocumentBuilderFactory dbfac = DocumentBuilderFactory.newInstance();
	        configuration.configure("hibernate.cfg.xml").addProperties(properties);
			configuration.addResource("file://".concat(System.getProperty("CONFIG").concat("/table.hbm.xml")));
			
	        
	        
	        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
	        .applySettings(configuration.getProperties()).build();

	        SessionFactory sessionFactory = configuration
	        .buildSessionFactory(serviceRegistry);
	        return sessionFactory;
	    }
	}