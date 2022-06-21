package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProductPharmaceutical;
public class MedicinalProductPharmaceuticalBidirectionalConversion 
{
	public MedicinalProductPharmaceutical MedicinalProductPharmaceuticals(org.hl7.fhir.r4.model.MedicinalProductPharmaceutical medicinalproductpharmaceutical) throws ParseException
	{
		 main.java.com.campfhir.model.MedicinalProductPharmaceutical m = new  main.java.com.campfhir.model.MedicinalProductPharmaceutical();

		/******************** id ********************************************************************************/
		medicinalproductpharmaceutical.setId(m.getId());

		/******************** medicinalproductpharmaceuticalcharacteristics ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProductPharmaceutical.MedicinalProductPharmaceuticalCharacteristicsComponent medicinalproductpharmaceuticalcharacteristics = medicinalproductpharmaceutical.getCharacteristicsFirstRep();

		/******************** medicinalproductpharmaceuticalcharacteristicscode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpharmaceuticalcharacteristicscode = medicinalproductpharmaceuticalcharacteristics.getCode();

		/******************** medicinalproductpharmaceuticalcharacteristicscodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpharmaceuticalcharacteristicscodecoding = medicinalproductpharmaceuticalcharacteristicscode.getCodingFirstRep();

		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Cd_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpharmaceuticalcharacteristicscodecoding.hasDisplay()) {
			m.setMdcnlPrdctPhrmctclCrctrstcsCdCdgDsply(String.valueOf(medicinalproductpharmaceuticalcharacteristicscodecoding.getDisplay()));
		}
		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Cd_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpharmaceuticalcharacteristicscodecoding.hasVersion()) {
			m.setMdcnlPrdctPhrmctclCrctrstcsCdCdgVrsn(String.valueOf(medicinalproductpharmaceuticalcharacteristicscodecoding.getVersion()));
		}
		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Cd_Cdg_Cd ********************************************************************************/
		if(medicinalproductpharmaceuticalcharacteristicscodecoding.hasCode()) {
			m.setMdcnlPrdctPhrmctclCrctrstcsCdCdgCd(String.valueOf(medicinalproductpharmaceuticalcharacteristicscodecoding.getCode()));
		}
		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Cd_Cdg_Sys ********************************************************************************/
		if(medicinalproductpharmaceuticalcharacteristicscodecoding.hasSystem()) {
			m.setMdcnlPrdctPhrmctclCrctrstcsCdCdgSys(String.valueOf(medicinalproductpharmaceuticalcharacteristicscodecoding.getSystem()));
		}
		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Cd_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpharmaceuticalcharacteristicscodecoding.hasUserSelected()) {
			m.setMdcnlPrdctPhrmctclCrctrstcsCdCdgUsrSltd(String.valueOf(medicinalproductpharmaceuticalcharacteristicscodecoding.getUserSelected()));
		}
		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Cd_Txt ********************************************************************************/
		if(medicinalproductpharmaceuticalcharacteristicscode.hasText()) {
			m.setMdcnlPrdctPhrmctclCrctrstcsCdTxt(String.valueOf(medicinalproductpharmaceuticalcharacteristicscode.getText()));
		}
		/******************** medicinalproductpharmaceuticalcharacteristicsstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpharmaceuticalcharacteristicsstatus = medicinalproductpharmaceuticalcharacteristics.getStatus();

		/******************** medicinalproductpharmaceuticalcharacteristicsstatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpharmaceuticalcharacteristicsstatuscoding = medicinalproductpharmaceuticalcharacteristicsstatus.getCodingFirstRep();

		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Sts_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpharmaceuticalcharacteristicsstatuscoding.hasDisplay()) {
			m.setMdcnlPrdctPhrmctclCrctrstcsStsCdgDsply(String.valueOf(medicinalproductpharmaceuticalcharacteristicsstatuscoding.getDisplay()));
		}
		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Sts_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpharmaceuticalcharacteristicsstatuscoding.hasVersion()) {
			m.setMdcnlPrdctPhrmctclCrctrstcsStsCdgVrsn(String.valueOf(medicinalproductpharmaceuticalcharacteristicsstatuscoding.getVersion()));
		}
		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Sts_Cdg_Cd ********************************************************************************/
		if(medicinalproductpharmaceuticalcharacteristicsstatuscoding.hasCode()) {
			m.setMdcnlPrdctPhrmctclCrctrstcsStsCdgCd(String.valueOf(medicinalproductpharmaceuticalcharacteristicsstatuscoding.getCode()));
		}
		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Sts_Cdg_Sys ********************************************************************************/
		if(medicinalproductpharmaceuticalcharacteristicsstatuscoding.hasSystem()) {
			m.setMdcnlPrdctPhrmctclCrctrstcsStsCdgSys(String.valueOf(medicinalproductpharmaceuticalcharacteristicsstatuscoding.getSystem()));
		}
		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Sts_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpharmaceuticalcharacteristicsstatuscoding.hasUserSelected()) {
			m.setMdcnlPrdctPhrmctclCrctrstcsStsCdgUsrSltd(String.valueOf(medicinalproductpharmaceuticalcharacteristicsstatuscoding.getUserSelected()));
		}
		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Sts_Txt ********************************************************************************/
		if(medicinalproductpharmaceuticalcharacteristicsstatus.hasText()) {
			m.setMdcnlPrdctPhrmctclCrctrstcsStsTxt(String.valueOf(medicinalproductpharmaceuticalcharacteristicsstatus.getText()));
		}
		/******************** medicinalproductpharmaceuticalrouteofadministration ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProductPharmaceutical.MedicinalProductPharmaceuticalRouteOfAdministrationComponent medicinalproductpharmaceuticalrouteofadministration = medicinalproductpharmaceutical.getRouteOfAdministrationFirstRep();

		/******************** medicinalproductpharmaceuticalrouteofadministrationcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpharmaceuticalrouteofadministrationcode = medicinalproductpharmaceuticalrouteofadministration.getCode();

		/******************** medicinalproductpharmaceuticalrouteofadministrationcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpharmaceuticalrouteofadministrationcodecoding = medicinalproductpharmaceuticalrouteofadministrationcode.getCodingFirstRep();

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_Cd_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationcodecoding.hasDisplay()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgDsply(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationcodecoding.getDisplay()));
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_Cd_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationcodecoding.hasVersion()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgVrsn(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationcodecoding.getVersion()));
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_Cd_Cdg_Cd ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationcodecoding.hasCode()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgCd(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationcodecoding.getCode()));
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_Cd_Cdg_Sys ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationcodecoding.hasSystem()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgSys(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationcodecoding.getSystem()));
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationcodecoding.hasUserSelected()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgUsrSltd(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationcodecoding.getUserSelected()));
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_Cd_Txt ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationcode.hasText()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnCdTxt(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationcode.getText()));
		}
		/******************** medicinalproductpharmaceuticalrouteofadministrationtargetspecies ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProductPharmaceutical.MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesComponent medicinalproductpharmaceuticalrouteofadministrationtargetspecies = medicinalproductpharmaceuticalrouteofadministration.getTargetSpeciesFirstRep();

		/******************** medicinalproductpharmaceuticalrouteofadministrationtargetspeciescode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpharmaceuticalrouteofadministrationtargetspeciescode = medicinalproductpharmaceuticalrouteofadministrationtargetspecies.getCode();

		/******************** medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecoding = medicinalproductpharmaceuticalrouteofadministrationtargetspeciescode.getCodingFirstRep();

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TargetSpcs_Cd_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecoding.hasDisplay()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgDsply(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecoding.getDisplay()));
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TargetSpcs_Cd_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecoding.hasVersion()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgVrsn(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecoding.getVersion()));
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TargetSpcs_Cd_Cdg_Cd ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecoding.hasCode()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgCd(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecoding.getCode()));
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TargetSpcs_Cd_Cdg_Sys ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecoding.hasSystem()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgSys(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecoding.getSystem()));
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TargetSpcs_Cd_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecoding.hasUserSelected()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgUsrSltd(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationtargetspeciescodecoding.getUserSelected()));
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TargetSpcs_Cd_Txt ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspeciescode.hasText()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdTxt(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationtargetspeciescode.getText()));
		}
		/******************** medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiod ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProductPharmaceutical.MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodComponent medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiod = medicinalproductpharmaceuticalrouteofadministrationtargetspecies.getWithdrawalPeriodFirstRep();

		/******************** medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodvalue ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodvalue = medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiod.getValue();

		/******************** medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodvaluecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodvaluecomparator = medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodvalue.getComparator();
		m.setMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlCmprtr(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodvaluecomparator.toCode());

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TargetSpcs_WthdrwlPrd_Vl_Cd ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodvalue.hasCode()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlCd(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodvalue.getCode()));
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TargetSpcs_WthdrwlPrd_Vl_Sys ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodvalue.hasSystem()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlSys(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodvalue.getSystem()));
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TargetSpcs_WthdrwlPrd_Vl_Unt ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodvalue.hasUnit()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlUnt(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodvalue.getUnit()));
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TargetSpcs_WthdrwlPrd_SprtingInfo ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiod.hasSupportingInformation()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdSprtingInfo(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiod.getSupportingInformation()));
		}
		/******************** medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissue ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissue = medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiod.getTissue();

		/******************** medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecoding = medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissue.getCodingFirstRep();

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TargetSpcs_WthdrwlPrd_Tissue_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecoding.hasDisplay()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTssueCdgDsp(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecoding.getDisplay()));
			
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TargetSpcs_WthdrwlPrd_Tissue_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecoding.hasVersion()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTssueCdgVrsn(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecoding.getVersion()));
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TargetSpcs_WthdrwlPrd_Tissue_Cdg_Cd ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecoding.hasCode()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTissueCdgCd(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecoding.getCode()));
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TargetSpcs_WthdrwlPrd_Tissue_Cdg_Sys ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecoding.hasSystem()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTissueCdgSys(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecoding.getSystem()));
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TargetSpcs_WthdrwlPrd_Tissue_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecoding.hasUserSelected()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTssueCdgUs(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissuecoding.getUserSelected()));
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TargetSpcs_WthdrwlPrd_Tissue_Txt ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissue.hasText()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTissueTxt(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationtargetspecieswithdrawalperiodtissue.getText()));
		}
		/******************** medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiod = medicinalproductpharmaceuticalrouteofadministration.getMaxDosePerTreatmentPeriod();

		/******************** medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumerator = medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiod.getNumerator();

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerTrtmntPrd_Nmrtr_Vl ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumerator.hasValue()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrVl(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumerator.getValue()));
		}
		/******************** medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumeratorcomparator = medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumerator.getComparator();
		m.setMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrCmprtr(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumeratorcomparator.toCode());

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerTrtmntPrd_Nmrtr_Cd ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumerator.hasCode()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrCd(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumerator.getCode()));
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerTrtmntPrd_Nmrtr_Sys ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumerator.hasSystem()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrSys(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumerator.getSystem()));
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerTrtmntPrd_Nmrtr_Unt ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumerator.hasUnit()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrUnt(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumerator.getUnit()));
		}
		/******************** medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominator = medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiod.getDenominator();

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerTrtmntPrd_Dnmntr_Vl ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominator.hasValue()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrVl(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominator.getValue()));
		}
		/******************** medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominatorcomparator = medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominator.getComparator();
		m.setMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrCmprtr(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominatorcomparator.toCode());

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerTrtmntPrd_Dnmntr_Cd ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominator.hasCode()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrCd(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominator.getCode()));
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerTrtmntPrd_Dnmntr_Sys ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominator.hasSystem()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrSys(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominator.getSystem()));
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerTrtmntPrd_Dnmntr_Unt ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominator.hasUnit()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrUnt(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominator.getUnit()));
		}
		/******************** medicinalproductpharmaceuticalrouteofadministrationmaxtreatmentperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Duration medicinalproductpharmaceuticalrouteofadministrationmaxtreatmentperiod = medicinalproductpharmaceuticalrouteofadministration.getMaxTreatmentPeriod();

		/******************** medicinalproductpharmaceuticalrouteofadministrationmaxdoseperday ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpharmaceuticalrouteofadministrationmaxdoseperday = medicinalproductpharmaceuticalrouteofadministration.getMaxDosePerDay();

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerDay_Vl ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationmaxdoseperday.hasValue()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDayVl(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationmaxdoseperday.getValue()));
		}
		/******************** medicinalproductpharmaceuticalrouteofadministrationmaxdoseperdaycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductpharmaceuticalrouteofadministrationmaxdoseperdaycomparator = medicinalproductpharmaceuticalrouteofadministrationmaxdoseperday.getComparator();
		m.setMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDayCmprtr(medicinalproductpharmaceuticalrouteofadministrationmaxdoseperdaycomparator.toCode());

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerDay_Cd ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationmaxdoseperday.hasCode()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDayCd(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationmaxdoseperday.getCode()));
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerDay_Sys ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationmaxdoseperday.hasSystem()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDaySys(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationmaxdoseperday.getSystem()));
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerDay_Unt ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationmaxdoseperday.hasUnit()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDayUnt(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationmaxdoseperday.getUnit()));
		}
		/******************** medicinalproductpharmaceuticalrouteofadministrationfirstdose ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpharmaceuticalrouteofadministrationfirstdose = medicinalproductpharmaceuticalrouteofadministration.getFirstDose();

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_FirstDose_Vl ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationfirstdose.hasValue()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseVl(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationfirstdose.getValue()));
		}
		/******************** medicinalproductpharmaceuticalrouteofadministrationfirstdosecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductpharmaceuticalrouteofadministrationfirstdosecomparator = medicinalproductpharmaceuticalrouteofadministrationfirstdose.getComparator();
		m.setMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseCmprtr(medicinalproductpharmaceuticalrouteofadministrationfirstdosecomparator.toCode());

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_FirstDose_Cd ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationfirstdose.hasCode()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseCd(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationfirstdose.getCode()));
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_FirstDose_Sys ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationfirstdose.hasSystem()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseSys(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationfirstdose.getSystem()));
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_FirstDose_Unt ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationfirstdose.hasUnit()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseUnt(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationfirstdose.getUnit()));
		}
		/******************** medicinalproductpharmaceuticalrouteofadministrationmaxsingledose ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpharmaceuticalrouteofadministrationmaxsingledose = medicinalproductpharmaceuticalrouteofadministration.getMaxSingleDose();

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxSingleDose_Vl ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationmaxsingledose.hasValue()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnMxSingleDoseVl(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationmaxsingledose.getValue()));
		}
		/******************** medicinalproductpharmaceuticalrouteofadministrationmaxsingledosecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator medicinalproductpharmaceuticalrouteofadministrationmaxsingledosecomparator = medicinalproductpharmaceuticalrouteofadministrationmaxsingledose.getComparator();
		m.setMdcnlPrdctPhrmctclRtOfAdmnstnMxSingleDoseCmprtr(medicinalproductpharmaceuticalrouteofadministrationmaxsingledosecomparator.toCode());

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxSingleDose_Cd ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationmaxsingledose.hasCode()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnMxSingleDoseCd(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationmaxsingledose.getCode()));
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxSingleDose_Sys ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationmaxsingledose.hasSystem()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnMxSingleDoseSys(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationmaxsingledose.getSystem()));
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxSingleDose_Unt ********************************************************************************/
		if(medicinalproductpharmaceuticalrouteofadministrationmaxsingledose.hasUnit()) {
			m.setMdcnlPrdctPhrmctclRtOfAdmnstnMxSingleDoseUnt(String.valueOf(medicinalproductpharmaceuticalrouteofadministrationmaxsingledose.getUnit()));
		}
		/******************** medicinalproductpharmaceuticaladministrabledoseform ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpharmaceuticaladministrabledoseform = medicinalproductpharmaceutical.getAdministrableDoseForm();

		/******************** medicinalproductpharmaceuticaladministrabledoseformcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpharmaceuticaladministrabledoseformcoding = medicinalproductpharmaceuticaladministrabledoseform.getCodingFirstRep();

		/******************** MdcnlPrdctPhrmctcl_AdministrableDoseFrm_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpharmaceuticaladministrabledoseformcoding.hasDisplay()) {
			m.setMdcnlPrdctPhrmctclAdministrableDoseFrmCdgDsply(String.valueOf(medicinalproductpharmaceuticaladministrabledoseformcoding.getDisplay()));
		}
		/******************** MdcnlPrdctPhrmctcl_AdministrableDoseFrm_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpharmaceuticaladministrabledoseformcoding.hasVersion()) {
			m.setMdcnlPrdctPhrmctclAdministrableDoseFrmCdgVrsn(String.valueOf(medicinalproductpharmaceuticaladministrabledoseformcoding.getVersion()));
		}
		/******************** MdcnlPrdctPhrmctcl_AdministrableDoseFrm_Cdg_Cd ********************************************************************************/
		if(medicinalproductpharmaceuticaladministrabledoseformcoding.hasCode()) {
			m.setMdcnlPrdctPhrmctclAdministrableDoseFrmCdgCd(String.valueOf(medicinalproductpharmaceuticaladministrabledoseformcoding.getCode()));
		}
		/******************** MdcnlPrdctPhrmctcl_AdministrableDoseFrm_Cdg_Sys ********************************************************************************/
		if(medicinalproductpharmaceuticaladministrabledoseformcoding.hasSystem()) {
			m.setMdcnlPrdctPhrmctclAdministrableDoseFrmCdgSys(String.valueOf(medicinalproductpharmaceuticaladministrabledoseformcoding.getSystem()));
		}
		/******************** MdcnlPrdctPhrmctcl_AdministrableDoseFrm_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpharmaceuticaladministrabledoseformcoding.hasUserSelected()) {
			m.setMdcnlPrdctPhrmctclAdministrableDoseFrmCdgUsrSltd(String.valueOf(medicinalproductpharmaceuticaladministrabledoseformcoding.getUserSelected()));
		}
		/******************** MdcnlPrdctPhrmctcl_AdministrableDoseFrm_Txt ********************************************************************************/
		if(medicinalproductpharmaceuticaladministrabledoseform.hasText()) {
			m.setMdcnlPrdctPhrmctclAdministrableDoseFrmTxt(String.valueOf(medicinalproductpharmaceuticaladministrabledoseform.getText()));
		}
		/******************** medicinalproductpharmaceuticalunitofpresentation ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpharmaceuticalunitofpresentation = medicinalproductpharmaceutical.getUnitOfPresentation();

		/******************** medicinalproductpharmaceuticalunitofpresentationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpharmaceuticalunitofpresentationcoding = medicinalproductpharmaceuticalunitofpresentation.getCodingFirstRep();

		/******************** MdcnlPrdctPhrmctcl_UntOfPrsnttn_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpharmaceuticalunitofpresentationcoding.hasDisplay()) {
			m.setMdcnlPrdctPhrmctclUntOfPrsnttnCdgDsply(String.valueOf(medicinalproductpharmaceuticalunitofpresentationcoding.getDisplay()));
		}
		/******************** MdcnlPrdctPhrmctcl_UntOfPrsnttn_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpharmaceuticalunitofpresentationcoding.hasVersion()) {
			m.setMdcnlPrdctPhrmctclUntOfPrsnttnCdgVrsn(String.valueOf(medicinalproductpharmaceuticalunitofpresentationcoding.getVersion()));
		}
		/******************** MdcnlPrdctPhrmctcl_UntOfPrsnttn_Cdg_Cd ********************************************************************************/
		if(medicinalproductpharmaceuticalunitofpresentationcoding.hasCode()) {
			m.setMdcnlPrdctPhrmctclUntOfPrsnttnCdgCd(String.valueOf(medicinalproductpharmaceuticalunitofpresentationcoding.getCode()));
		}
		/******************** MdcnlPrdctPhrmctcl_UntOfPrsnttn_Cdg_Sys ********************************************************************************/
		if(medicinalproductpharmaceuticalunitofpresentationcoding.hasSystem()) {
			m.setMdcnlPrdctPhrmctclUntOfPrsnttnCdgSys(String.valueOf(medicinalproductpharmaceuticalunitofpresentationcoding.getSystem()));
		}
		/******************** MdcnlPrdctPhrmctcl_UntOfPrsnttn_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpharmaceuticalunitofpresentationcoding.hasUserSelected()) {
			m.setMdcnlPrdctPhrmctclUntOfPrsnttnCdgUsrSltd(String.valueOf(medicinalproductpharmaceuticalunitofpresentationcoding.getUserSelected()));
		}
		/******************** MdcnlPrdctPhrmctcl_UntOfPrsnttn_Txt ********************************************************************************/
		if(medicinalproductpharmaceuticalunitofpresentation.hasText()) {
			m.setMdcnlPrdctPhrmctclUntOfPrsnttnTxt(String.valueOf(medicinalproductpharmaceuticalunitofpresentation.getText()));
		}
		/******************** medicinalproductpharmaceuticalidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicinalproductpharmaceuticalidentifier = medicinalproductpharmaceutical.getIdentifierFirstRep();

		/******************** MdcnlPrdctPhrmctcl_Id_Vl ********************************************************************************/
		if(medicinalproductpharmaceuticalidentifier.hasValue()) {
			m.setMdcnlPrdctPhrmctclIdVl(String.valueOf(medicinalproductpharmaceuticalidentifier.getValue()));
		}
		/******************** medicinalproductpharmaceuticalidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpharmaceuticalidentifiertype = medicinalproductpharmaceuticalidentifier.getType();

		/******************** medicinalproductpharmaceuticalidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpharmaceuticalidentifiertypecoding = medicinalproductpharmaceuticalidentifiertype.getCodingFirstRep();

		/******************** MdcnlPrdctPhrmctcl_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(medicinalproductpharmaceuticalidentifiertypecoding.hasDisplay()) {
			m.setMdcnlPrdctPhrmctclIdTypCdgDsply(String.valueOf(medicinalproductpharmaceuticalidentifiertypecoding.getDisplay()));
		}
		/******************** MdcnlPrdctPhrmctcl_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(medicinalproductpharmaceuticalidentifiertypecoding.hasVersion()) {
			m.setMdcnlPrdctPhrmctclIdTypCdgVrsn(String.valueOf(medicinalproductpharmaceuticalidentifiertypecoding.getVersion()));
		}
		/******************** MdcnlPrdctPhrmctcl_Id_Typ_Cdg_Cd ********************************************************************************/
		if(medicinalproductpharmaceuticalidentifiertypecoding.hasCode()) {
			m.setMdcnlPrdctPhrmctclIdTypCdgCd(String.valueOf(medicinalproductpharmaceuticalidentifiertypecoding.getCode()));
		}
		/******************** MdcnlPrdctPhrmctcl_Id_Typ_Cdg_Sys ********************************************************************************/
		if(medicinalproductpharmaceuticalidentifiertypecoding.hasSystem()) {
			m.setMdcnlPrdctPhrmctclIdTypCdgSys(String.valueOf(medicinalproductpharmaceuticalidentifiertypecoding.getSystem()));
		}
		/******************** MdcnlPrdctPhrmctcl_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(medicinalproductpharmaceuticalidentifiertypecoding.hasUserSelected()) {
			m.setMdcnlPrdctPhrmctclIdTypCdgUsrSltd(String.valueOf(medicinalproductpharmaceuticalidentifiertypecoding.getUserSelected()));
		}
		/******************** MdcnlPrdctPhrmctcl_Id_Typ_Txt ********************************************************************************/
		if(medicinalproductpharmaceuticalidentifiertype.hasText()) {
			m.setMdcnlPrdctPhrmctclIdTypTxt(String.valueOf(medicinalproductpharmaceuticalidentifiertype.getText()));
		}
		/******************** MdcnlPrdctPhrmctcl_Id_Sys ********************************************************************************/
		if(medicinalproductpharmaceuticalidentifier.hasSystem()) {
			m.setMdcnlPrdctPhrmctclIdSys(String.valueOf(medicinalproductpharmaceuticalidentifier.getSystem()));
		}
		/******************** MdcnlPrdctPhrmctcl_Id_Assigner ********************************************************************************/
		if(medicinalproductpharmaceuticalidentifier.hasAssigner()) {
			m.setMdcnlPrdctPhrmctclIdAssigner(String.valueOf(medicinalproductpharmaceuticalidentifier.getAssigner()));
		}
		/******************** medicinalproductpharmaceuticalidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductpharmaceuticalidentifierperiod = medicinalproductpharmaceuticalidentifier.getPeriod();

		/******************** MdcnlPrdctPhrmctcl_Id_Prd_End ********************************************************************************/
		if(medicinalproductpharmaceuticalidentifierperiod.hasEnd()) {
			m.setMdcnlPrdctPhrmctclIdPrdEnd(String.valueOf(medicinalproductpharmaceuticalidentifierperiod.getEnd()));
		}
		/******************** MdcnlPrdctPhrmctcl_Id_Prd_Strt ********************************************************************************/
		if(medicinalproductpharmaceuticalidentifierperiod.hasStart()) {
			m.setMdcnlPrdctPhrmctclIdPrdStrt(String.valueOf(medicinalproductpharmaceuticalidentifierperiod.getStart()));
		}
		/******************** medicinalproductpharmaceuticalidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse medicinalproductpharmaceuticalidentifieruse = medicinalproductpharmaceuticalidentifier.getUse();
		m.setMdcnlPrdctPhrmctclIdUse(medicinalproductpharmaceuticalidentifieruse.toCode());

		/******************** MdcnlPrdctPhrmctcl_Dvc ********************************************************************************/
		if(medicinalproductpharmaceutical.hasDevice()) {
			m.setMdcnlPrdctPhrmctclDvc(String.valueOf(medicinalproductpharmaceutical.getDeviceFirstRep()));
		}
		/******************** MdcnlPrdctPhrmctcl_Igrdnt ********************************************************************************/
		if(medicinalproductpharmaceutical.hasIngredient()) {
			m.setMdcnlPrdctPhrmctclIgrdnt(String.valueOf(medicinalproductpharmaceutical.getIngredientFirstRep()));
		}
		return m;
	}
}
