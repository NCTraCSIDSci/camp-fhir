package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.EvidenceVariable;
public class EvidenceVariableBidirectionalConversion 
{
	public EvidenceVariable EvidenceVariables(org.hl7.fhir.r4.model.EvidenceVariable evidencevariable) throws ParseException
	{
		 main.java.com.campfhir.model.EvidenceVariable e = new  main.java.com.campfhir.model.EvidenceVariable();

		/******************** id ********************************************************************************/
		evidencevariable.setId(e.getId());

		/******************** EvdnceVrble_Nm ********************************************************************************/
		if(evidencevariable.hasName()) {
			e.setEvdnceVrbleNm(String.valueOf(evidencevariable.getName()));
		}
		/******************** evidencevariabletype ********************************************************************************/
		org.hl7.fhir.r4.model.EvidenceVariable.EvidenceVariableType evidencevariabletype = evidencevariable.getType();
		e.setEvdnceVrbleTyp(evidencevariabletype.toCode());

		/******************** EvdnceVrble_Dt ********************************************************************************/
		if(evidencevariable.hasDate()) {
			e.setEvdnceVrbleDt(String.valueOf(evidencevariable.getDate()));
		}
		/******************** EvdnceVrble_Vrsn ********************************************************************************/
		if(evidencevariable.hasVersion()) {
			e.setEvdnceVrbleVrsn(String.valueOf(evidencevariable.getVersion()));
		}
		/******************** evidencevariablereviewer ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail evidencevariablereviewer = evidencevariable.getReviewerFirstRep();

		/******************** EvdnceVrble_Rviewr_Nm ********************************************************************************/
		if(evidencevariablereviewer.hasName()) {
			e.setEvdnceVrbleRviewrNm(String.valueOf(evidencevariablereviewer.getName()));
		}
		/******************** evidencevariablereviewertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint evidencevariablereviewertelecom = evidencevariablereviewer.getTelecomFirstRep();

		/******************** EvdnceVrble_Rviewr_Tlcm_Vl ********************************************************************************/
		if(evidencevariablereviewertelecom.hasValue()) {
			e.setEvdnceVrbleRviewrTlcmVl(String.valueOf(evidencevariablereviewertelecom.getValue()));
		}
		/******************** evidencevariablereviewertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencevariablereviewertelecomperiod = evidencevariablereviewertelecom.getPeriod();

		/******************** EvdnceVrble_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(evidencevariablereviewertelecomperiod.hasStart()) {
			e.setEvdnceVrbleRviewrTlcmPrdStrt(String.valueOf(evidencevariablereviewertelecomperiod.getStart()));
		}
		/******************** EvdnceVrble_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(evidencevariablereviewertelecomperiod.hasEnd()) {
			e.setEvdnceVrbleRviewrTlcmPrdEnd(String.valueOf(evidencevariablereviewertelecomperiod.getEnd()));
		}
		/******************** evidencevariablereviewertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem evidencevariablereviewertelecomsystem = evidencevariablereviewertelecom.getSystem();
		e.setEvdnceVrbleRviewrTlcmSys(evidencevariablereviewertelecomsystem.toCode());

		/******************** evidencevariablereviewertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse evidencevariablereviewertelecomuse = evidencevariablereviewertelecom.getUse();
		e.setEvdnceVrbleRviewrTlcmUse(evidencevariablereviewertelecomuse.toCode());

		/******************** EvdnceVrble_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(evidencevariablereviewertelecom.hasRank()) {
			e.setEvdnceVrbleRviewrTlcmRnk(String.valueOf(evidencevariablereviewertelecom.getRank()));
		}
		/******************** evidencevariableendorser ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail evidencevariableendorser = evidencevariable.getEndorserFirstRep();

		/******************** EvdnceVrble_Endsr_Nm ********************************************************************************/
		if(evidencevariableendorser.hasName()) {
			e.setEvdnceVrbleEndsrNm(String.valueOf(evidencevariableendorser.getName()));
		}
		/******************** evidencevariableendorsertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint evidencevariableendorsertelecom = evidencevariableendorser.getTelecomFirstRep();

		/******************** EvdnceVrble_Endsr_Tlcm_Vl ********************************************************************************/
		if(evidencevariableendorsertelecom.hasValue()) {
			e.setEvdnceVrbleEndsrTlcmVl(String.valueOf(evidencevariableendorsertelecom.getValue()));
		}
		/******************** evidencevariableendorsertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencevariableendorsertelecomperiod = evidencevariableendorsertelecom.getPeriod();

		/******************** EvdnceVrble_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(evidencevariableendorsertelecomperiod.hasStart()) {
			e.setEvdnceVrbleEndsrTlcmPrdStrt(String.valueOf(evidencevariableendorsertelecomperiod.getStart()));
		}
		/******************** EvdnceVrble_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(evidencevariableendorsertelecomperiod.hasEnd()) {
			e.setEvdnceVrbleEndsrTlcmPrdEnd(String.valueOf(evidencevariableendorsertelecomperiod.getEnd()));
		}
		/******************** evidencevariableendorsertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem evidencevariableendorsertelecomsystem = evidencevariableendorsertelecom.getSystem();
		e.setEvdnceVrbleEndsrTlcmSys(evidencevariableendorsertelecomsystem.toCode());

		/******************** evidencevariableendorsertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse evidencevariableendorsertelecomuse = evidencevariableendorsertelecom.getUse();
		e.setEvdnceVrbleEndsrTlcmUse(evidencevariableendorsertelecomuse.toCode());

		/******************** EvdnceVrble_Endsr_Tlcm_Rnk ********************************************************************************/
		if(evidencevariableendorsertelecom.hasRank()) {
			e.setEvdnceVrbleEndsrTlcmRnk(String.valueOf(evidencevariableendorsertelecom.getRank()));
		}
		/******************** EvdnceVrble_ShortTtl ********************************************************************************/
		if(evidencevariable.hasShortTitle()) {
			e.setEvdnceVrbleShortTtl(String.valueOf(evidencevariable.getShortTitle()));
		}
		/******************** EvdnceVrble_Ttl ********************************************************************************/
		if(evidencevariable.hasTitle()) {
			e.setEvdnceVrbleTtl(String.valueOf(evidencevariable.getTitle()));
		}
		/******************** EvdnceVrble_Subtitle ********************************************************************************/
		if(evidencevariable.hasSubtitle()) {
			e.setEvdnceVrbleSubtitle(String.valueOf(evidencevariable.getSubtitle()));
		}
		/******************** evidencevariablestatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus evidencevariablestatus = evidencevariable.getStatus();
		e.setEvdnceVrbleSts(evidencevariablestatus.toCode());

		/******************** evidencevariablenote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation evidencevariablenote = evidencevariable.getNoteFirstRep();

		/******************** EvdnceVrble_Nt_Time ********************************************************************************/
		if(evidencevariablenote.hasTime()) {
			e.setEvdnceVrbleNtTime(String.valueOf(evidencevariablenote.getTime()));
		}
		/******************** EvdnceVrble_Nt_Txt ********************************************************************************/
		if(evidencevariablenote.hasText()) {
			e.setEvdnceVrbleNtTxt(String.valueOf(evidencevariablenote.getText()));
		}
		/******************** EvdnceVrble_Nt_AthrRfrnc ********************************************************************************/
		if(evidencevariablenote.hasAuthorReference()) {
			e.setEvdnceVrbleNtAthrRfrnc(String.valueOf(evidencevariablenote.getAuthorReference()));
		}
		/******************** EvdnceVrble_Nt_AthrStrgTyp ********************************************************************************/
		if(evidencevariablenote.hasAuthorStringType()) {
			e.setEvdnceVrbleNtAthrStrgTyp(String.valueOf(evidencevariablenote.getAuthorStringType()));
		}
		/******************** EvdnceVrble_Dscrptn ********************************************************************************/
		if(evidencevariable.hasDescription()) {
			e.setEvdnceVrbleDscrptn(String.valueOf(evidencevariable.getDescription()));
		}
		/******************** EvdnceVrble_Url ********************************************************************************/
		if(evidencevariable.hasUrl()) {
			e.setEvdnceVrbleUrl(String.valueOf(evidencevariable.getUrl()));
		}
		/******************** EvdnceVrble_Pblshr ********************************************************************************/
		if(evidencevariable.hasPublisher()) {
			e.setEvdnceVrblePblshr(String.valueOf(evidencevariable.getPublisher()));
		}
		/******************** evidencevariableeffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencevariableeffectiveperiod = evidencevariable.getEffectivePeriod();

		/******************** EvdnceVrble_EfctivePrd_Strt ********************************************************************************/
		if(evidencevariableeffectiveperiod.hasStart()) {
			e.setEvdnceVrbleEfctivePrdStrt(String.valueOf(evidencevariableeffectiveperiod.getStart()));
		}
		/******************** EvdnceVrble_EfctivePrd_End ********************************************************************************/
		if(evidencevariableeffectiveperiod.hasEnd()) {
			e.setEvdnceVrbleEfctivePrdEnd(String.valueOf(evidencevariableeffectiveperiod.getEnd()));
		}
		/******************** evidencevariableauthor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail evidencevariableauthor = evidencevariable.getAuthorFirstRep();

		/******************** EvdnceVrble_Athr_Nm ********************************************************************************/
		if(evidencevariableauthor.hasName()) {
			e.setEvdnceVrbleAthrNm(String.valueOf(evidencevariableauthor.getName()));
		}
		/******************** evidencevariableauthortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint evidencevariableauthortelecom = evidencevariableauthor.getTelecomFirstRep();

		/******************** EvdnceVrble_Athr_Tlcm_Vl ********************************************************************************/
		if(evidencevariableauthortelecom.hasValue()) {
			e.setEvdnceVrbleAthrTlcmVl(String.valueOf(evidencevariableauthortelecom.getValue()));
		}
		/******************** evidencevariableauthortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencevariableauthortelecomperiod = evidencevariableauthortelecom.getPeriod();

		/******************** EvdnceVrble_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(evidencevariableauthortelecomperiod.hasStart()) {
			e.setEvdnceVrbleAthrTlcmPrdStrt(String.valueOf(evidencevariableauthortelecomperiod.getStart()));
		}
		/******************** EvdnceVrble_Athr_Tlcm_Prd_End ********************************************************************************/
		if(evidencevariableauthortelecomperiod.hasEnd()) {
			e.setEvdnceVrbleAthrTlcmPrdEnd(String.valueOf(evidencevariableauthortelecomperiod.getEnd()));
		}
		/******************** evidencevariableauthortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem evidencevariableauthortelecomsystem = evidencevariableauthortelecom.getSystem();
		e.setEvdnceVrbleAthrTlcmSys(evidencevariableauthortelecomsystem.toCode());

		/******************** evidencevariableauthortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse evidencevariableauthortelecomuse = evidencevariableauthortelecom.getUse();
		e.setEvdnceVrbleAthrTlcmUse(evidencevariableauthortelecomuse.toCode());

		/******************** EvdnceVrble_Athr_Tlcm_Rnk ********************************************************************************/
		if(evidencevariableauthortelecom.hasRank()) {
			e.setEvdnceVrbleAthrTlcmRnk(String.valueOf(evidencevariableauthortelecom.getRank()));
		}
		/******************** evidencevariablecontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail evidencevariablecontact = evidencevariable.getContactFirstRep();

		/******************** EvdnceVrble_Cntct_Nm ********************************************************************************/
		if(evidencevariablecontact.hasName()) {
			e.setEvdnceVrbleCntctNm(String.valueOf(evidencevariablecontact.getName()));
		}
		/******************** evidencevariablecontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint evidencevariablecontacttelecom = evidencevariablecontact.getTelecomFirstRep();

		/******************** EvdnceVrble_Cntct_Tlcm_Vl ********************************************************************************/
		if(evidencevariablecontacttelecom.hasValue()) {
			e.setEvdnceVrbleCntctTlcmVl(String.valueOf(evidencevariablecontacttelecom.getValue()));
		}
		/******************** evidencevariablecontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencevariablecontacttelecomperiod = evidencevariablecontacttelecom.getPeriod();

		/******************** EvdnceVrble_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(evidencevariablecontacttelecomperiod.hasStart()) {
			e.setEvdnceVrbleCntctTlcmPrdStrt(String.valueOf(evidencevariablecontacttelecomperiod.getStart()));
		}
		/******************** EvdnceVrble_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(evidencevariablecontacttelecomperiod.hasEnd()) {
			e.setEvdnceVrbleCntctTlcmPrdEnd(String.valueOf(evidencevariablecontacttelecomperiod.getEnd()));
		}
		/******************** evidencevariablecontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem evidencevariablecontacttelecomsystem = evidencevariablecontacttelecom.getSystem();
		e.setEvdnceVrbleCntctTlcmSys(evidencevariablecontacttelecomsystem.toCode());

		/******************** evidencevariablecontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse evidencevariablecontacttelecomuse = evidencevariablecontacttelecom.getUse();
		e.setEvdnceVrbleCntctTlcmUse(evidencevariablecontacttelecomuse.toCode());

		/******************** EvdnceVrble_Cntct_Tlcm_Rnk ********************************************************************************/
		if(evidencevariablecontacttelecom.hasRank()) {
			e.setEvdnceVrbleCntctTlcmRnk(String.valueOf(evidencevariablecontacttelecom.getRank()));
		}
		/******************** evidencevariableidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier evidencevariableidentifier = evidencevariable.getIdentifierFirstRep();

		/******************** EvdnceVrble_Id_Vl ********************************************************************************/
		if(evidencevariableidentifier.hasValue()) {
			e.setEvdnceVrbleIdVl(String.valueOf(evidencevariableidentifier.getValue()));
		}
		/******************** evidencevariableidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidencevariableidentifiertype = evidencevariableidentifier.getType();

		/******************** EvdnceVrble_Id_Typ_Txt ********************************************************************************/
		if(evidencevariableidentifiertype.hasText()) {
			e.setEvdnceVrbleIdTypTxt(String.valueOf(evidencevariableidentifiertype.getText()));
		}
		/******************** evidencevariableidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidencevariableidentifiertypecoding = evidencevariableidentifiertype.getCodingFirstRep();

		/******************** EvdnceVrble_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(evidencevariableidentifiertypecoding.hasVersion()) {
			e.setEvdnceVrbleIdTypCdgVrsn(String.valueOf(evidencevariableidentifiertypecoding.getVersion()));
		}
		/******************** EvdnceVrble_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(evidencevariableidentifiertypecoding.hasDisplay()) {
			e.setEvdnceVrbleIdTypCdgDsply(String.valueOf(evidencevariableidentifiertypecoding.getDisplay()));
		}
		/******************** EvdnceVrble_Id_Typ_Cdg_Cd ********************************************************************************/
		if(evidencevariableidentifiertypecoding.hasCode()) {
			e.setEvdnceVrbleIdTypCdgCd(String.valueOf(evidencevariableidentifiertypecoding.getCode()));
		}
		/******************** EvdnceVrble_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(evidencevariableidentifiertypecoding.hasUserSelected()) {
			e.setEvdnceVrbleIdTypCdgUsrSltd(String.valueOf(evidencevariableidentifiertypecoding.getUserSelected()));
		}
		/******************** EvdnceVrble_Id_Typ_Cdg_Sys ********************************************************************************/
		if(evidencevariableidentifiertypecoding.hasSystem()) {
			e.setEvdnceVrbleIdTypCdgSys(String.valueOf(evidencevariableidentifiertypecoding.getSystem()));
		}
		/******************** evidencevariableidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencevariableidentifierperiod = evidencevariableidentifier.getPeriod();

		/******************** EvdnceVrble_Id_Prd_Strt ********************************************************************************/
		if(evidencevariableidentifierperiod.hasStart()) {
			e.setEvdnceVrbleIdPrdStrt(String.valueOf(evidencevariableidentifierperiod.getStart()));
		}
		/******************** EvdnceVrble_Id_Prd_End ********************************************************************************/
		if(evidencevariableidentifierperiod.hasEnd()) {
			e.setEvdnceVrbleIdPrdEnd(String.valueOf(evidencevariableidentifierperiod.getEnd()));
		}
		/******************** EvdnceVrble_Id_Assigner ********************************************************************************/
		if(evidencevariableidentifier.hasAssigner()) {
			e.setEvdnceVrbleIdAssigner(String.valueOf(evidencevariableidentifier.getAssigner()));
		}
		/******************** EvdnceVrble_Id_Sys ********************************************************************************/
		if(evidencevariableidentifier.hasSystem()) {
			e.setEvdnceVrbleIdSys(String.valueOf(evidencevariableidentifier.getSystem()));
		}
		/******************** evidencevariableidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse evidencevariableidentifieruse = evidencevariableidentifier.getUse();
		e.setEvdnceVrbleIdUse(evidencevariableidentifieruse.toCode());

		/******************** EvdnceVrble_Copyright ********************************************************************************/
		if(evidencevariable.hasCopyright()) {
			e.setEvdnceVrbleCopyright(String.valueOf(evidencevariable.getCopyright()));
		}
		/******************** evidencevariabletopic ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidencevariabletopic = evidencevariable.getTopicFirstRep();

		/******************** EvdnceVrble_Topic_Txt ********************************************************************************/
		if(evidencevariabletopic.hasText()) {
			e.setEvdnceVrbleTopicTxt(String.valueOf(evidencevariabletopic.getText()));
		}
		/******************** evidencevariabletopiccoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidencevariabletopiccoding = evidencevariabletopic.getCodingFirstRep();

		/******************** EvdnceVrble_Topic_Cdg_Vrsn ********************************************************************************/
		if(evidencevariabletopiccoding.hasVersion()) {
			e.setEvdnceVrbleTopicCdgVrsn(String.valueOf(evidencevariabletopiccoding.getVersion()));
		}
		/******************** EvdnceVrble_Topic_Cdg_Dsply ********************************************************************************/
		if(evidencevariabletopiccoding.hasDisplay()) {
			e.setEvdnceVrbleTopicCdgDsply(String.valueOf(evidencevariabletopiccoding.getDisplay()));
		}
		/******************** EvdnceVrble_Topic_Cdg_Cd ********************************************************************************/
		if(evidencevariabletopiccoding.hasCode()) {
			e.setEvdnceVrbleTopicCdgCd(String.valueOf(evidencevariabletopiccoding.getCode()));
		}
		/******************** EvdnceVrble_Topic_Cdg_UsrSltd ********************************************************************************/
		if(evidencevariabletopiccoding.hasUserSelected()) {
			e.setEvdnceVrbleTopicCdgUsrSltd(String.valueOf(evidencevariabletopiccoding.getUserSelected()));
		}
		/******************** EvdnceVrble_Topic_Cdg_Sys ********************************************************************************/
		if(evidencevariabletopiccoding.hasSystem()) {
			e.setEvdnceVrbleTopicCdgSys(String.valueOf(evidencevariabletopiccoding.getSystem()));
		}
		/******************** EvdnceVrble_LastReviewDt ********************************************************************************/
		if(evidencevariable.hasLastReviewDate()) {
			e.setEvdnceVrbleLastReviewDt(String.valueOf(evidencevariable.getLastReviewDate()));
		}
		/******************** EvdnceVrble_ApprovalDt ********************************************************************************/
		if(evidencevariable.hasApprovalDate()) {
			e.setEvdnceVrbleApprovalDt(String.valueOf(evidencevariable.getApprovalDate()));
		}
		/******************** evidencevariableeditor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail evidencevariableeditor = evidencevariable.getEditorFirstRep();

		/******************** EvdnceVrble_Editor_Nm ********************************************************************************/
		if(evidencevariableeditor.hasName()) {
			e.setEvdnceVrbleEditorNm(String.valueOf(evidencevariableeditor.getName()));
		}
		/******************** evidencevariableeditortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint evidencevariableeditortelecom = evidencevariableeditor.getTelecomFirstRep();

		/******************** EvdnceVrble_Editor_Tlcm_Vl ********************************************************************************/
		if(evidencevariableeditortelecom.hasValue()) {
			e.setEvdnceVrbleEditorTlcmVl(String.valueOf(evidencevariableeditortelecom.getValue()));
		}
		/******************** evidencevariableeditortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencevariableeditortelecomperiod = evidencevariableeditortelecom.getPeriod();

		/******************** EvdnceVrble_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(evidencevariableeditortelecomperiod.hasStart()) {
			e.setEvdnceVrbleEditorTlcmPrdStrt(String.valueOf(evidencevariableeditortelecomperiod.getStart()));
		}
		/******************** EvdnceVrble_Editor_Tlcm_Prd_End ********************************************************************************/
		if(evidencevariableeditortelecomperiod.hasEnd()) {
			e.setEvdnceVrbleEditorTlcmPrdEnd(String.valueOf(evidencevariableeditortelecomperiod.getEnd()));
		}
		/******************** evidencevariableeditortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem evidencevariableeditortelecomsystem = evidencevariableeditortelecom.getSystem();
		e.setEvdnceVrbleEditorTlcmSys(evidencevariableeditortelecomsystem.toCode());

		/******************** evidencevariableeditortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse evidencevariableeditortelecomuse = evidencevariableeditortelecom.getUse();
		e.setEvdnceVrbleEditorTlcmUse(evidencevariableeditortelecomuse.toCode());

		/******************** EvdnceVrble_Editor_Tlcm_Rnk ********************************************************************************/
		if(evidencevariableeditortelecom.hasRank()) {
			e.setEvdnceVrbleEditorTlcmRnk(String.valueOf(evidencevariableeditortelecom.getRank()));
		}
		/******************** evidencevariablerelatedartifact ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact evidencevariablerelatedartifact = evidencevariable.getRelatedArtifactFirstRep();

		/******************** EvdnceVrble_RltedArtfct_Rsrc ********************************************************************************/
		if(evidencevariablerelatedartifact.hasResource()) {
			e.setEvdnceVrbleRltedArtfctRsrc(String.valueOf(evidencevariablerelatedartifact.getResource()));
		}
		/******************** evidencevariablerelatedartifacttype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactType evidencevariablerelatedartifacttype = evidencevariablerelatedartifact.getType();
		e.setEvdnceVrbleRltedArtfctTyp(evidencevariablerelatedartifacttype.toCode());

		/******************** evidencevariablerelatedartifactdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment evidencevariablerelatedartifactdocument = evidencevariablerelatedartifact.getDocument();

		/******************** EvdnceVrble_RltedArtfct_Doc_Sz ********************************************************************************/
		if(evidencevariablerelatedartifactdocument.hasSize()) {
			e.setEvdnceVrbleRltedArtfctDocSz(String.valueOf(evidencevariablerelatedartifactdocument.getSize()));
		}
		/******************** EvdnceVrble_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(evidencevariablerelatedartifactdocument.hasLanguage()) {
			e.setEvdnceVrbleRltedArtfctDocLnguage(String.valueOf(evidencevariablerelatedartifactdocument.getLanguage()));
		}
		/******************** EvdnceVrble_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(evidencevariablerelatedartifactdocument.hasContentType()) {
			e.setEvdnceVrbleRltedArtfctDocCntntTyp(String.valueOf(evidencevariablerelatedartifactdocument.getContentType()));
		}
		/******************** EvdnceVrble_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(evidencevariablerelatedartifactdocument.hasTitle()) {
			e.setEvdnceVrbleRltedArtfctDocTtl(String.valueOf(evidencevariablerelatedartifactdocument.getTitle()));
		}
		/******************** EvdnceVrble_RltedArtfct_Doc_Url ********************************************************************************/
		if(evidencevariablerelatedartifactdocument.hasUrl()) {
			e.setEvdnceVrbleRltedArtfctDocUrl(String.valueOf(evidencevariablerelatedartifactdocument.getUrl()));
		}
		/******************** EvdnceVrble_RltedArtfct_Doc_Data ********************************************************************************/
		if(evidencevariablerelatedartifactdocument.hasData()) {
			e.setEvdnceVrbleRltedArtfctDocData(String.valueOf(evidencevariablerelatedartifactdocument.getData()));
		}

		/******************** EvdnceVrble_RltedArtfct_Doc_Hash ********************************************************************************/
		if(evidencevariablerelatedartifactdocument.hasHash()) {
			e.setEvdnceVrbleRltedArtfctDocHash(String.valueOf(evidencevariablerelatedartifactdocument.getHash()));
		}

		/******************** EvdnceVrble_RltedArtfct_Doc_Creation ********************************************************************************/
		if(evidencevariablerelatedartifactdocument.hasCreation()) {
			e.setEvdnceVrbleRltedArtfctDocCreation(String.valueOf(evidencevariablerelatedartifactdocument.getCreation()));
		}
		/******************** EvdnceVrble_RltedArtfct_Url ********************************************************************************/
		if(evidencevariablerelatedartifact.hasUrl()) {
			e.setEvdnceVrbleRltedArtfctUrl(String.valueOf(evidencevariablerelatedartifact.getUrl()));
		}
		/******************** EvdnceVrble_RltedArtfct_Lbl ********************************************************************************/
		if(evidencevariablerelatedartifact.hasLabel()) {
			e.setEvdnceVrbleRltedArtfctLbl(String.valueOf(evidencevariablerelatedartifact.getLabel()));
		}
		/******************** EvdnceVrble_RltedArtfct_Citation ********************************************************************************/
		if(evidencevariablerelatedartifact.hasCitation()) {
			e.setEvdnceVrbleRltedArtfctCitation(String.valueOf(evidencevariablerelatedartifact.getCitation()));
		}
		/******************** evidencevariablecharacteristic ********************************************************************************/
		org.hl7.fhir.r4.model.EvidenceVariable.EvidenceVariableCharacteristicComponent evidencevariablecharacteristic = evidencevariable.getCharacteristicFirstRep();

		/******************** EvdnceVrble_Crctrstc_DfnCanonicalTyp ********************************************************************************/
		if(evidencevariablecharacteristic.hasDefinitionCanonicalType()) {
			e.setEvdnceVrbleCrctrstcDfnCanonicalTyp(String.valueOf(evidencevariablecharacteristic.getDefinitionCanonicalType()));
		}
		/******************** evidencevariablecharacteristicdefinitioncodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidencevariablecharacteristicdefinitioncodeableconcept = evidencevariablecharacteristic.getDefinitionCodeableConcept();

		/******************** EvdnceVrble_Crctrstc_DfnCdbleCncpt_Txt ********************************************************************************/
		if(evidencevariablecharacteristicdefinitioncodeableconcept.hasText()) {
			e.setEvdnceVrbleCrctrstcDfnCdbleCncptTxt(String.valueOf(evidencevariablecharacteristicdefinitioncodeableconcept.getText()));
		}
		/******************** evidencevariablecharacteristicdefinitioncodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidencevariablecharacteristicdefinitioncodeableconceptcoding = evidencevariablecharacteristicdefinitioncodeableconcept.getCodingFirstRep();

		/******************** EvdnceVrble_Crctrstc_DfnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(evidencevariablecharacteristicdefinitioncodeableconceptcoding.hasVersion()) {
			e.setEvdnceVrbleCrctrstcDfnCdbleCncptCdgVrsn(String.valueOf(evidencevariablecharacteristicdefinitioncodeableconceptcoding.getVersion()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(evidencevariablecharacteristicdefinitioncodeableconceptcoding.hasDisplay()) {
			e.setEvdnceVrbleCrctrstcDfnCdbleCncptCdgDsply(String.valueOf(evidencevariablecharacteristicdefinitioncodeableconceptcoding.getDisplay()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(evidencevariablecharacteristicdefinitioncodeableconceptcoding.hasCode()) {
			e.setEvdnceVrbleCrctrstcDfnCdbleCncptCdgCd(String.valueOf(evidencevariablecharacteristicdefinitioncodeableconceptcoding.getCode()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(evidencevariablecharacteristicdefinitioncodeableconceptcoding.hasUserSelected()) {
			e.setEvdnceVrbleCrctrstcDfnCdbleCncptCdgUsrSltd(String.valueOf(evidencevariablecharacteristicdefinitioncodeableconceptcoding.getUserSelected()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(evidencevariablecharacteristicdefinitioncodeableconceptcoding.hasSystem()) {
			e.setEvdnceVrbleCrctrstcDfnCdbleCncptCdgSys(String.valueOf(evidencevariablecharacteristicdefinitioncodeableconceptcoding.getSystem()));
		}
		/******************** evidencevariablecharacteristicdefinitionexpression ********************************************************************************/
		org.hl7.fhir.r4.model.Expression evidencevariablecharacteristicdefinitionexpression = evidencevariablecharacteristic.getDefinitionExpression();

		/******************** EvdnceVrble_Crctrstc_DfnExprsn_Nm ********************************************************************************/
		if(evidencevariablecharacteristicdefinitionexpression.hasName()) {
			e.setEvdnceVrbleCrctrstcDfnExprsnNm(String.valueOf(evidencevariablecharacteristicdefinitionexpression.getName()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnExprsn_Rfrnc ********************************************************************************/
		if(evidencevariablecharacteristicdefinitionexpression.hasReference()) {
			e.setEvdnceVrbleCrctrstcDfnExprsnRfrnc(String.valueOf(evidencevariablecharacteristicdefinitionexpression.getReference()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnExprsn_Lnguage ********************************************************************************/
		if(evidencevariablecharacteristicdefinitionexpression.hasLanguage()) {
			e.setEvdnceVrbleCrctrstcDfnExprsnLnguage(String.valueOf(evidencevariablecharacteristicdefinitionexpression.getLanguage()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnExprsn_Dscrptn ********************************************************************************/
		if(evidencevariablecharacteristicdefinitionexpression.hasDescription()) {
			e.setEvdnceVrbleCrctrstcDfnExprsnDscrptn(String.valueOf(evidencevariablecharacteristicdefinitionexpression.getDescription()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnExprsn_Exprsn ********************************************************************************/
		if(evidencevariablecharacteristicdefinitionexpression.hasExpression()) {
			e.setEvdnceVrbleCrctrstcDfnExprsnExprsn(String.valueOf(evidencevariablecharacteristicdefinitionexpression.getExpression()));
		}
		/******************** evidencevariablecharacteristicdefinitiondatarequirement ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement evidencevariablecharacteristicdefinitiondatarequirement = evidencevariablecharacteristic.getDefinitionDataRequirement();

		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_Typ ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirement.hasType()) {
			e.setEvdnceVrbleCrctrstcDfnDataRqrmentTyp(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirement.getType()));
		}
		/******************** evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconcept = evidencevariablecharacteristicdefinitiondatarequirement.getSubjectCodeableConcept();

		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconcept.hasText()) {
			e.setEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptTxt(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconcept.getText()));
		}
		/******************** evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding = evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconcept.getCodingFirstRep();

		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.hasVersion()) {
			e.setEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgVrsn(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.getVersion()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.hasDisplay()) {
			e.setEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgDsply(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.getDisplay()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.hasCode()) {
			e.setEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgCd(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.getCode()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.hasUserSelected()) {
			e.setEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgUsrSltd(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.getUserSelected()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.hasSystem()) {
			e.setEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgSys(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.getSystem()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_SbjctRfrnc ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirement.hasSubjectReference()) {
			e.setEvdnceVrbleCrctrstcDfnDataRqrmentSbjctRfrnc(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirement.getSubjectReference()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_Lmt ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirement.hasLimit()) {
			e.setEvdnceVrbleCrctrstcDfnDataRqrmentLmt(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirement.getLimit()));
		}
		/******************** evidencevariablecharacteristicdefinitiondatarequirementsort ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent evidencevariablecharacteristicdefinitiondatarequirementsort = evidencevariablecharacteristicdefinitiondatarequirement.getSortFirstRep();

		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_Sort_Path ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementsort.hasPath()) {
			e.setEvdnceVrbleCrctrstcDfnDataRqrmentSortPath(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementsort.getPath()));
		}
		/******************** evidencevariablecharacteristicdefinitiondatarequirementsortdirection ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.SortDirection evidencevariablecharacteristicdefinitiondatarequirementsortdirection = evidencevariablecharacteristicdefinitiondatarequirementsort.getDirection();
		e.setEvdnceVrbleCrctrstcDfnDataRqrmentSortDirection(evidencevariablecharacteristicdefinitiondatarequirementsortdirection.toCode());

		/******************** evidencevariablecharacteristicdefinitiondatarequirementdatefilter ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent evidencevariablecharacteristicdefinitiondatarequirementdatefilter = evidencevariablecharacteristicdefinitiondatarequirement.getDateFilterFirstRep();

		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_Path ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementdatefilter.hasPath()) {
			e.setEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrPath(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementdatefilter.getPath()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_SrchParam ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementdatefilter.hasSearchParam()) {
			e.setEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrSrchParam(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementdatefilter.getSearchParam()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_VlDtTimeTyp ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementdatefilter.hasValueDateTimeType()) {
			e.setEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDtTimeTyp(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementdatefilter.getValueDateTimeType()));
		}
		/******************** evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueduration = evidencevariablecharacteristicdefinitiondatarequirementdatefilter.getValueDuration();

		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_VlDuration_Vl ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueduration.hasValue()) {
			e.setEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationVl(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueduration.getValue()));
		}
		/******************** evidencevariablecharacteristicdefinitiondatarequirementdatefiltervaluedurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidencevariablecharacteristicdefinitiondatarequirementdatefiltervaluedurationcomparator = evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueduration.getComparator();
		e.setEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationCmprtr(evidencevariablecharacteristicdefinitiondatarequirementdatefiltervaluedurationcomparator.toCode());

		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_VlDuration_Cd ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueduration.hasCode()) {
			e.setEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationCd(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueduration.getCode()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_VlDuration_Unt ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueduration.hasUnit()) {
			e.setEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationUnt(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueduration.getUnit()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_VlDuration_Sys ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueduration.hasSystem()) {
			e.setEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDurationSys(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueduration.getSystem()));
		}
		/******************** evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueperiod = evidencevariablecharacteristicdefinitiondatarequirementdatefilter.getValuePeriod();

		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_VlPrd_Strt ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueperiod.hasStart()) {
			e.setEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlPrdStrt(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueperiod.getStart()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_VlPrd_End ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueperiod.hasEnd()) {
			e.setEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlPrdEnd(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueperiod.getEnd()));
		}
		/******************** evidencevariablecharacteristicdefinitiondatarequirementcodefilter ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent evidencevariablecharacteristicdefinitiondatarequirementcodefilter = evidencevariablecharacteristicdefinitiondatarequirement.getCodeFilterFirstRep();

		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_CdFltr_Path ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementcodefilter.hasPath()) {
			e.setEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrPath(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementcodefilter.getPath()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_CdFltr_SrchParam ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementcodefilter.hasSearchParam()) {
			e.setEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrSrchParam(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementcodefilter.getSearchParam()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_CdFltr_VlSt ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementcodefilter.hasValueSet()) {
			e.setEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrVlSt(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementcodefilter.getValueSet()));
		}
		/******************** evidencevariablecharacteristicdefinitiondatarequirementcodefiltercode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidencevariablecharacteristicdefinitiondatarequirementcodefiltercode = evidencevariablecharacteristicdefinitiondatarequirementcodefilter.getCodeFirstRep();

		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_CdFltr_Cd_Vrsn ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementcodefiltercode.hasVersion()) {
			e.setEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdVrsn(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementcodefiltercode.getVersion()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_CdFltr_Cd_Dsply ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementcodefiltercode.hasDisplay()) {
			e.setEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdDsply(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementcodefiltercode.getDisplay()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_CdFltr_Cd_UsrSltd ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementcodefiltercode.hasUserSelected()) {
			e.setEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdUsrSltd(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementcodefiltercode.getUserSelected()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_CdFltr_Cd_Sys ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiondatarequirementcodefiltercode.hasSystem()) {
			e.setEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdSys(String.valueOf(evidencevariablecharacteristicdefinitiondatarequirementcodefiltercode.getSystem()));
		}
		/******************** evidencevariablecharacteristicusagecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext evidencevariablecharacteristicusagecontext = evidencevariablecharacteristic.getUsageContextFirstRep();

		/******************** evidencevariablecharacteristicusagecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidencevariablecharacteristicusagecontextcode = evidencevariablecharacteristicusagecontext.getCode();

		/******************** EvdnceVrble_Crctrstc_UsgCntxt_Cd_Vrsn ********************************************************************************/
		if(evidencevariablecharacteristicusagecontextcode.hasVersion()) {
			e.setEvdnceVrbleCrctrstcUsgCntxtCdVrsn(String.valueOf(evidencevariablecharacteristicusagecontextcode.getVersion()));
		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_Cd_Dsply ********************************************************************************/
		if(evidencevariablecharacteristicusagecontextcode.hasDisplay()) {
			e.setEvdnceVrbleCrctrstcUsgCntxtCdDsply(String.valueOf(evidencevariablecharacteristicusagecontextcode.getDisplay()));
		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_Cd_UsrSltd ********************************************************************************/
		if(evidencevariablecharacteristicusagecontextcode.hasUserSelected()) {
			e.setEvdnceVrbleCrctrstcUsgCntxtCdUsrSltd(String.valueOf(evidencevariablecharacteristicusagecontextcode.getUserSelected()));
		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_Cd_Sys ********************************************************************************/
		if(evidencevariablecharacteristicusagecontextcode.hasSystem()) {
			e.setEvdnceVrbleCrctrstcUsgCntxtCdSys(String.valueOf(evidencevariablecharacteristicusagecontextcode.getSystem()));
		}
		/******************** evidencevariablecharacteristicusagecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidencevariablecharacteristicusagecontextvaluecodeableconcept = evidencevariablecharacteristicusagecontext.getValueCodeableConcept();

		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(evidencevariablecharacteristicusagecontextvaluecodeableconcept.hasText()) {
			e.setEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptTxt(String.valueOf(evidencevariablecharacteristicusagecontextvaluecodeableconcept.getText()));
		}
		/******************** evidencevariablecharacteristicusagecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidencevariablecharacteristicusagecontextvaluecodeableconceptcoding = evidencevariablecharacteristicusagecontextvaluecodeableconcept.getCodingFirstRep();

		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(evidencevariablecharacteristicusagecontextvaluecodeableconceptcoding.hasVersion()) {
			e.setEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgVrsn(String.valueOf(evidencevariablecharacteristicusagecontextvaluecodeableconceptcoding.getVersion()));
		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(evidencevariablecharacteristicusagecontextvaluecodeableconceptcoding.hasDisplay()) {
			e.setEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgDsply(String.valueOf(evidencevariablecharacteristicusagecontextvaluecodeableconceptcoding.getDisplay()));
		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(evidencevariablecharacteristicusagecontextvaluecodeableconceptcoding.hasCode()) {
			e.setEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgCd(String.valueOf(evidencevariablecharacteristicusagecontextvaluecodeableconceptcoding.getCode()));
		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(evidencevariablecharacteristicusagecontextvaluecodeableconceptcoding.hasUserSelected()) {
			e.setEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(evidencevariablecharacteristicusagecontextvaluecodeableconceptcoding.getUserSelected()));
		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(evidencevariablecharacteristicusagecontextvaluecodeableconceptcoding.hasSystem()) {
			e.setEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgSys(String.valueOf(evidencevariablecharacteristicusagecontextvaluecodeableconceptcoding.getSystem()));
		}
		/******************** evidencevariablecharacteristicusagecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidencevariablecharacteristicusagecontextvaluequantity = evidencevariablecharacteristicusagecontext.getValueQuantity();

		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlQnty_Vl ********************************************************************************/
		if(evidencevariablecharacteristicusagecontextvaluequantity.hasValue()) {
			e.setEvdnceVrbleCrctrstcUsgCntxtVlQntyVl(String.valueOf(evidencevariablecharacteristicusagecontextvaluequantity.getValue()));
		}
		/******************** evidencevariablecharacteristicusagecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidencevariablecharacteristicusagecontextvaluequantitycomparator = evidencevariablecharacteristicusagecontextvaluequantity.getComparator();
		e.setEvdnceVrbleCrctrstcUsgCntxtVlQntyCmprtr(evidencevariablecharacteristicusagecontextvaluequantitycomparator.toCode());

		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlQnty_Cd ********************************************************************************/
		if(evidencevariablecharacteristicusagecontextvaluequantity.hasCode()) {
			e.setEvdnceVrbleCrctrstcUsgCntxtVlQntyCd(String.valueOf(evidencevariablecharacteristicusagecontextvaluequantity.getCode()));
		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlQnty_Unt ********************************************************************************/
		if(evidencevariablecharacteristicusagecontextvaluequantity.hasUnit()) {
			e.setEvdnceVrbleCrctrstcUsgCntxtVlQntyUnt(String.valueOf(evidencevariablecharacteristicusagecontextvaluequantity.getUnit()));
		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlQnty_Sys ********************************************************************************/
		if(evidencevariablecharacteristicusagecontextvaluequantity.hasSystem()) {
			e.setEvdnceVrbleCrctrstcUsgCntxtVlQntySys(String.valueOf(evidencevariablecharacteristicusagecontextvaluequantity.getSystem()));
		}
		/******************** evidencevariablecharacteristicusagecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range evidencevariablecharacteristicusagecontextvaluerange = evidencevariablecharacteristicusagecontext.getValueRange();

		/******************** evidencevariablecharacteristicusagecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidencevariablecharacteristicusagecontextvaluerangelow = evidencevariablecharacteristicusagecontextvaluerange.getLow();

		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(evidencevariablecharacteristicusagecontextvaluerangelow.hasValue()) {
			e.setEvdnceVrbleCrctrstcUsgCntxtVlRngLwVl(String.valueOf(evidencevariablecharacteristicusagecontextvaluerangelow.getValue()));
		}
		/******************** evidencevariablecharacteristicusagecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidencevariablecharacteristicusagecontextvaluerangelowcomparator = evidencevariablecharacteristicusagecontextvaluerangelow.getComparator();
		e.setEvdnceVrbleCrctrstcUsgCntxtVlRngLwCmprtr(evidencevariablecharacteristicusagecontextvaluerangelowcomparator.toCode());

		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(evidencevariablecharacteristicusagecontextvaluerangelow.hasCode()) {
			e.setEvdnceVrbleCrctrstcUsgCntxtVlRngLwCd(String.valueOf(evidencevariablecharacteristicusagecontextvaluerangelow.getCode()));
		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(evidencevariablecharacteristicusagecontextvaluerangelow.hasUnit()) {
			e.setEvdnceVrbleCrctrstcUsgCntxtVlRngLwUnt(String.valueOf(evidencevariablecharacteristicusagecontextvaluerangelow.getUnit()));
		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(evidencevariablecharacteristicusagecontextvaluerangelow.hasSystem()) {
			e.setEvdnceVrbleCrctrstcUsgCntxtVlRngLwSys(String.valueOf(evidencevariablecharacteristicusagecontextvaluerangelow.getSystem()));
		}
		/******************** evidencevariablecharacteristicusagecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidencevariablecharacteristicusagecontextvaluerangehigh = evidencevariablecharacteristicusagecontextvaluerange.getHigh();

		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(evidencevariablecharacteristicusagecontextvaluerangehigh.hasValue()) {
			e.setEvdnceVrbleCrctrstcUsgCntxtVlRngHiVl(String.valueOf(evidencevariablecharacteristicusagecontextvaluerangehigh.getValue()));
		}
		/******************** evidencevariablecharacteristicusagecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidencevariablecharacteristicusagecontextvaluerangehighcomparator = evidencevariablecharacteristicusagecontextvaluerangehigh.getComparator();
		e.setEvdnceVrbleCrctrstcUsgCntxtVlRngHiCmprtr(evidencevariablecharacteristicusagecontextvaluerangehighcomparator.toCode());

		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(evidencevariablecharacteristicusagecontextvaluerangehigh.hasCode()) {
			e.setEvdnceVrbleCrctrstcUsgCntxtVlRngHiCd(String.valueOf(evidencevariablecharacteristicusagecontextvaluerangehigh.getCode()));
		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(evidencevariablecharacteristicusagecontextvaluerangehigh.hasUnit()) {
			e.setEvdnceVrbleCrctrstcUsgCntxtVlRngHiUnt(String.valueOf(evidencevariablecharacteristicusagecontextvaluerangehigh.getUnit()));
		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(evidencevariablecharacteristicusagecontextvaluerangehigh.hasSystem()) {
			e.setEvdnceVrbleCrctrstcUsgCntxtVlRngHiSys(String.valueOf(evidencevariablecharacteristicusagecontextvaluerangehigh.getSystem()));
		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRfrnc ********************************************************************************/
		if(evidencevariablecharacteristicusagecontext.hasValueReference()) {
			e.setEvdnceVrbleCrctrstcUsgCntxtVlRfrnc(String.valueOf(evidencevariablecharacteristicusagecontext.getValueReference()));
		}
		/******************** evidencevariablecharacteristicparticipanteffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencevariablecharacteristicparticipanteffectiveperiod = evidencevariablecharacteristic.getParticipantEffectivePeriod();

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctivePrd_Strt ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectiveperiod.hasStart()) {
			e.setEvdnceVrbleCrctrstcPrtcpntEfctivePrdStrt(String.valueOf(evidencevariablecharacteristicparticipanteffectiveperiod.getStart()));
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctivePrd_End ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectiveperiod.hasEnd()) {
			e.setEvdnceVrbleCrctrstcPrtcpntEfctivePrdEnd(String.valueOf(evidencevariablecharacteristicparticipanteffectiveperiod.getEnd()));
		}
		/******************** evidencevariablecharacteristicparticipanteffectiveduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration evidencevariablecharacteristicparticipanteffectiveduration = evidencevariablecharacteristic.getParticipantEffectiveDuration();

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveDuration_Vl ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectiveduration.hasValue()) {
			e.setEvdnceVrbleCrctrstcPrtcpntEfctiveDurationVl(String.valueOf(evidencevariablecharacteristicparticipanteffectiveduration.getValue()));
		}
		/******************** evidencevariablecharacteristicparticipanteffectivedurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidencevariablecharacteristicparticipanteffectivedurationcomparator = evidencevariablecharacteristicparticipanteffectiveduration.getComparator();
		e.setEvdnceVrbleCrctrstcPrtcpntEfctiveDurationCmprtr(evidencevariablecharacteristicparticipanteffectivedurationcomparator.toCode());

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveDuration_Cd ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectiveduration.hasCode()) {
			e.setEvdnceVrbleCrctrstcPrtcpntEfctiveDurationCd(String.valueOf(evidencevariablecharacteristicparticipanteffectiveduration.getCode()));
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveDuration_Unt ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectiveduration.hasUnit()) {
			e.setEvdnceVrbleCrctrstcPrtcpntEfctiveDurationUnt(String.valueOf(evidencevariablecharacteristicparticipanteffectiveduration.getUnit()));
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveDuration_Sys ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectiveduration.hasSystem()) {
			e.setEvdnceVrbleCrctrstcPrtcpntEfctiveDurationSys(String.valueOf(evidencevariablecharacteristicparticipanteffectiveduration.getSystem()));
		}
		/******************** evidencevariablecharacteristicparticipanteffectivetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing evidencevariablecharacteristicparticipanteffectivetiming = evidencevariablecharacteristic.getParticipantEffectiveTiming();

		/******************** evidencevariablecharacteristicparticipanteffectivetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidencevariablecharacteristicparticipanteffectivetimingcode = evidencevariablecharacteristicparticipanteffectivetiming.getCode();

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Cd_Txt ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingcode.hasText()) {
			e.setEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdTxt(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingcode.getText()));
		}
		/******************** evidencevariablecharacteristicparticipanteffectivetimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidencevariablecharacteristicparticipanteffectivetimingcodecoding = evidencevariablecharacteristicparticipanteffectivetimingcode.getCodingFirstRep();

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingcodecoding.hasVersion()) {
			e.setEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgVrsn(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingcodecoding.getVersion()));
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingcodecoding.hasDisplay()) {
			e.setEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgDsply(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingcodecoding.getDisplay()));
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_Cd ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingcodecoding.hasCode()) {
			e.setEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgCd(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingcodecoding.getCode()));
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingcodecoding.hasUserSelected()) {
			e.setEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgUsrSltd(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingcodecoding.getUserSelected()));
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_Sys ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingcodecoding.hasSystem()) {
			e.setEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgSys(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingcodecoding.getSystem()));
		}
		/******************** evidencevariablecharacteristicparticipanteffectivetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent evidencevariablecharacteristicparticipanteffectivetimingrepeat = evidencevariablecharacteristicparticipanteffectivetiming.getRepeat();

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_Off ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeat.hasOffset()) {
			e.setEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptOff(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeat.getOffset()));
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_Cnt ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeat.hasCount()) {
			e.setEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptCnt(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeat.getCount()));
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_Frqncy ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeat.hasFrequency()) {
			e.setEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptFrqncy(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeat.getFrequency()));
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_Prd ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeat.hasPeriod()) {
			e.setEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptPrd(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeat.getPeriod()));
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_Duration ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeat.hasDuration()) {
			e.setEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptDuration(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeat.getDuration()));
		}
		/******************** evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsduration = evidencevariablecharacteristicparticipanteffectivetimingrepeat.getBoundsDuration();

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsduration.hasValue()) {
			e.setEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsDurationVl(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsduration.getValue()));
		}
		/******************** evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsdurationcomparator = evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsduration.getComparator();
		e.setEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsDurationCmprtr(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsdurationcomparator.toCode());

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsduration.hasCode()) {
			e.setEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsDurationCd(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsduration.getCode()));
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsduration.hasUnit()) {
			e.setEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsDurationUnt(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsduration.getUnit()));
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsduration.hasSystem()) {
			e.setEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsDurationSys(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsduration.getSystem()));
		}
		/******************** evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrange = evidencevariablecharacteristicparticipanteffectivetimingrepeat.getBoundsRange();

		/******************** evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelow = evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrange.getLow();

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelow.hasValue()) {
			e.setEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwVl(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelow.getValue()));
		}
		/******************** evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelowcomparator = evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelow.getComparator();
		e.setEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwCmprtr(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelowcomparator.toCode());

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelow.hasCode()) {
			e.setEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwCd(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelow.getCode()));
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelow.hasUnit()) {
			e.setEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwUnt(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelow.getUnit()));
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelow.hasSystem()) {
			e.setEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwSys(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelow.getSystem()));
		}
		/******************** evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehigh = evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrange.getHigh();

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehigh.hasValue()) {
			e.setEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiVl(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehigh.getValue()));
		}
		/******************** evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehighcomparator = evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehigh.getComparator();
		e.setEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiCmprtr(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehighcomparator.toCode());

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehigh.hasCode()) {
			e.setEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiCd(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehigh.getCode()));
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehigh.hasUnit()) {
			e.setEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiUnt(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehigh.getUnit()));
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehigh.hasSystem()) {
			e.setEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiSys(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehigh.getSystem()));
		}
		/******************** evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsperiod = evidencevariablecharacteristicparticipanteffectivetimingrepeat.getBoundsPeriod();

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsperiod.hasStart()) {
			e.setEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsPrdStrt(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsperiod.getStart()));
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsperiod.hasEnd()) {
			e.setEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsPrdEnd(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsperiod.getEnd()));
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_PrdMx ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeat.hasPeriodMax()) {
			e.setEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptPrdMx(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeat.getPeriodMax()));
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_DurationMx ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeat.hasDurationMax()) {
			e.setEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptDurationMx(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeat.getDurationMax()));
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_CntMx ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeat.hasCountMax()) {
			e.setEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptCntMx(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeat.getCountMax()));
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_FrqncyMx ********************************************************************************/
		if(evidencevariablecharacteristicparticipanteffectivetimingrepeat.hasFrequencyMax()) {
			e.setEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptFrqncyMx(String.valueOf(evidencevariablecharacteristicparticipanteffectivetimingrepeat.getFrequencyMax()));
		}
		/******************** evidencevariablecharacteristicparticipanteffectivetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime evidencevariablecharacteristicparticipanteffectivetimingrepeatdurationunit = evidencevariablecharacteristicparticipanteffectivetimingrepeat.getDurationUnit();
		e.setEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptDurationUnt(evidencevariablecharacteristicparticipanteffectivetimingrepeatdurationunit.toCode());

		/******************** evidencevariablecharacteristicparticipanteffectivetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime evidencevariablecharacteristicparticipanteffectivetimingrepeatperiodunit = evidencevariablecharacteristicparticipanteffectivetimingrepeat.getPeriodUnit();
		e.setEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptPrdUnt(evidencevariablecharacteristicparticipanteffectivetimingrepeatperiodunit.toCode());

		/******************** EvdnceVrble_Crctrstc_DfnRfrnc ********************************************************************************/
		if(evidencevariablecharacteristic.hasDefinitionReference()) {
			e.setEvdnceVrbleCrctrstcDfnRfrnc(String.valueOf(evidencevariablecharacteristic.getDefinitionReference()));
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinition ********************************************************************************/
		org.hl7.fhir.r4.model.TriggerDefinition evidencevariablecharacteristicdefinitiontriggerdefinition = evidencevariablecharacteristic.getDefinitionTriggerDefinition();

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Nm ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinition.hasName()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnNm(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinition.getName()));
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontype ********************************************************************************/
		org.hl7.fhir.r4.model.TriggerDefinition.TriggerType evidencevariablecharacteristicdefinitiontriggerdefinitiontype = evidencevariablecharacteristicdefinitiontriggerdefinition.getType();
		e.setEvdnceVrbleCrctrstcDfnTrgrDfnTyp(evidencevariablecharacteristicdefinitiontriggerdefinitiontype.toCode());

		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiondata ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement evidencevariablecharacteristicdefinitiontriggerdefinitiondata = evidencevariablecharacteristicdefinitiontriggerdefinition.getDataFirstRep();

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_Typ ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondata.hasType()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnDataTyp(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondata.getType()));
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconcept = evidencevariablecharacteristicdefinitiontriggerdefinitiondata.getSubjectCodeableConcept();

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconcept.hasText()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptTxt(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconcept.getText()));
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcoding = evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconcept.getCodingFirstRep();

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcoding.hasVersion()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgVrsn(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcoding.getVersion()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcoding.hasDisplay()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgDsply(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcoding.getDisplay()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcoding.hasCode()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgCd(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcoding.getCode()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcoding.hasUserSelected()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgUsrSltd(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcoding.getUserSelected()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcoding.hasSystem()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgSys(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcoding.getSystem()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_SbjctRfrnc ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondata.hasSubjectReference()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctRfrnc(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondata.getSubjectReference()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_Lmt ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondata.hasLimit()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnDataLmt(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondata.getLimit()));
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiondatasort ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent evidencevariablecharacteristicdefinitiontriggerdefinitiondatasort = evidencevariablecharacteristicdefinitiontriggerdefinitiondata.getSortFirstRep();

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_Sort_Path ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasort.hasPath()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnDataSortPath(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasort.getPath()));
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiondatasortdirection ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.SortDirection evidencevariablecharacteristicdefinitiontriggerdefinitiondatasortdirection = evidencevariablecharacteristicdefinitiontriggerdefinitiondatasort.getDirection();
		e.setEvdnceVrbleCrctrstcDfnTrgrDfnDataSortDirection(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasortdirection.toCode());

		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilter ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilter = evidencevariablecharacteristicdefinitiontriggerdefinitiondata.getDateFilterFirstRep();

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_Path ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilter.hasPath()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrPath(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilter.getPath()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_SrchParam ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilter.hasSearchParam()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrSrchParam(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilter.getSearchParam()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_VlDtTimeTyp ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilter.hasValueDateTimeType()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDtTimeTyp(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilter.getValueDateTimeType()));
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueduration = evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilter.getValueDuration();

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_VlDuration_Vl ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueduration.hasValue()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationVl(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueduration.getValue()));
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervaluedurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervaluedurationcomparator = evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueduration.getComparator();
		e.setEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationCmprtr(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervaluedurationcomparator.toCode());

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_VlDuration_Cd ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueduration.hasCode()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationCd(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueduration.getCode()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_VlDuration_Unt ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueduration.hasUnit()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationUnt(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueduration.getUnit()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_VlDuration_Sys ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueduration.hasSystem()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDurationSys(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueduration.getSystem()));
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueperiod = evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilter.getValuePeriod();

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_VlPrd_Strt ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueperiod.hasStart()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlPrdStrt(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueperiod.getStart()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_VlPrd_End ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueperiod.hasEnd()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlPrdEnd(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueperiod.getEnd()));
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefilter ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefilter = evidencevariablecharacteristicdefinitiontriggerdefinitiondata.getCodeFilterFirstRep();

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_CdFltr_Path ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefilter.hasPath()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrPath(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefilter.getPath()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_CdFltr_SrchParam ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefilter.hasSearchParam()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrSrchParam(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefilter.getSearchParam()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_CdFltr_VlSt ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefilter.hasValueSet()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrVlSt(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefilter.getValueSet()));
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercode = evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefilter.getCodeFirstRep();

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_CdFltr_Cd_Vrsn ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercode.hasVersion()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdVrsn(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercode.getVersion()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_CdFltr_Cd_Dsply ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercode.hasDisplay()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdDsply(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercode.getDisplay()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_CdFltr_Cd_UsrSltd ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercode.hasUserSelected()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdUsrSltd(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercode.getUserSelected()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_CdFltr_Cd_Sys ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercode.hasSystem()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdSys(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercode.getSystem()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgRfrnc ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinition.hasTimingReference()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgRfrnc(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinition.getTimingReference()));
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitioncondition ********************************************************************************/
		org.hl7.fhir.r4.model.Expression evidencevariablecharacteristicdefinitiontriggerdefinitioncondition = evidencevariablecharacteristicdefinitiontriggerdefinition.getCondition();

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Cndtn_Nm ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitioncondition.hasName()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnCndtnNm(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitioncondition.getName()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Cndtn_Rfrnc ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitioncondition.hasReference()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnCndtnRfrnc(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitioncondition.getReference()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Cndtn_Lnguage ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitioncondition.hasLanguage()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnCndtnLnguage(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitioncondition.getLanguage()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Cndtn_Dscrptn ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitioncondition.hasDescription()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnCndtnDscrptn(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitioncondition.getDescription()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Cndtn_Exprsn ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitioncondition.hasExpression()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnCndtnExprsn(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitioncondition.getExpression()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgDtTyp ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinition.hasTimingDateType()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgDtTyp(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinition.getTimingDateType()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgDtTimeTyp ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinition.hasTimingDateTimeType()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgDtTimeTyp(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinition.getTimingDateTimeType()));
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtiming = evidencevariablecharacteristicdefinitiontriggerdefinition.getTimingTiming();

		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcode = evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtiming.getCode();

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Cd_Txt ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcode.hasText()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdTxt(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcode.getText()));
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecoding = evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcode.getCodingFirstRep();

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecoding.hasVersion()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgVrsn(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecoding.getVersion()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecoding.hasDisplay()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgDsply(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecoding.getDisplay()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Cd_Cdg_Cd ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecoding.hasCode()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgCd(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecoding.getCode()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecoding.hasUserSelected()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgUsrSltd(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecoding.getUserSelected()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Cd_Cdg_Sys ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecoding.hasSystem()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgSys(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecoding.getSystem()));
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat = evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtiming.getRepeat();

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_Off ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.hasOffset()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptOff(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.getOffset()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_Cnt ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.hasCount()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptCnt(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.getCount()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_Frqncy ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.hasFrequency()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptFrqncy(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.getFrequency()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_Prd ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.hasPeriod()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptPrd(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.getPeriod()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_Duration ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.hasDuration()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptDuration(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.getDuration()));
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsduration = evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.getBoundsDuration();

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsduration.hasValue()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsDurationVl(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsduration.getValue()));
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsdurationcomparator = evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsduration.getComparator();
		e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsDurationCmprtr(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsdurationcomparator.toCode());

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsduration.hasCode()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsDurationCd(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsduration.getCode()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsduration.hasUnit()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsDurationUnt(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsduration.getUnit()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsduration.hasSystem()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsDurationSys(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsduration.getSystem()));
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrange = evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.getBoundsRange();

		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelow = evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrange.getLow();

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelow.hasValue()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngLwVl(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelow.getValue()));
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelowcomparator = evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelow.getComparator();
		e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngLwCmprtr(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelowcomparator.toCode());

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelow.hasCode()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngLwCd(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelow.getCode()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelow.hasUnit()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngLwUnt(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelow.getUnit()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelow.hasSystem()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngLwSys(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelow.getSystem()));
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehigh = evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrange.getHigh();

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehigh.hasValue()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngHiVl(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehigh.getValue()));
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehighcomparator = evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehigh.getComparator();
		e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngHiCmprtr(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehighcomparator.toCode());

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehigh.hasCode()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngHiCd(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehigh.getCode()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehigh.hasUnit()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngHiUnt(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehigh.getUnit()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehigh.hasSystem()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngHiSys(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehigh.getSystem()));
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsperiod = evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.getBoundsPeriod();

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsperiod.hasStart()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsPrdStrt(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsperiod.getStart()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsperiod.hasEnd()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsPrdEnd(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsperiod.getEnd()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_PrdMx ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.hasPeriodMax()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptPrdMx(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.getPeriodMax()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_DurationMx ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.hasDurationMax()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptDurationMx(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.getDurationMax()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_CntMx ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.hasCountMax()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptCntMx(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.getCountMax()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_FrqncyMx ********************************************************************************/
		if(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.hasFrequencyMax()) {
			e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptFrqncyMx(String.valueOf(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.getFrequencyMax()));
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatdurationunit = evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.getDurationUnit();
		e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptDurationUnt(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatdurationunit.toCode());

		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatperiodunit = evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.getPeriodUnit();
		e.setEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptPrdUnt(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatperiodunit.toCode());

		/******************** EvdnceVrble_Crctrstc_Exclude ********************************************************************************/
		if(evidencevariablecharacteristic.hasExclude()) {
			e.setEvdnceVrbleCrctrstcExclude(String.valueOf(evidencevariablecharacteristic.getExclude()));
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveDtTimeTyp ********************************************************************************/
		if(evidencevariablecharacteristic.hasParticipantEffectiveDateTimeType()) {
			e.setEvdnceVrbleCrctrstcPrtcpntEfctiveDtTimeTyp(String.valueOf(evidencevariablecharacteristic.getParticipantEffectiveDateTimeType()));
		}
		/******************** EvdnceVrble_Crctrstc_Dscrptn ********************************************************************************/
		if(evidencevariablecharacteristic.hasDescription()) {
			e.setEvdnceVrbleCrctrstcDscrptn(String.valueOf(evidencevariablecharacteristic.getDescription()));
		}
		/******************** evidencevariablecharacteristictimefromstart ********************************************************************************/
		org.hl7.fhir.r4.model.Duration evidencevariablecharacteristictimefromstart = evidencevariablecharacteristic.getTimeFromStart();

		/******************** EvdnceVrble_Crctrstc_TimeFromStrt_Vl ********************************************************************************/
		if(evidencevariablecharacteristictimefromstart.hasValue()) {
			e.setEvdnceVrbleCrctrstcTimeFromStrtVl(String.valueOf(evidencevariablecharacteristictimefromstart.getValue()));
		}
		/******************** evidencevariablecharacteristictimefromstartcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidencevariablecharacteristictimefromstartcomparator = evidencevariablecharacteristictimefromstart.getComparator();
		e.setEvdnceVrbleCrctrstcTimeFromStrtCmprtr(evidencevariablecharacteristictimefromstartcomparator.toCode());

		/******************** EvdnceVrble_Crctrstc_TimeFromStrt_Cd ********************************************************************************/
		if(evidencevariablecharacteristictimefromstart.hasCode()) {
			e.setEvdnceVrbleCrctrstcTimeFromStrtCd(String.valueOf(evidencevariablecharacteristictimefromstart.getCode()));
		}
		/******************** EvdnceVrble_Crctrstc_TimeFromStrt_Unt ********************************************************************************/
		if(evidencevariablecharacteristictimefromstart.hasUnit()) {
			e.setEvdnceVrbleCrctrstcTimeFromStrtUnt(String.valueOf(evidencevariablecharacteristictimefromstart.getUnit()));
		}
		/******************** EvdnceVrble_Crctrstc_TimeFromStrt_Sys ********************************************************************************/
		if(evidencevariablecharacteristictimefromstart.hasSystem()) {
			e.setEvdnceVrbleCrctrstcTimeFromStrtSys(String.valueOf(evidencevariablecharacteristictimefromstart.getSystem()));
		}
		/******************** evidencevariablecharacteristicgroupmeasure ********************************************************************************/
		org.hl7.fhir.r4.model.EvidenceVariable.GroupMeasure evidencevariablecharacteristicgroupmeasure = evidencevariablecharacteristic.getGroupMeasure();
		e.setEvdnceVrbleCrctrstcGrpMsr(evidencevariablecharacteristicgroupmeasure.toCode());

		/******************** evidencevariableusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext evidencevariableusecontext = evidencevariable.getUseContextFirstRep();

		/******************** evidencevariableusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidencevariableusecontextcode = evidencevariableusecontext.getCode();

		/******************** EvdnceVrble_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(evidencevariableusecontextcode.hasVersion()) {
			e.setEvdnceVrbleUseCntxtCdVrsn(String.valueOf(evidencevariableusecontextcode.getVersion()));
		}
		/******************** EvdnceVrble_UseCntxt_Cd_Dsply ********************************************************************************/
		if(evidencevariableusecontextcode.hasDisplay()) {
			e.setEvdnceVrbleUseCntxtCdDsply(String.valueOf(evidencevariableusecontextcode.getDisplay()));
		}
		/******************** EvdnceVrble_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(evidencevariableusecontextcode.hasUserSelected()) {
			e.setEvdnceVrbleUseCntxtCdUsrSltd(String.valueOf(evidencevariableusecontextcode.getUserSelected()));
		}
		/******************** EvdnceVrble_UseCntxt_Cd_Sys ********************************************************************************/
		if(evidencevariableusecontextcode.hasSystem()) {
			e.setEvdnceVrbleUseCntxtCdSys(String.valueOf(evidencevariableusecontextcode.getSystem()));
		}
		/******************** evidencevariableusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidencevariableusecontextvaluecodeableconcept = evidencevariableusecontext.getValueCodeableConcept();

		/******************** EvdnceVrble_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(evidencevariableusecontextvaluecodeableconcept.hasText()) {
			e.setEvdnceVrbleUseCntxtVlCdbleCncptTxt(String.valueOf(evidencevariableusecontextvaluecodeableconcept.getText()));
		}
		/******************** evidencevariableusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidencevariableusecontextvaluecodeableconceptcoding = evidencevariableusecontextvaluecodeableconcept.getCodingFirstRep();

		/******************** EvdnceVrble_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(evidencevariableusecontextvaluecodeableconceptcoding.hasVersion()) {
			e.setEvdnceVrbleUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(evidencevariableusecontextvaluecodeableconceptcoding.getVersion()));
		}
		/******************** EvdnceVrble_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(evidencevariableusecontextvaluecodeableconceptcoding.hasDisplay()) {
			e.setEvdnceVrbleUseCntxtVlCdbleCncptCdgDsply(String.valueOf(evidencevariableusecontextvaluecodeableconceptcoding.getDisplay()));
		}
		/******************** EvdnceVrble_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(evidencevariableusecontextvaluecodeableconceptcoding.hasCode()) {
			e.setEvdnceVrbleUseCntxtVlCdbleCncptCdgCd(String.valueOf(evidencevariableusecontextvaluecodeableconceptcoding.getCode()));
		}
		/******************** EvdnceVrble_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(evidencevariableusecontextvaluecodeableconceptcoding.hasUserSelected()) {
			e.setEvdnceVrbleUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(evidencevariableusecontextvaluecodeableconceptcoding.getUserSelected()));
		}
		/******************** EvdnceVrble_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(evidencevariableusecontextvaluecodeableconceptcoding.hasSystem()) {
			e.setEvdnceVrbleUseCntxtVlCdbleCncptCdgSys(String.valueOf(evidencevariableusecontextvaluecodeableconceptcoding.getSystem()));
		}
		/******************** evidencevariableusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidencevariableusecontextvaluequantity = evidencevariableusecontext.getValueQuantity();

		/******************** EvdnceVrble_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(evidencevariableusecontextvaluequantity.hasValue()) {
			e.setEvdnceVrbleUseCntxtVlQntyVl(String.valueOf(evidencevariableusecontextvaluequantity.getValue()));
		}
		/******************** evidencevariableusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidencevariableusecontextvaluequantitycomparator = evidencevariableusecontextvaluequantity.getComparator();
		e.setEvdnceVrbleUseCntxtVlQntyCmprtr(evidencevariableusecontextvaluequantitycomparator.toCode());

		/******************** EvdnceVrble_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(evidencevariableusecontextvaluequantity.hasCode()) {
			e.setEvdnceVrbleUseCntxtVlQntyCd(String.valueOf(evidencevariableusecontextvaluequantity.getCode()));
		}
		/******************** EvdnceVrble_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(evidencevariableusecontextvaluequantity.hasUnit()) {
			e.setEvdnceVrbleUseCntxtVlQntyUnt(String.valueOf(evidencevariableusecontextvaluequantity.getUnit()));
		}
		/******************** EvdnceVrble_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(evidencevariableusecontextvaluequantity.hasSystem()) {
			e.setEvdnceVrbleUseCntxtVlQntySys(String.valueOf(evidencevariableusecontextvaluequantity.getSystem()));
		}
		/******************** evidencevariableusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range evidencevariableusecontextvaluerange = evidencevariableusecontext.getValueRange();

		/******************** evidencevariableusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidencevariableusecontextvaluerangelow = evidencevariableusecontextvaluerange.getLow();

		/******************** EvdnceVrble_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(evidencevariableusecontextvaluerangelow.hasValue()) {
			e.setEvdnceVrbleUseCntxtVlRngLwVl(String.valueOf(evidencevariableusecontextvaluerangelow.getValue()));
		}
		/******************** evidencevariableusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidencevariableusecontextvaluerangelowcomparator = evidencevariableusecontextvaluerangelow.getComparator();
		e.setEvdnceVrbleUseCntxtVlRngLwCmprtr(evidencevariableusecontextvaluerangelowcomparator.toCode());

		/******************** EvdnceVrble_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(evidencevariableusecontextvaluerangelow.hasCode()) {
			e.setEvdnceVrbleUseCntxtVlRngLwCd(String.valueOf(evidencevariableusecontextvaluerangelow.getCode()));
		}
		/******************** EvdnceVrble_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(evidencevariableusecontextvaluerangelow.hasUnit()) {
			e.setEvdnceVrbleUseCntxtVlRngLwUnt(String.valueOf(evidencevariableusecontextvaluerangelow.getUnit()));
		}
		/******************** EvdnceVrble_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(evidencevariableusecontextvaluerangelow.hasSystem()) {
			e.setEvdnceVrbleUseCntxtVlRngLwSys(String.valueOf(evidencevariableusecontextvaluerangelow.getSystem()));
		}
		/******************** evidencevariableusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidencevariableusecontextvaluerangehigh = evidencevariableusecontextvaluerange.getHigh();

		/******************** EvdnceVrble_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(evidencevariableusecontextvaluerangehigh.hasValue()) {
			e.setEvdnceVrbleUseCntxtVlRngHiVl(String.valueOf(evidencevariableusecontextvaluerangehigh.getValue()));
		}
		/******************** evidencevariableusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator evidencevariableusecontextvaluerangehighcomparator = evidencevariableusecontextvaluerangehigh.getComparator();
		e.setEvdnceVrbleUseCntxtVlRngHiCmprtr(evidencevariableusecontextvaluerangehighcomparator.toCode());

		/******************** EvdnceVrble_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(evidencevariableusecontextvaluerangehigh.hasCode()) {
			e.setEvdnceVrbleUseCntxtVlRngHiCd(String.valueOf(evidencevariableusecontextvaluerangehigh.getCode()));
		}
		/******************** EvdnceVrble_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(evidencevariableusecontextvaluerangehigh.hasUnit()) {
			e.setEvdnceVrbleUseCntxtVlRngHiUnt(String.valueOf(evidencevariableusecontextvaluerangehigh.getUnit()));
		}
		/******************** EvdnceVrble_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(evidencevariableusecontextvaluerangehigh.hasSystem()) {
			e.setEvdnceVrbleUseCntxtVlRngHiSys(String.valueOf(evidencevariableusecontextvaluerangehigh.getSystem()));
		}
		/******************** EvdnceVrble_UseCntxt_VlRfrnc ********************************************************************************/
		if(evidencevariableusecontext.hasValueReference()) {
			e.setEvdnceVrbleUseCntxtVlRfrnc(String.valueOf(evidencevariableusecontext.getValueReference()));
		}
		/******************** evidencevariablejurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidencevariablejurisdiction = evidencevariable.getJurisdictionFirstRep();

		/******************** EvdnceVrble_Jrsdctn_Txt ********************************************************************************/
		if(evidencevariablejurisdiction.hasText()) {
			e.setEvdnceVrbleJrsdctnTxt(String.valueOf(evidencevariablejurisdiction.getText()));
		}
		/******************** evidencevariablejurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidencevariablejurisdictioncoding = evidencevariablejurisdiction.getCodingFirstRep();

		/******************** EvdnceVrble_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(evidencevariablejurisdictioncoding.hasVersion()) {
			e.setEvdnceVrbleJrsdctnCdgVrsn(String.valueOf(evidencevariablejurisdictioncoding.getVersion()));
		}
		/******************** EvdnceVrble_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(evidencevariablejurisdictioncoding.hasDisplay()) {
			e.setEvdnceVrbleJrsdctnCdgDsply(String.valueOf(evidencevariablejurisdictioncoding.getDisplay()));
		}
		/******************** EvdnceVrble_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(evidencevariablejurisdictioncoding.hasCode()) {
			e.setEvdnceVrbleJrsdctnCdgCd(String.valueOf(evidencevariablejurisdictioncoding.getCode()));
		}
		/******************** EvdnceVrble_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(evidencevariablejurisdictioncoding.hasUserSelected()) {
			e.setEvdnceVrbleJrsdctnCdgUsrSltd(String.valueOf(evidencevariablejurisdictioncoding.getUserSelected()));
		}
		/******************** EvdnceVrble_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(evidencevariablejurisdictioncoding.hasSystem()) {
			e.setEvdnceVrbleJrsdctnCdgSys(String.valueOf(evidencevariablejurisdictioncoding.getSystem()));
		}
		return e;
	}
}
