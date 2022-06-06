package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.OperationOutcome;
public class OperationOutcomeConversion 
{
	public org.hl7.fhir.r4.model.OperationOutcome OperationOutcomes(OperationOutcome o) throws ParseException
	{
		org.hl7.fhir.r4.model.OperationOutcome operationoutcome = new org.hl7.fhir.r4.model.OperationOutcome();

		/******************** id ********************************************************************************/
		operationoutcome.setId(o.getId());

		/******************** operationoutcomeissue ********************************************************************************/
		org.hl7.fhir.r4.model.OperationOutcome.OperationOutcomeIssueComponent operationoutcomeissue =  new org.hl7.fhir.r4.model.OperationOutcome.OperationOutcomeIssueComponent();
		operationoutcome.addIssue(operationoutcomeissue);

		/******************** operationoutcomeissuecode ********************************************************************************/
		org.hl7.fhir.r4.model.OperationOutcome.IssueTypeEnumFactory operationoutcomeissuecode =  new org.hl7.fhir.r4.model.OperationOutcome.IssueTypeEnumFactory();
		operationoutcomeissue.setCode(operationoutcomeissuecode.fromCode(o.getOprtnOutcomeIssueCd()));

		/******************** operationoutcomeissuedetails ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept operationoutcomeissuedetails =  new org.hl7.fhir.r4.model.CodeableConcept();
		operationoutcomeissue.setDetails(operationoutcomeissuedetails);

		/******************** operationoutcomeissuedetailscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding operationoutcomeissuedetailscoding =  new org.hl7.fhir.r4.model.Coding();
		operationoutcomeissuedetails.addCoding(operationoutcomeissuedetailscoding);

		/******************** OprtnOutcome_Issue_Dtls_Cdg_Cd ********************************************************************************/
		if(o.getOprtnOutcomeIssueDtlsCdgCd() != null) {
			operationoutcomeissuedetailscoding.setCode(o.getOprtnOutcomeIssueDtlsCdgCd());
		}
		/******************** OprtnOutcome_Issue_Dtls_Cdg_Dsply ********************************************************************************/
		if(o.getOprtnOutcomeIssueDtlsCdgDsply() != null) {
			operationoutcomeissuedetailscoding.setDisplay(o.getOprtnOutcomeIssueDtlsCdgDsply());
		}
		/******************** OprtnOutcome_Issue_Dtls_Cdg_Sys ********************************************************************************/
		if(o.getOprtnOutcomeIssueDtlsCdgSys() != null) {
			operationoutcomeissuedetailscoding.setSystem(o.getOprtnOutcomeIssueDtlsCdgSys());
		}
		/******************** OprtnOutcome_Issue_Dtls_Cdg_UsrSltd ********************************************************************************/
		if(o.getOprtnOutcomeIssueDtlsCdgUsrSltd() != null) {
			operationoutcomeissuedetailscoding.setUserSelected(Boolean.parseBoolean(o.getOprtnOutcomeIssueDtlsCdgUsrSltd()));
		}
		/******************** OprtnOutcome_Issue_Dtls_Cdg_Vrsn ********************************************************************************/
		if(o.getOprtnOutcomeIssueDtlsCdgVrsn() != null) {
			operationoutcomeissuedetailscoding.setVersion(o.getOprtnOutcomeIssueDtlsCdgVrsn());
		}
		/******************** OprtnOutcome_Issue_Dtls_Txt ********************************************************************************/
		if(o.getOprtnOutcomeIssueDtlsTxt() != null) {
			operationoutcomeissuedetails.setText(o.getOprtnOutcomeIssueDtlsTxt());
		}
		/******************** OprtnOutcome_Issue_Diagnostics ********************************************************************************/
		if(o.getOprtnOutcomeIssueDiagnostics() != null) {
			operationoutcomeissue.setDiagnostics(o.getOprtnOutcomeIssueDiagnostics());
		}
		/******************** OprtnOutcome_Issue_Exprsn ********************************************************************************/
		if(o.getOprtnOutcomeIssueExprsn() != null) {
			operationoutcomeissue.addExpression(o.getOprtnOutcomeIssueExprsn());
		}
		/******************** OprtnOutcome_Issue_Lctn ********************************************************************************/
		if(o.getOprtnOutcomeIssueLctn() != null) {
			operationoutcomeissue.addLocation(o.getOprtnOutcomeIssueLctn());
		}
		/******************** operationoutcomeissueseverity ********************************************************************************/
		org.hl7.fhir.r4.model.OperationOutcome.IssueSeverityEnumFactory operationoutcomeissueseverity =  new org.hl7.fhir.r4.model.OperationOutcome.IssueSeverityEnumFactory();
		operationoutcomeissue.setSeverity(operationoutcomeissueseverity.fromCode(o.getOprtnOutcomeIssueSeverity()));

		return operationoutcome;
	}
}
