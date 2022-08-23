package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Media;
public class MediaBidirectionalConversion 
{
	public Media Medias(org.hl7.fhir.r4.model.Media media) throws ParseException
	{
		 main.java.com.campfhir.model.Media m = new  main.java.com.campfhir.model.Media();

		/******************** id ********************************************************************************/
		m.setId(media.getIdElement().getIdPart());

		/******************** mediatype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept mediatype = media.getType();

		/******************** Media_Typ_Txt ********************************************************************************/
		if(mediatype.hasText()) {

			m.addMediaTypTxt(String.valueOf(mediatype.getText()));
		} else {
			m.addMediaTypTxt("NULL");
		}


		/******************** mediatypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> mediatypecodinglist = mediatype.getCoding();
		for(int mediatypecodingi = 0; mediatypecodingi<mediatypecodinglist.size();mediatypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  mediatypecoding = mediatypecodinglist.get(mediatypecodingi);

		/******************** Media_Typ_Cdg_Dsply ********************************************************************************/
		if(mediatypecodingi == 0) {m.addMediaTypCdgDsply("[");}
		if(mediatypecoding.hasDisplay()) {

			m.addMediaTypCdgDsply(String.valueOf(mediatypecoding.getDisplay()));
		} else {
			m.addMediaTypCdgDsply("NULL");
		}

		if(mediatypecodingi == mediatypecodinglist.size()-1) {m.addMediaTypCdgDsply("]");}


		/******************** Media_Typ_Cdg_Vrsn ********************************************************************************/
		if(mediatypecodingi == 0) {m.addMediaTypCdgVrsn("[");}
		if(mediatypecoding.hasVersion()) {

			m.addMediaTypCdgVrsn(String.valueOf(mediatypecoding.getVersion()));
		} else {
			m.addMediaTypCdgVrsn("NULL");
		}

		if(mediatypecodingi == mediatypecodinglist.size()-1) {m.addMediaTypCdgVrsn("]");}


		/******************** Media_Typ_Cdg_Cd ********************************************************************************/
		if(mediatypecodingi == 0) {m.addMediaTypCdgCd("[");}
		if(mediatypecoding.hasCode()) {

			m.addMediaTypCdgCd(String.valueOf(mediatypecoding.getCode()));
		} else {
			m.addMediaTypCdgCd("NULL");
		}

		if(mediatypecodingi == mediatypecodinglist.size()-1) {m.addMediaTypCdgCd("]");}


		/******************** Media_Typ_Cdg_UsrSltd ********************************************************************************/
		if(mediatypecodingi == 0) {m.addMediaTypCdgUsrSltd("[");}
		if(mediatypecoding.hasUserSelected()) {

			m.addMediaTypCdgUsrSltd(String.valueOf(mediatypecoding.getUserSelected()));
		} else {
			m.addMediaTypCdgUsrSltd("NULL");
		}

		if(mediatypecodingi == mediatypecodinglist.size()-1) {m.addMediaTypCdgUsrSltd("]");}


		/******************** Media_Typ_Cdg_Sys ********************************************************************************/
		if(mediatypecodingi == 0) {m.addMediaTypCdgSys("[");}
		if(mediatypecoding.hasSystem()) {

			m.addMediaTypCdgSys(String.valueOf(mediatypecoding.getSystem()));
		} else {
			m.addMediaTypCdgSys("NULL");
		}

		if(mediatypecodingi == mediatypecodinglist.size()-1) {m.addMediaTypCdgSys("]");}


		 };
		/******************** mediacontent ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment mediacontent = media.getContent();

		/******************** Media_Cntnt_Sz ********************************************************************************/
		if(mediacontent.hasSize()) {

			m.addMediaCntntSz(String.valueOf(mediacontent.getSize()));
		} else {
			m.addMediaCntntSz("NULL");
		}


		/******************** Media_Cntnt_Lnguage ********************************************************************************/
		if(mediacontent.hasLanguage()) {

			m.addMediaCntntLnguage(String.valueOf(mediacontent.getLanguage()));
		} else {
			m.addMediaCntntLnguage("NULL");
		}


