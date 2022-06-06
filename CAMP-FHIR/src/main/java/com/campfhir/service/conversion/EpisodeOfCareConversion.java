package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.EpisodeOfCare;
public class EpisodeOfCareConversion 
{
	public org.hl7.fhir.r4.model.EpisodeOfCare EpisodeOfCares(EpisodeOfCare e) throws ParseException
	{
		org.hl7.fhir.r4.model.EpisodeOfCare episodeofcare = new org.hl7.fhir.r4.model.EpisodeOfCare();

		/******************** id ********************************************************************************/
		episodeofcare.setId(e.getId());

		/******************** EpisodeOfCare_Account ********************************************************************************/
		if(e.getEpisodeOfCareAccount() != null) {
			episodeofcare.addAccount( new org.hl7.fhir.r4.model.Reference(e.getEpisodeOfCareAccount()));
		}
		/******************** EpisodeOfCare_CareManager ********************************************************************************/
		if(e.getEpisodeOfCareCareManager() != null) {
			episodeofcare.setCareManager( new org.hl7.fhir.r4.model.Reference(e.getEpisodeOfCareCareManager()));
		}
		/******************** episodeofcarediagnosis ********************************************************************************/
		org.hl7.fhir.r4.model.EpisodeOfCare.DiagnosisComponent episodeofcarediagnosis =  new org.hl7.fhir.r4.model.EpisodeOfCare.DiagnosisComponent();
		episodeofcare.addDiagnosis(episodeofcarediagnosis);

		/******************** EpisodeOfCare_Dgnsis_Cndtn ********************************************************************************/
		if(e.getEpisodeOfCareDgnsisCndtn() != null) {
			episodeofcarediagnosis.setCondition( new org.hl7.fhir.r4.model.Reference(e.getEpisodeOfCareDgnsisCndtn()));
		}
		/******************** EpisodeOfCare_Dgnsis_Rnk ********************************************************************************/
		if(e.getEpisodeOfCareDgnsisRnk() != null) {
			episodeofcarediagnosis.setRank(Integer.parseInt(e.getEpisodeOfCareDgnsisRnk()));
		}
		/******************** episodeofcarediagnosisrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept episodeofcarediagnosisrole =  new org.hl7.fhir.r4.model.CodeableConcept();
		episodeofcarediagnosis.setRole(episodeofcarediagnosisrole);

		/******************** episodeofcarediagnosisrolecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding episodeofcarediagnosisrolecoding =  new org.hl7.fhir.r4.model.Coding();
		episodeofcarediagnosisrole.addCoding(episodeofcarediagnosisrolecoding);

		/******************** EpisodeOfCare_Dgnsis_Role_Cdg_Cd ********************************************************************************/
		if(e.getEpisodeOfCareDgnsisRoleCdgCd() != null) {
			episodeofcarediagnosisrolecoding.setCode(e.getEpisodeOfCareDgnsisRoleCdgCd());
		}
		/******************** EpisodeOfCare_Dgnsis_Role_Cdg_Dsply ********************************************************************************/
		if(e.getEpisodeOfCareDgnsisRoleCdgDsply() != null) {
			episodeofcarediagnosisrolecoding.setDisplay(e.getEpisodeOfCareDgnsisRoleCdgDsply());
		}
		/******************** EpisodeOfCare_Dgnsis_Role_Cdg_Sys ********************************************************************************/
		if(e.getEpisodeOfCareDgnsisRoleCdgSys() != null) {
			episodeofcarediagnosisrolecoding.setSystem(e.getEpisodeOfCareDgnsisRoleCdgSys());
		}
		/******************** EpisodeOfCare_Dgnsis_Role_Cdg_UsrSltd ********************************************************************************/
		if(e.getEpisodeOfCareDgnsisRoleCdgUsrSltd() != null) {
			episodeofcarediagnosisrolecoding.setUserSelected(Boolean.parseBoolean(e.getEpisodeOfCareDgnsisRoleCdgUsrSltd()));
		}
		/******************** EpisodeOfCare_Dgnsis_Role_Cdg_Vrsn ********************************************************************************/
		if(e.getEpisodeOfCareDgnsisRoleCdgVrsn() != null) {
			episodeofcarediagnosisrolecoding.setVersion(e.getEpisodeOfCareDgnsisRoleCdgVrsn());
		}
		/******************** EpisodeOfCare_Dgnsis_Role_Txt ********************************************************************************/
		if(e.getEpisodeOfCareDgnsisRoleTxt() != null) {
			episodeofcarediagnosisrole.setText(e.getEpisodeOfCareDgnsisRoleTxt());
		}
		/******************** episodeofcareidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier episodeofcareidentifier =  new org.hl7.fhir.r4.model.Identifier();
		episodeofcare.addIdentifier(episodeofcareidentifier);

		/******************** EpisodeOfCare_Id_Assigner ********************************************************************************/
		if(e.getEpisodeOfCareIdAssigner() != null) {
			episodeofcareidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(e.getEpisodeOfCareIdAssigner()));
		}
		/******************** episodeofcareidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period episodeofcareidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		episodeofcareidentifier.setPeriod(episodeofcareidentifierperiod);

		/******************** EpisodeOfCare_Id_Prd_End ********************************************************************************/
		if(e.getEpisodeOfCareIdPrdEnd() != null) {
			java.text.SimpleDateFormat EpisodeOfCare_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EpisodeOfCare_Id_Prd_Enddate = EpisodeOfCare_Id_Prd_Endsdf.parse(e.getEpisodeOfCareIdPrdEnd());
			episodeofcareidentifierperiod.setEnd(EpisodeOfCare_Id_Prd_Enddate);
		}
		/******************** EpisodeOfCare_Id_Prd_Strt ********************************************************************************/
		if(e.getEpisodeOfCareIdPrdStrt() != null) {
			java.text.SimpleDateFormat EpisodeOfCare_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EpisodeOfCare_Id_Prd_Strtdate = EpisodeOfCare_Id_Prd_Strtsdf.parse(e.getEpisodeOfCareIdPrdStrt());
			episodeofcareidentifierperiod.setStart(EpisodeOfCare_Id_Prd_Strtdate);
		}
		/******************** EpisodeOfCare_Id_Sys ********************************************************************************/
		if(e.getEpisodeOfCareIdSys() != null) {
			episodeofcareidentifier.setSystem(e.getEpisodeOfCareIdSys());
		}
		/******************** episodeofcareidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept episodeofcareidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		episodeofcareidentifier.setType(episodeofcareidentifiertype);

		/******************** episodeofcareidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding episodeofcareidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		episodeofcareidentifiertype.addCoding(episodeofcareidentifiertypecoding);

		/******************** EpisodeOfCare_Id_Typ_Cdg_Cd ********************************************************************************/
		if(e.getEpisodeOfCareIdTypCdgCd() != null) {
			episodeofcareidentifiertypecoding.setCode(e.getEpisodeOfCareIdTypCdgCd());
		}
		/******************** EpisodeOfCare_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getEpisodeOfCareIdTypCdgDsply() != null) {
			episodeofcareidentifiertypecoding.setDisplay(e.getEpisodeOfCareIdTypCdgDsply());
		}
		/******************** EpisodeOfCare_Id_Typ_Cdg_Sys ********************************************************************************/
		if(e.getEpisodeOfCareIdTypCdgSys() != null) {
			episodeofcareidentifiertypecoding.setSystem(e.getEpisodeOfCareIdTypCdgSys());
		}
		/******************** EpisodeOfCare_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getEpisodeOfCareIdTypCdgUsrSltd() != null) {
			episodeofcareidentifiertypecoding.setUserSelected(Boolean.parseBoolean(e.getEpisodeOfCareIdTypCdgUsrSltd()));
		}
		/******************** EpisodeOfCare_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getEpisodeOfCareIdTypCdgVrsn() != null) {
			episodeofcareidentifiertypecoding.setVersion(e.getEpisodeOfCareIdTypCdgVrsn());
		}
		/******************** EpisodeOfCare_Id_Typ_Txt ********************************************************************************/
		if(e.getEpisodeOfCareIdTypTxt() != null) {
			episodeofcareidentifiertype.setText(e.getEpisodeOfCareIdTypTxt());
		}
		/******************** episodeofcareidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory episodeofcareidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		episodeofcareidentifier.setUse(episodeofcareidentifieruse.fromCode(e.getEpisodeOfCareIdUse()));

		/******************** EpisodeOfCare_Id_Vl ********************************************************************************/
		if(e.getEpisodeOfCareIdVl() != null) {
			episodeofcareidentifier.setValue(e.getEpisodeOfCareIdVl());
		}
		/******************** EpisodeOfCare_ManagingOrgnztn ********************************************************************************/
		if(e.getEpisodeOfCareManagingOrgnztn() != null) {
			episodeofcare.setManagingOrganization( new org.hl7.fhir.r4.model.Reference(e.getEpisodeOfCareManagingOrgnztn()));
		}
		/******************** EpisodeOfCare_Pnt ********************************************************************************/
		if(e.getEpisodeOfCarePnt() != null) {
			episodeofcare.setPatient( new org.hl7.fhir.r4.model.Reference(e.getEpisodeOfCarePnt()));
		}
		/******************** episodeofcareperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period episodeofcareperiod =  new org.hl7.fhir.r4.model.Period();
		episodeofcare.setPeriod(episodeofcareperiod);

		/******************** EpisodeOfCare_Prd_End ********************************************************************************/
		if(e.getEpisodeOfCarePrdEnd() != null) {
			java.text.SimpleDateFormat EpisodeOfCare_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EpisodeOfCare_Prd_Enddate = EpisodeOfCare_Prd_Endsdf.parse(e.getEpisodeOfCarePrdEnd());
			episodeofcareperiod.setEnd(EpisodeOfCare_Prd_Enddate);
		}
		/******************** EpisodeOfCare_Prd_Strt ********************************************************************************/
		if(e.getEpisodeOfCarePrdStrt() != null) {
			java.text.SimpleDateFormat EpisodeOfCare_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EpisodeOfCare_Prd_Strtdate = EpisodeOfCare_Prd_Strtsdf.parse(e.getEpisodeOfCarePrdStrt());
			episodeofcareperiod.setStart(EpisodeOfCare_Prd_Strtdate);
		}
		/******************** EpisodeOfCare_ReferralRqst ********************************************************************************/
		if(e.getEpisodeOfCareReferralRqst() != null) {
			episodeofcare.addReferralRequest( new org.hl7.fhir.r4.model.Reference(e.getEpisodeOfCareReferralRqst()));
		}
		/******************** episodeofcarestatus ********************************************************************************/
		org.hl7.fhir.r4.model.EpisodeOfCare.EpisodeOfCareStatusEnumFactory episodeofcarestatus =  new org.hl7.fhir.r4.model.EpisodeOfCare.EpisodeOfCareStatusEnumFactory();
		episodeofcare.setStatus(episodeofcarestatus.fromCode(e.getEpisodeOfCareSts()));

