package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ResearchStudy;
public class ResearchStudyBidirectionalConversion 
{
	public ResearchStudy ResearchStudys(org.hl7.fhir.r4.model.ResearchStudy researchstudy) throws ParseException
	{
		 main.java.com.campfhir.model.ResearchStudy r = new  main.java.com.campfhir.model.ResearchStudy();

		/******************** id ********************************************************************************/
		researchstudy.setId(r.getId());

		/******************** researchstudystatus ********************************************************************************/
		org.hl7.fhir.r4.model.ResearchStudy.ResearchStudyStatus researchstudystatus = researchstudy.getStatus();
		r.setRsrchStdySts(researchstudystatus.toCode());

		/******************** RsrchStdy_Dscrptn ********************************************************************************/
		if(researchstudy.hasDescription()) {
			r.setRsrchStdyDscrptn(String.valueOf(researchstudy.getDescription()));
		}
		/******************** researchstudynote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation researchstudynote = researchstudy.getNoteFirstRep();

		/******************** RsrchStdy_Nt_Time ********************************************************************************/
		if(researchstudynote.hasTime()) {
			r.setRsrchStdyNtTime(String.valueOf(researchstudynote.getTime()));
		}
		/******************** RsrchStdy_Nt_AthrRfrnc ********************************************************************************/
		if(researchstudynote.hasAuthorReference()) {
			r.setRsrchStdyNtAthrRfrnc(String.valueOf(researchstudynote.getAuthorReference()));
		}
		/******************** RsrchStdy_Nt_Txt ********************************************************************************/
		if(researchstudynote.hasText()) {
			r.setRsrchStdyNtTxt(String.valueOf(researchstudynote.getText()));
		}
		/******************** RsrchStdy_Nt_AthrStrgTyp ********************************************************************************/
		if(researchstudynote.hasAuthorStringType()) {
			r.setRsrchStdyNtAthrStrgTyp(String.valueOf(researchstudynote.getAuthorStringType()));
		}
		/******************** researchstudyperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchstudyperiod = researchstudy.getPeriod();

		/******************** RsrchStdy_Prd_End ********************************************************************************/
		if(researchstudyperiod.hasEnd()) {
			r.setRsrchStdyPrdEnd(String.valueOf(researchstudyperiod.getEnd()));
		}
		/******************** RsrchStdy_Prd_Strt ********************************************************************************/
		if(researchstudyperiod.hasStart()) {
			r.setRsrchStdyPrdStrt(String.valueOf(researchstudyperiod.getStart()));
		}
		/******************** researchstudycontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail researchstudycontact = researchstudy.getContactFirstRep();

		/******************** RsrchStdy_Cntct_Nm ********************************************************************************/
		if(researchstudycontact.hasName()) {
			r.setRsrchStdyCntctNm(String.valueOf(researchstudycontact.getName()));
		}
		/******************** researchstudycontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint researchstudycontacttelecom = researchstudycontact.getTelecomFirstRep();

		/******************** RsrchStdy_Cntct_Tlcm_Vl ********************************************************************************/
		if(researchstudycontacttelecom.hasValue()) {
			r.setRsrchStdyCntctTlcmVl(String.valueOf(researchstudycontacttelecom.getValue()));
		}
		/******************** researchstudycontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem researchstudycontacttelecomsystem = researchstudycontacttelecom.getSystem();
		r.setRsrchStdyCntctTlcmSys(researchstudycontacttelecomsystem.toCode());

		/******************** researchstudycontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchstudycontacttelecomperiod = researchstudycontacttelecom.getPeriod();

		/******************** RsrchStdy_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(researchstudycontacttelecomperiod.hasEnd()) {
			r.setRsrchStdyCntctTlcmPrdEnd(String.valueOf(researchstudycontacttelecomperiod.getEnd()));
		}
		/******************** RsrchStdy_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(researchstudycontacttelecomperiod.hasStart()) {
			r.setRsrchStdyCntctTlcmPrdStrt(String.valueOf(researchstudycontacttelecomperiod.getStart()));
		}
		/******************** researchstudycontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse researchstudycontacttelecomuse = researchstudycontacttelecom.getUse();
		r.setRsrchStdyCntctTlcmUse(researchstudycontacttelecomuse.toCode());

		/******************** RsrchStdy_Cntct_Tlcm_Rnk ********************************************************************************/
		if(researchstudycontacttelecom.hasRank()) {
			r.setRsrchStdyCntctTlcmRnk(String.valueOf(researchstudycontacttelecom.getRank()));
		}
		/******************** researchstudycategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchstudycategory = researchstudy.getCategoryFirstRep();

		/******************** researchstudycategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchstudycategorycoding = researchstudycategory.getCodingFirstRep();

		/******************** RsrchStdy_Ctgry_Cdg_Dsply ********************************************************************************/
		if(researchstudycategorycoding.hasDisplay()) {
			r.setRsrchStdyCtgryCdgDsply(String.valueOf(researchstudycategorycoding.getDisplay()));
		}
		/******************** RsrchStdy_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(researchstudycategorycoding.hasVersion()) {
			r.setRsrchStdyCtgryCdgVrsn(String.valueOf(researchstudycategorycoding.getVersion()));
		}
		/******************** RsrchStdy_Ctgry_Cdg_Cd ********************************************************************************/
		if(researchstudycategorycoding.hasCode()) {
			r.setRsrchStdyCtgryCdgCd(String.valueOf(researchstudycategorycoding.getCode()));
		}
		/******************** RsrchStdy_Ctgry_Cdg_Sys ********************************************************************************/
		if(researchstudycategorycoding.hasSystem()) {
			r.setRsrchStdyCtgryCdgSys(String.valueOf(researchstudycategorycoding.getSystem()));
		}
		/******************** RsrchStdy_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(researchstudycategorycoding.hasUserSelected()) {
			r.setRsrchStdyCtgryCdgUsrSltd(String.valueOf(researchstudycategorycoding.getUserSelected()));
		}
		/******************** RsrchStdy_Ctgry_Txt ********************************************************************************/
		if(researchstudycategory.hasText()) {
			r.setRsrchStdyCtgryTxt(String.valueOf(researchstudycategory.getText()));
		}
		/******************** researchstudylocation ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchstudylocation = researchstudy.getLocationFirstRep();

		/******************** researchstudylocationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchstudylocationcoding = researchstudylocation.getCodingFirstRep();

		/******************** RsrchStdy_Lctn_Cdg_Dsply ********************************************************************************/
		if(researchstudylocationcoding.hasDisplay()) {
			r.setRsrchStdyLctnCdgDsply(String.valueOf(researchstudylocationcoding.getDisplay()));
		}
		/******************** RsrchStdy_Lctn_Cdg_Vrsn ********************************************************************************/
		if(researchstudylocationcoding.hasVersion()) {
			r.setRsrchStdyLctnCdgVrsn(String.valueOf(researchstudylocationcoding.getVersion()));
		}
		/******************** RsrchStdy_Lctn_Cdg_Cd ********************************************************************************/
		if(researchstudylocationcoding.hasCode()) {
			r.setRsrchStdyLctnCdgCd(String.valueOf(researchstudylocationcoding.getCode()));
		}
		/******************** RsrchStdy_Lctn_Cdg_Sys ********************************************************************************/
		if(researchstudylocationcoding.hasSystem()) {
			r.setRsrchStdyLctnCdgSys(String.valueOf(researchstudylocationcoding.getSystem()));
		}
		/******************** RsrchStdy_Lctn_Cdg_UsrSltd ********************************************************************************/
		if(researchstudylocationcoding.hasUserSelected()) {
			r.setRsrchStdyLctnCdgUsrSltd(String.valueOf(researchstudylocationcoding.getUserSelected()));
		}
		/******************** RsrchStdy_Lctn_Txt ********************************************************************************/
		if(researchstudylocation.hasText()) {
			r.setRsrchStdyLctnTxt(String.valueOf(researchstudylocation.getText()));
		}
		/******************** researchstudyphase ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchstudyphase = researchstudy.getPhase();

		/******************** researchstudyphasecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchstudyphasecoding = researchstudyphase.getCodingFirstRep();

		/******************** RsrchStdy_Phase_Cdg_Dsply ********************************************************************************/
		if(researchstudyphasecoding.hasDisplay()) {
			r.setRsrchStdyPhaseCdgDsply(String.valueOf(researchstudyphasecoding.getDisplay()));
		}
		/******************** RsrchStdy_Phase_Cdg_Vrsn ********************************************************************************/
		if(researchstudyphasecoding.hasVersion()) {
			r.setRsrchStdyPhaseCdgVrsn(String.valueOf(researchstudyphasecoding.getVersion()));
		}
		/******************** RsrchStdy_Phase_Cdg_Cd ********************************************************************************/
		if(researchstudyphasecoding.hasCode()) {
			r.setRsrchStdyPhaseCdgCd(String.valueOf(researchstudyphasecoding.getCode()));
		}
		/******************** RsrchStdy_Phase_Cdg_Sys ********************************************************************************/
		if(researchstudyphasecoding.hasSystem()) {
			r.setRsrchStdyPhaseCdgSys(String.valueOf(researchstudyphasecoding.getSystem()));
		}
		/******************** RsrchStdy_Phase_Cdg_UsrSltd ********************************************************************************/
		if(researchstudyphasecoding.hasUserSelected()) {
			r.setRsrchStdyPhaseCdgUsrSltd(String.valueOf(researchstudyphasecoding.getUserSelected()));
		}
		/******************** RsrchStdy_Phase_Txt ********************************************************************************/
		if(researchstudyphase.hasText()) {
			r.setRsrchStdyPhaseTxt(String.valueOf(researchstudyphase.getText()));
		}
		/******************** RsrchStdy_Ttl ********************************************************************************/
		if(researchstudy.hasTitle()) {
			r.setRsrchStdyTtl(String.valueOf(researchstudy.getTitle()));
		}
		/******************** RsrchStdy_PartOf ********************************************************************************/
		if(researchstudy.hasPartOf()) {
			r.setRsrchStdyPartOf(String.valueOf(researchstudy.getPartOfFirstRep()));
		}
		/******************** researchstudykeyword ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchstudykeyword = researchstudy.getKeywordFirstRep();

		/******************** researchstudykeywordcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchstudykeywordcoding = researchstudykeyword.getCodingFirstRep();

		/******************** RsrchStdy_Keyword_Cdg_Dsply ********************************************************************************/
		if(researchstudykeywordcoding.hasDisplay()) {
			r.setRsrchStdyKeywordCdgDsply(String.valueOf(researchstudykeywordcoding.getDisplay()));
		}
		/******************** RsrchStdy_Keyword_Cdg_Vrsn ********************************************************************************/
		if(researchstudykeywordcoding.hasVersion()) {
			r.setRsrchStdyKeywordCdgVrsn(String.valueOf(researchstudykeywordcoding.getVersion()));
		}
		/******************** RsrchStdy_Keyword_Cdg_Cd ********************************************************************************/
		if(researchstudykeywordcoding.hasCode()) {
			r.setRsrchStdyKeywordCdgCd(String.valueOf(researchstudykeywordcoding.getCode()));
		}
		/******************** RsrchStdy_Keyword_Cdg_Sys ********************************************************************************/
		if(researchstudykeywordcoding.hasSystem()) {
			r.setRsrchStdyKeywordCdgSys(String.valueOf(researchstudykeywordcoding.getSystem()));
		}
		/******************** RsrchStdy_Keyword_Cdg_UsrSltd ********************************************************************************/
		if(researchstudykeywordcoding.hasUserSelected()) {
			r.setRsrchStdyKeywordCdgUsrSltd(String.valueOf(researchstudykeywordcoding.getUserSelected()));
		}
		/******************** RsrchStdy_Keyword_Txt ********************************************************************************/
		if(researchstudykeyword.hasText()) {
			r.setRsrchStdyKeywordTxt(String.valueOf(researchstudykeyword.getText()));
		}
		/******************** researchstudyfocus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchstudyfocus = researchstudy.getFocusFirstRep();

		/******************** researchstudyfocuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchstudyfocuscoding = researchstudyfocus.getCodingFirstRep();

		/******************** RsrchStdy_Focus_Cdg_Dsply ********************************************************************************/
		if(researchstudyfocuscoding.hasDisplay()) {
			r.setRsrchStdyFocusCdgDsply(String.valueOf(researchstudyfocuscoding.getDisplay()));
		}
		/******************** RsrchStdy_Focus_Cdg_Vrsn ********************************************************************************/
		if(researchstudyfocuscoding.hasVersion()) {
			r.setRsrchStdyFocusCdgVrsn(String.valueOf(researchstudyfocuscoding.getVersion()));
		}
		/******************** RsrchStdy_Focus_Cdg_Cd ********************************************************************************/
		if(researchstudyfocuscoding.hasCode()) {
			r.setRsrchStdyFocusCdgCd(String.valueOf(researchstudyfocuscoding.getCode()));
		}
		/******************** RsrchStdy_Focus_Cdg_Sys ********************************************************************************/
		if(researchstudyfocuscoding.hasSystem()) {
			r.setRsrchStdyFocusCdgSys(String.valueOf(researchstudyfocuscoding.getSystem()));
		}
		/******************** RsrchStdy_Focus_Cdg_UsrSltd ********************************************************************************/
		if(researchstudyfocuscoding.hasUserSelected()) {
			r.setRsrchStdyFocusCdgUsrSltd(String.valueOf(researchstudyfocuscoding.getUserSelected()));
		}
		/******************** RsrchStdy_Focus_Txt ********************************************************************************/
		if(researchstudyfocus.hasText()) {
			r.setRsrchStdyFocusTxt(String.valueOf(researchstudyfocus.getText()));
		}
		/******************** researchstudyreasonstopped ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchstudyreasonstopped = researchstudy.getReasonStopped();

		/******************** researchstudyreasonstoppedcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchstudyreasonstoppedcoding = researchstudyreasonstopped.getCodingFirstRep();

		/******************** RsrchStdy_RsnStopped_Cdg_Dsply ********************************************************************************/
		if(researchstudyreasonstoppedcoding.hasDisplay()) {
			r.setRsrchStdyRsnStoppedCdgDsply(String.valueOf(researchstudyreasonstoppedcoding.getDisplay()));
		}
		/******************** RsrchStdy_RsnStopped_Cdg_Vrsn ********************************************************************************/
		if(researchstudyreasonstoppedcoding.hasVersion()) {
			r.setRsrchStdyRsnStoppedCdgVrsn(String.valueOf(researchstudyreasonstoppedcoding.getVersion()));
		}
		/******************** RsrchStdy_RsnStopped_Cdg_Cd ********************************************************************************/
		if(researchstudyreasonstoppedcoding.hasCode()) {
			r.setRsrchStdyRsnStoppedCdgCd(String.valueOf(researchstudyreasonstoppedcoding.getCode()));
		}
		/******************** RsrchStdy_RsnStopped_Cdg_Sys ********************************************************************************/
		if(researchstudyreasonstoppedcoding.hasSystem()) {
			r.setRsrchStdyRsnStoppedCdgSys(String.valueOf(researchstudyreasonstoppedcoding.getSystem()));
		}
		/******************** RsrchStdy_RsnStopped_Cdg_UsrSltd ********************************************************************************/
		if(researchstudyreasonstoppedcoding.hasUserSelected()) {
			r.setRsrchStdyRsnStoppedCdgUsrSltd(String.valueOf(researchstudyreasonstoppedcoding.getUserSelected()));
		}
		/******************** RsrchStdy_RsnStopped_Txt ********************************************************************************/
		if(researchstudyreasonstopped.hasText()) {
			r.setRsrchStdyRsnStoppedTxt(String.valueOf(researchstudyreasonstopped.getText()));
		}
		/******************** RsrchStdy_Site ********************************************************************************/
		if(researchstudy.hasSite()) {
			r.setRsrchStdySite(String.valueOf(researchstudy.getSiteFirstRep()));
		}
		/******************** RsrchStdy_Sponsor ********************************************************************************/
		if(researchstudy.hasSponsor()) {
			r.setRsrchStdySponsor(String.valueOf(researchstudy.getSponsor()));
		}
		/******************** researchstudyarm ********************************************************************************/
		org.hl7.fhir.r4.model.ResearchStudy.ResearchStudyArmComponent researchstudyarm = researchstudy.getArmFirstRep();

		/******************** RsrchStdy_Arm_Nm ********************************************************************************/
		if(researchstudyarm.hasName()) {
			r.setRsrchStdyArmNm(String.valueOf(researchstudyarm.getName()));
		}
		/******************** researchstudyarmtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchstudyarmtype = researchstudyarm.getType();

		/******************** researchstudyarmtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchstudyarmtypecoding = researchstudyarmtype.getCodingFirstRep();

		/******************** RsrchStdy_Arm_Typ_Cdg_Dsply ********************************************************************************/
		if(researchstudyarmtypecoding.hasDisplay()) {
			r.setRsrchStdyArmTypCdgDsply(String.valueOf(researchstudyarmtypecoding.getDisplay()));
		}
		/******************** RsrchStdy_Arm_Typ_Cdg_Vrsn ********************************************************************************/
		if(researchstudyarmtypecoding.hasVersion()) {
			r.setRsrchStdyArmTypCdgVrsn(String.valueOf(researchstudyarmtypecoding.getVersion()));
		}
		/******************** RsrchStdy_Arm_Typ_Cdg_Cd ********************************************************************************/
		if(researchstudyarmtypecoding.hasCode()) {
			r.setRsrchStdyArmTypCdgCd(String.valueOf(researchstudyarmtypecoding.getCode()));
		}
		/******************** RsrchStdy_Arm_Typ_Cdg_Sys ********************************************************************************/
		if(researchstudyarmtypecoding.hasSystem()) {
			r.setRsrchStdyArmTypCdgSys(String.valueOf(researchstudyarmtypecoding.getSystem()));
		}
		/******************** RsrchStdy_Arm_Typ_Cdg_UsrSltd ********************************************************************************/
		if(researchstudyarmtypecoding.hasUserSelected()) {
			r.setRsrchStdyArmTypCdgUsrSltd(String.valueOf(researchstudyarmtypecoding.getUserSelected()));
		}
		/******************** RsrchStdy_Arm_Typ_Txt ********************************************************************************/
		if(researchstudyarmtype.hasText()) {
			r.setRsrchStdyArmTypTxt(String.valueOf(researchstudyarmtype.getText()));
		}
		/******************** RsrchStdy_Arm_Dscrptn ********************************************************************************/
		if(researchstudyarm.hasDescription()) {
			r.setRsrchStdyArmDscrptn(String.valueOf(researchstudyarm.getDescription()));
		}
		/******************** researchstudyidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier researchstudyidentifier = researchstudy.getIdentifierFirstRep();

		/******************** RsrchStdy_Id_Vl ********************************************************************************/
		if(researchstudyidentifier.hasValue()) {
			r.setRsrchStdyIdVl(String.valueOf(researchstudyidentifier.getValue()));
		}
		/******************** researchstudyidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchstudyidentifiertype = researchstudyidentifier.getType();

		/******************** researchstudyidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchstudyidentifiertypecoding = researchstudyidentifiertype.getCodingFirstRep();

		/******************** RsrchStdy_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(researchstudyidentifiertypecoding.hasDisplay()) {
			r.setRsrchStdyIdTypCdgDsply(String.valueOf(researchstudyidentifiertypecoding.getDisplay()));
		}
		/******************** RsrchStdy_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(researchstudyidentifiertypecoding.hasVersion()) {
			r.setRsrchStdyIdTypCdgVrsn(String.valueOf(researchstudyidentifiertypecoding.getVersion()));
		}
		/******************** RsrchStdy_Id_Typ_Cdg_Cd ********************************************************************************/
		if(researchstudyidentifiertypecoding.hasCode()) {
			r.setRsrchStdyIdTypCdgCd(String.valueOf(researchstudyidentifiertypecoding.getCode()));
		}
		/******************** RsrchStdy_Id_Typ_Cdg_Sys ********************************************************************************/
		if(researchstudyidentifiertypecoding.hasSystem()) {
			r.setRsrchStdyIdTypCdgSys(String.valueOf(researchstudyidentifiertypecoding.getSystem()));
		}
		/******************** RsrchStdy_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(researchstudyidentifiertypecoding.hasUserSelected()) {
			r.setRsrchStdyIdTypCdgUsrSltd(String.valueOf(researchstudyidentifiertypecoding.getUserSelected()));
		}
		/******************** RsrchStdy_Id_Typ_Txt ********************************************************************************/
		if(researchstudyidentifiertype.hasText()) {
			r.setRsrchStdyIdTypTxt(String.valueOf(researchstudyidentifiertype.getText()));
		}
		/******************** RsrchStdy_Id_Sys ********************************************************************************/
		if(researchstudyidentifier.hasSystem()) {
			r.setRsrchStdyIdSys(String.valueOf(researchstudyidentifier.getSystem()));
		}
		/******************** RsrchStdy_Id_Assigner ********************************************************************************/
		if(researchstudyidentifier.hasAssigner()) {
			r.setRsrchStdyIdAssigner(String.valueOf(researchstudyidentifier.getAssigner()));
		}
		/******************** researchstudyidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchstudyidentifierperiod = researchstudyidentifier.getPeriod();

		/******************** RsrchStdy_Id_Prd_End ********************************************************************************/
		if(researchstudyidentifierperiod.hasEnd()) {
			r.setRsrchStdyIdPrdEnd(String.valueOf(researchstudyidentifierperiod.getEnd()));
		}
		/******************** RsrchStdy_Id_Prd_Strt ********************************************************************************/
		if(researchstudyidentifierperiod.hasStart()) {
			r.setRsrchStdyIdPrdStrt(String.valueOf(researchstudyidentifierperiod.getStart()));
		}
		/******************** researchstudyidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse researchstudyidentifieruse = researchstudyidentifier.getUse();
		r.setRsrchStdyIdUse(researchstudyidentifieruse.toCode());

		/******************** RsrchStdy_Enrollment ********************************************************************************/
		if(researchstudy.hasEnrollment()) {
			r.setRsrchStdyEnrollment(String.valueOf(researchstudy.getEnrollmentFirstRep()));
		}
		/******************** RsrchStdy_Protocol ********************************************************************************/
		if(researchstudy.hasProtocol()) {
			r.setRsrchStdyProtocol(String.valueOf(researchstudy.getProtocolFirstRep()));
		}
		/******************** researchstudyprimarypurposetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchstudyprimarypurposetype = researchstudy.getPrimaryPurposeType();

		/******************** researchstudyprimarypurposetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchstudyprimarypurposetypecoding = researchstudyprimarypurposetype.getCodingFirstRep();

		/******************** RsrchStdy_PrimaryPrpseTyp_Cdg_Dsply ********************************************************************************/
		if(researchstudyprimarypurposetypecoding.hasDisplay()) {
			r.setRsrchStdyPrimaryPrpseTypCdgDsply(String.valueOf(researchstudyprimarypurposetypecoding.getDisplay()));
		}
		/******************** RsrchStdy_PrimaryPrpseTyp_Cdg_Vrsn ********************************************************************************/
		if(researchstudyprimarypurposetypecoding.hasVersion()) {
			r.setRsrchStdyPrimaryPrpseTypCdgVrsn(String.valueOf(researchstudyprimarypurposetypecoding.getVersion()));
		}
		/******************** RsrchStdy_PrimaryPrpseTyp_Cdg_Cd ********************************************************************************/
		if(researchstudyprimarypurposetypecoding.hasCode()) {
			r.setRsrchStdyPrimaryPrpseTypCdgCd(String.valueOf(researchstudyprimarypurposetypecoding.getCode()));
		}
		/******************** RsrchStdy_PrimaryPrpseTyp_Cdg_Sys ********************************************************************************/
		if(researchstudyprimarypurposetypecoding.hasSystem()) {
			r.setRsrchStdyPrimaryPrpseTypCdgSys(String.valueOf(researchstudyprimarypurposetypecoding.getSystem()));
		}
		/******************** RsrchStdy_PrimaryPrpseTyp_Cdg_UsrSltd ********************************************************************************/
		if(researchstudyprimarypurposetypecoding.hasUserSelected()) {
			r.setRsrchStdyPrimaryPrpseTypCdgUsrSltd(String.valueOf(researchstudyprimarypurposetypecoding.getUserSelected()));
		}
		/******************** RsrchStdy_PrimaryPrpseTyp_Txt ********************************************************************************/
		if(researchstudyprimarypurposetype.hasText()) {
			r.setRsrchStdyPrimaryPrpseTypTxt(String.valueOf(researchstudyprimarypurposetype.getText()));
		}
		/******************** researchstudycondition ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchstudycondition = researchstudy.getConditionFirstRep();

		/******************** researchstudyconditioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchstudyconditioncoding = researchstudycondition.getCodingFirstRep();

		/******************** RsrchStdy_Cndtn_Cdg_Dsply ********************************************************************************/
		if(researchstudyconditioncoding.hasDisplay()) {
			r.setRsrchStdyCndtnCdgDsply(String.valueOf(researchstudyconditioncoding.getDisplay()));
		}
		/******************** RsrchStdy_Cndtn_Cdg_Vrsn ********************************************************************************/
		if(researchstudyconditioncoding.hasVersion()) {
			r.setRsrchStdyCndtnCdgVrsn(String.valueOf(researchstudyconditioncoding.getVersion()));
		}
		/******************** RsrchStdy_Cndtn_Cdg_Cd ********************************************************************************/
		if(researchstudyconditioncoding.hasCode()) {
			r.setRsrchStdyCndtnCdgCd(String.valueOf(researchstudyconditioncoding.getCode()));
		}
		/******************** RsrchStdy_Cndtn_Cdg_Sys ********************************************************************************/
		if(researchstudyconditioncoding.hasSystem()) {
			r.setRsrchStdyCndtnCdgSys(String.valueOf(researchstudyconditioncoding.getSystem()));
		}
		/******************** RsrchStdy_Cndtn_Cdg_UsrSltd ********************************************************************************/
		if(researchstudyconditioncoding.hasUserSelected()) {
			r.setRsrchStdyCndtnCdgUsrSltd(String.valueOf(researchstudyconditioncoding.getUserSelected()));
		}
		/******************** RsrchStdy_Cndtn_Txt ********************************************************************************/
		if(researchstudycondition.hasText()) {
			r.setRsrchStdyCndtnTxt(String.valueOf(researchstudycondition.getText()));
		}
		/******************** researchstudyrelatedartifact ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact researchstudyrelatedartifact = researchstudy.getRelatedArtifactFirstRep();

		/******************** RsrchStdy_RltedArtfct_Rsrc ********************************************************************************/
		if(researchstudyrelatedartifact.hasResource()) {
			r.setRsrchStdyRltedArtfctRsrc(String.valueOf(researchstudyrelatedartifact.getResource()));
		}
		/******************** researchstudyrelatedartifacttype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactType researchstudyrelatedartifacttype = researchstudyrelatedartifact.getType();
		r.setRsrchStdyRltedArtfctTyp(researchstudyrelatedartifacttype.toCode());

		/******************** RsrchStdy_RltedArtfct_Url ********************************************************************************/
		if(researchstudyrelatedartifact.hasUrl()) {
			r.setRsrchStdyRltedArtfctUrl(String.valueOf(researchstudyrelatedartifact.getUrl()));
		}
		/******************** RsrchStdy_RltedArtfct_Lbl ********************************************************************************/
		if(researchstudyrelatedartifact.hasLabel()) {
			r.setRsrchStdyRltedArtfctLbl(String.valueOf(researchstudyrelatedartifact.getLabel()));
		}
		/******************** RsrchStdy_RltedArtfct_Citation ********************************************************************************/
		if(researchstudyrelatedartifact.hasCitation()) {
			r.setRsrchStdyRltedArtfctCitation(String.valueOf(researchstudyrelatedartifact.getCitation()));
		}
		/******************** researchstudyrelatedartifactdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment researchstudyrelatedartifactdocument = researchstudyrelatedartifact.getDocument();

		/******************** RsrchStdy_RltedArtfct_Doc_Sz ********************************************************************************/
		if(researchstudyrelatedartifactdocument.hasSize()) {
			r.setRsrchStdyRltedArtfctDocSz(String.valueOf(researchstudyrelatedartifactdocument.getSize()));
		}
		/******************** RsrchStdy_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(researchstudyrelatedartifactdocument.hasLanguage()) {
			r.setRsrchStdyRltedArtfctDocLnguage(String.valueOf(researchstudyrelatedartifactdocument.getLanguage()));
		}
		/******************** RsrchStdy_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(researchstudyrelatedartifactdocument.hasContentType()) {
			r.setRsrchStdyRltedArtfctDocCntntTyp(String.valueOf(researchstudyrelatedartifactdocument.getContentType()));
		}
		/******************** RsrchStdy_RltedArtfct_Doc_Url ********************************************************************************/
		if(researchstudyrelatedartifactdocument.hasUrl()) {
			r.setRsrchStdyRltedArtfctDocUrl(String.valueOf(researchstudyrelatedartifactdocument.getUrl()));
		}
		/******************** RsrchStdy_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(researchstudyrelatedartifactdocument.hasTitle()) {
			r.setRsrchStdyRltedArtfctDocTtl(String.valueOf(researchstudyrelatedartifactdocument.getTitle()));
		}
		/******************** RsrchStdy_RltedArtfct_Doc_Hash ********************************************************************************/
		if(researchstudyrelatedartifactdocument.hasHash()) {
			r.setRsrchStdyRltedArtfctDocHash(String.valueOf(researchstudyrelatedartifactdocument.getHash()));
		}

		/******************** RsrchStdy_RltedArtfct_Doc_Data ********************************************************************************/
		if(researchstudyrelatedartifactdocument.hasData()) {
			r.setRsrchStdyRltedArtfctDocData(String.valueOf(researchstudyrelatedartifactdocument.getData()));
		}

		/******************** RsrchStdy_RltedArtfct_Doc_Creation ********************************************************************************/
		if(researchstudyrelatedartifactdocument.hasCreation()) {
			r.setRsrchStdyRltedArtfctDocCreation(String.valueOf(researchstudyrelatedartifactdocument.getCreation()));
		}
		/******************** RsrchStdy_PrincipalInvestigator ********************************************************************************/
		if(researchstudy.hasPrincipalInvestigator()) {
			r.setRsrchStdyPrincipalInvestigator(String.valueOf(researchstudy.getPrincipalInvestigator()));
		}
		/******************** researchstudyobjective ********************************************************************************/
		org.hl7.fhir.r4.model.ResearchStudy.ResearchStudyObjectiveComponent researchstudyobjective = researchstudy.getObjectiveFirstRep();

		/******************** RsrchStdy_Objective_Nm ********************************************************************************/
		if(researchstudyobjective.hasName()) {
			r.setRsrchStdyObjectiveNm(String.valueOf(researchstudyobjective.getName()));
		}
		/******************** researchstudyobjectivetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchstudyobjectivetype = researchstudyobjective.getType();

		/******************** researchstudyobjectivetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchstudyobjectivetypecoding = researchstudyobjectivetype.getCodingFirstRep();

		/******************** RsrchStdy_Objective_Typ_Cdg_Dsply ********************************************************************************/
		if(researchstudyobjectivetypecoding.hasDisplay()) {
			r.setRsrchStdyObjectiveTypCdgDsply(String.valueOf(researchstudyobjectivetypecoding.getDisplay()));
		}
		/******************** RsrchStdy_Objective_Typ_Cdg_Vrsn ********************************************************************************/
		if(researchstudyobjectivetypecoding.hasVersion()) {
			r.setRsrchStdyObjectiveTypCdgVrsn(String.valueOf(researchstudyobjectivetypecoding.getVersion()));
		}
		/******************** RsrchStdy_Objective_Typ_Cdg_Cd ********************************************************************************/
		if(researchstudyobjectivetypecoding.hasCode()) {
			r.setRsrchStdyObjectiveTypCdgCd(String.valueOf(researchstudyobjectivetypecoding.getCode()));
		}
		/******************** RsrchStdy_Objective_Typ_Cdg_Sys ********************************************************************************/
		if(researchstudyobjectivetypecoding.hasSystem()) {
			r.setRsrchStdyObjectiveTypCdgSys(String.valueOf(researchstudyobjectivetypecoding.getSystem()));
		}
		/******************** RsrchStdy_Objective_Typ_Cdg_UsrSltd ********************************************************************************/
		if(researchstudyobjectivetypecoding.hasUserSelected()) {
			r.setRsrchStdyObjectiveTypCdgUsrSltd(String.valueOf(researchstudyobjectivetypecoding.getUserSelected()));
		}
		/******************** RsrchStdy_Objective_Typ_Txt ********************************************************************************/
		if(researchstudyobjectivetype.hasText()) {
			r.setRsrchStdyObjectiveTypTxt(String.valueOf(researchstudyobjectivetype.getText()));
		}
		return r;
	}
}
