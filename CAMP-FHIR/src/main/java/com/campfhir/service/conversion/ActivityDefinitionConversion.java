package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ActivityDefinition;
public class ActivityDefinitionConversion 
{
	public org.hl7.fhir.r4.model.ActivityDefinition ActivityDefinitions(ActivityDefinition a) throws ParseException
	{
		org.hl7.fhir.r4.model.ActivityDefinition activitydefinition = new org.hl7.fhir.r4.model.ActivityDefinition();

		/******************** id ********************************************************************************/
		activitydefinition.setId(a.getId());

		/******************** ActvtyDfn_ApprovalDt ********************************************************************************/
		if(a.getActvtyDfnApprovalDt() != null) {
			java.text.SimpleDateFormat ActvtyDfn_ApprovalDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ActvtyDfn_ApprovalDtdate = ActvtyDfn_ApprovalDtsdf.parse(a.getActvtyDfnApprovalDt());
			activitydefinition.setApprovalDate(ActvtyDfn_ApprovalDtdate);
		}
		/******************** activitydefinitionauthor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail activitydefinitionauthor =  new org.hl7.fhir.r4.model.ContactDetail();
		activitydefinition.addAuthor(activitydefinitionauthor);

		/******************** ActvtyDfn_Athr_Nm ********************************************************************************/
		if(a.getActvtyDfnAthrNm() != null) {
			activitydefinitionauthor.setName(a.getActvtyDfnAthrNm());
		}
		/******************** activitydefinitionauthortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint activitydefinitionauthortelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		activitydefinitionauthor.addTelecom(activitydefinitionauthortelecom);

		/******************** activitydefinitionauthortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period activitydefinitionauthortelecomperiod =  new org.hl7.fhir.r4.model.Period();
		activitydefinitionauthortelecom.setPeriod(activitydefinitionauthortelecomperiod);

		/******************** ActvtyDfn_Athr_Tlcm_Prd_End ********************************************************************************/
		if(a.getActvtyDfnAthrTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat ActvtyDfn_Athr_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ActvtyDfn_Athr_Tlcm_Prd_Enddate = ActvtyDfn_Athr_Tlcm_Prd_Endsdf.parse(a.getActvtyDfnAthrTlcmPrdEnd());
			activitydefinitionauthortelecomperiod.setEnd(ActvtyDfn_Athr_Tlcm_Prd_Enddate);
		}
		/******************** ActvtyDfn_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(a.getActvtyDfnAthrTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat ActvtyDfn_Athr_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ActvtyDfn_Athr_Tlcm_Prd_Strtdate = ActvtyDfn_Athr_Tlcm_Prd_Strtsdf.parse(a.getActvtyDfnAthrTlcmPrdStrt());
			activitydefinitionauthortelecomperiod.setStart(ActvtyDfn_Athr_Tlcm_Prd_Strtdate);
		}
		/******************** ActvtyDfn_Athr_Tlcm_Rnk ********************************************************************************/
		if(a.getActvtyDfnAthrTlcmRnk() != null) {
			activitydefinitionauthortelecom.setRank(Integer.parseInt(a.getActvtyDfnAthrTlcmRnk()));
		}
		/******************** activitydefinitionauthortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory activitydefinitionauthortelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		activitydefinitionauthortelecom.setSystem(activitydefinitionauthortelecomsystem.fromCode(a.getActvtyDfnAthrTlcmSys()));

		/******************** activitydefinitionauthortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory activitydefinitionauthortelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		activitydefinitionauthortelecom.setUse(activitydefinitionauthortelecomuse.fromCode(a.getActvtyDfnAthrTlcmUse()));

		/******************** ActvtyDfn_Athr_Tlcm_Vl ********************************************************************************/
		if(a.getActvtyDfnAthrTlcmVl() != null) {
			activitydefinitionauthortelecom.setValue(a.getActvtyDfnAthrTlcmVl());
		}
		/******************** activitydefinitionbodysite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitionbodysite =  new org.hl7.fhir.r4.model.CodeableConcept();
		activitydefinition.addBodySite(activitydefinitionbodysite);

		/******************** activitydefinitionbodysitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitionbodysitecoding =  new org.hl7.fhir.r4.model.Coding();
		activitydefinitionbodysite.addCoding(activitydefinitionbodysitecoding);

		/******************** ActvtyDfn_BodySite_Cdg_Cd ********************************************************************************/
		if(a.getActvtyDfnBodySiteCdgCd() != null) {
			activitydefinitionbodysitecoding.setCode(a.getActvtyDfnBodySiteCdgCd());
		}
		/******************** ActvtyDfn_BodySite_Cdg_Dsply ********************************************************************************/
		if(a.getActvtyDfnBodySiteCdgDsply() != null) {
			activitydefinitionbodysitecoding.setDisplay(a.getActvtyDfnBodySiteCdgDsply());
		}
		/******************** ActvtyDfn_BodySite_Cdg_Sys ********************************************************************************/
		if(a.getActvtyDfnBodySiteCdgSys() != null) {
			activitydefinitionbodysitecoding.setSystem(a.getActvtyDfnBodySiteCdgSys());
		}
		/******************** ActvtyDfn_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(a.getActvtyDfnBodySiteCdgUsrSltd() != null) {
			activitydefinitionbodysitecoding.setUserSelected(Boolean.parseBoolean(a.getActvtyDfnBodySiteCdgUsrSltd()));
		}
		/******************** ActvtyDfn_BodySite_Cdg_Vrsn ********************************************************************************/
		if(a.getActvtyDfnBodySiteCdgVrsn() != null) {
			activitydefinitionbodysitecoding.setVersion(a.getActvtyDfnBodySiteCdgVrsn());
		}
		/******************** ActvtyDfn_BodySite_Txt ********************************************************************************/
		if(a.getActvtyDfnBodySiteTxt() != null) {
			activitydefinitionbodysite.setText(a.getActvtyDfnBodySiteTxt());
		}
		/******************** activitydefinitioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitioncode =  new org.hl7.fhir.r4.model.CodeableConcept();
		activitydefinition.setCode(activitydefinitioncode);

		/******************** activitydefinitioncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitioncodecoding =  new org.hl7.fhir.r4.model.Coding();
		activitydefinitioncode.addCoding(activitydefinitioncodecoding);

		/******************** ActvtyDfn_Cd_Cdg_Cd ********************************************************************************/
		if(a.getActvtyDfnCdCdgCd() != null) {
			activitydefinitioncodecoding.setCode(a.getActvtyDfnCdCdgCd());
		}
		/******************** ActvtyDfn_Cd_Cdg_Dsply ********************************************************************************/
		if(a.getActvtyDfnCdCdgDsply() != null) {
			activitydefinitioncodecoding.setDisplay(a.getActvtyDfnCdCdgDsply());
		}
		/******************** ActvtyDfn_Cd_Cdg_Sys ********************************************************************************/
		if(a.getActvtyDfnCdCdgSys() != null) {
			activitydefinitioncodecoding.setSystem(a.getActvtyDfnCdCdgSys());
		}
		/******************** ActvtyDfn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(a.getActvtyDfnCdCdgUsrSltd() != null) {
			activitydefinitioncodecoding.setUserSelected(Boolean.parseBoolean(a.getActvtyDfnCdCdgUsrSltd()));
		}
		/******************** ActvtyDfn_Cd_Cdg_Vrsn ********************************************************************************/
		if(a.getActvtyDfnCdCdgVrsn() != null) {
			activitydefinitioncodecoding.setVersion(a.getActvtyDfnCdCdgVrsn());
		}
		/******************** ActvtyDfn_Cd_Txt ********************************************************************************/
		if(a.getActvtyDfnCdTxt() != null) {
			activitydefinitioncode.setText(a.getActvtyDfnCdTxt());
		}
		/******************** activitydefinitioncontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail activitydefinitioncontact =  new org.hl7.fhir.r4.model.ContactDetail();
		activitydefinition.addContact(activitydefinitioncontact);

		/******************** ActvtyDfn_Cntct_Nm ********************************************************************************/
		if(a.getActvtyDfnCntctNm() != null) {
			activitydefinitioncontact.setName(a.getActvtyDfnCntctNm());
		}
		/******************** activitydefinitioncontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint activitydefinitioncontacttelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		activitydefinitioncontact.addTelecom(activitydefinitioncontacttelecom);

		/******************** activitydefinitioncontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period activitydefinitioncontacttelecomperiod =  new org.hl7.fhir.r4.model.Period();
		activitydefinitioncontacttelecom.setPeriod(activitydefinitioncontacttelecomperiod);

		/******************** ActvtyDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(a.getActvtyDfnCntctTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat ActvtyDfn_Cntct_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ActvtyDfn_Cntct_Tlcm_Prd_Enddate = ActvtyDfn_Cntct_Tlcm_Prd_Endsdf.parse(a.getActvtyDfnCntctTlcmPrdEnd());
			activitydefinitioncontacttelecomperiod.setEnd(ActvtyDfn_Cntct_Tlcm_Prd_Enddate);
		}
		/******************** ActvtyDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(a.getActvtyDfnCntctTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat ActvtyDfn_Cntct_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ActvtyDfn_Cntct_Tlcm_Prd_Strtdate = ActvtyDfn_Cntct_Tlcm_Prd_Strtsdf.parse(a.getActvtyDfnCntctTlcmPrdStrt());
			activitydefinitioncontacttelecomperiod.setStart(ActvtyDfn_Cntct_Tlcm_Prd_Strtdate);
		}
		/******************** ActvtyDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(a.getActvtyDfnCntctTlcmRnk() != null) {
			activitydefinitioncontacttelecom.setRank(Integer.parseInt(a.getActvtyDfnCntctTlcmRnk()));
		}
		/******************** activitydefinitioncontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory activitydefinitioncontacttelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		activitydefinitioncontacttelecom.setSystem(activitydefinitioncontacttelecomsystem.fromCode(a.getActvtyDfnCntctTlcmSys()));

		/******************** activitydefinitioncontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory activitydefinitioncontacttelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		activitydefinitioncontacttelecom.setUse(activitydefinitioncontacttelecomuse.fromCode(a.getActvtyDfnCntctTlcmUse()));

		/******************** ActvtyDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(a.getActvtyDfnCntctTlcmVl() != null) {
			activitydefinitioncontacttelecom.setValue(a.getActvtyDfnCntctTlcmVl());
		}
		/******************** ActvtyDfn_Copyright ********************************************************************************/
		if(a.getActvtyDfnCopyright() != null) {
			activitydefinition.setCopyright(a.getActvtyDfnCopyright());
		}
		/******************** ActvtyDfn_Dt ********************************************************************************/
		if(a.getActvtyDfnDt() != null) {
			java.text.SimpleDateFormat ActvtyDfn_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ActvtyDfn_Dtdate = ActvtyDfn_Dtsdf.parse(a.getActvtyDfnDt());
			activitydefinition.setDate(ActvtyDfn_Dtdate);
		}
		/******************** ActvtyDfn_Dscrptn ********************************************************************************/
		if(a.getActvtyDfnDscrptn() != null) {
			activitydefinition.setDescription(a.getActvtyDfnDscrptn());
		}
		/******************** ActvtyDfn_DoNotPerform ********************************************************************************/
		if(a.getActvtyDfnDoNotPerform() != null) {
			activitydefinition.setDoNotPerform(Boolean.parseBoolean(a.getActvtyDfnDoNotPerform()));
		}
		/******************** activitydefinitiondosage ********************************************************************************/
		org.hl7.fhir.r4.model.Dosage activitydefinitiondosage =  new org.hl7.fhir.r4.model.Dosage();
		activitydefinition.addDosage(activitydefinitiondosage);

		/******************** activitydefinitiondosageadditionalinstruction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitiondosageadditionalinstruction =  new org.hl7.fhir.r4.model.CodeableConcept();
		activitydefinitiondosage.addAdditionalInstruction(activitydefinitiondosageadditionalinstruction);

		/******************** activitydefinitiondosageadditionalinstructioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitiondosageadditionalinstructioncoding =  new org.hl7.fhir.r4.model.Coding();
		activitydefinitiondosageadditionalinstruction.addCoding(activitydefinitiondosageadditionalinstructioncoding);

		/******************** ActvtyDfn_Dsg_AddtnlInstrctn_Cdg_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgAddtnlInstrctnCdgCd() != null) {
			activitydefinitiondosageadditionalinstructioncoding.setCode(a.getActvtyDfnDsgAddtnlInstrctnCdgCd());
		}
		/******************** ActvtyDfn_Dsg_AddtnlInstrctn_Cdg_Dsply ********************************************************************************/
		if(a.getActvtyDfnDsgAddtnlInstrctnCdgDsply() != null) {
			activitydefinitiondosageadditionalinstructioncoding.setDisplay(a.getActvtyDfnDsgAddtnlInstrctnCdgDsply());
		}
		/******************** ActvtyDfn_Dsg_AddtnlInstrctn_Cdg_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgAddtnlInstrctnCdgSys() != null) {
			activitydefinitiondosageadditionalinstructioncoding.setSystem(a.getActvtyDfnDsgAddtnlInstrctnCdgSys());
		}
		/******************** ActvtyDfn_Dsg_AddtnlInstrctn_Cdg_UsrSltd ********************************************************************************/
		if(a.getActvtyDfnDsgAddtnlInstrctnCdgUsrSltd() != null) {
			activitydefinitiondosageadditionalinstructioncoding.setUserSelected(Boolean.parseBoolean(a.getActvtyDfnDsgAddtnlInstrctnCdgUsrSltd()));
		}
		/******************** ActvtyDfn_Dsg_AddtnlInstrctn_Cdg_Vrsn ********************************************************************************/
		if(a.getActvtyDfnDsgAddtnlInstrctnCdgVrsn() != null) {
			activitydefinitiondosageadditionalinstructioncoding.setVersion(a.getActvtyDfnDsgAddtnlInstrctnCdgVrsn());
		}
		/******************** ActvtyDfn_Dsg_AddtnlInstrctn_Txt ********************************************************************************/
		if(a.getActvtyDfnDsgAddtnlInstrctnTxt() != null) {
			activitydefinitiondosageadditionalinstruction.setText(a.getActvtyDfnDsgAddtnlInstrctnTxt());
		}
		/******************** ActvtyDfn_Dsg_AsNdBooleanTyp ********************************************************************************/
		if(a.getActvtyDfnDsgAsNdBooleanTyp() != null) {
			activitydefinitiondosage.setAsNeeded( new org.hl7.fhir.r4.model.BooleanType(a.getActvtyDfnDsgAsNdBooleanTyp()));
		}
		/******************** activitydefinitiondosageasneededcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitiondosageasneededcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		activitydefinitiondosage.setAsNeeded(activitydefinitiondosageasneededcodeableconcept);

		/******************** activitydefinitiondosageasneededcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitiondosageasneededcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		activitydefinitiondosageasneededcodeableconcept.addCoding(activitydefinitiondosageasneededcodeableconceptcoding);

		/******************** ActvtyDfn_Dsg_AsNdCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgAsNdCdbleCncptCdgCd() != null) {
			activitydefinitiondosageasneededcodeableconceptcoding.setCode(a.getActvtyDfnDsgAsNdCdbleCncptCdgCd());
		}
		/******************** ActvtyDfn_Dsg_AsNdCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(a.getActvtyDfnDsgAsNdCdbleCncptCdgDsply() != null) {
			activitydefinitiondosageasneededcodeableconceptcoding.setDisplay(a.getActvtyDfnDsgAsNdCdbleCncptCdgDsply());
		}
		/******************** ActvtyDfn_Dsg_AsNdCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgAsNdCdbleCncptCdgSys() != null) {
			activitydefinitiondosageasneededcodeableconceptcoding.setSystem(a.getActvtyDfnDsgAsNdCdbleCncptCdgSys());
		}
		/******************** ActvtyDfn_Dsg_AsNdCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(a.getActvtyDfnDsgAsNdCdbleCncptCdgUsrSltd() != null) {
			activitydefinitiondosageasneededcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(a.getActvtyDfnDsgAsNdCdbleCncptCdgUsrSltd()));
		}
		/******************** ActvtyDfn_Dsg_AsNdCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(a.getActvtyDfnDsgAsNdCdbleCncptCdgVrsn() != null) {
			activitydefinitiondosageasneededcodeableconceptcoding.setVersion(a.getActvtyDfnDsgAsNdCdbleCncptCdgVrsn());
		}
		/******************** ActvtyDfn_Dsg_AsNdCdbleCncpt_Txt ********************************************************************************/
		if(a.getActvtyDfnDsgAsNdCdbleCncptTxt() != null) {
			activitydefinitiondosageasneededcodeableconcept.setText(a.getActvtyDfnDsgAsNdCdbleCncptTxt());
		}
		/******************** activitydefinitiondosagedoseandrate ********************************************************************************/
		org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent activitydefinitiondosagedoseandrate =  new org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent();
		activitydefinitiondosage.addDoseAndRate(activitydefinitiondosagedoseandrate);

		/******************** activitydefinitiondosagedoseandratedosequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagedoseandratedosequantity =  new org.hl7.fhir.r4.model.Quantity();
		activitydefinitiondosagedoseandrate.setDose(activitydefinitiondosagedoseandratedosequantity);

		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseQnty_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtDoseQntyCd() != null) {
			activitydefinitiondosagedoseandratedosequantity.setCode(a.getActvtyDfnDsgDoseAndRtDoseQntyCd());
		}
		/******************** activitydefinitiondosagedoseandratedosequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory activitydefinitiondosagedoseandratedosequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		activitydefinitiondosagedoseandratedosequantity.setComparator(activitydefinitiondosagedoseandratedosequantitycomparator.fromCode(a.getActvtyDfnDsgDoseAndRtDoseQntyCmprtr()));

		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseQnty_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtDoseQntySys() != null) {
			activitydefinitiondosagedoseandratedosequantity.setSystem(a.getActvtyDfnDsgDoseAndRtDoseQntySys());
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseQnty_Unt ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtDoseQntyUnt() != null) {
			activitydefinitiondosagedoseandratedosequantity.setUnit(a.getActvtyDfnDsgDoseAndRtDoseQntyUnt());
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseQnty_Vl ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtDoseQntyVl() != null) {
			activitydefinitiondosagedoseandratedosequantity.setValue(Double.parseDouble((a.getActvtyDfnDsgDoseAndRtDoseQntyVl())));
		}
		/******************** activitydefinitiondosagedoseandratedoserange ********************************************************************************/
		org.hl7.fhir.r4.model.Range activitydefinitiondosagedoseandratedoserange =  new org.hl7.fhir.r4.model.Range();
		activitydefinitiondosagedoseandrate.setDose(activitydefinitiondosagedoseandratedoserange);

		/******************** activitydefinitiondosagedoseandratedoserangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagedoseandratedoserangehigh =  new org.hl7.fhir.r4.model.Quantity();
		activitydefinitiondosagedoseandratedoserange.setHigh(activitydefinitiondosagedoseandratedoserangehigh);

		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseRng_Hi_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtDoseRngHiCd() != null) {
			activitydefinitiondosagedoseandratedoserangehigh.setCode(a.getActvtyDfnDsgDoseAndRtDoseRngHiCd());
		}
		/******************** activitydefinitiondosagedoseandratedoserangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory activitydefinitiondosagedoseandratedoserangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		activitydefinitiondosagedoseandratedoserangehigh.setComparator(activitydefinitiondosagedoseandratedoserangehighcomparator.fromCode(a.getActvtyDfnDsgDoseAndRtDoseRngHiCmprtr()));

		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseRng_Hi_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtDoseRngHiSys() != null) {
			activitydefinitiondosagedoseandratedoserangehigh.setSystem(a.getActvtyDfnDsgDoseAndRtDoseRngHiSys());
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseRng_Hi_Unt ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtDoseRngHiUnt() != null) {
			activitydefinitiondosagedoseandratedoserangehigh.setUnit(a.getActvtyDfnDsgDoseAndRtDoseRngHiUnt());
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseRng_Hi_Vl ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtDoseRngHiVl() != null) {
			activitydefinitiondosagedoseandratedoserangehigh.setValue(Double.parseDouble((a.getActvtyDfnDsgDoseAndRtDoseRngHiVl())));
		}
		/******************** activitydefinitiondosagedoseandratedoserangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagedoseandratedoserangelow =  new org.hl7.fhir.r4.model.Quantity();
		activitydefinitiondosagedoseandratedoserange.setLow(activitydefinitiondosagedoseandratedoserangelow);

		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseRng_Lw_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtDoseRngLwCd() != null) {
			activitydefinitiondosagedoseandratedoserangelow.setCode(a.getActvtyDfnDsgDoseAndRtDoseRngLwCd());
		}
		/******************** activitydefinitiondosagedoseandratedoserangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory activitydefinitiondosagedoseandratedoserangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		activitydefinitiondosagedoseandratedoserangelow.setComparator(activitydefinitiondosagedoseandratedoserangelowcomparator.fromCode(a.getActvtyDfnDsgDoseAndRtDoseRngLwCmprtr()));

		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseRng_Lw_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtDoseRngLwSys() != null) {
			activitydefinitiondosagedoseandratedoserangelow.setSystem(a.getActvtyDfnDsgDoseAndRtDoseRngLwSys());
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseRng_Lw_Unt ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtDoseRngLwUnt() != null) {
			activitydefinitiondosagedoseandratedoserangelow.setUnit(a.getActvtyDfnDsgDoseAndRtDoseRngLwUnt());
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseRng_Lw_Vl ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtDoseRngLwVl() != null) {
			activitydefinitiondosagedoseandratedoserangelow.setValue(Double.parseDouble((a.getActvtyDfnDsgDoseAndRtDoseRngLwVl())));
		}
		/******************** activitydefinitiondosagedoseandrateratequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagedoseandrateratequantity =  new org.hl7.fhir.r4.model.Quantity();
		activitydefinitiondosagedoseandrate.setRate(activitydefinitiondosagedoseandrateratequantity);

		/******************** ActvtyDfn_Dsg_DoseAndRt_RtQnty_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtQntyCd() != null) {
			activitydefinitiondosagedoseandrateratequantity.setCode(a.getActvtyDfnDsgDoseAndRtRtQntyCd());
		}
		/******************** activitydefinitiondosagedoseandrateratequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory activitydefinitiondosagedoseandrateratequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		activitydefinitiondosagedoseandrateratequantity.setComparator(activitydefinitiondosagedoseandrateratequantitycomparator.fromCode(a.getActvtyDfnDsgDoseAndRtRtQntyCmprtr()));

		/******************** ActvtyDfn_Dsg_DoseAndRt_RtQnty_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtQntySys() != null) {
			activitydefinitiondosagedoseandrateratequantity.setSystem(a.getActvtyDfnDsgDoseAndRtRtQntySys());
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtQnty_Unt ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtQntyUnt() != null) {
			activitydefinitiondosagedoseandrateratequantity.setUnit(a.getActvtyDfnDsgDoseAndRtRtQntyUnt());
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtQnty_Vl ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtQntyVl() != null) {
			activitydefinitiondosagedoseandrateratequantity.setValue(Double.parseDouble((a.getActvtyDfnDsgDoseAndRtRtQntyVl())));
		}
		/******************** activitydefinitiondosagedoseandrateraterange ********************************************************************************/
		org.hl7.fhir.r4.model.Range activitydefinitiondosagedoseandrateraterange =  new org.hl7.fhir.r4.model.Range();
		activitydefinitiondosagedoseandrate.setRate(activitydefinitiondosagedoseandrateraterange);

		/******************** activitydefinitiondosagedoseandrateraterangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagedoseandrateraterangehigh =  new org.hl7.fhir.r4.model.Quantity();
		activitydefinitiondosagedoseandrateraterange.setHigh(activitydefinitiondosagedoseandrateraterangehigh);

		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRng_Hi_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtRngHiCd() != null) {
			activitydefinitiondosagedoseandrateraterangehigh.setCode(a.getActvtyDfnDsgDoseAndRtRtRngHiCd());
		}
		/******************** activitydefinitiondosagedoseandrateraterangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory activitydefinitiondosagedoseandrateraterangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		activitydefinitiondosagedoseandrateraterangehigh.setComparator(activitydefinitiondosagedoseandrateraterangehighcomparator.fromCode(a.getActvtyDfnDsgDoseAndRtRtRngHiCmprtr()));

		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRng_Hi_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtRngHiSys() != null) {
			activitydefinitiondosagedoseandrateraterangehigh.setSystem(a.getActvtyDfnDsgDoseAndRtRtRngHiSys());
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRng_Hi_Unt ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtRngHiUnt() != null) {
			activitydefinitiondosagedoseandrateraterangehigh.setUnit(a.getActvtyDfnDsgDoseAndRtRtRngHiUnt());
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRng_Hi_Vl ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtRngHiVl() != null) {
			activitydefinitiondosagedoseandrateraterangehigh.setValue(Double.parseDouble((a.getActvtyDfnDsgDoseAndRtRtRngHiVl())));
		}
		/******************** activitydefinitiondosagedoseandrateraterangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagedoseandrateraterangelow =  new org.hl7.fhir.r4.model.Quantity();
		activitydefinitiondosagedoseandrateraterange.setLow(activitydefinitiondosagedoseandrateraterangelow);

		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRng_Lw_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtRngLwCd() != null) {
			activitydefinitiondosagedoseandrateraterangelow.setCode(a.getActvtyDfnDsgDoseAndRtRtRngLwCd());
		}
		/******************** activitydefinitiondosagedoseandrateraterangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory activitydefinitiondosagedoseandrateraterangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		activitydefinitiondosagedoseandrateraterangelow.setComparator(activitydefinitiondosagedoseandrateraterangelowcomparator.fromCode(a.getActvtyDfnDsgDoseAndRtRtRngLwCmprtr()));

		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRng_Lw_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtRngLwSys() != null) {
			activitydefinitiondosagedoseandrateraterangelow.setSystem(a.getActvtyDfnDsgDoseAndRtRtRngLwSys());
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRng_Lw_Unt ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtRngLwUnt() != null) {
			activitydefinitiondosagedoseandrateraterangelow.setUnit(a.getActvtyDfnDsgDoseAndRtRtRngLwUnt());
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRng_Lw_Vl ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtRngLwVl() != null) {
			activitydefinitiondosagedoseandrateraterangelow.setValue(Double.parseDouble((a.getActvtyDfnDsgDoseAndRtRtRngLwVl())));
		}
		/******************** activitydefinitiondosagedoseandraterateratio ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio activitydefinitiondosagedoseandraterateratio =  new org.hl7.fhir.r4.model.Ratio();
		activitydefinitiondosagedoseandrate.setRate(activitydefinitiondosagedoseandraterateratio);

		/******************** activitydefinitiondosagedoseandraterateratiodenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagedoseandraterateratiodenominator =  new org.hl7.fhir.r4.model.Quantity();
		activitydefinitiondosagedoseandraterateratio.setDenominator(activitydefinitiondosagedoseandraterateratiodenominator);

		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRtio_Dnmntr_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtRtioDnmntrCd() != null) {
			activitydefinitiondosagedoseandraterateratiodenominator.setCode(a.getActvtyDfnDsgDoseAndRtRtRtioDnmntrCd());
		}
		/******************** activitydefinitiondosagedoseandraterateratiodenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory activitydefinitiondosagedoseandraterateratiodenominatorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		activitydefinitiondosagedoseandraterateratiodenominator.setComparator(activitydefinitiondosagedoseandraterateratiodenominatorcomparator.fromCode(a.getActvtyDfnDsgDoseAndRtRtRtioDnmntrCmprtr()));

		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRtio_Dnmntr_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtRtioDnmntrSys() != null) {
			activitydefinitiondosagedoseandraterateratiodenominator.setSystem(a.getActvtyDfnDsgDoseAndRtRtRtioDnmntrSys());
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRtio_Dnmntr_Unt ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtRtioDnmntrUnt() != null) {
			activitydefinitiondosagedoseandraterateratiodenominator.setUnit(a.getActvtyDfnDsgDoseAndRtRtRtioDnmntrUnt());
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRtio_Dnmntr_Vl ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtRtioDnmntrVl() != null) {
			activitydefinitiondosagedoseandraterateratiodenominator.setValue(Double.parseDouble((a.getActvtyDfnDsgDoseAndRtRtRtioDnmntrVl())));
		}
		/******************** activitydefinitiondosagedoseandrateraterationumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagedoseandrateraterationumerator =  new org.hl7.fhir.r4.model.Quantity();
		activitydefinitiondosagedoseandraterateratio.setNumerator(activitydefinitiondosagedoseandrateraterationumerator);

		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRtio_Nmrtr_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtRtioNmrtrCd() != null) {
			activitydefinitiondosagedoseandrateraterationumerator.setCode(a.getActvtyDfnDsgDoseAndRtRtRtioNmrtrCd());
		}
		/******************** activitydefinitiondosagedoseandrateraterationumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory activitydefinitiondosagedoseandrateraterationumeratorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		activitydefinitiondosagedoseandrateraterationumerator.setComparator(activitydefinitiondosagedoseandrateraterationumeratorcomparator.fromCode(a.getActvtyDfnDsgDoseAndRtRtRtioNmrtrCmprtr()));

		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRtio_Nmrtr_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtRtioNmrtrSys() != null) {
			activitydefinitiondosagedoseandrateraterationumerator.setSystem(a.getActvtyDfnDsgDoseAndRtRtRtioNmrtrSys());
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRtio_Nmrtr_Unt ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtRtioNmrtrUnt() != null) {
			activitydefinitiondosagedoseandrateraterationumerator.setUnit(a.getActvtyDfnDsgDoseAndRtRtRtioNmrtrUnt());
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRtio_Nmrtr_Vl ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtRtioNmrtrVl() != null) {
			activitydefinitiondosagedoseandrateraterationumerator.setValue(Double.parseDouble((a.getActvtyDfnDsgDoseAndRtRtRtioNmrtrVl())));
		}
		/******************** activitydefinitiondosagedoseandratetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitiondosagedoseandratetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		activitydefinitiondosagedoseandrate.setType(activitydefinitiondosagedoseandratetype);

		/******************** activitydefinitiondosagedoseandratetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitiondosagedoseandratetypecoding =  new org.hl7.fhir.r4.model.Coding();
		activitydefinitiondosagedoseandratetype.addCoding(activitydefinitiondosagedoseandratetypecoding);

		/******************** ActvtyDfn_Dsg_DoseAndRt_Typ_Cdg_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtTypCdgCd() != null) {
			activitydefinitiondosagedoseandratetypecoding.setCode(a.getActvtyDfnDsgDoseAndRtTypCdgCd());
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_Typ_Cdg_Dsply ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtTypCdgDsply() != null) {
			activitydefinitiondosagedoseandratetypecoding.setDisplay(a.getActvtyDfnDsgDoseAndRtTypCdgDsply());
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_Typ_Cdg_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtTypCdgSys() != null) {
			activitydefinitiondosagedoseandratetypecoding.setSystem(a.getActvtyDfnDsgDoseAndRtTypCdgSys());
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtTypCdgUsrSltd() != null) {
			activitydefinitiondosagedoseandratetypecoding.setUserSelected(Boolean.parseBoolean(a.getActvtyDfnDsgDoseAndRtTypCdgUsrSltd()));
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_Typ_Cdg_Vrsn ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtTypCdgVrsn() != null) {
			activitydefinitiondosagedoseandratetypecoding.setVersion(a.getActvtyDfnDsgDoseAndRtTypCdgVrsn());
		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_Typ_Txt ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtTypTxt() != null) {
			activitydefinitiondosagedoseandratetype.setText(a.getActvtyDfnDsgDoseAndRtTypTxt());
		}
		/******************** activitydefinitiondosagemaxdoseperadministration ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagemaxdoseperadministration =  new org.hl7.fhir.r4.model.Quantity();
		activitydefinitiondosage.setMaxDosePerAdministration(activitydefinitiondosagemaxdoseperadministration);

		/******************** ActvtyDfn_Dsg_MxDosePerAdmnstn_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgMxDosePerAdmnstnCd() != null) {
			activitydefinitiondosagemaxdoseperadministration.setCode(a.getActvtyDfnDsgMxDosePerAdmnstnCd());
		}
		/******************** activitydefinitiondosagemaxdoseperadministrationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory activitydefinitiondosagemaxdoseperadministrationcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		activitydefinitiondosagemaxdoseperadministration.setComparator(activitydefinitiondosagemaxdoseperadministrationcomparator.fromCode(a.getActvtyDfnDsgMxDosePerAdmnstnCmprtr()));

		/******************** ActvtyDfn_Dsg_MxDosePerAdmnstn_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgMxDosePerAdmnstnSys() != null) {
			activitydefinitiondosagemaxdoseperadministration.setSystem(a.getActvtyDfnDsgMxDosePerAdmnstnSys());
		}
		/******************** ActvtyDfn_Dsg_MxDosePerAdmnstn_Unt ********************************************************************************/
		if(a.getActvtyDfnDsgMxDosePerAdmnstnUnt() != null) {
			activitydefinitiondosagemaxdoseperadministration.setUnit(a.getActvtyDfnDsgMxDosePerAdmnstnUnt());
		}
		/******************** ActvtyDfn_Dsg_MxDosePerAdmnstn_Vl ********************************************************************************/
		if(a.getActvtyDfnDsgMxDosePerAdmnstnVl() != null) {
			activitydefinitiondosagemaxdoseperadministration.setValue(Double.parseDouble((a.getActvtyDfnDsgMxDosePerAdmnstnVl())));
		}
		/******************** activitydefinitiondosagemaxdoseperlifetime ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagemaxdoseperlifetime =  new org.hl7.fhir.r4.model.Quantity();
		activitydefinitiondosage.setMaxDosePerLifetime(activitydefinitiondosagemaxdoseperlifetime);

		/******************** ActvtyDfn_Dsg_MxDosePerLifetime_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgMxDosePerLifetimeCd() != null) {
			activitydefinitiondosagemaxdoseperlifetime.setCode(a.getActvtyDfnDsgMxDosePerLifetimeCd());
		}
		/******************** activitydefinitiondosagemaxdoseperlifetimecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory activitydefinitiondosagemaxdoseperlifetimecomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		activitydefinitiondosagemaxdoseperlifetime.setComparator(activitydefinitiondosagemaxdoseperlifetimecomparator.fromCode(a.getActvtyDfnDsgMxDosePerLifetimeCmprtr()));

		/******************** ActvtyDfn_Dsg_MxDosePerLifetime_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgMxDosePerLifetimeSys() != null) {
			activitydefinitiondosagemaxdoseperlifetime.setSystem(a.getActvtyDfnDsgMxDosePerLifetimeSys());
		}
		/******************** ActvtyDfn_Dsg_MxDosePerLifetime_Unt ********************************************************************************/
		if(a.getActvtyDfnDsgMxDosePerLifetimeUnt() != null) {
			activitydefinitiondosagemaxdoseperlifetime.setUnit(a.getActvtyDfnDsgMxDosePerLifetimeUnt());
		}
		/******************** ActvtyDfn_Dsg_MxDosePerLifetime_Vl ********************************************************************************/
		if(a.getActvtyDfnDsgMxDosePerLifetimeVl() != null) {
			activitydefinitiondosagemaxdoseperlifetime.setValue(Double.parseDouble((a.getActvtyDfnDsgMxDosePerLifetimeVl())));
		}
		/******************** activitydefinitiondosagemaxdoseperperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio activitydefinitiondosagemaxdoseperperiod =  new org.hl7.fhir.r4.model.Ratio();
		activitydefinitiondosage.setMaxDosePerPeriod(activitydefinitiondosagemaxdoseperperiod);

		/******************** activitydefinitiondosagemaxdoseperperioddenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagemaxdoseperperioddenominator =  new org.hl7.fhir.r4.model.Quantity();
		activitydefinitiondosagemaxdoseperperiod.setDenominator(activitydefinitiondosagemaxdoseperperioddenominator);

		/******************** ActvtyDfn_Dsg_MxDosePerPrd_Dnmntr_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgMxDosePerPrdDnmntrCd() != null) {
			activitydefinitiondosagemaxdoseperperioddenominator.setCode(a.getActvtyDfnDsgMxDosePerPrdDnmntrCd());
		}
		/******************** activitydefinitiondosagemaxdoseperperioddenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory activitydefinitiondosagemaxdoseperperioddenominatorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		activitydefinitiondosagemaxdoseperperioddenominator.setComparator(activitydefinitiondosagemaxdoseperperioddenominatorcomparator.fromCode(a.getActvtyDfnDsgMxDosePerPrdDnmntrCmprtr()));

		/******************** ActvtyDfn_Dsg_MxDosePerPrd_Dnmntr_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgMxDosePerPrdDnmntrSys() != null) {
			activitydefinitiondosagemaxdoseperperioddenominator.setSystem(a.getActvtyDfnDsgMxDosePerPrdDnmntrSys());
		}
		/******************** ActvtyDfn_Dsg_MxDosePerPrd_Dnmntr_Unt ********************************************************************************/
		if(a.getActvtyDfnDsgMxDosePerPrdDnmntrUnt() != null) {
			activitydefinitiondosagemaxdoseperperioddenominator.setUnit(a.getActvtyDfnDsgMxDosePerPrdDnmntrUnt());
		}
		/******************** ActvtyDfn_Dsg_MxDosePerPrd_Dnmntr_Vl ********************************************************************************/
		if(a.getActvtyDfnDsgMxDosePerPrdDnmntrVl() != null) {
			activitydefinitiondosagemaxdoseperperioddenominator.setValue(Double.parseDouble((a.getActvtyDfnDsgMxDosePerPrdDnmntrVl())));
		}
		/******************** activitydefinitiondosagemaxdoseperperiodnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagemaxdoseperperiodnumerator =  new org.hl7.fhir.r4.model.Quantity();
		activitydefinitiondosagemaxdoseperperiod.setNumerator(activitydefinitiondosagemaxdoseperperiodnumerator);

		/******************** ActvtyDfn_Dsg_MxDosePerPrd_Nmrtr_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgMxDosePerPrdNmrtrCd() != null) {
			activitydefinitiondosagemaxdoseperperiodnumerator.setCode(a.getActvtyDfnDsgMxDosePerPrdNmrtrCd());
		}
		/******************** activitydefinitiondosagemaxdoseperperiodnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory activitydefinitiondosagemaxdoseperperiodnumeratorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		activitydefinitiondosagemaxdoseperperiodnumerator.setComparator(activitydefinitiondosagemaxdoseperperiodnumeratorcomparator.fromCode(a.getActvtyDfnDsgMxDosePerPrdNmrtrCmprtr()));

		/******************** ActvtyDfn_Dsg_MxDosePerPrd_Nmrtr_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgMxDosePerPrdNmrtrSys() != null) {
			activitydefinitiondosagemaxdoseperperiodnumerator.setSystem(a.getActvtyDfnDsgMxDosePerPrdNmrtrSys());
		}
		/******************** ActvtyDfn_Dsg_MxDosePerPrd_Nmrtr_Unt ********************************************************************************/
		if(a.getActvtyDfnDsgMxDosePerPrdNmrtrUnt() != null) {
			activitydefinitiondosagemaxdoseperperiodnumerator.setUnit(a.getActvtyDfnDsgMxDosePerPrdNmrtrUnt());
		}
		/******************** ActvtyDfn_Dsg_MxDosePerPrd_Nmrtr_Vl ********************************************************************************/
		if(a.getActvtyDfnDsgMxDosePerPrdNmrtrVl() != null) {
			activitydefinitiondosagemaxdoseperperiodnumerator.setValue(Double.parseDouble((a.getActvtyDfnDsgMxDosePerPrdNmrtrVl())));
		}
		/******************** activitydefinitiondosagemethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitiondosagemethod =  new org.hl7.fhir.r4.model.CodeableConcept();
		activitydefinitiondosage.setMethod(activitydefinitiondosagemethod);

		/******************** activitydefinitiondosagemethodcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitiondosagemethodcoding =  new org.hl7.fhir.r4.model.Coding();
		activitydefinitiondosagemethod.addCoding(activitydefinitiondosagemethodcoding);

		/******************** ActvtyDfn_Dsg_Mthd_Cdg_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgMthdCdgCd() != null) {
			activitydefinitiondosagemethodcoding.setCode(a.getActvtyDfnDsgMthdCdgCd());
		}
		/******************** ActvtyDfn_Dsg_Mthd_Cdg_Dsply ********************************************************************************/
		if(a.getActvtyDfnDsgMthdCdgDsply() != null) {
			activitydefinitiondosagemethodcoding.setDisplay(a.getActvtyDfnDsgMthdCdgDsply());
		}
		/******************** ActvtyDfn_Dsg_Mthd_Cdg_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgMthdCdgSys() != null) {
			activitydefinitiondosagemethodcoding.setSystem(a.getActvtyDfnDsgMthdCdgSys());
		}
		/******************** ActvtyDfn_Dsg_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(a.getActvtyDfnDsgMthdCdgUsrSltd() != null) {
			activitydefinitiondosagemethodcoding.setUserSelected(Boolean.parseBoolean(a.getActvtyDfnDsgMthdCdgUsrSltd()));
		}
		/******************** ActvtyDfn_Dsg_Mthd_Cdg_Vrsn ********************************************************************************/
		if(a.getActvtyDfnDsgMthdCdgVrsn() != null) {
			activitydefinitiondosagemethodcoding.setVersion(a.getActvtyDfnDsgMthdCdgVrsn());
		}
		/******************** ActvtyDfn_Dsg_Mthd_Txt ********************************************************************************/
		if(a.getActvtyDfnDsgMthdTxt() != null) {
			activitydefinitiondosagemethod.setText(a.getActvtyDfnDsgMthdTxt());
		}
		/******************** ActvtyDfn_Dsg_PntInstrctn ********************************************************************************/
		if(a.getActvtyDfnDsgPntInstrctn() != null) {
			activitydefinitiondosage.setPatientInstruction(a.getActvtyDfnDsgPntInstrctn());
		}
		/******************** activitydefinitiondosageroute ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitiondosageroute =  new org.hl7.fhir.r4.model.CodeableConcept();
		activitydefinitiondosage.setRoute(activitydefinitiondosageroute);

		/******************** activitydefinitiondosageroutecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitiondosageroutecoding =  new org.hl7.fhir.r4.model.Coding();
		activitydefinitiondosageroute.addCoding(activitydefinitiondosageroutecoding);

		/******************** ActvtyDfn_Dsg_Route_Cdg_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgRouteCdgCd() != null) {
			activitydefinitiondosageroutecoding.setCode(a.getActvtyDfnDsgRouteCdgCd());
		}
		/******************** ActvtyDfn_Dsg_Route_Cdg_Dsply ********************************************************************************/
		if(a.getActvtyDfnDsgRouteCdgDsply() != null) {
			activitydefinitiondosageroutecoding.setDisplay(a.getActvtyDfnDsgRouteCdgDsply());
		}
		/******************** ActvtyDfn_Dsg_Route_Cdg_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgRouteCdgSys() != null) {
			activitydefinitiondosageroutecoding.setSystem(a.getActvtyDfnDsgRouteCdgSys());
		}
		/******************** ActvtyDfn_Dsg_Route_Cdg_UsrSltd ********************************************************************************/
		if(a.getActvtyDfnDsgRouteCdgUsrSltd() != null) {
			activitydefinitiondosageroutecoding.setUserSelected(Boolean.parseBoolean(a.getActvtyDfnDsgRouteCdgUsrSltd()));
		}
		/******************** ActvtyDfn_Dsg_Route_Cdg_Vrsn ********************************************************************************/
		if(a.getActvtyDfnDsgRouteCdgVrsn() != null) {
			activitydefinitiondosageroutecoding.setVersion(a.getActvtyDfnDsgRouteCdgVrsn());
		}
		/******************** ActvtyDfn_Dsg_Route_Txt ********************************************************************************/
		if(a.getActvtyDfnDsgRouteTxt() != null) {
			activitydefinitiondosageroute.setText(a.getActvtyDfnDsgRouteTxt());
		}
		/******************** ActvtyDfn_Dsg_Sqnc ********************************************************************************/
		if(a.getActvtyDfnDsgSqnc() != null) {
			activitydefinitiondosage.setSequence(Integer.parseInt(a.getActvtyDfnDsgSqnc()));
		}
		/******************** activitydefinitiondosagesite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitiondosagesite =  new org.hl7.fhir.r4.model.CodeableConcept();
		activitydefinitiondosage.setSite(activitydefinitiondosagesite);

		/******************** activitydefinitiondosagesitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitiondosagesitecoding =  new org.hl7.fhir.r4.model.Coding();
		activitydefinitiondosagesite.addCoding(activitydefinitiondosagesitecoding);

		/******************** ActvtyDfn_Dsg_Site_Cdg_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgSiteCdgCd() != null) {
			activitydefinitiondosagesitecoding.setCode(a.getActvtyDfnDsgSiteCdgCd());
		}
		/******************** ActvtyDfn_Dsg_Site_Cdg_Dsply ********************************************************************************/
		if(a.getActvtyDfnDsgSiteCdgDsply() != null) {
			activitydefinitiondosagesitecoding.setDisplay(a.getActvtyDfnDsgSiteCdgDsply());
		}
		/******************** ActvtyDfn_Dsg_Site_Cdg_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgSiteCdgSys() != null) {
			activitydefinitiondosagesitecoding.setSystem(a.getActvtyDfnDsgSiteCdgSys());
		}
		/******************** ActvtyDfn_Dsg_Site_Cdg_UsrSltd ********************************************************************************/
		if(a.getActvtyDfnDsgSiteCdgUsrSltd() != null) {
			activitydefinitiondosagesitecoding.setUserSelected(Boolean.parseBoolean(a.getActvtyDfnDsgSiteCdgUsrSltd()));
		}
		/******************** ActvtyDfn_Dsg_Site_Cdg_Vrsn ********************************************************************************/
		if(a.getActvtyDfnDsgSiteCdgVrsn() != null) {
			activitydefinitiondosagesitecoding.setVersion(a.getActvtyDfnDsgSiteCdgVrsn());
		}
		/******************** ActvtyDfn_Dsg_Site_Txt ********************************************************************************/
		if(a.getActvtyDfnDsgSiteTxt() != null) {
			activitydefinitiondosagesite.setText(a.getActvtyDfnDsgSiteTxt());
		}
		/******************** ActvtyDfn_Dsg_Txt ********************************************************************************/
		if(a.getActvtyDfnDsgTxt() != null) {
			activitydefinitiondosage.setText(a.getActvtyDfnDsgTxt());
		}
		/******************** activitydefinitiondosagetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing activitydefinitiondosagetiming =  new org.hl7.fhir.r4.model.Timing();
		activitydefinitiondosage.setTiming(activitydefinitiondosagetiming);

		/******************** activitydefinitiondosagetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitiondosagetimingcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		activitydefinitiondosagetiming.setCode(activitydefinitiondosagetimingcode);

		/******************** activitydefinitiondosagetimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitiondosagetimingcodecoding =  new org.hl7.fhir.r4.model.Coding();
		activitydefinitiondosagetimingcode.addCoding(activitydefinitiondosagetimingcodecoding);

		/******************** ActvtyDfn_Dsg_Tmg_Cd_Cdg_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgTmgCdCdgCd() != null) {
			activitydefinitiondosagetimingcodecoding.setCode(a.getActvtyDfnDsgTmgCdCdgCd());
		}
		/******************** ActvtyDfn_Dsg_Tmg_Cd_Cdg_Dsply ********************************************************************************/
		if(a.getActvtyDfnDsgTmgCdCdgDsply() != null) {
			activitydefinitiondosagetimingcodecoding.setDisplay(a.getActvtyDfnDsgTmgCdCdgDsply());
		}
		/******************** ActvtyDfn_Dsg_Tmg_Cd_Cdg_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgTmgCdCdgSys() != null) {
			activitydefinitiondosagetimingcodecoding.setSystem(a.getActvtyDfnDsgTmgCdCdgSys());
		}
		/******************** ActvtyDfn_Dsg_Tmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(a.getActvtyDfnDsgTmgCdCdgUsrSltd() != null) {
			activitydefinitiondosagetimingcodecoding.setUserSelected(Boolean.parseBoolean(a.getActvtyDfnDsgTmgCdCdgUsrSltd()));
		}
		/******************** ActvtyDfn_Dsg_Tmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(a.getActvtyDfnDsgTmgCdCdgVrsn() != null) {
			activitydefinitiondosagetimingcodecoding.setVersion(a.getActvtyDfnDsgTmgCdCdgVrsn());
		}
		/******************** ActvtyDfn_Dsg_Tmg_Cd_Txt ********************************************************************************/
		if(a.getActvtyDfnDsgTmgCdTxt() != null) {
			activitydefinitiondosagetimingcode.setText(a.getActvtyDfnDsgTmgCdTxt());
		}
		/******************** ActvtyDfn_Dsg_Tmg_Evnt ********************************************************************************/
		if(a.getActvtyDfnDsgTmgEvnt() != null) {
			java.text.SimpleDateFormat ActvtyDfn_Dsg_Tmg_Evntsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ActvtyDfn_Dsg_Tmg_Evntdate = ActvtyDfn_Dsg_Tmg_Evntsdf.parse(a.getActvtyDfnDsgTmgEvnt());
			activitydefinitiondosagetiming.addEvent(ActvtyDfn_Dsg_Tmg_Evntdate);
		}
		/******************** activitydefinitiondosagetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent activitydefinitiondosagetimingrepeat =  new org.hl7.fhir.r4.model.Timing.TimingRepeatComponent();
		activitydefinitiondosagetiming.setRepeat(activitydefinitiondosagetimingrepeat);

		/******************** activitydefinitiondosagetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration activitydefinitiondosagetimingrepeatboundsduration =  new org.hl7.fhir.r4.model.Duration();
		activitydefinitiondosagetimingrepeat.setBounds(activitydefinitiondosagetimingrepeatboundsduration);

		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptBndsDurationCd() != null) {
			activitydefinitiondosagetimingrepeatboundsduration.setCode(a.getActvtyDfnDsgTmgRptBndsDurationCd());
		}
		/******************** activitydefinitiondosagetimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory activitydefinitiondosagetimingrepeatboundsdurationcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		activitydefinitiondosagetimingrepeatboundsduration.setComparator(activitydefinitiondosagetimingrepeatboundsdurationcomparator.fromCode(a.getActvtyDfnDsgTmgRptBndsDurationCmprtr()));

		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptBndsDurationSys() != null) {
			activitydefinitiondosagetimingrepeatboundsduration.setSystem(a.getActvtyDfnDsgTmgRptBndsDurationSys());
		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptBndsDurationUnt() != null) {
			activitydefinitiondosagetimingrepeatboundsduration.setUnit(a.getActvtyDfnDsgTmgRptBndsDurationUnt());
		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptBndsDurationVl() != null) {
			activitydefinitiondosagetimingrepeatboundsduration.setValue(Double.parseDouble((a.getActvtyDfnDsgTmgRptBndsDurationVl())));
		}
		/******************** activitydefinitiondosagetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period activitydefinitiondosagetimingrepeatboundsperiod =  new org.hl7.fhir.r4.model.Period();
		activitydefinitiondosagetimingrepeat.setBounds(activitydefinitiondosagetimingrepeatboundsperiod);

		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsPrd_End ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptBndsPrdEnd() != null) {
			java.text.SimpleDateFormat ActvtyDfn_Dsg_Tmg_Rpt_BndsPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ActvtyDfn_Dsg_Tmg_Rpt_BndsPrd_Enddate = ActvtyDfn_Dsg_Tmg_Rpt_BndsPrd_Endsdf.parse(a.getActvtyDfnDsgTmgRptBndsPrdEnd());
			activitydefinitiondosagetimingrepeatboundsperiod.setEnd(ActvtyDfn_Dsg_Tmg_Rpt_BndsPrd_Enddate);
		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptBndsPrdStrt() != null) {
			java.text.SimpleDateFormat ActvtyDfn_Dsg_Tmg_Rpt_BndsPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ActvtyDfn_Dsg_Tmg_Rpt_BndsPrd_Strtdate = ActvtyDfn_Dsg_Tmg_Rpt_BndsPrd_Strtsdf.parse(a.getActvtyDfnDsgTmgRptBndsPrdStrt());
			activitydefinitiondosagetimingrepeatboundsperiod.setStart(ActvtyDfn_Dsg_Tmg_Rpt_BndsPrd_Strtdate);
		}
		/******************** activitydefinitiondosagetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range activitydefinitiondosagetimingrepeatboundsrange =  new org.hl7.fhir.r4.model.Range();
		activitydefinitiondosagetimingrepeat.setBounds(activitydefinitiondosagetimingrepeatboundsrange);

		/******************** activitydefinitiondosagetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagetimingrepeatboundsrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		activitydefinitiondosagetimingrepeatboundsrange.setHigh(activitydefinitiondosagetimingrepeatboundsrangehigh);

		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptBndsRngHiCd() != null) {
			activitydefinitiondosagetimingrepeatboundsrangehigh.setCode(a.getActvtyDfnDsgTmgRptBndsRngHiCd());
		}
		/******************** activitydefinitiondosagetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory activitydefinitiondosagetimingrepeatboundsrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		activitydefinitiondosagetimingrepeatboundsrangehigh.setComparator(activitydefinitiondosagetimingrepeatboundsrangehighcomparator.fromCode(a.getActvtyDfnDsgTmgRptBndsRngHiCmprtr()));

		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptBndsRngHiSys() != null) {
			activitydefinitiondosagetimingrepeatboundsrangehigh.setSystem(a.getActvtyDfnDsgTmgRptBndsRngHiSys());
		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptBndsRngHiUnt() != null) {
			activitydefinitiondosagetimingrepeatboundsrangehigh.setUnit(a.getActvtyDfnDsgTmgRptBndsRngHiUnt());
		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptBndsRngHiVl() != null) {
			activitydefinitiondosagetimingrepeatboundsrangehigh.setValue(Double.parseDouble((a.getActvtyDfnDsgTmgRptBndsRngHiVl())));
		}
		/******************** activitydefinitiondosagetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiondosagetimingrepeatboundsrangelow =  new org.hl7.fhir.r4.model.Quantity();
		activitydefinitiondosagetimingrepeatboundsrange.setLow(activitydefinitiondosagetimingrepeatboundsrangelow);

		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptBndsRngLwCd() != null) {
			activitydefinitiondosagetimingrepeatboundsrangelow.setCode(a.getActvtyDfnDsgTmgRptBndsRngLwCd());
		}
		/******************** activitydefinitiondosagetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory activitydefinitiondosagetimingrepeatboundsrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		activitydefinitiondosagetimingrepeatboundsrangelow.setComparator(activitydefinitiondosagetimingrepeatboundsrangelowcomparator.fromCode(a.getActvtyDfnDsgTmgRptBndsRngLwCmprtr()));

		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptBndsRngLwSys() != null) {
			activitydefinitiondosagetimingrepeatboundsrangelow.setSystem(a.getActvtyDfnDsgTmgRptBndsRngLwSys());
		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptBndsRngLwUnt() != null) {
			activitydefinitiondosagetimingrepeatboundsrangelow.setUnit(a.getActvtyDfnDsgTmgRptBndsRngLwUnt());
		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptBndsRngLwVl() != null) {
			activitydefinitiondosagetimingrepeatboundsrangelow.setValue(Double.parseDouble((a.getActvtyDfnDsgTmgRptBndsRngLwVl())));
		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_Cnt ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptCnt() != null) {
			activitydefinitiondosagetimingrepeat.setCount(Integer.parseInt(a.getActvtyDfnDsgTmgRptCnt()));
		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_CntMx ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptCntMx() != null) {
			activitydefinitiondosagetimingrepeat.setCountMax(Integer.parseInt(a.getActvtyDfnDsgTmgRptCntMx()));
		}
		/******************** activitydefinitiondosagetimingrepeatdayofweek ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory activitydefinitiondosagetimingrepeatdayofweek =  new org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory();
		activitydefinitiondosagetimingrepeat.addDayOfWeek(activitydefinitiondosagetimingrepeatdayofweek.fromCode(a.getActvtyDfnDsgTmgRptDayOfWeek()));

		/******************** ActvtyDfn_Dsg_Tmg_Rpt_Duration ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptDuration() != null) {
			activitydefinitiondosagetimingrepeat.setDuration(Double.parseDouble((a.getActvtyDfnDsgTmgRptDuration())));
		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_DurationMx ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptDurationMx() != null) {
			activitydefinitiondosagetimingrepeat.setDurationMax(Double.parseDouble((a.getActvtyDfnDsgTmgRptDurationMx())));
		}
		/******************** activitydefinitiondosagetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory activitydefinitiondosagetimingrepeatdurationunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		activitydefinitiondosagetimingrepeat.setDurationUnit(activitydefinitiondosagetimingrepeatdurationunit.fromCode(a.getActvtyDfnDsgTmgRptDurationUnt()));

		/******************** ActvtyDfn_Dsg_Tmg_Rpt_Frqncy ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptFrqncy() != null) {
			activitydefinitiondosagetimingrepeat.setFrequency(Integer.parseInt(a.getActvtyDfnDsgTmgRptFrqncy()));
		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_FrqncyMx ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptFrqncyMx() != null) {
			activitydefinitiondosagetimingrepeat.setFrequencyMax(Integer.parseInt(a.getActvtyDfnDsgTmgRptFrqncyMx()));
		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_Off ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptOff() != null) {
			activitydefinitiondosagetimingrepeat.setOffset(Integer.parseInt(a.getActvtyDfnDsgTmgRptOff()));
		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_Prd ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptPrd() != null) {
			activitydefinitiondosagetimingrepeat.setPeriod(Double.parseDouble((a.getActvtyDfnDsgTmgRptPrd())));
		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_PrdMx ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptPrdMx() != null) {
			activitydefinitiondosagetimingrepeat.setPeriodMax(new java.math.BigDecimal((a.getActvtyDfnDsgTmgRptPrdMx())));
		}
		/******************** activitydefinitiondosagetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory activitydefinitiondosagetimingrepeatperiodunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		activitydefinitiondosagetimingrepeat.setPeriodUnit(activitydefinitiondosagetimingrepeatperiodunit.fromCode(a.getActvtyDfnDsgTmgRptPrdUnt()));

		/******************** ActvtyDfn_Dsg_Tmg_Rpt_TimeOfDay ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptTimeOfDay() != null) {
			activitydefinitiondosagetimingrepeat.addTimeOfDay(a.getActvtyDfnDsgTmgRptTimeOfDay());
		}
		/******************** activitydefinitiondosagetimingrepeatwhen ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory activitydefinitiondosagetimingrepeatwhen =  new org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory();
		activitydefinitiondosagetimingrepeat.addWhen(activitydefinitiondosagetimingrepeatwhen.fromCode(a.getActvtyDfnDsgTmgRptWhen()));

		/******************** activitydefinitiondynamicvalue ********************************************************************************/
		org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionDynamicValueComponent activitydefinitiondynamicvalue =  new org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionDynamicValueComponent();
		activitydefinition.addDynamicValue(activitydefinitiondynamicvalue);

		/******************** activitydefinitiondynamicvalueexpression ********************************************************************************/
		org.hl7.fhir.r4.model.Expression activitydefinitiondynamicvalueexpression =  new org.hl7.fhir.r4.model.Expression();
		activitydefinitiondynamicvalue.setExpression(activitydefinitiondynamicvalueexpression);

		/******************** ActvtyDfn_DynamicVl_Exprsn_Dscrptn ********************************************************************************/
		if(a.getActvtyDfnDynamicVlExprsnDscrptn() != null) {
			activitydefinitiondynamicvalueexpression.setDescription(a.getActvtyDfnDynamicVlExprsnDscrptn());
		}
		/******************** ActvtyDfn_DynamicVl_Exprsn_Exprsn ********************************************************************************/
		if(a.getActvtyDfnDynamicVlExprsnExprsn() != null) {
			activitydefinitiondynamicvalueexpression.setExpression(a.getActvtyDfnDynamicVlExprsnExprsn());
		}
		/******************** ActvtyDfn_DynamicVl_Exprsn_Lnguage ********************************************************************************/
		if(a.getActvtyDfnDynamicVlExprsnLnguage() != null) {
			activitydefinitiondynamicvalueexpression.setLanguage(a.getActvtyDfnDynamicVlExprsnLnguage());
		}
		/******************** ActvtyDfn_DynamicVl_Exprsn_Nm ********************************************************************************/
		if(a.getActvtyDfnDynamicVlExprsnNm() != null) {
			activitydefinitiondynamicvalueexpression.setName(a.getActvtyDfnDynamicVlExprsnNm());
		}
		/******************** ActvtyDfn_DynamicVl_Exprsn_Rfrnc ********************************************************************************/
		if(a.getActvtyDfnDynamicVlExprsnRfrnc() != null) {
			activitydefinitiondynamicvalueexpression.setReference(a.getActvtyDfnDynamicVlExprsnRfrnc());
		}
		/******************** ActvtyDfn_DynamicVl_Path ********************************************************************************/
		if(a.getActvtyDfnDynamicVlPath() != null) {
			activitydefinitiondynamicvalue.setPath(a.getActvtyDfnDynamicVlPath());
		}
		/******************** activitydefinitioneditor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail activitydefinitioneditor =  new org.hl7.fhir.r4.model.ContactDetail();
		activitydefinition.addEditor(activitydefinitioneditor);

		/******************** ActvtyDfn_Editor_Nm ********************************************************************************/
		if(a.getActvtyDfnEditorNm() != null) {
			activitydefinitioneditor.setName(a.getActvtyDfnEditorNm());
		}
		/******************** activitydefinitioneditortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint activitydefinitioneditortelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		activitydefinitioneditor.addTelecom(activitydefinitioneditortelecom);

		/******************** activitydefinitioneditortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period activitydefinitioneditortelecomperiod =  new org.hl7.fhir.r4.model.Period();
		activitydefinitioneditortelecom.setPeriod(activitydefinitioneditortelecomperiod);

		/******************** ActvtyDfn_Editor_Tlcm_Prd_End ********************************************************************************/
		if(a.getActvtyDfnEditorTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat ActvtyDfn_Editor_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ActvtyDfn_Editor_Tlcm_Prd_Enddate = ActvtyDfn_Editor_Tlcm_Prd_Endsdf.parse(a.getActvtyDfnEditorTlcmPrdEnd());
			activitydefinitioneditortelecomperiod.setEnd(ActvtyDfn_Editor_Tlcm_Prd_Enddate);
		}
		/******************** ActvtyDfn_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(a.getActvtyDfnEditorTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat ActvtyDfn_Editor_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ActvtyDfn_Editor_Tlcm_Prd_Strtdate = ActvtyDfn_Editor_Tlcm_Prd_Strtsdf.parse(a.getActvtyDfnEditorTlcmPrdStrt());
			activitydefinitioneditortelecomperiod.setStart(ActvtyDfn_Editor_Tlcm_Prd_Strtdate);
		}
		/******************** ActvtyDfn_Editor_Tlcm_Rnk ********************************************************************************/
		if(a.getActvtyDfnEditorTlcmRnk() != null) {
			activitydefinitioneditortelecom.setRank(Integer.parseInt(a.getActvtyDfnEditorTlcmRnk()));
		}
		/******************** activitydefinitioneditortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory activitydefinitioneditortelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		activitydefinitioneditortelecom.setSystem(activitydefinitioneditortelecomsystem.fromCode(a.getActvtyDfnEditorTlcmSys()));

		/******************** activitydefinitioneditortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory activitydefinitioneditortelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		activitydefinitioneditortelecom.setUse(activitydefinitioneditortelecomuse.fromCode(a.getActvtyDfnEditorTlcmUse()));

		/******************** ActvtyDfn_Editor_Tlcm_Vl ********************************************************************************/
		if(a.getActvtyDfnEditorTlcmVl() != null) {
			activitydefinitioneditortelecom.setValue(a.getActvtyDfnEditorTlcmVl());
		}
		/******************** activitydefinitioneffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period activitydefinitioneffectiveperiod =  new org.hl7.fhir.r4.model.Period();
		activitydefinition.setEffectivePeriod(activitydefinitioneffectiveperiod);

		/******************** ActvtyDfn_EfctivePrd_End ********************************************************************************/
		if(a.getActvtyDfnEfctivePrdEnd() != null) {
			java.text.SimpleDateFormat ActvtyDfn_EfctivePrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ActvtyDfn_EfctivePrd_Enddate = ActvtyDfn_EfctivePrd_Endsdf.parse(a.getActvtyDfnEfctivePrdEnd());
			activitydefinitioneffectiveperiod.setEnd(ActvtyDfn_EfctivePrd_Enddate);
		}
		/******************** ActvtyDfn_EfctivePrd_Strt ********************************************************************************/
		if(a.getActvtyDfnEfctivePrdStrt() != null) {
			java.text.SimpleDateFormat ActvtyDfn_EfctivePrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ActvtyDfn_EfctivePrd_Strtdate = ActvtyDfn_EfctivePrd_Strtsdf.parse(a.getActvtyDfnEfctivePrdStrt());
			activitydefinitioneffectiveperiod.setStart(ActvtyDfn_EfctivePrd_Strtdate);
		}
		/******************** activitydefinitionendorser ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail activitydefinitionendorser =  new org.hl7.fhir.r4.model.ContactDetail();
		activitydefinition.addEndorser(activitydefinitionendorser);

		/******************** ActvtyDfn_Endsr_Nm ********************************************************************************/
		if(a.getActvtyDfnEndsrNm() != null) {
			activitydefinitionendorser.setName(a.getActvtyDfnEndsrNm());
		}
		/******************** activitydefinitionendorsertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint activitydefinitionendorsertelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		activitydefinitionendorser.addTelecom(activitydefinitionendorsertelecom);

		/******************** activitydefinitionendorsertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period activitydefinitionendorsertelecomperiod =  new org.hl7.fhir.r4.model.Period();
		activitydefinitionendorsertelecom.setPeriod(activitydefinitionendorsertelecomperiod);

		/******************** ActvtyDfn_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(a.getActvtyDfnEndsrTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat ActvtyDfn_Endsr_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ActvtyDfn_Endsr_Tlcm_Prd_Enddate = ActvtyDfn_Endsr_Tlcm_Prd_Endsdf.parse(a.getActvtyDfnEndsrTlcmPrdEnd());
			activitydefinitionendorsertelecomperiod.setEnd(ActvtyDfn_Endsr_Tlcm_Prd_Enddate);
		}
		/******************** ActvtyDfn_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(a.getActvtyDfnEndsrTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat ActvtyDfn_Endsr_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ActvtyDfn_Endsr_Tlcm_Prd_Strtdate = ActvtyDfn_Endsr_Tlcm_Prd_Strtsdf.parse(a.getActvtyDfnEndsrTlcmPrdStrt());
			activitydefinitionendorsertelecomperiod.setStart(ActvtyDfn_Endsr_Tlcm_Prd_Strtdate);
		}
		/******************** ActvtyDfn_Endsr_Tlcm_Rnk ********************************************************************************/
		if(a.getActvtyDfnEndsrTlcmRnk() != null) {
			activitydefinitionendorsertelecom.setRank(Integer.parseInt(a.getActvtyDfnEndsrTlcmRnk()));
		}
		/******************** activitydefinitionendorsertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory activitydefinitionendorsertelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		activitydefinitionendorsertelecom.setSystem(activitydefinitionendorsertelecomsystem.fromCode(a.getActvtyDfnEndsrTlcmSys()));

		/******************** activitydefinitionendorsertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory activitydefinitionendorsertelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		activitydefinitionendorsertelecom.setUse(activitydefinitionendorsertelecomuse.fromCode(a.getActvtyDfnEndsrTlcmUse()));

		/******************** ActvtyDfn_Endsr_Tlcm_Vl ********************************************************************************/
		if(a.getActvtyDfnEndsrTlcmVl() != null) {
			activitydefinitionendorsertelecom.setValue(a.getActvtyDfnEndsrTlcmVl());
		}
		/******************** ActvtyDfn_Exprmtl ********************************************************************************/
		if(a.getActvtyDfnExprmtl() != null) {
			activitydefinition.setExperimental(Boolean.parseBoolean(a.getActvtyDfnExprmtl()));
		}
		/******************** activitydefinitionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier activitydefinitionidentifier =  new org.hl7.fhir.r4.model.Identifier();
		activitydefinition.addIdentifier(activitydefinitionidentifier);

		/******************** ActvtyDfn_Id_Assigner ********************************************************************************/
		if(a.getActvtyDfnIdAssigner() != null) {
			activitydefinitionidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(a.getActvtyDfnIdAssigner()));
		}
		/******************** activitydefinitionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period activitydefinitionidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		activitydefinitionidentifier.setPeriod(activitydefinitionidentifierperiod);

		/******************** ActvtyDfn_Id_Prd_End ********************************************************************************/
		if(a.getActvtyDfnIdPrdEnd() != null) {
			java.text.SimpleDateFormat ActvtyDfn_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ActvtyDfn_Id_Prd_Enddate = ActvtyDfn_Id_Prd_Endsdf.parse(a.getActvtyDfnIdPrdEnd());
			activitydefinitionidentifierperiod.setEnd(ActvtyDfn_Id_Prd_Enddate);
		}
		/******************** ActvtyDfn_Id_Prd_Strt ********************************************************************************/
		if(a.getActvtyDfnIdPrdStrt() != null) {
			java.text.SimpleDateFormat ActvtyDfn_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ActvtyDfn_Id_Prd_Strtdate = ActvtyDfn_Id_Prd_Strtsdf.parse(a.getActvtyDfnIdPrdStrt());
			activitydefinitionidentifierperiod.setStart(ActvtyDfn_Id_Prd_Strtdate);
		}
		/******************** ActvtyDfn_Id_Sys ********************************************************************************/
		if(a.getActvtyDfnIdSys() != null) {
			activitydefinitionidentifier.setSystem(a.getActvtyDfnIdSys());
		}
		/******************** activitydefinitionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitionidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		activitydefinitionidentifier.setType(activitydefinitionidentifiertype);

		/******************** activitydefinitionidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitionidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		activitydefinitionidentifiertype.addCoding(activitydefinitionidentifiertypecoding);

		/******************** ActvtyDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(a.getActvtyDfnIdTypCdgCd() != null) {
			activitydefinitionidentifiertypecoding.setCode(a.getActvtyDfnIdTypCdgCd());
		}
		/******************** ActvtyDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(a.getActvtyDfnIdTypCdgDsply() != null) {
			activitydefinitionidentifiertypecoding.setDisplay(a.getActvtyDfnIdTypCdgDsply());
		}
		/******************** ActvtyDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(a.getActvtyDfnIdTypCdgSys() != null) {
			activitydefinitionidentifiertypecoding.setSystem(a.getActvtyDfnIdTypCdgSys());
		}
		/******************** ActvtyDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(a.getActvtyDfnIdTypCdgUsrSltd() != null) {
			activitydefinitionidentifiertypecoding.setUserSelected(Boolean.parseBoolean(a.getActvtyDfnIdTypCdgUsrSltd()));
		}
		/******************** ActvtyDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(a.getActvtyDfnIdTypCdgVrsn() != null) {
			activitydefinitionidentifiertypecoding.setVersion(a.getActvtyDfnIdTypCdgVrsn());
		}
		/******************** ActvtyDfn_Id_Typ_Txt ********************************************************************************/
		if(a.getActvtyDfnIdTypTxt() != null) {
			activitydefinitionidentifiertype.setText(a.getActvtyDfnIdTypTxt());
		}
		/******************** activitydefinitionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory activitydefinitionidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		activitydefinitionidentifier.setUse(activitydefinitionidentifieruse.fromCode(a.getActvtyDfnIdUse()));

		/******************** ActvtyDfn_Id_Vl ********************************************************************************/
		if(a.getActvtyDfnIdVl() != null) {
			activitydefinitionidentifier.setValue(a.getActvtyDfnIdVl());
		}
		/******************** activitydefinitionintent ********************************************************************************/
		org.hl7.fhir.r4.model.ActivityDefinition.RequestIntentEnumFactory activitydefinitionintent =  new org.hl7.fhir.r4.model.ActivityDefinition.RequestIntentEnumFactory();
		activitydefinition.setIntent(activitydefinitionintent.fromCode(a.getActvtyDfnIntent()));

