import java.util.ArrayList;
import java.util.List;

import org.hl7.fhir.dstu3.model.Bundle;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.PropertySource;

import com.campfhir.model.Practitioner;
import com.campfhir.service.conversion.PractitionerConversion;

import ca.uhn.fhir.context.FhirContext;

@PropertySource("classpath:application.properties")
public class practitionerTest 
{	
	@Before
	public void setUp() throws Exception 
	{
		Practitioner practitioner = new Practitioner();
		
		practitioner.setPRACT_IDENTIFIER("PRACT_IDENTIFIER");
		practitioner.setPRACT_GENDER("PRACT_GENDER");
		
		List<Practitioner> practitioners = new ArrayList<Practitioner>();
		
		practitioners.add(practitioner);
		
		Bundle bundle = new PractitionerConversion().Practitioners(practitioners);
		
		FhirContext ctx = FhirContext.forDstu3();
		
		String file = ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(bundle);

	}

	@Test
	public void test() {
//		fail("Not yet implemented");
	}
}

