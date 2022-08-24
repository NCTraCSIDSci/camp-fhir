package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.FamilyMemberHistory;
public class FamilyMemberHistoryConversion 
{
	public org.hl7.fhir.r4.model.FamilyMemberHistory FamilyMemberHistorys(FamilyMemberHistory f) throws ParseException
	{
		org.hl7.fhir.r4.model.FamilyMemberHistory familymemberhistory = new org.hl7.fhir.r4.model.FamilyMemberHistory();

		/******************** id ********************************************************************************/
		familymemberhistory.setId(f.getId());

		/******************** FmlyMmbrHis_AgeAge_Cd ********************************************************************************/
		if(f.getFmlyMmbrHisAgeAgeCd() != null ) {

			if(f.getFmlyMmbrHisAgeAgeCd().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisAgeAgeCd()==null) {} else {
			familymemberhistory.getAgeAge().setCode(f.getFmlyMmbrHisAgeAgeCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** FmlyMmbrHis_AgeAge_Cmprtr ********************************************************************************/
		if(f.getFmlyMmbrHisAgeAgeCmprtr() != null ) {

			if(f.getFmlyMmbrHisAgeAgeCmprtr().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisAgeAgeCmprtr()==null) {} else {
			familymemberhistory.getAgeAge().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(f.getFmlyMmbrHisAgeAgeCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** FmlyMmbrHis_AgeAge_Sys ********************************************************************************/
		if(f.getFmlyMmbrHisAgeAgeSys() != null ) {

			if(f.getFmlyMmbrHisAgeAgeSys().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisAgeAgeSys()==null) {} else {
			familymemberhistory.getAgeAge().setSystem(f.getFmlyMmbrHisAgeAgeSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** FmlyMmbrHis_AgeAge_Unt ********************************************************************************/
		if(f.getFmlyMmbrHisAgeAgeUnt() != null ) {

			if(f.getFmlyMmbrHisAgeAgeUnt().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisAgeAgeUnt()==null) {} else {
			familymemberhistory.getAgeAge().setUnit(f.getFmlyMmbrHisAgeAgeUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** FmlyMmbrHis_AgeAge_Vl ********************************************************************************/
		if(f.getFmlyMmbrHisAgeAgeVl() != null ) {

			if(f.getFmlyMmbrHisAgeAgeVl().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisAgeAgeVl()==null) {} else {
			familymemberhistory.getAgeAge().setValue((new java.math.BigDecimal((f.getFmlyMmbrHisAgeAgeVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** FmlyMmbrHis_AgeRng_Hi_Cd ********************************************************************************/
		if(f.getFmlyMmbrHisAgeRngHiCd() != null ) {

			if(f.getFmlyMmbrHisAgeRngHiCd().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisAgeRngHiCd()==null) {} else {
			familymemberhistory.getAgeRange().getHigh().setCode(f.getFmlyMmbrHisAgeRngHiCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** FmlyMmbrHis_AgeRng_Hi_Cmprtr ********************************************************************************/
		if(f.getFmlyMmbrHisAgeRngHiCmprtr() != null ) {

			if(f.getFmlyMmbrHisAgeRngHiCmprtr().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisAgeRngHiCmprtr()==null) {} else {
			familymemberhistory.getAgeRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(f.getFmlyMmbrHisAgeRngHiCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** FmlyMmbrHis_AgeRng_Hi_Sys ********************************************************************************/
		if(f.getFmlyMmbrHisAgeRngHiSys() != null ) {

			if(f.getFmlyMmbrHisAgeRngHiSys().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisAgeRngHiSys()==null) {} else {
			familymemberhistory.getAgeRange().getHigh().setSystem(f.getFmlyMmbrHisAgeRngHiSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** FmlyMmbrHis_AgeRng_Hi_Unt ********************************************************************************/
		if(f.getFmlyMmbrHisAgeRngHiUnt() != null ) {

			if(f.getFmlyMmbrHisAgeRngHiUnt().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisAgeRngHiUnt()==null) {} else {
			familymemberhistory.getAgeRange().getHigh().setUnit(f.getFmlyMmbrHisAgeRngHiUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** FmlyMmbrHis_AgeRng_Hi_Vl ********************************************************************************/
		if(f.getFmlyMmbrHisAgeRngHiVl() != null ) {

			if(f.getFmlyMmbrHisAgeRngHiVl().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisAgeRngHiVl()==null) {} else {
			familymemberhistory.getAgeRange().getHigh().setValue((new java.math.BigDecimal((f.getFmlyMmbrHisAgeRngHiVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** FmlyMmbrHis_AgeRng_Lw_Cd ********************************************************************************/
		if(f.getFmlyMmbrHisAgeRngLwCd() != null ) {

			if(f.getFmlyMmbrHisAgeRngLwCd().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisAgeRngLwCd()==null) {} else {
			familymemberhistory.getAgeRange().getLow().setCode(f.getFmlyMmbrHisAgeRngLwCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** FmlyMmbrHis_AgeRng_Lw_Cmprtr ********************************************************************************/
		if(f.getFmlyMmbrHisAgeRngLwCmprtr() != null ) {

			if(f.getFmlyMmbrHisAgeRngLwCmprtr().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisAgeRngLwCmprtr()==null) {} else {
			familymemberhistory.getAgeRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(f.getFmlyMmbrHisAgeRngLwCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** FmlyMmbrHis_AgeRng_Lw_Sys ********************************************************************************/
		if(f.getFmlyMmbrHisAgeRngLwSys() != null ) {

			if(f.getFmlyMmbrHisAgeRngLwSys().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisAgeRngLwSys()==null) {} else {
			familymemberhistory.getAgeRange().getLow().setSystem(f.getFmlyMmbrHisAgeRngLwSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** FmlyMmbrHis_AgeRng_Lw_Unt ********************************************************************************/
		if(f.getFmlyMmbrHisAgeRngLwUnt() != null ) {

			if(f.getFmlyMmbrHisAgeRngLwUnt().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisAgeRngLwUnt()==null) {} else {
			familymemberhistory.getAgeRange().getLow().setUnit(f.getFmlyMmbrHisAgeRngLwUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** FmlyMmbrHis_AgeRng_Lw_Vl ********************************************************************************/
		if(f.getFmlyMmbrHisAgeRngLwVl() != null ) {

			if(f.getFmlyMmbrHisAgeRngLwVl().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisAgeRngLwVl()==null) {} else {
			familymemberhistory.getAgeRange().getLow().setValue((new java.math.BigDecimal((f.getFmlyMmbrHisAgeRngLwVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** FmlyMmbrHis_AgeStrgTyp ********************************************************************************/
		if(f.getFmlyMmbrHisAgeStrgTyp() != null ) {

			if(f.getFmlyMmbrHisAgeStrgTyp().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisAgeStrgTyp()==null) {} else {
			familymemberhistory.setAge(new org.hl7.fhir.r4.model.StringType(f.getFmlyMmbrHisAgeStrgTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** FmlyMmbrHis_BornDtTyp ********************************************************************************/
		if(f.getFmlyMmbrHisBornDtTyp() != null ) {

			if(f.getFmlyMmbrHisBornDtTyp().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisBornDtTyp()==null) {} else {
			familymemberhistory.setBorn(new org.hl7.fhir.r4.model.DateType(f.getFmlyMmbrHisBornDtTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** FmlyMmbrHis_BornPrd_End ********************************************************************************/
		if(f.getFmlyMmbrHisBornPrdEnd() != null ) {

			if(f.getFmlyMmbrHisBornPrdEnd().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisBornPrdEnd()==null) {} else {
			familymemberhistory.getBornPeriod().setEnd(f.getFmlyMmbrHisBornPrdEnd().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisBornPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(f.getFmlyMmbrHisBornPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** FmlyMmbrHis_BornPrd_Strt ********************************************************************************/
		if(f.getFmlyMmbrHisBornPrdStrt() != null ) {

			if(f.getFmlyMmbrHisBornPrdStrt().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisBornPrdStrt()==null) {} else {
			familymemberhistory.getBornPeriod().setStart(f.getFmlyMmbrHisBornPrdStrt().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisBornPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(f.getFmlyMmbrHisBornPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** FmlyMmbrHis_BornStrgTyp ********************************************************************************/
		if(f.getFmlyMmbrHisBornStrgTyp() != null ) {

			if(f.getFmlyMmbrHisBornStrgTyp().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisBornStrgTyp()==null) {} else {
			familymemberhistory.setBorn(new org.hl7.fhir.r4.model.StringType(f.getFmlyMmbrHisBornStrgTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** FmlyMmbrHis_Cndtn_Cd_Cdg_Cd ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnCdCdgCd() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisCndtnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getCondition().size() < i0+1) { familymemberhistory.addCondition(); }
				String[] arrayi1 = f.getFmlyMmbrHisCndtnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(familymemberhistory.getCondition().get(i0).getCode().getCoding().size() < i1+1) { familymemberhistory.getCondition().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {familymemberhistory.getCondition().get(i0).getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** FmlyMmbrHis_Cndtn_Cd_Cdg_Dsply ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnCdCdgDsply() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisCndtnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getCondition().size() < i0+1) { familymemberhistory.addCondition(); }
				String[] arrayi1 = f.getFmlyMmbrHisCndtnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(familymemberhistory.getCondition().get(i0).getCode().getCoding().size() < i1+1) { familymemberhistory.getCondition().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {familymemberhistory.getCondition().get(i0).getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** FmlyMmbrHis_Cndtn_Cd_Cdg_Sys ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnCdCdgSys() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisCndtnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getCondition().size() < i0+1) { familymemberhistory.addCondition(); }
				String[] arrayi1 = f.getFmlyMmbrHisCndtnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(familymemberhistory.getCondition().get(i0).getCode().getCoding().size() < i1+1) { familymemberhistory.getCondition().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {familymemberhistory.getCondition().get(i0).getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** FmlyMmbrHis_Cndtn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisCndtnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getCondition().size() < i0+1) { familymemberhistory.addCondition(); }
				String[] arrayi1 = f.getFmlyMmbrHisCndtnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(familymemberhistory.getCondition().get(i0).getCode().getCoding().size() < i1+1) { familymemberhistory.getCondition().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {familymemberhistory.getCondition().get(i0).getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** FmlyMmbrHis_Cndtn_Cd_Cdg_Vrsn ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnCdCdgVrsn() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisCndtnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getCondition().size() < i0+1) { familymemberhistory.addCondition(); }
				String[] arrayi1 = f.getFmlyMmbrHisCndtnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(familymemberhistory.getCondition().get(i0).getCode().getCoding().size() < i1+1) { familymemberhistory.getCondition().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {familymemberhistory.getCondition().get(i0).getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** FmlyMmbrHis_Cndtn_Cd_Txt ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnCdTxt() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisCndtnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getCondition().size() < i0+1) { familymemberhistory.addCondition(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getCondition().get(i0).getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** FmlyMmbrHis_Cndtn_ContributedToDeath ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnContributedToDeath() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisCndtnContributedToDeath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getCondition().size() < i0+1) { familymemberhistory.addCondition(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getCondition().get(i0).setContributedToDeath(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** FmlyMmbrHis_Cndtn_Nt_AthrRfrnc ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnNtAthrRfrnc() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisCndtnNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getCondition().size() < i0+1) { familymemberhistory.addCondition(); }
				String[] arrayi1 = f.getFmlyMmbrHisCndtnNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(familymemberhistory.getCondition().get(i0).getNote().size() < i1+1) { familymemberhistory.getCondition().get(i0).addNote(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {familymemberhistory.getCondition().get(i0).getNote().get(i1).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** FmlyMmbrHis_Cndtn_Nt_AthrStrgTyp ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnNtAthrStrgTyp() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisCndtnNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getCondition().size() < i0+1) { familymemberhistory.addCondition(); }
				String[] arrayi1 = f.getFmlyMmbrHisCndtnNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(familymemberhistory.getCondition().get(i0).getNote().size() < i1+1) { familymemberhistory.getCondition().get(i0).addNote(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {familymemberhistory.getCondition().get(i0).getNote().get(i1).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** FmlyMmbrHis_Cndtn_Nt_Txt ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnNtTxt() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisCndtnNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getCondition().size() < i0+1) { familymemberhistory.addCondition(); }
				String[] arrayi1 = f.getFmlyMmbrHisCndtnNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(familymemberhistory.getCondition().get(i0).getNote().size() < i1+1) { familymemberhistory.getCondition().get(i0).addNote(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {familymemberhistory.getCondition().get(i0).getNote().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** FmlyMmbrHis_Cndtn_Nt_Time ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnNtTime() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisCndtnNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getCondition().size() < i0+1) { familymemberhistory.addCondition(); }
				String[] arrayi1 = f.getFmlyMmbrHisCndtnNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(familymemberhistory.getCondition().get(i0).getNote().size() < i1+1) { familymemberhistory.getCondition().get(i0).addNote(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {familymemberhistory.getCondition().get(i0).getNote().get(i1).setTime(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** FmlyMmbrHis_Cndtn_OnAge_Cd ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOnAgeCd() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisCndtnOnAgeCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getCondition().size() < i0+1) { familymemberhistory.addCondition(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getCondition().get(i0).getOnsetAge().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** FmlyMmbrHis_Cndtn_OnAge_Cmprtr ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOnAgeCmprtr() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisCndtnOnAgeCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getCondition().size() < i0+1) { familymemberhistory.addCondition(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getCondition().get(i0).getOnsetAge().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** FmlyMmbrHis_Cndtn_OnAge_Sys ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOnAgeSys() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisCndtnOnAgeSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getCondition().size() < i0+1) { familymemberhistory.addCondition(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getCondition().get(i0).getOnsetAge().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** FmlyMmbrHis_Cndtn_OnAge_Unt ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOnAgeUnt() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisCndtnOnAgeUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getCondition().size() < i0+1) { familymemberhistory.addCondition(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getCondition().get(i0).getOnsetAge().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** FmlyMmbrHis_Cndtn_OnAge_Vl ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOnAgeVl() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisCndtnOnAgeVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getCondition().size() < i0+1) { familymemberhistory.addCondition(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getCondition().get(i0).getOnsetAge().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** FmlyMmbrHis_Cndtn_OnPrd_End ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOnPrdEnd() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisCndtnOnPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getCondition().size() < i0+1) { familymemberhistory.addCondition(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getCondition().get(i0).getOnsetPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** FmlyMmbrHis_Cndtn_OnPrd_Strt ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOnPrdStrt() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisCndtnOnPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getCondition().size() < i0+1) { familymemberhistory.addCondition(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getCondition().get(i0).getOnsetPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** FmlyMmbrHis_Cndtn_OnRng_Hi_Cd ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOnRngHiCd() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisCndtnOnRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getCondition().size() < i0+1) { familymemberhistory.addCondition(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getCondition().get(i0).getOnsetRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** FmlyMmbrHis_Cndtn_OnRng_Hi_Cmprtr ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOnRngHiCmprtr() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisCndtnOnRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getCondition().size() < i0+1) { familymemberhistory.addCondition(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getCondition().get(i0).getOnsetRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** FmlyMmbrHis_Cndtn_OnRng_Hi_Sys ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOnRngHiSys() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisCndtnOnRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getCondition().size() < i0+1) { familymemberhistory.addCondition(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getCondition().get(i0).getOnsetRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** FmlyMmbrHis_Cndtn_OnRng_Hi_Unt ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOnRngHiUnt() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisCndtnOnRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getCondition().size() < i0+1) { familymemberhistory.addCondition(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getCondition().get(i0).getOnsetRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** FmlyMmbrHis_Cndtn_OnRng_Hi_Vl ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOnRngHiVl() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisCndtnOnRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getCondition().size() < i0+1) { familymemberhistory.addCondition(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getCondition().get(i0).getOnsetRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** FmlyMmbrHis_Cndtn_OnRng_Lw_Cd ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOnRngLwCd() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisCndtnOnRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getCondition().size() < i0+1) { familymemberhistory.addCondition(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getCondition().get(i0).getOnsetRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** FmlyMmbrHis_Cndtn_OnRng_Lw_Cmprtr ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOnRngLwCmprtr() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisCndtnOnRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getCondition().size() < i0+1) { familymemberhistory.addCondition(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getCondition().get(i0).getOnsetRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** FmlyMmbrHis_Cndtn_OnRng_Lw_Sys ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOnRngLwSys() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisCndtnOnRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getCondition().size() < i0+1) { familymemberhistory.addCondition(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getCondition().get(i0).getOnsetRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** FmlyMmbrHis_Cndtn_OnRng_Lw_Unt ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOnRngLwUnt() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisCndtnOnRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getCondition().size() < i0+1) { familymemberhistory.addCondition(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getCondition().get(i0).getOnsetRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** FmlyMmbrHis_Cndtn_OnRng_Lw_Vl ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOnRngLwVl() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisCndtnOnRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getCondition().size() < i0+1) { familymemberhistory.addCondition(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getCondition().get(i0).getOnsetRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** FmlyMmbrHis_Cndtn_OnStrgTyp ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOnStrgTyp() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisCndtnOnStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getCondition().size() < i0+1) { familymemberhistory.addCondition(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getCondition().get(i0).setOnset(new org.hl7.fhir.r4.model.StringType( arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** FmlyMmbrHis_Cndtn_Outcome_Cdg_Cd ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOutcomeCdgCd() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisCndtnOutcomeCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getCondition().size() < i0+1) { familymemberhistory.addCondition(); }
				String[] arrayi1 = f.getFmlyMmbrHisCndtnOutcomeCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(familymemberhistory.getCondition().get(i0).getOutcome().getCoding().size() < i1+1) { familymemberhistory.getCondition().get(i0).getOutcome().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {familymemberhistory.getCondition().get(i0).getOutcome().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** FmlyMmbrHis_Cndtn_Outcome_Cdg_Dsply ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOutcomeCdgDsply() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisCndtnOutcomeCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getCondition().size() < i0+1) { familymemberhistory.addCondition(); }
				String[] arrayi1 = f.getFmlyMmbrHisCndtnOutcomeCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(familymemberhistory.getCondition().get(i0).getOutcome().getCoding().size() < i1+1) { familymemberhistory.getCondition().get(i0).getOutcome().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {familymemberhistory.getCondition().get(i0).getOutcome().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** FmlyMmbrHis_Cndtn_Outcome_Cdg_Sys ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOutcomeCdgSys() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisCndtnOutcomeCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getCondition().size() < i0+1) { familymemberhistory.addCondition(); }
				String[] arrayi1 = f.getFmlyMmbrHisCndtnOutcomeCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(familymemberhistory.getCondition().get(i0).getOutcome().getCoding().size() < i1+1) { familymemberhistory.getCondition().get(i0).getOutcome().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {familymemberhistory.getCondition().get(i0).getOutcome().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** FmlyMmbrHis_Cndtn_Outcome_Cdg_UsrSltd ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOutcomeCdgUsrSltd() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisCndtnOutcomeCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getCondition().size() < i0+1) { familymemberhistory.addCondition(); }
				String[] arrayi1 = f.getFmlyMmbrHisCndtnOutcomeCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(familymemberhistory.getCondition().get(i0).getOutcome().getCoding().size() < i1+1) { familymemberhistory.getCondition().get(i0).getOutcome().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {familymemberhistory.getCondition().get(i0).getOutcome().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** FmlyMmbrHis_Cndtn_Outcome_Cdg_Vrsn ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOutcomeCdgVrsn() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisCndtnOutcomeCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getCondition().size() < i0+1) { familymemberhistory.addCondition(); }
				String[] arrayi1 = f.getFmlyMmbrHisCndtnOutcomeCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(familymemberhistory.getCondition().get(i0).getOutcome().getCoding().size() < i1+1) { familymemberhistory.getCondition().get(i0).getOutcome().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {familymemberhistory.getCondition().get(i0).getOutcome().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** FmlyMmbrHis_Cndtn_Outcome_Txt ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOutcomeTxt() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisCndtnOutcomeTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getCondition().size() < i0+1) { familymemberhistory.addCondition(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getCondition().get(i0).getOutcome().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** FmlyMmbrHis_DataAbsentRsn_Cdg_Cd ********************************************************************************/
		if(f.getFmlyMmbrHisDataAbsentRsnCdgCd() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisDataAbsentRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getDataAbsentReason().getCoding().size() < i0+1) { familymemberhistory.getDataAbsentReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getDataAbsentReason().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** FmlyMmbrHis_DataAbsentRsn_Cdg_Dsply ********************************************************************************/
		if(f.getFmlyMmbrHisDataAbsentRsnCdgDsply() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisDataAbsentRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getDataAbsentReason().getCoding().size() < i0+1) { familymemberhistory.getDataAbsentReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getDataAbsentReason().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** FmlyMmbrHis_DataAbsentRsn_Cdg_Sys ********************************************************************************/
		if(f.getFmlyMmbrHisDataAbsentRsnCdgSys() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisDataAbsentRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getDataAbsentReason().getCoding().size() < i0+1) { familymemberhistory.getDataAbsentReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getDataAbsentReason().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** FmlyMmbrHis_DataAbsentRsn_Cdg_UsrSltd ********************************************************************************/
		if(f.getFmlyMmbrHisDataAbsentRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisDataAbsentRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getDataAbsentReason().getCoding().size() < i0+1) { familymemberhistory.getDataAbsentReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getDataAbsentReason().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** FmlyMmbrHis_DataAbsentRsn_Cdg_Vrsn ********************************************************************************/
		if(f.getFmlyMmbrHisDataAbsentRsnCdgVrsn() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisDataAbsentRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getDataAbsentReason().getCoding().size() < i0+1) { familymemberhistory.getDataAbsentReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getDataAbsentReason().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** FmlyMmbrHis_DataAbsentRsn_Txt ********************************************************************************/
		if(f.getFmlyMmbrHisDataAbsentRsnTxt() != null ) {

			if(f.getFmlyMmbrHisDataAbsentRsnTxt().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisDataAbsentRsnTxt()==null) {} else {
			familymemberhistory.getDataAbsentReason().setText(f.getFmlyMmbrHisDataAbsentRsnTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** FmlyMmbrHis_Dt ********************************************************************************/
		if(f.getFmlyMmbrHisDt() != null ) {

			if(f.getFmlyMmbrHisDt().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisDt()==null) {} else {
			familymemberhistory.setDate(f.getFmlyMmbrHisDt().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(f.getFmlyMmbrHisDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** FmlyMmbrHis_DeceasedAge_Cd ********************************************************************************/
		if(f.getFmlyMmbrHisDeceasedAgeCd() != null ) {

			if(f.getFmlyMmbrHisDeceasedAgeCd().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisDeceasedAgeCd()==null) {} else {
			familymemberhistory.getDeceasedAge().setCode(f.getFmlyMmbrHisDeceasedAgeCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** FmlyMmbrHis_DeceasedAge_Cmprtr ********************************************************************************/
		if(f.getFmlyMmbrHisDeceasedAgeCmprtr() != null ) {

			if(f.getFmlyMmbrHisDeceasedAgeCmprtr().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisDeceasedAgeCmprtr()==null) {} else {
			familymemberhistory.getDeceasedAge().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(f.getFmlyMmbrHisDeceasedAgeCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** FmlyMmbrHis_DeceasedAge_Sys ********************************************************************************/
		if(f.getFmlyMmbrHisDeceasedAgeSys() != null ) {

			if(f.getFmlyMmbrHisDeceasedAgeSys().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisDeceasedAgeSys()==null) {} else {
			familymemberhistory.getDeceasedAge().setSystem(f.getFmlyMmbrHisDeceasedAgeSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** FmlyMmbrHis_DeceasedAge_Unt ********************************************************************************/
		if(f.getFmlyMmbrHisDeceasedAgeUnt() != null ) {

			if(f.getFmlyMmbrHisDeceasedAgeUnt().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisDeceasedAgeUnt()==null) {} else {
			familymemberhistory.getDeceasedAge().setUnit(f.getFmlyMmbrHisDeceasedAgeUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** FmlyMmbrHis_DeceasedAge_Vl ********************************************************************************/
		if(f.getFmlyMmbrHisDeceasedAgeVl() != null ) {

			if(f.getFmlyMmbrHisDeceasedAgeVl().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisDeceasedAgeVl()==null) {} else {
			familymemberhistory.getDeceasedAge().setValue((new java.math.BigDecimal((f.getFmlyMmbrHisDeceasedAgeVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** FmlyMmbrHis_DeceasedBooleanTyp ********************************************************************************/
		if(f.getFmlyMmbrHisDeceasedBooleanTyp() != null ) {

			if(f.getFmlyMmbrHisDeceasedBooleanTyp().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisDeceasedBooleanTyp()==null) {} else {
			familymemberhistory.setDeceased(new org.hl7.fhir.r4.model.BooleanType(f.getFmlyMmbrHisDeceasedBooleanTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** FmlyMmbrHis_DeceasedDtTyp ********************************************************************************/
		if(f.getFmlyMmbrHisDeceasedDtTyp() != null ) {

			if(f.getFmlyMmbrHisDeceasedDtTyp().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisDeceasedDtTyp()==null) {} else {
			familymemberhistory.setDeceased(new org.hl7.fhir.r4.model.DateType(f.getFmlyMmbrHisDeceasedDtTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** FmlyMmbrHis_DeceasedRng_Hi_Cd ********************************************************************************/
		if(f.getFmlyMmbrHisDeceasedRngHiCd() != null ) {

			if(f.getFmlyMmbrHisDeceasedRngHiCd().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisDeceasedRngHiCd()==null) {} else {
			familymemberhistory.getDeceasedRange().getHigh().setCode(f.getFmlyMmbrHisDeceasedRngHiCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** FmlyMmbrHis_DeceasedRng_Hi_Cmprtr ********************************************************************************/
		if(f.getFmlyMmbrHisDeceasedRngHiCmprtr() != null ) {

			if(f.getFmlyMmbrHisDeceasedRngHiCmprtr().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisDeceasedRngHiCmprtr()==null) {} else {
			familymemberhistory.getDeceasedRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(f.getFmlyMmbrHisDeceasedRngHiCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** FmlyMmbrHis_DeceasedRng_Hi_Sys ********************************************************************************/
		if(f.getFmlyMmbrHisDeceasedRngHiSys() != null ) {

			if(f.getFmlyMmbrHisDeceasedRngHiSys().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisDeceasedRngHiSys()==null) {} else {
			familymemberhistory.getDeceasedRange().getHigh().setSystem(f.getFmlyMmbrHisDeceasedRngHiSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** FmlyMmbrHis_DeceasedRng_Hi_Unt ********************************************************************************/
		if(f.getFmlyMmbrHisDeceasedRngHiUnt() != null ) {

			if(f.getFmlyMmbrHisDeceasedRngHiUnt().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisDeceasedRngHiUnt()==null) {} else {
			familymemberhistory.getDeceasedRange().getHigh().setUnit(f.getFmlyMmbrHisDeceasedRngHiUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** FmlyMmbrHis_DeceasedRng_Hi_Vl ********************************************************************************/
		if(f.getFmlyMmbrHisDeceasedRngHiVl() != null ) {

			if(f.getFmlyMmbrHisDeceasedRngHiVl().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisDeceasedRngHiVl()==null) {} else {
			familymemberhistory.getDeceasedRange().getHigh().setValue((new java.math.BigDecimal((f.getFmlyMmbrHisDeceasedRngHiVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** FmlyMmbrHis_DeceasedRng_Lw_Cd ********************************************************************************/
		if(f.getFmlyMmbrHisDeceasedRngLwCd() != null ) {

			if(f.getFmlyMmbrHisDeceasedRngLwCd().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisDeceasedRngLwCd()==null) {} else {
			familymemberhistory.getDeceasedRange().getLow().setCode(f.getFmlyMmbrHisDeceasedRngLwCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** FmlyMmbrHis_DeceasedRng_Lw_Cmprtr ********************************************************************************/
		if(f.getFmlyMmbrHisDeceasedRngLwCmprtr() != null ) {

			if(f.getFmlyMmbrHisDeceasedRngLwCmprtr().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisDeceasedRngLwCmprtr()==null) {} else {
			familymemberhistory.getDeceasedRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(f.getFmlyMmbrHisDeceasedRngLwCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** FmlyMmbrHis_DeceasedRng_Lw_Sys ********************************************************************************/
		if(f.getFmlyMmbrHisDeceasedRngLwSys() != null ) {

			if(f.getFmlyMmbrHisDeceasedRngLwSys().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisDeceasedRngLwSys()==null) {} else {
			familymemberhistory.getDeceasedRange().getLow().setSystem(f.getFmlyMmbrHisDeceasedRngLwSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** FmlyMmbrHis_DeceasedRng_Lw_Unt ********************************************************************************/
		if(f.getFmlyMmbrHisDeceasedRngLwUnt() != null ) {

			if(f.getFmlyMmbrHisDeceasedRngLwUnt().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisDeceasedRngLwUnt()==null) {} else {
			familymemberhistory.getDeceasedRange().getLow().setUnit(f.getFmlyMmbrHisDeceasedRngLwUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** FmlyMmbrHis_DeceasedRng_Lw_Vl ********************************************************************************/
		if(f.getFmlyMmbrHisDeceasedRngLwVl() != null ) {

			if(f.getFmlyMmbrHisDeceasedRngLwVl().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisDeceasedRngLwVl()==null) {} else {
			familymemberhistory.getDeceasedRange().getLow().setValue((new java.math.BigDecimal((f.getFmlyMmbrHisDeceasedRngLwVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** FmlyMmbrHis_DeceasedStrgTyp ********************************************************************************/
		if(f.getFmlyMmbrHisDeceasedStrgTyp() != null ) {

			if(f.getFmlyMmbrHisDeceasedStrgTyp().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisDeceasedStrgTyp()==null) {} else {
			familymemberhistory.setDeceased(new org.hl7.fhir.r4.model.StringType(f.getFmlyMmbrHisDeceasedStrgTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** FmlyMmbrHis_EstmtdAge ********************************************************************************/
		if(f.getFmlyMmbrHisEstmtdAge() != null ) {

			if(f.getFmlyMmbrHisEstmtdAge().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisEstmtdAge()==null) {} else {
			familymemberhistory.setEstimatedAge(Boolean.parseBoolean(f.getFmlyMmbrHisEstmtdAge().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** FmlyMmbrHis_Id_Assigner ********************************************************************************/
		if(f.getFmlyMmbrHisIdAssigner() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getIdentifier().size() < i0+1) { familymemberhistory.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** FmlyMmbrHis_Id_Prd_End ********************************************************************************/
		if(f.getFmlyMmbrHisIdPrdEnd() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getIdentifier().size() < i0+1) { familymemberhistory.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** FmlyMmbrHis_Id_Prd_Strt ********************************************************************************/
		if(f.getFmlyMmbrHisIdPrdStrt() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getIdentifier().size() < i0+1) { familymemberhistory.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** FmlyMmbrHis_Id_Sys ********************************************************************************/
		if(f.getFmlyMmbrHisIdSys() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getIdentifier().size() < i0+1) { familymemberhistory.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** FmlyMmbrHis_Id_Typ_Cdg_Cd ********************************************************************************/
		if(f.getFmlyMmbrHisIdTypCdgCd() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getIdentifier().size() < i0+1) { familymemberhistory.addIdentifier(); }
				String[] arrayi1 = f.getFmlyMmbrHisIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(familymemberhistory.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { familymemberhistory.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {familymemberhistory.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** FmlyMmbrHis_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(f.getFmlyMmbrHisIdTypCdgDsply() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getIdentifier().size() < i0+1) { familymemberhistory.addIdentifier(); }
				String[] arrayi1 = f.getFmlyMmbrHisIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(familymemberhistory.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { familymemberhistory.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {familymemberhistory.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** FmlyMmbrHis_Id_Typ_Cdg_Sys ********************************************************************************/
		if(f.getFmlyMmbrHisIdTypCdgSys() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getIdentifier().size() < i0+1) { familymemberhistory.addIdentifier(); }
				String[] arrayi1 = f.getFmlyMmbrHisIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(familymemberhistory.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { familymemberhistory.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {familymemberhistory.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** FmlyMmbrHis_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(f.getFmlyMmbrHisIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getIdentifier().size() < i0+1) { familymemberhistory.addIdentifier(); }
				String[] arrayi1 = f.getFmlyMmbrHisIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(familymemberhistory.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { familymemberhistory.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {familymemberhistory.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** FmlyMmbrHis_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(f.getFmlyMmbrHisIdTypCdgVrsn() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getIdentifier().size() < i0+1) { familymemberhistory.addIdentifier(); }
				String[] arrayi1 = f.getFmlyMmbrHisIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(familymemberhistory.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { familymemberhistory.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {familymemberhistory.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** FmlyMmbrHis_Id_Typ_Txt ********************************************************************************/
		if(f.getFmlyMmbrHisIdTypTxt() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getIdentifier().size() < i0+1) { familymemberhistory.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** FmlyMmbrHis_Id_Use ********************************************************************************/
		if(f.getFmlyMmbrHisIdUse() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getIdentifier().size() < i0+1) { familymemberhistory.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** FmlyMmbrHis_Id_Vl ********************************************************************************/
		if(f.getFmlyMmbrHisIdVl() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getIdentifier().size() < i0+1) { familymemberhistory.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** FmlyMmbrHis_InstantiatesCanonical ********************************************************************************/
		if(f.getFmlyMmbrHisInstantiatesCanonical() != null ) {

				for( String currListStrSplit : f.getFmlyMmbrHisInstantiatesCanonical().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			familymemberhistory.addInstantiatesCanonical(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** FmlyMmbrHis_InstantiatesUri ********************************************************************************/
		if(f.getFmlyMmbrHisInstantiatesUri() != null ) {

				for( String currListStrSplit : f.getFmlyMmbrHisInstantiatesUri().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			familymemberhistory.addInstantiatesUri(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** FmlyMmbrHis_Nm ********************************************************************************/
		if(f.getFmlyMmbrHisNm() != null ) {

			if(f.getFmlyMmbrHisNm().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisNm()==null) {} else {
			familymemberhistory.setName(f.getFmlyMmbrHisNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** FmlyMmbrHis_Nt_AthrRfrnc ********************************************************************************/
		if(f.getFmlyMmbrHisNtAthrRfrnc() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getNote().size() < i0+1) { familymemberhistory.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** FmlyMmbrHis_Nt_AthrStrgTyp ********************************************************************************/
		if(f.getFmlyMmbrHisNtAthrStrgTyp() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getNote().size() < i0+1) { familymemberhistory.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** FmlyMmbrHis_Nt_Txt ********************************************************************************/
		if(f.getFmlyMmbrHisNtTxt() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getNote().size() < i0+1) { familymemberhistory.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** FmlyMmbrHis_Nt_Time ********************************************************************************/
		if(f.getFmlyMmbrHisNtTime() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getNote().size() < i0+1) { familymemberhistory.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** FmlyMmbrHis_Pnt ********************************************************************************/
		if(f.getFmlyMmbrHisPnt() != null ) {

			if(f.getFmlyMmbrHisPnt().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisPnt()==null) {} else {
			familymemberhistory.setPatient(new org.hl7.fhir.r4.model.Reference(f.getFmlyMmbrHisPnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** FmlyMmbrHis_RsnCd_Cdg_Cd ********************************************************************************/
		if(f.getFmlyMmbrHisRsnCdCdgCd() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getReasonCode().size() < i0+1) { familymemberhistory.addReasonCode(); }
				String[] arrayi1 = f.getFmlyMmbrHisRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(familymemberhistory.getReasonCode().get(i0).getCoding().size() < i1+1) { familymemberhistory.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {familymemberhistory.getReasonCode().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** FmlyMmbrHis_RsnCd_Cdg_Dsply ********************************************************************************/
		if(f.getFmlyMmbrHisRsnCdCdgDsply() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getReasonCode().size() < i0+1) { familymemberhistory.addReasonCode(); }
				String[] arrayi1 = f.getFmlyMmbrHisRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(familymemberhistory.getReasonCode().get(i0).getCoding().size() < i1+1) { familymemberhistory.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {familymemberhistory.getReasonCode().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** FmlyMmbrHis_RsnCd_Cdg_Sys ********************************************************************************/
		if(f.getFmlyMmbrHisRsnCdCdgSys() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getReasonCode().size() < i0+1) { familymemberhistory.addReasonCode(); }
				String[] arrayi1 = f.getFmlyMmbrHisRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(familymemberhistory.getReasonCode().get(i0).getCoding().size() < i1+1) { familymemberhistory.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {familymemberhistory.getReasonCode().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** FmlyMmbrHis_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(f.getFmlyMmbrHisRsnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getReasonCode().size() < i0+1) { familymemberhistory.addReasonCode(); }
				String[] arrayi1 = f.getFmlyMmbrHisRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(familymemberhistory.getReasonCode().get(i0).getCoding().size() < i1+1) { familymemberhistory.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {familymemberhistory.getReasonCode().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** FmlyMmbrHis_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(f.getFmlyMmbrHisRsnCdCdgVrsn() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getReasonCode().size() < i0+1) { familymemberhistory.addReasonCode(); }
				String[] arrayi1 = f.getFmlyMmbrHisRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(familymemberhistory.getReasonCode().get(i0).getCoding().size() < i1+1) { familymemberhistory.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {familymemberhistory.getReasonCode().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** FmlyMmbrHis_RsnCd_Txt ********************************************************************************/
		if(f.getFmlyMmbrHisRsnCdTxt() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisRsnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getReasonCode().size() < i0+1) { familymemberhistory.addReasonCode(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getReasonCode().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** FmlyMmbrHis_RsnRfrnc ********************************************************************************/
		if(f.getFmlyMmbrHisRsnRfrnc() != null ) {

				for( String currListStrSplit : f.getFmlyMmbrHisRsnRfrnc().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			familymemberhistory.addReasonReference(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** FmlyMmbrHis_Rltnship_Cdg_Cd ********************************************************************************/
		if(f.getFmlyMmbrHisRltnshipCdgCd() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisRltnshipCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getRelationship().getCoding().size() < i0+1) { familymemberhistory.getRelationship().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getRelationship().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** FmlyMmbrHis_Rltnship_Cdg_Dsply ********************************************************************************/
		if(f.getFmlyMmbrHisRltnshipCdgDsply() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisRltnshipCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getRelationship().getCoding().size() < i0+1) { familymemberhistory.getRelationship().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getRelationship().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** FmlyMmbrHis_Rltnship_Cdg_Sys ********************************************************************************/
		if(f.getFmlyMmbrHisRltnshipCdgSys() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisRltnshipCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getRelationship().getCoding().size() < i0+1) { familymemberhistory.getRelationship().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getRelationship().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** FmlyMmbrHis_Rltnship_Cdg_UsrSltd ********************************************************************************/
		if(f.getFmlyMmbrHisRltnshipCdgUsrSltd() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisRltnshipCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getRelationship().getCoding().size() < i0+1) { familymemberhistory.getRelationship().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getRelationship().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** FmlyMmbrHis_Rltnship_Cdg_Vrsn ********************************************************************************/
		if(f.getFmlyMmbrHisRltnshipCdgVrsn() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisRltnshipCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getRelationship().getCoding().size() < i0+1) { familymemberhistory.getRelationship().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getRelationship().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** FmlyMmbrHis_Rltnship_Txt ********************************************************************************/
		if(f.getFmlyMmbrHisRltnshipTxt() != null ) {

			if(f.getFmlyMmbrHisRltnshipTxt().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisRltnshipTxt()==null) {} else {
			familymemberhistory.getRelationship().setText(f.getFmlyMmbrHisRltnshipTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** FmlyMmbrHis_Sex_Cdg_Cd ********************************************************************************/
		if(f.getFmlyMmbrHisSexCdgCd() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisSexCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getSex().getCoding().size() < i0+1) { familymemberhistory.getSex().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getSex().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** FmlyMmbrHis_Sex_Cdg_Dsply ********************************************************************************/
		if(f.getFmlyMmbrHisSexCdgDsply() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisSexCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getSex().getCoding().size() < i0+1) { familymemberhistory.getSex().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getSex().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** FmlyMmbrHis_Sex_Cdg_Sys ********************************************************************************/
		if(f.getFmlyMmbrHisSexCdgSys() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisSexCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getSex().getCoding().size() < i0+1) { familymemberhistory.getSex().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getSex().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** FmlyMmbrHis_Sex_Cdg_UsrSltd ********************************************************************************/
		if(f.getFmlyMmbrHisSexCdgUsrSltd() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisSexCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getSex().getCoding().size() < i0+1) { familymemberhistory.getSex().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getSex().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** FmlyMmbrHis_Sex_Cdg_Vrsn ********************************************************************************/
		if(f.getFmlyMmbrHisSexCdgVrsn() != null ) {

			String[] arrayi0 = f.getFmlyMmbrHisSexCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(familymemberhistory.getSex().getCoding().size() < i0+1) { familymemberhistory.getSex().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {familymemberhistory.getSex().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** FmlyMmbrHis_Sex_Txt ********************************************************************************/
		if(f.getFmlyMmbrHisSexTxt() != null ) {

			if(f.getFmlyMmbrHisSexTxt().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisSexTxt()==null) {} else {
			familymemberhistory.getSex().setText(f.getFmlyMmbrHisSexTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** FmlyMmbrHis_Sts ********************************************************************************/
		if(f.getFmlyMmbrHisSts() != null ) {

			if(f.getFmlyMmbrHisSts().replace("[","").replace("]","").equals("NULL") | f.getFmlyMmbrHisSts()==null) {} else {
			familymemberhistory.setStatus(new org.hl7.fhir.r4.model.FamilyMemberHistory.FamilyHistoryStatusEnumFactory().fromCode(f.getFmlyMmbrHisSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return familymemberhistory;
	}
}
