package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.TerminologyCapabilities;
public class TerminologyCapabilitiesBidirectionalConversion 
{
	public TerminologyCapabilities TerminologyCapabilitiess(org.hl7.fhir.r4.model.TerminologyCapabilities terminologycapabilities) throws ParseException
	{
		 main.java.com.campfhir.model.TerminologyCapabilities t = new  main.java.com.campfhir.model.TerminologyCapabilities();

		/******************** id ********************************************************************************/
		terminologycapabilities.setId(t.getId());

		/******************** TrminologyCpnlties_Nm ********************************************************************************/
		if(terminologycapabilities.hasName()) {
			t.setTrminologyCpnltiesNm(String.valueOf(terminologycapabilities.getName()));
		}
		/******************** TrminologyCpnlties_Vrsn ********************************************************************************/
		if(terminologycapabilities.hasVersion()) {
			t.setTrminologyCpnltiesVrsn(String.valueOf(terminologycapabilities.getVersion()));
		}
		/******************** terminologycapabilitiestranslation ********************************************************************************/
		org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesTranslationComponent terminologycapabilitiestranslation = terminologycapabilities.getTranslation();

		/******************** TrminologyCpnlties_Translation_NeedsMap ********************************************************************************/
		if(terminologycapabilitiestranslation.hasNeedsMap()) {
			t.setTrminologyCpnltiesTranslationNeedsMap(String.valueOf(terminologycapabilitiestranslation.getNeedsMap()));
		}
		/******************** TrminologyCpnlties_Dt ********************************************************************************/
		if(terminologycapabilities.hasDate()) {
			t.setTrminologyCpnltiesDt(String.valueOf(terminologycapabilities.getDate()));
		}
		/******************** TrminologyCpnlties_Url ********************************************************************************/
		if(terminologycapabilities.hasUrl()) {
			t.setTrminologyCpnltiesUrl(String.valueOf(terminologycapabilities.getUrl()));
		}
		/******************** terminologycapabilitiescodesystem ********************************************************************************/
		org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesCodeSystemComponent terminologycapabilitiescodesystem = terminologycapabilities.getCodeSystemFirstRep();

		/******************** terminologycapabilitiescodesystemversion ********************************************************************************/
		org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesCodeSystemVersionComponent terminologycapabilitiescodesystemversion = terminologycapabilitiescodesystem.getVersionFirstRep();

		/******************** TrminologyCpnlties_CdSys_Vrsn_Cd ********************************************************************************/
		if(terminologycapabilitiescodesystemversion.hasCode()) {
			t.setTrminologyCpnltiesCdSysVrsnCd(String.valueOf(terminologycapabilitiescodesystemversion.getCode()));
		}
		/******************** TrminologyCpnlties_CdSys_Vrsn_Cmpsitional ********************************************************************************/
		if(terminologycapabilitiescodesystemversion.hasCompositional()) {
			t.setTrminologyCpnltiesCdSysVrsnCmpsitional(String.valueOf(terminologycapabilitiescodesystemversion.getCompositional()));
		}
		/******************** terminologycapabilitiescodesystemversionfilter ********************************************************************************/
		org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesCodeSystemVersionFilterComponent terminologycapabilitiescodesystemversionfilter = terminologycapabilitiescodesystemversion.getFilterFirstRep();

		/******************** TrminologyCpnlties_CdSys_Vrsn_Fltr_Cd ********************************************************************************/
		if(terminologycapabilitiescodesystemversionfilter.hasCode()) {
			t.setTrminologyCpnltiesCdSysVrsnFltrCd(String.valueOf(terminologycapabilitiescodesystemversionfilter.getCode()));
		}
		/******************** TrminologyCpnlties_CdSys_Vrsn_IsDefault ********************************************************************************/
		if(terminologycapabilitiescodesystemversion.hasIsDefault()) {
			t.setTrminologyCpnltiesCdSysVrsnIsDefault(String.valueOf(terminologycapabilitiescodesystemversion.getIsDefault()));
		}
		/******************** TrminologyCpnlties_CdSys_Uri ********************************************************************************/
		if(terminologycapabilitiescodesystem.hasUri()) {
			t.setTrminologyCpnltiesCdSysUri(String.valueOf(terminologycapabilitiescodesystem.getUri()));
		}
		/******************** TrminologyCpnlties_CdSys_Subsumption ********************************************************************************/
		if(terminologycapabilitiescodesystem.hasSubsumption()) {
			t.setTrminologyCpnltiesCdSysSubsumption(String.valueOf(terminologycapabilitiescodesystem.getSubsumption()));
		}
		/******************** terminologycapabilitiesjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept terminologycapabilitiesjurisdiction = terminologycapabilities.getJurisdictionFirstRep();

		/******************** terminologycapabilitiesjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding terminologycapabilitiesjurisdictioncoding = terminologycapabilitiesjurisdiction.getCodingFirstRep();

		/******************** TrminologyCpnlties_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(terminologycapabilitiesjurisdictioncoding.hasDisplay()) {
			t.setTrminologyCpnltiesJrsdctnCdgDsply(String.valueOf(terminologycapabilitiesjurisdictioncoding.getDisplay()));
		}
		/******************** TrminologyCpnlties_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(terminologycapabilitiesjurisdictioncoding.hasVersion()) {
			t.setTrminologyCpnltiesJrsdctnCdgVrsn(String.valueOf(terminologycapabilitiesjurisdictioncoding.getVersion()));
		}
		/******************** TrminologyCpnlties_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(terminologycapabilitiesjurisdictioncoding.hasCode()) {
			t.setTrminologyCpnltiesJrsdctnCdgCd(String.valueOf(terminologycapabilitiesjurisdictioncoding.getCode()));
		}
		/******************** TrminologyCpnlties_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(terminologycapabilitiesjurisdictioncoding.hasSystem()) {
			t.setTrminologyCpnltiesJrsdctnCdgSys(String.valueOf(terminologycapabilitiesjurisdictioncoding.getSystem()));
		}
		/******************** TrminologyCpnlties_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(terminologycapabilitiesjurisdictioncoding.hasUserSelected()) {
			t.setTrminologyCpnltiesJrsdctnCdgUsrSltd(String.valueOf(terminologycapabilitiesjurisdictioncoding.getUserSelected()));
		}
		/******************** TrminologyCpnlties_Jrsdctn_Txt ********************************************************************************/
		if(terminologycapabilitiesjurisdiction.hasText()) {
			t.setTrminologyCpnltiesJrsdctnTxt(String.valueOf(terminologycapabilitiesjurisdiction.getText()));
		}
		/******************** terminologycapabilitiesusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext terminologycapabilitiesusecontext = terminologycapabilities.getUseContextFirstRep();

		/******************** terminologycapabilitiesusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding terminologycapabilitiesusecontextcode = terminologycapabilitiesusecontext.getCode();

		/******************** TrminologyCpnlties_UseCntxt_Cd_Dsply ********************************************************************************/
		if(terminologycapabilitiesusecontextcode.hasDisplay()) {
			t.setTrminologyCpnltiesUseCntxtCdDsply(String.valueOf(terminologycapabilitiesusecontextcode.getDisplay()));
		}
		/******************** TrminologyCpnlties_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(terminologycapabilitiesusecontextcode.hasVersion()) {
			t.setTrminologyCpnltiesUseCntxtCdVrsn(String.valueOf(terminologycapabilitiesusecontextcode.getVersion()));
		}
		/******************** TrminologyCpnlties_UseCntxt_Cd_Sys ********************************************************************************/
		if(terminologycapabilitiesusecontextcode.hasSystem()) {
			t.setTrminologyCpnltiesUseCntxtCdSys(String.valueOf(terminologycapabilitiesusecontextcode.getSystem()));
		}
		/******************** TrminologyCpnlties_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(terminologycapabilitiesusecontextcode.hasUserSelected()) {
			t.setTrminologyCpnltiesUseCntxtCdUsrSltd(String.valueOf(terminologycapabilitiesusecontextcode.getUserSelected()));
		}
		/******************** terminologycapabilitiesusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept terminologycapabilitiesusecontextvaluecodeableconcept = terminologycapabilitiesusecontext.getValueCodeableConcept();

		/******************** terminologycapabilitiesusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding terminologycapabilitiesusecontextvaluecodeableconceptcoding = terminologycapabilitiesusecontextvaluecodeableconcept.getCodingFirstRep();

		/******************** TrminologyCpnlties_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(terminologycapabilitiesusecontextvaluecodeableconceptcoding.hasDisplay()) {
			t.setTrminologyCpnltiesUseCntxtVlCdbleCncptCdgDsply(String.valueOf(terminologycapabilitiesusecontextvaluecodeableconceptcoding.getDisplay()));
		}
		/******************** TrminologyCpnlties_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(terminologycapabilitiesusecontextvaluecodeableconceptcoding.hasVersion()) {
			t.setTrminologyCpnltiesUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(terminologycapabilitiesusecontextvaluecodeableconceptcoding.getVersion()));
		}
		/******************** TrminologyCpnlties_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(terminologycapabilitiesusecontextvaluecodeableconceptcoding.hasCode()) {
			t.setTrminologyCpnltiesUseCntxtVlCdbleCncptCdgCd(String.valueOf(terminologycapabilitiesusecontextvaluecodeableconceptcoding.getCode()));
		}
		/******************** TrminologyCpnlties_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(terminologycapabilitiesusecontextvaluecodeableconceptcoding.hasSystem()) {
			t.setTrminologyCpnltiesUseCntxtVlCdbleCncptCdgSys(String.valueOf(terminologycapabilitiesusecontextvaluecodeableconceptcoding.getSystem()));
		}
		/******************** TrminologyCpnlties_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(terminologycapabilitiesusecontextvaluecodeableconceptcoding.hasUserSelected()) {
			t.setTrminologyCpnltiesUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(terminologycapabilitiesusecontextvaluecodeableconceptcoding.getUserSelected()));
		}
		/******************** TrminologyCpnlties_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(terminologycapabilitiesusecontextvaluecodeableconcept.hasText()) {
			t.setTrminologyCpnltiesUseCntxtVlCdbleCncptTxt(String.valueOf(terminologycapabilitiesusecontextvaluecodeableconcept.getText()));
		}
		/******************** terminologycapabilitiesusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity terminologycapabilitiesusecontextvaluequantity = terminologycapabilitiesusecontext.getValueQuantity();

		/******************** TrminologyCpnlties_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(terminologycapabilitiesusecontextvaluequantity.hasValue()) {
			t.setTrminologyCpnltiesUseCntxtVlQntyVl(String.valueOf(terminologycapabilitiesusecontextvaluequantity.getValue()));
		}
		/******************** terminologycapabilitiesusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator terminologycapabilitiesusecontextvaluequantitycomparator = terminologycapabilitiesusecontextvaluequantity.getComparator();
		t.setTrminologyCpnltiesUseCntxtVlQntyCmprtr(terminologycapabilitiesusecontextvaluequantitycomparator.toCode());

		/******************** TrminologyCpnlties_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(terminologycapabilitiesusecontextvaluequantity.hasCode()) {
			t.setTrminologyCpnltiesUseCntxtVlQntyCd(String.valueOf(terminologycapabilitiesusecontextvaluequantity.getCode()));
		}
		/******************** TrminologyCpnlties_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(terminologycapabilitiesusecontextvaluequantity.hasSystem()) {
			t.setTrminologyCpnltiesUseCntxtVlQntySys(String.valueOf(terminologycapabilitiesusecontextvaluequantity.getSystem()));
		}
		/******************** TrminologyCpnlties_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(terminologycapabilitiesusecontextvaluequantity.hasUnit()) {
			t.setTrminologyCpnltiesUseCntxtVlQntyUnt(String.valueOf(terminologycapabilitiesusecontextvaluequantity.getUnit()));
		}
		/******************** terminologycapabilitiesusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range terminologycapabilitiesusecontextvaluerange = terminologycapabilitiesusecontext.getValueRange();

		/******************** terminologycapabilitiesusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity terminologycapabilitiesusecontextvaluerangelow = terminologycapabilitiesusecontextvaluerange.getLow();

		/******************** TrminologyCpnlties_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(terminologycapabilitiesusecontextvaluerangelow.hasValue()) {
			t.setTrminologyCpnltiesUseCntxtVlRngLwVl(String.valueOf(terminologycapabilitiesusecontextvaluerangelow.getValue()));
		}
		/******************** terminologycapabilitiesusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator terminologycapabilitiesusecontextvaluerangelowcomparator = terminologycapabilitiesusecontextvaluerangelow.getComparator();
		t.setTrminologyCpnltiesUseCntxtVlRngLwCmprtr(terminologycapabilitiesusecontextvaluerangelowcomparator.toCode());

		/******************** TrminologyCpnlties_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(terminologycapabilitiesusecontextvaluerangelow.hasCode()) {
			t.setTrminologyCpnltiesUseCntxtVlRngLwCd(String.valueOf(terminologycapabilitiesusecontextvaluerangelow.getCode()));
		}
		/******************** TrminologyCpnlties_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(terminologycapabilitiesusecontextvaluerangelow.hasSystem()) {
			t.setTrminologyCpnltiesUseCntxtVlRngLwSys(String.valueOf(terminologycapabilitiesusecontextvaluerangelow.getSystem()));
		}
		/******************** TrminologyCpnlties_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(terminologycapabilitiesusecontextvaluerangelow.hasUnit()) {
			t.setTrminologyCpnltiesUseCntxtVlRngLwUnt(String.valueOf(terminologycapabilitiesusecontextvaluerangelow.getUnit()));
		}
		/******************** terminologycapabilitiesusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity terminologycapabilitiesusecontextvaluerangehigh = terminologycapabilitiesusecontextvaluerange.getHigh();

		/******************** TrminologyCpnlties_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(terminologycapabilitiesusecontextvaluerangehigh.hasValue()) {
			t.setTrminologyCpnltiesUseCntxtVlRngHiVl(String.valueOf(terminologycapabilitiesusecontextvaluerangehigh.getValue()));
		}
		/******************** terminologycapabilitiesusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator terminologycapabilitiesusecontextvaluerangehighcomparator = terminologycapabilitiesusecontextvaluerangehigh.getComparator();
		t.setTrminologyCpnltiesUseCntxtVlRngHiCmprtr(terminologycapabilitiesusecontextvaluerangehighcomparator.toCode());

		/******************** TrminologyCpnlties_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(terminologycapabilitiesusecontextvaluerangehigh.hasCode()) {
			t.setTrminologyCpnltiesUseCntxtVlRngHiCd(String.valueOf(terminologycapabilitiesusecontextvaluerangehigh.getCode()));
		}
		/******************** TrminologyCpnlties_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(terminologycapabilitiesusecontextvaluerangehigh.hasSystem()) {
			t.setTrminologyCpnltiesUseCntxtVlRngHiSys(String.valueOf(terminologycapabilitiesusecontextvaluerangehigh.getSystem()));
		}
		/******************** TrminologyCpnlties_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(terminologycapabilitiesusecontextvaluerangehigh.hasUnit()) {
			t.setTrminologyCpnltiesUseCntxtVlRngHiUnt(String.valueOf(terminologycapabilitiesusecontextvaluerangehigh.getUnit()));
		}
		/******************** TrminologyCpnlties_UseCntxt_VlRfrnc ********************************************************************************/
		if(terminologycapabilitiesusecontext.hasValueReference()) {
			t.setTrminologyCpnltiesUseCntxtVlRfrnc(String.valueOf(terminologycapabilitiesusecontext.getValueReference()));
		}
		/******************** terminologycapabilitiesstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus terminologycapabilitiesstatus = terminologycapabilities.getStatus();
		t.setTrminologyCpnltiesSts(terminologycapabilitiesstatus.toCode());

		/******************** TrminologyCpnlties_Dscrptn ********************************************************************************/
		if(terminologycapabilities.hasDescription()) {
			t.setTrminologyCpnltiesDscrptn(String.valueOf(terminologycapabilities.getDescription()));
		}
		/******************** terminologycapabilitiescontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail terminologycapabilitiescontact = terminologycapabilities.getContactFirstRep();

		/******************** TrminologyCpnlties_Cntct_Nm ********************************************************************************/
		if(terminologycapabilitiescontact.hasName()) {
			t.setTrminologyCpnltiesCntctNm(String.valueOf(terminologycapabilitiescontact.getName()));
		}
		/******************** terminologycapabilitiescontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint terminologycapabilitiescontacttelecom = terminologycapabilitiescontact.getTelecomFirstRep();

		/******************** TrminologyCpnlties_Cntct_Tlcm_Vl ********************************************************************************/
		if(terminologycapabilitiescontacttelecom.hasValue()) {
			t.setTrminologyCpnltiesCntctTlcmVl(String.valueOf(terminologycapabilitiescontacttelecom.getValue()));
		}
		/******************** terminologycapabilitiescontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem terminologycapabilitiescontacttelecomsystem = terminologycapabilitiescontacttelecom.getSystem();
		t.setTrminologyCpnltiesCntctTlcmSys(terminologycapabilitiescontacttelecomsystem.toCode());

		/******************** terminologycapabilitiescontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period terminologycapabilitiescontacttelecomperiod = terminologycapabilitiescontacttelecom.getPeriod();

		/******************** TrminologyCpnlties_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(terminologycapabilitiescontacttelecomperiod.hasEnd()) {
			t.setTrminologyCpnltiesCntctTlcmPrdEnd(String.valueOf(terminologycapabilitiescontacttelecomperiod.getEnd()));
		}
		/******************** TrminologyCpnlties_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(terminologycapabilitiescontacttelecomperiod.hasStart()) {
			t.setTrminologyCpnltiesCntctTlcmPrdStrt(String.valueOf(terminologycapabilitiescontacttelecomperiod.getStart()));
		}
		/******************** terminologycapabilitiescontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse terminologycapabilitiescontacttelecomuse = terminologycapabilitiescontacttelecom.getUse();
		t.setTrminologyCpnltiesCntctTlcmUse(terminologycapabilitiescontacttelecomuse.toCode());

		/******************** TrminologyCpnlties_Cntct_Tlcm_Rnk ********************************************************************************/
		if(terminologycapabilitiescontacttelecom.hasRank()) {
			t.setTrminologyCpnltiesCntctTlcmRnk(String.valueOf(terminologycapabilitiescontacttelecom.getRank()));
		}
		/******************** TrminologyCpnlties_Ttl ********************************************************************************/
		if(terminologycapabilities.hasTitle()) {
			t.setTrminologyCpnltiesTtl(String.valueOf(terminologycapabilities.getTitle()));
		}
		/******************** TrminologyCpnlties_Exprmtl ********************************************************************************/
		if(terminologycapabilities.hasExperimental()) {
			t.setTrminologyCpnltiesExprmtl(String.valueOf(terminologycapabilities.getExperimental()));
		}
		/******************** TrminologyCpnlties_Pblshr ********************************************************************************/
		if(terminologycapabilities.hasPublisher()) {
			t.setTrminologyCpnltiesPblshr(String.valueOf(terminologycapabilities.getPublisher()));
		}
		/******************** TrminologyCpnlties_Prpse ********************************************************************************/
		if(terminologycapabilities.hasPurpose()) {
			t.setTrminologyCpnltiesPrpse(String.valueOf(terminologycapabilities.getPurpose()));
		}
		/******************** TrminologyCpnlties_Copyright ********************************************************************************/
		if(terminologycapabilities.hasCopyright()) {
			t.setTrminologyCpnltiesCopyright(String.valueOf(terminologycapabilities.getCopyright()));
		}
		/******************** terminologycapabilitieskind ********************************************************************************/
		org.hl7.fhir.r4.model.TerminologyCapabilities.CapabilityStatementKind terminologycapabilitieskind = terminologycapabilities.getKind();
		t.setTrminologyCpnltiesKind(terminologycapabilitieskind.toCode());

		/******************** terminologycapabilitiessoftware ********************************************************************************/
		org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesSoftwareComponent terminologycapabilitiessoftware = terminologycapabilities.getSoftware();

		/******************** TrminologyCpnlties_Software_Nm ********************************************************************************/
		if(terminologycapabilitiessoftware.hasName()) {
			t.setTrminologyCpnltiesSoftwareNm(String.valueOf(terminologycapabilitiessoftware.getName()));
		}
		/******************** terminologycapabilitiesimplementation ********************************************************************************/
		org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesImplementationComponent terminologycapabilitiesimplementation = terminologycapabilities.getImplementation();

		/******************** TrminologyCpnlties_Implementation_Url ********************************************************************************/
		if(terminologycapabilitiesimplementation.hasUrl()) {
			t.setTrminologyCpnltiesImplementationUrl(String.valueOf(terminologycapabilitiesimplementation.getUrl()));
		}
		/******************** TrminologyCpnlties_Implementation_Dscrptn ********************************************************************************/
		if(terminologycapabilitiesimplementation.hasDescription()) {
			t.setTrminologyCpnltiesImplementationDscrptn(String.valueOf(terminologycapabilitiesimplementation.getDescription()));
		}
		/******************** TrminologyCpnlties_LockedDt ********************************************************************************/
		if(terminologycapabilities.hasLockedDate()) {
			t.setTrminologyCpnltiesLockedDt(String.valueOf(terminologycapabilities.getLockedDate()));
		}
		/******************** terminologycapabilitiescodesearch ********************************************************************************/
		org.hl7.fhir.r4.model.TerminologyCapabilities.CodeSearchSupport terminologycapabilitiescodesearch = terminologycapabilities.getCodeSearch();
		t.setTrminologyCpnltiesCdSrch(terminologycapabilitiescodesearch.toCode());

		/******************** terminologycapabilitiesclosure ********************************************************************************/
		org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesClosureComponent terminologycapabilitiesclosure = terminologycapabilities.getClosure();

		/******************** TrminologyCpnlties_Closure_Translation ********************************************************************************/
		if(terminologycapabilitiesclosure.hasTranslation()) {
			t.setTrminologyCpnltiesClosureTranslation(String.valueOf(terminologycapabilitiesclosure.getTranslation()));
		}
		/******************** terminologycapabilitiesvalidatecode ********************************************************************************/
		org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesValidateCodeComponent terminologycapabilitiesvalidatecode = terminologycapabilities.getValidateCode();

		/******************** TrminologyCpnlties_ValidateCd_Translations ********************************************************************************/
		if(terminologycapabilitiesvalidatecode.hasTranslations()) {
			t.setTrminologyCpnltiesValidateCdTranslations(String.valueOf(terminologycapabilitiesvalidatecode.getTranslations()));
		}
		/******************** terminologycapabilitiesexpansion ********************************************************************************/
		org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesExpansionComponent terminologycapabilitiesexpansion = terminologycapabilities.getExpansion();

		/******************** terminologycapabilitiesexpansionparameter ********************************************************************************/
		org.hl7.fhir.r4.model.TerminologyCapabilities.TerminologyCapabilitiesExpansionParameterComponent terminologycapabilitiesexpansionparameter = terminologycapabilitiesexpansion.getParameterFirstRep();

		/******************** TrminologyCpnlties_Expansion_Prmtr_Nm ********************************************************************************/
		if(terminologycapabilitiesexpansionparameter.hasName()) {
			t.setTrminologyCpnltiesExpansionPrmtrNm(String.valueOf(terminologycapabilitiesexpansionparameter.getName()));
		}
		/******************** TrminologyCpnlties_Expansion_Prmtr_Docation ********************************************************************************/
		if(terminologycapabilitiesexpansionparameter.hasDocumentation()) {
			t.setTrminologyCpnltiesExpansionPrmtrDocation(String.valueOf(terminologycapabilitiesexpansionparameter.getDocumentation()));
		}
		/******************** TrminologyCpnlties_Expansion_Hierarchical ********************************************************************************/
		if(terminologycapabilitiesexpansion.hasHierarchical()) {
			t.setTrminologyCpnltiesExpansionHierarchical(String.valueOf(terminologycapabilitiesexpansion.getHierarchical()));
		}
		/******************** TrminologyCpnlties_Expansion_Incomplete ********************************************************************************/
		if(terminologycapabilitiesexpansion.hasIncomplete()) {
			t.setTrminologyCpnltiesExpansionIncomplete(String.valueOf(terminologycapabilitiesexpansion.getIncomplete()));
		}
		/******************** TrminologyCpnlties_Expansion_TxtFltr ********************************************************************************/
		if(terminologycapabilitiesexpansion.hasTextFilter()) {
			t.setTrminologyCpnltiesExpansionTxtFltr(String.valueOf(terminologycapabilitiesexpansion.getTextFilter()));
		}
		/******************** TrminologyCpnlties_Expansion_Paging ********************************************************************************/
		if(terminologycapabilitiesexpansion.hasPaging()) {
			t.setTrminologyCpnltiesExpansionPaging(String.valueOf(terminologycapabilitiesexpansion.getPaging()));
		}
		return t;
	}
}
