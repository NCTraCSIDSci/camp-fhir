package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.VerificationResult;
public class VerificationResultBidirectionalConversion 
{
	public VerificationResult VerificationResults(org.hl7.fhir.r4.model.VerificationResult verificationresult) throws ParseException
	{
		 main.java.com.campfhir.model.VerificationResult v = new  main.java.com.campfhir.model.VerificationResult();

		/******************** id ********************************************************************************/
		v.setId(verificationresult.getIdElement().getIdPart());

		/******************** verificationresultstatus ********************************************************************************/
		org.hl7.fhir.r4.model.VerificationResult.Status verificationresultstatus = verificationresult.getStatus();
		if(verificationresultstatus!=null) {
			v.addVrfctnRsltSts(verificationresultstatus.toCode());
		} else {
			v.addVrfctnRsltSts("NULL");
		}

		/******************** VrfctnRslt_StsDt ********************************************************************************/
		if(verificationresult.hasStatusDate()) {

			v.addVrfctnRsltStsDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(verificationresult.getStatusDate())+"\"");
		} else {
			v.addVrfctnRsltStsDt("NULL");
		}


		/******************** verificationresultvalidationprocess ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> verificationresultvalidationprocesslist = verificationresult.getValidationProcess();
		for(int verificationresultvalidationprocessi = 0; verificationresultvalidationprocessi<verificationresultvalidationprocesslist.size();verificationresultvalidationprocessi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  verificationresultvalidationprocess = verificationresultvalidationprocesslist.get(verificationresultvalidationprocessi);

		/******************** VrfctnRslt_ValidationProcess_Txt ********************************************************************************/
		if(verificationresultvalidationprocessi == 0) {v.addVrfctnRsltValidationProcessTxt("[");}
		if(verificationresultvalidationprocess.hasText()) {

			v.addVrfctnRsltValidationProcessTxt(String.valueOf(verificationresultvalidationprocess.getText()));
		} else {
			v.addVrfctnRsltValidationProcessTxt("NULL");
		}

		if(verificationresultvalidationprocessi == verificationresultvalidationprocesslist.size()-1) {v.addVrfctnRsltValidationProcessTxt("]");}


		/******************** verificationresultvalidationprocesscoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> verificationresultvalidationprocesscodinglist = verificationresultvalidationprocess.getCoding();
		for(int verificationresultvalidationprocesscodingi = 0; verificationresultvalidationprocesscodingi<verificationresultvalidationprocesscodinglist.size();verificationresultvalidationprocesscodingi++ ) {
		org.hl7.fhir.r4.model.Coding  verificationresultvalidationprocesscoding = verificationresultvalidationprocesscodinglist.get(verificationresultvalidationprocesscodingi);

		/******************** VrfctnRslt_ValidationProcess_Cdg_Dsply ********************************************************************************/
		if(verificationresultvalidationprocesscodingi == 0) {v.addVrfctnRsltValidationProcessCdgDsply("[[");}
		if(verificationresultvalidationprocesscoding.hasDisplay()) {

			v.addVrfctnRsltValidationProcessCdgDsply(String.valueOf(verificationresultvalidationprocesscoding.getDisplay()));
		} else {
			v.addVrfctnRsltValidationProcessCdgDsply("NULL");
		}

		if(verificationresultvalidationprocesscodingi == verificationresultvalidationprocesscodinglist.size()-1) {v.addVrfctnRsltValidationProcessCdgDsply("]]");}


		/******************** VrfctnRslt_ValidationProcess_Cdg_Vrsn ********************************************************************************/
		if(verificationresultvalidationprocesscodingi == 0) {v.addVrfctnRsltValidationProcessCdgVrsn("[[");}
		if(verificationresultvalidationprocesscoding.hasVersion()) {

			v.addVrfctnRsltValidationProcessCdgVrsn(String.valueOf(verificationresultvalidationprocesscoding.getVersion()));
		} else {
			v.addVrfctnRsltValidationProcessCdgVrsn("NULL");
		}

		if(verificationresultvalidationprocesscodingi == verificationresultvalidationprocesscodinglist.size()-1) {v.addVrfctnRsltValidationProcessCdgVrsn("]]");}


		/******************** VrfctnRslt_ValidationProcess_Cdg_Cd ********************************************************************************/
		if(verificationresultvalidationprocesscodingi == 0) {v.addVrfctnRsltValidationProcessCdgCd("[[");}
		if(verificationresultvalidationprocesscoding.hasCode()) {

			v.addVrfctnRsltValidationProcessCdgCd(String.valueOf(verificationresultvalidationprocesscoding.getCode()));
		} else {
			v.addVrfctnRsltValidationProcessCdgCd("NULL");
		}

		if(verificationresultvalidationprocesscodingi == verificationresultvalidationprocesscodinglist.size()-1) {v.addVrfctnRsltValidationProcessCdgCd("]]");}


		/******************** VrfctnRslt_ValidationProcess_Cdg_UsrSltd ********************************************************************************/
		if(verificationresultvalidationprocesscodingi == 0) {v.addVrfctnRsltValidationProcessCdgUsrSltd("[[");}
		if(verificationresultvalidationprocesscoding.hasUserSelected()) {

			v.addVrfctnRsltValidationProcessCdgUsrSltd(String.valueOf(verificationresultvalidationprocesscoding.getUserSelected()));
		} else {
			v.addVrfctnRsltValidationProcessCdgUsrSltd("NULL");
		}

		if(verificationresultvalidationprocesscodingi == verificationresultvalidationprocesscodinglist.size()-1) {v.addVrfctnRsltValidationProcessCdgUsrSltd("]]");}


		/******************** VrfctnRslt_ValidationProcess_Cdg_Sys ********************************************************************************/
		if(verificationresultvalidationprocesscodingi == 0) {v.addVrfctnRsltValidationProcessCdgSys("[[");}
		if(verificationresultvalidationprocesscoding.hasSystem()) {

			v.addVrfctnRsltValidationProcessCdgSys(String.valueOf(verificationresultvalidationprocesscoding.getSystem()));
		} else {
			v.addVrfctnRsltValidationProcessCdgSys("NULL");
		}

