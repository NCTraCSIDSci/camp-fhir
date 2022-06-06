package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ResearchStudy;
public class ResearchStudyConversion 
{
	public org.hl7.fhir.r4.model.ResearchStudy ResearchStudys(ResearchStudy r) throws ParseException
	{
		org.hl7.fhir.r4.model.ResearchStudy researchstudy = new org.hl7.fhir.r4.model.ResearchStudy();

		/******************** id ********************************************************************************/
		researchstudy.setId(r.getId());

		/******************** researchstudyarm ********************************************************************************/
		org.hl7.fhir.r4.model.ResearchStudy.ResearchStudyArmComponent researchstudyarm =  new org.hl7.fhir.r4.model.ResearchStudy.ResearchStudyArmComponent();
		researchstudy.addArm(researchstudyarm);

		/******************** RsrchStdy_Arm_Dscrptn ********************************************************************************/
		if(r.getRsrchStdyArmDscrptn() != null) {
			researchstudyarm.setDescription(r.getRsrchStdyArmDscrptn());
		}
		/******************** RsrchStdy_Arm_Nm ********************************************************************************/
		if(r.getRsrchStdyArmNm() != null) {
			researchstudyarm.setName(r.getRsrchStdyArmNm());
		}
		/******************** researchstudyarmtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchstudyarmtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		researchstudyarm.setType(researchstudyarmtype);

		/******************** researchstudyarmtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchstudyarmtypecoding =  new org.hl7.fhir.r4.model.Coding();
		researchstudyarmtype.addCoding(researchstudyarmtypecoding);

		/******************** RsrchStdy_Arm_Typ_Cdg_Cd ********************************************************************************/
		if(r.getRsrchStdyArmTypCdgCd() != null) {
			researchstudyarmtypecoding.setCode(r.getRsrchStdyArmTypCdgCd());
		}
		/******************** RsrchStdy_Arm_Typ_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchStdyArmTypCdgDsply() != null) {
			researchstudyarmtypecoding.setDisplay(r.getRsrchStdyArmTypCdgDsply());
		}
		/******************** RsrchStdy_Arm_Typ_Cdg_Sys ********************************************************************************/
		if(r.getRsrchStdyArmTypCdgSys() != null) {
			researchstudyarmtypecoding.setSystem(r.getRsrchStdyArmTypCdgSys());
		}
		/******************** RsrchStdy_Arm_Typ_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchStdyArmTypCdgUsrSltd() != null) {
			researchstudyarmtypecoding.setUserSelected(Boolean.parseBoolean(r.getRsrchStdyArmTypCdgUsrSltd()));
		}
		/******************** RsrchStdy_Arm_Typ_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchStdyArmTypCdgVrsn() != null) {
			researchstudyarmtypecoding.setVersion(r.getRsrchStdyArmTypCdgVrsn());
		}
		/******************** RsrchStdy_Arm_Typ_Txt ********************************************************************************/
		if(r.getRsrchStdyArmTypTxt() != null) {
			researchstudyarmtype.setText(r.getRsrchStdyArmTypTxt());
		}
		/******************** researchstudycategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchstudycategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		researchstudy.addCategory(researchstudycategory);

		/******************** researchstudycategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchstudycategorycoding =  new org.hl7.fhir.r4.model.Coding();
		researchstudycategory.addCoding(researchstudycategorycoding);

		/******************** RsrchStdy_Ctgry_Cdg_Cd ********************************************************************************/
		if(r.getRsrchStdyCtgryCdgCd() != null) {
			researchstudycategorycoding.setCode(r.getRsrchStdyCtgryCdgCd());
		}
		/******************** RsrchStdy_Ctgry_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchStdyCtgryCdgDsply() != null) {
			researchstudycategorycoding.setDisplay(r.getRsrchStdyCtgryCdgDsply());
		}
		/******************** RsrchStdy_Ctgry_Cdg_Sys ********************************************************************************/
		if(r.getRsrchStdyCtgryCdgSys() != null) {
			researchstudycategorycoding.setSystem(r.getRsrchStdyCtgryCdgSys());
		}
		/******************** RsrchStdy_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchStdyCtgryCdgUsrSltd() != null) {
			researchstudycategorycoding.setUserSelected(Boolean.parseBoolean(r.getRsrchStdyCtgryCdgUsrSltd()));
		}
		/******************** RsrchStdy_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchStdyCtgryCdgVrsn() != null) {
			researchstudycategorycoding.setVersion(r.getRsrchStdyCtgryCdgVrsn());
		}
		/******************** RsrchStdy_Ctgry_Txt ********************************************************************************/
		if(r.getRsrchStdyCtgryTxt() != null) {
			researchstudycategory.setText(r.getRsrchStdyCtgryTxt());
		}
		/******************** researchstudycondition ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchstudycondition =  new org.hl7.fhir.r4.model.CodeableConcept();
		researchstudy.addCondition(researchstudycondition);

		/******************** researchstudyconditioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchstudyconditioncoding =  new org.hl7.fhir.r4.model.Coding();
		researchstudycondition.addCoding(researchstudyconditioncoding);

		/******************** RsrchStdy_Cndtn_Cdg_Cd ********************************************************************************/
		if(r.getRsrchStdyCndtnCdgCd() != null) {
			researchstudyconditioncoding.setCode(r.getRsrchStdyCndtnCdgCd());
		}
		/******************** RsrchStdy_Cndtn_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchStdyCndtnCdgDsply() != null) {
			researchstudyconditioncoding.setDisplay(r.getRsrchStdyCndtnCdgDsply());
		}
		/******************** RsrchStdy_Cndtn_Cdg_Sys ********************************************************************************/
		if(r.getRsrchStdyCndtnCdgSys() != null) {
			researchstudyconditioncoding.setSystem(r.getRsrchStdyCndtnCdgSys());
		}
		/******************** RsrchStdy_Cndtn_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchStdyCndtnCdgUsrSltd() != null) {
			researchstudyconditioncoding.setUserSelected(Boolean.parseBoolean(r.getRsrchStdyCndtnCdgUsrSltd()));
		}
		/******************** RsrchStdy_Cndtn_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchStdyCndtnCdgVrsn() != null) {
			researchstudyconditioncoding.setVersion(r.getRsrchStdyCndtnCdgVrsn());
		}
		/******************** RsrchStdy_Cndtn_Txt ********************************************************************************/
		if(r.getRsrchStdyCndtnTxt() != null) {
			researchstudycondition.setText(r.getRsrchStdyCndtnTxt());
		}
		/******************** researchstudycontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail researchstudycontact =  new org.hl7.fhir.r4.model.ContactDetail();
		researchstudy.addContact(researchstudycontact);

		/******************** RsrchStdy_Cntct_Nm ********************************************************************************/
		if(r.getRsrchStdyCntctNm() != null) {
			researchstudycontact.setName(r.getRsrchStdyCntctNm());
		}
		/******************** researchstudycontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint researchstudycontacttelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		researchstudycontact.addTelecom(researchstudycontacttelecom);

		/******************** researchstudycontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchstudycontacttelecomperiod =  new org.hl7.fhir.r4.model.Period();
		researchstudycontacttelecom.setPeriod(researchstudycontacttelecomperiod);

		/******************** RsrchStdy_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(r.getRsrchStdyCntctTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat RsrchStdy_Cntct_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchStdy_Cntct_Tlcm_Prd_Enddate = RsrchStdy_Cntct_Tlcm_Prd_Endsdf.parse(r.getRsrchStdyCntctTlcmPrdEnd());
			researchstudycontacttelecomperiod.setEnd(RsrchStdy_Cntct_Tlcm_Prd_Enddate);
		}
		/******************** RsrchStdy_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(r.getRsrchStdyCntctTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat RsrchStdy_Cntct_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchStdy_Cntct_Tlcm_Prd_Strtdate = RsrchStdy_Cntct_Tlcm_Prd_Strtsdf.parse(r.getRsrchStdyCntctTlcmPrdStrt());
			researchstudycontacttelecomperiod.setStart(RsrchStdy_Cntct_Tlcm_Prd_Strtdate);
		}
		/******************** RsrchStdy_Cntct_Tlcm_Rnk ********************************************************************************/
		if(r.getRsrchStdyCntctTlcmRnk() != null) {
			researchstudycontacttelecom.setRank(Integer.parseInt(r.getRsrchStdyCntctTlcmRnk()));
		}
		/******************** researchstudycontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory researchstudycontacttelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		researchstudycontacttelecom.setSystem(researchstudycontacttelecomsystem.fromCode(r.getRsrchStdyCntctTlcmSys()));

		/******************** researchstudycontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory researchstudycontacttelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		researchstudycontacttelecom.setUse(researchstudycontacttelecomuse.fromCode(r.getRsrchStdyCntctTlcmUse()));

		/******************** RsrchStdy_Cntct_Tlcm_Vl ********************************************************************************/
		if(r.getRsrchStdyCntctTlcmVl() != null) {
			researchstudycontacttelecom.setValue(r.getRsrchStdyCntctTlcmVl());
		}
		/******************** RsrchStdy_Dscrptn ********************************************************************************/
		if(r.getRsrchStdyDscrptn() != null) {
			researchstudy.setDescription(r.getRsrchStdyDscrptn());
		}
		/******************** RsrchStdy_Enrollment ********************************************************************************/
		if(r.getRsrchStdyEnrollment() != null) {
			researchstudy.addEnrollment( new org.hl7.fhir.r4.model.Reference(r.getRsrchStdyEnrollment()));
		}
		/******************** researchstudyfocus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchstudyfocus =  new org.hl7.fhir.r4.model.CodeableConcept();
		researchstudy.addFocus(researchstudyfocus);

		/******************** researchstudyfocuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchstudyfocuscoding =  new org.hl7.fhir.r4.model.Coding();
		researchstudyfocus.addCoding(researchstudyfocuscoding);

		/******************** RsrchStdy_Focus_Cdg_Cd ********************************************************************************/
		if(r.getRsrchStdyFocusCdgCd() != null) {
			researchstudyfocuscoding.setCode(r.getRsrchStdyFocusCdgCd());
		}
		/******************** RsrchStdy_Focus_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchStdyFocusCdgDsply() != null) {
			researchstudyfocuscoding.setDisplay(r.getRsrchStdyFocusCdgDsply());
		}
		/******************** RsrchStdy_Focus_Cdg_Sys ********************************************************************************/
		if(r.getRsrchStdyFocusCdgSys() != null) {
			researchstudyfocuscoding.setSystem(r.getRsrchStdyFocusCdgSys());
		}
		/******************** RsrchStdy_Focus_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchStdyFocusCdgUsrSltd() != null) {
			researchstudyfocuscoding.setUserSelected(Boolean.parseBoolean(r.getRsrchStdyFocusCdgUsrSltd()));
		}
		/******************** RsrchStdy_Focus_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchStdyFocusCdgVrsn() != null) {
			researchstudyfocuscoding.setVersion(r.getRsrchStdyFocusCdgVrsn());
		}
		/******************** RsrchStdy_Focus_Txt ********************************************************************************/
		if(r.getRsrchStdyFocusTxt() != null) {
			researchstudyfocus.setText(r.getRsrchStdyFocusTxt());
		}
		/******************** researchstudyidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier researchstudyidentifier =  new org.hl7.fhir.r4.model.Identifier();
		researchstudy.addIdentifier(researchstudyidentifier);

		/******************** RsrchStdy_Id_Assigner ********************************************************************************/
		if(r.getRsrchStdyIdAssigner() != null) {
			researchstudyidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(r.getRsrchStdyIdAssigner()));
		}
		/******************** researchstudyidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchstudyidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		researchstudyidentifier.setPeriod(researchstudyidentifierperiod);

		/******************** RsrchStdy_Id_Prd_End ********************************************************************************/
		if(r.getRsrchStdyIdPrdEnd() != null) {
			java.text.SimpleDateFormat RsrchStdy_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchStdy_Id_Prd_Enddate = RsrchStdy_Id_Prd_Endsdf.parse(r.getRsrchStdyIdPrdEnd());
			researchstudyidentifierperiod.setEnd(RsrchStdy_Id_Prd_Enddate);
		}
		/******************** RsrchStdy_Id_Prd_Strt ********************************************************************************/
		if(r.getRsrchStdyIdPrdStrt() != null) {
			java.text.SimpleDateFormat RsrchStdy_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchStdy_Id_Prd_Strtdate = RsrchStdy_Id_Prd_Strtsdf.parse(r.getRsrchStdyIdPrdStrt());
			researchstudyidentifierperiod.setStart(RsrchStdy_Id_Prd_Strtdate);
		}
		/******************** RsrchStdy_Id_Sys ********************************************************************************/
		if(r.getRsrchStdyIdSys() != null) {
			researchstudyidentifier.setSystem(r.getRsrchStdyIdSys());
		}
		/******************** researchstudyidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchstudyidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		researchstudyidentifier.setType(researchstudyidentifiertype);

		/******************** researchstudyidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchstudyidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		researchstudyidentifiertype.addCoding(researchstudyidentifiertypecoding);

		/******************** RsrchStdy_Id_Typ_Cdg_Cd ********************************************************************************/
		if(r.getRsrchStdyIdTypCdgCd() != null) {
			researchstudyidentifiertypecoding.setCode(r.getRsrchStdyIdTypCdgCd());
		}
		/******************** RsrchStdy_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchStdyIdTypCdgDsply() != null) {
			researchstudyidentifiertypecoding.setDisplay(r.getRsrchStdyIdTypCdgDsply());
		}
		/******************** RsrchStdy_Id_Typ_Cdg_Sys ********************************************************************************/
		if(r.getRsrchStdyIdTypCdgSys() != null) {
			researchstudyidentifiertypecoding.setSystem(r.getRsrchStdyIdTypCdgSys());
		}
		/******************** RsrchStdy_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchStdyIdTypCdgUsrSltd() != null) {
			researchstudyidentifiertypecoding.setUserSelected(Boolean.parseBoolean(r.getRsrchStdyIdTypCdgUsrSltd()));
		}
		/******************** RsrchStdy_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchStdyIdTypCdgVrsn() != null) {
			researchstudyidentifiertypecoding.setVersion(r.getRsrchStdyIdTypCdgVrsn());
		}
		/******************** RsrchStdy_Id_Typ_Txt ********************************************************************************/
		if(r.getRsrchStdyIdTypTxt() != null) {
			researchstudyidentifiertype.setText(r.getRsrchStdyIdTypTxt());
		}
		/******************** researchstudyidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory researchstudyidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		researchstudyidentifier.setUse(researchstudyidentifieruse.fromCode(r.getRsrchStdyIdUse()));

		/******************** RsrchStdy_Id_Vl ********************************************************************************/
		if(r.getRsrchStdyIdVl() != null) {
			researchstudyidentifier.setValue(r.getRsrchStdyIdVl());
		}
		/******************** researchstudykeyword ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchstudykeyword =  new org.hl7.fhir.r4.model.CodeableConcept();
		researchstudy.addKeyword(researchstudykeyword);

		/******************** researchstudykeywordcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchstudykeywordcoding =  new org.hl7.fhir.r4.model.Coding();
		researchstudykeyword.addCoding(researchstudykeywordcoding);

		/******************** RsrchStdy_Keyword_Cdg_Cd ********************************************************************************/
		if(r.getRsrchStdyKeywordCdgCd() != null) {
			researchstudykeywordcoding.setCode(r.getRsrchStdyKeywordCdgCd());
		}
		/******************** RsrchStdy_Keyword_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchStdyKeywordCdgDsply() != null) {
			researchstudykeywordcoding.setDisplay(r.getRsrchStdyKeywordCdgDsply());
		}
		/******************** RsrchStdy_Keyword_Cdg_Sys ********************************************************************************/
		if(r.getRsrchStdyKeywordCdgSys() != null) {
			researchstudykeywordcoding.setSystem(r.getRsrchStdyKeywordCdgSys());
		}
		/******************** RsrchStdy_Keyword_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchStdyKeywordCdgUsrSltd() != null) {
			researchstudykeywordcoding.setUserSelected(Boolean.parseBoolean(r.getRsrchStdyKeywordCdgUsrSltd()));
		}
		/******************** RsrchStdy_Keyword_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchStdyKeywordCdgVrsn() != null) {
			researchstudykeywordcoding.setVersion(r.getRsrchStdyKeywordCdgVrsn());
		}
		/******************** RsrchStdy_Keyword_Txt ********************************************************************************/
		if(r.getRsrchStdyKeywordTxt() != null) {
			researchstudykeyword.setText(r.getRsrchStdyKeywordTxt());
		}
		/******************** researchstudylocation ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchstudylocation =  new org.hl7.fhir.r4.model.CodeableConcept();
		researchstudy.addLocation(researchstudylocation);

		/******************** researchstudylocationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchstudylocationcoding =  new org.hl7.fhir.r4.model.Coding();
		researchstudylocation.addCoding(researchstudylocationcoding);

		/******************** RsrchStdy_Lctn_Cdg_Cd ********************************************************************************/
		if(r.getRsrchStdyLctnCdgCd() != null) {
			researchstudylocationcoding.setCode(r.getRsrchStdyLctnCdgCd());
		}
		/******************** RsrchStdy_Lctn_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchStdyLctnCdgDsply() != null) {
			researchstudylocationcoding.setDisplay(r.getRsrchStdyLctnCdgDsply());
		}
		/******************** RsrchStdy_Lctn_Cdg_Sys ********************************************************************************/
		if(r.getRsrchStdyLctnCdgSys() != null) {
			researchstudylocationcoding.setSystem(r.getRsrchStdyLctnCdgSys());
		}
		/******************** RsrchStdy_Lctn_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchStdyLctnCdgUsrSltd() != null) {
			researchstudylocationcoding.setUserSelected(Boolean.parseBoolean(r.getRsrchStdyLctnCdgUsrSltd()));
		}
		/******************** RsrchStdy_Lctn_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchStdyLctnCdgVrsn() != null) {
			researchstudylocationcoding.setVersion(r.getRsrchStdyLctnCdgVrsn());
		}
		/******************** RsrchStdy_Lctn_Txt ********************************************************************************/
		if(r.getRsrchStdyLctnTxt() != null) {
			researchstudylocation.setText(r.getRsrchStdyLctnTxt());
		}
		/******************** researchstudynote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation researchstudynote =  new org.hl7.fhir.r4.model.Annotation();
		researchstudy.addNote(researchstudynote);

		/******************** RsrchStdy_Nt_AthrRfrnc ********************************************************************************/
		if(r.getRsrchStdyNtAthrRfrnc() != null) {
			researchstudynote.setAuthor( new org.hl7.fhir.r4.model.Reference(r.getRsrchStdyNtAthrRfrnc()));
		}
		/******************** RsrchStdy_Nt_AthrStrgTyp ********************************************************************************/
		if(r.getRsrchStdyNtAthrStrgTyp() != null) {
			researchstudynote.setAuthor( new org.hl7.fhir.r4.model.StringType(r.getRsrchStdyNtAthrStrgTyp()));
		}
		/******************** RsrchStdy_Nt_Txt ********************************************************************************/
		if(r.getRsrchStdyNtTxt() != null) {
			researchstudynote.setText(r.getRsrchStdyNtTxt());
		}
		/******************** RsrchStdy_Nt_Time ********************************************************************************/
		if(r.getRsrchStdyNtTime() != null) {
			java.text.SimpleDateFormat RsrchStdy_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchStdy_Nt_Timedate = RsrchStdy_Nt_Timesdf.parse(r.getRsrchStdyNtTime());
			researchstudynote.setTime(RsrchStdy_Nt_Timedate);
		}
		/******************** researchstudyobjective ********************************************************************************/
		org.hl7.fhir.r4.model.ResearchStudy.ResearchStudyObjectiveComponent researchstudyobjective =  new org.hl7.fhir.r4.model.ResearchStudy.ResearchStudyObjectiveComponent();
		researchstudy.addObjective(researchstudyobjective);

