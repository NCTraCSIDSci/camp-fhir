package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.TestScript;
public class TestScriptConversion 
{
	public org.hl7.fhir.r4.model.TestScript TestScripts(TestScript t) throws ParseException
	{
		org.hl7.fhir.r4.model.TestScript testscript = new org.hl7.fhir.r4.model.TestScript();

		/******************** id ********************************************************************************/
		testscript.setId(t.getId());

		/******************** TstScrpt_Cntct_Nm ********************************************************************************/
		if(t.getTstScrptCntctNm() != null ) {

			String[] arrayi0 = t.getTstScrptCntctNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getContact().size() < i0+1) { testscript.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getContact().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(t.getTstScrptCntctTlcmPrdEnd() != null ) {

			String[] arrayi0 = t.getTstScrptCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getContact().size() < i0+1) { testscript.addContact(); }
				String[] arrayi1 = t.getTstScrptCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getContact().get(i0).getTelecom().size() < i1+1) { testscript.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getContact().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** TstScrpt_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(t.getTstScrptCntctTlcmPrdStrt() != null ) {

			String[] arrayi0 = t.getTstScrptCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getContact().size() < i0+1) { testscript.addContact(); }
				String[] arrayi1 = t.getTstScrptCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getContact().get(i0).getTelecom().size() < i1+1) { testscript.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getContact().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** TstScrpt_Cntct_Tlcm_Rnk ********************************************************************************/
		if(t.getTstScrptCntctTlcmRnk() != null ) {

			String[] arrayi0 = t.getTstScrptCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getContact().size() < i0+1) { testscript.addContact(); }
				String[] arrayi1 = t.getTstScrptCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getContact().get(i0).getTelecom().size() < i1+1) { testscript.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getContact().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** TstScrpt_Cntct_Tlcm_Sys ********************************************************************************/
		if(t.getTstScrptCntctTlcmSys() != null ) {

			String[] arrayi0 = t.getTstScrptCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getContact().size() < i0+1) { testscript.addContact(); }
				String[] arrayi1 = t.getTstScrptCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getContact().get(i0).getTelecom().size() < i1+1) { testscript.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getContact().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** TstScrpt_Cntct_Tlcm_Use ********************************************************************************/
		if(t.getTstScrptCntctTlcmUse() != null ) {

			String[] arrayi0 = t.getTstScrptCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getContact().size() < i0+1) { testscript.addContact(); }
				String[] arrayi1 = t.getTstScrptCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getContact().get(i0).getTelecom().size() < i1+1) { testscript.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getContact().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** TstScrpt_Cntct_Tlcm_Vl ********************************************************************************/
		if(t.getTstScrptCntctTlcmVl() != null ) {

			String[] arrayi0 = t.getTstScrptCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getContact().size() < i0+1) { testscript.addContact(); }
				String[] arrayi1 = t.getTstScrptCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getContact().get(i0).getTelecom().size() < i1+1) { testscript.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getContact().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Copyright ********************************************************************************/
		if(t.getTstScrptCopyright() != null ) {

			if(t.getTstScrptCopyright().replace("[","").replace("]","").equals("NULL") | t.getTstScrptCopyright()==null) {} else {
			testscript.setCopyright(t.getTstScrptCopyright().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** TstScrpt_Dt ********************************************************************************/
		if(t.getTstScrptDt() != null ) {

			if(t.getTstScrptDt().replace("[","").replace("]","").equals("NULL") | t.getTstScrptDt()==null) {} else {
			testscript.setDate(t.getTstScrptDt().replace("[","").replace("]","").equals("NULL") | t.getTstScrptDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(t.getTstScrptDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** TstScrpt_Dscrptn ********************************************************************************/
		if(t.getTstScrptDscrptn() != null ) {

			if(t.getTstScrptDscrptn().replace("[","").replace("]","").equals("NULL") | t.getTstScrptDscrptn()==null) {} else {
			testscript.setDescription(t.getTstScrptDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** TstScrpt_Destination_Index ********************************************************************************/
		if(t.getTstScrptDestinationIndex() != null ) {

			String[] arrayi0 = t.getTstScrptDestinationIndex().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getDestination().size() < i0+1) { testscript.addDestination(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getDestination().get(i0).setIndex(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstScrpt_Destination_Profile_Cd ********************************************************************************/
		if(t.getTstScrptDestinationProfileCd() != null ) {

			String[] arrayi0 = t.getTstScrptDestinationProfileCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getDestination().size() < i0+1) { testscript.addDestination(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getDestination().get(i0).getProfile().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Destination_Profile_Dsply ********************************************************************************/
		if(t.getTstScrptDestinationProfileDsply() != null ) {

			String[] arrayi0 = t.getTstScrptDestinationProfileDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getDestination().size() < i0+1) { testscript.addDestination(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getDestination().get(i0).getProfile().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Destination_Profile_Sys ********************************************************************************/
		if(t.getTstScrptDestinationProfileSys() != null ) {

			String[] arrayi0 = t.getTstScrptDestinationProfileSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getDestination().size() < i0+1) { testscript.addDestination(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getDestination().get(i0).getProfile().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Destination_Profile_UsrSltd ********************************************************************************/
		if(t.getTstScrptDestinationProfileUsrSltd() != null ) {

			String[] arrayi0 = t.getTstScrptDestinationProfileUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getDestination().size() < i0+1) { testscript.addDestination(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getDestination().get(i0).getProfile().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstScrpt_Destination_Profile_Vrsn ********************************************************************************/
		if(t.getTstScrptDestinationProfileVrsn() != null ) {

			String[] arrayi0 = t.getTstScrptDestinationProfileVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getDestination().size() < i0+1) { testscript.addDestination(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getDestination().get(i0).getProfile().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Exprmtl ********************************************************************************/
		if(t.getTstScrptExprmtl() != null ) {

			if(t.getTstScrptExprmtl().replace("[","").replace("]","").equals("NULL") | t.getTstScrptExprmtl()==null) {} else {
			testscript.setExperimental(Boolean.parseBoolean(t.getTstScrptExprmtl().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** TstScrpt_Fixture_Autocreate ********************************************************************************/
		if(t.getTstScrptFixtureAutocreate() != null ) {

			String[] arrayi0 = t.getTstScrptFixtureAutocreate().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getFixture().size() < i0+1) { testscript.addFixture(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getFixture().get(i0).setAutocreate(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstScrpt_Fixture_Autodelete ********************************************************************************/
		if(t.getTstScrptFixtureAutodelete() != null ) {

			String[] arrayi0 = t.getTstScrptFixtureAutodelete().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getFixture().size() < i0+1) { testscript.addFixture(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getFixture().get(i0).setAutodelete(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstScrpt_Fixture_Rsrc ********************************************************************************/
		if(t.getTstScrptFixtureRsrc() != null ) {

			String[] arrayi0 = t.getTstScrptFixtureRsrc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getFixture().size() < i0+1) { testscript.addFixture(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getFixture().get(i0).setResource(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstScrpt_Id_Assigner ********************************************************************************/
		if(t.getTstScrptIdAssigner() != null ) {

			if(t.getTstScrptIdAssigner().replace("[","").replace("]","").equals("NULL") | t.getTstScrptIdAssigner()==null) {} else {
			testscript.getIdentifier().setAssigner(new org.hl7.fhir.r4.model.Reference(t.getTstScrptIdAssigner().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** TstScrpt_Id_Prd_End ********************************************************************************/
		if(t.getTstScrptIdPrdEnd() != null ) {

			if(t.getTstScrptIdPrdEnd().replace("[","").replace("]","").equals("NULL") | t.getTstScrptIdPrdEnd()==null) {} else {
			testscript.getIdentifier().getPeriod().setEnd(t.getTstScrptIdPrdEnd().replace("[","").replace("]","").equals("NULL") | t.getTstScrptIdPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(t.getTstScrptIdPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** TstScrpt_Id_Prd_Strt ********************************************************************************/
		if(t.getTstScrptIdPrdStrt() != null ) {

			if(t.getTstScrptIdPrdStrt().replace("[","").replace("]","").equals("NULL") | t.getTstScrptIdPrdStrt()==null) {} else {
			testscript.getIdentifier().getPeriod().setStart(t.getTstScrptIdPrdStrt().replace("[","").replace("]","").equals("NULL") | t.getTstScrptIdPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(t.getTstScrptIdPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** TstScrpt_Id_Sys ********************************************************************************/
		if(t.getTstScrptIdSys() != null ) {

			if(t.getTstScrptIdSys().replace("[","").replace("]","").equals("NULL") | t.getTstScrptIdSys()==null) {} else {
			testscript.getIdentifier().setSystem(t.getTstScrptIdSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** TstScrpt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(t.getTstScrptIdTypCdgCd() != null ) {

			String[] arrayi0 = t.getTstScrptIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getIdentifier().getType().getCoding().size() < i0+1) { testscript.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getIdentifier().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(t.getTstScrptIdTypCdgDsply() != null ) {

			String[] arrayi0 = t.getTstScrptIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getIdentifier().getType().getCoding().size() < i0+1) { testscript.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getIdentifier().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(t.getTstScrptIdTypCdgSys() != null ) {

			String[] arrayi0 = t.getTstScrptIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getIdentifier().getType().getCoding().size() < i0+1) { testscript.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getIdentifier().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(t.getTstScrptIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = t.getTstScrptIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getIdentifier().getType().getCoding().size() < i0+1) { testscript.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getIdentifier().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstScrpt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(t.getTstScrptIdTypCdgVrsn() != null ) {

			String[] arrayi0 = t.getTstScrptIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getIdentifier().getType().getCoding().size() < i0+1) { testscript.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getIdentifier().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Id_Typ_Txt ********************************************************************************/
		if(t.getTstScrptIdTypTxt() != null ) {

			if(t.getTstScrptIdTypTxt().replace("[","").replace("]","").equals("NULL") | t.getTstScrptIdTypTxt()==null) {} else {
			testscript.getIdentifier().getType().setText(t.getTstScrptIdTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** TstScrpt_Id_Use ********************************************************************************/
		if(t.getTstScrptIdUse() != null ) {

			if(t.getTstScrptIdUse().replace("[","").replace("]","").equals("NULL") | t.getTstScrptIdUse()==null) {} else {
			testscript.getIdentifier().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(t.getTstScrptIdUse().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** TstScrpt_Id_Vl ********************************************************************************/
		if(t.getTstScrptIdVl() != null ) {

			if(t.getTstScrptIdVl().replace("[","").replace("]","").equals("NULL") | t.getTstScrptIdVl()==null) {} else {
			testscript.getIdentifier().setValue(t.getTstScrptIdVl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** TstScrpt_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(t.getTstScrptJrsdctnCdgCd() != null ) {

			String[] arrayi0 = t.getTstScrptJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getJurisdiction().size() < i0+1) { testscript.addJurisdiction(); }
				String[] arrayi1 = t.getTstScrptJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getJurisdiction().get(i0).getCoding().size() < i1+1) { testscript.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getJurisdiction().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(t.getTstScrptJrsdctnCdgDsply() != null ) {

			String[] arrayi0 = t.getTstScrptJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getJurisdiction().size() < i0+1) { testscript.addJurisdiction(); }
				String[] arrayi1 = t.getTstScrptJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getJurisdiction().get(i0).getCoding().size() < i1+1) { testscript.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getJurisdiction().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(t.getTstScrptJrsdctnCdgSys() != null ) {

			String[] arrayi0 = t.getTstScrptJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getJurisdiction().size() < i0+1) { testscript.addJurisdiction(); }
				String[] arrayi1 = t.getTstScrptJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getJurisdiction().get(i0).getCoding().size() < i1+1) { testscript.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getJurisdiction().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(t.getTstScrptJrsdctnCdgUsrSltd() != null ) {

			String[] arrayi0 = t.getTstScrptJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getJurisdiction().size() < i0+1) { testscript.addJurisdiction(); }
				String[] arrayi1 = t.getTstScrptJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getJurisdiction().get(i0).getCoding().size() < i1+1) { testscript.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getJurisdiction().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** TstScrpt_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(t.getTstScrptJrsdctnCdgVrsn() != null ) {

			String[] arrayi0 = t.getTstScrptJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getJurisdiction().size() < i0+1) { testscript.addJurisdiction(); }
				String[] arrayi1 = t.getTstScrptJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getJurisdiction().get(i0).getCoding().size() < i1+1) { testscript.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getJurisdiction().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Jrsdctn_Txt ********************************************************************************/
		if(t.getTstScrptJrsdctnTxt() != null ) {

			String[] arrayi0 = t.getTstScrptJrsdctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getJurisdiction().size() < i0+1) { testscript.addJurisdiction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getJurisdiction().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Metadata_Capblty_Cpnlties ********************************************************************************/
		if(t.getTstScrptMetadataCapbltyCpnlties() != null ) {

			String[] arrayi0 = t.getTstScrptMetadataCapbltyCpnlties().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getMetadata().getCapability().size() < i0+1) { testscript.getMetadata().addCapability(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getMetadata().getCapability().get(i0).setCapabilities(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Metadata_Capblty_Dscrptn ********************************************************************************/
		if(t.getTstScrptMetadataCapbltyDscrptn() != null ) {

			String[] arrayi0 = t.getTstScrptMetadataCapbltyDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getMetadata().getCapability().size() < i0+1) { testscript.getMetadata().addCapability(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getMetadata().getCapability().get(i0).setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Metadata_Capblty_Destination ********************************************************************************/
		if(t.getTstScrptMetadataCapbltyDestination() != null ) {

			String[] arrayi0 = t.getTstScrptMetadataCapbltyDestination().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getMetadata().getCapability().size() < i0+1) { testscript.getMetadata().addCapability(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getMetadata().getCapability().get(i0).setDestination(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstScrpt_Metadata_Capblty_Link ********************************************************************************/
		if(t.getTstScrptMetadataCapbltyLink() != null ) {

			String[] arrayi0 = t.getTstScrptMetadataCapbltyLink().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getMetadata().getCapability().size() < i0+1) { testscript.getMetadata().addCapability(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {testscript.getMetadata().getCapability().get(i0).addLink(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Metadata_Capblty_Origin ********************************************************************************/
		if(t.getTstScrptMetadataCapbltyOrigin() != null ) {

			String[] arrayi0 = t.getTstScrptMetadataCapbltyOrigin().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getMetadata().getCapability().size() < i0+1) { testscript.getMetadata().addCapability(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {testscript.getMetadata().getCapability().get(i0).addOrigin(Integer.parseInt(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** TstScrpt_Metadata_Capblty_Required ********************************************************************************/
		if(t.getTstScrptMetadataCapbltyRequired() != null ) {

			String[] arrayi0 = t.getTstScrptMetadataCapbltyRequired().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getMetadata().getCapability().size() < i0+1) { testscript.getMetadata().addCapability(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getMetadata().getCapability().get(i0).setRequired(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstScrpt_Metadata_Capblty_Validated ********************************************************************************/
		if(t.getTstScrptMetadataCapbltyValidated() != null ) {

			String[] arrayi0 = t.getTstScrptMetadataCapbltyValidated().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getMetadata().getCapability().size() < i0+1) { testscript.getMetadata().addCapability(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getMetadata().getCapability().get(i0).setValidated(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstScrpt_Metadata_Link_Dscrptn ********************************************************************************/
		if(t.getTstScrptMetadataLinkDscrptn() != null ) {

			String[] arrayi0 = t.getTstScrptMetadataLinkDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getMetadata().getLink().size() < i0+1) { testscript.getMetadata().addLink(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getMetadata().getLink().get(i0).setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Metadata_Link_Url ********************************************************************************/
		if(t.getTstScrptMetadataLinkUrl() != null ) {

			String[] arrayi0 = t.getTstScrptMetadataLinkUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getMetadata().getLink().size() < i0+1) { testscript.getMetadata().addLink(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getMetadata().getLink().get(i0).setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Nm ********************************************************************************/
		if(t.getTstScrptNm() != null ) {

			if(t.getTstScrptNm().replace("[","").replace("]","").equals("NULL") | t.getTstScrptNm()==null) {} else {
			testscript.setName(t.getTstScrptNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** TstScrpt_Origin_Index ********************************************************************************/
		if(t.getTstScrptOriginIndex() != null ) {

			String[] arrayi0 = t.getTstScrptOriginIndex().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getOrigin().size() < i0+1) { testscript.addOrigin(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getOrigin().get(i0).setIndex(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstScrpt_Origin_Profile_Cd ********************************************************************************/
		if(t.getTstScrptOriginProfileCd() != null ) {

			String[] arrayi0 = t.getTstScrptOriginProfileCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getOrigin().size() < i0+1) { testscript.addOrigin(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getOrigin().get(i0).getProfile().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Origin_Profile_Dsply ********************************************************************************/
		if(t.getTstScrptOriginProfileDsply() != null ) {

			String[] arrayi0 = t.getTstScrptOriginProfileDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getOrigin().size() < i0+1) { testscript.addOrigin(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getOrigin().get(i0).getProfile().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Origin_Profile_Sys ********************************************************************************/
		if(t.getTstScrptOriginProfileSys() != null ) {

			String[] arrayi0 = t.getTstScrptOriginProfileSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getOrigin().size() < i0+1) { testscript.addOrigin(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getOrigin().get(i0).getProfile().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Origin_Profile_UsrSltd ********************************************************************************/
		if(t.getTstScrptOriginProfileUsrSltd() != null ) {

			String[] arrayi0 = t.getTstScrptOriginProfileUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getOrigin().size() < i0+1) { testscript.addOrigin(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getOrigin().get(i0).getProfile().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstScrpt_Origin_Profile_Vrsn ********************************************************************************/
		if(t.getTstScrptOriginProfileVrsn() != null ) {

			String[] arrayi0 = t.getTstScrptOriginProfileVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getOrigin().size() < i0+1) { testscript.addOrigin(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getOrigin().get(i0).getProfile().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Profile ********************************************************************************/
		if(t.getTstScrptProfile() != null ) {

				for( String currListStrSplit : t.getTstScrptProfile().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			testscript.addProfile(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** TstScrpt_Pblshr ********************************************************************************/
		if(t.getTstScrptPblshr() != null ) {

			if(t.getTstScrptPblshr().replace("[","").replace("]","").equals("NULL") | t.getTstScrptPblshr()==null) {} else {
			testscript.setPublisher(t.getTstScrptPblshr().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** TstScrpt_Prpse ********************************************************************************/
		if(t.getTstScrptPrpse() != null ) {

			if(t.getTstScrptPrpse().replace("[","").replace("]","").equals("NULL") | t.getTstScrptPrpse()==null) {} else {
			testscript.setPurpose(t.getTstScrptPrpse().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** TstScrpt_Stup_Actn_Assert_CompareToSrcExprsn ********************************************************************************/
		if(t.getTstScrptStupActnAssertCompareToSrcExprsn() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnAssertCompareToSrcExprsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getAssert().setCompareToSourceExpression(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Assert_CompareToSrcId ********************************************************************************/
		if(t.getTstScrptStupActnAssertCompareToSrcId() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnAssertCompareToSrcId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getAssert().setCompareToSourceId(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Assert_CompareToSrcPath ********************************************************************************/
		if(t.getTstScrptStupActnAssertCompareToSrcPath() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnAssertCompareToSrcPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getAssert().setCompareToSourcePath(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Assert_CntntTyp ********************************************************************************/
		if(t.getTstScrptStupActnAssertCntntTyp() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnAssertCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getAssert().setContentType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Assert_Dscrptn ********************************************************************************/
		if(t.getTstScrptStupActnAssertDscrptn() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnAssertDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getAssert().setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Assert_Direction ********************************************************************************/
		if(t.getTstScrptStupActnAssertDirection() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnAssertDirection().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getAssert().setDirection(new org.hl7.fhir.r4.model.TestScript.AssertionDirectionTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Assert_Exprsn ********************************************************************************/
		if(t.getTstScrptStupActnAssertExprsn() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnAssertExprsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getAssert().setExpression(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Assert_HeaderField ********************************************************************************/
		if(t.getTstScrptStupActnAssertHeaderField() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnAssertHeaderField().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getAssert().setHeaderField(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Assert_Lbl ********************************************************************************/
		if(t.getTstScrptStupActnAssertLbl() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnAssertLbl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getAssert().setLabel(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Assert_MinimumId ********************************************************************************/
		if(t.getTstScrptStupActnAssertMinimumId() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnAssertMinimumId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getAssert().setMinimumId(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Assert_NavigationLinks ********************************************************************************/
		if(t.getTstScrptStupActnAssertNavigationLinks() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnAssertNavigationLinks().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getAssert().setNavigationLinks(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Assert_Operator ********************************************************************************/
		if(t.getTstScrptStupActnAssertOperator() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnAssertOperator().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getAssert().setOperator(new org.hl7.fhir.r4.model.TestScript.AssertionOperatorTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Assert_Path ********************************************************************************/
		if(t.getTstScrptStupActnAssertPath() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnAssertPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getAssert().setPath(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Assert_RqstMthd ********************************************************************************/
		if(t.getTstScrptStupActnAssertRqstMthd() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnAssertRqstMthd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getAssert().setRequestMethod(new org.hl7.fhir.r4.model.TestScript.TestScriptRequestMethodCodeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Assert_RqstUrl ********************************************************************************/
		if(t.getTstScrptStupActnAssertRqstUrl() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnAssertRqstUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getAssert().setRequestURL(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Assert_Rsrc ********************************************************************************/
		if(t.getTstScrptStupActnAssertRsrc() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnAssertRsrc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getAssert().setResource(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Assert_Rsps ********************************************************************************/
		if(t.getTstScrptStupActnAssertRsps() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnAssertRsps().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getAssert().setResponse(new org.hl7.fhir.r4.model.TestScript.AssertionResponseTypesEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Assert_RspsCd ********************************************************************************/
		if(t.getTstScrptStupActnAssertRspsCd() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnAssertRspsCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getAssert().setResponseCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Assert_SrcId ********************************************************************************/
		if(t.getTstScrptStupActnAssertSrcId() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnAssertSrcId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getAssert().setSourceId(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Assert_ValidateProfileId ********************************************************************************/
		if(t.getTstScrptStupActnAssertValidateProfileId() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnAssertValidateProfileId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getAssert().setValidateProfileId(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Assert_Vl ********************************************************************************/
		if(t.getTstScrptStupActnAssertVl() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnAssertVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getAssert().setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Assert_WarningOnly ********************************************************************************/
		if(t.getTstScrptStupActnAssertWarningOnly() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnAssertWarningOnly().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getAssert().setWarningOnly(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Oprtn_Accept ********************************************************************************/
		if(t.getTstScrptStupActnOprtnAccept() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnOprtnAccept().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getOperation().setAccept(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Oprtn_CntntTyp ********************************************************************************/
		if(t.getTstScrptStupActnOprtnCntntTyp() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnOprtnCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getOperation().setContentType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Oprtn_Dscrptn ********************************************************************************/
		if(t.getTstScrptStupActnOprtnDscrptn() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnOprtnDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getOperation().setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Oprtn_Destination ********************************************************************************/
		if(t.getTstScrptStupActnOprtnDestination() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnOprtnDestination().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getOperation().setDestination(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Oprtn_EncodeRqstUrl ********************************************************************************/
		if(t.getTstScrptStupActnOprtnEncodeRqstUrl() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnOprtnEncodeRqstUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getOperation().setEncodeRequestUrl(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Oprtn_Lbl ********************************************************************************/
		if(t.getTstScrptStupActnOprtnLbl() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnOprtnLbl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getOperation().setLabel(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Oprtn_Mthd ********************************************************************************/
		if(t.getTstScrptStupActnOprtnMthd() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnOprtnMthd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getOperation().setMethod(new org.hl7.fhir.r4.model.TestScript.TestScriptRequestMethodCodeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Oprtn_Origin ********************************************************************************/
		if(t.getTstScrptStupActnOprtnOrigin() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnOprtnOrigin().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getOperation().setOrigin(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Oprtn_Params ********************************************************************************/
		if(t.getTstScrptStupActnOprtnParams() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnOprtnParams().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getOperation().setParams(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Oprtn_RqstHeader_Field ********************************************************************************/
		if(t.getTstScrptStupActnOprtnRqstHeaderField() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnOprtnRqstHeaderField().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				String[] arrayi1 = t.getTstScrptStupActnOprtnRqstHeaderField().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getSetup().getAction().get(i0).getOperation().getRequestHeader().size() < i1+1) { testscript.getSetup().getAction().get(i0).getOperation().addRequestHeader(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getSetup().getAction().get(i0).getOperation().getRequestHeader().get(i1).setField(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Stup_Actn_Oprtn_RqstHeader_Vl ********************************************************************************/
		if(t.getTstScrptStupActnOprtnRqstHeaderVl() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnOprtnRqstHeaderVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				String[] arrayi1 = t.getTstScrptStupActnOprtnRqstHeaderVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getSetup().getAction().get(i0).getOperation().getRequestHeader().size() < i1+1) { testscript.getSetup().getAction().get(i0).getOperation().addRequestHeader(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getSetup().getAction().get(i0).getOperation().getRequestHeader().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Stup_Actn_Oprtn_RqstId ********************************************************************************/
		if(t.getTstScrptStupActnOprtnRqstId() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnOprtnRqstId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getOperation().setRequestId(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Oprtn_Rsrc ********************************************************************************/
		if(t.getTstScrptStupActnOprtnRsrc() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnOprtnRsrc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getOperation().setResource(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Oprtn_RspsId ********************************************************************************/
		if(t.getTstScrptStupActnOprtnRspsId() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnOprtnRspsId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getOperation().setResponseId(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Oprtn_SrcId ********************************************************************************/
		if(t.getTstScrptStupActnOprtnSrcId() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnOprtnSrcId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getOperation().setSourceId(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Oprtn_TarId ********************************************************************************/
		if(t.getTstScrptStupActnOprtnTarId() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnOprtnTarId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getOperation().setTargetId(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Oprtn_Typ_Cd ********************************************************************************/
		if(t.getTstScrptStupActnOprtnTypCd() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnOprtnTypCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getOperation().getType().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Oprtn_Typ_Dsply ********************************************************************************/
		if(t.getTstScrptStupActnOprtnTypDsply() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnOprtnTypDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getOperation().getType().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Oprtn_Typ_Sys ********************************************************************************/
		if(t.getTstScrptStupActnOprtnTypSys() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnOprtnTypSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getOperation().getType().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Oprtn_Typ_UsrSltd ********************************************************************************/
		if(t.getTstScrptStupActnOprtnTypUsrSltd() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnOprtnTypUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getOperation().getType().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Oprtn_Typ_Vrsn ********************************************************************************/
		if(t.getTstScrptStupActnOprtnTypVrsn() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnOprtnTypVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getOperation().getType().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Stup_Actn_Oprtn_Url ********************************************************************************/
		if(t.getTstScrptStupActnOprtnUrl() != null ) {

			String[] arrayi0 = t.getTstScrptStupActnOprtnUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getSetup().getAction().size() < i0+1) { testscript.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getSetup().getAction().get(i0).getOperation().setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Sts ********************************************************************************/
		if(t.getTstScrptSts() != null ) {

			if(t.getTstScrptSts().replace("[","").replace("]","").equals("NULL") | t.getTstScrptSts()==null) {} else {
			testscript.setStatus(new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory().fromCode(t.getTstScrptSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_Accept ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnAccept() != null ) {

			String[] arrayi0 = t.getTstScrptTeardownActnOprtnAccept().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTeardown().getAction().size() < i0+1) { testscript.getTeardown().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getTeardown().getAction().get(i0).getOperation().setAccept(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_CntntTyp ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnCntntTyp() != null ) {

			String[] arrayi0 = t.getTstScrptTeardownActnOprtnCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTeardown().getAction().size() < i0+1) { testscript.getTeardown().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getTeardown().getAction().get(i0).getOperation().setContentType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_Dscrptn ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnDscrptn() != null ) {

			String[] arrayi0 = t.getTstScrptTeardownActnOprtnDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTeardown().getAction().size() < i0+1) { testscript.getTeardown().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getTeardown().getAction().get(i0).getOperation().setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_Destination ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnDestination() != null ) {

			String[] arrayi0 = t.getTstScrptTeardownActnOprtnDestination().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTeardown().getAction().size() < i0+1) { testscript.getTeardown().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getTeardown().getAction().get(i0).getOperation().setDestination(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_EncodeRqstUrl ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnEncodeRqstUrl() != null ) {

			String[] arrayi0 = t.getTstScrptTeardownActnOprtnEncodeRqstUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTeardown().getAction().size() < i0+1) { testscript.getTeardown().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getTeardown().getAction().get(i0).getOperation().setEncodeRequestUrl(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_Lbl ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnLbl() != null ) {

			String[] arrayi0 = t.getTstScrptTeardownActnOprtnLbl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTeardown().getAction().size() < i0+1) { testscript.getTeardown().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getTeardown().getAction().get(i0).getOperation().setLabel(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_Mthd ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnMthd() != null ) {

			String[] arrayi0 = t.getTstScrptTeardownActnOprtnMthd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTeardown().getAction().size() < i0+1) { testscript.getTeardown().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getTeardown().getAction().get(i0).getOperation().setMethod(new org.hl7.fhir.r4.model.TestScript.TestScriptRequestMethodCodeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_Origin ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnOrigin() != null ) {

			String[] arrayi0 = t.getTstScrptTeardownActnOprtnOrigin().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTeardown().getAction().size() < i0+1) { testscript.getTeardown().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getTeardown().getAction().get(i0).getOperation().setOrigin(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_Params ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnParams() != null ) {

			String[] arrayi0 = t.getTstScrptTeardownActnOprtnParams().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTeardown().getAction().size() < i0+1) { testscript.getTeardown().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getTeardown().getAction().get(i0).getOperation().setParams(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_RqstHeader_Field ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnRqstHeaderField() != null ) {

			String[] arrayi0 = t.getTstScrptTeardownActnOprtnRqstHeaderField().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTeardown().getAction().size() < i0+1) { testscript.getTeardown().addAction(); }
				String[] arrayi1 = t.getTstScrptTeardownActnOprtnRqstHeaderField().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTeardown().getAction().get(i0).getOperation().getRequestHeader().size() < i1+1) { testscript.getTeardown().getAction().get(i0).getOperation().addRequestHeader(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTeardown().getAction().get(i0).getOperation().getRequestHeader().get(i1).setField(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_RqstHeader_Vl ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnRqstHeaderVl() != null ) {

			String[] arrayi0 = t.getTstScrptTeardownActnOprtnRqstHeaderVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTeardown().getAction().size() < i0+1) { testscript.getTeardown().addAction(); }
				String[] arrayi1 = t.getTstScrptTeardownActnOprtnRqstHeaderVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTeardown().getAction().get(i0).getOperation().getRequestHeader().size() < i1+1) { testscript.getTeardown().getAction().get(i0).getOperation().addRequestHeader(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTeardown().getAction().get(i0).getOperation().getRequestHeader().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_RqstId ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnRqstId() != null ) {

			String[] arrayi0 = t.getTstScrptTeardownActnOprtnRqstId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTeardown().getAction().size() < i0+1) { testscript.getTeardown().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getTeardown().getAction().get(i0).getOperation().setRequestId(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_Rsrc ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnRsrc() != null ) {

			String[] arrayi0 = t.getTstScrptTeardownActnOprtnRsrc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTeardown().getAction().size() < i0+1) { testscript.getTeardown().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getTeardown().getAction().get(i0).getOperation().setResource(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_RspsId ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnRspsId() != null ) {

			String[] arrayi0 = t.getTstScrptTeardownActnOprtnRspsId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTeardown().getAction().size() < i0+1) { testscript.getTeardown().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getTeardown().getAction().get(i0).getOperation().setResponseId(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_SrcId ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnSrcId() != null ) {

			String[] arrayi0 = t.getTstScrptTeardownActnOprtnSrcId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTeardown().getAction().size() < i0+1) { testscript.getTeardown().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getTeardown().getAction().get(i0).getOperation().setSourceId(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_TarId ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnTarId() != null ) {

			String[] arrayi0 = t.getTstScrptTeardownActnOprtnTarId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTeardown().getAction().size() < i0+1) { testscript.getTeardown().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getTeardown().getAction().get(i0).getOperation().setTargetId(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_Typ_Cd ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnTypCd() != null ) {

			String[] arrayi0 = t.getTstScrptTeardownActnOprtnTypCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTeardown().getAction().size() < i0+1) { testscript.getTeardown().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getTeardown().getAction().get(i0).getOperation().getType().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_Typ_Dsply ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnTypDsply() != null ) {

			String[] arrayi0 = t.getTstScrptTeardownActnOprtnTypDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTeardown().getAction().size() < i0+1) { testscript.getTeardown().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getTeardown().getAction().get(i0).getOperation().getType().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_Typ_Sys ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnTypSys() != null ) {

			String[] arrayi0 = t.getTstScrptTeardownActnOprtnTypSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTeardown().getAction().size() < i0+1) { testscript.getTeardown().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getTeardown().getAction().get(i0).getOperation().getType().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_Typ_UsrSltd ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnTypUsrSltd() != null ) {

			String[] arrayi0 = t.getTstScrptTeardownActnOprtnTypUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTeardown().getAction().size() < i0+1) { testscript.getTeardown().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getTeardown().getAction().get(i0).getOperation().getType().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_Typ_Vrsn ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnTypVrsn() != null ) {

			String[] arrayi0 = t.getTstScrptTeardownActnOprtnTypVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTeardown().getAction().size() < i0+1) { testscript.getTeardown().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getTeardown().getAction().get(i0).getOperation().getType().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_Url ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnUrl() != null ) {

			String[] arrayi0 = t.getTstScrptTeardownActnOprtnUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTeardown().getAction().size() < i0+1) { testscript.getTeardown().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getTeardown().getAction().get(i0).getOperation().setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Tst_Actn_Assert_CompareToSrcExprsn ********************************************************************************/
		if(t.getTstScrptTstActnAssertCompareToSrcExprsn() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnAssertCompareToSrcExprsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnAssertCompareToSrcExprsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getAssert().setCompareToSourceExpression(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Assert_CompareToSrcId ********************************************************************************/
		if(t.getTstScrptTstActnAssertCompareToSrcId() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnAssertCompareToSrcId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnAssertCompareToSrcId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getAssert().setCompareToSourceId(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Assert_CompareToSrcPath ********************************************************************************/
		if(t.getTstScrptTstActnAssertCompareToSrcPath() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnAssertCompareToSrcPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnAssertCompareToSrcPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getAssert().setCompareToSourcePath(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Assert_CntntTyp ********************************************************************************/
		if(t.getTstScrptTstActnAssertCntntTyp() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnAssertCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnAssertCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getAssert().setContentType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Assert_Dscrptn ********************************************************************************/
		if(t.getTstScrptTstActnAssertDscrptn() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnAssertDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnAssertDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getAssert().setDescription(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Assert_Direction ********************************************************************************/
		if(t.getTstScrptTstActnAssertDirection() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnAssertDirection().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnAssertDirection().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getAssert().setDirection(new org.hl7.fhir.r4.model.TestScript.AssertionDirectionTypeEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Assert_Exprsn ********************************************************************************/
		if(t.getTstScrptTstActnAssertExprsn() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnAssertExprsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnAssertExprsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getAssert().setExpression(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Assert_HeaderField ********************************************************************************/
		if(t.getTstScrptTstActnAssertHeaderField() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnAssertHeaderField().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnAssertHeaderField().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getAssert().setHeaderField(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Assert_Lbl ********************************************************************************/
		if(t.getTstScrptTstActnAssertLbl() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnAssertLbl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnAssertLbl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getAssert().setLabel(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Assert_MinimumId ********************************************************************************/
		if(t.getTstScrptTstActnAssertMinimumId() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnAssertMinimumId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnAssertMinimumId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getAssert().setMinimumId(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Assert_NavigationLinks ********************************************************************************/
		if(t.getTstScrptTstActnAssertNavigationLinks() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnAssertNavigationLinks().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnAssertNavigationLinks().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getAssert().setNavigationLinks(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Assert_Operator ********************************************************************************/
		if(t.getTstScrptTstActnAssertOperator() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnAssertOperator().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnAssertOperator().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getAssert().setOperator(new org.hl7.fhir.r4.model.TestScript.AssertionOperatorTypeEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Assert_Path ********************************************************************************/
		if(t.getTstScrptTstActnAssertPath() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnAssertPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnAssertPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getAssert().setPath(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Assert_RqstMthd ********************************************************************************/
		if(t.getTstScrptTstActnAssertRqstMthd() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnAssertRqstMthd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnAssertRqstMthd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getAssert().setRequestMethod(new org.hl7.fhir.r4.model.TestScript.TestScriptRequestMethodCodeEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Assert_RqstUrl ********************************************************************************/
		if(t.getTstScrptTstActnAssertRqstUrl() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnAssertRqstUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnAssertRqstUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getAssert().setRequestURL(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Assert_Rsrc ********************************************************************************/
		if(t.getTstScrptTstActnAssertRsrc() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnAssertRsrc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnAssertRsrc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getAssert().setResource(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Assert_Rsps ********************************************************************************/
		if(t.getTstScrptTstActnAssertRsps() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnAssertRsps().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnAssertRsps().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getAssert().setResponse(new org.hl7.fhir.r4.model.TestScript.AssertionResponseTypesEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Assert_RspsCd ********************************************************************************/
		if(t.getTstScrptTstActnAssertRspsCd() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnAssertRspsCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnAssertRspsCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getAssert().setResponseCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Assert_SrcId ********************************************************************************/
		if(t.getTstScrptTstActnAssertSrcId() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnAssertSrcId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnAssertSrcId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getAssert().setSourceId(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Assert_ValidateProfileId ********************************************************************************/
		if(t.getTstScrptTstActnAssertValidateProfileId() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnAssertValidateProfileId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnAssertValidateProfileId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getAssert().setValidateProfileId(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Assert_Vl ********************************************************************************/
		if(t.getTstScrptTstActnAssertVl() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnAssertVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnAssertVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getAssert().setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Assert_WarningOnly ********************************************************************************/
		if(t.getTstScrptTstActnAssertWarningOnly() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnAssertWarningOnly().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnAssertWarningOnly().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getAssert().setWarningOnly(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Oprtn_Accept ********************************************************************************/
		if(t.getTstScrptTstActnOprtnAccept() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnOprtnAccept().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnOprtnAccept().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getOperation().setAccept(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Oprtn_CntntTyp ********************************************************************************/
		if(t.getTstScrptTstActnOprtnCntntTyp() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnOprtnCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnOprtnCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getOperation().setContentType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Oprtn_Dscrptn ********************************************************************************/
		if(t.getTstScrptTstActnOprtnDscrptn() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnOprtnDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnOprtnDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getOperation().setDescription(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Oprtn_Destination ********************************************************************************/
		if(t.getTstScrptTstActnOprtnDestination() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnOprtnDestination().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnOprtnDestination().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getOperation().setDestination(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Oprtn_EncodeRqstUrl ********************************************************************************/
		if(t.getTstScrptTstActnOprtnEncodeRqstUrl() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnOprtnEncodeRqstUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnOprtnEncodeRqstUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getOperation().setEncodeRequestUrl(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Oprtn_Lbl ********************************************************************************/
		if(t.getTstScrptTstActnOprtnLbl() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnOprtnLbl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnOprtnLbl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getOperation().setLabel(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Oprtn_Mthd ********************************************************************************/
		if(t.getTstScrptTstActnOprtnMthd() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnOprtnMthd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnOprtnMthd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getOperation().setMethod(new org.hl7.fhir.r4.model.TestScript.TestScriptRequestMethodCodeEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Oprtn_Origin ********************************************************************************/
		if(t.getTstScrptTstActnOprtnOrigin() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnOprtnOrigin().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnOprtnOrigin().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getOperation().setOrigin(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Oprtn_Params ********************************************************************************/
		if(t.getTstScrptTstActnOprtnParams() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnOprtnParams().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnOprtnParams().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getOperation().setParams(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Oprtn_RqstHeader_Field ********************************************************************************/
		if(t.getTstScrptTstActnOprtnRqstHeaderField() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnOprtnRqstHeaderField().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnOprtnRqstHeaderField().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					String[] arrayi2 = t.getTstScrptTstActnOprtnRqstHeaderField().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(testscript.getTest().get(i0).getAction().get(i1).getOperation().getRequestHeader().size() < i2+1) { testscript.getTest().get(i0).getAction().get(i1).getOperation().addRequestHeader(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getOperation().getRequestHeader().get(i2).setField(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Oprtn_RqstHeader_Vl ********************************************************************************/
		if(t.getTstScrptTstActnOprtnRqstHeaderVl() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnOprtnRqstHeaderVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnOprtnRqstHeaderVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					String[] arrayi2 = t.getTstScrptTstActnOprtnRqstHeaderVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(testscript.getTest().get(i0).getAction().get(i1).getOperation().getRequestHeader().size() < i2+1) { testscript.getTest().get(i0).getAction().get(i1).getOperation().addRequestHeader(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getOperation().getRequestHeader().get(i2).setValue(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Oprtn_RqstId ********************************************************************************/
		if(t.getTstScrptTstActnOprtnRqstId() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnOprtnRqstId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnOprtnRqstId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getOperation().setRequestId(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Oprtn_Rsrc ********************************************************************************/
		if(t.getTstScrptTstActnOprtnRsrc() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnOprtnRsrc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnOprtnRsrc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getOperation().setResource(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Oprtn_RspsId ********************************************************************************/
		if(t.getTstScrptTstActnOprtnRspsId() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnOprtnRspsId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnOprtnRspsId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getOperation().setResponseId(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Oprtn_SrcId ********************************************************************************/
		if(t.getTstScrptTstActnOprtnSrcId() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnOprtnSrcId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnOprtnSrcId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getOperation().setSourceId(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Oprtn_TarId ********************************************************************************/
		if(t.getTstScrptTstActnOprtnTarId() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnOprtnTarId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnOprtnTarId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getOperation().setTargetId(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Oprtn_Typ_Cd ********************************************************************************/
		if(t.getTstScrptTstActnOprtnTypCd() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnOprtnTypCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnOprtnTypCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getOperation().getType().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Oprtn_Typ_Dsply ********************************************************************************/
		if(t.getTstScrptTstActnOprtnTypDsply() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnOprtnTypDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnOprtnTypDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getOperation().getType().setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Oprtn_Typ_Sys ********************************************************************************/
		if(t.getTstScrptTstActnOprtnTypSys() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnOprtnTypSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnOprtnTypSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getOperation().getType().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Oprtn_Typ_UsrSltd ********************************************************************************/
		if(t.getTstScrptTstActnOprtnTypUsrSltd() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnOprtnTypUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnOprtnTypUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getOperation().getType().setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Oprtn_Typ_Vrsn ********************************************************************************/
		if(t.getTstScrptTstActnOprtnTypVrsn() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnOprtnTypVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnOprtnTypVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getOperation().getType().setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Tst_Actn_Oprtn_Url ********************************************************************************/
		if(t.getTstScrptTstActnOprtnUrl() != null ) {

			String[] arrayi0 = t.getTstScrptTstActnOprtnUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				String[] arrayi1 = t.getTstScrptTstActnOprtnUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getTest().get(i0).getAction().size() < i1+1) { testscript.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getTest().get(i0).getAction().get(i1).getOperation().setUrl(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_Tst_Dscrptn ********************************************************************************/
		if(t.getTstScrptTstDscrptn() != null ) {

			String[] arrayi0 = t.getTstScrptTstDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getTest().get(i0).setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Tst_Nm ********************************************************************************/
		if(t.getTstScrptTstNm() != null ) {

			String[] arrayi0 = t.getTstScrptTstNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getTest().size() < i0+1) { testscript.addTest(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getTest().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Ttl ********************************************************************************/
		if(t.getTstScrptTtl() != null ) {

			if(t.getTstScrptTtl().replace("[","").replace("]","").equals("NULL") | t.getTstScrptTtl()==null) {} else {
			testscript.setTitle(t.getTstScrptTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** TstScrpt_Url ********************************************************************************/
		if(t.getTstScrptUrl() != null ) {

			if(t.getTstScrptUrl().replace("[","").replace("]","").equals("NULL") | t.getTstScrptUrl()==null) {} else {
			testscript.setUrl(t.getTstScrptUrl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** TstScrpt_UseCntxt_Cd_Cd ********************************************************************************/
		if(t.getTstScrptUseCntxtCdCd() != null ) {

			String[] arrayi0 = t.getTstScrptUseCntxtCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getUseContext().size() < i0+1) { testscript.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getUseContext().get(i0).getCode().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_UseCntxt_Cd_Dsply ********************************************************************************/
		if(t.getTstScrptUseCntxtCdDsply() != null ) {

			String[] arrayi0 = t.getTstScrptUseCntxtCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getUseContext().size() < i0+1) { testscript.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getUseContext().get(i0).getCode().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_UseCntxt_Cd_Sys ********************************************************************************/
		if(t.getTstScrptUseCntxtCdSys() != null ) {

			String[] arrayi0 = t.getTstScrptUseCntxtCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getUseContext().size() < i0+1) { testscript.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getUseContext().get(i0).getCode().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(t.getTstScrptUseCntxtCdUsrSltd() != null ) {

			String[] arrayi0 = t.getTstScrptUseCntxtCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getUseContext().size() < i0+1) { testscript.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getUseContext().get(i0).getCode().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstScrpt_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(t.getTstScrptUseCntxtCdVrsn() != null ) {

			String[] arrayi0 = t.getTstScrptUseCntxtCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getUseContext().size() < i0+1) { testscript.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getUseContext().get(i0).getCode().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(t.getTstScrptUseCntxtVlCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = t.getTstScrptUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getUseContext().size() < i0+1) { testscript.addUseContext(); }
				String[] arrayi1 = t.getTstScrptUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { testscript.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(t.getTstScrptUseCntxtVlCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = t.getTstScrptUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getUseContext().size() < i0+1) { testscript.addUseContext(); }
				String[] arrayi1 = t.getTstScrptUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { testscript.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(t.getTstScrptUseCntxtVlCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = t.getTstScrptUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getUseContext().size() < i0+1) { testscript.addUseContext(); }
				String[] arrayi1 = t.getTstScrptUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { testscript.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(t.getTstScrptUseCntxtVlCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = t.getTstScrptUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getUseContext().size() < i0+1) { testscript.addUseContext(); }
				String[] arrayi1 = t.getTstScrptUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { testscript.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** TstScrpt_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(t.getTstScrptUseCntxtVlCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = t.getTstScrptUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getUseContext().size() < i0+1) { testscript.addUseContext(); }
				String[] arrayi1 = t.getTstScrptUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testscript.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { testscript.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testscript.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstScrpt_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(t.getTstScrptUseCntxtVlCdbleCncptTxt() != null ) {

			String[] arrayi0 = t.getTstScrptUseCntxtVlCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getUseContext().size() < i0+1) { testscript.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getUseContext().get(i0).getValueCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(t.getTstScrptUseCntxtVlQntyCd() != null ) {

			String[] arrayi0 = t.getTstScrptUseCntxtVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getUseContext().size() < i0+1) { testscript.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getUseContext().get(i0).getValueQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_UseCntxt_VlQnty_Cmprtr ********************************************************************************/
		if(t.getTstScrptUseCntxtVlQntyCmprtr() != null ) {

			String[] arrayi0 = t.getTstScrptUseCntxtVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getUseContext().size() < i0+1) { testscript.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getUseContext().get(i0).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstScrpt_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(t.getTstScrptUseCntxtVlQntySys() != null ) {

			String[] arrayi0 = t.getTstScrptUseCntxtVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getUseContext().size() < i0+1) { testscript.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getUseContext().get(i0).getValueQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(t.getTstScrptUseCntxtVlQntyUnt() != null ) {

			String[] arrayi0 = t.getTstScrptUseCntxtVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getUseContext().size() < i0+1) { testscript.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getUseContext().get(i0).getValueQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(t.getTstScrptUseCntxtVlQntyVl() != null ) {

			String[] arrayi0 = t.getTstScrptUseCntxtVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getUseContext().size() < i0+1) { testscript.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getUseContext().get(i0).getValueQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** TstScrpt_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(t.getTstScrptUseCntxtVlRngHiCd() != null ) {

			String[] arrayi0 = t.getTstScrptUseCntxtVlRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getUseContext().size() < i0+1) { testscript.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getUseContext().get(i0).getValueRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_UseCntxt_VlRng_Hi_Cmprtr ********************************************************************************/
		if(t.getTstScrptUseCntxtVlRngHiCmprtr() != null ) {

			String[] arrayi0 = t.getTstScrptUseCntxtVlRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getUseContext().size() < i0+1) { testscript.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getUseContext().get(i0).getValueRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstScrpt_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(t.getTstScrptUseCntxtVlRngHiSys() != null ) {

			String[] arrayi0 = t.getTstScrptUseCntxtVlRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getUseContext().size() < i0+1) { testscript.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getUseContext().get(i0).getValueRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(t.getTstScrptUseCntxtVlRngHiUnt() != null ) {

			String[] arrayi0 = t.getTstScrptUseCntxtVlRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getUseContext().size() < i0+1) { testscript.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getUseContext().get(i0).getValueRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(t.getTstScrptUseCntxtVlRngHiVl() != null ) {

			String[] arrayi0 = t.getTstScrptUseCntxtVlRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getUseContext().size() < i0+1) { testscript.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getUseContext().get(i0).getValueRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** TstScrpt_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(t.getTstScrptUseCntxtVlRngLwCd() != null ) {

			String[] arrayi0 = t.getTstScrptUseCntxtVlRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getUseContext().size() < i0+1) { testscript.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getUseContext().get(i0).getValueRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_UseCntxt_VlRng_Lw_Cmprtr ********************************************************************************/
		if(t.getTstScrptUseCntxtVlRngLwCmprtr() != null ) {

			String[] arrayi0 = t.getTstScrptUseCntxtVlRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getUseContext().size() < i0+1) { testscript.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getUseContext().get(i0).getValueRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstScrpt_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(t.getTstScrptUseCntxtVlRngLwSys() != null ) {

			String[] arrayi0 = t.getTstScrptUseCntxtVlRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getUseContext().size() < i0+1) { testscript.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getUseContext().get(i0).getValueRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(t.getTstScrptUseCntxtVlRngLwUnt() != null ) {

			String[] arrayi0 = t.getTstScrptUseCntxtVlRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getUseContext().size() < i0+1) { testscript.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getUseContext().get(i0).getValueRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(t.getTstScrptUseCntxtVlRngLwVl() != null ) {

			String[] arrayi0 = t.getTstScrptUseCntxtVlRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getUseContext().size() < i0+1) { testscript.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getUseContext().get(i0).getValueRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** TstScrpt_UseCntxt_VlRfrnc ********************************************************************************/
		if(t.getTstScrptUseCntxtVlRfrnc() != null ) {

			String[] arrayi0 = t.getTstScrptUseCntxtVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getUseContext().size() < i0+1) { testscript.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getUseContext().get(i0).setValue(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstScrpt_Vrble_DefaultVl ********************************************************************************/
		if(t.getTstScrptVrbleDefaultVl() != null ) {

			String[] arrayi0 = t.getTstScrptVrbleDefaultVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getVariable().size() < i0+1) { testscript.addVariable(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getVariable().get(i0).setDefaultValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Vrble_Dscrptn ********************************************************************************/
		if(t.getTstScrptVrbleDscrptn() != null ) {

			String[] arrayi0 = t.getTstScrptVrbleDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getVariable().size() < i0+1) { testscript.addVariable(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getVariable().get(i0).setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Vrble_Exprsn ********************************************************************************/
		if(t.getTstScrptVrbleExprsn() != null ) {

			String[] arrayi0 = t.getTstScrptVrbleExprsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getVariable().size() < i0+1) { testscript.addVariable(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getVariable().get(i0).setExpression(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Vrble_HeaderField ********************************************************************************/
		if(t.getTstScrptVrbleHeaderField() != null ) {

			String[] arrayi0 = t.getTstScrptVrbleHeaderField().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getVariable().size() < i0+1) { testscript.addVariable(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getVariable().get(i0).setHeaderField(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Vrble_Hint ********************************************************************************/
		if(t.getTstScrptVrbleHint() != null ) {

			String[] arrayi0 = t.getTstScrptVrbleHint().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getVariable().size() < i0+1) { testscript.addVariable(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getVariable().get(i0).setHint(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Vrble_Nm ********************************************************************************/
		if(t.getTstScrptVrbleNm() != null ) {

			String[] arrayi0 = t.getTstScrptVrbleNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getVariable().size() < i0+1) { testscript.addVariable(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getVariable().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Vrble_Path ********************************************************************************/
		if(t.getTstScrptVrblePath() != null ) {

			String[] arrayi0 = t.getTstScrptVrblePath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getVariable().size() < i0+1) { testscript.addVariable(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getVariable().get(i0).setPath(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Vrble_SrcId ********************************************************************************/
		if(t.getTstScrptVrbleSrcId() != null ) {

			String[] arrayi0 = t.getTstScrptVrbleSrcId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testscript.getVariable().size() < i0+1) { testscript.addVariable(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testscript.getVariable().get(i0).setSourceId(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstScrpt_Vrsn ********************************************************************************/
		if(t.getTstScrptVrsn() != null ) {

			if(t.getTstScrptVrsn().replace("[","").replace("]","").equals("NULL") | t.getTstScrptVrsn()==null) {} else {
			testscript.setVersion(t.getTstScrptVrsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return testscript;
	}
}
