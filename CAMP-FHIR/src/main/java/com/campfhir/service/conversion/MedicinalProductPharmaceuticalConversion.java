package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProductPharmaceutical;
public class MedicinalProductPharmaceuticalConversion 
{
	public org.hl7.fhir.r4.model.MedicinalProductPharmaceutical MedicinalProductPharmaceuticals(MedicinalProductPharmaceutical m) throws ParseException
	{
		org.hl7.fhir.r4.model.MedicinalProductPharmaceutical medicinalproductpharmaceutical = new org.hl7.fhir.r4.model.MedicinalProductPharmaceutical();

		/******************** id ********************************************************************************/
		medicinalproductpharmaceutical.setId(m.getId());

		/******************** medicinalproductpharmaceuticaladministrabledoseform ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpharmaceuticaladministrabledoseform =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductpharmaceutical.setAdministrableDoseForm(medicinalproductpharmaceuticaladministrabledoseform);

		/******************** medicinalproductpharmaceuticaladministrabledoseformcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpharmaceuticaladministrabledoseformcoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductpharmaceuticaladministrabledoseform.addCoding(medicinalproductpharmaceuticaladministrabledoseformcoding);

		/******************** MdcnlPrdctPhrmctcl_AdministrableDoseFrm_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclAdministrableDoseFrmCdgCd() != null) {
			medicinalproductpharmaceuticaladministrabledoseformcoding.setCode(m.getMdcnlPrdctPhrmctclAdministrableDoseFrmCdgCd());
		}
		/******************** MdcnlPrdctPhrmctcl_AdministrableDoseFrm_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclAdministrableDoseFrmCdgDsply() != null) {
			medicinalproductpharmaceuticaladministrabledoseformcoding.setDisplay(m.getMdcnlPrdctPhrmctclAdministrableDoseFrmCdgDsply());
		}
		/******************** MdcnlPrdctPhrmctcl_AdministrableDoseFrm_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclAdministrableDoseFrmCdgSys() != null) {
			medicinalproductpharmaceuticaladministrabledoseformcoding.setSystem(m.getMdcnlPrdctPhrmctclAdministrableDoseFrmCdgSys());
		}
		/******************** MdcnlPrdctPhrmctcl_AdministrableDoseFrm_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclAdministrableDoseFrmCdgUsrSltd() != null) {
			medicinalproductpharmaceuticaladministrabledoseformcoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctPhrmctclAdministrableDoseFrmCdgUsrSltd()));
		}
		/******************** MdcnlPrdctPhrmctcl_AdministrableDoseFrm_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclAdministrableDoseFrmCdgVrsn() != null) {
			medicinalproductpharmaceuticaladministrabledoseformcoding.setVersion(m.getMdcnlPrdctPhrmctclAdministrableDoseFrmCdgVrsn());
		}
		/******************** MdcnlPrdctPhrmctcl_AdministrableDoseFrm_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclAdministrableDoseFrmTxt() != null) {
			medicinalproductpharmaceuticaladministrabledoseform.setText(m.getMdcnlPrdctPhrmctclAdministrableDoseFrmTxt());
		}
		/******************** medicinalproductpharmaceuticalcharacteristics ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProductPharmaceutical.MedicinalProductPharmaceuticalCharacteristicsComponent medicinalproductpharmaceuticalcharacteristics =  new org.hl7.fhir.r4.model.MedicinalProductPharmaceutical.MedicinalProductPharmaceuticalCharacteristicsComponent();
		medicinalproductpharmaceutical.addCharacteristics(medicinalproductpharmaceuticalcharacteristics);

		/******************** medicinalproductpharmaceuticalcharacteristicscode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpharmaceuticalcharacteristicscode =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductpharmaceuticalcharacteristics.setCode(medicinalproductpharmaceuticalcharacteristicscode);

		/******************** medicinalproductpharmaceuticalcharacteristicscodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpharmaceuticalcharacteristicscodecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductpharmaceuticalcharacteristicscode.addCoding(medicinalproductpharmaceuticalcharacteristicscodecoding);

		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclCrctrstcsCdCdgCd() != null) {
			medicinalproductpharmaceuticalcharacteristicscodecoding.setCode(m.getMdcnlPrdctPhrmctclCrctrstcsCdCdgCd());
		}
		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclCrctrstcsCdCdgDsply() != null) {
			medicinalproductpharmaceuticalcharacteristicscodecoding.setDisplay(m.getMdcnlPrdctPhrmctclCrctrstcsCdCdgDsply());
		}
		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclCrctrstcsCdCdgSys() != null) {
			medicinalproductpharmaceuticalcharacteristicscodecoding.setSystem(m.getMdcnlPrdctPhrmctclCrctrstcsCdCdgSys());
		}
		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclCrctrstcsCdCdgUsrSltd() != null) {
			medicinalproductpharmaceuticalcharacteristicscodecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctPhrmctclCrctrstcsCdCdgUsrSltd()));
		}
		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclCrctrstcsCdCdgVrsn() != null) {
			medicinalproductpharmaceuticalcharacteristicscodecoding.setVersion(m.getMdcnlPrdctPhrmctclCrctrstcsCdCdgVrsn());
		}
		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Cd_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclCrctrstcsCdTxt() != null) {
			medicinalproductpharmaceuticalcharacteristicscode.setText(m.getMdcnlPrdctPhrmctclCrctrstcsCdTxt());
		}
		/******************** medicinalproductpharmaceuticalcharacteristicsstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpharmaceuticalcharacteristicsstatus =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductpharmaceuticalcharacteristics.setStatus(medicinalproductpharmaceuticalcharacteristicsstatus);

		/******************** medicinalproductpharmaceuticalcharacteristicsstatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpharmaceuticalcharacteristicsstatuscoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductpharmaceuticalcharacteristicsstatus.addCoding(medicinalproductpharmaceuticalcharacteristicsstatuscoding);

		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Sts_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclCrctrstcsStsCdgCd() != null) {
			medicinalproductpharmaceuticalcharacteristicsstatuscoding.setCode(m.getMdcnlPrdctPhrmctclCrctrstcsStsCdgCd());
		}
		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Sts_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclCrctrstcsStsCdgDsply() != null) {
			medicinalproductpharmaceuticalcharacteristicsstatuscoding.setDisplay(m.getMdcnlPrdctPhrmctclCrctrstcsStsCdgDsply());
		}
		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Sts_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclCrctrstcsStsCdgSys() != null) {
			medicinalproductpharmaceuticalcharacteristicsstatuscoding.setSystem(m.getMdcnlPrdctPhrmctclCrctrstcsStsCdgSys());
		}
		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Sts_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclCrctrstcsStsCdgUsrSltd() != null) {
			medicinalproductpharmaceuticalcharacteristicsstatuscoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctPhrmctclCrctrstcsStsCdgUsrSltd()));
		}
		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Sts_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclCrctrstcsStsCdgVrsn() != null) {
			medicinalproductpharmaceuticalcharacteristicsstatuscoding.setVersion(m.getMdcnlPrdctPhrmctclCrctrstcsStsCdgVrsn());
		}
		/******************** MdcnlPrdctPhrmctcl_Crctrstcs_Sts_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclCrctrstcsStsTxt() != null) {
			medicinalproductpharmaceuticalcharacteristicsstatus.setText(m.getMdcnlPrdctPhrmctclCrctrstcsStsTxt());
		}
		/******************** MdcnlPrdctPhrmctcl_Dvc ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclDvc() != null) {
			medicinalproductpharmaceutical.addDevice( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctPhrmctclDvc()));
		}
		/******************** medicinalproductpharmaceuticalidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicinalproductpharmaceuticalidentifier =  new org.hl7.fhir.r4.model.Identifier();
		medicinalproductpharmaceutical.addIdentifier(medicinalproductpharmaceuticalidentifier);

		/******************** MdcnlPrdctPhrmctcl_Id_Assigner ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclIdAssigner() != null) {
			medicinalproductpharmaceuticalidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctPhrmctclIdAssigner()));
		}
		/******************** medicinalproductpharmaceuticalidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductpharmaceuticalidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		medicinalproductpharmaceuticalidentifier.setPeriod(medicinalproductpharmaceuticalidentifierperiod);

		/******************** MdcnlPrdctPhrmctcl_Id_Prd_End ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclIdPrdEnd() != null) {
			java.text.SimpleDateFormat MdcnlPrdctPhrmctcl_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctPhrmctcl_Id_Prd_Enddate = MdcnlPrdctPhrmctcl_Id_Prd_Endsdf.parse(m.getMdcnlPrdctPhrmctclIdPrdEnd());
			medicinalproductpharmaceuticalidentifierperiod.setEnd(MdcnlPrdctPhrmctcl_Id_Prd_Enddate);
		}
		/******************** MdcnlPrdctPhrmctcl_Id_Prd_Strt ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclIdPrdStrt() != null) {
			java.text.SimpleDateFormat MdcnlPrdctPhrmctcl_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctPhrmctcl_Id_Prd_Strtdate = MdcnlPrdctPhrmctcl_Id_Prd_Strtsdf.parse(m.getMdcnlPrdctPhrmctclIdPrdStrt());
			medicinalproductpharmaceuticalidentifierperiod.setStart(MdcnlPrdctPhrmctcl_Id_Prd_Strtdate);
		}
		/******************** MdcnlPrdctPhrmctcl_Id_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclIdSys() != null) {
			medicinalproductpharmaceuticalidentifier.setSystem(m.getMdcnlPrdctPhrmctclIdSys());
		}
		/******************** medicinalproductpharmaceuticalidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpharmaceuticalidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductpharmaceuticalidentifier.setType(medicinalproductpharmaceuticalidentifiertype);

		/******************** medicinalproductpharmaceuticalidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpharmaceuticalidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductpharmaceuticalidentifiertype.addCoding(medicinalproductpharmaceuticalidentifiertypecoding);

		/******************** MdcnlPrdctPhrmctcl_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclIdTypCdgCd() != null) {
			medicinalproductpharmaceuticalidentifiertypecoding.setCode(m.getMdcnlPrdctPhrmctclIdTypCdgCd());
		}
		/******************** MdcnlPrdctPhrmctcl_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclIdTypCdgDsply() != null) {
			medicinalproductpharmaceuticalidentifiertypecoding.setDisplay(m.getMdcnlPrdctPhrmctclIdTypCdgDsply());
		}
		/******************** MdcnlPrdctPhrmctcl_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclIdTypCdgSys() != null) {
			medicinalproductpharmaceuticalidentifiertypecoding.setSystem(m.getMdcnlPrdctPhrmctclIdTypCdgSys());
		}
		/******************** MdcnlPrdctPhrmctcl_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclIdTypCdgUsrSltd() != null) {
			medicinalproductpharmaceuticalidentifiertypecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctPhrmctclIdTypCdgUsrSltd()));
		}
		/******************** MdcnlPrdctPhrmctcl_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclIdTypCdgVrsn() != null) {
			medicinalproductpharmaceuticalidentifiertypecoding.setVersion(m.getMdcnlPrdctPhrmctclIdTypCdgVrsn());
		}
		/******************** MdcnlPrdctPhrmctcl_Id_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclIdTypTxt() != null) {
			medicinalproductpharmaceuticalidentifiertype.setText(m.getMdcnlPrdctPhrmctclIdTypTxt());
		}
		/******************** medicinalproductpharmaceuticalidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory medicinalproductpharmaceuticalidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		medicinalproductpharmaceuticalidentifier.setUse(medicinalproductpharmaceuticalidentifieruse.fromCode(m.getMdcnlPrdctPhrmctclIdUse()));

		/******************** MdcnlPrdctPhrmctcl_Id_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclIdVl() != null) {
			medicinalproductpharmaceuticalidentifier.setValue(m.getMdcnlPrdctPhrmctclIdVl());
		}
		/******************** MdcnlPrdctPhrmctcl_Igrdnt ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclIgrdnt() != null) {
			medicinalproductpharmaceutical.addIngredient( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctPhrmctclIgrdnt()));
		}
		/******************** medicinalproductpharmaceuticalrouteofadministration ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProductPharmaceutical.MedicinalProductPharmaceuticalRouteOfAdministrationComponent medicinalproductpharmaceuticalrouteofadministration =  new org.hl7.fhir.r4.model.MedicinalProductPharmaceutical.MedicinalProductPharmaceuticalRouteOfAdministrationComponent();
		medicinalproductpharmaceutical.addRouteOfAdministration(medicinalproductpharmaceuticalrouteofadministration);

		/******************** medicinalproductpharmaceuticalrouteofadministrationcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpharmaceuticalrouteofadministrationcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductpharmaceuticalrouteofadministration.setCode(medicinalproductpharmaceuticalrouteofadministrationcode);

		/******************** medicinalproductpharmaceuticalrouteofadministrationcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpharmaceuticalrouteofadministrationcodecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductpharmaceuticalrouteofadministrationcode.addCoding(medicinalproductpharmaceuticalrouteofadministrationcodecoding);

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgCd() != null) {
			medicinalproductpharmaceuticalrouteofadministrationcodecoding.setCode(m.getMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgCd());
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgDsply() != null) {
			medicinalproductpharmaceuticalrouteofadministrationcodecoding.setDisplay(m.getMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgDsply());
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgSys() != null) {
			medicinalproductpharmaceuticalrouteofadministrationcodecoding.setSystem(m.getMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgSys());
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgUsrSltd() != null) {
			medicinalproductpharmaceuticalrouteofadministrationcodecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgUsrSltd()));
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgVrsn() != null) {
			medicinalproductpharmaceuticalrouteofadministrationcodecoding.setVersion(m.getMdcnlPrdctPhrmctclRtOfAdmnstnCdCdgVrsn());
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_Cd_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnCdTxt() != null) {
			medicinalproductpharmaceuticalrouteofadministrationcode.setText(m.getMdcnlPrdctPhrmctclRtOfAdmnstnCdTxt());
		}
		/******************** medicinalproductpharmaceuticalrouteofadministrationfirstdose ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpharmaceuticalrouteofadministrationfirstdose =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductpharmaceuticalrouteofadministration.setFirstDose(medicinalproductpharmaceuticalrouteofadministrationfirstdose);

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_FirstDose_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseCd() != null) {
			medicinalproductpharmaceuticalrouteofadministrationfirstdose.setCode(m.getMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseCd());
		}
		/******************** medicinalproductpharmaceuticalrouteofadministrationfirstdosecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductpharmaceuticalrouteofadministrationfirstdosecomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductpharmaceuticalrouteofadministrationfirstdose.setComparator(medicinalproductpharmaceuticalrouteofadministrationfirstdosecomparator.fromCode(m.getMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseCmprtr()));

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_FirstDose_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseSys() != null) {
			medicinalproductpharmaceuticalrouteofadministrationfirstdose.setSystem(m.getMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseSys());
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_FirstDose_Unt ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseUnt() != null) {
			medicinalproductpharmaceuticalrouteofadministrationfirstdose.setUnit(m.getMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseUnt());
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_FirstDose_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseVl() != null) {
			medicinalproductpharmaceuticalrouteofadministrationfirstdose.setValue(Double.parseDouble((m.getMdcnlPrdctPhrmctclRtOfAdmnstnFirstDoseVl())));
		}
		/******************** medicinalproductpharmaceuticalrouteofadministrationmaxdoseperday ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpharmaceuticalrouteofadministrationmaxdoseperday =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductpharmaceuticalrouteofadministration.setMaxDosePerDay(medicinalproductpharmaceuticalrouteofadministrationmaxdoseperday);

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerDay_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDayCd() != null) {
			medicinalproductpharmaceuticalrouteofadministrationmaxdoseperday.setCode(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDayCd());
		}
		/******************** medicinalproductpharmaceuticalrouteofadministrationmaxdoseperdaycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductpharmaceuticalrouteofadministrationmaxdoseperdaycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductpharmaceuticalrouteofadministrationmaxdoseperday.setComparator(medicinalproductpharmaceuticalrouteofadministrationmaxdoseperdaycomparator.fromCode(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDayCmprtr()));

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerDay_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDaySys() != null) {
			medicinalproductpharmaceuticalrouteofadministrationmaxdoseperday.setSystem(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDaySys());
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerDay_Unt ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDayUnt() != null) {
			medicinalproductpharmaceuticalrouteofadministrationmaxdoseperday.setUnit(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDayUnt());
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerDay_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDayVl() != null) {
			medicinalproductpharmaceuticalrouteofadministrationmaxdoseperday.setValue(Double.parseDouble((m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerDayVl())));
		}
		/******************** medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiod =  new org.hl7.fhir.r4.model.Ratio();
		medicinalproductpharmaceuticalrouteofadministration.setMaxDosePerTreatmentPeriod(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiod);

		/******************** medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominator =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiod.setDenominator(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominator);

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerTrtmntPrd_Dnmntr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrCd() != null) {
			medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominator.setCode(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrCd());
		}
		/******************** medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominatorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominator.setComparator(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominatorcomparator.fromCode(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrCmprtr()));

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerTrtmntPrd_Dnmntr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrSys() != null) {
			medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominator.setSystem(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrSys());
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerTrtmntPrd_Dnmntr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrUnt() != null) {
			medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominator.setUnit(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrUnt());
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerTrtmntPrd_Dnmntr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrVl() != null) {
			medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperioddenominator.setValue(Double.parseDouble((m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdDnmntrVl())));
		}
		/******************** medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumerator =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiod.setNumerator(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumerator);

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerTrtmntPrd_Nmrtr_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrCd() != null) {
			medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumerator.setCode(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrCd());
		}
		/******************** medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumeratorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumerator.setComparator(medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumeratorcomparator.fromCode(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrCmprtr()));

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerTrtmntPrd_Nmrtr_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrSys() != null) {
			medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumerator.setSystem(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrSys());
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerTrtmntPrd_Nmrtr_Unt ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrUnt() != null) {
			medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumerator.setUnit(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrUnt());
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxDosePerTrtmntPrd_Nmrtr_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrVl() != null) {
			medicinalproductpharmaceuticalrouteofadministrationmaxdosepertreatmentperiodnumerator.setValue(Double.parseDouble((m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxDosePerTrtmntPrdNmrtrVl())));
		}
		/******************** medicinalproductpharmaceuticalrouteofadministrationmaxsingledose ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpharmaceuticalrouteofadministrationmaxsingledose =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductpharmaceuticalrouteofadministration.setMaxSingleDose(medicinalproductpharmaceuticalrouteofadministrationmaxsingledose);

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxSingleDose_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxSingleDoseCd() != null) {
			medicinalproductpharmaceuticalrouteofadministrationmaxsingledose.setCode(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxSingleDoseCd());
		}
		/******************** medicinalproductpharmaceuticalrouteofadministrationmaxsingledosecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductpharmaceuticalrouteofadministrationmaxsingledosecomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductpharmaceuticalrouteofadministrationmaxsingledose.setComparator(medicinalproductpharmaceuticalrouteofadministrationmaxsingledosecomparator.fromCode(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxSingleDoseCmprtr()));

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxSingleDose_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxSingleDoseSys() != null) {
			medicinalproductpharmaceuticalrouteofadministrationmaxsingledose.setSystem(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxSingleDoseSys());
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxSingleDose_Unt ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxSingleDoseUnt() != null) {
			medicinalproductpharmaceuticalrouteofadministrationmaxsingledose.setUnit(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxSingleDoseUnt());
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxSingleDose_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxSingleDoseVl() != null) {
			medicinalproductpharmaceuticalrouteofadministrationmaxsingledose.setValue(Double.parseDouble((m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxSingleDoseVl())));
		}
		/******************** medicinalproductpharmaceuticalrouteofadministrationmaxtreatmentperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Duration medicinalproductpharmaceuticalrouteofadministrationmaxtreatmentperiod =  new org.hl7.fhir.r4.model.Duration();
		medicinalproductpharmaceuticalrouteofadministration.setMaxTreatmentPeriod(medicinalproductpharmaceuticalrouteofadministrationmaxtreatmentperiod);

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxTrtmntPrd_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdCd() != null) {
			medicinalproductpharmaceuticalrouteofadministrationmaxtreatmentperiod.setCode(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdCd());
		}
		/******************** medicinalproductpharmaceuticalrouteofadministrationmaxtreatmentperiodcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductpharmaceuticalrouteofadministrationmaxtreatmentperiodcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductpharmaceuticalrouteofadministrationmaxtreatmentperiod.setComparator(medicinalproductpharmaceuticalrouteofadministrationmaxtreatmentperiodcomparator.fromCode(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdCmprtr()));

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxTrtmntPrd_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdSys() != null) {
			medicinalproductpharmaceuticalrouteofadministrationmaxtreatmentperiod.setSystem(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdSys());
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxTrtmntPrd_Unt ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdUnt() != null) {
			medicinalproductpharmaceuticalrouteofadministrationmaxtreatmentperiod.setUnit(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdUnt());
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_MxTrtmntPrd_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdVl() != null) {
			medicinalproductpharmaceuticalrouteofadministrationmaxtreatmentperiod.setValue(Double.parseDouble((m.getMdcnlPrdctPhrmctclRtOfAdmnstnMxTrtmntPrdVl())));
		}
		/******************** medicinalproductpharmaceuticalrouteofadministrationtarspecies ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProductPharmaceutical.MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesComponent medicinalproductpharmaceuticalrouteofadministrationtarspecies =  new org.hl7.fhir.r4.model.MedicinalProductPharmaceutical.MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesComponent();
		medicinalproductpharmaceuticalrouteofadministration.addTargetSpecies(medicinalproductpharmaceuticalrouteofadministrationtarspecies);

		/******************** medicinalproductpharmaceuticalrouteofadministrationtarspeciescode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpharmaceuticalrouteofadministrationtarspeciescode =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductpharmaceuticalrouteofadministrationtarspecies.setCode(medicinalproductpharmaceuticalrouteofadministrationtarspeciescode);

		/******************** medicinalproductpharmaceuticalrouteofadministrationtarspeciescodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpharmaceuticalrouteofadministrationtarspeciescodecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductpharmaceuticalrouteofadministrationtarspeciescode.addCoding(medicinalproductpharmaceuticalrouteofadministrationtarspeciescodecoding);

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgCd() != null) {
			medicinalproductpharmaceuticalrouteofadministrationtarspeciescodecoding.setCode(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgCd());
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgDsply() != null) {
			medicinalproductpharmaceuticalrouteofadministrationtarspeciescodecoding.setDisplay(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgDsply());
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgSys() != null) {
			medicinalproductpharmaceuticalrouteofadministrationtarspeciescodecoding.setSystem(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgSys());
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgUsrSltd() != null) {
			medicinalproductpharmaceuticalrouteofadministrationtarspeciescodecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgUsrSltd()));
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgVrsn() != null) {
			medicinalproductpharmaceuticalrouteofadministrationtarspeciescodecoding.setVersion(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdCdgVrsn());
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_Cd_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdTxt() != null) {
			medicinalproductpharmaceuticalrouteofadministrationtarspeciescode.setText(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsCdTxt());
		}
		/******************** medicinalproductpharmaceuticalrouteofadministrationtarspecieswithdrawalperiod ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProductPharmaceutical.MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodComponent medicinalproductpharmaceuticalrouteofadministrationtarspecieswithdrawalperiod =  new org.hl7.fhir.r4.model.MedicinalProductPharmaceutical.MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriodComponent();
		medicinalproductpharmaceuticalrouteofadministrationtarspecies.addWithdrawalPeriod(medicinalproductpharmaceuticalrouteofadministrationtarspecieswithdrawalperiod);

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_WthdrwlPrd_SprtingInfo ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdSprtingInfo() != null) {
			medicinalproductpharmaceuticalrouteofadministrationtarspecieswithdrawalperiod.setSupportingInformation(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdSprtingInfo());
		}
		/******************** medicinalproductpharmaceuticalrouteofadministrationtarspecieswithdrawalperiodtissue ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpharmaceuticalrouteofadministrationtarspecieswithdrawalperiodtissue =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductpharmaceuticalrouteofadministrationtarspecieswithdrawalperiod.setTissue(medicinalproductpharmaceuticalrouteofadministrationtarspecieswithdrawalperiodtissue);

		/******************** medicinalproductpharmaceuticalrouteofadministrationtarspecieswithdrawalperiodtissuecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpharmaceuticalrouteofadministrationtarspecieswithdrawalperiodtissuecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductpharmaceuticalrouteofadministrationtarspecieswithdrawalperiodtissue.addCoding(medicinalproductpharmaceuticalrouteofadministrationtarspecieswithdrawalperiodtissuecoding);

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_WthdrwlPrd_Tissue_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTissueCdgCd() != null) {
			medicinalproductpharmaceuticalrouteofadministrationtarspecieswithdrawalperiodtissuecoding.setCode(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTissueCdgCd());
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_WthdrwlPrd_Tssue_Cdg_Dsp ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTssueCdgDsp() != null) {
			medicinalproductpharmaceuticalrouteofadministrationtarspecieswithdrawalperiodtissuecoding.setDisplay(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTssueCdgDsp());
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_WthdrwlPrd_Tissue_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTissueCdgSys() != null) {
			medicinalproductpharmaceuticalrouteofadministrationtarspecieswithdrawalperiodtissuecoding.setSystem(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTissueCdgSys());
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_WthdrwlPrd_Tssue_Cdg_US ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTssueCdgUs() != null) {
			medicinalproductpharmaceuticalrouteofadministrationtarspecieswithdrawalperiodtissuecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTssueCdgUs()));
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_WthdrwlPrd_Tssue_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTssueCdgVrsn() != null) {
			medicinalproductpharmaceuticalrouteofadministrationtarspecieswithdrawalperiodtissuecoding.setVersion(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTssueCdgVrsn());
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_WthdrwlPrd_Tissue_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTissueTxt() != null) {
			medicinalproductpharmaceuticalrouteofadministrationtarspecieswithdrawalperiodtissue.setText(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdTissueTxt());
		}
		/******************** medicinalproductpharmaceuticalrouteofadministrationtarspecieswithdrawalperiodvalue ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicinalproductpharmaceuticalrouteofadministrationtarspecieswithdrawalperiodvalue =  new org.hl7.fhir.r4.model.Quantity();
		medicinalproductpharmaceuticalrouteofadministrationtarspecieswithdrawalperiod.setValue(medicinalproductpharmaceuticalrouteofadministrationtarspecieswithdrawalperiodvalue);

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_WthdrwlPrd_Vl_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlCd() != null) {
			medicinalproductpharmaceuticalrouteofadministrationtarspecieswithdrawalperiodvalue.setCode(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlCd());
		}
		/******************** medicinalproductpharmaceuticalrouteofadministrationtarspecieswithdrawalperiodvaluecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicinalproductpharmaceuticalrouteofadministrationtarspecieswithdrawalperiodvaluecomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicinalproductpharmaceuticalrouteofadministrationtarspecieswithdrawalperiodvalue.setComparator(medicinalproductpharmaceuticalrouteofadministrationtarspecieswithdrawalperiodvaluecomparator.fromCode(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlCmprtr()));

		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_WthdrwlPrd_Vl_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlSys() != null) {
			medicinalproductpharmaceuticalrouteofadministrationtarspecieswithdrawalperiodvalue.setSystem(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlSys());
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_WthdrwlPrd_Vl_Unt ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlUnt() != null) {
			medicinalproductpharmaceuticalrouteofadministrationtarspecieswithdrawalperiodvalue.setUnit(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlUnt());
		}
		/******************** MdcnlPrdctPhrmctcl_RtOfAdmnstn_TarSpcs_WthdrwlPrd_Vl_Vl ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlVl() != null) {
			medicinalproductpharmaceuticalrouteofadministrationtarspecieswithdrawalperiodvalue.setValue(Double.parseDouble((m.getMdcnlPrdctPhrmctclRtOfAdmnstnTarSpcsWthdrwlPrdVlVl())));
		}
		/******************** medicinalproductpharmaceuticalunitofpresentation ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductpharmaceuticalunitofpresentation =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductpharmaceutical.setUnitOfPresentation(medicinalproductpharmaceuticalunitofpresentation);

		/******************** medicinalproductpharmaceuticalunitofpresentationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductpharmaceuticalunitofpresentationcoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductpharmaceuticalunitofpresentation.addCoding(medicinalproductpharmaceuticalunitofpresentationcoding);

		/******************** MdcnlPrdctPhrmctcl_UntOfPrsnttn_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclUntOfPrsnttnCdgCd() != null) {
			medicinalproductpharmaceuticalunitofpresentationcoding.setCode(m.getMdcnlPrdctPhrmctclUntOfPrsnttnCdgCd());
		}
		/******************** MdcnlPrdctPhrmctcl_UntOfPrsnttn_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclUntOfPrsnttnCdgDsply() != null) {
			medicinalproductpharmaceuticalunitofpresentationcoding.setDisplay(m.getMdcnlPrdctPhrmctclUntOfPrsnttnCdgDsply());
		}
		/******************** MdcnlPrdctPhrmctcl_UntOfPrsnttn_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclUntOfPrsnttnCdgSys() != null) {
			medicinalproductpharmaceuticalunitofpresentationcoding.setSystem(m.getMdcnlPrdctPhrmctclUntOfPrsnttnCdgSys());
		}
		/******************** MdcnlPrdctPhrmctcl_UntOfPrsnttn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclUntOfPrsnttnCdgUsrSltd() != null) {
			medicinalproductpharmaceuticalunitofpresentationcoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctPhrmctclUntOfPrsnttnCdgUsrSltd()));
		}
		/******************** MdcnlPrdctPhrmctcl_UntOfPrsnttn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclUntOfPrsnttnCdgVrsn() != null) {
			medicinalproductpharmaceuticalunitofpresentationcoding.setVersion(m.getMdcnlPrdctPhrmctclUntOfPrsnttnCdgVrsn());
		}
		/******************** MdcnlPrdctPhrmctcl_UntOfPrsnttn_Txt ********************************************************************************/
		if(m.getMdcnlPrdctPhrmctclUntOfPrsnttnTxt() != null) {
			medicinalproductpharmaceuticalunitofpresentation.setText(m.getMdcnlPrdctPhrmctclUntOfPrsnttnTxt());
		}
		return medicinalproductpharmaceutical;
	}
}
