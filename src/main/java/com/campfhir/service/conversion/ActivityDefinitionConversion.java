package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ActivityDefinition;
public class ActivityDefinitionConversion 
{
	public org.hl7.fhir.r4.model.ActivityDefinition ActivityDefinitions(ActivityDefinition a) throws ParseException
	{
		org.hl7.fhir.r4.model.ActivityDefinition activitydefinition = new org.hl7.fhir.r4.model.ActivityDefinition();

		/******************** id ********************************************************************************/
		activitydefinition.setId(a.getId());

		/******************** ActvtyDfn_ApprovalDt ********************************************************************************/
		if(a.getActvtyDfnApprovalDt() != null ) {

			if(a.getActvtyDfnApprovalDt().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnApprovalDt()==null) {} else {
			activitydefinition.setApprovalDate(a.getActvtyDfnApprovalDt().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnApprovalDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(a.getActvtyDfnApprovalDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ActvtyDfn_Athr_Nm ********************************************************************************/
		if(a.getActvtyDfnAthrNm() != null ) {

			String[] arrayi0 = a.getActvtyDfnAthrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getAuthor().size() < i0+1) { activitydefinition.addAuthor(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getAuthor().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Athr_Tlcm_Prd_End ********************************************************************************/
		if(a.getActvtyDfnAthrTlcmPrdEnd() != null ) {

			String[] arrayi0 = a.getActvtyDfnAthrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getAuthor().size() < i0+1) { activitydefinition.addAuthor(); }
				String[] arrayi1 = a.getActvtyDfnAthrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getAuthor().get(i0).getTelecom().size() < i1+1) { activitydefinition.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getAuthor().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(a.getActvtyDfnAthrTlcmPrdStrt() != null ) {

			String[] arrayi0 = a.getActvtyDfnAthrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getAuthor().size() < i0+1) { activitydefinition.addAuthor(); }
				String[] arrayi1 = a.getActvtyDfnAthrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getAuthor().get(i0).getTelecom().size() < i1+1) { activitydefinition.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getAuthor().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Athr_Tlcm_Rnk ********************************************************************************/
		if(a.getActvtyDfnAthrTlcmRnk() != null ) {

			String[] arrayi0 = a.getActvtyDfnAthrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getAuthor().size() < i0+1) { activitydefinition.addAuthor(); }
				String[] arrayi1 = a.getActvtyDfnAthrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getAuthor().get(i0).getTelecom().size() < i1+1) { activitydefinition.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getAuthor().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Athr_Tlcm_Sys ********************************************************************************/
		if(a.getActvtyDfnAthrTlcmSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnAthrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getAuthor().size() < i0+1) { activitydefinition.addAuthor(); }
				String[] arrayi1 = a.getActvtyDfnAthrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getAuthor().get(i0).getTelecom().size() < i1+1) { activitydefinition.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getAuthor().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Athr_Tlcm_Use ********************************************************************************/
		if(a.getActvtyDfnAthrTlcmUse() != null ) {

			String[] arrayi0 = a.getActvtyDfnAthrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getAuthor().size() < i0+1) { activitydefinition.addAuthor(); }
				String[] arrayi1 = a.getActvtyDfnAthrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getAuthor().get(i0).getTelecom().size() < i1+1) { activitydefinition.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getAuthor().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Athr_Tlcm_Vl ********************************************************************************/
		if(a.getActvtyDfnAthrTlcmVl() != null ) {

			String[] arrayi0 = a.getActvtyDfnAthrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getAuthor().size() < i0+1) { activitydefinition.addAuthor(); }
				String[] arrayi1 = a.getActvtyDfnAthrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getAuthor().get(i0).getTelecom().size() < i1+1) { activitydefinition.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getAuthor().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_BodySite_Cdg_Cd ********************************************************************************/
		if(a.getActvtyDfnBodySiteCdgCd() != null ) {

			String[] arrayi0 = a.getActvtyDfnBodySiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getBodySite().size() < i0+1) { activitydefinition.addBodySite(); }
				String[] arrayi1 = a.getActvtyDfnBodySiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getBodySite().get(i0).getCoding().size() < i1+1) { activitydefinition.getBodySite().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getBodySite().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_BodySite_Cdg_Dsply ********************************************************************************/
		if(a.getActvtyDfnBodySiteCdgDsply() != null ) {

			String[] arrayi0 = a.getActvtyDfnBodySiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getBodySite().size() < i0+1) { activitydefinition.addBodySite(); }
				String[] arrayi1 = a.getActvtyDfnBodySiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getBodySite().get(i0).getCoding().size() < i1+1) { activitydefinition.getBodySite().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getBodySite().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_BodySite_Cdg_Sys ********************************************************************************/
		if(a.getActvtyDfnBodySiteCdgSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnBodySiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getBodySite().size() < i0+1) { activitydefinition.addBodySite(); }
				String[] arrayi1 = a.getActvtyDfnBodySiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getBodySite().get(i0).getCoding().size() < i1+1) { activitydefinition.getBodySite().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getBodySite().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(a.getActvtyDfnBodySiteCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getActvtyDfnBodySiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getBodySite().size() < i0+1) { activitydefinition.addBodySite(); }
				String[] arrayi1 = a.getActvtyDfnBodySiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getBodySite().get(i0).getCoding().size() < i1+1) { activitydefinition.getBodySite().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getBodySite().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_BodySite_Cdg_Vrsn ********************************************************************************/
		if(a.getActvtyDfnBodySiteCdgVrsn() != null ) {

			String[] arrayi0 = a.getActvtyDfnBodySiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getBodySite().size() < i0+1) { activitydefinition.addBodySite(); }
				String[] arrayi1 = a.getActvtyDfnBodySiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getBodySite().get(i0).getCoding().size() < i1+1) { activitydefinition.getBodySite().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getBodySite().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_BodySite_Txt ********************************************************************************/
		if(a.getActvtyDfnBodySiteTxt() != null ) {

			String[] arrayi0 = a.getActvtyDfnBodySiteTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getBodySite().size() < i0+1) { activitydefinition.addBodySite(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getBodySite().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Cd_Cdg_Cd ********************************************************************************/
		if(a.getActvtyDfnCdCdgCd() != null ) {

			String[] arrayi0 = a.getActvtyDfnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getCode().getCoding().size() < i0+1) { activitydefinition.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Cd_Cdg_Dsply ********************************************************************************/
		if(a.getActvtyDfnCdCdgDsply() != null ) {

			String[] arrayi0 = a.getActvtyDfnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getCode().getCoding().size() < i0+1) { activitydefinition.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Cd_Cdg_Sys ********************************************************************************/
		if(a.getActvtyDfnCdCdgSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getCode().getCoding().size() < i0+1) { activitydefinition.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(a.getActvtyDfnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getActvtyDfnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getCode().getCoding().size() < i0+1) { activitydefinition.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ActvtyDfn_Cd_Cdg_Vrsn ********************************************************************************/
		if(a.getActvtyDfnCdCdgVrsn() != null ) {

			String[] arrayi0 = a.getActvtyDfnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getCode().getCoding().size() < i0+1) { activitydefinition.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Cd_Txt ********************************************************************************/
		if(a.getActvtyDfnCdTxt() != null ) {

			if(a.getActvtyDfnCdTxt().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnCdTxt()==null) {} else {
			activitydefinition.getCode().setText(a.getActvtyDfnCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_Cntct_Nm ********************************************************************************/
		if(a.getActvtyDfnCntctNm() != null ) {

			String[] arrayi0 = a.getActvtyDfnCntctNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getContact().size() < i0+1) { activitydefinition.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getContact().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(a.getActvtyDfnCntctTlcmPrdEnd() != null ) {

			String[] arrayi0 = a.getActvtyDfnCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getContact().size() < i0+1) { activitydefinition.addContact(); }
				String[] arrayi1 = a.getActvtyDfnCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getContact().get(i0).getTelecom().size() < i1+1) { activitydefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getContact().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(a.getActvtyDfnCntctTlcmPrdStrt() != null ) {

			String[] arrayi0 = a.getActvtyDfnCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getContact().size() < i0+1) { activitydefinition.addContact(); }
				String[] arrayi1 = a.getActvtyDfnCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getContact().get(i0).getTelecom().size() < i1+1) { activitydefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getContact().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(a.getActvtyDfnCntctTlcmRnk() != null ) {

			String[] arrayi0 = a.getActvtyDfnCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getContact().size() < i0+1) { activitydefinition.addContact(); }
				String[] arrayi1 = a.getActvtyDfnCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getContact().get(i0).getTelecom().size() < i1+1) { activitydefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getContact().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Cntct_Tlcm_Sys ********************************************************************************/
		if(a.getActvtyDfnCntctTlcmSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getContact().size() < i0+1) { activitydefinition.addContact(); }
				String[] arrayi1 = a.getActvtyDfnCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getContact().get(i0).getTelecom().size() < i1+1) { activitydefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getContact().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Cntct_Tlcm_Use ********************************************************************************/
		if(a.getActvtyDfnCntctTlcmUse() != null ) {

			String[] arrayi0 = a.getActvtyDfnCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getContact().size() < i0+1) { activitydefinition.addContact(); }
				String[] arrayi1 = a.getActvtyDfnCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getContact().get(i0).getTelecom().size() < i1+1) { activitydefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getContact().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(a.getActvtyDfnCntctTlcmVl() != null ) {

			String[] arrayi0 = a.getActvtyDfnCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getContact().size() < i0+1) { activitydefinition.addContact(); }
				String[] arrayi1 = a.getActvtyDfnCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getContact().get(i0).getTelecom().size() < i1+1) { activitydefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getContact().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Copyright ********************************************************************************/
		if(a.getActvtyDfnCopyright() != null ) {

			if(a.getActvtyDfnCopyright().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnCopyright()==null) {} else {
			activitydefinition.setCopyright(a.getActvtyDfnCopyright().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_Dt ********************************************************************************/
		if(a.getActvtyDfnDt() != null ) {

			if(a.getActvtyDfnDt().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnDt()==null) {} else {
			activitydefinition.setDate(a.getActvtyDfnDt().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(a.getActvtyDfnDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ActvtyDfn_Dscrptn ********************************************************************************/
		if(a.getActvtyDfnDscrptn() != null ) {

			if(a.getActvtyDfnDscrptn().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnDscrptn()==null) {} else {
			activitydefinition.setDescription(a.getActvtyDfnDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_DoNotPerform ********************************************************************************/
		if(a.getActvtyDfnDoNotPerform() != null ) {

			if(a.getActvtyDfnDoNotPerform().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnDoNotPerform()==null) {} else {
			activitydefinition.setDoNotPerform(Boolean.parseBoolean(a.getActvtyDfnDoNotPerform().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ActvtyDfn_Dsg_AddtnlInstrctn_Cdg_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgAddtnlInstrctnCdgCd() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgAddtnlInstrctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgAddtnlInstrctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getAdditionalInstruction().size() < i1+1) { activitydefinition.getDosage().get(i0).addAdditionalInstruction(); }
					String[] arrayi2 = a.getActvtyDfnDsgAddtnlInstrctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(activitydefinition.getDosage().get(i0).getAdditionalInstruction().get(i1).getCoding().size() < i2+1) { activitydefinition.getDosage().get(i0).getAdditionalInstruction().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {activitydefinition.getDosage().get(i0).getAdditionalInstruction().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ActvtyDfn_Dsg_AddtnlInstrctn_Cdg_Dsply ********************************************************************************/
		if(a.getActvtyDfnDsgAddtnlInstrctnCdgDsply() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgAddtnlInstrctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgAddtnlInstrctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getAdditionalInstruction().size() < i1+1) { activitydefinition.getDosage().get(i0).addAdditionalInstruction(); }
					String[] arrayi2 = a.getActvtyDfnDsgAddtnlInstrctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(activitydefinition.getDosage().get(i0).getAdditionalInstruction().get(i1).getCoding().size() < i2+1) { activitydefinition.getDosage().get(i0).getAdditionalInstruction().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {activitydefinition.getDosage().get(i0).getAdditionalInstruction().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ActvtyDfn_Dsg_AddtnlInstrctn_Cdg_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgAddtnlInstrctnCdgSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgAddtnlInstrctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgAddtnlInstrctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getAdditionalInstruction().size() < i1+1) { activitydefinition.getDosage().get(i0).addAdditionalInstruction(); }
					String[] arrayi2 = a.getActvtyDfnDsgAddtnlInstrctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(activitydefinition.getDosage().get(i0).getAdditionalInstruction().get(i1).getCoding().size() < i2+1) { activitydefinition.getDosage().get(i0).getAdditionalInstruction().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {activitydefinition.getDosage().get(i0).getAdditionalInstruction().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ActvtyDfn_Dsg_AddtnlInstrctn_Cdg_UsrSltd ********************************************************************************/
		if(a.getActvtyDfnDsgAddtnlInstrctnCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgAddtnlInstrctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgAddtnlInstrctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getAdditionalInstruction().size() < i1+1) { activitydefinition.getDosage().get(i0).addAdditionalInstruction(); }
					String[] arrayi2 = a.getActvtyDfnDsgAddtnlInstrctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(activitydefinition.getDosage().get(i0).getAdditionalInstruction().get(i1).getCoding().size() < i2+1) { activitydefinition.getDosage().get(i0).getAdditionalInstruction().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {activitydefinition.getDosage().get(i0).getAdditionalInstruction().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ActvtyDfn_Dsg_AddtnlInstrctn_Cdg_Vrsn ********************************************************************************/
		if(a.getActvtyDfnDsgAddtnlInstrctnCdgVrsn() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgAddtnlInstrctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgAddtnlInstrctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getAdditionalInstruction().size() < i1+1) { activitydefinition.getDosage().get(i0).addAdditionalInstruction(); }
					String[] arrayi2 = a.getActvtyDfnDsgAddtnlInstrctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(activitydefinition.getDosage().get(i0).getAdditionalInstruction().get(i1).getCoding().size() < i2+1) { activitydefinition.getDosage().get(i0).getAdditionalInstruction().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {activitydefinition.getDosage().get(i0).getAdditionalInstruction().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ActvtyDfn_Dsg_AddtnlInstrctn_Txt ********************************************************************************/
		if(a.getActvtyDfnDsgAddtnlInstrctnTxt() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgAddtnlInstrctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgAddtnlInstrctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getAdditionalInstruction().size() < i1+1) { activitydefinition.getDosage().get(i0).addAdditionalInstruction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getAdditionalInstruction().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_AsNdBooleanTyp ********************************************************************************/
		if(a.getActvtyDfnDsgAsNdBooleanTyp() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgAsNdBooleanTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).setAsNeeded(new org.hl7.fhir.r4.model.BooleanType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ActvtyDfn_Dsg_AsNdCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgAsNdCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgAsNdCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgAsNdCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getAsNeededCodeableConcept().getCoding().size() < i1+1) { activitydefinition.getDosage().get(i0).getAsNeededCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getAsNeededCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_AsNdCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(a.getActvtyDfnDsgAsNdCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgAsNdCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgAsNdCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getAsNeededCodeableConcept().getCoding().size() < i1+1) { activitydefinition.getDosage().get(i0).getAsNeededCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getAsNeededCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_AsNdCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgAsNdCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgAsNdCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgAsNdCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getAsNeededCodeableConcept().getCoding().size() < i1+1) { activitydefinition.getDosage().get(i0).getAsNeededCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getAsNeededCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_AsNdCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(a.getActvtyDfnDsgAsNdCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgAsNdCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgAsNdCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getAsNeededCodeableConcept().getCoding().size() < i1+1) { activitydefinition.getDosage().get(i0).getAsNeededCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getAsNeededCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_AsNdCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(a.getActvtyDfnDsgAsNdCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgAsNdCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgAsNdCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getAsNeededCodeableConcept().getCoding().size() < i1+1) { activitydefinition.getDosage().get(i0).getAsNeededCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getAsNeededCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_AsNdCdbleCncpt_Txt ********************************************************************************/
		if(a.getActvtyDfnDsgAsNdCdbleCncptTxt() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgAsNdCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getAsNeededCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseQnty_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtDoseQntyCd() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtDoseQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtDoseQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getDoseQuantity().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseQnty_Cmprtr ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtDoseQntyCmprtr() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtDoseQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtDoseQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getDoseQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseQnty_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtDoseQntySys() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtDoseQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtDoseQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getDoseQuantity().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseQnty_Unt ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtDoseQntyUnt() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtDoseQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtDoseQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getDoseQuantity().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseQnty_Vl ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtDoseQntyVl() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtDoseQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtDoseQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getDoseQuantity().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseRng_Hi_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtDoseRngHiCd() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtDoseRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtDoseRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getDoseRange().getHigh().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseRng_Hi_Cmprtr ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtDoseRngHiCmprtr() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtDoseRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtDoseRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getDoseRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseRng_Hi_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtDoseRngHiSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtDoseRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtDoseRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getDoseRange().getHigh().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseRng_Hi_Unt ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtDoseRngHiUnt() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtDoseRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtDoseRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getDoseRange().getHigh().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseRng_Hi_Vl ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtDoseRngHiVl() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtDoseRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtDoseRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getDoseRange().getHigh().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseRng_Lw_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtDoseRngLwCd() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtDoseRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtDoseRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getDoseRange().getLow().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseRng_Lw_Cmprtr ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtDoseRngLwCmprtr() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtDoseRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtDoseRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getDoseRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseRng_Lw_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtDoseRngLwSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtDoseRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtDoseRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getDoseRange().getLow().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseRng_Lw_Unt ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtDoseRngLwUnt() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtDoseRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtDoseRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getDoseRange().getLow().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_DoseRng_Lw_Vl ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtDoseRngLwVl() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtDoseRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtDoseRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getDoseRange().getLow().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtQnty_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtQntyCd() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtRtQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtRtQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getRateQuantity().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtQnty_Cmprtr ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtQntyCmprtr() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtRtQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtRtQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getRateQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtQnty_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtQntySys() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtRtQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtRtQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getRateQuantity().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtQnty_Unt ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtQntyUnt() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtRtQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtRtQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getRateQuantity().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtQnty_Vl ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtQntyVl() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtRtQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtRtQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getRateQuantity().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRng_Hi_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtRngHiCd() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtRtRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtRtRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getRateRange().getHigh().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRng_Hi_Cmprtr ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtRngHiCmprtr() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtRtRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtRtRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getRateRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRng_Hi_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtRngHiSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtRtRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtRtRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getRateRange().getHigh().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRng_Hi_Unt ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtRngHiUnt() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtRtRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtRtRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getRateRange().getHigh().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRng_Hi_Vl ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtRngHiVl() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtRtRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtRtRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getRateRange().getHigh().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRng_Lw_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtRngLwCd() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtRtRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtRtRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getRateRange().getLow().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRng_Lw_Cmprtr ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtRngLwCmprtr() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtRtRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtRtRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getRateRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRng_Lw_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtRngLwSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtRtRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtRtRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getRateRange().getLow().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRng_Lw_Unt ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtRngLwUnt() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtRtRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtRtRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getRateRange().getLow().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRng_Lw_Vl ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtRngLwVl() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtRtRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtRtRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getRateRange().getLow().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRtio_Dnmntr_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtRtioDnmntrCd() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtRtRtioDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtRtRtioDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getRateRatio().getDenominator().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRtio_Dnmntr_Cmprtr ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtRtioDnmntrCmprtr() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtRtRtioDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtRtRtioDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getRateRatio().getDenominator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRtio_Dnmntr_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtRtioDnmntrSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtRtRtioDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtRtRtioDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getRateRatio().getDenominator().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRtio_Dnmntr_Unt ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtRtioDnmntrUnt() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtRtRtioDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtRtRtioDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getRateRatio().getDenominator().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRtio_Dnmntr_Vl ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtRtioDnmntrVl() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtRtRtioDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtRtRtioDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getRateRatio().getDenominator().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRtio_Nmrtr_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtRtioNmrtrCd() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtRtRtioNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtRtRtioNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getRateRatio().getNumerator().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRtio_Nmrtr_Cmprtr ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtRtioNmrtrCmprtr() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtRtRtioNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtRtRtioNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getRateRatio().getNumerator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRtio_Nmrtr_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtRtioNmrtrSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtRtRtioNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtRtRtioNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getRateRatio().getNumerator().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRtio_Nmrtr_Unt ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtRtioNmrtrUnt() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtRtRtioNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtRtRtioNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getRateRatio().getNumerator().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_RtRtio_Nmrtr_Vl ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtRtRtioNmrtrVl() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtRtRtioNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtRtRtioNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getRateRatio().getNumerator().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_Typ_Cdg_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtTypCdgCd() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					String[] arrayi2 = a.getActvtyDfnDsgDoseAndRtTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getType().getCoding().size() < i2+1) { activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getType().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_Typ_Cdg_Dsply ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtTypCdgDsply() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					String[] arrayi2 = a.getActvtyDfnDsgDoseAndRtTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getType().getCoding().size() < i2+1) { activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getType().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_Typ_Cdg_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtTypCdgSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					String[] arrayi2 = a.getActvtyDfnDsgDoseAndRtTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getType().getCoding().size() < i2+1) { activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getType().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtTypCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					String[] arrayi2 = a.getActvtyDfnDsgDoseAndRtTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getType().getCoding().size() < i2+1) { activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getType().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_Typ_Cdg_Vrsn ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtTypCdgVrsn() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					String[] arrayi2 = a.getActvtyDfnDsgDoseAndRtTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getType().getCoding().size() < i2+1) { activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getType().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** ActvtyDfn_Dsg_DoseAndRt_Typ_Txt ********************************************************************************/
		if(a.getActvtyDfnDsgDoseAndRtTypTxt() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgDoseAndRtTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgDoseAndRtTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getDoseAndRate().size() < i1+1) { activitydefinition.getDosage().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getDoseAndRate().get(i1).getType().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_MxDosePerAdmnstn_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgMxDosePerAdmnstnCd() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgMxDosePerAdmnstnCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getMaxDosePerAdministration().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Dsg_MxDosePerAdmnstn_Cmprtr ********************************************************************************/
		if(a.getActvtyDfnDsgMxDosePerAdmnstnCmprtr() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgMxDosePerAdmnstnCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getMaxDosePerAdministration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ActvtyDfn_Dsg_MxDosePerAdmnstn_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgMxDosePerAdmnstnSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgMxDosePerAdmnstnSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getMaxDosePerAdministration().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Dsg_MxDosePerAdmnstn_Unt ********************************************************************************/
		if(a.getActvtyDfnDsgMxDosePerAdmnstnUnt() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgMxDosePerAdmnstnUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getMaxDosePerAdministration().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Dsg_MxDosePerAdmnstn_Vl ********************************************************************************/
		if(a.getActvtyDfnDsgMxDosePerAdmnstnVl() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgMxDosePerAdmnstnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getMaxDosePerAdministration().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ActvtyDfn_Dsg_MxDosePerLifetime_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgMxDosePerLifetimeCd() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgMxDosePerLifetimeCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getMaxDosePerLifetime().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Dsg_MxDosePerLifetime_Cmprtr ********************************************************************************/
		if(a.getActvtyDfnDsgMxDosePerLifetimeCmprtr() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgMxDosePerLifetimeCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getMaxDosePerLifetime().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ActvtyDfn_Dsg_MxDosePerLifetime_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgMxDosePerLifetimeSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgMxDosePerLifetimeSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getMaxDosePerLifetime().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Dsg_MxDosePerLifetime_Unt ********************************************************************************/
		if(a.getActvtyDfnDsgMxDosePerLifetimeUnt() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgMxDosePerLifetimeUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getMaxDosePerLifetime().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Dsg_MxDosePerLifetime_Vl ********************************************************************************/
		if(a.getActvtyDfnDsgMxDosePerLifetimeVl() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgMxDosePerLifetimeVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getMaxDosePerLifetime().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ActvtyDfn_Dsg_MxDosePerPrd_Dnmntr_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgMxDosePerPrdDnmntrCd() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgMxDosePerPrdDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getMaxDosePerPeriod().getDenominator().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Dsg_MxDosePerPrd_Dnmntr_Cmprtr ********************************************************************************/
		if(a.getActvtyDfnDsgMxDosePerPrdDnmntrCmprtr() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgMxDosePerPrdDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getMaxDosePerPeriod().getDenominator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ActvtyDfn_Dsg_MxDosePerPrd_Dnmntr_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgMxDosePerPrdDnmntrSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgMxDosePerPrdDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getMaxDosePerPeriod().getDenominator().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Dsg_MxDosePerPrd_Dnmntr_Unt ********************************************************************************/
		if(a.getActvtyDfnDsgMxDosePerPrdDnmntrUnt() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgMxDosePerPrdDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getMaxDosePerPeriod().getDenominator().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Dsg_MxDosePerPrd_Dnmntr_Vl ********************************************************************************/
		if(a.getActvtyDfnDsgMxDosePerPrdDnmntrVl() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgMxDosePerPrdDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getMaxDosePerPeriod().getDenominator().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ActvtyDfn_Dsg_MxDosePerPrd_Nmrtr_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgMxDosePerPrdNmrtrCd() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgMxDosePerPrdNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getMaxDosePerPeriod().getNumerator().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Dsg_MxDosePerPrd_Nmrtr_Cmprtr ********************************************************************************/
		if(a.getActvtyDfnDsgMxDosePerPrdNmrtrCmprtr() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgMxDosePerPrdNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getMaxDosePerPeriod().getNumerator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ActvtyDfn_Dsg_MxDosePerPrd_Nmrtr_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgMxDosePerPrdNmrtrSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgMxDosePerPrdNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getMaxDosePerPeriod().getNumerator().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Dsg_MxDosePerPrd_Nmrtr_Unt ********************************************************************************/
		if(a.getActvtyDfnDsgMxDosePerPrdNmrtrUnt() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgMxDosePerPrdNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getMaxDosePerPeriod().getNumerator().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Dsg_MxDosePerPrd_Nmrtr_Vl ********************************************************************************/
		if(a.getActvtyDfnDsgMxDosePerPrdNmrtrVl() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgMxDosePerPrdNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getMaxDosePerPeriod().getNumerator().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ActvtyDfn_Dsg_Mthd_Cdg_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgMthdCdgCd() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgMthdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgMthdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getMethod().getCoding().size() < i1+1) { activitydefinition.getDosage().get(i0).getMethod().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getMethod().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_Mthd_Cdg_Dsply ********************************************************************************/
		if(a.getActvtyDfnDsgMthdCdgDsply() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgMthdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgMthdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getMethod().getCoding().size() < i1+1) { activitydefinition.getDosage().get(i0).getMethod().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getMethod().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_Mthd_Cdg_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgMthdCdgSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgMthdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgMthdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getMethod().getCoding().size() < i1+1) { activitydefinition.getDosage().get(i0).getMethod().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getMethod().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(a.getActvtyDfnDsgMthdCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgMthdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgMthdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getMethod().getCoding().size() < i1+1) { activitydefinition.getDosage().get(i0).getMethod().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getMethod().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_Mthd_Cdg_Vrsn ********************************************************************************/
		if(a.getActvtyDfnDsgMthdCdgVrsn() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgMthdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgMthdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getMethod().getCoding().size() < i1+1) { activitydefinition.getDosage().get(i0).getMethod().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getMethod().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_Mthd_Txt ********************************************************************************/
		if(a.getActvtyDfnDsgMthdTxt() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgMthdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getMethod().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Dsg_PntInstrctn ********************************************************************************/
		if(a.getActvtyDfnDsgPntInstrctn() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgPntInstrctn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).setPatientInstruction(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Dsg_Route_Cdg_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgRouteCdgCd() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgRouteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgRouteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getRoute().getCoding().size() < i1+1) { activitydefinition.getDosage().get(i0).getRoute().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getRoute().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_Route_Cdg_Dsply ********************************************************************************/
		if(a.getActvtyDfnDsgRouteCdgDsply() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgRouteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgRouteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getRoute().getCoding().size() < i1+1) { activitydefinition.getDosage().get(i0).getRoute().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getRoute().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_Route_Cdg_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgRouteCdgSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgRouteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgRouteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getRoute().getCoding().size() < i1+1) { activitydefinition.getDosage().get(i0).getRoute().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getRoute().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_Route_Cdg_UsrSltd ********************************************************************************/
		if(a.getActvtyDfnDsgRouteCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgRouteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgRouteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getRoute().getCoding().size() < i1+1) { activitydefinition.getDosage().get(i0).getRoute().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getRoute().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_Route_Cdg_Vrsn ********************************************************************************/
		if(a.getActvtyDfnDsgRouteCdgVrsn() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgRouteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgRouteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getRoute().getCoding().size() < i1+1) { activitydefinition.getDosage().get(i0).getRoute().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getRoute().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_Route_Txt ********************************************************************************/
		if(a.getActvtyDfnDsgRouteTxt() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgRouteTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getRoute().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Dsg_Sqnc ********************************************************************************/
		if(a.getActvtyDfnDsgSqnc() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).setSequence(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ActvtyDfn_Dsg_Site_Cdg_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgSiteCdgCd() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgSiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgSiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getSite().getCoding().size() < i1+1) { activitydefinition.getDosage().get(i0).getSite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getSite().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_Site_Cdg_Dsply ********************************************************************************/
		if(a.getActvtyDfnDsgSiteCdgDsply() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgSiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgSiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getSite().getCoding().size() < i1+1) { activitydefinition.getDosage().get(i0).getSite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getSite().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_Site_Cdg_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgSiteCdgSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgSiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgSiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getSite().getCoding().size() < i1+1) { activitydefinition.getDosage().get(i0).getSite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getSite().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_Site_Cdg_UsrSltd ********************************************************************************/
		if(a.getActvtyDfnDsgSiteCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgSiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgSiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getSite().getCoding().size() < i1+1) { activitydefinition.getDosage().get(i0).getSite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getSite().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_Site_Cdg_Vrsn ********************************************************************************/
		if(a.getActvtyDfnDsgSiteCdgVrsn() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgSiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgSiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getSite().getCoding().size() < i1+1) { activitydefinition.getDosage().get(i0).getSite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getSite().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_Site_Txt ********************************************************************************/
		if(a.getActvtyDfnDsgSiteTxt() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgSiteTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getSite().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Dsg_Txt ********************************************************************************/
		if(a.getActvtyDfnDsgTxt() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Dsg_Tmg_Cd_Cdg_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgTmgCdCdgCd() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getTiming().getCode().getCoding().size() < i1+1) { activitydefinition.getDosage().get(i0).getTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getTiming().getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_Tmg_Cd_Cdg_Dsply ********************************************************************************/
		if(a.getActvtyDfnDsgTmgCdCdgDsply() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getTiming().getCode().getCoding().size() < i1+1) { activitydefinition.getDosage().get(i0).getTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getTiming().getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_Tmg_Cd_Cdg_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgTmgCdCdgSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getTiming().getCode().getCoding().size() < i1+1) { activitydefinition.getDosage().get(i0).getTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getTiming().getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_Tmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(a.getActvtyDfnDsgTmgCdCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getTiming().getCode().getCoding().size() < i1+1) { activitydefinition.getDosage().get(i0).getTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getTiming().getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_Tmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(a.getActvtyDfnDsgTmgCdCdgVrsn() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				String[] arrayi1 = a.getActvtyDfnDsgTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getDosage().get(i0).getTiming().getCode().getCoding().size() < i1+1) { activitydefinition.getDosage().get(i0).getTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getDosage().get(i0).getTiming().getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_Tmg_Cd_Txt ********************************************************************************/
		if(a.getActvtyDfnDsgTmgCdTxt() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTmgCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getTiming().getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Dsg_Tmg_Evnt ********************************************************************************/
		if(a.getActvtyDfnDsgTmgEvnt() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTmgEvnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {activitydefinition.getDosage().get(i0).getTiming().addEvent(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptBndsDurationCd() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTmgRptBndsDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getTiming().getRepeat().getBoundsDuration().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsDuration_Cmprtr ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptBndsDurationCmprtr() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTmgRptBndsDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getTiming().getRepeat().getBoundsDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptBndsDurationSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTmgRptBndsDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getTiming().getRepeat().getBoundsDuration().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptBndsDurationUnt() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTmgRptBndsDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getTiming().getRepeat().getBoundsDuration().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptBndsDurationVl() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTmgRptBndsDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getTiming().getRepeat().getBoundsDuration().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsPrd_End ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptBndsPrdEnd() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTmgRptBndsPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getTiming().getRepeat().getBoundsPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptBndsPrdStrt() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTmgRptBndsPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getTiming().getRepeat().getBoundsPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptBndsRngHiCd() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTmgRptBndsRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getTiming().getRepeat().getBoundsRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Hi_Cmprtr ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptBndsRngHiCmprtr() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTmgRptBndsRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getTiming().getRepeat().getBoundsRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptBndsRngHiSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTmgRptBndsRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getTiming().getRepeat().getBoundsRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptBndsRngHiUnt() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTmgRptBndsRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getTiming().getRepeat().getBoundsRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptBndsRngHiVl() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTmgRptBndsRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getTiming().getRepeat().getBoundsRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptBndsRngLwCd() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTmgRptBndsRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getTiming().getRepeat().getBoundsRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Lw_Cmprtr ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptBndsRngLwCmprtr() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTmgRptBndsRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getTiming().getRepeat().getBoundsRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptBndsRngLwSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTmgRptBndsRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getTiming().getRepeat().getBoundsRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptBndsRngLwUnt() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTmgRptBndsRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getTiming().getRepeat().getBoundsRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptBndsRngLwVl() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTmgRptBndsRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getTiming().getRepeat().getBoundsRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_Cnt ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptCnt() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTmgRptCnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getTiming().getRepeat().setCount(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_CntMx ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptCntMx() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTmgRptCntMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getTiming().getRepeat().setCountMax(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_Duration ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptDuration() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTmgRptDuration().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getTiming().getRepeat().setDuration((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_DurationMx ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptDurationMx() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTmgRptDurationMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getTiming().getRepeat().setDurationMax((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_DurationUnt ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptDurationUnt() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTmgRptDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getTiming().getRepeat().setDurationUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_Frqncy ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptFrqncy() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTmgRptFrqncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getTiming().getRepeat().setFrequency(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_FrqncyMx ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptFrqncyMx() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTmgRptFrqncyMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getTiming().getRepeat().setFrequencyMax(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_Off ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptOff() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTmgRptOff().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getTiming().getRepeat().setOffset(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_Prd ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptPrd() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTmgRptPrd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getTiming().getRepeat().setPeriod((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_PrdMx ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptPrdMx() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTmgRptPrdMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getTiming().getRepeat().setPeriodMax((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_PrdUnt ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptPrdUnt() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTmgRptPrdUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDosage().get(i0).getTiming().getRepeat().setPeriodUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ActvtyDfn_Dsg_Tmg_Rpt_TimeOfDay ********************************************************************************/
		if(a.getActvtyDfnDsgTmgRptTimeOfDay() != null ) {

			String[] arrayi0 = a.getActvtyDfnDsgTmgRptTimeOfDay().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDosage().size() < i0+1) { activitydefinition.addDosage(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {activitydefinition.getDosage().get(i0).getTiming().getRepeat().addTimeOfDay(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_DynamicVl_Exprsn_Dscrptn ********************************************************************************/
		if(a.getActvtyDfnDynamicVlExprsnDscrptn() != null ) {

			String[] arrayi0 = a.getActvtyDfnDynamicVlExprsnDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDynamicValue().size() < i0+1) { activitydefinition.addDynamicValue(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDynamicValue().get(i0).getExpression().setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_DynamicVl_Exprsn_Exprsn ********************************************************************************/
		if(a.getActvtyDfnDynamicVlExprsnExprsn() != null ) {

			String[] arrayi0 = a.getActvtyDfnDynamicVlExprsnExprsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDynamicValue().size() < i0+1) { activitydefinition.addDynamicValue(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDynamicValue().get(i0).getExpression().setExpression(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_DynamicVl_Exprsn_Lnguage ********************************************************************************/
		if(a.getActvtyDfnDynamicVlExprsnLnguage() != null ) {

			String[] arrayi0 = a.getActvtyDfnDynamicVlExprsnLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDynamicValue().size() < i0+1) { activitydefinition.addDynamicValue(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDynamicValue().get(i0).getExpression().setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_DynamicVl_Exprsn_Nm ********************************************************************************/
		if(a.getActvtyDfnDynamicVlExprsnNm() != null ) {

			String[] arrayi0 = a.getActvtyDfnDynamicVlExprsnNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDynamicValue().size() < i0+1) { activitydefinition.addDynamicValue(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDynamicValue().get(i0).getExpression().setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_DynamicVl_Exprsn_Rfrnc ********************************************************************************/
		if(a.getActvtyDfnDynamicVlExprsnRfrnc() != null ) {

			String[] arrayi0 = a.getActvtyDfnDynamicVlExprsnRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDynamicValue().size() < i0+1) { activitydefinition.addDynamicValue(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDynamicValue().get(i0).getExpression().setReference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_DynamicVl_Path ********************************************************************************/
		if(a.getActvtyDfnDynamicVlPath() != null ) {

			String[] arrayi0 = a.getActvtyDfnDynamicVlPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getDynamicValue().size() < i0+1) { activitydefinition.addDynamicValue(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getDynamicValue().get(i0).setPath(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Editor_Nm ********************************************************************************/
		if(a.getActvtyDfnEditorNm() != null ) {

			String[] arrayi0 = a.getActvtyDfnEditorNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getEditor().size() < i0+1) { activitydefinition.addEditor(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getEditor().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Editor_Tlcm_Prd_End ********************************************************************************/
		if(a.getActvtyDfnEditorTlcmPrdEnd() != null ) {

			String[] arrayi0 = a.getActvtyDfnEditorTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getEditor().size() < i0+1) { activitydefinition.addEditor(); }
				String[] arrayi1 = a.getActvtyDfnEditorTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getEditor().get(i0).getTelecom().size() < i1+1) { activitydefinition.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getEditor().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(a.getActvtyDfnEditorTlcmPrdStrt() != null ) {

			String[] arrayi0 = a.getActvtyDfnEditorTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getEditor().size() < i0+1) { activitydefinition.addEditor(); }
				String[] arrayi1 = a.getActvtyDfnEditorTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getEditor().get(i0).getTelecom().size() < i1+1) { activitydefinition.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getEditor().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Editor_Tlcm_Rnk ********************************************************************************/
		if(a.getActvtyDfnEditorTlcmRnk() != null ) {

			String[] arrayi0 = a.getActvtyDfnEditorTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getEditor().size() < i0+1) { activitydefinition.addEditor(); }
				String[] arrayi1 = a.getActvtyDfnEditorTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getEditor().get(i0).getTelecom().size() < i1+1) { activitydefinition.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getEditor().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Editor_Tlcm_Sys ********************************************************************************/
		if(a.getActvtyDfnEditorTlcmSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnEditorTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getEditor().size() < i0+1) { activitydefinition.addEditor(); }
				String[] arrayi1 = a.getActvtyDfnEditorTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getEditor().get(i0).getTelecom().size() < i1+1) { activitydefinition.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getEditor().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Editor_Tlcm_Use ********************************************************************************/
		if(a.getActvtyDfnEditorTlcmUse() != null ) {

			String[] arrayi0 = a.getActvtyDfnEditorTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getEditor().size() < i0+1) { activitydefinition.addEditor(); }
				String[] arrayi1 = a.getActvtyDfnEditorTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getEditor().get(i0).getTelecom().size() < i1+1) { activitydefinition.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getEditor().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Editor_Tlcm_Vl ********************************************************************************/
		if(a.getActvtyDfnEditorTlcmVl() != null ) {

			String[] arrayi0 = a.getActvtyDfnEditorTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getEditor().size() < i0+1) { activitydefinition.addEditor(); }
				String[] arrayi1 = a.getActvtyDfnEditorTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getEditor().get(i0).getTelecom().size() < i1+1) { activitydefinition.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getEditor().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_EfctivePrd_End ********************************************************************************/
		if(a.getActvtyDfnEfctivePrdEnd() != null ) {

			if(a.getActvtyDfnEfctivePrdEnd().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnEfctivePrdEnd()==null) {} else {
			activitydefinition.getEffectivePeriod().setEnd(a.getActvtyDfnEfctivePrdEnd().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnEfctivePrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(a.getActvtyDfnEfctivePrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ActvtyDfn_EfctivePrd_Strt ********************************************************************************/
		if(a.getActvtyDfnEfctivePrdStrt() != null ) {

			if(a.getActvtyDfnEfctivePrdStrt().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnEfctivePrdStrt()==null) {} else {
			activitydefinition.getEffectivePeriod().setStart(a.getActvtyDfnEfctivePrdStrt().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnEfctivePrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(a.getActvtyDfnEfctivePrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ActvtyDfn_Endsr_Nm ********************************************************************************/
		if(a.getActvtyDfnEndsrNm() != null ) {

			String[] arrayi0 = a.getActvtyDfnEndsrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getEndorser().size() < i0+1) { activitydefinition.addEndorser(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getEndorser().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(a.getActvtyDfnEndsrTlcmPrdEnd() != null ) {

			String[] arrayi0 = a.getActvtyDfnEndsrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getEndorser().size() < i0+1) { activitydefinition.addEndorser(); }
				String[] arrayi1 = a.getActvtyDfnEndsrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getEndorser().get(i0).getTelecom().size() < i1+1) { activitydefinition.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getEndorser().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(a.getActvtyDfnEndsrTlcmPrdStrt() != null ) {

			String[] arrayi0 = a.getActvtyDfnEndsrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getEndorser().size() < i0+1) { activitydefinition.addEndorser(); }
				String[] arrayi1 = a.getActvtyDfnEndsrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getEndorser().get(i0).getTelecom().size() < i1+1) { activitydefinition.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getEndorser().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Endsr_Tlcm_Rnk ********************************************************************************/
		if(a.getActvtyDfnEndsrTlcmRnk() != null ) {

			String[] arrayi0 = a.getActvtyDfnEndsrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getEndorser().size() < i0+1) { activitydefinition.addEndorser(); }
				String[] arrayi1 = a.getActvtyDfnEndsrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getEndorser().get(i0).getTelecom().size() < i1+1) { activitydefinition.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getEndorser().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Endsr_Tlcm_Sys ********************************************************************************/
		if(a.getActvtyDfnEndsrTlcmSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnEndsrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getEndorser().size() < i0+1) { activitydefinition.addEndorser(); }
				String[] arrayi1 = a.getActvtyDfnEndsrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getEndorser().get(i0).getTelecom().size() < i1+1) { activitydefinition.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getEndorser().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Endsr_Tlcm_Use ********************************************************************************/
		if(a.getActvtyDfnEndsrTlcmUse() != null ) {

			String[] arrayi0 = a.getActvtyDfnEndsrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getEndorser().size() < i0+1) { activitydefinition.addEndorser(); }
				String[] arrayi1 = a.getActvtyDfnEndsrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getEndorser().get(i0).getTelecom().size() < i1+1) { activitydefinition.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getEndorser().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Endsr_Tlcm_Vl ********************************************************************************/
		if(a.getActvtyDfnEndsrTlcmVl() != null ) {

			String[] arrayi0 = a.getActvtyDfnEndsrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getEndorser().size() < i0+1) { activitydefinition.addEndorser(); }
				String[] arrayi1 = a.getActvtyDfnEndsrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getEndorser().get(i0).getTelecom().size() < i1+1) { activitydefinition.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getEndorser().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Exprmtl ********************************************************************************/
		if(a.getActvtyDfnExprmtl() != null ) {

			if(a.getActvtyDfnExprmtl().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnExprmtl()==null) {} else {
			activitydefinition.setExperimental(Boolean.parseBoolean(a.getActvtyDfnExprmtl().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ActvtyDfn_Id_Assigner ********************************************************************************/
		if(a.getActvtyDfnIdAssigner() != null ) {

			String[] arrayi0 = a.getActvtyDfnIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getIdentifier().size() < i0+1) { activitydefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ActvtyDfn_Id_Prd_End ********************************************************************************/
		if(a.getActvtyDfnIdPrdEnd() != null ) {

			String[] arrayi0 = a.getActvtyDfnIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getIdentifier().size() < i0+1) { activitydefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ActvtyDfn_Id_Prd_Strt ********************************************************************************/
		if(a.getActvtyDfnIdPrdStrt() != null ) {

			String[] arrayi0 = a.getActvtyDfnIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getIdentifier().size() < i0+1) { activitydefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ActvtyDfn_Id_Sys ********************************************************************************/
		if(a.getActvtyDfnIdSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getIdentifier().size() < i0+1) { activitydefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(a.getActvtyDfnIdTypCdgCd() != null ) {

			String[] arrayi0 = a.getActvtyDfnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getIdentifier().size() < i0+1) { activitydefinition.addIdentifier(); }
				String[] arrayi1 = a.getActvtyDfnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { activitydefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(a.getActvtyDfnIdTypCdgDsply() != null ) {

			String[] arrayi0 = a.getActvtyDfnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getIdentifier().size() < i0+1) { activitydefinition.addIdentifier(); }
				String[] arrayi1 = a.getActvtyDfnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { activitydefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(a.getActvtyDfnIdTypCdgSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getIdentifier().size() < i0+1) { activitydefinition.addIdentifier(); }
				String[] arrayi1 = a.getActvtyDfnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { activitydefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(a.getActvtyDfnIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getActvtyDfnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getIdentifier().size() < i0+1) { activitydefinition.addIdentifier(); }
				String[] arrayi1 = a.getActvtyDfnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { activitydefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(a.getActvtyDfnIdTypCdgVrsn() != null ) {

			String[] arrayi0 = a.getActvtyDfnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getIdentifier().size() < i0+1) { activitydefinition.addIdentifier(); }
				String[] arrayi1 = a.getActvtyDfnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { activitydefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Id_Typ_Txt ********************************************************************************/
		if(a.getActvtyDfnIdTypTxt() != null ) {

			String[] arrayi0 = a.getActvtyDfnIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getIdentifier().size() < i0+1) { activitydefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Id_Use ********************************************************************************/
		if(a.getActvtyDfnIdUse() != null ) {

			String[] arrayi0 = a.getActvtyDfnIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getIdentifier().size() < i0+1) { activitydefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ActvtyDfn_Id_Vl ********************************************************************************/
		if(a.getActvtyDfnIdVl() != null ) {

			String[] arrayi0 = a.getActvtyDfnIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getIdentifier().size() < i0+1) { activitydefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		return ActivityDefinitions_Extended(a,activitydefinition );
	}
		public org.hl7.fhir.r4.model.ActivityDefinition ActivityDefinitions_Extended(ActivityDefinition a, org.hl7.fhir.r4.model.ActivityDefinition activitydefinition) throws ParseException
		{
		/******************** ActvtyDfn_Intent ********************************************************************************/
		if(a.getActvtyDfnIntent() != null ) {

			if(a.getActvtyDfnIntent().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnIntent()==null) {} else {
			activitydefinition.setIntent(new org.hl7.fhir.r4.model.ActivityDefinition.RequestIntentEnumFactory().fromCode(a.getActvtyDfnIntent().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ActvtyDfn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(a.getActvtyDfnJrsdctnCdgCd() != null ) {

			String[] arrayi0 = a.getActvtyDfnJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getJurisdiction().size() < i0+1) { activitydefinition.addJurisdiction(); }
				String[] arrayi1 = a.getActvtyDfnJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { activitydefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getJurisdiction().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(a.getActvtyDfnJrsdctnCdgDsply() != null ) {

			String[] arrayi0 = a.getActvtyDfnJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getJurisdiction().size() < i0+1) { activitydefinition.addJurisdiction(); }
				String[] arrayi1 = a.getActvtyDfnJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { activitydefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getJurisdiction().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(a.getActvtyDfnJrsdctnCdgSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getJurisdiction().size() < i0+1) { activitydefinition.addJurisdiction(); }
				String[] arrayi1 = a.getActvtyDfnJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { activitydefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getJurisdiction().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(a.getActvtyDfnJrsdctnCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getActvtyDfnJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getJurisdiction().size() < i0+1) { activitydefinition.addJurisdiction(); }
				String[] arrayi1 = a.getActvtyDfnJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { activitydefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getJurisdiction().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(a.getActvtyDfnJrsdctnCdgVrsn() != null ) {

			String[] arrayi0 = a.getActvtyDfnJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getJurisdiction().size() < i0+1) { activitydefinition.addJurisdiction(); }
				String[] arrayi1 = a.getActvtyDfnJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { activitydefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getJurisdiction().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Jrsdctn_Txt ********************************************************************************/
		if(a.getActvtyDfnJrsdctnTxt() != null ) {

			String[] arrayi0 = a.getActvtyDfnJrsdctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getJurisdiction().size() < i0+1) { activitydefinition.addJurisdiction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getJurisdiction().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Kind ********************************************************************************/
		if(a.getActvtyDfnKind() != null ) {

			if(a.getActvtyDfnKind().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnKind()==null) {} else {
			activitydefinition.setKind(new org.hl7.fhir.r4.model.ActivityDefinition.ActivityDefinitionKindEnumFactory().fromCode(a.getActvtyDfnKind().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ActvtyDfn_LastReviewDt ********************************************************************************/
		if(a.getActvtyDfnLastReviewDt() != null ) {

			if(a.getActvtyDfnLastReviewDt().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnLastReviewDt()==null) {} else {
			activitydefinition.setLastReviewDate(a.getActvtyDfnLastReviewDt().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnLastReviewDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(a.getActvtyDfnLastReviewDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ActvtyDfn_Library ********************************************************************************/
		if(a.getActvtyDfnLibrary() != null ) {

				for( String currListStrSplit : a.getActvtyDfnLibrary().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			activitydefinition.addLibrary(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** ActvtyDfn_Lctn ********************************************************************************/
		if(a.getActvtyDfnLctn() != null ) {

			if(a.getActvtyDfnLctn().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnLctn()==null) {} else {
			activitydefinition.setLocation(new org.hl7.fhir.r4.model.Reference(a.getActvtyDfnLctn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ActvtyDfn_Nm ********************************************************************************/
		if(a.getActvtyDfnNm() != null ) {

			if(a.getActvtyDfnNm().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnNm()==null) {} else {
			activitydefinition.setName(a.getActvtyDfnNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_ObsrvtnRqrment ********************************************************************************/
		if(a.getActvtyDfnObsrvtnRqrment() != null ) {

				for( String currListStrSplit : a.getActvtyDfnObsrvtnRqrment().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			activitydefinition.addObservationRequirement(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** ActvtyDfn_ObsrvtnRsltRqrment ********************************************************************************/
		if(a.getActvtyDfnObsrvtnRsltRqrment() != null ) {

				for( String currListStrSplit : a.getActvtyDfnObsrvtnRsltRqrment().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			activitydefinition.addObservationResultRequirement(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** ActvtyDfn_Prtcpnt_Role_Cdg_Cd ********************************************************************************/
		if(a.getActvtyDfnPrtcpntRoleCdgCd() != null ) {

			String[] arrayi0 = a.getActvtyDfnPrtcpntRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getParticipant().size() < i0+1) { activitydefinition.addParticipant(); }
				String[] arrayi1 = a.getActvtyDfnPrtcpntRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getParticipant().get(i0).getRole().getCoding().size() < i1+1) { activitydefinition.getParticipant().get(i0).getRole().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getParticipant().get(i0).getRole().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Prtcpnt_Role_Cdg_Dsply ********************************************************************************/
		if(a.getActvtyDfnPrtcpntRoleCdgDsply() != null ) {

			String[] arrayi0 = a.getActvtyDfnPrtcpntRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getParticipant().size() < i0+1) { activitydefinition.addParticipant(); }
				String[] arrayi1 = a.getActvtyDfnPrtcpntRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getParticipant().get(i0).getRole().getCoding().size() < i1+1) { activitydefinition.getParticipant().get(i0).getRole().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getParticipant().get(i0).getRole().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Prtcpnt_Role_Cdg_Sys ********************************************************************************/
		if(a.getActvtyDfnPrtcpntRoleCdgSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnPrtcpntRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getParticipant().size() < i0+1) { activitydefinition.addParticipant(); }
				String[] arrayi1 = a.getActvtyDfnPrtcpntRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getParticipant().get(i0).getRole().getCoding().size() < i1+1) { activitydefinition.getParticipant().get(i0).getRole().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getParticipant().get(i0).getRole().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Prtcpnt_Role_Cdg_UsrSltd ********************************************************************************/
		if(a.getActvtyDfnPrtcpntRoleCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getActvtyDfnPrtcpntRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getParticipant().size() < i0+1) { activitydefinition.addParticipant(); }
				String[] arrayi1 = a.getActvtyDfnPrtcpntRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getParticipant().get(i0).getRole().getCoding().size() < i1+1) { activitydefinition.getParticipant().get(i0).getRole().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getParticipant().get(i0).getRole().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Prtcpnt_Role_Cdg_Vrsn ********************************************************************************/
		if(a.getActvtyDfnPrtcpntRoleCdgVrsn() != null ) {

			String[] arrayi0 = a.getActvtyDfnPrtcpntRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getParticipant().size() < i0+1) { activitydefinition.addParticipant(); }
				String[] arrayi1 = a.getActvtyDfnPrtcpntRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getParticipant().get(i0).getRole().getCoding().size() < i1+1) { activitydefinition.getParticipant().get(i0).getRole().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getParticipant().get(i0).getRole().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Prtcpnt_Role_Txt ********************************************************************************/
		if(a.getActvtyDfnPrtcpntRoleTxt() != null ) {

			String[] arrayi0 = a.getActvtyDfnPrtcpntRoleTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getParticipant().size() < i0+1) { activitydefinition.addParticipant(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getParticipant().get(i0).getRole().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Prtcpnt_Typ ********************************************************************************/
		if(a.getActvtyDfnPrtcpntTyp() != null ) {

			String[] arrayi0 = a.getActvtyDfnPrtcpntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getParticipant().size() < i0+1) { activitydefinition.addParticipant(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getParticipant().get(i0).setType(new org.hl7.fhir.r4.model.ActivityDefinition.ActivityParticipantTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ActvtyDfn_Priority ********************************************************************************/
		if(a.getActvtyDfnPriority() != null ) {

			if(a.getActvtyDfnPriority().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnPriority()==null) {} else {
			activitydefinition.setPriority(new org.hl7.fhir.r4.model.ActivityDefinition.RequestPriorityEnumFactory().fromCode(a.getActvtyDfnPriority().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ActvtyDfn_PrdctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(a.getActvtyDfnPrdctCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = a.getActvtyDfnPrdctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getProductCodeableConcept().getCoding().size() < i0+1) { activitydefinition.getProductCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getProductCodeableConcept().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_PrdctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(a.getActvtyDfnPrdctCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = a.getActvtyDfnPrdctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getProductCodeableConcept().getCoding().size() < i0+1) { activitydefinition.getProductCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getProductCodeableConcept().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_PrdctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(a.getActvtyDfnPrdctCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnPrdctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getProductCodeableConcept().getCoding().size() < i0+1) { activitydefinition.getProductCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getProductCodeableConcept().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_PrdctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(a.getActvtyDfnPrdctCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getActvtyDfnPrdctCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getProductCodeableConcept().getCoding().size() < i0+1) { activitydefinition.getProductCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getProductCodeableConcept().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ActvtyDfn_PrdctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(a.getActvtyDfnPrdctCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = a.getActvtyDfnPrdctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getProductCodeableConcept().getCoding().size() < i0+1) { activitydefinition.getProductCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getProductCodeableConcept().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_PrdctCdbleCncpt_Txt ********************************************************************************/
		if(a.getActvtyDfnPrdctCdbleCncptTxt() != null ) {

			if(a.getActvtyDfnPrdctCdbleCncptTxt().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnPrdctCdbleCncptTxt()==null) {} else {
			activitydefinition.getProductCodeableConcept().setText(a.getActvtyDfnPrdctCdbleCncptTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_PrdctRfrnc ********************************************************************************/
		if(a.getActvtyDfnPrdctRfrnc() != null ) {

			if(a.getActvtyDfnPrdctRfrnc().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnPrdctRfrnc()==null) {} else {
			activitydefinition.setProduct(new org.hl7.fhir.r4.model.Reference(a.getActvtyDfnPrdctRfrnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ActvtyDfn_Profile ********************************************************************************/
		if(a.getActvtyDfnProfile() != null ) {

			if(a.getActvtyDfnProfile().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnProfile()==null) {} else {
			activitydefinition.setProfile(a.getActvtyDfnProfile().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_Pblshr ********************************************************************************/
		if(a.getActvtyDfnPblshr() != null ) {

			if(a.getActvtyDfnPblshr().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnPblshr()==null) {} else {
			activitydefinition.setPublisher(a.getActvtyDfnPblshr().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_Prpse ********************************************************************************/
		if(a.getActvtyDfnPrpse() != null ) {

			if(a.getActvtyDfnPrpse().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnPrpse()==null) {} else {
			activitydefinition.setPurpose(a.getActvtyDfnPrpse().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_Qnty_Cd ********************************************************************************/
		if(a.getActvtyDfnQntyCd() != null ) {

			if(a.getActvtyDfnQntyCd().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnQntyCd()==null) {} else {
			activitydefinition.getQuantity().setCode(a.getActvtyDfnQntyCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_Qnty_Cmprtr ********************************************************************************/
		if(a.getActvtyDfnQntyCmprtr() != null ) {

			if(a.getActvtyDfnQntyCmprtr().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnQntyCmprtr()==null) {} else {
			activitydefinition.getQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(a.getActvtyDfnQntyCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ActvtyDfn_Qnty_Sys ********************************************************************************/
		if(a.getActvtyDfnQntySys() != null ) {

			if(a.getActvtyDfnQntySys().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnQntySys()==null) {} else {
			activitydefinition.getQuantity().setSystem(a.getActvtyDfnQntySys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_Qnty_Unt ********************************************************************************/
		if(a.getActvtyDfnQntyUnt() != null ) {

			if(a.getActvtyDfnQntyUnt().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnQntyUnt()==null) {} else {
			activitydefinition.getQuantity().setUnit(a.getActvtyDfnQntyUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_Qnty_Vl ********************************************************************************/
		if(a.getActvtyDfnQntyVl() != null ) {

			if(a.getActvtyDfnQntyVl().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnQntyVl()==null) {} else {
			activitydefinition.getQuantity().setValue((new java.math.BigDecimal((a.getActvtyDfnQntyVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** ActvtyDfn_RltedArtfct_Citation ********************************************************************************/
		if(a.getActvtyDfnRltedArtfctCitation() != null ) {

			String[] arrayi0 = a.getActvtyDfnRltedArtfctCitation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getRelatedArtifact().size() < i0+1) { activitydefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getRelatedArtifact().get(i0).setCitation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_RltedArtfct_Dsply ********************************************************************************/
		if(a.getActvtyDfnRltedArtfctDsply() != null ) {

			String[] arrayi0 = a.getActvtyDfnRltedArtfctDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getRelatedArtifact().size() < i0+1) { activitydefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getRelatedArtifact().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(a.getActvtyDfnRltedArtfctDocCntntTyp() != null ) {

			String[] arrayi0 = a.getActvtyDfnRltedArtfctDocCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getRelatedArtifact().size() < i0+1) { activitydefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getRelatedArtifact().get(i0).getDocument().setContentType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_RltedArtfct_Doc_Creation ********************************************************************************/
		if(a.getActvtyDfnRltedArtfctDocCreation() != null ) {

			String[] arrayi0 = a.getActvtyDfnRltedArtfctDocCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getRelatedArtifact().size() < i0+1) { activitydefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getRelatedArtifact().get(i0).getDocument().setCreation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ActvtyDfn_RltedArtfct_Doc_Data ********************************************************************************/
		if(a.getActvtyDfnRltedArtfctDocData() != null ) {

			String[] arrayi0 = a.getActvtyDfnRltedArtfctDocData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getRelatedArtifact().size() < i0+1) { activitydefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getRelatedArtifact().get(i0).getDocument().setData(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** ActvtyDfn_RltedArtfct_Doc_Hash ********************************************************************************/
		if(a.getActvtyDfnRltedArtfctDocHash() != null ) {

			String[] arrayi0 = a.getActvtyDfnRltedArtfctDocHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getRelatedArtifact().size() < i0+1) { activitydefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getRelatedArtifact().get(i0).getDocument().setHash(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** ActvtyDfn_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(a.getActvtyDfnRltedArtfctDocLnguage() != null ) {

			String[] arrayi0 = a.getActvtyDfnRltedArtfctDocLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getRelatedArtifact().size() < i0+1) { activitydefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getRelatedArtifact().get(i0).getDocument().setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_RltedArtfct_Doc_Sz ********************************************************************************/
		if(a.getActvtyDfnRltedArtfctDocSz() != null ) {

			String[] arrayi0 = a.getActvtyDfnRltedArtfctDocSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getRelatedArtifact().size() < i0+1) { activitydefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getRelatedArtifact().get(i0).getDocument().setSize(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ActvtyDfn_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(a.getActvtyDfnRltedArtfctDocTtl() != null ) {

			String[] arrayi0 = a.getActvtyDfnRltedArtfctDocTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getRelatedArtifact().size() < i0+1) { activitydefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getRelatedArtifact().get(i0).getDocument().setTitle(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_RltedArtfct_Doc_Url ********************************************************************************/
		if(a.getActvtyDfnRltedArtfctDocUrl() != null ) {

			String[] arrayi0 = a.getActvtyDfnRltedArtfctDocUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getRelatedArtifact().size() < i0+1) { activitydefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getRelatedArtifact().get(i0).getDocument().setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_RltedArtfct_Lbl ********************************************************************************/
		if(a.getActvtyDfnRltedArtfctLbl() != null ) {

			String[] arrayi0 = a.getActvtyDfnRltedArtfctLbl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getRelatedArtifact().size() < i0+1) { activitydefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getRelatedArtifact().get(i0).setLabel(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_RltedArtfct_Rsrc ********************************************************************************/
		if(a.getActvtyDfnRltedArtfctRsrc() != null ) {

			String[] arrayi0 = a.getActvtyDfnRltedArtfctRsrc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getRelatedArtifact().size() < i0+1) { activitydefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getRelatedArtifact().get(i0).setResource(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_RltedArtfct_Typ ********************************************************************************/
		if(a.getActvtyDfnRltedArtfctTyp() != null ) {

			String[] arrayi0 = a.getActvtyDfnRltedArtfctTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getRelatedArtifact().size() < i0+1) { activitydefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getRelatedArtifact().get(i0).setType(new org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ActvtyDfn_RltedArtfct_Url ********************************************************************************/
		if(a.getActvtyDfnRltedArtfctUrl() != null ) {

			String[] arrayi0 = a.getActvtyDfnRltedArtfctUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getRelatedArtifact().size() < i0+1) { activitydefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getRelatedArtifact().get(i0).setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Rviewr_Nm ********************************************************************************/
		if(a.getActvtyDfnRviewrNm() != null ) {

			String[] arrayi0 = a.getActvtyDfnRviewrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getReviewer().size() < i0+1) { activitydefinition.addReviewer(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getReviewer().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(a.getActvtyDfnRviewrTlcmPrdEnd() != null ) {

			String[] arrayi0 = a.getActvtyDfnRviewrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getReviewer().size() < i0+1) { activitydefinition.addReviewer(); }
				String[] arrayi1 = a.getActvtyDfnRviewrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getReviewer().get(i0).getTelecom().size() < i1+1) { activitydefinition.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getReviewer().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(a.getActvtyDfnRviewrTlcmPrdStrt() != null ) {

			String[] arrayi0 = a.getActvtyDfnRviewrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getReviewer().size() < i0+1) { activitydefinition.addReviewer(); }
				String[] arrayi1 = a.getActvtyDfnRviewrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getReviewer().get(i0).getTelecom().size() < i1+1) { activitydefinition.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getReviewer().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(a.getActvtyDfnRviewrTlcmRnk() != null ) {

			String[] arrayi0 = a.getActvtyDfnRviewrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getReviewer().size() < i0+1) { activitydefinition.addReviewer(); }
				String[] arrayi1 = a.getActvtyDfnRviewrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getReviewer().get(i0).getTelecom().size() < i1+1) { activitydefinition.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getReviewer().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Rviewr_Tlcm_Sys ********************************************************************************/
		if(a.getActvtyDfnRviewrTlcmSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnRviewrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getReviewer().size() < i0+1) { activitydefinition.addReviewer(); }
				String[] arrayi1 = a.getActvtyDfnRviewrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getReviewer().get(i0).getTelecom().size() < i1+1) { activitydefinition.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getReviewer().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Rviewr_Tlcm_Use ********************************************************************************/
		if(a.getActvtyDfnRviewrTlcmUse() != null ) {

			String[] arrayi0 = a.getActvtyDfnRviewrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getReviewer().size() < i0+1) { activitydefinition.addReviewer(); }
				String[] arrayi1 = a.getActvtyDfnRviewrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getReviewer().get(i0).getTelecom().size() < i1+1) { activitydefinition.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getReviewer().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Rviewr_Tlcm_Vl ********************************************************************************/
		if(a.getActvtyDfnRviewrTlcmVl() != null ) {

			String[] arrayi0 = a.getActvtyDfnRviewrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getReviewer().size() < i0+1) { activitydefinition.addReviewer(); }
				String[] arrayi1 = a.getActvtyDfnRviewrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getReviewer().get(i0).getTelecom().size() < i1+1) { activitydefinition.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getReviewer().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_SpcmnRqrment ********************************************************************************/
		if(a.getActvtyDfnSpcmnRqrment() != null ) {

				for( String currListStrSplit : a.getActvtyDfnSpcmnRqrment().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			activitydefinition.addSpecimenRequirement(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** ActvtyDfn_Sts ********************************************************************************/
		if(a.getActvtyDfnSts() != null ) {

			if(a.getActvtyDfnSts().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnSts()==null) {} else {
			activitydefinition.setStatus(new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory().fromCode(a.getActvtyDfnSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ActvtyDfn_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(a.getActvtyDfnSbjctCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = a.getActvtyDfnSbjctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getSubjectCodeableConcept().getCoding().size() < i0+1) { activitydefinition.getSubjectCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getSubjectCodeableConcept().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(a.getActvtyDfnSbjctCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = a.getActvtyDfnSbjctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getSubjectCodeableConcept().getCoding().size() < i0+1) { activitydefinition.getSubjectCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getSubjectCodeableConcept().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(a.getActvtyDfnSbjctCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnSbjctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getSubjectCodeableConcept().getCoding().size() < i0+1) { activitydefinition.getSubjectCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getSubjectCodeableConcept().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(a.getActvtyDfnSbjctCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getActvtyDfnSbjctCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getSubjectCodeableConcept().getCoding().size() < i0+1) { activitydefinition.getSubjectCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getSubjectCodeableConcept().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ActvtyDfn_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(a.getActvtyDfnSbjctCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = a.getActvtyDfnSbjctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getSubjectCodeableConcept().getCoding().size() < i0+1) { activitydefinition.getSubjectCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getSubjectCodeableConcept().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(a.getActvtyDfnSbjctCdbleCncptTxt() != null ) {

			if(a.getActvtyDfnSbjctCdbleCncptTxt().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnSbjctCdbleCncptTxt()==null) {} else {
			activitydefinition.getSubjectCodeableConcept().setText(a.getActvtyDfnSbjctCdbleCncptTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_SbjctRfrnc ********************************************************************************/
		if(a.getActvtyDfnSbjctRfrnc() != null ) {

			if(a.getActvtyDfnSbjctRfrnc().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnSbjctRfrnc()==null) {} else {
			activitydefinition.setSubject(new org.hl7.fhir.r4.model.Reference(a.getActvtyDfnSbjctRfrnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ActvtyDfn_Subtitle ********************************************************************************/
		if(a.getActvtyDfnSubtitle() != null ) {

			if(a.getActvtyDfnSubtitle().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnSubtitle()==null) {} else {
			activitydefinition.setSubtitle(a.getActvtyDfnSubtitle().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_TmgAge_Cd ********************************************************************************/
		if(a.getActvtyDfnTmgAgeCd() != null ) {

			if(a.getActvtyDfnTmgAgeCd().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgAgeCd()==null) {} else {
			activitydefinition.getTimingAge().setCode(a.getActvtyDfnTmgAgeCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_TmgAge_Cmprtr ********************************************************************************/
		if(a.getActvtyDfnTmgAgeCmprtr() != null ) {

			if(a.getActvtyDfnTmgAgeCmprtr().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgAgeCmprtr()==null) {} else {
			activitydefinition.getTimingAge().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(a.getActvtyDfnTmgAgeCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ActvtyDfn_TmgAge_Sys ********************************************************************************/
		if(a.getActvtyDfnTmgAgeSys() != null ) {

			if(a.getActvtyDfnTmgAgeSys().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgAgeSys()==null) {} else {
			activitydefinition.getTimingAge().setSystem(a.getActvtyDfnTmgAgeSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_TmgAge_Unt ********************************************************************************/
		if(a.getActvtyDfnTmgAgeUnt() != null ) {

			if(a.getActvtyDfnTmgAgeUnt().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgAgeUnt()==null) {} else {
			activitydefinition.getTimingAge().setUnit(a.getActvtyDfnTmgAgeUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_TmgAge_Vl ********************************************************************************/
		if(a.getActvtyDfnTmgAgeVl() != null ) {

			if(a.getActvtyDfnTmgAgeVl().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgAgeVl()==null) {} else {
			activitydefinition.getTimingAge().setValue((new java.math.BigDecimal((a.getActvtyDfnTmgAgeVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** ActvtyDfn_TmgDtTimeTyp ********************************************************************************/
		if(a.getActvtyDfnTmgDtTimeTyp() != null ) {

			if(a.getActvtyDfnTmgDtTimeTyp().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgDtTimeTyp()==null) {} else {
			activitydefinition.setTiming(new org.hl7.fhir.r4.model.DateTimeType(a.getActvtyDfnTmgDtTimeTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ActvtyDfn_TmgDuration_Cd ********************************************************************************/
		if(a.getActvtyDfnTmgDurationCd() != null ) {

			if(a.getActvtyDfnTmgDurationCd().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgDurationCd()==null) {} else {
			activitydefinition.getTimingDuration().setCode(a.getActvtyDfnTmgDurationCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		
		/******************** ActvtyDfn_TmgDuration_Cmprtr ********************************************************************************/
		if(a.getActvtyDfnTmgDurationCmprtr() != null ) {

			if(a.getActvtyDfnTmgDurationCmprtr().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgDurationCmprtr()==null) {} else {
			activitydefinition.getTimingDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(a.getActvtyDfnTmgDurationCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ActvtyDfn_TmgDuration_Sys ********************************************************************************/
		if(a.getActvtyDfnTmgDurationSys() != null ) {

			if(a.getActvtyDfnTmgDurationSys().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgDurationSys()==null) {} else {
			activitydefinition.getTimingDuration().setSystem(a.getActvtyDfnTmgDurationSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_TmgDuration_Unt ********************************************************************************/
		if(a.getActvtyDfnTmgDurationUnt() != null ) {

			if(a.getActvtyDfnTmgDurationUnt().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgDurationUnt()==null) {} else {
			activitydefinition.getTimingDuration().setUnit(a.getActvtyDfnTmgDurationUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_TmgDuration_Vl ********************************************************************************/
		if(a.getActvtyDfnTmgDurationVl() != null ) {

			if(a.getActvtyDfnTmgDurationVl().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgDurationVl()==null) {} else {
			activitydefinition.getTimingDuration().setValue((new java.math.BigDecimal((a.getActvtyDfnTmgDurationVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** ActvtyDfn_TmgPrd_End ********************************************************************************/
		if(a.getActvtyDfnTmgPrdEnd() != null ) {

			if(a.getActvtyDfnTmgPrdEnd().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgPrdEnd()==null) {} else {
			activitydefinition.getTimingPeriod().setEnd(a.getActvtyDfnTmgPrdEnd().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(a.getActvtyDfnTmgPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ActvtyDfn_TmgPrd_Strt ********************************************************************************/
		if(a.getActvtyDfnTmgPrdStrt() != null ) {

			if(a.getActvtyDfnTmgPrdStrt().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgPrdStrt()==null) {} else {
			activitydefinition.getTimingPeriod().setStart(a.getActvtyDfnTmgPrdStrt().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(a.getActvtyDfnTmgPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ActvtyDfn_TmgRng_Hi_Cd ********************************************************************************/
		if(a.getActvtyDfnTmgRngHiCd() != null ) {

			if(a.getActvtyDfnTmgRngHiCd().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgRngHiCd()==null) {} else {
			activitydefinition.getTimingRange().getHigh().setCode(a.getActvtyDfnTmgRngHiCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_TmgRng_Hi_Cmprtr ********************************************************************************/
		if(a.getActvtyDfnTmgRngHiCmprtr() != null ) {

			if(a.getActvtyDfnTmgRngHiCmprtr().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgRngHiCmprtr()==null) {} else {
			activitydefinition.getTimingRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(a.getActvtyDfnTmgRngHiCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ActvtyDfn_TmgRng_Hi_Sys ********************************************************************************/
		if(a.getActvtyDfnTmgRngHiSys() != null ) {

			if(a.getActvtyDfnTmgRngHiSys().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgRngHiSys()==null) {} else {
			activitydefinition.getTimingRange().getHigh().setSystem(a.getActvtyDfnTmgRngHiSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_TmgRng_Hi_Unt ********************************************************************************/
		if(a.getActvtyDfnTmgRngHiUnt() != null ) {

			if(a.getActvtyDfnTmgRngHiUnt().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgRngHiUnt()==null) {} else {
			activitydefinition.getTimingRange().getHigh().setUnit(a.getActvtyDfnTmgRngHiUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_TmgRng_Hi_Vl ********************************************************************************/
		if(a.getActvtyDfnTmgRngHiVl() != null ) {

			if(a.getActvtyDfnTmgRngHiVl().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgRngHiVl()==null) {} else {
			activitydefinition.getTimingRange().getHigh().setValue((new java.math.BigDecimal((a.getActvtyDfnTmgRngHiVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** ActvtyDfn_TmgRng_Lw_Cd ********************************************************************************/
		if(a.getActvtyDfnTmgRngLwCd() != null ) {

			if(a.getActvtyDfnTmgRngLwCd().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgRngLwCd()==null) {} else {
			activitydefinition.getTimingRange().getLow().setCode(a.getActvtyDfnTmgRngLwCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_TmgRng_Lw_Cmprtr ********************************************************************************/
		if(a.getActvtyDfnTmgRngLwCmprtr() != null ) {

			if(a.getActvtyDfnTmgRngLwCmprtr().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgRngLwCmprtr()==null) {} else {
			activitydefinition.getTimingRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(a.getActvtyDfnTmgRngLwCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ActvtyDfn_TmgRng_Lw_Sys ********************************************************************************/
		if(a.getActvtyDfnTmgRngLwSys() != null ) {

			if(a.getActvtyDfnTmgRngLwSys().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgRngLwSys()==null) {} else {
			activitydefinition.getTimingRange().getLow().setSystem(a.getActvtyDfnTmgRngLwSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_TmgRng_Lw_Unt ********************************************************************************/
		if(a.getActvtyDfnTmgRngLwUnt() != null ) {

			if(a.getActvtyDfnTmgRngLwUnt().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgRngLwUnt()==null) {} else {
			activitydefinition.getTimingRange().getLow().setUnit(a.getActvtyDfnTmgRngLwUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_TmgRng_Lw_Vl ********************************************************************************/
		if(a.getActvtyDfnTmgRngLwVl() != null ) {

			if(a.getActvtyDfnTmgRngLwVl().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgRngLwVl()==null) {} else {
			activitydefinition.getTimingRange().getLow().setValue((new java.math.BigDecimal((a.getActvtyDfnTmgRngLwVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** ActvtyDfn_TmgTmg_Cd_Cdg_Cd ********************************************************************************/
		if(a.getActvtyDfnTmgTmgCdCdgCd() != null ) {

			String[] arrayi0 = a.getActvtyDfnTmgTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getTimingTiming().getCode().getCoding().size() < i0+1) { activitydefinition.getTimingTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getTimingTiming().getCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_TmgTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(a.getActvtyDfnTmgTmgCdCdgDsply() != null ) {

			String[] arrayi0 = a.getActvtyDfnTmgTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getTimingTiming().getCode().getCoding().size() < i0+1) { activitydefinition.getTimingTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getTimingTiming().getCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_TmgTmg_Cd_Cdg_Sys ********************************************************************************/
		if(a.getActvtyDfnTmgTmgCdCdgSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnTmgTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getTimingTiming().getCode().getCoding().size() < i0+1) { activitydefinition.getTimingTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getTimingTiming().getCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_TmgTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(a.getActvtyDfnTmgTmgCdCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getActvtyDfnTmgTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getTimingTiming().getCode().getCoding().size() < i0+1) { activitydefinition.getTimingTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getTimingTiming().getCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ActvtyDfn_TmgTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(a.getActvtyDfnTmgTmgCdCdgVrsn() != null ) {

			String[] arrayi0 = a.getActvtyDfnTmgTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getTimingTiming().getCode().getCoding().size() < i0+1) { activitydefinition.getTimingTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getTimingTiming().getCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_TmgTmg_Cd_Txt ********************************************************************************/
		if(a.getActvtyDfnTmgTmgCdTxt() != null ) {

			if(a.getActvtyDfnTmgTmgCdTxt().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgTmgCdTxt()==null) {} else {
			activitydefinition.getTimingTiming().getCode().setText(a.getActvtyDfnTmgTmgCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_TmgTmg_Evnt ********************************************************************************/
		if(a.getActvtyDfnTmgTmgEvnt() != null ) {

				for( String currListStrSplit : a.getActvtyDfnTmgTmgEvnt().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			activitydefinition.getTimingTiming().addEvent(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** ActvtyDfn_TmgTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptBndsDurationCd() != null ) {

			if(a.getActvtyDfnTmgTmgRptBndsDurationCd().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgTmgRptBndsDurationCd()==null) {} else {
			activitydefinition.getTimingTiming().getRepeat().getBoundsDuration().setCode(a.getActvtyDfnTmgTmgRptBndsDurationCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_BndsDuration_Cmprtr ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptBndsDurationCmprtr() != null ) {

			if(a.getActvtyDfnTmgTmgRptBndsDurationCmprtr().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgTmgRptBndsDurationCmprtr()==null) {} else {
			activitydefinition.getTimingTiming().getRepeat().getBoundsDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(a.getActvtyDfnTmgTmgRptBndsDurationCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptBndsDurationSys() != null ) {

			if(a.getActvtyDfnTmgTmgRptBndsDurationSys().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgTmgRptBndsDurationSys()==null) {} else {
			activitydefinition.getTimingTiming().getRepeat().getBoundsDuration().setSystem(a.getActvtyDfnTmgTmgRptBndsDurationSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptBndsDurationUnt() != null ) {

			if(a.getActvtyDfnTmgTmgRptBndsDurationUnt().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgTmgRptBndsDurationUnt()==null) {} else {
			activitydefinition.getTimingTiming().getRepeat().getBoundsDuration().setUnit(a.getActvtyDfnTmgTmgRptBndsDurationUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptBndsDurationVl() != null ) {

			if(a.getActvtyDfnTmgTmgRptBndsDurationVl().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgTmgRptBndsDurationVl()==null) {} else {
			activitydefinition.getTimingTiming().getRepeat().getBoundsDuration().setValue((new java.math.BigDecimal((a.getActvtyDfnTmgTmgRptBndsDurationVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptBndsPrdEnd() != null ) {

			if(a.getActvtyDfnTmgTmgRptBndsPrdEnd().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgTmgRptBndsPrdEnd()==null) {} else {
			activitydefinition.getTimingTiming().getRepeat().getBoundsPeriod().setEnd(a.getActvtyDfnTmgTmgRptBndsPrdEnd().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgTmgRptBndsPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(a.getActvtyDfnTmgTmgRptBndsPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptBndsPrdStrt() != null ) {

			if(a.getActvtyDfnTmgTmgRptBndsPrdStrt().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgTmgRptBndsPrdStrt()==null) {} else {
			activitydefinition.getTimingTiming().getRepeat().getBoundsPeriod().setStart(a.getActvtyDfnTmgTmgRptBndsPrdStrt().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgTmgRptBndsPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(a.getActvtyDfnTmgTmgRptBndsPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptBndsRngHiCd() != null ) {

			if(a.getActvtyDfnTmgTmgRptBndsRngHiCd().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgTmgRptBndsRngHiCd()==null) {} else {
			activitydefinition.getTimingTiming().getRepeat().getBoundsRange().getHigh().setCode(a.getActvtyDfnTmgTmgRptBndsRngHiCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_BndsRng_Hi_Cmprtr ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptBndsRngHiCmprtr() != null ) {

			if(a.getActvtyDfnTmgTmgRptBndsRngHiCmprtr().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgTmgRptBndsRngHiCmprtr()==null) {} else {
			activitydefinition.getTimingTiming().getRepeat().getBoundsRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(a.getActvtyDfnTmgTmgRptBndsRngHiCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptBndsRngHiSys() != null ) {

			if(a.getActvtyDfnTmgTmgRptBndsRngHiSys().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgTmgRptBndsRngHiSys()==null) {} else {
			activitydefinition.getTimingTiming().getRepeat().getBoundsRange().getHigh().setSystem(a.getActvtyDfnTmgTmgRptBndsRngHiSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptBndsRngHiUnt() != null ) {

			if(a.getActvtyDfnTmgTmgRptBndsRngHiUnt().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgTmgRptBndsRngHiUnt()==null) {} else {
			activitydefinition.getTimingTiming().getRepeat().getBoundsRange().getHigh().setUnit(a.getActvtyDfnTmgTmgRptBndsRngHiUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptBndsRngHiVl() != null ) {

			if(a.getActvtyDfnTmgTmgRptBndsRngHiVl().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgTmgRptBndsRngHiVl()==null) {} else {
			activitydefinition.getTimingTiming().getRepeat().getBoundsRange().getHigh().setValue((new java.math.BigDecimal((a.getActvtyDfnTmgTmgRptBndsRngHiVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptBndsRngLwCd() != null ) {

			if(a.getActvtyDfnTmgTmgRptBndsRngLwCd().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgTmgRptBndsRngLwCd()==null) {} else {
			activitydefinition.getTimingTiming().getRepeat().getBoundsRange().getLow().setCode(a.getActvtyDfnTmgTmgRptBndsRngLwCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_BndsRng_Lw_Cmprtr ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptBndsRngLwCmprtr() != null ) {

			if(a.getActvtyDfnTmgTmgRptBndsRngLwCmprtr().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgTmgRptBndsRngLwCmprtr()==null) {} else {
			activitydefinition.getTimingTiming().getRepeat().getBoundsRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(a.getActvtyDfnTmgTmgRptBndsRngLwCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptBndsRngLwSys() != null ) {

			if(a.getActvtyDfnTmgTmgRptBndsRngLwSys().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgTmgRptBndsRngLwSys()==null) {} else {
			activitydefinition.getTimingTiming().getRepeat().getBoundsRange().getLow().setSystem(a.getActvtyDfnTmgTmgRptBndsRngLwSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptBndsRngLwUnt() != null ) {

			if(a.getActvtyDfnTmgTmgRptBndsRngLwUnt().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgTmgRptBndsRngLwUnt()==null) {} else {
			activitydefinition.getTimingTiming().getRepeat().getBoundsRange().getLow().setUnit(a.getActvtyDfnTmgTmgRptBndsRngLwUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptBndsRngLwVl() != null ) {

			if(a.getActvtyDfnTmgTmgRptBndsRngLwVl().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgTmgRptBndsRngLwVl()==null) {} else {
			activitydefinition.getTimingTiming().getRepeat().getBoundsRange().getLow().setValue((new java.math.BigDecimal((a.getActvtyDfnTmgTmgRptBndsRngLwVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_Cnt ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptCnt() != null ) {

			if(a.getActvtyDfnTmgTmgRptCnt().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgTmgRptCnt()==null) {} else {
			activitydefinition.getTimingTiming().getRepeat().setCount(Integer.parseInt(a.getActvtyDfnTmgTmgRptCnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_CntMx ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptCntMx() != null ) {

			if(a.getActvtyDfnTmgTmgRptCntMx().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgTmgRptCntMx()==null) {} else {
			activitydefinition.getTimingTiming().getRepeat().setCountMax(Integer.parseInt(a.getActvtyDfnTmgTmgRptCntMx().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_Duration ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptDuration() != null ) {

			if(a.getActvtyDfnTmgTmgRptDuration().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgTmgRptDuration()==null) {} else {
			activitydefinition.getTimingTiming().getRepeat().setDuration((Double.parseDouble((a.getActvtyDfnTmgTmgRptDuration().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_DurationMx ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptDurationMx() != null ) {

			if(a.getActvtyDfnTmgTmgRptDurationMx().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgTmgRptDurationMx()==null) {} else {
			activitydefinition.getTimingTiming().getRepeat().setDurationMax((Double.parseDouble((a.getActvtyDfnTmgTmgRptDurationMx().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_DurationUnt ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptDurationUnt() != null ) {

			if(a.getActvtyDfnTmgTmgRptDurationUnt().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgTmgRptDurationUnt()==null) {} else {
			activitydefinition.getTimingTiming().getRepeat().setDurationUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(a.getActvtyDfnTmgTmgRptDurationUnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_Frqncy ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptFrqncy() != null ) {

			if(a.getActvtyDfnTmgTmgRptFrqncy().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgTmgRptFrqncy()==null) {} else {
			activitydefinition.getTimingTiming().getRepeat().setFrequency(Integer.parseInt(a.getActvtyDfnTmgTmgRptFrqncy().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_FrqncyMx ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptFrqncyMx() != null ) {

			if(a.getActvtyDfnTmgTmgRptFrqncyMx().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgTmgRptFrqncyMx()==null) {} else {
			activitydefinition.getTimingTiming().getRepeat().setFrequencyMax(Integer.parseInt(a.getActvtyDfnTmgTmgRptFrqncyMx().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_Off ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptOff() != null ) {

			if(a.getActvtyDfnTmgTmgRptOff().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgTmgRptOff()==null) {} else {
			activitydefinition.getTimingTiming().getRepeat().setOffset(Integer.parseInt(a.getActvtyDfnTmgTmgRptOff().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_Prd ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptPrd() != null ) {

			if(a.getActvtyDfnTmgTmgRptPrd().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgTmgRptPrd()==null) {} else {
			activitydefinition.getTimingTiming().getRepeat().setPeriod((new java.math.BigDecimal((a.getActvtyDfnTmgTmgRptPrd().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_PrdMx ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptPrdMx() != null ) {

			if(a.getActvtyDfnTmgTmgRptPrdMx().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgTmgRptPrdMx()==null) {} else {
			activitydefinition.getTimingTiming().getRepeat().setPeriodMax((new java.math.BigDecimal((a.getActvtyDfnTmgTmgRptPrdMx().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_PrdUnt ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptPrdUnt() != null ) {

			if(a.getActvtyDfnTmgTmgRptPrdUnt().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTmgTmgRptPrdUnt()==null) {} else {
			activitydefinition.getTimingTiming().getRepeat().setPeriodUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(a.getActvtyDfnTmgTmgRptPrdUnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ActvtyDfn_TmgTmg_Rpt_TimeOfDay ********************************************************************************/
		if(a.getActvtyDfnTmgTmgRptTimeOfDay() != null ) {

				for( String currListStrSplit : a.getActvtyDfnTmgTmgRptTimeOfDay().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			activitydefinition.getTimingTiming().getRepeat().addTimeOfDay(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** ActvtyDfn_Ttl ********************************************************************************/
		if(a.getActvtyDfnTtl() != null ) {

			if(a.getActvtyDfnTtl().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTtl()==null) {} else {
			activitydefinition.setTitle(a.getActvtyDfnTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_Topic_Cdg_Cd ********************************************************************************/
		if(a.getActvtyDfnTopicCdgCd() != null ) {

			String[] arrayi0 = a.getActvtyDfnTopicCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getTopic().size() < i0+1) { activitydefinition.addTopic(); }
				String[] arrayi1 = a.getActvtyDfnTopicCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getTopic().get(i0).getCoding().size() < i1+1) { activitydefinition.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getTopic().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Topic_Cdg_Dsply ********************************************************************************/
		if(a.getActvtyDfnTopicCdgDsply() != null ) {

			String[] arrayi0 = a.getActvtyDfnTopicCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getTopic().size() < i0+1) { activitydefinition.addTopic(); }
				String[] arrayi1 = a.getActvtyDfnTopicCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getTopic().get(i0).getCoding().size() < i1+1) { activitydefinition.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getTopic().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Topic_Cdg_Sys ********************************************************************************/
		if(a.getActvtyDfnTopicCdgSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnTopicCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getTopic().size() < i0+1) { activitydefinition.addTopic(); }
				String[] arrayi1 = a.getActvtyDfnTopicCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getTopic().get(i0).getCoding().size() < i1+1) { activitydefinition.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getTopic().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Topic_Cdg_UsrSltd ********************************************************************************/
		if(a.getActvtyDfnTopicCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getActvtyDfnTopicCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getTopic().size() < i0+1) { activitydefinition.addTopic(); }
				String[] arrayi1 = a.getActvtyDfnTopicCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getTopic().get(i0).getCoding().size() < i1+1) { activitydefinition.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getTopic().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_Topic_Cdg_Vrsn ********************************************************************************/
		if(a.getActvtyDfnTopicCdgVrsn() != null ) {

			String[] arrayi0 = a.getActvtyDfnTopicCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getTopic().size() < i0+1) { activitydefinition.addTopic(); }
				String[] arrayi1 = a.getActvtyDfnTopicCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getTopic().get(i0).getCoding().size() < i1+1) { activitydefinition.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getTopic().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_Topic_Txt ********************************************************************************/
		if(a.getActvtyDfnTopicTxt() != null ) {

			String[] arrayi0 = a.getActvtyDfnTopicTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getTopic().size() < i0+1) { activitydefinition.addTopic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getTopic().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_Transform ********************************************************************************/
		if(a.getActvtyDfnTransform() != null ) {

			if(a.getActvtyDfnTransform().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnTransform()==null) {} else {
			activitydefinition.setTransform(a.getActvtyDfnTransform().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_Url ********************************************************************************/
		if(a.getActvtyDfnUrl() != null ) {

			if(a.getActvtyDfnUrl().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnUrl()==null) {} else {
			activitydefinition.setUrl(a.getActvtyDfnUrl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_Usg ********************************************************************************/
		if(a.getActvtyDfnUsg() != null ) {

			if(a.getActvtyDfnUsg().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnUsg()==null) {} else {
			activitydefinition.setUsage(a.getActvtyDfnUsg().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ActvtyDfn_UseCntxt_Cd_Cd ********************************************************************************/
		if(a.getActvtyDfnUseCntxtCdCd() != null ) {

			String[] arrayi0 = a.getActvtyDfnUseCntxtCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getUseContext().size() < i0+1) { activitydefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getUseContext().get(i0).getCode().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(a.getActvtyDfnUseCntxtCdDsply() != null ) {

			String[] arrayi0 = a.getActvtyDfnUseCntxtCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getUseContext().size() < i0+1) { activitydefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getUseContext().get(i0).getCode().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(a.getActvtyDfnUseCntxtCdSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnUseCntxtCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getUseContext().size() < i0+1) { activitydefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getUseContext().get(i0).getCode().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(a.getActvtyDfnUseCntxtCdUsrSltd() != null ) {

			String[] arrayi0 = a.getActvtyDfnUseCntxtCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getUseContext().size() < i0+1) { activitydefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getUseContext().get(i0).getCode().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ActvtyDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(a.getActvtyDfnUseCntxtCdVrsn() != null ) {

			String[] arrayi0 = a.getActvtyDfnUseCntxtCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getUseContext().size() < i0+1) { activitydefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getUseContext().get(i0).getCode().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = a.getActvtyDfnUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getUseContext().size() < i0+1) { activitydefinition.addUseContext(); }
				String[] arrayi1 = a.getActvtyDfnUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { activitydefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = a.getActvtyDfnUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getUseContext().size() < i0+1) { activitydefinition.addUseContext(); }
				String[] arrayi1 = a.getActvtyDfnUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { activitydefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getUseContext().size() < i0+1) { activitydefinition.addUseContext(); }
				String[] arrayi1 = a.getActvtyDfnUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { activitydefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getActvtyDfnUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getUseContext().size() < i0+1) { activitydefinition.addUseContext(); }
				String[] arrayi1 = a.getActvtyDfnUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { activitydefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ActvtyDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = a.getActvtyDfnUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getUseContext().size() < i0+1) { activitydefinition.addUseContext(); }
				String[] arrayi1 = a.getActvtyDfnUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(activitydefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { activitydefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {activitydefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ActvtyDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlCdbleCncptTxt() != null ) {

			String[] arrayi0 = a.getActvtyDfnUseCntxtVlCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getUseContext().size() < i0+1) { activitydefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getUseContext().get(i0).getValueCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlQntyCd() != null ) {

			String[] arrayi0 = a.getActvtyDfnUseCntxtVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getUseContext().size() < i0+1) { activitydefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getUseContext().get(i0).getValueQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_UseCntxt_VlQnty_Cmprtr ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlQntyCmprtr() != null ) {

			String[] arrayi0 = a.getActvtyDfnUseCntxtVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getUseContext().size() < i0+1) { activitydefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getUseContext().get(i0).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ActvtyDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlQntySys() != null ) {

			String[] arrayi0 = a.getActvtyDfnUseCntxtVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getUseContext().size() < i0+1) { activitydefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getUseContext().get(i0).getValueQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlQntyUnt() != null ) {

			String[] arrayi0 = a.getActvtyDfnUseCntxtVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getUseContext().size() < i0+1) { activitydefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getUseContext().get(i0).getValueQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlQntyVl() != null ) {

			String[] arrayi0 = a.getActvtyDfnUseCntxtVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getUseContext().size() < i0+1) { activitydefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getUseContext().get(i0).getValueQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ActvtyDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlRngHiCd() != null ) {

			String[] arrayi0 = a.getActvtyDfnUseCntxtVlRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getUseContext().size() < i0+1) { activitydefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getUseContext().get(i0).getValueRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_UseCntxt_VlRng_Hi_Cmprtr ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlRngHiCmprtr() != null ) {

			String[] arrayi0 = a.getActvtyDfnUseCntxtVlRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getUseContext().size() < i0+1) { activitydefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getUseContext().get(i0).getValueRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ActvtyDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlRngHiSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnUseCntxtVlRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getUseContext().size() < i0+1) { activitydefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getUseContext().get(i0).getValueRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlRngHiUnt() != null ) {

			String[] arrayi0 = a.getActvtyDfnUseCntxtVlRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getUseContext().size() < i0+1) { activitydefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getUseContext().get(i0).getValueRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlRngHiVl() != null ) {

			String[] arrayi0 = a.getActvtyDfnUseCntxtVlRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getUseContext().size() < i0+1) { activitydefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getUseContext().get(i0).getValueRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ActvtyDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlRngLwCd() != null ) {

			String[] arrayi0 = a.getActvtyDfnUseCntxtVlRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getUseContext().size() < i0+1) { activitydefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getUseContext().get(i0).getValueRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_UseCntxt_VlRng_Lw_Cmprtr ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlRngLwCmprtr() != null ) {

			String[] arrayi0 = a.getActvtyDfnUseCntxtVlRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getUseContext().size() < i0+1) { activitydefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getUseContext().get(i0).getValueRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ActvtyDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlRngLwSys() != null ) {

			String[] arrayi0 = a.getActvtyDfnUseCntxtVlRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getUseContext().size() < i0+1) { activitydefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getUseContext().get(i0).getValueRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlRngLwUnt() != null ) {

			String[] arrayi0 = a.getActvtyDfnUseCntxtVlRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getUseContext().size() < i0+1) { activitydefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getUseContext().get(i0).getValueRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ActvtyDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlRngLwVl() != null ) {

			String[] arrayi0 = a.getActvtyDfnUseCntxtVlRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getUseContext().size() < i0+1) { activitydefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getUseContext().get(i0).getValueRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** ActvtyDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(a.getActvtyDfnUseCntxtVlRfrnc() != null ) {

			String[] arrayi0 = a.getActvtyDfnUseCntxtVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(activitydefinition.getUseContext().size() < i0+1) { activitydefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {activitydefinition.getUseContext().get(i0).setValue(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ActvtyDfn_Vrsn ********************************************************************************/
		if(a.getActvtyDfnVrsn() != null ) {

			if(a.getActvtyDfnVrsn().replace("[","").replace("]","").equals("NULL") | a.getActvtyDfnVrsn()==null) {} else {
			activitydefinition.setVersion(a.getActvtyDfnVrsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return activitydefinition;
	}
}
