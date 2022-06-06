package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.CareTeam;
public class CareTeamConversion 
{
	public org.hl7.fhir.r4.model.CareTeam CareTeams(CareTeam c) throws ParseException
	{
		org.hl7.fhir.r4.model.CareTeam careteam = new org.hl7.fhir.r4.model.CareTeam();

		/******************** id ********************************************************************************/
		careteam.setId(c.getId());

		/******************** careteamcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept careteamcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		careteam.addCategory(careteamcategory);

		/******************** careteamcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding careteamcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		careteamcategory.addCoding(careteamcategorycoding);

		/******************** CareTeam_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getCareTeamCtgryCdgCd() != null) {
			careteamcategorycoding.setCode(c.getCareTeamCtgryCdgCd());
		}
		/******************** CareTeam_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getCareTeamCtgryCdgDsply() != null) {
			careteamcategorycoding.setDisplay(c.getCareTeamCtgryCdgDsply());
		}
		/******************** CareTeam_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getCareTeamCtgryCdgSys() != null) {
			careteamcategorycoding.setSystem(c.getCareTeamCtgryCdgSys());
		}
		/******************** CareTeam_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getCareTeamCtgryCdgUsrSltd() != null) {
			careteamcategorycoding.setUserSelected(Boolean.parseBoolean(c.getCareTeamCtgryCdgUsrSltd()));
		}
		/******************** CareTeam_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getCareTeamCtgryCdgVrsn() != null) {
			careteamcategorycoding.setVersion(c.getCareTeamCtgryCdgVrsn());
		}
		/******************** CareTeam_Ctgry_Txt ********************************************************************************/
		if(c.getCareTeamCtgryTxt() != null) {
			careteamcategory.setText(c.getCareTeamCtgryTxt());
		}
		/******************** CareTeam_Enc ********************************************************************************/
		if(c.getCareTeamEnc() != null) {
			careteam.setEncounter( new org.hl7.fhir.r4.model.Reference(c.getCareTeamEnc()));
		}
		/******************** careteamidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier careteamidentifier =  new org.hl7.fhir.r4.model.Identifier();
		careteam.addIdentifier(careteamidentifier);

		/******************** CareTeam_Id_Assigner ********************************************************************************/
		if(c.getCareTeamIdAssigner() != null) {
			careteamidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(c.getCareTeamIdAssigner()));
		}
		/******************** careteamidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period careteamidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		careteamidentifier.setPeriod(careteamidentifierperiod);

		/******************** CareTeam_Id_Prd_End ********************************************************************************/
		if(c.getCareTeamIdPrdEnd() != null) {
			java.text.SimpleDateFormat CareTeam_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CareTeam_Id_Prd_Enddate = CareTeam_Id_Prd_Endsdf.parse(c.getCareTeamIdPrdEnd());
			careteamidentifierperiod.setEnd(CareTeam_Id_Prd_Enddate);
		}
		/******************** CareTeam_Id_Prd_Strt ********************************************************************************/
		if(c.getCareTeamIdPrdStrt() != null) {
			java.text.SimpleDateFormat CareTeam_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CareTeam_Id_Prd_Strtdate = CareTeam_Id_Prd_Strtsdf.parse(c.getCareTeamIdPrdStrt());
			careteamidentifierperiod.setStart(CareTeam_Id_Prd_Strtdate);
		}
		/******************** CareTeam_Id_Sys ********************************************************************************/
		if(c.getCareTeamIdSys() != null) {
			careteamidentifier.setSystem(c.getCareTeamIdSys());
		}
		/******************** careteamidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept careteamidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		careteamidentifier.setType(careteamidentifiertype);

		/******************** careteamidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding careteamidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		careteamidentifiertype.addCoding(careteamidentifiertypecoding);

		/******************** CareTeam_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCareTeamIdTypCdgCd() != null) {
			careteamidentifiertypecoding.setCode(c.getCareTeamIdTypCdgCd());
		}
		/******************** CareTeam_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCareTeamIdTypCdgDsply() != null) {
			careteamidentifiertypecoding.setDisplay(c.getCareTeamIdTypCdgDsply());
		}
		/******************** CareTeam_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCareTeamIdTypCdgSys() != null) {
			careteamidentifiertypecoding.setSystem(c.getCareTeamIdTypCdgSys());
		}
		/******************** CareTeam_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCareTeamIdTypCdgUsrSltd() != null) {
			careteamidentifiertypecoding.setUserSelected(Boolean.parseBoolean(c.getCareTeamIdTypCdgUsrSltd()));
		}
		/******************** CareTeam_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCareTeamIdTypCdgVrsn() != null) {
			careteamidentifiertypecoding.setVersion(c.getCareTeamIdTypCdgVrsn());
		}
		/******************** CareTeam_Id_Typ_Txt ********************************************************************************/
		if(c.getCareTeamIdTypTxt() != null) {
			careteamidentifiertype.setText(c.getCareTeamIdTypTxt());
		}
		/******************** careteamidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory careteamidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		careteamidentifier.setUse(careteamidentifieruse.fromCode(c.getCareTeamIdUse()));

		/******************** CareTeam_Id_Vl ********************************************************************************/
		if(c.getCareTeamIdVl() != null) {
			careteamidentifier.setValue(c.getCareTeamIdVl());
		}
		/******************** CareTeam_ManagingOrgnztn ********************************************************************************/
		if(c.getCareTeamManagingOrgnztn() != null) {
			careteam.addManagingOrganization( new org.hl7.fhir.r4.model.Reference(c.getCareTeamManagingOrgnztn()));
		}
		/******************** CareTeam_Nm ********************************************************************************/
		if(c.getCareTeamNm() != null) {
			careteam.setName(c.getCareTeamNm());
		}
		/******************** careteamnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation careteamnote =  new org.hl7.fhir.r4.model.Annotation();
		careteam.addNote(careteamnote);

		/******************** CareTeam_Nt_AthrRfrnc ********************************************************************************/
		if(c.getCareTeamNtAthrRfrnc() != null) {
			careteamnote.setAuthor( new org.hl7.fhir.r4.model.Reference(c.getCareTeamNtAthrRfrnc()));
		}
		/******************** CareTeam_Nt_AthrStrgTyp ********************************************************************************/
		if(c.getCareTeamNtAthrStrgTyp() != null) {
			careteamnote.setAuthor( new org.hl7.fhir.r4.model.StringType(c.getCareTeamNtAthrStrgTyp()));
		}
		/******************** CareTeam_Nt_Txt ********************************************************************************/
		if(c.getCareTeamNtTxt() != null) {
			careteamnote.setText(c.getCareTeamNtTxt());
		}
		/******************** CareTeam_Nt_Time ********************************************************************************/
		if(c.getCareTeamNtTime() != null) {
			java.text.SimpleDateFormat CareTeam_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CareTeam_Nt_Timedate = CareTeam_Nt_Timesdf.parse(c.getCareTeamNtTime());
			careteamnote.setTime(CareTeam_Nt_Timedate);
		}
		/******************** careteamparticipant ********************************************************************************/
		org.hl7.fhir.r4.model.CareTeam.CareTeamParticipantComponent careteamparticipant =  new org.hl7.fhir.r4.model.CareTeam.CareTeamParticipantComponent();
		careteam.addParticipant(careteamparticipant);

