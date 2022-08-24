package main.java.utils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

import javax.xml.parsers.ParserConfigurationException;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.util.xml.XmlDocument;
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
	    private static FileInputStream fileInputStream;

		public static SessionFactory getSessionFactory(Campfhir cf) 
	    		throws ParserConfigurationException, SAXException, IOException 
	    {

	        Configuration configuration = new Configuration();
	        
	        Properties properties = new Properties();
	        properties.put("hibernate.dialect", cf.getSqldialects());
	        properties.put("hibernate.connection.driver_class", cf.getDriverclass());
	        properties.put("hibernate.connection.url", cf.getDburl());
	        properties.put("hibernate.connection.username", cf.getDbusername());
	        properties.put("hibernate.connection.password", cf.getDbpassword());
	        properties.put("show_sql", "true");
	        configuration.setProperties(properties);
	        
	        byte[] ba = cf.getResourceconfiguration().getBytes();
	        ByteArrayInputStream f = new ByteArrayInputStream(ba);
	       
	        if(cf.getCustommapping().equalsIgnoreCase("false"))
	        {
	        	Path path = Paths.get("./src/main/java/com/resources/XML/Patient.hbm.xml");
	        	//System.out.println(path);
//	        	configuration.addClass(main.java.com.campfhir.model.Patient.class); //path.toAbsolutePath().toString()
	        	configuration.addResource("Patient.hbm.xml"); //path.toAbsolutePath().toString()

	        }
	        else 
	        {
	        	configuration.addInputStream(f);
	        }
	        
	        
	        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
	        .applySettings(configuration.getProperties()).build();

	        SessionFactory sessionFactory = configuration
	        .buildSessionFactory(serviceRegistry);
	        return sessionFactory;
	    }
}