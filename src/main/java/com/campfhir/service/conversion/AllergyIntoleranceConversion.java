package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.AllergyIntolerance;
public class AllergyIntoleranceConversion 
{
	public org.hl7.fhir.r4.model.AllergyIntolerance AllergyIntolerances(AllergyIntolerance a) throws ParseException
	{
		org.hl7.fhir.r4.model.AllergyIntolerance allergyintolerance = new org.hl7.fhir.r4.model.AllergyIntolerance();

		/******************** id ********************************************************************************/
		allergyintolerance.setId(a.getId());

		/******************** AlrgyIntolerance_Asserter ********************************************************************************/
		if(a.getAlrgyIntoleranceAsserter() != null ) {

			if(a.getAlrgyIntoleranceAsserter().replace("[","").replace("]","").equals("NULL") | a.getAlrgyIntoleranceAsserter()==null) {} else {
			allergyintolerance.setAsserter(new org.hl7.fhir.r4.model.Reference(a.getAlrgyIntoleranceAsserter().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AlrgyIntolerance_ClnclSts_Cdg_Cd ********************************************************************************/
		if(a.getAlrgyIntoleranceClnclStsCdgCd() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceClnclStsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getClinicalStatus().getCoding().size() < i0+1) { allergyintolerance.getClinicalStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {allergyintolerance.getClinicalStatus().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AlrgyIntolerance_ClnclSts_Cdg_Dsply ********************************************************************************/
		if(a.getAlrgyIntoleranceClnclStsCdgDsply() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceClnclStsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getClinicalStatus().getCoding().size() < i0+1) { allergyintolerance.getClinicalStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {allergyintolerance.getClinicalStatus().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AlrgyIntolerance_ClnclSts_Cdg_Sys ********************************************************************************/
		if(a.getAlrgyIntoleranceClnclStsCdgSys() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceClnclStsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getClinicalStatus().getCoding().size() < i0+1) { allergyintolerance.getClinicalStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {allergyintolerance.getClinicalStatus().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AlrgyIntolerance_ClnclSts_Cdg_UsrSltd ********************************************************************************/
		if(a.getAlrgyIntoleranceClnclStsCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceClnclStsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getClinicalStatus().getCoding().size() < i0+1) { allergyintolerance.getClinicalStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {allergyintolerance.getClinicalStatus().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** AlrgyIntolerance_ClnclSts_Cdg_Vrsn ********************************************************************************/
		if(a.getAlrgyIntoleranceClnclStsCdgVrsn() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceClnclStsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getClinicalStatus().getCoding().size() < i0+1) { allergyintolerance.getClinicalStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {allergyintolerance.getClinicalStatus().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AlrgyIntolerance_ClnclSts_Txt ********************************************************************************/
		if(a.getAlrgyIntoleranceClnclStsTxt() != null ) {

			if(a.getAlrgyIntoleranceClnclStsTxt().replace("[","").replace("]","").equals("NULL") | a.getAlrgyIntoleranceClnclStsTxt()==null) {} else {
			allergyintolerance.getClinicalStatus().setText(a.getAlrgyIntoleranceClnclStsTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** AlrgyIntolerance_Cd_Cdg_Cd ********************************************************************************/
		if(a.getAlrgyIntoleranceCdCdgCd() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getCode().getCoding().size() < i0+1) { allergyintolerance.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {allergyintolerance.getCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AlrgyIntolerance_Cd_Cdg_Dsply ********************************************************************************/
		if(a.getAlrgyIntoleranceCdCdgDsply() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getCode().getCoding().size() < i0+1) { allergyintolerance.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {allergyintolerance.getCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AlrgyIntolerance_Cd_Cdg_Sys ********************************************************************************/
		if(a.getAlrgyIntoleranceCdCdgSys() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getCode().getCoding().size() < i0+1) { allergyintolerance.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {allergyintolerance.getCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AlrgyIntolerance_Cd_Cdg_UsrSltd ********************************************************************************/
		if(a.getAlrgyIntoleranceCdCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getCode().getCoding().size() < i0+1) { allergyintolerance.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {allergyintolerance.getCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** AlrgyIntolerance_Cd_Cdg_Vrsn ********************************************************************************/
		if(a.getAlrgyIntoleranceCdCdgVrsn() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getCode().getCoding().size() < i0+1) { allergyintolerance.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {allergyintolerance.getCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AlrgyIntolerance_Cd_Txt ********************************************************************************/
		if(a.getAlrgyIntoleranceCdTxt() != null ) {

			if(a.getAlrgyIntoleranceCdTxt().replace("[","").replace("]","").equals("NULL") | a.getAlrgyIntoleranceCdTxt()==null) {} else {
			allergyintolerance.getCode().setText(a.getAlrgyIntoleranceCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** AlrgyIntolerance_Criticality ********************************************************************************/
		if(a.getAlrgyIntoleranceCriticality() != null ) {

			if(a.getAlrgyIntoleranceCriticality().replace("[","").replace("]","").equals("NULL") | a.getAlrgyIntoleranceCriticality()==null) {} else {
			allergyintolerance.setCriticality(new org.hl7.fhir.r4.model.AllergyIntolerance.AllergyIntoleranceCriticalityEnumFactory().fromCode(a.getAlrgyIntoleranceCriticality().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AlrgyIntolerance_Enc ********************************************************************************/
		if(a.getAlrgyIntoleranceEnc() != null ) {

			if(a.getAlrgyIntoleranceEnc().replace("[","").replace("]","").equals("NULL") | a.getAlrgyIntoleranceEnc()==null) {} else {
			allergyintolerance.setEncounter(new org.hl7.fhir.r4.model.Reference(a.getAlrgyIntoleranceEnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AlrgyIntolerance_Id_Assigner ********************************************************************************/
		if(a.getAlrgyIntoleranceIdAssigner() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getIdentifier().size() < i0+1) { allergyintolerance.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {allergyintolerance.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** AlrgyIntolerance_Id_Prd_End ********************************************************************************/
		if(a.getAlrgyIntoleranceIdPrdEnd() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getIdentifier().size() < i0+1) { allergyintolerance.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {allergyintolerance.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** AlrgyIntolerance_Id_Prd_Strt ********************************************************************************/
		if(a.getAlrgyIntoleranceIdPrdStrt() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getIdentifier().size() < i0+1) { allergyintolerance.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {allergyintolerance.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** AlrgyIntolerance_Id_Sys ********************************************************************************/
		if(a.getAlrgyIntoleranceIdSys() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getIdentifier().size() < i0+1) { allergyintolerance.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {allergyintolerance.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AlrgyIntolerance_Id_Typ_Cdg_Cd ********************************************************************************/
		if(a.getAlrgyIntoleranceIdTypCdgCd() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getIdentifier().size() < i0+1) { allergyintolerance.addIdentifier(); }
				String[] arrayi1 = a.getAlrgyIntoleranceIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(allergyintolerance.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { allergyintolerance.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {allergyintolerance.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AlrgyIntolerance_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(a.getAlrgyIntoleranceIdTypCdgDsply() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getIdentifier().size() < i0+1) { allergyintolerance.addIdentifier(); }
				String[] arrayi1 = a.getAlrgyIntoleranceIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(allergyintolerance.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { allergyintolerance.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {allergyintolerance.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AlrgyIntolerance_Id_Typ_Cdg_Sys ********************************************************************************/
		if(a.getAlrgyIntoleranceIdTypCdgSys() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getIdentifier().size() < i0+1) { allergyintolerance.addIdentifier(); }
				String[] arrayi1 = a.getAlrgyIntoleranceIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(allergyintolerance.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { allergyintolerance.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {allergyintolerance.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AlrgyIntolerance_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(a.getAlrgyIntoleranceIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getIdentifier().size() < i0+1) { allergyintolerance.addIdentifier(); }
				String[] arrayi1 = a.getAlrgyIntoleranceIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(allergyintolerance.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { allergyintolerance.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {allergyintolerance.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** AlrgyIntolerance_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(a.getAlrgyIntoleranceIdTypCdgVrsn() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getIdentifier().size() < i0+1) { allergyintolerance.addIdentifier(); }
				String[] arrayi1 = a.getAlrgyIntoleranceIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(allergyintolerance.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { allergyintolerance.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {allergyintolerance.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AlrgyIntolerance_Id_Typ_Txt ********************************************************************************/
		if(a.getAlrgyIntoleranceIdTypTxt() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getIdentifier().size() < i0+1) { allergyintolerance.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {allergyintolerance.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AlrgyIntolerance_Id_Use ********************************************************************************/
		if(a.getAlrgyIntoleranceIdUse() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getIdentifier().size() < i0+1) { allergyintolerance.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {allergyintolerance.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** AlrgyIntolerance_Id_Vl ********************************************************************************/
		if(a.getAlrgyIntoleranceIdVl() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getIdentifier().size() < i0+1) { allergyintolerance.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {allergyintolerance.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AlrgyIntolerance_LastOccrnce ********************************************************************************/
		if(a.getAlrgyIntoleranceLastOccrnce() != null ) {

			if(a.getAlrgyIntoleranceLastOccrnce().replace("[","").replace("]","").equals("NULL") | a.getAlrgyIntoleranceLastOccrnce()==null) {} else {
			allergyintolerance.setLastOccurrence(a.getAlrgyIntoleranceLastOccrnce().replace("[","").replace("]","").equals("NULL") | a.getAlrgyIntoleranceLastOccrnce()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(a.getAlrgyIntoleranceLastOccrnce().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AlrgyIntolerance_Nt_AthrRfrnc ********************************************************************************/
		if(a.getAlrgyIntoleranceNtAthrRfrnc() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getNote().size() < i0+1) { allergyintolerance.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {allergyintolerance.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** AlrgyIntolerance_Nt_AthrStrgTyp ********************************************************************************/
		if(a.getAlrgyIntoleranceNtAthrStrgTyp() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getNote().size() < i0+1) { allergyintolerance.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {allergyintolerance.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** AlrgyIntolerance_Nt_Txt ********************************************************************************/
		if(a.getAlrgyIntoleranceNtTxt() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getNote().size() < i0+1) { allergyintolerance.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {allergyintolerance.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AlrgyIntolerance_Nt_Time ********************************************************************************/
		if(a.getAlrgyIntoleranceNtTime() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getNote().size() < i0+1) { allergyintolerance.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {allergyintolerance.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** AlrgyIntolerance_OnAge_Cd ********************************************************************************/
		if(a.getAlrgyIntoleranceOnAgeCd() != null ) {

			if(a.getAlrgyIntoleranceOnAgeCd().replace("[","").replace("]","").equals("NULL") | a.getAlrgyIntoleranceOnAgeCd()==null) {} else {
			allergyintolerance.getOnsetAge().setCode(a.getAlrgyIntoleranceOnAgeCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** AlrgyIntolerance_OnAge_Cmprtr ********************************************************************************/
		if(a.getAlrgyIntoleranceOnAgeCmprtr() != null ) {

			if(a.getAlrgyIntoleranceOnAgeCmprtr().replace("[","").replace("]","").equals("NULL") | a.getAlrgyIntoleranceOnAgeCmprtr()==null) {} else {
			allergyintolerance.getOnsetAge().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(a.getAlrgyIntoleranceOnAgeCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AlrgyIntolerance_OnAge_Sys ********************************************************************************/
		if(a.getAlrgyIntoleranceOnAgeSys() != null ) {

			if(a.getAlrgyIntoleranceOnAgeSys().replace("[","").replace("]","").equals("NULL") | a.getAlrgyIntoleranceOnAgeSys()==null) {} else {
			allergyintolerance.getOnsetAge().setSystem(a.getAlrgyIntoleranceOnAgeSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** AlrgyIntolerance_OnAge_Unt ********************************************************************************/
		if(a.getAlrgyIntoleranceOnAgeUnt() != null ) {

			if(a.getAlrgyIntoleranceOnAgeUnt().replace("[","").replace("]","").equals("NULL") | a.getAlrgyIntoleranceOnAgeUnt()==null) {} else {
			allergyintolerance.getOnsetAge().setUnit(a.getAlrgyIntoleranceOnAgeUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** AlrgyIntolerance_OnAge_Vl ********************************************************************************/
		if(a.getAlrgyIntoleranceOnAgeVl() != null ) {

			if(a.getAlrgyIntoleranceOnAgeVl().replace("[","").replace("]","").equals("NULL") | a.getAlrgyIntoleranceOnAgeVl()==null) {} else {
			allergyintolerance.getOnsetAge().setValue((new java.math.BigDecimal((a.getAlrgyIntoleranceOnAgeVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** AlrgyIntolerance_OnDtTimeTyp ********************************************************************************/
		if(a.getAlrgyIntoleranceOnDtTimeTyp() != null ) {

			if(a.getAlrgyIntoleranceOnDtTimeTyp().replace("[","").replace("]","").equals("NULL") | a.getAlrgyIntoleranceOnDtTimeTyp()==null) {} else {
			allergyintolerance.setOnset( new org.hl7.fhir.r4.model.DateTimeType(a.getAlrgyIntoleranceOnDtTimeTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AlrgyIntolerance_OnPrd_End ********************************************************************************/
		if(a.getAlrgyIntoleranceOnPrdEnd() != null ) {

			if(a.getAlrgyIntoleranceOnPrdEnd().replace("[","").replace("]","").equals("NULL") | a.getAlrgyIntoleranceOnPrdEnd()==null) {} else {
			allergyintolerance.getOnsetPeriod().setEnd(a.getAlrgyIntoleranceOnPrdEnd().replace("[","").replace("]","").equals("NULL") | a.getAlrgyIntoleranceOnPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(a.getAlrgyIntoleranceOnPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AlrgyIntolerance_OnPrd_Strt ********************************************************************************/
		if(a.getAlrgyIntoleranceOnPrdStrt() != null ) {

			if(a.getAlrgyIntoleranceOnPrdStrt().replace("[","").replace("]","").equals("NULL") | a.getAlrgyIntoleranceOnPrdStrt()==null) {} else {
			allergyintolerance.getOnsetPeriod().setStart(a.getAlrgyIntoleranceOnPrdStrt().replace("[","").replace("]","").equals("NULL") | a.getAlrgyIntoleranceOnPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(a.getAlrgyIntoleranceOnPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AlrgyIntolerance_OnRng_Hi_Cd ********************************************************************************/
		if(a.getAlrgyIntoleranceOnRngHiCd() != null ) {

			if(a.getAlrgyIntoleranceOnRngHiCd().replace("[","").replace("]","").equals("NULL") | a.getAlrgyIntoleranceOnRngHiCd()==null) {} else {
			allergyintolerance.getOnsetRange().getHigh().setCode(a.getAlrgyIntoleranceOnRngHiCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** AlrgyIntolerance_OnRng_Hi_Cmprtr ********************************************************************************/
		if(a.getAlrgyIntoleranceOnRngHiCmprtr() != null ) {

			if(a.getAlrgyIntoleranceOnRngHiCmprtr().replace("[","").replace("]","").equals("NULL") | a.getAlrgyIntoleranceOnRngHiCmprtr()==null) {} else {
			allergyintolerance.getOnsetRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(a.getAlrgyIntoleranceOnRngHiCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AlrgyIntolerance_OnRng_Hi_Sys ********************************************************************************/
		if(a.getAlrgyIntoleranceOnRngHiSys() != null ) {

			if(a.getAlrgyIntoleranceOnRngHiSys().replace("[","").replace("]","").equals("NULL") | a.getAlrgyIntoleranceOnRngHiSys()==null) {} else {
			allergyintolerance.getOnsetRange().getHigh().setSystem(a.getAlrgyIntoleranceOnRngHiSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** AlrgyIntolerance_OnRng_Hi_Unt ********************************************************************************/
		if(a.getAlrgyIntoleranceOnRngHiUnt() != null ) {

			if(a.getAlrgyIntoleranceOnRngHiUnt().replace("[","").replace("]","").equals("NULL") | a.getAlrgyIntoleranceOnRngHiUnt()==null) {} else {
			allergyintolerance.getOnsetRange().getHigh().setUnit(a.getAlrgyIntoleranceOnRngHiUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** AlrgyIntolerance_OnRng_Hi_Vl ********************************************************************************/
		if(a.getAlrgyIntoleranceOnRngHiVl() != null ) {

			if(a.getAlrgyIntoleranceOnRngHiVl().replace("[","").replace("]","").equals("NULL") | a.getAlrgyIntoleranceOnRngHiVl()==null) {} else {
			allergyintolerance.getOnsetRange().getHigh().setValue((new java.math.BigDecimal((a.getAlrgyIntoleranceOnRngHiVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** AlrgyIntolerance_OnRng_Lw_Cd ********************************************************************************/
		if(a.getAlrgyIntoleranceOnRngLwCd() != null ) {

			if(a.getAlrgyIntoleranceOnRngLwCd().replace("[","").replace("]","").equals("NULL") | a.getAlrgyIntoleranceOnRngLwCd()==null) {} else {
			allergyintolerance.getOnsetRange().getLow().setCode(a.getAlrgyIntoleranceOnRngLwCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** AlrgyIntolerance_OnRng_Lw_Cmprtr ********************************************************************************/
		if(a.getAlrgyIntoleranceOnRngLwCmprtr() != null ) {

			if(a.getAlrgyIntoleranceOnRngLwCmprtr().replace("[","").replace("]","").equals("NULL") | a.getAlrgyIntoleranceOnRngLwCmprtr()==null) {} else {
			allergyintolerance.getOnsetRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(a.getAlrgyIntoleranceOnRngLwCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AlrgyIntolerance_OnRng_Lw_Sys ********************************************************************************/
		if(a.getAlrgyIntoleranceOnRngLwSys() != null ) {

			if(a.getAlrgyIntoleranceOnRngLwSys().replace("[","").replace("]","").equals("NULL") | a.getAlrgyIntoleranceOnRngLwSys()==null) {} else {
			allergyintolerance.getOnsetRange().getLow().setSystem(a.getAlrgyIntoleranceOnRngLwSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** AlrgyIntolerance_OnRng_Lw_Unt ********************************************************************************/
		if(a.getAlrgyIntoleranceOnRngLwUnt() != null ) {

			if(a.getAlrgyIntoleranceOnRngLwUnt().replace("[","").replace("]","").equals("NULL") | a.getAlrgyIntoleranceOnRngLwUnt()==null) {} else {
			allergyintolerance.getOnsetRange().getLow().setUnit(a.getAlrgyIntoleranceOnRngLwUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** AlrgyIntolerance_OnRng_Lw_Vl ********************************************************************************/
		if(a.getAlrgyIntoleranceOnRngLwVl() != null ) {

			if(a.getAlrgyIntoleranceOnRngLwVl().replace("[","").replace("]","").equals("NULL") | a.getAlrgyIntoleranceOnRngLwVl()==null) {} else {
			allergyintolerance.getOnsetRange().getLow().setValue((new java.math.BigDecimal((a.getAlrgyIntoleranceOnRngLwVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** AlrgyIntolerance_OnStrgTyp ********************************************************************************/
		if(a.getAlrgyIntoleranceOnStrgTyp() != null ) {

			if(a.getAlrgyIntoleranceOnStrgTyp().replace("[","").replace("]","").equals("NULL") | a.getAlrgyIntoleranceOnStrgTyp()==null) {} else {
			allergyintolerance.setOnset(new org.hl7.fhir.r4.model.StringType(a.getAlrgyIntoleranceOnStrgTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AlrgyIntolerance_Pnt ********************************************************************************/
		if(a.getAlrgyIntolerancePnt() != null ) {

			if(a.getAlrgyIntolerancePnt().replace("[","").replace("]","").equals("NULL") | a.getAlrgyIntolerancePnt()==null) {} else {
			allergyintolerance.setPatient(new org.hl7.fhir.r4.model.Reference(a.getAlrgyIntolerancePnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AlrgyIntolerance_Reaction_Dscrptn ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionDscrptn() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceReactionDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getReaction().size() < i0+1) { allergyintolerance.addReaction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {allergyintolerance.getReaction().get(i0).setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AlrgyIntolerance_Reaction_ExposureRoute_Cdg_Cd ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionExposureRouteCdgCd() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceReactionExposureRouteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getReaction().size() < i0+1) { allergyintolerance.addReaction(); }
				String[] arrayi1 = a.getAlrgyIntoleranceReactionExposureRouteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(allergyintolerance.getReaction().get(i0).getExposureRoute().getCoding().size() < i1+1) { allergyintolerance.getReaction().get(i0).getExposureRoute().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {allergyintolerance.getReaction().get(i0).getExposureRoute().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AlrgyIntolerance_Reaction_ExposureRoute_Cdg_Dsply ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionExposureRouteCdgDsply() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceReactionExposureRouteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getReaction().size() < i0+1) { allergyintolerance.addReaction(); }
				String[] arrayi1 = a.getAlrgyIntoleranceReactionExposureRouteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(allergyintolerance.getReaction().get(i0).getExposureRoute().getCoding().size() < i1+1) { allergyintolerance.getReaction().get(i0).getExposureRoute().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {allergyintolerance.getReaction().get(i0).getExposureRoute().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AlrgyIntolerance_Reaction_ExposureRoute_Cdg_Sys ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionExposureRouteCdgSys() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceReactionExposureRouteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getReaction().size() < i0+1) { allergyintolerance.addReaction(); }
				String[] arrayi1 = a.getAlrgyIntoleranceReactionExposureRouteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(allergyintolerance.getReaction().get(i0).getExposureRoute().getCoding().size() < i1+1) { allergyintolerance.getReaction().get(i0).getExposureRoute().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {allergyintolerance.getReaction().get(i0).getExposureRoute().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AlrgyIntolerance_Reaction_ExposureRoute_Cdg_UsrSltd ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionExposureRouteCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceReactionExposureRouteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getReaction().size() < i0+1) { allergyintolerance.addReaction(); }
				String[] arrayi1 = a.getAlrgyIntoleranceReactionExposureRouteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(allergyintolerance.getReaction().get(i0).getExposureRoute().getCoding().size() < i1+1) { allergyintolerance.getReaction().get(i0).getExposureRoute().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {allergyintolerance.getReaction().get(i0).getExposureRoute().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** AlrgyIntolerance_Reaction_ExposureRoute_Cdg_Vrsn ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionExposureRouteCdgVrsn() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceReactionExposureRouteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getReaction().size() < i0+1) { allergyintolerance.addReaction(); }
				String[] arrayi1 = a.getAlrgyIntoleranceReactionExposureRouteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(allergyintolerance.getReaction().get(i0).getExposureRoute().getCoding().size() < i1+1) { allergyintolerance.getReaction().get(i0).getExposureRoute().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {allergyintolerance.getReaction().get(i0).getExposureRoute().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AlrgyIntolerance_Reaction_ExposureRoute_Txt ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionExposureRouteTxt() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceReactionExposureRouteTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getReaction().size() < i0+1) { allergyintolerance.addReaction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {allergyintolerance.getReaction().get(i0).getExposureRoute().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AlrgyIntolerance_Reaction_Manifestation_Cdg_Cd ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionManifestationCdgCd() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceReactionManifestationCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getReaction().size() < i0+1) { allergyintolerance.addReaction(); }
				String[] arrayi1 = a.getAlrgyIntoleranceReactionManifestationCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(allergyintolerance.getReaction().get(i0).getManifestation().size() < i1+1) { allergyintolerance.getReaction().get(i0).addManifestation(); }
					String[] arrayi2 = a.getAlrgyIntoleranceReactionManifestationCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(allergyintolerance.getReaction().get(i0).getManifestation().get(i1).getCoding().size() < i2+1) { allergyintolerance.getReaction().get(i0).getManifestation().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {allergyintolerance.getReaction().get(i0).getManifestation().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** AlrgyIntolerance_Reaction_Manifestation_Cdg_Dsply ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionManifestationCdgDsply() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceReactionManifestationCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getReaction().size() < i0+1) { allergyintolerance.addReaction(); }
				String[] arrayi1 = a.getAlrgyIntoleranceReactionManifestationCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(allergyintolerance.getReaction().get(i0).getManifestation().size() < i1+1) { allergyintolerance.getReaction().get(i0).addManifestation(); }
					String[] arrayi2 = a.getAlrgyIntoleranceReactionManifestationCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(allergyintolerance.getReaction().get(i0).getManifestation().get(i1).getCoding().size() < i2+1) { allergyintolerance.getReaction().get(i0).getManifestation().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {allergyintolerance.getReaction().get(i0).getManifestation().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** AlrgyIntolerance_Reaction_Manifestation_Cdg_Sys ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionManifestationCdgSys() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceReactionManifestationCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getReaction().size() < i0+1) { allergyintolerance.addReaction(); }
				String[] arrayi1 = a.getAlrgyIntoleranceReactionManifestationCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(allergyintolerance.getReaction().get(i0).getManifestation().size() < i1+1) { allergyintolerance.getReaction().get(i0).addManifestation(); }
					String[] arrayi2 = a.getAlrgyIntoleranceReactionManifestationCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(allergyintolerance.getReaction().get(i0).getManifestation().get(i1).getCoding().size() < i2+1) { allergyintolerance.getReaction().get(i0).getManifestation().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {allergyintolerance.getReaction().get(i0).getManifestation().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** AlrgyIntolerance_Reaction_Manifestation_Cdg_UsrSltd ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionManifestationCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceReactionManifestationCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getReaction().size() < i0+1) { allergyintolerance.addReaction(); }
				String[] arrayi1 = a.getAlrgyIntoleranceReactionManifestationCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(allergyintolerance.getReaction().get(i0).getManifestation().size() < i1+1) { allergyintolerance.getReaction().get(i0).addManifestation(); }
					String[] arrayi2 = a.getAlrgyIntoleranceReactionManifestationCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(allergyintolerance.getReaction().get(i0).getManifestation().get(i1).getCoding().size() < i2+1) { allergyintolerance.getReaction().get(i0).getManifestation().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {allergyintolerance.getReaction().get(i0).getManifestation().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** AlrgyIntolerance_Reaction_Manifestation_Cdg_Vrsn ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionManifestationCdgVrsn() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceReactionManifestationCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getReaction().size() < i0+1) { allergyintolerance.addReaction(); }
				String[] arrayi1 = a.getAlrgyIntoleranceReactionManifestationCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(allergyintolerance.getReaction().get(i0).getManifestation().size() < i1+1) { allergyintolerance.getReaction().get(i0).addManifestation(); }
					String[] arrayi2 = a.getAlrgyIntoleranceReactionManifestationCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(allergyintolerance.getReaction().get(i0).getManifestation().get(i1).getCoding().size() < i2+1) { allergyintolerance.getReaction().get(i0).getManifestation().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {allergyintolerance.getReaction().get(i0).getManifestation().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** AlrgyIntolerance_Reaction_Manifestation_Txt ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionManifestationTxt() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceReactionManifestationTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getReaction().size() < i0+1) { allergyintolerance.addReaction(); }
				String[] arrayi1 = a.getAlrgyIntoleranceReactionManifestationTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(allergyintolerance.getReaction().get(i0).getManifestation().size() < i1+1) { allergyintolerance.getReaction().get(i0).addManifestation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {allergyintolerance.getReaction().get(i0).getManifestation().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AlrgyIntolerance_Reaction_Nt_AthrRfrnc ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionNtAthrRfrnc() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceReactionNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getReaction().size() < i0+1) { allergyintolerance.addReaction(); }
				String[] arrayi1 = a.getAlrgyIntoleranceReactionNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(allergyintolerance.getReaction().get(i0).getNote().size() < i1+1) { allergyintolerance.getReaction().get(i0).addNote(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {allergyintolerance.getReaction().get(i0).getNote().get(i1).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** AlrgyIntolerance_Reaction_Nt_AthrStrgTyp ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionNtAthrStrgTyp() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceReactionNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getReaction().size() < i0+1) { allergyintolerance.addReaction(); }
				String[] arrayi1 = a.getAlrgyIntoleranceReactionNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(allergyintolerance.getReaction().get(i0).getNote().size() < i1+1) { allergyintolerance.getReaction().get(i0).addNote(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {allergyintolerance.getReaction().get(i0).getNote().get(i1).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** AlrgyIntolerance_Reaction_Nt_Txt ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionNtTxt() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceReactionNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getReaction().size() < i0+1) { allergyintolerance.addReaction(); }
				String[] arrayi1 = a.getAlrgyIntoleranceReactionNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(allergyintolerance.getReaction().get(i0).getNote().size() < i1+1) { allergyintolerance.getReaction().get(i0).addNote(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {allergyintolerance.getReaction().get(i0).getNote().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AlrgyIntolerance_Reaction_Nt_Time ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionNtTime() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceReactionNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getReaction().size() < i0+1) { allergyintolerance.addReaction(); }
				String[] arrayi1 = a.getAlrgyIntoleranceReactionNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(allergyintolerance.getReaction().get(i0).getNote().size() < i1+1) { allergyintolerance.getReaction().get(i0).addNote(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {allergyintolerance.getReaction().get(i0).getNote().get(i1).setTime(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** AlrgyIntolerance_Reaction_Onset ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionOn() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceReactionOn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getReaction().size() < i0+1) { allergyintolerance.addReaction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {allergyintolerance.getReaction().get(i0).setOnset(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** AlrgyIntolerance_Reaction_Severity ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionSeverity() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceReactionSeverity().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getReaction().size() < i0+1) { allergyintolerance.addReaction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {allergyintolerance.getReaction().get(i0).setSeverity(new org.hl7.fhir.r4.model.AllergyIntolerance.AllergyIntoleranceSeverityEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** AlrgyIntolerance_Reaction_Sbstnc_Cdg_Cd ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionSbstncCdgCd() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceReactionSbstncCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getReaction().size() < i0+1) { allergyintolerance.addReaction(); }
				String[] arrayi1 = a.getAlrgyIntoleranceReactionSbstncCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(allergyintolerance.getReaction().get(i0).getSubstance().getCoding().size() < i1+1) { allergyintolerance.getReaction().get(i0).getSubstance().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {allergyintolerance.getReaction().get(i0).getSubstance().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AlrgyIntolerance_Reaction_Sbstnc_Cdg_Dsply ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionSbstncCdgDsply() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceReactionSbstncCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getReaction().size() < i0+1) { allergyintolerance.addReaction(); }
				String[] arrayi1 = a.getAlrgyIntoleranceReactionSbstncCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(allergyintolerance.getReaction().get(i0).getSubstance().getCoding().size() < i1+1) { allergyintolerance.getReaction().get(i0).getSubstance().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {allergyintolerance.getReaction().get(i0).getSubstance().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AlrgyIntolerance_Reaction_Sbstnc_Cdg_Sys ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionSbstncCdgSys() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceReactionSbstncCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getReaction().size() < i0+1) { allergyintolerance.addReaction(); }
				String[] arrayi1 = a.getAlrgyIntoleranceReactionSbstncCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(allergyintolerance.getReaction().get(i0).getSubstance().getCoding().size() < i1+1) { allergyintolerance.getReaction().get(i0).getSubstance().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {allergyintolerance.getReaction().get(i0).getSubstance().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AlrgyIntolerance_Reaction_Sbstnc_Cdg_UsrSltd ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionSbstncCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceReactionSbstncCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getReaction().size() < i0+1) { allergyintolerance.addReaction(); }
				String[] arrayi1 = a.getAlrgyIntoleranceReactionSbstncCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(allergyintolerance.getReaction().get(i0).getSubstance().getCoding().size() < i1+1) { allergyintolerance.getReaction().get(i0).getSubstance().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {allergyintolerance.getReaction().get(i0).getSubstance().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** AlrgyIntolerance_Reaction_Sbstnc_Cdg_Vrsn ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionSbstncCdgVrsn() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceReactionSbstncCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getReaction().size() < i0+1) { allergyintolerance.addReaction(); }
				String[] arrayi1 = a.getAlrgyIntoleranceReactionSbstncCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(allergyintolerance.getReaction().get(i0).getSubstance().getCoding().size() < i1+1) { allergyintolerance.getReaction().get(i0).getSubstance().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {allergyintolerance.getReaction().get(i0).getSubstance().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AlrgyIntolerance_Reaction_Sbstnc_Txt ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionSbstncTxt() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceReactionSbstncTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getReaction().size() < i0+1) { allergyintolerance.addReaction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {allergyintolerance.getReaction().get(i0).getSubstance().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AlrgyIntolerance_RecordedDt ********************************************************************************/
		if(a.getAlrgyIntoleranceRecordedDt() != null ) {

			if(a.getAlrgyIntoleranceRecordedDt().replace("[","").replace("]","").equals("NULL") | a.getAlrgyIntoleranceRecordedDt()==null) {} else {
			allergyintolerance.setRecordedDate(a.getAlrgyIntoleranceRecordedDt().replace("[","").replace("]","").equals("NULL") | a.getAlrgyIntoleranceRecordedDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(a.getAlrgyIntoleranceRecordedDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AlrgyIntolerance_Recorder ********************************************************************************/
		if(a.getAlrgyIntoleranceRecorder() != null ) {

			if(a.getAlrgyIntoleranceRecorder().replace("[","").replace("]","").equals("NULL") | a.getAlrgyIntoleranceRecorder()==null) {} else {
			allergyintolerance.setRecorder(new org.hl7.fhir.r4.model.Reference(a.getAlrgyIntoleranceRecorder().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AlrgyIntolerance_Typ ********************************************************************************/
		if(a.getAlrgyIntoleranceTyp() != null ) {

			if(a.getAlrgyIntoleranceTyp().replace("[","").replace("]","").equals("NULL") | a.getAlrgyIntoleranceTyp()==null) {} else {
			allergyintolerance.setType(new org.hl7.fhir.r4.model.AllergyIntolerance.AllergyIntoleranceTypeEnumFactory().fromCode(a.getAlrgyIntoleranceTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AlrgyIntolerance_VrfctnSts_Cdg_Cd ********************************************************************************/
		if(a.getAlrgyIntoleranceVrfctnStsCdgCd() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceVrfctnStsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getVerificationStatus().getCoding().size() < i0+1) { allergyintolerance.getVerificationStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {allergyintolerance.getVerificationStatus().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AlrgyIntolerance_VrfctnSts_Cdg_Dsply ********************************************************************************/
		if(a.getAlrgyIntoleranceVrfctnStsCdgDsply() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceVrfctnStsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getVerificationStatus().getCoding().size() < i0+1) { allergyintolerance.getVerificationStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {allergyintolerance.getVerificationStatus().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AlrgyIntolerance_VrfctnSts_Cdg_Sys ********************************************************************************/
		if(a.getAlrgyIntoleranceVrfctnStsCdgSys() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceVrfctnStsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getVerificationStatus().getCoding().size() < i0+1) { allergyintolerance.getVerificationStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {allergyintolerance.getVerificationStatus().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AlrgyIntolerance_VrfctnSts_Cdg_UsrSltd ********************************************************************************/
		if(a.getAlrgyIntoleranceVrfctnStsCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceVrfctnStsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getVerificationStatus().getCoding().size() < i0+1) { allergyintolerance.getVerificationStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {allergyintolerance.getVerificationStatus().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** AlrgyIntolerance_VrfctnSts_Cdg_Vrsn ********************************************************************************/
		if(a.getAlrgyIntoleranceVrfctnStsCdgVrsn() != null ) {

			String[] arrayi0 = a.getAlrgyIntoleranceVrfctnStsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(allergyintolerance.getVerificationStatus().getCoding().size() < i0+1) { allergyintolerance.getVerificationStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {allergyintolerance.getVerificationStatus().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AlrgyIntolerance_VrfctnSts_Txt ********************************************************************************/
		if(a.getAlrgyIntoleranceVrfctnStsTxt() != null ) {

			if(a.getAlrgyIntoleranceVrfctnStsTxt().replace("[","").replace("]","").equals("NULL") | a.getAlrgyIntoleranceVrfctnStsTxt()==null) {} else {
			allergyintolerance.getVerificationStatus().setText(a.getAlrgyIntoleranceVrfctnStsTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return allergyintolerance;
	}
}
