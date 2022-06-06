package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.VerificationResult;
public class VerificationResultConversion 
{
	public org.hl7.fhir.r4.model.VerificationResult VerificationResults(VerificationResult v) throws ParseException
	{
		org.hl7.fhir.r4.model.VerificationResult verificationresult = new org.hl7.fhir.r4.model.VerificationResult();

		/******************** id ********************************************************************************/
		verificationresult.setId(v.getId());

		/******************** verificationresultattestation ********************************************************************************/
		org.hl7.fhir.r4.model.VerificationResult.VerificationResultAttestationComponent verificationresultattestation =  new org.hl7.fhir.r4.model.VerificationResult.VerificationResultAttestationComponent();
		verificationresult.setAttestation(verificationresultattestation);

		/******************** verificationresultattestationcommunicationmethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept verificationresultattestationcommunicationmethod =  new org.hl7.fhir.r4.model.CodeableConcept();
		verificationresultattestation.setCommunicationMethod(verificationresultattestationcommunicationmethod);

		/******************** verificationresultattestationcommunicationmethodcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding verificationresultattestationcommunicationmethodcoding =  new org.hl7.fhir.r4.model.Coding();
		verificationresultattestationcommunicationmethod.addCoding(verificationresultattestationcommunicationmethodcoding);

		/******************** VrfctnRslt_Attestation_CmmnctnMthd_Cdg_Cd ********************************************************************************/
		if(v.getVrfctnRsltAttestationCmmnctnMthdCdgCd() != null) {
			verificationresultattestationcommunicationmethodcoding.setCode(v.getVrfctnRsltAttestationCmmnctnMthdCdgCd());
		}
		/******************** VrfctnRslt_Attestation_CmmnctnMthd_Cdg_Dsply ********************************************************************************/
		if(v.getVrfctnRsltAttestationCmmnctnMthdCdgDsply() != null) {
			verificationresultattestationcommunicationmethodcoding.setDisplay(v.getVrfctnRsltAttestationCmmnctnMthdCdgDsply());
		}
		/******************** VrfctnRslt_Attestation_CmmnctnMthd_Cdg_Sys ********************************************************************************/
		if(v.getVrfctnRsltAttestationCmmnctnMthdCdgSys() != null) {
			verificationresultattestationcommunicationmethodcoding.setSystem(v.getVrfctnRsltAttestationCmmnctnMthdCdgSys());
		}
		/******************** VrfctnRslt_Attestation_CmmnctnMthd_Cdg_UsrSltd ********************************************************************************/
		if(v.getVrfctnRsltAttestationCmmnctnMthdCdgUsrSltd() != null) {
			verificationresultattestationcommunicationmethodcoding.setUserSelected(Boolean.parseBoolean(v.getVrfctnRsltAttestationCmmnctnMthdCdgUsrSltd()));
		}
		/******************** VrfctnRslt_Attestation_CmmnctnMthd_Cdg_Vrsn ********************************************************************************/
		if(v.getVrfctnRsltAttestationCmmnctnMthdCdgVrsn() != null) {
			verificationresultattestationcommunicationmethodcoding.setVersion(v.getVrfctnRsltAttestationCmmnctnMthdCdgVrsn());
		}
		/******************** VrfctnRslt_Attestation_CmmnctnMthd_Txt ********************************************************************************/
		if(v.getVrfctnRsltAttestationCmmnctnMthdTxt() != null) {
			verificationresultattestationcommunicationmethod.setText(v.getVrfctnRsltAttestationCmmnctnMthdTxt());
		}
		/******************** VrfctnRslt_Attestation_Dt ********************************************************************************/
		if(v.getVrfctnRsltAttestationDt() != null) {
			java.text.SimpleDateFormat VrfctnRslt_Attestation_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date VrfctnRslt_Attestation_Dtdate = VrfctnRslt_Attestation_Dtsdf.parse(v.getVrfctnRsltAttestationDt());
			verificationresultattestation.setDate(VrfctnRslt_Attestation_Dtdate);
		}
		/******************** VrfctnRslt_Attestation_OnBehalfOf ********************************************************************************/
		if(v.getVrfctnRsltAttestationOnBehalfOf() != null) {
			verificationresultattestation.setOnBehalfOf( new org.hl7.fhir.r4.model.Reference(v.getVrfctnRsltAttestationOnBehalfOf()));
		}
		/******************** VrfctnRslt_Attestation_ProxyIdentityCertificate ********************************************************************************/
		if(v.getVrfctnRsltAttestationProxyIdentityCertificate() != null) {
			verificationresultattestation.setProxyIdentityCertificate(v.getVrfctnRsltAttestationProxyIdentityCertificate());
		}
		/******************** verificationresultattestationproxysignature ********************************************************************************/
		org.hl7.fhir.r4.model.Signature verificationresultattestationproxysignature =  new org.hl7.fhir.r4.model.Signature();
		verificationresultattestation.setProxySignature(verificationresultattestationproxysignature);

		/******************** VrfctnRslt_Attestation_ProxySignature_Data ********************************************************************************/
		if(v.getVrfctnRsltAttestationProxySignatureData() != null) {
			verificationresultattestationproxysignature.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(v.getVrfctnRsltAttestationProxySignatureData()));
		}
		/******************** VrfctnRslt_Attestation_ProxySignature_OnBehalfOf ********************************************************************************/
		if(v.getVrfctnRsltAttestationProxySignatureOnBehalfOf() != null) {
			verificationresultattestationproxysignature.setOnBehalfOf( new org.hl7.fhir.r4.model.Reference(v.getVrfctnRsltAttestationProxySignatureOnBehalfOf()));
		}
		/******************** VrfctnRslt_Attestation_ProxySignature_SigFrmat ********************************************************************************/
		if(v.getVrfctnRsltAttestationProxySignatureSigFrmat() != null) {
			verificationresultattestationproxysignature.setSigFormat(v.getVrfctnRsltAttestationProxySignatureSigFrmat());
		}
		/******************** VrfctnRslt_Attestation_ProxySignature_TarFrmat ********************************************************************************/
		if(v.getVrfctnRsltAttestationProxySignatureTarFrmat() != null) {
			verificationresultattestationproxysignature.setTargetFormat(v.getVrfctnRsltAttestationProxySignatureTarFrmat());
		}
		/******************** verificationresultattestationproxysignaturetype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding verificationresultattestationproxysignaturetype =  new org.hl7.fhir.r4.model.Coding();
		verificationresultattestationproxysignature.addType(verificationresultattestationproxysignaturetype);

		/******************** VrfctnRslt_Attestation_ProxySignature_Typ_Cd ********************************************************************************/
		if(v.getVrfctnRsltAttestationProxySignatureTypCd() != null) {
			verificationresultattestationproxysignaturetype.setCode(v.getVrfctnRsltAttestationProxySignatureTypCd());
		}
		/******************** VrfctnRslt_Attestation_ProxySignature_Typ_Dsply ********************************************************************************/
		if(v.getVrfctnRsltAttestationProxySignatureTypDsply() != null) {
			verificationresultattestationproxysignaturetype.setDisplay(v.getVrfctnRsltAttestationProxySignatureTypDsply());
		}
		/******************** VrfctnRslt_Attestation_ProxySignature_Typ_Sys ********************************************************************************/
		if(v.getVrfctnRsltAttestationProxySignatureTypSys() != null) {
			verificationresultattestationproxysignaturetype.setSystem(v.getVrfctnRsltAttestationProxySignatureTypSys());
		}
		/******************** VrfctnRslt_Attestation_ProxySignature_Typ_UsrSltd ********************************************************************************/
		if(v.getVrfctnRsltAttestationProxySignatureTypUsrSltd() != null) {
			verificationresultattestationproxysignaturetype.setUserSelected(Boolean.parseBoolean(v.getVrfctnRsltAttestationProxySignatureTypUsrSltd()));
		}
		/******************** VrfctnRslt_Attestation_ProxySignature_Typ_Vrsn ********************************************************************************/
		if(v.getVrfctnRsltAttestationProxySignatureTypVrsn() != null) {
			verificationresultattestationproxysignaturetype.setVersion(v.getVrfctnRsltAttestationProxySignatureTypVrsn());
		}
		/******************** VrfctnRslt_Attestation_ProxySignature_When ********************************************************************************/
		if(v.getVrfctnRsltAttestationProxySignatureWhen() != null) {
			java.text.SimpleDateFormat VrfctnRslt_Attestation_ProxySignature_Whensdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date VrfctnRslt_Attestation_ProxySignature_Whendate = VrfctnRslt_Attestation_ProxySignature_Whensdf.parse(v.getVrfctnRsltAttestationProxySignatureWhen());
			verificationresultattestationproxysignature.setWhen(VrfctnRslt_Attestation_ProxySignature_Whendate);
		}
		/******************** VrfctnRslt_Attestation_ProxySignature_Who ********************************************************************************/
		if(v.getVrfctnRsltAttestationProxySignatureWho() != null) {
			verificationresultattestationproxysignature.setWho( new org.hl7.fhir.r4.model.Reference(v.getVrfctnRsltAttestationProxySignatureWho()));
		}
		/******************** VrfctnRslt_Attestation_SrcIdentityCertificate ********************************************************************************/
		if(v.getVrfctnRsltAttestationSrcIdentityCertificate() != null) {
			verificationresultattestation.setSourceIdentityCertificate(v.getVrfctnRsltAttestationSrcIdentityCertificate());
		}
		/******************** verificationresultattestationsourcesignature ********************************************************************************/
		org.hl7.fhir.r4.model.Signature verificationresultattestationsourcesignature =  new org.hl7.fhir.r4.model.Signature();
		verificationresultattestation.setSourceSignature(verificationresultattestationsourcesignature);

