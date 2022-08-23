package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Library;
public class LibraryConversion 
{
	public org.hl7.fhir.r4.model.Library Librarys(Library l) throws ParseException
	{
		org.hl7.fhir.r4.model.Library library = new org.hl7.fhir.r4.model.Library();

		/******************** id ********************************************************************************/
		library.setId(l.getId());

		/******************** Library_ApprovalDt ********************************************************************************/
		if(l.getLibraryApprovalDt() != null ) {

			if(l.getLibraryApprovalDt().replace("[","").replace("]","").equals("NULL") | l.getLibraryApprovalDt()==null) {} else {
			library.setApprovalDate(l.getLibraryApprovalDt().replace("[","").replace("]","").equals("NULL") | l.getLibraryApprovalDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(l.getLibraryApprovalDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Library_Athr_Nm ********************************************************************************/
		if(l.getLibraryAthrNm() != null ) {

			String[] arrayi0 = l.getLibraryAthrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getAuthor().size() < i0+1) { library.addAuthor(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getAuthor().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_Athr_Tlcm_Prd_End ********************************************************************************/
		if(l.getLibraryAthrTlcmPrdEnd() != null ) {

			String[] arrayi0 = l.getLibraryAthrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getAuthor().size() < i0+1) { library.addAuthor(); }
				String[] arrayi1 = l.getLibraryAthrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getAuthor().get(i0).getTelecom().size() < i1+1) { library.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getAuthor().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Library_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(l.getLibraryAthrTlcmPrdStrt() != null ) {

			String[] arrayi0 = l.getLibraryAthrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getAuthor().size() < i0+1) { library.addAuthor(); }
				String[] arrayi1 = l.getLibraryAthrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getAuthor().get(i0).getTelecom().size() < i1+1) { library.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getAuthor().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Library_Athr_Tlcm_Rnk ********************************************************************************/
		if(l.getLibraryAthrTlcmRnk() != null ) {

			String[] arrayi0 = l.getLibraryAthrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getAuthor().size() < i0+1) { library.addAuthor(); }
				String[] arrayi1 = l.getLibraryAthrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getAuthor().get(i0).getTelecom().size() < i1+1) { library.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getAuthor().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Library_Athr_Tlcm_Sys ********************************************************************************/
		if(l.getLibraryAthrTlcmSys() != null ) {

			String[] arrayi0 = l.getLibraryAthrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getAuthor().size() < i0+1) { library.addAuthor(); }
				String[] arrayi1 = l.getLibraryAthrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getAuthor().get(i0).getTelecom().size() < i1+1) { library.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getAuthor().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Library_Athr_Tlcm_Use ********************************************************************************/
		if(l.getLibraryAthrTlcmUse() != null ) {

			String[] arrayi0 = l.getLibraryAthrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getAuthor().size() < i0+1) { library.addAuthor(); }
				String[] arrayi1 = l.getLibraryAthrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getAuthor().get(i0).getTelecom().size() < i1+1) { library.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getAuthor().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Library_Athr_Tlcm_Vl ********************************************************************************/
		if(l.getLibraryAthrTlcmVl() != null ) {

			String[] arrayi0 = l.getLibraryAthrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getAuthor().size() < i0+1) { library.addAuthor(); }
				String[] arrayi1 = l.getLibraryAthrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getAuthor().get(i0).getTelecom().size() < i1+1) { library.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getAuthor().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Library_Cntct_Nm ********************************************************************************/
		if(l.getLibraryCntctNm() != null ) {

			String[] arrayi0 = l.getLibraryCntctNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getContact().size() < i0+1) { library.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getContact().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(l.getLibraryCntctTlcmPrdEnd() != null ) {

			String[] arrayi0 = l.getLibraryCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getContact().size() < i0+1) { library.addContact(); }
				String[] arrayi1 = l.getLibraryCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getContact().get(i0).getTelecom().size() < i1+1) { library.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getContact().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Library_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(l.getLibraryCntctTlcmPrdStrt() != null ) {

			String[] arrayi0 = l.getLibraryCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getContact().size() < i0+1) { library.addContact(); }
				String[] arrayi1 = l.getLibraryCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getContact().get(i0).getTelecom().size() < i1+1) { library.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getContact().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Library_Cntct_Tlcm_Rnk ********************************************************************************/
		if(l.getLibraryCntctTlcmRnk() != null ) {

			String[] arrayi0 = l.getLibraryCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getContact().size() < i0+1) { library.addContact(); }
				String[] arrayi1 = l.getLibraryCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getContact().get(i0).getTelecom().size() < i1+1) { library.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getContact().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Library_Cntct_Tlcm_Sys ********************************************************************************/
		if(l.getLibraryCntctTlcmSys() != null ) {

			String[] arrayi0 = l.getLibraryCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getContact().size() < i0+1) { library.addContact(); }
				String[] arrayi1 = l.getLibraryCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getContact().get(i0).getTelecom().size() < i1+1) { library.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getContact().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Library_Cntct_Tlcm_Use ********************************************************************************/
		if(l.getLibraryCntctTlcmUse() != null ) {

			String[] arrayi0 = l.getLibraryCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getContact().size() < i0+1) { library.addContact(); }
				String[] arrayi1 = l.getLibraryCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getContact().get(i0).getTelecom().size() < i1+1) { library.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getContact().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Library_Cntct_Tlcm_Vl ********************************************************************************/
		if(l.getLibraryCntctTlcmVl() != null ) {

			String[] arrayi0 = l.getLibraryCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getContact().size() < i0+1) { library.addContact(); }
				String[] arrayi1 = l.getLibraryCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getContact().get(i0).getTelecom().size() < i1+1) { library.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getContact().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Library_Cntnt_CntntTyp ********************************************************************************/
		if(l.getLibraryCntntCntntTyp() != null ) {

			String[] arrayi0 = l.getLibraryCntntCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getContent().size() < i0+1) { library.addContent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getContent().get(i0).setContentType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_Cntnt_Creation ********************************************************************************/
		if(l.getLibraryCntntCreation() != null ) {

			String[] arrayi0 = l.getLibraryCntntCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getContent().size() < i0+1) { library.addContent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getContent().get(i0).setCreation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Library_Cntnt_Data ********************************************************************************/
		if(l.getLibraryCntntData() != null ) {

			String[] arrayi0 = l.getLibraryCntntData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getContent().size() < i0+1) { library.addContent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getContent().get(i0).setData(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** Library_Cntnt_Hash ********************************************************************************/
		if(l.getLibraryCntntHash() != null ) {

			String[] arrayi0 = l.getLibraryCntntHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getContent().size() < i0+1) { library.addContent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getContent().get(i0).setHash(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** Library_Cntnt_Lnguage ********************************************************************************/
		if(l.getLibraryCntntLnguage() != null ) {

			String[] arrayi0 = l.getLibraryCntntLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getContent().size() < i0+1) { library.addContent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getContent().get(i0).setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_Cntnt_Sz ********************************************************************************/
		if(l.getLibraryCntntSz() != null ) {

			String[] arrayi0 = l.getLibraryCntntSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getContent().size() < i0+1) { library.addContent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getContent().get(i0).setSize(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Library_Cntnt_Ttl ********************************************************************************/
		if(l.getLibraryCntntTtl() != null ) {

			String[] arrayi0 = l.getLibraryCntntTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getContent().size() < i0+1) { library.addContent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getContent().get(i0).setTitle(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_Cntnt_Url ********************************************************************************/
		if(l.getLibraryCntntUrl() != null ) {

			String[] arrayi0 = l.getLibraryCntntUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getContent().size() < i0+1) { library.addContent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getContent().get(i0).setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_Copyright ********************************************************************************/
		if(l.getLibraryCopyright() != null ) {

			if(l.getLibraryCopyright().replace("[","").replace("]","").equals("NULL") | l.getLibraryCopyright()==null) {} else {
			library.setCopyright(l.getLibraryCopyright().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Library_DataRqrment_CdFltr_Cd_Cd ********************************************************************************/
		if(l.getLibraryDataRqrmentCdFltrCdCd() != null ) {

			String[] arrayi0 = l.getLibraryDataRqrmentCdFltrCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getDataRequirement().size() < i0+1) { library.addDataRequirement(); }
				String[] arrayi1 = l.getLibraryDataRqrmentCdFltrCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getDataRequirement().get(i0).getCodeFilter().size() < i1+1) { library.getDataRequirement().get(i0).addCodeFilter(); }
					String[] arrayi2 = l.getLibraryDataRqrmentCdFltrCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(library.getDataRequirement().get(i0).getCodeFilter().get(i1).getCode().size() < i2+1) { library.getDataRequirement().get(i0).getCodeFilter().get(i1).addCode(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {library.getDataRequirement().get(i0).getCodeFilter().get(i1).getCode().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Library_DataRqrment_CdFltr_Cd_Dsply ********************************************************************************/
		if(l.getLibraryDataRqrmentCdFltrCdDsply() != null ) {

			String[] arrayi0 = l.getLibraryDataRqrmentCdFltrCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getDataRequirement().size() < i0+1) { library.addDataRequirement(); }
				String[] arrayi1 = l.getLibraryDataRqrmentCdFltrCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getDataRequirement().get(i0).getCodeFilter().size() < i1+1) { library.getDataRequirement().get(i0).addCodeFilter(); }
					String[] arrayi2 = l.getLibraryDataRqrmentCdFltrCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(library.getDataRequirement().get(i0).getCodeFilter().get(i1).getCode().size() < i2+1) { library.getDataRequirement().get(i0).getCodeFilter().get(i1).addCode(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {library.getDataRequirement().get(i0).getCodeFilter().get(i1).getCode().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Library_DataRqrment_CdFltr_Cd_Sys ********************************************************************************/
		if(l.getLibraryDataRqrmentCdFltrCdSys() != null ) {

			String[] arrayi0 = l.getLibraryDataRqrmentCdFltrCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getDataRequirement().size() < i0+1) { library.addDataRequirement(); }
				String[] arrayi1 = l.getLibraryDataRqrmentCdFltrCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getDataRequirement().get(i0).getCodeFilter().size() < i1+1) { library.getDataRequirement().get(i0).addCodeFilter(); }
					String[] arrayi2 = l.getLibraryDataRqrmentCdFltrCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(library.getDataRequirement().get(i0).getCodeFilter().get(i1).getCode().size() < i2+1) { library.getDataRequirement().get(i0).getCodeFilter().get(i1).addCode(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {library.getDataRequirement().get(i0).getCodeFilter().get(i1).getCode().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Library_DataRqrment_CdFltr_Cd_UsrSltd ********************************************************************************/
		if(l.getLibraryDataRqrmentCdFltrCdUsrSltd() != null ) {

			String[] arrayi0 = l.getLibraryDataRqrmentCdFltrCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getDataRequirement().size() < i0+1) { library.addDataRequirement(); }
				String[] arrayi1 = l.getLibraryDataRqrmentCdFltrCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getDataRequirement().get(i0).getCodeFilter().size() < i1+1) { library.getDataRequirement().get(i0).addCodeFilter(); }
					String[] arrayi2 = l.getLibraryDataRqrmentCdFltrCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(library.getDataRequirement().get(i0).getCodeFilter().get(i1).getCode().size() < i2+1) { library.getDataRequirement().get(i0).getCodeFilter().get(i1).addCode(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {library.getDataRequirement().get(i0).getCodeFilter().get(i1).getCode().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Library_DataRqrment_CdFltr_Cd_Vrsn ********************************************************************************/
		if(l.getLibraryDataRqrmentCdFltrCdVrsn() != null ) {

			String[] arrayi0 = l.getLibraryDataRqrmentCdFltrCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getDataRequirement().size() < i0+1) { library.addDataRequirement(); }
				String[] arrayi1 = l.getLibraryDataRqrmentCdFltrCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getDataRequirement().get(i0).getCodeFilter().size() < i1+1) { library.getDataRequirement().get(i0).addCodeFilter(); }
					String[] arrayi2 = l.getLibraryDataRqrmentCdFltrCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(library.getDataRequirement().get(i0).getCodeFilter().get(i1).getCode().size() < i2+1) { library.getDataRequirement().get(i0).getCodeFilter().get(i1).addCode(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {library.getDataRequirement().get(i0).getCodeFilter().get(i1).getCode().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Library_DataRqrment_CdFltr_Path ********************************************************************************/
		if(l.getLibraryDataRqrmentCdFltrPath() != null ) {

			String[] arrayi0 = l.getLibraryDataRqrmentCdFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getDataRequirement().size() < i0+1) { library.addDataRequirement(); }
				String[] arrayi1 = l.getLibraryDataRqrmentCdFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getDataRequirement().get(i0).getCodeFilter().size() < i1+1) { library.getDataRequirement().get(i0).addCodeFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getDataRequirement().get(i0).getCodeFilter().get(i1).setPath(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Library_DataRqrment_CdFltr_SrchParam ********************************************************************************/
		if(l.getLibraryDataRqrmentCdFltrSrchParam() != null ) {

			String[] arrayi0 = l.getLibraryDataRqrmentCdFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getDataRequirement().size() < i0+1) { library.addDataRequirement(); }
				String[] arrayi1 = l.getLibraryDataRqrmentCdFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getDataRequirement().get(i0).getCodeFilter().size() < i1+1) { library.getDataRequirement().get(i0).addCodeFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getDataRequirement().get(i0).getCodeFilter().get(i1).setSearchParam(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Library_DataRqrment_CdFltr_VlSt ********************************************************************************/
		if(l.getLibraryDataRqrmentCdFltrVlSt() != null ) {

			String[] arrayi0 = l.getLibraryDataRqrmentCdFltrVlSt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getDataRequirement().size() < i0+1) { library.addDataRequirement(); }
				String[] arrayi1 = l.getLibraryDataRqrmentCdFltrVlSt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getDataRequirement().get(i0).getCodeFilter().size() < i1+1) { library.getDataRequirement().get(i0).addCodeFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getDataRequirement().get(i0).getCodeFilter().get(i1).setValueSet(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Library_DataRqrment_DtFltr_Path ********************************************************************************/
		if(l.getLibraryDataRqrmentDtFltrPath() != null ) {

			String[] arrayi0 = l.getLibraryDataRqrmentDtFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getDataRequirement().size() < i0+1) { library.addDataRequirement(); }
				String[] arrayi1 = l.getLibraryDataRqrmentDtFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getDataRequirement().get(i0).getDateFilter().size() < i1+1) { library.getDataRequirement().get(i0).addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getDataRequirement().get(i0).getDateFilter().get(i1).setPath(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Library_DataRqrment_DtFltr_SrchParam ********************************************************************************/
		if(l.getLibraryDataRqrmentDtFltrSrchParam() != null ) {

			String[] arrayi0 = l.getLibraryDataRqrmentDtFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getDataRequirement().size() < i0+1) { library.addDataRequirement(); }
				String[] arrayi1 = l.getLibraryDataRqrmentDtFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getDataRequirement().get(i0).getDateFilter().size() < i1+1) { library.getDataRequirement().get(i0).addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getDataRequirement().get(i0).getDateFilter().get(i1).setSearchParam(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Library_DataRqrment_DtFltr_VlDtTimeTyp ********************************************************************************/
		if(l.getLibraryDataRqrmentDtFltrVlDtTimeTyp() != null ) {

			String[] arrayi0 = l.getLibraryDataRqrmentDtFltrVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getDataRequirement().size() < i0+1) { library.addDataRequirement(); }
				String[] arrayi1 = l.getLibraryDataRqrmentDtFltrVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getDataRequirement().get(i0).getDateFilter().size() < i1+1) { library.getDataRequirement().get(i0).addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getDataRequirement().get(i0).getDateFilter().get(i1).setValue(new org.hl7.fhir.r4.model.DateTimeType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Library_DataRqrment_DtFltr_VlDuration_Cd ********************************************************************************/
		if(l.getLibraryDataRqrmentDtFltrVlDurationCd() != null ) {

			String[] arrayi0 = l.getLibraryDataRqrmentDtFltrVlDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getDataRequirement().size() < i0+1) { library.addDataRequirement(); }
				String[] arrayi1 = l.getLibraryDataRqrmentDtFltrVlDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getDataRequirement().get(i0).getDateFilter().size() < i1+1) { library.getDataRequirement().get(i0).addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getDataRequirement().get(i0).getDateFilter().get(i1).getValueDuration().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Library_DataRqrment_DtFltr_VlDuration_Cmprtr ********************************************************************************/
		if(l.getLibraryDataRqrmentDtFltrVlDurationCmprtr() != null ) {

			String[] arrayi0 = l.getLibraryDataRqrmentDtFltrVlDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getDataRequirement().size() < i0+1) { library.addDataRequirement(); }
				String[] arrayi1 = l.getLibraryDataRqrmentDtFltrVlDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getDataRequirement().get(i0).getDateFilter().size() < i1+1) { library.getDataRequirement().get(i0).addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getDataRequirement().get(i0).getDateFilter().get(i1).getValueDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Library_DataRqrment_DtFltr_VlDuration_Sys ********************************************************************************/
		if(l.getLibraryDataRqrmentDtFltrVlDurationSys() != null ) {

			String[] arrayi0 = l.getLibraryDataRqrmentDtFltrVlDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getDataRequirement().size() < i0+1) { library.addDataRequirement(); }
				String[] arrayi1 = l.getLibraryDataRqrmentDtFltrVlDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getDataRequirement().get(i0).getDateFilter().size() < i1+1) { library.getDataRequirement().get(i0).addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getDataRequirement().get(i0).getDateFilter().get(i1).getValueDuration().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Library_DataRqrment_DtFltr_VlDuration_Unt ********************************************************************************/
		if(l.getLibraryDataRqrmentDtFltrVlDurationUnt() != null ) {

			String[] arrayi0 = l.getLibraryDataRqrmentDtFltrVlDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getDataRequirement().size() < i0+1) { library.addDataRequirement(); }
				String[] arrayi1 = l.getLibraryDataRqrmentDtFltrVlDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getDataRequirement().get(i0).getDateFilter().size() < i1+1) { library.getDataRequirement().get(i0).addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getDataRequirement().get(i0).getDateFilter().get(i1).getValueDuration().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Library_DataRqrment_DtFltr_VlDuration_Vl ********************************************************************************/
		if(l.getLibraryDataRqrmentDtFltrVlDurationVl() != null ) {

			String[] arrayi0 = l.getLibraryDataRqrmentDtFltrVlDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getDataRequirement().size() < i0+1) { library.addDataRequirement(); }
				String[] arrayi1 = l.getLibraryDataRqrmentDtFltrVlDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getDataRequirement().get(i0).getDateFilter().size() < i1+1) { library.getDataRequirement().get(i0).addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getDataRequirement().get(i0).getDateFilter().get(i1).getValueDuration().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** Library_DataRqrment_DtFltr_VlPrd_End ********************************************************************************/
		if(l.getLibraryDataRqrmentDtFltrVlPrdEnd() != null ) {

			String[] arrayi0 = l.getLibraryDataRqrmentDtFltrVlPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getDataRequirement().size() < i0+1) { library.addDataRequirement(); }
				String[] arrayi1 = l.getLibraryDataRqrmentDtFltrVlPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getDataRequirement().get(i0).getDateFilter().size() < i1+1) { library.getDataRequirement().get(i0).addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getDataRequirement().get(i0).getDateFilter().get(i1).getValuePeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Library_DataRqrment_DtFltr_VlPrd_Strt ********************************************************************************/
		if(l.getLibraryDataRqrmentDtFltrVlPrdStrt() != null ) {

			String[] arrayi0 = l.getLibraryDataRqrmentDtFltrVlPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getDataRequirement().size() < i0+1) { library.addDataRequirement(); }
				String[] arrayi1 = l.getLibraryDataRqrmentDtFltrVlPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getDataRequirement().get(i0).getDateFilter().size() < i1+1) { library.getDataRequirement().get(i0).addDateFilter(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getDataRequirement().get(i0).getDateFilter().get(i1).getValuePeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Library_DataRqrment_Lmt ********************************************************************************/
		if(l.getLibraryDataRqrmentLmt() != null ) {

			String[] arrayi0 = l.getLibraryDataRqrmentLmt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getDataRequirement().size() < i0+1) { library.addDataRequirement(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getDataRequirement().get(i0).setLimit(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Library_DataRqrment_MustSupport ********************************************************************************/
		if(l.getLibraryDataRqrmentMustSupport() != null ) {

			String[] arrayi0 = l.getLibraryDataRqrmentMustSupport().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getDataRequirement().size() < i0+1) { library.addDataRequirement(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {library.getDataRequirement().get(i0).addMustSupport(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Library_DataRqrment_Profile ********************************************************************************/
		if(l.getLibraryDataRqrmentProfile() != null ) {

			String[] arrayi0 = l.getLibraryDataRqrmentProfile().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getDataRequirement().size() < i0+1) { library.addDataRequirement(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {library.getDataRequirement().get(i0).addProfile(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Library_DataRqrment_Sort_Direction ********************************************************************************/
		if(l.getLibraryDataRqrmentSortDirection() != null ) {

			String[] arrayi0 = l.getLibraryDataRqrmentSortDirection().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getDataRequirement().size() < i0+1) { library.addDataRequirement(); }
				String[] arrayi1 = l.getLibraryDataRqrmentSortDirection().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getDataRequirement().get(i0).getSort().size() < i1+1) { library.getDataRequirement().get(i0).addSort(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getDataRequirement().get(i0).getSort().get(i1).setDirection(new org.hl7.fhir.r4.model.DataRequirement.SortDirectionEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Library_DataRqrment_Sort_Path ********************************************************************************/
		if(l.getLibraryDataRqrmentSortPath() != null ) {

			String[] arrayi0 = l.getLibraryDataRqrmentSortPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getDataRequirement().size() < i0+1) { library.addDataRequirement(); }
				String[] arrayi1 = l.getLibraryDataRqrmentSortPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getDataRequirement().get(i0).getSort().size() < i1+1) { library.getDataRequirement().get(i0).addSort(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getDataRequirement().get(i0).getSort().get(i1).setPath(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Library_DataRqrment_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(l.getLibraryDataRqrmentSbjctCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = l.getLibraryDataRqrmentSbjctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getDataRequirement().size() < i0+1) { library.addDataRequirement(); }
				String[] arrayi1 = l.getLibraryDataRqrmentSbjctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getDataRequirement().get(i0).getSubjectCodeableConcept().getCoding().size() < i1+1) { library.getDataRequirement().get(i0).getSubjectCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getDataRequirement().get(i0).getSubjectCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Library_DataRqrment_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(l.getLibraryDataRqrmentSbjctCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = l.getLibraryDataRqrmentSbjctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getDataRequirement().size() < i0+1) { library.addDataRequirement(); }
				String[] arrayi1 = l.getLibraryDataRqrmentSbjctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getDataRequirement().get(i0).getSubjectCodeableConcept().getCoding().size() < i1+1) { library.getDataRequirement().get(i0).getSubjectCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getDataRequirement().get(i0).getSubjectCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Library_DataRqrment_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(l.getLibraryDataRqrmentSbjctCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = l.getLibraryDataRqrmentSbjctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getDataRequirement().size() < i0+1) { library.addDataRequirement(); }
				String[] arrayi1 = l.getLibraryDataRqrmentSbjctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getDataRequirement().get(i0).getSubjectCodeableConcept().getCoding().size() < i1+1) { library.getDataRequirement().get(i0).getSubjectCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getDataRequirement().get(i0).getSubjectCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Library_DataRqrment_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(l.getLibraryDataRqrmentSbjctCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = l.getLibraryDataRqrmentSbjctCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getDataRequirement().size() < i0+1) { library.addDataRequirement(); }
				String[] arrayi1 = l.getLibraryDataRqrmentSbjctCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getDataRequirement().get(i0).getSubjectCodeableConcept().getCoding().size() < i1+1) { library.getDataRequirement().get(i0).getSubjectCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getDataRequirement().get(i0).getSubjectCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Library_DataRqrment_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(l.getLibraryDataRqrmentSbjctCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = l.getLibraryDataRqrmentSbjctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getDataRequirement().size() < i0+1) { library.addDataRequirement(); }
				String[] arrayi1 = l.getLibraryDataRqrmentSbjctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getDataRequirement().get(i0).getSubjectCodeableConcept().getCoding().size() < i1+1) { library.getDataRequirement().get(i0).getSubjectCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getDataRequirement().get(i0).getSubjectCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Library_DataRqrment_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(l.getLibraryDataRqrmentSbjctCdbleCncptTxt() != null ) {

			String[] arrayi0 = l.getLibraryDataRqrmentSbjctCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getDataRequirement().size() < i0+1) { library.addDataRequirement(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getDataRequirement().get(i0).getSubjectCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_DataRqrment_SbjctRfrnc ********************************************************************************/
		if(l.getLibraryDataRqrmentSbjctRfrnc() != null ) {

			String[] arrayi0 = l.getLibraryDataRqrmentSbjctRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getDataRequirement().size() < i0+1) { library.addDataRequirement(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getDataRequirement().get(i0).setSubject(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Library_DataRqrment_Typ ********************************************************************************/
		if(l.getLibraryDataRqrmentTyp() != null ) {

			String[] arrayi0 = l.getLibraryDataRqrmentTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getDataRequirement().size() < i0+1) { library.addDataRequirement(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getDataRequirement().get(i0).setType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_Dt ********************************************************************************/
		if(l.getLibraryDt() != null ) {

			if(l.getLibraryDt().replace("[","").replace("]","").equals("NULL") | l.getLibraryDt()==null) {} else {
			library.setDate(l.getLibraryDt().replace("[","").replace("]","").equals("NULL") | l.getLibraryDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(l.getLibraryDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Library_Dscrptn ********************************************************************************/
		if(l.getLibraryDscrptn() != null ) {

			if(l.getLibraryDscrptn().replace("[","").replace("]","").equals("NULL") | l.getLibraryDscrptn()==null) {} else {
			library.setDescription(l.getLibraryDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Library_Editor_Nm ********************************************************************************/
		if(l.getLibraryEditorNm() != null ) {

			String[] arrayi0 = l.getLibraryEditorNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getEditor().size() < i0+1) { library.addEditor(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getEditor().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_Editor_Tlcm_Prd_End ********************************************************************************/
		if(l.getLibraryEditorTlcmPrdEnd() != null ) {

			String[] arrayi0 = l.getLibraryEditorTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getEditor().size() < i0+1) { library.addEditor(); }
				String[] arrayi1 = l.getLibraryEditorTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getEditor().get(i0).getTelecom().size() < i1+1) { library.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getEditor().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Library_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(l.getLibraryEditorTlcmPrdStrt() != null ) {

			String[] arrayi0 = l.getLibraryEditorTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getEditor().size() < i0+1) { library.addEditor(); }
				String[] arrayi1 = l.getLibraryEditorTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getEditor().get(i0).getTelecom().size() < i1+1) { library.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getEditor().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Library_Editor_Tlcm_Rnk ********************************************************************************/
		if(l.getLibraryEditorTlcmRnk() != null ) {

			String[] arrayi0 = l.getLibraryEditorTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getEditor().size() < i0+1) { library.addEditor(); }
				String[] arrayi1 = l.getLibraryEditorTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getEditor().get(i0).getTelecom().size() < i1+1) { library.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getEditor().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Library_Editor_Tlcm_Sys ********************************************************************************/
		if(l.getLibraryEditorTlcmSys() != null ) {

			String[] arrayi0 = l.getLibraryEditorTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getEditor().size() < i0+1) { library.addEditor(); }
				String[] arrayi1 = l.getLibraryEditorTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getEditor().get(i0).getTelecom().size() < i1+1) { library.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getEditor().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Library_Editor_Tlcm_Use ********************************************************************************/
		if(l.getLibraryEditorTlcmUse() != null ) {

			String[] arrayi0 = l.getLibraryEditorTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getEditor().size() < i0+1) { library.addEditor(); }
				String[] arrayi1 = l.getLibraryEditorTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getEditor().get(i0).getTelecom().size() < i1+1) { library.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getEditor().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Library_Editor_Tlcm_Vl ********************************************************************************/
		if(l.getLibraryEditorTlcmVl() != null ) {

			String[] arrayi0 = l.getLibraryEditorTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getEditor().size() < i0+1) { library.addEditor(); }
				String[] arrayi1 = l.getLibraryEditorTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getEditor().get(i0).getTelecom().size() < i1+1) { library.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getEditor().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Library_EfctivePrd_End ********************************************************************************/
		if(l.getLibraryEfctivePrdEnd() != null ) {

			if(l.getLibraryEfctivePrdEnd().replace("[","").replace("]","").equals("NULL") | l.getLibraryEfctivePrdEnd()==null) {} else {
			library.getEffectivePeriod().setEnd(l.getLibraryEfctivePrdEnd().replace("[","").replace("]","").equals("NULL") | l.getLibraryEfctivePrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(l.getLibraryEfctivePrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Library_EfctivePrd_Strt ********************************************************************************/
		if(l.getLibraryEfctivePrdStrt() != null ) {

			if(l.getLibraryEfctivePrdStrt().replace("[","").replace("]","").equals("NULL") | l.getLibraryEfctivePrdStrt()==null) {} else {
			library.getEffectivePeriod().setStart(l.getLibraryEfctivePrdStrt().replace("[","").replace("]","").equals("NULL") | l.getLibraryEfctivePrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(l.getLibraryEfctivePrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Library_Endsr_Nm ********************************************************************************/
		if(l.getLibraryEndsrNm() != null ) {

			String[] arrayi0 = l.getLibraryEndsrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getEndorser().size() < i0+1) { library.addEndorser(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getEndorser().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(l.getLibraryEndsrTlcmPrdEnd() != null ) {

			String[] arrayi0 = l.getLibraryEndsrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getEndorser().size() < i0+1) { library.addEndorser(); }
				String[] arrayi1 = l.getLibraryEndsrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getEndorser().get(i0).getTelecom().size() < i1+1) { library.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getEndorser().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Library_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(l.getLibraryEndsrTlcmPrdStrt() != null ) {

			String[] arrayi0 = l.getLibraryEndsrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getEndorser().size() < i0+1) { library.addEndorser(); }
				String[] arrayi1 = l.getLibraryEndsrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getEndorser().get(i0).getTelecom().size() < i1+1) { library.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getEndorser().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Library_Endsr_Tlcm_Rnk ********************************************************************************/
		if(l.getLibraryEndsrTlcmRnk() != null ) {

			String[] arrayi0 = l.getLibraryEndsrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getEndorser().size() < i0+1) { library.addEndorser(); }
				String[] arrayi1 = l.getLibraryEndsrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getEndorser().get(i0).getTelecom().size() < i1+1) { library.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getEndorser().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Library_Endsr_Tlcm_Sys ********************************************************************************/
		if(l.getLibraryEndsrTlcmSys() != null ) {

			String[] arrayi0 = l.getLibraryEndsrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getEndorser().size() < i0+1) { library.addEndorser(); }
				String[] arrayi1 = l.getLibraryEndsrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getEndorser().get(i0).getTelecom().size() < i1+1) { library.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getEndorser().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Library_Endsr_Tlcm_Use ********************************************************************************/
		if(l.getLibraryEndsrTlcmUse() != null ) {

			String[] arrayi0 = l.getLibraryEndsrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getEndorser().size() < i0+1) { library.addEndorser(); }
				String[] arrayi1 = l.getLibraryEndsrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getEndorser().get(i0).getTelecom().size() < i1+1) { library.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getEndorser().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Library_Endsr_Tlcm_Vl ********************************************************************************/
		if(l.getLibraryEndsrTlcmVl() != null ) {

			String[] arrayi0 = l.getLibraryEndsrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getEndorser().size() < i0+1) { library.addEndorser(); }
				String[] arrayi1 = l.getLibraryEndsrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getEndorser().get(i0).getTelecom().size() < i1+1) { library.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getEndorser().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Library_Exprmtl ********************************************************************************/
		if(l.getLibraryExprmtl() != null ) {

			if(l.getLibraryExprmtl().replace("[","").replace("]","").equals("NULL") | l.getLibraryExprmtl()==null) {} else {
			library.setExperimental(Boolean.parseBoolean(l.getLibraryExprmtl().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Library_Id_Assigner ********************************************************************************/
		if(l.getLibraryIdAssigner() != null ) {

			String[] arrayi0 = l.getLibraryIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getIdentifier().size() < i0+1) { library.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Library_Id_Prd_End ********************************************************************************/
		if(l.getLibraryIdPrdEnd() != null ) {

			String[] arrayi0 = l.getLibraryIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getIdentifier().size() < i0+1) { library.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Library_Id_Prd_Strt ********************************************************************************/
		if(l.getLibraryIdPrdStrt() != null ) {

			String[] arrayi0 = l.getLibraryIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getIdentifier().size() < i0+1) { library.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Library_Id_Sys ********************************************************************************/
		if(l.getLibraryIdSys() != null ) {

			String[] arrayi0 = l.getLibraryIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getIdentifier().size() < i0+1) { library.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_Id_Typ_Cdg_Cd ********************************************************************************/
		if(l.getLibraryIdTypCdgCd() != null ) {

			String[] arrayi0 = l.getLibraryIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getIdentifier().size() < i0+1) { library.addIdentifier(); }
				String[] arrayi1 = l.getLibraryIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { library.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Library_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(l.getLibraryIdTypCdgDsply() != null ) {

			String[] arrayi0 = l.getLibraryIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getIdentifier().size() < i0+1) { library.addIdentifier(); }
				String[] arrayi1 = l.getLibraryIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { library.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Library_Id_Typ_Cdg_Sys ********************************************************************************/
		if(l.getLibraryIdTypCdgSys() != null ) {

			String[] arrayi0 = l.getLibraryIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getIdentifier().size() < i0+1) { library.addIdentifier(); }
				String[] arrayi1 = l.getLibraryIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { library.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Library_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(l.getLibraryIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = l.getLibraryIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getIdentifier().size() < i0+1) { library.addIdentifier(); }
				String[] arrayi1 = l.getLibraryIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { library.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Library_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(l.getLibraryIdTypCdgVrsn() != null ) {

			String[] arrayi0 = l.getLibraryIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getIdentifier().size() < i0+1) { library.addIdentifier(); }
				String[] arrayi1 = l.getLibraryIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { library.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Library_Id_Typ_Txt ********************************************************************************/
		if(l.getLibraryIdTypTxt() != null ) {

			String[] arrayi0 = l.getLibraryIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getIdentifier().size() < i0+1) { library.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_Id_Use ********************************************************************************/
		if(l.getLibraryIdUse() != null ) {

			String[] arrayi0 = l.getLibraryIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getIdentifier().size() < i0+1) { library.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Library_Id_Vl ********************************************************************************/
		if(l.getLibraryIdVl() != null ) {

			String[] arrayi0 = l.getLibraryIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getIdentifier().size() < i0+1) { library.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(l.getLibraryJrsdctnCdgCd() != null ) {

			String[] arrayi0 = l.getLibraryJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getJurisdiction().size() < i0+1) { library.addJurisdiction(); }
				String[] arrayi1 = l.getLibraryJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getJurisdiction().get(i0).getCoding().size() < i1+1) { library.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getJurisdiction().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Library_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(l.getLibraryJrsdctnCdgDsply() != null ) {

			String[] arrayi0 = l.getLibraryJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getJurisdiction().size() < i0+1) { library.addJurisdiction(); }
				String[] arrayi1 = l.getLibraryJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getJurisdiction().get(i0).getCoding().size() < i1+1) { library.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getJurisdiction().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Library_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(l.getLibraryJrsdctnCdgSys() != null ) {

			String[] arrayi0 = l.getLibraryJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getJurisdiction().size() < i0+1) { library.addJurisdiction(); }
				String[] arrayi1 = l.getLibraryJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getJurisdiction().get(i0).getCoding().size() < i1+1) { library.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getJurisdiction().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Library_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(l.getLibraryJrsdctnCdgUsrSltd() != null ) {

			String[] arrayi0 = l.getLibraryJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getJurisdiction().size() < i0+1) { library.addJurisdiction(); }
				String[] arrayi1 = l.getLibraryJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getJurisdiction().get(i0).getCoding().size() < i1+1) { library.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getJurisdiction().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Library_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(l.getLibraryJrsdctnCdgVrsn() != null ) {

			String[] arrayi0 = l.getLibraryJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getJurisdiction().size() < i0+1) { library.addJurisdiction(); }
				String[] arrayi1 = l.getLibraryJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getJurisdiction().get(i0).getCoding().size() < i1+1) { library.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getJurisdiction().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Library_Jrsdctn_Txt ********************************************************************************/
		if(l.getLibraryJrsdctnTxt() != null ) {

			String[] arrayi0 = l.getLibraryJrsdctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getJurisdiction().size() < i0+1) { library.addJurisdiction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getJurisdiction().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_LastReviewDt ********************************************************************************/
		if(l.getLibraryLastReviewDt() != null ) {

			if(l.getLibraryLastReviewDt().replace("[","").replace("]","").equals("NULL") | l.getLibraryLastReviewDt()==null) {} else {
			library.setLastReviewDate(l.getLibraryLastReviewDt().replace("[","").replace("]","").equals("NULL") | l.getLibraryLastReviewDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(l.getLibraryLastReviewDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Library_Nm ********************************************************************************/
		if(l.getLibraryNm() != null ) {

			if(l.getLibraryNm().replace("[","").replace("]","").equals("NULL") | l.getLibraryNm()==null) {} else {
			library.setName(l.getLibraryNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Library_Prmtr_Docation ********************************************************************************/
		if(l.getLibraryPrmtrDocation() != null ) {

			String[] arrayi0 = l.getLibraryPrmtrDocation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getParameter().size() < i0+1) { library.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getParameter().get(i0).setDocumentation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_Prmtr_Mx ********************************************************************************/
		if(l.getLibraryPrmtrMx() != null ) {

			String[] arrayi0 = l.getLibraryPrmtrMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getParameter().size() < i0+1) { library.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getParameter().get(i0).setMax(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_Prmtr_Min ********************************************************************************/
		if(l.getLibraryPrmtrMin() != null ) {

			String[] arrayi0 = l.getLibraryPrmtrMin().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getParameter().size() < i0+1) { library.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getParameter().get(i0).setMin(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Library_Prmtr_Nm ********************************************************************************/
		if(l.getLibraryPrmtrNm() != null ) {

			String[] arrayi0 = l.getLibraryPrmtrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getParameter().size() < i0+1) { library.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getParameter().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_Prmtr_Profile ********************************************************************************/
		if(l.getLibraryPrmtrProfile() != null ) {

			String[] arrayi0 = l.getLibraryPrmtrProfile().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getParameter().size() < i0+1) { library.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getParameter().get(i0).setProfile(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_Prmtr_Typ ********************************************************************************/
		if(l.getLibraryPrmtrTyp() != null ) {

			String[] arrayi0 = l.getLibraryPrmtrTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getParameter().size() < i0+1) { library.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getParameter().get(i0).setType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_Prmtr_Use ********************************************************************************/
		if(l.getLibraryPrmtrUse() != null ) {

			String[] arrayi0 = l.getLibraryPrmtrUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getParameter().size() < i0+1) { library.addParameter(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getParameter().get(i0).setUse(new org.hl7.fhir.r4.model.ParameterDefinition.ParameterUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Library_Pblshr ********************************************************************************/
		if(l.getLibraryPblshr() != null ) {

			if(l.getLibraryPblshr().replace("[","").replace("]","").equals("NULL") | l.getLibraryPblshr()==null) {} else {
			library.setPublisher(l.getLibraryPblshr().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Library_Prpse ********************************************************************************/
		if(l.getLibraryPrpse() != null ) {

			if(l.getLibraryPrpse().replace("[","").replace("]","").equals("NULL") | l.getLibraryPrpse()==null) {} else {
			library.setPurpose(l.getLibraryPrpse().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Library_RltedArtfct_Citation ********************************************************************************/
		if(l.getLibraryRltedArtfctCitation() != null ) {

			String[] arrayi0 = l.getLibraryRltedArtfctCitation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getRelatedArtifact().size() < i0+1) { library.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getRelatedArtifact().get(i0).setCitation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_RltedArtfct_Dsply ********************************************************************************/
		if(l.getLibraryRltedArtfctDsply() != null ) {

			String[] arrayi0 = l.getLibraryRltedArtfctDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getRelatedArtifact().size() < i0+1) { library.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getRelatedArtifact().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(l.getLibraryRltedArtfctDocCntntTyp() != null ) {

			String[] arrayi0 = l.getLibraryRltedArtfctDocCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getRelatedArtifact().size() < i0+1) { library.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getRelatedArtifact().get(i0).getDocument().setContentType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_RltedArtfct_Doc_Creation ********************************************************************************/
		if(l.getLibraryRltedArtfctDocCreation() != null ) {

			String[] arrayi0 = l.getLibraryRltedArtfctDocCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getRelatedArtifact().size() < i0+1) { library.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getRelatedArtifact().get(i0).getDocument().setCreation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Library_RltedArtfct_Doc_Data ********************************************************************************/
		if(l.getLibraryRltedArtfctDocData() != null ) {

			String[] arrayi0 = l.getLibraryRltedArtfctDocData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getRelatedArtifact().size() < i0+1) { library.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getRelatedArtifact().get(i0).getDocument().setData(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** Library_RltedArtfct_Doc_Hash ********************************************************************************/
		if(l.getLibraryRltedArtfctDocHash() != null ) {

			String[] arrayi0 = l.getLibraryRltedArtfctDocHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getRelatedArtifact().size() < i0+1) { library.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getRelatedArtifact().get(i0).getDocument().setHash(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** Library_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(l.getLibraryRltedArtfctDocLnguage() != null ) {

			String[] arrayi0 = l.getLibraryRltedArtfctDocLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getRelatedArtifact().size() < i0+1) { library.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getRelatedArtifact().get(i0).getDocument().setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_RltedArtfct_Doc_Sz ********************************************************************************/
		if(l.getLibraryRltedArtfctDocSz() != null ) {

			String[] arrayi0 = l.getLibraryRltedArtfctDocSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getRelatedArtifact().size() < i0+1) { library.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getRelatedArtifact().get(i0).getDocument().setSize(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Library_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(l.getLibraryRltedArtfctDocTtl() != null ) {

			String[] arrayi0 = l.getLibraryRltedArtfctDocTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getRelatedArtifact().size() < i0+1) { library.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getRelatedArtifact().get(i0).getDocument().setTitle(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_RltedArtfct_Doc_Url ********************************************************************************/
		if(l.getLibraryRltedArtfctDocUrl() != null ) {

			String[] arrayi0 = l.getLibraryRltedArtfctDocUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getRelatedArtifact().size() < i0+1) { library.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getRelatedArtifact().get(i0).getDocument().setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_RltedArtfct_Lbl ********************************************************************************/
		if(l.getLibraryRltedArtfctLbl() != null ) {

			String[] arrayi0 = l.getLibraryRltedArtfctLbl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getRelatedArtifact().size() < i0+1) { library.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getRelatedArtifact().get(i0).setLabel(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_RltedArtfct_Rsrc ********************************************************************************/
		if(l.getLibraryRltedArtfctRsrc() != null ) {

			String[] arrayi0 = l.getLibraryRltedArtfctRsrc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getRelatedArtifact().size() < i0+1) { library.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getRelatedArtifact().get(i0).setResource(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_RltedArtfct_Typ ********************************************************************************/
		if(l.getLibraryRltedArtfctTyp() != null ) {

			String[] arrayi0 = l.getLibraryRltedArtfctTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getRelatedArtifact().size() < i0+1) { library.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getRelatedArtifact().get(i0).setType(new org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Library_RltedArtfct_Url ********************************************************************************/
		if(l.getLibraryRltedArtfctUrl() != null ) {

			String[] arrayi0 = l.getLibraryRltedArtfctUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getRelatedArtifact().size() < i0+1) { library.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getRelatedArtifact().get(i0).setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_Rviewr_Nm ********************************************************************************/
		if(l.getLibraryRviewrNm() != null ) {

			String[] arrayi0 = l.getLibraryRviewrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getReviewer().size() < i0+1) { library.addReviewer(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getReviewer().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(l.getLibraryRviewrTlcmPrdEnd() != null ) {

			String[] arrayi0 = l.getLibraryRviewrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getReviewer().size() < i0+1) { library.addReviewer(); }
				String[] arrayi1 = l.getLibraryRviewrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getReviewer().get(i0).getTelecom().size() < i1+1) { library.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getReviewer().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Library_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(l.getLibraryRviewrTlcmPrdStrt() != null ) {

			String[] arrayi0 = l.getLibraryRviewrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getReviewer().size() < i0+1) { library.addReviewer(); }
				String[] arrayi1 = l.getLibraryRviewrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getReviewer().get(i0).getTelecom().size() < i1+1) { library.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getReviewer().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Library_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(l.getLibraryRviewrTlcmRnk() != null ) {

			String[] arrayi0 = l.getLibraryRviewrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getReviewer().size() < i0+1) { library.addReviewer(); }
				String[] arrayi1 = l.getLibraryRviewrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getReviewer().get(i0).getTelecom().size() < i1+1) { library.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getReviewer().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Library_Rviewr_Tlcm_Sys ********************************************************************************/
		if(l.getLibraryRviewrTlcmSys() != null ) {

			String[] arrayi0 = l.getLibraryRviewrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getReviewer().size() < i0+1) { library.addReviewer(); }
				String[] arrayi1 = l.getLibraryRviewrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getReviewer().get(i0).getTelecom().size() < i1+1) { library.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getReviewer().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Library_Rviewr_Tlcm_Use ********************************************************************************/
		if(l.getLibraryRviewrTlcmUse() != null ) {

			String[] arrayi0 = l.getLibraryRviewrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getReviewer().size() < i0+1) { library.addReviewer(); }
				String[] arrayi1 = l.getLibraryRviewrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getReviewer().get(i0).getTelecom().size() < i1+1) { library.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getReviewer().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Library_Rviewr_Tlcm_Vl ********************************************************************************/
		if(l.getLibraryRviewrTlcmVl() != null ) {

			String[] arrayi0 = l.getLibraryRviewrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getReviewer().size() < i0+1) { library.addReviewer(); }
				String[] arrayi1 = l.getLibraryRviewrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getReviewer().get(i0).getTelecom().size() < i1+1) { library.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getReviewer().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Library_Sts ********************************************************************************/
		if(l.getLibrarySts() != null ) {

			if(l.getLibrarySts().replace("[","").replace("]","").equals("NULL") | l.getLibrarySts()==null) {} else {
			library.setStatus(new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory().fromCode(l.getLibrarySts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Library_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(l.getLibrarySbjctCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = l.getLibrarySbjctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getSubjectCodeableConcept().getCoding().size() < i0+1) { library.getSubjectCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getSubjectCodeableConcept().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(l.getLibrarySbjctCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = l.getLibrarySbjctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getSubjectCodeableConcept().getCoding().size() < i0+1) { library.getSubjectCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getSubjectCodeableConcept().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(l.getLibrarySbjctCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = l.getLibrarySbjctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getSubjectCodeableConcept().getCoding().size() < i0+1) { library.getSubjectCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getSubjectCodeableConcept().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(l.getLibrarySbjctCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = l.getLibrarySbjctCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getSubjectCodeableConcept().getCoding().size() < i0+1) { library.getSubjectCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getSubjectCodeableConcept().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Library_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(l.getLibrarySbjctCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = l.getLibrarySbjctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getSubjectCodeableConcept().getCoding().size() < i0+1) { library.getSubjectCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getSubjectCodeableConcept().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(l.getLibrarySbjctCdbleCncptTxt() != null ) {

			if(l.getLibrarySbjctCdbleCncptTxt().replace("[","").replace("]","").equals("NULL") | l.getLibrarySbjctCdbleCncptTxt()==null) {} else {
			library.getSubjectCodeableConcept().setText(l.getLibrarySbjctCdbleCncptTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Library_SbjctRfrnc ********************************************************************************/
		if(l.getLibrarySbjctRfrnc() != null ) {

			if(l.getLibrarySbjctRfrnc().replace("[","").replace("]","").equals("NULL") | l.getLibrarySbjctRfrnc()==null) {} else {
			library.setSubject(new org.hl7.fhir.r4.model.Reference(l.getLibrarySbjctRfrnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Library_Subtitle ********************************************************************************/
		if(l.getLibrarySubtitle() != null ) {

			if(l.getLibrarySubtitle().replace("[","").replace("]","").equals("NULL") | l.getLibrarySubtitle()==null) {} else {
			library.setSubtitle(l.getLibrarySubtitle().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Library_Ttl ********************************************************************************/
		if(l.getLibraryTtl() != null ) {

			if(l.getLibraryTtl().replace("[","").replace("]","").equals("NULL") | l.getLibraryTtl()==null) {} else {
			library.setTitle(l.getLibraryTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Library_Topic_Cdg_Cd ********************************************************************************/
		if(l.getLibraryTopicCdgCd() != null ) {

			String[] arrayi0 = l.getLibraryTopicCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getTopic().size() < i0+1) { library.addTopic(); }
				String[] arrayi1 = l.getLibraryTopicCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getTopic().get(i0).getCoding().size() < i1+1) { library.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getTopic().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Library_Topic_Cdg_Dsply ********************************************************************************/
		if(l.getLibraryTopicCdgDsply() != null ) {

			String[] arrayi0 = l.getLibraryTopicCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getTopic().size() < i0+1) { library.addTopic(); }
				String[] arrayi1 = l.getLibraryTopicCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getTopic().get(i0).getCoding().size() < i1+1) { library.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getTopic().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Library_Topic_Cdg_Sys ********************************************************************************/
		if(l.getLibraryTopicCdgSys() != null ) {

			String[] arrayi0 = l.getLibraryTopicCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getTopic().size() < i0+1) { library.addTopic(); }
				String[] arrayi1 = l.getLibraryTopicCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getTopic().get(i0).getCoding().size() < i1+1) { library.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getTopic().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Library_Topic_Cdg_UsrSltd ********************************************************************************/
		if(l.getLibraryTopicCdgUsrSltd() != null ) {

			String[] arrayi0 = l.getLibraryTopicCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getTopic().size() < i0+1) { library.addTopic(); }
				String[] arrayi1 = l.getLibraryTopicCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getTopic().get(i0).getCoding().size() < i1+1) { library.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getTopic().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Library_Topic_Cdg_Vrsn ********************************************************************************/
		if(l.getLibraryTopicCdgVrsn() != null ) {

			String[] arrayi0 = l.getLibraryTopicCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getTopic().size() < i0+1) { library.addTopic(); }
				String[] arrayi1 = l.getLibraryTopicCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getTopic().get(i0).getCoding().size() < i1+1) { library.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getTopic().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Library_Topic_Txt ********************************************************************************/
		if(l.getLibraryTopicTxt() != null ) {

			String[] arrayi0 = l.getLibraryTopicTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getTopic().size() < i0+1) { library.addTopic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getTopic().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_Typ_Cdg_Cd ********************************************************************************/
		if(l.getLibraryTypCdgCd() != null ) {

			String[] arrayi0 = l.getLibraryTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getType().getCoding().size() < i0+1) { library.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_Typ_Cdg_Dsply ********************************************************************************/
		if(l.getLibraryTypCdgDsply() != null ) {

			String[] arrayi0 = l.getLibraryTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getType().getCoding().size() < i0+1) { library.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_Typ_Cdg_Sys ********************************************************************************/
		if(l.getLibraryTypCdgSys() != null ) {

			String[] arrayi0 = l.getLibraryTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getType().getCoding().size() < i0+1) { library.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_Typ_Cdg_UsrSltd ********************************************************************************/
		if(l.getLibraryTypCdgUsrSltd() != null ) {

			String[] arrayi0 = l.getLibraryTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getType().getCoding().size() < i0+1) { library.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Library_Typ_Cdg_Vrsn ********************************************************************************/
		if(l.getLibraryTypCdgVrsn() != null ) {

			String[] arrayi0 = l.getLibraryTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getType().getCoding().size() < i0+1) { library.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_Typ_Txt ********************************************************************************/
		if(l.getLibraryTypTxt() != null ) {

			if(l.getLibraryTypTxt().replace("[","").replace("]","").equals("NULL") | l.getLibraryTypTxt()==null) {} else {
			library.getType().setText(l.getLibraryTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Library_Url ********************************************************************************/
		if(l.getLibraryUrl() != null ) {

			if(l.getLibraryUrl().replace("[","").replace("]","").equals("NULL") | l.getLibraryUrl()==null) {} else {
			library.setUrl(l.getLibraryUrl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Library_Usg ********************************************************************************/
		if(l.getLibraryUsg() != null ) {

			if(l.getLibraryUsg().replace("[","").replace("]","").equals("NULL") | l.getLibraryUsg()==null) {} else {
			library.setUsage(l.getLibraryUsg().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Library_UseCntxt_Cd_Cd ********************************************************************************/
		if(l.getLibraryUseCntxtCdCd() != null ) {

			String[] arrayi0 = l.getLibraryUseCntxtCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getUseContext().size() < i0+1) { library.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getUseContext().get(i0).getCode().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_UseCntxt_Cd_Dsply ********************************************************************************/
		if(l.getLibraryUseCntxtCdDsply() != null ) {

			String[] arrayi0 = l.getLibraryUseCntxtCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getUseContext().size() < i0+1) { library.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getUseContext().get(i0).getCode().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_UseCntxt_Cd_Sys ********************************************************************************/
		if(l.getLibraryUseCntxtCdSys() != null ) {

			String[] arrayi0 = l.getLibraryUseCntxtCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getUseContext().size() < i0+1) { library.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getUseContext().get(i0).getCode().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(l.getLibraryUseCntxtCdUsrSltd() != null ) {

			String[] arrayi0 = l.getLibraryUseCntxtCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getUseContext().size() < i0+1) { library.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getUseContext().get(i0).getCode().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Library_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(l.getLibraryUseCntxtCdVrsn() != null ) {

			String[] arrayi0 = l.getLibraryUseCntxtCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getUseContext().size() < i0+1) { library.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getUseContext().get(i0).getCode().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(l.getLibraryUseCntxtVlCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = l.getLibraryUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getUseContext().size() < i0+1) { library.addUseContext(); }
				String[] arrayi1 = l.getLibraryUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { library.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Library_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(l.getLibraryUseCntxtVlCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = l.getLibraryUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getUseContext().size() < i0+1) { library.addUseContext(); }
				String[] arrayi1 = l.getLibraryUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { library.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Library_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(l.getLibraryUseCntxtVlCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = l.getLibraryUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getUseContext().size() < i0+1) { library.addUseContext(); }
				String[] arrayi1 = l.getLibraryUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { library.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Library_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(l.getLibraryUseCntxtVlCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = l.getLibraryUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getUseContext().size() < i0+1) { library.addUseContext(); }
				String[] arrayi1 = l.getLibraryUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { library.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Library_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(l.getLibraryUseCntxtVlCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = l.getLibraryUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getUseContext().size() < i0+1) { library.addUseContext(); }
				String[] arrayi1 = l.getLibraryUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(library.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { library.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {library.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Library_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(l.getLibraryUseCntxtVlCdbleCncptTxt() != null ) {

			String[] arrayi0 = l.getLibraryUseCntxtVlCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getUseContext().size() < i0+1) { library.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getUseContext().get(i0).getValueCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(l.getLibraryUseCntxtVlQntyCd() != null ) {

			String[] arrayi0 = l.getLibraryUseCntxtVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getUseContext().size() < i0+1) { library.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getUseContext().get(i0).getValueQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_UseCntxt_VlQnty_Cmprtr ********************************************************************************/
		if(l.getLibraryUseCntxtVlQntyCmprtr() != null ) {

			String[] arrayi0 = l.getLibraryUseCntxtVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getUseContext().size() < i0+1) { library.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getUseContext().get(i0).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Library_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(l.getLibraryUseCntxtVlQntySys() != null ) {

			String[] arrayi0 = l.getLibraryUseCntxtVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getUseContext().size() < i0+1) { library.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getUseContext().get(i0).getValueQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(l.getLibraryUseCntxtVlQntyUnt() != null ) {

			String[] arrayi0 = l.getLibraryUseCntxtVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getUseContext().size() < i0+1) { library.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getUseContext().get(i0).getValueQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(l.getLibraryUseCntxtVlQntyVl() != null ) {

			String[] arrayi0 = l.getLibraryUseCntxtVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getUseContext().size() < i0+1) { library.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getUseContext().get(i0).getValueQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Library_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(l.getLibraryUseCntxtVlRngHiCd() != null ) {

			String[] arrayi0 = l.getLibraryUseCntxtVlRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getUseContext().size() < i0+1) { library.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getUseContext().get(i0).getValueRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_UseCntxt_VlRng_Hi_Cmprtr ********************************************************************************/
		if(l.getLibraryUseCntxtVlRngHiCmprtr() != null ) {

			String[] arrayi0 = l.getLibraryUseCntxtVlRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getUseContext().size() < i0+1) { library.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getUseContext().get(i0).getValueRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Library_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(l.getLibraryUseCntxtVlRngHiSys() != null ) {

			String[] arrayi0 = l.getLibraryUseCntxtVlRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getUseContext().size() < i0+1) { library.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getUseContext().get(i0).getValueRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(l.getLibraryUseCntxtVlRngHiUnt() != null ) {

			String[] arrayi0 = l.getLibraryUseCntxtVlRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getUseContext().size() < i0+1) { library.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getUseContext().get(i0).getValueRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(l.getLibraryUseCntxtVlRngHiVl() != null ) {

			String[] arrayi0 = l.getLibraryUseCntxtVlRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getUseContext().size() < i0+1) { library.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getUseContext().get(i0).getValueRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Library_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(l.getLibraryUseCntxtVlRngLwCd() != null ) {

			String[] arrayi0 = l.getLibraryUseCntxtVlRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getUseContext().size() < i0+1) { library.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getUseContext().get(i0).getValueRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_UseCntxt_VlRng_Lw_Cmprtr ********************************************************************************/
		if(l.getLibraryUseCntxtVlRngLwCmprtr() != null ) {

			String[] arrayi0 = l.getLibraryUseCntxtVlRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getUseContext().size() < i0+1) { library.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getUseContext().get(i0).getValueRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Library_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(l.getLibraryUseCntxtVlRngLwSys() != null ) {

			String[] arrayi0 = l.getLibraryUseCntxtVlRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getUseContext().size() < i0+1) { library.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getUseContext().get(i0).getValueRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(l.getLibraryUseCntxtVlRngLwUnt() != null ) {

			String[] arrayi0 = l.getLibraryUseCntxtVlRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getUseContext().size() < i0+1) { library.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getUseContext().get(i0).getValueRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Library_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(l.getLibraryUseCntxtVlRngLwVl() != null ) {

			String[] arrayi0 = l.getLibraryUseCntxtVlRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getUseContext().size() < i0+1) { library.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getUseContext().get(i0).getValueRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Library_UseCntxt_VlRfrnc ********************************************************************************/
		if(l.getLibraryUseCntxtVlRfrnc() != null ) {

			String[] arrayi0 = l.getLibraryUseCntxtVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(library.getUseContext().size() < i0+1) { library.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {library.getUseContext().get(i0).setValue(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Library_Vrsn ********************************************************************************/
		if(l.getLibraryVrsn() != null ) {

			if(l.getLibraryVrsn().replace("[","").replace("]","").equals("NULL") | l.getLibraryVrsn()==null) {} else {
			library.setVersion(l.getLibraryVrsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return library;
	}
}
