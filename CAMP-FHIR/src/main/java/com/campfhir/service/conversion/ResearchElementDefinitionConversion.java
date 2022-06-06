package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ResearchElementDefinition;
public class ResearchElementDefinitionConversion 
{
	public org.hl7.fhir.r4.model.ResearchElementDefinition ResearchElementDefinitions(ResearchElementDefinition r) throws ParseException
	{
		org.hl7.fhir.r4.model.ResearchElementDefinition researchelementdefinition = new org.hl7.fhir.r4.model.ResearchElementDefinition();

		/******************** id ********************************************************************************/
		researchelementdefinition.setId(r.getId());

		/******************** RsrchElmntDfn_ApprovalDt ********************************************************************************/
		if(r.getRsrchElmntDfnApprovalDt() != null) {
			java.text.SimpleDateFormat RsrchElmntDfn_ApprovalDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchElmntDfn_ApprovalDtdate = RsrchElmntDfn_ApprovalDtsdf.parse(r.getRsrchElmntDfnApprovalDt());
			researchelementdefinition.setApprovalDate(RsrchElmntDfn_ApprovalDtdate);
		}
		/******************** researchelementdefinitionauthor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail researchelementdefinitionauthor =  new org.hl7.fhir.r4.model.ContactDetail();
		researchelementdefinition.addAuthor(researchelementdefinitionauthor);

		/******************** RsrchElmntDfn_Athr_Nm ********************************************************************************/
		if(r.getRsrchElmntDfnAthrNm() != null) {
			researchelementdefinitionauthor.setName(r.getRsrchElmntDfnAthrNm());
		}
		/******************** researchelementdefinitionauthortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint researchelementdefinitionauthortelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		researchelementdefinitionauthor.addTelecom(researchelementdefinitionauthortelecom);

		/******************** researchelementdefinitionauthortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchelementdefinitionauthortelecomperiod =  new org.hl7.fhir.r4.model.Period();
		researchelementdefinitionauthortelecom.setPeriod(researchelementdefinitionauthortelecomperiod);

		/******************** RsrchElmntDfn_Athr_Tlcm_Prd_End ********************************************************************************/
		if(r.getRsrchElmntDfnAthrTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat RsrchElmntDfn_Athr_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchElmntDfn_Athr_Tlcm_Prd_Enddate = RsrchElmntDfn_Athr_Tlcm_Prd_Endsdf.parse(r.getRsrchElmntDfnAthrTlcmPrdEnd());
			researchelementdefinitionauthortelecomperiod.setEnd(RsrchElmntDfn_Athr_Tlcm_Prd_Enddate);
		}
		/******************** RsrchElmntDfn_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(r.getRsrchElmntDfnAthrTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat RsrchElmntDfn_Athr_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchElmntDfn_Athr_Tlcm_Prd_Strtdate = RsrchElmntDfn_Athr_Tlcm_Prd_Strtsdf.parse(r.getRsrchElmntDfnAthrTlcmPrdStrt());
			researchelementdefinitionauthortelecomperiod.setStart(RsrchElmntDfn_Athr_Tlcm_Prd_Strtdate);
		}
		/******************** RsrchElmntDfn_Athr_Tlcm_Rnk ********************************************************************************/
		if(r.getRsrchElmntDfnAthrTlcmRnk() != null) {
			researchelementdefinitionauthortelecom.setRank(Integer.parseInt(r.getRsrchElmntDfnAthrTlcmRnk()));
		}
		/******************** researchelementdefinitionauthortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory researchelementdefinitionauthortelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		researchelementdefinitionauthortelecom.setSystem(researchelementdefinitionauthortelecomsystem.fromCode(r.getRsrchElmntDfnAthrTlcmSys()));

		/******************** researchelementdefinitionauthortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory researchelementdefinitionauthortelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		researchelementdefinitionauthortelecom.setUse(researchelementdefinitionauthortelecomuse.fromCode(r.getRsrchElmntDfnAthrTlcmUse()));

		/******************** RsrchElmntDfn_Athr_Tlcm_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnAthrTlcmVl() != null) {
			researchelementdefinitionauthortelecom.setValue(r.getRsrchElmntDfnAthrTlcmVl());
		}
		/******************** researchelementdefinitioncharacteristic ********************************************************************************/
		org.hl7.fhir.r4.model.ResearchElementDefinition.ResearchElementDefinitionCharacteristicComponent researchelementdefinitioncharacteristic =  new org.hl7.fhir.r4.model.ResearchElementDefinition.ResearchElementDefinitionCharacteristicComponent();
		researchelementdefinition.addCharacteristic(researchelementdefinitioncharacteristic);

		/******************** RsrchElmntDfn_Crctrstc_DfnCanonicalTyp ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnCanonicalTyp() != null) {
			researchelementdefinitioncharacteristic.setDefinition( new org.hl7.fhir.r4.model.CanonicalType(r.getRsrchElmntDfnCrctrstcDfnCanonicalTyp()));
		}
		/******************** researchelementdefinitioncharacteristicdefinitioncodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchelementdefinitioncharacteristicdefinitioncodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		researchelementdefinitioncharacteristic.setDefinition(researchelementdefinitioncharacteristicdefinitioncodeableconcept);

		/******************** researchelementdefinitioncharacteristicdefinitioncodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchelementdefinitioncharacteristicdefinitioncodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		researchelementdefinitioncharacteristicdefinitioncodeableconcept.addCoding(researchelementdefinitioncharacteristicdefinitioncodeableconceptcoding);

		/******************** RsrchElmntDfn_Crctrstc_DfnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnCdbleCncptCdgCd() != null) {
			researchelementdefinitioncharacteristicdefinitioncodeableconceptcoding.setCode(r.getRsrchElmntDfnCrctrstcDfnCdbleCncptCdgCd());
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnCdbleCncptCdgDsply() != null) {
			researchelementdefinitioncharacteristicdefinitioncodeableconceptcoding.setDisplay(r.getRsrchElmntDfnCrctrstcDfnCdbleCncptCdgDsply());
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnCdbleCncptCdgSys() != null) {
			researchelementdefinitioncharacteristicdefinitioncodeableconceptcoding.setSystem(r.getRsrchElmntDfnCrctrstcDfnCdbleCncptCdgSys());
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnCdbleCncptCdgUsrSltd() != null) {
			researchelementdefinitioncharacteristicdefinitioncodeableconceptcoding.setUserSelected(Boolean.parseBoolean(r.getRsrchElmntDfnCrctrstcDfnCdbleCncptCdgUsrSltd()));
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnCdbleCncptCdgVrsn() != null) {
			researchelementdefinitioncharacteristicdefinitioncodeableconceptcoding.setVersion(r.getRsrchElmntDfnCrctrstcDfnCdbleCncptCdgVrsn());
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnCdbleCncpt_Txt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnCdbleCncptTxt() != null) {
			researchelementdefinitioncharacteristicdefinitioncodeableconcept.setText(r.getRsrchElmntDfnCrctrstcDfnCdbleCncptTxt());
		}
		/******************** researchelementdefinitioncharacteristicdefinitiondatarequirement ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement researchelementdefinitioncharacteristicdefinitiondatarequirement =  new org.hl7.fhir.r4.model.DataRequirement();
		researchelementdefinitioncharacteristic.setDefinition(researchelementdefinitioncharacteristicdefinitiondatarequirement);

		/******************** researchelementdefinitioncharacteristicdefinitiondatarequirementcodefilter ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent researchelementdefinitioncharacteristicdefinitiondatarequirementcodefilter =  new org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent();
		researchelementdefinitioncharacteristicdefinitiondatarequirement.addCodeFilter(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefilter);

		/******************** researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercode =  new org.hl7.fhir.r4.model.Coding();
		researchelementdefinitioncharacteristicdefinitiondatarequirementcodefilter.addCode(researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercode);

		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_Cd_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdCd() != null) {
			researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercode.setCode(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdCd());
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_Cd_Dsply ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdDsply() != null) {
			researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercode.setDisplay(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdDsply());
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_Cd_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdSys() != null) {
			researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercode.setSystem(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdSys());
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_Cd_UsrSltd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdUsrSltd() != null) {
			researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercode.setUserSelected(Boolean.parseBoolean(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdUsrSltd()));
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_Cd_Vrsn ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdVrsn() != null) {
			researchelementdefinitioncharacteristicdefinitiondatarequirementcodefiltercode.setVersion(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrCdVrsn());
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_Path ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrPath() != null) {
			researchelementdefinitioncharacteristicdefinitiondatarequirementcodefilter.setPath(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrPath());
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_SrchParam ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrSrchParam() != null) {
			researchelementdefinitioncharacteristicdefinitiondatarequirementcodefilter.setSearchParam(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrSrchParam());
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_CdFltr_VlSt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrVlSt() != null) {
			researchelementdefinitioncharacteristicdefinitiondatarequirementcodefilter.setValueSet(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentCdFltrVlSt());
		}
		/******************** researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilter ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilter =  new org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent();
		researchelementdefinitioncharacteristicdefinitiondatarequirement.addDateFilter(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilter);

		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_Path ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrPath() != null) {
			researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilter.setPath(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrPath());
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_SrchParam ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrSrchParam() != null) {
			researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilter.setSearchParam(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrSrchParam());
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlDtTimeTyp ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDtTimeTyp() != null) {
			researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilter.setValue( new org.hl7.fhir.r4.model.DateTimeType(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlDtTimeTyp()));
		}
		/******************** researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueduration =  new org.hl7.fhir.r4.model.Duration();
		researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilter.setValue(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueduration);

		/******************** researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueperiod =  new org.hl7.fhir.r4.model.Period();
		researchelementdefinitioncharacteristicdefinitiondatarequirementdatefilter.setValue(researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueperiod);

		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlPrd_End ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlPrdEnd() != null) {
			java.text.SimpleDateFormat RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlPrd_Enddate = RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlPrd_Endsdf.parse(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlPrdEnd());
			researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueperiod.setEnd(RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlPrd_Enddate);
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlPrd_Strt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlPrdStrt() != null) {
			java.text.SimpleDateFormat RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlPrd_Strtdate = RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlPrd_Strtsdf.parse(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentDtFltrVlPrdStrt());
			researchelementdefinitioncharacteristicdefinitiondatarequirementdatefiltervalueperiod.setStart(RsrchElmntDfn_Crctrstc_DfnDataRqrment_DtFltr_VlPrd_Strtdate);
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_Lmt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentLmt() != null) {
			researchelementdefinitioncharacteristicdefinitiondatarequirement.setLimit(Integer.parseInt(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentLmt()));
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_MustSupport ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentMustSupport() != null) {
			researchelementdefinitioncharacteristicdefinitiondatarequirement.addMustSupport(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentMustSupport());
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_Profile ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentProfile() != null) {
			researchelementdefinitioncharacteristicdefinitiondatarequirement.addProfile(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentProfile());
		}
		/******************** researchelementdefinitioncharacteristicdefinitiondatarequirementsort ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent researchelementdefinitioncharacteristicdefinitiondatarequirementsort =  new org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent();
		researchelementdefinitioncharacteristicdefinitiondatarequirement.addSort(researchelementdefinitioncharacteristicdefinitiondatarequirementsort);

		/******************** researchelementdefinitioncharacteristicdefinitiondatarequirementsortdirection ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.SortDirectionEnumFactory researchelementdefinitioncharacteristicdefinitiondatarequirementsortdirection =  new org.hl7.fhir.r4.model.DataRequirement.SortDirectionEnumFactory();
		researchelementdefinitioncharacteristicdefinitiondatarequirementsort.setDirection(researchelementdefinitioncharacteristicdefinitiondatarequirementsortdirection.fromCode(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSortDirection()));

		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_Sort_Path ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSortPath() != null) {
			researchelementdefinitioncharacteristicdefinitiondatarequirementsort.setPath(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSortPath());
		}
		/******************** researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		researchelementdefinitioncharacteristicdefinitiondatarequirement.setSubject(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconcept);

		/******************** researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconcept.addCoding(researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding);

		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgCd() != null) {
			researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.setCode(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgCd());
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgDsply() != null) {
			researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.setDisplay(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgDsply());
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgSys() != null) {
			researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.setSystem(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgSys());
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_US ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgUs() != null) {
			researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgUs()));
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgVrsn() != null) {
			researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconceptcoding.setVersion(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptCdgVrsn());
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptTxt() != null) {
			researchelementdefinitioncharacteristicdefinitiondatarequirementsubjectcodeableconcept.setText(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctCdbleCncptTxt());
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_SbjctRfrnc ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctRfrnc() != null) {
			researchelementdefinitioncharacteristicdefinitiondatarequirement.setSubject( new org.hl7.fhir.r4.model.Reference(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentSbjctRfrnc()));
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnDataRqrment_Typ ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentTyp() != null) {
			researchelementdefinitioncharacteristicdefinitiondatarequirement.setType(r.getRsrchElmntDfnCrctrstcDfnDataRqrmentTyp());
		}
		/******************** researchelementdefinitioncharacteristicdefinitionexpression ********************************************************************************/
		org.hl7.fhir.r4.model.Expression researchelementdefinitioncharacteristicdefinitionexpression =  new org.hl7.fhir.r4.model.Expression();
		researchelementdefinitioncharacteristic.setDefinition(researchelementdefinitioncharacteristicdefinitionexpression);

		/******************** RsrchElmntDfn_Crctrstc_DfnExprsn_Dscrptn ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnExprsnDscrptn() != null) {
			researchelementdefinitioncharacteristicdefinitionexpression.setDescription(r.getRsrchElmntDfnCrctrstcDfnExprsnDscrptn());
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnExprsn_Exprsn ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnExprsnExprsn() != null) {
			researchelementdefinitioncharacteristicdefinitionexpression.setExpression(r.getRsrchElmntDfnCrctrstcDfnExprsnExprsn());
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnExprsn_Lnguage ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnExprsnLnguage() != null) {
			researchelementdefinitioncharacteristicdefinitionexpression.setLanguage(r.getRsrchElmntDfnCrctrstcDfnExprsnLnguage());
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnExprsn_Nm ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnExprsnNm() != null) {
			researchelementdefinitioncharacteristicdefinitionexpression.setName(r.getRsrchElmntDfnCrctrstcDfnExprsnNm());
		}
		/******************** RsrchElmntDfn_Crctrstc_DfnExprsn_Rfrnc ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcDfnExprsnRfrnc() != null) {
			researchelementdefinitioncharacteristicdefinitionexpression.setReference(r.getRsrchElmntDfnCrctrstcDfnExprsnRfrnc());
		}
		/******************** RsrchElmntDfn_Crctrstc_Exclude ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcExclude() != null) {
			researchelementdefinitioncharacteristic.setExclude(Boolean.parseBoolean(r.getRsrchElmntDfnCrctrstcExclude()));
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveDtTimeTyp ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveDtTimeTyp() != null) {
			researchelementdefinitioncharacteristic.setParticipantEffective( new org.hl7.fhir.r4.model.DateTimeType(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveDtTimeTyp()));
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveDscrptn ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveDscrptn() != null) {
			researchelementdefinitioncharacteristic.setParticipantEffectiveDescription(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveDscrptn());
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveDscrptnElmnt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveDscrptnElmnt() != null) {
			researchelementdefinitioncharacteristic.setParticipantEffectiveDescription(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveDscrptnElmnt());
		}
		/******************** researchelementdefinitioncharacteristicparticipanteffectiveduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration researchelementdefinitioncharacteristicparticipanteffectiveduration =  new org.hl7.fhir.r4.model.Duration();
		researchelementdefinitioncharacteristic.setParticipantEffective(researchelementdefinitioncharacteristicparticipanteffectiveduration);

		/******************** researchelementdefinitioncharacteristicparticipanteffectivegroupmeasure ********************************************************************************/
		org.hl7.fhir.r4.model.ResearchElementDefinition.GroupMeasureEnumFactory researchelementdefinitioncharacteristicparticipanteffectivegroupmeasure =  new org.hl7.fhir.r4.model.ResearchElementDefinition.GroupMeasureEnumFactory();
		researchelementdefinitioncharacteristic.setParticipantEffectiveGroupMeasure(researchelementdefinitioncharacteristicparticipanteffectivegroupmeasure.fromCode(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveGrpMsr()));

//		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveGrpMsrElmnt ********************************************************************************/
//		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveGrpMsrElmnt() != null) {
//			researchelementdefinitioncharacteristic.setParticipantEffectiveGroupMeasure(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveGrpMsrElmnt());
//		}
		/******************** researchelementdefinitioncharacteristicparticipanteffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchelementdefinitioncharacteristicparticipanteffectiveperiod =  new org.hl7.fhir.r4.model.Period();
		researchelementdefinitioncharacteristic.setParticipantEffective(researchelementdefinitioncharacteristicparticipanteffectiveperiod);

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctivePrd_End ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctivePrdEnd() != null) {
			java.text.SimpleDateFormat RsrchElmntDfn_Crctrstc_PrtcpntEfctivePrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchElmntDfn_Crctrstc_PrtcpntEfctivePrd_Enddate = RsrchElmntDfn_Crctrstc_PrtcpntEfctivePrd_Endsdf.parse(r.getRsrchElmntDfnCrctrstcPrtcpntEfctivePrdEnd());
			researchelementdefinitioncharacteristicparticipanteffectiveperiod.setEnd(RsrchElmntDfn_Crctrstc_PrtcpntEfctivePrd_Enddate);
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctivePrd_Strt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctivePrdStrt() != null) {
			java.text.SimpleDateFormat RsrchElmntDfn_Crctrstc_PrtcpntEfctivePrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchElmntDfn_Crctrstc_PrtcpntEfctivePrd_Strtdate = RsrchElmntDfn_Crctrstc_PrtcpntEfctivePrd_Strtsdf.parse(r.getRsrchElmntDfnCrctrstcPrtcpntEfctivePrdStrt());
			researchelementdefinitioncharacteristicparticipanteffectiveperiod.setStart(RsrchElmntDfn_Crctrstc_PrtcpntEfctivePrd_Strtdate);
		}
		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimefromstart ********************************************************************************/
		org.hl7.fhir.r4.model.Duration researchelementdefinitioncharacteristicparticipanteffectivetimefromstart =  new org.hl7.fhir.r4.model.Duration();
		researchelementdefinitioncharacteristic.setParticipantEffectiveTimeFromStart(researchelementdefinitioncharacteristicparticipanteffectivetimefromstart);

		/******************** researchelementdefinitioncharacteristicparticipanteffectivetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing researchelementdefinitioncharacteristicparticipanteffectivetiming =  new org.hl7.fhir.r4.model.Timing();
		researchelementdefinitioncharacteristic.setParticipantEffective(researchelementdefinitioncharacteristicparticipanteffectivetiming);

		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchelementdefinitioncharacteristicparticipanteffectivetimingcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		researchelementdefinitioncharacteristicparticipanteffectivetiming.setCode(researchelementdefinitioncharacteristicparticipanteffectivetimingcode);

		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchelementdefinitioncharacteristicparticipanteffectivetimingcodecoding =  new org.hl7.fhir.r4.model.Coding();
		researchelementdefinitioncharacteristicparticipanteffectivetimingcode.addCoding(researchelementdefinitioncharacteristicparticipanteffectivetimingcodecoding);

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgCd() != null) {
			researchelementdefinitioncharacteristicparticipanteffectivetimingcodecoding.setCode(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgCd());
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgDsply() != null) {
			researchelementdefinitioncharacteristicparticipanteffectivetimingcodecoding.setDisplay(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgDsply());
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgSys() != null) {
			researchelementdefinitioncharacteristicparticipanteffectivetimingcodecoding.setSystem(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgSys());
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgUsrSltd() != null) {
			researchelementdefinitioncharacteristicparticipanteffectivetimingcodecoding.setUserSelected(Boolean.parseBoolean(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgUsrSltd()));
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgVrsn() != null) {
			researchelementdefinitioncharacteristicparticipanteffectivetimingcodecoding.setVersion(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdCdgVrsn());
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Cd_Txt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdTxt() != null) {
			researchelementdefinitioncharacteristicparticipanteffectivetimingcode.setText(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgCdTxt());
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Evnt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgEvnt() != null) {
			java.text.SimpleDateFormat RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Evntsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Evntdate = RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Evntsdf.parse(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgEvnt());
			researchelementdefinitioncharacteristicparticipanteffectivetiming.addEvent(RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Evntdate);
		}
		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat =  new org.hl7.fhir.r4.model.Timing.TimingRepeatComponent();
		researchelementdefinitioncharacteristicparticipanteffectivetiming.setRepeat(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat);

		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsduration =  new org.hl7.fhir.r4.model.Duration();
		researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.setBounds(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsduration);

		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsperiod =  new org.hl7.fhir.r4.model.Period();
		researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.setBounds(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsperiod);

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsPrdEnd() != null) {
			java.text.SimpleDateFormat RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsPrd_Enddate = RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsPrd_Endsdf.parse(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsPrdEnd());
			researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsperiod.setEnd(RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsPrd_Enddate);
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsPrdStrt() != null) {
			java.text.SimpleDateFormat RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsPrd_Strtdate = RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsPrd_Strtsdf.parse(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsPrdStrt());
			researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsperiod.setStart(RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsPrd_Strtdate);
		}
		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrange =  new org.hl7.fhir.r4.model.Range();
		researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.setBounds(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrange);

		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrange.setHigh(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehigh);

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiCd() != null) {
			researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehigh.setCode(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiCd());
		}
		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehigh.setComparator(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehighcomparator.fromCode(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiCmprtr()));

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiSys() != null) {
			researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehigh.setSystem(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiSys());
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiUnt() != null) {
			researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehigh.setUnit(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiUnt());
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiVl() != null) {
			researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangehigh.setValue(Double.parseDouble((r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngHiVl())));
		}
		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelow =  new org.hl7.fhir.r4.model.Quantity();
		researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrange.setLow(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelow);

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwCd() != null) {
			researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelow.setCode(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwCd());
		}
		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelow.setComparator(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelowcomparator.fromCode(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwCmprtr()));

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwSys() != null) {
			researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelow.setSystem(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwSys());
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwUnt() != null) {
			researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelow.setUnit(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwUnt());
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwVl() != null) {
			researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatboundsrangelow.setValue(Double.parseDouble((r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptBndsRngLwVl())));
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_Cnt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptCnt() != null) {
			researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.setCount(Integer.parseInt(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptCnt()));
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_CntMx ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptCntMx() != null) {
			researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.setCountMax(Integer.parseInt(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptCntMx()));
		}
		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatdayofweek ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatdayofweek =  new org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory();
		researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.addDayOfWeek(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatdayofweek.fromCode(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptDayOfWeek()));

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_Duration ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptDuration() != null) {
			researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.setDuration(Double.parseDouble((r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptDuration())));
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_DurationMx ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptDurationMx() != null) {
			researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.setDurationMax(Double.parseDouble((r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptDurationMx())));
		}
		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatdurationunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.setDurationUnit(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatdurationunit.fromCode(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptDurationUnt()));

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_Frqncy ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptFrqncy() != null) {
			researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.setFrequency(Integer.parseInt(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptFrqncy()));
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_FrqncyMx ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptFrqncyMx() != null) {
			researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.setFrequencyMax(Integer.parseInt(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptFrqncyMx()));
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_Off ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptOff() != null) {
			researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.setOffset(Integer.parseInt(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptOff()));
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_Prd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptPrd() != null) {
			researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.setPeriod(Double.parseDouble((r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptPrd())));
		}
		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_PrdMx ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptPrdMx() != null) {
			researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.setPeriodMax(Double.parseDouble((r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptPrdMx())));
		}
		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatperiodunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.setPeriodUnit(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatperiodunit.fromCode(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptPrdUnt()));

		/******************** RsrchElmntDfn_Crctrstc_PrtcpntEfctiveTmg_Rpt_TimeOfDay ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptTimeOfDay() != null) {
			researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.addTimeOfDay(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptTimeOfDay());
		}
		/******************** researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatwhen ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatwhen =  new org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory();
		researchelementdefinitioncharacteristicparticipanteffectivetimingrepeat.addWhen(researchelementdefinitioncharacteristicparticipanteffectivetimingrepeatwhen.fromCode(r.getRsrchElmntDfnCrctrstcPrtcpntEfctiveTmgRptWhen()));

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveDtTimeTyp ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveDtTimeTyp() != null) {
			researchelementdefinitioncharacteristic.setStudyEffective( new org.hl7.fhir.r4.model.DateTimeType(r.getRsrchElmntDfnCrctrstcStdyEfctiveDtTimeTyp()));
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveDscrptn ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveDscrptn() != null) {
			researchelementdefinitioncharacteristic.setStudyEffectiveDescription(r.getRsrchElmntDfnCrctrstcStdyEfctiveDscrptn());
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveDscrptnElmnt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveDscrptnElmnt() != null) {
			researchelementdefinitioncharacteristic.setStudyEffectiveDescription(r.getRsrchElmntDfnCrctrstcStdyEfctiveDscrptnElmnt());
		}
		/******************** researchelementdefinitioncharacteristicstudyeffectiveduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration researchelementdefinitioncharacteristicstudyeffectiveduration =  new org.hl7.fhir.r4.model.Duration();
		researchelementdefinitioncharacteristic.setStudyEffective(researchelementdefinitioncharacteristicstudyeffectiveduration);

		/******************** researchelementdefinitioncharacteristicstudyeffectivegroupmeasure ********************************************************************************/
		org.hl7.fhir.r4.model.ResearchElementDefinition.GroupMeasureEnumFactory researchelementdefinitioncharacteristicstudyeffectivegroupmeasure =  new org.hl7.fhir.r4.model.ResearchElementDefinition.GroupMeasureEnumFactory();
		researchelementdefinitioncharacteristic.setStudyEffectiveGroupMeasure(researchelementdefinitioncharacteristicstudyeffectivegroupmeasure.fromCode(r.getRsrchElmntDfnCrctrstcStdyEfctiveGrpMsr()));

//		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveGrpMsrElmnt ********************************************************************************/
//		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveGrpMsrElmnt() != null) {
//			researchelementdefinitioncharacteristic.setStudyEffectiveGroupMeasureElement(r.getRsrchElmntDfnCrctrstcStdyEfctiveGrpMsrElmnt());
//		}
		/******************** researchelementdefinitioncharacteristicstudyeffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchelementdefinitioncharacteristicstudyeffectiveperiod =  new org.hl7.fhir.r4.model.Period();
		researchelementdefinitioncharacteristic.setStudyEffective(researchelementdefinitioncharacteristicstudyeffectiveperiod);

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctivePrd_End ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctivePrdEnd() != null) {
			java.text.SimpleDateFormat RsrchElmntDfn_Crctrstc_StdyEfctivePrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchElmntDfn_Crctrstc_StdyEfctivePrd_Enddate = RsrchElmntDfn_Crctrstc_StdyEfctivePrd_Endsdf.parse(r.getRsrchElmntDfnCrctrstcStdyEfctivePrdEnd());
			researchelementdefinitioncharacteristicstudyeffectiveperiod.setEnd(RsrchElmntDfn_Crctrstc_StdyEfctivePrd_Enddate);
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctivePrd_Strt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctivePrdStrt() != null) {
			java.text.SimpleDateFormat RsrchElmntDfn_Crctrstc_StdyEfctivePrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchElmntDfn_Crctrstc_StdyEfctivePrd_Strtdate = RsrchElmntDfn_Crctrstc_StdyEfctivePrd_Strtsdf.parse(r.getRsrchElmntDfnCrctrstcStdyEfctivePrdStrt());
			researchelementdefinitioncharacteristicstudyeffectiveperiod.setStart(RsrchElmntDfn_Crctrstc_StdyEfctivePrd_Strtdate);
		}
		/******************** researchelementdefinitioncharacteristicstudyeffectivetimefromstart ********************************************************************************/
		org.hl7.fhir.r4.model.Duration researchelementdefinitioncharacteristicstudyeffectivetimefromstart =  new org.hl7.fhir.r4.model.Duration();
		researchelementdefinitioncharacteristic.setStudyEffectiveTimeFromStart(researchelementdefinitioncharacteristicstudyeffectivetimefromstart);

		/******************** researchelementdefinitioncharacteristicstudyeffectivetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing researchelementdefinitioncharacteristicstudyeffectivetiming =  new org.hl7.fhir.r4.model.Timing();
		researchelementdefinitioncharacteristic.setStudyEffective(researchelementdefinitioncharacteristicstudyeffectivetiming);

		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchelementdefinitioncharacteristicstudyeffectivetimingcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		researchelementdefinitioncharacteristicstudyeffectivetiming.setCode(researchelementdefinitioncharacteristicstudyeffectivetimingcode);

		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchelementdefinitioncharacteristicstudyeffectivetimingcodecoding =  new org.hl7.fhir.r4.model.Coding();
		researchelementdefinitioncharacteristicstudyeffectivetimingcode.addCoding(researchelementdefinitioncharacteristicstudyeffectivetimingcodecoding);

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Cd_Cdg_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgCd() != null) {
			researchelementdefinitioncharacteristicstudyeffectivetimingcodecoding.setCode(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgCd());
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgDsply() != null) {
			researchelementdefinitioncharacteristicstudyeffectivetimingcodecoding.setDisplay(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgDsply());
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Cd_Cdg_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgSys() != null) {
			researchelementdefinitioncharacteristicstudyeffectivetimingcodecoding.setSystem(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgSys());
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgUsrSltd() != null) {
			researchelementdefinitioncharacteristicstudyeffectivetimingcodecoding.setUserSelected(Boolean.parseBoolean(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgUsrSltd()));
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgVrsn() != null) {
			researchelementdefinitioncharacteristicstudyeffectivetimingcodecoding.setVersion(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgCdCdgVrsn());
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Cd_Txt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgCdTxt() != null) {
			researchelementdefinitioncharacteristicstudyeffectivetimingcode.setText(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgCdTxt());
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Evnt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgEvnt() != null) {
			java.text.SimpleDateFormat RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Evntsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Evntdate = RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Evntsdf.parse(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgEvnt());
			researchelementdefinitioncharacteristicstudyeffectivetiming.addEvent(RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Evntdate);
		}
		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent researchelementdefinitioncharacteristicstudyeffectivetimingrepeat =  new org.hl7.fhir.r4.model.Timing.TimingRepeatComponent();
		researchelementdefinitioncharacteristicstudyeffectivetiming.setRepeat(researchelementdefinitioncharacteristicstudyeffectivetimingrepeat);

		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsduration =  new org.hl7.fhir.r4.model.Duration();
		researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.setBounds(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsduration);

		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsperiod =  new org.hl7.fhir.r4.model.Period();
		researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.setBounds(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsperiod);

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsPrdEnd() != null) {
			java.text.SimpleDateFormat RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsPrd_Enddate = RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsPrd_Endsdf.parse(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsPrdEnd());
			researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsperiod.setEnd(RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsPrd_Enddate);
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsPrdStrt() != null) {
			java.text.SimpleDateFormat RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsPrd_Strtdate = RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsPrd_Strtsdf.parse(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsPrdStrt());
			researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsperiod.setStart(RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsPrd_Strtdate);
		}
		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrange =  new org.hl7.fhir.r4.model.Range();
		researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.setBounds(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrange);

		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrange.setHigh(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehigh);

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiCd() != null) {
			researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehigh.setCode(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiCd());
		}
		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehigh.setComparator(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehighcomparator.fromCode(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiCmprtr()));

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiSys() != null) {
			researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehigh.setSystem(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiSys());
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiUnt() != null) {
			researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehigh.setUnit(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiUnt());
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiVl() != null) {
			researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangehigh.setValue(Double.parseDouble((r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngHiVl())));
		}
		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelow =  new org.hl7.fhir.r4.model.Quantity();
		researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrange.setLow(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelow);

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwCd() != null) {
			researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelow.setCode(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwCd());
		}
		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelow.setComparator(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelowcomparator.fromCode(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwCmprtr()));

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwSys() != null) {
			researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelow.setSystem(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwSys());
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwUnt() != null) {
			researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelow.setUnit(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwUnt());
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwVl() != null) {
			researchelementdefinitioncharacteristicstudyeffectivetimingrepeatboundsrangelow.setValue(Double.parseDouble((r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptBndsRngLwVl())));
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_Cnt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptCnt() != null) {
			researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.setCount(Integer.parseInt(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptCnt()));
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_CntMx ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptCntMx() != null) {
			researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.setCountMax(Integer.parseInt(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptCntMx()));
		}
		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingrepeatdayofweek ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory researchelementdefinitioncharacteristicstudyeffectivetimingrepeatdayofweek =  new org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory();
		researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.addDayOfWeek(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatdayofweek.fromCode(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptDayOfWeek()));

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_Duration ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptDuration() != null) {
			researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.setDuration(Double.parseDouble((r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptDuration())));
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_DurationMx ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptDurationMx() != null) {
			researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.setDurationMax(Double.parseDouble((r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptDurationMx())));
		}
		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory researchelementdefinitioncharacteristicstudyeffectivetimingrepeatdurationunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.setDurationUnit(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatdurationunit.fromCode(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptDurationUnt()));

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_Frqncy ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptFrqncy() != null) {
			researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.setFrequency(Integer.parseInt(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptFrqncy()));
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_FrqncyMx ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptFrqncyMx() != null) {
			researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.setFrequencyMax(Integer.parseInt(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptFrqncyMx()));
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_Off ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptOff() != null) {
			researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.setOffset(Integer.parseInt(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptOff()));
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_Prd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptPrd() != null) {
			researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.setPeriod(Double.parseDouble((r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptPrd())));
		}
		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_PrdMx ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptPrdMx() != null) {
			researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.setPeriodMax(Double.parseDouble((r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptPrdMx())));
		}
		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory researchelementdefinitioncharacteristicstudyeffectivetimingrepeatperiodunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.setPeriodUnit(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatperiodunit.fromCode(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptPrdUnt()));

		/******************** RsrchElmntDfn_Crctrstc_StdyEfctiveTmg_Rpt_TimeOfDay ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptTimeOfDay() != null) {
			researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.addTimeOfDay(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptTimeOfDay());
		}
		/******************** researchelementdefinitioncharacteristicstudyeffectivetimingrepeatwhen ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory researchelementdefinitioncharacteristicstudyeffectivetimingrepeatwhen =  new org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory();
		researchelementdefinitioncharacteristicstudyeffectivetimingrepeat.addWhen(researchelementdefinitioncharacteristicstudyeffectivetimingrepeatwhen.fromCode(r.getRsrchElmntDfnCrctrstcStdyEfctiveTmgRptWhen()));

		/******************** researchelementdefinitioncharacteristicunitofmeasure ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchelementdefinitioncharacteristicunitofmeasure =  new org.hl7.fhir.r4.model.CodeableConcept();
		researchelementdefinitioncharacteristic.setUnitOfMeasure(researchelementdefinitioncharacteristicunitofmeasure);

		/******************** researchelementdefinitioncharacteristicunitofmeasurecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchelementdefinitioncharacteristicunitofmeasurecoding =  new org.hl7.fhir.r4.model.Coding();
		researchelementdefinitioncharacteristicunitofmeasure.addCoding(researchelementdefinitioncharacteristicunitofmeasurecoding);

		/******************** RsrchElmntDfn_Crctrstc_UntOfMsr_Cdg_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUntOfMsrCdgCd() != null) {
			researchelementdefinitioncharacteristicunitofmeasurecoding.setCode(r.getRsrchElmntDfnCrctrstcUntOfMsrCdgCd());
		}
		/******************** RsrchElmntDfn_Crctrstc_UntOfMsr_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUntOfMsrCdgDsply() != null) {
			researchelementdefinitioncharacteristicunitofmeasurecoding.setDisplay(r.getRsrchElmntDfnCrctrstcUntOfMsrCdgDsply());
		}
		/******************** RsrchElmntDfn_Crctrstc_UntOfMsr_Cdg_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUntOfMsrCdgSys() != null) {
			researchelementdefinitioncharacteristicunitofmeasurecoding.setSystem(r.getRsrchElmntDfnCrctrstcUntOfMsrCdgSys());
		}
		/******************** RsrchElmntDfn_Crctrstc_UntOfMsr_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUntOfMsrCdgUsrSltd() != null) {
			researchelementdefinitioncharacteristicunitofmeasurecoding.setUserSelected(Boolean.parseBoolean(r.getRsrchElmntDfnCrctrstcUntOfMsrCdgUsrSltd()));
		}
		/******************** RsrchElmntDfn_Crctrstc_UntOfMsr_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUntOfMsrCdgVrsn() != null) {
			researchelementdefinitioncharacteristicunitofmeasurecoding.setVersion(r.getRsrchElmntDfnCrctrstcUntOfMsrCdgVrsn());
		}
		/******************** RsrchElmntDfn_Crctrstc_UntOfMsr_Txt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUntOfMsrTxt() != null) {
			researchelementdefinitioncharacteristicunitofmeasure.setText(r.getRsrchElmntDfnCrctrstcUntOfMsrTxt());
		}
		/******************** researchelementdefinitioncharacteristicusagecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext researchelementdefinitioncharacteristicusagecontext =  new org.hl7.fhir.r4.model.UsageContext();
		researchelementdefinitioncharacteristic.addUsageContext(researchelementdefinitioncharacteristicusagecontext);

		/******************** researchelementdefinitioncharacteristicusagecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchelementdefinitioncharacteristicusagecontextcode =  new org.hl7.fhir.r4.model.Coding();
		researchelementdefinitioncharacteristicusagecontext.setCode(researchelementdefinitioncharacteristicusagecontextcode);

		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_Cd_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtCdCd() != null) {
			researchelementdefinitioncharacteristicusagecontextcode.setCode(r.getRsrchElmntDfnCrctrstcUsgCntxtCdCd());
		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_Cd_Dsply ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtCdDsply() != null) {
			researchelementdefinitioncharacteristicusagecontextcode.setDisplay(r.getRsrchElmntDfnCrctrstcUsgCntxtCdDsply());
		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_Cd_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtCdSys() != null) {
			researchelementdefinitioncharacteristicusagecontextcode.setSystem(r.getRsrchElmntDfnCrctrstcUsgCntxtCdSys());
		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_Cd_UsrSltd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtCdUsrSltd() != null) {
			researchelementdefinitioncharacteristicusagecontextcode.setUserSelected(Boolean.parseBoolean(r.getRsrchElmntDfnCrctrstcUsgCntxtCdUsrSltd()));
		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_Cd_Vrsn ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtCdVrsn() != null) {
			researchelementdefinitioncharacteristicusagecontextcode.setVersion(r.getRsrchElmntDfnCrctrstcUsgCntxtCdVrsn());
		}
		/******************** researchelementdefinitioncharacteristicusagecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchelementdefinitioncharacteristicusagecontextvaluecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		researchelementdefinitioncharacteristicusagecontext.setValue(researchelementdefinitioncharacteristicusagecontextvaluecodeableconcept);

		/******************** researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		researchelementdefinitioncharacteristicusagecontextvaluecodeableconcept.addCoding(researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcoding);

		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgCd() != null) {
			researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcoding.setCode(r.getRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgCd());
		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgDsply() != null) {
			researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcoding.setDisplay(r.getRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgDsply());
		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgSys() != null) {
			researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcoding.setSystem(r.getRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgSys());
		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgUsrSltd() != null) {
			researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(r.getRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgUsrSltd()));
		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgVrsn() != null) {
			researchelementdefinitioncharacteristicusagecontextvaluecodeableconceptcoding.setVersion(r.getRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptCdgVrsn());
		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptTxt() != null) {
			researchelementdefinitioncharacteristicusagecontextvaluecodeableconcept.setText(r.getRsrchElmntDfnCrctrstcUsgCntxtVlCdbleCncptTxt());
		}
		/******************** researchelementdefinitioncharacteristicusagecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchelementdefinitioncharacteristicusagecontextvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		researchelementdefinitioncharacteristicusagecontext.setValue(researchelementdefinitioncharacteristicusagecontextvaluequantity);

		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlQnty_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlQntyCd() != null) {
			researchelementdefinitioncharacteristicusagecontextvaluequantity.setCode(r.getRsrchElmntDfnCrctrstcUsgCntxtVlQntyCd());
		}
		/******************** researchelementdefinitioncharacteristicusagecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory researchelementdefinitioncharacteristicusagecontextvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		researchelementdefinitioncharacteristicusagecontextvaluequantity.setComparator(researchelementdefinitioncharacteristicusagecontextvaluequantitycomparator.fromCode(r.getRsrchElmntDfnCrctrstcUsgCntxtVlQntyCmprtr()));

		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlQnty_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlQntySys() != null) {
			researchelementdefinitioncharacteristicusagecontextvaluequantity.setSystem(r.getRsrchElmntDfnCrctrstcUsgCntxtVlQntySys());
		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlQnty_Unt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlQntyUnt() != null) {
			researchelementdefinitioncharacteristicusagecontextvaluequantity.setUnit(r.getRsrchElmntDfnCrctrstcUsgCntxtVlQntyUnt());
		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlQnty_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlQntyVl() != null) {
			researchelementdefinitioncharacteristicusagecontextvaluequantity.setValue(Double.parseDouble((r.getRsrchElmntDfnCrctrstcUsgCntxtVlQntyVl())));
		}
		/******************** researchelementdefinitioncharacteristicusagecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range researchelementdefinitioncharacteristicusagecontextvaluerange =  new org.hl7.fhir.r4.model.Range();
		researchelementdefinitioncharacteristicusagecontext.setValue(researchelementdefinitioncharacteristicusagecontextvaluerange);

		/******************** researchelementdefinitioncharacteristicusagecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchelementdefinitioncharacteristicusagecontextvaluerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		researchelementdefinitioncharacteristicusagecontextvaluerange.setHigh(researchelementdefinitioncharacteristicusagecontextvaluerangehigh);

		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngHiCd() != null) {
			researchelementdefinitioncharacteristicusagecontextvaluerangehigh.setCode(r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngHiCd());
		}
		/******************** researchelementdefinitioncharacteristicusagecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory researchelementdefinitioncharacteristicusagecontextvaluerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		researchelementdefinitioncharacteristicusagecontextvaluerangehigh.setComparator(researchelementdefinitioncharacteristicusagecontextvaluerangehighcomparator.fromCode(r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngHiCmprtr()));

		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngHiSys() != null) {
			researchelementdefinitioncharacteristicusagecontextvaluerangehigh.setSystem(r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngHiSys());
		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngHiUnt() != null) {
			researchelementdefinitioncharacteristicusagecontextvaluerangehigh.setUnit(r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngHiUnt());
		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngHiVl() != null) {
			researchelementdefinitioncharacteristicusagecontextvaluerangehigh.setValue(Double.parseDouble((r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngHiVl())));
		}
		/******************** researchelementdefinitioncharacteristicusagecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchelementdefinitioncharacteristicusagecontextvaluerangelow =  new org.hl7.fhir.r4.model.Quantity();
		researchelementdefinitioncharacteristicusagecontextvaluerange.setLow(researchelementdefinitioncharacteristicusagecontextvaluerangelow);

		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngLwCd() != null) {
			researchelementdefinitioncharacteristicusagecontextvaluerangelow.setCode(r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngLwCd());
		}
		/******************** researchelementdefinitioncharacteristicusagecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory researchelementdefinitioncharacteristicusagecontextvaluerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		researchelementdefinitioncharacteristicusagecontextvaluerangelow.setComparator(researchelementdefinitioncharacteristicusagecontextvaluerangelowcomparator.fromCode(r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngLwCmprtr()));

		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngLwSys() != null) {
			researchelementdefinitioncharacteristicusagecontextvaluerangelow.setSystem(r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngLwSys());
		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngLwUnt() != null) {
			researchelementdefinitioncharacteristicusagecontextvaluerangelow.setUnit(r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngLwUnt());
		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngLwVl() != null) {
			researchelementdefinitioncharacteristicusagecontextvaluerangelow.setValue(Double.parseDouble((r.getRsrchElmntDfnCrctrstcUsgCntxtVlRngLwVl())));
		}
		/******************** RsrchElmntDfn_Crctrstc_UsgCntxt_VlRfrnc ********************************************************************************/
		if(r.getRsrchElmntDfnCrctrstcUsgCntxtVlRfrnc() != null) {
			researchelementdefinitioncharacteristicusagecontext.setValue( new org.hl7.fhir.r4.model.Reference(r.getRsrchElmntDfnCrctrstcUsgCntxtVlRfrnc()));
		}
		/******************** RsrchElmntDfn_Comment ********************************************************************************/
		if(r.getRsrchElmntDfnComment() != null) {
			researchelementdefinition.addComment(r.getRsrchElmntDfnComment());
		}
		/******************** researchelementdefinitioncontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail researchelementdefinitioncontact =  new org.hl7.fhir.r4.model.ContactDetail();
		researchelementdefinition.addContact(researchelementdefinitioncontact);

		/******************** RsrchElmntDfn_Cntct_Nm ********************************************************************************/
		if(r.getRsrchElmntDfnCntctNm() != null) {
			researchelementdefinitioncontact.setName(r.getRsrchElmntDfnCntctNm());
		}
		/******************** researchelementdefinitioncontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint researchelementdefinitioncontacttelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		researchelementdefinitioncontact.addTelecom(researchelementdefinitioncontacttelecom);

		/******************** researchelementdefinitioncontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchelementdefinitioncontacttelecomperiod =  new org.hl7.fhir.r4.model.Period();
		researchelementdefinitioncontacttelecom.setPeriod(researchelementdefinitioncontacttelecomperiod);

		/******************** RsrchElmntDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(r.getRsrchElmntDfnCntctTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat RsrchElmntDfn_Cntct_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchElmntDfn_Cntct_Tlcm_Prd_Enddate = RsrchElmntDfn_Cntct_Tlcm_Prd_Endsdf.parse(r.getRsrchElmntDfnCntctTlcmPrdEnd());
			researchelementdefinitioncontacttelecomperiod.setEnd(RsrchElmntDfn_Cntct_Tlcm_Prd_Enddate);
		}
		/******************** RsrchElmntDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(r.getRsrchElmntDfnCntctTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat RsrchElmntDfn_Cntct_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchElmntDfn_Cntct_Tlcm_Prd_Strtdate = RsrchElmntDfn_Cntct_Tlcm_Prd_Strtsdf.parse(r.getRsrchElmntDfnCntctTlcmPrdStrt());
			researchelementdefinitioncontacttelecomperiod.setStart(RsrchElmntDfn_Cntct_Tlcm_Prd_Strtdate);
		}
		/******************** RsrchElmntDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(r.getRsrchElmntDfnCntctTlcmRnk() != null) {
			researchelementdefinitioncontacttelecom.setRank(Integer.parseInt(r.getRsrchElmntDfnCntctTlcmRnk()));
		}
		/******************** researchelementdefinitioncontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory researchelementdefinitioncontacttelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		researchelementdefinitioncontacttelecom.setSystem(researchelementdefinitioncontacttelecomsystem.fromCode(r.getRsrchElmntDfnCntctTlcmSys()));

		/******************** researchelementdefinitioncontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory researchelementdefinitioncontacttelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		researchelementdefinitioncontacttelecom.setUse(researchelementdefinitioncontacttelecomuse.fromCode(r.getRsrchElmntDfnCntctTlcmUse()));

		/******************** RsrchElmntDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnCntctTlcmVl() != null) {
			researchelementdefinitioncontacttelecom.setValue(r.getRsrchElmntDfnCntctTlcmVl());
		}
		/******************** RsrchElmntDfn_Copyright ********************************************************************************/
		if(r.getRsrchElmntDfnCopyright() != null) {
			researchelementdefinition.setCopyright(r.getRsrchElmntDfnCopyright());
		}
		/******************** RsrchElmntDfn_Dt ********************************************************************************/
		if(r.getRsrchElmntDfnDt() != null) {
			java.text.SimpleDateFormat RsrchElmntDfn_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchElmntDfn_Dtdate = RsrchElmntDfn_Dtsdf.parse(r.getRsrchElmntDfnDt());
			researchelementdefinition.setDate(RsrchElmntDfn_Dtdate);
		}
		/******************** RsrchElmntDfn_Dscrptn ********************************************************************************/
		if(r.getRsrchElmntDfnDscrptn() != null) {
			researchelementdefinition.setDescription(r.getRsrchElmntDfnDscrptn());
		}
		/******************** researchelementdefinitioneditor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail researchelementdefinitioneditor =  new org.hl7.fhir.r4.model.ContactDetail();
		researchelementdefinition.addEditor(researchelementdefinitioneditor);

		/******************** RsrchElmntDfn_Editor_Nm ********************************************************************************/
		if(r.getRsrchElmntDfnEditorNm() != null) {
			researchelementdefinitioneditor.setName(r.getRsrchElmntDfnEditorNm());
		}
		/******************** researchelementdefinitioneditortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint researchelementdefinitioneditortelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		researchelementdefinitioneditor.addTelecom(researchelementdefinitioneditortelecom);

		/******************** researchelementdefinitioneditortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchelementdefinitioneditortelecomperiod =  new org.hl7.fhir.r4.model.Period();
		researchelementdefinitioneditortelecom.setPeriod(researchelementdefinitioneditortelecomperiod);

		/******************** RsrchElmntDfn_Editor_Tlcm_Prd_End ********************************************************************************/
		if(r.getRsrchElmntDfnEditorTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat RsrchElmntDfn_Editor_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchElmntDfn_Editor_Tlcm_Prd_Enddate = RsrchElmntDfn_Editor_Tlcm_Prd_Endsdf.parse(r.getRsrchElmntDfnEditorTlcmPrdEnd());
			researchelementdefinitioneditortelecomperiod.setEnd(RsrchElmntDfn_Editor_Tlcm_Prd_Enddate);
		}
		/******************** RsrchElmntDfn_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(r.getRsrchElmntDfnEditorTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat RsrchElmntDfn_Editor_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchElmntDfn_Editor_Tlcm_Prd_Strtdate = RsrchElmntDfn_Editor_Tlcm_Prd_Strtsdf.parse(r.getRsrchElmntDfnEditorTlcmPrdStrt());
			researchelementdefinitioneditortelecomperiod.setStart(RsrchElmntDfn_Editor_Tlcm_Prd_Strtdate);
		}
		/******************** RsrchElmntDfn_Editor_Tlcm_Rnk ********************************************************************************/
		if(r.getRsrchElmntDfnEditorTlcmRnk() != null) {
			researchelementdefinitioneditortelecom.setRank(Integer.parseInt(r.getRsrchElmntDfnEditorTlcmRnk()));
		}
		/******************** researchelementdefinitioneditortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory researchelementdefinitioneditortelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		researchelementdefinitioneditortelecom.setSystem(researchelementdefinitioneditortelecomsystem.fromCode(r.getRsrchElmntDfnEditorTlcmSys()));

		/******************** researchelementdefinitioneditortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory researchelementdefinitioneditortelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		researchelementdefinitioneditortelecom.setUse(researchelementdefinitioneditortelecomuse.fromCode(r.getRsrchElmntDfnEditorTlcmUse()));

		/******************** RsrchElmntDfn_Editor_Tlcm_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnEditorTlcmVl() != null) {
			researchelementdefinitioneditortelecom.setValue(r.getRsrchElmntDfnEditorTlcmVl());
		}
		/******************** researchelementdefinitioneffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchelementdefinitioneffectiveperiod =  new org.hl7.fhir.r4.model.Period();
		researchelementdefinition.setEffectivePeriod(researchelementdefinitioneffectiveperiod);

		/******************** RsrchElmntDfn_EfctivePrd_End ********************************************************************************/
		if(r.getRsrchElmntDfnEfctivePrdEnd() != null) {
			java.text.SimpleDateFormat RsrchElmntDfn_EfctivePrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchElmntDfn_EfctivePrd_Enddate = RsrchElmntDfn_EfctivePrd_Endsdf.parse(r.getRsrchElmntDfnEfctivePrdEnd());
			researchelementdefinitioneffectiveperiod.setEnd(RsrchElmntDfn_EfctivePrd_Enddate);
		}
		/******************** RsrchElmntDfn_EfctivePrd_Strt ********************************************************************************/
		if(r.getRsrchElmntDfnEfctivePrdStrt() != null) {
			java.text.SimpleDateFormat RsrchElmntDfn_EfctivePrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchElmntDfn_EfctivePrd_Strtdate = RsrchElmntDfn_EfctivePrd_Strtsdf.parse(r.getRsrchElmntDfnEfctivePrdStrt());
			researchelementdefinitioneffectiveperiod.setStart(RsrchElmntDfn_EfctivePrd_Strtdate);
		}
		/******************** researchelementdefinitionendorser ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail researchelementdefinitionendorser =  new org.hl7.fhir.r4.model.ContactDetail();
		researchelementdefinition.addEndorser(researchelementdefinitionendorser);

		/******************** RsrchElmntDfn_Endsr_Nm ********************************************************************************/
		if(r.getRsrchElmntDfnEndsrNm() != null) {
			researchelementdefinitionendorser.setName(r.getRsrchElmntDfnEndsrNm());
		}
		/******************** researchelementdefinitionendorsertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint researchelementdefinitionendorsertelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		researchelementdefinitionendorser.addTelecom(researchelementdefinitionendorsertelecom);

		/******************** researchelementdefinitionendorsertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchelementdefinitionendorsertelecomperiod =  new org.hl7.fhir.r4.model.Period();
		researchelementdefinitionendorsertelecom.setPeriod(researchelementdefinitionendorsertelecomperiod);

		/******************** RsrchElmntDfn_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(r.getRsrchElmntDfnEndsrTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat RsrchElmntDfn_Endsr_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchElmntDfn_Endsr_Tlcm_Prd_Enddate = RsrchElmntDfn_Endsr_Tlcm_Prd_Endsdf.parse(r.getRsrchElmntDfnEndsrTlcmPrdEnd());
			researchelementdefinitionendorsertelecomperiod.setEnd(RsrchElmntDfn_Endsr_Tlcm_Prd_Enddate);
		}
		/******************** RsrchElmntDfn_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(r.getRsrchElmntDfnEndsrTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat RsrchElmntDfn_Endsr_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchElmntDfn_Endsr_Tlcm_Prd_Strtdate = RsrchElmntDfn_Endsr_Tlcm_Prd_Strtsdf.parse(r.getRsrchElmntDfnEndsrTlcmPrdStrt());
			researchelementdefinitionendorsertelecomperiod.setStart(RsrchElmntDfn_Endsr_Tlcm_Prd_Strtdate);
		}
		/******************** RsrchElmntDfn_Endsr_Tlcm_Rnk ********************************************************************************/
		if(r.getRsrchElmntDfnEndsrTlcmRnk() != null) {
			researchelementdefinitionendorsertelecom.setRank(Integer.parseInt(r.getRsrchElmntDfnEndsrTlcmRnk()));
		}
		/******************** researchelementdefinitionendorsertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory researchelementdefinitionendorsertelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		researchelementdefinitionendorsertelecom.setSystem(researchelementdefinitionendorsertelecomsystem.fromCode(r.getRsrchElmntDfnEndsrTlcmSys()));

		/******************** researchelementdefinitionendorsertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory researchelementdefinitionendorsertelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		researchelementdefinitionendorsertelecom.setUse(researchelementdefinitionendorsertelecomuse.fromCode(r.getRsrchElmntDfnEndsrTlcmUse()));

		/******************** RsrchElmntDfn_Endsr_Tlcm_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnEndsrTlcmVl() != null) {
			researchelementdefinitionendorsertelecom.setValue(r.getRsrchElmntDfnEndsrTlcmVl());
		}
		/******************** RsrchElmntDfn_Exprmtl ********************************************************************************/
		if(r.getRsrchElmntDfnExprmtl() != null) {
			researchelementdefinition.setExperimental(Boolean.parseBoolean(r.getRsrchElmntDfnExprmtl()));
		}
		/******************** researchelementdefinitionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier researchelementdefinitionidentifier =  new org.hl7.fhir.r4.model.Identifier();
		researchelementdefinition.addIdentifier(researchelementdefinitionidentifier);

		/******************** RsrchElmntDfn_Id_Assigner ********************************************************************************/
		if(r.getRsrchElmntDfnIdAssigner() != null) {
			researchelementdefinitionidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(r.getRsrchElmntDfnIdAssigner()));
		}
		/******************** researchelementdefinitionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchelementdefinitionidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		researchelementdefinitionidentifier.setPeriod(researchelementdefinitionidentifierperiod);

		/******************** RsrchElmntDfn_Id_Prd_End ********************************************************************************/
		if(r.getRsrchElmntDfnIdPrdEnd() != null) {
			java.text.SimpleDateFormat RsrchElmntDfn_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchElmntDfn_Id_Prd_Enddate = RsrchElmntDfn_Id_Prd_Endsdf.parse(r.getRsrchElmntDfnIdPrdEnd());
			researchelementdefinitionidentifierperiod.setEnd(RsrchElmntDfn_Id_Prd_Enddate);
		}
		/******************** RsrchElmntDfn_Id_Prd_Strt ********************************************************************************/
		if(r.getRsrchElmntDfnIdPrdStrt() != null) {
			java.text.SimpleDateFormat RsrchElmntDfn_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchElmntDfn_Id_Prd_Strtdate = RsrchElmntDfn_Id_Prd_Strtsdf.parse(r.getRsrchElmntDfnIdPrdStrt());
			researchelementdefinitionidentifierperiod.setStart(RsrchElmntDfn_Id_Prd_Strtdate);
		}
		/******************** RsrchElmntDfn_Id_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnIdSys() != null) {
			researchelementdefinitionidentifier.setSystem(r.getRsrchElmntDfnIdSys());
		}
		/******************** researchelementdefinitionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchelementdefinitionidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		researchelementdefinitionidentifier.setType(researchelementdefinitionidentifiertype);

		/******************** researchelementdefinitionidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchelementdefinitionidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		researchelementdefinitionidentifiertype.addCoding(researchelementdefinitionidentifiertypecoding);

		/******************** RsrchElmntDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnIdTypCdgCd() != null) {
			researchelementdefinitionidentifiertypecoding.setCode(r.getRsrchElmntDfnIdTypCdgCd());
		}
		/******************** RsrchElmntDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchElmntDfnIdTypCdgDsply() != null) {
			researchelementdefinitionidentifiertypecoding.setDisplay(r.getRsrchElmntDfnIdTypCdgDsply());
		}
		/******************** RsrchElmntDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnIdTypCdgSys() != null) {
			researchelementdefinitionidentifiertypecoding.setSystem(r.getRsrchElmntDfnIdTypCdgSys());
		}
		/******************** RsrchElmntDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchElmntDfnIdTypCdgUsrSltd() != null) {
			researchelementdefinitionidentifiertypecoding.setUserSelected(Boolean.parseBoolean(r.getRsrchElmntDfnIdTypCdgUsrSltd()));
		}
		/******************** RsrchElmntDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchElmntDfnIdTypCdgVrsn() != null) {
			researchelementdefinitionidentifiertypecoding.setVersion(r.getRsrchElmntDfnIdTypCdgVrsn());
		}
		/******************** RsrchElmntDfn_Id_Typ_Txt ********************************************************************************/
		if(r.getRsrchElmntDfnIdTypTxt() != null) {
			researchelementdefinitionidentifiertype.setText(r.getRsrchElmntDfnIdTypTxt());
		}
		/******************** researchelementdefinitionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory researchelementdefinitionidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		researchelementdefinitionidentifier.setUse(researchelementdefinitionidentifieruse.fromCode(r.getRsrchElmntDfnIdUse()));

		/******************** RsrchElmntDfn_Id_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnIdVl() != null) {
			researchelementdefinitionidentifier.setValue(r.getRsrchElmntDfnIdVl());
		}
		/******************** researchelementdefinitionjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchelementdefinitionjurisdiction =  new org.hl7.fhir.r4.model.CodeableConcept();
		researchelementdefinition.addJurisdiction(researchelementdefinitionjurisdiction);

		/******************** researchelementdefinitionjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchelementdefinitionjurisdictioncoding =  new org.hl7.fhir.r4.model.Coding();
		researchelementdefinitionjurisdiction.addCoding(researchelementdefinitionjurisdictioncoding);

		/******************** RsrchElmntDfn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnJrsdctnCdgCd() != null) {
			researchelementdefinitionjurisdictioncoding.setCode(r.getRsrchElmntDfnJrsdctnCdgCd());
		}
		/******************** RsrchElmntDfn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchElmntDfnJrsdctnCdgDsply() != null) {
			researchelementdefinitionjurisdictioncoding.setDisplay(r.getRsrchElmntDfnJrsdctnCdgDsply());
		}
		/******************** RsrchElmntDfn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnJrsdctnCdgSys() != null) {
			researchelementdefinitionjurisdictioncoding.setSystem(r.getRsrchElmntDfnJrsdctnCdgSys());
		}
		/******************** RsrchElmntDfn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchElmntDfnJrsdctnCdgUsrSltd() != null) {
			researchelementdefinitionjurisdictioncoding.setUserSelected(Boolean.parseBoolean(r.getRsrchElmntDfnJrsdctnCdgUsrSltd()));
		}
		/******************** RsrchElmntDfn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchElmntDfnJrsdctnCdgVrsn() != null) {
			researchelementdefinitionjurisdictioncoding.setVersion(r.getRsrchElmntDfnJrsdctnCdgVrsn());
		}
		/******************** RsrchElmntDfn_Jrsdctn_Txt ********************************************************************************/
		if(r.getRsrchElmntDfnJrsdctnTxt() != null) {
			researchelementdefinitionjurisdiction.setText(r.getRsrchElmntDfnJrsdctnTxt());
		}
		/******************** RsrchElmntDfn_LastReviewDt ********************************************************************************/
		if(r.getRsrchElmntDfnLastReviewDt() != null) {
			java.text.SimpleDateFormat RsrchElmntDfn_LastReviewDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchElmntDfn_LastReviewDtdate = RsrchElmntDfn_LastReviewDtsdf.parse(r.getRsrchElmntDfnLastReviewDt());
			researchelementdefinition.setLastReviewDate(RsrchElmntDfn_LastReviewDtdate);
		}
		/******************** RsrchElmntDfn_Library ********************************************************************************/
		if(r.getRsrchElmntDfnLibrary() != null) {
			researchelementdefinition.addLibrary(r.getRsrchElmntDfnLibrary());
		}
		/******************** RsrchElmntDfn_Nm ********************************************************************************/
		if(r.getRsrchElmntDfnNm() != null) {
			researchelementdefinition.setName(r.getRsrchElmntDfnNm());
		}
		/******************** RsrchElmntDfn_Pblshr ********************************************************************************/
		if(r.getRsrchElmntDfnPblshr() != null) {
			researchelementdefinition.setPublisher(r.getRsrchElmntDfnPblshr());
		}
		/******************** RsrchElmntDfn_Prpse ********************************************************************************/
		if(r.getRsrchElmntDfnPrpse() != null) {
			researchelementdefinition.setPurpose(r.getRsrchElmntDfnPrpse());
		}
		/******************** researchelementdefinitionrelatedartifact ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact researchelementdefinitionrelatedartifact =  new org.hl7.fhir.r4.model.RelatedArtifact();
		researchelementdefinition.addRelatedArtifact(researchelementdefinitionrelatedartifact);

		/******************** RsrchElmntDfn_RltedArtfct_Citation ********************************************************************************/
		if(r.getRsrchElmntDfnRltedArtfctCitation() != null) {
			researchelementdefinitionrelatedartifact.setCitation(r.getRsrchElmntDfnRltedArtfctCitation());
		}
		/******************** RsrchElmntDfn_RltedArtfct_Dsply ********************************************************************************/
		if(r.getRsrchElmntDfnRltedArtfctDsply() != null) {
			researchelementdefinitionrelatedartifact.setDisplay(r.getRsrchElmntDfnRltedArtfctDsply());
		}
		/******************** researchelementdefinitionrelatedartifactdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment researchelementdefinitionrelatedartifactdocument =  new org.hl7.fhir.r4.model.Attachment();
		researchelementdefinitionrelatedartifact.setDocument(researchelementdefinitionrelatedartifactdocument);

		/******************** RsrchElmntDfn_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(r.getRsrchElmntDfnRltedArtfctDocCntntTyp() != null) {
			researchelementdefinitionrelatedartifactdocument.setContentType(r.getRsrchElmntDfnRltedArtfctDocCntntTyp());
		}
		/******************** RsrchElmntDfn_RltedArtfct_Doc_Creation ********************************************************************************/
		if(r.getRsrchElmntDfnRltedArtfctDocCreation() != null) {
			java.text.SimpleDateFormat RsrchElmntDfn_RltedArtfct_Doc_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchElmntDfn_RltedArtfct_Doc_Creationdate = RsrchElmntDfn_RltedArtfct_Doc_Creationsdf.parse(r.getRsrchElmntDfnRltedArtfctDocCreation());
			researchelementdefinitionrelatedartifactdocument.setCreation(RsrchElmntDfn_RltedArtfct_Doc_Creationdate);
		}
		/******************** RsrchElmntDfn_RltedArtfct_Doc_Data ********************************************************************************/
		if(r.getRsrchElmntDfnRltedArtfctDocData() != null) {
			researchelementdefinitionrelatedartifactdocument.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(r.getRsrchElmntDfnRltedArtfctDocData()));
		}
		/******************** RsrchElmntDfn_RltedArtfct_Doc_Hash ********************************************************************************/
		if(r.getRsrchElmntDfnRltedArtfctDocHash() != null) {
			researchelementdefinitionrelatedartifactdocument.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(r.getRsrchElmntDfnRltedArtfctDocHash()));
		}
		/******************** RsrchElmntDfn_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(r.getRsrchElmntDfnRltedArtfctDocLnguage() != null) {
			researchelementdefinitionrelatedartifactdocument.setLanguage(r.getRsrchElmntDfnRltedArtfctDocLnguage());
		}
		/******************** RsrchElmntDfn_RltedArtfct_Doc_Sz ********************************************************************************/
		if(r.getRsrchElmntDfnRltedArtfctDocSz() != null) {
			researchelementdefinitionrelatedartifactdocument.setSize(Integer.parseInt(r.getRsrchElmntDfnRltedArtfctDocSz()));
		}
		/******************** RsrchElmntDfn_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(r.getRsrchElmntDfnRltedArtfctDocTtl() != null) {
			researchelementdefinitionrelatedartifactdocument.setTitle(r.getRsrchElmntDfnRltedArtfctDocTtl());
		}
		/******************** RsrchElmntDfn_RltedArtfct_Doc_Url ********************************************************************************/
		if(r.getRsrchElmntDfnRltedArtfctDocUrl() != null) {
			researchelementdefinitionrelatedartifactdocument.setUrl(r.getRsrchElmntDfnRltedArtfctDocUrl());
		}
		/******************** RsrchElmntDfn_RltedArtfct_Lbl ********************************************************************************/
		if(r.getRsrchElmntDfnRltedArtfctLbl() != null) {
			researchelementdefinitionrelatedartifact.setLabel(r.getRsrchElmntDfnRltedArtfctLbl());
		}
		/******************** RsrchElmntDfn_RltedArtfct_Rsrc ********************************************************************************/
		if(r.getRsrchElmntDfnRltedArtfctRsrc() != null) {
			researchelementdefinitionrelatedartifact.setResource(r.getRsrchElmntDfnRltedArtfctRsrc());
		}
		/******************** researchelementdefinitionrelatedartifacttype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory researchelementdefinitionrelatedartifacttype =  new org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory();
		researchelementdefinitionrelatedartifact.setType(researchelementdefinitionrelatedartifacttype.fromCode(r.getRsrchElmntDfnRltedArtfctTyp()));

		/******************** RsrchElmntDfn_RltedArtfct_Url ********************************************************************************/
		if(r.getRsrchElmntDfnRltedArtfctUrl() != null) {
			researchelementdefinitionrelatedartifact.setUrl(r.getRsrchElmntDfnRltedArtfctUrl());
		}
		/******************** researchelementdefinitionreviewer ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail researchelementdefinitionreviewer =  new org.hl7.fhir.r4.model.ContactDetail();
		researchelementdefinition.addReviewer(researchelementdefinitionreviewer);

		/******************** RsrchElmntDfn_Rviewr_Nm ********************************************************************************/
		if(r.getRsrchElmntDfnRviewrNm() != null) {
			researchelementdefinitionreviewer.setName(r.getRsrchElmntDfnRviewrNm());
		}
		/******************** researchelementdefinitionreviewertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint researchelementdefinitionreviewertelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		researchelementdefinitionreviewer.addTelecom(researchelementdefinitionreviewertelecom);

		/******************** researchelementdefinitionreviewertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period researchelementdefinitionreviewertelecomperiod =  new org.hl7.fhir.r4.model.Period();
		researchelementdefinitionreviewertelecom.setPeriod(researchelementdefinitionreviewertelecomperiod);

		/******************** RsrchElmntDfn_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(r.getRsrchElmntDfnRviewrTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat RsrchElmntDfn_Rviewr_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchElmntDfn_Rviewr_Tlcm_Prd_Enddate = RsrchElmntDfn_Rviewr_Tlcm_Prd_Endsdf.parse(r.getRsrchElmntDfnRviewrTlcmPrdEnd());
			researchelementdefinitionreviewertelecomperiod.setEnd(RsrchElmntDfn_Rviewr_Tlcm_Prd_Enddate);
		}
		/******************** RsrchElmntDfn_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(r.getRsrchElmntDfnRviewrTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat RsrchElmntDfn_Rviewr_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RsrchElmntDfn_Rviewr_Tlcm_Prd_Strtdate = RsrchElmntDfn_Rviewr_Tlcm_Prd_Strtsdf.parse(r.getRsrchElmntDfnRviewrTlcmPrdStrt());
			researchelementdefinitionreviewertelecomperiod.setStart(RsrchElmntDfn_Rviewr_Tlcm_Prd_Strtdate);
		}
		/******************** RsrchElmntDfn_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(r.getRsrchElmntDfnRviewrTlcmRnk() != null) {
			researchelementdefinitionreviewertelecom.setRank(Integer.parseInt(r.getRsrchElmntDfnRviewrTlcmRnk()));
		}
		/******************** researchelementdefinitionreviewertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory researchelementdefinitionreviewertelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		researchelementdefinitionreviewertelecom.setSystem(researchelementdefinitionreviewertelecomsystem.fromCode(r.getRsrchElmntDfnRviewrTlcmSys()));

		/******************** researchelementdefinitionreviewertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory researchelementdefinitionreviewertelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		researchelementdefinitionreviewertelecom.setUse(researchelementdefinitionreviewertelecomuse.fromCode(r.getRsrchElmntDfnRviewrTlcmUse()));

		/******************** RsrchElmntDfn_Rviewr_Tlcm_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnRviewrTlcmVl() != null) {
			researchelementdefinitionreviewertelecom.setValue(r.getRsrchElmntDfnRviewrTlcmVl());
		}
		/******************** RsrchElmntDfn_ShortTtl ********************************************************************************/
		if(r.getRsrchElmntDfnShortTtl() != null) {
			researchelementdefinition.setShortTitle(r.getRsrchElmntDfnShortTtl());
		}
		/******************** researchelementdefinitionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory researchelementdefinitionstatus =  new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory();
		researchelementdefinition.setStatus(researchelementdefinitionstatus.fromCode(r.getRsrchElmntDfnSts()));

		/******************** researchelementdefinitionsubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchelementdefinitionsubjectcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		researchelementdefinition.setSubject(researchelementdefinitionsubjectcodeableconcept);

		/******************** researchelementdefinitionsubjectcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchelementdefinitionsubjectcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		researchelementdefinitionsubjectcodeableconcept.addCoding(researchelementdefinitionsubjectcodeableconceptcoding);

		/******************** RsrchElmntDfn_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnSbjctCdbleCncptCdgCd() != null) {
			researchelementdefinitionsubjectcodeableconceptcoding.setCode(r.getRsrchElmntDfnSbjctCdbleCncptCdgCd());
		}
		/******************** RsrchElmntDfn_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchElmntDfnSbjctCdbleCncptCdgDsply() != null) {
			researchelementdefinitionsubjectcodeableconceptcoding.setDisplay(r.getRsrchElmntDfnSbjctCdbleCncptCdgDsply());
		}
		/******************** RsrchElmntDfn_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnSbjctCdbleCncptCdgSys() != null) {
			researchelementdefinitionsubjectcodeableconceptcoding.setSystem(r.getRsrchElmntDfnSbjctCdbleCncptCdgSys());
		}
		/******************** RsrchElmntDfn_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchElmntDfnSbjctCdbleCncptCdgUsrSltd() != null) {
			researchelementdefinitionsubjectcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(r.getRsrchElmntDfnSbjctCdbleCncptCdgUsrSltd()));
		}
		/******************** RsrchElmntDfn_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchElmntDfnSbjctCdbleCncptCdgVrsn() != null) {
			researchelementdefinitionsubjectcodeableconceptcoding.setVersion(r.getRsrchElmntDfnSbjctCdbleCncptCdgVrsn());
		}
		/******************** RsrchElmntDfn_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(r.getRsrchElmntDfnSbjctCdbleCncptTxt() != null) {
			researchelementdefinitionsubjectcodeableconcept.setText(r.getRsrchElmntDfnSbjctCdbleCncptTxt());
		}
		/******************** RsrchElmntDfn_SbjctRfrnc ********************************************************************************/
		if(r.getRsrchElmntDfnSbjctRfrnc() != null) {
			researchelementdefinition.setSubject( new org.hl7.fhir.r4.model.Reference(r.getRsrchElmntDfnSbjctRfrnc()));
		}
		/******************** RsrchElmntDfn_Subtitle ********************************************************************************/
		if(r.getRsrchElmntDfnSubtitle() != null) {
			researchelementdefinition.setSubtitle(r.getRsrchElmntDfnSubtitle());
		}
		/******************** RsrchElmntDfn_Ttl ********************************************************************************/
		if(r.getRsrchElmntDfnTtl() != null) {
			researchelementdefinition.setTitle(r.getRsrchElmntDfnTtl());
		}
		/******************** researchelementdefinitiontopic ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchelementdefinitiontopic =  new org.hl7.fhir.r4.model.CodeableConcept();
		researchelementdefinition.addTopic(researchelementdefinitiontopic);

		/******************** researchelementdefinitiontopiccoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchelementdefinitiontopiccoding =  new org.hl7.fhir.r4.model.Coding();
		researchelementdefinitiontopic.addCoding(researchelementdefinitiontopiccoding);

		/******************** RsrchElmntDfn_Topic_Cdg_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnTopicCdgCd() != null) {
			researchelementdefinitiontopiccoding.setCode(r.getRsrchElmntDfnTopicCdgCd());
		}
		/******************** RsrchElmntDfn_Topic_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchElmntDfnTopicCdgDsply() != null) {
			researchelementdefinitiontopiccoding.setDisplay(r.getRsrchElmntDfnTopicCdgDsply());
		}
		/******************** RsrchElmntDfn_Topic_Cdg_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnTopicCdgSys() != null) {
			researchelementdefinitiontopiccoding.setSystem(r.getRsrchElmntDfnTopicCdgSys());
		}
		/******************** RsrchElmntDfn_Topic_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchElmntDfnTopicCdgUsrSltd() != null) {
			researchelementdefinitiontopiccoding.setUserSelected(Boolean.parseBoolean(r.getRsrchElmntDfnTopicCdgUsrSltd()));
		}
		/******************** RsrchElmntDfn_Topic_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchElmntDfnTopicCdgVrsn() != null) {
			researchelementdefinitiontopiccoding.setVersion(r.getRsrchElmntDfnTopicCdgVrsn());
		}
		/******************** RsrchElmntDfn_Topic_Txt ********************************************************************************/
		if(r.getRsrchElmntDfnTopicTxt() != null) {
			researchelementdefinitiontopic.setText(r.getRsrchElmntDfnTopicTxt());
		}
		/******************** researchelementdefinitiontype ********************************************************************************/
		org.hl7.fhir.r4.model.ResearchElementDefinition.ResearchElementTypeEnumFactory researchelementdefinitiontype =  new org.hl7.fhir.r4.model.ResearchElementDefinition.ResearchElementTypeEnumFactory();
		researchelementdefinition.setType(researchelementdefinitiontype.fromCode(r.getRsrchElmntDfnTyp()));

		/******************** RsrchElmntDfn_Url ********************************************************************************/
		if(r.getRsrchElmntDfnUrl() != null) {
			researchelementdefinition.setUrl(r.getRsrchElmntDfnUrl());
		}
		/******************** RsrchElmntDfn_Usg ********************************************************************************/
		if(r.getRsrchElmntDfnUsg() != null) {
			researchelementdefinition.setUsage(r.getRsrchElmntDfnUsg());
		}
		/******************** researchelementdefinitionusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext researchelementdefinitionusecontext =  new org.hl7.fhir.r4.model.UsageContext();
		researchelementdefinition.addUseContext(researchelementdefinitionusecontext);

		/******************** researchelementdefinitionusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchelementdefinitionusecontextcode =  new org.hl7.fhir.r4.model.Coding();
		researchelementdefinitionusecontext.setCode(researchelementdefinitionusecontextcode);

		/******************** RsrchElmntDfn_UseCntxt_Cd_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtCdCd() != null) {
			researchelementdefinitionusecontextcode.setCode(r.getRsrchElmntDfnUseCntxtCdCd());
		}
		/******************** RsrchElmntDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtCdDsply() != null) {
			researchelementdefinitionusecontextcode.setDisplay(r.getRsrchElmntDfnUseCntxtCdDsply());
		}
		/******************** RsrchElmntDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtCdSys() != null) {
			researchelementdefinitionusecontextcode.setSystem(r.getRsrchElmntDfnUseCntxtCdSys());
		}
		/******************** RsrchElmntDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtCdUsrSltd() != null) {
			researchelementdefinitionusecontextcode.setUserSelected(Boolean.parseBoolean(r.getRsrchElmntDfnUseCntxtCdUsrSltd()));
		}
		/******************** RsrchElmntDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtCdVrsn() != null) {
			researchelementdefinitionusecontextcode.setVersion(r.getRsrchElmntDfnUseCntxtCdVrsn());
		}
		/******************** researchelementdefinitionusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept researchelementdefinitionusecontextvaluecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		researchelementdefinitionusecontext.setValue(researchelementdefinitionusecontextvaluecodeableconcept);

		/******************** researchelementdefinitionusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding researchelementdefinitionusecontextvaluecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		researchelementdefinitionusecontextvaluecodeableconcept.addCoding(researchelementdefinitionusecontextvaluecodeableconceptcoding);

		/******************** RsrchElmntDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlCdbleCncptCdgCd() != null) {
			researchelementdefinitionusecontextvaluecodeableconceptcoding.setCode(r.getRsrchElmntDfnUseCntxtVlCdbleCncptCdgCd());
		}
		/******************** RsrchElmntDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlCdbleCncptCdgDsply() != null) {
			researchelementdefinitionusecontextvaluecodeableconceptcoding.setDisplay(r.getRsrchElmntDfnUseCntxtVlCdbleCncptCdgDsply());
		}
		/******************** RsrchElmntDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlCdbleCncptCdgSys() != null) {
			researchelementdefinitionusecontextvaluecodeableconceptcoding.setSystem(r.getRsrchElmntDfnUseCntxtVlCdbleCncptCdgSys());
		}
		/******************** RsrchElmntDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlCdbleCncptCdgUsrSltd() != null) {
			researchelementdefinitionusecontextvaluecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(r.getRsrchElmntDfnUseCntxtVlCdbleCncptCdgUsrSltd()));
		}
		/******************** RsrchElmntDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlCdbleCncptCdgVrsn() != null) {
			researchelementdefinitionusecontextvaluecodeableconceptcoding.setVersion(r.getRsrchElmntDfnUseCntxtVlCdbleCncptCdgVrsn());
		}
		/******************** RsrchElmntDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlCdbleCncptTxt() != null) {
			researchelementdefinitionusecontextvaluecodeableconcept.setText(r.getRsrchElmntDfnUseCntxtVlCdbleCncptTxt());
		}
		/******************** researchelementdefinitionusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchelementdefinitionusecontextvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		researchelementdefinitionusecontext.setValue(researchelementdefinitionusecontextvaluequantity);

		/******************** RsrchElmntDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlQntyCd() != null) {
			researchelementdefinitionusecontextvaluequantity.setCode(r.getRsrchElmntDfnUseCntxtVlQntyCd());
		}
		/******************** researchelementdefinitionusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory researchelementdefinitionusecontextvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		researchelementdefinitionusecontextvaluequantity.setComparator(researchelementdefinitionusecontextvaluequantitycomparator.fromCode(r.getRsrchElmntDfnUseCntxtVlQntyCmprtr()));

		/******************** RsrchElmntDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlQntySys() != null) {
			researchelementdefinitionusecontextvaluequantity.setSystem(r.getRsrchElmntDfnUseCntxtVlQntySys());
		}
		/******************** RsrchElmntDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlQntyUnt() != null) {
			researchelementdefinitionusecontextvaluequantity.setUnit(r.getRsrchElmntDfnUseCntxtVlQntyUnt());
		}
		/******************** RsrchElmntDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlQntyVl() != null) {
			researchelementdefinitionusecontextvaluequantity.setValue(Double.parseDouble((r.getRsrchElmntDfnUseCntxtVlQntyVl())));
		}
		/******************** researchelementdefinitionusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range researchelementdefinitionusecontextvaluerange =  new org.hl7.fhir.r4.model.Range();
		researchelementdefinitionusecontext.setValue(researchelementdefinitionusecontextvaluerange);

		/******************** researchelementdefinitionusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchelementdefinitionusecontextvaluerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		researchelementdefinitionusecontextvaluerange.setHigh(researchelementdefinitionusecontextvaluerangehigh);

		/******************** RsrchElmntDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlRngHiCd() != null) {
			researchelementdefinitionusecontextvaluerangehigh.setCode(r.getRsrchElmntDfnUseCntxtVlRngHiCd());
		}
		/******************** researchelementdefinitionusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory researchelementdefinitionusecontextvaluerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		researchelementdefinitionusecontextvaluerangehigh.setComparator(researchelementdefinitionusecontextvaluerangehighcomparator.fromCode(r.getRsrchElmntDfnUseCntxtVlRngHiCmprtr()));

		/******************** RsrchElmntDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlRngHiSys() != null) {
			researchelementdefinitionusecontextvaluerangehigh.setSystem(r.getRsrchElmntDfnUseCntxtVlRngHiSys());
		}
		/******************** RsrchElmntDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlRngHiUnt() != null) {
			researchelementdefinitionusecontextvaluerangehigh.setUnit(r.getRsrchElmntDfnUseCntxtVlRngHiUnt());
		}
		/******************** RsrchElmntDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlRngHiVl() != null) {
			researchelementdefinitionusecontextvaluerangehigh.setValue(Double.parseDouble((r.getRsrchElmntDfnUseCntxtVlRngHiVl())));
		}
		/******************** researchelementdefinitionusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity researchelementdefinitionusecontextvaluerangelow =  new org.hl7.fhir.r4.model.Quantity();
		researchelementdefinitionusecontextvaluerange.setLow(researchelementdefinitionusecontextvaluerangelow);

		/******************** RsrchElmntDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlRngLwCd() != null) {
			researchelementdefinitionusecontextvaluerangelow.setCode(r.getRsrchElmntDfnUseCntxtVlRngLwCd());
		}
		/******************** researchelementdefinitionusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory researchelementdefinitionusecontextvaluerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		researchelementdefinitionusecontextvaluerangelow.setComparator(researchelementdefinitionusecontextvaluerangelowcomparator.fromCode(r.getRsrchElmntDfnUseCntxtVlRngLwCmprtr()));

		/******************** RsrchElmntDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlRngLwSys() != null) {
			researchelementdefinitionusecontextvaluerangelow.setSystem(r.getRsrchElmntDfnUseCntxtVlRngLwSys());
		}
		/******************** RsrchElmntDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlRngLwUnt() != null) {
			researchelementdefinitionusecontextvaluerangelow.setUnit(r.getRsrchElmntDfnUseCntxtVlRngLwUnt());
		}
		/******************** RsrchElmntDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlRngLwVl() != null) {
			researchelementdefinitionusecontextvaluerangelow.setValue(Double.parseDouble((r.getRsrchElmntDfnUseCntxtVlRngLwVl())));
		}
		/******************** RsrchElmntDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(r.getRsrchElmntDfnUseCntxtVlRfrnc() != null) {
			researchelementdefinitionusecontext.setValue( new org.hl7.fhir.r4.model.Reference(r.getRsrchElmntDfnUseCntxtVlRfrnc()));
		}
		/******************** researchelementdefinitionvariabletype ********************************************************************************/
		org.hl7.fhir.r4.model.ResearchElementDefinition.VariableTypeEnumFactory researchelementdefinitionvariabletype =  new org.hl7.fhir.r4.model.ResearchElementDefinition.VariableTypeEnumFactory();
		researchelementdefinition.setVariableType(researchelementdefinitionvariabletype.fromCode(r.getRsrchElmntDfnVrbleTyp()));

		/******************** RsrchElmntDfn_Vrsn ********************************************************************************/
		if(r.getRsrchElmntDfnVrsn() != null) {
			researchelementdefinition.setVersion(r.getRsrchElmntDfnVrsn());
		}
		return researchelementdefinition;
	}
}
