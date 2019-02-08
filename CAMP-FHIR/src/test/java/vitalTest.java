import java.util.ArrayList;
import java.util.List;

import org.hl7.fhir.dstu3.model.Bundle;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.PropertySource;

import com.campfhir.model.Vital;
import com.campfhir.service.conversion.VitalConversion;

import ca.uhn.fhir.context.FhirContext;

@PropertySource("classpath:application.properties")
public class vitalTest 
{	
	@Before
	public void setUp() throws Exception 
	{
		Vital vital = new Vital();
		
		vital.setOBS_IDENTIFIER("OBS_IDENTIFIER");
		vital.setOBS_SUBJECT_REFERENCE("OBS_SUBJECT_REFERENCE");
		vital.setOBS_CONTEXT_REFERENCE("OBS_CONTEXT_REFERENCE");
		vital.setOBS_CATEGORY_SYST("OBS_CATEGORY_SYST");
		vital.setOBS_CATEGORY_CODE("OBS_CATEGORY_CODE");
		vital.setOBS_CATEGORY_DISPLAY("OBS_CATEGORY_DISPLAY");
		vital.setOBS_CODE_CODING_SYST("OBS_CODE_CODING_SYST");
		vital.setOBS_CODE_CODING_CODE("OBS_CODE_CODING_CODE");
		vital.setOBS_CODE_CODING_DISPLAY("OBS_CODE_CODING_DISPLAY");
		vital.setOBS_VALUEQUANTITY_VALUE("OBS_VALUEQUANTITY_VALUE");
		vital.setOBS_VALUEQUANTITY_COMPARATOR("OBS_VALUEQUANTITY_COMPARATOR");
		vital.setOBS_VALUEQUANTITY_CODE("OBS_VALUEQUANTITY_CODE");
		vital.setOBS_VALUESTRING("OBS_VALUESTRING");
		vital.setOBS_EFFECTIVEDATETIME("OBS_EFFECTIVEDATETIME");
		
		
		List<Vital> vitals = new ArrayList<Vital>();
		
		vitals.add(vital);
		
		Bundle bundle = new VitalConversion().Vitals(vitals);
		
		FhirContext ctx = FhirContext.forDstu3();
		
		String file = ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(bundle);

	}

	@Test
	public void test() {
//		fail("Not yet implemented");
	}
}

