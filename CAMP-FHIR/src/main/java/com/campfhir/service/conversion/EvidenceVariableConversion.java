package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.EvidenceVariable;
public class EvidenceVariableConversion 
{
	public org.hl7.fhir.r4.model.EvidenceVariable EvidenceVariables(EvidenceVariable e) throws ParseException
	{
		org.hl7.fhir.r4.model.EvidenceVariable evidencevariable = new org.hl7.fhir.r4.model.EvidenceVariable();

		/******************** id ********************************************************************************/
		evidencevariable.setId(e.getId());

		/******************** EvdnceVrble_ApprovalDt ********************************************************************************/
		if(e.getEvdnceVrbleApprovalDt() != null) {
			java.text.SimpleDateFormat EvdnceVrble_ApprovalDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvdnceVrble_ApprovalDtdate = EvdnceVrble_ApprovalDtsdf.parse(e.getEvdnceVrbleApprovalDt());
			evidencevariable.setApprovalDate(EvdnceVrble_ApprovalDtdate);
		}
		/******************** evidencevariableauthor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail evidencevariableauthor =  new org.hl7.fhir.r4.model.ContactDetail();
		evidencevariable.addAuthor(evidencevariableauthor);

		/******************** EvdnceVrble_Athr_Nm ********************************************************************************/
		if(e.getEvdnceVrbleAthrNm() != null) {
			evidencevariableauthor.setName(e.getEvdnceVrbleAthrNm());
		}
		/******************** evidencevariableauthortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint evidencevariableauthortelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		evidencevariableauthor.addTelecom(evidencevariableauthortelecom);

		/******************** evidencevariableauthortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencevariableauthortelecomperiod =  new org.hl7.fhir.r4.model.Period();
		evidencevariableauthortelecom.setPeriod(evidencevariableauthortelecomperiod);

		/******************** EvdnceVrble_Athr_Tlcm_Prd_End ********************************************************************************/
		if(e.getEvdnceVrbleAthrTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat EvdnceVrble_Athr_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvdnceVrble_Athr_Tlcm_Prd_Enddate = EvdnceVrble_Athr_Tlcm_Prd_Endsdf.parse(e.getEvdnceVrbleAthrTlcmPrdEnd());
			evidencevariableauthortelecomperiod.setEnd(EvdnceVrble_Athr_Tlcm_Prd_Enddate);
		}
		/******************** EvdnceVrble_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEvdnceVrbleAthrTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat EvdnceVrble_Athr_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvdnceVrble_Athr_Tlcm_Prd_Strtdate = EvdnceVrble_Athr_Tlcm_Prd_Strtsdf.parse(e.getEvdnceVrbleAthrTlcmPrdStrt());
			evidencevariableauthortelecomperiod.setStart(EvdnceVrble_Athr_Tlcm_Prd_Strtdate);
		}
		/******************** EvdnceVrble_Athr_Tlcm_Rnk ********************************************************************************/
		if(e.getEvdnceVrbleAthrTlcmRnk() != null) {
			evidencevariableauthortelecom.setRank(Integer.parseInt(e.getEvdnceVrbleAthrTlcmRnk()));
		}
		/******************** evidencevariableauthortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory evidencevariableauthortelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		evidencevariableauthortelecom.setSystem(evidencevariableauthortelecomsystem.fromCode(e.getEvdnceVrbleAthrTlcmSys()));

		/******************** evidencevariableauthortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory evidencevariableauthortelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		evidencevariableauthortelecom.setUse(evidencevariableauthortelecomuse.fromCode(e.getEvdnceVrbleAthrTlcmUse()));

		/******************** EvdnceVrble_Athr_Tlcm_Vl ********************************************************************************/
		if(e.getEvdnceVrbleAthrTlcmVl() != null) {
			evidencevariableauthortelecom.setValue(e.getEvdnceVrbleAthrTlcmVl());
		}
		/******************** evidencevariablecharacteristic ********************************************************************************/
		org.hl7.fhir.r4.model.EvidenceVariable.EvidenceVariableCharacteristicComponent evidencevariablecharacteristic =  new org.hl7.fhir.r4.model.EvidenceVariable.EvidenceVariableCharacteristicComponent();
		evidencevariable.addCharacteristic(evidencevariablecharacteristic);

		/******************** EvdnceVrble_Crctrstc_DfnCanonicalTyp ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnCanonicalTyp() != null) {
			evidencevariablecharacteristic.setDefinition( new org.hl7.fhir.r4.model.CanonicalType(e.getEvdnceVrbleCrctrstcDfnCanonicalTyp()));
		}
		/******************** evidencevariablecharacteristicdefinitioncodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidencevariablecharacteristicdefinitioncodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		evidencevariablecharacteristic.setDefinition(evidencevariablecharacteristicdefinitioncodeableconcept);

		/******************** evidencevariablecharacteristicdefinitioncodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidencevariablecharacteristicdefinitioncodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		evidencevariablecharacteristicdefinitioncodeableconcept.addCoding(evidencevariablecharacteristicdefinitioncodeableconceptcoding);

		/******************** EvdnceVrble_Crctrstc_DfnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnCdbleCncptCdgCd() != null) {
			evidencevariablecharacteristicdefinitioncodeableconceptcoding.setCode(e.getEvdnceVrbleCrctrstcDfnCdbleCncptCdgCd());
		}
		/******************** EvdnceVrble_Crctrstc_DfnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnCdbleCncptCdgDsply() != null) {
			evidencevariablecharacteristicdefinitioncodeableconceptcoding.setDisplay(e.getEvdnceVrbleCrctrstcDfnCdbleCncptCdgDsply());
		}
		/******************** EvdnceVrble_Crctrstc_DfnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnCdbleCncptCdgSys() != null) {
			evidencevariablecharacteristicdefinitioncodeableconceptcoding.setSystem(e.getEvdnceVrbleCrctrstcDfnCdbleCncptCdgSys());
		}
		/******************** EvdnceVrble_Crctrstc_DfnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnCdbleCncptCdgUsrSltd() != null) {
			evidencevariablecharacteristicdefinitioncodeableconceptcoding.setUserSelected(Boolean.parseBoolean(e.getEvdnceVrbleCrctrstcDfnCdbleCncptCdgUsrSltd()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnCdbleCncptCdgVrsn() != null) {
			evidencevariablecharacteristicdefinitioncodeableconceptcoding.setVersion(e.getEvdnceVrbleCrctrstcDfnCdbleCncptCdgVrsn());
		}
		/******************** EvdnceVrble_Crctrstc_DfnCdbleCncpt_Txt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnCdbleCncptTxt() != null) {
			evidencevariablecharacteristicdefinitioncodeableconcept.setText(e.getEvdnceVrbleCrctrstcDfnCdbleCncptTxt());
		}
		/******************** evidencevariablecharacteristicdefinitiondatarequirement ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement evidencevariablecharacteristicdefinitiondatarequirement =  new org.hl7.fhir.r4.model.DataRequirement();
		evidencevariablecharacteristic.setDefinition(evidencevariablecharacteristicdefinitiondatarequirement);

		/******************** evidencevariablecharacteristicdefinitiondatarequirementcodefilter ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent evidencevariablecharacteristicdefinitiondatarequirementcodefilter =  new org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent();
		evidencevariablecharacteristicdefinitiondatarequirement.addCodeFilter(evidencevariablecharacteristicdefinitiondatarequirementcodefilter);

		/******************** evidencevariablecharacteristicdefinitiondatarequirementcodefiltercode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidencevariablecharacteristicdefinitiondatarequirementcodefiltercode =  new org.hl7.fhir.r4.model.Coding();
		evidencevariablecharacteristicdefinitiondatarequirementcodefilter.addCode(evidencevariablecharacteristicdefinitiondatarequirementcodefiltercode);

		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_CdFltr_Cd_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdCd() != null) {
			evidencevariablecharacteristicdefinitiondatarequirementcodefiltercode.setCode(e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdCd());
		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_CdFltr_Cd_Dsply ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdDsply() != null) {
			evidencevariablecharacteristicdefinitiondatarequirementcodefiltercode.setDisplay(e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdDsply());
		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_CdFltr_Cd_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdSys() != null) {
			evidencevariablecharacteristicdefinitiondatarequirementcodefiltercode.setSystem(e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdSys());
		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_CdFltr_Cd_UsrSltd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdUsrSltd() != null) {
			evidencevariablecharacteristicdefinitiondatarequirementcodefiltercode.setUserSelected(Boolean.parseBoolean(e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdUsrSltd()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_CdFltr_Cd_Vrsn ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdVrsn() != null) {
			evidencevariablecharacteristicdefinitiondatarequirementcodefiltercode.setVersion(e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrCdVrsn());
		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_CdFltr_Path ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrPath() != null) {
			evidencevariablecharacteristicdefinitiondatarequirementcodefilter.setPath(e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrPath());
		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_CdFltr_SrchParam ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrSrchParam() != null) {
			evidencevariablecharacteristicdefinitiondatarequirementcodefilter.setSearchParam(e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrSrchParam());
		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_CdFltr_VlSt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrVlSt() != null) {
			evidencevariablecharacteristicdefinitiondatarequirementcodefilter.setValueSet(e.getEvdnceVrbleCrctrstcDfnDataRqrmentCdFltrVlSt());
		}
		/******************** evidencevariablecharacteristicdefinitiondatarequirementdatefilter ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent evidencevariablecharacteristicdefinitiondatarequirementdatefilter =  new org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent();
		evidencevariablecharacteristicdefinitiondatarequirement.addDateFilter(evidencevariablecharacteristicdefinitiondatarequirementdatefilter);

		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_Path ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrPath() != null) {
			evidencevariablecharacteristicdefinitiondatarequirementdatefilter.setPath(e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrPath());
		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_SrchParam ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrSrchParam() != null) {
			evidencevariablecharacteristicdefinitiondatarequirementdatefilter.setSearchParam(e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrSrchParam());
		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_VlDtTimeTyp ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDtTimeTyp() != null) {
			evidencevariablecharacteristicdefinitiondatarequirementdatefilter.setValue( new org.hl7.fhir.r4.model.DateTimeType(e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlDtTimeTyp()));
		}
		/******************** evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueduration =  new org.hl7.fhir.r4.model.Duration();
		evidencevariablecharacteristicdefinitiondatarequirementdatefilter.setValue(evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueduration);

		/******************** evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueperiod =  new org.hl7.fhir.r4.model.Period();
		evidencevariablecharacteristicdefinitiondatarequirementdatefilter.setValue(evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueperiod);

		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_VlPrd_End ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlPrdEnd() != null) {
			java.text.SimpleDateFormat EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_VlPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_VlPrd_Enddate = EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_VlPrd_Endsdf.parse(e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlPrdEnd());
			evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueperiod.setEnd(EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_VlPrd_Enddate);
		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_VlPrd_Strt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlPrdStrt() != null) {
			java.text.SimpleDateFormat EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_VlPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_VlPrd_Strtdate = EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_VlPrd_Strtsdf.parse(e.getEvdnceVrbleCrctrstcDfnDataRqrmentDtFltrVlPrdStrt());
			evidencevariablecharacteristicdefinitiondatarequirementdatefiltervalueperiod.setStart(EvdnceVrble_Crctrstc_DfnDataRqrment_DtFltr_VlPrd_Strtdate);
		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_Lmt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentLmt() != null) {
			evidencevariablecharacteristicdefinitiondatarequirement.setLimit(Integer.parseInt(e.getEvdnceVrbleCrctrstcDfnDataRqrmentLmt()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_MustSupport ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentMustSupport() != null) {
			evidencevariablecharacteristicdefinitiondatarequirement.addMustSupport(e.getEvdnceVrbleCrctrstcDfnDataRqrmentMustSupport());
		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_Profile ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentProfile() != null) {
			evidencevariablecharacteristicdefinitiondatarequirement.addProfile(e.getEvdnceVrbleCrctrstcDfnDataRqrmentProfile());
		}
		/******************** evidencevariablecharacteristicdefinitiondatarequirementsort ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent evidencevariablecharacteristicdefinitiondatarequirementsort =  new org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent();
		evidencevariablecharacteristicdefinitiondatarequirement.addSort(evidencevariablecharacteristicdefinitiondatarequirementsort);

		/******************** evidencevariablecharacteristicdefinitiondatarequirementsortdirection ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.SortDirectionEnumFactory evidencevariablecharacteristicdefinitiondatarequirementsortdirection =  new org.hl7.fhir.r4.model.DataRequirement.SortDirectionEnumFactory();
		evidencevariablecharacteristicdefinitiondatarequirementsort.setDirection(evidencevariablecharacteristicdefinitiondatarequirementsortdirection.fromCode(e.getEvdnceVrbleCrctrstcDfnDataRqrmentSortDirection()));

		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_Sort_Path ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentSortPath() != null) {
			evidencevariablecharacteristicdefinitiondatarequirementsort.setPath(e.getEvdnceVrbleCrctrstcDfnDataRqrmentSortPath());
		}
		/******************** evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		evidencevariablecharacteristicdefinitiondatarequirement.setSubject(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconcept);

		/******************** evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconcept.addCoding(evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding);

		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgCd() != null) {
			evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.setCode(e.getEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgCd());
		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgDsply() != null) {
			evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.setDisplay(e.getEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgDsply());
		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgSys() != null) {
			evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.setSystem(e.getEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgSys());
		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgUsrSltd() != null) {
			evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(e.getEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgUsrSltd()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgVrsn() != null) {
			evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.setVersion(e.getEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgVrsn());
		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptTxt() != null) {
			evidencevariablecharacteristicdefinitiondatarequirementsubjectcodeableconcept.setText(e.getEvdnceVrbleCrctrstcDfnDataRqrmentSbjctCdbleCncptTxt());
		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_SbjctRfrnc ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentSbjctRfrnc() != null) {
			evidencevariablecharacteristicdefinitiondatarequirement.setSubject( new org.hl7.fhir.r4.model.Reference(e.getEvdnceVrbleCrctrstcDfnDataRqrmentSbjctRfrnc()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnDataRqrment_Typ ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnDataRqrmentTyp() != null) {
			evidencevariablecharacteristicdefinitiondatarequirement.setType(e.getEvdnceVrbleCrctrstcDfnDataRqrmentTyp());
		}
		/******************** evidencevariablecharacteristicdefinitionexpression ********************************************************************************/
		org.hl7.fhir.r4.model.Expression evidencevariablecharacteristicdefinitionexpression =  new org.hl7.fhir.r4.model.Expression();
		evidencevariablecharacteristic.setDefinition(evidencevariablecharacteristicdefinitionexpression);

		/******************** EvdnceVrble_Crctrstc_DfnExprsn_Dscrptn ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnExprsnDscrptn() != null) {
			evidencevariablecharacteristicdefinitionexpression.setDescription(e.getEvdnceVrbleCrctrstcDfnExprsnDscrptn());
		}
		/******************** EvdnceVrble_Crctrstc_DfnExprsn_Exprsn ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnExprsnExprsn() != null) {
			evidencevariablecharacteristicdefinitionexpression.setExpression(e.getEvdnceVrbleCrctrstcDfnExprsnExprsn());
		}
		/******************** EvdnceVrble_Crctrstc_DfnExprsn_Lnguage ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnExprsnLnguage() != null) {
			evidencevariablecharacteristicdefinitionexpression.setLanguage(e.getEvdnceVrbleCrctrstcDfnExprsnLnguage());
		}
		/******************** EvdnceVrble_Crctrstc_DfnExprsn_Nm ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnExprsnNm() != null) {
			evidencevariablecharacteristicdefinitionexpression.setName(e.getEvdnceVrbleCrctrstcDfnExprsnNm());
		}
		/******************** EvdnceVrble_Crctrstc_DfnExprsn_Rfrnc ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnExprsnRfrnc() != null) {
			evidencevariablecharacteristicdefinitionexpression.setReference(e.getEvdnceVrbleCrctrstcDfnExprsnRfrnc());
		}
		/******************** EvdnceVrble_Crctrstc_DfnRfrnc ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnRfrnc() != null) {
			evidencevariablecharacteristic.setDefinition( new org.hl7.fhir.r4.model.Reference(e.getEvdnceVrbleCrctrstcDfnRfrnc()));
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinition ********************************************************************************/
		org.hl7.fhir.r4.model.TriggerDefinition evidencevariablecharacteristicdefinitiontriggerdefinition =  new org.hl7.fhir.r4.model.TriggerDefinition();
		evidencevariablecharacteristic.setDefinition(evidencevariablecharacteristicdefinitiontriggerdefinition);

		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitioncondition ********************************************************************************/
		org.hl7.fhir.r4.model.Expression evidencevariablecharacteristicdefinitiontriggerdefinitioncondition =  new org.hl7.fhir.r4.model.Expression();
		evidencevariablecharacteristicdefinitiontriggerdefinition.setCondition(evidencevariablecharacteristicdefinitiontriggerdefinitioncondition);

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Cndtn_Dscrptn ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnCndtnDscrptn() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitioncondition.setDescription(e.getEvdnceVrbleCrctrstcDfnTrgrDfnCndtnDscrptn());
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Cndtn_Exprsn ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnCndtnExprsn() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitioncondition.setExpression(e.getEvdnceVrbleCrctrstcDfnTrgrDfnCndtnExprsn());
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Cndtn_Lnguage ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnCndtnLnguage() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitioncondition.setLanguage(e.getEvdnceVrbleCrctrstcDfnTrgrDfnCndtnLnguage());
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Cndtn_Nm ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnCndtnNm() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitioncondition.setName(e.getEvdnceVrbleCrctrstcDfnTrgrDfnCndtnNm());
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Cndtn_Rfrnc ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnCndtnRfrnc() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitioncondition.setReference(e.getEvdnceVrbleCrctrstcDfnTrgrDfnCndtnRfrnc());
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiondata ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement evidencevariablecharacteristicdefinitiontriggerdefinitiondata =  new org.hl7.fhir.r4.model.DataRequirement();
		evidencevariablecharacteristicdefinitiontriggerdefinition.addData(evidencevariablecharacteristicdefinitiontriggerdefinitiondata);

		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefilter ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefilter =  new org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent();
		evidencevariablecharacteristicdefinitiontriggerdefinitiondata.addCodeFilter(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefilter);

		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercode =  new org.hl7.fhir.r4.model.Coding();
		evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefilter.addCode(evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercode);

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_CdFltr_Cd_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdCd() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercode.setCode(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdCd());
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_CdFltr_Cd_Dsply ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdDsply() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercode.setDisplay(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdDsply());
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_CdFltr_Cd_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdSys() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercode.setSystem(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdSys());
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_CdFltr_Cd_UsrSltd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdUsrSltd() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercode.setUserSelected(Boolean.parseBoolean(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdUsrSltd()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_CdFltr_Cd_Vrsn ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdVrsn() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefiltercode.setVersion(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrCdVrsn());
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_CdFltr_Path ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrPath() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefilter.setPath(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrPath());
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_CdFltr_SrchParam ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrSrchParam() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefilter.setSearchParam(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrSrchParam());
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_CdFltr_VlSt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrVlSt() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiondatacodefilter.setValueSet(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataCdFltrVlSt());
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilter ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilter =  new org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent();
		evidencevariablecharacteristicdefinitiontriggerdefinitiondata.addDateFilter(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilter);

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_Path ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrPath() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilter.setPath(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrPath());
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_SrchParam ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrSrchParam() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilter.setSearchParam(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrSrchParam());
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_VlDtTimeTyp ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDtTimeTyp() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilter.setValue( new org.hl7.fhir.r4.model.DateTimeType(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlDtTimeTyp()));
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueduration =  new org.hl7.fhir.r4.model.Duration();
		evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilter.setValue(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueduration);

		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueperiod =  new org.hl7.fhir.r4.model.Period();
		evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefilter.setValue(evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueperiod);

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_VlPrd_End ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlPrdEnd() != null) {
			java.text.SimpleDateFormat EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_VlPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_VlPrd_Enddate = EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_VlPrd_Endsdf.parse(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlPrdEnd());
			evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueperiod.setEnd(EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_VlPrd_Enddate);
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_VlPrd_Strt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlPrdStrt() != null) {
			java.text.SimpleDateFormat EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_VlPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_VlPrd_Strtdate = EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_VlPrd_Strtsdf.parse(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataDtFltrVlPrdStrt());
			evidencevariablecharacteristicdefinitiontriggerdefinitiondatadatefiltervalueperiod.setStart(EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_DtFltr_VlPrd_Strtdate);
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_Lmt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataLmt() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiondata.setLimit(Integer.parseInt(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataLmt()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_MustSupport ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataMustSupport() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiondata.addMustSupport(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataMustSupport());
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_Profile ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataProfile() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiondata.addProfile(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataProfile());
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiondatasort ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent evidencevariablecharacteristicdefinitiontriggerdefinitiondatasort =  new org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent();
		evidencevariablecharacteristicdefinitiontriggerdefinitiondata.addSort(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasort);

		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiondatasortdirection ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.SortDirectionEnumFactory evidencevariablecharacteristicdefinitiontriggerdefinitiondatasortdirection =  new org.hl7.fhir.r4.model.DataRequirement.SortDirectionEnumFactory();
		evidencevariablecharacteristicdefinitiontriggerdefinitiondatasort.setDirection(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasortdirection.fromCode(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSortDirection()));

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_Sort_Path ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSortPath() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiondatasort.setPath(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSortPath());
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		evidencevariablecharacteristicdefinitiontriggerdefinitiondata.setSubject(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconcept);

		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconcept.addCoding(evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcoding);

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgCd() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcoding.setCode(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgCd());
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgDsply() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcoding.setDisplay(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgDsply());
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgSys() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcoding.setSystem(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgSys());
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgUsrSltd() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgUsrSltd()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgVrsn() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconceptcoding.setVersion(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptCdgVrsn());
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptTxt() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiondatasubjectcodeableconcept.setText(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctCdbleCncptTxt());
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_SbjctRfrnc ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctRfrnc() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiondata.setSubject( new org.hl7.fhir.r4.model.Reference(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataSbjctRfrnc()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Data_Typ ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataTyp() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiondata.setType(e.getEvdnceVrbleCrctrstcDfnTrgrDfnDataTyp());
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_Nm ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnNm() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinition.setName(e.getEvdnceVrbleCrctrstcDfnTrgrDfnNm());
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgDtTimeTyp ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgDtTimeTyp() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinition.setTiming( new org.hl7.fhir.r4.model.DateTimeType(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgDtTimeTyp()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgDtTyp ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgDtTyp() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinition.setTiming( new org.hl7.fhir.r4.model.DateType(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgDtTyp()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgRfrnc ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgRfrnc() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinition.setTiming( new org.hl7.fhir.r4.model.Reference(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgRfrnc()));
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtiming =  new org.hl7.fhir.r4.model.Timing();
		evidencevariablecharacteristicdefinitiontriggerdefinition.setTiming(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtiming);

		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtiming.setCode(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcode);

		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecoding =  new org.hl7.fhir.r4.model.Coding();
		evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcode.addCoding(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecoding);

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Cd_Cdg_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgCd() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecoding.setCode(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgCd());
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgDsply() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecoding.setDisplay(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgDsply());
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Cd_Cdg_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgSys() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecoding.setSystem(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgSys());
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgUsrSltd() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecoding.setUserSelected(Boolean.parseBoolean(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgUsrSltd()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgVrsn() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcodecoding.setVersion(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdCdgVrsn());
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Cd_Txt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdTxt() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingcode.setText(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgCdTxt());
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Evnt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgEvnt() != null) {
			java.text.SimpleDateFormat EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Evntsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Evntdate = EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Evntsdf.parse(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgEvnt());
			evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtiming.addEvent(EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Evntdate);
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat =  new org.hl7.fhir.r4.model.Timing.TimingRepeatComponent();
		evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtiming.setRepeat(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat);

		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsduration =  new org.hl7.fhir.r4.model.Duration();
		evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.setBounds(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsduration);

		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsperiod =  new org.hl7.fhir.r4.model.Period();
		evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.setBounds(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsperiod);

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsPrdEnd() != null) {
			java.text.SimpleDateFormat EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsPrd_Enddate = EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsPrd_Endsdf.parse(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsPrdEnd());
			evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsperiod.setEnd(EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsPrd_Enddate);
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsPrdStrt() != null) {
			java.text.SimpleDateFormat EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsPrd_Strtdate = EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsPrd_Strtsdf.parse(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsPrdStrt());
			evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsperiod.setStart(EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsPrd_Strtdate);
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrange =  new org.hl7.fhir.r4.model.Range();
		evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.setBounds(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrange);

		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrange.setHigh(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehigh);

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngHiCd() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehigh.setCode(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngHiCd());
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehigh.setComparator(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehighcomparator.fromCode(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngHiCmprtr()));

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngHiSys() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehigh.setSystem(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngHiSys());
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngHiUnt() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehigh.setUnit(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngHiUnt());
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngHiVl() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangehigh.setValue(Double.parseDouble((e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngHiVl())));
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelow =  new org.hl7.fhir.r4.model.Quantity();
		evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrange.setLow(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelow);

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngLwCd() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelow.setCode(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngLwCd());
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelow.setComparator(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelowcomparator.fromCode(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngLwCmprtr()));

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngLwSys() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelow.setSystem(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngLwSys());
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngLwUnt() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelow.setUnit(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngLwUnt());
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngLwVl() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatboundsrangelow.setValue(Double.parseDouble((e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptBndsRngLwVl())));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_Cnt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptCnt() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.setCount(Integer.parseInt(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptCnt()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_CntMx ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptCntMx() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.setCountMax(Integer.parseInt(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptCntMx()));
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatdayofweek ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatdayofweek =  new org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory();
		evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.addDayOfWeek(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatdayofweek.fromCode(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptDayOfWeek()));

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_Duration ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptDuration() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.setDuration(Double.parseDouble((e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptDuration())));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_DurationMx ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptDurationMx() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.setDurationMax(Double.parseDouble((e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptDurationMx())));
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatdurationunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.setDurationUnit(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatdurationunit.fromCode(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptDurationUnt()));

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_Frqncy ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptFrqncy() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.setFrequency(Integer.parseInt(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptFrqncy()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_FrqncyMx ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptFrqncyMx() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.setFrequencyMax(Integer.parseInt(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptFrqncyMx()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_Off ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptOff() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.setOffset(Integer.parseInt(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptOff()));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_Prd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptPrd() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.setPeriod(Double.parseDouble((e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptPrd())));
		}
		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_PrdMx ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptPrdMx() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.setPeriodMax(Double.parseDouble((e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptPrdMx())));
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatperiodunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.setPeriodUnit(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatperiodunit.fromCode(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptPrdUnt()));

		/******************** EvdnceVrble_Crctrstc_DfnTrgrDfn_TmgTmg_Rpt_TimeOfDay ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptTimeOfDay() != null) {
			evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.addTimeOfDay(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptTimeOfDay());
		}
		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatwhen ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatwhen =  new org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory();
		evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeat.addWhen(evidencevariablecharacteristicdefinitiontriggerdefinitiontimingtimingrepeatwhen.fromCode(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTmgTmgRptWhen()));

		/******************** evidencevariablecharacteristicdefinitiontriggerdefinitiontype ********************************************************************************/
		org.hl7.fhir.r4.model.TriggerDefinition.TriggerTypeEnumFactory evidencevariablecharacteristicdefinitiontriggerdefinitiontype =  new org.hl7.fhir.r4.model.TriggerDefinition.TriggerTypeEnumFactory();
		evidencevariablecharacteristicdefinitiontriggerdefinition.setType(evidencevariablecharacteristicdefinitiontriggerdefinitiontype.fromCode(e.getEvdnceVrbleCrctrstcDfnTrgrDfnTyp()));

		/******************** EvdnceVrble_Crctrstc_Dscrptn ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcDscrptn() != null) {
			evidencevariablecharacteristic.setDescription(e.getEvdnceVrbleCrctrstcDscrptn());
		}
		/******************** EvdnceVrble_Crctrstc_Exclude ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcExclude() != null) {
			evidencevariablecharacteristic.setExclude(Boolean.parseBoolean(e.getEvdnceVrbleCrctrstcExclude()));
		}
		/******************** evidencevariablecharacteristicgroupmeasure ********************************************************************************/
		org.hl7.fhir.r4.model.EvidenceVariable.GroupMeasureEnumFactory evidencevariablecharacteristicgroupmeasure =  new org.hl7.fhir.r4.model.EvidenceVariable.GroupMeasureEnumFactory();
		evidencevariablecharacteristic.setGroupMeasure(evidencevariablecharacteristicgroupmeasure.fromCode(e.getEvdnceVrbleCrctrstcGrpMsr()));

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveDtTimeTyp ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveDtTimeTyp() != null) {
			evidencevariablecharacteristic.setParticipantEffective( new org.hl7.fhir.r4.model.DateTimeType(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveDtTimeTyp()));
		}
		/******************** evidencevariablecharacteristicparticipanteffectiveduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration evidencevariablecharacteristicparticipanteffectiveduration =  new org.hl7.fhir.r4.model.Duration();
		evidencevariablecharacteristic.setParticipantEffective(evidencevariablecharacteristicparticipanteffectiveduration);

		/******************** evidencevariablecharacteristicparticipanteffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencevariablecharacteristicparticipanteffectiveperiod =  new org.hl7.fhir.r4.model.Period();
		evidencevariablecharacteristic.setParticipantEffective(evidencevariablecharacteristicparticipanteffectiveperiod);

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctivePrd_End ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctivePrdEnd() != null) {
			java.text.SimpleDateFormat EvdnceVrble_Crctrstc_PrtcpntEfctivePrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvdnceVrble_Crctrstc_PrtcpntEfctivePrd_Enddate = EvdnceVrble_Crctrstc_PrtcpntEfctivePrd_Endsdf.parse(e.getEvdnceVrbleCrctrstcPrtcpntEfctivePrdEnd());
			evidencevariablecharacteristicparticipanteffectiveperiod.setEnd(EvdnceVrble_Crctrstc_PrtcpntEfctivePrd_Enddate);
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctivePrd_Strt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctivePrdStrt() != null) {
			java.text.SimpleDateFormat EvdnceVrble_Crctrstc_PrtcpntEfctivePrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvdnceVrble_Crctrstc_PrtcpntEfctivePrd_Strtdate = EvdnceVrble_Crctrstc_PrtcpntEfctivePrd_Strtsdf.parse(e.getEvdnceVrbleCrctrstcPrtcpntEfctivePrdStrt());
			evidencevariablecharacteristicparticipanteffectiveperiod.setStart(EvdnceVrble_Crctrstc_PrtcpntEfctivePrd_Strtdate);
		}
		/******************** evidencevariablecharacteristicparticipanteffectivetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing evidencevariablecharacteristicparticipanteffectivetiming =  new org.hl7.fhir.r4.model.Timing();
		evidencevariablecharacteristic.setParticipantEffective(evidencevariablecharacteristicparticipanteffectivetiming);

		/******************** evidencevariablecharacteristicparticipanteffectivetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidencevariablecharacteristicparticipanteffectivetimingcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		evidencevariablecharacteristicparticipanteffectivetiming.setCode(evidencevariablecharacteristicparticipanteffectivetimingcode);

		/******************** evidencevariablecharacteristicparticipanteffectivetimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidencevariablecharacteristicparticipanteffectivetimingcodecoding =  new org.hl7.fhir.r4.model.Coding();
		evidencevariablecharacteristicparticipanteffectivetimingcode.addCoding(evidencevariablecharacteristicparticipanteffectivetimingcodecoding);

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgCd() != null) {
			evidencevariablecharacteristicparticipanteffectivetimingcodecoding.setCode(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgCd());
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgDsply() != null) {
			evidencevariablecharacteristicparticipanteffectivetimingcodecoding.setDisplay(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgDsply());
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgSys() != null) {
			evidencevariablecharacteristicparticipanteffectivetimingcodecoding.setSystem(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgSys());
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgUsrSltd() != null) {
			evidencevariablecharacteristicparticipanteffectivetimingcodecoding.setUserSelected(Boolean.parseBoolean(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgUsrSltd()));
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgVrsn() != null) {
			evidencevariablecharacteristicparticipanteffectivetimingcodecoding.setVersion(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdCdgVrsn());
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Cd_Txt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdTxt() != null) {
			evidencevariablecharacteristicparticipanteffectivetimingcode.setText(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgCdTxt());
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Evnt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgEvnt() != null) {
			java.text.SimpleDateFormat EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Evntsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Evntdate = EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Evntsdf.parse(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgEvnt());
			evidencevariablecharacteristicparticipanteffectivetiming.addEvent(EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Evntdate);
		}
		/******************** evidencevariablecharacteristicparticipanteffectivetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent evidencevariablecharacteristicparticipanteffectivetimingrepeat =  new org.hl7.fhir.r4.model.Timing.TimingRepeatComponent();
		evidencevariablecharacteristicparticipanteffectivetiming.setRepeat(evidencevariablecharacteristicparticipanteffectivetimingrepeat);

		/******************** evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsduration =  new org.hl7.fhir.r4.model.Duration();
		evidencevariablecharacteristicparticipanteffectivetimingrepeat.setBounds(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsduration);

		/******************** evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsperiod =  new org.hl7.fhir.r4.model.Period();
		evidencevariablecharacteristicparticipanteffectivetimingrepeat.setBounds(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsperiod);

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsPrdEnd() != null) {
			java.text.SimpleDateFormat EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsPrd_Enddate = EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsPrd_Endsdf.parse(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsPrdEnd());
			evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsperiod.setEnd(EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsPrd_Enddate);
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsPrdStrt() != null) {
			java.text.SimpleDateFormat EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsPrd_Strtdate = EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsPrd_Strtsdf.parse(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsPrdStrt());
			evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsperiod.setStart(EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsPrd_Strtdate);
		}
		/******************** evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrange =  new org.hl7.fhir.r4.model.Range();
		evidencevariablecharacteristicparticipanteffectivetimingrepeat.setBounds(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrange);

		/******************** evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrange.setHigh(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehigh);

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiCd() != null) {
			evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehigh.setCode(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiCd());
		}
		/******************** evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehigh.setComparator(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehighcomparator.fromCode(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiCmprtr()));

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiSys() != null) {
			evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehigh.setSystem(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiSys());
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiUnt() != null) {
			evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehigh.setUnit(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiUnt());
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiVl() != null) {
			evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangehigh.setValue(Double.parseDouble((e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngHiVl())));
		}
		/******************** evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelow =  new org.hl7.fhir.r4.model.Quantity();
		evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrange.setLow(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelow);

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwCd() != null) {
			evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelow.setCode(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwCd());
		}
		/******************** evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelow.setComparator(evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelowcomparator.fromCode(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwCmprtr()));

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwSys() != null) {
			evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelow.setSystem(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwSys());
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwUnt() != null) {
			evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelow.setUnit(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwUnt());
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwVl() != null) {
			evidencevariablecharacteristicparticipanteffectivetimingrepeatboundsrangelow.setValue(Double.parseDouble((e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptBndsRngLwVl())));
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_Cnt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptCnt() != null) {
			evidencevariablecharacteristicparticipanteffectivetimingrepeat.setCount(Integer.parseInt(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptCnt()));
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_CntMx ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptCntMx() != null) {
			evidencevariablecharacteristicparticipanteffectivetimingrepeat.setCountMax(Integer.parseInt(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptCntMx()));
		}
		/******************** evidencevariablecharacteristicparticipanteffectivetimingrepeatdayofweek ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory evidencevariablecharacteristicparticipanteffectivetimingrepeatdayofweek =  new org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory();
		evidencevariablecharacteristicparticipanteffectivetimingrepeat.addDayOfWeek(evidencevariablecharacteristicparticipanteffectivetimingrepeatdayofweek.fromCode(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptDayOfWeek()));

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_Duration ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptDuration() != null) {
			evidencevariablecharacteristicparticipanteffectivetimingrepeat.setDuration(Double.parseDouble((e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptDuration())));
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_DurationMx ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptDurationMx() != null) {
			evidencevariablecharacteristicparticipanteffectivetimingrepeat.setDurationMax(Double.parseDouble((e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptDurationMx())));
		}
		/******************** evidencevariablecharacteristicparticipanteffectivetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory evidencevariablecharacteristicparticipanteffectivetimingrepeatdurationunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		evidencevariablecharacteristicparticipanteffectivetimingrepeat.setDurationUnit(evidencevariablecharacteristicparticipanteffectivetimingrepeatdurationunit.fromCode(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptDurationUnt()));

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_Frqncy ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptFrqncy() != null) {
			evidencevariablecharacteristicparticipanteffectivetimingrepeat.setFrequency(Integer.parseInt(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptFrqncy()));
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_FrqncyMx ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptFrqncyMx() != null) {
			evidencevariablecharacteristicparticipanteffectivetimingrepeat.setFrequencyMax(Integer.parseInt(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptFrqncyMx()));
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_Off ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptOff() != null) {
			evidencevariablecharacteristicparticipanteffectivetimingrepeat.setOffset(Integer.parseInt(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptOff()));
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_Prd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptPrd() != null) {
			evidencevariablecharacteristicparticipanteffectivetimingrepeat.setPeriod(Double.parseDouble((e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptPrd())));
		}
		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_PrdMx ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptPrdMx() != null) {
			evidencevariablecharacteristicparticipanteffectivetimingrepeat.setPeriodMax(Double.parseDouble((e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptPrdMx())));
		}
		/******************** evidencevariablecharacteristicparticipanteffectivetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory evidencevariablecharacteristicparticipanteffectivetimingrepeatperiodunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		evidencevariablecharacteristicparticipanteffectivetimingrepeat.setPeriodUnit(evidencevariablecharacteristicparticipanteffectivetimingrepeatperiodunit.fromCode(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptPrdUnt()));

		/******************** EvdnceVrble_Crctrstc_PrtcpntEfctiveTmg_Rpt_TimeOfDay ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptTimeOfDay() != null) {
			evidencevariablecharacteristicparticipanteffectivetimingrepeat.addTimeOfDay(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptTimeOfDay());
		}
		/******************** evidencevariablecharacteristicparticipanteffectivetimingrepeatwhen ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory evidencevariablecharacteristicparticipanteffectivetimingrepeatwhen =  new org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory();
		evidencevariablecharacteristicparticipanteffectivetimingrepeat.addWhen(evidencevariablecharacteristicparticipanteffectivetimingrepeatwhen.fromCode(e.getEvdnceVrbleCrctrstcPrtcpntEfctiveTmgRptWhen()));

		/******************** evidencevariablecharacteristictimefromstart ********************************************************************************/
		org.hl7.fhir.r4.model.Duration evidencevariablecharacteristictimefromstart =  new org.hl7.fhir.r4.model.Duration();
		evidencevariablecharacteristic.setTimeFromStart(evidencevariablecharacteristictimefromstart);

		/******************** evidencevariablecharacteristicusagecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext evidencevariablecharacteristicusagecontext =  new org.hl7.fhir.r4.model.UsageContext();
		evidencevariablecharacteristic.addUsageContext(evidencevariablecharacteristicusagecontext);

		/******************** evidencevariablecharacteristicusagecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidencevariablecharacteristicusagecontextcode =  new org.hl7.fhir.r4.model.Coding();
		evidencevariablecharacteristicusagecontext.setCode(evidencevariablecharacteristicusagecontextcode);

		/******************** EvdnceVrble_Crctrstc_UsgCntxt_Cd_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtCdCd() != null) {
			evidencevariablecharacteristicusagecontextcode.setCode(e.getEvdnceVrbleCrctrstcUsgCntxtCdCd());
		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_Cd_Dsply ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtCdDsply() != null) {
			evidencevariablecharacteristicusagecontextcode.setDisplay(e.getEvdnceVrbleCrctrstcUsgCntxtCdDsply());
		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_Cd_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtCdSys() != null) {
			evidencevariablecharacteristicusagecontextcode.setSystem(e.getEvdnceVrbleCrctrstcUsgCntxtCdSys());
		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_Cd_UsrSltd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtCdUsrSltd() != null) {
			evidencevariablecharacteristicusagecontextcode.setUserSelected(Boolean.parseBoolean(e.getEvdnceVrbleCrctrstcUsgCntxtCdUsrSltd()));
		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_Cd_Vrsn ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtCdVrsn() != null) {
			evidencevariablecharacteristicusagecontextcode.setVersion(e.getEvdnceVrbleCrctrstcUsgCntxtCdVrsn());
		}
		/******************** evidencevariablecharacteristicusagecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidencevariablecharacteristicusagecontextvaluecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		evidencevariablecharacteristicusagecontext.setValue(evidencevariablecharacteristicusagecontextvaluecodeableconcept);

		/******************** evidencevariablecharacteristicusagecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidencevariablecharacteristicusagecontextvaluecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		evidencevariablecharacteristicusagecontextvaluecodeableconcept.addCoding(evidencevariablecharacteristicusagecontextvaluecodeableconceptcoding);

		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgCd() != null) {
			evidencevariablecharacteristicusagecontextvaluecodeableconceptcoding.setCode(e.getEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgCd());
		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgDsply() != null) {
			evidencevariablecharacteristicusagecontextvaluecodeableconceptcoding.setDisplay(e.getEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgDsply());
		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgSys() != null) {
			evidencevariablecharacteristicusagecontextvaluecodeableconceptcoding.setSystem(e.getEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgSys());
		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgUsrSltd() != null) {
			evidencevariablecharacteristicusagecontextvaluecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(e.getEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgUsrSltd()));
		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgVrsn() != null) {
			evidencevariablecharacteristicusagecontextvaluecodeableconceptcoding.setVersion(e.getEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptCdgVrsn());
		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptTxt() != null) {
			evidencevariablecharacteristicusagecontextvaluecodeableconcept.setText(e.getEvdnceVrbleCrctrstcUsgCntxtVlCdbleCncptTxt());
		}
		/******************** evidencevariablecharacteristicusagecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidencevariablecharacteristicusagecontextvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		evidencevariablecharacteristicusagecontext.setValue(evidencevariablecharacteristicusagecontextvaluequantity);

		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlQnty_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlQntyCd() != null) {
			evidencevariablecharacteristicusagecontextvaluequantity.setCode(e.getEvdnceVrbleCrctrstcUsgCntxtVlQntyCd());
		}
		/******************** evidencevariablecharacteristicusagecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory evidencevariablecharacteristicusagecontextvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		evidencevariablecharacteristicusagecontextvaluequantity.setComparator(evidencevariablecharacteristicusagecontextvaluequantitycomparator.fromCode(e.getEvdnceVrbleCrctrstcUsgCntxtVlQntyCmprtr()));

		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlQnty_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlQntySys() != null) {
			evidencevariablecharacteristicusagecontextvaluequantity.setSystem(e.getEvdnceVrbleCrctrstcUsgCntxtVlQntySys());
		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlQnty_Unt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlQntyUnt() != null) {
			evidencevariablecharacteristicusagecontextvaluequantity.setUnit(e.getEvdnceVrbleCrctrstcUsgCntxtVlQntyUnt());
		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlQnty_Vl ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlQntyVl() != null) {
			evidencevariablecharacteristicusagecontextvaluequantity.setValue(Double.parseDouble((e.getEvdnceVrbleCrctrstcUsgCntxtVlQntyVl())));
		}
		/******************** evidencevariablecharacteristicusagecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range evidencevariablecharacteristicusagecontextvaluerange =  new org.hl7.fhir.r4.model.Range();
		evidencevariablecharacteristicusagecontext.setValue(evidencevariablecharacteristicusagecontextvaluerange);

		/******************** evidencevariablecharacteristicusagecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidencevariablecharacteristicusagecontextvaluerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		evidencevariablecharacteristicusagecontextvaluerange.setHigh(evidencevariablecharacteristicusagecontextvaluerangehigh);

		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlRngHiCd() != null) {
			evidencevariablecharacteristicusagecontextvaluerangehigh.setCode(e.getEvdnceVrbleCrctrstcUsgCntxtVlRngHiCd());
		}
		/******************** evidencevariablecharacteristicusagecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory evidencevariablecharacteristicusagecontextvaluerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		evidencevariablecharacteristicusagecontextvaluerangehigh.setComparator(evidencevariablecharacteristicusagecontextvaluerangehighcomparator.fromCode(e.getEvdnceVrbleCrctrstcUsgCntxtVlRngHiCmprtr()));

		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlRngHiSys() != null) {
			evidencevariablecharacteristicusagecontextvaluerangehigh.setSystem(e.getEvdnceVrbleCrctrstcUsgCntxtVlRngHiSys());
		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlRngHiUnt() != null) {
			evidencevariablecharacteristicusagecontextvaluerangehigh.setUnit(e.getEvdnceVrbleCrctrstcUsgCntxtVlRngHiUnt());
		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlRngHiVl() != null) {
			evidencevariablecharacteristicusagecontextvaluerangehigh.setValue(Double.parseDouble((e.getEvdnceVrbleCrctrstcUsgCntxtVlRngHiVl())));
		}
		/******************** evidencevariablecharacteristicusagecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidencevariablecharacteristicusagecontextvaluerangelow =  new org.hl7.fhir.r4.model.Quantity();
		evidencevariablecharacteristicusagecontextvaluerange.setLow(evidencevariablecharacteristicusagecontextvaluerangelow);

		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlRngLwCd() != null) {
			evidencevariablecharacteristicusagecontextvaluerangelow.setCode(e.getEvdnceVrbleCrctrstcUsgCntxtVlRngLwCd());
		}
		/******************** evidencevariablecharacteristicusagecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory evidencevariablecharacteristicusagecontextvaluerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		evidencevariablecharacteristicusagecontextvaluerangelow.setComparator(evidencevariablecharacteristicusagecontextvaluerangelowcomparator.fromCode(e.getEvdnceVrbleCrctrstcUsgCntxtVlRngLwCmprtr()));

		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlRngLwSys() != null) {
			evidencevariablecharacteristicusagecontextvaluerangelow.setSystem(e.getEvdnceVrbleCrctrstcUsgCntxtVlRngLwSys());
		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlRngLwUnt() != null) {
			evidencevariablecharacteristicusagecontextvaluerangelow.setUnit(e.getEvdnceVrbleCrctrstcUsgCntxtVlRngLwUnt());
		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlRngLwVl() != null) {
			evidencevariablecharacteristicusagecontextvaluerangelow.setValue(Double.parseDouble((e.getEvdnceVrbleCrctrstcUsgCntxtVlRngLwVl())));
		}
		/******************** EvdnceVrble_Crctrstc_UsgCntxt_VlRfrnc ********************************************************************************/
		if(e.getEvdnceVrbleCrctrstcUsgCntxtVlRfrnc() != null) {
			evidencevariablecharacteristicusagecontext.setValue( new org.hl7.fhir.r4.model.Reference(e.getEvdnceVrbleCrctrstcUsgCntxtVlRfrnc()));
		}
		/******************** evidencevariablecontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail evidencevariablecontact =  new org.hl7.fhir.r4.model.ContactDetail();
		evidencevariable.addContact(evidencevariablecontact);

		/******************** EvdnceVrble_Cntct_Nm ********************************************************************************/
		if(e.getEvdnceVrbleCntctNm() != null) {
			evidencevariablecontact.setName(e.getEvdnceVrbleCntctNm());
		}
		/******************** evidencevariablecontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint evidencevariablecontacttelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		evidencevariablecontact.addTelecom(evidencevariablecontacttelecom);

		/******************** evidencevariablecontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencevariablecontacttelecomperiod =  new org.hl7.fhir.r4.model.Period();
		evidencevariablecontacttelecom.setPeriod(evidencevariablecontacttelecomperiod);

		/******************** EvdnceVrble_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(e.getEvdnceVrbleCntctTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat EvdnceVrble_Cntct_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvdnceVrble_Cntct_Tlcm_Prd_Enddate = EvdnceVrble_Cntct_Tlcm_Prd_Endsdf.parse(e.getEvdnceVrbleCntctTlcmPrdEnd());
			evidencevariablecontacttelecomperiod.setEnd(EvdnceVrble_Cntct_Tlcm_Prd_Enddate);
		}
		/******************** EvdnceVrble_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEvdnceVrbleCntctTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat EvdnceVrble_Cntct_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvdnceVrble_Cntct_Tlcm_Prd_Strtdate = EvdnceVrble_Cntct_Tlcm_Prd_Strtsdf.parse(e.getEvdnceVrbleCntctTlcmPrdStrt());
			evidencevariablecontacttelecomperiod.setStart(EvdnceVrble_Cntct_Tlcm_Prd_Strtdate);
		}
		/******************** EvdnceVrble_Cntct_Tlcm_Rnk ********************************************************************************/
		if(e.getEvdnceVrbleCntctTlcmRnk() != null) {
			evidencevariablecontacttelecom.setRank(Integer.parseInt(e.getEvdnceVrbleCntctTlcmRnk()));
		}
		/******************** evidencevariablecontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory evidencevariablecontacttelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		evidencevariablecontacttelecom.setSystem(evidencevariablecontacttelecomsystem.fromCode(e.getEvdnceVrbleCntctTlcmSys()));

		/******************** evidencevariablecontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory evidencevariablecontacttelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		evidencevariablecontacttelecom.setUse(evidencevariablecontacttelecomuse.fromCode(e.getEvdnceVrbleCntctTlcmUse()));

		/******************** EvdnceVrble_Cntct_Tlcm_Vl ********************************************************************************/
		if(e.getEvdnceVrbleCntctTlcmVl() != null) {
			evidencevariablecontacttelecom.setValue(e.getEvdnceVrbleCntctTlcmVl());
		}
		/******************** EvdnceVrble_Copyright ********************************************************************************/
		if(e.getEvdnceVrbleCopyright() != null) {
			evidencevariable.setCopyright(e.getEvdnceVrbleCopyright());
		}
		/******************** EvdnceVrble_Dt ********************************************************************************/
		if(e.getEvdnceVrbleDt() != null) {
			java.text.SimpleDateFormat EvdnceVrble_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvdnceVrble_Dtdate = EvdnceVrble_Dtsdf.parse(e.getEvdnceVrbleDt());
			evidencevariable.setDate(EvdnceVrble_Dtdate);
		}
		/******************** EvdnceVrble_Dscrptn ********************************************************************************/
		if(e.getEvdnceVrbleDscrptn() != null) {
			evidencevariable.setDescription(e.getEvdnceVrbleDscrptn());
		}
		/******************** evidencevariableeditor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail evidencevariableeditor =  new org.hl7.fhir.r4.model.ContactDetail();
		evidencevariable.addEditor(evidencevariableeditor);

		/******************** EvdnceVrble_Editor_Nm ********************************************************************************/
		if(e.getEvdnceVrbleEditorNm() != null) {
			evidencevariableeditor.setName(e.getEvdnceVrbleEditorNm());
		}
		/******************** evidencevariableeditortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint evidencevariableeditortelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		evidencevariableeditor.addTelecom(evidencevariableeditortelecom);

		/******************** evidencevariableeditortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencevariableeditortelecomperiod =  new org.hl7.fhir.r4.model.Period();
		evidencevariableeditortelecom.setPeriod(evidencevariableeditortelecomperiod);

		/******************** EvdnceVrble_Editor_Tlcm_Prd_End ********************************************************************************/
		if(e.getEvdnceVrbleEditorTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat EvdnceVrble_Editor_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvdnceVrble_Editor_Tlcm_Prd_Enddate = EvdnceVrble_Editor_Tlcm_Prd_Endsdf.parse(e.getEvdnceVrbleEditorTlcmPrdEnd());
			evidencevariableeditortelecomperiod.setEnd(EvdnceVrble_Editor_Tlcm_Prd_Enddate);
		}
		/******************** EvdnceVrble_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEvdnceVrbleEditorTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat EvdnceVrble_Editor_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvdnceVrble_Editor_Tlcm_Prd_Strtdate = EvdnceVrble_Editor_Tlcm_Prd_Strtsdf.parse(e.getEvdnceVrbleEditorTlcmPrdStrt());
			evidencevariableeditortelecomperiod.setStart(EvdnceVrble_Editor_Tlcm_Prd_Strtdate);
		}
		/******************** EvdnceVrble_Editor_Tlcm_Rnk ********************************************************************************/
		if(e.getEvdnceVrbleEditorTlcmRnk() != null) {
			evidencevariableeditortelecom.setRank(Integer.parseInt(e.getEvdnceVrbleEditorTlcmRnk()));
		}
		/******************** evidencevariableeditortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory evidencevariableeditortelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		evidencevariableeditortelecom.setSystem(evidencevariableeditortelecomsystem.fromCode(e.getEvdnceVrbleEditorTlcmSys()));

		/******************** evidencevariableeditortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory evidencevariableeditortelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		evidencevariableeditortelecom.setUse(evidencevariableeditortelecomuse.fromCode(e.getEvdnceVrbleEditorTlcmUse()));

		/******************** EvdnceVrble_Editor_Tlcm_Vl ********************************************************************************/
		if(e.getEvdnceVrbleEditorTlcmVl() != null) {
			evidencevariableeditortelecom.setValue(e.getEvdnceVrbleEditorTlcmVl());
		}
		/******************** evidencevariableeffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencevariableeffectiveperiod =  new org.hl7.fhir.r4.model.Period();
		evidencevariable.setEffectivePeriod(evidencevariableeffectiveperiod);

		/******************** EvdnceVrble_EfctivePrd_End ********************************************************************************/
		if(e.getEvdnceVrbleEfctivePrdEnd() != null) {
			java.text.SimpleDateFormat EvdnceVrble_EfctivePrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvdnceVrble_EfctivePrd_Enddate = EvdnceVrble_EfctivePrd_Endsdf.parse(e.getEvdnceVrbleEfctivePrdEnd());
			evidencevariableeffectiveperiod.setEnd(EvdnceVrble_EfctivePrd_Enddate);
		}
		/******************** EvdnceVrble_EfctivePrd_Strt ********************************************************************************/
		if(e.getEvdnceVrbleEfctivePrdStrt() != null) {
			java.text.SimpleDateFormat EvdnceVrble_EfctivePrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvdnceVrble_EfctivePrd_Strtdate = EvdnceVrble_EfctivePrd_Strtsdf.parse(e.getEvdnceVrbleEfctivePrdStrt());
			evidencevariableeffectiveperiod.setStart(EvdnceVrble_EfctivePrd_Strtdate);
		}
		/******************** evidencevariableendorser ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail evidencevariableendorser =  new org.hl7.fhir.r4.model.ContactDetail();
		evidencevariable.addEndorser(evidencevariableendorser);

		/******************** EvdnceVrble_Endsr_Nm ********************************************************************************/
		if(e.getEvdnceVrbleEndsrNm() != null) {
			evidencevariableendorser.setName(e.getEvdnceVrbleEndsrNm());
		}
		/******************** evidencevariableendorsertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint evidencevariableendorsertelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		evidencevariableendorser.addTelecom(evidencevariableendorsertelecom);

		/******************** evidencevariableendorsertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencevariableendorsertelecomperiod =  new org.hl7.fhir.r4.model.Period();
		evidencevariableendorsertelecom.setPeriod(evidencevariableendorsertelecomperiod);

		/******************** EvdnceVrble_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(e.getEvdnceVrbleEndsrTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat EvdnceVrble_Endsr_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvdnceVrble_Endsr_Tlcm_Prd_Enddate = EvdnceVrble_Endsr_Tlcm_Prd_Endsdf.parse(e.getEvdnceVrbleEndsrTlcmPrdEnd());
			evidencevariableendorsertelecomperiod.setEnd(EvdnceVrble_Endsr_Tlcm_Prd_Enddate);
		}
		/******************** EvdnceVrble_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEvdnceVrbleEndsrTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat EvdnceVrble_Endsr_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvdnceVrble_Endsr_Tlcm_Prd_Strtdate = EvdnceVrble_Endsr_Tlcm_Prd_Strtsdf.parse(e.getEvdnceVrbleEndsrTlcmPrdStrt());
			evidencevariableendorsertelecomperiod.setStart(EvdnceVrble_Endsr_Tlcm_Prd_Strtdate);
		}
		/******************** EvdnceVrble_Endsr_Tlcm_Rnk ********************************************************************************/
		if(e.getEvdnceVrbleEndsrTlcmRnk() != null) {
			evidencevariableendorsertelecom.setRank(Integer.parseInt(e.getEvdnceVrbleEndsrTlcmRnk()));
		}
		/******************** evidencevariableendorsertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory evidencevariableendorsertelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		evidencevariableendorsertelecom.setSystem(evidencevariableendorsertelecomsystem.fromCode(e.getEvdnceVrbleEndsrTlcmSys()));

		/******************** evidencevariableendorsertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory evidencevariableendorsertelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		evidencevariableendorsertelecom.setUse(evidencevariableendorsertelecomuse.fromCode(e.getEvdnceVrbleEndsrTlcmUse()));

		/******************** EvdnceVrble_Endsr_Tlcm_Vl ********************************************************************************/
		if(e.getEvdnceVrbleEndsrTlcmVl() != null) {
			evidencevariableendorsertelecom.setValue(e.getEvdnceVrbleEndsrTlcmVl());
		}
		/******************** evidencevariableidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier evidencevariableidentifier =  new org.hl7.fhir.r4.model.Identifier();
		evidencevariable.addIdentifier(evidencevariableidentifier);

		/******************** EvdnceVrble_Id_Assigner ********************************************************************************/
		if(e.getEvdnceVrbleIdAssigner() != null) {
			evidencevariableidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(e.getEvdnceVrbleIdAssigner()));
		}
		/******************** evidencevariableidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencevariableidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		evidencevariableidentifier.setPeriod(evidencevariableidentifierperiod);

		/******************** EvdnceVrble_Id_Prd_End ********************************************************************************/
		if(e.getEvdnceVrbleIdPrdEnd() != null) {
			java.text.SimpleDateFormat EvdnceVrble_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvdnceVrble_Id_Prd_Enddate = EvdnceVrble_Id_Prd_Endsdf.parse(e.getEvdnceVrbleIdPrdEnd());
			evidencevariableidentifierperiod.setEnd(EvdnceVrble_Id_Prd_Enddate);
		}
		/******************** EvdnceVrble_Id_Prd_Strt ********************************************************************************/
		if(e.getEvdnceVrbleIdPrdStrt() != null) {
			java.text.SimpleDateFormat EvdnceVrble_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvdnceVrble_Id_Prd_Strtdate = EvdnceVrble_Id_Prd_Strtsdf.parse(e.getEvdnceVrbleIdPrdStrt());
			evidencevariableidentifierperiod.setStart(EvdnceVrble_Id_Prd_Strtdate);
		}
		/******************** EvdnceVrble_Id_Sys ********************************************************************************/
		if(e.getEvdnceVrbleIdSys() != null) {
			evidencevariableidentifier.setSystem(e.getEvdnceVrbleIdSys());
		}
		/******************** evidencevariableidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidencevariableidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		evidencevariableidentifier.setType(evidencevariableidentifiertype);

		/******************** evidencevariableidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidencevariableidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		evidencevariableidentifiertype.addCoding(evidencevariableidentifiertypecoding);

		/******************** EvdnceVrble_Id_Typ_Cdg_Cd ********************************************************************************/
		if(e.getEvdnceVrbleIdTypCdgCd() != null) {
			evidencevariableidentifiertypecoding.setCode(e.getEvdnceVrbleIdTypCdgCd());
		}
		/******************** EvdnceVrble_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getEvdnceVrbleIdTypCdgDsply() != null) {
			evidencevariableidentifiertypecoding.setDisplay(e.getEvdnceVrbleIdTypCdgDsply());
		}
		/******************** EvdnceVrble_Id_Typ_Cdg_Sys ********************************************************************************/
		if(e.getEvdnceVrbleIdTypCdgSys() != null) {
			evidencevariableidentifiertypecoding.setSystem(e.getEvdnceVrbleIdTypCdgSys());
		}
		/******************** EvdnceVrble_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvdnceVrbleIdTypCdgUsrSltd() != null) {
			evidencevariableidentifiertypecoding.setUserSelected(Boolean.parseBoolean(e.getEvdnceVrbleIdTypCdgUsrSltd()));
		}
		/******************** EvdnceVrble_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getEvdnceVrbleIdTypCdgVrsn() != null) {
			evidencevariableidentifiertypecoding.setVersion(e.getEvdnceVrbleIdTypCdgVrsn());
		}
		/******************** EvdnceVrble_Id_Typ_Txt ********************************************************************************/
		if(e.getEvdnceVrbleIdTypTxt() != null) {
			evidencevariableidentifiertype.setText(e.getEvdnceVrbleIdTypTxt());
		}
		/******************** evidencevariableidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory evidencevariableidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		evidencevariableidentifier.setUse(evidencevariableidentifieruse.fromCode(e.getEvdnceVrbleIdUse()));

		/******************** EvdnceVrble_Id_Vl ********************************************************************************/
		if(e.getEvdnceVrbleIdVl() != null) {
			evidencevariableidentifier.setValue(e.getEvdnceVrbleIdVl());
		}
		/******************** evidencevariablejurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidencevariablejurisdiction =  new org.hl7.fhir.r4.model.CodeableConcept();
		evidencevariable.addJurisdiction(evidencevariablejurisdiction);

		/******************** evidencevariablejurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidencevariablejurisdictioncoding =  new org.hl7.fhir.r4.model.Coding();
		evidencevariablejurisdiction.addCoding(evidencevariablejurisdictioncoding);

		/******************** EvdnceVrble_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(e.getEvdnceVrbleJrsdctnCdgCd() != null) {
			evidencevariablejurisdictioncoding.setCode(e.getEvdnceVrbleJrsdctnCdgCd());
		}
		/******************** EvdnceVrble_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(e.getEvdnceVrbleJrsdctnCdgDsply() != null) {
			evidencevariablejurisdictioncoding.setDisplay(e.getEvdnceVrbleJrsdctnCdgDsply());
		}
		/******************** EvdnceVrble_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(e.getEvdnceVrbleJrsdctnCdgSys() != null) {
			evidencevariablejurisdictioncoding.setSystem(e.getEvdnceVrbleJrsdctnCdgSys());
		}
		/******************** EvdnceVrble_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvdnceVrbleJrsdctnCdgUsrSltd() != null) {
			evidencevariablejurisdictioncoding.setUserSelected(Boolean.parseBoolean(e.getEvdnceVrbleJrsdctnCdgUsrSltd()));
		}
		/******************** EvdnceVrble_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(e.getEvdnceVrbleJrsdctnCdgVrsn() != null) {
			evidencevariablejurisdictioncoding.setVersion(e.getEvdnceVrbleJrsdctnCdgVrsn());
		}
		/******************** EvdnceVrble_Jrsdctn_Txt ********************************************************************************/
		if(e.getEvdnceVrbleJrsdctnTxt() != null) {
			evidencevariablejurisdiction.setText(e.getEvdnceVrbleJrsdctnTxt());
		}
		/******************** EvdnceVrble_LastReviewDt ********************************************************************************/
		if(e.getEvdnceVrbleLastReviewDt() != null) {
			java.text.SimpleDateFormat EvdnceVrble_LastReviewDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvdnceVrble_LastReviewDtdate = EvdnceVrble_LastReviewDtsdf.parse(e.getEvdnceVrbleLastReviewDt());
			evidencevariable.setLastReviewDate(EvdnceVrble_LastReviewDtdate);
		}
		/******************** EvdnceVrble_Nm ********************************************************************************/
		if(e.getEvdnceVrbleNm() != null) {
			evidencevariable.setName(e.getEvdnceVrbleNm());
		}
		/******************** evidencevariablenote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation evidencevariablenote =  new org.hl7.fhir.r4.model.Annotation();
		evidencevariable.addNote(evidencevariablenote);

		/******************** EvdnceVrble_Nt_AthrRfrnc ********************************************************************************/
		if(e.getEvdnceVrbleNtAthrRfrnc() != null) {
			evidencevariablenote.setAuthor( new org.hl7.fhir.r4.model.Reference(e.getEvdnceVrbleNtAthrRfrnc()));
		}
		/******************** EvdnceVrble_Nt_AthrStrgTyp ********************************************************************************/
		if(e.getEvdnceVrbleNtAthrStrgTyp() != null) {
			evidencevariablenote.setAuthor( new org.hl7.fhir.r4.model.StringType(e.getEvdnceVrbleNtAthrStrgTyp()));
		}
		/******************** EvdnceVrble_Nt_Txt ********************************************************************************/
		if(e.getEvdnceVrbleNtTxt() != null) {
			evidencevariablenote.setText(e.getEvdnceVrbleNtTxt());
		}
		/******************** EvdnceVrble_Nt_Time ********************************************************************************/
		if(e.getEvdnceVrbleNtTime() != null) {
			java.text.SimpleDateFormat EvdnceVrble_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvdnceVrble_Nt_Timedate = EvdnceVrble_Nt_Timesdf.parse(e.getEvdnceVrbleNtTime());
			evidencevariablenote.setTime(EvdnceVrble_Nt_Timedate);
		}
		/******************** EvdnceVrble_Pblshr ********************************************************************************/
		if(e.getEvdnceVrblePblshr() != null) {
			evidencevariable.setPublisher(e.getEvdnceVrblePblshr());
		}
		/******************** evidencevariablerelatedartifact ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact evidencevariablerelatedartifact =  new org.hl7.fhir.r4.model.RelatedArtifact();
		evidencevariable.addRelatedArtifact(evidencevariablerelatedartifact);

		/******************** EvdnceVrble_RltedArtfct_Citation ********************************************************************************/
		if(e.getEvdnceVrbleRltedArtfctCitation() != null) {
			evidencevariablerelatedartifact.setCitation(e.getEvdnceVrbleRltedArtfctCitation());
		}
		/******************** EvdnceVrble_RltedArtfct_Dsply ********************************************************************************/
		if(e.getEvdnceVrbleRltedArtfctDsply() != null) {
			evidencevariablerelatedartifact.setDisplay(e.getEvdnceVrbleRltedArtfctDsply());
		}
		/******************** evidencevariablerelatedartifactdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment evidencevariablerelatedartifactdocument =  new org.hl7.fhir.r4.model.Attachment();
		evidencevariablerelatedartifact.setDocument(evidencevariablerelatedartifactdocument);

		/******************** EvdnceVrble_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(e.getEvdnceVrbleRltedArtfctDocCntntTyp() != null) {
			evidencevariablerelatedartifactdocument.setContentType(e.getEvdnceVrbleRltedArtfctDocCntntTyp());
		}
		/******************** EvdnceVrble_RltedArtfct_Doc_Creation ********************************************************************************/
		if(e.getEvdnceVrbleRltedArtfctDocCreation() != null) {
			java.text.SimpleDateFormat EvdnceVrble_RltedArtfct_Doc_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvdnceVrble_RltedArtfct_Doc_Creationdate = EvdnceVrble_RltedArtfct_Doc_Creationsdf.parse(e.getEvdnceVrbleRltedArtfctDocCreation());
			evidencevariablerelatedartifactdocument.setCreation(EvdnceVrble_RltedArtfct_Doc_Creationdate);
		}
		/******************** EvdnceVrble_RltedArtfct_Doc_Data ********************************************************************************/
		if(e.getEvdnceVrbleRltedArtfctDocData() != null) {
			evidencevariablerelatedartifactdocument.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(e.getEvdnceVrbleRltedArtfctDocData()));
		}
		/******************** EvdnceVrble_RltedArtfct_Doc_Hash ********************************************************************************/
		if(e.getEvdnceVrbleRltedArtfctDocHash() != null) {
			evidencevariablerelatedartifactdocument.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(e.getEvdnceVrbleRltedArtfctDocHash()));
		}
		/******************** EvdnceVrble_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(e.getEvdnceVrbleRltedArtfctDocLnguage() != null) {
			evidencevariablerelatedartifactdocument.setLanguage(e.getEvdnceVrbleRltedArtfctDocLnguage());
		}
		/******************** EvdnceVrble_RltedArtfct_Doc_Sz ********************************************************************************/
		if(e.getEvdnceVrbleRltedArtfctDocSz() != null) {
			evidencevariablerelatedartifactdocument.setSize(Integer.parseInt(e.getEvdnceVrbleRltedArtfctDocSz()));
		}
		/******************** EvdnceVrble_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(e.getEvdnceVrbleRltedArtfctDocTtl() != null) {
			evidencevariablerelatedartifactdocument.setTitle(e.getEvdnceVrbleRltedArtfctDocTtl());
		}
		/******************** EvdnceVrble_RltedArtfct_Doc_Url ********************************************************************************/
		if(e.getEvdnceVrbleRltedArtfctDocUrl() != null) {
			evidencevariablerelatedartifactdocument.setUrl(e.getEvdnceVrbleRltedArtfctDocUrl());
		}
		/******************** EvdnceVrble_RltedArtfct_Lbl ********************************************************************************/
		if(e.getEvdnceVrbleRltedArtfctLbl() != null) {
			evidencevariablerelatedartifact.setLabel(e.getEvdnceVrbleRltedArtfctLbl());
		}
		/******************** EvdnceVrble_RltedArtfct_Rsrc ********************************************************************************/
		if(e.getEvdnceVrbleRltedArtfctRsrc() != null) {
			evidencevariablerelatedartifact.setResource(e.getEvdnceVrbleRltedArtfctRsrc());
		}
		/******************** evidencevariablerelatedartifacttype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory evidencevariablerelatedartifacttype =  new org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory();
		evidencevariablerelatedartifact.setType(evidencevariablerelatedartifacttype.fromCode(e.getEvdnceVrbleRltedArtfctTyp()));

		/******************** EvdnceVrble_RltedArtfct_Url ********************************************************************************/
		if(e.getEvdnceVrbleRltedArtfctUrl() != null) {
			evidencevariablerelatedartifact.setUrl(e.getEvdnceVrbleRltedArtfctUrl());
		}
		/******************** evidencevariablereviewer ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail evidencevariablereviewer =  new org.hl7.fhir.r4.model.ContactDetail();
		evidencevariable.addReviewer(evidencevariablereviewer);

		/******************** EvdnceVrble_Rviewr_Nm ********************************************************************************/
		if(e.getEvdnceVrbleRviewrNm() != null) {
			evidencevariablereviewer.setName(e.getEvdnceVrbleRviewrNm());
		}
		/******************** evidencevariablereviewertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint evidencevariablereviewertelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		evidencevariablereviewer.addTelecom(evidencevariablereviewertelecom);

		/******************** evidencevariablereviewertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period evidencevariablereviewertelecomperiod =  new org.hl7.fhir.r4.model.Period();
		evidencevariablereviewertelecom.setPeriod(evidencevariablereviewertelecomperiod);

		/******************** EvdnceVrble_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(e.getEvdnceVrbleRviewrTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat EvdnceVrble_Rviewr_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvdnceVrble_Rviewr_Tlcm_Prd_Enddate = EvdnceVrble_Rviewr_Tlcm_Prd_Endsdf.parse(e.getEvdnceVrbleRviewrTlcmPrdEnd());
			evidencevariablereviewertelecomperiod.setEnd(EvdnceVrble_Rviewr_Tlcm_Prd_Enddate);
		}
		/******************** EvdnceVrble_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEvdnceVrbleRviewrTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat EvdnceVrble_Rviewr_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date EvdnceVrble_Rviewr_Tlcm_Prd_Strtdate = EvdnceVrble_Rviewr_Tlcm_Prd_Strtsdf.parse(e.getEvdnceVrbleRviewrTlcmPrdStrt());
			evidencevariablereviewertelecomperiod.setStart(EvdnceVrble_Rviewr_Tlcm_Prd_Strtdate);
		}
		/******************** EvdnceVrble_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(e.getEvdnceVrbleRviewrTlcmRnk() != null) {
			evidencevariablereviewertelecom.setRank(Integer.parseInt(e.getEvdnceVrbleRviewrTlcmRnk()));
		}
		/******************** evidencevariablereviewertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory evidencevariablereviewertelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		evidencevariablereviewertelecom.setSystem(evidencevariablereviewertelecomsystem.fromCode(e.getEvdnceVrbleRviewrTlcmSys()));

		/******************** evidencevariablereviewertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory evidencevariablereviewertelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		evidencevariablereviewertelecom.setUse(evidencevariablereviewertelecomuse.fromCode(e.getEvdnceVrbleRviewrTlcmUse()));

		/******************** EvdnceVrble_Rviewr_Tlcm_Vl ********************************************************************************/
		if(e.getEvdnceVrbleRviewrTlcmVl() != null) {
			evidencevariablereviewertelecom.setValue(e.getEvdnceVrbleRviewrTlcmVl());
		}
		/******************** EvdnceVrble_ShortTtl ********************************************************************************/
		if(e.getEvdnceVrbleShortTtl() != null) {
			evidencevariable.setShortTitle(e.getEvdnceVrbleShortTtl());
		}
		/******************** evidencevariablestatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory evidencevariablestatus =  new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory();
		evidencevariable.setStatus(evidencevariablestatus.fromCode(e.getEvdnceVrbleSts()));

		/******************** EvdnceVrble_Subtitle ********************************************************************************/
		if(e.getEvdnceVrbleSubtitle() != null) {
			evidencevariable.setSubtitle(e.getEvdnceVrbleSubtitle());
		}
		/******************** EvdnceVrble_Ttl ********************************************************************************/
		if(e.getEvdnceVrbleTtl() != null) {
			evidencevariable.setTitle(e.getEvdnceVrbleTtl());
		}
		/******************** evidencevariabletopic ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidencevariabletopic =  new org.hl7.fhir.r4.model.CodeableConcept();
		evidencevariable.addTopic(evidencevariabletopic);

		/******************** evidencevariabletopiccoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidencevariabletopiccoding =  new org.hl7.fhir.r4.model.Coding();
		evidencevariabletopic.addCoding(evidencevariabletopiccoding);

		/******************** EvdnceVrble_Topic_Cdg_Cd ********************************************************************************/
		if(e.getEvdnceVrbleTopicCdgCd() != null) {
			evidencevariabletopiccoding.setCode(e.getEvdnceVrbleTopicCdgCd());
		}
		/******************** EvdnceVrble_Topic_Cdg_Dsply ********************************************************************************/
		if(e.getEvdnceVrbleTopicCdgDsply() != null) {
			evidencevariabletopiccoding.setDisplay(e.getEvdnceVrbleTopicCdgDsply());
		}
		/******************** EvdnceVrble_Topic_Cdg_Sys ********************************************************************************/
		if(e.getEvdnceVrbleTopicCdgSys() != null) {
			evidencevariabletopiccoding.setSystem(e.getEvdnceVrbleTopicCdgSys());
		}
		/******************** EvdnceVrble_Topic_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvdnceVrbleTopicCdgUsrSltd() != null) {
			evidencevariabletopiccoding.setUserSelected(Boolean.parseBoolean(e.getEvdnceVrbleTopicCdgUsrSltd()));
		}
		/******************** EvdnceVrble_Topic_Cdg_Vrsn ********************************************************************************/
		if(e.getEvdnceVrbleTopicCdgVrsn() != null) {
			evidencevariabletopiccoding.setVersion(e.getEvdnceVrbleTopicCdgVrsn());
		}
		/******************** EvdnceVrble_Topic_Txt ********************************************************************************/
		if(e.getEvdnceVrbleTopicTxt() != null) {
			evidencevariabletopic.setText(e.getEvdnceVrbleTopicTxt());
		}
		/******************** evidencevariabletype ********************************************************************************/
		org.hl7.fhir.r4.model.EvidenceVariable.EvidenceVariableTypeEnumFactory evidencevariabletype =  new org.hl7.fhir.r4.model.EvidenceVariable.EvidenceVariableTypeEnumFactory();
		evidencevariable.setType(evidencevariabletype.fromCode(e.getEvdnceVrbleTyp()));

		/******************** EvdnceVrble_Url ********************************************************************************/
		if(e.getEvdnceVrbleUrl() != null) {
			evidencevariable.setUrl(e.getEvdnceVrbleUrl());
		}
		/******************** evidencevariableusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext evidencevariableusecontext =  new org.hl7.fhir.r4.model.UsageContext();
		evidencevariable.addUseContext(evidencevariableusecontext);

		/******************** evidencevariableusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidencevariableusecontextcode =  new org.hl7.fhir.r4.model.Coding();
		evidencevariableusecontext.setCode(evidencevariableusecontextcode);

		/******************** EvdnceVrble_UseCntxt_Cd_Cd ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtCdCd() != null) {
			evidencevariableusecontextcode.setCode(e.getEvdnceVrbleUseCntxtCdCd());
		}
		/******************** EvdnceVrble_UseCntxt_Cd_Dsply ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtCdDsply() != null) {
			evidencevariableusecontextcode.setDisplay(e.getEvdnceVrbleUseCntxtCdDsply());
		}
		/******************** EvdnceVrble_UseCntxt_Cd_Sys ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtCdSys() != null) {
			evidencevariableusecontextcode.setSystem(e.getEvdnceVrbleUseCntxtCdSys());
		}
		/******************** EvdnceVrble_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtCdUsrSltd() != null) {
			evidencevariableusecontextcode.setUserSelected(Boolean.parseBoolean(e.getEvdnceVrbleUseCntxtCdUsrSltd()));
		}
		/******************** EvdnceVrble_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtCdVrsn() != null) {
			evidencevariableusecontextcode.setVersion(e.getEvdnceVrbleUseCntxtCdVrsn());
		}
		/******************** evidencevariableusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept evidencevariableusecontextvaluecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		evidencevariableusecontext.setValue(evidencevariableusecontextvaluecodeableconcept);

		/******************** evidencevariableusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding evidencevariableusecontextvaluecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		evidencevariableusecontextvaluecodeableconcept.addCoding(evidencevariableusecontextvaluecodeableconceptcoding);

		/******************** EvdnceVrble_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlCdbleCncptCdgCd() != null) {
			evidencevariableusecontextvaluecodeableconceptcoding.setCode(e.getEvdnceVrbleUseCntxtVlCdbleCncptCdgCd());
		}
		/******************** EvdnceVrble_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlCdbleCncptCdgDsply() != null) {
			evidencevariableusecontextvaluecodeableconceptcoding.setDisplay(e.getEvdnceVrbleUseCntxtVlCdbleCncptCdgDsply());
		}
		/******************** EvdnceVrble_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlCdbleCncptCdgSys() != null) {
			evidencevariableusecontextvaluecodeableconceptcoding.setSystem(e.getEvdnceVrbleUseCntxtVlCdbleCncptCdgSys());
		}
		/******************** EvdnceVrble_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlCdbleCncptCdgUsrSltd() != null) {
			evidencevariableusecontextvaluecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(e.getEvdnceVrbleUseCntxtVlCdbleCncptCdgUsrSltd()));
		}
		/******************** EvdnceVrble_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlCdbleCncptCdgVrsn() != null) {
			evidencevariableusecontextvaluecodeableconceptcoding.setVersion(e.getEvdnceVrbleUseCntxtVlCdbleCncptCdgVrsn());
		}
		/******************** EvdnceVrble_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlCdbleCncptTxt() != null) {
			evidencevariableusecontextvaluecodeableconcept.setText(e.getEvdnceVrbleUseCntxtVlCdbleCncptTxt());
		}
		/******************** evidencevariableusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidencevariableusecontextvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		evidencevariableusecontext.setValue(evidencevariableusecontextvaluequantity);

		/******************** EvdnceVrble_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlQntyCd() != null) {
			evidencevariableusecontextvaluequantity.setCode(e.getEvdnceVrbleUseCntxtVlQntyCd());
		}
		/******************** evidencevariableusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory evidencevariableusecontextvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		evidencevariableusecontextvaluequantity.setComparator(evidencevariableusecontextvaluequantitycomparator.fromCode(e.getEvdnceVrbleUseCntxtVlQntyCmprtr()));

		/******************** EvdnceVrble_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlQntySys() != null) {
			evidencevariableusecontextvaluequantity.setSystem(e.getEvdnceVrbleUseCntxtVlQntySys());
		}
		/******************** EvdnceVrble_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlQntyUnt() != null) {
			evidencevariableusecontextvaluequantity.setUnit(e.getEvdnceVrbleUseCntxtVlQntyUnt());
		}
		/******************** EvdnceVrble_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlQntyVl() != null) {
			evidencevariableusecontextvaluequantity.setValue(Double.parseDouble((e.getEvdnceVrbleUseCntxtVlQntyVl())));
		}
		/******************** evidencevariableusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range evidencevariableusecontextvaluerange =  new org.hl7.fhir.r4.model.Range();
		evidencevariableusecontext.setValue(evidencevariableusecontextvaluerange);

		/******************** evidencevariableusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidencevariableusecontextvaluerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		evidencevariableusecontextvaluerange.setHigh(evidencevariableusecontextvaluerangehigh);

		/******************** EvdnceVrble_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlRngHiCd() != null) {
			evidencevariableusecontextvaluerangehigh.setCode(e.getEvdnceVrbleUseCntxtVlRngHiCd());
		}
		/******************** evidencevariableusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory evidencevariableusecontextvaluerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		evidencevariableusecontextvaluerangehigh.setComparator(evidencevariableusecontextvaluerangehighcomparator.fromCode(e.getEvdnceVrbleUseCntxtVlRngHiCmprtr()));

		/******************** EvdnceVrble_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlRngHiSys() != null) {
			evidencevariableusecontextvaluerangehigh.setSystem(e.getEvdnceVrbleUseCntxtVlRngHiSys());
		}
		/******************** EvdnceVrble_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlRngHiUnt() != null) {
			evidencevariableusecontextvaluerangehigh.setUnit(e.getEvdnceVrbleUseCntxtVlRngHiUnt());
		}
		/******************** EvdnceVrble_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlRngHiVl() != null) {
			evidencevariableusecontextvaluerangehigh.setValue(Double.parseDouble((e.getEvdnceVrbleUseCntxtVlRngHiVl())));
		}
		/******************** evidencevariableusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity evidencevariableusecontextvaluerangelow =  new org.hl7.fhir.r4.model.Quantity();
		evidencevariableusecontextvaluerange.setLow(evidencevariableusecontextvaluerangelow);

		/******************** EvdnceVrble_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlRngLwCd() != null) {
			evidencevariableusecontextvaluerangelow.setCode(e.getEvdnceVrbleUseCntxtVlRngLwCd());
		}
		/******************** evidencevariableusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory evidencevariableusecontextvaluerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		evidencevariableusecontextvaluerangelow.setComparator(evidencevariableusecontextvaluerangelowcomparator.fromCode(e.getEvdnceVrbleUseCntxtVlRngLwCmprtr()));

		/******************** EvdnceVrble_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlRngLwSys() != null) {
			evidencevariableusecontextvaluerangelow.setSystem(e.getEvdnceVrbleUseCntxtVlRngLwSys());
		}
		/******************** EvdnceVrble_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlRngLwUnt() != null) {
			evidencevariableusecontextvaluerangelow.setUnit(e.getEvdnceVrbleUseCntxtVlRngLwUnt());
		}
		/******************** EvdnceVrble_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlRngLwVl() != null) {
			evidencevariableusecontextvaluerangelow.setValue(Double.parseDouble((e.getEvdnceVrbleUseCntxtVlRngLwVl())));
		}
		/******************** EvdnceVrble_UseCntxt_VlRfrnc ********************************************************************************/
		if(e.getEvdnceVrbleUseCntxtVlRfrnc() != null) {
			evidencevariableusecontext.setValue( new org.hl7.fhir.r4.model.Reference(e.getEvdnceVrbleUseCntxtVlRfrnc()));
		}
		/******************** EvdnceVrble_Vrsn ********************************************************************************/
		if(e.getEvdnceVrbleVrsn() != null) {
			evidencevariable.setVersion(e.getEvdnceVrbleVrsn());
		}
		return evidencevariable;
	}
}
