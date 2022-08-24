package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.DetectedIssue;
public class DetectedIssueBidirectionalConversion 
{
	public DetectedIssue DetectedIssues(org.hl7.fhir.r4.model.DetectedIssue detectedissue) throws ParseException
	{
		 main.java.com.campfhir.model.DetectedIssue d = new  main.java.com.campfhir.model.DetectedIssue();

		/******************** id ********************************************************************************/
		d.setId(detectedissue.getIdElement().getIdPart());

		/******************** DetectedIssue_Rfrnc ********************************************************************************/
		if(detectedissue.hasReference()) {

			d.addDetectedIssueRfrnc(String.valueOf(detectedissue.getReference()));
		} else {
			d.addDetectedIssueRfrnc("NULL");
		}


		/******************** detectedissuecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept detectedissuecode = detectedissue.getCode();

		/******************** DetectedIssue_Cd_Txt ********************************************************************************/
		if(detectedissuecode.hasText()) {

			d.addDetectedIssueCdTxt(String.valueOf(detectedissuecode.getText()));
		} else {
			d.addDetectedIssueCdTxt("NULL");
		}


		/******************** detectedissuecodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> detectedissuecodecodinglist = detectedissuecode.getCoding();
		for(int detectedissuecodecodingi = 0; detectedissuecodecodingi<detectedissuecodecodinglist.size();detectedissuecodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  detectedissuecodecoding = detectedissuecodecodinglist.get(detectedissuecodecodingi);

		/******************** DetectedIssue_Cd_Cdg_Dsply ********************************************************************************/
		if(detectedissuecodecodingi == 0) {d.addDetectedIssueCdCdgDsply("[");}
		if(detectedissuecodecoding.hasDisplay()) {

			d.addDetectedIssueCdCdgDsply(String.valueOf(detectedissuecodecoding.getDisplay()));
		} else {
			d.addDetectedIssueCdCdgDsply("NULL");
		}

		if(detectedissuecodecodingi == detectedissuecodecodinglist.size()-1) {d.addDetectedIssueCdCdgDsply("]");}


		/******************** DetectedIssue_Cd_Cdg_Vrsn ********************************************************************************/
		if(detectedissuecodecodingi == 0) {d.addDetectedIssueCdCdgVrsn("[");}
		if(detectedissuecodecoding.hasVersion()) {

			d.addDetectedIssueCdCdgVrsn(String.valueOf(detectedissuecodecoding.getVersion()));
		} else {
			d.addDetectedIssueCdCdgVrsn("NULL");
		}

		if(detectedissuecodecodingi == detectedissuecodecodinglist.size()-1) {d.addDetectedIssueCdCdgVrsn("]");}


		/******************** DetectedIssue_Cd_Cdg_Cd ********************************************************************************/
		if(detectedissuecodecodingi == 0) {d.addDetectedIssueCdCdgCd("[");}
		if(detectedissuecodecoding.hasCode()) {

			d.addDetectedIssueCdCdgCd(String.valueOf(detectedissuecodecoding.getCode()));
		} else {
			d.addDetectedIssueCdCdgCd("NULL");
		}

		if(detectedissuecodecodingi == detectedissuecodecodinglist.size()-1) {d.addDetectedIssueCdCdgCd("]");}


		/******************** DetectedIssue_Cd_Cdg_UsrSltd ********************************************************************************/
		if(detectedissuecodecodingi == 0) {d.addDetectedIssueCdCdgUsrSltd("[");}
		if(detectedissuecodecoding.hasUserSelected()) {

			d.addDetectedIssueCdCdgUsrSltd(String.valueOf(detectedissuecodecoding.getUserSelected()));
		} else {
			d.addDetectedIssueCdCdgUsrSltd("NULL");
		}

		if(detectedissuecodecodingi == detectedissuecodecodinglist.size()-1) {d.addDetectedIssueCdCdgUsrSltd("]");}


		/******************** DetectedIssue_Cd_Cdg_Sys ********************************************************************************/
		if(detectedissuecodecodingi == 0) {d.addDetectedIssueCdCdgSys("[");}
		if(detectedissuecodecoding.hasSystem()) {

			d.addDetectedIssueCdCdgSys(String.valueOf(detectedissuecodecoding.getSystem()));
		} else {
			d.addDetectedIssueCdCdgSys("NULL");
		}

		if(detectedissuecodecodingi == detectedissuecodecodinglist.size()-1) {d.addDetectedIssueCdCdgSys("]");}


		 };
		/******************** detectedissuestatus ********************************************************************************/
		org.hl7.fhir.r4.model.DetectedIssue.DetectedIssueStatus detectedissuestatus = detectedissue.getStatus();
		if(detectedissuestatus!=null) {
			d.addDetectedIssueSts(detectedissuestatus.toCode());
		} else {
			d.addDetectedIssueSts("NULL");
		}

