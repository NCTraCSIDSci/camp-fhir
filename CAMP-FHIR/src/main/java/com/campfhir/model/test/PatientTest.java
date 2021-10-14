package main.java.com.campfhir.model.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.hibernate.ScrollableResults;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import main.java.com.campfhir.dao.PatientDao;
import main.java.com.campfhir.model.Patient;


class PatientTest 
{
    @BeforeEach                                         
    void setUp() 
    {
		System.setProperty("CONFIG", "/opt/");
    }

	@Test
	@DisplayName("Testing to see if all fields are configured correctly") 
	void test() throws ParserConfigurationException, SAXException, IOException 
	{
		
		PatientDao patientDao = new PatientDao();
		patientDao.openCurrentSession();
		ScrollableResults patients = patientDao.findAll();
		Patient p = new Patient();
		
	    while ( patients.next() ) 
	    {	
	    	p = (Patient) patients.get(0);
	    	
	    	assertEquals(p.getPNT_IDENTIFIER(),"1");
	    	/*
	    	 * 
	    	
	    	System.out.println(p.getPNT_IDENTIFIER());
	    	System.out.println(p.getPNT_ACTIVE());
	    	System.out.println(p.getPNT_NAME());
	    	System.out.println(p.getPNT_NAME_HUMANNAME_USE());
		 	System.out.println(p.getPNT_NAME_HUMANNAME_TEXT());
		 	System.out.println(p.getPNT_NAME_HUMANNAME_FAMILY());
		 	System.out.println(p.getPNT_NAME_HUMANNAME_GIVEN());
		 	System.out.println(p.getPNT_NAME_HUMANNAME_PREFIX());
		 	System.out.println(p.getPNT_NAME_HUMANNAME_SUFFIX());
		 	System.out.println(p.getPNT_NAME_HUMANNAME_PERIOD());
		 	System.out.println(p.getPNT_TELECOM());
		 	System.out.println(p.getPNT_TELECOM_CONTACTPOINT_SYSTEM());
		 	System.out.println(p.getPNT_TELECOM_CONTACTPOINT_VALUE());
		 	System.out.println(p.getPNT_TELECOM_CONTACTPOINT_USE());
		 	System.out.println(p.getPNT_TELECOM_CONTACTPOINT_RANK());
		 	System.out.println(p.getPNT_TELECOM_CONTACTPOINT_PERIOD());
			System.out.println(p.getPNT_GENDER());
			System.out.println(p.getPNT_BIRTHDATE());
			System.out.println(p.getPNT_DECEASEDBOOLEAN());
			System.out.println(p.getPNT_DECEASEDDATETIME());
			System.out.println(p.getPNT_ADDRESS());
			System.out.println(p.getPNT_MARITAL_STATUS_CODE());
			System.out.println(p.getPNT_MULTIPLE_BIRTH_BOOLEAN());
			System.out.println(p.getPNT_MULTIPLE_BIRTH_INTEGER());
			System.out.println(p.getPNT_PHOTO());
			System.out.println(p.getPNT_CONTACT());
			System.out.println(p.getPNT_CONTACT_RELATIONSHIP());
			System.out.println(p.getPNT_CONTACT_NAME());
			System.out.println(p.getPNT_CONTACT_TELECOM());
			System.out.println(p.getPNT_CONTACT_ADDRESS());
			System.out.println(p.getPNT_CONTACT_GENDER());
			System.out.println(p.getPNT_CONTACT_ORGANIZATION());
			System.out.println(p.getPNT_RACE());
			System.out.println(p.getPNT_ETHNICITY());
			System.out.println(p.getPNT_ADDRESS_EXT_LAT_VALUE());
			System.out.println(p.getPNT_ADDRESS_EXT_LONG_VALUE());
			*/
	    		
	    }
	}
}
