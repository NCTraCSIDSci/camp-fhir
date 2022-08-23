package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.DiagnosticReport;
public class DiagnosticReportConversion 
{
	public org.hl7.fhir.r4.model.DiagnosticReport DiagnosticReports(DiagnosticReport d) throws ParseException
	{
		org.hl7.fhir.r4.model.DiagnosticReport diagnosticreport = new org.hl7.fhir.r4.model.DiagnosticReport();

		/******************** id ********************************************************************************/
		diagnosticreport.setId(d.getId());

		/******************** DiagnosticRpt_BasedOn ********************************************************************************/
		if(d.getDiagnosticRptBasedOn() != null ) {

				for( String currListStrSplit : d.getDiagnosticRptBasedOn().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			diagnosticreport.addBasedOn(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** DiagnosticRpt_Ctgry_Cdg_Cd ********************************************************************************/
		if(d.getDiagnosticRptCtgryCdgCd() != null ) {

			String[] arrayi0 = d.getDiagnosticRptCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getCategory().size() < i0+1) { diagnosticreport.addCategory(); }
				String[] arrayi1 = d.getDiagnosticRptCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(diagnosticreport.getCategory().get(i0).getCoding().size() < i1+1) { diagnosticreport.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {diagnosticreport.getCategory().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DiagnosticRpt_Ctgry_Cdg_Dsply ********************************************************************************/
		if(d.getDiagnosticRptCtgryCdgDsply() != null ) {

			String[] arrayi0 = d.getDiagnosticRptCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getCategory().size() < i0+1) { diagnosticreport.addCategory(); }
				String[] arrayi1 = d.getDiagnosticRptCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(diagnosticreport.getCategory().get(i0).getCoding().size() < i1+1) { diagnosticreport.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {diagnosticreport.getCategory().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DiagnosticRpt_Ctgry_Cdg_Sys ********************************************************************************/
		if(d.getDiagnosticRptCtgryCdgSys() != null ) {

			String[] arrayi0 = d.getDiagnosticRptCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getCategory().size() < i0+1) { diagnosticreport.addCategory(); }
				String[] arrayi1 = d.getDiagnosticRptCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(diagnosticreport.getCategory().get(i0).getCoding().size() < i1+1) { diagnosticreport.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {diagnosticreport.getCategory().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DiagnosticRpt_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(d.getDiagnosticRptCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDiagnosticRptCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getCategory().size() < i0+1) { diagnosticreport.addCategory(); }
				String[] arrayi1 = d.getDiagnosticRptCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(diagnosticreport.getCategory().get(i0).getCoding().size() < i1+1) { diagnosticreport.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {diagnosticreport.getCategory().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** DiagnosticRpt_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(d.getDiagnosticRptCtgryCdgVrsn() != null ) {

			String[] arrayi0 = d.getDiagnosticRptCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getCategory().size() < i0+1) { diagnosticreport.addCategory(); }
				String[] arrayi1 = d.getDiagnosticRptCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(diagnosticreport.getCategory().get(i0).getCoding().size() < i1+1) { diagnosticreport.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {diagnosticreport.getCategory().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DiagnosticRpt_Ctgry_Txt ********************************************************************************/
		if(d.getDiagnosticRptCtgryTxt() != null ) {

			String[] arrayi0 = d.getDiagnosticRptCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getCategory().size() < i0+1) { diagnosticreport.addCategory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {diagnosticreport.getCategory().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DiagnosticRpt_Cd_Cdg_Cd ********************************************************************************/
		if(d.getDiagnosticRptCdCdgCd() != null ) {

			String[] arrayi0 = d.getDiagnosticRptCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getCode().getCoding().size() < i0+1) { diagnosticreport.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {diagnosticreport.getCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DiagnosticRpt_Cd_Cdg_Dsply ********************************************************************************/
		if(d.getDiagnosticRptCdCdgDsply() != null ) {

			String[] arrayi0 = d.getDiagnosticRptCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getCode().getCoding().size() < i0+1) { diagnosticreport.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {diagnosticreport.getCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DiagnosticRpt_Cd_Cdg_Sys ********************************************************************************/
		if(d.getDiagnosticRptCdCdgSys() != null ) {

			String[] arrayi0 = d.getDiagnosticRptCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getCode().getCoding().size() < i0+1) { diagnosticreport.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {diagnosticreport.getCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DiagnosticRpt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(d.getDiagnosticRptCdCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDiagnosticRptCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getCode().getCoding().size() < i0+1) { diagnosticreport.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {diagnosticreport.getCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DiagnosticRpt_Cd_Cdg_Vrsn ********************************************************************************/
		if(d.getDiagnosticRptCdCdgVrsn() != null ) {

			String[] arrayi0 = d.getDiagnosticRptCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getCode().getCoding().size() < i0+1) { diagnosticreport.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {diagnosticreport.getCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DiagnosticRpt_Cd_Txt ********************************************************************************/
		if(d.getDiagnosticRptCdTxt() != null ) {

			if(d.getDiagnosticRptCdTxt().replace("[","").replace("]","").equals("NULL") | d.getDiagnosticRptCdTxt()==null) {} else {
			diagnosticreport.getCode().setText(d.getDiagnosticRptCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DiagnosticRpt_Conclusion ********************************************************************************/
		if(d.getDiagnosticRptConclusion() != null ) {

			if(d.getDiagnosticRptConclusion().replace("[","").replace("]","").equals("NULL") | d.getDiagnosticRptConclusion()==null) {} else {
			diagnosticreport.setConclusion(d.getDiagnosticRptConclusion().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DiagnosticRpt_ConclusionCd_Cdg_Cd ********************************************************************************/
		if(d.getDiagnosticRptConclusionCdCdgCd() != null ) {

			String[] arrayi0 = d.getDiagnosticRptConclusionCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getConclusionCode().size() < i0+1) { diagnosticreport.addConclusionCode(); }
				String[] arrayi1 = d.getDiagnosticRptConclusionCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(diagnosticreport.getConclusionCode().get(i0).getCoding().size() < i1+1) { diagnosticreport.getConclusionCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {diagnosticreport.getConclusionCode().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DiagnosticRpt_ConclusionCd_Cdg_Dsply ********************************************************************************/
		if(d.getDiagnosticRptConclusionCdCdgDsply() != null ) {

			String[] arrayi0 = d.getDiagnosticRptConclusionCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getConclusionCode().size() < i0+1) { diagnosticreport.addConclusionCode(); }
				String[] arrayi1 = d.getDiagnosticRptConclusionCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(diagnosticreport.getConclusionCode().get(i0).getCoding().size() < i1+1) { diagnosticreport.getConclusionCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {diagnosticreport.getConclusionCode().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DiagnosticRpt_ConclusionCd_Cdg_Sys ********************************************************************************/
		if(d.getDiagnosticRptConclusionCdCdgSys() != null ) {

			String[] arrayi0 = d.getDiagnosticRptConclusionCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getConclusionCode().size() < i0+1) { diagnosticreport.addConclusionCode(); }
				String[] arrayi1 = d.getDiagnosticRptConclusionCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(diagnosticreport.getConclusionCode().get(i0).getCoding().size() < i1+1) { diagnosticreport.getConclusionCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {diagnosticreport.getConclusionCode().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DiagnosticRpt_ConclusionCd_Cdg_UsrSltd ********************************************************************************/
		if(d.getDiagnosticRptConclusionCdCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDiagnosticRptConclusionCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getConclusionCode().size() < i0+1) { diagnosticreport.addConclusionCode(); }
				String[] arrayi1 = d.getDiagnosticRptConclusionCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(diagnosticreport.getConclusionCode().get(i0).getCoding().size() < i1+1) { diagnosticreport.getConclusionCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {diagnosticreport.getConclusionCode().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** DiagnosticRpt_ConclusionCd_Cdg_Vrsn ********************************************************************************/
		if(d.getDiagnosticRptConclusionCdCdgVrsn() != null ) {

			String[] arrayi0 = d.getDiagnosticRptConclusionCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getConclusionCode().size() < i0+1) { diagnosticreport.addConclusionCode(); }
				String[] arrayi1 = d.getDiagnosticRptConclusionCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(diagnosticreport.getConclusionCode().get(i0).getCoding().size() < i1+1) { diagnosticreport.getConclusionCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {diagnosticreport.getConclusionCode().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DiagnosticRpt_ConclusionCd_Txt ********************************************************************************/
		if(d.getDiagnosticRptConclusionCdTxt() != null ) {

			String[] arrayi0 = d.getDiagnosticRptConclusionCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getConclusionCode().size() < i0+1) { diagnosticreport.addConclusionCode(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {diagnosticreport.getConclusionCode().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DiagnosticRpt_EfctiveDtTimeTyp ********************************************************************************/
		if(d.getDiagnosticRptEfctiveDtTimeTyp() != null ) {

			if(d.getDiagnosticRptEfctiveDtTimeTyp().replace("[","").replace("]","").equals("NULL") | d.getDiagnosticRptEfctiveDtTimeTyp()==null) {} else {
			diagnosticreport.setEffective(new org.hl7.fhir.r4.model.DateTimeType(d.getDiagnosticRptEfctiveDtTimeTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DiagnosticRpt_EfctivePrd_End ********************************************************************************/
		if(d.getDiagnosticRptEfctivePrdEnd() != null ) {

			if(d.getDiagnosticRptEfctivePrdEnd().replace("[","").replace("]","").equals("NULL") | d.getDiagnosticRptEfctivePrdEnd()==null) {} else {
			diagnosticreport.getEffectivePeriod().setEnd(d.getDiagnosticRptEfctivePrdEnd().replace("[","").replace("]","").equals("NULL") | d.getDiagnosticRptEfctivePrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(d.getDiagnosticRptEfctivePrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DiagnosticRpt_EfctivePrd_Strt ********************************************************************************/
		if(d.getDiagnosticRptEfctivePrdStrt() != null ) {

			if(d.getDiagnosticRptEfctivePrdStrt().replace("[","").replace("]","").equals("NULL") | d.getDiagnosticRptEfctivePrdStrt()==null) {} else {
			diagnosticreport.getEffectivePeriod().setStart(d.getDiagnosticRptEfctivePrdStrt().replace("[","").replace("]","").equals("NULL") | d.getDiagnosticRptEfctivePrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(d.getDiagnosticRptEfctivePrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DiagnosticRpt_Enc ********************************************************************************/
		if(d.getDiagnosticRptEnc() != null ) {

			if(d.getDiagnosticRptEnc().replace("[","").replace("]","").equals("NULL") | d.getDiagnosticRptEnc()==null) {} else {
			diagnosticreport.setEncounter(new org.hl7.fhir.r4.model.Reference(d.getDiagnosticRptEnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DiagnosticRpt_Id_Assigner ********************************************************************************/
		if(d.getDiagnosticRptIdAssigner() != null ) {

			String[] arrayi0 = d.getDiagnosticRptIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getIdentifier().size() < i0+1) { diagnosticreport.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {diagnosticreport.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DiagnosticRpt_Id_Prd_End ********************************************************************************/
		if(d.getDiagnosticRptIdPrdEnd() != null ) {

			String[] arrayi0 = d.getDiagnosticRptIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getIdentifier().size() < i0+1) { diagnosticreport.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {diagnosticreport.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DiagnosticRpt_Id_Prd_Strt ********************************************************************************/
		if(d.getDiagnosticRptIdPrdStrt() != null ) {

			String[] arrayi0 = d.getDiagnosticRptIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getIdentifier().size() < i0+1) { diagnosticreport.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {diagnosticreport.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DiagnosticRpt_Id_Sys ********************************************************************************/
		if(d.getDiagnosticRptIdSys() != null ) {

			String[] arrayi0 = d.getDiagnosticRptIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getIdentifier().size() < i0+1) { diagnosticreport.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {diagnosticreport.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DiagnosticRpt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDiagnosticRptIdTypCdgCd() != null ) {

			String[] arrayi0 = d.getDiagnosticRptIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getIdentifier().size() < i0+1) { diagnosticreport.addIdentifier(); }
				String[] arrayi1 = d.getDiagnosticRptIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(diagnosticreport.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { diagnosticreport.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {diagnosticreport.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DiagnosticRpt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDiagnosticRptIdTypCdgDsply() != null ) {

			String[] arrayi0 = d.getDiagnosticRptIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getIdentifier().size() < i0+1) { diagnosticreport.addIdentifier(); }
				String[] arrayi1 = d.getDiagnosticRptIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(diagnosticreport.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { diagnosticreport.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {diagnosticreport.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DiagnosticRpt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDiagnosticRptIdTypCdgSys() != null ) {

			String[] arrayi0 = d.getDiagnosticRptIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getIdentifier().size() < i0+1) { diagnosticreport.addIdentifier(); }
				String[] arrayi1 = d.getDiagnosticRptIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(diagnosticreport.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { diagnosticreport.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {diagnosticreport.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DiagnosticRpt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDiagnosticRptIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDiagnosticRptIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getIdentifier().size() < i0+1) { diagnosticreport.addIdentifier(); }
				String[] arrayi1 = d.getDiagnosticRptIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(diagnosticreport.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { diagnosticreport.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {diagnosticreport.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** DiagnosticRpt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDiagnosticRptIdTypCdgVrsn() != null ) {

			String[] arrayi0 = d.getDiagnosticRptIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getIdentifier().size() < i0+1) { diagnosticreport.addIdentifier(); }
				String[] arrayi1 = d.getDiagnosticRptIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(diagnosticreport.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { diagnosticreport.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {diagnosticreport.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DiagnosticRpt_Id_Typ_Txt ********************************************************************************/
		if(d.getDiagnosticRptIdTypTxt() != null ) {

			String[] arrayi0 = d.getDiagnosticRptIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getIdentifier().size() < i0+1) { diagnosticreport.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {diagnosticreport.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DiagnosticRpt_Id_Use ********************************************************************************/
		if(d.getDiagnosticRptIdUse() != null ) {

			String[] arrayi0 = d.getDiagnosticRptIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getIdentifier().size() < i0+1) { diagnosticreport.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {diagnosticreport.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DiagnosticRpt_Id_Vl ********************************************************************************/
		if(d.getDiagnosticRptIdVl() != null ) {

			String[] arrayi0 = d.getDiagnosticRptIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getIdentifier().size() < i0+1) { diagnosticreport.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {diagnosticreport.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DiagnosticRpt_ImgngStdy ********************************************************************************/
		if(d.getDiagnosticRptImgngStdy() != null ) {

				for( String currListStrSplit : d.getDiagnosticRptImgngStdy().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			diagnosticreport.addImagingStudy(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** DiagnosticRpt_Issued ********************************************************************************/
		if(d.getDiagnosticRptIssued() != null ) {

			if(d.getDiagnosticRptIssued().replace("[","").replace("]","").equals("NULL") | d.getDiagnosticRptIssued()==null) {} else {
			diagnosticreport.setIssued(d.getDiagnosticRptIssued().replace("[","").replace("]","").equals("NULL") | d.getDiagnosticRptIssued()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(d.getDiagnosticRptIssued().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DiagnosticRpt_Media_Comment ********************************************************************************/
		if(d.getDiagnosticRptMediaComment() != null ) {

			String[] arrayi0 = d.getDiagnosticRptMediaComment().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getMedia().size() < i0+1) { diagnosticreport.addMedia(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {diagnosticreport.getMedia().get(i0).setComment(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DiagnosticRpt_Media_Link ********************************************************************************/
		if(d.getDiagnosticRptMediaLink() != null ) {

			String[] arrayi0 = d.getDiagnosticRptMediaLink().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getMedia().size() < i0+1) { diagnosticreport.addMedia(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {diagnosticreport.getMedia().get(i0).setLink(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DiagnosticRpt_Prfrmr ********************************************************************************/
		if(d.getDiagnosticRptPrfrmr() != null ) {

				for( String currListStrSplit : d.getDiagnosticRptPrfrmr().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			diagnosticreport.addPerformer(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** DiagnosticRpt_PresentedFrm_CntntTyp ********************************************************************************/
		if(d.getDiagnosticRptPresentedFrmCntntTyp() != null ) {

			String[] arrayi0 = d.getDiagnosticRptPresentedFrmCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getPresentedForm().size() < i0+1) { diagnosticreport.addPresentedForm(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {diagnosticreport.getPresentedForm().get(i0).setContentType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DiagnosticRpt_PresentedFrm_Creation ********************************************************************************/
		if(d.getDiagnosticRptPresentedFrmCreation() != null ) {

			String[] arrayi0 = d.getDiagnosticRptPresentedFrmCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getPresentedForm().size() < i0+1) { diagnosticreport.addPresentedForm(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {diagnosticreport.getPresentedForm().get(i0).setCreation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DiagnosticRpt_PresentedFrm_Data ********************************************************************************/
		if(d.getDiagnosticRptPresentedFrmData() != null ) {

			String[] arrayi0 = d.getDiagnosticRptPresentedFrmData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getPresentedForm().size() < i0+1) { diagnosticreport.addPresentedForm(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {diagnosticreport.getPresentedForm().get(i0).setData(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** DiagnosticRpt_PresentedFrm_Hash ********************************************************************************/
		if(d.getDiagnosticRptPresentedFrmHash() != null ) {

			String[] arrayi0 = d.getDiagnosticRptPresentedFrmHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getPresentedForm().size() < i0+1) { diagnosticreport.addPresentedForm(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {diagnosticreport.getPresentedForm().get(i0).setHash(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** DiagnosticRpt_PresentedFrm_Lnguage ********************************************************************************/
		if(d.getDiagnosticRptPresentedFrmLnguage() != null ) {

			String[] arrayi0 = d.getDiagnosticRptPresentedFrmLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getPresentedForm().size() < i0+1) { diagnosticreport.addPresentedForm(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {diagnosticreport.getPresentedForm().get(i0).setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DiagnosticRpt_PresentedFrm_Sz ********************************************************************************/
		if(d.getDiagnosticRptPresentedFrmSz() != null ) {

			String[] arrayi0 = d.getDiagnosticRptPresentedFrmSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getPresentedForm().size() < i0+1) { diagnosticreport.addPresentedForm(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {diagnosticreport.getPresentedForm().get(i0).setSize(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DiagnosticRpt_PresentedFrm_Ttl ********************************************************************************/
		if(d.getDiagnosticRptPresentedFrmTtl() != null ) {

			String[] arrayi0 = d.getDiagnosticRptPresentedFrmTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getPresentedForm().size() < i0+1) { diagnosticreport.addPresentedForm(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {diagnosticreport.getPresentedForm().get(i0).setTitle(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DiagnosticRpt_PresentedFrm_Url ********************************************************************************/
		if(d.getDiagnosticRptPresentedFrmUrl() != null ) {

			String[] arrayi0 = d.getDiagnosticRptPresentedFrmUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(diagnosticreport.getPresentedForm().size() < i0+1) { diagnosticreport.addPresentedForm(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {diagnosticreport.getPresentedForm().get(i0).setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DiagnosticRpt_RsltsInterpreter ********************************************************************************/
		if(d.getDiagnosticRptRsltsInterpreter() != null ) {

				for( String currListStrSplit : d.getDiagnosticRptRsltsInterpreter().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			diagnosticreport.addResult(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** DiagnosticRpt_RsltsInterpreter ********************************************************************************/
		if(d.getDiagnosticRptRsltsInterpreter() != null ) {

				for( String currListStrSplit : d.getDiagnosticRptRsltsInterpreter().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			diagnosticreport.addResultsInterpreter(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** DiagnosticRpt_Spcmn ********************************************************************************/
		if(d.getDiagnosticRptSpcmn() != null ) {

				for( String currListStrSplit : d.getDiagnosticRptSpcmn().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			diagnosticreport.addSpecimen(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** DiagnosticRpt_Sts ********************************************************************************/
		if(d.getDiagnosticRptSts() != null ) {

			if(d.getDiagnosticRptSts().replace("[","").replace("]","").equals("NULL") | d.getDiagnosticRptSts()==null) {} else {
			diagnosticreport.setStatus(new org.hl7.fhir.r4.model.DiagnosticReport.DiagnosticReportStatusEnumFactory().fromCode(d.getDiagnosticRptSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DiagnosticRpt_Sbjct ********************************************************************************/
		if(d.getDiagnosticRptSbjct() != null ) {

			if(d.getDiagnosticRptSbjct().replace("[","").replace("]","").equals("NULL") | d.getDiagnosticRptSbjct()==null) {} else {
			diagnosticreport.setSubject(new org.hl7.fhir.r4.model.Reference(d.getDiagnosticRptSbjct().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return diagnosticreport;
	}
}
