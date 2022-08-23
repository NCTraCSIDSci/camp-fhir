package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.EpisodeOfCare;
public class EpisodeOfCareBidirectionalConversion 
{
	public EpisodeOfCare EpisodeOfCares(org.hl7.fhir.r4.model.EpisodeOfCare episodeofcare) throws ParseException
	{
		 main.java.com.campfhir.model.EpisodeOfCare e = new  main.java.com.campfhir.model.EpisodeOfCare();

		/******************** id ********************************************************************************/
		e.setId(episodeofcare.getIdElement().getIdPart());

		/******************** episodeofcaretype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> episodeofcaretypelist = episodeofcare.getType();
		for(int episodeofcaretypei = 0; episodeofcaretypei<episodeofcaretypelist.size();episodeofcaretypei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  episodeofcaretype = episodeofcaretypelist.get(episodeofcaretypei);

		/******************** EpisodeOfCare_Typ_Txt ********************************************************************************/
		if(episodeofcaretypei == 0) {e.addEpisodeOfCareTypTxt("[");}
		if(episodeofcaretype.hasText()) {

			e.addEpisodeOfCareTypTxt(String.valueOf(episodeofcaretype.getText()));
		} else {
			e.addEpisodeOfCareTypTxt("NULL");
		}

		if(episodeofcaretypei == episodeofcaretypelist.size()-1) {e.addEpisodeOfCareTypTxt("]");}


		/******************** episodeofcaretypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> episodeofcaretypecodinglist = episodeofcaretype.getCoding();
		for(int episodeofcaretypecodingi = 0; episodeofcaretypecodingi<episodeofcaretypecodinglist.size();episodeofcaretypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  episodeofcaretypecoding = episodeofcaretypecodinglist.get(episodeofcaretypecodingi);

		/******************** EpisodeOfCare_Typ_Cdg_Dsply ********************************************************************************/
		if(episodeofcaretypecodingi == 0) {e.addEpisodeOfCareTypCdgDsply("[[");}
		if(episodeofcaretypecoding.hasDisplay()) {

			e.addEpisodeOfCareTypCdgDsply(String.valueOf(episodeofcaretypecoding.getDisplay()));
		} else {
			e.addEpisodeOfCareTypCdgDsply("NULL");
		}

		if(episodeofcaretypecodingi == episodeofcaretypecodinglist.size()-1) {e.addEpisodeOfCareTypCdgDsply("]]");}


		/******************** EpisodeOfCare_Typ_Cdg_Vrsn ********************************************************************************/
		if(episodeofcaretypecodingi == 0) {e.addEpisodeOfCareTypCdgVrsn("[[");}
		if(episodeofcaretypecoding.hasVersion()) {

			e.addEpisodeOfCareTypCdgVrsn(String.valueOf(episodeofcaretypecoding.getVersion()));
		} else {
			e.addEpisodeOfCareTypCdgVrsn("NULL");
		}

		if(episodeofcaretypecodingi == episodeofcaretypecodinglist.size()-1) {e.addEpisodeOfCareTypCdgVrsn("]]");}


		/******************** EpisodeOfCare_Typ_Cdg_Cd ********************************************************************************/
		if(episodeofcaretypecodingi == 0) {e.addEpisodeOfCareTypCdgCd("[[");}
		if(episodeofcaretypecoding.hasCode()) {

			e.addEpisodeOfCareTypCdgCd(String.valueOf(episodeofcaretypecoding.getCode()));
		} else {
			e.addEpisodeOfCareTypCdgCd("NULL");
		}

		if(episodeofcaretypecodingi == episodeofcaretypecodinglist.size()-1) {e.addEpisodeOfCareTypCdgCd("]]");}


		/******************** EpisodeOfCare_Typ_Cdg_UsrSltd ********************************************************************************/
		if(episodeofcaretypecodingi == 0) {e.addEpisodeOfCareTypCdgUsrSltd("[[");}
		if(episodeofcaretypecoding.hasUserSelected()) {

			e.addEpisodeOfCareTypCdgUsrSltd(String.valueOf(episodeofcaretypecoding.getUserSelected()));
		} else {
			e.addEpisodeOfCareTypCdgUsrSltd("NULL");
		}

		if(episodeofcaretypecodingi == episodeofcaretypecodinglist.size()-1) {e.addEpisodeOfCareTypCdgUsrSltd("]]");}


		/******************** EpisodeOfCare_Typ_Cdg_Sys ********************************************************************************/
		if(episodeofcaretypecodingi == 0) {e.addEpisodeOfCareTypCdgSys("[[");}
		if(episodeofcaretypecoding.hasSystem()) {

			e.addEpisodeOfCareTypCdgSys(String.valueOf(episodeofcaretypecoding.getSystem()));
		} else {
			e.addEpisodeOfCareTypCdgSys("NULL");
		}

		if(episodeofcaretypecodingi == episodeofcaretypecodinglist.size()-1) {e.addEpisodeOfCareTypCdgSys("]]");}


		 };
		 };
		/******************** episodeofcarestatus ********************************************************************************/
		org.hl7.fhir.r4.model.EpisodeOfCare.EpisodeOfCareStatus episodeofcarestatus = episodeofcare.getStatus();
		if(episodeofcarestatus!=null) {
			e.addEpisodeOfCareSts(episodeofcarestatus.toCode());
		} else {
			e.addEpisodeOfCareSts("NULL");
		}

		/******************** episodeofcareperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period episodeofcareperiod = episodeofcare.getPeriod();

		/******************** EpisodeOfCare_Prd_Strt ********************************************************************************/
		if(episodeofcareperiod.hasStart()) {

			e.addEpisodeOfCarePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(episodeofcareperiod.getStart())+"\"");
		} else {
			e.addEpisodeOfCarePrdStrt("NULL");
		}


		/******************** EpisodeOfCare_Prd_End ********************************************************************************/
		if(episodeofcareperiod.hasEnd()) {

			e.addEpisodeOfCarePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(episodeofcareperiod.getEnd())+"\"");
		} else {
			e.addEpisodeOfCarePrdEnd("NULL");
		}


		/******************** episodeofcareidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> episodeofcareidentifierlist = episodeofcare.getIdentifier();
		for(int episodeofcareidentifieri = 0; episodeofcareidentifieri<episodeofcareidentifierlist.size();episodeofcareidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  episodeofcareidentifier = episodeofcareidentifierlist.get(episodeofcareidentifieri);

		/******************** EpisodeOfCare_Id_Vl ********************************************************************************/
		if(episodeofcareidentifieri == 0) {e.addEpisodeOfCareIdVl("[");}
		if(episodeofcareidentifier.hasValue()) {

			e.addEpisodeOfCareIdVl(String.valueOf(episodeofcareidentifier.getValue()));
		} else {
			e.addEpisodeOfCareIdVl("NULL");
		}

		if(episodeofcareidentifieri == episodeofcareidentifierlist.size()-1) {e.addEpisodeOfCareIdVl("]");}


		/******************** episodeofcareidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept episodeofcareidentifiertype = episodeofcareidentifier.getType();

		/******************** EpisodeOfCare_Id_Typ_Txt ********************************************************************************/
		if(episodeofcareidentifieri == 0) {e.addEpisodeOfCareIdTypTxt("[");}
		if(episodeofcareidentifiertype.hasText()) {

			e.addEpisodeOfCareIdTypTxt(String.valueOf(episodeofcareidentifiertype.getText()));
		} else {
			e.addEpisodeOfCareIdTypTxt("NULL");
		}

		if(episodeofcareidentifieri == episodeofcareidentifierlist.size()-1) {e.addEpisodeOfCareIdTypTxt("]");}


		/******************** episodeofcareidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> episodeofcareidentifiertypecodinglist = episodeofcareidentifiertype.getCoding();
		for(int episodeofcareidentifiertypecodingi = 0; episodeofcareidentifiertypecodingi<episodeofcareidentifiertypecodinglist.size();episodeofcareidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  episodeofcareidentifiertypecoding = episodeofcareidentifiertypecodinglist.get(episodeofcareidentifiertypecodingi);

		/******************** EpisodeOfCare_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(episodeofcareidentifiertypecodingi == 0) {e.addEpisodeOfCareIdTypCdgDsply("[[");}
		if(episodeofcareidentifiertypecoding.hasDisplay()) {

			e.addEpisodeOfCareIdTypCdgDsply(String.valueOf(episodeofcareidentifiertypecoding.getDisplay()));
		} else {
			e.addEpisodeOfCareIdTypCdgDsply("NULL");
		}

		if(episodeofcareidentifiertypecodingi == episodeofcareidentifiertypecodinglist.size()-1) {e.addEpisodeOfCareIdTypCdgDsply("]]");}


		/******************** EpisodeOfCare_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(episodeofcareidentifiertypecodingi == 0) {e.addEpisodeOfCareIdTypCdgVrsn("[[");}
		if(episodeofcareidentifiertypecoding.hasVersion()) {

			e.addEpisodeOfCareIdTypCdgVrsn(String.valueOf(episodeofcareidentifiertypecoding.getVersion()));
		} else {
			e.addEpisodeOfCareIdTypCdgVrsn("NULL");
		}

		if(episodeofcareidentifiertypecodingi == episodeofcareidentifiertypecodinglist.size()-1) {e.addEpisodeOfCareIdTypCdgVrsn("]]");}


		/******************** EpisodeOfCare_Id_Typ_Cdg_Cd ********************************************************************************/
		if(episodeofcareidentifiertypecodingi == 0) {e.addEpisodeOfCareIdTypCdgCd("[[");}
		if(episodeofcareidentifiertypecoding.hasCode()) {

			e.addEpisodeOfCareIdTypCdgCd(String.valueOf(episodeofcareidentifiertypecoding.getCode()));
		} else {
			e.addEpisodeOfCareIdTypCdgCd("NULL");
		}

		if(episodeofcareidentifiertypecodingi == episodeofcareidentifiertypecodinglist.size()-1) {e.addEpisodeOfCareIdTypCdgCd("]]");}


		/******************** EpisodeOfCare_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(episodeofcareidentifiertypecodingi == 0) {e.addEpisodeOfCareIdTypCdgUsrSltd("[[");}
		if(episodeofcareidentifiertypecoding.hasUserSelected()) {

			e.addEpisodeOfCareIdTypCdgUsrSltd(String.valueOf(episodeofcareidentifiertypecoding.getUserSelected()));
		} else {
			e.addEpisodeOfCareIdTypCdgUsrSltd("NULL");
		}

		if(episodeofcareidentifiertypecodingi == episodeofcareidentifiertypecodinglist.size()-1) {e.addEpisodeOfCareIdTypCdgUsrSltd("]]");}


		/******************** EpisodeOfCare_Id_Typ_Cdg_Sys ********************************************************************************/
		if(episodeofcareidentifiertypecodingi == 0) {e.addEpisodeOfCareIdTypCdgSys("[[");}
		if(episodeofcareidentifiertypecoding.hasSystem()) {

			e.addEpisodeOfCareIdTypCdgSys(String.valueOf(episodeofcareidentifiertypecoding.getSystem()));
		} else {
			e.addEpisodeOfCareIdTypCdgSys("NULL");
		}

		if(episodeofcareidentifiertypecodingi == episodeofcareidentifiertypecodinglist.size()-1) {e.addEpisodeOfCareIdTypCdgSys("]]");}


		 };
		/******************** episodeofcareidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period episodeofcareidentifierperiod = episodeofcareidentifier.getPeriod();

		/******************** EpisodeOfCare_Id_Prd_Strt ********************************************************************************/
		if(episodeofcareidentifieri == 0) {e.addEpisodeOfCareIdPrdStrt("[");}
		if(episodeofcareidentifierperiod.hasStart()) {

			e.addEpisodeOfCareIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(episodeofcareidentifierperiod.getStart())+"\"");
		} else {
			e.addEpisodeOfCareIdPrdStrt("NULL");
		}

		if(episodeofcareidentifieri == episodeofcareidentifierlist.size()-1) {e.addEpisodeOfCareIdPrdStrt("]");}


		/******************** EpisodeOfCare_Id_Prd_End ********************************************************************************/
		if(episodeofcareidentifieri == 0) {e.addEpisodeOfCareIdPrdEnd("[");}
		if(episodeofcareidentifierperiod.hasEnd()) {

			e.addEpisodeOfCareIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(episodeofcareidentifierperiod.getEnd())+"\"");
		} else {
			e.addEpisodeOfCareIdPrdEnd("NULL");
		}

		if(episodeofcareidentifieri == episodeofcareidentifierlist.size()-1) {e.addEpisodeOfCareIdPrdEnd("]");}


		/******************** episodeofcareidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse episodeofcareidentifieruse = episodeofcareidentifier.getUse();
		if(episodeofcareidentifieruse!=null) {
		if(episodeofcareidentifieri == 0) {

		e.addEpisodeOfCareIdUse("[");		}
			e.addEpisodeOfCareIdUse(episodeofcareidentifieruse.toCode());
		if(episodeofcareidentifieri == episodeofcareidentifierlist.size()-1) {

		e.addEpisodeOfCareIdUse("]");		}

		} else {
			e.addEpisodeOfCareIdUse("NULL");
		}

		/******************** EpisodeOfCare_Id_Assigner ********************************************************************************/
		if(episodeofcareidentifieri == 0) {e.addEpisodeOfCareIdAssigner("[");}
		if(episodeofcareidentifier.hasAssigner()) {

			if(episodeofcareidentifier.getAssigner().getReference() != null) {
			e.addEpisodeOfCareIdAssigner(episodeofcareidentifier.getAssigner().getReference());
			}
		} else {
			e.addEpisodeOfCareIdAssigner("NULL");
		}

		if(episodeofcareidentifieri == episodeofcareidentifierlist.size()-1) {e.addEpisodeOfCareIdAssigner("]");}


		/******************** EpisodeOfCare_Id_Sys ********************************************************************************/
		if(episodeofcareidentifieri == 0) {e.addEpisodeOfCareIdSys("[");}
		if(episodeofcareidentifier.hasSystem()) {

			e.addEpisodeOfCareIdSys(String.valueOf(episodeofcareidentifier.getSystem()));
		} else {
			e.addEpisodeOfCareIdSys("NULL");
		}

		if(episodeofcareidentifieri == episodeofcareidentifierlist.size()-1) {e.addEpisodeOfCareIdSys("]");}


		 };
		/******************** EpisodeOfCare_CareManager ********************************************************************************/
		if(episodeofcare.hasCareManager()) {

			if(episodeofcare.getCareManager().getReference() != null) {
			e.addEpisodeOfCareCareManager(episodeofcare.getCareManager().getReference());
			}
		} else {
			e.addEpisodeOfCareCareManager("NULL");
		}


		/******************** EpisodeOfCare_ReferralRqst ********************************************************************************/
		if(episodeofcare.hasReferralRequest()) {

			String  array = "[";
			for(int incr=0; incr<episodeofcare.getReferralRequest().size(); incr++) {
				array = array + episodeofcare.getReferralRequest().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addEpisodeOfCareReferralRqst(array);

		} else {
			e.addEpisodeOfCareReferralRqst("NULL");
		}


		/******************** EpisodeOfCare_Team ********************************************************************************/
		if(episodeofcare.hasTeam()) {

			String  array = "[";
			for(int incr=0; incr<episodeofcare.getTeam().size(); incr++) {
				array = array + episodeofcare.getTeam().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addEpisodeOfCareTeam(array);

		} else {
			e.addEpisodeOfCareTeam("NULL");
		}


		/******************** EpisodeOfCare_Pnt ********************************************************************************/
		if(episodeofcare.hasPatient()) {

			if(episodeofcare.getPatient().getReference() != null) {
			e.addEpisodeOfCarePnt(episodeofcare.getPatient().getReference());
			}
		} else {
			e.addEpisodeOfCarePnt("NULL");
		}


		/******************** EpisodeOfCare_ManagingOrgnztn ********************************************************************************/
		if(episodeofcare.hasManagingOrganization()) {

			if(episodeofcare.getManagingOrganization().getReference() != null) {
			e.addEpisodeOfCareManagingOrgnztn(episodeofcare.getManagingOrganization().getReference());
			}
		} else {
			e.addEpisodeOfCareManagingOrgnztn("NULL");
		}


		/******************** episodeofcarestatushistory ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.EpisodeOfCare.EpisodeOfCareStatusHistoryComponent> episodeofcarestatushistorylist = episodeofcare.getStatusHistory();
		for(int episodeofcarestatushistoryi = 0; episodeofcarestatushistoryi<episodeofcarestatushistorylist.size();episodeofcarestatushistoryi++ ) {
		org.hl7.fhir.r4.model.EpisodeOfCare.EpisodeOfCareStatusHistoryComponent  episodeofcarestatushistory = episodeofcarestatushistorylist.get(episodeofcarestatushistoryi);

		/******************** episodeofcarestatushistorystatus ********************************************************************************/
		org.hl7.fhir.r4.model.EpisodeOfCare.EpisodeOfCareStatus episodeofcarestatushistorystatus = episodeofcarestatushistory.getStatus();
		if(episodeofcarestatushistorystatus!=null) {
		if(episodeofcarestatushistoryi == 0) {

		e.addEpisodeOfCareStsHisSts("[");		}
			e.addEpisodeOfCareStsHisSts(episodeofcarestatushistorystatus.toCode());
		if(episodeofcarestatushistoryi == episodeofcarestatushistorylist.size()-1) {

		e.addEpisodeOfCareStsHisSts("]");		}

		} else {
			e.addEpisodeOfCareStsHisSts("NULL");
		}

		/******************** episodeofcarestatushistoryperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period episodeofcarestatushistoryperiod = episodeofcarestatushistory.getPeriod();

		/******************** EpisodeOfCare_StsHis_Prd_Strt ********************************************************************************/
		if(episodeofcarestatushistoryi == 0) {e.addEpisodeOfCareStsHisPrdStrt("[");}
		if(episodeofcarestatushistoryperiod.hasStart()) {

			e.addEpisodeOfCareStsHisPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(episodeofcarestatushistoryperiod.getStart())+"\"");
		} else {
			e.addEpisodeOfCareStsHisPrdStrt("NULL");
		}

		if(episodeofcarestatushistoryi == episodeofcarestatushistorylist.size()-1) {e.addEpisodeOfCareStsHisPrdStrt("]");}


		/******************** EpisodeOfCare_StsHis_Prd_End ********************************************************************************/
		if(episodeofcarestatushistoryi == 0) {e.addEpisodeOfCareStsHisPrdEnd("[");}
		if(episodeofcarestatushistoryperiod.hasEnd()) {

			e.addEpisodeOfCareStsHisPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(episodeofcarestatushistoryperiod.getEnd())+"\"");
		} else {
			e.addEpisodeOfCareStsHisPrdEnd("NULL");
		}

		if(episodeofcarestatushistoryi == episodeofcarestatushistorylist.size()-1) {e.addEpisodeOfCareStsHisPrdEnd("]");}


		 };
		/******************** EpisodeOfCare_Account ********************************************************************************/
		if(episodeofcare.hasAccount()) {

			String  array = "[";
			for(int incr=0; incr<episodeofcare.getAccount().size(); incr++) {
				array = array + episodeofcare.getAccount().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			e.addEpisodeOfCareAccount(array);

		} else {
			e.addEpisodeOfCareAccount("NULL");
		}


		/******************** episodeofcarediagnosis ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.EpisodeOfCare.DiagnosisComponent> episodeofcarediagnosislist = episodeofcare.getDiagnosis();
		for(int episodeofcarediagnosisi = 0; episodeofcarediagnosisi<episodeofcarediagnosislist.size();episodeofcarediagnosisi++ ) {
		org.hl7.fhir.r4.model.EpisodeOfCare.DiagnosisComponent  episodeofcarediagnosis = episodeofcarediagnosislist.get(episodeofcarediagnosisi);

		/******************** episodeofcarediagnosisrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept episodeofcarediagnosisrole = episodeofcarediagnosis.getRole();

		/******************** EpisodeOfCare_Dgnsis_Role_Txt ********************************************************************************/
		if(episodeofcarediagnosisi == 0) {e.addEpisodeOfCareDgnsisRoleTxt("[");}
		if(episodeofcarediagnosisrole.hasText()) {

			e.addEpisodeOfCareDgnsisRoleTxt(String.valueOf(episodeofcarediagnosisrole.getText()));
		} else {
			e.addEpisodeOfCareDgnsisRoleTxt("NULL");
		}

		if(episodeofcarediagnosisi == episodeofcarediagnosislist.size()-1) {e.addEpisodeOfCareDgnsisRoleTxt("]");}


		/******************** episodeofcarediagnosisrolecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> episodeofcarediagnosisrolecodinglist = episodeofcarediagnosisrole.getCoding();
		for(int episodeofcarediagnosisrolecodingi = 0; episodeofcarediagnosisrolecodingi<episodeofcarediagnosisrolecodinglist.size();episodeofcarediagnosisrolecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  episodeofcarediagnosisrolecoding = episodeofcarediagnosisrolecodinglist.get(episodeofcarediagnosisrolecodingi);

		/******************** EpisodeOfCare_Dgnsis_Role_Cdg_Dsply ********************************************************************************/
		if(episodeofcarediagnosisrolecodingi == 0) {e.addEpisodeOfCareDgnsisRoleCdgDsply("[[");}
		if(episodeofcarediagnosisrolecoding.hasDisplay()) {

			e.addEpisodeOfCareDgnsisRoleCdgDsply(String.valueOf(episodeofcarediagnosisrolecoding.getDisplay()));
		} else {
			e.addEpisodeOfCareDgnsisRoleCdgDsply("NULL");
		}

		if(episodeofcarediagnosisrolecodingi == episodeofcarediagnosisrolecodinglist.size()-1) {e.addEpisodeOfCareDgnsisRoleCdgDsply("]]");}


		/******************** EpisodeOfCare_Dgnsis_Role_Cdg_Vrsn ********************************************************************************/
		if(episodeofcarediagnosisrolecodingi == 0) {e.addEpisodeOfCareDgnsisRoleCdgVrsn("[[");}
		if(episodeofcarediagnosisrolecoding.hasVersion()) {

			e.addEpisodeOfCareDgnsisRoleCdgVrsn(String.valueOf(episodeofcarediagnosisrolecoding.getVersion()));
		} else {
			e.addEpisodeOfCareDgnsisRoleCdgVrsn("NULL");
		}

		if(episodeofcarediagnosisrolecodingi == episodeofcarediagnosisrolecodinglist.size()-1) {e.addEpisodeOfCareDgnsisRoleCdgVrsn("]]");}


		/******************** EpisodeOfCare_Dgnsis_Role_Cdg_Cd ********************************************************************************/
		if(episodeofcarediagnosisrolecodingi == 0) {e.addEpisodeOfCareDgnsisRoleCdgCd("[[");}
		if(episodeofcarediagnosisrolecoding.hasCode()) {

			e.addEpisodeOfCareDgnsisRoleCdgCd(String.valueOf(episodeofcarediagnosisrolecoding.getCode()));
		} else {
			e.addEpisodeOfCareDgnsisRoleCdgCd("NULL");
		}

		if(episodeofcarediagnosisrolecodingi == episodeofcarediagnosisrolecodinglist.size()-1) {e.addEpisodeOfCareDgnsisRoleCdgCd("]]");}


		/******************** EpisodeOfCare_Dgnsis_Role_Cdg_UsrSltd ********************************************************************************/
		if(episodeofcarediagnosisrolecodingi == 0) {e.addEpisodeOfCareDgnsisRoleCdgUsrSltd("[[");}
		if(episodeofcarediagnosisrolecoding.hasUserSelected()) {

			e.addEpisodeOfCareDgnsisRoleCdgUsrSltd(String.valueOf(episodeofcarediagnosisrolecoding.getUserSelected()));
		} else {
			e.addEpisodeOfCareDgnsisRoleCdgUsrSltd("NULL");
		}

		if(episodeofcarediagnosisrolecodingi == episodeofcarediagnosisrolecodinglist.size()-1) {e.addEpisodeOfCareDgnsisRoleCdgUsrSltd("]]");}


		/******************** EpisodeOfCare_Dgnsis_Role_Cdg_Sys ********************************************************************************/
		if(episodeofcarediagnosisrolecodingi == 0) {e.addEpisodeOfCareDgnsisRoleCdgSys("[[");}
		if(episodeofcarediagnosisrolecoding.hasSystem()) {

			e.addEpisodeOfCareDgnsisRoleCdgSys(String.valueOf(episodeofcarediagnosisrolecoding.getSystem()));
		} else {
			e.addEpisodeOfCareDgnsisRoleCdgSys("NULL");
		}

		if(episodeofcarediagnosisrolecodingi == episodeofcarediagnosisrolecodinglist.size()-1) {e.addEpisodeOfCareDgnsisRoleCdgSys("]]");}


		 };
		/******************** EpisodeOfCare_Dgnsis_Cndtn ********************************************************************************/
		if(episodeofcarediagnosisi == 0) {e.addEpisodeOfCareDgnsisCndtn("[");}
		if(episodeofcarediagnosis.hasCondition()) {

			if(episodeofcarediagnosis.getCondition().getReference() != null) {
			e.addEpisodeOfCareDgnsisCndtn(episodeofcarediagnosis.getCondition().getReference());
			}
		} else {
			e.addEpisodeOfCareDgnsisCndtn("NULL");
		}

		if(episodeofcarediagnosisi == episodeofcarediagnosislist.size()-1) {e.addEpisodeOfCareDgnsisCndtn("]");}


		/******************** EpisodeOfCare_Dgnsis_Rnk ********************************************************************************/
		if(episodeofcarediagnosisi == 0) {e.addEpisodeOfCareDgnsisRnk("[");}
		if(episodeofcarediagnosis.hasRank()) {

			e.addEpisodeOfCareDgnsisRnk(String.valueOf(episodeofcarediagnosis.getRank()));
		} else {
			e.addEpisodeOfCareDgnsisRnk("NULL");
		}

		if(episodeofcarediagnosisi == episodeofcarediagnosislist.size()-1) {e.addEpisodeOfCareDgnsisRnk("]");}


		 };
		return e;
	}
}
