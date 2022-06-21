package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Provenance;
public class ProvenanceBidirectionalConversion 
{
	public Provenance Provenances(org.hl7.fhir.r4.model.Provenance provenance) throws ParseException
	{
		 main.java.com.campfhir.model.Provenance p = new  main.java.com.campfhir.model.Provenance();

		/******************** id ********************************************************************************/
		provenance.setId(p.getId());

		/******************** Provnce_Lctn ********************************************************************************/
		if(provenance.hasLocation()) {
			p.setProvnceLctn(String.valueOf(provenance.getLocation()));
		}
		/******************** Provnce_Tar ********************************************************************************/
		if(provenance.hasTarget()) {
			p.setProvnceTar(String.valueOf(provenance.getTargetFirstRep()));
		}
		/******************** provenanceoccurredperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period provenanceoccurredperiod = provenance.getOccurredPeriod();

		/******************** Provnce_OccurredPrd_End ********************************************************************************/
		if(provenanceoccurredperiod.hasEnd()) {
			p.setProvnceOccurredPrdEnd(String.valueOf(provenanceoccurredperiod.getEnd()));
		}
		/******************** Provnce_OccurredPrd_Strt ********************************************************************************/
		if(provenanceoccurredperiod.hasStart()) {
			p.setProvnceOccurredPrdStrt(String.valueOf(provenanceoccurredperiod.getStart()));
		}
		/******************** Provnce_Recorded ********************************************************************************/
		if(provenance.hasRecorded()) {
			p.setProvnceRecorded(String.valueOf(provenance.getRecorded()));
		}
		/******************** provenanceagent ********************************************************************************/
		org.hl7.fhir.r4.model.Provenance.ProvenanceAgentComponent provenanceagent = provenance.getAgentFirstRep();

		/******************** provenanceagenttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept provenanceagenttype = provenanceagent.getType();

		/******************** provenanceagenttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding provenanceagenttypecoding = provenanceagenttype.getCodingFirstRep();

		/******************** Provnce_Agnt_Typ_Cdg_Dsply ********************************************************************************/
		if(provenanceagenttypecoding.hasDisplay()) {
			p.setProvnceAgntTypCdgDsply(String.valueOf(provenanceagenttypecoding.getDisplay()));
		}
		/******************** Provnce_Agnt_Typ_Cdg_Vrsn ********************************************************************************/
		if(provenanceagenttypecoding.hasVersion()) {
			p.setProvnceAgntTypCdgVrsn(String.valueOf(provenanceagenttypecoding.getVersion()));
		}
		/******************** Provnce_Agnt_Typ_Cdg_Cd ********************************************************************************/
		if(provenanceagenttypecoding.hasCode()) {
			p.setProvnceAgntTypCdgCd(String.valueOf(provenanceagenttypecoding.getCode()));
		}
		/******************** Provnce_Agnt_Typ_Cdg_Sys ********************************************************************************/
		if(provenanceagenttypecoding.hasSystem()) {
			p.setProvnceAgntTypCdgSys(String.valueOf(provenanceagenttypecoding.getSystem()));
		}
		/******************** Provnce_Agnt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(provenanceagenttypecoding.hasUserSelected()) {
			p.setProvnceAgntTypCdgUsrSltd(String.valueOf(provenanceagenttypecoding.getUserSelected()));
		}
		/******************** Provnce_Agnt_Typ_Txt ********************************************************************************/
		if(provenanceagenttype.hasText()) {
			p.setProvnceAgntTypTxt(String.valueOf(provenanceagenttype.getText()));
		}
		/******************** Provnce_Agnt_OnBehalfOf ********************************************************************************/
		if(provenanceagent.hasOnBehalfOf()) {
			p.setProvnceAgntOnBehalfOf(String.valueOf(provenanceagent.getOnBehalfOf()));
		}
		/******************** Provnce_Agnt_Who ********************************************************************************/
		if(provenanceagent.hasWho()) {
			p.setProvnceAgntWho(String.valueOf(provenanceagent.getWho()));
		}
		/******************** provenanceagentrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept provenanceagentrole = provenanceagent.getRoleFirstRep();

		/******************** provenanceagentrolecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding provenanceagentrolecoding = provenanceagentrole.getCodingFirstRep();

		/******************** Provnce_Agnt_Role_Cdg_Dsply ********************************************************************************/
		if(provenanceagentrolecoding.hasDisplay()) {
			p.setProvnceAgntRoleCdgDsply(String.valueOf(provenanceagentrolecoding.getDisplay()));
		}
		/******************** Provnce_Agnt_Role_Cdg_Vrsn ********************************************************************************/
		if(provenanceagentrolecoding.hasVersion()) {
			p.setProvnceAgntRoleCdgVrsn(String.valueOf(provenanceagentrolecoding.getVersion()));
		}
		/******************** Provnce_Agnt_Role_Cdg_Cd ********************************************************************************/
		if(provenanceagentrolecoding.hasCode()) {
			p.setProvnceAgntRoleCdgCd(String.valueOf(provenanceagentrolecoding.getCode()));
		}
		/******************** Provnce_Agnt_Role_Cdg_Sys ********************************************************************************/
		if(provenanceagentrolecoding.hasSystem()) {
			p.setProvnceAgntRoleCdgSys(String.valueOf(provenanceagentrolecoding.getSystem()));
		}
		/******************** Provnce_Agnt_Role_Cdg_UsrSltd ********************************************************************************/
		if(provenanceagentrolecoding.hasUserSelected()) {
			p.setProvnceAgntRoleCdgUsrSltd(String.valueOf(provenanceagentrolecoding.getUserSelected()));
		}
		/******************** Provnce_Agnt_Role_Txt ********************************************************************************/
		if(provenanceagentrole.hasText()) {
			p.setProvnceAgntRoleTxt(String.valueOf(provenanceagentrole.getText()));
		}
		/******************** provenanceactivity ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept provenanceactivity = provenance.getActivity();

		/******************** provenanceactivitycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding provenanceactivitycoding = provenanceactivity.getCodingFirstRep();

		/******************** Provnce_Actvty_Cdg_Dsply ********************************************************************************/
		if(provenanceactivitycoding.hasDisplay()) {
			p.setProvnceActvtyCdgDsply(String.valueOf(provenanceactivitycoding.getDisplay()));
		}
		/******************** Provnce_Actvty_Cdg_Vrsn ********************************************************************************/
		if(provenanceactivitycoding.hasVersion()) {
			p.setProvnceActvtyCdgVrsn(String.valueOf(provenanceactivitycoding.getVersion()));
		}
		/******************** Provnce_Actvty_Cdg_Cd ********************************************************************************/
		if(provenanceactivitycoding.hasCode()) {
			p.setProvnceActvtyCdgCd(String.valueOf(provenanceactivitycoding.getCode()));
		}
		/******************** Provnce_Actvty_Cdg_Sys ********************************************************************************/
		if(provenanceactivitycoding.hasSystem()) {
			p.setProvnceActvtyCdgSys(String.valueOf(provenanceactivitycoding.getSystem()));
		}
		/******************** Provnce_Actvty_Cdg_UsrSltd ********************************************************************************/
		if(provenanceactivitycoding.hasUserSelected()) {
			p.setProvnceActvtyCdgUsrSltd(String.valueOf(provenanceactivitycoding.getUserSelected()));
		}
		/******************** Provnce_Actvty_Txt ********************************************************************************/
		if(provenanceactivity.hasText()) {
			p.setProvnceActvtyTxt(String.valueOf(provenanceactivity.getText()));
		}
		/******************** provenanceentity ********************************************************************************/
		org.hl7.fhir.r4.model.Provenance.ProvenanceEntityComponent provenanceentity = provenance.getEntityFirstRep();

		/******************** provenanceentityagent ********************************************************************************/
		org.hl7.fhir.r4.model.Provenance.ProvenanceAgentComponent provenanceentityagent = provenanceentity.getAgentFirstRep();

		/******************** provenanceentityagenttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept provenanceentityagenttype = provenanceentityagent.getType();

		/******************** provenanceentityagenttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding provenanceentityagenttypecoding = provenanceentityagenttype.getCodingFirstRep();

		/******************** Provnce_Entity_Agnt_Typ_Cdg_Dsply ********************************************************************************/
		if(provenanceentityagenttypecoding.hasDisplay()) {
			p.setProvnceEntityAgntTypCdgDsply(String.valueOf(provenanceentityagenttypecoding.getDisplay()));
		}
		/******************** Provnce_Entity_Agnt_Typ_Cdg_Vrsn ********************************************************************************/
		if(provenanceentityagenttypecoding.hasVersion()) {
			p.setProvnceEntityAgntTypCdgVrsn(String.valueOf(provenanceentityagenttypecoding.getVersion()));
		}
		/******************** Provnce_Entity_Agnt_Typ_Cdg_Cd ********************************************************************************/
		if(provenanceentityagenttypecoding.hasCode()) {
			p.setProvnceEntityAgntTypCdgCd(String.valueOf(provenanceentityagenttypecoding.getCode()));
		}
		/******************** Provnce_Entity_Agnt_Typ_Cdg_Sys ********************************************************************************/
		if(provenanceentityagenttypecoding.hasSystem()) {
			p.setProvnceEntityAgntTypCdgSys(String.valueOf(provenanceentityagenttypecoding.getSystem()));
		}
		/******************** Provnce_Entity_Agnt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(provenanceentityagenttypecoding.hasUserSelected()) {
			p.setProvnceEntityAgntTypCdgUsrSltd(String.valueOf(provenanceentityagenttypecoding.getUserSelected()));
		}
		/******************** Provnce_Entity_Agnt_Typ_Txt ********************************************************************************/
		if(provenanceentityagenttype.hasText()) {
			p.setProvnceEntityAgntTypTxt(String.valueOf(provenanceentityagenttype.getText()));
		}
		/******************** Provnce_Entity_Agnt_OnBehalfOf ********************************************************************************/
		if(provenanceentityagent.hasOnBehalfOf()) {
			p.setProvnceEntityAgntOnBehalfOf(String.valueOf(provenanceentityagent.getOnBehalfOf()));
		}
		/******************** Provnce_Entity_Agnt_Who ********************************************************************************/
		if(provenanceentityagent.hasWho()) {
			p.setProvnceEntityAgntWho(String.valueOf(provenanceentityagent.getWho()));
		}
		/******************** provenanceentityagentrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept provenanceentityagentrole = provenanceentityagent.getRoleFirstRep();

		/******************** provenanceentityagentrolecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding provenanceentityagentrolecoding = provenanceentityagentrole.getCodingFirstRep();

		/******************** Provnce_Entity_Agnt_Role_Cdg_Dsply ********************************************************************************/
		if(provenanceentityagentrolecoding.hasDisplay()) {
			p.setProvnceEntityAgntRoleCdgDsply(String.valueOf(provenanceentityagentrolecoding.getDisplay()));
		}
		/******************** Provnce_Entity_Agnt_Role_Cdg_Vrsn ********************************************************************************/
		if(provenanceentityagentrolecoding.hasVersion()) {
			p.setProvnceEntityAgntRoleCdgVrsn(String.valueOf(provenanceentityagentrolecoding.getVersion()));
		}
		/******************** Provnce_Entity_Agnt_Role_Cdg_Cd ********************************************************************************/
		if(provenanceentityagentrolecoding.hasCode()) {
			p.setProvnceEntityAgntRoleCdgCd(String.valueOf(provenanceentityagentrolecoding.getCode()));
		}
		/******************** Provnce_Entity_Agnt_Role_Cdg_Sys ********************************************************************************/
		if(provenanceentityagentrolecoding.hasSystem()) {
			p.setProvnceEntityAgntRoleCdgSys(String.valueOf(provenanceentityagentrolecoding.getSystem()));
		}
		/******************** Provnce_Entity_Agnt_Role_Cdg_UsrSltd ********************************************************************************/
		if(provenanceentityagentrolecoding.hasUserSelected()) {
			p.setProvnceEntityAgntRoleCdgUsrSltd(String.valueOf(provenanceentityagentrolecoding.getUserSelected()));
		}
		/******************** Provnce_Entity_Agnt_Role_Txt ********************************************************************************/
		if(provenanceentityagentrole.hasText()) {
			p.setProvnceEntityAgntRoleTxt(String.valueOf(provenanceentityagentrole.getText()));
		}
		/******************** Provnce_Entity_What ********************************************************************************/
		if(provenanceentity.hasWhat()) {
			p.setProvnceEntityWhat(String.valueOf(provenanceentity.getWhat()));
		}
		/******************** provenanceentityrole ********************************************************************************/
		org.hl7.fhir.r4.model.Provenance.ProvenanceEntityRole provenanceentityrole = provenanceentity.getRole();
		p.setProvnceEntityRole(provenanceentityrole.toCode());

		/******************** provenancereason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept provenancereason = provenance.getReasonFirstRep();

		/******************** provenancereasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding provenancereasoncoding = provenancereason.getCodingFirstRep();

		/******************** Provnce_Rsn_Cdg_Dsply ********************************************************************************/
		if(provenancereasoncoding.hasDisplay()) {
			p.setProvnceRsnCdgDsply(String.valueOf(provenancereasoncoding.getDisplay()));
		}
		/******************** Provnce_Rsn_Cdg_Vrsn ********************************************************************************/
		if(provenancereasoncoding.hasVersion()) {
			p.setProvnceRsnCdgVrsn(String.valueOf(provenancereasoncoding.getVersion()));
		}
		/******************** Provnce_Rsn_Cdg_Cd ********************************************************************************/
		if(provenancereasoncoding.hasCode()) {
			p.setProvnceRsnCdgCd(String.valueOf(provenancereasoncoding.getCode()));
		}
		/******************** Provnce_Rsn_Cdg_Sys ********************************************************************************/
		if(provenancereasoncoding.hasSystem()) {
			p.setProvnceRsnCdgSys(String.valueOf(provenancereasoncoding.getSystem()));
		}
		/******************** Provnce_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(provenancereasoncoding.hasUserSelected()) {
			p.setProvnceRsnCdgUsrSltd(String.valueOf(provenancereasoncoding.getUserSelected()));
		}
		/******************** Provnce_Rsn_Txt ********************************************************************************/
		if(provenancereason.hasText()) {
			p.setProvnceRsnTxt(String.valueOf(provenancereason.getText()));
		}
		/******************** Provnce_OccurredDtTimeTyp ********************************************************************************/
		if(provenance.hasOccurredDateTimeType()) {
			p.setProvnceOccurredDtTimeTyp(String.valueOf(provenance.getOccurredDateTimeType()));
		}
		/******************** provenancesignature ********************************************************************************/
		org.hl7.fhir.r4.model.Signature provenancesignature = provenance.getSignatureFirstRep();

		/******************** provenancesignaturetype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding provenancesignaturetype = provenancesignature.getTypeFirstRep();

		/******************** Provnce_Signature_Typ_Dsply ********************************************************************************/
		if(provenancesignaturetype.hasDisplay()) {
			p.setProvnceSignatureTypDsply(String.valueOf(provenancesignaturetype.getDisplay()));
		}
		/******************** Provnce_Signature_Typ_Vrsn ********************************************************************************/
		if(provenancesignaturetype.hasVersion()) {
			p.setProvnceSignatureTypVrsn(String.valueOf(provenancesignaturetype.getVersion()));
		}
		/******************** Provnce_Signature_Typ_Cd ********************************************************************************/
		if(provenancesignaturetype.hasCode()) {
			p.setProvnceSignatureTypCd(String.valueOf(provenancesignaturetype.getCode()));
		}
		/******************** Provnce_Signature_Typ_Sys ********************************************************************************/
		if(provenancesignaturetype.hasSystem()) {
			p.setProvnceSignatureTypSys(String.valueOf(provenancesignaturetype.getSystem()));
		}
		/******************** Provnce_Signature_Typ_UsrSltd ********************************************************************************/
		if(provenancesignaturetype.hasUserSelected()) {
			p.setProvnceSignatureTypUsrSltd(String.valueOf(provenancesignaturetype.getUserSelected()));
		}
		/******************** Provnce_Signature_OnBehalfOf ********************************************************************************/
		if(provenancesignature.hasOnBehalfOf()) {
			p.setProvnceSignatureOnBehalfOf(String.valueOf(provenancesignature.getOnBehalfOf()));
		}
		/******************** Provnce_Signature_Who ********************************************************************************/
		if(provenancesignature.hasWho()) {
			p.setProvnceSignatureWho(String.valueOf(provenancesignature.getWho()));
		}
		/******************** Provnce_Signature_TarFrmat ********************************************************************************/
		if(provenancesignature.hasTargetFormat()) {
			p.setProvnceSignatureTarFrmat(String.valueOf(provenancesignature.getTargetFormat()));
		}
		/******************** Provnce_Signature_SigFrmat ********************************************************************************/
		if(provenancesignature.hasSigFormat()) {
			p.setProvnceSignatureSigFrmat(String.valueOf(provenancesignature.getSigFormat()));
		}
		/******************** Provnce_Signature_When ********************************************************************************/
		if(provenancesignature.hasWhen()) {
			p.setProvnceSignatureWhen(String.valueOf(provenancesignature.getWhen()));
		}
		/******************** Provnce_Signature_Data ********************************************************************************/
		if(provenancesignature.hasData()) {
			p.setProvnceSignatureData(String.valueOf(provenancesignature.getData()));
		}

		return p;
	}
}
