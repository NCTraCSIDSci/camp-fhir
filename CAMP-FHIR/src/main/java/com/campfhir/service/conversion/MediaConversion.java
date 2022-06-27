package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Media;
public class MediaConversion 
{
	public org.hl7.fhir.r4.model.Media Medias(Media m) throws ParseException
	{
		org.hl7.fhir.r4.model.Media media = new org.hl7.fhir.r4.model.Media();

		/******************** id ********************************************************************************/
		media.setId(m.getId());

		/******************** Media_BasedOn ********************************************************************************/
		if(m.getMediaBasedOn() != null) {
			media.addBasedOn( new org.hl7.fhir.r4.model.Reference(m.getMediaBasedOn()));
		}
		/******************** mediabodysite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept mediabodysite =  new org.hl7.fhir.r4.model.CodeableConcept();
		media.setBodySite(mediabodysite);

		/******************** mediabodysitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding mediabodysitecoding =  new org.hl7.fhir.r4.model.Coding();
		mediabodysite.addCoding(mediabodysitecoding);

		/******************** Media_BodySite_Cdg_Cd ********************************************************************************/
		if(m.getMediaBodySiteCdgCd() != null) {
			mediabodysitecoding.setCode(m.getMediaBodySiteCdgCd());
		}
		/******************** Media_BodySite_Cdg_Dsply ********************************************************************************/
		if(m.getMediaBodySiteCdgDsply() != null) {
			mediabodysitecoding.setDisplay(m.getMediaBodySiteCdgDsply());
		}
		/******************** Media_BodySite_Cdg_Sys ********************************************************************************/
		if(m.getMediaBodySiteCdgSys() != null) {
			mediabodysitecoding.setSystem(m.getMediaBodySiteCdgSys());
		}
		/******************** Media_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(m.getMediaBodySiteCdgUsrSltd() != null) {
			mediabodysitecoding.setUserSelected(Boolean.parseBoolean(m.getMediaBodySiteCdgUsrSltd()));
		}
		/******************** Media_BodySite_Cdg_Vrsn ********************************************************************************/
		if(m.getMediaBodySiteCdgVrsn() != null) {
			mediabodysitecoding.setVersion(m.getMediaBodySiteCdgVrsn());
		}
		/******************** Media_BodySite_Txt ********************************************************************************/
		if(m.getMediaBodySiteTxt() != null) {
			mediabodysite.setText(m.getMediaBodySiteTxt());
		}
		/******************** mediacontent ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment mediacontent =  new org.hl7.fhir.r4.model.Attachment();
		media.setContent(mediacontent);

		/******************** Media_Cntnt_CntntTyp ********************************************************************************/
		if(m.getMediaCntntCntntTyp() != null) {
			mediacontent.setContentType(m.getMediaCntntCntntTyp());
		}
		/******************** Media_Cntnt_Creation ********************************************************************************/
		if(m.getMediaCntntCreation() != null) {
			java.text.SimpleDateFormat Media_Cntnt_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Media_Cntnt_Creationdate = Media_Cntnt_Creationsdf.parse(m.getMediaCntntCreation());
			mediacontent.setCreation(Media_Cntnt_Creationdate);
		}
		/******************** Media_Cntnt_Data ********************************************************************************/
		if(m.getMediaCntntData() != null) {
			mediacontent.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(m.getMediaCntntData()));
		}
		/******************** Media_Cntnt_Hash ********************************************************************************/
		if(m.getMediaCntntHash() != null) {
			mediacontent.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(m.getMediaCntntHash()));
		}
		/******************** Media_Cntnt_Lnguage ********************************************************************************/
		if(m.getMediaCntntLnguage() != null) {
			mediacontent.setLanguage(m.getMediaCntntLnguage());
		}
		/******************** Media_Cntnt_Sz ********************************************************************************/
		if(m.getMediaCntntSz() != null) {
			mediacontent.setSize(Integer.parseInt(m.getMediaCntntSz()));
		}
		/******************** Media_Cntnt_Ttl ********************************************************************************/
		if(m.getMediaCntntTtl() != null) {
			mediacontent.setTitle(m.getMediaCntntTtl());
		}
		/******************** Media_Cntnt_Url ********************************************************************************/
		if(m.getMediaCntntUrl() != null) {
			mediacontent.setUrl(m.getMediaCntntUrl());
		}
		/******************** Media_CreatedDtTimeTyp ********************************************************************************/
		if(m.getMediaCreatedDtTimeTyp() != null) {
			media.setCreated( new org.hl7.fhir.r4.model.DateTimeType(m.getMediaCreatedDtTimeTyp()));
		}
		/******************** mediacreatedperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period mediacreatedperiod =  new org.hl7.fhir.r4.model.Period();
		media.setCreated(mediacreatedperiod);

		/******************** Media_CreatedPrd_End ********************************************************************************/
		if(m.getMediaCreatedPrdEnd() != null) {
			java.text.SimpleDateFormat Media_CreatedPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Media_CreatedPrd_Enddate = Media_CreatedPrd_Endsdf.parse(m.getMediaCreatedPrdEnd());
			mediacreatedperiod.setEnd(Media_CreatedPrd_Enddate);
		}
		/******************** Media_CreatedPrd_Strt ********************************************************************************/
		if(m.getMediaCreatedPrdStrt() != null) {
			java.text.SimpleDateFormat Media_CreatedPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Media_CreatedPrd_Strtdate = Media_CreatedPrd_Strtsdf.parse(m.getMediaCreatedPrdStrt());
			mediacreatedperiod.setStart(Media_CreatedPrd_Strtdate);
		}
		/******************** Media_Dvc ********************************************************************************/
		if(m.getMediaDvc() != null) {
			media.setDevice( new org.hl7.fhir.r4.model.Reference(m.getMediaDvc()));
		}
		/******************** Media_DvcNm ********************************************************************************/
		if(m.getMediaDvcNm() != null) {
			media.setDeviceName(m.getMediaDvcNm());
		}
		/******************** Media_Duration ********************************************************************************/
		if(m.getMediaDuration() != null) {
			media.setDuration(new java.math.BigDecimal((m.getMediaDuration())));
		}
		/******************** Media_Enc ********************************************************************************/
		if(m.getMediaEnc() != null) {
			media.setEncounter( new org.hl7.fhir.r4.model.Reference(m.getMediaEnc()));
		}
		/******************** Media_Frames ********************************************************************************/
		if(m.getMediaFrames() != null) {
			media.setFrames(Integer.parseInt(m.getMediaFrames()));
		}
		/******************** Media_Height ********************************************************************************/
		if(m.getMediaHeight() != null) {
			media.setHeight(Integer.parseInt(m.getMediaHeight()));
		}
		/******************** mediaidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier mediaidentifier =  new org.hl7.fhir.r4.model.Identifier();
		media.addIdentifier(mediaidentifier);

		/******************** Media_Id_Assigner ********************************************************************************/
		if(m.getMediaIdAssigner() != null) {
			mediaidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(m.getMediaIdAssigner()));
		}
		/******************** mediaidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period mediaidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		mediaidentifier.setPeriod(mediaidentifierperiod);

		/******************** Media_Id_Prd_End ********************************************************************************/
		if(m.getMediaIdPrdEnd() != null) {
			java.text.SimpleDateFormat Media_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Media_Id_Prd_Enddate = Media_Id_Prd_Endsdf.parse(m.getMediaIdPrdEnd());
			mediaidentifierperiod.setEnd(Media_Id_Prd_Enddate);
		}
		/******************** Media_Id_Prd_Strt ********************************************************************************/
		if(m.getMediaIdPrdStrt() != null) {
			java.text.SimpleDateFormat Media_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Media_Id_Prd_Strtdate = Media_Id_Prd_Strtsdf.parse(m.getMediaIdPrdStrt());
			mediaidentifierperiod.setStart(Media_Id_Prd_Strtdate);
		}
		/******************** Media_Id_Sys ********************************************************************************/
		if(m.getMediaIdSys() != null) {
			mediaidentifier.setSystem(m.getMediaIdSys());
		}
		/******************** mediaidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept mediaidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		mediaidentifier.setType(mediaidentifiertype);

		/******************** mediaidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding mediaidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		mediaidentifiertype.addCoding(mediaidentifiertypecoding);

		/******************** Media_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMediaIdTypCdgCd() != null) {
			mediaidentifiertypecoding.setCode(m.getMediaIdTypCdgCd());
		}
		/******************** Media_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMediaIdTypCdgDsply() != null) {
			mediaidentifiertypecoding.setDisplay(m.getMediaIdTypCdgDsply());
		}
		/******************** Media_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMediaIdTypCdgSys() != null) {
			mediaidentifiertypecoding.setSystem(m.getMediaIdTypCdgSys());
		}
		/******************** Media_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMediaIdTypCdgUsrSltd() != null) {
			mediaidentifiertypecoding.setUserSelected(Boolean.parseBoolean(m.getMediaIdTypCdgUsrSltd()));
		}
		/******************** Media_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMediaIdTypCdgVrsn() != null) {
			mediaidentifiertypecoding.setVersion(m.getMediaIdTypCdgVrsn());
		}
		/******************** Media_Id_Typ_Txt ********************************************************************************/
		if(m.getMediaIdTypTxt() != null) {
			mediaidentifiertype.setText(m.getMediaIdTypTxt());
		}
		/******************** mediaidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory mediaidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		mediaidentifier.setUse(mediaidentifieruse.fromCode(m.getMediaIdUse()));

		/******************** Media_Id_Vl ********************************************************************************/
		if(m.getMediaIdVl() != null) {
			mediaidentifier.setValue(m.getMediaIdVl());
		}
		/******************** Media_Issued ********************************************************************************/
		if(m.getMediaIssued() != null) {
			java.text.SimpleDateFormat Media_Issuedsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Media_Issueddate = Media_Issuedsdf.parse(m.getMediaIssued());
			media.setIssued(Media_Issueddate);
		}
		/******************** mediamodality ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept mediamodality =  new org.hl7.fhir.r4.model.CodeableConcept();
		media.setModality(mediamodality);

		/******************** mediamodalitycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding mediamodalitycoding =  new org.hl7.fhir.r4.model.Coding();
		mediamodality.addCoding(mediamodalitycoding);

		/******************** Media_Modality_Cdg_Cd ********************************************************************************/
		if(m.getMediaModalityCdgCd() != null) {
			mediamodalitycoding.setCode(m.getMediaModalityCdgCd());
		}
		/******************** Media_Modality_Cdg_Dsply ********************************************************************************/
		if(m.getMediaModalityCdgDsply() != null) {
			mediamodalitycoding.setDisplay(m.getMediaModalityCdgDsply());
		}
		/******************** Media_Modality_Cdg_Sys ********************************************************************************/
		if(m.getMediaModalityCdgSys() != null) {
			mediamodalitycoding.setSystem(m.getMediaModalityCdgSys());
		}
		/******************** Media_Modality_Cdg_UsrSltd ********************************************************************************/
		if(m.getMediaModalityCdgUsrSltd() != null) {
			mediamodalitycoding.setUserSelected(Boolean.parseBoolean(m.getMediaModalityCdgUsrSltd()));
		}
		/******************** Media_Modality_Cdg_Vrsn ********************************************************************************/
		if(m.getMediaModalityCdgVrsn() != null) {
			mediamodalitycoding.setVersion(m.getMediaModalityCdgVrsn());
		}
		/******************** Media_Modality_Txt ********************************************************************************/
		if(m.getMediaModalityTxt() != null) {
			mediamodality.setText(m.getMediaModalityTxt());
		}
		/******************** medianote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation medianote =  new org.hl7.fhir.r4.model.Annotation();
		media.addNote(medianote);

		/******************** Media_Nt_AthrRfrnc ********************************************************************************/
		if(m.getMediaNtAthrRfrnc() != null) {
			medianote.setAuthor( new org.hl7.fhir.r4.model.Reference(m.getMediaNtAthrRfrnc()));
		}
		/******************** Media_Nt_AthrStrgTyp ********************************************************************************/
		if(m.getMediaNtAthrStrgTyp() != null) {
			medianote.setAuthor( new org.hl7.fhir.r4.model.StringType(m.getMediaNtAthrStrgTyp()));
		}
		/******************** Media_Nt_Txt ********************************************************************************/
		if(m.getMediaNtTxt() != null) {
			medianote.setText(m.getMediaNtTxt());
		}
		/******************** Media_Nt_Time ********************************************************************************/
		if(m.getMediaNtTime() != null) {
			java.text.SimpleDateFormat Media_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Media_Nt_Timedate = Media_Nt_Timesdf.parse(m.getMediaNtTime());
			medianote.setTime(Media_Nt_Timedate);
		}
		/******************** Media_Operator ********************************************************************************/
		if(m.getMediaOperator() != null) {
			media.setOperator( new org.hl7.fhir.r4.model.Reference(m.getMediaOperator()));
		}
		/******************** Media_PartOf ********************************************************************************/
		if(m.getMediaPartOf() != null) {
			media.addPartOf( new org.hl7.fhir.r4.model.Reference(m.getMediaPartOf()));
		}
		/******************** mediareasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept mediareasoncode =  new org.hl7.fhir.r4.model.CodeableConcept();
		media.addReasonCode(mediareasoncode);

		/******************** mediareasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding mediareasoncodecoding =  new org.hl7.fhir.r4.model.Coding();
		mediareasoncode.addCoding(mediareasoncodecoding);

		/******************** Media_RsnCd_Cdg_Cd ********************************************************************************/
		if(m.getMediaRsnCdCdgCd() != null) {
			mediareasoncodecoding.setCode(m.getMediaRsnCdCdgCd());
		}
		/******************** Media_RsnCd_Cdg_Dsply ********************************************************************************/
		if(m.getMediaRsnCdCdgDsply() != null) {
			mediareasoncodecoding.setDisplay(m.getMediaRsnCdCdgDsply());
		}
		/******************** Media_RsnCd_Cdg_Sys ********************************************************************************/
		if(m.getMediaRsnCdCdgSys() != null) {
			mediareasoncodecoding.setSystem(m.getMediaRsnCdCdgSys());
		}
		/******************** Media_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMediaRsnCdCdgUsrSltd() != null) {
			mediareasoncodecoding.setUserSelected(Boolean.parseBoolean(m.getMediaRsnCdCdgUsrSltd()));
		}
		/******************** Media_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(m.getMediaRsnCdCdgVrsn() != null) {
			mediareasoncodecoding.setVersion(m.getMediaRsnCdCdgVrsn());
		}
		/******************** Media_RsnCd_Txt ********************************************************************************/
		if(m.getMediaRsnCdTxt() != null) {
			mediareasoncode.setText(m.getMediaRsnCdTxt());
		}
		/******************** mediastatus ********************************************************************************/
		org.hl7.fhir.r4.model.Media.MediaStatusEnumFactory mediastatus =  new org.hl7.fhir.r4.model.Media.MediaStatusEnumFactory();
		media.setStatus(mediastatus.fromCode(m.getMediaSts()));

		/******************** Media_Sbjct ********************************************************************************/
		if(m.getMediaSbjct() != null) {
			media.setSubject( new org.hl7.fhir.r4.model.Reference(m.getMediaSbjct()));
		}
		/******************** mediatype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept mediatype =  new org.hl7.fhir.r4.model.CodeableConcept();
		media.setType(mediatype);

		/******************** mediatypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding mediatypecoding =  new org.hl7.fhir.r4.model.Coding();
		mediatype.addCoding(mediatypecoding);

		/******************** Media_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMediaTypCdgCd() != null) {
			mediatypecoding.setCode(m.getMediaTypCdgCd());
		}
		/******************** Media_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMediaTypCdgDsply() != null) {
			mediatypecoding.setDisplay(m.getMediaTypCdgDsply());
		}
		/******************** Media_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMediaTypCdgSys() != null) {
			mediatypecoding.setSystem(m.getMediaTypCdgSys());
		}
		/******************** Media_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMediaTypCdgUsrSltd() != null) {
			mediatypecoding.setUserSelected(Boolean.parseBoolean(m.getMediaTypCdgUsrSltd()));
		}
		/******************** Media_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMediaTypCdgVrsn() != null) {
			mediatypecoding.setVersion(m.getMediaTypCdgVrsn());
		}
		/******************** Media_Typ_Txt ********************************************************************************/
		if(m.getMediaTypTxt() != null) {
			mediatype.setText(m.getMediaTypTxt());
		}
		/******************** mediaview ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept mediaview =  new org.hl7.fhir.r4.model.CodeableConcept();
		media.setView(mediaview);

		/******************** mediaviewcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding mediaviewcoding =  new org.hl7.fhir.r4.model.Coding();
		mediaview.addCoding(mediaviewcoding);

		/******************** Media_View_Cdg_Cd ********************************************************************************/
		if(m.getMediaViewCdgCd() != null) {
			mediaviewcoding.setCode(m.getMediaViewCdgCd());
		}
		/******************** Media_View_Cdg_Dsply ********************************************************************************/
		if(m.getMediaViewCdgDsply() != null) {
			mediaviewcoding.setDisplay(m.getMediaViewCdgDsply());
		}
		/******************** Media_View_Cdg_Sys ********************************************************************************/
		if(m.getMediaViewCdgSys() != null) {
			mediaviewcoding.setSystem(m.getMediaViewCdgSys());
		}
		/******************** Media_View_Cdg_UsrSltd ********************************************************************************/
		if(m.getMediaViewCdgUsrSltd() != null) {
			mediaviewcoding.setUserSelected(Boolean.parseBoolean(m.getMediaViewCdgUsrSltd()));
		}
		/******************** Media_View_Cdg_Vrsn ********************************************************************************/
		if(m.getMediaViewCdgVrsn() != null) {
			mediaviewcoding.setVersion(m.getMediaViewCdgVrsn());
		}
		/******************** Media_View_Txt ********************************************************************************/
		if(m.getMediaViewTxt() != null) {
			mediaview.setText(m.getMediaViewTxt());
		}
		/******************** Media_Width ********************************************************************************/
		if(m.getMediaWidth() != null) {
			media.setWidth(Integer.parseInt(m.getMediaWidth()));
		}
		return media;
	}
}