		if(verificationresultvalidationprocesscodingi == verificationresultvalidationprocesscodinglist.size()-1) {v.addVrfctnRsltValidationProcessCdgSys("]]");}


		 };
		 };
		/******************** VrfctnRslt_TarLctn ********************************************************************************/
		if(verificationresult.hasTargetLocation()) {

			String  array = "[";
			for(int incr=0; incr<verificationresult.getTargetLocation().size(); incr++) {
				array = array + verificationresult.getTargetLocation().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			v.addVrfctnRsltTarLctn(array);

		} else {
			v.addVrfctnRsltTarLctn("NULL");
		}


		/******************** verificationresultneed ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept verificationresultneed = verificationresult.getNeed();

		/******************** VrfctnRslt_Need_Txt ********************************************************************************/
		if(verificationresultneed.hasText()) {

			v.addVrfctnRsltNeedTxt(String.valueOf(verificationresultneed.getText()));
		} else {
			v.addVrfctnRsltNeedTxt("NULL");
		}


		/******************** verificationresultneedcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> verificationresultneedcodinglist = verificationresultneed.getCoding();
		for(int verificationresultneedcodingi = 0; verificationresultneedcodingi<verificationresultneedcodinglist.size();verificationresultneedcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  verificationresultneedcoding = verificationresultneedcodinglist.get(verificationresultneedcodingi);

		/******************** VrfctnRslt_Need_Cdg_Dsply ********************************************************************************/
		if(verificationresultneedcodingi == 0) {v.addVrfctnRsltNeedCdgDsply("[");}
		if(verificationresultneedcoding.hasDisplay()) {

			v.addVrfctnRsltNeedCdgDsply(String.valueOf(verificationresultneedcoding.getDisplay()));
		} else {
			v.addVrfctnRsltNeedCdgDsply("NULL");
		}

		if(verificationresultneedcodingi == verificationresultneedcodinglist.size()-1) {v.addVrfctnRsltNeedCdgDsply("]");}


		/******************** VrfctnRslt_Need_Cdg_Vrsn ********************************************************************************/
		if(verificationresultneedcodingi == 0) {v.addVrfctnRsltNeedCdgVrsn("[");}
		if(verificationresultneedcoding.hasVersion()) {

			v.addVrfctnRsltNeedCdgVrsn(String.valueOf(verificationresultneedcoding.getVersion()));
		} else {
			v.addVrfctnRsltNeedCdgVrsn("NULL");
		}

		if(verificationresultneedcodingi == verificationresultneedcodinglist.size()-1) {v.addVrfctnRsltNeedCdgVrsn("]");}


		/******************** VrfctnRslt_Need_Cdg_Cd ********************************************************************************/
		if(verificationresultneedcodingi == 0) {v.addVrfctnRsltNeedCdgCd("[");}
		if(verificationresultneedcoding.hasCode()) {

			v.addVrfctnRsltNeedCdgCd(String.valueOf(verificationresultneedcoding.getCode()));
		} else {
			v.addVrfctnRsltNeedCdgCd("NULL");
		}

		if(verificationresultneedcodingi == verificationresultneedcodinglist.size()-1) {v.addVrfctnRsltNeedCdgCd("]");}


		/******************** VrfctnRslt_Need_Cdg_UsrSltd ********************************************************************************/
		if(verificationresultneedcodingi == 0) {v.addVrfctnRsltNeedCdgUsrSltd("[");}
		if(verificationresultneedcoding.hasUserSelected()) {

			v.addVrfctnRsltNeedCdgUsrSltd(String.valueOf(verificationresultneedcoding.getUserSelected()));
		} else {
			v.addVrfctnRsltNeedCdgUsrSltd("NULL");
		}

		if(verificationresultneedcodingi == verificationresultneedcodinglist.size()-1) {v.addVrfctnRsltNeedCdgUsrSltd("]");}


		/******************** VrfctnRslt_Need_Cdg_Sys ********************************************************************************/
		if(verificationresultneedcodingi == 0) {v.addVrfctnRsltNeedCdgSys("[");}
		if(verificationresultneedcoding.hasSystem()) {

			v.addVrfctnRsltNeedCdgSys(String.valueOf(verificationresultneedcoding.getSystem()));
		} else {
			v.addVrfctnRsltNeedCdgSys("NULL");
		}

		if(verificationresultneedcodingi == verificationresultneedcodinglist.size()-1) {v.addVrfctnRsltNeedCdgSys("]");}


		 };
		/******************** VrfctnRslt_NextSchdld ********************************************************************************/
		if(verificationresult.hasNextScheduled()) {

			v.addVrfctnRsltNextSchdld("\""+ca.uhn.fhir.util.DateUtils.formatDate(verificationresult.getNextScheduled())+"\"");
		} else {
			v.addVrfctnRsltNextSchdld("NULL");
		}


		/******************** verificationresultfailureaction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept verificationresultfailureaction = verificationresult.getFailureAction();

		/******************** VrfctnRslt_FailureActn_Txt ********************************************************************************/
		if(verificationresultfailureaction.hasText()) {

			v.addVrfctnRsltFailureActnTxt(String.valueOf(verificationresultfailureaction.getText()));
		} else {
			v.addVrfctnRsltFailureActnTxt("NULL");
		}


		/******************** verificationresultfailureactioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> verificationresultfailureactioncodinglist = verificationresultfailureaction.getCoding();
		for(int verificationresultfailureactioncodingi = 0; verificationresultfailureactioncodingi<verificationresultfailureactioncodinglist.size();verificationresultfailureactioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  verificationresultfailureactioncoding = verificationresultfailureactioncodinglist.get(verificationresultfailureactioncodingi);

		/******************** VrfctnRslt_FailureActn_Cdg_Dsply ********************************************************************************/
		if(verificationresultfailureactioncodingi == 0) {v.addVrfctnRsltFailureActnCdgDsply("[");}
		if(verificationresultfailureactioncoding.hasDisplay()) {

			v.addVrfctnRsltFailureActnCdgDsply(String.valueOf(verificationresultfailureactioncoding.getDisplay()));
		} else {
			v.addVrfctnRsltFailureActnCdgDsply("NULL");
		}

		if(verificationresultfailureactioncodingi == verificationresultfailureactioncodinglist.size()-1) {v.addVrfctnRsltFailureActnCdgDsply("]");}


		/******************** VrfctnRslt_FailureActn_Cdg_Vrsn ********************************************************************************/
		if(verificationresultfailureactioncodingi == 0) {v.addVrfctnRsltFailureActnCdgVrsn("[");}
		if(verificationresultfailureactioncoding.hasVersion()) {

			v.addVrfctnRsltFailureActnCdgVrsn(String.valueOf(verificationresultfailureactioncoding.getVersion()));
		} else {
			v.addVrfctnRsltFailureActnCdgVrsn("NULL");
		}

		if(verificationresultfailureactioncodingi == verificationresultfailureactioncodinglist.size()-1) {v.addVrfctnRsltFailureActnCdgVrsn("]");}


		/******************** VrfctnRslt_FailureActn_Cdg_Cd ********************************************************************************/
		if(verificationresultfailureactioncodingi == 0) {v.addVrfctnRsltFailureActnCdgCd("[");}
		if(verificationresultfailureactioncoding.hasCode()) {

			v.addVrfctnRsltFailureActnCdgCd(String.valueOf(verificationresultfailureactioncoding.getCode()));
		} else {
			v.addVrfctnRsltFailureActnCdgCd("NULL");
		}

		if(verificationresultfailureactioncodingi == verificationresultfailureactioncodinglist.size()-1) {v.addVrfctnRsltFailureActnCdgCd("]");}


		/******************** VrfctnRslt_FailureActn_Cdg_UsrSltd ********************************************************************************/
		if(verificationresultfailureactioncodingi == 0) {v.addVrfctnRsltFailureActnCdgUsrSltd("[");}
		if(verificationresultfailureactioncoding.hasUserSelected()) {

			v.addVrfctnRsltFailureActnCdgUsrSltd(String.valueOf(verificationresultfailureactioncoding.getUserSelected()));
		} else {
			v.addVrfctnRsltFailureActnCdgUsrSltd("NULL");
		}

		if(verificationresultfailureactioncodingi == verificationresultfailureactioncodinglist.size()-1) {v.addVrfctnRsltFailureActnCdgUsrSltd("]");}


		/******************** VrfctnRslt_FailureActn_Cdg_Sys ********************************************************************************/
		if(verificationresultfailureactioncodingi == 0) {v.addVrfctnRsltFailureActnCdgSys("[");}
		if(verificationresultfailureactioncoding.hasSystem()) {

			v.addVrfctnRsltFailureActnCdgSys(String.valueOf(verificationresultfailureactioncoding.getSystem()));
		} else {
			v.addVrfctnRsltFailureActnCdgSys("NULL");
		}

		if(verificationresultfailureactioncodingi == verificationresultfailureactioncodinglist.size()-1) {v.addVrfctnRsltFailureActnCdgSys("]");}


		 };
		/******************** verificationresultvalidationtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept verificationresultvalidationtype = verificationresult.getValidationType();

		/******************** VrfctnRslt_ValidationTyp_Txt ********************************************************************************/
		if(verificationresultvalidationtype.hasText()) {

			v.addVrfctnRsltValidationTypTxt(String.valueOf(verificationresultvalidationtype.getText()));
		} else {
			v.addVrfctnRsltValidationTypTxt("NULL");
		}


		/******************** verificationresultvalidationtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> verificationresultvalidationtypecodinglist = verificationresultvalidationtype.getCoding();
		for(int verificationresultvalidationtypecodingi = 0; verificationresultvalidationtypecodingi<verificationresultvalidationtypecodinglist.size();verificationresultvalidationtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  verificationresultvalidationtypecoding = verificationresultvalidationtypecodinglist.get(verificationresultvalidationtypecodingi);

		/******************** VrfctnRslt_ValidationTyp_Cdg_Dsply ********************************************************************************/
		if(verificationresultvalidationtypecodingi == 0) {v.addVrfctnRsltValidationTypCdgDsply("[");}
		if(verificationresultvalidationtypecoding.hasDisplay()) {

			v.addVrfctnRsltValidationTypCdgDsply(String.valueOf(verificationresultvalidationtypecoding.getDisplay()));
		} else {
			v.addVrfctnRsltValidationTypCdgDsply("NULL");
		}

		if(verificationresultvalidationtypecodingi == verificationresultvalidationtypecodinglist.size()-1) {v.addVrfctnRsltValidationTypCdgDsply("]");}


		/******************** VrfctnRslt_ValidationTyp_Cdg_Vrsn ********************************************************************************/
		if(verificationresultvalidationtypecodingi == 0) {v.addVrfctnRsltValidationTypCdgVrsn("[");}
		if(verificationresultvalidationtypecoding.hasVersion()) {

			v.addVrfctnRsltValidationTypCdgVrsn(String.valueOf(verificationresultvalidationtypecoding.getVersion()));
		} else {
			v.addVrfctnRsltValidationTypCdgVrsn("NULL");
		}

		if(verificationresultvalidationtypecodingi == verificationresultvalidationtypecodinglist.size()-1) {v.addVrfctnRsltValidationTypCdgVrsn("]");}


		/******************** VrfctnRslt_ValidationTyp_Cdg_Cd ********************************************************************************/
		if(verificationresultvalidationtypecodingi == 0) {v.addVrfctnRsltValidationTypCdgCd("[");}
		if(verificationresultvalidationtypecoding.hasCode()) {

			v.addVrfctnRsltValidationTypCdgCd(String.valueOf(verificationresultvalidationtypecoding.getCode()));
		} else {
			v.addVrfctnRsltValidationTypCdgCd("NULL");
		}

		if(verificationresultvalidationtypecodingi == verificationresultvalidationtypecodinglist.size()-1) {v.addVrfctnRsltValidationTypCdgCd("]");}


		/******************** VrfctnRslt_ValidationTyp_Cdg_UsrSltd ********************************************************************************/
		if(verificationresultvalidationtypecodingi == 0) {v.addVrfctnRsltValidationTypCdgUsrSltd("[");}
		if(verificationresultvalidationtypecoding.hasUserSelected()) {

			v.addVrfctnRsltValidationTypCdgUsrSltd(String.valueOf(verificationresultvalidationtypecoding.getUserSelected()));
		} else {
			v.addVrfctnRsltValidationTypCdgUsrSltd("NULL");
		}

		if(verificationresultvalidationtypecodingi == verificationresultvalidationtypecodinglist.size()-1) {v.addVrfctnRsltValidationTypCdgUsrSltd("]");}


		/******************** VrfctnRslt_ValidationTyp_Cdg_Sys ********************************************************************************/
		if(verificationresultvalidationtypecodingi == 0) {v.addVrfctnRsltValidationTypCdgSys("[");}
		if(verificationresultvalidationtypecoding.hasSystem()) {

			v.addVrfctnRsltValidationTypCdgSys(String.valueOf(verificationresultvalidationtypecoding.getSystem()));
		} else {
			v.addVrfctnRsltValidationTypCdgSys("NULL");
		}

		if(verificationresultvalidationtypecodingi == verificationresultvalidationtypecodinglist.size()-1) {v.addVrfctnRsltValidationTypCdgSys("]");}


		 };
		/******************** verificationresultfrequency ********************************************************************************/
		org.hl7.fhir.r4.model.Timing verificationresultfrequency = verificationresult.getFrequency();

		/******************** verificationresultfrequencycode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept verificationresultfrequencycode = verificationresultfrequency.getCode();

		/******************** VrfctnRslt_Frqncy_Cd_Txt ********************************************************************************/
		if(verificationresultfrequencycode.hasText()) {

			v.addVrfctnRsltFrqncyCdTxt(String.valueOf(verificationresultfrequencycode.getText()));
		} else {
			v.addVrfctnRsltFrqncyCdTxt("NULL");
		}


		/******************** verificationresultfrequencycodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> verificationresultfrequencycodecodinglist = verificationresultfrequencycode.getCoding();
		for(int verificationresultfrequencycodecodingi = 0; verificationresultfrequencycodecodingi<verificationresultfrequencycodecodinglist.size();verificationresultfrequencycodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  verificationresultfrequencycodecoding = verificationresultfrequencycodecodinglist.get(verificationresultfrequencycodecodingi);

		/******************** VrfctnRslt_Frqncy_Cd_Cdg_Dsply ********************************************************************************/
		if(verificationresultfrequencycodecodingi == 0) {v.addVrfctnRsltFrqncyCdCdgDsply("[");}
		if(verificationresultfrequencycodecoding.hasDisplay()) {

			v.addVrfctnRsltFrqncyCdCdgDsply(String.valueOf(verificationresultfrequencycodecoding.getDisplay()));
		} else {
			v.addVrfctnRsltFrqncyCdCdgDsply("NULL");
		}

		if(verificationresultfrequencycodecodingi == verificationresultfrequencycodecodinglist.size()-1) {v.addVrfctnRsltFrqncyCdCdgDsply("]");}


		/******************** VrfctnRslt_Frqncy_Cd_Cdg_Vrsn ********************************************************************************/
		if(verificationresultfrequencycodecodingi == 0) {v.addVrfctnRsltFrqncyCdCdgVrsn("[");}
		if(verificationresultfrequencycodecoding.hasVersion()) {

			v.addVrfctnRsltFrqncyCdCdgVrsn(String.valueOf(verificationresultfrequencycodecoding.getVersion()));
		} else {
			v.addVrfctnRsltFrqncyCdCdgVrsn("NULL");
		}

		if(verificationresultfrequencycodecodingi == verificationresultfrequencycodecodinglist.size()-1) {v.addVrfctnRsltFrqncyCdCdgVrsn("]");}


		/******************** VrfctnRslt_Frqncy_Cd_Cdg_Cd ********************************************************************************/
		if(verificationresultfrequencycodecodingi == 0) {v.addVrfctnRsltFrqncyCdCdgCd("[");}
		if(verificationresultfrequencycodecoding.hasCode()) {

			v.addVrfctnRsltFrqncyCdCdgCd(String.valueOf(verificationresultfrequencycodecoding.getCode()));
		} else {
			v.addVrfctnRsltFrqncyCdCdgCd("NULL");
		}

		if(verificationresultfrequencycodecodingi == verificationresultfrequencycodecodinglist.size()-1) {v.addVrfctnRsltFrqncyCdCdgCd("]");}


		/******************** VrfctnRslt_Frqncy_Cd_Cdg_UsrSltd ********************************************************************************/
		if(verificationresultfrequencycodecodingi == 0) {v.addVrfctnRsltFrqncyCdCdgUsrSltd("[");}
		if(verificationresultfrequencycodecoding.hasUserSelected()) {

			v.addVrfctnRsltFrqncyCdCdgUsrSltd(String.valueOf(verificationresultfrequencycodecoding.getUserSelected()));
		} else {
			v.addVrfctnRsltFrqncyCdCdgUsrSltd("NULL");
		}

		if(verificationresultfrequencycodecodingi == verificationresultfrequencycodecodinglist.size()-1) {v.addVrfctnRsltFrqncyCdCdgUsrSltd("]");}


		/******************** VrfctnRslt_Frqncy_Cd_Cdg_Sys ********************************************************************************/
		if(verificationresultfrequencycodecodingi == 0) {v.addVrfctnRsltFrqncyCdCdgSys("[");}
		if(verificationresultfrequencycodecoding.hasSystem()) {

			v.addVrfctnRsltFrqncyCdCdgSys(String.valueOf(verificationresultfrequencycodecoding.getSystem()));
		} else {
			v.addVrfctnRsltFrqncyCdCdgSys("NULL");
		}

		if(verificationresultfrequencycodecodingi == verificationresultfrequencycodecodinglist.size()-1) {v.addVrfctnRsltFrqncyCdCdgSys("]");}


		 };
		/******************** VrfctnRslt_Frqncy_Evnt ********************************************************************************/
		if(verificationresultfrequency.hasEvent()) {

			String  array = "[";
			for(int incr=0; incr<verificationresultfrequency.getEvent().size(); incr++) {
				array = array + verificationresultfrequency.getEvent().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			v.addVrfctnRsltFrqncyEvnt(array);

		} else {
			v.addVrfctnRsltFrqncyEvnt("NULL");
		}


		/******************** verificationresultfrequencyrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent verificationresultfrequencyrepeat = verificationresultfrequency.getRepeat();

		/******************** VrfctnRslt_Frqncy_Rpt_Off ********************************************************************************/
		if(verificationresultfrequencyrepeat.hasOffset()) {

			v.addVrfctnRsltFrqncyRptOff(String.valueOf(verificationresultfrequencyrepeat.getOffset()));
		} else {
			v.addVrfctnRsltFrqncyRptOff("NULL");
		}


		/******************** VrfctnRslt_Frqncy_Rpt_Cnt ********************************************************************************/
		if(verificationresultfrequencyrepeat.hasCount()) {

			v.addVrfctnRsltFrqncyRptCnt(String.valueOf(verificationresultfrequencyrepeat.getCount()));
		} else {
			v.addVrfctnRsltFrqncyRptCnt("NULL");
		}


		/******************** VrfctnRslt_Frqncy_Rpt_Prd ********************************************************************************/
		if(verificationresultfrequencyrepeat.hasPeriod()) {

			v.addVrfctnRsltFrqncyRptPrd(String.valueOf(verificationresultfrequencyrepeat.getPeriod()));
		} else {
			v.addVrfctnRsltFrqncyRptPrd("NULL");
		}


		/******************** VrfctnRslt_Frqncy_Rpt_CntMx ********************************************************************************/
		if(verificationresultfrequencyrepeat.hasCountMax()) {

			v.addVrfctnRsltFrqncyRptCntMx(String.valueOf(verificationresultfrequencyrepeat.getCountMax()));
		} else {
			v.addVrfctnRsltFrqncyRptCntMx("NULL");
		}


		/******************** VrfctnRslt_Frqncy_Rpt_DurationMx ********************************************************************************/
		if(verificationresultfrequencyrepeat.hasDurationMax()) {

			v.addVrfctnRsltFrqncyRptDurationMx(String.valueOf(verificationresultfrequencyrepeat.getDurationMax()));
		} else {
			v.addVrfctnRsltFrqncyRptDurationMx("NULL");
		}


		/******************** verificationresultfrequencyrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period verificationresultfrequencyrepeatboundsperiod = verificationresultfrequencyrepeat.getBoundsPeriod();

		/******************** VrfctnRslt_Frqncy_Rpt_BndsPrd_Strt ********************************************************************************/
		if(verificationresultfrequencyrepeatboundsperiod.hasStart()) {

			v.addVrfctnRsltFrqncyRptBndsPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(verificationresultfrequencyrepeatboundsperiod.getStart())+"\"");
		} else {
			v.addVrfctnRsltFrqncyRptBndsPrdStrt("NULL");
		}


		/******************** VrfctnRslt_Frqncy_Rpt_BndsPrd_End ********************************************************************************/
		if(verificationresultfrequencyrepeatboundsperiod.hasEnd()) {

			v.addVrfctnRsltFrqncyRptBndsPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(verificationresultfrequencyrepeatboundsperiod.getEnd())+"\"");
		} else {
			v.addVrfctnRsltFrqncyRptBndsPrdEnd("NULL");
		}


		/******************** verificationresultfrequencyrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime verificationresultfrequencyrepeatdurationunit = verificationresultfrequencyrepeat.getDurationUnit();
		if(verificationresultfrequencyrepeatdurationunit!=null) {
			v.addVrfctnRsltFrqncyRptDurationUnt(verificationresultfrequencyrepeatdurationunit.toCode());
		} else {
			v.addVrfctnRsltFrqncyRptDurationUnt("NULL");
		}

		/******************** verificationresultfrequencyrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration verificationresultfrequencyrepeatboundsduration = verificationresultfrequencyrepeat.getBoundsDuration();

		/******************** VrfctnRslt_Frqncy_Rpt_BndsDuration_Vl ********************************************************************************/
		if(verificationresultfrequencyrepeatboundsduration.hasValue()) {

			v.addVrfctnRsltFrqncyRptBndsDurationVl(String.valueOf(verificationresultfrequencyrepeatboundsduration.getValue()));
		} else {
			v.addVrfctnRsltFrqncyRptBndsDurationVl("NULL");
		}


		/******************** verificationresultfrequencyrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator verificationresultfrequencyrepeatboundsdurationcomparator = verificationresultfrequencyrepeatboundsduration.getComparator();
		if(verificationresultfrequencyrepeatboundsdurationcomparator!=null) {
			v.addVrfctnRsltFrqncyRptBndsDurationCmprtr(verificationresultfrequencyrepeatboundsdurationcomparator.toCode());
		} else {
			v.addVrfctnRsltFrqncyRptBndsDurationCmprtr("NULL");
		}

		/******************** VrfctnRslt_Frqncy_Rpt_BndsDuration_Cd ********************************************************************************/
		if(verificationresultfrequencyrepeatboundsduration.hasCode()) {

			v.addVrfctnRsltFrqncyRptBndsDurationCd(String.valueOf(verificationresultfrequencyrepeatboundsduration.getCode()));
		} else {
			v.addVrfctnRsltFrqncyRptBndsDurationCd("NULL");
		}


		/******************** VrfctnRslt_Frqncy_Rpt_BndsDuration_Unt ********************************************************************************/
		if(verificationresultfrequencyrepeatboundsduration.hasUnit()) {

			v.addVrfctnRsltFrqncyRptBndsDurationUnt(String.valueOf(verificationresultfrequencyrepeatboundsduration.getUnit()));
		} else {
			v.addVrfctnRsltFrqncyRptBndsDurationUnt("NULL");
		}


		/******************** VrfctnRslt_Frqncy_Rpt_BndsDuration_Sys ********************************************************************************/
		if(verificationresultfrequencyrepeatboundsduration.hasSystem()) {

			v.addVrfctnRsltFrqncyRptBndsDurationSys(String.valueOf(verificationresultfrequencyrepeatboundsduration.getSystem()));
		} else {
			v.addVrfctnRsltFrqncyRptBndsDurationSys("NULL");
		}


		/******************** verificationresultfrequencyrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range verificationresultfrequencyrepeatboundsrange = verificationresultfrequencyrepeat.getBoundsRange();

		/******************** verificationresultfrequencyrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity verificationresultfrequencyrepeatboundsrangelow = verificationresultfrequencyrepeatboundsrange.getLow();

		/******************** VrfctnRslt_Frqncy_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(verificationresultfrequencyrepeatboundsrangelow.hasValue()) {

			v.addVrfctnRsltFrqncyRptBndsRngLwVl(String.valueOf(verificationresultfrequencyrepeatboundsrangelow.getValue()));
		} else {
			v.addVrfctnRsltFrqncyRptBndsRngLwVl("NULL");
		}


		/******************** verificationresultfrequencyrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator verificationresultfrequencyrepeatboundsrangelowcomparator = verificationresultfrequencyrepeatboundsrangelow.getComparator();
		if(verificationresultfrequencyrepeatboundsrangelowcomparator!=null) {
			v.addVrfctnRsltFrqncyRptBndsRngLwCmprtr(verificationresultfrequencyrepeatboundsrangelowcomparator.toCode());
		} else {
			v.addVrfctnRsltFrqncyRptBndsRngLwCmprtr("NULL");
		}

		/******************** VrfctnRslt_Frqncy_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(verificationresultfrequencyrepeatboundsrangelow.hasCode()) {

			v.addVrfctnRsltFrqncyRptBndsRngLwCd(String.valueOf(verificationresultfrequencyrepeatboundsrangelow.getCode()));
		} else {
			v.addVrfctnRsltFrqncyRptBndsRngLwCd("NULL");
		}


		/******************** VrfctnRslt_Frqncy_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(verificationresultfrequencyrepeatboundsrangelow.hasUnit()) {

			v.addVrfctnRsltFrqncyRptBndsRngLwUnt(String.valueOf(verificationresultfrequencyrepeatboundsrangelow.getUnit()));
		} else {
			v.addVrfctnRsltFrqncyRptBndsRngLwUnt("NULL");
		}


		/******************** VrfctnRslt_Frqncy_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(verificationresultfrequencyrepeatboundsrangelow.hasSystem()) {

			v.addVrfctnRsltFrqncyRptBndsRngLwSys(String.valueOf(verificationresultfrequencyrepeatboundsrangelow.getSystem()));
		} else {
			v.addVrfctnRsltFrqncyRptBndsRngLwSys("NULL");
		}


		/******************** verificationresultfrequencyrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity verificationresultfrequencyrepeatboundsrangehigh = verificationresultfrequencyrepeatboundsrange.getHigh();

		/******************** VrfctnRslt_Frqncy_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(verificationresultfrequencyrepeatboundsrangehigh.hasValue()) {

			v.addVrfctnRsltFrqncyRptBndsRngHiVl(String.valueOf(verificationresultfrequencyrepeatboundsrangehigh.getValue()));
		} else {
			v.addVrfctnRsltFrqncyRptBndsRngHiVl("NULL");
		}


		/******************** verificationresultfrequencyrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator verificationresultfrequencyrepeatboundsrangehighcomparator = verificationresultfrequencyrepeatboundsrangehigh.getComparator();
		if(verificationresultfrequencyrepeatboundsrangehighcomparator!=null) {
			v.addVrfctnRsltFrqncyRptBndsRngHiCmprtr(verificationresultfrequencyrepeatboundsrangehighcomparator.toCode());
		} else {
			v.addVrfctnRsltFrqncyRptBndsRngHiCmprtr("NULL");
		}

		/******************** VrfctnRslt_Frqncy_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(verificationresultfrequencyrepeatboundsrangehigh.hasCode()) {

			v.addVrfctnRsltFrqncyRptBndsRngHiCd(String.valueOf(verificationresultfrequencyrepeatboundsrangehigh.getCode()));
		} else {
			v.addVrfctnRsltFrqncyRptBndsRngHiCd("NULL");
		}


		/******************** VrfctnRslt_Frqncy_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(verificationresultfrequencyrepeatboundsrangehigh.hasUnit()) {

			v.addVrfctnRsltFrqncyRptBndsRngHiUnt(String.valueOf(verificationresultfrequencyrepeatboundsrangehigh.getUnit()));
		} else {
			v.addVrfctnRsltFrqncyRptBndsRngHiUnt("NULL");
		}


		/******************** VrfctnRslt_Frqncy_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(verificationresultfrequencyrepeatboundsrangehigh.hasSystem()) {

			v.addVrfctnRsltFrqncyRptBndsRngHiSys(String.valueOf(verificationresultfrequencyrepeatboundsrangehigh.getSystem()));
		} else {
			v.addVrfctnRsltFrqncyRptBndsRngHiSys("NULL");
		}


		/******************** VrfctnRslt_Frqncy_Rpt_FrqncyMx ********************************************************************************/
		if(verificationresultfrequencyrepeat.hasFrequencyMax()) {

			v.addVrfctnRsltFrqncyRptFrqncyMx(String.valueOf(verificationresultfrequencyrepeat.getFrequencyMax()));
		} else {
			v.addVrfctnRsltFrqncyRptFrqncyMx("NULL");
		}


		/******************** verificationresultfrequencyrepeatwhen ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>> verificationresultfrequencyrepeatwhenlist = verificationresultfrequencyrepeat.getWhen();
		for(int verificationresultfrequencyrepeatwheni = 0; verificationresultfrequencyrepeatwheni<verificationresultfrequencyrepeatwhenlist.size();verificationresultfrequencyrepeatwheni++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>  verificationresultfrequencyrepeatwhen = verificationresultfrequencyrepeatwhenlist.get(verificationresultfrequencyrepeatwheni);
		if(verificationresultfrequencyrepeatwhen!=null) {
			v.addVrfctnRsltFrqncyRptWhen(verificationresultfrequencyrepeatwhen.getCode());
		} else {
			v.addVrfctnRsltFrqncyRptWhen("NULL");
		}
		 };

		/******************** verificationresultfrequencyrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime verificationresultfrequencyrepeatperiodunit = verificationresultfrequencyrepeat.getPeriodUnit();
		if(verificationresultfrequencyrepeatperiodunit!=null) {
			v.addVrfctnRsltFrqncyRptPrdUnt(verificationresultfrequencyrepeatperiodunit.toCode());
		} else {
			v.addVrfctnRsltFrqncyRptPrdUnt("NULL");
		}

		/******************** VrfctnRslt_Frqncy_Rpt_PrdMx ********************************************************************************/
		if(verificationresultfrequencyrepeat.hasPeriodMax()) {

			v.addVrfctnRsltFrqncyRptPrdMx(String.valueOf(verificationresultfrequencyrepeat.getPeriodMax()));
		} else {
			v.addVrfctnRsltFrqncyRptPrdMx("NULL");
		}


		/******************** verificationresultfrequencyrepeatdayofweek ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>> verificationresultfrequencyrepeatdayofweeklist = verificationresultfrequencyrepeat.getDayOfWeek();
		for(int verificationresultfrequencyrepeatdayofweeki = 0; verificationresultfrequencyrepeatdayofweeki<verificationresultfrequencyrepeatdayofweeklist.size();verificationresultfrequencyrepeatdayofweeki++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>  verificationresultfrequencyrepeatdayofweek = verificationresultfrequencyrepeatdayofweeklist.get(verificationresultfrequencyrepeatdayofweeki);
		if(verificationresultfrequencyrepeatdayofweek!=null) {
			v.addVrfctnRsltFrqncyRptDayOfWeek(verificationresultfrequencyrepeatdayofweek.getCode());
		} else {
			v.addVrfctnRsltFrqncyRptDayOfWeek("NULL");
		}
		 };

		/******************** VrfctnRslt_Frqncy_Rpt_TimeOfDay ********************************************************************************/
		if(verificationresultfrequencyrepeat.hasTimeOfDay()) {

			String  array = "[";
			for(int incr=0; incr<verificationresultfrequencyrepeat.getTimeOfDay().size(); incr++) {
				array = array + verificationresultfrequencyrepeat.getTimeOfDay().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			v.addVrfctnRsltFrqncyRptTimeOfDay(array);

		} else {
			v.addVrfctnRsltFrqncyRptTimeOfDay("NULL");
		}


		/******************** VrfctnRslt_Frqncy_Rpt_Duration ********************************************************************************/
		if(verificationresultfrequencyrepeat.hasDuration()) {

			v.addVrfctnRsltFrqncyRptDuration(String.valueOf(verificationresultfrequencyrepeat.getDuration()));
		} else {
			v.addVrfctnRsltFrqncyRptDuration("NULL");
		}


		/******************** VrfctnRslt_Frqncy_Rpt_Frqncy ********************************************************************************/
		if(verificationresultfrequencyrepeat.hasFrequency()) {

			v.addVrfctnRsltFrqncyRptFrqncy(String.valueOf(verificationresultfrequencyrepeat.getFrequency()));
		} else {
			v.addVrfctnRsltFrqncyRptFrqncy("NULL");
		}


		/******************** VrfctnRslt_LastPerformed ********************************************************************************/
		if(verificationresult.hasLastPerformed()) {

			v.addVrfctnRsltLastPerformed("\""+ca.uhn.fhir.util.DateUtils.formatDate(verificationresult.getLastPerformed())+"\"");
		} else {
			v.addVrfctnRsltLastPerformed("NULL");
		}


		/******************** verificationresultattestation ********************************************************************************/
		org.hl7.fhir.r4.model.VerificationResult.VerificationResultAttestationComponent verificationresultattestation = verificationresult.getAttestation();

		/******************** VrfctnRslt_Attestation_Dt ********************************************************************************/
		if(verificationresultattestation.hasDate()) {

			v.addVrfctnRsltAttestationDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(verificationresultattestation.getDate())+"\"");
		} else {
			v.addVrfctnRsltAttestationDt("NULL");
		}


		/******************** VrfctnRslt_Attestation_SrcIdentityCertificate ********************************************************************************/
		if(verificationresultattestation.hasSourceIdentityCertificate()) {

			v.addVrfctnRsltAttestationSrcIdentityCertificate(String.valueOf(verificationresultattestation.getSourceIdentityCertificate()));
		} else {
			v.addVrfctnRsltAttestationSrcIdentityCertificate("NULL");
		}


		/******************** VrfctnRslt_Attestation_ProxyIdentityCertificate ********************************************************************************/
		if(verificationresultattestation.hasProxyIdentityCertificate()) {

			v.addVrfctnRsltAttestationProxyIdentityCertificate(String.valueOf(verificationresultattestation.getProxyIdentityCertificate()));
		} else {
			v.addVrfctnRsltAttestationProxyIdentityCertificate("NULL");
		}


		/******************** verificationresultattestationcommunicationmethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept verificationresultattestationcommunicationmethod = verificationresultattestation.getCommunicationMethod();

		/******************** VrfctnRslt_Attestation_CmmnctnMthd_Txt ********************************************************************************/
		if(verificationresultattestationcommunicationmethod.hasText()) {

			v.addVrfctnRsltAttestationCmmnctnMthdTxt(String.valueOf(verificationresultattestationcommunicationmethod.getText()));
		} else {
			v.addVrfctnRsltAttestationCmmnctnMthdTxt("NULL");
		}


		/******************** verificationresultattestationcommunicationmethodcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> verificationresultattestationcommunicationmethodcodinglist = verificationresultattestationcommunicationmethod.getCoding();
		for(int verificationresultattestationcommunicationmethodcodingi = 0; verificationresultattestationcommunicationmethodcodingi<verificationresultattestationcommunicationmethodcodinglist.size();verificationresultattestationcommunicationmethodcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  verificationresultattestationcommunicationmethodcoding = verificationresultattestationcommunicationmethodcodinglist.get(verificationresultattestationcommunicationmethodcodingi);

		/******************** VrfctnRslt_Attestation_CmmnctnMthd_Cdg_Dsply ********************************************************************************/
		if(verificationresultattestationcommunicationmethodcodingi == 0) {v.addVrfctnRsltAttestationCmmnctnMthdCdgDsply("[");}
		if(verificationresultattestationcommunicationmethodcoding.hasDisplay()) {

			v.addVrfctnRsltAttestationCmmnctnMthdCdgDsply(String.valueOf(verificationresultattestationcommunicationmethodcoding.getDisplay()));
		} else {
			v.addVrfctnRsltAttestationCmmnctnMthdCdgDsply("NULL");
		}

		if(verificationresultattestationcommunicationmethodcodingi == verificationresultattestationcommunicationmethodcodinglist.size()-1) {v.addVrfctnRsltAttestationCmmnctnMthdCdgDsply("]");}


		/******************** VrfctnRslt_Attestation_CmmnctnMthd_Cdg_Vrsn ********************************************************************************/
		if(verificationresultattestationcommunicationmethodcodingi == 0) {v.addVrfctnRsltAttestationCmmnctnMthdCdgVrsn("[");}
		if(verificationresultattestationcommunicationmethodcoding.hasVersion()) {

			v.addVrfctnRsltAttestationCmmnctnMthdCdgVrsn(String.valueOf(verificationresultattestationcommunicationmethodcoding.getVersion()));
		} else {
			v.addVrfctnRsltAttestationCmmnctnMthdCdgVrsn("NULL");
		}

		if(verificationresultattestationcommunicationmethodcodingi == verificationresultattestationcommunicationmethodcodinglist.size()-1) {v.addVrfctnRsltAttestationCmmnctnMthdCdgVrsn("]");}


		/******************** VrfctnRslt_Attestation_CmmnctnMthd_Cdg_Cd ********************************************************************************/
		if(verificationresultattestationcommunicationmethodcodingi == 0) {v.addVrfctnRsltAttestationCmmnctnMthdCdgCd("[");}
		if(verificationresultattestationcommunicationmethodcoding.hasCode()) {

			v.addVrfctnRsltAttestationCmmnctnMthdCdgCd(String.valueOf(verificationresultattestationcommunicationmethodcoding.getCode()));
		} else {
			v.addVrfctnRsltAttestationCmmnctnMthdCdgCd("NULL");
		}

		if(verificationresultattestationcommunicationmethodcodingi == verificationresultattestationcommunicationmethodcodinglist.size()-1) {v.addVrfctnRsltAttestationCmmnctnMthdCdgCd("]");}


		/******************** VrfctnRslt_Attestation_CmmnctnMthd_Cdg_UsrSltd ********************************************************************************/
		if(verificationresultattestationcommunicationmethodcodingi == 0) {v.addVrfctnRsltAttestationCmmnctnMthdCdgUsrSltd("[");}
		if(verificationresultattestationcommunicationmethodcoding.hasUserSelected()) {

			v.addVrfctnRsltAttestationCmmnctnMthdCdgUsrSltd(String.valueOf(verificationresultattestationcommunicationmethodcoding.getUserSelected()));
		} else {
			v.addVrfctnRsltAttestationCmmnctnMthdCdgUsrSltd("NULL");
		}

		if(verificationresultattestationcommunicationmethodcodingi == verificationresultattestationcommunicationmethodcodinglist.size()-1) {v.addVrfctnRsltAttestationCmmnctnMthdCdgUsrSltd("]");}


		/******************** VrfctnRslt_Attestation_CmmnctnMthd_Cdg_Sys ********************************************************************************/
		if(verificationresultattestationcommunicationmethodcodingi == 0) {v.addVrfctnRsltAttestationCmmnctnMthdCdgSys("[");}
		if(verificationresultattestationcommunicationmethodcoding.hasSystem()) {

			v.addVrfctnRsltAttestationCmmnctnMthdCdgSys(String.valueOf(verificationresultattestationcommunicationmethodcoding.getSystem()));
		} else {
			v.addVrfctnRsltAttestationCmmnctnMthdCdgSys("NULL");
		}

		if(verificationresultattestationcommunicationmethodcodingi == verificationresultattestationcommunicationmethodcodinglist.size()-1) {v.addVrfctnRsltAttestationCmmnctnMthdCdgSys("]");}


		 };
		/******************** verificationresultattestationproxysignature ********************************************************************************/
		org.hl7.fhir.r4.model.Signature verificationresultattestationproxysignature = verificationresultattestation.getProxySignature();

		/******************** verificationresultattestationproxysignaturetype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> verificationresultattestationproxysignaturetypelist = verificationresultattestationproxysignature.getType();
		for(int verificationresultattestationproxysignaturetypei = 0; verificationresultattestationproxysignaturetypei<verificationresultattestationproxysignaturetypelist.size();verificationresultattestationproxysignaturetypei++ ) {
		org.hl7.fhir.r4.model.Coding  verificationresultattestationproxysignaturetype = verificationresultattestationproxysignaturetypelist.get(verificationresultattestationproxysignaturetypei);

		/******************** VrfctnRslt_Attestation_ProxySignature_Typ_Dsply ********************************************************************************/
		if(verificationresultattestationproxysignaturetypei == 0) {v.addVrfctnRsltAttestationProxySignatureTypDsply("[");}
		if(verificationresultattestationproxysignaturetype.hasDisplay()) {

			v.addVrfctnRsltAttestationProxySignatureTypDsply(String.valueOf(verificationresultattestationproxysignaturetype.getDisplay()));
		} else {
			v.addVrfctnRsltAttestationProxySignatureTypDsply("NULL");
		}

		if(verificationresultattestationproxysignaturetypei == verificationresultattestationproxysignaturetypelist.size()-1) {v.addVrfctnRsltAttestationProxySignatureTypDsply("]");}


		/******************** VrfctnRslt_Attestation_ProxySignature_Typ_Vrsn ********************************************************************************/
		if(verificationresultattestationproxysignaturetypei == 0) {v.addVrfctnRsltAttestationProxySignatureTypVrsn("[");}
		if(verificationresultattestationproxysignaturetype.hasVersion()) {

			v.addVrfctnRsltAttestationProxySignatureTypVrsn(String.valueOf(verificationresultattestationproxysignaturetype.getVersion()));
		} else {
			v.addVrfctnRsltAttestationProxySignatureTypVrsn("NULL");
		}

		if(verificationresultattestationproxysignaturetypei == verificationresultattestationproxysignaturetypelist.size()-1) {v.addVrfctnRsltAttestationProxySignatureTypVrsn("]");}


		/******************** VrfctnRslt_Attestation_ProxySignature_Typ_Cd ********************************************************************************/
		if(verificationresultattestationproxysignaturetypei == 0) {v.addVrfctnRsltAttestationProxySignatureTypCd("[");}
		if(verificationresultattestationproxysignaturetype.hasCode()) {

			v.addVrfctnRsltAttestationProxySignatureTypCd(String.valueOf(verificationresultattestationproxysignaturetype.getCode()));
		} else {
			v.addVrfctnRsltAttestationProxySignatureTypCd("NULL");
		}

		if(verificationresultattestationproxysignaturetypei == verificationresultattestationproxysignaturetypelist.size()-1) {v.addVrfctnRsltAttestationProxySignatureTypCd("]");}


		/******************** VrfctnRslt_Attestation_ProxySignature_Typ_UsrSltd ********************************************************************************/
		if(verificationresultattestationproxysignaturetypei == 0) {v.addVrfctnRsltAttestationProxySignatureTypUsrSltd("[");}
		if(verificationresultattestationproxysignaturetype.hasUserSelected()) {

			v.addVrfctnRsltAttestationProxySignatureTypUsrSltd(String.valueOf(verificationresultattestationproxysignaturetype.getUserSelected()));
		} else {
			v.addVrfctnRsltAttestationProxySignatureTypUsrSltd("NULL");
		}

		if(verificationresultattestationproxysignaturetypei == verificationresultattestationproxysignaturetypelist.size()-1) {v.addVrfctnRsltAttestationProxySignatureTypUsrSltd("]");}


		/******************** VrfctnRslt_Attestation_ProxySignature_Typ_Sys ********************************************************************************/
		if(verificationresultattestationproxysignaturetypei == 0) {v.addVrfctnRsltAttestationProxySignatureTypSys("[");}
		if(verificationresultattestationproxysignaturetype.hasSystem()) {

			v.addVrfctnRsltAttestationProxySignatureTypSys(String.valueOf(verificationresultattestationproxysignaturetype.getSystem()));
		} else {
			v.addVrfctnRsltAttestationProxySignatureTypSys("NULL");
		}

		if(verificationresultattestationproxysignaturetypei == verificationresultattestationproxysignaturetypelist.size()-1) {v.addVrfctnRsltAttestationProxySignatureTypSys("]");}


		 };
		/******************** VrfctnRslt_Attestation_ProxySignature_When ********************************************************************************/
		if(verificationresultattestationproxysignature.hasWhen()) {

			v.addVrfctnRsltAttestationProxySignatureWhen("\""+ca.uhn.fhir.util.DateUtils.formatDate(verificationresultattestationproxysignature.getWhen())+"\"");
		} else {
			v.addVrfctnRsltAttestationProxySignatureWhen("NULL");
		}


		/******************** VrfctnRslt_Attestation_ProxySignature_Data ********************************************************************************/
		if(verificationresultattestationproxysignature.hasData()) {

			v.addVrfctnRsltAttestationProxySignatureData(new String(verificationresultattestationproxysignature.getData()));
		} else {
			v.addVrfctnRsltAttestationProxySignatureData("NULL");
		}


		/******************** VrfctnRslt_Attestation_ProxySignature_Who ********************************************************************************/
		if(verificationresultattestationproxysignature.hasWho()) {

			if(verificationresultattestationproxysignature.getWho().getReference() != null) {
			v.addVrfctnRsltAttestationProxySignatureWho(verificationresultattestationproxysignature.getWho().getReference());
			}
		} else {
			v.addVrfctnRsltAttestationProxySignatureWho("NULL");
		}


		/******************** VrfctnRslt_Attestation_ProxySignature_OnBehalfOf ********************************************************************************/
		if(verificationresultattestationproxysignature.hasOnBehalfOf()) {

			if(verificationresultattestationproxysignature.getOnBehalfOf().getReference() != null) {
			v.addVrfctnRsltAttestationProxySignatureOnBehalfOf(verificationresultattestationproxysignature.getOnBehalfOf().getReference());
			}
		} else {
			v.addVrfctnRsltAttestationProxySignatureOnBehalfOf("NULL");
		}


		/******************** VrfctnRslt_Attestation_ProxySignature_SigFrmat ********************************************************************************/
		if(verificationresultattestationproxysignature.hasSigFormat()) {

			v.addVrfctnRsltAttestationProxySignatureSigFrmat(String.valueOf(verificationresultattestationproxysignature.getSigFormat()));
		} else {
			v.addVrfctnRsltAttestationProxySignatureSigFrmat("NULL");
		}


		/******************** VrfctnRslt_Attestation_ProxySignature_TarFrmat ********************************************************************************/
		if(verificationresultattestationproxysignature.hasTargetFormat()) {

			v.addVrfctnRsltAttestationProxySignatureTarFrmat(String.valueOf(verificationresultattestationproxysignature.getTargetFormat()));
		} else {
			v.addVrfctnRsltAttestationProxySignatureTarFrmat("NULL");
		}


		/******************** verificationresultattestationsourcesignature ********************************************************************************/
		org.hl7.fhir.r4.model.Signature verificationresultattestationsourcesignature = verificationresultattestation.getSourceSignature();

		/******************** verificationresultattestationsourcesignaturetype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> verificationresultattestationsourcesignaturetypelist = verificationresultattestationsourcesignature.getType();
		for(int verificationresultattestationsourcesignaturetypei = 0; verificationresultattestationsourcesignaturetypei<verificationresultattestationsourcesignaturetypelist.size();verificationresultattestationsourcesignaturetypei++ ) {
		org.hl7.fhir.r4.model.Coding  verificationresultattestationsourcesignaturetype = verificationresultattestationsourcesignaturetypelist.get(verificationresultattestationsourcesignaturetypei);

		/******************** VrfctnRslt_Attestation_SrcSignature_Typ_Dsply ********************************************************************************/
		if(verificationresultattestationsourcesignaturetypei == 0) {v.addVrfctnRsltAttestationSrcSignatureTypDsply("[");}
		if(verificationresultattestationsourcesignaturetype.hasDisplay()) {

			v.addVrfctnRsltAttestationSrcSignatureTypDsply(String.valueOf(verificationresultattestationsourcesignaturetype.getDisplay()));
		} else {
			v.addVrfctnRsltAttestationSrcSignatureTypDsply("NULL");
		}

		if(verificationresultattestationsourcesignaturetypei == verificationresultattestationsourcesignaturetypelist.size()-1) {v.addVrfctnRsltAttestationSrcSignatureTypDsply("]");}


		/******************** VrfctnRslt_Attestation_SrcSignature_Typ_Vrsn ********************************************************************************/
		if(verificationresultattestationsourcesignaturetypei == 0) {v.addVrfctnRsltAttestationSrcSignatureTypVrsn("[");}
		if(verificationresultattestationsourcesignaturetype.hasVersion()) {

			v.addVrfctnRsltAttestationSrcSignatureTypVrsn(String.valueOf(verificationresultattestationsourcesignaturetype.getVersion()));
		} else {
			v.addVrfctnRsltAttestationSrcSignatureTypVrsn("NULL");
		}

		if(verificationresultattestationsourcesignaturetypei == verificationresultattestationsourcesignaturetypelist.size()-1) {v.addVrfctnRsltAttestationSrcSignatureTypVrsn("]");}


		/******************** VrfctnRslt_Attestation_SrcSignature_Typ_Cd ********************************************************************************/
		if(verificationresultattestationsourcesignaturetypei == 0) {v.addVrfctnRsltAttestationSrcSignatureTypCd("[");}
		if(verificationresultattestationsourcesignaturetype.hasCode()) {

			v.addVrfctnRsltAttestationSrcSignatureTypCd(String.valueOf(verificationresultattestationsourcesignaturetype.getCode()));
		} else {
			v.addVrfctnRsltAttestationSrcSignatureTypCd("NULL");
		}

		if(verificationresultattestationsourcesignaturetypei == verificationresultattestationsourcesignaturetypelist.size()-1) {v.addVrfctnRsltAttestationSrcSignatureTypCd("]");}


		/******************** VrfctnRslt_Attestation_SrcSignature_Typ_UsrSltd ********************************************************************************/
		if(verificationresultattestationsourcesignaturetypei == 0) {v.addVrfctnRsltAttestationSrcSignatureTypUsrSltd("[");}
		if(verificationresultattestationsourcesignaturetype.hasUserSelected()) {

			v.addVrfctnRsltAttestationSrcSignatureTypUsrSltd(String.valueOf(verificationresultattestationsourcesignaturetype.getUserSelected()));
		} else {
			v.addVrfctnRsltAttestationSrcSignatureTypUsrSltd("NULL");
		}

		if(verificationresultattestationsourcesignaturetypei == verificationresultattestationsourcesignaturetypelist.size()-1) {v.addVrfctnRsltAttestationSrcSignatureTypUsrSltd("]");}


		/******************** VrfctnRslt_Attestation_SrcSignature_Typ_Sys ********************************************************************************/
		if(verificationresultattestationsourcesignaturetypei == 0) {v.addVrfctnRsltAttestationSrcSignatureTypSys("[");}
		if(verificationresultattestationsourcesignaturetype.hasSystem()) {

			v.addVrfctnRsltAttestationSrcSignatureTypSys(String.valueOf(verificationresultattestationsourcesignaturetype.getSystem()));
		} else {
			v.addVrfctnRsltAttestationSrcSignatureTypSys("NULL");
		}

		if(verificationresultattestationsourcesignaturetypei == verificationresultattestationsourcesignaturetypelist.size()-1) {v.addVrfctnRsltAttestationSrcSignatureTypSys("]");}


		 };
		/******************** VrfctnRslt_Attestation_SrcSignature_When ********************************************************************************/
		if(verificationresultattestationsourcesignature.hasWhen()) {

			v.addVrfctnRsltAttestationSrcSignatureWhen("\""+ca.uhn.fhir.util.DateUtils.formatDate(verificationresultattestationsourcesignature.getWhen())+"\"");
		} else {
			v.addVrfctnRsltAttestationSrcSignatureWhen("NULL");
		}


		/******************** VrfctnRslt_Attestation_SrcSignature_Data ********************************************************************************/
		if(verificationresultattestationsourcesignature.hasData()) {

			v.addVrfctnRsltAttestationSrcSignatureData(new String(verificationresultattestationsourcesignature.getData()));
		} else {
			v.addVrfctnRsltAttestationSrcSignatureData("NULL");
		}


		/******************** VrfctnRslt_Attestation_SrcSignature_Who ********************************************************************************/
		if(verificationresultattestationsourcesignature.hasWho()) {

			if(verificationresultattestationsourcesignature.getWho().getReference() != null) {
			v.addVrfctnRsltAttestationSrcSignatureWho(verificationresultattestationsourcesignature.getWho().getReference());
			}
		} else {
			v.addVrfctnRsltAttestationSrcSignatureWho("NULL");
		}


		/******************** VrfctnRslt_Attestation_SrcSignature_OnBehalfOf ********************************************************************************/
		if(verificationresultattestationsourcesignature.hasOnBehalfOf()) {

			if(verificationresultattestationsourcesignature.getOnBehalfOf().getReference() != null) {
			v.addVrfctnRsltAttestationSrcSignatureOnBehalfOf(verificationresultattestationsourcesignature.getOnBehalfOf().getReference());
			}
		} else {
			v.addVrfctnRsltAttestationSrcSignatureOnBehalfOf("NULL");
		}


		/******************** VrfctnRslt_Attestation_SrcSignature_SigFrmat ********************************************************************************/
		if(verificationresultattestationsourcesignature.hasSigFormat()) {

			v.addVrfctnRsltAttestationSrcSignatureSigFrmat(String.valueOf(verificationresultattestationsourcesignature.getSigFormat()));
		} else {
			v.addVrfctnRsltAttestationSrcSignatureSigFrmat("NULL");
		}


		/******************** VrfctnRslt_Attestation_SrcSignature_TarFrmat ********************************************************************************/
		if(verificationresultattestationsourcesignature.hasTargetFormat()) {

			v.addVrfctnRsltAttestationSrcSignatureTarFrmat(String.valueOf(verificationresultattestationsourcesignature.getTargetFormat()));
		} else {
			v.addVrfctnRsltAttestationSrcSignatureTarFrmat("NULL");
		}


		/******************** VrfctnRslt_Attestation_Who ********************************************************************************/
		if(verificationresultattestation.hasWho()) {

			if(verificationresultattestation.getWho().getReference() != null) {
			v.addVrfctnRsltAttestationWho(verificationresultattestation.getWho().getReference());
			}
		} else {
			v.addVrfctnRsltAttestationWho("NULL");
		}


		/******************** VrfctnRslt_Attestation_OnBehalfOf ********************************************************************************/
		if(verificationresultattestation.hasOnBehalfOf()) {

			if(verificationresultattestation.getOnBehalfOf().getReference() != null) {
			v.addVrfctnRsltAttestationOnBehalfOf(verificationresultattestation.getOnBehalfOf().getReference());
			}
		} else {
			v.addVrfctnRsltAttestationOnBehalfOf("NULL");
		}


		/******************** verificationresultvalidator ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.VerificationResult.VerificationResultValidatorComponent> verificationresultvalidatorlist = verificationresult.getValidator();
		for(int verificationresultvalidatori = 0; verificationresultvalidatori<verificationresultvalidatorlist.size();verificationresultvalidatori++ ) {
		org.hl7.fhir.r4.model.VerificationResult.VerificationResultValidatorComponent  verificationresultvalidator = verificationresultvalidatorlist.get(verificationresultvalidatori);

		/******************** verificationresultvalidatorattestationsignature ********************************************************************************/
		org.hl7.fhir.r4.model.Signature verificationresultvalidatorattestationsignature = verificationresultvalidator.getAttestationSignature();

		/******************** verificationresultvalidatorattestationsignaturetype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> verificationresultvalidatorattestationsignaturetypelist = verificationresultvalidatorattestationsignature.getType();
		for(int verificationresultvalidatorattestationsignaturetypei = 0; verificationresultvalidatorattestationsignaturetypei<verificationresultvalidatorattestationsignaturetypelist.size();verificationresultvalidatorattestationsignaturetypei++ ) {
		org.hl7.fhir.r4.model.Coding  verificationresultvalidatorattestationsignaturetype = verificationresultvalidatorattestationsignaturetypelist.get(verificationresultvalidatorattestationsignaturetypei);

		/******************** VrfctnRslt_Validator_AttestationSignature_Typ_Dsply ********************************************************************************/
		if(verificationresultvalidatorattestationsignaturetypei == 0) {v.addVrfctnRsltValidatorAttestationSignatureTypDsply("[[");}
		if(verificationresultvalidatorattestationsignaturetype.hasDisplay()) {

			v.addVrfctnRsltValidatorAttestationSignatureTypDsply(String.valueOf(verificationresultvalidatorattestationsignaturetype.getDisplay()));
		} else {
			v.addVrfctnRsltValidatorAttestationSignatureTypDsply("NULL");
		}

		if(verificationresultvalidatorattestationsignaturetypei == verificationresultvalidatorattestationsignaturetypelist.size()-1) {v.addVrfctnRsltValidatorAttestationSignatureTypDsply("]]");}


		/******************** VrfctnRslt_Validator_AttestationSignature_Typ_Vrsn ********************************************************************************/
		if(verificationresultvalidatorattestationsignaturetypei == 0) {v.addVrfctnRsltValidatorAttestationSignatureTypVrsn("[[");}
		if(verificationresultvalidatorattestationsignaturetype.hasVersion()) {

			v.addVrfctnRsltValidatorAttestationSignatureTypVrsn(String.valueOf(verificationresultvalidatorattestationsignaturetype.getVersion()));
		} else {
			v.addVrfctnRsltValidatorAttestationSignatureTypVrsn("NULL");
		}

		if(verificationresultvalidatorattestationsignaturetypei == verificationresultvalidatorattestationsignaturetypelist.size()-1) {v.addVrfctnRsltValidatorAttestationSignatureTypVrsn("]]");}


		/******************** VrfctnRslt_Validator_AttestationSignature_Typ_Cd ********************************************************************************/
		if(verificationresultvalidatorattestationsignaturetypei == 0) {v.addVrfctnRsltValidatorAttestationSignatureTypCd("[[");}
		if(verificationresultvalidatorattestationsignaturetype.hasCode()) {

			v.addVrfctnRsltValidatorAttestationSignatureTypCd(String.valueOf(verificationresultvalidatorattestationsignaturetype.getCode()));
		} else {
			v.addVrfctnRsltValidatorAttestationSignatureTypCd("NULL");
		}

		if(verificationresultvalidatorattestationsignaturetypei == verificationresultvalidatorattestationsignaturetypelist.size()-1) {v.addVrfctnRsltValidatorAttestationSignatureTypCd("]]");}


		/******************** VrfctnRslt_Validator_AttestationSignature_Typ_UsrSltd ********************************************************************************/
		if(verificationresultvalidatorattestationsignaturetypei == 0) {v.addVrfctnRsltValidatorAttestationSignatureTypUsrSltd("[[");}
		if(verificationresultvalidatorattestationsignaturetype.hasUserSelected()) {

			v.addVrfctnRsltValidatorAttestationSignatureTypUsrSltd(String.valueOf(verificationresultvalidatorattestationsignaturetype.getUserSelected()));
		} else {
			v.addVrfctnRsltValidatorAttestationSignatureTypUsrSltd("NULL");
		}

		if(verificationresultvalidatorattestationsignaturetypei == verificationresultvalidatorattestationsignaturetypelist.size()-1) {v.addVrfctnRsltValidatorAttestationSignatureTypUsrSltd("]]");}


		/******************** VrfctnRslt_Validator_AttestationSignature_Typ_Sys ********************************************************************************/
		if(verificationresultvalidatorattestationsignaturetypei == 0) {v.addVrfctnRsltValidatorAttestationSignatureTypSys("[[");}
		if(verificationresultvalidatorattestationsignaturetype.hasSystem()) {

			v.addVrfctnRsltValidatorAttestationSignatureTypSys(String.valueOf(verificationresultvalidatorattestationsignaturetype.getSystem()));
		} else {
			v.addVrfctnRsltValidatorAttestationSignatureTypSys("NULL");
		}

		if(verificationresultvalidatorattestationsignaturetypei == verificationresultvalidatorattestationsignaturetypelist.size()-1) {v.addVrfctnRsltValidatorAttestationSignatureTypSys("]]");}


		 };
		/******************** VrfctnRslt_Validator_AttestationSignature_When ********************************************************************************/
		if(verificationresultvalidatorattestationsignature.hasWhen()) {

			v.addVrfctnRsltValidatorAttestationSignatureWhen("\""+ca.uhn.fhir.util.DateUtils.formatDate(verificationresultvalidatorattestationsignature.getWhen())+"\"");
		} else {
			v.addVrfctnRsltValidatorAttestationSignatureWhen("NULL");
		}


		/******************** VrfctnRslt_Validator_AttestationSignature_Data ********************************************************************************/
		if(verificationresultvalidatorattestationsignature.hasData()) {

			v.addVrfctnRsltValidatorAttestationSignatureData(new String(verificationresultvalidatorattestationsignature.getData()));
		} else {
			v.addVrfctnRsltValidatorAttestationSignatureData("NULL");
		}


		/******************** VrfctnRslt_Validator_AttestationSignature_Who ********************************************************************************/
		if(verificationresultvalidatorattestationsignature.hasWho()) {

			if(verificationresultvalidatorattestationsignature.getWho().getReference() != null) {
			v.addVrfctnRsltValidatorAttestationSignatureWho(verificationresultvalidatorattestationsignature.getWho().getReference());
			}
		} else {
			v.addVrfctnRsltValidatorAttestationSignatureWho("NULL");
		}


		/******************** VrfctnRslt_Validator_AttestationSignature_OnBehalfOf ********************************************************************************/
		if(verificationresultvalidatorattestationsignature.hasOnBehalfOf()) {

			if(verificationresultvalidatorattestationsignature.getOnBehalfOf().getReference() != null) {
			v.addVrfctnRsltValidatorAttestationSignatureOnBehalfOf(verificationresultvalidatorattestationsignature.getOnBehalfOf().getReference());
			}
		} else {
			v.addVrfctnRsltValidatorAttestationSignatureOnBehalfOf("NULL");
		}


		/******************** VrfctnRslt_Validator_AttestationSignature_SigFrmat ********************************************************************************/
		if(verificationresultvalidatorattestationsignature.hasSigFormat()) {

			v.addVrfctnRsltValidatorAttestationSignatureSigFrmat(String.valueOf(verificationresultvalidatorattestationsignature.getSigFormat()));
		} else {
			v.addVrfctnRsltValidatorAttestationSignatureSigFrmat("NULL");
		}


		/******************** VrfctnRslt_Validator_AttestationSignature_TarFrmat ********************************************************************************/
		if(verificationresultvalidatorattestationsignature.hasTargetFormat()) {

			v.addVrfctnRsltValidatorAttestationSignatureTarFrmat(String.valueOf(verificationresultvalidatorattestationsignature.getTargetFormat()));
		} else {
			v.addVrfctnRsltValidatorAttestationSignatureTarFrmat("NULL");
		}


		/******************** VrfctnRslt_Validator_IdentityCertificate ********************************************************************************/
		if(verificationresultvalidatori == 0) {v.addVrfctnRsltValidatorIdentityCertificate("[");}
		if(verificationresultvalidator.hasIdentityCertificate()) {

			v.addVrfctnRsltValidatorIdentityCertificate(String.valueOf(verificationresultvalidator.getIdentityCertificate()));
		} else {
			v.addVrfctnRsltValidatorIdentityCertificate("NULL");
		}

		if(verificationresultvalidatori == verificationresultvalidatorlist.size()-1) {v.addVrfctnRsltValidatorIdentityCertificate("]");}


		/******************** VrfctnRslt_Validator_Orgnztn ********************************************************************************/
		if(verificationresultvalidatori == 0) {v.addVrfctnRsltValidatorOrgnztn("[");}
		if(verificationresultvalidator.hasOrganization()) {

			if(verificationresultvalidator.getOrganization().getReference() != null) {
			v.addVrfctnRsltValidatorOrgnztn(verificationresultvalidator.getOrganization().getReference());
			}
		} else {
			v.addVrfctnRsltValidatorOrgnztn("NULL");
		}

		if(verificationresultvalidatori == verificationresultvalidatorlist.size()-1) {v.addVrfctnRsltValidatorOrgnztn("]");}


		 };
		/******************** verificationresultprimarysource ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.VerificationResult.VerificationResultPrimarySourceComponent> verificationresultprimarysourcelist = verificationresult.getPrimarySource();
		for(int verificationresultprimarysourcei = 0; verificationresultprimarysourcei<verificationresultprimarysourcelist.size();verificationresultprimarysourcei++ ) {
		org.hl7.fhir.r4.model.VerificationResult.VerificationResultPrimarySourceComponent  verificationresultprimarysource = verificationresultprimarysourcelist.get(verificationresultprimarysourcei);

		/******************** verificationresultprimarysourcetype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> verificationresultprimarysourcetypelist = verificationresultprimarysource.getType();
		for(int verificationresultprimarysourcetypei = 0; verificationresultprimarysourcetypei<verificationresultprimarysourcetypelist.size();verificationresultprimarysourcetypei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  verificationresultprimarysourcetype = verificationresultprimarysourcetypelist.get(verificationresultprimarysourcetypei);

		/******************** VrfctnRslt_PrimarySrc_Typ_Txt ********************************************************************************/
		if(verificationresultprimarysourcetypei == 0) {v.addVrfctnRsltPrimarySrcTypTxt("[[");}
		if(verificationresultprimarysourcetype.hasText()) {

			v.addVrfctnRsltPrimarySrcTypTxt(String.valueOf(verificationresultprimarysourcetype.getText()));
		} else {
			v.addVrfctnRsltPrimarySrcTypTxt("NULL");
		}

		if(verificationresultprimarysourcetypei == verificationresultprimarysourcetypelist.size()-1) {v.addVrfctnRsltPrimarySrcTypTxt("]]");}


		/******************** verificationresultprimarysourcetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> verificationresultprimarysourcetypecodinglist = verificationresultprimarysourcetype.getCoding();
		for(int verificationresultprimarysourcetypecodingi = 0; verificationresultprimarysourcetypecodingi<verificationresultprimarysourcetypecodinglist.size();verificationresultprimarysourcetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  verificationresultprimarysourcetypecoding = verificationresultprimarysourcetypecodinglist.get(verificationresultprimarysourcetypecodingi);

		/******************** VrfctnRslt_PrimarySrc_Typ_Cdg_Dsply ********************************************************************************/
		if(verificationresultprimarysourcetypecodingi == 0) {v.addVrfctnRsltPrimarySrcTypCdgDsply("[[[");}
		if(verificationresultprimarysourcetypecoding.hasDisplay()) {

			v.addVrfctnRsltPrimarySrcTypCdgDsply(String.valueOf(verificationresultprimarysourcetypecoding.getDisplay()));
		} else {
			v.addVrfctnRsltPrimarySrcTypCdgDsply("NULL");
		}

		if(verificationresultprimarysourcetypecodingi == verificationresultprimarysourcetypecodinglist.size()-1) {v.addVrfctnRsltPrimarySrcTypCdgDsply("]]]");}


		/******************** VrfctnRslt_PrimarySrc_Typ_Cdg_Vrsn ********************************************************************************/
		if(verificationresultprimarysourcetypecodingi == 0) {v.addVrfctnRsltPrimarySrcTypCdgVrsn("[[[");}
		if(verificationresultprimarysourcetypecoding.hasVersion()) {

			v.addVrfctnRsltPrimarySrcTypCdgVrsn(String.valueOf(verificationresultprimarysourcetypecoding.getVersion()));
		} else {
			v.addVrfctnRsltPrimarySrcTypCdgVrsn("NULL");
		}

		if(verificationresultprimarysourcetypecodingi == verificationresultprimarysourcetypecodinglist.size()-1) {v.addVrfctnRsltPrimarySrcTypCdgVrsn("]]]");}


		/******************** VrfctnRslt_PrimarySrc_Typ_Cdg_Cd ********************************************************************************/
		if(verificationresultprimarysourcetypecodingi == 0) {v.addVrfctnRsltPrimarySrcTypCdgCd("[[[");}
		if(verificationresultprimarysourcetypecoding.hasCode()) {

			v.addVrfctnRsltPrimarySrcTypCdgCd(String.valueOf(verificationresultprimarysourcetypecoding.getCode()));
		} else {
			v.addVrfctnRsltPrimarySrcTypCdgCd("NULL");
		}

		if(verificationresultprimarysourcetypecodingi == verificationresultprimarysourcetypecodinglist.size()-1) {v.addVrfctnRsltPrimarySrcTypCdgCd("]]]");}


		/******************** VrfctnRslt_PrimarySrc_Typ_Cdg_UsrSltd ********************************************************************************/
		if(verificationresultprimarysourcetypecodingi == 0) {v.addVrfctnRsltPrimarySrcTypCdgUsrSltd("[[[");}
		if(verificationresultprimarysourcetypecoding.hasUserSelected()) {

			v.addVrfctnRsltPrimarySrcTypCdgUsrSltd(String.valueOf(verificationresultprimarysourcetypecoding.getUserSelected()));
		} else {
			v.addVrfctnRsltPrimarySrcTypCdgUsrSltd("NULL");
		}

		if(verificationresultprimarysourcetypecodingi == verificationresultprimarysourcetypecodinglist.size()-1) {v.addVrfctnRsltPrimarySrcTypCdgUsrSltd("]]]");}


		/******************** VrfctnRslt_PrimarySrc_Typ_Cdg_Sys ********************************************************************************/
		if(verificationresultprimarysourcetypecodingi == 0) {v.addVrfctnRsltPrimarySrcTypCdgSys("[[[");}
		if(verificationresultprimarysourcetypecoding.hasSystem()) {

			v.addVrfctnRsltPrimarySrcTypCdgSys(String.valueOf(verificationresultprimarysourcetypecoding.getSystem()));
		} else {
			v.addVrfctnRsltPrimarySrcTypCdgSys("NULL");
		}

		if(verificationresultprimarysourcetypecodingi == verificationresultprimarysourcetypecodinglist.size()-1) {v.addVrfctnRsltPrimarySrcTypCdgSys("]]]");}


		 };
		 };
		/******************** verificationresultprimarysourcevalidationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept verificationresultprimarysourcevalidationstatus = verificationresultprimarysource.getValidationStatus();

		/******************** VrfctnRslt_PrimarySrc_ValidationSts_Txt ********************************************************************************/
		if(verificationresultprimarysourcevalidationstatus.hasText()) {

			v.addVrfctnRsltPrimarySrcValidationStsTxt(String.valueOf(verificationresultprimarysourcevalidationstatus.getText()));
		} else {
			v.addVrfctnRsltPrimarySrcValidationStsTxt("NULL");
		}


		/******************** verificationresultprimarysourcevalidationstatuscoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> verificationresultprimarysourcevalidationstatuscodinglist = verificationresultprimarysourcevalidationstatus.getCoding();
		for(int verificationresultprimarysourcevalidationstatuscodingi = 0; verificationresultprimarysourcevalidationstatuscodingi<verificationresultprimarysourcevalidationstatuscodinglist.size();verificationresultprimarysourcevalidationstatuscodingi++ ) {
		org.hl7.fhir.r4.model.Coding  verificationresultprimarysourcevalidationstatuscoding = verificationresultprimarysourcevalidationstatuscodinglist.get(verificationresultprimarysourcevalidationstatuscodingi);

		/******************** VrfctnRslt_PrimarySrc_ValidationSts_Cdg_Dsply ********************************************************************************/
		if(verificationresultprimarysourcevalidationstatuscodingi == 0) {v.addVrfctnRsltPrimarySrcValidationStsCdgDsply("[[");}
		if(verificationresultprimarysourcevalidationstatuscoding.hasDisplay()) {

			v.addVrfctnRsltPrimarySrcValidationStsCdgDsply(String.valueOf(verificationresultprimarysourcevalidationstatuscoding.getDisplay()));
		} else {
			v.addVrfctnRsltPrimarySrcValidationStsCdgDsply("NULL");
		}

		if(verificationresultprimarysourcevalidationstatuscodingi == verificationresultprimarysourcevalidationstatuscodinglist.size()-1) {v.addVrfctnRsltPrimarySrcValidationStsCdgDsply("]]");}


		/******************** VrfctnRslt_PrimarySrc_ValidationSts_Cdg_Vrsn ********************************************************************************/
		if(verificationresultprimarysourcevalidationstatuscodingi == 0) {v.addVrfctnRsltPrimarySrcValidationStsCdgVrsn("[[");}
		if(verificationresultprimarysourcevalidationstatuscoding.hasVersion()) {

			v.addVrfctnRsltPrimarySrcValidationStsCdgVrsn(String.valueOf(verificationresultprimarysourcevalidationstatuscoding.getVersion()));
		} else {
			v.addVrfctnRsltPrimarySrcValidationStsCdgVrsn("NULL");
		}

		if(verificationresultprimarysourcevalidationstatuscodingi == verificationresultprimarysourcevalidationstatuscodinglist.size()-1) {v.addVrfctnRsltPrimarySrcValidationStsCdgVrsn("]]");}


		/******************** VrfctnRslt_PrimarySrc_ValidationSts_Cdg_Cd ********************************************************************************/
		if(verificationresultprimarysourcevalidationstatuscodingi == 0) {v.addVrfctnRsltPrimarySrcValidationStsCdgCd("[[");}
		if(verificationresultprimarysourcevalidationstatuscoding.hasCode()) {

			v.addVrfctnRsltPrimarySrcValidationStsCdgCd(String.valueOf(verificationresultprimarysourcevalidationstatuscoding.getCode()));
		} else {
			v.addVrfctnRsltPrimarySrcValidationStsCdgCd("NULL");
		}

		if(verificationresultprimarysourcevalidationstatuscodingi == verificationresultprimarysourcevalidationstatuscodinglist.size()-1) {v.addVrfctnRsltPrimarySrcValidationStsCdgCd("]]");}


		/******************** VrfctnRslt_PrimarySrc_ValidationSts_Cdg_UsrSltd ********************************************************************************/
		if(verificationresultprimarysourcevalidationstatuscodingi == 0) {v.addVrfctnRsltPrimarySrcValidationStsCdgUsrSltd("[[");}
		if(verificationresultprimarysourcevalidationstatuscoding.hasUserSelected()) {

			v.addVrfctnRsltPrimarySrcValidationStsCdgUsrSltd(String.valueOf(verificationresultprimarysourcevalidationstatuscoding.getUserSelected()));
		} else {
			v.addVrfctnRsltPrimarySrcValidationStsCdgUsrSltd("NULL");
		}

		if(verificationresultprimarysourcevalidationstatuscodingi == verificationresultprimarysourcevalidationstatuscodinglist.size()-1) {v.addVrfctnRsltPrimarySrcValidationStsCdgUsrSltd("]]");}


		/******************** VrfctnRslt_PrimarySrc_ValidationSts_Cdg_Sys ********************************************************************************/
		if(verificationresultprimarysourcevalidationstatuscodingi == 0) {v.addVrfctnRsltPrimarySrcValidationStsCdgSys("[[");}
		if(verificationresultprimarysourcevalidationstatuscoding.hasSystem()) {

			v.addVrfctnRsltPrimarySrcValidationStsCdgSys(String.valueOf(verificationresultprimarysourcevalidationstatuscoding.getSystem()));
		} else {
			v.addVrfctnRsltPrimarySrcValidationStsCdgSys("NULL");
		}

		if(verificationresultprimarysourcevalidationstatuscodingi == verificationresultprimarysourcevalidationstatuscodinglist.size()-1) {v.addVrfctnRsltPrimarySrcValidationStsCdgSys("]]");}


		 };
		/******************** verificationresultprimarysourcepushtypeavailable ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> verificationresultprimarysourcepushtypeavailablelist = verificationresultprimarysource.getPushTypeAvailable();
		for(int verificationresultprimarysourcepushtypeavailablei = 0; verificationresultprimarysourcepushtypeavailablei<verificationresultprimarysourcepushtypeavailablelist.size();verificationresultprimarysourcepushtypeavailablei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  verificationresultprimarysourcepushtypeavailable = verificationresultprimarysourcepushtypeavailablelist.get(verificationresultprimarysourcepushtypeavailablei);

		/******************** VrfctnRslt_PrimarySrc_PushTypAvailable_Txt ********************************************************************************/
		if(verificationresultprimarysourcepushtypeavailablei == 0) {v.addVrfctnRsltPrimarySrcPushTypAvailableTxt("[[");}
		if(verificationresultprimarysourcepushtypeavailable.hasText()) {

			v.addVrfctnRsltPrimarySrcPushTypAvailableTxt(String.valueOf(verificationresultprimarysourcepushtypeavailable.getText()));
		} else {
			v.addVrfctnRsltPrimarySrcPushTypAvailableTxt("NULL");
		}

		if(verificationresultprimarysourcepushtypeavailablei == verificationresultprimarysourcepushtypeavailablelist.size()-1) {v.addVrfctnRsltPrimarySrcPushTypAvailableTxt("]]");}


		/******************** verificationresultprimarysourcepushtypeavailablecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> verificationresultprimarysourcepushtypeavailablecodinglist = verificationresultprimarysourcepushtypeavailable.getCoding();
		for(int verificationresultprimarysourcepushtypeavailablecodingi = 0; verificationresultprimarysourcepushtypeavailablecodingi<verificationresultprimarysourcepushtypeavailablecodinglist.size();verificationresultprimarysourcepushtypeavailablecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  verificationresultprimarysourcepushtypeavailablecoding = verificationresultprimarysourcepushtypeavailablecodinglist.get(verificationresultprimarysourcepushtypeavailablecodingi);

		/******************** VrfctnRslt_PrimarySrc_PushTypAvailable_Cdg_Dsply ********************************************************************************/
		if(verificationresultprimarysourcepushtypeavailablecodingi == 0) {v.addVrfctnRsltPrimarySrcPushTypAvailableCdgDsply("[[[");}
		if(verificationresultprimarysourcepushtypeavailablecoding.hasDisplay()) {

			v.addVrfctnRsltPrimarySrcPushTypAvailableCdgDsply(String.valueOf(verificationresultprimarysourcepushtypeavailablecoding.getDisplay()));
		} else {
			v.addVrfctnRsltPrimarySrcPushTypAvailableCdgDsply("NULL");
		}

		if(verificationresultprimarysourcepushtypeavailablecodingi == verificationresultprimarysourcepushtypeavailablecodinglist.size()-1) {v.addVrfctnRsltPrimarySrcPushTypAvailableCdgDsply("]]]");}


		/******************** VrfctnRslt_PrimarySrc_PushTypAvailable_Cdg_Vrsn ********************************************************************************/
		if(verificationresultprimarysourcepushtypeavailablecodingi == 0) {v.addVrfctnRsltPrimarySrcPushTypAvailableCdgVrsn("[[[");}
		if(verificationresultprimarysourcepushtypeavailablecoding.hasVersion()) {

			v.addVrfctnRsltPrimarySrcPushTypAvailableCdgVrsn(String.valueOf(verificationresultprimarysourcepushtypeavailablecoding.getVersion()));
		} else {
			v.addVrfctnRsltPrimarySrcPushTypAvailableCdgVrsn("NULL");
		}

		if(verificationresultprimarysourcepushtypeavailablecodingi == verificationresultprimarysourcepushtypeavailablecodinglist.size()-1) {v.addVrfctnRsltPrimarySrcPushTypAvailableCdgVrsn("]]]");}


		/******************** VrfctnRslt_PrimarySrc_PushTypAvailable_Cdg_Cd ********************************************************************************/
		if(verificationresultprimarysourcepushtypeavailablecodingi == 0) {v.addVrfctnRsltPrimarySrcPushTypAvailableCdgCd("[[[");}
		if(verificationresultprimarysourcepushtypeavailablecoding.hasCode()) {

			v.addVrfctnRsltPrimarySrcPushTypAvailableCdgCd(String.valueOf(verificationresultprimarysourcepushtypeavailablecoding.getCode()));
		} else {
			v.addVrfctnRsltPrimarySrcPushTypAvailableCdgCd("NULL");
		}

		if(verificationresultprimarysourcepushtypeavailablecodingi == verificationresultprimarysourcepushtypeavailablecodinglist.size()-1) {v.addVrfctnRsltPrimarySrcPushTypAvailableCdgCd("]]]");}


		/******************** VrfctnRslt_PrimarySrc_PushTypAvailable_Cdg_UsrSltd ********************************************************************************/
		if(verificationresultprimarysourcepushtypeavailablecodingi == 0) {v.addVrfctnRsltPrimarySrcPushTypAvailableCdgUsrSltd("[[[");}
		if(verificationresultprimarysourcepushtypeavailablecoding.hasUserSelected()) {

			v.addVrfctnRsltPrimarySrcPushTypAvailableCdgUsrSltd(String.valueOf(verificationresultprimarysourcepushtypeavailablecoding.getUserSelected()));
		} else {
			v.addVrfctnRsltPrimarySrcPushTypAvailableCdgUsrSltd("NULL");
		}

		if(verificationresultprimarysourcepushtypeavailablecodingi == verificationresultprimarysourcepushtypeavailablecodinglist.size()-1) {v.addVrfctnRsltPrimarySrcPushTypAvailableCdgUsrSltd("]]]");}


		/******************** VrfctnRslt_PrimarySrc_PushTypAvailable_Cdg_Sys ********************************************************************************/
		if(verificationresultprimarysourcepushtypeavailablecodingi == 0) {v.addVrfctnRsltPrimarySrcPushTypAvailableCdgSys("[[[");}
		if(verificationresultprimarysourcepushtypeavailablecoding.hasSystem()) {

			v.addVrfctnRsltPrimarySrcPushTypAvailableCdgSys(String.valueOf(verificationresultprimarysourcepushtypeavailablecoding.getSystem()));
		} else {
			v.addVrfctnRsltPrimarySrcPushTypAvailableCdgSys("NULL");
		}

		if(verificationresultprimarysourcepushtypeavailablecodingi == verificationresultprimarysourcepushtypeavailablecodinglist.size()-1) {v.addVrfctnRsltPrimarySrcPushTypAvailableCdgSys("]]]");}


		 };
		 };
		/******************** verificationresultprimarysourcecommunicationmethod ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> verificationresultprimarysourcecommunicationmethodlist = verificationresultprimarysource.getCommunicationMethod();
		for(int verificationresultprimarysourcecommunicationmethodi = 0; verificationresultprimarysourcecommunicationmethodi<verificationresultprimarysourcecommunicationmethodlist.size();verificationresultprimarysourcecommunicationmethodi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  verificationresultprimarysourcecommunicationmethod = verificationresultprimarysourcecommunicationmethodlist.get(verificationresultprimarysourcecommunicationmethodi);

		/******************** VrfctnRslt_PrimarySrc_CmmnctnMthd_Txt ********************************************************************************/
		if(verificationresultprimarysourcecommunicationmethodi == 0) {v.addVrfctnRsltPrimarySrcCmmnctnMthdTxt("[[");}
		if(verificationresultprimarysourcecommunicationmethod.hasText()) {

			v.addVrfctnRsltPrimarySrcCmmnctnMthdTxt(String.valueOf(verificationresultprimarysourcecommunicationmethod.getText()));
		} else {
			v.addVrfctnRsltPrimarySrcCmmnctnMthdTxt("NULL");
		}

		if(verificationresultprimarysourcecommunicationmethodi == verificationresultprimarysourcecommunicationmethodlist.size()-1) {v.addVrfctnRsltPrimarySrcCmmnctnMthdTxt("]]");}


		/******************** verificationresultprimarysourcecommunicationmethodcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> verificationresultprimarysourcecommunicationmethodcodinglist = verificationresultprimarysourcecommunicationmethod.getCoding();
		for(int verificationresultprimarysourcecommunicationmethodcodingi = 0; verificationresultprimarysourcecommunicationmethodcodingi<verificationresultprimarysourcecommunicationmethodcodinglist.size();verificationresultprimarysourcecommunicationmethodcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  verificationresultprimarysourcecommunicationmethodcoding = verificationresultprimarysourcecommunicationmethodcodinglist.get(verificationresultprimarysourcecommunicationmethodcodingi);

		/******************** VrfctnRslt_PrimarySrc_CmmnctnMthd_Cdg_Dsply ********************************************************************************/
		if(verificationresultprimarysourcecommunicationmethodcodingi == 0) {v.addVrfctnRsltPrimarySrcCmmnctnMthdCdgDsply("[[[");}
		if(verificationresultprimarysourcecommunicationmethodcoding.hasDisplay()) {

			v.addVrfctnRsltPrimarySrcCmmnctnMthdCdgDsply(String.valueOf(verificationresultprimarysourcecommunicationmethodcoding.getDisplay()));
		} else {
			v.addVrfctnRsltPrimarySrcCmmnctnMthdCdgDsply("NULL");
		}

		if(verificationresultprimarysourcecommunicationmethodcodingi == verificationresultprimarysourcecommunicationmethodcodinglist.size()-1) {v.addVrfctnRsltPrimarySrcCmmnctnMthdCdgDsply("]]]");}


		/******************** VrfctnRslt_PrimarySrc_CmmnctnMthd_Cdg_Vrsn ********************************************************************************/
		if(verificationresultprimarysourcecommunicationmethodcodingi == 0) {v.addVrfctnRsltPrimarySrcCmmnctnMthdCdgVrsn("[[[");}
		if(verificationresultprimarysourcecommunicationmethodcoding.hasVersion()) {

			v.addVrfctnRsltPrimarySrcCmmnctnMthdCdgVrsn(String.valueOf(verificationresultprimarysourcecommunicationmethodcoding.getVersion()));
		} else {
			v.addVrfctnRsltPrimarySrcCmmnctnMthdCdgVrsn("NULL");
		}

		if(verificationresultprimarysourcecommunicationmethodcodingi == verificationresultprimarysourcecommunicationmethodcodinglist.size()-1) {v.addVrfctnRsltPrimarySrcCmmnctnMthdCdgVrsn("]]]");}


		/******************** VrfctnRslt_PrimarySrc_CmmnctnMthd_Cdg_Cd ********************************************************************************/
		if(verificationresultprimarysourcecommunicationmethodcodingi == 0) {v.addVrfctnRsltPrimarySrcCmmnctnMthdCdgCd("[[[");}
		if(verificationresultprimarysourcecommunicationmethodcoding.hasCode()) {

			v.addVrfctnRsltPrimarySrcCmmnctnMthdCdgCd(String.valueOf(verificationresultprimarysourcecommunicationmethodcoding.getCode()));
		} else {
			v.addVrfctnRsltPrimarySrcCmmnctnMthdCdgCd("NULL");
		}

		if(verificationresultprimarysourcecommunicationmethodcodingi == verificationresultprimarysourcecommunicationmethodcodinglist.size()-1) {v.addVrfctnRsltPrimarySrcCmmnctnMthdCdgCd("]]]");}


		/******************** VrfctnRslt_PrimarySrc_CmmnctnMthd_Cdg_UsrSltd ********************************************************************************/
		if(verificationresultprimarysourcecommunicationmethodcodingi == 0) {v.addVrfctnRsltPrimarySrcCmmnctnMthdCdgUsrSltd("[[[");}
		if(verificationresultprimarysourcecommunicationmethodcoding.hasUserSelected()) {

			v.addVrfctnRsltPrimarySrcCmmnctnMthdCdgUsrSltd(String.valueOf(verificationresultprimarysourcecommunicationmethodcoding.getUserSelected()));
		} else {
			v.addVrfctnRsltPrimarySrcCmmnctnMthdCdgUsrSltd("NULL");
		}

		if(verificationresultprimarysourcecommunicationmethodcodingi == verificationresultprimarysourcecommunicationmethodcodinglist.size()-1) {v.addVrfctnRsltPrimarySrcCmmnctnMthdCdgUsrSltd("]]]");}


		/******************** VrfctnRslt_PrimarySrc_CmmnctnMthd_Cdg_Sys ********************************************************************************/
		if(verificationresultprimarysourcecommunicationmethodcodingi == 0) {v.addVrfctnRsltPrimarySrcCmmnctnMthdCdgSys("[[[");}
		if(verificationresultprimarysourcecommunicationmethodcoding.hasSystem()) {

			v.addVrfctnRsltPrimarySrcCmmnctnMthdCdgSys(String.valueOf(verificationresultprimarysourcecommunicationmethodcoding.getSystem()));
		} else {
			v.addVrfctnRsltPrimarySrcCmmnctnMthdCdgSys("NULL");
		}

		if(verificationresultprimarysourcecommunicationmethodcodingi == verificationresultprimarysourcecommunicationmethodcodinglist.size()-1) {v.addVrfctnRsltPrimarySrcCmmnctnMthdCdgSys("]]]");}


		 };
		 };
		/******************** VrfctnRslt_PrimarySrc_ValidationDt ********************************************************************************/
		if(verificationresultprimarysource.hasValidationDate()) {

			v.addVrfctnRsltPrimarySrcValidationDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(verificationresultprimarysource.getValidationDate())+"\"");
		} else {
			v.addVrfctnRsltPrimarySrcValidationDt("NULL");
		}


		/******************** verificationresultprimarysourcecanpushupdates ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept verificationresultprimarysourcecanpushupdates = verificationresultprimarysource.getCanPushUpdates();

		/******************** VrfctnRslt_PrimarySrc_CanPushUpdates_Txt ********************************************************************************/
		if(verificationresultprimarysourcecanpushupdates.hasText()) {

			v.addVrfctnRsltPrimarySrcCanPushUpdatesTxt(String.valueOf(verificationresultprimarysourcecanpushupdates.getText()));
		} else {
			v.addVrfctnRsltPrimarySrcCanPushUpdatesTxt("NULL");
		}


		/******************** verificationresultprimarysourcecanpushupdatescoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> verificationresultprimarysourcecanpushupdatescodinglist = verificationresultprimarysourcecanpushupdates.getCoding();
		for(int verificationresultprimarysourcecanpushupdatescodingi = 0; verificationresultprimarysourcecanpushupdatescodingi<verificationresultprimarysourcecanpushupdatescodinglist.size();verificationresultprimarysourcecanpushupdatescodingi++ ) {
		org.hl7.fhir.r4.model.Coding  verificationresultprimarysourcecanpushupdatescoding = verificationresultprimarysourcecanpushupdatescodinglist.get(verificationresultprimarysourcecanpushupdatescodingi);

		/******************** VrfctnRslt_PrimarySrc_CanPushUpdates_Cdg_Dsply ********************************************************************************/
		if(verificationresultprimarysourcecanpushupdatescodingi == 0) {v.addVrfctnRsltPrimarySrcCanPushUpdatesCdgDsply("[[");}
		if(verificationresultprimarysourcecanpushupdatescoding.hasDisplay()) {

			v.addVrfctnRsltPrimarySrcCanPushUpdatesCdgDsply(String.valueOf(verificationresultprimarysourcecanpushupdatescoding.getDisplay()));
		} else {
			v.addVrfctnRsltPrimarySrcCanPushUpdatesCdgDsply("NULL");
		}

		if(verificationresultprimarysourcecanpushupdatescodingi == verificationresultprimarysourcecanpushupdatescodinglist.size()-1) {v.addVrfctnRsltPrimarySrcCanPushUpdatesCdgDsply("]]");}


		/******************** VrfctnRslt_PrimarySrc_CanPushUpdates_Cdg_Vrsn ********************************************************************************/
		if(verificationresultprimarysourcecanpushupdatescodingi == 0) {v.addVrfctnRsltPrimarySrcCanPushUpdatesCdgVrsn("[[");}
		if(verificationresultprimarysourcecanpushupdatescoding.hasVersion()) {

			v.addVrfctnRsltPrimarySrcCanPushUpdatesCdgVrsn(String.valueOf(verificationresultprimarysourcecanpushupdatescoding.getVersion()));
		} else {
			v.addVrfctnRsltPrimarySrcCanPushUpdatesCdgVrsn("NULL");
		}

		if(verificationresultprimarysourcecanpushupdatescodingi == verificationresultprimarysourcecanpushupdatescodinglist.size()-1) {v.addVrfctnRsltPrimarySrcCanPushUpdatesCdgVrsn("]]");}


		/******************** VrfctnRslt_PrimarySrc_CanPushUpdates_Cdg_Cd ********************************************************************************/
		if(verificationresultprimarysourcecanpushupdatescodingi == 0) {v.addVrfctnRsltPrimarySrcCanPushUpdatesCdgCd("[[");}
		if(verificationresultprimarysourcecanpushupdatescoding.hasCode()) {

			v.addVrfctnRsltPrimarySrcCanPushUpdatesCdgCd(String.valueOf(verificationresultprimarysourcecanpushupdatescoding.getCode()));
		} else {
			v.addVrfctnRsltPrimarySrcCanPushUpdatesCdgCd("NULL");
		}

		if(verificationresultprimarysourcecanpushupdatescodingi == verificationresultprimarysourcecanpushupdatescodinglist.size()-1) {v.addVrfctnRsltPrimarySrcCanPushUpdatesCdgCd("]]");}


		/******************** VrfctnRslt_PrimarySrc_CanPushUpdates_Cdg_UsrSltd ********************************************************************************/
		if(verificationresultprimarysourcecanpushupdatescodingi == 0) {v.addVrfctnRsltPrimarySrcCanPushUpdatesCdgUsrSltd("[[");}
		if(verificationresultprimarysourcecanpushupdatescoding.hasUserSelected()) {

			v.addVrfctnRsltPrimarySrcCanPushUpdatesCdgUsrSltd(String.valueOf(verificationresultprimarysourcecanpushupdatescoding.getUserSelected()));
		} else {
			v.addVrfctnRsltPrimarySrcCanPushUpdatesCdgUsrSltd("NULL");
		}

		if(verificationresultprimarysourcecanpushupdatescodingi == verificationresultprimarysourcecanpushupdatescodinglist.size()-1) {v.addVrfctnRsltPrimarySrcCanPushUpdatesCdgUsrSltd("]]");}


		/******************** VrfctnRslt_PrimarySrc_CanPushUpdates_Cdg_Sys ********************************************************************************/
		if(verificationresultprimarysourcecanpushupdatescodingi == 0) {v.addVrfctnRsltPrimarySrcCanPushUpdatesCdgSys("[[");}
		if(verificationresultprimarysourcecanpushupdatescoding.hasSystem()) {

			v.addVrfctnRsltPrimarySrcCanPushUpdatesCdgSys(String.valueOf(verificationresultprimarysourcecanpushupdatescoding.getSystem()));
		} else {
			v.addVrfctnRsltPrimarySrcCanPushUpdatesCdgSys("NULL");
		}

		if(verificationresultprimarysourcecanpushupdatescodingi == verificationresultprimarysourcecanpushupdatescodinglist.size()-1) {v.addVrfctnRsltPrimarySrcCanPushUpdatesCdgSys("]]");}


		 };
		/******************** VrfctnRslt_PrimarySrc_Who ********************************************************************************/
		if(verificationresultprimarysource.hasWho()) {

			if(verificationresultprimarysource.getWho().getReference() != null) {
			v.addVrfctnRsltPrimarySrcWho(verificationresultprimarysource.getWho().getReference());
			}
		} else {
			v.addVrfctnRsltPrimarySrcWho("NULL");
		}


		 };
		return v;
	}
}
