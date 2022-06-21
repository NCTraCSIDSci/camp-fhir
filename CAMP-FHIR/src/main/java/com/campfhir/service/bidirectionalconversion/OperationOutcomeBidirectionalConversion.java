package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.OperationOutcome;
public class OperationOutcomeBidirectionalConversion 
{
	public OperationOutcome OperationOutcomes(org.hl7.fhir.r4.model.OperationOutcome operationoutcome) throws ParseException
	{
		 main.java.com.campfhir.model.OperationOutcome o = new  main.java.com.campfhir.model.OperationOutcome();

		/******************** id ********************************************************************************/
		operationoutcome.setId(o.getId());

		/******************** operationoutcomeissue ********************************************************************************/
		org.hl7.fhir.r4.model.OperationOutcome.OperationOutcomeIssueComponent operationoutcomeissue = operationoutcome.getIssueFirstRep();

		/******************** operationoutcomeissuecode ********************************************************************************/
		org.hl7.fhir.r4.model.OperationOutcome.IssueType operationoutcomeissuecode = operationoutcomeissue.getCode();
		o.setOprtnOutcomeIssueCd(operationoutcomeissuecode.toCode());

		/******************** operationoutcomeissueseverity ********************************************************************************/
		org.hl7.fhir.r4.model.OperationOutcome.IssueSeverity operationoutcomeissueseverity = operationoutcomeissue.getSeverity();
		o.setOprtnOutcomeIssueSeverity(operationoutcomeissueseverity.toCode());

		/******************** OprtnOutcome_Issue_Diagnostics ********************************************************************************/
		if(operationoutcomeissue.hasDiagnostics()) {
			o.setOprtnOutcomeIssueDiagnostics(String.valueOf(operationoutcomeissue.getDiagnostics()));
		}
		/******************** operationoutcomeissuedetails ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept operationoutcomeissuedetails = operationoutcomeissue.getDetails();

		/******************** operationoutcomeissuedetailscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding operationoutcomeissuedetailscoding = operationoutcomeissuedetails.getCodingFirstRep();

		/******************** OprtnOutcome_Issue_Dtls_Cdg_Dsply ********************************************************************************/
		if(operationoutcomeissuedetailscoding.hasDisplay()) {
			o.setOprtnOutcomeIssueDtlsCdgDsply(String.valueOf(operationoutcomeissuedetailscoding.getDisplay()));
		}
		/******************** OprtnOutcome_Issue_Dtls_Cdg_Vrsn ********************************************************************************/
		if(operationoutcomeissuedetailscoding.hasVersion()) {
			o.setOprtnOutcomeIssueDtlsCdgVrsn(String.valueOf(operationoutcomeissuedetailscoding.getVersion()));
		}
		/******************** OprtnOutcome_Issue_Dtls_Cdg_Cd ********************************************************************************/
		if(operationoutcomeissuedetailscoding.hasCode()) {
			o.setOprtnOutcomeIssueDtlsCdgCd(String.valueOf(operationoutcomeissuedetailscoding.getCode()));
		}
		/******************** OprtnOutcome_Issue_Dtls_Cdg_Sys ********************************************************************************/
		if(operationoutcomeissuedetailscoding.hasSystem()) {
			o.setOprtnOutcomeIssueDtlsCdgSys(String.valueOf(operationoutcomeissuedetailscoding.getSystem()));
		}
		/******************** OprtnOutcome_Issue_Dtls_Cdg_UsrSltd ********************************************************************************/
		if(operationoutcomeissuedetailscoding.hasUserSelected()) {
			o.setOprtnOutcomeIssueDtlsCdgUsrSltd(String.valueOf(operationoutcomeissuedetailscoding.getUserSelected()));
		}
		/******************** OprtnOutcome_Issue_Dtls_Txt ********************************************************************************/
		if(operationoutcomeissuedetails.hasText()) {
			o.setOprtnOutcomeIssueDtlsTxt(String.valueOf(operationoutcomeissuedetails.getText()));
		}
		return o;
	}
}
