package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.EffectEvidenceSynthesis;
public class EffectEvidenceSynthesisConversion 
{
	public org.hl7.fhir.r4.model.EffectEvidenceSynthesis EffectEvidenceSynthesiss(EffectEvidenceSynthesis e) throws ParseException
	{
		org.hl7.fhir.r4.model.EffectEvidenceSynthesis effectevidencesynthesis = new org.hl7.fhir.r4.model.EffectEvidenceSynthesis();

		/******************** id ********************************************************************************/
		effectevidencesynthesis.setId(e.getId());

		/******************** EfctEvdnceSynths_ApprovalDt ********************************************************************************/
		if(e.getEfctEvdnceSynthsApprovalDt() != null ) {

			if(e.getEfctEvdnceSynthsApprovalDt().replace("[","").replace("]","").equals("NULL") | e.getEfctEvdnceSynthsApprovalDt()==null) {} else {
			effectevidencesynthesis.setApprovalDate(e.getEfctEvdnceSynthsApprovalDt().replace("[","").replace("]","").equals("NULL") | e.getEfctEvdnceSynthsApprovalDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getEfctEvdnceSynthsApprovalDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EfctEvdnceSynths_Athr_Nm ********************************************************************************/
		if(e.getEfctEvdnceSynthsAthrNm() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsAthrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getAuthor().size() < i0+1) { effectevidencesynthesis.addAuthor(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getAuthor().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_Athr_Tlcm_Prd_End ********************************************************************************/
		if(e.getEfctEvdnceSynthsAthrTlcmPrdEnd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsAthrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getAuthor().size() < i0+1) { effectevidencesynthesis.addAuthor(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsAthrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getAuthor().get(i0).getTelecom().size() < i1+1) { effectevidencesynthesis.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getAuthor().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEfctEvdnceSynthsAthrTlcmPrdStrt() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsAthrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getAuthor().size() < i0+1) { effectevidencesynthesis.addAuthor(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsAthrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getAuthor().get(i0).getTelecom().size() < i1+1) { effectevidencesynthesis.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getAuthor().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Athr_Tlcm_Rnk ********************************************************************************/
		if(e.getEfctEvdnceSynthsAthrTlcmRnk() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsAthrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getAuthor().size() < i0+1) { effectevidencesynthesis.addAuthor(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsAthrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getAuthor().get(i0).getTelecom().size() < i1+1) { effectevidencesynthesis.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getAuthor().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Athr_Tlcm_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsAthrTlcmSys() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsAthrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getAuthor().size() < i0+1) { effectevidencesynthesis.addAuthor(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsAthrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getAuthor().get(i0).getTelecom().size() < i1+1) { effectevidencesynthesis.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getAuthor().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Athr_Tlcm_Use ********************************************************************************/
		if(e.getEfctEvdnceSynthsAthrTlcmUse() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsAthrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getAuthor().size() < i0+1) { effectevidencesynthesis.addAuthor(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsAthrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getAuthor().get(i0).getTelecom().size() < i1+1) { effectevidencesynthesis.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getAuthor().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Athr_Tlcm_Vl ********************************************************************************/
		if(e.getEfctEvdnceSynthsAthrTlcmVl() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsAthrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getAuthor().size() < i0+1) { effectevidencesynthesis.addAuthor(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsAthrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getAuthor().get(i0).getTelecom().size() < i1+1) { effectevidencesynthesis.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getAuthor().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_AthrRfrnc ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentNtAthrRfrnc() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getCertainty().size() < i0+1) { effectevidencesynthesis.addCertainty(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().size() < i1+1) { effectevidencesynthesis.getCertainty().get(i0).addCertaintySubcomponent(); }
					String[] arrayi2 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getNote().size() < i2+1) { effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).addNote(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getNote().get(i2).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_AthrStrgTyp ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentNtAthrStrgTyp() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getCertainty().size() < i0+1) { effectevidencesynthesis.addCertainty(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().size() < i1+1) { effectevidencesynthesis.getCertainty().get(i0).addCertaintySubcomponent(); }
					String[] arrayi2 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getNote().size() < i2+1) { effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).addNote(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getNote().get(i2).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_Txt ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentNtTxt() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getCertainty().size() < i0+1) { effectevidencesynthesis.addCertainty(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().size() < i1+1) { effectevidencesynthesis.getCertainty().get(i0).addCertaintySubcomponent(); }
					String[] arrayi2 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getNote().size() < i2+1) { effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).addNote(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getNote().get(i2).setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_Time ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentNtTime() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getCertainty().size() < i0+1) { effectevidencesynthesis.addCertainty(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().size() < i1+1) { effectevidencesynthesis.getCertainty().get(i0).addCertaintySubcomponent(); }
					String[] arrayi2 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getNote().size() < i2+1) { effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).addNote(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getNote().get(i2).setTime(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi2[i2].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_Cd ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgCd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getCertainty().size() < i0+1) { effectevidencesynthesis.addCertainty(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().size() < i1+1) { effectevidencesynthesis.getCertainty().get(i0).addCertaintySubcomponent(); }
					String[] arrayi2 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().size() < i2+1) { effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).addRating(); }
						String[] arrayi3 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().get(i2).getCoding().size() < i3+1) { effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().get(i2).getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_Dsply ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgDsply() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getCertainty().size() < i0+1) { effectevidencesynthesis.addCertainty(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().size() < i1+1) { effectevidencesynthesis.getCertainty().get(i0).addCertaintySubcomponent(); }
					String[] arrayi2 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().size() < i2+1) { effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).addRating(); }
						String[] arrayi3 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().get(i2).getCoding().size() < i3+1) { effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().get(i2).getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgSys() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getCertainty().size() < i0+1) { effectevidencesynthesis.addCertainty(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().size() < i1+1) { effectevidencesynthesis.getCertainty().get(i0).addCertaintySubcomponent(); }
					String[] arrayi2 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().size() < i2+1) { effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).addRating(); }
						String[] arrayi3 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().get(i2).getCoding().size() < i3+1) { effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().get(i2).getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_UsrSltd ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getCertainty().size() < i0+1) { effectevidencesynthesis.addCertainty(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().size() < i1+1) { effectevidencesynthesis.getCertainty().get(i0).addCertaintySubcomponent(); }
					String[] arrayi2 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().size() < i2+1) { effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).addRating(); }
						String[] arrayi3 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().get(i2).getCoding().size() < i3+1) { effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().get(i2).getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_Vrsn ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgVrsn() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getCertainty().size() < i0+1) { effectevidencesynthesis.addCertainty(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().size() < i1+1) { effectevidencesynthesis.getCertainty().get(i0).addCertaintySubcomponent(); }
					String[] arrayi2 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().size() < i2+1) { effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).addRating(); }
						String[] arrayi3 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().get(i2).getCoding().size() < i3+1) { effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().get(i2).getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Txt ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingTxt() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getCertainty().size() < i0+1) { effectevidencesynthesis.addCertainty(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().size() < i1+1) { effectevidencesynthesis.getCertainty().get(i0).addCertaintySubcomponent(); }
					String[] arrayi2 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentRatingTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().size() < i2+1) { effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).addRating(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().get(i2).setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_Cd ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgCd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getCertainty().size() < i0+1) { effectevidencesynthesis.addCertainty(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().size() < i1+1) { effectevidencesynthesis.getCertainty().get(i0).addCertaintySubcomponent(); }
					String[] arrayi2 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getType().getCoding().size() < i2+1) { effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getType().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgDsply() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getCertainty().size() < i0+1) { effectevidencesynthesis.addCertainty(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().size() < i1+1) { effectevidencesynthesis.getCertainty().get(i0).addCertaintySubcomponent(); }
					String[] arrayi2 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getType().getCoding().size() < i2+1) { effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getType().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgSys() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getCertainty().size() < i0+1) { effectevidencesynthesis.addCertainty(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().size() < i1+1) { effectevidencesynthesis.getCertainty().get(i0).addCertaintySubcomponent(); }
					String[] arrayi2 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getType().getCoding().size() < i2+1) { effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getType().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getCertainty().size() < i0+1) { effectevidencesynthesis.addCertainty(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().size() < i1+1) { effectevidencesynthesis.getCertainty().get(i0).addCertaintySubcomponent(); }
					String[] arrayi2 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getType().getCoding().size() < i2+1) { effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getType().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgVrsn() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getCertainty().size() < i0+1) { effectevidencesynthesis.addCertainty(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().size() < i1+1) { effectevidencesynthesis.getCertainty().get(i0).addCertaintySubcomponent(); }
					String[] arrayi2 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getType().getCoding().size() < i2+1) { effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getType().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EfctEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Txt ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentTypTxt() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getCertainty().size() < i0+1) { effectevidencesynthesis.addCertainty(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsCrtntyCrtntySubcomponentTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().size() < i1+1) { effectevidencesynthesis.getCertainty().get(i0).addCertaintySubcomponent(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getType().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Crtnty_Nt_AthrRfrnc ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyNtAthrRfrnc() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsCrtntyNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getCertainty().size() < i0+1) { effectevidencesynthesis.addCertainty(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsCrtntyNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getCertainty().get(i0).getNote().size() < i1+1) { effectevidencesynthesis.getCertainty().get(i0).addNote(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getCertainty().get(i0).getNote().get(i1).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Crtnty_Nt_AthrStrgTyp ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyNtAthrStrgTyp() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsCrtntyNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getCertainty().size() < i0+1) { effectevidencesynthesis.addCertainty(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsCrtntyNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getCertainty().get(i0).getNote().size() < i1+1) { effectevidencesynthesis.getCertainty().get(i0).addNote(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getCertainty().get(i0).getNote().get(i1).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Crtnty_Nt_Txt ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyNtTxt() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsCrtntyNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getCertainty().size() < i0+1) { effectevidencesynthesis.addCertainty(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsCrtntyNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getCertainty().get(i0).getNote().size() < i1+1) { effectevidencesynthesis.getCertainty().get(i0).addNote(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getCertainty().get(i0).getNote().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Crtnty_Nt_Time ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyNtTime() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsCrtntyNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getCertainty().size() < i0+1) { effectevidencesynthesis.addCertainty(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsCrtntyNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getCertainty().get(i0).getNote().size() < i1+1) { effectevidencesynthesis.getCertainty().get(i0).addNote(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getCertainty().get(i0).getNote().get(i1).setTime(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Crtnty_Rating_Cdg_Cd ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyRatingCdgCd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsCrtntyRatingCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getCertainty().size() < i0+1) { effectevidencesynthesis.addCertainty(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsCrtntyRatingCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getCertainty().get(i0).getRating().size() < i1+1) { effectevidencesynthesis.getCertainty().get(i0).addRating(); }
					String[] arrayi2 = e.getEfctEvdnceSynthsCrtntyRatingCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(effectevidencesynthesis.getCertainty().get(i0).getRating().get(i1).getCoding().size() < i2+1) { effectevidencesynthesis.getCertainty().get(i0).getRating().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {effectevidencesynthesis.getCertainty().get(i0).getRating().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EfctEvdnceSynths_Crtnty_Rating_Cdg_Dsply ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyRatingCdgDsply() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsCrtntyRatingCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getCertainty().size() < i0+1) { effectevidencesynthesis.addCertainty(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsCrtntyRatingCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getCertainty().get(i0).getRating().size() < i1+1) { effectevidencesynthesis.getCertainty().get(i0).addRating(); }
					String[] arrayi2 = e.getEfctEvdnceSynthsCrtntyRatingCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(effectevidencesynthesis.getCertainty().get(i0).getRating().get(i1).getCoding().size() < i2+1) { effectevidencesynthesis.getCertainty().get(i0).getRating().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {effectevidencesynthesis.getCertainty().get(i0).getRating().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EfctEvdnceSynths_Crtnty_Rating_Cdg_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyRatingCdgSys() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsCrtntyRatingCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getCertainty().size() < i0+1) { effectevidencesynthesis.addCertainty(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsCrtntyRatingCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getCertainty().get(i0).getRating().size() < i1+1) { effectevidencesynthesis.getCertainty().get(i0).addRating(); }
					String[] arrayi2 = e.getEfctEvdnceSynthsCrtntyRatingCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(effectevidencesynthesis.getCertainty().get(i0).getRating().get(i1).getCoding().size() < i2+1) { effectevidencesynthesis.getCertainty().get(i0).getRating().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {effectevidencesynthesis.getCertainty().get(i0).getRating().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EfctEvdnceSynths_Crtnty_Rating_Cdg_UsrSltd ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyRatingCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsCrtntyRatingCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getCertainty().size() < i0+1) { effectevidencesynthesis.addCertainty(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsCrtntyRatingCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getCertainty().get(i0).getRating().size() < i1+1) { effectevidencesynthesis.getCertainty().get(i0).addRating(); }
					String[] arrayi2 = e.getEfctEvdnceSynthsCrtntyRatingCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(effectevidencesynthesis.getCertainty().get(i0).getRating().get(i1).getCoding().size() < i2+1) { effectevidencesynthesis.getCertainty().get(i0).getRating().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {effectevidencesynthesis.getCertainty().get(i0).getRating().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** EfctEvdnceSynths_Crtnty_Rating_Cdg_Vrsn ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyRatingCdgVrsn() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsCrtntyRatingCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getCertainty().size() < i0+1) { effectevidencesynthesis.addCertainty(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsCrtntyRatingCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getCertainty().get(i0).getRating().size() < i1+1) { effectevidencesynthesis.getCertainty().get(i0).addRating(); }
					String[] arrayi2 = e.getEfctEvdnceSynthsCrtntyRatingCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(effectevidencesynthesis.getCertainty().get(i0).getRating().get(i1).getCoding().size() < i2+1) { effectevidencesynthesis.getCertainty().get(i0).getRating().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {effectevidencesynthesis.getCertainty().get(i0).getRating().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EfctEvdnceSynths_Crtnty_Rating_Txt ********************************************************************************/
		if(e.getEfctEvdnceSynthsCrtntyRatingTxt() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsCrtntyRatingTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getCertainty().size() < i0+1) { effectevidencesynthesis.addCertainty(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsCrtntyRatingTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getCertainty().get(i0).getRating().size() < i1+1) { effectevidencesynthesis.getCertainty().get(i0).addRating(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getCertainty().get(i0).getRating().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Cntct_Nm ********************************************************************************/
		if(e.getEfctEvdnceSynthsCntctNm() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsCntctNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getContact().size() < i0+1) { effectevidencesynthesis.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getContact().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(e.getEfctEvdnceSynthsCntctTlcmPrdEnd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getContact().size() < i0+1) { effectevidencesynthesis.addContact(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getContact().get(i0).getTelecom().size() < i1+1) { effectevidencesynthesis.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getContact().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEfctEvdnceSynthsCntctTlcmPrdStrt() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getContact().size() < i0+1) { effectevidencesynthesis.addContact(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getContact().get(i0).getTelecom().size() < i1+1) { effectevidencesynthesis.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getContact().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Cntct_Tlcm_Rnk ********************************************************************************/
		if(e.getEfctEvdnceSynthsCntctTlcmRnk() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getContact().size() < i0+1) { effectevidencesynthesis.addContact(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getContact().get(i0).getTelecom().size() < i1+1) { effectevidencesynthesis.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getContact().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Cntct_Tlcm_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsCntctTlcmSys() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getContact().size() < i0+1) { effectevidencesynthesis.addContact(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getContact().get(i0).getTelecom().size() < i1+1) { effectevidencesynthesis.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getContact().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Cntct_Tlcm_Use ********************************************************************************/
		if(e.getEfctEvdnceSynthsCntctTlcmUse() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getContact().size() < i0+1) { effectevidencesynthesis.addContact(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getContact().get(i0).getTelecom().size() < i1+1) { effectevidencesynthesis.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getContact().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Cntct_Tlcm_Vl ********************************************************************************/
		if(e.getEfctEvdnceSynthsCntctTlcmVl() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getContact().size() < i0+1) { effectevidencesynthesis.addContact(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getContact().get(i0).getTelecom().size() < i1+1) { effectevidencesynthesis.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getContact().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Copyright ********************************************************************************/
		if(e.getEfctEvdnceSynthsCopyright() != null ) {

			if(e.getEfctEvdnceSynthsCopyright().replace("[","").replace("]","").equals("NULL") | e.getEfctEvdnceSynthsCopyright()==null) {} else {
			effectevidencesynthesis.setCopyright(e.getEfctEvdnceSynthsCopyright().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** EfctEvdnceSynths_Dt ********************************************************************************/
		if(e.getEfctEvdnceSynthsDt() != null ) {

			if(e.getEfctEvdnceSynthsDt().replace("[","").replace("]","").equals("NULL") | e.getEfctEvdnceSynthsDt()==null) {} else {
			effectevidencesynthesis.setDate(e.getEfctEvdnceSynthsDt().replace("[","").replace("]","").equals("NULL") | e.getEfctEvdnceSynthsDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getEfctEvdnceSynthsDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EfctEvdnceSynths_Dscrptn ********************************************************************************/
		if(e.getEfctEvdnceSynthsDscrptn() != null ) {

			if(e.getEfctEvdnceSynthsDscrptn().replace("[","").replace("]","").equals("NULL") | e.getEfctEvdnceSynthsDscrptn()==null) {} else {
			effectevidencesynthesis.setDescription(e.getEfctEvdnceSynthsDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** EfctEvdnceSynths_Editor_Nm ********************************************************************************/
		if(e.getEfctEvdnceSynthsEditorNm() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEditorNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEditor().size() < i0+1) { effectevidencesynthesis.addEditor(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getEditor().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_Editor_Tlcm_Prd_End ********************************************************************************/
		if(e.getEfctEvdnceSynthsEditorTlcmPrdEnd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEditorTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEditor().size() < i0+1) { effectevidencesynthesis.addEditor(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsEditorTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getEditor().get(i0).getTelecom().size() < i1+1) { effectevidencesynthesis.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getEditor().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEfctEvdnceSynthsEditorTlcmPrdStrt() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEditorTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEditor().size() < i0+1) { effectevidencesynthesis.addEditor(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsEditorTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getEditor().get(i0).getTelecom().size() < i1+1) { effectevidencesynthesis.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getEditor().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Editor_Tlcm_Rnk ********************************************************************************/
		if(e.getEfctEvdnceSynthsEditorTlcmRnk() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEditorTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEditor().size() < i0+1) { effectevidencesynthesis.addEditor(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsEditorTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getEditor().get(i0).getTelecom().size() < i1+1) { effectevidencesynthesis.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getEditor().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Editor_Tlcm_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsEditorTlcmSys() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEditorTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEditor().size() < i0+1) { effectevidencesynthesis.addEditor(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsEditorTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getEditor().get(i0).getTelecom().size() < i1+1) { effectevidencesynthesis.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getEditor().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Editor_Tlcm_Use ********************************************************************************/
		if(e.getEfctEvdnceSynthsEditorTlcmUse() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEditorTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEditor().size() < i0+1) { effectevidencesynthesis.addEditor(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsEditorTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getEditor().get(i0).getTelecom().size() < i1+1) { effectevidencesynthesis.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getEditor().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Editor_Tlcm_Vl ********************************************************************************/
		if(e.getEfctEvdnceSynthsEditorTlcmVl() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEditorTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEditor().size() < i0+1) { effectevidencesynthesis.addEditor(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsEditorTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getEditor().get(i0).getTelecom().size() < i1+1) { effectevidencesynthesis.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getEditor().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_EfctEstmt_Dscrptn ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtDscrptn() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEfctEstmtDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEffectEstimate().size() < i0+1) { effectevidencesynthesis.addEffectEstimate(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getEffectEstimate().get(i0).setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_From ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtFrom() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtFrom().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEffectEstimate().size() < i0+1) { effectevidencesynthesis.addEffectEstimate(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtFrom().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getEffectEstimate().get(i0).getPrecisionEstimate().size() < i1+1) { effectevidencesynthesis.getEffectEstimate().get(i0).addPrecisionEstimate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getEffectEstimate().get(i0).getPrecisionEstimate().get(i1).setFrom((Double.parseDouble((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_Level ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtLevel() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtLevel().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEffectEstimate().size() < i0+1) { effectevidencesynthesis.addEffectEstimate(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtLevel().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getEffectEstimate().get(i0).getPrecisionEstimate().size() < i1+1) { effectevidencesynthesis.getEffectEstimate().get(i0).addPrecisionEstimate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getEffectEstimate().get(i0).getPrecisionEstimate().get(i1).setLevel((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_To ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTo() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTo().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEffectEstimate().size() < i0+1) { effectevidencesynthesis.addEffectEstimate(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTo().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getEffectEstimate().get(i0).getPrecisionEstimate().size() < i1+1) { effectevidencesynthesis.getEffectEstimate().get(i0).addPrecisionEstimate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getEffectEstimate().get(i0).getPrecisionEstimate().get(i1).setTo((Double.parseDouble((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_Typ_Cdg_Cd ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgCd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEffectEstimate().size() < i0+1) { effectevidencesynthesis.addEffectEstimate(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getEffectEstimate().get(i0).getPrecisionEstimate().size() < i1+1) { effectevidencesynthesis.getEffectEstimate().get(i0).addPrecisionEstimate(); }
					String[] arrayi2 = e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(effectevidencesynthesis.getEffectEstimate().get(i0).getPrecisionEstimate().get(i1).getType().getCoding().size() < i2+1) { effectevidencesynthesis.getEffectEstimate().get(i0).getPrecisionEstimate().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {effectevidencesynthesis.getEffectEstimate().get(i0).getPrecisionEstimate().get(i1).getType().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgDsply() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEffectEstimate().size() < i0+1) { effectevidencesynthesis.addEffectEstimate(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getEffectEstimate().get(i0).getPrecisionEstimate().size() < i1+1) { effectevidencesynthesis.getEffectEstimate().get(i0).addPrecisionEstimate(); }
					String[] arrayi2 = e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(effectevidencesynthesis.getEffectEstimate().get(i0).getPrecisionEstimate().get(i1).getType().getCoding().size() < i2+1) { effectevidencesynthesis.getEffectEstimate().get(i0).getPrecisionEstimate().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {effectevidencesynthesis.getEffectEstimate().get(i0).getPrecisionEstimate().get(i1).getType().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_Typ_Cdg_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgSys() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEffectEstimate().size() < i0+1) { effectevidencesynthesis.addEffectEstimate(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getEffectEstimate().get(i0).getPrecisionEstimate().size() < i1+1) { effectevidencesynthesis.getEffectEstimate().get(i0).addPrecisionEstimate(); }
					String[] arrayi2 = e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(effectevidencesynthesis.getEffectEstimate().get(i0).getPrecisionEstimate().get(i1).getType().getCoding().size() < i2+1) { effectevidencesynthesis.getEffectEstimate().get(i0).getPrecisionEstimate().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {effectevidencesynthesis.getEffectEstimate().get(i0).getPrecisionEstimate().get(i1).getType().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEffectEstimate().size() < i0+1) { effectevidencesynthesis.addEffectEstimate(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getEffectEstimate().get(i0).getPrecisionEstimate().size() < i1+1) { effectevidencesynthesis.getEffectEstimate().get(i0).addPrecisionEstimate(); }
					String[] arrayi2 = e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(effectevidencesynthesis.getEffectEstimate().get(i0).getPrecisionEstimate().get(i1).getType().getCoding().size() < i2+1) { effectevidencesynthesis.getEffectEstimate().get(i0).getPrecisionEstimate().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {effectevidencesynthesis.getEffectEstimate().get(i0).getPrecisionEstimate().get(i1).getType().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgVrsn() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEffectEstimate().size() < i0+1) { effectevidencesynthesis.addEffectEstimate(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getEffectEstimate().get(i0).getPrecisionEstimate().size() < i1+1) { effectevidencesynthesis.getEffectEstimate().get(i0).addPrecisionEstimate(); }
					String[] arrayi2 = e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(effectevidencesynthesis.getEffectEstimate().get(i0).getPrecisionEstimate().get(i1).getType().getCoding().size() < i2+1) { effectevidencesynthesis.getEffectEstimate().get(i0).getPrecisionEstimate().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {effectevidencesynthesis.getEffectEstimate().get(i0).getPrecisionEstimate().get(i1).getType().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** EfctEvdnceSynths_EfctEstmt_PrecisionEstmt_Typ_Txt ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypTxt() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEffectEstimate().size() < i0+1) { effectevidencesynthesis.addEffectEstimate(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsEfctEstmtPrecisionEstmtTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getEffectEstimate().get(i0).getPrecisionEstimate().size() < i1+1) { effectevidencesynthesis.getEffectEstimate().get(i0).addPrecisionEstimate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getEffectEstimate().get(i0).getPrecisionEstimate().get(i1).getType().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_EfctEstmt_Typ_Cdg_Cd ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtTypCdgCd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEfctEstmtTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEffectEstimate().size() < i0+1) { effectevidencesynthesis.addEffectEstimate(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsEfctEstmtTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getEffectEstimate().get(i0).getType().getCoding().size() < i1+1) { effectevidencesynthesis.getEffectEstimate().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getEffectEstimate().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_EfctEstmt_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtTypCdgDsply() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEfctEstmtTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEffectEstimate().size() < i0+1) { effectevidencesynthesis.addEffectEstimate(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsEfctEstmtTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getEffectEstimate().get(i0).getType().getCoding().size() < i1+1) { effectevidencesynthesis.getEffectEstimate().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getEffectEstimate().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_EfctEstmt_Typ_Cdg_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtTypCdgSys() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEfctEstmtTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEffectEstimate().size() < i0+1) { effectevidencesynthesis.addEffectEstimate(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsEfctEstmtTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getEffectEstimate().get(i0).getType().getCoding().size() < i1+1) { effectevidencesynthesis.getEffectEstimate().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getEffectEstimate().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_EfctEstmt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtTypCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEfctEstmtTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEffectEstimate().size() < i0+1) { effectevidencesynthesis.addEffectEstimate(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsEfctEstmtTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getEffectEstimate().get(i0).getType().getCoding().size() < i1+1) { effectevidencesynthesis.getEffectEstimate().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getEffectEstimate().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_EfctEstmt_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtTypCdgVrsn() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEfctEstmtTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEffectEstimate().size() < i0+1) { effectevidencesynthesis.addEffectEstimate(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsEfctEstmtTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getEffectEstimate().get(i0).getType().getCoding().size() < i1+1) { effectevidencesynthesis.getEffectEstimate().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getEffectEstimate().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_EfctEstmt_Typ_Txt ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtTypTxt() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEfctEstmtTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEffectEstimate().size() < i0+1) { effectevidencesynthesis.addEffectEstimate(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getEffectEstimate().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_EfctEstmt_UntOfMsr_Cdg_Cd ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtUntOfMsrCdgCd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEfctEstmtUntOfMsrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEffectEstimate().size() < i0+1) { effectevidencesynthesis.addEffectEstimate(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsEfctEstmtUntOfMsrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getEffectEstimate().get(i0).getUnitOfMeasure().getCoding().size() < i1+1) { effectevidencesynthesis.getEffectEstimate().get(i0).getUnitOfMeasure().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getEffectEstimate().get(i0).getUnitOfMeasure().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_EfctEstmt_UntOfMsr_Cdg_Dsply ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtUntOfMsrCdgDsply() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEfctEstmtUntOfMsrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEffectEstimate().size() < i0+1) { effectevidencesynthesis.addEffectEstimate(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsEfctEstmtUntOfMsrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getEffectEstimate().get(i0).getUnitOfMeasure().getCoding().size() < i1+1) { effectevidencesynthesis.getEffectEstimate().get(i0).getUnitOfMeasure().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getEffectEstimate().get(i0).getUnitOfMeasure().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_EfctEstmt_UntOfMsr_Cdg_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtUntOfMsrCdgSys() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEfctEstmtUntOfMsrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEffectEstimate().size() < i0+1) { effectevidencesynthesis.addEffectEstimate(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsEfctEstmtUntOfMsrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getEffectEstimate().get(i0).getUnitOfMeasure().getCoding().size() < i1+1) { effectevidencesynthesis.getEffectEstimate().get(i0).getUnitOfMeasure().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getEffectEstimate().get(i0).getUnitOfMeasure().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_EfctEstmt_UntOfMsr_Cdg_UsrSltd ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtUntOfMsrCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEfctEstmtUntOfMsrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEffectEstimate().size() < i0+1) { effectevidencesynthesis.addEffectEstimate(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsEfctEstmtUntOfMsrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getEffectEstimate().get(i0).getUnitOfMeasure().getCoding().size() < i1+1) { effectevidencesynthesis.getEffectEstimate().get(i0).getUnitOfMeasure().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getEffectEstimate().get(i0).getUnitOfMeasure().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_EfctEstmt_UntOfMsr_Cdg_Vrsn ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtUntOfMsrCdgVrsn() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEfctEstmtUntOfMsrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEffectEstimate().size() < i0+1) { effectevidencesynthesis.addEffectEstimate(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsEfctEstmtUntOfMsrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getEffectEstimate().get(i0).getUnitOfMeasure().getCoding().size() < i1+1) { effectevidencesynthesis.getEffectEstimate().get(i0).getUnitOfMeasure().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getEffectEstimate().get(i0).getUnitOfMeasure().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_EfctEstmt_UntOfMsr_Txt ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtUntOfMsrTxt() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEfctEstmtUntOfMsrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEffectEstimate().size() < i0+1) { effectevidencesynthesis.addEffectEstimate(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getEffectEstimate().get(i0).getUnitOfMeasure().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_EfctEstmt_Vl ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtVl() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEfctEstmtVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEffectEstimate().size() < i0+1) { effectevidencesynthesis.addEffectEstimate(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getEffectEstimate().get(i0).setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** EfctEvdnceSynths_EfctEstmt_VariantState_Cdg_Cd ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtVariantStateCdgCd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEfctEstmtVariantStateCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEffectEstimate().size() < i0+1) { effectevidencesynthesis.addEffectEstimate(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsEfctEstmtVariantStateCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getEffectEstimate().get(i0).getVariantState().getCoding().size() < i1+1) { effectevidencesynthesis.getEffectEstimate().get(i0).getVariantState().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getEffectEstimate().get(i0).getVariantState().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_EfctEstmt_VariantState_Cdg_Dsply ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtVariantStateCdgDsply() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEfctEstmtVariantStateCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEffectEstimate().size() < i0+1) { effectevidencesynthesis.addEffectEstimate(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsEfctEstmtVariantStateCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getEffectEstimate().get(i0).getVariantState().getCoding().size() < i1+1) { effectevidencesynthesis.getEffectEstimate().get(i0).getVariantState().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getEffectEstimate().get(i0).getVariantState().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_EfctEstmt_VariantState_Cdg_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtVariantStateCdgSys() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEfctEstmtVariantStateCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEffectEstimate().size() < i0+1) { effectevidencesynthesis.addEffectEstimate(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsEfctEstmtVariantStateCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getEffectEstimate().get(i0).getVariantState().getCoding().size() < i1+1) { effectevidencesynthesis.getEffectEstimate().get(i0).getVariantState().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getEffectEstimate().get(i0).getVariantState().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_EfctEstmt_VariantState_Cdg_UsrSltd ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtVariantStateCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEfctEstmtVariantStateCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEffectEstimate().size() < i0+1) { effectevidencesynthesis.addEffectEstimate(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsEfctEstmtVariantStateCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getEffectEstimate().get(i0).getVariantState().getCoding().size() < i1+1) { effectevidencesynthesis.getEffectEstimate().get(i0).getVariantState().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getEffectEstimate().get(i0).getVariantState().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_EfctEstmt_VariantState_Cdg_Vrsn ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtVariantStateCdgVrsn() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEfctEstmtVariantStateCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEffectEstimate().size() < i0+1) { effectevidencesynthesis.addEffectEstimate(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsEfctEstmtVariantStateCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getEffectEstimate().get(i0).getVariantState().getCoding().size() < i1+1) { effectevidencesynthesis.getEffectEstimate().get(i0).getVariantState().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getEffectEstimate().get(i0).getVariantState().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_EfctEstmt_VariantState_Txt ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctEstmtVariantStateTxt() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEfctEstmtVariantStateTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEffectEstimate().size() < i0+1) { effectevidencesynthesis.addEffectEstimate(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getEffectEstimate().get(i0).getVariantState().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_EfctivePrd_End ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctivePrdEnd() != null ) {

			if(e.getEfctEvdnceSynthsEfctivePrdEnd().replace("[","").replace("]","").equals("NULL") | e.getEfctEvdnceSynthsEfctivePrdEnd()==null) {} else {
			effectevidencesynthesis.getEffectivePeriod().setEnd(e.getEfctEvdnceSynthsEfctivePrdEnd().replace("[","").replace("]","").equals("NULL") | e.getEfctEvdnceSynthsEfctivePrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getEfctEvdnceSynthsEfctivePrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EfctEvdnceSynths_EfctivePrd_Strt ********************************************************************************/
		if(e.getEfctEvdnceSynthsEfctivePrdStrt() != null ) {

			if(e.getEfctEvdnceSynthsEfctivePrdStrt().replace("[","").replace("]","").equals("NULL") | e.getEfctEvdnceSynthsEfctivePrdStrt()==null) {} else {
			effectevidencesynthesis.getEffectivePeriod().setStart(e.getEfctEvdnceSynthsEfctivePrdStrt().replace("[","").replace("]","").equals("NULL") | e.getEfctEvdnceSynthsEfctivePrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getEfctEvdnceSynthsEfctivePrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EfctEvdnceSynths_Endsr_Nm ********************************************************************************/
		if(e.getEfctEvdnceSynthsEndsrNm() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEndsrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEndorser().size() < i0+1) { effectevidencesynthesis.addEndorser(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getEndorser().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(e.getEfctEvdnceSynthsEndsrTlcmPrdEnd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEndsrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEndorser().size() < i0+1) { effectevidencesynthesis.addEndorser(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsEndsrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getEndorser().get(i0).getTelecom().size() < i1+1) { effectevidencesynthesis.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getEndorser().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEfctEvdnceSynthsEndsrTlcmPrdStrt() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEndsrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEndorser().size() < i0+1) { effectevidencesynthesis.addEndorser(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsEndsrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getEndorser().get(i0).getTelecom().size() < i1+1) { effectevidencesynthesis.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getEndorser().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Endsr_Tlcm_Rnk ********************************************************************************/
		if(e.getEfctEvdnceSynthsEndsrTlcmRnk() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEndsrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEndorser().size() < i0+1) { effectevidencesynthesis.addEndorser(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsEndsrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getEndorser().get(i0).getTelecom().size() < i1+1) { effectevidencesynthesis.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getEndorser().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Endsr_Tlcm_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsEndsrTlcmSys() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEndsrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEndorser().size() < i0+1) { effectevidencesynthesis.addEndorser(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsEndsrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getEndorser().get(i0).getTelecom().size() < i1+1) { effectevidencesynthesis.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getEndorser().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Endsr_Tlcm_Use ********************************************************************************/
		if(e.getEfctEvdnceSynthsEndsrTlcmUse() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEndsrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEndorser().size() < i0+1) { effectevidencesynthesis.addEndorser(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsEndsrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getEndorser().get(i0).getTelecom().size() < i1+1) { effectevidencesynthesis.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getEndorser().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Endsr_Tlcm_Vl ********************************************************************************/
		if(e.getEfctEvdnceSynthsEndsrTlcmVl() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsEndsrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getEndorser().size() < i0+1) { effectevidencesynthesis.addEndorser(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsEndsrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getEndorser().get(i0).getTelecom().size() < i1+1) { effectevidencesynthesis.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getEndorser().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Exposure ********************************************************************************/
		if(e.getEfctEvdnceSynthsExposure() != null ) {

			if(e.getEfctEvdnceSynthsExposure().replace("[","").replace("]","").equals("NULL") | e.getEfctEvdnceSynthsExposure()==null) {} else {
			effectevidencesynthesis.setExposure(new org.hl7.fhir.r4.model.Reference(e.getEfctEvdnceSynthsExposure().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EfctEvdnceSynths_ExposureAlternative ********************************************************************************/
		if(e.getEfctEvdnceSynthsExposureAlternative() != null ) {

			if(e.getEfctEvdnceSynthsExposureAlternative().replace("[","").replace("]","").equals("NULL") | e.getEfctEvdnceSynthsExposureAlternative()==null) {} else {
			effectevidencesynthesis.setExposureAlternative(new org.hl7.fhir.r4.model.Reference(e.getEfctEvdnceSynthsExposureAlternative().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EfctEvdnceSynths_Id_Assigner ********************************************************************************/
		if(e.getEfctEvdnceSynthsIdAssigner() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getIdentifier().size() < i0+1) { effectevidencesynthesis.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EfctEvdnceSynths_Id_Prd_End ********************************************************************************/
		if(e.getEfctEvdnceSynthsIdPrdEnd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getIdentifier().size() < i0+1) { effectevidencesynthesis.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EfctEvdnceSynths_Id_Prd_Strt ********************************************************************************/
		if(e.getEfctEvdnceSynthsIdPrdStrt() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getIdentifier().size() < i0+1) { effectevidencesynthesis.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EfctEvdnceSynths_Id_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsIdSys() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getIdentifier().size() < i0+1) { effectevidencesynthesis.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_Id_Typ_Cdg_Cd ********************************************************************************/
		if(e.getEfctEvdnceSynthsIdTypCdgCd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getIdentifier().size() < i0+1) { effectevidencesynthesis.addIdentifier(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { effectevidencesynthesis.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(e.getEfctEvdnceSynthsIdTypCdgDsply() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getIdentifier().size() < i0+1) { effectevidencesynthesis.addIdentifier(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { effectevidencesynthesis.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Id_Typ_Cdg_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsIdTypCdgSys() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getIdentifier().size() < i0+1) { effectevidencesynthesis.addIdentifier(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { effectevidencesynthesis.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(e.getEfctEvdnceSynthsIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getIdentifier().size() < i0+1) { effectevidencesynthesis.addIdentifier(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { effectevidencesynthesis.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(e.getEfctEvdnceSynthsIdTypCdgVrsn() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getIdentifier().size() < i0+1) { effectevidencesynthesis.addIdentifier(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { effectevidencesynthesis.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Id_Typ_Txt ********************************************************************************/
		if(e.getEfctEvdnceSynthsIdTypTxt() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getIdentifier().size() < i0+1) { effectevidencesynthesis.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_Id_Use ********************************************************************************/
		if(e.getEfctEvdnceSynthsIdUse() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getIdentifier().size() < i0+1) { effectevidencesynthesis.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EfctEvdnceSynths_Id_Vl ********************************************************************************/
		if(e.getEfctEvdnceSynthsIdVl() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getIdentifier().size() < i0+1) { effectevidencesynthesis.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(e.getEfctEvdnceSynthsJrsdctnCdgCd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getJurisdiction().size() < i0+1) { effectevidencesynthesis.addJurisdiction(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getJurisdiction().get(i0).getCoding().size() < i1+1) { effectevidencesynthesis.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getJurisdiction().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(e.getEfctEvdnceSynthsJrsdctnCdgDsply() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getJurisdiction().size() < i0+1) { effectevidencesynthesis.addJurisdiction(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getJurisdiction().get(i0).getCoding().size() < i1+1) { effectevidencesynthesis.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getJurisdiction().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsJrsdctnCdgSys() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getJurisdiction().size() < i0+1) { effectevidencesynthesis.addJurisdiction(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getJurisdiction().get(i0).getCoding().size() < i1+1) { effectevidencesynthesis.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getJurisdiction().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(e.getEfctEvdnceSynthsJrsdctnCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getJurisdiction().size() < i0+1) { effectevidencesynthesis.addJurisdiction(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getJurisdiction().get(i0).getCoding().size() < i1+1) { effectevidencesynthesis.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getJurisdiction().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(e.getEfctEvdnceSynthsJrsdctnCdgVrsn() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getJurisdiction().size() < i0+1) { effectevidencesynthesis.addJurisdiction(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getJurisdiction().get(i0).getCoding().size() < i1+1) { effectevidencesynthesis.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getJurisdiction().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Jrsdctn_Txt ********************************************************************************/
		if(e.getEfctEvdnceSynthsJrsdctnTxt() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsJrsdctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getJurisdiction().size() < i0+1) { effectevidencesynthesis.addJurisdiction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getJurisdiction().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_LastReviewDt ********************************************************************************/
		if(e.getEfctEvdnceSynthsLastReviewDt() != null ) {

			if(e.getEfctEvdnceSynthsLastReviewDt().replace("[","").replace("]","").equals("NULL") | e.getEfctEvdnceSynthsLastReviewDt()==null) {} else {
			effectevidencesynthesis.setLastReviewDate(e.getEfctEvdnceSynthsLastReviewDt().replace("[","").replace("]","").equals("NULL") | e.getEfctEvdnceSynthsLastReviewDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(e.getEfctEvdnceSynthsLastReviewDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EfctEvdnceSynths_Nm ********************************************************************************/
		if(e.getEfctEvdnceSynthsNm() != null ) {

			if(e.getEfctEvdnceSynthsNm().replace("[","").replace("]","").equals("NULL") | e.getEfctEvdnceSynthsNm()==null) {} else {
			effectevidencesynthesis.setName(e.getEfctEvdnceSynthsNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** EfctEvdnceSynths_Nt_AthrRfrnc ********************************************************************************/
		if(e.getEfctEvdnceSynthsNtAthrRfrnc() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getNote().size() < i0+1) { effectevidencesynthesis.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EfctEvdnceSynths_Nt_AthrStrgTyp ********************************************************************************/
		if(e.getEfctEvdnceSynthsNtAthrStrgTyp() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getNote().size() < i0+1) { effectevidencesynthesis.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EfctEvdnceSynths_Nt_Txt ********************************************************************************/
		if(e.getEfctEvdnceSynthsNtTxt() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getNote().size() < i0+1) { effectevidencesynthesis.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_Nt_Time ********************************************************************************/
		if(e.getEfctEvdnceSynthsNtTime() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getNote().size() < i0+1) { effectevidencesynthesis.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EfctEvdnceSynths_Outcome ********************************************************************************/
		if(e.getEfctEvdnceSynthsOutcome() != null ) {

			if(e.getEfctEvdnceSynthsOutcome().replace("[","").replace("]","").equals("NULL") | e.getEfctEvdnceSynthsOutcome()==null) {} else {
			effectevidencesynthesis.setOutcome(new org.hl7.fhir.r4.model.Reference(e.getEfctEvdnceSynthsOutcome().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EfctEvdnceSynths_Popln ********************************************************************************/
		if(e.getEfctEvdnceSynthsPopln() != null ) {

			if(e.getEfctEvdnceSynthsPopln().replace("[","").replace("]","").equals("NULL") | e.getEfctEvdnceSynthsPopln()==null) {} else {
			effectevidencesynthesis.setPopulation(new org.hl7.fhir.r4.model.Reference(e.getEfctEvdnceSynthsPopln().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EfctEvdnceSynths_Pblshr ********************************************************************************/
		if(e.getEfctEvdnceSynthsPblshr() != null ) {

			if(e.getEfctEvdnceSynthsPblshr().replace("[","").replace("]","").equals("NULL") | e.getEfctEvdnceSynthsPblshr()==null) {} else {
			effectevidencesynthesis.setPublisher(e.getEfctEvdnceSynthsPblshr().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** EfctEvdnceSynths_RltedArtfct_Citation ********************************************************************************/
		if(e.getEfctEvdnceSynthsRltedArtfctCitation() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsRltedArtfctCitation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getRelatedArtifact().size() < i0+1) { effectevidencesynthesis.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getRelatedArtifact().get(i0).setCitation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_RltedArtfct_Dsply ********************************************************************************/
		if(e.getEfctEvdnceSynthsRltedArtfctDsply() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsRltedArtfctDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getRelatedArtifact().size() < i0+1) { effectevidencesynthesis.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getRelatedArtifact().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(e.getEfctEvdnceSynthsRltedArtfctDocCntntTyp() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsRltedArtfctDocCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getRelatedArtifact().size() < i0+1) { effectevidencesynthesis.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getRelatedArtifact().get(i0).getDocument().setContentType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_RltedArtfct_Doc_Creation ********************************************************************************/
		if(e.getEfctEvdnceSynthsRltedArtfctDocCreation() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsRltedArtfctDocCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getRelatedArtifact().size() < i0+1) { effectevidencesynthesis.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getRelatedArtifact().get(i0).getDocument().setCreation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EfctEvdnceSynths_RltedArtfct_Doc_Data ********************************************************************************/
		if(e.getEfctEvdnceSynthsRltedArtfctDocData() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsRltedArtfctDocData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getRelatedArtifact().size() < i0+1) { effectevidencesynthesis.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getRelatedArtifact().get(i0).getDocument().setData(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** EfctEvdnceSynths_RltedArtfct_Doc_Hash ********************************************************************************/
		if(e.getEfctEvdnceSynthsRltedArtfctDocHash() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsRltedArtfctDocHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getRelatedArtifact().size() < i0+1) { effectevidencesynthesis.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getRelatedArtifact().get(i0).getDocument().setHash(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** EfctEvdnceSynths_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(e.getEfctEvdnceSynthsRltedArtfctDocLnguage() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsRltedArtfctDocLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getRelatedArtifact().size() < i0+1) { effectevidencesynthesis.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getRelatedArtifact().get(i0).getDocument().setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_RltedArtfct_Doc_Sz ********************************************************************************/
		if(e.getEfctEvdnceSynthsRltedArtfctDocSz() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsRltedArtfctDocSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getRelatedArtifact().size() < i0+1) { effectevidencesynthesis.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getRelatedArtifact().get(i0).getDocument().setSize(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EfctEvdnceSynths_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(e.getEfctEvdnceSynthsRltedArtfctDocTtl() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsRltedArtfctDocTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getRelatedArtifact().size() < i0+1) { effectevidencesynthesis.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getRelatedArtifact().get(i0).getDocument().setTitle(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_RltedArtfct_Doc_Url ********************************************************************************/
		if(e.getEfctEvdnceSynthsRltedArtfctDocUrl() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsRltedArtfctDocUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getRelatedArtifact().size() < i0+1) { effectevidencesynthesis.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getRelatedArtifact().get(i0).getDocument().setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_RltedArtfct_Lbl ********************************************************************************/
		if(e.getEfctEvdnceSynthsRltedArtfctLbl() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsRltedArtfctLbl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getRelatedArtifact().size() < i0+1) { effectevidencesynthesis.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getRelatedArtifact().get(i0).setLabel(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_RltedArtfct_Rsrc ********************************************************************************/
		if(e.getEfctEvdnceSynthsRltedArtfctRsrc() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsRltedArtfctRsrc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getRelatedArtifact().size() < i0+1) { effectevidencesynthesis.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getRelatedArtifact().get(i0).setResource(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_RltedArtfct_Typ ********************************************************************************/
		if(e.getEfctEvdnceSynthsRltedArtfctTyp() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsRltedArtfctTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getRelatedArtifact().size() < i0+1) { effectevidencesynthesis.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getRelatedArtifact().get(i0).setType(new org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EfctEvdnceSynths_RltedArtfct_Url ********************************************************************************/
		if(e.getEfctEvdnceSynthsRltedArtfctUrl() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsRltedArtfctUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getRelatedArtifact().size() < i0+1) { effectevidencesynthesis.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getRelatedArtifact().get(i0).setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_RsltsByExposure_Dscrptn ********************************************************************************/
		if(e.getEfctEvdnceSynthsRsltsByExposureDscrptn() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsRsltsByExposureDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getResultsByExposure().size() < i0+1) { effectevidencesynthesis.addResultsByExposure(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getResultsByExposure().get(i0).setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_RsltsByExposure_ExposureState ********************************************************************************/
		if(e.getEfctEvdnceSynthsRsltsByExposureExposureState() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsRsltsByExposureExposureState().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getResultsByExposure().size() < i0+1) { effectevidencesynthesis.addResultsByExposure(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getResultsByExposure().get(i0).setExposureState(new org.hl7.fhir.r4.model.EffectEvidenceSynthesis.ExposureStateEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EfctEvdnceSynths_RsltsByExposure_RskEvdnceSynths ********************************************************************************/
		if(e.getEfctEvdnceSynthsRsltsByExposureRskEvdnceSynths() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsRsltsByExposureRskEvdnceSynths().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getResultsByExposure().size() < i0+1) { effectevidencesynthesis.addResultsByExposure(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getResultsByExposure().get(i0).setRiskEvidenceSynthesis(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EfctEvdnceSynths_RsltsByExposure_VariantState_Cdg_Cd ********************************************************************************/
		if(e.getEfctEvdnceSynthsRsltsByExposureVariantStateCdgCd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsRsltsByExposureVariantStateCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getResultsByExposure().size() < i0+1) { effectevidencesynthesis.addResultsByExposure(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsRsltsByExposureVariantStateCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getResultsByExposure().get(i0).getVariantState().getCoding().size() < i1+1) { effectevidencesynthesis.getResultsByExposure().get(i0).getVariantState().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getResultsByExposure().get(i0).getVariantState().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_RsltsByExposure_VariantState_Cdg_Dsply ********************************************************************************/
		if(e.getEfctEvdnceSynthsRsltsByExposureVariantStateCdgDsply() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsRsltsByExposureVariantStateCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getResultsByExposure().size() < i0+1) { effectevidencesynthesis.addResultsByExposure(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsRsltsByExposureVariantStateCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getResultsByExposure().get(i0).getVariantState().getCoding().size() < i1+1) { effectevidencesynthesis.getResultsByExposure().get(i0).getVariantState().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getResultsByExposure().get(i0).getVariantState().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_RsltsByExposure_VariantState_Cdg_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsRsltsByExposureVariantStateCdgSys() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsRsltsByExposureVariantStateCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getResultsByExposure().size() < i0+1) { effectevidencesynthesis.addResultsByExposure(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsRsltsByExposureVariantStateCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getResultsByExposure().get(i0).getVariantState().getCoding().size() < i1+1) { effectevidencesynthesis.getResultsByExposure().get(i0).getVariantState().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getResultsByExposure().get(i0).getVariantState().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_RsltsByExposure_VariantState_Cdg_UsrSltd ********************************************************************************/
		if(e.getEfctEvdnceSynthsRsltsByExposureVariantStateCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsRsltsByExposureVariantStateCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getResultsByExposure().size() < i0+1) { effectevidencesynthesis.addResultsByExposure(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsRsltsByExposureVariantStateCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getResultsByExposure().get(i0).getVariantState().getCoding().size() < i1+1) { effectevidencesynthesis.getResultsByExposure().get(i0).getVariantState().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getResultsByExposure().get(i0).getVariantState().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_RsltsByExposure_VariantState_Cdg_Vrsn ********************************************************************************/
		if(e.getEfctEvdnceSynthsRsltsByExposureVariantStateCdgVrsn() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsRsltsByExposureVariantStateCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getResultsByExposure().size() < i0+1) { effectevidencesynthesis.addResultsByExposure(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsRsltsByExposureVariantStateCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getResultsByExposure().get(i0).getVariantState().getCoding().size() < i1+1) { effectevidencesynthesis.getResultsByExposure().get(i0).getVariantState().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getResultsByExposure().get(i0).getVariantState().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_RsltsByExposure_VariantState_Txt ********************************************************************************/
		if(e.getEfctEvdnceSynthsRsltsByExposureVariantStateTxt() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsRsltsByExposureVariantStateTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getResultsByExposure().size() < i0+1) { effectevidencesynthesis.addResultsByExposure(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getResultsByExposure().get(i0).getVariantState().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_Rviewr_Nm ********************************************************************************/
		if(e.getEfctEvdnceSynthsRviewrNm() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsRviewrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getReviewer().size() < i0+1) { effectevidencesynthesis.addReviewer(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getReviewer().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(e.getEfctEvdnceSynthsRviewrTlcmPrdEnd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsRviewrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getReviewer().size() < i0+1) { effectevidencesynthesis.addReviewer(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsRviewrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getReviewer().get(i0).getTelecom().size() < i1+1) { effectevidencesynthesis.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getReviewer().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(e.getEfctEvdnceSynthsRviewrTlcmPrdStrt() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsRviewrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getReviewer().size() < i0+1) { effectevidencesynthesis.addReviewer(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsRviewrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getReviewer().get(i0).getTelecom().size() < i1+1) { effectevidencesynthesis.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getReviewer().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(e.getEfctEvdnceSynthsRviewrTlcmRnk() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsRviewrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getReviewer().size() < i0+1) { effectevidencesynthesis.addReviewer(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsRviewrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getReviewer().get(i0).getTelecom().size() < i1+1) { effectevidencesynthesis.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getReviewer().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Rviewr_Tlcm_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsRviewrTlcmSys() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsRviewrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getReviewer().size() < i0+1) { effectevidencesynthesis.addReviewer(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsRviewrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getReviewer().get(i0).getTelecom().size() < i1+1) { effectevidencesynthesis.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getReviewer().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Rviewr_Tlcm_Use ********************************************************************************/
		if(e.getEfctEvdnceSynthsRviewrTlcmUse() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsRviewrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getReviewer().size() < i0+1) { effectevidencesynthesis.addReviewer(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsRviewrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getReviewer().get(i0).getTelecom().size() < i1+1) { effectevidencesynthesis.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getReviewer().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Rviewr_Tlcm_Vl ********************************************************************************/
		if(e.getEfctEvdnceSynthsRviewrTlcmVl() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsRviewrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getReviewer().size() < i0+1) { effectevidencesynthesis.addReviewer(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsRviewrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getReviewer().get(i0).getTelecom().size() < i1+1) { effectevidencesynthesis.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getReviewer().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_SampleSz_Dscrptn ********************************************************************************/
		if(e.getEfctEvdnceSynthsSampleSzDscrptn() != null ) {

			if(e.getEfctEvdnceSynthsSampleSzDscrptn().replace("[","").replace("]","").equals("NULL") | e.getEfctEvdnceSynthsSampleSzDscrptn()==null) {} else {
			effectevidencesynthesis.getSampleSize().setDescription(e.getEfctEvdnceSynthsSampleSzDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** EfctEvdnceSynths_SampleSz_NmbrOfPrtcpnts ********************************************************************************/
		if(e.getEfctEvdnceSynthsSampleSzNmbrOfPrtcpnts() != null ) {

			if(e.getEfctEvdnceSynthsSampleSzNmbrOfPrtcpnts().replace("[","").replace("]","").equals("NULL") | e.getEfctEvdnceSynthsSampleSzNmbrOfPrtcpnts()==null) {} else {
			effectevidencesynthesis.getSampleSize().setNumberOfParticipants(Integer.parseInt(e.getEfctEvdnceSynthsSampleSzNmbrOfPrtcpnts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EfctEvdnceSynths_SampleSz_NmbrOfStudies ********************************************************************************/
		if(e.getEfctEvdnceSynthsSampleSzNmbrOfStudies() != null ) {

			if(e.getEfctEvdnceSynthsSampleSzNmbrOfStudies().replace("[","").replace("]","").equals("NULL") | e.getEfctEvdnceSynthsSampleSzNmbrOfStudies()==null) {} else {
			effectevidencesynthesis.getSampleSize().setNumberOfStudies(Integer.parseInt(e.getEfctEvdnceSynthsSampleSzNmbrOfStudies().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EfctEvdnceSynths_Sts ********************************************************************************/
		if(e.getEfctEvdnceSynthsSts() != null ) {

			if(e.getEfctEvdnceSynthsSts().replace("[","").replace("]","").equals("NULL") | e.getEfctEvdnceSynthsSts()==null) {} else {
			effectevidencesynthesis.setStatus(new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory().fromCode(e.getEfctEvdnceSynthsSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** EfctEvdnceSynths_StdyTyp_Cdg_Cd ********************************************************************************/
		if(e.getEfctEvdnceSynthsStdyTypCdgCd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsStdyTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getStudyType().getCoding().size() < i0+1) { effectevidencesynthesis.getStudyType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getStudyType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_StdyTyp_Cdg_Dsply ********************************************************************************/
		if(e.getEfctEvdnceSynthsStdyTypCdgDsply() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsStdyTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getStudyType().getCoding().size() < i0+1) { effectevidencesynthesis.getStudyType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getStudyType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_StdyTyp_Cdg_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsStdyTypCdgSys() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsStdyTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getStudyType().getCoding().size() < i0+1) { effectevidencesynthesis.getStudyType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getStudyType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_StdyTyp_Cdg_UsrSltd ********************************************************************************/
		if(e.getEfctEvdnceSynthsStdyTypCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsStdyTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getStudyType().getCoding().size() < i0+1) { effectevidencesynthesis.getStudyType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getStudyType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EfctEvdnceSynths_StdyTyp_Cdg_Vrsn ********************************************************************************/
		if(e.getEfctEvdnceSynthsStdyTypCdgVrsn() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsStdyTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getStudyType().getCoding().size() < i0+1) { effectevidencesynthesis.getStudyType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getStudyType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_StdyTyp_Txt ********************************************************************************/
		if(e.getEfctEvdnceSynthsStdyTypTxt() != null ) {

			if(e.getEfctEvdnceSynthsStdyTypTxt().replace("[","").replace("]","").equals("NULL") | e.getEfctEvdnceSynthsStdyTypTxt()==null) {} else {
			effectevidencesynthesis.getStudyType().setText(e.getEfctEvdnceSynthsStdyTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** EfctEvdnceSynths_SynthsTyp_Cdg_Cd ********************************************************************************/
		if(e.getEfctEvdnceSynthsSynthsTypCdgCd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsSynthsTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getSynthesisType().getCoding().size() < i0+1) { effectevidencesynthesis.getSynthesisType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getSynthesisType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_SynthsTyp_Cdg_Dsply ********************************************************************************/
		if(e.getEfctEvdnceSynthsSynthsTypCdgDsply() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsSynthsTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getSynthesisType().getCoding().size() < i0+1) { effectevidencesynthesis.getSynthesisType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getSynthesisType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_SynthsTyp_Cdg_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsSynthsTypCdgSys() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsSynthsTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getSynthesisType().getCoding().size() < i0+1) { effectevidencesynthesis.getSynthesisType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getSynthesisType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_SynthsTyp_Cdg_UsrSltd ********************************************************************************/
		if(e.getEfctEvdnceSynthsSynthsTypCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsSynthsTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getSynthesisType().getCoding().size() < i0+1) { effectevidencesynthesis.getSynthesisType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getSynthesisType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EfctEvdnceSynths_SynthsTyp_Cdg_Vrsn ********************************************************************************/
		if(e.getEfctEvdnceSynthsSynthsTypCdgVrsn() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsSynthsTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getSynthesisType().getCoding().size() < i0+1) { effectevidencesynthesis.getSynthesisType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getSynthesisType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_SynthsTyp_Txt ********************************************************************************/
		if(e.getEfctEvdnceSynthsSynthsTypTxt() != null ) {

			if(e.getEfctEvdnceSynthsSynthsTypTxt().replace("[","").replace("]","").equals("NULL") | e.getEfctEvdnceSynthsSynthsTypTxt()==null) {} else {
			effectevidencesynthesis.getSynthesisType().setText(e.getEfctEvdnceSynthsSynthsTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** EfctEvdnceSynths_Ttl ********************************************************************************/
		if(e.getEfctEvdnceSynthsTtl() != null ) {

			if(e.getEfctEvdnceSynthsTtl().replace("[","").replace("]","").equals("NULL") | e.getEfctEvdnceSynthsTtl()==null) {} else {
			effectevidencesynthesis.setTitle(e.getEfctEvdnceSynthsTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** EfctEvdnceSynths_Topic_Cdg_Cd ********************************************************************************/
		if(e.getEfctEvdnceSynthsTopicCdgCd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsTopicCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getTopic().size() < i0+1) { effectevidencesynthesis.addTopic(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsTopicCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getTopic().get(i0).getCoding().size() < i1+1) { effectevidencesynthesis.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getTopic().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Topic_Cdg_Dsply ********************************************************************************/
		if(e.getEfctEvdnceSynthsTopicCdgDsply() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsTopicCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getTopic().size() < i0+1) { effectevidencesynthesis.addTopic(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsTopicCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getTopic().get(i0).getCoding().size() < i1+1) { effectevidencesynthesis.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getTopic().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Topic_Cdg_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsTopicCdgSys() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsTopicCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getTopic().size() < i0+1) { effectevidencesynthesis.addTopic(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsTopicCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getTopic().get(i0).getCoding().size() < i1+1) { effectevidencesynthesis.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getTopic().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Topic_Cdg_UsrSltd ********************************************************************************/
		if(e.getEfctEvdnceSynthsTopicCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsTopicCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getTopic().size() < i0+1) { effectevidencesynthesis.addTopic(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsTopicCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getTopic().get(i0).getCoding().size() < i1+1) { effectevidencesynthesis.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getTopic().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Topic_Cdg_Vrsn ********************************************************************************/
		if(e.getEfctEvdnceSynthsTopicCdgVrsn() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsTopicCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getTopic().size() < i0+1) { effectevidencesynthesis.addTopic(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsTopicCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getTopic().get(i0).getCoding().size() < i1+1) { effectevidencesynthesis.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getTopic().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_Topic_Txt ********************************************************************************/
		if(e.getEfctEvdnceSynthsTopicTxt() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsTopicTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getTopic().size() < i0+1) { effectevidencesynthesis.addTopic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getTopic().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_Url ********************************************************************************/
		if(e.getEfctEvdnceSynthsUrl() != null ) {

			if(e.getEfctEvdnceSynthsUrl().replace("[","").replace("]","").equals("NULL") | e.getEfctEvdnceSynthsUrl()==null) {} else {
			effectevidencesynthesis.setUrl(e.getEfctEvdnceSynthsUrl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** EfctEvdnceSynths_UseCntxt_Cd_Cd ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtCdCd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsUseCntxtCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getUseContext().size() < i0+1) { effectevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getUseContext().get(i0).getCode().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_UseCntxt_Cd_Dsply ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtCdDsply() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsUseCntxtCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getUseContext().size() < i0+1) { effectevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getUseContext().get(i0).getCode().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_UseCntxt_Cd_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtCdSys() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsUseCntxtCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getUseContext().size() < i0+1) { effectevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getUseContext().get(i0).getCode().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtCdUsrSltd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsUseCntxtCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getUseContext().size() < i0+1) { effectevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getUseContext().get(i0).getCode().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EfctEvdnceSynths_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtCdVrsn() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsUseCntxtCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getUseContext().size() < i0+1) { effectevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getUseContext().get(i0).getCode().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getUseContext().size() < i0+1) { effectevidencesynthesis.addUseContext(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { effectevidencesynthesis.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getUseContext().size() < i0+1) { effectevidencesynthesis.addUseContext(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { effectevidencesynthesis.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getUseContext().size() < i0+1) { effectevidencesynthesis.addUseContext(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { effectevidencesynthesis.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getUseContext().size() < i0+1) { effectevidencesynthesis.addUseContext(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { effectevidencesynthesis.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** EfctEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getUseContext().size() < i0+1) { effectevidencesynthesis.addUseContext(); }
				String[] arrayi1 = e.getEfctEvdnceSynthsUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(effectevidencesynthesis.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { effectevidencesynthesis.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {effectevidencesynthesis.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** EfctEvdnceSynths_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlCdbleCncptTxt() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsUseCntxtVlCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getUseContext().size() < i0+1) { effectevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getUseContext().get(i0).getValueCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlQntyCd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsUseCntxtVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getUseContext().size() < i0+1) { effectevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getUseContext().get(i0).getValueQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_UseCntxt_VlQnty_Cmprtr ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlQntyCmprtr() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsUseCntxtVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getUseContext().size() < i0+1) { effectevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getUseContext().get(i0).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EfctEvdnceSynths_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlQntySys() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsUseCntxtVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getUseContext().size() < i0+1) { effectevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getUseContext().get(i0).getValueQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlQntyUnt() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsUseCntxtVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getUseContext().size() < i0+1) { effectevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getUseContext().get(i0).getValueQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlQntyVl() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsUseCntxtVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getUseContext().size() < i0+1) { effectevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getUseContext().get(i0).getValueQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** EfctEvdnceSynths_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlRngHiCd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsUseCntxtVlRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getUseContext().size() < i0+1) { effectevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getUseContext().get(i0).getValueRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_UseCntxt_VlRng_Hi_Cmprtr ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlRngHiCmprtr() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsUseCntxtVlRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getUseContext().size() < i0+1) { effectevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getUseContext().get(i0).getValueRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EfctEvdnceSynths_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlRngHiSys() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsUseCntxtVlRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getUseContext().size() < i0+1) { effectevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getUseContext().get(i0).getValueRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlRngHiUnt() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsUseCntxtVlRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getUseContext().size() < i0+1) { effectevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getUseContext().get(i0).getValueRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlRngHiVl() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsUseCntxtVlRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getUseContext().size() < i0+1) { effectevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getUseContext().get(i0).getValueRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** EfctEvdnceSynths_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlRngLwCd() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsUseCntxtVlRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getUseContext().size() < i0+1) { effectevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getUseContext().get(i0).getValueRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_UseCntxt_VlRng_Lw_Cmprtr ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlRngLwCmprtr() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsUseCntxtVlRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getUseContext().size() < i0+1) { effectevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getUseContext().get(i0).getValueRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EfctEvdnceSynths_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlRngLwSys() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsUseCntxtVlRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getUseContext().size() < i0+1) { effectevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getUseContext().get(i0).getValueRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlRngLwUnt() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsUseCntxtVlRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getUseContext().size() < i0+1) { effectevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getUseContext().get(i0).getValueRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** EfctEvdnceSynths_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlRngLwVl() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsUseCntxtVlRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getUseContext().size() < i0+1) { effectevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getUseContext().get(i0).getValueRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** EfctEvdnceSynths_UseCntxt_VlRfrnc ********************************************************************************/
		if(e.getEfctEvdnceSynthsUseCntxtVlRfrnc() != null ) {

			String[] arrayi0 = e.getEfctEvdnceSynthsUseCntxtVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(effectevidencesynthesis.getUseContext().size() < i0+1) { effectevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {effectevidencesynthesis.getUseContext().get(i0).setValue(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** EfctEvdnceSynths_Vrsn ********************************************************************************/
		if(e.getEfctEvdnceSynthsVrsn() != null ) {

			if(e.getEfctEvdnceSynthsVrsn().replace("[","").replace("]","").equals("NULL") | e.getEfctEvdnceSynthsVrsn()==null) {} else {
			effectevidencesynthesis.setVersion(e.getEfctEvdnceSynthsVrsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return effectevidencesynthesis;
	}
}
