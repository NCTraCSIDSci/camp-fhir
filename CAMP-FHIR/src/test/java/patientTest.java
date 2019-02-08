import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;

import org.hl7.fhir.dstu3.model.Bundle;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.PropertySource;

import com.campfhir.model.MedicationRequest;
import com.campfhir.model.Patient;
import com.campfhir.service.conversion.MedicationRequestConversion;
import com.campfhir.service.conversion.PatientConversion;

import ca.uhn.fhir.context.FhirContext;

@PropertySource("classpath:application.properties")
public class patientTest 
{	
	@Before
	public void setUp() throws Exception 
	{
		Patient patient = new Patient();
		
		patient.setPNT_IDENTIFIER("PNT_IDENTIFIER");
		patient.setPNT_GENDER("PNT_GENDER");
		patient.setPNT_BIRTHDATE("PNT_BIRTHDATE");
		patient.setPNT_MARITAL_STATUS_CODE("PNT_MARITAL_STATUS_CODE");
		patient.setPNT_MARITAL_STATUS_SYSTEM("PNT_MARITAL_STATUS_SYSTEM");
		patient.setPNT_RACE("PNT_RACE");
		patient.setPNT_ETHNICITY("PNT_ETHNICITY");
		patient.setPNT_ADDRESS_EXT_LAT_VALUE("PNT_ADDRESS_EXT_LAT_VALUE");
		patient.setPNT_ADDRESS_EXT_LONG_VALUE("PNT_ADDRESS_EXT_LONG_VALUE");

		
		List<Patient> patients = new ArrayList<Patient>();
		
		patients.add(patient);
		
		Bundle bundle = new PatientConversion().Patients(patients);
		
		FhirContext ctx = FhirContext.forDstu3();
		
		String file = ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(bundle);
	}

	@Test
	public void test() {
//		fail("Not yet implemented");
	}
}
