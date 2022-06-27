package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.VerificationResult;
public class VerificationResultBidirectionalConversion 
{
	public VerificationResult VerificationResults(org.hl7.fhir.r4.model.VerificationResult verificationresult) throws ParseException
	{
		 main.java.com.campfhir.model.VerificationResult v = new  main.java.com.campfhir.model.VerificationResult();

		/******************** id ********************************************************************************/
		verificationresult.setId(v.getId());

		/******************** verificationresultvalidationprocess ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept verificationresultvalidationprocess = verificationresult.getValidationProcessFirstRep();

		/******************** VrfctnRslt_ValidationProcess_Txt ********************************************************************************/
		if(verificationresultvalidationprocess.hasText()) {
			v.setVrfctnRsltValidationProcessTxt(String.valueOf(verificationresultvalidationprocess.getText()));
		}
		/******************** verificationresultvalidationprocesscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding verificationresultvalidationprocesscoding = verificationresultvalidationprocess.getCodingFirstRep();

		/******************** VrfctnRslt_ValidationProcess_Cdg_Vrsn ********************************************************************************/
		if(verificationresultvalidationprocesscoding.hasVersion()) {
			v.setVrfctnRsltValidationProcessCdgVrsn(String.valueOf(verificationresultvalidationprocesscoding.getVersion()));
		}
		/******************** VrfctnRslt_ValidationProcess_Cdg_Dsply ********************************************************************************/
		if(verificationresultvalidationprocesscoding.hasDisplay()) {
			v.setVrfctnRsltValidationProcessCdgDsply(String.valueOf(verificationresultvalidationprocesscoding.getDisplay()));
		}
		/******************** VrfctnRslt_ValidationProcess_Cdg_Cd ********************************************************************************/
		if(verificationresultvalidationprocesscoding.hasCode()) {
			v.setVrfctnRsltValidationProcessCdgCd(String.valueOf(verificationresultvalidationprocesscoding.getCode()));
		}
		/******************** VrfctnRslt_ValidationProcess_Cdg_UsrSltd ********************************************************************************/
		if(verificationresultvalidationprocesscoding.hasUserSelected()) {
			v.setVrfctnRsltValidationProcessCdgUsrSltd(String.valueOf(verificationresultvalidationprocesscoding.getUserSelected()));
		}
		/******************** VrfctnRslt_ValidationProcess_Cdg_Sys ********************************************************************************/
		if(verificationresultvalidationprocesscoding.hasSystem()) {
			v.setVrfctnRsltValidationProcessCdgSys(String.valueOf(verificationresultvalidationprocesscoding.getSystem()));
		}
		/******************** verificationresultvalidator ********************************************************************************/
		org.hl7.fhir.r4.model.VerificationResult.VerificationResultValidatorComponent verificationresultvalidator = verificationresult.getValidatorFirstRep();

		/******************** VrfctnRslt_Validator_Orgnztn ********************************************************************************/
		if(verificationresultvalidator.hasOrganization()) {
			v.setVrfctnRsltValidatorOrgnztn(String.valueOf(verificationresultvalidator.getOrganization()));
		}
		/******************** verificationresultvalidatorattestationsignature ********************************************************************************/
		org.hl7.fhir.r4.model.Signature verificationresultvalidatorattestationsignature = verificationresultvalidator.getAttestationSignature();

		/******************** verificationresultvalidatorattestationsignaturetype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding verificationresultvalidatorattestationsignaturetype = verificationresultvalidatorattestationsignature.getTypeFirstRep();

		/******************** VrfctnRslt_Validator_AttestationSignature_Typ_Vrsn ********************************************************************************/
		if(verificationresultvalidatorattestationsignaturetype.hasVersion()) {
			v.setVrfctnRsltValidatorAttestationSignatureTypVrsn(String.valueOf(verificationresultvalidatorattestationsignaturetype.getVersion()));
		}
		/******************** VrfctnRslt_Validator_AttestationSignature_Typ_Dsply ********************************************************************************/
		if(verificationresultvalidatorattestationsignaturetype.hasDisplay()) {
			v.setVrfctnRsltValidatorAttestationSignatureTypDsply(String.valueOf(verificationresultvalidatorattestationsignaturetype.getDisplay()));
		}
		/******************** VrfctnRslt_Validator_AttestationSignature_Typ_Cd ********************************************************************************/
		if(verificationresultvalidatorattestationsignaturetype.hasCode()) {
			v.setVrfctnRsltValidatorAttestationSignatureTypCd(String.valueOf(verificationresultvalidatorattestationsignaturetype.getCode()));
		}
		/******************** VrfctnRslt_Validator_AttestationSignature_Typ_UsrSltd ********************************************************************************/
		if(verificationresultvalidatorattestationsignaturetype.hasUserSelected()) {
			v.setVrfctnRsltValidatorAttestationSignatureTypUsrSltd(String.valueOf(verificationresultvalidatorattestationsignaturetype.getUserSelected()));
		}
		/******************** VrfctnRslt_Validator_AttestationSignature_Typ_Sys ********************************************************************************/
		if(verificationresultvalidatorattestationsignaturetype.hasSystem()) {
			v.setVrfctnRsltValidatorAttestationSignatureTypSys(String.valueOf(verificationresultvalidatorattestationsignaturetype.getSystem()));
		}
		/******************** VrfctnRslt_Validator_AttestationSignature_OnBehalfOf ********************************************************************************/
		if(verificationresultvalidatorattestationsignature.hasOnBehalfOf()) {
			v.setVrfctnRsltValidatorAttestationSignatureOnBehalfOf(String.valueOf(verificationresultvalidatorattestationsignature.getOnBehalfOf()));
		}
		/******************** VrfctnRslt_Validator_AttestationSignature_Who ********************************************************************************/
		if(verificationresultvalidatorattestationsignature.hasWho()) {
			v.setVrfctnRsltValidatorAttestationSignatureWho(String.valueOf(verificationresultvalidatorattestationsignature.getWho()));
		}
		/******************** VrfctnRslt_Validator_AttestationSignature_SigFrmat ********************************************************************************/
		if(verificationresultvalidatorattestationsignature.hasSigFormat()) {
			v.setVrfctnRsltValidatorAttestationSignatureSigFrmat(String.valueOf(verificationresultvalidatorattestationsignature.getSigFormat()));
		}
		/******************** VrfctnRslt_Validator_AttestationSignature_TarFrmat ********************************************************************************/
		if(verificationresultvalidatorattestationsignature.hasTargetFormat()) {
			v.setVrfctnRsltValidatorAttestationSignatureTarFrmat(String.valueOf(verificationresultvalidatorattestationsignature.getTargetFormat()));
		}
		/******************** VrfctnRslt_Validator_AttestationSignature_Data ********************************************************************************/
		if(verificationresultvalidatorattestationsignature.hasData()) {
			v.setVrfctnRsltValidatorAttestationSignatureData(String.valueOf(verificationresultvalidatorattestationsignature.getData()));
		}

		/******************** VrfctnRslt_Validator_AttestationSignature_When ********************************************************************************/
		if(verificationresultvalidatorattestationsignature.hasWhen()) {
			v.setVrfctnRsltValidatorAttestationSignatureWhen(String.valueOf(verificationresultvalidatorattestationsignature.getWhen()));
		}
		/******************** VrfctnRslt_Validator_IdentityCertificate ********************************************************************************/
		if(verificationresultvalidator.hasIdentityCertificate()) {
			v.setVrfctnRsltValidatorIdentityCertificate(String.valueOf(verificationresultvalidator.getIdentityCertificate()));
		}
		/******************** verificationresultprimarysource ********************************************************************************/
		org.hl7.fhir.r4.model.VerificationResult.VerificationResultPrimarySourceComponent verificationresultprimarysource = verificationresult.getPrimarySourceFirstRep();

		/******************** verificationresultprimarysourcetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept verificationresultprimarysourcetype = verificationresultprimarysource.getTypeFirstRep();

		/******************** VrfctnRslt_PrimarySrc_Typ_Txt ********************************************************************************/
		if(verificationresultprimarysourcetype.hasText()) {
			v.setVrfctnRsltPrimarySrcTypTxt(String.valueOf(verificationresultprimarysourcetype.getText()));
		}
		/******************** verificationresultprimarysourcetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding verificationresultprimarysourcetypecoding = verificationresultprimarysourcetype.getCodingFirstRep();

		/******************** VrfctnRslt_PrimarySrc_Typ_Cdg_Vrsn ********************************************************************************/
		if(verificationresultprimarysourcetypecoding.hasVersion()) {
			v.setVrfctnRsltPrimarySrcTypCdgVrsn(String.valueOf(verificationresultprimarysourcetypecoding.getVersion()));
		}
		/******************** VrfctnRslt_PrimarySrc_Typ_Cdg_Dsply ********************************************************************************/
		if(verificationresultprimarysourcetypecoding.hasDisplay()) {
			v.setVrfctnRsltPrimarySrcTypCdgDsply(String.valueOf(verificationresultprimarysourcetypecoding.getDisplay()));
		}
		/******************** VrfctnRslt_PrimarySrc_Typ_Cdg_Cd ********************************************************************************/
		if(verificationresultprimarysourcetypecoding.hasCode()) {
			v.setVrfctnRsltPrimarySrcTypCdgCd(String.valueOf(verificationresultprimarysourcetypecoding.getCode()));
		}
		/******************** VrfctnRslt_PrimarySrc_Typ_Cdg_UsrSltd ********************************************************************************/
		if(verificationresultprimarysourcetypecoding.hasUserSelected()) {
			v.setVrfctnRsltPrimarySrcTypCdgUsrSltd(String.valueOf(verificationresultprimarysourcetypecoding.getUserSelected()));
		}
		/******************** VrfctnRslt_PrimarySrc_Typ_Cdg_Sys ********************************************************************************/
		if(verificationresultprimarysourcetypecoding.hasSystem()) {
			v.setVrfctnRsltPrimarySrcTypCdgSys(String.valueOf(verificationresultprimarysourcetypecoding.getSystem()));
		}
		/******************** VrfctnRslt_PrimarySrc_ValidationDt ********************************************************************************/
		if(verificationresultprimarysource.hasValidationDate()) {
			v.setVrfctnRsltPrimarySrcValidationDt(String.valueOf(verificationresultprimarysource.getValidationDate()));
		}
		/******************** verificationresultprimarysourcecanpushupdates ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept verificationresultprimarysourcecanpushupdates = verificationresultprimarysource.getCanPushUpdates();

		/******************** VrfctnRslt_PrimarySrc_CanPushUpdates_Txt ********************************************************************************/
		if(verificationresultprimarysourcecanpushupdates.hasText()) {
			v.setVrfctnRsltPrimarySrcCanPushUpdatesTxt(String.valueOf(verificationresultprimarysourcecanpushupdates.getText()));
		}
		/******************** verificationresultprimarysourcecanpushupdatescoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding verificationresultprimarysourcecanpushupdatescoding = verificationresultprimarysourcecanpushupdates.getCodingFirstRep();

		/******************** VrfctnRslt_PrimarySrc_CanPushUpdates_Cdg_Vrsn ********************************************************************************/
		if(verificationresultprimarysourcecanpushupdatescoding.hasVersion()) {
			v.setVrfctnRsltPrimarySrcCanPushUpdatesCdgVrsn(String.valueOf(verificationresultprimarysourcecanpushupdatescoding.getVersion()));
		}
		/******************** VrfctnRslt_PrimarySrc_CanPushUpdates_Cdg_Dsply ********************************************************************************/
		if(verificationresultprimarysourcecanpushupdatescoding.hasDisplay()) {
			v.setVrfctnRsltPrimarySrcCanPushUpdatesCdgDsply(String.valueOf(verificationresultprimarysourcecanpushupdatescoding.getDisplay()));
		}
		/******************** VrfctnRslt_PrimarySrc_CanPushUpdates_Cdg_Cd ********************************************************************************/
		if(verificationresultprimarysourcecanpushupdatescoding.hasCode()) {
			v.setVrfctnRsltPrimarySrcCanPushUpdatesCdgCd(String.valueOf(verificationresultprimarysourcecanpushupdatescoding.getCode()));
		}
		/******************** VrfctnRslt_PrimarySrc_CanPushUpdates_Cdg_UsrSltd ********************************************************************************/
		if(verificationresultprimarysourcecanpushupdatescoding.hasUserSelected()) {
			v.setVrfctnRsltPrimarySrcCanPushUpdatesCdgUsrSltd(String.valueOf(verificationresultprimarysourcecanpushupdatescoding.getUserSelected()));
		}
		/******************** VrfctnRslt_PrimarySrc_CanPushUpdates_Cdg_Sys ********************************************************************************/
		if(verificationresultprimarysourcecanpushupdatescoding.hasSystem()) {
			v.setVrfctnRsltPrimarySrcCanPushUpdatesCdgSys(String.valueOf(verificationresultprimarysourcecanpushupdatescoding.getSystem()));
		}
		/******************** verificationresultprimarysourcevalidationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept verificationresultprimarysourcevalidationstatus = verificationresultprimarysource.getValidationStatus();

		/******************** VrfctnRslt_PrimarySrc_ValidationSts_Txt ********************************************************************************/
		if(verificationresultprimarysourcevalidationstatus.hasText()) {
			v.setVrfctnRsltPrimarySrcValidationStsTxt(String.valueOf(verificationresultprimarysourcevalidationstatus.getText()));
		}
		/******************** verificationresultprimarysourcevalidationstatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding verificationresultprimarysourcevalidationstatuscoding = verificationresultprimarysourcevalidationstatus.getCodingFirstRep();

		/******************** VrfctnRslt_PrimarySrc_ValidationSts_Cdg_Vrsn ********************************************************************************/
		if(verificationresultprimarysourcevalidationstatuscoding.hasVersion()) {
			v.setVrfctnRsltPrimarySrcValidationStsCdgVrsn(String.valueOf(verificationresultprimarysourcevalidationstatuscoding.getVersion()));
		}
		/******************** VrfctnRslt_PrimarySrc_ValidationSts_Cdg_Dsply ********************************************************************************/
		if(verificationresultprimarysourcevalidationstatuscoding.hasDisplay()) {
			v.setVrfctnRsltPrimarySrcValidationStsCdgDsply(String.valueOf(verificationresultprimarysourcevalidationstatuscoding.getDisplay()));
		}
		/******************** VrfctnRslt_PrimarySrc_ValidationSts_Cdg_Cd ********************************************************************************/
		if(verificationresultprimarysourcevalidationstatuscoding.hasCode()) {
			v.setVrfctnRsltPrimarySrcValidationStsCdgCd(String.valueOf(verificationresultprimarysourcevalidationstatuscoding.getCode()));
		}
		/******************** VrfctnRslt_PrimarySrc_ValidationSts_Cdg_UsrSltd ********************************************************************************/
		if(verificationresultprimarysourcevalidationstatuscoding.hasUserSelected()) {
			v.setVrfctnRsltPrimarySrcValidationStsCdgUsrSltd(String.valueOf(verificationresultprimarysourcevalidationstatuscoding.getUserSelected()));
		}
		/******************** VrfctnRslt_PrimarySrc_ValidationSts_Cdg_Sys ********************************************************************************/
		if(verificationresultprimarysourcevalidationstatuscoding.hasSystem()) {
			v.setVrfctnRsltPrimarySrcValidationStsCdgSys(String.valueOf(verificationresultprimarysourcevalidationstatuscoding.getSystem()));
		}
		/******************** verificationresultprimarysourcepushtypeavailable ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept verificationresultprimarysourcepushtypeavailable = verificationresultprimarysource.getPushTypeAvailableFirstRep();

		/******************** VrfctnRslt_PrimarySrc_PushTypAvailable_Txt ********************************************************************************/
		if(verificationresultprimarysourcepushtypeavailable.hasText()) {
			v.setVrfctnRsltPrimarySrcPushTypAvailableTxt(String.valueOf(verificationresultprimarysourcepushtypeavailable.getText()));
		}
		/******************** verificationresultprimarysourcepushtypeavailablecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding verificationresultprimarysourcepushtypeavailablecoding = verificationresultprimarysourcepushtypeavailable.getCodingFirstRep();

		/******************** VrfctnRslt_PrimarySrc_PushTypAvailable_Cdg_Vrsn ********************************************************************************/
		if(verificationresultprimarysourcepushtypeavailablecoding.hasVersion()) {
			v.setVrfctnRsltPrimarySrcPushTypAvailableCdgVrsn(String.valueOf(verificationresultprimarysourcepushtypeavailablecoding.getVersion()));
		}
		/******************** VrfctnRslt_PrimarySrc_PushTypAvailable_Cdg_Dsply ********************************************************************************/
		if(verificationresultprimarysourcepushtypeavailablecoding.hasDisplay()) {
			v.setVrfctnRsltPrimarySrcPushTypAvailableCdgDsply(String.valueOf(verificationresultprimarysourcepushtypeavailablecoding.getDisplay()));
		}
		/******************** VrfctnRslt_PrimarySrc_PushTypAvailable_Cdg_Cd ********************************************************************************/
		if(verificationresultprimarysourcepushtypeavailablecoding.hasCode()) {
			v.setVrfctnRsltPrimarySrcPushTypAvailableCdgCd(String.valueOf(verificationresultprimarysourcepushtypeavailablecoding.getCode()));
		}
		/******************** VrfctnRslt_PrimarySrc_PushTypAvailable_Cdg_UsrSltd ********************************************************************************/
		if(verificationresultprimarysourcepushtypeavailablecoding.hasUserSelected()) {
			v.setVrfctnRsltPrimarySrcPushTypAvailableCdgUsrSltd(String.valueOf(verificationresultprimarysourcepushtypeavailablecoding.getUserSelected()));
		}
		/******************** VrfctnRslt_PrimarySrc_PushTypAvailable_Cdg_Sys ********************************************************************************/
		if(verificationresultprimarysourcepushtypeavailablecoding.hasSystem()) {
			v.setVrfctnRsltPrimarySrcPushTypAvailableCdgSys(String.valueOf(verificationresultprimarysourcepushtypeavailablecoding.getSystem()));
		}
		/******************** verificationresultprimarysourcecommunicationmethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept verificationresultprimarysourcecommunicationmethod = verificationresultprimarysource.getCommunicationMethodFirstRep();

		/******************** VrfctnRslt_PrimarySrc_CmmnctnMthd_Txt ********************************************************************************/
		if(verificationresultprimarysourcecommunicationmethod.hasText()) {
			v.setVrfctnRsltPrimarySrcCmmnctnMthdTxt(String.valueOf(verificationresultprimarysourcecommunicationmethod.getText()));
		}
		/******************** verificationresultprimarysourcecommunicationmethodcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding verificationresultprimarysourcecommunicationmethodcoding = verificationresultprimarysourcecommunicationmethod.getCodingFirstRep();

		/******************** VrfctnRslt_PrimarySrc_CmmnctnMthd_Cdg_Vrsn ********************************************************************************/
		if(verificationresultprimarysourcecommunicationmethodcoding.hasVersion()) {
			v.setVrfctnRsltPrimarySrcCmmnctnMthdCdgVrsn(String.valueOf(verificationresultprimarysourcecommunicationmethodcoding.getVersion()));
		}
		/******************** VrfctnRslt_PrimarySrc_CmmnctnMthd_Cdg_Dsply ********************************************************************************/
		if(verificationresultprimarysourcecommunicationmethodcoding.hasDisplay()) {
			v.setVrfctnRsltPrimarySrcCmmnctnMthdCdgDsply(String.valueOf(verificationresultprimarysourcecommunicationmethodcoding.getDisplay()));
		}
		/******************** VrfctnRslt_PrimarySrc_CmmnctnMthd_Cdg_Cd ********************************************************************************/
		if(verificationresultprimarysourcecommunicationmethodcoding.hasCode()) {
			v.setVrfctnRsltPrimarySrcCmmnctnMthdCdgCd(String.valueOf(verificationresultprimarysourcecommunicationmethodcoding.getCode()));
		}
		/******************** VrfctnRslt_PrimarySrc_CmmnctnMthd_Cdg_UsrSltd ********************************************************************************/
		if(verificationresultprimarysourcecommunicationmethodcoding.hasUserSelected()) {
			v.setVrfctnRsltPrimarySrcCmmnctnMthdCdgUsrSltd(String.valueOf(verificationresultprimarysourcecommunicationmethodcoding.getUserSelected()));
		}
		/******************** VrfctnRslt_PrimarySrc_CmmnctnMthd_Cdg_Sys ********************************************************************************/
		if(verificationresultprimarysourcecommunicationmethodcoding.hasSystem()) {
			v.setVrfctnRsltPrimarySrcCmmnctnMthdCdgSys(String.valueOf(verificationresultprimarysourcecommunicationmethodcoding.getSystem()));
		}
		/******************** VrfctnRslt_PrimarySrc_Who ********************************************************************************/
		if(verificationresultprimarysource.hasWho()) {
			v.setVrfctnRsltPrimarySrcWho(String.valueOf(verificationresultprimarysource.getWho()));
		}
		/******************** verificationresultfrequency ********************************************************************************/
		org.hl7.fhir.r4.model.Timing verificationresultfrequency = verificationresult.getFrequency();

		/******************** verificationresultfrequencycode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept verificationresultfrequencycode = verificationresultfrequency.getCode();

		/******************** VrfctnRslt_Frqncy_Cd_Txt ********************************************************************************/
		if(verificationresultfrequencycode.hasText()) {
			v.setVrfctnRsltFrqncyCdTxt(String.valueOf(verificationresultfrequencycode.getText()));
		}
		/******************** verificationresultfrequencycodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding verificationresultfrequencycodecoding = verificationresultfrequencycode.getCodingFirstRep();

		/******************** VrfctnRslt_Frqncy_Cd_Cdg_Vrsn ********************************************************************************/
		if(verificationresultfrequencycodecoding.hasVersion()) {
			v.setVrfctnRsltFrqncyCdCdgVrsn(String.valueOf(verificationresultfrequencycodecoding.getVersion()));
		}
		/******************** VrfctnRslt_Frqncy_Cd_Cdg_Dsply ********************************************************************************/
		if(verificationresultfrequencycodecoding.hasDisplay()) {
			v.setVrfctnRsltFrqncyCdCdgDsply(String.valueOf(verificationresultfrequencycodecoding.getDisplay()));
		}
		/******************** VrfctnRslt_Frqncy_Cd_Cdg_Cd ********************************************************************************/
		if(verificationresultfrequencycodecoding.hasCode()) {
			v.setVrfctnRsltFrqncyCdCdgCd(String.valueOf(verificationresultfrequencycodecoding.getCode()));
		}
		/******************** VrfctnRslt_Frqncy_Cd_Cdg_UsrSltd ********************************************************************************/
		if(verificationresultfrequencycodecoding.hasUserSelected()) {
			v.setVrfctnRsltFrqncyCdCdgUsrSltd(String.valueOf(verificationresultfrequencycodecoding.getUserSelected()));
		}
		/******************** VrfctnRslt_Frqncy_Cd_Cdg_Sys ********************************************************************************/
		if(verificationresultfrequencycodecoding.hasSystem()) {
			v.setVrfctnRsltFrqncyCdCdgSys(String.valueOf(verificationresultfrequencycodecoding.getSystem()));
		}
		/******************** verificationresultfrequencyrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent verificationresultfrequencyrepeat = verificationresultfrequency.getRepeat();

		/******************** VrfctnRslt_Frqncy_Rpt_Off ********************************************************************************/
		if(verificationresultfrequencyrepeat.hasOffset()) {
			v.setVrfctnRsltFrqncyRptOff(String.valueOf(verificationresultfrequencyrepeat.getOffset()));
		}
		/******************** VrfctnRslt_Frqncy_Rpt_Cnt ********************************************************************************/
		if(verificationresultfrequencyrepeat.hasCount()) {
			v.setVrfctnRsltFrqncyRptCnt(String.valueOf(verificationresultfrequencyrepeat.getCount()));
		}
		/******************** VrfctnRslt_Frqncy_Rpt_Frqncy ********************************************************************************/
		if(verificationresultfrequencyrepeat.hasFrequency()) {
			v.setVrfctnRsltFrqncyRptFrqncy(String.valueOf(verificationresultfrequencyrepeat.getFrequency()));
		}
		/******************** VrfctnRslt_Frqncy_Rpt_Prd ********************************************************************************/
		if(verificationresultfrequencyrepeat.hasPeriod()) {
			v.setVrfctnRsltFrqncyRptPrd(String.valueOf(verificationresultfrequencyrepeat.getPeriod()));
		}
		/******************** VrfctnRslt_Frqncy_Rpt_Duration ********************************************************************************/
		if(verificationresultfrequencyrepeat.hasDuration()) {
			v.setVrfctnRsltFrqncyRptDuration(String.valueOf(verificationresultfrequencyrepeat.getDuration()));
		}
		/******************** verificationresultfrequencyrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration verificationresultfrequencyrepeatboundsduration = verificationresultfrequencyrepeat.getBoundsDuration();

		/******************** VrfctnRslt_Frqncy_Rpt_BndsDuration_Vl ********************************************************************************/
		if(verificationresultfrequencyrepeatboundsduration.hasValue()) {
			v.setVrfctnRsltFrqncyRptBndsDurationVl(String.valueOf(verificationresultfrequencyrepeatboundsduration.getValue()));
		}
		/******************** verificationresultfrequencyrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator verificationresultfrequencyrepeatboundsdurationcomparator = verificationresultfrequencyrepeatboundsduration.getComparator();
		v.setVrfctnRsltFrqncyRptBndsDurationCmprtr(verificationresultfrequencyrepeatboundsdurationcomparator.toCode());

		/******************** VrfctnRslt_Frqncy_Rpt_BndsDuration_Cd ********************************************************************************/
		if(verificationresultfrequencyrepeatboundsduration.hasCode()) {
			v.setVrfctnRsltFrqncyRptBndsDurationCd(String.valueOf(verificationresultfrequencyrepeatboundsduration.getCode()));
		}
		/******************** VrfctnRslt_Frqncy_Rpt_BndsDuration_Unt ********************************************************************************/
		if(verificationresultfrequencyrepeatboundsduration.hasUnit()) {
			v.setVrfctnRsltFrqncyRptBndsDurationUnt(String.valueOf(verificationresultfrequencyrepeatboundsduration.getUnit()));
		}
		/******************** VrfctnRslt_Frqncy_Rpt_BndsDuration_Sys ********************************************************************************/
		if(verificationresultfrequencyrepeatboundsduration.hasSystem()) {
			v.setVrfctnRsltFrqncyRptBndsDurationSys(String.valueOf(verificationresultfrequencyrepeatboundsduration.getSystem()));
		}
		/******************** verificationresultfrequencyrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range verificationresultfrequencyrepeatboundsrange = verificationresultfrequencyrepeat.getBoundsRange();

		/******************** verificationresultfrequencyrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity verificationresultfrequencyrepeatboundsrangelow = verificationresultfrequencyrepeatboundsrange.getLow();

		/******************** VrfctnRslt_Frqncy_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(verificationresultfrequencyrepeatboundsrangelow.hasValue()) {
			v.setVrfctnRsltFrqncyRptBndsRngLwVl(String.valueOf(verificationresultfrequencyrepeatboundsrangelow.getValue()));
		}
		/******************** verificationresultfrequencyrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator verificationresultfrequencyrepeatboundsrangelowcomparator = verificationresultfrequencyrepeatboundsrangelow.getComparator();
		v.setVrfctnRsltFrqncyRptBndsRngLwCmprtr(verificationresultfrequencyrepeatboundsrangelowcomparator.toCode());

		/******************** VrfctnRslt_Frqncy_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(verificationresultfrequencyrepeatboundsrangelow.hasCode()) {
			v.setVrfctnRsltFrqncyRptBndsRngLwCd(String.valueOf(verificationresultfrequencyrepeatboundsrangelow.getCode()));
		}
		/******************** VrfctnRslt_Frqncy_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(verificationresultfrequencyrepeatboundsrangelow.hasUnit()) {
			v.setVrfctnRsltFrqncyRptBndsRngLwUnt(String.valueOf(verificationresultfrequencyrepeatboundsrangelow.getUnit()));
		}
		/******************** VrfctnRslt_Frqncy_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(verificationresultfrequencyrepeatboundsrangelow.hasSystem()) {
			v.setVrfctnRsltFrqncyRptBndsRngLwSys(String.valueOf(verificationresultfrequencyrepeatboundsrangelow.getSystem()));
		}
		/******************** verificationresultfrequencyrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity verificationresultfrequencyrepeatboundsrangehigh = verificationresultfrequencyrepeatboundsrange.getHigh();

		/******************** VrfctnRslt_Frqncy_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(verificationresultfrequencyrepeatboundsrangehigh.hasValue()) {
			v.setVrfctnRsltFrqncyRptBndsRngHiVl(String.valueOf(verificationresultfrequencyrepeatboundsrangehigh.getValue()));
		}
		/******************** verificationresultfrequencyrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator verificationresultfrequencyrepeatboundsrangehighcomparator = verificationresultfrequencyrepeatboundsrangehigh.getComparator();
		v.setVrfctnRsltFrqncyRptBndsRngHiCmprtr(verificationresultfrequencyrepeatboundsrangehighcomparator.toCode());

		/******************** VrfctnRslt_Frqncy_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(verificationresultfrequencyrepeatboundsrangehigh.hasCode()) {
			v.setVrfctnRsltFrqncyRptBndsRngHiCd(String.valueOf(verificationresultfrequencyrepeatboundsrangehigh.getCode()));
		}
		/******************** VrfctnRslt_Frqncy_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(verificationresultfrequencyrepeatboundsrangehigh.hasUnit()) {
			v.setVrfctnRsltFrqncyRptBndsRngHiUnt(String.valueOf(verificationresultfrequencyrepeatboundsrangehigh.getUnit()));
		}
		/******************** VrfctnRslt_Frqncy_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(verificationresultfrequencyrepeatboundsrangehigh.hasSystem()) {
			v.setVrfctnRsltFrqncyRptBndsRngHiSys(String.valueOf(verificationresultfrequencyrepeatboundsrangehigh.getSystem()));
		}
		/******************** verificationresultfrequencyrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period verificationresultfrequencyrepeatboundsperiod = verificationresultfrequencyrepeat.getBoundsPeriod();

		/******************** VrfctnRslt_Frqncy_Rpt_BndsPrd_Strt ********************************************************************************/
		if(verificationresultfrequencyrepeatboundsperiod.hasStart()) {
			v.setVrfctnRsltFrqncyRptBndsPrdStrt(String.valueOf(verificationresultfrequencyrepeatboundsperiod.getStart()));
		}
		/******************** VrfctnRslt_Frqncy_Rpt_BndsPrd_End ********************************************************************************/
		if(verificationresultfrequencyrepeatboundsperiod.hasEnd()) {
			v.setVrfctnRsltFrqncyRptBndsPrdEnd(String.valueOf(verificationresultfrequencyrepeatboundsperiod.getEnd()));
		}
		/******************** VrfctnRslt_Frqncy_Rpt_PrdMx ********************************************************************************/
		if(verificationresultfrequencyrepeat.hasPeriodMax()) {
			v.setVrfctnRsltFrqncyRptPrdMx(String.valueOf(verificationresultfrequencyrepeat.getPeriodMax()));
		}
		/******************** VrfctnRslt_Frqncy_Rpt_DurationMx ********************************************************************************/
		if(verificationresultfrequencyrepeat.hasDurationMax()) {
			v.setVrfctnRsltFrqncyRptDurationMx(String.valueOf(verificationresultfrequencyrepeat.getDurationMax()));
		}
		/******************** VrfctnRslt_Frqncy_Rpt_CntMx ********************************************************************************/
		if(verificationresultfrequencyrepeat.hasCountMax()) {
			v.setVrfctnRsltFrqncyRptCntMx(String.valueOf(verificationresultfrequencyrepeat.getCountMax()));
		}
		/******************** VrfctnRslt_Frqncy_Rpt_FrqncyMx ********************************************************************************/
		if(verificationresultfrequencyrepeat.hasFrequencyMax()) {
			v.setVrfctnRsltFrqncyRptFrqncyMx(String.valueOf(verificationresultfrequencyrepeat.getFrequencyMax()));
		}
		/******************** verificationresultfrequencyrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime verificationresultfrequencyrepeatdurationunit = verificationresultfrequencyrepeat.getDurationUnit();
		v.setVrfctnRsltFrqncyRptDurationUnt(verificationresultfrequencyrepeatdurationunit.toCode());

		/******************** verificationresultfrequencyrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime verificationresultfrequencyrepeatperiodunit = verificationresultfrequencyrepeat.getPeriodUnit();
		v.setVrfctnRsltFrqncyRptPrdUnt(verificationresultfrequencyrepeatperiodunit.toCode());

		/******************** verificationresultneed ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept verificationresultneed = verificationresult.getNeed();

		/******************** VrfctnRslt_Need_Txt ********************************************************************************/
		if(verificationresultneed.hasText()) {
			v.setVrfctnRsltNeedTxt(String.valueOf(verificationresultneed.getText()));
		}
		/******************** verificationresultneedcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding verificationresultneedcoding = verificationresultneed.getCodingFirstRep();

		/******************** VrfctnRslt_Need_Cdg_Vrsn ********************************************************************************/
		if(verificationresultneedcoding.hasVersion()) {
			v.setVrfctnRsltNeedCdgVrsn(String.valueOf(verificationresultneedcoding.getVersion()));
		}
		/******************** VrfctnRslt_Need_Cdg_Dsply ********************************************************************************/
		if(verificationresultneedcoding.hasDisplay()) {
			v.setVrfctnRsltNeedCdgDsply(String.valueOf(verificationresultneedcoding.getDisplay()));
		}
		/******************** VrfctnRslt_Need_Cdg_Cd ********************************************************************************/
		if(verificationresultneedcoding.hasCode()) {
			v.setVrfctnRsltNeedCdgCd(String.valueOf(verificationresultneedcoding.getCode()));
		}
		/******************** VrfctnRslt_Need_Cdg_UsrSltd ********************************************************************************/
		if(verificationresultneedcoding.hasUserSelected()) {
			v.setVrfctnRsltNeedCdgUsrSltd(String.valueOf(verificationresultneedcoding.getUserSelected()));
		}
		/******************** VrfctnRslt_Need_Cdg_Sys ********************************************************************************/
		if(verificationresultneedcoding.hasSystem()) {
			v.setVrfctnRsltNeedCdgSys(String.valueOf(verificationresultneedcoding.getSystem()));
		}
		/******************** verificationresultvalidationtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept verificationresultvalidationtype = verificationresult.getValidationType();

		/******************** VrfctnRslt_ValidationTyp_Txt ********************************************************************************/
		if(verificationresultvalidationtype.hasText()) {
			v.setVrfctnRsltValidationTypTxt(String.valueOf(verificationresultvalidationtype.getText()));
		}
		/******************** verificationresultvalidationtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding verificationresultvalidationtypecoding = verificationresultvalidationtype.getCodingFirstRep();

		/******************** VrfctnRslt_ValidationTyp_Cdg_Vrsn ********************************************************************************/
		if(verificationresultvalidationtypecoding.hasVersion()) {
			v.setVrfctnRsltValidationTypCdgVrsn(String.valueOf(verificationresultvalidationtypecoding.getVersion()));
		}
		/******************** VrfctnRslt_ValidationTyp_Cdg_Dsply ********************************************************************************/
		if(verificationresultvalidationtypecoding.hasDisplay()) {
			v.setVrfctnRsltValidationTypCdgDsply(String.valueOf(verificationresultvalidationtypecoding.getDisplay()));
		}
		/******************** VrfctnRslt_ValidationTyp_Cdg_Cd ********************************************************************************/
		if(verificationresultvalidationtypecoding.hasCode()) {
			v.setVrfctnRsltValidationTypCdgCd(String.valueOf(verificationresultvalidationtypecoding.getCode()));
		}
		/******************** VrfctnRslt_ValidationTyp_Cdg_UsrSltd ********************************************************************************/
		if(verificationresultvalidationtypecoding.hasUserSelected()) {
			v.setVrfctnRsltValidationTypCdgUsrSltd(String.valueOf(verificationresultvalidationtypecoding.getUserSelected()));
		}
		/******************** VrfctnRslt_ValidationTyp_Cdg_Sys ********************************************************************************/
		if(verificationresultvalidationtypecoding.hasSystem()) {
			v.setVrfctnRsltValidationTypCdgSys(String.valueOf(verificationresultvalidationtypecoding.getSystem()));
		}
		/******************** verificationresultfailureaction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept verificationresultfailureaction = verificationresult.getFailureAction();

		/******************** VrfctnRslt_FailureActn_Txt ********************************************************************************/
		if(verificationresultfailureaction.hasText()) {
			v.setVrfctnRsltFailureActnTxt(String.valueOf(verificationresultfailureaction.getText()));
		}
		/******************** verificationresultfailureactioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding verificationresultfailureactioncoding = verificationresultfailureaction.getCodingFirstRep();

		/******************** VrfctnRslt_FailureActn_Cdg_Vrsn ********************************************************************************/
		if(verificationresultfailureactioncoding.hasVersion()) {
			v.setVrfctnRsltFailureActnCdgVrsn(String.valueOf(verificationresultfailureactioncoding.getVersion()));
		}
		/******************** VrfctnRslt_FailureActn_Cdg_Dsply ********************************************************************************/
		if(verificationresultfailureactioncoding.hasDisplay()) {
			v.setVrfctnRsltFailureActnCdgDsply(String.valueOf(verificationresultfailureactioncoding.getDisplay()));
		}
		/******************** VrfctnRslt_FailureActn_Cdg_Cd ********************************************************************************/
		if(verificationresultfailureactioncoding.hasCode()) {
			v.setVrfctnRsltFailureActnCdgCd(String.valueOf(verificationresultfailureactioncoding.getCode()));
		}
		/******************** VrfctnRslt_FailureActn_Cdg_UsrSltd ********************************************************************************/
		if(verificationresultfailureactioncoding.hasUserSelected()) {
			v.setVrfctnRsltFailureActnCdgUsrSltd(String.valueOf(verificationresultfailureactioncoding.getUserSelected()));
		}
		/******************** VrfctnRslt_FailureActn_Cdg_Sys ********************************************************************************/
		if(verificationresultfailureactioncoding.hasSystem()) {
			v.setVrfctnRsltFailureActnCdgSys(String.valueOf(verificationresultfailureactioncoding.getSystem()));
		}
		/******************** VrfctnRslt_LastPerformed ********************************************************************************/
		if(verificationresult.hasLastPerformed()) {
			v.setVrfctnRsltLastPerformed(String.valueOf(verificationresult.getLastPerformed()));
		}
		/******************** verificationresultattestation ********************************************************************************/
		org.hl7.fhir.r4.model.VerificationResult.VerificationResultAttestationComponent verificationresultattestation = verificationresult.getAttestation();

		/******************** VrfctnRslt_Attestation_Dt ********************************************************************************/
		if(verificationresultattestation.hasDate()) {
			v.setVrfctnRsltAttestationDt(String.valueOf(verificationresultattestation.getDate()));
		}
		/******************** verificationresultattestationproxysignature ********************************************************************************/
		org.hl7.fhir.r4.model.Signature verificationresultattestationproxysignature = verificationresultattestation.getProxySignature();

		/******************** verificationresultattestationproxysignaturetype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding verificationresultattestationproxysignaturetype = verificationresultattestationproxysignature.getTypeFirstRep();

		/******************** VrfctnRslt_Attestation_ProxySignature_Typ_Vrsn ********************************************************************************/
		if(verificationresultattestationproxysignaturetype.hasVersion()) {
			v.setVrfctnRsltAttestationProxySignatureTypVrsn(String.valueOf(verificationresultattestationproxysignaturetype.getVersion()));
		}
		/******************** VrfctnRslt_Attestation_ProxySignature_Typ_Dsply ********************************************************************************/
		if(verificationresultattestationproxysignaturetype.hasDisplay()) {
			v.setVrfctnRsltAttestationProxySignatureTypDsply(String.valueOf(verificationresultattestationproxysignaturetype.getDisplay()));
		}
		/******************** VrfctnRslt_Attestation_ProxySignature_Typ_Cd ********************************************************************************/
		if(verificationresultattestationproxysignaturetype.hasCode()) {
			v.setVrfctnRsltAttestationProxySignatureTypCd(String.valueOf(verificationresultattestationproxysignaturetype.getCode()));
		}
		/******************** VrfctnRslt_Attestation_ProxySignature_Typ_UsrSltd ********************************************************************************/
		if(verificationresultattestationproxysignaturetype.hasUserSelected()) {
			v.setVrfctnRsltAttestationProxySignatureTypUsrSltd(String.valueOf(verificationresultattestationproxysignaturetype.getUserSelected()));
		}
		/******************** VrfctnRslt_Attestation_ProxySignature_Typ_Sys ********************************************************************************/
		if(verificationresultattestationproxysignaturetype.hasSystem()) {
			v.setVrfctnRsltAttestationProxySignatureTypSys(String.valueOf(verificationresultattestationproxysignaturetype.getSystem()));
		}
		/******************** VrfctnRslt_Attestation_ProxySignature_OnBehalfOf ********************************************************************************/
		if(verificationresultattestationproxysignature.hasOnBehalfOf()) {
			v.setVrfctnRsltAttestationProxySignatureOnBehalfOf(String.valueOf(verificationresultattestationproxysignature.getOnBehalfOf()));
		}
		/******************** VrfctnRslt_Attestation_ProxySignature_Who ********************************************************************************/
		if(verificationresultattestationproxysignature.hasWho()) {
			v.setVrfctnRsltAttestationProxySignatureWho(String.valueOf(verificationresultattestationproxysignature.getWho()));
		}
		/******************** VrfctnRslt_Attestation_ProxySignature_SigFrmat ********************************************************************************/
		if(verificationresultattestationproxysignature.hasSigFormat()) {
			v.setVrfctnRsltAttestationProxySignatureSigFrmat(String.valueOf(verificationresultattestationproxysignature.getSigFormat()));
		}
		/******************** VrfctnRslt_Attestation_ProxySignature_TarFrmat ********************************************************************************/
		if(verificationresultattestationproxysignature.hasTargetFormat()) {
			v.setVrfctnRsltAttestationProxySignatureTarFrmat(String.valueOf(verificationresultattestationproxysignature.getTargetFormat()));
		}
		/******************** VrfctnRslt_Attestation_ProxySignature_Data ********************************************************************************/
		if(verificationresultattestationproxysignature.hasData()) {
			v.setVrfctnRsltAttestationProxySignatureData(String.valueOf(verificationresultattestationproxysignature.getData()));
		}

		/******************** VrfctnRslt_Attestation_ProxySignature_When ********************************************************************************/
		if(verificationresultattestationproxysignature.hasWhen()) {
			v.setVrfctnRsltAttestationProxySignatureWhen(String.valueOf(verificationresultattestationproxysignature.getWhen()));
		}
		/******************** verificationresultattestationsourcesignature ********************************************************************************/
		org.hl7.fhir.r4.model.Signature verificationresultattestationsourcesignature = verificationresultattestation.getSourceSignature();

		/******************** verificationresultattestationsourcesignaturetype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding verificationresultattestationsourcesignaturetype = verificationresultattestationsourcesignature.getTypeFirstRep();

		/******************** VrfctnRslt_Attestation_SrcSignature_Typ_Vrsn ********************************************************************************/
		if(verificationresultattestationsourcesignaturetype.hasVersion()) {
			v.setVrfctnRsltAttestationSrcSignatureTypVrsn(String.valueOf(verificationresultattestationsourcesignaturetype.getVersion()));
		}
		/******************** VrfctnRslt_Attestation_SrcSignature_Typ_Dsply ********************************************************************************/
		if(verificationresultattestationsourcesignaturetype.hasDisplay()) {
			v.setVrfctnRsltAttestationSrcSignatureTypDsply(String.valueOf(verificationresultattestationsourcesignaturetype.getDisplay()));
		}
		/******************** VrfctnRslt_Attestation_SrcSignature_Typ_Cd ********************************************************************************/
		if(verificationresultattestationsourcesignaturetype.hasCode()) {
			v.setVrfctnRsltAttestationSrcSignatureTypCd(String.valueOf(verificationresultattestationsourcesignaturetype.getCode()));
		}
		/******************** VrfctnRslt_Attestation_SrcSignature_Typ_UsrSltd ********************************************************************************/
		if(verificationresultattestationsourcesignaturetype.hasUserSelected()) {
			v.setVrfctnRsltAttestationSrcSignatureTypUsrSltd(String.valueOf(verificationresultattestationsourcesignaturetype.getUserSelected()));
		}
		/******************** VrfctnRslt_Attestation_SrcSignature_Typ_Sys ********************************************************************************/
		if(verificationresultattestationsourcesignaturetype.hasSystem()) {
			v.setVrfctnRsltAttestationSrcSignatureTypSys(String.valueOf(verificationresultattestationsourcesignaturetype.getSystem()));
		}
		/******************** VrfctnRslt_Attestation_SrcSignature_OnBehalfOf ********************************************************************************/
		if(verificationresultattestationsourcesignature.hasOnBehalfOf()) {
			v.setVrfctnRsltAttestationSrcSignatureOnBehalfOf(String.valueOf(verificationresultattestationsourcesignature.getOnBehalfOf()));
		}
		/******************** VrfctnRslt_Attestation_SrcSignature_Who ********************************************************************************/
		if(verificationresultattestationsourcesignature.hasWho()) {
			v.setVrfctnRsltAttestationSrcSignatureWho(String.valueOf(verificationresultattestationsourcesignature.getWho()));
		}
		/******************** VrfctnRslt_Attestation_SrcSignature_SigFrmat ********************************************************************************/
		if(verificationresultattestationsourcesignature.hasSigFormat()) {
			v.setVrfctnRsltAttestationSrcSignatureSigFrmat(String.valueOf(verificationresultattestationsourcesignature.getSigFormat()));
		}
		/******************** VrfctnRslt_Attestation_SrcSignature_TarFrmat ********************************************************************************/
		if(verificationresultattestationsourcesignature.hasTargetFormat()) {
			v.setVrfctnRsltAttestationSrcSignatureTarFrmat(String.valueOf(verificationresultattestationsourcesignature.getTargetFormat()));
		}
		/******************** VrfctnRslt_Attestation_SrcSignature_Data ********************************************************************************/
		if(verificationresultattestationsourcesignature.hasData()) {
			v.setVrfctnRsltAttestationSrcSignatureData(String.valueOf(verificationresultattestationsourcesignature.getData()));
		}

		/******************** VrfctnRslt_Attestation_SrcSignature_When ********************************************************************************/
		if(verificationresultattestationsourcesignature.hasWhen()) {
			v.setVrfctnRsltAttestationSrcSignatureWhen(String.valueOf(verificationresultattestationsourcesignature.getWhen()));
		}
		/******************** verificationresultattestationcommunicationmethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept verificationresultattestationcommunicationmethod = verificationresultattestation.getCommunicationMethod();

		/******************** VrfctnRslt_Attestation_CmmnctnMthd_Txt ********************************************************************************/
		if(verificationresultattestationcommunicationmethod.hasText()) {
			v.setVrfctnRsltAttestationCmmnctnMthdTxt(String.valueOf(verificationresultattestationcommunicationmethod.getText()));
		}
		/******************** verificationresultattestationcommunicationmethodcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding verificationresultattestationcommunicationmethodcoding = verificationresultattestationcommunicationmethod.getCodingFirstRep();

		/******************** VrfctnRslt_Attestation_CmmnctnMthd_Cdg_Vrsn ********************************************************************************/
		if(verificationresultattestationcommunicationmethodcoding.hasVersion()) {
			v.setVrfctnRsltAttestationCmmnctnMthdCdgVrsn(String.valueOf(verificationresultattestationcommunicationmethodcoding.getVersion()));
		}
		/******************** VrfctnRslt_Attestation_CmmnctnMthd_Cdg_Dsply ********************************************************************************/
		if(verificationresultattestationcommunicationmethodcoding.hasDisplay()) {
			v.setVrfctnRsltAttestationCmmnctnMthdCdgDsply(String.valueOf(verificationresultattestationcommunicationmethodcoding.getDisplay()));
		}
		/******************** VrfctnRslt_Attestation_CmmnctnMthd_Cdg_Cd ********************************************************************************/
		if(verificationresultattestationcommunicationmethodcoding.hasCode()) {
			v.setVrfctnRsltAttestationCmmnctnMthdCdgCd(String.valueOf(verificationresultattestationcommunicationmethodcoding.getCode()));
		}
		/******************** VrfctnRslt_Attestation_CmmnctnMthd_Cdg_UsrSltd ********************************************************************************/
		if(verificationresultattestationcommunicationmethodcoding.hasUserSelected()) {
			v.setVrfctnRsltAttestationCmmnctnMthdCdgUsrSltd(String.valueOf(verificationresultattestationcommunicationmethodcoding.getUserSelected()));
		}
		/******************** VrfctnRslt_Attestation_CmmnctnMthd_Cdg_Sys ********************************************************************************/
		if(verificationresultattestationcommunicationmethodcoding.hasSystem()) {
			v.setVrfctnRsltAttestationCmmnctnMthdCdgSys(String.valueOf(verificationresultattestationcommunicationmethodcoding.getSystem()));
		}
		/******************** VrfctnRslt_Attestation_ProxyIdentityCertificate ********************************************************************************/
		if(verificationresultattestation.hasProxyIdentityCertificate()) {
			v.setVrfctnRsltAttestationProxyIdentityCertificate(String.valueOf(verificationresultattestation.getProxyIdentityCertificate()));
		}
		/******************** VrfctnRslt_Attestation_SrcIdentityCertificate ********************************************************************************/
		if(verificationresultattestation.hasSourceIdentityCertificate()) {
			v.setVrfctnRsltAttestationSrcIdentityCertificate(String.valueOf(verificationresultattestation.getSourceIdentityCertificate()));
		}
		/******************** VrfctnRslt_Attestation_OnBehalfOf ********************************************************************************/
		if(verificationresultattestation.hasOnBehalfOf()) {
			v.setVrfctnRsltAttestationOnBehalfOf(String.valueOf(verificationresultattestation.getOnBehalfOf()));
		}
		/******************** VrfctnRslt_Attestation_Who ********************************************************************************/
		if(verificationresultattestation.hasWho()) {
			v.setVrfctnRsltAttestationWho(String.valueOf(verificationresultattestation.getWho()));
		}
		/******************** VrfctnRslt_NextSchdld ********************************************************************************/
		if(verificationresult.hasNextScheduled()) {
			v.setVrfctnRsltNextSchdld(String.valueOf(verificationresult.getNextScheduled()));
		}
		/******************** verificationresultstatus ********************************************************************************/
		org.hl7.fhir.r4.model.VerificationResult.Status verificationresultstatus = verificationresult.getStatus();
		v.setVrfctnRsltSts(verificationresultstatus.toCode());

		/******************** VrfctnRslt_StsDt ********************************************************************************/
		if(verificationresult.hasStatusDate()) {
			v.setVrfctnRsltStsDt(String.valueOf(verificationresult.getStatusDate()));
		}
		/******************** VrfctnRslt_Tar ********************************************************************************/
		if(verificationresult.hasTarget()) {
			v.setVrfctnRsltTar(String.valueOf(verificationresult.getTargetFirstRep()));
		}
		return v;
	}
}