		/******************** CareTeam_Prtcpnt_Mmbr ********************************************************************************/
		if(c.getCareTeamPrtcpntMmbr() != null) {
			careteamparticipant.setMember( new org.hl7.fhir.r4.model.Reference(c.getCareTeamPrtcpntMmbr()));
		}
		/******************** CareTeam_Prtcpnt_OnBehalfOf ********************************************************************************/
		if(c.getCareTeamPrtcpntOnBehalfOf() != null) {
			careteamparticipant.setOnBehalfOf( new org.hl7.fhir.r4.model.Reference(c.getCareTeamPrtcpntOnBehalfOf()));
		}
		/******************** careteamparticipantperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period careteamparticipantperiod =  new org.hl7.fhir.r4.model.Period();
		careteamparticipant.setPeriod(careteamparticipantperiod);

		/******************** CareTeam_Prtcpnt_Prd_End ********************************************************************************/
		if(c.getCareTeamPrtcpntPrdEnd() != null) {
			java.text.SimpleDateFormat CareTeam_Prtcpnt_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CareTeam_Prtcpnt_Prd_Enddate = CareTeam_Prtcpnt_Prd_Endsdf.parse(c.getCareTeamPrtcpntPrdEnd());
			careteamparticipantperiod.setEnd(CareTeam_Prtcpnt_Prd_Enddate);
		}
		/******************** CareTeam_Prtcpnt_Prd_Strt ********************************************************************************/
		if(c.getCareTeamPrtcpntPrdStrt() != null) {
			java.text.SimpleDateFormat CareTeam_Prtcpnt_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CareTeam_Prtcpnt_Prd_Strtdate = CareTeam_Prtcpnt_Prd_Strtsdf.parse(c.getCareTeamPrtcpntPrdStrt());
			careteamparticipantperiod.setStart(CareTeam_Prtcpnt_Prd_Strtdate);
		}
		/******************** careteamparticipantrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept careteamparticipantrole =  new org.hl7.fhir.r4.model.CodeableConcept();
		careteamparticipant.addRole(careteamparticipantrole);

		/******************** careteamparticipantrolecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding careteamparticipantrolecoding =  new org.hl7.fhir.r4.model.Coding();
		careteamparticipantrole.addCoding(careteamparticipantrolecoding);

		/******************** CareTeam_Prtcpnt_Role_Cdg_Cd ********************************************************************************/
		if(c.getCareTeamPrtcpntRoleCdgCd() != null) {
			careteamparticipantrolecoding.setCode(c.getCareTeamPrtcpntRoleCdgCd());
		}
		/******************** CareTeam_Prtcpnt_Role_Cdg_Dsply ********************************************************************************/
		if(c.getCareTeamPrtcpntRoleCdgDsply() != null) {
			careteamparticipantrolecoding.setDisplay(c.getCareTeamPrtcpntRoleCdgDsply());
		}
		/******************** CareTeam_Prtcpnt_Role_Cdg_Sys ********************************************************************************/
		if(c.getCareTeamPrtcpntRoleCdgSys() != null) {
			careteamparticipantrolecoding.setSystem(c.getCareTeamPrtcpntRoleCdgSys());
		}
		/******************** CareTeam_Prtcpnt_Role_Cdg_UsrSltd ********************************************************************************/
		if(c.getCareTeamPrtcpntRoleCdgUsrSltd() != null) {
			careteamparticipantrolecoding.setUserSelected(Boolean.parseBoolean(c.getCareTeamPrtcpntRoleCdgUsrSltd()));
		}
		/******************** CareTeam_Prtcpnt_Role_Cdg_Vrsn ********************************************************************************/
		if(c.getCareTeamPrtcpntRoleCdgVrsn() != null) {
			careteamparticipantrolecoding.setVersion(c.getCareTeamPrtcpntRoleCdgVrsn());
		}
		/******************** CareTeam_Prtcpnt_Role_Txt ********************************************************************************/
		if(c.getCareTeamPrtcpntRoleTxt() != null) {
			careteamparticipantrole.setText(c.getCareTeamPrtcpntRoleTxt());
		}
		/******************** careteamperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period careteamperiod =  new org.hl7.fhir.r4.model.Period();
		careteam.setPeriod(careteamperiod);

		/******************** CareTeam_Prd_End ********************************************************************************/
		if(c.getCareTeamPrdEnd() != null) {
			java.text.SimpleDateFormat CareTeam_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CareTeam_Prd_Enddate = CareTeam_Prd_Endsdf.parse(c.getCareTeamPrdEnd());
			careteamperiod.setEnd(CareTeam_Prd_Enddate);
		}
		/******************** CareTeam_Prd_Strt ********************************************************************************/
		if(c.getCareTeamPrdStrt() != null) {
			java.text.SimpleDateFormat CareTeam_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CareTeam_Prd_Strtdate = CareTeam_Prd_Strtsdf.parse(c.getCareTeamPrdStrt());
			careteamperiod.setStart(CareTeam_Prd_Strtdate);
		}
		/******************** careteamreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept careteamreasoncode =  new org.hl7.fhir.r4.model.CodeableConcept();
		careteam.addReasonCode(careteamreasoncode);

		/******************** careteamreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding careteamreasoncodecoding =  new org.hl7.fhir.r4.model.Coding();
		careteamreasoncode.addCoding(careteamreasoncodecoding);

		/******************** CareTeam_RsnCd_Cdg_Cd ********************************************************************************/
		if(c.getCareTeamRsnCdCdgCd() != null) {
			careteamreasoncodecoding.setCode(c.getCareTeamRsnCdCdgCd());
		}
		/******************** CareTeam_RsnCd_Cdg_Dsply ********************************************************************************/
		if(c.getCareTeamRsnCdCdgDsply() != null) {
			careteamreasoncodecoding.setDisplay(c.getCareTeamRsnCdCdgDsply());
		}
		/******************** CareTeam_RsnCd_Cdg_Sys ********************************************************************************/
		if(c.getCareTeamRsnCdCdgSys() != null) {
			careteamreasoncodecoding.setSystem(c.getCareTeamRsnCdCdgSys());
		}
		/******************** CareTeam_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(c.getCareTeamRsnCdCdgUsrSltd() != null) {
			careteamreasoncodecoding.setUserSelected(Boolean.parseBoolean(c.getCareTeamRsnCdCdgUsrSltd()));
		}
		/******************** CareTeam_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(c.getCareTeamRsnCdCdgVrsn() != null) {
			careteamreasoncodecoding.setVersion(c.getCareTeamRsnCdCdgVrsn());
		}
		/******************** CareTeam_RsnCd_Txt ********************************************************************************/
		if(c.getCareTeamRsnCdTxt() != null) {
			careteamreasoncode.setText(c.getCareTeamRsnCdTxt());
		}
		/******************** CareTeam_RsnRfrnc ********************************************************************************/
		if(c.getCareTeamRsnRfrnc() != null) {
			careteam.addReasonReference( new org.hl7.fhir.r4.model.Reference(c.getCareTeamRsnRfrnc()));
		}
		/******************** careteamstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CareTeam.CareTeamStatusEnumFactory careteamstatus =  new org.hl7.fhir.r4.model.CareTeam.CareTeamStatusEnumFactory();
		careteam.setStatus(careteamstatus.fromCode(c.getCareTeamSts()));

		/******************** CareTeam_Sbjct ********************************************************************************/
		if(c.getCareTeamSbjct() != null) {
			careteam.setSubject( new org.hl7.fhir.r4.model.Reference(c.getCareTeamSbjct()));
		}
		/******************** careteamtelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint careteamtelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		careteam.addTelecom(careteamtelecom);

		/******************** careteamtelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period careteamtelecomperiod =  new org.hl7.fhir.r4.model.Period();
		careteamtelecom.setPeriod(careteamtelecomperiod);

		/******************** CareTeam_Tlcm_Prd_End ********************************************************************************/
		if(c.getCareTeamTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat CareTeam_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CareTeam_Tlcm_Prd_Enddate = CareTeam_Tlcm_Prd_Endsdf.parse(c.getCareTeamTlcmPrdEnd());
			careteamtelecomperiod.setEnd(CareTeam_Tlcm_Prd_Enddate);
		}
		/******************** CareTeam_Tlcm_Prd_Strt ********************************************************************************/
		if(c.getCareTeamTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat CareTeam_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CareTeam_Tlcm_Prd_Strtdate = CareTeam_Tlcm_Prd_Strtsdf.parse(c.getCareTeamTlcmPrdStrt());
			careteamtelecomperiod.setStart(CareTeam_Tlcm_Prd_Strtdate);
		}
		/******************** CareTeam_Tlcm_Rnk ********************************************************************************/
		if(c.getCareTeamTlcmRnk() != null) {
			careteamtelecom.setRank(Integer.parseInt(c.getCareTeamTlcmRnk()));
		}
		/******************** careteamtelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory careteamtelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		careteamtelecom.setSystem(careteamtelecomsystem.fromCode(c.getCareTeamTlcmSys()));

		/******************** careteamtelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory careteamtelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		careteamtelecom.setUse(careteamtelecomuse.fromCode(c.getCareTeamTlcmUse()));

		/******************** CareTeam_Tlcm_Vl ********************************************************************************/
		if(c.getCareTeamTlcmVl() != null) {
			careteamtelecom.setValue(c.getCareTeamTlcmVl());
		}
		return careteam;
	}
}
