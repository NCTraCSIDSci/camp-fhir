package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.NamingSystem;
public class NamingSystemBidirectionalConversion 
{
	public NamingSystem NamingSystems(org.hl7.fhir.r4.model.NamingSystem namingsystem) throws ParseException
	{
		 main.java.com.campfhir.model.NamingSystem n = new  main.java.com.campfhir.model.NamingSystem();

		/******************** id ********************************************************************************/
		namingsystem.setId(n.getId());

		/******************** NmingSys_Nm ********************************************************************************/
		if(namingsystem.hasName()) {
			n.setNmingSysNm(String.valueOf(namingsystem.getName()));
		}
		/******************** namingsystemtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept namingsystemtype = namingsystem.getType();

		/******************** NmingSys_Typ_Txt ********************************************************************************/
		if(namingsystemtype.hasText()) {
			n.setNmingSysTypTxt(String.valueOf(namingsystemtype.getText()));
		}
		/******************** namingsystemtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding namingsystemtypecoding = namingsystemtype.getCodingFirstRep();

		/******************** NmingSys_Typ_Cdg_Vrsn ********************************************************************************/
		if(namingsystemtypecoding.hasVersion()) {
			n.setNmingSysTypCdgVrsn(String.valueOf(namingsystemtypecoding.getVersion()));
		}
		/******************** NmingSys_Typ_Cdg_Dsply ********************************************************************************/
		if(namingsystemtypecoding.hasDisplay()) {
			n.setNmingSysTypCdgDsply(String.valueOf(namingsystemtypecoding.getDisplay()));
		}
		/******************** NmingSys_Typ_Cdg_Cd ********************************************************************************/
		if(namingsystemtypecoding.hasCode()) {
			n.setNmingSysTypCdgCd(String.valueOf(namingsystemtypecoding.getCode()));
		}
		/******************** NmingSys_Typ_Cdg_UsrSltd ********************************************************************************/
		if(namingsystemtypecoding.hasUserSelected()) {
			n.setNmingSysTypCdgUsrSltd(String.valueOf(namingsystemtypecoding.getUserSelected()));
		}
		/******************** NmingSys_Typ_Cdg_Sys ********************************************************************************/
		if(namingsystemtypecoding.hasSystem()) {
			n.setNmingSysTypCdgSys(String.valueOf(namingsystemtypecoding.getSystem()));
		}
		/******************** NmingSys_Dt ********************************************************************************/
		if(namingsystem.hasDate()) {
			n.setNmingSysDt(String.valueOf(namingsystem.getDate()));
		}
		/******************** namingsystemstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus namingsystemstatus = namingsystem.getStatus();
		n.setNmingSysSts(namingsystemstatus.toCode());

		/******************** NmingSys_Dscrptn ********************************************************************************/
		if(namingsystem.hasDescription()) {
			n.setNmingSysDscrptn(String.valueOf(namingsystem.getDescription()));
		}
		/******************** NmingSys_Responsible ********************************************************************************/
		if(namingsystem.hasResponsible()) {
			n.setNmingSysResponsible(String.valueOf(namingsystem.getResponsible()));
		}
		/******************** NmingSys_Pblshr ********************************************************************************/
		if(namingsystem.hasPublisher()) {
			n.setNmingSysPblshr(String.valueOf(namingsystem.getPublisher()));
		}
		/******************** namingsystemuniqueid ********************************************************************************/
		org.hl7.fhir.r4.model.NamingSystem.NamingSystemUniqueIdComponent namingsystemuniqueid = namingsystem.getUniqueIdFirstRep();

		/******************** NmingSys_UniqueId_Vl ********************************************************************************/
		if(namingsystemuniqueid.hasValue()) {
			n.setNmingSysUniqueIdVl(String.valueOf(namingsystemuniqueid.getValue()));
		}
		/******************** namingsystemuniqueidtype ********************************************************************************/
		org.hl7.fhir.r4.model.NamingSystem.NamingSystemIdentifierType namingsystemuniqueidtype = namingsystemuniqueid.getType();
		n.setNmingSysUniqueIdTyp(namingsystemuniqueidtype.toCode());

		/******************** NmingSys_UniqueId_Comment ********************************************************************************/
		if(namingsystemuniqueid.hasComment()) {
			n.setNmingSysUniqueIdComment(String.valueOf(namingsystemuniqueid.getComment()));
		}
		/******************** namingsystemuniqueidperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period namingsystemuniqueidperiod = namingsystemuniqueid.getPeriod();

		/******************** NmingSys_UniqueId_Prd_Strt ********************************************************************************/
		if(namingsystemuniqueidperiod.hasStart()) {
			n.setNmingSysUniqueIdPrdStrt(String.valueOf(namingsystemuniqueidperiod.getStart()));
		}
		/******************** NmingSys_UniqueId_Prd_End ********************************************************************************/
		if(namingsystemuniqueidperiod.hasEnd()) {
			n.setNmingSysUniqueIdPrdEnd(String.valueOf(namingsystemuniqueidperiod.getEnd()));
		}
		/******************** NmingSys_UniqueId_Preferred ********************************************************************************/
		if(namingsystemuniqueid.hasPreferred()) {
			n.setNmingSysUniqueIdPreferred(String.valueOf(namingsystemuniqueid.getPreferred()));
		}
		/******************** namingsystemcontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail namingsystemcontact = namingsystem.getContactFirstRep();

		/******************** NmingSys_Cntct_Nm ********************************************************************************/
		if(namingsystemcontact.hasName()) {
			n.setNmingSysCntctNm(String.valueOf(namingsystemcontact.getName()));
		}
		/******************** namingsystemcontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint namingsystemcontacttelecom = namingsystemcontact.getTelecomFirstRep();

		/******************** NmingSys_Cntct_Tlcm_Vl ********************************************************************************/
		if(namingsystemcontacttelecom.hasValue()) {
			n.setNmingSysCntctTlcmVl(String.valueOf(namingsystemcontacttelecom.getValue()));
		}
		/******************** namingsystemcontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period namingsystemcontacttelecomperiod = namingsystemcontacttelecom.getPeriod();

		/******************** NmingSys_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(namingsystemcontacttelecomperiod.hasStart()) {
			n.setNmingSysCntctTlcmPrdStrt(String.valueOf(namingsystemcontacttelecomperiod.getStart()));
		}
		/******************** NmingSys_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(namingsystemcontacttelecomperiod.hasEnd()) {
			n.setNmingSysCntctTlcmPrdEnd(String.valueOf(namingsystemcontacttelecomperiod.getEnd()));
		}
		/******************** namingsystemcontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem namingsystemcontacttelecomsystem = namingsystemcontacttelecom.getSystem();
		n.setNmingSysCntctTlcmSys(namingsystemcontacttelecomsystem.toCode());

		/******************** namingsystemcontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse namingsystemcontacttelecomuse = namingsystemcontacttelecom.getUse();
		n.setNmingSysCntctTlcmUse(namingsystemcontacttelecomuse.toCode());

		/******************** NmingSys_Cntct_Tlcm_Rnk ********************************************************************************/
		if(namingsystemcontacttelecom.hasRank()) {
			n.setNmingSysCntctTlcmRnk(String.valueOf(namingsystemcontacttelecom.getRank()));
		}
		/******************** NmingSys_Usg ********************************************************************************/
		if(namingsystem.hasUsage()) {
			n.setNmingSysUsg(String.valueOf(namingsystem.getUsage()));
		}
		/******************** namingsystemkind ********************************************************************************/
		org.hl7.fhir.r4.model.NamingSystem.NamingSystemType namingsystemkind = namingsystem.getKind();
		n.setNmingSysKind(namingsystemkind.toCode());

		/******************** namingsystemusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext namingsystemusecontext = namingsystem.getUseContextFirstRep();

		/******************** namingsystemusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding namingsystemusecontextcode = namingsystemusecontext.getCode();

		/******************** NmingSys_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(namingsystemusecontextcode.hasVersion()) {
			n.setNmingSysUseCntxtCdVrsn(String.valueOf(namingsystemusecontextcode.getVersion()));
		}
		/******************** NmingSys_UseCntxt_Cd_Dsply ********************************************************************************/
		if(namingsystemusecontextcode.hasDisplay()) {
			n.setNmingSysUseCntxtCdDsply(String.valueOf(namingsystemusecontextcode.getDisplay()));
		}
		/******************** NmingSys_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(namingsystemusecontextcode.hasUserSelected()) {
			n.setNmingSysUseCntxtCdUsrSltd(String.valueOf(namingsystemusecontextcode.getUserSelected()));
		}
		/******************** NmingSys_UseCntxt_Cd_Sys ********************************************************************************/
		if(namingsystemusecontextcode.hasSystem()) {
			n.setNmingSysUseCntxtCdSys(String.valueOf(namingsystemusecontextcode.getSystem()));
		}
		/******************** namingsystemusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept namingsystemusecontextvaluecodeableconcept = namingsystemusecontext.getValueCodeableConcept();

		/******************** NmingSys_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(namingsystemusecontextvaluecodeableconcept.hasText()) {
			n.setNmingSysUseCntxtVlCdbleCncptTxt(String.valueOf(namingsystemusecontextvaluecodeableconcept.getText()));
		}
		/******************** namingsystemusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding namingsystemusecontextvaluecodeableconceptcoding = namingsystemusecontextvaluecodeableconcept.getCodingFirstRep();

		/******************** NmingSys_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(namingsystemusecontextvaluecodeableconceptcoding.hasVersion()) {
			n.setNmingSysUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(namingsystemusecontextvaluecodeableconceptcoding.getVersion()));
		}
		/******************** NmingSys_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(namingsystemusecontextvaluecodeableconceptcoding.hasDisplay()) {
			n.setNmingSysUseCntxtVlCdbleCncptCdgDsply(String.valueOf(namingsystemusecontextvaluecodeableconceptcoding.getDisplay()));
		}
		/******************** NmingSys_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(namingsystemusecontextvaluecodeableconceptcoding.hasCode()) {
			n.setNmingSysUseCntxtVlCdbleCncptCdgCd(String.valueOf(namingsystemusecontextvaluecodeableconceptcoding.getCode()));
		}
		/******************** NmingSys_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(namingsystemusecontextvaluecodeableconceptcoding.hasUserSelected()) {
			n.setNmingSysUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(namingsystemusecontextvaluecodeableconceptcoding.getUserSelected()));
		}
		/******************** NmingSys_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(namingsystemusecontextvaluecodeableconceptcoding.hasSystem()) {
			n.setNmingSysUseCntxtVlCdbleCncptCdgSys(String.valueOf(namingsystemusecontextvaluecodeableconceptcoding.getSystem()));
		}
		/******************** namingsystemusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity namingsystemusecontextvaluequantity = namingsystemusecontext.getValueQuantity();

		/******************** NmingSys_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(namingsystemusecontextvaluequantity.hasValue()) {
			n.setNmingSysUseCntxtVlQntyVl(String.valueOf(namingsystemusecontextvaluequantity.getValue()));
		}
		/******************** namingsystemusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator namingsystemusecontextvaluequantitycomparator = namingsystemusecontextvaluequantity.getComparator();
		n.setNmingSysUseCntxtVlQntyCmprtr(namingsystemusecontextvaluequantitycomparator.toCode());

		/******************** NmingSys_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(namingsystemusecontextvaluequantity.hasCode()) {
			n.setNmingSysUseCntxtVlQntyCd(String.valueOf(namingsystemusecontextvaluequantity.getCode()));
		}
		/******************** NmingSys_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(namingsystemusecontextvaluequantity.hasUnit()) {
			n.setNmingSysUseCntxtVlQntyUnt(String.valueOf(namingsystemusecontextvaluequantity.getUnit()));
		}
		/******************** NmingSys_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(namingsystemusecontextvaluequantity.hasSystem()) {
			n.setNmingSysUseCntxtVlQntySys(String.valueOf(namingsystemusecontextvaluequantity.getSystem()));
		}
		/******************** namingsystemusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range namingsystemusecontextvaluerange = namingsystemusecontext.getValueRange();

		/******************** namingsystemusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity namingsystemusecontextvaluerangelow = namingsystemusecontextvaluerange.getLow();

		/******************** NmingSys_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(namingsystemusecontextvaluerangelow.hasValue()) {
			n.setNmingSysUseCntxtVlRngLwVl(String.valueOf(namingsystemusecontextvaluerangelow.getValue()));
		}
		/******************** namingsystemusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator namingsystemusecontextvaluerangelowcomparator = namingsystemusecontextvaluerangelow.getComparator();
		n.setNmingSysUseCntxtVlRngLwCmprtr(namingsystemusecontextvaluerangelowcomparator.toCode());

		/******************** NmingSys_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(namingsystemusecontextvaluerangelow.hasCode()) {
			n.setNmingSysUseCntxtVlRngLwCd(String.valueOf(namingsystemusecontextvaluerangelow.getCode()));
		}
		/******************** NmingSys_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(namingsystemusecontextvaluerangelow.hasUnit()) {
			n.setNmingSysUseCntxtVlRngLwUnt(String.valueOf(namingsystemusecontextvaluerangelow.getUnit()));
		}
		/******************** NmingSys_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(namingsystemusecontextvaluerangelow.hasSystem()) {
			n.setNmingSysUseCntxtVlRngLwSys(String.valueOf(namingsystemusecontextvaluerangelow.getSystem()));
		}
		/******************** namingsystemusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity namingsystemusecontextvaluerangehigh = namingsystemusecontextvaluerange.getHigh();

		/******************** NmingSys_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(namingsystemusecontextvaluerangehigh.hasValue()) {
			n.setNmingSysUseCntxtVlRngHiVl(String.valueOf(namingsystemusecontextvaluerangehigh.getValue()));
		}
		/******************** namingsystemusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator namingsystemusecontextvaluerangehighcomparator = namingsystemusecontextvaluerangehigh.getComparator();
		n.setNmingSysUseCntxtVlRngHiCmprtr(namingsystemusecontextvaluerangehighcomparator.toCode());

		/******************** NmingSys_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(namingsystemusecontextvaluerangehigh.hasCode()) {
			n.setNmingSysUseCntxtVlRngHiCd(String.valueOf(namingsystemusecontextvaluerangehigh.getCode()));
		}
		/******************** NmingSys_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(namingsystemusecontextvaluerangehigh.hasUnit()) {
			n.setNmingSysUseCntxtVlRngHiUnt(String.valueOf(namingsystemusecontextvaluerangehigh.getUnit()));
		}
		/******************** NmingSys_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(namingsystemusecontextvaluerangehigh.hasSystem()) {
			n.setNmingSysUseCntxtVlRngHiSys(String.valueOf(namingsystemusecontextvaluerangehigh.getSystem()));
		}
		/******************** NmingSys_UseCntxt_VlRfrnc ********************************************************************************/
		if(namingsystemusecontext.hasValueReference()) {
			n.setNmingSysUseCntxtVlRfrnc(String.valueOf(namingsystemusecontext.getValueReference()));
		}
		/******************** namingsystemjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept namingsystemjurisdiction = namingsystem.getJurisdictionFirstRep();

		/******************** NmingSys_Jrsdctn_Txt ********************************************************************************/
		if(namingsystemjurisdiction.hasText()) {
			n.setNmingSysJrsdctnTxt(String.valueOf(namingsystemjurisdiction.getText()));
		}
		/******************** namingsystemjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding namingsystemjurisdictioncoding = namingsystemjurisdiction.getCodingFirstRep();

		/******************** NmingSys_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(namingsystemjurisdictioncoding.hasVersion()) {
			n.setNmingSysJrsdctnCdgVrsn(String.valueOf(namingsystemjurisdictioncoding.getVersion()));
		}
		/******************** NmingSys_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(namingsystemjurisdictioncoding.hasDisplay()) {
			n.setNmingSysJrsdctnCdgDsply(String.valueOf(namingsystemjurisdictioncoding.getDisplay()));
		}
		/******************** NmingSys_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(namingsystemjurisdictioncoding.hasCode()) {
			n.setNmingSysJrsdctnCdgCd(String.valueOf(namingsystemjurisdictioncoding.getCode()));
		}
		/******************** NmingSys_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(namingsystemjurisdictioncoding.hasUserSelected()) {
			n.setNmingSysJrsdctnCdgUsrSltd(String.valueOf(namingsystemjurisdictioncoding.getUserSelected()));
		}
		/******************** NmingSys_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(namingsystemjurisdictioncoding.hasSystem()) {
			n.setNmingSysJrsdctnCdgSys(String.valueOf(namingsystemjurisdictioncoding.getSystem()));
		}
		return n;
	}
}