		/******************** activitydefinitionjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitionjurisdiction =  new org.hl7.fhir.r4.model.CodeableConcept();
		activitydefinition.addJurisdiction(activitydefinitionjurisdiction);

		/******************** activitydefinitionjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitionjurisdictioncoding =  new org.hl7.fhir.r4.model.Coding();
		activitydefinitionjurisdiction.addCoding(activitydefinitionjurisdictioncoding);

		/******************** ActvtyDfn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(a.getActvtyDfnJrsdctnCdgCd() != null) {
			activitydefinitionjurisdictioncoding.setCode(a.getActvtyDfnJrsdctnCdgCd());
		}
		/******************** ActvtyDfn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(a.getActvtyDfnJrsdctnCdgDsply() != null) {
			activitydefinitionjurisdictioncoding.setDisplay(a.getActvtyDfnJrsdctnCdgDsply());
		}
		/******************** ActvtyDfn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(a.getActvtyDfnJrsdctnCdgSys() != null) {
			activitydefinitionjurisdictioncoding.setSystem(a.getActvtyDfnJrsdctnCdgSys());
		}
		/******************** ActvtyDfn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(a.getActvtyDfnJrsdctnCdgUsrSltd() != null) {
			activitydefinitionjurisdictioncoding.setUserSelected(Boolean.parseBoolean(a.getActvtyDfnJrsdctnCdgUsrSltd()));
		}
		/******************** ActvtyDfn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(a.getActvtyDfnJrsdctnCdgVrsn() != null) {
			activitydefinitionjurisdictioncoding.setVersion(a.getActvtyDfnJrsdctnCdgVrsn());
		}
		/******************** ActvtyDfn_Jrsdctn_Txt ********************************************************************************/
		if(a.getActvtyDfnJrsdctnTxt() != null) {
			activitydefinitionjurisdiction.setText(a.getActvtyDfnJrsdctnTxt());
		}
		/******************** activitydefinitionkind ********************************************************************************/
		org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionKindEnumFactory activitydefinitionkind =  new org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionKindEnumFactory();
		activitydefinition.setKind(activitydefinitionkind.fromCode(a.getActvtyDfnKind()));

