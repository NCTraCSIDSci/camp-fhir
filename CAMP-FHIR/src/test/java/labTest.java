import java.util.ArrayList;
import java.util.List;

import org.hl7.fhir.dstu3.model.Bundle;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.PropertySource;

import com.campfhir.model.Lab;
import com.campfhir.service.conversion.LabConversion;

import ca.uhn.fhir.context.FhirContext;

@PropertySource("classpath:application.properties")
public class labTest 
{	
	@Before
	public void setUp() throws Exception 
	{
		Lab observation = new Lab();
		
		observation.setOBS_IDENTIFIER("OBS_IDENTIFIER");//
		observation.setOBS_SUBJECT_REFERENCE("OBS_SUBJECT_REFERENCE");//
		observation.setOBS_CONTEXT_REFERENCE("OBS_CONTEXT_REFERENCE");//
		observation.setOBS_CATEGORY_CODE("OBS_CATEGORY_CODE");//
		observation.setOBS_CATEGORY_SYST("OBS_CATEGORY_SYST");//
		observation.setOBS_CATEGORY_DISPLAY("OBS_CATEGORY_DISPLAY");//
		observation.setOBS_CODE_CODING_SYST("OBS_CODE_CODING_SYST");//
		observation.setOBS_CODE_CODING_CODE("OBS_CODE_CODING_CODE");//
		observation.setOBS_CODE_CODING_DISPLAY("OBS_CODE_CODING_DISPLAY");//
		observation.setOBS_VALUEQUANTITY_VALUE("1");
		observation.setOBS_VALUEQUANTITY_COMPARATOR(">=");
		observation.setOBS_VALUEQUANTITY_CODE("OBS_VALUEQUANTITY_CODE");
		observation.setOBS_ISSUED("2009-10-12 00:00:00");
		observation.setOBS_EFFECTIVEDATETIME("2008-10-12 00:00:00");
		observation.setOBS_REFRANGE_LOW("1");
		observation.setOBS_REFRANGE_HIGH("2");
		observation.setOBS_INTERPRETATION_CODE("OBS_INTERPRETATION_CODE");
		observation.setOBS_INTERPRETATION_SYST("OBS_INTERPRETATION_SYST");		
		
		List<Lab> labss = new ArrayList<Lab>();
		
		labss.add(observation);
		
		Bundle bundle = new LabConversion().Labs(labss);
		
		FhirContext ctx = FhirContext.forDstu3();
		
		String file = ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(bundle);
		
	}

	@Test
	public void test() {
//		fail("Not yet implemented");
	}
}

