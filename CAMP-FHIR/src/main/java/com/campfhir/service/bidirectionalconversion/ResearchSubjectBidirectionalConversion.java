package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ResearchSubject;
public class ResearchSubjectBidirectionalConversion 
{
	public ResearchSubject ResearchSubjects(org.hl7.fhir.r4.model.ResearchSubject researchsubject) throws ParseException
	{
		 main.java.com.campfhir.model.ResearchSubject r = new  main.java.com.campfhir.model.ResearchSubject();

		/******************** id ********************************************************************************/
		researchsubject.setId(r.getId());

		/******************** researchsubjectstatus ********************************************************************************/
		org.hl7.fhir.r4.model.ResearchSubject.ResearchSubjectStatus researchsubjectstatus = researchsubject.getStatus();
		r.setRsrchSbjctSts(researchsubjectstatus.toCode());

		/******************** researchsubjectperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchsubjectperiod = researchsubject.getPeriod();

		/******************** RsrchSbjct_Prd_Strt ********************************************************************************/
		if(researchsubjectperiod.hasStart()) {
			r.setRsrchSbjctPrdStrt(String.valueOf(researchsubjectperiod.getStart()));
		}
		/******************** RsrchSbjct_Prd_End ********************************************************************************/
		if(researchsubjectperiod.hasEnd()) {
			r.setRsrchSbjctPrdEnd(String.valueOf(researchsubjectperiod.getEnd()));
		}
		/******************** RsrchSbjct_AssignedArm ********************************************************************************/
		if(researchsubject.hasAssignedArm()) {
			r.setRsrchSbjctAssignedArm(String.valueOf(researchsubject.getAssignedArm()));
		}
		/******************** RsrchSbjct_Stdy ********************************************************************************/
		if(researchsubject.hasStudy()) {
			r.setRsrchSbjctStdy(String.valueOf(researchsubject.getStudy()));
		}
		/******************** RsrchSbjct_Cnsnt ********************************************************************************/
		if(researchsubject.hasConsent()) {
			r.setRsrchSbjctCnsnt(String.valueOf(researchsubject.getConsent()));
		}
		/******************** RsrchSbjct_Individual ********************************************************************************/
		if(researchsubject.hasIndividual()) {
			r.setRsrchSbjctIndividual(String.valueOf(researchsubject.getIndividual()));
		}
		/******************** RsrchSbjct_ActualArm ********************************************************************************/
		if(researchsubject.hasActualArm()) {
			r.setRsrchSbjctActualArm(String.valueOf(researchsubject.getActualArm()));
		}
		/******************** researchsubjectidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier researchsubjectidentifier = researchsubject.getIdentifierFirstRep();

		/******************** RsrchSbjct_Id_Vl ********************************************************************************/
		if(researchsubjectidentifier.hasValue()) {
			r.setRsrchSbjctIdVl(String.valueOf(researchsubjectidentifier.getValue()));
		}
		/******************** researchsubjectidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchsubjectidentifiertype = researchsubjectidentifier.getType();

		/******************** RsrchSbjct_Id_Typ_Txt ********************************************************************************/
		if(researchsubjectidentifiertype.hasText()) {
			r.setRsrchSbjctIdTypTxt(String.valueOf(researchsubjectidentifiertype.getText()));
		}
		/******************** researchsubjectidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchsubjectidentifiertypecoding = researchsubjectidentifiertype.getCodingFirstRep();

		/******************** RsrchSbjct_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(researchsubjectidentifiertypecoding.hasVersion()) {
			r.setRsrchSbjctIdTypCdgVrsn(String.valueOf(researchsubjectidentifiertypecoding.getVersion()));
		}
		/******************** RsrchSbjct_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(researchsubjectidentifiertypecoding.hasDisplay()) {
			r.setRsrchSbjctIdTypCdgDsply(String.valueOf(researchsubjectidentifiertypecoding.getDisplay()));
		}
		/******************** RsrchSbjct_Id_Typ_Cdg_Cd ********************************************************************************/
		if(researchsubjectidentifiertypecoding.hasCode()) {
			r.setRsrchSbjctIdTypCdgCd(String.valueOf(researchsubjectidentifiertypecoding.getCode()));
		}
		/******************** RsrchSbjct_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(researchsubjectidentifiertypecoding.hasUserSelected()) {
			r.setRsrchSbjctIdTypCdgUsrSltd(String.valueOf(researchsubjectidentifiertypecoding.getUserSelected()));
		}
		/******************** RsrchSbjct_Id_Typ_Cdg_Sys ********************************************************************************/
		if(researchsubjectidentifiertypecoding.hasSystem()) {
			r.setRsrchSbjctIdTypCdgSys(String.valueOf(researchsubjectidentifiertypecoding.getSystem()));
		}
		/******************** researchsubjectidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchsubjectidentifierperiod = researchsubjectidentifier.getPeriod();

		/******************** RsrchSbjct_Id_Prd_Strt ********************************************************************************/
		if(researchsubjectidentifierperiod.hasStart()) {
			r.setRsrchSbjctIdPrdStrt(String.valueOf(researchsubjectidentifierperiod.getStart()));
		}
		/******************** RsrchSbjct_Id_Prd_End ********************************************************************************/
		if(researchsubjectidentifierperiod.hasEnd()) {
			r.setRsrchSbjctIdPrdEnd(String.valueOf(researchsubjectidentifierperiod.getEnd()));
		}
		/******************** RsrchSbjct_Id_Assigner ********************************************************************************/
		if(researchsubjectidentifier.hasAssigner()) {
			r.setRsrchSbjctIdAssigner(String.valueOf(researchsubjectidentifier.getAssigner()));
		}
		/******************** RsrchSbjct_Id_Sys ********************************************************************************/
		if(researchsubjectidentifier.hasSystem()) {
			r.setRsrchSbjctIdSys(String.valueOf(researchsubjectidentifier.getSystem()));
		}
		/******************** researchsubjectidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse researchsubjectidentifieruse = researchsubjectidentifier.getUse();
		r.setRsrchSbjctIdUse(researchsubjectidentifieruse.toCode());

		return r;
	}
}
