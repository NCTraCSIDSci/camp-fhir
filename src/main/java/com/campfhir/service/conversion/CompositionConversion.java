package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Composition;
public class CompositionConversion 
{
	public org.hl7.fhir.r4.model.Composition Compositions(Composition c) throws ParseException
	{
		org.hl7.fhir.r4.model.Composition composition = new org.hl7.fhir.r4.model.Composition();

		/******************** id ********************************************************************************/
		composition.setId(c.getId());

		/******************** Cmpsition_Attester_Mode ********************************************************************************/
		if(c.getCmpsitionAttesterMode() != null ) {

			String[] arrayi0 = c.getCmpsitionAttesterMode().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getAttester().size() < i0+1) { composition.addAttester(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {composition.getAttester().get(i0).setMode(new org.hl7.fhir.r4.model.Composition.CompositionAttestationModeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cmpsition_Attester_Party ********************************************************************************/
		if(c.getCmpsitionAttesterParty() != null ) {

			String[] arrayi0 = c.getCmpsitionAttesterParty().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getAttester().size() < i0+1) { composition.addAttester(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {composition.getAttester().get(i0).setParty(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cmpsition_Attester_Time ********************************************************************************/
		if(c.getCmpsitionAttesterTime() != null ) {

			String[] arrayi0 = c.getCmpsitionAttesterTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getAttester().size() < i0+1) { composition.addAttester(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {composition.getAttester().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cmpsition_Athr ********************************************************************************/
		if(c.getCmpsitionAthr() != null ) {

				for( String currListStrSplit : c.getCmpsitionAthr().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			composition.addAuthor(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Cmpsition_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getCmpsitionCtgryCdgCd() != null ) {

			String[] arrayi0 = c.getCmpsitionCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getCategory().size() < i0+1) { composition.addCategory(); }
				String[] arrayi1 = c.getCmpsitionCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(composition.getCategory().get(i0).getCoding().size() < i1+1) { composition.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {composition.getCategory().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmpsition_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getCmpsitionCtgryCdgDsply() != null ) {

			String[] arrayi0 = c.getCmpsitionCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getCategory().size() < i0+1) { composition.addCategory(); }
				String[] arrayi1 = c.getCmpsitionCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(composition.getCategory().get(i0).getCoding().size() < i1+1) { composition.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {composition.getCategory().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmpsition_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getCmpsitionCtgryCdgSys() != null ) {

			String[] arrayi0 = c.getCmpsitionCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getCategory().size() < i0+1) { composition.addCategory(); }
				String[] arrayi1 = c.getCmpsitionCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(composition.getCategory().get(i0).getCoding().size() < i1+1) { composition.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {composition.getCategory().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmpsition_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmpsitionCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCmpsitionCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getCategory().size() < i0+1) { composition.addCategory(); }
				String[] arrayi1 = c.getCmpsitionCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(composition.getCategory().get(i0).getCoding().size() < i1+1) { composition.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {composition.getCategory().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cmpsition_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getCmpsitionCtgryCdgVrsn() != null ) {

			String[] arrayi0 = c.getCmpsitionCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getCategory().size() < i0+1) { composition.addCategory(); }
				String[] arrayi1 = c.getCmpsitionCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(composition.getCategory().get(i0).getCoding().size() < i1+1) { composition.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {composition.getCategory().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmpsition_Ctgry_Txt ********************************************************************************/
		if(c.getCmpsitionCtgryTxt() != null ) {

			String[] arrayi0 = c.getCmpsitionCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getCategory().size() < i0+1) { composition.addCategory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {composition.getCategory().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cmpsition_Confidentiality ********************************************************************************/
		if(c.getCmpsitionConfidentiality() != null ) {

			if(c.getCmpsitionConfidentiality().replace("[","").replace("]","").equals("NULL") | c.getCmpsitionConfidentiality()==null) {} else {
			composition.setConfidentiality(new org.hl7.fhir.r4.model.Composition.DocumentConfidentialityEnumFactory().fromCode(c.getCmpsitionConfidentiality().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cmpsition_Custodian ********************************************************************************/
		if(c.getCmpsitionCustodian() != null ) {

			if(c.getCmpsitionCustodian().replace("[","").replace("]","").equals("NULL") | c.getCmpsitionCustodian()==null) {} else {
			composition.setCustodian(new org.hl7.fhir.r4.model.Reference(c.getCmpsitionCustodian().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cmpsition_Dt ********************************************************************************/
		if(c.getCmpsitionDt() != null ) {

			if(c.getCmpsitionDt().replace("[","").replace("]","").equals("NULL") | c.getCmpsitionDt()==null) {} else {
			composition.setDate(c.getCmpsitionDt().replace("[","").replace("]","").equals("NULL") | c.getCmpsitionDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCmpsitionDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cmpsition_Enc ********************************************************************************/
		if(c.getCmpsitionEnc() != null ) {

			if(c.getCmpsitionEnc().replace("[","").replace("]","").equals("NULL") | c.getCmpsitionEnc()==null) {} else {
			composition.setEncounter(new org.hl7.fhir.r4.model.Reference(c.getCmpsitionEnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cmpsition_Evnt_Cd_Cdg_Cd ********************************************************************************/
		if(c.getCmpsitionEvntCdCdgCd() != null ) {

			String[] arrayi0 = c.getCmpsitionEvntCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getEvent().size() < i0+1) { composition.addEvent(); }
				String[] arrayi1 = c.getCmpsitionEvntCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(composition.getEvent().get(i0).getCode().size() < i1+1) { composition.getEvent().get(i0).addCode(); }
					String[] arrayi2 = c.getCmpsitionEvntCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(composition.getEvent().get(i0).getCode().get(i1).getCoding().size() < i2+1) { composition.getEvent().get(i0).getCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {composition.getEvent().get(i0).getCode().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cmpsition_Evnt_Cd_Cdg_Dsply ********************************************************************************/
		if(c.getCmpsitionEvntCdCdgDsply() != null ) {

			String[] arrayi0 = c.getCmpsitionEvntCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getEvent().size() < i0+1) { composition.addEvent(); }
				String[] arrayi1 = c.getCmpsitionEvntCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(composition.getEvent().get(i0).getCode().size() < i1+1) { composition.getEvent().get(i0).addCode(); }
					String[] arrayi2 = c.getCmpsitionEvntCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(composition.getEvent().get(i0).getCode().get(i1).getCoding().size() < i2+1) { composition.getEvent().get(i0).getCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {composition.getEvent().get(i0).getCode().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cmpsition_Evnt_Cd_Cdg_Sys ********************************************************************************/
		if(c.getCmpsitionEvntCdCdgSys() != null ) {

			String[] arrayi0 = c.getCmpsitionEvntCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getEvent().size() < i0+1) { composition.addEvent(); }
				String[] arrayi1 = c.getCmpsitionEvntCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(composition.getEvent().get(i0).getCode().size() < i1+1) { composition.getEvent().get(i0).addCode(); }
					String[] arrayi2 = c.getCmpsitionEvntCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(composition.getEvent().get(i0).getCode().get(i1).getCoding().size() < i2+1) { composition.getEvent().get(i0).getCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {composition.getEvent().get(i0).getCode().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cmpsition_Evnt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmpsitionEvntCdCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCmpsitionEvntCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getEvent().size() < i0+1) { composition.addEvent(); }
				String[] arrayi1 = c.getCmpsitionEvntCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(composition.getEvent().get(i0).getCode().size() < i1+1) { composition.getEvent().get(i0).addCode(); }
					String[] arrayi2 = c.getCmpsitionEvntCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(composition.getEvent().get(i0).getCode().get(i1).getCoding().size() < i2+1) { composition.getEvent().get(i0).getCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {composition.getEvent().get(i0).getCode().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cmpsition_Evnt_Cd_Cdg_Vrsn ********************************************************************************/
		if(c.getCmpsitionEvntCdCdgVrsn() != null ) {

			String[] arrayi0 = c.getCmpsitionEvntCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getEvent().size() < i0+1) { composition.addEvent(); }
				String[] arrayi1 = c.getCmpsitionEvntCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(composition.getEvent().get(i0).getCode().size() < i1+1) { composition.getEvent().get(i0).addCode(); }
					String[] arrayi2 = c.getCmpsitionEvntCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(composition.getEvent().get(i0).getCode().get(i1).getCoding().size() < i2+1) { composition.getEvent().get(i0).getCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {composition.getEvent().get(i0).getCode().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cmpsition_Evnt_Cd_Txt ********************************************************************************/
		if(c.getCmpsitionEvntCdTxt() != null ) {

			String[] arrayi0 = c.getCmpsitionEvntCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getEvent().size() < i0+1) { composition.addEvent(); }
				String[] arrayi1 = c.getCmpsitionEvntCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(composition.getEvent().get(i0).getCode().size() < i1+1) { composition.getEvent().get(i0).addCode(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {composition.getEvent().get(i0).getCode().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmpsition_Evnt_Dtl ********************************************************************************/
		if(c.getCmpsitionEvntDtl() != null ) {

			String[] arrayi0 = c.getCmpsitionEvntDtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getEvent().size() < i0+1) { composition.addEvent(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {composition.getEvent().get(i0).addDetail(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cmpsition_Evnt_Prd_End ********************************************************************************/
		if(c.getCmpsitionEvntPrdEnd() != null ) {

			String[] arrayi0 = c.getCmpsitionEvntPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getEvent().size() < i0+1) { composition.addEvent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {composition.getEvent().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cmpsition_Evnt_Prd_Strt ********************************************************************************/
		if(c.getCmpsitionEvntPrdStrt() != null ) {

			String[] arrayi0 = c.getCmpsitionEvntPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getEvent().size() < i0+1) { composition.addEvent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {composition.getEvent().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cmpsition_Id_Assigner ********************************************************************************/
		if(c.getCmpsitionIdAssigner() != null ) {

			if(c.getCmpsitionIdAssigner().replace("[","").replace("]","").equals("NULL") | c.getCmpsitionIdAssigner()==null) {} else {
			composition.getIdentifier().setAssigner(new org.hl7.fhir.r4.model.Reference(c.getCmpsitionIdAssigner().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cmpsition_Id_Prd_End ********************************************************************************/
		if(c.getCmpsitionIdPrdEnd() != null ) {

			if(c.getCmpsitionIdPrdEnd().replace("[","").replace("]","").equals("NULL") | c.getCmpsitionIdPrdEnd()==null) {} else {
			composition.getIdentifier().getPeriod().setEnd(c.getCmpsitionIdPrdEnd().replace("[","").replace("]","").equals("NULL") | c.getCmpsitionIdPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCmpsitionIdPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cmpsition_Id_Prd_Strt ********************************************************************************/
		if(c.getCmpsitionIdPrdStrt() != null ) {

			if(c.getCmpsitionIdPrdStrt().replace("[","").replace("]","").equals("NULL") | c.getCmpsitionIdPrdStrt()==null) {} else {
			composition.getIdentifier().getPeriod().setStart(c.getCmpsitionIdPrdStrt().replace("[","").replace("]","").equals("NULL") | c.getCmpsitionIdPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCmpsitionIdPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cmpsition_Id_Sys ********************************************************************************/
		if(c.getCmpsitionIdSys() != null ) {

			if(c.getCmpsitionIdSys().replace("[","").replace("]","").equals("NULL") | c.getCmpsitionIdSys()==null) {} else {
			composition.getIdentifier().setSystem(c.getCmpsitionIdSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cmpsition_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCmpsitionIdTypCdgCd() != null ) {

			String[] arrayi0 = c.getCmpsitionIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getIdentifier().getType().getCoding().size() < i0+1) { composition.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {composition.getIdentifier().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cmpsition_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCmpsitionIdTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCmpsitionIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getIdentifier().getType().getCoding().size() < i0+1) { composition.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {composition.getIdentifier().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cmpsition_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCmpsitionIdTypCdgSys() != null ) {

			String[] arrayi0 = c.getCmpsitionIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getIdentifier().getType().getCoding().size() < i0+1) { composition.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {composition.getIdentifier().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cmpsition_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmpsitionIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCmpsitionIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getIdentifier().getType().getCoding().size() < i0+1) { composition.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {composition.getIdentifier().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cmpsition_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCmpsitionIdTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCmpsitionIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getIdentifier().getType().getCoding().size() < i0+1) { composition.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {composition.getIdentifier().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cmpsition_Id_Typ_Txt ********************************************************************************/
		if(c.getCmpsitionIdTypTxt() != null ) {

			if(c.getCmpsitionIdTypTxt().replace("[","").replace("]","").equals("NULL") | c.getCmpsitionIdTypTxt()==null) {} else {
			composition.getIdentifier().getType().setText(c.getCmpsitionIdTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cmpsition_Id_Use ********************************************************************************/
		if(c.getCmpsitionIdUse() != null ) {

			if(c.getCmpsitionIdUse().replace("[","").replace("]","").equals("NULL") | c.getCmpsitionIdUse()==null) {} else {
			composition.getIdentifier().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(c.getCmpsitionIdUse().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cmpsition_Id_Vl ********************************************************************************/
		if(c.getCmpsitionIdVl() != null ) {

			if(c.getCmpsitionIdVl().replace("[","").replace("]","").equals("NULL") | c.getCmpsitionIdVl()==null) {} else {
			composition.getIdentifier().setValue(c.getCmpsitionIdVl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cmpsition_RelatesTo_Cd ********************************************************************************/
		if(c.getCmpsitionRelatesToCd() != null ) {

			String[] arrayi0 = c.getCmpsitionRelatesToCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getRelatesTo().size() < i0+1) { composition.addRelatesTo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {composition.getRelatesTo().get(i0).setCode(new org.hl7.fhir.r4.model.Composition.DocumentRelationshipTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cmpsition_RelatesTo_TargetId_Assigner ********************************************************************************/
		if(c.getCmpsitionRelatesToTargetIdAssigner() != null ) {

			String[] arrayi0 = c.getCmpsitionRelatesToTargetIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getRelatesTo().size() < i0+1) { composition.addRelatesTo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {composition.getRelatesTo().get(i0).getTargetIdentifier().setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cmpsition_RelatesTo_TargetId_Prd_End ********************************************************************************/
		if(c.getCmpsitionRelatesToTargetIdPrdEnd() != null ) {

			String[] arrayi0 = c.getCmpsitionRelatesToTargetIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getRelatesTo().size() < i0+1) { composition.addRelatesTo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {composition.getRelatesTo().get(i0).getTargetIdentifier().getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cmpsition_RelatesTo_TargetId_Prd_Strt ********************************************************************************/
		if(c.getCmpsitionRelatesToTargetIdPrdStrt() != null ) {

			String[] arrayi0 = c.getCmpsitionRelatesToTargetIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getRelatesTo().size() < i0+1) { composition.addRelatesTo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {composition.getRelatesTo().get(i0).getTargetIdentifier().getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cmpsition_RelatesTo_TargetId_Sys ********************************************************************************/
		if(c.getCmpsitionRelatesToTargetIdSys() != null ) {

			String[] arrayi0 = c.getCmpsitionRelatesToTargetIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getRelatesTo().size() < i0+1) { composition.addRelatesTo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {composition.getRelatesTo().get(i0).getTargetIdentifier().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cmpsition_RelatesTo_TargetId_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCmpsitionRelatesToTargetIdTypCdgCd() != null ) {

			String[] arrayi0 = c.getCmpsitionRelatesToTargetIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getRelatesTo().size() < i0+1) { composition.addRelatesTo(); }
				String[] arrayi1 = c.getCmpsitionRelatesToTargetIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(composition.getRelatesTo().get(i0).getTargetIdentifier().getType().getCoding().size() < i1+1) { composition.getRelatesTo().get(i0).getTargetIdentifier().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {composition.getRelatesTo().get(i0).getTargetIdentifier().getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmpsition_RelatesTo_TargetId_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCmpsitionRelatesToTargetIdTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCmpsitionRelatesToTargetIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getRelatesTo().size() < i0+1) { composition.addRelatesTo(); }
				String[] arrayi1 = c.getCmpsitionRelatesToTargetIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(composition.getRelatesTo().get(i0).getTargetIdentifier().getType().getCoding().size() < i1+1) { composition.getRelatesTo().get(i0).getTargetIdentifier().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {composition.getRelatesTo().get(i0).getTargetIdentifier().getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmpsition_RelatesTo_TargetId_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCmpsitionRelatesToTargetIdTypCdgSys() != null ) {

			String[] arrayi0 = c.getCmpsitionRelatesToTargetIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getRelatesTo().size() < i0+1) { composition.addRelatesTo(); }
				String[] arrayi1 = c.getCmpsitionRelatesToTargetIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(composition.getRelatesTo().get(i0).getTargetIdentifier().getType().getCoding().size() < i1+1) { composition.getRelatesTo().get(i0).getTargetIdentifier().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {composition.getRelatesTo().get(i0).getTargetIdentifier().getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmpsition_RelatesTo_TargetId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmpsitionRelatesToTargetIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCmpsitionRelatesToTargetIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getRelatesTo().size() < i0+1) { composition.addRelatesTo(); }
				String[] arrayi1 = c.getCmpsitionRelatesToTargetIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(composition.getRelatesTo().get(i0).getTargetIdentifier().getType().getCoding().size() < i1+1) { composition.getRelatesTo().get(i0).getTargetIdentifier().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {composition.getRelatesTo().get(i0).getTargetIdentifier().getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cmpsition_RelatesTo_TargetId_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCmpsitionRelatesToTargetIdTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCmpsitionRelatesToTargetIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getRelatesTo().size() < i0+1) { composition.addRelatesTo(); }
				String[] arrayi1 = c.getCmpsitionRelatesToTargetIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(composition.getRelatesTo().get(i0).getTargetIdentifier().getType().getCoding().size() < i1+1) { composition.getRelatesTo().get(i0).getTargetIdentifier().getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {composition.getRelatesTo().get(i0).getTargetIdentifier().getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmpsition_RelatesTo_TargetId_Typ_Txt ********************************************************************************/
		if(c.getCmpsitionRelatesToTargetIdTypTxt() != null ) {

			String[] arrayi0 = c.getCmpsitionRelatesToTargetIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getRelatesTo().size() < i0+1) { composition.addRelatesTo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {composition.getRelatesTo().get(i0).getTargetIdentifier().getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cmpsition_RelatesTo_TargetId_Use ********************************************************************************/
		if(c.getCmpsitionRelatesToTargetIdUse() != null ) {

			String[] arrayi0 = c.getCmpsitionRelatesToTargetIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getRelatesTo().size() < i0+1) { composition.addRelatesTo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {composition.getRelatesTo().get(i0).getTargetIdentifier().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cmpsition_RelatesTo_TargetId_Vl ********************************************************************************/
		if(c.getCmpsitionRelatesToTargetIdVl() != null ) {

			String[] arrayi0 = c.getCmpsitionRelatesToTargetIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getRelatesTo().size() < i0+1) { composition.addRelatesTo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {composition.getRelatesTo().get(i0).getTargetIdentifier().setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cmpsition_RelatesTo_TarRfrnc ********************************************************************************/
		if(c.getCmpsitionRelatesToTarRfrnc() != null ) {

			String[] arrayi0 = c.getCmpsitionRelatesToTarRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getRelatesTo().size() < i0+1) { composition.addRelatesTo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {composition.getRelatesTo().get(i0).setTarget(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cmpsition_Section_Athr ********************************************************************************/
		if(c.getCmpsitionSectionAthr() != null ) {

			String[] arrayi0 = c.getCmpsitionSectionAthr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getSection().size() < i0+1) { composition.addSection(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {composition.getSection().get(i0).addAuthor(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cmpsition_Section_Cd_Cdg_Cd ********************************************************************************/
		if(c.getCmpsitionSectionCdCdgCd() != null ) {

			String[] arrayi0 = c.getCmpsitionSectionCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getSection().size() < i0+1) { composition.addSection(); }
				String[] arrayi1 = c.getCmpsitionSectionCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(composition.getSection().get(i0).getCode().getCoding().size() < i1+1) { composition.getSection().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {composition.getSection().get(i0).getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmpsition_Section_Cd_Cdg_Dsply ********************************************************************************/
		if(c.getCmpsitionSectionCdCdgDsply() != null ) {

			String[] arrayi0 = c.getCmpsitionSectionCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getSection().size() < i0+1) { composition.addSection(); }
				String[] arrayi1 = c.getCmpsitionSectionCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(composition.getSection().get(i0).getCode().getCoding().size() < i1+1) { composition.getSection().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {composition.getSection().get(i0).getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmpsition_Section_Cd_Cdg_Sys ********************************************************************************/
		if(c.getCmpsitionSectionCdCdgSys() != null ) {

			String[] arrayi0 = c.getCmpsitionSectionCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getSection().size() < i0+1) { composition.addSection(); }
				String[] arrayi1 = c.getCmpsitionSectionCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(composition.getSection().get(i0).getCode().getCoding().size() < i1+1) { composition.getSection().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {composition.getSection().get(i0).getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmpsition_Section_Cd_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmpsitionSectionCdCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCmpsitionSectionCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getSection().size() < i0+1) { composition.addSection(); }
				String[] arrayi1 = c.getCmpsitionSectionCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(composition.getSection().get(i0).getCode().getCoding().size() < i1+1) { composition.getSection().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {composition.getSection().get(i0).getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cmpsition_Section_Cd_Cdg_Vrsn ********************************************************************************/
		if(c.getCmpsitionSectionCdCdgVrsn() != null ) {

			String[] arrayi0 = c.getCmpsitionSectionCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getSection().size() < i0+1) { composition.addSection(); }
				String[] arrayi1 = c.getCmpsitionSectionCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(composition.getSection().get(i0).getCode().getCoding().size() < i1+1) { composition.getSection().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {composition.getSection().get(i0).getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmpsition_Section_Cd_Txt ********************************************************************************/
		if(c.getCmpsitionSectionCdTxt() != null ) {

			String[] arrayi0 = c.getCmpsitionSectionCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getSection().size() < i0+1) { composition.addSection(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {composition.getSection().get(i0).getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cmpsition_Section_EmptyRsn_Cdg_Cd ********************************************************************************/
		if(c.getCmpsitionSectionEmptyRsnCdgCd() != null ) {

			String[] arrayi0 = c.getCmpsitionSectionEmptyRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getSection().size() < i0+1) { composition.addSection(); }
				String[] arrayi1 = c.getCmpsitionSectionEmptyRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(composition.getSection().get(i0).getEmptyReason().getCoding().size() < i1+1) { composition.getSection().get(i0).getEmptyReason().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {composition.getSection().get(i0).getEmptyReason().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmpsition_Section_EmptyRsn_Cdg_Dsply ********************************************************************************/
		if(c.getCmpsitionSectionEmptyRsnCdgDsply() != null ) {

			String[] arrayi0 = c.getCmpsitionSectionEmptyRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getSection().size() < i0+1) { composition.addSection(); }
				String[] arrayi1 = c.getCmpsitionSectionEmptyRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(composition.getSection().get(i0).getEmptyReason().getCoding().size() < i1+1) { composition.getSection().get(i0).getEmptyReason().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {composition.getSection().get(i0).getEmptyReason().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmpsition_Section_EmptyRsn_Cdg_Sys ********************************************************************************/
		if(c.getCmpsitionSectionEmptyRsnCdgSys() != null ) {

			String[] arrayi0 = c.getCmpsitionSectionEmptyRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getSection().size() < i0+1) { composition.addSection(); }
				String[] arrayi1 = c.getCmpsitionSectionEmptyRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(composition.getSection().get(i0).getEmptyReason().getCoding().size() < i1+1) { composition.getSection().get(i0).getEmptyReason().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {composition.getSection().get(i0).getEmptyReason().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmpsition_Section_EmptyRsn_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmpsitionSectionEmptyRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCmpsitionSectionEmptyRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getSection().size() < i0+1) { composition.addSection(); }
				String[] arrayi1 = c.getCmpsitionSectionEmptyRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(composition.getSection().get(i0).getEmptyReason().getCoding().size() < i1+1) { composition.getSection().get(i0).getEmptyReason().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {composition.getSection().get(i0).getEmptyReason().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cmpsition_Section_EmptyRsn_Cdg_Vrsn ********************************************************************************/
		if(c.getCmpsitionSectionEmptyRsnCdgVrsn() != null ) {

			String[] arrayi0 = c.getCmpsitionSectionEmptyRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getSection().size() < i0+1) { composition.addSection(); }
				String[] arrayi1 = c.getCmpsitionSectionEmptyRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(composition.getSection().get(i0).getEmptyReason().getCoding().size() < i1+1) { composition.getSection().get(i0).getEmptyReason().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {composition.getSection().get(i0).getEmptyReason().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmpsition_Section_EmptyRsn_Txt ********************************************************************************/
		if(c.getCmpsitionSectionEmptyRsnTxt() != null ) {

			String[] arrayi0 = c.getCmpsitionSectionEmptyRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getSection().size() < i0+1) { composition.addSection(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {composition.getSection().get(i0).getEmptyReason().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cmpsition_Section_Entry ********************************************************************************/
		if(c.getCmpsitionSectionEntry() != null ) {

			String[] arrayi0 = c.getCmpsitionSectionEntry().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getSection().size() < i0+1) { composition.addSection(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {composition.getSection().get(i0).addEntry(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cmpsition_Section_Focus ********************************************************************************/
		if(c.getCmpsitionSectionFocus() != null ) {

			String[] arrayi0 = c.getCmpsitionSectionFocus().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getSection().size() < i0+1) { composition.addSection(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {composition.getSection().get(i0).setFocus(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cmpsition_Section_Mode ********************************************************************************/
		if(c.getCmpsitionSectionMode() != null ) {

			String[] arrayi0 = c.getCmpsitionSectionMode().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getSection().size() < i0+1) { composition.addSection(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {composition.getSection().get(i0).setMode(new org.hl7.fhir.r4.model.Composition.SectionModeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cmpsition_Section_OrdredBy_Cdg_Cd ********************************************************************************/
		if(c.getCmpsitionSectionOrdredByCdgCd() != null ) {

			String[] arrayi0 = c.getCmpsitionSectionOrdredByCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getSection().size() < i0+1) { composition.addSection(); }
				String[] arrayi1 = c.getCmpsitionSectionOrdredByCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(composition.getSection().get(i0).getOrderedBy().getCoding().size() < i1+1) { composition.getSection().get(i0).getOrderedBy().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {composition.getSection().get(i0).getOrderedBy().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmpsition_Section_OrdredBy_Cdg_Dsply ********************************************************************************/
		if(c.getCmpsitionSectionOrdredByCdgDsply() != null ) {

			String[] arrayi0 = c.getCmpsitionSectionOrdredByCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getSection().size() < i0+1) { composition.addSection(); }
				String[] arrayi1 = c.getCmpsitionSectionOrdredByCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(composition.getSection().get(i0).getOrderedBy().getCoding().size() < i1+1) { composition.getSection().get(i0).getOrderedBy().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {composition.getSection().get(i0).getOrderedBy().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmpsition_Section_OrdredBy_Cdg_Sys ********************************************************************************/
		if(c.getCmpsitionSectionOrdredByCdgSys() != null ) {

			String[] arrayi0 = c.getCmpsitionSectionOrdredByCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getSection().size() < i0+1) { composition.addSection(); }
				String[] arrayi1 = c.getCmpsitionSectionOrdredByCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(composition.getSection().get(i0).getOrderedBy().getCoding().size() < i1+1) { composition.getSection().get(i0).getOrderedBy().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {composition.getSection().get(i0).getOrderedBy().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmpsition_Section_OrdredBy_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmpsitionSectionOrdredByCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCmpsitionSectionOrdredByCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getSection().size() < i0+1) { composition.addSection(); }
				String[] arrayi1 = c.getCmpsitionSectionOrdredByCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(composition.getSection().get(i0).getOrderedBy().getCoding().size() < i1+1) { composition.getSection().get(i0).getOrderedBy().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {composition.getSection().get(i0).getOrderedBy().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cmpsition_Section_OrdredBy_Cdg_Vrsn ********************************************************************************/
		if(c.getCmpsitionSectionOrdredByCdgVrsn() != null ) {

			String[] arrayi0 = c.getCmpsitionSectionOrdredByCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getSection().size() < i0+1) { composition.addSection(); }
				String[] arrayi1 = c.getCmpsitionSectionOrdredByCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(composition.getSection().get(i0).getOrderedBy().getCoding().size() < i1+1) { composition.getSection().get(i0).getOrderedBy().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {composition.getSection().get(i0).getOrderedBy().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cmpsition_Section_OrdredBy_Txt ********************************************************************************/
		if(c.getCmpsitionSectionOrdredByTxt() != null ) {

			String[] arrayi0 = c.getCmpsitionSectionOrdredByTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getSection().size() < i0+1) { composition.addSection(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {composition.getSection().get(i0).getOrderedBy().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cmpsition_Section_Txt_Div_DivAsStrg ********************************************************************************/
		if(c.getCmpsitionSectionTxtDiv() != null ) {

			String[] arrayi0 = c.getCmpsitionSectionTxtDiv().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getSection().size() < i0+1) { composition.addSection(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {composition.getSection().get(i0).getText().getDiv().setValueAsString(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
//		/******************** Cmpsition_Section_Txt_Div_StsAsStrg ********************************************************************************/
//		if(c.getCmpsitionSectionTxtDivStsAsStrg() != null ) {
//
//			String[] arrayi0 = c.getCmpsitionSectionTxtDivStsAsStrg().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
//			for(int i0 = 0; i0 < arrayi0.length; i0++) {
//				if(composition.getSection().size() < i0+1) { composition.addSection(); }
//				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {composition.getSection().get(i0).getText().getDiv().setStatusAsString(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
//			}
//
//		}
		/******************** Cmpsition_Section_Txt_Sts ********************************************************************************/
		if(c.getCmpsitionSectionTxtSts() != null ) {

			String[] arrayi0 = c.getCmpsitionSectionTxtSts().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getSection().size() < i0+1) { composition.addSection(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {composition.getSection().get(i0).getText().setStatus(new org.hl7.fhir.r4.model.Narrative.NarrativeStatusEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cmpsition_Section_Ttl ********************************************************************************/
		if(c.getCmpsitionSectionTtl() != null ) {

			String[] arrayi0 = c.getCmpsitionSectionTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getSection().size() < i0+1) { composition.addSection(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {composition.getSection().get(i0).setTitle(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cmpsition_Sts ********************************************************************************/
		if(c.getCmpsitionSts() != null ) {

			if(c.getCmpsitionSts().replace("[","").replace("]","").equals("NULL") | c.getCmpsitionSts()==null) {} else {
			composition.setStatus(new org.hl7.fhir.r4.model.Composition.CompositionStatusEnumFactory().fromCode(c.getCmpsitionSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cmpsition_Sbjct ********************************************************************************/
		if(c.getCmpsitionSbjct() != null ) {

			if(c.getCmpsitionSbjct().replace("[","").replace("]","").equals("NULL") | c.getCmpsitionSbjct()==null) {} else {
			composition.setSubject(new org.hl7.fhir.r4.model.Reference(c.getCmpsitionSbjct().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cmpsition_Ttl ********************************************************************************/
		if(c.getCmpsitionTtl() != null ) {

			if(c.getCmpsitionTtl().replace("[","").replace("]","").equals("NULL") | c.getCmpsitionTtl()==null) {} else {
			composition.setTitle(c.getCmpsitionTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cmpsition_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCmpsitionTypCdgCd() != null ) {

			String[] arrayi0 = c.getCmpsitionTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getType().getCoding().size() < i0+1) { composition.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {composition.getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cmpsition_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCmpsitionTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCmpsitionTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getType().getCoding().size() < i0+1) { composition.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {composition.getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cmpsition_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCmpsitionTypCdgSys() != null ) {

			String[] arrayi0 = c.getCmpsitionTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getType().getCoding().size() < i0+1) { composition.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {composition.getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cmpsition_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmpsitionTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCmpsitionTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getType().getCoding().size() < i0+1) { composition.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {composition.getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cmpsition_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCmpsitionTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCmpsitionTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(composition.getType().getCoding().size() < i0+1) { composition.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {composition.getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cmpsition_Typ_Txt ********************************************************************************/
		if(c.getCmpsitionTypTxt() != null ) {

			if(c.getCmpsitionTypTxt().replace("[","").replace("]","").equals("NULL") | c.getCmpsitionTypTxt()==null) {} else {
			composition.getType().setText(c.getCmpsitionTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return composition;
	}
}
