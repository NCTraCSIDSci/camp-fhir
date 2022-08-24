package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Condition;
public class ConditionConversion 
{
	public org.hl7.fhir.r4.model.Condition Conditions(Condition c) throws ParseException
	{
		org.hl7.fhir.r4.model.Condition condition = new org.hl7.fhir.r4.model.Condition();

		/******************** id ********************************************************************************/
		condition.setId(c.getId());

<<<<<<< HEAD
		/******************** Cndtn_AbatementAge_Cd ********************************************************************************/
		if(c.getCndtnAbatementAgeCd() != null ) {

			if(c.getCndtnAbatementAgeCd().replace("[","").replace("]","").equals("NULL") | c.getCndtnAbatementAgeCd()==null) {} else {
			condition.getAbatementAge().setCode(c.getCndtnAbatementAgeCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cndtn_AbatementAge_Cmprtr ********************************************************************************/
		if(c.getCndtnAbatementAgeCmprtr() != null ) {

			if(c.getCndtnAbatementAgeCmprtr().replace("[","").replace("]","").equals("NULL") | c.getCndtnAbatementAgeCmprtr()==null) {} else {
			condition.getAbatementAge().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(c.getCndtnAbatementAgeCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cndtn_AbatementAge_Sys ********************************************************************************/
		if(c.getCndtnAbatementAgeSys() != null ) {

			if(c.getCndtnAbatementAgeSys().replace("[","").replace("]","").equals("NULL") | c.getCndtnAbatementAgeSys()==null) {} else {
			condition.getAbatementAge().setSystem(c.getCndtnAbatementAgeSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cndtn_AbatementAge_Unt ********************************************************************************/
		if(c.getCndtnAbatementAgeUnt() != null ) {

			if(c.getCndtnAbatementAgeUnt().replace("[","").replace("]","").equals("NULL") | c.getCndtnAbatementAgeUnt()==null) {} else {
			condition.getAbatementAge().setUnit(c.getCndtnAbatementAgeUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cndtn_AbatementAge_Vl ********************************************************************************/
		if(c.getCndtnAbatementAgeVl() != null ) {

			if(c.getCndtnAbatementAgeVl().replace("[","").replace("]","").equals("NULL") | c.getCndtnAbatementAgeVl()==null) {} else {
			condition.getAbatementAge().setValue((new java.math.BigDecimal((c.getCndtnAbatementAgeVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Cndtn_AbatementDtTimeTyp ********************************************************************************/
		if(c.getCndtnAbatementDtTimeTyp() != null ) {

			if(c.getCndtnAbatementDtTimeTyp().replace("[","").replace("]","").equals("NULL") | c.getCndtnAbatementDtTimeTyp()==null) {} else {
			condition.setAbatement(new org.hl7.fhir.r4.model.DateTimeType(c.getCndtnAbatementDtTimeTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cndtn_AbatementPrd_End ********************************************************************************/
		if(c.getCndtnAbatementPrdEnd() != null ) {

			if(c.getCndtnAbatementPrdEnd().replace("[","").replace("]","").equals("NULL") | c.getCndtnAbatementPrdEnd()==null) {} else {
			condition.getAbatementPeriod().setEnd(c.getCndtnAbatementPrdEnd().replace("[","").replace("]","").equals("NULL") | c.getCndtnAbatementPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCndtnAbatementPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cndtn_AbatementPrd_Strt ********************************************************************************/
		if(c.getCndtnAbatementPrdStrt() != null ) {

			if(c.getCndtnAbatementPrdStrt().replace("[","").replace("]","").equals("NULL") | c.getCndtnAbatementPrdStrt()==null) {} else {
			condition.getAbatementPeriod().setStart(c.getCndtnAbatementPrdStrt().replace("[","").replace("]","").equals("NULL") | c.getCndtnAbatementPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCndtnAbatementPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cndtn_AbatementRng_Hi_Cd ********************************************************************************/
		if(c.getCndtnAbatementRngHiCd() != null ) {

			if(c.getCndtnAbatementRngHiCd().replace("[","").replace("]","").equals("NULL") | c.getCndtnAbatementRngHiCd()==null) {} else {
			condition.getAbatementRange().getHigh().setCode(c.getCndtnAbatementRngHiCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cndtn_AbatementRng_Hi_Cmprtr ********************************************************************************/
		if(c.getCndtnAbatementRngHiCmprtr() != null ) {

			if(c.getCndtnAbatementRngHiCmprtr().replace("[","").replace("]","").equals("NULL") | c.getCndtnAbatementRngHiCmprtr()==null) {} else {
			condition.getAbatementRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(c.getCndtnAbatementRngHiCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cndtn_AbatementRng_Hi_Sys ********************************************************************************/
		if(c.getCndtnAbatementRngHiSys() != null ) {

			if(c.getCndtnAbatementRngHiSys().replace("[","").replace("]","").equals("NULL") | c.getCndtnAbatementRngHiSys()==null) {} else {
			condition.getAbatementRange().getHigh().setSystem(c.getCndtnAbatementRngHiSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cndtn_AbatementRng_Hi_Unt ********************************************************************************/
		if(c.getCndtnAbatementRngHiUnt() != null ) {

			if(c.getCndtnAbatementRngHiUnt().replace("[","").replace("]","").equals("NULL") | c.getCndtnAbatementRngHiUnt()==null) {} else {
			condition.getAbatementRange().getHigh().setUnit(c.getCndtnAbatementRngHiUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cndtn_AbatementRng_Hi_Vl ********************************************************************************/
		if(c.getCndtnAbatementRngHiVl() != null ) {

			if(c.getCndtnAbatementRngHiVl().replace("[","").replace("]","").equals("NULL") | c.getCndtnAbatementRngHiVl()==null) {} else {
			condition.getAbatementRange().getHigh().setValue((new java.math.BigDecimal((c.getCndtnAbatementRngHiVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Cndtn_AbatementRng_Lw_Cd ********************************************************************************/
		if(c.getCndtnAbatementRngLwCd() != null ) {

			if(c.getCndtnAbatementRngLwCd().replace("[","").replace("]","").equals("NULL") | c.getCndtnAbatementRngLwCd()==null) {} else {
			condition.getAbatementRange().getLow().setCode(c.getCndtnAbatementRngLwCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cndtn_AbatementRng_Lw_Cmprtr ********************************************************************************/
		if(c.getCndtnAbatementRngLwCmprtr() != null ) {

			if(c.getCndtnAbatementRngLwCmprtr().replace("[","").replace("]","").equals("NULL") | c.getCndtnAbatementRngLwCmprtr()==null) {} else {
			condition.getAbatementRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(c.getCndtnAbatementRngLwCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cndtn_AbatementRng_Lw_Sys ********************************************************************************/
		if(c.getCndtnAbatementRngLwSys() != null ) {

			if(c.getCndtnAbatementRngLwSys().replace("[","").replace("]","").equals("NULL") | c.getCndtnAbatementRngLwSys()==null) {} else {
			condition.getAbatementRange().getLow().setSystem(c.getCndtnAbatementRngLwSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cndtn_AbatementRng_Lw_Unt ********************************************************************************/
		if(c.getCndtnAbatementRngLwUnt() != null ) {

			if(c.getCndtnAbatementRngLwUnt().replace("[","").replace("]","").equals("NULL") | c.getCndtnAbatementRngLwUnt()==null) {} else {
			condition.getAbatementRange().getLow().setUnit(c.getCndtnAbatementRngLwUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cndtn_AbatementRng_Lw_Vl ********************************************************************************/
		if(c.getCndtnAbatementRngLwVl() != null ) {

			if(c.getCndtnAbatementRngLwVl().replace("[","").replace("]","").equals("NULL") | c.getCndtnAbatementRngLwVl()==null) {} else {
			condition.getAbatementRange().getLow().setValue((new java.math.BigDecimal((c.getCndtnAbatementRngLwVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Cndtn_AbatementStrgTyp ********************************************************************************/
		if(c.getCndtnAbatementStrgTyp() != null ) {

			if(c.getCndtnAbatementStrgTyp().replace("[","").replace("]","").equals("NULL") | c.getCndtnAbatementStrgTyp()==null) {} else {
			condition.setAbatement(new org.hl7.fhir.r4.model.StringType(c.getCndtnAbatementStrgTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cndtn_Asserter ********************************************************************************/
		if(c.getCndtnAsserter() != null ) {

			if(c.getCndtnAsserter().replace("[","").replace("]","").equals("NULL") | c.getCndtnAsserter()==null) {} else {
			condition.setAsserter(new org.hl7.fhir.r4.model.Reference(c.getCndtnAsserter().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cndtn_BodySite_Cdg_Cd ********************************************************************************/
		if(c.getCndtnBodySiteCdgCd() != null ) {

			String[] arrayi0 = c.getCndtnBodySiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getBodySite().size() < i0+1) { condition.addBodySite(); }
				String[] arrayi1 = c.getCndtnBodySiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(condition.getBodySite().get(i0).getCoding().size() < i1+1) { condition.getBodySite().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {condition.getBodySite().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cndtn_BodySite_Cdg_Dsply ********************************************************************************/
		if(c.getCndtnBodySiteCdgDsply() != null ) {

			String[] arrayi0 = c.getCndtnBodySiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getBodySite().size() < i0+1) { condition.addBodySite(); }
				String[] arrayi1 = c.getCndtnBodySiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(condition.getBodySite().get(i0).getCoding().size() < i1+1) { condition.getBodySite().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {condition.getBodySite().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cndtn_BodySite_Cdg_Sys ********************************************************************************/
		if(c.getCndtnBodySiteCdgSys() != null ) {

			String[] arrayi0 = c.getCndtnBodySiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getBodySite().size() < i0+1) { condition.addBodySite(); }
				String[] arrayi1 = c.getCndtnBodySiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(condition.getBodySite().get(i0).getCoding().size() < i1+1) { condition.getBodySite().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {condition.getBodySite().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cndtn_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(c.getCndtnBodySiteCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCndtnBodySiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getBodySite().size() < i0+1) { condition.addBodySite(); }
				String[] arrayi1 = c.getCndtnBodySiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(condition.getBodySite().get(i0).getCoding().size() < i1+1) { condition.getBodySite().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {condition.getBodySite().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cndtn_BodySite_Cdg_Vrsn ********************************************************************************/
		if(c.getCndtnBodySiteCdgVrsn() != null ) {

			String[] arrayi0 = c.getCndtnBodySiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getBodySite().size() < i0+1) { condition.addBodySite(); }
				String[] arrayi1 = c.getCndtnBodySiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(condition.getBodySite().get(i0).getCoding().size() < i1+1) { condition.getBodySite().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {condition.getBodySite().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cndtn_BodySite_Txt ********************************************************************************/
		if(c.getCndtnBodySiteTxt() != null ) {

			String[] arrayi0 = c.getCndtnBodySiteTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getBodySite().size() < i0+1) { condition.addBodySite(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {condition.getBodySite().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cndtn_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getCndtnCtgryCdgCd() != null ) {

			String[] arrayi0 = c.getCndtnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getCategory().size() < i0+1) { condition.addCategory(); }
				String[] arrayi1 = c.getCndtnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(condition.getCategory().get(i0).getCoding().size() < i1+1) { condition.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {condition.getCategory().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cndtn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getCndtnCtgryCdgDsply() != null ) {

			String[] arrayi0 = c.getCndtnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getCategory().size() < i0+1) { condition.addCategory(); }
				String[] arrayi1 = c.getCndtnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(condition.getCategory().get(i0).getCoding().size() < i1+1) { condition.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {condition.getCategory().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cndtn_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getCndtnCtgryCdgSys() != null ) {

			String[] arrayi0 = c.getCndtnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getCategory().size() < i0+1) { condition.addCategory(); }
				String[] arrayi1 = c.getCndtnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(condition.getCategory().get(i0).getCoding().size() < i1+1) { condition.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {condition.getCategory().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cndtn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getCndtnCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCndtnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getCategory().size() < i0+1) { condition.addCategory(); }
				String[] arrayi1 = c.getCndtnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(condition.getCategory().get(i0).getCoding().size() < i1+1) { condition.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {condition.getCategory().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cndtn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getCndtnCtgryCdgVrsn() != null ) {

			String[] arrayi0 = c.getCndtnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getCategory().size() < i0+1) { condition.addCategory(); }
				String[] arrayi1 = c.getCndtnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(condition.getCategory().get(i0).getCoding().size() < i1+1) { condition.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {condition.getCategory().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cndtn_Ctgry_Txt ********************************************************************************/
		if(c.getCndtnCtgryTxt() != null ) {

			String[] arrayi0 = c.getCndtnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getCategory().size() < i0+1) { condition.addCategory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {condition.getCategory().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cndtn_ClnclSts_Cdg_Cd ********************************************************************************/
		if(c.getCndtnClnclStsCdgCd() != null ) {

			String[] arrayi0 = c.getCndtnClnclStsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getClinicalStatus().getCoding().size() < i0+1) { condition.getClinicalStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {condition.getClinicalStatus().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cndtn_ClnclSts_Cdg_Dsply ********************************************************************************/
		if(c.getCndtnClnclStsCdgDsply() != null ) {

			String[] arrayi0 = c.getCndtnClnclStsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getClinicalStatus().getCoding().size() < i0+1) { condition.getClinicalStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {condition.getClinicalStatus().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cndtn_ClnclSts_Cdg_Sys ********************************************************************************/
		if(c.getCndtnClnclStsCdgSys() != null ) {

			String[] arrayi0 = c.getCndtnClnclStsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getClinicalStatus().getCoding().size() < i0+1) { condition.getClinicalStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {condition.getClinicalStatus().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cndtn_ClnclSts_Cdg_UsrSltd ********************************************************************************/
		if(c.getCndtnClnclStsCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCndtnClnclStsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getClinicalStatus().getCoding().size() < i0+1) { condition.getClinicalStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {condition.getClinicalStatus().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cndtn_ClnclSts_Cdg_Vrsn ********************************************************************************/
		if(c.getCndtnClnclStsCdgVrsn() != null ) {

			String[] arrayi0 = c.getCndtnClnclStsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getClinicalStatus().getCoding().size() < i0+1) { condition.getClinicalStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {condition.getClinicalStatus().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cndtn_ClnclSts_Txt ********************************************************************************/
		if(c.getCndtnClnclStsTxt() != null ) {

			if(c.getCndtnClnclStsTxt().replace("[","").replace("]","").equals("NULL") | c.getCndtnClnclStsTxt()==null) {} else {
			condition.getClinicalStatus().setText(c.getCndtnClnclStsTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cndtn_Cd_Cdg_Cd ********************************************************************************/
		if(c.getCndtnCdCdgCd() != null ) {

			String[] arrayi0 = c.getCndtnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getCode().getCoding().size() < i0+1) { condition.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {condition.getCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cndtn_Cd_Cdg_Dsply ********************************************************************************/
		if(c.getCndtnCdCdgDsply() != null ) {

			String[] arrayi0 = c.getCndtnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getCode().getCoding().size() < i0+1) { condition.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {condition.getCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cndtn_Cd_Cdg_Sys ********************************************************************************/
		if(c.getCndtnCdCdgSys() != null ) {

			String[] arrayi0 = c.getCndtnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getCode().getCoding().size() < i0+1) { condition.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {condition.getCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cndtn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(c.getCndtnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCndtnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getCode().getCoding().size() < i0+1) { condition.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {condition.getCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cndtn_Cd_Cdg_Vrsn ********************************************************************************/
		if(c.getCndtnCdCdgVrsn() != null ) {

			String[] arrayi0 = c.getCndtnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getCode().getCoding().size() < i0+1) { condition.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {condition.getCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cndtn_Cd_Txt ********************************************************************************/
		if(c.getCndtnCdTxt() != null ) {

			if(c.getCndtnCdTxt().replace("[","").replace("]","").equals("NULL") | c.getCndtnCdTxt()==null) {} else {
			condition.getCode().setText(c.getCndtnCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cndtn_Enc ********************************************************************************/
		if(c.getCndtnEnc() != null ) {

			if(c.getCndtnEnc().replace("[","").replace("]","").equals("NULL") | c.getCndtnEnc()==null) {} else {
			condition.setEncounter(new org.hl7.fhir.r4.model.Reference(c.getCndtnEnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cndtn_Evdnce_Cd_Cdg_Cd ********************************************************************************/
		if(c.getCndtnEvdnceCdCdgCd() != null ) {

			String[] arrayi0 = c.getCndtnEvdnceCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getEvidence().size() < i0+1) { condition.addEvidence(); }
				String[] arrayi1 = c.getCndtnEvdnceCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(condition.getEvidence().get(i0).getCode().size() < i1+1) { condition.getEvidence().get(i0).addCode(); }
					String[] arrayi2 = c.getCndtnEvdnceCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(condition.getEvidence().get(i0).getCode().get(i1).getCoding().size() < i2+1) { condition.getEvidence().get(i0).getCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {condition.getEvidence().get(i0).getCode().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cndtn_Evdnce_Cd_Cdg_Dsply ********************************************************************************/
		if(c.getCndtnEvdnceCdCdgDsply() != null ) {

			String[] arrayi0 = c.getCndtnEvdnceCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getEvidence().size() < i0+1) { condition.addEvidence(); }
				String[] arrayi1 = c.getCndtnEvdnceCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(condition.getEvidence().get(i0).getCode().size() < i1+1) { condition.getEvidence().get(i0).addCode(); }
					String[] arrayi2 = c.getCndtnEvdnceCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(condition.getEvidence().get(i0).getCode().get(i1).getCoding().size() < i2+1) { condition.getEvidence().get(i0).getCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {condition.getEvidence().get(i0).getCode().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cndtn_Evdnce_Cd_Cdg_Sys ********************************************************************************/
		if(c.getCndtnEvdnceCdCdgSys() != null ) {

			String[] arrayi0 = c.getCndtnEvdnceCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getEvidence().size() < i0+1) { condition.addEvidence(); }
				String[] arrayi1 = c.getCndtnEvdnceCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(condition.getEvidence().get(i0).getCode().size() < i1+1) { condition.getEvidence().get(i0).addCode(); }
					String[] arrayi2 = c.getCndtnEvdnceCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(condition.getEvidence().get(i0).getCode().get(i1).getCoding().size() < i2+1) { condition.getEvidence().get(i0).getCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {condition.getEvidence().get(i0).getCode().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cndtn_Evdnce_Cd_Cdg_UsrSltd ********************************************************************************/
		if(c.getCndtnEvdnceCdCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCndtnEvdnceCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getEvidence().size() < i0+1) { condition.addEvidence(); }
				String[] arrayi1 = c.getCndtnEvdnceCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(condition.getEvidence().get(i0).getCode().size() < i1+1) { condition.getEvidence().get(i0).addCode(); }
					String[] arrayi2 = c.getCndtnEvdnceCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(condition.getEvidence().get(i0).getCode().get(i1).getCoding().size() < i2+1) { condition.getEvidence().get(i0).getCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {condition.getEvidence().get(i0).getCode().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Cndtn_Evdnce_Cd_Cdg_Vrsn ********************************************************************************/
		if(c.getCndtnEvdnceCdCdgVrsn() != null ) {

			String[] arrayi0 = c.getCndtnEvdnceCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getEvidence().size() < i0+1) { condition.addEvidence(); }
				String[] arrayi1 = c.getCndtnEvdnceCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(condition.getEvidence().get(i0).getCode().size() < i1+1) { condition.getEvidence().get(i0).addCode(); }
					String[] arrayi2 = c.getCndtnEvdnceCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(condition.getEvidence().get(i0).getCode().get(i1).getCoding().size() < i2+1) { condition.getEvidence().get(i0).getCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {condition.getEvidence().get(i0).getCode().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Cndtn_Evdnce_Cd_Txt ********************************************************************************/
		if(c.getCndtnEvdnceCdTxt() != null ) {

			String[] arrayi0 = c.getCndtnEvdnceCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getEvidence().size() < i0+1) { condition.addEvidence(); }
				String[] arrayi1 = c.getCndtnEvdnceCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(condition.getEvidence().get(i0).getCode().size() < i1+1) { condition.getEvidence().get(i0).addCode(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {condition.getEvidence().get(i0).getCode().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cndtn_Evdnce_Dtl ********************************************************************************/
		if(c.getCndtnEvdnceDtl() != null ) {

			String[] arrayi0 = c.getCndtnEvdnceDtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getEvidence().size() < i0+1) { condition.addEvidence(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {condition.getEvidence().get(i0).addDetail(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cndtn_Id_Assigner ********************************************************************************/
		if(c.getCndtnIdAssigner() != null ) {

			String[] arrayi0 = c.getCndtnIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getIdentifier().size() < i0+1) { condition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {condition.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cndtn_Id_Prd_End ********************************************************************************/
		if(c.getCndtnIdPrdEnd() != null ) {

			String[] arrayi0 = c.getCndtnIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getIdentifier().size() < i0+1) { condition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {condition.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cndtn_Id_Prd_Strt ********************************************************************************/
		if(c.getCndtnIdPrdStrt() != null ) {

			String[] arrayi0 = c.getCndtnIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getIdentifier().size() < i0+1) { condition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {condition.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cndtn_Id_Sys ********************************************************************************/
		if(c.getCndtnIdSys() != null ) {

			String[] arrayi0 = c.getCndtnIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getIdentifier().size() < i0+1) { condition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {condition.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cndtn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCndtnIdTypCdgCd() != null ) {

			String[] arrayi0 = c.getCndtnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getIdentifier().size() < i0+1) { condition.addIdentifier(); }
				String[] arrayi1 = c.getCndtnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(condition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { condition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {condition.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cndtn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCndtnIdTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCndtnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getIdentifier().size() < i0+1) { condition.addIdentifier(); }
				String[] arrayi1 = c.getCndtnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(condition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { condition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {condition.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cndtn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCndtnIdTypCdgSys() != null ) {

			String[] arrayi0 = c.getCndtnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getIdentifier().size() < i0+1) { condition.addIdentifier(); }
				String[] arrayi1 = c.getCndtnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(condition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { condition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {condition.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cndtn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCndtnIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCndtnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getIdentifier().size() < i0+1) { condition.addIdentifier(); }
				String[] arrayi1 = c.getCndtnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(condition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { condition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {condition.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cndtn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCndtnIdTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCndtnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getIdentifier().size() < i0+1) { condition.addIdentifier(); }
				String[] arrayi1 = c.getCndtnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(condition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { condition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {condition.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cndtn_Id_Typ_Txt ********************************************************************************/
		if(c.getCndtnIdTypTxt() != null ) {

			String[] arrayi0 = c.getCndtnIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getIdentifier().size() < i0+1) { condition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {condition.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cndtn_Id_Use ********************************************************************************/
		if(c.getCndtnIdUse() != null ) {

			String[] arrayi0 = c.getCndtnIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getIdentifier().size() < i0+1) { condition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {condition.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cndtn_Id_Vl ********************************************************************************/
		if(c.getCndtnIdVl() != null ) {

			String[] arrayi0 = c.getCndtnIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getIdentifier().size() < i0+1) { condition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {condition.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cndtn_Nt_AthrRfrnc ********************************************************************************/
		if(c.getCndtnNtAthrRfrnc() != null ) {

			String[] arrayi0 = c.getCndtnNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getNote().size() < i0+1) { condition.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {condition.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cndtn_Nt_AthrStrgTyp ********************************************************************************/
		if(c.getCndtnNtAthrStrgTyp() != null ) {

			String[] arrayi0 = c.getCndtnNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getNote().size() < i0+1) { condition.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {condition.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cndtn_Nt_Txt ********************************************************************************/
		if(c.getCndtnNtTxt() != null ) {

			String[] arrayi0 = c.getCndtnNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getNote().size() < i0+1) { condition.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {condition.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cndtn_Nt_Time ********************************************************************************/
		if(c.getCndtnNtTime() != null ) {

			String[] arrayi0 = c.getCndtnNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getNote().size() < i0+1) { condition.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {condition.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cndtn_OnAge_Cd ********************************************************************************/
		if(c.getCndtnOnAgeCd() != null ) {

			if(c.getCndtnOnAgeCd().replace("[","").replace("]","").equals("NULL") | c.getCndtnOnAgeCd()==null) {} else {
			condition.getOnsetAge().setCode(c.getCndtnOnAgeCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cndtn_OnAge_Cmprtr ********************************************************************************/
		if(c.getCndtnOnAgeCmprtr() != null ) {

			if(c.getCndtnOnAgeCmprtr().replace("[","").replace("]","").equals("NULL") | c.getCndtnOnAgeCmprtr()==null) {} else {
			condition.getOnsetAge().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(c.getCndtnOnAgeCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cndtn_OnAge_Sys ********************************************************************************/
		if(c.getCndtnOnAgeSys() != null ) {

			if(c.getCndtnOnAgeSys().replace("[","").replace("]","").equals("NULL") | c.getCndtnOnAgeSys()==null) {} else {
			condition.getOnsetAge().setSystem(c.getCndtnOnAgeSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cndtn_OnAge_Unt ********************************************************************************/
		if(c.getCndtnOnAgeUnt() != null ) {

			if(c.getCndtnOnAgeUnt().replace("[","").replace("]","").equals("NULL") | c.getCndtnOnAgeUnt()==null) {} else {
			condition.getOnsetAge().setUnit(c.getCndtnOnAgeUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cndtn_OnAge_Vl ********************************************************************************/
		if(c.getCndtnOnAgeVl() != null ) {

			if(c.getCndtnOnAgeVl().replace("[","").replace("]","").equals("NULL") | c.getCndtnOnAgeVl()==null) {} else {
			condition.getOnsetAge().setValue((new java.math.BigDecimal((c.getCndtnOnAgeVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Cndtn_OnDtTimeTyp ********************************************************************************/
		if(c.getCndtnOnDtTimeTyp() != null ) {

			if(c.getCndtnOnDtTimeTyp().replace("[","").replace("]","").equals("NULL") | c.getCndtnOnDtTimeTyp()==null) {} else {
			condition.setOnset( new org.hl7.fhir.r4.model.DateTimeType(c.getCndtnOnDtTimeTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cndtn_OnPrd_End ********************************************************************************/
		if(c.getCndtnOnPrdEnd() != null ) {

			if(c.getCndtnOnPrdEnd().replace("[","").replace("]","").equals("NULL") | c.getCndtnOnPrdEnd()==null) {} else {
			condition.getOnsetPeriod().setEnd(c.getCndtnOnPrdEnd().replace("[","").replace("]","").equals("NULL") | c.getCndtnOnPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCndtnOnPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cndtn_OnPrd_Strt ********************************************************************************/
		if(c.getCndtnOnPrdStrt() != null ) {

			if(c.getCndtnOnPrdStrt().replace("[","").replace("]","").equals("NULL") | c.getCndtnOnPrdStrt()==null) {} else {
			condition.getOnsetPeriod().setStart(c.getCndtnOnPrdStrt().replace("[","").replace("]","").equals("NULL") | c.getCndtnOnPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCndtnOnPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cndtn_OnRng_Hi_Cd ********************************************************************************/
		if(c.getCndtnOnRngHiCd() != null ) {

			if(c.getCndtnOnRngHiCd().replace("[","").replace("]","").equals("NULL") | c.getCndtnOnRngHiCd()==null) {} else {
			condition.getOnsetRange().getHigh().setCode(c.getCndtnOnRngHiCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cndtn_OnRng_Hi_Cmprtr ********************************************************************************/
		if(c.getCndtnOnRngHiCmprtr() != null ) {

			if(c.getCndtnOnRngHiCmprtr().replace("[","").replace("]","").equals("NULL") | c.getCndtnOnRngHiCmprtr()==null) {} else {
			condition.getOnsetRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(c.getCndtnOnRngHiCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cndtn_OnRng_Hi_Sys ********************************************************************************/
		if(c.getCndtnOnRngHiSys() != null ) {

			if(c.getCndtnOnRngHiSys().replace("[","").replace("]","").equals("NULL") | c.getCndtnOnRngHiSys()==null) {} else {
			condition.getOnsetRange().getHigh().setSystem(c.getCndtnOnRngHiSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cndtn_OnRng_Hi_Unt ********************************************************************************/
		if(c.getCndtnOnRngHiUnt() != null ) {

			if(c.getCndtnOnRngHiUnt().replace("[","").replace("]","").equals("NULL") | c.getCndtnOnRngHiUnt()==null) {} else {
			condition.getOnsetRange().getHigh().setUnit(c.getCndtnOnRngHiUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cndtn_OnRng_Hi_Vl ********************************************************************************/
		if(c.getCndtnOnRngHiVl() != null ) {

			if(c.getCndtnOnRngHiVl().replace("[","").replace("]","").equals("NULL") | c.getCndtnOnRngHiVl()==null) {} else {
			condition.getOnsetRange().getHigh().setValue((new java.math.BigDecimal((c.getCndtnOnRngHiVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Cndtn_OnRng_Lw_Cd ********************************************************************************/
		if(c.getCndtnOnRngLwCd() != null ) {

			if(c.getCndtnOnRngLwCd().replace("[","").replace("]","").equals("NULL") | c.getCndtnOnRngLwCd()==null) {} else {
			condition.getOnsetRange().getLow().setCode(c.getCndtnOnRngLwCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cndtn_OnRng_Lw_Cmprtr ********************************************************************************/
		if(c.getCndtnOnRngLwCmprtr() != null ) {

			if(c.getCndtnOnRngLwCmprtr().replace("[","").replace("]","").equals("NULL") | c.getCndtnOnRngLwCmprtr()==null) {} else {
			condition.getOnsetRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(c.getCndtnOnRngLwCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cndtn_OnRng_Lw_Sys ********************************************************************************/
		if(c.getCndtnOnRngLwSys() != null ) {

			if(c.getCndtnOnRngLwSys().replace("[","").replace("]","").equals("NULL") | c.getCndtnOnRngLwSys()==null) {} else {
			condition.getOnsetRange().getLow().setSystem(c.getCndtnOnRngLwSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cndtn_OnRng_Lw_Unt ********************************************************************************/
		if(c.getCndtnOnRngLwUnt() != null ) {

			if(c.getCndtnOnRngLwUnt().replace("[","").replace("]","").equals("NULL") | c.getCndtnOnRngLwUnt()==null) {} else {
			condition.getOnsetRange().getLow().setUnit(c.getCndtnOnRngLwUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cndtn_OnRng_Lw_Vl ********************************************************************************/
		if(c.getCndtnOnRngLwVl() != null ) {

			if(c.getCndtnOnRngLwVl().replace("[","").replace("]","").equals("NULL") | c.getCndtnOnRngLwVl()==null) {} else {
			condition.getOnsetRange().getLow().setValue((new java.math.BigDecimal((c.getCndtnOnRngLwVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Cndtn_OnStrgTyp ********************************************************************************/
		if(c.getCndtnOnStrgTyp() != null ) {

			if(c.getCndtnOnStrgTyp().replace("[","").replace("]","").equals("NULL") | c.getCndtnOnStrgTyp()==null) {} else {
			condition.setOnset( new org.hl7.fhir.r4.model.StringType( c.getCndtnOnStrgTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cndtn_RecordedDt ********************************************************************************/
		if(c.getCndtnRecordedDt() != null ) {

			if(c.getCndtnRecordedDt().replace("[","").replace("]","").equals("NULL") | c.getCndtnRecordedDt()==null) {} else {
			condition.setRecordedDate(c.getCndtnRecordedDt().replace("[","").replace("]","").equals("NULL") | c.getCndtnRecordedDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCndtnRecordedDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cndtn_Recorder ********************************************************************************/
		if(c.getCndtnRecorder() != null ) {

			if(c.getCndtnRecorder().replace("[","").replace("]","").equals("NULL") | c.getCndtnRecorder()==null) {} else {
			condition.setRecorder(new org.hl7.fhir.r4.model.Reference(c.getCndtnRecorder().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cndtn_Severity_Cdg_Cd ********************************************************************************/
		if(c.getCndtnSeverityCdgCd() != null ) {

			String[] arrayi0 = c.getCndtnSeverityCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getSeverity().getCoding().size() < i0+1) { condition.getSeverity().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {condition.getSeverity().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cndtn_Severity_Cdg_Dsply ********************************************************************************/
		if(c.getCndtnSeverityCdgDsply() != null ) {

			String[] arrayi0 = c.getCndtnSeverityCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getSeverity().getCoding().size() < i0+1) { condition.getSeverity().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {condition.getSeverity().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cndtn_Severity_Cdg_Sys ********************************************************************************/
		if(c.getCndtnSeverityCdgSys() != null ) {

			String[] arrayi0 = c.getCndtnSeverityCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getSeverity().getCoding().size() < i0+1) { condition.getSeverity().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {condition.getSeverity().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cndtn_Severity_Cdg_UsrSltd ********************************************************************************/
		if(c.getCndtnSeverityCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCndtnSeverityCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getSeverity().getCoding().size() < i0+1) { condition.getSeverity().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {condition.getSeverity().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cndtn_Severity_Cdg_Vrsn ********************************************************************************/
		if(c.getCndtnSeverityCdgVrsn() != null ) {

			String[] arrayi0 = c.getCndtnSeverityCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getSeverity().getCoding().size() < i0+1) { condition.getSeverity().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {condition.getSeverity().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cndtn_Severity_Txt ********************************************************************************/
		if(c.getCndtnSeverityTxt() != null ) {

			if(c.getCndtnSeverityTxt().replace("[","").replace("]","").equals("NULL") | c.getCndtnSeverityTxt()==null) {} else {
			condition.getSeverity().setText(c.getCndtnSeverityTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Cndtn_Stage_Assmnt ********************************************************************************/
		if(c.getCndtnStageAssmnt() != null ) {

			String[] arrayi0 = c.getCndtnStageAssmnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getStage().size() < i0+1) { condition.addStage(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {condition.getStage().get(i0).addAssessment(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cndtn_Stage_Summary_Cdg_Cd ********************************************************************************/
		if(c.getCndtnStageSummaryCdgCd() != null ) {

			String[] arrayi0 = c.getCndtnStageSummaryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getStage().size() < i0+1) { condition.addStage(); }
				String[] arrayi1 = c.getCndtnStageSummaryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(condition.getStage().get(i0).getSummary().getCoding().size() < i1+1) { condition.getStage().get(i0).getSummary().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {condition.getStage().get(i0).getSummary().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cndtn_Stage_Summary_Cdg_Dsply ********************************************************************************/
		if(c.getCndtnStageSummaryCdgDsply() != null ) {

			String[] arrayi0 = c.getCndtnStageSummaryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getStage().size() < i0+1) { condition.addStage(); }
				String[] arrayi1 = c.getCndtnStageSummaryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(condition.getStage().get(i0).getSummary().getCoding().size() < i1+1) { condition.getStage().get(i0).getSummary().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {condition.getStage().get(i0).getSummary().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cndtn_Stage_Summary_Cdg_Sys ********************************************************************************/
		if(c.getCndtnStageSummaryCdgSys() != null ) {

			String[] arrayi0 = c.getCndtnStageSummaryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getStage().size() < i0+1) { condition.addStage(); }
				String[] arrayi1 = c.getCndtnStageSummaryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(condition.getStage().get(i0).getSummary().getCoding().size() < i1+1) { condition.getStage().get(i0).getSummary().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {condition.getStage().get(i0).getSummary().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cndtn_Stage_Summary_Cdg_UsrSltd ********************************************************************************/
		if(c.getCndtnStageSummaryCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCndtnStageSummaryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getStage().size() < i0+1) { condition.addStage(); }
				String[] arrayi1 = c.getCndtnStageSummaryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(condition.getStage().get(i0).getSummary().getCoding().size() < i1+1) { condition.getStage().get(i0).getSummary().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {condition.getStage().get(i0).getSummary().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cndtn_Stage_Summary_Cdg_Vrsn ********************************************************************************/
		if(c.getCndtnStageSummaryCdgVrsn() != null ) {

			String[] arrayi0 = c.getCndtnStageSummaryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getStage().size() < i0+1) { condition.addStage(); }
				String[] arrayi1 = c.getCndtnStageSummaryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(condition.getStage().get(i0).getSummary().getCoding().size() < i1+1) { condition.getStage().get(i0).getSummary().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {condition.getStage().get(i0).getSummary().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cndtn_Stage_Summary_Txt ********************************************************************************/
		if(c.getCndtnStageSummaryTxt() != null ) {

			String[] arrayi0 = c.getCndtnStageSummaryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getStage().size() < i0+1) { condition.addStage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {condition.getStage().get(i0).getSummary().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cndtn_Stage_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCndtnStageTypCdgCd() != null ) {

			String[] arrayi0 = c.getCndtnStageTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getStage().size() < i0+1) { condition.addStage(); }
				String[] arrayi1 = c.getCndtnStageTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(condition.getStage().get(i0).getType().getCoding().size() < i1+1) { condition.getStage().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {condition.getStage().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cndtn_Stage_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCndtnStageTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCndtnStageTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getStage().size() < i0+1) { condition.addStage(); }
				String[] arrayi1 = c.getCndtnStageTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(condition.getStage().get(i0).getType().getCoding().size() < i1+1) { condition.getStage().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {condition.getStage().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cndtn_Stage_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCndtnStageTypCdgSys() != null ) {

			String[] arrayi0 = c.getCndtnStageTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getStage().size() < i0+1) { condition.addStage(); }
				String[] arrayi1 = c.getCndtnStageTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(condition.getStage().get(i0).getType().getCoding().size() < i1+1) { condition.getStage().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {condition.getStage().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cndtn_Stage_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCndtnStageTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCndtnStageTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getStage().size() < i0+1) { condition.addStage(); }
				String[] arrayi1 = c.getCndtnStageTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(condition.getStage().get(i0).getType().getCoding().size() < i1+1) { condition.getStage().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {condition.getStage().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Cndtn_Stage_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCndtnStageTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCndtnStageTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getStage().size() < i0+1) { condition.addStage(); }
				String[] arrayi1 = c.getCndtnStageTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(condition.getStage().get(i0).getType().getCoding().size() < i1+1) { condition.getStage().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {condition.getStage().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Cndtn_Stage_Typ_Txt ********************************************************************************/
		if(c.getCndtnStageTypTxt() != null ) {

			String[] arrayi0 = c.getCndtnStageTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getStage().size() < i0+1) { condition.addStage(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {condition.getStage().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cndtn_Sbjct ********************************************************************************/
		if(c.getCndtnSbjct() != null ) {

			if(c.getCndtnSbjct().replace("[","").replace("]","").equals("NULL") | c.getCndtnSbjct()==null) {} else {
			condition.setSubject(new org.hl7.fhir.r4.model.Reference(c.getCndtnSbjct().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Cndtn_VrfctnSts_Cdg_Cd ********************************************************************************/
		if(c.getCndtnVrfctnStsCdgCd() != null ) {

			String[] arrayi0 = c.getCndtnVrfctnStsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getVerificationStatus().getCoding().size() < i0+1) { condition.getVerificationStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {condition.getVerificationStatus().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cndtn_VrfctnSts_Cdg_Dsply ********************************************************************************/
		if(c.getCndtnVrfctnStsCdgDsply() != null ) {

			String[] arrayi0 = c.getCndtnVrfctnStsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getVerificationStatus().getCoding().size() < i0+1) { condition.getVerificationStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {condition.getVerificationStatus().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cndtn_VrfctnSts_Cdg_Sys ********************************************************************************/
		if(c.getCndtnVrfctnStsCdgSys() != null ) {

			String[] arrayi0 = c.getCndtnVrfctnStsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getVerificationStatus().getCoding().size() < i0+1) { condition.getVerificationStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {condition.getVerificationStatus().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cndtn_VrfctnSts_Cdg_UsrSltd ********************************************************************************/
		if(c.getCndtnVrfctnStsCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCndtnVrfctnStsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getVerificationStatus().getCoding().size() < i0+1) { condition.getVerificationStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {condition.getVerificationStatus().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Cndtn_VrfctnSts_Cdg_Vrsn ********************************************************************************/
		if(c.getCndtnVrfctnStsCdgVrsn() != null ) {

			String[] arrayi0 = c.getCndtnVrfctnStsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(condition.getVerificationStatus().getCoding().size() < i0+1) { condition.getVerificationStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {condition.getVerificationStatus().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Cndtn_VrfctnSts_Txt ********************************************************************************/
		if(c.getCndtnVrfctnStsTxt() != null ) {

			if(c.getCndtnVrfctnStsTxt().replace("[","").replace("]","").equals("NULL") | c.getCndtnVrfctnStsTxt()==null) {} else {
			condition.getVerificationStatus().setText(c.getCndtnVrfctnStsTxt().replace("[","").replace("]","").replace("\"",""));
			}
=======
		/******************** Condition_Abatement ********************************************************************************/
		if(c.getConditionAbatement() != null) {
			condition.setAbatement(new org.hl7.fhir.r4.model.StringType(c.getConditionAbatement()));
		}
		/******************** Condition_AbatementDateTime ********************************************************************************/
		if(c.getConditionAbatementDateTime() != null) {
			condition.setAbatement(new org.hl7.fhir.r4.model.DateTimeType(c.getConditionAbatementDateTime()));
		}

		if( c.getConditionAbatementPeriodEnd() != null || c.getConditionAbatementPeriodStart() != null ) {
			org.hl7.fhir.r4.model.Period conditionsetabatementPeriod = new org.hl7.fhir.r4.model.Period();
			condition.setAbatement(conditionsetabatementPeriod); 

		/******************** Condition_Abatement_Period_End ********************************************************************************/
		if(c.getConditionAbatementPeriodEnd() != null) {
			java.text.SimpleDateFormat ConditionAbatementPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ConditionAbatementPeriodEnddate = ConditionAbatementPeriodEndsdf.parse(c.getConditionAbatementPeriodEnd());
			conditionsetabatementPeriod.setEnd(ConditionAbatementPeriodEnddate);
		}
		/******************** Condition_Abatement_Period_Start ********************************************************************************/
		if(c.getConditionAbatementPeriodStart() != null) {
			java.text.SimpleDateFormat ConditionAbatementPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ConditionAbatementPeriodStartdate = ConditionAbatementPeriodStartsdf.parse(c.getConditionAbatementPeriodStart());
			conditionsetabatementPeriod.setStart(ConditionAbatementPeriodStartdate);
		}
		}

		if( c.getConditionAbatementRangeHighCode() != null || c.getConditionAbatementRangeHighCompartrCode() != null || c.getConditionAbatementRangeHighSystem() != null || c.getConditionAbatementRangeHighUnit() != null || c.getConditionAbatementRangeHighValue() != null || c.getConditionAbatementRangeLowCode() != null || c.getConditionAbatementRangeLowCompartrCode() != null || c.getConditionAbatementRangeLowSystem() != null || c.getConditionAbatementRangeLowUnit() != null || c.getConditionAbatementRangeLowValue() != null ) {
			org.hl7.fhir.r4.model.Range conditionsetabatementRange = new org.hl7.fhir.r4.model.Range();
			condition.setAbatement(conditionsetabatementRange);


		org.hl7.fhir.r4.model.Quantity conditionsetabatementRangesethigh = new org.hl7.fhir.r4.model.Quantity();
		conditionsetabatementRange.setHigh(conditionsetabatementRangesethigh);

		/******************** Condition_Abatement_Range_High_Code ********************************************************************************/
		if(c.getConditionAbatementRangeHighCode() != null) {
			conditionsetabatementRangesethigh.setCode(c.getConditionAbatementRangeHighCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory conditionsetabatementRangesethighsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Condition_Abatement_Range_High_Compartr_Code ********************************************************************************/
		if(c.getConditionAbatementRangeHighCompartrCode() != null) {
			conditionsetabatementRangesethigh.setComparator(conditionsetabatementRangesethighsetcomparatorEnumFactory.fromCode(c.getConditionAbatementRangeHighCompartrCode()));

		}
		/******************** Condition_Abatement_Range_High_System ********************************************************************************/
		if(c.getConditionAbatementRangeHighSystem() != null) {
			conditionsetabatementRangesethigh.setSystem(c.getConditionAbatementRangeHighSystem());
		}
		/******************** Condition_Abatement_Range_High_Unit ********************************************************************************/
		if(c.getConditionAbatementRangeHighUnit() != null) {
			conditionsetabatementRangesethigh.setUnit(c.getConditionAbatementRangeHighUnit());
		}
		/******************** Condition_Abatement_Range_High_Value ********************************************************************************/
		if(c.getConditionAbatementRangeHighValue() != null) {
			conditionsetabatementRangesethigh.setValue(Double.parseDouble((c.getConditionAbatementRangeHighValue())));
		}

		org.hl7.fhir.r4.model.Quantity conditionsetabatementRangesetlow = new org.hl7.fhir.r4.model.Quantity();
		conditionsetabatementRange.setLow(conditionsetabatementRangesetlow);

		/******************** Condition_Abatement_Range_Low_Code ********************************************************************************/
		if(c.getConditionAbatementRangeLowCode() != null) {
			conditionsetabatementRangesetlow.setCode(c.getConditionAbatementRangeLowCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory conditionsetabatementRangesetlowsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Condition_Abatement_Range_Low_Compartr_Code ********************************************************************************/
		if(c.getConditionAbatementRangeLowCompartrCode() != null) {
			conditionsetabatementRangesetlow.setComparator(conditionsetabatementRangesetlowsetcomparatorEnumFactory.fromCode(c.getConditionAbatementRangeLowCompartrCode()));

		}
		/******************** Condition_Abatement_Range_Low_System ********************************************************************************/
		if(c.getConditionAbatementRangeLowSystem() != null) {
			conditionsetabatementRangesetlow.setSystem(c.getConditionAbatementRangeLowSystem());
		}
		/******************** Condition_Abatement_Range_Low_Unit ********************************************************************************/
		if(c.getConditionAbatementRangeLowUnit() != null) {
			conditionsetabatementRangesetlow.setUnit(c.getConditionAbatementRangeLowUnit());
		}
		/******************** Condition_Abatement_Range_Low_Value ********************************************************************************/
		if(c.getConditionAbatementRangeLowValue() != null) {
			conditionsetabatementRangesetlow.setValue(Double.parseDouble((c.getConditionAbatementRangeLowValue())));
		}
		}
		/******************** Condition_AbatementString ********************************************************************************/
		if(c.getConditionAbatementString() != null) {
			condition.setAbatement(new org.hl7.fhir.r4.model.StringType(c.getConditionAbatementString()));
		}
		/******************** Condition_Asserter ********************************************************************************/
		if(c.getConditionAsserter() != null) {
			org.hl7.fhir.r4.model.Reference ConditionAsserterref = new org.hl7.fhir.r4.model.Reference();
			condition.setAsserter(ConditionAsserterref.setReference(c.getConditionAsserter()));
		}

		org.hl7.fhir.r4.model.CodeableConcept conditionaddbodysite = condition.addBodySite();


		org.hl7.fhir.r4.model.Coding conditionaddbodysiteaddcoding = conditionaddbodysite.addCoding();

		/******************** Condition_BodySite_Coding_Code ********************************************************************************/
		if(c.getConditionBodySiteCodingCode() != null) {
			conditionaddbodysiteaddcoding.setCode(c.getConditionBodySiteCodingCode());
		}
		/******************** Condition_BodySite_Coding_Display ********************************************************************************/
		if(c.getConditionBodySiteCodingDisplay() != null) {
			conditionaddbodysiteaddcoding.setDisplay(c.getConditionBodySiteCodingDisplay());
		}
		/******************** Condition_BodySite_Coding_System ********************************************************************************/
		if(c.getConditionBodySiteCodingSystem() != null) {
			conditionaddbodysiteaddcoding.setSystem(c.getConditionBodySiteCodingSystem());
		}
		/******************** Condition_BodySite_Coding_Usrslt ********************************************************************************/
		if(c.getConditionBodySiteCodingUsrslt() != null) {
			conditionaddbodysiteaddcoding.setUserSelected(Boolean.parseBoolean(c.getConditionBodySiteCodingUsrslt()));
		}
		/******************** Condition_BodySite_Coding_Version ********************************************************************************/
		if(c.getConditionBodySiteCodingVersion() != null) {
			conditionaddbodysiteaddcoding.setVersion(c.getConditionBodySiteCodingVersion());
		}
		/******************** Condition_BodySite_Text ********************************************************************************/
		if(c.getConditionBodySiteText() != null) {
			conditionaddbodysite.setText(c.getConditionBodySiteText());
		}

		org.hl7.fhir.r4.model.CodeableConcept conditionaddcategory = condition.addCategory();


		org.hl7.fhir.r4.model.Coding conditionaddcategoryaddcoding = conditionaddcategory.addCoding();

		/******************** Condition_Category_Coding_Code ********************************************************************************/
		if(c.getConditionCategoryCodingCode() != null) {
			conditionaddcategoryaddcoding.setCode(c.getConditionCategoryCodingCode());
		}
		/******************** Condition_Category_Coding_Display ********************************************************************************/
		if(c.getConditionCategoryCodingDisplay() != null) {
			conditionaddcategoryaddcoding.setDisplay(c.getConditionCategoryCodingDisplay());
		}
		/******************** Condition_Category_Coding_System ********************************************************************************/
		if(c.getConditionCategoryCodingSystem() != null) {
			conditionaddcategoryaddcoding.setSystem(c.getConditionCategoryCodingSystem());
		}
		/******************** Condition_Category_Coding_Usrslt ********************************************************************************/
		if(c.getConditionCategoryCodingUsrslt() != null) {
			conditionaddcategoryaddcoding.setUserSelected(Boolean.parseBoolean(c.getConditionCategoryCodingUsrslt()));
		}
		/******************** Condition_Category_Coding_Version ********************************************************************************/
		if(c.getConditionCategoryCodingVersion() != null) {
			conditionaddcategoryaddcoding.setVersion(c.getConditionCategoryCodingVersion());
		}
		/******************** Condition_Category_Text ********************************************************************************/
		if(c.getConditionCategoryText() != null) {
			conditionaddcategory.setText(c.getConditionCategoryText());
		}

		org.hl7.fhir.r4.model.CodeableConcept conditionsetclinicalstatus = new org.hl7.fhir.r4.model.CodeableConcept();
		condition.setClinicalStatus(conditionsetclinicalstatus);


		org.hl7.fhir.r4.model.Coding conditionsetclinicalstatusaddcoding = conditionsetclinicalstatus.addCoding();

		/******************** Condition_ClinicalStatus_Coding_Code ********************************************************************************/
		if(c.getConditionClinicalStatusCodingCode() != null) {
			conditionsetclinicalstatusaddcoding.setCode(c.getConditionClinicalStatusCodingCode());
		}
		/******************** Condition_ClinicalStatus_Coding_Display ********************************************************************************/
		if(c.getConditionClinicalStatusCodingDisplay() != null) {
			conditionsetclinicalstatusaddcoding.setDisplay(c.getConditionClinicalStatusCodingDisplay());
		}
		/******************** Condition_ClinicalStatus_Coding_System ********************************************************************************/
		if(c.getConditionClinicalStatusCodingSystem() != null) {
			conditionsetclinicalstatusaddcoding.setSystem(c.getConditionClinicalStatusCodingSystem());
		}
		/******************** Condition_ClinicalStatus_Coding_Usrslt ********************************************************************************/
		if(c.getConditionClinicalStatusCodingUsrslt() != null) {
			conditionsetclinicalstatusaddcoding.setUserSelected(Boolean.parseBoolean(c.getConditionClinicalStatusCodingUsrslt()));
		}
		/******************** Condition_ClinicalStatus_Coding_Version ********************************************************************************/
		if(c.getConditionClinicalStatusCodingVersion() != null) {
			conditionsetclinicalstatusaddcoding.setVersion(c.getConditionClinicalStatusCodingVersion());
		}
		/******************** Condition_ClinicalStatus_Text ********************************************************************************/
		if(c.getConditionClinicalStatusText() != null) {
			conditionsetclinicalstatus.setText(c.getConditionClinicalStatusText());
		}

		org.hl7.fhir.r4.model.CodeableConcept conditionsetcode = new org.hl7.fhir.r4.model.CodeableConcept();
		condition.setCode(conditionsetcode);


		org.hl7.fhir.r4.model.Coding conditionsetcodeaddcoding = conditionsetcode.addCoding();

		/******************** Condition_Code_Coding_Code ********************************************************************************/
		if(c.getConditionCodeCodingCode() != null) {
			conditionsetcodeaddcoding.setCode(c.getConditionCodeCodingCode());
		}
		/******************** Condition_Code_Coding_Display ********************************************************************************/
		if(c.getConditionCodeCodingDisplay() != null) {
			conditionsetcodeaddcoding.setDisplay(c.getConditionCodeCodingDisplay());
		}
		/******************** Condition_Code_Coding_System ********************************************************************************/
		if(c.getConditionCodeCodingSystem() != null) {
			conditionsetcodeaddcoding.setSystem(c.getConditionCodeCodingSystem());
		}
		/******************** Condition_Code_Coding_Usrslt ********************************************************************************/
		if(c.getConditionCodeCodingUsrslt() != null) {
			conditionsetcodeaddcoding.setUserSelected(Boolean.parseBoolean(c.getConditionCodeCodingUsrslt()));
		}
		/******************** Condition_Code_Coding_Version ********************************************************************************/
		if(c.getConditionCodeCodingVersion() != null) {
			conditionsetcodeaddcoding.setVersion(c.getConditionCodeCodingVersion());
		}
		/******************** Condition_Code_Text ********************************************************************************/
		if(c.getConditionCodeText() != null) {
			conditionsetcode.setText(c.getConditionCodeText());
		}
		/******************** Condition_Enc ********************************************************************************/
		if(c.getConditionEnc() != null) {
			org.hl7.fhir.r4.model.Reference ConditionEncref = new org.hl7.fhir.r4.model.Reference();
			condition.setEncounter(ConditionEncref.setReference(c.getConditionEnc()));
		}

		org.hl7.fhir.r4.model.Condition.ConditionEvidenceComponent conditionaddevidence = condition.addEvidence();


		org.hl7.fhir.r4.model.CodeableConcept conditionaddevidenceaddcode = conditionaddevidence.addCode();


		org.hl7.fhir.r4.model.Coding conditionaddevidenceaddcodeaddcoding = conditionaddevidenceaddcode.addCoding();

		/******************** Condition_Evidence_Code_Coding_Code ********************************************************************************/
		if(c.getConditionEvidenceCodeCodingCode() != null) {
			conditionaddevidenceaddcodeaddcoding.setCode(c.getConditionEvidenceCodeCodingCode());
		}
		/******************** Condition_Evidence_Code_Coding_Display ********************************************************************************/
		if(c.getConditionEvidenceCodeCodingDisplay() != null) {
			conditionaddevidenceaddcodeaddcoding.setDisplay(c.getConditionEvidenceCodeCodingDisplay());
		}
		/******************** Condition_Evidence_Code_Coding_System ********************************************************************************/
		if(c.getConditionEvidenceCodeCodingSystem() != null) {
			conditionaddevidenceaddcodeaddcoding.setSystem(c.getConditionEvidenceCodeCodingSystem());
		}
		/******************** Condition_Evidence_Code_Coding_Usrslt ********************************************************************************/
		if(c.getConditionEvidenceCodeCodingUsrslt() != null) {
			conditionaddevidenceaddcodeaddcoding.setUserSelected(Boolean.parseBoolean(c.getConditionEvidenceCodeCodingUsrslt()));
		}
		/******************** Condition_Evidence_Code_Coding_Version ********************************************************************************/
		if(c.getConditionEvidenceCodeCodingVersion() != null) {
			conditionaddevidenceaddcodeaddcoding.setVersion(c.getConditionEvidenceCodeCodingVersion());
		}
		/******************** Condition_Evidence_Code_Text ********************************************************************************/
		if(c.getConditionEvidenceCodeText() != null) {
			conditionaddevidenceaddcode.setText(c.getConditionEvidenceCodeText());
		}
		/******************** Condition_Evidence_Detail ********************************************************************************/
		if(c.getConditionEvidenceDetail() != null) {
			org.hl7.fhir.r4.model.Reference ConditionEvidenceDetailref = new org.hl7.fhir.r4.model.Reference();
			conditionaddevidence.addDetail(ConditionEvidenceDetailref.setReference(c.getConditionEvidenceDetail()));
		}

		org.hl7.fhir.r4.model.Identifier conditionaddidentifier = condition.addIdentifier();

		/******************** Condition_Id_Assigner ********************************************************************************/
		if(c.getConditionIdAssigner() != null) {
			org.hl7.fhir.r4.model.Reference ConditionIdAssignerref = new org.hl7.fhir.r4.model.Reference();
			conditionaddidentifier.setAssigner(ConditionIdAssignerref.setReference(c.getConditionIdAssigner()));
		}

		org.hl7.fhir.r4.model.Period conditionaddidentifiersetperiod = new org.hl7.fhir.r4.model.Period();
		conditionaddidentifier.setPeriod(conditionaddidentifiersetperiod);

		/******************** Condition_Id_Period_End ********************************************************************************/
		if(c.getConditionIdPeriodEnd() != null) {
			java.text.SimpleDateFormat ConditionIdPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ConditionIdPeriodEnddate = ConditionIdPeriodEndsdf.parse(c.getConditionIdPeriodEnd());
			conditionaddidentifiersetperiod.setEnd(ConditionIdPeriodEnddate);
		}
		/******************** Condition_Id_Period_Start ********************************************************************************/
		if(c.getConditionIdPeriodStart() != null) {
			java.text.SimpleDateFormat ConditionIdPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ConditionIdPeriodStartdate = ConditionIdPeriodStartsdf.parse(c.getConditionIdPeriodStart());
			conditionaddidentifiersetperiod.setStart(ConditionIdPeriodStartdate);
		}
		/******************** Condition_Id_System ********************************************************************************/
		if(c.getConditionIdSystem() != null) {
			conditionaddidentifier.setSystem(c.getConditionIdSystem());
		}

		org.hl7.fhir.r4.model.CodeableConcept conditionaddidentifiersettype = new org.hl7.fhir.r4.model.CodeableConcept();
		conditionaddidentifier.setType(conditionaddidentifiersettype);


		org.hl7.fhir.r4.model.Coding conditionaddidentifiersettypeaddcoding = conditionaddidentifiersettype.addCoding();

		/******************** Condition_Id_Type_Coding_Code ********************************************************************************/
		if(c.getConditionIdTypeCodingCode() != null) {
			conditionaddidentifiersettypeaddcoding.setCode(c.getConditionIdTypeCodingCode());
		}
		/******************** Condition_Id_Type_Coding_Display ********************************************************************************/
		if(c.getConditionIdTypeCodingDisplay() != null) {
			conditionaddidentifiersettypeaddcoding.setDisplay(c.getConditionIdTypeCodingDisplay());
		}
		/******************** Condition_Id_Type_Coding_System ********************************************************************************/
		if(c.getConditionIdTypeCodingSystem() != null) {
			conditionaddidentifiersettypeaddcoding.setSystem(c.getConditionIdTypeCodingSystem());
		}
		/******************** Condition_Id_Type_Coding_Usrslt ********************************************************************************/
		if(c.getConditionIdTypeCodingUsrslt() != null) {
			conditionaddidentifiersettypeaddcoding.setUserSelected(Boolean.parseBoolean(c.getConditionIdTypeCodingUsrslt()));
		}
		/******************** Condition_Id_Type_Coding_Version ********************************************************************************/
		if(c.getConditionIdTypeCodingVersion() != null) {
			conditionaddidentifiersettypeaddcoding.setVersion(c.getConditionIdTypeCodingVersion());
		}
		/******************** Condition_Id_Type_Text ********************************************************************************/
		if(c.getConditionIdTypeText() != null) {
			conditionaddidentifiersettype.setText(c.getConditionIdTypeText());
		}

		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory conditionaddidentifiersetuseEnumFactory = new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();

		/******************** Condition_Id_Use_Code ********************************************************************************/
		if(c.getConditionIdUseCode() != null) {
			conditionaddidentifier.setUse(conditionaddidentifiersetuseEnumFactory.fromCode(c.getConditionIdUseCode()));

		}
		/******************** Condition_Id_Value ********************************************************************************/
		if(c.getConditionIdValue() != null) {
			conditionaddidentifier.setValue(c.getConditionIdValue());
		}

		org.hl7.fhir.r4.model.Annotation conditionaddnote = condition.addNote();

		/******************** Condition_Note_AuthorReference ********************************************************************************/
		if(c.getConditionNoteAuthorReference() != null) {
			org.hl7.fhir.r4.model.Reference ConditionNoteAuthorReferenceref = new org.hl7.fhir.r4.model.Reference();
			conditionaddnote.setAuthor(ConditionNoteAuthorReferenceref.setReference(c.getConditionNoteAuthorReference()));
		}
		/******************** Condition_Note_AuthorString ********************************************************************************/
		if(c.getConditionNoteAuthorString() != null) {
			conditionaddnote.setAuthor(new org.hl7.fhir.r4.model.StringType(c.getConditionNoteAuthorString()));
		}
		/******************** Condition_Note_Text ********************************************************************************/
		if(c.getConditionNoteText() != null) {
			conditionaddnote.setText(c.getConditionNoteText());
		}
		/******************** Condition_Note_Time ********************************************************************************/
		if(c.getConditionNoteTime() != null) {
			java.text.SimpleDateFormat ConditionNoteTimesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ConditionNoteTimedate = ConditionNoteTimesdf.parse(c.getConditionNoteTime());
			conditionaddnote.setTime(ConditionNoteTimedate);
		}
		/******************** Condition_On ********************************************************************************/
		if(c.getConditionOn() != null) {
			condition.setOnset(new org.hl7.fhir.r4.model.StringType(c.getConditionOn()));
		}
		/******************** Condition_OnDateTime ********************************************************************************/
		if(c.getConditionOnDateTime() != null) {
			condition.setOnset(new org.hl7.fhir.r4.model.DateTimeType(c.getConditionOnDateTime()));
		}

		if( c.getConditionOnPeriodEnd() != null || c.getConditionOnPeriodStart() != null ) {
			org.hl7.fhir.r4.model.Period conditionsetonsetPeriod = new org.hl7.fhir.r4.model.Period();
			condition.setOnset(conditionsetonsetPeriod);

		/******************** Condition_On_Period_End ********************************************************************************/
		if(c.getConditionOnPeriodEnd() != null) {
			java.text.SimpleDateFormat ConditionOnPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ConditionOnPeriodEnddate = ConditionOnPeriodEndsdf.parse(c.getConditionOnPeriodEnd());
			conditionsetonsetPeriod.setEnd(ConditionOnPeriodEnddate);
		}
		/******************** Condition_On_Period_Start ********************************************************************************/
		if(c.getConditionOnPeriodStart() != null) {
			java.text.SimpleDateFormat ConditionOnPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ConditionOnPeriodStartdate = ConditionOnPeriodStartsdf.parse(c.getConditionOnPeriodStart());
			conditionsetonsetPeriod.setStart(ConditionOnPeriodStartdate);
		}
		}

		if( c.getConditionOnRangeHighCode() != null || c.getConditionOnRangeHighCompartrCode() != null || c.getConditionOnRangeHighSystem() != null || c.getConditionOnRangeHighUnit() != null || c.getConditionOnRangeHighValue() != null || c.getConditionOnRangeLowCode() != null || c.getConditionOnRangeLowCompartrCode() != null || c.getConditionOnRangeLowSystem() != null || c.getConditionOnRangeLowUnit() != null || c.getConditionOnRangeLowValue() != null ) {
			org.hl7.fhir.r4.model.Range conditionsetonsetRange = new org.hl7.fhir.r4.model.Range();
			condition.setOnset(conditionsetonsetRange);


		org.hl7.fhir.r4.model.Quantity conditionsetonsetRangesethigh = new org.hl7.fhir.r4.model.Quantity();
		conditionsetonsetRange.setHigh(conditionsetonsetRangesethigh);

		/******************** Condition_On_Range_High_Code ********************************************************************************/
		if(c.getConditionOnRangeHighCode() != null) {
			conditionsetonsetRangesethigh.setCode(c.getConditionOnRangeHighCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory conditionsetonsetRangesethighsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Condition_On_Range_High_Compartr_Code ********************************************************************************/
		if(c.getConditionOnRangeHighCompartrCode() != null) {
			conditionsetonsetRangesethigh.setComparator(conditionsetonsetRangesethighsetcomparatorEnumFactory.fromCode(c.getConditionOnRangeHighCompartrCode()));

		}
		/******************** Condition_On_Range_High_System ********************************************************************************/
		if(c.getConditionOnRangeHighSystem() != null) {
			conditionsetonsetRangesethigh.setSystem(c.getConditionOnRangeHighSystem());
		}
		/******************** Condition_On_Range_High_Unit ********************************************************************************/
		if(c.getConditionOnRangeHighUnit() != null) {
			conditionsetonsetRangesethigh.setUnit(c.getConditionOnRangeHighUnit());
		}
		/******************** Condition_On_Range_High_Value ********************************************************************************/
		if(c.getConditionOnRangeHighValue() != null) {
			conditionsetonsetRangesethigh.setValue(Double.parseDouble((c.getConditionOnRangeHighValue())));
		}

		org.hl7.fhir.r4.model.Quantity conditionsetonsetRangesetlow = new org.hl7.fhir.r4.model.Quantity();
		conditionsetonsetRange.setLow(conditionsetonsetRangesetlow);

		/******************** Condition_On_Range_Low_Code ********************************************************************************/
		if(c.getConditionOnRangeLowCode() != null) {
			conditionsetonsetRangesetlow.setCode(c.getConditionOnRangeLowCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory conditionsetonsetRangesetlowsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Condition_On_Range_Low_Compartr_Code ********************************************************************************/
		if(c.getConditionOnRangeLowCompartrCode() != null) {
			conditionsetonsetRangesetlow.setComparator(conditionsetonsetRangesetlowsetcomparatorEnumFactory.fromCode(c.getConditionOnRangeLowCompartrCode()));

		}
		/******************** Condition_On_Range_Low_System ********************************************************************************/
		if(c.getConditionOnRangeLowSystem() != null) {
			conditionsetonsetRangesetlow.setSystem(c.getConditionOnRangeLowSystem());
		}
		/******************** Condition_On_Range_Low_Unit ********************************************************************************/
		if(c.getConditionOnRangeLowUnit() != null) {
			conditionsetonsetRangesetlow.setUnit(c.getConditionOnRangeLowUnit());
		}
		/******************** Condition_On_Range_Low_Value ********************************************************************************/
		if(c.getConditionOnRangeLowValue() != null) {
			conditionsetonsetRangesetlow.setValue(Double.parseDouble((c.getConditionOnRangeLowValue())));
		}
		}
		/******************** Condition_OnString ********************************************************************************/
		if(c.getConditionOnString() != null) {
			condition.setOnset(new org.hl7.fhir.r4.model.StringType(c.getConditionOnString()));
		}
		/******************** Condition_RecordedDate ********************************************************************************/
		if(c.getConditionRecordedDate() != null) {
			java.text.SimpleDateFormat ConditionRecordedDatesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ConditionRecordedDatedate = ConditionRecordedDatesdf.parse(c.getConditionRecordedDate());
			condition.setRecordedDate(ConditionRecordedDatedate);
		}
		/******************** Condition_Recorder ********************************************************************************/
		if(c.getConditionRecorder() != null) {
			org.hl7.fhir.r4.model.Reference ConditionRecorderref = new org.hl7.fhir.r4.model.Reference();
			condition.setRecorder(ConditionRecorderref.setReference(c.getConditionRecorder()));
		}

		org.hl7.fhir.r4.model.CodeableConcept conditionsetseverity = new org.hl7.fhir.r4.model.CodeableConcept();
		condition.setSeverity(conditionsetseverity);


		org.hl7.fhir.r4.model.Coding conditionsetseverityaddcoding = conditionsetseverity.addCoding();

		/******************** Condition_Severity_Coding_Code ********************************************************************************/
		if(c.getConditionSeverityCodingCode() != null) {
			conditionsetseverityaddcoding.setCode(c.getConditionSeverityCodingCode());
		}
		/******************** Condition_Severity_Coding_Display ********************************************************************************/
		if(c.getConditionSeverityCodingDisplay() != null) {
			conditionsetseverityaddcoding.setDisplay(c.getConditionSeverityCodingDisplay());
		}
		/******************** Condition_Severity_Coding_System ********************************************************************************/
		if(c.getConditionSeverityCodingSystem() != null) {
			conditionsetseverityaddcoding.setSystem(c.getConditionSeverityCodingSystem());
		}
		/******************** Condition_Severity_Coding_Usrslt ********************************************************************************/
		if(c.getConditionSeverityCodingUsrslt() != null) {
			conditionsetseverityaddcoding.setUserSelected(Boolean.parseBoolean(c.getConditionSeverityCodingUsrslt()));
		}
		/******************** Condition_Severity_Coding_Version ********************************************************************************/
		if(c.getConditionSeverityCodingVersion() != null) {
			conditionsetseverityaddcoding.setVersion(c.getConditionSeverityCodingVersion());
		}
		/******************** Condition_Severity_Text ********************************************************************************/
		if(c.getConditionSeverityText() != null) {
			conditionsetseverity.setText(c.getConditionSeverityText());
		}

		org.hl7.fhir.r4.model.Condition.ConditionStageComponent conditionaddstage = condition.addStage();

		/******************** Condition_Stage_Assessment ********************************************************************************/
		if(c.getConditionStageAssessment() != null) {
			org.hl7.fhir.r4.model.Reference ConditionStageAssessmentref = new org.hl7.fhir.r4.model.Reference();
			conditionaddstage.addAssessment(ConditionStageAssessmentref.setReference(c.getConditionStageAssessment()));
		}

		org.hl7.fhir.r4.model.CodeableConcept conditionaddstagesetsummary = new org.hl7.fhir.r4.model.CodeableConcept();
		conditionaddstage.setSummary(conditionaddstagesetsummary);


		org.hl7.fhir.r4.model.Coding conditionaddstagesetsummaryaddcoding = conditionaddstagesetsummary.addCoding();

		/******************** Condition_Stage_Summary_Coding_Code ********************************************************************************/
		if(c.getConditionStageSummaryCodingCode() != null) {
			conditionaddstagesetsummaryaddcoding.setCode(c.getConditionStageSummaryCodingCode());
		}
		/******************** Condition_Stage_Summary_Coding_Display ********************************************************************************/
		if(c.getConditionStageSummaryCodingDisplay() != null) {
			conditionaddstagesetsummaryaddcoding.setDisplay(c.getConditionStageSummaryCodingDisplay());
		}
		/******************** Condition_Stage_Summary_Coding_System ********************************************************************************/
		if(c.getConditionStageSummaryCodingSystem() != null) {
			conditionaddstagesetsummaryaddcoding.setSystem(c.getConditionStageSummaryCodingSystem());
		}
		/******************** Condition_Stage_Summary_Coding_Usrslt ********************************************************************************/
		if(c.getConditionStageSummaryCodingUsrslt() != null) {
			conditionaddstagesetsummaryaddcoding.setUserSelected(Boolean.parseBoolean(c.getConditionStageSummaryCodingUsrslt()));
		}
		/******************** Condition_Stage_Summary_Coding_Version ********************************************************************************/
		if(c.getConditionStageSummaryCodingVersion() != null) {
			conditionaddstagesetsummaryaddcoding.setVersion(c.getConditionStageSummaryCodingVersion());
		}
		/******************** Condition_Stage_Summary_Text ********************************************************************************/
		if(c.getConditionStageSummaryText() != null) {
			conditionaddstagesetsummary.setText(c.getConditionStageSummaryText());
		}

		org.hl7.fhir.r4.model.CodeableConcept conditionaddstagesettype = new org.hl7.fhir.r4.model.CodeableConcept();
		conditionaddstage.setType(conditionaddstagesettype);


		org.hl7.fhir.r4.model.Coding conditionaddstagesettypeaddcoding = conditionaddstagesettype.addCoding();

		/******************** Condition_Stage_Type_Coding_Code ********************************************************************************/
		if(c.getConditionStageTypeCodingCode() != null) {
			conditionaddstagesettypeaddcoding.setCode(c.getConditionStageTypeCodingCode());
		}
		/******************** Condition_Stage_Type_Coding_Display ********************************************************************************/
		if(c.getConditionStageTypeCodingDisplay() != null) {
			conditionaddstagesettypeaddcoding.setDisplay(c.getConditionStageTypeCodingDisplay());
		}
		/******************** Condition_Stage_Type_Coding_System ********************************************************************************/
		if(c.getConditionStageTypeCodingSystem() != null) {
			conditionaddstagesettypeaddcoding.setSystem(c.getConditionStageTypeCodingSystem());
		}
		/******************** Condition_Stage_Type_Coding_Usrslt ********************************************************************************/
		if(c.getConditionStageTypeCodingUsrslt() != null) {
			conditionaddstagesettypeaddcoding.setUserSelected(Boolean.parseBoolean(c.getConditionStageTypeCodingUsrslt()));
		}
		/******************** Condition_Stage_Type_Coding_Version ********************************************************************************/
		if(c.getConditionStageTypeCodingVersion() != null) {
			conditionaddstagesettypeaddcoding.setVersion(c.getConditionStageTypeCodingVersion());
		}
		/******************** Condition_Stage_Type_Text ********************************************************************************/
		if(c.getConditionStageTypeText() != null) {
			conditionaddstagesettype.setText(c.getConditionStageTypeText());
		}
		/******************** Condition_Subject ********************************************************************************/
		if(c.getConditionSubject() != null) {
			org.hl7.fhir.r4.model.Reference ConditionSubjectref = new org.hl7.fhir.r4.model.Reference();
			condition.setSubject(ConditionSubjectref.setReference(c.getConditionSubject()));
		}

		org.hl7.fhir.r4.model.CodeableConcept conditionsetverificationstatus = new org.hl7.fhir.r4.model.CodeableConcept();
		condition.setVerificationStatus(conditionsetverificationstatus);


		org.hl7.fhir.r4.model.Coding conditionsetverificationstatusaddcoding = conditionsetverificationstatus.addCoding();

		/******************** Condition_VerificationStatus_Coding_Code ********************************************************************************/
		if(c.getConditionVerificationStatusCodingCode() != null) {
			conditionsetverificationstatusaddcoding.setCode(c.getConditionVerificationStatusCodingCode());
		}
		/******************** Condition_VerificationStatus_Coding_Display ********************************************************************************/
		if(c.getConditionVerificationStatusCodingDisplay() != null) {
			conditionsetverificationstatusaddcoding.setDisplay(c.getConditionVerificationStatusCodingDisplay());
		}
		/******************** Condition_VerificationStatus_Coding_System ********************************************************************************/
		if(c.getConditionVerificationStatusCodingSystem() != null) {
			conditionsetverificationstatusaddcoding.setSystem(c.getConditionVerificationStatusCodingSystem());
		}
		/******************** Condition_VerificationStatus_Coding_Usrslt ********************************************************************************/
		if(c.getConditionVerificationStatusCodingUsrslt() != null) {
			conditionsetverificationstatusaddcoding.setUserSelected(Boolean.parseBoolean(c.getConditionVerificationStatusCodingUsrslt()));
		}
		/******************** Condition_VerificationStatus_Coding_Version ********************************************************************************/
		if(c.getConditionVerificationStatusCodingVersion() != null) {
			conditionsetverificationstatusaddcoding.setVersion(c.getConditionVerificationStatusCodingVersion());
		}
		/******************** Condition_VerificationStatus_Text ********************************************************************************/
		if(c.getConditionVerificationStatusText() != null) {
			conditionsetverificationstatus.setText(c.getConditionVerificationStatusText());
>>>>>>> master
		}
		return condition;
	}
}