		/******************** detectedissueidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> detectedissueidentifierlist = detectedissue.getIdentifier();
		for(int detectedissueidentifieri = 0; detectedissueidentifieri<detectedissueidentifierlist.size();detectedissueidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  detectedissueidentifier = detectedissueidentifierlist.get(detectedissueidentifieri);

		/******************** DetectedIssue_Id_Vl ********************************************************************************/
		if(detectedissueidentifieri == 0) {d.addDetectedIssueIdVl("[");}
		if(detectedissueidentifier.hasValue()) {

			d.addDetectedIssueIdVl(String.valueOf(detectedissueidentifier.getValue()));
		} else {
			d.addDetectedIssueIdVl("NULL");
		}

		if(detectedissueidentifieri == detectedissueidentifierlist.size()-1) {d.addDetectedIssueIdVl("]");}


		/******************** detectedissueidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept detectedissueidentifiertype = detectedissueidentifier.getType();

		/******************** DetectedIssue_Id_Typ_Txt ********************************************************************************/
		if(detectedissueidentifieri == 0) {d.addDetectedIssueIdTypTxt("[");}
		if(detectedissueidentifiertype.hasText()) {

			d.addDetectedIssueIdTypTxt(String.valueOf(detectedissueidentifiertype.getText()));
		} else {
			d.addDetectedIssueIdTypTxt("NULL");
		}

		if(detectedissueidentifieri == detectedissueidentifierlist.size()-1) {d.addDetectedIssueIdTypTxt("]");}


		/******************** detectedissueidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> detectedissueidentifiertypecodinglist = detectedissueidentifiertype.getCoding();
		for(int detectedissueidentifiertypecodingi = 0; detectedissueidentifiertypecodingi<detectedissueidentifiertypecodinglist.size();detectedissueidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  detectedissueidentifiertypecoding = detectedissueidentifiertypecodinglist.get(detectedissueidentifiertypecodingi);

		/******************** DetectedIssue_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(detectedissueidentifiertypecodingi == 0) {d.addDetectedIssueIdTypCdgDsply("[[");}
		if(detectedissueidentifiertypecoding.hasDisplay()) {

			d.addDetectedIssueIdTypCdgDsply(String.valueOf(detectedissueidentifiertypecoding.getDisplay()));
		} else {
			d.addDetectedIssueIdTypCdgDsply("NULL");
		}

		if(detectedissueidentifiertypecodingi == detectedissueidentifiertypecodinglist.size()-1) {d.addDetectedIssueIdTypCdgDsply("]]");}


		/******************** DetectedIssue_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(detectedissueidentifiertypecodingi == 0) {d.addDetectedIssueIdTypCdgVrsn("[[");}
		if(detectedissueidentifiertypecoding.hasVersion()) {

			d.addDetectedIssueIdTypCdgVrsn(String.valueOf(detectedissueidentifiertypecoding.getVersion()));
		} else {
			d.addDetectedIssueIdTypCdgVrsn("NULL");
		}

		if(detectedissueidentifiertypecodingi == detectedissueidentifiertypecodinglist.size()-1) {d.addDetectedIssueIdTypCdgVrsn("]]");}


		/******************** DetectedIssue_Id_Typ_Cdg_Cd ********************************************************************************/
		if(detectedissueidentifiertypecodingi == 0) {d.addDetectedIssueIdTypCdgCd("[[");}
		if(detectedissueidentifiertypecoding.hasCode()) {

			d.addDetectedIssueIdTypCdgCd(String.valueOf(detectedissueidentifiertypecoding.getCode()));
		} else {
			d.addDetectedIssueIdTypCdgCd("NULL");
		}

