package main.java.com.campfhir.service;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.hl7.fhir.exceptions.FHIRException;
import org.xml.sax.SAXException;

import main.java.com.campfhir.dao.DeviceDefinitionDao;
import main.java.com.campfhir.model.Campfhir;
import main.java.com.campfhir.model.Device;
import main.java.com.campfhir.service.conversion.DeviceConversion;

import ca.uhn.fhir.context.FhirContext;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/
public class DeviceService 
{

	private static DeviceDefinitionDao deviceDao;
	private static DeviceConversion cc;

	public DeviceService() 
	{
		deviceDao = new DeviceDefinitionDao();
		cc = new DeviceConversion();
	}
/*
	public void persist(Device entity) throws ParserConfigurationException, SAXException, IOException 
	{
		deviceDao.openCurrentSessionwithTransaction();
		deviceDao.persist(entity);
		deviceDao.closeCurrentSessionwithTransaction();
	}

	public void update(Device entity) throws ParserConfigurationException, SAXException, IOException 
	{
		deviceDao.openCurrentSessionwithTransaction();
		deviceDao.update(entity);
		deviceDao.closeCurrentSessionwithTransaction();
	}

	public Device findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		deviceDao.openCurrentSession();
		Device device = deviceDao.findById(id);
		deviceDao.closeCurrentSession();
		return device;
	}
	
	public List<Device> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		deviceDao.openCurrentSession();
		List<Device> devices = deviceDao.findByPatientId(id);
		deviceDao.closeCurrentSession();
		return devices;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		deviceDao.openCurrentSessionwithTransaction();
		Device device = deviceDao.findById(id);
		deviceDao.delete(device);
		deviceDao.closeCurrentSessionwithTransaction();
	}
*/
	public void findAll(int partition, Campfhir cf) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session = deviceDao.openCurrentSession(cf);
		ScrollableResults devices = deviceDao.findAll();
		
	     int i = 1;
	     System.out.println("start");
	     Bundle bundle = new Bundle().setType(BundleType.COLLECTION);
	     

	     while ( devices.next() ) 
	     {	
			if ((i % partition) == 0)
			{
				System.out.println(i);
				session.clear();
				
				writeFile(cf.getOutputfolder(), i, bundle);
			    bundle = new Bundle().setType(BundleType.COLLECTION);
			}
			
			i++;
			
			bundle.addEntry()
			   .setFullUrl("https://www.hl7.org/fhir/device.html")  			   
			   .setResource(cc.Devices((Device) devices.get(0)));
			
	     }
	     
	     writeFile(cf.getOutputfolder(), i, bundle);
		 deviceDao.closeCurrentSession();
	}
	
	public List<Device> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults devices = deviceDao.findAll();
		List<Device> e = new ArrayList<>();  

		while ( devices.next() ) 
		{		
			e.add((Device) devices.get(0));
		}

		return e;
	}

	
/*	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		deviceDao.openCurrentSessionwithTransaction();
		deviceDao.deleteAll();
		deviceDao.closeCurrentSessionwithTransaction();
	}
*/
	public DeviceDefinitionDao deviceDao() 
	{
		return deviceDao;
	}
	
	public static void writeFile(String path, int domain, Bundle bundle)
	{			
	    
		
		try 
		{
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path+"/"+domain+".json", true), StandardCharsets.UTF_8));
			
			String file = FhirContext.forR4().newJsonParser().setPrettyPrint(false).encodeResourceToString(bundle);			
			
		    writer.write(file);
		    writer.close();

		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}

	    
	}
}