		/******************** episodeofcarestatushistory ********************************************************************************/
		org.hl7.fhir.r4.model.EpisodeOfCare.EpisodeOfCareStatusHistoryComponent episodeofcarestatushistory =  new org.hl7.fhir.r4.model.EpisodeOfCare.EpisodeOfCareStatusHistoryComponent();
		episodeofcare.addStatusHistory(episodeofcarestatushistory);

		/******************** episodeofcarestatushistoryperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period episodeofcarestatushistoryperiod =  new org.hl7.fhir.r4.model.Period();
		episodeofcarestatushistory.setPeriod(episodeofcarestatushistoryperiod);

		/******************** EpisodeOfCare_StsHis_Prd_End ********************************************************************************/
		if(e.getEpisodeOfCareStsHisPrdEnd() != null) {
			java.text.SimpleDateFormat EpisodeOfCare_StsHis_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EpisodeOfCare_StsHis_Prd_Enddate = EpisodeOfCare_StsHis_Prd_Endsdf.parse(e.getEpisodeOfCareStsHisPrdEnd());
			episodeofcarestatushistoryperiod.setEnd(EpisodeOfCare_StsHis_Prd_Enddate);
		}
		/******************** EpisodeOfCare_StsHis_Prd_Strt ********************************************************************************/
		if(e.getEpisodeOfCareStsHisPrdStrt() != null) {
			java.text.SimpleDateFormat EpisodeOfCare_StsHis_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EpisodeOfCare_StsHis_Prd_Strtdate = EpisodeOfCare_StsHis_Prd_Strtsdf.parse(e.getEpisodeOfCareStsHisPrdStrt());
			episodeofcarestatushistoryperiod.setStart(EpisodeOfCare_StsHis_Prd_Strtdate);
		}
		/******************** episodeofcarestatushistorystatus ********************************************************************************/
		org.hl7.fhir.r4.model.EpisodeOfCare.EpisodeOfCareStatusEnumFactory episodeofcarestatushistorystatus =  new org.hl7.fhir.r4.model.EpisodeOfCare.EpisodeOfCareStatusEnumFactory();
		episodeofcarestatushistory.setStatus(episodeofcarestatushistorystatus.fromCode(e.getEpisodeOfCareStsHisSts()));

