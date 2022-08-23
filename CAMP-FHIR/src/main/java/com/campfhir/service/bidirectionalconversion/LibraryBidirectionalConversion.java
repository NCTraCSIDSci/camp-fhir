package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Library;
public class LibraryBidirectionalConversion 
{
	public Library Librarys(org.hl7.fhir.r4.model.Library library) throws ParseException
	{
		 main.java.com.campfhir.model.Library l = new  main.java.com.campfhir.model.Library();

		/******************** id ********************************************************************************/
		l.setId(library.getIdElement().getIdPart());

		/******************** Library_Nm ********************************************************************************/
		if(library.hasName()) {

			l.addLibraryNm(String.valueOf(library.getName()));
		} else {
			l.addLibraryNm("NULL");
		}


		/******************** librarytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept librarytype = library.getType();

		/******************** Library_Typ_Txt ********************************************************************************/
		if(librarytype.hasText()) {

			l.addLibraryTypTxt(String.valueOf(librarytype.getText()));
		} else {
			l.addLibraryTypTxt("NULL");
		}


		/******************** librarytypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> librarytypecodinglist = librarytype.getCoding();
		for(int librarytypecodingi = 0; librarytypecodingi<librarytypecodinglist.size();librarytypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  librarytypecoding = librarytypecodinglist.get(librarytypecodingi);

		/******************** Library_Typ_Cdg_Dsply ********************************************************************************/
		if(librarytypecodingi == 0) {l.addLibraryTypCdgDsply("[");}
		if(librarytypecoding.hasDisplay()) {

			l.addLibraryTypCdgDsply(String.valueOf(librarytypecoding.getDisplay()));
		} else {
			l.addLibraryTypCdgDsply("NULL");
		}

		if(librarytypecodingi == librarytypecodinglist.size()-1) {l.addLibraryTypCdgDsply("]");}


		/******************** Library_Typ_Cdg_Vrsn ********************************************************************************/
		if(librarytypecodingi == 0) {l.addLibraryTypCdgVrsn("[");}
		if(librarytypecoding.hasVersion()) {

			l.addLibraryTypCdgVrsn(String.valueOf(librarytypecoding.getVersion()));
		} else {
			l.addLibraryTypCdgVrsn("NULL");
		}

		if(librarytypecodingi == librarytypecodinglist.size()-1) {l.addLibraryTypCdgVrsn("]");}


		/******************** Library_Typ_Cdg_Cd ********************************************************************************/
		if(librarytypecodingi == 0) {l.addLibraryTypCdgCd("[");}
		if(librarytypecoding.hasCode()) {

			l.addLibraryTypCdgCd(String.valueOf(librarytypecoding.getCode()));
		} else {
			l.addLibraryTypCdgCd("NULL");
		}

		if(librarytypecodingi == librarytypecodinglist.size()-1) {l.addLibraryTypCdgCd("]");}


		/******************** Library_Typ_Cdg_UsrSltd ********************************************************************************/
		if(librarytypecodingi == 0) {l.addLibraryTypCdgUsrSltd("[");}
		if(librarytypecoding.hasUserSelected()) {

			l.addLibraryTypCdgUsrSltd(String.valueOf(librarytypecoding.getUserSelected()));
		} else {
			l.addLibraryTypCdgUsrSltd("NULL");
		}

		if(librarytypecodingi == librarytypecodinglist.size()-1) {l.addLibraryTypCdgUsrSltd("]");}


		/******************** Library_Typ_Cdg_Sys ********************************************************************************/
		if(librarytypecodingi == 0) {l.addLibraryTypCdgSys("[");}
		if(librarytypecoding.hasSystem()) {

			l.addLibraryTypCdgSys(String.valueOf(librarytypecoding.getSystem()));
		} else {
			l.addLibraryTypCdgSys("NULL");
		}

		if(librarytypecodingi == librarytypecodinglist.size()-1) {l.addLibraryTypCdgSys("]");}


		 };
		/******************** librarycontent ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Attachment> librarycontentlist = library.getContent();
		for(int librarycontenti = 0; librarycontenti<librarycontentlist.size();librarycontenti++ ) {
		org.hl7.fhir.r4.model.Attachment  librarycontent = librarycontentlist.get(librarycontenti);

		/******************** Library_Cntnt_Sz ********************************************************************************/
		if(librarycontenti == 0) {l.addLibraryCntntSz("[");}
		if(librarycontent.hasSize()) {

			l.addLibraryCntntSz(String.valueOf(librarycontent.getSize()));
		} else {
			l.addLibraryCntntSz("NULL");
		}

		if(librarycontenti == librarycontentlist.size()-1) {l.addLibraryCntntSz("]");}


		/******************** Library_Cntnt_Lnguage ********************************************************************************/
		if(librarycontenti == 0) {l.addLibraryCntntLnguage("[");}
		if(librarycontent.hasLanguage()) {

			l.addLibraryCntntLnguage(String.valueOf(librarycontent.getLanguage()));
		} else {
			l.addLibraryCntntLnguage("NULL");
		}

		if(librarycontenti == librarycontentlist.size()-1) {l.addLibraryCntntLnguage("]");}


		/******************** Library_Cntnt_Hash ********************************************************************************/
		if(librarycontenti == 0) {l.addLibraryCntntHash("[");}
		if(librarycontent.hasHash()) {

			l.addLibraryCntntHash(new String(librarycontent.getHash()));
		} else {
			l.addLibraryCntntHash("NULL");
		}

		if(librarycontenti == librarycontentlist.size()-1) {l.addLibraryCntntHash("]");}


		/******************** Library_Cntnt_Data ********************************************************************************/
		if(librarycontenti == 0) {l.addLibraryCntntData("[");}
		if(librarycontent.hasData()) {

			l.addLibraryCntntData(new String(librarycontent.getData()));
		} else {
			l.addLibraryCntntData("NULL");
		}

		if(librarycontenti == librarycontentlist.size()-1) {l.addLibraryCntntData("]");}


