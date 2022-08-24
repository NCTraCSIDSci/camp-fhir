package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Provenance;
public class ProvenanceBidirectionalConversion 
{
	public Provenance Provenances(org.hl7.fhir.r4.model.Provenance provenance) throws ParseException
	{
		 main.java.com.campfhir.model.Provenance p = new  main.java.com.campfhir.model.Provenance();

		/******************** id ********************************************************************************/
		p.setId(provenance.getIdElement().getIdPart());

		/******************** Provnce_Lctn ********************************************************************************/
		if(provenance.hasLocation()) {

			if(provenance.getLocation().getReference() != null) {
			p.addProvnceLctn(provenance.getLocation().getReference());
			}
		} else {
			p.addProvnceLctn("NULL");
		}


		/******************** provenancesignature ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Signature> provenancesignaturelist = provenance.getSignature();
		for(int provenancesignaturei = 0; provenancesignaturei<provenancesignaturelist.size();provenancesignaturei++ ) {
		org.hl7.fhir.r4.model.Signature  provenancesignature = provenancesignaturelist.get(provenancesignaturei);

		/******************** provenancesignaturetype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> provenancesignaturetypelist = provenancesignature.getType();
		for(int provenancesignaturetypei = 0; provenancesignaturetypei<provenancesignaturetypelist.size();provenancesignaturetypei++ ) {
		org.hl7.fhir.r4.model.Coding  provenancesignaturetype = provenancesignaturetypelist.get(provenancesignaturetypei);

		/******************** Provnce_Signature_Typ_Dsply ********************************************************************************/
		if(provenancesignaturetypei == 0) {p.addProvnceSignatureTypDsply("[[");}
		if(provenancesignaturetype.hasDisplay()) {

			p.addProvnceSignatureTypDsply(String.valueOf(provenancesignaturetype.getDisplay()));
		} else {
			p.addProvnceSignatureTypDsply("NULL");
		}

		if(provenancesignaturetypei == provenancesignaturetypelist.size()-1) {p.addProvnceSignatureTypDsply("]]");}


		/******************** Provnce_Signature_Typ_Vrsn ********************************************************************************/
		if(provenancesignaturetypei == 0) {p.addProvnceSignatureTypVrsn("[[");}
		if(provenancesignaturetype.hasVersion()) {

			p.addProvnceSignatureTypVrsn(String.valueOf(provenancesignaturetype.getVersion()));
		} else {
			p.addProvnceSignatureTypVrsn("NULL");
		}

		if(provenancesignaturetypei == provenancesignaturetypelist.size()-1) {p.addProvnceSignatureTypVrsn("]]");}


		/******************** Provnce_Signature_Typ_Cd ********************************************************************************/
		if(provenancesignaturetypei == 0) {p.addProvnceSignatureTypCd("[[");}
		if(provenancesignaturetype.hasCode()) {

			p.addProvnceSignatureTypCd(String.valueOf(provenancesignaturetype.getCode()));
		} else {
			p.addProvnceSignatureTypCd("NULL");
		}

		if(provenancesignaturetypei == provenancesignaturetypelist.size()-1) {p.addProvnceSignatureTypCd("]]");}


		/******************** Provnce_Signature_Typ_UsrSltd ********************************************************************************/
		if(provenancesignaturetypei == 0) {p.addProvnceSignatureTypUsrSltd("[[");}
		if(provenancesignaturetype.hasUserSelected()) {

			p.addProvnceSignatureTypUsrSltd(String.valueOf(provenancesignaturetype.getUserSelected()));
		} else {
			p.addProvnceSignatureTypUsrSltd("NULL");
		}

		if(provenancesignaturetypei == provenancesignaturetypelist.size()-1) {p.addProvnceSignatureTypUsrSltd("]]");}


		/******************** Provnce_Signature_Typ_Sys ********************************************************************************/
		if(provenancesignaturetypei == 0) {p.addProvnceSignatureTypSys("[[");}
		if(provenancesignaturetype.hasSystem()) {

			p.addProvnceSignatureTypSys(String.valueOf(provenancesignaturetype.getSystem()));
		} else {
			p.addProvnceSignatureTypSys("NULL");
		}

		if(provenancesignaturetypei == provenancesignaturetypelist.size()-1) {p.addProvnceSignatureTypSys("]]");}


		 };
		/******************** Provnce_Signature_When ********************************************************************************/
		if(provenancesignature.hasWhen()) {

			p.addProvnceSignatureWhen("\""+ca.uhn.fhir.util.DateUtils.formatDate(provenancesignature.getWhen())+"\"");
		} else {
			p.addProvnceSignatureWhen("NULL");
		}


