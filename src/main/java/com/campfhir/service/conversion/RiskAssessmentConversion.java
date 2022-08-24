package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.RiskAssessment;
public class RiskAssessmentConversion 
{
	public org.hl7.fhir.r4.model.RiskAssessment RiskAssessments(RiskAssessment r) throws ParseException
	{
		org.hl7.fhir.r4.model.RiskAssessment riskassessment = new org.hl7.fhir.r4.model.RiskAssessment();

		/******************** id ********************************************************************************/
		riskassessment.setId(r.getId());

		/******************** RskAssmnt_BasedOn ********************************************************************************/
		if(r.getRskAssmntBasedOn() != null ) {

			if(r.getRskAssmntBasedOn().replace("[","").replace("]","").equals("NULL") | r.getRskAssmntBasedOn()==null) {} else {
			riskassessment.setBasedOn(new org.hl7.fhir.r4.model.Reference(r.getRskAssmntBasedOn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RskAssmnt_Basis ********************************************************************************/
		if(r.getRskAssmntBasis() != null ) {

				for( String currListStrSplit : r.getRskAssmntBasis().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			riskassessment.addBasis(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** RskAssmnt_Cd_Cdg_Cd ********************************************************************************/
		if(r.getRskAssmntCdCdgCd() != null ) {

			String[] arrayi0 = r.getRskAssmntCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getCode().getCoding().size() < i0+1) { riskassessment.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskAssmnt_Cd_Cdg_Dsply ********************************************************************************/
		if(r.getRskAssmntCdCdgDsply() != null ) {

			String[] arrayi0 = r.getRskAssmntCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getCode().getCoding().size() < i0+1) { riskassessment.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskAssmnt_Cd_Cdg_Sys ********************************************************************************/
		if(r.getRskAssmntCdCdgSys() != null ) {

			String[] arrayi0 = r.getRskAssmntCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getCode().getCoding().size() < i0+1) { riskassessment.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskAssmnt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(r.getRskAssmntCdCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRskAssmntCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getCode().getCoding().size() < i0+1) { riskassessment.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RskAssmnt_Cd_Cdg_Vrsn ********************************************************************************/
		if(r.getRskAssmntCdCdgVrsn() != null ) {

			String[] arrayi0 = r.getRskAssmntCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getCode().getCoding().size() < i0+1) { riskassessment.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskAssmnt_Cd_Txt ********************************************************************************/
		if(r.getRskAssmntCdTxt() != null ) {

			if(r.getRskAssmntCdTxt().replace("[","").replace("]","").equals("NULL") | r.getRskAssmntCdTxt()==null) {} else {
			riskassessment.getCode().setText(r.getRskAssmntCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RskAssmnt_Cndtn ********************************************************************************/
		if(r.getRskAssmntCndtn() != null ) {

			if(r.getRskAssmntCndtn().replace("[","").replace("]","").equals("NULL") | r.getRskAssmntCndtn()==null) {} else {
			riskassessment.setCondition(new org.hl7.fhir.r4.model.Reference(r.getRskAssmntCndtn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RskAssmnt_Enc ********************************************************************************/
		if(r.getRskAssmntEnc() != null ) {

			if(r.getRskAssmntEnc().replace("[","").replace("]","").equals("NULL") | r.getRskAssmntEnc()==null) {} else {
			riskassessment.setEncounter(new org.hl7.fhir.r4.model.Reference(r.getRskAssmntEnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RskAssmnt_Id_Assigner ********************************************************************************/
		if(r.getRskAssmntIdAssigner() != null ) {

			String[] arrayi0 = r.getRskAssmntIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getIdentifier().size() < i0+1) { riskassessment.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RskAssmnt_Id_Prd_End ********************************************************************************/
		if(r.getRskAssmntIdPrdEnd() != null ) {

			String[] arrayi0 = r.getRskAssmntIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getIdentifier().size() < i0+1) { riskassessment.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RskAssmnt_Id_Prd_Strt ********************************************************************************/
		if(r.getRskAssmntIdPrdStrt() != null ) {

			String[] arrayi0 = r.getRskAssmntIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getIdentifier().size() < i0+1) { riskassessment.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RskAssmnt_Id_Sys ********************************************************************************/
		if(r.getRskAssmntIdSys() != null ) {

			String[] arrayi0 = r.getRskAssmntIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getIdentifier().size() < i0+1) { riskassessment.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskAssmnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(r.getRskAssmntIdTypCdgCd() != null ) {

			String[] arrayi0 = r.getRskAssmntIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getIdentifier().size() < i0+1) { riskassessment.addIdentifier(); }
				String[] arrayi1 = r.getRskAssmntIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskassessment.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { riskassessment.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskassessment.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskAssmnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(r.getRskAssmntIdTypCdgDsply() != null ) {

			String[] arrayi0 = r.getRskAssmntIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getIdentifier().size() < i0+1) { riskassessment.addIdentifier(); }
				String[] arrayi1 = r.getRskAssmntIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskassessment.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { riskassessment.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskassessment.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskAssmnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(r.getRskAssmntIdTypCdgSys() != null ) {

			String[] arrayi0 = r.getRskAssmntIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getIdentifier().size() < i0+1) { riskassessment.addIdentifier(); }
				String[] arrayi1 = r.getRskAssmntIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskassessment.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { riskassessment.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskassessment.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskAssmnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(r.getRskAssmntIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRskAssmntIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getIdentifier().size() < i0+1) { riskassessment.addIdentifier(); }
				String[] arrayi1 = r.getRskAssmntIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskassessment.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { riskassessment.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskassessment.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskAssmnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(r.getRskAssmntIdTypCdgVrsn() != null ) {

			String[] arrayi0 = r.getRskAssmntIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getIdentifier().size() < i0+1) { riskassessment.addIdentifier(); }
				String[] arrayi1 = r.getRskAssmntIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskassessment.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { riskassessment.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskassessment.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskAssmnt_Id_Typ_Txt ********************************************************************************/
		if(r.getRskAssmntIdTypTxt() != null ) {

			String[] arrayi0 = r.getRskAssmntIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getIdentifier().size() < i0+1) { riskassessment.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskAssmnt_Id_Use ********************************************************************************/
		if(r.getRskAssmntIdUse() != null ) {

			String[] arrayi0 = r.getRskAssmntIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getIdentifier().size() < i0+1) { riskassessment.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RskAssmnt_Id_Vl ********************************************************************************/
		if(r.getRskAssmntIdVl() != null ) {

			String[] arrayi0 = r.getRskAssmntIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getIdentifier().size() < i0+1) { riskassessment.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskAssmnt_Mthd_Cdg_Cd ********************************************************************************/
		if(r.getRskAssmntMthdCdgCd() != null ) {

			String[] arrayi0 = r.getRskAssmntMthdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getMethod().getCoding().size() < i0+1) { riskassessment.getMethod().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getMethod().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskAssmnt_Mthd_Cdg_Dsply ********************************************************************************/
		if(r.getRskAssmntMthdCdgDsply() != null ) {

			String[] arrayi0 = r.getRskAssmntMthdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getMethod().getCoding().size() < i0+1) { riskassessment.getMethod().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getMethod().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskAssmnt_Mthd_Cdg_Sys ********************************************************************************/
		if(r.getRskAssmntMthdCdgSys() != null ) {

			String[] arrayi0 = r.getRskAssmntMthdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getMethod().getCoding().size() < i0+1) { riskassessment.getMethod().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getMethod().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskAssmnt_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(r.getRskAssmntMthdCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRskAssmntMthdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getMethod().getCoding().size() < i0+1) { riskassessment.getMethod().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getMethod().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RskAssmnt_Mthd_Cdg_Vrsn ********************************************************************************/
		if(r.getRskAssmntMthdCdgVrsn() != null ) {

			String[] arrayi0 = r.getRskAssmntMthdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getMethod().getCoding().size() < i0+1) { riskassessment.getMethod().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getMethod().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskAssmnt_Mthd_Txt ********************************************************************************/
		if(r.getRskAssmntMthdTxt() != null ) {

			if(r.getRskAssmntMthdTxt().replace("[","").replace("]","").equals("NULL") | r.getRskAssmntMthdTxt()==null) {} else {
			riskassessment.getMethod().setText(r.getRskAssmntMthdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RskAssmnt_Mitigation ********************************************************************************/
		if(r.getRskAssmntMitigation() != null ) {

			if(r.getRskAssmntMitigation().replace("[","").replace("]","").equals("NULL") | r.getRskAssmntMitigation()==null) {} else {
			riskassessment.setMitigation(r.getRskAssmntMitigation().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RskAssmnt_Nt_AthrRfrnc ********************************************************************************/
		if(r.getRskAssmntNtAthrRfrnc() != null ) {

			String[] arrayi0 = r.getRskAssmntNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getNote().size() < i0+1) { riskassessment.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RskAssmnt_Nt_AthrStrgTyp ********************************************************************************/
		if(r.getRskAssmntNtAthrStrgTyp() != null ) {

			String[] arrayi0 = r.getRskAssmntNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getNote().size() < i0+1) { riskassessment.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RskAssmnt_Nt_Txt ********************************************************************************/
		if(r.getRskAssmntNtTxt() != null ) {

			String[] arrayi0 = r.getRskAssmntNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getNote().size() < i0+1) { riskassessment.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskAssmnt_Nt_Time ********************************************************************************/
		if(r.getRskAssmntNtTime() != null ) {

			String[] arrayi0 = r.getRskAssmntNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getNote().size() < i0+1) { riskassessment.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RskAssmnt_OccrnceDtTimeTyp ********************************************************************************/
		if(r.getRskAssmntOccrnceDtTimeTyp() != null ) {

			if(r.getRskAssmntOccrnceDtTimeTyp().replace("[","").replace("]","").equals("NULL") | r.getRskAssmntOccrnceDtTimeTyp()==null) {} else {
			riskassessment.setOccurrence(new org.hl7.fhir.r4.model.DateTimeType(r.getRskAssmntOccrnceDtTimeTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RskAssmnt_OccrncePrd_End ********************************************************************************/
		if(r.getRskAssmntOccrncePrdEnd() != null ) {

			if(r.getRskAssmntOccrncePrdEnd().replace("[","").replace("]","").equals("NULL") | r.getRskAssmntOccrncePrdEnd()==null) {} else {
			riskassessment.getOccurrencePeriod().setEnd(r.getRskAssmntOccrncePrdEnd().replace("[","").replace("]","").equals("NULL") | r.getRskAssmntOccrncePrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(r.getRskAssmntOccrncePrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RskAssmnt_OccrncePrd_Strt ********************************************************************************/
		if(r.getRskAssmntOccrncePrdStrt() != null ) {

			if(r.getRskAssmntOccrncePrdStrt().replace("[","").replace("]","").equals("NULL") | r.getRskAssmntOccrncePrdStrt()==null) {} else {
			riskassessment.getOccurrencePeriod().setStart(r.getRskAssmntOccrncePrdStrt().replace("[","").replace("]","").equals("NULL") | r.getRskAssmntOccrncePrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(r.getRskAssmntOccrncePrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RskAssmnt_Parent ********************************************************************************/
		if(r.getRskAssmntParent() != null ) {

			if(r.getRskAssmntParent().replace("[","").replace("]","").equals("NULL") | r.getRskAssmntParent()==null) {} else {
			riskassessment.setParent(new org.hl7.fhir.r4.model.Reference(r.getRskAssmntParent().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RskAssmnt_Prfrmr ********************************************************************************/
		if(r.getRskAssmntPrfrmr() != null ) {

			if(r.getRskAssmntPrfrmr().replace("[","").replace("]","").equals("NULL") | r.getRskAssmntPrfrmr()==null) {} else {
			riskassessment.setPerformer(new org.hl7.fhir.r4.model.Reference(r.getRskAssmntPrfrmr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RskAssmnt_Prediction_Outcome_Cdg_Cd ********************************************************************************/
		if(r.getRskAssmntPredictionOutcomeCdgCd() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionOutcomeCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				String[] arrayi1 = r.getRskAssmntPredictionOutcomeCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskassessment.getPrediction().get(i0).getOutcome().getCoding().size() < i1+1) { riskassessment.getPrediction().get(i0).getOutcome().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskassessment.getPrediction().get(i0).getOutcome().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskAssmnt_Prediction_Outcome_Cdg_Dsply ********************************************************************************/
		if(r.getRskAssmntPredictionOutcomeCdgDsply() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionOutcomeCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				String[] arrayi1 = r.getRskAssmntPredictionOutcomeCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskassessment.getPrediction().get(i0).getOutcome().getCoding().size() < i1+1) { riskassessment.getPrediction().get(i0).getOutcome().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskassessment.getPrediction().get(i0).getOutcome().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskAssmnt_Prediction_Outcome_Cdg_Sys ********************************************************************************/
		if(r.getRskAssmntPredictionOutcomeCdgSys() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionOutcomeCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				String[] arrayi1 = r.getRskAssmntPredictionOutcomeCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskassessment.getPrediction().get(i0).getOutcome().getCoding().size() < i1+1) { riskassessment.getPrediction().get(i0).getOutcome().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskassessment.getPrediction().get(i0).getOutcome().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskAssmnt_Prediction_Outcome_Cdg_UsrSltd ********************************************************************************/
		if(r.getRskAssmntPredictionOutcomeCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionOutcomeCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				String[] arrayi1 = r.getRskAssmntPredictionOutcomeCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskassessment.getPrediction().get(i0).getOutcome().getCoding().size() < i1+1) { riskassessment.getPrediction().get(i0).getOutcome().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskassessment.getPrediction().get(i0).getOutcome().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskAssmnt_Prediction_Outcome_Cdg_Vrsn ********************************************************************************/
		if(r.getRskAssmntPredictionOutcomeCdgVrsn() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionOutcomeCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				String[] arrayi1 = r.getRskAssmntPredictionOutcomeCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskassessment.getPrediction().get(i0).getOutcome().getCoding().size() < i1+1) { riskassessment.getPrediction().get(i0).getOutcome().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskassessment.getPrediction().get(i0).getOutcome().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskAssmnt_Prediction_Outcome_Txt ********************************************************************************/
		if(r.getRskAssmntPredictionOutcomeTxt() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionOutcomeTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getPrediction().get(i0).getOutcome().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskAssmnt_Prediction_ProbabilityDecimalTyp ********************************************************************************/
		if(r.getRskAssmntPredictionProbabilityDecimalTyp() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionProbabilityDecimalTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getPrediction().get(i0).setProbability(new org.hl7.fhir.r4.model.DecimalType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RskAssmnt_Prediction_ProbabilityRng_Hi_Cd ********************************************************************************/
		if(r.getRskAssmntPredictionProbabilityRngHiCd() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionProbabilityRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getPrediction().get(i0).getProbabilityRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskAssmnt_Prediction_ProbabilityRng_Hi_Cmprtr ********************************************************************************/
		if(r.getRskAssmntPredictionProbabilityRngHiCmprtr() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionProbabilityRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getPrediction().get(i0).getProbabilityRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RskAssmnt_Prediction_ProbabilityRng_Hi_Sys ********************************************************************************/
		if(r.getRskAssmntPredictionProbabilityRngHiSys() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionProbabilityRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getPrediction().get(i0).getProbabilityRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskAssmnt_Prediction_ProbabilityRng_Hi_Unt ********************************************************************************/
		if(r.getRskAssmntPredictionProbabilityRngHiUnt() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionProbabilityRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getPrediction().get(i0).getProbabilityRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskAssmnt_Prediction_ProbabilityRng_Hi_Vl ********************************************************************************/
		if(r.getRskAssmntPredictionProbabilityRngHiVl() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionProbabilityRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getPrediction().get(i0).getProbabilityRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RskAssmnt_Prediction_ProbabilityRng_Lw_Cd ********************************************************************************/
		if(r.getRskAssmntPredictionProbabilityRngLwCd() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionProbabilityRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getPrediction().get(i0).getProbabilityRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskAssmnt_Prediction_ProbabilityRng_Lw_Cmprtr ********************************************************************************/
		if(r.getRskAssmntPredictionProbabilityRngLwCmprtr() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionProbabilityRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getPrediction().get(i0).getProbabilityRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RskAssmnt_Prediction_ProbabilityRng_Lw_Sys ********************************************************************************/
		if(r.getRskAssmntPredictionProbabilityRngLwSys() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionProbabilityRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getPrediction().get(i0).getProbabilityRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskAssmnt_Prediction_ProbabilityRng_Lw_Unt ********************************************************************************/
		if(r.getRskAssmntPredictionProbabilityRngLwUnt() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionProbabilityRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getPrediction().get(i0).getProbabilityRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskAssmnt_Prediction_ProbabilityRng_Lw_Vl ********************************************************************************/
		if(r.getRskAssmntPredictionProbabilityRngLwVl() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionProbabilityRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getPrediction().get(i0).getProbabilityRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RskAssmnt_Prediction_QualitativeRsk_Cdg_Cd ********************************************************************************/
		if(r.getRskAssmntPredictionQualitativeRskCdgCd() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionQualitativeRskCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				String[] arrayi1 = r.getRskAssmntPredictionQualitativeRskCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskassessment.getPrediction().get(i0).getQualitativeRisk().getCoding().size() < i1+1) { riskassessment.getPrediction().get(i0).getQualitativeRisk().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskassessment.getPrediction().get(i0).getQualitativeRisk().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskAssmnt_Prediction_QualitativeRsk_Cdg_Dsply ********************************************************************************/
		if(r.getRskAssmntPredictionQualitativeRskCdgDsply() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionQualitativeRskCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				String[] arrayi1 = r.getRskAssmntPredictionQualitativeRskCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskassessment.getPrediction().get(i0).getQualitativeRisk().getCoding().size() < i1+1) { riskassessment.getPrediction().get(i0).getQualitativeRisk().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskassessment.getPrediction().get(i0).getQualitativeRisk().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskAssmnt_Prediction_QualitativeRsk_Cdg_Sys ********************************************************************************/
		if(r.getRskAssmntPredictionQualitativeRskCdgSys() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionQualitativeRskCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				String[] arrayi1 = r.getRskAssmntPredictionQualitativeRskCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskassessment.getPrediction().get(i0).getQualitativeRisk().getCoding().size() < i1+1) { riskassessment.getPrediction().get(i0).getQualitativeRisk().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskassessment.getPrediction().get(i0).getQualitativeRisk().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskAssmnt_Prediction_QualitativeRsk_Cdg_UsrSltd ********************************************************************************/
		if(r.getRskAssmntPredictionQualitativeRskCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionQualitativeRskCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				String[] arrayi1 = r.getRskAssmntPredictionQualitativeRskCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskassessment.getPrediction().get(i0).getQualitativeRisk().getCoding().size() < i1+1) { riskassessment.getPrediction().get(i0).getQualitativeRisk().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskassessment.getPrediction().get(i0).getQualitativeRisk().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskAssmnt_Prediction_QualitativeRsk_Cdg_Vrsn ********************************************************************************/
		if(r.getRskAssmntPredictionQualitativeRskCdgVrsn() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionQualitativeRskCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				String[] arrayi1 = r.getRskAssmntPredictionQualitativeRskCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskassessment.getPrediction().get(i0).getQualitativeRisk().getCoding().size() < i1+1) { riskassessment.getPrediction().get(i0).getQualitativeRisk().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskassessment.getPrediction().get(i0).getQualitativeRisk().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskAssmnt_Prediction_QualitativeRsk_Txt ********************************************************************************/
		if(r.getRskAssmntPredictionQualitativeRskTxt() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionQualitativeRskTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getPrediction().get(i0).getQualitativeRisk().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskAssmnt_Prediction_Rtionale ********************************************************************************/
		if(r.getRskAssmntPredictionRtionale() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionRtionale().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getPrediction().get(i0).setRationale(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskAssmnt_Prediction_RelativeRsk ********************************************************************************/
		if(r.getRskAssmntPredictionRelativeRsk() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionRelativeRsk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getPrediction().get(i0).setRelativeRisk((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RskAssmnt_Prediction_WhenPrd_End ********************************************************************************/
		if(r.getRskAssmntPredictionWhenPrdEnd() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionWhenPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getPrediction().get(i0).getWhenPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RskAssmnt_Prediction_WhenPrd_Strt ********************************************************************************/
		if(r.getRskAssmntPredictionWhenPrdStrt() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionWhenPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getPrediction().get(i0).getWhenPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RskAssmnt_Prediction_WhenRng_Hi_Cd ********************************************************************************/
		if(r.getRskAssmntPredictionWhenRngHiCd() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionWhenRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getPrediction().get(i0).getWhenRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskAssmnt_Prediction_WhenRng_Hi_Cmprtr ********************************************************************************/
		if(r.getRskAssmntPredictionWhenRngHiCmprtr() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionWhenRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getPrediction().get(i0).getWhenRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RskAssmnt_Prediction_WhenRng_Hi_Sys ********************************************************************************/
		if(r.getRskAssmntPredictionWhenRngHiSys() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionWhenRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getPrediction().get(i0).getWhenRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskAssmnt_Prediction_WhenRng_Hi_Unt ********************************************************************************/
		if(r.getRskAssmntPredictionWhenRngHiUnt() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionWhenRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getPrediction().get(i0).getWhenRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskAssmnt_Prediction_WhenRng_Hi_Vl ********************************************************************************/
		if(r.getRskAssmntPredictionWhenRngHiVl() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionWhenRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getPrediction().get(i0).getWhenRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RskAssmnt_Prediction_WhenRng_Lw_Cd ********************************************************************************/
		if(r.getRskAssmntPredictionWhenRngLwCd() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionWhenRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getPrediction().get(i0).getWhenRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskAssmnt_Prediction_WhenRng_Lw_Cmprtr ********************************************************************************/
		if(r.getRskAssmntPredictionWhenRngLwCmprtr() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionWhenRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getPrediction().get(i0).getWhenRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RskAssmnt_Prediction_WhenRng_Lw_Sys ********************************************************************************/
		if(r.getRskAssmntPredictionWhenRngLwSys() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionWhenRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getPrediction().get(i0).getWhenRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskAssmnt_Prediction_WhenRng_Lw_Unt ********************************************************************************/
		if(r.getRskAssmntPredictionWhenRngLwUnt() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionWhenRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getPrediction().get(i0).getWhenRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskAssmnt_Prediction_WhenRng_Lw_Vl ********************************************************************************/
		if(r.getRskAssmntPredictionWhenRngLwVl() != null ) {

			String[] arrayi0 = r.getRskAssmntPredictionWhenRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getPrediction().size() < i0+1) { riskassessment.addPrediction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getPrediction().get(i0).getWhenRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RskAssmnt_RsnCd_Cdg_Cd ********************************************************************************/
		if(r.getRskAssmntRsnCdCdgCd() != null ) {

			String[] arrayi0 = r.getRskAssmntRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getReasonCode().size() < i0+1) { riskassessment.addReasonCode(); }
				String[] arrayi1 = r.getRskAssmntRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskassessment.getReasonCode().get(i0).getCoding().size() < i1+1) { riskassessment.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskassessment.getReasonCode().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskAssmnt_RsnCd_Cdg_Dsply ********************************************************************************/
		if(r.getRskAssmntRsnCdCdgDsply() != null ) {

			String[] arrayi0 = r.getRskAssmntRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getReasonCode().size() < i0+1) { riskassessment.addReasonCode(); }
				String[] arrayi1 = r.getRskAssmntRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskassessment.getReasonCode().get(i0).getCoding().size() < i1+1) { riskassessment.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskassessment.getReasonCode().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskAssmnt_RsnCd_Cdg_Sys ********************************************************************************/
		if(r.getRskAssmntRsnCdCdgSys() != null ) {

			String[] arrayi0 = r.getRskAssmntRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getReasonCode().size() < i0+1) { riskassessment.addReasonCode(); }
				String[] arrayi1 = r.getRskAssmntRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskassessment.getReasonCode().get(i0).getCoding().size() < i1+1) { riskassessment.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskassessment.getReasonCode().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskAssmnt_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(r.getRskAssmntRsnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRskAssmntRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getReasonCode().size() < i0+1) { riskassessment.addReasonCode(); }
				String[] arrayi1 = r.getRskAssmntRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskassessment.getReasonCode().get(i0).getCoding().size() < i1+1) { riskassessment.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskassessment.getReasonCode().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskAssmnt_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(r.getRskAssmntRsnCdCdgVrsn() != null ) {

			String[] arrayi0 = r.getRskAssmntRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getReasonCode().size() < i0+1) { riskassessment.addReasonCode(); }
				String[] arrayi1 = r.getRskAssmntRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskassessment.getReasonCode().get(i0).getCoding().size() < i1+1) { riskassessment.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskassessment.getReasonCode().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskAssmnt_RsnCd_Txt ********************************************************************************/
		if(r.getRskAssmntRsnCdTxt() != null ) {

			String[] arrayi0 = r.getRskAssmntRsnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskassessment.getReasonCode().size() < i0+1) { riskassessment.addReasonCode(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskassessment.getReasonCode().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskAssmnt_RsnRfrnc ********************************************************************************/
		if(r.getRskAssmntRsnRfrnc() != null ) {

				for( String currListStrSplit : r.getRskAssmntRsnRfrnc().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			riskassessment.addReasonReference(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** RskAssmnt_Sts ********************************************************************************/
		if(r.getRskAssmntSts() != null ) {

			if(r.getRskAssmntSts().replace("[","").replace("]","").equals("NULL") | r.getRskAssmntSts()==null) {} else {
			riskassessment.setStatus(new org.hl7.fhir.r4.model.RiskAssessment.RiskAssessmentStatusEnumFactory().fromCode(r.getRskAssmntSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RskAssmnt_Sbjct ********************************************************************************/
		if(r.getRskAssmntSbjct() != null ) {

			if(r.getRskAssmntSbjct().replace("[","").replace("]","").equals("NULL") | r.getRskAssmntSbjct()==null) {} else {
			riskassessment.setSubject(new org.hl7.fhir.r4.model.Reference(r.getRskAssmntSbjct().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return riskassessment;
	}
}
