package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.SearchParameter;
public class SearchParameterConversion 
{
	public org.hl7.fhir.r4.model.SearchParameter SearchParameters(SearchParameter s) throws ParseException
	{
		org.hl7.fhir.r4.model.SearchParameter searchparameter = new org.hl7.fhir.r4.model.SearchParameter();

		/******************** id ********************************************************************************/
		searchparameter.setId(s.getId());

		/******************** SrchPrmtr_Base ********************************************************************************/
		if(s.getSrchPrmtrBase() != null ) {

				for( String currListStrSplit : s.getSrchPrmtrBase().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			searchparameter.addBase(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** SrchPrmtr_Chain ********************************************************************************/
		if(s.getSrchPrmtrChain() != null ) {

				for( String currListStrSplit : s.getSrchPrmtrChain().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			searchparameter.addChain(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** SrchPrmtr_Cd ********************************************************************************/
		if(s.getSrchPrmtrCd() != null ) {

			if(s.getSrchPrmtrCd().replace("[","").replace("]","").equals("NULL") | s.getSrchPrmtrCd()==null) {} else {
			searchparameter.setCode(s.getSrchPrmtrCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrchPrmtr_Cmpnt_Dfn ********************************************************************************/
		if(s.getSrchPrmtrCmpntDfn() != null ) {

			String[] arrayi0 = s.getSrchPrmtrCmpntDfn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getComponent().size() < i0+1) { searchparameter.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {searchparameter.getComponent().get(i0).setDefinition(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrchPrmtr_Cmpnt_Exprsn ********************************************************************************/
		if(s.getSrchPrmtrCmpntExprsn() != null ) {

			String[] arrayi0 = s.getSrchPrmtrCmpntExprsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getComponent().size() < i0+1) { searchparameter.addComponent(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {searchparameter.getComponent().get(i0).setExpression(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrchPrmtr_Cntct_Nm ********************************************************************************/
		if(s.getSrchPrmtrCntctNm() != null ) {

			String[] arrayi0 = s.getSrchPrmtrCntctNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getContact().size() < i0+1) { searchparameter.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {searchparameter.getContact().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrchPrmtr_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(s.getSrchPrmtrCntctTlcmPrdEnd() != null ) {

			String[] arrayi0 = s.getSrchPrmtrCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getContact().size() < i0+1) { searchparameter.addContact(); }
				String[] arrayi1 = s.getSrchPrmtrCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(searchparameter.getContact().get(i0).getTelecom().size() < i1+1) { searchparameter.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {searchparameter.getContact().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SrchPrmtr_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(s.getSrchPrmtrCntctTlcmPrdStrt() != null ) {

			String[] arrayi0 = s.getSrchPrmtrCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getContact().size() < i0+1) { searchparameter.addContact(); }
				String[] arrayi1 = s.getSrchPrmtrCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(searchparameter.getContact().get(i0).getTelecom().size() < i1+1) { searchparameter.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {searchparameter.getContact().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SrchPrmtr_Cntct_Tlcm_Rnk ********************************************************************************/
		if(s.getSrchPrmtrCntctTlcmRnk() != null ) {

			String[] arrayi0 = s.getSrchPrmtrCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getContact().size() < i0+1) { searchparameter.addContact(); }
				String[] arrayi1 = s.getSrchPrmtrCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(searchparameter.getContact().get(i0).getTelecom().size() < i1+1) { searchparameter.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {searchparameter.getContact().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SrchPrmtr_Cntct_Tlcm_Sys ********************************************************************************/
		if(s.getSrchPrmtrCntctTlcmSys() != null ) {

			String[] arrayi0 = s.getSrchPrmtrCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getContact().size() < i0+1) { searchparameter.addContact(); }
				String[] arrayi1 = s.getSrchPrmtrCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(searchparameter.getContact().get(i0).getTelecom().size() < i1+1) { searchparameter.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {searchparameter.getContact().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SrchPrmtr_Cntct_Tlcm_Use ********************************************************************************/
		if(s.getSrchPrmtrCntctTlcmUse() != null ) {

			String[] arrayi0 = s.getSrchPrmtrCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getContact().size() < i0+1) { searchparameter.addContact(); }
				String[] arrayi1 = s.getSrchPrmtrCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(searchparameter.getContact().get(i0).getTelecom().size() < i1+1) { searchparameter.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {searchparameter.getContact().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SrchPrmtr_Cntct_Tlcm_Vl ********************************************************************************/
		if(s.getSrchPrmtrCntctTlcmVl() != null ) {

			String[] arrayi0 = s.getSrchPrmtrCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getContact().size() < i0+1) { searchparameter.addContact(); }
				String[] arrayi1 = s.getSrchPrmtrCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(searchparameter.getContact().get(i0).getTelecom().size() < i1+1) { searchparameter.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {searchparameter.getContact().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SrchPrmtr_Dt ********************************************************************************/
		if(s.getSrchPrmtrDt() != null ) {

			if(s.getSrchPrmtrDt().replace("[","").replace("]","").equals("NULL") | s.getSrchPrmtrDt()==null) {} else {
			searchparameter.setDate(s.getSrchPrmtrDt().replace("[","").replace("]","").equals("NULL") | s.getSrchPrmtrDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(s.getSrchPrmtrDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrchPrmtr_DerivedFrom ********************************************************************************/
		if(s.getSrchPrmtrDerivedFrom() != null ) {

			if(s.getSrchPrmtrDerivedFrom().replace("[","").replace("]","").equals("NULL") | s.getSrchPrmtrDerivedFrom()==null) {} else {
			searchparameter.setDerivedFrom(s.getSrchPrmtrDerivedFrom().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrchPrmtr_Dscrptn ********************************************************************************/
		if(s.getSrchPrmtrDscrptn() != null ) {

			if(s.getSrchPrmtrDscrptn().replace("[","").replace("]","").equals("NULL") | s.getSrchPrmtrDscrptn()==null) {} else {
			searchparameter.setDescription(s.getSrchPrmtrDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrchPrmtr_Exprmtl ********************************************************************************/
		if(s.getSrchPrmtrExprmtl() != null ) {

			if(s.getSrchPrmtrExprmtl().replace("[","").replace("]","").equals("NULL") | s.getSrchPrmtrExprmtl()==null) {} else {
			searchparameter.setExperimental(Boolean.parseBoolean(s.getSrchPrmtrExprmtl().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrchPrmtr_Exprsn ********************************************************************************/
		if(s.getSrchPrmtrExprsn() != null ) {

			if(s.getSrchPrmtrExprsn().replace("[","").replace("]","").equals("NULL") | s.getSrchPrmtrExprsn()==null) {} else {
			searchparameter.setExpression(s.getSrchPrmtrExprsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrchPrmtr_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(s.getSrchPrmtrJrsdctnCdgCd() != null ) {

			String[] arrayi0 = s.getSrchPrmtrJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getJurisdiction().size() < i0+1) { searchparameter.addJurisdiction(); }
				String[] arrayi1 = s.getSrchPrmtrJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(searchparameter.getJurisdiction().get(i0).getCoding().size() < i1+1) { searchparameter.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {searchparameter.getJurisdiction().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SrchPrmtr_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(s.getSrchPrmtrJrsdctnCdgDsply() != null ) {

			String[] arrayi0 = s.getSrchPrmtrJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getJurisdiction().size() < i0+1) { searchparameter.addJurisdiction(); }
				String[] arrayi1 = s.getSrchPrmtrJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(searchparameter.getJurisdiction().get(i0).getCoding().size() < i1+1) { searchparameter.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {searchparameter.getJurisdiction().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SrchPrmtr_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(s.getSrchPrmtrJrsdctnCdgSys() != null ) {

			String[] arrayi0 = s.getSrchPrmtrJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getJurisdiction().size() < i0+1) { searchparameter.addJurisdiction(); }
				String[] arrayi1 = s.getSrchPrmtrJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(searchparameter.getJurisdiction().get(i0).getCoding().size() < i1+1) { searchparameter.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {searchparameter.getJurisdiction().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SrchPrmtr_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(s.getSrchPrmtrJrsdctnCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSrchPrmtrJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getJurisdiction().size() < i0+1) { searchparameter.addJurisdiction(); }
				String[] arrayi1 = s.getSrchPrmtrJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(searchparameter.getJurisdiction().get(i0).getCoding().size() < i1+1) { searchparameter.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {searchparameter.getJurisdiction().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SrchPrmtr_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(s.getSrchPrmtrJrsdctnCdgVrsn() != null ) {

			String[] arrayi0 = s.getSrchPrmtrJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getJurisdiction().size() < i0+1) { searchparameter.addJurisdiction(); }
				String[] arrayi1 = s.getSrchPrmtrJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(searchparameter.getJurisdiction().get(i0).getCoding().size() < i1+1) { searchparameter.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {searchparameter.getJurisdiction().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SrchPrmtr_Jrsdctn_Txt ********************************************************************************/
		if(s.getSrchPrmtrJrsdctnTxt() != null ) {

			String[] arrayi0 = s.getSrchPrmtrJrsdctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getJurisdiction().size() < i0+1) { searchparameter.addJurisdiction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {searchparameter.getJurisdiction().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrchPrmtr_MultipleAnd ********************************************************************************/
		if(s.getSrchPrmtrMultipleAnd() != null ) {

			if(s.getSrchPrmtrMultipleAnd().replace("[","").replace("]","").equals("NULL") | s.getSrchPrmtrMultipleAnd()==null) {} else {
			searchparameter.setMultipleAnd(Boolean.parseBoolean(s.getSrchPrmtrMultipleAnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrchPrmtr_MultipleOr ********************************************************************************/
		if(s.getSrchPrmtrMultipleOr() != null ) {

			if(s.getSrchPrmtrMultipleOr().replace("[","").replace("]","").equals("NULL") | s.getSrchPrmtrMultipleOr()==null) {} else {
			searchparameter.setMultipleOr(Boolean.parseBoolean(s.getSrchPrmtrMultipleOr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrchPrmtr_Nm ********************************************************************************/
		if(s.getSrchPrmtrNm() != null ) {

			if(s.getSrchPrmtrNm().replace("[","").replace("]","").equals("NULL") | s.getSrchPrmtrNm()==null) {} else {
			searchparameter.setName(s.getSrchPrmtrNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrchPrmtr_Pblshr ********************************************************************************/
		if(s.getSrchPrmtrPblshr() != null ) {

			if(s.getSrchPrmtrPblshr().replace("[","").replace("]","").equals("NULL") | s.getSrchPrmtrPblshr()==null) {} else {
			searchparameter.setPublisher(s.getSrchPrmtrPblshr().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrchPrmtr_Prpse ********************************************************************************/
		if(s.getSrchPrmtrPrpse() != null ) {

			if(s.getSrchPrmtrPrpse().replace("[","").replace("]","").equals("NULL") | s.getSrchPrmtrPrpse()==null) {} else {
			searchparameter.setPurpose(s.getSrchPrmtrPrpse().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrchPrmtr_Sts ********************************************************************************/
		if(s.getSrchPrmtrSts() != null ) {

			if(s.getSrchPrmtrSts().replace("[","").replace("]","").equals("NULL") | s.getSrchPrmtrSts()==null) {} else {
			searchparameter.setStatus(new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory().fromCode(s.getSrchPrmtrSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrchPrmtr_Typ ********************************************************************************/
		if(s.getSrchPrmtrTyp() != null ) {

			if(s.getSrchPrmtrTyp().replace("[","").replace("]","").equals("NULL") | s.getSrchPrmtrTyp()==null) {} else {
			searchparameter.setType(new org.hl7.fhir.r4.model.Enumerations.SearchParamTypeEnumFactory().fromCode(s.getSrchPrmtrTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** SrchPrmtr_Url ********************************************************************************/
		if(s.getSrchPrmtrUrl() != null ) {

			if(s.getSrchPrmtrUrl().replace("[","").replace("]","").equals("NULL") | s.getSrchPrmtrUrl()==null) {} else {
			searchparameter.setUrl(s.getSrchPrmtrUrl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrchPrmtr_UseCntxt_Cd_Cd ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtCdCd() != null ) {

			String[] arrayi0 = s.getSrchPrmtrUseCntxtCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getUseContext().size() < i0+1) { searchparameter.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {searchparameter.getUseContext().get(i0).getCode().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrchPrmtr_UseCntxt_Cd_Dsply ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtCdDsply() != null ) {

			String[] arrayi0 = s.getSrchPrmtrUseCntxtCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getUseContext().size() < i0+1) { searchparameter.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {searchparameter.getUseContext().get(i0).getCode().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrchPrmtr_UseCntxt_Cd_Sys ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtCdSys() != null ) {

			String[] arrayi0 = s.getSrchPrmtrUseCntxtCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getUseContext().size() < i0+1) { searchparameter.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {searchparameter.getUseContext().get(i0).getCode().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrchPrmtr_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtCdUsrSltd() != null ) {

			String[] arrayi0 = s.getSrchPrmtrUseCntxtCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getUseContext().size() < i0+1) { searchparameter.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {searchparameter.getUseContext().get(i0).getCode().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SrchPrmtr_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtCdVrsn() != null ) {

			String[] arrayi0 = s.getSrchPrmtrUseCntxtCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getUseContext().size() < i0+1) { searchparameter.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {searchparameter.getUseContext().get(i0).getCode().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrchPrmtr_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = s.getSrchPrmtrUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getUseContext().size() < i0+1) { searchparameter.addUseContext(); }
				String[] arrayi1 = s.getSrchPrmtrUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(searchparameter.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { searchparameter.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {searchparameter.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SrchPrmtr_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = s.getSrchPrmtrUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getUseContext().size() < i0+1) { searchparameter.addUseContext(); }
				String[] arrayi1 = s.getSrchPrmtrUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(searchparameter.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { searchparameter.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {searchparameter.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SrchPrmtr_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = s.getSrchPrmtrUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getUseContext().size() < i0+1) { searchparameter.addUseContext(); }
				String[] arrayi1 = s.getSrchPrmtrUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(searchparameter.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { searchparameter.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {searchparameter.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SrchPrmtr_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSrchPrmtrUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getUseContext().size() < i0+1) { searchparameter.addUseContext(); }
				String[] arrayi1 = s.getSrchPrmtrUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(searchparameter.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { searchparameter.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {searchparameter.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** SrchPrmtr_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = s.getSrchPrmtrUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getUseContext().size() < i0+1) { searchparameter.addUseContext(); }
				String[] arrayi1 = s.getSrchPrmtrUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(searchparameter.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { searchparameter.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {searchparameter.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** SrchPrmtr_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlCdbleCncptTxt() != null ) {

			String[] arrayi0 = s.getSrchPrmtrUseCntxtVlCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getUseContext().size() < i0+1) { searchparameter.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {searchparameter.getUseContext().get(i0).getValueCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrchPrmtr_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlQntyCd() != null ) {

			String[] arrayi0 = s.getSrchPrmtrUseCntxtVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getUseContext().size() < i0+1) { searchparameter.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {searchparameter.getUseContext().get(i0).getValueQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrchPrmtr_UseCntxt_VlQnty_Cmprtr ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlQntyCmprtr() != null ) {

			String[] arrayi0 = s.getSrchPrmtrUseCntxtVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getUseContext().size() < i0+1) { searchparameter.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {searchparameter.getUseContext().get(i0).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SrchPrmtr_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlQntySys() != null ) {

			String[] arrayi0 = s.getSrchPrmtrUseCntxtVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getUseContext().size() < i0+1) { searchparameter.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {searchparameter.getUseContext().get(i0).getValueQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrchPrmtr_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlQntyUnt() != null ) {

			String[] arrayi0 = s.getSrchPrmtrUseCntxtVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getUseContext().size() < i0+1) { searchparameter.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {searchparameter.getUseContext().get(i0).getValueQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrchPrmtr_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlQntyVl() != null ) {

			String[] arrayi0 = s.getSrchPrmtrUseCntxtVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getUseContext().size() < i0+1) { searchparameter.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {searchparameter.getUseContext().get(i0).getValueQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** SrchPrmtr_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlRngHiCd() != null ) {

			String[] arrayi0 = s.getSrchPrmtrUseCntxtVlRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getUseContext().size() < i0+1) { searchparameter.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {searchparameter.getUseContext().get(i0).getValueRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrchPrmtr_UseCntxt_VlRng_Hi_Cmprtr ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlRngHiCmprtr() != null ) {

			String[] arrayi0 = s.getSrchPrmtrUseCntxtVlRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getUseContext().size() < i0+1) { searchparameter.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {searchparameter.getUseContext().get(i0).getValueRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SrchPrmtr_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlRngHiSys() != null ) {

			String[] arrayi0 = s.getSrchPrmtrUseCntxtVlRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getUseContext().size() < i0+1) { searchparameter.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {searchparameter.getUseContext().get(i0).getValueRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrchPrmtr_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlRngHiUnt() != null ) {

			String[] arrayi0 = s.getSrchPrmtrUseCntxtVlRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getUseContext().size() < i0+1) { searchparameter.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {searchparameter.getUseContext().get(i0).getValueRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrchPrmtr_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlRngHiVl() != null ) {

			String[] arrayi0 = s.getSrchPrmtrUseCntxtVlRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getUseContext().size() < i0+1) { searchparameter.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {searchparameter.getUseContext().get(i0).getValueRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** SrchPrmtr_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlRngLwCd() != null ) {

			String[] arrayi0 = s.getSrchPrmtrUseCntxtVlRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getUseContext().size() < i0+1) { searchparameter.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {searchparameter.getUseContext().get(i0).getValueRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrchPrmtr_UseCntxt_VlRng_Lw_Cmprtr ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlRngLwCmprtr() != null ) {

			String[] arrayi0 = s.getSrchPrmtrUseCntxtVlRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getUseContext().size() < i0+1) { searchparameter.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {searchparameter.getUseContext().get(i0).getValueRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SrchPrmtr_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlRngLwSys() != null ) {

			String[] arrayi0 = s.getSrchPrmtrUseCntxtVlRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getUseContext().size() < i0+1) { searchparameter.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {searchparameter.getUseContext().get(i0).getValueRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrchPrmtr_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlRngLwUnt() != null ) {

			String[] arrayi0 = s.getSrchPrmtrUseCntxtVlRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getUseContext().size() < i0+1) { searchparameter.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {searchparameter.getUseContext().get(i0).getValueRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** SrchPrmtr_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlRngLwVl() != null ) {

			String[] arrayi0 = s.getSrchPrmtrUseCntxtVlRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getUseContext().size() < i0+1) { searchparameter.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {searchparameter.getUseContext().get(i0).getValueRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** SrchPrmtr_UseCntxt_VlRfrnc ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlRfrnc() != null ) {

			String[] arrayi0 = s.getSrchPrmtrUseCntxtVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(searchparameter.getUseContext().size() < i0+1) { searchparameter.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {searchparameter.getUseContext().get(i0).setValue(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** SrchPrmtr_Vrsn ********************************************************************************/
		if(s.getSrchPrmtrVrsn() != null ) {

			if(s.getSrchPrmtrVrsn().replace("[","").replace("]","").equals("NULL") | s.getSrchPrmtrVrsn()==null) {} else {
			searchparameter.setVersion(s.getSrchPrmtrVrsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrchPrmtr_Xpath ********************************************************************************/
		if(s.getSrchPrmtrXpath() != null ) {

			if(s.getSrchPrmtrXpath().replace("[","").replace("]","").equals("NULL") | s.getSrchPrmtrXpath()==null) {} else {
			searchparameter.setXpath(s.getSrchPrmtrXpath().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** SrchPrmtr_XpathUsg ********************************************************************************/
		if(s.getSrchPrmtrXpathUsg() != null ) {

			if(s.getSrchPrmtrXpathUsg().replace("[","").replace("]","").equals("NULL") | s.getSrchPrmtrXpathUsg()==null) {} else {
			searchparameter.setXpathUsage(new org.hl7.fhir.r4.model.SearchParameter.XPathUsageTypeEnumFactory().fromCode(s.getSrchPrmtrXpathUsg().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return searchparameter;
	}
}