		/******************** VrfctnRslt_Attestation_SrcSignature_Data ********************************************************************************/
		if(v.getVrfctnRsltAttestationSrcSignatureData() != null) {
			verificationresultattestationsourcesignature.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(v.getVrfctnRsltAttestationSrcSignatureData()));
		}
		/******************** VrfctnRslt_Attestation_SrcSignature_OnBehalfOf ********************************************************************************/
		if(v.getVrfctnRsltAttestationSrcSignatureOnBehalfOf() != null) {
			verificationresultattestationsourcesignature.setOnBehalfOf( new org.hl7.fhir.r4.model.Reference(v.getVrfctnRsltAttestationSrcSignatureOnBehalfOf()));
		}
		/******************** VrfctnRslt_Attestation_SrcSignature_SigFrmat ********************************************************************************/
		if(v.getVrfctnRsltAttestationSrcSignatureSigFrmat() != null) {
			verificationresultattestationsourcesignature.setSigFormat(v.getVrfctnRsltAttestationSrcSignatureSigFrmat());
		}
		/******************** VrfctnRslt_Attestation_SrcSignature_TarFrmat ********************************************************************************/
		if(v.getVrfctnRsltAttestationSrcSignatureTarFrmat() != null) {
			verificationresultattestationsourcesignature.setTargetFormat(v.getVrfctnRsltAttestationSrcSignatureTarFrmat());
		}
		/******************** verificationresultattestationsourcesignaturetype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding verificationresultattestationsourcesignaturetype =  new org.hl7.fhir.r4.model.Coding();
		verificationresultattestationsourcesignature.addType(verificationresultattestationsourcesignaturetype);

		/******************** VrfctnRslt_Attestation_SrcSignature_Typ_Cd ********************************************************************************/
		if(v.getVrfctnRsltAttestationSrcSignatureTypCd() != null) {
			verificationresultattestationsourcesignaturetype.setCode(v.getVrfctnRsltAttestationSrcSignatureTypCd());
		}
		/******************** VrfctnRslt_Attestation_SrcSignature_Typ_Dsply ********************************************************************************/
		if(v.getVrfctnRsltAttestationSrcSignatureTypDsply() != null) {
			verificationresultattestationsourcesignaturetype.setDisplay(v.getVrfctnRsltAttestationSrcSignatureTypDsply());
		}
		/******************** VrfctnRslt_Attestation_SrcSignature_Typ_Sys ********************************************************************************/
		if(v.getVrfctnRsltAttestationSrcSignatureTypSys() != null) {
			verificationresultattestationsourcesignaturetype.setSystem(v.getVrfctnRsltAttestationSrcSignatureTypSys());
		}
		/******************** VrfctnRslt_Attestation_SrcSignature_Typ_UsrSltd ********************************************************************************/
		if(v.getVrfctnRsltAttestationSrcSignatureTypUsrSltd() != null) {
			verificationresultattestationsourcesignaturetype.setUserSelected(Boolean.parseBoolean(v.getVrfctnRsltAttestationSrcSignatureTypUsrSltd()));
		}
		/******************** VrfctnRslt_Attestation_SrcSignature_Typ_Vrsn ********************************************************************************/
		if(v.getVrfctnRsltAttestationSrcSignatureTypVrsn() != null) {
			verificationresultattestationsourcesignaturetype.setVersion(v.getVrfctnRsltAttestationSrcSignatureTypVrsn());
		}
		/******************** VrfctnRslt_Attestation_SrcSignature_When ********************************************************************************/
		if(v.getVrfctnRsltAttestationSrcSignatureWhen() != null) {
			java.text.SimpleDateFormat VrfctnRslt_Attestation_SrcSignature_Whensdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date VrfctnRslt_Attestation_SrcSignature_Whendate = VrfctnRslt_Attestation_SrcSignature_Whensdf.parse(v.getVrfctnRsltAttestationSrcSignatureWhen());
			verificationresultattestationsourcesignature.setWhen(VrfctnRslt_Attestation_SrcSignature_Whendate);
		}
		/******************** VrfctnRslt_Attestation_SrcSignature_Who ********************************************************************************/
		if(v.getVrfctnRsltAttestationSrcSignatureWho() != null) {
			verificationresultattestationsourcesignature.setWho( new org.hl7.fhir.r4.model.Reference(v.getVrfctnRsltAttestationSrcSignatureWho()));
		}
		/******************** VrfctnRslt_Attestation_Who ********************************************************************************/
		if(v.getVrfctnRsltAttestationWho() != null) {
			verificationresultattestation.setWho( new org.hl7.fhir.r4.model.Reference(v.getVrfctnRsltAttestationWho()));
		}
		/******************** verificationresultfailureaction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept verificationresultfailureaction =  new org.hl7.fhir.r4.model.CodeableConcept();
		verificationresult.setFailureAction(verificationresultfailureaction);

		/******************** verificationresultfailureactioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding verificationresultfailureactioncoding =  new org.hl7.fhir.r4.model.Coding();
		verificationresultfailureaction.addCoding(verificationresultfailureactioncoding);

		/******************** VrfctnRslt_FailureActn_Cdg_Cd ********************************************************************************/
		if(v.getVrfctnRsltFailureActnCdgCd() != null) {
			verificationresultfailureactioncoding.setCode(v.getVrfctnRsltFailureActnCdgCd());
		}
		/******************** VrfctnRslt_FailureActn_Cdg_Dsply ********************************************************************************/
		if(v.getVrfctnRsltFailureActnCdgDsply() != null) {
			verificationresultfailureactioncoding.setDisplay(v.getVrfctnRsltFailureActnCdgDsply());
		}
		/******************** VrfctnRslt_FailureActn_Cdg_Sys ********************************************************************************/
		if(v.getVrfctnRsltFailureActnCdgSys() != null) {
			verificationresultfailureactioncoding.setSystem(v.getVrfctnRsltFailureActnCdgSys());
		}
		/******************** VrfctnRslt_FailureActn_Cdg_UsrSltd ********************************************************************************/
		if(v.getVrfctnRsltFailureActnCdgUsrSltd() != null) {
			verificationresultfailureactioncoding.setUserSelected(Boolean.parseBoolean(v.getVrfctnRsltFailureActnCdgUsrSltd()));
		}
		/******************** VrfctnRslt_FailureActn_Cdg_Vrsn ********************************************************************************/
		if(v.getVrfctnRsltFailureActnCdgVrsn() != null) {
			verificationresultfailureactioncoding.setVersion(v.getVrfctnRsltFailureActnCdgVrsn());
		}
		/******************** VrfctnRslt_FailureActn_Txt ********************************************************************************/
		if(v.getVrfctnRsltFailureActnTxt() != null) {
			verificationresultfailureaction.setText(v.getVrfctnRsltFailureActnTxt());
		}
		/******************** verificationresultfrequency ********************************************************************************/
		org.hl7.fhir.r4.model.Timing verificationresultfrequency =  new org.hl7.fhir.r4.model.Timing();
		verificationresult.setFrequency(verificationresultfrequency);

		/******************** verificationresultfrequencycode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept verificationresultfrequencycode =  new org.hl7.fhir.r4.model.CodeableConcept();
		verificationresultfrequency.setCode(verificationresultfrequencycode);

		/******************** verificationresultfrequencycodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding verificationresultfrequencycodecoding =  new org.hl7.fhir.r4.model.Coding();
		verificationresultfrequencycode.addCoding(verificationresultfrequencycodecoding);

		/******************** VrfctnRslt_Frqncy_Cd_Cdg_Cd ********************************************************************************/
		if(v.getVrfctnRsltFrqncyCdCdgCd() != null) {
			verificationresultfrequencycodecoding.setCode(v.getVrfctnRsltFrqncyCdCdgCd());
		}
		/******************** VrfctnRslt_Frqncy_Cd_Cdg_Dsply ********************************************************************************/
		if(v.getVrfctnRsltFrqncyCdCdgDsply() != null) {
			verificationresultfrequencycodecoding.setDisplay(v.getVrfctnRsltFrqncyCdCdgDsply());
		}
		/******************** VrfctnRslt_Frqncy_Cd_Cdg_Sys ********************************************************************************/
		if(v.getVrfctnRsltFrqncyCdCdgSys() != null) {
			verificationresultfrequencycodecoding.setSystem(v.getVrfctnRsltFrqncyCdCdgSys());
		}
		/******************** VrfctnRslt_Frqncy_Cd_Cdg_UsrSltd ********************************************************************************/
		if(v.getVrfctnRsltFrqncyCdCdgUsrSltd() != null) {
			verificationresultfrequencycodecoding.setUserSelected(Boolean.parseBoolean(v.getVrfctnRsltFrqncyCdCdgUsrSltd()));
		}
		/******************** VrfctnRslt_Frqncy_Cd_Cdg_Vrsn ********************************************************************************/
		if(v.getVrfctnRsltFrqncyCdCdgVrsn() != null) {
			verificationresultfrequencycodecoding.setVersion(v.getVrfctnRsltFrqncyCdCdgVrsn());
		}
		/******************** VrfctnRslt_Frqncy_Cd_Txt ********************************************************************************/
		if(v.getVrfctnRsltFrqncyCdTxt() != null) {
			verificationresultfrequencycode.setText(v.getVrfctnRsltFrqncyCdTxt());
		}
		/******************** VrfctnRslt_Frqncy_Evnt ********************************************************************************/
		if(v.getVrfctnRsltFrqncyEvnt() != null) {
			java.text.SimpleDateFormat VrfctnRslt_Frqncy_Evntsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date VrfctnRslt_Frqncy_Evntdate = VrfctnRslt_Frqncy_Evntsdf.parse(v.getVrfctnRsltFrqncyEvnt());
			verificationresultfrequency.addEvent(VrfctnRslt_Frqncy_Evntdate);
		}
		/******************** verificationresultfrequencyrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent verificationresultfrequencyrepeat =  new org.hl7.fhir.r4.model.Timing.TimingRepeatComponent();
		verificationresultfrequency.setRepeat(verificationresultfrequencyrepeat);

		/******************** verificationresultfrequencyrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration verificationresultfrequencyrepeatboundsduration =  new org.hl7.fhir.r4.model.Duration();
		verificationresultfrequencyrepeat.setBounds(verificationresultfrequencyrepeatboundsduration);

		/******************** verificationresultfrequencyrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period verificationresultfrequencyrepeatboundsperiod =  new org.hl7.fhir.r4.model.Period();
		verificationresultfrequencyrepeat.setBounds(verificationresultfrequencyrepeatboundsperiod);

		/******************** VrfctnRslt_Frqncy_Rpt_BndsPrd_End ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptBndsPrdEnd() != null) {
			java.text.SimpleDateFormat VrfctnRslt_Frqncy_Rpt_BndsPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date VrfctnRslt_Frqncy_Rpt_BndsPrd_Enddate = VrfctnRslt_Frqncy_Rpt_BndsPrd_Endsdf.parse(v.getVrfctnRsltFrqncyRptBndsPrdEnd());
			verificationresultfrequencyrepeatboundsperiod.setEnd(VrfctnRslt_Frqncy_Rpt_BndsPrd_Enddate);
		}
		/******************** VrfctnRslt_Frqncy_Rpt_BndsPrd_Strt ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptBndsPrdStrt() != null) {
			java.text.SimpleDateFormat VrfctnRslt_Frqncy_Rpt_BndsPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date VrfctnRslt_Frqncy_Rpt_BndsPrd_Strtdate = VrfctnRslt_Frqncy_Rpt_BndsPrd_Strtsdf.parse(v.getVrfctnRsltFrqncyRptBndsPrdStrt());
			verificationresultfrequencyrepeatboundsperiod.setStart(VrfctnRslt_Frqncy_Rpt_BndsPrd_Strtdate);
		}
		/******************** verificationresultfrequencyrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range verificationresultfrequencyrepeatboundsrange =  new org.hl7.fhir.r4.model.Range();
		verificationresultfrequencyrepeat.setBounds(verificationresultfrequencyrepeatboundsrange);

		/******************** verificationresultfrequencyrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity verificationresultfrequencyrepeatboundsrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		verificationresultfrequencyrepeatboundsrange.setHigh(verificationresultfrequencyrepeatboundsrangehigh);

		/******************** VrfctnRslt_Frqncy_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptBndsRngHiCd() != null) {
			verificationresultfrequencyrepeatboundsrangehigh.setCode(v.getVrfctnRsltFrqncyRptBndsRngHiCd());
		}
		/******************** verificationresultfrequencyrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory verificationresultfrequencyrepeatboundsrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		verificationresultfrequencyrepeatboundsrangehigh.setComparator(verificationresultfrequencyrepeatboundsrangehighcomparator.fromCode(v.getVrfctnRsltFrqncyRptBndsRngHiCmprtr()));

		/******************** VrfctnRslt_Frqncy_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptBndsRngHiSys() != null) {
			verificationresultfrequencyrepeatboundsrangehigh.setSystem(v.getVrfctnRsltFrqncyRptBndsRngHiSys());
		}
		/******************** VrfctnRslt_Frqncy_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptBndsRngHiUnt() != null) {
			verificationresultfrequencyrepeatboundsrangehigh.setUnit(v.getVrfctnRsltFrqncyRptBndsRngHiUnt());
		}
		/******************** VrfctnRslt_Frqncy_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptBndsRngHiVl() != null) {
			verificationresultfrequencyrepeatboundsrangehigh.setValue(Double.parseDouble((v.getVrfctnRsltFrqncyRptBndsRngHiVl())));
		}
		/******************** verificationresultfrequencyrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity verificationresultfrequencyrepeatboundsrangelow =  new org.hl7.fhir.r4.model.Quantity();
		verificationresultfrequencyrepeatboundsrange.setLow(verificationresultfrequencyrepeatboundsrangelow);

		/******************** VrfctnRslt_Frqncy_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptBndsRngLwCd() != null) {
			verificationresultfrequencyrepeatboundsrangelow.setCode(v.getVrfctnRsltFrqncyRptBndsRngLwCd());
		}
		/******************** verificationresultfrequencyrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory verificationresultfrequencyrepeatboundsrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		verificationresultfrequencyrepeatboundsrangelow.setComparator(verificationresultfrequencyrepeatboundsrangelowcomparator.fromCode(v.getVrfctnRsltFrqncyRptBndsRngLwCmprtr()));

		/******************** VrfctnRslt_Frqncy_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptBndsRngLwSys() != null) {
			verificationresultfrequencyrepeatboundsrangelow.setSystem(v.getVrfctnRsltFrqncyRptBndsRngLwSys());
		}
		/******************** VrfctnRslt_Frqncy_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptBndsRngLwUnt() != null) {
			verificationresultfrequencyrepeatboundsrangelow.setUnit(v.getVrfctnRsltFrqncyRptBndsRngLwUnt());
		}
		/******************** VrfctnRslt_Frqncy_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptBndsRngLwVl() != null) {
			verificationresultfrequencyrepeatboundsrangelow.setValue(Double.parseDouble((v.getVrfctnRsltFrqncyRptBndsRngLwVl())));
		}
		/******************** VrfctnRslt_Frqncy_Rpt_Cnt ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptCnt() != null) {
			verificationresultfrequencyrepeat.setCount(Integer.parseInt(v.getVrfctnRsltFrqncyRptCnt()));
		}
		/******************** VrfctnRslt_Frqncy_Rpt_CntMx ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptCntMx() != null) {
			verificationresultfrequencyrepeat.setCountMax(Integer.parseInt(v.getVrfctnRsltFrqncyRptCntMx()));
		}
		/******************** verificationresultfrequencyrepeatdayofweek ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory verificationresultfrequencyrepeatdayofweek =  new org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory();
		verificationresultfrequencyrepeat.addDayOfWeek(verificationresultfrequencyrepeatdayofweek.fromCode(v.getVrfctnRsltFrqncyRptDayOfWeek()));

		/******************** VrfctnRslt_Frqncy_Rpt_Duration ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptDuration() != null) {
			verificationresultfrequencyrepeat.setDuration(Double.parseDouble((v.getVrfctnRsltFrqncyRptDuration())));
		}
		/******************** VrfctnRslt_Frqncy_Rpt_DurationMx ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptDurationMx() != null) {
			verificationresultfrequencyrepeat.setDurationMax(Double.parseDouble((v.getVrfctnRsltFrqncyRptDurationMx())));
		}
		/******************** verificationresultfrequencyrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory verificationresultfrequencyrepeatdurationunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		verificationresultfrequencyrepeat.setDurationUnit(verificationresultfrequencyrepeatdurationunit.fromCode(v.getVrfctnRsltFrqncyRptDurationUnt()));

		/******************** VrfctnRslt_Frqncy_Rpt_Frqncy ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptFrqncy() != null) {
			verificationresultfrequencyrepeat.setFrequency(Integer.parseInt(v.getVrfctnRsltFrqncyRptFrqncy()));
		}
		/******************** VrfctnRslt_Frqncy_Rpt_FrqncyMx ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptFrqncyMx() != null) {
			verificationresultfrequencyrepeat.setFrequencyMax(Integer.parseInt(v.getVrfctnRsltFrqncyRptFrqncyMx()));
		}
		/******************** VrfctnRslt_Frqncy_Rpt_Off ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptOff() != null) {
			verificationresultfrequencyrepeat.setOffset(Integer.parseInt(v.getVrfctnRsltFrqncyRptOff()));
		}
		/******************** VrfctnRslt_Frqncy_Rpt_Prd ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptPrd() != null) {
			verificationresultfrequencyrepeat.setPeriod(Double.parseDouble((v.getVrfctnRsltFrqncyRptPrd())));
		}
		/******************** VrfctnRslt_Frqncy_Rpt_PrdMx ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptPrdMx() != null) {
			verificationresultfrequencyrepeat.setPeriodMax(Double.parseDouble((v.getVrfctnRsltFrqncyRptPrdMx())));
		}
		/******************** verificationresultfrequencyrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory verificationresultfrequencyrepeatperiodunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		verificationresultfrequencyrepeat.setPeriodUnit(verificationresultfrequencyrepeatperiodunit.fromCode(v.getVrfctnRsltFrqncyRptPrdUnt()));

		/******************** VrfctnRslt_Frqncy_Rpt_TimeOfDay ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptTimeOfDay() != null) {
			verificationresultfrequencyrepeat.addTimeOfDay(v.getVrfctnRsltFrqncyRptTimeOfDay());
		}
		/******************** verificationresultfrequencyrepeatwhen ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory verificationresultfrequencyrepeatwhen =  new org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory();
		verificationresultfrequencyrepeat.addWhen(verificationresultfrequencyrepeatwhen.fromCode(v.getVrfctnRsltFrqncyRptWhen()));

		/******************** VrfctnRslt_LastPerformed ********************************************************************************/
		if(v.getVrfctnRsltLastPerformed() != null) {
			java.text.SimpleDateFormat VrfctnRslt_LastPerformedsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date VrfctnRslt_LastPerformeddate = VrfctnRslt_LastPerformedsdf.parse(v.getVrfctnRsltLastPerformed());
			verificationresult.setLastPerformed(VrfctnRslt_LastPerformeddate);
		}
		/******************** verificationresultneed ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept verificationresultneed =  new org.hl7.fhir.r4.model.CodeableConcept();
		verificationresult.setNeed(verificationresultneed);

		/******************** verificationresultneedcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding verificationresultneedcoding =  new org.hl7.fhir.r4.model.Coding();
		verificationresultneed.addCoding(verificationresultneedcoding);

		/******************** VrfctnRslt_Need_Cdg_Cd ********************************************************************************/
		if(v.getVrfctnRsltNeedCdgCd() != null) {
			verificationresultneedcoding.setCode(v.getVrfctnRsltNeedCdgCd());
		}
		/******************** VrfctnRslt_Need_Cdg_Dsply ********************************************************************************/
		if(v.getVrfctnRsltNeedCdgDsply() != null) {
			verificationresultneedcoding.setDisplay(v.getVrfctnRsltNeedCdgDsply());
		}
		/******************** VrfctnRslt_Need_Cdg_Sys ********************************************************************************/
		if(v.getVrfctnRsltNeedCdgSys() != null) {
			verificationresultneedcoding.setSystem(v.getVrfctnRsltNeedCdgSys());
		}
		/******************** VrfctnRslt_Need_Cdg_UsrSltd ********************************************************************************/
		if(v.getVrfctnRsltNeedCdgUsrSltd() != null) {
			verificationresultneedcoding.setUserSelected(Boolean.parseBoolean(v.getVrfctnRsltNeedCdgUsrSltd()));
		}
		/******************** VrfctnRslt_Need_Cdg_Vrsn ********************************************************************************/
		if(v.getVrfctnRsltNeedCdgVrsn() != null) {
			verificationresultneedcoding.setVersion(v.getVrfctnRsltNeedCdgVrsn());
		}
		/******************** VrfctnRslt_Need_Txt ********************************************************************************/
		if(v.getVrfctnRsltNeedTxt() != null) {
			verificationresultneed.setText(v.getVrfctnRsltNeedTxt());
		}
		/******************** VrfctnRslt_NextSchdld ********************************************************************************/
		if(v.getVrfctnRsltNextSchdld() != null) {
			java.text.SimpleDateFormat VrfctnRslt_NextSchdldsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date VrfctnRslt_NextSchdlddate = VrfctnRslt_NextSchdldsdf.parse(v.getVrfctnRsltNextSchdld());
			verificationresult.setNextScheduled(VrfctnRslt_NextSchdlddate);
		}
		/******************** verificationresultprimarysource ********************************************************************************/
		org.hl7.fhir.r4.model.VerificationResult.VerificationResultPrimarySourceComponent verificationresultprimarysource =  new org.hl7.fhir.r4.model.VerificationResult.VerificationResultPrimarySourceComponent();
		verificationresult.addPrimarySource(verificationresultprimarysource);

		/******************** verificationresultprimarysourcecanpushupdates ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept verificationresultprimarysourcecanpushupdates =  new org.hl7.fhir.r4.model.CodeableConcept();
		verificationresultprimarysource.setCanPushUpdates(verificationresultprimarysourcecanpushupdates);

		/******************** verificationresultprimarysourcecanpushupdatescoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding verificationresultprimarysourcecanpushupdatescoding =  new org.hl7.fhir.r4.model.Coding();
		verificationresultprimarysourcecanpushupdates.addCoding(verificationresultprimarysourcecanpushupdatescoding);

		/******************** VrfctnRslt_PrimarySrc_CanPushUpdates_Cdg_Cd ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcCanPushUpdatesCdgCd() != null) {
			verificationresultprimarysourcecanpushupdatescoding.setCode(v.getVrfctnRsltPrimarySrcCanPushUpdatesCdgCd());
		}
		/******************** VrfctnRslt_PrimarySrc_CanPushUpdates_Cdg_Dsply ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcCanPushUpdatesCdgDsply() != null) {
			verificationresultprimarysourcecanpushupdatescoding.setDisplay(v.getVrfctnRsltPrimarySrcCanPushUpdatesCdgDsply());
		}
		/******************** VrfctnRslt_PrimarySrc_CanPushUpdates_Cdg_Sys ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcCanPushUpdatesCdgSys() != null) {
			verificationresultprimarysourcecanpushupdatescoding.setSystem(v.getVrfctnRsltPrimarySrcCanPushUpdatesCdgSys());
		}
		/******************** VrfctnRslt_PrimarySrc_CanPushUpdates_Cdg_UsrSltd ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcCanPushUpdatesCdgUsrSltd() != null) {
			verificationresultprimarysourcecanpushupdatescoding.setUserSelected(Boolean.parseBoolean(v.getVrfctnRsltPrimarySrcCanPushUpdatesCdgUsrSltd()));
		}
		/******************** VrfctnRslt_PrimarySrc_CanPushUpdates_Cdg_Vrsn ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcCanPushUpdatesCdgVrsn() != null) {
			verificationresultprimarysourcecanpushupdatescoding.setVersion(v.getVrfctnRsltPrimarySrcCanPushUpdatesCdgVrsn());
		}
		/******************** VrfctnRslt_PrimarySrc_CanPushUpdates_Txt ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcCanPushUpdatesTxt() != null) {
			verificationresultprimarysourcecanpushupdates.setText(v.getVrfctnRsltPrimarySrcCanPushUpdatesTxt());
		}
		/******************** verificationresultprimarysourcecommunicationmethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept verificationresultprimarysourcecommunicationmethod =  new org.hl7.fhir.r4.model.CodeableConcept();
		verificationresultprimarysource.addCommunicationMethod(verificationresultprimarysourcecommunicationmethod);

		/******************** verificationresultprimarysourcecommunicationmethodcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding verificationresultprimarysourcecommunicationmethodcoding =  new org.hl7.fhir.r4.model.Coding();
		verificationresultprimarysourcecommunicationmethod.addCoding(verificationresultprimarysourcecommunicationmethodcoding);

		/******************** VrfctnRslt_PrimarySrc_CmmnctnMthd_Cdg_Cd ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcCmmnctnMthdCdgCd() != null) {
			verificationresultprimarysourcecommunicationmethodcoding.setCode(v.getVrfctnRsltPrimarySrcCmmnctnMthdCdgCd());
		}
		/******************** VrfctnRslt_PrimarySrc_CmmnctnMthd_Cdg_Dsply ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcCmmnctnMthdCdgDsply() != null) {
			verificationresultprimarysourcecommunicationmethodcoding.setDisplay(v.getVrfctnRsltPrimarySrcCmmnctnMthdCdgDsply());
		}
		/******************** VrfctnRslt_PrimarySrc_CmmnctnMthd_Cdg_Sys ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcCmmnctnMthdCdgSys() != null) {
			verificationresultprimarysourcecommunicationmethodcoding.setSystem(v.getVrfctnRsltPrimarySrcCmmnctnMthdCdgSys());
		}
		/******************** VrfctnRslt_PrimarySrc_CmmnctnMthd_Cdg_UsrSltd ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcCmmnctnMthdCdgUsrSltd() != null) {
			verificationresultprimarysourcecommunicationmethodcoding.setUserSelected(Boolean.parseBoolean(v.getVrfctnRsltPrimarySrcCmmnctnMthdCdgUsrSltd()));
		}
		/******************** VrfctnRslt_PrimarySrc_CmmnctnMthd_Cdg_Vrsn ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcCmmnctnMthdCdgVrsn() != null) {
			verificationresultprimarysourcecommunicationmethodcoding.setVersion(v.getVrfctnRsltPrimarySrcCmmnctnMthdCdgVrsn());
		}
		/******************** VrfctnRslt_PrimarySrc_CmmnctnMthd_Txt ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcCmmnctnMthdTxt() != null) {
			verificationresultprimarysourcecommunicationmethod.setText(v.getVrfctnRsltPrimarySrcCmmnctnMthdTxt());
		}
		/******************** verificationresultprimarysourcepushtypeavailable ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept verificationresultprimarysourcepushtypeavailable =  new org.hl7.fhir.r4.model.CodeableConcept();
		verificationresultprimarysource.addPushTypeAvailable(verificationresultprimarysourcepushtypeavailable);

		/******************** verificationresultprimarysourcepushtypeavailablecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding verificationresultprimarysourcepushtypeavailablecoding =  new org.hl7.fhir.r4.model.Coding();
		verificationresultprimarysourcepushtypeavailable.addCoding(verificationresultprimarysourcepushtypeavailablecoding);

		/******************** VrfctnRslt_PrimarySrc_PushTypAvailable_Cdg_Cd ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcPushTypAvailableCdgCd() != null) {
			verificationresultprimarysourcepushtypeavailablecoding.setCode(v.getVrfctnRsltPrimarySrcPushTypAvailableCdgCd());
		}
		/******************** VrfctnRslt_PrimarySrc_PushTypAvailable_Cdg_Dsply ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcPushTypAvailableCdgDsply() != null) {
			verificationresultprimarysourcepushtypeavailablecoding.setDisplay(v.getVrfctnRsltPrimarySrcPushTypAvailableCdgDsply());
		}
		/******************** VrfctnRslt_PrimarySrc_PushTypAvailable_Cdg_Sys ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcPushTypAvailableCdgSys() != null) {
			verificationresultprimarysourcepushtypeavailablecoding.setSystem(v.getVrfctnRsltPrimarySrcPushTypAvailableCdgSys());
		}
		/******************** VrfctnRslt_PrimarySrc_PushTypAvailable_Cdg_UsrSltd ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcPushTypAvailableCdgUsrSltd() != null) {
			verificationresultprimarysourcepushtypeavailablecoding.setUserSelected(Boolean.parseBoolean(v.getVrfctnRsltPrimarySrcPushTypAvailableCdgUsrSltd()));
		}
		/******************** VrfctnRslt_PrimarySrc_PushTypAvailable_Cdg_Vrsn ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcPushTypAvailableCdgVrsn() != null) {
			verificationresultprimarysourcepushtypeavailablecoding.setVersion(v.getVrfctnRsltPrimarySrcPushTypAvailableCdgVrsn());
		}
		/******************** VrfctnRslt_PrimarySrc_PushTypAvailable_Txt ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcPushTypAvailableTxt() != null) {
			verificationresultprimarysourcepushtypeavailable.setText(v.getVrfctnRsltPrimarySrcPushTypAvailableTxt());
		}
		/******************** verificationresultprimarysourcetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept verificationresultprimarysourcetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		verificationresultprimarysource.addType(verificationresultprimarysourcetype);

		/******************** verificationresultprimarysourcetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding verificationresultprimarysourcetypecoding =  new org.hl7.fhir.r4.model.Coding();
		verificationresultprimarysourcetype.addCoding(verificationresultprimarysourcetypecoding);

		/******************** VrfctnRslt_PrimarySrc_Typ_Cdg_Cd ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcTypCdgCd() != null) {
			verificationresultprimarysourcetypecoding.setCode(v.getVrfctnRsltPrimarySrcTypCdgCd());
		}
		/******************** VrfctnRslt_PrimarySrc_Typ_Cdg_Dsply ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcTypCdgDsply() != null) {
			verificationresultprimarysourcetypecoding.setDisplay(v.getVrfctnRsltPrimarySrcTypCdgDsply());
		}
		/******************** VrfctnRslt_PrimarySrc_Typ_Cdg_Sys ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcTypCdgSys() != null) {
			verificationresultprimarysourcetypecoding.setSystem(v.getVrfctnRsltPrimarySrcTypCdgSys());
		}
		/******************** VrfctnRslt_PrimarySrc_Typ_Cdg_UsrSltd ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcTypCdgUsrSltd() != null) {
			verificationresultprimarysourcetypecoding.setUserSelected(Boolean.parseBoolean(v.getVrfctnRsltPrimarySrcTypCdgUsrSltd()));
		}
		/******************** VrfctnRslt_PrimarySrc_Typ_Cdg_Vrsn ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcTypCdgVrsn() != null) {
			verificationresultprimarysourcetypecoding.setVersion(v.getVrfctnRsltPrimarySrcTypCdgVrsn());
		}
		/******************** VrfctnRslt_PrimarySrc_Typ_Txt ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcTypTxt() != null) {
			verificationresultprimarysourcetype.setText(v.getVrfctnRsltPrimarySrcTypTxt());
		}
		/******************** VrfctnRslt_PrimarySrc_ValidationDt ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcValidationDt() != null) {
			java.text.SimpleDateFormat VrfctnRslt_PrimarySrc_ValidationDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date VrfctnRslt_PrimarySrc_ValidationDtdate = VrfctnRslt_PrimarySrc_ValidationDtsdf.parse(v.getVrfctnRsltPrimarySrcValidationDt());
			verificationresultprimarysource.setValidationDate(VrfctnRslt_PrimarySrc_ValidationDtdate);
		}
		/******************** verificationresultprimarysourcevalidationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept verificationresultprimarysourcevalidationstatus =  new org.hl7.fhir.r4.model.CodeableConcept();
		verificationresultprimarysource.setValidationStatus(verificationresultprimarysourcevalidationstatus);

		/******************** verificationresultprimarysourcevalidationstatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding verificationresultprimarysourcevalidationstatuscoding =  new org.hl7.fhir.r4.model.Coding();
		verificationresultprimarysourcevalidationstatus.addCoding(verificationresultprimarysourcevalidationstatuscoding);

		/******************** VrfctnRslt_PrimarySrc_ValidationSts_Cdg_Cd ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcValidationStsCdgCd() != null) {
			verificationresultprimarysourcevalidationstatuscoding.setCode(v.getVrfctnRsltPrimarySrcValidationStsCdgCd());
		}
		/******************** VrfctnRslt_PrimarySrc_ValidationSts_Cdg_Dsply ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcValidationStsCdgDsply() != null) {
			verificationresultprimarysourcevalidationstatuscoding.setDisplay(v.getVrfctnRsltPrimarySrcValidationStsCdgDsply());
		}
		/******************** VrfctnRslt_PrimarySrc_ValidationSts_Cdg_Sys ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcValidationStsCdgSys() != null) {
			verificationresultprimarysourcevalidationstatuscoding.setSystem(v.getVrfctnRsltPrimarySrcValidationStsCdgSys());
		}
		/******************** VrfctnRslt_PrimarySrc_ValidationSts_Cdg_UsrSltd ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcValidationStsCdgUsrSltd() != null) {
			verificationresultprimarysourcevalidationstatuscoding.setUserSelected(Boolean.parseBoolean(v.getVrfctnRsltPrimarySrcValidationStsCdgUsrSltd()));
		}
		/******************** VrfctnRslt_PrimarySrc_ValidationSts_Cdg_Vrsn ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcValidationStsCdgVrsn() != null) {
			verificationresultprimarysourcevalidationstatuscoding.setVersion(v.getVrfctnRsltPrimarySrcValidationStsCdgVrsn());
		}
		/******************** VrfctnRslt_PrimarySrc_ValidationSts_Txt ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcValidationStsTxt() != null) {
			verificationresultprimarysourcevalidationstatus.setText(v.getVrfctnRsltPrimarySrcValidationStsTxt());
		}
		/******************** VrfctnRslt_PrimarySrc_Who ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcWho() != null) {
			verificationresultprimarysource.setWho( new org.hl7.fhir.r4.model.Reference(v.getVrfctnRsltPrimarySrcWho()));
		}
		/******************** verificationresultstatus ********************************************************************************/
		org.hl7.fhir.r4.model.VerificationResult.StatusEnumFactory verificationresultstatus =  new org.hl7.fhir.r4.model.VerificationResult.StatusEnumFactory();
		verificationresult.setStatus(verificationresultstatus.fromCode(v.getVrfctnRsltSts()));

		/******************** VrfctnRslt_StsDt ********************************************************************************/
		if(v.getVrfctnRsltStsDt() != null) {
			java.text.SimpleDateFormat VrfctnRslt_StsDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date VrfctnRslt_StsDtdate = VrfctnRslt_StsDtsdf.parse(v.getVrfctnRsltStsDt());
			verificationresult.setStatusDate(VrfctnRslt_StsDtdate);
		}
		/******************** VrfctnRslt_Tar ********************************************************************************/
		if(v.getVrfctnRsltTar() != null) {
			verificationresult.addTarget( new org.hl7.fhir.r4.model.Reference(v.getVrfctnRsltTar()));
		}
		/******************** VrfctnRslt_TarLctn ********************************************************************************/
		if(v.getVrfctnRsltTarLctn() != null) {
			verificationresult.addTargetLocation(v.getVrfctnRsltTarLctn());
		}
		/******************** verificationresultvalidationprocess ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept verificationresultvalidationprocess =  new org.hl7.fhir.r4.model.CodeableConcept();
		verificationresult.addValidationProcess(verificationresultvalidationprocess);

		/******************** verificationresultvalidationprocesscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding verificationresultvalidationprocesscoding =  new org.hl7.fhir.r4.model.Coding();
		verificationresultvalidationprocess.addCoding(verificationresultvalidationprocesscoding);

		/******************** VrfctnRslt_ValidationProcess_Cdg_Cd ********************************************************************************/
		if(v.getVrfctnRsltValidationProcessCdgCd() != null) {
			verificationresultvalidationprocesscoding.setCode(v.getVrfctnRsltValidationProcessCdgCd());
		}
		/******************** VrfctnRslt_ValidationProcess_Cdg_Dsply ********************************************************************************/
		if(v.getVrfctnRsltValidationProcessCdgDsply() != null) {
			verificationresultvalidationprocesscoding.setDisplay(v.getVrfctnRsltValidationProcessCdgDsply());
		}
		/******************** VrfctnRslt_ValidationProcess_Cdg_Sys ********************************************************************************/
		if(v.getVrfctnRsltValidationProcessCdgSys() != null) {
			verificationresultvalidationprocesscoding.setSystem(v.getVrfctnRsltValidationProcessCdgSys());
		}
		/******************** VrfctnRslt_ValidationProcess_Cdg_UsrSltd ********************************************************************************/
		if(v.getVrfctnRsltValidationProcessCdgUsrSltd() != null) {
			verificationresultvalidationprocesscoding.setUserSelected(Boolean.parseBoolean(v.getVrfctnRsltValidationProcessCdgUsrSltd()));
		}
		/******************** VrfctnRslt_ValidationProcess_Cdg_Vrsn ********************************************************************************/
		if(v.getVrfctnRsltValidationProcessCdgVrsn() != null) {
			verificationresultvalidationprocesscoding.setVersion(v.getVrfctnRsltValidationProcessCdgVrsn());
		}
		/******************** VrfctnRslt_ValidationProcess_Txt ********************************************************************************/
		if(v.getVrfctnRsltValidationProcessTxt() != null) {
			verificationresultvalidationprocess.setText(v.getVrfctnRsltValidationProcessTxt());
		}
		/******************** verificationresultvalidationtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept verificationresultvalidationtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		verificationresult.setValidationType(verificationresultvalidationtype);

		/******************** verificationresultvalidationtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding verificationresultvalidationtypecoding =  new org.hl7.fhir.r4.model.Coding();
		verificationresultvalidationtype.addCoding(verificationresultvalidationtypecoding);

		/******************** VrfctnRslt_ValidationTyp_Cdg_Cd ********************************************************************************/
		if(v.getVrfctnRsltValidationTypCdgCd() != null) {
			verificationresultvalidationtypecoding.setCode(v.getVrfctnRsltValidationTypCdgCd());
		}
		/******************** VrfctnRslt_ValidationTyp_Cdg_Dsply ********************************************************************************/
		if(v.getVrfctnRsltValidationTypCdgDsply() != null) {
			verificationresultvalidationtypecoding.setDisplay(v.getVrfctnRsltValidationTypCdgDsply());
		}
		/******************** VrfctnRslt_ValidationTyp_Cdg_Sys ********************************************************************************/
		if(v.getVrfctnRsltValidationTypCdgSys() != null) {
			verificationresultvalidationtypecoding.setSystem(v.getVrfctnRsltValidationTypCdgSys());
		}
		/******************** VrfctnRslt_ValidationTyp_Cdg_UsrSltd ********************************************************************************/
		if(v.getVrfctnRsltValidationTypCdgUsrSltd() != null) {
			verificationresultvalidationtypecoding.setUserSelected(Boolean.parseBoolean(v.getVrfctnRsltValidationTypCdgUsrSltd()));
		}
		/******************** VrfctnRslt_ValidationTyp_Cdg_Vrsn ********************************************************************************/
		if(v.getVrfctnRsltValidationTypCdgVrsn() != null) {
			verificationresultvalidationtypecoding.setVersion(v.getVrfctnRsltValidationTypCdgVrsn());
		}
		/******************** VrfctnRslt_ValidationTyp_Txt ********************************************************************************/
		if(v.getVrfctnRsltValidationTypTxt() != null) {
			verificationresultvalidationtype.setText(v.getVrfctnRsltValidationTypTxt());
		}
		/******************** verificationresultvalidator ********************************************************************************/
		org.hl7.fhir.r4.model.VerificationResult.VerificationResultValidatorComponent verificationresultvalidator =  new org.hl7.fhir.r4.model.VerificationResult.VerificationResultValidatorComponent();
		verificationresult.addValidator(verificationresultvalidator);

		/******************** verificationresultvalidatorattestationsignature ********************************************************************************/
		org.hl7.fhir.r4.model.Signature verificationresultvalidatorattestationsignature =  new org.hl7.fhir.r4.model.Signature();
		verificationresultvalidator.setAttestationSignature(verificationresultvalidatorattestationsignature);

		/******************** VrfctnRslt_Validator_AttestationSignature_Data ********************************************************************************/
		if(v.getVrfctnRsltValidatorAttestationSignatureData() != null) {
			verificationresultvalidatorattestationsignature.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(v.getVrfctnRsltValidatorAttestationSignatureData()));
		}
		/******************** VrfctnRslt_Validator_AttestationSignature_OnBehalfOf ********************************************************************************/
		if(v.getVrfctnRsltValidatorAttestationSignatureOnBehalfOf() != null) {
			verificationresultvalidatorattestationsignature.setOnBehalfOf( new org.hl7.fhir.r4.model.Reference(v.getVrfctnRsltValidatorAttestationSignatureOnBehalfOf()));
		}
		/******************** VrfctnRslt_Validator_AttestationSignature_SigFrmat ********************************************************************************/
		if(v.getVrfctnRsltValidatorAttestationSignatureSigFrmat() != null) {
			verificationresultvalidatorattestationsignature.setSigFormat(v.getVrfctnRsltValidatorAttestationSignatureSigFrmat());
		}
		/******************** VrfctnRslt_Validator_AttestationSignature_TarFrmat ********************************************************************************/
		if(v.getVrfctnRsltValidatorAttestationSignatureTarFrmat() != null) {
			verificationresultvalidatorattestationsignature.setTargetFormat(v.getVrfctnRsltValidatorAttestationSignatureTarFrmat());
		}
		/******************** verificationresultvalidatorattestationsignaturetype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding verificationresultvalidatorattestationsignaturetype =  new org.hl7.fhir.r4.model.Coding();
		verificationresultvalidatorattestationsignature.addType(verificationresultvalidatorattestationsignaturetype);

		/******************** VrfctnRslt_Validator_AttestationSignature_Typ_Cd ********************************************************************************/
		if(v.getVrfctnRsltValidatorAttestationSignatureTypCd() != null) {
			verificationresultvalidatorattestationsignaturetype.setCode(v.getVrfctnRsltValidatorAttestationSignatureTypCd());
		}
		/******************** VrfctnRslt_Validator_AttestationSignature_Typ_Dsply ********************************************************************************/
		if(v.getVrfctnRsltValidatorAttestationSignatureTypDsply() != null) {
			verificationresultvalidatorattestationsignaturetype.setDisplay(v.getVrfctnRsltValidatorAttestationSignatureTypDsply());
		}
		/******************** VrfctnRslt_Validator_AttestationSignature_Typ_Sys ********************************************************************************/
		if(v.getVrfctnRsltValidatorAttestationSignatureTypSys() != null) {
			verificationresultvalidatorattestationsignaturetype.setSystem(v.getVrfctnRsltValidatorAttestationSignatureTypSys());
		}
		/******************** VrfctnRslt_Validator_AttestationSignature_Typ_UsrSltd ********************************************************************************/
		if(v.getVrfctnRsltValidatorAttestationSignatureTypUsrSltd() != null) {
			verificationresultvalidatorattestationsignaturetype.setUserSelected(Boolean.parseBoolean(v.getVrfctnRsltValidatorAttestationSignatureTypUsrSltd()));
		}
		/******************** VrfctnRslt_Validator_AttestationSignature_Typ_Vrsn ********************************************************************************/
		if(v.getVrfctnRsltValidatorAttestationSignatureTypVrsn() != null) {
			verificationresultvalidatorattestationsignaturetype.setVersion(v.getVrfctnRsltValidatorAttestationSignatureTypVrsn());
		}
		/******************** VrfctnRslt_Validator_AttestationSignature_When ********************************************************************************/
		if(v.getVrfctnRsltValidatorAttestationSignatureWhen() != null) {
			java.text.SimpleDateFormat VrfctnRslt_Validator_AttestationSignature_Whensdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date VrfctnRslt_Validator_AttestationSignature_Whendate = VrfctnRslt_Validator_AttestationSignature_Whensdf.parse(v.getVrfctnRsltValidatorAttestationSignatureWhen());
			verificationresultvalidatorattestationsignature.setWhen(VrfctnRslt_Validator_AttestationSignature_Whendate);
		}
		/******************** VrfctnRslt_Validator_AttestationSignature_Who ********************************************************************************/
		if(v.getVrfctnRsltValidatorAttestationSignatureWho() != null) {
			verificationresultvalidatorattestationsignature.setWho( new org.hl7.fhir.r4.model.Reference(v.getVrfctnRsltValidatorAttestationSignatureWho()));
		}
		/******************** VrfctnRslt_Validator_IdentityCertificate ********************************************************************************/
		if(v.getVrfctnRsltValidatorIdentityCertificate() != null) {
			verificationresultvalidator.setIdentityCertificate(v.getVrfctnRsltValidatorIdentityCertificate());
		}
		/******************** VrfctnRslt_Validator_Orgnztn ********************************************************************************/
		if(v.getVrfctnRsltValidatorOrgnztn() != null) {
			verificationresultvalidator.setOrganization( new org.hl7.fhir.r4.model.Reference(v.getVrfctnRsltValidatorOrgnztn()));
		}
		return verificationresult;
	}
}
