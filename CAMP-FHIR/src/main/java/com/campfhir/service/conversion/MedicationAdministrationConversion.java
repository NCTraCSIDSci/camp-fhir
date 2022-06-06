package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicationAdministration;
public class MedicationAdministrationConversion 
{
	public org.hl7.fhir.r4.model.MedicationAdministration MedicationAdministrations(MedicationAdministration m) throws ParseException
	{
		org.hl7.fhir.r4.model.MedicationAdministration medicationadministration = new org.hl7.fhir.r4.model.MedicationAdministration();

		/******************** id ********************************************************************************/
		medicationadministration.setId(m.getId());

		/******************** medicationadministrationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationadministrationcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationadministration.setCategory(medicationadministrationcategory);

		/******************** medicationadministrationcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationadministrationcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		medicationadministrationcategory.addCoding(medicationadministrationcategorycoding);

		/******************** MdctnAdmnstn_Ctgry_Cdg_Cd ********************************************************************************/
		if(m.getMdctnAdmnstnCtgryCdgCd() != null) {
			medicationadministrationcategorycoding.setCode(m.getMdctnAdmnstnCtgryCdgCd());
		}
		/******************** MdctnAdmnstn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnAdmnstnCtgryCdgDsply() != null) {
			medicationadministrationcategorycoding.setDisplay(m.getMdctnAdmnstnCtgryCdgDsply());
		}
		/******************** MdctnAdmnstn_Ctgry_Cdg_Sys ********************************************************************************/
		if(m.getMdctnAdmnstnCtgryCdgSys() != null) {
			medicationadministrationcategorycoding.setSystem(m.getMdctnAdmnstnCtgryCdgSys());
		}
		/******************** MdctnAdmnstn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnAdmnstnCtgryCdgUsrSltd() != null) {
			medicationadministrationcategorycoding.setUserSelected(Boolean.parseBoolean(m.getMdctnAdmnstnCtgryCdgUsrSltd()));
		}
		/******************** MdctnAdmnstn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnAdmnstnCtgryCdgVrsn() != null) {
			medicationadministrationcategorycoding.setVersion(m.getMdctnAdmnstnCtgryCdgVrsn());
		}
		/******************** MdctnAdmnstn_Ctgry_Txt ********************************************************************************/
		if(m.getMdctnAdmnstnCtgryTxt() != null) {
			medicationadministrationcategory.setText(m.getMdctnAdmnstnCtgryTxt());
		}
		/******************** MdctnAdmnstn_Cntxt ********************************************************************************/
		if(m.getMdctnAdmnstnCntxt() != null) {
			medicationadministration.setContext( new org.hl7.fhir.r4.model.Reference(m.getMdctnAdmnstnCntxt()));
		}
		/******************** MdctnAdmnstn_Dvc ********************************************************************************/
		if(m.getMdctnAdmnstnDvc() != null) {
			medicationadministration.addDevice( new org.hl7.fhir.r4.model.Reference(m.getMdctnAdmnstnDvc()));
		}
		/******************** medicationadministrationdosage ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationAdministration.MedicationAdministrationDosageComponent medicationadministrationdosage =  new org.hl7.fhir.r4.model.MedicationAdministration.MedicationAdministrationDosageComponent();
		medicationadministration.setDosage(medicationadministrationdosage);

		/******************** medicationadministrationdosagedose ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationadministrationdosagedose =  new org.hl7.fhir.r4.model.Quantity();
		medicationadministrationdosage.setDose(medicationadministrationdosagedose);

		/******************** MdctnAdmnstn_Dsg_Dose_Cd ********************************************************************************/
		if(m.getMdctnAdmnstnDsgDoseCd() != null) {
			medicationadministrationdosagedose.setCode(m.getMdctnAdmnstnDsgDoseCd());
		}
		/******************** medicationadministrationdosagedosecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationadministrationdosagedosecomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationadministrationdosagedose.setComparator(medicationadministrationdosagedosecomparator.fromCode(m.getMdctnAdmnstnDsgDoseCmprtr()));

		/******************** MdctnAdmnstn_Dsg_Dose_Sys ********************************************************************************/
		if(m.getMdctnAdmnstnDsgDoseSys() != null) {
			medicationadministrationdosagedose.setSystem(m.getMdctnAdmnstnDsgDoseSys());
		}
		/******************** MdctnAdmnstn_Dsg_Dose_Unt ********************************************************************************/
		if(m.getMdctnAdmnstnDsgDoseUnt() != null) {
			medicationadministrationdosagedose.setUnit(m.getMdctnAdmnstnDsgDoseUnt());
		}
		/******************** MdctnAdmnstn_Dsg_Dose_Vl ********************************************************************************/
		if(m.getMdctnAdmnstnDsgDoseVl() != null) {
			medicationadministrationdosagedose.setValue(Double.parseDouble((m.getMdctnAdmnstnDsgDoseVl())));
		}
		/******************** medicationadministrationdosagemethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationadministrationdosagemethod =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationadministrationdosage.setMethod(medicationadministrationdosagemethod);

		/******************** medicationadministrationdosagemethodcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationadministrationdosagemethodcoding =  new org.hl7.fhir.r4.model.Coding();
		medicationadministrationdosagemethod.addCoding(medicationadministrationdosagemethodcoding);

		/******************** MdctnAdmnstn_Dsg_Mthd_Cdg_Cd ********************************************************************************/
		if(m.getMdctnAdmnstnDsgMthdCdgCd() != null) {
			medicationadministrationdosagemethodcoding.setCode(m.getMdctnAdmnstnDsgMthdCdgCd());
		}
		/******************** MdctnAdmnstn_Dsg_Mthd_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnAdmnstnDsgMthdCdgDsply() != null) {
			medicationadministrationdosagemethodcoding.setDisplay(m.getMdctnAdmnstnDsgMthdCdgDsply());
		}
		/******************** MdctnAdmnstn_Dsg_Mthd_Cdg_Sys ********************************************************************************/
		if(m.getMdctnAdmnstnDsgMthdCdgSys() != null) {
			medicationadministrationdosagemethodcoding.setSystem(m.getMdctnAdmnstnDsgMthdCdgSys());
		}
		/******************** MdctnAdmnstn_Dsg_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnAdmnstnDsgMthdCdgUsrSltd() != null) {
			medicationadministrationdosagemethodcoding.setUserSelected(Boolean.parseBoolean(m.getMdctnAdmnstnDsgMthdCdgUsrSltd()));
		}
		/******************** MdctnAdmnstn_Dsg_Mthd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnAdmnstnDsgMthdCdgVrsn() != null) {
			medicationadministrationdosagemethodcoding.setVersion(m.getMdctnAdmnstnDsgMthdCdgVrsn());
		}
		/******************** MdctnAdmnstn_Dsg_Mthd_Txt ********************************************************************************/
		if(m.getMdctnAdmnstnDsgMthdTxt() != null) {
			medicationadministrationdosagemethod.setText(m.getMdctnAdmnstnDsgMthdTxt());
		}
		/******************** medicationadministrationdosageratequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationadministrationdosageratequantity =  new org.hl7.fhir.r4.model.Quantity();
		medicationadministrationdosage.setRate(medicationadministrationdosageratequantity);

		/******************** MdctnAdmnstn_Dsg_RtQnty_Cd ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRtQntyCd() != null) {
			medicationadministrationdosageratequantity.setCode(m.getMdctnAdmnstnDsgRtQntyCd());
		}
		/******************** medicationadministrationdosageratequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationadministrationdosageratequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationadministrationdosageratequantity.setComparator(medicationadministrationdosageratequantitycomparator.fromCode(m.getMdctnAdmnstnDsgRtQntyCmprtr()));

		/******************** MdctnAdmnstn_Dsg_RtQnty_Sys ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRtQntySys() != null) {
			medicationadministrationdosageratequantity.setSystem(m.getMdctnAdmnstnDsgRtQntySys());
		}
		/******************** MdctnAdmnstn_Dsg_RtQnty_Unt ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRtQntyUnt() != null) {
			medicationadministrationdosageratequantity.setUnit(m.getMdctnAdmnstnDsgRtQntyUnt());
		}
		/******************** MdctnAdmnstn_Dsg_RtQnty_Vl ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRtQntyVl() != null) {
			medicationadministrationdosageratequantity.setValue(Double.parseDouble((m.getMdctnAdmnstnDsgRtQntyVl())));
		}
		/******************** medicationadministrationdosagerateratio ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio medicationadministrationdosagerateratio =  new org.hl7.fhir.r4.model.Ratio();
		medicationadministrationdosage.setRate(medicationadministrationdosagerateratio);

		/******************** medicationadministrationdosagerateratiodenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationadministrationdosagerateratiodenominator =  new org.hl7.fhir.r4.model.Quantity();
		medicationadministrationdosagerateratio.setDenominator(medicationadministrationdosagerateratiodenominator);

		/******************** MdctnAdmnstn_Dsg_RtRtio_Dnmntr_Cd ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRtRtioDnmntrCd() != null) {
			medicationadministrationdosagerateratiodenominator.setCode(m.getMdctnAdmnstnDsgRtRtioDnmntrCd());
		}
		/******************** medicationadministrationdosagerateratiodenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationadministrationdosagerateratiodenominatorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationadministrationdosagerateratiodenominator.setComparator(medicationadministrationdosagerateratiodenominatorcomparator.fromCode(m.getMdctnAdmnstnDsgRtRtioDnmntrCmprtr()));

		/******************** MdctnAdmnstn_Dsg_RtRtio_Dnmntr_Sys ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRtRtioDnmntrSys() != null) {
			medicationadministrationdosagerateratiodenominator.setSystem(m.getMdctnAdmnstnDsgRtRtioDnmntrSys());
		}
		/******************** MdctnAdmnstn_Dsg_RtRtio_Dnmntr_Unt ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRtRtioDnmntrUnt() != null) {
			medicationadministrationdosagerateratiodenominator.setUnit(m.getMdctnAdmnstnDsgRtRtioDnmntrUnt());
		}
		/******************** MdctnAdmnstn_Dsg_RtRtio_Dnmntr_Vl ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRtRtioDnmntrVl() != null) {
			medicationadministrationdosagerateratiodenominator.setValue(Double.parseDouble((m.getMdctnAdmnstnDsgRtRtioDnmntrVl())));
		}
		/******************** medicationadministrationdosageraterationumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity medicationadministrationdosageraterationumerator =  new org.hl7.fhir.r4.model.Quantity();
		medicationadministrationdosagerateratio.setNumerator(medicationadministrationdosageraterationumerator);

		/******************** MdctnAdmnstn_Dsg_RtRtio_Nmrtr_Cd ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRtRtioNmrtrCd() != null) {
			medicationadministrationdosageraterationumerator.setCode(m.getMdctnAdmnstnDsgRtRtioNmrtrCd());
		}
		/******************** medicationadministrationdosageraterationumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationadministrationdosageraterationumeratorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		medicationadministrationdosageraterationumerator.setComparator(medicationadministrationdosageraterationumeratorcomparator.fromCode(m.getMdctnAdmnstnDsgRtRtioNmrtrCmprtr()));

		/******************** MdctnAdmnstn_Dsg_RtRtio_Nmrtr_Sys ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRtRtioNmrtrSys() != null) {
			medicationadministrationdosageraterationumerator.setSystem(m.getMdctnAdmnstnDsgRtRtioNmrtrSys());
		}
		/******************** MdctnAdmnstn_Dsg_RtRtio_Nmrtr_Unt ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRtRtioNmrtrUnt() != null) {
			medicationadministrationdosageraterationumerator.setUnit(m.getMdctnAdmnstnDsgRtRtioNmrtrUnt());
		}
		/******************** MdctnAdmnstn_Dsg_RtRtio_Nmrtr_Vl ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRtRtioNmrtrVl() != null) {
			medicationadministrationdosageraterationumerator.setValue(Double.parseDouble((m.getMdctnAdmnstnDsgRtRtioNmrtrVl())));
		}
		/******************** medicationadministrationdosageroute ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationadministrationdosageroute =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationadministrationdosage.setRoute(medicationadministrationdosageroute);

		/******************** medicationadministrationdosageroutecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationadministrationdosageroutecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationadministrationdosageroute.addCoding(medicationadministrationdosageroutecoding);

		/******************** MdctnAdmnstn_Dsg_Route_Cdg_Cd ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRouteCdgCd() != null) {
			medicationadministrationdosageroutecoding.setCode(m.getMdctnAdmnstnDsgRouteCdgCd());
		}
		/******************** MdctnAdmnstn_Dsg_Route_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRouteCdgDsply() != null) {
			medicationadministrationdosageroutecoding.setDisplay(m.getMdctnAdmnstnDsgRouteCdgDsply());
		}
		/******************** MdctnAdmnstn_Dsg_Route_Cdg_Sys ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRouteCdgSys() != null) {
			medicationadministrationdosageroutecoding.setSystem(m.getMdctnAdmnstnDsgRouteCdgSys());
		}
		/******************** MdctnAdmnstn_Dsg_Route_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRouteCdgUsrSltd() != null) {
			medicationadministrationdosageroutecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnAdmnstnDsgRouteCdgUsrSltd()));
		}
		/******************** MdctnAdmnstn_Dsg_Route_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRouteCdgVrsn() != null) {
			medicationadministrationdosageroutecoding.setVersion(m.getMdctnAdmnstnDsgRouteCdgVrsn());
		}
		/******************** MdctnAdmnstn_Dsg_Route_Txt ********************************************************************************/
		if(m.getMdctnAdmnstnDsgRouteTxt() != null) {
			medicationadministrationdosageroute.setText(m.getMdctnAdmnstnDsgRouteTxt());
		}
		/******************** medicationadministrationdosagesite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationadministrationdosagesite =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationadministrationdosage.setSite(medicationadministrationdosagesite);

		/******************** medicationadministrationdosagesitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationadministrationdosagesitecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationadministrationdosagesite.addCoding(medicationadministrationdosagesitecoding);

		/******************** MdctnAdmnstn_Dsg_Site_Cdg_Cd ********************************************************************************/
		if(m.getMdctnAdmnstnDsgSiteCdgCd() != null) {
			medicationadministrationdosagesitecoding.setCode(m.getMdctnAdmnstnDsgSiteCdgCd());
		}
		/******************** MdctnAdmnstn_Dsg_Site_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnAdmnstnDsgSiteCdgDsply() != null) {
			medicationadministrationdosagesitecoding.setDisplay(m.getMdctnAdmnstnDsgSiteCdgDsply());
		}
		/******************** MdctnAdmnstn_Dsg_Site_Cdg_Sys ********************************************************************************/
		if(m.getMdctnAdmnstnDsgSiteCdgSys() != null) {
			medicationadministrationdosagesitecoding.setSystem(m.getMdctnAdmnstnDsgSiteCdgSys());
		}
		/******************** MdctnAdmnstn_Dsg_Site_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnAdmnstnDsgSiteCdgUsrSltd() != null) {
			medicationadministrationdosagesitecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnAdmnstnDsgSiteCdgUsrSltd()));
		}
		/******************** MdctnAdmnstn_Dsg_Site_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnAdmnstnDsgSiteCdgVrsn() != null) {
			medicationadministrationdosagesitecoding.setVersion(m.getMdctnAdmnstnDsgSiteCdgVrsn());
		}
		/******************** MdctnAdmnstn_Dsg_Site_Txt ********************************************************************************/
		if(m.getMdctnAdmnstnDsgSiteTxt() != null) {
			medicationadministrationdosagesite.setText(m.getMdctnAdmnstnDsgSiteTxt());
		}
		/******************** MdctnAdmnstn_Dsg_Txt ********************************************************************************/
		if(m.getMdctnAdmnstnDsgTxt() != null) {
			medicationadministrationdosage.setText(m.getMdctnAdmnstnDsgTxt());
		}
		/******************** MdctnAdmnstn_EfctiveDtTimeTyp ********************************************************************************/
		if(m.getMdctnAdmnstnEfctiveDtTimeTyp() != null) {
			medicationadministration.setEffective( new org.hl7.fhir.r4.model.DateTimeType(m.getMdctnAdmnstnEfctiveDtTimeTyp()));
		}
		/******************** medicationadministrationeffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationadministrationeffectiveperiod =  new org.hl7.fhir.r4.model.Period();
		medicationadministration.setEffective(medicationadministrationeffectiveperiod);

		/******************** MdctnAdmnstn_EfctivePrd_End ********************************************************************************/
		if(m.getMdctnAdmnstnEfctivePrdEnd() != null) {
			java.text.SimpleDateFormat MdctnAdmnstn_EfctivePrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdctnAdmnstn_EfctivePrd_Enddate = MdctnAdmnstn_EfctivePrd_Endsdf.parse(m.getMdctnAdmnstnEfctivePrdEnd());
			medicationadministrationeffectiveperiod.setEnd(MdctnAdmnstn_EfctivePrd_Enddate);
		}
		/******************** MdctnAdmnstn_EfctivePrd_Strt ********************************************************************************/
		if(m.getMdctnAdmnstnEfctivePrdStrt() != null) {
			java.text.SimpleDateFormat MdctnAdmnstn_EfctivePrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdctnAdmnstn_EfctivePrd_Strtdate = MdctnAdmnstn_EfctivePrd_Strtsdf.parse(m.getMdctnAdmnstnEfctivePrdStrt());
			medicationadministrationeffectiveperiod.setStart(MdctnAdmnstn_EfctivePrd_Strtdate);
		}
		/******************** MdctnAdmnstn_EvntHis ********************************************************************************/
		if(m.getMdctnAdmnstnEvntHis() != null) {
			medicationadministration.addEventHistory( new org.hl7.fhir.r4.model.Reference(m.getMdctnAdmnstnEvntHis()));
		}
		/******************** medicationadministrationidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicationadministrationidentifier =  new org.hl7.fhir.r4.model.Identifier();
		medicationadministration.addIdentifier(medicationadministrationidentifier);

		/******************** MdctnAdmnstn_Id_Assigner ********************************************************************************/
		if(m.getMdctnAdmnstnIdAssigner() != null) {
			medicationadministrationidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(m.getMdctnAdmnstnIdAssigner()));
		}
		/******************** medicationadministrationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicationadministrationidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		medicationadministrationidentifier.setPeriod(medicationadministrationidentifierperiod);

		/******************** MdctnAdmnstn_Id_Prd_End ********************************************************************************/
		if(m.getMdctnAdmnstnIdPrdEnd() != null) {
			java.text.SimpleDateFormat MdctnAdmnstn_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdctnAdmnstn_Id_Prd_Enddate = MdctnAdmnstn_Id_Prd_Endsdf.parse(m.getMdctnAdmnstnIdPrdEnd());
			medicationadministrationidentifierperiod.setEnd(MdctnAdmnstn_Id_Prd_Enddate);
		}
		/******************** MdctnAdmnstn_Id_Prd_Strt ********************************************************************************/
		if(m.getMdctnAdmnstnIdPrdStrt() != null) {
			java.text.SimpleDateFormat MdctnAdmnstn_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdctnAdmnstn_Id_Prd_Strtdate = MdctnAdmnstn_Id_Prd_Strtsdf.parse(m.getMdctnAdmnstnIdPrdStrt());
			medicationadministrationidentifierperiod.setStart(MdctnAdmnstn_Id_Prd_Strtdate);
		}
		/******************** MdctnAdmnstn_Id_Sys ********************************************************************************/
		if(m.getMdctnAdmnstnIdSys() != null) {
			medicationadministrationidentifier.setSystem(m.getMdctnAdmnstnIdSys());
		}
		/******************** medicationadministrationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationadministrationidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationadministrationidentifier.setType(medicationadministrationidentifiertype);

		/******************** medicationadministrationidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationadministrationidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationadministrationidentifiertype.addCoding(medicationadministrationidentifiertypecoding);

		/******************** MdctnAdmnstn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnAdmnstnIdTypCdgCd() != null) {
			medicationadministrationidentifiertypecoding.setCode(m.getMdctnAdmnstnIdTypCdgCd());
		}
		/******************** MdctnAdmnstn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnAdmnstnIdTypCdgDsply() != null) {
			medicationadministrationidentifiertypecoding.setDisplay(m.getMdctnAdmnstnIdTypCdgDsply());
		}
		/******************** MdctnAdmnstn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnAdmnstnIdTypCdgSys() != null) {
			medicationadministrationidentifiertypecoding.setSystem(m.getMdctnAdmnstnIdTypCdgSys());
		}
		/******************** MdctnAdmnstn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnAdmnstnIdTypCdgUsrSltd() != null) {
			medicationadministrationidentifiertypecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnAdmnstnIdTypCdgUsrSltd()));
		}
		/******************** MdctnAdmnstn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnAdmnstnIdTypCdgVrsn() != null) {
			medicationadministrationidentifiertypecoding.setVersion(m.getMdctnAdmnstnIdTypCdgVrsn());
		}
		/******************** MdctnAdmnstn_Id_Typ_Txt ********************************************************************************/
		if(m.getMdctnAdmnstnIdTypTxt() != null) {
			medicationadministrationidentifiertype.setText(m.getMdctnAdmnstnIdTypTxt());
		}
		/******************** medicationadministrationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory medicationadministrationidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		medicationadministrationidentifier.setUse(medicationadministrationidentifieruse.fromCode(m.getMdctnAdmnstnIdUse()));

		/******************** MdctnAdmnstn_Id_Vl ********************************************************************************/
		if(m.getMdctnAdmnstnIdVl() != null) {
			medicationadministrationidentifier.setValue(m.getMdctnAdmnstnIdVl());
		}
		/******************** MdctnAdmnstn_Instantiates ********************************************************************************/
		if(m.getMdctnAdmnstnInstantiates() != null) {
			medicationadministration.addInstantiates(m.getMdctnAdmnstnInstantiates());
		}
		/******************** medicationadministrationmedicationcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationadministrationmedicationcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationadministration.setMedication(medicationadministrationmedicationcodeableconcept);

		/******************** medicationadministrationmedicationcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationadministrationmedicationcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		medicationadministrationmedicationcodeableconcept.addCoding(medicationadministrationmedicationcodeableconceptcoding);

		/******************** MdctnAdmnstn_MdctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdctnAdmnstnMdctnCdbleCncptCdgCd() != null) {
			medicationadministrationmedicationcodeableconceptcoding.setCode(m.getMdctnAdmnstnMdctnCdbleCncptCdgCd());
		}
		/******************** MdctnAdmnstn_MdctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnAdmnstnMdctnCdbleCncptCdgDsply() != null) {
			medicationadministrationmedicationcodeableconceptcoding.setDisplay(m.getMdctnAdmnstnMdctnCdbleCncptCdgDsply());
		}
		/******************** MdctnAdmnstn_MdctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdctnAdmnstnMdctnCdbleCncptCdgSys() != null) {
			medicationadministrationmedicationcodeableconceptcoding.setSystem(m.getMdctnAdmnstnMdctnCdbleCncptCdgSys());
		}
		/******************** MdctnAdmnstn_MdctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnAdmnstnMdctnCdbleCncptCdgUsrSltd() != null) {
			medicationadministrationmedicationcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(m.getMdctnAdmnstnMdctnCdbleCncptCdgUsrSltd()));
		}
		/******************** MdctnAdmnstn_MdctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnAdmnstnMdctnCdbleCncptCdgVrsn() != null) {
			medicationadministrationmedicationcodeableconceptcoding.setVersion(m.getMdctnAdmnstnMdctnCdbleCncptCdgVrsn());
		}
		/******************** MdctnAdmnstn_MdctnCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdctnAdmnstnMdctnCdbleCncptTxt() != null) {
			medicationadministrationmedicationcodeableconcept.setText(m.getMdctnAdmnstnMdctnCdbleCncptTxt());
		}
		/******************** MdctnAdmnstn_MdctnRfrnc ********************************************************************************/
		if(m.getMdctnAdmnstnMdctnRfrnc() != null) {
			medicationadministration.setMedication( new org.hl7.fhir.r4.model.Reference(m.getMdctnAdmnstnMdctnRfrnc()));
		}
		/******************** medicationadministrationnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation medicationadministrationnote =  new org.hl7.fhir.r4.model.Annotation();
		medicationadministration.addNote(medicationadministrationnote);

		/******************** MdctnAdmnstn_Nt_AthrRfrnc ********************************************************************************/
		if(m.getMdctnAdmnstnNtAthrRfrnc() != null) {
			medicationadministrationnote.setAuthor( new org.hl7.fhir.r4.model.Reference(m.getMdctnAdmnstnNtAthrRfrnc()));
		}
		/******************** MdctnAdmnstn_Nt_AthrStrgTyp ********************************************************************************/
		if(m.getMdctnAdmnstnNtAthrStrgTyp() != null) {
			medicationadministrationnote.setAuthor( new org.hl7.fhir.r4.model.StringType(m.getMdctnAdmnstnNtAthrStrgTyp()));
		}
		/******************** MdctnAdmnstn_Nt_Txt ********************************************************************************/
		if(m.getMdctnAdmnstnNtTxt() != null) {
			medicationadministrationnote.setText(m.getMdctnAdmnstnNtTxt());
		}
		/******************** MdctnAdmnstn_Nt_Time ********************************************************************************/
		if(m.getMdctnAdmnstnNtTime() != null) {
			java.text.SimpleDateFormat MdctnAdmnstn_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdctnAdmnstn_Nt_Timedate = MdctnAdmnstn_Nt_Timesdf.parse(m.getMdctnAdmnstnNtTime());
			medicationadministrationnote.setTime(MdctnAdmnstn_Nt_Timedate);
		}
		/******************** MdctnAdmnstn_PartOf ********************************************************************************/
		if(m.getMdctnAdmnstnPartOf() != null) {
			medicationadministration.addPartOf( new org.hl7.fhir.r4.model.Reference(m.getMdctnAdmnstnPartOf()));
		}
		/******************** medicationadministrationperformer ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationAdministration.MedicationAdministrationPerformerComponent medicationadministrationperformer =  new org.hl7.fhir.r4.model.MedicationAdministration.MedicationAdministrationPerformerComponent();
		medicationadministration.addPerformer(medicationadministrationperformer);

		/******************** MdctnAdmnstn_Prfrmr_Actor ********************************************************************************/
		if(m.getMdctnAdmnstnPrfrmrActor() != null) {
			medicationadministrationperformer.setActor( new org.hl7.fhir.r4.model.Reference(m.getMdctnAdmnstnPrfrmrActor()));
		}
		/******************** medicationadministrationperformerfunction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationadministrationperformerfunction =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationadministrationperformer.setFunction(medicationadministrationperformerfunction);

		/******************** medicationadministrationperformerfunctioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationadministrationperformerfunctioncoding =  new org.hl7.fhir.r4.model.Coding();
		medicationadministrationperformerfunction.addCoding(medicationadministrationperformerfunctioncoding);

		/******************** MdctnAdmnstn_Prfrmr_Function_Cdg_Cd ********************************************************************************/
		if(m.getMdctnAdmnstnPrfrmrFunctionCdgCd() != null) {
			medicationadministrationperformerfunctioncoding.setCode(m.getMdctnAdmnstnPrfrmrFunctionCdgCd());
		}
		/******************** MdctnAdmnstn_Prfrmr_Function_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnAdmnstnPrfrmrFunctionCdgDsply() != null) {
			medicationadministrationperformerfunctioncoding.setDisplay(m.getMdctnAdmnstnPrfrmrFunctionCdgDsply());
		}
		/******************** MdctnAdmnstn_Prfrmr_Function_Cdg_Sys ********************************************************************************/
		if(m.getMdctnAdmnstnPrfrmrFunctionCdgSys() != null) {
			medicationadministrationperformerfunctioncoding.setSystem(m.getMdctnAdmnstnPrfrmrFunctionCdgSys());
		}
		/******************** MdctnAdmnstn_Prfrmr_Function_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnAdmnstnPrfrmrFunctionCdgUsrSltd() != null) {
			medicationadministrationperformerfunctioncoding.setUserSelected(Boolean.parseBoolean(m.getMdctnAdmnstnPrfrmrFunctionCdgUsrSltd()));
		}
		/******************** MdctnAdmnstn_Prfrmr_Function_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnAdmnstnPrfrmrFunctionCdgVrsn() != null) {
			medicationadministrationperformerfunctioncoding.setVersion(m.getMdctnAdmnstnPrfrmrFunctionCdgVrsn());
		}
		/******************** MdctnAdmnstn_Prfrmr_Function_Txt ********************************************************************************/
		if(m.getMdctnAdmnstnPrfrmrFunctionTxt() != null) {
			medicationadministrationperformerfunction.setText(m.getMdctnAdmnstnPrfrmrFunctionTxt());
		}
		/******************** medicationadministrationreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationadministrationreasoncode =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationadministration.addReasonCode(medicationadministrationreasoncode);

		/******************** medicationadministrationreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationadministrationreasoncodecoding =  new org.hl7.fhir.r4.model.Coding();
		medicationadministrationreasoncode.addCoding(medicationadministrationreasoncodecoding);

		/******************** MdctnAdmnstn_RsnCd_Cdg_Cd ********************************************************************************/
		if(m.getMdctnAdmnstnRsnCdCdgCd() != null) {
			medicationadministrationreasoncodecoding.setCode(m.getMdctnAdmnstnRsnCdCdgCd());
		}
		/******************** MdctnAdmnstn_RsnCd_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnAdmnstnRsnCdCdgDsply() != null) {
			medicationadministrationreasoncodecoding.setDisplay(m.getMdctnAdmnstnRsnCdCdgDsply());
		}
		/******************** MdctnAdmnstn_RsnCd_Cdg_Sys ********************************************************************************/
		if(m.getMdctnAdmnstnRsnCdCdgSys() != null) {
			medicationadministrationreasoncodecoding.setSystem(m.getMdctnAdmnstnRsnCdCdgSys());
		}
		/******************** MdctnAdmnstn_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnAdmnstnRsnCdCdgUsrSltd() != null) {
			medicationadministrationreasoncodecoding.setUserSelected(Boolean.parseBoolean(m.getMdctnAdmnstnRsnCdCdgUsrSltd()));
		}
		/******************** MdctnAdmnstn_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnAdmnstnRsnCdCdgVrsn() != null) {
			medicationadministrationreasoncodecoding.setVersion(m.getMdctnAdmnstnRsnCdCdgVrsn());
		}
		/******************** MdctnAdmnstn_RsnCd_Txt ********************************************************************************/
		if(m.getMdctnAdmnstnRsnCdTxt() != null) {
			medicationadministrationreasoncode.setText(m.getMdctnAdmnstnRsnCdTxt());
		}
		/******************** MdctnAdmnstn_RsnRfrnc ********************************************************************************/
		if(m.getMdctnAdmnstnRsnRfrnc() != null) {
			medicationadministration.addReasonReference( new org.hl7.fhir.r4.model.Reference(m.getMdctnAdmnstnRsnRfrnc()));
		}
		/******************** MdctnAdmnstn_Rqst ********************************************************************************/
		if(m.getMdctnAdmnstnRqst() != null) {
			medicationadministration.setRequest( new org.hl7.fhir.r4.model.Reference(m.getMdctnAdmnstnRqst()));
		}
		/******************** medicationadministrationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.MedicationAdministration.MedicationAdministrationStatusEnumFactory medicationadministrationstatus =  new org.hl7.fhir.r4.model.MedicationAdministration.MedicationAdministrationStatusEnumFactory();
		medicationadministration.setStatus(medicationadministrationstatus.fromCode(m.getMdctnAdmnstnSts()));

		/******************** medicationadministrationstatusreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicationadministrationstatusreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicationadministration.addStatusReason(medicationadministrationstatusreason);

		/******************** medicationadministrationstatusreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicationadministrationstatusreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		medicationadministrationstatusreason.addCoding(medicationadministrationstatusreasoncoding);

		/******************** MdctnAdmnstn_StsRsn_Cdg_Cd ********************************************************************************/
		if(m.getMdctnAdmnstnStsRsnCdgCd() != null) {
			medicationadministrationstatusreasoncoding.setCode(m.getMdctnAdmnstnStsRsnCdgCd());
		}
		/******************** MdctnAdmnstn_StsRsn_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnAdmnstnStsRsnCdgDsply() != null) {
			medicationadministrationstatusreasoncoding.setDisplay(m.getMdctnAdmnstnStsRsnCdgDsply());
		}
		/******************** MdctnAdmnstn_StsRsn_Cdg_Sys ********************************************************************************/
		if(m.getMdctnAdmnstnStsRsnCdgSys() != null) {
			medicationadministrationstatusreasoncoding.setSystem(m.getMdctnAdmnstnStsRsnCdgSys());
		}
		/******************** MdctnAdmnstn_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnAdmnstnStsRsnCdgUsrSltd() != null) {
			medicationadministrationstatusreasoncoding.setUserSelected(Boolean.parseBoolean(m.getMdctnAdmnstnStsRsnCdgUsrSltd()));
		}
		/******************** MdctnAdmnstn_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnAdmnstnStsRsnCdgVrsn() != null) {
			medicationadministrationstatusreasoncoding.setVersion(m.getMdctnAdmnstnStsRsnCdgVrsn());
		}
		/******************** MdctnAdmnstn_StsRsn_Txt ********************************************************************************/
		if(m.getMdctnAdmnstnStsRsnTxt() != null) {
			medicationadministrationstatusreason.setText(m.getMdctnAdmnstnStsRsnTxt());
		}
		/******************** MdctnAdmnstn_Sbjct ********************************************************************************/
		if(m.getMdctnAdmnstnSbjct() != null) {
			medicationadministration.setSubject( new org.hl7.fhir.r4.model.Reference(m.getMdctnAdmnstnSbjct()));
		}
		/******************** MdctnAdmnstn_SprtingInfo ********************************************************************************/
		if(m.getMdctnAdmnstnSprtingInfo() != null) {
			medicationadministration.addSupportingInformation( new org.hl7.fhir.r4.model.Reference(m.getMdctnAdmnstnSprtingInfo()));
		}
		return medicationadministration;
	}
}