		/******************** Provnce_Signature_Data ********************************************************************************/
		if(provenancesignature.hasData()) {

			p.addProvnceSignatureData(new String(provenancesignature.getData()));
		} else {
			p.addProvnceSignatureData("NULL");
		}


		/******************** Provnce_Signature_Who ********************************************************************************/
		if(provenancesignature.hasWho()) {

			if(provenancesignature.getWho().getReference() != null) {
			p.addProvnceSignatureWho(provenancesignature.getWho().getReference());
			}
		} else {
			p.addProvnceSignatureWho("NULL");
		}


		/******************** Provnce_Signature_OnBehalfOf ********************************************************************************/
		if(provenancesignature.hasOnBehalfOf()) {

			if(provenancesignature.getOnBehalfOf().getReference() != null) {
			p.addProvnceSignatureOnBehalfOf(provenancesignature.getOnBehalfOf().getReference());
			}
		} else {
			p.addProvnceSignatureOnBehalfOf("NULL");
		}


		/******************** Provnce_Signature_SigFrmat ********************************************************************************/
		if(provenancesignature.hasSigFormat()) {

			p.addProvnceSignatureSigFrmat(String.valueOf(provenancesignature.getSigFormat()));
		} else {
			p.addProvnceSignatureSigFrmat("NULL");
		}


