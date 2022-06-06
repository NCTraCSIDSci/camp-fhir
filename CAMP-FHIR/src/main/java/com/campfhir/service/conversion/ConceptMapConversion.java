package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ConceptMap;
public class ConceptMapConversion 
{
	public org.hl7.fhir.r4.model.ConceptMap ConceptMaps(ConceptMap c) throws ParseException
	{
		org.hl7.fhir.r4.model.ConceptMap conceptmap = new org.hl7.fhir.r4.model.ConceptMap();

		/******************** id ********************************************************************************/
		conceptmap.setId(c.getId());

		/******************** conceptmapcontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail conceptmapcontact =  new org.hl7.fhir.r4.model.ContactDetail();
		conceptmap.addContact(conceptmapcontact);

		/******************** CncptMap_Cntct_Nm ********************************************************************************/
		if(c.getCncptMapCntctNm() != null) {
			conceptmapcontact.setName(c.getCncptMapCntctNm());
		}
		/******************** conceptmapcontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint conceptmapcontacttelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		conceptmapcontact.addTelecom(conceptmapcontacttelecom);

		/******************** conceptmapcontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period conceptmapcontacttelecomperiod =  new org.hl7.fhir.r4.model.Period();
		conceptmapcontacttelecom.setPeriod(conceptmapcontacttelecomperiod);

		/******************** CncptMap_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(c.getCncptMapCntctTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat CncptMap_Cntct_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CncptMap_Cntct_Tlcm_Prd_Enddate = CncptMap_Cntct_Tlcm_Prd_Endsdf.parse(c.getCncptMapCntctTlcmPrdEnd());
			conceptmapcontacttelecomperiod.setEnd(CncptMap_Cntct_Tlcm_Prd_Enddate);
		}
		/******************** CncptMap_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(c.getCncptMapCntctTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat CncptMap_Cntct_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CncptMap_Cntct_Tlcm_Prd_Strtdate = CncptMap_Cntct_Tlcm_Prd_Strtsdf.parse(c.getCncptMapCntctTlcmPrdStrt());
			conceptmapcontacttelecomperiod.setStart(CncptMap_Cntct_Tlcm_Prd_Strtdate);
		}
		/******************** CncptMap_Cntct_Tlcm_Rnk ********************************************************************************/
		if(c.getCncptMapCntctTlcmRnk() != null) {
			conceptmapcontacttelecom.setRank(Integer.parseInt(c.getCncptMapCntctTlcmRnk()));
		}
		/******************** conceptmapcontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory conceptmapcontacttelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		conceptmapcontacttelecom.setSystem(conceptmapcontacttelecomsystem.fromCode(c.getCncptMapCntctTlcmSys()));

		/******************** conceptmapcontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory conceptmapcontacttelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		conceptmapcontacttelecom.setUse(conceptmapcontacttelecomuse.fromCode(c.getCncptMapCntctTlcmUse()));

		/******************** CncptMap_Cntct_Tlcm_Vl ********************************************************************************/
		if(c.getCncptMapCntctTlcmVl() != null) {
			conceptmapcontacttelecom.setValue(c.getCncptMapCntctTlcmVl());
		}
		/******************** CncptMap_Copyright ********************************************************************************/
		if(c.getCncptMapCopyright() != null) {
			conceptmap.setCopyright(c.getCncptMapCopyright());
		}
		/******************** CncptMap_Dt ********************************************************************************/
		if(c.getCncptMapDt() != null) {
			java.text.SimpleDateFormat CncptMap_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CncptMap_Dtdate = CncptMap_Dtsdf.parse(c.getCncptMapDt());
			conceptmap.setDate(CncptMap_Dtdate);
		}
		/******************** CncptMap_Dscrptn ********************************************************************************/
		if(c.getCncptMapDscrptn() != null) {
			conceptmap.setDescription(c.getCncptMapDscrptn());
		}
		/******************** CncptMap_Exprmtl ********************************************************************************/
		if(c.getCncptMapExprmtl() != null) {
			conceptmap.setExperimental(Boolean.parseBoolean(c.getCncptMapExprmtl()));
		}
		/******************** conceptmapgroup ********************************************************************************/
		org.hl7.fhir.r4.model.ConceptMap.ConceptMapGroupComponent conceptmapgroup =  new org.hl7.fhir.r4.model.ConceptMap.ConceptMapGroupComponent();
		conceptmap.addGroup(conceptmapgroup);

		/******************** conceptmapgroupelement ********************************************************************************/
		org.hl7.fhir.r4.model.ConceptMap.SourceElementComponent conceptmapgroupelement =  new org.hl7.fhir.r4.model.ConceptMap.SourceElementComponent();
		conceptmapgroup.addElement(conceptmapgroupelement);

		/******************** CncptMap_Grp_Elmnt_Cd ********************************************************************************/
		if(c.getCncptMapGrpElmntCd() != null) {
			conceptmapgroupelement.setCode(c.getCncptMapGrpElmntCd());
		}
		/******************** CncptMap_Grp_Elmnt_Dsply ********************************************************************************/
		if(c.getCncptMapGrpElmntDsply() != null) {
			conceptmapgroupelement.setDisplay(c.getCncptMapGrpElmntDsply());
		}
		/******************** conceptmapgroupelementtar ********************************************************************************/
		org.hl7.fhir.r4.model.ConceptMap.TargetElementComponent conceptmapgroupelementtar =  new org.hl7.fhir.r4.model.ConceptMap.TargetElementComponent();
		conceptmapgroupelement.addTarget(conceptmapgroupelementtar);

		/******************** CncptMap_Grp_Elmnt_Tar_Cd ********************************************************************************/
		if(c.getCncptMapGrpElmntTarCd() != null) {
			conceptmapgroupelementtar.setCode(c.getCncptMapGrpElmntTarCd());
		}
		/******************** CncptMap_Grp_Elmnt_Tar_Comment ********************************************************************************/
		if(c.getCncptMapGrpElmntTarComment() != null) {
			conceptmapgroupelementtar.setComment(c.getCncptMapGrpElmntTarComment());
		}
		/******************** conceptmapgroupelementtardependson ********************************************************************************/
		org.hl7.fhir.r4.model.ConceptMap.OtherElementComponent conceptmapgroupelementtardependson =  new org.hl7.fhir.r4.model.ConceptMap.OtherElementComponent();
		conceptmapgroupelementtar.addDependsOn(conceptmapgroupelementtardependson);

		/******************** CncptMap_Grp_Elmnt_Tar_DependsOn_Dsply ********************************************************************************/
		if(c.getCncptMapGrpElmntTarDependsOnDsply() != null) {
			conceptmapgroupelementtardependson.setDisplay(c.getCncptMapGrpElmntTarDependsOnDsply());
		}
		/******************** CncptMap_Grp_Elmnt_Tar_DependsOn_Prpty ********************************************************************************/
		if(c.getCncptMapGrpElmntTarDependsOnPrpty() != null) {
			conceptmapgroupelementtardependson.setProperty(c.getCncptMapGrpElmntTarDependsOnPrpty());
		}
		/******************** CncptMap_Grp_Elmnt_Tar_DependsOn_Sys ********************************************************************************/
		if(c.getCncptMapGrpElmntTarDependsOnSys() != null) {
			conceptmapgroupelementtardependson.setSystem(c.getCncptMapGrpElmntTarDependsOnSys());
		}
		/******************** CncptMap_Grp_Elmnt_Tar_DependsOn_Vl ********************************************************************************/
		if(c.getCncptMapGrpElmntTarDependsOnVl() != null) {
			conceptmapgroupelementtardependson.setValue(c.getCncptMapGrpElmntTarDependsOnVl());
		}
		/******************** CncptMap_Grp_Elmnt_Tar_Dsply ********************************************************************************/
		if(c.getCncptMapGrpElmntTarDsply() != null) {
			conceptmapgroupelementtar.setDisplay(c.getCncptMapGrpElmntTarDsply());
		}
		/******************** conceptmapgroupelementtarequivalence ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.ConceptMapEquivalenceEnumFactory conceptmapgroupelementtarequivalence =  new org.hl7.fhir.r4.model.Enumerations.ConceptMapEquivalenceEnumFactory();
		conceptmapgroupelementtar.setEquivalence(conceptmapgroupelementtarequivalence.fromCode(c.getCncptMapGrpElmntTarEquivalence()));

		/******************** conceptmapgroupelementtarproduct ********************************************************************************/
		org.hl7.fhir.r4.model.ConceptMap.OtherElementComponent conceptmapgroupelementtarproduct =  new org.hl7.fhir.r4.model.ConceptMap.OtherElementComponent();
		conceptmapgroupelementtar.addProduct(conceptmapgroupelementtarproduct);

		/******************** CncptMap_Grp_Elmnt_Tar_Prdct_Dsply ********************************************************************************/
		if(c.getCncptMapGrpElmntTarPrdctDsply() != null) {
			conceptmapgroupelementtarproduct.setDisplay(c.getCncptMapGrpElmntTarPrdctDsply());
		}
		/******************** CncptMap_Grp_Elmnt_Tar_Prdct_Prpty ********************************************************************************/
		if(c.getCncptMapGrpElmntTarPrdctPrpty() != null) {
			conceptmapgroupelementtarproduct.setProperty(c.getCncptMapGrpElmntTarPrdctPrpty());
		}
		/******************** CncptMap_Grp_Elmnt_Tar_Prdct_Sys ********************************************************************************/
		if(c.getCncptMapGrpElmntTarPrdctSys() != null) {
			conceptmapgroupelementtarproduct.setSystem(c.getCncptMapGrpElmntTarPrdctSys());
		}
		/******************** CncptMap_Grp_Elmnt_Tar_Prdct_Vl ********************************************************************************/
		if(c.getCncptMapGrpElmntTarPrdctVl() != null) {
			conceptmapgroupelementtarproduct.setValue(c.getCncptMapGrpElmntTarPrdctVl());
		}
		/******************** CncptMap_Grp_Src ********************************************************************************/
		if(c.getCncptMapGrpSrc() != null) {
			conceptmapgroup.setSource(c.getCncptMapGrpSrc());
		}
		/******************** CncptMap_Grp_SrcVrsn ********************************************************************************/
		if(c.getCncptMapGrpSrcVrsn() != null) {
			conceptmapgroup.setSourceVersion(c.getCncptMapGrpSrcVrsn());
		}
		/******************** CncptMap_Grp_TarVrsn ********************************************************************************/
		if(c.getCncptMapGrpTarVrsn() != null) {
			conceptmapgroup.setTargetVersion(c.getCncptMapGrpTarVrsn());
		}
		/******************** conceptmapgroupunmapped ********************************************************************************/
		org.hl7.fhir.r4.model.ConceptMap.ConceptMapGroupUnmappedComponent conceptmapgroupunmapped =  new org.hl7.fhir.r4.model.ConceptMap.ConceptMapGroupUnmappedComponent();
		conceptmapgroup.setUnmapped(conceptmapgroupunmapped);

		/******************** CncptMap_Grp_Unmapped_Cd ********************************************************************************/
		if(c.getCncptMapGrpUnmappedCd() != null) {
			conceptmapgroupunmapped.setCode(c.getCncptMapGrpUnmappedCd());
		}
		/******************** CncptMap_Grp_Unmapped_Dsply ********************************************************************************/
		if(c.getCncptMapGrpUnmappedDsply() != null) {
			conceptmapgroupunmapped.setDisplay(c.getCncptMapGrpUnmappedDsply());
		}
		/******************** conceptmapgroupunmappedmode ********************************************************************************/
		org.hl7.fhir.r4.model.ConceptMap.ConceptMapGroupUnmappedModeEnumFactory conceptmapgroupunmappedmode =  new org.hl7.fhir.r4.model.ConceptMap.ConceptMapGroupUnmappedModeEnumFactory();
		conceptmapgroupunmapped.setMode(conceptmapgroupunmappedmode.fromCode(c.getCncptMapGrpUnmappedMode()));

		/******************** CncptMap_Grp_Unmapped_Url ********************************************************************************/
		if(c.getCncptMapGrpUnmappedUrl() != null) {
			conceptmapgroupunmapped.setUrl(c.getCncptMapGrpUnmappedUrl());
		}
		/******************** conceptmapidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier conceptmapidentifier =  new org.hl7.fhir.r4.model.Identifier();
		conceptmap.setIdentifier(conceptmapidentifier);

		/******************** CncptMap_Id_Assigner ********************************************************************************/
		if(c.getCncptMapIdAssigner() != null) {
			conceptmapidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(c.getCncptMapIdAssigner()));
		}
		/******************** conceptmapidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period conceptmapidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		conceptmapidentifier.setPeriod(conceptmapidentifierperiod);

		/******************** CncptMap_Id_Prd_End ********************************************************************************/
		if(c.getCncptMapIdPrdEnd() != null) {
			java.text.SimpleDateFormat CncptMap_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CncptMap_Id_Prd_Enddate = CncptMap_Id_Prd_Endsdf.parse(c.getCncptMapIdPrdEnd());
			conceptmapidentifierperiod.setEnd(CncptMap_Id_Prd_Enddate);
		}
		/******************** CncptMap_Id_Prd_Strt ********************************************************************************/
		if(c.getCncptMapIdPrdStrt() != null) {
			java.text.SimpleDateFormat CncptMap_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CncptMap_Id_Prd_Strtdate = CncptMap_Id_Prd_Strtsdf.parse(c.getCncptMapIdPrdStrt());
			conceptmapidentifierperiod.setStart(CncptMap_Id_Prd_Strtdate);
		}
		/******************** CncptMap_Id_Sys ********************************************************************************/
		if(c.getCncptMapIdSys() != null) {
			conceptmapidentifier.setSystem(c.getCncptMapIdSys());
		}
		/******************** conceptmapidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept conceptmapidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		conceptmapidentifier.setType(conceptmapidentifiertype);

		/******************** conceptmapidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding conceptmapidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		conceptmapidentifiertype.addCoding(conceptmapidentifiertypecoding);

		/******************** CncptMap_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCncptMapIdTypCdgCd() != null) {
			conceptmapidentifiertypecoding.setCode(c.getCncptMapIdTypCdgCd());
		}
		/******************** CncptMap_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCncptMapIdTypCdgDsply() != null) {
			conceptmapidentifiertypecoding.setDisplay(c.getCncptMapIdTypCdgDsply());
		}
		/******************** CncptMap_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCncptMapIdTypCdgSys() != null) {
			conceptmapidentifiertypecoding.setSystem(c.getCncptMapIdTypCdgSys());
		}
		/******************** CncptMap_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCncptMapIdTypCdgUsrSltd() != null) {
			conceptmapidentifiertypecoding.setUserSelected(Boolean.parseBoolean(c.getCncptMapIdTypCdgUsrSltd()));
		}
		/******************** CncptMap_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCncptMapIdTypCdgVrsn() != null) {
			conceptmapidentifiertypecoding.setVersion(c.getCncptMapIdTypCdgVrsn());
		}
		/******************** CncptMap_Id_Typ_Txt ********************************************************************************/
		if(c.getCncptMapIdTypTxt() != null) {
			conceptmapidentifiertype.setText(c.getCncptMapIdTypTxt());
		}
		/******************** conceptmapidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory conceptmapidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		conceptmapidentifier.setUse(conceptmapidentifieruse.fromCode(c.getCncptMapIdUse()));

		/******************** CncptMap_Id_Vl ********************************************************************************/
		if(c.getCncptMapIdVl() != null) {
			conceptmapidentifier.setValue(c.getCncptMapIdVl());
		}
		/******************** conceptmapjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept conceptmapjurisdiction =  new org.hl7.fhir.r4.model.CodeableConcept();
		conceptmap.addJurisdiction(conceptmapjurisdiction);

		/******************** conceptmapjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding conceptmapjurisdictioncoding =  new org.hl7.fhir.r4.model.Coding();
		conceptmapjurisdiction.addCoding(conceptmapjurisdictioncoding);

		/******************** CncptMap_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(c.getCncptMapJrsdctnCdgCd() != null) {
			conceptmapjurisdictioncoding.setCode(c.getCncptMapJrsdctnCdgCd());
		}
		/******************** CncptMap_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(c.getCncptMapJrsdctnCdgDsply() != null) {
			conceptmapjurisdictioncoding.setDisplay(c.getCncptMapJrsdctnCdgDsply());
		}
		/******************** CncptMap_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(c.getCncptMapJrsdctnCdgSys() != null) {
			conceptmapjurisdictioncoding.setSystem(c.getCncptMapJrsdctnCdgSys());
		}
		/******************** CncptMap_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(c.getCncptMapJrsdctnCdgUsrSltd() != null) {
			conceptmapjurisdictioncoding.setUserSelected(Boolean.parseBoolean(c.getCncptMapJrsdctnCdgUsrSltd()));
		}
		/******************** CncptMap_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(c.getCncptMapJrsdctnCdgVrsn() != null) {
			conceptmapjurisdictioncoding.setVersion(c.getCncptMapJrsdctnCdgVrsn());
		}
		/******************** CncptMap_Jrsdctn_Txt ********************************************************************************/
		if(c.getCncptMapJrsdctnTxt() != null) {
			conceptmapjurisdiction.setText(c.getCncptMapJrsdctnTxt());
		}
		/******************** CncptMap_Nm ********************************************************************************/
		if(c.getCncptMapNm() != null) {
			conceptmap.setName(c.getCncptMapNm());
		}
		/******************** CncptMap_Pblshr ********************************************************************************/
		if(c.getCncptMapPblshr() != null) {
			conceptmap.setPublisher(c.getCncptMapPblshr());
		}
		/******************** CncptMap_Prpse ********************************************************************************/
		if(c.getCncptMapPrpse() != null) {
			conceptmap.setPurpose(c.getCncptMapPrpse());
		}
		/******************** CncptMap_SrcCanonicalTyp ********************************************************************************/
		if(c.getCncptMapSrcCanonicalTyp() != null) {
			conceptmap.setSource( new org.hl7.fhir.r4.model.CanonicalType(c.getCncptMapSrcCanonicalTyp()));
		}
		/******************** CncptMap_SrcUriTyp ********************************************************************************/
		if(c.getCncptMapSrcUriTyp() != null) {
			conceptmap.setSource( new org.hl7.fhir.r4.model.UriType(c.getCncptMapSrcUriTyp()));
		}
		/******************** conceptmapstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory conceptmapstatus =  new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory();
		conceptmap.setStatus(conceptmapstatus.fromCode(c.getCncptMapSts()));

		/******************** CncptMap_TarCanonicalTyp ********************************************************************************/
		if(c.getCncptMapTarCanonicalTyp() != null) {
			conceptmap.setTarget( new org.hl7.fhir.r4.model.CanonicalType(c.getCncptMapTarCanonicalTyp()));
		}
		/******************** CncptMap_TarUriTyp ********************************************************************************/
		if(c.getCncptMapTarUriTyp() != null) {
			conceptmap.setTarget( new org.hl7.fhir.r4.model.UriType(c.getCncptMapTarUriTyp()));
		}
		/******************** CncptMap_Ttl ********************************************************************************/
		if(c.getCncptMapTtl() != null) {
			conceptmap.setTitle(c.getCncptMapTtl());
		}
		/******************** CncptMap_Url ********************************************************************************/
		if(c.getCncptMapUrl() != null) {
			conceptmap.setUrl(c.getCncptMapUrl());
		}
		/******************** conceptmapusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext conceptmapusecontext =  new org.hl7.fhir.r4.model.UsageContext();
		conceptmap.addUseContext(conceptmapusecontext);

		/******************** conceptmapusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding conceptmapusecontextcode =  new org.hl7.fhir.r4.model.Coding();
		conceptmapusecontext.setCode(conceptmapusecontextcode);

		/******************** CncptMap_UseCntxt_Cd_Cd ********************************************************************************/
		if(c.getCncptMapUseCntxtCdCd() != null) {
			conceptmapusecontextcode.setCode(c.getCncptMapUseCntxtCdCd());
		}
		/******************** CncptMap_UseCntxt_Cd_Dsply ********************************************************************************/
		if(c.getCncptMapUseCntxtCdDsply() != null) {
			conceptmapusecontextcode.setDisplay(c.getCncptMapUseCntxtCdDsply());
		}
		/******************** CncptMap_UseCntxt_Cd_Sys ********************************************************************************/
		if(c.getCncptMapUseCntxtCdSys() != null) {
			conceptmapusecontextcode.setSystem(c.getCncptMapUseCntxtCdSys());
		}
		/******************** CncptMap_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(c.getCncptMapUseCntxtCdUsrSltd() != null) {
			conceptmapusecontextcode.setUserSelected(Boolean.parseBoolean(c.getCncptMapUseCntxtCdUsrSltd()));
		}
		/******************** CncptMap_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(c.getCncptMapUseCntxtCdVrsn() != null) {
			conceptmapusecontextcode.setVersion(c.getCncptMapUseCntxtCdVrsn());
		}
		/******************** conceptmapusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept conceptmapusecontextvaluecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		conceptmapusecontext.setValue(conceptmapusecontextvaluecodeableconcept);

		/******************** conceptmapusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding conceptmapusecontextvaluecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		conceptmapusecontextvaluecodeableconcept.addCoding(conceptmapusecontextvaluecodeableconceptcoding);

		/******************** CncptMap_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(c.getCncptMapUseCntxtVlCdbleCncptCdgCd() != null) {
			conceptmapusecontextvaluecodeableconceptcoding.setCode(c.getCncptMapUseCntxtVlCdbleCncptCdgCd());
		}
		/******************** CncptMap_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(c.getCncptMapUseCntxtVlCdbleCncptCdgDsply() != null) {
			conceptmapusecontextvaluecodeableconceptcoding.setDisplay(c.getCncptMapUseCntxtVlCdbleCncptCdgDsply());
		}
		/******************** CncptMap_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(c.getCncptMapUseCntxtVlCdbleCncptCdgSys() != null) {
			conceptmapusecontextvaluecodeableconceptcoding.setSystem(c.getCncptMapUseCntxtVlCdbleCncptCdgSys());
		}
		/******************** CncptMap_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(c.getCncptMapUseCntxtVlCdbleCncptCdgUsrSltd() != null) {
			conceptmapusecontextvaluecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(c.getCncptMapUseCntxtVlCdbleCncptCdgUsrSltd()));
		}
		/******************** CncptMap_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(c.getCncptMapUseCntxtVlCdbleCncptCdgVrsn() != null) {
			conceptmapusecontextvaluecodeableconceptcoding.setVersion(c.getCncptMapUseCntxtVlCdbleCncptCdgVrsn());
		}
		/******************** CncptMap_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(c.getCncptMapUseCntxtVlCdbleCncptTxt() != null) {
			conceptmapusecontextvaluecodeableconcept.setText(c.getCncptMapUseCntxtVlCdbleCncptTxt());
		}
		/******************** conceptmapusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity conceptmapusecontextvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		conceptmapusecontext.setValue(conceptmapusecontextvaluequantity);

		/******************** CncptMap_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(c.getCncptMapUseCntxtVlQntyCd() != null) {
			conceptmapusecontextvaluequantity.setCode(c.getCncptMapUseCntxtVlQntyCd());
		}
		/******************** conceptmapusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory conceptmapusecontextvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		conceptmapusecontextvaluequantity.setComparator(conceptmapusecontextvaluequantitycomparator.fromCode(c.getCncptMapUseCntxtVlQntyCmprtr()));

		/******************** CncptMap_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(c.getCncptMapUseCntxtVlQntySys() != null) {
			conceptmapusecontextvaluequantity.setSystem(c.getCncptMapUseCntxtVlQntySys());
		}
		/******************** CncptMap_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(c.getCncptMapUseCntxtVlQntyUnt() != null) {
			conceptmapusecontextvaluequantity.setUnit(c.getCncptMapUseCntxtVlQntyUnt());
		}
		/******************** CncptMap_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(c.getCncptMapUseCntxtVlQntyVl() != null) {
			conceptmapusecontextvaluequantity.setValue(Double.parseDouble((c.getCncptMapUseCntxtVlQntyVl())));
		}
		/******************** conceptmapusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range conceptmapusecontextvaluerange =  new org.hl7.fhir.r4.model.Range();
		conceptmapusecontext.setValue(conceptmapusecontextvaluerange);

		/******************** conceptmapusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity conceptmapusecontextvaluerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		conceptmapusecontextvaluerange.setHigh(conceptmapusecontextvaluerangehigh);

		/******************** CncptMap_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(c.getCncptMapUseCntxtVlRngHiCd() != null) {
			conceptmapusecontextvaluerangehigh.setCode(c.getCncptMapUseCntxtVlRngHiCd());
		}
		/******************** conceptmapusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory conceptmapusecontextvaluerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		conceptmapusecontextvaluerangehigh.setComparator(conceptmapusecontextvaluerangehighcomparator.fromCode(c.getCncptMapUseCntxtVlRngHiCmprtr()));

		/******************** CncptMap_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(c.getCncptMapUseCntxtVlRngHiSys() != null) {
			conceptmapusecontextvaluerangehigh.setSystem(c.getCncptMapUseCntxtVlRngHiSys());
		}
		/******************** CncptMap_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(c.getCncptMapUseCntxtVlRngHiUnt() != null) {
			conceptmapusecontextvaluerangehigh.setUnit(c.getCncptMapUseCntxtVlRngHiUnt());
		}
		/******************** CncptMap_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(c.getCncptMapUseCntxtVlRngHiVl() != null) {
			conceptmapusecontextvaluerangehigh.setValue(Double.parseDouble((c.getCncptMapUseCntxtVlRngHiVl())));
		}
		/******************** conceptmapusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity conceptmapusecontextvaluerangelow =  new org.hl7.fhir.r4.model.Quantity();
		conceptmapusecontextvaluerange.setLow(conceptmapusecontextvaluerangelow);

		/******************** CncptMap_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(c.getCncptMapUseCntxtVlRngLwCd() != null) {
			conceptmapusecontextvaluerangelow.setCode(c.getCncptMapUseCntxtVlRngLwCd());
		}
		/******************** conceptmapusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory conceptmapusecontextvaluerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		conceptmapusecontextvaluerangelow.setComparator(conceptmapusecontextvaluerangelowcomparator.fromCode(c.getCncptMapUseCntxtVlRngLwCmprtr()));

		/******************** CncptMap_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(c.getCncptMapUseCntxtVlRngLwSys() != null) {
			conceptmapusecontextvaluerangelow.setSystem(c.getCncptMapUseCntxtVlRngLwSys());
		}
		/******************** CncptMap_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(c.getCncptMapUseCntxtVlRngLwUnt() != null) {
			conceptmapusecontextvaluerangelow.setUnit(c.getCncptMapUseCntxtVlRngLwUnt());
		}
		/******************** CncptMap_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(c.getCncptMapUseCntxtVlRngLwVl() != null) {
			conceptmapusecontextvaluerangelow.setValue(Double.parseDouble((c.getCncptMapUseCntxtVlRngLwVl())));
		}
		/******************** CncptMap_UseCntxt_VlRfrnc ********************************************************************************/
		if(c.getCncptMapUseCntxtVlRfrnc() != null) {
			conceptmapusecontext.setValue( new org.hl7.fhir.r4.model.Reference(c.getCncptMapUseCntxtVlRfrnc()));
		}
		/******************** CncptMap_Vrsn ********************************************************************************/
		if(c.getCncptMapVrsn() != null) {
			conceptmap.setVersion(c.getCncptMapVrsn());
		}
		return conceptmap;
	}
}
