package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.NamingSystem;
public class NamingSystemConversion 
{
	public org.hl7.fhir.r4.model.NamingSystem NamingSystems(NamingSystem n) throws ParseException
	{
		org.hl7.fhir.r4.model.NamingSystem namingsystem = new org.hl7.fhir.r4.model.NamingSystem();

		/******************** id ********************************************************************************/
		namingsystem.setId(n.getId());

		/******************** namingsystemcontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail namingsystemcontact =  new org.hl7.fhir.r4.model.ContactDetail();
		namingsystem.addContact(namingsystemcontact);

		/******************** NmingSys_Cntct_Nm ********************************************************************************/
		if(n.getNmingSysCntctNm() != null) {
			namingsystemcontact.setName(n.getNmingSysCntctNm());
		}
		/******************** namingsystemcontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint namingsystemcontacttelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		namingsystemcontact.addTelecom(namingsystemcontacttelecom);

		/******************** namingsystemcontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period namingsystemcontacttelecomperiod =  new org.hl7.fhir.r4.model.Period();
		namingsystemcontacttelecom.setPeriod(namingsystemcontacttelecomperiod);

		/******************** NmingSys_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(n.getNmingSysCntctTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat NmingSys_Cntct_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date NmingSys_Cntct_Tlcm_Prd_Enddate = NmingSys_Cntct_Tlcm_Prd_Endsdf.parse(n.getNmingSysCntctTlcmPrdEnd());
			namingsystemcontacttelecomperiod.setEnd(NmingSys_Cntct_Tlcm_Prd_Enddate);
		}
		/******************** NmingSys_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(n.getNmingSysCntctTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat NmingSys_Cntct_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date NmingSys_Cntct_Tlcm_Prd_Strtdate = NmingSys_Cntct_Tlcm_Prd_Strtsdf.parse(n.getNmingSysCntctTlcmPrdStrt());
			namingsystemcontacttelecomperiod.setStart(NmingSys_Cntct_Tlcm_Prd_Strtdate);
		}
		/******************** NmingSys_Cntct_Tlcm_Rnk ********************************************************************************/
		if(n.getNmingSysCntctTlcmRnk() != null) {
			namingsystemcontacttelecom.setRank(Integer.parseInt(n.getNmingSysCntctTlcmRnk()));
		}
		/******************** namingsystemcontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory namingsystemcontacttelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		namingsystemcontacttelecom.setSystem(namingsystemcontacttelecomsystem.fromCode(n.getNmingSysCntctTlcmSys()));

		/******************** namingsystemcontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory namingsystemcontacttelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		namingsystemcontacttelecom.setUse(namingsystemcontacttelecomuse.fromCode(n.getNmingSysCntctTlcmUse()));

		/******************** NmingSys_Cntct_Tlcm_Vl ********************************************************************************/
		if(n.getNmingSysCntctTlcmVl() != null) {
			namingsystemcontacttelecom.setValue(n.getNmingSysCntctTlcmVl());
		}
		/******************** NmingSys_Dt ********************************************************************************/
		if(n.getNmingSysDt() != null) {
			java.text.SimpleDateFormat NmingSys_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date NmingSys_Dtdate = NmingSys_Dtsdf.parse(n.getNmingSysDt());
			namingsystem.setDate(NmingSys_Dtdate);
		}
		/******************** NmingSys_Dscrptn ********************************************************************************/
		if(n.getNmingSysDscrptn() != null) {
			namingsystem.setDescription(n.getNmingSysDscrptn());
		}
		/******************** namingsystemjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept namingsystemjurisdiction =  new org.hl7.fhir.r4.model.CodeableConcept();
		namingsystem.addJurisdiction(namingsystemjurisdiction);

		/******************** namingsystemjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding namingsystemjurisdictioncoding =  new org.hl7.fhir.r4.model.Coding();
		namingsystemjurisdiction.addCoding(namingsystemjurisdictioncoding);

		/******************** NmingSys_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(n.getNmingSysJrsdctnCdgCd() != null) {
			namingsystemjurisdictioncoding.setCode(n.getNmingSysJrsdctnCdgCd());
		}
		/******************** NmingSys_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(n.getNmingSysJrsdctnCdgDsply() != null) {
			namingsystemjurisdictioncoding.setDisplay(n.getNmingSysJrsdctnCdgDsply());
		}
		/******************** NmingSys_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(n.getNmingSysJrsdctnCdgSys() != null) {
			namingsystemjurisdictioncoding.setSystem(n.getNmingSysJrsdctnCdgSys());
		}
		/******************** NmingSys_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(n.getNmingSysJrsdctnCdgUsrSltd() != null) {
			namingsystemjurisdictioncoding.setUserSelected(Boolean.parseBoolean(n.getNmingSysJrsdctnCdgUsrSltd()));
		}
		/******************** NmingSys_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(n.getNmingSysJrsdctnCdgVrsn() != null) {
			namingsystemjurisdictioncoding.setVersion(n.getNmingSysJrsdctnCdgVrsn());
		}
		/******************** NmingSys_Jrsdctn_Txt ********************************************************************************/
		if(n.getNmingSysJrsdctnTxt() != null) {
			namingsystemjurisdiction.setText(n.getNmingSysJrsdctnTxt());
		}
		/******************** namingsystemkind ********************************************************************************/
		org.hl7.fhir.r4.model.NamingSystem.NamingSystemTypeEnumFactory namingsystemkind =  new org.hl7.fhir.r4.model.NamingSystem.NamingSystemTypeEnumFactory();
		namingsystem.setKind(namingsystemkind.fromCode(n.getNmingSysKind()));

		/******************** NmingSys_Nm ********************************************************************************/
		if(n.getNmingSysNm() != null) {
			namingsystem.setName(n.getNmingSysNm());
		}
		/******************** NmingSys_Pblshr ********************************************************************************/
		if(n.getNmingSysPblshr() != null) {
			namingsystem.setPublisher(n.getNmingSysPblshr());
		}
		/******************** NmingSys_Responsible ********************************************************************************/
		if(n.getNmingSysResponsible() != null) {
			namingsystem.setResponsible(n.getNmingSysResponsible());
		}
		/******************** namingsystemstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory namingsystemstatus =  new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory();
		namingsystem.setStatus(namingsystemstatus.fromCode(n.getNmingSysSts()));

		/******************** namingsystemtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept namingsystemtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		namingsystem.setType(namingsystemtype);

		/******************** namingsystemtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding namingsystemtypecoding =  new org.hl7.fhir.r4.model.Coding();
		namingsystemtype.addCoding(namingsystemtypecoding);

		/******************** NmingSys_Typ_Cdg_Cd ********************************************************************************/
		if(n.getNmingSysTypCdgCd() != null) {
			namingsystemtypecoding.setCode(n.getNmingSysTypCdgCd());
		}
		/******************** NmingSys_Typ_Cdg_Dsply ********************************************************************************/
		if(n.getNmingSysTypCdgDsply() != null) {
			namingsystemtypecoding.setDisplay(n.getNmingSysTypCdgDsply());
		}
		/******************** NmingSys_Typ_Cdg_Sys ********************************************************************************/
		if(n.getNmingSysTypCdgSys() != null) {
			namingsystemtypecoding.setSystem(n.getNmingSysTypCdgSys());
		}
		/******************** NmingSys_Typ_Cdg_UsrSltd ********************************************************************************/
		if(n.getNmingSysTypCdgUsrSltd() != null) {
			namingsystemtypecoding.setUserSelected(Boolean.parseBoolean(n.getNmingSysTypCdgUsrSltd()));
		}
		/******************** NmingSys_Typ_Cdg_Vrsn ********************************************************************************/
		if(n.getNmingSysTypCdgVrsn() != null) {
			namingsystemtypecoding.setVersion(n.getNmingSysTypCdgVrsn());
		}
		/******************** NmingSys_Typ_Txt ********************************************************************************/
		if(n.getNmingSysTypTxt() != null) {
			namingsystemtype.setText(n.getNmingSysTypTxt());
		}
		/******************** namingsystemuniqueid ********************************************************************************/
		org.hl7.fhir.r4.model.NamingSystem.NamingSystemUniqueIdComponent namingsystemuniqueid =  new org.hl7.fhir.r4.model.NamingSystem.NamingSystemUniqueIdComponent();
		namingsystem.addUniqueId(namingsystemuniqueid);

		/******************** NmingSys_UniqueId_Comment ********************************************************************************/
		if(n.getNmingSysUniqueIdComment() != null) {
			namingsystemuniqueid.setComment(n.getNmingSysUniqueIdComment());
		}
		/******************** namingsystemuniqueidperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period namingsystemuniqueidperiod =  new org.hl7.fhir.r4.model.Period();
		namingsystemuniqueid.setPeriod(namingsystemuniqueidperiod);

		/******************** NmingSys_UniqueId_Prd_End ********************************************************************************/
		if(n.getNmingSysUniqueIdPrdEnd() != null) {
			java.text.SimpleDateFormat NmingSys_UniqueId_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date NmingSys_UniqueId_Prd_Enddate = NmingSys_UniqueId_Prd_Endsdf.parse(n.getNmingSysUniqueIdPrdEnd());
			namingsystemuniqueidperiod.setEnd(NmingSys_UniqueId_Prd_Enddate);
		}
		/******************** NmingSys_UniqueId_Prd_Strt ********************************************************************************/
		if(n.getNmingSysUniqueIdPrdStrt() != null) {
			java.text.SimpleDateFormat NmingSys_UniqueId_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date NmingSys_UniqueId_Prd_Strtdate = NmingSys_UniqueId_Prd_Strtsdf.parse(n.getNmingSysUniqueIdPrdStrt());
			namingsystemuniqueidperiod.setStart(NmingSys_UniqueId_Prd_Strtdate);
		}
		/******************** NmingSys_UniqueId_Preferred ********************************************************************************/
		if(n.getNmingSysUniqueIdPreferred() != null) {
			namingsystemuniqueid.setPreferred(Boolean.parseBoolean(n.getNmingSysUniqueIdPreferred()));
		}
		/******************** namingsystemuniqueidtype ********************************************************************************/
		org.hl7.fhir.r4.model.NamingSystem.NamingSystemIdentifierTypeEnumFactory namingsystemuniqueidtype =  new org.hl7.fhir.r4.model.NamingSystem.NamingSystemIdentifierTypeEnumFactory();
		namingsystemuniqueid.setType(namingsystemuniqueidtype.fromCode(n.getNmingSysUniqueIdTyp()));

		/******************** NmingSys_UniqueId_Vl ********************************************************************************/
		if(n.getNmingSysUniqueIdVl() != null) {
			namingsystemuniqueid.setValue(n.getNmingSysUniqueIdVl());
		}
		/******************** NmingSys_Usg ********************************************************************************/
		if(n.getNmingSysUsg() != null) {
			namingsystem.setUsage(n.getNmingSysUsg());
		}
		/******************** namingsystemusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext namingsystemusecontext =  new org.hl7.fhir.r4.model.UsageContext();
		namingsystem.addUseContext(namingsystemusecontext);

		/******************** namingsystemusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding namingsystemusecontextcode =  new org.hl7.fhir.r4.model.Coding();
		namingsystemusecontext.setCode(namingsystemusecontextcode);

		/******************** NmingSys_UseCntxt_Cd_Cd ********************************************************************************/
		if(n.getNmingSysUseCntxtCdCd() != null) {
			namingsystemusecontextcode.setCode(n.getNmingSysUseCntxtCdCd());
		}
		/******************** NmingSys_UseCntxt_Cd_Dsply ********************************************************************************/
		if(n.getNmingSysUseCntxtCdDsply() != null) {
			namingsystemusecontextcode.setDisplay(n.getNmingSysUseCntxtCdDsply());
		}
		/******************** NmingSys_UseCntxt_Cd_Sys ********************************************************************************/
		if(n.getNmingSysUseCntxtCdSys() != null) {
			namingsystemusecontextcode.setSystem(n.getNmingSysUseCntxtCdSys());
		}
		/******************** NmingSys_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(n.getNmingSysUseCntxtCdUsrSltd() != null) {
			namingsystemusecontextcode.setUserSelected(Boolean.parseBoolean(n.getNmingSysUseCntxtCdUsrSltd()));
		}
		/******************** NmingSys_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(n.getNmingSysUseCntxtCdVrsn() != null) {
			namingsystemusecontextcode.setVersion(n.getNmingSysUseCntxtCdVrsn());
		}
		/******************** namingsystemusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept namingsystemusecontextvaluecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		namingsystemusecontext.setValue(namingsystemusecontextvaluecodeableconcept);

		/******************** namingsystemusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding namingsystemusecontextvaluecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		namingsystemusecontextvaluecodeableconcept.addCoding(namingsystemusecontextvaluecodeableconceptcoding);

		/******************** NmingSys_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(n.getNmingSysUseCntxtVlCdbleCncptCdgCd() != null) {
			namingsystemusecontextvaluecodeableconceptcoding.setCode(n.getNmingSysUseCntxtVlCdbleCncptCdgCd());
		}
		/******************** NmingSys_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(n.getNmingSysUseCntxtVlCdbleCncptCdgDsply() != null) {
			namingsystemusecontextvaluecodeableconceptcoding.setDisplay(n.getNmingSysUseCntxtVlCdbleCncptCdgDsply());
		}
		/******************** NmingSys_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(n.getNmingSysUseCntxtVlCdbleCncptCdgSys() != null) {
			namingsystemusecontextvaluecodeableconceptcoding.setSystem(n.getNmingSysUseCntxtVlCdbleCncptCdgSys());
		}
		/******************** NmingSys_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(n.getNmingSysUseCntxtVlCdbleCncptCdgUsrSltd() != null) {
			namingsystemusecontextvaluecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(n.getNmingSysUseCntxtVlCdbleCncptCdgUsrSltd()));
		}
		/******************** NmingSys_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(n.getNmingSysUseCntxtVlCdbleCncptCdgVrsn() != null) {
			namingsystemusecontextvaluecodeableconceptcoding.setVersion(n.getNmingSysUseCntxtVlCdbleCncptCdgVrsn());
		}
		/******************** NmingSys_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(n.getNmingSysUseCntxtVlCdbleCncptTxt() != null) {
			namingsystemusecontextvaluecodeableconcept.setText(n.getNmingSysUseCntxtVlCdbleCncptTxt());
		}
		/******************** namingsystemusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity namingsystemusecontextvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		namingsystemusecontext.setValue(namingsystemusecontextvaluequantity);

		/******************** NmingSys_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(n.getNmingSysUseCntxtVlQntyCd() != null) {
			namingsystemusecontextvaluequantity.setCode(n.getNmingSysUseCntxtVlQntyCd());
		}
		/******************** namingsystemusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory namingsystemusecontextvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		namingsystemusecontextvaluequantity.setComparator(namingsystemusecontextvaluequantitycomparator.fromCode(n.getNmingSysUseCntxtVlQntyCmprtr()));

		/******************** NmingSys_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(n.getNmingSysUseCntxtVlQntySys() != null) {
			namingsystemusecontextvaluequantity.setSystem(n.getNmingSysUseCntxtVlQntySys());
		}
		/******************** NmingSys_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(n.getNmingSysUseCntxtVlQntyUnt() != null) {
			namingsystemusecontextvaluequantity.setUnit(n.getNmingSysUseCntxtVlQntyUnt());
		}
		/******************** NmingSys_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(n.getNmingSysUseCntxtVlQntyVl() != null) {
			namingsystemusecontextvaluequantity.setValue(Double.parseDouble((n.getNmingSysUseCntxtVlQntyVl())));
		}
		/******************** namingsystemusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range namingsystemusecontextvaluerange =  new org.hl7.fhir.r4.model.Range();
		namingsystemusecontext.setValue(namingsystemusecontextvaluerange);

		/******************** namingsystemusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity namingsystemusecontextvaluerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		namingsystemusecontextvaluerange.setHigh(namingsystemusecontextvaluerangehigh);

		/******************** NmingSys_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(n.getNmingSysUseCntxtVlRngHiCd() != null) {
			namingsystemusecontextvaluerangehigh.setCode(n.getNmingSysUseCntxtVlRngHiCd());
		}
		/******************** namingsystemusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory namingsystemusecontextvaluerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		namingsystemusecontextvaluerangehigh.setComparator(namingsystemusecontextvaluerangehighcomparator.fromCode(n.getNmingSysUseCntxtVlRngHiCmprtr()));

		/******************** NmingSys_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(n.getNmingSysUseCntxtVlRngHiSys() != null) {
			namingsystemusecontextvaluerangehigh.setSystem(n.getNmingSysUseCntxtVlRngHiSys());
		}
		/******************** NmingSys_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(n.getNmingSysUseCntxtVlRngHiUnt() != null) {
			namingsystemusecontextvaluerangehigh.setUnit(n.getNmingSysUseCntxtVlRngHiUnt());
		}
		/******************** NmingSys_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(n.getNmingSysUseCntxtVlRngHiVl() != null) {
			namingsystemusecontextvaluerangehigh.setValue(Double.parseDouble((n.getNmingSysUseCntxtVlRngHiVl())));
		}
		/******************** namingsystemusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity namingsystemusecontextvaluerangelow =  new org.hl7.fhir.r4.model.Quantity();
		namingsystemusecontextvaluerange.setLow(namingsystemusecontextvaluerangelow);

		/******************** NmingSys_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(n.getNmingSysUseCntxtVlRngLwCd() != null) {
			namingsystemusecontextvaluerangelow.setCode(n.getNmingSysUseCntxtVlRngLwCd());
		}
		/******************** namingsystemusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory namingsystemusecontextvaluerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		namingsystemusecontextvaluerangelow.setComparator(namingsystemusecontextvaluerangelowcomparator.fromCode(n.getNmingSysUseCntxtVlRngLwCmprtr()));

		/******************** NmingSys_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(n.getNmingSysUseCntxtVlRngLwSys() != null) {
			namingsystemusecontextvaluerangelow.setSystem(n.getNmingSysUseCntxtVlRngLwSys());
		}
		/******************** NmingSys_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(n.getNmingSysUseCntxtVlRngLwUnt() != null) {
			namingsystemusecontextvaluerangelow.setUnit(n.getNmingSysUseCntxtVlRngLwUnt());
		}
		/******************** NmingSys_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(n.getNmingSysUseCntxtVlRngLwVl() != null) {
			namingsystemusecontextvaluerangelow.setValue(Double.parseDouble((n.getNmingSysUseCntxtVlRngLwVl())));
		}
		/******************** NmingSys_UseCntxt_VlRfrnc ********************************************************************************/
		if(n.getNmingSysUseCntxtVlRfrnc() != null) {
			namingsystemusecontext.setValue( new org.hl7.fhir.r4.model.Reference(n.getNmingSysUseCntxtVlRfrnc()));
		}
		return namingsystem;
	}
}
