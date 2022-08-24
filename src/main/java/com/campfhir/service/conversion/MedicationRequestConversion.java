package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicationRequest;
public class MedicationRequestConversion 
{
	public org.hl7.fhir.r4.model.MedicationRequest MedicationRequests(MedicationRequest m) throws ParseException
	{
		org.hl7.fhir.r4.model.MedicationRequest medicationrequest = new org.hl7.fhir.r4.model.MedicationRequest();

		/******************** id ********************************************************************************/
		medicationrequest.setId(m.getId());

		/******************** MdctnRqst_AthredOn ********************************************************************************/
		if(m.getMdctnRqstAthredOn() != null ) {

			if(m.getMdctnRqstAthredOn().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstAthredOn()==null) {} else {
			medicationrequest.setAuthoredOn(m.getMdctnRqstAthredOn().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstAthredOn()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMdctnRqstAthredOn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnRqst_BasedOn ********************************************************************************/
		if(m.getMdctnRqstBasedOn() != null ) {

				for( String currListStrSplit : m.getMdctnRqstBasedOn().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicationrequest.addBasedOn(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdctnRqst_Ctgry_Cdg_Cd ********************************************************************************/
		if(m.getMdctnRqstCtgryCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnRqstCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getCategory().size() < i0+1) { medicationrequest.addCategory(); }
				String[] arrayi1 = m.getMdctnRqstCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getCategory().get(i0).getCoding().size() < i1+1) { medicationrequest.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getCategory().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_Ctgry_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnRqstCtgryCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnRqstCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getCategory().size() < i0+1) { medicationrequest.addCategory(); }
				String[] arrayi1 = m.getMdctnRqstCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getCategory().get(i0).getCoding().size() < i1+1) { medicationrequest.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getCategory().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_Ctgry_Cdg_Sys ********************************************************************************/
		if(m.getMdctnRqstCtgryCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnRqstCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getCategory().size() < i0+1) { medicationrequest.addCategory(); }
				String[] arrayi1 = m.getMdctnRqstCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getCategory().get(i0).getCoding().size() < i1+1) { medicationrequest.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getCategory().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnRqstCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnRqstCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getCategory().size() < i0+1) { medicationrequest.addCategory(); }
				String[] arrayi1 = m.getMdctnRqstCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getCategory().get(i0).getCoding().size() < i1+1) { medicationrequest.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getCategory().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnRqst_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnRqstCtgryCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnRqstCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getCategory().size() < i0+1) { medicationrequest.addCategory(); }
				String[] arrayi1 = m.getMdctnRqstCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getCategory().get(i0).getCoding().size() < i1+1) { medicationrequest.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getCategory().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_Ctgry_Txt ********************************************************************************/
		if(m.getMdctnRqstCtgryTxt() != null ) {

			String[] arrayi0 = m.getMdctnRqstCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getCategory().size() < i0+1) { medicationrequest.addCategory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getCategory().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_CourseOfThrpyTyp_Cdg_Cd ********************************************************************************/
		if(m.getMdctnRqstCourseOfThrpyTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnRqstCourseOfThrpyTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getCourseOfTherapyType().getCoding().size() < i0+1) { medicationrequest.getCourseOfTherapyType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getCourseOfTherapyType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_CourseOfThrpyTyp_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnRqstCourseOfThrpyTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnRqstCourseOfThrpyTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getCourseOfTherapyType().getCoding().size() < i0+1) { medicationrequest.getCourseOfTherapyType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getCourseOfTherapyType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_CourseOfThrpyTyp_Cdg_Sys ********************************************************************************/
		if(m.getMdctnRqstCourseOfThrpyTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnRqstCourseOfThrpyTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getCourseOfTherapyType().getCoding().size() < i0+1) { medicationrequest.getCourseOfTherapyType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getCourseOfTherapyType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_CourseOfThrpyTyp_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnRqstCourseOfThrpyTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnRqstCourseOfThrpyTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getCourseOfTherapyType().getCoding().size() < i0+1) { medicationrequest.getCourseOfTherapyType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getCourseOfTherapyType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnRqst_CourseOfThrpyTyp_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnRqstCourseOfThrpyTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnRqstCourseOfThrpyTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getCourseOfTherapyType().getCoding().size() < i0+1) { medicationrequest.getCourseOfTherapyType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getCourseOfTherapyType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_CourseOfThrpyTyp_Txt ********************************************************************************/
		if(m.getMdctnRqstCourseOfThrpyTypTxt() != null ) {

			if(m.getMdctnRqstCourseOfThrpyTypTxt().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstCourseOfThrpyTypTxt()==null) {} else {
			medicationrequest.getCourseOfTherapyType().setText(m.getMdctnRqstCourseOfThrpyTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnRqst_DetectedIssue ********************************************************************************/
		if(m.getMdctnRqstDetectedIssue() != null ) {

				for( String currListStrSplit : m.getMdctnRqstDetectedIssue().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicationrequest.addDetectedIssue(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdctnRqst_DispnsRqst_DispnsInterval_Cd ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstDispnsIntervalCd() != null ) {

			if(m.getMdctnRqstDispnsRqstDispnsIntervalCd().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstDispnsRqstDispnsIntervalCd()==null) {} else {
			medicationrequest.getDispenseRequest().getDispenseInterval().setCode(m.getMdctnRqstDispnsRqstDispnsIntervalCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnRqst_DispnsRqst_DispnsInterval_Cmprtr ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstDispnsIntervalCmprtr() != null ) {

			if(m.getMdctnRqstDispnsRqstDispnsIntervalCmprtr().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstDispnsRqstDispnsIntervalCmprtr()==null) {} else {
			medicationrequest.getDispenseRequest().getDispenseInterval().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(m.getMdctnRqstDispnsRqstDispnsIntervalCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnRqst_DispnsRqst_DispnsInterval_Sys ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstDispnsIntervalSys() != null ) {

			if(m.getMdctnRqstDispnsRqstDispnsIntervalSys().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstDispnsRqstDispnsIntervalSys()==null) {} else {
			medicationrequest.getDispenseRequest().getDispenseInterval().setSystem(m.getMdctnRqstDispnsRqstDispnsIntervalSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnRqst_DispnsRqst_DispnsInterval_Unt ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstDispnsIntervalUnt() != null ) {

			if(m.getMdctnRqstDispnsRqstDispnsIntervalUnt().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstDispnsRqstDispnsIntervalUnt()==null) {} else {
			medicationrequest.getDispenseRequest().getDispenseInterval().setUnit(m.getMdctnRqstDispnsRqstDispnsIntervalUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnRqst_DispnsRqst_DispnsInterval_Vl ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstDispnsIntervalVl() != null ) {

			if(m.getMdctnRqstDispnsRqstDispnsIntervalVl().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstDispnsRqstDispnsIntervalVl()==null) {} else {
			medicationrequest.getDispenseRequest().getDispenseInterval().setValue((new java.math.BigDecimal((m.getMdctnRqstDispnsRqstDispnsIntervalVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** MdctnRqst_DispnsRqst_ExpectedSpplyDuration_Cd ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstExpectedSpplyDurationCd() != null ) {

			if(m.getMdctnRqstDispnsRqstExpectedSpplyDurationCd().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstDispnsRqstExpectedSpplyDurationCd()==null) {} else {
			medicationrequest.getDispenseRequest().getExpectedSupplyDuration().setCode(m.getMdctnRqstDispnsRqstExpectedSpplyDurationCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnRqst_DispnsRqst_ExpectedSpplyDuration_Cmprtr ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstExpectedSpplyDurationCmprtr() != null ) {

			if(m.getMdctnRqstDispnsRqstExpectedSpplyDurationCmprtr().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstDispnsRqstExpectedSpplyDurationCmprtr()==null) {} else {
			medicationrequest.getDispenseRequest().getExpectedSupplyDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(m.getMdctnRqstDispnsRqstExpectedSpplyDurationCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnRqst_DispnsRqst_ExpectedSpplyDuration_Sys ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstExpectedSpplyDurationSys() != null ) {

			if(m.getMdctnRqstDispnsRqstExpectedSpplyDurationSys().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstDispnsRqstExpectedSpplyDurationSys()==null) {} else {
			medicationrequest.getDispenseRequest().getExpectedSupplyDuration().setSystem(m.getMdctnRqstDispnsRqstExpectedSpplyDurationSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnRqst_DispnsRqst_ExpectedSpplyDuration_Unt ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstExpectedSpplyDurationUnt() != null ) {

			if(m.getMdctnRqstDispnsRqstExpectedSpplyDurationUnt().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstDispnsRqstExpectedSpplyDurationUnt()==null) {} else {
			medicationrequest.getDispenseRequest().getExpectedSupplyDuration().setUnit(m.getMdctnRqstDispnsRqstExpectedSpplyDurationUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnRqst_DispnsRqst_ExpectedSpplyDuration_Vl ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstExpectedSpplyDurationVl() != null ) {

			if(m.getMdctnRqstDispnsRqstExpectedSpplyDurationVl().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstDispnsRqstExpectedSpplyDurationVl()==null) {} else {
			medicationrequest.getDispenseRequest().getExpectedSupplyDuration().setValue((new java.math.BigDecimal((m.getMdctnRqstDispnsRqstExpectedSpplyDurationVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** MdctnRqst_DispnsRqst_InitialFill_Duration_Cd ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstInitialFillDurationCd() != null ) {

			if(m.getMdctnRqstDispnsRqstInitialFillDurationCd().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstDispnsRqstInitialFillDurationCd()==null) {} else {
			medicationrequest.getDispenseRequest().getInitialFill().getDuration().setCode(m.getMdctnRqstDispnsRqstInitialFillDurationCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnRqst_DispnsRqst_InitialFill_Duration_Cmprtr ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstInitialFillDurationCmprtr() != null ) {

			if(m.getMdctnRqstDispnsRqstInitialFillDurationCmprtr().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstDispnsRqstInitialFillDurationCmprtr()==null) {} else {
			medicationrequest.getDispenseRequest().getInitialFill().getDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(m.getMdctnRqstDispnsRqstInitialFillDurationCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnRqst_DispnsRqst_InitialFill_Duration_Sys ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstInitialFillDurationSys() != null ) {

			if(m.getMdctnRqstDispnsRqstInitialFillDurationSys().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstDispnsRqstInitialFillDurationSys()==null) {} else {
			medicationrequest.getDispenseRequest().getInitialFill().getDuration().setSystem(m.getMdctnRqstDispnsRqstInitialFillDurationSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnRqst_DispnsRqst_InitialFill_Duration_Unt ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstInitialFillDurationUnt() != null ) {

			if(m.getMdctnRqstDispnsRqstInitialFillDurationUnt().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstDispnsRqstInitialFillDurationUnt()==null) {} else {
			medicationrequest.getDispenseRequest().getInitialFill().getDuration().setUnit(m.getMdctnRqstDispnsRqstInitialFillDurationUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnRqst_DispnsRqst_InitialFill_Duration_Vl ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstInitialFillDurationVl() != null ) {

			if(m.getMdctnRqstDispnsRqstInitialFillDurationVl().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstDispnsRqstInitialFillDurationVl()==null) {} else {
			medicationrequest.getDispenseRequest().getInitialFill().getDuration().setValue((new java.math.BigDecimal((m.getMdctnRqstDispnsRqstInitialFillDurationVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** MdctnRqst_DispnsRqst_InitialFill_Qnty_Cd ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstInitialFillQntyCd() != null ) {

			if(m.getMdctnRqstDispnsRqstInitialFillQntyCd().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstDispnsRqstInitialFillQntyCd()==null) {} else {
			medicationrequest.getDispenseRequest().getInitialFill().getQuantity().setCode(m.getMdctnRqstDispnsRqstInitialFillQntyCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnRqst_DispnsRqst_InitialFill_Qnty_Cmprtr ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstInitialFillQntyCmprtr() != null ) {

			if(m.getMdctnRqstDispnsRqstInitialFillQntyCmprtr().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstDispnsRqstInitialFillQntyCmprtr()==null) {} else {
			medicationrequest.getDispenseRequest().getInitialFill().getQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(m.getMdctnRqstDispnsRqstInitialFillQntyCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnRqst_DispnsRqst_InitialFill_Qnty_Sys ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstInitialFillQntySys() != null ) {

			if(m.getMdctnRqstDispnsRqstInitialFillQntySys().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstDispnsRqstInitialFillQntySys()==null) {} else {
			medicationrequest.getDispenseRequest().getInitialFill().getQuantity().setSystem(m.getMdctnRqstDispnsRqstInitialFillQntySys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnRqst_DispnsRqst_InitialFill_Qnty_Unt ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstInitialFillQntyUnt() != null ) {

			if(m.getMdctnRqstDispnsRqstInitialFillQntyUnt().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstDispnsRqstInitialFillQntyUnt()==null) {} else {
			medicationrequest.getDispenseRequest().getInitialFill().getQuantity().setUnit(m.getMdctnRqstDispnsRqstInitialFillQntyUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnRqst_DispnsRqst_InitialFill_Qnty_Vl ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstInitialFillQntyVl() != null ) {

			if(m.getMdctnRqstDispnsRqstInitialFillQntyVl().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstDispnsRqstInitialFillQntyVl()==null) {} else {
			medicationrequest.getDispenseRequest().getInitialFill().getQuantity().setValue((new java.math.BigDecimal((m.getMdctnRqstDispnsRqstInitialFillQntyVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** MdctnRqst_DispnsRqst_NmbrOfRptsAllowed ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstNmbrOfRptsAllowed() != null ) {

			if(m.getMdctnRqstDispnsRqstNmbrOfRptsAllowed().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstDispnsRqstNmbrOfRptsAllowed()==null) {} else {
			medicationrequest.getDispenseRequest().setNumberOfRepeatsAllowed(Integer.parseInt(m.getMdctnRqstDispnsRqstNmbrOfRptsAllowed().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnRqst_DispnsRqst_Prfrmr ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstPrfrmr() != null ) {

			if(m.getMdctnRqstDispnsRqstPrfrmr().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstDispnsRqstPrfrmr()==null) {} else {
			medicationrequest.getDispenseRequest().setPerformer(new org.hl7.fhir.r4.model.Reference(m.getMdctnRqstDispnsRqstPrfrmr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnRqst_DispnsRqst_Qnty_Cd ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstQntyCd() != null ) {

			if(m.getMdctnRqstDispnsRqstQntyCd().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstDispnsRqstQntyCd()==null) {} else {
			medicationrequest.getDispenseRequest().getQuantity().setCode(m.getMdctnRqstDispnsRqstQntyCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnRqst_DispnsRqst_Qnty_Cmprtr ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstQntyCmprtr() != null ) {

			if(m.getMdctnRqstDispnsRqstQntyCmprtr().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstDispnsRqstQntyCmprtr()==null) {} else {
			medicationrequest.getDispenseRequest().getQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(m.getMdctnRqstDispnsRqstQntyCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnRqst_DispnsRqst_Qnty_Sys ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstQntySys() != null ) {

			if(m.getMdctnRqstDispnsRqstQntySys().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstDispnsRqstQntySys()==null) {} else {
			medicationrequest.getDispenseRequest().getQuantity().setSystem(m.getMdctnRqstDispnsRqstQntySys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnRqst_DispnsRqst_Qnty_Unt ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstQntyUnt() != null ) {

			if(m.getMdctnRqstDispnsRqstQntyUnt().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstDispnsRqstQntyUnt()==null) {} else {
			medicationrequest.getDispenseRequest().getQuantity().setUnit(m.getMdctnRqstDispnsRqstQntyUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnRqst_DispnsRqst_Qnty_Vl ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstQntyVl() != null ) {

			if(m.getMdctnRqstDispnsRqstQntyVl().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstDispnsRqstQntyVl()==null) {} else {
			medicationrequest.getDispenseRequest().getQuantity().setValue((new java.math.BigDecimal((m.getMdctnRqstDispnsRqstQntyVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** MdctnRqst_DispnsRqst_ValidityPrd_End ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstValidityPrdEnd() != null ) {

			if(m.getMdctnRqstDispnsRqstValidityPrdEnd().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstDispnsRqstValidityPrdEnd()==null) {} else {
			medicationrequest.getDispenseRequest().getValidityPeriod().setEnd(m.getMdctnRqstDispnsRqstValidityPrdEnd().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstDispnsRqstValidityPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMdctnRqstDispnsRqstValidityPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnRqst_DispnsRqst_ValidityPrd_Strt ********************************************************************************/
		if(m.getMdctnRqstDispnsRqstValidityPrdStrt() != null ) {

			if(m.getMdctnRqstDispnsRqstValidityPrdStrt().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstDispnsRqstValidityPrdStrt()==null) {} else {
			medicationrequest.getDispenseRequest().getValidityPeriod().setStart(m.getMdctnRqstDispnsRqstValidityPrdStrt().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstDispnsRqstValidityPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMdctnRqstDispnsRqstValidityPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnRqst_DoNotPerform ********************************************************************************/
		if(m.getMdctnRqstDoNotPerform() != null ) {

			if(m.getMdctnRqstDoNotPerform().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstDoNotPerform()==null) {} else {
			medicationrequest.setDoNotPerform(Boolean.parseBoolean(m.getMdctnRqstDoNotPerform().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnRqst_DsgInstrctn_AddtnlInstrctn_Cdg_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnAddtnlInstrctnCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnAddtnlInstrctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnAddtnlInstrctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getAdditionalInstruction().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addAdditionalInstruction(); }
					String[] arrayi2 = m.getMdctnRqstDsgInstrctnAddtnlInstrctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationrequest.getDosageInstruction().get(i0).getAdditionalInstruction().get(i1).getCoding().size() < i2+1) { medicationrequest.getDosageInstruction().get(i0).getAdditionalInstruction().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getAdditionalInstruction().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_AddtnlInstrctn_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnAddtnlInstrctnCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnAddtnlInstrctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnAddtnlInstrctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getAdditionalInstruction().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addAdditionalInstruction(); }
					String[] arrayi2 = m.getMdctnRqstDsgInstrctnAddtnlInstrctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationrequest.getDosageInstruction().get(i0).getAdditionalInstruction().get(i1).getCoding().size() < i2+1) { medicationrequest.getDosageInstruction().get(i0).getAdditionalInstruction().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getAdditionalInstruction().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_AddtnlInstrctn_Cdg_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnAddtnlInstrctnCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnAddtnlInstrctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnAddtnlInstrctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getAdditionalInstruction().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addAdditionalInstruction(); }
					String[] arrayi2 = m.getMdctnRqstDsgInstrctnAddtnlInstrctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationrequest.getDosageInstruction().get(i0).getAdditionalInstruction().get(i1).getCoding().size() < i2+1) { medicationrequest.getDosageInstruction().get(i0).getAdditionalInstruction().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getAdditionalInstruction().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_AddtnlInstrctn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnAddtnlInstrctnCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnAddtnlInstrctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnAddtnlInstrctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getAdditionalInstruction().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addAdditionalInstruction(); }
					String[] arrayi2 = m.getMdctnRqstDsgInstrctnAddtnlInstrctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationrequest.getDosageInstruction().get(i0).getAdditionalInstruction().get(i1).getCoding().size() < i2+1) { medicationrequest.getDosageInstruction().get(i0).getAdditionalInstruction().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getAdditionalInstruction().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_AddtnlInstrctn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnAddtnlInstrctnCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnAddtnlInstrctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnAddtnlInstrctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getAdditionalInstruction().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addAdditionalInstruction(); }
					String[] arrayi2 = m.getMdctnRqstDsgInstrctnAddtnlInstrctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationrequest.getDosageInstruction().get(i0).getAdditionalInstruction().get(i1).getCoding().size() < i2+1) { medicationrequest.getDosageInstruction().get(i0).getAdditionalInstruction().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getAdditionalInstruction().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_AddtnlInstrctn_Txt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnAddtnlInstrctnTxt() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnAddtnlInstrctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnAddtnlInstrctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getAdditionalInstruction().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addAdditionalInstruction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getAdditionalInstruction().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_AsNdBooleanTyp ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnAsNdBooleanTyp() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnAsNdBooleanTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).setAsNeeded(new org.hl7.fhir.r4.model.BooleanType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_AsNdCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnAsNdCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnAsNdCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnAsNdCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getAsNeededCodeableConcept().getCoding().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).getAsNeededCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getAsNeededCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_AsNdCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnAsNdCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnAsNdCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnAsNdCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getAsNeededCodeableConcept().getCoding().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).getAsNeededCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getAsNeededCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_AsNdCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnAsNdCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnAsNdCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnAsNdCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getAsNeededCodeableConcept().getCoding().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).getAsNeededCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getAsNeededCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_AsNdCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnAsNdCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnAsNdCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnAsNdCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getAsNeededCodeableConcept().getCoding().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).getAsNeededCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getAsNeededCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_AsNdCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnAsNdCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnAsNdCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnAsNdCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getAsNeededCodeableConcept().getCoding().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).getAsNeededCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getAsNeededCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_AsNdCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnAsNdCdbleCncptTxt() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnAsNdCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getAsNeededCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseQnty_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtDoseQntyCd() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtDoseQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtDoseQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getDoseQuantity().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseQnty_Cmprtr ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtDoseQntyCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtDoseQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtDoseQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getDoseQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseQnty_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtDoseQntySys() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtDoseQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtDoseQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getDoseQuantity().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseQnty_Unt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtDoseQntyUnt() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtDoseQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtDoseQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getDoseQuantity().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseQnty_Vl ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtDoseQntyVl() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtDoseQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtDoseQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getDoseQuantity().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseRng_Hi_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngHiCd() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getDoseRange().getHigh().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseRng_Hi_Cmprtr ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngHiCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getDoseRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseRng_Hi_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngHiSys() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getDoseRange().getHigh().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseRng_Hi_Unt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngHiUnt() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getDoseRange().getHigh().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseRng_Hi_Vl ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngHiVl() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getDoseRange().getHigh().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseRng_Lw_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngLwCd() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getDoseRange().getLow().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseRng_Lw_Cmprtr ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngLwCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getDoseRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseRng_Lw_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngLwSys() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getDoseRange().getLow().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseRng_Lw_Unt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngLwUnt() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getDoseRange().getLow().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_DoseRng_Lw_Vl ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngLwVl() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtDoseRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getDoseRange().getLow().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtQnty_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtQntyCd() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtRtQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtRtQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateQuantity().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtQnty_Cmprtr ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtQntyCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtRtQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtRtQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtQnty_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtQntySys() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtRtQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtRtQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateQuantity().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtQnty_Unt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtQntyUnt() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtRtQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtRtQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateQuantity().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtQnty_Vl ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtQntyVl() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtRtQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtRtQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateQuantity().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRng_Hi_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtRngHiCd() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRange().getHigh().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRng_Hi_Cmprtr ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtRngHiCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRng_Hi_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtRngHiSys() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRange().getHigh().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRng_Hi_Unt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtRngHiUnt() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRange().getHigh().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRng_Hi_Vl ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtRngHiVl() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRange().getHigh().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRng_Lw_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtRngLwCd() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRange().getLow().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRng_Lw_Cmprtr ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtRngLwCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRng_Lw_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtRngLwSys() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRange().getLow().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRng_Lw_Unt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtRngLwUnt() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRange().getLow().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRng_Lw_Vl ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtRngLwVl() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRange().getLow().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrCd() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRatio().getDenominator().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Cmprtr ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRatio().getDenominator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrSys() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRatio().getDenominator().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Unt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrUnt() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRatio().getDenominator().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRtio_Dnmntr_Vl ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrVl() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRatio().getDenominator().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrCd() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRatio().getNumerator().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Cmprtr ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRatio().getNumerator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrSys() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRatio().getNumerator().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Unt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrUnt() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRatio().getNumerator().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_RtRtio_Nmrtr_Vl ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrVl() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getRateRatio().getNumerator().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					String[] arrayi2 = m.getMdctnRqstDsgInstrctnDoseAndRtTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getType().getCoding().size() < i2+1) { medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getType().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					String[] arrayi2 = m.getMdctnRqstDsgInstrctnDoseAndRtTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getType().getCoding().size() < i2+1) { medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getType().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					String[] arrayi2 = m.getMdctnRqstDsgInstrctnDoseAndRtTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getType().getCoding().size() < i2+1) { medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getType().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					String[] arrayi2 = m.getMdctnRqstDsgInstrctnDoseAndRtTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getType().getCoding().size() < i2+1) { medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getType().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					String[] arrayi2 = m.getMdctnRqstDsgInstrctnDoseAndRtTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getType().getCoding().size() < i2+1) { medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getType().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_DoseAndRt_Typ_Txt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnDoseAndRtTypTxt() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnDoseAndRtTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnDoseAndRtTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).addDoseAndRate(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getDoseAndRate().get(i1).getType().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_MxDosePerAdmnstn_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMxDosePerAdmnstnCd() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnMxDosePerAdmnstnCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getMaxDosePerAdministration().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_MxDosePerAdmnstn_Cmprtr ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMxDosePerAdmnstnCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnMxDosePerAdmnstnCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getMaxDosePerAdministration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_MxDosePerAdmnstn_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMxDosePerAdmnstnSys() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnMxDosePerAdmnstnSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getMaxDosePerAdministration().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_MxDosePerAdmnstn_Unt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMxDosePerAdmnstnUnt() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnMxDosePerAdmnstnUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getMaxDosePerAdministration().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_MxDosePerAdmnstn_Vl ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMxDosePerAdmnstnVl() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnMxDosePerAdmnstnVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getMaxDosePerAdministration().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_MxDosePerLifetime_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMxDosePerLifetimeCd() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnMxDosePerLifetimeCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getMaxDosePerLifetime().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_MxDosePerLifetime_Cmprtr ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMxDosePerLifetimeCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnMxDosePerLifetimeCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getMaxDosePerLifetime().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_MxDosePerLifetime_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMxDosePerLifetimeSys() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnMxDosePerLifetimeSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getMaxDosePerLifetime().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_MxDosePerLifetime_Unt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMxDosePerLifetimeUnt() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnMxDosePerLifetimeUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getMaxDosePerLifetime().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_MxDosePerLifetime_Vl ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMxDosePerLifetimeVl() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnMxDosePerLifetimeVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getMaxDosePerLifetime().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_MxDosePerPrd_Dnmntr_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMxDosePerPrdDnmntrCd() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnMxDosePerPrdDnmntrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getMaxDosePerPeriod().getDenominator().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_MxDosePerPrd_Dnmntr_Cmprtr ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMxDosePerPrdDnmntrCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnMxDosePerPrdDnmntrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getMaxDosePerPeriod().getDenominator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_MxDosePerPrd_Dnmntr_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMxDosePerPrdDnmntrSys() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnMxDosePerPrdDnmntrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getMaxDosePerPeriod().getDenominator().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_MxDosePerPrd_Dnmntr_Unt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMxDosePerPrdDnmntrUnt() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnMxDosePerPrdDnmntrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getMaxDosePerPeriod().getDenominator().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_MxDosePerPrd_Dnmntr_Vl ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMxDosePerPrdDnmntrVl() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnMxDosePerPrdDnmntrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getMaxDosePerPeriod().getDenominator().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_MxDosePerPrd_Nmrtr_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMxDosePerPrdNmrtrCd() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnMxDosePerPrdNmrtrCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getMaxDosePerPeriod().getNumerator().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_MxDosePerPrd_Nmrtr_Cmprtr ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMxDosePerPrdNmrtrCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnMxDosePerPrdNmrtrCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getMaxDosePerPeriod().getNumerator().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_MxDosePerPrd_Nmrtr_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMxDosePerPrdNmrtrSys() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnMxDosePerPrdNmrtrSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getMaxDosePerPeriod().getNumerator().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_MxDosePerPrd_Nmrtr_Unt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMxDosePerPrdNmrtrUnt() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnMxDosePerPrdNmrtrUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getMaxDosePerPeriod().getNumerator().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_MxDosePerPrd_Nmrtr_Vl ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMxDosePerPrdNmrtrVl() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnMxDosePerPrdNmrtrVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getMaxDosePerPeriod().getNumerator().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Mthd_Cdg_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMthdCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnMthdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnMthdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getMethod().getCoding().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).getMethod().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getMethod().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Mthd_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMthdCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnMthdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnMthdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getMethod().getCoding().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).getMethod().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getMethod().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Mthd_Cdg_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMthdCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnMthdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnMthdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getMethod().getCoding().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).getMethod().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getMethod().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMthdCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnMthdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnMthdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getMethod().getCoding().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).getMethod().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getMethod().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Mthd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMthdCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnMthdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnMthdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getMethod().getCoding().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).getMethod().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getMethod().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Mthd_Txt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnMthdTxt() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnMthdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getMethod().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_PntInstrctn ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnPntInstrctn() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnPntInstrctn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).setPatientInstruction(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Route_Cdg_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnRouteCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnRouteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnRouteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getRoute().getCoding().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).getRoute().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getRoute().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Route_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnRouteCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnRouteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnRouteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getRoute().getCoding().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).getRoute().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getRoute().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Route_Cdg_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnRouteCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnRouteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnRouteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getRoute().getCoding().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).getRoute().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getRoute().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Route_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnRouteCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnRouteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnRouteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getRoute().getCoding().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).getRoute().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getRoute().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Route_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnRouteCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnRouteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnRouteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getRoute().getCoding().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).getRoute().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getRoute().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Route_Txt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnRouteTxt() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnRouteTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getRoute().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Sqnc ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnSqnc() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnSqnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).setSequence(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Site_Cdg_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnSiteCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnSiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnSiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getSite().getCoding().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).getSite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getSite().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Site_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnSiteCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnSiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnSiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getSite().getCoding().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).getSite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getSite().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Site_Cdg_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnSiteCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnSiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnSiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getSite().getCoding().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).getSite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getSite().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Site_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnSiteCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnSiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnSiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getSite().getCoding().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).getSite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getSite().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Site_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnSiteCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnSiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnSiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getSite().getCoding().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).getSite().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getSite().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Site_Txt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnSiteTxt() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnSiteTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getSite().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Txt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTxt() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgCdCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getTiming().getCode().getCoding().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).getTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getTiming().getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgCdCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getTiming().getCode().getCoding().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).getTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getTiming().getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgCdCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getTiming().getCode().getCoding().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).getTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getTiming().getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgCdCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getTiming().getCode().getCoding().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).getTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getTiming().getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgCdCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				String[] arrayi1 = m.getMdctnRqstDsgInstrctnTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getDosageInstruction().get(i0).getTiming().getCode().getCoding().size() < i1+1) { medicationrequest.getDosageInstruction().get(i0).getTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getTiming().getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Cd_Txt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgCdTxt() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTmgCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getTiming().getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Evnt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgEvnt() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTmgEvnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {medicationrequest.getDosageInstruction().get(i0).getTiming().addEvent(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptBndsDurationCd() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTmgRptBndsDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getTiming().getRepeat().getBoundsDuration().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsDuration_Cmprtr ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptBndsDurationCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTmgRptBndsDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getTiming().getRepeat().getBoundsDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptBndsDurationSys() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTmgRptBndsDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getTiming().getRepeat().getBoundsDuration().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptBndsDurationUnt() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTmgRptBndsDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getTiming().getRepeat().getBoundsDuration().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptBndsDurationVl() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTmgRptBndsDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getTiming().getRepeat().getBoundsDuration().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsPrd_End ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptBndsPrdEnd() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTmgRptBndsPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getTiming().getRepeat().getBoundsPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptBndsPrdStrt() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTmgRptBndsPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getTiming().getRepeat().getBoundsPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptBndsRngHiCd() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTmgRptBndsRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getTiming().getRepeat().getBoundsRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Cmprtr ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptBndsRngHiCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTmgRptBndsRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getTiming().getRepeat().getBoundsRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptBndsRngHiSys() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTmgRptBndsRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getTiming().getRepeat().getBoundsRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptBndsRngHiUnt() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTmgRptBndsRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getTiming().getRepeat().getBoundsRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptBndsRngHiVl() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTmgRptBndsRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getTiming().getRepeat().getBoundsRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptBndsRngLwCd() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTmgRptBndsRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getTiming().getRepeat().getBoundsRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Cmprtr ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptBndsRngLwCmprtr() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTmgRptBndsRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getTiming().getRepeat().getBoundsRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptBndsRngLwSys() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTmgRptBndsRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getTiming().getRepeat().getBoundsRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptBndsRngLwUnt() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTmgRptBndsRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getTiming().getRepeat().getBoundsRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptBndsRngLwVl() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTmgRptBndsRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getTiming().getRepeat().getBoundsRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_Cnt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptCnt() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTmgRptCnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getTiming().getRepeat().setCount(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_CntMx ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptCntMx() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTmgRptCntMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getTiming().getRepeat().setCountMax(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_Duration ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptDuration() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTmgRptDuration().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getTiming().getRepeat().setDuration((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_DurationMx ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptDurationMx() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTmgRptDurationMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getTiming().getRepeat().setDurationMax((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_DurationUnt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptDurationUnt() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTmgRptDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getTiming().getRepeat().setDurationUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_Frqncy ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptFrqncy() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTmgRptFrqncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getTiming().getRepeat().setFrequency(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_FrqncyMx ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptFrqncyMx() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTmgRptFrqncyMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getTiming().getRepeat().setFrequencyMax(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_Off ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptOff() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTmgRptOff().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getTiming().getRepeat().setOffset(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_Prd ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptPrd() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTmgRptPrd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getTiming().getRepeat().setPeriod((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_PrdMx ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptPrdMx() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTmgRptPrdMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getTiming().getRepeat().setPeriodMax((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_PrdUnt ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptPrdUnt() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTmgRptPrdUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getDosageInstruction().get(i0).getTiming().getRepeat().setPeriodUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnRqst_DsgInstrctn_Tmg_Rpt_TimeOfDay ********************************************************************************/
		if(m.getMdctnRqstDsgInstrctnTmgRptTimeOfDay() != null ) {

			String[] arrayi0 = m.getMdctnRqstDsgInstrctnTmgRptTimeOfDay().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getDosageInstruction().size() < i0+1) { medicationrequest.addDosageInstruction(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {medicationrequest.getDosageInstruction().get(i0).getTiming().getRepeat().addTimeOfDay(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_Enc ********************************************************************************/
		if(m.getMdctnRqstEnc() != null ) {

			if(m.getMdctnRqstEnc().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstEnc()==null) {} else {
			medicationrequest.setEncounter(new org.hl7.fhir.r4.model.Reference(m.getMdctnRqstEnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnRqst_EvntHis ********************************************************************************/
		if(m.getMdctnRqstEvntHis() != null ) {

				for( String currListStrSplit : m.getMdctnRqstEvntHis().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicationrequest.addEventHistory(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdctnRqst_GrpId_Assigner ********************************************************************************/
		if(m.getMdctnRqstGrpIdAssigner() != null ) {

			if(m.getMdctnRqstGrpIdAssigner().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstGrpIdAssigner()==null) {} else {
			medicationrequest.getGroupIdentifier().setAssigner(new org.hl7.fhir.r4.model.Reference(m.getMdctnRqstGrpIdAssigner().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnRqst_GrpId_Prd_End ********************************************************************************/
		if(m.getMdctnRqstGrpIdPrdEnd() != null ) {

			if(m.getMdctnRqstGrpIdPrdEnd().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstGrpIdPrdEnd()==null) {} else {
			medicationrequest.getGroupIdentifier().getPeriod().setEnd(m.getMdctnRqstGrpIdPrdEnd().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstGrpIdPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMdctnRqstGrpIdPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnRqst_GrpId_Prd_Strt ********************************************************************************/
		if(m.getMdctnRqstGrpIdPrdStrt() != null ) {

			if(m.getMdctnRqstGrpIdPrdStrt().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstGrpIdPrdStrt()==null) {} else {
			medicationrequest.getGroupIdentifier().getPeriod().setStart(m.getMdctnRqstGrpIdPrdStrt().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstGrpIdPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMdctnRqstGrpIdPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnRqst_GrpId_Sys ********************************************************************************/
		if(m.getMdctnRqstGrpIdSys() != null ) {

			if(m.getMdctnRqstGrpIdSys().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstGrpIdSys()==null) {} else {
			medicationrequest.getGroupIdentifier().setSystem(m.getMdctnRqstGrpIdSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnRqst_GrpId_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnRqstGrpIdTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnRqstGrpIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getGroupIdentifier().getType().getCoding().size() < i0+1) { medicationrequest.getGroupIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getGroupIdentifier().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_GrpId_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnRqstGrpIdTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnRqstGrpIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getGroupIdentifier().getType().getCoding().size() < i0+1) { medicationrequest.getGroupIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getGroupIdentifier().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_GrpId_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnRqstGrpIdTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnRqstGrpIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getGroupIdentifier().getType().getCoding().size() < i0+1) { medicationrequest.getGroupIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getGroupIdentifier().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_GrpId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnRqstGrpIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnRqstGrpIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getGroupIdentifier().getType().getCoding().size() < i0+1) { medicationrequest.getGroupIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getGroupIdentifier().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnRqst_GrpId_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnRqstGrpIdTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnRqstGrpIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getGroupIdentifier().getType().getCoding().size() < i0+1) { medicationrequest.getGroupIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getGroupIdentifier().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_GrpId_Typ_Txt ********************************************************************************/
		if(m.getMdctnRqstGrpIdTypTxt() != null ) {

			if(m.getMdctnRqstGrpIdTypTxt().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstGrpIdTypTxt()==null) {} else {
			medicationrequest.getGroupIdentifier().getType().setText(m.getMdctnRqstGrpIdTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnRqst_GrpId_Use ********************************************************************************/
		if(m.getMdctnRqstGrpIdUse() != null ) {

			if(m.getMdctnRqstGrpIdUse().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstGrpIdUse()==null) {} else {
			medicationrequest.getGroupIdentifier().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(m.getMdctnRqstGrpIdUse().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnRqst_GrpId_Vl ********************************************************************************/
		if(m.getMdctnRqstGrpIdVl() != null ) {

			if(m.getMdctnRqstGrpIdVl().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstGrpIdVl()==null) {} else {
			medicationrequest.getGroupIdentifier().setValue(m.getMdctnRqstGrpIdVl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnRqst_Id_Assigner ********************************************************************************/
		if(m.getMdctnRqstIdAssigner() != null ) {

			String[] arrayi0 = m.getMdctnRqstIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getIdentifier().size() < i0+1) { medicationrequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnRqst_Id_Prd_End ********************************************************************************/
		if(m.getMdctnRqstIdPrdEnd() != null ) {

			String[] arrayi0 = m.getMdctnRqstIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getIdentifier().size() < i0+1) { medicationrequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnRqst_Id_Prd_Strt ********************************************************************************/
		if(m.getMdctnRqstIdPrdStrt() != null ) {

			String[] arrayi0 = m.getMdctnRqstIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getIdentifier().size() < i0+1) { medicationrequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnRqst_Id_Sys ********************************************************************************/
		if(m.getMdctnRqstIdSys() != null ) {

			String[] arrayi0 = m.getMdctnRqstIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getIdentifier().size() < i0+1) { medicationrequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdctnRqstIdTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnRqstIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getIdentifier().size() < i0+1) { medicationrequest.addIdentifier(); }
				String[] arrayi1 = m.getMdctnRqstIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicationrequest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnRqstIdTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnRqstIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getIdentifier().size() < i0+1) { medicationrequest.addIdentifier(); }
				String[] arrayi1 = m.getMdctnRqstIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicationrequest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdctnRqstIdTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnRqstIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getIdentifier().size() < i0+1) { medicationrequest.addIdentifier(); }
				String[] arrayi1 = m.getMdctnRqstIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicationrequest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnRqstIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnRqstIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getIdentifier().size() < i0+1) { medicationrequest.addIdentifier(); }
				String[] arrayi1 = m.getMdctnRqstIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicationrequest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnRqst_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnRqstIdTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnRqstIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getIdentifier().size() < i0+1) { medicationrequest.addIdentifier(); }
				String[] arrayi1 = m.getMdctnRqstIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { medicationrequest.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_Id_Typ_Txt ********************************************************************************/
		if(m.getMdctnRqstIdTypTxt() != null ) {

			String[] arrayi0 = m.getMdctnRqstIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getIdentifier().size() < i0+1) { medicationrequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_Id_Use ********************************************************************************/
		if(m.getMdctnRqstIdUse() != null ) {

			String[] arrayi0 = m.getMdctnRqstIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getIdentifier().size() < i0+1) { medicationrequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnRqst_Id_Vl ********************************************************************************/
		if(m.getMdctnRqstIdVl() != null ) {

			String[] arrayi0 = m.getMdctnRqstIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getIdentifier().size() < i0+1) { medicationrequest.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_InstantiatesCanonical ********************************************************************************/
		if(m.getMdctnRqstInstantiatesCanonical() != null ) {

				for( String currListStrSplit : m.getMdctnRqstInstantiatesCanonical().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicationrequest.addInstantiatesCanonical(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** MdctnRqst_InstantiatesUri ********************************************************************************/
		if(m.getMdctnRqstInstantiatesUri() != null ) {

				for( String currListStrSplit : m.getMdctnRqstInstantiatesUri().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicationrequest.addInstantiatesUri(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** MdctnRqst_Insrnc ********************************************************************************/
		if(m.getMdctnRqstInsrnc() != null ) {

				for( String currListStrSplit : m.getMdctnRqstInsrnc().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicationrequest.addInsurance(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdctnRqst_Intent ********************************************************************************/
		if(m.getMdctnRqstIntent() != null ) {

			if(m.getMdctnRqstIntent().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstIntent()==null) {} else {
			medicationrequest.setIntent(new org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestIntentEnumFactory().fromCode(m.getMdctnRqstIntent().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnRqst_MdctnCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdctnRqstMdctnCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnRqstMdctnCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getMedicationCodeableConcept().getCoding().size() < i0+1) { medicationrequest.getMedicationCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getMedicationCodeableConcept().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_MdctnCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnRqstMdctnCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnRqstMdctnCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getMedicationCodeableConcept().getCoding().size() < i0+1) { medicationrequest.getMedicationCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getMedicationCodeableConcept().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_MdctnCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdctnRqstMdctnCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnRqstMdctnCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getMedicationCodeableConcept().getCoding().size() < i0+1) { medicationrequest.getMedicationCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getMedicationCodeableConcept().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_MdctnCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnRqstMdctnCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnRqstMdctnCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getMedicationCodeableConcept().getCoding().size() < i0+1) { medicationrequest.getMedicationCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getMedicationCodeableConcept().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnRqst_MdctnCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnRqstMdctnCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnRqstMdctnCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getMedicationCodeableConcept().getCoding().size() < i0+1) { medicationrequest.getMedicationCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getMedicationCodeableConcept().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_MdctnCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdctnRqstMdctnCdbleCncptTxt() != null ) {

			if(m.getMdctnRqstMdctnCdbleCncptTxt().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstMdctnCdbleCncptTxt()==null) {} else {
			medicationrequest.getMedicationCodeableConcept().setText(m.getMdctnRqstMdctnCdbleCncptTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnRqst_MdctnRfrnc ********************************************************************************/
		if(m.getMdctnRqstMdctnRfrnc() != null ) {

			if(m.getMdctnRqstMdctnRfrnc().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstMdctnRfrnc()==null) {} else {
			medicationrequest.setMedication(new org.hl7.fhir.r4.model.Reference(m.getMdctnRqstMdctnRfrnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnRqst_Nt_AthrRfrnc ********************************************************************************/
		if(m.getMdctnRqstNtAthrRfrnc() != null ) {

			String[] arrayi0 = m.getMdctnRqstNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getNote().size() < i0+1) { medicationrequest.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnRqst_Nt_AthrStrgTyp ********************************************************************************/
		if(m.getMdctnRqstNtAthrStrgTyp() != null ) {

			String[] arrayi0 = m.getMdctnRqstNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getNote().size() < i0+1) { medicationrequest.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnRqst_Nt_Txt ********************************************************************************/
		if(m.getMdctnRqstNtTxt() != null ) {

			String[] arrayi0 = m.getMdctnRqstNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getNote().size() < i0+1) { medicationrequest.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_Nt_Time ********************************************************************************/
		if(m.getMdctnRqstNtTime() != null ) {

			String[] arrayi0 = m.getMdctnRqstNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getNote().size() < i0+1) { medicationrequest.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnRqst_Prfrmr ********************************************************************************/
		if(m.getMdctnRqstPrfrmr() != null ) {

			if(m.getMdctnRqstPrfrmr().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstPrfrmr()==null) {} else {
			medicationrequest.setPerformer(new org.hl7.fhir.r4.model.Reference(m.getMdctnRqstPrfrmr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnRqst_PrfrmrTyp_Cdg_Cd ********************************************************************************/
		if(m.getMdctnRqstPrfrmrTypCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnRqstPrfrmrTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getPerformerType().getCoding().size() < i0+1) { medicationrequest.getPerformerType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getPerformerType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_PrfrmrTyp_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnRqstPrfrmrTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnRqstPrfrmrTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getPerformerType().getCoding().size() < i0+1) { medicationrequest.getPerformerType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getPerformerType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_PrfrmrTyp_Cdg_Sys ********************************************************************************/
		if(m.getMdctnRqstPrfrmrTypCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnRqstPrfrmrTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getPerformerType().getCoding().size() < i0+1) { medicationrequest.getPerformerType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getPerformerType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_PrfrmrTyp_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnRqstPrfrmrTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnRqstPrfrmrTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getPerformerType().getCoding().size() < i0+1) { medicationrequest.getPerformerType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getPerformerType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnRqst_PrfrmrTyp_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnRqstPrfrmrTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnRqstPrfrmrTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getPerformerType().getCoding().size() < i0+1) { medicationrequest.getPerformerType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getPerformerType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_PrfrmrTyp_Txt ********************************************************************************/
		if(m.getMdctnRqstPrfrmrTypTxt() != null ) {

			if(m.getMdctnRqstPrfrmrTypTxt().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstPrfrmrTypTxt()==null) {} else {
			medicationrequest.getPerformerType().setText(m.getMdctnRqstPrfrmrTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnRqst_PriorPrescription ********************************************************************************/
		if(m.getMdctnRqstPriorPrescription() != null ) {

			if(m.getMdctnRqstPriorPrescription().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstPriorPrescription()==null) {} else {
			medicationrequest.setPriorPrescription(new org.hl7.fhir.r4.model.Reference(m.getMdctnRqstPriorPrescription().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnRqst_Priority ********************************************************************************/
		if(m.getMdctnRqstPriority() != null ) {

			if(m.getMdctnRqstPriority().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstPriority()==null) {} else {
			medicationrequest.setPriority(new org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestPriorityEnumFactory().fromCode(m.getMdctnRqstPriority().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnRqst_RsnCd_Cdg_Cd ********************************************************************************/
		if(m.getMdctnRqstRsnCdCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnRqstRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getReasonCode().size() < i0+1) { medicationrequest.addReasonCode(); }
				String[] arrayi1 = m.getMdctnRqstRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getReasonCode().get(i0).getCoding().size() < i1+1) { medicationrequest.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getReasonCode().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_RsnCd_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnRqstRsnCdCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnRqstRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getReasonCode().size() < i0+1) { medicationrequest.addReasonCode(); }
				String[] arrayi1 = m.getMdctnRqstRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getReasonCode().get(i0).getCoding().size() < i1+1) { medicationrequest.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getReasonCode().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_RsnCd_Cdg_Sys ********************************************************************************/
		if(m.getMdctnRqstRsnCdCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnRqstRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getReasonCode().size() < i0+1) { medicationrequest.addReasonCode(); }
				String[] arrayi1 = m.getMdctnRqstRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getReasonCode().get(i0).getCoding().size() < i1+1) { medicationrequest.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getReasonCode().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnRqstRsnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnRqstRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getReasonCode().size() < i0+1) { medicationrequest.addReasonCode(); }
				String[] arrayi1 = m.getMdctnRqstRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getReasonCode().get(i0).getCoding().size() < i1+1) { medicationrequest.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getReasonCode().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MdctnRqst_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnRqstRsnCdCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnRqstRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getReasonCode().size() < i0+1) { medicationrequest.addReasonCode(); }
				String[] arrayi1 = m.getMdctnRqstRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(medicationrequest.getReasonCode().get(i0).getCoding().size() < i1+1) { medicationrequest.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {medicationrequest.getReasonCode().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MdctnRqst_RsnCd_Txt ********************************************************************************/
		if(m.getMdctnRqstRsnCdTxt() != null ) {

			String[] arrayi0 = m.getMdctnRqstRsnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getReasonCode().size() < i0+1) { medicationrequest.addReasonCode(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getReasonCode().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_RsnRfrnc ********************************************************************************/
		if(m.getMdctnRqstRsnRfrnc() != null ) {

				for( String currListStrSplit : m.getMdctnRqstRsnRfrnc().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicationrequest.addReasonReference(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MdctnRqst_Recorder ********************************************************************************/
		if(m.getMdctnRqstRecorder() != null ) {

			if(m.getMdctnRqstRecorder().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstRecorder()==null) {} else {
			medicationrequest.setRecorder(new org.hl7.fhir.r4.model.Reference(m.getMdctnRqstRecorder().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnRqst_RptedBooleanTyp ********************************************************************************/
		if(m.getMdctnRqstRptedBooleanTyp() != null ) {

			if(m.getMdctnRqstRptedBooleanTyp().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstRptedBooleanTyp()==null) {} else {
			medicationrequest.setReported(new org.hl7.fhir.r4.model.BooleanType(m.getMdctnRqstRptedBooleanTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnRqst_RptedRfrnc ********************************************************************************/
		if(m.getMdctnRqstRptedRfrnc() != null ) {

			if(m.getMdctnRqstRptedRfrnc().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstRptedRfrnc()==null) {} else {
			medicationrequest.setReported(new org.hl7.fhir.r4.model.Reference(m.getMdctnRqstRptedRfrnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnRqst_Rqster ********************************************************************************/
		if(m.getMdctnRqstRqster() != null ) {

			if(m.getMdctnRqstRqster().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstRqster()==null) {} else {
			medicationrequest.setRequester(new org.hl7.fhir.r4.model.Reference(m.getMdctnRqstRqster().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnRqst_Sts ********************************************************************************/
		if(m.getMdctnRqstSts() != null ) {

			if(m.getMdctnRqstSts().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstSts()==null) {} else {
			medicationrequest.setStatus(new org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestStatusEnumFactory().fromCode(m.getMdctnRqstSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnRqst_StsRsn_Cdg_Cd ********************************************************************************/
		if(m.getMdctnRqstStsRsnCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnRqstStsRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getStatusReason().getCoding().size() < i0+1) { medicationrequest.getStatusReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getStatusReason().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_StsRsn_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnRqstStsRsnCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnRqstStsRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getStatusReason().getCoding().size() < i0+1) { medicationrequest.getStatusReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getStatusReason().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_StsRsn_Cdg_Sys ********************************************************************************/
		if(m.getMdctnRqstStsRsnCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnRqstStsRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getStatusReason().getCoding().size() < i0+1) { medicationrequest.getStatusReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getStatusReason().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnRqstStsRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnRqstStsRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getStatusReason().getCoding().size() < i0+1) { medicationrequest.getStatusReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getStatusReason().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnRqst_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnRqstStsRsnCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnRqstStsRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getStatusReason().getCoding().size() < i0+1) { medicationrequest.getStatusReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getStatusReason().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_StsRsn_Txt ********************************************************************************/
		if(m.getMdctnRqstStsRsnTxt() != null ) {

			if(m.getMdctnRqstStsRsnTxt().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstStsRsnTxt()==null) {} else {
			medicationrequest.getStatusReason().setText(m.getMdctnRqstStsRsnTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnRqst_Sbjct ********************************************************************************/
		if(m.getMdctnRqstSbjct() != null ) {

			if(m.getMdctnRqstSbjct().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstSbjct()==null) {} else {
			medicationrequest.setSubject(new org.hl7.fhir.r4.model.Reference(m.getMdctnRqstSbjct().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnRqst_Substitution_AllowedBooleanTyp ********************************************************************************/
		if(m.getMdctnRqstSubstitutionAllowedBooleanTyp() != null ) {

			if(m.getMdctnRqstSubstitutionAllowedBooleanTyp().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstSubstitutionAllowedBooleanTyp()==null) {} else {
			medicationrequest.getSubstitution().setAllowed(new org.hl7.fhir.r4.model.BooleanType(m.getMdctnRqstSubstitutionAllowedBooleanTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MdctnRqst_Substitution_AllowedCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMdctnRqstSubstitutionAllowedCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnRqstSubstitutionAllowedCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getSubstitution().getAllowedCodeableConcept().getCoding().size() < i0+1) { medicationrequest.getSubstitution().getAllowedCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getSubstitution().getAllowedCodeableConcept().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_Substitution_AllowedCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnRqstSubstitutionAllowedCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnRqstSubstitutionAllowedCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getSubstitution().getAllowedCodeableConcept().getCoding().size() < i0+1) { medicationrequest.getSubstitution().getAllowedCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getSubstitution().getAllowedCodeableConcept().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_Substitution_AllowedCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMdctnRqstSubstitutionAllowedCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnRqstSubstitutionAllowedCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getSubstitution().getAllowedCodeableConcept().getCoding().size() < i0+1) { medicationrequest.getSubstitution().getAllowedCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getSubstitution().getAllowedCodeableConcept().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_Substitution_AllowedCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnRqstSubstitutionAllowedCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnRqstSubstitutionAllowedCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getSubstitution().getAllowedCodeableConcept().getCoding().size() < i0+1) { medicationrequest.getSubstitution().getAllowedCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getSubstitution().getAllowedCodeableConcept().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnRqst_Substitution_AllowedCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnRqstSubstitutionAllowedCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnRqstSubstitutionAllowedCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getSubstitution().getAllowedCodeableConcept().getCoding().size() < i0+1) { medicationrequest.getSubstitution().getAllowedCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getSubstitution().getAllowedCodeableConcept().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_Substitution_AllowedCdbleCncpt_Txt ********************************************************************************/
		if(m.getMdctnRqstSubstitutionAllowedCdbleCncptTxt() != null ) {

			if(m.getMdctnRqstSubstitutionAllowedCdbleCncptTxt().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstSubstitutionAllowedCdbleCncptTxt()==null) {} else {
			medicationrequest.getSubstitution().getAllowedCodeableConcept().setText(m.getMdctnRqstSubstitutionAllowedCdbleCncptTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnRqst_Substitution_Rsn_Cdg_Cd ********************************************************************************/
		if(m.getMdctnRqstSubstitutionRsnCdgCd() != null ) {

			String[] arrayi0 = m.getMdctnRqstSubstitutionRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getSubstitution().getReason().getCoding().size() < i0+1) { medicationrequest.getSubstitution().getReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getSubstitution().getReason().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_Substitution_Rsn_Cdg_Dsply ********************************************************************************/
		if(m.getMdctnRqstSubstitutionRsnCdgDsply() != null ) {

			String[] arrayi0 = m.getMdctnRqstSubstitutionRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getSubstitution().getReason().getCoding().size() < i0+1) { medicationrequest.getSubstitution().getReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getSubstitution().getReason().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_Substitution_Rsn_Cdg_Sys ********************************************************************************/
		if(m.getMdctnRqstSubstitutionRsnCdgSys() != null ) {

			String[] arrayi0 = m.getMdctnRqstSubstitutionRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getSubstitution().getReason().getCoding().size() < i0+1) { medicationrequest.getSubstitution().getReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getSubstitution().getReason().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_Substitution_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdctnRqstSubstitutionRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMdctnRqstSubstitutionRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getSubstitution().getReason().getCoding().size() < i0+1) { medicationrequest.getSubstitution().getReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getSubstitution().getReason().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MdctnRqst_Substitution_Rsn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdctnRqstSubstitutionRsnCdgVrsn() != null ) {

			String[] arrayi0 = m.getMdctnRqstSubstitutionRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(medicationrequest.getSubstitution().getReason().getCoding().size() < i0+1) { medicationrequest.getSubstitution().getReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {medicationrequest.getSubstitution().getReason().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MdctnRqst_Substitution_Rsn_Txt ********************************************************************************/
		if(m.getMdctnRqstSubstitutionRsnTxt() != null ) {

			if(m.getMdctnRqstSubstitutionRsnTxt().replace("[","").replace("]","").equals("NULL") | m.getMdctnRqstSubstitutionRsnTxt()==null) {} else {
			medicationrequest.getSubstitution().getReason().setText(m.getMdctnRqstSubstitutionRsnTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MdctnRqst_SprtingInfo ********************************************************************************/
		if(m.getMdctnRqstSprtingInfo() != null ) {

				for( String currListStrSplit : m.getMdctnRqstSprtingInfo().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			medicationrequest.addSupportingInformation(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		return medicationrequest;
	}
}