		if(detectedissueidentifiertypecodingi == detectedissueidentifiertypecodinglist.size()-1) {d.addDetectedIssueIdTypCdgCd("]]");}


		/******************** DetectedIssue_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(detectedissueidentifiertypecodingi == 0) {d.addDetectedIssueIdTypCdgUsrSltd("[[");}
		if(detectedissueidentifiertypecoding.hasUserSelected()) {

			d.addDetectedIssueIdTypCdgUsrSltd(String.valueOf(detectedissueidentifiertypecoding.getUserSelected()));
		} else {
			d.addDetectedIssueIdTypCdgUsrSltd("NULL");
		}

		if(detectedissueidentifiertypecodingi == detectedissueidentifiertypecodinglist.size()-1) {d.addDetectedIssueIdTypCdgUsrSltd("]]");}


		/******************** DetectedIssue_Id_Typ_Cdg_Sys ********************************************************************************/
		if(detectedissueidentifiertypecodingi == 0) {d.addDetectedIssueIdTypCdgSys("[[");}
		if(detectedissueidentifiertypecoding.hasSystem()) {

			d.addDetectedIssueIdTypCdgSys(String.valueOf(detectedissueidentifiertypecoding.getSystem()));
		} else {
			d.addDetectedIssueIdTypCdgSys("NULL");
		}

