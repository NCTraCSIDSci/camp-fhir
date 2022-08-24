package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ResearchSubject;
public class ResearchSubjectBidirectionalConversion 
{
	public ResearchSubject ResearchSubjects(org.hl7.fhir.r4.model.ResearchSubject researchsubject) throws ParseException
	{
		 main.java.com.campfhir.model.ResearchSubject r = new  main.java.com.campfhir.model.ResearchSubject();

		/******************** id ********************************************************************************/
		r.setId(researchsubject.getIdElement().getIdPart());

		/******************** researchsubjectstatus ********************************************************************************/
		org.hl7.fhir.r4.model.ResearchSubject.ResearchSubjectStatus researchsubjectstatus = researchsubject.getStatus();
		if(researchsubjectstatus!=null) {
			r.addRsrchSbjctSts(researchsubjectstatus.toCode());
		} else {
			r.addRsrchSbjctSts("NULL");
		}

		/******************** researchsubjectperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchsubjectperiod = researchsubject.getPeriod();

		/******************** RsrchSbjct_Prd_Strt ********************************************************************************/
		if(researchsubjectperiod.hasStart()) {

			r.addRsrchSbjctPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchsubjectperiod.getStart())+"\"");
		} else {
			r.addRsrchSbjctPrdStrt("NULL");
		}


		/******************** RsrchSbjct_Prd_End ********************************************************************************/
		if(researchsubjectperiod.hasEnd()) {

			r.addRsrchSbjctPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchsubjectperiod.getEnd())+"\"");
		} else {
			r.addRsrchSbjctPrdEnd("NULL");
		}


		/******************** researchsubjectidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> researchsubjectidentifierlist = researchsubject.getIdentifier();
		for(int researchsubjectidentifieri = 0; researchsubjectidentifieri<researchsubjectidentifierlist.size();researchsubjectidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  researchsubjectidentifier = researchsubjectidentifierlist.get(researchsubjectidentifieri);

		/******************** RsrchSbjct_Id_Vl ********************************************************************************/
		if(researchsubjectidentifieri == 0) {r.addRsrchSbjctIdVl("[");}
		if(researchsubjectidentifier.hasValue()) {

			r.addRsrchSbjctIdVl(String.valueOf(researchsubjectidentifier.getValue()));
		} else {
			r.addRsrchSbjctIdVl("NULL");
		}

		if(researchsubjectidentifieri == researchsubjectidentifierlist.size()-1) {r.addRsrchSbjctIdVl("]");}


		/******************** researchsubjectidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchsubjectidentifiertype = researchsubjectidentifier.getType();

		/******************** RsrchSbjct_Id_Typ_Txt ********************************************************************************/
		if(researchsubjectidentifieri == 0) {r.addRsrchSbjctIdTypTxt("[");}
		if(researchsubjectidentifiertype.hasText()) {

			r.addRsrchSbjctIdTypTxt(String.valueOf(researchsubjectidentifiertype.getText()));
		} else {
			r.addRsrchSbjctIdTypTxt("NULL");
		}

		if(researchsubjectidentifieri == researchsubjectidentifierlist.size()-1) {r.addRsrchSbjctIdTypTxt("]");}


		/******************** researchsubjectidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> researchsubjectidentifiertypecodinglist = researchsubjectidentifiertype.getCoding();
		for(int researchsubjectidentifiertypecodingi = 0; researchsubjectidentifiertypecodingi<researchsubjectidentifiertypecodinglist.size();researchsubjectidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  researchsubjectidentifiertypecoding = researchsubjectidentifiertypecodinglist.get(researchsubjectidentifiertypecodingi);

		/******************** RsrchSbjct_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(researchsubjectidentifiertypecodingi == 0) {r.addRsrchSbjctIdTypCdgDsply("[[");}
		if(researchsubjectidentifiertypecoding.hasDisplay()) {

			r.addRsrchSbjctIdTypCdgDsply(String.valueOf(researchsubjectidentifiertypecoding.getDisplay()));
		} else {
			r.addRsrchSbjctIdTypCdgDsply("NULL");
		}

		if(researchsubjectidentifiertypecodingi == researchsubjectidentifiertypecodinglist.size()-1) {r.addRsrchSbjctIdTypCdgDsply("]]");}


		/******************** RsrchSbjct_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(researchsubjectidentifiertypecodingi == 0) {r.addRsrchSbjctIdTypCdgVrsn("[[");}
		if(researchsubjectidentifiertypecoding.hasVersion()) {

			r.addRsrchSbjctIdTypCdgVrsn(String.valueOf(researchsubjectidentifiertypecoding.getVersion()));
		} else {
			r.addRsrchSbjctIdTypCdgVrsn("NULL");
		}

		if(researchsubjectidentifiertypecodingi == researchsubjectidentifiertypecodinglist.size()-1) {r.addRsrchSbjctIdTypCdgVrsn("]]");}


		/******************** RsrchSbjct_Id_Typ_Cdg_Cd ********************************************************************************/
		if(researchsubjectidentifiertypecodingi == 0) {r.addRsrchSbjctIdTypCdgCd("[[");}
		if(researchsubjectidentifiertypecoding.hasCode()) {

			r.addRsrchSbjctIdTypCdgCd(String.valueOf(researchsubjectidentifiertypecoding.getCode()));
		} else {
			r.addRsrchSbjctIdTypCdgCd("NULL");
		}

		if(researchsubjectidentifiertypecodingi == researchsubjectidentifiertypecodinglist.size()-1) {r.addRsrchSbjctIdTypCdgCd("]]");}


		/******************** RsrchSbjct_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(researchsubjectidentifiertypecodingi == 0) {r.addRsrchSbjctIdTypCdgUsrSltd("[[");}
		if(researchsubjectidentifiertypecoding.hasUserSelected()) {

			r.addRsrchSbjctIdTypCdgUsrSltd(String.valueOf(researchsubjectidentifiertypecoding.getUserSelected()));
		} else {
			r.addRsrchSbjctIdTypCdgUsrSltd("NULL");
		}

		if(researchsubjectidentifiertypecodingi == researchsubjectidentifiertypecodinglist.size()-1) {r.addRsrchSbjctIdTypCdgUsrSltd("]]");}


		/******************** RsrchSbjct_Id_Typ_Cdg_Sys ********************************************************************************/
		if(researchsubjectidentifiertypecodingi == 0) {r.addRsrchSbjctIdTypCdgSys("[[");}
		if(researchsubjectidentifiertypecoding.hasSystem()) {

			r.addRsrchSbjctIdTypCdgSys(String.valueOf(researchsubjectidentifiertypecoding.getSystem()));
		} else {
			r.addRsrchSbjctIdTypCdgSys("NULL");
		}

		if(researchsubjectidentifiertypecodingi == researchsubjectidentifiertypecodinglist.size()-1) {r.addRsrchSbjctIdTypCdgSys("]]");}


		 };
		/******************** researchsubjectidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchsubjectidentifierperiod = researchsubjectidentifier.getPeriod();

		/******************** RsrchSbjct_Id_Prd_Strt ********************************************************************************/
		if(researchsubjectidentifieri == 0) {r.addRsrchSbjctIdPrdStrt("[");}
		if(researchsubjectidentifierperiod.hasStart()) {

			r.addRsrchSbjctIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchsubjectidentifierperiod.getStart())+"\"");
		} else {
			r.addRsrchSbjctIdPrdStrt("NULL");
		}

		if(researchsubjectidentifieri == researchsubjectidentifierlist.size()-1) {r.addRsrchSbjctIdPrdStrt("]");}


		/******************** RsrchSbjct_Id_Prd_End ********************************************************************************/
		if(researchsubjectidentifieri == 0) {r.addRsrchSbjctIdPrdEnd("[");}
		if(researchsubjectidentifierperiod.hasEnd()) {

			r.addRsrchSbjctIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(researchsubjectidentifierperiod.getEnd())+"\"");
		} else {
			r.addRsrchSbjctIdPrdEnd("NULL");
		}

		if(researchsubjectidentifieri == researchsubjectidentifierlist.size()-1) {r.addRsrchSbjctIdPrdEnd("]");}


		/******************** researchsubjectidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse researchsubjectidentifieruse = researchsubjectidentifier.getUse();
		if(researchsubjectidentifieruse!=null) {
		if(researchsubjectidentifieri == 0) {

		r.addRsrchSbjctIdUse("[");		}
			r.addRsrchSbjctIdUse(researchsubjectidentifieruse.toCode());
		if(researchsubjectidentifieri == researchsubjectidentifierlist.size()-1) {

		r.addRsrchSbjctIdUse("]");		}

		} else {
			r.addRsrchSbjctIdUse("NULL");
		}

		/******************** RsrchSbjct_Id_Assigner ********************************************************************************/
		if(researchsubjectidentifieri == 0) {r.addRsrchSbjctIdAssigner("[");}
		if(researchsubjectidentifier.hasAssigner()) {

			if(researchsubjectidentifier.getAssigner().getReference() != null) {
			r.addRsrchSbjctIdAssigner(researchsubjectidentifier.getAssigner().getReference());
			}
		} else {
			r.addRsrchSbjctIdAssigner("NULL");
		}

		if(researchsubjectidentifieri == researchsubjectidentifierlist.size()-1) {r.addRsrchSbjctIdAssigner("]");}


		/******************** RsrchSbjct_Id_Sys ********************************************************************************/
		if(researchsubjectidentifieri == 0) {r.addRsrchSbjctIdSys("[");}
		if(researchsubjectidentifier.hasSystem()) {

			r.addRsrchSbjctIdSys(String.valueOf(researchsubjectidentifier.getSystem()));
		} else {
			r.addRsrchSbjctIdSys("NULL");
		}

		if(researchsubjectidentifieri == researchsubjectidentifierlist.size()-1) {r.addRsrchSbjctIdSys("]");}


		 };
		/******************** RsrchSbjct_Cnsnt ********************************************************************************/
		if(researchsubject.hasConsent()) {

			if(researchsubject.getConsent().getReference() != null) {
			r.addRsrchSbjctCnsnt(researchsubject.getConsent().getReference());
			}
		} else {
			r.addRsrchSbjctCnsnt("NULL");
		}


		/******************** RsrchSbjct_ActualArm ********************************************************************************/
		if(researchsubject.hasActualArm()) {

			r.addRsrchSbjctActualArm(String.valueOf(researchsubject.getActualArm()));
		} else {
			r.addRsrchSbjctActualArm("NULL");
		}


		/******************** RsrchSbjct_Individual ********************************************************************************/
		if(researchsubject.hasIndividual()) {

			if(researchsubject.getIndividual().getReference() != null) {
			r.addRsrchSbjctIndividual(researchsubject.getIndividual().getReference());
			}
		} else {
			r.addRsrchSbjctIndividual("NULL");
		}


		/******************** RsrchSbjct_AssignedArm ********************************************************************************/
		if(researchsubject.hasAssignedArm()) {

			r.addRsrchSbjctAssignedArm(String.valueOf(researchsubject.getAssignedArm()));
		} else {
			r.addRsrchSbjctAssignedArm("NULL");
		}


		/******************** RsrchSbjct_Stdy ********************************************************************************/
		if(researchsubject.hasStudy()) {

			if(researchsubject.getStudy().getReference() != null) {
			r.addRsrchSbjctStdy(researchsubject.getStudy().getReference());
			}
		} else {
			r.addRsrchSbjctStdy("NULL");
		}


		return r;
	}
}