		/******************** ActvtyDfn_LastReviewDt ********************************************************************************/
		if(a.getActvtyDfnLastReviewDt() != null) {
			java.text.SimpleDateFormat ActvtyDfn_LastReviewDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ActvtyDfn_LastReviewDtdate = ActvtyDfn_LastReviewDtsdf.parse(a.getActvtyDfnLastReviewDt());
			activitydefinition.setLastReviewDate(ActvtyDfn_LastReviewDtdate);
		}
		/******************** ActvtyDfn_Library ********************************************************************************/
		if(a.getActvtyDfnLibrary() != null) {
			activitydefinition.addLibrary(a.getActvtyDfnLibrary());
		}
		/******************** ActvtyDfn_Lctn ********************************************************************************/
		if(a.getActvtyDfnLctn() != null) {
			activitydefinition.setLocation( new org.hl7.fhir.r4.model.Reference(a.getActvtyDfnLctn()));
		}
		/******************** ActvtyDfn_Nm ********************************************************************************/
		if(a.getActvtyDfnNm() != null) {
			activitydefinition.setName(a.getActvtyDfnNm());
		}
		/******************** ActvtyDfn_ObsrvtnRqrment ********************************************************************************/
		if(a.getActvtyDfnObsrvtnRqrment() != null) {
			activitydefinition.addObservationRequirement( new org.hl7.fhir.r4.model.Reference(a.getActvtyDfnObsrvtnRqrment()));
		}
		/******************** ActvtyDfn_ObsrvtnRsltRqrment ********************************************************************************/
		if(a.getActvtyDfnObsrvtnRsltRqrment() != null) {
			activitydefinition.addObservationResultRequirement( new org.hl7.fhir.r4.model.Reference(a.getActvtyDfnObsrvtnRsltRqrment()));
		}
		/******************** activitydefinitionparticipant ********************************************************************************/
		org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionParticipantComponent activitydefinitionparticipant =  new org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionParticipantComponent();
		activitydefinition.addParticipant(activitydefinitionparticipant);

		/******************** activitydefinitionparticipantrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitionparticipantrole =  new org.hl7.fhir.r4.model.CodeableConcept();
		activitydefinitionparticipant.setRole(activitydefinitionparticipantrole);

		/******************** activitydefinitionparticipantrolecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitionparticipantrolecoding =  new org.hl7.fhir.r4.model.Coding();
		activitydefinitionparticipantrole.addCoding(activitydefinitionparticipantrolecoding);

		/******************** ActvtyDfn_Prtcpnt_Role_Cdg_Cd ********************************************************************************/
		if(a.getActvtyDfnPrtcpntRoleCdgCd() != null) {
			activitydefinitionparticipantrolecoding.setCode(a.getActvtyDfnPrtcpntRoleCdgCd());
		}
		/******************** ActvtyDfn_Prtcpnt_Role_Cdg_Dsply ********************************************************************************/
		if(a.getActvtyDfnPrtcpntRoleCdgDsply() != null) {
			activitydefinitionparticipantrolecoding.setDisplay(a.getActvtyDfnPrtcpntRoleCdgDsply());
		}
		/******************** ActvtyDfn_Prtcpnt_Role_Cdg_Sys ********************************************************************************/
		if(a.getActvtyDfnPrtcpntRoleCdgSys() != null) {
			activitydefinitionparticipantrolecoding.setSystem(a.getActvtyDfnPrtcpntRoleCdgSys());
		}
		/******************** ActvtyDfn_Prtcpnt_Role_Cdg_UsrSltd ********************************************************************************/
		if(a.getActvtyDfnPrtcpntRoleCdgUsrSltd() != null) {
			activitydefinitionparticipantrolecoding.setUserSelected(Boolean.parseBoolean(a.getActvtyDfnPrtcpntRoleCdgUsrSltd()));
		}
		/******************** ActvtyDfn_Prtcpnt_Role_Cdg_Vrsn ********************************************************************************/
		if(a.getActvtyDfnPrtcpntRoleCdgVrsn() != null) {
			activitydefinitionparticipantrolecoding.setVersion(a.getActvtyDfnPrtcpntRoleCdgVrsn());
		}
		/******************** ActvtyDfn_Prtcpnt_Role_Txt ********************************************************************************/
		if(a.getActvtyDfnPrtcpntRoleTxt() != null) {
			activitydefinitionparticipantrole.setText(a.getActvtyDfnPrtcpntRoleTxt());
		}
		/******************** activitydefinitionparticipanttype ********************************************************************************/
		org.hl7.fhir.r4.model.ActivityDefinition.ActivityParticipantTypeEnumFactory activitydefinitionparticipanttype =  new org.hl7.fhir.r4.model.ActivityDefinition.ActivityParticipantTypeEnumFactory();
		activitydefinitionparticipant.setType(activitydefinitionparticipanttype.fromCode(a.getActvtyDfnPrtcpntTyp()));

