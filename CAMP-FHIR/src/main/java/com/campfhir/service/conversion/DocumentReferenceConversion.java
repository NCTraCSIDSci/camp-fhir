package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

import main.java.com.campfhir.model.DocumentReference;
public class DocumentReferenceConversion 
{
	public static DateTimeFormatter formatter = new DateTimeFormatterBuilder()
		    .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'"))
		    .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX"))
            .appendOptional(DateTimeFormatter.ofPattern("EEE, d MMM yyyy HH:mm:ss 'GMT'"))
		    .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
		    .toFormatter();
	

	public static Date convertStringToDate(String dateString) {
		 try {
			 return Date.from(LocalDateTime.parse(dateString, formatter).atZone(ZoneOffset.UTC).toInstant());
		 } catch(Exception e) {
			 return Date.from(LocalDate.parse(dateString, formatter).atStartOfDay(ZoneId.systemDefault()).toInstant());
		 }
	}
	
	public org.hl7.fhir.r4.model.DocumentReference DocumentReferences(DocumentReference d) throws ParseException
	{
		org.hl7.fhir.r4.model.DocumentReference documentreference = new org.hl7.fhir.r4.model.DocumentReference();

		/******************** id ********************************************************************************/
		documentreference.setId(d.getId());

		/******************** DocRfrnc_Authenticator ********************************************************************************/
		if(d.getDocRfrncAuthenticator() != null ) {

			if(d.getDocRfrncAuthenticator().replace("[","").replace("]","").equals("NULL") | d.getDocRfrncAuthenticator()==null) {} else {
			documentreference.setAuthenticator(new org.hl7.fhir.r4.model.Reference(d.getDocRfrncAuthenticator().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DocRfrnc_Athr ********************************************************************************/
		if(d.getDocRfrncAthr() != null ) {

				for( String currListStrSplit : d.getDocRfrncAthr().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			documentreference.addAuthor(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** DocRfrnc_Ctgry_Cdg_Cd ********************************************************************************/
		if(d.getDocRfrncCtgryCdgCd() != null ) {

			String[] arrayi0 = d.getDocRfrncCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getCategory().size() < i0+1) { documentreference.addCategory(); }
				String[] arrayi1 = d.getDocRfrncCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(documentreference.getCategory().get(i0).getCoding().size() < i1+1) { documentreference.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {documentreference.getCategory().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DocRfrnc_Ctgry_Cdg_Dsply ********************************************************************************/
		if(d.getDocRfrncCtgryCdgDsply() != null ) {

			String[] arrayi0 = d.getDocRfrncCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getCategory().size() < i0+1) { documentreference.addCategory(); }
				String[] arrayi1 = d.getDocRfrncCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(documentreference.getCategory().get(i0).getCoding().size() < i1+1) { documentreference.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {documentreference.getCategory().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DocRfrnc_Ctgry_Cdg_Sys ********************************************************************************/
		if(d.getDocRfrncCtgryCdgSys() != null ) {

			String[] arrayi0 = d.getDocRfrncCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getCategory().size() < i0+1) { documentreference.addCategory(); }
				String[] arrayi1 = d.getDocRfrncCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(documentreference.getCategory().get(i0).getCoding().size() < i1+1) { documentreference.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {documentreference.getCategory().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DocRfrnc_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(d.getDocRfrncCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDocRfrncCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getCategory().size() < i0+1) { documentreference.addCategory(); }
				String[] arrayi1 = d.getDocRfrncCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(documentreference.getCategory().get(i0).getCoding().size() < i1+1) { documentreference.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {documentreference.getCategory().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** DocRfrnc_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(d.getDocRfrncCtgryCdgVrsn() != null ) {

			String[] arrayi0 = d.getDocRfrncCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getCategory().size() < i0+1) { documentreference.addCategory(); }
				String[] arrayi1 = d.getDocRfrncCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(documentreference.getCategory().get(i0).getCoding().size() < i1+1) { documentreference.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {documentreference.getCategory().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DocRfrnc_Ctgry_Txt ********************************************************************************/
		if(d.getDocRfrncCtgryTxt() != null ) {

			String[] arrayi0 = d.getDocRfrncCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getCategory().size() < i0+1) { documentreference.addCategory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getCategory().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocRfrnc_Cntnt_Attchmnt_CntntTyp ********************************************************************************/
		if(d.getDocRfrncCntntAttchmntCntntTyp() != null ) {

			String[] arrayi0 = d.getDocRfrncCntntAttchmntCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getContent().size() < i0+1) { documentreference.addContent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getContent().get(i0).getAttachment().setContentType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocRfrnc_Cntnt_Attchmnt_Creation ********************************************************************************/
		if(d.getDocRfrncCntntAttchmntCreation() != null ) {

			String[] arrayi0 = d.getDocRfrncCntntAttchmntCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getContent().size() < i0+1) { documentreference.addContent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getContent().get(i0).getAttachment().setCreation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : convertStringToDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DocRfrnc_Cntnt_Attchmnt_Data ********************************************************************************/
		if(d.getDocRfrncCntntAttchmntData() != null ) {

			String[] arrayi0 = d.getDocRfrncCntntAttchmntData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getContent().size() < i0+1) { documentreference.addContent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getContent().get(i0).getAttachment().setData(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** DocRfrnc_Cntnt_Attchmnt_Hash ********************************************************************************/
		if(d.getDocRfrncCntntAttchmntHash() != null ) {

			String[] arrayi0 = d.getDocRfrncCntntAttchmntHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getContent().size() < i0+1) { documentreference.addContent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getContent().get(i0).getAttachment().setHash(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** DocRfrnc_Cntnt_Attchmnt_Lnguage ********************************************************************************/
		if(d.getDocRfrncCntntAttchmntLnguage() != null ) {

			String[] arrayi0 = d.getDocRfrncCntntAttchmntLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getContent().size() < i0+1) { documentreference.addContent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getContent().get(i0).getAttachment().setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocRfrnc_Cntnt_Attchmnt_Sz ********************************************************************************/
		if(d.getDocRfrncCntntAttchmntSz() != null ) {

			String[] arrayi0 = d.getDocRfrncCntntAttchmntSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getContent().size() < i0+1) { documentreference.addContent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getContent().get(i0).getAttachment().setSize(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DocRfrnc_Cntnt_Attchmnt_Ttl ********************************************************************************/
		if(d.getDocRfrncCntntAttchmntTtl() != null ) {

			String[] arrayi0 = d.getDocRfrncCntntAttchmntTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getContent().size() < i0+1) { documentreference.addContent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getContent().get(i0).getAttachment().setTitle(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocRfrnc_Cntnt_Attchmnt_Url ********************************************************************************/
		if(d.getDocRfrncCntntAttchmntUrl() != null ) {

			String[] arrayi0 = d.getDocRfrncCntntAttchmntUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getContent().size() < i0+1) { documentreference.addContent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getContent().get(i0).getAttachment().setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocRfrnc_Cntnt_Frmat_Cd ********************************************************************************/
		if(d.getDocRfrncCntntFrmatCd() != null ) {

			String[] arrayi0 = d.getDocRfrncCntntFrmatCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getContent().size() < i0+1) { documentreference.addContent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getContent().get(i0).getFormat().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocRfrnc_Cntnt_Frmat_Dsply ********************************************************************************/
		if(d.getDocRfrncCntntFrmatDsply() != null ) {

			String[] arrayi0 = d.getDocRfrncCntntFrmatDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getContent().size() < i0+1) { documentreference.addContent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getContent().get(i0).getFormat().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocRfrnc_Cntnt_Frmat_Sys ********************************************************************************/
		if(d.getDocRfrncCntntFrmatSys() != null ) {

			String[] arrayi0 = d.getDocRfrncCntntFrmatSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getContent().size() < i0+1) { documentreference.addContent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getContent().get(i0).getFormat().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocRfrnc_Cntnt_Frmat_UsrSltd ********************************************************************************/
		if(d.getDocRfrncCntntFrmatUsrSltd() != null ) {

			String[] arrayi0 = d.getDocRfrncCntntFrmatUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getContent().size() < i0+1) { documentreference.addContent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getContent().get(i0).getFormat().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DocRfrnc_Cntnt_Frmat_Vrsn ********************************************************************************/
		if(d.getDocRfrncCntntFrmatVrsn() != null ) {

			String[] arrayi0 = d.getDocRfrncCntntFrmatVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getContent().size() < i0+1) { documentreference.addContent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getContent().get(i0).getFormat().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocRfrnc_Cntxt_Enc ********************************************************************************/
		if(d.getDocRfrncCntxtEnc() != null ) {

				for( String currListStrSplit : d.getDocRfrncCntxtEnc().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			documentreference.getContext().addEncounter(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** DocRfrnc_Cntxt_Evnt_Cdg_Cd ********************************************************************************/
		if(d.getDocRfrncCntxtEvntCdgCd() != null ) {

			String[] arrayi0 = d.getDocRfrncCntxtEvntCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getContext().getEvent().size() < i0+1) { documentreference.getContext().addEvent(); }
				String[] arrayi1 = d.getDocRfrncCntxtEvntCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(documentreference.getContext().getEvent().get(i0).getCoding().size() < i1+1) { documentreference.getContext().getEvent().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {documentreference.getContext().getEvent().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DocRfrnc_Cntxt_Evnt_Cdg_Dsply ********************************************************************************/
		if(d.getDocRfrncCntxtEvntCdgDsply() != null ) {

			String[] arrayi0 = d.getDocRfrncCntxtEvntCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getContext().getEvent().size() < i0+1) { documentreference.getContext().addEvent(); }
				String[] arrayi1 = d.getDocRfrncCntxtEvntCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(documentreference.getContext().getEvent().get(i0).getCoding().size() < i1+1) { documentreference.getContext().getEvent().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {documentreference.getContext().getEvent().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DocRfrnc_Cntxt_Evnt_Cdg_Sys ********************************************************************************/
		if(d.getDocRfrncCntxtEvntCdgSys() != null ) {

			String[] arrayi0 = d.getDocRfrncCntxtEvntCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getContext().getEvent().size() < i0+1) { documentreference.getContext().addEvent(); }
				String[] arrayi1 = d.getDocRfrncCntxtEvntCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(documentreference.getContext().getEvent().get(i0).getCoding().size() < i1+1) { documentreference.getContext().getEvent().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {documentreference.getContext().getEvent().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DocRfrnc_Cntxt_Evnt_Cdg_UsrSltd ********************************************************************************/
		if(d.getDocRfrncCntxtEvntCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDocRfrncCntxtEvntCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getContext().getEvent().size() < i0+1) { documentreference.getContext().addEvent(); }
				String[] arrayi1 = d.getDocRfrncCntxtEvntCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(documentreference.getContext().getEvent().get(i0).getCoding().size() < i1+1) { documentreference.getContext().getEvent().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {documentreference.getContext().getEvent().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** DocRfrnc_Cntxt_Evnt_Cdg_Vrsn ********************************************************************************/
		if(d.getDocRfrncCntxtEvntCdgVrsn() != null ) {

			String[] arrayi0 = d.getDocRfrncCntxtEvntCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getContext().getEvent().size() < i0+1) { documentreference.getContext().addEvent(); }
				String[] arrayi1 = d.getDocRfrncCntxtEvntCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(documentreference.getContext().getEvent().get(i0).getCoding().size() < i1+1) { documentreference.getContext().getEvent().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {documentreference.getContext().getEvent().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DocRfrnc_Cntxt_Evnt_Txt ********************************************************************************/
		if(d.getDocRfrncCntxtEvntTxt() != null ) {

			String[] arrayi0 = d.getDocRfrncCntxtEvntTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getContext().getEvent().size() < i0+1) { documentreference.getContext().addEvent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getContext().getEvent().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocRfrnc_Cntxt_FacilityTyp_Cdg_Cd ********************************************************************************/
		if(d.getDocRfrncCntxtFacilityTypCdgCd() != null ) {

			String[] arrayi0 = d.getDocRfrncCntxtFacilityTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getContext().getFacilityType().getCoding().size() < i0+1) { documentreference.getContext().getFacilityType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getContext().getFacilityType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocRfrnc_Cntxt_FacilityTyp_Cdg_Dsply ********************************************************************************/
		if(d.getDocRfrncCntxtFacilityTypCdgDsply() != null ) {

			String[] arrayi0 = d.getDocRfrncCntxtFacilityTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getContext().getFacilityType().getCoding().size() < i0+1) { documentreference.getContext().getFacilityType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getContext().getFacilityType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocRfrnc_Cntxt_FacilityTyp_Cdg_Sys ********************************************************************************/
		if(d.getDocRfrncCntxtFacilityTypCdgSys() != null ) {

			String[] arrayi0 = d.getDocRfrncCntxtFacilityTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getContext().getFacilityType().getCoding().size() < i0+1) { documentreference.getContext().getFacilityType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getContext().getFacilityType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocRfrnc_Cntxt_FacilityTyp_Cdg_UsrSltd ********************************************************************************/
		if(d.getDocRfrncCntxtFacilityTypCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDocRfrncCntxtFacilityTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getContext().getFacilityType().getCoding().size() < i0+1) { documentreference.getContext().getFacilityType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getContext().getFacilityType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DocRfrnc_Cntxt_FacilityTyp_Cdg_Vrsn ********************************************************************************/
		if(d.getDocRfrncCntxtFacilityTypCdgVrsn() != null ) {

			String[] arrayi0 = d.getDocRfrncCntxtFacilityTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getContext().getFacilityType().getCoding().size() < i0+1) { documentreference.getContext().getFacilityType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getContext().getFacilityType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocRfrnc_Cntxt_FacilityTyp_Txt ********************************************************************************/
		if(d.getDocRfrncCntxtFacilityTypTxt() != null ) {

			if(d.getDocRfrncCntxtFacilityTypTxt().replace("[","").replace("]","").equals("NULL") | d.getDocRfrncCntxtFacilityTypTxt()==null) {} else {
			documentreference.getContext().getFacilityType().setText(d.getDocRfrncCntxtFacilityTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DocRfrnc_Cntxt_Prd_End ********************************************************************************/
		if(d.getDocRfrncCntxtPrdEnd() != null ) {

			if(d.getDocRfrncCntxtPrdEnd().replace("[","").replace("]","").equals("NULL") | d.getDocRfrncCntxtPrdEnd()==null) {} else {
			documentreference.getContext().getPeriod().setEnd(d.getDocRfrncCntxtPrdEnd().replace("[","").replace("]","").equals("NULL") | d.getDocRfrncCntxtPrdEnd()==null ? null : convertStringToDate(d.getDocRfrncCntxtPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DocRfrnc_Cntxt_Prd_Strt ********************************************************************************/
		if(d.getDocRfrncCntxtPrdStrt() != null ) {

			if(d.getDocRfrncCntxtPrdStrt().replace("[","").replace("]","").equals("NULL") | d.getDocRfrncCntxtPrdStrt()==null) {} else {
			documentreference.getContext().getPeriod().setStart(d.getDocRfrncCntxtPrdStrt().replace("[","").replace("]","").equals("NULL") | d.getDocRfrncCntxtPrdStrt()==null ? null : convertStringToDate(d.getDocRfrncCntxtPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DocRfrnc_Cntxt_PracticeStting_Cdg_Cd ********************************************************************************/
		if(d.getDocRfrncCntxtPracticeSttingCdgCd() != null ) {

			String[] arrayi0 = d.getDocRfrncCntxtPracticeSttingCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getContext().getPracticeSetting().getCoding().size() < i0+1) { documentreference.getContext().getPracticeSetting().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getContext().getPracticeSetting().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocRfrnc_Cntxt_PracticeStting_Cdg_Dsply ********************************************************************************/
		if(d.getDocRfrncCntxtPracticeSttingCdgDsply() != null ) {

			String[] arrayi0 = d.getDocRfrncCntxtPracticeSttingCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getContext().getPracticeSetting().getCoding().size() < i0+1) { documentreference.getContext().getPracticeSetting().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getContext().getPracticeSetting().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocRfrnc_Cntxt_PracticeStting_Cdg_Sys ********************************************************************************/
		if(d.getDocRfrncCntxtPracticeSttingCdgSys() != null ) {

			String[] arrayi0 = d.getDocRfrncCntxtPracticeSttingCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getContext().getPracticeSetting().getCoding().size() < i0+1) { documentreference.getContext().getPracticeSetting().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getContext().getPracticeSetting().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocRfrnc_Cntxt_PracticeStting_Cdg_UsrSltd ********************************************************************************/
		if(d.getDocRfrncCntxtPracticeSttingCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDocRfrncCntxtPracticeSttingCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getContext().getPracticeSetting().getCoding().size() < i0+1) { documentreference.getContext().getPracticeSetting().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getContext().getPracticeSetting().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DocRfrnc_Cntxt_PracticeStting_Cdg_Vrsn ********************************************************************************/
		if(d.getDocRfrncCntxtPracticeSttingCdgVrsn() != null ) {

			String[] arrayi0 = d.getDocRfrncCntxtPracticeSttingCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getContext().getPracticeSetting().getCoding().size() < i0+1) { documentreference.getContext().getPracticeSetting().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getContext().getPracticeSetting().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocRfrnc_Cntxt_PracticeStting_Txt ********************************************************************************/
		if(d.getDocRfrncCntxtPracticeSttingTxt() != null ) {

			if(d.getDocRfrncCntxtPracticeSttingTxt().replace("[","").replace("]","").equals("NULL") | d.getDocRfrncCntxtPracticeSttingTxt()==null) {} else {
			documentreference.getContext().getPracticeSetting().setText(d.getDocRfrncCntxtPracticeSttingTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DocRfrnc_Cntxt_Rlted ********************************************************************************/
		if(d.getDocRfrncCntxtRlted() != null ) {

				for( String currListStrSplit : d.getDocRfrncCntxtRlted().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			documentreference.getContext().addRelated(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** DocRfrnc_Cntxt_SrcPntInfo ********************************************************************************/
		if(d.getDocRfrncCntxtSrcPntInfo() != null ) {

			if(d.getDocRfrncCntxtSrcPntInfo().replace("[","").replace("]","").equals("NULL") | d.getDocRfrncCntxtSrcPntInfo()==null) {} else {
			documentreference.getContext().setSourcePatientInfo(new org.hl7.fhir.r4.model.Reference(d.getDocRfrncCntxtSrcPntInfo().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DocRfrnc_Custodian ********************************************************************************/
		if(d.getDocRfrncCustodian() != null ) {

			if(d.getDocRfrncCustodian().replace("[","").replace("]","").equals("NULL") | d.getDocRfrncCustodian()==null) {} else {
			documentreference.setCustodian(new org.hl7.fhir.r4.model.Reference(d.getDocRfrncCustodian().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DocRfrnc_Dt ********************************************************************************/
		if(d.getDocRfrncDt() != null ) {

			if(d.getDocRfrncDt().replace("[","").replace("]","").equals("NULL") | d.getDocRfrncDt()==null) {} else {
			documentreference.setDate(d.getDocRfrncDt().replace("[","").replace("]","").equals("NULL") | d.getDocRfrncDt()==null ? null : convertStringToDate(d.getDocRfrncDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DocRfrnc_Dscrptn ********************************************************************************/
		if(d.getDocRfrncDscrptn() != null ) {

			if(d.getDocRfrncDscrptn().replace("[","").replace("]","").equals("NULL") | d.getDocRfrncDscrptn()==null) {} else {
			documentreference.setDescription(d.getDocRfrncDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DocRfrnc_DocSts ********************************************************************************/
		if(d.getDocRfrncDocSts() != null ) {

			if(d.getDocRfrncDocSts().replace("[","").replace("]","").equals("NULL") | d.getDocRfrncDocSts()==null) {} else {
			documentreference.setDocStatus(new org.hl7.fhir.r4.model.DocumentReference.ReferredDocumentStatusEnumFactory().fromCode(d.getDocRfrncDocSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DocRfrnc_Id_Assigner ********************************************************************************/
		if(d.getDocRfrncIdAssigner() != null ) {

			String[] arrayi0 = d.getDocRfrncIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getIdentifier().size() < i0+1) { documentreference.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DocRfrnc_Id_Prd_End ********************************************************************************/
		if(d.getDocRfrncIdPrdEnd() != null ) {

			String[] arrayi0 = d.getDocRfrncIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getIdentifier().size() < i0+1) { documentreference.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : convertStringToDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DocRfrnc_Id_Prd_Strt ********************************************************************************/
		if(d.getDocRfrncIdPrdStrt() != null ) {

			String[] arrayi0 = d.getDocRfrncIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getIdentifier().size() < i0+1) { documentreference.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : convertStringToDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DocRfrnc_Id_Sys ********************************************************************************/
		if(d.getDocRfrncIdSys() != null ) {

			String[] arrayi0 = d.getDocRfrncIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getIdentifier().size() < i0+1) { documentreference.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocRfrnc_Id_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDocRfrncIdTypCdgCd() != null ) {

			String[] arrayi0 = d.getDocRfrncIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getIdentifier().size() < i0+1) { documentreference.addIdentifier(); }
				String[] arrayi1 = d.getDocRfrncIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(documentreference.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { documentreference.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {documentreference.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DocRfrnc_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDocRfrncIdTypCdgDsply() != null ) {

			String[] arrayi0 = d.getDocRfrncIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getIdentifier().size() < i0+1) { documentreference.addIdentifier(); }
				String[] arrayi1 = d.getDocRfrncIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(documentreference.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { documentreference.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {documentreference.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DocRfrnc_Id_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDocRfrncIdTypCdgSys() != null ) {

			String[] arrayi0 = d.getDocRfrncIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getIdentifier().size() < i0+1) { documentreference.addIdentifier(); }
				String[] arrayi1 = d.getDocRfrncIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(documentreference.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { documentreference.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {documentreference.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DocRfrnc_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDocRfrncIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDocRfrncIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getIdentifier().size() < i0+1) { documentreference.addIdentifier(); }
				String[] arrayi1 = d.getDocRfrncIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(documentreference.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { documentreference.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {documentreference.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** DocRfrnc_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDocRfrncIdTypCdgVrsn() != null ) {

			String[] arrayi0 = d.getDocRfrncIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getIdentifier().size() < i0+1) { documentreference.addIdentifier(); }
				String[] arrayi1 = d.getDocRfrncIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(documentreference.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { documentreference.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {documentreference.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DocRfrnc_Id_Typ_Txt ********************************************************************************/
		if(d.getDocRfrncIdTypTxt() != null ) {

			String[] arrayi0 = d.getDocRfrncIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getIdentifier().size() < i0+1) { documentreference.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocRfrnc_Id_Use ********************************************************************************/
		if(d.getDocRfrncIdUse() != null ) {

			String[] arrayi0 = d.getDocRfrncIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getIdentifier().size() < i0+1) { documentreference.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DocRfrnc_Id_Vl ********************************************************************************/
		if(d.getDocRfrncIdVl() != null ) {

			String[] arrayi0 = d.getDocRfrncIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getIdentifier().size() < i0+1) { documentreference.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocRfrnc_MasterId_Assigner ********************************************************************************/
		if(d.getDocRfrncMasterIdAssigner() != null ) {

			if(d.getDocRfrncMasterIdAssigner().replace("[","").replace("]","").equals("NULL") | d.getDocRfrncMasterIdAssigner()==null) {} else {
			documentreference.getMasterIdentifier().setAssigner(new org.hl7.fhir.r4.model.Reference(d.getDocRfrncMasterIdAssigner().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DocRfrnc_MasterId_Prd_End ********************************************************************************/
		if(d.getDocRfrncMasterIdPrdEnd() != null ) {

			if(d.getDocRfrncMasterIdPrdEnd().replace("[","").replace("]","").equals("NULL") | d.getDocRfrncMasterIdPrdEnd()==null) {} else {
			documentreference.getMasterIdentifier().getPeriod().setEnd(d.getDocRfrncMasterIdPrdEnd().replace("[","").replace("]","").equals("NULL") | d.getDocRfrncMasterIdPrdEnd()==null ? null : convertStringToDate(d.getDocRfrncMasterIdPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DocRfrnc_MasterId_Prd_Strt ********************************************************************************/
		if(d.getDocRfrncMasterIdPrdStrt() != null ) {

			if(d.getDocRfrncMasterIdPrdStrt().replace("[","").replace("]","").equals("NULL") | d.getDocRfrncMasterIdPrdStrt()==null) {} else {
			documentreference.getMasterIdentifier().getPeriod().setStart(d.getDocRfrncMasterIdPrdStrt().replace("[","").replace("]","").equals("NULL") | d.getDocRfrncMasterIdPrdStrt()==null ? null : convertStringToDate(d.getDocRfrncMasterIdPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DocRfrnc_MasterId_Sys ********************************************************************************/
		if(d.getDocRfrncMasterIdSys() != null ) {

			if(d.getDocRfrncMasterIdSys().replace("[","").replace("]","").equals("NULL") | d.getDocRfrncMasterIdSys()==null) {} else {
			documentreference.getMasterIdentifier().setSystem(d.getDocRfrncMasterIdSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DocRfrnc_MasterId_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDocRfrncMasterIdTypCdgCd() != null ) {

			String[] arrayi0 = d.getDocRfrncMasterIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getMasterIdentifier().getType().getCoding().size() < i0+1) { documentreference.getMasterIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getMasterIdentifier().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocRfrnc_MasterId_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDocRfrncMasterIdTypCdgDsply() != null ) {

			String[] arrayi0 = d.getDocRfrncMasterIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getMasterIdentifier().getType().getCoding().size() < i0+1) { documentreference.getMasterIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getMasterIdentifier().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocRfrnc_MasterId_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDocRfrncMasterIdTypCdgSys() != null ) {

			String[] arrayi0 = d.getDocRfrncMasterIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getMasterIdentifier().getType().getCoding().size() < i0+1) { documentreference.getMasterIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getMasterIdentifier().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocRfrnc_MasterId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDocRfrncMasterIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDocRfrncMasterIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getMasterIdentifier().getType().getCoding().size() < i0+1) { documentreference.getMasterIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getMasterIdentifier().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DocRfrnc_MasterId_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDocRfrncMasterIdTypCdgVrsn() != null ) {

			String[] arrayi0 = d.getDocRfrncMasterIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getMasterIdentifier().getType().getCoding().size() < i0+1) { documentreference.getMasterIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getMasterIdentifier().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocRfrnc_MasterId_Typ_Txt ********************************************************************************/
		if(d.getDocRfrncMasterIdTypTxt() != null ) {

			if(d.getDocRfrncMasterIdTypTxt().replace("[","").replace("]","").equals("NULL") | d.getDocRfrncMasterIdTypTxt()==null) {} else {
			documentreference.getMasterIdentifier().getType().setText(d.getDocRfrncMasterIdTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DocRfrnc_MasterId_Use ********************************************************************************/
		if(d.getDocRfrncMasterIdUse() != null ) {

			if(d.getDocRfrncMasterIdUse().replace("[","").replace("]","").equals("NULL") | d.getDocRfrncMasterIdUse()==null) {} else {
			documentreference.getMasterIdentifier().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(d.getDocRfrncMasterIdUse().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DocRfrnc_MasterId_Vl ********************************************************************************/
		if(d.getDocRfrncMasterIdVl() != null ) {

			if(d.getDocRfrncMasterIdVl().replace("[","").replace("]","").equals("NULL") | d.getDocRfrncMasterIdVl()==null) {} else {
			documentreference.getMasterIdentifier().setValue(d.getDocRfrncMasterIdVl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DocRfrnc_RelatesTo_Cd ********************************************************************************/
		if(d.getDocRfrncRelatesToCd() != null ) {

			String[] arrayi0 = d.getDocRfrncRelatesToCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getRelatesTo().size() < i0+1) { documentreference.addRelatesTo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getRelatesTo().get(i0).setCode(new org.hl7.fhir.r4.model.DocumentReference.DocumentRelationshipTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DocRfrnc_RelatesTo_Cd ********************************************************************************/
		if(d.getDocRfrncRelatesToTrgt() != null ) {

			String[] arrayi0 = d.getDocRfrncRelatesToTrgt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getRelatesTo().size() < i0+1) { documentreference.addRelatesTo(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getRelatesTo().get(i0).setTarget(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DocRfrnc_SecurityLbl_Cdg_Cd ********************************************************************************/
		if(d.getDocRfrncSecurityLblCdgCd() != null ) {

			String[] arrayi0 = d.getDocRfrncSecurityLblCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getSecurityLabel().size() < i0+1) { documentreference.addSecurityLabel(); }
				String[] arrayi1 = d.getDocRfrncSecurityLblCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(documentreference.getSecurityLabel().get(i0).getCoding().size() < i1+1) { documentreference.getSecurityLabel().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {documentreference.getSecurityLabel().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DocRfrnc_SecurityLbl_Cdg_Dsply ********************************************************************************/
		if(d.getDocRfrncSecurityLblCdgDsply() != null ) {

			String[] arrayi0 = d.getDocRfrncSecurityLblCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getSecurityLabel().size() < i0+1) { documentreference.addSecurityLabel(); }
				String[] arrayi1 = d.getDocRfrncSecurityLblCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(documentreference.getSecurityLabel().get(i0).getCoding().size() < i1+1) { documentreference.getSecurityLabel().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {documentreference.getSecurityLabel().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DocRfrnc_SecurityLbl_Cdg_Sys ********************************************************************************/
		if(d.getDocRfrncSecurityLblCdgSys() != null ) {

			String[] arrayi0 = d.getDocRfrncSecurityLblCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getSecurityLabel().size() < i0+1) { documentreference.addSecurityLabel(); }
				String[] arrayi1 = d.getDocRfrncSecurityLblCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(documentreference.getSecurityLabel().get(i0).getCoding().size() < i1+1) { documentreference.getSecurityLabel().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {documentreference.getSecurityLabel().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DocRfrnc_SecurityLbl_Cdg_UsrSltd ********************************************************************************/
		if(d.getDocRfrncSecurityLblCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDocRfrncSecurityLblCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getSecurityLabel().size() < i0+1) { documentreference.addSecurityLabel(); }
				String[] arrayi1 = d.getDocRfrncSecurityLblCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(documentreference.getSecurityLabel().get(i0).getCoding().size() < i1+1) { documentreference.getSecurityLabel().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {documentreference.getSecurityLabel().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** DocRfrnc_SecurityLbl_Cdg_Vrsn ********************************************************************************/
		if(d.getDocRfrncSecurityLblCdgVrsn() != null ) {

			String[] arrayi0 = d.getDocRfrncSecurityLblCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getSecurityLabel().size() < i0+1) { documentreference.addSecurityLabel(); }
				String[] arrayi1 = d.getDocRfrncSecurityLblCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(documentreference.getSecurityLabel().get(i0).getCoding().size() < i1+1) { documentreference.getSecurityLabel().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {documentreference.getSecurityLabel().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DocRfrnc_SecurityLbl_Txt ********************************************************************************/
		if(d.getDocRfrncSecurityLblTxt() != null ) {

			String[] arrayi0 = d.getDocRfrncSecurityLblTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getSecurityLabel().size() < i0+1) { documentreference.addSecurityLabel(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getSecurityLabel().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocRfrnc_Sts ********************************************************************************/
		if(d.getDocRfrncSts() != null ) {

			if(d.getDocRfrncSts().replace("[","").replace("]","").equals("NULL") | d.getDocRfrncSts()==null) {} else {
			documentreference.setStatus(new org.hl7.fhir.r4.model.Enumerations.DocumentReferenceStatusEnumFactory().fromCode(d.getDocRfrncSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DocRfrnc_Sbjct ********************************************************************************/
		if(d.getDocRfrncSbjct() != null ) {

			if(d.getDocRfrncSbjct().replace("[","").replace("]","").equals("NULL") | d.getDocRfrncSbjct()==null) {} else {
			documentreference.setSubject(new org.hl7.fhir.r4.model.Reference(d.getDocRfrncSbjct().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DocRfrnc_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDocRfrncTypCdgCd() != null ) {

			String[] arrayi0 = d.getDocRfrncTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getType().getCoding().size() < i0+1) { documentreference.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocRfrnc_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDocRfrncTypCdgDsply() != null ) {

			String[] arrayi0 = d.getDocRfrncTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getType().getCoding().size() < i0+1) { documentreference.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocRfrnc_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDocRfrncTypCdgSys() != null ) {

			String[] arrayi0 = d.getDocRfrncTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getType().getCoding().size() < i0+1) { documentreference.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocRfrnc_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDocRfrncTypCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDocRfrncTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getType().getCoding().size() < i0+1) { documentreference.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DocRfrnc_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDocRfrncTypCdgVrsn() != null ) {

			String[] arrayi0 = d.getDocRfrncTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(documentreference.getType().getCoding().size() < i0+1) { documentreference.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {documentreference.getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DocRfrnc_Typ_Txt ********************************************************************************/
		if(d.getDocRfrncTypTxt() != null ) {

			if(d.getDocRfrncTypTxt().replace("[","").replace("]","").equals("NULL") | d.getDocRfrncTypTxt()==null) {} else {
			documentreference.getType().setText(d.getDocRfrncTypTxt().replace("[","").replace("]","").replace("\"",""));
			}

		}
		return documentreference;
	}
}
