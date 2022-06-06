package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Library;
public class LibraryConversion 
{
	public org.hl7.fhir.r4.model.Library Librarys(Library l) throws ParseException
	{
		org.hl7.fhir.r4.model.Library library = new org.hl7.fhir.r4.model.Library();

		/******************** id ********************************************************************************/
		library.setId(l.getId());

		/******************** Library_ApprovalDt ********************************************************************************/
		if(l.getLibraryApprovalDt() != null) {
			java.text.SimpleDateFormat Library_ApprovalDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Library_ApprovalDtdate = Library_ApprovalDtsdf.parse(l.getLibraryApprovalDt());
			library.setApprovalDate(Library_ApprovalDtdate);
		}
		/******************** libraryauthor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail libraryauthor =  new org.hl7.fhir.r4.model.ContactDetail();
		library.addAuthor(libraryauthor);

		/******************** Library_Athr_Nm ********************************************************************************/
		if(l.getLibraryAthrNm() != null) {
			libraryauthor.setName(l.getLibraryAthrNm());
		}
		/******************** libraryauthortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint libraryauthortelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		libraryauthor.addTelecom(libraryauthortelecom);

		/******************** libraryauthortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period libraryauthortelecomperiod =  new org.hl7.fhir.r4.model.Period();
		libraryauthortelecom.setPeriod(libraryauthortelecomperiod);

		/******************** Library_Athr_Tlcm_Prd_End ********************************************************************************/
		if(l.getLibraryAthrTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat Library_Athr_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Library_Athr_Tlcm_Prd_Enddate = Library_Athr_Tlcm_Prd_Endsdf.parse(l.getLibraryAthrTlcmPrdEnd());
			libraryauthortelecomperiod.setEnd(Library_Athr_Tlcm_Prd_Enddate);
		}
		/******************** Library_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(l.getLibraryAthrTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat Library_Athr_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Library_Athr_Tlcm_Prd_Strtdate = Library_Athr_Tlcm_Prd_Strtsdf.parse(l.getLibraryAthrTlcmPrdStrt());
			libraryauthortelecomperiod.setStart(Library_Athr_Tlcm_Prd_Strtdate);
		}
		/******************** Library_Athr_Tlcm_Rnk ********************************************************************************/
		if(l.getLibraryAthrTlcmRnk() != null) {
			libraryauthortelecom.setRank(Integer.parseInt(l.getLibraryAthrTlcmRnk()));
		}
		/******************** libraryauthortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory libraryauthortelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		libraryauthortelecom.setSystem(libraryauthortelecomsystem.fromCode(l.getLibraryAthrTlcmSys()));

		/******************** libraryauthortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory libraryauthortelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		libraryauthortelecom.setUse(libraryauthortelecomuse.fromCode(l.getLibraryAthrTlcmUse()));

		/******************** Library_Athr_Tlcm_Vl ********************************************************************************/
		if(l.getLibraryAthrTlcmVl() != null) {
			libraryauthortelecom.setValue(l.getLibraryAthrTlcmVl());
		}
		/******************** librarycontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail librarycontact =  new org.hl7.fhir.r4.model.ContactDetail();
		library.addContact(librarycontact);

		/******************** Library_Cntct_Nm ********************************************************************************/
		if(l.getLibraryCntctNm() != null) {
			librarycontact.setName(l.getLibraryCntctNm());
		}
		/******************** librarycontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint librarycontacttelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		librarycontact.addTelecom(librarycontacttelecom);

		/******************** librarycontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period librarycontacttelecomperiod =  new org.hl7.fhir.r4.model.Period();
		librarycontacttelecom.setPeriod(librarycontacttelecomperiod);

		/******************** Library_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(l.getLibraryCntctTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat Library_Cntct_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Library_Cntct_Tlcm_Prd_Enddate = Library_Cntct_Tlcm_Prd_Endsdf.parse(l.getLibraryCntctTlcmPrdEnd());
			librarycontacttelecomperiod.setEnd(Library_Cntct_Tlcm_Prd_Enddate);
		}
		/******************** Library_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(l.getLibraryCntctTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat Library_Cntct_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Library_Cntct_Tlcm_Prd_Strtdate = Library_Cntct_Tlcm_Prd_Strtsdf.parse(l.getLibraryCntctTlcmPrdStrt());
			librarycontacttelecomperiod.setStart(Library_Cntct_Tlcm_Prd_Strtdate);
		}
		/******************** Library_Cntct_Tlcm_Rnk ********************************************************************************/
		if(l.getLibraryCntctTlcmRnk() != null) {
			librarycontacttelecom.setRank(Integer.parseInt(l.getLibraryCntctTlcmRnk()));
		}
		/******************** librarycontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory librarycontacttelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		librarycontacttelecom.setSystem(librarycontacttelecomsystem.fromCode(l.getLibraryCntctTlcmSys()));

		/******************** librarycontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory librarycontacttelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		librarycontacttelecom.setUse(librarycontacttelecomuse.fromCode(l.getLibraryCntctTlcmUse()));

		/******************** Library_Cntct_Tlcm_Vl ********************************************************************************/
		if(l.getLibraryCntctTlcmVl() != null) {
			librarycontacttelecom.setValue(l.getLibraryCntctTlcmVl());
		}
		/******************** librarycontent ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment librarycontent =  new org.hl7.fhir.r4.model.Attachment();
		library.addContent(librarycontent);

		/******************** Library_Cntnt_CntntTyp ********************************************************************************/
		if(l.getLibraryCntntCntntTyp() != null) {
			librarycontent.setContentType(l.getLibraryCntntCntntTyp());
		}
		/******************** Library_Cntnt_Creation ********************************************************************************/
		if(l.getLibraryCntntCreation() != null) {
			java.text.SimpleDateFormat Library_Cntnt_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Library_Cntnt_Creationdate = Library_Cntnt_Creationsdf.parse(l.getLibraryCntntCreation());
			librarycontent.setCreation(Library_Cntnt_Creationdate);
		}
		/******************** Library_Cntnt_Data ********************************************************************************/
		if(l.getLibraryCntntData() != null) {
			librarycontent.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(l.getLibraryCntntData()));
		}
		/******************** Library_Cntnt_Hash ********************************************************************************/
		if(l.getLibraryCntntHash() != null) {
			librarycontent.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(l.getLibraryCntntHash()));
		}
		/******************** Library_Cntnt_Lnguage ********************************************************************************/
		if(l.getLibraryCntntLnguage() != null) {
			librarycontent.setLanguage(l.getLibraryCntntLnguage());
		}
		/******************** Library_Cntnt_Sz ********************************************************************************/
		if(l.getLibraryCntntSz() != null) {
			librarycontent.setSize(Integer.parseInt(l.getLibraryCntntSz()));
		}
		/******************** Library_Cntnt_Ttl ********************************************************************************/
		if(l.getLibraryCntntTtl() != null) {
			librarycontent.setTitle(l.getLibraryCntntTtl());
		}
		/******************** Library_Cntnt_Url ********************************************************************************/
		if(l.getLibraryCntntUrl() != null) {
			librarycontent.setUrl(l.getLibraryCntntUrl());
		}
		/******************** Library_Copyright ********************************************************************************/
		if(l.getLibraryCopyright() != null) {
			library.setCopyright(l.getLibraryCopyright());
		}
		/******************** librarydatarequirement ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement librarydatarequirement =  new org.hl7.fhir.r4.model.DataRequirement();
		library.addDataRequirement(librarydatarequirement);

		/******************** librarydatarequirementcodefilter ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent librarydatarequirementcodefilter =  new org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent();
		librarydatarequirement.addCodeFilter(librarydatarequirementcodefilter);

		/******************** librarydatarequirementcodefiltercode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding librarydatarequirementcodefiltercode =  new org.hl7.fhir.r4.model.Coding();
		librarydatarequirementcodefilter.addCode(librarydatarequirementcodefiltercode);

		/******************** Library_DataRqrment_CdFltr_Cd_Cd ********************************************************************************/
		if(l.getLibraryDataRqrmentCdFltrCdCd() != null) {
			librarydatarequirementcodefiltercode.setCode(l.getLibraryDataRqrmentCdFltrCdCd());
		}
		/******************** Library_DataRqrment_CdFltr_Cd_Dsply ********************************************************************************/
		if(l.getLibraryDataRqrmentCdFltrCdDsply() != null) {
			librarydatarequirementcodefiltercode.setDisplay(l.getLibraryDataRqrmentCdFltrCdDsply());
		}
		/******************** Library_DataRqrment_CdFltr_Cd_Sys ********************************************************************************/
		if(l.getLibraryDataRqrmentCdFltrCdSys() != null) {
			librarydatarequirementcodefiltercode.setSystem(l.getLibraryDataRqrmentCdFltrCdSys());
		}
		/******************** Library_DataRqrment_CdFltr_Cd_UsrSltd ********************************************************************************/
		if(l.getLibraryDataRqrmentCdFltrCdUsrSltd() != null) {
			librarydatarequirementcodefiltercode.setUserSelected(Boolean.parseBoolean(l.getLibraryDataRqrmentCdFltrCdUsrSltd()));
		}
		/******************** Library_DataRqrment_CdFltr_Cd_Vrsn ********************************************************************************/
		if(l.getLibraryDataRqrmentCdFltrCdVrsn() != null) {
			librarydatarequirementcodefiltercode.setVersion(l.getLibraryDataRqrmentCdFltrCdVrsn());
		}
		/******************** Library_DataRqrment_CdFltr_Path ********************************************************************************/
		if(l.getLibraryDataRqrmentCdFltrPath() != null) {
			librarydatarequirementcodefilter.setPath(l.getLibraryDataRqrmentCdFltrPath());
		}
		/******************** Library_DataRqrment_CdFltr_SrchParam ********************************************************************************/
		if(l.getLibraryDataRqrmentCdFltrSrchParam() != null) {
			librarydatarequirementcodefilter.setSearchParam(l.getLibraryDataRqrmentCdFltrSrchParam());
		}
		/******************** Library_DataRqrment_CdFltr_VlSt ********************************************************************************/
		if(l.getLibraryDataRqrmentCdFltrVlSt() != null) {
			librarydatarequirementcodefilter.setValueSet(l.getLibraryDataRqrmentCdFltrVlSt());
		}
		/******************** librarydatarequirementdatefilter ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent librarydatarequirementdatefilter =  new org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent();
		librarydatarequirement.addDateFilter(librarydatarequirementdatefilter);

		/******************** Library_DataRqrment_DtFltr_Path ********************************************************************************/
		if(l.getLibraryDataRqrmentDtFltrPath() != null) {
			librarydatarequirementdatefilter.setPath(l.getLibraryDataRqrmentDtFltrPath());
		}
		/******************** Library_DataRqrment_DtFltr_SrchParam ********************************************************************************/
		if(l.getLibraryDataRqrmentDtFltrSrchParam() != null) {
			librarydatarequirementdatefilter.setSearchParam(l.getLibraryDataRqrmentDtFltrSrchParam());
		}
		/******************** Library_DataRqrment_DtFltr_VlDtTimeTyp ********************************************************************************/
		if(l.getLibraryDataRqrmentDtFltrVlDtTimeTyp() != null) {
			librarydatarequirementdatefilter.setValue( new org.hl7.fhir.r4.model.DateTimeType(l.getLibraryDataRqrmentDtFltrVlDtTimeTyp()));
		}
		/******************** librarydatarequirementdatefiltervalueduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration librarydatarequirementdatefiltervalueduration =  new org.hl7.fhir.r4.model.Duration();
		librarydatarequirementdatefilter.setValue(librarydatarequirementdatefiltervalueduration);

		/******************** librarydatarequirementdatefiltervalueperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period librarydatarequirementdatefiltervalueperiod =  new org.hl7.fhir.r4.model.Period();
		librarydatarequirementdatefilter.setValue(librarydatarequirementdatefiltervalueperiod);

		/******************** Library_DataRqrment_DtFltr_VlPrd_End ********************************************************************************/
		if(l.getLibraryDataRqrmentDtFltrVlPrdEnd() != null) {
			java.text.SimpleDateFormat Library_DataRqrment_DtFltr_VlPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Library_DataRqrment_DtFltr_VlPrd_Enddate = Library_DataRqrment_DtFltr_VlPrd_Endsdf.parse(l.getLibraryDataRqrmentDtFltrVlPrdEnd());
			librarydatarequirementdatefiltervalueperiod.setEnd(Library_DataRqrment_DtFltr_VlPrd_Enddate);
		}
		/******************** Library_DataRqrment_DtFltr_VlPrd_Strt ********************************************************************************/
		if(l.getLibraryDataRqrmentDtFltrVlPrdStrt() != null) {
			java.text.SimpleDateFormat Library_DataRqrment_DtFltr_VlPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Library_DataRqrment_DtFltr_VlPrd_Strtdate = Library_DataRqrment_DtFltr_VlPrd_Strtsdf.parse(l.getLibraryDataRqrmentDtFltrVlPrdStrt());
			librarydatarequirementdatefiltervalueperiod.setStart(Library_DataRqrment_DtFltr_VlPrd_Strtdate);
		}
		/******************** Library_DataRqrment_Lmt ********************************************************************************/
		if(l.getLibraryDataRqrmentLmt() != null) {
			librarydatarequirement.setLimit(Integer.parseInt(l.getLibraryDataRqrmentLmt()));
		}
		/******************** Library_DataRqrment_MustSupport ********************************************************************************/
		if(l.getLibraryDataRqrmentMustSupport() != null) {
			librarydatarequirement.addMustSupport(l.getLibraryDataRqrmentMustSupport());
		}
		/******************** Library_DataRqrment_Profile ********************************************************************************/
		if(l.getLibraryDataRqrmentProfile() != null) {
			librarydatarequirement.addProfile(l.getLibraryDataRqrmentProfile());
		}
		/******************** librarydatarequirementsort ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent librarydatarequirementsort =  new org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent();
		librarydatarequirement.addSort(librarydatarequirementsort);

		/******************** librarydatarequirementsortdirection ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.SortDirectionEnumFactory librarydatarequirementsortdirection =  new org.hl7.fhir.r4.model.DataRequirement.SortDirectionEnumFactory();
		librarydatarequirementsort.setDirection(librarydatarequirementsortdirection.fromCode(l.getLibraryDataRqrmentSortDirection()));

		/******************** Library_DataRqrment_Sort_Path ********************************************************************************/
		if(l.getLibraryDataRqrmentSortPath() != null) {
			librarydatarequirementsort.setPath(l.getLibraryDataRqrmentSortPath());
		}
		/******************** librarydatarequirementsubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept librarydatarequirementsubjectcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		librarydatarequirement.setSubject(librarydatarequirementsubjectcodeableconcept);

		/******************** librarydatarequirementsubjectcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding librarydatarequirementsubjectcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		librarydatarequirementsubjectcodeableconcept.addCoding(librarydatarequirementsubjectcodeableconceptcoding);

		/******************** Library_DataRqrment_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(l.getLibraryDataRqrmentSbjctCdbleCncptCdgCd() != null) {
			librarydatarequirementsubjectcodeableconceptcoding.setCode(l.getLibraryDataRqrmentSbjctCdbleCncptCdgCd());
		}
		/******************** Library_DataRqrment_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(l.getLibraryDataRqrmentSbjctCdbleCncptCdgDsply() != null) {
			librarydatarequirementsubjectcodeableconceptcoding.setDisplay(l.getLibraryDataRqrmentSbjctCdbleCncptCdgDsply());
		}
		/******************** Library_DataRqrment_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(l.getLibraryDataRqrmentSbjctCdbleCncptCdgSys() != null) {
			librarydatarequirementsubjectcodeableconceptcoding.setSystem(l.getLibraryDataRqrmentSbjctCdbleCncptCdgSys());
		}
		/******************** Library_DataRqrment_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(l.getLibraryDataRqrmentSbjctCdbleCncptCdgUsrSltd() != null) {
			librarydatarequirementsubjectcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(l.getLibraryDataRqrmentSbjctCdbleCncptCdgUsrSltd()));
		}
		/******************** Library_DataRqrment_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(l.getLibraryDataRqrmentSbjctCdbleCncptCdgVrsn() != null) {
			librarydatarequirementsubjectcodeableconceptcoding.setVersion(l.getLibraryDataRqrmentSbjctCdbleCncptCdgVrsn());
		}
		/******************** Library_DataRqrment_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(l.getLibraryDataRqrmentSbjctCdbleCncptTxt() != null) {
			librarydatarequirementsubjectcodeableconcept.setText(l.getLibraryDataRqrmentSbjctCdbleCncptTxt());
		}
		/******************** Library_DataRqrment_SbjctRfrnc ********************************************************************************/
		if(l.getLibraryDataRqrmentSbjctRfrnc() != null) {
			librarydatarequirement.setSubject( new org.hl7.fhir.r4.model.Reference(l.getLibraryDataRqrmentSbjctRfrnc()));
		}
		/******************** Library_DataRqrment_Typ ********************************************************************************/
		if(l.getLibraryDataRqrmentTyp() != null) {
			librarydatarequirement.setType(l.getLibraryDataRqrmentTyp());
		}
		/******************** Library_Dt ********************************************************************************/
		if(l.getLibraryDt() != null) {
			java.text.SimpleDateFormat Library_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Library_Dtdate = Library_Dtsdf.parse(l.getLibraryDt());
			library.setDate(Library_Dtdate);
		}
		/******************** Library_Dscrptn ********************************************************************************/
		if(l.getLibraryDscrptn() != null) {
			library.setDescription(l.getLibraryDscrptn());
		}
		/******************** libraryeditor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail libraryeditor =  new org.hl7.fhir.r4.model.ContactDetail();
		library.addEditor(libraryeditor);

		/******************** Library_Editor_Nm ********************************************************************************/
		if(l.getLibraryEditorNm() != null) {
			libraryeditor.setName(l.getLibraryEditorNm());
		}
		/******************** libraryeditortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint libraryeditortelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		libraryeditor.addTelecom(libraryeditortelecom);

		/******************** libraryeditortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period libraryeditortelecomperiod =  new org.hl7.fhir.r4.model.Period();
		libraryeditortelecom.setPeriod(libraryeditortelecomperiod);

		/******************** Library_Editor_Tlcm_Prd_End ********************************************************************************/
		if(l.getLibraryEditorTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat Library_Editor_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Library_Editor_Tlcm_Prd_Enddate = Library_Editor_Tlcm_Prd_Endsdf.parse(l.getLibraryEditorTlcmPrdEnd());
			libraryeditortelecomperiod.setEnd(Library_Editor_Tlcm_Prd_Enddate);
		}
		/******************** Library_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(l.getLibraryEditorTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat Library_Editor_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Library_Editor_Tlcm_Prd_Strtdate = Library_Editor_Tlcm_Prd_Strtsdf.parse(l.getLibraryEditorTlcmPrdStrt());
			libraryeditortelecomperiod.setStart(Library_Editor_Tlcm_Prd_Strtdate);
		}
		/******************** Library_Editor_Tlcm_Rnk ********************************************************************************/
		if(l.getLibraryEditorTlcmRnk() != null) {
			libraryeditortelecom.setRank(Integer.parseInt(l.getLibraryEditorTlcmRnk()));
		}
		/******************** libraryeditortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory libraryeditortelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		libraryeditortelecom.setSystem(libraryeditortelecomsystem.fromCode(l.getLibraryEditorTlcmSys()));

		/******************** libraryeditortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory libraryeditortelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		libraryeditortelecom.setUse(libraryeditortelecomuse.fromCode(l.getLibraryEditorTlcmUse()));

		/******************** Library_Editor_Tlcm_Vl ********************************************************************************/
		if(l.getLibraryEditorTlcmVl() != null) {
			libraryeditortelecom.setValue(l.getLibraryEditorTlcmVl());
		}
		/******************** libraryeffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period libraryeffectiveperiod =  new org.hl7.fhir.r4.model.Period();
		library.setEffectivePeriod(libraryeffectiveperiod);

		/******************** Library_EfctivePrd_End ********************************************************************************/
		if(l.getLibraryEfctivePrdEnd() != null) {
			java.text.SimpleDateFormat Library_EfctivePrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Library_EfctivePrd_Enddate = Library_EfctivePrd_Endsdf.parse(l.getLibraryEfctivePrdEnd());
			libraryeffectiveperiod.setEnd(Library_EfctivePrd_Enddate);
		}
		/******************** Library_EfctivePrd_Strt ********************************************************************************/
		if(l.getLibraryEfctivePrdStrt() != null) {
			java.text.SimpleDateFormat Library_EfctivePrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Library_EfctivePrd_Strtdate = Library_EfctivePrd_Strtsdf.parse(l.getLibraryEfctivePrdStrt());
			libraryeffectiveperiod.setStart(Library_EfctivePrd_Strtdate);
		}
		/******************** libraryendorser ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail libraryendorser =  new org.hl7.fhir.r4.model.ContactDetail();
		library.addEndorser(libraryendorser);

		/******************** Library_Endsr_Nm ********************************************************************************/
		if(l.getLibraryEndsrNm() != null) {
			libraryendorser.setName(l.getLibraryEndsrNm());
		}
		/******************** libraryendorsertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint libraryendorsertelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		libraryendorser.addTelecom(libraryendorsertelecom);

		/******************** libraryendorsertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period libraryendorsertelecomperiod =  new org.hl7.fhir.r4.model.Period();
		libraryendorsertelecom.setPeriod(libraryendorsertelecomperiod);

		/******************** Library_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(l.getLibraryEndsrTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat Library_Endsr_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Library_Endsr_Tlcm_Prd_Enddate = Library_Endsr_Tlcm_Prd_Endsdf.parse(l.getLibraryEndsrTlcmPrdEnd());
			libraryendorsertelecomperiod.setEnd(Library_Endsr_Tlcm_Prd_Enddate);
		}
		/******************** Library_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(l.getLibraryEndsrTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat Library_Endsr_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Library_Endsr_Tlcm_Prd_Strtdate = Library_Endsr_Tlcm_Prd_Strtsdf.parse(l.getLibraryEndsrTlcmPrdStrt());
			libraryendorsertelecomperiod.setStart(Library_Endsr_Tlcm_Prd_Strtdate);
		}
		/******************** Library_Endsr_Tlcm_Rnk ********************************************************************************/
		if(l.getLibraryEndsrTlcmRnk() != null) {
			libraryendorsertelecom.setRank(Integer.parseInt(l.getLibraryEndsrTlcmRnk()));
		}
		/******************** libraryendorsertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory libraryendorsertelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		libraryendorsertelecom.setSystem(libraryendorsertelecomsystem.fromCode(l.getLibraryEndsrTlcmSys()));

		/******************** libraryendorsertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory libraryendorsertelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		libraryendorsertelecom.setUse(libraryendorsertelecomuse.fromCode(l.getLibraryEndsrTlcmUse()));

		/******************** Library_Endsr_Tlcm_Vl ********************************************************************************/
		if(l.getLibraryEndsrTlcmVl() != null) {
			libraryendorsertelecom.setValue(l.getLibraryEndsrTlcmVl());
		}
		/******************** Library_Exprmtl ********************************************************************************/
		if(l.getLibraryExprmtl() != null) {
			library.setExperimental(Boolean.parseBoolean(l.getLibraryExprmtl()));
		}
		/******************** libraryidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier libraryidentifier =  new org.hl7.fhir.r4.model.Identifier();
		library.addIdentifier(libraryidentifier);

		/******************** Library_Id_Assigner ********************************************************************************/
		if(l.getLibraryIdAssigner() != null) {
			libraryidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(l.getLibraryIdAssigner()));
		}
		/******************** libraryidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period libraryidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		libraryidentifier.setPeriod(libraryidentifierperiod);

		/******************** Library_Id_Prd_End ********************************************************************************/
		if(l.getLibraryIdPrdEnd() != null) {
			java.text.SimpleDateFormat Library_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Library_Id_Prd_Enddate = Library_Id_Prd_Endsdf.parse(l.getLibraryIdPrdEnd());
			libraryidentifierperiod.setEnd(Library_Id_Prd_Enddate);
		}
		/******************** Library_Id_Prd_Strt ********************************************************************************/
		if(l.getLibraryIdPrdStrt() != null) {
			java.text.SimpleDateFormat Library_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Library_Id_Prd_Strtdate = Library_Id_Prd_Strtsdf.parse(l.getLibraryIdPrdStrt());
			libraryidentifierperiod.setStart(Library_Id_Prd_Strtdate);
		}
		/******************** Library_Id_Sys ********************************************************************************/
		if(l.getLibraryIdSys() != null) {
			libraryidentifier.setSystem(l.getLibraryIdSys());
		}
		/******************** libraryidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept libraryidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		libraryidentifier.setType(libraryidentifiertype);

		/******************** libraryidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding libraryidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		libraryidentifiertype.addCoding(libraryidentifiertypecoding);

		/******************** Library_Id_Typ_Cdg_Cd ********************************************************************************/
		if(l.getLibraryIdTypCdgCd() != null) {
			libraryidentifiertypecoding.setCode(l.getLibraryIdTypCdgCd());
		}
		/******************** Library_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(l.getLibraryIdTypCdgDsply() != null) {
			libraryidentifiertypecoding.setDisplay(l.getLibraryIdTypCdgDsply());
		}
		/******************** Library_Id_Typ_Cdg_Sys ********************************************************************************/
		if(l.getLibraryIdTypCdgSys() != null) {
			libraryidentifiertypecoding.setSystem(l.getLibraryIdTypCdgSys());
		}
		/******************** Library_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(l.getLibraryIdTypCdgUsrSltd() != null) {
			libraryidentifiertypecoding.setUserSelected(Boolean.parseBoolean(l.getLibraryIdTypCdgUsrSltd()));
		}
		/******************** Library_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(l.getLibraryIdTypCdgVrsn() != null) {
			libraryidentifiertypecoding.setVersion(l.getLibraryIdTypCdgVrsn());
		}
		/******************** Library_Id_Typ_Txt ********************************************************************************/
		if(l.getLibraryIdTypTxt() != null) {
			libraryidentifiertype.setText(l.getLibraryIdTypTxt());
		}
		/******************** libraryidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory libraryidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		libraryidentifier.setUse(libraryidentifieruse.fromCode(l.getLibraryIdUse()));

		/******************** Library_Id_Vl ********************************************************************************/
		if(l.getLibraryIdVl() != null) {
			libraryidentifier.setValue(l.getLibraryIdVl());
		}
		/******************** libraryjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept libraryjurisdiction =  new org.hl7.fhir.r4.model.CodeableConcept();
		library.addJurisdiction(libraryjurisdiction);

		/******************** libraryjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding libraryjurisdictioncoding =  new org.hl7.fhir.r4.model.Coding();
		libraryjurisdiction.addCoding(libraryjurisdictioncoding);

		/******************** Library_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(l.getLibraryJrsdctnCdgCd() != null) {
			libraryjurisdictioncoding.setCode(l.getLibraryJrsdctnCdgCd());
		}
		/******************** Library_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(l.getLibraryJrsdctnCdgDsply() != null) {
			libraryjurisdictioncoding.setDisplay(l.getLibraryJrsdctnCdgDsply());
		}
		/******************** Library_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(l.getLibraryJrsdctnCdgSys() != null) {
			libraryjurisdictioncoding.setSystem(l.getLibraryJrsdctnCdgSys());
		}
		/******************** Library_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(l.getLibraryJrsdctnCdgUsrSltd() != null) {
			libraryjurisdictioncoding.setUserSelected(Boolean.parseBoolean(l.getLibraryJrsdctnCdgUsrSltd()));
		}
		/******************** Library_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(l.getLibraryJrsdctnCdgVrsn() != null) {
			libraryjurisdictioncoding.setVersion(l.getLibraryJrsdctnCdgVrsn());
		}
		/******************** Library_Jrsdctn_Txt ********************************************************************************/
		if(l.getLibraryJrsdctnTxt() != null) {
			libraryjurisdiction.setText(l.getLibraryJrsdctnTxt());
		}
		/******************** Library_LastReviewDt ********************************************************************************/
		if(l.getLibraryLastReviewDt() != null) {
			java.text.SimpleDateFormat Library_LastReviewDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Library_LastReviewDtdate = Library_LastReviewDtsdf.parse(l.getLibraryLastReviewDt());
			library.setLastReviewDate(Library_LastReviewDtdate);
		}
		/******************** Library_Nm ********************************************************************************/
		if(l.getLibraryNm() != null) {
			library.setName(l.getLibraryNm());
		}
		/******************** libraryparameter ********************************************************************************/
		org.hl7.fhir.r4.model.ParameterDefinition libraryparameter =  new org.hl7.fhir.r4.model.ParameterDefinition();
		library.addParameter(libraryparameter);

		/******************** Library_Prmtr_Docation ********************************************************************************/
		if(l.getLibraryPrmtrDocation() != null) {
			libraryparameter.setDocumentation(l.getLibraryPrmtrDocation());
		}
		/******************** Library_Prmtr_Mx ********************************************************************************/
		if(l.getLibraryPrmtrMx() != null) {
			libraryparameter.setMax(l.getLibraryPrmtrMx());
		}
		/******************** Library_Prmtr_Min ********************************************************************************/
		if(l.getLibraryPrmtrMin() != null) {
			libraryparameter.setMin(Integer.parseInt(l.getLibraryPrmtrMin()));
		}
		/******************** Library_Prmtr_Nm ********************************************************************************/
		if(l.getLibraryPrmtrNm() != null) {
			libraryparameter.setName(l.getLibraryPrmtrNm());
		}
		/******************** Library_Prmtr_Profile ********************************************************************************/
		if(l.getLibraryPrmtrProfile() != null) {
			libraryparameter.setProfile(l.getLibraryPrmtrProfile());
		}
		/******************** Library_Prmtr_Typ ********************************************************************************/
		if(l.getLibraryPrmtrTyp() != null) {
			libraryparameter.setType(l.getLibraryPrmtrTyp());
		}
		/******************** libraryparameteruse ********************************************************************************/
		org.hl7.fhir.r4.model.ParameterDefinition.ParameterUseEnumFactory libraryparameteruse =  new org.hl7.fhir.r4.model.ParameterDefinition.ParameterUseEnumFactory();
		libraryparameter.setUse(libraryparameteruse.fromCode(l.getLibraryPrmtrUse()));

		/******************** Library_Pblshr ********************************************************************************/
		if(l.getLibraryPblshr() != null) {
			library.setPublisher(l.getLibraryPblshr());
		}
		/******************** Library_Prpse ********************************************************************************/
		if(l.getLibraryPrpse() != null) {
			library.setPurpose(l.getLibraryPrpse());
		}
		/******************** libraryrelatedartifact ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact libraryrelatedartifact =  new org.hl7.fhir.r4.model.RelatedArtifact();
		library.addRelatedArtifact(libraryrelatedartifact);

		/******************** Library_RltedArtfct_Citation ********************************************************************************/
		if(l.getLibraryRltedArtfctCitation() != null) {
			libraryrelatedartifact.setCitation(l.getLibraryRltedArtfctCitation());
		}
		/******************** Library_RltedArtfct_Dsply ********************************************************************************/
		if(l.getLibraryRltedArtfctDsply() != null) {
			libraryrelatedartifact.setDisplay(l.getLibraryRltedArtfctDsply());
		}
		/******************** libraryrelatedartifactdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment libraryrelatedartifactdocument =  new org.hl7.fhir.r4.model.Attachment();
		libraryrelatedartifact.setDocument(libraryrelatedartifactdocument);

		/******************** Library_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(l.getLibraryRltedArtfctDocCntntTyp() != null) {
			libraryrelatedartifactdocument.setContentType(l.getLibraryRltedArtfctDocCntntTyp());
		}
		/******************** Library_RltedArtfct_Doc_Creation ********************************************************************************/
		if(l.getLibraryRltedArtfctDocCreation() != null) {
			java.text.SimpleDateFormat Library_RltedArtfct_Doc_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Library_RltedArtfct_Doc_Creationdate = Library_RltedArtfct_Doc_Creationsdf.parse(l.getLibraryRltedArtfctDocCreation());
			libraryrelatedartifactdocument.setCreation(Library_RltedArtfct_Doc_Creationdate);
		}
		/******************** Library_RltedArtfct_Doc_Data ********************************************************************************/
		if(l.getLibraryRltedArtfctDocData() != null) {
			libraryrelatedartifactdocument.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(l.getLibraryRltedArtfctDocData()));
		}
		/******************** Library_RltedArtfct_Doc_Hash ********************************************************************************/
		if(l.getLibraryRltedArtfctDocHash() != null) {
			libraryrelatedartifactdocument.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(l.getLibraryRltedArtfctDocHash()));
		}
		/******************** Library_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(l.getLibraryRltedArtfctDocLnguage() != null) {
			libraryrelatedartifactdocument.setLanguage(l.getLibraryRltedArtfctDocLnguage());
		}
		/******************** Library_RltedArtfct_Doc_Sz ********************************************************************************/
		if(l.getLibraryRltedArtfctDocSz() != null) {
			libraryrelatedartifactdocument.setSize(Integer.parseInt(l.getLibraryRltedArtfctDocSz()));
		}
		/******************** Library_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(l.getLibraryRltedArtfctDocTtl() != null) {
			libraryrelatedartifactdocument.setTitle(l.getLibraryRltedArtfctDocTtl());
		}
		/******************** Library_RltedArtfct_Doc_Url ********************************************************************************/
		if(l.getLibraryRltedArtfctDocUrl() != null) {
			libraryrelatedartifactdocument.setUrl(l.getLibraryRltedArtfctDocUrl());
		}
		/******************** Library_RltedArtfct_Lbl ********************************************************************************/
		if(l.getLibraryRltedArtfctLbl() != null) {
			libraryrelatedartifact.setLabel(l.getLibraryRltedArtfctLbl());
		}
		/******************** Library_RltedArtfct_Rsrc ********************************************************************************/
		if(l.getLibraryRltedArtfctRsrc() != null) {
			libraryrelatedartifact.setResource(l.getLibraryRltedArtfctRsrc());
		}
		/******************** libraryrelatedartifacttype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory libraryrelatedartifacttype =  new org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory();
		libraryrelatedartifact.setType(libraryrelatedartifacttype.fromCode(l.getLibraryRltedArtfctTyp()));

		/******************** Library_RltedArtfct_Url ********************************************************************************/
		if(l.getLibraryRltedArtfctUrl() != null) {
			libraryrelatedartifact.setUrl(l.getLibraryRltedArtfctUrl());
		}
		/******************** libraryreviewer ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail libraryreviewer =  new org.hl7.fhir.r4.model.ContactDetail();
		library.addReviewer(libraryreviewer);

		/******************** Library_Rviewr_Nm ********************************************************************************/
		if(l.getLibraryRviewrNm() != null) {
			libraryreviewer.setName(l.getLibraryRviewrNm());
		}
		/******************** libraryreviewertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint libraryreviewertelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		libraryreviewer.addTelecom(libraryreviewertelecom);

		/******************** libraryreviewertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period libraryreviewertelecomperiod =  new org.hl7.fhir.r4.model.Period();
		libraryreviewertelecom.setPeriod(libraryreviewertelecomperiod);

		/******************** Library_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(l.getLibraryRviewrTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat Library_Rviewr_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Library_Rviewr_Tlcm_Prd_Enddate = Library_Rviewr_Tlcm_Prd_Endsdf.parse(l.getLibraryRviewrTlcmPrdEnd());
			libraryreviewertelecomperiod.setEnd(Library_Rviewr_Tlcm_Prd_Enddate);
		}
		/******************** Library_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(l.getLibraryRviewrTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat Library_Rviewr_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Library_Rviewr_Tlcm_Prd_Strtdate = Library_Rviewr_Tlcm_Prd_Strtsdf.parse(l.getLibraryRviewrTlcmPrdStrt());
			libraryreviewertelecomperiod.setStart(Library_Rviewr_Tlcm_Prd_Strtdate);
		}
		/******************** Library_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(l.getLibraryRviewrTlcmRnk() != null) {
			libraryreviewertelecom.setRank(Integer.parseInt(l.getLibraryRviewrTlcmRnk()));
		}
		/******************** libraryreviewertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory libraryreviewertelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		libraryreviewertelecom.setSystem(libraryreviewertelecomsystem.fromCode(l.getLibraryRviewrTlcmSys()));

		/******************** libraryreviewertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory libraryreviewertelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		libraryreviewertelecom.setUse(libraryreviewertelecomuse.fromCode(l.getLibraryRviewrTlcmUse()));

		/******************** Library_Rviewr_Tlcm_Vl ********************************************************************************/
		if(l.getLibraryRviewrTlcmVl() != null) {
			libraryreviewertelecom.setValue(l.getLibraryRviewrTlcmVl());
		}
		/******************** librarystatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory librarystatus =  new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory();
		library.setStatus(librarystatus.fromCode(l.getLibrarySts()));

		/******************** librarysubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept librarysubjectcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		library.setSubject(librarysubjectcodeableconcept);

		/******************** librarysubjectcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding librarysubjectcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		librarysubjectcodeableconcept.addCoding(librarysubjectcodeableconceptcoding);

		/******************** Library_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(l.getLibrarySbjctCdbleCncptCdgCd() != null) {
			librarysubjectcodeableconceptcoding.setCode(l.getLibrarySbjctCdbleCncptCdgCd());
		}
		/******************** Library_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(l.getLibrarySbjctCdbleCncptCdgDsply() != null) {
			librarysubjectcodeableconceptcoding.setDisplay(l.getLibrarySbjctCdbleCncptCdgDsply());
		}
		/******************** Library_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(l.getLibrarySbjctCdbleCncptCdgSys() != null) {
			librarysubjectcodeableconceptcoding.setSystem(l.getLibrarySbjctCdbleCncptCdgSys());
		}
		/******************** Library_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(l.getLibrarySbjctCdbleCncptCdgUsrSltd() != null) {
			librarysubjectcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(l.getLibrarySbjctCdbleCncptCdgUsrSltd()));
		}
		/******************** Library_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(l.getLibrarySbjctCdbleCncptCdgVrsn() != null) {
			librarysubjectcodeableconceptcoding.setVersion(l.getLibrarySbjctCdbleCncptCdgVrsn());
		}
		/******************** Library_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(l.getLibrarySbjctCdbleCncptTxt() != null) {
			librarysubjectcodeableconcept.setText(l.getLibrarySbjctCdbleCncptTxt());
		}
		/******************** Library_SbjctRfrnc ********************************************************************************/
		if(l.getLibrarySbjctRfrnc() != null) {
			library.setSubject( new org.hl7.fhir.r4.model.Reference(l.getLibrarySbjctRfrnc()));
		}
		/******************** Library_Subtitle ********************************************************************************/
		if(l.getLibrarySubtitle() != null) {
			library.setSubtitle(l.getLibrarySubtitle());
		}
		/******************** Library_Ttl ********************************************************************************/
		if(l.getLibraryTtl() != null) {
			library.setTitle(l.getLibraryTtl());
		}
		/******************** librarytopic ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept librarytopic =  new org.hl7.fhir.r4.model.CodeableConcept();
		library.addTopic(librarytopic);

		/******************** librarytopiccoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding librarytopiccoding =  new org.hl7.fhir.r4.model.Coding();
		librarytopic.addCoding(librarytopiccoding);

		/******************** Library_Topic_Cdg_Cd ********************************************************************************/
		if(l.getLibraryTopicCdgCd() != null) {
			librarytopiccoding.setCode(l.getLibraryTopicCdgCd());
		}
		/******************** Library_Topic_Cdg_Dsply ********************************************************************************/
		if(l.getLibraryTopicCdgDsply() != null) {
			librarytopiccoding.setDisplay(l.getLibraryTopicCdgDsply());
		}
		/******************** Library_Topic_Cdg_Sys ********************************************************************************/
		if(l.getLibraryTopicCdgSys() != null) {
			librarytopiccoding.setSystem(l.getLibraryTopicCdgSys());
		}
		/******************** Library_Topic_Cdg_UsrSltd ********************************************************************************/
		if(l.getLibraryTopicCdgUsrSltd() != null) {
			librarytopiccoding.setUserSelected(Boolean.parseBoolean(l.getLibraryTopicCdgUsrSltd()));
		}
		/******************** Library_Topic_Cdg_Vrsn ********************************************************************************/
		if(l.getLibraryTopicCdgVrsn() != null) {
			librarytopiccoding.setVersion(l.getLibraryTopicCdgVrsn());
		}
		/******************** Library_Topic_Txt ********************************************************************************/
		if(l.getLibraryTopicTxt() != null) {
			librarytopic.setText(l.getLibraryTopicTxt());
		}
		/******************** librarytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept librarytype =  new org.hl7.fhir.r4.model.CodeableConcept();
		library.setType(librarytype);

		/******************** librarytypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding librarytypecoding =  new org.hl7.fhir.r4.model.Coding();
		librarytype.addCoding(librarytypecoding);

		/******************** Library_Typ_Cdg_Cd ********************************************************************************/
		if(l.getLibraryTypCdgCd() != null) {
			librarytypecoding.setCode(l.getLibraryTypCdgCd());
		}
		/******************** Library_Typ_Cdg_Dsply ********************************************************************************/
		if(l.getLibraryTypCdgDsply() != null) {
			librarytypecoding.setDisplay(l.getLibraryTypCdgDsply());
		}
		/******************** Library_Typ_Cdg_Sys ********************************************************************************/
		if(l.getLibraryTypCdgSys() != null) {
			librarytypecoding.setSystem(l.getLibraryTypCdgSys());
		}
		/******************** Library_Typ_Cdg_UsrSltd ********************************************************************************/
		if(l.getLibraryTypCdgUsrSltd() != null) {
			librarytypecoding.setUserSelected(Boolean.parseBoolean(l.getLibraryTypCdgUsrSltd()));
		}
		/******************** Library_Typ_Cdg_Vrsn ********************************************************************************/
		if(l.getLibraryTypCdgVrsn() != null) {
			librarytypecoding.setVersion(l.getLibraryTypCdgVrsn());
		}
		/******************** Library_Typ_Txt ********************************************************************************/
		if(l.getLibraryTypTxt() != null) {
			librarytype.setText(l.getLibraryTypTxt());
		}
		/******************** Library_Url ********************************************************************************/
		if(l.getLibraryUrl() != null) {
			library.setUrl(l.getLibraryUrl());
		}
		/******************** Library_Usg ********************************************************************************/
		if(l.getLibraryUsg() != null) {
			library.setUsage(l.getLibraryUsg());
		}
		/******************** libraryusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext libraryusecontext =  new org.hl7.fhir.r4.model.UsageContext();
		library.addUseContext(libraryusecontext);

		/******************** libraryusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding libraryusecontextcode =  new org.hl7.fhir.r4.model.Coding();
		libraryusecontext.setCode(libraryusecontextcode);

		/******************** Library_UseCntxt_Cd_Cd ********************************************************************************/
		if(l.getLibraryUseCntxtCdCd() != null) {
			libraryusecontextcode.setCode(l.getLibraryUseCntxtCdCd());
		}
		/******************** Library_UseCntxt_Cd_Dsply ********************************************************************************/
		if(l.getLibraryUseCntxtCdDsply() != null) {
			libraryusecontextcode.setDisplay(l.getLibraryUseCntxtCdDsply());
		}
		/******************** Library_UseCntxt_Cd_Sys ********************************************************************************/
		if(l.getLibraryUseCntxtCdSys() != null) {
			libraryusecontextcode.setSystem(l.getLibraryUseCntxtCdSys());
		}
		/******************** Library_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(l.getLibraryUseCntxtCdUsrSltd() != null) {
			libraryusecontextcode.setUserSelected(Boolean.parseBoolean(l.getLibraryUseCntxtCdUsrSltd()));
		}
		/******************** Library_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(l.getLibraryUseCntxtCdVrsn() != null) {
			libraryusecontextcode.setVersion(l.getLibraryUseCntxtCdVrsn());
		}
		/******************** libraryusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept libraryusecontextvaluecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		libraryusecontext.setValue(libraryusecontextvaluecodeableconcept);

		/******************** libraryusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding libraryusecontextvaluecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		libraryusecontextvaluecodeableconcept.addCoding(libraryusecontextvaluecodeableconceptcoding);

		/******************** Library_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(l.getLibraryUseCntxtVlCdbleCncptCdgCd() != null) {
			libraryusecontextvaluecodeableconceptcoding.setCode(l.getLibraryUseCntxtVlCdbleCncptCdgCd());
		}
		/******************** Library_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(l.getLibraryUseCntxtVlCdbleCncptCdgDsply() != null) {
			libraryusecontextvaluecodeableconceptcoding.setDisplay(l.getLibraryUseCntxtVlCdbleCncptCdgDsply());
		}
		/******************** Library_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(l.getLibraryUseCntxtVlCdbleCncptCdgSys() != null) {
			libraryusecontextvaluecodeableconceptcoding.setSystem(l.getLibraryUseCntxtVlCdbleCncptCdgSys());
		}
		/******************** Library_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(l.getLibraryUseCntxtVlCdbleCncptCdgUsrSltd() != null) {
			libraryusecontextvaluecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(l.getLibraryUseCntxtVlCdbleCncptCdgUsrSltd()));
		}
		/******************** Library_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(l.getLibraryUseCntxtVlCdbleCncptCdgVrsn() != null) {
			libraryusecontextvaluecodeableconceptcoding.setVersion(l.getLibraryUseCntxtVlCdbleCncptCdgVrsn());
		}
		/******************** Library_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(l.getLibraryUseCntxtVlCdbleCncptTxt() != null) {
			libraryusecontextvaluecodeableconcept.setText(l.getLibraryUseCntxtVlCdbleCncptTxt());
		}
		/******************** libraryusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity libraryusecontextvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		libraryusecontext.setValue(libraryusecontextvaluequantity);

		/******************** Library_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(l.getLibraryUseCntxtVlQntyCd() != null) {
			libraryusecontextvaluequantity.setCode(l.getLibraryUseCntxtVlQntyCd());
		}
		/******************** libraryusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory libraryusecontextvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		libraryusecontextvaluequantity.setComparator(libraryusecontextvaluequantitycomparator.fromCode(l.getLibraryUseCntxtVlQntyCmprtr()));

		/******************** Library_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(l.getLibraryUseCntxtVlQntySys() != null) {
			libraryusecontextvaluequantity.setSystem(l.getLibraryUseCntxtVlQntySys());
		}
		/******************** Library_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(l.getLibraryUseCntxtVlQntyUnt() != null) {
			libraryusecontextvaluequantity.setUnit(l.getLibraryUseCntxtVlQntyUnt());
		}
		/******************** Library_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(l.getLibraryUseCntxtVlQntyVl() != null) {
			libraryusecontextvaluequantity.setValue(Double.parseDouble((l.getLibraryUseCntxtVlQntyVl())));
		}
		/******************** libraryusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range libraryusecontextvaluerange =  new org.hl7.fhir.r4.model.Range();
		libraryusecontext.setValue(libraryusecontextvaluerange);

		/******************** libraryusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity libraryusecontextvaluerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		libraryusecontextvaluerange.setHigh(libraryusecontextvaluerangehigh);

		/******************** Library_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(l.getLibraryUseCntxtVlRngHiCd() != null) {
			libraryusecontextvaluerangehigh.setCode(l.getLibraryUseCntxtVlRngHiCd());
		}
		/******************** libraryusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory libraryusecontextvaluerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		libraryusecontextvaluerangehigh.setComparator(libraryusecontextvaluerangehighcomparator.fromCode(l.getLibraryUseCntxtVlRngHiCmprtr()));

		/******************** Library_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(l.getLibraryUseCntxtVlRngHiSys() != null) {
			libraryusecontextvaluerangehigh.setSystem(l.getLibraryUseCntxtVlRngHiSys());
		}
		/******************** Library_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(l.getLibraryUseCntxtVlRngHiUnt() != null) {
			libraryusecontextvaluerangehigh.setUnit(l.getLibraryUseCntxtVlRngHiUnt());
		}
		/******************** Library_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(l.getLibraryUseCntxtVlRngHiVl() != null) {
			libraryusecontextvaluerangehigh.setValue(Double.parseDouble((l.getLibraryUseCntxtVlRngHiVl())));
		}
		/******************** libraryusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity libraryusecontextvaluerangelow =  new org.hl7.fhir.r4.model.Quantity();
		libraryusecontextvaluerange.setLow(libraryusecontextvaluerangelow);

		/******************** Library_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(l.getLibraryUseCntxtVlRngLwCd() != null) {
			libraryusecontextvaluerangelow.setCode(l.getLibraryUseCntxtVlRngLwCd());
		}
		/******************** libraryusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory libraryusecontextvaluerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		libraryusecontextvaluerangelow.setComparator(libraryusecontextvaluerangelowcomparator.fromCode(l.getLibraryUseCntxtVlRngLwCmprtr()));

		/******************** Library_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(l.getLibraryUseCntxtVlRngLwSys() != null) {
			libraryusecontextvaluerangelow.setSystem(l.getLibraryUseCntxtVlRngLwSys());
		}
		/******************** Library_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(l.getLibraryUseCntxtVlRngLwUnt() != null) {
			libraryusecontextvaluerangelow.setUnit(l.getLibraryUseCntxtVlRngLwUnt());
		}
		/******************** Library_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(l.getLibraryUseCntxtVlRngLwVl() != null) {
			libraryusecontextvaluerangelow.setValue(Double.parseDouble((l.getLibraryUseCntxtVlRngLwVl())));
		}
		/******************** Library_UseCntxt_VlRfrnc ********************************************************************************/
		if(l.getLibraryUseCntxtVlRfrnc() != null) {
			libraryusecontext.setValue( new org.hl7.fhir.r4.model.Reference(l.getLibraryUseCntxtVlRfrnc()));
		}
		/******************** Library_Vrsn ********************************************************************************/
		if(l.getLibraryVrsn() != null) {
			library.setVersion(l.getLibraryVrsn());
		}
		return library;
	}
}
