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

		/******************** OprtnOutcome_Issue_Cd ********************************************************************************/
		if(o.getOprtnOutcomeIssueCd() != null ) {

			String[] arrayi0 = o.getOprtnOutcomeIssueCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationoutcome.getIssue().size() < i0+1) { operationoutcome.addIssue(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationoutcome.getIssue().get(i0).setCode(new org.hl7.fhir.r4.model.OperationOutcome.IssueTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** OprtnOutcome_Issue_Dtls_Cdg_Cd ********************************************************************************/
		if(o.getOprtnOutcomeIssueDtlsCdgCd() != null ) {

			String[] arrayi0 = o.getOprtnOutcomeIssueDtlsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationoutcome.getIssue().size() < i0+1) { operationoutcome.addIssue(); }
				String[] arrayi1 = o.getOprtnOutcomeIssueDtlsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(operationoutcome.getIssue().get(i0).getDetails().getCoding().size() < i1+1) { operationoutcome.getIssue().get(i0).getDetails().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {operationoutcome.getIssue().get(i0).getDetails().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** OprtnOutcome_Issue_Dtls_Cdg_Dsply ********************************************************************************/
		if(o.getOprtnOutcomeIssueDtlsCdgDsply() != null ) {

			String[] arrayi0 = o.getOprtnOutcomeIssueDtlsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationoutcome.getIssue().size() < i0+1) { operationoutcome.addIssue(); }
				String[] arrayi1 = o.getOprtnOutcomeIssueDtlsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(operationoutcome.getIssue().get(i0).getDetails().getCoding().size() < i1+1) { operationoutcome.getIssue().get(i0).getDetails().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {operationoutcome.getIssue().get(i0).getDetails().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** OprtnOutcome_Issue_Dtls_Cdg_Sys ********************************************************************************/
		if(o.getOprtnOutcomeIssueDtlsCdgSys() != null ) {

			String[] arrayi0 = o.getOprtnOutcomeIssueDtlsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationoutcome.getIssue().size() < i0+1) { operationoutcome.addIssue(); }
				String[] arrayi1 = o.getOprtnOutcomeIssueDtlsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(operationoutcome.getIssue().get(i0).getDetails().getCoding().size() < i1+1) { operationoutcome.getIssue().get(i0).getDetails().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {operationoutcome.getIssue().get(i0).getDetails().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** OprtnOutcome_Issue_Dtls_Cdg_UsrSltd ********************************************************************************/
		if(o.getOprtnOutcomeIssueDtlsCdgUsrSltd() != null ) {

			String[] arrayi0 = o.getOprtnOutcomeIssueDtlsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationoutcome.getIssue().size() < i0+1) { operationoutcome.addIssue(); }
				String[] arrayi1 = o.getOprtnOutcomeIssueDtlsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(operationoutcome.getIssue().get(i0).getDetails().getCoding().size() < i1+1) { operationoutcome.getIssue().get(i0).getDetails().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {operationoutcome.getIssue().get(i0).getDetails().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** OprtnOutcome_Issue_Dtls_Cdg_Vrsn ********************************************************************************/
		if(o.getOprtnOutcomeIssueDtlsCdgVrsn() != null ) {

			String[] arrayi0 = o.getOprtnOutcomeIssueDtlsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationoutcome.getIssue().size() < i0+1) { operationoutcome.addIssue(); }
				String[] arrayi1 = o.getOprtnOutcomeIssueDtlsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(operationoutcome.getIssue().get(i0).getDetails().getCoding().size() < i1+1) { operationoutcome.getIssue().get(i0).getDetails().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {operationoutcome.getIssue().get(i0).getDetails().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** OprtnOutcome_Issue_Dtls_Txt ********************************************************************************/
		if(o.getOprtnOutcomeIssueDtlsTxt() != null ) {

			String[] arrayi0 = o.getOprtnOutcomeIssueDtlsTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationoutcome.getIssue().size() < i0+1) { operationoutcome.addIssue(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationoutcome.getIssue().get(i0).getDetails().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** OprtnOutcome_Issue_Diagnostics ********************************************************************************/
		if(o.getOprtnOutcomeIssueDiagnostics() != null ) {

			String[] arrayi0 = o.getOprtnOutcomeIssueDiagnostics().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationoutcome.getIssue().size() < i0+1) { operationoutcome.addIssue(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationoutcome.getIssue().get(i0).setDiagnostics(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** OprtnOutcome_Issue_Exprsn ********************************************************************************/
		if(o.getOprtnOutcomeIssueExprsn() != null ) {

			String[] arrayi0 = o.getOprtnOutcomeIssueExprsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationoutcome.getIssue().size() < i0+1) { operationoutcome.addIssue(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {operationoutcome.getIssue().get(i0).addExpression(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** OprtnOutcome_Issue_Lctn ********************************************************************************/
		if(o.getOprtnOutcomeIssueLctn() != null ) {

			String[] arrayi0 = o.getOprtnOutcomeIssueLctn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationoutcome.getIssue().size() < i0+1) { operationoutcome.addIssue(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {operationoutcome.getIssue().get(i0).addLocation(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** OprtnOutcome_Issue_Severity ********************************************************************************/
		if(o.getOprtnOutcomeIssueSeverity() != null ) {

			String[] arrayi0 = o.getOprtnOutcomeIssueSeverity().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(operationoutcome.getIssue().size() < i0+1) { operationoutcome.addIssue(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {operationoutcome.getIssue().get(i0).setSeverity(new org.hl7.fhir.r4.model.OperationOutcome.IssueSeverityEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		return operationoutcome;
	}
}
