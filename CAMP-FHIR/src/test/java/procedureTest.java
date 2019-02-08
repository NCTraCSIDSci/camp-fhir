import java.util.ArrayList;
import java.util.List;

import org.hl7.fhir.dstu3.model.Bundle;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.PropertySource;

import com.campfhir.model.Procedure;
import com.campfhir.service.conversion.ProcedureConversion;

import ca.uhn.fhir.context.FhirContext;

@PropertySource("classpath:application.properties")
public class procedureTest 
{	
	@Before
	public void setUp() throws Exception 
	{
		Procedure procedure = new Procedure();
		procedure.setPCD_IDENTIFIER("PCD_IDENTIFIER");
		procedure.setPCD_SUBJECT_REFERENCE("PCD_SUBJECT_REFERENCE");
		procedure.setPCD_CONTEXT_REFERENCE("PCD_CONTEXT_REFERENCE");
		procedure.setPCD_PERF_ACTOR_REF("PCD_PERF_ACTOR_REF");
		procedure.setPCD_CODE_CODING_SYST("PCD_CODE_CODING_SYST");
		procedure.setPCD_CODE_CODING_CODE("PCD_CODE_CODING_CODE");
		procedure.setPCD_PERFORMED_PDT("PCD_PERFORMED_PDT");

		
		List<Procedure> procedures = new ArrayList<Procedure>();
		
		procedures.add(procedure);
		
		Bundle bundle = new ProcedureConversion().Procedures(procedures);
		
		FhirContext ctx = FhirContext.forDstu3();
		
		String file = ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(bundle);
	}

	@Test
	public void test() {
//		fail("Not yet implemented");
	}
}