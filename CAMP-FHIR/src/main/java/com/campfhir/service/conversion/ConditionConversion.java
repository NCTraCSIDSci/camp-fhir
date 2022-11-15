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

		}
		return condition;
	}
}
