package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ResearchSubject;
public class ResearchSubjectConversion 
{
	public org.hl7.fhir.r4.model.ResearchSubject ResearchSubjects(ResearchSubject r) throws ParseException
	{
		org.hl7.fhir.r4.model.ResearchSubject researchsubject = new org.hl7.fhir.r4.model.ResearchSubject();

		/******************** id ********************************************************************************/
		researchsubject.setId(r.getId());

		/******************** RsrchSbjct_ActualArm ********************************************************************************/
		if(r.getRsrchSbjctActualArm() != null) {
			researchsubject.setActualArm(r.getRsrchSbjctActualArm());
		}
		/******************** RsrchSbjct_AssignedArm ********************************************************************************/
		if(r.getRsrchSbjctAssignedArm() != null) {
			researchsubject.setAssignedArm(r.getRsrchSbjctAssignedArm());
		}
		/******************** RsrchSbjct_Cnsnt ********************************************************************************/
		if(r.getRsrchSbjctCnsnt() != null) {
			researchsubject.setConsent( new org.hl7.fhir.r4.model.Reference(r.getRsrchSbjctCnsnt()));
		}
		/******************** researchsubjectidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier researchsubjectidentifier =  new org.hl7.fhir.r4.model.Identifier();
		researchsubject.addIdentifier(researchsubjectidentifier);

		/******************** RsrchSbjct_Id_Assigner ********************************************************************************/
		if(r.getRsrchSbjctIdAssigner() != null) {
			researchsubjectidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(r.getRsrchSbjctIdAssigner()));
		}
		/******************** researchsubjectidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchsubjectidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		researchsubjectidentifier.setPeriod(researchsubjectidentifierperiod);

		/******************** RsrchSbjct_Id_Prd_End ********************************************************************************/
		if(r.getRsrchSbjctIdPrdEnd() != null) {
			java.text.SimpleDateFormat RsrchSbjct_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchSbjct_Id_Prd_Enddate = RsrchSbjct_Id_Prd_Endsdf.parse(r.getRsrchSbjctIdPrdEnd());
			researchsubjectidentifierperiod.setEnd(RsrchSbjct_Id_Prd_Enddate);
		}
		/******************** RsrchSbjct_Id_Prd_Strt ********************************************************************************/
		if(r.getRsrchSbjctIdPrdStrt() != null) {
			java.text.SimpleDateFormat RsrchSbjct_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchSbjct_Id_Prd_Strtdate = RsrchSbjct_Id_Prd_Strtsdf.parse(r.getRsrchSbjctIdPrdStrt());
			researchsubjectidentifierperiod.setStart(RsrchSbjct_Id_Prd_Strtdate);
		}
		/******************** RsrchSbjct_Id_Sys ********************************************************************************/
		if(r.getRsrchSbjctIdSys() != null) {
			researchsubjectidentifier.setSystem(r.getRsrchSbjctIdSys());
		}
		/******************** researchsubjectidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchsubjectidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		researchsubjectidentifier.setType(researchsubjectidentifiertype);

		/******************** researchsubjectidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchsubjectidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		researchsubjectidentifiertype.addCoding(researchsubjectidentifiertypecoding);

		/******************** RsrchSbjct_Id_Typ_Cdg_Cd ********************************************************************************/
		if(r.getRsrchSbjctIdTypCdgCd() != null) {
			researchsubjectidentifiertypecoding.setCode(r.getRsrchSbjctIdTypCdgCd());
		}
		/******************** RsrchSbjct_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchSbjctIdTypCdgDsply() != null) {
			researchsubjectidentifiertypecoding.setDisplay(r.getRsrchSbjctIdTypCdgDsply());
		}
		/******************** RsrchSbjct_Id_Typ_Cdg_Sys ********************************************************************************/
		if(r.getRsrchSbjctIdTypCdgSys() != null) {
			researchsubjectidentifiertypecoding.setSystem(r.getRsrchSbjctIdTypCdgSys());
		}
		/******************** RsrchSbjct_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchSbjctIdTypCdgUsrSltd() != null) {
			researchsubjectidentifiertypecoding.setUserSelected(Boolean.parseBoolean(r.getRsrchSbjctIdTypCdgUsrSltd()));
		}
		/******************** RsrchSbjct_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchSbjctIdTypCdgVrsn() != null) {
			researchsubjectidentifiertypecoding.setVersion(r.getRsrchSbjctIdTypCdgVrsn());
		}
		/******************** RsrchSbjct_Id_Typ_Txt ********************************************************************************/
		if(r.getRsrchSbjctIdTypTxt() != null) {
			researchsubjectidentifiertype.setText(r.getRsrchSbjctIdTypTxt());
		}
		/******************** researchsubjectidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory researchsubjectidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		researchsubjectidentifier.setUse(researchsubjectidentifieruse.fromCode(r.getRsrchSbjctIdUse()));

		/******************** RsrchSbjct_Id_Vl ********************************************************************************/
		if(r.getRsrchSbjctIdVl() != null) {
			researchsubjectidentifier.setValue(r.getRsrchSbjctIdVl());
		}
		/******************** RsrchSbjct_Individual ********************************************************************************/
		if(r.getRsrchSbjctIndividual() != null) {
			researchsubject.setIndividual( new org.hl7.fhir.r4.model.Reference(r.getRsrchSbjctIndividual()));
		}
		/******************** researchsubjectperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchsubjectperiod =  new org.hl7.fhir.r4.model.Period();
		researchsubject.setPeriod(researchsubjectperiod);

		/******************** RsrchSbjct_Prd_End ********************************************************************************/
		if(r.getRsrchSbjctPrdEnd() != null) {
			java.text.SimpleDateFormat RsrchSbjct_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchSbjct_Prd_Enddate = RsrchSbjct_Prd_Endsdf.parse(r.getRsrchSbjctPrdEnd());
			researchsubjectperiod.setEnd(RsrchSbjct_Prd_Enddate);
		}
		/******************** RsrchSbjct_Prd_Strt ********************************************************************************/
		if(r.getRsrchSbjctPrdStrt() != null) {
			java.text.SimpleDateFormat RsrchSbjct_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchSbjct_Prd_Strtdate = RsrchSbjct_Prd_Strtsdf.parse(r.getRsrchSbjctPrdStrt());
			researchsubjectperiod.setStart(RsrchSbjct_Prd_Strtdate);
		}
		/******************** researchsubjectstatus ********************************************************************************/
		org.hl7.fhir.r4.model.ResearchSubject.ResearchSubjectStatusEnumFactory researchsubjectstatus =  new org.hl7.fhir.r4.model.ResearchSubject.ResearchSubjectStatusEnumFactory();
		researchsubject.setStatus(researchsubjectstatus.fromCode(r.getRsrchSbjctSts()));

		/******************** RsrchSbjct_Stdy ********************************************************************************/
		if(r.getRsrchSbjctStdy() != null) {
			researchsubject.setStudy( new org.hl7.fhir.r4.model.Reference(r.getRsrchSbjctStdy()));
		}
		return researchsubject;
	}
}
