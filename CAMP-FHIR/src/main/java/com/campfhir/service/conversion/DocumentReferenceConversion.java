package main.java.com.campfhir.service.conversion;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hl7.fhir.r4.model.Attachment;
import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;
import org.hl7.fhir.r4.model.Period;
import org.hl7.fhir.r4.model.Reference;
import org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceContentComponent;
import org.hl7.fhir.r4.model.DocumentReference.DocumentReferenceContextComponent;
import org.hl7.fhir.r4.model.Enumerations.DocumentReferenceStatus;

import main.java.com.campfhir.model.DocumentReference;


/**
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/
public class DocumentReferenceConversion 
{
	public org.hl7.fhir.r4.model.DocumentReference DocumentReferences(DocumentReference documentReference) throws ParseException, IOException
	{
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-M-dd hh:mm:ss");
		org.hl7.fhir.r4.model.DocumentReference dr = new org.hl7.fhir.r4.model.DocumentReference();	
		
		Reference sr = new Reference();

		dr.setSubject(sr.setReference(documentReference.getDOC_SUBJECT_REFERENCE()));
		
		dr.setId(documentReference.getDOC_ID());
		
	    if(documentReference.getDOC_DATE() != null)
	    {
	        try 
	        {
	            Date date1 = new Date();
	            date1 = sdf2.parse(documentReference.getDOC_DATE());
	            dr.setDate(date1);
	        } 
	        catch (ParseException e) 
	        {
	            e.printStackTrace();
	        }
	    }
	    
	    if(documentReference.getDOC_START_DATE() != null)
	    {
	        try 
	        {
	            DocumentReferenceContextComponent drcc = new DocumentReferenceContextComponent();
	            Date sd = new Date();
	            sd = sdf2.parse(documentReference.getDOC_START_DATE());
	            
	            Date ed = new Date();
	            ed = sdf2.parse(documentReference.getDOC_END_DATE());
	               
	            Period period = new Period();
				period.setEnd(sd);
				period.setStart(ed);
	
				drcc.setPeriod(period);
				dr.setContext(drcc);
	        } 
	        catch (ParseException e) 
	        {
	            e.printStackTrace();
	        }
	    }
	    
	    CodeableConcept type = new CodeableConcept();
	    List<Coding> theCoding = new ArrayList<Coding>();
	    
	    Coding t = new Coding();
	    t.setCode(documentReference.getDOC_TYPE_CODE());
	    t.setSystem(documentReference.getDOC_TYPE_SYSTEM());
	    t.setDisplay(documentReference.getDOC_TYPE_DISPLAY());
	    
		theCoding.add(t);
		
		type.setCoding(theCoding );
		type.setText(documentReference.getDOC_TYPE());
		
		dr.setType(type);
	
		List<CodeableConcept> theCategory = new ArrayList<CodeableConcept>();
		
		CodeableConcept e = new CodeableConcept();
		e.setText(documentReference.getDOC_CATEGORY());
		theCategory.add(e);

		
		
		dr.setCategory(theCategory);

		dr.setStatus(DocumentReferenceStatus.fromCode(documentReference.getDOC_STATUS()));
		
		List<DocumentReferenceContentComponent> theContent = new ArrayList<DocumentReferenceContentComponent>();
		
		DocumentReferenceContentComponent edrcc = new DocumentReferenceContentComponent();
		
		Attachment contentType = new Attachment();
		
		contentType.setContentType(documentReference.getDOC_CONTENT_TYPE());
		contentType.setData(documentReference.getDOC_CONTENT_DATA().getBytes());

		edrcc.setAttachment(contentType);
		theContent.add(edrcc);
		
	    
	    dr.setContent(theContent);
	
		return dr;
	}
}
