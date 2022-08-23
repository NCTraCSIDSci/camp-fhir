package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.StructureDefinition;
public class StructureDefinitionBidirectionalConversion 
{
	public StructureDefinition StructureDefinitions(org.hl7.fhir.r4.model.StructureDefinition structuredefinition) throws ParseException
	{
		 main.java.com.campfhir.model.StructureDefinition s = new  main.java.com.campfhir.model.StructureDefinition();

		/******************** id ********************************************************************************/
		s.setId(structuredefinition.getIdElement().getIdPart());

		/******************** StrctrDfn_Nm ********************************************************************************/
		if(structuredefinition.hasName()) {

			s.addStrctrDfnNm(String.valueOf(structuredefinition.getName()));
		} else {
			s.addStrctrDfnNm("NULL");
		}


		/******************** structuredefinitioncontext ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.StructureDefinition.StructureDefinitionContextComponent> structuredefinitioncontextlist = structuredefinition.getContext();
		for(int structuredefinitioncontexti = 0; structuredefinitioncontexti<structuredefinitioncontextlist.size();structuredefinitioncontexti++ ) {
		org.hl7.fhir.r4.model.StructureDefinition.StructureDefinitionContextComponent  structuredefinitioncontext = structuredefinitioncontextlist.get(structuredefinitioncontexti);

		/******************** structuredefinitioncontexttype ********************************************************************************/
		org.hl7.fhir.r4.model.StructureDefinition.ExtensionContextType structuredefinitioncontexttype = structuredefinitioncontext.getType();
		if(structuredefinitioncontexttype!=null) {
		if(structuredefinitioncontexti == 0) {

		s.addStrctrDfnCntxtTyp("[");		}
			s.addStrctrDfnCntxtTyp(structuredefinitioncontexttype.toCode());
		if(structuredefinitioncontexti == structuredefinitioncontextlist.size()-1) {

		s.addStrctrDfnCntxtTyp("]");		}

		} else {
			s.addStrctrDfnCntxtTyp("NULL");
		}

		/******************** StrctrDfn_Cntxt_Exprsn ********************************************************************************/
		if(structuredefinitioncontexti == 0) {s.addStrctrDfnCntxtExprsn("[");}
		if(structuredefinitioncontext.hasExpression()) {

			s.addStrctrDfnCntxtExprsn(String.valueOf(structuredefinitioncontext.getExpression()));
		} else {
			s.addStrctrDfnCntxtExprsn("NULL");
		}

		if(structuredefinitioncontexti == structuredefinitioncontextlist.size()-1) {s.addStrctrDfnCntxtExprsn("]");}


		 };
		/******************** StrctrDfn_Typ ********************************************************************************/
		if(structuredefinition.hasType()) {

			s.addStrctrDfnTyp(String.valueOf(structuredefinition.getType()));
		} else {
			s.addStrctrDfnTyp("NULL");
		}


		/******************** StrctrDfn_Vrsn ********************************************************************************/
		if(structuredefinition.hasVersion()) {

			s.addStrctrDfnVrsn(String.valueOf(structuredefinition.getVersion()));
		} else {
			s.addStrctrDfnVrsn("NULL");
		}


