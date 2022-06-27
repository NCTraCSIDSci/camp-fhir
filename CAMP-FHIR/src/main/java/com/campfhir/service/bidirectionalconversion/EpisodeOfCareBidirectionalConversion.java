package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.EpisodeOfCare;
public class EpisodeOfCareBidirectionalConversion 
{
	public EpisodeOfCare EpisodeOfCares(org.hl7.fhir.r4.model.EpisodeOfCare episodeofcare) throws ParseException
	{
		 main.java.com.campfhir.model.EpisodeOfCare e = new  main.java.com.campfhir.model.EpisodeOfCare();

		/******************** id ********************************************************************************/
		episodeofcare.setId(e.getId());

		/******************** episodeofcaretype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept episodeofcaretype = episodeofcare.getTypeFirstRep();

		/******************** EpisodeOfCare_Typ_Txt ********************************************************************************/
		if(episodeofcaretype.hasText()) {
			e.setEpisodeOfCareTypTxt(String.valueOf(episodeofcaretype.getText()));
		}
		/******************** episodeofcaretypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding episodeofcaretypecoding = episodeofcaretype.getCodingFirstRep();

		/******************** EpisodeOfCare_Typ_Cdg_Vrsn ********************************************************************************/
		if(episodeofcaretypecoding.hasVersion()) {
			e.setEpisodeOfCareTypCdgVrsn(String.valueOf(episodeofcaretypecoding.getVersion()));
		}
		/******************** EpisodeOfCare_Typ_Cdg_Dsply ********************************************************************************/
		if(episodeofcaretypecoding.hasDisplay()) {
			e.setEpisodeOfCareTypCdgDsply(String.valueOf(episodeofcaretypecoding.getDisplay()));
		}
		/******************** EpisodeOfCare_Typ_Cdg_Cd ********************************************************************************/
		if(episodeofcaretypecoding.hasCode()) {
			e.setEpisodeOfCareTypCdgCd(String.valueOf(episodeofcaretypecoding.getCode()));
		}
		/******************** EpisodeOfCare_Typ_Cdg_UsrSltd ********************************************************************************/
		if(episodeofcaretypecoding.hasUserSelected()) {
			e.setEpisodeOfCareTypCdgUsrSltd(String.valueOf(episodeofcaretypecoding.getUserSelected()));
		}
		/******************** EpisodeOfCare_Typ_Cdg_Sys ********************************************************************************/
		if(episodeofcaretypecoding.hasSystem()) {
			e.setEpisodeOfCareTypCdgSys(String.valueOf(episodeofcaretypecoding.getSystem()));
		}
		/******************** EpisodeOfCare_Account ********************************************************************************/
		if(episodeofcare.hasAccount()) {
			e.setEpisodeOfCareAccount(String.valueOf(episodeofcare.getAccountFirstRep()));
		}
		/******************** EpisodeOfCare_Pnt ********************************************************************************/
		if(episodeofcare.hasPatient()) {
			e.setEpisodeOfCarePnt(String.valueOf(episodeofcare.getPatient()));
		}
		/******************** episodeofcarestatus ********************************************************************************/
		org.hl7.fhir.r4.model.EpisodeOfCare.EpisodeOfCareStatus episodeofcarestatus = episodeofcare.getStatus();
		e.setEpisodeOfCareSts(episodeofcarestatus.toCode());

		/******************** episodeofcareperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period episodeofcareperiod = episodeofcare.getPeriod();

		/******************** EpisodeOfCare_Prd_Strt ********************************************************************************/
		if(episodeofcareperiod.hasStart()) {
			e.setEpisodeOfCarePrdStrt(String.valueOf(episodeofcareperiod.getStart()));
		}
		/******************** EpisodeOfCare_Prd_End ********************************************************************************/
		if(episodeofcareperiod.hasEnd()) {
			e.setEpisodeOfCarePrdEnd(String.valueOf(episodeofcareperiod.getEnd()));
		}
		/******************** episodeofcarestatushistory ********************************************************************************/
		org.hl7.fhir.r4.model.EpisodeOfCare.EpisodeOfCareStatusHistoryComponent episodeofcarestatushistory = episodeofcare.getStatusHistoryFirstRep();

		/******************** episodeofcarestatushistorystatus ********************************************************************************/
		org.hl7.fhir.r4.model.EpisodeOfCare.EpisodeOfCareStatus episodeofcarestatushistorystatus = episodeofcarestatushistory.getStatus();
		e.setEpisodeOfCareStsHisSts(episodeofcarestatushistorystatus.toCode());

		/******************** episodeofcarestatushistoryperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period episodeofcarestatushistoryperiod = episodeofcarestatushistory.getPeriod();

		/******************** EpisodeOfCare_StsHis_Prd_Strt ********************************************************************************/
		if(episodeofcarestatushistoryperiod.hasStart()) {
			e.setEpisodeOfCareStsHisPrdStrt(String.valueOf(episodeofcarestatushistoryperiod.getStart()));
		}
		/******************** EpisodeOfCare_StsHis_Prd_End ********************************************************************************/
		if(episodeofcarestatushistoryperiod.hasEnd()) {
			e.setEpisodeOfCareStsHisPrdEnd(String.valueOf(episodeofcarestatushistoryperiod.getEnd()));
		}
		/******************** episodeofcarediagnosis ********************************************************************************/
		org.hl7.fhir.r4.model.EpisodeOfCare.DiagnosisComponent episodeofcarediagnosis = episodeofcare.getDiagnosisFirstRep();

		/******************** EpisodeOfCare_Dgnsis_Cndtn ********************************************************************************/
		if(episodeofcarediagnosis.hasCondition()) {
			e.setEpisodeOfCareDgnsisCndtn(String.valueOf(episodeofcarediagnosis.getCondition()));
		}
		/******************** episodeofcarediagnosisrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept episodeofcarediagnosisrole = episodeofcarediagnosis.getRole();

		/******************** EpisodeOfCare_Dgnsis_Role_Txt ********************************************************************************/
		if(episodeofcarediagnosisrole.hasText()) {
			e.setEpisodeOfCareDgnsisRoleTxt(String.valueOf(episodeofcarediagnosisrole.getText()));
		}
		/******************** episodeofcarediagnosisrolecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding episodeofcarediagnosisrolecoding = episodeofcarediagnosisrole.getCodingFirstRep();

		/******************** EpisodeOfCare_Dgnsis_Role_Cdg_Vrsn ********************************************************************************/
		if(episodeofcarediagnosisrolecoding.hasVersion()) {
			e.setEpisodeOfCareDgnsisRoleCdgVrsn(String.valueOf(episodeofcarediagnosisrolecoding.getVersion()));
		}
		/******************** EpisodeOfCare_Dgnsis_Role_Cdg_Dsply ********************************************************************************/
		if(episodeofcarediagnosisrolecoding.hasDisplay()) {
			e.setEpisodeOfCareDgnsisRoleCdgDsply(String.valueOf(episodeofcarediagnosisrolecoding.getDisplay()));
		}
		/******************** EpisodeOfCare_Dgnsis_Role_Cdg_Cd ********************************************************************************/
		if(episodeofcarediagnosisrolecoding.hasCode()) {
			e.setEpisodeOfCareDgnsisRoleCdgCd(String.valueOf(episodeofcarediagnosisrolecoding.getCode()));
		}
		/******************** EpisodeOfCare_Dgnsis_Role_Cdg_UsrSltd ********************************************************************************/
		if(episodeofcarediagnosisrolecoding.hasUserSelected()) {
			e.setEpisodeOfCareDgnsisRoleCdgUsrSltd(String.valueOf(episodeofcarediagnosisrolecoding.getUserSelected()));
		}
		/******************** EpisodeOfCare_Dgnsis_Role_Cdg_Sys ********************************************************************************/
		if(episodeofcarediagnosisrolecoding.hasSystem()) {
			e.setEpisodeOfCareDgnsisRoleCdgSys(String.valueOf(episodeofcarediagnosisrolecoding.getSystem()));
		}
		/******************** EpisodeOfCare_Dgnsis_Rnk ********************************************************************************/
		if(episodeofcarediagnosis.hasRank()) {
			e.setEpisodeOfCareDgnsisRnk(String.valueOf(episodeofcarediagnosis.getRank()));
		}
		/******************** EpisodeOfCare_ReferralRqst ********************************************************************************/
		if(episodeofcare.hasReferralRequest()) {
			e.setEpisodeOfCareReferralRqst(String.valueOf(episodeofcare.getReferralRequestFirstRep()));
		}
		/******************** episodeofcareidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier episodeofcareidentifier = episodeofcare.getIdentifierFirstRep();

		/******************** EpisodeOfCare_Id_Vl ********************************************************************************/
		if(episodeofcareidentifier.hasValue()) {
			e.setEpisodeOfCareIdVl(String.valueOf(episodeofcareidentifier.getValue()));
		}
		/******************** episodeofcareidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept episodeofcareidentifiertype = episodeofcareidentifier.getType();

		/******************** EpisodeOfCare_Id_Typ_Txt ********************************************************************************/
		if(episodeofcareidentifiertype.hasText()) {
			e.setEpisodeOfCareIdTypTxt(String.valueOf(episodeofcareidentifiertype.getText()));
		}
		/******************** episodeofcareidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding episodeofcareidentifiertypecoding = episodeofcareidentifiertype.getCodingFirstRep();

		/******************** EpisodeOfCare_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(episodeofcareidentifiertypecoding.hasVersion()) {
			e.setEpisodeOfCareIdTypCdgVrsn(String.valueOf(episodeofcareidentifiertypecoding.getVersion()));
		}
		/******************** EpisodeOfCare_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(episodeofcareidentifiertypecoding.hasDisplay()) {
			e.setEpisodeOfCareIdTypCdgDsply(String.valueOf(episodeofcareidentifiertypecoding.getDisplay()));
		}
		/******************** EpisodeOfCare_Id_Typ_Cdg_Cd ********************************************************************************/
		if(episodeofcareidentifiertypecoding.hasCode()) {
			e.setEpisodeOfCareIdTypCdgCd(String.valueOf(episodeofcareidentifiertypecoding.getCode()));
		}
		/******************** EpisodeOfCare_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(episodeofcareidentifiertypecoding.hasUserSelected()) {
			e.setEpisodeOfCareIdTypCdgUsrSltd(String.valueOf(episodeofcareidentifiertypecoding.getUserSelected()));
		}
		/******************** EpisodeOfCare_Id_Typ_Cdg_Sys ********************************************************************************/
		if(episodeofcareidentifiertypecoding.hasSystem()) {
			e.setEpisodeOfCareIdTypCdgSys(String.valueOf(episodeofcareidentifiertypecoding.getSystem()));
		}
		/******************** episodeofcareidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period episodeofcareidentifierperiod = episodeofcareidentifier.getPeriod();

		/******************** EpisodeOfCare_Id_Prd_Strt ********************************************************************************/
		if(episodeofcareidentifierperiod.hasStart()) {
			e.setEpisodeOfCareIdPrdStrt(String.valueOf(episodeofcareidentifierperiod.getStart()));
		}
		/******************** EpisodeOfCare_Id_Prd_End ********************************************************************************/
		if(episodeofcareidentifierperiod.hasEnd()) {
			e.setEpisodeOfCareIdPrdEnd(String.valueOf(episodeofcareidentifierperiod.getEnd()));
		}
		/******************** EpisodeOfCare_Id_Assigner ********************************************************************************/
		if(episodeofcareidentifier.hasAssigner()) {
			e.setEpisodeOfCareIdAssigner(String.valueOf(episodeofcareidentifier.getAssigner()));
		}
		/******************** EpisodeOfCare_Id_Sys ********************************************************************************/
		if(episodeofcareidentifier.hasSystem()) {
			e.setEpisodeOfCareIdSys(String.valueOf(episodeofcareidentifier.getSystem()));
		}
		/******************** episodeofcareidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse episodeofcareidentifieruse = episodeofcareidentifier.getUse();
		e.setEpisodeOfCareIdUse(episodeofcareidentifieruse.toCode());

		/******************** EpisodeOfCare_ManagingOrgnztn ********************************************************************************/
		if(episodeofcare.hasManagingOrganization()) {
			e.setEpisodeOfCareManagingOrgnztn(String.valueOf(episodeofcare.getManagingOrganization()));
		}
		/******************** EpisodeOfCare_CareManager ********************************************************************************/
		if(episodeofcare.hasCareManager()) {
			e.setEpisodeOfCareCareManager(String.valueOf(episodeofcare.getCareManager()));
		}
		/******************** EpisodeOfCare_Team ********************************************************************************/
		if(episodeofcare.hasTeam()) {
			e.setEpisodeOfCareTeam(String.valueOf(episodeofcare.getTeamFirstRep()));
		}
		return e;
	}
}