		/******************** Provnce_Signature_TarFrmat ********************************************************************************/
		if(provenancesignature.hasTargetFormat()) {

			p.addProvnceSignatureTarFrmat(String.valueOf(provenancesignature.getTargetFormat()));
		} else {
			p.addProvnceSignatureTarFrmat("NULL");
		}


		 };
		/******************** provenancereason ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> provenancereasonlist = provenance.getReason();
		for(int provenancereasoni = 0; provenancereasoni<provenancereasonlist.size();provenancereasoni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  provenancereason = provenancereasonlist.get(provenancereasoni);

		/******************** Provnce_Rsn_Txt ********************************************************************************/
		if(provenancereasoni == 0) {p.addProvnceRsnTxt("[");}
		if(provenancereason.hasText()) {

			p.addProvnceRsnTxt(String.valueOf(provenancereason.getText()));
		} else {
			p.addProvnceRsnTxt("NULL");
		}

		if(provenancereasoni == provenancereasonlist.size()-1) {p.addProvnceRsnTxt("]");}


		/******************** provenancereasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> provenancereasoncodinglist = provenancereason.getCoding();
		for(int provenancereasoncodingi = 0; provenancereasoncodingi<provenancereasoncodinglist.size();provenancereasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  provenancereasoncoding = provenancereasoncodinglist.get(provenancereasoncodingi);

		/******************** Provnce_Rsn_Cdg_Dsply ********************************************************************************/
		if(provenancereasoncodingi == 0) {p.addProvnceRsnCdgDsply("[[");}
		if(provenancereasoncoding.hasDisplay()) {

			p.addProvnceRsnCdgDsply(String.valueOf(provenancereasoncoding.getDisplay()));
		} else {
			p.addProvnceRsnCdgDsply("NULL");
		}

		if(provenancereasoncodingi == provenancereasoncodinglist.size()-1) {p.addProvnceRsnCdgDsply("]]");}


		/******************** Provnce_Rsn_Cdg_Vrsn ********************************************************************************/
		if(provenancereasoncodingi == 0) {p.addProvnceRsnCdgVrsn("[[");}
		if(provenancereasoncoding.hasVersion()) {

			p.addProvnceRsnCdgVrsn(String.valueOf(provenancereasoncoding.getVersion()));
		} else {
			p.addProvnceRsnCdgVrsn("NULL");
		}

		if(provenancereasoncodingi == provenancereasoncodinglist.size()-1) {p.addProvnceRsnCdgVrsn("]]");}


		/******************** Provnce_Rsn_Cdg_Cd ********************************************************************************/
		if(provenancereasoncodingi == 0) {p.addProvnceRsnCdgCd("[[");}
		if(provenancereasoncoding.hasCode()) {

			p.addProvnceRsnCdgCd(String.valueOf(provenancereasoncoding.getCode()));
		} else {
			p.addProvnceRsnCdgCd("NULL");
		}

		if(provenancereasoncodingi == provenancereasoncodinglist.size()-1) {p.addProvnceRsnCdgCd("]]");}


		/******************** Provnce_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(provenancereasoncodingi == 0) {p.addProvnceRsnCdgUsrSltd("[[");}
		if(provenancereasoncoding.hasUserSelected()) {

			p.addProvnceRsnCdgUsrSltd(String.valueOf(provenancereasoncoding.getUserSelected()));
		} else {
			p.addProvnceRsnCdgUsrSltd("NULL");
		}

		if(provenancereasoncodingi == provenancereasoncodinglist.size()-1) {p.addProvnceRsnCdgUsrSltd("]]");}


		/******************** Provnce_Rsn_Cdg_Sys ********************************************************************************/
		if(provenancereasoncodingi == 0) {p.addProvnceRsnCdgSys("[[");}
		if(provenancereasoncoding.hasSystem()) {

			p.addProvnceRsnCdgSys(String.valueOf(provenancereasoncoding.getSystem()));
		} else {
			p.addProvnceRsnCdgSys("NULL");
		}

		if(provenancereasoncodingi == provenancereasoncodinglist.size()-1) {p.addProvnceRsnCdgSys("]]");}


		 };
		 };
		/******************** Provnce_OccurredDtTimeTyp ********************************************************************************/
		if(provenance.hasOccurredDateTimeType()) {

			p.addProvnceOccurredDtTimeTyp("\""+provenance.getOccurredDateTimeType().getValueAsString()+"\"");
		} else {
			p.addProvnceOccurredDtTimeTyp("NULL");
		}


		/******************** Provnce_Policy ********************************************************************************/
		if(provenance.hasPolicy()) {

			String  array = "[";
			for(int incr=0; incr<provenance.getPolicy().size(); incr++) {
				array = array + provenance.getPolicy().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			p.addProvncePolicy(array);

		} else {
			p.addProvncePolicy("NULL");
		}


		/******************** provenanceactivity ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept provenanceactivity = provenance.getActivity();

		/******************** Provnce_Actvty_Txt ********************************************************************************/
		if(provenanceactivity.hasText()) {

			p.addProvnceActvtyTxt(String.valueOf(provenanceactivity.getText()));
		} else {
			p.addProvnceActvtyTxt("NULL");
		}


		/******************** provenanceactivitycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> provenanceactivitycodinglist = provenanceactivity.getCoding();
		for(int provenanceactivitycodingi = 0; provenanceactivitycodingi<provenanceactivitycodinglist.size();provenanceactivitycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  provenanceactivitycoding = provenanceactivitycodinglist.get(provenanceactivitycodingi);

		/******************** Provnce_Actvty_Cdg_Dsply ********************************************************************************/
		if(provenanceactivitycodingi == 0) {p.addProvnceActvtyCdgDsply("[");}
		if(provenanceactivitycoding.hasDisplay()) {

			p.addProvnceActvtyCdgDsply(String.valueOf(provenanceactivitycoding.getDisplay()));
		} else {
			p.addProvnceActvtyCdgDsply("NULL");
		}

		if(provenanceactivitycodingi == provenanceactivitycodinglist.size()-1) {p.addProvnceActvtyCdgDsply("]");}


		/******************** Provnce_Actvty_Cdg_Vrsn ********************************************************************************/
		if(provenanceactivitycodingi == 0) {p.addProvnceActvtyCdgVrsn("[");}
		if(provenanceactivitycoding.hasVersion()) {

			p.addProvnceActvtyCdgVrsn(String.valueOf(provenanceactivitycoding.getVersion()));
		} else {
			p.addProvnceActvtyCdgVrsn("NULL");
		}

		if(provenanceactivitycodingi == provenanceactivitycodinglist.size()-1) {p.addProvnceActvtyCdgVrsn("]");}


		/******************** Provnce_Actvty_Cdg_Cd ********************************************************************************/
		if(provenanceactivitycodingi == 0) {p.addProvnceActvtyCdgCd("[");}
		if(provenanceactivitycoding.hasCode()) {

			p.addProvnceActvtyCdgCd(String.valueOf(provenanceactivitycoding.getCode()));
		} else {
			p.addProvnceActvtyCdgCd("NULL");
		}

		if(provenanceactivitycodingi == provenanceactivitycodinglist.size()-1) {p.addProvnceActvtyCdgCd("]");}


		/******************** Provnce_Actvty_Cdg_UsrSltd ********************************************************************************/
		if(provenanceactivitycodingi == 0) {p.addProvnceActvtyCdgUsrSltd("[");}
		if(provenanceactivitycoding.hasUserSelected()) {

			p.addProvnceActvtyCdgUsrSltd(String.valueOf(provenanceactivitycoding.getUserSelected()));
		} else {
			p.addProvnceActvtyCdgUsrSltd("NULL");
		}

		if(provenanceactivitycodingi == provenanceactivitycodinglist.size()-1) {p.addProvnceActvtyCdgUsrSltd("]");}


		/******************** Provnce_Actvty_Cdg_Sys ********************************************************************************/
		if(provenanceactivitycodingi == 0) {p.addProvnceActvtyCdgSys("[");}
		if(provenanceactivitycoding.hasSystem()) {

			p.addProvnceActvtyCdgSys(String.valueOf(provenanceactivitycoding.getSystem()));
		} else {
			p.addProvnceActvtyCdgSys("NULL");
		}

		if(provenanceactivitycodingi == provenanceactivitycodinglist.size()-1) {p.addProvnceActvtyCdgSys("]");}


		 };
		/******************** Provnce_Recorded ********************************************************************************/
		if(provenance.hasRecorded()) {

			p.addProvnceRecorded("\""+ca.uhn.fhir.util.DateUtils.formatDate(provenance.getRecorded())+"\"");
		} else {
			p.addProvnceRecorded("NULL");
		}


		/******************** provenanceoccurredperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period provenanceoccurredperiod = provenance.getOccurredPeriod();

		/******************** Provnce_OccurredPrd_Strt ********************************************************************************/
		if(provenanceoccurredperiod.hasStart()) {

			p.addProvnceOccurredPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(provenanceoccurredperiod.getStart())+"\"");
		} else {
			p.addProvnceOccurredPrdStrt("NULL");
		}


		/******************** Provnce_OccurredPrd_End ********************************************************************************/
		if(provenanceoccurredperiod.hasEnd()) {

			p.addProvnceOccurredPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(provenanceoccurredperiod.getEnd())+"\"");
		} else {
			p.addProvnceOccurredPrdEnd("NULL");
		}


		/******************** provenanceagent ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Provenance.ProvenanceAgentComponent> provenanceagentlist = provenance.getAgent();
		for(int provenanceagenti = 0; provenanceagenti<provenanceagentlist.size();provenanceagenti++ ) {
		org.hl7.fhir.r4.model.Provenance.ProvenanceAgentComponent  provenanceagent = provenanceagentlist.get(provenanceagenti);

		/******************** provenanceagenttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept provenanceagenttype = provenanceagent.getType();

		/******************** Provnce_Agnt_Typ_Txt ********************************************************************************/
		if(provenanceagenti == 0) {p.addProvnceAgntTypTxt("[");}
		if(provenanceagenttype.hasText()) {

			p.addProvnceAgntTypTxt(String.valueOf(provenanceagenttype.getText()));
		} else {
			p.addProvnceAgntTypTxt("NULL");
		}

		if(provenanceagenti == provenanceagentlist.size()-1) {p.addProvnceAgntTypTxt("]");}


		/******************** provenanceagenttypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> provenanceagenttypecodinglist = provenanceagenttype.getCoding();
		for(int provenanceagenttypecodingi = 0; provenanceagenttypecodingi<provenanceagenttypecodinglist.size();provenanceagenttypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  provenanceagenttypecoding = provenanceagenttypecodinglist.get(provenanceagenttypecodingi);

		/******************** Provnce_Agnt_Typ_Cdg_Dsply ********************************************************************************/
		if(provenanceagenttypecodingi == 0) {p.addProvnceAgntTypCdgDsply("[[");}
		if(provenanceagenttypecoding.hasDisplay()) {

			p.addProvnceAgntTypCdgDsply(String.valueOf(provenanceagenttypecoding.getDisplay()));
		} else {
			p.addProvnceAgntTypCdgDsply("NULL");
		}

		if(provenanceagenttypecodingi == provenanceagenttypecodinglist.size()-1) {p.addProvnceAgntTypCdgDsply("]]");}


		/******************** Provnce_Agnt_Typ_Cdg_Vrsn ********************************************************************************/
		if(provenanceagenttypecodingi == 0) {p.addProvnceAgntTypCdgVrsn("[[");}
		if(provenanceagenttypecoding.hasVersion()) {

			p.addProvnceAgntTypCdgVrsn(String.valueOf(provenanceagenttypecoding.getVersion()));
		} else {
			p.addProvnceAgntTypCdgVrsn("NULL");
		}

		if(provenanceagenttypecodingi == provenanceagenttypecodinglist.size()-1) {p.addProvnceAgntTypCdgVrsn("]]");}


		/******************** Provnce_Agnt_Typ_Cdg_Cd ********************************************************************************/
		if(provenanceagenttypecodingi == 0) {p.addProvnceAgntTypCdgCd("[[");}
		if(provenanceagenttypecoding.hasCode()) {

			p.addProvnceAgntTypCdgCd(String.valueOf(provenanceagenttypecoding.getCode()));
		} else {
			p.addProvnceAgntTypCdgCd("NULL");
		}

		if(provenanceagenttypecodingi == provenanceagenttypecodinglist.size()-1) {p.addProvnceAgntTypCdgCd("]]");}


		/******************** Provnce_Agnt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(provenanceagenttypecodingi == 0) {p.addProvnceAgntTypCdgUsrSltd("[[");}
		if(provenanceagenttypecoding.hasUserSelected()) {

			p.addProvnceAgntTypCdgUsrSltd(String.valueOf(provenanceagenttypecoding.getUserSelected()));
		} else {
			p.addProvnceAgntTypCdgUsrSltd("NULL");
		}

		if(provenanceagenttypecodingi == provenanceagenttypecodinglist.size()-1) {p.addProvnceAgntTypCdgUsrSltd("]]");}


		/******************** Provnce_Agnt_Typ_Cdg_Sys ********************************************************************************/
		if(provenanceagenttypecodingi == 0) {p.addProvnceAgntTypCdgSys("[[");}
		if(provenanceagenttypecoding.hasSystem()) {

			p.addProvnceAgntTypCdgSys(String.valueOf(provenanceagenttypecoding.getSystem()));
		} else {
			p.addProvnceAgntTypCdgSys("NULL");
		}

		if(provenanceagenttypecodingi == provenanceagenttypecodinglist.size()-1) {p.addProvnceAgntTypCdgSys("]]");}


		 };
		/******************** provenanceagentrole ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> provenanceagentrolelist = provenanceagent.getRole();
		for(int provenanceagentrolei = 0; provenanceagentrolei<provenanceagentrolelist.size();provenanceagentrolei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  provenanceagentrole = provenanceagentrolelist.get(provenanceagentrolei);

		/******************** Provnce_Agnt_Role_Txt ********************************************************************************/
		if(provenanceagentrolei == 0) {p.addProvnceAgntRoleTxt("[[");}
		if(provenanceagentrole.hasText()) {

			p.addProvnceAgntRoleTxt(String.valueOf(provenanceagentrole.getText()));
		} else {
			p.addProvnceAgntRoleTxt("NULL");
		}

		if(provenanceagentrolei == provenanceagentrolelist.size()-1) {p.addProvnceAgntRoleTxt("]]");}


		/******************** provenanceagentrolecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> provenanceagentrolecodinglist = provenanceagentrole.getCoding();
		for(int provenanceagentrolecodingi = 0; provenanceagentrolecodingi<provenanceagentrolecodinglist.size();provenanceagentrolecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  provenanceagentrolecoding = provenanceagentrolecodinglist.get(provenanceagentrolecodingi);

		/******************** Provnce_Agnt_Role_Cdg_Dsply ********************************************************************************/
		if(provenanceagentrolecodingi == 0) {p.addProvnceAgntRoleCdgDsply("[[[");}
		if(provenanceagentrolecoding.hasDisplay()) {

			p.addProvnceAgntRoleCdgDsply(String.valueOf(provenanceagentrolecoding.getDisplay()));
		} else {
			p.addProvnceAgntRoleCdgDsply("NULL");
		}

		if(provenanceagentrolecodingi == provenanceagentrolecodinglist.size()-1) {p.addProvnceAgntRoleCdgDsply("]]]");}


		/******************** Provnce_Agnt_Role_Cdg_Vrsn ********************************************************************************/
		if(provenanceagentrolecodingi == 0) {p.addProvnceAgntRoleCdgVrsn("[[[");}
		if(provenanceagentrolecoding.hasVersion()) {

			p.addProvnceAgntRoleCdgVrsn(String.valueOf(provenanceagentrolecoding.getVersion()));
		} else {
			p.addProvnceAgntRoleCdgVrsn("NULL");
		}

		if(provenanceagentrolecodingi == provenanceagentrolecodinglist.size()-1) {p.addProvnceAgntRoleCdgVrsn("]]]");}


		/******************** Provnce_Agnt_Role_Cdg_Cd ********************************************************************************/
		if(provenanceagentrolecodingi == 0) {p.addProvnceAgntRoleCdgCd("[[[");}
		if(provenanceagentrolecoding.hasCode()) {

			p.addProvnceAgntRoleCdgCd(String.valueOf(provenanceagentrolecoding.getCode()));
		} else {
			p.addProvnceAgntRoleCdgCd("NULL");
		}

		if(provenanceagentrolecodingi == provenanceagentrolecodinglist.size()-1) {p.addProvnceAgntRoleCdgCd("]]]");}


		/******************** Provnce_Agnt_Role_Cdg_UsrSltd ********************************************************************************/
		if(provenanceagentrolecodingi == 0) {p.addProvnceAgntRoleCdgUsrSltd("[[[");}
		if(provenanceagentrolecoding.hasUserSelected()) {

			p.addProvnceAgntRoleCdgUsrSltd(String.valueOf(provenanceagentrolecoding.getUserSelected()));
		} else {
			p.addProvnceAgntRoleCdgUsrSltd("NULL");
		}

		if(provenanceagentrolecodingi == provenanceagentrolecodinglist.size()-1) {p.addProvnceAgntRoleCdgUsrSltd("]]]");}


		/******************** Provnce_Agnt_Role_Cdg_Sys ********************************************************************************/
		if(provenanceagentrolecodingi == 0) {p.addProvnceAgntRoleCdgSys("[[[");}
		if(provenanceagentrolecoding.hasSystem()) {

			p.addProvnceAgntRoleCdgSys(String.valueOf(provenanceagentrolecoding.getSystem()));
		} else {
			p.addProvnceAgntRoleCdgSys("NULL");
		}

		if(provenanceagentrolecodingi == provenanceagentrolecodinglist.size()-1) {p.addProvnceAgntRoleCdgSys("]]]");}


		 };
		 };
		/******************** Provnce_Agnt_Who ********************************************************************************/
		if(provenanceagent.hasWho()) {

			if(provenanceagent.getWho().getReference() != null) {
			p.addProvnceAgntWho(provenanceagent.getWho().getReference());
			}
		} else {
			p.addProvnceAgntWho("NULL");
		}


		/******************** Provnce_Agnt_OnBehalfOf ********************************************************************************/
		if(provenanceagent.hasOnBehalfOf()) {

			if(provenanceagent.getOnBehalfOf().getReference() != null) {
			p.addProvnceAgntOnBehalfOf(provenanceagent.getOnBehalfOf().getReference());
			}
		} else {
			p.addProvnceAgntOnBehalfOf("NULL");
		}


		 };
		/******************** provenanceentity ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Provenance.ProvenanceEntityComponent> provenanceentitylist = provenance.getEntity();
		for(int provenanceentityi = 0; provenanceentityi<provenanceentitylist.size();provenanceentityi++ ) {
		org.hl7.fhir.r4.model.Provenance.ProvenanceEntityComponent  provenanceentity = provenanceentitylist.get(provenanceentityi);

		/******************** provenanceentityrole ********************************************************************************/
		org.hl7.fhir.r4.model.Provenance.ProvenanceEntityRole provenanceentityrole = provenanceentity.getRole();
		if(provenanceentityrole!=null) {
		if(provenanceentityi == 0) {

		p.addProvnceEntityRole("[");		}
			p.addProvnceEntityRole(provenanceentityrole.toCode());
		if(provenanceentityi == provenanceentitylist.size()-1) {

		p.addProvnceEntityRole("]");		}

		} else {
			p.addProvnceEntityRole("NULL");
		}

		/******************** provenanceentityagent ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Provenance.ProvenanceAgentComponent> provenanceentityagentlist = provenanceentity.getAgent();
		for(int provenanceentityagenti = 0; provenanceentityagenti<provenanceentityagentlist.size();provenanceentityagenti++ ) {
		org.hl7.fhir.r4.model.Provenance.ProvenanceAgentComponent  provenanceentityagent = provenanceentityagentlist.get(provenanceentityagenti);

		/******************** provenanceentityagenttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept provenanceentityagenttype = provenanceentityagent.getType();

		/******************** Provnce_Entity_Agnt_Typ_Txt ********************************************************************************/
		if(provenanceentityagenti == 0) {p.addProvnceEntityAgntTypTxt("[[");}
		if(provenanceentityagenttype.hasText()) {

			p.addProvnceEntityAgntTypTxt(String.valueOf(provenanceentityagenttype.getText()));
		} else {
			p.addProvnceEntityAgntTypTxt("NULL");
		}

		if(provenanceentityagenti == provenanceentityagentlist.size()-1) {p.addProvnceEntityAgntTypTxt("]]");}


		/******************** provenanceentityagenttypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> provenanceentityagenttypecodinglist = provenanceentityagenttype.getCoding();
		for(int provenanceentityagenttypecodingi = 0; provenanceentityagenttypecodingi<provenanceentityagenttypecodinglist.size();provenanceentityagenttypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  provenanceentityagenttypecoding = provenanceentityagenttypecodinglist.get(provenanceentityagenttypecodingi);

		/******************** Provnce_Entity_Agnt_Typ_Cdg_Dsply ********************************************************************************/
		if(provenanceentityagenttypecodingi == 0) {p.addProvnceEntityAgntTypCdgDsply("[[[");}
		if(provenanceentityagenttypecoding.hasDisplay()) {

			p.addProvnceEntityAgntTypCdgDsply(String.valueOf(provenanceentityagenttypecoding.getDisplay()));
		} else {
			p.addProvnceEntityAgntTypCdgDsply("NULL");
		}

		if(provenanceentityagenttypecodingi == provenanceentityagenttypecodinglist.size()-1) {p.addProvnceEntityAgntTypCdgDsply("]]]");}


		/******************** Provnce_Entity_Agnt_Typ_Cdg_Vrsn ********************************************************************************/
		if(provenanceentityagenttypecodingi == 0) {p.addProvnceEntityAgntTypCdgVrsn("[[[");}
		if(provenanceentityagenttypecoding.hasVersion()) {

			p.addProvnceEntityAgntTypCdgVrsn(String.valueOf(provenanceentityagenttypecoding.getVersion()));
		} else {
			p.addProvnceEntityAgntTypCdgVrsn("NULL");
		}

		if(provenanceentityagenttypecodingi == provenanceentityagenttypecodinglist.size()-1) {p.addProvnceEntityAgntTypCdgVrsn("]]]");}


		/******************** Provnce_Entity_Agnt_Typ_Cdg_Cd ********************************************************************************/
		if(provenanceentityagenttypecodingi == 0) {p.addProvnceEntityAgntTypCdgCd("[[[");}
		if(provenanceentityagenttypecoding.hasCode()) {

			p.addProvnceEntityAgntTypCdgCd(String.valueOf(provenanceentityagenttypecoding.getCode()));
		} else {
			p.addProvnceEntityAgntTypCdgCd("NULL");
		}

		if(provenanceentityagenttypecodingi == provenanceentityagenttypecodinglist.size()-1) {p.addProvnceEntityAgntTypCdgCd("]]]");}


		/******************** Provnce_Entity_Agnt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(provenanceentityagenttypecodingi == 0) {p.addProvnceEntityAgntTypCdgUsrSltd("[[[");}
		if(provenanceentityagenttypecoding.hasUserSelected()) {

			p.addProvnceEntityAgntTypCdgUsrSltd(String.valueOf(provenanceentityagenttypecoding.getUserSelected()));
		} else {
			p.addProvnceEntityAgntTypCdgUsrSltd("NULL");
		}

		if(provenanceentityagenttypecodingi == provenanceentityagenttypecodinglist.size()-1) {p.addProvnceEntityAgntTypCdgUsrSltd("]]]");}


		/******************** Provnce_Entity_Agnt_Typ_Cdg_Sys ********************************************************************************/
		if(provenanceentityagenttypecodingi == 0) {p.addProvnceEntityAgntTypCdgSys("[[[");}
		if(provenanceentityagenttypecoding.hasSystem()) {

			p.addProvnceEntityAgntTypCdgSys(String.valueOf(provenanceentityagenttypecoding.getSystem()));
		} else {
			p.addProvnceEntityAgntTypCdgSys("NULL");
		}

		if(provenanceentityagenttypecodingi == provenanceentityagenttypecodinglist.size()-1) {p.addProvnceEntityAgntTypCdgSys("]]]");}


		 };
		/******************** provenanceentityagentrole ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> provenanceentityagentrolelist = provenanceentityagent.getRole();
		for(int provenanceentityagentrolei = 0; provenanceentityagentrolei<provenanceentityagentrolelist.size();provenanceentityagentrolei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  provenanceentityagentrole = provenanceentityagentrolelist.get(provenanceentityagentrolei);

		/******************** Provnce_Entity_Agnt_Role_Txt ********************************************************************************/
		if(provenanceentityagentrolei == 0) {p.addProvnceEntityAgntRoleTxt("[[[");}
		if(provenanceentityagentrole.hasText()) {

			p.addProvnceEntityAgntRoleTxt(String.valueOf(provenanceentityagentrole.getText()));
		} else {
			p.addProvnceEntityAgntRoleTxt("NULL");
		}

		if(provenanceentityagentrolei == provenanceentityagentrolelist.size()-1) {p.addProvnceEntityAgntRoleTxt("]]]");}


		/******************** provenanceentityagentrolecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> provenanceentityagentrolecodinglist = provenanceentityagentrole.getCoding();
		for(int provenanceentityagentrolecodingi = 0; provenanceentityagentrolecodingi<provenanceentityagentrolecodinglist.size();provenanceentityagentrolecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  provenanceentityagentrolecoding = provenanceentityagentrolecodinglist.get(provenanceentityagentrolecodingi);

		/******************** Provnce_Entity_Agnt_Role_Cdg_Dsply ********************************************************************************/
		if(provenanceentityagentrolecodingi == 0) {p.addProvnceEntityAgntRoleCdgDsply("[[[[");}
		if(provenanceentityagentrolecoding.hasDisplay()) {

			p.addProvnceEntityAgntRoleCdgDsply(String.valueOf(provenanceentityagentrolecoding.getDisplay()));
		} else {
			p.addProvnceEntityAgntRoleCdgDsply("NULL");
		}

		if(provenanceentityagentrolecodingi == provenanceentityagentrolecodinglist.size()-1) {p.addProvnceEntityAgntRoleCdgDsply("]]]]");}


		/******************** Provnce_Entity_Agnt_Role_Cdg_Vrsn ********************************************************************************/
		if(provenanceentityagentrolecodingi == 0) {p.addProvnceEntityAgntRoleCdgVrsn("[[[[");}
		if(provenanceentityagentrolecoding.hasVersion()) {

			p.addProvnceEntityAgntRoleCdgVrsn(String.valueOf(provenanceentityagentrolecoding.getVersion()));
		} else {
			p.addProvnceEntityAgntRoleCdgVrsn("NULL");
		}

		if(provenanceentityagentrolecodingi == provenanceentityagentrolecodinglist.size()-1) {p.addProvnceEntityAgntRoleCdgVrsn("]]]]");}


		/******************** Provnce_Entity_Agnt_Role_Cdg_Cd ********************************************************************************/
		if(provenanceentityagentrolecodingi == 0) {p.addProvnceEntityAgntRoleCdgCd("[[[[");}
		if(provenanceentityagentrolecoding.hasCode()) {

			p.addProvnceEntityAgntRoleCdgCd(String.valueOf(provenanceentityagentrolecoding.getCode()));
		} else {
			p.addProvnceEntityAgntRoleCdgCd("NULL");
		}

		if(provenanceentityagentrolecodingi == provenanceentityagentrolecodinglist.size()-1) {p.addProvnceEntityAgntRoleCdgCd("]]]]");}


		/******************** Provnce_Entity_Agnt_Role_Cdg_UsrSltd ********************************************************************************/
		if(provenanceentityagentrolecodingi == 0) {p.addProvnceEntityAgntRoleCdgUsrSltd("[[[[");}
		if(provenanceentityagentrolecoding.hasUserSelected()) {

			p.addProvnceEntityAgntRoleCdgUsrSltd(String.valueOf(provenanceentityagentrolecoding.getUserSelected()));
		} else {
			p.addProvnceEntityAgntRoleCdgUsrSltd("NULL");
		}

		if(provenanceentityagentrolecodingi == provenanceentityagentrolecodinglist.size()-1) {p.addProvnceEntityAgntRoleCdgUsrSltd("]]]]");}


		/******************** Provnce_Entity_Agnt_Role_Cdg_Sys ********************************************************************************/
		if(provenanceentityagentrolecodingi == 0) {p.addProvnceEntityAgntRoleCdgSys("[[[[");}
		if(provenanceentityagentrolecoding.hasSystem()) {

			p.addProvnceEntityAgntRoleCdgSys(String.valueOf(provenanceentityagentrolecoding.getSystem()));
		} else {
			p.addProvnceEntityAgntRoleCdgSys("NULL");
		}

		if(provenanceentityagentrolecodingi == provenanceentityagentrolecodinglist.size()-1) {p.addProvnceEntityAgntRoleCdgSys("]]]]");}


		 };
		 };
		/******************** Provnce_Entity_Agnt_Who ********************************************************************************/
		if(provenanceentityagent.hasWho()) {

			if(provenanceentityagent.getWho().getReference() != null) {
			p.addProvnceEntityAgntWho(provenanceentityagent.getWho().getReference());
			}
		} else {
			p.addProvnceEntityAgntWho("NULL");
		}


		/******************** Provnce_Entity_Agnt_OnBehalfOf ********************************************************************************/
		if(provenanceentityagent.hasOnBehalfOf()) {

			if(provenanceentityagent.getOnBehalfOf().getReference() != null) {
			p.addProvnceEntityAgntOnBehalfOf(provenanceentityagent.getOnBehalfOf().getReference());
			}
		} else {
			p.addProvnceEntityAgntOnBehalfOf("NULL");
		}


		 };
		/******************** Provnce_Entity_What ********************************************************************************/
		if(provenanceentity.hasWhat()) {

			if(provenanceentity.getWhat().getReference() != null) {
			p.addProvnceEntityWhat(provenanceentity.getWhat().getReference());
			}
		} else {
			p.addProvnceEntityWhat("NULL");
		}


		 };
		return p;
	}
}
