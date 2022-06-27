package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ConceptMap;
public class ConceptMapBidirectionalConversion 
{
	public ConceptMap ConceptMaps(org.hl7.fhir.r4.model.ConceptMap conceptmap) throws ParseException
	{
		 main.java.com.campfhir.model.ConceptMap c = new  main.java.com.campfhir.model.ConceptMap();

		/******************** id ********************************************************************************/
		conceptmap.setId(c.getId());

		/******************** CncptMap_Nm ********************************************************************************/
		if(conceptmap.hasName()) {
			c.setCncptMapNm(String.valueOf(conceptmap.getName()));
		}
		/******************** CncptMap_Dt ********************************************************************************/
		if(conceptmap.hasDate()) {
			c.setCncptMapDt(String.valueOf(conceptmap.getDate()));
		}
		/******************** CncptMap_Vrsn ********************************************************************************/
		if(conceptmap.hasVersion()) {
			c.setCncptMapVrsn(String.valueOf(conceptmap.getVersion()));
		}
		/******************** CncptMap_SrcUriTyp ********************************************************************************/
		if(conceptmap.hasSourceUriType()) {
			c.setCncptMapSrcUriTyp(String.valueOf(conceptmap.getSourceUriType()));
		}
		/******************** CncptMap_TarUriTyp ********************************************************************************/
		if(conceptmap.hasTargetUriType()) {
			c.setCncptMapTarUriTyp(String.valueOf(conceptmap.getTargetUriType()));
		}
		/******************** CncptMap_Ttl ********************************************************************************/
		if(conceptmap.hasTitle()) {
			c.setCncptMapTtl(String.valueOf(conceptmap.getTitle()));
		}
		/******************** conceptmapstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus conceptmapstatus = conceptmap.getStatus();
		c.setCncptMapSts(conceptmapstatus.toCode());

		/******************** CncptMap_Dscrptn ********************************************************************************/
		if(conceptmap.hasDescription()) {
			c.setCncptMapDscrptn(String.valueOf(conceptmap.getDescription()));
		}
		/******************** CncptMap_Url ********************************************************************************/
		if(conceptmap.hasUrl()) {
			c.setCncptMapUrl(String.valueOf(conceptmap.getUrl()));
		}
		/******************** conceptmapidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier conceptmapidentifier = conceptmap.getIdentifier();

		/******************** CncptMap_Id_Vl ********************************************************************************/
		if(conceptmapidentifier.hasValue()) {
			c.setCncptMapIdVl(String.valueOf(conceptmapidentifier.getValue()));
		}
		/******************** conceptmapidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept conceptmapidentifiertype = conceptmapidentifier.getType();

		/******************** CncptMap_Id_Typ_Txt ********************************************************************************/
		if(conceptmapidentifiertype.hasText()) {
			c.setCncptMapIdTypTxt(String.valueOf(conceptmapidentifiertype.getText()));
		}
		/******************** conceptmapidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding conceptmapidentifiertypecoding = conceptmapidentifiertype.getCodingFirstRep();

		/******************** CncptMap_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(conceptmapidentifiertypecoding.hasVersion()) {
			c.setCncptMapIdTypCdgVrsn(String.valueOf(conceptmapidentifiertypecoding.getVersion()));
		}
		/******************** CncptMap_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(conceptmapidentifiertypecoding.hasDisplay()) {
			c.setCncptMapIdTypCdgDsply(String.valueOf(conceptmapidentifiertypecoding.getDisplay()));
		}
		/******************** CncptMap_Id_Typ_Cdg_Cd ********************************************************************************/
		if(conceptmapidentifiertypecoding.hasCode()) {
			c.setCncptMapIdTypCdgCd(String.valueOf(conceptmapidentifiertypecoding.getCode()));
		}
		/******************** CncptMap_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(conceptmapidentifiertypecoding.hasUserSelected()) {
			c.setCncptMapIdTypCdgUsrSltd(String.valueOf(conceptmapidentifiertypecoding.getUserSelected()));
		}
		/******************** CncptMap_Id_Typ_Cdg_Sys ********************************************************************************/
		if(conceptmapidentifiertypecoding.hasSystem()) {
			c.setCncptMapIdTypCdgSys(String.valueOf(conceptmapidentifiertypecoding.getSystem()));
		}
		/******************** conceptmapidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period conceptmapidentifierperiod = conceptmapidentifier.getPeriod();

		/******************** CncptMap_Id_Prd_Strt ********************************************************************************/
		if(conceptmapidentifierperiod.hasStart()) {
			c.setCncptMapIdPrdStrt(String.valueOf(conceptmapidentifierperiod.getStart()));
		}
		/******************** CncptMap_Id_Prd_End ********************************************************************************/
		if(conceptmapidentifierperiod.hasEnd()) {
			c.setCncptMapIdPrdEnd(String.valueOf(conceptmapidentifierperiod.getEnd()));
		}
		/******************** CncptMap_Id_Assigner ********************************************************************************/
		if(conceptmapidentifier.hasAssigner()) {
			c.setCncptMapIdAssigner(String.valueOf(conceptmapidentifier.getAssigner()));
		}
		/******************** CncptMap_Id_Sys ********************************************************************************/
		if(conceptmapidentifier.hasSystem()) {
			c.setCncptMapIdSys(String.valueOf(conceptmapidentifier.getSystem()));
		}
		/******************** conceptmapidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse conceptmapidentifieruse = conceptmapidentifier.getUse();
		c.setCncptMapIdUse(conceptmapidentifieruse.toCode());

		/******************** CncptMap_Pblshr ********************************************************************************/
		if(conceptmap.hasPublisher()) {
			c.setCncptMapPblshr(String.valueOf(conceptmap.getPublisher()));
		}
		/******************** CncptMap_Exprmtl ********************************************************************************/
		if(conceptmap.hasExperimental()) {
			c.setCncptMapExprmtl(String.valueOf(conceptmap.getExperimental()));
		}
		/******************** CncptMap_Prpse ********************************************************************************/
		if(conceptmap.hasPurpose()) {
			c.setCncptMapPrpse(String.valueOf(conceptmap.getPurpose()));
		}
		/******************** CncptMap_TarCanonicalTyp ********************************************************************************/
		if(conceptmap.hasTargetCanonicalType()) {
			c.setCncptMapTarCanonicalTyp(String.valueOf(conceptmap.getTargetCanonicalType()));
		}
		/******************** CncptMap_SrcCanonicalTyp ********************************************************************************/
		if(conceptmap.hasSourceCanonicalType()) {
			c.setCncptMapSrcCanonicalTyp(String.valueOf(conceptmap.getSourceCanonicalType()));
		}
		/******************** conceptmapcontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail conceptmapcontact = conceptmap.getContactFirstRep();

		/******************** CncptMap_Cntct_Nm ********************************************************************************/
		if(conceptmapcontact.hasName()) {
			c.setCncptMapCntctNm(String.valueOf(conceptmapcontact.getName()));
		}
		/******************** conceptmapcontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint conceptmapcontacttelecom = conceptmapcontact.getTelecomFirstRep();

		/******************** CncptMap_Cntct_Tlcm_Vl ********************************************************************************/
		if(conceptmapcontacttelecom.hasValue()) {
			c.setCncptMapCntctTlcmVl(String.valueOf(conceptmapcontacttelecom.getValue()));
		}
		/******************** conceptmapcontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period conceptmapcontacttelecomperiod = conceptmapcontacttelecom.getPeriod();

		/******************** CncptMap_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(conceptmapcontacttelecomperiod.hasStart()) {
			c.setCncptMapCntctTlcmPrdStrt(String.valueOf(conceptmapcontacttelecomperiod.getStart()));
		}
		/******************** CncptMap_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(conceptmapcontacttelecomperiod.hasEnd()) {
			c.setCncptMapCntctTlcmPrdEnd(String.valueOf(conceptmapcontacttelecomperiod.getEnd()));
		}
		/******************** conceptmapcontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem conceptmapcontacttelecomsystem = conceptmapcontacttelecom.getSystem();
		c.setCncptMapCntctTlcmSys(conceptmapcontacttelecomsystem.toCode());

		/******************** conceptmapcontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse conceptmapcontacttelecomuse = conceptmapcontacttelecom.getUse();
		c.setCncptMapCntctTlcmUse(conceptmapcontacttelecomuse.toCode());

		/******************** CncptMap_Cntct_Tlcm_Rnk ********************************************************************************/
		if(conceptmapcontacttelecom.hasRank()) {
			c.setCncptMapCntctTlcmRnk(String.valueOf(conceptmapcontacttelecom.getRank()));
		}
		/******************** conceptmapgroup ********************************************************************************/
		org.hl7.fhir.r4.model.ConceptMap.ConceptMapGroupComponent conceptmapgroup = conceptmap.getGroupFirstRep();

		/******************** CncptMap_Grp_Src ********************************************************************************/
		if(conceptmapgroup.hasSource()) {
			c.setCncptMapGrpSrc(String.valueOf(conceptmapgroup.getSource()));
		}
		/******************** conceptmapgroupelement ********************************************************************************/
		org.hl7.fhir.r4.model.ConceptMap.SourceElementComponent conceptmapgroupelement = conceptmapgroup.getElementFirstRep();

		/******************** CncptMap_Grp_Elmnt_Cd ********************************************************************************/
		if(conceptmapgroupelement.hasCode()) {
			c.setCncptMapGrpElmntCd(String.valueOf(conceptmapgroupelement.getCode()));
		}
		/******************** conceptmapgroupelementtarget ********************************************************************************/
		org.hl7.fhir.r4.model.ConceptMap.TargetElementComponent conceptmapgroupelementtarget = conceptmapgroupelement.getTargetFirstRep();

		/******************** CncptMap_Grp_Elmnt_Target_Comment ********************************************************************************/
		if(conceptmapgroupelementtarget.hasComment()) {
			c.setCncptMapGrpElmntTarComment(String.valueOf(conceptmapgroupelementtarget.getComment()));
		}
		/******************** CncptMap_Grp_Elmnt_Target_Cd ********************************************************************************/
		if(conceptmapgroupelementtarget.hasCode()) {
			c.setCncptMapGrpElmntTarCd(String.valueOf(conceptmapgroupelementtarget.getCode()));
		}
		/******************** conceptmapgroupelementtargetequivalence ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.ConceptMapEquivalence conceptmapgroupelementtargetequivalence = conceptmapgroupelementtarget.getEquivalence();
		c.setCncptMapGrpElmntTarEquivalence(conceptmapgroupelementtargetequivalence.toCode());

		/******************** conceptmapgroupelementtargetproduct ********************************************************************************/
		org.hl7.fhir.r4.model.ConceptMap.OtherElementComponent conceptmapgroupelementtargetproduct = conceptmapgroupelementtarget.getProductFirstRep();

		/******************** CncptMap_Grp_Elmnt_Target_Prdct_Prpty ********************************************************************************/
		if(conceptmapgroupelementtargetproduct.hasProperty()) {
			c.setCncptMapGrpElmntTarPrdctPrpty(String.valueOf(conceptmapgroupelementtargetproduct.getProperty()));
		}
		/******************** CncptMap_Grp_Elmnt_Target_Prdct_Vl ********************************************************************************/
		if(conceptmapgroupelementtargetproduct.hasValue()) {
			c.setCncptMapGrpElmntTarPrdctVl(String.valueOf(conceptmapgroupelementtargetproduct.getValue()));
		}
		/******************** CncptMap_Grp_Elmnt_Target_Prdct_Sys ********************************************************************************/
		if(conceptmapgroupelementtargetproduct.hasSystem()) {
			c.setCncptMapGrpElmntTarPrdctSys(String.valueOf(conceptmapgroupelementtargetproduct.getSystem()));
		}
		/******************** conceptmapgroupelementtargetdependson ********************************************************************************/
		org.hl7.fhir.r4.model.ConceptMap.OtherElementComponent conceptmapgroupelementtargetdependson = conceptmapgroupelementtarget.getDependsOnFirstRep();

		/******************** CncptMap_Grp_Elmnt_Target_DependsOn_Prpty ********************************************************************************/
		if(conceptmapgroupelementtargetdependson.hasProperty()) {
			c.setCncptMapGrpElmntTarDependsOnPrpty(String.valueOf(conceptmapgroupelementtargetdependson.getProperty()));
		}
		/******************** CncptMap_Grp_Elmnt_Target_DependsOn_Vl ********************************************************************************/
		if(conceptmapgroupelementtargetdependson.hasValue()) {
			c.setCncptMapGrpElmntTarDependsOnVl(String.valueOf(conceptmapgroupelementtargetdependson.getValue()));
		}
		/******************** CncptMap_Grp_Elmnt_Target_DependsOn_Sys ********************************************************************************/
		if(conceptmapgroupelementtargetdependson.hasSystem()) {
			c.setCncptMapGrpElmntTarDependsOnSys(String.valueOf(conceptmapgroupelementtargetdependson.getSystem()));
		}
		/******************** CncptMap_Grp_SrcVrsn ********************************************************************************/
		if(conceptmapgroup.hasSourceVersion()) {
			c.setCncptMapGrpSrcVrsn(String.valueOf(conceptmapgroup.getSourceVersion()));
		}
		/******************** CncptMap_Grp_TarVrsn ********************************************************************************/
		if(conceptmapgroup.hasTargetVersion()) {
			c.setCncptMapGrpTarVrsn(String.valueOf(conceptmapgroup.getTargetVersion()));
		}
		/******************** conceptmapgroupunmapped ********************************************************************************/
		org.hl7.fhir.r4.model.ConceptMap.ConceptMapGroupUnmappedComponent conceptmapgroupunmapped = conceptmapgroup.getUnmapped();

		/******************** CncptMap_Grp_Unmapped_Cd ********************************************************************************/
		if(conceptmapgroupunmapped.hasCode()) {
			c.setCncptMapGrpUnmappedCd(String.valueOf(conceptmapgroupunmapped.getCode()));
		}
		/******************** CncptMap_Grp_Unmapped_Url ********************************************************************************/
		if(conceptmapgroupunmapped.hasUrl()) {
			c.setCncptMapGrpUnmappedUrl(String.valueOf(conceptmapgroupunmapped.getUrl()));
		}
		/******************** conceptmapgroupunmappedmode ********************************************************************************/
		org.hl7.fhir.r4.model.ConceptMap.ConceptMapGroupUnmappedMode conceptmapgroupunmappedmode = conceptmapgroupunmapped.getMode();
		c.setCncptMapGrpUnmappedMode(conceptmapgroupunmappedmode.toCode());

		/******************** CncptMap_Copyright ********************************************************************************/
		if(conceptmap.hasCopyright()) {
			c.setCncptMapCopyright(String.valueOf(conceptmap.getCopyright()));
		}
		/******************** conceptmapusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext conceptmapusecontext = conceptmap.getUseContextFirstRep();

		/******************** conceptmapusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding conceptmapusecontextcode = conceptmapusecontext.getCode();

		/******************** CncptMap_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(conceptmapusecontextcode.hasVersion()) {
			c.setCncptMapUseCntxtCdVrsn(String.valueOf(conceptmapusecontextcode.getVersion()));
		}
		/******************** CncptMap_UseCntxt_Cd_Dsply ********************************************************************************/
		if(conceptmapusecontextcode.hasDisplay()) {
			c.setCncptMapUseCntxtCdDsply(String.valueOf(conceptmapusecontextcode.getDisplay()));
		}
		/******************** CncptMap_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(conceptmapusecontextcode.hasUserSelected()) {
			c.setCncptMapUseCntxtCdUsrSltd(String.valueOf(conceptmapusecontextcode.getUserSelected()));
		}
		/******************** CncptMap_UseCntxt_Cd_Sys ********************************************************************************/
		if(conceptmapusecontextcode.hasSystem()) {
			c.setCncptMapUseCntxtCdSys(String.valueOf(conceptmapusecontextcode.getSystem()));
		}
		/******************** conceptmapusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept conceptmapusecontextvaluecodeableconcept = conceptmapusecontext.getValueCodeableConcept();

		/******************** CncptMap_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(conceptmapusecontextvaluecodeableconcept.hasText()) {
			c.setCncptMapUseCntxtVlCdbleCncptTxt(String.valueOf(conceptmapusecontextvaluecodeableconcept.getText()));
		}
		/******************** conceptmapusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding conceptmapusecontextvaluecodeableconceptcoding = conceptmapusecontextvaluecodeableconcept.getCodingFirstRep();

		/******************** CncptMap_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(conceptmapusecontextvaluecodeableconceptcoding.hasVersion()) {
			c.setCncptMapUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(conceptmapusecontextvaluecodeableconceptcoding.getVersion()));
		}
		/******************** CncptMap_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(conceptmapusecontextvaluecodeableconceptcoding.hasDisplay()) {
			c.setCncptMapUseCntxtVlCdbleCncptCdgDsply(String.valueOf(conceptmapusecontextvaluecodeableconceptcoding.getDisplay()));
		}
		/******************** CncptMap_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(conceptmapusecontextvaluecodeableconceptcoding.hasCode()) {
			c.setCncptMapUseCntxtVlCdbleCncptCdgCd(String.valueOf(conceptmapusecontextvaluecodeableconceptcoding.getCode()));
		}
		/******************** CncptMap_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(conceptmapusecontextvaluecodeableconceptcoding.hasUserSelected()) {
			c.setCncptMapUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(conceptmapusecontextvaluecodeableconceptcoding.getUserSelected()));
		}
		/******************** CncptMap_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(conceptmapusecontextvaluecodeableconceptcoding.hasSystem()) {
			c.setCncptMapUseCntxtVlCdbleCncptCdgSys(String.valueOf(conceptmapusecontextvaluecodeableconceptcoding.getSystem()));
		}
		/******************** conceptmapusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity conceptmapusecontextvaluequantity = conceptmapusecontext.getValueQuantity();

		/******************** CncptMap_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(conceptmapusecontextvaluequantity.hasValue()) {
			c.setCncptMapUseCntxtVlQntyVl(String.valueOf(conceptmapusecontextvaluequantity.getValue()));
		}
		/******************** conceptmapusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator conceptmapusecontextvaluequantitycomparator = conceptmapusecontextvaluequantity.getComparator();
		c.setCncptMapUseCntxtVlQntyCmprtr(conceptmapusecontextvaluequantitycomparator.toCode());

		/******************** CncptMap_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(conceptmapusecontextvaluequantity.hasCode()) {
			c.setCncptMapUseCntxtVlQntyCd(String.valueOf(conceptmapusecontextvaluequantity.getCode()));
		}
		/******************** CncptMap_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(conceptmapusecontextvaluequantity.hasUnit()) {
			c.setCncptMapUseCntxtVlQntyUnt(String.valueOf(conceptmapusecontextvaluequantity.getUnit()));
		}
		/******************** CncptMap_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(conceptmapusecontextvaluequantity.hasSystem()) {
			c.setCncptMapUseCntxtVlQntySys(String.valueOf(conceptmapusecontextvaluequantity.getSystem()));
		}
		/******************** conceptmapusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range conceptmapusecontextvaluerange = conceptmapusecontext.getValueRange();

		/******************** conceptmapusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity conceptmapusecontextvaluerangelow = conceptmapusecontextvaluerange.getLow();

		/******************** CncptMap_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(conceptmapusecontextvaluerangelow.hasValue()) {
			c.setCncptMapUseCntxtVlRngLwVl(String.valueOf(conceptmapusecontextvaluerangelow.getValue()));
		}
		/******************** conceptmapusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator conceptmapusecontextvaluerangelowcomparator = conceptmapusecontextvaluerangelow.getComparator();
		c.setCncptMapUseCntxtVlRngLwCmprtr(conceptmapusecontextvaluerangelowcomparator.toCode());

		/******************** CncptMap_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(conceptmapusecontextvaluerangelow.hasCode()) {
			c.setCncptMapUseCntxtVlRngLwCd(String.valueOf(conceptmapusecontextvaluerangelow.getCode()));
		}
		/******************** CncptMap_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(conceptmapusecontextvaluerangelow.hasUnit()) {
			c.setCncptMapUseCntxtVlRngLwUnt(String.valueOf(conceptmapusecontextvaluerangelow.getUnit()));
		}
		/******************** CncptMap_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(conceptmapusecontextvaluerangelow.hasSystem()) {
			c.setCncptMapUseCntxtVlRngLwSys(String.valueOf(conceptmapusecontextvaluerangelow.getSystem()));
		}
		/******************** conceptmapusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity conceptmapusecontextvaluerangehigh = conceptmapusecontextvaluerange.getHigh();

		/******************** CncptMap_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(conceptmapusecontextvaluerangehigh.hasValue()) {
			c.setCncptMapUseCntxtVlRngHiVl(String.valueOf(conceptmapusecontextvaluerangehigh.getValue()));
		}
		/******************** conceptmapusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator conceptmapusecontextvaluerangehighcomparator = conceptmapusecontextvaluerangehigh.getComparator();
		c.setCncptMapUseCntxtVlRngHiCmprtr(conceptmapusecontextvaluerangehighcomparator.toCode());

		/******************** CncptMap_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(conceptmapusecontextvaluerangehigh.hasCode()) {
			c.setCncptMapUseCntxtVlRngHiCd(String.valueOf(conceptmapusecontextvaluerangehigh.getCode()));
		}
		/******************** CncptMap_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(conceptmapusecontextvaluerangehigh.hasUnit()) {
			c.setCncptMapUseCntxtVlRngHiUnt(String.valueOf(conceptmapusecontextvaluerangehigh.getUnit()));
		}
		/******************** CncptMap_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(conceptmapusecontextvaluerangehigh.hasSystem()) {
			c.setCncptMapUseCntxtVlRngHiSys(String.valueOf(conceptmapusecontextvaluerangehigh.getSystem()));
		}
		/******************** CncptMap_UseCntxt_VlRfrnc ********************************************************************************/
		if(conceptmapusecontext.hasValueReference()) {
			c.setCncptMapUseCntxtVlRfrnc(String.valueOf(conceptmapusecontext.getValueReference()));
		}
		/******************** conceptmapjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept conceptmapjurisdiction = conceptmap.getJurisdictionFirstRep();

		/******************** CncptMap_Jrsdctn_Txt ********************************************************************************/
		if(conceptmapjurisdiction.hasText()) {
			c.setCncptMapJrsdctnTxt(String.valueOf(conceptmapjurisdiction.getText()));
		}
		/******************** conceptmapjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding conceptmapjurisdictioncoding = conceptmapjurisdiction.getCodingFirstRep();

		/******************** CncptMap_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(conceptmapjurisdictioncoding.hasVersion()) {
			c.setCncptMapJrsdctnCdgVrsn(String.valueOf(conceptmapjurisdictioncoding.getVersion()));
		}
		/******************** CncptMap_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(conceptmapjurisdictioncoding.hasDisplay()) {
			c.setCncptMapJrsdctnCdgDsply(String.valueOf(conceptmapjurisdictioncoding.getDisplay()));
		}
		/******************** CncptMap_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(conceptmapjurisdictioncoding.hasCode()) {
			c.setCncptMapJrsdctnCdgCd(String.valueOf(conceptmapjurisdictioncoding.getCode()));
		}
		/******************** CncptMap_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(conceptmapjurisdictioncoding.hasUserSelected()) {
			c.setCncptMapJrsdctnCdgUsrSltd(String.valueOf(conceptmapjurisdictioncoding.getUserSelected()));
		}
		/******************** CncptMap_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(conceptmapjurisdictioncoding.hasSystem()) {
			c.setCncptMapJrsdctnCdgSys(String.valueOf(conceptmapjurisdictioncoding.getSystem()));
		}
		return c;
	}
}
