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

		/******************** testscriptcontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail testscriptcontact =  new org.hl7.fhir.r4.model.ContactDetail();
		testscript.addContact(testscriptcontact);

		/******************** TstScrpt_Cntct_Nm ********************************************************************************/
		if(t.getTstScrptCntctNm() != null) {
			testscriptcontact.setName(t.getTstScrptCntctNm());
		}
		/******************** testscriptcontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint testscriptcontacttelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		testscriptcontact.addTelecom(testscriptcontacttelecom);

		/******************** testscriptcontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period testscriptcontacttelecomperiod =  new org.hl7.fhir.r4.model.Period();
		testscriptcontacttelecom.setPeriod(testscriptcontacttelecomperiod);

		/******************** TstScrpt_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(t.getTstScrptCntctTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat TstScrpt_Cntct_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date TstScrpt_Cntct_Tlcm_Prd_Enddate = TstScrpt_Cntct_Tlcm_Prd_Endsdf.parse(t.getTstScrptCntctTlcmPrdEnd());
			testscriptcontacttelecomperiod.setEnd(TstScrpt_Cntct_Tlcm_Prd_Enddate);
		}
		/******************** TstScrpt_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(t.getTstScrptCntctTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat TstScrpt_Cntct_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date TstScrpt_Cntct_Tlcm_Prd_Strtdate = TstScrpt_Cntct_Tlcm_Prd_Strtsdf.parse(t.getTstScrptCntctTlcmPrdStrt());
			testscriptcontacttelecomperiod.setStart(TstScrpt_Cntct_Tlcm_Prd_Strtdate);
		}
		/******************** TstScrpt_Cntct_Tlcm_Rnk ********************************************************************************/
		if(t.getTstScrptCntctTlcmRnk() != null) {
			testscriptcontacttelecom.setRank(Integer.parseInt(t.getTstScrptCntctTlcmRnk()));
		}
		/******************** testscriptcontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory testscriptcontacttelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		testscriptcontacttelecom.setSystem(testscriptcontacttelecomsystem.fromCode(t.getTstScrptCntctTlcmSys()));

		/******************** testscriptcontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory testscriptcontacttelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		testscriptcontacttelecom.setUse(testscriptcontacttelecomuse.fromCode(t.getTstScrptCntctTlcmUse()));

		/******************** TstScrpt_Cntct_Tlcm_Vl ********************************************************************************/
		if(t.getTstScrptCntctTlcmVl() != null) {
			testscriptcontacttelecom.setValue(t.getTstScrptCntctTlcmVl());
		}
		/******************** TstScrpt_Copyright ********************************************************************************/
		if(t.getTstScrptCopyright() != null) {
			testscript.setCopyright(t.getTstScrptCopyright());
		}
		/******************** TstScrpt_Dt ********************************************************************************/
		if(t.getTstScrptDt() != null) {
			java.text.SimpleDateFormat TstScrpt_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date TstScrpt_Dtdate = TstScrpt_Dtsdf.parse(t.getTstScrptDt());
			testscript.setDate(TstScrpt_Dtdate);
		}
		/******************** TstScrpt_Dscrptn ********************************************************************************/
		if(t.getTstScrptDscrptn() != null) {
			testscript.setDescription(t.getTstScrptDscrptn());
		}
		/******************** testscriptdestination ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptDestinationComponent testscriptdestination =  new org.hl7.fhir.r4.model.TestScript.TestScriptDestinationComponent();
		testscript.addDestination(testscriptdestination);

		/******************** TstScrpt_Destination_Index ********************************************************************************/
		if(t.getTstScrptDestinationIndex() != null) {
			testscriptdestination.setIndex(Integer.parseInt(t.getTstScrptDestinationIndex()));
		}
		/******************** testscriptdestinationprofile ********************************************************************************/
		org.hl7.fhir.r4.model.Coding testscriptdestinationprofile =  new org.hl7.fhir.r4.model.Coding();
		testscriptdestination.setProfile(testscriptdestinationprofile);

		/******************** TstScrpt_Destination_Profile_Cd ********************************************************************************/
		if(t.getTstScrptDestinationProfileCd() != null) {
			testscriptdestinationprofile.setCode(t.getTstScrptDestinationProfileCd());
		}
		/******************** TstScrpt_Destination_Profile_Dsply ********************************************************************************/
		if(t.getTstScrptDestinationProfileDsply() != null) {
			testscriptdestinationprofile.setDisplay(t.getTstScrptDestinationProfileDsply());
		}
		/******************** TstScrpt_Destination_Profile_Sys ********************************************************************************/
		if(t.getTstScrptDestinationProfileSys() != null) {
			testscriptdestinationprofile.setSystem(t.getTstScrptDestinationProfileSys());
		}
		/******************** TstScrpt_Destination_Profile_UsrSltd ********************************************************************************/
		if(t.getTstScrptDestinationProfileUsrSltd() != null) {
			testscriptdestinationprofile.setUserSelected(Boolean.parseBoolean(t.getTstScrptDestinationProfileUsrSltd()));
		}
		/******************** TstScrpt_Destination_Profile_Vrsn ********************************************************************************/
		if(t.getTstScrptDestinationProfileVrsn() != null) {
			testscriptdestinationprofile.setVersion(t.getTstScrptDestinationProfileVrsn());
		}
		/******************** TstScrpt_Exprmtl ********************************************************************************/
		if(t.getTstScrptExprmtl() != null) {
			testscript.setExperimental(Boolean.parseBoolean(t.getTstScrptExprmtl()));
		}
		/******************** testscriptfixture ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptFixtureComponent testscriptfixture =  new org.hl7.fhir.r4.model.TestScript.TestScriptFixtureComponent();
		testscript.addFixture(testscriptfixture);

		/******************** TstScrpt_Fixture_Autocreate ********************************************************************************/
		if(t.getTstScrptFixtureAutocreate() != null) {
			testscriptfixture.setAutocreate(Boolean.parseBoolean(t.getTstScrptFixtureAutocreate()));
		}
		/******************** TstScrpt_Fixture_Autodelete ********************************************************************************/
		if(t.getTstScrptFixtureAutodelete() != null) {
			testscriptfixture.setAutodelete(Boolean.parseBoolean(t.getTstScrptFixtureAutodelete()));
		}
		/******************** TstScrpt_Fixture_Rsrc ********************************************************************************/
		if(t.getTstScrptFixtureRsrc() != null) {
			testscriptfixture.setResource( new org.hl7.fhir.r4.model.Reference(t.getTstScrptFixtureRsrc()));
		}
		/******************** testscriptidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier testscriptidentifier =  new org.hl7.fhir.r4.model.Identifier();
		testscript.setIdentifier(testscriptidentifier);

		/******************** TstScrpt_Id_Assigner ********************************************************************************/
		if(t.getTstScrptIdAssigner() != null) {
			testscriptidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(t.getTstScrptIdAssigner()));
		}
		/******************** testscriptidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period testscriptidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		testscriptidentifier.setPeriod(testscriptidentifierperiod);

		/******************** TstScrpt_Id_Prd_End ********************************************************************************/
		if(t.getTstScrptIdPrdEnd() != null) {
			java.text.SimpleDateFormat TstScrpt_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date TstScrpt_Id_Prd_Enddate = TstScrpt_Id_Prd_Endsdf.parse(t.getTstScrptIdPrdEnd());
			testscriptidentifierperiod.setEnd(TstScrpt_Id_Prd_Enddate);
		}
		/******************** TstScrpt_Id_Prd_Strt ********************************************************************************/
		if(t.getTstScrptIdPrdStrt() != null) {
			java.text.SimpleDateFormat TstScrpt_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date TstScrpt_Id_Prd_Strtdate = TstScrpt_Id_Prd_Strtsdf.parse(t.getTstScrptIdPrdStrt());
			testscriptidentifierperiod.setStart(TstScrpt_Id_Prd_Strtdate);
		}
		/******************** TstScrpt_Id_Sys ********************************************************************************/
		if(t.getTstScrptIdSys() != null) {
			testscriptidentifier.setSystem(t.getTstScrptIdSys());
		}
		/******************** testscriptidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept testscriptidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		testscriptidentifier.setType(testscriptidentifiertype);

		/******************** testscriptidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding testscriptidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		testscriptidentifiertype.addCoding(testscriptidentifiertypecoding);

		/******************** TstScrpt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(t.getTstScrptIdTypCdgCd() != null) {
			testscriptidentifiertypecoding.setCode(t.getTstScrptIdTypCdgCd());
		}
		/******************** TstScrpt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(t.getTstScrptIdTypCdgDsply() != null) {
			testscriptidentifiertypecoding.setDisplay(t.getTstScrptIdTypCdgDsply());
		}
		/******************** TstScrpt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(t.getTstScrptIdTypCdgSys() != null) {
			testscriptidentifiertypecoding.setSystem(t.getTstScrptIdTypCdgSys());
		}
		/******************** TstScrpt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(t.getTstScrptIdTypCdgUsrSltd() != null) {
			testscriptidentifiertypecoding.setUserSelected(Boolean.parseBoolean(t.getTstScrptIdTypCdgUsrSltd()));
		}
		/******************** TstScrpt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(t.getTstScrptIdTypCdgVrsn() != null) {
			testscriptidentifiertypecoding.setVersion(t.getTstScrptIdTypCdgVrsn());
		}
		/******************** TstScrpt_Id_Typ_Txt ********************************************************************************/
		if(t.getTstScrptIdTypTxt() != null) {
			testscriptidentifiertype.setText(t.getTstScrptIdTypTxt());
		}
		/******************** testscriptidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory testscriptidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		testscriptidentifier.setUse(testscriptidentifieruse.fromCode(t.getTstScrptIdUse()));

		/******************** TstScrpt_Id_Vl ********************************************************************************/
		if(t.getTstScrptIdVl() != null) {
			testscriptidentifier.setValue(t.getTstScrptIdVl());
		}
		/******************** testscriptjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept testscriptjurisdiction =  new org.hl7.fhir.r4.model.CodeableConcept();
		testscript.addJurisdiction(testscriptjurisdiction);

		/******************** testscriptjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding testscriptjurisdictioncoding =  new org.hl7.fhir.r4.model.Coding();
		testscriptjurisdiction.addCoding(testscriptjurisdictioncoding);

		/******************** TstScrpt_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(t.getTstScrptJrsdctnCdgCd() != null) {
			testscriptjurisdictioncoding.setCode(t.getTstScrptJrsdctnCdgCd());
		}
		/******************** TstScrpt_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(t.getTstScrptJrsdctnCdgDsply() != null) {
			testscriptjurisdictioncoding.setDisplay(t.getTstScrptJrsdctnCdgDsply());
		}
		/******************** TstScrpt_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(t.getTstScrptJrsdctnCdgSys() != null) {
			testscriptjurisdictioncoding.setSystem(t.getTstScrptJrsdctnCdgSys());
		}
		/******************** TstScrpt_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(t.getTstScrptJrsdctnCdgUsrSltd() != null) {
			testscriptjurisdictioncoding.setUserSelected(Boolean.parseBoolean(t.getTstScrptJrsdctnCdgUsrSltd()));
		}
		/******************** TstScrpt_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(t.getTstScrptJrsdctnCdgVrsn() != null) {
			testscriptjurisdictioncoding.setVersion(t.getTstScrptJrsdctnCdgVrsn());
		}
		/******************** TstScrpt_Jrsdctn_Txt ********************************************************************************/
		if(t.getTstScrptJrsdctnTxt() != null) {
			testscriptjurisdiction.setText(t.getTstScrptJrsdctnTxt());
		}
		/******************** testscriptmetadata ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptMetadataComponent testscriptmetadata =  new org.hl7.fhir.r4.model.TestScript.TestScriptMetadataComponent();
		testscript.setMetadata(testscriptmetadata);

		/******************** testscriptmetadatacapability ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptMetadataCapabilityComponent testscriptmetadatacapability =  new org.hl7.fhir.r4.model.TestScript.TestScriptMetadataCapabilityComponent();
		testscriptmetadata.addCapability(testscriptmetadatacapability);

		/******************** TstScrpt_Metadata_Capblty_Cpnlties ********************************************************************************/
		if(t.getTstScrptMetadataCapbltyCpnlties() != null) {
			testscriptmetadatacapability.setCapabilities(t.getTstScrptMetadataCapbltyCpnlties());
		}
		/******************** TstScrpt_Metadata_Capblty_Dscrptn ********************************************************************************/
		if(t.getTstScrptMetadataCapbltyDscrptn() != null) {
			testscriptmetadatacapability.setDescription(t.getTstScrptMetadataCapbltyDscrptn());
		}
		/******************** TstScrpt_Metadata_Capblty_Destination ********************************************************************************/
		if(t.getTstScrptMetadataCapbltyDestination() != null) {
			testscriptmetadatacapability.setDestination(Integer.parseInt(t.getTstScrptMetadataCapbltyDestination()));
		}
		/******************** TstScrpt_Metadata_Capblty_Link ********************************************************************************/
		if(t.getTstScrptMetadataCapbltyLink() != null) {
			testscriptmetadatacapability.addLink(t.getTstScrptMetadataCapbltyLink());
		}
		/******************** TstScrpt_Metadata_Capblty_Origin ********************************************************************************/
		if(t.getTstScrptMetadataCapbltyOrigin() != null) {
			testscriptmetadatacapability.addOrigin(Integer.parseInt(t.getTstScrptMetadataCapbltyOrigin()));
		}
		/******************** TstScrpt_Metadata_Capblty_Required ********************************************************************************/
		if(t.getTstScrptMetadataCapbltyRequired() != null) {
			testscriptmetadatacapability.setRequired(Boolean.parseBoolean(t.getTstScrptMetadataCapbltyRequired()));
		}
		/******************** TstScrpt_Metadata_Capblty_Validated ********************************************************************************/
		if(t.getTstScrptMetadataCapbltyValidated() != null) {
			testscriptmetadatacapability.setValidated(Boolean.parseBoolean(t.getTstScrptMetadataCapbltyValidated()));
		}
		/******************** testscriptmetadatalink ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptMetadataLinkComponent testscriptmetadatalink =  new org.hl7.fhir.r4.model.TestScript.TestScriptMetadataLinkComponent();
		testscriptmetadata.addLink(testscriptmetadatalink);

		/******************** TstScrpt_Metadata_Link_Dscrptn ********************************************************************************/
		if(t.getTstScrptMetadataLinkDscrptn() != null) {
			testscriptmetadatalink.setDescription(t.getTstScrptMetadataLinkDscrptn());
		}
		/******************** TstScrpt_Metadata_Link_Url ********************************************************************************/
		if(t.getTstScrptMetadataLinkUrl() != null) {
			testscriptmetadatalink.setUrl(t.getTstScrptMetadataLinkUrl());
		}
		/******************** TstScrpt_Nm ********************************************************************************/
		if(t.getTstScrptNm() != null) {
			testscript.setName(t.getTstScrptNm());
		}
		/******************** testscriptorigin ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptOriginComponent testscriptorigin =  new org.hl7.fhir.r4.model.TestScript.TestScriptOriginComponent();
		testscript.addOrigin(testscriptorigin);

		/******************** TstScrpt_Origin_Index ********************************************************************************/
		if(t.getTstScrptOriginIndex() != null) {
			testscriptorigin.setIndex(Integer.parseInt(t.getTstScrptOriginIndex()));
		}
		/******************** testscriptoriginprofile ********************************************************************************/
		org.hl7.fhir.r4.model.Coding testscriptoriginprofile =  new org.hl7.fhir.r4.model.Coding();
		testscriptorigin.setProfile(testscriptoriginprofile);

		/******************** TstScrpt_Origin_Profile_Cd ********************************************************************************/
		if(t.getTstScrptOriginProfileCd() != null) {
			testscriptoriginprofile.setCode(t.getTstScrptOriginProfileCd());
		}
		/******************** TstScrpt_Origin_Profile_Dsply ********************************************************************************/
		if(t.getTstScrptOriginProfileDsply() != null) {
			testscriptoriginprofile.setDisplay(t.getTstScrptOriginProfileDsply());
		}
		/******************** TstScrpt_Origin_Profile_Sys ********************************************************************************/
		if(t.getTstScrptOriginProfileSys() != null) {
			testscriptoriginprofile.setSystem(t.getTstScrptOriginProfileSys());
		}
		/******************** TstScrpt_Origin_Profile_UsrSltd ********************************************************************************/
		if(t.getTstScrptOriginProfileUsrSltd() != null) {
			testscriptoriginprofile.setUserSelected(Boolean.parseBoolean(t.getTstScrptOriginProfileUsrSltd()));
		}
		/******************** TstScrpt_Origin_Profile_Vrsn ********************************************************************************/
		if(t.getTstScrptOriginProfileVrsn() != null) {
			testscriptoriginprofile.setVersion(t.getTstScrptOriginProfileVrsn());
		}
		/******************** TstScrpt_Profile ********************************************************************************/
		if(t.getTstScrptProfile() != null) {
			testscript.addProfile( new org.hl7.fhir.r4.model.Reference(t.getTstScrptProfile()));
		}
		/******************** TstScrpt_Pblshr ********************************************************************************/
		if(t.getTstScrptPblshr() != null) {
			testscript.setPublisher(t.getTstScrptPblshr());
		}
		/******************** TstScrpt_Prpse ********************************************************************************/
		if(t.getTstScrptPrpse() != null) {
			testscript.setPurpose(t.getTstScrptPrpse());
		}
		/******************** testscriptsetup ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptSetupComponent testscriptsetup =  new org.hl7.fhir.r4.model.TestScript.TestScriptSetupComponent();
		testscript.setSetup(testscriptsetup);

		/******************** testscriptsetupaction ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.SetupActionComponent testscriptsetupaction =  new org.hl7.fhir.r4.model.TestScript.SetupActionComponent();
		testscriptsetup.addAction(testscriptsetupaction);

		/******************** testscriptsetupactionassert ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.SetupActionAssertComponent testscriptsetupactionassert =  new org.hl7.fhir.r4.model.TestScript.SetupActionAssertComponent();
		testscriptsetupaction.setAssert(testscriptsetupactionassert);

		/******************** TstScrpt_Stup_Actn_Assert_CompareToSrcExprsn ********************************************************************************/
		if(t.getTstScrptStupActnAssertCompareToSrcExprsn() != null) {
			testscriptsetupactionassert.setCompareToSourceExpression(t.getTstScrptStupActnAssertCompareToSrcExprsn());
		}
		/******************** TstScrpt_Stup_Actn_Assert_CompareToSrcId ********************************************************************************/
		if(t.getTstScrptStupActnAssertCompareToSrcId() != null) {
			testscriptsetupactionassert.setCompareToSourceId(t.getTstScrptStupActnAssertCompareToSrcId());
		}
		/******************** TstScrpt_Stup_Actn_Assert_CompareToSrcPath ********************************************************************************/
		if(t.getTstScrptStupActnAssertCompareToSrcPath() != null) {
			testscriptsetupactionassert.setCompareToSourcePath(t.getTstScrptStupActnAssertCompareToSrcPath());
		}
		/******************** TstScrpt_Stup_Actn_Assert_CntntTyp ********************************************************************************/
		if(t.getTstScrptStupActnAssertCntntTyp() != null) {
			testscriptsetupactionassert.setContentType(t.getTstScrptStupActnAssertCntntTyp());
		}
		/******************** TstScrpt_Stup_Actn_Assert_Dscrptn ********************************************************************************/
		if(t.getTstScrptStupActnAssertDscrptn() != null) {
			testscriptsetupactionassert.setDescription(t.getTstScrptStupActnAssertDscrptn());
		}
		/******************** testscriptsetupactionassertdirection ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.AssertionDirectionTypeEnumFactory testscriptsetupactionassertdirection =  new org.hl7.fhir.r4.model.TestScript.AssertionDirectionTypeEnumFactory();
		testscriptsetupactionassert.setDirection(testscriptsetupactionassertdirection.fromCode(t.getTstScrptStupActnAssertDirection()));

		/******************** TstScrpt_Stup_Actn_Assert_Exprsn ********************************************************************************/
		if(t.getTstScrptStupActnAssertExprsn() != null) {
			testscriptsetupactionassert.setExpression(t.getTstScrptStupActnAssertExprsn());
		}
		/******************** TstScrpt_Stup_Actn_Assert_HeaderField ********************************************************************************/
		if(t.getTstScrptStupActnAssertHeaderField() != null) {
			testscriptsetupactionassert.setHeaderField(t.getTstScrptStupActnAssertHeaderField());
		}
		/******************** TstScrpt_Stup_Actn_Assert_Lbl ********************************************************************************/
		if(t.getTstScrptStupActnAssertLbl() != null) {
			testscriptsetupactionassert.setLabel(t.getTstScrptStupActnAssertLbl());
		}
		/******************** TstScrpt_Stup_Actn_Assert_MinimumId ********************************************************************************/
		if(t.getTstScrptStupActnAssertMinimumId() != null) {
			testscriptsetupactionassert.setMinimumId(t.getTstScrptStupActnAssertMinimumId());
		}
		/******************** TstScrpt_Stup_Actn_Assert_NavigationLinks ********************************************************************************/
		if(t.getTstScrptStupActnAssertNavigationLinks() != null) {
			testscriptsetupactionassert.setNavigationLinks(Boolean.parseBoolean(t.getTstScrptStupActnAssertNavigationLinks()));
		}
		/******************** testscriptsetupactionassertoperator ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.AssertionOperatorTypeEnumFactory testscriptsetupactionassertoperator =  new org.hl7.fhir.r4.model.TestScript.AssertionOperatorTypeEnumFactory();
		testscriptsetupactionassert.setOperator(testscriptsetupactionassertoperator.fromCode(t.getTstScrptStupActnAssertOperator()));

		/******************** TstScrpt_Stup_Actn_Assert_Path ********************************************************************************/
		if(t.getTstScrptStupActnAssertPath() != null) {
			testscriptsetupactionassert.setPath(t.getTstScrptStupActnAssertPath());
		}
		/******************** testscriptsetupactionassertrequestmethod ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptRequestMethodCodeEnumFactory testscriptsetupactionassertrequestmethod =  new org.hl7.fhir.r4.model.TestScript.TestScriptRequestMethodCodeEnumFactory();
		testscriptsetupactionassert.setRequestMethod(testscriptsetupactionassertrequestmethod.fromCode(t.getTstScrptStupActnAssertRqstMthd()));

		/******************** TstScrpt_Stup_Actn_Assert_RqstUrl ********************************************************************************/
		if(t.getTstScrptStupActnAssertRqstUrl() != null) {
			testscriptsetupactionassert.setRequestURL(t.getTstScrptStupActnAssertRqstUrl());
		}
		/******************** TstScrpt_Stup_Actn_Assert_Rsrc ********************************************************************************/
		if(t.getTstScrptStupActnAssertRsrc() != null) {
			testscriptsetupactionassert.setResource(t.getTstScrptStupActnAssertRsrc());
		}
		/******************** testscriptsetupactionassertresponse ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.AssertionResponseTypesEnumFactory testscriptsetupactionassertresponse =  new org.hl7.fhir.r4.model.TestScript.AssertionResponseTypesEnumFactory();
		testscriptsetupactionassert.setResponse(testscriptsetupactionassertresponse.fromCode(t.getTstScrptStupActnAssertRsps()));

		/******************** TstScrpt_Stup_Actn_Assert_RspsCd ********************************************************************************/
		if(t.getTstScrptStupActnAssertRspsCd() != null) {
			testscriptsetupactionassert.setResponseCode(t.getTstScrptStupActnAssertRspsCd());
		}
		/******************** TstScrpt_Stup_Actn_Assert_SrcId ********************************************************************************/
		if(t.getTstScrptStupActnAssertSrcId() != null) {
			testscriptsetupactionassert.setSourceId(t.getTstScrptStupActnAssertSrcId());
		}
		/******************** TstScrpt_Stup_Actn_Assert_ValidateProfileId ********************************************************************************/
		if(t.getTstScrptStupActnAssertValidateProfileId() != null) {
			testscriptsetupactionassert.setValidateProfileId(t.getTstScrptStupActnAssertValidateProfileId());
		}
		/******************** TstScrpt_Stup_Actn_Assert_Vl ********************************************************************************/
		if(t.getTstScrptStupActnAssertVl() != null) {
			testscriptsetupactionassert.setValue(t.getTstScrptStupActnAssertVl());
		}
		/******************** TstScrpt_Stup_Actn_Assert_WarningOnly ********************************************************************************/
		if(t.getTstScrptStupActnAssertWarningOnly() != null) {
			testscriptsetupactionassert.setWarningOnly(Boolean.parseBoolean(t.getTstScrptStupActnAssertWarningOnly()));
		}
		/******************** testscriptsetupactionoperation ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.SetupActionOperationComponent testscriptsetupactionoperation =  new org.hl7.fhir.r4.model.TestScript.SetupActionOperationComponent();
		testscriptsetupaction.setOperation(testscriptsetupactionoperation);

		/******************** TstScrpt_Stup_Actn_Oprtn_Accept ********************************************************************************/
		if(t.getTstScrptStupActnOprtnAccept() != null) {
			testscriptsetupactionoperation.setAccept(t.getTstScrptStupActnOprtnAccept());
		}
		/******************** TstScrpt_Stup_Actn_Oprtn_CntntTyp ********************************************************************************/
		if(t.getTstScrptStupActnOprtnCntntTyp() != null) {
			testscriptsetupactionoperation.setContentType(t.getTstScrptStupActnOprtnCntntTyp());
		}
		/******************** TstScrpt_Stup_Actn_Oprtn_Dscrptn ********************************************************************************/
		if(t.getTstScrptStupActnOprtnDscrptn() != null) {
			testscriptsetupactionoperation.setDescription(t.getTstScrptStupActnOprtnDscrptn());
		}
		/******************** TstScrpt_Stup_Actn_Oprtn_Destination ********************************************************************************/
		if(t.getTstScrptStupActnOprtnDestination() != null) {
			testscriptsetupactionoperation.setDestination(Integer.parseInt(t.getTstScrptStupActnOprtnDestination()));
		}
		/******************** TstScrpt_Stup_Actn_Oprtn_EncodeRqstUrl ********************************************************************************/
		if(t.getTstScrptStupActnOprtnEncodeRqstUrl() != null) {
			testscriptsetupactionoperation.setEncodeRequestUrl(Boolean.parseBoolean(t.getTstScrptStupActnOprtnEncodeRqstUrl()));
		}
		/******************** TstScrpt_Stup_Actn_Oprtn_Lbl ********************************************************************************/
		if(t.getTstScrptStupActnOprtnLbl() != null) {
			testscriptsetupactionoperation.setLabel(t.getTstScrptStupActnOprtnLbl());
		}
		/******************** testscriptsetupactionoperationmethod ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptRequestMethodCodeEnumFactory testscriptsetupactionoperationmethod =  new org.hl7.fhir.r4.model.TestScript.TestScriptRequestMethodCodeEnumFactory();
		testscriptsetupactionoperation.setMethod(testscriptsetupactionoperationmethod.fromCode(t.getTstScrptStupActnOprtnMthd()));

		/******************** TstScrpt_Stup_Actn_Oprtn_Origin ********************************************************************************/
		if(t.getTstScrptStupActnOprtnOrigin() != null) {
			testscriptsetupactionoperation.setOrigin(Integer.parseInt(t.getTstScrptStupActnOprtnOrigin()));
		}
		/******************** TstScrpt_Stup_Actn_Oprtn_Params ********************************************************************************/
		if(t.getTstScrptStupActnOprtnParams() != null) {
			testscriptsetupactionoperation.setParams(t.getTstScrptStupActnOprtnParams());
		}
		/******************** testscriptsetupactionoperationrequestheader ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.SetupActionOperationRequestHeaderComponent testscriptsetupactionoperationrequestheader =  new org.hl7.fhir.r4.model.TestScript.SetupActionOperationRequestHeaderComponent();
		testscriptsetupactionoperation.addRequestHeader(testscriptsetupactionoperationrequestheader);

		/******************** TstScrpt_Stup_Actn_Oprtn_RqstHeader_Field ********************************************************************************/
		if(t.getTstScrptStupActnOprtnRqstHeaderField() != null) {
			testscriptsetupactionoperationrequestheader.setField(t.getTstScrptStupActnOprtnRqstHeaderField());
		}
		/******************** TstScrpt_Stup_Actn_Oprtn_RqstHeader_Vl ********************************************************************************/
		if(t.getTstScrptStupActnOprtnRqstHeaderVl() != null) {
			testscriptsetupactionoperationrequestheader.setValue(t.getTstScrptStupActnOprtnRqstHeaderVl());
		}
		/******************** TstScrpt_Stup_Actn_Oprtn_RqstId ********************************************************************************/
		if(t.getTstScrptStupActnOprtnRqstId() != null) {
			testscriptsetupactionoperation.setRequestId(t.getTstScrptStupActnOprtnRqstId());
		}
		/******************** TstScrpt_Stup_Actn_Oprtn_Rsrc ********************************************************************************/
		if(t.getTstScrptStupActnOprtnRsrc() != null) {
			testscriptsetupactionoperation.setResource(t.getTstScrptStupActnOprtnRsrc());
		}
		/******************** TstScrpt_Stup_Actn_Oprtn_RspsId ********************************************************************************/
		if(t.getTstScrptStupActnOprtnRspsId() != null) {
			testscriptsetupactionoperation.setResponseId(t.getTstScrptStupActnOprtnRspsId());
		}
		/******************** TstScrpt_Stup_Actn_Oprtn_SrcId ********************************************************************************/
		if(t.getTstScrptStupActnOprtnSrcId() != null) {
			testscriptsetupactionoperation.setSourceId(t.getTstScrptStupActnOprtnSrcId());
		}
		/******************** TstScrpt_Stup_Actn_Oprtn_TarId ********************************************************************************/
		if(t.getTstScrptStupActnOprtnTarId() != null) {
			testscriptsetupactionoperation.setTargetId(t.getTstScrptStupActnOprtnTarId());
		}
		/******************** testscriptsetupactionoperationtype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding testscriptsetupactionoperationtype =  new org.hl7.fhir.r4.model.Coding();
		testscriptsetupactionoperation.setType(testscriptsetupactionoperationtype);

		/******************** TstScrpt_Stup_Actn_Oprtn_Typ_Cd ********************************************************************************/
		if(t.getTstScrptStupActnOprtnTypCd() != null) {
			testscriptsetupactionoperationtype.setCode(t.getTstScrptStupActnOprtnTypCd());
		}
		/******************** TstScrpt_Stup_Actn_Oprtn_Typ_Dsply ********************************************************************************/
		if(t.getTstScrptStupActnOprtnTypDsply() != null) {
			testscriptsetupactionoperationtype.setDisplay(t.getTstScrptStupActnOprtnTypDsply());
		}
		/******************** TstScrpt_Stup_Actn_Oprtn_Typ_Sys ********************************************************************************/
		if(t.getTstScrptStupActnOprtnTypSys() != null) {
			testscriptsetupactionoperationtype.setSystem(t.getTstScrptStupActnOprtnTypSys());
		}
		/******************** TstScrpt_Stup_Actn_Oprtn_Typ_UsrSltd ********************************************************************************/
		if(t.getTstScrptStupActnOprtnTypUsrSltd() != null) {
			testscriptsetupactionoperationtype.setUserSelected(Boolean.parseBoolean(t.getTstScrptStupActnOprtnTypUsrSltd()));
		}
		/******************** TstScrpt_Stup_Actn_Oprtn_Typ_Vrsn ********************************************************************************/
		if(t.getTstScrptStupActnOprtnTypVrsn() != null) {
			testscriptsetupactionoperationtype.setVersion(t.getTstScrptStupActnOprtnTypVrsn());
		}
		/******************** TstScrpt_Stup_Actn_Oprtn_Url ********************************************************************************/
		if(t.getTstScrptStupActnOprtnUrl() != null) {
			testscriptsetupactionoperation.setUrl(t.getTstScrptStupActnOprtnUrl());
		}
		/******************** testscriptstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory testscriptstatus =  new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory();
		testscript.setStatus(testscriptstatus.fromCode(t.getTstScrptSts()));

		/******************** testscriptteardown ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptTeardownComponent testscriptteardown =  new org.hl7.fhir.r4.model.TestScript.TestScriptTeardownComponent();
		testscript.setTeardown(testscriptteardown);

		/******************** testscriptteardownaction ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TeardownActionComponent testscriptteardownaction =  new org.hl7.fhir.r4.model.TestScript.TeardownActionComponent();
		testscriptteardown.addAction(testscriptteardownaction);

		/******************** testscriptteardownactionoperation ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.SetupActionOperationComponent testscriptteardownactionoperation =  new org.hl7.fhir.r4.model.TestScript.SetupActionOperationComponent();
		testscriptteardownaction.setOperation(testscriptteardownactionoperation);

		/******************** TstScrpt_Teardown_Actn_Oprtn_Accept ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnAccept() != null) {
			testscriptteardownactionoperation.setAccept(t.getTstScrptTeardownActnOprtnAccept());
		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_CntntTyp ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnCntntTyp() != null) {
			testscriptteardownactionoperation.setContentType(t.getTstScrptTeardownActnOprtnCntntTyp());
		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_Dscrptn ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnDscrptn() != null) {
			testscriptteardownactionoperation.setDescription(t.getTstScrptTeardownActnOprtnDscrptn());
		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_Destination ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnDestination() != null) {
			testscriptteardownactionoperation.setDestination(Integer.parseInt(t.getTstScrptTeardownActnOprtnDestination()));
		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_EncodeRqstUrl ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnEncodeRqstUrl() != null) {
			testscriptteardownactionoperation.setEncodeRequestUrl(Boolean.parseBoolean(t.getTstScrptTeardownActnOprtnEncodeRqstUrl()));
		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_Lbl ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnLbl() != null) {
			testscriptteardownactionoperation.setLabel(t.getTstScrptTeardownActnOprtnLbl());
		}
		/******************** testscriptteardownactionoperationmethod ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptRequestMethodCodeEnumFactory testscriptteardownactionoperationmethod =  new org.hl7.fhir.r4.model.TestScript.TestScriptRequestMethodCodeEnumFactory();
		testscriptteardownactionoperation.setMethod(testscriptteardownactionoperationmethod.fromCode(t.getTstScrptTeardownActnOprtnMthd()));

		/******************** TstScrpt_Teardown_Actn_Oprtn_Origin ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnOrigin() != null) {
			testscriptteardownactionoperation.setOrigin(Integer.parseInt(t.getTstScrptTeardownActnOprtnOrigin()));
		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_Params ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnParams() != null) {
			testscriptteardownactionoperation.setParams(t.getTstScrptTeardownActnOprtnParams());
		}
		/******************** testscriptteardownactionoperationrequestheader ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.SetupActionOperationRequestHeaderComponent testscriptteardownactionoperationrequestheader =  new org.hl7.fhir.r4.model.TestScript.SetupActionOperationRequestHeaderComponent();
		testscriptteardownactionoperation.addRequestHeader(testscriptteardownactionoperationrequestheader);

		/******************** TstScrpt_Teardown_Actn_Oprtn_RqstHeader_Field ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnRqstHeaderField() != null) {
			testscriptteardownactionoperationrequestheader.setField(t.getTstScrptTeardownActnOprtnRqstHeaderField());
		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_RqstHeader_Vl ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnRqstHeaderVl() != null) {
			testscriptteardownactionoperationrequestheader.setValue(t.getTstScrptTeardownActnOprtnRqstHeaderVl());
		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_RqstId ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnRqstId() != null) {
			testscriptteardownactionoperation.setRequestId(t.getTstScrptTeardownActnOprtnRqstId());
		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_Rsrc ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnRsrc() != null) {
			testscriptteardownactionoperation.setResource(t.getTstScrptTeardownActnOprtnRsrc());
		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_RspsId ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnRspsId() != null) {
			testscriptteardownactionoperation.setResponseId(t.getTstScrptTeardownActnOprtnRspsId());
		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_SrcId ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnSrcId() != null) {
			testscriptteardownactionoperation.setSourceId(t.getTstScrptTeardownActnOprtnSrcId());
		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_TarId ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnTarId() != null) {
			testscriptteardownactionoperation.setTargetId(t.getTstScrptTeardownActnOprtnTarId());
		}
		/******************** testscriptteardownactionoperationtype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding testscriptteardownactionoperationtype =  new org.hl7.fhir.r4.model.Coding();
		testscriptteardownactionoperation.setType(testscriptteardownactionoperationtype);

		/******************** TstScrpt_Teardown_Actn_Oprtn_Typ_Cd ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnTypCd() != null) {
			testscriptteardownactionoperationtype.setCode(t.getTstScrptTeardownActnOprtnTypCd());
		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_Typ_Dsply ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnTypDsply() != null) {
			testscriptteardownactionoperationtype.setDisplay(t.getTstScrptTeardownActnOprtnTypDsply());
		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_Typ_Sys ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnTypSys() != null) {
			testscriptteardownactionoperationtype.setSystem(t.getTstScrptTeardownActnOprtnTypSys());
		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_Typ_UsrSltd ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnTypUsrSltd() != null) {
			testscriptteardownactionoperationtype.setUserSelected(Boolean.parseBoolean(t.getTstScrptTeardownActnOprtnTypUsrSltd()));
		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_Typ_Vrsn ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnTypVrsn() != null) {
			testscriptteardownactionoperationtype.setVersion(t.getTstScrptTeardownActnOprtnTypVrsn());
		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_Url ********************************************************************************/
		if(t.getTstScrptTeardownActnOprtnUrl() != null) {
			testscriptteardownactionoperation.setUrl(t.getTstScrptTeardownActnOprtnUrl());
		}
		/******************** testscripttest ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptTestComponent testscripttest =  new org.hl7.fhir.r4.model.TestScript.TestScriptTestComponent();
		testscript.addTest(testscripttest);

		/******************** testscripttestaction ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestActionComponent testscripttestaction =  new org.hl7.fhir.r4.model.TestScript.TestActionComponent();
		testscripttest.addAction(testscripttestaction);

		/******************** testscripttestactionassert ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.SetupActionAssertComponent testscripttestactionassert =  new org.hl7.fhir.r4.model.TestScript.SetupActionAssertComponent();
		testscripttestaction.setAssert(testscripttestactionassert);

		/******************** TstScrpt_Tst_Actn_Assert_CompareToSrcExprsn ********************************************************************************/
		if(t.getTstScrptTstActnAssertCompareToSrcExprsn() != null) {
			testscripttestactionassert.setCompareToSourceExpression(t.getTstScrptTstActnAssertCompareToSrcExprsn());
		}
		/******************** TstScrpt_Tst_Actn_Assert_CompareToSrcId ********************************************************************************/
		if(t.getTstScrptTstActnAssertCompareToSrcId() != null) {
			testscripttestactionassert.setCompareToSourceId(t.getTstScrptTstActnAssertCompareToSrcId());
		}
		/******************** TstScrpt_Tst_Actn_Assert_CompareToSrcPath ********************************************************************************/
		if(t.getTstScrptTstActnAssertCompareToSrcPath() != null) {
			testscripttestactionassert.setCompareToSourcePath(t.getTstScrptTstActnAssertCompareToSrcPath());
		}
		/******************** TstScrpt_Tst_Actn_Assert_CntntTyp ********************************************************************************/
		if(t.getTstScrptTstActnAssertCntntTyp() != null) {
			testscripttestactionassert.setContentType(t.getTstScrptTstActnAssertCntntTyp());
		}
		/******************** TstScrpt_Tst_Actn_Assert_Dscrptn ********************************************************************************/
		if(t.getTstScrptTstActnAssertDscrptn() != null) {
			testscripttestactionassert.setDescription(t.getTstScrptTstActnAssertDscrptn());
		}
		/******************** testscripttestactionassertdirection ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.AssertionDirectionTypeEnumFactory testscripttestactionassertdirection =  new org.hl7.fhir.r4.model.TestScript.AssertionDirectionTypeEnumFactory();
		testscripttestactionassert.setDirection(testscripttestactionassertdirection.fromCode(t.getTstScrptTstActnAssertDirection()));

		/******************** TstScrpt_Tst_Actn_Assert_Exprsn ********************************************************************************/
		if(t.getTstScrptTstActnAssertExprsn() != null) {
			testscripttestactionassert.setExpression(t.getTstScrptTstActnAssertExprsn());
		}
		/******************** TstScrpt_Tst_Actn_Assert_HeaderField ********************************************************************************/
		if(t.getTstScrptTstActnAssertHeaderField() != null) {
			testscripttestactionassert.setHeaderField(t.getTstScrptTstActnAssertHeaderField());
		}
		/******************** TstScrpt_Tst_Actn_Assert_Lbl ********************************************************************************/
		if(t.getTstScrptTstActnAssertLbl() != null) {
			testscripttestactionassert.setLabel(t.getTstScrptTstActnAssertLbl());
		}
		/******************** TstScrpt_Tst_Actn_Assert_MinimumId ********************************************************************************/
		if(t.getTstScrptTstActnAssertMinimumId() != null) {
			testscripttestactionassert.setMinimumId(t.getTstScrptTstActnAssertMinimumId());
		}
		/******************** TstScrpt_Tst_Actn_Assert_NavigationLinks ********************************************************************************/
		if(t.getTstScrptTstActnAssertNavigationLinks() != null) {
			testscripttestactionassert.setNavigationLinks(Boolean.parseBoolean(t.getTstScrptTstActnAssertNavigationLinks()));
		}
		/******************** testscripttestactionassertoperator ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.AssertionOperatorTypeEnumFactory testscripttestactionassertoperator =  new org.hl7.fhir.r4.model.TestScript.AssertionOperatorTypeEnumFactory();
		testscripttestactionassert.setOperator(testscripttestactionassertoperator.fromCode(t.getTstScrptTstActnAssertOperator()));

		/******************** TstScrpt_Tst_Actn_Assert_Path ********************************************************************************/
		if(t.getTstScrptTstActnAssertPath() != null) {
			testscripttestactionassert.setPath(t.getTstScrptTstActnAssertPath());
		}
		/******************** testscripttestactionassertrequestmethod ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptRequestMethodCodeEnumFactory testscripttestactionassertrequestmethod =  new org.hl7.fhir.r4.model.TestScript.TestScriptRequestMethodCodeEnumFactory();
		testscripttestactionassert.setRequestMethod(testscripttestactionassertrequestmethod.fromCode(t.getTstScrptTstActnAssertRqstMthd()));

		/******************** TstScrpt_Tst_Actn_Assert_RqstUrl ********************************************************************************/
		if(t.getTstScrptTstActnAssertRqstUrl() != null) {
			testscripttestactionassert.setRequestURL(t.getTstScrptTstActnAssertRqstUrl());
		}
		/******************** TstScrpt_Tst_Actn_Assert_Rsrc ********************************************************************************/
		if(t.getTstScrptTstActnAssertRsrc() != null) {
			testscripttestactionassert.setResource(t.getTstScrptTstActnAssertRsrc());
		}
		/******************** testscripttestactionassertresponse ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.AssertionResponseTypesEnumFactory testscripttestactionassertresponse =  new org.hl7.fhir.r4.model.TestScript.AssertionResponseTypesEnumFactory();
		testscripttestactionassert.setResponse(testscripttestactionassertresponse.fromCode(t.getTstScrptTstActnAssertRsps()));

		/******************** TstScrpt_Tst_Actn_Assert_RspsCd ********************************************************************************/
		if(t.getTstScrptTstActnAssertRspsCd() != null) {
			testscripttestactionassert.setResponseCode(t.getTstScrptTstActnAssertRspsCd());
		}
		/******************** TstScrpt_Tst_Actn_Assert_SrcId ********************************************************************************/
		if(t.getTstScrptTstActnAssertSrcId() != null) {
			testscripttestactionassert.setSourceId(t.getTstScrptTstActnAssertSrcId());
		}
		/******************** TstScrpt_Tst_Actn_Assert_ValidateProfileId ********************************************************************************/
		if(t.getTstScrptTstActnAssertValidateProfileId() != null) {
			testscripttestactionassert.setValidateProfileId(t.getTstScrptTstActnAssertValidateProfileId());
		}
		/******************** TstScrpt_Tst_Actn_Assert_Vl ********************************************************************************/
		if(t.getTstScrptTstActnAssertVl() != null) {
			testscripttestactionassert.setValue(t.getTstScrptTstActnAssertVl());
		}
		/******************** TstScrpt_Tst_Actn_Assert_WarningOnly ********************************************************************************/
		if(t.getTstScrptTstActnAssertWarningOnly() != null) {
			testscripttestactionassert.setWarningOnly(Boolean.parseBoolean(t.getTstScrptTstActnAssertWarningOnly()));
		}
		/******************** testscripttestactionoperation ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.SetupActionOperationComponent testscripttestactionoperation =  new org.hl7.fhir.r4.model.TestScript.SetupActionOperationComponent();
		testscripttestaction.setOperation(testscripttestactionoperation);

		/******************** TstScrpt_Tst_Actn_Oprtn_Accept ********************************************************************************/
		if(t.getTstScrptTstActnOprtnAccept() != null) {
			testscripttestactionoperation.setAccept(t.getTstScrptTstActnOprtnAccept());
		}
		/******************** TstScrpt_Tst_Actn_Oprtn_CntntTyp ********************************************************************************/
		if(t.getTstScrptTstActnOprtnCntntTyp() != null) {
			testscripttestactionoperation.setContentType(t.getTstScrptTstActnOprtnCntntTyp());
		}
		/******************** TstScrpt_Tst_Actn_Oprtn_Dscrptn ********************************************************************************/
		if(t.getTstScrptTstActnOprtnDscrptn() != null) {
			testscripttestactionoperation.setDescription(t.getTstScrptTstActnOprtnDscrptn());
		}
		/******************** TstScrpt_Tst_Actn_Oprtn_Destination ********************************************************************************/
		if(t.getTstScrptTstActnOprtnDestination() != null) {
			testscripttestactionoperation.setDestination(Integer.parseInt(t.getTstScrptTstActnOprtnDestination()));
		}
		/******************** TstScrpt_Tst_Actn_Oprtn_EncodeRqstUrl ********************************************************************************/
		if(t.getTstScrptTstActnOprtnEncodeRqstUrl() != null) {
			testscripttestactionoperation.setEncodeRequestUrl(Boolean.parseBoolean(t.getTstScrptTstActnOprtnEncodeRqstUrl()));
		}
		/******************** TstScrpt_Tst_Actn_Oprtn_Lbl ********************************************************************************/
		if(t.getTstScrptTstActnOprtnLbl() != null) {
			testscripttestactionoperation.setLabel(t.getTstScrptTstActnOprtnLbl());
		}
		/******************** testscripttestactionoperationmethod ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptRequestMethodCodeEnumFactory testscripttestactionoperationmethod =  new org.hl7.fhir.r4.model.TestScript.TestScriptRequestMethodCodeEnumFactory();
		testscripttestactionoperation.setMethod(testscripttestactionoperationmethod.fromCode(t.getTstScrptTstActnOprtnMthd()));

		/******************** TstScrpt_Tst_Actn_Oprtn_Origin ********************************************************************************/
		if(t.getTstScrptTstActnOprtnOrigin() != null) {
			testscripttestactionoperation.setOrigin(Integer.parseInt(t.getTstScrptTstActnOprtnOrigin()));
		}
		/******************** TstScrpt_Tst_Actn_Oprtn_Params ********************************************************************************/
		if(t.getTstScrptTstActnOprtnParams() != null) {
			testscripttestactionoperation.setParams(t.getTstScrptTstActnOprtnParams());
		}
		/******************** testscripttestactionoperationrequestheader ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.SetupActionOperationRequestHeaderComponent testscripttestactionoperationrequestheader =  new org.hl7.fhir.r4.model.TestScript.SetupActionOperationRequestHeaderComponent();
		testscripttestactionoperation.addRequestHeader(testscripttestactionoperationrequestheader);

		/******************** TstScrpt_Tst_Actn_Oprtn_RqstHeader_Field ********************************************************************************/
		if(t.getTstScrptTstActnOprtnRqstHeaderField() != null) {
			testscripttestactionoperationrequestheader.setField(t.getTstScrptTstActnOprtnRqstHeaderField());
		}
		/******************** TstScrpt_Tst_Actn_Oprtn_RqstHeader_Vl ********************************************************************************/
		if(t.getTstScrptTstActnOprtnRqstHeaderVl() != null) {
			testscripttestactionoperationrequestheader.setValue(t.getTstScrptTstActnOprtnRqstHeaderVl());
		}
		/******************** TstScrpt_Tst_Actn_Oprtn_RqstId ********************************************************************************/
		if(t.getTstScrptTstActnOprtnRqstId() != null) {
			testscripttestactionoperation.setRequestId(t.getTstScrptTstActnOprtnRqstId());
		}
		/******************** TstScrpt_Tst_Actn_Oprtn_Rsrc ********************************************************************************/
		if(t.getTstScrptTstActnOprtnRsrc() != null) {
			testscripttestactionoperation.setResource(t.getTstScrptTstActnOprtnRsrc());
		}
		/******************** TstScrpt_Tst_Actn_Oprtn_RspsId ********************************************************************************/
		if(t.getTstScrptTstActnOprtnRspsId() != null) {
			testscripttestactionoperation.setResponseId(t.getTstScrptTstActnOprtnRspsId());
		}
		/******************** TstScrpt_Tst_Actn_Oprtn_SrcId ********************************************************************************/
		if(t.getTstScrptTstActnOprtnSrcId() != null) {
			testscripttestactionoperation.setSourceId(t.getTstScrptTstActnOprtnSrcId());
		}
		/******************** TstScrpt_Tst_Actn_Oprtn_TarId ********************************************************************************/
		if(t.getTstScrptTstActnOprtnTarId() != null) {
			testscripttestactionoperation.setTargetId(t.getTstScrptTstActnOprtnTarId());
		}
		/******************** testscripttestactionoperationtype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding testscripttestactionoperationtype =  new org.hl7.fhir.r4.model.Coding();
		testscripttestactionoperation.setType(testscripttestactionoperationtype);

		/******************** TstScrpt_Tst_Actn_Oprtn_Typ_Cd ********************************************************************************/
		if(t.getTstScrptTstActnOprtnTypCd() != null) {
			testscripttestactionoperationtype.setCode(t.getTstScrptTstActnOprtnTypCd());
		}
		/******************** TstScrpt_Tst_Actn_Oprtn_Typ_Dsply ********************************************************************************/
		if(t.getTstScrptTstActnOprtnTypDsply() != null) {
			testscripttestactionoperationtype.setDisplay(t.getTstScrptTstActnOprtnTypDsply());
		}
		/******************** TstScrpt_Tst_Actn_Oprtn_Typ_Sys ********************************************************************************/
		if(t.getTstScrptTstActnOprtnTypSys() != null) {
			testscripttestactionoperationtype.setSystem(t.getTstScrptTstActnOprtnTypSys());
		}
		/******************** TstScrpt_Tst_Actn_Oprtn_Typ_UsrSltd ********************************************************************************/
		if(t.getTstScrptTstActnOprtnTypUsrSltd() != null) {
			testscripttestactionoperationtype.setUserSelected(Boolean.parseBoolean(t.getTstScrptTstActnOprtnTypUsrSltd()));
		}
		/******************** TstScrpt_Tst_Actn_Oprtn_Typ_Vrsn ********************************************************************************/
		if(t.getTstScrptTstActnOprtnTypVrsn() != null) {
			testscripttestactionoperationtype.setVersion(t.getTstScrptTstActnOprtnTypVrsn());
		}
		/******************** TstScrpt_Tst_Actn_Oprtn_Url ********************************************************************************/
		if(t.getTstScrptTstActnOprtnUrl() != null) {
			testscripttestactionoperation.setUrl(t.getTstScrptTstActnOprtnUrl());
		}
		/******************** TstScrpt_Tst_Dscrptn ********************************************************************************/
		if(t.getTstScrptTstDscrptn() != null) {
			testscripttest.setDescription(t.getTstScrptTstDscrptn());
		}
		/******************** TstScrpt_Tst_Nm ********************************************************************************/
		if(t.getTstScrptTstNm() != null) {
			testscripttest.setName(t.getTstScrptTstNm());
		}
		/******************** TstScrpt_Ttl ********************************************************************************/
		if(t.getTstScrptTtl() != null) {
			testscript.setTitle(t.getTstScrptTtl());
		}
		/******************** TstScrpt_Url ********************************************************************************/
		if(t.getTstScrptUrl() != null) {
			testscript.setUrl(t.getTstScrptUrl());
		}
		/******************** testscriptusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext testscriptusecontext =  new org.hl7.fhir.r4.model.UsageContext();
		testscript.addUseContext(testscriptusecontext);

		/******************** testscriptusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding testscriptusecontextcode =  new org.hl7.fhir.r4.model.Coding();
		testscriptusecontext.setCode(testscriptusecontextcode);

		/******************** TstScrpt_UseCntxt_Cd_Cd ********************************************************************************/
		if(t.getTstScrptUseCntxtCdCd() != null) {
			testscriptusecontextcode.setCode(t.getTstScrptUseCntxtCdCd());
		}
		/******************** TstScrpt_UseCntxt_Cd_Dsply ********************************************************************************/
		if(t.getTstScrptUseCntxtCdDsply() != null) {
			testscriptusecontextcode.setDisplay(t.getTstScrptUseCntxtCdDsply());
		}
		/******************** TstScrpt_UseCntxt_Cd_Sys ********************************************************************************/
		if(t.getTstScrptUseCntxtCdSys() != null) {
			testscriptusecontextcode.setSystem(t.getTstScrptUseCntxtCdSys());
		}
		/******************** TstScrpt_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(t.getTstScrptUseCntxtCdUsrSltd() != null) {
			testscriptusecontextcode.setUserSelected(Boolean.parseBoolean(t.getTstScrptUseCntxtCdUsrSltd()));
		}
		/******************** TstScrpt_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(t.getTstScrptUseCntxtCdVrsn() != null) {
			testscriptusecontextcode.setVersion(t.getTstScrptUseCntxtCdVrsn());
		}
		/******************** testscriptusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept testscriptusecontextvaluecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		testscriptusecontext.setValue(testscriptusecontextvaluecodeableconcept);

		/******************** testscriptusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding testscriptusecontextvaluecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		testscriptusecontextvaluecodeableconcept.addCoding(testscriptusecontextvaluecodeableconceptcoding);

		/******************** TstScrpt_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(t.getTstScrptUseCntxtVlCdbleCncptCdgCd() != null) {
			testscriptusecontextvaluecodeableconceptcoding.setCode(t.getTstScrptUseCntxtVlCdbleCncptCdgCd());
		}
		/******************** TstScrpt_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(t.getTstScrptUseCntxtVlCdbleCncptCdgDsply() != null) {
			testscriptusecontextvaluecodeableconceptcoding.setDisplay(t.getTstScrptUseCntxtVlCdbleCncptCdgDsply());
		}
		/******************** TstScrpt_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(t.getTstScrptUseCntxtVlCdbleCncptCdgSys() != null) {
			testscriptusecontextvaluecodeableconceptcoding.setSystem(t.getTstScrptUseCntxtVlCdbleCncptCdgSys());
		}
		/******************** TstScrpt_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(t.getTstScrptUseCntxtVlCdbleCncptCdgUsrSltd() != null) {
			testscriptusecontextvaluecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(t.getTstScrptUseCntxtVlCdbleCncptCdgUsrSltd()));
		}
		/******************** TstScrpt_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(t.getTstScrptUseCntxtVlCdbleCncptCdgVrsn() != null) {
			testscriptusecontextvaluecodeableconceptcoding.setVersion(t.getTstScrptUseCntxtVlCdbleCncptCdgVrsn());
		}
		/******************** TstScrpt_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(t.getTstScrptUseCntxtVlCdbleCncptTxt() != null) {
			testscriptusecontextvaluecodeableconcept.setText(t.getTstScrptUseCntxtVlCdbleCncptTxt());
		}
		/******************** testscriptusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity testscriptusecontextvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		testscriptusecontext.setValue(testscriptusecontextvaluequantity);

		/******************** TstScrpt_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(t.getTstScrptUseCntxtVlQntyCd() != null) {
			testscriptusecontextvaluequantity.setCode(t.getTstScrptUseCntxtVlQntyCd());
		}
		/******************** testscriptusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory testscriptusecontextvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		testscriptusecontextvaluequantity.setComparator(testscriptusecontextvaluequantitycomparator.fromCode(t.getTstScrptUseCntxtVlQntyCmprtr()));

		/******************** TstScrpt_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(t.getTstScrptUseCntxtVlQntySys() != null) {
			testscriptusecontextvaluequantity.setSystem(t.getTstScrptUseCntxtVlQntySys());
		}
		/******************** TstScrpt_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(t.getTstScrptUseCntxtVlQntyUnt() != null) {
			testscriptusecontextvaluequantity.setUnit(t.getTstScrptUseCntxtVlQntyUnt());
		}
		/******************** TstScrpt_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(t.getTstScrptUseCntxtVlQntyVl() != null) {
			testscriptusecontextvaluequantity.setValue(Double.parseDouble((t.getTstScrptUseCntxtVlQntyVl())));
		}
		/******************** testscriptusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range testscriptusecontextvaluerange =  new org.hl7.fhir.r4.model.Range();
		testscriptusecontext.setValue(testscriptusecontextvaluerange);

		/******************** testscriptusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity testscriptusecontextvaluerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		testscriptusecontextvaluerange.setHigh(testscriptusecontextvaluerangehigh);

		/******************** TstScrpt_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(t.getTstScrptUseCntxtVlRngHiCd() != null) {
			testscriptusecontextvaluerangehigh.setCode(t.getTstScrptUseCntxtVlRngHiCd());
		}
		/******************** testscriptusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory testscriptusecontextvaluerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		testscriptusecontextvaluerangehigh.setComparator(testscriptusecontextvaluerangehighcomparator.fromCode(t.getTstScrptUseCntxtVlRngHiCmprtr()));

		/******************** TstScrpt_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(t.getTstScrptUseCntxtVlRngHiSys() != null) {
			testscriptusecontextvaluerangehigh.setSystem(t.getTstScrptUseCntxtVlRngHiSys());
		}
		/******************** TstScrpt_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(t.getTstScrptUseCntxtVlRngHiUnt() != null) {
			testscriptusecontextvaluerangehigh.setUnit(t.getTstScrptUseCntxtVlRngHiUnt());
		}
		/******************** TstScrpt_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(t.getTstScrptUseCntxtVlRngHiVl() != null) {
			testscriptusecontextvaluerangehigh.setValue(Double.parseDouble((t.getTstScrptUseCntxtVlRngHiVl())));
		}
		/******************** testscriptusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity testscriptusecontextvaluerangelow =  new org.hl7.fhir.r4.model.Quantity();
		testscriptusecontextvaluerange.setLow(testscriptusecontextvaluerangelow);

		/******************** TstScrpt_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(t.getTstScrptUseCntxtVlRngLwCd() != null) {
			testscriptusecontextvaluerangelow.setCode(t.getTstScrptUseCntxtVlRngLwCd());
		}
		/******************** testscriptusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory testscriptusecontextvaluerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		testscriptusecontextvaluerangelow.setComparator(testscriptusecontextvaluerangelowcomparator.fromCode(t.getTstScrptUseCntxtVlRngLwCmprtr()));

		/******************** TstScrpt_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(t.getTstScrptUseCntxtVlRngLwSys() != null) {
			testscriptusecontextvaluerangelow.setSystem(t.getTstScrptUseCntxtVlRngLwSys());
		}
		/******************** TstScrpt_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(t.getTstScrptUseCntxtVlRngLwUnt() != null) {
			testscriptusecontextvaluerangelow.setUnit(t.getTstScrptUseCntxtVlRngLwUnt());
		}
		/******************** TstScrpt_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(t.getTstScrptUseCntxtVlRngLwVl() != null) {
			testscriptusecontextvaluerangelow.setValue(Double.parseDouble((t.getTstScrptUseCntxtVlRngLwVl())));
		}
		/******************** TstScrpt_UseCntxt_VlRfrnc ********************************************************************************/
		if(t.getTstScrptUseCntxtVlRfrnc() != null) {
			testscriptusecontext.setValue( new org.hl7.fhir.r4.model.Reference(t.getTstScrptUseCntxtVlRfrnc()));
		}
		/******************** testscriptvariable ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptVariableComponent testscriptvariable =  new org.hl7.fhir.r4.model.TestScript.TestScriptVariableComponent();
		testscript.addVariable(testscriptvariable);

		/******************** TstScrpt_Vrble_DefaultVl ********************************************************************************/
		if(t.getTstScrptVrbleDefaultVl() != null) {
			testscriptvariable.setDefaultValue(t.getTstScrptVrbleDefaultVl());
		}
		/******************** TstScrpt_Vrble_Dscrptn ********************************************************************************/
		if(t.getTstScrptVrbleDscrptn() != null) {
			testscriptvariable.setDescription(t.getTstScrptVrbleDscrptn());
		}
		/******************** TstScrpt_Vrble_Exprsn ********************************************************************************/
		if(t.getTstScrptVrbleExprsn() != null) {
			testscriptvariable.setExpression(t.getTstScrptVrbleExprsn());
		}
		/******************** TstScrpt_Vrble_HeaderField ********************************************************************************/
		if(t.getTstScrptVrbleHeaderField() != null) {
			testscriptvariable.setHeaderField(t.getTstScrptVrbleHeaderField());
		}
		/******************** TstScrpt_Vrble_Hint ********************************************************************************/
		if(t.getTstScrptVrbleHint() != null) {
			testscriptvariable.setHint(t.getTstScrptVrbleHint());
		}
		/******************** TstScrpt_Vrble_Nm ********************************************************************************/
		if(t.getTstScrptVrbleNm() != null) {
			testscriptvariable.setName(t.getTstScrptVrbleNm());
		}
		/******************** TstScrpt_Vrble_Path ********************************************************************************/
		if(t.getTstScrptVrblePath() != null) {
			testscriptvariable.setPath(t.getTstScrptVrblePath());
		}
		/******************** TstScrpt_Vrble_SrcId ********************************************************************************/
		if(t.getTstScrptVrbleSrcId() != null) {
			testscriptvariable.setSourceId(t.getTstScrptVrbleSrcId());
		}
		/******************** TstScrpt_Vrsn ********************************************************************************/
		if(t.getTstScrptVrsn() != null) {
			testscript.setVersion(t.getTstScrptVrsn());
		}
		return testscript;
	}
}
