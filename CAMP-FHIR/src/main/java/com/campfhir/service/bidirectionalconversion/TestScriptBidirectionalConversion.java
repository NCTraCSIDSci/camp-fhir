package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.TestScript;
public class TestScriptBidirectionalConversion 
{
	public TestScript TestScripts(org.hl7.fhir.r4.model.TestScript testscript) throws ParseException
	{
		 main.java.com.campfhir.model.TestScript t = new  main.java.com.campfhir.model.TestScript();

		/******************** id ********************************************************************************/
		testscript.setId(t.getId());

		/******************** TstScrpt_Nm ********************************************************************************/
		if(testscript.hasName()) {
			t.setTstScrptNm(String.valueOf(testscript.getName()));
		}
		/******************** TstScrpt_Vrsn ********************************************************************************/
		if(testscript.hasVersion()) {
			t.setTstScrptVrsn(String.valueOf(testscript.getVersion()));
		}
		/******************** TstScrpt_Dt ********************************************************************************/
		if(testscript.hasDate()) {
			t.setTstScrptDt(String.valueOf(testscript.getDate()));
		}
		/******************** TstScrpt_Url ********************************************************************************/
		if(testscript.hasUrl()) {
			t.setTstScrptUrl(String.valueOf(testscript.getUrl()));
		}
		/******************** testscriptjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept testscriptjurisdiction = testscript.getJurisdictionFirstRep();

		/******************** testscriptjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding testscriptjurisdictioncoding = testscriptjurisdiction.getCodingFirstRep();

		/******************** TstScrpt_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(testscriptjurisdictioncoding.hasDisplay()) {
			t.setTstScrptJrsdctnCdgDsply(String.valueOf(testscriptjurisdictioncoding.getDisplay()));
		}
		/******************** TstScrpt_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(testscriptjurisdictioncoding.hasVersion()) {
			t.setTstScrptJrsdctnCdgVrsn(String.valueOf(testscriptjurisdictioncoding.getVersion()));
		}
		/******************** TstScrpt_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(testscriptjurisdictioncoding.hasCode()) {
			t.setTstScrptJrsdctnCdgCd(String.valueOf(testscriptjurisdictioncoding.getCode()));
		}
		/******************** TstScrpt_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(testscriptjurisdictioncoding.hasSystem()) {
			t.setTstScrptJrsdctnCdgSys(String.valueOf(testscriptjurisdictioncoding.getSystem()));
		}
		/******************** TstScrpt_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(testscriptjurisdictioncoding.hasUserSelected()) {
			t.setTstScrptJrsdctnCdgUsrSltd(String.valueOf(testscriptjurisdictioncoding.getUserSelected()));
		}
		/******************** TstScrpt_Jrsdctn_Txt ********************************************************************************/
		if(testscriptjurisdiction.hasText()) {
			t.setTstScrptJrsdctnTxt(String.valueOf(testscriptjurisdiction.getText()));
		}
		/******************** testscriptdestination ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptDestinationComponent testscriptdestination = testscript.getDestinationFirstRep();

		/******************** TstScrpt_Destination_Index ********************************************************************************/
		if(testscriptdestination.hasIndex()) {
			t.setTstScrptDestinationIndex(String.valueOf(testscriptdestination.getIndex()));
		}
		/******************** testscriptdestinationprofile ********************************************************************************/
		org.hl7.fhir.r4.model.Coding testscriptdestinationprofile = testscriptdestination.getProfile();

		/******************** TstScrpt_Destination_Profile_Dsply ********************************************************************************/
		if(testscriptdestinationprofile.hasDisplay()) {
			t.setTstScrptDestinationProfileDsply(String.valueOf(testscriptdestinationprofile.getDisplay()));
		}
		/******************** TstScrpt_Destination_Profile_Vrsn ********************************************************************************/
		if(testscriptdestinationprofile.hasVersion()) {
			t.setTstScrptDestinationProfileVrsn(String.valueOf(testscriptdestinationprofile.getVersion()));
		}
		/******************** TstScrpt_Destination_Profile_Cd ********************************************************************************/
		if(testscriptdestinationprofile.hasCode()) {
			t.setTstScrptDestinationProfileCd(String.valueOf(testscriptdestinationprofile.getCode()));
		}
		/******************** TstScrpt_Destination_Profile_Sys ********************************************************************************/
		if(testscriptdestinationprofile.hasSystem()) {
			t.setTstScrptDestinationProfileSys(String.valueOf(testscriptdestinationprofile.getSystem()));
		}
		/******************** TstScrpt_Destination_Profile_UsrSltd ********************************************************************************/
		if(testscriptdestinationprofile.hasUserSelected()) {
			t.setTstScrptDestinationProfileUsrSltd(String.valueOf(testscriptdestinationprofile.getUserSelected()));
		}
		/******************** testscriptusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext testscriptusecontext = testscript.getUseContextFirstRep();

		/******************** testscriptusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding testscriptusecontextcode = testscriptusecontext.getCode();

		/******************** TstScrpt_UseCntxt_Cd_Dsply ********************************************************************************/
		if(testscriptusecontextcode.hasDisplay()) {
			t.setTstScrptUseCntxtCdDsply(String.valueOf(testscriptusecontextcode.getDisplay()));
		}
		/******************** TstScrpt_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(testscriptusecontextcode.hasVersion()) {
			t.setTstScrptUseCntxtCdVrsn(String.valueOf(testscriptusecontextcode.getVersion()));
		}
		/******************** TstScrpt_UseCntxt_Cd_Sys ********************************************************************************/
		if(testscriptusecontextcode.hasSystem()) {
			t.setTstScrptUseCntxtCdSys(String.valueOf(testscriptusecontextcode.getSystem()));
		}
		/******************** TstScrpt_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(testscriptusecontextcode.hasUserSelected()) {
			t.setTstScrptUseCntxtCdUsrSltd(String.valueOf(testscriptusecontextcode.getUserSelected()));
		}
		/******************** testscriptusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept testscriptusecontextvaluecodeableconcept = testscriptusecontext.getValueCodeableConcept();

		/******************** testscriptusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding testscriptusecontextvaluecodeableconceptcoding = testscriptusecontextvaluecodeableconcept.getCodingFirstRep();

		/******************** TstScrpt_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(testscriptusecontextvaluecodeableconceptcoding.hasDisplay()) {
			t.setTstScrptUseCntxtVlCdbleCncptCdgDsply(String.valueOf(testscriptusecontextvaluecodeableconceptcoding.getDisplay()));
		}
		/******************** TstScrpt_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(testscriptusecontextvaluecodeableconceptcoding.hasVersion()) {
			t.setTstScrptUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(testscriptusecontextvaluecodeableconceptcoding.getVersion()));
		}
		/******************** TstScrpt_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(testscriptusecontextvaluecodeableconceptcoding.hasCode()) {
			t.setTstScrptUseCntxtVlCdbleCncptCdgCd(String.valueOf(testscriptusecontextvaluecodeableconceptcoding.getCode()));
		}
		/******************** TstScrpt_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(testscriptusecontextvaluecodeableconceptcoding.hasSystem()) {
			t.setTstScrptUseCntxtVlCdbleCncptCdgSys(String.valueOf(testscriptusecontextvaluecodeableconceptcoding.getSystem()));
		}
		/******************** TstScrpt_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(testscriptusecontextvaluecodeableconceptcoding.hasUserSelected()) {
			t.setTstScrptUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(testscriptusecontextvaluecodeableconceptcoding.getUserSelected()));
		}
		/******************** TstScrpt_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(testscriptusecontextvaluecodeableconcept.hasText()) {
			t.setTstScrptUseCntxtVlCdbleCncptTxt(String.valueOf(testscriptusecontextvaluecodeableconcept.getText()));
		}
		/******************** testscriptusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity testscriptusecontextvaluequantity = testscriptusecontext.getValueQuantity();

		/******************** TstScrpt_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(testscriptusecontextvaluequantity.hasValue()) {
			t.setTstScrptUseCntxtVlQntyVl(String.valueOf(testscriptusecontextvaluequantity.getValue()));
		}
		/******************** testscriptusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator testscriptusecontextvaluequantitycomparator = testscriptusecontextvaluequantity.getComparator();
		t.setTstScrptUseCntxtVlQntyCmprtr(testscriptusecontextvaluequantitycomparator.toCode());

		/******************** TstScrpt_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(testscriptusecontextvaluequantity.hasCode()) {
			t.setTstScrptUseCntxtVlQntyCd(String.valueOf(testscriptusecontextvaluequantity.getCode()));
		}
		/******************** TstScrpt_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(testscriptusecontextvaluequantity.hasSystem()) {
			t.setTstScrptUseCntxtVlQntySys(String.valueOf(testscriptusecontextvaluequantity.getSystem()));
		}
		/******************** TstScrpt_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(testscriptusecontextvaluequantity.hasUnit()) {
			t.setTstScrptUseCntxtVlQntyUnt(String.valueOf(testscriptusecontextvaluequantity.getUnit()));
		}
		/******************** testscriptusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range testscriptusecontextvaluerange = testscriptusecontext.getValueRange();

		/******************** testscriptusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity testscriptusecontextvaluerangelow = testscriptusecontextvaluerange.getLow();

		/******************** TstScrpt_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(testscriptusecontextvaluerangelow.hasValue()) {
			t.setTstScrptUseCntxtVlRngLwVl(String.valueOf(testscriptusecontextvaluerangelow.getValue()));
		}
		/******************** testscriptusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator testscriptusecontextvaluerangelowcomparator = testscriptusecontextvaluerangelow.getComparator();
		t.setTstScrptUseCntxtVlRngLwCmprtr(testscriptusecontextvaluerangelowcomparator.toCode());

		/******************** TstScrpt_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(testscriptusecontextvaluerangelow.hasCode()) {
			t.setTstScrptUseCntxtVlRngLwCd(String.valueOf(testscriptusecontextvaluerangelow.getCode()));
		}
		/******************** TstScrpt_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(testscriptusecontextvaluerangelow.hasSystem()) {
			t.setTstScrptUseCntxtVlRngLwSys(String.valueOf(testscriptusecontextvaluerangelow.getSystem()));
		}
		/******************** TstScrpt_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(testscriptusecontextvaluerangelow.hasUnit()) {
			t.setTstScrptUseCntxtVlRngLwUnt(String.valueOf(testscriptusecontextvaluerangelow.getUnit()));
		}
		/******************** testscriptusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity testscriptusecontextvaluerangehigh = testscriptusecontextvaluerange.getHigh();

		/******************** TstScrpt_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(testscriptusecontextvaluerangehigh.hasValue()) {
			t.setTstScrptUseCntxtVlRngHiVl(String.valueOf(testscriptusecontextvaluerangehigh.getValue()));
		}
		/******************** testscriptusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator testscriptusecontextvaluerangehighcomparator = testscriptusecontextvaluerangehigh.getComparator();
		t.setTstScrptUseCntxtVlRngHiCmprtr(testscriptusecontextvaluerangehighcomparator.toCode());

		/******************** TstScrpt_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(testscriptusecontextvaluerangehigh.hasCode()) {
			t.setTstScrptUseCntxtVlRngHiCd(String.valueOf(testscriptusecontextvaluerangehigh.getCode()));
		}
		/******************** TstScrpt_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(testscriptusecontextvaluerangehigh.hasSystem()) {
			t.setTstScrptUseCntxtVlRngHiSys(String.valueOf(testscriptusecontextvaluerangehigh.getSystem()));
		}
		/******************** TstScrpt_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(testscriptusecontextvaluerangehigh.hasUnit()) {
			t.setTstScrptUseCntxtVlRngHiUnt(String.valueOf(testscriptusecontextvaluerangehigh.getUnit()));
		}
		/******************** TstScrpt_UseCntxt_VlRfrnc ********************************************************************************/
		if(testscriptusecontext.hasValueReference()) {
			t.setTstScrptUseCntxtVlRfrnc(String.valueOf(testscriptusecontext.getValueReference()));
		}
		/******************** testscriptstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus testscriptstatus = testscript.getStatus();
		t.setTstScrptSts(testscriptstatus.toCode());

		/******************** TstScrpt_Dscrptn ********************************************************************************/
		if(testscript.hasDescription()) {
			t.setTstScrptDscrptn(String.valueOf(testscript.getDescription()));
		}
		/******************** testscriptcontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail testscriptcontact = testscript.getContactFirstRep();

		/******************** TstScrpt_Cntct_Nm ********************************************************************************/
		if(testscriptcontact.hasName()) {
			t.setTstScrptCntctNm(String.valueOf(testscriptcontact.getName()));
		}
		/******************** testscriptcontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint testscriptcontacttelecom = testscriptcontact.getTelecomFirstRep();

		/******************** TstScrpt_Cntct_Tlcm_Vl ********************************************************************************/
		if(testscriptcontacttelecom.hasValue()) {
			t.setTstScrptCntctTlcmVl(String.valueOf(testscriptcontacttelecom.getValue()));
		}
		/******************** testscriptcontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem testscriptcontacttelecomsystem = testscriptcontacttelecom.getSystem();
		t.setTstScrptCntctTlcmSys(testscriptcontacttelecomsystem.toCode());

		/******************** testscriptcontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period testscriptcontacttelecomperiod = testscriptcontacttelecom.getPeriod();

		/******************** TstScrpt_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(testscriptcontacttelecomperiod.hasEnd()) {
			t.setTstScrptCntctTlcmPrdEnd(String.valueOf(testscriptcontacttelecomperiod.getEnd()));
		}
		/******************** TstScrpt_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(testscriptcontacttelecomperiod.hasStart()) {
			t.setTstScrptCntctTlcmPrdStrt(String.valueOf(testscriptcontacttelecomperiod.getStart()));
		}
		/******************** testscriptcontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse testscriptcontacttelecomuse = testscriptcontacttelecom.getUse();
		t.setTstScrptCntctTlcmUse(testscriptcontacttelecomuse.toCode());

		/******************** TstScrpt_Cntct_Tlcm_Rnk ********************************************************************************/
		if(testscriptcontacttelecom.hasRank()) {
			t.setTstScrptCntctTlcmRnk(String.valueOf(testscriptcontacttelecom.getRank()));
		}
		/******************** testscriptidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier testscriptidentifier = testscript.getIdentifier();

		/******************** TstScrpt_Id_Vl ********************************************************************************/
		if(testscriptidentifier.hasValue()) {
			t.setTstScrptIdVl(String.valueOf(testscriptidentifier.getValue()));
		}
		/******************** testscriptidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept testscriptidentifiertype = testscriptidentifier.getType();

		/******************** testscriptidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding testscriptidentifiertypecoding = testscriptidentifiertype.getCodingFirstRep();

		/******************** TstScrpt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(testscriptidentifiertypecoding.hasDisplay()) {
			t.setTstScrptIdTypCdgDsply(String.valueOf(testscriptidentifiertypecoding.getDisplay()));
		}
		/******************** TstScrpt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(testscriptidentifiertypecoding.hasVersion()) {
			t.setTstScrptIdTypCdgVrsn(String.valueOf(testscriptidentifiertypecoding.getVersion()));
		}
		/******************** TstScrpt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(testscriptidentifiertypecoding.hasCode()) {
			t.setTstScrptIdTypCdgCd(String.valueOf(testscriptidentifiertypecoding.getCode()));
		}
		/******************** TstScrpt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(testscriptidentifiertypecoding.hasSystem()) {
			t.setTstScrptIdTypCdgSys(String.valueOf(testscriptidentifiertypecoding.getSystem()));
		}
		/******************** TstScrpt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(testscriptidentifiertypecoding.hasUserSelected()) {
			t.setTstScrptIdTypCdgUsrSltd(String.valueOf(testscriptidentifiertypecoding.getUserSelected()));
		}
		/******************** TstScrpt_Id_Typ_Txt ********************************************************************************/
		if(testscriptidentifiertype.hasText()) {
			t.setTstScrptIdTypTxt(String.valueOf(testscriptidentifiertype.getText()));
		}
		/******************** TstScrpt_Id_Sys ********************************************************************************/
		if(testscriptidentifier.hasSystem()) {
			t.setTstScrptIdSys(String.valueOf(testscriptidentifier.getSystem()));
		}
		/******************** TstScrpt_Id_Assigner ********************************************************************************/
		if(testscriptidentifier.hasAssigner()) {
			t.setTstScrptIdAssigner(String.valueOf(testscriptidentifier.getAssigner()));
		}
		/******************** testscriptidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period testscriptidentifierperiod = testscriptidentifier.getPeriod();

		/******************** TstScrpt_Id_Prd_End ********************************************************************************/
		if(testscriptidentifierperiod.hasEnd()) {
			t.setTstScrptIdPrdEnd(String.valueOf(testscriptidentifierperiod.getEnd()));
		}
		/******************** TstScrpt_Id_Prd_Strt ********************************************************************************/
		if(testscriptidentifierperiod.hasStart()) {
			t.setTstScrptIdPrdStrt(String.valueOf(testscriptidentifierperiod.getStart()));
		}
		/******************** testscriptidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse testscriptidentifieruse = testscriptidentifier.getUse();
		t.setTstScrptIdUse(testscriptidentifieruse.toCode());

		/******************** testscriptvariable ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptVariableComponent testscriptvariable = testscript.getVariableFirstRep();

		/******************** TstScrpt_Vrble_Nm ********************************************************************************/
		if(testscriptvariable.hasName()) {
			t.setTstScrptVrbleNm(String.valueOf(testscriptvariable.getName()));
		}
		/******************** TstScrpt_Vrble_DefaultVl ********************************************************************************/
		if(testscriptvariable.hasDefaultValue()) {
			t.setTstScrptVrbleDefaultVl(String.valueOf(testscriptvariable.getDefaultValue()));
		}
		/******************** TstScrpt_Vrble_Path ********************************************************************************/
		if(testscriptvariable.hasPath()) {
			t.setTstScrptVrblePath(String.valueOf(testscriptvariable.getPath()));
		}
		/******************** TstScrpt_Vrble_HeaderField ********************************************************************************/
		if(testscriptvariable.hasHeaderField()) {
			t.setTstScrptVrbleHeaderField(String.valueOf(testscriptvariable.getHeaderField()));
		}
		/******************** TstScrpt_Vrble_Dscrptn ********************************************************************************/
		if(testscriptvariable.hasDescription()) {
			t.setTstScrptVrbleDscrptn(String.valueOf(testscriptvariable.getDescription()));
		}
		/******************** TstScrpt_Vrble_Exprsn ********************************************************************************/
		if(testscriptvariable.hasExpression()) {
			t.setTstScrptVrbleExprsn(String.valueOf(testscriptvariable.getExpression()));
		}
		/******************** TstScrpt_Vrble_SrcId ********************************************************************************/
		if(testscriptvariable.hasSourceId()) {
			t.setTstScrptVrbleSrcId(String.valueOf(testscriptvariable.getSourceId()));
		}
		/******************** TstScrpt_Vrble_Hint ********************************************************************************/
		if(testscriptvariable.hasHint()) {
			t.setTstScrptVrbleHint(String.valueOf(testscriptvariable.getHint()));
		}
		/******************** TstScrpt_Ttl ********************************************************************************/
		if(testscript.hasTitle()) {
			t.setTstScrptTtl(String.valueOf(testscript.getTitle()));
		}
		/******************** TstScrpt_Exprmtl ********************************************************************************/
		if(testscript.hasExperimental()) {
			t.setTstScrptExprmtl(String.valueOf(testscript.getExperimental()));
		}
		/******************** TstScrpt_Pblshr ********************************************************************************/
		if(testscript.hasPublisher()) {
			t.setTstScrptPblshr(String.valueOf(testscript.getPublisher()));
		}
		/******************** TstScrpt_Prpse ********************************************************************************/
		if(testscript.hasPurpose()) {
			t.setTstScrptPrpse(String.valueOf(testscript.getPurpose()));
		}
		/******************** testscriptsetup ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptSetupComponent testscriptsetup = testscript.getSetup();

		/******************** testscriptsetupaction ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.SetupActionComponent testscriptsetupaction = testscriptsetup.getActionFirstRep();

		/******************** testscriptsetupactionassert ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.SetupActionAssertComponent testscriptsetupactionassert = testscriptsetupaction.getAssert();

		/******************** TstScrpt_Stup_Actn_Assert_Vl ********************************************************************************/
		if(testscriptsetupactionassert.hasValue()) {
			t.setTstScrptStupActnAssertVl(String.valueOf(testscriptsetupactionassert.getValue()));
		}
		/******************** TstScrpt_Stup_Actn_Assert_Rsrc ********************************************************************************/
		if(testscriptsetupactionassert.hasResource()) {
			t.setTstScrptStupActnAssertRsrc(String.valueOf(testscriptsetupactionassert.getResource()));
		}
		/******************** TstScrpt_Stup_Actn_Assert_Path ********************************************************************************/
		if(testscriptsetupactionassert.hasPath()) {
			t.setTstScrptStupActnAssertPath(String.valueOf(testscriptsetupactionassert.getPath()));
		}
		/******************** TstScrpt_Stup_Actn_Assert_RspsCd ********************************************************************************/
		if(testscriptsetupactionassert.hasResponseCode()) {
			t.setTstScrptStupActnAssertRspsCd(String.valueOf(testscriptsetupactionassert.getResponseCode()));
		}
		/******************** TstScrpt_Stup_Actn_Assert_HeaderField ********************************************************************************/
		if(testscriptsetupactionassert.hasHeaderField()) {
			t.setTstScrptStupActnAssertHeaderField(String.valueOf(testscriptsetupactionassert.getHeaderField()));
		}
		/******************** TstScrpt_Stup_Actn_Assert_CntntTyp ********************************************************************************/
		if(testscriptsetupactionassert.hasContentType()) {
			t.setTstScrptStupActnAssertCntntTyp(String.valueOf(testscriptsetupactionassert.getContentType()));
		}
		/******************** TstScrpt_Stup_Actn_Assert_Dscrptn ********************************************************************************/
		if(testscriptsetupactionassert.hasDescription()) {
			t.setTstScrptStupActnAssertDscrptn(String.valueOf(testscriptsetupactionassert.getDescription()));
		}
		/******************** TstScrpt_Stup_Actn_Assert_NavigationLinks ********************************************************************************/
		if(testscriptsetupactionassert.hasNavigationLinks()) {
			t.setTstScrptStupActnAssertNavigationLinks(String.valueOf(testscriptsetupactionassert.getNavigationLinks()));
		}
		/******************** TstScrpt_Stup_Actn_Assert_MinimumId ********************************************************************************/
		if(testscriptsetupactionassert.hasMinimumId()) {
			t.setTstScrptStupActnAssertMinimumId(String.valueOf(testscriptsetupactionassert.getMinimumId()));
		}
		/******************** TstScrpt_Stup_Actn_Assert_WarningOnly ********************************************************************************/
		if(testscriptsetupactionassert.hasWarningOnly()) {
			t.setTstScrptStupActnAssertWarningOnly(String.valueOf(testscriptsetupactionassert.getWarningOnly()));
		}
		/******************** testscriptsetupactionassertrequestmethod ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptRequestMethodCode testscriptsetupactionassertrequestmethod = testscriptsetupactionassert.getRequestMethod();
		t.setTstScrptStupActnAssertRqstMthd(testscriptsetupactionassertrequestmethod.toCode());

		/******************** TstScrpt_Stup_Actn_Assert_RqstURL ********************************************************************************/
		if(testscriptsetupactionassert.hasRequestURL()) {
			t.setTstScrptStupActnAssertRqstUrl(String.valueOf(testscriptsetupactionassert.getRequestURL()));
		}
		/******************** testscriptsetupactionassertresponse ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.AssertionResponseTypes testscriptsetupactionassertresponse = testscriptsetupactionassert.getResponse();
		t.setTstScrptStupActnAssertRsps(testscriptsetupactionassertresponse.toCode());

		/******************** testscriptsetupactionassertoperator ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.AssertionOperatorType testscriptsetupactionassertoperator = testscriptsetupactionassert.getOperator();
		t.setTstScrptStupActnAssertOperator(testscriptsetupactionassertoperator.toCode());

		/******************** TstScrpt_Stup_Actn_Assert_CompareToSrcId ********************************************************************************/
		if(testscriptsetupactionassert.hasCompareToSourceId()) {
			t.setTstScrptStupActnAssertCompareToSrcId(String.valueOf(testscriptsetupactionassert.getCompareToSourceId()));
		}
		/******************** TstScrpt_Stup_Actn_Assert_ValidateProfileId ********************************************************************************/
		if(testscriptsetupactionassert.hasValidateProfileId()) {
			t.setTstScrptStupActnAssertValidateProfileId(String.valueOf(testscriptsetupactionassert.getValidateProfileId()));
		}
		/******************** TstScrpt_Stup_Actn_Assert_CompareToSrcExprsn ********************************************************************************/
		if(testscriptsetupactionassert.hasCompareToSourceExpression()) {
			t.setTstScrptStupActnAssertCompareToSrcExprsn(String.valueOf(testscriptsetupactionassert.getCompareToSourceExpression()));
		}
		/******************** TstScrpt_Stup_Actn_Assert_CompareToSrcPath ********************************************************************************/
		if(testscriptsetupactionassert.hasCompareToSourcePath()) {
			t.setTstScrptStupActnAssertCompareToSrcPath(String.valueOf(testscriptsetupactionassert.getCompareToSourcePath()));
		}
		/******************** testscriptsetupactionassertdirection ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.AssertionDirectionType testscriptsetupactionassertdirection = testscriptsetupactionassert.getDirection();
		t.setTstScrptStupActnAssertDirection(testscriptsetupactionassertdirection.toCode());

		/******************** TstScrpt_Stup_Actn_Assert_Lbl ********************************************************************************/
		if(testscriptsetupactionassert.hasLabel()) {
			t.setTstScrptStupActnAssertLbl(String.valueOf(testscriptsetupactionassert.getLabel()));
		}
		/******************** TstScrpt_Stup_Actn_Assert_Exprsn ********************************************************************************/
		if(testscriptsetupactionassert.hasExpression()) {
			t.setTstScrptStupActnAssertExprsn(String.valueOf(testscriptsetupactionassert.getExpression()));
		}
		/******************** TstScrpt_Stup_Actn_Assert_SrcId ********************************************************************************/
		if(testscriptsetupactionassert.hasSourceId()) {
			t.setTstScrptStupActnAssertSrcId(String.valueOf(testscriptsetupactionassert.getSourceId()));
		}
		/******************** testscriptsetupactionoperation ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.SetupActionOperationComponent testscriptsetupactionoperation = testscriptsetupaction.getOperation();

		/******************** TstScrpt_Stup_Actn_Oprtn_Rsrc ********************************************************************************/
		if(testscriptsetupactionoperation.hasResource()) {
			t.setTstScrptStupActnOprtnRsrc(String.valueOf(testscriptsetupactionoperation.getResource()));
		}
		/******************** testscriptsetupactionoperationmethod ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptRequestMethodCode testscriptsetupactionoperationmethod = testscriptsetupactionoperation.getMethod();
		t.setTstScrptStupActnOprtnMthd(testscriptsetupactionoperationmethod.toCode());

		/******************** testscriptsetupactionoperationtype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding testscriptsetupactionoperationtype = testscriptsetupactionoperation.getType();

		/******************** TstScrpt_Stup_Actn_Oprtn_Typ_Dsply ********************************************************************************/
		if(testscriptsetupactionoperationtype.hasDisplay()) {
			t.setTstScrptStupActnOprtnTypDsply(String.valueOf(testscriptsetupactionoperationtype.getDisplay()));
		}
		/******************** TstScrpt_Stup_Actn_Oprtn_Typ_Vrsn ********************************************************************************/
		if(testscriptsetupactionoperationtype.hasVersion()) {
			t.setTstScrptStupActnOprtnTypVrsn(String.valueOf(testscriptsetupactionoperationtype.getVersion()));
		}
		/******************** TstScrpt_Stup_Actn_Oprtn_Typ_Cd ********************************************************************************/
		if(testscriptsetupactionoperationtype.hasCode()) {
			t.setTstScrptStupActnOprtnTypCd(String.valueOf(testscriptsetupactionoperationtype.getCode()));
		}
		/******************** TstScrpt_Stup_Actn_Oprtn_Typ_Sys ********************************************************************************/
		if(testscriptsetupactionoperationtype.hasSystem()) {
			t.setTstScrptStupActnOprtnTypSys(String.valueOf(testscriptsetupactionoperationtype.getSystem()));
		}
		/******************** TstScrpt_Stup_Actn_Oprtn_Typ_UsrSltd ********************************************************************************/
		if(testscriptsetupactionoperationtype.hasUserSelected()) {
			t.setTstScrptStupActnOprtnTypUsrSltd(String.valueOf(testscriptsetupactionoperationtype.getUserSelected()));
		}
		/******************** TstScrpt_Stup_Actn_Oprtn_CntntTyp ********************************************************************************/
		if(testscriptsetupactionoperation.hasContentType()) {
			t.setTstScrptStupActnOprtnCntntTyp(String.valueOf(testscriptsetupactionoperation.getContentType()));
		}
		/******************** TstScrpt_Stup_Actn_Oprtn_Url ********************************************************************************/
		if(testscriptsetupactionoperation.hasUrl()) {
			t.setTstScrptStupActnOprtnUrl(String.valueOf(testscriptsetupactionoperation.getUrl()));
		}
		/******************** TstScrpt_Stup_Actn_Oprtn_Dscrptn ********************************************************************************/
		if(testscriptsetupactionoperation.hasDescription()) {
			t.setTstScrptStupActnOprtnDscrptn(String.valueOf(testscriptsetupactionoperation.getDescription()));
		}
		/******************** TstScrpt_Stup_Actn_Oprtn_Destination ********************************************************************************/
		if(testscriptsetupactionoperation.hasDestination()) {
			t.setTstScrptStupActnOprtnDestination(String.valueOf(testscriptsetupactionoperation.getDestination()));
		}
		/******************** TstScrpt_Stup_Actn_Oprtn_Params ********************************************************************************/
		if(testscriptsetupactionoperation.hasParams()) {
			t.setTstScrptStupActnOprtnParams(String.valueOf(testscriptsetupactionoperation.getParams()));
		}
		/******************** TstScrpt_Stup_Actn_Oprtn_Accept ********************************************************************************/
		if(testscriptsetupactionoperation.hasAccept()) {
			t.setTstScrptStupActnOprtnAccept(String.valueOf(testscriptsetupactionoperation.getAccept()));
		}
		/******************** TstScrpt_Stup_Actn_Oprtn_TarId ********************************************************************************/
		if(testscriptsetupactionoperation.hasTargetId()) {
			t.setTstScrptStupActnOprtnTarId(String.valueOf(testscriptsetupactionoperation.getTargetId()));
		}
		/******************** TstScrpt_Stup_Actn_Oprtn_RspsId ********************************************************************************/
		if(testscriptsetupactionoperation.hasResponseId()) {
			t.setTstScrptStupActnOprtnRspsId(String.valueOf(testscriptsetupactionoperation.getResponseId()));
		}
		/******************** TstScrpt_Stup_Actn_Oprtn_RqstId ********************************************************************************/
		if(testscriptsetupactionoperation.hasRequestId()) {
			t.setTstScrptStupActnOprtnRqstId(String.valueOf(testscriptsetupactionoperation.getRequestId()));
		}
		/******************** testscriptsetupactionoperationrequestheader ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.SetupActionOperationRequestHeaderComponent testscriptsetupactionoperationrequestheader = testscriptsetupactionoperation.getRequestHeaderFirstRep();

		/******************** TstScrpt_Stup_Actn_Oprtn_RqstHeader_Vl ********************************************************************************/
		if(testscriptsetupactionoperationrequestheader.hasValue()) {
			t.setTstScrptStupActnOprtnRqstHeaderVl(String.valueOf(testscriptsetupactionoperationrequestheader.getValue()));
		}
		/******************** TstScrpt_Stup_Actn_Oprtn_RqstHeader_Field ********************************************************************************/
		if(testscriptsetupactionoperationrequestheader.hasField()) {
			t.setTstScrptStupActnOprtnRqstHeaderField(String.valueOf(testscriptsetupactionoperationrequestheader.getField()));
		}
		/******************** TstScrpt_Stup_Actn_Oprtn_EncodeRqstUrl ********************************************************************************/
		if(testscriptsetupactionoperation.hasEncodeRequestUrl()) {
			t.setTstScrptStupActnOprtnEncodeRqstUrl(String.valueOf(testscriptsetupactionoperation.getEncodeRequestUrl()));
		}
		/******************** TstScrpt_Stup_Actn_Oprtn_Lbl ********************************************************************************/
		if(testscriptsetupactionoperation.hasLabel()) {
			t.setTstScrptStupActnOprtnLbl(String.valueOf(testscriptsetupactionoperation.getLabel()));
		}
		/******************** TstScrpt_Stup_Actn_Oprtn_Origin ********************************************************************************/
		if(testscriptsetupactionoperation.hasOrigin()) {
			t.setTstScrptStupActnOprtnOrigin(String.valueOf(testscriptsetupactionoperation.getOrigin()));
		}
		/******************** TstScrpt_Stup_Actn_Oprtn_SrcId ********************************************************************************/
		if(testscriptsetupactionoperation.hasSourceId()) {
			t.setTstScrptStupActnOprtnSrcId(String.valueOf(testscriptsetupactionoperation.getSourceId()));
		}
		/******************** testscripttest ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptTestComponent testscripttest = testscript.getTestFirstRep();

		/******************** TstScrpt_Tst_Nm ********************************************************************************/
		if(testscripttest.hasName()) {
			t.setTstScrptTstNm(String.valueOf(testscripttest.getName()));
		}
		/******************** testscripttestaction ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestActionComponent testscripttestaction = testscripttest.getActionFirstRep();

		/******************** testscripttestactionassert ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.SetupActionAssertComponent testscripttestactionassert = testscripttestaction.getAssert();

		/******************** TstScrpt_Tst_Actn_Assert_Vl ********************************************************************************/
		if(testscripttestactionassert.hasValue()) {
			t.setTstScrptTstActnAssertVl(String.valueOf(testscripttestactionassert.getValue()));
		}
		/******************** TstScrpt_Tst_Actn_Assert_Rsrc ********************************************************************************/
		if(testscripttestactionassert.hasResource()) {
			t.setTstScrptTstActnAssertRsrc(String.valueOf(testscripttestactionassert.getResource()));
		}
		/******************** TstScrpt_Tst_Actn_Assert_Path ********************************************************************************/
		if(testscripttestactionassert.hasPath()) {
			t.setTstScrptTstActnAssertPath(String.valueOf(testscripttestactionassert.getPath()));
		}
		/******************** TstScrpt_Tst_Actn_Assert_RspsCd ********************************************************************************/
		if(testscripttestactionassert.hasResponseCode()) {
			t.setTstScrptTstActnAssertRspsCd(String.valueOf(testscripttestactionassert.getResponseCode()));
		}
		/******************** TstScrpt_Tst_Actn_Assert_HeaderField ********************************************************************************/
		if(testscripttestactionassert.hasHeaderField()) {
			t.setTstScrptTstActnAssertHeaderField(String.valueOf(testscripttestactionassert.getHeaderField()));
		}
		/******************** TstScrpt_Tst_Actn_Assert_CntntTyp ********************************************************************************/
		if(testscripttestactionassert.hasContentType()) {
			t.setTstScrptTstActnAssertCntntTyp(String.valueOf(testscripttestactionassert.getContentType()));
		}
		/******************** TstScrpt_Tst_Actn_Assert_Dscrptn ********************************************************************************/
		if(testscripttestactionassert.hasDescription()) {
			t.setTstScrptTstActnAssertDscrptn(String.valueOf(testscripttestactionassert.getDescription()));
		}
		/******************** TstScrpt_Tst_Actn_Assert_NavigationLinks ********************************************************************************/
		if(testscripttestactionassert.hasNavigationLinks()) {
			t.setTstScrptTstActnAssertNavigationLinks(String.valueOf(testscripttestactionassert.getNavigationLinks()));
		}
		/******************** TstScrpt_Tst_Actn_Assert_MinimumId ********************************************************************************/
		if(testscripttestactionassert.hasMinimumId()) {
			t.setTstScrptTstActnAssertMinimumId(String.valueOf(testscripttestactionassert.getMinimumId()));
		}
		/******************** TstScrpt_Tst_Actn_Assert_WarningOnly ********************************************************************************/
		if(testscripttestactionassert.hasWarningOnly()) {
			t.setTstScrptTstActnAssertWarningOnly(String.valueOf(testscripttestactionassert.getWarningOnly()));
		}
		/******************** testscripttestactionassertrequestmethod ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptRequestMethodCode testscripttestactionassertrequestmethod = testscripttestactionassert.getRequestMethod();
		t.setTstScrptTstActnAssertRqstMthd(testscripttestactionassertrequestmethod.toCode());

		/******************** TstScrpt_Tst_Actn_Assert_RqstURL ********************************************************************************/
		if(testscripttestactionassert.hasRequestURL()) {
			t.setTstScrptTstActnAssertRqstUrl(String.valueOf(testscripttestactionassert.getRequestURL()));
		}
		/******************** testscripttestactionassertresponse ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.AssertionResponseTypes testscripttestactionassertresponse = testscripttestactionassert.getResponse();
		t.setTstScrptTstActnAssertRsps(testscripttestactionassertresponse.toCode());

		/******************** testscripttestactionassertoperator ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.AssertionOperatorType testscripttestactionassertoperator = testscripttestactionassert.getOperator();
		t.setTstScrptTstActnAssertOperator(testscripttestactionassertoperator.toCode());

		/******************** TstScrpt_Tst_Actn_Assert_CompareToSrcId ********************************************************************************/
		if(testscripttestactionassert.hasCompareToSourceId()) {
			t.setTstScrptTstActnAssertCompareToSrcId(String.valueOf(testscripttestactionassert.getCompareToSourceId()));
		}
		/******************** TstScrpt_Tst_Actn_Assert_ValidateProfileId ********************************************************************************/
		if(testscripttestactionassert.hasValidateProfileId()) {
			t.setTstScrptTstActnAssertValidateProfileId(String.valueOf(testscripttestactionassert.getValidateProfileId()));
		}
		/******************** TstScrpt_Tst_Actn_Assert_CompareToSrcExprsn ********************************************************************************/
		if(testscripttestactionassert.hasCompareToSourceExpression()) {
			t.setTstScrptTstActnAssertCompareToSrcExprsn(String.valueOf(testscripttestactionassert.getCompareToSourceExpression()));
		}
		/******************** TstScrpt_Tst_Actn_Assert_CompareToSrcPath ********************************************************************************/
		if(testscripttestactionassert.hasCompareToSourcePath()) {
			t.setTstScrptTstActnAssertCompareToSrcPath(String.valueOf(testscripttestactionassert.getCompareToSourcePath()));
		}
		/******************** testscripttestactionassertdirection ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.AssertionDirectionType testscripttestactionassertdirection = testscripttestactionassert.getDirection();
		t.setTstScrptTstActnAssertDirection(testscripttestactionassertdirection.toCode());

		/******************** TstScrpt_Tst_Actn_Assert_Lbl ********************************************************************************/
		if(testscripttestactionassert.hasLabel()) {
			t.setTstScrptTstActnAssertLbl(String.valueOf(testscripttestactionassert.getLabel()));
		}
		/******************** TstScrpt_Tst_Actn_Assert_Exprsn ********************************************************************************/
		if(testscripttestactionassert.hasExpression()) {
			t.setTstScrptTstActnAssertExprsn(String.valueOf(testscripttestactionassert.getExpression()));
		}
		/******************** TstScrpt_Tst_Actn_Assert_SrcId ********************************************************************************/
		if(testscripttestactionassert.hasSourceId()) {
			t.setTstScrptTstActnAssertSrcId(String.valueOf(testscripttestactionassert.getSourceId()));
		}
		/******************** testscripttestactionoperation ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.SetupActionOperationComponent testscripttestactionoperation = testscripttestaction.getOperation();

		/******************** TstScrpt_Tst_Actn_Oprtn_Rsrc ********************************************************************************/
		if(testscripttestactionoperation.hasResource()) {
			t.setTstScrptTstActnOprtnRsrc(String.valueOf(testscripttestactionoperation.getResource()));
		}
		/******************** testscripttestactionoperationmethod ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptRequestMethodCode testscripttestactionoperationmethod = testscripttestactionoperation.getMethod();
		t.setTstScrptTstActnOprtnMthd(testscripttestactionoperationmethod.toCode());

		/******************** testscripttestactionoperationtype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding testscripttestactionoperationtype = testscripttestactionoperation.getType();

		/******************** TstScrpt_Tst_Actn_Oprtn_Typ_Dsply ********************************************************************************/
		if(testscripttestactionoperationtype.hasDisplay()) {
			t.setTstScrptTstActnOprtnTypDsply(String.valueOf(testscripttestactionoperationtype.getDisplay()));
		}
		/******************** TstScrpt_Tst_Actn_Oprtn_Typ_Vrsn ********************************************************************************/
		if(testscripttestactionoperationtype.hasVersion()) {
			t.setTstScrptTstActnOprtnTypVrsn(String.valueOf(testscripttestactionoperationtype.getVersion()));
		}
		/******************** TstScrpt_Tst_Actn_Oprtn_Typ_Cd ********************************************************************************/
		if(testscripttestactionoperationtype.hasCode()) {
			t.setTstScrptTstActnOprtnTypCd(String.valueOf(testscripttestactionoperationtype.getCode()));
		}
		/******************** TstScrpt_Tst_Actn_Oprtn_Typ_Sys ********************************************************************************/
		if(testscripttestactionoperationtype.hasSystem()) {
			t.setTstScrptTstActnOprtnTypSys(String.valueOf(testscripttestactionoperationtype.getSystem()));
		}
		/******************** TstScrpt_Tst_Actn_Oprtn_Typ_UsrSltd ********************************************************************************/
		if(testscripttestactionoperationtype.hasUserSelected()) {
			t.setTstScrptTstActnOprtnTypUsrSltd(String.valueOf(testscripttestactionoperationtype.getUserSelected()));
		}
		/******************** TstScrpt_Tst_Actn_Oprtn_CntntTyp ********************************************************************************/
		if(testscripttestactionoperation.hasContentType()) {
			t.setTstScrptTstActnOprtnCntntTyp(String.valueOf(testscripttestactionoperation.getContentType()));
		}
		/******************** TstScrpt_Tst_Actn_Oprtn_Url ********************************************************************************/
		if(testscripttestactionoperation.hasUrl()) {
			t.setTstScrptTstActnOprtnUrl(String.valueOf(testscripttestactionoperation.getUrl()));
		}
		/******************** TstScrpt_Tst_Actn_Oprtn_Dscrptn ********************************************************************************/
		if(testscripttestactionoperation.hasDescription()) {
			t.setTstScrptTstActnOprtnDscrptn(String.valueOf(testscripttestactionoperation.getDescription()));
		}
		/******************** TstScrpt_Tst_Actn_Oprtn_Destination ********************************************************************************/
		if(testscripttestactionoperation.hasDestination()) {
			t.setTstScrptTstActnOprtnDestination(String.valueOf(testscripttestactionoperation.getDestination()));
		}
		/******************** TstScrpt_Tst_Actn_Oprtn_Params ********************************************************************************/
		if(testscripttestactionoperation.hasParams()) {
			t.setTstScrptTstActnOprtnParams(String.valueOf(testscripttestactionoperation.getParams()));
		}
		/******************** TstScrpt_Tst_Actn_Oprtn_Accept ********************************************************************************/
		if(testscripttestactionoperation.hasAccept()) {
			t.setTstScrptTstActnOprtnAccept(String.valueOf(testscripttestactionoperation.getAccept()));
		}
		/******************** TstScrpt_Tst_Actn_Oprtn_TarId ********************************************************************************/
		if(testscripttestactionoperation.hasTargetId()) {
			t.setTstScrptTstActnOprtnTarId(String.valueOf(testscripttestactionoperation.getTargetId()));
		}
		/******************** TstScrpt_Tst_Actn_Oprtn_RspsId ********************************************************************************/
		if(testscripttestactionoperation.hasResponseId()) {
			t.setTstScrptTstActnOprtnRspsId(String.valueOf(testscripttestactionoperation.getResponseId()));
		}
		/******************** TstScrpt_Tst_Actn_Oprtn_RqstId ********************************************************************************/
		if(testscripttestactionoperation.hasRequestId()) {
			t.setTstScrptTstActnOprtnRqstId(String.valueOf(testscripttestactionoperation.getRequestId()));
		}
		/******************** testscripttestactionoperationrequestheader ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.SetupActionOperationRequestHeaderComponent testscripttestactionoperationrequestheader = testscripttestactionoperation.getRequestHeaderFirstRep();

		/******************** TstScrpt_Tst_Actn_Oprtn_RqstHeader_Vl ********************************************************************************/
		if(testscripttestactionoperationrequestheader.hasValue()) {
			t.setTstScrptTstActnOprtnRqstHeaderVl(String.valueOf(testscripttestactionoperationrequestheader.getValue()));
		}
		/******************** TstScrpt_Tst_Actn_Oprtn_RqstHeader_Field ********************************************************************************/
		if(testscripttestactionoperationrequestheader.hasField()) {
			t.setTstScrptTstActnOprtnRqstHeaderField(String.valueOf(testscripttestactionoperationrequestheader.getField()));
		}
		/******************** TstScrpt_Tst_Actn_Oprtn_EncodeRqstUrl ********************************************************************************/
		if(testscripttestactionoperation.hasEncodeRequestUrl()) {
			t.setTstScrptTstActnOprtnEncodeRqstUrl(String.valueOf(testscripttestactionoperation.getEncodeRequestUrl()));
		}
		/******************** TstScrpt_Tst_Actn_Oprtn_Lbl ********************************************************************************/
		if(testscripttestactionoperation.hasLabel()) {
			t.setTstScrptTstActnOprtnLbl(String.valueOf(testscripttestactionoperation.getLabel()));
		}
		/******************** TstScrpt_Tst_Actn_Oprtn_Origin ********************************************************************************/
		if(testscripttestactionoperation.hasOrigin()) {
			t.setTstScrptTstActnOprtnOrigin(String.valueOf(testscripttestactionoperation.getOrigin()));
		}
		/******************** TstScrpt_Tst_Actn_Oprtn_SrcId ********************************************************************************/
		if(testscripttestactionoperation.hasSourceId()) {
			t.setTstScrptTstActnOprtnSrcId(String.valueOf(testscripttestactionoperation.getSourceId()));
		}
		/******************** TstScrpt_Tst_Dscrptn ********************************************************************************/
		if(testscripttest.hasDescription()) {
			t.setTstScrptTstDscrptn(String.valueOf(testscripttest.getDescription()));
		}
		/******************** testscriptteardown ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptTeardownComponent testscriptteardown = testscript.getTeardown();

		/******************** testscriptteardownaction ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TeardownActionComponent testscriptteardownaction = testscriptteardown.getActionFirstRep();

		/******************** testscriptteardownactionoperation ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.SetupActionOperationComponent testscriptteardownactionoperation = testscriptteardownaction.getOperation();

		/******************** TstScrpt_Teardown_Actn_Oprtn_Rsrc ********************************************************************************/
		if(testscriptteardownactionoperation.hasResource()) {
			t.setTstScrptTeardownActnOprtnRsrc(String.valueOf(testscriptteardownactionoperation.getResource()));
		}
		/******************** testscriptteardownactionoperationmethod ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptRequestMethodCode testscriptteardownactionoperationmethod = testscriptteardownactionoperation.getMethod();
		t.setTstScrptTeardownActnOprtnMthd(testscriptteardownactionoperationmethod.toCode());

		/******************** testscriptteardownactionoperationtype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding testscriptteardownactionoperationtype = testscriptteardownactionoperation.getType();

		/******************** TstScrpt_Teardown_Actn_Oprtn_Typ_Dsply ********************************************************************************/
		if(testscriptteardownactionoperationtype.hasDisplay()) {
			t.setTstScrptTeardownActnOprtnTypDsply(String.valueOf(testscriptteardownactionoperationtype.getDisplay()));
		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_Typ_Vrsn ********************************************************************************/
		if(testscriptteardownactionoperationtype.hasVersion()) {
			t.setTstScrptTeardownActnOprtnTypVrsn(String.valueOf(testscriptteardownactionoperationtype.getVersion()));
		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_Typ_Cd ********************************************************************************/
		if(testscriptteardownactionoperationtype.hasCode()) {
			t.setTstScrptTeardownActnOprtnTypCd(String.valueOf(testscriptteardownactionoperationtype.getCode()));
		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_Typ_Sys ********************************************************************************/
		if(testscriptteardownactionoperationtype.hasSystem()) {
			t.setTstScrptTeardownActnOprtnTypSys(String.valueOf(testscriptteardownactionoperationtype.getSystem()));
		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_Typ_UsrSltd ********************************************************************************/
		if(testscriptteardownactionoperationtype.hasUserSelected()) {
			t.setTstScrptTeardownActnOprtnTypUsrSltd(String.valueOf(testscriptteardownactionoperationtype.getUserSelected()));
		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_CntntTyp ********************************************************************************/
		if(testscriptteardownactionoperation.hasContentType()) {
			t.setTstScrptTeardownActnOprtnCntntTyp(String.valueOf(testscriptteardownactionoperation.getContentType()));
		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_Url ********************************************************************************/
		if(testscriptteardownactionoperation.hasUrl()) {
			t.setTstScrptTeardownActnOprtnUrl(String.valueOf(testscriptteardownactionoperation.getUrl()));
		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_Dscrptn ********************************************************************************/
		if(testscriptteardownactionoperation.hasDescription()) {
			t.setTstScrptTeardownActnOprtnDscrptn(String.valueOf(testscriptteardownactionoperation.getDescription()));
		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_Destination ********************************************************************************/
		if(testscriptteardownactionoperation.hasDestination()) {
			t.setTstScrptTeardownActnOprtnDestination(String.valueOf(testscriptteardownactionoperation.getDestination()));
		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_Params ********************************************************************************/
		if(testscriptteardownactionoperation.hasParams()) {
			t.setTstScrptTeardownActnOprtnParams(String.valueOf(testscriptteardownactionoperation.getParams()));
		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_Accept ********************************************************************************/
		if(testscriptteardownactionoperation.hasAccept()) {
			t.setTstScrptTeardownActnOprtnAccept(String.valueOf(testscriptteardownactionoperation.getAccept()));
		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_TarId ********************************************************************************/
		if(testscriptteardownactionoperation.hasTargetId()) {
			t.setTstScrptTeardownActnOprtnTarId(String.valueOf(testscriptteardownactionoperation.getTargetId()));
		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_RspsId ********************************************************************************/
		if(testscriptteardownactionoperation.hasResponseId()) {
			t.setTstScrptTeardownActnOprtnRspsId(String.valueOf(testscriptteardownactionoperation.getResponseId()));
		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_RqstId ********************************************************************************/
		if(testscriptteardownactionoperation.hasRequestId()) {
			t.setTstScrptTeardownActnOprtnRqstId(String.valueOf(testscriptteardownactionoperation.getRequestId()));
		}
		/******************** testscriptteardownactionoperationrequestheader ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.SetupActionOperationRequestHeaderComponent testscriptteardownactionoperationrequestheader = testscriptteardownactionoperation.getRequestHeaderFirstRep();

		/******************** TstScrpt_Teardown_Actn_Oprtn_RqstHeader_Vl ********************************************************************************/
		if(testscriptteardownactionoperationrequestheader.hasValue()) {
			t.setTstScrptTeardownActnOprtnRqstHeaderVl(String.valueOf(testscriptteardownactionoperationrequestheader.getValue()));
		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_RqstHeader_Field ********************************************************************************/
		if(testscriptteardownactionoperationrequestheader.hasField()) {
			t.setTstScrptTeardownActnOprtnRqstHeaderField(String.valueOf(testscriptteardownactionoperationrequestheader.getField()));
		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_EncodeRqstUrl ********************************************************************************/
		if(testscriptteardownactionoperation.hasEncodeRequestUrl()) {
			t.setTstScrptTeardownActnOprtnEncodeRqstUrl(String.valueOf(testscriptteardownactionoperation.getEncodeRequestUrl()));
		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_Lbl ********************************************************************************/
		if(testscriptteardownactionoperation.hasLabel()) {
			t.setTstScrptTeardownActnOprtnLbl(String.valueOf(testscriptteardownactionoperation.getLabel()));
		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_Origin ********************************************************************************/
		if(testscriptteardownactionoperation.hasOrigin()) {
			t.setTstScrptTeardownActnOprtnOrigin(String.valueOf(testscriptteardownactionoperation.getOrigin()));
		}
		/******************** TstScrpt_Teardown_Actn_Oprtn_SrcId ********************************************************************************/
		if(testscriptteardownactionoperation.hasSourceId()) {
			t.setTstScrptTeardownActnOprtnSrcId(String.valueOf(testscriptteardownactionoperation.getSourceId()));
		}
		/******************** TstScrpt_Copyright ********************************************************************************/
		if(testscript.hasCopyright()) {
			t.setTstScrptCopyright(String.valueOf(testscript.getCopyright()));
		}
		/******************** testscriptmetadata ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptMetadataComponent testscriptmetadata = testscript.getMetadata();

		/******************** testscriptmetadatacapability ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptMetadataCapabilityComponent testscriptmetadatacapability = testscriptmetadata.getCapabilityFirstRep();

		/******************** TstScrpt_Metadata_Capblty_Dscrptn ********************************************************************************/
		if(testscriptmetadatacapability.hasDescription()) {
			t.setTstScrptMetadataCapbltyDscrptn(String.valueOf(testscriptmetadatacapability.getDescription()));
		}
		/******************** TstScrpt_Metadata_Capblty_Destination ********************************************************************************/
		if(testscriptmetadatacapability.hasDestination()) {
			t.setTstScrptMetadataCapbltyDestination(String.valueOf(testscriptmetadatacapability.getDestination()));
		}
		/******************** TstScrpt_Metadata_Capblty_Cpnlties ********************************************************************************/
		if(testscriptmetadatacapability.hasCapabilities()) {
			t.setTstScrptMetadataCapbltyCpnlties(String.valueOf(testscriptmetadatacapability.getCapabilities()));
		}
		/******************** TstScrpt_Metadata_Capblty_Validated ********************************************************************************/
		if(testscriptmetadatacapability.hasValidated()) {
			t.setTstScrptMetadataCapbltyValidated(String.valueOf(testscriptmetadatacapability.getValidated()));
		}
		/******************** TstScrpt_Metadata_Capblty_Required ********************************************************************************/
		if(testscriptmetadatacapability.hasRequired()) {
			t.setTstScrptMetadataCapbltyRequired(String.valueOf(testscriptmetadatacapability.getRequired()));
		}
		/******************** testscriptmetadatalink ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptMetadataLinkComponent testscriptmetadatalink = testscriptmetadata.getLinkFirstRep();

		/******************** TstScrpt_Metadata_Link_Url ********************************************************************************/
		if(testscriptmetadatalink.hasUrl()) {
			t.setTstScrptMetadataLinkUrl(String.valueOf(testscriptmetadatalink.getUrl()));
		}
		/******************** TstScrpt_Metadata_Link_Dscrptn ********************************************************************************/
		if(testscriptmetadatalink.hasDescription()) {
			t.setTstScrptMetadataLinkDscrptn(String.valueOf(testscriptmetadatalink.getDescription()));
		}
		/******************** TstScrpt_Profile ********************************************************************************/
		if(testscript.hasProfile()) {
			t.setTstScrptProfile(String.valueOf(testscript.getProfileFirstRep()));
		}
		/******************** testscriptfixture ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptFixtureComponent testscriptfixture = testscript.getFixtureFirstRep();

		/******************** TstScrpt_Fixture_Rsrc ********************************************************************************/
		if(testscriptfixture.hasResource()) {
			t.setTstScrptFixtureRsrc(String.valueOf(testscriptfixture.getResource()));
		}
		/******************** TstScrpt_Fixture_Autodelete ********************************************************************************/
		if(testscriptfixture.hasAutodelete()) {
			t.setTstScrptFixtureAutodelete(String.valueOf(testscriptfixture.getAutodelete()));
		}
		/******************** TstScrpt_Fixture_Autocreate ********************************************************************************/
		if(testscriptfixture.hasAutocreate()) {
			t.setTstScrptFixtureAutocreate(String.valueOf(testscriptfixture.getAutocreate()));
		}
		/******************** testscriptorigin ********************************************************************************/
		org.hl7.fhir.r4.model.TestScript.TestScriptOriginComponent testscriptorigin = testscript.getOriginFirstRep();

		/******************** TstScrpt_Origin_Index ********************************************************************************/
		if(testscriptorigin.hasIndex()) {
			t.setTstScrptOriginIndex(String.valueOf(testscriptorigin.getIndex()));
		}
		/******************** testscriptoriginprofile ********************************************************************************/
		org.hl7.fhir.r4.model.Coding testscriptoriginprofile = testscriptorigin.getProfile();

		/******************** TstScrpt_Origin_Profile_Dsply ********************************************************************************/
		if(testscriptoriginprofile.hasDisplay()) {
			t.setTstScrptOriginProfileDsply(String.valueOf(testscriptoriginprofile.getDisplay()));
		}
		/******************** TstScrpt_Origin_Profile_Vrsn ********************************************************************************/
		if(testscriptoriginprofile.hasVersion()) {
			t.setTstScrptOriginProfileVrsn(String.valueOf(testscriptoriginprofile.getVersion()));
		}
		/******************** TstScrpt_Origin_Profile_Cd ********************************************************************************/
		if(testscriptoriginprofile.hasCode()) {
			t.setTstScrptOriginProfileCd(String.valueOf(testscriptoriginprofile.getCode()));
		}
		/******************** TstScrpt_Origin_Profile_Sys ********************************************************************************/
		if(testscriptoriginprofile.hasSystem()) {
			t.setTstScrptOriginProfileSys(String.valueOf(testscriptoriginprofile.getSystem()));
		}
		/******************** TstScrpt_Origin_Profile_UsrSltd ********************************************************************************/
		if(testscriptoriginprofile.hasUserSelected()) {
			t.setTstScrptOriginProfileUsrSltd(String.valueOf(testscriptoriginprofile.getUserSelected()));
		}
		return t;
	}
}