		/******************** StrctrDfn_Dt ********************************************************************************/
		if(structuredefinition.hasDate()) {

			s.addStrctrDfnDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(structuredefinition.getDate())+"\"");
		} else {
			s.addStrctrDfnDt("NULL");
		}


		/******************** structuredefinitionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus structuredefinitionstatus = structuredefinition.getStatus();
		if(structuredefinitionstatus!=null) {
			s.addStrctrDfnSts(structuredefinitionstatus.toCode());
		} else {
			s.addStrctrDfnSts("NULL");
		}

		/******************** StrctrDfn_Dscrptn ********************************************************************************/
		if(structuredefinition.hasDescription()) {

			s.addStrctrDfnDscrptn(String.valueOf(structuredefinition.getDescription()));
		} else {
			s.addStrctrDfnDscrptn("NULL");
		}


		/******************** structuredefinitionidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> structuredefinitionidentifierlist = structuredefinition.getIdentifier();
		for(int structuredefinitionidentifieri = 0; structuredefinitionidentifieri<structuredefinitionidentifierlist.size();structuredefinitionidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  structuredefinitionidentifier = structuredefinitionidentifierlist.get(structuredefinitionidentifieri);

		/******************** StrctrDfn_Id_Vl ********************************************************************************/
		if(structuredefinitionidentifieri == 0) {s.addStrctrDfnIdVl("[");}
		if(structuredefinitionidentifier.hasValue()) {

			s.addStrctrDfnIdVl(String.valueOf(structuredefinitionidentifier.getValue()));
		} else {
			s.addStrctrDfnIdVl("NULL");
		}

		if(structuredefinitionidentifieri == structuredefinitionidentifierlist.size()-1) {s.addStrctrDfnIdVl("]");}


		/******************** structuredefinitionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept structuredefinitionidentifiertype = structuredefinitionidentifier.getType();

		/******************** StrctrDfn_Id_Typ_Txt ********************************************************************************/
		if(structuredefinitionidentifieri == 0) {s.addStrctrDfnIdTypTxt("[");}
		if(structuredefinitionidentifiertype.hasText()) {

			s.addStrctrDfnIdTypTxt(String.valueOf(structuredefinitionidentifiertype.getText()));
		} else {
			s.addStrctrDfnIdTypTxt("NULL");
		}

		if(structuredefinitionidentifieri == structuredefinitionidentifierlist.size()-1) {s.addStrctrDfnIdTypTxt("]");}


		/******************** structuredefinitionidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> structuredefinitionidentifiertypecodinglist = structuredefinitionidentifiertype.getCoding();
		for(int structuredefinitionidentifiertypecodingi = 0; structuredefinitionidentifiertypecodingi<structuredefinitionidentifiertypecodinglist.size();structuredefinitionidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  structuredefinitionidentifiertypecoding = structuredefinitionidentifiertypecodinglist.get(structuredefinitionidentifiertypecodingi);

		/******************** StrctrDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(structuredefinitionidentifiertypecodingi == 0) {s.addStrctrDfnIdTypCdgDsply("[[");}
		if(structuredefinitionidentifiertypecoding.hasDisplay()) {

			s.addStrctrDfnIdTypCdgDsply(String.valueOf(structuredefinitionidentifiertypecoding.getDisplay()));
		} else {
			s.addStrctrDfnIdTypCdgDsply("NULL");
		}

		if(structuredefinitionidentifiertypecodingi == structuredefinitionidentifiertypecodinglist.size()-1) {s.addStrctrDfnIdTypCdgDsply("]]");}


		/******************** StrctrDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(structuredefinitionidentifiertypecodingi == 0) {s.addStrctrDfnIdTypCdgVrsn("[[");}
		if(structuredefinitionidentifiertypecoding.hasVersion()) {

			s.addStrctrDfnIdTypCdgVrsn(String.valueOf(structuredefinitionidentifiertypecoding.getVersion()));
		} else {
			s.addStrctrDfnIdTypCdgVrsn("NULL");
		}

		if(structuredefinitionidentifiertypecodingi == structuredefinitionidentifiertypecodinglist.size()-1) {s.addStrctrDfnIdTypCdgVrsn("]]");}


		/******************** StrctrDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(structuredefinitionidentifiertypecodingi == 0) {s.addStrctrDfnIdTypCdgCd("[[");}
		if(structuredefinitionidentifiertypecoding.hasCode()) {

			s.addStrctrDfnIdTypCdgCd(String.valueOf(structuredefinitionidentifiertypecoding.getCode()));
		} else {
			s.addStrctrDfnIdTypCdgCd("NULL");
		}

		if(structuredefinitionidentifiertypecodingi == structuredefinitionidentifiertypecodinglist.size()-1) {s.addStrctrDfnIdTypCdgCd("]]");}


		/******************** StrctrDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(structuredefinitionidentifiertypecodingi == 0) {s.addStrctrDfnIdTypCdgUsrSltd("[[");}
		if(structuredefinitionidentifiertypecoding.hasUserSelected()) {

			s.addStrctrDfnIdTypCdgUsrSltd(String.valueOf(structuredefinitionidentifiertypecoding.getUserSelected()));
		} else {
			s.addStrctrDfnIdTypCdgUsrSltd("NULL");
		}

		if(structuredefinitionidentifiertypecodingi == structuredefinitionidentifiertypecodinglist.size()-1) {s.addStrctrDfnIdTypCdgUsrSltd("]]");}


		/******************** StrctrDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(structuredefinitionidentifiertypecodingi == 0) {s.addStrctrDfnIdTypCdgSys("[[");}
		if(structuredefinitionidentifiertypecoding.hasSystem()) {

			s.addStrctrDfnIdTypCdgSys(String.valueOf(structuredefinitionidentifiertypecoding.getSystem()));
		} else {
			s.addStrctrDfnIdTypCdgSys("NULL");
		}

		if(structuredefinitionidentifiertypecodingi == structuredefinitionidentifiertypecodinglist.size()-1) {s.addStrctrDfnIdTypCdgSys("]]");}


		 };
		/******************** structuredefinitionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period structuredefinitionidentifierperiod = structuredefinitionidentifier.getPeriod();

		/******************** StrctrDfn_Id_Prd_Strt ********************************************************************************/
		if(structuredefinitionidentifieri == 0) {s.addStrctrDfnIdPrdStrt("[");}
		if(structuredefinitionidentifierperiod.hasStart()) {

			s.addStrctrDfnIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(structuredefinitionidentifierperiod.getStart())+"\"");
		} else {
			s.addStrctrDfnIdPrdStrt("NULL");
		}

		if(structuredefinitionidentifieri == structuredefinitionidentifierlist.size()-1) {s.addStrctrDfnIdPrdStrt("]");}


		/******************** StrctrDfn_Id_Prd_End ********************************************************************************/
		if(structuredefinitionidentifieri == 0) {s.addStrctrDfnIdPrdEnd("[");}
		if(structuredefinitionidentifierperiod.hasEnd()) {

			s.addStrctrDfnIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(structuredefinitionidentifierperiod.getEnd())+"\"");
		} else {
			s.addStrctrDfnIdPrdEnd("NULL");
		}

		if(structuredefinitionidentifieri == structuredefinitionidentifierlist.size()-1) {s.addStrctrDfnIdPrdEnd("]");}


		/******************** structuredefinitionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse structuredefinitionidentifieruse = structuredefinitionidentifier.getUse();
		if(structuredefinitionidentifieruse!=null) {
		if(structuredefinitionidentifieri == 0) {

		s.addStrctrDfnIdUse("[");		}
			s.addStrctrDfnIdUse(structuredefinitionidentifieruse.toCode());
		if(structuredefinitionidentifieri == structuredefinitionidentifierlist.size()-1) {

		s.addStrctrDfnIdUse("]");		}

		} else {
			s.addStrctrDfnIdUse("NULL");
		}

		/******************** StrctrDfn_Id_Assigner ********************************************************************************/
		if(structuredefinitionidentifieri == 0) {s.addStrctrDfnIdAssigner("[");}
		if(structuredefinitionidentifier.hasAssigner()) {

			if(structuredefinitionidentifier.getAssigner().getReference() != null) {
			s.addStrctrDfnIdAssigner(structuredefinitionidentifier.getAssigner().getReference());
			}
		} else {
			s.addStrctrDfnIdAssigner("NULL");
		}

		if(structuredefinitionidentifieri == structuredefinitionidentifierlist.size()-1) {s.addStrctrDfnIdAssigner("]");}


		/******************** StrctrDfn_Id_Sys ********************************************************************************/
		if(structuredefinitionidentifieri == 0) {s.addStrctrDfnIdSys("[");}
		if(structuredefinitionidentifier.hasSystem()) {

			s.addStrctrDfnIdSys(String.valueOf(structuredefinitionidentifier.getSystem()));
		} else {
			s.addStrctrDfnIdSys("NULL");
		}

		if(structuredefinitionidentifieri == structuredefinitionidentifierlist.size()-1) {s.addStrctrDfnIdSys("]");}


		 };
		/******************** structuredefinitioncontact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> structuredefinitioncontactlist = structuredefinition.getContact();
		for(int structuredefinitioncontacti = 0; structuredefinitioncontacti<structuredefinitioncontactlist.size();structuredefinitioncontacti++ ) {
		org.hl7.fhir.r4.model.ContactDetail  structuredefinitioncontact = structuredefinitioncontactlist.get(structuredefinitioncontacti);

		/******************** StrctrDfn_Cntct_Nm ********************************************************************************/
		if(structuredefinitioncontacti == 0) {s.addStrctrDfnCntctNm("[");}
		if(structuredefinitioncontact.hasName()) {

			s.addStrctrDfnCntctNm(String.valueOf(structuredefinitioncontact.getName()));
		} else {
			s.addStrctrDfnCntctNm("NULL");
		}

		if(structuredefinitioncontacti == structuredefinitioncontactlist.size()-1) {s.addStrctrDfnCntctNm("]");}


		/******************** structuredefinitioncontacttelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> structuredefinitioncontacttelecomlist = structuredefinitioncontact.getTelecom();
		for(int structuredefinitioncontacttelecomi = 0; structuredefinitioncontacttelecomi<structuredefinitioncontacttelecomlist.size();structuredefinitioncontacttelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  structuredefinitioncontacttelecom = structuredefinitioncontacttelecomlist.get(structuredefinitioncontacttelecomi);

		/******************** StrctrDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(structuredefinitioncontacttelecomi == 0) {s.addStrctrDfnCntctTlcmVl("[[");}
		if(structuredefinitioncontacttelecom.hasValue()) {

			s.addStrctrDfnCntctTlcmVl(String.valueOf(structuredefinitioncontacttelecom.getValue()));
		} else {
			s.addStrctrDfnCntctTlcmVl("NULL");
		}

		if(structuredefinitioncontacttelecomi == structuredefinitioncontacttelecomlist.size()-1) {s.addStrctrDfnCntctTlcmVl("]]");}


		/******************** structuredefinitioncontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period structuredefinitioncontacttelecomperiod = structuredefinitioncontacttelecom.getPeriod();

		/******************** StrctrDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(structuredefinitioncontacttelecomi == 0) {s.addStrctrDfnCntctTlcmPrdStrt("[[");}
		if(structuredefinitioncontacttelecomperiod.hasStart()) {

			s.addStrctrDfnCntctTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(structuredefinitioncontacttelecomperiod.getStart())+"\"");
		} else {
			s.addStrctrDfnCntctTlcmPrdStrt("NULL");
		}

		if(structuredefinitioncontacttelecomi == structuredefinitioncontacttelecomlist.size()-1) {s.addStrctrDfnCntctTlcmPrdStrt("]]");}


		/******************** StrctrDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(structuredefinitioncontacttelecomi == 0) {s.addStrctrDfnCntctTlcmPrdEnd("[[");}
		if(structuredefinitioncontacttelecomperiod.hasEnd()) {

			s.addStrctrDfnCntctTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(structuredefinitioncontacttelecomperiod.getEnd())+"\"");
		} else {
			s.addStrctrDfnCntctTlcmPrdEnd("NULL");
		}

		if(structuredefinitioncontacttelecomi == structuredefinitioncontacttelecomlist.size()-1) {s.addStrctrDfnCntctTlcmPrdEnd("]]");}


		/******************** structuredefinitioncontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse structuredefinitioncontacttelecomuse = structuredefinitioncontacttelecom.getUse();
		if(structuredefinitioncontacttelecomuse!=null) {
		if(structuredefinitioncontacttelecomi == 0) {

		s.addStrctrDfnCntctTlcmUse("[[");		}
			s.addStrctrDfnCntctTlcmUse(structuredefinitioncontacttelecomuse.toCode());
		if(structuredefinitioncontacttelecomi == structuredefinitioncontacttelecomlist.size()-1) {

		s.addStrctrDfnCntctTlcmUse("]]");		}

		} else {
			s.addStrctrDfnCntctTlcmUse("NULL");
		}

		/******************** structuredefinitioncontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem structuredefinitioncontacttelecomsystem = structuredefinitioncontacttelecom.getSystem();
		if(structuredefinitioncontacttelecomsystem!=null) {
		if(structuredefinitioncontacttelecomi == 0) {

		s.addStrctrDfnCntctTlcmSys("[[");		}
			s.addStrctrDfnCntctTlcmSys(structuredefinitioncontacttelecomsystem.toCode());
		if(structuredefinitioncontacttelecomi == structuredefinitioncontacttelecomlist.size()-1) {

		s.addStrctrDfnCntctTlcmSys("]]");		}

		} else {
			s.addStrctrDfnCntctTlcmSys("NULL");
		}

		/******************** StrctrDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(structuredefinitioncontacttelecomi == 0) {s.addStrctrDfnCntctTlcmRnk("[[");}
		if(structuredefinitioncontacttelecom.hasRank()) {

			s.addStrctrDfnCntctTlcmRnk(String.valueOf(structuredefinitioncontacttelecom.getRank()));
		} else {
			s.addStrctrDfnCntctTlcmRnk("NULL");
		}

		if(structuredefinitioncontacttelecomi == structuredefinitioncontacttelecomlist.size()-1) {s.addStrctrDfnCntctTlcmRnk("]]");}


		 };
		 };
		/******************** StrctrDfn_Copyright ********************************************************************************/
		if(structuredefinition.hasCopyright()) {

			s.addStrctrDfnCopyright(String.valueOf(structuredefinition.getCopyright()));
		} else {
			s.addStrctrDfnCopyright("NULL");
		}


		/******************** structuredefinitionkind ********************************************************************************/
		org.hl7.fhir.r4.model.StructureDefinition.StructureDefinitionKind structuredefinitionkind = structuredefinition.getKind();
		if(structuredefinitionkind!=null) {
			s.addStrctrDfnKind(structuredefinitionkind.toCode());
		} else {
			s.addStrctrDfnKind("NULL");
		}

		/******************** StrctrDfn_Ttl ********************************************************************************/
		if(structuredefinition.hasTitle()) {

			s.addStrctrDfnTtl(String.valueOf(structuredefinition.getTitle()));
		} else {
			s.addStrctrDfnTtl("NULL");
		}


		/******************** structuredefinitionkeyword ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> structuredefinitionkeywordlist = structuredefinition.getKeyword();
		for(int structuredefinitionkeywordi = 0; structuredefinitionkeywordi<structuredefinitionkeywordlist.size();structuredefinitionkeywordi++ ) {
		org.hl7.fhir.r4.model.Coding  structuredefinitionkeyword = structuredefinitionkeywordlist.get(structuredefinitionkeywordi);

		/******************** StrctrDfn_Keyword_Dsply ********************************************************************************/
		if(structuredefinitionkeywordi == 0) {s.addStrctrDfnKeywordDsply("[");}
		if(structuredefinitionkeyword.hasDisplay()) {

			s.addStrctrDfnKeywordDsply(String.valueOf(structuredefinitionkeyword.getDisplay()));
		} else {
			s.addStrctrDfnKeywordDsply("NULL");
		}

		if(structuredefinitionkeywordi == structuredefinitionkeywordlist.size()-1) {s.addStrctrDfnKeywordDsply("]");}


		/******************** StrctrDfn_Keyword_Vrsn ********************************************************************************/
		if(structuredefinitionkeywordi == 0) {s.addStrctrDfnKeywordVrsn("[");}
		if(structuredefinitionkeyword.hasVersion()) {

			s.addStrctrDfnKeywordVrsn(String.valueOf(structuredefinitionkeyword.getVersion()));
		} else {
			s.addStrctrDfnKeywordVrsn("NULL");
		}

		if(structuredefinitionkeywordi == structuredefinitionkeywordlist.size()-1) {s.addStrctrDfnKeywordVrsn("]");}


		/******************** StrctrDfn_Keyword_Cd ********************************************************************************/
		if(structuredefinitionkeywordi == 0) {s.addStrctrDfnKeywordCd("[");}
		if(structuredefinitionkeyword.hasCode()) {

			s.addStrctrDfnKeywordCd(String.valueOf(structuredefinitionkeyword.getCode()));
		} else {
			s.addStrctrDfnKeywordCd("NULL");
		}

		if(structuredefinitionkeywordi == structuredefinitionkeywordlist.size()-1) {s.addStrctrDfnKeywordCd("]");}


		/******************** StrctrDfn_Keyword_UsrSltd ********************************************************************************/
		if(structuredefinitionkeywordi == 0) {s.addStrctrDfnKeywordUsrSltd("[");}
		if(structuredefinitionkeyword.hasUserSelected()) {

			s.addStrctrDfnKeywordUsrSltd(String.valueOf(structuredefinitionkeyword.getUserSelected()));
		} else {
			s.addStrctrDfnKeywordUsrSltd("NULL");
		}

		if(structuredefinitionkeywordi == structuredefinitionkeywordlist.size()-1) {s.addStrctrDfnKeywordUsrSltd("]");}


		/******************** StrctrDfn_Keyword_Sys ********************************************************************************/
		if(structuredefinitionkeywordi == 0) {s.addStrctrDfnKeywordSys("[");}
		if(structuredefinitionkeyword.hasSystem()) {

			s.addStrctrDfnKeywordSys(String.valueOf(structuredefinitionkeyword.getSystem()));
		} else {
			s.addStrctrDfnKeywordSys("NULL");
		}

		if(structuredefinitionkeywordi == structuredefinitionkeywordlist.size()-1) {s.addStrctrDfnKeywordSys("]");}


		 };
		/******************** StrctrDfn_Prpse ********************************************************************************/
		if(structuredefinition.hasPurpose()) {

			s.addStrctrDfnPrpse(String.valueOf(structuredefinition.getPurpose()));
		} else {
			s.addStrctrDfnPrpse("NULL");
		}


		/******************** StrctrDfn_Url ********************************************************************************/
		if(structuredefinition.hasUrl()) {

			s.addStrctrDfnUrl(String.valueOf(structuredefinition.getUrl()));
		} else {
			s.addStrctrDfnUrl("NULL");
		}


		/******************** structuredefinitionfhirversion ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.FHIRVersion structuredefinitionfhirversion = structuredefinition.getFhirVersion();
		if(structuredefinitionfhirversion!=null) {
			s.addStrctrDfnFhirVrsn(structuredefinitionfhirversion.toCode());
		} else {
			s.addStrctrDfnFhirVrsn("NULL");
		}

		/******************** structuredefinitionmapping ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.StructureDefinition.StructureDefinitionMappingComponent> structuredefinitionmappinglist = structuredefinition.getMapping();
		for(int structuredefinitionmappingi = 0; structuredefinitionmappingi<structuredefinitionmappinglist.size();structuredefinitionmappingi++ ) {
		org.hl7.fhir.r4.model.StructureDefinition.StructureDefinitionMappingComponent  structuredefinitionmapping = structuredefinitionmappinglist.get(structuredefinitionmappingi);

		/******************** StrctrDfn_Mapping_Nm ********************************************************************************/
		if(structuredefinitionmappingi == 0) {s.addStrctrDfnMappingNm("[");}
		if(structuredefinitionmapping.hasName()) {

			s.addStrctrDfnMappingNm(String.valueOf(structuredefinitionmapping.getName()));
		} else {
			s.addStrctrDfnMappingNm("NULL");
		}

		if(structuredefinitionmappingi == structuredefinitionmappinglist.size()-1) {s.addStrctrDfnMappingNm("]");}


		/******************** StrctrDfn_Mapping_Comment ********************************************************************************/
		if(structuredefinitionmappingi == 0) {s.addStrctrDfnMappingComment("[");}
		if(structuredefinitionmapping.hasComment()) {

			s.addStrctrDfnMappingComment(String.valueOf(structuredefinitionmapping.getComment()));
		} else {
			s.addStrctrDfnMappingComment("NULL");
		}

		if(structuredefinitionmappingi == structuredefinitionmappinglist.size()-1) {s.addStrctrDfnMappingComment("]");}


		/******************** StrctrDfn_Mapping_Uri ********************************************************************************/
		if(structuredefinitionmappingi == 0) {s.addStrctrDfnMappingUri("[");}
		if(structuredefinitionmapping.hasUri()) {

			s.addStrctrDfnMappingUri(String.valueOf(structuredefinitionmapping.getUri()));
		} else {
			s.addStrctrDfnMappingUri("NULL");
		}

		if(structuredefinitionmappingi == structuredefinitionmappinglist.size()-1) {s.addStrctrDfnMappingUri("]");}


		/******************** StrctrDfn_Mapping_Identity ********************************************************************************/
		if(structuredefinitionmappingi == 0) {s.addStrctrDfnMappingIdentity("[");}
		if(structuredefinitionmapping.hasIdentity()) {

			s.addStrctrDfnMappingIdentity(String.valueOf(structuredefinitionmapping.getIdentity()));
		} else {
			s.addStrctrDfnMappingIdentity("NULL");
		}

		if(structuredefinitionmappingi == structuredefinitionmappinglist.size()-1) {s.addStrctrDfnMappingIdentity("]");}


		 };
		/******************** StrctrDfn_Abstract ********************************************************************************/
		if(structuredefinition.hasAbstract()) {

			s.addStrctrDfnAbstract(String.valueOf(structuredefinition.getAbstract()));
		} else {
			s.addStrctrDfnAbstract("NULL");
		}


		/******************** structuredefinitionderivation ********************************************************************************/
		org.hl7.fhir.r4.model.StructureDefinition.TypeDerivationRule structuredefinitionderivation = structuredefinition.getDerivation();
		if(structuredefinitionderivation!=null) {
			s.addStrctrDfnDerivation(structuredefinitionderivation.toCode());
		} else {
			s.addStrctrDfnDerivation("NULL");
		}

		/******************** structuredefinitionsnapshot ********************************************************************************/
		org.hl7.fhir.r4.model.StructureDefinition.StructureDefinitionSnapshotComponent structuredefinitionsnapshot = structuredefinition.getSnapshot();

		/******************** structuredefinitiondifferential ********************************************************************************/
		org.hl7.fhir.r4.model.StructureDefinition.StructureDefinitionDifferentialComponent structuredefinitiondifferential = structuredefinition.getDifferential();

		/******************** StrctrDfn_BaseDfn ********************************************************************************/
		if(structuredefinition.hasBaseDefinition()) {

			s.addStrctrDfnBaseDfn(String.valueOf(structuredefinition.getBaseDefinition()));
		} else {
			s.addStrctrDfnBaseDfn("NULL");
		}


		/******************** structuredefinitionjurisdiction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> structuredefinitionjurisdictionlist = structuredefinition.getJurisdiction();
		for(int structuredefinitionjurisdictioni = 0; structuredefinitionjurisdictioni<structuredefinitionjurisdictionlist.size();structuredefinitionjurisdictioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  structuredefinitionjurisdiction = structuredefinitionjurisdictionlist.get(structuredefinitionjurisdictioni);

		/******************** StrctrDfn_Jrsdctn_Txt ********************************************************************************/
		if(structuredefinitionjurisdictioni == 0) {s.addStrctrDfnJrsdctnTxt("[");}
		if(structuredefinitionjurisdiction.hasText()) {

			s.addStrctrDfnJrsdctnTxt(String.valueOf(structuredefinitionjurisdiction.getText()));
		} else {
			s.addStrctrDfnJrsdctnTxt("NULL");
		}

		if(structuredefinitionjurisdictioni == structuredefinitionjurisdictionlist.size()-1) {s.addStrctrDfnJrsdctnTxt("]");}


		/******************** structuredefinitionjurisdictioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> structuredefinitionjurisdictioncodinglist = structuredefinitionjurisdiction.getCoding();
		for(int structuredefinitionjurisdictioncodingi = 0; structuredefinitionjurisdictioncodingi<structuredefinitionjurisdictioncodinglist.size();structuredefinitionjurisdictioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  structuredefinitionjurisdictioncoding = structuredefinitionjurisdictioncodinglist.get(structuredefinitionjurisdictioncodingi);

		/******************** StrctrDfn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(structuredefinitionjurisdictioncodingi == 0) {s.addStrctrDfnJrsdctnCdgDsply("[[");}
		if(structuredefinitionjurisdictioncoding.hasDisplay()) {

			s.addStrctrDfnJrsdctnCdgDsply(String.valueOf(structuredefinitionjurisdictioncoding.getDisplay()));
		} else {
			s.addStrctrDfnJrsdctnCdgDsply("NULL");
		}

		if(structuredefinitionjurisdictioncodingi == structuredefinitionjurisdictioncodinglist.size()-1) {s.addStrctrDfnJrsdctnCdgDsply("]]");}


		/******************** StrctrDfn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(structuredefinitionjurisdictioncodingi == 0) {s.addStrctrDfnJrsdctnCdgVrsn("[[");}
		if(structuredefinitionjurisdictioncoding.hasVersion()) {

			s.addStrctrDfnJrsdctnCdgVrsn(String.valueOf(structuredefinitionjurisdictioncoding.getVersion()));
		} else {
			s.addStrctrDfnJrsdctnCdgVrsn("NULL");
		}

		if(structuredefinitionjurisdictioncodingi == structuredefinitionjurisdictioncodinglist.size()-1) {s.addStrctrDfnJrsdctnCdgVrsn("]]");}


		/******************** StrctrDfn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(structuredefinitionjurisdictioncodingi == 0) {s.addStrctrDfnJrsdctnCdgCd("[[");}
		if(structuredefinitionjurisdictioncoding.hasCode()) {

			s.addStrctrDfnJrsdctnCdgCd(String.valueOf(structuredefinitionjurisdictioncoding.getCode()));
		} else {
			s.addStrctrDfnJrsdctnCdgCd("NULL");
		}

		if(structuredefinitionjurisdictioncodingi == structuredefinitionjurisdictioncodinglist.size()-1) {s.addStrctrDfnJrsdctnCdgCd("]]");}


		/******************** StrctrDfn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(structuredefinitionjurisdictioncodingi == 0) {s.addStrctrDfnJrsdctnCdgUsrSltd("[[");}
		if(structuredefinitionjurisdictioncoding.hasUserSelected()) {

			s.addStrctrDfnJrsdctnCdgUsrSltd(String.valueOf(structuredefinitionjurisdictioncoding.getUserSelected()));
		} else {
			s.addStrctrDfnJrsdctnCdgUsrSltd("NULL");
		}

		if(structuredefinitionjurisdictioncodingi == structuredefinitionjurisdictioncodinglist.size()-1) {s.addStrctrDfnJrsdctnCdgUsrSltd("]]");}


		/******************** StrctrDfn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(structuredefinitionjurisdictioncodingi == 0) {s.addStrctrDfnJrsdctnCdgSys("[[");}
		if(structuredefinitionjurisdictioncoding.hasSystem()) {

			s.addStrctrDfnJrsdctnCdgSys(String.valueOf(structuredefinitionjurisdictioncoding.getSystem()));
		} else {
			s.addStrctrDfnJrsdctnCdgSys("NULL");
		}

		if(structuredefinitionjurisdictioncodingi == structuredefinitionjurisdictioncodinglist.size()-1) {s.addStrctrDfnJrsdctnCdgSys("]]");}


		 };
		 };
		/******************** structuredefinitionusecontext ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.UsageContext> structuredefinitionusecontextlist = structuredefinition.getUseContext();
		for(int structuredefinitionusecontexti = 0; structuredefinitionusecontexti<structuredefinitionusecontextlist.size();structuredefinitionusecontexti++ ) {
		org.hl7.fhir.r4.model.UsageContext  structuredefinitionusecontext = structuredefinitionusecontextlist.get(structuredefinitionusecontexti);

		/******************** structuredefinitionusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding structuredefinitionusecontextcode = structuredefinitionusecontext.getCode();

		/******************** StrctrDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(structuredefinitionusecontexti == 0) {s.addStrctrDfnUseCntxtCdDsply("[");}
		if(structuredefinitionusecontextcode.hasDisplay()) {

			s.addStrctrDfnUseCntxtCdDsply(String.valueOf(structuredefinitionusecontextcode.getDisplay()));
		} else {
			s.addStrctrDfnUseCntxtCdDsply("NULL");
		}

		if(structuredefinitionusecontexti == structuredefinitionusecontextlist.size()-1) {s.addStrctrDfnUseCntxtCdDsply("]");}


		/******************** StrctrDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(structuredefinitionusecontexti == 0) {s.addStrctrDfnUseCntxtCdVrsn("[");}
		if(structuredefinitionusecontextcode.hasVersion()) {

			s.addStrctrDfnUseCntxtCdVrsn(String.valueOf(structuredefinitionusecontextcode.getVersion()));
		} else {
			s.addStrctrDfnUseCntxtCdVrsn("NULL");
		}

		if(structuredefinitionusecontexti == structuredefinitionusecontextlist.size()-1) {s.addStrctrDfnUseCntxtCdVrsn("]");}


		/******************** StrctrDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(structuredefinitionusecontexti == 0) {s.addStrctrDfnUseCntxtCdUsrSltd("[");}
		if(structuredefinitionusecontextcode.hasUserSelected()) {

			s.addStrctrDfnUseCntxtCdUsrSltd(String.valueOf(structuredefinitionusecontextcode.getUserSelected()));
		} else {
			s.addStrctrDfnUseCntxtCdUsrSltd("NULL");
		}

		if(structuredefinitionusecontexti == structuredefinitionusecontextlist.size()-1) {s.addStrctrDfnUseCntxtCdUsrSltd("]");}


		/******************** StrctrDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(structuredefinitionusecontexti == 0) {s.addStrctrDfnUseCntxtCdSys("[");}
		if(structuredefinitionusecontextcode.hasSystem()) {

			s.addStrctrDfnUseCntxtCdSys(String.valueOf(structuredefinitionusecontextcode.getSystem()));
		} else {
			s.addStrctrDfnUseCntxtCdSys("NULL");
		}

		if(structuredefinitionusecontexti == structuredefinitionusecontextlist.size()-1) {s.addStrctrDfnUseCntxtCdSys("]");}


		/******************** StrctrDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(structuredefinitionusecontexti == 0) {s.addStrctrDfnUseCntxtVlRfrnc("[");}
		if(structuredefinitionusecontext.hasValueReference()) {

			if(structuredefinitionusecontext.getValueReference().getReference() != null) {
			s.addStrctrDfnUseCntxtVlRfrnc(structuredefinitionusecontext.getValueReference().getReference());
			}
		} else {
			s.addStrctrDfnUseCntxtVlRfrnc("NULL");
		}

		if(structuredefinitionusecontexti == structuredefinitionusecontextlist.size()-1) {s.addStrctrDfnUseCntxtVlRfrnc("]");}


		/******************** structuredefinitionusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept structuredefinitionusecontextvaluecodeableconcept = structuredefinitionusecontext.getValueCodeableConcept();

		/******************** StrctrDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(structuredefinitionusecontexti == 0) {s.addStrctrDfnUseCntxtVlCdbleCncptTxt("[");}
		if(structuredefinitionusecontextvaluecodeableconcept.hasText()) {

			s.addStrctrDfnUseCntxtVlCdbleCncptTxt(String.valueOf(structuredefinitionusecontextvaluecodeableconcept.getText()));
		} else {
			s.addStrctrDfnUseCntxtVlCdbleCncptTxt("NULL");
		}

		if(structuredefinitionusecontexti == structuredefinitionusecontextlist.size()-1) {s.addStrctrDfnUseCntxtVlCdbleCncptTxt("]");}


		/******************** structuredefinitionusecontextvaluecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> structuredefinitionusecontextvaluecodeableconceptcodinglist = structuredefinitionusecontextvaluecodeableconcept.getCoding();
		for(int structuredefinitionusecontextvaluecodeableconceptcodingi = 0; structuredefinitionusecontextvaluecodeableconceptcodingi<structuredefinitionusecontextvaluecodeableconceptcodinglist.size();structuredefinitionusecontextvaluecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  structuredefinitionusecontextvaluecodeableconceptcoding = structuredefinitionusecontextvaluecodeableconceptcodinglist.get(structuredefinitionusecontextvaluecodeableconceptcodingi);

		/******************** StrctrDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(structuredefinitionusecontextvaluecodeableconceptcodingi == 0) {s.addStrctrDfnUseCntxtVlCdbleCncptCdgDsply("[[");}
		if(structuredefinitionusecontextvaluecodeableconceptcoding.hasDisplay()) {

			s.addStrctrDfnUseCntxtVlCdbleCncptCdgDsply(String.valueOf(structuredefinitionusecontextvaluecodeableconceptcoding.getDisplay()));
		} else {
			s.addStrctrDfnUseCntxtVlCdbleCncptCdgDsply("NULL");
		}

		if(structuredefinitionusecontextvaluecodeableconceptcodingi == structuredefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {s.addStrctrDfnUseCntxtVlCdbleCncptCdgDsply("]]");}


		/******************** StrctrDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(structuredefinitionusecontextvaluecodeableconceptcodingi == 0) {s.addStrctrDfnUseCntxtVlCdbleCncptCdgVrsn("[[");}
		if(structuredefinitionusecontextvaluecodeableconceptcoding.hasVersion()) {

			s.addStrctrDfnUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(structuredefinitionusecontextvaluecodeableconceptcoding.getVersion()));
		} else {
			s.addStrctrDfnUseCntxtVlCdbleCncptCdgVrsn("NULL");
		}

		if(structuredefinitionusecontextvaluecodeableconceptcodingi == structuredefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {s.addStrctrDfnUseCntxtVlCdbleCncptCdgVrsn("]]");}


		/******************** StrctrDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(structuredefinitionusecontextvaluecodeableconceptcodingi == 0) {s.addStrctrDfnUseCntxtVlCdbleCncptCdgCd("[[");}
		if(structuredefinitionusecontextvaluecodeableconceptcoding.hasCode()) {

			s.addStrctrDfnUseCntxtVlCdbleCncptCdgCd(String.valueOf(structuredefinitionusecontextvaluecodeableconceptcoding.getCode()));
		} else {
			s.addStrctrDfnUseCntxtVlCdbleCncptCdgCd("NULL");
		}

		if(structuredefinitionusecontextvaluecodeableconceptcodingi == structuredefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {s.addStrctrDfnUseCntxtVlCdbleCncptCdgCd("]]");}


		/******************** StrctrDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(structuredefinitionusecontextvaluecodeableconceptcodingi == 0) {s.addStrctrDfnUseCntxtVlCdbleCncptCdgUsrSltd("[[");}
		if(structuredefinitionusecontextvaluecodeableconceptcoding.hasUserSelected()) {

			s.addStrctrDfnUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(structuredefinitionusecontextvaluecodeableconceptcoding.getUserSelected()));
		} else {
			s.addStrctrDfnUseCntxtVlCdbleCncptCdgUsrSltd("NULL");
		}

		if(structuredefinitionusecontextvaluecodeableconceptcodingi == structuredefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {s.addStrctrDfnUseCntxtVlCdbleCncptCdgUsrSltd("]]");}


		/******************** StrctrDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(structuredefinitionusecontextvaluecodeableconceptcodingi == 0) {s.addStrctrDfnUseCntxtVlCdbleCncptCdgSys("[[");}
		if(structuredefinitionusecontextvaluecodeableconceptcoding.hasSystem()) {

			s.addStrctrDfnUseCntxtVlCdbleCncptCdgSys(String.valueOf(structuredefinitionusecontextvaluecodeableconceptcoding.getSystem()));
		} else {
			s.addStrctrDfnUseCntxtVlCdbleCncptCdgSys("NULL");
		}

		if(structuredefinitionusecontextvaluecodeableconceptcodingi == structuredefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {s.addStrctrDfnUseCntxtVlCdbleCncptCdgSys("]]");}


		 };
		/******************** structuredefinitionusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range structuredefinitionusecontextvaluerange = structuredefinitionusecontext.getValueRange();

		/******************** structuredefinitionusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity structuredefinitionusecontextvaluerangelow = structuredefinitionusecontextvaluerange.getLow();

		/******************** StrctrDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(structuredefinitionusecontexti == 0) {s.addStrctrDfnUseCntxtVlRngLwVl("[");}
		if(structuredefinitionusecontextvaluerangelow.hasValue()) {

			s.addStrctrDfnUseCntxtVlRngLwVl(String.valueOf(structuredefinitionusecontextvaluerangelow.getValue()));
		} else {
			s.addStrctrDfnUseCntxtVlRngLwVl("NULL");
		}

		if(structuredefinitionusecontexti == structuredefinitionusecontextlist.size()-1) {s.addStrctrDfnUseCntxtVlRngLwVl("]");}


		/******************** structuredefinitionusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator structuredefinitionusecontextvaluerangelowcomparator = structuredefinitionusecontextvaluerangelow.getComparator();
		if(structuredefinitionusecontextvaluerangelowcomparator!=null) {
		if(structuredefinitionusecontexti == 0) {

		s.addStrctrDfnUseCntxtVlRngLwCmprtr("[");		}
			s.addStrctrDfnUseCntxtVlRngLwCmprtr(structuredefinitionusecontextvaluerangelowcomparator.toCode());
		if(structuredefinitionusecontexti == structuredefinitionusecontextlist.size()-1) {

		s.addStrctrDfnUseCntxtVlRngLwCmprtr("]");		}

		} else {
			s.addStrctrDfnUseCntxtVlRngLwCmprtr("NULL");
		}

		/******************** StrctrDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(structuredefinitionusecontexti == 0) {s.addStrctrDfnUseCntxtVlRngLwCd("[");}
		if(structuredefinitionusecontextvaluerangelow.hasCode()) {

			s.addStrctrDfnUseCntxtVlRngLwCd(String.valueOf(structuredefinitionusecontextvaluerangelow.getCode()));
		} else {
			s.addStrctrDfnUseCntxtVlRngLwCd("NULL");
		}

		if(structuredefinitionusecontexti == structuredefinitionusecontextlist.size()-1) {s.addStrctrDfnUseCntxtVlRngLwCd("]");}


		/******************** StrctrDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(structuredefinitionusecontexti == 0) {s.addStrctrDfnUseCntxtVlRngLwUnt("[");}
		if(structuredefinitionusecontextvaluerangelow.hasUnit()) {

			s.addStrctrDfnUseCntxtVlRngLwUnt(String.valueOf(structuredefinitionusecontextvaluerangelow.getUnit()));
		} else {
			s.addStrctrDfnUseCntxtVlRngLwUnt("NULL");
		}

		if(structuredefinitionusecontexti == structuredefinitionusecontextlist.size()-1) {s.addStrctrDfnUseCntxtVlRngLwUnt("]");}


		/******************** StrctrDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(structuredefinitionusecontexti == 0) {s.addStrctrDfnUseCntxtVlRngLwSys("[");}
		if(structuredefinitionusecontextvaluerangelow.hasSystem()) {

			s.addStrctrDfnUseCntxtVlRngLwSys(String.valueOf(structuredefinitionusecontextvaluerangelow.getSystem()));
		} else {
			s.addStrctrDfnUseCntxtVlRngLwSys("NULL");
		}

		if(structuredefinitionusecontexti == structuredefinitionusecontextlist.size()-1) {s.addStrctrDfnUseCntxtVlRngLwSys("]");}


		/******************** structuredefinitionusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity structuredefinitionusecontextvaluerangehigh = structuredefinitionusecontextvaluerange.getHigh();

		/******************** StrctrDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(structuredefinitionusecontexti == 0) {s.addStrctrDfnUseCntxtVlRngHiVl("[");}
		if(structuredefinitionusecontextvaluerangehigh.hasValue()) {

			s.addStrctrDfnUseCntxtVlRngHiVl(String.valueOf(structuredefinitionusecontextvaluerangehigh.getValue()));
		} else {
			s.addStrctrDfnUseCntxtVlRngHiVl("NULL");
		}

		if(structuredefinitionusecontexti == structuredefinitionusecontextlist.size()-1) {s.addStrctrDfnUseCntxtVlRngHiVl("]");}


		/******************** structuredefinitionusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator structuredefinitionusecontextvaluerangehighcomparator = structuredefinitionusecontextvaluerangehigh.getComparator();
		if(structuredefinitionusecontextvaluerangehighcomparator!=null) {
		if(structuredefinitionusecontexti == 0) {

		s.addStrctrDfnUseCntxtVlRngHiCmprtr("[");		}
			s.addStrctrDfnUseCntxtVlRngHiCmprtr(structuredefinitionusecontextvaluerangehighcomparator.toCode());
		if(structuredefinitionusecontexti == structuredefinitionusecontextlist.size()-1) {

		s.addStrctrDfnUseCntxtVlRngHiCmprtr("]");		}

		} else {
			s.addStrctrDfnUseCntxtVlRngHiCmprtr("NULL");
		}

		/******************** StrctrDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(structuredefinitionusecontexti == 0) {s.addStrctrDfnUseCntxtVlRngHiCd("[");}
		if(structuredefinitionusecontextvaluerangehigh.hasCode()) {

			s.addStrctrDfnUseCntxtVlRngHiCd(String.valueOf(structuredefinitionusecontextvaluerangehigh.getCode()));
		} else {
			s.addStrctrDfnUseCntxtVlRngHiCd("NULL");
		}

		if(structuredefinitionusecontexti == structuredefinitionusecontextlist.size()-1) {s.addStrctrDfnUseCntxtVlRngHiCd("]");}


		/******************** StrctrDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(structuredefinitionusecontexti == 0) {s.addStrctrDfnUseCntxtVlRngHiUnt("[");}
		if(structuredefinitionusecontextvaluerangehigh.hasUnit()) {

			s.addStrctrDfnUseCntxtVlRngHiUnt(String.valueOf(structuredefinitionusecontextvaluerangehigh.getUnit()));
		} else {
			s.addStrctrDfnUseCntxtVlRngHiUnt("NULL");
		}

		if(structuredefinitionusecontexti == structuredefinitionusecontextlist.size()-1) {s.addStrctrDfnUseCntxtVlRngHiUnt("]");}


		/******************** StrctrDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(structuredefinitionusecontexti == 0) {s.addStrctrDfnUseCntxtVlRngHiSys("[");}
		if(structuredefinitionusecontextvaluerangehigh.hasSystem()) {

			s.addStrctrDfnUseCntxtVlRngHiSys(String.valueOf(structuredefinitionusecontextvaluerangehigh.getSystem()));
		} else {
			s.addStrctrDfnUseCntxtVlRngHiSys("NULL");
		}

		if(structuredefinitionusecontexti == structuredefinitionusecontextlist.size()-1) {s.addStrctrDfnUseCntxtVlRngHiSys("]");}


		/******************** structuredefinitionusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity structuredefinitionusecontextvaluequantity = structuredefinitionusecontext.getValueQuantity();

		/******************** StrctrDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(structuredefinitionusecontexti == 0) {s.addStrctrDfnUseCntxtVlQntyVl("[");}
		if(structuredefinitionusecontextvaluequantity.hasValue()) {

			s.addStrctrDfnUseCntxtVlQntyVl(String.valueOf(structuredefinitionusecontextvaluequantity.getValue()));
		} else {
			s.addStrctrDfnUseCntxtVlQntyVl("NULL");
		}

		if(structuredefinitionusecontexti == structuredefinitionusecontextlist.size()-1) {s.addStrctrDfnUseCntxtVlQntyVl("]");}


		/******************** structuredefinitionusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator structuredefinitionusecontextvaluequantitycomparator = structuredefinitionusecontextvaluequantity.getComparator();
		if(structuredefinitionusecontextvaluequantitycomparator!=null) {
		if(structuredefinitionusecontexti == 0) {

		s.addStrctrDfnUseCntxtVlQntyCmprtr("[");		}
			s.addStrctrDfnUseCntxtVlQntyCmprtr(structuredefinitionusecontextvaluequantitycomparator.toCode());
		if(structuredefinitionusecontexti == structuredefinitionusecontextlist.size()-1) {

		s.addStrctrDfnUseCntxtVlQntyCmprtr("]");		}

		} else {
			s.addStrctrDfnUseCntxtVlQntyCmprtr("NULL");
		}

		/******************** StrctrDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(structuredefinitionusecontexti == 0) {s.addStrctrDfnUseCntxtVlQntyCd("[");}
		if(structuredefinitionusecontextvaluequantity.hasCode()) {

			s.addStrctrDfnUseCntxtVlQntyCd(String.valueOf(structuredefinitionusecontextvaluequantity.getCode()));
		} else {
			s.addStrctrDfnUseCntxtVlQntyCd("NULL");
		}

		if(structuredefinitionusecontexti == structuredefinitionusecontextlist.size()-1) {s.addStrctrDfnUseCntxtVlQntyCd("]");}


		/******************** StrctrDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(structuredefinitionusecontexti == 0) {s.addStrctrDfnUseCntxtVlQntyUnt("[");}
		if(structuredefinitionusecontextvaluequantity.hasUnit()) {

			s.addStrctrDfnUseCntxtVlQntyUnt(String.valueOf(structuredefinitionusecontextvaluequantity.getUnit()));
		} else {
			s.addStrctrDfnUseCntxtVlQntyUnt("NULL");
		}

		if(structuredefinitionusecontexti == structuredefinitionusecontextlist.size()-1) {s.addStrctrDfnUseCntxtVlQntyUnt("]");}


		/******************** StrctrDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(structuredefinitionusecontexti == 0) {s.addStrctrDfnUseCntxtVlQntySys("[");}
		if(structuredefinitionusecontextvaluequantity.hasSystem()) {

			s.addStrctrDfnUseCntxtVlQntySys(String.valueOf(structuredefinitionusecontextvaluequantity.getSystem()));
		} else {
			s.addStrctrDfnUseCntxtVlQntySys("NULL");
		}

		if(structuredefinitionusecontexti == structuredefinitionusecontextlist.size()-1) {s.addStrctrDfnUseCntxtVlQntySys("]");}


		 };
		/******************** StrctrDfn_Exprmtl ********************************************************************************/
		if(structuredefinition.hasExperimental()) {

			s.addStrctrDfnExprmtl(String.valueOf(structuredefinition.getExperimental()));
		} else {
			s.addStrctrDfnExprmtl("NULL");
		}


		/******************** StrctrDfn_Pblshr ********************************************************************************/
		if(structuredefinition.hasPublisher()) {

			s.addStrctrDfnPblshr(String.valueOf(structuredefinition.getPublisher()));
		} else {
			s.addStrctrDfnPblshr("NULL");
		}


		/******************** StrctrDfn_CntxtInvariant ********************************************************************************/
		if(structuredefinition.hasContextInvariant()) {

			String  array = "[";
			for(int incr=0; incr<structuredefinition.getContextInvariant().size(); incr++) {
				array = array + structuredefinition.getContextInvariant().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			s.addStrctrDfnCntxtInvariant(array);

		} else {
			s.addStrctrDfnCntxtInvariant("NULL");
		}


		return s;
	}
}