		if(detectedissueidentifiertypecodingi == detectedissueidentifiertypecodinglist.size()-1) {d.addDetectedIssueIdTypCdgSys("]]");}


		 };
		/******************** detectedissueidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period detectedissueidentifierperiod = detectedissueidentifier.getPeriod();

		/******************** DetectedIssue_Id_Prd_Strt ********************************************************************************/
		if(detectedissueidentifieri == 0) {d.addDetectedIssueIdPrdStrt("[");}
		if(detectedissueidentifierperiod.hasStart()) {

			d.addDetectedIssueIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(detectedissueidentifierperiod.getStart())+"\"");
		} else {
			d.addDetectedIssueIdPrdStrt("NULL");
		}

		if(detectedissueidentifieri == detectedissueidentifierlist.size()-1) {d.addDetectedIssueIdPrdStrt("]");}


		/******************** DetectedIssue_Id_Prd_End ********************************************************************************/
		if(detectedissueidentifieri == 0) {d.addDetectedIssueIdPrdEnd("[");}
		if(detectedissueidentifierperiod.hasEnd()) {

			d.addDetectedIssueIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(detectedissueidentifierperiod.getEnd())+"\"");
		} else {
			d.addDetectedIssueIdPrdEnd("NULL");
		}

		if(detectedissueidentifieri == detectedissueidentifierlist.size()-1) {d.addDetectedIssueIdPrdEnd("]");}


		/******************** detectedissueidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse detectedissueidentifieruse = detectedissueidentifier.getUse();
		if(detectedissueidentifieruse!=null) {
		if(detectedissueidentifieri == 0) {

		d.addDetectedIssueIdUse("[");		}
			d.addDetectedIssueIdUse(detectedissueidentifieruse.toCode());
		if(detectedissueidentifieri == detectedissueidentifierlist.size()-1) {

		d.addDetectedIssueIdUse("]");		}

		} else {
			d.addDetectedIssueIdUse("NULL");
		}

		/******************** DetectedIssue_Id_Assigner ********************************************************************************/
		if(detectedissueidentifieri == 0) {d.addDetectedIssueIdAssigner("[");}
		if(detectedissueidentifier.hasAssigner()) {

			if(detectedissueidentifier.getAssigner().getReference() != null) {
			d.addDetectedIssueIdAssigner(detectedissueidentifier.getAssigner().getReference());
			}
		} else {
			d.addDetectedIssueIdAssigner("NULL");
		}

		if(detectedissueidentifieri == detectedissueidentifierlist.size()-1) {d.addDetectedIssueIdAssigner("]");}


		/******************** DetectedIssue_Id_Sys ********************************************************************************/
		if(detectedissueidentifieri == 0) {d.addDetectedIssueIdSys("[");}
		if(detectedissueidentifier.hasSystem()) {

			d.addDetectedIssueIdSys(String.valueOf(detectedissueidentifier.getSystem()));
		} else {
			d.addDetectedIssueIdSys("NULL");
		}

		if(detectedissueidentifieri == detectedissueidentifierlist.size()-1) {d.addDetectedIssueIdSys("]");}


		 };
		/******************** DetectedIssue_Dtl ********************************************************************************/
		if(detectedissue.hasDetail()) {

			d.addDetectedIssueDtl(String.valueOf(detectedissue.getDetail()));
		} else {
			d.addDetectedIssueDtl("NULL");
		}


		/******************** detectedissueseverity ********************************************************************************/
		org.hl7.fhir.r4.model.DetectedIssue.DetectedIssueSeverity detectedissueseverity = detectedissue.getSeverity();
		if(detectedissueseverity!=null) {
			d.addDetectedIssueSeverity(detectedissueseverity.toCode());
		} else {
			d.addDetectedIssueSeverity("NULL");
		}

		/******************** detectedissueevidence ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DetectedIssue.DetectedIssueEvidenceComponent> detectedissueevidencelist = detectedissue.getEvidence();
		for(int detectedissueevidencei = 0; detectedissueevidencei<detectedissueevidencelist.size();detectedissueevidencei++ ) {
		org.hl7.fhir.r4.model.DetectedIssue.DetectedIssueEvidenceComponent  detectedissueevidence = detectedissueevidencelist.get(detectedissueevidencei);

		/******************** detectedissueevidencecode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> detectedissueevidencecodelist = detectedissueevidence.getCode();
		for(int detectedissueevidencecodei = 0; detectedissueevidencecodei<detectedissueevidencecodelist.size();detectedissueevidencecodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  detectedissueevidencecode = detectedissueevidencecodelist.get(detectedissueevidencecodei);

		/******************** DetectedIssue_Evdnce_Cd_Txt ********************************************************************************/
		if(detectedissueevidencecodei == 0) {d.addDetectedIssueEvdnceCdTxt("[[");}
		if(detectedissueevidencecode.hasText()) {

			d.addDetectedIssueEvdnceCdTxt(String.valueOf(detectedissueevidencecode.getText()));
		} else {
			d.addDetectedIssueEvdnceCdTxt("NULL");
		}

		if(detectedissueevidencecodei == detectedissueevidencecodelist.size()-1) {d.addDetectedIssueEvdnceCdTxt("]]");}


		/******************** detectedissueevidencecodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> detectedissueevidencecodecodinglist = detectedissueevidencecode.getCoding();
		for(int detectedissueevidencecodecodingi = 0; detectedissueevidencecodecodingi<detectedissueevidencecodecodinglist.size();detectedissueevidencecodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  detectedissueevidencecodecoding = detectedissueevidencecodecodinglist.get(detectedissueevidencecodecodingi);

		/******************** DetectedIssue_Evdnce_Cd_Cdg_Dsply ********************************************************************************/
		if(detectedissueevidencecodecodingi == 0) {d.addDetectedIssueEvdnceCdCdgDsply("[[[");}
		if(detectedissueevidencecodecoding.hasDisplay()) {

			d.addDetectedIssueEvdnceCdCdgDsply(String.valueOf(detectedissueevidencecodecoding.getDisplay()));
		} else {
			d.addDetectedIssueEvdnceCdCdgDsply("NULL");
		}

		if(detectedissueevidencecodecodingi == detectedissueevidencecodecodinglist.size()-1) {d.addDetectedIssueEvdnceCdCdgDsply("]]]");}


		/******************** DetectedIssue_Evdnce_Cd_Cdg_Vrsn ********************************************************************************/
		if(detectedissueevidencecodecodingi == 0) {d.addDetectedIssueEvdnceCdCdgVrsn("[[[");}
		if(detectedissueevidencecodecoding.hasVersion()) {

			d.addDetectedIssueEvdnceCdCdgVrsn(String.valueOf(detectedissueevidencecodecoding.getVersion()));
		} else {
			d.addDetectedIssueEvdnceCdCdgVrsn("NULL");
		}

		if(detectedissueevidencecodecodingi == detectedissueevidencecodecodinglist.size()-1) {d.addDetectedIssueEvdnceCdCdgVrsn("]]]");}


		/******************** DetectedIssue_Evdnce_Cd_Cdg_Cd ********************************************************************************/
		if(detectedissueevidencecodecodingi == 0) {d.addDetectedIssueEvdnceCdCdgCd("[[[");}
		if(detectedissueevidencecodecoding.hasCode()) {

			d.addDetectedIssueEvdnceCdCdgCd(String.valueOf(detectedissueevidencecodecoding.getCode()));
		} else {
			d.addDetectedIssueEvdnceCdCdgCd("NULL");
		}

		if(detectedissueevidencecodecodingi == detectedissueevidencecodecodinglist.size()-1) {d.addDetectedIssueEvdnceCdCdgCd("]]]");}


		/******************** DetectedIssue_Evdnce_Cd_Cdg_UsrSltd ********************************************************************************/
		if(detectedissueevidencecodecodingi == 0) {d.addDetectedIssueEvdnceCdCdgUsrSltd("[[[");}
		if(detectedissueevidencecodecoding.hasUserSelected()) {

			d.addDetectedIssueEvdnceCdCdgUsrSltd(String.valueOf(detectedissueevidencecodecoding.getUserSelected()));
		} else {
			d.addDetectedIssueEvdnceCdCdgUsrSltd("NULL");
		}

		if(detectedissueevidencecodecodingi == detectedissueevidencecodecodinglist.size()-1) {d.addDetectedIssueEvdnceCdCdgUsrSltd("]]]");}


		/******************** DetectedIssue_Evdnce_Cd_Cdg_Sys ********************************************************************************/
		if(detectedissueevidencecodecodingi == 0) {d.addDetectedIssueEvdnceCdCdgSys("[[[");}
		if(detectedissueevidencecodecoding.hasSystem()) {

			d.addDetectedIssueEvdnceCdCdgSys(String.valueOf(detectedissueevidencecodecoding.getSystem()));
		} else {
			d.addDetectedIssueEvdnceCdCdgSys("NULL");
		}

		if(detectedissueevidencecodecodingi == detectedissueevidencecodecodinglist.size()-1) {d.addDetectedIssueEvdnceCdCdgSys("]]]");}


		 };
		 };
		/******************** DetectedIssue_Evdnce_Dtl ********************************************************************************/
		if(detectedissueevidence.hasDetail()) {

			String  array = "[";
			for(int incr=0; incr<detectedissueevidence.getDetail().size(); incr++) {
				array = array + detectedissueevidence.getDetail().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			d.addDetectedIssueEvdnceDtl(array);

		} else {
			d.addDetectedIssueEvdnceDtl("NULL");
		}


		 };
		/******************** detectedissuemitigation ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DetectedIssue.DetectedIssueMitigationComponent> detectedissuemitigationlist = detectedissue.getMitigation();
		for(int detectedissuemitigationi = 0; detectedissuemitigationi<detectedissuemitigationlist.size();detectedissuemitigationi++ ) {
		org.hl7.fhir.r4.model.DetectedIssue.DetectedIssueMitigationComponent  detectedissuemitigation = detectedissuemitigationlist.get(detectedissuemitigationi);

		/******************** detectedissuemitigationaction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept detectedissuemitigationaction = detectedissuemitigation.getAction();

		/******************** DetectedIssue_Mitigation_Actn_Txt ********************************************************************************/
		if(detectedissuemitigationi == 0) {d.addDetectedIssueMitigationActnTxt("[");}
		if(detectedissuemitigationaction.hasText()) {

			d.addDetectedIssueMitigationActnTxt(String.valueOf(detectedissuemitigationaction.getText()));
		} else {
			d.addDetectedIssueMitigationActnTxt("NULL");
		}

		if(detectedissuemitigationi == detectedissuemitigationlist.size()-1) {d.addDetectedIssueMitigationActnTxt("]");}


		/******************** detectedissuemitigationactioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> detectedissuemitigationactioncodinglist = detectedissuemitigationaction.getCoding();
		for(int detectedissuemitigationactioncodingi = 0; detectedissuemitigationactioncodingi<detectedissuemitigationactioncodinglist.size();detectedissuemitigationactioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  detectedissuemitigationactioncoding = detectedissuemitigationactioncodinglist.get(detectedissuemitigationactioncodingi);

		/******************** DetectedIssue_Mitigation_Actn_Cdg_Dsply ********************************************************************************/
		if(detectedissuemitigationactioncodingi == 0) {d.addDetectedIssueMitigationActnCdgDsply("[[");}
		if(detectedissuemitigationactioncoding.hasDisplay()) {

			d.addDetectedIssueMitigationActnCdgDsply(String.valueOf(detectedissuemitigationactioncoding.getDisplay()));
		} else {
			d.addDetectedIssueMitigationActnCdgDsply("NULL");
		}

		if(detectedissuemitigationactioncodingi == detectedissuemitigationactioncodinglist.size()-1) {d.addDetectedIssueMitigationActnCdgDsply("]]");}


		/******************** DetectedIssue_Mitigation_Actn_Cdg_Vrsn ********************************************************************************/
		if(detectedissuemitigationactioncodingi == 0) {d.addDetectedIssueMitigationActnCdgVrsn("[[");}
		if(detectedissuemitigationactioncoding.hasVersion()) {

			d.addDetectedIssueMitigationActnCdgVrsn(String.valueOf(detectedissuemitigationactioncoding.getVersion()));
		} else {
			d.addDetectedIssueMitigationActnCdgVrsn("NULL");
		}

		if(detectedissuemitigationactioncodingi == detectedissuemitigationactioncodinglist.size()-1) {d.addDetectedIssueMitigationActnCdgVrsn("]]");}


		/******************** DetectedIssue_Mitigation_Actn_Cdg_Cd ********************************************************************************/
		if(detectedissuemitigationactioncodingi == 0) {d.addDetectedIssueMitigationActnCdgCd("[[");}
		if(detectedissuemitigationactioncoding.hasCode()) {

			d.addDetectedIssueMitigationActnCdgCd(String.valueOf(detectedissuemitigationactioncoding.getCode()));
		} else {
			d.addDetectedIssueMitigationActnCdgCd("NULL");
		}

		if(detectedissuemitigationactioncodingi == detectedissuemitigationactioncodinglist.size()-1) {d.addDetectedIssueMitigationActnCdgCd("]]");}


		/******************** DetectedIssue_Mitigation_Actn_Cdg_UsrSltd ********************************************************************************/
		if(detectedissuemitigationactioncodingi == 0) {d.addDetectedIssueMitigationActnCdgUsrSltd("[[");}
		if(detectedissuemitigationactioncoding.hasUserSelected()) {

			d.addDetectedIssueMitigationActnCdgUsrSltd(String.valueOf(detectedissuemitigationactioncoding.getUserSelected()));
		} else {
			d.addDetectedIssueMitigationActnCdgUsrSltd("NULL");
		}

		if(detectedissuemitigationactioncodingi == detectedissuemitigationactioncodinglist.size()-1) {d.addDetectedIssueMitigationActnCdgUsrSltd("]]");}


		/******************** DetectedIssue_Mitigation_Actn_Cdg_Sys ********************************************************************************/
		if(detectedissuemitigationactioncodingi == 0) {d.addDetectedIssueMitigationActnCdgSys("[[");}
		if(detectedissuemitigationactioncoding.hasSystem()) {

			d.addDetectedIssueMitigationActnCdgSys(String.valueOf(detectedissuemitigationactioncoding.getSystem()));
		} else {
			d.addDetectedIssueMitigationActnCdgSys("NULL");
		}

		if(detectedissuemitigationactioncodingi == detectedissuemitigationactioncodinglist.size()-1) {d.addDetectedIssueMitigationActnCdgSys("]]");}


		 };
		/******************** DetectedIssue_Mitigation_Dt ********************************************************************************/
		if(detectedissuemitigationi == 0) {d.addDetectedIssueMitigationDt("[");}
		if(detectedissuemitigation.hasDate()) {

			d.addDetectedIssueMitigationDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(detectedissuemitigation.getDate())+"\"");
		} else {
			d.addDetectedIssueMitigationDt("NULL");
		}

		if(detectedissuemitigationi == detectedissuemitigationlist.size()-1) {d.addDetectedIssueMitigationDt("]");}


		/******************** DetectedIssue_Mitigation_Athr ********************************************************************************/
		if(detectedissuemitigationi == 0) {d.addDetectedIssueMitigationAthr("[");}
		if(detectedissuemitigation.hasAuthor()) {

			if(detectedissuemitigation.getAuthor().getReference() != null) {
			d.addDetectedIssueMitigationAthr(detectedissuemitigation.getAuthor().getReference());
			}
		} else {
			d.addDetectedIssueMitigationAthr("NULL");
		}

		if(detectedissuemitigationi == detectedissuemitigationlist.size()-1) {d.addDetectedIssueMitigationAthr("]");}


		 };
		/******************** DetectedIssue_Pnt ********************************************************************************/
		if(detectedissue.hasPatient()) {

			if(detectedissue.getPatient().getReference() != null) {
			d.addDetectedIssuePnt(detectedissue.getPatient().getReference());
			}
		} else {
			d.addDetectedIssuePnt("NULL");
		}


		/******************** DetectedIssue_IdentifiedDtTimeTyp ********************************************************************************/
		if(detectedissue.hasIdentifiedDateTimeType()) {

			d.addDetectedIssueIdentifiedDtTimeTyp("\""+detectedissue.getIdentifiedDateTimeType().getValueAsString()+"\"");
		} else {
			d.addDetectedIssueIdentifiedDtTimeTyp("NULL");
		}


		/******************** detectedissueidentifiedperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period detectedissueidentifiedperiod = detectedissue.getIdentifiedPeriod();

		/******************** DetectedIssue_IdentifiedPrd_Strt ********************************************************************************/
		if(detectedissueidentifiedperiod.hasStart()) {

			d.addDetectedIssueIdentifiedPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(detectedissueidentifiedperiod.getStart())+"\"");
		} else {
			d.addDetectedIssueIdentifiedPrdStrt("NULL");
		}


		/******************** DetectedIssue_IdentifiedPrd_End ********************************************************************************/
		if(detectedissueidentifiedperiod.hasEnd()) {

			d.addDetectedIssueIdentifiedPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(detectedissueidentifiedperiod.getEnd())+"\"");
		} else {
			d.addDetectedIssueIdentifiedPrdEnd("NULL");
		}


		/******************** DetectedIssue_Implicated ********************************************************************************/
		if(detectedissue.hasImplicated()) {

			String  array = "[";
			for(int incr=0; incr<detectedissue.getImplicated().size(); incr++) {
				array = array + detectedissue.getImplicated().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			d.addDetectedIssueImplicated(array);

		} else {
			d.addDetectedIssueImplicated("NULL");
		}


		/******************** DetectedIssue_Athr ********************************************************************************/
		if(detectedissue.hasAuthor()) {

			if(detectedissue.getAuthor().getReference() != null) {
			d.addDetectedIssueAthr(detectedissue.getAuthor().getReference());
			}
		} else {
			d.addDetectedIssueAthr("NULL");
		}


		return d;
	}
}
