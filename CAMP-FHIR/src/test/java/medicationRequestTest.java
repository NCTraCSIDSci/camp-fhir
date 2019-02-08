import java.util.ArrayList;
import java.util.List;

import org.hl7.fhir.dstu3.model.Bundle;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.PropertySource;

import com.campfhir.model.MedicationRequest;
import com.campfhir.service.conversion.MedicationRequestConversion;

import ca.uhn.fhir.context.FhirContext;

@PropertySource("classpath:application.properties")
public class medicationRequestTest 
{	
	@Before
	public void setUp() throws Exception 
	{
		MedicationRequest mr = new MedicationRequest();
		
		mr.setMED_IDENTIFIER("MED_IDENTIFIER");
		mr.setMED_SUBJECT_REFERENCE("MED_SUBJECT_REFERENCE");
		mr.setMED_CONTEXT_REFERENCE("MED_CONTEXT_REFERENCE");
		mr.setMED_MEDREF_REFERENCE("MED_MEDREF_REFERENCE");
		mr.setMED_AUTHORED_ON("MED_AUTHORED_ON");
		mr.setMED_DISPREQ_PERIOD_START("MED_DISPREQ_PERIOD_START");
		mr.setMED_DISPREQ_PERIOD_END("MED_DISPREQ_PERIOD_END");
		mr.setMED_REQ_AGENT_REFERENCE("MED_REQ_AGENT_REFERENCE");
		mr.setMED_INTENT_CODE("MED_INTENT_CODE");
		mr.setMED_CAT_CODING_SYS("MED_CAT_CODING_SYS");
		mr.setMED_CAT_CODING_CODE("MED_CAT_CODING_CODE");
		mr.setMED_CAT_CODING_DISPLAY("MED_CAT_CODING_DISPLAY");
		mr.setMED_DOSINSTX_DOSEQUANT_VAL("MED_DOSINSTX_DOSEQUANT_VAL");
		mr.setMED_DOSINSTX_DOSEQUANT_UNIT("MED_DOSINSTX_DOSEQUANT_UNIT");
		mr.setMED_DISPREQ_QUANT("MED_DISPREQ_QUANT");
		mr.setMED_DISPREQ_NUMREPS("MED_DISPREQ_NUMREPS");
		mr.setMED_DISPREQ_EXPSUPP("MED_DISPREQ_EXPSUPP");
		mr.setMED_DOSINSTX_TEXT("MED_DOSINSTX_TEXT");
		mr.setMED_DOSINSTX_ASNDBOOL("MED_DOSINSTX_ASNDBOOL");
		mr.setMED_DOSINSTX_ROUTE("MED_DOSINSTX_ROUTE");
		mr.setMED_SUBSTITU_ALLOWED("MED_SUBSTITU_ALLOWED");
		
		
		List<MedicationRequest> medicationRequest = new ArrayList<MedicationRequest>();
		
		medicationRequest.add(mr);
		
		Bundle bundle = new MedicationRequestConversion().MedicationRequests(medicationRequest);
		
		FhirContext ctx = FhirContext.forDstu3();
		
		String file = ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(bundle);
	}

	@Test
	public void test() {
//		fail("Not yet implemented");
	}
}
