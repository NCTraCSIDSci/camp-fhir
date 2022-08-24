package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Measure;
public class MeasureConversion 
{
	public org.hl7.fhir.r4.model.Measure Measures(Measure m) throws ParseException
	{
		org.hl7.fhir.r4.model.Measure measure = new org.hl7.fhir.r4.model.Measure();

		/******************** id ********************************************************************************/
		measure.setId(m.getId());

		/******************** Msr_ApprovalDt ********************************************************************************/
		if(m.getMsrApprovalDt() != null ) {

			if(m.getMsrApprovalDt().replace("[","").replace("]","").equals("NULL") | m.getMsrApprovalDt()==null) {} else {
			measure.setApprovalDate(m.getMsrApprovalDt().replace("[","").replace("]","").equals("NULL") | m.getMsrApprovalDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMsrApprovalDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Msr_Athr_Nm ********************************************************************************/
		if(m.getMsrAthrNm() != null ) {

			String[] arrayi0 = m.getMsrAthrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getAuthor().size() < i0+1) { measure.addAuthor(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getAuthor().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_Athr_Tlcm_Prd_End ********************************************************************************/
		if(m.getMsrAthrTlcmPrdEnd() != null ) {

			String[] arrayi0 = m.getMsrAthrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getAuthor().size() < i0+1) { measure.addAuthor(); }
				String[] arrayi1 = m.getMsrAthrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getAuthor().get(i0).getTelecom().size() < i1+1) { measure.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getAuthor().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Msr_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(m.getMsrAthrTlcmPrdStrt() != null ) {

			String[] arrayi0 = m.getMsrAthrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getAuthor().size() < i0+1) { measure.addAuthor(); }
				String[] arrayi1 = m.getMsrAthrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getAuthor().get(i0).getTelecom().size() < i1+1) { measure.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getAuthor().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Msr_Athr_Tlcm_Rnk ********************************************************************************/
		if(m.getMsrAthrTlcmRnk() != null ) {

			String[] arrayi0 = m.getMsrAthrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getAuthor().size() < i0+1) { measure.addAuthor(); }
				String[] arrayi1 = m.getMsrAthrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getAuthor().get(i0).getTelecom().size() < i1+1) { measure.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getAuthor().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Msr_Athr_Tlcm_Sys ********************************************************************************/
		if(m.getMsrAthrTlcmSys() != null ) {

			String[] arrayi0 = m.getMsrAthrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getAuthor().size() < i0+1) { measure.addAuthor(); }
				String[] arrayi1 = m.getMsrAthrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getAuthor().get(i0).getTelecom().size() < i1+1) { measure.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getAuthor().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Msr_Athr_Tlcm_Use ********************************************************************************/
		if(m.getMsrAthrTlcmUse() != null ) {

			String[] arrayi0 = m.getMsrAthrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getAuthor().size() < i0+1) { measure.addAuthor(); }
				String[] arrayi1 = m.getMsrAthrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getAuthor().get(i0).getTelecom().size() < i1+1) { measure.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getAuthor().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Msr_Athr_Tlcm_Vl ********************************************************************************/
		if(m.getMsrAthrTlcmVl() != null ) {

			String[] arrayi0 = m.getMsrAthrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getAuthor().size() < i0+1) { measure.addAuthor(); }
				String[] arrayi1 = m.getMsrAthrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getAuthor().get(i0).getTelecom().size() < i1+1) { measure.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getAuthor().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_ClnclRecmndationStmnt ********************************************************************************/
		if(m.getMsrClnclRecmndationStmnt() != null ) {

			if(m.getMsrClnclRecmndationStmnt().replace("[","").replace("]","").equals("NULL") | m.getMsrClnclRecmndationStmnt()==null) {} else {
			measure.setClinicalRecommendationStatement(m.getMsrClnclRecmndationStmnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Msr_CompositeScoring_Cdg_Cd ********************************************************************************/
		if(m.getMsrCompositeScoringCdgCd() != null ) {

			String[] arrayi0 = m.getMsrCompositeScoringCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getCompositeScoring().getCoding().size() < i0+1) { measure.getCompositeScoring().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getCompositeScoring().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_CompositeScoring_Cdg_Dsply ********************************************************************************/
		if(m.getMsrCompositeScoringCdgDsply() != null ) {

			String[] arrayi0 = m.getMsrCompositeScoringCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getCompositeScoring().getCoding().size() < i0+1) { measure.getCompositeScoring().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getCompositeScoring().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_CompositeScoring_Cdg_Sys ********************************************************************************/
		if(m.getMsrCompositeScoringCdgSys() != null ) {

			String[] arrayi0 = m.getMsrCompositeScoringCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getCompositeScoring().getCoding().size() < i0+1) { measure.getCompositeScoring().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getCompositeScoring().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_CompositeScoring_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrCompositeScoringCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMsrCompositeScoringCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getCompositeScoring().getCoding().size() < i0+1) { measure.getCompositeScoring().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getCompositeScoring().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Msr_CompositeScoring_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrCompositeScoringCdgVrsn() != null ) {

			String[] arrayi0 = m.getMsrCompositeScoringCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getCompositeScoring().getCoding().size() < i0+1) { measure.getCompositeScoring().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getCompositeScoring().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_CompositeScoring_Txt ********************************************************************************/
		if(m.getMsrCompositeScoringTxt() != null ) {

			if(m.getMsrCompositeScoringTxt().replace("[","").replace("]","").equals("NULL") | m.getMsrCompositeScoringTxt()==null) {} else {
			measure.getCompositeScoring().setText(m.getMsrCompositeScoringTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Msr_Cntct_Nm ********************************************************************************/
		if(m.getMsrCntctNm() != null ) {

			String[] arrayi0 = m.getMsrCntctNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getContact().size() < i0+1) { measure.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getContact().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(m.getMsrCntctTlcmPrdEnd() != null ) {

			String[] arrayi0 = m.getMsrCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getContact().size() < i0+1) { measure.addContact(); }
				String[] arrayi1 = m.getMsrCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getContact().get(i0).getTelecom().size() < i1+1) { measure.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getContact().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Msr_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(m.getMsrCntctTlcmPrdStrt() != null ) {

			String[] arrayi0 = m.getMsrCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getContact().size() < i0+1) { measure.addContact(); }
				String[] arrayi1 = m.getMsrCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getContact().get(i0).getTelecom().size() < i1+1) { measure.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getContact().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Msr_Cntct_Tlcm_Rnk ********************************************************************************/
		if(m.getMsrCntctTlcmRnk() != null ) {

			String[] arrayi0 = m.getMsrCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getContact().size() < i0+1) { measure.addContact(); }
				String[] arrayi1 = m.getMsrCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getContact().get(i0).getTelecom().size() < i1+1) { measure.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getContact().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Msr_Cntct_Tlcm_Sys ********************************************************************************/
		if(m.getMsrCntctTlcmSys() != null ) {

			String[] arrayi0 = m.getMsrCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getContact().size() < i0+1) { measure.addContact(); }
				String[] arrayi1 = m.getMsrCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getContact().get(i0).getTelecom().size() < i1+1) { measure.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getContact().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Msr_Cntct_Tlcm_Use ********************************************************************************/
		if(m.getMsrCntctTlcmUse() != null ) {

			String[] arrayi0 = m.getMsrCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getContact().size() < i0+1) { measure.addContact(); }
				String[] arrayi1 = m.getMsrCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getContact().get(i0).getTelecom().size() < i1+1) { measure.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getContact().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Msr_Cntct_Tlcm_Vl ********************************************************************************/
		if(m.getMsrCntctTlcmVl() != null ) {

			String[] arrayi0 = m.getMsrCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getContact().size() < i0+1) { measure.addContact(); }
				String[] arrayi1 = m.getMsrCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getContact().get(i0).getTelecom().size() < i1+1) { measure.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getContact().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Copyright ********************************************************************************/
		if(m.getMsrCopyright() != null ) {

			if(m.getMsrCopyright().replace("[","").replace("]","").equals("NULL") | m.getMsrCopyright()==null) {} else {
			measure.setCopyright(m.getMsrCopyright().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Msr_Dt ********************************************************************************/
		if(m.getMsrDt() != null ) {

			if(m.getMsrDt().replace("[","").replace("]","").equals("NULL") | m.getMsrDt()==null) {} else {
			measure.setDate(m.getMsrDt().replace("[","").replace("]","").equals("NULL") | m.getMsrDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMsrDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Msr_Dfn ********************************************************************************/
		if(m.getMsrDfn() != null ) {

				for( String currListStrSplit : m.getMsrDfn().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			measure.addDefinition(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** Msr_Dscrptn ********************************************************************************/
		if(m.getMsrDscrptn() != null ) {

			if(m.getMsrDscrptn().replace("[","").replace("]","").equals("NULL") | m.getMsrDscrptn()==null) {} else {
			measure.setDescription(m.getMsrDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Msr_Disclaimer ********************************************************************************/
		if(m.getMsrDisclaimer() != null ) {

			if(m.getMsrDisclaimer().replace("[","").replace("]","").equals("NULL") | m.getMsrDisclaimer()==null) {} else {
			measure.setDisclaimer(m.getMsrDisclaimer().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Msr_Editor_Nm ********************************************************************************/
		if(m.getMsrEditorNm() != null ) {

			String[] arrayi0 = m.getMsrEditorNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getEditor().size() < i0+1) { measure.addEditor(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getEditor().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_Editor_Tlcm_Prd_End ********************************************************************************/
		if(m.getMsrEditorTlcmPrdEnd() != null ) {

			String[] arrayi0 = m.getMsrEditorTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getEditor().size() < i0+1) { measure.addEditor(); }
				String[] arrayi1 = m.getMsrEditorTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getEditor().get(i0).getTelecom().size() < i1+1) { measure.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getEditor().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Msr_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(m.getMsrEditorTlcmPrdStrt() != null ) {

			String[] arrayi0 = m.getMsrEditorTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getEditor().size() < i0+1) { measure.addEditor(); }
				String[] arrayi1 = m.getMsrEditorTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getEditor().get(i0).getTelecom().size() < i1+1) { measure.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getEditor().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Msr_Editor_Tlcm_Rnk ********************************************************************************/
		if(m.getMsrEditorTlcmRnk() != null ) {

			String[] arrayi0 = m.getMsrEditorTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getEditor().size() < i0+1) { measure.addEditor(); }
				String[] arrayi1 = m.getMsrEditorTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getEditor().get(i0).getTelecom().size() < i1+1) { measure.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getEditor().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Msr_Editor_Tlcm_Sys ********************************************************************************/
		if(m.getMsrEditorTlcmSys() != null ) {

			String[] arrayi0 = m.getMsrEditorTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getEditor().size() < i0+1) { measure.addEditor(); }
				String[] arrayi1 = m.getMsrEditorTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getEditor().get(i0).getTelecom().size() < i1+1) { measure.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getEditor().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Msr_Editor_Tlcm_Use ********************************************************************************/
		if(m.getMsrEditorTlcmUse() != null ) {

			String[] arrayi0 = m.getMsrEditorTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getEditor().size() < i0+1) { measure.addEditor(); }
				String[] arrayi1 = m.getMsrEditorTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getEditor().get(i0).getTelecom().size() < i1+1) { measure.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getEditor().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Msr_Editor_Tlcm_Vl ********************************************************************************/
		if(m.getMsrEditorTlcmVl() != null ) {

			String[] arrayi0 = m.getMsrEditorTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getEditor().size() < i0+1) { measure.addEditor(); }
				String[] arrayi1 = m.getMsrEditorTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getEditor().get(i0).getTelecom().size() < i1+1) { measure.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getEditor().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_EfctivePrd_End ********************************************************************************/
		if(m.getMsrEfctivePrdEnd() != null ) {

			if(m.getMsrEfctivePrdEnd().replace("[","").replace("]","").equals("NULL") | m.getMsrEfctivePrdEnd()==null) {} else {
			measure.getEffectivePeriod().setEnd(m.getMsrEfctivePrdEnd().replace("[","").replace("]","").equals("NULL") | m.getMsrEfctivePrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMsrEfctivePrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Msr_EfctivePrd_Strt ********************************************************************************/
		if(m.getMsrEfctivePrdStrt() != null ) {

			if(m.getMsrEfctivePrdStrt().replace("[","").replace("]","").equals("NULL") | m.getMsrEfctivePrdStrt()==null) {} else {
			measure.getEffectivePeriod().setStart(m.getMsrEfctivePrdStrt().replace("[","").replace("]","").equals("NULL") | m.getMsrEfctivePrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMsrEfctivePrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Msr_Endsr_Nm ********************************************************************************/
		if(m.getMsrEndsrNm() != null ) {

			String[] arrayi0 = m.getMsrEndsrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getEndorser().size() < i0+1) { measure.addEndorser(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getEndorser().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(m.getMsrEndsrTlcmPrdEnd() != null ) {

			String[] arrayi0 = m.getMsrEndsrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getEndorser().size() < i0+1) { measure.addEndorser(); }
				String[] arrayi1 = m.getMsrEndsrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getEndorser().get(i0).getTelecom().size() < i1+1) { measure.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getEndorser().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Msr_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(m.getMsrEndsrTlcmPrdStrt() != null ) {

			String[] arrayi0 = m.getMsrEndsrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getEndorser().size() < i0+1) { measure.addEndorser(); }
				String[] arrayi1 = m.getMsrEndsrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getEndorser().get(i0).getTelecom().size() < i1+1) { measure.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getEndorser().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Msr_Endsr_Tlcm_Rnk ********************************************************************************/
		if(m.getMsrEndsrTlcmRnk() != null ) {

			String[] arrayi0 = m.getMsrEndsrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getEndorser().size() < i0+1) { measure.addEndorser(); }
				String[] arrayi1 = m.getMsrEndsrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getEndorser().get(i0).getTelecom().size() < i1+1) { measure.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getEndorser().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Msr_Endsr_Tlcm_Sys ********************************************************************************/
		if(m.getMsrEndsrTlcmSys() != null ) {

			String[] arrayi0 = m.getMsrEndsrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getEndorser().size() < i0+1) { measure.addEndorser(); }
				String[] arrayi1 = m.getMsrEndsrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getEndorser().get(i0).getTelecom().size() < i1+1) { measure.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getEndorser().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Msr_Endsr_Tlcm_Use ********************************************************************************/
		if(m.getMsrEndsrTlcmUse() != null ) {

			String[] arrayi0 = m.getMsrEndsrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getEndorser().size() < i0+1) { measure.addEndorser(); }
				String[] arrayi1 = m.getMsrEndsrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getEndorser().get(i0).getTelecom().size() < i1+1) { measure.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getEndorser().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Msr_Endsr_Tlcm_Vl ********************************************************************************/
		if(m.getMsrEndsrTlcmVl() != null ) {

			String[] arrayi0 = m.getMsrEndsrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getEndorser().size() < i0+1) { measure.addEndorser(); }
				String[] arrayi1 = m.getMsrEndsrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getEndorser().get(i0).getTelecom().size() < i1+1) { measure.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getEndorser().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Exprmtl ********************************************************************************/
		if(m.getMsrExprmtl() != null ) {

			if(m.getMsrExprmtl().replace("[","").replace("]","").equals("NULL") | m.getMsrExprmtl()==null) {} else {
			measure.setExperimental(Boolean.parseBoolean(m.getMsrExprmtl().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Msr_Grp_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMsrGrpCdCdgCd() != null ) {

			String[] arrayi0 = m.getMsrGrpCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getCode().getCoding().size() < i1+1) { measure.getGroup().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getGroup().get(i0).getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Grp_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMsrGrpCdCdgDsply() != null ) {

			String[] arrayi0 = m.getMsrGrpCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getCode().getCoding().size() < i1+1) { measure.getGroup().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getGroup().get(i0).getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Grp_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMsrGrpCdCdgSys() != null ) {

			String[] arrayi0 = m.getMsrGrpCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getCode().getCoding().size() < i1+1) { measure.getGroup().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getGroup().get(i0).getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Grp_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrGrpCdCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMsrGrpCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getCode().getCoding().size() < i1+1) { measure.getGroup().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getGroup().get(i0).getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Msr_Grp_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrGrpCdCdgVrsn() != null ) {

			String[] arrayi0 = m.getMsrGrpCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getCode().getCoding().size() < i1+1) { measure.getGroup().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getGroup().get(i0).getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Grp_Cd_Txt ********************************************************************************/
		if(m.getMsrGrpCdTxt() != null ) {

			String[] arrayi0 = m.getMsrGrpCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getGroup().get(i0).getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_Grp_Dscrptn ********************************************************************************/
		if(m.getMsrGrpDscrptn() != null ) {

			String[] arrayi0 = m.getMsrGrpDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getGroup().get(i0).setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_Grp_Popln_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMsrGrpPoplnCdCdgCd() != null ) {

			String[] arrayi0 = m.getMsrGrpPoplnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpPoplnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getPopulation().size() < i1+1) { measure.getGroup().get(i0).addPopulation(); }
					String[] arrayi2 = m.getMsrGrpPoplnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measure.getGroup().get(i0).getPopulation().get(i1).getCode().getCoding().size() < i2+1) { measure.getGroup().get(i0).getPopulation().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {measure.getGroup().get(i0).getPopulation().get(i1).getCode().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Msr_Grp_Popln_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMsrGrpPoplnCdCdgDsply() != null ) {

			String[] arrayi0 = m.getMsrGrpPoplnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpPoplnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getPopulation().size() < i1+1) { measure.getGroup().get(i0).addPopulation(); }
					String[] arrayi2 = m.getMsrGrpPoplnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measure.getGroup().get(i0).getPopulation().get(i1).getCode().getCoding().size() < i2+1) { measure.getGroup().get(i0).getPopulation().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {measure.getGroup().get(i0).getPopulation().get(i1).getCode().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Msr_Grp_Popln_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMsrGrpPoplnCdCdgSys() != null ) {

			String[] arrayi0 = m.getMsrGrpPoplnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpPoplnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getPopulation().size() < i1+1) { measure.getGroup().get(i0).addPopulation(); }
					String[] arrayi2 = m.getMsrGrpPoplnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measure.getGroup().get(i0).getPopulation().get(i1).getCode().getCoding().size() < i2+1) { measure.getGroup().get(i0).getPopulation().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {measure.getGroup().get(i0).getPopulation().get(i1).getCode().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Msr_Grp_Popln_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrGrpPoplnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMsrGrpPoplnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpPoplnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getPopulation().size() < i1+1) { measure.getGroup().get(i0).addPopulation(); }
					String[] arrayi2 = m.getMsrGrpPoplnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measure.getGroup().get(i0).getPopulation().get(i1).getCode().getCoding().size() < i2+1) { measure.getGroup().get(i0).getPopulation().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {measure.getGroup().get(i0).getPopulation().get(i1).getCode().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Msr_Grp_Popln_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrGrpPoplnCdCdgVrsn() != null ) {

			String[] arrayi0 = m.getMsrGrpPoplnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpPoplnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getPopulation().size() < i1+1) { measure.getGroup().get(i0).addPopulation(); }
					String[] arrayi2 = m.getMsrGrpPoplnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measure.getGroup().get(i0).getPopulation().get(i1).getCode().getCoding().size() < i2+1) { measure.getGroup().get(i0).getPopulation().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {measure.getGroup().get(i0).getPopulation().get(i1).getCode().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Msr_Grp_Popln_Cd_Txt ********************************************************************************/
		if(m.getMsrGrpPoplnCdTxt() != null ) {

			String[] arrayi0 = m.getMsrGrpPoplnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpPoplnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getPopulation().size() < i1+1) { measure.getGroup().get(i0).addPopulation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getGroup().get(i0).getPopulation().get(i1).getCode().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Grp_Popln_Criteria_Dscrptn ********************************************************************************/
		if(m.getMsrGrpPoplnCriteriaDscrptn() != null ) {

			String[] arrayi0 = m.getMsrGrpPoplnCriteriaDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpPoplnCriteriaDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getPopulation().size() < i1+1) { measure.getGroup().get(i0).addPopulation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getGroup().get(i0).getPopulation().get(i1).getCriteria().setDescription(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Grp_Popln_Criteria_Exprsn ********************************************************************************/
		if(m.getMsrGrpPoplnCriteriaExprsn() != null ) {

			String[] arrayi0 = m.getMsrGrpPoplnCriteriaExprsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpPoplnCriteriaExprsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getPopulation().size() < i1+1) { measure.getGroup().get(i0).addPopulation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getGroup().get(i0).getPopulation().get(i1).getCriteria().setExpression(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Grp_Popln_Criteria_Lnguage ********************************************************************************/
		if(m.getMsrGrpPoplnCriteriaLnguage() != null ) {

			String[] arrayi0 = m.getMsrGrpPoplnCriteriaLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpPoplnCriteriaLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getPopulation().size() < i1+1) { measure.getGroup().get(i0).addPopulation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getGroup().get(i0).getPopulation().get(i1).getCriteria().setLanguage(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Grp_Popln_Criteria_Nm ********************************************************************************/
		if(m.getMsrGrpPoplnCriteriaNm() != null ) {

			String[] arrayi0 = m.getMsrGrpPoplnCriteriaNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpPoplnCriteriaNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getPopulation().size() < i1+1) { measure.getGroup().get(i0).addPopulation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getGroup().get(i0).getPopulation().get(i1).getCriteria().setName(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Grp_Popln_Criteria_Rfrnc ********************************************************************************/
		if(m.getMsrGrpPoplnCriteriaRfrnc() != null ) {

			String[] arrayi0 = m.getMsrGrpPoplnCriteriaRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpPoplnCriteriaRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getPopulation().size() < i1+1) { measure.getGroup().get(i0).addPopulation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getGroup().get(i0).getPopulation().get(i1).getCriteria().setReference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Grp_Popln_Dscrptn ********************************************************************************/
		if(m.getMsrGrpPoplnDscrptn() != null ) {

			String[] arrayi0 = m.getMsrGrpPoplnDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpPoplnDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getPopulation().size() < i1+1) { measure.getGroup().get(i0).addPopulation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getGroup().get(i0).getPopulation().get(i1).setDescription(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Grp_Strtfier_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMsrGrpStrtfierCdCdgCd() != null ) {

			String[] arrayi0 = m.getMsrGrpStrtfierCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpStrtfierCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getStratifier().size() < i1+1) { measure.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrGrpStrtfierCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measure.getGroup().get(i0).getStratifier().get(i1).getCode().getCoding().size() < i2+1) { measure.getGroup().get(i0).getStratifier().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {measure.getGroup().get(i0).getStratifier().get(i1).getCode().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Msr_Grp_Strtfier_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMsrGrpStrtfierCdCdgDsply() != null ) {

			String[] arrayi0 = m.getMsrGrpStrtfierCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpStrtfierCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getStratifier().size() < i1+1) { measure.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrGrpStrtfierCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measure.getGroup().get(i0).getStratifier().get(i1).getCode().getCoding().size() < i2+1) { measure.getGroup().get(i0).getStratifier().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {measure.getGroup().get(i0).getStratifier().get(i1).getCode().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Msr_Grp_Strtfier_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMsrGrpStrtfierCdCdgSys() != null ) {

			String[] arrayi0 = m.getMsrGrpStrtfierCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpStrtfierCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getStratifier().size() < i1+1) { measure.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrGrpStrtfierCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measure.getGroup().get(i0).getStratifier().get(i1).getCode().getCoding().size() < i2+1) { measure.getGroup().get(i0).getStratifier().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {measure.getGroup().get(i0).getStratifier().get(i1).getCode().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Msr_Grp_Strtfier_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrGrpStrtfierCdCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMsrGrpStrtfierCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpStrtfierCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getStratifier().size() < i1+1) { measure.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrGrpStrtfierCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measure.getGroup().get(i0).getStratifier().get(i1).getCode().getCoding().size() < i2+1) { measure.getGroup().get(i0).getStratifier().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {measure.getGroup().get(i0).getStratifier().get(i1).getCode().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Msr_Grp_Strtfier_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrGrpStrtfierCdCdgVrsn() != null ) {

			String[] arrayi0 = m.getMsrGrpStrtfierCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpStrtfierCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getStratifier().size() < i1+1) { measure.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrGrpStrtfierCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measure.getGroup().get(i0).getStratifier().get(i1).getCode().getCoding().size() < i2+1) { measure.getGroup().get(i0).getStratifier().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {measure.getGroup().get(i0).getStratifier().get(i1).getCode().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Msr_Grp_Strtfier_Cd_Txt ********************************************************************************/
		if(m.getMsrGrpStrtfierCdTxt() != null ) {

			String[] arrayi0 = m.getMsrGrpStrtfierCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpStrtfierCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getStratifier().size() < i1+1) { measure.getGroup().get(i0).addStratifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getGroup().get(i0).getStratifier().get(i1).getCode().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Grp_Strtfier_Cmpnt_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMsrGrpStrtfierCmpntCdCdgCd() != null ) {

			String[] arrayi0 = m.getMsrGrpStrtfierCmpntCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpStrtfierCmpntCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getStratifier().size() < i1+1) { measure.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrGrpStrtfierCmpntCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measure.getGroup().get(i0).getStratifier().get(i1).getComponent().size() < i2+1) { measure.getGroup().get(i0).getStratifier().get(i1).addComponent(); }
						String[] arrayi3 = m.getMsrGrpStrtfierCmpntCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(measure.getGroup().get(i0).getStratifier().get(i1).getComponent().get(i2).getCode().getCoding().size() < i3+1) { measure.getGroup().get(i0).getStratifier().get(i1).getComponent().get(i2).getCode().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {measure.getGroup().get(i0).getStratifier().get(i1).getComponent().get(i2).getCode().getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Msr_Grp_Strtfier_Cmpnt_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMsrGrpStrtfierCmpntCdCdgDsply() != null ) {

			String[] arrayi0 = m.getMsrGrpStrtfierCmpntCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpStrtfierCmpntCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getStratifier().size() < i1+1) { measure.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrGrpStrtfierCmpntCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measure.getGroup().get(i0).getStratifier().get(i1).getComponent().size() < i2+1) { measure.getGroup().get(i0).getStratifier().get(i1).addComponent(); }
						String[] arrayi3 = m.getMsrGrpStrtfierCmpntCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(measure.getGroup().get(i0).getStratifier().get(i1).getComponent().get(i2).getCode().getCoding().size() < i3+1) { measure.getGroup().get(i0).getStratifier().get(i1).getComponent().get(i2).getCode().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {measure.getGroup().get(i0).getStratifier().get(i1).getComponent().get(i2).getCode().getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Msr_Grp_Strtfier_Cmpnt_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMsrGrpStrtfierCmpntCdCdgSys() != null ) {

			String[] arrayi0 = m.getMsrGrpStrtfierCmpntCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpStrtfierCmpntCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getStratifier().size() < i1+1) { measure.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrGrpStrtfierCmpntCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measure.getGroup().get(i0).getStratifier().get(i1).getComponent().size() < i2+1) { measure.getGroup().get(i0).getStratifier().get(i1).addComponent(); }
						String[] arrayi3 = m.getMsrGrpStrtfierCmpntCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(measure.getGroup().get(i0).getStratifier().get(i1).getComponent().get(i2).getCode().getCoding().size() < i3+1) { measure.getGroup().get(i0).getStratifier().get(i1).getComponent().get(i2).getCode().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {measure.getGroup().get(i0).getStratifier().get(i1).getComponent().get(i2).getCode().getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Msr_Grp_Strtfier_Cmpnt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrGrpStrtfierCmpntCdCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMsrGrpStrtfierCmpntCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpStrtfierCmpntCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getStratifier().size() < i1+1) { measure.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrGrpStrtfierCmpntCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measure.getGroup().get(i0).getStratifier().get(i1).getComponent().size() < i2+1) { measure.getGroup().get(i0).getStratifier().get(i1).addComponent(); }
						String[] arrayi3 = m.getMsrGrpStrtfierCmpntCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(measure.getGroup().get(i0).getStratifier().get(i1).getComponent().get(i2).getCode().getCoding().size() < i3+1) { measure.getGroup().get(i0).getStratifier().get(i1).getComponent().get(i2).getCode().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {measure.getGroup().get(i0).getStratifier().get(i1).getComponent().get(i2).getCode().getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** Msr_Grp_Strtfier_Cmpnt_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrGrpStrtfierCmpntCdCdgVrsn() != null ) {

			String[] arrayi0 = m.getMsrGrpStrtfierCmpntCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpStrtfierCmpntCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getStratifier().size() < i1+1) { measure.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrGrpStrtfierCmpntCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measure.getGroup().get(i0).getStratifier().get(i1).getComponent().size() < i2+1) { measure.getGroup().get(i0).getStratifier().get(i1).addComponent(); }
						String[] arrayi3 = m.getMsrGrpStrtfierCmpntCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(measure.getGroup().get(i0).getStratifier().get(i1).getComponent().get(i2).getCode().getCoding().size() < i3+1) { measure.getGroup().get(i0).getStratifier().get(i1).getComponent().get(i2).getCode().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {measure.getGroup().get(i0).getStratifier().get(i1).getComponent().get(i2).getCode().getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** Msr_Grp_Strtfier_Cmpnt_Cd_Txt ********************************************************************************/
		if(m.getMsrGrpStrtfierCmpntCdTxt() != null ) {

			String[] arrayi0 = m.getMsrGrpStrtfierCmpntCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpStrtfierCmpntCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getStratifier().size() < i1+1) { measure.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrGrpStrtfierCmpntCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measure.getGroup().get(i0).getStratifier().get(i1).getComponent().size() < i2+1) { measure.getGroup().get(i0).getStratifier().get(i1).addComponent(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {measure.getGroup().get(i0).getStratifier().get(i1).getComponent().get(i2).getCode().setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Msr_Grp_Strtfier_Cmpnt_Criteria_Dscrptn ********************************************************************************/
		if(m.getMsrGrpStrtfierCmpntCriteriaDscrptn() != null ) {

			String[] arrayi0 = m.getMsrGrpStrtfierCmpntCriteriaDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpStrtfierCmpntCriteriaDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getStratifier().size() < i1+1) { measure.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrGrpStrtfierCmpntCriteriaDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measure.getGroup().get(i0).getStratifier().get(i1).getComponent().size() < i2+1) { measure.getGroup().get(i0).getStratifier().get(i1).addComponent(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {measure.getGroup().get(i0).getStratifier().get(i1).getComponent().get(i2).getCriteria().setDescription(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Msr_Grp_Strtfier_Cmpnt_Criteria_Exprsn ********************************************************************************/
		if(m.getMsrGrpStrtfierCmpntCriteriaExprsn() != null ) {

			String[] arrayi0 = m.getMsrGrpStrtfierCmpntCriteriaExprsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpStrtfierCmpntCriteriaExprsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getStratifier().size() < i1+1) { measure.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrGrpStrtfierCmpntCriteriaExprsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measure.getGroup().get(i0).getStratifier().get(i1).getComponent().size() < i2+1) { measure.getGroup().get(i0).getStratifier().get(i1).addComponent(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {measure.getGroup().get(i0).getStratifier().get(i1).getComponent().get(i2).getCriteria().setExpression(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Msr_Grp_Strtfier_Cmpnt_Criteria_Lnguage ********************************************************************************/
		if(m.getMsrGrpStrtfierCmpntCriteriaLnguage() != null ) {

			String[] arrayi0 = m.getMsrGrpStrtfierCmpntCriteriaLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpStrtfierCmpntCriteriaLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getStratifier().size() < i1+1) { measure.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrGrpStrtfierCmpntCriteriaLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measure.getGroup().get(i0).getStratifier().get(i1).getComponent().size() < i2+1) { measure.getGroup().get(i0).getStratifier().get(i1).addComponent(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {measure.getGroup().get(i0).getStratifier().get(i1).getComponent().get(i2).getCriteria().setLanguage(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Msr_Grp_Strtfier_Cmpnt_Criteria_Nm ********************************************************************************/
		if(m.getMsrGrpStrtfierCmpntCriteriaNm() != null ) {

			String[] arrayi0 = m.getMsrGrpStrtfierCmpntCriteriaNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpStrtfierCmpntCriteriaNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getStratifier().size() < i1+1) { measure.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrGrpStrtfierCmpntCriteriaNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measure.getGroup().get(i0).getStratifier().get(i1).getComponent().size() < i2+1) { measure.getGroup().get(i0).getStratifier().get(i1).addComponent(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {measure.getGroup().get(i0).getStratifier().get(i1).getComponent().get(i2).getCriteria().setName(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Msr_Grp_Strtfier_Cmpnt_Criteria_Rfrnc ********************************************************************************/
		if(m.getMsrGrpStrtfierCmpntCriteriaRfrnc() != null ) {

			String[] arrayi0 = m.getMsrGrpStrtfierCmpntCriteriaRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpStrtfierCmpntCriteriaRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getStratifier().size() < i1+1) { measure.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrGrpStrtfierCmpntCriteriaRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measure.getGroup().get(i0).getStratifier().get(i1).getComponent().size() < i2+1) { measure.getGroup().get(i0).getStratifier().get(i1).addComponent(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {measure.getGroup().get(i0).getStratifier().get(i1).getComponent().get(i2).getCriteria().setReference(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Msr_Grp_Strtfier_Cmpnt_Dscrptn ********************************************************************************/
		if(m.getMsrGrpStrtfierCmpntDscrptn() != null ) {

			String[] arrayi0 = m.getMsrGrpStrtfierCmpntDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpStrtfierCmpntDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getStratifier().size() < i1+1) { measure.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrGrpStrtfierCmpntDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measure.getGroup().get(i0).getStratifier().get(i1).getComponent().size() < i2+1) { measure.getGroup().get(i0).getStratifier().get(i1).addComponent(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {measure.getGroup().get(i0).getStratifier().get(i1).getComponent().get(i2).setDescription(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Msr_Grp_Strtfier_Criteria_Dscrptn ********************************************************************************/
		if(m.getMsrGrpStrtfierCriteriaDscrptn() != null ) {

			String[] arrayi0 = m.getMsrGrpStrtfierCriteriaDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpStrtfierCriteriaDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getStratifier().size() < i1+1) { measure.getGroup().get(i0).addStratifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getGroup().get(i0).getStratifier().get(i1).getCriteria().setDescription(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Grp_Strtfier_Criteria_Exprsn ********************************************************************************/
		if(m.getMsrGrpStrtfierCriteriaExprsn() != null ) {

			String[] arrayi0 = m.getMsrGrpStrtfierCriteriaExprsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpStrtfierCriteriaExprsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getStratifier().size() < i1+1) { measure.getGroup().get(i0).addStratifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getGroup().get(i0).getStratifier().get(i1).getCriteria().setExpression(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Grp_Strtfier_Criteria_Lnguage ********************************************************************************/
		if(m.getMsrGrpStrtfierCriteriaLnguage() != null ) {

			String[] arrayi0 = m.getMsrGrpStrtfierCriteriaLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpStrtfierCriteriaLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getStratifier().size() < i1+1) { measure.getGroup().get(i0).addStratifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getGroup().get(i0).getStratifier().get(i1).getCriteria().setLanguage(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Grp_Strtfier_Criteria_Nm ********************************************************************************/
		if(m.getMsrGrpStrtfierCriteriaNm() != null ) {

			String[] arrayi0 = m.getMsrGrpStrtfierCriteriaNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpStrtfierCriteriaNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getStratifier().size() < i1+1) { measure.getGroup().get(i0).addStratifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getGroup().get(i0).getStratifier().get(i1).getCriteria().setName(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Grp_Strtfier_Criteria_Rfrnc ********************************************************************************/
		if(m.getMsrGrpStrtfierCriteriaRfrnc() != null ) {

			String[] arrayi0 = m.getMsrGrpStrtfierCriteriaRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpStrtfierCriteriaRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getStratifier().size() < i1+1) { measure.getGroup().get(i0).addStratifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getGroup().get(i0).getStratifier().get(i1).getCriteria().setReference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Grp_Strtfier_Dscrptn ********************************************************************************/
		if(m.getMsrGrpStrtfierDscrptn() != null ) {

			String[] arrayi0 = m.getMsrGrpStrtfierDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getGroup().size() < i0+1) { measure.addGroup(); }
				String[] arrayi1 = m.getMsrGrpStrtfierDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getGroup().get(i0).getStratifier().size() < i1+1) { measure.getGroup().get(i0).addStratifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getGroup().get(i0).getStratifier().get(i1).setDescription(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Guidnce ********************************************************************************/
		if(m.getMsrGuidnce() != null ) {

			if(m.getMsrGuidnce().replace("[","").replace("]","").equals("NULL") | m.getMsrGuidnce()==null) {} else {
			measure.setGuidance(m.getMsrGuidnce().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Msr_Id_Assigner ********************************************************************************/
		if(m.getMsrIdAssigner() != null ) {

			String[] arrayi0 = m.getMsrIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getIdentifier().size() < i0+1) { measure.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Msr_Id_Prd_End ********************************************************************************/
		if(m.getMsrIdPrdEnd() != null ) {

			String[] arrayi0 = m.getMsrIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getIdentifier().size() < i0+1) { measure.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Msr_Id_Prd_Strt ********************************************************************************/
		if(m.getMsrIdPrdStrt() != null ) {

			String[] arrayi0 = m.getMsrIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getIdentifier().size() < i0+1) { measure.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Msr_Id_Sys ********************************************************************************/
		if(m.getMsrIdSys() != null ) {

			String[] arrayi0 = m.getMsrIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getIdentifier().size() < i0+1) { measure.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMsrIdTypCdgCd() != null ) {

			String[] arrayi0 = m.getMsrIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getIdentifier().size() < i0+1) { measure.addIdentifier(); }
				String[] arrayi1 = m.getMsrIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { measure.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMsrIdTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMsrIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getIdentifier().size() < i0+1) { measure.addIdentifier(); }
				String[] arrayi1 = m.getMsrIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { measure.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMsrIdTypCdgSys() != null ) {

			String[] arrayi0 = m.getMsrIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getIdentifier().size() < i0+1) { measure.addIdentifier(); }
				String[] arrayi1 = m.getMsrIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { measure.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMsrIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getIdentifier().size() < i0+1) { measure.addIdentifier(); }
				String[] arrayi1 = m.getMsrIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { measure.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Msr_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrIdTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMsrIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getIdentifier().size() < i0+1) { measure.addIdentifier(); }
				String[] arrayi1 = m.getMsrIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { measure.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Id_Typ_Txt ********************************************************************************/
		if(m.getMsrIdTypTxt() != null ) {

			String[] arrayi0 = m.getMsrIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getIdentifier().size() < i0+1) { measure.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_Id_Use ********************************************************************************/
		if(m.getMsrIdUse() != null ) {

			String[] arrayi0 = m.getMsrIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getIdentifier().size() < i0+1) { measure.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Msr_Id_Vl ********************************************************************************/
		if(m.getMsrIdVl() != null ) {

			String[] arrayi0 = m.getMsrIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getIdentifier().size() < i0+1) { measure.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_ImprovementNotation_Cdg_Cd ********************************************************************************/
		if(m.getMsrImprovementNotationCdgCd() != null ) {

			String[] arrayi0 = m.getMsrImprovementNotationCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getImprovementNotation().getCoding().size() < i0+1) { measure.getImprovementNotation().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getImprovementNotation().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_ImprovementNotation_Cdg_Dsply ********************************************************************************/
		if(m.getMsrImprovementNotationCdgDsply() != null ) {

			String[] arrayi0 = m.getMsrImprovementNotationCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getImprovementNotation().getCoding().size() < i0+1) { measure.getImprovementNotation().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getImprovementNotation().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_ImprovementNotation_Cdg_Sys ********************************************************************************/
		if(m.getMsrImprovementNotationCdgSys() != null ) {

			String[] arrayi0 = m.getMsrImprovementNotationCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getImprovementNotation().getCoding().size() < i0+1) { measure.getImprovementNotation().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getImprovementNotation().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_ImprovementNotation_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrImprovementNotationCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMsrImprovementNotationCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getImprovementNotation().getCoding().size() < i0+1) { measure.getImprovementNotation().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getImprovementNotation().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Msr_ImprovementNotation_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrImprovementNotationCdgVrsn() != null ) {

			String[] arrayi0 = m.getMsrImprovementNotationCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getImprovementNotation().getCoding().size() < i0+1) { measure.getImprovementNotation().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getImprovementNotation().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_ImprovementNotation_Txt ********************************************************************************/
		if(m.getMsrImprovementNotationTxt() != null ) {

			if(m.getMsrImprovementNotationTxt().replace("[","").replace("]","").equals("NULL") | m.getMsrImprovementNotationTxt()==null) {} else {
			measure.getImprovementNotation().setText(m.getMsrImprovementNotationTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Msr_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(m.getMsrJrsdctnCdgCd() != null ) {

			String[] arrayi0 = m.getMsrJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getJurisdiction().size() < i0+1) { measure.addJurisdiction(); }
				String[] arrayi1 = m.getMsrJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getJurisdiction().get(i0).getCoding().size() < i1+1) { measure.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getJurisdiction().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(m.getMsrJrsdctnCdgDsply() != null ) {

			String[] arrayi0 = m.getMsrJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getJurisdiction().size() < i0+1) { measure.addJurisdiction(); }
				String[] arrayi1 = m.getMsrJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getJurisdiction().get(i0).getCoding().size() < i1+1) { measure.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getJurisdiction().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(m.getMsrJrsdctnCdgSys() != null ) {

			String[] arrayi0 = m.getMsrJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getJurisdiction().size() < i0+1) { measure.addJurisdiction(); }
				String[] arrayi1 = m.getMsrJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getJurisdiction().get(i0).getCoding().size() < i1+1) { measure.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getJurisdiction().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrJrsdctnCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMsrJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getJurisdiction().size() < i0+1) { measure.addJurisdiction(); }
				String[] arrayi1 = m.getMsrJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getJurisdiction().get(i0).getCoding().size() < i1+1) { measure.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getJurisdiction().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Msr_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrJrsdctnCdgVrsn() != null ) {

			String[] arrayi0 = m.getMsrJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getJurisdiction().size() < i0+1) { measure.addJurisdiction(); }
				String[] arrayi1 = m.getMsrJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getJurisdiction().get(i0).getCoding().size() < i1+1) { measure.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getJurisdiction().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Jrsdctn_Txt ********************************************************************************/
		if(m.getMsrJrsdctnTxt() != null ) {

			String[] arrayi0 = m.getMsrJrsdctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getJurisdiction().size() < i0+1) { measure.addJurisdiction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getJurisdiction().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_LastReviewDt ********************************************************************************/
		if(m.getMsrLastReviewDt() != null ) {

			if(m.getMsrLastReviewDt().replace("[","").replace("]","").equals("NULL") | m.getMsrLastReviewDt()==null) {} else {
			measure.setLastReviewDate(m.getMsrLastReviewDt().replace("[","").replace("]","").equals("NULL") | m.getMsrLastReviewDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMsrLastReviewDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Msr_Library ********************************************************************************/
		if(m.getMsrLibrary() != null ) {

				for( String currListStrSplit : m.getMsrLibrary().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			measure.addLibrary(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** Msr_Nm ********************************************************************************/
		if(m.getMsrNm() != null ) {

			if(m.getMsrNm().replace("[","").replace("]","").equals("NULL") | m.getMsrNm()==null) {} else {
			measure.setName(m.getMsrNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Msr_Pblshr ********************************************************************************/
		if(m.getMsrPblshr() != null ) {

			if(m.getMsrPblshr().replace("[","").replace("]","").equals("NULL") | m.getMsrPblshr()==null) {} else {
			measure.setPublisher(m.getMsrPblshr().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Msr_Prpse ********************************************************************************/
		if(m.getMsrPrpse() != null ) {

			if(m.getMsrPrpse().replace("[","").replace("]","").equals("NULL") | m.getMsrPrpse()==null) {} else {
			measure.setPurpose(m.getMsrPrpse().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Msr_RtAggregation ********************************************************************************/
		if(m.getMsrRtAggregation() != null ) {

			if(m.getMsrRtAggregation().replace("[","").replace("]","").equals("NULL") | m.getMsrRtAggregation()==null) {} else {
			measure.setRateAggregation(m.getMsrRtAggregation().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Msr_Rtionale ********************************************************************************/
		if(m.getMsrRtionale() != null ) {

			if(m.getMsrRtionale().replace("[","").replace("]","").equals("NULL") | m.getMsrRtionale()==null) {} else {
			measure.setRationale(m.getMsrRtionale().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Msr_RltedArtfct_Citation ********************************************************************************/
		if(m.getMsrRltedArtfctCitation() != null ) {

			String[] arrayi0 = m.getMsrRltedArtfctCitation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getRelatedArtifact().size() < i0+1) { measure.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getRelatedArtifact().get(i0).setCitation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_RltedArtfct_Dsply ********************************************************************************/
		if(m.getMsrRltedArtfctDsply() != null ) {

			String[] arrayi0 = m.getMsrRltedArtfctDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getRelatedArtifact().size() < i0+1) { measure.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getRelatedArtifact().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(m.getMsrRltedArtfctDocCntntTyp() != null ) {

			String[] arrayi0 = m.getMsrRltedArtfctDocCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getRelatedArtifact().size() < i0+1) { measure.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getRelatedArtifact().get(i0).getDocument().setContentType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_RltedArtfct_Doc_Creation ********************************************************************************/
		if(m.getMsrRltedArtfctDocCreation() != null ) {

			String[] arrayi0 = m.getMsrRltedArtfctDocCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getRelatedArtifact().size() < i0+1) { measure.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getRelatedArtifact().get(i0).getDocument().setCreation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Msr_RltedArtfct_Doc_Data ********************************************************************************/
		if(m.getMsrRltedArtfctDocData() != null ) {

			String[] arrayi0 = m.getMsrRltedArtfctDocData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getRelatedArtifact().size() < i0+1) { measure.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getRelatedArtifact().get(i0).getDocument().setData(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** Msr_RltedArtfct_Doc_Hash ********************************************************************************/
		if(m.getMsrRltedArtfctDocHash() != null ) {

			String[] arrayi0 = m.getMsrRltedArtfctDocHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getRelatedArtifact().size() < i0+1) { measure.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getRelatedArtifact().get(i0).getDocument().setHash(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** Msr_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(m.getMsrRltedArtfctDocLnguage() != null ) {

			String[] arrayi0 = m.getMsrRltedArtfctDocLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getRelatedArtifact().size() < i0+1) { measure.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getRelatedArtifact().get(i0).getDocument().setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_RltedArtfct_Doc_Sz ********************************************************************************/
		if(m.getMsrRltedArtfctDocSz() != null ) {

			String[] arrayi0 = m.getMsrRltedArtfctDocSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getRelatedArtifact().size() < i0+1) { measure.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getRelatedArtifact().get(i0).getDocument().setSize(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Msr_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(m.getMsrRltedArtfctDocTtl() != null ) {

			String[] arrayi0 = m.getMsrRltedArtfctDocTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getRelatedArtifact().size() < i0+1) { measure.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getRelatedArtifact().get(i0).getDocument().setTitle(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_RltedArtfct_Doc_Url ********************************************************************************/
		if(m.getMsrRltedArtfctDocUrl() != null ) {

			String[] arrayi0 = m.getMsrRltedArtfctDocUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getRelatedArtifact().size() < i0+1) { measure.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getRelatedArtifact().get(i0).getDocument().setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_RltedArtfct_Lbl ********************************************************************************/
		if(m.getMsrRltedArtfctLbl() != null ) {

			String[] arrayi0 = m.getMsrRltedArtfctLbl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getRelatedArtifact().size() < i0+1) { measure.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getRelatedArtifact().get(i0).setLabel(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_RltedArtfct_Rsrc ********************************************************************************/
		if(m.getMsrRltedArtfctRsrc() != null ) {

			String[] arrayi0 = m.getMsrRltedArtfctRsrc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getRelatedArtifact().size() < i0+1) { measure.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getRelatedArtifact().get(i0).setResource(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_RltedArtfct_Typ ********************************************************************************/
		if(m.getMsrRltedArtfctTyp() != null ) {

			String[] arrayi0 = m.getMsrRltedArtfctTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getRelatedArtifact().size() < i0+1) { measure.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getRelatedArtifact().get(i0).setType(new org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Msr_RltedArtfct_Url ********************************************************************************/
		if(m.getMsrRltedArtfctUrl() != null ) {

			String[] arrayi0 = m.getMsrRltedArtfctUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getRelatedArtifact().size() < i0+1) { measure.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getRelatedArtifact().get(i0).setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_Rviewr_Nm ********************************************************************************/
		if(m.getMsrRviewrNm() != null ) {

			String[] arrayi0 = m.getMsrRviewrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getReviewer().size() < i0+1) { measure.addReviewer(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getReviewer().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(m.getMsrRviewrTlcmPrdEnd() != null ) {

			String[] arrayi0 = m.getMsrRviewrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getReviewer().size() < i0+1) { measure.addReviewer(); }
				String[] arrayi1 = m.getMsrRviewrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getReviewer().get(i0).getTelecom().size() < i1+1) { measure.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getReviewer().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Msr_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(m.getMsrRviewrTlcmPrdStrt() != null ) {

			String[] arrayi0 = m.getMsrRviewrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getReviewer().size() < i0+1) { measure.addReviewer(); }
				String[] arrayi1 = m.getMsrRviewrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getReviewer().get(i0).getTelecom().size() < i1+1) { measure.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getReviewer().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Msr_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(m.getMsrRviewrTlcmRnk() != null ) {

			String[] arrayi0 = m.getMsrRviewrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getReviewer().size() < i0+1) { measure.addReviewer(); }
				String[] arrayi1 = m.getMsrRviewrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getReviewer().get(i0).getTelecom().size() < i1+1) { measure.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getReviewer().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Msr_Rviewr_Tlcm_Sys ********************************************************************************/
		if(m.getMsrRviewrTlcmSys() != null ) {

			String[] arrayi0 = m.getMsrRviewrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getReviewer().size() < i0+1) { measure.addReviewer(); }
				String[] arrayi1 = m.getMsrRviewrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getReviewer().get(i0).getTelecom().size() < i1+1) { measure.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getReviewer().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Msr_Rviewr_Tlcm_Use ********************************************************************************/
		if(m.getMsrRviewrTlcmUse() != null ) {

			String[] arrayi0 = m.getMsrRviewrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getReviewer().size() < i0+1) { measure.addReviewer(); }
				String[] arrayi1 = m.getMsrRviewrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getReviewer().get(i0).getTelecom().size() < i1+1) { measure.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getReviewer().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Msr_Rviewr_Tlcm_Vl ********************************************************************************/
		if(m.getMsrRviewrTlcmVl() != null ) {

			String[] arrayi0 = m.getMsrRviewrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getReviewer().size() < i0+1) { measure.addReviewer(); }
				String[] arrayi1 = m.getMsrRviewrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getReviewer().get(i0).getTelecom().size() < i1+1) { measure.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getReviewer().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_RskAdjustment ********************************************************************************/
		if(m.getMsrRskAdjustment() != null ) {

			if(m.getMsrRskAdjustment().replace("[","").replace("]","").equals("NULL") | m.getMsrRskAdjustment()==null) {} else {
			measure.setRiskAdjustment(m.getMsrRskAdjustment().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Msr_Scoring_Cdg_Cd ********************************************************************************/
		if(m.getMsrScoringCdgCd() != null ) {

			String[] arrayi0 = m.getMsrScoringCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getScoring().getCoding().size() < i0+1) { measure.getScoring().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getScoring().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_Scoring_Cdg_Dsply ********************************************************************************/
		if(m.getMsrScoringCdgDsply() != null ) {

			String[] arrayi0 = m.getMsrScoringCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getScoring().getCoding().size() < i0+1) { measure.getScoring().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getScoring().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_Scoring_Cdg_Sys ********************************************************************************/
		if(m.getMsrScoringCdgSys() != null ) {

			String[] arrayi0 = m.getMsrScoringCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getScoring().getCoding().size() < i0+1) { measure.getScoring().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getScoring().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_Scoring_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrScoringCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMsrScoringCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getScoring().getCoding().size() < i0+1) { measure.getScoring().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getScoring().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Msr_Scoring_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrScoringCdgVrsn() != null ) {

			String[] arrayi0 = m.getMsrScoringCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getScoring().getCoding().size() < i0+1) { measure.getScoring().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getScoring().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_Scoring_Txt ********************************************************************************/
		if(m.getMsrScoringTxt() != null ) {

			if(m.getMsrScoringTxt().replace("[","").replace("]","").equals("NULL") | m.getMsrScoringTxt()==null) {} else {
			measure.getScoring().setText(m.getMsrScoringTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Msr_Sts ********************************************************************************/
		if(m.getMsrSts() != null ) {

			if(m.getMsrSts().replace("[","").replace("]","").equals("NULL") | m.getMsrSts()==null) {} else {
			measure.setStatus(new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory().fromCode(m.getMsrSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Msr_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMsrSbjctCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = m.getMsrSbjctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getSubjectCodeableConcept().getCoding().size() < i0+1) { measure.getSubjectCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getSubjectCodeableConcept().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMsrSbjctCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = m.getMsrSbjctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getSubjectCodeableConcept().getCoding().size() < i0+1) { measure.getSubjectCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getSubjectCodeableConcept().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMsrSbjctCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = m.getMsrSbjctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getSubjectCodeableConcept().getCoding().size() < i0+1) { measure.getSubjectCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getSubjectCodeableConcept().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrSbjctCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMsrSbjctCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getSubjectCodeableConcept().getCoding().size() < i0+1) { measure.getSubjectCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getSubjectCodeableConcept().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Msr_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrSbjctCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = m.getMsrSbjctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getSubjectCodeableConcept().getCoding().size() < i0+1) { measure.getSubjectCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getSubjectCodeableConcept().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(m.getMsrSbjctCdbleCncptTxt() != null ) {

			if(m.getMsrSbjctCdbleCncptTxt().replace("[","").replace("]","").equals("NULL") | m.getMsrSbjctCdbleCncptTxt()==null) {} else {
			measure.getSubjectCodeableConcept().setText(m.getMsrSbjctCdbleCncptTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Msr_SbjctRfrnc ********************************************************************************/
		if(m.getMsrSbjctRfrnc() != null ) {

			if(m.getMsrSbjctRfrnc().replace("[","").replace("]","").equals("NULL") | m.getMsrSbjctRfrnc()==null) {} else {
			measure.setSubject(new org.hl7.fhir.r4.model.Reference(m.getMsrSbjctRfrnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Msr_Subtitle ********************************************************************************/
		if(m.getMsrSubtitle() != null ) {

			if(m.getMsrSubtitle().replace("[","").replace("]","").equals("NULL") | m.getMsrSubtitle()==null) {} else {
			measure.setSubtitle(m.getMsrSubtitle().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Msr_SupplementalData_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMsrSupplementalDataCdCdgCd() != null ) {

			String[] arrayi0 = m.getMsrSupplementalDataCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getSupplementalData().size() < i0+1) { measure.addSupplementalData(); }
				String[] arrayi1 = m.getMsrSupplementalDataCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getSupplementalData().get(i0).getCode().getCoding().size() < i1+1) { measure.getSupplementalData().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getSupplementalData().get(i0).getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_SupplementalData_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMsrSupplementalDataCdCdgDsply() != null ) {

			String[] arrayi0 = m.getMsrSupplementalDataCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getSupplementalData().size() < i0+1) { measure.addSupplementalData(); }
				String[] arrayi1 = m.getMsrSupplementalDataCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getSupplementalData().get(i0).getCode().getCoding().size() < i1+1) { measure.getSupplementalData().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getSupplementalData().get(i0).getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_SupplementalData_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMsrSupplementalDataCdCdgSys() != null ) {

			String[] arrayi0 = m.getMsrSupplementalDataCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getSupplementalData().size() < i0+1) { measure.addSupplementalData(); }
				String[] arrayi1 = m.getMsrSupplementalDataCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getSupplementalData().get(i0).getCode().getCoding().size() < i1+1) { measure.getSupplementalData().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getSupplementalData().get(i0).getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_SupplementalData_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrSupplementalDataCdCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMsrSupplementalDataCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getSupplementalData().size() < i0+1) { measure.addSupplementalData(); }
				String[] arrayi1 = m.getMsrSupplementalDataCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getSupplementalData().get(i0).getCode().getCoding().size() < i1+1) { measure.getSupplementalData().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getSupplementalData().get(i0).getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Msr_SupplementalData_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrSupplementalDataCdCdgVrsn() != null ) {

			String[] arrayi0 = m.getMsrSupplementalDataCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getSupplementalData().size() < i0+1) { measure.addSupplementalData(); }
				String[] arrayi1 = m.getMsrSupplementalDataCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getSupplementalData().get(i0).getCode().getCoding().size() < i1+1) { measure.getSupplementalData().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getSupplementalData().get(i0).getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_SupplementalData_Cd_Txt ********************************************************************************/
		if(m.getMsrSupplementalDataCdTxt() != null ) {

			String[] arrayi0 = m.getMsrSupplementalDataCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getSupplementalData().size() < i0+1) { measure.addSupplementalData(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getSupplementalData().get(i0).getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_SupplementalData_Criteria_Dscrptn ********************************************************************************/
		if(m.getMsrSupplementalDataCriteriaDscrptn() != null ) {

			String[] arrayi0 = m.getMsrSupplementalDataCriteriaDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getSupplementalData().size() < i0+1) { measure.addSupplementalData(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getSupplementalData().get(i0).getCriteria().setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_SupplementalData_Criteria_Exprsn ********************************************************************************/
		if(m.getMsrSupplementalDataCriteriaExprsn() != null ) {

			String[] arrayi0 = m.getMsrSupplementalDataCriteriaExprsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getSupplementalData().size() < i0+1) { measure.addSupplementalData(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getSupplementalData().get(i0).getCriteria().setExpression(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_SupplementalData_Criteria_Lnguage ********************************************************************************/
		if(m.getMsrSupplementalDataCriteriaLnguage() != null ) {

			String[] arrayi0 = m.getMsrSupplementalDataCriteriaLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getSupplementalData().size() < i0+1) { measure.addSupplementalData(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getSupplementalData().get(i0).getCriteria().setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_SupplementalData_Criteria_Nm ********************************************************************************/
		if(m.getMsrSupplementalDataCriteriaNm() != null ) {

			String[] arrayi0 = m.getMsrSupplementalDataCriteriaNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getSupplementalData().size() < i0+1) { measure.addSupplementalData(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getSupplementalData().get(i0).getCriteria().setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_SupplementalData_Criteria_Rfrnc ********************************************************************************/
		if(m.getMsrSupplementalDataCriteriaRfrnc() != null ) {

			String[] arrayi0 = m.getMsrSupplementalDataCriteriaRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getSupplementalData().size() < i0+1) { measure.addSupplementalData(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getSupplementalData().get(i0).getCriteria().setReference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_SupplementalData_Dscrptn ********************************************************************************/
		if(m.getMsrSupplementalDataDscrptn() != null ) {

			String[] arrayi0 = m.getMsrSupplementalDataDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getSupplementalData().size() < i0+1) { measure.addSupplementalData(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getSupplementalData().get(i0).setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_SupplementalData_Usg_Cdg_Cd ********************************************************************************/
		if(m.getMsrSupplementalDataUsgCdgCd() != null ) {

			String[] arrayi0 = m.getMsrSupplementalDataUsgCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getSupplementalData().size() < i0+1) { measure.addSupplementalData(); }
				String[] arrayi1 = m.getMsrSupplementalDataUsgCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getSupplementalData().get(i0).getUsage().size() < i1+1) { measure.getSupplementalData().get(i0).addUsage(); }
					String[] arrayi2 = m.getMsrSupplementalDataUsgCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measure.getSupplementalData().get(i0).getUsage().get(i1).getCoding().size() < i2+1) { measure.getSupplementalData().get(i0).getUsage().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {measure.getSupplementalData().get(i0).getUsage().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Msr_SupplementalData_Usg_Cdg_Dsply ********************************************************************************/
		if(m.getMsrSupplementalDataUsgCdgDsply() != null ) {

			String[] arrayi0 = m.getMsrSupplementalDataUsgCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getSupplementalData().size() < i0+1) { measure.addSupplementalData(); }
				String[] arrayi1 = m.getMsrSupplementalDataUsgCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getSupplementalData().get(i0).getUsage().size() < i1+1) { measure.getSupplementalData().get(i0).addUsage(); }
					String[] arrayi2 = m.getMsrSupplementalDataUsgCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measure.getSupplementalData().get(i0).getUsage().get(i1).getCoding().size() < i2+1) { measure.getSupplementalData().get(i0).getUsage().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {measure.getSupplementalData().get(i0).getUsage().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Msr_SupplementalData_Usg_Cdg_Sys ********************************************************************************/
		if(m.getMsrSupplementalDataUsgCdgSys() != null ) {

			String[] arrayi0 = m.getMsrSupplementalDataUsgCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getSupplementalData().size() < i0+1) { measure.addSupplementalData(); }
				String[] arrayi1 = m.getMsrSupplementalDataUsgCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getSupplementalData().get(i0).getUsage().size() < i1+1) { measure.getSupplementalData().get(i0).addUsage(); }
					String[] arrayi2 = m.getMsrSupplementalDataUsgCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measure.getSupplementalData().get(i0).getUsage().get(i1).getCoding().size() < i2+1) { measure.getSupplementalData().get(i0).getUsage().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {measure.getSupplementalData().get(i0).getUsage().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Msr_SupplementalData_Usg_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrSupplementalDataUsgCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMsrSupplementalDataUsgCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getSupplementalData().size() < i0+1) { measure.addSupplementalData(); }
				String[] arrayi1 = m.getMsrSupplementalDataUsgCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getSupplementalData().get(i0).getUsage().size() < i1+1) { measure.getSupplementalData().get(i0).addUsage(); }
					String[] arrayi2 = m.getMsrSupplementalDataUsgCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measure.getSupplementalData().get(i0).getUsage().get(i1).getCoding().size() < i2+1) { measure.getSupplementalData().get(i0).getUsage().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {measure.getSupplementalData().get(i0).getUsage().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Msr_SupplementalData_Usg_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrSupplementalDataUsgCdgVrsn() != null ) {

			String[] arrayi0 = m.getMsrSupplementalDataUsgCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getSupplementalData().size() < i0+1) { measure.addSupplementalData(); }
				String[] arrayi1 = m.getMsrSupplementalDataUsgCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getSupplementalData().get(i0).getUsage().size() < i1+1) { measure.getSupplementalData().get(i0).addUsage(); }
					String[] arrayi2 = m.getMsrSupplementalDataUsgCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measure.getSupplementalData().get(i0).getUsage().get(i1).getCoding().size() < i2+1) { measure.getSupplementalData().get(i0).getUsage().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {measure.getSupplementalData().get(i0).getUsage().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Msr_SupplementalData_Usg_Txt ********************************************************************************/
		if(m.getMsrSupplementalDataUsgTxt() != null ) {

			String[] arrayi0 = m.getMsrSupplementalDataUsgTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getSupplementalData().size() < i0+1) { measure.addSupplementalData(); }
				String[] arrayi1 = m.getMsrSupplementalDataUsgTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getSupplementalData().get(i0).getUsage().size() < i1+1) { measure.getSupplementalData().get(i0).addUsage(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getSupplementalData().get(i0).getUsage().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Ttl ********************************************************************************/
		if(m.getMsrTtl() != null ) {

			if(m.getMsrTtl().replace("[","").replace("]","").equals("NULL") | m.getMsrTtl()==null) {} else {
			measure.setTitle(m.getMsrTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Msr_Topic_Cdg_Cd ********************************************************************************/
		if(m.getMsrTopicCdgCd() != null ) {

			String[] arrayi0 = m.getMsrTopicCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getTopic().size() < i0+1) { measure.addTopic(); }
				String[] arrayi1 = m.getMsrTopicCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getTopic().get(i0).getCoding().size() < i1+1) { measure.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getTopic().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Topic_Cdg_Dsply ********************************************************************************/
		if(m.getMsrTopicCdgDsply() != null ) {

			String[] arrayi0 = m.getMsrTopicCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getTopic().size() < i0+1) { measure.addTopic(); }
				String[] arrayi1 = m.getMsrTopicCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getTopic().get(i0).getCoding().size() < i1+1) { measure.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getTopic().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Topic_Cdg_Sys ********************************************************************************/
		if(m.getMsrTopicCdgSys() != null ) {

			String[] arrayi0 = m.getMsrTopicCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getTopic().size() < i0+1) { measure.addTopic(); }
				String[] arrayi1 = m.getMsrTopicCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getTopic().get(i0).getCoding().size() < i1+1) { measure.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getTopic().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Topic_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrTopicCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMsrTopicCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getTopic().size() < i0+1) { measure.addTopic(); }
				String[] arrayi1 = m.getMsrTopicCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getTopic().get(i0).getCoding().size() < i1+1) { measure.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getTopic().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Msr_Topic_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrTopicCdgVrsn() != null ) {

			String[] arrayi0 = m.getMsrTopicCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getTopic().size() < i0+1) { measure.addTopic(); }
				String[] arrayi1 = m.getMsrTopicCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getTopic().get(i0).getCoding().size() < i1+1) { measure.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getTopic().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Topic_Txt ********************************************************************************/
		if(m.getMsrTopicTxt() != null ) {

			String[] arrayi0 = m.getMsrTopicTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getTopic().size() < i0+1) { measure.addTopic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getTopic().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMsrTypCdgCd() != null ) {

			String[] arrayi0 = m.getMsrTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getType().size() < i0+1) { measure.addType(); }
				String[] arrayi1 = m.getMsrTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getType().get(i0).getCoding().size() < i1+1) { measure.getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getType().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMsrTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMsrTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getType().size() < i0+1) { measure.addType(); }
				String[] arrayi1 = m.getMsrTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getType().get(i0).getCoding().size() < i1+1) { measure.getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getType().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMsrTypCdgSys() != null ) {

			String[] arrayi0 = m.getMsrTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getType().size() < i0+1) { measure.addType(); }
				String[] arrayi1 = m.getMsrTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getType().get(i0).getCoding().size() < i1+1) { measure.getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getType().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMsrTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getType().size() < i0+1) { measure.addType(); }
				String[] arrayi1 = m.getMsrTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getType().get(i0).getCoding().size() < i1+1) { measure.getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getType().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Msr_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMsrTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getType().size() < i0+1) { measure.addType(); }
				String[] arrayi1 = m.getMsrTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getType().get(i0).getCoding().size() < i1+1) { measure.getType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getType().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_Typ_Txt ********************************************************************************/
		if(m.getMsrTypTxt() != null ) {

			String[] arrayi0 = m.getMsrTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getType().size() < i0+1) { measure.addType(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getType().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_Url ********************************************************************************/
		if(m.getMsrUrl() != null ) {

			if(m.getMsrUrl().replace("[","").replace("]","").equals("NULL") | m.getMsrUrl()==null) {} else {
			measure.setUrl(m.getMsrUrl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Msr_Usg ********************************************************************************/
		if(m.getMsrUsg() != null ) {

			if(m.getMsrUsg().replace("[","").replace("]","").equals("NULL") | m.getMsrUsg()==null) {} else {
			measure.setUsage(m.getMsrUsg().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Msr_UseCntxt_Cd_Cd ********************************************************************************/
		if(m.getMsrUseCntxtCdCd() != null ) {

			String[] arrayi0 = m.getMsrUseCntxtCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getUseContext().size() < i0+1) { measure.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getUseContext().get(i0).getCode().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_UseCntxt_Cd_Dsply ********************************************************************************/
		if(m.getMsrUseCntxtCdDsply() != null ) {

			String[] arrayi0 = m.getMsrUseCntxtCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getUseContext().size() < i0+1) { measure.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getUseContext().get(i0).getCode().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_UseCntxt_Cd_Sys ********************************************************************************/
		if(m.getMsrUseCntxtCdSys() != null ) {

			String[] arrayi0 = m.getMsrUseCntxtCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getUseContext().size() < i0+1) { measure.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getUseContext().get(i0).getCode().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(m.getMsrUseCntxtCdUsrSltd() != null ) {

			String[] arrayi0 = m.getMsrUseCntxtCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getUseContext().size() < i0+1) { measure.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getUseContext().get(i0).getCode().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Msr_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(m.getMsrUseCntxtCdVrsn() != null ) {

			String[] arrayi0 = m.getMsrUseCntxtCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getUseContext().size() < i0+1) { measure.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getUseContext().get(i0).getCode().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMsrUseCntxtVlCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = m.getMsrUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getUseContext().size() < i0+1) { measure.addUseContext(); }
				String[] arrayi1 = m.getMsrUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { measure.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMsrUseCntxtVlCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = m.getMsrUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getUseContext().size() < i0+1) { measure.addUseContext(); }
				String[] arrayi1 = m.getMsrUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { measure.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMsrUseCntxtVlCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = m.getMsrUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getUseContext().size() < i0+1) { measure.addUseContext(); }
				String[] arrayi1 = m.getMsrUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { measure.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrUseCntxtVlCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMsrUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getUseContext().size() < i0+1) { measure.addUseContext(); }
				String[] arrayi1 = m.getMsrUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { measure.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Msr_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrUseCntxtVlCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = m.getMsrUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getUseContext().size() < i0+1) { measure.addUseContext(); }
				String[] arrayi1 = m.getMsrUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measure.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { measure.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measure.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Msr_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(m.getMsrUseCntxtVlCdbleCncptTxt() != null ) {

			String[] arrayi0 = m.getMsrUseCntxtVlCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getUseContext().size() < i0+1) { measure.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getUseContext().get(i0).getValueCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(m.getMsrUseCntxtVlQntyCd() != null ) {

			String[] arrayi0 = m.getMsrUseCntxtVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getUseContext().size() < i0+1) { measure.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getUseContext().get(i0).getValueQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_UseCntxt_VlQnty_Cmprtr ********************************************************************************/
		if(m.getMsrUseCntxtVlQntyCmprtr() != null ) {

			String[] arrayi0 = m.getMsrUseCntxtVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getUseContext().size() < i0+1) { measure.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getUseContext().get(i0).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Msr_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(m.getMsrUseCntxtVlQntySys() != null ) {

			String[] arrayi0 = m.getMsrUseCntxtVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getUseContext().size() < i0+1) { measure.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getUseContext().get(i0).getValueQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(m.getMsrUseCntxtVlQntyUnt() != null ) {

			String[] arrayi0 = m.getMsrUseCntxtVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getUseContext().size() < i0+1) { measure.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getUseContext().get(i0).getValueQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(m.getMsrUseCntxtVlQntyVl() != null ) {

			String[] arrayi0 = m.getMsrUseCntxtVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getUseContext().size() < i0+1) { measure.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getUseContext().get(i0).getValueQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Msr_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(m.getMsrUseCntxtVlRngHiCd() != null ) {

			String[] arrayi0 = m.getMsrUseCntxtVlRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getUseContext().size() < i0+1) { measure.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getUseContext().get(i0).getValueRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_UseCntxt_VlRng_Hi_Cmprtr ********************************************************************************/
		if(m.getMsrUseCntxtVlRngHiCmprtr() != null ) {

			String[] arrayi0 = m.getMsrUseCntxtVlRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getUseContext().size() < i0+1) { measure.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getUseContext().get(i0).getValueRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Msr_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(m.getMsrUseCntxtVlRngHiSys() != null ) {

			String[] arrayi0 = m.getMsrUseCntxtVlRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getUseContext().size() < i0+1) { measure.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getUseContext().get(i0).getValueRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(m.getMsrUseCntxtVlRngHiUnt() != null ) {

			String[] arrayi0 = m.getMsrUseCntxtVlRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getUseContext().size() < i0+1) { measure.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getUseContext().get(i0).getValueRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(m.getMsrUseCntxtVlRngHiVl() != null ) {

			String[] arrayi0 = m.getMsrUseCntxtVlRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getUseContext().size() < i0+1) { measure.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getUseContext().get(i0).getValueRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Msr_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(m.getMsrUseCntxtVlRngLwCd() != null ) {

			String[] arrayi0 = m.getMsrUseCntxtVlRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getUseContext().size() < i0+1) { measure.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getUseContext().get(i0).getValueRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_UseCntxt_VlRng_Lw_Cmprtr ********************************************************************************/
		if(m.getMsrUseCntxtVlRngLwCmprtr() != null ) {

			String[] arrayi0 = m.getMsrUseCntxtVlRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getUseContext().size() < i0+1) { measure.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getUseContext().get(i0).getValueRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Msr_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(m.getMsrUseCntxtVlRngLwSys() != null ) {

			String[] arrayi0 = m.getMsrUseCntxtVlRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getUseContext().size() < i0+1) { measure.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getUseContext().get(i0).getValueRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(m.getMsrUseCntxtVlRngLwUnt() != null ) {

			String[] arrayi0 = m.getMsrUseCntxtVlRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getUseContext().size() < i0+1) { measure.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getUseContext().get(i0).getValueRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Msr_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(m.getMsrUseCntxtVlRngLwVl() != null ) {

			String[] arrayi0 = m.getMsrUseCntxtVlRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getUseContext().size() < i0+1) { measure.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getUseContext().get(i0).getValueRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Msr_UseCntxt_VlRfrnc ********************************************************************************/
		if(m.getMsrUseCntxtVlRfrnc() != null ) {

			String[] arrayi0 = m.getMsrUseCntxtVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measure.getUseContext().size() < i0+1) { measure.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measure.getUseContext().get(i0).setValue(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Msr_Vrsn ********************************************************************************/
		if(m.getMsrVrsn() != null ) {

			if(m.getMsrVrsn().replace("[","").replace("]","").equals("NULL") | m.getMsrVrsn()==null) {} else {
			measure.setVersion(m.getMsrVrsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return measure;
	}
}
