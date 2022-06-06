package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Claim;
public class ClaimConversion 
{
	public org.hl7.fhir.r4.model.Claim Claims(Claim c) throws ParseException
	{
		org.hl7.fhir.r4.model.Claim claim = new org.hl7.fhir.r4.model.Claim();

		/******************** id ********************************************************************************/
		claim.setId(c.getId());

		/******************** claimaccident ********************************************************************************/
		org.hl7.fhir.r4.model.Claim.AccidentComponent claimaccident =  new org.hl7.fhir.r4.model.Claim.AccidentComponent();
		claim.setAccident(claimaccident);

		/******************** Clm_Accident_Dt ********************************************************************************/
		if(c.getClmAccidentDt() != null) {
			java.text.SimpleDateFormat Clm_Accident_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Clm_Accident_Dtdate = Clm_Accident_Dtsdf.parse(c.getClmAccidentDt());
			claimaccident.setDate(Clm_Accident_Dtdate);
		}
		/******************** claimaccidentlocationaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address claimaccidentlocationaddress =  new org.hl7.fhir.r4.model.Address();
		claimaccident.setLocation(claimaccidentlocationaddress);

		/******************** Clm_Accident_LctnAddr_City ********************************************************************************/
		if(c.getClmAccidentLctnAddrCity() != null) {
			claimaccidentlocationaddress.setCity(c.getClmAccidentLctnAddrCity());
		}
		/******************** Clm_Accident_LctnAddr_Cntry ********************************************************************************/
		if(c.getClmAccidentLctnAddrCntry() != null) {
			claimaccidentlocationaddress.setCountry(c.getClmAccidentLctnAddrCntry());
		}
		/******************** Clm_Accident_LctnAddr_District ********************************************************************************/
		if(c.getClmAccidentLctnAddrDistrict() != null) {
			claimaccidentlocationaddress.setDistrict(c.getClmAccidentLctnAddrDistrict());
		}
		/******************** Clm_Accident_LctnAddr_Line ********************************************************************************/
		if(c.getClmAccidentLctnAddrLine() != null) {
			claimaccidentlocationaddress.addLine(c.getClmAccidentLctnAddrLine());
		}
		/******************** claimaccidentlocationaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claimaccidentlocationaddressperiod =  new org.hl7.fhir.r4.model.Period();
		claimaccidentlocationaddress.setPeriod(claimaccidentlocationaddressperiod);

		/******************** Clm_Accident_LctnAddr_Prd_End ********************************************************************************/
		if(c.getClmAccidentLctnAddrPrdEnd() != null) {
			java.text.SimpleDateFormat Clm_Accident_LctnAddr_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Clm_Accident_LctnAddr_Prd_Enddate = Clm_Accident_LctnAddr_Prd_Endsdf.parse(c.getClmAccidentLctnAddrPrdEnd());
			claimaccidentlocationaddressperiod.setEnd(Clm_Accident_LctnAddr_Prd_Enddate);
		}
		/******************** Clm_Accident_LctnAddr_Prd_Strt ********************************************************************************/
		if(c.getClmAccidentLctnAddrPrdStrt() != null) {
			java.text.SimpleDateFormat Clm_Accident_LctnAddr_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Clm_Accident_LctnAddr_Prd_Strtdate = Clm_Accident_LctnAddr_Prd_Strtsdf.parse(c.getClmAccidentLctnAddrPrdStrt());
			claimaccidentlocationaddressperiod.setStart(Clm_Accident_LctnAddr_Prd_Strtdate);
		}
		/******************** Clm_Accident_LctnAddr_PostalCd ********************************************************************************/
		if(c.getClmAccidentLctnAddrPostalCd() != null) {
			claimaccidentlocationaddress.setPostalCode(c.getClmAccidentLctnAddrPostalCd());
		}
		/******************** Clm_Accident_LctnAddr_State ********************************************************************************/
		if(c.getClmAccidentLctnAddrState() != null) {
			claimaccidentlocationaddress.setState(c.getClmAccidentLctnAddrState());
		}
		/******************** Clm_Accident_LctnAddr_Txt ********************************************************************************/
		if(c.getClmAccidentLctnAddrTxt() != null) {
			claimaccidentlocationaddress.setText(c.getClmAccidentLctnAddrTxt());
		}
		/******************** claimaccidentlocationaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory claimaccidentlocationaddresstype =  new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory();
		claimaccidentlocationaddress.setType(claimaccidentlocationaddresstype.fromCode(c.getClmAccidentLctnAddrTyp()));

		/******************** claimaccidentlocationaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUseEnumFactory claimaccidentlocationaddressuse =  new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory();
		claimaccidentlocationaddress.setUse(claimaccidentlocationaddressuse.fromCode(c.getClmAccidentLctnAddrUse()));

		/******************** Clm_Accident_LctnRfrnc ********************************************************************************/
		if(c.getClmAccidentLctnRfrnc() != null) {
			claimaccident.setLocation( new org.hl7.fhir.r4.model.Reference(c.getClmAccidentLctnRfrnc()));
		}
		/******************** claimaccidenttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimaccidenttype =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimaccident.setType(claimaccidenttype);

		/******************** claimaccidenttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimaccidenttypecoding =  new org.hl7.fhir.r4.model.Coding();
		claimaccidenttype.addCoding(claimaccidenttypecoding);

		/******************** Clm_Accident_Typ_Cdg_Cd ********************************************************************************/
		if(c.getClmAccidentTypCdgCd() != null) {
			claimaccidenttypecoding.setCode(c.getClmAccidentTypCdgCd());
		}
		/******************** Clm_Accident_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getClmAccidentTypCdgDsply() != null) {
			claimaccidenttypecoding.setDisplay(c.getClmAccidentTypCdgDsply());
		}
		/******************** Clm_Accident_Typ_Cdg_Sys ********************************************************************************/
		if(c.getClmAccidentTypCdgSys() != null) {
			claimaccidenttypecoding.setSystem(c.getClmAccidentTypCdgSys());
		}
		/******************** Clm_Accident_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmAccidentTypCdgUsrSltd() != null) {
			claimaccidenttypecoding.setUserSelected(Boolean.parseBoolean(c.getClmAccidentTypCdgUsrSltd()));
		}
		/******************** Clm_Accident_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getClmAccidentTypCdgVrsn() != null) {
			claimaccidenttypecoding.setVersion(c.getClmAccidentTypCdgVrsn());
		}
		/******************** Clm_Accident_Typ_Txt ********************************************************************************/
		if(c.getClmAccidentTypTxt() != null) {
			claimaccidenttype.setText(c.getClmAccidentTypTxt());
		}
		/******************** claimbillableperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claimbillableperiod =  new org.hl7.fhir.r4.model.Period();
		claim.setBillablePeriod(claimbillableperiod);

		/******************** Clm_BillablePrd_End ********************************************************************************/
		if(c.getClmBillablePrdEnd() != null) {
			java.text.SimpleDateFormat Clm_BillablePrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Clm_BillablePrd_Enddate = Clm_BillablePrd_Endsdf.parse(c.getClmBillablePrdEnd());
			claimbillableperiod.setEnd(Clm_BillablePrd_Enddate);
		}
		/******************** Clm_BillablePrd_Strt ********************************************************************************/
		if(c.getClmBillablePrdStrt() != null) {
			java.text.SimpleDateFormat Clm_BillablePrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Clm_BillablePrd_Strtdate = Clm_BillablePrd_Strtsdf.parse(c.getClmBillablePrdStrt());
			claimbillableperiod.setStart(Clm_BillablePrd_Strtdate);
		}
		/******************** claimcareteam ********************************************************************************/
		org.hl7.fhir.r4.model.Claim.CareTeamComponent claimcareteam =  new org.hl7.fhir.r4.model.Claim.CareTeamComponent();
		claim.addCareTeam(claimcareteam);

		/******************** Clm_CareTeam_Provider ********************************************************************************/
		if(c.getClmCareTeamProvider() != null) {
			claimcareteam.setProvider( new org.hl7.fhir.r4.model.Reference(c.getClmCareTeamProvider()));
		}
		/******************** claimcareteamqualification ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimcareteamqualification =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimcareteam.setQualification(claimcareteamqualification);

		/******************** claimcareteamqualificationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimcareteamqualificationcoding =  new org.hl7.fhir.r4.model.Coding();
		claimcareteamqualification.addCoding(claimcareteamqualificationcoding);

		/******************** Clm_CareTeam_Qualification_Cdg_Cd ********************************************************************************/
		if(c.getClmCareTeamQualificationCdgCd() != null) {
			claimcareteamqualificationcoding.setCode(c.getClmCareTeamQualificationCdgCd());
		}
		/******************** Clm_CareTeam_Qualification_Cdg_Dsply ********************************************************************************/
		if(c.getClmCareTeamQualificationCdgDsply() != null) {
			claimcareteamqualificationcoding.setDisplay(c.getClmCareTeamQualificationCdgDsply());
		}
		/******************** Clm_CareTeam_Qualification_Cdg_Sys ********************************************************************************/
		if(c.getClmCareTeamQualificationCdgSys() != null) {
			claimcareteamqualificationcoding.setSystem(c.getClmCareTeamQualificationCdgSys());
		}
		/******************** Clm_CareTeam_Qualification_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmCareTeamQualificationCdgUsrSltd() != null) {
			claimcareteamqualificationcoding.setUserSelected(Boolean.parseBoolean(c.getClmCareTeamQualificationCdgUsrSltd()));
		}
		/******************** Clm_CareTeam_Qualification_Cdg_Vrsn ********************************************************************************/
		if(c.getClmCareTeamQualificationCdgVrsn() != null) {
			claimcareteamqualificationcoding.setVersion(c.getClmCareTeamQualificationCdgVrsn());
		}
		/******************** Clm_CareTeam_Qualification_Txt ********************************************************************************/
		if(c.getClmCareTeamQualificationTxt() != null) {
			claimcareteamqualification.setText(c.getClmCareTeamQualificationTxt());
		}
		/******************** Clm_CareTeam_Responsible ********************************************************************************/
		if(c.getClmCareTeamResponsible() != null) {
			claimcareteam.setResponsible(Boolean.parseBoolean(c.getClmCareTeamResponsible()));
		}
		/******************** claimcareteamrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimcareteamrole =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimcareteam.setRole(claimcareteamrole);

		/******************** claimcareteamrolecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimcareteamrolecoding =  new org.hl7.fhir.r4.model.Coding();
		claimcareteamrole.addCoding(claimcareteamrolecoding);

		/******************** Clm_CareTeam_Role_Cdg_Cd ********************************************************************************/
		if(c.getClmCareTeamRoleCdgCd() != null) {
			claimcareteamrolecoding.setCode(c.getClmCareTeamRoleCdgCd());
		}
		/******************** Clm_CareTeam_Role_Cdg_Dsply ********************************************************************************/
		if(c.getClmCareTeamRoleCdgDsply() != null) {
			claimcareteamrolecoding.setDisplay(c.getClmCareTeamRoleCdgDsply());
		}
		/******************** Clm_CareTeam_Role_Cdg_Sys ********************************************************************************/
		if(c.getClmCareTeamRoleCdgSys() != null) {
			claimcareteamrolecoding.setSystem(c.getClmCareTeamRoleCdgSys());
		}
		/******************** Clm_CareTeam_Role_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmCareTeamRoleCdgUsrSltd() != null) {
			claimcareteamrolecoding.setUserSelected(Boolean.parseBoolean(c.getClmCareTeamRoleCdgUsrSltd()));
		}
		/******************** Clm_CareTeam_Role_Cdg_Vrsn ********************************************************************************/
		if(c.getClmCareTeamRoleCdgVrsn() != null) {
			claimcareteamrolecoding.setVersion(c.getClmCareTeamRoleCdgVrsn());
		}
		/******************** Clm_CareTeam_Role_Txt ********************************************************************************/
		if(c.getClmCareTeamRoleTxt() != null) {
			claimcareteamrole.setText(c.getClmCareTeamRoleTxt());
		}
		/******************** Clm_CareTeam_Sqnc ********************************************************************************/
		if(c.getClmCareTeamSqnc() != null) {
			claimcareteam.setSequence(Integer.parseInt(c.getClmCareTeamSqnc()));
		}
		/******************** Clm_Created ********************************************************************************/
		if(c.getClmCreated() != null) {
			java.text.SimpleDateFormat Clm_Createdsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Clm_Createddate = Clm_Createdsdf.parse(c.getClmCreated());
			claim.setCreated(Clm_Createddate);
		}
		/******************** claimdiagnosis ********************************************************************************/
		org.hl7.fhir.r4.model.Claim.DiagnosisComponent claimdiagnosis =  new org.hl7.fhir.r4.model.Claim.DiagnosisComponent();
		claim.addDiagnosis(claimdiagnosis);

		/******************** claimdiagnosisdiagnosiscodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimdiagnosisdiagnosiscodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimdiagnosis.setDiagnosis(claimdiagnosisdiagnosiscodeableconcept);

		/******************** claimdiagnosisdiagnosiscodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimdiagnosisdiagnosiscodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		claimdiagnosisdiagnosiscodeableconcept.addCoding(claimdiagnosisdiagnosiscodeableconceptcoding);

		/******************** Clm_Dgnsis_DgnsisCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(c.getClmDgnsisDgnsisCdbleCncptCdgCd() != null) {
			claimdiagnosisdiagnosiscodeableconceptcoding.setCode(c.getClmDgnsisDgnsisCdbleCncptCdgCd());
		}
		/******************** Clm_Dgnsis_DgnsisCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(c.getClmDgnsisDgnsisCdbleCncptCdgDsply() != null) {
			claimdiagnosisdiagnosiscodeableconceptcoding.setDisplay(c.getClmDgnsisDgnsisCdbleCncptCdgDsply());
		}
		/******************** Clm_Dgnsis_DgnsisCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(c.getClmDgnsisDgnsisCdbleCncptCdgSys() != null) {
			claimdiagnosisdiagnosiscodeableconceptcoding.setSystem(c.getClmDgnsisDgnsisCdbleCncptCdgSys());
		}
		/******************** Clm_Dgnsis_DgnsisCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmDgnsisDgnsisCdbleCncptCdgUsrSltd() != null) {
			claimdiagnosisdiagnosiscodeableconceptcoding.setUserSelected(Boolean.parseBoolean(c.getClmDgnsisDgnsisCdbleCncptCdgUsrSltd()));
		}
		/******************** Clm_Dgnsis_DgnsisCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(c.getClmDgnsisDgnsisCdbleCncptCdgVrsn() != null) {
			claimdiagnosisdiagnosiscodeableconceptcoding.setVersion(c.getClmDgnsisDgnsisCdbleCncptCdgVrsn());
		}
		/******************** Clm_Dgnsis_DgnsisCdbleCncpt_Txt ********************************************************************************/
		if(c.getClmDgnsisDgnsisCdbleCncptTxt() != null) {
			claimdiagnosisdiagnosiscodeableconcept.setText(c.getClmDgnsisDgnsisCdbleCncptTxt());
		}
		/******************** Clm_Dgnsis_DgnsisRfrnc ********************************************************************************/
		if(c.getClmDgnsisDgnsisRfrnc() != null) {
			claimdiagnosis.setDiagnosis( new org.hl7.fhir.r4.model.Reference(c.getClmDgnsisDgnsisRfrnc()));
		}
		/******************** claimdiagnosisonadmission ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimdiagnosisonadmission =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimdiagnosis.setOnAdmission(claimdiagnosisonadmission);

		/******************** claimdiagnosisonadmissioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimdiagnosisonadmissioncoding =  new org.hl7.fhir.r4.model.Coding();
		claimdiagnosisonadmission.addCoding(claimdiagnosisonadmissioncoding);

		/******************** Clm_Dgnsis_OnAdmission_Cdg_Cd ********************************************************************************/
		if(c.getClmDgnsisOnAdmissionCdgCd() != null) {
			claimdiagnosisonadmissioncoding.setCode(c.getClmDgnsisOnAdmissionCdgCd());
		}
		/******************** Clm_Dgnsis_OnAdmission_Cdg_Dsply ********************************************************************************/
		if(c.getClmDgnsisOnAdmissionCdgDsply() != null) {
			claimdiagnosisonadmissioncoding.setDisplay(c.getClmDgnsisOnAdmissionCdgDsply());
		}
		/******************** Clm_Dgnsis_OnAdmission_Cdg_Sys ********************************************************************************/
		if(c.getClmDgnsisOnAdmissionCdgSys() != null) {
			claimdiagnosisonadmissioncoding.setSystem(c.getClmDgnsisOnAdmissionCdgSys());
		}
		/******************** Clm_Dgnsis_OnAdmission_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmDgnsisOnAdmissionCdgUsrSltd() != null) {
			claimdiagnosisonadmissioncoding.setUserSelected(Boolean.parseBoolean(c.getClmDgnsisOnAdmissionCdgUsrSltd()));
		}
		/******************** Clm_Dgnsis_OnAdmission_Cdg_Vrsn ********************************************************************************/
		if(c.getClmDgnsisOnAdmissionCdgVrsn() != null) {
			claimdiagnosisonadmissioncoding.setVersion(c.getClmDgnsisOnAdmissionCdgVrsn());
		}
		/******************** Clm_Dgnsis_OnAdmission_Txt ********************************************************************************/
		if(c.getClmDgnsisOnAdmissionTxt() != null) {
			claimdiagnosisonadmission.setText(c.getClmDgnsisOnAdmissionTxt());
		}
		/******************** claimdiagnosispackagecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimdiagnosispackagecode =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimdiagnosis.setPackageCode(claimdiagnosispackagecode);

		/******************** claimdiagnosispackagecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimdiagnosispackagecodecoding =  new org.hl7.fhir.r4.model.Coding();
		claimdiagnosispackagecode.addCoding(claimdiagnosispackagecodecoding);

		/******************** Clm_Dgnsis_PckgCd_Cdg_Cd ********************************************************************************/
		if(c.getClmDgnsisPckgCdCdgCd() != null) {
			claimdiagnosispackagecodecoding.setCode(c.getClmDgnsisPckgCdCdgCd());
		}
		/******************** Clm_Dgnsis_PckgCd_Cdg_Dsply ********************************************************************************/
		if(c.getClmDgnsisPckgCdCdgDsply() != null) {
			claimdiagnosispackagecodecoding.setDisplay(c.getClmDgnsisPckgCdCdgDsply());
		}
		/******************** Clm_Dgnsis_PckgCd_Cdg_Sys ********************************************************************************/
		if(c.getClmDgnsisPckgCdCdgSys() != null) {
			claimdiagnosispackagecodecoding.setSystem(c.getClmDgnsisPckgCdCdgSys());
		}
		/******************** Clm_Dgnsis_PckgCd_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmDgnsisPckgCdCdgUsrSltd() != null) {
			claimdiagnosispackagecodecoding.setUserSelected(Boolean.parseBoolean(c.getClmDgnsisPckgCdCdgUsrSltd()));
		}
		/******************** Clm_Dgnsis_PckgCd_Cdg_Vrsn ********************************************************************************/
		if(c.getClmDgnsisPckgCdCdgVrsn() != null) {
			claimdiagnosispackagecodecoding.setVersion(c.getClmDgnsisPckgCdCdgVrsn());
		}
		/******************** Clm_Dgnsis_PckgCd_Txt ********************************************************************************/
		if(c.getClmDgnsisPckgCdTxt() != null) {
			claimdiagnosispackagecode.setText(c.getClmDgnsisPckgCdTxt());
		}
		/******************** Clm_Dgnsis_Sqnc ********************************************************************************/
		if(c.getClmDgnsisSqnc() != null) {
			claimdiagnosis.setSequence(Integer.parseInt(c.getClmDgnsisSqnc()));
		}
		/******************** claimdiagnosistype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimdiagnosistype =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimdiagnosis.addType(claimdiagnosistype);

		/******************** claimdiagnosistypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimdiagnosistypecoding =  new org.hl7.fhir.r4.model.Coding();
		claimdiagnosistype.addCoding(claimdiagnosistypecoding);

		/******************** Clm_Dgnsis_Typ_Cdg_Cd ********************************************************************************/
		if(c.getClmDgnsisTypCdgCd() != null) {
			claimdiagnosistypecoding.setCode(c.getClmDgnsisTypCdgCd());
		}
		/******************** Clm_Dgnsis_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getClmDgnsisTypCdgDsply() != null) {
			claimdiagnosistypecoding.setDisplay(c.getClmDgnsisTypCdgDsply());
		}
		/******************** Clm_Dgnsis_Typ_Cdg_Sys ********************************************************************************/
		if(c.getClmDgnsisTypCdgSys() != null) {
			claimdiagnosistypecoding.setSystem(c.getClmDgnsisTypCdgSys());
		}
		/******************** Clm_Dgnsis_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmDgnsisTypCdgUsrSltd() != null) {
			claimdiagnosistypecoding.setUserSelected(Boolean.parseBoolean(c.getClmDgnsisTypCdgUsrSltd()));
		}
		/******************** Clm_Dgnsis_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getClmDgnsisTypCdgVrsn() != null) {
			claimdiagnosistypecoding.setVersion(c.getClmDgnsisTypCdgVrsn());
		}
		/******************** Clm_Dgnsis_Typ_Txt ********************************************************************************/
		if(c.getClmDgnsisTypTxt() != null) {
			claimdiagnosistype.setText(c.getClmDgnsisTypTxt());
		}
		/******************** Clm_Enterer ********************************************************************************/
		if(c.getClmEnterer() != null) {
			claim.setEnterer( new org.hl7.fhir.r4.model.Reference(c.getClmEnterer()));
		}
		/******************** Clm_Facility ********************************************************************************/
		if(c.getClmFacility() != null) {
			claim.setFacility( new org.hl7.fhir.r4.model.Reference(c.getClmFacility()));
		}
		/******************** claimfundsreserve ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimfundsreserve =  new org.hl7.fhir.r4.model.CodeableConcept();
		claim.setFundsReserve(claimfundsreserve);

		/******************** claimfundsreservecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimfundsreservecoding =  new org.hl7.fhir.r4.model.Coding();
		claimfundsreserve.addCoding(claimfundsreservecoding);

		/******************** Clm_FundsReserve_Cdg_Cd ********************************************************************************/
		if(c.getClmFundsReserveCdgCd() != null) {
			claimfundsreservecoding.setCode(c.getClmFundsReserveCdgCd());
		}
		/******************** Clm_FundsReserve_Cdg_Dsply ********************************************************************************/
		if(c.getClmFundsReserveCdgDsply() != null) {
			claimfundsreservecoding.setDisplay(c.getClmFundsReserveCdgDsply());
		}
		/******************** Clm_FundsReserve_Cdg_Sys ********************************************************************************/
		if(c.getClmFundsReserveCdgSys() != null) {
			claimfundsreservecoding.setSystem(c.getClmFundsReserveCdgSys());
		}
		/******************** Clm_FundsReserve_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmFundsReserveCdgUsrSltd() != null) {
			claimfundsreservecoding.setUserSelected(Boolean.parseBoolean(c.getClmFundsReserveCdgUsrSltd()));
		}
		/******************** Clm_FundsReserve_Cdg_Vrsn ********************************************************************************/
		if(c.getClmFundsReserveCdgVrsn() != null) {
			claimfundsreservecoding.setVersion(c.getClmFundsReserveCdgVrsn());
		}
		/******************** Clm_FundsReserve_Txt ********************************************************************************/
		if(c.getClmFundsReserveTxt() != null) {
			claimfundsreserve.setText(c.getClmFundsReserveTxt());
		}
		/******************** claimidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier claimidentifier =  new org.hl7.fhir.r4.model.Identifier();
		claim.addIdentifier(claimidentifier);

		/******************** Clm_Id_Assigner ********************************************************************************/
		if(c.getClmIdAssigner() != null) {
			claimidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(c.getClmIdAssigner()));
		}
		/******************** claimidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claimidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		claimidentifier.setPeriod(claimidentifierperiod);

		/******************** Clm_Id_Prd_End ********************************************************************************/
		if(c.getClmIdPrdEnd() != null) {
			java.text.SimpleDateFormat Clm_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Clm_Id_Prd_Enddate = Clm_Id_Prd_Endsdf.parse(c.getClmIdPrdEnd());
			claimidentifierperiod.setEnd(Clm_Id_Prd_Enddate);
		}
		/******************** Clm_Id_Prd_Strt ********************************************************************************/
		if(c.getClmIdPrdStrt() != null) {
			java.text.SimpleDateFormat Clm_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Clm_Id_Prd_Strtdate = Clm_Id_Prd_Strtsdf.parse(c.getClmIdPrdStrt());
			claimidentifierperiod.setStart(Clm_Id_Prd_Strtdate);
		}
		/******************** Clm_Id_Sys ********************************************************************************/
		if(c.getClmIdSys() != null) {
			claimidentifier.setSystem(c.getClmIdSys());
		}
		/******************** claimidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimidentifier.setType(claimidentifiertype);

		/******************** claimidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		claimidentifiertype.addCoding(claimidentifiertypecoding);

		/******************** Clm_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getClmIdTypCdgCd() != null) {
			claimidentifiertypecoding.setCode(c.getClmIdTypCdgCd());
		}
		/******************** Clm_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getClmIdTypCdgDsply() != null) {
			claimidentifiertypecoding.setDisplay(c.getClmIdTypCdgDsply());
		}
		/******************** Clm_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getClmIdTypCdgSys() != null) {
			claimidentifiertypecoding.setSystem(c.getClmIdTypCdgSys());
		}
		/******************** Clm_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmIdTypCdgUsrSltd() != null) {
			claimidentifiertypecoding.setUserSelected(Boolean.parseBoolean(c.getClmIdTypCdgUsrSltd()));
		}
		/******************** Clm_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getClmIdTypCdgVrsn() != null) {
			claimidentifiertypecoding.setVersion(c.getClmIdTypCdgVrsn());
		}
		/******************** Clm_Id_Typ_Txt ********************************************************************************/
		if(c.getClmIdTypTxt() != null) {
			claimidentifiertype.setText(c.getClmIdTypTxt());
		}
		/******************** claimidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory claimidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		claimidentifier.setUse(claimidentifieruse.fromCode(c.getClmIdUse()));

		/******************** Clm_Id_Vl ********************************************************************************/
		if(c.getClmIdVl() != null) {
			claimidentifier.setValue(c.getClmIdVl());
		}
		/******************** claiminsurance ********************************************************************************/
		org.hl7.fhir.r4.model.Claim.InsuranceComponent claiminsurance =  new org.hl7.fhir.r4.model.Claim.InsuranceComponent();
		claim.addInsurance(claiminsurance);

