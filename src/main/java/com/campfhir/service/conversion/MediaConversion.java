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
		if(m.getMediaBasedOn() != null ) {

				for( String currListStrSplit : m.getMediaBasedOn().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			media.addBasedOn(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Media_BodySite_Cdg_Cd ********************************************************************************/
		if(m.getMediaBodySiteCdgCd() != null ) {

			String[] arrayi0 = m.getMediaBodySiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getBodySite().getCoding().size() < i0+1) { media.getBodySite().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {media.getBodySite().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Media_BodySite_Cdg_Dsply ********************************************************************************/
		if(m.getMediaBodySiteCdgDsply() != null ) {

			String[] arrayi0 = m.getMediaBodySiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getBodySite().getCoding().size() < i0+1) { media.getBodySite().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {media.getBodySite().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Media_BodySite_Cdg_Sys ********************************************************************************/
		if(m.getMediaBodySiteCdgSys() != null ) {

			String[] arrayi0 = m.getMediaBodySiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getBodySite().getCoding().size() < i0+1) { media.getBodySite().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {media.getBodySite().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Media_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(m.getMediaBodySiteCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMediaBodySiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getBodySite().getCoding().size() < i0+1) { media.getBodySite().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {media.getBodySite().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Media_BodySite_Cdg_Vrsn ********************************************************************************/
		if(m.getMediaBodySiteCdgVrsn() != null ) {

			String[] arrayi0 = m.getMediaBodySiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getBodySite().getCoding().size() < i0+1) { media.getBodySite().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {media.getBodySite().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Media_BodySite_Txt ********************************************************************************/
		if(m.getMediaBodySiteTxt() != null ) {

			if(m.getMediaBodySiteTxt().replace("[","").replace("]","").equals("NULL") | m.getMediaBodySiteTxt()==null) {} else {
			media.getBodySite().setText(m.getMediaBodySiteTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Media_Cntnt_CntntTyp ********************************************************************************/
		if(m.getMediaCntntCntntTyp() != null ) {

			if(m.getMediaCntntCntntTyp().replace("[","").replace("]","").equals("NULL") | m.getMediaCntntCntntTyp()==null) {} else {
			media.getContent().setContentType(m.getMediaCntntCntntTyp().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Media_Cntnt_Creation ********************************************************************************/
		if(m.getMediaCntntCreation() != null ) {

			if(m.getMediaCntntCreation().replace("[","").replace("]","").equals("NULL") | m.getMediaCntntCreation()==null) {} else {
			media.getContent().setCreation(m.getMediaCntntCreation().replace("[","").replace("]","").equals("NULL") | m.getMediaCntntCreation()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMediaCntntCreation().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Media_Cntnt_Data ********************************************************************************/
		if(m.getMediaCntntData() != null ) {

			if(m.getMediaCntntData().replace("[","").replace("]","").equals("NULL") | m.getMediaCntntData()==null) {} else {
			media.getContent().setData(m.getMediaCntntData().getBytes());
			}
		}
		/******************** Media_Cntnt_Hash ********************************************************************************/
		if(m.getMediaCntntHash() != null ) {

			if(m.getMediaCntntHash().replace("[","").replace("]","").equals("NULL") | m.getMediaCntntHash()==null) {} else {
			media.getContent().setHash(m.getMediaCntntHash().getBytes());
			}
		}
		/******************** Media_Cntnt_Lnguage ********************************************************************************/
		if(m.getMediaCntntLnguage() != null ) {

			if(m.getMediaCntntLnguage().replace("[","").replace("]","").equals("NULL") | m.getMediaCntntLnguage()==null) {} else {
			media.getContent().setLanguage(m.getMediaCntntLnguage().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Media_Cntnt_Sz ********************************************************************************/
		if(m.getMediaCntntSz() != null ) {

			if(m.getMediaCntntSz().replace("[","").replace("]","").equals("NULL") | m.getMediaCntntSz()==null) {} else {
			media.getContent().setSize(Integer.parseInt(m.getMediaCntntSz().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Media_Cntnt_Ttl ********************************************************************************/
		if(m.getMediaCntntTtl() != null ) {

			if(m.getMediaCntntTtl().replace("[","").replace("]","").equals("NULL") | m.getMediaCntntTtl()==null) {} else {
			media.getContent().setTitle(m.getMediaCntntTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Media_Cntnt_Url ********************************************************************************/
		if(m.getMediaCntntUrl() != null ) {

			if(m.getMediaCntntUrl().replace("[","").replace("]","").equals("NULL") | m.getMediaCntntUrl()==null) {} else {
			media.getContent().setUrl(m.getMediaCntntUrl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Media_CreatedDtTimeTyp ********************************************************************************/
		if(m.getMediaCreatedDtTimeTyp() != null ) {

			if(m.getMediaCreatedDtTimeTyp().replace("[","").replace("]","").equals("NULL") | m.getMediaCreatedDtTimeTyp()==null) {} else {
			media.setCreated(new org.hl7.fhir.r4.model.DateTimeType(m.getMediaCreatedDtTimeTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Media_CreatedPrd_End ********************************************************************************/
		if(m.getMediaCreatedPrdEnd() != null ) {

			if(m.getMediaCreatedPrdEnd().replace("[","").replace("]","").equals("NULL") | m.getMediaCreatedPrdEnd()==null) {} else {
			media.getCreatedPeriod().setEnd(m.getMediaCreatedPrdEnd().replace("[","").replace("]","").equals("NULL") | m.getMediaCreatedPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMediaCreatedPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Media_CreatedPrd_Strt ********************************************************************************/
		if(m.getMediaCreatedPrdStrt() != null ) {

			if(m.getMediaCreatedPrdStrt().replace("[","").replace("]","").equals("NULL") | m.getMediaCreatedPrdStrt()==null) {} else {
			media.getCreatedPeriod().setStart(m.getMediaCreatedPrdStrt().replace("[","").replace("]","").equals("NULL") | m.getMediaCreatedPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMediaCreatedPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Media_Dvc ********************************************************************************/
		if(m.getMediaDvc() != null ) {

			if(m.getMediaDvc().replace("[","").replace("]","").equals("NULL") | m.getMediaDvc()==null) {} else {
			media.setDevice(new org.hl7.fhir.r4.model.Reference(m.getMediaDvc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Media_DvcNm ********************************************************************************/
		if(m.getMediaDvcNm() != null ) {

			if(m.getMediaDvcNm().replace("[","").replace("]","").equals("NULL") | m.getMediaDvcNm()==null) {} else {
			media.setDeviceName(m.getMediaDvcNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Media_Duration ********************************************************************************/
		if(m.getMediaDuration() != null ) {

			if(m.getMediaDuration().replace("[","").replace("]","").equals("NULL") | m.getMediaDuration()==null) {} else {
			media.setDuration((Double.parseDouble((m.getMediaDuration().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Media_Enc ********************************************************************************/
		if(m.getMediaEnc() != null ) {

			if(m.getMediaEnc().replace("[","").replace("]","").equals("NULL") | m.getMediaEnc()==null) {} else {
			media.setEncounter(new org.hl7.fhir.r4.model.Reference(m.getMediaEnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Media_Frames ********************************************************************************/
		if(m.getMediaFrames() != null ) {

			if(m.getMediaFrames().replace("[","").replace("]","").equals("NULL") | m.getMediaFrames()==null) {} else {
			media.setFrames(Integer.parseInt(m.getMediaFrames().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Media_Height ********************************************************************************/
		if(m.getMediaHeight() != null ) {

			if(m.getMediaHeight().replace("[","").replace("]","").equals("NULL") | m.getMediaHeight()==null) {} else {
			media.setHeight(Integer.parseInt(m.getMediaHeight().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Media_Id_Assigner ********************************************************************************/
		if(m.getMediaIdAssigner() != null ) {

			String[] arrayi0 = m.getMediaIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getIdentifier().size() < i0+1) { media.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {media.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Media_Id_Prd_End ********************************************************************************/
		if(m.getMediaIdPrdEnd() != null ) {

			String[] arrayi0 = m.getMediaIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getIdentifier().size() < i0+1) { media.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {media.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Media_Id_Prd_Strt ********************************************************************************/
		if(m.getMediaIdPrdStrt() != null ) {

			String[] arrayi0 = m.getMediaIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getIdentifier().size() < i0+1) { media.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {media.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Media_Id_Sys ********************************************************************************/
		if(m.getMediaIdSys() != null ) {

			String[] arrayi0 = m.getMediaIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getIdentifier().size() < i0+1) { media.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {media.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Media_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMediaIdTypCdgCd() != null ) {

			String[] arrayi0 = m.getMediaIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getIdentifier().size() < i0+1) { media.addIdentifier(); }
				String[] arrayi1 = m.getMediaIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(media.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { media.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {media.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Media_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMediaIdTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMediaIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getIdentifier().size() < i0+1) { media.addIdentifier(); }
				String[] arrayi1 = m.getMediaIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(media.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { media.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {media.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Media_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMediaIdTypCdgSys() != null ) {

			String[] arrayi0 = m.getMediaIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getIdentifier().size() < i0+1) { media.addIdentifier(); }
				String[] arrayi1 = m.getMediaIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(media.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { media.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {media.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Media_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMediaIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMediaIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getIdentifier().size() < i0+1) { media.addIdentifier(); }
				String[] arrayi1 = m.getMediaIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(media.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { media.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {media.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Media_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMediaIdTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMediaIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getIdentifier().size() < i0+1) { media.addIdentifier(); }
				String[] arrayi1 = m.getMediaIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(media.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { media.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {media.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Media_Id_Typ_Txt ********************************************************************************/
		if(m.getMediaIdTypTxt() != null ) {

			String[] arrayi0 = m.getMediaIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getIdentifier().size() < i0+1) { media.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {media.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Media_Id_Use ********************************************************************************/
		if(m.getMediaIdUse() != null ) {

			String[] arrayi0 = m.getMediaIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getIdentifier().size() < i0+1) { media.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {media.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Media_Id_Vl ********************************************************************************/
		if(m.getMediaIdVl() != null ) {

			String[] arrayi0 = m.getMediaIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getIdentifier().size() < i0+1) { media.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {media.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Media_Issued ********************************************************************************/
		if(m.getMediaIssued() != null ) {

			if(m.getMediaIssued().replace("[","").replace("]","").equals("NULL") | m.getMediaIssued()==null) {} else {
			media.setIssued(m.getMediaIssued().replace("[","").replace("]","").equals("NULL") | m.getMediaIssued()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMediaIssued().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Media_Modality_Cdg_Cd ********************************************************************************/
		if(m.getMediaModalityCdgCd() != null ) {

			String[] arrayi0 = m.getMediaModalityCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getModality().getCoding().size() < i0+1) { media.getModality().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {media.getModality().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Media_Modality_Cdg_Dsply ********************************************************************************/
		if(m.getMediaModalityCdgDsply() != null ) {

			String[] arrayi0 = m.getMediaModalityCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getModality().getCoding().size() < i0+1) { media.getModality().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {media.getModality().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Media_Modality_Cdg_Sys ********************************************************************************/
		if(m.getMediaModalityCdgSys() != null ) {

			String[] arrayi0 = m.getMediaModalityCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getModality().getCoding().size() < i0+1) { media.getModality().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {media.getModality().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Media_Modality_Cdg_UsrSltd ********************************************************************************/
		if(m.getMediaModalityCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMediaModalityCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getModality().getCoding().size() < i0+1) { media.getModality().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {media.getModality().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Media_Modality_Cdg_Vrsn ********************************************************************************/
		if(m.getMediaModalityCdgVrsn() != null ) {

			String[] arrayi0 = m.getMediaModalityCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getModality().getCoding().size() < i0+1) { media.getModality().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {media.getModality().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Media_Modality_Txt ********************************************************************************/
		if(m.getMediaModalityTxt() != null ) {

			if(m.getMediaModalityTxt().replace("[","").replace("]","").equals("NULL") | m.getMediaModalityTxt()==null) {} else {
			media.getModality().setText(m.getMediaModalityTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Media_Nt_AthrRfrnc ********************************************************************************/
		if(m.getMediaNtAthrRfrnc() != null ) {

			String[] arrayi0 = m.getMediaNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getNote().size() < i0+1) { media.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {media.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Media_Nt_AthrStrgTyp ********************************************************************************/
		if(m.getMediaNtAthrStrgTyp() != null ) {

			String[] arrayi0 = m.getMediaNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getNote().size() < i0+1) { media.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {media.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Media_Nt_Txt ********************************************************************************/
		if(m.getMediaNtTxt() != null ) {

			String[] arrayi0 = m.getMediaNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getNote().size() < i0+1) { media.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {media.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Media_Nt_Time ********************************************************************************/
		if(m.getMediaNtTime() != null ) {

			String[] arrayi0 = m.getMediaNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getNote().size() < i0+1) { media.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {media.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Media_Operator ********************************************************************************/
		if(m.getMediaOperator() != null ) {

			if(m.getMediaOperator().replace("[","").replace("]","").equals("NULL") | m.getMediaOperator()==null) {} else {
			media.setOperator(new org.hl7.fhir.r4.model.Reference(m.getMediaOperator().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Media_PartOf ********************************************************************************/
		if(m.getMediaPartOf() != null ) {

				for( String currListStrSplit : m.getMediaPartOf().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			media.addPartOf(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Media_RsnCd_Cdg_Cd ********************************************************************************/
		if(m.getMediaRsnCdCdgCd() != null ) {

			String[] arrayi0 = m.getMediaRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getReasonCode().size() < i0+1) { media.addReasonCode(); }
				String[] arrayi1 = m.getMediaRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(media.getReasonCode().get(i0).getCoding().size() < i1+1) { media.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {media.getReasonCode().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Media_RsnCd_Cdg_Dsply ********************************************************************************/
		if(m.getMediaRsnCdCdgDsply() != null ) {

			String[] arrayi0 = m.getMediaRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getReasonCode().size() < i0+1) { media.addReasonCode(); }
				String[] arrayi1 = m.getMediaRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(media.getReasonCode().get(i0).getCoding().size() < i1+1) { media.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {media.getReasonCode().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Media_RsnCd_Cdg_Sys ********************************************************************************/
		if(m.getMediaRsnCdCdgSys() != null ) {

			String[] arrayi0 = m.getMediaRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getReasonCode().size() < i0+1) { media.addReasonCode(); }
				String[] arrayi1 = m.getMediaRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(media.getReasonCode().get(i0).getCoding().size() < i1+1) { media.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {media.getReasonCode().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Media_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMediaRsnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMediaRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getReasonCode().size() < i0+1) { media.addReasonCode(); }
				String[] arrayi1 = m.getMediaRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(media.getReasonCode().get(i0).getCoding().size() < i1+1) { media.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {media.getReasonCode().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Media_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(m.getMediaRsnCdCdgVrsn() != null ) {

			String[] arrayi0 = m.getMediaRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getReasonCode().size() < i0+1) { media.addReasonCode(); }
				String[] arrayi1 = m.getMediaRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(media.getReasonCode().get(i0).getCoding().size() < i1+1) { media.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {media.getReasonCode().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Media_RsnCd_Txt ********************************************************************************/
		if(m.getMediaRsnCdTxt() != null ) {

			String[] arrayi0 = m.getMediaRsnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getReasonCode().size() < i0+1) { media.addReasonCode(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {media.getReasonCode().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Media_Sts ********************************************************************************/
		if(m.getMediaSts() != null ) {

			if(m.getMediaSts().replace("[","").replace("]","").equals("NULL") | m.getMediaSts()==null) {} else {
			media.setStatus(new org.hl7.fhir.r4.model.Media.MediaStatusEnumFactory().fromCode(m.getMediaSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Media_Sbjct ********************************************************************************/
		if(m.getMediaSbjct() != null ) {

			if(m.getMediaSbjct().replace("[","").replace("]","").equals("NULL") | m.getMediaSbjct()==null) {} else {
			media.setSubject(new org.hl7.fhir.r4.model.Reference(m.getMediaSbjct().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Media_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMediaTypCdgCd() != null ) {

			String[] arrayi0 = m.getMediaTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getType().getCoding().size() < i0+1) { media.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {media.getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Media_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMediaTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMediaTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getType().getCoding().size() < i0+1) { media.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {media.getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Media_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMediaTypCdgSys() != null ) {

			String[] arrayi0 = m.getMediaTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getType().getCoding().size() < i0+1) { media.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {media.getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Media_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMediaTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMediaTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getType().getCoding().size() < i0+1) { media.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {media.getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Media_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMediaTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMediaTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getType().getCoding().size() < i0+1) { media.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {media.getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Media_Typ_Txt ********************************************************************************/
		if(m.getMediaTypTxt() != null ) {

			if(m.getMediaTypTxt().replace("[","").replace("]","").equals("NULL") | m.getMediaTypTxt()==null) {} else {
			media.getType().setText(m.getMediaTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Media_View_Cdg_Cd ********************************************************************************/
		if(m.getMediaViewCdgCd() != null ) {

			String[] arrayi0 = m.getMediaViewCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getView().getCoding().size() < i0+1) { media.getView().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {media.getView().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Media_View_Cdg_Dsply ********************************************************************************/
		if(m.getMediaViewCdgDsply() != null ) {

			String[] arrayi0 = m.getMediaViewCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getView().getCoding().size() < i0+1) { media.getView().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {media.getView().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Media_View_Cdg_Sys ********************************************************************************/
		if(m.getMediaViewCdgSys() != null ) {

			String[] arrayi0 = m.getMediaViewCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getView().getCoding().size() < i0+1) { media.getView().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {media.getView().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Media_View_Cdg_UsrSltd ********************************************************************************/
		if(m.getMediaViewCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMediaViewCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getView().getCoding().size() < i0+1) { media.getView().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {media.getView().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Media_View_Cdg_Vrsn ********************************************************************************/
		if(m.getMediaViewCdgVrsn() != null ) {

			String[] arrayi0 = m.getMediaViewCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(media.getView().getCoding().size() < i0+1) { media.getView().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {media.getView().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Media_View_Txt ********************************************************************************/
		if(m.getMediaViewTxt() != null ) {

			if(m.getMediaViewTxt().replace("[","").replace("]","").equals("NULL") | m.getMediaViewTxt()==null) {} else {
			media.getView().setText(m.getMediaViewTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Media_Width ********************************************************************************/
		if(m.getMediaWidth() != null ) {

			if(m.getMediaWidth().replace("[","").replace("]","").equals("NULL") | m.getMediaWidth()==null) {} else {
			media.setWidth(Integer.parseInt(m.getMediaWidth().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return media;
	}
}
