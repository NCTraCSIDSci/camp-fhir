package main.java.com.campfhir.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.hibernate.ScrollableResults;
import org.junit.jupiter.api.Test;

import main.java.com.campfhir.dao.PatientDao;
import main.java.com.campfhir.model.Patient;


class PatientTest 
{
	
	private static PatientDao patientDao;
	
	@Test
	void test() 
	{
		ScrollableResults patients = patientDao.findAll();
		
		Patient p = new Patient();
		
	    while ( patients.next() ) 
	    {	
	    	p = (Patient) patients.get(0);
	    	System.out.println(p.getPNT_IDENTIFIER());
	    }
		
		fail("Not yet implemented");
	}

}
