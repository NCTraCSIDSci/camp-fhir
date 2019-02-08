import java.util.ArrayList;
import java.util.List;

import org.hl7.fhir.dstu3.model.Bundle;
import org.junit.Before;
import org.junit.Test;

import com.campfhir.model.Encounter;
import com.campfhir.service.conversion.EncounterConversion;

import ca.uhn.fhir.context.FhirContext;

public class encounterTest 
{	
	@Before
	public void setUp() throws Exception 
	{
		Encounter encounter = new Encounter();
		
		encounter.setENC_IDENTIFIER("ENC_IDENTIFIER");
		encounter.setENC_SUBJECT_REFERENCE("ENC_SUBJECT_REFERENCE");
		encounter.setENC_PARTICIPANT_INDIV_REF("ENC_PARTICIPANT_INDIV_REF");
		encounter.setENC_CLASS_SYST("ENC_CLASS_SYST");
		encounter.setENC_CLASS_CODE("ENC_CLASS_CODE");
		encounter.setENC_CLASS_DISPLAY("ENC_CLASS_DISPLAY");
		encounter.setENC_PERIOD_START("ENC_PERIOD_START");
		encounter.setENC_PERIOD_END("ENC_PERIOD_END"); 
		encounter.setENC_HOSP_DISDISP_CODING_SYST("ENC_HOSP_DISDISP_CODING_SYST");
		encounter.setENC_HOSP_DISDISP_CODING_CODE("ENC_HOSP_DISDISP_CODING_CODE");
		encounter.setENC_HOSP_DISDISP_TEXT("ENC_HOSP_DISDISP_TEXT");
		encounter.setENC_HOSP_ADMSRC_CODING_CODE("ENC_HOSP_ADMSRC_CODING_CODE");
		encounter.setENC_HOSP_ADMSRC_TEXT("ENC_HOSP_ADMSRC_TEXT");
		encounter.setENC_DIAGN_CON_REF("ENC_DIAGN_CON_REF");
		encounter.setENC_DIAGN_ROLE_CODING_CODE("ENC_DIAGN_ROLE_CODING_CODE");
		encounter.setENC_DIAGN_ROLE_SYST("ENC_DIAGN_ROLE_SYST");
		encounter.setENC_DIAGN_RANK("ENC_DIAGN_RANK");
		
		
		List<Encounter> encounters = new ArrayList<Encounter>();
		
		encounters.add(encounter);
		
		Bundle bundle = new EncounterConversion().Encounters(encounters);
		
		FhirContext ctx = FhirContext.forDstu3();
		
		String file = ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(bundle);

	}

	@Test
	public void test() {
//		fail("Not yet implemented");
	}

}