		/******************** Library_Cntnt_Creation ********************************************************************************/
		if(librarycontenti == 0) {l.addLibraryCntntCreation("[");}
		if(librarycontent.hasCreation()) {

			l.addLibraryCntntCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(librarycontent.getCreation())+"\"");
		} else {
			l.addLibraryCntntCreation("NULL");
		}

		if(librarycontenti == librarycontentlist.size()-1) {l.addLibraryCntntCreation("]");}


		/******************** Library_Cntnt_Ttl ********************************************************************************/
		if(librarycontenti == 0) {l.addLibraryCntntTtl("[");}
		if(librarycontent.hasTitle()) {

			l.addLibraryCntntTtl(String.valueOf(librarycontent.getTitle()));
		} else {
			l.addLibraryCntntTtl("NULL");
		}

		if(librarycontenti == librarycontentlist.size()-1) {l.addLibraryCntntTtl("]");}


		/******************** Library_Cntnt_Url ********************************************************************************/
		if(librarycontenti == 0) {l.addLibraryCntntUrl("[");}
		if(librarycontent.hasUrl()) {

			l.addLibraryCntntUrl(String.valueOf(librarycontent.getUrl()));
		} else {
			l.addLibraryCntntUrl("NULL");
		}

		if(librarycontenti == librarycontentlist.size()-1) {l.addLibraryCntntUrl("]");}


		 };
		/******************** Library_Vrsn ********************************************************************************/
		if(library.hasVersion()) {

			l.addLibraryVrsn(String.valueOf(library.getVersion()));
		} else {
			l.addLibraryVrsn("NULL");
		}


		/******************** Library_Dt ********************************************************************************/
		if(library.hasDate()) {

			l.addLibraryDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(library.getDate())+"\"");
		} else {
			l.addLibraryDt("NULL");
		}


		/******************** librarystatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus librarystatus = library.getStatus();
		if(librarystatus!=null) {
			l.addLibrarySts(librarystatus.toCode());
		} else {
			l.addLibrarySts("NULL");
		}

		/******************** Library_Dscrptn ********************************************************************************/
		if(library.hasDescription()) {

			l.addLibraryDscrptn(String.valueOf(library.getDescription()));
		} else {
			l.addLibraryDscrptn("NULL");
		}


		/******************** libraryidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> libraryidentifierlist = library.getIdentifier();
		for(int libraryidentifieri = 0; libraryidentifieri<libraryidentifierlist.size();libraryidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  libraryidentifier = libraryidentifierlist.get(libraryidentifieri);

		/******************** Library_Id_Vl ********************************************************************************/
		if(libraryidentifieri == 0) {l.addLibraryIdVl("[");}
		if(libraryidentifier.hasValue()) {

			l.addLibraryIdVl(String.valueOf(libraryidentifier.getValue()));
		} else {
			l.addLibraryIdVl("NULL");
		}

		if(libraryidentifieri == libraryidentifierlist.size()-1) {l.addLibraryIdVl("]");}


		/******************** libraryidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept libraryidentifiertype = libraryidentifier.getType();

		/******************** Library_Id_Typ_Txt ********************************************************************************/
		if(libraryidentifieri == 0) {l.addLibraryIdTypTxt("[");}
		if(libraryidentifiertype.hasText()) {

			l.addLibraryIdTypTxt(String.valueOf(libraryidentifiertype.getText()));
		} else {
			l.addLibraryIdTypTxt("NULL");
		}

		if(libraryidentifieri == libraryidentifierlist.size()-1) {l.addLibraryIdTypTxt("]");}


		/******************** libraryidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> libraryidentifiertypecodinglist = libraryidentifiertype.getCoding();
		for(int libraryidentifiertypecodingi = 0; libraryidentifiertypecodingi<libraryidentifiertypecodinglist.size();libraryidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  libraryidentifiertypecoding = libraryidentifiertypecodinglist.get(libraryidentifiertypecodingi);

		/******************** Library_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(libraryidentifiertypecodingi == 0) {l.addLibraryIdTypCdgDsply("[[");}
		if(libraryidentifiertypecoding.hasDisplay()) {

			l.addLibraryIdTypCdgDsply(String.valueOf(libraryidentifiertypecoding.getDisplay()));
		} else {
			l.addLibraryIdTypCdgDsply("NULL");
		}

		if(libraryidentifiertypecodingi == libraryidentifiertypecodinglist.size()-1) {l.addLibraryIdTypCdgDsply("]]");}


		/******************** Library_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(libraryidentifiertypecodingi == 0) {l.addLibraryIdTypCdgVrsn("[[");}
		if(libraryidentifiertypecoding.hasVersion()) {

			l.addLibraryIdTypCdgVrsn(String.valueOf(libraryidentifiertypecoding.getVersion()));
		} else {
			l.addLibraryIdTypCdgVrsn("NULL");
		}

		if(libraryidentifiertypecodingi == libraryidentifiertypecodinglist.size()-1) {l.addLibraryIdTypCdgVrsn("]]");}


		/******************** Library_Id_Typ_Cdg_Cd ********************************************************************************/
		if(libraryidentifiertypecodingi == 0) {l.addLibraryIdTypCdgCd("[[");}
		if(libraryidentifiertypecoding.hasCode()) {

			l.addLibraryIdTypCdgCd(String.valueOf(libraryidentifiertypecoding.getCode()));
		} else {
			l.addLibraryIdTypCdgCd("NULL");
		}

		if(libraryidentifiertypecodingi == libraryidentifiertypecodinglist.size()-1) {l.addLibraryIdTypCdgCd("]]");}


		/******************** Library_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(libraryidentifiertypecodingi == 0) {l.addLibraryIdTypCdgUsrSltd("[[");}
		if(libraryidentifiertypecoding.hasUserSelected()) {

			l.addLibraryIdTypCdgUsrSltd(String.valueOf(libraryidentifiertypecoding.getUserSelected()));
		} else {
			l.addLibraryIdTypCdgUsrSltd("NULL");
		}

		if(libraryidentifiertypecodingi == libraryidentifiertypecodinglist.size()-1) {l.addLibraryIdTypCdgUsrSltd("]]");}


		/******************** Library_Id_Typ_Cdg_Sys ********************************************************************************/
		if(libraryidentifiertypecodingi == 0) {l.addLibraryIdTypCdgSys("[[");}
		if(libraryidentifiertypecoding.hasSystem()) {

			l.addLibraryIdTypCdgSys(String.valueOf(libraryidentifiertypecoding.getSystem()));
		} else {
			l.addLibraryIdTypCdgSys("NULL");
		}

		if(libraryidentifiertypecodingi == libraryidentifiertypecodinglist.size()-1) {l.addLibraryIdTypCdgSys("]]");}


		 };
		/******************** libraryidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period libraryidentifierperiod = libraryidentifier.getPeriod();

		/******************** Library_Id_Prd_Strt ********************************************************************************/
		if(libraryidentifieri == 0) {l.addLibraryIdPrdStrt("[");}
		if(libraryidentifierperiod.hasStart()) {

			l.addLibraryIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(libraryidentifierperiod.getStart())+"\"");
		} else {
			l.addLibraryIdPrdStrt("NULL");
		}

		if(libraryidentifieri == libraryidentifierlist.size()-1) {l.addLibraryIdPrdStrt("]");}


		/******************** Library_Id_Prd_End ********************************************************************************/
		if(libraryidentifieri == 0) {l.addLibraryIdPrdEnd("[");}
		if(libraryidentifierperiod.hasEnd()) {

			l.addLibraryIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(libraryidentifierperiod.getEnd())+"\"");
		} else {
			l.addLibraryIdPrdEnd("NULL");
		}

		if(libraryidentifieri == libraryidentifierlist.size()-1) {l.addLibraryIdPrdEnd("]");}


		/******************** libraryidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse libraryidentifieruse = libraryidentifier.getUse();
		if(libraryidentifieruse!=null) {
		if(libraryidentifieri == 0) {

		l.addLibraryIdUse("[");		}
			l.addLibraryIdUse(libraryidentifieruse.toCode());
		if(libraryidentifieri == libraryidentifierlist.size()-1) {

		l.addLibraryIdUse("]");		}

		} else {
			l.addLibraryIdUse("NULL");
		}

		/******************** Library_Id_Assigner ********************************************************************************/
		if(libraryidentifieri == 0) {l.addLibraryIdAssigner("[");}
		if(libraryidentifier.hasAssigner()) {

			if(libraryidentifier.getAssigner().getReference() != null) {
			l.addLibraryIdAssigner(libraryidentifier.getAssigner().getReference());
			}
		} else {
			l.addLibraryIdAssigner("NULL");
		}

		if(libraryidentifieri == libraryidentifierlist.size()-1) {l.addLibraryIdAssigner("]");}


		/******************** Library_Id_Sys ********************************************************************************/
		if(libraryidentifieri == 0) {l.addLibraryIdSys("[");}
		if(libraryidentifier.hasSystem()) {

			l.addLibraryIdSys(String.valueOf(libraryidentifier.getSystem()));
		} else {
			l.addLibraryIdSys("NULL");
		}

		if(libraryidentifieri == libraryidentifierlist.size()-1) {l.addLibraryIdSys("]");}


		 };
		/******************** librarycontact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> librarycontactlist = library.getContact();
		for(int librarycontacti = 0; librarycontacti<librarycontactlist.size();librarycontacti++ ) {
		org.hl7.fhir.r4.model.ContactDetail  librarycontact = librarycontactlist.get(librarycontacti);

		/******************** Library_Cntct_Nm ********************************************************************************/
		if(librarycontacti == 0) {l.addLibraryCntctNm("[");}
		if(librarycontact.hasName()) {

			l.addLibraryCntctNm(String.valueOf(librarycontact.getName()));
		} else {
			l.addLibraryCntctNm("NULL");
		}

		if(librarycontacti == librarycontactlist.size()-1) {l.addLibraryCntctNm("]");}


		/******************** librarycontacttelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> librarycontacttelecomlist = librarycontact.getTelecom();
		for(int librarycontacttelecomi = 0; librarycontacttelecomi<librarycontacttelecomlist.size();librarycontacttelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  librarycontacttelecom = librarycontacttelecomlist.get(librarycontacttelecomi);

		/******************** Library_Cntct_Tlcm_Vl ********************************************************************************/
		if(librarycontacttelecomi == 0) {l.addLibraryCntctTlcmVl("[[");}
		if(librarycontacttelecom.hasValue()) {

			l.addLibraryCntctTlcmVl(String.valueOf(librarycontacttelecom.getValue()));
		} else {
			l.addLibraryCntctTlcmVl("NULL");
		}

		if(librarycontacttelecomi == librarycontacttelecomlist.size()-1) {l.addLibraryCntctTlcmVl("]]");}


		/******************** librarycontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period librarycontacttelecomperiod = librarycontacttelecom.getPeriod();

		/******************** Library_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(librarycontacttelecomi == 0) {l.addLibraryCntctTlcmPrdStrt("[[");}
		if(librarycontacttelecomperiod.hasStart()) {

			l.addLibraryCntctTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(librarycontacttelecomperiod.getStart())+"\"");
		} else {
			l.addLibraryCntctTlcmPrdStrt("NULL");
		}

		if(librarycontacttelecomi == librarycontacttelecomlist.size()-1) {l.addLibraryCntctTlcmPrdStrt("]]");}


		/******************** Library_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(librarycontacttelecomi == 0) {l.addLibraryCntctTlcmPrdEnd("[[");}
		if(librarycontacttelecomperiod.hasEnd()) {

			l.addLibraryCntctTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(librarycontacttelecomperiod.getEnd())+"\"");
		} else {
			l.addLibraryCntctTlcmPrdEnd("NULL");
		}

		if(librarycontacttelecomi == librarycontacttelecomlist.size()-1) {l.addLibraryCntctTlcmPrdEnd("]]");}


		/******************** librarycontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse librarycontacttelecomuse = librarycontacttelecom.getUse();
		if(librarycontacttelecomuse!=null) {
		if(librarycontacttelecomi == 0) {

		l.addLibraryCntctTlcmUse("[[");		}
			l.addLibraryCntctTlcmUse(librarycontacttelecomuse.toCode());
		if(librarycontacttelecomi == librarycontacttelecomlist.size()-1) {

		l.addLibraryCntctTlcmUse("]]");		}

		} else {
			l.addLibraryCntctTlcmUse("NULL");
		}

		/******************** librarycontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem librarycontacttelecomsystem = librarycontacttelecom.getSystem();
		if(librarycontacttelecomsystem!=null) {
		if(librarycontacttelecomi == 0) {

		l.addLibraryCntctTlcmSys("[[");		}
			l.addLibraryCntctTlcmSys(librarycontacttelecomsystem.toCode());
		if(librarycontacttelecomi == librarycontacttelecomlist.size()-1) {

		l.addLibraryCntctTlcmSys("]]");		}

		} else {
			l.addLibraryCntctTlcmSys("NULL");
		}

		/******************** Library_Cntct_Tlcm_Rnk ********************************************************************************/
		if(librarycontacttelecomi == 0) {l.addLibraryCntctTlcmRnk("[[");}
		if(librarycontacttelecom.hasRank()) {

			l.addLibraryCntctTlcmRnk(String.valueOf(librarycontacttelecom.getRank()));
		} else {
			l.addLibraryCntctTlcmRnk("NULL");
		}

		if(librarycontacttelecomi == librarycontacttelecomlist.size()-1) {l.addLibraryCntctTlcmRnk("]]");}


		 };
		 };
		/******************** libraryparameter ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ParameterDefinition> libraryparameterlist = library.getParameter();
		for(int libraryparameteri = 0; libraryparameteri<libraryparameterlist.size();libraryparameteri++ ) {
		org.hl7.fhir.r4.model.ParameterDefinition  libraryparameter = libraryparameterlist.get(libraryparameteri);

		/******************** Library_Prmtr_Nm ********************************************************************************/
		if(libraryparameteri == 0) {l.addLibraryPrmtrNm("[");}
		if(libraryparameter.hasName()) {

			l.addLibraryPrmtrNm(String.valueOf(libraryparameter.getName()));
		} else {
			l.addLibraryPrmtrNm("NULL");
		}

		if(libraryparameteri == libraryparameterlist.size()-1) {l.addLibraryPrmtrNm("]");}


		/******************** Library_Prmtr_Typ ********************************************************************************/
		if(libraryparameteri == 0) {l.addLibraryPrmtrTyp("[");}
		if(libraryparameter.hasType()) {

			l.addLibraryPrmtrTyp(String.valueOf(libraryparameter.getType()));
		} else {
			l.addLibraryPrmtrTyp("NULL");
		}

		if(libraryparameteri == libraryparameterlist.size()-1) {l.addLibraryPrmtrTyp("]");}


		/******************** libraryparameteruse ********************************************************************************/
		org.hl7.fhir.r4.model.ParameterDefinition.ParameterUse libraryparameteruse = libraryparameter.getUse();
		if(libraryparameteruse!=null) {
		if(libraryparameteri == 0) {

		l.addLibraryPrmtrUse("[");		}
			l.addLibraryPrmtrUse(libraryparameteruse.toCode());
		if(libraryparameteri == libraryparameterlist.size()-1) {

		l.addLibraryPrmtrUse("]");		}

		} else {
			l.addLibraryPrmtrUse("NULL");
		}

		/******************** Library_Prmtr_Profile ********************************************************************************/
		if(libraryparameteri == 0) {l.addLibraryPrmtrProfile("[");}
		if(libraryparameter.hasProfile()) {

			l.addLibraryPrmtrProfile(String.valueOf(libraryparameter.getProfile()));
		} else {
			l.addLibraryPrmtrProfile("NULL");
		}

		if(libraryparameteri == libraryparameterlist.size()-1) {l.addLibraryPrmtrProfile("]");}


		/******************** Library_Prmtr_Min ********************************************************************************/
		if(libraryparameteri == 0) {l.addLibraryPrmtrMin("[");}
		if(libraryparameter.hasMin()) {

			l.addLibraryPrmtrMin(String.valueOf(libraryparameter.getMin()));
		} else {
			l.addLibraryPrmtrMin("NULL");
		}

		if(libraryparameteri == libraryparameterlist.size()-1) {l.addLibraryPrmtrMin("]");}


		/******************** Library_Prmtr_Mx ********************************************************************************/
		if(libraryparameteri == 0) {l.addLibraryPrmtrMx("[");}
		if(libraryparameter.hasMax()) {

			l.addLibraryPrmtrMx(String.valueOf(libraryparameter.getMax()));
		} else {
			l.addLibraryPrmtrMx("NULL");
		}

		if(libraryparameteri == libraryparameterlist.size()-1) {l.addLibraryPrmtrMx("]");}


		/******************** Library_Prmtr_Docation ********************************************************************************/
		if(libraryparameteri == 0) {l.addLibraryPrmtrDocation("[");}
		if(libraryparameter.hasDocumentation()) {

			l.addLibraryPrmtrDocation(String.valueOf(libraryparameter.getDocumentation()));
		} else {
			l.addLibraryPrmtrDocation("NULL");
		}

		if(libraryparameteri == libraryparameterlist.size()-1) {l.addLibraryPrmtrDocation("]");}


		 };
		/******************** Library_Copyright ********************************************************************************/
		if(library.hasCopyright()) {

			l.addLibraryCopyright(String.valueOf(library.getCopyright()));
		} else {
			l.addLibraryCopyright("NULL");
		}


		/******************** Library_ApprovalDt ********************************************************************************/
		if(library.hasApprovalDate()) {

			l.addLibraryApprovalDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(library.getApprovalDate())+"\"");
		} else {
			l.addLibraryApprovalDt("NULL");
		}


		/******************** libraryendorser ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> libraryendorserlist = library.getEndorser();
		for(int libraryendorseri = 0; libraryendorseri<libraryendorserlist.size();libraryendorseri++ ) {
		org.hl7.fhir.r4.model.ContactDetail  libraryendorser = libraryendorserlist.get(libraryendorseri);

		/******************** Library_Endsr_Nm ********************************************************************************/
		if(libraryendorseri == 0) {l.addLibraryEndsrNm("[");}
		if(libraryendorser.hasName()) {

			l.addLibraryEndsrNm(String.valueOf(libraryendorser.getName()));
		} else {
			l.addLibraryEndsrNm("NULL");
		}

		if(libraryendorseri == libraryendorserlist.size()-1) {l.addLibraryEndsrNm("]");}


		/******************** libraryendorsertelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> libraryendorsertelecomlist = libraryendorser.getTelecom();
		for(int libraryendorsertelecomi = 0; libraryendorsertelecomi<libraryendorsertelecomlist.size();libraryendorsertelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  libraryendorsertelecom = libraryendorsertelecomlist.get(libraryendorsertelecomi);

		/******************** Library_Endsr_Tlcm_Vl ********************************************************************************/
		if(libraryendorsertelecomi == 0) {l.addLibraryEndsrTlcmVl("[[");}
		if(libraryendorsertelecom.hasValue()) {

			l.addLibraryEndsrTlcmVl(String.valueOf(libraryendorsertelecom.getValue()));
		} else {
			l.addLibraryEndsrTlcmVl("NULL");
		}

		if(libraryendorsertelecomi == libraryendorsertelecomlist.size()-1) {l.addLibraryEndsrTlcmVl("]]");}


		/******************** libraryendorsertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period libraryendorsertelecomperiod = libraryendorsertelecom.getPeriod();

		/******************** Library_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(libraryendorsertelecomi == 0) {l.addLibraryEndsrTlcmPrdStrt("[[");}
		if(libraryendorsertelecomperiod.hasStart()) {

			l.addLibraryEndsrTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(libraryendorsertelecomperiod.getStart())+"\"");
		} else {
			l.addLibraryEndsrTlcmPrdStrt("NULL");
		}

		if(libraryendorsertelecomi == libraryendorsertelecomlist.size()-1) {l.addLibraryEndsrTlcmPrdStrt("]]");}


		/******************** Library_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(libraryendorsertelecomi == 0) {l.addLibraryEndsrTlcmPrdEnd("[[");}
		if(libraryendorsertelecomperiod.hasEnd()) {

			l.addLibraryEndsrTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(libraryendorsertelecomperiod.getEnd())+"\"");
		} else {
			l.addLibraryEndsrTlcmPrdEnd("NULL");
		}

		if(libraryendorsertelecomi == libraryendorsertelecomlist.size()-1) {l.addLibraryEndsrTlcmPrdEnd("]]");}


		/******************** libraryendorsertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse libraryendorsertelecomuse = libraryendorsertelecom.getUse();
		if(libraryendorsertelecomuse!=null) {
		if(libraryendorsertelecomi == 0) {

		l.addLibraryEndsrTlcmUse("[[");		}
			l.addLibraryEndsrTlcmUse(libraryendorsertelecomuse.toCode());
		if(libraryendorsertelecomi == libraryendorsertelecomlist.size()-1) {

		l.addLibraryEndsrTlcmUse("]]");		}

		} else {
			l.addLibraryEndsrTlcmUse("NULL");
		}

		/******************** libraryendorsertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem libraryendorsertelecomsystem = libraryendorsertelecom.getSystem();
		if(libraryendorsertelecomsystem!=null) {
		if(libraryendorsertelecomi == 0) {

		l.addLibraryEndsrTlcmSys("[[");		}
			l.addLibraryEndsrTlcmSys(libraryendorsertelecomsystem.toCode());
		if(libraryendorsertelecomi == libraryendorsertelecomlist.size()-1) {

		l.addLibraryEndsrTlcmSys("]]");		}

		} else {
			l.addLibraryEndsrTlcmSys("NULL");
		}

		/******************** Library_Endsr_Tlcm_Rnk ********************************************************************************/
		if(libraryendorsertelecomi == 0) {l.addLibraryEndsrTlcmRnk("[[");}
		if(libraryendorsertelecom.hasRank()) {

			l.addLibraryEndsrTlcmRnk(String.valueOf(libraryendorsertelecom.getRank()));
		} else {
			l.addLibraryEndsrTlcmRnk("NULL");
		}

		if(libraryendorsertelecomi == libraryendorsertelecomlist.size()-1) {l.addLibraryEndsrTlcmRnk("]]");}


		 };
		 };
		/******************** Library_LastReviewDt ********************************************************************************/
		if(library.hasLastReviewDate()) {

			l.addLibraryLastReviewDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(library.getLastReviewDate())+"\"");
		} else {
			l.addLibraryLastReviewDt("NULL");
		}


		/******************** libraryeditor ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> libraryeditorlist = library.getEditor();
		for(int libraryeditori = 0; libraryeditori<libraryeditorlist.size();libraryeditori++ ) {
		org.hl7.fhir.r4.model.ContactDetail  libraryeditor = libraryeditorlist.get(libraryeditori);

		/******************** Library_Editor_Nm ********************************************************************************/
		if(libraryeditori == 0) {l.addLibraryEditorNm("[");}
		if(libraryeditor.hasName()) {

			l.addLibraryEditorNm(String.valueOf(libraryeditor.getName()));
		} else {
			l.addLibraryEditorNm("NULL");
		}

		if(libraryeditori == libraryeditorlist.size()-1) {l.addLibraryEditorNm("]");}


		/******************** libraryeditortelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> libraryeditortelecomlist = libraryeditor.getTelecom();
		for(int libraryeditortelecomi = 0; libraryeditortelecomi<libraryeditortelecomlist.size();libraryeditortelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  libraryeditortelecom = libraryeditortelecomlist.get(libraryeditortelecomi);

		/******************** Library_Editor_Tlcm_Vl ********************************************************************************/
		if(libraryeditortelecomi == 0) {l.addLibraryEditorTlcmVl("[[");}
		if(libraryeditortelecom.hasValue()) {

			l.addLibraryEditorTlcmVl(String.valueOf(libraryeditortelecom.getValue()));
		} else {
			l.addLibraryEditorTlcmVl("NULL");
		}

		if(libraryeditortelecomi == libraryeditortelecomlist.size()-1) {l.addLibraryEditorTlcmVl("]]");}


		/******************** libraryeditortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period libraryeditortelecomperiod = libraryeditortelecom.getPeriod();

		/******************** Library_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(libraryeditortelecomi == 0) {l.addLibraryEditorTlcmPrdStrt("[[");}
		if(libraryeditortelecomperiod.hasStart()) {

			l.addLibraryEditorTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(libraryeditortelecomperiod.getStart())+"\"");
		} else {
			l.addLibraryEditorTlcmPrdStrt("NULL");
		}

		if(libraryeditortelecomi == libraryeditortelecomlist.size()-1) {l.addLibraryEditorTlcmPrdStrt("]]");}


		/******************** Library_Editor_Tlcm_Prd_End ********************************************************************************/
		if(libraryeditortelecomi == 0) {l.addLibraryEditorTlcmPrdEnd("[[");}
		if(libraryeditortelecomperiod.hasEnd()) {

			l.addLibraryEditorTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(libraryeditortelecomperiod.getEnd())+"\"");
		} else {
			l.addLibraryEditorTlcmPrdEnd("NULL");
		}

		if(libraryeditortelecomi == libraryeditortelecomlist.size()-1) {l.addLibraryEditorTlcmPrdEnd("]]");}


		/******************** libraryeditortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse libraryeditortelecomuse = libraryeditortelecom.getUse();
		if(libraryeditortelecomuse!=null) {
		if(libraryeditortelecomi == 0) {

		l.addLibraryEditorTlcmUse("[[");		}
			l.addLibraryEditorTlcmUse(libraryeditortelecomuse.toCode());
		if(libraryeditortelecomi == libraryeditortelecomlist.size()-1) {

		l.addLibraryEditorTlcmUse("]]");		}

		} else {
			l.addLibraryEditorTlcmUse("NULL");
		}

		/******************** libraryeditortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem libraryeditortelecomsystem = libraryeditortelecom.getSystem();
		if(libraryeditortelecomsystem!=null) {
		if(libraryeditortelecomi == 0) {

		l.addLibraryEditorTlcmSys("[[");		}
			l.addLibraryEditorTlcmSys(libraryeditortelecomsystem.toCode());
		if(libraryeditortelecomi == libraryeditortelecomlist.size()-1) {

		l.addLibraryEditorTlcmSys("]]");		}

		} else {
			l.addLibraryEditorTlcmSys("NULL");
		}

		/******************** Library_Editor_Tlcm_Rnk ********************************************************************************/
		if(libraryeditortelecomi == 0) {l.addLibraryEditorTlcmRnk("[[");}
		if(libraryeditortelecom.hasRank()) {

			l.addLibraryEditorTlcmRnk(String.valueOf(libraryeditortelecom.getRank()));
		} else {
			l.addLibraryEditorTlcmRnk("NULL");
		}

		if(libraryeditortelecomi == libraryeditortelecomlist.size()-1) {l.addLibraryEditorTlcmRnk("]]");}


		 };
		 };
		/******************** libraryreviewer ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> libraryreviewerlist = library.getReviewer();
		for(int libraryrevieweri = 0; libraryrevieweri<libraryreviewerlist.size();libraryrevieweri++ ) {
		org.hl7.fhir.r4.model.ContactDetail  libraryreviewer = libraryreviewerlist.get(libraryrevieweri);

		/******************** Library_Rviewr_Nm ********************************************************************************/
		if(libraryrevieweri == 0) {l.addLibraryRviewrNm("[");}
		if(libraryreviewer.hasName()) {

			l.addLibraryRviewrNm(String.valueOf(libraryreviewer.getName()));
		} else {
			l.addLibraryRviewrNm("NULL");
		}

		if(libraryrevieweri == libraryreviewerlist.size()-1) {l.addLibraryRviewrNm("]");}


		/******************** libraryreviewertelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> libraryreviewertelecomlist = libraryreviewer.getTelecom();
		for(int libraryreviewertelecomi = 0; libraryreviewertelecomi<libraryreviewertelecomlist.size();libraryreviewertelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  libraryreviewertelecom = libraryreviewertelecomlist.get(libraryreviewertelecomi);

		/******************** Library_Rviewr_Tlcm_Vl ********************************************************************************/
		if(libraryreviewertelecomi == 0) {l.addLibraryRviewrTlcmVl("[[");}
		if(libraryreviewertelecom.hasValue()) {

			l.addLibraryRviewrTlcmVl(String.valueOf(libraryreviewertelecom.getValue()));
		} else {
			l.addLibraryRviewrTlcmVl("NULL");
		}

		if(libraryreviewertelecomi == libraryreviewertelecomlist.size()-1) {l.addLibraryRviewrTlcmVl("]]");}


		/******************** libraryreviewertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period libraryreviewertelecomperiod = libraryreviewertelecom.getPeriod();

		/******************** Library_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(libraryreviewertelecomi == 0) {l.addLibraryRviewrTlcmPrdStrt("[[");}
		if(libraryreviewertelecomperiod.hasStart()) {

			l.addLibraryRviewrTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(libraryreviewertelecomperiod.getStart())+"\"");
		} else {
			l.addLibraryRviewrTlcmPrdStrt("NULL");
		}

		if(libraryreviewertelecomi == libraryreviewertelecomlist.size()-1) {l.addLibraryRviewrTlcmPrdStrt("]]");}


		/******************** Library_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(libraryreviewertelecomi == 0) {l.addLibraryRviewrTlcmPrdEnd("[[");}
		if(libraryreviewertelecomperiod.hasEnd()) {

			l.addLibraryRviewrTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(libraryreviewertelecomperiod.getEnd())+"\"");
		} else {
			l.addLibraryRviewrTlcmPrdEnd("NULL");
		}

		if(libraryreviewertelecomi == libraryreviewertelecomlist.size()-1) {l.addLibraryRviewrTlcmPrdEnd("]]");}


		/******************** libraryreviewertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse libraryreviewertelecomuse = libraryreviewertelecom.getUse();
		if(libraryreviewertelecomuse!=null) {
		if(libraryreviewertelecomi == 0) {

		l.addLibraryRviewrTlcmUse("[[");		}
			l.addLibraryRviewrTlcmUse(libraryreviewertelecomuse.toCode());
		if(libraryreviewertelecomi == libraryreviewertelecomlist.size()-1) {

		l.addLibraryRviewrTlcmUse("]]");		}

		} else {
			l.addLibraryRviewrTlcmUse("NULL");
		}

		/******************** libraryreviewertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem libraryreviewertelecomsystem = libraryreviewertelecom.getSystem();
		if(libraryreviewertelecomsystem!=null) {
		if(libraryreviewertelecomi == 0) {

		l.addLibraryRviewrTlcmSys("[[");		}
			l.addLibraryRviewrTlcmSys(libraryreviewertelecomsystem.toCode());
		if(libraryreviewertelecomi == libraryreviewertelecomlist.size()-1) {

		l.addLibraryRviewrTlcmSys("]]");		}

		} else {
			l.addLibraryRviewrTlcmSys("NULL");
		}

		/******************** Library_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(libraryreviewertelecomi == 0) {l.addLibraryRviewrTlcmRnk("[[");}
		if(libraryreviewertelecom.hasRank()) {

			l.addLibraryRviewrTlcmRnk(String.valueOf(libraryreviewertelecom.getRank()));
		} else {
			l.addLibraryRviewrTlcmRnk("NULL");
		}

		if(libraryreviewertelecomi == libraryreviewertelecomlist.size()-1) {l.addLibraryRviewrTlcmRnk("]]");}


		 };
		 };
		/******************** Library_Usg ********************************************************************************/
		if(library.hasUsage()) {

			l.addLibraryUsg(String.valueOf(library.getUsage()));
		} else {
			l.addLibraryUsg("NULL");
		}


		/******************** Library_SbjctRfrnc ********************************************************************************/
		if(library.hasSubjectReference()) {

			if(library.getSubjectReference().getReference() != null) {
			l.addLibrarySbjctRfrnc(library.getSubjectReference().getReference());
			}
		} else {
			l.addLibrarySbjctRfrnc("NULL");
		}


		/******************** librarysubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept librarysubjectcodeableconcept = library.getSubjectCodeableConcept();

		/******************** Library_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(librarysubjectcodeableconcept.hasText()) {

			l.addLibrarySbjctCdbleCncptTxt(String.valueOf(librarysubjectcodeableconcept.getText()));
		} else {
			l.addLibrarySbjctCdbleCncptTxt("NULL");
		}


		/******************** librarysubjectcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> librarysubjectcodeableconceptcodinglist = librarysubjectcodeableconcept.getCoding();
		for(int librarysubjectcodeableconceptcodingi = 0; librarysubjectcodeableconceptcodingi<librarysubjectcodeableconceptcodinglist.size();librarysubjectcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  librarysubjectcodeableconceptcoding = librarysubjectcodeableconceptcodinglist.get(librarysubjectcodeableconceptcodingi);

		/******************** Library_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(librarysubjectcodeableconceptcodingi == 0) {l.addLibrarySbjctCdbleCncptCdgDsply("[");}
		if(librarysubjectcodeableconceptcoding.hasDisplay()) {

			l.addLibrarySbjctCdbleCncptCdgDsply(String.valueOf(librarysubjectcodeableconceptcoding.getDisplay()));
		} else {
			l.addLibrarySbjctCdbleCncptCdgDsply("NULL");
		}

		if(librarysubjectcodeableconceptcodingi == librarysubjectcodeableconceptcodinglist.size()-1) {l.addLibrarySbjctCdbleCncptCdgDsply("]");}


		/******************** Library_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(librarysubjectcodeableconceptcodingi == 0) {l.addLibrarySbjctCdbleCncptCdgVrsn("[");}
		if(librarysubjectcodeableconceptcoding.hasVersion()) {

			l.addLibrarySbjctCdbleCncptCdgVrsn(String.valueOf(librarysubjectcodeableconceptcoding.getVersion()));
		} else {
			l.addLibrarySbjctCdbleCncptCdgVrsn("NULL");
		}

		if(librarysubjectcodeableconceptcodingi == librarysubjectcodeableconceptcodinglist.size()-1) {l.addLibrarySbjctCdbleCncptCdgVrsn("]");}


		/******************** Library_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(librarysubjectcodeableconceptcodingi == 0) {l.addLibrarySbjctCdbleCncptCdgCd("[");}
		if(librarysubjectcodeableconceptcoding.hasCode()) {

			l.addLibrarySbjctCdbleCncptCdgCd(String.valueOf(librarysubjectcodeableconceptcoding.getCode()));
		} else {
			l.addLibrarySbjctCdbleCncptCdgCd("NULL");
		}

		if(librarysubjectcodeableconceptcodingi == librarysubjectcodeableconceptcodinglist.size()-1) {l.addLibrarySbjctCdbleCncptCdgCd("]");}


		/******************** Library_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(librarysubjectcodeableconceptcodingi == 0) {l.addLibrarySbjctCdbleCncptCdgUsrSltd("[");}
		if(librarysubjectcodeableconceptcoding.hasUserSelected()) {

			l.addLibrarySbjctCdbleCncptCdgUsrSltd(String.valueOf(librarysubjectcodeableconceptcoding.getUserSelected()));
		} else {
			l.addLibrarySbjctCdbleCncptCdgUsrSltd("NULL");
		}

		if(librarysubjectcodeableconceptcodingi == librarysubjectcodeableconceptcodinglist.size()-1) {l.addLibrarySbjctCdbleCncptCdgUsrSltd("]");}


		/******************** Library_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(librarysubjectcodeableconceptcodingi == 0) {l.addLibrarySbjctCdbleCncptCdgSys("[");}
		if(librarysubjectcodeableconceptcoding.hasSystem()) {

			l.addLibrarySbjctCdbleCncptCdgSys(String.valueOf(librarysubjectcodeableconceptcoding.getSystem()));
		} else {
			l.addLibrarySbjctCdbleCncptCdgSys("NULL");
		}

		if(librarysubjectcodeableconceptcodingi == librarysubjectcodeableconceptcodinglist.size()-1) {l.addLibrarySbjctCdbleCncptCdgSys("]");}


		 };
		/******************** Library_Ttl ********************************************************************************/
		if(library.hasTitle()) {

			l.addLibraryTtl(String.valueOf(library.getTitle()));
		} else {
			l.addLibraryTtl("NULL");
		}


		/******************** libraryrelatedartifact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.RelatedArtifact> libraryrelatedartifactlist = library.getRelatedArtifact();
		for(int libraryrelatedartifacti = 0; libraryrelatedartifacti<libraryrelatedartifactlist.size();libraryrelatedartifacti++ ) {
		org.hl7.fhir.r4.model.RelatedArtifact  libraryrelatedartifact = libraryrelatedartifactlist.get(libraryrelatedartifacti);

		/******************** Library_RltedArtfct_Rsrc ********************************************************************************/
		if(libraryrelatedartifacti == 0) {l.addLibraryRltedArtfctRsrc("[");}
		if(libraryrelatedartifact.hasResource()) {

			l.addLibraryRltedArtfctRsrc(String.valueOf(libraryrelatedartifact.getResource()));
		} else {
			l.addLibraryRltedArtfctRsrc("NULL");
		}

		if(libraryrelatedartifacti == libraryrelatedartifactlist.size()-1) {l.addLibraryRltedArtfctRsrc("]");}


		/******************** libraryrelatedartifacttype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactType libraryrelatedartifacttype = libraryrelatedartifact.getType();
		if(libraryrelatedartifacttype!=null) {
		if(libraryrelatedartifacti == 0) {

		l.addLibraryRltedArtfctTyp("[");		}
			l.addLibraryRltedArtfctTyp(libraryrelatedartifacttype.toCode());
		if(libraryrelatedartifacti == libraryrelatedartifactlist.size()-1) {

		l.addLibraryRltedArtfctTyp("]");		}

		} else {
			l.addLibraryRltedArtfctTyp("NULL");
		}

		/******************** Library_RltedArtfct_Url ********************************************************************************/
		if(libraryrelatedartifacti == 0) {l.addLibraryRltedArtfctUrl("[");}
		if(libraryrelatedartifact.hasUrl()) {

			l.addLibraryRltedArtfctUrl(String.valueOf(libraryrelatedartifact.getUrl()));
		} else {
			l.addLibraryRltedArtfctUrl("NULL");
		}

		if(libraryrelatedartifacti == libraryrelatedartifactlist.size()-1) {l.addLibraryRltedArtfctUrl("]");}


		/******************** Library_RltedArtfct_Citation ********************************************************************************/
		if(libraryrelatedartifacti == 0) {l.addLibraryRltedArtfctCitation("[");}
		if(libraryrelatedartifact.hasCitation()) {

			l.addLibraryRltedArtfctCitation(String.valueOf(libraryrelatedartifact.getCitation()));
		} else {
			l.addLibraryRltedArtfctCitation("NULL");
		}

		if(libraryrelatedartifacti == libraryrelatedartifactlist.size()-1) {l.addLibraryRltedArtfctCitation("]");}


		/******************** Library_RltedArtfct_Lbl ********************************************************************************/
		if(libraryrelatedartifacti == 0) {l.addLibraryRltedArtfctLbl("[");}
		if(libraryrelatedartifact.hasLabel()) {

			l.addLibraryRltedArtfctLbl(String.valueOf(libraryrelatedartifact.getLabel()));
		} else {
			l.addLibraryRltedArtfctLbl("NULL");
		}

		if(libraryrelatedartifacti == libraryrelatedartifactlist.size()-1) {l.addLibraryRltedArtfctLbl("]");}


		/******************** libraryrelatedartifactdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment libraryrelatedartifactdocument = libraryrelatedartifact.getDocument();

		/******************** Library_RltedArtfct_Doc_Sz ********************************************************************************/
		if(libraryrelatedartifacti == 0) {l.addLibraryRltedArtfctDocSz("[");}
		if(libraryrelatedartifactdocument.hasSize()) {

			l.addLibraryRltedArtfctDocSz(String.valueOf(libraryrelatedartifactdocument.getSize()));
		} else {
			l.addLibraryRltedArtfctDocSz("NULL");
		}

		if(libraryrelatedartifacti == libraryrelatedartifactlist.size()-1) {l.addLibraryRltedArtfctDocSz("]");}


		/******************** Library_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(libraryrelatedartifacti == 0) {l.addLibraryRltedArtfctDocLnguage("[");}
		if(libraryrelatedartifactdocument.hasLanguage()) {

			l.addLibraryRltedArtfctDocLnguage(String.valueOf(libraryrelatedartifactdocument.getLanguage()));
		} else {
			l.addLibraryRltedArtfctDocLnguage("NULL");
		}

		if(libraryrelatedartifacti == libraryrelatedartifactlist.size()-1) {l.addLibraryRltedArtfctDocLnguage("]");}


		/******************** Library_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(libraryrelatedartifacti == 0) {l.addLibraryRltedArtfctDocCntntTyp("[");}
		if(libraryrelatedartifactdocument.hasContentType()) {

			l.addLibraryRltedArtfctDocCntntTyp(String.valueOf(libraryrelatedartifactdocument.getContentType()));
		} else {
			l.addLibraryRltedArtfctDocCntntTyp("NULL");
		}

		if(libraryrelatedartifacti == libraryrelatedartifactlist.size()-1) {l.addLibraryRltedArtfctDocCntntTyp("]");}


		/******************** Library_RltedArtfct_Doc_Hash ********************************************************************************/
		if(libraryrelatedartifacti == 0) {l.addLibraryRltedArtfctDocHash("[");}
		if(libraryrelatedartifactdocument.hasHash()) {

			l.addLibraryRltedArtfctDocHash(new String(libraryrelatedartifactdocument.getHash()));
		} else {
			l.addLibraryRltedArtfctDocHash("NULL");
		}

		if(libraryrelatedartifacti == libraryrelatedartifactlist.size()-1) {l.addLibraryRltedArtfctDocHash("]");}


		/******************** Library_RltedArtfct_Doc_Data ********************************************************************************/
		if(libraryrelatedartifacti == 0) {l.addLibraryRltedArtfctDocData("[");}
		if(libraryrelatedartifactdocument.hasData()) {

			l.addLibraryRltedArtfctDocData(new String(libraryrelatedartifactdocument.getData()));
		} else {
			l.addLibraryRltedArtfctDocData("NULL");
		}

		if(libraryrelatedartifacti == libraryrelatedartifactlist.size()-1) {l.addLibraryRltedArtfctDocData("]");}


		/******************** Library_RltedArtfct_Doc_Creation ********************************************************************************/
		if(libraryrelatedartifacti == 0) {l.addLibraryRltedArtfctDocCreation("[");}
		if(libraryrelatedartifactdocument.hasCreation()) {

			l.addLibraryRltedArtfctDocCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(libraryrelatedartifactdocument.getCreation())+"\"");
		} else {
			l.addLibraryRltedArtfctDocCreation("NULL");
		}

		if(libraryrelatedartifacti == libraryrelatedartifactlist.size()-1) {l.addLibraryRltedArtfctDocCreation("]");}


		/******************** Library_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(libraryrelatedartifacti == 0) {l.addLibraryRltedArtfctDocTtl("[");}
		if(libraryrelatedartifactdocument.hasTitle()) {

			l.addLibraryRltedArtfctDocTtl(String.valueOf(libraryrelatedartifactdocument.getTitle()));
		} else {
			l.addLibraryRltedArtfctDocTtl("NULL");
		}

		if(libraryrelatedartifacti == libraryrelatedartifactlist.size()-1) {l.addLibraryRltedArtfctDocTtl("]");}


		/******************** Library_RltedArtfct_Doc_Url ********************************************************************************/
		if(libraryrelatedartifacti == 0) {l.addLibraryRltedArtfctDocUrl("[");}
		if(libraryrelatedartifactdocument.hasUrl()) {

			l.addLibraryRltedArtfctDocUrl(String.valueOf(libraryrelatedartifactdocument.getUrl()));
		} else {
			l.addLibraryRltedArtfctDocUrl("NULL");
		}

		if(libraryrelatedartifacti == libraryrelatedartifactlist.size()-1) {l.addLibraryRltedArtfctDocUrl("]");}


		 };
		/******************** Library_Prpse ********************************************************************************/
		if(library.hasPurpose()) {

			l.addLibraryPrpse(String.valueOf(library.getPurpose()));
		} else {
			l.addLibraryPrpse("NULL");
		}


		/******************** Library_Url ********************************************************************************/
		if(library.hasUrl()) {

			l.addLibraryUrl(String.valueOf(library.getUrl()));
		} else {
			l.addLibraryUrl("NULL");
		}


		/******************** Library_Subtitle ********************************************************************************/
		if(library.hasSubtitle()) {

			l.addLibrarySubtitle(String.valueOf(library.getSubtitle()));
		} else {
			l.addLibrarySubtitle("NULL");
		}


		/******************** librarytopic ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> librarytopiclist = library.getTopic();
		for(int librarytopici = 0; librarytopici<librarytopiclist.size();librarytopici++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  librarytopic = librarytopiclist.get(librarytopici);

		/******************** Library_Topic_Txt ********************************************************************************/
		if(librarytopici == 0) {l.addLibraryTopicTxt("[");}
		if(librarytopic.hasText()) {

			l.addLibraryTopicTxt(String.valueOf(librarytopic.getText()));
		} else {
			l.addLibraryTopicTxt("NULL");
		}

		if(librarytopici == librarytopiclist.size()-1) {l.addLibraryTopicTxt("]");}


		/******************** librarytopiccoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> librarytopiccodinglist = librarytopic.getCoding();
		for(int librarytopiccodingi = 0; librarytopiccodingi<librarytopiccodinglist.size();librarytopiccodingi++ ) {
		org.hl7.fhir.r4.model.Coding  librarytopiccoding = librarytopiccodinglist.get(librarytopiccodingi);

		/******************** Library_Topic_Cdg_Dsply ********************************************************************************/
		if(librarytopiccodingi == 0) {l.addLibraryTopicCdgDsply("[[");}
		if(librarytopiccoding.hasDisplay()) {

			l.addLibraryTopicCdgDsply(String.valueOf(librarytopiccoding.getDisplay()));
		} else {
			l.addLibraryTopicCdgDsply("NULL");
		}

		if(librarytopiccodingi == librarytopiccodinglist.size()-1) {l.addLibraryTopicCdgDsply("]]");}


		/******************** Library_Topic_Cdg_Vrsn ********************************************************************************/
		if(librarytopiccodingi == 0) {l.addLibraryTopicCdgVrsn("[[");}
		if(librarytopiccoding.hasVersion()) {

			l.addLibraryTopicCdgVrsn(String.valueOf(librarytopiccoding.getVersion()));
		} else {
			l.addLibraryTopicCdgVrsn("NULL");
		}

		if(librarytopiccodingi == librarytopiccodinglist.size()-1) {l.addLibraryTopicCdgVrsn("]]");}


		/******************** Library_Topic_Cdg_Cd ********************************************************************************/
		if(librarytopiccodingi == 0) {l.addLibraryTopicCdgCd("[[");}
		if(librarytopiccoding.hasCode()) {

			l.addLibraryTopicCdgCd(String.valueOf(librarytopiccoding.getCode()));
		} else {
			l.addLibraryTopicCdgCd("NULL");
		}

		if(librarytopiccodingi == librarytopiccodinglist.size()-1) {l.addLibraryTopicCdgCd("]]");}


		/******************** Library_Topic_Cdg_UsrSltd ********************************************************************************/
		if(librarytopiccodingi == 0) {l.addLibraryTopicCdgUsrSltd("[[");}
		if(librarytopiccoding.hasUserSelected()) {

			l.addLibraryTopicCdgUsrSltd(String.valueOf(librarytopiccoding.getUserSelected()));
		} else {
			l.addLibraryTopicCdgUsrSltd("NULL");
		}

		if(librarytopiccodingi == librarytopiccodinglist.size()-1) {l.addLibraryTopicCdgUsrSltd("]]");}


		/******************** Library_Topic_Cdg_Sys ********************************************************************************/
		if(librarytopiccodingi == 0) {l.addLibraryTopicCdgSys("[[");}
		if(librarytopiccoding.hasSystem()) {

			l.addLibraryTopicCdgSys(String.valueOf(librarytopiccoding.getSystem()));
		} else {
			l.addLibraryTopicCdgSys("NULL");
		}

		if(librarytopiccodingi == librarytopiccodinglist.size()-1) {l.addLibraryTopicCdgSys("]]");}


		 };
		 };
		/******************** libraryjurisdiction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> libraryjurisdictionlist = library.getJurisdiction();
		for(int libraryjurisdictioni = 0; libraryjurisdictioni<libraryjurisdictionlist.size();libraryjurisdictioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  libraryjurisdiction = libraryjurisdictionlist.get(libraryjurisdictioni);

		/******************** Library_Jrsdctn_Txt ********************************************************************************/
		if(libraryjurisdictioni == 0) {l.addLibraryJrsdctnTxt("[");}
		if(libraryjurisdiction.hasText()) {

			l.addLibraryJrsdctnTxt(String.valueOf(libraryjurisdiction.getText()));
		} else {
			l.addLibraryJrsdctnTxt("NULL");
		}

		if(libraryjurisdictioni == libraryjurisdictionlist.size()-1) {l.addLibraryJrsdctnTxt("]");}


		/******************** libraryjurisdictioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> libraryjurisdictioncodinglist = libraryjurisdiction.getCoding();
		for(int libraryjurisdictioncodingi = 0; libraryjurisdictioncodingi<libraryjurisdictioncodinglist.size();libraryjurisdictioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  libraryjurisdictioncoding = libraryjurisdictioncodinglist.get(libraryjurisdictioncodingi);

		/******************** Library_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(libraryjurisdictioncodingi == 0) {l.addLibraryJrsdctnCdgDsply("[[");}
		if(libraryjurisdictioncoding.hasDisplay()) {

			l.addLibraryJrsdctnCdgDsply(String.valueOf(libraryjurisdictioncoding.getDisplay()));
		} else {
			l.addLibraryJrsdctnCdgDsply("NULL");
		}

		if(libraryjurisdictioncodingi == libraryjurisdictioncodinglist.size()-1) {l.addLibraryJrsdctnCdgDsply("]]");}


		/******************** Library_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(libraryjurisdictioncodingi == 0) {l.addLibraryJrsdctnCdgVrsn("[[");}
		if(libraryjurisdictioncoding.hasVersion()) {

			l.addLibraryJrsdctnCdgVrsn(String.valueOf(libraryjurisdictioncoding.getVersion()));
		} else {
			l.addLibraryJrsdctnCdgVrsn("NULL");
		}

		if(libraryjurisdictioncodingi == libraryjurisdictioncodinglist.size()-1) {l.addLibraryJrsdctnCdgVrsn("]]");}


		/******************** Library_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(libraryjurisdictioncodingi == 0) {l.addLibraryJrsdctnCdgCd("[[");}
		if(libraryjurisdictioncoding.hasCode()) {

			l.addLibraryJrsdctnCdgCd(String.valueOf(libraryjurisdictioncoding.getCode()));
		} else {
			l.addLibraryJrsdctnCdgCd("NULL");
		}

		if(libraryjurisdictioncodingi == libraryjurisdictioncodinglist.size()-1) {l.addLibraryJrsdctnCdgCd("]]");}


		/******************** Library_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(libraryjurisdictioncodingi == 0) {l.addLibraryJrsdctnCdgUsrSltd("[[");}
		if(libraryjurisdictioncoding.hasUserSelected()) {

			l.addLibraryJrsdctnCdgUsrSltd(String.valueOf(libraryjurisdictioncoding.getUserSelected()));
		} else {
			l.addLibraryJrsdctnCdgUsrSltd("NULL");
		}

		if(libraryjurisdictioncodingi == libraryjurisdictioncodinglist.size()-1) {l.addLibraryJrsdctnCdgUsrSltd("]]");}


		/******************** Library_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(libraryjurisdictioncodingi == 0) {l.addLibraryJrsdctnCdgSys("[[");}
		if(libraryjurisdictioncoding.hasSystem()) {

			l.addLibraryJrsdctnCdgSys(String.valueOf(libraryjurisdictioncoding.getSystem()));
		} else {
			l.addLibraryJrsdctnCdgSys("NULL");
		}

		if(libraryjurisdictioncodingi == libraryjurisdictioncodinglist.size()-1) {l.addLibraryJrsdctnCdgSys("]]");}


		 };
		 };
		/******************** libraryusecontext ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.UsageContext> libraryusecontextlist = library.getUseContext();
		for(int libraryusecontexti = 0; libraryusecontexti<libraryusecontextlist.size();libraryusecontexti++ ) {
		org.hl7.fhir.r4.model.UsageContext  libraryusecontext = libraryusecontextlist.get(libraryusecontexti);

		/******************** libraryusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding libraryusecontextcode = libraryusecontext.getCode();

		/******************** Library_UseCntxt_Cd_Dsply ********************************************************************************/
		if(libraryusecontexti == 0) {l.addLibraryUseCntxtCdDsply("[");}
		if(libraryusecontextcode.hasDisplay()) {

			l.addLibraryUseCntxtCdDsply(String.valueOf(libraryusecontextcode.getDisplay()));
		} else {
			l.addLibraryUseCntxtCdDsply("NULL");
		}

		if(libraryusecontexti == libraryusecontextlist.size()-1) {l.addLibraryUseCntxtCdDsply("]");}


		/******************** Library_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(libraryusecontexti == 0) {l.addLibraryUseCntxtCdVrsn("[");}
		if(libraryusecontextcode.hasVersion()) {

			l.addLibraryUseCntxtCdVrsn(String.valueOf(libraryusecontextcode.getVersion()));
		} else {
			l.addLibraryUseCntxtCdVrsn("NULL");
		}

		if(libraryusecontexti == libraryusecontextlist.size()-1) {l.addLibraryUseCntxtCdVrsn("]");}


		/******************** Library_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(libraryusecontexti == 0) {l.addLibraryUseCntxtCdUsrSltd("[");}
		if(libraryusecontextcode.hasUserSelected()) {

			l.addLibraryUseCntxtCdUsrSltd(String.valueOf(libraryusecontextcode.getUserSelected()));
		} else {
			l.addLibraryUseCntxtCdUsrSltd("NULL");
		}

		if(libraryusecontexti == libraryusecontextlist.size()-1) {l.addLibraryUseCntxtCdUsrSltd("]");}


		/******************** Library_UseCntxt_Cd_Sys ********************************************************************************/
		if(libraryusecontexti == 0) {l.addLibraryUseCntxtCdSys("[");}
		if(libraryusecontextcode.hasSystem()) {

			l.addLibraryUseCntxtCdSys(String.valueOf(libraryusecontextcode.getSystem()));
		} else {
			l.addLibraryUseCntxtCdSys("NULL");
		}

		if(libraryusecontexti == libraryusecontextlist.size()-1) {l.addLibraryUseCntxtCdSys("]");}


		/******************** Library_UseCntxt_VlRfrnc ********************************************************************************/
		if(libraryusecontexti == 0) {l.addLibraryUseCntxtVlRfrnc("[");}
		if(libraryusecontext.hasValueReference()) {

			if(libraryusecontext.getValueReference().getReference() != null) {
			l.addLibraryUseCntxtVlRfrnc(libraryusecontext.getValueReference().getReference());
			}
		} else {
			l.addLibraryUseCntxtVlRfrnc("NULL");
		}

		if(libraryusecontexti == libraryusecontextlist.size()-1) {l.addLibraryUseCntxtVlRfrnc("]");}


		/******************** libraryusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept libraryusecontextvaluecodeableconcept = libraryusecontext.getValueCodeableConcept();

		/******************** Library_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(libraryusecontexti == 0) {l.addLibraryUseCntxtVlCdbleCncptTxt("[");}
		if(libraryusecontextvaluecodeableconcept.hasText()) {

			l.addLibraryUseCntxtVlCdbleCncptTxt(String.valueOf(libraryusecontextvaluecodeableconcept.getText()));
		} else {
			l.addLibraryUseCntxtVlCdbleCncptTxt("NULL");
		}

		if(libraryusecontexti == libraryusecontextlist.size()-1) {l.addLibraryUseCntxtVlCdbleCncptTxt("]");}


		/******************** libraryusecontextvaluecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> libraryusecontextvaluecodeableconceptcodinglist = libraryusecontextvaluecodeableconcept.getCoding();
		for(int libraryusecontextvaluecodeableconceptcodingi = 0; libraryusecontextvaluecodeableconceptcodingi<libraryusecontextvaluecodeableconceptcodinglist.size();libraryusecontextvaluecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  libraryusecontextvaluecodeableconceptcoding = libraryusecontextvaluecodeableconceptcodinglist.get(libraryusecontextvaluecodeableconceptcodingi);

		/******************** Library_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(libraryusecontextvaluecodeableconceptcodingi == 0) {l.addLibraryUseCntxtVlCdbleCncptCdgDsply("[[");}
		if(libraryusecontextvaluecodeableconceptcoding.hasDisplay()) {

			l.addLibraryUseCntxtVlCdbleCncptCdgDsply(String.valueOf(libraryusecontextvaluecodeableconceptcoding.getDisplay()));
		} else {
			l.addLibraryUseCntxtVlCdbleCncptCdgDsply("NULL");
		}

		if(libraryusecontextvaluecodeableconceptcodingi == libraryusecontextvaluecodeableconceptcodinglist.size()-1) {l.addLibraryUseCntxtVlCdbleCncptCdgDsply("]]");}


		/******************** Library_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(libraryusecontextvaluecodeableconceptcodingi == 0) {l.addLibraryUseCntxtVlCdbleCncptCdgVrsn("[[");}
		if(libraryusecontextvaluecodeableconceptcoding.hasVersion()) {

			l.addLibraryUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(libraryusecontextvaluecodeableconceptcoding.getVersion()));
		} else {
			l.addLibraryUseCntxtVlCdbleCncptCdgVrsn("NULL");
		}

		if(libraryusecontextvaluecodeableconceptcodingi == libraryusecontextvaluecodeableconceptcodinglist.size()-1) {l.addLibraryUseCntxtVlCdbleCncptCdgVrsn("]]");}


		/******************** Library_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(libraryusecontextvaluecodeableconceptcodingi == 0) {l.addLibraryUseCntxtVlCdbleCncptCdgCd("[[");}
		if(libraryusecontextvaluecodeableconceptcoding.hasCode()) {

			l.addLibraryUseCntxtVlCdbleCncptCdgCd(String.valueOf(libraryusecontextvaluecodeableconceptcoding.getCode()));
		} else {
			l.addLibraryUseCntxtVlCdbleCncptCdgCd("NULL");
		}

		if(libraryusecontextvaluecodeableconceptcodingi == libraryusecontextvaluecodeableconceptcodinglist.size()-1) {l.addLibraryUseCntxtVlCdbleCncptCdgCd("]]");}


		/******************** Library_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(libraryusecontextvaluecodeableconceptcodingi == 0) {l.addLibraryUseCntxtVlCdbleCncptCdgUsrSltd("[[");}
		if(libraryusecontextvaluecodeableconceptcoding.hasUserSelected()) {

			l.addLibraryUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(libraryusecontextvaluecodeableconceptcoding.getUserSelected()));
		} else {
			l.addLibraryUseCntxtVlCdbleCncptCdgUsrSltd("NULL");
		}

		if(libraryusecontextvaluecodeableconceptcodingi == libraryusecontextvaluecodeableconceptcodinglist.size()-1) {l.addLibraryUseCntxtVlCdbleCncptCdgUsrSltd("]]");}


		/******************** Library_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(libraryusecontextvaluecodeableconceptcodingi == 0) {l.addLibraryUseCntxtVlCdbleCncptCdgSys("[[");}
		if(libraryusecontextvaluecodeableconceptcoding.hasSystem()) {

			l.addLibraryUseCntxtVlCdbleCncptCdgSys(String.valueOf(libraryusecontextvaluecodeableconceptcoding.getSystem()));
		} else {
			l.addLibraryUseCntxtVlCdbleCncptCdgSys("NULL");
		}

		if(libraryusecontextvaluecodeableconceptcodingi == libraryusecontextvaluecodeableconceptcodinglist.size()-1) {l.addLibraryUseCntxtVlCdbleCncptCdgSys("]]");}


		 };
		/******************** libraryusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range libraryusecontextvaluerange = libraryusecontext.getValueRange();

		/******************** libraryusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity libraryusecontextvaluerangelow = libraryusecontextvaluerange.getLow();

		/******************** Library_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(libraryusecontexti == 0) {l.addLibraryUseCntxtVlRngLwVl("[");}
		if(libraryusecontextvaluerangelow.hasValue()) {

			l.addLibraryUseCntxtVlRngLwVl(String.valueOf(libraryusecontextvaluerangelow.getValue()));
		} else {
			l.addLibraryUseCntxtVlRngLwVl("NULL");
		}

		if(libraryusecontexti == libraryusecontextlist.size()-1) {l.addLibraryUseCntxtVlRngLwVl("]");}


		/******************** libraryusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator libraryusecontextvaluerangelowcomparator = libraryusecontextvaluerangelow.getComparator();
		if(libraryusecontextvaluerangelowcomparator!=null) {
		if(libraryusecontexti == 0) {

		l.addLibraryUseCntxtVlRngLwCmprtr("[");		}
			l.addLibraryUseCntxtVlRngLwCmprtr(libraryusecontextvaluerangelowcomparator.toCode());
		if(libraryusecontexti == libraryusecontextlist.size()-1) {

		l.addLibraryUseCntxtVlRngLwCmprtr("]");		}

		} else {
			l.addLibraryUseCntxtVlRngLwCmprtr("NULL");
		}

		/******************** Library_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(libraryusecontexti == 0) {l.addLibraryUseCntxtVlRngLwCd("[");}
		if(libraryusecontextvaluerangelow.hasCode()) {

			l.addLibraryUseCntxtVlRngLwCd(String.valueOf(libraryusecontextvaluerangelow.getCode()));
		} else {
			l.addLibraryUseCntxtVlRngLwCd("NULL");
		}

		if(libraryusecontexti == libraryusecontextlist.size()-1) {l.addLibraryUseCntxtVlRngLwCd("]");}


		/******************** Library_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(libraryusecontexti == 0) {l.addLibraryUseCntxtVlRngLwUnt("[");}
		if(libraryusecontextvaluerangelow.hasUnit()) {

			l.addLibraryUseCntxtVlRngLwUnt(String.valueOf(libraryusecontextvaluerangelow.getUnit()));
		} else {
			l.addLibraryUseCntxtVlRngLwUnt("NULL");
		}

		if(libraryusecontexti == libraryusecontextlist.size()-1) {l.addLibraryUseCntxtVlRngLwUnt("]");}


		/******************** Library_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(libraryusecontexti == 0) {l.addLibraryUseCntxtVlRngLwSys("[");}
		if(libraryusecontextvaluerangelow.hasSystem()) {

			l.addLibraryUseCntxtVlRngLwSys(String.valueOf(libraryusecontextvaluerangelow.getSystem()));
		} else {
			l.addLibraryUseCntxtVlRngLwSys("NULL");
		}

		if(libraryusecontexti == libraryusecontextlist.size()-1) {l.addLibraryUseCntxtVlRngLwSys("]");}


		/******************** libraryusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity libraryusecontextvaluerangehigh = libraryusecontextvaluerange.getHigh();

		/******************** Library_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(libraryusecontexti == 0) {l.addLibraryUseCntxtVlRngHiVl("[");}
		if(libraryusecontextvaluerangehigh.hasValue()) {

			l.addLibraryUseCntxtVlRngHiVl(String.valueOf(libraryusecontextvaluerangehigh.getValue()));
		} else {
			l.addLibraryUseCntxtVlRngHiVl("NULL");
		}

		if(libraryusecontexti == libraryusecontextlist.size()-1) {l.addLibraryUseCntxtVlRngHiVl("]");}


		/******************** libraryusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator libraryusecontextvaluerangehighcomparator = libraryusecontextvaluerangehigh.getComparator();
		if(libraryusecontextvaluerangehighcomparator!=null) {
		if(libraryusecontexti == 0) {

		l.addLibraryUseCntxtVlRngHiCmprtr("[");		}
			l.addLibraryUseCntxtVlRngHiCmprtr(libraryusecontextvaluerangehighcomparator.toCode());
		if(libraryusecontexti == libraryusecontextlist.size()-1) {

		l.addLibraryUseCntxtVlRngHiCmprtr("]");		}

		} else {
			l.addLibraryUseCntxtVlRngHiCmprtr("NULL");
		}

		/******************** Library_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(libraryusecontexti == 0) {l.addLibraryUseCntxtVlRngHiCd("[");}
		if(libraryusecontextvaluerangehigh.hasCode()) {

			l.addLibraryUseCntxtVlRngHiCd(String.valueOf(libraryusecontextvaluerangehigh.getCode()));
		} else {
			l.addLibraryUseCntxtVlRngHiCd("NULL");
		}

		if(libraryusecontexti == libraryusecontextlist.size()-1) {l.addLibraryUseCntxtVlRngHiCd("]");}


		/******************** Library_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(libraryusecontexti == 0) {l.addLibraryUseCntxtVlRngHiUnt("[");}
		if(libraryusecontextvaluerangehigh.hasUnit()) {

			l.addLibraryUseCntxtVlRngHiUnt(String.valueOf(libraryusecontextvaluerangehigh.getUnit()));
		} else {
			l.addLibraryUseCntxtVlRngHiUnt("NULL");
		}

		if(libraryusecontexti == libraryusecontextlist.size()-1) {l.addLibraryUseCntxtVlRngHiUnt("]");}


		/******************** Library_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(libraryusecontexti == 0) {l.addLibraryUseCntxtVlRngHiSys("[");}
		if(libraryusecontextvaluerangehigh.hasSystem()) {

			l.addLibraryUseCntxtVlRngHiSys(String.valueOf(libraryusecontextvaluerangehigh.getSystem()));
		} else {
			l.addLibraryUseCntxtVlRngHiSys("NULL");
		}

		if(libraryusecontexti == libraryusecontextlist.size()-1) {l.addLibraryUseCntxtVlRngHiSys("]");}


		/******************** libraryusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity libraryusecontextvaluequantity = libraryusecontext.getValueQuantity();

		/******************** Library_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(libraryusecontexti == 0) {l.addLibraryUseCntxtVlQntyVl("[");}
		if(libraryusecontextvaluequantity.hasValue()) {

			l.addLibraryUseCntxtVlQntyVl(String.valueOf(libraryusecontextvaluequantity.getValue()));
		} else {
			l.addLibraryUseCntxtVlQntyVl("NULL");
		}

		if(libraryusecontexti == libraryusecontextlist.size()-1) {l.addLibraryUseCntxtVlQntyVl("]");}


		/******************** libraryusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator libraryusecontextvaluequantitycomparator = libraryusecontextvaluequantity.getComparator();
		if(libraryusecontextvaluequantitycomparator!=null) {
		if(libraryusecontexti == 0) {

		l.addLibraryUseCntxtVlQntyCmprtr("[");		}
			l.addLibraryUseCntxtVlQntyCmprtr(libraryusecontextvaluequantitycomparator.toCode());
		if(libraryusecontexti == libraryusecontextlist.size()-1) {

		l.addLibraryUseCntxtVlQntyCmprtr("]");		}

		} else {
			l.addLibraryUseCntxtVlQntyCmprtr("NULL");
		}

		/******************** Library_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(libraryusecontexti == 0) {l.addLibraryUseCntxtVlQntyCd("[");}
		if(libraryusecontextvaluequantity.hasCode()) {

			l.addLibraryUseCntxtVlQntyCd(String.valueOf(libraryusecontextvaluequantity.getCode()));
		} else {
			l.addLibraryUseCntxtVlQntyCd("NULL");
		}

		if(libraryusecontexti == libraryusecontextlist.size()-1) {l.addLibraryUseCntxtVlQntyCd("]");}


		/******************** Library_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(libraryusecontexti == 0) {l.addLibraryUseCntxtVlQntyUnt("[");}
		if(libraryusecontextvaluequantity.hasUnit()) {

			l.addLibraryUseCntxtVlQntyUnt(String.valueOf(libraryusecontextvaluequantity.getUnit()));
		} else {
			l.addLibraryUseCntxtVlQntyUnt("NULL");
		}

		if(libraryusecontexti == libraryusecontextlist.size()-1) {l.addLibraryUseCntxtVlQntyUnt("]");}


		/******************** Library_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(libraryusecontexti == 0) {l.addLibraryUseCntxtVlQntySys("[");}
		if(libraryusecontextvaluequantity.hasSystem()) {

			l.addLibraryUseCntxtVlQntySys(String.valueOf(libraryusecontextvaluequantity.getSystem()));
		} else {
			l.addLibraryUseCntxtVlQntySys("NULL");
		}

		if(libraryusecontexti == libraryusecontextlist.size()-1) {l.addLibraryUseCntxtVlQntySys("]");}


		 };
		/******************** Library_Exprmtl ********************************************************************************/
		if(library.hasExperimental()) {

			l.addLibraryExprmtl(String.valueOf(library.getExperimental()));
		} else {
			l.addLibraryExprmtl("NULL");
		}


		/******************** Library_Pblshr ********************************************************************************/
		if(library.hasPublisher()) {

			l.addLibraryPblshr(String.valueOf(library.getPublisher()));
		} else {
			l.addLibraryPblshr("NULL");
		}


		/******************** libraryeffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period libraryeffectiveperiod = library.getEffectivePeriod();

		/******************** Library_EfctivePrd_Strt ********************************************************************************/
		if(libraryeffectiveperiod.hasStart()) {

			l.addLibraryEfctivePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(libraryeffectiveperiod.getStart())+"\"");
		} else {
			l.addLibraryEfctivePrdStrt("NULL");
		}


		/******************** Library_EfctivePrd_End ********************************************************************************/
		if(libraryeffectiveperiod.hasEnd()) {

			l.addLibraryEfctivePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(libraryeffectiveperiod.getEnd())+"\"");
		} else {
			l.addLibraryEfctivePrdEnd("NULL");
		}


		/******************** libraryauthor ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> libraryauthorlist = library.getAuthor();
		for(int libraryauthori = 0; libraryauthori<libraryauthorlist.size();libraryauthori++ ) {
		org.hl7.fhir.r4.model.ContactDetail  libraryauthor = libraryauthorlist.get(libraryauthori);

		/******************** Library_Athr_Nm ********************************************************************************/
		if(libraryauthori == 0) {l.addLibraryAthrNm("[");}
		if(libraryauthor.hasName()) {

			l.addLibraryAthrNm(String.valueOf(libraryauthor.getName()));
		} else {
			l.addLibraryAthrNm("NULL");
		}

		if(libraryauthori == libraryauthorlist.size()-1) {l.addLibraryAthrNm("]");}


		/******************** libraryauthortelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> libraryauthortelecomlist = libraryauthor.getTelecom();
		for(int libraryauthortelecomi = 0; libraryauthortelecomi<libraryauthortelecomlist.size();libraryauthortelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  libraryauthortelecom = libraryauthortelecomlist.get(libraryauthortelecomi);

		/******************** Library_Athr_Tlcm_Vl ********************************************************************************/
		if(libraryauthortelecomi == 0) {l.addLibraryAthrTlcmVl("[[");}
		if(libraryauthortelecom.hasValue()) {

			l.addLibraryAthrTlcmVl(String.valueOf(libraryauthortelecom.getValue()));
		} else {
			l.addLibraryAthrTlcmVl("NULL");
		}

		if(libraryauthortelecomi == libraryauthortelecomlist.size()-1) {l.addLibraryAthrTlcmVl("]]");}


		/******************** libraryauthortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period libraryauthortelecomperiod = libraryauthortelecom.getPeriod();

		/******************** Library_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(libraryauthortelecomi == 0) {l.addLibraryAthrTlcmPrdStrt("[[");}
		if(libraryauthortelecomperiod.hasStart()) {

			l.addLibraryAthrTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(libraryauthortelecomperiod.getStart())+"\"");
		} else {
			l.addLibraryAthrTlcmPrdStrt("NULL");
		}

		if(libraryauthortelecomi == libraryauthortelecomlist.size()-1) {l.addLibraryAthrTlcmPrdStrt("]]");}


		/******************** Library_Athr_Tlcm_Prd_End ********************************************************************************/
		if(libraryauthortelecomi == 0) {l.addLibraryAthrTlcmPrdEnd("[[");}
		if(libraryauthortelecomperiod.hasEnd()) {

			l.addLibraryAthrTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(libraryauthortelecomperiod.getEnd())+"\"");
		} else {
			l.addLibraryAthrTlcmPrdEnd("NULL");
		}

		if(libraryauthortelecomi == libraryauthortelecomlist.size()-1) {l.addLibraryAthrTlcmPrdEnd("]]");}


		/******************** libraryauthortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse libraryauthortelecomuse = libraryauthortelecom.getUse();
		if(libraryauthortelecomuse!=null) {
		if(libraryauthortelecomi == 0) {

		l.addLibraryAthrTlcmUse("[[");		}
			l.addLibraryAthrTlcmUse(libraryauthortelecomuse.toCode());
		if(libraryauthortelecomi == libraryauthortelecomlist.size()-1) {

		l.addLibraryAthrTlcmUse("]]");		}

		} else {
			l.addLibraryAthrTlcmUse("NULL");
		}

		/******************** libraryauthortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem libraryauthortelecomsystem = libraryauthortelecom.getSystem();
		if(libraryauthortelecomsystem!=null) {
		if(libraryauthortelecomi == 0) {

		l.addLibraryAthrTlcmSys("[[");		}
			l.addLibraryAthrTlcmSys(libraryauthortelecomsystem.toCode());
		if(libraryauthortelecomi == libraryauthortelecomlist.size()-1) {

		l.addLibraryAthrTlcmSys("]]");		}

		} else {
			l.addLibraryAthrTlcmSys("NULL");
		}

		/******************** Library_Athr_Tlcm_Rnk ********************************************************************************/
		if(libraryauthortelecomi == 0) {l.addLibraryAthrTlcmRnk("[[");}
		if(libraryauthortelecom.hasRank()) {

			l.addLibraryAthrTlcmRnk(String.valueOf(libraryauthortelecom.getRank()));
		} else {
			l.addLibraryAthrTlcmRnk("NULL");
		}

		if(libraryauthortelecomi == libraryauthortelecomlist.size()-1) {l.addLibraryAthrTlcmRnk("]]");}


		 };
		 };
		/******************** librarydatarequirement ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DataRequirement> librarydatarequirementlist = library.getDataRequirement();
		for(int librarydatarequirementi = 0; librarydatarequirementi<librarydatarequirementlist.size();librarydatarequirementi++ ) {
		org.hl7.fhir.r4.model.DataRequirement  librarydatarequirement = librarydatarequirementlist.get(librarydatarequirementi);

		/******************** Library_DataRqrment_Typ ********************************************************************************/
		if(librarydatarequirementi == 0) {l.addLibraryDataRqrmentTyp("[");}
		if(librarydatarequirement.hasType()) {

			l.addLibraryDataRqrmentTyp(String.valueOf(librarydatarequirement.getType()));
		} else {
			l.addLibraryDataRqrmentTyp("NULL");
		}

		if(librarydatarequirementi == librarydatarequirementlist.size()-1) {l.addLibraryDataRqrmentTyp("]");}


		/******************** librarydatarequirementsort ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent> librarydatarequirementsortlist = librarydatarequirement.getSort();
		for(int librarydatarequirementsorti = 0; librarydatarequirementsorti<librarydatarequirementsortlist.size();librarydatarequirementsorti++ ) {
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent  librarydatarequirementsort = librarydatarequirementsortlist.get(librarydatarequirementsorti);

		/******************** Library_DataRqrment_Sort_Path ********************************************************************************/
		if(librarydatarequirementsorti == 0) {l.addLibraryDataRqrmentSortPath("[[");}
		if(librarydatarequirementsort.hasPath()) {

			l.addLibraryDataRqrmentSortPath(String.valueOf(librarydatarequirementsort.getPath()));
		} else {
			l.addLibraryDataRqrmentSortPath("NULL");
		}

		if(librarydatarequirementsorti == librarydatarequirementsortlist.size()-1) {l.addLibraryDataRqrmentSortPath("]]");}


		/******************** librarydatarequirementsortdirection ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.SortDirection librarydatarequirementsortdirection = librarydatarequirementsort.getDirection();
		if(librarydatarequirementsortdirection!=null) {
		if(librarydatarequirementsorti == 0) {

		l.addLibraryDataRqrmentSortDirection("[[");		}
			l.addLibraryDataRqrmentSortDirection(librarydatarequirementsortdirection.toCode());
		if(librarydatarequirementsorti == librarydatarequirementsortlist.size()-1) {

		l.addLibraryDataRqrmentSortDirection("]]");		}

		} else {
			l.addLibraryDataRqrmentSortDirection("NULL");
		}

		 };
		/******************** Library_DataRqrment_SbjctRfrnc ********************************************************************************/
		if(librarydatarequirement.hasSubjectReference()) {

			if(librarydatarequirement.getSubjectReference().getReference() != null) {
			l.addLibraryDataRqrmentSbjctRfrnc(librarydatarequirement.getSubjectReference().getReference());
			}
		} else {
			l.addLibraryDataRqrmentSbjctRfrnc("NULL");
		}


		/******************** librarydatarequirementsubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept librarydatarequirementsubjectcodeableconcept = librarydatarequirement.getSubjectCodeableConcept();

		/******************** Library_DataRqrment_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(librarydatarequirementsubjectcodeableconcept.hasText()) {

			l.addLibraryDataRqrmentSbjctCdbleCncptTxt(String.valueOf(librarydatarequirementsubjectcodeableconcept.getText()));
		} else {
			l.addLibraryDataRqrmentSbjctCdbleCncptTxt("NULL");
		}


		/******************** librarydatarequirementsubjectcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> librarydatarequirementsubjectcodeableconceptcodinglist = librarydatarequirementsubjectcodeableconcept.getCoding();
		for(int librarydatarequirementsubjectcodeableconceptcodingi = 0; librarydatarequirementsubjectcodeableconceptcodingi<librarydatarequirementsubjectcodeableconceptcodinglist.size();librarydatarequirementsubjectcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  librarydatarequirementsubjectcodeableconceptcoding = librarydatarequirementsubjectcodeableconceptcodinglist.get(librarydatarequirementsubjectcodeableconceptcodingi);

		/******************** Library_DataRqrment_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(librarydatarequirementsubjectcodeableconceptcodingi == 0) {l.addLibraryDataRqrmentSbjctCdbleCncptCdgDsply("[[");}
		if(librarydatarequirementsubjectcodeableconceptcoding.hasDisplay()) {

			l.addLibraryDataRqrmentSbjctCdbleCncptCdgDsply(String.valueOf(librarydatarequirementsubjectcodeableconceptcoding.getDisplay()));
		} else {
			l.addLibraryDataRqrmentSbjctCdbleCncptCdgDsply("NULL");
		}

		if(librarydatarequirementsubjectcodeableconceptcodingi == librarydatarequirementsubjectcodeableconceptcodinglist.size()-1) {l.addLibraryDataRqrmentSbjctCdbleCncptCdgDsply("]]");}


		/******************** Library_DataRqrment_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(librarydatarequirementsubjectcodeableconceptcodingi == 0) {l.addLibraryDataRqrmentSbjctCdbleCncptCdgVrsn("[[");}
		if(librarydatarequirementsubjectcodeableconceptcoding.hasVersion()) {

			l.addLibraryDataRqrmentSbjctCdbleCncptCdgVrsn(String.valueOf(librarydatarequirementsubjectcodeableconceptcoding.getVersion()));
		} else {
			l.addLibraryDataRqrmentSbjctCdbleCncptCdgVrsn("NULL");
		}

		if(librarydatarequirementsubjectcodeableconceptcodingi == librarydatarequirementsubjectcodeableconceptcodinglist.size()-1) {l.addLibraryDataRqrmentSbjctCdbleCncptCdgVrsn("]]");}


		/******************** Library_DataRqrment_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(librarydatarequirementsubjectcodeableconceptcodingi == 0) {l.addLibraryDataRqrmentSbjctCdbleCncptCdgCd("[[");}
		if(librarydatarequirementsubjectcodeableconceptcoding.hasCode()) {

			l.addLibraryDataRqrmentSbjctCdbleCncptCdgCd(String.valueOf(librarydatarequirementsubjectcodeableconceptcoding.getCode()));
		} else {
			l.addLibraryDataRqrmentSbjctCdbleCncptCdgCd("NULL");
		}

		if(librarydatarequirementsubjectcodeableconceptcodingi == librarydatarequirementsubjectcodeableconceptcodinglist.size()-1) {l.addLibraryDataRqrmentSbjctCdbleCncptCdgCd("]]");}


		/******************** Library_DataRqrment_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(librarydatarequirementsubjectcodeableconceptcodingi == 0) {l.addLibraryDataRqrmentSbjctCdbleCncptCdgUsrSltd("[[");}
		if(librarydatarequirementsubjectcodeableconceptcoding.hasUserSelected()) {

			l.addLibraryDataRqrmentSbjctCdbleCncptCdgUsrSltd(String.valueOf(librarydatarequirementsubjectcodeableconceptcoding.getUserSelected()));
		} else {
			l.addLibraryDataRqrmentSbjctCdbleCncptCdgUsrSltd("NULL");
		}

		if(librarydatarequirementsubjectcodeableconceptcodingi == librarydatarequirementsubjectcodeableconceptcodinglist.size()-1) {l.addLibraryDataRqrmentSbjctCdbleCncptCdgUsrSltd("]]");}


		/******************** Library_DataRqrment_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(librarydatarequirementsubjectcodeableconceptcodingi == 0) {l.addLibraryDataRqrmentSbjctCdbleCncptCdgSys("[[");}
		if(librarydatarequirementsubjectcodeableconceptcoding.hasSystem()) {

			l.addLibraryDataRqrmentSbjctCdbleCncptCdgSys(String.valueOf(librarydatarequirementsubjectcodeableconceptcoding.getSystem()));
		} else {
			l.addLibraryDataRqrmentSbjctCdbleCncptCdgSys("NULL");
		}

		if(librarydatarequirementsubjectcodeableconceptcodingi == librarydatarequirementsubjectcodeableconceptcodinglist.size()-1) {l.addLibraryDataRqrmentSbjctCdbleCncptCdgSys("]]");}


		 };
		/******************** Library_DataRqrment_Profile ********************************************************************************/
		if(librarydatarequirement.hasProfile()) {

			String  array = "[";
			for(int incr=0; incr<librarydatarequirement.getProfile().size(); incr++) {
				array = array + librarydatarequirement.getProfile().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			l.addLibraryDataRqrmentProfile(array);

		} else {
			l.addLibraryDataRqrmentProfile("NULL");
		}


		/******************** Library_DataRqrment_MustSupport ********************************************************************************/
		if(librarydatarequirement.hasMustSupport()) {

			String  array = "[";
			for(int incr=0; incr<librarydatarequirement.getMustSupport().size(); incr++) {
				array = array + librarydatarequirement.getMustSupport().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			l.addLibraryDataRqrmentMustSupport(array);

		} else {
			l.addLibraryDataRqrmentMustSupport("NULL");
		}


		/******************** librarydatarequirementcodefilter ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent> librarydatarequirementcodefilterlist = librarydatarequirement.getCodeFilter();
		for(int librarydatarequirementcodefilteri = 0; librarydatarequirementcodefilteri<librarydatarequirementcodefilterlist.size();librarydatarequirementcodefilteri++ ) {
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent  librarydatarequirementcodefilter = librarydatarequirementcodefilterlist.get(librarydatarequirementcodefilteri);

		/******************** Library_DataRqrment_CdFltr_Path ********************************************************************************/
		if(librarydatarequirementcodefilteri == 0) {l.addLibraryDataRqrmentCdFltrPath("[[");}
		if(librarydatarequirementcodefilter.hasPath()) {

			l.addLibraryDataRqrmentCdFltrPath(String.valueOf(librarydatarequirementcodefilter.getPath()));
		} else {
			l.addLibraryDataRqrmentCdFltrPath("NULL");
		}

		if(librarydatarequirementcodefilteri == librarydatarequirementcodefilterlist.size()-1) {l.addLibraryDataRqrmentCdFltrPath("]]");}


		/******************** librarydatarequirementcodefiltercode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> librarydatarequirementcodefiltercodelist = librarydatarequirementcodefilter.getCode();
		for(int librarydatarequirementcodefiltercodei = 0; librarydatarequirementcodefiltercodei<librarydatarequirementcodefiltercodelist.size();librarydatarequirementcodefiltercodei++ ) {
		org.hl7.fhir.r4.model.Coding  librarydatarequirementcodefiltercode = librarydatarequirementcodefiltercodelist.get(librarydatarequirementcodefiltercodei);

		/******************** Library_DataRqrment_CdFltr_Cd_Dsply ********************************************************************************/
		if(librarydatarequirementcodefiltercodei == 0) {l.addLibraryDataRqrmentCdFltrCdDsply("[[[");}
		if(librarydatarequirementcodefiltercode.hasDisplay()) {

			l.addLibraryDataRqrmentCdFltrCdDsply(String.valueOf(librarydatarequirementcodefiltercode.getDisplay()));
		} else {
			l.addLibraryDataRqrmentCdFltrCdDsply("NULL");
		}

		if(librarydatarequirementcodefiltercodei == librarydatarequirementcodefiltercodelist.size()-1) {l.addLibraryDataRqrmentCdFltrCdDsply("]]]");}


		/******************** Library_DataRqrment_CdFltr_Cd_Vrsn ********************************************************************************/
		if(librarydatarequirementcodefiltercodei == 0) {l.addLibraryDataRqrmentCdFltrCdVrsn("[[[");}
		if(librarydatarequirementcodefiltercode.hasVersion()) {

			l.addLibraryDataRqrmentCdFltrCdVrsn(String.valueOf(librarydatarequirementcodefiltercode.getVersion()));
		} else {
			l.addLibraryDataRqrmentCdFltrCdVrsn("NULL");
		}

		if(librarydatarequirementcodefiltercodei == librarydatarequirementcodefiltercodelist.size()-1) {l.addLibraryDataRqrmentCdFltrCdVrsn("]]]");}


		/******************** Library_DataRqrment_CdFltr_Cd_UsrSltd ********************************************************************************/
		if(librarydatarequirementcodefiltercodei == 0) {l.addLibraryDataRqrmentCdFltrCdUsrSltd("[[[");}
		if(librarydatarequirementcodefiltercode.hasUserSelected()) {

			l.addLibraryDataRqrmentCdFltrCdUsrSltd(String.valueOf(librarydatarequirementcodefiltercode.getUserSelected()));
		} else {
			l.addLibraryDataRqrmentCdFltrCdUsrSltd("NULL");
		}

		if(librarydatarequirementcodefiltercodei == librarydatarequirementcodefiltercodelist.size()-1) {l.addLibraryDataRqrmentCdFltrCdUsrSltd("]]]");}


		/******************** Library_DataRqrment_CdFltr_Cd_Sys ********************************************************************************/
		if(librarydatarequirementcodefiltercodei == 0) {l.addLibraryDataRqrmentCdFltrCdSys("[[[");}
		if(librarydatarequirementcodefiltercode.hasSystem()) {

			l.addLibraryDataRqrmentCdFltrCdSys(String.valueOf(librarydatarequirementcodefiltercode.getSystem()));
		} else {
			l.addLibraryDataRqrmentCdFltrCdSys("NULL");
		}

		if(librarydatarequirementcodefiltercodei == librarydatarequirementcodefiltercodelist.size()-1) {l.addLibraryDataRqrmentCdFltrCdSys("]]]");}


		 };
		/******************** Library_DataRqrment_CdFltr_SrchParam ********************************************************************************/
		if(librarydatarequirementcodefilter.hasSearchParam()) {

			l.addLibraryDataRqrmentCdFltrSrchParam(String.valueOf(librarydatarequirementcodefilter.getSearchParam()));
		} else {
			l.addLibraryDataRqrmentCdFltrSrchParam("NULL");
		}


		/******************** Library_DataRqrment_CdFltr_VlSt ********************************************************************************/
		if(librarydatarequirementcodefilter.hasValueSet()) {

			l.addLibraryDataRqrmentCdFltrVlSt(String.valueOf(librarydatarequirementcodefilter.getValueSet()));
		} else {
			l.addLibraryDataRqrmentCdFltrVlSt("NULL");
		}


		 };
		/******************** Library_DataRqrment_Lmt ********************************************************************************/
		if(librarydatarequirement.hasLimit()) {

			l.addLibraryDataRqrmentLmt(String.valueOf(librarydatarequirement.getLimit()));
		} else {
			l.addLibraryDataRqrmentLmt("NULL");
		}


		/******************** librarydatarequirementdatefilter ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent> librarydatarequirementdatefilterlist = librarydatarequirement.getDateFilter();
		for(int librarydatarequirementdatefilteri = 0; librarydatarequirementdatefilteri<librarydatarequirementdatefilterlist.size();librarydatarequirementdatefilteri++ ) {
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent  librarydatarequirementdatefilter = librarydatarequirementdatefilterlist.get(librarydatarequirementdatefilteri);

		/******************** Library_DataRqrment_DtFltr_Path ********************************************************************************/
		if(librarydatarequirementdatefilteri == 0) {l.addLibraryDataRqrmentDtFltrPath("[[");}
		if(librarydatarequirementdatefilter.hasPath()) {

			l.addLibraryDataRqrmentDtFltrPath(String.valueOf(librarydatarequirementdatefilter.getPath()));
		} else {
			l.addLibraryDataRqrmentDtFltrPath("NULL");
		}

		if(librarydatarequirementdatefilteri == librarydatarequirementdatefilterlist.size()-1) {l.addLibraryDataRqrmentDtFltrPath("]]");}


		/******************** Library_DataRqrment_DtFltr_SrchParam ********************************************************************************/
		if(librarydatarequirementdatefilteri == 0) {l.addLibraryDataRqrmentDtFltrSrchParam("[[");}
		if(librarydatarequirementdatefilter.hasSearchParam()) {

			l.addLibraryDataRqrmentDtFltrSrchParam(String.valueOf(librarydatarequirementdatefilter.getSearchParam()));
		} else {
			l.addLibraryDataRqrmentDtFltrSrchParam("NULL");
		}

		if(librarydatarequirementdatefilteri == librarydatarequirementdatefilterlist.size()-1) {l.addLibraryDataRqrmentDtFltrSrchParam("]]");}


		/******************** librarydatarequirementdatefiltervalueduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration librarydatarequirementdatefiltervalueduration = librarydatarequirementdatefilter.getValueDuration();

		/******************** Library_DataRqrment_DtFltr_VlDuration_Vl ********************************************************************************/
		if(librarydatarequirementdatefilteri == 0) {l.addLibraryDataRqrmentDtFltrVlDurationVl("[[");}
		if(librarydatarequirementdatefiltervalueduration.hasValue()) {

			l.addLibraryDataRqrmentDtFltrVlDurationVl(String.valueOf(librarydatarequirementdatefiltervalueduration.getValue()));
		} else {
			l.addLibraryDataRqrmentDtFltrVlDurationVl("NULL");
		}

		if(librarydatarequirementdatefilteri == librarydatarequirementdatefilterlist.size()-1) {l.addLibraryDataRqrmentDtFltrVlDurationVl("]]");}


		/******************** librarydatarequirementdatefiltervaluedurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator librarydatarequirementdatefiltervaluedurationcomparator = librarydatarequirementdatefiltervalueduration.getComparator();
		if(librarydatarequirementdatefiltervaluedurationcomparator!=null) {
		if(librarydatarequirementdatefilteri == 0) {

		l.addLibraryDataRqrmentDtFltrVlDurationCmprtr("[[");		}
			l.addLibraryDataRqrmentDtFltrVlDurationCmprtr(librarydatarequirementdatefiltervaluedurationcomparator.toCode());
		if(librarydatarequirementdatefilteri == librarydatarequirementdatefilterlist.size()-1) {

		l.addLibraryDataRqrmentDtFltrVlDurationCmprtr("]]");		}

		} else {
			l.addLibraryDataRqrmentDtFltrVlDurationCmprtr("NULL");
		}

		/******************** Library_DataRqrment_DtFltr_VlDuration_Cd ********************************************************************************/
		if(librarydatarequirementdatefilteri == 0) {l.addLibraryDataRqrmentDtFltrVlDurationCd("[[");}
		if(librarydatarequirementdatefiltervalueduration.hasCode()) {

			l.addLibraryDataRqrmentDtFltrVlDurationCd(String.valueOf(librarydatarequirementdatefiltervalueduration.getCode()));
		} else {
			l.addLibraryDataRqrmentDtFltrVlDurationCd("NULL");
		}

		if(librarydatarequirementdatefilteri == librarydatarequirementdatefilterlist.size()-1) {l.addLibraryDataRqrmentDtFltrVlDurationCd("]]");}


		/******************** Library_DataRqrment_DtFltr_VlDuration_Unt ********************************************************************************/
		if(librarydatarequirementdatefilteri == 0) {l.addLibraryDataRqrmentDtFltrVlDurationUnt("[[");}
		if(librarydatarequirementdatefiltervalueduration.hasUnit()) {

			l.addLibraryDataRqrmentDtFltrVlDurationUnt(String.valueOf(librarydatarequirementdatefiltervalueduration.getUnit()));
		} else {
			l.addLibraryDataRqrmentDtFltrVlDurationUnt("NULL");
		}

		if(librarydatarequirementdatefilteri == librarydatarequirementdatefilterlist.size()-1) {l.addLibraryDataRqrmentDtFltrVlDurationUnt("]]");}


		/******************** Library_DataRqrment_DtFltr_VlDuration_Sys ********************************************************************************/
		if(librarydatarequirementdatefilteri == 0) {l.addLibraryDataRqrmentDtFltrVlDurationSys("[[");}
		if(librarydatarequirementdatefiltervalueduration.hasSystem()) {

			l.addLibraryDataRqrmentDtFltrVlDurationSys(String.valueOf(librarydatarequirementdatefiltervalueduration.getSystem()));
		} else {
			l.addLibraryDataRqrmentDtFltrVlDurationSys("NULL");
		}

		if(librarydatarequirementdatefilteri == librarydatarequirementdatefilterlist.size()-1) {l.addLibraryDataRqrmentDtFltrVlDurationSys("]]");}


		/******************** Library_DataRqrment_DtFltr_VlDtTimeTyp ********************************************************************************/
		if(librarydatarequirementdatefilteri == 0) {l.addLibraryDataRqrmentDtFltrVlDtTimeTyp("[[");}
		if(librarydatarequirementdatefilter.hasValueDateTimeType()) {

			l.addLibraryDataRqrmentDtFltrVlDtTimeTyp("\""+librarydatarequirementdatefilter.getValueDateTimeType().getValueAsString()+"\"");
		} else {
			l.addLibraryDataRqrmentDtFltrVlDtTimeTyp("NULL");
		}

		if(librarydatarequirementdatefilteri == librarydatarequirementdatefilterlist.size()-1) {l.addLibraryDataRqrmentDtFltrVlDtTimeTyp("]]");}


		/******************** librarydatarequirementdatefiltervalueperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period librarydatarequirementdatefiltervalueperiod = librarydatarequirementdatefilter.getValuePeriod();

		/******************** Library_DataRqrment_DtFltr_VlPrd_Strt ********************************************************************************/
		if(librarydatarequirementdatefilteri == 0) {l.addLibraryDataRqrmentDtFltrVlPrdStrt("[[");}
		if(librarydatarequirementdatefiltervalueperiod.hasStart()) {

			l.addLibraryDataRqrmentDtFltrVlPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(librarydatarequirementdatefiltervalueperiod.getStart())+"\"");
		} else {
			l.addLibraryDataRqrmentDtFltrVlPrdStrt("NULL");
		}

		if(librarydatarequirementdatefilteri == librarydatarequirementdatefilterlist.size()-1) {l.addLibraryDataRqrmentDtFltrVlPrdStrt("]]");}


		/******************** Library_DataRqrment_DtFltr_VlPrd_End ********************************************************************************/
		if(librarydatarequirementdatefilteri == 0) {l.addLibraryDataRqrmentDtFltrVlPrdEnd("[[");}
		if(librarydatarequirementdatefiltervalueperiod.hasEnd()) {

			l.addLibraryDataRqrmentDtFltrVlPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(librarydatarequirementdatefiltervalueperiod.getEnd())+"\"");
		} else {
			l.addLibraryDataRqrmentDtFltrVlPrdEnd("NULL");
		}

		if(librarydatarequirementdatefilteri == librarydatarequirementdatefilterlist.size()-1) {l.addLibraryDataRqrmentDtFltrVlPrdEnd("]]");}


		 };
		 };
		return l;
	}
}
