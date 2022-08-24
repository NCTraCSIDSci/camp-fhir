package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ConceptMap;
public class ConceptMapBidirectionalConversion 
{
	public ConceptMap ConceptMaps(org.hl7.fhir.r4.model.ConceptMap conceptmap) throws ParseException
	{
		 main.java.com.campfhir.model.ConceptMap c = new  main.java.com.campfhir.model.ConceptMap();

		/******************** id ********************************************************************************/
		c.setId(conceptmap.getIdElement().getIdPart());

		/******************** CncptMap_Nm ********************************************************************************/
		if(conceptmap.hasName()) {

			c.addCncptMapNm(String.valueOf(conceptmap.getName()));
		} else {
			c.addCncptMapNm("NULL");
		}


		/******************** CncptMap_Vrsn ********************************************************************************/
		if(conceptmap.hasVersion()) {

			c.addCncptMapVrsn(String.valueOf(conceptmap.getVersion()));
		} else {
			c.addCncptMapVrsn("NULL");
		}


		/******************** conceptmapgroup ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ConceptMap.ConceptMapGroupComponent> conceptmapgrouplist = conceptmap.getGroup();
		for(int conceptmapgroupi = 0; conceptmapgroupi<conceptmapgrouplist.size();conceptmapgroupi++ ) {
		org.hl7.fhir.r4.model.ConceptMap.ConceptMapGroupComponent  conceptmapgroup = conceptmapgrouplist.get(conceptmapgroupi);

		/******************** CncptMap_Grp_Src ********************************************************************************/
		if(conceptmapgroupi == 0) {c.addCncptMapGrpSrc("[");}
		if(conceptmapgroup.hasSource()) {

			c.addCncptMapGrpSrc(String.valueOf(conceptmapgroup.getSource()));
		} else {
			c.addCncptMapGrpSrc("NULL");
		}

		if(conceptmapgroupi == conceptmapgrouplist.size()-1) {c.addCncptMapGrpSrc("]");}


		/******************** CncptMap_Grp_SrcVrsn ********************************************************************************/
		if(conceptmapgroupi == 0) {c.addCncptMapGrpSrcVrsn("[");}
		if(conceptmapgroup.hasSourceVersion()) {

			c.addCncptMapGrpSrcVrsn(String.valueOf(conceptmapgroup.getSourceVersion()));
		} else {
			c.addCncptMapGrpSrcVrsn("NULL");
		}

		if(conceptmapgroupi == conceptmapgrouplist.size()-1) {c.addCncptMapGrpSrcVrsn("]");}


		/******************** CncptMap_Grp_TarVrsn ********************************************************************************/
		if(conceptmapgroupi == 0) {c.addCncptMapGrpTarVrsn("[");}
		if(conceptmapgroup.hasTargetVersion()) {

			c.addCncptMapGrpTarVrsn(String.valueOf(conceptmapgroup.getTargetVersion()));
		} else {
			c.addCncptMapGrpTarVrsn("NULL");
		}

		if(conceptmapgroupi == conceptmapgrouplist.size()-1) {c.addCncptMapGrpTarVrsn("]");}


		/******************** conceptmapgroupunmapped ********************************************************************************/
		org.hl7.fhir.r4.model.ConceptMap.ConceptMapGroupUnmappedComponent conceptmapgroupunmapped = conceptmapgroup.getUnmapped();

		/******************** CncptMap_Grp_Unmapped_Cd ********************************************************************************/
		if(conceptmapgroupi == 0) {c.addCncptMapGrpUnmappedCd("[");}
		if(conceptmapgroupunmapped.hasCode()) {

			c.addCncptMapGrpUnmappedCd(String.valueOf(conceptmapgroupunmapped.getCode()));
		} else {
			c.addCncptMapGrpUnmappedCd("NULL");
		}

		if(conceptmapgroupi == conceptmapgrouplist.size()-1) {c.addCncptMapGrpUnmappedCd("]");}


		/******************** conceptmapgroupunmappedmode ********************************************************************************/
		org.hl7.fhir.r4.model.ConceptMap.ConceptMapGroupUnmappedMode conceptmapgroupunmappedmode = conceptmapgroupunmapped.getMode();
		if(conceptmapgroupunmappedmode!=null) {
		if(conceptmapgroupi == 0) {

		c.addCncptMapGrpUnmappedMode("[");		}
			c.addCncptMapGrpUnmappedMode(conceptmapgroupunmappedmode.toCode());
		if(conceptmapgroupi == conceptmapgrouplist.size()-1) {

		c.addCncptMapGrpUnmappedMode("]");		}

		} else {
			c.addCncptMapGrpUnmappedMode("NULL");
		}

		/******************** CncptMap_Grp_Unmapped_Url ********************************************************************************/
		if(conceptmapgroupi == 0) {c.addCncptMapGrpUnmappedUrl("[");}
		if(conceptmapgroupunmapped.hasUrl()) {

			c.addCncptMapGrpUnmappedUrl(String.valueOf(conceptmapgroupunmapped.getUrl()));
		} else {
			c.addCncptMapGrpUnmappedUrl("NULL");
		}

		if(conceptmapgroupi == conceptmapgrouplist.size()-1) {c.addCncptMapGrpUnmappedUrl("]");}


		 };
		/******************** CncptMap_Dt ********************************************************************************/
		if(conceptmap.hasDate()) {

			c.addCncptMapDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(conceptmap.getDate())+"\"");
		} else {
			c.addCncptMapDt("NULL");
		}


		/******************** conceptmapstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus conceptmapstatus = conceptmap.getStatus();
		if(conceptmapstatus!=null) {
			c.addCncptMapSts(conceptmapstatus.toCode());
		} else {
			c.addCncptMapSts("NULL");
		}

		/******************** CncptMap_Dscrptn ********************************************************************************/
		if(conceptmap.hasDescription()) {

			c.addCncptMapDscrptn(String.valueOf(conceptmap.getDescription()));
		} else {
			c.addCncptMapDscrptn("NULL");
		}


		/******************** conceptmapidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier conceptmapidentifier = conceptmap.getIdentifier();

		/******************** CncptMap_Id_Vl ********************************************************************************/
		if(conceptmapidentifier.hasValue()) {

			c.addCncptMapIdVl(String.valueOf(conceptmapidentifier.getValue()));
		} else {
			c.addCncptMapIdVl("NULL");
		}


		/******************** conceptmapidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept conceptmapidentifiertype = conceptmapidentifier.getType();

		/******************** CncptMap_Id_Typ_Txt ********************************************************************************/
		if(conceptmapidentifiertype.hasText()) {

			c.addCncptMapIdTypTxt(String.valueOf(conceptmapidentifiertype.getText()));
		} else {
			c.addCncptMapIdTypTxt("NULL");
		}


		/******************** conceptmapidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> conceptmapidentifiertypecodinglist = conceptmapidentifiertype.getCoding();
		for(int conceptmapidentifiertypecodingi = 0; conceptmapidentifiertypecodingi<conceptmapidentifiertypecodinglist.size();conceptmapidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  conceptmapidentifiertypecoding = conceptmapidentifiertypecodinglist.get(conceptmapidentifiertypecodingi);

		/******************** CncptMap_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(conceptmapidentifiertypecodingi == 0) {c.addCncptMapIdTypCdgDsply("[");}
		if(conceptmapidentifiertypecoding.hasDisplay()) {

			c.addCncptMapIdTypCdgDsply(String.valueOf(conceptmapidentifiertypecoding.getDisplay()));
		} else {
			c.addCncptMapIdTypCdgDsply("NULL");
		}

		if(conceptmapidentifiertypecodingi == conceptmapidentifiertypecodinglist.size()-1) {c.addCncptMapIdTypCdgDsply("]");}


		/******************** CncptMap_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(conceptmapidentifiertypecodingi == 0) {c.addCncptMapIdTypCdgVrsn("[");}
		if(conceptmapidentifiertypecoding.hasVersion()) {

			c.addCncptMapIdTypCdgVrsn(String.valueOf(conceptmapidentifiertypecoding.getVersion()));
		} else {
			c.addCncptMapIdTypCdgVrsn("NULL");
		}

		if(conceptmapidentifiertypecodingi == conceptmapidentifiertypecodinglist.size()-1) {c.addCncptMapIdTypCdgVrsn("]");}


		/******************** CncptMap_Id_Typ_Cdg_Cd ********************************************************************************/
		if(conceptmapidentifiertypecodingi == 0) {c.addCncptMapIdTypCdgCd("[");}
		if(conceptmapidentifiertypecoding.hasCode()) {

			c.addCncptMapIdTypCdgCd(String.valueOf(conceptmapidentifiertypecoding.getCode()));
		} else {
			c.addCncptMapIdTypCdgCd("NULL");
		}

		if(conceptmapidentifiertypecodingi == conceptmapidentifiertypecodinglist.size()-1) {c.addCncptMapIdTypCdgCd("]");}


		/******************** CncptMap_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(conceptmapidentifiertypecodingi == 0) {c.addCncptMapIdTypCdgUsrSltd("[");}
		if(conceptmapidentifiertypecoding.hasUserSelected()) {

			c.addCncptMapIdTypCdgUsrSltd(String.valueOf(conceptmapidentifiertypecoding.getUserSelected()));
		} else {
			c.addCncptMapIdTypCdgUsrSltd("NULL");
		}

		if(conceptmapidentifiertypecodingi == conceptmapidentifiertypecodinglist.size()-1) {c.addCncptMapIdTypCdgUsrSltd("]");}


		/******************** CncptMap_Id_Typ_Cdg_Sys ********************************************************************************/
		if(conceptmapidentifiertypecodingi == 0) {c.addCncptMapIdTypCdgSys("[");}
		if(conceptmapidentifiertypecoding.hasSystem()) {

			c.addCncptMapIdTypCdgSys(String.valueOf(conceptmapidentifiertypecoding.getSystem()));
		} else {
			c.addCncptMapIdTypCdgSys("NULL");
		}

		if(conceptmapidentifiertypecodingi == conceptmapidentifiertypecodinglist.size()-1) {c.addCncptMapIdTypCdgSys("]");}


		 };
		/******************** conceptmapidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period conceptmapidentifierperiod = conceptmapidentifier.getPeriod();

		/******************** CncptMap_Id_Prd_Strt ********************************************************************************/
		if(conceptmapidentifierperiod.hasStart()) {

			c.addCncptMapIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(conceptmapidentifierperiod.getStart())+"\"");
		} else {
			c.addCncptMapIdPrdStrt("NULL");
		}


		/******************** CncptMap_Id_Prd_End ********************************************************************************/
		if(conceptmapidentifierperiod.hasEnd()) {

			c.addCncptMapIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(conceptmapidentifierperiod.getEnd())+"\"");
		} else {
			c.addCncptMapIdPrdEnd("NULL");
		}


		/******************** conceptmapidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse conceptmapidentifieruse = conceptmapidentifier.getUse();
		if(conceptmapidentifieruse!=null) {
			c.addCncptMapIdUse(conceptmapidentifieruse.toCode());
		} else {
			c.addCncptMapIdUse("NULL");
		}

		/******************** CncptMap_Id_Assigner ********************************************************************************/
		if(conceptmapidentifier.hasAssigner()) {

			if(conceptmapidentifier.getAssigner().getReference() != null) {
			c.addCncptMapIdAssigner(conceptmapidentifier.getAssigner().getReference());
			}
		} else {
			c.addCncptMapIdAssigner("NULL");
		}


		/******************** CncptMap_Id_Sys ********************************************************************************/
		if(conceptmapidentifier.hasSystem()) {

			c.addCncptMapIdSys(String.valueOf(conceptmapidentifier.getSystem()));
		} else {
			c.addCncptMapIdSys("NULL");
		}


		/******************** conceptmapcontact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> conceptmapcontactlist = conceptmap.getContact();
		for(int conceptmapcontacti = 0; conceptmapcontacti<conceptmapcontactlist.size();conceptmapcontacti++ ) {
		org.hl7.fhir.r4.model.ContactDetail  conceptmapcontact = conceptmapcontactlist.get(conceptmapcontacti);

		/******************** CncptMap_Cntct_Nm ********************************************************************************/
		if(conceptmapcontacti == 0) {c.addCncptMapCntctNm("[");}
		if(conceptmapcontact.hasName()) {

			c.addCncptMapCntctNm(String.valueOf(conceptmapcontact.getName()));
		} else {
			c.addCncptMapCntctNm("NULL");
		}

		if(conceptmapcontacti == conceptmapcontactlist.size()-1) {c.addCncptMapCntctNm("]");}


		/******************** conceptmapcontacttelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> conceptmapcontacttelecomlist = conceptmapcontact.getTelecom();
		for(int conceptmapcontacttelecomi = 0; conceptmapcontacttelecomi<conceptmapcontacttelecomlist.size();conceptmapcontacttelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  conceptmapcontacttelecom = conceptmapcontacttelecomlist.get(conceptmapcontacttelecomi);

		/******************** CncptMap_Cntct_Tlcm_Vl ********************************************************************************/
		if(conceptmapcontacttelecomi == 0) {c.addCncptMapCntctTlcmVl("[[");}
		if(conceptmapcontacttelecom.hasValue()) {

			c.addCncptMapCntctTlcmVl(String.valueOf(conceptmapcontacttelecom.getValue()));
		} else {
			c.addCncptMapCntctTlcmVl("NULL");
		}

		if(conceptmapcontacttelecomi == conceptmapcontacttelecomlist.size()-1) {c.addCncptMapCntctTlcmVl("]]");}


		/******************** conceptmapcontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period conceptmapcontacttelecomperiod = conceptmapcontacttelecom.getPeriod();

		/******************** CncptMap_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(conceptmapcontacttelecomi == 0) {c.addCncptMapCntctTlcmPrdStrt("[[");}
		if(conceptmapcontacttelecomperiod.hasStart()) {

			c.addCncptMapCntctTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(conceptmapcontacttelecomperiod.getStart())+"\"");
		} else {
			c.addCncptMapCntctTlcmPrdStrt("NULL");
		}

		if(conceptmapcontacttelecomi == conceptmapcontacttelecomlist.size()-1) {c.addCncptMapCntctTlcmPrdStrt("]]");}


		/******************** CncptMap_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(conceptmapcontacttelecomi == 0) {c.addCncptMapCntctTlcmPrdEnd("[[");}
		if(conceptmapcontacttelecomperiod.hasEnd()) {

			c.addCncptMapCntctTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(conceptmapcontacttelecomperiod.getEnd())+"\"");
		} else {
			c.addCncptMapCntctTlcmPrdEnd("NULL");
		}

		if(conceptmapcontacttelecomi == conceptmapcontacttelecomlist.size()-1) {c.addCncptMapCntctTlcmPrdEnd("]]");}


		/******************** conceptmapcontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse conceptmapcontacttelecomuse = conceptmapcontacttelecom.getUse();
		if(conceptmapcontacttelecomuse!=null) {
		if(conceptmapcontacttelecomi == 0) {

		c.addCncptMapCntctTlcmUse("[[");		}
			c.addCncptMapCntctTlcmUse(conceptmapcontacttelecomuse.toCode());
		if(conceptmapcontacttelecomi == conceptmapcontacttelecomlist.size()-1) {

		c.addCncptMapCntctTlcmUse("]]");		}

		} else {
			c.addCncptMapCntctTlcmUse("NULL");
		}

		/******************** conceptmapcontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem conceptmapcontacttelecomsystem = conceptmapcontacttelecom.getSystem();
		if(conceptmapcontacttelecomsystem!=null) {
		if(conceptmapcontacttelecomi == 0) {

		c.addCncptMapCntctTlcmSys("[[");		}
			c.addCncptMapCntctTlcmSys(conceptmapcontacttelecomsystem.toCode());
		if(conceptmapcontacttelecomi == conceptmapcontacttelecomlist.size()-1) {

		c.addCncptMapCntctTlcmSys("]]");		}

		} else {
			c.addCncptMapCntctTlcmSys("NULL");
		}

		/******************** CncptMap_Cntct_Tlcm_Rnk ********************************************************************************/
		if(conceptmapcontacttelecomi == 0) {c.addCncptMapCntctTlcmRnk("[[");}
		if(conceptmapcontacttelecom.hasRank()) {

			c.addCncptMapCntctTlcmRnk(String.valueOf(conceptmapcontacttelecom.getRank()));
		} else {
			c.addCncptMapCntctTlcmRnk("NULL");
		}

		if(conceptmapcontacttelecomi == conceptmapcontacttelecomlist.size()-1) {c.addCncptMapCntctTlcmRnk("]]");}


		 };
		 };
		/******************** CncptMap_TarUriTyp ********************************************************************************/
		if(conceptmap.hasTargetUriType()) {

			c.addCncptMapTarUriTyp("\""+conceptmap.getTargetUriType().getValueAsString()+"\"");
		} else {
			c.addCncptMapTarUriTyp("NULL");
		}


		/******************** CncptMap_SrcUriTyp ********************************************************************************/
		if(conceptmap.hasSourceUriType()) {

			c.addCncptMapSrcUriTyp("\""+conceptmap.getSourceUriType().getValueAsString()+"\"");
		} else {
			c.addCncptMapSrcUriTyp("NULL");
		}


		/******************** CncptMap_Copyright ********************************************************************************/
		if(conceptmap.hasCopyright()) {

			c.addCncptMapCopyright(String.valueOf(conceptmap.getCopyright()));
		} else {
			c.addCncptMapCopyright("NULL");
		}


		/******************** CncptMap_Ttl ********************************************************************************/
		if(conceptmap.hasTitle()) {

			c.addCncptMapTtl(String.valueOf(conceptmap.getTitle()));
		} else {
			c.addCncptMapTtl("NULL");
		}


		/******************** CncptMap_Prpse ********************************************************************************/
		if(conceptmap.hasPurpose()) {

			c.addCncptMapPrpse(String.valueOf(conceptmap.getPurpose()));
		} else {
			c.addCncptMapPrpse("NULL");
		}


		/******************** CncptMap_Url ********************************************************************************/
		if(conceptmap.hasUrl()) {

			c.addCncptMapUrl(String.valueOf(conceptmap.getUrl()));
		} else {
			c.addCncptMapUrl("NULL");
		}


		/******************** conceptmapjurisdiction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> conceptmapjurisdictionlist = conceptmap.getJurisdiction();
		for(int conceptmapjurisdictioni = 0; conceptmapjurisdictioni<conceptmapjurisdictionlist.size();conceptmapjurisdictioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  conceptmapjurisdiction = conceptmapjurisdictionlist.get(conceptmapjurisdictioni);

		/******************** CncptMap_Jrsdctn_Txt ********************************************************************************/
		if(conceptmapjurisdictioni == 0) {c.addCncptMapJrsdctnTxt("[");}
		if(conceptmapjurisdiction.hasText()) {

			c.addCncptMapJrsdctnTxt(String.valueOf(conceptmapjurisdiction.getText()));
		} else {
			c.addCncptMapJrsdctnTxt("NULL");
		}

		if(conceptmapjurisdictioni == conceptmapjurisdictionlist.size()-1) {c.addCncptMapJrsdctnTxt("]");}


		/******************** conceptmapjurisdictioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> conceptmapjurisdictioncodinglist = conceptmapjurisdiction.getCoding();
		for(int conceptmapjurisdictioncodingi = 0; conceptmapjurisdictioncodingi<conceptmapjurisdictioncodinglist.size();conceptmapjurisdictioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  conceptmapjurisdictioncoding = conceptmapjurisdictioncodinglist.get(conceptmapjurisdictioncodingi);

		/******************** CncptMap_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(conceptmapjurisdictioncodingi == 0) {c.addCncptMapJrsdctnCdgDsply("[[");}
		if(conceptmapjurisdictioncoding.hasDisplay()) {

			c.addCncptMapJrsdctnCdgDsply(String.valueOf(conceptmapjurisdictioncoding.getDisplay()));
		} else {
			c.addCncptMapJrsdctnCdgDsply("NULL");
		}

		if(conceptmapjurisdictioncodingi == conceptmapjurisdictioncodinglist.size()-1) {c.addCncptMapJrsdctnCdgDsply("]]");}


		/******************** CncptMap_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(conceptmapjurisdictioncodingi == 0) {c.addCncptMapJrsdctnCdgVrsn("[[");}
		if(conceptmapjurisdictioncoding.hasVersion()) {

			c.addCncptMapJrsdctnCdgVrsn(String.valueOf(conceptmapjurisdictioncoding.getVersion()));
		} else {
			c.addCncptMapJrsdctnCdgVrsn("NULL");
		}

		if(conceptmapjurisdictioncodingi == conceptmapjurisdictioncodinglist.size()-1) {c.addCncptMapJrsdctnCdgVrsn("]]");}


		/******************** CncptMap_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(conceptmapjurisdictioncodingi == 0) {c.addCncptMapJrsdctnCdgCd("[[");}
		if(conceptmapjurisdictioncoding.hasCode()) {

			c.addCncptMapJrsdctnCdgCd(String.valueOf(conceptmapjurisdictioncoding.getCode()));
		} else {
			c.addCncptMapJrsdctnCdgCd("NULL");
		}

		if(conceptmapjurisdictioncodingi == conceptmapjurisdictioncodinglist.size()-1) {c.addCncptMapJrsdctnCdgCd("]]");}


		/******************** CncptMap_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(conceptmapjurisdictioncodingi == 0) {c.addCncptMapJrsdctnCdgUsrSltd("[[");}
		if(conceptmapjurisdictioncoding.hasUserSelected()) {

			c.addCncptMapJrsdctnCdgUsrSltd(String.valueOf(conceptmapjurisdictioncoding.getUserSelected()));
		} else {
			c.addCncptMapJrsdctnCdgUsrSltd("NULL");
		}

		if(conceptmapjurisdictioncodingi == conceptmapjurisdictioncodinglist.size()-1) {c.addCncptMapJrsdctnCdgUsrSltd("]]");}


		/******************** CncptMap_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(conceptmapjurisdictioncodingi == 0) {c.addCncptMapJrsdctnCdgSys("[[");}
		if(conceptmapjurisdictioncoding.hasSystem()) {

			c.addCncptMapJrsdctnCdgSys(String.valueOf(conceptmapjurisdictioncoding.getSystem()));
		} else {
			c.addCncptMapJrsdctnCdgSys("NULL");
		}

		if(conceptmapjurisdictioncodingi == conceptmapjurisdictioncodinglist.size()-1) {c.addCncptMapJrsdctnCdgSys("]]");}


		 };
		 };
		/******************** conceptmapusecontext ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.UsageContext> conceptmapusecontextlist = conceptmap.getUseContext();
		for(int conceptmapusecontexti = 0; conceptmapusecontexti<conceptmapusecontextlist.size();conceptmapusecontexti++ ) {
		org.hl7.fhir.r4.model.UsageContext  conceptmapusecontext = conceptmapusecontextlist.get(conceptmapusecontexti);

		/******************** conceptmapusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding conceptmapusecontextcode = conceptmapusecontext.getCode();

		/******************** CncptMap_UseCntxt_Cd_Dsply ********************************************************************************/
		if(conceptmapusecontexti == 0) {c.addCncptMapUseCntxtCdDsply("[");}
		if(conceptmapusecontextcode.hasDisplay()) {

			c.addCncptMapUseCntxtCdDsply(String.valueOf(conceptmapusecontextcode.getDisplay()));
		} else {
			c.addCncptMapUseCntxtCdDsply("NULL");
		}

		if(conceptmapusecontexti == conceptmapusecontextlist.size()-1) {c.addCncptMapUseCntxtCdDsply("]");}


		/******************** CncptMap_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(conceptmapusecontexti == 0) {c.addCncptMapUseCntxtCdVrsn("[");}
		if(conceptmapusecontextcode.hasVersion()) {

			c.addCncptMapUseCntxtCdVrsn(String.valueOf(conceptmapusecontextcode.getVersion()));
		} else {
			c.addCncptMapUseCntxtCdVrsn("NULL");
		}

		if(conceptmapusecontexti == conceptmapusecontextlist.size()-1) {c.addCncptMapUseCntxtCdVrsn("]");}


		/******************** CncptMap_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(conceptmapusecontexti == 0) {c.addCncptMapUseCntxtCdUsrSltd("[");}
		if(conceptmapusecontextcode.hasUserSelected()) {

			c.addCncptMapUseCntxtCdUsrSltd(String.valueOf(conceptmapusecontextcode.getUserSelected()));
		} else {
			c.addCncptMapUseCntxtCdUsrSltd("NULL");
		}

		if(conceptmapusecontexti == conceptmapusecontextlist.size()-1) {c.addCncptMapUseCntxtCdUsrSltd("]");}


		/******************** CncptMap_UseCntxt_Cd_Sys ********************************************************************************/
		if(conceptmapusecontexti == 0) {c.addCncptMapUseCntxtCdSys("[");}
		if(conceptmapusecontextcode.hasSystem()) {

			c.addCncptMapUseCntxtCdSys(String.valueOf(conceptmapusecontextcode.getSystem()));
		} else {
			c.addCncptMapUseCntxtCdSys("NULL");
		}

		if(conceptmapusecontexti == conceptmapusecontextlist.size()-1) {c.addCncptMapUseCntxtCdSys("]");}


		/******************** CncptMap_UseCntxt_VlRfrnc ********************************************************************************/
		if(conceptmapusecontexti == 0) {c.addCncptMapUseCntxtVlRfrnc("[");}
		if(conceptmapusecontext.hasValueReference()) {

			if(conceptmapusecontext.getValueReference().getReference() != null) {
			c.addCncptMapUseCntxtVlRfrnc(conceptmapusecontext.getValueReference().getReference());
			}
		} else {
			c.addCncptMapUseCntxtVlRfrnc("NULL");
		}

		if(conceptmapusecontexti == conceptmapusecontextlist.size()-1) {c.addCncptMapUseCntxtVlRfrnc("]");}


		/******************** conceptmapusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept conceptmapusecontextvaluecodeableconcept = conceptmapusecontext.getValueCodeableConcept();

		/******************** CncptMap_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(conceptmapusecontexti == 0) {c.addCncptMapUseCntxtVlCdbleCncptTxt("[");}
		if(conceptmapusecontextvaluecodeableconcept.hasText()) {

			c.addCncptMapUseCntxtVlCdbleCncptTxt(String.valueOf(conceptmapusecontextvaluecodeableconcept.getText()));
		} else {
			c.addCncptMapUseCntxtVlCdbleCncptTxt("NULL");
		}

		if(conceptmapusecontexti == conceptmapusecontextlist.size()-1) {c.addCncptMapUseCntxtVlCdbleCncptTxt("]");}


		/******************** conceptmapusecontextvaluecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> conceptmapusecontextvaluecodeableconceptcodinglist = conceptmapusecontextvaluecodeableconcept.getCoding();
		for(int conceptmapusecontextvaluecodeableconceptcodingi = 0; conceptmapusecontextvaluecodeableconceptcodingi<conceptmapusecontextvaluecodeableconceptcodinglist.size();conceptmapusecontextvaluecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  conceptmapusecontextvaluecodeableconceptcoding = conceptmapusecontextvaluecodeableconceptcodinglist.get(conceptmapusecontextvaluecodeableconceptcodingi);

		/******************** CncptMap_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(conceptmapusecontextvaluecodeableconceptcodingi == 0) {c.addCncptMapUseCntxtVlCdbleCncptCdgDsply("[[");}
		if(conceptmapusecontextvaluecodeableconceptcoding.hasDisplay()) {

			c.addCncptMapUseCntxtVlCdbleCncptCdgDsply(String.valueOf(conceptmapusecontextvaluecodeableconceptcoding.getDisplay()));
		} else {
			c.addCncptMapUseCntxtVlCdbleCncptCdgDsply("NULL");
		}

		if(conceptmapusecontextvaluecodeableconceptcodingi == conceptmapusecontextvaluecodeableconceptcodinglist.size()-1) {c.addCncptMapUseCntxtVlCdbleCncptCdgDsply("]]");}


		/******************** CncptMap_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(conceptmapusecontextvaluecodeableconceptcodingi == 0) {c.addCncptMapUseCntxtVlCdbleCncptCdgVrsn("[[");}
		if(conceptmapusecontextvaluecodeableconceptcoding.hasVersion()) {

			c.addCncptMapUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(conceptmapusecontextvaluecodeableconceptcoding.getVersion()));
		} else {
			c.addCncptMapUseCntxtVlCdbleCncptCdgVrsn("NULL");
		}

		if(conceptmapusecontextvaluecodeableconceptcodingi == conceptmapusecontextvaluecodeableconceptcodinglist.size()-1) {c.addCncptMapUseCntxtVlCdbleCncptCdgVrsn("]]");}


		/******************** CncptMap_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(conceptmapusecontextvaluecodeableconceptcodingi == 0) {c.addCncptMapUseCntxtVlCdbleCncptCdgCd("[[");}
		if(conceptmapusecontextvaluecodeableconceptcoding.hasCode()) {

			c.addCncptMapUseCntxtVlCdbleCncptCdgCd(String.valueOf(conceptmapusecontextvaluecodeableconceptcoding.getCode()));
		} else {
			c.addCncptMapUseCntxtVlCdbleCncptCdgCd("NULL");
		}

		if(conceptmapusecontextvaluecodeableconceptcodingi == conceptmapusecontextvaluecodeableconceptcodinglist.size()-1) {c.addCncptMapUseCntxtVlCdbleCncptCdgCd("]]");}


		/******************** CncptMap_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(conceptmapusecontextvaluecodeableconceptcodingi == 0) {c.addCncptMapUseCntxtVlCdbleCncptCdgUsrSltd("[[");}
		if(conceptmapusecontextvaluecodeableconceptcoding.hasUserSelected()) {

			c.addCncptMapUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(conceptmapusecontextvaluecodeableconceptcoding.getUserSelected()));
		} else {
			c.addCncptMapUseCntxtVlCdbleCncptCdgUsrSltd("NULL");
		}

		if(conceptmapusecontextvaluecodeableconceptcodingi == conceptmapusecontextvaluecodeableconceptcodinglist.size()-1) {c.addCncptMapUseCntxtVlCdbleCncptCdgUsrSltd("]]");}


		/******************** CncptMap_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(conceptmapusecontextvaluecodeableconceptcodingi == 0) {c.addCncptMapUseCntxtVlCdbleCncptCdgSys("[[");}
		if(conceptmapusecontextvaluecodeableconceptcoding.hasSystem()) {

			c.addCncptMapUseCntxtVlCdbleCncptCdgSys(String.valueOf(conceptmapusecontextvaluecodeableconceptcoding.getSystem()));
		} else {
			c.addCncptMapUseCntxtVlCdbleCncptCdgSys("NULL");
		}

		if(conceptmapusecontextvaluecodeableconceptcodingi == conceptmapusecontextvaluecodeableconceptcodinglist.size()-1) {c.addCncptMapUseCntxtVlCdbleCncptCdgSys("]]");}


		 };
		/******************** conceptmapusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range conceptmapusecontextvaluerange = conceptmapusecontext.getValueRange();

		/******************** conceptmapusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity conceptmapusecontextvaluerangelow = conceptmapusecontextvaluerange.getLow();

		/******************** CncptMap_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(conceptmapusecontexti == 0) {c.addCncptMapUseCntxtVlRngLwVl("[");}
		if(conceptmapusecontextvaluerangelow.hasValue()) {

			c.addCncptMapUseCntxtVlRngLwVl(String.valueOf(conceptmapusecontextvaluerangelow.getValue()));
		} else {
			c.addCncptMapUseCntxtVlRngLwVl("NULL");
		}

		if(conceptmapusecontexti == conceptmapusecontextlist.size()-1) {c.addCncptMapUseCntxtVlRngLwVl("]");}


		/******************** conceptmapusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator conceptmapusecontextvaluerangelowcomparator = conceptmapusecontextvaluerangelow.getComparator();
		if(conceptmapusecontextvaluerangelowcomparator!=null) {
		if(conceptmapusecontexti == 0) {

		c.addCncptMapUseCntxtVlRngLwCmprtr("[");		}
			c.addCncptMapUseCntxtVlRngLwCmprtr(conceptmapusecontextvaluerangelowcomparator.toCode());
		if(conceptmapusecontexti == conceptmapusecontextlist.size()-1) {

		c.addCncptMapUseCntxtVlRngLwCmprtr("]");		}

		} else {
			c.addCncptMapUseCntxtVlRngLwCmprtr("NULL");
		}

		/******************** CncptMap_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(conceptmapusecontexti == 0) {c.addCncptMapUseCntxtVlRngLwCd("[");}
		if(conceptmapusecontextvaluerangelow.hasCode()) {

			c.addCncptMapUseCntxtVlRngLwCd(String.valueOf(conceptmapusecontextvaluerangelow.getCode()));
		} else {
			c.addCncptMapUseCntxtVlRngLwCd("NULL");
		}

		if(conceptmapusecontexti == conceptmapusecontextlist.size()-1) {c.addCncptMapUseCntxtVlRngLwCd("]");}


		/******************** CncptMap_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(conceptmapusecontexti == 0) {c.addCncptMapUseCntxtVlRngLwUnt("[");}
		if(conceptmapusecontextvaluerangelow.hasUnit()) {

			c.addCncptMapUseCntxtVlRngLwUnt(String.valueOf(conceptmapusecontextvaluerangelow.getUnit()));
		} else {
			c.addCncptMapUseCntxtVlRngLwUnt("NULL");
		}

		if(conceptmapusecontexti == conceptmapusecontextlist.size()-1) {c.addCncptMapUseCntxtVlRngLwUnt("]");}


		/******************** CncptMap_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(conceptmapusecontexti == 0) {c.addCncptMapUseCntxtVlRngLwSys("[");}
		if(conceptmapusecontextvaluerangelow.hasSystem()) {

			c.addCncptMapUseCntxtVlRngLwSys(String.valueOf(conceptmapusecontextvaluerangelow.getSystem()));
		} else {
			c.addCncptMapUseCntxtVlRngLwSys("NULL");
		}

		if(conceptmapusecontexti == conceptmapusecontextlist.size()-1) {c.addCncptMapUseCntxtVlRngLwSys("]");}


		/******************** conceptmapusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity conceptmapusecontextvaluerangehigh = conceptmapusecontextvaluerange.getHigh();

		/******************** CncptMap_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(conceptmapusecontexti == 0) {c.addCncptMapUseCntxtVlRngHiVl("[");}
		if(conceptmapusecontextvaluerangehigh.hasValue()) {

			c.addCncptMapUseCntxtVlRngHiVl(String.valueOf(conceptmapusecontextvaluerangehigh.getValue()));
		} else {
			c.addCncptMapUseCntxtVlRngHiVl("NULL");
		}

		if(conceptmapusecontexti == conceptmapusecontextlist.size()-1) {c.addCncptMapUseCntxtVlRngHiVl("]");}


		/******************** conceptmapusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator conceptmapusecontextvaluerangehighcomparator = conceptmapusecontextvaluerangehigh.getComparator();
		if(conceptmapusecontextvaluerangehighcomparator!=null) {
		if(conceptmapusecontexti == 0) {

		c.addCncptMapUseCntxtVlRngHiCmprtr("[");		}
			c.addCncptMapUseCntxtVlRngHiCmprtr(conceptmapusecontextvaluerangehighcomparator.toCode());
		if(conceptmapusecontexti == conceptmapusecontextlist.size()-1) {

		c.addCncptMapUseCntxtVlRngHiCmprtr("]");		}

		} else {
			c.addCncptMapUseCntxtVlRngHiCmprtr("NULL");
		}

		/******************** CncptMap_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(conceptmapusecontexti == 0) {c.addCncptMapUseCntxtVlRngHiCd("[");}
		if(conceptmapusecontextvaluerangehigh.hasCode()) {

			c.addCncptMapUseCntxtVlRngHiCd(String.valueOf(conceptmapusecontextvaluerangehigh.getCode()));
		} else {
			c.addCncptMapUseCntxtVlRngHiCd("NULL");
		}

		if(conceptmapusecontexti == conceptmapusecontextlist.size()-1) {c.addCncptMapUseCntxtVlRngHiCd("]");}


		/******************** CncptMap_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(conceptmapusecontexti == 0) {c.addCncptMapUseCntxtVlRngHiUnt("[");}
		if(conceptmapusecontextvaluerangehigh.hasUnit()) {

			c.addCncptMapUseCntxtVlRngHiUnt(String.valueOf(conceptmapusecontextvaluerangehigh.getUnit()));
		} else {
			c.addCncptMapUseCntxtVlRngHiUnt("NULL");
		}

		if(conceptmapusecontexti == conceptmapusecontextlist.size()-1) {c.addCncptMapUseCntxtVlRngHiUnt("]");}


		/******************** CncptMap_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(conceptmapusecontexti == 0) {c.addCncptMapUseCntxtVlRngHiSys("[");}
		if(conceptmapusecontextvaluerangehigh.hasSystem()) {

			c.addCncptMapUseCntxtVlRngHiSys(String.valueOf(conceptmapusecontextvaluerangehigh.getSystem()));
		} else {
			c.addCncptMapUseCntxtVlRngHiSys("NULL");
		}

		if(conceptmapusecontexti == conceptmapusecontextlist.size()-1) {c.addCncptMapUseCntxtVlRngHiSys("]");}


		/******************** conceptmapusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity conceptmapusecontextvaluequantity = conceptmapusecontext.getValueQuantity();

		/******************** CncptMap_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(conceptmapusecontexti == 0) {c.addCncptMapUseCntxtVlQntyVl("[");}
		if(conceptmapusecontextvaluequantity.hasValue()) {

			c.addCncptMapUseCntxtVlQntyVl(String.valueOf(conceptmapusecontextvaluequantity.getValue()));
		} else {
			c.addCncptMapUseCntxtVlQntyVl("NULL");
		}

		if(conceptmapusecontexti == conceptmapusecontextlist.size()-1) {c.addCncptMapUseCntxtVlQntyVl("]");}


		/******************** conceptmapusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator conceptmapusecontextvaluequantitycomparator = conceptmapusecontextvaluequantity.getComparator();
		if(conceptmapusecontextvaluequantitycomparator!=null) {
		if(conceptmapusecontexti == 0) {

		c.addCncptMapUseCntxtVlQntyCmprtr("[");		}
			c.addCncptMapUseCntxtVlQntyCmprtr(conceptmapusecontextvaluequantitycomparator.toCode());
		if(conceptmapusecontexti == conceptmapusecontextlist.size()-1) {

		c.addCncptMapUseCntxtVlQntyCmprtr("]");		}

		} else {
			c.addCncptMapUseCntxtVlQntyCmprtr("NULL");
		}

		/******************** CncptMap_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(conceptmapusecontexti == 0) {c.addCncptMapUseCntxtVlQntyCd("[");}
		if(conceptmapusecontextvaluequantity.hasCode()) {

			c.addCncptMapUseCntxtVlQntyCd(String.valueOf(conceptmapusecontextvaluequantity.getCode()));
		} else {
			c.addCncptMapUseCntxtVlQntyCd("NULL");
		}

		if(conceptmapusecontexti == conceptmapusecontextlist.size()-1) {c.addCncptMapUseCntxtVlQntyCd("]");}


		/******************** CncptMap_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(conceptmapusecontexti == 0) {c.addCncptMapUseCntxtVlQntyUnt("[");}
		if(conceptmapusecontextvaluequantity.hasUnit()) {

			c.addCncptMapUseCntxtVlQntyUnt(String.valueOf(conceptmapusecontextvaluequantity.getUnit()));
		} else {
			c.addCncptMapUseCntxtVlQntyUnt("NULL");
		}

		if(conceptmapusecontexti == conceptmapusecontextlist.size()-1) {c.addCncptMapUseCntxtVlQntyUnt("]");}


		/******************** CncptMap_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(conceptmapusecontexti == 0) {c.addCncptMapUseCntxtVlQntySys("[");}
		if(conceptmapusecontextvaluequantity.hasSystem()) {

			c.addCncptMapUseCntxtVlQntySys(String.valueOf(conceptmapusecontextvaluequantity.getSystem()));
		} else {
			c.addCncptMapUseCntxtVlQntySys("NULL");
		}

		if(conceptmapusecontexti == conceptmapusecontextlist.size()-1) {c.addCncptMapUseCntxtVlQntySys("]");}


		 };
		/******************** CncptMap_Exprmtl ********************************************************************************/
		if(conceptmap.hasExperimental()) {

			c.addCncptMapExprmtl(String.valueOf(conceptmap.getExperimental()));
		} else {
			c.addCncptMapExprmtl("NULL");
		}


		/******************** CncptMap_Pblshr ********************************************************************************/
		if(conceptmap.hasPublisher()) {

			c.addCncptMapPblshr(String.valueOf(conceptmap.getPublisher()));
		} else {
			c.addCncptMapPblshr("NULL");
		}


		/******************** CncptMap_TarCanonicalTyp ********************************************************************************/
		if(conceptmap.hasTargetCanonicalType()) {

			c.addCncptMapTarCanonicalTyp("\""+conceptmap.getTargetCanonicalType().getValueAsString()+"\"");
		} else {
			c.addCncptMapTarCanonicalTyp("NULL");
		}


		/******************** CncptMap_SrcCanonicalTyp ********************************************************************************/
		if(conceptmap.hasSourceCanonicalType()) {

			c.addCncptMapSrcCanonicalTyp("\""+conceptmap.getSourceCanonicalType().getValueAsString()+"\"");
		} else {
			c.addCncptMapSrcCanonicalTyp("NULL");
		}


		return c;
	}
}
