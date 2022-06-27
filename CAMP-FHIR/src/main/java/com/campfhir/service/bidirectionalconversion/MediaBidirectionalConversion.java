package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Media;
public class MediaBidirectionalConversion 
{
	public Media Medias(org.hl7.fhir.r4.model.Media media) throws ParseException
	{
		 main.java.com.campfhir.model.Media m = new  main.java.com.campfhir.model.Media();

		/******************** id ********************************************************************************/
		media.setId(m.getId());

		/******************** mediatype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept mediatype = media.getType();

		/******************** Media_Typ_Txt ********************************************************************************/
		if(mediatype.hasText()) {
			m.setMediaTypTxt(String.valueOf(mediatype.getText()));
		}
		/******************** mediatypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding mediatypecoding = mediatype.getCodingFirstRep();

		/******************** Media_Typ_Cdg_Vrsn ********************************************************************************/
		if(mediatypecoding.hasVersion()) {
			m.setMediaTypCdgVrsn(String.valueOf(mediatypecoding.getVersion()));
		}
		/******************** Media_Typ_Cdg_Dsply ********************************************************************************/
		if(mediatypecoding.hasDisplay()) {
			m.setMediaTypCdgDsply(String.valueOf(mediatypecoding.getDisplay()));
		}
		/******************** Media_Typ_Cdg_Cd ********************************************************************************/
		if(mediatypecoding.hasCode()) {
			m.setMediaTypCdgCd(String.valueOf(mediatypecoding.getCode()));
		}
		/******************** Media_Typ_Cdg_UsrSltd ********************************************************************************/
		if(mediatypecoding.hasUserSelected()) {
			m.setMediaTypCdgUsrSltd(String.valueOf(mediatypecoding.getUserSelected()));
		}
		/******************** Media_Typ_Cdg_Sys ********************************************************************************/
		if(mediatypecoding.hasSystem()) {
			m.setMediaTypCdgSys(String.valueOf(mediatypecoding.getSystem()));
		}
		/******************** mediacontent ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment mediacontent = media.getContent();

		/******************** Media_Cntnt_Sz ********************************************************************************/
		if(mediacontent.hasSize()) {
			m.setMediaCntntSz(String.valueOf(mediacontent.getSize()));
		}
		/******************** Media_Cntnt_Lnguage ********************************************************************************/
		if(mediacontent.hasLanguage()) {
			m.setMediaCntntLnguage(String.valueOf(mediacontent.getLanguage()));
		}
		/******************** Media_Cntnt_Ttl ********************************************************************************/
		if(mediacontent.hasTitle()) {
			m.setMediaCntntTtl(String.valueOf(mediacontent.getTitle()));
		}
		/******************** Media_Cntnt_Url ********************************************************************************/
		if(mediacontent.hasUrl()) {
			m.setMediaCntntUrl(String.valueOf(mediacontent.getUrl()));
		}
		/******************** Media_Cntnt_Data ********************************************************************************/
		if(mediacontent.hasData()) {
			m.setMediaCntntData(String.valueOf(mediacontent.getData()));
		}

		/******************** Media_Cntnt_Hash ********************************************************************************/
		if(mediacontent.hasHash()) {
			m.setMediaCntntHash(String.valueOf(mediacontent.getHash()));
		}

		/******************** Media_Cntnt_Creation ********************************************************************************/
		if(mediacontent.hasCreation()) {
			m.setMediaCntntCreation(String.valueOf(mediacontent.getCreation()));
		}
		/******************** Media_PartOf ********************************************************************************/
		if(media.hasPartOf()) {
			m.setMediaPartOf(String.valueOf(media.getPartOfFirstRep()));
		}
		/******************** Media_Issued ********************************************************************************/
		if(media.hasIssued()) {
			m.setMediaIssued(String.valueOf(media.getIssued()));
		}
		/******************** Media_DvcNm ********************************************************************************/
		if(media.hasDeviceName()) {
			m.setMediaDvcNm(String.valueOf(media.getDeviceName()));
		}
		/******************** mediamodality ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept mediamodality = media.getModality();

		/******************** Media_Modality_Txt ********************************************************************************/
		if(mediamodality.hasText()) {
			m.setMediaModalityTxt(String.valueOf(mediamodality.getText()));
		}
		/******************** mediamodalitycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding mediamodalitycoding = mediamodality.getCodingFirstRep();

		/******************** Media_Modality_Cdg_Vrsn ********************************************************************************/
		if(mediamodalitycoding.hasVersion()) {
			m.setMediaModalityCdgVrsn(String.valueOf(mediamodalitycoding.getVersion()));
		}
		/******************** Media_Modality_Cdg_Dsply ********************************************************************************/
		if(mediamodalitycoding.hasDisplay()) {
			m.setMediaModalityCdgDsply(String.valueOf(mediamodalitycoding.getDisplay()));
		}
		/******************** Media_Modality_Cdg_Cd ********************************************************************************/
		if(mediamodalitycoding.hasCode()) {
			m.setMediaModalityCdgCd(String.valueOf(mediamodalitycoding.getCode()));
		}
		/******************** Media_Modality_Cdg_UsrSltd ********************************************************************************/
		if(mediamodalitycoding.hasUserSelected()) {
			m.setMediaModalityCdgUsrSltd(String.valueOf(mediamodalitycoding.getUserSelected()));
		}
		/******************** Media_Modality_Cdg_Sys ********************************************************************************/
		if(mediamodalitycoding.hasSystem()) {
			m.setMediaModalityCdgSys(String.valueOf(mediamodalitycoding.getSystem()));
		}
		/******************** Media_Enc ********************************************************************************/
		if(media.hasEncounter()) {
			m.setMediaEnc(String.valueOf(media.getEncounter()));
		}
		/******************** Media_Sbjct ********************************************************************************/
		if(media.hasSubject()) {
			m.setMediaSbjct(String.valueOf(media.getSubject()));
		}
		/******************** mediastatus ********************************************************************************/
		org.hl7.fhir.r4.model.Media.MediaStatus mediastatus = media.getStatus();
		m.setMediaSts(mediastatus.toCode());

		/******************** Media_BasedOn ********************************************************************************/
		if(media.hasBasedOn()) {
			m.setMediaBasedOn(String.valueOf(media.getBasedOnFirstRep()));
		}
		/******************** medianote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation medianote = media.getNoteFirstRep();

		/******************** Media_Nt_Time ********************************************************************************/
		if(medianote.hasTime()) {
			m.setMediaNtTime(String.valueOf(medianote.getTime()));
		}
		/******************** Media_Nt_Txt ********************************************************************************/
		if(medianote.hasText()) {
			m.setMediaNtTxt(String.valueOf(medianote.getText()));
		}
		/******************** Media_Nt_AthrRfrnc ********************************************************************************/
		if(medianote.hasAuthorReference()) {
			m.setMediaNtAthrRfrnc(String.valueOf(medianote.getAuthorReference()));
		}
		/******************** Media_Nt_AthrStrgTyp ********************************************************************************/
		if(medianote.hasAuthorStringType()) {
			m.setMediaNtAthrStrgTyp(String.valueOf(medianote.getAuthorStringType()));
		}
		/******************** Media_Duration ********************************************************************************/
		if(media.hasDuration()) {
			m.setMediaDuration(String.valueOf(media.getDuration()));
		}
		/******************** Media_CreatedDtTimeTyp ********************************************************************************/
		if(media.hasCreatedDateTimeType()) {
			m.setMediaCreatedDtTimeTyp(String.valueOf(media.getCreatedDateTimeType()));
		}
		/******************** Media_Operator ********************************************************************************/
		if(media.hasOperator()) {
			m.setMediaOperator(String.valueOf(media.getOperator()));
		}
		/******************** mediacreatedperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period mediacreatedperiod = media.getCreatedPeriod();

		/******************** Media_CreatedPrd_Strt ********************************************************************************/
		if(mediacreatedperiod.hasStart()) {
			m.setMediaCreatedPrdStrt(String.valueOf(mediacreatedperiod.getStart()));
		}
		/******************** Media_CreatedPrd_End ********************************************************************************/
		if(mediacreatedperiod.hasEnd()) {
			m.setMediaCreatedPrdEnd(String.valueOf(mediacreatedperiod.getEnd()));
		}
		/******************** Media_Height ********************************************************************************/
		if(media.hasHeight()) {
			m.setMediaHeight(String.valueOf(media.getHeight()));
		}
		/******************** mediaview ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept mediaview = media.getView();

		/******************** Media_View_Txt ********************************************************************************/
		if(mediaview.hasText()) {
			m.setMediaViewTxt(String.valueOf(mediaview.getText()));
		}
		/******************** mediaviewcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding mediaviewcoding = mediaview.getCodingFirstRep();

		/******************** Media_View_Cdg_Vrsn ********************************************************************************/
		if(mediaviewcoding.hasVersion()) {
			m.setMediaViewCdgVrsn(String.valueOf(mediaviewcoding.getVersion()));
		}
		/******************** Media_View_Cdg_Dsply ********************************************************************************/
		if(mediaviewcoding.hasDisplay()) {
			m.setMediaViewCdgDsply(String.valueOf(mediaviewcoding.getDisplay()));
		}
		/******************** Media_View_Cdg_Cd ********************************************************************************/
		if(mediaviewcoding.hasCode()) {
			m.setMediaViewCdgCd(String.valueOf(mediaviewcoding.getCode()));
		}
		/******************** Media_View_Cdg_UsrSltd ********************************************************************************/
		if(mediaviewcoding.hasUserSelected()) {
			m.setMediaViewCdgUsrSltd(String.valueOf(mediaviewcoding.getUserSelected()));
		}
		/******************** Media_View_Cdg_Sys ********************************************************************************/
		if(mediaviewcoding.hasSystem()) {
			m.setMediaViewCdgSys(String.valueOf(mediaviewcoding.getSystem()));
		}
		/******************** Media_Width ********************************************************************************/
		if(media.hasWidth()) {
			m.setMediaWidth(String.valueOf(media.getWidth()));
		}
		/******************** Media_Frames ********************************************************************************/
		if(media.hasFrames()) {
			m.setMediaFrames(String.valueOf(media.getFrames()));
		}
		/******************** mediabodysite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept mediabodysite = media.getBodySite();

		/******************** Media_BodySite_Txt ********************************************************************************/
		if(mediabodysite.hasText()) {
			m.setMediaBodySiteTxt(String.valueOf(mediabodysite.getText()));
		}
		/******************** mediabodysitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding mediabodysitecoding = mediabodysite.getCodingFirstRep();

		/******************** Media_BodySite_Cdg_Vrsn ********************************************************************************/
		if(mediabodysitecoding.hasVersion()) {
			m.setMediaBodySiteCdgVrsn(String.valueOf(mediabodysitecoding.getVersion()));
		}
		/******************** Media_BodySite_Cdg_Dsply ********************************************************************************/
		if(mediabodysitecoding.hasDisplay()) {
			m.setMediaBodySiteCdgDsply(String.valueOf(mediabodysitecoding.getDisplay()));
		}
		/******************** Media_BodySite_Cdg_Cd ********************************************************************************/
		if(mediabodysitecoding.hasCode()) {
			m.setMediaBodySiteCdgCd(String.valueOf(mediabodysitecoding.getCode()));
		}
		/******************** Media_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(mediabodysitecoding.hasUserSelected()) {
			m.setMediaBodySiteCdgUsrSltd(String.valueOf(mediabodysitecoding.getUserSelected()));
		}
		/******************** Media_BodySite_Cdg_Sys ********************************************************************************/
		if(mediabodysitecoding.hasSystem()) {
			m.setMediaBodySiteCdgSys(String.valueOf(mediabodysitecoding.getSystem()));
		}
		/******************** mediaidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier mediaidentifier = media.getIdentifierFirstRep();

		/******************** Media_Id_Vl ********************************************************************************/
		if(mediaidentifier.hasValue()) {
			m.setMediaIdVl(String.valueOf(mediaidentifier.getValue()));
		}
		/******************** mediaidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept mediaidentifiertype = mediaidentifier.getType();

		/******************** Media_Id_Typ_Txt ********************************************************************************/
		if(mediaidentifiertype.hasText()) {
			m.setMediaIdTypTxt(String.valueOf(mediaidentifiertype.getText()));
		}
		/******************** mediaidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding mediaidentifiertypecoding = mediaidentifiertype.getCodingFirstRep();

		/******************** Media_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(mediaidentifiertypecoding.hasVersion()) {
			m.setMediaIdTypCdgVrsn(String.valueOf(mediaidentifiertypecoding.getVersion()));
		}
		/******************** Media_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(mediaidentifiertypecoding.hasDisplay()) {
			m.setMediaIdTypCdgDsply(String.valueOf(mediaidentifiertypecoding.getDisplay()));
		}
		/******************** Media_Id_Typ_Cdg_Cd ********************************************************************************/
		if(mediaidentifiertypecoding.hasCode()) {
			m.setMediaIdTypCdgCd(String.valueOf(mediaidentifiertypecoding.getCode()));
		}
		/******************** Media_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(mediaidentifiertypecoding.hasUserSelected()) {
			m.setMediaIdTypCdgUsrSltd(String.valueOf(mediaidentifiertypecoding.getUserSelected()));
		}
		/******************** Media_Id_Typ_Cdg_Sys ********************************************************************************/
		if(mediaidentifiertypecoding.hasSystem()) {
			m.setMediaIdTypCdgSys(String.valueOf(mediaidentifiertypecoding.getSystem()));
		}
		/******************** mediaidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period mediaidentifierperiod = mediaidentifier.getPeriod();

		/******************** Media_Id_Prd_Strt ********************************************************************************/
		if(mediaidentifierperiod.hasStart()) {
			m.setMediaIdPrdStrt(String.valueOf(mediaidentifierperiod.getStart()));
		}
		/******************** Media_Id_Prd_End ********************************************************************************/
		if(mediaidentifierperiod.hasEnd()) {
			m.setMediaIdPrdEnd(String.valueOf(mediaidentifierperiod.getEnd()));
		}
		/******************** Media_Id_Assigner ********************************************************************************/
		if(mediaidentifier.hasAssigner()) {
			m.setMediaIdAssigner(String.valueOf(mediaidentifier.getAssigner()));
		}
		/******************** Media_Id_Sys ********************************************************************************/
		if(mediaidentifier.hasSystem()) {
			m.setMediaIdSys(String.valueOf(mediaidentifier.getSystem()));
		}
		/******************** mediaidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse mediaidentifieruse = mediaidentifier.getUse();
		m.setMediaIdUse(mediaidentifieruse.toCode());

		/******************** mediareasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept mediareasoncode = media.getReasonCodeFirstRep();

		/******************** Media_RsnCd_Txt ********************************************************************************/
		if(mediareasoncode.hasText()) {
			m.setMediaRsnCdTxt(String.valueOf(mediareasoncode.getText()));
		}
		/******************** mediareasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding mediareasoncodecoding = mediareasoncode.getCodingFirstRep();

		/******************** Media_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(mediareasoncodecoding.hasVersion()) {
			m.setMediaRsnCdCdgVrsn(String.valueOf(mediareasoncodecoding.getVersion()));
		}
		/******************** Media_RsnCd_Cdg_Dsply ********************************************************************************/
		if(mediareasoncodecoding.hasDisplay()) {
			m.setMediaRsnCdCdgDsply(String.valueOf(mediareasoncodecoding.getDisplay()));
		}
		/******************** Media_RsnCd_Cdg_Cd ********************************************************************************/
		if(mediareasoncodecoding.hasCode()) {
			m.setMediaRsnCdCdgCd(String.valueOf(mediareasoncodecoding.getCode()));
		}
		/******************** Media_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(mediareasoncodecoding.hasUserSelected()) {
			m.setMediaRsnCdCdgUsrSltd(String.valueOf(mediareasoncodecoding.getUserSelected()));
		}
		/******************** Media_RsnCd_Cdg_Sys ********************************************************************************/
		if(mediareasoncodecoding.hasSystem()) {
			m.setMediaRsnCdCdgSys(String.valueOf(mediareasoncodecoding.getSystem()));
		}
		/******************** Media_Dvc ********************************************************************************/
		if(media.hasDevice()) {
			m.setMediaDvc(String.valueOf(media.getDevice()));
		}
		return m;
	}
}