		/******************** Media_Cntnt_Hash ********************************************************************************/
		if(mediacontent.hasHash()) {

			m.addMediaCntntHash(new String(mediacontent.getHash()));
		} else {
			m.addMediaCntntHash("NULL");
		}


		/******************** Media_Cntnt_Data ********************************************************************************/
		if(mediacontent.hasData()) {

			m.addMediaCntntData(new String(mediacontent.getData()));
		} else {
			m.addMediaCntntData("NULL");
		}


		/******************** Media_Cntnt_Creation ********************************************************************************/
		if(mediacontent.hasCreation()) {

			m.addMediaCntntCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(mediacontent.getCreation())+"\"");
		} else {
			m.addMediaCntntCreation("NULL");
		}


		/******************** Media_Cntnt_Ttl ********************************************************************************/
		if(mediacontent.hasTitle()) {

			m.addMediaCntntTtl(String.valueOf(mediacontent.getTitle()));
		} else {
			m.addMediaCntntTtl("NULL");
		}


		/******************** Media_Cntnt_Url ********************************************************************************/
		if(mediacontent.hasUrl()) {

			m.addMediaCntntUrl(String.valueOf(mediacontent.getUrl()));
		} else {
			m.addMediaCntntUrl("NULL");
		}


		/******************** mediamodality ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept mediamodality = media.getModality();

		/******************** Media_Modality_Txt ********************************************************************************/
		if(mediamodality.hasText()) {

			m.addMediaModalityTxt(String.valueOf(mediamodality.getText()));
		} else {
			m.addMediaModalityTxt("NULL");
		}


		/******************** mediamodalitycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> mediamodalitycodinglist = mediamodality.getCoding();
		for(int mediamodalitycodingi = 0; mediamodalitycodingi<mediamodalitycodinglist.size();mediamodalitycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  mediamodalitycoding = mediamodalitycodinglist.get(mediamodalitycodingi);

		/******************** Media_Modality_Cdg_Dsply ********************************************************************************/
		if(mediamodalitycodingi == 0) {m.addMediaModalityCdgDsply("[");}
		if(mediamodalitycoding.hasDisplay()) {

			m.addMediaModalityCdgDsply(String.valueOf(mediamodalitycoding.getDisplay()));
		} else {
			m.addMediaModalityCdgDsply("NULL");
		}

		if(mediamodalitycodingi == mediamodalitycodinglist.size()-1) {m.addMediaModalityCdgDsply("]");}


		/******************** Media_Modality_Cdg_Vrsn ********************************************************************************/
		if(mediamodalitycodingi == 0) {m.addMediaModalityCdgVrsn("[");}
		if(mediamodalitycoding.hasVersion()) {

			m.addMediaModalityCdgVrsn(String.valueOf(mediamodalitycoding.getVersion()));
		} else {
			m.addMediaModalityCdgVrsn("NULL");
		}

		if(mediamodalitycodingi == mediamodalitycodinglist.size()-1) {m.addMediaModalityCdgVrsn("]");}


		/******************** Media_Modality_Cdg_Cd ********************************************************************************/
		if(mediamodalitycodingi == 0) {m.addMediaModalityCdgCd("[");}
		if(mediamodalitycoding.hasCode()) {

			m.addMediaModalityCdgCd(String.valueOf(mediamodalitycoding.getCode()));
		} else {
			m.addMediaModalityCdgCd("NULL");
		}

		if(mediamodalitycodingi == mediamodalitycodinglist.size()-1) {m.addMediaModalityCdgCd("]");}


		/******************** Media_Modality_Cdg_UsrSltd ********************************************************************************/
		if(mediamodalitycodingi == 0) {m.addMediaModalityCdgUsrSltd("[");}
		if(mediamodalitycoding.hasUserSelected()) {

			m.addMediaModalityCdgUsrSltd(String.valueOf(mediamodalitycoding.getUserSelected()));
		} else {
			m.addMediaModalityCdgUsrSltd("NULL");
		}

		if(mediamodalitycodingi == mediamodalitycodinglist.size()-1) {m.addMediaModalityCdgUsrSltd("]");}


		/******************** Media_Modality_Cdg_Sys ********************************************************************************/
		if(mediamodalitycodingi == 0) {m.addMediaModalityCdgSys("[");}
		if(mediamodalitycoding.hasSystem()) {

			m.addMediaModalityCdgSys(String.valueOf(mediamodalitycoding.getSystem()));
		} else {
			m.addMediaModalityCdgSys("NULL");
		}

		if(mediamodalitycodingi == mediamodalitycodinglist.size()-1) {m.addMediaModalityCdgSys("]");}


		 };
		/******************** Media_Sbjct ********************************************************************************/
		if(media.hasSubject()) {

			if(media.getSubject().getReference() != null) {
			m.addMediaSbjct(media.getSubject().getReference());
			}
		} else {
			m.addMediaSbjct("NULL");
		}


		/******************** mediastatus ********************************************************************************/
		org.hl7.fhir.r4.model.Media.MediaStatus mediastatus = media.getStatus();
		if(mediastatus!=null) {
			m.addMediaSts(mediastatus.toCode());
		} else {
			m.addMediaSts("NULL");
		}

		/******************** Media_Enc ********************************************************************************/
		if(media.hasEncounter()) {

			if(media.getEncounter().getReference() != null) {
			m.addMediaEnc(media.getEncounter().getReference());
			}
		} else {
			m.addMediaEnc("NULL");
		}


		/******************** Media_BasedOn ********************************************************************************/
		if(media.hasBasedOn()) {

			String  array = "[";
			for(int incr=0; incr<media.getBasedOn().size(); incr++) {
				array = array + media.getBasedOn().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMediaBasedOn(array);

		} else {
			m.addMediaBasedOn("NULL");
		}


		/******************** mediareasoncode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> mediareasoncodelist = media.getReasonCode();
		for(int mediareasoncodei = 0; mediareasoncodei<mediareasoncodelist.size();mediareasoncodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  mediareasoncode = mediareasoncodelist.get(mediareasoncodei);

		/******************** Media_RsnCd_Txt ********************************************************************************/
		if(mediareasoncodei == 0) {m.addMediaRsnCdTxt("[");}
		if(mediareasoncode.hasText()) {

			m.addMediaRsnCdTxt(String.valueOf(mediareasoncode.getText()));
		} else {
			m.addMediaRsnCdTxt("NULL");
		}

		if(mediareasoncodei == mediareasoncodelist.size()-1) {m.addMediaRsnCdTxt("]");}


		/******************** mediareasoncodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> mediareasoncodecodinglist = mediareasoncode.getCoding();
		for(int mediareasoncodecodingi = 0; mediareasoncodecodingi<mediareasoncodecodinglist.size();mediareasoncodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  mediareasoncodecoding = mediareasoncodecodinglist.get(mediareasoncodecodingi);

		/******************** Media_RsnCd_Cdg_Dsply ********************************************************************************/
		if(mediareasoncodecodingi == 0) {m.addMediaRsnCdCdgDsply("[[");}
		if(mediareasoncodecoding.hasDisplay()) {

			m.addMediaRsnCdCdgDsply(String.valueOf(mediareasoncodecoding.getDisplay()));
		} else {
			m.addMediaRsnCdCdgDsply("NULL");
		}

		if(mediareasoncodecodingi == mediareasoncodecodinglist.size()-1) {m.addMediaRsnCdCdgDsply("]]");}


		/******************** Media_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(mediareasoncodecodingi == 0) {m.addMediaRsnCdCdgVrsn("[[");}
		if(mediareasoncodecoding.hasVersion()) {

			m.addMediaRsnCdCdgVrsn(String.valueOf(mediareasoncodecoding.getVersion()));
		} else {
			m.addMediaRsnCdCdgVrsn("NULL");
		}

		if(mediareasoncodecodingi == mediareasoncodecodinglist.size()-1) {m.addMediaRsnCdCdgVrsn("]]");}


		/******************** Media_RsnCd_Cdg_Cd ********************************************************************************/
		if(mediareasoncodecodingi == 0) {m.addMediaRsnCdCdgCd("[[");}
		if(mediareasoncodecoding.hasCode()) {

			m.addMediaRsnCdCdgCd(String.valueOf(mediareasoncodecoding.getCode()));
		} else {
			m.addMediaRsnCdCdgCd("NULL");
		}

		if(mediareasoncodecodingi == mediareasoncodecodinglist.size()-1) {m.addMediaRsnCdCdgCd("]]");}


		/******************** Media_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(mediareasoncodecodingi == 0) {m.addMediaRsnCdCdgUsrSltd("[[");}
		if(mediareasoncodecoding.hasUserSelected()) {

			m.addMediaRsnCdCdgUsrSltd(String.valueOf(mediareasoncodecoding.getUserSelected()));
		} else {
			m.addMediaRsnCdCdgUsrSltd("NULL");
		}

		if(mediareasoncodecodingi == mediareasoncodecodinglist.size()-1) {m.addMediaRsnCdCdgUsrSltd("]]");}


		/******************** Media_RsnCd_Cdg_Sys ********************************************************************************/
		if(mediareasoncodecodingi == 0) {m.addMediaRsnCdCdgSys("[[");}
		if(mediareasoncodecoding.hasSystem()) {

			m.addMediaRsnCdCdgSys(String.valueOf(mediareasoncodecoding.getSystem()));
		} else {
			m.addMediaRsnCdCdgSys("NULL");
		}

		if(mediareasoncodecodingi == mediareasoncodecodinglist.size()-1) {m.addMediaRsnCdCdgSys("]]");}


		 };
		 };
		/******************** medianote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> medianotelist = media.getNote();
		for(int medianotei = 0; medianotei<medianotelist.size();medianotei++ ) {
		org.hl7.fhir.r4.model.Annotation  medianote = medianotelist.get(medianotei);

		/******************** Media_Nt_Time ********************************************************************************/
		if(medianotei == 0) {m.addMediaNtTime("[");}
		if(medianote.hasTime()) {

			m.addMediaNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(medianote.getTime())+"\"");
		} else {
			m.addMediaNtTime("NULL");
		}

		if(medianotei == medianotelist.size()-1) {m.addMediaNtTime("]");}


		/******************** Media_Nt_AthrRfrnc ********************************************************************************/
		if(medianotei == 0) {m.addMediaNtAthrRfrnc("[");}
		if(medianote.hasAuthorReference()) {

			if(medianote.getAuthorReference().getReference() != null) {
			m.addMediaNtAthrRfrnc(medianote.getAuthorReference().getReference());
			}
		} else {
			m.addMediaNtAthrRfrnc("NULL");
		}

		if(medianotei == medianotelist.size()-1) {m.addMediaNtAthrRfrnc("]");}


		/******************** Media_Nt_Txt ********************************************************************************/
		if(medianotei == 0) {m.addMediaNtTxt("[");}
		if(medianote.hasText()) {

			m.addMediaNtTxt(String.valueOf(medianote.getText()));
		} else {
			m.addMediaNtTxt("NULL");
		}

		if(medianotei == medianotelist.size()-1) {m.addMediaNtTxt("]");}


		/******************** Media_Nt_AthrStrgTyp ********************************************************************************/
		if(medianotei == 0) {m.addMediaNtAthrStrgTyp("[");}
		if(medianote.hasAuthorStringType()) {

			m.addMediaNtAthrStrgTyp("\""+medianote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			m.addMediaNtAthrStrgTyp("NULL");
		}

		if(medianotei == medianotelist.size()-1) {m.addMediaNtAthrStrgTyp("]");}


		 };
		/******************** mediaidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> mediaidentifierlist = media.getIdentifier();
		for(int mediaidentifieri = 0; mediaidentifieri<mediaidentifierlist.size();mediaidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  mediaidentifier = mediaidentifierlist.get(mediaidentifieri);

		/******************** Media_Id_Vl ********************************************************************************/
		if(mediaidentifieri == 0) {m.addMediaIdVl("[");}
		if(mediaidentifier.hasValue()) {

			m.addMediaIdVl(String.valueOf(mediaidentifier.getValue()));
		} else {
			m.addMediaIdVl("NULL");
		}

		if(mediaidentifieri == mediaidentifierlist.size()-1) {m.addMediaIdVl("]");}


		/******************** mediaidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept mediaidentifiertype = mediaidentifier.getType();

		/******************** Media_Id_Typ_Txt ********************************************************************************/
		if(mediaidentifieri == 0) {m.addMediaIdTypTxt("[");}
		if(mediaidentifiertype.hasText()) {

			m.addMediaIdTypTxt(String.valueOf(mediaidentifiertype.getText()));
		} else {
			m.addMediaIdTypTxt("NULL");
		}

		if(mediaidentifieri == mediaidentifierlist.size()-1) {m.addMediaIdTypTxt("]");}


		/******************** mediaidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> mediaidentifiertypecodinglist = mediaidentifiertype.getCoding();
		for(int mediaidentifiertypecodingi = 0; mediaidentifiertypecodingi<mediaidentifiertypecodinglist.size();mediaidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  mediaidentifiertypecoding = mediaidentifiertypecodinglist.get(mediaidentifiertypecodingi);

		/******************** Media_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(mediaidentifiertypecodingi == 0) {m.addMediaIdTypCdgDsply("[[");}
		if(mediaidentifiertypecoding.hasDisplay()) {

			m.addMediaIdTypCdgDsply(String.valueOf(mediaidentifiertypecoding.getDisplay()));
		} else {
			m.addMediaIdTypCdgDsply("NULL");
		}

		if(mediaidentifiertypecodingi == mediaidentifiertypecodinglist.size()-1) {m.addMediaIdTypCdgDsply("]]");}


		/******************** Media_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(mediaidentifiertypecodingi == 0) {m.addMediaIdTypCdgVrsn("[[");}
		if(mediaidentifiertypecoding.hasVersion()) {

			m.addMediaIdTypCdgVrsn(String.valueOf(mediaidentifiertypecoding.getVersion()));
		} else {
			m.addMediaIdTypCdgVrsn("NULL");
		}

		if(mediaidentifiertypecodingi == mediaidentifiertypecodinglist.size()-1) {m.addMediaIdTypCdgVrsn("]]");}


		/******************** Media_Id_Typ_Cdg_Cd ********************************************************************************/
		if(mediaidentifiertypecodingi == 0) {m.addMediaIdTypCdgCd("[[");}
		if(mediaidentifiertypecoding.hasCode()) {

			m.addMediaIdTypCdgCd(String.valueOf(mediaidentifiertypecoding.getCode()));
		} else {
			m.addMediaIdTypCdgCd("NULL");
		}

		if(mediaidentifiertypecodingi == mediaidentifiertypecodinglist.size()-1) {m.addMediaIdTypCdgCd("]]");}


		/******************** Media_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(mediaidentifiertypecodingi == 0) {m.addMediaIdTypCdgUsrSltd("[[");}
		if(mediaidentifiertypecoding.hasUserSelected()) {

			m.addMediaIdTypCdgUsrSltd(String.valueOf(mediaidentifiertypecoding.getUserSelected()));
		} else {
			m.addMediaIdTypCdgUsrSltd("NULL");
		}

		if(mediaidentifiertypecodingi == mediaidentifiertypecodinglist.size()-1) {m.addMediaIdTypCdgUsrSltd("]]");}


		/******************** Media_Id_Typ_Cdg_Sys ********************************************************************************/
		if(mediaidentifiertypecodingi == 0) {m.addMediaIdTypCdgSys("[[");}
		if(mediaidentifiertypecoding.hasSystem()) {

			m.addMediaIdTypCdgSys(String.valueOf(mediaidentifiertypecoding.getSystem()));
		} else {
			m.addMediaIdTypCdgSys("NULL");
		}

		if(mediaidentifiertypecodingi == mediaidentifiertypecodinglist.size()-1) {m.addMediaIdTypCdgSys("]]");}


		 };
		/******************** mediaidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period mediaidentifierperiod = mediaidentifier.getPeriod();

		/******************** Media_Id_Prd_Strt ********************************************************************************/
		if(mediaidentifieri == 0) {m.addMediaIdPrdStrt("[");}
		if(mediaidentifierperiod.hasStart()) {

			m.addMediaIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(mediaidentifierperiod.getStart())+"\"");
		} else {
			m.addMediaIdPrdStrt("NULL");
		}

		if(mediaidentifieri == mediaidentifierlist.size()-1) {m.addMediaIdPrdStrt("]");}


		/******************** Media_Id_Prd_End ********************************************************************************/
		if(mediaidentifieri == 0) {m.addMediaIdPrdEnd("[");}
		if(mediaidentifierperiod.hasEnd()) {

			m.addMediaIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(mediaidentifierperiod.getEnd())+"\"");
		} else {
			m.addMediaIdPrdEnd("NULL");
		}

		if(mediaidentifieri == mediaidentifierlist.size()-1) {m.addMediaIdPrdEnd("]");}


		/******************** mediaidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse mediaidentifieruse = mediaidentifier.getUse();
		if(mediaidentifieruse!=null) {
		if(mediaidentifieri == 0) {

		m.addMediaIdUse("[");		}
			m.addMediaIdUse(mediaidentifieruse.toCode());
		if(mediaidentifieri == mediaidentifierlist.size()-1) {

		m.addMediaIdUse("]");		}

		} else {
			m.addMediaIdUse("NULL");
		}

		/******************** Media_Id_Assigner ********************************************************************************/
		if(mediaidentifieri == 0) {m.addMediaIdAssigner("[");}
		if(mediaidentifier.hasAssigner()) {

			if(mediaidentifier.getAssigner().getReference() != null) {
			m.addMediaIdAssigner(mediaidentifier.getAssigner().getReference());
			}
		} else {
			m.addMediaIdAssigner("NULL");
		}

		if(mediaidentifieri == mediaidentifierlist.size()-1) {m.addMediaIdAssigner("]");}


		/******************** Media_Id_Sys ********************************************************************************/
		if(mediaidentifieri == 0) {m.addMediaIdSys("[");}
		if(mediaidentifier.hasSystem()) {

			m.addMediaIdSys(String.valueOf(mediaidentifier.getSystem()));
		} else {
			m.addMediaIdSys("NULL");
		}

		if(mediaidentifieri == mediaidentifierlist.size()-1) {m.addMediaIdSys("]");}


		 };
		/******************** mediabodysite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept mediabodysite = media.getBodySite();

		/******************** Media_BodySite_Txt ********************************************************************************/
		if(mediabodysite.hasText()) {

			m.addMediaBodySiteTxt(String.valueOf(mediabodysite.getText()));
		} else {
			m.addMediaBodySiteTxt("NULL");
		}


		/******************** mediabodysitecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> mediabodysitecodinglist = mediabodysite.getCoding();
		for(int mediabodysitecodingi = 0; mediabodysitecodingi<mediabodysitecodinglist.size();mediabodysitecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  mediabodysitecoding = mediabodysitecodinglist.get(mediabodysitecodingi);

		/******************** Media_BodySite_Cdg_Dsply ********************************************************************************/
		if(mediabodysitecodingi == 0) {m.addMediaBodySiteCdgDsply("[");}
		if(mediabodysitecoding.hasDisplay()) {

			m.addMediaBodySiteCdgDsply(String.valueOf(mediabodysitecoding.getDisplay()));
		} else {
			m.addMediaBodySiteCdgDsply("NULL");
		}

		if(mediabodysitecodingi == mediabodysitecodinglist.size()-1) {m.addMediaBodySiteCdgDsply("]");}


		/******************** Media_BodySite_Cdg_Vrsn ********************************************************************************/
		if(mediabodysitecodingi == 0) {m.addMediaBodySiteCdgVrsn("[");}
		if(mediabodysitecoding.hasVersion()) {

			m.addMediaBodySiteCdgVrsn(String.valueOf(mediabodysitecoding.getVersion()));
		} else {
			m.addMediaBodySiteCdgVrsn("NULL");
		}

		if(mediabodysitecodingi == mediabodysitecodinglist.size()-1) {m.addMediaBodySiteCdgVrsn("]");}


		/******************** Media_BodySite_Cdg_Cd ********************************************************************************/
		if(mediabodysitecodingi == 0) {m.addMediaBodySiteCdgCd("[");}
		if(mediabodysitecoding.hasCode()) {

			m.addMediaBodySiteCdgCd(String.valueOf(mediabodysitecoding.getCode()));
		} else {
			m.addMediaBodySiteCdgCd("NULL");
		}

		if(mediabodysitecodingi == mediabodysitecodinglist.size()-1) {m.addMediaBodySiteCdgCd("]");}


		/******************** Media_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(mediabodysitecodingi == 0) {m.addMediaBodySiteCdgUsrSltd("[");}
		if(mediabodysitecoding.hasUserSelected()) {

			m.addMediaBodySiteCdgUsrSltd(String.valueOf(mediabodysitecoding.getUserSelected()));
		} else {
			m.addMediaBodySiteCdgUsrSltd("NULL");
		}

		if(mediabodysitecodingi == mediabodysitecodinglist.size()-1) {m.addMediaBodySiteCdgUsrSltd("]");}


		/******************** Media_BodySite_Cdg_Sys ********************************************************************************/
		if(mediabodysitecodingi == 0) {m.addMediaBodySiteCdgSys("[");}
		if(mediabodysitecoding.hasSystem()) {

			m.addMediaBodySiteCdgSys(String.valueOf(mediabodysitecoding.getSystem()));
		} else {
			m.addMediaBodySiteCdgSys("NULL");
		}

		if(mediabodysitecodingi == mediabodysitecodinglist.size()-1) {m.addMediaBodySiteCdgSys("]");}


		 };
		/******************** mediacreatedperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period mediacreatedperiod = media.getCreatedPeriod();

		/******************** Media_CreatedPrd_Strt ********************************************************************************/
		if(mediacreatedperiod.hasStart()) {

			m.addMediaCreatedPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(mediacreatedperiod.getStart())+"\"");
		} else {
			m.addMediaCreatedPrdStrt("NULL");
		}


		/******************** Media_CreatedPrd_End ********************************************************************************/
		if(mediacreatedperiod.hasEnd()) {

			m.addMediaCreatedPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(mediacreatedperiod.getEnd())+"\"");
		} else {
			m.addMediaCreatedPrdEnd("NULL");
		}


		/******************** Media_Operator ********************************************************************************/
		if(media.hasOperator()) {

			if(media.getOperator().getReference() != null) {
			m.addMediaOperator(media.getOperator().getReference());
			}
		} else {
			m.addMediaOperator("NULL");
		}


		/******************** mediaview ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept mediaview = media.getView();

		/******************** Media_View_Txt ********************************************************************************/
		if(mediaview.hasText()) {

			m.addMediaViewTxt(String.valueOf(mediaview.getText()));
		} else {
			m.addMediaViewTxt("NULL");
		}


		/******************** mediaviewcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> mediaviewcodinglist = mediaview.getCoding();
		for(int mediaviewcodingi = 0; mediaviewcodingi<mediaviewcodinglist.size();mediaviewcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  mediaviewcoding = mediaviewcodinglist.get(mediaviewcodingi);

		/******************** Media_View_Cdg_Dsply ********************************************************************************/
		if(mediaviewcodingi == 0) {m.addMediaViewCdgDsply("[");}
		if(mediaviewcoding.hasDisplay()) {

			m.addMediaViewCdgDsply(String.valueOf(mediaviewcoding.getDisplay()));
		} else {
			m.addMediaViewCdgDsply("NULL");
		}

		if(mediaviewcodingi == mediaviewcodinglist.size()-1) {m.addMediaViewCdgDsply("]");}


		/******************** Media_View_Cdg_Vrsn ********************************************************************************/
		if(mediaviewcodingi == 0) {m.addMediaViewCdgVrsn("[");}
		if(mediaviewcoding.hasVersion()) {

			m.addMediaViewCdgVrsn(String.valueOf(mediaviewcoding.getVersion()));
		} else {
			m.addMediaViewCdgVrsn("NULL");
		}

		if(mediaviewcodingi == mediaviewcodinglist.size()-1) {m.addMediaViewCdgVrsn("]");}


		/******************** Media_View_Cdg_Cd ********************************************************************************/
		if(mediaviewcodingi == 0) {m.addMediaViewCdgCd("[");}
		if(mediaviewcoding.hasCode()) {

			m.addMediaViewCdgCd(String.valueOf(mediaviewcoding.getCode()));
		} else {
			m.addMediaViewCdgCd("NULL");
		}

		if(mediaviewcodingi == mediaviewcodinglist.size()-1) {m.addMediaViewCdgCd("]");}


		/******************** Media_View_Cdg_UsrSltd ********************************************************************************/
		if(mediaviewcodingi == 0) {m.addMediaViewCdgUsrSltd("[");}
		if(mediaviewcoding.hasUserSelected()) {

			m.addMediaViewCdgUsrSltd(String.valueOf(mediaviewcoding.getUserSelected()));
		} else {
			m.addMediaViewCdgUsrSltd("NULL");
		}

		if(mediaviewcodingi == mediaviewcodinglist.size()-1) {m.addMediaViewCdgUsrSltd("]");}


		/******************** Media_View_Cdg_Sys ********************************************************************************/
		if(mediaviewcodingi == 0) {m.addMediaViewCdgSys("[");}
		if(mediaviewcoding.hasSystem()) {

			m.addMediaViewCdgSys(String.valueOf(mediaviewcoding.getSystem()));
		} else {
			m.addMediaViewCdgSys("NULL");
		}

		if(mediaviewcodingi == mediaviewcodinglist.size()-1) {m.addMediaViewCdgSys("]");}


		 };
		/******************** Media_Height ********************************************************************************/
		if(media.hasHeight()) {

			m.addMediaHeight(String.valueOf(media.getHeight()));
		} else {
			m.addMediaHeight("NULL");
		}


		/******************** Media_Frames ********************************************************************************/
		if(media.hasFrames()) {

			m.addMediaFrames(String.valueOf(media.getFrames()));
		} else {
			m.addMediaFrames("NULL");
		}


		/******************** Media_Width ********************************************************************************/
		if(media.hasWidth()) {

			m.addMediaWidth(String.valueOf(media.getWidth()));
		} else {
			m.addMediaWidth("NULL");
		}


		/******************** Media_CreatedDtTimeTyp ********************************************************************************/
		if(media.hasCreatedDateTimeType()) {

			m.addMediaCreatedDtTimeTyp("\""+media.getCreatedDateTimeType().getValueAsString()+"\"");
		} else {
			m.addMediaCreatedDtTimeTyp("NULL");
		}


		/******************** Media_Dvc ********************************************************************************/
		if(media.hasDevice()) {

			if(media.getDevice().getReference() != null) {
			m.addMediaDvc(media.getDevice().getReference());
			}
		} else {
			m.addMediaDvc("NULL");
		}


		/******************** Media_Issued ********************************************************************************/
		if(media.hasIssued()) {

			m.addMediaIssued("\""+ca.uhn.fhir.util.DateUtils.formatDate(media.getIssued())+"\"");
		} else {
			m.addMediaIssued("NULL");
		}


		/******************** Media_Duration ********************************************************************************/
		if(media.hasDuration()) {

			m.addMediaDuration(String.valueOf(media.getDuration()));
		} else {
			m.addMediaDuration("NULL");
		}


		/******************** Media_DvcNm ********************************************************************************/
		if(media.hasDeviceName()) {

			m.addMediaDvcNm(String.valueOf(media.getDeviceName()));
		} else {
			m.addMediaDvcNm("NULL");
		}


		/******************** Media_PartOf ********************************************************************************/
		if(media.hasPartOf()) {

			String  array = "[";
			for(int incr=0; incr<media.getPartOf().size(); incr++) {
				array = array + media.getPartOf().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMediaPartOf(array);

		} else {
			m.addMediaPartOf("NULL");
		}


		return m;
	}
}
