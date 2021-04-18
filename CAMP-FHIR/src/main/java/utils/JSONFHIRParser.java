package main.java.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.parsers.ParserConfigurationException;

import org.hibernate.HibernateException;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Base;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleEntryComponent;
import org.hl7.fhir.r4.model.Extension;

import main.java.com.campfhir.service.PatientService;

import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Property;
import org.hl7.fhir.r4.model.Resource;
import org.hl7.fhir.r4.model.Type;
import org.xml.sax.SAXException;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.parser.IParser;

public class JSONFHIRParser 
{
/*
	public static void main(String[] args) throws HibernateException, FHIRException, ParserConfigurationException, SAXException, ParseException {
		// Create a FHIR context
		FhirContext ctx = FhirContext.forR4();
		
		//String file = args[0];

        String path = "c:\\opt\\Patient\\0.json";

        try (Stream<String> lines = Files.lines(Paths.get(path))) {

            String content = lines.collect(Collectors.joining(System.lineSeparator()));
    		IParser parser = ctx.newJsonParser();

    		Bundle parsed = parser.parseResource(Bundle.class, content);
    		Iterator<BundleEntryComponent> bundleEntryComponent = parsed.getEntry().iterator();
 
			List<Patient> patientList = new ArrayList<Patient>();
			
    		while (bundleEntryComponent.hasNext()) {
    			Patient bc = (Patient) bundleEntryComponent.next().getResource();
    			Patient pt = new Patient();
    			
    			
    			pt.setPNT_IDENTIFIER(bc.getId());
    			
    			String v1 = bc.getExtensionByUrl("http://hl7.org/fhir/us/core/StructureDefinition/us-core-race")
				.getExtensionByUrl("ombCategory").getValue().getChildByName("code").getValues().get(0).toString();
    			
    			if(v1 != null)
    			{	
    				pt.setPNT_RACE(v1);
    			}
    			
    			
    			String v2 = bc.getExtensionByUrl("http://hl7.org/fhir/us/core/StructureDefinition/us-core-ethnicity")
				.getExtensionByUrl("ombCategory").getValue().getChildByName("code").getValues().get(0).toString();
    			
    			if(v2 != null)
    			{
    				pt.setPNT_ETHNICITY(v2);
    			}
    			
    			
    			pt.setPNT_GENDER(bc.getGender().toString());
    			pt.setPNT_BIRTHDATE(bc.getBirthDate().toString());
    			pt.setPNT_MARITAL_STATUS_CODE(bc.getMaritalStatus().getText());
    			
    			patientList.add(pt);
    		}
    		new PatientService().persist(patientList);
    		


        } catch (IOException e) {
            e.printStackTrace();
        }




	}
*/
}
