package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Library;
public class LibraryBidirectionalConversion 
{
	public Library Librarys(org.hl7.fhir.r4.model.Library library) throws ParseException
	{
		 main.java.com.campfhir.model.Library l = new  main.java.com.campfhir.model.Library();

		/******************** id ********************************************************************************/
		library.setId(l.getId());

		/******************** Library_Nm ********************************************************************************/
		if(library.hasName()) {
			l.setLibraryNm(String.valueOf(library.getName()));
		}
		/******************** librarytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept librarytype = library.getType();

		/******************** Library_Typ_Txt ********************************************************************************/
		if(librarytype.hasText()) {
			l.setLibraryTypTxt(String.valueOf(librarytype.getText()));
		}
		/******************** librarytypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding librarytypecoding = librarytype.getCodingFirstRep();

		/******************** Library_Typ_Cdg_Vrsn ********************************************************************************/
		if(librarytypecoding.hasVersion()) {
			l.setLibraryTypCdgVrsn(String.valueOf(librarytypecoding.getVersion()));
		}
		/******************** Library_Typ_Cdg_Dsply ********************************************************************************/
		if(librarytypecoding.hasDisplay()) {
			l.setLibraryTypCdgDsply(String.valueOf(librarytypecoding.getDisplay()));
		}
		/******************** Library_Typ_Cdg_Cd ********************************************************************************/
		if(librarytypecoding.hasCode()) {
			l.setLibraryTypCdgCd(String.valueOf(librarytypecoding.getCode()));
		}
		/******************** Library_Typ_Cdg_UsrSltd ********************************************************************************/
		if(librarytypecoding.hasUserSelected()) {
			l.setLibraryTypCdgUsrSltd(String.valueOf(librarytypecoding.getUserSelected()));
		}
		/******************** Library_Typ_Cdg_Sys ********************************************************************************/
		if(librarytypecoding.hasSystem()) {
			l.setLibraryTypCdgSys(String.valueOf(librarytypecoding.getSystem()));
		}
		/******************** Library_Dt ********************************************************************************/
		if(library.hasDate()) {
			l.setLibraryDt(String.valueOf(library.getDate()));
		}
		/******************** Library_Vrsn ********************************************************************************/
		if(library.hasVersion()) {
			l.setLibraryVrsn(String.valueOf(library.getVersion()));
		}
		/******************** libraryreviewer ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail libraryreviewer = library.getReviewerFirstRep();

		/******************** Library_Rviewr_Nm ********************************************************************************/
		if(libraryreviewer.hasName()) {
			l.setLibraryRviewrNm(String.valueOf(libraryreviewer.getName()));
		}
		/******************** libraryreviewertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint libraryreviewertelecom = libraryreviewer.getTelecomFirstRep();

		/******************** Library_Rviewr_Tlcm_Vl ********************************************************************************/
		if(libraryreviewertelecom.hasValue()) {
			l.setLibraryRviewrTlcmVl(String.valueOf(libraryreviewertelecom.getValue()));
		}
		/******************** libraryreviewertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period libraryreviewertelecomperiod = libraryreviewertelecom.getPeriod();

		/******************** Library_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(libraryreviewertelecomperiod.hasStart()) {
			l.setLibraryRviewrTlcmPrdStrt(String.valueOf(libraryreviewertelecomperiod.getStart()));
		}
		/******************** Library_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(libraryreviewertelecomperiod.hasEnd()) {
			l.setLibraryRviewrTlcmPrdEnd(String.valueOf(libraryreviewertelecomperiod.getEnd()));
		}
		/******************** libraryreviewertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem libraryreviewertelecomsystem = libraryreviewertelecom.getSystem();
		l.setLibraryRviewrTlcmSys(libraryreviewertelecomsystem.toCode());

		/******************** libraryreviewertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse libraryreviewertelecomuse = libraryreviewertelecom.getUse();
		l.setLibraryRviewrTlcmUse(libraryreviewertelecomuse.toCode());

		/******************** Library_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(libraryreviewertelecom.hasRank()) {
			l.setLibraryRviewrTlcmRnk(String.valueOf(libraryreviewertelecom.getRank()));
		}
		/******************** librarysubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept librarysubjectcodeableconcept = library.getSubjectCodeableConcept();

		/******************** Library_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(librarysubjectcodeableconcept.hasText()) {
			l.setLibrarySbjctCdbleCncptTxt(String.valueOf(librarysubjectcodeableconcept.getText()));
		}
		/******************** librarysubjectcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding librarysubjectcodeableconceptcoding = librarysubjectcodeableconcept.getCodingFirstRep();

		/******************** Library_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(librarysubjectcodeableconceptcoding.hasVersion()) {
			l.setLibrarySbjctCdbleCncptCdgVrsn(String.valueOf(librarysubjectcodeableconceptcoding.getVersion()));
		}
		/******************** Library_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(librarysubjectcodeableconceptcoding.hasDisplay()) {
			l.setLibrarySbjctCdbleCncptCdgDsply(String.valueOf(librarysubjectcodeableconceptcoding.getDisplay()));
		}
		/******************** Library_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(librarysubjectcodeableconceptcoding.hasCode()) {
			l.setLibrarySbjctCdbleCncptCdgCd(String.valueOf(librarysubjectcodeableconceptcoding.getCode()));
		}
		/******************** Library_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(librarysubjectcodeableconceptcoding.hasUserSelected()) {
			l.setLibrarySbjctCdbleCncptCdgUsrSltd(String.valueOf(librarysubjectcodeableconceptcoding.getUserSelected()));
		}
		/******************** Library_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(librarysubjectcodeableconceptcoding.hasSystem()) {
			l.setLibrarySbjctCdbleCncptCdgSys(String.valueOf(librarysubjectcodeableconceptcoding.getSystem()));
		}
		/******************** Library_SbjctRfrnc ********************************************************************************/
		if(library.hasSubjectReference()) {
			l.setLibrarySbjctRfrnc(String.valueOf(library.getSubjectReference()));
		}
		/******************** libraryendorser ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail libraryendorser = library.getEndorserFirstRep();

		/******************** Library_Endsr_Nm ********************************************************************************/
		if(libraryendorser.hasName()) {
			l.setLibraryEndsrNm(String.valueOf(libraryendorser.getName()));
		}
		/******************** libraryendorsertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint libraryendorsertelecom = libraryendorser.getTelecomFirstRep();

		/******************** Library_Endsr_Tlcm_Vl ********************************************************************************/
		if(libraryendorsertelecom.hasValue()) {
			l.setLibraryEndsrTlcmVl(String.valueOf(libraryendorsertelecom.getValue()));
		}
		/******************** libraryendorsertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period libraryendorsertelecomperiod = libraryendorsertelecom.getPeriod();

		/******************** Library_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(libraryendorsertelecomperiod.hasStart()) {
			l.setLibraryEndsrTlcmPrdStrt(String.valueOf(libraryendorsertelecomperiod.getStart()));
		}
		/******************** Library_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(libraryendorsertelecomperiod.hasEnd()) {
			l.setLibraryEndsrTlcmPrdEnd(String.valueOf(libraryendorsertelecomperiod.getEnd()));
		}
		/******************** libraryendorsertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem libraryendorsertelecomsystem = libraryendorsertelecom.getSystem();
		l.setLibraryEndsrTlcmSys(libraryendorsertelecomsystem.toCode());

		/******************** libraryendorsertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse libraryendorsertelecomuse = libraryendorsertelecom.getUse();
		l.setLibraryEndsrTlcmUse(libraryendorsertelecomuse.toCode());

		/******************** Library_Endsr_Tlcm_Rnk ********************************************************************************/
		if(libraryendorsertelecom.hasRank()) {
			l.setLibraryEndsrTlcmRnk(String.valueOf(libraryendorsertelecom.getRank()));
		}
		/******************** Library_Ttl ********************************************************************************/
		if(library.hasTitle()) {
			l.setLibraryTtl(String.valueOf(library.getTitle()));
		}
		/******************** Library_Subtitle ********************************************************************************/
		if(library.hasSubtitle()) {
			l.setLibrarySubtitle(String.valueOf(library.getSubtitle()));
		}
		/******************** librarystatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus librarystatus = library.getStatus();
		l.setLibrarySts(librarystatus.toCode());

		/******************** Library_Dscrptn ********************************************************************************/
		if(library.hasDescription()) {
			l.setLibraryDscrptn(String.valueOf(library.getDescription()));
		}
		/******************** Library_Url ********************************************************************************/
		if(library.hasUrl()) {
			l.setLibraryUrl(String.valueOf(library.getUrl()));
		}
		/******************** Library_Pblshr ********************************************************************************/
		if(library.hasPublisher()) {
			l.setLibraryPblshr(String.valueOf(library.getPublisher()));
		}
		/******************** Library_Exprmtl ********************************************************************************/
		if(library.hasExperimental()) {
			l.setLibraryExprmtl(String.valueOf(library.getExperimental()));
		}
		/******************** libraryeffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period libraryeffectiveperiod = library.getEffectivePeriod();

		/******************** Library_EfctivePrd_Strt ********************************************************************************/
		if(libraryeffectiveperiod.hasStart()) {
			l.setLibraryEfctivePrdStrt(String.valueOf(libraryeffectiveperiod.getStart()));
		}
		/******************** Library_EfctivePrd_End ********************************************************************************/
		if(libraryeffectiveperiod.hasEnd()) {
			l.setLibraryEfctivePrdEnd(String.valueOf(libraryeffectiveperiod.getEnd()));
		}
		/******************** librarydatarequirement ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement librarydatarequirement = library.getDataRequirementFirstRep();

		/******************** Library_DataRqrment_Typ ********************************************************************************/
		if(librarydatarequirement.hasType()) {
			l.setLibraryDataRqrmentTyp(String.valueOf(librarydatarequirement.getType()));
		}
		/******************** librarydatarequirementsubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept librarydatarequirementsubjectcodeableconcept = librarydatarequirement.getSubjectCodeableConcept();

		/******************** Library_DataRqrment_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(librarydatarequirementsubjectcodeableconcept.hasText()) {
			l.setLibraryDataRqrmentSbjctCdbleCncptTxt(String.valueOf(librarydatarequirementsubjectcodeableconcept.getText()));
		}
		/******************** librarydatarequirementsubjectcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding librarydatarequirementsubjectcodeableconceptcoding = librarydatarequirementsubjectcodeableconcept.getCodingFirstRep();

		/******************** Library_DataRqrment_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(librarydatarequirementsubjectcodeableconceptcoding.hasVersion()) {
			l.setLibraryDataRqrmentSbjctCdbleCncptCdgVrsn(String.valueOf(librarydatarequirementsubjectcodeableconceptcoding.getVersion()));
		}
		/******************** Library_DataRqrment_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(librarydatarequirementsubjectcodeableconceptcoding.hasDisplay()) {
			l.setLibraryDataRqrmentSbjctCdbleCncptCdgDsply(String.valueOf(librarydatarequirementsubjectcodeableconceptcoding.getDisplay()));
		}
		/******************** Library_DataRqrment_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(librarydatarequirementsubjectcodeableconceptcoding.hasCode()) {
			l.setLibraryDataRqrmentSbjctCdbleCncptCdgCd(String.valueOf(librarydatarequirementsubjectcodeableconceptcoding.getCode()));
		}
		/******************** Library_DataRqrment_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(librarydatarequirementsubjectcodeableconceptcoding.hasUserSelected()) {
			l.setLibraryDataRqrmentSbjctCdbleCncptCdgUsrSltd(String.valueOf(librarydatarequirementsubjectcodeableconceptcoding.getUserSelected()));
		}
		/******************** Library_DataRqrment_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(librarydatarequirementsubjectcodeableconceptcoding.hasSystem()) {
			l.setLibraryDataRqrmentSbjctCdbleCncptCdgSys(String.valueOf(librarydatarequirementsubjectcodeableconceptcoding.getSystem()));
		}
		/******************** Library_DataRqrment_SbjctRfrnc ********************************************************************************/
		if(librarydatarequirement.hasSubjectReference()) {
			l.setLibraryDataRqrmentSbjctRfrnc(String.valueOf(librarydatarequirement.getSubjectReference()));
		}
		/******************** Library_DataRqrment_Lmt ********************************************************************************/
		if(librarydatarequirement.hasLimit()) {
			l.setLibraryDataRqrmentLmt(String.valueOf(librarydatarequirement.getLimit()));
		}
		/******************** librarydatarequirementsort ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent librarydatarequirementsort = librarydatarequirement.getSortFirstRep();

		/******************** Library_DataRqrment_Sort_Path ********************************************************************************/
		if(librarydatarequirementsort.hasPath()) {
			l.setLibraryDataRqrmentSortPath(String.valueOf(librarydatarequirementsort.getPath()));
		}
		/******************** librarydatarequirementsortdirection ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.SortDirection librarydatarequirementsortdirection = librarydatarequirementsort.getDirection();
		l.setLibraryDataRqrmentSortDirection(librarydatarequirementsortdirection.toCode());

		/******************** librarydatarequirementdatefilter ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent librarydatarequirementdatefilter = librarydatarequirement.getDateFilterFirstRep();

		/******************** Library_DataRqrment_DtFltr_Path ********************************************************************************/
		if(librarydatarequirementdatefilter.hasPath()) {
			l.setLibraryDataRqrmentDtFltrPath(String.valueOf(librarydatarequirementdatefilter.getPath()));
		}
		/******************** Library_DataRqrment_DtFltr_SrchParam ********************************************************************************/
		if(librarydatarequirementdatefilter.hasSearchParam()) {
			l.setLibraryDataRqrmentDtFltrSrchParam(String.valueOf(librarydatarequirementdatefilter.getSearchParam()));
		}
		/******************** Library_DataRqrment_DtFltr_VlDtTimeTyp ********************************************************************************/
		if(librarydatarequirementdatefilter.hasValueDateTimeType()) {
			l.setLibraryDataRqrmentDtFltrVlDtTimeTyp(String.valueOf(librarydatarequirementdatefilter.getValueDateTimeType()));
		}
		/******************** librarydatarequirementdatefiltervalueduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration librarydatarequirementdatefiltervalueduration = librarydatarequirementdatefilter.getValueDuration();

		/******************** Library_DataRqrment_DtFltr_VlDuration_Vl ********************************************************************************/
		if(librarydatarequirementdatefiltervalueduration.hasValue()) {
			l.setLibraryDataRqrmentDtFltrVlDurationVl(String.valueOf(librarydatarequirementdatefiltervalueduration.getValue()));
		}
		/******************** librarydatarequirementdatefiltervaluedurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator librarydatarequirementdatefiltervaluedurationcomparator = librarydatarequirementdatefiltervalueduration.getComparator();
		l.setLibraryDataRqrmentDtFltrVlDurationCmprtr(librarydatarequirementdatefiltervaluedurationcomparator.toCode());

		/******************** Library_DataRqrment_DtFltr_VlDuration_Cd ********************************************************************************/
		if(librarydatarequirementdatefiltervalueduration.hasCode()) {
			l.setLibraryDataRqrmentDtFltrVlDurationCd(String.valueOf(librarydatarequirementdatefiltervalueduration.getCode()));
		}
		/******************** Library_DataRqrment_DtFltr_VlDuration_Unt ********************************************************************************/
		if(librarydatarequirementdatefiltervalueduration.hasUnit()) {
			l.setLibraryDataRqrmentDtFltrVlDurationUnt(String.valueOf(librarydatarequirementdatefiltervalueduration.getUnit()));
		}
		/******************** Library_DataRqrment_DtFltr_VlDuration_Sys ********************************************************************************/
		if(librarydatarequirementdatefiltervalueduration.hasSystem()) {
			l.setLibraryDataRqrmentDtFltrVlDurationSys(String.valueOf(librarydatarequirementdatefiltervalueduration.getSystem()));
		}
		/******************** librarydatarequirementdatefiltervalueperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period librarydatarequirementdatefiltervalueperiod = librarydatarequirementdatefilter.getValuePeriod();

		/******************** Library_DataRqrment_DtFltr_VlPrd_Strt ********************************************************************************/
		if(librarydatarequirementdatefiltervalueperiod.hasStart()) {
			l.setLibraryDataRqrmentDtFltrVlPrdStrt(String.valueOf(librarydatarequirementdatefiltervalueperiod.getStart()));
		}
		/******************** Library_DataRqrment_DtFltr_VlPrd_End ********************************************************************************/
		if(librarydatarequirementdatefiltervalueperiod.hasEnd()) {
			l.setLibraryDataRqrmentDtFltrVlPrdEnd(String.valueOf(librarydatarequirementdatefiltervalueperiod.getEnd()));
		}
		/******************** librarydatarequirementcodefilter ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent librarydatarequirementcodefilter = librarydatarequirement.getCodeFilterFirstRep();

		/******************** Library_DataRqrment_CdFltr_Path ********************************************************************************/
		if(librarydatarequirementcodefilter.hasPath()) {
			l.setLibraryDataRqrmentCdFltrPath(String.valueOf(librarydatarequirementcodefilter.getPath()));
		}
		/******************** Library_DataRqrment_CdFltr_SrchParam ********************************************************************************/
		if(librarydatarequirementcodefilter.hasSearchParam()) {
			l.setLibraryDataRqrmentCdFltrSrchParam(String.valueOf(librarydatarequirementcodefilter.getSearchParam()));
		}
		/******************** Library_DataRqrment_CdFltr_VlSt ********************************************************************************/
		if(librarydatarequirementcodefilter.hasValueSet()) {
			l.setLibraryDataRqrmentCdFltrVlSt(String.valueOf(librarydatarequirementcodefilter.getValueSet()));
		}
		/******************** librarydatarequirementcodefiltercode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding librarydatarequirementcodefiltercode = librarydatarequirementcodefilter.getCodeFirstRep();

		/******************** Library_DataRqrment_CdFltr_Cd_Vrsn ********************************************************************************/
		if(librarydatarequirementcodefiltercode.hasVersion()) {
			l.setLibraryDataRqrmentCdFltrCdVrsn(String.valueOf(librarydatarequirementcodefiltercode.getVersion()));
		}
		/******************** Library_DataRqrment_CdFltr_Cd_Dsply ********************************************************************************/
		if(librarydatarequirementcodefiltercode.hasDisplay()) {
			l.setLibraryDataRqrmentCdFltrCdDsply(String.valueOf(librarydatarequirementcodefiltercode.getDisplay()));
		}
		/******************** Library_DataRqrment_CdFltr_Cd_UsrSltd ********************************************************************************/
		if(librarydatarequirementcodefiltercode.hasUserSelected()) {
			l.setLibraryDataRqrmentCdFltrCdUsrSltd(String.valueOf(librarydatarequirementcodefiltercode.getUserSelected()));
		}
		/******************** Library_DataRqrment_CdFltr_Cd_Sys ********************************************************************************/
		if(librarydatarequirementcodefiltercode.hasSystem()) {
			l.setLibraryDataRqrmentCdFltrCdSys(String.valueOf(librarydatarequirementcodefiltercode.getSystem()));
		}
		/******************** libraryparameter ********************************************************************************/
		org.hl7.fhir.r4.model.ParameterDefinition libraryparameter = library.getParameterFirstRep();

		/******************** Library_Prmtr_Nm ********************************************************************************/
		if(libraryparameter.hasName()) {
			l.setLibraryPrmtrNm(String.valueOf(libraryparameter.getName()));
		}
		/******************** Library_Prmtr_Typ ********************************************************************************/
		if(libraryparameter.hasType()) {
			l.setLibraryPrmtrTyp(String.valueOf(libraryparameter.getType()));
		}
		/******************** Library_Prmtr_Min ********************************************************************************/
		if(libraryparameter.hasMin()) {
			l.setLibraryPrmtrMin(String.valueOf(libraryparameter.getMin()));
		}
		/******************** Library_Prmtr_Mx ********************************************************************************/
		if(libraryparameter.hasMax()) {
			l.setLibraryPrmtrMx(String.valueOf(libraryparameter.getMax()));
		}
		/******************** Library_Prmtr_Profile ********************************************************************************/
		if(libraryparameter.hasProfile()) {
			l.setLibraryPrmtrProfile(String.valueOf(libraryparameter.getProfile()));
		}
		/******************** libraryparameteruse ********************************************************************************/
		org.hl7.fhir.r4.model.ParameterDefinition.ParameterUse libraryparameteruse = libraryparameter.getUse();
		l.setLibraryPrmtrUse(libraryparameteruse.toCode());

		/******************** Library_Prmtr_Docation ********************************************************************************/
		if(libraryparameter.hasDocumentation()) {
			l.setLibraryPrmtrDocation(String.valueOf(libraryparameter.getDocumentation()));
		}
		/******************** Library_Prpse ********************************************************************************/
		if(library.hasPurpose()) {
			l.setLibraryPrpse(String.valueOf(library.getPurpose()));
		}
		/******************** libraryauthor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail libraryauthor = library.getAuthorFirstRep();

		/******************** Library_Athr_Nm ********************************************************************************/
		if(libraryauthor.hasName()) {
			l.setLibraryAthrNm(String.valueOf(libraryauthor.getName()));
		}
		/******************** libraryauthortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint libraryauthortelecom = libraryauthor.getTelecomFirstRep();

		/******************** Library_Athr_Tlcm_Vl ********************************************************************************/
		if(libraryauthortelecom.hasValue()) {
			l.setLibraryAthrTlcmVl(String.valueOf(libraryauthortelecom.getValue()));
		}
		/******************** libraryauthortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period libraryauthortelecomperiod = libraryauthortelecom.getPeriod();

		/******************** Library_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(libraryauthortelecomperiod.hasStart()) {
			l.setLibraryAthrTlcmPrdStrt(String.valueOf(libraryauthortelecomperiod.getStart()));
		}
		/******************** Library_Athr_Tlcm_Prd_End ********************************************************************************/
		if(libraryauthortelecomperiod.hasEnd()) {
			l.setLibraryAthrTlcmPrdEnd(String.valueOf(libraryauthortelecomperiod.getEnd()));
		}
		/******************** libraryauthortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem libraryauthortelecomsystem = libraryauthortelecom.getSystem();
		l.setLibraryAthrTlcmSys(libraryauthortelecomsystem.toCode());

		/******************** libraryauthortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse libraryauthortelecomuse = libraryauthortelecom.getUse();
		l.setLibraryAthrTlcmUse(libraryauthortelecomuse.toCode());

		/******************** Library_Athr_Tlcm_Rnk ********************************************************************************/
		if(libraryauthortelecom.hasRank()) {
			l.setLibraryAthrTlcmRnk(String.valueOf(libraryauthortelecom.getRank()));
		}
		/******************** librarycontent ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment librarycontent = library.getContentFirstRep();

		/******************** Library_Cntnt_Sz ********************************************************************************/
		if(librarycontent.hasSize()) {
			l.setLibraryCntntSz(String.valueOf(librarycontent.getSize()));
		}
		/******************** Library_Cntnt_Lnguage ********************************************************************************/
		if(librarycontent.hasLanguage()) {
			l.setLibraryCntntLnguage(String.valueOf(librarycontent.getLanguage()));
		}
		/******************** Library_Cntnt_Ttl ********************************************************************************/
		if(librarycontent.hasTitle()) {
			l.setLibraryCntntTtl(String.valueOf(librarycontent.getTitle()));
		}
		/******************** Library_Cntnt_Url ********************************************************************************/
		if(librarycontent.hasUrl()) {
			l.setLibraryCntntUrl(String.valueOf(librarycontent.getUrl()));
		}
		/******************** Library_Cntnt_Data ********************************************************************************/
		if(librarycontent.hasData()) {
			l.setLibraryCntntData(String.valueOf(librarycontent.getData()));
		}

		/******************** Library_Cntnt_Hash ********************************************************************************/
		if(librarycontent.hasHash()) {
			l.setLibraryCntntHash(String.valueOf(librarycontent.getHash()));
		}

		/******************** Library_Cntnt_Creation ********************************************************************************/
		if(librarycontent.hasCreation()) {
			l.setLibraryCntntCreation(String.valueOf(librarycontent.getCreation()));
		}
		/******************** librarycontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail librarycontact = library.getContactFirstRep();

		/******************** Library_Cntct_Nm ********************************************************************************/
		if(librarycontact.hasName()) {
			l.setLibraryCntctNm(String.valueOf(librarycontact.getName()));
		}
		/******************** librarycontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint librarycontacttelecom = librarycontact.getTelecomFirstRep();

		/******************** Library_Cntct_Tlcm_Vl ********************************************************************************/
		if(librarycontacttelecom.hasValue()) {
			l.setLibraryCntctTlcmVl(String.valueOf(librarycontacttelecom.getValue()));
		}
		/******************** librarycontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period librarycontacttelecomperiod = librarycontacttelecom.getPeriod();

		/******************** Library_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(librarycontacttelecomperiod.hasStart()) {
			l.setLibraryCntctTlcmPrdStrt(String.valueOf(librarycontacttelecomperiod.getStart()));
		}
		/******************** Library_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(librarycontacttelecomperiod.hasEnd()) {
			l.setLibraryCntctTlcmPrdEnd(String.valueOf(librarycontacttelecomperiod.getEnd()));
		}
		/******************** librarycontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem librarycontacttelecomsystem = librarycontacttelecom.getSystem();
		l.setLibraryCntctTlcmSys(librarycontacttelecomsystem.toCode());

		/******************** librarycontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse librarycontacttelecomuse = librarycontacttelecom.getUse();
		l.setLibraryCntctTlcmUse(librarycontacttelecomuse.toCode());

		/******************** Library_Cntct_Tlcm_Rnk ********************************************************************************/
		if(librarycontacttelecom.hasRank()) {
			l.setLibraryCntctTlcmRnk(String.valueOf(librarycontacttelecom.getRank()));
		}
		/******************** libraryidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier libraryidentifier = library.getIdentifierFirstRep();

		/******************** Library_Id_Vl ********************************************************************************/
		if(libraryidentifier.hasValue()) {
			l.setLibraryIdVl(String.valueOf(libraryidentifier.getValue()));
		}
		/******************** libraryidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept libraryidentifiertype = libraryidentifier.getType();

		/******************** Library_Id_Typ_Txt ********************************************************************************/
		if(libraryidentifiertype.hasText()) {
			l.setLibraryIdTypTxt(String.valueOf(libraryidentifiertype.getText()));
		}
		/******************** libraryidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding libraryidentifiertypecoding = libraryidentifiertype.getCodingFirstRep();

		/******************** Library_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(libraryidentifiertypecoding.hasVersion()) {
			l.setLibraryIdTypCdgVrsn(String.valueOf(libraryidentifiertypecoding.getVersion()));
		}
		/******************** Library_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(libraryidentifiertypecoding.hasDisplay()) {
			l.setLibraryIdTypCdgDsply(String.valueOf(libraryidentifiertypecoding.getDisplay()));
		}
		/******************** Library_Id_Typ_Cdg_Cd ********************************************************************************/
		if(libraryidentifiertypecoding.hasCode()) {
			l.setLibraryIdTypCdgCd(String.valueOf(libraryidentifiertypecoding.getCode()));
		}
		/******************** Library_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(libraryidentifiertypecoding.hasUserSelected()) {
			l.setLibraryIdTypCdgUsrSltd(String.valueOf(libraryidentifiertypecoding.getUserSelected()));
		}
		/******************** Library_Id_Typ_Cdg_Sys ********************************************************************************/
		if(libraryidentifiertypecoding.hasSystem()) {
			l.setLibraryIdTypCdgSys(String.valueOf(libraryidentifiertypecoding.getSystem()));
		}
		/******************** libraryidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period libraryidentifierperiod = libraryidentifier.getPeriod();

		/******************** Library_Id_Prd_Strt ********************************************************************************/
		if(libraryidentifierperiod.hasStart()) {
			l.setLibraryIdPrdStrt(String.valueOf(libraryidentifierperiod.getStart()));
		}
		/******************** Library_Id_Prd_End ********************************************************************************/
		if(libraryidentifierperiod.hasEnd()) {
			l.setLibraryIdPrdEnd(String.valueOf(libraryidentifierperiod.getEnd()));
		}
		/******************** Library_Id_Assigner ********************************************************************************/
		if(libraryidentifier.hasAssigner()) {
			l.setLibraryIdAssigner(String.valueOf(libraryidentifier.getAssigner()));
		}
		/******************** Library_Id_Sys ********************************************************************************/
		if(libraryidentifier.hasSystem()) {
			l.setLibraryIdSys(String.valueOf(libraryidentifier.getSystem()));
		}
		/******************** libraryidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse libraryidentifieruse = libraryidentifier.getUse();
		l.setLibraryIdUse(libraryidentifieruse.toCode());

		/******************** Library_Copyright ********************************************************************************/
		if(library.hasCopyright()) {
			l.setLibraryCopyright(String.valueOf(library.getCopyright()));
		}
		/******************** librarytopic ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept librarytopic = library.getTopicFirstRep();

		/******************** Library_Topic_Txt ********************************************************************************/
		if(librarytopic.hasText()) {
			l.setLibraryTopicTxt(String.valueOf(librarytopic.getText()));
		}
		/******************** librarytopiccoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding librarytopiccoding = librarytopic.getCodingFirstRep();

		/******************** Library_Topic_Cdg_Vrsn ********************************************************************************/
		if(librarytopiccoding.hasVersion()) {
			l.setLibraryTopicCdgVrsn(String.valueOf(librarytopiccoding.getVersion()));
		}
		/******************** Library_Topic_Cdg_Dsply ********************************************************************************/
		if(librarytopiccoding.hasDisplay()) {
			l.setLibraryTopicCdgDsply(String.valueOf(librarytopiccoding.getDisplay()));
		}
		/******************** Library_Topic_Cdg_Cd ********************************************************************************/
		if(librarytopiccoding.hasCode()) {
			l.setLibraryTopicCdgCd(String.valueOf(librarytopiccoding.getCode()));
		}
		/******************** Library_Topic_Cdg_UsrSltd ********************************************************************************/
		if(librarytopiccoding.hasUserSelected()) {
			l.setLibraryTopicCdgUsrSltd(String.valueOf(librarytopiccoding.getUserSelected()));
		}
		/******************** Library_Topic_Cdg_Sys ********************************************************************************/
		if(librarytopiccoding.hasSystem()) {
			l.setLibraryTopicCdgSys(String.valueOf(librarytopiccoding.getSystem()));
		}
		/******************** Library_LastReviewDt ********************************************************************************/
		if(library.hasLastReviewDate()) {
			l.setLibraryLastReviewDt(String.valueOf(library.getLastReviewDate()));
		}
		/******************** Library_ApprovalDt ********************************************************************************/
		if(library.hasApprovalDate()) {
			l.setLibraryApprovalDt(String.valueOf(library.getApprovalDate()));
		}
		/******************** libraryeditor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail libraryeditor = library.getEditorFirstRep();

		/******************** Library_Editor_Nm ********************************************************************************/
		if(libraryeditor.hasName()) {
			l.setLibraryEditorNm(String.valueOf(libraryeditor.getName()));
		}
		/******************** libraryeditortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint libraryeditortelecom = libraryeditor.getTelecomFirstRep();

		/******************** Library_Editor_Tlcm_Vl ********************************************************************************/
		if(libraryeditortelecom.hasValue()) {
			l.setLibraryEditorTlcmVl(String.valueOf(libraryeditortelecom.getValue()));
		}
		/******************** libraryeditortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period libraryeditortelecomperiod = libraryeditortelecom.getPeriod();

		/******************** Library_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(libraryeditortelecomperiod.hasStart()) {
			l.setLibraryEditorTlcmPrdStrt(String.valueOf(libraryeditortelecomperiod.getStart()));
		}
		/******************** Library_Editor_Tlcm_Prd_End ********************************************************************************/
		if(libraryeditortelecomperiod.hasEnd()) {
			l.setLibraryEditorTlcmPrdEnd(String.valueOf(libraryeditortelecomperiod.getEnd()));
		}
		/******************** libraryeditortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem libraryeditortelecomsystem = libraryeditortelecom.getSystem();
		l.setLibraryEditorTlcmSys(libraryeditortelecomsystem.toCode());

		/******************** libraryeditortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse libraryeditortelecomuse = libraryeditortelecom.getUse();
		l.setLibraryEditorTlcmUse(libraryeditortelecomuse.toCode());

		/******************** Library_Editor_Tlcm_Rnk ********************************************************************************/
		if(libraryeditortelecom.hasRank()) {
			l.setLibraryEditorTlcmRnk(String.valueOf(libraryeditortelecom.getRank()));
		}
		/******************** Library_Usg ********************************************************************************/
		if(library.hasUsage()) {
			l.setLibraryUsg(String.valueOf(library.getUsage()));
		}
		/******************** libraryrelatedartifact ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact libraryrelatedartifact = library.getRelatedArtifactFirstRep();

		/******************** Library_RltedArtfct_Rsrc ********************************************************************************/
		if(libraryrelatedartifact.hasResource()) {
			l.setLibraryRltedArtfctRsrc(String.valueOf(libraryrelatedartifact.getResource()));
		}
		/******************** libraryrelatedartifacttype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactType libraryrelatedartifacttype = libraryrelatedartifact.getType();
		l.setLibraryRltedArtfctTyp(libraryrelatedartifacttype.toCode());

		/******************** libraryrelatedartifactdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment libraryrelatedartifactdocument = libraryrelatedartifact.getDocument();

		/******************** Library_RltedArtfct_Doc_Sz ********************************************************************************/
		if(libraryrelatedartifactdocument.hasSize()) {
			l.setLibraryRltedArtfctDocSz(String.valueOf(libraryrelatedartifactdocument.getSize()));
		}
		/******************** Library_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(libraryrelatedartifactdocument.hasLanguage()) {
			l.setLibraryRltedArtfctDocLnguage(String.valueOf(libraryrelatedartifactdocument.getLanguage()));
		}
		/******************** Library_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(libraryrelatedartifactdocument.hasContentType()) {
			l.setLibraryRltedArtfctDocCntntTyp(String.valueOf(libraryrelatedartifactdocument.getContentType()));
		}
		/******************** Library_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(libraryrelatedartifactdocument.hasTitle()) {
			l.setLibraryRltedArtfctDocTtl(String.valueOf(libraryrelatedartifactdocument.getTitle()));
		}
		/******************** Library_RltedArtfct_Doc_Url ********************************************************************************/
		if(libraryrelatedartifactdocument.hasUrl()) {
			l.setLibraryRltedArtfctDocUrl(String.valueOf(libraryrelatedartifactdocument.getUrl()));
		}
		/******************** Library_RltedArtfct_Doc_Data ********************************************************************************/
		if(libraryrelatedartifactdocument.hasData()) {
			l.setLibraryRltedArtfctDocData(String.valueOf(libraryrelatedartifactdocument.getData()));
		}

		/******************** Library_RltedArtfct_Doc_Hash ********************************************************************************/
		if(libraryrelatedartifactdocument.hasHash()) {
			l.setLibraryRltedArtfctDocHash(String.valueOf(libraryrelatedartifactdocument.getHash()));
		}

		/******************** Library_RltedArtfct_Doc_Creation ********************************************************************************/
		if(libraryrelatedartifactdocument.hasCreation()) {
			l.setLibraryRltedArtfctDocCreation(String.valueOf(libraryrelatedartifactdocument.getCreation()));
		}
		/******************** Library_RltedArtfct_Url ********************************************************************************/
		if(libraryrelatedartifact.hasUrl()) {
			l.setLibraryRltedArtfctUrl(String.valueOf(libraryrelatedartifact.getUrl()));
		}
		/******************** Library_RltedArtfct_Lbl ********************************************************************************/
		if(libraryrelatedartifact.hasLabel()) {
			l.setLibraryRltedArtfctLbl(String.valueOf(libraryrelatedartifact.getLabel()));
		}
		/******************** Library_RltedArtfct_Citation ********************************************************************************/
		if(libraryrelatedartifact.hasCitation()) {
			l.setLibraryRltedArtfctCitation(String.valueOf(libraryrelatedartifact.getCitation()));
		}
		/******************** libraryusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext libraryusecontext = library.getUseContextFirstRep();

		/******************** libraryusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding libraryusecontextcode = libraryusecontext.getCode();

		/******************** Library_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(libraryusecontextcode.hasVersion()) {
			l.setLibraryUseCntxtCdVrsn(String.valueOf(libraryusecontextcode.getVersion()));
		}
		/******************** Library_UseCntxt_Cd_Dsply ********************************************************************************/
		if(libraryusecontextcode.hasDisplay()) {
			l.setLibraryUseCntxtCdDsply(String.valueOf(libraryusecontextcode.getDisplay()));
		}
		/******************** Library_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(libraryusecontextcode.hasUserSelected()) {
			l.setLibraryUseCntxtCdUsrSltd(String.valueOf(libraryusecontextcode.getUserSelected()));
		}
		/******************** Library_UseCntxt_Cd_Sys ********************************************************************************/
		if(libraryusecontextcode.hasSystem()) {
			l.setLibraryUseCntxtCdSys(String.valueOf(libraryusecontextcode.getSystem()));
		}
		/******************** libraryusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept libraryusecontextvaluecodeableconcept = libraryusecontext.getValueCodeableConcept();

		/******************** Library_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(libraryusecontextvaluecodeableconcept.hasText()) {
			l.setLibraryUseCntxtVlCdbleCncptTxt(String.valueOf(libraryusecontextvaluecodeableconcept.getText()));
		}
		/******************** libraryusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding libraryusecontextvaluecodeableconceptcoding = libraryusecontextvaluecodeableconcept.getCodingFirstRep();

		/******************** Library_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(libraryusecontextvaluecodeableconceptcoding.hasVersion()) {
			l.setLibraryUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(libraryusecontextvaluecodeableconceptcoding.getVersion()));
		}
		/******************** Library_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(libraryusecontextvaluecodeableconceptcoding.hasDisplay()) {
			l.setLibraryUseCntxtVlCdbleCncptCdgDsply(String.valueOf(libraryusecontextvaluecodeableconceptcoding.getDisplay()));
		}
		/******************** Library_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(libraryusecontextvaluecodeableconceptcoding.hasCode()) {
			l.setLibraryUseCntxtVlCdbleCncptCdgCd(String.valueOf(libraryusecontextvaluecodeableconceptcoding.getCode()));
		}
		/******************** Library_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(libraryusecontextvaluecodeableconceptcoding.hasUserSelected()) {
			l.setLibraryUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(libraryusecontextvaluecodeableconceptcoding.getUserSelected()));
		}
		/******************** Library_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(libraryusecontextvaluecodeableconceptcoding.hasSystem()) {
			l.setLibraryUseCntxtVlCdbleCncptCdgSys(String.valueOf(libraryusecontextvaluecodeableconceptcoding.getSystem()));
		}
		/******************** libraryusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity libraryusecontextvaluequantity = libraryusecontext.getValueQuantity();

		/******************** Library_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(libraryusecontextvaluequantity.hasValue()) {
			l.setLibraryUseCntxtVlQntyVl(String.valueOf(libraryusecontextvaluequantity.getValue()));
		}
		/******************** libraryusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator libraryusecontextvaluequantitycomparator = libraryusecontextvaluequantity.getComparator();
		l.setLibraryUseCntxtVlQntyCmprtr(libraryusecontextvaluequantitycomparator.toCode());

		/******************** Library_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(libraryusecontextvaluequantity.hasCode()) {
			l.setLibraryUseCntxtVlQntyCd(String.valueOf(libraryusecontextvaluequantity.getCode()));
		}
		/******************** Library_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(libraryusecontextvaluequantity.hasUnit()) {
			l.setLibraryUseCntxtVlQntyUnt(String.valueOf(libraryusecontextvaluequantity.getUnit()));
		}
		/******************** Library_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(libraryusecontextvaluequantity.hasSystem()) {
			l.setLibraryUseCntxtVlQntySys(String.valueOf(libraryusecontextvaluequantity.getSystem()));
		}
		/******************** libraryusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range libraryusecontextvaluerange = libraryusecontext.getValueRange();

		/******************** libraryusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity libraryusecontextvaluerangelow = libraryusecontextvaluerange.getLow();

		/******************** Library_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(libraryusecontextvaluerangelow.hasValue()) {
			l.setLibraryUseCntxtVlRngLwVl(String.valueOf(libraryusecontextvaluerangelow.getValue()));
		}
		/******************** libraryusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator libraryusecontextvaluerangelowcomparator = libraryusecontextvaluerangelow.getComparator();
		l.setLibraryUseCntxtVlRngLwCmprtr(libraryusecontextvaluerangelowcomparator.toCode());

		/******************** Library_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(libraryusecontextvaluerangelow.hasCode()) {
			l.setLibraryUseCntxtVlRngLwCd(String.valueOf(libraryusecontextvaluerangelow.getCode()));
		}
		/******************** Library_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(libraryusecontextvaluerangelow.hasUnit()) {
			l.setLibraryUseCntxtVlRngLwUnt(String.valueOf(libraryusecontextvaluerangelow.getUnit()));
		}
		/******************** Library_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(libraryusecontextvaluerangelow.hasSystem()) {
			l.setLibraryUseCntxtVlRngLwSys(String.valueOf(libraryusecontextvaluerangelow.getSystem()));
		}
		/******************** libraryusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity libraryusecontextvaluerangehigh = libraryusecontextvaluerange.getHigh();

		/******************** Library_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(libraryusecontextvaluerangehigh.hasValue()) {
			l.setLibraryUseCntxtVlRngHiVl(String.valueOf(libraryusecontextvaluerangehigh.getValue()));
		}
		/******************** libraryusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator libraryusecontextvaluerangehighcomparator = libraryusecontextvaluerangehigh.getComparator();
		l.setLibraryUseCntxtVlRngHiCmprtr(libraryusecontextvaluerangehighcomparator.toCode());

		/******************** Library_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(libraryusecontextvaluerangehigh.hasCode()) {
			l.setLibraryUseCntxtVlRngHiCd(String.valueOf(libraryusecontextvaluerangehigh.getCode()));
		}
		/******************** Library_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(libraryusecontextvaluerangehigh.hasUnit()) {
			l.setLibraryUseCntxtVlRngHiUnt(String.valueOf(libraryusecontextvaluerangehigh.getUnit()));
		}
		/******************** Library_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(libraryusecontextvaluerangehigh.hasSystem()) {
			l.setLibraryUseCntxtVlRngHiSys(String.valueOf(libraryusecontextvaluerangehigh.getSystem()));
		}
		/******************** Library_UseCntxt_VlRfrnc ********************************************************************************/
		if(libraryusecontext.hasValueReference()) {
			l.setLibraryUseCntxtVlRfrnc(String.valueOf(libraryusecontext.getValueReference()));
		}
		/******************** libraryjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept libraryjurisdiction = library.getJurisdictionFirstRep();

		/******************** Library_Jrsdctn_Txt ********************************************************************************/
		if(libraryjurisdiction.hasText()) {
			l.setLibraryJrsdctnTxt(String.valueOf(libraryjurisdiction.getText()));
		}
		/******************** libraryjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding libraryjurisdictioncoding = libraryjurisdiction.getCodingFirstRep();

		/******************** Library_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(libraryjurisdictioncoding.hasVersion()) {
			l.setLibraryJrsdctnCdgVrsn(String.valueOf(libraryjurisdictioncoding.getVersion()));
		}
		/******************** Library_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(libraryjurisdictioncoding.hasDisplay()) {
			l.setLibraryJrsdctnCdgDsply(String.valueOf(libraryjurisdictioncoding.getDisplay()));
		}
		/******************** Library_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(libraryjurisdictioncoding.hasCode()) {
			l.setLibraryJrsdctnCdgCd(String.valueOf(libraryjurisdictioncoding.getCode()));
		}
		/******************** Library_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(libraryjurisdictioncoding.hasUserSelected()) {
			l.setLibraryJrsdctnCdgUsrSltd(String.valueOf(libraryjurisdictioncoding.getUserSelected()));
		}
		/******************** Library_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(libraryjurisdictioncoding.hasSystem()) {
			l.setLibraryJrsdctnCdgSys(String.valueOf(libraryjurisdictioncoding.getSystem()));
		}
		return l;
	}
}