		/******************** RsrchStdy_Objective_Nm ********************************************************************************/
		if(r.getRsrchStdyObjectiveNm() != null) {
			researchstudyobjective.setName(r.getRsrchStdyObjectiveNm());
		}
		/******************** researchstudyobjectivetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchstudyobjectivetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		researchstudyobjective.setType(researchstudyobjectivetype);

		/******************** researchstudyobjectivetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchstudyobjectivetypecoding =  new org.hl7.fhir.r4.model.Coding();
		researchstudyobjectivetype.addCoding(researchstudyobjectivetypecoding);

		/******************** RsrchStdy_Objective_Typ_Cdg_Cd ********************************************************************************/
		if(r.getRsrchStdyObjectiveTypCdgCd() != null) {
			researchstudyobjectivetypecoding.setCode(r.getRsrchStdyObjectiveTypCdgCd());
		}
		/******************** RsrchStdy_Objective_Typ_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchStdyObjectiveTypCdgDsply() != null) {
			researchstudyobjectivetypecoding.setDisplay(r.getRsrchStdyObjectiveTypCdgDsply());
		}
		/******************** RsrchStdy_Objective_Typ_Cdg_Sys ********************************************************************************/
		if(r.getRsrchStdyObjectiveTypCdgSys() != null) {
			researchstudyobjectivetypecoding.setSystem(r.getRsrchStdyObjectiveTypCdgSys());
		}
		/******************** RsrchStdy_Objective_Typ_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchStdyObjectiveTypCdgUsrSltd() != null) {
			researchstudyobjectivetypecoding.setUserSelected(Boolean.parseBoolean(r.getRsrchStdyObjectiveTypCdgUsrSltd()));
		}
		/******************** RsrchStdy_Objective_Typ_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchStdyObjectiveTypCdgVrsn() != null) {
			researchstudyobjectivetypecoding.setVersion(r.getRsrchStdyObjectiveTypCdgVrsn());
		}
		/******************** RsrchStdy_Objective_Typ_Txt ********************************************************************************/
		if(r.getRsrchStdyObjectiveTypTxt() != null) {
			researchstudyobjectivetype.setText(r.getRsrchStdyObjectiveTypTxt());
		}
		/******************** RsrchStdy_PartOf ********************************************************************************/
		if(r.getRsrchStdyPartOf() != null) {
			researchstudy.addPartOf( new org.hl7.fhir.r4.model.Reference(r.getRsrchStdyPartOf()));
		}
		/******************** researchstudyperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchstudyperiod =  new org.hl7.fhir.r4.model.Period();
		researchstudy.setPeriod(researchstudyperiod);

		/******************** RsrchStdy_Prd_End ********************************************************************************/
		if(r.getRsrchStdyPrdEnd() != null) {
			java.text.SimpleDateFormat RsrchStdy_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchStdy_Prd_Enddate = RsrchStdy_Prd_Endsdf.parse(r.getRsrchStdyPrdEnd());
			researchstudyperiod.setEnd(RsrchStdy_Prd_Enddate);
		}
		/******************** RsrchStdy_Prd_Strt ********************************************************************************/
		if(r.getRsrchStdyPrdStrt() != null) {
			java.text.SimpleDateFormat RsrchStdy_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchStdy_Prd_Strtdate = RsrchStdy_Prd_Strtsdf.parse(r.getRsrchStdyPrdStrt());
			researchstudyperiod.setStart(RsrchStdy_Prd_Strtdate);
		}
		/******************** researchstudyphase ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchstudyphase =  new org.hl7.fhir.r4.model.CodeableConcept();
		researchstudy.setPhase(researchstudyphase);

		/******************** researchstudyphasecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchstudyphasecoding =  new org.hl7.fhir.r4.model.Coding();
		researchstudyphase.addCoding(researchstudyphasecoding);

		/******************** RsrchStdy_Phase_Cdg_Cd ********************************************************************************/
		if(r.getRsrchStdyPhaseCdgCd() != null) {
			researchstudyphasecoding.setCode(r.getRsrchStdyPhaseCdgCd());
		}
		/******************** RsrchStdy_Phase_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchStdyPhaseCdgDsply() != null) {
			researchstudyphasecoding.setDisplay(r.getRsrchStdyPhaseCdgDsply());
		}
		/******************** RsrchStdy_Phase_Cdg_Sys ********************************************************************************/
		if(r.getRsrchStdyPhaseCdgSys() != null) {
			researchstudyphasecoding.setSystem(r.getRsrchStdyPhaseCdgSys());
		}
		/******************** RsrchStdy_Phase_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchStdyPhaseCdgUsrSltd() != null) {
			researchstudyphasecoding.setUserSelected(Boolean.parseBoolean(r.getRsrchStdyPhaseCdgUsrSltd()));
		}
		/******************** RsrchStdy_Phase_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchStdyPhaseCdgVrsn() != null) {
			researchstudyphasecoding.setVersion(r.getRsrchStdyPhaseCdgVrsn());
		}
		/******************** RsrchStdy_Phase_Txt ********************************************************************************/
		if(r.getRsrchStdyPhaseTxt() != null) {
			researchstudyphase.setText(r.getRsrchStdyPhaseTxt());
		}
		/******************** researchstudyprimarypurposetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchstudyprimarypurposetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		researchstudy.setPrimaryPurposeType(researchstudyprimarypurposetype);

		/******************** researchstudyprimarypurposetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchstudyprimarypurposetypecoding =  new org.hl7.fhir.r4.model.Coding();
		researchstudyprimarypurposetype.addCoding(researchstudyprimarypurposetypecoding);

		/******************** RsrchStdy_PrimaryPrpseTyp_Cdg_Cd ********************************************************************************/
		if(r.getRsrchStdyPrimaryPrpseTypCdgCd() != null) {
			researchstudyprimarypurposetypecoding.setCode(r.getRsrchStdyPrimaryPrpseTypCdgCd());
		}
		/******************** RsrchStdy_PrimaryPrpseTyp_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchStdyPrimaryPrpseTypCdgDsply() != null) {
			researchstudyprimarypurposetypecoding.setDisplay(r.getRsrchStdyPrimaryPrpseTypCdgDsply());
		}
		/******************** RsrchStdy_PrimaryPrpseTyp_Cdg_Sys ********************************************************************************/
		if(r.getRsrchStdyPrimaryPrpseTypCdgSys() != null) {
			researchstudyprimarypurposetypecoding.setSystem(r.getRsrchStdyPrimaryPrpseTypCdgSys());
		}
		/******************** RsrchStdy_PrimaryPrpseTyp_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchStdyPrimaryPrpseTypCdgUsrSltd() != null) {
			researchstudyprimarypurposetypecoding.setUserSelected(Boolean.parseBoolean(r.getRsrchStdyPrimaryPrpseTypCdgUsrSltd()));
		}
		/******************** RsrchStdy_PrimaryPrpseTyp_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchStdyPrimaryPrpseTypCdgVrsn() != null) {
			researchstudyprimarypurposetypecoding.setVersion(r.getRsrchStdyPrimaryPrpseTypCdgVrsn());
		}
		/******************** RsrchStdy_PrimaryPrpseTyp_Txt ********************************************************************************/
		if(r.getRsrchStdyPrimaryPrpseTypTxt() != null) {
			researchstudyprimarypurposetype.setText(r.getRsrchStdyPrimaryPrpseTypTxt());
		}
		/******************** RsrchStdy_PrincipalInvestigator ********************************************************************************/
		if(r.getRsrchStdyPrincipalInvestigator() != null) {
			researchstudy.setPrincipalInvestigator( new org.hl7.fhir.r4.model.Reference(r.getRsrchStdyPrincipalInvestigator()));
		}
		/******************** RsrchStdy_Protocol ********************************************************************************/
		if(r.getRsrchStdyProtocol() != null) {
			researchstudy.addProtocol( new org.hl7.fhir.r4.model.Reference(r.getRsrchStdyProtocol()));
		}
		/******************** researchstudyreasonstopped ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchstudyreasonstopped =  new org.hl7.fhir.r4.model.CodeableConcept();
		researchstudy.setReasonStopped(researchstudyreasonstopped);

		/******************** researchstudyreasonstoppedcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchstudyreasonstoppedcoding =  new org.hl7.fhir.r4.model.Coding();
		researchstudyreasonstopped.addCoding(researchstudyreasonstoppedcoding);

		/******************** RsrchStdy_RsnStopped_Cdg_Cd ********************************************************************************/
		if(r.getRsrchStdyRsnStoppedCdgCd() != null) {
			researchstudyreasonstoppedcoding.setCode(r.getRsrchStdyRsnStoppedCdgCd());
		}
		/******************** RsrchStdy_RsnStopped_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchStdyRsnStoppedCdgDsply() != null) {
			researchstudyreasonstoppedcoding.setDisplay(r.getRsrchStdyRsnStoppedCdgDsply());
		}
		/******************** RsrchStdy_RsnStopped_Cdg_Sys ********************************************************************************/
		if(r.getRsrchStdyRsnStoppedCdgSys() != null) {
			researchstudyreasonstoppedcoding.setSystem(r.getRsrchStdyRsnStoppedCdgSys());
		}
		/******************** RsrchStdy_RsnStopped_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchStdyRsnStoppedCdgUsrSltd() != null) {
			researchstudyreasonstoppedcoding.setUserSelected(Boolean.parseBoolean(r.getRsrchStdyRsnStoppedCdgUsrSltd()));
		}
		/******************** RsrchStdy_RsnStopped_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchStdyRsnStoppedCdgVrsn() != null) {
			researchstudyreasonstoppedcoding.setVersion(r.getRsrchStdyRsnStoppedCdgVrsn());
		}
		/******************** RsrchStdy_RsnStopped_Txt ********************************************************************************/
		if(r.getRsrchStdyRsnStoppedTxt() != null) {
			researchstudyreasonstopped.setText(r.getRsrchStdyRsnStoppedTxt());
		}
		/******************** researchstudyrelatedartifact ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact researchstudyrelatedartifact =  new org.hl7.fhir.r4.model.RelatedArtifact();
		researchstudy.addRelatedArtifact(researchstudyrelatedartifact);

		/******************** RsrchStdy_RltedArtfct_Citation ********************************************************************************/
		if(r.getRsrchStdyRltedArtfctCitation() != null) {
			researchstudyrelatedartifact.setCitation(r.getRsrchStdyRltedArtfctCitation());
		}
		/******************** RsrchStdy_RltedArtfct_Dsply ********************************************************************************/
		if(r.getRsrchStdyRltedArtfctDsply() != null) {
			researchstudyrelatedartifact.setDisplay(r.getRsrchStdyRltedArtfctDsply());
		}
		/******************** researchstudyrelatedartifactdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment researchstudyrelatedartifactdocument =  new org.hl7.fhir.r4.model.Attachment();
		researchstudyrelatedartifact.setDocument(researchstudyrelatedartifactdocument);

		/******************** RsrchStdy_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(r.getRsrchStdyRltedArtfctDocCntntTyp() != null) {
			researchstudyrelatedartifactdocument.setContentType(r.getRsrchStdyRltedArtfctDocCntntTyp());
		}
		/******************** RsrchStdy_RltedArtfct_Doc_Creation ********************************************************************************/
		if(r.getRsrchStdyRltedArtfctDocCreation() != null) {
			java.text.SimpleDateFormat RsrchStdy_RltedArtfct_Doc_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchStdy_RltedArtfct_Doc_Creationdate = RsrchStdy_RltedArtfct_Doc_Creationsdf.parse(r.getRsrchStdyRltedArtfctDocCreation());
			researchstudyrelatedartifactdocument.setCreation(RsrchStdy_RltedArtfct_Doc_Creationdate);
		}
		/******************** RsrchStdy_RltedArtfct_Doc_Data ********************************************************************************/
		if(r.getRsrchStdyRltedArtfctDocData() != null) {
			researchstudyrelatedartifactdocument.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(r.getRsrchStdyRltedArtfctDocData()));
		}
		/******************** RsrchStdy_RltedArtfct_Doc_Hash ********************************************************************************/
		if(r.getRsrchStdyRltedArtfctDocHash() != null) {
			researchstudyrelatedartifactdocument.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(r.getRsrchStdyRltedArtfctDocHash()));
		}
		/******************** RsrchStdy_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(r.getRsrchStdyRltedArtfctDocLnguage() != null) {
			researchstudyrelatedartifactdocument.setLanguage(r.getRsrchStdyRltedArtfctDocLnguage());
		}
		/******************** RsrchStdy_RltedArtfct_Doc_Sz ********************************************************************************/
		if(r.getRsrchStdyRltedArtfctDocSz() != null) {
			researchstudyrelatedartifactdocument.setSize(Integer.parseInt(r.getRsrchStdyRltedArtfctDocSz()));
		}
		/******************** RsrchStdy_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(r.getRsrchStdyRltedArtfctDocTtl() != null) {
			researchstudyrelatedartifactdocument.setTitle(r.getRsrchStdyRltedArtfctDocTtl());
		}
		/******************** RsrchStdy_RltedArtfct_Doc_Url ********************************************************************************/
		if(r.getRsrchStdyRltedArtfctDocUrl() != null) {
			researchstudyrelatedartifactdocument.setUrl(r.getRsrchStdyRltedArtfctDocUrl());
		}
		/******************** RsrchStdy_RltedArtfct_Lbl ********************************************************************************/
		if(r.getRsrchStdyRltedArtfctLbl() != null) {
			researchstudyrelatedartifact.setLabel(r.getRsrchStdyRltedArtfctLbl());
		}
		/******************** RsrchStdy_RltedArtfct_Rsrc ********************************************************************************/
		if(r.getRsrchStdyRltedArtfctRsrc() != null) {
			researchstudyrelatedartifact.setResource(r.getRsrchStdyRltedArtfctRsrc());
		}
		/******************** researchstudyrelatedartifacttype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory researchstudyrelatedartifacttype =  new org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory();
		researchstudyrelatedartifact.setType(researchstudyrelatedartifacttype.fromCode(r.getRsrchStdyRltedArtfctTyp()));

		/******************** RsrchStdy_RltedArtfct_Url ********************************************************************************/
		if(r.getRsrchStdyRltedArtfctUrl() != null) {
			researchstudyrelatedartifact.setUrl(r.getRsrchStdyRltedArtfctUrl());
		}
		/******************** RsrchStdy_Site ********************************************************************************/
		if(r.getRsrchStdySite() != null) {
			researchstudy.addSite( new org.hl7.fhir.r4.model.Reference(r.getRsrchStdySite()));
		}
		/******************** RsrchStdy_Sponsor ********************************************************************************/
		if(r.getRsrchStdySponsor() != null) {
			researchstudy.setSponsor( new org.hl7.fhir.r4.model.Reference(r.getRsrchStdySponsor()));
		}
		/******************** researchstudystatus ********************************************************************************/
		org.hl7.fhir.r4.model.ResearchStudy.ResearchStudyStatusEnumFactory researchstudystatus =  new org.hl7.fhir.r4.model.ResearchStudy.ResearchStudyStatusEnumFactory();
		researchstudy.setStatus(researchstudystatus.fromCode(r.getRsrchStdySts()));

		/******************** RsrchStdy_Ttl ********************************************************************************/
		if(r.getRsrchStdyTtl() != null) {
			researchstudy.setTitle(r.getRsrchStdyTtl());
		}
		return researchstudy;
	}
}
