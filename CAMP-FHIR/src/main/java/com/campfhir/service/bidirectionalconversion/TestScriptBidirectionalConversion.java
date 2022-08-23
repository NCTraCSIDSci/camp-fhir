package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.TestScript;
public class TestScriptBidirectionalConversion 
{
	public TestScript TestScripts(org.hl7.fhir.r4.model.TestScript testscript) throws ParseException
	{
		 main.java.com.campfhir.model.TestScript t = new  main.java.com.campfhir.model.TestScript();

		/******************** id ********************************************************************************/
		t.setId(testscript.getIdElement().getIdPart());

		/******************** TstScrpt_Nm ********************************************************************************/
		if(testscript.hasName()) {

			t.addTstScrptNm(String.valueOf(testscript.getName()));
		} else {
			t.addTstScrptNm("NULL");
		}


		/******************** TstScrpt_Vrsn ********************************************************************************/
		if(testscript.hasVersion()) {

			t.addTstScrptVrsn(String.valueOf(testscript.getVersion()));
		} else {
			t.addTstScrptVrsn("NULL");
		}


		/******************** TstScrpt_Dt ********************************************************************************/
		if(testscript.hasDate()) {

			t.addTstScrptDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(testscript.getDate())+"\"");
		} else {
			t.addTstScrptDt("NULL");
		}


		/******************** testscriptstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus testscriptstatus = testscript.getStatus();
		if(testscriptstatus!=null) {
			t.addTstScrptSts(testscriptstatus.toCode());
		} else {
			t.addTstScrptSts("NULL");
		}

		/******************** TstScrpt_Dscrptn ********************************************************************************/
		if(testscript.hasDescription()) {

			t.addTstScrptDscrptn(String.valueOf(testscript.getDescription()));
		} else {
			t.addTstScrptDscrptn("NULL");
		}


		/******************** testscriptidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier testscriptidentifier = testscript.getIdentifier();

		/******************** TstScrpt_Id_Vl ********************************************************************************/
		if(testscriptidentifier.hasValue()) {

			t.addTstScrptIdVl(String.valueOf(testscriptidentifier.getValue()));
		} else {
			t.addTstScrptIdVl("NULL");
		}


		/******************** testscriptidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept testscriptidentifiertype = testscriptidentifier.getType();

		/******************** TstScrpt_Id_Typ_Txt ********************************************************************************/
		if(testscriptidentifiertype.hasText()) {

			t.addTstScrptIdTypTxt(String.valueOf(testscriptidentifiertype.getText()));
		} else {
			t.addTstScrptIdTypTxt("NULL");
		}


