package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.OperationOutcome;
public class OperationOutcomeBidirectionalConversion 
{
	public OperationOutcome OperationOutcomes(org.hl7.fhir.r4.model.OperationOutcome operationoutcome) throws ParseException
	{
		 main.java.com.campfhir.model.OperationOutcome o = new  main.java.com.campfhir.model.OperationOutcome();

		/******************** id ********************************************************************************/
		o.setId(operationoutcome.getIdElement().getIdPart());

		/******************** operationoutcomeissue ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.OperationOutcome.OperationOutcomeIssueComponent> operationoutcomeissuelist = operationoutcome.getIssue();
		for(int operationoutcomeissuei = 0; operationoutcomeissuei<operationoutcomeissuelist.size();operationoutcomeissuei++ ) {
		org.hl7.fhir.r4.model.OperationOutcome.OperationOutcomeIssueComponent  operationoutcomeissue = operationoutcomeissuelist.get(operationoutcomeissuei);

		/******************** OprtnOutcome_Issue_Lctn ********************************************************************************/
		if(operationoutcomeissuei == 0) {o.addOprtnOutcomeIssueLctn("[");}
		if(operationoutcomeissue.hasLocation()) {

			String  array = "[";
			for(int incr=0; incr<operationoutcomeissue.getLocation().size(); incr++) {
				array = array + operationoutcomeissue.getLocation().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			o.addOprtnOutcomeIssueLctn(array);

		} else {
			o.addOprtnOutcomeIssueLctn("NULL");
		}

		if(operationoutcomeissuei == operationoutcomeissuelist.size()-1) {o.addOprtnOutcomeIssueLctn("]");}


		/******************** operationoutcomeissuecode ********************************************************************************/
		org.hl7.fhir.r4.model.OperationOutcome.IssueType operationoutcomeissuecode = operationoutcomeissue.getCode();
		if(operationoutcomeissuecode!=null) {
		if(operationoutcomeissuei == 0) {

		o.addOprtnOutcomeIssueCd("[");		}
			o.addOprtnOutcomeIssueCd(operationoutcomeissuecode.toCode());
		if(operationoutcomeissuei == operationoutcomeissuelist.size()-1) {

		o.addOprtnOutcomeIssueCd("]");		}

		} else {
			o.addOprtnOutcomeIssueCd("NULL");
		}

		/******************** operationoutcomeissueseverity ********************************************************************************/
		org.hl7.fhir.r4.model.OperationOutcome.IssueSeverity operationoutcomeissueseverity = operationoutcomeissue.getSeverity();
		if(operationoutcomeissueseverity!=null) {
		if(operationoutcomeissuei == 0) {

		o.addOprtnOutcomeIssueSeverity("[");		}
			o.addOprtnOutcomeIssueSeverity(operationoutcomeissueseverity.toCode());
		if(operationoutcomeissuei == operationoutcomeissuelist.size()-1) {

		o.addOprtnOutcomeIssueSeverity("]");		}

		} else {
			o.addOprtnOutcomeIssueSeverity("NULL");
		}

		/******************** operationoutcomeissuedetails ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept operationoutcomeissuedetails = operationoutcomeissue.getDetails();

		/******************** OprtnOutcome_Issue_Dtls_Txt ********************************************************************************/
		if(operationoutcomeissuei == 0) {o.addOprtnOutcomeIssueDtlsTxt("[");}
		if(operationoutcomeissuedetails.hasText()) {

			o.addOprtnOutcomeIssueDtlsTxt(String.valueOf(operationoutcomeissuedetails.getText()));
		} else {
			o.addOprtnOutcomeIssueDtlsTxt("NULL");
		}

		if(operationoutcomeissuei == operationoutcomeissuelist.size()-1) {o.addOprtnOutcomeIssueDtlsTxt("]");}


		/******************** operationoutcomeissuedetailscoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> operationoutcomeissuedetailscodinglist = operationoutcomeissuedetails.getCoding();
		for(int operationoutcomeissuedetailscodingi = 0; operationoutcomeissuedetailscodingi<operationoutcomeissuedetailscodinglist.size();operationoutcomeissuedetailscodingi++ ) {
		org.hl7.fhir.r4.model.Coding  operationoutcomeissuedetailscoding = operationoutcomeissuedetailscodinglist.get(operationoutcomeissuedetailscodingi);

		/******************** OprtnOutcome_Issue_Dtls_Cdg_Dsply ********************************************************************************/
		if(operationoutcomeissuedetailscodingi == 0) {o.addOprtnOutcomeIssueDtlsCdgDsply("[[");}
		if(operationoutcomeissuedetailscoding.hasDisplay()) {

			o.addOprtnOutcomeIssueDtlsCdgDsply(String.valueOf(operationoutcomeissuedetailscoding.getDisplay()));
		} else {
			o.addOprtnOutcomeIssueDtlsCdgDsply("NULL");
		}

		if(operationoutcomeissuedetailscodingi == operationoutcomeissuedetailscodinglist.size()-1) {o.addOprtnOutcomeIssueDtlsCdgDsply("]]");}


		/******************** OprtnOutcome_Issue_Dtls_Cdg_Vrsn ********************************************************************************/
		if(operationoutcomeissuedetailscodingi == 0) {o.addOprtnOutcomeIssueDtlsCdgVrsn("[[");}
		if(operationoutcomeissuedetailscoding.hasVersion()) {

			o.addOprtnOutcomeIssueDtlsCdgVrsn(String.valueOf(operationoutcomeissuedetailscoding.getVersion()));
		} else {
			o.addOprtnOutcomeIssueDtlsCdgVrsn("NULL");
		}

		if(operationoutcomeissuedetailscodingi == operationoutcomeissuedetailscodinglist.size()-1) {o.addOprtnOutcomeIssueDtlsCdgVrsn("]]");}


		/******************** OprtnOutcome_Issue_Dtls_Cdg_Cd ********************************************************************************/
		if(operationoutcomeissuedetailscodingi == 0) {o.addOprtnOutcomeIssueDtlsCdgCd("[[");}
		if(operationoutcomeissuedetailscoding.hasCode()) {

			o.addOprtnOutcomeIssueDtlsCdgCd(String.valueOf(operationoutcomeissuedetailscoding.getCode()));
		} else {
			o.addOprtnOutcomeIssueDtlsCdgCd("NULL");
		}

		if(operationoutcomeissuedetailscodingi == operationoutcomeissuedetailscodinglist.size()-1) {o.addOprtnOutcomeIssueDtlsCdgCd("]]");}


		/******************** OprtnOutcome_Issue_Dtls_Cdg_UsrSltd ********************************************************************************/
		if(operationoutcomeissuedetailscodingi == 0) {o.addOprtnOutcomeIssueDtlsCdgUsrSltd("[[");}
		if(operationoutcomeissuedetailscoding.hasUserSelected()) {

			o.addOprtnOutcomeIssueDtlsCdgUsrSltd(String.valueOf(operationoutcomeissuedetailscoding.getUserSelected()));
		} else {
			o.addOprtnOutcomeIssueDtlsCdgUsrSltd("NULL");
		}

		if(operationoutcomeissuedetailscodingi == operationoutcomeissuedetailscodinglist.size()-1) {o.addOprtnOutcomeIssueDtlsCdgUsrSltd("]]");}


		/******************** OprtnOutcome_Issue_Dtls_Cdg_Sys ********************************************************************************/
		if(operationoutcomeissuedetailscodingi == 0) {o.addOprtnOutcomeIssueDtlsCdgSys("[[");}
		if(operationoutcomeissuedetailscoding.hasSystem()) {

			o.addOprtnOutcomeIssueDtlsCdgSys(String.valueOf(operationoutcomeissuedetailscoding.getSystem()));
		} else {
			o.addOprtnOutcomeIssueDtlsCdgSys("NULL");
		}

		if(operationoutcomeissuedetailscodingi == operationoutcomeissuedetailscodinglist.size()-1) {o.addOprtnOutcomeIssueDtlsCdgSys("]]");}


		 };
		/******************** OprtnOutcome_Issue_Exprsn ********************************************************************************/
		if(operationoutcomeissuei == 0) {o.addOprtnOutcomeIssueExprsn("[");}
		if(operationoutcomeissue.hasExpression()) {

			String  array = "[";
			for(int incr=0; incr<operationoutcomeissue.getExpression().size(); incr++) {
				array = array + operationoutcomeissue.getExpression().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			o.addOprtnOutcomeIssueExprsn(array);

		} else {
			o.addOprtnOutcomeIssueExprsn("NULL");
		}

		if(operationoutcomeissuei == operationoutcomeissuelist.size()-1) {o.addOprtnOutcomeIssueExprsn("]");}


		/******************** OprtnOutcome_Issue_Diagnostics ********************************************************************************/
		if(operationoutcomeissuei == 0) {o.addOprtnOutcomeIssueDiagnostics("[");}
		if(operationoutcomeissue.hasDiagnostics()) {

			o.addOprtnOutcomeIssueDiagnostics(String.valueOf(operationoutcomeissue.getDiagnostics()));
		} else {
			o.addOprtnOutcomeIssueDiagnostics("NULL");
		}

		if(operationoutcomeissuei == operationoutcomeissuelist.size()-1) {o.addOprtnOutcomeIssueDiagnostics("]");}


		 };
		return o;
	}
}
