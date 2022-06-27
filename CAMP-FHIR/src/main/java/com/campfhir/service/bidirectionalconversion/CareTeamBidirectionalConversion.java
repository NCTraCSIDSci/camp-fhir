package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.CareTeam;
public class CareTeamBidirectionalConversion 
{
	public CareTeam CareTeams(org.hl7.fhir.r4.model.CareTeam careteam) throws ParseException
	{
		 main.java.com.campfhir.model.CareTeam c = new  main.java.com.campfhir.model.CareTeam();

		/******************** id ********************************************************************************/
		careteam.setId(c.getId());

		/******************** CareTeam_Nm ********************************************************************************/
		if(careteam.hasName()) {
			c.setCareTeamNm(String.valueOf(careteam.getName()));
		}
		/******************** CareTeam_ManagingOrgnztn ********************************************************************************/
		if(careteam.hasManagingOrganization()) {
			c.setCareTeamManagingOrgnztn(String.valueOf(careteam.getManagingOrganizationFirstRep()));
		}
		/******************** CareTeam_Enc ********************************************************************************/
		if(careteam.hasEncounter()) {
			c.setCareTeamEnc(String.valueOf(careteam.getEncounter()));
		}
		/******************** CareTeam_Sbjct ********************************************************************************/
		if(careteam.hasSubject()) {
			c.setCareTeamSbjct(String.valueOf(careteam.getSubject()));
		}
		/******************** careteamstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CareTeam.CareTeamStatus careteamstatus = careteam.getStatus();
		c.setCareTeamSts(careteamstatus.toCode());

		/******************** careteamnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation careteamnote = careteam.getNoteFirstRep();

		/******************** CareTeam_Nt_Time ********************************************************************************/
		if(careteamnote.hasTime()) {
			c.setCareTeamNtTime(String.valueOf(careteamnote.getTime()));
		}
		/******************** CareTeam_Nt_Txt ********************************************************************************/
		if(careteamnote.hasText()) {
			c.setCareTeamNtTxt(String.valueOf(careteamnote.getText()));
		}
		/******************** CareTeam_Nt_AthrRfrnc ********************************************************************************/
		if(careteamnote.hasAuthorReference()) {
			c.setCareTeamNtAthrRfrnc(String.valueOf(careteamnote.getAuthorReference()));
		}
		/******************** CareTeam_Nt_AthrStrgTyp ********************************************************************************/
		if(careteamnote.hasAuthorStringType()) {
			c.setCareTeamNtAthrStrgTyp(String.valueOf(careteamnote.getAuthorStringType()));
		}
		/******************** careteamperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period careteamperiod = careteam.getPeriod();

		/******************** CareTeam_Prd_Strt ********************************************************************************/
		if(careteamperiod.hasStart()) {
			c.setCareTeamPrdStrt(String.valueOf(careteamperiod.getStart()));
		}
		/******************** CareTeam_Prd_End ********************************************************************************/
		if(careteamperiod.hasEnd()) {
			c.setCareTeamPrdEnd(String.valueOf(careteamperiod.getEnd()));
		}
		/******************** careteamtelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint careteamtelecom = careteam.getTelecomFirstRep();

		/******************** CareTeam_Tlcm_Vl ********************************************************************************/
		if(careteamtelecom.hasValue()) {
			c.setCareTeamTlcmVl(String.valueOf(careteamtelecom.getValue()));
		}
		/******************** careteamtelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period careteamtelecomperiod = careteamtelecom.getPeriod();

		/******************** CareTeam_Tlcm_Prd_Strt ********************************************************************************/
		if(careteamtelecomperiod.hasStart()) {
			c.setCareTeamTlcmPrdStrt(String.valueOf(careteamtelecomperiod.getStart()));
		}
		/******************** CareTeam_Tlcm_Prd_End ********************************************************************************/
		if(careteamtelecomperiod.hasEnd()) {
			c.setCareTeamTlcmPrdEnd(String.valueOf(careteamtelecomperiod.getEnd()));
		}
		/******************** careteamtelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem careteamtelecomsystem = careteamtelecom.getSystem();
		c.setCareTeamTlcmSys(careteamtelecomsystem.toCode());

		/******************** careteamtelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse careteamtelecomuse = careteamtelecom.getUse();
		c.setCareTeamTlcmUse(careteamtelecomuse.toCode());

		/******************** CareTeam_Tlcm_Rnk ********************************************************************************/
		if(careteamtelecom.hasRank()) {
			c.setCareTeamTlcmRnk(String.valueOf(careteamtelecom.getRank()));
		}
		/******************** careteamparticipant ********************************************************************************/
		org.hl7.fhir.r4.model.CareTeam.CareTeamParticipantComponent careteamparticipant = careteam.getParticipantFirstRep();

		/******************** careteamparticipantperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period careteamparticipantperiod = careteamparticipant.getPeriod();

		/******************** CareTeam_Prtcpnt_Prd_Strt ********************************************************************************/
		if(careteamparticipantperiod.hasStart()) {
			c.setCareTeamPrtcpntPrdStrt(String.valueOf(careteamparticipantperiod.getStart()));
		}
		/******************** CareTeam_Prtcpnt_Prd_End ********************************************************************************/
		if(careteamparticipantperiod.hasEnd()) {
			c.setCareTeamPrtcpntPrdEnd(String.valueOf(careteamparticipantperiod.getEnd()));
		}
		/******************** CareTeam_Prtcpnt_OnBehalfOf ********************************************************************************/
		if(careteamparticipant.hasOnBehalfOf()) {
			c.setCareTeamPrtcpntOnBehalfOf(String.valueOf(careteamparticipant.getOnBehalfOf()));
		}
		/******************** careteamparticipantrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept careteamparticipantrole = careteamparticipant.getRoleFirstRep();

		/******************** CareTeam_Prtcpnt_Role_Txt ********************************************************************************/
		if(careteamparticipantrole.hasText()) {
			c.setCareTeamPrtcpntRoleTxt(String.valueOf(careteamparticipantrole.getText()));
		}
		/******************** careteamparticipantrolecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding careteamparticipantrolecoding = careteamparticipantrole.getCodingFirstRep();

		/******************** CareTeam_Prtcpnt_Role_Cdg_Vrsn ********************************************************************************/
		if(careteamparticipantrolecoding.hasVersion()) {
			c.setCareTeamPrtcpntRoleCdgVrsn(String.valueOf(careteamparticipantrolecoding.getVersion()));
		}
		/******************** CareTeam_Prtcpnt_Role_Cdg_Dsply ********************************************************************************/
		if(careteamparticipantrolecoding.hasDisplay()) {
			c.setCareTeamPrtcpntRoleCdgDsply(String.valueOf(careteamparticipantrolecoding.getDisplay()));
		}
		/******************** CareTeam_Prtcpnt_Role_Cdg_Cd ********************************************************************************/
		if(careteamparticipantrolecoding.hasCode()) {
			c.setCareTeamPrtcpntRoleCdgCd(String.valueOf(careteamparticipantrolecoding.getCode()));
		}
		/******************** CareTeam_Prtcpnt_Role_Cdg_UsrSltd ********************************************************************************/
		if(careteamparticipantrolecoding.hasUserSelected()) {
			c.setCareTeamPrtcpntRoleCdgUsrSltd(String.valueOf(careteamparticipantrolecoding.getUserSelected()));
		}
		/******************** CareTeam_Prtcpnt_Role_Cdg_Sys ********************************************************************************/
		if(careteamparticipantrolecoding.hasSystem()) {
			c.setCareTeamPrtcpntRoleCdgSys(String.valueOf(careteamparticipantrolecoding.getSystem()));
		}
		/******************** CareTeam_Prtcpnt_Mmbr ********************************************************************************/
		if(careteamparticipant.hasMember()) {
			c.setCareTeamPrtcpntMmbr(String.valueOf(careteamparticipant.getMember()));
		}
		/******************** careteamidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier careteamidentifier = careteam.getIdentifierFirstRep();

		/******************** CareTeam_Id_Vl ********************************************************************************/
		if(careteamidentifier.hasValue()) {
			c.setCareTeamIdVl(String.valueOf(careteamidentifier.getValue()));
		}
		/******************** careteamidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept careteamidentifiertype = careteamidentifier.getType();

		/******************** CareTeam_Id_Typ_Txt ********************************************************************************/
		if(careteamidentifiertype.hasText()) {
			c.setCareTeamIdTypTxt(String.valueOf(careteamidentifiertype.getText()));
		}
		/******************** careteamidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding careteamidentifiertypecoding = careteamidentifiertype.getCodingFirstRep();

		/******************** CareTeam_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(careteamidentifiertypecoding.hasVersion()) {
			c.setCareTeamIdTypCdgVrsn(String.valueOf(careteamidentifiertypecoding.getVersion()));
		}
		/******************** CareTeam_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(careteamidentifiertypecoding.hasDisplay()) {
			c.setCareTeamIdTypCdgDsply(String.valueOf(careteamidentifiertypecoding.getDisplay()));
		}
		/******************** CareTeam_Id_Typ_Cdg_Cd ********************************************************************************/
		if(careteamidentifiertypecoding.hasCode()) {
			c.setCareTeamIdTypCdgCd(String.valueOf(careteamidentifiertypecoding.getCode()));
		}
		/******************** CareTeam_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(careteamidentifiertypecoding.hasUserSelected()) {
			c.setCareTeamIdTypCdgUsrSltd(String.valueOf(careteamidentifiertypecoding.getUserSelected()));
		}
		/******************** CareTeam_Id_Typ_Cdg_Sys ********************************************************************************/
		if(careteamidentifiertypecoding.hasSystem()) {
			c.setCareTeamIdTypCdgSys(String.valueOf(careteamidentifiertypecoding.getSystem()));
		}
		/******************** careteamidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period careteamidentifierperiod = careteamidentifier.getPeriod();

		/******************** CareTeam_Id_Prd_Strt ********************************************************************************/
		if(careteamidentifierperiod.hasStart()) {
			c.setCareTeamIdPrdStrt(String.valueOf(careteamidentifierperiod.getStart()));
		}
		/******************** CareTeam_Id_Prd_End ********************************************************************************/
		if(careteamidentifierperiod.hasEnd()) {
			c.setCareTeamIdPrdEnd(String.valueOf(careteamidentifierperiod.getEnd()));
		}
		/******************** CareTeam_Id_Assigner ********************************************************************************/
		if(careteamidentifier.hasAssigner()) {
			c.setCareTeamIdAssigner(String.valueOf(careteamidentifier.getAssigner()));
		}
		/******************** CareTeam_Id_Sys ********************************************************************************/
		if(careteamidentifier.hasSystem()) {
			c.setCareTeamIdSys(String.valueOf(careteamidentifier.getSystem()));
		}
		/******************** careteamidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse careteamidentifieruse = careteamidentifier.getUse();
		c.setCareTeamIdUse(careteamidentifieruse.toCode());

		/******************** careteamreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept careteamreasoncode = careteam.getReasonCodeFirstRep();

		/******************** CareTeam_RsnCd_Txt ********************************************************************************/
		if(careteamreasoncode.hasText()) {
			c.setCareTeamRsnCdTxt(String.valueOf(careteamreasoncode.getText()));
		}
		/******************** careteamreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding careteamreasoncodecoding = careteamreasoncode.getCodingFirstRep();

		/******************** CareTeam_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(careteamreasoncodecoding.hasVersion()) {
			c.setCareTeamRsnCdCdgVrsn(String.valueOf(careteamreasoncodecoding.getVersion()));
		}
		/******************** CareTeam_RsnCd_Cdg_Dsply ********************************************************************************/
		if(careteamreasoncodecoding.hasDisplay()) {
			c.setCareTeamRsnCdCdgDsply(String.valueOf(careteamreasoncodecoding.getDisplay()));
		}
		/******************** CareTeam_RsnCd_Cdg_Cd ********************************************************************************/
		if(careteamreasoncodecoding.hasCode()) {
			c.setCareTeamRsnCdCdgCd(String.valueOf(careteamreasoncodecoding.getCode()));
		}
		/******************** CareTeam_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(careteamreasoncodecoding.hasUserSelected()) {
			c.setCareTeamRsnCdCdgUsrSltd(String.valueOf(careteamreasoncodecoding.getUserSelected()));
		}
		/******************** CareTeam_RsnCd_Cdg_Sys ********************************************************************************/
		if(careteamreasoncodecoding.hasSystem()) {
			c.setCareTeamRsnCdCdgSys(String.valueOf(careteamreasoncodecoding.getSystem()));
		}
		/******************** CareTeam_RsnRfrnc ********************************************************************************/
		if(careteam.hasReasonReference()) {
			c.setCareTeamRsnRfrnc(String.valueOf(careteam.getReasonReferenceFirstRep()));
		}
		/******************** careteamcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept careteamcategory = careteam.getCategoryFirstRep();

		/******************** CareTeam_Ctgry_Txt ********************************************************************************/
		if(careteamcategory.hasText()) {
			c.setCareTeamCtgryTxt(String.valueOf(careteamcategory.getText()));
		}
		/******************** careteamcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding careteamcategorycoding = careteamcategory.getCodingFirstRep();

		/******************** CareTeam_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(careteamcategorycoding.hasVersion()) {
			c.setCareTeamCtgryCdgVrsn(String.valueOf(careteamcategorycoding.getVersion()));
		}
		/******************** CareTeam_Ctgry_Cdg_Dsply ********************************************************************************/
		if(careteamcategorycoding.hasDisplay()) {
			c.setCareTeamCtgryCdgDsply(String.valueOf(careteamcategorycoding.getDisplay()));
		}
		/******************** CareTeam_Ctgry_Cdg_Cd ********************************************************************************/
		if(careteamcategorycoding.hasCode()) {
			c.setCareTeamCtgryCdgCd(String.valueOf(careteamcategorycoding.getCode()));
		}
		/******************** CareTeam_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(careteamcategorycoding.hasUserSelected()) {
			c.setCareTeamCtgryCdgUsrSltd(String.valueOf(careteamcategorycoding.getUserSelected()));
		}
		/******************** CareTeam_Ctgry_Cdg_Sys ********************************************************************************/
		if(careteamcategorycoding.hasSystem()) {
			c.setCareTeamCtgryCdgSys(String.valueOf(careteamcategorycoding.getSystem()));
		}
		return c;
	}
}
