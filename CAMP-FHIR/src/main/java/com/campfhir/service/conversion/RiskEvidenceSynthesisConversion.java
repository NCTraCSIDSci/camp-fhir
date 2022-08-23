package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.RiskEvidenceSynthesis;
public class RiskEvidenceSynthesisConversion 
{
	public org.hl7.fhir.r4.model.RiskEvidenceSynthesis RiskEvidenceSynthesiss(RiskEvidenceSynthesis r) throws ParseException
	{
		org.hl7.fhir.r4.model.RiskEvidenceSynthesis riskevidencesynthesis = new org.hl7.fhir.r4.model.RiskEvidenceSynthesis();

		/******************** id ********************************************************************************/
		riskevidencesynthesis.setId(r.getId());

		/******************** RskEvdnceSynths_ApprovalDt ********************************************************************************/
		if(r.getRskEvdnceSynthsApprovalDt() != null ) {

			if(r.getRskEvdnceSynthsApprovalDt().replace("[","").replace("]","").equals("NULL") | r.getRskEvdnceSynthsApprovalDt()==null) {} else {
			riskevidencesynthesis.setApprovalDate(r.getRskEvdnceSynthsApprovalDt().replace("[","").replace("]","").equals("NULL") | r.getRskEvdnceSynthsApprovalDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(r.getRskEvdnceSynthsApprovalDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RskEvdnceSynths_Athr_Nm ********************************************************************************/
		if(r.getRskEvdnceSynthsAthrNm() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsAthrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getAuthor().size() < i0+1) { riskevidencesynthesis.addAuthor(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getAuthor().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_Athr_Tlcm_Prd_End ********************************************************************************/
		if(r.getRskEvdnceSynthsAthrTlcmPrdEnd() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsAthrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getAuthor().size() < i0+1) { riskevidencesynthesis.addAuthor(); }
				String[] arrayi1 = r.getRskEvdnceSynthsAthrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getAuthor().get(i0).getTelecom().size() < i1+1) { riskevidencesynthesis.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getAuthor().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskEvdnceSynths_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(r.getRskEvdnceSynthsAthrTlcmPrdStrt() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsAthrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getAuthor().size() < i0+1) { riskevidencesynthesis.addAuthor(); }
				String[] arrayi1 = r.getRskEvdnceSynthsAthrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getAuthor().get(i0).getTelecom().size() < i1+1) { riskevidencesynthesis.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getAuthor().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskEvdnceSynths_Athr_Tlcm_Rnk ********************************************************************************/
		if(r.getRskEvdnceSynthsAthrTlcmRnk() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsAthrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getAuthor().size() < i0+1) { riskevidencesynthesis.addAuthor(); }
				String[] arrayi1 = r.getRskEvdnceSynthsAthrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getAuthor().get(i0).getTelecom().size() < i1+1) { riskevidencesynthesis.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getAuthor().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskEvdnceSynths_Athr_Tlcm_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsAthrTlcmSys() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsAthrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getAuthor().size() < i0+1) { riskevidencesynthesis.addAuthor(); }
				String[] arrayi1 = r.getRskEvdnceSynthsAthrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getAuthor().get(i0).getTelecom().size() < i1+1) { riskevidencesynthesis.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getAuthor().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskEvdnceSynths_Athr_Tlcm_Use ********************************************************************************/
		if(r.getRskEvdnceSynthsAthrTlcmUse() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsAthrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getAuthor().size() < i0+1) { riskevidencesynthesis.addAuthor(); }
				String[] arrayi1 = r.getRskEvdnceSynthsAthrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getAuthor().get(i0).getTelecom().size() < i1+1) { riskevidencesynthesis.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getAuthor().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskEvdnceSynths_Athr_Tlcm_Vl ********************************************************************************/
		if(r.getRskEvdnceSynthsAthrTlcmVl() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsAthrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getAuthor().size() < i0+1) { riskevidencesynthesis.addAuthor(); }
				String[] arrayi1 = r.getRskEvdnceSynthsAthrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getAuthor().get(i0).getTelecom().size() < i1+1) { riskevidencesynthesis.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getAuthor().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_AthrRfrnc ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentNtAthrRfrnc() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getCertainty().size() < i0+1) { riskevidencesynthesis.addCertainty(); }
				String[] arrayi1 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().size() < i1+1) { riskevidencesynthesis.getCertainty().get(i0).addCertaintySubcomponent(); }
					String[] arrayi2 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getNote().size() < i2+1) { riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).addNote(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getNote().get(i2).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_AthrStrgTyp ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentNtAthrStrgTyp() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getCertainty().size() < i0+1) { riskevidencesynthesis.addCertainty(); }
				String[] arrayi1 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().size() < i1+1) { riskevidencesynthesis.getCertainty().get(i0).addCertaintySubcomponent(); }
					String[] arrayi2 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getNote().size() < i2+1) { riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).addNote(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getNote().get(i2).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_Txt ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentNtTxt() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getCertainty().size() < i0+1) { riskevidencesynthesis.addCertainty(); }
				String[] arrayi1 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().size() < i1+1) { riskevidencesynthesis.getCertainty().get(i0).addCertaintySubcomponent(); }
					String[] arrayi2 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getNote().size() < i2+1) { riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).addNote(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getNote().get(i2).setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Nt_Time ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentNtTime() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getCertainty().size() < i0+1) { riskevidencesynthesis.addCertainty(); }
				String[] arrayi1 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().size() < i1+1) { riskevidencesynthesis.getCertainty().get(i0).addCertaintySubcomponent(); }
					String[] arrayi2 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getNote().size() < i2+1) { riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).addNote(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getNote().get(i2).setTime(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi2[i2].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_Cd ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgCd() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getCertainty().size() < i0+1) { riskevidencesynthesis.addCertainty(); }
				String[] arrayi1 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().size() < i1+1) { riskevidencesynthesis.getCertainty().get(i0).addCertaintySubcomponent(); }
					String[] arrayi2 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().size() < i2+1) { riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).addRating(); }
						String[] arrayi3 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().get(i2).getCoding().size() < i3+1) { riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().get(i2).getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_Dsply ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgDsply() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getCertainty().size() < i0+1) { riskevidencesynthesis.addCertainty(); }
				String[] arrayi1 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().size() < i1+1) { riskevidencesynthesis.getCertainty().get(i0).addCertaintySubcomponent(); }
					String[] arrayi2 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().size() < i2+1) { riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).addRating(); }
						String[] arrayi3 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().get(i2).getCoding().size() < i3+1) { riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().get(i2).getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgSys() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getCertainty().size() < i0+1) { riskevidencesynthesis.addCertainty(); }
				String[] arrayi1 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().size() < i1+1) { riskevidencesynthesis.getCertainty().get(i0).addCertaintySubcomponent(); }
					String[] arrayi2 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().size() < i2+1) { riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).addRating(); }
						String[] arrayi3 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().get(i2).getCoding().size() < i3+1) { riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().get(i2).getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_UsrSltd ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getCertainty().size() < i0+1) { riskevidencesynthesis.addCertainty(); }
				String[] arrayi1 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().size() < i1+1) { riskevidencesynthesis.getCertainty().get(i0).addCertaintySubcomponent(); }
					String[] arrayi2 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().size() < i2+1) { riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).addRating(); }
						String[] arrayi3 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().get(i2).getCoding().size() < i3+1) { riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().get(i2).getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Cdg_Vrsn ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgVrsn() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getCertainty().size() < i0+1) { riskevidencesynthesis.addCertainty(); }
				String[] arrayi1 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().size() < i1+1) { riskevidencesynthesis.getCertainty().get(i0).addCertaintySubcomponent(); }
					String[] arrayi2 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().size() < i2+1) { riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).addRating(); }
						String[] arrayi3 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().get(i2).getCoding().size() < i3+1) { riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().get(i2).getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Rating_Txt ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingTxt() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getCertainty().size() < i0+1) { riskevidencesynthesis.addCertainty(); }
				String[] arrayi1 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().size() < i1+1) { riskevidencesynthesis.getCertainty().get(i0).addCertaintySubcomponent(); }
					String[] arrayi2 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentRatingTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().size() < i2+1) { riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).addRating(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getRating().get(i2).setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_Cd ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgCd() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getCertainty().size() < i0+1) { riskevidencesynthesis.addCertainty(); }
				String[] arrayi1 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().size() < i1+1) { riskevidencesynthesis.getCertainty().get(i0).addCertaintySubcomponent(); }
					String[] arrayi2 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getType().getCoding().size() < i2+1) { riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getType().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_Dsply ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgDsply() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getCertainty().size() < i0+1) { riskevidencesynthesis.addCertainty(); }
				String[] arrayi1 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().size() < i1+1) { riskevidencesynthesis.getCertainty().get(i0).addCertaintySubcomponent(); }
					String[] arrayi2 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getType().getCoding().size() < i2+1) { riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getType().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgSys() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getCertainty().size() < i0+1) { riskevidencesynthesis.addCertainty(); }
				String[] arrayi1 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().size() < i1+1) { riskevidencesynthesis.getCertainty().get(i0).addCertaintySubcomponent(); }
					String[] arrayi2 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getType().getCoding().size() < i2+1) { riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getType().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_UsrSltd ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getCertainty().size() < i0+1) { riskevidencesynthesis.addCertainty(); }
				String[] arrayi1 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().size() < i1+1) { riskevidencesynthesis.getCertainty().get(i0).addCertaintySubcomponent(); }
					String[] arrayi2 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getType().getCoding().size() < i2+1) { riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getType().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Cdg_Vrsn ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgVrsn() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getCertainty().size() < i0+1) { riskevidencesynthesis.addCertainty(); }
				String[] arrayi1 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().size() < i1+1) { riskevidencesynthesis.getCertainty().get(i0).addCertaintySubcomponent(); }
					String[] arrayi2 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getType().getCoding().size() < i2+1) { riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getType().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** RskEvdnceSynths_Crtnty_CrtntySubcomponent_Typ_Txt ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyCrtntySubcomponentTypTxt() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getCertainty().size() < i0+1) { riskevidencesynthesis.addCertainty(); }
				String[] arrayi1 = r.getRskEvdnceSynthsCrtntyCrtntySubcomponentTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().size() < i1+1) { riskevidencesynthesis.getCertainty().get(i0).addCertaintySubcomponent(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getCertainty().get(i0).getCertaintySubcomponent().get(i1).getType().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskEvdnceSynths_Crtnty_Nt_AthrRfrnc ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyNtAthrRfrnc() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsCrtntyNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getCertainty().size() < i0+1) { riskevidencesynthesis.addCertainty(); }
				String[] arrayi1 = r.getRskEvdnceSynthsCrtntyNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getCertainty().get(i0).getNote().size() < i1+1) { riskevidencesynthesis.getCertainty().get(i0).addNote(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getCertainty().get(i0).getNote().get(i1).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskEvdnceSynths_Crtnty_Nt_AthrStrgTyp ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyNtAthrStrgTyp() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsCrtntyNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getCertainty().size() < i0+1) { riskevidencesynthesis.addCertainty(); }
				String[] arrayi1 = r.getRskEvdnceSynthsCrtntyNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getCertainty().get(i0).getNote().size() < i1+1) { riskevidencesynthesis.getCertainty().get(i0).addNote(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getCertainty().get(i0).getNote().get(i1).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskEvdnceSynths_Crtnty_Nt_Txt ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyNtTxt() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsCrtntyNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getCertainty().size() < i0+1) { riskevidencesynthesis.addCertainty(); }
				String[] arrayi1 = r.getRskEvdnceSynthsCrtntyNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getCertainty().get(i0).getNote().size() < i1+1) { riskevidencesynthesis.getCertainty().get(i0).addNote(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getCertainty().get(i0).getNote().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskEvdnceSynths_Crtnty_Nt_Time ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyNtTime() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsCrtntyNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getCertainty().size() < i0+1) { riskevidencesynthesis.addCertainty(); }
				String[] arrayi1 = r.getRskEvdnceSynthsCrtntyNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getCertainty().get(i0).getNote().size() < i1+1) { riskevidencesynthesis.getCertainty().get(i0).addNote(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getCertainty().get(i0).getNote().get(i1).setTime(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskEvdnceSynths_Crtnty_Rating_Cdg_Cd ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyRatingCdgCd() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsCrtntyRatingCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getCertainty().size() < i0+1) { riskevidencesynthesis.addCertainty(); }
				String[] arrayi1 = r.getRskEvdnceSynthsCrtntyRatingCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getCertainty().get(i0).getRating().size() < i1+1) { riskevidencesynthesis.getCertainty().get(i0).addRating(); }
					String[] arrayi2 = r.getRskEvdnceSynthsCrtntyRatingCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(riskevidencesynthesis.getCertainty().get(i0).getRating().get(i1).getCoding().size() < i2+1) { riskevidencesynthesis.getCertainty().get(i0).getRating().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {riskevidencesynthesis.getCertainty().get(i0).getRating().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** RskEvdnceSynths_Crtnty_Rating_Cdg_Dsply ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyRatingCdgDsply() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsCrtntyRatingCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getCertainty().size() < i0+1) { riskevidencesynthesis.addCertainty(); }
				String[] arrayi1 = r.getRskEvdnceSynthsCrtntyRatingCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getCertainty().get(i0).getRating().size() < i1+1) { riskevidencesynthesis.getCertainty().get(i0).addRating(); }
					String[] arrayi2 = r.getRskEvdnceSynthsCrtntyRatingCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(riskevidencesynthesis.getCertainty().get(i0).getRating().get(i1).getCoding().size() < i2+1) { riskevidencesynthesis.getCertainty().get(i0).getRating().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {riskevidencesynthesis.getCertainty().get(i0).getRating().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** RskEvdnceSynths_Crtnty_Rating_Cdg_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyRatingCdgSys() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsCrtntyRatingCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getCertainty().size() < i0+1) { riskevidencesynthesis.addCertainty(); }
				String[] arrayi1 = r.getRskEvdnceSynthsCrtntyRatingCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getCertainty().get(i0).getRating().size() < i1+1) { riskevidencesynthesis.getCertainty().get(i0).addRating(); }
					String[] arrayi2 = r.getRskEvdnceSynthsCrtntyRatingCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(riskevidencesynthesis.getCertainty().get(i0).getRating().get(i1).getCoding().size() < i2+1) { riskevidencesynthesis.getCertainty().get(i0).getRating().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {riskevidencesynthesis.getCertainty().get(i0).getRating().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** RskEvdnceSynths_Crtnty_Rating_Cdg_UsrSltd ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyRatingCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsCrtntyRatingCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getCertainty().size() < i0+1) { riskevidencesynthesis.addCertainty(); }
				String[] arrayi1 = r.getRskEvdnceSynthsCrtntyRatingCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getCertainty().get(i0).getRating().size() < i1+1) { riskevidencesynthesis.getCertainty().get(i0).addRating(); }
					String[] arrayi2 = r.getRskEvdnceSynthsCrtntyRatingCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(riskevidencesynthesis.getCertainty().get(i0).getRating().get(i1).getCoding().size() < i2+1) { riskevidencesynthesis.getCertainty().get(i0).getRating().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {riskevidencesynthesis.getCertainty().get(i0).getRating().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** RskEvdnceSynths_Crtnty_Rating_Cdg_Vrsn ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyRatingCdgVrsn() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsCrtntyRatingCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getCertainty().size() < i0+1) { riskevidencesynthesis.addCertainty(); }
				String[] arrayi1 = r.getRskEvdnceSynthsCrtntyRatingCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getCertainty().get(i0).getRating().size() < i1+1) { riskevidencesynthesis.getCertainty().get(i0).addRating(); }
					String[] arrayi2 = r.getRskEvdnceSynthsCrtntyRatingCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(riskevidencesynthesis.getCertainty().get(i0).getRating().get(i1).getCoding().size() < i2+1) { riskevidencesynthesis.getCertainty().get(i0).getRating().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {riskevidencesynthesis.getCertainty().get(i0).getRating().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** RskEvdnceSynths_Crtnty_Rating_Txt ********************************************************************************/
		if(r.getRskEvdnceSynthsCrtntyRatingTxt() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsCrtntyRatingTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getCertainty().size() < i0+1) { riskevidencesynthesis.addCertainty(); }
				String[] arrayi1 = r.getRskEvdnceSynthsCrtntyRatingTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getCertainty().get(i0).getRating().size() < i1+1) { riskevidencesynthesis.getCertainty().get(i0).addRating(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getCertainty().get(i0).getRating().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskEvdnceSynths_Cntct_Nm ********************************************************************************/
		if(r.getRskEvdnceSynthsCntctNm() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsCntctNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getContact().size() < i0+1) { riskevidencesynthesis.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getContact().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(r.getRskEvdnceSynthsCntctTlcmPrdEnd() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getContact().size() < i0+1) { riskevidencesynthesis.addContact(); }
				String[] arrayi1 = r.getRskEvdnceSynthsCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getContact().get(i0).getTelecom().size() < i1+1) { riskevidencesynthesis.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getContact().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskEvdnceSynths_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(r.getRskEvdnceSynthsCntctTlcmPrdStrt() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getContact().size() < i0+1) { riskevidencesynthesis.addContact(); }
				String[] arrayi1 = r.getRskEvdnceSynthsCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getContact().get(i0).getTelecom().size() < i1+1) { riskevidencesynthesis.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getContact().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskEvdnceSynths_Cntct_Tlcm_Rnk ********************************************************************************/
		if(r.getRskEvdnceSynthsCntctTlcmRnk() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getContact().size() < i0+1) { riskevidencesynthesis.addContact(); }
				String[] arrayi1 = r.getRskEvdnceSynthsCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getContact().get(i0).getTelecom().size() < i1+1) { riskevidencesynthesis.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getContact().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskEvdnceSynths_Cntct_Tlcm_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsCntctTlcmSys() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getContact().size() < i0+1) { riskevidencesynthesis.addContact(); }
				String[] arrayi1 = r.getRskEvdnceSynthsCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getContact().get(i0).getTelecom().size() < i1+1) { riskevidencesynthesis.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getContact().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskEvdnceSynths_Cntct_Tlcm_Use ********************************************************************************/
		if(r.getRskEvdnceSynthsCntctTlcmUse() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getContact().size() < i0+1) { riskevidencesynthesis.addContact(); }
				String[] arrayi1 = r.getRskEvdnceSynthsCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getContact().get(i0).getTelecom().size() < i1+1) { riskevidencesynthesis.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getContact().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskEvdnceSynths_Cntct_Tlcm_Vl ********************************************************************************/
		if(r.getRskEvdnceSynthsCntctTlcmVl() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getContact().size() < i0+1) { riskevidencesynthesis.addContact(); }
				String[] arrayi1 = r.getRskEvdnceSynthsCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getContact().get(i0).getTelecom().size() < i1+1) { riskevidencesynthesis.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getContact().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskEvdnceSynths_Copyright ********************************************************************************/
		if(r.getRskEvdnceSynthsCopyright() != null ) {

			if(r.getRskEvdnceSynthsCopyright().replace("[","").replace("]","").equals("NULL") | r.getRskEvdnceSynthsCopyright()==null) {} else {
			riskevidencesynthesis.setCopyright(r.getRskEvdnceSynthsCopyright().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RskEvdnceSynths_Dt ********************************************************************************/
		if(r.getRskEvdnceSynthsDt() != null ) {

			if(r.getRskEvdnceSynthsDt().replace("[","").replace("]","").equals("NULL") | r.getRskEvdnceSynthsDt()==null) {} else {
			riskevidencesynthesis.setDate(r.getRskEvdnceSynthsDt().replace("[","").replace("]","").equals("NULL") | r.getRskEvdnceSynthsDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(r.getRskEvdnceSynthsDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RskEvdnceSynths_Dscrptn ********************************************************************************/
		if(r.getRskEvdnceSynthsDscrptn() != null ) {

			if(r.getRskEvdnceSynthsDscrptn().replace("[","").replace("]","").equals("NULL") | r.getRskEvdnceSynthsDscrptn()==null) {} else {
			riskevidencesynthesis.setDescription(r.getRskEvdnceSynthsDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RskEvdnceSynths_Editor_Nm ********************************************************************************/
		if(r.getRskEvdnceSynthsEditorNm() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsEditorNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getEditor().size() < i0+1) { riskevidencesynthesis.addEditor(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getEditor().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_Editor_Tlcm_Prd_End ********************************************************************************/
		if(r.getRskEvdnceSynthsEditorTlcmPrdEnd() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsEditorTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getEditor().size() < i0+1) { riskevidencesynthesis.addEditor(); }
				String[] arrayi1 = r.getRskEvdnceSynthsEditorTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getEditor().get(i0).getTelecom().size() < i1+1) { riskevidencesynthesis.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getEditor().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskEvdnceSynths_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(r.getRskEvdnceSynthsEditorTlcmPrdStrt() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsEditorTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getEditor().size() < i0+1) { riskevidencesynthesis.addEditor(); }
				String[] arrayi1 = r.getRskEvdnceSynthsEditorTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getEditor().get(i0).getTelecom().size() < i1+1) { riskevidencesynthesis.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getEditor().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskEvdnceSynths_Editor_Tlcm_Rnk ********************************************************************************/
		if(r.getRskEvdnceSynthsEditorTlcmRnk() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsEditorTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getEditor().size() < i0+1) { riskevidencesynthesis.addEditor(); }
				String[] arrayi1 = r.getRskEvdnceSynthsEditorTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getEditor().get(i0).getTelecom().size() < i1+1) { riskevidencesynthesis.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getEditor().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskEvdnceSynths_Editor_Tlcm_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsEditorTlcmSys() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsEditorTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getEditor().size() < i0+1) { riskevidencesynthesis.addEditor(); }
				String[] arrayi1 = r.getRskEvdnceSynthsEditorTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getEditor().get(i0).getTelecom().size() < i1+1) { riskevidencesynthesis.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getEditor().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskEvdnceSynths_Editor_Tlcm_Use ********************************************************************************/
		if(r.getRskEvdnceSynthsEditorTlcmUse() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsEditorTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getEditor().size() < i0+1) { riskevidencesynthesis.addEditor(); }
				String[] arrayi1 = r.getRskEvdnceSynthsEditorTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getEditor().get(i0).getTelecom().size() < i1+1) { riskevidencesynthesis.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getEditor().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskEvdnceSynths_Editor_Tlcm_Vl ********************************************************************************/
		if(r.getRskEvdnceSynthsEditorTlcmVl() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsEditorTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getEditor().size() < i0+1) { riskevidencesynthesis.addEditor(); }
				String[] arrayi1 = r.getRskEvdnceSynthsEditorTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getEditor().get(i0).getTelecom().size() < i1+1) { riskevidencesynthesis.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getEditor().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskEvdnceSynths_EfctivePrd_End ********************************************************************************/
		if(r.getRskEvdnceSynthsEfctivePrdEnd() != null ) {

			if(r.getRskEvdnceSynthsEfctivePrdEnd().replace("[","").replace("]","").equals("NULL") | r.getRskEvdnceSynthsEfctivePrdEnd()==null) {} else {
			riskevidencesynthesis.getEffectivePeriod().setEnd(r.getRskEvdnceSynthsEfctivePrdEnd().replace("[","").replace("]","").equals("NULL") | r.getRskEvdnceSynthsEfctivePrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(r.getRskEvdnceSynthsEfctivePrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RskEvdnceSynths_EfctivePrd_Strt ********************************************************************************/
		if(r.getRskEvdnceSynthsEfctivePrdStrt() != null ) {

			if(r.getRskEvdnceSynthsEfctivePrdStrt().replace("[","").replace("]","").equals("NULL") | r.getRskEvdnceSynthsEfctivePrdStrt()==null) {} else {
			riskevidencesynthesis.getEffectivePeriod().setStart(r.getRskEvdnceSynthsEfctivePrdStrt().replace("[","").replace("]","").equals("NULL") | r.getRskEvdnceSynthsEfctivePrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(r.getRskEvdnceSynthsEfctivePrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RskEvdnceSynths_Endsr_Nm ********************************************************************************/
		if(r.getRskEvdnceSynthsEndsrNm() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsEndsrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getEndorser().size() < i0+1) { riskevidencesynthesis.addEndorser(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getEndorser().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(r.getRskEvdnceSynthsEndsrTlcmPrdEnd() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsEndsrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getEndorser().size() < i0+1) { riskevidencesynthesis.addEndorser(); }
				String[] arrayi1 = r.getRskEvdnceSynthsEndsrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getEndorser().get(i0).getTelecom().size() < i1+1) { riskevidencesynthesis.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getEndorser().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskEvdnceSynths_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(r.getRskEvdnceSynthsEndsrTlcmPrdStrt() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsEndsrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getEndorser().size() < i0+1) { riskevidencesynthesis.addEndorser(); }
				String[] arrayi1 = r.getRskEvdnceSynthsEndsrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getEndorser().get(i0).getTelecom().size() < i1+1) { riskevidencesynthesis.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getEndorser().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskEvdnceSynths_Endsr_Tlcm_Rnk ********************************************************************************/
		if(r.getRskEvdnceSynthsEndsrTlcmRnk() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsEndsrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getEndorser().size() < i0+1) { riskevidencesynthesis.addEndorser(); }
				String[] arrayi1 = r.getRskEvdnceSynthsEndsrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getEndorser().get(i0).getTelecom().size() < i1+1) { riskevidencesynthesis.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getEndorser().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskEvdnceSynths_Endsr_Tlcm_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsEndsrTlcmSys() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsEndsrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getEndorser().size() < i0+1) { riskevidencesynthesis.addEndorser(); }
				String[] arrayi1 = r.getRskEvdnceSynthsEndsrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getEndorser().get(i0).getTelecom().size() < i1+1) { riskevidencesynthesis.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getEndorser().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskEvdnceSynths_Endsr_Tlcm_Use ********************************************************************************/
		if(r.getRskEvdnceSynthsEndsrTlcmUse() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsEndsrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getEndorser().size() < i0+1) { riskevidencesynthesis.addEndorser(); }
				String[] arrayi1 = r.getRskEvdnceSynthsEndsrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getEndorser().get(i0).getTelecom().size() < i1+1) { riskevidencesynthesis.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getEndorser().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskEvdnceSynths_Endsr_Tlcm_Vl ********************************************************************************/
		if(r.getRskEvdnceSynthsEndsrTlcmVl() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsEndsrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getEndorser().size() < i0+1) { riskevidencesynthesis.addEndorser(); }
				String[] arrayi1 = r.getRskEvdnceSynthsEndsrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getEndorser().get(i0).getTelecom().size() < i1+1) { riskevidencesynthesis.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getEndorser().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskEvdnceSynths_Exposure ********************************************************************************/
		if(r.getRskEvdnceSynthsExposure() != null ) {

			if(r.getRskEvdnceSynthsExposure().replace("[","").replace("]","").equals("NULL") | r.getRskEvdnceSynthsExposure()==null) {} else {
			riskevidencesynthesis.setExposure(new org.hl7.fhir.r4.model.Reference(r.getRskEvdnceSynthsExposure().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RskEvdnceSynths_Id_Assigner ********************************************************************************/
		if(r.getRskEvdnceSynthsIdAssigner() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getIdentifier().size() < i0+1) { riskevidencesynthesis.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RskEvdnceSynths_Id_Prd_End ********************************************************************************/
		if(r.getRskEvdnceSynthsIdPrdEnd() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getIdentifier().size() < i0+1) { riskevidencesynthesis.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RskEvdnceSynths_Id_Prd_Strt ********************************************************************************/
		if(r.getRskEvdnceSynthsIdPrdStrt() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getIdentifier().size() < i0+1) { riskevidencesynthesis.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RskEvdnceSynths_Id_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsIdSys() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getIdentifier().size() < i0+1) { riskevidencesynthesis.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_Id_Typ_Cdg_Cd ********************************************************************************/
		if(r.getRskEvdnceSynthsIdTypCdgCd() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getIdentifier().size() < i0+1) { riskevidencesynthesis.addIdentifier(); }
				String[] arrayi1 = r.getRskEvdnceSynthsIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { riskevidencesynthesis.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskEvdnceSynths_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(r.getRskEvdnceSynthsIdTypCdgDsply() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getIdentifier().size() < i0+1) { riskevidencesynthesis.addIdentifier(); }
				String[] arrayi1 = r.getRskEvdnceSynthsIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { riskevidencesynthesis.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskEvdnceSynths_Id_Typ_Cdg_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsIdTypCdgSys() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getIdentifier().size() < i0+1) { riskevidencesynthesis.addIdentifier(); }
				String[] arrayi1 = r.getRskEvdnceSynthsIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { riskevidencesynthesis.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskEvdnceSynths_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(r.getRskEvdnceSynthsIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getIdentifier().size() < i0+1) { riskevidencesynthesis.addIdentifier(); }
				String[] arrayi1 = r.getRskEvdnceSynthsIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { riskevidencesynthesis.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskEvdnceSynths_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(r.getRskEvdnceSynthsIdTypCdgVrsn() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getIdentifier().size() < i0+1) { riskevidencesynthesis.addIdentifier(); }
				String[] arrayi1 = r.getRskEvdnceSynthsIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { riskevidencesynthesis.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskEvdnceSynths_Id_Typ_Txt ********************************************************************************/
		if(r.getRskEvdnceSynthsIdTypTxt() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getIdentifier().size() < i0+1) { riskevidencesynthesis.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_Id_Use ********************************************************************************/
		if(r.getRskEvdnceSynthsIdUse() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getIdentifier().size() < i0+1) { riskevidencesynthesis.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RskEvdnceSynths_Id_Vl ********************************************************************************/
		if(r.getRskEvdnceSynthsIdVl() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getIdentifier().size() < i0+1) { riskevidencesynthesis.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(r.getRskEvdnceSynthsJrsdctnCdgCd() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getJurisdiction().size() < i0+1) { riskevidencesynthesis.addJurisdiction(); }
				String[] arrayi1 = r.getRskEvdnceSynthsJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getJurisdiction().get(i0).getCoding().size() < i1+1) { riskevidencesynthesis.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getJurisdiction().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskEvdnceSynths_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(r.getRskEvdnceSynthsJrsdctnCdgDsply() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getJurisdiction().size() < i0+1) { riskevidencesynthesis.addJurisdiction(); }
				String[] arrayi1 = r.getRskEvdnceSynthsJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getJurisdiction().get(i0).getCoding().size() < i1+1) { riskevidencesynthesis.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getJurisdiction().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskEvdnceSynths_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsJrsdctnCdgSys() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getJurisdiction().size() < i0+1) { riskevidencesynthesis.addJurisdiction(); }
				String[] arrayi1 = r.getRskEvdnceSynthsJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getJurisdiction().get(i0).getCoding().size() < i1+1) { riskevidencesynthesis.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getJurisdiction().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskEvdnceSynths_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(r.getRskEvdnceSynthsJrsdctnCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getJurisdiction().size() < i0+1) { riskevidencesynthesis.addJurisdiction(); }
				String[] arrayi1 = r.getRskEvdnceSynthsJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getJurisdiction().get(i0).getCoding().size() < i1+1) { riskevidencesynthesis.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getJurisdiction().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskEvdnceSynths_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(r.getRskEvdnceSynthsJrsdctnCdgVrsn() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getJurisdiction().size() < i0+1) { riskevidencesynthesis.addJurisdiction(); }
				String[] arrayi1 = r.getRskEvdnceSynthsJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getJurisdiction().get(i0).getCoding().size() < i1+1) { riskevidencesynthesis.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getJurisdiction().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskEvdnceSynths_Jrsdctn_Txt ********************************************************************************/
		if(r.getRskEvdnceSynthsJrsdctnTxt() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsJrsdctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getJurisdiction().size() < i0+1) { riskevidencesynthesis.addJurisdiction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getJurisdiction().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_LastReviewDt ********************************************************************************/
		if(r.getRskEvdnceSynthsLastReviewDt() != null ) {

			if(r.getRskEvdnceSynthsLastReviewDt().replace("[","").replace("]","").equals("NULL") | r.getRskEvdnceSynthsLastReviewDt()==null) {} else {
			riskevidencesynthesis.setLastReviewDate(r.getRskEvdnceSynthsLastReviewDt().replace("[","").replace("]","").equals("NULL") | r.getRskEvdnceSynthsLastReviewDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(r.getRskEvdnceSynthsLastReviewDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RskEvdnceSynths_Nm ********************************************************************************/
		if(r.getRskEvdnceSynthsNm() != null ) {

			if(r.getRskEvdnceSynthsNm().replace("[","").replace("]","").equals("NULL") | r.getRskEvdnceSynthsNm()==null) {} else {
			riskevidencesynthesis.setName(r.getRskEvdnceSynthsNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RskEvdnceSynths_Nt_AthrRfrnc ********************************************************************************/
		if(r.getRskEvdnceSynthsNtAthrRfrnc() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getNote().size() < i0+1) { riskevidencesynthesis.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RskEvdnceSynths_Nt_AthrStrgTyp ********************************************************************************/
		if(r.getRskEvdnceSynthsNtAthrStrgTyp() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getNote().size() < i0+1) { riskevidencesynthesis.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RskEvdnceSynths_Nt_Txt ********************************************************************************/
		if(r.getRskEvdnceSynthsNtTxt() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getNote().size() < i0+1) { riskevidencesynthesis.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_Nt_Time ********************************************************************************/
		if(r.getRskEvdnceSynthsNtTime() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getNote().size() < i0+1) { riskevidencesynthesis.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RskEvdnceSynths_Outcome ********************************************************************************/
		if(r.getRskEvdnceSynthsOutcome() != null ) {

			if(r.getRskEvdnceSynthsOutcome().replace("[","").replace("]","").equals("NULL") | r.getRskEvdnceSynthsOutcome()==null) {} else {
			riskevidencesynthesis.setOutcome(new org.hl7.fhir.r4.model.Reference(r.getRskEvdnceSynthsOutcome().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RskEvdnceSynths_Popln ********************************************************************************/
		if(r.getRskEvdnceSynthsPopln() != null ) {

			if(r.getRskEvdnceSynthsPopln().replace("[","").replace("]","").equals("NULL") | r.getRskEvdnceSynthsPopln()==null) {} else {
			riskevidencesynthesis.setPopulation(new org.hl7.fhir.r4.model.Reference(r.getRskEvdnceSynthsPopln().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RskEvdnceSynths_Pblshr ********************************************************************************/
		if(r.getRskEvdnceSynthsPblshr() != null ) {

			if(r.getRskEvdnceSynthsPblshr().replace("[","").replace("]","").equals("NULL") | r.getRskEvdnceSynthsPblshr()==null) {} else {
			riskevidencesynthesis.setPublisher(r.getRskEvdnceSynthsPblshr().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RskEvdnceSynths_RltedArtfct_Citation ********************************************************************************/
		if(r.getRskEvdnceSynthsRltedArtfctCitation() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRltedArtfctCitation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getRelatedArtifact().size() < i0+1) { riskevidencesynthesis.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getRelatedArtifact().get(i0).setCitation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_RltedArtfct_Dsply ********************************************************************************/
		if(r.getRskEvdnceSynthsRltedArtfctDsply() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRltedArtfctDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getRelatedArtifact().size() < i0+1) { riskevidencesynthesis.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getRelatedArtifact().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(r.getRskEvdnceSynthsRltedArtfctDocCntntTyp() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRltedArtfctDocCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getRelatedArtifact().size() < i0+1) { riskevidencesynthesis.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getRelatedArtifact().get(i0).getDocument().setContentType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_RltedArtfct_Doc_Creation ********************************************************************************/
		if(r.getRskEvdnceSynthsRltedArtfctDocCreation() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRltedArtfctDocCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getRelatedArtifact().size() < i0+1) { riskevidencesynthesis.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getRelatedArtifact().get(i0).getDocument().setCreation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RskEvdnceSynths_RltedArtfct_Doc_Data ********************************************************************************/
		if(r.getRskEvdnceSynthsRltedArtfctDocData() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRltedArtfctDocData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getRelatedArtifact().size() < i0+1) { riskevidencesynthesis.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getRelatedArtifact().get(i0).getDocument().setData(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** RskEvdnceSynths_RltedArtfct_Doc_Hash ********************************************************************************/
		if(r.getRskEvdnceSynthsRltedArtfctDocHash() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRltedArtfctDocHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getRelatedArtifact().size() < i0+1) { riskevidencesynthesis.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getRelatedArtifact().get(i0).getDocument().setHash(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** RskEvdnceSynths_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(r.getRskEvdnceSynthsRltedArtfctDocLnguage() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRltedArtfctDocLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getRelatedArtifact().size() < i0+1) { riskevidencesynthesis.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getRelatedArtifact().get(i0).getDocument().setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_RltedArtfct_Doc_Sz ********************************************************************************/
		if(r.getRskEvdnceSynthsRltedArtfctDocSz() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRltedArtfctDocSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getRelatedArtifact().size() < i0+1) { riskevidencesynthesis.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getRelatedArtifact().get(i0).getDocument().setSize(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RskEvdnceSynths_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(r.getRskEvdnceSynthsRltedArtfctDocTtl() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRltedArtfctDocTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getRelatedArtifact().size() < i0+1) { riskevidencesynthesis.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getRelatedArtifact().get(i0).getDocument().setTitle(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_RltedArtfct_Doc_Url ********************************************************************************/
		if(r.getRskEvdnceSynthsRltedArtfctDocUrl() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRltedArtfctDocUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getRelatedArtifact().size() < i0+1) { riskevidencesynthesis.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getRelatedArtifact().get(i0).getDocument().setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_RltedArtfct_Lbl ********************************************************************************/
		if(r.getRskEvdnceSynthsRltedArtfctLbl() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRltedArtfctLbl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getRelatedArtifact().size() < i0+1) { riskevidencesynthesis.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getRelatedArtifact().get(i0).setLabel(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_RltedArtfct_Rsrc ********************************************************************************/
		if(r.getRskEvdnceSynthsRltedArtfctRsrc() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRltedArtfctRsrc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getRelatedArtifact().size() < i0+1) { riskevidencesynthesis.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getRelatedArtifact().get(i0).setResource(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_RltedArtfct_Typ ********************************************************************************/
		if(r.getRskEvdnceSynthsRltedArtfctTyp() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRltedArtfctTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getRelatedArtifact().size() < i0+1) { riskevidencesynthesis.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getRelatedArtifact().get(i0).setType(new org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RskEvdnceSynths_RltedArtfct_Url ********************************************************************************/
		if(r.getRskEvdnceSynthsRltedArtfctUrl() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRltedArtfctUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getRelatedArtifact().size() < i0+1) { riskevidencesynthesis.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getRelatedArtifact().get(i0).setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_Rviewr_Nm ********************************************************************************/
		if(r.getRskEvdnceSynthsRviewrNm() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRviewrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getReviewer().size() < i0+1) { riskevidencesynthesis.addReviewer(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getReviewer().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(r.getRskEvdnceSynthsRviewrTlcmPrdEnd() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRviewrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getReviewer().size() < i0+1) { riskevidencesynthesis.addReviewer(); }
				String[] arrayi1 = r.getRskEvdnceSynthsRviewrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getReviewer().get(i0).getTelecom().size() < i1+1) { riskevidencesynthesis.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getReviewer().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskEvdnceSynths_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(r.getRskEvdnceSynthsRviewrTlcmPrdStrt() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRviewrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getReviewer().size() < i0+1) { riskevidencesynthesis.addReviewer(); }
				String[] arrayi1 = r.getRskEvdnceSynthsRviewrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getReviewer().get(i0).getTelecom().size() < i1+1) { riskevidencesynthesis.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getReviewer().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskEvdnceSynths_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(r.getRskEvdnceSynthsRviewrTlcmRnk() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRviewrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getReviewer().size() < i0+1) { riskevidencesynthesis.addReviewer(); }
				String[] arrayi1 = r.getRskEvdnceSynthsRviewrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getReviewer().get(i0).getTelecom().size() < i1+1) { riskevidencesynthesis.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getReviewer().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskEvdnceSynths_Rviewr_Tlcm_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsRviewrTlcmSys() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRviewrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getReviewer().size() < i0+1) { riskevidencesynthesis.addReviewer(); }
				String[] arrayi1 = r.getRskEvdnceSynthsRviewrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getReviewer().get(i0).getTelecom().size() < i1+1) { riskevidencesynthesis.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getReviewer().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskEvdnceSynths_Rviewr_Tlcm_Use ********************************************************************************/
		if(r.getRskEvdnceSynthsRviewrTlcmUse() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRviewrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getReviewer().size() < i0+1) { riskevidencesynthesis.addReviewer(); }
				String[] arrayi1 = r.getRskEvdnceSynthsRviewrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getReviewer().get(i0).getTelecom().size() < i1+1) { riskevidencesynthesis.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getReviewer().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskEvdnceSynths_Rviewr_Tlcm_Vl ********************************************************************************/
		if(r.getRskEvdnceSynthsRviewrTlcmVl() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRviewrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getReviewer().size() < i0+1) { riskevidencesynthesis.addReviewer(); }
				String[] arrayi1 = r.getRskEvdnceSynthsRviewrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getReviewer().get(i0).getTelecom().size() < i1+1) { riskevidencesynthesis.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getReviewer().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskEvdnceSynths_RskEstmt_DnmntrCnt ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtDnmntrCnt() != null ) {

			if(r.getRskEvdnceSynthsRskEstmtDnmntrCnt().replace("[","").replace("]","").equals("NULL") | r.getRskEvdnceSynthsRskEstmtDnmntrCnt()==null) {} else {
			riskevidencesynthesis.getRiskEstimate().setDenominatorCount(Integer.parseInt(r.getRskEvdnceSynthsRskEstmtDnmntrCnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RskEvdnceSynths_RskEstmt_Dscrptn ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtDscrptn() != null ) {

			if(r.getRskEvdnceSynthsRskEstmtDscrptn().replace("[","").replace("]","").equals("NULL") | r.getRskEvdnceSynthsRskEstmtDscrptn()==null) {} else {
			riskevidencesynthesis.getRiskEstimate().setDescription(r.getRskEvdnceSynthsRskEstmtDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RskEvdnceSynths_RskEstmt_NmrtrCnt ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtNmrtrCnt() != null ) {

			if(r.getRskEvdnceSynthsRskEstmtNmrtrCnt().replace("[","").replace("]","").equals("NULL") | r.getRskEvdnceSynthsRskEstmtNmrtrCnt()==null) {} else {
			riskevidencesynthesis.getRiskEstimate().setNumeratorCount(Integer.parseInt(r.getRskEvdnceSynthsRskEstmtNmrtrCnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RskEvdnceSynths_RskEstmt_PrecisionEstmt_From ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtPrecisionEstmtFrom() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRskEstmtPrecisionEstmtFrom().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getRiskEstimate().getPrecisionEstimate().size() < i0+1) { riskevidencesynthesis.getRiskEstimate().addPrecisionEstimate(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getRiskEstimate().getPrecisionEstimate().get(i0).setFrom((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RskEvdnceSynths_RskEstmt_PrecisionEstmt_Level ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtPrecisionEstmtLevel() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRskEstmtPrecisionEstmtLevel().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getRiskEstimate().getPrecisionEstimate().size() < i0+1) { riskevidencesynthesis.getRiskEstimate().addPrecisionEstimate(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getRiskEstimate().getPrecisionEstimate().get(i0).setLevel((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RskEvdnceSynths_RskEstmt_PrecisionEstmt_To ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtPrecisionEstmtTo() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRskEstmtPrecisionEstmtTo().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getRiskEstimate().getPrecisionEstimate().size() < i0+1) { riskevidencesynthesis.getRiskEstimate().addPrecisionEstimate(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getRiskEstimate().getPrecisionEstimate().get(i0).setTo((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RskEvdnceSynths_RskEstmt_PrecisionEstmt_Typ_Cdg_Cd ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgCd() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getRiskEstimate().getPrecisionEstimate().size() < i0+1) { riskevidencesynthesis.getRiskEstimate().addPrecisionEstimate(); }
				String[] arrayi1 = r.getRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getRiskEstimate().getPrecisionEstimate().get(i0).getType().getCoding().size() < i1+1) { riskevidencesynthesis.getRiskEstimate().getPrecisionEstimate().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getRiskEstimate().getPrecisionEstimate().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskEvdnceSynths_RskEstmt_PrecisionEstmt_Typ_Cdg_Dsply ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgDsply() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getRiskEstimate().getPrecisionEstimate().size() < i0+1) { riskevidencesynthesis.getRiskEstimate().addPrecisionEstimate(); }
				String[] arrayi1 = r.getRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getRiskEstimate().getPrecisionEstimate().get(i0).getType().getCoding().size() < i1+1) { riskevidencesynthesis.getRiskEstimate().getPrecisionEstimate().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getRiskEstimate().getPrecisionEstimate().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskEvdnceSynths_RskEstmt_PrecisionEstmt_Typ_Cdg_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgSys() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getRiskEstimate().getPrecisionEstimate().size() < i0+1) { riskevidencesynthesis.getRiskEstimate().addPrecisionEstimate(); }
				String[] arrayi1 = r.getRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getRiskEstimate().getPrecisionEstimate().get(i0).getType().getCoding().size() < i1+1) { riskevidencesynthesis.getRiskEstimate().getPrecisionEstimate().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getRiskEstimate().getPrecisionEstimate().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskEvdnceSynths_RskEstmt_PrecisionEstmt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getRiskEstimate().getPrecisionEstimate().size() < i0+1) { riskevidencesynthesis.getRiskEstimate().addPrecisionEstimate(); }
				String[] arrayi1 = r.getRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getRiskEstimate().getPrecisionEstimate().get(i0).getType().getCoding().size() < i1+1) { riskevidencesynthesis.getRiskEstimate().getPrecisionEstimate().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getRiskEstimate().getPrecisionEstimate().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskEvdnceSynths_RskEstmt_PrecisionEstmt_Typ_Cdg_Vrsn ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgVrsn() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getRiskEstimate().getPrecisionEstimate().size() < i0+1) { riskevidencesynthesis.getRiskEstimate().addPrecisionEstimate(); }
				String[] arrayi1 = r.getRskEvdnceSynthsRskEstmtPrecisionEstmtTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getRiskEstimate().getPrecisionEstimate().get(i0).getType().getCoding().size() < i1+1) { riskevidencesynthesis.getRiskEstimate().getPrecisionEstimate().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getRiskEstimate().getPrecisionEstimate().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskEvdnceSynths_RskEstmt_PrecisionEstmt_Typ_Txt ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtPrecisionEstmtTypTxt() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRskEstmtPrecisionEstmtTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getRiskEstimate().getPrecisionEstimate().size() < i0+1) { riskevidencesynthesis.getRiskEstimate().addPrecisionEstimate(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getRiskEstimate().getPrecisionEstimate().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_RskEstmt_Typ_Cdg_Cd ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtTypCdgCd() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRskEstmtTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getRiskEstimate().getType().getCoding().size() < i0+1) { riskevidencesynthesis.getRiskEstimate().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getRiskEstimate().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_RskEstmt_Typ_Cdg_Dsply ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtTypCdgDsply() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRskEstmtTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getRiskEstimate().getType().getCoding().size() < i0+1) { riskevidencesynthesis.getRiskEstimate().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getRiskEstimate().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_RskEstmt_Typ_Cdg_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtTypCdgSys() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRskEstmtTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getRiskEstimate().getType().getCoding().size() < i0+1) { riskevidencesynthesis.getRiskEstimate().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getRiskEstimate().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_RskEstmt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtTypCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRskEstmtTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getRiskEstimate().getType().getCoding().size() < i0+1) { riskevidencesynthesis.getRiskEstimate().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getRiskEstimate().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RskEvdnceSynths_RskEstmt_Typ_Cdg_Vrsn ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtTypCdgVrsn() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRskEstmtTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getRiskEstimate().getType().getCoding().size() < i0+1) { riskevidencesynthesis.getRiskEstimate().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getRiskEstimate().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_RskEstmt_Typ_Txt ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtTypTxt() != null ) {

			if(r.getRskEvdnceSynthsRskEstmtTypTxt().replace("[","").replace("]","").equals("NULL") | r.getRskEvdnceSynthsRskEstmtTypTxt()==null) {} else {
			riskevidencesynthesis.getRiskEstimate().getType().setText(r.getRskEvdnceSynthsRskEstmtTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RskEvdnceSynths_RskEstmt_UntOfMsr_Cdg_Cd ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtUntOfMsrCdgCd() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRskEstmtUntOfMsrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getRiskEstimate().getUnitOfMeasure().getCoding().size() < i0+1) { riskevidencesynthesis.getRiskEstimate().getUnitOfMeasure().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getRiskEstimate().getUnitOfMeasure().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_RskEstmt_UntOfMsr_Cdg_Dsply ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtUntOfMsrCdgDsply() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRskEstmtUntOfMsrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getRiskEstimate().getUnitOfMeasure().getCoding().size() < i0+1) { riskevidencesynthesis.getRiskEstimate().getUnitOfMeasure().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getRiskEstimate().getUnitOfMeasure().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_RskEstmt_UntOfMsr_Cdg_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtUntOfMsrCdgSys() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRskEstmtUntOfMsrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getRiskEstimate().getUnitOfMeasure().getCoding().size() < i0+1) { riskevidencesynthesis.getRiskEstimate().getUnitOfMeasure().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getRiskEstimate().getUnitOfMeasure().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_RskEstmt_UntOfMsr_Cdg_UsrSltd ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtUntOfMsrCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRskEstmtUntOfMsrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getRiskEstimate().getUnitOfMeasure().getCoding().size() < i0+1) { riskevidencesynthesis.getRiskEstimate().getUnitOfMeasure().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getRiskEstimate().getUnitOfMeasure().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RskEvdnceSynths_RskEstmt_UntOfMsr_Cdg_Vrsn ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtUntOfMsrCdgVrsn() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsRskEstmtUntOfMsrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getRiskEstimate().getUnitOfMeasure().getCoding().size() < i0+1) { riskevidencesynthesis.getRiskEstimate().getUnitOfMeasure().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getRiskEstimate().getUnitOfMeasure().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_RskEstmt_UntOfMsr_Txt ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtUntOfMsrTxt() != null ) {

			if(r.getRskEvdnceSynthsRskEstmtUntOfMsrTxt().replace("[","").replace("]","").equals("NULL") | r.getRskEvdnceSynthsRskEstmtUntOfMsrTxt()==null) {} else {
			riskevidencesynthesis.getRiskEstimate().getUnitOfMeasure().setText(r.getRskEvdnceSynthsRskEstmtUntOfMsrTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RskEvdnceSynths_RskEstmt_Vl ********************************************************************************/
		if(r.getRskEvdnceSynthsRskEstmtVl() != null ) {

			if(r.getRskEvdnceSynthsRskEstmtVl().replace("[","").replace("]","").equals("NULL") | r.getRskEvdnceSynthsRskEstmtVl()==null) {} else {
			riskevidencesynthesis.getRiskEstimate().setValue((new java.math.BigDecimal((r.getRskEvdnceSynthsRskEstmtVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** RskEvdnceSynths_SampleSz_Dscrptn ********************************************************************************/
		if(r.getRskEvdnceSynthsSampleSzDscrptn() != null ) {

			if(r.getRskEvdnceSynthsSampleSzDscrptn().replace("[","").replace("]","").equals("NULL") | r.getRskEvdnceSynthsSampleSzDscrptn()==null) {} else {
			riskevidencesynthesis.getSampleSize().setDescription(r.getRskEvdnceSynthsSampleSzDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RskEvdnceSynths_SampleSz_NmbrOfPrtcpnts ********************************************************************************/
		if(r.getRskEvdnceSynthsSampleSzNmbrOfPrtcpnts() != null ) {

			if(r.getRskEvdnceSynthsSampleSzNmbrOfPrtcpnts().replace("[","").replace("]","").equals("NULL") | r.getRskEvdnceSynthsSampleSzNmbrOfPrtcpnts()==null) {} else {
			riskevidencesynthesis.getSampleSize().setNumberOfParticipants(Integer.parseInt(r.getRskEvdnceSynthsSampleSzNmbrOfPrtcpnts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RskEvdnceSynths_SampleSz_NmbrOfStudies ********************************************************************************/
		if(r.getRskEvdnceSynthsSampleSzNmbrOfStudies() != null ) {

			if(r.getRskEvdnceSynthsSampleSzNmbrOfStudies().replace("[","").replace("]","").equals("NULL") | r.getRskEvdnceSynthsSampleSzNmbrOfStudies()==null) {} else {
			riskevidencesynthesis.getSampleSize().setNumberOfStudies(Integer.parseInt(r.getRskEvdnceSynthsSampleSzNmbrOfStudies().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RskEvdnceSynths_Sts ********************************************************************************/
		if(r.getRskEvdnceSynthsSts() != null ) {

			if(r.getRskEvdnceSynthsSts().replace("[","").replace("]","").equals("NULL") | r.getRskEvdnceSynthsSts()==null) {} else {
			riskevidencesynthesis.setStatus(new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory().fromCode(r.getRskEvdnceSynthsSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RskEvdnceSynths_StdyTyp_Cdg_Cd ********************************************************************************/
		if(r.getRskEvdnceSynthsStdyTypCdgCd() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsStdyTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getStudyType().getCoding().size() < i0+1) { riskevidencesynthesis.getStudyType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getStudyType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_StdyTyp_Cdg_Dsply ********************************************************************************/
		if(r.getRskEvdnceSynthsStdyTypCdgDsply() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsStdyTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getStudyType().getCoding().size() < i0+1) { riskevidencesynthesis.getStudyType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getStudyType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_StdyTyp_Cdg_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsStdyTypCdgSys() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsStdyTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getStudyType().getCoding().size() < i0+1) { riskevidencesynthesis.getStudyType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getStudyType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_StdyTyp_Cdg_UsrSltd ********************************************************************************/
		if(r.getRskEvdnceSynthsStdyTypCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsStdyTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getStudyType().getCoding().size() < i0+1) { riskevidencesynthesis.getStudyType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getStudyType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RskEvdnceSynths_StdyTyp_Cdg_Vrsn ********************************************************************************/
		if(r.getRskEvdnceSynthsStdyTypCdgVrsn() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsStdyTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getStudyType().getCoding().size() < i0+1) { riskevidencesynthesis.getStudyType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getStudyType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_StdyTyp_Txt ********************************************************************************/
		if(r.getRskEvdnceSynthsStdyTypTxt() != null ) {

			if(r.getRskEvdnceSynthsStdyTypTxt().replace("[","").replace("]","").equals("NULL") | r.getRskEvdnceSynthsStdyTypTxt()==null) {} else {
			riskevidencesynthesis.getStudyType().setText(r.getRskEvdnceSynthsStdyTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RskEvdnceSynths_SynthsTyp_Cdg_Cd ********************************************************************************/
		if(r.getRskEvdnceSynthsSynthsTypCdgCd() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsSynthsTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getSynthesisType().getCoding().size() < i0+1) { riskevidencesynthesis.getSynthesisType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getSynthesisType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_SynthsTyp_Cdg_Dsply ********************************************************************************/
		if(r.getRskEvdnceSynthsSynthsTypCdgDsply() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsSynthsTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getSynthesisType().getCoding().size() < i0+1) { riskevidencesynthesis.getSynthesisType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getSynthesisType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_SynthsTyp_Cdg_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsSynthsTypCdgSys() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsSynthsTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getSynthesisType().getCoding().size() < i0+1) { riskevidencesynthesis.getSynthesisType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getSynthesisType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_SynthsTyp_Cdg_UsrSltd ********************************************************************************/
		if(r.getRskEvdnceSynthsSynthsTypCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsSynthsTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getSynthesisType().getCoding().size() < i0+1) { riskevidencesynthesis.getSynthesisType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getSynthesisType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RskEvdnceSynths_SynthsTyp_Cdg_Vrsn ********************************************************************************/
		if(r.getRskEvdnceSynthsSynthsTypCdgVrsn() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsSynthsTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getSynthesisType().getCoding().size() < i0+1) { riskevidencesynthesis.getSynthesisType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getSynthesisType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_SynthsTyp_Txt ********************************************************************************/
		if(r.getRskEvdnceSynthsSynthsTypTxt() != null ) {

			if(r.getRskEvdnceSynthsSynthsTypTxt().replace("[","").replace("]","").equals("NULL") | r.getRskEvdnceSynthsSynthsTypTxt()==null) {} else {
			riskevidencesynthesis.getSynthesisType().setText(r.getRskEvdnceSynthsSynthsTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RskEvdnceSynths_Ttl ********************************************************************************/
		if(r.getRskEvdnceSynthsTtl() != null ) {

			if(r.getRskEvdnceSynthsTtl().replace("[","").replace("]","").equals("NULL") | r.getRskEvdnceSynthsTtl()==null) {} else {
			riskevidencesynthesis.setTitle(r.getRskEvdnceSynthsTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RskEvdnceSynths_Topic_Cdg_Cd ********************************************************************************/
		if(r.getRskEvdnceSynthsTopicCdgCd() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsTopicCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getTopic().size() < i0+1) { riskevidencesynthesis.addTopic(); }
				String[] arrayi1 = r.getRskEvdnceSynthsTopicCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getTopic().get(i0).getCoding().size() < i1+1) { riskevidencesynthesis.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getTopic().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskEvdnceSynths_Topic_Cdg_Dsply ********************************************************************************/
		if(r.getRskEvdnceSynthsTopicCdgDsply() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsTopicCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getTopic().size() < i0+1) { riskevidencesynthesis.addTopic(); }
				String[] arrayi1 = r.getRskEvdnceSynthsTopicCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getTopic().get(i0).getCoding().size() < i1+1) { riskevidencesynthesis.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getTopic().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskEvdnceSynths_Topic_Cdg_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsTopicCdgSys() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsTopicCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getTopic().size() < i0+1) { riskevidencesynthesis.addTopic(); }
				String[] arrayi1 = r.getRskEvdnceSynthsTopicCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getTopic().get(i0).getCoding().size() < i1+1) { riskevidencesynthesis.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getTopic().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskEvdnceSynths_Topic_Cdg_UsrSltd ********************************************************************************/
		if(r.getRskEvdnceSynthsTopicCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsTopicCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getTopic().size() < i0+1) { riskevidencesynthesis.addTopic(); }
				String[] arrayi1 = r.getRskEvdnceSynthsTopicCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getTopic().get(i0).getCoding().size() < i1+1) { riskevidencesynthesis.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getTopic().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskEvdnceSynths_Topic_Cdg_Vrsn ********************************************************************************/
		if(r.getRskEvdnceSynthsTopicCdgVrsn() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsTopicCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getTopic().size() < i0+1) { riskevidencesynthesis.addTopic(); }
				String[] arrayi1 = r.getRskEvdnceSynthsTopicCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getTopic().get(i0).getCoding().size() < i1+1) { riskevidencesynthesis.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getTopic().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskEvdnceSynths_Topic_Txt ********************************************************************************/
		if(r.getRskEvdnceSynthsTopicTxt() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsTopicTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getTopic().size() < i0+1) { riskevidencesynthesis.addTopic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getTopic().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_Url ********************************************************************************/
		if(r.getRskEvdnceSynthsUrl() != null ) {

			if(r.getRskEvdnceSynthsUrl().replace("[","").replace("]","").equals("NULL") | r.getRskEvdnceSynthsUrl()==null) {} else {
			riskevidencesynthesis.setUrl(r.getRskEvdnceSynthsUrl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RskEvdnceSynths_UseCntxt_Cd_Cd ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtCdCd() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsUseCntxtCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getUseContext().size() < i0+1) { riskevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getUseContext().get(i0).getCode().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_UseCntxt_Cd_Dsply ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtCdDsply() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsUseCntxtCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getUseContext().size() < i0+1) { riskevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getUseContext().get(i0).getCode().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_UseCntxt_Cd_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtCdSys() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsUseCntxtCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getUseContext().size() < i0+1) { riskevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getUseContext().get(i0).getCode().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtCdUsrSltd() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsUseCntxtCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getUseContext().size() < i0+1) { riskevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getUseContext().get(i0).getCode().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RskEvdnceSynths_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtCdVrsn() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsUseCntxtCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getUseContext().size() < i0+1) { riskevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getUseContext().get(i0).getCode().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getUseContext().size() < i0+1) { riskevidencesynthesis.addUseContext(); }
				String[] arrayi1 = r.getRskEvdnceSynthsUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { riskevidencesynthesis.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getUseContext().size() < i0+1) { riskevidencesynthesis.addUseContext(); }
				String[] arrayi1 = r.getRskEvdnceSynthsUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { riskevidencesynthesis.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getUseContext().size() < i0+1) { riskevidencesynthesis.addUseContext(); }
				String[] arrayi1 = r.getRskEvdnceSynthsUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { riskevidencesynthesis.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getUseContext().size() < i0+1) { riskevidencesynthesis.addUseContext(); }
				String[] arrayi1 = r.getRskEvdnceSynthsUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { riskevidencesynthesis.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RskEvdnceSynths_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getUseContext().size() < i0+1) { riskevidencesynthesis.addUseContext(); }
				String[] arrayi1 = r.getRskEvdnceSynthsUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(riskevidencesynthesis.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { riskevidencesynthesis.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {riskevidencesynthesis.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RskEvdnceSynths_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlCdbleCncptTxt() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsUseCntxtVlCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getUseContext().size() < i0+1) { riskevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getUseContext().get(i0).getValueCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlQntyCd() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsUseCntxtVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getUseContext().size() < i0+1) { riskevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getUseContext().get(i0).getValueQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_UseCntxt_VlQnty_Cmprtr ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlQntyCmprtr() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsUseCntxtVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getUseContext().size() < i0+1) { riskevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getUseContext().get(i0).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RskEvdnceSynths_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlQntySys() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsUseCntxtVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getUseContext().size() < i0+1) { riskevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getUseContext().get(i0).getValueQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlQntyUnt() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsUseCntxtVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getUseContext().size() < i0+1) { riskevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getUseContext().get(i0).getValueQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlQntyVl() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsUseCntxtVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getUseContext().size() < i0+1) { riskevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getUseContext().get(i0).getValueQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RskEvdnceSynths_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlRngHiCd() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsUseCntxtVlRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getUseContext().size() < i0+1) { riskevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getUseContext().get(i0).getValueRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_UseCntxt_VlRng_Hi_Cmprtr ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlRngHiCmprtr() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsUseCntxtVlRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getUseContext().size() < i0+1) { riskevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getUseContext().get(i0).getValueRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RskEvdnceSynths_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlRngHiSys() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsUseCntxtVlRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getUseContext().size() < i0+1) { riskevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getUseContext().get(i0).getValueRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlRngHiUnt() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsUseCntxtVlRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getUseContext().size() < i0+1) { riskevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getUseContext().get(i0).getValueRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlRngHiVl() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsUseCntxtVlRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getUseContext().size() < i0+1) { riskevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getUseContext().get(i0).getValueRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RskEvdnceSynths_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlRngLwCd() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsUseCntxtVlRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getUseContext().size() < i0+1) { riskevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getUseContext().get(i0).getValueRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_UseCntxt_VlRng_Lw_Cmprtr ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlRngLwCmprtr() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsUseCntxtVlRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getUseContext().size() < i0+1) { riskevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getUseContext().get(i0).getValueRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RskEvdnceSynths_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlRngLwSys() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsUseCntxtVlRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getUseContext().size() < i0+1) { riskevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getUseContext().get(i0).getValueRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlRngLwUnt() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsUseCntxtVlRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getUseContext().size() < i0+1) { riskevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getUseContext().get(i0).getValueRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RskEvdnceSynths_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlRngLwVl() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsUseCntxtVlRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getUseContext().size() < i0+1) { riskevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getUseContext().get(i0).getValueRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RskEvdnceSynths_UseCntxt_VlRfrnc ********************************************************************************/
		if(r.getRskEvdnceSynthsUseCntxtVlRfrnc() != null ) {

			String[] arrayi0 = r.getRskEvdnceSynthsUseCntxtVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(riskevidencesynthesis.getUseContext().size() < i0+1) { riskevidencesynthesis.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {riskevidencesynthesis.getUseContext().get(i0).setValue(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RskEvdnceSynths_Vrsn ********************************************************************************/
		if(r.getRskEvdnceSynthsVrsn() != null ) {

			if(r.getRskEvdnceSynthsVrsn().replace("[","").replace("]","").equals("NULL") | r.getRskEvdnceSynthsVrsn()==null) {} else {
			riskevidencesynthesis.setVersion(r.getRskEvdnceSynthsVrsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return riskevidencesynthesis;
	}
}