		/******************** testscriptidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> testscriptidentifiertypecodinglist = testscriptidentifiertype.getCoding();
		for(int testscriptidentifiertypecodingi = 0; testscriptidentifiertypecodingi<testscriptidentifiertypecodinglist.size();testscriptidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  testscriptidentifiertypecoding = testscriptidentifiertypecodinglist.get(testscriptidentifiertypecodingi);

		/******************** TstScrpt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(testscriptidentifiertypecodingi == 0) {t.addTstScrptIdTypCdgDsply("[");}
		if(testscriptidentifiertypecoding.hasDisplay()) {

			t.addTstScrptIdTypCdgDsply(String.valueOf(testscriptidentifiertypecoding.getDisplay()));
		} else {
			t.addTstScrptIdTypCdgDsply("NULL");
		}

		if(testscriptidentifiertypecodingi == testscriptidentifiertypecodinglist.size()-1) {t.addTstScrptIdTypCdgDsply("]");}


		/******************** TstScrpt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(testscriptidentifiertypecodingi == 0) {t.addTstScrptIdTypCdgVrsn("[");}
		if(testscriptidentifiertypecoding.hasVersion()) {

			t.addTstScrptIdTypCdgVrsn(String.valueOf(testscriptidentifiertypecoding.getVersion()));
		} else {
			t.addTstScrptIdTypCdgVrsn("NULL");
		}

		if(testscriptidentifiertypecodingi == testscriptidentifiertypecodinglist.size()-1) {t.addTstScrptIdTypCdgVrsn("]");}


		/******************** TstScrpt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(testscriptidentifiertypecodingi == 0) {t.addTstScrptIdTypCdgCd("[");}
		if(testscriptidentifiertypecoding.hasCode()) {

			t.addTstScrptIdTypCdgCd(String.valueOf(testscriptidentifiertypecoding.getCode()));
		} else {
			t.addTstScrptIdTypCdgCd("NULL");
		}

		if(testscriptidentifiertypecodingi == testscriptidentifiertypecodinglist.size()-1) {t.addTstScrptIdTypCdgCd("]");}


		/******************** TstScrpt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(testscriptidentifiertypecodingi == 0) {t.addTstScrptIdTypCdgUsrSltd("[");}
		if(testscriptidentifiertypecoding.hasUserSelected()) {

			t.addTstScrptIdTypCdgUsrSltd(String.valueOf(testscriptidentifiertypecoding.getUserSelected()));
		} else {
			t.addTstScrptIdTypCdgUsrSltd("NULL");
		}

		if(testscriptidentifiertypecodingi == testscriptidentifiertypecodinglist.size()-1) {t.addTstScrptIdTypCdgUsrSltd("]");}


		/******************** TstScrpt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(testscriptidentifiertypecodingi == 0) {t.addTstScrptIdTypCdgSys("[");}
		if(testscriptidentifiertypecoding.hasSystem()) {

			t.addTstScrptIdTypCdgSys(String.valueOf(testscriptidentifiertypecoding.getSystem()));
		} else {
			t.addTstScrptIdTypCdgSys("NULL");
		}

		if(testscriptidentifiertypecodingi == testscriptidentifiertypecodinglist.size()-1) {t.addTstScrptIdTypCdgSys("]");}


		 };
		/******************** testscriptidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period testscriptidentifierperiod = testscriptidentifier.getPeriod();

		/******************** TstScrpt_Id_Prd_Strt ********************************************************************************/
		if(testscriptidentifierperiod.hasStart()) {

			t.addTstScrptIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(testscriptidentifierperiod.getStart())+"\"");
		} else {
			t.addTstScrptIdPrdStrt("NULL");
		}


		/******************** TstScrpt_Id_Prd_End ********************************************************************************/
		if(testscriptidentifierperiod.hasEnd()) {

			t.addTstScrptIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(testscriptidentifierperiod.getEnd())+"\"");
		} else {
			t.addTstScrptIdPrdEnd("NULL");
		}


		/******************** testscriptidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse testscriptidentifieruse = testscriptidentifier.getUse();
		if(testscriptidentifieruse!=null) {
			t.addTstScrptIdUse(testscriptidentifieruse.toCode());
		} else {
			t.addTstScrptIdUse("NULL");
		}

		/******************** TstScrpt_Id_Assigner ********************************************************************************/
		if(testscriptidentifier.hasAssigner()) {

			if(testscriptidentifier.getAssigner().getReference() != null) {
			t.addTstScrptIdAssigner(testscriptidentifier.getAssigner().getReference());
			}
		} else {
			t.addTstScrptIdAssigner("NULL");
		}


		/******************** TstScrpt_Id_Sys ********************************************************************************/
		if(testscriptidentifier.hasSystem()) {

			t.addTstScrptIdSys(String.valueOf(testscriptidentifier.getSystem()));
		} else {
			t.addTstScrptIdSys("NULL");
		}


		/******************** testscriptcontact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> testscriptcontactlist = testscript.getContact();
		for(int testscriptcontacti = 0; testscriptcontacti<testscriptcontactlist.size();testscriptcontacti++ ) {
		org.hl7.fhir.r4.model.ContactDetail  testscriptcontact = testscriptcontactlist.get(testscriptcontacti);

		/******************** TstScrpt_Cntct_Nm ********************************************************************************/
		if(testscriptcontacti == 0) {t.addTstScrptCntctNm("[");}
		if(testscriptcontact.hasName()) {

			t.addTstScrptCntctNm(String.valueOf(testscriptcontact.getName()));
		} else {
			t.addTstScrptCntctNm("NULL");
		}

		if(testscriptcontacti == testscriptcontactlist.size()-1) {t.addTstScrptCntctNm("]");}


		/******************** testscriptcontacttelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> testscriptcontacttelecomlist = testscriptcontact.getTelecom();
		for(int testscriptcontacttelecomi = 0; testscriptcontacttelecomi<testscriptcontacttelecomlist.size();testscriptcontacttelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  testscriptcontacttelecom = testscriptcontacttelecomlist.get(testscriptcontacttelecomi);

		/******************** TstScrpt_Cntct_Tlcm_Vl ********************************************************************************/
		if(testscriptcontacttelecomi == 0) {t.addTstScrptCntctTlcmVl("[[");}
		if(testscriptcontacttelecom.hasValue()) {

			t.addTstScrptCntctTlcmVl(String.valueOf(testscriptcontacttelecom.getValue()));
		} else {
			t.addTstScrptCntctTlcmVl("NULL");
		}

		if(testscriptcontacttelecomi == testscriptcontacttelecomlist.size()-1) {t.addTstScrptCntctTlcmVl("]]");}


		/******************** testscriptcontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period testscriptcontacttelecomperiod = testscriptcontacttelecom.getPeriod();

		/******************** TstScrpt_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(testscriptcontacttelecomi == 0) {t.addTstScrptCntctTlcmPrdStrt("[[");}
		if(testscriptcontacttelecomperiod.hasStart()) {

			t.addTstScrptCntctTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(testscriptcontacttelecomperiod.getStart())+"\"");
		} else {
			t.addTstScrptCntctTlcmPrdStrt("NULL");
		}

		if(testscriptcontacttelecomi == testscriptcontacttelecomlist.size()-1) {t.addTstScrptCntctTlcmPrdStrt("]]");}


		/******************** TstScrpt_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(testscriptcontacttelecomi == 0) {t.addTstScrptCntctTlcmPrdEnd("[[");}
		if(testscriptcontacttelecomperiod.hasEnd()) {

			t.addTstScrptCntctTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(testscriptcontacttelecomperiod.getEnd())+"\"");
		} else {
			t.addTstScrptCntctTlcmPrdEnd("NULL");
		}

		if(testscriptcontacttelecomi == testscriptcontacttelecomlist.size()-1) {t.addTstScrptCntctTlcmPrdEnd("]]");}


		/******************** testscriptcontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse testscriptcontacttelecomuse = testscriptcontacttelecom.getUse();
		if(testscriptcontacttelecomuse!=null) {
		if(testscriptcontacttelecomi == 0) {

		t.addTstScrptCntctTlcmUse("[[");		}
			t.addTstScrptCntctTlcmUse(testscriptcontacttelecomuse.toCode());
		if(testscriptcontacttelecomi == testscriptcontacttelecomlist.size()-1) {

		t.addTstScrptCntctTlcmUse("]]");		}

		} else {
			t.addTstScrptCntctTlcmUse("NULL");
		}

		/******************** testscriptcontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem testscriptcontacttelecomsystem = testscriptcontacttelecom.getSystem();
		if(testscriptcontacttelecomsystem!=null) {
		if(testscriptcontacttelecomi == 0) {

		t.addTstScrptCntctTlcmSys("[[");		}
			t.addTstScrptCntctTlcmSys(testscriptcontacttelecomsystem.toCode());
		if(testscriptcontacttelecomi == testscriptcontacttelecomlist.size()-1) {

		t.addTstScrptCntctTlcmSys("]]");		}

		} else {
			t.addTstScrptCntctTlcmSys("NULL");
		}

		/******************** TstScrpt_Cntct_Tlcm_Rnk ********************************************************************************/
		if(testscriptcontacttelecomi == 0) {t.addTstScrptCntctTlcmRnk("[[");}
		if(testscriptcontacttelecom.hasRank()) {

			t.addTstScrptCntctTlcmRnk(String.valueOf(testscriptcontacttelecom.getRank()));
		} else {
			t.addTstScrptCntctTlcmRnk("NULL");
		}

		if(testscriptcontacttelecomi == testscriptcontacttelecomlist.size()-1) {t.addTstScrptCntctTlcmRnk("]]");}


		 };
		 };
		/******************** testscriptorigin ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.TestScript.TestScriptOriginComponent> testscriptoriginlist = testscript.getOrigin();
		for(int testscriptorigini = 0; testscriptorigini<testscriptoriginlist.size();testscriptorigini++ ) {
		org.hl7.fhir.r4.model.TestScript.TestScriptOriginComponent  testscriptorigin = testscriptoriginlist.get(testscriptorigini);

		/******************** TstScrpt_Origin_Index ********************************************************************************/
		if(testscriptorigini == 0) {t.addTstScrptOriginIndex("[");}
		if(testscriptorigin.hasIndex()) {

			t.addTstScrptOriginIndex(String.valueOf(testscriptorigin.getIndex()));
		} else {
			t.addTstScrptOriginIndex("NULL");
		}

		if(testscriptorigini == testscriptoriginlist.size()-1) {t.addTstScrptOriginIndex("]");}


		/******************** testscriptoriginprofile ********************************************************************************/
		org.hl7.fhir.r4.model.Coding testscriptoriginprofile = testscriptorigin.getProfile();

		/******************** TstScrpt_Origin_Profile_Dsply ********************************************************************************/
		if(testscriptorigini == 0) {t.addTstScrptOriginProfileDsply("[");}
		if(testscriptoriginprofile.hasDisplay()) {

			t.addTstScrptOriginProfileDsply(String.valueOf(testscriptoriginprofile.getDisplay()));
		} else {
			t.addTstScrptOriginProfileDsply("NULL");
		}

		if(testscriptorigini == testscriptoriginlist.size()-1) {t.addTstScrptOriginProfileDsply("]");}


		/******************** TstScrpt_Origin_Profile_Vrsn ********************************************************************************/
		if(testscriptorigini == 0) {t.addTstScrptOriginProfileVrsn("[");}
		if(testscriptoriginprofile.hasVersion()) {

			t.addTstScrptOriginProfileVrsn(String.valueOf(testscriptoriginprofile.getVersion()));
		} else {
			t.addTstScrptOriginProfileVrsn("NULL");
		}

		if(testscriptorigini == testscriptoriginlist.size()-1) {t.addTstScrptOriginProfileVrsn("]");}


		/******************** TstScrpt_Origin_Profile_Cd ********************************************************************************/
		if(testscriptorigini == 0) {t.addTstScrptOriginProfileCd("[");}
		if(testscriptoriginprofile.hasCode()) {

			t.addTstScrptOriginProfileCd(String.valueOf(testscriptoriginprofile.getCode()));
		} else {
			t.addTstScrptOriginProfileCd("NULL");
		}

		if(testscriptorigini == testscriptoriginlist.size()-1) {t.addTstScrptOriginProfileCd("]");}


		/******************** TstScrpt_Origin_Profile_UsrSltd ********************************************************************************/
		if(testscriptorigini == 0) {t.addTstScrptOriginProfileUsrSltd("[");}
		if(testscriptoriginprofile.hasUserSelected()) {

			t.addTstScrptOriginProfileUsrSltd(String.valueOf(testscriptoriginprofile.getUserSelected()));
		} else {
			t.addTstScrptOriginProfileUsrSltd("NULL");
		}

		if(testscriptorigini == testscriptoriginlist.size()-1) {t.addTstScrptOriginProfileUsrSltd("]");}


		/******************** TstScrpt_Origin_Profile_Sys ********************************************************************************/
		if(testscriptorigini == 0) {t.addTstScrptOriginProfileSys("[");}
		if(testscriptoriginprofile.hasSystem()) {

			t.addTstScrptOriginProfileSys(String.valueOf(testscriptoriginprofile.getSystem()));
		} else {
			t.addTstScrptOriginProfileSys("NULL");
		}

		if(testscriptorigini == testscriptoriginlist.size()-1) {t.addTstScrptOriginProfileSys("]");}


		 };
		/******************** testscriptfixture ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.TestScript.TestScriptFixtureComponent> testscriptfixturelist = testscript.getFixture();
		for(int testscriptfixturei = 0; testscriptfixturei<testscriptfixturelist.size();testscriptfixturei++ ) {
		org.hl7.fhir.r4.model.TestScript.TestScriptFixtureComponent  testscriptfixture = testscriptfixturelist.get(testscriptfixturei);

		/******************** TstScrpt_Fixture_Rsrc ********************************************************************************/
		if(testscriptfixturei == 0) {t.addTstScrptFixtureRsrc("[");}
		if(testscriptfixture.hasResource()) {

			if(testscriptfixture.getResource().getReference() != null) {
			t.addTstScrptFixtureRsrc(testscriptfixture.getResource().getReference());
			}
		} else {
			t.addTstScrptFixtureRsrc("NULL");
		}

		if(testscriptfixturei == testscriptfixturelist.size()-1) {t.addTstScrptFixtureRsrc("]");}


		/******************** TstScrpt_Fixture_Autodelete ********************************************************************************/
		if(testscriptfixturei == 0) {t.addTstScrptFixtureAutodelete("[");}
		if(testscriptfixture.hasAutodelete()) {

			t.addTstScrptFixtureAutodelete(String.valueOf(testscriptfixture.getAutodelete()));
		} else {
			t.addTstScrptFixtureAutodelete("NULL");
		}

		if(testscriptfixturei == testscriptfixturelist.size()-1) {t.addTstScrptFixtureAutodelete("]");}


		/******************** TstScrpt_Fixture_Autocreate ********************************************************************************/
		if(testscriptfixturei == 0) {t.addTstScrptFixtureAutocreate("[");}
		if(testscriptfixture.hasAutocreate()) {

			t.addTstScrptFixtureAutocreate(String.valueOf(testscriptfixture.getAutocreate()));
		} else {
			t.addTstScrptFixtureAutocreate("NULL");
		}

		if(testscriptfixturei == testscriptfixturelist.size()-1) {t.addTstScrptFixtureAutocreate("]");}


		 };
		/******************** testscriptmetadata ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptMetadataComponent testscriptmetadata = testscript.getMetadata();

		/******************** testscriptmetadatacapability ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.TestScript.TestScriptMetadataCapabilityComponent> testscriptmetadatacapabilitylist = testscriptmetadata.getCapability();
		for(int testscriptmetadatacapabilityi = 0; testscriptmetadatacapabilityi<testscriptmetadatacapabilitylist.size();testscriptmetadatacapabilityi++ ) {
		org.hl7.fhir.r4.model.TestScript.TestScriptMetadataCapabilityComponent  testscriptmetadatacapability = testscriptmetadatacapabilitylist.get(testscriptmetadatacapabilityi);

		/******************** TstScrpt_Metadata_Capblty_Dscrptn ********************************************************************************/
		if(testscriptmetadatacapabilityi == 0) {t.addTstScrptMetadataCapbltyDscrptn("[");}
		if(testscriptmetadatacapability.hasDescription()) {

			t.addTstScrptMetadataCapbltyDscrptn(String.valueOf(testscriptmetadatacapability.getDescription()));
		} else {
			t.addTstScrptMetadataCapbltyDscrptn("NULL");
		}

		if(testscriptmetadatacapabilityi == testscriptmetadatacapabilitylist.size()-1) {t.addTstScrptMetadataCapbltyDscrptn("]");}


		/******************** TstScrpt_Metadata_Capblty_Origin ********************************************************************************/
		if(testscriptmetadatacapabilityi == 0) {t.addTstScrptMetadataCapbltyOrigin("[");}
		if(testscriptmetadatacapability.hasOrigin()) {

			String  array = "[";
			for(int incr=0; incr<testscriptmetadatacapability.getOrigin().size(); incr++) {
				array = array + testscriptmetadatacapability.getOrigin().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			t.addTstScrptMetadataCapbltyOrigin(array);

		} else {
			t.addTstScrptMetadataCapbltyOrigin("NULL");
		}

		if(testscriptmetadatacapabilityi == testscriptmetadatacapabilitylist.size()-1) {t.addTstScrptMetadataCapbltyOrigin("]");}


		/******************** TstScrpt_Metadata_Capblty_Link ********************************************************************************/
		if(testscriptmetadatacapabilityi == 0) {t.addTstScrptMetadataCapbltyLink("[");}
		if(testscriptmetadatacapability.hasLink()) {

			String  array = "[";
			for(int incr=0; incr<testscriptmetadatacapability.getLink().size(); incr++) {
				array = array + testscriptmetadatacapability.getLink().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			t.addTstScrptMetadataCapbltyLink(array);

		} else {
			t.addTstScrptMetadataCapbltyLink("NULL");
		}

		if(testscriptmetadatacapabilityi == testscriptmetadatacapabilitylist.size()-1) {t.addTstScrptMetadataCapbltyLink("]");}


		/******************** TstScrpt_Metadata_Capblty_Required ********************************************************************************/
		if(testscriptmetadatacapabilityi == 0) {t.addTstScrptMetadataCapbltyRequired("[");}
		if(testscriptmetadatacapability.hasRequired()) {

			t.addTstScrptMetadataCapbltyRequired(String.valueOf(testscriptmetadatacapability.getRequired()));
		} else {
			t.addTstScrptMetadataCapbltyRequired("NULL");
		}

		if(testscriptmetadatacapabilityi == testscriptmetadatacapabilitylist.size()-1) {t.addTstScrptMetadataCapbltyRequired("]");}


		/******************** TstScrpt_Metadata_Capblty_Cpnlties ********************************************************************************/
		if(testscriptmetadatacapabilityi == 0) {t.addTstScrptMetadataCapbltyCpnlties("[");}
		if(testscriptmetadatacapability.hasCapabilities()) {

			t.addTstScrptMetadataCapbltyCpnlties(String.valueOf(testscriptmetadatacapability.getCapabilities()));
		} else {
			t.addTstScrptMetadataCapbltyCpnlties("NULL");
		}

		if(testscriptmetadatacapabilityi == testscriptmetadatacapabilitylist.size()-1) {t.addTstScrptMetadataCapbltyCpnlties("]");}


		/******************** TstScrpt_Metadata_Capblty_Validated ********************************************************************************/
		if(testscriptmetadatacapabilityi == 0) {t.addTstScrptMetadataCapbltyValidated("[");}
		if(testscriptmetadatacapability.hasValidated()) {

			t.addTstScrptMetadataCapbltyValidated(String.valueOf(testscriptmetadatacapability.getValidated()));
		} else {
			t.addTstScrptMetadataCapbltyValidated("NULL");
		}

		if(testscriptmetadatacapabilityi == testscriptmetadatacapabilitylist.size()-1) {t.addTstScrptMetadataCapbltyValidated("]");}


		/******************** TstScrpt_Metadata_Capblty_Destination ********************************************************************************/
		if(testscriptmetadatacapabilityi == 0) {t.addTstScrptMetadataCapbltyDestination("[");}
		if(testscriptmetadatacapability.hasDestination()) {

			t.addTstScrptMetadataCapbltyDestination(String.valueOf(testscriptmetadatacapability.getDestination()));
		} else {
			t.addTstScrptMetadataCapbltyDestination("NULL");
		}

		if(testscriptmetadatacapabilityi == testscriptmetadatacapabilitylist.size()-1) {t.addTstScrptMetadataCapbltyDestination("]");}


		 };
		/******************** testscriptmetadatalink ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.TestScript.TestScriptMetadataLinkComponent> testscriptmetadatalinklist = testscriptmetadata.getLink();
		for(int testscriptmetadatalinki = 0; testscriptmetadatalinki<testscriptmetadatalinklist.size();testscriptmetadatalinki++ ) {
		org.hl7.fhir.r4.model.TestScript.TestScriptMetadataLinkComponent  testscriptmetadatalink = testscriptmetadatalinklist.get(testscriptmetadatalinki);

		/******************** TstScrpt_Metadata_Link_Dscrptn ********************************************************************************/
		if(testscriptmetadatalinki == 0) {t.addTstScrptMetadataLinkDscrptn("[");}
		if(testscriptmetadatalink.hasDescription()) {

			t.addTstScrptMetadataLinkDscrptn(String.valueOf(testscriptmetadatalink.getDescription()));
		} else {
			t.addTstScrptMetadataLinkDscrptn("NULL");
		}

		if(testscriptmetadatalinki == testscriptmetadatalinklist.size()-1) {t.addTstScrptMetadataLinkDscrptn("]");}


		/******************** TstScrpt_Metadata_Link_Url ********************************************************************************/
		if(testscriptmetadatalinki == 0) {t.addTstScrptMetadataLinkUrl("[");}
		if(testscriptmetadatalink.hasUrl()) {

			t.addTstScrptMetadataLinkUrl(String.valueOf(testscriptmetadatalink.getUrl()));
		} else {
			t.addTstScrptMetadataLinkUrl("NULL");
		}

		if(testscriptmetadatalinki == testscriptmetadatalinklist.size()-1) {t.addTstScrptMetadataLinkUrl("]");}


		 };
		/******************** testscriptvariable ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.TestScript.TestScriptVariableComponent> testscriptvariablelist = testscript.getVariable();
		for(int testscriptvariablei = 0; testscriptvariablei<testscriptvariablelist.size();testscriptvariablei++ ) {
		org.hl7.fhir.r4.model.TestScript.TestScriptVariableComponent  testscriptvariable = testscriptvariablelist.get(testscriptvariablei);

		/******************** TstScrpt_Vrble_Nm ********************************************************************************/
		if(testscriptvariablei == 0) {t.addTstScrptVrbleNm("[");}
		if(testscriptvariable.hasName()) {

			t.addTstScrptVrbleNm(String.valueOf(testscriptvariable.getName()));
		} else {
			t.addTstScrptVrbleNm("NULL");
		}

		if(testscriptvariablei == testscriptvariablelist.size()-1) {t.addTstScrptVrbleNm("]");}


		/******************** TstScrpt_Vrble_DefaultVl ********************************************************************************/
		if(testscriptvariablei == 0) {t.addTstScrptVrbleDefaultVl("[");}
		if(testscriptvariable.hasDefaultValue()) {

			t.addTstScrptVrbleDefaultVl(String.valueOf(testscriptvariable.getDefaultValue()));
		} else {
			t.addTstScrptVrbleDefaultVl("NULL");
		}

		if(testscriptvariablei == testscriptvariablelist.size()-1) {t.addTstScrptVrbleDefaultVl("]");}


		/******************** TstScrpt_Vrble_Path ********************************************************************************/
		if(testscriptvariablei == 0) {t.addTstScrptVrblePath("[");}
		if(testscriptvariable.hasPath()) {

			t.addTstScrptVrblePath(String.valueOf(testscriptvariable.getPath()));
		} else {
			t.addTstScrptVrblePath("NULL");
		}

		if(testscriptvariablei == testscriptvariablelist.size()-1) {t.addTstScrptVrblePath("]");}


		/******************** TstScrpt_Vrble_HeaderField ********************************************************************************/
		if(testscriptvariablei == 0) {t.addTstScrptVrbleHeaderField("[");}
		if(testscriptvariable.hasHeaderField()) {

			t.addTstScrptVrbleHeaderField(String.valueOf(testscriptvariable.getHeaderField()));
		} else {
			t.addTstScrptVrbleHeaderField("NULL");
		}

		if(testscriptvariablei == testscriptvariablelist.size()-1) {t.addTstScrptVrbleHeaderField("]");}


		/******************** TstScrpt_Vrble_Dscrptn ********************************************************************************/
		if(testscriptvariablei == 0) {t.addTstScrptVrbleDscrptn("[");}
		if(testscriptvariable.hasDescription()) {

			t.addTstScrptVrbleDscrptn(String.valueOf(testscriptvariable.getDescription()));
		} else {
			t.addTstScrptVrbleDscrptn("NULL");
		}

		if(testscriptvariablei == testscriptvariablelist.size()-1) {t.addTstScrptVrbleDscrptn("]");}


		/******************** TstScrpt_Vrble_Exprsn ********************************************************************************/
		if(testscriptvariablei == 0) {t.addTstScrptVrbleExprsn("[");}
		if(testscriptvariable.hasExpression()) {

			t.addTstScrptVrbleExprsn(String.valueOf(testscriptvariable.getExpression()));
		} else {
			t.addTstScrptVrbleExprsn("NULL");
		}

		if(testscriptvariablei == testscriptvariablelist.size()-1) {t.addTstScrptVrbleExprsn("]");}


		/******************** TstScrpt_Vrble_Hint ********************************************************************************/
		if(testscriptvariablei == 0) {t.addTstScrptVrbleHint("[");}
		if(testscriptvariable.hasHint()) {

			t.addTstScrptVrbleHint(String.valueOf(testscriptvariable.getHint()));
		} else {
			t.addTstScrptVrbleHint("NULL");
		}

		if(testscriptvariablei == testscriptvariablelist.size()-1) {t.addTstScrptVrbleHint("]");}


		/******************** TstScrpt_Vrble_SrcId ********************************************************************************/
		if(testscriptvariablei == 0) {t.addTstScrptVrbleSrcId("[");}
		if(testscriptvariable.hasSourceId()) {

			t.addTstScrptVrbleSrcId(String.valueOf(testscriptvariable.getSourceId()));
		} else {
			t.addTstScrptVrbleSrcId("NULL");
		}

		if(testscriptvariablei == testscriptvariablelist.size()-1) {t.addTstScrptVrbleSrcId("]");}


		 };
		/******************** testscriptsetup ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptSetupComponent testscriptsetup = testscript.getSetup();

		/******************** testscriptsetupaction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.TestScript.SetupActionComponent> testscriptsetupactionlist = testscriptsetup.getAction();
		for(int testscriptsetupactioni = 0; testscriptsetupactioni<testscriptsetupactionlist.size();testscriptsetupactioni++ ) {
		org.hl7.fhir.r4.model.TestScript.SetupActionComponent  testscriptsetupaction = testscriptsetupactionlist.get(testscriptsetupactioni);

		/******************** testscriptsetupactionoperation ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.SetupActionOperationComponent testscriptsetupactionoperation = testscriptsetupaction.getOperation();

		/******************** TstScrpt_Stup_Actn_Oprtn_Rsrc ********************************************************************************/
		if(testscriptsetupactioni == 0) {t.addTstScrptStupActnOprtnRsrc("[");}
		if(testscriptsetupactionoperation.hasResource()) {

			t.addTstScrptStupActnOprtnRsrc(String.valueOf(testscriptsetupactionoperation.getResource()));
		} else {
			t.addTstScrptStupActnOprtnRsrc("NULL");
		}

		if(testscriptsetupactioni == testscriptsetupactionlist.size()-1) {t.addTstScrptStupActnOprtnRsrc("]");}


		/******************** testscriptsetupactionoperationmethod ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptRequestMethodCode testscriptsetupactionoperationmethod = testscriptsetupactionoperation.getMethod();
		if(testscriptsetupactionoperationmethod!=null) {
		if(testscriptsetupactioni == 0) {

		t.addTstScrptStupActnOprtnMthd("[");		}
			t.addTstScrptStupActnOprtnMthd(testscriptsetupactionoperationmethod.toCode());
		if(testscriptsetupactioni == testscriptsetupactionlist.size()-1) {

		t.addTstScrptStupActnOprtnMthd("]");		}

		} else {
			t.addTstScrptStupActnOprtnMthd("NULL");
		}

		/******************** testscriptsetupactionoperationtype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding testscriptsetupactionoperationtype = testscriptsetupactionoperation.getType();

		/******************** TstScrpt_Stup_Actn_Oprtn_Typ_Dsply ********************************************************************************/
		if(testscriptsetupactioni == 0) {t.addTstScrptStupActnOprtnTypDsply("[");}
		if(testscriptsetupactionoperationtype.hasDisplay()) {

			t.addTstScrptStupActnOprtnTypDsply(String.valueOf(testscriptsetupactionoperationtype.getDisplay()));
		} else {
			t.addTstScrptStupActnOprtnTypDsply("NULL");
		}

		if(testscriptsetupactioni == testscriptsetupactionlist.size()-1) {t.addTstScrptStupActnOprtnTypDsply("]");}


		/******************** TstScrpt_Stup_Actn_Oprtn_Typ_Vrsn ********************************************************************************/
		if(testscriptsetupactioni == 0) {t.addTstScrptStupActnOprtnTypVrsn("[");}
		if(testscriptsetupactionoperationtype.hasVersion()) {

			t.addTstScrptStupActnOprtnTypVrsn(String.valueOf(testscriptsetupactionoperationtype.getVersion()));
		} else {
			t.addTstScrptStupActnOprtnTypVrsn("NULL");
		}

		if(testscriptsetupactioni == testscriptsetupactionlist.size()-1) {t.addTstScrptStupActnOprtnTypVrsn("]");}


		/******************** TstScrpt_Stup_Actn_Oprtn_Typ_Cd ********************************************************************************/
		if(testscriptsetupactioni == 0) {t.addTstScrptStupActnOprtnTypCd("[");}
		if(testscriptsetupactionoperationtype.hasCode()) {

			t.addTstScrptStupActnOprtnTypCd(String.valueOf(testscriptsetupactionoperationtype.getCode()));
		} else {
			t.addTstScrptStupActnOprtnTypCd("NULL");
		}

		if(testscriptsetupactioni == testscriptsetupactionlist.size()-1) {t.addTstScrptStupActnOprtnTypCd("]");}


		/******************** TstScrpt_Stup_Actn_Oprtn_Typ_UsrSltd ********************************************************************************/
		if(testscriptsetupactioni == 0) {t.addTstScrptStupActnOprtnTypUsrSltd("[");}
		if(testscriptsetupactionoperationtype.hasUserSelected()) {

			t.addTstScrptStupActnOprtnTypUsrSltd(String.valueOf(testscriptsetupactionoperationtype.getUserSelected()));
		} else {
			t.addTstScrptStupActnOprtnTypUsrSltd("NULL");
		}

		if(testscriptsetupactioni == testscriptsetupactionlist.size()-1) {t.addTstScrptStupActnOprtnTypUsrSltd("]");}


		/******************** TstScrpt_Stup_Actn_Oprtn_Typ_Sys ********************************************************************************/
		if(testscriptsetupactioni == 0) {t.addTstScrptStupActnOprtnTypSys("[");}
		if(testscriptsetupactionoperationtype.hasSystem()) {

			t.addTstScrptStupActnOprtnTypSys(String.valueOf(testscriptsetupactionoperationtype.getSystem()));
		} else {
			t.addTstScrptStupActnOprtnTypSys("NULL");
		}

		if(testscriptsetupactioni == testscriptsetupactionlist.size()-1) {t.addTstScrptStupActnOprtnTypSys("]");}


		/******************** TstScrpt_Stup_Actn_Oprtn_CntntTyp ********************************************************************************/
		if(testscriptsetupactioni == 0) {t.addTstScrptStupActnOprtnCntntTyp("[");}
		if(testscriptsetupactionoperation.hasContentType()) {

			t.addTstScrptStupActnOprtnCntntTyp(String.valueOf(testscriptsetupactionoperation.getContentType()));
		} else {
			t.addTstScrptStupActnOprtnCntntTyp("NULL");
		}

		if(testscriptsetupactioni == testscriptsetupactionlist.size()-1) {t.addTstScrptStupActnOprtnCntntTyp("]");}


		/******************** TstScrpt_Stup_Actn_Oprtn_Dscrptn ********************************************************************************/
		if(testscriptsetupactioni == 0) {t.addTstScrptStupActnOprtnDscrptn("[");}
		if(testscriptsetupactionoperation.hasDescription()) {

			t.addTstScrptStupActnOprtnDscrptn(String.valueOf(testscriptsetupactionoperation.getDescription()));
		} else {
			t.addTstScrptStupActnOprtnDscrptn("NULL");
		}

		if(testscriptsetupactioni == testscriptsetupactionlist.size()-1) {t.addTstScrptStupActnOprtnDscrptn("]");}


		/******************** TstScrpt_Stup_Actn_Oprtn_EncodeRqstUrl ********************************************************************************/
		if(testscriptsetupactioni == 0) {t.addTstScrptStupActnOprtnEncodeRqstUrl("[");}
		if(testscriptsetupactionoperation.hasEncodeRequestUrl()) {

			t.addTstScrptStupActnOprtnEncodeRqstUrl(String.valueOf(testscriptsetupactionoperation.getEncodeRequestUrl()));
		} else {
			t.addTstScrptStupActnOprtnEncodeRqstUrl("NULL");
		}

		if(testscriptsetupactioni == testscriptsetupactionlist.size()-1) {t.addTstScrptStupActnOprtnEncodeRqstUrl("]");}


		/******************** TstScrpt_Stup_Actn_Oprtn_Origin ********************************************************************************/
		if(testscriptsetupactioni == 0) {t.addTstScrptStupActnOprtnOrigin("[");}
		if(testscriptsetupactionoperation.hasOrigin()) {

			t.addTstScrptStupActnOprtnOrigin(String.valueOf(testscriptsetupactionoperation.getOrigin()));
		} else {
			t.addTstScrptStupActnOprtnOrigin("NULL");
		}

		if(testscriptsetupactioni == testscriptsetupactionlist.size()-1) {t.addTstScrptStupActnOprtnOrigin("]");}


		/******************** TstScrpt_Stup_Actn_Oprtn_Url ********************************************************************************/
		if(testscriptsetupactioni == 0) {t.addTstScrptStupActnOprtnUrl("[");}
		if(testscriptsetupactionoperation.hasUrl()) {

			t.addTstScrptStupActnOprtnUrl(String.valueOf(testscriptsetupactionoperation.getUrl()));
		} else {
			t.addTstScrptStupActnOprtnUrl("NULL");
		}

		if(testscriptsetupactioni == testscriptsetupactionlist.size()-1) {t.addTstScrptStupActnOprtnUrl("]");}


		/******************** TstScrpt_Stup_Actn_Oprtn_Accept ********************************************************************************/
		if(testscriptsetupactioni == 0) {t.addTstScrptStupActnOprtnAccept("[");}
		if(testscriptsetupactionoperation.hasAccept()) {

			t.addTstScrptStupActnOprtnAccept(String.valueOf(testscriptsetupactionoperation.getAccept()));
		} else {
			t.addTstScrptStupActnOprtnAccept("NULL");
		}

		if(testscriptsetupactioni == testscriptsetupactionlist.size()-1) {t.addTstScrptStupActnOprtnAccept("]");}


		/******************** testscriptsetupactionoperationrequestheader ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.TestScript.SetupActionOperationRequestHeaderComponent> testscriptsetupactionoperationrequestheaderlist = testscriptsetupactionoperation.getRequestHeader();
		for(int testscriptsetupactionoperationrequestheaderi = 0; testscriptsetupactionoperationrequestheaderi<testscriptsetupactionoperationrequestheaderlist.size();testscriptsetupactionoperationrequestheaderi++ ) {
		org.hl7.fhir.r4.model.TestScript.SetupActionOperationRequestHeaderComponent  testscriptsetupactionoperationrequestheader = testscriptsetupactionoperationrequestheaderlist.get(testscriptsetupactionoperationrequestheaderi);

		/******************** TstScrpt_Stup_Actn_Oprtn_RqstHeader_Vl ********************************************************************************/
		if(testscriptsetupactionoperationrequestheaderi == 0) {t.addTstScrptStupActnOprtnRqstHeaderVl("[[");}
		if(testscriptsetupactionoperationrequestheader.hasValue()) {

			t.addTstScrptStupActnOprtnRqstHeaderVl(String.valueOf(testscriptsetupactionoperationrequestheader.getValue()));
		} else {
			t.addTstScrptStupActnOprtnRqstHeaderVl("NULL");
		}

		if(testscriptsetupactionoperationrequestheaderi == testscriptsetupactionoperationrequestheaderlist.size()-1) {t.addTstScrptStupActnOprtnRqstHeaderVl("]]");}


		/******************** TstScrpt_Stup_Actn_Oprtn_RqstHeader_Field ********************************************************************************/
		if(testscriptsetupactionoperationrequestheaderi == 0) {t.addTstScrptStupActnOprtnRqstHeaderField("[[");}
		if(testscriptsetupactionoperationrequestheader.hasField()) {

			t.addTstScrptStupActnOprtnRqstHeaderField(String.valueOf(testscriptsetupactionoperationrequestheader.getField()));
		} else {
			t.addTstScrptStupActnOprtnRqstHeaderField("NULL");
		}

		if(testscriptsetupactionoperationrequestheaderi == testscriptsetupactionoperationrequestheaderlist.size()-1) {t.addTstScrptStupActnOprtnRqstHeaderField("]]");}


		 };
		/******************** TstScrpt_Stup_Actn_Oprtn_RqstId ********************************************************************************/
		if(testscriptsetupactionoperation.hasRequestId()) {

			t.addTstScrptStupActnOprtnRqstId(String.valueOf(testscriptsetupactionoperation.getRequestId()));
		} else {
			t.addTstScrptStupActnOprtnRqstId("NULL");
		}


		/******************** TstScrpt_Stup_Actn_Oprtn_TarId ********************************************************************************/
		if(testscriptsetupactionoperation.hasTargetId()) {

			t.addTstScrptStupActnOprtnTarId(String.valueOf(testscriptsetupactionoperation.getTargetId()));
		} else {
			t.addTstScrptStupActnOprtnTarId("NULL");
		}


		/******************** TstScrpt_Stup_Actn_Oprtn_Params ********************************************************************************/
		if(testscriptsetupactionoperation.hasParams()) {

			t.addTstScrptStupActnOprtnParams(String.valueOf(testscriptsetupactionoperation.getParams()));
		} else {
			t.addTstScrptStupActnOprtnParams("NULL");
		}


		/******************** TstScrpt_Stup_Actn_Oprtn_RspsId ********************************************************************************/
		if(testscriptsetupactionoperation.hasResponseId()) {

			t.addTstScrptStupActnOprtnRspsId(String.valueOf(testscriptsetupactionoperation.getResponseId()));
		} else {
			t.addTstScrptStupActnOprtnRspsId("NULL");
		}


		/******************** TstScrpt_Stup_Actn_Oprtn_SrcId ********************************************************************************/
		if(testscriptsetupactionoperation.hasSourceId()) {

			t.addTstScrptStupActnOprtnSrcId(String.valueOf(testscriptsetupactionoperation.getSourceId()));
		} else {
			t.addTstScrptStupActnOprtnSrcId("NULL");
		}


		/******************** TstScrpt_Stup_Actn_Oprtn_Lbl ********************************************************************************/
		if(testscriptsetupactionoperation.hasLabel()) {

			t.addTstScrptStupActnOprtnLbl(String.valueOf(testscriptsetupactionoperation.getLabel()));
		} else {
			t.addTstScrptStupActnOprtnLbl("NULL");
		}


		/******************** TstScrpt_Stup_Actn_Oprtn_Destination ********************************************************************************/
		if(testscriptsetupactionoperation.hasDestination()) {

			t.addTstScrptStupActnOprtnDestination(String.valueOf(testscriptsetupactionoperation.getDestination()));
		} else {
			t.addTstScrptStupActnOprtnDestination("NULL");
		}


		/******************** testscriptsetupactionassert ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.SetupActionAssertComponent testscriptsetupactionassert = testscriptsetupaction.getAssert();

		/******************** TstScrpt_Stup_Actn_Assert_Vl ********************************************************************************/
		if(testscriptsetupactioni == 0) {t.addTstScrptStupActnAssertVl("[");}
		if(testscriptsetupactionassert.hasValue()) {

			t.addTstScrptStupActnAssertVl(String.valueOf(testscriptsetupactionassert.getValue()));
		} else {
			t.addTstScrptStupActnAssertVl("NULL");
		}

		if(testscriptsetupactioni == testscriptsetupactionlist.size()-1) {t.addTstScrptStupActnAssertVl("]");}


		/******************** TstScrpt_Stup_Actn_Assert_Rsrc ********************************************************************************/
		if(testscriptsetupactioni == 0) {t.addTstScrptStupActnAssertRsrc("[");}
		if(testscriptsetupactionassert.hasResource()) {

			t.addTstScrptStupActnAssertRsrc(String.valueOf(testscriptsetupactionassert.getResource()));
		} else {
			t.addTstScrptStupActnAssertRsrc("NULL");
		}

		if(testscriptsetupactioni == testscriptsetupactionlist.size()-1) {t.addTstScrptStupActnAssertRsrc("]");}


		/******************** TstScrpt_Stup_Actn_Assert_Path ********************************************************************************/
		if(testscriptsetupactioni == 0) {t.addTstScrptStupActnAssertPath("[");}
		if(testscriptsetupactionassert.hasPath()) {

			t.addTstScrptStupActnAssertPath(String.valueOf(testscriptsetupactionassert.getPath()));
		} else {
			t.addTstScrptStupActnAssertPath("NULL");
		}

		if(testscriptsetupactioni == testscriptsetupactionlist.size()-1) {t.addTstScrptStupActnAssertPath("]");}


		/******************** TstScrpt_Stup_Actn_Assert_RspsCd ********************************************************************************/
		if(testscriptsetupactioni == 0) {t.addTstScrptStupActnAssertRspsCd("[");}
		if(testscriptsetupactionassert.hasResponseCode()) {

			t.addTstScrptStupActnAssertRspsCd(String.valueOf(testscriptsetupactionassert.getResponseCode()));
		} else {
			t.addTstScrptStupActnAssertRspsCd("NULL");
		}

		if(testscriptsetupactioni == testscriptsetupactionlist.size()-1) {t.addTstScrptStupActnAssertRspsCd("]");}


		/******************** TstScrpt_Stup_Actn_Assert_HeaderField ********************************************************************************/
		if(testscriptsetupactioni == 0) {t.addTstScrptStupActnAssertHeaderField("[");}
		if(testscriptsetupactionassert.hasHeaderField()) {

			t.addTstScrptStupActnAssertHeaderField(String.valueOf(testscriptsetupactionassert.getHeaderField()));
		} else {
			t.addTstScrptStupActnAssertHeaderField("NULL");
		}

		if(testscriptsetupactioni == testscriptsetupactionlist.size()-1) {t.addTstScrptStupActnAssertHeaderField("]");}


		/******************** TstScrpt_Stup_Actn_Assert_CntntTyp ********************************************************************************/
		if(testscriptsetupactioni == 0) {t.addTstScrptStupActnAssertCntntTyp("[");}
		if(testscriptsetupactionassert.hasContentType()) {

			t.addTstScrptStupActnAssertCntntTyp(String.valueOf(testscriptsetupactionassert.getContentType()));
		} else {
			t.addTstScrptStupActnAssertCntntTyp("NULL");
		}

		if(testscriptsetupactioni == testscriptsetupactionlist.size()-1) {t.addTstScrptStupActnAssertCntntTyp("]");}


		/******************** TstScrpt_Stup_Actn_Assert_Dscrptn ********************************************************************************/
		if(testscriptsetupactioni == 0) {t.addTstScrptStupActnAssertDscrptn("[");}
		if(testscriptsetupactionassert.hasDescription()) {

			t.addTstScrptStupActnAssertDscrptn(String.valueOf(testscriptsetupactionassert.getDescription()));
		} else {
			t.addTstScrptStupActnAssertDscrptn("NULL");
		}

		if(testscriptsetupactioni == testscriptsetupactionlist.size()-1) {t.addTstScrptStupActnAssertDscrptn("]");}


		/******************** TstScrpt_Stup_Actn_Assert_CompareToSrcExprsn ********************************************************************************/
		if(testscriptsetupactioni == 0) {t.addTstScrptStupActnAssertCompareToSrcExprsn("[");}
		if(testscriptsetupactionassert.hasCompareToSourceExpression()) {

			t.addTstScrptStupActnAssertCompareToSrcExprsn(String.valueOf(testscriptsetupactionassert.getCompareToSourceExpression()));
		} else {
			t.addTstScrptStupActnAssertCompareToSrcExprsn("NULL");
		}

		if(testscriptsetupactioni == testscriptsetupactionlist.size()-1) {t.addTstScrptStupActnAssertCompareToSrcExprsn("]");}


		/******************** TstScrpt_Stup_Actn_Assert_CompareToSrcId ********************************************************************************/
		if(testscriptsetupactioni == 0) {t.addTstScrptStupActnAssertCompareToSrcId("[");}
		if(testscriptsetupactionassert.hasCompareToSourceId()) {

			t.addTstScrptStupActnAssertCompareToSrcId(String.valueOf(testscriptsetupactionassert.getCompareToSourceId()));
		} else {
			t.addTstScrptStupActnAssertCompareToSrcId("NULL");
		}

		if(testscriptsetupactioni == testscriptsetupactionlist.size()-1) {t.addTstScrptStupActnAssertCompareToSrcId("]");}


		/******************** TstScrpt_Stup_Actn_Assert_ValidateProfileId ********************************************************************************/
		if(testscriptsetupactioni == 0) {t.addTstScrptStupActnAssertValidateProfileId("[");}
		if(testscriptsetupactionassert.hasValidateProfileId()) {

			t.addTstScrptStupActnAssertValidateProfileId(String.valueOf(testscriptsetupactionassert.getValidateProfileId()));
		} else {
			t.addTstScrptStupActnAssertValidateProfileId("NULL");
		}

		if(testscriptsetupactioni == testscriptsetupactionlist.size()-1) {t.addTstScrptStupActnAssertValidateProfileId("]");}


		/******************** TstScrpt_Stup_Actn_Assert_CompareToSrcPath ********************************************************************************/
		if(testscriptsetupactioni == 0) {t.addTstScrptStupActnAssertCompareToSrcPath("[");}
		if(testscriptsetupactionassert.hasCompareToSourcePath()) {

			t.addTstScrptStupActnAssertCompareToSrcPath(String.valueOf(testscriptsetupactionassert.getCompareToSourcePath()));
		} else {
			t.addTstScrptStupActnAssertCompareToSrcPath("NULL");
		}

		if(testscriptsetupactioni == testscriptsetupactionlist.size()-1) {t.addTstScrptStupActnAssertCompareToSrcPath("]");}


		/******************** TstScrpt_Stup_Actn_Assert_Exprsn ********************************************************************************/
		if(testscriptsetupactioni == 0) {t.addTstScrptStupActnAssertExprsn("[");}
		if(testscriptsetupactionassert.hasExpression()) {

			t.addTstScrptStupActnAssertExprsn(String.valueOf(testscriptsetupactionassert.getExpression()));
		} else {
			t.addTstScrptStupActnAssertExprsn("NULL");
		}

		if(testscriptsetupactioni == testscriptsetupactionlist.size()-1) {t.addTstScrptStupActnAssertExprsn("]");}


		/******************** testscriptsetupactionassertoperator ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.AssertionOperatorType testscriptsetupactionassertoperator = testscriptsetupactionassert.getOperator();
		if(testscriptsetupactionassertoperator!=null) {
		if(testscriptsetupactioni == 0) {

		t.addTstScrptStupActnAssertOperator("[");		}
			t.addTstScrptStupActnAssertOperator(testscriptsetupactionassertoperator.toCode());
		if(testscriptsetupactioni == testscriptsetupactionlist.size()-1) {

		t.addTstScrptStupActnAssertOperator("]");		}

		} else {
			t.addTstScrptStupActnAssertOperator("NULL");
		}

		/******************** testscriptsetupactionassertresponse ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.AssertionResponseTypes testscriptsetupactionassertresponse = testscriptsetupactionassert.getResponse();
		if(testscriptsetupactionassertresponse!=null) {
		if(testscriptsetupactioni == 0) {

		t.addTstScrptStupActnAssertRsps("[");		}
			t.addTstScrptStupActnAssertRsps(testscriptsetupactionassertresponse.toCode());
		if(testscriptsetupactioni == testscriptsetupactionlist.size()-1) {

		t.addTstScrptStupActnAssertRsps("]");		}

		} else {
			t.addTstScrptStupActnAssertRsps("NULL");
		}

		/******************** TstScrpt_Stup_Actn_Assert_MinimumId ********************************************************************************/
		if(testscriptsetupactioni == 0) {t.addTstScrptStupActnAssertMinimumId("[");}
		if(testscriptsetupactionassert.hasMinimumId()) {

			t.addTstScrptStupActnAssertMinimumId(String.valueOf(testscriptsetupactionassert.getMinimumId()));
		} else {
			t.addTstScrptStupActnAssertMinimumId("NULL");
		}

		if(testscriptsetupactioni == testscriptsetupactionlist.size()-1) {t.addTstScrptStupActnAssertMinimumId("]");}


		/******************** TstScrpt_Stup_Actn_Assert_RqstUrl ********************************************************************************/
		if(testscriptsetupactioni == 0) {t.addTstScrptStupActnAssertRqstUrl("[");}
		if(testscriptsetupactionassert.hasRequestURL()) {

			t.addTstScrptStupActnAssertRqstUrl(String.valueOf(testscriptsetupactionassert.getRequestURL()));
		} else {
			t.addTstScrptStupActnAssertRqstUrl("NULL");
		}

		if(testscriptsetupactioni == testscriptsetupactionlist.size()-1) {t.addTstScrptStupActnAssertRqstUrl("]");}


		/******************** TstScrpt_Stup_Actn_Assert_NavigationLinks ********************************************************************************/
		if(testscriptsetupactioni == 0) {t.addTstScrptStupActnAssertNavigationLinks("[");}
		if(testscriptsetupactionassert.hasNavigationLinks()) {

			t.addTstScrptStupActnAssertNavigationLinks(String.valueOf(testscriptsetupactionassert.getNavigationLinks()));
		} else {
			t.addTstScrptStupActnAssertNavigationLinks("NULL");
		}

		if(testscriptsetupactioni == testscriptsetupactionlist.size()-1) {t.addTstScrptStupActnAssertNavigationLinks("]");}


		/******************** testscriptsetupactionassertrequestmethod ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptRequestMethodCode testscriptsetupactionassertrequestmethod = testscriptsetupactionassert.getRequestMethod();
		if(testscriptsetupactionassertrequestmethod!=null) {
		if(testscriptsetupactioni == 0) {

		t.addTstScrptStupActnAssertRqstMthd("[");		}
			t.addTstScrptStupActnAssertRqstMthd(testscriptsetupactionassertrequestmethod.toCode());
		if(testscriptsetupactioni == testscriptsetupactionlist.size()-1) {

		t.addTstScrptStupActnAssertRqstMthd("]");		}

		} else {
			t.addTstScrptStupActnAssertRqstMthd("NULL");
		}

		/******************** TstScrpt_Stup_Actn_Assert_WarningOnly ********************************************************************************/
		if(testscriptsetupactioni == 0) {t.addTstScrptStupActnAssertWarningOnly("[");}
		if(testscriptsetupactionassert.hasWarningOnly()) {

			t.addTstScrptStupActnAssertWarningOnly(String.valueOf(testscriptsetupactionassert.getWarningOnly()));
		} else {
			t.addTstScrptStupActnAssertWarningOnly("NULL");
		}

		if(testscriptsetupactioni == testscriptsetupactionlist.size()-1) {t.addTstScrptStupActnAssertWarningOnly("]");}


		/******************** TstScrpt_Stup_Actn_Assert_SrcId ********************************************************************************/
		if(testscriptsetupactioni == 0) {t.addTstScrptStupActnAssertSrcId("[");}
		if(testscriptsetupactionassert.hasSourceId()) {

			t.addTstScrptStupActnAssertSrcId(String.valueOf(testscriptsetupactionassert.getSourceId()));
		} else {
			t.addTstScrptStupActnAssertSrcId("NULL");
		}

		if(testscriptsetupactioni == testscriptsetupactionlist.size()-1) {t.addTstScrptStupActnAssertSrcId("]");}


		/******************** TstScrpt_Stup_Actn_Assert_Lbl ********************************************************************************/
		if(testscriptsetupactioni == 0) {t.addTstScrptStupActnAssertLbl("[");}
		if(testscriptsetupactionassert.hasLabel()) {

			t.addTstScrptStupActnAssertLbl(String.valueOf(testscriptsetupactionassert.getLabel()));
		} else {
			t.addTstScrptStupActnAssertLbl("NULL");
		}

		if(testscriptsetupactioni == testscriptsetupactionlist.size()-1) {t.addTstScrptStupActnAssertLbl("]");}


		/******************** testscriptsetupactionassertdirection ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.AssertionDirectionType testscriptsetupactionassertdirection = testscriptsetupactionassert.getDirection();
		if(testscriptsetupactionassertdirection!=null) {
		if(testscriptsetupactioni == 0) {

		t.addTstScrptStupActnAssertDirection("[");		}
			t.addTstScrptStupActnAssertDirection(testscriptsetupactionassertdirection.toCode());
		if(testscriptsetupactioni == testscriptsetupactionlist.size()-1) {

		t.addTstScrptStupActnAssertDirection("]");		}

		} else {
			t.addTstScrptStupActnAssertDirection("NULL");
		}

		 };
		/******************** testscriptteardown ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptTeardownComponent testscriptteardown = testscript.getTeardown();

		/******************** testscriptteardownaction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.TestScript.TeardownActionComponent> testscriptteardownactionlist = testscriptteardown.getAction();
		for(int testscriptteardownactioni = 0; testscriptteardownactioni<testscriptteardownactionlist.size();testscriptteardownactioni++ ) {
		org.hl7.fhir.r4.model.TestScript.TeardownActionComponent  testscriptteardownaction = testscriptteardownactionlist.get(testscriptteardownactioni);

		/******************** testscriptteardownactionoperation ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.SetupActionOperationComponent testscriptteardownactionoperation = testscriptteardownaction.getOperation();

		/******************** TstScrpt_Teardown_Actn_Oprtn_Rsrc ********************************************************************************/
		if(testscriptteardownactioni == 0) {t.addTstScrptTeardownActnOprtnRsrc("[");}
		if(testscriptteardownactionoperation.hasResource()) {

			t.addTstScrptTeardownActnOprtnRsrc(String.valueOf(testscriptteardownactionoperation.getResource()));
		} else {
			t.addTstScrptTeardownActnOprtnRsrc("NULL");
		}

		if(testscriptteardownactioni == testscriptteardownactionlist.size()-1) {t.addTstScrptTeardownActnOprtnRsrc("]");}


		/******************** testscriptteardownactionoperationmethod ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptRequestMethodCode testscriptteardownactionoperationmethod = testscriptteardownactionoperation.getMethod();
		if(testscriptteardownactionoperationmethod!=null) {
		if(testscriptteardownactioni == 0) {

		t.addTstScrptTeardownActnOprtnMthd("[");		}
			t.addTstScrptTeardownActnOprtnMthd(testscriptteardownactionoperationmethod.toCode());
		if(testscriptteardownactioni == testscriptteardownactionlist.size()-1) {

		t.addTstScrptTeardownActnOprtnMthd("]");		}

		} else {
			t.addTstScrptTeardownActnOprtnMthd("NULL");
		}

		/******************** testscriptteardownactionoperationtype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding testscriptteardownactionoperationtype = testscriptteardownactionoperation.getType();

		/******************** TstScrpt_Teardown_Actn_Oprtn_Typ_Dsply ********************************************************************************/
		if(testscriptteardownactioni == 0) {t.addTstScrptTeardownActnOprtnTypDsply("[");}
		if(testscriptteardownactionoperationtype.hasDisplay()) {

			t.addTstScrptTeardownActnOprtnTypDsply(String.valueOf(testscriptteardownactionoperationtype.getDisplay()));
		} else {
			t.addTstScrptTeardownActnOprtnTypDsply("NULL");
		}

		if(testscriptteardownactioni == testscriptteardownactionlist.size()-1) {t.addTstScrptTeardownActnOprtnTypDsply("]");}


		/******************** TstScrpt_Teardown_Actn_Oprtn_Typ_Vrsn ********************************************************************************/
		if(testscriptteardownactioni == 0) {t.addTstScrptTeardownActnOprtnTypVrsn("[");}
		if(testscriptteardownactionoperationtype.hasVersion()) {

			t.addTstScrptTeardownActnOprtnTypVrsn(String.valueOf(testscriptteardownactionoperationtype.getVersion()));
		} else {
			t.addTstScrptTeardownActnOprtnTypVrsn("NULL");
		}

		if(testscriptteardownactioni == testscriptteardownactionlist.size()-1) {t.addTstScrptTeardownActnOprtnTypVrsn("]");}


		/******************** TstScrpt_Teardown_Actn_Oprtn_Typ_Cd ********************************************************************************/
		if(testscriptteardownactioni == 0) {t.addTstScrptTeardownActnOprtnTypCd("[");}
		if(testscriptteardownactionoperationtype.hasCode()) {

			t.addTstScrptTeardownActnOprtnTypCd(String.valueOf(testscriptteardownactionoperationtype.getCode()));
		} else {
			t.addTstScrptTeardownActnOprtnTypCd("NULL");
		}

		if(testscriptteardownactioni == testscriptteardownactionlist.size()-1) {t.addTstScrptTeardownActnOprtnTypCd("]");}


		/******************** TstScrpt_Teardown_Actn_Oprtn_Typ_UsrSltd ********************************************************************************/
		if(testscriptteardownactioni == 0) {t.addTstScrptTeardownActnOprtnTypUsrSltd("[");}
		if(testscriptteardownactionoperationtype.hasUserSelected()) {

			t.addTstScrptTeardownActnOprtnTypUsrSltd(String.valueOf(testscriptteardownactionoperationtype.getUserSelected()));
		} else {
			t.addTstScrptTeardownActnOprtnTypUsrSltd("NULL");
		}

		if(testscriptteardownactioni == testscriptteardownactionlist.size()-1) {t.addTstScrptTeardownActnOprtnTypUsrSltd("]");}


		/******************** TstScrpt_Teardown_Actn_Oprtn_Typ_Sys ********************************************************************************/
		if(testscriptteardownactioni == 0) {t.addTstScrptTeardownActnOprtnTypSys("[");}
		if(testscriptteardownactionoperationtype.hasSystem()) {

			t.addTstScrptTeardownActnOprtnTypSys(String.valueOf(testscriptteardownactionoperationtype.getSystem()));
		} else {
			t.addTstScrptTeardownActnOprtnTypSys("NULL");
		}

		if(testscriptteardownactioni == testscriptteardownactionlist.size()-1) {t.addTstScrptTeardownActnOprtnTypSys("]");}


		/******************** TstScrpt_Teardown_Actn_Oprtn_CntntTyp ********************************************************************************/
		if(testscriptteardownactioni == 0) {t.addTstScrptTeardownActnOprtnCntntTyp("[");}
		if(testscriptteardownactionoperation.hasContentType()) {

			t.addTstScrptTeardownActnOprtnCntntTyp(String.valueOf(testscriptteardownactionoperation.getContentType()));
		} else {
			t.addTstScrptTeardownActnOprtnCntntTyp("NULL");
		}

		if(testscriptteardownactioni == testscriptteardownactionlist.size()-1) {t.addTstScrptTeardownActnOprtnCntntTyp("]");}


		/******************** TstScrpt_Teardown_Actn_Oprtn_Dscrptn ********************************************************************************/
		if(testscriptteardownactioni == 0) {t.addTstScrptTeardownActnOprtnDscrptn("[");}
		if(testscriptteardownactionoperation.hasDescription()) {

			t.addTstScrptTeardownActnOprtnDscrptn(String.valueOf(testscriptteardownactionoperation.getDescription()));
		} else {
			t.addTstScrptTeardownActnOprtnDscrptn("NULL");
		}

		if(testscriptteardownactioni == testscriptteardownactionlist.size()-1) {t.addTstScrptTeardownActnOprtnDscrptn("]");}


		/******************** TstScrpt_Teardown_Actn_Oprtn_EncodeRqstUrl ********************************************************************************/
		if(testscriptteardownactioni == 0) {t.addTstScrptTeardownActnOprtnEncodeRqstUrl("[");}
		if(testscriptteardownactionoperation.hasEncodeRequestUrl()) {

			t.addTstScrptTeardownActnOprtnEncodeRqstUrl(String.valueOf(testscriptteardownactionoperation.getEncodeRequestUrl()));
		} else {
			t.addTstScrptTeardownActnOprtnEncodeRqstUrl("NULL");
		}

		if(testscriptteardownactioni == testscriptteardownactionlist.size()-1) {t.addTstScrptTeardownActnOprtnEncodeRqstUrl("]");}


		/******************** TstScrpt_Teardown_Actn_Oprtn_Origin ********************************************************************************/
		if(testscriptteardownactioni == 0) {t.addTstScrptTeardownActnOprtnOrigin("[");}
		if(testscriptteardownactionoperation.hasOrigin()) {

			t.addTstScrptTeardownActnOprtnOrigin(String.valueOf(testscriptteardownactionoperation.getOrigin()));
		} else {
			t.addTstScrptTeardownActnOprtnOrigin("NULL");
		}

		if(testscriptteardownactioni == testscriptteardownactionlist.size()-1) {t.addTstScrptTeardownActnOprtnOrigin("]");}


		/******************** TstScrpt_Teardown_Actn_Oprtn_Url ********************************************************************************/
		if(testscriptteardownactioni == 0) {t.addTstScrptTeardownActnOprtnUrl("[");}
		if(testscriptteardownactionoperation.hasUrl()) {

			t.addTstScrptTeardownActnOprtnUrl(String.valueOf(testscriptteardownactionoperation.getUrl()));
		} else {
			t.addTstScrptTeardownActnOprtnUrl("NULL");
		}

		if(testscriptteardownactioni == testscriptteardownactionlist.size()-1) {t.addTstScrptTeardownActnOprtnUrl("]");}


		/******************** TstScrpt_Teardown_Actn_Oprtn_Accept ********************************************************************************/
		if(testscriptteardownactioni == 0) {t.addTstScrptTeardownActnOprtnAccept("[");}
		if(testscriptteardownactionoperation.hasAccept()) {

			t.addTstScrptTeardownActnOprtnAccept(String.valueOf(testscriptteardownactionoperation.getAccept()));
		} else {
			t.addTstScrptTeardownActnOprtnAccept("NULL");
		}

		if(testscriptteardownactioni == testscriptteardownactionlist.size()-1) {t.addTstScrptTeardownActnOprtnAccept("]");}


		/******************** testscriptteardownactionoperationrequestheader ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.TestScript.SetupActionOperationRequestHeaderComponent> testscriptteardownactionoperationrequestheaderlist = testscriptteardownactionoperation.getRequestHeader();
		for(int testscriptteardownactionoperationrequestheaderi = 0; testscriptteardownactionoperationrequestheaderi<testscriptteardownactionoperationrequestheaderlist.size();testscriptteardownactionoperationrequestheaderi++ ) {
		org.hl7.fhir.r4.model.TestScript.SetupActionOperationRequestHeaderComponent  testscriptteardownactionoperationrequestheader = testscriptteardownactionoperationrequestheaderlist.get(testscriptteardownactionoperationrequestheaderi);

		/******************** TstScrpt_Teardown_Actn_Oprtn_RqstHeader_Vl ********************************************************************************/
		if(testscriptteardownactionoperationrequestheaderi == 0) {t.addTstScrptTeardownActnOprtnRqstHeaderVl("[[");}
		if(testscriptteardownactionoperationrequestheader.hasValue()) {

			t.addTstScrptTeardownActnOprtnRqstHeaderVl(String.valueOf(testscriptteardownactionoperationrequestheader.getValue()));
		} else {
			t.addTstScrptTeardownActnOprtnRqstHeaderVl("NULL");
		}

		if(testscriptteardownactionoperationrequestheaderi == testscriptteardownactionoperationrequestheaderlist.size()-1) {t.addTstScrptTeardownActnOprtnRqstHeaderVl("]]");}


		/******************** TstScrpt_Teardown_Actn_Oprtn_RqstHeader_Field ********************************************************************************/
		if(testscriptteardownactionoperationrequestheaderi == 0) {t.addTstScrptTeardownActnOprtnRqstHeaderField("[[");}
		if(testscriptteardownactionoperationrequestheader.hasField()) {

			t.addTstScrptTeardownActnOprtnRqstHeaderField(String.valueOf(testscriptteardownactionoperationrequestheader.getField()));
		} else {
			t.addTstScrptTeardownActnOprtnRqstHeaderField("NULL");
		}

		if(testscriptteardownactionoperationrequestheaderi == testscriptteardownactionoperationrequestheaderlist.size()-1) {t.addTstScrptTeardownActnOprtnRqstHeaderField("]]");}


		 };
		/******************** TstScrpt_Teardown_Actn_Oprtn_RqstId ********************************************************************************/
		if(testscriptteardownactionoperation.hasRequestId()) {

			t.addTstScrptTeardownActnOprtnRqstId(String.valueOf(testscriptteardownactionoperation.getRequestId()));
		} else {
			t.addTstScrptTeardownActnOprtnRqstId("NULL");
		}


		/******************** TstScrpt_Teardown_Actn_Oprtn_TarId ********************************************************************************/
		if(testscriptteardownactionoperation.hasTargetId()) {

			t.addTstScrptTeardownActnOprtnTarId(String.valueOf(testscriptteardownactionoperation.getTargetId()));
		} else {
			t.addTstScrptTeardownActnOprtnTarId("NULL");
		}


		/******************** TstScrpt_Teardown_Actn_Oprtn_Params ********************************************************************************/
		if(testscriptteardownactionoperation.hasParams()) {

			t.addTstScrptTeardownActnOprtnParams(String.valueOf(testscriptteardownactionoperation.getParams()));
		} else {
			t.addTstScrptTeardownActnOprtnParams("NULL");
		}


		/******************** TstScrpt_Teardown_Actn_Oprtn_RspsId ********************************************************************************/
		if(testscriptteardownactionoperation.hasResponseId()) {

			t.addTstScrptTeardownActnOprtnRspsId(String.valueOf(testscriptteardownactionoperation.getResponseId()));
		} else {
			t.addTstScrptTeardownActnOprtnRspsId("NULL");
		}


		/******************** TstScrpt_Teardown_Actn_Oprtn_SrcId ********************************************************************************/
		if(testscriptteardownactionoperation.hasSourceId()) {

			t.addTstScrptTeardownActnOprtnSrcId(String.valueOf(testscriptteardownactionoperation.getSourceId()));
		} else {
			t.addTstScrptTeardownActnOprtnSrcId("NULL");
		}


		/******************** TstScrpt_Teardown_Actn_Oprtn_Lbl ********************************************************************************/
		if(testscriptteardownactionoperation.hasLabel()) {

			t.addTstScrptTeardownActnOprtnLbl(String.valueOf(testscriptteardownactionoperation.getLabel()));
		} else {
			t.addTstScrptTeardownActnOprtnLbl("NULL");
		}


		/******************** TstScrpt_Teardown_Actn_Oprtn_Destination ********************************************************************************/
		if(testscriptteardownactionoperation.hasDestination()) {

			t.addTstScrptTeardownActnOprtnDestination(String.valueOf(testscriptteardownactionoperation.getDestination()));
		} else {
			t.addTstScrptTeardownActnOprtnDestination("NULL");
		}


		 };
		/******************** testscripttest ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.TestScript.TestScriptTestComponent> testscripttestlist = testscript.getTest();
		for(int testscripttesti = 0; testscripttesti<testscripttestlist.size();testscripttesti++ ) {
		org.hl7.fhir.r4.model.TestScript.TestScriptTestComponent  testscripttest = testscripttestlist.get(testscripttesti);

		/******************** TstScrpt_Tst_Nm ********************************************************************************/
		if(testscripttesti == 0) {t.addTstScrptTstNm("[");}
		if(testscripttest.hasName()) {

			t.addTstScrptTstNm(String.valueOf(testscripttest.getName()));
		} else {
			t.addTstScrptTstNm("NULL");
		}

		if(testscripttesti == testscripttestlist.size()-1) {t.addTstScrptTstNm("]");}


		/******************** testscripttestaction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.TestScript.TestActionComponent> testscripttestactionlist = testscripttest.getAction();
		for(int testscripttestactioni = 0; testscripttestactioni<testscripttestactionlist.size();testscripttestactioni++ ) {
		org.hl7.fhir.r4.model.TestScript.TestActionComponent  testscripttestaction = testscripttestactionlist.get(testscripttestactioni);

		/******************** testscripttestactionoperation ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.SetupActionOperationComponent testscripttestactionoperation = testscripttestaction.getOperation();

		/******************** TstScrpt_Tst_Actn_Oprtn_Rsrc ********************************************************************************/
		if(testscripttestactioni == 0) {t.addTstScrptTstActnOprtnRsrc("[[");}
		if(testscripttestactionoperation.hasResource()) {

			t.addTstScrptTstActnOprtnRsrc(String.valueOf(testscripttestactionoperation.getResource()));
		} else {
			t.addTstScrptTstActnOprtnRsrc("NULL");
		}

		if(testscripttestactioni == testscripttestactionlist.size()-1) {t.addTstScrptTstActnOprtnRsrc("]]");}


		/******************** testscripttestactionoperationmethod ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptRequestMethodCode testscripttestactionoperationmethod = testscripttestactionoperation.getMethod();
		if(testscripttestactionoperationmethod!=null) {
		if(testscripttestactioni == 0) {

		t.addTstScrptTstActnOprtnMthd("[[");		}
			t.addTstScrptTstActnOprtnMthd(testscripttestactionoperationmethod.toCode());
		if(testscripttestactioni == testscripttestactionlist.size()-1) {

		t.addTstScrptTstActnOprtnMthd("]]");		}

		} else {
			t.addTstScrptTstActnOprtnMthd("NULL");
		}

		/******************** testscripttestactionoperationtype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding testscripttestactionoperationtype = testscripttestactionoperation.getType();

		/******************** TstScrpt_Tst_Actn_Oprtn_Typ_Dsply ********************************************************************************/
		if(testscripttestactioni == 0) {t.addTstScrptTstActnOprtnTypDsply("[[");}
		if(testscripttestactionoperationtype.hasDisplay()) {

			t.addTstScrptTstActnOprtnTypDsply(String.valueOf(testscripttestactionoperationtype.getDisplay()));
		} else {
			t.addTstScrptTstActnOprtnTypDsply("NULL");
		}

		if(testscripttestactioni == testscripttestactionlist.size()-1) {t.addTstScrptTstActnOprtnTypDsply("]]");}


		/******************** TstScrpt_Tst_Actn_Oprtn_Typ_Vrsn ********************************************************************************/
		if(testscripttestactioni == 0) {t.addTstScrptTstActnOprtnTypVrsn("[[");}
		if(testscripttestactionoperationtype.hasVersion()) {

			t.addTstScrptTstActnOprtnTypVrsn(String.valueOf(testscripttestactionoperationtype.getVersion()));
		} else {
			t.addTstScrptTstActnOprtnTypVrsn("NULL");
		}

		if(testscripttestactioni == testscripttestactionlist.size()-1) {t.addTstScrptTstActnOprtnTypVrsn("]]");}


		/******************** TstScrpt_Tst_Actn_Oprtn_Typ_Cd ********************************************************************************/
		if(testscripttestactioni == 0) {t.addTstScrptTstActnOprtnTypCd("[[");}
		if(testscripttestactionoperationtype.hasCode()) {

			t.addTstScrptTstActnOprtnTypCd(String.valueOf(testscripttestactionoperationtype.getCode()));
		} else {
			t.addTstScrptTstActnOprtnTypCd("NULL");
		}

		if(testscripttestactioni == testscripttestactionlist.size()-1) {t.addTstScrptTstActnOprtnTypCd("]]");}


		/******************** TstScrpt_Tst_Actn_Oprtn_Typ_UsrSltd ********************************************************************************/
		if(testscripttestactioni == 0) {t.addTstScrptTstActnOprtnTypUsrSltd("[[");}
		if(testscripttestactionoperationtype.hasUserSelected()) {

			t.addTstScrptTstActnOprtnTypUsrSltd(String.valueOf(testscripttestactionoperationtype.getUserSelected()));
		} else {
			t.addTstScrptTstActnOprtnTypUsrSltd("NULL");
		}

		if(testscripttestactioni == testscripttestactionlist.size()-1) {t.addTstScrptTstActnOprtnTypUsrSltd("]]");}


		/******************** TstScrpt_Tst_Actn_Oprtn_Typ_Sys ********************************************************************************/
		if(testscripttestactioni == 0) {t.addTstScrptTstActnOprtnTypSys("[[");}
		if(testscripttestactionoperationtype.hasSystem()) {

			t.addTstScrptTstActnOprtnTypSys(String.valueOf(testscripttestactionoperationtype.getSystem()));
		} else {
			t.addTstScrptTstActnOprtnTypSys("NULL");
		}

		if(testscripttestactioni == testscripttestactionlist.size()-1) {t.addTstScrptTstActnOprtnTypSys("]]");}


		/******************** TstScrpt_Tst_Actn_Oprtn_CntntTyp ********************************************************************************/
		if(testscripttestactioni == 0) {t.addTstScrptTstActnOprtnCntntTyp("[[");}
		if(testscripttestactionoperation.hasContentType()) {

			t.addTstScrptTstActnOprtnCntntTyp(String.valueOf(testscripttestactionoperation.getContentType()));
		} else {
			t.addTstScrptTstActnOprtnCntntTyp("NULL");
		}

		if(testscripttestactioni == testscripttestactionlist.size()-1) {t.addTstScrptTstActnOprtnCntntTyp("]]");}


		/******************** TstScrpt_Tst_Actn_Oprtn_Dscrptn ********************************************************************************/
		if(testscripttestactioni == 0) {t.addTstScrptTstActnOprtnDscrptn("[[");}
		if(testscripttestactionoperation.hasDescription()) {

			t.addTstScrptTstActnOprtnDscrptn(String.valueOf(testscripttestactionoperation.getDescription()));
		} else {
			t.addTstScrptTstActnOprtnDscrptn("NULL");
		}

		if(testscripttestactioni == testscripttestactionlist.size()-1) {t.addTstScrptTstActnOprtnDscrptn("]]");}


		/******************** TstScrpt_Tst_Actn_Oprtn_EncodeRqstUrl ********************************************************************************/
		if(testscripttestactioni == 0) {t.addTstScrptTstActnOprtnEncodeRqstUrl("[[");}
		if(testscripttestactionoperation.hasEncodeRequestUrl()) {

			t.addTstScrptTstActnOprtnEncodeRqstUrl(String.valueOf(testscripttestactionoperation.getEncodeRequestUrl()));
		} else {
			t.addTstScrptTstActnOprtnEncodeRqstUrl("NULL");
		}

		if(testscripttestactioni == testscripttestactionlist.size()-1) {t.addTstScrptTstActnOprtnEncodeRqstUrl("]]");}


		/******************** TstScrpt_Tst_Actn_Oprtn_Origin ********************************************************************************/
		if(testscripttestactioni == 0) {t.addTstScrptTstActnOprtnOrigin("[[");}
		if(testscripttestactionoperation.hasOrigin()) {

			t.addTstScrptTstActnOprtnOrigin(String.valueOf(testscripttestactionoperation.getOrigin()));
		} else {
			t.addTstScrptTstActnOprtnOrigin("NULL");
		}

		if(testscripttestactioni == testscripttestactionlist.size()-1) {t.addTstScrptTstActnOprtnOrigin("]]");}


		/******************** TstScrpt_Tst_Actn_Oprtn_Url ********************************************************************************/
		if(testscripttestactioni == 0) {t.addTstScrptTstActnOprtnUrl("[[");}
		if(testscripttestactionoperation.hasUrl()) {

			t.addTstScrptTstActnOprtnUrl(String.valueOf(testscripttestactionoperation.getUrl()));
		} else {
			t.addTstScrptTstActnOprtnUrl("NULL");
		}

		if(testscripttestactioni == testscripttestactionlist.size()-1) {t.addTstScrptTstActnOprtnUrl("]]");}


		/******************** TstScrpt_Tst_Actn_Oprtn_Accept ********************************************************************************/
		if(testscripttestactioni == 0) {t.addTstScrptTstActnOprtnAccept("[[");}
		if(testscripttestactionoperation.hasAccept()) {

			t.addTstScrptTstActnOprtnAccept(String.valueOf(testscripttestactionoperation.getAccept()));
		} else {
			t.addTstScrptTstActnOprtnAccept("NULL");
		}

		if(testscripttestactioni == testscripttestactionlist.size()-1) {t.addTstScrptTstActnOprtnAccept("]]");}


		/******************** testscripttestactionoperationrequestheader ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.TestScript.SetupActionOperationRequestHeaderComponent> testscripttestactionoperationrequestheaderlist = testscripttestactionoperation.getRequestHeader();
		for(int testscripttestactionoperationrequestheaderi = 0; testscripttestactionoperationrequestheaderi<testscripttestactionoperationrequestheaderlist.size();testscripttestactionoperationrequestheaderi++ ) {
		org.hl7.fhir.r4.model.TestScript.SetupActionOperationRequestHeaderComponent  testscripttestactionoperationrequestheader = testscripttestactionoperationrequestheaderlist.get(testscripttestactionoperationrequestheaderi);

		/******************** TstScrpt_Tst_Actn_Oprtn_RqstHeader_Vl ********************************************************************************/
		if(testscripttestactionoperationrequestheaderi == 0) {t.addTstScrptTstActnOprtnRqstHeaderVl("[[[");}
		if(testscripttestactionoperationrequestheader.hasValue()) {

			t.addTstScrptTstActnOprtnRqstHeaderVl(String.valueOf(testscripttestactionoperationrequestheader.getValue()));
		} else {
			t.addTstScrptTstActnOprtnRqstHeaderVl("NULL");
		}

		if(testscripttestactionoperationrequestheaderi == testscripttestactionoperationrequestheaderlist.size()-1) {t.addTstScrptTstActnOprtnRqstHeaderVl("]]]");}


		/******************** TstScrpt_Tst_Actn_Oprtn_RqstHeader_Field ********************************************************************************/
		if(testscripttestactionoperationrequestheaderi == 0) {t.addTstScrptTstActnOprtnRqstHeaderField("[[[");}
		if(testscripttestactionoperationrequestheader.hasField()) {

			t.addTstScrptTstActnOprtnRqstHeaderField(String.valueOf(testscripttestactionoperationrequestheader.getField()));
		} else {
			t.addTstScrptTstActnOprtnRqstHeaderField("NULL");
		}

		if(testscripttestactionoperationrequestheaderi == testscripttestactionoperationrequestheaderlist.size()-1) {t.addTstScrptTstActnOprtnRqstHeaderField("]]]");}


		 };
		/******************** TstScrpt_Tst_Actn_Oprtn_RqstId ********************************************************************************/
		if(testscripttestactionoperation.hasRequestId()) {

			t.addTstScrptTstActnOprtnRqstId(String.valueOf(testscripttestactionoperation.getRequestId()));
		} else {
			t.addTstScrptTstActnOprtnRqstId("NULL");
		}


		/******************** TstScrpt_Tst_Actn_Oprtn_TarId ********************************************************************************/
		if(testscripttestactionoperation.hasTargetId()) {

			t.addTstScrptTstActnOprtnTarId(String.valueOf(testscripttestactionoperation.getTargetId()));
		} else {
			t.addTstScrptTstActnOprtnTarId("NULL");
		}


		/******************** TstScrpt_Tst_Actn_Oprtn_Params ********************************************************************************/
		if(testscripttestactionoperation.hasParams()) {

			t.addTstScrptTstActnOprtnParams(String.valueOf(testscripttestactionoperation.getParams()));
		} else {
			t.addTstScrptTstActnOprtnParams("NULL");
		}


		/******************** TstScrpt_Tst_Actn_Oprtn_RspsId ********************************************************************************/
		if(testscripttestactionoperation.hasResponseId()) {

			t.addTstScrptTstActnOprtnRspsId(String.valueOf(testscripttestactionoperation.getResponseId()));
		} else {
			t.addTstScrptTstActnOprtnRspsId("NULL");
		}


		/******************** TstScrpt_Tst_Actn_Oprtn_SrcId ********************************************************************************/
		if(testscripttestactionoperation.hasSourceId()) {

			t.addTstScrptTstActnOprtnSrcId(String.valueOf(testscripttestactionoperation.getSourceId()));
		} else {
			t.addTstScrptTstActnOprtnSrcId("NULL");
		}


		/******************** TstScrpt_Tst_Actn_Oprtn_Lbl ********************************************************************************/
		if(testscripttestactionoperation.hasLabel()) {

			t.addTstScrptTstActnOprtnLbl(String.valueOf(testscripttestactionoperation.getLabel()));
		} else {
			t.addTstScrptTstActnOprtnLbl("NULL");
		}


		/******************** TstScrpt_Tst_Actn_Oprtn_Destination ********************************************************************************/
		if(testscripttestactionoperation.hasDestination()) {

			t.addTstScrptTstActnOprtnDestination(String.valueOf(testscripttestactionoperation.getDestination()));
		} else {
			t.addTstScrptTstActnOprtnDestination("NULL");
		}


		/******************** testscripttestactionassert ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.SetupActionAssertComponent testscripttestactionassert = testscripttestaction.getAssert();

		/******************** TstScrpt_Tst_Actn_Assert_Vl ********************************************************************************/
		if(testscripttestactioni == 0) {t.addTstScrptTstActnAssertVl("[[");}
		if(testscripttestactionassert.hasValue()) {

			t.addTstScrptTstActnAssertVl(String.valueOf(testscripttestactionassert.getValue()));
		} else {
			t.addTstScrptTstActnAssertVl("NULL");
		}

		if(testscripttestactioni == testscripttestactionlist.size()-1) {t.addTstScrptTstActnAssertVl("]]");}


		/******************** TstScrpt_Tst_Actn_Assert_Rsrc ********************************************************************************/
		if(testscripttestactioni == 0) {t.addTstScrptTstActnAssertRsrc("[[");}
		if(testscripttestactionassert.hasResource()) {

			t.addTstScrptTstActnAssertRsrc(String.valueOf(testscripttestactionassert.getResource()));
		} else {
			t.addTstScrptTstActnAssertRsrc("NULL");
		}

		if(testscripttestactioni == testscripttestactionlist.size()-1) {t.addTstScrptTstActnAssertRsrc("]]");}


		/******************** TstScrpt_Tst_Actn_Assert_Path ********************************************************************************/
		if(testscripttestactioni == 0) {t.addTstScrptTstActnAssertPath("[[");}
		if(testscripttestactionassert.hasPath()) {

			t.addTstScrptTstActnAssertPath(String.valueOf(testscripttestactionassert.getPath()));
		} else {
			t.addTstScrptTstActnAssertPath("NULL");
		}

		if(testscripttestactioni == testscripttestactionlist.size()-1) {t.addTstScrptTstActnAssertPath("]]");}


		/******************** TstScrpt_Tst_Actn_Assert_RspsCd ********************************************************************************/
		if(testscripttestactioni == 0) {t.addTstScrptTstActnAssertRspsCd("[[");}
		if(testscripttestactionassert.hasResponseCode()) {

			t.addTstScrptTstActnAssertRspsCd(String.valueOf(testscripttestactionassert.getResponseCode()));
		} else {
			t.addTstScrptTstActnAssertRspsCd("NULL");
		}

		if(testscripttestactioni == testscripttestactionlist.size()-1) {t.addTstScrptTstActnAssertRspsCd("]]");}


		/******************** TstScrpt_Tst_Actn_Assert_HeaderField ********************************************************************************/
		if(testscripttestactioni == 0) {t.addTstScrptTstActnAssertHeaderField("[[");}
		if(testscripttestactionassert.hasHeaderField()) {

			t.addTstScrptTstActnAssertHeaderField(String.valueOf(testscripttestactionassert.getHeaderField()));
		} else {
			t.addTstScrptTstActnAssertHeaderField("NULL");
		}

		if(testscripttestactioni == testscripttestactionlist.size()-1) {t.addTstScrptTstActnAssertHeaderField("]]");}


		/******************** TstScrpt_Tst_Actn_Assert_CntntTyp ********************************************************************************/
		if(testscripttestactioni == 0) {t.addTstScrptTstActnAssertCntntTyp("[[");}
		if(testscripttestactionassert.hasContentType()) {

			t.addTstScrptTstActnAssertCntntTyp(String.valueOf(testscripttestactionassert.getContentType()));
		} else {
			t.addTstScrptTstActnAssertCntntTyp("NULL");
		}

		if(testscripttestactioni == testscripttestactionlist.size()-1) {t.addTstScrptTstActnAssertCntntTyp("]]");}


		/******************** TstScrpt_Tst_Actn_Assert_Dscrptn ********************************************************************************/
		if(testscripttestactioni == 0) {t.addTstScrptTstActnAssertDscrptn("[[");}
		if(testscripttestactionassert.hasDescription()) {

			t.addTstScrptTstActnAssertDscrptn(String.valueOf(testscripttestactionassert.getDescription()));
		} else {
			t.addTstScrptTstActnAssertDscrptn("NULL");
		}

		if(testscripttestactioni == testscripttestactionlist.size()-1) {t.addTstScrptTstActnAssertDscrptn("]]");}


		/******************** TstScrpt_Tst_Actn_Assert_CompareToSrcExprsn ********************************************************************************/
		if(testscripttestactioni == 0) {t.addTstScrptTstActnAssertCompareToSrcExprsn("[[");}
		if(testscripttestactionassert.hasCompareToSourceExpression()) {

			t.addTstScrptTstActnAssertCompareToSrcExprsn(String.valueOf(testscripttestactionassert.getCompareToSourceExpression()));
		} else {
			t.addTstScrptTstActnAssertCompareToSrcExprsn("NULL");
		}

		if(testscripttestactioni == testscripttestactionlist.size()-1) {t.addTstScrptTstActnAssertCompareToSrcExprsn("]]");}


		/******************** TstScrpt_Tst_Actn_Assert_CompareToSrcId ********************************************************************************/
		if(testscripttestactioni == 0) {t.addTstScrptTstActnAssertCompareToSrcId("[[");}
		if(testscripttestactionassert.hasCompareToSourceId()) {

			t.addTstScrptTstActnAssertCompareToSrcId(String.valueOf(testscripttestactionassert.getCompareToSourceId()));
		} else {
			t.addTstScrptTstActnAssertCompareToSrcId("NULL");
		}

		if(testscripttestactioni == testscripttestactionlist.size()-1) {t.addTstScrptTstActnAssertCompareToSrcId("]]");}


		/******************** TstScrpt_Tst_Actn_Assert_ValidateProfileId ********************************************************************************/
		if(testscripttestactioni == 0) {t.addTstScrptTstActnAssertValidateProfileId("[[");}
		if(testscripttestactionassert.hasValidateProfileId()) {

			t.addTstScrptTstActnAssertValidateProfileId(String.valueOf(testscripttestactionassert.getValidateProfileId()));
		} else {
			t.addTstScrptTstActnAssertValidateProfileId("NULL");
		}

		if(testscripttestactioni == testscripttestactionlist.size()-1) {t.addTstScrptTstActnAssertValidateProfileId("]]");}


		/******************** TstScrpt_Tst_Actn_Assert_CompareToSrcPath ********************************************************************************/
		if(testscripttestactioni == 0) {t.addTstScrptTstActnAssertCompareToSrcPath("[[");}
		if(testscripttestactionassert.hasCompareToSourcePath()) {

			t.addTstScrptTstActnAssertCompareToSrcPath(String.valueOf(testscripttestactionassert.getCompareToSourcePath()));
		} else {
			t.addTstScrptTstActnAssertCompareToSrcPath("NULL");
		}

		if(testscripttestactioni == testscripttestactionlist.size()-1) {t.addTstScrptTstActnAssertCompareToSrcPath("]]");}


		/******************** TstScrpt_Tst_Actn_Assert_Exprsn ********************************************************************************/
		if(testscripttestactioni == 0) {t.addTstScrptTstActnAssertExprsn("[[");}
		if(testscripttestactionassert.hasExpression()) {

			t.addTstScrptTstActnAssertExprsn(String.valueOf(testscripttestactionassert.getExpression()));
		} else {
			t.addTstScrptTstActnAssertExprsn("NULL");
		}

		if(testscripttestactioni == testscripttestactionlist.size()-1) {t.addTstScrptTstActnAssertExprsn("]]");}


		/******************** testscripttestactionassertoperator ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.AssertionOperatorType testscripttestactionassertoperator = testscripttestactionassert.getOperator();
		if(testscripttestactionassertoperator!=null) {
		if(testscripttestactioni == 0) {

		t.addTstScrptTstActnAssertOperator("[[");		}
			t.addTstScrptTstActnAssertOperator(testscripttestactionassertoperator.toCode());
		if(testscripttestactioni == testscripttestactionlist.size()-1) {

		t.addTstScrptTstActnAssertOperator("]]");		}

		} else {
			t.addTstScrptTstActnAssertOperator("NULL");
		}

		/******************** testscripttestactionassertresponse ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.AssertionResponseTypes testscripttestactionassertresponse = testscripttestactionassert.getResponse();
		if(testscripttestactionassertresponse!=null) {
		if(testscripttestactioni == 0) {

		t.addTstScrptTstActnAssertRsps("[[");		}
			t.addTstScrptTstActnAssertRsps(testscripttestactionassertresponse.toCode());
		if(testscripttestactioni == testscripttestactionlist.size()-1) {

		t.addTstScrptTstActnAssertRsps("]]");		}

		} else {
			t.addTstScrptTstActnAssertRsps("NULL");
		}

		/******************** TstScrpt_Tst_Actn_Assert_MinimumId ********************************************************************************/
		if(testscripttestactioni == 0) {t.addTstScrptTstActnAssertMinimumId("[[");}
		if(testscripttestactionassert.hasMinimumId()) {

			t.addTstScrptTstActnAssertMinimumId(String.valueOf(testscripttestactionassert.getMinimumId()));
		} else {
			t.addTstScrptTstActnAssertMinimumId("NULL");
		}

		if(testscripttestactioni == testscripttestactionlist.size()-1) {t.addTstScrptTstActnAssertMinimumId("]]");}


		/******************** TstScrpt_Tst_Actn_Assert_RqstUrl ********************************************************************************/
		if(testscripttestactioni == 0) {t.addTstScrptTstActnAssertRqstUrl("[[");}
		if(testscripttestactionassert.hasRequestURL()) {

			t.addTstScrptTstActnAssertRqstUrl(String.valueOf(testscripttestactionassert.getRequestURL()));
		} else {
			t.addTstScrptTstActnAssertRqstUrl("NULL");
		}

		if(testscripttestactioni == testscripttestactionlist.size()-1) {t.addTstScrptTstActnAssertRqstUrl("]]");}


		/******************** TstScrpt_Tst_Actn_Assert_NavigationLinks ********************************************************************************/
		if(testscripttestactioni == 0) {t.addTstScrptTstActnAssertNavigationLinks("[[");}
		if(testscripttestactionassert.hasNavigationLinks()) {

			t.addTstScrptTstActnAssertNavigationLinks(String.valueOf(testscripttestactionassert.getNavigationLinks()));
		} else {
			t.addTstScrptTstActnAssertNavigationLinks("NULL");
		}

		if(testscripttestactioni == testscripttestactionlist.size()-1) {t.addTstScrptTstActnAssertNavigationLinks("]]");}


		/******************** testscripttestactionassertrequestmethod ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptRequestMethodCode testscripttestactionassertrequestmethod = testscripttestactionassert.getRequestMethod();
		if(testscripttestactionassertrequestmethod!=null) {
		if(testscripttestactioni == 0) {

		t.addTstScrptTstActnAssertRqstMthd("[[");		}
			t.addTstScrptTstActnAssertRqstMthd(testscripttestactionassertrequestmethod.toCode());
		if(testscripttestactioni == testscripttestactionlist.size()-1) {

		t.addTstScrptTstActnAssertRqstMthd("]]");		}

		} else {
			t.addTstScrptTstActnAssertRqstMthd("NULL");
		}

		/******************** TstScrpt_Tst_Actn_Assert_WarningOnly ********************************************************************************/
		if(testscripttestactioni == 0) {t.addTstScrptTstActnAssertWarningOnly("[[");}
		if(testscripttestactionassert.hasWarningOnly()) {

			t.addTstScrptTstActnAssertWarningOnly(String.valueOf(testscripttestactionassert.getWarningOnly()));
		} else {
			t.addTstScrptTstActnAssertWarningOnly("NULL");
		}

		if(testscripttestactioni == testscripttestactionlist.size()-1) {t.addTstScrptTstActnAssertWarningOnly("]]");}


		/******************** TstScrpt_Tst_Actn_Assert_SrcId ********************************************************************************/
		if(testscripttestactioni == 0) {t.addTstScrptTstActnAssertSrcId("[[");}
		if(testscripttestactionassert.hasSourceId()) {

			t.addTstScrptTstActnAssertSrcId(String.valueOf(testscripttestactionassert.getSourceId()));
		} else {
			t.addTstScrptTstActnAssertSrcId("NULL");
		}

		if(testscripttestactioni == testscripttestactionlist.size()-1) {t.addTstScrptTstActnAssertSrcId("]]");}


		/******************** TstScrpt_Tst_Actn_Assert_Lbl ********************************************************************************/
		if(testscripttestactioni == 0) {t.addTstScrptTstActnAssertLbl("[[");}
		if(testscripttestactionassert.hasLabel()) {

			t.addTstScrptTstActnAssertLbl(String.valueOf(testscripttestactionassert.getLabel()));
		} else {
			t.addTstScrptTstActnAssertLbl("NULL");
		}

		if(testscripttestactioni == testscripttestactionlist.size()-1) {t.addTstScrptTstActnAssertLbl("]]");}


		/******************** testscripttestactionassertdirection ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.AssertionDirectionType testscripttestactionassertdirection = testscripttestactionassert.getDirection();
		if(testscripttestactionassertdirection!=null) {
		if(testscripttestactioni == 0) {

		t.addTstScrptTstActnAssertDirection("[[");		}
			t.addTstScrptTstActnAssertDirection(testscripttestactionassertdirection.toCode());
		if(testscripttestactioni == testscripttestactionlist.size()-1) {

		t.addTstScrptTstActnAssertDirection("]]");		}

		} else {
			t.addTstScrptTstActnAssertDirection("NULL");
		}

		 };
		/******************** TstScrpt_Tst_Dscrptn ********************************************************************************/
		if(testscripttest.hasDescription()) {

			t.addTstScrptTstDscrptn(String.valueOf(testscripttest.getDescription()));
		} else {
			t.addTstScrptTstDscrptn("NULL");
		}


		 };
		/******************** TstScrpt_Copyright ********************************************************************************/
		if(testscript.hasCopyright()) {

			t.addTstScrptCopyright(String.valueOf(testscript.getCopyright()));
		} else {
			t.addTstScrptCopyright("NULL");
		}


		/******************** TstScrpt_Ttl ********************************************************************************/
		if(testscript.hasTitle()) {

			t.addTstScrptTtl(String.valueOf(testscript.getTitle()));
		} else {
			t.addTstScrptTtl("NULL");
		}


		/******************** TstScrpt_Prpse ********************************************************************************/
		if(testscript.hasPurpose()) {

			t.addTstScrptPrpse(String.valueOf(testscript.getPurpose()));
		} else {
			t.addTstScrptPrpse("NULL");
		}


		/******************** TstScrpt_Url ********************************************************************************/
		if(testscript.hasUrl()) {

			t.addTstScrptUrl(String.valueOf(testscript.getUrl()));
		} else {
			t.addTstScrptUrl("NULL");
		}


		/******************** TstScrpt_Profile ********************************************************************************/
		if(testscript.hasProfile()) {

			String  array = "[";
			for(int incr=0; incr<testscript.getProfile().size(); incr++) {
				array = array + testscript.getProfile().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			t.addTstScrptProfile(array);

		} else {
			t.addTstScrptProfile("NULL");
		}


		/******************** testscriptdestination ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.TestScript.TestScriptDestinationComponent> testscriptdestinationlist = testscript.getDestination();
		for(int testscriptdestinationi = 0; testscriptdestinationi<testscriptdestinationlist.size();testscriptdestinationi++ ) {
		org.hl7.fhir.r4.model.TestScript.TestScriptDestinationComponent  testscriptdestination = testscriptdestinationlist.get(testscriptdestinationi);

		/******************** TstScrpt_Destination_Index ********************************************************************************/
		if(testscriptdestinationi == 0) {t.addTstScrptDestinationIndex("[");}
		if(testscriptdestination.hasIndex()) {

			t.addTstScrptDestinationIndex(String.valueOf(testscriptdestination.getIndex()));
		} else {
			t.addTstScrptDestinationIndex("NULL");
		}

		if(testscriptdestinationi == testscriptdestinationlist.size()-1) {t.addTstScrptDestinationIndex("]");}


		/******************** testscriptdestinationprofile ********************************************************************************/
		org.hl7.fhir.r4.model.Coding testscriptdestinationprofile = testscriptdestination.getProfile();

		/******************** TstScrpt_Destination_Profile_Dsply ********************************************************************************/
		if(testscriptdestinationi == 0) {t.addTstScrptDestinationProfileDsply("[");}
		if(testscriptdestinationprofile.hasDisplay()) {

			t.addTstScrptDestinationProfileDsply(String.valueOf(testscriptdestinationprofile.getDisplay()));
		} else {
			t.addTstScrptDestinationProfileDsply("NULL");
		}

		if(testscriptdestinationi == testscriptdestinationlist.size()-1) {t.addTstScrptDestinationProfileDsply("]");}


		/******************** TstScrpt_Destination_Profile_Vrsn ********************************************************************************/
		if(testscriptdestinationi == 0) {t.addTstScrptDestinationProfileVrsn("[");}
		if(testscriptdestinationprofile.hasVersion()) {

			t.addTstScrptDestinationProfileVrsn(String.valueOf(testscriptdestinationprofile.getVersion()));
		} else {
			t.addTstScrptDestinationProfileVrsn("NULL");
		}

		if(testscriptdestinationi == testscriptdestinationlist.size()-1) {t.addTstScrptDestinationProfileVrsn("]");}


		/******************** TstScrpt_Destination_Profile_Cd ********************************************************************************/
		if(testscriptdestinationi == 0) {t.addTstScrptDestinationProfileCd("[");}
		if(testscriptdestinationprofile.hasCode()) {

			t.addTstScrptDestinationProfileCd(String.valueOf(testscriptdestinationprofile.getCode()));
		} else {
			t.addTstScrptDestinationProfileCd("NULL");
		}

		if(testscriptdestinationi == testscriptdestinationlist.size()-1) {t.addTstScrptDestinationProfileCd("]");}


		/******************** TstScrpt_Destination_Profile_UsrSltd ********************************************************************************/
		if(testscriptdestinationi == 0) {t.addTstScrptDestinationProfileUsrSltd("[");}
		if(testscriptdestinationprofile.hasUserSelected()) {

			t.addTstScrptDestinationProfileUsrSltd(String.valueOf(testscriptdestinationprofile.getUserSelected()));
		} else {
			t.addTstScrptDestinationProfileUsrSltd("NULL");
		}

		if(testscriptdestinationi == testscriptdestinationlist.size()-1) {t.addTstScrptDestinationProfileUsrSltd("]");}


		/******************** TstScrpt_Destination_Profile_Sys ********************************************************************************/
		if(testscriptdestinationi == 0) {t.addTstScrptDestinationProfileSys("[");}
		if(testscriptdestinationprofile.hasSystem()) {

			t.addTstScrptDestinationProfileSys(String.valueOf(testscriptdestinationprofile.getSystem()));
		} else {
			t.addTstScrptDestinationProfileSys("NULL");
		}

		if(testscriptdestinationi == testscriptdestinationlist.size()-1) {t.addTstScrptDestinationProfileSys("]");}


		 };
		/******************** testscriptjurisdiction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> testscriptjurisdictionlist = testscript.getJurisdiction();
		for(int testscriptjurisdictioni = 0; testscriptjurisdictioni<testscriptjurisdictionlist.size();testscriptjurisdictioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  testscriptjurisdiction = testscriptjurisdictionlist.get(testscriptjurisdictioni);

		/******************** TstScrpt_Jrsdctn_Txt ********************************************************************************/
		if(testscriptjurisdictioni == 0) {t.addTstScrptJrsdctnTxt("[");}
		if(testscriptjurisdiction.hasText()) {

			t.addTstScrptJrsdctnTxt(String.valueOf(testscriptjurisdiction.getText()));
		} else {
			t.addTstScrptJrsdctnTxt("NULL");
		}

		if(testscriptjurisdictioni == testscriptjurisdictionlist.size()-1) {t.addTstScrptJrsdctnTxt("]");}


		/******************** testscriptjurisdictioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> testscriptjurisdictioncodinglist = testscriptjurisdiction.getCoding();
		for(int testscriptjurisdictioncodingi = 0; testscriptjurisdictioncodingi<testscriptjurisdictioncodinglist.size();testscriptjurisdictioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  testscriptjurisdictioncoding = testscriptjurisdictioncodinglist.get(testscriptjurisdictioncodingi);

		/******************** TstScrpt_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(testscriptjurisdictioncodingi == 0) {t.addTstScrptJrsdctnCdgDsply("[[");}
		if(testscriptjurisdictioncoding.hasDisplay()) {

			t.addTstScrptJrsdctnCdgDsply(String.valueOf(testscriptjurisdictioncoding.getDisplay()));
		} else {
			t.addTstScrptJrsdctnCdgDsply("NULL");
		}

		if(testscriptjurisdictioncodingi == testscriptjurisdictioncodinglist.size()-1) {t.addTstScrptJrsdctnCdgDsply("]]");}


		/******************** TstScrpt_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(testscriptjurisdictioncodingi == 0) {t.addTstScrptJrsdctnCdgVrsn("[[");}
		if(testscriptjurisdictioncoding.hasVersion()) {

			t.addTstScrptJrsdctnCdgVrsn(String.valueOf(testscriptjurisdictioncoding.getVersion()));
		} else {
			t.addTstScrptJrsdctnCdgVrsn("NULL");
		}

		if(testscriptjurisdictioncodingi == testscriptjurisdictioncodinglist.size()-1) {t.addTstScrptJrsdctnCdgVrsn("]]");}


		/******************** TstScrpt_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(testscriptjurisdictioncodingi == 0) {t.addTstScrptJrsdctnCdgCd("[[");}
		if(testscriptjurisdictioncoding.hasCode()) {

			t.addTstScrptJrsdctnCdgCd(String.valueOf(testscriptjurisdictioncoding.getCode()));
		} else {
			t.addTstScrptJrsdctnCdgCd("NULL");
		}

		if(testscriptjurisdictioncodingi == testscriptjurisdictioncodinglist.size()-1) {t.addTstScrptJrsdctnCdgCd("]]");}


		/******************** TstScrpt_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(testscriptjurisdictioncodingi == 0) {t.addTstScrptJrsdctnCdgUsrSltd("[[");}
		if(testscriptjurisdictioncoding.hasUserSelected()) {

			t.addTstScrptJrsdctnCdgUsrSltd(String.valueOf(testscriptjurisdictioncoding.getUserSelected()));
		} else {
			t.addTstScrptJrsdctnCdgUsrSltd("NULL");
		}

		if(testscriptjurisdictioncodingi == testscriptjurisdictioncodinglist.size()-1) {t.addTstScrptJrsdctnCdgUsrSltd("]]");}


		/******************** TstScrpt_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(testscriptjurisdictioncodingi == 0) {t.addTstScrptJrsdctnCdgSys("[[");}
		if(testscriptjurisdictioncoding.hasSystem()) {

			t.addTstScrptJrsdctnCdgSys(String.valueOf(testscriptjurisdictioncoding.getSystem()));
		} else {
			t.addTstScrptJrsdctnCdgSys("NULL");
		}

		if(testscriptjurisdictioncodingi == testscriptjurisdictioncodinglist.size()-1) {t.addTstScrptJrsdctnCdgSys("]]");}


		 };
		 };
		/******************** testscriptusecontext ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.UsageContext> testscriptusecontextlist = testscript.getUseContext();
		for(int testscriptusecontexti = 0; testscriptusecontexti<testscriptusecontextlist.size();testscriptusecontexti++ ) {
		org.hl7.fhir.r4.model.UsageContext  testscriptusecontext = testscriptusecontextlist.get(testscriptusecontexti);

		/******************** testscriptusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding testscriptusecontextcode = testscriptusecontext.getCode();

		/******************** TstScrpt_UseCntxt_Cd_Dsply ********************************************************************************/
		if(testscriptusecontexti == 0) {t.addTstScrptUseCntxtCdDsply("[");}
		if(testscriptusecontextcode.hasDisplay()) {

			t.addTstScrptUseCntxtCdDsply(String.valueOf(testscriptusecontextcode.getDisplay()));
		} else {
			t.addTstScrptUseCntxtCdDsply("NULL");
		}

		if(testscriptusecontexti == testscriptusecontextlist.size()-1) {t.addTstScrptUseCntxtCdDsply("]");}


		/******************** TstScrpt_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(testscriptusecontexti == 0) {t.addTstScrptUseCntxtCdVrsn("[");}
		if(testscriptusecontextcode.hasVersion()) {

			t.addTstScrptUseCntxtCdVrsn(String.valueOf(testscriptusecontextcode.getVersion()));
		} else {
			t.addTstScrptUseCntxtCdVrsn("NULL");
		}

		if(testscriptusecontexti == testscriptusecontextlist.size()-1) {t.addTstScrptUseCntxtCdVrsn("]");}


		/******************** TstScrpt_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(testscriptusecontexti == 0) {t.addTstScrptUseCntxtCdUsrSltd("[");}
		if(testscriptusecontextcode.hasUserSelected()) {

			t.addTstScrptUseCntxtCdUsrSltd(String.valueOf(testscriptusecontextcode.getUserSelected()));
		} else {
			t.addTstScrptUseCntxtCdUsrSltd("NULL");
		}

		if(testscriptusecontexti == testscriptusecontextlist.size()-1) {t.addTstScrptUseCntxtCdUsrSltd("]");}


		/******************** TstScrpt_UseCntxt_Cd_Sys ********************************************************************************/
		if(testscriptusecontexti == 0) {t.addTstScrptUseCntxtCdSys("[");}
		if(testscriptusecontextcode.hasSystem()) {

			t.addTstScrptUseCntxtCdSys(String.valueOf(testscriptusecontextcode.getSystem()));
		} else {
			t.addTstScrptUseCntxtCdSys("NULL");
		}

		if(testscriptusecontexti == testscriptusecontextlist.size()-1) {t.addTstScrptUseCntxtCdSys("]");}


		/******************** TstScrpt_UseCntxt_VlRfrnc ********************************************************************************/
		if(testscriptusecontexti == 0) {t.addTstScrptUseCntxtVlRfrnc("[");}
		if(testscriptusecontext.hasValueReference()) {

			if(testscriptusecontext.getValueReference().getReference() != null) {
			t.addTstScrptUseCntxtVlRfrnc(testscriptusecontext.getValueReference().getReference());
			}
		} else {
			t.addTstScrptUseCntxtVlRfrnc("NULL");
		}

		if(testscriptusecontexti == testscriptusecontextlist.size()-1) {t.addTstScrptUseCntxtVlRfrnc("]");}


		/******************** testscriptusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept testscriptusecontextvaluecodeableconcept = testscriptusecontext.getValueCodeableConcept();

		/******************** TstScrpt_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(testscriptusecontexti == 0) {t.addTstScrptUseCntxtVlCdbleCncptTxt("[");}
		if(testscriptusecontextvaluecodeableconcept.hasText()) {

			t.addTstScrptUseCntxtVlCdbleCncptTxt(String.valueOf(testscriptusecontextvaluecodeableconcept.getText()));
		} else {
			t.addTstScrptUseCntxtVlCdbleCncptTxt("NULL");
		}

		if(testscriptusecontexti == testscriptusecontextlist.size()-1) {t.addTstScrptUseCntxtVlCdbleCncptTxt("]");}


		/******************** testscriptusecontextvaluecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> testscriptusecontextvaluecodeableconceptcodinglist = testscriptusecontextvaluecodeableconcept.getCoding();
		for(int testscriptusecontextvaluecodeableconceptcodingi = 0; testscriptusecontextvaluecodeableconceptcodingi<testscriptusecontextvaluecodeableconceptcodinglist.size();testscriptusecontextvaluecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  testscriptusecontextvaluecodeableconceptcoding = testscriptusecontextvaluecodeableconceptcodinglist.get(testscriptusecontextvaluecodeableconceptcodingi);

		/******************** TstScrpt_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(testscriptusecontextvaluecodeableconceptcodingi == 0) {t.addTstScrptUseCntxtVlCdbleCncptCdgDsply("[[");}
		if(testscriptusecontextvaluecodeableconceptcoding.hasDisplay()) {

			t.addTstScrptUseCntxtVlCdbleCncptCdgDsply(String.valueOf(testscriptusecontextvaluecodeableconceptcoding.getDisplay()));
		} else {
			t.addTstScrptUseCntxtVlCdbleCncptCdgDsply("NULL");
		}

		if(testscriptusecontextvaluecodeableconceptcodingi == testscriptusecontextvaluecodeableconceptcodinglist.size()-1) {t.addTstScrptUseCntxtVlCdbleCncptCdgDsply("]]");}


		/******************** TstScrpt_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(testscriptusecontextvaluecodeableconceptcodingi == 0) {t.addTstScrptUseCntxtVlCdbleCncptCdgVrsn("[[");}
		if(testscriptusecontextvaluecodeableconceptcoding.hasVersion()) {

			t.addTstScrptUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(testscriptusecontextvaluecodeableconceptcoding.getVersion()));
		} else {
			t.addTstScrptUseCntxtVlCdbleCncptCdgVrsn("NULL");
		}

		if(testscriptusecontextvaluecodeableconceptcodingi == testscriptusecontextvaluecodeableconceptcodinglist.size()-1) {t.addTstScrptUseCntxtVlCdbleCncptCdgVrsn("]]");}


		/******************** TstScrpt_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(testscriptusecontextvaluecodeableconceptcodingi == 0) {t.addTstScrptUseCntxtVlCdbleCncptCdgCd("[[");}
		if(testscriptusecontextvaluecodeableconceptcoding.hasCode()) {

			t.addTstScrptUseCntxtVlCdbleCncptCdgCd(String.valueOf(testscriptusecontextvaluecodeableconceptcoding.getCode()));
		} else {
			t.addTstScrptUseCntxtVlCdbleCncptCdgCd("NULL");
		}

		if(testscriptusecontextvaluecodeableconceptcodingi == testscriptusecontextvaluecodeableconceptcodinglist.size()-1) {t.addTstScrptUseCntxtVlCdbleCncptCdgCd("]]");}


		/******************** TstScrpt_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(testscriptusecontextvaluecodeableconceptcodingi == 0) {t.addTstScrptUseCntxtVlCdbleCncptCdgUsrSltd("[[");}
		if(testscriptusecontextvaluecodeableconceptcoding.hasUserSelected()) {

			t.addTstScrptUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(testscriptusecontextvaluecodeableconceptcoding.getUserSelected()));
		} else {
			t.addTstScrptUseCntxtVlCdbleCncptCdgUsrSltd("NULL");
		}

		if(testscriptusecontextvaluecodeableconceptcodingi == testscriptusecontextvaluecodeableconceptcodinglist.size()-1) {t.addTstScrptUseCntxtVlCdbleCncptCdgUsrSltd("]]");}


		/******************** TstScrpt_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(testscriptusecontextvaluecodeableconceptcodingi == 0) {t.addTstScrptUseCntxtVlCdbleCncptCdgSys("[[");}
		if(testscriptusecontextvaluecodeableconceptcoding.hasSystem()) {

			t.addTstScrptUseCntxtVlCdbleCncptCdgSys(String.valueOf(testscriptusecontextvaluecodeableconceptcoding.getSystem()));
		} else {
			t.addTstScrptUseCntxtVlCdbleCncptCdgSys("NULL");
		}

		if(testscriptusecontextvaluecodeableconceptcodingi == testscriptusecontextvaluecodeableconceptcodinglist.size()-1) {t.addTstScrptUseCntxtVlCdbleCncptCdgSys("]]");}


		 };
		/******************** testscriptusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range testscriptusecontextvaluerange = testscriptusecontext.getValueRange();

		/******************** testscriptusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity testscriptusecontextvaluerangelow = testscriptusecontextvaluerange.getLow();

		/******************** TstScrpt_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(testscriptusecontexti == 0) {t.addTstScrptUseCntxtVlRngLwVl("[");}
		if(testscriptusecontextvaluerangelow.hasValue()) {

			t.addTstScrptUseCntxtVlRngLwVl(String.valueOf(testscriptusecontextvaluerangelow.getValue()));
		} else {
			t.addTstScrptUseCntxtVlRngLwVl("NULL");
		}

		if(testscriptusecontexti == testscriptusecontextlist.size()-1) {t.addTstScrptUseCntxtVlRngLwVl("]");}


		/******************** testscriptusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator testscriptusecontextvaluerangelowcomparator = testscriptusecontextvaluerangelow.getComparator();
		if(testscriptusecontextvaluerangelowcomparator!=null) {
		if(testscriptusecontexti == 0) {

		t.addTstScrptUseCntxtVlRngLwCmprtr("[");		}
			t.addTstScrptUseCntxtVlRngLwCmprtr(testscriptusecontextvaluerangelowcomparator.toCode());
		if(testscriptusecontexti == testscriptusecontextlist.size()-1) {

		t.addTstScrptUseCntxtVlRngLwCmprtr("]");		}

		} else {
			t.addTstScrptUseCntxtVlRngLwCmprtr("NULL");
		}

		/******************** TstScrpt_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(testscriptusecontexti == 0) {t.addTstScrptUseCntxtVlRngLwCd("[");}
		if(testscriptusecontextvaluerangelow.hasCode()) {

			t.addTstScrptUseCntxtVlRngLwCd(String.valueOf(testscriptusecontextvaluerangelow.getCode()));
		} else {
			t.addTstScrptUseCntxtVlRngLwCd("NULL");
		}

		if(testscriptusecontexti == testscriptusecontextlist.size()-1) {t.addTstScrptUseCntxtVlRngLwCd("]");}


		/******************** TstScrpt_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(testscriptusecontexti == 0) {t.addTstScrptUseCntxtVlRngLwUnt("[");}
		if(testscriptusecontextvaluerangelow.hasUnit()) {

			t.addTstScrptUseCntxtVlRngLwUnt(String.valueOf(testscriptusecontextvaluerangelow.getUnit()));
		} else {
			t.addTstScrptUseCntxtVlRngLwUnt("NULL");
		}

		if(testscriptusecontexti == testscriptusecontextlist.size()-1) {t.addTstScrptUseCntxtVlRngLwUnt("]");}


		/******************** TstScrpt_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(testscriptusecontexti == 0) {t.addTstScrptUseCntxtVlRngLwSys("[");}
		if(testscriptusecontextvaluerangelow.hasSystem()) {

			t.addTstScrptUseCntxtVlRngLwSys(String.valueOf(testscriptusecontextvaluerangelow.getSystem()));
		} else {
			t.addTstScrptUseCntxtVlRngLwSys("NULL");
		}

		if(testscriptusecontexti == testscriptusecontextlist.size()-1) {t.addTstScrptUseCntxtVlRngLwSys("]");}


		/******************** testscriptusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity testscriptusecontextvaluerangehigh = testscriptusecontextvaluerange.getHigh();

		/******************** TstScrpt_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(testscriptusecontexti == 0) {t.addTstScrptUseCntxtVlRngHiVl("[");}
		if(testscriptusecontextvaluerangehigh.hasValue()) {

			t.addTstScrptUseCntxtVlRngHiVl(String.valueOf(testscriptusecontextvaluerangehigh.getValue()));
		} else {
			t.addTstScrptUseCntxtVlRngHiVl("NULL");
		}

		if(testscriptusecontexti == testscriptusecontextlist.size()-1) {t.addTstScrptUseCntxtVlRngHiVl("]");}


		/******************** testscriptusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator testscriptusecontextvaluerangehighcomparator = testscriptusecontextvaluerangehigh.getComparator();
		if(testscriptusecontextvaluerangehighcomparator!=null) {
		if(testscriptusecontexti == 0) {

		t.addTstScrptUseCntxtVlRngHiCmprtr("[");		}
			t.addTstScrptUseCntxtVlRngHiCmprtr(testscriptusecontextvaluerangehighcomparator.toCode());
		if(testscriptusecontexti == testscriptusecontextlist.size()-1) {

		t.addTstScrptUseCntxtVlRngHiCmprtr("]");		}

		} else {
			t.addTstScrptUseCntxtVlRngHiCmprtr("NULL");
		}

		/******************** TstScrpt_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(testscriptusecontexti == 0) {t.addTstScrptUseCntxtVlRngHiCd("[");}
		if(testscriptusecontextvaluerangehigh.hasCode()) {

			t.addTstScrptUseCntxtVlRngHiCd(String.valueOf(testscriptusecontextvaluerangehigh.getCode()));
		} else {
			t.addTstScrptUseCntxtVlRngHiCd("NULL");
		}

		if(testscriptusecontexti == testscriptusecontextlist.size()-1) {t.addTstScrptUseCntxtVlRngHiCd("]");}


		/******************** TstScrpt_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(testscriptusecontexti == 0) {t.addTstScrptUseCntxtVlRngHiUnt("[");}
		if(testscriptusecontextvaluerangehigh.hasUnit()) {

			t.addTstScrptUseCntxtVlRngHiUnt(String.valueOf(testscriptusecontextvaluerangehigh.getUnit()));
		} else {
			t.addTstScrptUseCntxtVlRngHiUnt("NULL");
		}

		if(testscriptusecontexti == testscriptusecontextlist.size()-1) {t.addTstScrptUseCntxtVlRngHiUnt("]");}


		/******************** TstScrpt_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(testscriptusecontexti == 0) {t.addTstScrptUseCntxtVlRngHiSys("[");}
		if(testscriptusecontextvaluerangehigh.hasSystem()) {

			t.addTstScrptUseCntxtVlRngHiSys(String.valueOf(testscriptusecontextvaluerangehigh.getSystem()));
		} else {
			t.addTstScrptUseCntxtVlRngHiSys("NULL");
		}

		if(testscriptusecontexti == testscriptusecontextlist.size()-1) {t.addTstScrptUseCntxtVlRngHiSys("]");}


		/******************** testscriptusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity testscriptusecontextvaluequantity = testscriptusecontext.getValueQuantity();

		/******************** TstScrpt_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(testscriptusecontexti == 0) {t.addTstScrptUseCntxtVlQntyVl("[");}
		if(testscriptusecontextvaluequantity.hasValue()) {

			t.addTstScrptUseCntxtVlQntyVl(String.valueOf(testscriptusecontextvaluequantity.getValue()));
		} else {
			t.addTstScrptUseCntxtVlQntyVl("NULL");
		}

		if(testscriptusecontexti == testscriptusecontextlist.size()-1) {t.addTstScrptUseCntxtVlQntyVl("]");}


		/******************** testscriptusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator testscriptusecontextvaluequantitycomparator = testscriptusecontextvaluequantity.getComparator();
		if(testscriptusecontextvaluequantitycomparator!=null) {
		if(testscriptusecontexti == 0) {

		t.addTstScrptUseCntxtVlQntyCmprtr("[");		}
			t.addTstScrptUseCntxtVlQntyCmprtr(testscriptusecontextvaluequantitycomparator.toCode());
		if(testscriptusecontexti == testscriptusecontextlist.size()-1) {

		t.addTstScrptUseCntxtVlQntyCmprtr("]");		}

		} else {
			t.addTstScrptUseCntxtVlQntyCmprtr("NULL");
		}

		/******************** TstScrpt_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(testscriptusecontexti == 0) {t.addTstScrptUseCntxtVlQntyCd("[");}
		if(testscriptusecontextvaluequantity.hasCode()) {

			t.addTstScrptUseCntxtVlQntyCd(String.valueOf(testscriptusecontextvaluequantity.getCode()));
		} else {
			t.addTstScrptUseCntxtVlQntyCd("NULL");
		}

		if(testscriptusecontexti == testscriptusecontextlist.size()-1) {t.addTstScrptUseCntxtVlQntyCd("]");}


		/******************** TstScrpt_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(testscriptusecontexti == 0) {t.addTstScrptUseCntxtVlQntyUnt("[");}
		if(testscriptusecontextvaluequantity.hasUnit()) {

			t.addTstScrptUseCntxtVlQntyUnt(String.valueOf(testscriptusecontextvaluequantity.getUnit()));
		} else {
			t.addTstScrptUseCntxtVlQntyUnt("NULL");
		}

		if(testscriptusecontexti == testscriptusecontextlist.size()-1) {t.addTstScrptUseCntxtVlQntyUnt("]");}


		/******************** TstScrpt_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(testscriptusecontexti == 0) {t.addTstScrptUseCntxtVlQntySys("[");}
		if(testscriptusecontextvaluequantity.hasSystem()) {

			t.addTstScrptUseCntxtVlQntySys(String.valueOf(testscriptusecontextvaluequantity.getSystem()));
		} else {
			t.addTstScrptUseCntxtVlQntySys("NULL");
		}

		if(testscriptusecontexti == testscriptusecontextlist.size()-1) {t.addTstScrptUseCntxtVlQntySys("]");}


		 };
		/******************** TstScrpt_Exprmtl ********************************************************************************/
		if(testscript.hasExperimental()) {

			t.addTstScrptExprmtl(String.valueOf(testscript.getExperimental()));
		} else {
			t.addTstScrptExprmtl("NULL");
		}


		/******************** TstScrpt_Pblshr ********************************************************************************/
		if(testscript.hasPublisher()) {

			t.addTstScrptPblshr(String.valueOf(testscript.getPublisher()));
		} else {
			t.addTstScrptPblshr("NULL");
		}


		return t;
	}
}