		/******************** activitydefinitionpriority ********************************************************************************/
		org.hl7.fhir.r4.model.ActivityDefinition.RequestPriorityEnumFactory activitydefinitionpriority =  new org.hl7.fhir.r4.model.ActivityDefinition.RequestPriorityEnumFactory();
		activitydefinition.setPriority(activitydefinitionpriority.fromCode(a.getActvtyDfnPriority()));

		/******************** activitydefinitionproductcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitionproductcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		activitydefinition.setProduct(activitydefinitionproductcodeableconcept);

		/******************** activitydefinitionproductcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitionproductcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		activitydefinitionproductcodeableconcept.addCoding(activitydefinitionproductcodeableconceptcoding);

		/******************** ActvtyDfn_PrdctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(a.getActvtyDfnPrdctCdbleCncptCdgCd() != null) {
			activitydefinitionproductcodeableconceptcoding.setCode(a.getActvtyDfnPrdctCdbleCncptCdgCd());
		}
		/******************** ActvtyDfn_PrdctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(a.getActvtyDfnPrdctCdbleCncptCdgDsply() != null) {
			activitydefinitionproductcodeableconceptcoding.setDisplay(a.getActvtyDfnPrdctCdbleCncptCdgDsply());
		}
		/******************** ActvtyDfn_PrdctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(a.getActvtyDfnPrdctCdbleCncptCdgSys() != null) {
			activitydefinitionproductcodeableconceptcoding.setSystem(a.getActvtyDfnPrdctCdbleCncptCdgSys());
		}
		/******************** ActvtyDfn_PrdctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(a.getActvtyDfnPrdctCdbleCncptCdgUsrSltd() != null) {
			activitydefinitionproductcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(a.getActvtyDfnPrdctCdbleCncptCdgUsrSltd()));
		}
		/******************** ActvtyDfn_PrdctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(a.getActvtyDfnPrdctCdbleCncptCdgVrsn() != null) {
			activitydefinitionproductcodeableconceptcoding.setVersion(a.getActvtyDfnPrdctCdbleCncptCdgVrsn());
		}
		/******************** ActvtyDfn_PrdctCdbleCncpt_Txt ********************************************************************************/
		if(a.getActvtyDfnPrdctCdbleCncptTxt() != null) {
			activitydefinitionproductcodeableconcept.setText(a.getActvtyDfnPrdctCdbleCncptTxt());
		}
		/******************** ActvtyDfn_PrdctRfrnc ********************************************************************************/
		if(a.getActvtyDfnPrdctRfrnc() != null) {
			activitydefinition.setProduct( new org.hl7.fhir.r4.model.Reference(a.getActvtyDfnPrdctRfrnc()));
		}
		/******************** ActvtyDfn_Profile ********************************************************************************/
		if(a.getActvtyDfnProfile() != null) {
			activitydefinition.setProfile(a.getActvtyDfnProfile());
		}
		/******************** ActvtyDfn_Pblshr ********************************************************************************/
		if(a.getActvtyDfnPblshr() != null) {
			activitydefinition.setPublisher(a.getActvtyDfnPblshr());
		}
		/******************** ActvtyDfn_Prpse ********************************************************************************/
		if(a.getActvtyDfnPrpse() != null) {
			activitydefinition.setPurpose(a.getActvtyDfnPrpse());
		}
		/******************** activitydefinitionquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitionquantity =  new org.hl7.fhir.r4.model.Quantity();
		activitydefinition.setQuantity(activitydefinitionquantity);

		/******************** ActvtyDfn_Qnty_Cd ********************************************************************************/
		if(a.getActvtyDfnQntyCd() != null) {
			activitydefinitionquantity.setCode(a.getActvtyDfnQntyCd());
		}
		/******************** activitydefinitionquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory activitydefinitionquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		activitydefinitionquantity.setComparator(activitydefinitionquantitycomparator.fromCode(a.getActvtyDfnQntyCmprtr()));

		/******************** ActvtyDfn_Qnty_Sys ********************************************************************************/
		if(a.getActvtyDfnQntySys() != null) {
			activitydefinitionquantity.setSystem(a.getActvtyDfnQntySys());
		}
		/******************** ActvtyDfn_Qnty_Unt ********************************************************************************/
		if(a.getActvtyDfnQntyUnt() != null) {
			activitydefinitionquantity.setUnit(a.getActvtyDfnQntyUnt());
		}
		/******************** ActvtyDfn_Qnty_Vl ********************************************************************************/
		if(a.getActvtyDfnQntyVl() != null) {
			activitydefinitionquantity.setValue(Double.parseDouble((a.getActvtyDfnQntyVl())));
		}
		/******************** activitydefinitionrelatedartifact ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact activitydefinitionrelatedartifact =  new org.hl7.fhir.r4.model.RelatedArtifact();
		activitydefinition.addRelatedArtifact(activitydefinitionrelatedartifact);

		/******************** ActvtyDfn_RltedArtfct_Citation ********************************************************************************/
		if(a.getActvtyDfnRltedArtfctCitation() != null) {
			activitydefinitionrelatedartifact.setCitation(a.getActvtyDfnRltedArtfctCitation());
		}
		/******************** ActvtyDfn_RltedArtfct_Dsply ********************************************************************************/
		if(a.getActvtyDfnRltedArtfctDsply() != null) {
			activitydefinitionrelatedartifact.setDisplay(a.getActvtyDfnRltedArtfctDsply());
		}
		/******************** activitydefinitionrelatedartifactdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment activitydefinitionrelatedartifactdocument =  new org.hl7.fhir.r4.model.Attachment();
		activitydefinitionrelatedartifact.setDocument(activitydefinitionrelatedartifactdocument);

		/******************** ActvtyDfn_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(a.getActvtyDfnRltedArtfctDocCntntTyp() != null) {
			activitydefinitionrelatedartifactdocument.setContentType(a.getActvtyDfnRltedArtfctDocCntntTyp());
		}
		/******************** ActvtyDfn_RltedArtfct_Doc_Creation ********************************************************************************/
		if(a.getActvtyDfnRltedArtfctDocCreation() != null) {
			java.text.SimpleDateFormat ActvtyDfn_RltedArtfct_Doc_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ActvtyDfn_RltedArtfct_Doc_Creationdate = ActvtyDfn_RltedArtfct_Doc_Creationsdf.parse(a.getActvtyDfnRltedArtfctDocCreation());
			activitydefinitionrelatedartifactdocument.setCreation(ActvtyDfn_RltedArtfct_Doc_Creationdate);
		}
		/******************** ActvtyDfn_RltedArtfct_Doc_Data ********************************************************************************/
		if(a.getActvtyDfnRltedArtfctDocData() != null) {
			activitydefinitionrelatedartifactdocument.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(a.getActvtyDfnRltedArtfctDocData()));
		}
		/******************** ActvtyDfn_RltedArtfct_Doc_Hash ********************************************************************************/
		if(a.getActvtyDfnRltedArtfctDocHash() != null) {
			activitydefinitionrelatedartifactdocument.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(a.getActvtyDfnRltedArtfctDocHash()));
		}
		/******************** ActvtyDfn_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(a.getActvtyDfnRltedArtfctDocLnguage() != null) {
			activitydefinitionrelatedartifactdocument.setLanguage(a.getActvtyDfnRltedArtfctDocLnguage());
		}
		/******************** ActvtyDfn_RltedArtfct_Doc_Sz ********************************************************************************/
		if(a.getActvtyDfnRltedArtfctDocSz() != null) {
			activitydefinitionrelatedartifactdocument.setSize(Integer.parseInt(a.getActvtyDfnRltedArtfctDocSz()));
		}
		/******************** ActvtyDfn_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(a.getActvtyDfnRltedArtfctDocTtl() != null) {
			activitydefinitionrelatedartifactdocument.setTitle(a.getActvtyDfnRltedArtfctDocTtl());
		}
		/******************** ActvtyDfn_RltedArtfct_Doc_Url ********************************************************************************/
		if(a.getActvtyDfnRltedArtfctDocUrl() != null) {
			activitydefinitionrelatedartifactdocument.setUrl(a.getActvtyDfnRltedArtfctDocUrl());
		}
		/******************** ActvtyDfn_RltedArtfct_Lbl ********************************************************************************/
		if(a.getActvtyDfnRltedArtfctLbl() != null) {
			activitydefinitionrelatedartifact.setLabel(a.getActvtyDfnRltedArtfctLbl());
		}
		/******************** ActvtyDfn_RltedArtfct_Rsrc ********************************************************************************/
		if(a.getActvtyDfnRltedArtfctRsrc() != null) {
			activitydefinitionrelatedartifact.setResource(a.getActvtyDfnRltedArtfctRsrc());
		}
		/******************** activitydefinitionrelatedartifacttype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory activitydefinitionrelatedartifacttype =  new org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory();
		activitydefinitionrelatedartifact.setType(activitydefinitionrelatedartifacttype.fromCode(a.getActvtyDfnRltedArtfctTyp()));

		/******************** ActvtyDfn_RltedArtfct_Url ********************************************************************************/
		if(a.getActvtyDfnRltedArtfctUrl() != null) {
			activitydefinitionrelatedartifact.setUrl(a.getActvtyDfnRltedArtfctUrl());
		}
		/******************** activitydefinitionreviewer ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail activitydefinitionreviewer =  new org.hl7.fhir.r4.model.ContactDetail();
		activitydefinition.addReviewer(activitydefinitionreviewer);

		/******************** ActvtyDfn_Rviewr_Nm ********************************************************************************/
		if(a.getActvtyDfnRviewrNm() != null) {
			activitydefinitionreviewer.setName(a.getActvtyDfnRviewrNm());
		}
		/******************** activitydefinitionreviewertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint activitydefinitionreviewertelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		activitydefinitionreviewer.addTelecom(activitydefinitionreviewertelecom);

		/******************** activitydefinitionreviewertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period activitydefinitionreviewertelecomperiod =  new org.hl7.fhir.r4.model.Period();
		activitydefinitionreviewertelecom.setPeriod(activitydefinitionreviewertelecomperiod);

		/******************** ActvtyDfn_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(a.getActvtyDfnRviewrTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat ActvtyDfn_Rviewr_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ActvtyDfn_Rviewr_Tlcm_Prd_Enddate = ActvtyDfn_Rviewr_Tlcm_Prd_Endsdf.parse(a.getActvtyDfnRviewrTlcmPrdEnd());
			activitydefinitionreviewertelecomperiod.setEnd(ActvtyDfn_Rviewr_Tlcm_Prd_Enddate);
		}
		/******************** ActvtyDfn_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(a.getActvtyDfnRviewrTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat ActvtyDfn_Rviewr_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ActvtyDfn_Rviewr_Tlcm_Prd_Strtdate = ActvtyDfn_Rviewr_Tlcm_Prd_Strtsdf.parse(a.getActvtyDfnRviewrTlcmPrdStrt());
			activitydefinitionreviewertelecomperiod.setStart(ActvtyDfn_Rviewr_Tlcm_Prd_Strtdate);
		}
		/******************** ActvtyDfn_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(a.getActvtyDfnRviewrTlcmRnk() != null) {
			activitydefinitionreviewertelecom.setRank(Integer.parseInt(a.getActvtyDfnRviewrTlcmRnk()));
		}
		/******************** activitydefinitionreviewertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory activitydefinitionreviewertelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		activitydefinitionreviewertelecom.setSystem(activitydefinitionreviewertelecomsystem.fromCode(a.getActvtyDfnRviewrTlcmSys()));

		/******************** activitydefinitionreviewertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory activitydefinitionreviewertelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		activitydefinitionreviewertelecom.setUse(activitydefinitionreviewertelecomuse.fromCode(a.getActvtyDfnRviewrTlcmUse()));

		/******************** ActvtyDfn_Rviewr_Tlcm_Vl ********************************************************************************/
		if(a.getActvtyDfnRviewrTlcmVl() != null) {
			activitydefinitionreviewertelecom.setValue(a.getActvtyDfnRviewrTlcmVl());
		}
		/******************** ActvtyDfn_SpcmnRqrment ********************************************************************************/
		if(a.getActvtyDfnSpcmnRqrment() != null) {
			activitydefinition.addSpecimenRequirement( new org.hl7.fhir.r4.model.Reference(a.getActvtyDfnSpcmnRqrment()));
		}
		/******************** activitydefinitionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory activitydefinitionstatus =  new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory();
		activitydefinition.setStatus(activitydefinitionstatus.fromCode(a.getActvtyDfnSts()));

		/******************** activitydefinitionsubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitionsubjectcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		activitydefinition.setSubject(activitydefinitionsubjectcodeableconcept);

		/******************** activitydefinitionsubjectcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitionsubjectcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		activitydefinitionsubjectcodeableconcept.addCoding(activitydefinitionsubjectcodeableconceptcoding);

		/******************** ActvtyDfn_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(a.getActvtyDfnSbjctCdbleCncptCdgCd() != null) {
			activitydefinitionsubjectcodeableconceptcoding.setCode(a.getActvtyDfnSbjctCdbleCncptCdgCd());
		}
		/******************** ActvtyDfn_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(a.getActvtyDfnSbjctCdbleCncptCdgDsply() != null) {
			activitydefinitionsubjectcodeableconceptcoding.setDisplay(a.getActvtyDfnSbjctCdbleCncptCdgDsply());
		}
		/******************** ActvtyDfn_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(a.getActvtyDfnSbjctCdbleCncptCdgSys() != null) {
			activitydefinitionsubjectcodeableconceptcoding.setSystem(a.getActvtyDfnSbjctCdbleCncptCdgSys());
		}
		/******************** ActvtyDfn_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(a.getActvtyDfnSbjctCdbleCncptCdgUsrSltd() != null) {
			activitydefinitionsubjectcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(a.getActvtyDfnSbjctCdbleCncptCdgUsrSltd()));
		}
		/******************** ActvtyDfn_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(a.getActvtyDfnSbjctCdbleCncptCdgVrsn() != null) {
			activitydefinitionsubjectcodeableconceptcoding.setVersion(a.getActvtyDfnSbjctCdbleCncptCdgVrsn());
		}
		/******************** ActvtyDfn_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(a.getActvtyDfnSbjctCdbleCncptTxt() != null) {
			activitydefinitionsubjectcodeableconcept.setText(a.getActvtyDfnSbjctCdbleCncptTxt());
		}
		/******************** ActvtyDfn_SbjctRfrnc ********************************************************************************/
		if(a.getActvtyDfnSbjctRfrnc() != null) {
			activitydefinition.setSubject( new org.hl7.fhir.r4.model.Reference(a.getActvtyDfnSbjctRfrnc()));
		}
		/******************** ActvtyDfn_Subtitle ********************************************************************************/
		if(a.getActvtyDfnSubtitle() != null) {
			activitydefinition.setSubtitle(a.getActvtyDfnSubtitle());
		}
		/******************** activitydefinitiontimingage ********************************************************************************/
		org.hl7.fhir.r4.model.Age activitydefinitiontimingage =  new org.hl7.fhir.r4.model.Age();
		activitydefinition.setTiming(activitydefinitiontimingage);

		/******************** ActvtyDfn_TmgAge_Cd ********************************************************************************/
		if(a.getActvtyDfnTmgAgeCd() != null) {
			activitydefinitiontimingage.setCode(a.getActvtyDfnTmgAgeCd());
		}
		/******************** activitydefinitiontimingagecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory activitydefinitiontimingagecomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		activitydefinitiontimingage.setComparator(activitydefinitiontimingagecomparator.fromCode(a.getActvtyDfnTmgAgeCmprtr()));

		/******************** ActvtyDfn_TmgAge_Sys ********************************************************************************/
		if(a.getActvtyDfnTmgAgeSys() != null) {
			activitydefinitiontimingage.setSystem(a.getActvtyDfnTmgAgeSys());
		}
		/******************** ActvtyDfn_TmgAge_Unt ********************************************************************************/
		if(a.getActvtyDfnTmgAgeUnt() != null) {
			activitydefinitiontimingage.setUnit(a.getActvtyDfnTmgAgeUnt());
		}
		/******************** ActvtyDfn_TmgAge_Vl ********************************************************************************/
		if(a.getActvtyDfnTmgAgeVl() != null) {
			activitydefinitiontimingage.setValue(Double.parseDouble((a.getActvtyDfnTmgAgeVl())));
		}
		/******************** ActvtyDfn_TmgDtTimeTyp ********************************************************************************/
		if(a.getActvtyDfnTmgDtTimeTyp() != null) {
			activitydefinition.setTiming( new org.hl7.fhir.r4.model.DateTimeType(a.getActvtyDfnTmgDtTimeTyp()));
		}
		/******************** activitydefinitiontimingduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration activitydefinitiontimingduration =  new org.hl7.fhir.r4.model.Duration();
		activitydefinition.setTiming(activitydefinitiontimingduration);

		/******************** ActvtyDfn_TmgDuration_Cd ********************************************************************************/
		if(a.getActvtyDfnTmgDurationCd() != null) {
			activitydefinitiontimingduration.setCode(a.getActvtyDfnTmgDurationCd());
		}
		/******************** activitydefinitiontimingdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory activitydefinitiontimingdurationcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		activitydefinitiontimingduration.setComparator(activitydefinitiontimingdurationcomparator.fromCode(a.getActvtyDfnTmgDurationCmprtr()));

		/******************** ActvtyDfn_TmgDuration_Sys ********************************************************************************/
		if(a.getActvtyDfnTmgDurationSys() != null) {
			activitydefinitiontimingduration.setSystem(a.getActvtyDfnTmgDurationSys());
		}
		/******************** ActvtyDfn_TmgDuration_Unt ********************************************************************************/
		if(a.getActvtyDfnTmgDurationUnt() != null) {
			activitydefinitiontimingduration.setUnit(a.getActvtyDfnTmgDurationUnt());
		}
		/******************** ActvtyDfn_TmgDuration_Vl ********************************************************************************/
		if(a.getActvtyDfnTmgDurationVl() != null) {
			activitydefinitiontimingduration.setValue(Double.parseDouble((a.getActvtyDfnTmgDurationVl())));
		}
		/******************** activitydefinitiontimingperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period activitydefinitiontimingperiod =  new org.hl7.fhir.r4.model.Period();
		activitydefinition.setTiming(activitydefinitiontimingperiod);

		/******************** ActvtyDfn_TmgPrd_End ********************************************************************************/
		if(a.getActvtyDfnTmgPrdEnd() != null) {
			java.text.SimpleDateFormat ActvtyDfn_TmgPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ActvtyDfn_TmgPrd_Enddate = ActvtyDfn_TmgPrd_Endsdf.parse(a.getActvtyDfnTmgPrdEnd());
			activitydefinitiontimingperiod.setEnd(ActvtyDfn_TmgPrd_Enddate);
		}
		/******************** ActvtyDfn_TmgPrd_Strt ********************************************************************************/
		if(a.getActvtyDfnTmgPrdStrt() != null) {
			java.text.SimpleDateFormat ActvtyDfn_TmgPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ActvtyDfn_TmgPrd_Strtdate = ActvtyDfn_TmgPrd_Strtsdf.parse(a.getActvtyDfnTmgPrdStrt());
			activitydefinitiontimingperiod.setStart(ActvtyDfn_TmgPrd_Strtdate);
		}
		/******************** activitydefinitiontimingrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range activitydefinitiontimingrange =  new org.hl7.fhir.r4.model.Range();
		activitydefinition.setTiming(activitydefinitiontimingrange);

		/******************** activitydefinitiontimingrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiontimingrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		activitydefinitiontimingrange.setHigh(activitydefinitiontimingrangehigh);

		/******************** ActvtyDfn_TmgRng_Hi_Cd ********************************************************************************/
		if(a.getActvtyDfnTmgRngHiCd() != null) {
			activitydefinitiontimingrangehigh.setCode(a.getActvtyDfnTmgRngHiCd());
		}
		/******************** activitydefinitiontimingrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory activitydefinitiontimingrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		activitydefinitiontimingrangehigh.setComparator(activitydefinitiontimingrangehighcomparator.fromCode(a.getActvtyDfnTmgRngHiCmprtr()));

		/******************** ActvtyDfn_TmgRng_Hi_Sys ********************************************************************************/
		if(a.getActvtyDfnTmgRngHiSys() != null) {
			activitydefinitiontimingrangehigh.setSystem(a.getActvtyDfnTmgRngHiSys());
		}
		/******************** ActvtyDfn_TmgRng_Hi_Unt ********************************************************************************/
		if(a.getActvtyDfnTmgRngHiUnt() != null) {
			activitydefinitiontimingrangehigh.setUnit(a.getActvtyDfnTmgRngHiUnt());
		}
		/******************** ActvtyDfn_TmgRng_Hi_Vl ********************************************************************************/
		if(a.getActvtyDfnTmgRngHiVl() != null) {
			activitydefinitiontimingrangehigh.setValue(Double.parseDouble((a.getActvtyDfnTmgRngHiVl())));
		}
		/******************** activitydefinitiontimingrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiontimingrangelow =  new org.hl7.fhir.r4.model.Quantity();
		activitydefinitiontimingrange.setLow(activitydefinitiontimingrangelow);

		/******************** ActvtyDfn_TmgRng_Lw_Cd ********************************************************************************/
		if(a.getActvtyDfnTmgRngLwCd() != null) {
			activitydefinitiontimingrangelow.setCode(a.getActvtyDfnTmgRngLwCd());
		}
		/******************** activitydefinitiontimingrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory activitydefinitiontimingrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		activitydefinitiontimingrangelow.setComparator(activitydefinitiontimingrangelowcomparator.fromCode(a.getActvtyDfnTmgRngLwCmprtr()));

		/******************** ActvtyDfn_TmgRng_Lw_Sys ********************************************************************************/
		if(a.getActvtyDfnTmgRngLwSys() != null) {
			activitydefinitiontimingrangelow.setSystem(a.getActvtyDfnTmgRngLwSys());
		}
		/******************** ActvtyDfn_TmgRng_Lw_Unt ********************************************************************************/
		if(a.getActvtyDfnTmgRngLwUnt() != null) {
			activitydefinitiontimingrangelow.setUnit(a.getActvtyDfnTmgRngLwUnt());
		}
		/******************** ActvtyDfn_TmgRng_Lw_Vl ********************************************************************************/
		if(a.getActvtyDfnTmgRngLwVl() != null) {
			activitydefinitiontimingrangelow.setValue(Double.parseDouble((a.getActvtyDfnTmgRngLwVl())));
		}
		/******************** activitydefinitiontimingtiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing activitydefinitiontimingtiming =  new org.hl7.fhir.r4.model.Timing();
		activitydefinition.setTiming(activitydefinitiontimingtiming);

		/******************** activitydefinitiontimingtimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitiontimingtimingcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		activitydefinitiontimingtiming.setCode(activitydefinitiontimingtimingcode);

		/******************** activitydefinitiontimingtimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitiontimingtimingcodecoding =  new org.hl7.fhir.r4.model.Coding();
		activitydefinitiontimingtimingcode.addCoding(activitydefinitiontimingtimingcodecoding);

		/******************** ActvtyDfn_TmgTmg_Cd_Cdg_Cd ********************************************************************************/
		if(a.getActvtyDfnTmgTmgCdCdgCd() != null) {
			activitydefinitiontimingtimingcodecoding.setCode(a.getActvtyDfnTmgTmgCdCdgCd());
		}
		/******************** ActvtyDfn_TmgTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(a.getActvtyDfnTmgTmgCdCdgDsply() != null) {
			activitydefinitiontimingtimingcodecoding.setDisplay(a.getActvtyDfnTmgTmgCdCdgDsply());
		}
		/******************** ActvtyDfn_TmgTmg_Cd_Cdg_Sys ********************************************************************************/
		if(a.getActvtyDfnTmgTmgCdCdgSys() != null) {
			activitydefinitiontimingtimingcodecoding.setSystem(a.getActvtyDfnTmgTmgCdCdgSys());
		}
		/******************** ActvtyDfn_TmgTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(a.getActvtyDfnTmgTmgCdCdgUsrSltd() != null) {
			activitydefinitiontimingtimingcodecoding.setUserSelected(Boolean.parseBoolean(a.getActvtyDfnTmgTmgCdCdgUsrSltd()));
		}
		/******************** ActvtyDfn_TmgTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(a.getActvtyDfnTmgTmgCdCdgVrsn() != null) {
			activitydefinitiontimingtimingcodecoding.setVersion(a.getActvtyDfnTmgTmgCdCdgVrsn());
		}
		/******************** ActvtyDfn_TmgTmg_Cd_Txt ********************************************************************************/
		if(a.getActvtyDfnTmgTmgCdTxt() != null) {
			activitydefinitiontimingtimingcode.setText(a.getActvtyDfnTmgTmgCdTxt());
		}
		/******************** ActvtyDfn_TmgTmg_Evnt ********************************************************************************/
		if(a.getActvtyDfnTmgTmgEvnt() != null) {
			java.text.SimpleDateFormat ActvtyDfn_TmgTmg_Evntsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ActvtyDfn_TmgTmg_Evntdate = ActvtyDfn_TmgTmg_Evntsdf.parse(a.getActvtyDfnTmgTmgEvnt());
			activitydefinitiontimingtiming.addEvent(ActvtyDfn_TmgTmg_Evntdate);
		}
		/******************** activitydefinitiontimingtimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent activitydefinitiontimingtimingrepeat =  new org.hl7.fhir.r4.model.Timing.TimingRepeatComponent();
		activitydefinitiontimingtiming.setRepeat(activitydefinitiontimingtimingrepeat);

		/******************** activitydefinitiontimingtimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration activitydefinitiontimingtimingrepeatboundsduration =  new org.hl7.fhir.r4.model.Duration();
		activitydefinitiontimingtimingrepeat.setBounds(activitydefinitiontimingtimingrepeatboundsduration);

		/******************** ActvtyDfn_TmgTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptBndsDurationCd() != null) {
			activitydefinitiontimingtimingrepeatboundsduration.setCode(a.getActvtyDfnTmgTmgRptBndsDurationCd());
		}
		/******************** activitydefinitiontimingtimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory activitydefinitiontimingtimingrepeatboundsdurationcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		activitydefinitiontimingtimingrepeatboundsduration.setComparator(activitydefinitiontimingtimingrepeatboundsdurationcomparator.fromCode(a.getActvtyDfnTmgTmgRptBndsDurationCmprtr()));

		/******************** ActvtyDfn_TmgTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptBndsDurationSys() != null) {
			activitydefinitiontimingtimingrepeatboundsduration.setSystem(a.getActvtyDfnTmgTmgRptBndsDurationSys());
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptBndsDurationUnt() != null) {
			activitydefinitiontimingtimingrepeatboundsduration.setUnit(a.getActvtyDfnTmgTmgRptBndsDurationUnt());
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptBndsDurationVl() != null) {
			activitydefinitiontimingtimingrepeatboundsduration.setValue(Double.parseDouble((a.getActvtyDfnTmgTmgRptBndsDurationVl())));
		}
		/******************** activitydefinitiontimingtimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period activitydefinitiontimingtimingrepeatboundsperiod =  new org.hl7.fhir.r4.model.Period();
		activitydefinitiontimingtimingrepeat.setBounds(activitydefinitiontimingtimingrepeatboundsperiod);

		/******************** ActvtyDfn_TmgTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptBndsPrdEnd() != null) {
			java.text.SimpleDateFormat ActvtyDfn_TmgTmg_Rpt_BndsPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ActvtyDfn_TmgTmg_Rpt_BndsPrd_Enddate = ActvtyDfn_TmgTmg_Rpt_BndsPrd_Endsdf.parse(a.getActvtyDfnTmgTmgRptBndsPrdEnd());
			activitydefinitiontimingtimingrepeatboundsperiod.setEnd(ActvtyDfn_TmgTmg_Rpt_BndsPrd_Enddate);
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptBndsPrdStrt() != null) {
			java.text.SimpleDateFormat ActvtyDfn_TmgTmg_Rpt_BndsPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ActvtyDfn_TmgTmg_Rpt_BndsPrd_Strtdate = ActvtyDfn_TmgTmg_Rpt_BndsPrd_Strtsdf.parse(a.getActvtyDfnTmgTmgRptBndsPrdStrt());
			activitydefinitiontimingtimingrepeatboundsperiod.setStart(ActvtyDfn_TmgTmg_Rpt_BndsPrd_Strtdate);
		}
		/******************** activitydefinitiontimingtimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range activitydefinitiontimingtimingrepeatboundsrange =  new org.hl7.fhir.r4.model.Range();
		activitydefinitiontimingtimingrepeat.setBounds(activitydefinitiontimingtimingrepeatboundsrange);

		/******************** activitydefinitiontimingtimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiontimingtimingrepeatboundsrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		activitydefinitiontimingtimingrepeatboundsrange.setHigh(activitydefinitiontimingtimingrepeatboundsrangehigh);

		/******************** ActvtyDfn_TmgTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptBndsRngHiCd() != null) {
			activitydefinitiontimingtimingrepeatboundsrangehigh.setCode(a.getActvtyDfnTmgTmgRptBndsRngHiCd());
		}
		/******************** activitydefinitiontimingtimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory activitydefinitiontimingtimingrepeatboundsrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		activitydefinitiontimingtimingrepeatboundsrangehigh.setComparator(activitydefinitiontimingtimingrepeatboundsrangehighcomparator.fromCode(a.getActvtyDfnTmgTmgRptBndsRngHiCmprtr()));

		/******************** ActvtyDfn_TmgTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptBndsRngHiSys() != null) {
			activitydefinitiontimingtimingrepeatboundsrangehigh.setSystem(a.getActvtyDfnTmgTmgRptBndsRngHiSys());
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptBndsRngHiUnt() != null) {
			activitydefinitiontimingtimingrepeatboundsrangehigh.setUnit(a.getActvtyDfnTmgTmgRptBndsRngHiUnt());
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptBndsRngHiVl() != null) {
			activitydefinitiontimingtimingrepeatboundsrangehigh.setValue(Double.parseDouble((a.getActvtyDfnTmgTmgRptBndsRngHiVl())));
		}
		/******************** activitydefinitiontimingtimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitiontimingtimingrepeatboundsrangelow =  new org.hl7.fhir.r4.model.Quantity();
		activitydefinitiontimingtimingrepeatboundsrange.setLow(activitydefinitiontimingtimingrepeatboundsrangelow);

		/******************** ActvtyDfn_TmgTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptBndsRngLwCd() != null) {
			activitydefinitiontimingtimingrepeatboundsrangelow.setCode(a.getActvtyDfnTmgTmgRptBndsRngLwCd());
		}
		/******************** activitydefinitiontimingtimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory activitydefinitiontimingtimingrepeatboundsrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		activitydefinitiontimingtimingrepeatboundsrangelow.setComparator(activitydefinitiontimingtimingrepeatboundsrangelowcomparator.fromCode(a.getActvtyDfnTmgTmgRptBndsRngLwCmprtr()));

		/******************** ActvtyDfn_TmgTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptBndsRngLwSys() != null) {
			activitydefinitiontimingtimingrepeatboundsrangelow.setSystem(a.getActvtyDfnTmgTmgRptBndsRngLwSys());
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptBndsRngLwUnt() != null) {
			activitydefinitiontimingtimingrepeatboundsrangelow.setUnit(a.getActvtyDfnTmgTmgRptBndsRngLwUnt());
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptBndsRngLwVl() != null) {
			activitydefinitiontimingtimingrepeatboundsrangelow.setValue(Double.parseDouble((a.getActvtyDfnTmgTmgRptBndsRngLwVl())));
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_Cnt ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptCnt() != null) {
			activitydefinitiontimingtimingrepeat.setCount(Integer.parseInt(a.getActvtyDfnTmgTmgRptCnt()));
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_CntMx ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptCntMx() != null) {
			activitydefinitiontimingtimingrepeat.setCountMax(Integer.parseInt(a.getActvtyDfnTmgTmgRptCntMx()));
		}
		/******************** activitydefinitiontimingtimingrepeatdayofweek ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory activitydefinitiontimingtimingrepeatdayofweek =  new org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory();
		activitydefinitiontimingtimingrepeat.addDayOfWeek(activitydefinitiontimingtimingrepeatdayofweek.fromCode(a.getActvtyDfnTmgTmgRptDayOfWeek()));

		/******************** ActvtyDfn_TmgTmg_Rpt_Duration ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptDuration() != null) {
			activitydefinitiontimingtimingrepeat.setDuration(Double.parseDouble((a.getActvtyDfnTmgTmgRptDuration())));
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_DurationMx ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptDurationMx() != null) {
			activitydefinitiontimingtimingrepeat.setDurationMax(Double.parseDouble((a.getActvtyDfnTmgTmgRptDurationMx())));
		}
		/******************** activitydefinitiontimingtimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory activitydefinitiontimingtimingrepeatdurationunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		activitydefinitiontimingtimingrepeat.setDurationUnit(activitydefinitiontimingtimingrepeatdurationunit.fromCode(a.getActvtyDfnTmgTmgRptDurationUnt()));

		/******************** ActvtyDfn_TmgTmg_Rpt_Frqncy ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptFrqncy() != null) {
			activitydefinitiontimingtimingrepeat.setFrequency(Integer.parseInt(a.getActvtyDfnTmgTmgRptFrqncy()));
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_FrqncyMx ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptFrqncyMx() != null) {
			activitydefinitiontimingtimingrepeat.setFrequencyMax(Integer.parseInt(a.getActvtyDfnTmgTmgRptFrqncyMx()));
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_Off ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptOff() != null) {
			activitydefinitiontimingtimingrepeat.setOffset(Integer.parseInt(a.getActvtyDfnTmgTmgRptOff()));
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_Prd ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptPrd() != null) {
			activitydefinitiontimingtimingrepeat.setPeriod(Double.parseDouble((a.getActvtyDfnTmgTmgRptPrd())));
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_PrdMx ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptPrdMx() != null) {
			activitydefinitiontimingtimingrepeat.setPeriodMax(new java.math.BigDecimal((a.getActvtyDfnTmgTmgRptPrdMx())));
		}
		/******************** activitydefinitiontimingtimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory activitydefinitiontimingtimingrepeatperiodunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		activitydefinitiontimingtimingrepeat.setPeriodUnit(activitydefinitiontimingtimingrepeatperiodunit.fromCode(a.getActvtyDfnTmgTmgRptPrdUnt()));

		/******************** ActvtyDfn_TmgTmg_Rpt_TimeOfDay ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptTimeOfDay() != null) {
			activitydefinitiontimingtimingrepeat.addTimeOfDay(a.getActvtyDfnTmgTmgRptTimeOfDay());
		}
		/******************** activitydefinitiontimingtimingrepeatwhen ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory activitydefinitiontimingtimingrepeatwhen =  new org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory();
		activitydefinitiontimingtimingrepeat.addWhen(activitydefinitiontimingtimingrepeatwhen.fromCode(a.getActvtyDfnTmgTmgRptWhen()));

		/******************** ActvtyDfn_Ttl ********************************************************************************/
		if(a.getActvtyDfnTtl() != null) {
			activitydefinition.setTitle(a.getActvtyDfnTtl());
		}
		/******************** activitydefinitiontopic ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitiontopic =  new org.hl7.fhir.r4.model.CodeableConcept();
		activitydefinition.addTopic(activitydefinitiontopic);

		/******************** activitydefinitiontopiccoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitiontopiccoding =  new org.hl7.fhir.r4.model.Coding();
		activitydefinitiontopic.addCoding(activitydefinitiontopiccoding);

		/******************** ActvtyDfn_Topic_Cdg_Cd ********************************************************************************/
		if(a.getActvtyDfnTopicCdgCd() != null) {
			activitydefinitiontopiccoding.setCode(a.getActvtyDfnTopicCdgCd());
		}
		/******************** ActvtyDfn_Topic_Cdg_Dsply ********************************************************************************/
		if(a.getActvtyDfnTopicCdgDsply() != null) {
			activitydefinitiontopiccoding.setDisplay(a.getActvtyDfnTopicCdgDsply());
		}
		/******************** ActvtyDfn_Topic_Cdg_Sys ********************************************************************************/
		if(a.getActvtyDfnTopicCdgSys() != null) {
			activitydefinitiontopiccoding.setSystem(a.getActvtyDfnTopicCdgSys());
		}
		/******************** ActvtyDfn_Topic_Cdg_UsrSltd ********************************************************************************/
		if(a.getActvtyDfnTopicCdgUsrSltd() != null) {
			activitydefinitiontopiccoding.setUserSelected(Boolean.parseBoolean(a.getActvtyDfnTopicCdgUsrSltd()));
		}
		/******************** ActvtyDfn_Topic_Cdg_Vrsn ********************************************************************************/
		if(a.getActvtyDfnTopicCdgVrsn() != null) {
			activitydefinitiontopiccoding.setVersion(a.getActvtyDfnTopicCdgVrsn());
		}
		/******************** ActvtyDfn_Topic_Txt ********************************************************************************/
		if(a.getActvtyDfnTopicTxt() != null) {
			activitydefinitiontopic.setText(a.getActvtyDfnTopicTxt());
		}
		/******************** ActvtyDfn_Transform ********************************************************************************/
		if(a.getActvtyDfnTransform() != null) {
			activitydefinition.setTransform(a.getActvtyDfnTransform());
		}
		/******************** ActvtyDfn_Url ********************************************************************************/
		if(a.getActvtyDfnUrl() != null) {
			activitydefinition.setUrl(a.getActvtyDfnUrl());
		}
		/******************** ActvtyDfn_Usg ********************************************************************************/
		if(a.getActvtyDfnUsg() != null) {
			activitydefinition.setUsage(a.getActvtyDfnUsg());
		}
		/******************** activitydefinitionusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext activitydefinitionusecontext =  new org.hl7.fhir.r4.model.UsageContext();
		activitydefinition.addUseContext(activitydefinitionusecontext);

		/******************** activitydefinitionusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitionusecontextcode =  new org.hl7.fhir.r4.model.Coding();
		activitydefinitionusecontext.setCode(activitydefinitionusecontextcode);

		/******************** ActvtyDfn_UseCntxt_Cd_Cd ********************************************************************************/
		if(a.getActvtyDfnUseCntxtCdCd() != null) {
			activitydefinitionusecontextcode.setCode(a.getActvtyDfnUseCntxtCdCd());
		}
		/******************** ActvtyDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(a.getActvtyDfnUseCntxtCdDsply() != null) {
			activitydefinitionusecontextcode.setDisplay(a.getActvtyDfnUseCntxtCdDsply());
		}
		/******************** ActvtyDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(a.getActvtyDfnUseCntxtCdSys() != null) {
			activitydefinitionusecontextcode.setSystem(a.getActvtyDfnUseCntxtCdSys());
		}
		/******************** ActvtyDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(a.getActvtyDfnUseCntxtCdUsrSltd() != null) {
			activitydefinitionusecontextcode.setUserSelected(Boolean.parseBoolean(a.getActvtyDfnUseCntxtCdUsrSltd()));
		}
		/******************** ActvtyDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(a.getActvtyDfnUseCntxtCdVrsn() != null) {
			activitydefinitionusecontextcode.setVersion(a.getActvtyDfnUseCntxtCdVrsn());
		}
		/******************** activitydefinitionusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept activitydefinitionusecontextvaluecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		activitydefinitionusecontext.setValue(activitydefinitionusecontextvaluecodeableconcept);

		/******************** activitydefinitionusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding activitydefinitionusecontextvaluecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		activitydefinitionusecontextvaluecodeableconcept.addCoding(activitydefinitionusecontextvaluecodeableconceptcoding);

		/******************** ActvtyDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlCdbleCncptCdgCd() != null) {
			activitydefinitionusecontextvaluecodeableconceptcoding.setCode(a.getActvtyDfnUseCntxtVlCdbleCncptCdgCd());
		}
		/******************** ActvtyDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlCdbleCncptCdgDsply() != null) {
			activitydefinitionusecontextvaluecodeableconceptcoding.setDisplay(a.getActvtyDfnUseCntxtVlCdbleCncptCdgDsply());
		}
		/******************** ActvtyDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlCdbleCncptCdgSys() != null) {
			activitydefinitionusecontextvaluecodeableconceptcoding.setSystem(a.getActvtyDfnUseCntxtVlCdbleCncptCdgSys());
		}
		/******************** ActvtyDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlCdbleCncptCdgUsrSltd() != null) {
			activitydefinitionusecontextvaluecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(a.getActvtyDfnUseCntxtVlCdbleCncptCdgUsrSltd()));
		}
		/******************** ActvtyDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlCdbleCncptCdgVrsn() != null) {
			activitydefinitionusecontextvaluecodeableconceptcoding.setVersion(a.getActvtyDfnUseCntxtVlCdbleCncptCdgVrsn());
		}
		/******************** ActvtyDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlCdbleCncptTxt() != null) {
			activitydefinitionusecontextvaluecodeableconcept.setText(a.getActvtyDfnUseCntxtVlCdbleCncptTxt());
		}
		/******************** activitydefinitionusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitionusecontextvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		activitydefinitionusecontext.setValue(activitydefinitionusecontextvaluequantity);

		/******************** ActvtyDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlQntyCd() != null) {
			activitydefinitionusecontextvaluequantity.setCode(a.getActvtyDfnUseCntxtVlQntyCd());
		}
		/******************** activitydefinitionusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory activitydefinitionusecontextvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		activitydefinitionusecontextvaluequantity.setComparator(activitydefinitionusecontextvaluequantitycomparator.fromCode(a.getActvtyDfnUseCntxtVlQntyCmprtr()));

		/******************** ActvtyDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlQntySys() != null) {
			activitydefinitionusecontextvaluequantity.setSystem(a.getActvtyDfnUseCntxtVlQntySys());
		}
		/******************** ActvtyDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlQntyUnt() != null) {
			activitydefinitionusecontextvaluequantity.setUnit(a.getActvtyDfnUseCntxtVlQntyUnt());
		}
		/******************** ActvtyDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlQntyVl() != null) {
			activitydefinitionusecontextvaluequantity.setValue(Double.parseDouble((a.getActvtyDfnUseCntxtVlQntyVl())));
		}
		/******************** activitydefinitionusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range activitydefinitionusecontextvaluerange =  new org.hl7.fhir.r4.model.Range();
		activitydefinitionusecontext.setValue(activitydefinitionusecontextvaluerange);

		/******************** activitydefinitionusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitionusecontextvaluerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		activitydefinitionusecontextvaluerange.setHigh(activitydefinitionusecontextvaluerangehigh);

		/******************** ActvtyDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlRngHiCd() != null) {
			activitydefinitionusecontextvaluerangehigh.setCode(a.getActvtyDfnUseCntxtVlRngHiCd());
		}
		/******************** activitydefinitionusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory activitydefinitionusecontextvaluerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		activitydefinitionusecontextvaluerangehigh.setComparator(activitydefinitionusecontextvaluerangehighcomparator.fromCode(a.getActvtyDfnUseCntxtVlRngHiCmprtr()));

		/******************** ActvtyDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlRngHiSys() != null) {
			activitydefinitionusecontextvaluerangehigh.setSystem(a.getActvtyDfnUseCntxtVlRngHiSys());
		}
		/******************** ActvtyDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlRngHiUnt() != null) {
			activitydefinitionusecontextvaluerangehigh.setUnit(a.getActvtyDfnUseCntxtVlRngHiUnt());
		}
		/******************** ActvtyDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlRngHiVl() != null) {
			activitydefinitionusecontextvaluerangehigh.setValue(Double.parseDouble((a.getActvtyDfnUseCntxtVlRngHiVl())));
		}
		/******************** activitydefinitionusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity activitydefinitionusecontextvaluerangelow =  new org.hl7.fhir.r4.model.Quantity();
		activitydefinitionusecontextvaluerange.setLow(activitydefinitionusecontextvaluerangelow);

		/******************** ActvtyDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlRngLwCd() != null) {
			activitydefinitionusecontextvaluerangelow.setCode(a.getActvtyDfnUseCntxtVlRngLwCd());
		}
		/******************** activitydefinitionusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory activitydefinitionusecontextvaluerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		activitydefinitionusecontextvaluerangelow.setComparator(activitydefinitionusecontextvaluerangelowcomparator.fromCode(a.getActvtyDfnUseCntxtVlRngLwCmprtr()));

		/******************** ActvtyDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlRngLwSys() != null) {
			activitydefinitionusecontextvaluerangelow.setSystem(a.getActvtyDfnUseCntxtVlRngLwSys());
		}
		/******************** ActvtyDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlRngLwUnt() != null) {
			activitydefinitionusecontextvaluerangelow.setUnit(a.getActvtyDfnUseCntxtVlRngLwUnt());
		}
		/******************** ActvtyDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlRngLwVl() != null) {
			activitydefinitionusecontextvaluerangelow.setValue(Double.parseDouble((a.getActvtyDfnUseCntxtVlRngLwVl())));
		}
		/******************** ActvtyDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlRfrnc() != null) {
			activitydefinitionusecontext.setValue( new org.hl7.fhir.r4.model.Reference(a.getActvtyDfnUseCntxtVlRfrnc()));
		}
		/******************** ActvtyDfn_Vrsn ********************************************************************************/
		if(a.getActvtyDfnVrsn() != null) {
			activitydefinition.setVersion(a.getActvtyDfnVrsn());
		}
		return activitydefinition;
	}
}
