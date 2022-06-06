package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Provenance;
public class ProvenanceConversion 
{
	public org.hl7.fhir.r4.model.Provenance Provenances(Provenance p) throws ParseException
	{
		org.hl7.fhir.r4.model.Provenance provenance = new org.hl7.fhir.r4.model.Provenance();

		/******************** id ********************************************************************************/
		provenance.setId(p.getId());

		/******************** provenanceactivity ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept provenanceactivity =  new org.hl7.fhir.r4.model.CodeableConcept();
		provenance.setActivity(provenanceactivity);

		/******************** provenanceactivitycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding provenanceactivitycoding =  new org.hl7.fhir.r4.model.Coding();
		provenanceactivity.addCoding(provenanceactivitycoding);

		/******************** Provnce_Actvty_Cdg_Cd ********************************************************************************/
		if(p.getProvnceActvtyCdgCd() != null) {
			provenanceactivitycoding.setCode(p.getProvnceActvtyCdgCd());
		}
		/******************** Provnce_Actvty_Cdg_Dsply ********************************************************************************/
		if(p.getProvnceActvtyCdgDsply() != null) {
			provenanceactivitycoding.setDisplay(p.getProvnceActvtyCdgDsply());
		}
		/******************** Provnce_Actvty_Cdg_Sys ********************************************************************************/
		if(p.getProvnceActvtyCdgSys() != null) {
			provenanceactivitycoding.setSystem(p.getProvnceActvtyCdgSys());
		}
		/******************** Provnce_Actvty_Cdg_UsrSltd ********************************************************************************/
		if(p.getProvnceActvtyCdgUsrSltd() != null) {
			provenanceactivitycoding.setUserSelected(Boolean.parseBoolean(p.getProvnceActvtyCdgUsrSltd()));
		}
		/******************** Provnce_Actvty_Cdg_Vrsn ********************************************************************************/
		if(p.getProvnceActvtyCdgVrsn() != null) {
			provenanceactivitycoding.setVersion(p.getProvnceActvtyCdgVrsn());
		}
		/******************** Provnce_Actvty_Txt ********************************************************************************/
		if(p.getProvnceActvtyTxt() != null) {
			provenanceactivity.setText(p.getProvnceActvtyTxt());
		}
		/******************** provenanceagent ********************************************************************************/
		org.hl7.fhir.r4.model.Provenance.ProvenanceAgentComponent provenanceagent =  new org.hl7.fhir.r4.model.Provenance.ProvenanceAgentComponent();
		provenance.addAgent(provenanceagent);

		/******************** Provnce_Agnt_OnBehalfOf ********************************************************************************/
		if(p.getProvnceAgntOnBehalfOf() != null) {
			provenanceagent.setOnBehalfOf( new org.hl7.fhir.r4.model.Reference(p.getProvnceAgntOnBehalfOf()));
		}
		/******************** provenanceagentrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept provenanceagentrole =  new org.hl7.fhir.r4.model.CodeableConcept();
		provenanceagent.addRole(provenanceagentrole);

		/******************** provenanceagentrolecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding provenanceagentrolecoding =  new org.hl7.fhir.r4.model.Coding();
		provenanceagentrole.addCoding(provenanceagentrolecoding);

		/******************** Provnce_Agnt_Role_Cdg_Cd ********************************************************************************/
		if(p.getProvnceAgntRoleCdgCd() != null) {
			provenanceagentrolecoding.setCode(p.getProvnceAgntRoleCdgCd());
		}
		/******************** Provnce_Agnt_Role_Cdg_Dsply ********************************************************************************/
		if(p.getProvnceAgntRoleCdgDsply() != null) {
			provenanceagentrolecoding.setDisplay(p.getProvnceAgntRoleCdgDsply());
		}
		/******************** Provnce_Agnt_Role_Cdg_Sys ********************************************************************************/
		if(p.getProvnceAgntRoleCdgSys() != null) {
			provenanceagentrolecoding.setSystem(p.getProvnceAgntRoleCdgSys());
		}
		/******************** Provnce_Agnt_Role_Cdg_UsrSltd ********************************************************************************/
		if(p.getProvnceAgntRoleCdgUsrSltd() != null) {
			provenanceagentrolecoding.setUserSelected(Boolean.parseBoolean(p.getProvnceAgntRoleCdgUsrSltd()));
		}
		/******************** Provnce_Agnt_Role_Cdg_Vrsn ********************************************************************************/
		if(p.getProvnceAgntRoleCdgVrsn() != null) {
			provenanceagentrolecoding.setVersion(p.getProvnceAgntRoleCdgVrsn());
		}
		/******************** Provnce_Agnt_Role_Txt ********************************************************************************/
		if(p.getProvnceAgntRoleTxt() != null) {
			provenanceagentrole.setText(p.getProvnceAgntRoleTxt());
		}
		/******************** provenanceagenttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept provenanceagenttype =  new org.hl7.fhir.r4.model.CodeableConcept();
		provenanceagent.setType(provenanceagenttype);

		/******************** provenanceagenttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding provenanceagenttypecoding =  new org.hl7.fhir.r4.model.Coding();
		provenanceagenttype.addCoding(provenanceagenttypecoding);

		/******************** Provnce_Agnt_Typ_Cdg_Cd ********************************************************************************/
		if(p.getProvnceAgntTypCdgCd() != null) {
			provenanceagenttypecoding.setCode(p.getProvnceAgntTypCdgCd());
		}
		/******************** Provnce_Agnt_Typ_Cdg_Dsply ********************************************************************************/
		if(p.getProvnceAgntTypCdgDsply() != null) {
			provenanceagenttypecoding.setDisplay(p.getProvnceAgntTypCdgDsply());
		}
		/******************** Provnce_Agnt_Typ_Cdg_Sys ********************************************************************************/
		if(p.getProvnceAgntTypCdgSys() != null) {
			provenanceagenttypecoding.setSystem(p.getProvnceAgntTypCdgSys());
		}
		/******************** Provnce_Agnt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(p.getProvnceAgntTypCdgUsrSltd() != null) {
			provenanceagenttypecoding.setUserSelected(Boolean.parseBoolean(p.getProvnceAgntTypCdgUsrSltd()));
		}
		/******************** Provnce_Agnt_Typ_Cdg_Vrsn ********************************************************************************/
		if(p.getProvnceAgntTypCdgVrsn() != null) {
			provenanceagenttypecoding.setVersion(p.getProvnceAgntTypCdgVrsn());
		}
		/******************** Provnce_Agnt_Typ_Txt ********************************************************************************/
		if(p.getProvnceAgntTypTxt() != null) {
			provenanceagenttype.setText(p.getProvnceAgntTypTxt());
		}
		/******************** Provnce_Agnt_Who ********************************************************************************/
		if(p.getProvnceAgntWho() != null) {
			provenanceagent.setWho( new org.hl7.fhir.r4.model.Reference(p.getProvnceAgntWho()));
		}
		/******************** provenanceentity ********************************************************************************/
		org.hl7.fhir.r4.model.Provenance.ProvenanceEntityComponent provenanceentity =  new org.hl7.fhir.r4.model.Provenance.ProvenanceEntityComponent();
		provenance.addEntity(provenanceentity);

		/******************** provenanceentityagent ********************************************************************************/
		org.hl7.fhir.r4.model.Provenance.ProvenanceAgentComponent provenanceentityagent =  new org.hl7.fhir.r4.model.Provenance.ProvenanceAgentComponent();
		provenanceentity.addAgent(provenanceentityagent);

		/******************** Provnce_Entity_Agnt_OnBehalfOf ********************************************************************************/
		if(p.getProvnceEntityAgntOnBehalfOf() != null) {
			provenanceentityagent.setOnBehalfOf( new org.hl7.fhir.r4.model.Reference(p.getProvnceEntityAgntOnBehalfOf()));
		}
		/******************** provenanceentityagentrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept provenanceentityagentrole =  new org.hl7.fhir.r4.model.CodeableConcept();
		provenanceentityagent.addRole(provenanceentityagentrole);

		/******************** provenanceentityagentrolecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding provenanceentityagentrolecoding =  new org.hl7.fhir.r4.model.Coding();
		provenanceentityagentrole.addCoding(provenanceentityagentrolecoding);

		/******************** Provnce_Entity_Agnt_Role_Cdg_Cd ********************************************************************************/
		if(p.getProvnceEntityAgntRoleCdgCd() != null) {
			provenanceentityagentrolecoding.setCode(p.getProvnceEntityAgntRoleCdgCd());
		}
		/******************** Provnce_Entity_Agnt_Role_Cdg_Dsply ********************************************************************************/
		if(p.getProvnceEntityAgntRoleCdgDsply() != null) {
			provenanceentityagentrolecoding.setDisplay(p.getProvnceEntityAgntRoleCdgDsply());
		}
		/******************** Provnce_Entity_Agnt_Role_Cdg_Sys ********************************************************************************/
		if(p.getProvnceEntityAgntRoleCdgSys() != null) {
			provenanceentityagentrolecoding.setSystem(p.getProvnceEntityAgntRoleCdgSys());
		}
		/******************** Provnce_Entity_Agnt_Role_Cdg_UsrSltd ********************************************************************************/
		if(p.getProvnceEntityAgntRoleCdgUsrSltd() != null) {
			provenanceentityagentrolecoding.setUserSelected(Boolean.parseBoolean(p.getProvnceEntityAgntRoleCdgUsrSltd()));
		}
		/******************** Provnce_Entity_Agnt_Role_Cdg_Vrsn ********************************************************************************/
		if(p.getProvnceEntityAgntRoleCdgVrsn() != null) {
			provenanceentityagentrolecoding.setVersion(p.getProvnceEntityAgntRoleCdgVrsn());
		}
		/******************** Provnce_Entity_Agnt_Role_Txt ********************************************************************************/
		if(p.getProvnceEntityAgntRoleTxt() != null) {
			provenanceentityagentrole.setText(p.getProvnceEntityAgntRoleTxt());
		}
		/******************** provenanceentityagenttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept provenanceentityagenttype =  new org.hl7.fhir.r4.model.CodeableConcept();
		provenanceentityagent.setType(provenanceentityagenttype);

		/******************** provenanceentityagenttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding provenanceentityagenttypecoding =  new org.hl7.fhir.r4.model.Coding();
		provenanceentityagenttype.addCoding(provenanceentityagenttypecoding);

		/******************** Provnce_Entity_Agnt_Typ_Cdg_Cd ********************************************************************************/
		if(p.getProvnceEntityAgntTypCdgCd() != null) {
			provenanceentityagenttypecoding.setCode(p.getProvnceEntityAgntTypCdgCd());
		}
		/******************** Provnce_Entity_Agnt_Typ_Cdg_Dsply ********************************************************************************/
		if(p.getProvnceEntityAgntTypCdgDsply() != null) {
			provenanceentityagenttypecoding.setDisplay(p.getProvnceEntityAgntTypCdgDsply());
		}
		/******************** Provnce_Entity_Agnt_Typ_Cdg_Sys ********************************************************************************/
		if(p.getProvnceEntityAgntTypCdgSys() != null) {
			provenanceentityagenttypecoding.setSystem(p.getProvnceEntityAgntTypCdgSys());
		}
		/******************** Provnce_Entity_Agnt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(p.getProvnceEntityAgntTypCdgUsrSltd() != null) {
			provenanceentityagenttypecoding.setUserSelected(Boolean.parseBoolean(p.getProvnceEntityAgntTypCdgUsrSltd()));
		}
		/******************** Provnce_Entity_Agnt_Typ_Cdg_Vrsn ********************************************************************************/
		if(p.getProvnceEntityAgntTypCdgVrsn() != null) {
			provenanceentityagenttypecoding.setVersion(p.getProvnceEntityAgntTypCdgVrsn());
		}
		/******************** Provnce_Entity_Agnt_Typ_Txt ********************************************************************************/
		if(p.getProvnceEntityAgntTypTxt() != null) {
			provenanceentityagenttype.setText(p.getProvnceEntityAgntTypTxt());
		}
		/******************** Provnce_Entity_Agnt_Who ********************************************************************************/
		if(p.getProvnceEntityAgntWho() != null) {
			provenanceentityagent.setWho( new org.hl7.fhir.r4.model.Reference(p.getProvnceEntityAgntWho()));
		}
		/******************** provenanceentityrole ********************************************************************************/
		org.hl7.fhir.r4.model.Provenance.ProvenanceEntityRoleEnumFactory provenanceentityrole =  new org.hl7.fhir.r4.model.Provenance.ProvenanceEntityRoleEnumFactory();
		provenanceentity.setRole(provenanceentityrole.fromCode(p.getProvnceEntityRole()));

		/******************** Provnce_Entity_What ********************************************************************************/
		if(p.getProvnceEntityWhat() != null) {
			provenanceentity.setWhat( new org.hl7.fhir.r4.model.Reference(p.getProvnceEntityWhat()));
		}
		/******************** Provnce_Lctn ********************************************************************************/
		if(p.getProvnceLctn() != null) {
			provenance.setLocation( new org.hl7.fhir.r4.model.Reference(p.getProvnceLctn()));
		}
		/******************** Provnce_OccurredDtTimeTyp ********************************************************************************/
		if(p.getProvnceOccurredDtTimeTyp() != null) {
			provenance.setOccurred( new org.hl7.fhir.r4.model.DateTimeType(p.getProvnceOccurredDtTimeTyp()));
		}
		/******************** provenanceoccurredperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period provenanceoccurredperiod =  new org.hl7.fhir.r4.model.Period();
		provenance.setOccurred(provenanceoccurredperiod);

		/******************** Provnce_OccurredPrd_End ********************************************************************************/
		if(p.getProvnceOccurredPrdEnd() != null) {
			java.text.SimpleDateFormat Provnce_OccurredPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Provnce_OccurredPrd_Enddate = Provnce_OccurredPrd_Endsdf.parse(p.getProvnceOccurredPrdEnd());
			provenanceoccurredperiod.setEnd(Provnce_OccurredPrd_Enddate);
		}
		/******************** Provnce_OccurredPrd_Strt ********************************************************************************/
		if(p.getProvnceOccurredPrdStrt() != null) {
			java.text.SimpleDateFormat Provnce_OccurredPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Provnce_OccurredPrd_Strtdate = Provnce_OccurredPrd_Strtsdf.parse(p.getProvnceOccurredPrdStrt());
			provenanceoccurredperiod.setStart(Provnce_OccurredPrd_Strtdate);
		}
		/******************** Provnce_Policy ********************************************************************************/
		if(p.getProvncePolicy() != null) {
			provenance.addPolicy(p.getProvncePolicy());
		}
		/******************** provenancereason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept provenancereason =  new org.hl7.fhir.r4.model.CodeableConcept();
		provenance.addReason(provenancereason);

		/******************** provenancereasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding provenancereasoncoding =  new org.hl7.fhir.r4.model.Coding();
		provenancereason.addCoding(provenancereasoncoding);

		/******************** Provnce_Rsn_Cdg_Cd ********************************************************************************/
		if(p.getProvnceRsnCdgCd() != null) {
			provenancereasoncoding.setCode(p.getProvnceRsnCdgCd());
		}
		/******************** Provnce_Rsn_Cdg_Dsply ********************************************************************************/
		if(p.getProvnceRsnCdgDsply() != null) {
			provenancereasoncoding.setDisplay(p.getProvnceRsnCdgDsply());
		}
		/******************** Provnce_Rsn_Cdg_Sys ********************************************************************************/
		if(p.getProvnceRsnCdgSys() != null) {
			provenancereasoncoding.setSystem(p.getProvnceRsnCdgSys());
		}
		/******************** Provnce_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(p.getProvnceRsnCdgUsrSltd() != null) {
			provenancereasoncoding.setUserSelected(Boolean.parseBoolean(p.getProvnceRsnCdgUsrSltd()));
		}
		/******************** Provnce_Rsn_Cdg_Vrsn ********************************************************************************/
		if(p.getProvnceRsnCdgVrsn() != null) {
			provenancereasoncoding.setVersion(p.getProvnceRsnCdgVrsn());
		}
		/******************** Provnce_Rsn_Txt ********************************************************************************/
		if(p.getProvnceRsnTxt() != null) {
			provenancereason.setText(p.getProvnceRsnTxt());
		}
		/******************** Provnce_Recorded ********************************************************************************/
		if(p.getProvnceRecorded() != null) {
			java.text.SimpleDateFormat Provnce_Recordedsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Provnce_Recordeddate = Provnce_Recordedsdf.parse(p.getProvnceRecorded());
			provenance.setRecorded(Provnce_Recordeddate);
		}
		/******************** provenancesignature ********************************************************************************/
		org.hl7.fhir.r4.model.Signature provenancesignature =  new org.hl7.fhir.r4.model.Signature();
		provenance.addSignature(provenancesignature);

		/******************** Provnce_Signature_Data ********************************************************************************/
		if(p.getProvnceSignatureData() != null) {
			provenancesignature.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(p.getProvnceSignatureData()));
		}
		/******************** Provnce_Signature_OnBehalfOf ********************************************************************************/
		if(p.getProvnceSignatureOnBehalfOf() != null) {
			provenancesignature.setOnBehalfOf( new org.hl7.fhir.r4.model.Reference(p.getProvnceSignatureOnBehalfOf()));
		}
		/******************** Provnce_Signature_SigFrmat ********************************************************************************/
		if(p.getProvnceSignatureSigFrmat() != null) {
			provenancesignature.setSigFormat(p.getProvnceSignatureSigFrmat());
		}
		/******************** Provnce_Signature_TarFrmat ********************************************************************************/
		if(p.getProvnceSignatureTarFrmat() != null) {
			provenancesignature.setTargetFormat(p.getProvnceSignatureTarFrmat());
		}
		/******************** provenancesignaturetype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding provenancesignaturetype =  new org.hl7.fhir.r4.model.Coding();
		provenancesignature.addType(provenancesignaturetype);

		/******************** Provnce_Signature_Typ_Cd ********************************************************************************/
		if(p.getProvnceSignatureTypCd() != null) {
			provenancesignaturetype.setCode(p.getProvnceSignatureTypCd());
		}
		/******************** Provnce_Signature_Typ_Dsply ********************************************************************************/
		if(p.getProvnceSignatureTypDsply() != null) {
			provenancesignaturetype.setDisplay(p.getProvnceSignatureTypDsply());
		}
		/******************** Provnce_Signature_Typ_Sys ********************************************************************************/
		if(p.getProvnceSignatureTypSys() != null) {
			provenancesignaturetype.setSystem(p.getProvnceSignatureTypSys());
		}
		/******************** Provnce_Signature_Typ_UsrSltd ********************************************************************************/
		if(p.getProvnceSignatureTypUsrSltd() != null) {
			provenancesignaturetype.setUserSelected(Boolean.parseBoolean(p.getProvnceSignatureTypUsrSltd()));
		}
		/******************** Provnce_Signature_Typ_Vrsn ********************************************************************************/
		if(p.getProvnceSignatureTypVrsn() != null) {
			provenancesignaturetype.setVersion(p.getProvnceSignatureTypVrsn());
		}
		/******************** Provnce_Signature_When ********************************************************************************/
		if(p.getProvnceSignatureWhen() != null) {
			java.text.SimpleDateFormat Provnce_Signature_Whensdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Provnce_Signature_Whendate = Provnce_Signature_Whensdf.parse(p.getProvnceSignatureWhen());
			provenancesignature.setWhen(Provnce_Signature_Whendate);
		}
		/******************** Provnce_Signature_Who ********************************************************************************/
		if(p.getProvnceSignatureWho() != null) {
			provenancesignature.setWho( new org.hl7.fhir.r4.model.Reference(p.getProvnceSignatureWho()));
		}
		/******************** Provnce_Tar ********************************************************************************/
		if(p.getProvnceTar() != null) {
			provenance.addTarget( new org.hl7.fhir.r4.model.Reference(p.getProvnceTar()));
		}
		return provenance;
	}
}
