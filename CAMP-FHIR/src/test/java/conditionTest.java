import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.hl7.fhir.dstu3.model.Bundle;
import org.junit.Test;

import com.campfhir.model.Condition;
import com.campfhir.service.conversion.ConditionConversion;

import ca.uhn.fhir.context.FhirContext;

public class conditionTest 
{
	@Test
	public void test() throws ParseException, IOException 
	{
		Condition condition = new Condition();
		condition.setCON_IDENTIFIER("CON_IDENTIFIER");
		condition.setCON_SUBJECT_REFERENCE("CON_SUBJECT_REFERENCE");
		condition.setCON_CONTEXT_REFERENCE("CON_CONTEXT_REFERENCE");
		condition.setCON_ASSERTER_REFERENCE("CON_ASSERTER_REFERENCE");
		condition.setCON_CODE_CODING_SYST("CON_CODE_CODING_SYST");
		condition.setCON_CODE_CODING_CODE("CON_CODE_CODING_CODE");
		condition.setCON_CATEGORY_CODING_SYST("CON_CATEGORY_CODING_SYST");
		condition.setCON_CATEGORY_CODING_CODE("CON_CATEGORY_CODING_CODE");
		condition.setCON_ASSERT_DATE("CON_ASSERT_DATE");
		condition.setCON_CLINSTATUS("CON_CLINSTATUS");
		condition.setCON_ABATEDATE("CON_ABATEDATE");
		condition.setCON_ONSETDATE("CON_ONSETDATE");
		
		
		List<Condition> conditions = new ArrayList<Condition>();
		
		conditions.add(condition);
		
		Bundle bundle = new ConditionConversion().Conditions(conditions);
		
		FhirContext ctx = FhirContext.forDstu3();
		
		String file = ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(bundle);

	}
}