		/******************** EpisodeOfCare_Team ********************************************************************************/
		if(e.getEpisodeOfCareTeam() != null) {
			episodeofcare.addTeam( new org.hl7.fhir.r4.model.Reference(e.getEpisodeOfCareTeam()));
		}
		/******************** episodeofcaretype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept episodeofcaretype =  new org.hl7.fhir.r4.model.CodeableConcept();
		episodeofcare.addType(episodeofcaretype);

		/******************** episodeofcaretypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding episodeofcaretypecoding =  new org.hl7.fhir.r4.model.Coding();
		episodeofcaretype.addCoding(episodeofcaretypecoding);

		/******************** EpisodeOfCare_Typ_Cdg_Cd ********************************************************************************/
		if(e.getEpisodeOfCareTypCdgCd() != null) {
			episodeofcaretypecoding.setCode(e.getEpisodeOfCareTypCdgCd());
		}
		/******************** EpisodeOfCare_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getEpisodeOfCareTypCdgDsply() != null) {
			episodeofcaretypecoding.setDisplay(e.getEpisodeOfCareTypCdgDsply());
		}
		/******************** EpisodeOfCare_Typ_Cdg_Sys ********************************************************************************/
		if(e.getEpisodeOfCareTypCdgSys() != null) {
			episodeofcaretypecoding.setSystem(e.getEpisodeOfCareTypCdgSys());
		}
		/******************** EpisodeOfCare_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getEpisodeOfCareTypCdgUsrSltd() != null) {
			episodeofcaretypecoding.setUserSelected(Boolean.parseBoolean(e.getEpisodeOfCareTypCdgUsrSltd()));
		}
		/******************** EpisodeOfCare_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getEpisodeOfCareTypCdgVrsn() != null) {
			episodeofcaretypecoding.setVersion(e.getEpisodeOfCareTypCdgVrsn());
		}
		/******************** EpisodeOfCare_Typ_Txt ********************************************************************************/
		if(e.getEpisodeOfCareTypTxt() != null) {
			episodeofcaretype.setText(e.getEpisodeOfCareTypTxt());
		}
		return episodeofcare;
	}
}