		/******************** Clm_Insrnc_BusinessArrangement ********************************************************************************/
		if(c.getClmInsrncBusinessArrangement() != null) {
			claiminsurance.setBusinessArrangement(c.getClmInsrncBusinessArrangement());
		}
		/******************** Clm_Insrnc_ClmRsps ********************************************************************************/
		if(c.getClmInsrncClmRsps() != null) {
			claiminsurance.setClaimResponse( new org.hl7.fhir.r4.model.Reference(c.getClmInsrncClmRsps()));
		}
		/******************** Clm_Insrnc_Cvg ********************************************************************************/
		if(c.getClmInsrncCvg() != null) {
			claiminsurance.setCoverage( new org.hl7.fhir.r4.model.Reference(c.getClmInsrncCvg()));
		}
		/******************** Clm_Insrnc_Focal ********************************************************************************/
		if(c.getClmInsrncFocal() != null) {
			claiminsurance.setFocal(Boolean.parseBoolean(c.getClmInsrncFocal()));
		}
		/******************** claiminsuranceidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier claiminsuranceidentifier =  new org.hl7.fhir.r4.model.Identifier();
		claiminsurance.setIdentifier(claiminsuranceidentifier);

		/******************** Clm_Insrnc_Id_Assigner ********************************************************************************/
		if(c.getClmInsrncIdAssigner() != null) {
			claiminsuranceidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(c.getClmInsrncIdAssigner()));
		}
		/******************** claiminsuranceidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claiminsuranceidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		claiminsuranceidentifier.setPeriod(claiminsuranceidentifierperiod);

		/******************** Clm_Insrnc_Id_Prd_End ********************************************************************************/
		if(c.getClmInsrncIdPrdEnd() != null) {
			java.text.SimpleDateFormat Clm_Insrnc_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Clm_Insrnc_Id_Prd_Enddate = Clm_Insrnc_Id_Prd_Endsdf.parse(c.getClmInsrncIdPrdEnd());
			claiminsuranceidentifierperiod.setEnd(Clm_Insrnc_Id_Prd_Enddate);
		}
		/******************** Clm_Insrnc_Id_Prd_Strt ********************************************************************************/
		if(c.getClmInsrncIdPrdStrt() != null) {
			java.text.SimpleDateFormat Clm_Insrnc_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Clm_Insrnc_Id_Prd_Strtdate = Clm_Insrnc_Id_Prd_Strtsdf.parse(c.getClmInsrncIdPrdStrt());
			claiminsuranceidentifierperiod.setStart(Clm_Insrnc_Id_Prd_Strtdate);
		}
		/******************** Clm_Insrnc_Id_Sys ********************************************************************************/
		if(c.getClmInsrncIdSys() != null) {
			claiminsuranceidentifier.setSystem(c.getClmInsrncIdSys());
		}
		/******************** claiminsuranceidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claiminsuranceidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		claiminsuranceidentifier.setType(claiminsuranceidentifiertype);

		/******************** claiminsuranceidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claiminsuranceidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		claiminsuranceidentifiertype.addCoding(claiminsuranceidentifiertypecoding);

		/******************** Clm_Insrnc_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getClmInsrncIdTypCdgCd() != null) {
			claiminsuranceidentifiertypecoding.setCode(c.getClmInsrncIdTypCdgCd());
		}
		/******************** Clm_Insrnc_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getClmInsrncIdTypCdgDsply() != null) {
			claiminsuranceidentifiertypecoding.setDisplay(c.getClmInsrncIdTypCdgDsply());
		}
		/******************** Clm_Insrnc_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getClmInsrncIdTypCdgSys() != null) {
			claiminsuranceidentifiertypecoding.setSystem(c.getClmInsrncIdTypCdgSys());
		}
		/******************** Clm_Insrnc_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmInsrncIdTypCdgUsrSltd() != null) {
			claiminsuranceidentifiertypecoding.setUserSelected(Boolean.parseBoolean(c.getClmInsrncIdTypCdgUsrSltd()));
		}
		/******************** Clm_Insrnc_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getClmInsrncIdTypCdgVrsn() != null) {
			claiminsuranceidentifiertypecoding.setVersion(c.getClmInsrncIdTypCdgVrsn());
		}
		/******************** Clm_Insrnc_Id_Typ_Txt ********************************************************************************/
		if(c.getClmInsrncIdTypTxt() != null) {
			claiminsuranceidentifiertype.setText(c.getClmInsrncIdTypTxt());
		}
		/******************** claiminsuranceidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory claiminsuranceidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		claiminsuranceidentifier.setUse(claiminsuranceidentifieruse.fromCode(c.getClmInsrncIdUse()));

		/******************** Clm_Insrnc_Id_Vl ********************************************************************************/
		if(c.getClmInsrncIdVl() != null) {
			claiminsuranceidentifier.setValue(c.getClmInsrncIdVl());
		}
		/******************** Clm_Insrnc_PreAuthRef ********************************************************************************/
		if(c.getClmInsrncPreAuthRef() != null) {
			claiminsurance.addPreAuthRef(c.getClmInsrncPreAuthRef());
		}
		/******************** Clm_Insrnc_Sqnc ********************************************************************************/
		if(c.getClmInsrncSqnc() != null) {
			claiminsurance.setSequence(Integer.parseInt(c.getClmInsrncSqnc()));
		}
		/******************** Clm_Insurer ********************************************************************************/
		if(c.getClmInsurer() != null) {
			claim.setInsurer( new org.hl7.fhir.r4.model.Reference(c.getClmInsurer()));
		}
		/******************** claimitem ********************************************************************************/
		org.hl7.fhir.r4.model.Claim.ItemComponent claimitem =  new org.hl7.fhir.r4.model.Claim.ItemComponent();
		claim.addItem(claimitem);

		/******************** claimitembodysite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitembodysite =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimitem.setBodySite(claimitembodysite);

		/******************** claimitembodysitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimitembodysitecoding =  new org.hl7.fhir.r4.model.Coding();
		claimitembodysite.addCoding(claimitembodysitecoding);

		/******************** Clm_Itm_BodySite_Cdg_Cd ********************************************************************************/
		if(c.getClmItmBodySiteCdgCd() != null) {
			claimitembodysitecoding.setCode(c.getClmItmBodySiteCdgCd());
		}
		/******************** Clm_Itm_BodySite_Cdg_Dsply ********************************************************************************/
		if(c.getClmItmBodySiteCdgDsply() != null) {
			claimitembodysitecoding.setDisplay(c.getClmItmBodySiteCdgDsply());
		}
		/******************** Clm_Itm_BodySite_Cdg_Sys ********************************************************************************/
		if(c.getClmItmBodySiteCdgSys() != null) {
			claimitembodysitecoding.setSystem(c.getClmItmBodySiteCdgSys());
		}
		/******************** Clm_Itm_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmItmBodySiteCdgUsrSltd() != null) {
			claimitembodysitecoding.setUserSelected(Boolean.parseBoolean(c.getClmItmBodySiteCdgUsrSltd()));
		}
		/******************** Clm_Itm_BodySite_Cdg_Vrsn ********************************************************************************/
		if(c.getClmItmBodySiteCdgVrsn() != null) {
			claimitembodysitecoding.setVersion(c.getClmItmBodySiteCdgVrsn());
		}
		/******************** Clm_Itm_BodySite_Txt ********************************************************************************/
		if(c.getClmItmBodySiteTxt() != null) {
			claimitembodysite.setText(c.getClmItmBodySiteTxt());
		}
		/******************** Clm_Itm_CareTeamSqnc ********************************************************************************/
		if(c.getClmItmCareTeamSqnc() != null) {
			claimitem.addCareTeamSequence(Integer.parseInt(c.getClmItmCareTeamSqnc()));
		}
		/******************** claimitemcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimitem.setCategory(claimitemcategory);

		/******************** claimitemcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimitemcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		claimitemcategory.addCoding(claimitemcategorycoding);

		/******************** Clm_Itm_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getClmItmCtgryCdgCd() != null) {
			claimitemcategorycoding.setCode(c.getClmItmCtgryCdgCd());
		}
		/******************** Clm_Itm_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getClmItmCtgryCdgDsply() != null) {
			claimitemcategorycoding.setDisplay(c.getClmItmCtgryCdgDsply());
		}
		/******************** Clm_Itm_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getClmItmCtgryCdgSys() != null) {
			claimitemcategorycoding.setSystem(c.getClmItmCtgryCdgSys());
		}
		/******************** Clm_Itm_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmItmCtgryCdgUsrSltd() != null) {
			claimitemcategorycoding.setUserSelected(Boolean.parseBoolean(c.getClmItmCtgryCdgUsrSltd()));
		}
		/******************** Clm_Itm_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getClmItmCtgryCdgVrsn() != null) {
			claimitemcategorycoding.setVersion(c.getClmItmCtgryCdgVrsn());
		}
		/******************** Clm_Itm_Ctgry_Txt ********************************************************************************/
		if(c.getClmItmCtgryTxt() != null) {
			claimitemcategory.setText(c.getClmItmCtgryTxt());
		}
		/******************** claimitemdetail ********************************************************************************/
		org.hl7.fhir.r4.model.Claim.DetailComponent claimitemdetail =  new org.hl7.fhir.r4.model.Claim.DetailComponent();
		claimitem.addDetail(claimitemdetail);

		/******************** claimitemdetailcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemdetailcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimitemdetail.setCategory(claimitemdetailcategory);

		/******************** claimitemdetailcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimitemdetailcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		claimitemdetailcategory.addCoding(claimitemdetailcategorycoding);

		/******************** Clm_Itm_Dtl_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getClmItmDtlCtgryCdgCd() != null) {
			claimitemdetailcategorycoding.setCode(c.getClmItmDtlCtgryCdgCd());
		}
		/******************** Clm_Itm_Dtl_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getClmItmDtlCtgryCdgDsply() != null) {
			claimitemdetailcategorycoding.setDisplay(c.getClmItmDtlCtgryCdgDsply());
		}
		/******************** Clm_Itm_Dtl_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getClmItmDtlCtgryCdgSys() != null) {
			claimitemdetailcategorycoding.setSystem(c.getClmItmDtlCtgryCdgSys());
		}
		/******************** Clm_Itm_Dtl_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmItmDtlCtgryCdgUsrSltd() != null) {
			claimitemdetailcategorycoding.setUserSelected(Boolean.parseBoolean(c.getClmItmDtlCtgryCdgUsrSltd()));
		}
		/******************** Clm_Itm_Dtl_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getClmItmDtlCtgryCdgVrsn() != null) {
			claimitemdetailcategorycoding.setVersion(c.getClmItmDtlCtgryCdgVrsn());
		}
		/******************** Clm_Itm_Dtl_Ctgry_Txt ********************************************************************************/
		if(c.getClmItmDtlCtgryTxt() != null) {
			claimitemdetailcategory.setText(c.getClmItmDtlCtgryTxt());
		}
		/******************** Clm_Itm_Dtl_Factor ********************************************************************************/
		if(c.getClmItmDtlFactor() != null) {
			claimitemdetail.setFactor(Double.parseDouble((c.getClmItmDtlFactor())));
		}
		/******************** claimitemdetailmodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemdetailmodifier =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimitemdetail.addModifier(claimitemdetailmodifier);

		/******************** claimitemdetailmodifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimitemdetailmodifiercoding =  new org.hl7.fhir.r4.model.Coding();
		claimitemdetailmodifier.addCoding(claimitemdetailmodifiercoding);

		/******************** Clm_Itm_Dtl_Mdfr_Cdg_Cd ********************************************************************************/
		if(c.getClmItmDtlMdfrCdgCd() != null) {
			claimitemdetailmodifiercoding.setCode(c.getClmItmDtlMdfrCdgCd());
		}
		/******************** Clm_Itm_Dtl_Mdfr_Cdg_Dsply ********************************************************************************/
		if(c.getClmItmDtlMdfrCdgDsply() != null) {
			claimitemdetailmodifiercoding.setDisplay(c.getClmItmDtlMdfrCdgDsply());
		}
		/******************** Clm_Itm_Dtl_Mdfr_Cdg_Sys ********************************************************************************/
		if(c.getClmItmDtlMdfrCdgSys() != null) {
			claimitemdetailmodifiercoding.setSystem(c.getClmItmDtlMdfrCdgSys());
		}
		/******************** Clm_Itm_Dtl_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmItmDtlMdfrCdgUsrSltd() != null) {
			claimitemdetailmodifiercoding.setUserSelected(Boolean.parseBoolean(c.getClmItmDtlMdfrCdgUsrSltd()));
		}
		/******************** Clm_Itm_Dtl_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(c.getClmItmDtlMdfrCdgVrsn() != null) {
			claimitemdetailmodifiercoding.setVersion(c.getClmItmDtlMdfrCdgVrsn());
		}
		/******************** Clm_Itm_Dtl_Mdfr_Txt ********************************************************************************/
		if(c.getClmItmDtlMdfrTxt() != null) {
			claimitemdetailmodifier.setText(c.getClmItmDtlMdfrTxt());
		}
		/******************** claimitemdetailnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimitemdetailnet =  new org.hl7.fhir.r4.model.Money();
		claimitemdetail.setNet(claimitemdetailnet);

		/******************** Clm_Itm_Dtl_Net_Crncy ********************************************************************************/
		if(c.getClmItmDtlNetCrncy() != null) {
			claimitemdetailnet.setCurrency(c.getClmItmDtlNetCrncy());
		}
		/******************** Clm_Itm_Dtl_Net_Vl ********************************************************************************/
		if(c.getClmItmDtlNetVl() != null) {
			claimitemdetailnet.setValue(Double.parseDouble((c.getClmItmDtlNetVl())));
		}
		/******************** claimitemdetailproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemdetailproductorservice =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimitemdetail.setProductOrService(claimitemdetailproductorservice);

		/******************** claimitemdetailproductorservicecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimitemdetailproductorservicecoding =  new org.hl7.fhir.r4.model.Coding();
		claimitemdetailproductorservice.addCoding(claimitemdetailproductorservicecoding);

		/******************** Clm_Itm_Dtl_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(c.getClmItmDtlPrdctOrSrvCdgCd() != null) {
			claimitemdetailproductorservicecoding.setCode(c.getClmItmDtlPrdctOrSrvCdgCd());
		}
		/******************** Clm_Itm_Dtl_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(c.getClmItmDtlPrdctOrSrvCdgDsply() != null) {
			claimitemdetailproductorservicecoding.setDisplay(c.getClmItmDtlPrdctOrSrvCdgDsply());
		}
		/******************** Clm_Itm_Dtl_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(c.getClmItmDtlPrdctOrSrvCdgSys() != null) {
			claimitemdetailproductorservicecoding.setSystem(c.getClmItmDtlPrdctOrSrvCdgSys());
		}
		/******************** Clm_Itm_Dtl_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmItmDtlPrdctOrSrvCdgUsrSltd() != null) {
			claimitemdetailproductorservicecoding.setUserSelected(Boolean.parseBoolean(c.getClmItmDtlPrdctOrSrvCdgUsrSltd()));
		}
		/******************** Clm_Itm_Dtl_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(c.getClmItmDtlPrdctOrSrvCdgVrsn() != null) {
			claimitemdetailproductorservicecoding.setVersion(c.getClmItmDtlPrdctOrSrvCdgVrsn());
		}
		/******************** Clm_Itm_Dtl_PrdctOrSrv_Txt ********************************************************************************/
		if(c.getClmItmDtlPrdctOrSrvTxt() != null) {
			claimitemdetailproductorservice.setText(c.getClmItmDtlPrdctOrSrvTxt());
		}
		/******************** claimitemdetailprogramcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemdetailprogramcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimitemdetail.addProgramCode(claimitemdetailprogramcode);

		/******************** claimitemdetailprogramcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimitemdetailprogramcodecoding =  new org.hl7.fhir.r4.model.Coding();
		claimitemdetailprogramcode.addCoding(claimitemdetailprogramcodecoding);

		/******************** Clm_Itm_Dtl_PrgrmCd_Cdg_Cd ********************************************************************************/
		if(c.getClmItmDtlPrgrmCdCdgCd() != null) {
			claimitemdetailprogramcodecoding.setCode(c.getClmItmDtlPrgrmCdCdgCd());
		}
		/******************** Clm_Itm_Dtl_PrgrmCd_Cdg_Dsply ********************************************************************************/
		if(c.getClmItmDtlPrgrmCdCdgDsply() != null) {
			claimitemdetailprogramcodecoding.setDisplay(c.getClmItmDtlPrgrmCdCdgDsply());
		}
		/******************** Clm_Itm_Dtl_PrgrmCd_Cdg_Sys ********************************************************************************/
		if(c.getClmItmDtlPrgrmCdCdgSys() != null) {
			claimitemdetailprogramcodecoding.setSystem(c.getClmItmDtlPrgrmCdCdgSys());
		}
		/******************** Clm_Itm_Dtl_PrgrmCd_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmItmDtlPrgrmCdCdgUsrSltd() != null) {
			claimitemdetailprogramcodecoding.setUserSelected(Boolean.parseBoolean(c.getClmItmDtlPrgrmCdCdgUsrSltd()));
		}
		/******************** Clm_Itm_Dtl_PrgrmCd_Cdg_Vrsn ********************************************************************************/
		if(c.getClmItmDtlPrgrmCdCdgVrsn() != null) {
			claimitemdetailprogramcodecoding.setVersion(c.getClmItmDtlPrgrmCdCdgVrsn());
		}
		/******************** Clm_Itm_Dtl_PrgrmCd_Txt ********************************************************************************/
		if(c.getClmItmDtlPrgrmCdTxt() != null) {
			claimitemdetailprogramcode.setText(c.getClmItmDtlPrgrmCdTxt());
		}
		/******************** claimitemdetailquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity claimitemdetailquantity =  new org.hl7.fhir.r4.model.Quantity();
		claimitemdetail.setQuantity(claimitemdetailquantity);

		/******************** Clm_Itm_Dtl_Qnty_Cd ********************************************************************************/
		if(c.getClmItmDtlQntyCd() != null) {
			claimitemdetailquantity.setCode(c.getClmItmDtlQntyCd());
		}
		/******************** claimitemdetailquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory claimitemdetailquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		claimitemdetailquantity.setComparator(claimitemdetailquantitycomparator.fromCode(c.getClmItmDtlQntyCmprtr()));

		/******************** Clm_Itm_Dtl_Qnty_Sys ********************************************************************************/
		if(c.getClmItmDtlQntySys() != null) {
			claimitemdetailquantity.setSystem(c.getClmItmDtlQntySys());
		}
		/******************** Clm_Itm_Dtl_Qnty_Unt ********************************************************************************/
		if(c.getClmItmDtlQntyUnt() != null) {
			claimitemdetailquantity.setUnit(c.getClmItmDtlQntyUnt());
		}
		/******************** Clm_Itm_Dtl_Qnty_Vl ********************************************************************************/
		if(c.getClmItmDtlQntyVl() != null) {
			claimitemdetailquantity.setValue(Double.parseDouble((c.getClmItmDtlQntyVl())));
		}
		/******************** claimitemdetailrevenue ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemdetailrevenue =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimitemdetail.setRevenue(claimitemdetailrevenue);

		/******************** claimitemdetailrevenuecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimitemdetailrevenuecoding =  new org.hl7.fhir.r4.model.Coding();
		claimitemdetailrevenue.addCoding(claimitemdetailrevenuecoding);

		/******************** Clm_Itm_Dtl_Revenue_Cdg_Cd ********************************************************************************/
		if(c.getClmItmDtlRevenueCdgCd() != null) {
			claimitemdetailrevenuecoding.setCode(c.getClmItmDtlRevenueCdgCd());
		}
		/******************** Clm_Itm_Dtl_Revenue_Cdg_Dsply ********************************************************************************/
		if(c.getClmItmDtlRevenueCdgDsply() != null) {
			claimitemdetailrevenuecoding.setDisplay(c.getClmItmDtlRevenueCdgDsply());
		}
		/******************** Clm_Itm_Dtl_Revenue_Cdg_Sys ********************************************************************************/
		if(c.getClmItmDtlRevenueCdgSys() != null) {
			claimitemdetailrevenuecoding.setSystem(c.getClmItmDtlRevenueCdgSys());
		}
		/******************** Clm_Itm_Dtl_Revenue_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmItmDtlRevenueCdgUsrSltd() != null) {
			claimitemdetailrevenuecoding.setUserSelected(Boolean.parseBoolean(c.getClmItmDtlRevenueCdgUsrSltd()));
		}
		/******************** Clm_Itm_Dtl_Revenue_Cdg_Vrsn ********************************************************************************/
		if(c.getClmItmDtlRevenueCdgVrsn() != null) {
			claimitemdetailrevenuecoding.setVersion(c.getClmItmDtlRevenueCdgVrsn());
		}
		/******************** Clm_Itm_Dtl_Revenue_Txt ********************************************************************************/
		if(c.getClmItmDtlRevenueTxt() != null) {
			claimitemdetailrevenue.setText(c.getClmItmDtlRevenueTxt());
		}
		/******************** Clm_Itm_Dtl_Sqnc ********************************************************************************/
		if(c.getClmItmDtlSqnc() != null) {
			claimitemdetail.setSequence(Integer.parseInt(c.getClmItmDtlSqnc()));
		}
		/******************** claimitemdetailsubdetail ********************************************************************************/
		org.hl7.fhir.r4.model.Claim.SubDetailComponent claimitemdetailsubdetail =  new org.hl7.fhir.r4.model.Claim.SubDetailComponent();
		claimitemdetail.addSubDetail(claimitemdetailsubdetail);

		/******************** claimitemdetailsubdetailcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemdetailsubdetailcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimitemdetailsubdetail.setCategory(claimitemdetailsubdetailcategory);

		/******************** claimitemdetailsubdetailcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimitemdetailsubdetailcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		claimitemdetailsubdetailcategory.addCoding(claimitemdetailsubdetailcategorycoding);

		/******************** Clm_Itm_Dtl_SubDtl_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getClmItmDtlSubDtlCtgryCdgCd() != null) {
			claimitemdetailsubdetailcategorycoding.setCode(c.getClmItmDtlSubDtlCtgryCdgCd());
		}
		/******************** Clm_Itm_Dtl_SubDtl_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getClmItmDtlSubDtlCtgryCdgDsply() != null) {
			claimitemdetailsubdetailcategorycoding.setDisplay(c.getClmItmDtlSubDtlCtgryCdgDsply());
		}
		/******************** Clm_Itm_Dtl_SubDtl_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getClmItmDtlSubDtlCtgryCdgSys() != null) {
			claimitemdetailsubdetailcategorycoding.setSystem(c.getClmItmDtlSubDtlCtgryCdgSys());
		}
		/******************** Clm_Itm_Dtl_SubDtl_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmItmDtlSubDtlCtgryCdgUsrSltd() != null) {
			claimitemdetailsubdetailcategorycoding.setUserSelected(Boolean.parseBoolean(c.getClmItmDtlSubDtlCtgryCdgUsrSltd()));
		}
		/******************** Clm_Itm_Dtl_SubDtl_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getClmItmDtlSubDtlCtgryCdgVrsn() != null) {
			claimitemdetailsubdetailcategorycoding.setVersion(c.getClmItmDtlSubDtlCtgryCdgVrsn());
		}
		/******************** Clm_Itm_Dtl_SubDtl_Ctgry_Txt ********************************************************************************/
		if(c.getClmItmDtlSubDtlCtgryTxt() != null) {
			claimitemdetailsubdetailcategory.setText(c.getClmItmDtlSubDtlCtgryTxt());
		}
		/******************** Clm_Itm_Dtl_SubDtl_Factor ********************************************************************************/
		if(c.getClmItmDtlSubDtlFactor() != null) {
			claimitemdetailsubdetail.setFactor(Double.parseDouble((c.getClmItmDtlSubDtlFactor())));
		}
		/******************** claimitemdetailsubdetailmodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemdetailsubdetailmodifier =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimitemdetailsubdetail.addModifier(claimitemdetailsubdetailmodifier);

		/******************** claimitemdetailsubdetailmodifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimitemdetailsubdetailmodifiercoding =  new org.hl7.fhir.r4.model.Coding();
		claimitemdetailsubdetailmodifier.addCoding(claimitemdetailsubdetailmodifiercoding);

		/******************** Clm_Itm_Dtl_SubDtl_Mdfr_Cdg_Cd ********************************************************************************/
		if(c.getClmItmDtlSubDtlMdfrCdgCd() != null) {
			claimitemdetailsubdetailmodifiercoding.setCode(c.getClmItmDtlSubDtlMdfrCdgCd());
		}
		/******************** Clm_Itm_Dtl_SubDtl_Mdfr_Cdg_Dsply ********************************************************************************/
		if(c.getClmItmDtlSubDtlMdfrCdgDsply() != null) {
			claimitemdetailsubdetailmodifiercoding.setDisplay(c.getClmItmDtlSubDtlMdfrCdgDsply());
		}
		/******************** Clm_Itm_Dtl_SubDtl_Mdfr_Cdg_Sys ********************************************************************************/
		if(c.getClmItmDtlSubDtlMdfrCdgSys() != null) {
			claimitemdetailsubdetailmodifiercoding.setSystem(c.getClmItmDtlSubDtlMdfrCdgSys());
		}
		/******************** Clm_Itm_Dtl_SubDtl_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmItmDtlSubDtlMdfrCdgUsrSltd() != null) {
			claimitemdetailsubdetailmodifiercoding.setUserSelected(Boolean.parseBoolean(c.getClmItmDtlSubDtlMdfrCdgUsrSltd()));
		}
		/******************** Clm_Itm_Dtl_SubDtl_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(c.getClmItmDtlSubDtlMdfrCdgVrsn() != null) {
			claimitemdetailsubdetailmodifiercoding.setVersion(c.getClmItmDtlSubDtlMdfrCdgVrsn());
		}
		/******************** Clm_Itm_Dtl_SubDtl_Mdfr_Txt ********************************************************************************/
		if(c.getClmItmDtlSubDtlMdfrTxt() != null) {
			claimitemdetailsubdetailmodifier.setText(c.getClmItmDtlSubDtlMdfrTxt());
		}
		/******************** claimitemdetailsubdetailnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimitemdetailsubdetailnet =  new org.hl7.fhir.r4.model.Money();
		claimitemdetailsubdetail.setNet(claimitemdetailsubdetailnet);

		/******************** Clm_Itm_Dtl_SubDtl_Net_Crncy ********************************************************************************/
		if(c.getClmItmDtlSubDtlNetCrncy() != null) {
			claimitemdetailsubdetailnet.setCurrency(c.getClmItmDtlSubDtlNetCrncy());
		}
		/******************** Clm_Itm_Dtl_SubDtl_Net_Vl ********************************************************************************/
		if(c.getClmItmDtlSubDtlNetVl() != null) {
			claimitemdetailsubdetailnet.setValue(Double.parseDouble((c.getClmItmDtlSubDtlNetVl())));
		}
		/******************** claimitemdetailsubdetailproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemdetailsubdetailproductorservice =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimitemdetailsubdetail.setProductOrService(claimitemdetailsubdetailproductorservice);

		/******************** claimitemdetailsubdetailproductorservicecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimitemdetailsubdetailproductorservicecoding =  new org.hl7.fhir.r4.model.Coding();
		claimitemdetailsubdetailproductorservice.addCoding(claimitemdetailsubdetailproductorservicecoding);

		/******************** Clm_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(c.getClmItmDtlSubDtlPrdctOrSrvCdgCd() != null) {
			claimitemdetailsubdetailproductorservicecoding.setCode(c.getClmItmDtlSubDtlPrdctOrSrvCdgCd());
		}
		/******************** Clm_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(c.getClmItmDtlSubDtlPrdctOrSrvCdgDsply() != null) {
			claimitemdetailsubdetailproductorservicecoding.setDisplay(c.getClmItmDtlSubDtlPrdctOrSrvCdgDsply());
		}
		/******************** Clm_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(c.getClmItmDtlSubDtlPrdctOrSrvCdgSys() != null) {
			claimitemdetailsubdetailproductorservicecoding.setSystem(c.getClmItmDtlSubDtlPrdctOrSrvCdgSys());
		}
		/******************** Clm_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmItmDtlSubDtlPrdctOrSrvCdgUsrSltd() != null) {
			claimitemdetailsubdetailproductorservicecoding.setUserSelected(Boolean.parseBoolean(c.getClmItmDtlSubDtlPrdctOrSrvCdgUsrSltd()));
		}
		/******************** Clm_Itm_Dtl_SubDtl_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(c.getClmItmDtlSubDtlPrdctOrSrvCdgVrsn() != null) {
			claimitemdetailsubdetailproductorservicecoding.setVersion(c.getClmItmDtlSubDtlPrdctOrSrvCdgVrsn());
		}
		/******************** Clm_Itm_Dtl_SubDtl_PrdctOrSrv_Txt ********************************************************************************/
		if(c.getClmItmDtlSubDtlPrdctOrSrvTxt() != null) {
			claimitemdetailsubdetailproductorservice.setText(c.getClmItmDtlSubDtlPrdctOrSrvTxt());
		}
		/******************** claimitemdetailsubdetailprogramcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemdetailsubdetailprogramcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimitemdetailsubdetail.addProgramCode(claimitemdetailsubdetailprogramcode);

		/******************** claimitemdetailsubdetailprogramcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimitemdetailsubdetailprogramcodecoding =  new org.hl7.fhir.r4.model.Coding();
		claimitemdetailsubdetailprogramcode.addCoding(claimitemdetailsubdetailprogramcodecoding);

		/******************** Clm_Itm_Dtl_SubDtl_PrgrmCd_Cdg_Cd ********************************************************************************/
		if(c.getClmItmDtlSubDtlPrgrmCdCdgCd() != null) {
			claimitemdetailsubdetailprogramcodecoding.setCode(c.getClmItmDtlSubDtlPrgrmCdCdgCd());
		}
		/******************** Clm_Itm_Dtl_SubDtl_PrgrmCd_Cdg_Dsply ********************************************************************************/
		if(c.getClmItmDtlSubDtlPrgrmCdCdgDsply() != null) {
			claimitemdetailsubdetailprogramcodecoding.setDisplay(c.getClmItmDtlSubDtlPrgrmCdCdgDsply());
		}
		/******************** Clm_Itm_Dtl_SubDtl_PrgrmCd_Cdg_Sys ********************************************************************************/
		if(c.getClmItmDtlSubDtlPrgrmCdCdgSys() != null) {
			claimitemdetailsubdetailprogramcodecoding.setSystem(c.getClmItmDtlSubDtlPrgrmCdCdgSys());
		}
		/******************** Clm_Itm_Dtl_SubDtl_PrgrmCd_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmItmDtlSubDtlPrgrmCdCdgUsrSltd() != null) {
			claimitemdetailsubdetailprogramcodecoding.setUserSelected(Boolean.parseBoolean(c.getClmItmDtlSubDtlPrgrmCdCdgUsrSltd()));
		}
		/******************** Clm_Itm_Dtl_SubDtl_PrgrmCd_Cdg_Vrsn ********************************************************************************/
		if(c.getClmItmDtlSubDtlPrgrmCdCdgVrsn() != null) {
			claimitemdetailsubdetailprogramcodecoding.setVersion(c.getClmItmDtlSubDtlPrgrmCdCdgVrsn());
		}
		/******************** Clm_Itm_Dtl_SubDtl_PrgrmCd_Txt ********************************************************************************/
		if(c.getClmItmDtlSubDtlPrgrmCdTxt() != null) {
			claimitemdetailsubdetailprogramcode.setText(c.getClmItmDtlSubDtlPrgrmCdTxt());
		}
		/******************** claimitemdetailsubdetailquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity claimitemdetailsubdetailquantity =  new org.hl7.fhir.r4.model.Quantity();
		claimitemdetailsubdetail.setQuantity(claimitemdetailsubdetailquantity);

		/******************** Clm_Itm_Dtl_SubDtl_Qnty_Cd ********************************************************************************/
		if(c.getClmItmDtlSubDtlQntyCd() != null) {
			claimitemdetailsubdetailquantity.setCode(c.getClmItmDtlSubDtlQntyCd());
		}
		/******************** claimitemdetailsubdetailquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory claimitemdetailsubdetailquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		claimitemdetailsubdetailquantity.setComparator(claimitemdetailsubdetailquantitycomparator.fromCode(c.getClmItmDtlSubDtlQntyCmprtr()));

		/******************** Clm_Itm_Dtl_SubDtl_Qnty_Sys ********************************************************************************/
		if(c.getClmItmDtlSubDtlQntySys() != null) {
			claimitemdetailsubdetailquantity.setSystem(c.getClmItmDtlSubDtlQntySys());
		}
		/******************** Clm_Itm_Dtl_SubDtl_Qnty_Unt ********************************************************************************/
		if(c.getClmItmDtlSubDtlQntyUnt() != null) {
			claimitemdetailsubdetailquantity.setUnit(c.getClmItmDtlSubDtlQntyUnt());
		}
		/******************** Clm_Itm_Dtl_SubDtl_Qnty_Vl ********************************************************************************/
		if(c.getClmItmDtlSubDtlQntyVl() != null) {
			claimitemdetailsubdetailquantity.setValue(Double.parseDouble((c.getClmItmDtlSubDtlQntyVl())));
		}
		/******************** claimitemdetailsubdetailrevenue ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemdetailsubdetailrevenue =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimitemdetailsubdetail.setRevenue(claimitemdetailsubdetailrevenue);

		/******************** claimitemdetailsubdetailrevenuecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimitemdetailsubdetailrevenuecoding =  new org.hl7.fhir.r4.model.Coding();
		claimitemdetailsubdetailrevenue.addCoding(claimitemdetailsubdetailrevenuecoding);

		/******************** Clm_Itm_Dtl_SubDtl_Revenue_Cdg_Cd ********************************************************************************/
		if(c.getClmItmDtlSubDtlRevenueCdgCd() != null) {
			claimitemdetailsubdetailrevenuecoding.setCode(c.getClmItmDtlSubDtlRevenueCdgCd());
		}
		/******************** Clm_Itm_Dtl_SubDtl_Revenue_Cdg_Dsply ********************************************************************************/
		if(c.getClmItmDtlSubDtlRevenueCdgDsply() != null) {
			claimitemdetailsubdetailrevenuecoding.setDisplay(c.getClmItmDtlSubDtlRevenueCdgDsply());
		}
		/******************** Clm_Itm_Dtl_SubDtl_Revenue_Cdg_Sys ********************************************************************************/
		if(c.getClmItmDtlSubDtlRevenueCdgSys() != null) {
			claimitemdetailsubdetailrevenuecoding.setSystem(c.getClmItmDtlSubDtlRevenueCdgSys());
		}
		/******************** Clm_Itm_Dtl_SubDtl_Revenue_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmItmDtlSubDtlRevenueCdgUsrSltd() != null) {
			claimitemdetailsubdetailrevenuecoding.setUserSelected(Boolean.parseBoolean(c.getClmItmDtlSubDtlRevenueCdgUsrSltd()));
		}
		/******************** Clm_Itm_Dtl_SubDtl_Revenue_Cdg_Vrsn ********************************************************************************/
		if(c.getClmItmDtlSubDtlRevenueCdgVrsn() != null) {
			claimitemdetailsubdetailrevenuecoding.setVersion(c.getClmItmDtlSubDtlRevenueCdgVrsn());
		}
		/******************** Clm_Itm_Dtl_SubDtl_Revenue_Txt ********************************************************************************/
		if(c.getClmItmDtlSubDtlRevenueTxt() != null) {
			claimitemdetailsubdetailrevenue.setText(c.getClmItmDtlSubDtlRevenueTxt());
		}
		/******************** Clm_Itm_Dtl_SubDtl_Sqnc ********************************************************************************/
		if(c.getClmItmDtlSubDtlSqnc() != null) {
			claimitemdetailsubdetail.setSequence(Integer.parseInt(c.getClmItmDtlSubDtlSqnc()));
		}
		/******************** Clm_Itm_Dtl_SubDtl_Udi ********************************************************************************/
		if(c.getClmItmDtlSubDtlUdi() != null) {
			claimitemdetailsubdetail.addUdi( new org.hl7.fhir.r4.model.Reference(c.getClmItmDtlSubDtlUdi()));
		}
		/******************** claimitemdetailsubdetailunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimitemdetailsubdetailunitprice =  new org.hl7.fhir.r4.model.Money();
		claimitemdetailsubdetail.setUnitPrice(claimitemdetailsubdetailunitprice);

		/******************** Clm_Itm_Dtl_SubDtl_UntPrice_Crncy ********************************************************************************/
		if(c.getClmItmDtlSubDtlUntPriceCrncy() != null) {
			claimitemdetailsubdetailunitprice.setCurrency(c.getClmItmDtlSubDtlUntPriceCrncy());
		}
		/******************** Clm_Itm_Dtl_SubDtl_UntPrice_Vl ********************************************************************************/
		if(c.getClmItmDtlSubDtlUntPriceVl() != null) {
			claimitemdetailsubdetailunitprice.setValue(Double.parseDouble((c.getClmItmDtlSubDtlUntPriceVl())));
		}
		/******************** Clm_Itm_Dtl_Udi ********************************************************************************/
		if(c.getClmItmDtlUdi() != null) {
			claimitemdetail.addUdi( new org.hl7.fhir.r4.model.Reference(c.getClmItmDtlUdi()));
		}
		/******************** claimitemdetailunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimitemdetailunitprice =  new org.hl7.fhir.r4.model.Money();
		claimitemdetail.setUnitPrice(claimitemdetailunitprice);

		/******************** Clm_Itm_Dtl_UntPrice_Crncy ********************************************************************************/
		if(c.getClmItmDtlUntPriceCrncy() != null) {
			claimitemdetailunitprice.setCurrency(c.getClmItmDtlUntPriceCrncy());
		}
		/******************** Clm_Itm_Dtl_UntPrice_Vl ********************************************************************************/
		if(c.getClmItmDtlUntPriceVl() != null) {
			claimitemdetailunitprice.setValue(Double.parseDouble((c.getClmItmDtlUntPriceVl())));
		}
		/******************** Clm_Itm_DgnsisSqnc ********************************************************************************/
		if(c.getClmItmDgnsisSqnc() != null) {
			claimitem.addDiagnosisSequence(Integer.parseInt(c.getClmItmDgnsisSqnc()));
		}
		/******************** Clm_Itm_Enc ********************************************************************************/
		if(c.getClmItmEnc() != null) {
			claimitem.addEncounter( new org.hl7.fhir.r4.model.Reference(c.getClmItmEnc()));
		}
		/******************** Clm_Itm_Factor ********************************************************************************/
		if(c.getClmItmFactor() != null) {
			claimitem.setFactor(Double.parseDouble((c.getClmItmFactor())));
		}
		/******************** Clm_Itm_InfoSqnc ********************************************************************************/
		if(c.getClmItmInfoSqnc() != null) {
			claimitem.addInformationSequence(Integer.parseInt(c.getClmItmInfoSqnc()));
		}
		/******************** claimitemlocationaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address claimitemlocationaddress =  new org.hl7.fhir.r4.model.Address();
		claimitem.setLocation(claimitemlocationaddress);

		/******************** Clm_Itm_LctnAddr_City ********************************************************************************/
		if(c.getClmItmLctnAddrCity() != null) {
			claimitemlocationaddress.setCity(c.getClmItmLctnAddrCity());
		}
		/******************** Clm_Itm_LctnAddr_Cntry ********************************************************************************/
		if(c.getClmItmLctnAddrCntry() != null) {
			claimitemlocationaddress.setCountry(c.getClmItmLctnAddrCntry());
		}
		/******************** Clm_Itm_LctnAddr_District ********************************************************************************/
		if(c.getClmItmLctnAddrDistrict() != null) {
			claimitemlocationaddress.setDistrict(c.getClmItmLctnAddrDistrict());
		}
		/******************** Clm_Itm_LctnAddr_Line ********************************************************************************/
		if(c.getClmItmLctnAddrLine() != null) {
			claimitemlocationaddress.addLine(c.getClmItmLctnAddrLine());
		}
		/******************** claimitemlocationaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claimitemlocationaddressperiod =  new org.hl7.fhir.r4.model.Period();
		claimitemlocationaddress.setPeriod(claimitemlocationaddressperiod);

		/******************** Clm_Itm_LctnAddr_Prd_End ********************************************************************************/
		if(c.getClmItmLctnAddrPrdEnd() != null) {
			java.text.SimpleDateFormat Clm_Itm_LctnAddr_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Clm_Itm_LctnAddr_Prd_Enddate = Clm_Itm_LctnAddr_Prd_Endsdf.parse(c.getClmItmLctnAddrPrdEnd());
			claimitemlocationaddressperiod.setEnd(Clm_Itm_LctnAddr_Prd_Enddate);
		}
		/******************** Clm_Itm_LctnAddr_Prd_Strt ********************************************************************************/
		if(c.getClmItmLctnAddrPrdStrt() != null) {
			java.text.SimpleDateFormat Clm_Itm_LctnAddr_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Clm_Itm_LctnAddr_Prd_Strtdate = Clm_Itm_LctnAddr_Prd_Strtsdf.parse(c.getClmItmLctnAddrPrdStrt());
			claimitemlocationaddressperiod.setStart(Clm_Itm_LctnAddr_Prd_Strtdate);
		}
		/******************** Clm_Itm_LctnAddr_PostalCd ********************************************************************************/
		if(c.getClmItmLctnAddrPostalCd() != null) {
			claimitemlocationaddress.setPostalCode(c.getClmItmLctnAddrPostalCd());
		}
		/******************** Clm_Itm_LctnAddr_State ********************************************************************************/
		if(c.getClmItmLctnAddrState() != null) {
			claimitemlocationaddress.setState(c.getClmItmLctnAddrState());
		}
		/******************** Clm_Itm_LctnAddr_Txt ********************************************************************************/
		if(c.getClmItmLctnAddrTxt() != null) {
			claimitemlocationaddress.setText(c.getClmItmLctnAddrTxt());
		}
		/******************** claimitemlocationaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory claimitemlocationaddresstype =  new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory();
		claimitemlocationaddress.setType(claimitemlocationaddresstype.fromCode(c.getClmItmLctnAddrTyp()));

		/******************** claimitemlocationaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUseEnumFactory claimitemlocationaddressuse =  new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory();
		claimitemlocationaddress.setUse(claimitemlocationaddressuse.fromCode(c.getClmItmLctnAddrUse()));

		/******************** claimitemlocationcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemlocationcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimitem.setLocation(claimitemlocationcodeableconcept);

		/******************** claimitemlocationcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimitemlocationcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		claimitemlocationcodeableconcept.addCoding(claimitemlocationcodeableconceptcoding);

		/******************** Clm_Itm_LctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(c.getClmItmLctnCdbleCncptCdgCd() != null) {
			claimitemlocationcodeableconceptcoding.setCode(c.getClmItmLctnCdbleCncptCdgCd());
		}
		/******************** Clm_Itm_LctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(c.getClmItmLctnCdbleCncptCdgDsply() != null) {
			claimitemlocationcodeableconceptcoding.setDisplay(c.getClmItmLctnCdbleCncptCdgDsply());
		}
		/******************** Clm_Itm_LctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(c.getClmItmLctnCdbleCncptCdgSys() != null) {
			claimitemlocationcodeableconceptcoding.setSystem(c.getClmItmLctnCdbleCncptCdgSys());
		}
		/******************** Clm_Itm_LctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmItmLctnCdbleCncptCdgUsrSltd() != null) {
			claimitemlocationcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(c.getClmItmLctnCdbleCncptCdgUsrSltd()));
		}
		/******************** Clm_Itm_LctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(c.getClmItmLctnCdbleCncptCdgVrsn() != null) {
			claimitemlocationcodeableconceptcoding.setVersion(c.getClmItmLctnCdbleCncptCdgVrsn());
		}
		/******************** Clm_Itm_LctnCdbleCncpt_Txt ********************************************************************************/
		if(c.getClmItmLctnCdbleCncptTxt() != null) {
			claimitemlocationcodeableconcept.setText(c.getClmItmLctnCdbleCncptTxt());
		}
		/******************** Clm_Itm_LctnRfrnc ********************************************************************************/
		if(c.getClmItmLctnRfrnc() != null) {
			claimitem.setLocation( new org.hl7.fhir.r4.model.Reference(c.getClmItmLctnRfrnc()));
		}
		/******************** claimitemmodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemmodifier =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimitem.addModifier(claimitemmodifier);

		/******************** claimitemmodifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimitemmodifiercoding =  new org.hl7.fhir.r4.model.Coding();
		claimitemmodifier.addCoding(claimitemmodifiercoding);

		/******************** Clm_Itm_Mdfr_Cdg_Cd ********************************************************************************/
		if(c.getClmItmMdfrCdgCd() != null) {
			claimitemmodifiercoding.setCode(c.getClmItmMdfrCdgCd());
		}
		/******************** Clm_Itm_Mdfr_Cdg_Dsply ********************************************************************************/
		if(c.getClmItmMdfrCdgDsply() != null) {
			claimitemmodifiercoding.setDisplay(c.getClmItmMdfrCdgDsply());
		}
		/******************** Clm_Itm_Mdfr_Cdg_Sys ********************************************************************************/
		if(c.getClmItmMdfrCdgSys() != null) {
			claimitemmodifiercoding.setSystem(c.getClmItmMdfrCdgSys());
		}
		/******************** Clm_Itm_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmItmMdfrCdgUsrSltd() != null) {
			claimitemmodifiercoding.setUserSelected(Boolean.parseBoolean(c.getClmItmMdfrCdgUsrSltd()));
		}
		/******************** Clm_Itm_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(c.getClmItmMdfrCdgVrsn() != null) {
			claimitemmodifiercoding.setVersion(c.getClmItmMdfrCdgVrsn());
		}
		/******************** Clm_Itm_Mdfr_Txt ********************************************************************************/
		if(c.getClmItmMdfrTxt() != null) {
			claimitemmodifier.setText(c.getClmItmMdfrTxt());
		}
		/******************** claimitemnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimitemnet =  new org.hl7.fhir.r4.model.Money();
		claimitem.setNet(claimitemnet);

		/******************** Clm_Itm_Net_Crncy ********************************************************************************/
		if(c.getClmItmNetCrncy() != null) {
			claimitemnet.setCurrency(c.getClmItmNetCrncy());
		}
		/******************** Clm_Itm_Net_Vl ********************************************************************************/
		if(c.getClmItmNetVl() != null) {
			claimitemnet.setValue(Double.parseDouble((c.getClmItmNetVl())));
		}
		/******************** Clm_Itm_PrcdrSqnc ********************************************************************************/
		if(c.getClmItmPrcdrSqnc() != null) {
			claimitem.addProcedureSequence(Integer.parseInt(c.getClmItmPrcdrSqnc()));
		}
		/******************** claimitemproductorservice ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemproductorservice =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimitem.setProductOrService(claimitemproductorservice);

		/******************** claimitemproductorservicecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimitemproductorservicecoding =  new org.hl7.fhir.r4.model.Coding();
		claimitemproductorservice.addCoding(claimitemproductorservicecoding);

		/******************** Clm_Itm_PrdctOrSrv_Cdg_Cd ********************************************************************************/
		if(c.getClmItmPrdctOrSrvCdgCd() != null) {
			claimitemproductorservicecoding.setCode(c.getClmItmPrdctOrSrvCdgCd());
		}
		/******************** Clm_Itm_PrdctOrSrv_Cdg_Dsply ********************************************************************************/
		if(c.getClmItmPrdctOrSrvCdgDsply() != null) {
			claimitemproductorservicecoding.setDisplay(c.getClmItmPrdctOrSrvCdgDsply());
		}
		/******************** Clm_Itm_PrdctOrSrv_Cdg_Sys ********************************************************************************/
		if(c.getClmItmPrdctOrSrvCdgSys() != null) {
			claimitemproductorservicecoding.setSystem(c.getClmItmPrdctOrSrvCdgSys());
		}
		/******************** Clm_Itm_PrdctOrSrv_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmItmPrdctOrSrvCdgUsrSltd() != null) {
			claimitemproductorservicecoding.setUserSelected(Boolean.parseBoolean(c.getClmItmPrdctOrSrvCdgUsrSltd()));
		}
		/******************** Clm_Itm_PrdctOrSrv_Cdg_Vrsn ********************************************************************************/
		if(c.getClmItmPrdctOrSrvCdgVrsn() != null) {
			claimitemproductorservicecoding.setVersion(c.getClmItmPrdctOrSrvCdgVrsn());
		}
		/******************** Clm_Itm_PrdctOrSrv_Txt ********************************************************************************/
		if(c.getClmItmPrdctOrSrvTxt() != null) {
			claimitemproductorservice.setText(c.getClmItmPrdctOrSrvTxt());
		}
		/******************** claimitemprogramcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemprogramcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimitem.addProgramCode(claimitemprogramcode);

		/******************** claimitemprogramcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimitemprogramcodecoding =  new org.hl7.fhir.r4.model.Coding();
		claimitemprogramcode.addCoding(claimitemprogramcodecoding);

		/******************** Clm_Itm_PrgrmCd_Cdg_Cd ********************************************************************************/
		if(c.getClmItmPrgrmCdCdgCd() != null) {
			claimitemprogramcodecoding.setCode(c.getClmItmPrgrmCdCdgCd());
		}
		/******************** Clm_Itm_PrgrmCd_Cdg_Dsply ********************************************************************************/
		if(c.getClmItmPrgrmCdCdgDsply() != null) {
			claimitemprogramcodecoding.setDisplay(c.getClmItmPrgrmCdCdgDsply());
		}
		/******************** Clm_Itm_PrgrmCd_Cdg_Sys ********************************************************************************/
		if(c.getClmItmPrgrmCdCdgSys() != null) {
			claimitemprogramcodecoding.setSystem(c.getClmItmPrgrmCdCdgSys());
		}
		/******************** Clm_Itm_PrgrmCd_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmItmPrgrmCdCdgUsrSltd() != null) {
			claimitemprogramcodecoding.setUserSelected(Boolean.parseBoolean(c.getClmItmPrgrmCdCdgUsrSltd()));
		}
		/******************** Clm_Itm_PrgrmCd_Cdg_Vrsn ********************************************************************************/
		if(c.getClmItmPrgrmCdCdgVrsn() != null) {
			claimitemprogramcodecoding.setVersion(c.getClmItmPrgrmCdCdgVrsn());
		}
		/******************** Clm_Itm_PrgrmCd_Txt ********************************************************************************/
		if(c.getClmItmPrgrmCdTxt() != null) {
			claimitemprogramcode.setText(c.getClmItmPrgrmCdTxt());
		}
		/******************** claimitemquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity claimitemquantity =  new org.hl7.fhir.r4.model.Quantity();
		claimitem.setQuantity(claimitemquantity);

		/******************** Clm_Itm_Qnty_Cd ********************************************************************************/
		if(c.getClmItmQntyCd() != null) {
			claimitemquantity.setCode(c.getClmItmQntyCd());
		}
		/******************** claimitemquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory claimitemquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		claimitemquantity.setComparator(claimitemquantitycomparator.fromCode(c.getClmItmQntyCmprtr()));

		/******************** Clm_Itm_Qnty_Sys ********************************************************************************/
		if(c.getClmItmQntySys() != null) {
			claimitemquantity.setSystem(c.getClmItmQntySys());
		}
		/******************** Clm_Itm_Qnty_Unt ********************************************************************************/
		if(c.getClmItmQntyUnt() != null) {
			claimitemquantity.setUnit(c.getClmItmQntyUnt());
		}
		/******************** Clm_Itm_Qnty_Vl ********************************************************************************/
		if(c.getClmItmQntyVl() != null) {
			claimitemquantity.setValue(Double.parseDouble((c.getClmItmQntyVl())));
		}
		/******************** claimitemrevenue ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemrevenue =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimitem.setRevenue(claimitemrevenue);

		/******************** claimitemrevenuecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimitemrevenuecoding =  new org.hl7.fhir.r4.model.Coding();
		claimitemrevenue.addCoding(claimitemrevenuecoding);

		/******************** Clm_Itm_Revenue_Cdg_Cd ********************************************************************************/
		if(c.getClmItmRevenueCdgCd() != null) {
			claimitemrevenuecoding.setCode(c.getClmItmRevenueCdgCd());
		}
		/******************** Clm_Itm_Revenue_Cdg_Dsply ********************************************************************************/
		if(c.getClmItmRevenueCdgDsply() != null) {
			claimitemrevenuecoding.setDisplay(c.getClmItmRevenueCdgDsply());
		}
		/******************** Clm_Itm_Revenue_Cdg_Sys ********************************************************************************/
		if(c.getClmItmRevenueCdgSys() != null) {
			claimitemrevenuecoding.setSystem(c.getClmItmRevenueCdgSys());
		}
		/******************** Clm_Itm_Revenue_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmItmRevenueCdgUsrSltd() != null) {
			claimitemrevenuecoding.setUserSelected(Boolean.parseBoolean(c.getClmItmRevenueCdgUsrSltd()));
		}
		/******************** Clm_Itm_Revenue_Cdg_Vrsn ********************************************************************************/
		if(c.getClmItmRevenueCdgVrsn() != null) {
			claimitemrevenuecoding.setVersion(c.getClmItmRevenueCdgVrsn());
		}
		/******************** Clm_Itm_Revenue_Txt ********************************************************************************/
		if(c.getClmItmRevenueTxt() != null) {
			claimitemrevenue.setText(c.getClmItmRevenueTxt());
		}
		/******************** Clm_Itm_Sqnc ********************************************************************************/
		if(c.getClmItmSqnc() != null) {
			claimitem.setSequence(Integer.parseInt(c.getClmItmSqnc()));
		}
		/******************** Clm_Itm_SrvdDtTyp ********************************************************************************/
		if(c.getClmItmSrvdDtTyp() != null) {
			claimitem.setServiced( new org.hl7.fhir.r4.model.DateType(c.getClmItmSrvdDtTyp()));
		}
		/******************** claimitemservicedperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claimitemservicedperiod =  new org.hl7.fhir.r4.model.Period();
		claimitem.setServiced(claimitemservicedperiod);

		/******************** Clm_Itm_SrvdPrd_End ********************************************************************************/
		if(c.getClmItmSrvdPrdEnd() != null) {
			java.text.SimpleDateFormat Clm_Itm_SrvdPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Clm_Itm_SrvdPrd_Enddate = Clm_Itm_SrvdPrd_Endsdf.parse(c.getClmItmSrvdPrdEnd());
			claimitemservicedperiod.setEnd(Clm_Itm_SrvdPrd_Enddate);
		}
		/******************** Clm_Itm_SrvdPrd_Strt ********************************************************************************/
		if(c.getClmItmSrvdPrdStrt() != null) {
			java.text.SimpleDateFormat Clm_Itm_SrvdPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Clm_Itm_SrvdPrd_Strtdate = Clm_Itm_SrvdPrd_Strtsdf.parse(c.getClmItmSrvdPrdStrt());
			claimitemservicedperiod.setStart(Clm_Itm_SrvdPrd_Strtdate);
		}
		/******************** claimitemsubsite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimitemsubsite =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimitem.addSubSite(claimitemsubsite);

		/******************** claimitemsubsitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimitemsubsitecoding =  new org.hl7.fhir.r4.model.Coding();
		claimitemsubsite.addCoding(claimitemsubsitecoding);

		/******************** Clm_Itm_SubSite_Cdg_Cd ********************************************************************************/
		if(c.getClmItmSubSiteCdgCd() != null) {
			claimitemsubsitecoding.setCode(c.getClmItmSubSiteCdgCd());
		}
		/******************** Clm_Itm_SubSite_Cdg_Dsply ********************************************************************************/
		if(c.getClmItmSubSiteCdgDsply() != null) {
			claimitemsubsitecoding.setDisplay(c.getClmItmSubSiteCdgDsply());
		}
		/******************** Clm_Itm_SubSite_Cdg_Sys ********************************************************************************/
		if(c.getClmItmSubSiteCdgSys() != null) {
			claimitemsubsitecoding.setSystem(c.getClmItmSubSiteCdgSys());
		}
		/******************** Clm_Itm_SubSite_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmItmSubSiteCdgUsrSltd() != null) {
			claimitemsubsitecoding.setUserSelected(Boolean.parseBoolean(c.getClmItmSubSiteCdgUsrSltd()));
		}
		/******************** Clm_Itm_SubSite_Cdg_Vrsn ********************************************************************************/
		if(c.getClmItmSubSiteCdgVrsn() != null) {
			claimitemsubsitecoding.setVersion(c.getClmItmSubSiteCdgVrsn());
		}
		/******************** Clm_Itm_SubSite_Txt ********************************************************************************/
		if(c.getClmItmSubSiteTxt() != null) {
			claimitemsubsite.setText(c.getClmItmSubSiteTxt());
		}
		/******************** Clm_Itm_Udi ********************************************************************************/
		if(c.getClmItmUdi() != null) {
			claimitem.addUdi( new org.hl7.fhir.r4.model.Reference(c.getClmItmUdi()));
		}
		/******************** claimitemunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimitemunitprice =  new org.hl7.fhir.r4.model.Money();
		claimitem.setUnitPrice(claimitemunitprice);

		/******************** Clm_Itm_UntPrice_Crncy ********************************************************************************/
		if(c.getClmItmUntPriceCrncy() != null) {
			claimitemunitprice.setCurrency(c.getClmItmUntPriceCrncy());
		}
		/******************** Clm_Itm_UntPrice_Vl ********************************************************************************/
		if(c.getClmItmUntPriceVl() != null) {
			claimitemunitprice.setValue(Double.parseDouble((c.getClmItmUntPriceVl())));
		}
		/******************** Clm_OriginalPrescription ********************************************************************************/
		if(c.getClmOriginalPrescription() != null) {
			claim.setOriginalPrescription( new org.hl7.fhir.r4.model.Reference(c.getClmOriginalPrescription()));
		}
		/******************** Clm_Pnt ********************************************************************************/
		if(c.getClmPnt() != null) {
			claim.setPatient( new org.hl7.fhir.r4.model.Reference(c.getClmPnt()));
		}
		/******************** claimpayee ********************************************************************************/
		org.hl7.fhir.r4.model.Claim.PayeeComponent claimpayee =  new org.hl7.fhir.r4.model.Claim.PayeeComponent();
		claim.setPayee(claimpayee);

		/******************** Clm_Payee_Party ********************************************************************************/
		if(c.getClmPayeeParty() != null) {
			claimpayee.setParty( new org.hl7.fhir.r4.model.Reference(c.getClmPayeeParty()));
		}
		/******************** claimpayeetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimpayeetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimpayee.setType(claimpayeetype);

		/******************** claimpayeetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimpayeetypecoding =  new org.hl7.fhir.r4.model.Coding();
		claimpayeetype.addCoding(claimpayeetypecoding);

		/******************** Clm_Payee_Typ_Cdg_Cd ********************************************************************************/
		if(c.getClmPayeeTypCdgCd() != null) {
			claimpayeetypecoding.setCode(c.getClmPayeeTypCdgCd());
		}
		/******************** Clm_Payee_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getClmPayeeTypCdgDsply() != null) {
			claimpayeetypecoding.setDisplay(c.getClmPayeeTypCdgDsply());
		}
		/******************** Clm_Payee_Typ_Cdg_Sys ********************************************************************************/
		if(c.getClmPayeeTypCdgSys() != null) {
			claimpayeetypecoding.setSystem(c.getClmPayeeTypCdgSys());
		}
		/******************** Clm_Payee_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmPayeeTypCdgUsrSltd() != null) {
			claimpayeetypecoding.setUserSelected(Boolean.parseBoolean(c.getClmPayeeTypCdgUsrSltd()));
		}
		/******************** Clm_Payee_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getClmPayeeTypCdgVrsn() != null) {
			claimpayeetypecoding.setVersion(c.getClmPayeeTypCdgVrsn());
		}
		/******************** Clm_Payee_Typ_Txt ********************************************************************************/
		if(c.getClmPayeeTypTxt() != null) {
			claimpayeetype.setText(c.getClmPayeeTypTxt());
		}
		/******************** Clm_Prescription ********************************************************************************/
		if(c.getClmPrescription() != null) {
			claim.setPrescription( new org.hl7.fhir.r4.model.Reference(c.getClmPrescription()));
		}
		/******************** claimpriority ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimpriority =  new org.hl7.fhir.r4.model.CodeableConcept();
		claim.setPriority(claimpriority);

		/******************** claimprioritycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimprioritycoding =  new org.hl7.fhir.r4.model.Coding();
		claimpriority.addCoding(claimprioritycoding);

		/******************** Clm_Priority_Cdg_Cd ********************************************************************************/
		if(c.getClmPriorityCdgCd() != null) {
			claimprioritycoding.setCode(c.getClmPriorityCdgCd());
		}
		/******************** Clm_Priority_Cdg_Dsply ********************************************************************************/
		if(c.getClmPriorityCdgDsply() != null) {
			claimprioritycoding.setDisplay(c.getClmPriorityCdgDsply());
		}
		/******************** Clm_Priority_Cdg_Sys ********************************************************************************/
		if(c.getClmPriorityCdgSys() != null) {
			claimprioritycoding.setSystem(c.getClmPriorityCdgSys());
		}
		/******************** Clm_Priority_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmPriorityCdgUsrSltd() != null) {
			claimprioritycoding.setUserSelected(Boolean.parseBoolean(c.getClmPriorityCdgUsrSltd()));
		}
		/******************** Clm_Priority_Cdg_Vrsn ********************************************************************************/
		if(c.getClmPriorityCdgVrsn() != null) {
			claimprioritycoding.setVersion(c.getClmPriorityCdgVrsn());
		}
		/******************** Clm_Priority_Txt ********************************************************************************/
		if(c.getClmPriorityTxt() != null) {
			claimpriority.setText(c.getClmPriorityTxt());
		}
		/******************** claimprocedure ********************************************************************************/
		org.hl7.fhir.r4.model.Claim.ProcedureComponent claimprocedure =  new org.hl7.fhir.r4.model.Claim.ProcedureComponent();
		claim.addProcedure(claimprocedure);

		/******************** Clm_Prcdr_Dt ********************************************************************************/
		if(c.getClmPrcdrDt() != null) {
			java.text.SimpleDateFormat Clm_Prcdr_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Clm_Prcdr_Dtdate = Clm_Prcdr_Dtsdf.parse(c.getClmPrcdrDt());
			claimprocedure.setDate(Clm_Prcdr_Dtdate);
		}
		/******************** claimprocedureprocedurecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimprocedureprocedurecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimprocedure.setProcedure(claimprocedureprocedurecodeableconcept);

		/******************** claimprocedureprocedurecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimprocedureprocedurecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		claimprocedureprocedurecodeableconcept.addCoding(claimprocedureprocedurecodeableconceptcoding);

		/******************** Clm_Prcdr_PrcdrCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(c.getClmPrcdrPrcdrCdbleCncptCdgCd() != null) {
			claimprocedureprocedurecodeableconceptcoding.setCode(c.getClmPrcdrPrcdrCdbleCncptCdgCd());
		}
		/******************** Clm_Prcdr_PrcdrCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(c.getClmPrcdrPrcdrCdbleCncptCdgDsply() != null) {
			claimprocedureprocedurecodeableconceptcoding.setDisplay(c.getClmPrcdrPrcdrCdbleCncptCdgDsply());
		}
		/******************** Clm_Prcdr_PrcdrCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(c.getClmPrcdrPrcdrCdbleCncptCdgSys() != null) {
			claimprocedureprocedurecodeableconceptcoding.setSystem(c.getClmPrcdrPrcdrCdbleCncptCdgSys());
		}
		/******************** Clm_Prcdr_PrcdrCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmPrcdrPrcdrCdbleCncptCdgUsrSltd() != null) {
			claimprocedureprocedurecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(c.getClmPrcdrPrcdrCdbleCncptCdgUsrSltd()));
		}
		/******************** Clm_Prcdr_PrcdrCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(c.getClmPrcdrPrcdrCdbleCncptCdgVrsn() != null) {
			claimprocedureprocedurecodeableconceptcoding.setVersion(c.getClmPrcdrPrcdrCdbleCncptCdgVrsn());
		}
		/******************** Clm_Prcdr_PrcdrCdbleCncpt_Txt ********************************************************************************/
		if(c.getClmPrcdrPrcdrCdbleCncptTxt() != null) {
			claimprocedureprocedurecodeableconcept.setText(c.getClmPrcdrPrcdrCdbleCncptTxt());
		}
		/******************** Clm_Prcdr_PrcdrRfrnc ********************************************************************************/
		if(c.getClmPrcdrPrcdrRfrnc() != null) {
			claimprocedure.setProcedure( new org.hl7.fhir.r4.model.Reference(c.getClmPrcdrPrcdrRfrnc()));
		}
		/******************** Clm_Prcdr_Sqnc ********************************************************************************/
		if(c.getClmPrcdrSqnc() != null) {
			claimprocedure.setSequence(Integer.parseInt(c.getClmPrcdrSqnc()));
		}
		/******************** claimproceduretype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimproceduretype =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimprocedure.addType(claimproceduretype);

		/******************** claimproceduretypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimproceduretypecoding =  new org.hl7.fhir.r4.model.Coding();
		claimproceduretype.addCoding(claimproceduretypecoding);

		/******************** Clm_Prcdr_Typ_Cdg_Cd ********************************************************************************/
		if(c.getClmPrcdrTypCdgCd() != null) {
			claimproceduretypecoding.setCode(c.getClmPrcdrTypCdgCd());
		}
		/******************** Clm_Prcdr_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getClmPrcdrTypCdgDsply() != null) {
			claimproceduretypecoding.setDisplay(c.getClmPrcdrTypCdgDsply());
		}
		/******************** Clm_Prcdr_Typ_Cdg_Sys ********************************************************************************/
		if(c.getClmPrcdrTypCdgSys() != null) {
			claimproceduretypecoding.setSystem(c.getClmPrcdrTypCdgSys());
		}
		/******************** Clm_Prcdr_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmPrcdrTypCdgUsrSltd() != null) {
			claimproceduretypecoding.setUserSelected(Boolean.parseBoolean(c.getClmPrcdrTypCdgUsrSltd()));
		}
		/******************** Clm_Prcdr_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getClmPrcdrTypCdgVrsn() != null) {
			claimproceduretypecoding.setVersion(c.getClmPrcdrTypCdgVrsn());
		}
		/******************** Clm_Prcdr_Typ_Txt ********************************************************************************/
		if(c.getClmPrcdrTypTxt() != null) {
			claimproceduretype.setText(c.getClmPrcdrTypTxt());
		}
		/******************** Clm_Prcdr_Udi ********************************************************************************/
		if(c.getClmPrcdrUdi() != null) {
			claimprocedure.addUdi( new org.hl7.fhir.r4.model.Reference(c.getClmPrcdrUdi()));
		}
		/******************** Clm_Provider ********************************************************************************/
		if(c.getClmProvider() != null) {
			claim.setProvider( new org.hl7.fhir.r4.model.Reference(c.getClmProvider()));
		}
		/******************** Clm_Referral ********************************************************************************/
		if(c.getClmReferral() != null) {
			claim.setReferral( new org.hl7.fhir.r4.model.Reference(c.getClmReferral()));
		}
		/******************** claimrelated ********************************************************************************/
		org.hl7.fhir.r4.model.Claim.RelatedClaimComponent claimrelated =  new org.hl7.fhir.r4.model.Claim.RelatedClaimComponent();
		claim.addRelated(claimrelated);

		/******************** Clm_Rlted_Clm ********************************************************************************/
		if(c.getClmRltedClm() != null) {
			claimrelated.setClaim( new org.hl7.fhir.r4.model.Reference(c.getClmRltedClm()));
		}
		/******************** claimrelatedreference ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier claimrelatedreference =  new org.hl7.fhir.r4.model.Identifier();
		claimrelated.setReference(claimrelatedreference);

		/******************** Clm_Rlted_Rfrnc_Assigner ********************************************************************************/
		if(c.getClmRltedRfrncAssigner() != null) {
			claimrelatedreference.setAssigner( new org.hl7.fhir.r4.model.Reference(c.getClmRltedRfrncAssigner()));
		}
		/******************** claimrelatedreferenceperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claimrelatedreferenceperiod =  new org.hl7.fhir.r4.model.Period();
		claimrelatedreference.setPeriod(claimrelatedreferenceperiod);

		/******************** Clm_Rlted_Rfrnc_Prd_End ********************************************************************************/
		if(c.getClmRltedRfrncPrdEnd() != null) {
			java.text.SimpleDateFormat Clm_Rlted_Rfrnc_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Clm_Rlted_Rfrnc_Prd_Enddate = Clm_Rlted_Rfrnc_Prd_Endsdf.parse(c.getClmRltedRfrncPrdEnd());
			claimrelatedreferenceperiod.setEnd(Clm_Rlted_Rfrnc_Prd_Enddate);
		}
		/******************** Clm_Rlted_Rfrnc_Prd_Strt ********************************************************************************/
		if(c.getClmRltedRfrncPrdStrt() != null) {
			java.text.SimpleDateFormat Clm_Rlted_Rfrnc_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Clm_Rlted_Rfrnc_Prd_Strtdate = Clm_Rlted_Rfrnc_Prd_Strtsdf.parse(c.getClmRltedRfrncPrdStrt());
			claimrelatedreferenceperiod.setStart(Clm_Rlted_Rfrnc_Prd_Strtdate);
		}
		/******************** Clm_Rlted_Rfrnc_Sys ********************************************************************************/
		if(c.getClmRltedRfrncSys() != null) {
			claimrelatedreference.setSystem(c.getClmRltedRfrncSys());
		}
		/******************** claimrelatedreferencetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimrelatedreferencetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimrelatedreference.setType(claimrelatedreferencetype);

		/******************** claimrelatedreferencetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimrelatedreferencetypecoding =  new org.hl7.fhir.r4.model.Coding();
		claimrelatedreferencetype.addCoding(claimrelatedreferencetypecoding);

		/******************** Clm_Rlted_Rfrnc_Typ_Cdg_Cd ********************************************************************************/
		if(c.getClmRltedRfrncTypCdgCd() != null) {
			claimrelatedreferencetypecoding.setCode(c.getClmRltedRfrncTypCdgCd());
		}
		/******************** Clm_Rlted_Rfrnc_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getClmRltedRfrncTypCdgDsply() != null) {
			claimrelatedreferencetypecoding.setDisplay(c.getClmRltedRfrncTypCdgDsply());
		}
		/******************** Clm_Rlted_Rfrnc_Typ_Cdg_Sys ********************************************************************************/
		if(c.getClmRltedRfrncTypCdgSys() != null) {
			claimrelatedreferencetypecoding.setSystem(c.getClmRltedRfrncTypCdgSys());
		}
		/******************** Clm_Rlted_Rfrnc_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRltedRfrncTypCdgUsrSltd() != null) {
			claimrelatedreferencetypecoding.setUserSelected(Boolean.parseBoolean(c.getClmRltedRfrncTypCdgUsrSltd()));
		}
		/******************** Clm_Rlted_Rfrnc_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRltedRfrncTypCdgVrsn() != null) {
			claimrelatedreferencetypecoding.setVersion(c.getClmRltedRfrncTypCdgVrsn());
		}
		/******************** Clm_Rlted_Rfrnc_Typ_Txt ********************************************************************************/
		if(c.getClmRltedRfrncTypTxt() != null) {
			claimrelatedreferencetype.setText(c.getClmRltedRfrncTypTxt());
		}
		/******************** claimrelatedreferenceuse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory claimrelatedreferenceuse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		claimrelatedreference.setUse(claimrelatedreferenceuse.fromCode(c.getClmRltedRfrncUse()));

		/******************** Clm_Rlted_Rfrnc_Vl ********************************************************************************/
		if(c.getClmRltedRfrncVl() != null) {
			claimrelatedreference.setValue(c.getClmRltedRfrncVl());
		}
		/******************** claimrelatedrelationship ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimrelatedrelationship =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimrelated.setRelationship(claimrelatedrelationship);

		/******************** claimrelatedrelationshipcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimrelatedrelationshipcoding =  new org.hl7.fhir.r4.model.Coding();
		claimrelatedrelationship.addCoding(claimrelatedrelationshipcoding);

		/******************** Clm_Rlted_Rltnship_Cdg_Cd ********************************************************************************/
		if(c.getClmRltedRltnshipCdgCd() != null) {
			claimrelatedrelationshipcoding.setCode(c.getClmRltedRltnshipCdgCd());
		}
		/******************** Clm_Rlted_Rltnship_Cdg_Dsply ********************************************************************************/
		if(c.getClmRltedRltnshipCdgDsply() != null) {
			claimrelatedrelationshipcoding.setDisplay(c.getClmRltedRltnshipCdgDsply());
		}
		/******************** Clm_Rlted_Rltnship_Cdg_Sys ********************************************************************************/
		if(c.getClmRltedRltnshipCdgSys() != null) {
			claimrelatedrelationshipcoding.setSystem(c.getClmRltedRltnshipCdgSys());
		}
		/******************** Clm_Rlted_Rltnship_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmRltedRltnshipCdgUsrSltd() != null) {
			claimrelatedrelationshipcoding.setUserSelected(Boolean.parseBoolean(c.getClmRltedRltnshipCdgUsrSltd()));
		}
		/******************** Clm_Rlted_Rltnship_Cdg_Vrsn ********************************************************************************/
		if(c.getClmRltedRltnshipCdgVrsn() != null) {
			claimrelatedrelationshipcoding.setVersion(c.getClmRltedRltnshipCdgVrsn());
		}
		/******************** Clm_Rlted_Rltnship_Txt ********************************************************************************/
		if(c.getClmRltedRltnshipTxt() != null) {
			claimrelatedrelationship.setText(c.getClmRltedRltnshipTxt());
		}
		/******************** claimstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Claim.ClaimStatusEnumFactory claimstatus =  new org.hl7.fhir.r4.model.Claim.ClaimStatusEnumFactory();
		claim.setStatus(claimstatus.fromCode(c.getClmSts()));

		/******************** claimsubtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimsubtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		claim.setSubType(claimsubtype);

		/******************** claimsubtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimsubtypecoding =  new org.hl7.fhir.r4.model.Coding();
		claimsubtype.addCoding(claimsubtypecoding);

		/******************** Clm_SubTyp_Cdg_Cd ********************************************************************************/
		if(c.getClmSubTypCdgCd() != null) {
			claimsubtypecoding.setCode(c.getClmSubTypCdgCd());
		}
		/******************** Clm_SubTyp_Cdg_Dsply ********************************************************************************/
		if(c.getClmSubTypCdgDsply() != null) {
			claimsubtypecoding.setDisplay(c.getClmSubTypCdgDsply());
		}
		/******************** Clm_SubTyp_Cdg_Sys ********************************************************************************/
		if(c.getClmSubTypCdgSys() != null) {
			claimsubtypecoding.setSystem(c.getClmSubTypCdgSys());
		}
		/******************** Clm_SubTyp_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmSubTypCdgUsrSltd() != null) {
			claimsubtypecoding.setUserSelected(Boolean.parseBoolean(c.getClmSubTypCdgUsrSltd()));
		}
		/******************** Clm_SubTyp_Cdg_Vrsn ********************************************************************************/
		if(c.getClmSubTypCdgVrsn() != null) {
			claimsubtypecoding.setVersion(c.getClmSubTypCdgVrsn());
		}
		/******************** Clm_SubTyp_Txt ********************************************************************************/
		if(c.getClmSubTypTxt() != null) {
			claimsubtype.setText(c.getClmSubTypTxt());
		}
		/******************** claimsupportinginfo ********************************************************************************/
		org.hl7.fhir.r4.model.Claim.SupportingInformationComponent claimsupportinginfo =  new org.hl7.fhir.r4.model.Claim.SupportingInformationComponent();
		claim.addSupportingInfo(claimsupportinginfo);

		/******************** claimsupportinginfocategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimsupportinginfocategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimsupportinginfo.setCategory(claimsupportinginfocategory);

		/******************** claimsupportinginfocategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimsupportinginfocategorycoding =  new org.hl7.fhir.r4.model.Coding();
		claimsupportinginfocategory.addCoding(claimsupportinginfocategorycoding);

		/******************** Clm_SprtingInfo_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getClmSprtingInfoCtgryCdgCd() != null) {
			claimsupportinginfocategorycoding.setCode(c.getClmSprtingInfoCtgryCdgCd());
		}
		/******************** Clm_SprtingInfo_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getClmSprtingInfoCtgryCdgDsply() != null) {
			claimsupportinginfocategorycoding.setDisplay(c.getClmSprtingInfoCtgryCdgDsply());
		}
		/******************** Clm_SprtingInfo_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getClmSprtingInfoCtgryCdgSys() != null) {
			claimsupportinginfocategorycoding.setSystem(c.getClmSprtingInfoCtgryCdgSys());
		}
		/******************** Clm_SprtingInfo_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmSprtingInfoCtgryCdgUsrSltd() != null) {
			claimsupportinginfocategorycoding.setUserSelected(Boolean.parseBoolean(c.getClmSprtingInfoCtgryCdgUsrSltd()));
		}
		/******************** Clm_SprtingInfo_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getClmSprtingInfoCtgryCdgVrsn() != null) {
			claimsupportinginfocategorycoding.setVersion(c.getClmSprtingInfoCtgryCdgVrsn());
		}
		/******************** Clm_SprtingInfo_Ctgry_Txt ********************************************************************************/
		if(c.getClmSprtingInfoCtgryTxt() != null) {
			claimsupportinginfocategory.setText(c.getClmSprtingInfoCtgryTxt());
		}
		/******************** claimsupportinginfocode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimsupportinginfocode =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimsupportinginfo.setCode(claimsupportinginfocode);

		/******************** claimsupportinginfocodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimsupportinginfocodecoding =  new org.hl7.fhir.r4.model.Coding();
		claimsupportinginfocode.addCoding(claimsupportinginfocodecoding);

		/******************** Clm_SprtingInfo_Cd_Cdg_Cd ********************************************************************************/
		if(c.getClmSprtingInfoCdCdgCd() != null) {
			claimsupportinginfocodecoding.setCode(c.getClmSprtingInfoCdCdgCd());
		}
		/******************** Clm_SprtingInfo_Cd_Cdg_Dsply ********************************************************************************/
		if(c.getClmSprtingInfoCdCdgDsply() != null) {
			claimsupportinginfocodecoding.setDisplay(c.getClmSprtingInfoCdCdgDsply());
		}
		/******************** Clm_SprtingInfo_Cd_Cdg_Sys ********************************************************************************/
		if(c.getClmSprtingInfoCdCdgSys() != null) {
			claimsupportinginfocodecoding.setSystem(c.getClmSprtingInfoCdCdgSys());
		}
		/******************** Clm_SprtingInfo_Cd_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmSprtingInfoCdCdgUsrSltd() != null) {
			claimsupportinginfocodecoding.setUserSelected(Boolean.parseBoolean(c.getClmSprtingInfoCdCdgUsrSltd()));
		}
		/******************** Clm_SprtingInfo_Cd_Cdg_Vrsn ********************************************************************************/
		if(c.getClmSprtingInfoCdCdgVrsn() != null) {
			claimsupportinginfocodecoding.setVersion(c.getClmSprtingInfoCdCdgVrsn());
		}
		/******************** Clm_SprtingInfo_Cd_Txt ********************************************************************************/
		if(c.getClmSprtingInfoCdTxt() != null) {
			claimsupportinginfocode.setText(c.getClmSprtingInfoCdTxt());
		}
		/******************** claimsupportinginforeason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimsupportinginforeason =  new org.hl7.fhir.r4.model.CodeableConcept();
		claimsupportinginfo.setReason(claimsupportinginforeason);

		/******************** claimsupportinginforeasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimsupportinginforeasoncoding =  new org.hl7.fhir.r4.model.Coding();
		claimsupportinginforeason.addCoding(claimsupportinginforeasoncoding);

		/******************** Clm_SprtingInfo_Rsn_Cdg_Cd ********************************************************************************/
		if(c.getClmSprtingInfoRsnCdgCd() != null) {
			claimsupportinginforeasoncoding.setCode(c.getClmSprtingInfoRsnCdgCd());
		}
		/******************** Clm_SprtingInfo_Rsn_Cdg_Dsply ********************************************************************************/
		if(c.getClmSprtingInfoRsnCdgDsply() != null) {
			claimsupportinginforeasoncoding.setDisplay(c.getClmSprtingInfoRsnCdgDsply());
		}
		/******************** Clm_SprtingInfo_Rsn_Cdg_Sys ********************************************************************************/
		if(c.getClmSprtingInfoRsnCdgSys() != null) {
			claimsupportinginforeasoncoding.setSystem(c.getClmSprtingInfoRsnCdgSys());
		}
		/******************** Clm_SprtingInfo_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmSprtingInfoRsnCdgUsrSltd() != null) {
			claimsupportinginforeasoncoding.setUserSelected(Boolean.parseBoolean(c.getClmSprtingInfoRsnCdgUsrSltd()));
		}
		/******************** Clm_SprtingInfo_Rsn_Cdg_Vrsn ********************************************************************************/
		if(c.getClmSprtingInfoRsnCdgVrsn() != null) {
			claimsupportinginforeasoncoding.setVersion(c.getClmSprtingInfoRsnCdgVrsn());
		}
		/******************** Clm_SprtingInfo_Rsn_Txt ********************************************************************************/
		if(c.getClmSprtingInfoRsnTxt() != null) {
			claimsupportinginforeason.setText(c.getClmSprtingInfoRsnTxt());
		}
		/******************** Clm_SprtingInfo_Sqnc ********************************************************************************/
		if(c.getClmSprtingInfoSqnc() != null) {
			claimsupportinginfo.setSequence(Integer.parseInt(c.getClmSprtingInfoSqnc()));
		}
		/******************** Clm_SprtingInfo_TmgDtTyp ********************************************************************************/
		if(c.getClmSprtingInfoTmgDtTyp() != null) {
			claimsupportinginfo.setTiming( new org.hl7.fhir.r4.model.DateType(c.getClmSprtingInfoTmgDtTyp()));
		}
		/******************** claimsupportinginfotimingperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period claimsupportinginfotimingperiod =  new org.hl7.fhir.r4.model.Period();
		claimsupportinginfo.setTiming(claimsupportinginfotimingperiod);

		/******************** Clm_SprtingInfo_TmgPrd_End ********************************************************************************/
		if(c.getClmSprtingInfoTmgPrdEnd() != null) {
			java.text.SimpleDateFormat Clm_SprtingInfo_TmgPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Clm_SprtingInfo_TmgPrd_Enddate = Clm_SprtingInfo_TmgPrd_Endsdf.parse(c.getClmSprtingInfoTmgPrdEnd());
			claimsupportinginfotimingperiod.setEnd(Clm_SprtingInfo_TmgPrd_Enddate);
		}
		/******************** Clm_SprtingInfo_TmgPrd_Strt ********************************************************************************/
		if(c.getClmSprtingInfoTmgPrdStrt() != null) {
			java.text.SimpleDateFormat Clm_SprtingInfo_TmgPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Clm_SprtingInfo_TmgPrd_Strtdate = Clm_SprtingInfo_TmgPrd_Strtsdf.parse(c.getClmSprtingInfoTmgPrdStrt());
			claimsupportinginfotimingperiod.setStart(Clm_SprtingInfo_TmgPrd_Strtdate);
		}
		/******************** claimsupportinginfovalueattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment claimsupportinginfovalueattachment =  new org.hl7.fhir.r4.model.Attachment();
		claimsupportinginfo.setValue(claimsupportinginfovalueattachment);

		/******************** Clm_SprtingInfo_VlAttchmnt_CntntTyp ********************************************************************************/
		if(c.getClmSprtingInfoVlAttchmntCntntTyp() != null) {
			claimsupportinginfovalueattachment.setContentType(c.getClmSprtingInfoVlAttchmntCntntTyp());
		}
		/******************** Clm_SprtingInfo_VlAttchmnt_Creation ********************************************************************************/
		if(c.getClmSprtingInfoVlAttchmntCreation() != null) {
			java.text.SimpleDateFormat Clm_SprtingInfo_VlAttchmnt_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Clm_SprtingInfo_VlAttchmnt_Creationdate = Clm_SprtingInfo_VlAttchmnt_Creationsdf.parse(c.getClmSprtingInfoVlAttchmntCreation());
			claimsupportinginfovalueattachment.setCreation(Clm_SprtingInfo_VlAttchmnt_Creationdate);
		}
		/******************** Clm_SprtingInfo_VlAttchmnt_Data ********************************************************************************/
		if(c.getClmSprtingInfoVlAttchmntData() != null) {
			claimsupportinginfovalueattachment.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(c.getClmSprtingInfoVlAttchmntData()));
		}
		/******************** Clm_SprtingInfo_VlAttchmnt_Hash ********************************************************************************/
		if(c.getClmSprtingInfoVlAttchmntHash() != null) {
			claimsupportinginfovalueattachment.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(c.getClmSprtingInfoVlAttchmntHash()));
		}
		/******************** Clm_SprtingInfo_VlAttchmnt_Lnguage ********************************************************************************/
		if(c.getClmSprtingInfoVlAttchmntLnguage() != null) {
			claimsupportinginfovalueattachment.setLanguage(c.getClmSprtingInfoVlAttchmntLnguage());
		}
		/******************** Clm_SprtingInfo_VlAttchmnt_Sz ********************************************************************************/
		if(c.getClmSprtingInfoVlAttchmntSz() != null) {
			claimsupportinginfovalueattachment.setSize(Integer.parseInt(c.getClmSprtingInfoVlAttchmntSz()));
		}
		/******************** Clm_SprtingInfo_VlAttchmnt_Ttl ********************************************************************************/
		if(c.getClmSprtingInfoVlAttchmntTtl() != null) {
			claimsupportinginfovalueattachment.setTitle(c.getClmSprtingInfoVlAttchmntTtl());
		}
		/******************** Clm_SprtingInfo_VlAttchmnt_Url ********************************************************************************/
		if(c.getClmSprtingInfoVlAttchmntUrl() != null) {
			claimsupportinginfovalueattachment.setUrl(c.getClmSprtingInfoVlAttchmntUrl());
		}
		/******************** Clm_SprtingInfo_VlBooleanTyp ********************************************************************************/
		if(c.getClmSprtingInfoVlBooleanTyp() != null) {
			claimsupportinginfo.setValue( new org.hl7.fhir.r4.model.BooleanType(c.getClmSprtingInfoVlBooleanTyp()));
		}
		/******************** claimsupportinginfovaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity claimsupportinginfovaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		claimsupportinginfo.setValue(claimsupportinginfovaluequantity);

		/******************** Clm_SprtingInfo_VlQnty_Cd ********************************************************************************/
		if(c.getClmSprtingInfoVlQntyCd() != null) {
			claimsupportinginfovaluequantity.setCode(c.getClmSprtingInfoVlQntyCd());
		}
		/******************** claimsupportinginfovaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory claimsupportinginfovaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		claimsupportinginfovaluequantity.setComparator(claimsupportinginfovaluequantitycomparator.fromCode(c.getClmSprtingInfoVlQntyCmprtr()));

		/******************** Clm_SprtingInfo_VlQnty_Sys ********************************************************************************/
		if(c.getClmSprtingInfoVlQntySys() != null) {
			claimsupportinginfovaluequantity.setSystem(c.getClmSprtingInfoVlQntySys());
		}
		/******************** Clm_SprtingInfo_VlQnty_Unt ********************************************************************************/
		if(c.getClmSprtingInfoVlQntyUnt() != null) {
			claimsupportinginfovaluequantity.setUnit(c.getClmSprtingInfoVlQntyUnt());
		}
		/******************** Clm_SprtingInfo_VlQnty_Vl ********************************************************************************/
		if(c.getClmSprtingInfoVlQntyVl() != null) {
			claimsupportinginfovaluequantity.setValue(Double.parseDouble((c.getClmSprtingInfoVlQntyVl())));
		}
		/******************** Clm_SprtingInfo_VlRfrnc ********************************************************************************/
		if(c.getClmSprtingInfoVlRfrnc() != null) {
			claimsupportinginfo.setValue( new org.hl7.fhir.r4.model.Reference(c.getClmSprtingInfoVlRfrnc()));
		}
		/******************** Clm_SprtingInfo_VlStrgTyp ********************************************************************************/
		if(c.getClmSprtingInfoVlStrgTyp() != null) {
			claimsupportinginfo.setValue( new org.hl7.fhir.r4.model.StringType(c.getClmSprtingInfoVlStrgTyp()));
		}
		/******************** claimtotal ********************************************************************************/
		org.hl7.fhir.r4.model.Money claimtotal =  new org.hl7.fhir.r4.model.Money();
		claim.setTotal(claimtotal);

		/******************** Clm_Total_Crncy ********************************************************************************/
		if(c.getClmTotalCrncy() != null) {
			claimtotal.setCurrency(c.getClmTotalCrncy());
		}
		/******************** Clm_Total_Vl ********************************************************************************/
		if(c.getClmTotalVl() != null) {
			claimtotal.setValue(Double.parseDouble((c.getClmTotalVl())));
		}
		/******************** claimtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept claimtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		claim.setType(claimtype);

		/******************** claimtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding claimtypecoding =  new org.hl7.fhir.r4.model.Coding();
		claimtype.addCoding(claimtypecoding);

		/******************** Clm_Typ_Cdg_Cd ********************************************************************************/
		if(c.getClmTypCdgCd() != null) {
			claimtypecoding.setCode(c.getClmTypCdgCd());
		}
		/******************** Clm_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getClmTypCdgDsply() != null) {
			claimtypecoding.setDisplay(c.getClmTypCdgDsply());
		}
		/******************** Clm_Typ_Cdg_Sys ********************************************************************************/
		if(c.getClmTypCdgSys() != null) {
			claimtypecoding.setSystem(c.getClmTypCdgSys());
		}
		/******************** Clm_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getClmTypCdgUsrSltd() != null) {
			claimtypecoding.setUserSelected(Boolean.parseBoolean(c.getClmTypCdgUsrSltd()));
		}
		/******************** Clm_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getClmTypCdgVrsn() != null) {
			claimtypecoding.setVersion(c.getClmTypCdgVrsn());
		}
		/******************** Clm_Typ_Txt ********************************************************************************/
		if(c.getClmTypTxt() != null) {
			claimtype.setText(c.getClmTypTxt());
		}
		/******************** claimuse ********************************************************************************/
		org.hl7.fhir.r4.model.Claim.UseEnumFactory claimuse =  new org.hl7.fhir.r4.model.Claim.UseEnumFactory();
		claim.setUse(claimuse.fromCode(c.getClmUse()));

		return claim;
	}
}
