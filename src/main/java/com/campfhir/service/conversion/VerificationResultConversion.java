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

		/******************** VrfctnRslt_Attestation_CmmnctnMthd_Cdg_Cd ********************************************************************************/
		if(v.getVrfctnRsltAttestationCmmnctnMthdCdgCd() != null ) {

			String[] arrayi0 = v.getVrfctnRsltAttestationCmmnctnMthdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getAttestation().getCommunicationMethod().getCoding().size() < i0+1) { verificationresult.getAttestation().getCommunicationMethod().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getAttestation().getCommunicationMethod().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VrfctnRslt_Attestation_CmmnctnMthd_Cdg_Dsply ********************************************************************************/
		if(v.getVrfctnRsltAttestationCmmnctnMthdCdgDsply() != null ) {

			String[] arrayi0 = v.getVrfctnRsltAttestationCmmnctnMthdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getAttestation().getCommunicationMethod().getCoding().size() < i0+1) { verificationresult.getAttestation().getCommunicationMethod().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getAttestation().getCommunicationMethod().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VrfctnRslt_Attestation_CmmnctnMthd_Cdg_Sys ********************************************************************************/
		if(v.getVrfctnRsltAttestationCmmnctnMthdCdgSys() != null ) {

			String[] arrayi0 = v.getVrfctnRsltAttestationCmmnctnMthdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getAttestation().getCommunicationMethod().getCoding().size() < i0+1) { verificationresult.getAttestation().getCommunicationMethod().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getAttestation().getCommunicationMethod().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VrfctnRslt_Attestation_CmmnctnMthd_Cdg_UsrSltd ********************************************************************************/
		if(v.getVrfctnRsltAttestationCmmnctnMthdCdgUsrSltd() != null ) {

			String[] arrayi0 = v.getVrfctnRsltAttestationCmmnctnMthdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getAttestation().getCommunicationMethod().getCoding().size() < i0+1) { verificationresult.getAttestation().getCommunicationMethod().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getAttestation().getCommunicationMethod().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VrfctnRslt_Attestation_CmmnctnMthd_Cdg_Vrsn ********************************************************************************/
		if(v.getVrfctnRsltAttestationCmmnctnMthdCdgVrsn() != null ) {

			String[] arrayi0 = v.getVrfctnRsltAttestationCmmnctnMthdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getAttestation().getCommunicationMethod().getCoding().size() < i0+1) { verificationresult.getAttestation().getCommunicationMethod().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getAttestation().getCommunicationMethod().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VrfctnRslt_Attestation_CmmnctnMthd_Txt ********************************************************************************/
		if(v.getVrfctnRsltAttestationCmmnctnMthdTxt() != null ) {

			if(v.getVrfctnRsltAttestationCmmnctnMthdTxt().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltAttestationCmmnctnMthdTxt()==null) {} else {
			verificationresult.getAttestation().getCommunicationMethod().setText(v.getVrfctnRsltAttestationCmmnctnMthdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** VrfctnRslt_Attestation_Dt ********************************************************************************/
		if(v.getVrfctnRsltAttestationDt() != null ) {

			if(v.getVrfctnRsltAttestationDt().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltAttestationDt()==null) {} else {
			verificationresult.getAttestation().setDate(v.getVrfctnRsltAttestationDt().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltAttestationDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(v.getVrfctnRsltAttestationDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VrfctnRslt_Attestation_OnBehalfOf ********************************************************************************/
		if(v.getVrfctnRsltAttestationOnBehalfOf() != null ) {

			if(v.getVrfctnRsltAttestationOnBehalfOf().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltAttestationOnBehalfOf()==null) {} else {
			verificationresult.getAttestation().setOnBehalfOf(new org.hl7.fhir.r4.model.Reference(v.getVrfctnRsltAttestationOnBehalfOf().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VrfctnRslt_Attestation_ProxyIdentityCertificate ********************************************************************************/
		if(v.getVrfctnRsltAttestationProxyIdentityCertificate() != null ) {

			if(v.getVrfctnRsltAttestationProxyIdentityCertificate().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltAttestationProxyIdentityCertificate()==null) {} else {
			verificationresult.getAttestation().setProxyIdentityCertificate(v.getVrfctnRsltAttestationProxyIdentityCertificate().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** VrfctnRslt_Attestation_ProxySignature_Data ********************************************************************************/
		if(v.getVrfctnRsltAttestationProxySignatureData() != null ) {

			if(v.getVrfctnRsltAttestationProxySignatureData().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltAttestationProxySignatureData()==null) {} else {
			verificationresult.getAttestation().getProxySignature().setData(v.getVrfctnRsltAttestationProxySignatureData().getBytes());
			}
		}
		/******************** VrfctnRslt_Attestation_ProxySignature_OnBehalfOf ********************************************************************************/
		if(v.getVrfctnRsltAttestationProxySignatureOnBehalfOf() != null ) {

			if(v.getVrfctnRsltAttestationProxySignatureOnBehalfOf().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltAttestationProxySignatureOnBehalfOf()==null) {} else {
			verificationresult.getAttestation().getProxySignature().setOnBehalfOf(new org.hl7.fhir.r4.model.Reference(v.getVrfctnRsltAttestationProxySignatureOnBehalfOf().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VrfctnRslt_Attestation_ProxySignature_SigFrmat ********************************************************************************/
		if(v.getVrfctnRsltAttestationProxySignatureSigFrmat() != null ) {

			if(v.getVrfctnRsltAttestationProxySignatureSigFrmat().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltAttestationProxySignatureSigFrmat()==null) {} else {
			verificationresult.getAttestation().getProxySignature().setSigFormat(v.getVrfctnRsltAttestationProxySignatureSigFrmat().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** VrfctnRslt_Attestation_ProxySignature_TarFrmat ********************************************************************************/
		if(v.getVrfctnRsltAttestationProxySignatureTarFrmat() != null ) {

			if(v.getVrfctnRsltAttestationProxySignatureTarFrmat().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltAttestationProxySignatureTarFrmat()==null) {} else {
			verificationresult.getAttestation().getProxySignature().setTargetFormat(v.getVrfctnRsltAttestationProxySignatureTarFrmat().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** VrfctnRslt_Attestation_ProxySignature_Typ_Cd ********************************************************************************/
		if(v.getVrfctnRsltAttestationProxySignatureTypCd() != null ) {

			String[] arrayi0 = v.getVrfctnRsltAttestationProxySignatureTypCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getAttestation().getProxySignature().getType().size() < i0+1) { verificationresult.getAttestation().getProxySignature().addType(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getAttestation().getProxySignature().getType().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VrfctnRslt_Attestation_ProxySignature_Typ_Dsply ********************************************************************************/
		if(v.getVrfctnRsltAttestationProxySignatureTypDsply() != null ) {

			String[] arrayi0 = v.getVrfctnRsltAttestationProxySignatureTypDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getAttestation().getProxySignature().getType().size() < i0+1) { verificationresult.getAttestation().getProxySignature().addType(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getAttestation().getProxySignature().getType().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VrfctnRslt_Attestation_ProxySignature_Typ_Sys ********************************************************************************/
		if(v.getVrfctnRsltAttestationProxySignatureTypSys() != null ) {

			String[] arrayi0 = v.getVrfctnRsltAttestationProxySignatureTypSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getAttestation().getProxySignature().getType().size() < i0+1) { verificationresult.getAttestation().getProxySignature().addType(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getAttestation().getProxySignature().getType().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VrfctnRslt_Attestation_ProxySignature_Typ_UsrSltd ********************************************************************************/
		if(v.getVrfctnRsltAttestationProxySignatureTypUsrSltd() != null ) {

			String[] arrayi0 = v.getVrfctnRsltAttestationProxySignatureTypUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getAttestation().getProxySignature().getType().size() < i0+1) { verificationresult.getAttestation().getProxySignature().addType(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getAttestation().getProxySignature().getType().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VrfctnRslt_Attestation_ProxySignature_Typ_Vrsn ********************************************************************************/
		if(v.getVrfctnRsltAttestationProxySignatureTypVrsn() != null ) {

			String[] arrayi0 = v.getVrfctnRsltAttestationProxySignatureTypVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getAttestation().getProxySignature().getType().size() < i0+1) { verificationresult.getAttestation().getProxySignature().addType(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getAttestation().getProxySignature().getType().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VrfctnRslt_Attestation_ProxySignature_When ********************************************************************************/
		if(v.getVrfctnRsltAttestationProxySignatureWhen() != null ) {

			if(v.getVrfctnRsltAttestationProxySignatureWhen().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltAttestationProxySignatureWhen()==null) {} else {
			verificationresult.getAttestation().getProxySignature().setWhen(v.getVrfctnRsltAttestationProxySignatureWhen().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltAttestationProxySignatureWhen()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(v.getVrfctnRsltAttestationProxySignatureWhen().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VrfctnRslt_Attestation_ProxySignature_Who ********************************************************************************/
		if(v.getVrfctnRsltAttestationProxySignatureWho() != null ) {

			if(v.getVrfctnRsltAttestationProxySignatureWho().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltAttestationProxySignatureWho()==null) {} else {
			verificationresult.getAttestation().getProxySignature().setWho(new org.hl7.fhir.r4.model.Reference(v.getVrfctnRsltAttestationProxySignatureWho().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VrfctnRslt_Attestation_SrcIdentityCertificate ********************************************************************************/
		if(v.getVrfctnRsltAttestationSrcIdentityCertificate() != null ) {

			if(v.getVrfctnRsltAttestationSrcIdentityCertificate().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltAttestationSrcIdentityCertificate()==null) {} else {
			verificationresult.getAttestation().setSourceIdentityCertificate(v.getVrfctnRsltAttestationSrcIdentityCertificate().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** VrfctnRslt_Attestation_SrcSignature_Data ********************************************************************************/
		if(v.getVrfctnRsltAttestationSrcSignatureData() != null ) {

			if(v.getVrfctnRsltAttestationSrcSignatureData().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltAttestationSrcSignatureData()==null) {} else {
			verificationresult.getAttestation().getSourceSignature().setData(v.getVrfctnRsltAttestationSrcSignatureData().getBytes());
			}
		}
		/******************** VrfctnRslt_Attestation_SrcSignature_OnBehalfOf ********************************************************************************/
		if(v.getVrfctnRsltAttestationSrcSignatureOnBehalfOf() != null ) {

			if(v.getVrfctnRsltAttestationSrcSignatureOnBehalfOf().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltAttestationSrcSignatureOnBehalfOf()==null) {} else {
			verificationresult.getAttestation().getSourceSignature().setOnBehalfOf(new org.hl7.fhir.r4.model.Reference(v.getVrfctnRsltAttestationSrcSignatureOnBehalfOf().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VrfctnRslt_Attestation_SrcSignature_SigFrmat ********************************************************************************/
		if(v.getVrfctnRsltAttestationSrcSignatureSigFrmat() != null ) {

			if(v.getVrfctnRsltAttestationSrcSignatureSigFrmat().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltAttestationSrcSignatureSigFrmat()==null) {} else {
			verificationresult.getAttestation().getSourceSignature().setSigFormat(v.getVrfctnRsltAttestationSrcSignatureSigFrmat().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** VrfctnRslt_Attestation_SrcSignature_TarFrmat ********************************************************************************/
		if(v.getVrfctnRsltAttestationSrcSignatureTarFrmat() != null ) {

			if(v.getVrfctnRsltAttestationSrcSignatureTarFrmat().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltAttestationSrcSignatureTarFrmat()==null) {} else {
			verificationresult.getAttestation().getSourceSignature().setTargetFormat(v.getVrfctnRsltAttestationSrcSignatureTarFrmat().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** VrfctnRslt_Attestation_SrcSignature_Typ_Cd ********************************************************************************/
		if(v.getVrfctnRsltAttestationSrcSignatureTypCd() != null ) {

			String[] arrayi0 = v.getVrfctnRsltAttestationSrcSignatureTypCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getAttestation().getSourceSignature().getType().size() < i0+1) { verificationresult.getAttestation().getSourceSignature().addType(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getAttestation().getSourceSignature().getType().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VrfctnRslt_Attestation_SrcSignature_Typ_Dsply ********************************************************************************/
		if(v.getVrfctnRsltAttestationSrcSignatureTypDsply() != null ) {

			String[] arrayi0 = v.getVrfctnRsltAttestationSrcSignatureTypDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getAttestation().getSourceSignature().getType().size() < i0+1) { verificationresult.getAttestation().getSourceSignature().addType(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getAttestation().getSourceSignature().getType().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VrfctnRslt_Attestation_SrcSignature_Typ_Sys ********************************************************************************/
		if(v.getVrfctnRsltAttestationSrcSignatureTypSys() != null ) {

			String[] arrayi0 = v.getVrfctnRsltAttestationSrcSignatureTypSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getAttestation().getSourceSignature().getType().size() < i0+1) { verificationresult.getAttestation().getSourceSignature().addType(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getAttestation().getSourceSignature().getType().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VrfctnRslt_Attestation_SrcSignature_Typ_UsrSltd ********************************************************************************/
		if(v.getVrfctnRsltAttestationSrcSignatureTypUsrSltd() != null ) {

			String[] arrayi0 = v.getVrfctnRsltAttestationSrcSignatureTypUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getAttestation().getSourceSignature().getType().size() < i0+1) { verificationresult.getAttestation().getSourceSignature().addType(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getAttestation().getSourceSignature().getType().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VrfctnRslt_Attestation_SrcSignature_Typ_Vrsn ********************************************************************************/
		if(v.getVrfctnRsltAttestationSrcSignatureTypVrsn() != null ) {

			String[] arrayi0 = v.getVrfctnRsltAttestationSrcSignatureTypVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getAttestation().getSourceSignature().getType().size() < i0+1) { verificationresult.getAttestation().getSourceSignature().addType(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getAttestation().getSourceSignature().getType().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VrfctnRslt_Attestation_SrcSignature_When ********************************************************************************/
		if(v.getVrfctnRsltAttestationSrcSignatureWhen() != null ) {

			if(v.getVrfctnRsltAttestationSrcSignatureWhen().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltAttestationSrcSignatureWhen()==null) {} else {
			verificationresult.getAttestation().getSourceSignature().setWhen(v.getVrfctnRsltAttestationSrcSignatureWhen().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltAttestationSrcSignatureWhen()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(v.getVrfctnRsltAttestationSrcSignatureWhen().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VrfctnRslt_Attestation_SrcSignature_Who ********************************************************************************/
		if(v.getVrfctnRsltAttestationSrcSignatureWho() != null ) {

			if(v.getVrfctnRsltAttestationSrcSignatureWho().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltAttestationSrcSignatureWho()==null) {} else {
			verificationresult.getAttestation().getSourceSignature().setWho(new org.hl7.fhir.r4.model.Reference(v.getVrfctnRsltAttestationSrcSignatureWho().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VrfctnRslt_Attestation_Who ********************************************************************************/
		if(v.getVrfctnRsltAttestationWho() != null ) {

			if(v.getVrfctnRsltAttestationWho().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltAttestationWho()==null) {} else {
			verificationresult.getAttestation().setWho(new org.hl7.fhir.r4.model.Reference(v.getVrfctnRsltAttestationWho().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VrfctnRslt_FailureActn_Cdg_Cd ********************************************************************************/
		if(v.getVrfctnRsltFailureActnCdgCd() != null ) {

			String[] arrayi0 = v.getVrfctnRsltFailureActnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getFailureAction().getCoding().size() < i0+1) { verificationresult.getFailureAction().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getFailureAction().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VrfctnRslt_FailureActn_Cdg_Dsply ********************************************************************************/
		if(v.getVrfctnRsltFailureActnCdgDsply() != null ) {

			String[] arrayi0 = v.getVrfctnRsltFailureActnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getFailureAction().getCoding().size() < i0+1) { verificationresult.getFailureAction().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getFailureAction().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VrfctnRslt_FailureActn_Cdg_Sys ********************************************************************************/
		if(v.getVrfctnRsltFailureActnCdgSys() != null ) {

			String[] arrayi0 = v.getVrfctnRsltFailureActnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getFailureAction().getCoding().size() < i0+1) { verificationresult.getFailureAction().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getFailureAction().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VrfctnRslt_FailureActn_Cdg_UsrSltd ********************************************************************************/
		if(v.getVrfctnRsltFailureActnCdgUsrSltd() != null ) {

			String[] arrayi0 = v.getVrfctnRsltFailureActnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getFailureAction().getCoding().size() < i0+1) { verificationresult.getFailureAction().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getFailureAction().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VrfctnRslt_FailureActn_Cdg_Vrsn ********************************************************************************/
		if(v.getVrfctnRsltFailureActnCdgVrsn() != null ) {

			String[] arrayi0 = v.getVrfctnRsltFailureActnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getFailureAction().getCoding().size() < i0+1) { verificationresult.getFailureAction().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getFailureAction().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VrfctnRslt_FailureActn_Txt ********************************************************************************/
		if(v.getVrfctnRsltFailureActnTxt() != null ) {

			if(v.getVrfctnRsltFailureActnTxt().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltFailureActnTxt()==null) {} else {
			verificationresult.getFailureAction().setText(v.getVrfctnRsltFailureActnTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** VrfctnRslt_Frqncy_Cd_Cdg_Cd ********************************************************************************/
		if(v.getVrfctnRsltFrqncyCdCdgCd() != null ) {

			String[] arrayi0 = v.getVrfctnRsltFrqncyCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getFrequency().getCode().getCoding().size() < i0+1) { verificationresult.getFrequency().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getFrequency().getCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VrfctnRslt_Frqncy_Cd_Cdg_Dsply ********************************************************************************/
		if(v.getVrfctnRsltFrqncyCdCdgDsply() != null ) {

			String[] arrayi0 = v.getVrfctnRsltFrqncyCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getFrequency().getCode().getCoding().size() < i0+1) { verificationresult.getFrequency().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getFrequency().getCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VrfctnRslt_Frqncy_Cd_Cdg_Sys ********************************************************************************/
		if(v.getVrfctnRsltFrqncyCdCdgSys() != null ) {

			String[] arrayi0 = v.getVrfctnRsltFrqncyCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getFrequency().getCode().getCoding().size() < i0+1) { verificationresult.getFrequency().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getFrequency().getCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VrfctnRslt_Frqncy_Cd_Cdg_UsrSltd ********************************************************************************/
		if(v.getVrfctnRsltFrqncyCdCdgUsrSltd() != null ) {

			String[] arrayi0 = v.getVrfctnRsltFrqncyCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getFrequency().getCode().getCoding().size() < i0+1) { verificationresult.getFrequency().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getFrequency().getCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VrfctnRslt_Frqncy_Cd_Cdg_Vrsn ********************************************************************************/
		if(v.getVrfctnRsltFrqncyCdCdgVrsn() != null ) {

			String[] arrayi0 = v.getVrfctnRsltFrqncyCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getFrequency().getCode().getCoding().size() < i0+1) { verificationresult.getFrequency().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getFrequency().getCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VrfctnRslt_Frqncy_Cd_Txt ********************************************************************************/
		if(v.getVrfctnRsltFrqncyCdTxt() != null ) {

			if(v.getVrfctnRsltFrqncyCdTxt().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltFrqncyCdTxt()==null) {} else {
			verificationresult.getFrequency().getCode().setText(v.getVrfctnRsltFrqncyCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** VrfctnRslt_Frqncy_Evnt ********************************************************************************/
		if(v.getVrfctnRsltFrqncyEvnt() != null ) {

				for( String currListStrSplit : v.getVrfctnRsltFrqncyEvnt().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			verificationresult.getFrequency().addEvent(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** VrfctnRslt_Frqncy_Rpt_BndsDuration_Cd ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptBndsDurationCd() != null ) {

			if(v.getVrfctnRsltFrqncyRptBndsDurationCd().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltFrqncyRptBndsDurationCd()==null) {} else {
			verificationresult.getFrequency().getRepeat().getBoundsDuration().setCode(v.getVrfctnRsltFrqncyRptBndsDurationCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** VrfctnRslt_Frqncy_Rpt_BndsDuration_Cmprtr ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptBndsDurationCmprtr() != null ) {

			if(v.getVrfctnRsltFrqncyRptBndsDurationCmprtr().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltFrqncyRptBndsDurationCmprtr()==null) {} else {
			verificationresult.getFrequency().getRepeat().getBoundsDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(v.getVrfctnRsltFrqncyRptBndsDurationCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VrfctnRslt_Frqncy_Rpt_BndsDuration_Sys ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptBndsDurationSys() != null ) {

			if(v.getVrfctnRsltFrqncyRptBndsDurationSys().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltFrqncyRptBndsDurationSys()==null) {} else {
			verificationresult.getFrequency().getRepeat().getBoundsDuration().setSystem(v.getVrfctnRsltFrqncyRptBndsDurationSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** VrfctnRslt_Frqncy_Rpt_BndsDuration_Unt ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptBndsDurationUnt() != null ) {

			if(v.getVrfctnRsltFrqncyRptBndsDurationUnt().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltFrqncyRptBndsDurationUnt()==null) {} else {
			verificationresult.getFrequency().getRepeat().getBoundsDuration().setUnit(v.getVrfctnRsltFrqncyRptBndsDurationUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** VrfctnRslt_Frqncy_Rpt_BndsDuration_Vl ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptBndsDurationVl() != null ) {

			if(v.getVrfctnRsltFrqncyRptBndsDurationVl().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltFrqncyRptBndsDurationVl()==null) {} else {
			verificationresult.getFrequency().getRepeat().getBoundsDuration().setValue((new java.math.BigDecimal((v.getVrfctnRsltFrqncyRptBndsDurationVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** VrfctnRslt_Frqncy_Rpt_BndsPrd_End ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptBndsPrdEnd() != null ) {

			if(v.getVrfctnRsltFrqncyRptBndsPrdEnd().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltFrqncyRptBndsPrdEnd()==null) {} else {
			verificationresult.getFrequency().getRepeat().getBoundsPeriod().setEnd(v.getVrfctnRsltFrqncyRptBndsPrdEnd().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltFrqncyRptBndsPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(v.getVrfctnRsltFrqncyRptBndsPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VrfctnRslt_Frqncy_Rpt_BndsPrd_Strt ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptBndsPrdStrt() != null ) {

			if(v.getVrfctnRsltFrqncyRptBndsPrdStrt().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltFrqncyRptBndsPrdStrt()==null) {} else {
			verificationresult.getFrequency().getRepeat().getBoundsPeriod().setStart(v.getVrfctnRsltFrqncyRptBndsPrdStrt().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltFrqncyRptBndsPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(v.getVrfctnRsltFrqncyRptBndsPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VrfctnRslt_Frqncy_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptBndsRngHiCd() != null ) {

			if(v.getVrfctnRsltFrqncyRptBndsRngHiCd().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltFrqncyRptBndsRngHiCd()==null) {} else {
			verificationresult.getFrequency().getRepeat().getBoundsRange().getHigh().setCode(v.getVrfctnRsltFrqncyRptBndsRngHiCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** VrfctnRslt_Frqncy_Rpt_BndsRng_Hi_Cmprtr ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptBndsRngHiCmprtr() != null ) {

			if(v.getVrfctnRsltFrqncyRptBndsRngHiCmprtr().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltFrqncyRptBndsRngHiCmprtr()==null) {} else {
			verificationresult.getFrequency().getRepeat().getBoundsRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(v.getVrfctnRsltFrqncyRptBndsRngHiCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VrfctnRslt_Frqncy_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptBndsRngHiSys() != null ) {

			if(v.getVrfctnRsltFrqncyRptBndsRngHiSys().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltFrqncyRptBndsRngHiSys()==null) {} else {
			verificationresult.getFrequency().getRepeat().getBoundsRange().getHigh().setSystem(v.getVrfctnRsltFrqncyRptBndsRngHiSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** VrfctnRslt_Frqncy_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptBndsRngHiUnt() != null ) {

			if(v.getVrfctnRsltFrqncyRptBndsRngHiUnt().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltFrqncyRptBndsRngHiUnt()==null) {} else {
			verificationresult.getFrequency().getRepeat().getBoundsRange().getHigh().setUnit(v.getVrfctnRsltFrqncyRptBndsRngHiUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** VrfctnRslt_Frqncy_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptBndsRngHiVl() != null ) {

			if(v.getVrfctnRsltFrqncyRptBndsRngHiVl().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltFrqncyRptBndsRngHiVl()==null) {} else {
			verificationresult.getFrequency().getRepeat().getBoundsRange().getHigh().setValue((new java.math.BigDecimal((v.getVrfctnRsltFrqncyRptBndsRngHiVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** VrfctnRslt_Frqncy_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptBndsRngLwCd() != null ) {

			if(v.getVrfctnRsltFrqncyRptBndsRngLwCd().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltFrqncyRptBndsRngLwCd()==null) {} else {
			verificationresult.getFrequency().getRepeat().getBoundsRange().getLow().setCode(v.getVrfctnRsltFrqncyRptBndsRngLwCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** VrfctnRslt_Frqncy_Rpt_BndsRng_Lw_Cmprtr ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptBndsRngLwCmprtr() != null ) {

			if(v.getVrfctnRsltFrqncyRptBndsRngLwCmprtr().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltFrqncyRptBndsRngLwCmprtr()==null) {} else {
			verificationresult.getFrequency().getRepeat().getBoundsRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(v.getVrfctnRsltFrqncyRptBndsRngLwCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VrfctnRslt_Frqncy_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptBndsRngLwSys() != null ) {

			if(v.getVrfctnRsltFrqncyRptBndsRngLwSys().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltFrqncyRptBndsRngLwSys()==null) {} else {
			verificationresult.getFrequency().getRepeat().getBoundsRange().getLow().setSystem(v.getVrfctnRsltFrqncyRptBndsRngLwSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** VrfctnRslt_Frqncy_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptBndsRngLwUnt() != null ) {

			if(v.getVrfctnRsltFrqncyRptBndsRngLwUnt().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltFrqncyRptBndsRngLwUnt()==null) {} else {
			verificationresult.getFrequency().getRepeat().getBoundsRange().getLow().setUnit(v.getVrfctnRsltFrqncyRptBndsRngLwUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** VrfctnRslt_Frqncy_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptBndsRngLwVl() != null ) {

			if(v.getVrfctnRsltFrqncyRptBndsRngLwVl().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltFrqncyRptBndsRngLwVl()==null) {} else {
			verificationresult.getFrequency().getRepeat().getBoundsRange().getLow().setValue((new java.math.BigDecimal((v.getVrfctnRsltFrqncyRptBndsRngLwVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** VrfctnRslt_Frqncy_Rpt_Cnt ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptCnt() != null ) {

			if(v.getVrfctnRsltFrqncyRptCnt().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltFrqncyRptCnt()==null) {} else {
			verificationresult.getFrequency().getRepeat().setCount(Integer.parseInt(v.getVrfctnRsltFrqncyRptCnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VrfctnRslt_Frqncy_Rpt_CntMx ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptCntMx() != null ) {

			if(v.getVrfctnRsltFrqncyRptCntMx().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltFrqncyRptCntMx()==null) {} else {
			verificationresult.getFrequency().getRepeat().setCountMax(Integer.parseInt(v.getVrfctnRsltFrqncyRptCntMx().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VrfctnRslt_Frqncy_Rpt_Duration ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptDuration() != null ) {

			if(v.getVrfctnRsltFrqncyRptDuration().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltFrqncyRptDuration()==null) {} else {
			verificationresult.getFrequency().getRepeat().setDuration((Double.parseDouble((v.getVrfctnRsltFrqncyRptDuration().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** VrfctnRslt_Frqncy_Rpt_DurationMx ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptDurationMx() != null ) {

			if(v.getVrfctnRsltFrqncyRptDurationMx().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltFrqncyRptDurationMx()==null) {} else {
			verificationresult.getFrequency().getRepeat().setDurationMax((Double.parseDouble((v.getVrfctnRsltFrqncyRptDurationMx().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** VrfctnRslt_Frqncy_Rpt_DurationUnt ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptDurationUnt() != null ) {

			if(v.getVrfctnRsltFrqncyRptDurationUnt().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltFrqncyRptDurationUnt()==null) {} else {
			verificationresult.getFrequency().getRepeat().setDurationUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(v.getVrfctnRsltFrqncyRptDurationUnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VrfctnRslt_Frqncy_Rpt_Frqncy ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptFrqncy() != null ) {

			if(v.getVrfctnRsltFrqncyRptFrqncy().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltFrqncyRptFrqncy()==null) {} else {
			verificationresult.getFrequency().getRepeat().setFrequency(Integer.parseInt(v.getVrfctnRsltFrqncyRptFrqncy().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VrfctnRslt_Frqncy_Rpt_FrqncyMx ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptFrqncyMx() != null ) {

			if(v.getVrfctnRsltFrqncyRptFrqncyMx().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltFrqncyRptFrqncyMx()==null) {} else {
			verificationresult.getFrequency().getRepeat().setFrequencyMax(Integer.parseInt(v.getVrfctnRsltFrqncyRptFrqncyMx().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VrfctnRslt_Frqncy_Rpt_Off ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptOff() != null ) {

			if(v.getVrfctnRsltFrqncyRptOff().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltFrqncyRptOff()==null) {} else {
			verificationresult.getFrequency().getRepeat().setOffset(Integer.parseInt(v.getVrfctnRsltFrqncyRptOff().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VrfctnRslt_Frqncy_Rpt_Prd ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptPrd() != null ) {

			if(v.getVrfctnRsltFrqncyRptPrd().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltFrqncyRptPrd()==null) {} else {
			verificationresult.getFrequency().getRepeat().setPeriod((new java.math.BigDecimal((v.getVrfctnRsltFrqncyRptPrd().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** VrfctnRslt_Frqncy_Rpt_PrdMx ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptPrdMx() != null ) {

			if(v.getVrfctnRsltFrqncyRptPrdMx().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltFrqncyRptPrdMx()==null) {} else {
			verificationresult.getFrequency().getRepeat().setPeriodMax((new java.math.BigDecimal((v.getVrfctnRsltFrqncyRptPrdMx().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** VrfctnRslt_Frqncy_Rpt_PrdUnt ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptPrdUnt() != null ) {

			if(v.getVrfctnRsltFrqncyRptPrdUnt().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltFrqncyRptPrdUnt()==null) {} else {
			verificationresult.getFrequency().getRepeat().setPeriodUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(v.getVrfctnRsltFrqncyRptPrdUnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VrfctnRslt_Frqncy_Rpt_TimeOfDay ********************************************************************************/
		if(v.getVrfctnRsltFrqncyRptTimeOfDay() != null ) {

				for( String currListStrSplit : v.getVrfctnRsltFrqncyRptTimeOfDay().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			verificationresult.getFrequency().getRepeat().addTimeOfDay(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** VrfctnRslt_LastPerformed ********************************************************************************/
		if(v.getVrfctnRsltLastPerformed() != null ) {

			if(v.getVrfctnRsltLastPerformed().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltLastPerformed()==null) {} else {
			verificationresult.setLastPerformed(v.getVrfctnRsltLastPerformed().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltLastPerformed()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(v.getVrfctnRsltLastPerformed().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VrfctnRslt_Need_Cdg_Cd ********************************************************************************/
		if(v.getVrfctnRsltNeedCdgCd() != null ) {

			String[] arrayi0 = v.getVrfctnRsltNeedCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getNeed().getCoding().size() < i0+1) { verificationresult.getNeed().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getNeed().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VrfctnRslt_Need_Cdg_Dsply ********************************************************************************/
		if(v.getVrfctnRsltNeedCdgDsply() != null ) {

			String[] arrayi0 = v.getVrfctnRsltNeedCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getNeed().getCoding().size() < i0+1) { verificationresult.getNeed().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getNeed().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VrfctnRslt_Need_Cdg_Sys ********************************************************************************/
		if(v.getVrfctnRsltNeedCdgSys() != null ) {

			String[] arrayi0 = v.getVrfctnRsltNeedCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getNeed().getCoding().size() < i0+1) { verificationresult.getNeed().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getNeed().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VrfctnRslt_Need_Cdg_UsrSltd ********************************************************************************/
		if(v.getVrfctnRsltNeedCdgUsrSltd() != null ) {

			String[] arrayi0 = v.getVrfctnRsltNeedCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getNeed().getCoding().size() < i0+1) { verificationresult.getNeed().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getNeed().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VrfctnRslt_Need_Cdg_Vrsn ********************************************************************************/
		if(v.getVrfctnRsltNeedCdgVrsn() != null ) {

			String[] arrayi0 = v.getVrfctnRsltNeedCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getNeed().getCoding().size() < i0+1) { verificationresult.getNeed().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getNeed().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VrfctnRslt_Need_Txt ********************************************************************************/
		if(v.getVrfctnRsltNeedTxt() != null ) {

			if(v.getVrfctnRsltNeedTxt().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltNeedTxt()==null) {} else {
			verificationresult.getNeed().setText(v.getVrfctnRsltNeedTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** VrfctnRslt_NextSchdld ********************************************************************************/
		if(v.getVrfctnRsltNextSchdld() != null ) {

			if(v.getVrfctnRsltNextSchdld().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltNextSchdld()==null) {} else {
			verificationresult.setNextScheduled(v.getVrfctnRsltNextSchdld().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltNextSchdld()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(v.getVrfctnRsltNextSchdld().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VrfctnRslt_PrimarySrc_CanPushUpdates_Cdg_Cd ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcCanPushUpdatesCdgCd() != null ) {

			String[] arrayi0 = v.getVrfctnRsltPrimarySrcCanPushUpdatesCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getPrimarySource().size() < i0+1) { verificationresult.addPrimarySource(); }
				String[] arrayi1 = v.getVrfctnRsltPrimarySrcCanPushUpdatesCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getPrimarySource().get(i0).getCanPushUpdates().getCoding().size() < i1+1) { verificationresult.getPrimarySource().get(i0).getCanPushUpdates().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {verificationresult.getPrimarySource().get(i0).getCanPushUpdates().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VrfctnRslt_PrimarySrc_CanPushUpdates_Cdg_Dsply ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcCanPushUpdatesCdgDsply() != null ) {

			String[] arrayi0 = v.getVrfctnRsltPrimarySrcCanPushUpdatesCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getPrimarySource().size() < i0+1) { verificationresult.addPrimarySource(); }
				String[] arrayi1 = v.getVrfctnRsltPrimarySrcCanPushUpdatesCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getPrimarySource().get(i0).getCanPushUpdates().getCoding().size() < i1+1) { verificationresult.getPrimarySource().get(i0).getCanPushUpdates().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {verificationresult.getPrimarySource().get(i0).getCanPushUpdates().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VrfctnRslt_PrimarySrc_CanPushUpdates_Cdg_Sys ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcCanPushUpdatesCdgSys() != null ) {

			String[] arrayi0 = v.getVrfctnRsltPrimarySrcCanPushUpdatesCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getPrimarySource().size() < i0+1) { verificationresult.addPrimarySource(); }
				String[] arrayi1 = v.getVrfctnRsltPrimarySrcCanPushUpdatesCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getPrimarySource().get(i0).getCanPushUpdates().getCoding().size() < i1+1) { verificationresult.getPrimarySource().get(i0).getCanPushUpdates().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {verificationresult.getPrimarySource().get(i0).getCanPushUpdates().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VrfctnRslt_PrimarySrc_CanPushUpdates_Cdg_UsrSltd ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcCanPushUpdatesCdgUsrSltd() != null ) {

			String[] arrayi0 = v.getVrfctnRsltPrimarySrcCanPushUpdatesCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getPrimarySource().size() < i0+1) { verificationresult.addPrimarySource(); }
				String[] arrayi1 = v.getVrfctnRsltPrimarySrcCanPushUpdatesCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getPrimarySource().get(i0).getCanPushUpdates().getCoding().size() < i1+1) { verificationresult.getPrimarySource().get(i0).getCanPushUpdates().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {verificationresult.getPrimarySource().get(i0).getCanPushUpdates().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** VrfctnRslt_PrimarySrc_CanPushUpdates_Cdg_Vrsn ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcCanPushUpdatesCdgVrsn() != null ) {

			String[] arrayi0 = v.getVrfctnRsltPrimarySrcCanPushUpdatesCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getPrimarySource().size() < i0+1) { verificationresult.addPrimarySource(); }
				String[] arrayi1 = v.getVrfctnRsltPrimarySrcCanPushUpdatesCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getPrimarySource().get(i0).getCanPushUpdates().getCoding().size() < i1+1) { verificationresult.getPrimarySource().get(i0).getCanPushUpdates().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {verificationresult.getPrimarySource().get(i0).getCanPushUpdates().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VrfctnRslt_PrimarySrc_CanPushUpdates_Txt ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcCanPushUpdatesTxt() != null ) {

			String[] arrayi0 = v.getVrfctnRsltPrimarySrcCanPushUpdatesTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getPrimarySource().size() < i0+1) { verificationresult.addPrimarySource(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getPrimarySource().get(i0).getCanPushUpdates().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VrfctnRslt_PrimarySrc_CmmnctnMthd_Cdg_Cd ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcCmmnctnMthdCdgCd() != null ) {

			String[] arrayi0 = v.getVrfctnRsltPrimarySrcCmmnctnMthdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getPrimarySource().size() < i0+1) { verificationresult.addPrimarySource(); }
				String[] arrayi1 = v.getVrfctnRsltPrimarySrcCmmnctnMthdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getPrimarySource().get(i0).getCommunicationMethod().size() < i1+1) { verificationresult.getPrimarySource().get(i0).addCommunicationMethod(); }
					String[] arrayi2 = v.getVrfctnRsltPrimarySrcCmmnctnMthdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(verificationresult.getPrimarySource().get(i0).getCommunicationMethod().get(i1).getCoding().size() < i2+1) { verificationresult.getPrimarySource().get(i0).getCommunicationMethod().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {verificationresult.getPrimarySource().get(i0).getCommunicationMethod().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** VrfctnRslt_PrimarySrc_CmmnctnMthd_Cdg_Dsply ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcCmmnctnMthdCdgDsply() != null ) {

			String[] arrayi0 = v.getVrfctnRsltPrimarySrcCmmnctnMthdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getPrimarySource().size() < i0+1) { verificationresult.addPrimarySource(); }
				String[] arrayi1 = v.getVrfctnRsltPrimarySrcCmmnctnMthdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getPrimarySource().get(i0).getCommunicationMethod().size() < i1+1) { verificationresult.getPrimarySource().get(i0).addCommunicationMethod(); }
					String[] arrayi2 = v.getVrfctnRsltPrimarySrcCmmnctnMthdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(verificationresult.getPrimarySource().get(i0).getCommunicationMethod().get(i1).getCoding().size() < i2+1) { verificationresult.getPrimarySource().get(i0).getCommunicationMethod().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {verificationresult.getPrimarySource().get(i0).getCommunicationMethod().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** VrfctnRslt_PrimarySrc_CmmnctnMthd_Cdg_Sys ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcCmmnctnMthdCdgSys() != null ) {

			String[] arrayi0 = v.getVrfctnRsltPrimarySrcCmmnctnMthdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getPrimarySource().size() < i0+1) { verificationresult.addPrimarySource(); }
				String[] arrayi1 = v.getVrfctnRsltPrimarySrcCmmnctnMthdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getPrimarySource().get(i0).getCommunicationMethod().size() < i1+1) { verificationresult.getPrimarySource().get(i0).addCommunicationMethod(); }
					String[] arrayi2 = v.getVrfctnRsltPrimarySrcCmmnctnMthdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(verificationresult.getPrimarySource().get(i0).getCommunicationMethod().get(i1).getCoding().size() < i2+1) { verificationresult.getPrimarySource().get(i0).getCommunicationMethod().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {verificationresult.getPrimarySource().get(i0).getCommunicationMethod().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** VrfctnRslt_PrimarySrc_CmmnctnMthd_Cdg_UsrSltd ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcCmmnctnMthdCdgUsrSltd() != null ) {

			String[] arrayi0 = v.getVrfctnRsltPrimarySrcCmmnctnMthdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getPrimarySource().size() < i0+1) { verificationresult.addPrimarySource(); }
				String[] arrayi1 = v.getVrfctnRsltPrimarySrcCmmnctnMthdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getPrimarySource().get(i0).getCommunicationMethod().size() < i1+1) { verificationresult.getPrimarySource().get(i0).addCommunicationMethod(); }
					String[] arrayi2 = v.getVrfctnRsltPrimarySrcCmmnctnMthdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(verificationresult.getPrimarySource().get(i0).getCommunicationMethod().get(i1).getCoding().size() < i2+1) { verificationresult.getPrimarySource().get(i0).getCommunicationMethod().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {verificationresult.getPrimarySource().get(i0).getCommunicationMethod().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** VrfctnRslt_PrimarySrc_CmmnctnMthd_Cdg_Vrsn ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcCmmnctnMthdCdgVrsn() != null ) {

			String[] arrayi0 = v.getVrfctnRsltPrimarySrcCmmnctnMthdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getPrimarySource().size() < i0+1) { verificationresult.addPrimarySource(); }
				String[] arrayi1 = v.getVrfctnRsltPrimarySrcCmmnctnMthdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getPrimarySource().get(i0).getCommunicationMethod().size() < i1+1) { verificationresult.getPrimarySource().get(i0).addCommunicationMethod(); }
					String[] arrayi2 = v.getVrfctnRsltPrimarySrcCmmnctnMthdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(verificationresult.getPrimarySource().get(i0).getCommunicationMethod().get(i1).getCoding().size() < i2+1) { verificationresult.getPrimarySource().get(i0).getCommunicationMethod().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {verificationresult.getPrimarySource().get(i0).getCommunicationMethod().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** VrfctnRslt_PrimarySrc_CmmnctnMthd_Txt ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcCmmnctnMthdTxt() != null ) {

			String[] arrayi0 = v.getVrfctnRsltPrimarySrcCmmnctnMthdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getPrimarySource().size() < i0+1) { verificationresult.addPrimarySource(); }
				String[] arrayi1 = v.getVrfctnRsltPrimarySrcCmmnctnMthdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getPrimarySource().get(i0).getCommunicationMethod().size() < i1+1) { verificationresult.getPrimarySource().get(i0).addCommunicationMethod(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {verificationresult.getPrimarySource().get(i0).getCommunicationMethod().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VrfctnRslt_PrimarySrc_PushTypAvailable_Cdg_Cd ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcPushTypAvailableCdgCd() != null ) {

			String[] arrayi0 = v.getVrfctnRsltPrimarySrcPushTypAvailableCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getPrimarySource().size() < i0+1) { verificationresult.addPrimarySource(); }
				String[] arrayi1 = v.getVrfctnRsltPrimarySrcPushTypAvailableCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getPrimarySource().get(i0).getPushTypeAvailable().size() < i1+1) { verificationresult.getPrimarySource().get(i0).addPushTypeAvailable(); }
					String[] arrayi2 = v.getVrfctnRsltPrimarySrcPushTypAvailableCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(verificationresult.getPrimarySource().get(i0).getPushTypeAvailable().get(i1).getCoding().size() < i2+1) { verificationresult.getPrimarySource().get(i0).getPushTypeAvailable().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {verificationresult.getPrimarySource().get(i0).getPushTypeAvailable().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** VrfctnRslt_PrimarySrc_PushTypAvailable_Cdg_Dsply ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcPushTypAvailableCdgDsply() != null ) {

			String[] arrayi0 = v.getVrfctnRsltPrimarySrcPushTypAvailableCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getPrimarySource().size() < i0+1) { verificationresult.addPrimarySource(); }
				String[] arrayi1 = v.getVrfctnRsltPrimarySrcPushTypAvailableCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getPrimarySource().get(i0).getPushTypeAvailable().size() < i1+1) { verificationresult.getPrimarySource().get(i0).addPushTypeAvailable(); }
					String[] arrayi2 = v.getVrfctnRsltPrimarySrcPushTypAvailableCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(verificationresult.getPrimarySource().get(i0).getPushTypeAvailable().get(i1).getCoding().size() < i2+1) { verificationresult.getPrimarySource().get(i0).getPushTypeAvailable().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {verificationresult.getPrimarySource().get(i0).getPushTypeAvailable().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** VrfctnRslt_PrimarySrc_PushTypAvailable_Cdg_Sys ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcPushTypAvailableCdgSys() != null ) {

			String[] arrayi0 = v.getVrfctnRsltPrimarySrcPushTypAvailableCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getPrimarySource().size() < i0+1) { verificationresult.addPrimarySource(); }
				String[] arrayi1 = v.getVrfctnRsltPrimarySrcPushTypAvailableCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getPrimarySource().get(i0).getPushTypeAvailable().size() < i1+1) { verificationresult.getPrimarySource().get(i0).addPushTypeAvailable(); }
					String[] arrayi2 = v.getVrfctnRsltPrimarySrcPushTypAvailableCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(verificationresult.getPrimarySource().get(i0).getPushTypeAvailable().get(i1).getCoding().size() < i2+1) { verificationresult.getPrimarySource().get(i0).getPushTypeAvailable().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {verificationresult.getPrimarySource().get(i0).getPushTypeAvailable().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** VrfctnRslt_PrimarySrc_PushTypAvailable_Cdg_UsrSltd ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcPushTypAvailableCdgUsrSltd() != null ) {

			String[] arrayi0 = v.getVrfctnRsltPrimarySrcPushTypAvailableCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getPrimarySource().size() < i0+1) { verificationresult.addPrimarySource(); }
				String[] arrayi1 = v.getVrfctnRsltPrimarySrcPushTypAvailableCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getPrimarySource().get(i0).getPushTypeAvailable().size() < i1+1) { verificationresult.getPrimarySource().get(i0).addPushTypeAvailable(); }
					String[] arrayi2 = v.getVrfctnRsltPrimarySrcPushTypAvailableCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(verificationresult.getPrimarySource().get(i0).getPushTypeAvailable().get(i1).getCoding().size() < i2+1) { verificationresult.getPrimarySource().get(i0).getPushTypeAvailable().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {verificationresult.getPrimarySource().get(i0).getPushTypeAvailable().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** VrfctnRslt_PrimarySrc_PushTypAvailable_Cdg_Vrsn ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcPushTypAvailableCdgVrsn() != null ) {

			String[] arrayi0 = v.getVrfctnRsltPrimarySrcPushTypAvailableCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getPrimarySource().size() < i0+1) { verificationresult.addPrimarySource(); }
				String[] arrayi1 = v.getVrfctnRsltPrimarySrcPushTypAvailableCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getPrimarySource().get(i0).getPushTypeAvailable().size() < i1+1) { verificationresult.getPrimarySource().get(i0).addPushTypeAvailable(); }
					String[] arrayi2 = v.getVrfctnRsltPrimarySrcPushTypAvailableCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(verificationresult.getPrimarySource().get(i0).getPushTypeAvailable().get(i1).getCoding().size() < i2+1) { verificationresult.getPrimarySource().get(i0).getPushTypeAvailable().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {verificationresult.getPrimarySource().get(i0).getPushTypeAvailable().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** VrfctnRslt_PrimarySrc_PushTypAvailable_Txt ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcPushTypAvailableTxt() != null ) {

			String[] arrayi0 = v.getVrfctnRsltPrimarySrcPushTypAvailableTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getPrimarySource().size() < i0+1) { verificationresult.addPrimarySource(); }
				String[] arrayi1 = v.getVrfctnRsltPrimarySrcPushTypAvailableTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getPrimarySource().get(i0).getPushTypeAvailable().size() < i1+1) { verificationresult.getPrimarySource().get(i0).addPushTypeAvailable(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {verificationresult.getPrimarySource().get(i0).getPushTypeAvailable().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VrfctnRslt_PrimarySrc_Typ_Cdg_Cd ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcTypCdgCd() != null ) {

			String[] arrayi0 = v.getVrfctnRsltPrimarySrcTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getPrimarySource().size() < i0+1) { verificationresult.addPrimarySource(); }
				String[] arrayi1 = v.getVrfctnRsltPrimarySrcTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getPrimarySource().get(i0).getType().size() < i1+1) { verificationresult.getPrimarySource().get(i0).addType(); }
					String[] arrayi2 = v.getVrfctnRsltPrimarySrcTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(verificationresult.getPrimarySource().get(i0).getType().get(i1).getCoding().size() < i2+1) { verificationresult.getPrimarySource().get(i0).getType().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {verificationresult.getPrimarySource().get(i0).getType().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** VrfctnRslt_PrimarySrc_Typ_Cdg_Dsply ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcTypCdgDsply() != null ) {

			String[] arrayi0 = v.getVrfctnRsltPrimarySrcTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getPrimarySource().size() < i0+1) { verificationresult.addPrimarySource(); }
				String[] arrayi1 = v.getVrfctnRsltPrimarySrcTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getPrimarySource().get(i0).getType().size() < i1+1) { verificationresult.getPrimarySource().get(i0).addType(); }
					String[] arrayi2 = v.getVrfctnRsltPrimarySrcTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(verificationresult.getPrimarySource().get(i0).getType().get(i1).getCoding().size() < i2+1) { verificationresult.getPrimarySource().get(i0).getType().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {verificationresult.getPrimarySource().get(i0).getType().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** VrfctnRslt_PrimarySrc_Typ_Cdg_Sys ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcTypCdgSys() != null ) {

			String[] arrayi0 = v.getVrfctnRsltPrimarySrcTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getPrimarySource().size() < i0+1) { verificationresult.addPrimarySource(); }
				String[] arrayi1 = v.getVrfctnRsltPrimarySrcTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getPrimarySource().get(i0).getType().size() < i1+1) { verificationresult.getPrimarySource().get(i0).addType(); }
					String[] arrayi2 = v.getVrfctnRsltPrimarySrcTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(verificationresult.getPrimarySource().get(i0).getType().get(i1).getCoding().size() < i2+1) { verificationresult.getPrimarySource().get(i0).getType().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {verificationresult.getPrimarySource().get(i0).getType().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** VrfctnRslt_PrimarySrc_Typ_Cdg_UsrSltd ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcTypCdgUsrSltd() != null ) {

			String[] arrayi0 = v.getVrfctnRsltPrimarySrcTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getPrimarySource().size() < i0+1) { verificationresult.addPrimarySource(); }
				String[] arrayi1 = v.getVrfctnRsltPrimarySrcTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getPrimarySource().get(i0).getType().size() < i1+1) { verificationresult.getPrimarySource().get(i0).addType(); }
					String[] arrayi2 = v.getVrfctnRsltPrimarySrcTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(verificationresult.getPrimarySource().get(i0).getType().get(i1).getCoding().size() < i2+1) { verificationresult.getPrimarySource().get(i0).getType().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {verificationresult.getPrimarySource().get(i0).getType().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** VrfctnRslt_PrimarySrc_Typ_Cdg_Vrsn ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcTypCdgVrsn() != null ) {

			String[] arrayi0 = v.getVrfctnRsltPrimarySrcTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getPrimarySource().size() < i0+1) { verificationresult.addPrimarySource(); }
				String[] arrayi1 = v.getVrfctnRsltPrimarySrcTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getPrimarySource().get(i0).getType().size() < i1+1) { verificationresult.getPrimarySource().get(i0).addType(); }
					String[] arrayi2 = v.getVrfctnRsltPrimarySrcTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(verificationresult.getPrimarySource().get(i0).getType().get(i1).getCoding().size() < i2+1) { verificationresult.getPrimarySource().get(i0).getType().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {verificationresult.getPrimarySource().get(i0).getType().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** VrfctnRslt_PrimarySrc_Typ_Txt ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcTypTxt() != null ) {

			String[] arrayi0 = v.getVrfctnRsltPrimarySrcTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getPrimarySource().size() < i0+1) { verificationresult.addPrimarySource(); }
				String[] arrayi1 = v.getVrfctnRsltPrimarySrcTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getPrimarySource().get(i0).getType().size() < i1+1) { verificationresult.getPrimarySource().get(i0).addType(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {verificationresult.getPrimarySource().get(i0).getType().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VrfctnRslt_PrimarySrc_ValidationDt ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcValidationDt() != null ) {

			String[] arrayi0 = v.getVrfctnRsltPrimarySrcValidationDt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getPrimarySource().size() < i0+1) { verificationresult.addPrimarySource(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getPrimarySource().get(i0).setValidationDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VrfctnRslt_PrimarySrc_ValidationSts_Cdg_Cd ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcValidationStsCdgCd() != null ) {

			String[] arrayi0 = v.getVrfctnRsltPrimarySrcValidationStsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getPrimarySource().size() < i0+1) { verificationresult.addPrimarySource(); }
				String[] arrayi1 = v.getVrfctnRsltPrimarySrcValidationStsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getPrimarySource().get(i0).getValidationStatus().getCoding().size() < i1+1) { verificationresult.getPrimarySource().get(i0).getValidationStatus().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {verificationresult.getPrimarySource().get(i0).getValidationStatus().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VrfctnRslt_PrimarySrc_ValidationSts_Cdg_Dsply ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcValidationStsCdgDsply() != null ) {

			String[] arrayi0 = v.getVrfctnRsltPrimarySrcValidationStsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getPrimarySource().size() < i0+1) { verificationresult.addPrimarySource(); }
				String[] arrayi1 = v.getVrfctnRsltPrimarySrcValidationStsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getPrimarySource().get(i0).getValidationStatus().getCoding().size() < i1+1) { verificationresult.getPrimarySource().get(i0).getValidationStatus().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {verificationresult.getPrimarySource().get(i0).getValidationStatus().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VrfctnRslt_PrimarySrc_ValidationSts_Cdg_Sys ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcValidationStsCdgSys() != null ) {

			String[] arrayi0 = v.getVrfctnRsltPrimarySrcValidationStsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getPrimarySource().size() < i0+1) { verificationresult.addPrimarySource(); }
				String[] arrayi1 = v.getVrfctnRsltPrimarySrcValidationStsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getPrimarySource().get(i0).getValidationStatus().getCoding().size() < i1+1) { verificationresult.getPrimarySource().get(i0).getValidationStatus().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {verificationresult.getPrimarySource().get(i0).getValidationStatus().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VrfctnRslt_PrimarySrc_ValidationSts_Cdg_UsrSltd ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcValidationStsCdgUsrSltd() != null ) {

			String[] arrayi0 = v.getVrfctnRsltPrimarySrcValidationStsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getPrimarySource().size() < i0+1) { verificationresult.addPrimarySource(); }
				String[] arrayi1 = v.getVrfctnRsltPrimarySrcValidationStsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getPrimarySource().get(i0).getValidationStatus().getCoding().size() < i1+1) { verificationresult.getPrimarySource().get(i0).getValidationStatus().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {verificationresult.getPrimarySource().get(i0).getValidationStatus().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** VrfctnRslt_PrimarySrc_ValidationSts_Cdg_Vrsn ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcValidationStsCdgVrsn() != null ) {

			String[] arrayi0 = v.getVrfctnRsltPrimarySrcValidationStsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getPrimarySource().size() < i0+1) { verificationresult.addPrimarySource(); }
				String[] arrayi1 = v.getVrfctnRsltPrimarySrcValidationStsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getPrimarySource().get(i0).getValidationStatus().getCoding().size() < i1+1) { verificationresult.getPrimarySource().get(i0).getValidationStatus().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {verificationresult.getPrimarySource().get(i0).getValidationStatus().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VrfctnRslt_PrimarySrc_ValidationSts_Txt ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcValidationStsTxt() != null ) {

			String[] arrayi0 = v.getVrfctnRsltPrimarySrcValidationStsTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getPrimarySource().size() < i0+1) { verificationresult.addPrimarySource(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getPrimarySource().get(i0).getValidationStatus().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VrfctnRslt_PrimarySrc_Who ********************************************************************************/
		if(v.getVrfctnRsltPrimarySrcWho() != null ) {

			String[] arrayi0 = v.getVrfctnRsltPrimarySrcWho().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getPrimarySource().size() < i0+1) { verificationresult.addPrimarySource(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getPrimarySource().get(i0).setWho(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VrfctnRslt_Sts ********************************************************************************/
		if(v.getVrfctnRsltSts() != null ) {

			if(v.getVrfctnRsltSts().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltSts()==null) {} else {
			verificationresult.setStatus(new org.hl7.fhir.r4.model.VerificationResult.StatusEnumFactory().fromCode(v.getVrfctnRsltSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VrfctnRslt_StsDt ********************************************************************************/
		if(v.getVrfctnRsltStsDt() != null ) {

			if(v.getVrfctnRsltStsDt().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltStsDt()==null) {} else {
			verificationresult.setStatusDate(v.getVrfctnRsltStsDt().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltStsDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(v.getVrfctnRsltStsDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** VrfctnRslt_TarLctn ********************************************************************************/
		if(v.getVrfctnRsltTarLctn() != null ) {

				for( String currListStrSplit : v.getVrfctnRsltTarLctn().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			verificationresult.addTargetLocation(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** VrfctnRslt_ValidationProcess_Cdg_Cd ********************************************************************************/
		if(v.getVrfctnRsltValidationProcessCdgCd() != null ) {

			String[] arrayi0 = v.getVrfctnRsltValidationProcessCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getValidationProcess().size() < i0+1) { verificationresult.addValidationProcess(); }
				String[] arrayi1 = v.getVrfctnRsltValidationProcessCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getValidationProcess().get(i0).getCoding().size() < i1+1) { verificationresult.getValidationProcess().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {verificationresult.getValidationProcess().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VrfctnRslt_ValidationProcess_Cdg_Dsply ********************************************************************************/
		if(v.getVrfctnRsltValidationProcessCdgDsply() != null ) {

			String[] arrayi0 = v.getVrfctnRsltValidationProcessCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getValidationProcess().size() < i0+1) { verificationresult.addValidationProcess(); }
				String[] arrayi1 = v.getVrfctnRsltValidationProcessCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getValidationProcess().get(i0).getCoding().size() < i1+1) { verificationresult.getValidationProcess().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {verificationresult.getValidationProcess().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VrfctnRslt_ValidationProcess_Cdg_Sys ********************************************************************************/
		if(v.getVrfctnRsltValidationProcessCdgSys() != null ) {

			String[] arrayi0 = v.getVrfctnRsltValidationProcessCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getValidationProcess().size() < i0+1) { verificationresult.addValidationProcess(); }
				String[] arrayi1 = v.getVrfctnRsltValidationProcessCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getValidationProcess().get(i0).getCoding().size() < i1+1) { verificationresult.getValidationProcess().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {verificationresult.getValidationProcess().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VrfctnRslt_ValidationProcess_Cdg_UsrSltd ********************************************************************************/
		if(v.getVrfctnRsltValidationProcessCdgUsrSltd() != null ) {

			String[] arrayi0 = v.getVrfctnRsltValidationProcessCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getValidationProcess().size() < i0+1) { verificationresult.addValidationProcess(); }
				String[] arrayi1 = v.getVrfctnRsltValidationProcessCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getValidationProcess().get(i0).getCoding().size() < i1+1) { verificationresult.getValidationProcess().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {verificationresult.getValidationProcess().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** VrfctnRslt_ValidationProcess_Cdg_Vrsn ********************************************************************************/
		if(v.getVrfctnRsltValidationProcessCdgVrsn() != null ) {

			String[] arrayi0 = v.getVrfctnRsltValidationProcessCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getValidationProcess().size() < i0+1) { verificationresult.addValidationProcess(); }
				String[] arrayi1 = v.getVrfctnRsltValidationProcessCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getValidationProcess().get(i0).getCoding().size() < i1+1) { verificationresult.getValidationProcess().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {verificationresult.getValidationProcess().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VrfctnRslt_ValidationProcess_Txt ********************************************************************************/
		if(v.getVrfctnRsltValidationProcessTxt() != null ) {

			String[] arrayi0 = v.getVrfctnRsltValidationProcessTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getValidationProcess().size() < i0+1) { verificationresult.addValidationProcess(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getValidationProcess().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VrfctnRslt_ValidationTyp_Cdg_Cd ********************************************************************************/
		if(v.getVrfctnRsltValidationTypCdgCd() != null ) {

			String[] arrayi0 = v.getVrfctnRsltValidationTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getValidationType().getCoding().size() < i0+1) { verificationresult.getValidationType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getValidationType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VrfctnRslt_ValidationTyp_Cdg_Dsply ********************************************************************************/
		if(v.getVrfctnRsltValidationTypCdgDsply() != null ) {

			String[] arrayi0 = v.getVrfctnRsltValidationTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getValidationType().getCoding().size() < i0+1) { verificationresult.getValidationType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getValidationType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VrfctnRslt_ValidationTyp_Cdg_Sys ********************************************************************************/
		if(v.getVrfctnRsltValidationTypCdgSys() != null ) {

			String[] arrayi0 = v.getVrfctnRsltValidationTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getValidationType().getCoding().size() < i0+1) { verificationresult.getValidationType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getValidationType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VrfctnRslt_ValidationTyp_Cdg_UsrSltd ********************************************************************************/
		if(v.getVrfctnRsltValidationTypCdgUsrSltd() != null ) {

			String[] arrayi0 = v.getVrfctnRsltValidationTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getValidationType().getCoding().size() < i0+1) { verificationresult.getValidationType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getValidationType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VrfctnRslt_ValidationTyp_Cdg_Vrsn ********************************************************************************/
		if(v.getVrfctnRsltValidationTypCdgVrsn() != null ) {

			String[] arrayi0 = v.getVrfctnRsltValidationTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getValidationType().getCoding().size() < i0+1) { verificationresult.getValidationType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getValidationType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VrfctnRslt_ValidationTyp_Txt ********************************************************************************/
		if(v.getVrfctnRsltValidationTypTxt() != null ) {

			if(v.getVrfctnRsltValidationTypTxt().replace("[","").replace("]","").equals("NULL") | v.getVrfctnRsltValidationTypTxt()==null) {} else {
			verificationresult.getValidationType().setText(v.getVrfctnRsltValidationTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** VrfctnRslt_Validator_AttestationSignature_Data ********************************************************************************/
		if(v.getVrfctnRsltValidatorAttestationSignatureData() != null ) {

			String[] arrayi0 = v.getVrfctnRsltValidatorAttestationSignatureData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getValidator().size() < i0+1) { verificationresult.addValidator(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getValidator().get(i0).getAttestationSignature().setData(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** VrfctnRslt_Validator_AttestationSignature_OnBehalfOf ********************************************************************************/
		if(v.getVrfctnRsltValidatorAttestationSignatureOnBehalfOf() != null ) {

			String[] arrayi0 = v.getVrfctnRsltValidatorAttestationSignatureOnBehalfOf().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getValidator().size() < i0+1) { verificationresult.addValidator(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getValidator().get(i0).getAttestationSignature().setOnBehalfOf(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VrfctnRslt_Validator_AttestationSignature_SigFrmat ********************************************************************************/
		if(v.getVrfctnRsltValidatorAttestationSignatureSigFrmat() != null ) {

			String[] arrayi0 = v.getVrfctnRsltValidatorAttestationSignatureSigFrmat().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getValidator().size() < i0+1) { verificationresult.addValidator(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getValidator().get(i0).getAttestationSignature().setSigFormat(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VrfctnRslt_Validator_AttestationSignature_TarFrmat ********************************************************************************/
		if(v.getVrfctnRsltValidatorAttestationSignatureTarFrmat() != null ) {

			String[] arrayi0 = v.getVrfctnRsltValidatorAttestationSignatureTarFrmat().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getValidator().size() < i0+1) { verificationresult.addValidator(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getValidator().get(i0).getAttestationSignature().setTargetFormat(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VrfctnRslt_Validator_AttestationSignature_Typ_Cd ********************************************************************************/
		if(v.getVrfctnRsltValidatorAttestationSignatureTypCd() != null ) {

			String[] arrayi0 = v.getVrfctnRsltValidatorAttestationSignatureTypCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getValidator().size() < i0+1) { verificationresult.addValidator(); }
				String[] arrayi1 = v.getVrfctnRsltValidatorAttestationSignatureTypCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getValidator().get(i0).getAttestationSignature().getType().size() < i1+1) { verificationresult.getValidator().get(i0).getAttestationSignature().addType(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {verificationresult.getValidator().get(i0).getAttestationSignature().getType().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VrfctnRslt_Validator_AttestationSignature_Typ_Dsply ********************************************************************************/
		if(v.getVrfctnRsltValidatorAttestationSignatureTypDsply() != null ) {

			String[] arrayi0 = v.getVrfctnRsltValidatorAttestationSignatureTypDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getValidator().size() < i0+1) { verificationresult.addValidator(); }
				String[] arrayi1 = v.getVrfctnRsltValidatorAttestationSignatureTypDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getValidator().get(i0).getAttestationSignature().getType().size() < i1+1) { verificationresult.getValidator().get(i0).getAttestationSignature().addType(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {verificationresult.getValidator().get(i0).getAttestationSignature().getType().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VrfctnRslt_Validator_AttestationSignature_Typ_Sys ********************************************************************************/
		if(v.getVrfctnRsltValidatorAttestationSignatureTypSys() != null ) {

			String[] arrayi0 = v.getVrfctnRsltValidatorAttestationSignatureTypSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getValidator().size() < i0+1) { verificationresult.addValidator(); }
				String[] arrayi1 = v.getVrfctnRsltValidatorAttestationSignatureTypSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getValidator().get(i0).getAttestationSignature().getType().size() < i1+1) { verificationresult.getValidator().get(i0).getAttestationSignature().addType(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {verificationresult.getValidator().get(i0).getAttestationSignature().getType().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VrfctnRslt_Validator_AttestationSignature_Typ_UsrSltd ********************************************************************************/
		if(v.getVrfctnRsltValidatorAttestationSignatureTypUsrSltd() != null ) {

			String[] arrayi0 = v.getVrfctnRsltValidatorAttestationSignatureTypUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getValidator().size() < i0+1) { verificationresult.addValidator(); }
				String[] arrayi1 = v.getVrfctnRsltValidatorAttestationSignatureTypUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getValidator().get(i0).getAttestationSignature().getType().size() < i1+1) { verificationresult.getValidator().get(i0).getAttestationSignature().addType(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {verificationresult.getValidator().get(i0).getAttestationSignature().getType().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** VrfctnRslt_Validator_AttestationSignature_Typ_Vrsn ********************************************************************************/
		if(v.getVrfctnRsltValidatorAttestationSignatureTypVrsn() != null ) {

			String[] arrayi0 = v.getVrfctnRsltValidatorAttestationSignatureTypVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getValidator().size() < i0+1) { verificationresult.addValidator(); }
				String[] arrayi1 = v.getVrfctnRsltValidatorAttestationSignatureTypVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(verificationresult.getValidator().get(i0).getAttestationSignature().getType().size() < i1+1) { verificationresult.getValidator().get(i0).getAttestationSignature().addType(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {verificationresult.getValidator().get(i0).getAttestationSignature().getType().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** VrfctnRslt_Validator_AttestationSignature_When ********************************************************************************/
		if(v.getVrfctnRsltValidatorAttestationSignatureWhen() != null ) {

			String[] arrayi0 = v.getVrfctnRsltValidatorAttestationSignatureWhen().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getValidator().size() < i0+1) { verificationresult.addValidator(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getValidator().get(i0).getAttestationSignature().setWhen(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VrfctnRslt_Validator_AttestationSignature_Who ********************************************************************************/
		if(v.getVrfctnRsltValidatorAttestationSignatureWho() != null ) {

			String[] arrayi0 = v.getVrfctnRsltValidatorAttestationSignatureWho().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getValidator().size() < i0+1) { verificationresult.addValidator(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getValidator().get(i0).getAttestationSignature().setWho(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** VrfctnRslt_Validator_IdentityCertificate ********************************************************************************/
		if(v.getVrfctnRsltValidatorIdentityCertificate() != null ) {

			String[] arrayi0 = v.getVrfctnRsltValidatorIdentityCertificate().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getValidator().size() < i0+1) { verificationresult.addValidator(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getValidator().get(i0).setIdentityCertificate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** VrfctnRslt_Validator_Orgnztn ********************************************************************************/
		if(v.getVrfctnRsltValidatorOrgnztn() != null ) {

			String[] arrayi0 = v.getVrfctnRsltValidatorOrgnztn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(verificationresult.getValidator().size() < i0+1) { verificationresult.addValidator(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {verificationresult.getValidator().get(i0).setOrganization(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		return verificationresult;
	}
}
