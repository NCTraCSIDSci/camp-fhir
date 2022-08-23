package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Specimen;
public class SpecimenConversion 
{
	public org.hl7.fhir.r4.model.Specimen Specimens(Specimen s) throws ParseException
	{
		org.hl7.fhir.r4.model.Specimen specimen = new org.hl7.fhir.r4.model.Specimen();

		/******************** id ********************************************************************************/
		specimen.setId(s.getId());

		/******************** Spcmn_AccessionId_Assigner ********************************************************************************/
		if(s.getSpcmnAccessionIdAssigner() != null ) {

			if(s.getSpcmnAccessionIdAssigner().replace("[","").replace("]","").equals("NULL") | s.getSpcmnAccessionIdAssigner()==null) {} else {
			specimen.getAccessionIdentifier().setAssigner(new org.hl7.fhir.r4.model.Reference(s.getSpcmnAccessionIdAssigner().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Spcmn_AccessionId_Prd_End ********************************************************************************/
		if(s.getSpcmnAccessionIdPrdEnd() != null ) {

			if(s.getSpcmnAccessionIdPrdEnd().replace("[","").replace("]","").equals("NULL") | s.getSpcmnAccessionIdPrdEnd()==null) {} else {
			specimen.getAccessionIdentifier().getPeriod().setEnd(s.getSpcmnAccessionIdPrdEnd().replace("[","").replace("]","").equals("NULL") | s.getSpcmnAccessionIdPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(s.getSpcmnAccessionIdPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Spcmn_AccessionId_Prd_Strt ********************************************************************************/
		if(s.getSpcmnAccessionIdPrdStrt() != null ) {

			if(s.getSpcmnAccessionIdPrdStrt().replace("[","").replace("]","").equals("NULL") | s.getSpcmnAccessionIdPrdStrt()==null) {} else {
			specimen.getAccessionIdentifier().getPeriod().setStart(s.getSpcmnAccessionIdPrdStrt().replace("[","").replace("]","").equals("NULL") | s.getSpcmnAccessionIdPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(s.getSpcmnAccessionIdPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Spcmn_AccessionId_Sys ********************************************************************************/
		if(s.getSpcmnAccessionIdSys() != null ) {

			if(s.getSpcmnAccessionIdSys().replace("[","").replace("]","").equals("NULL") | s.getSpcmnAccessionIdSys()==null) {} else {
			specimen.getAccessionIdentifier().setSystem(s.getSpcmnAccessionIdSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Spcmn_AccessionId_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnAccessionIdTypCdgCd() != null ) {

			String[] arrayi0 = s.getSpcmnAccessionIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getAccessionIdentifier().getType().getCoding().size() < i0+1) { specimen.getAccessionIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getAccessionIdentifier().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Spcmn_AccessionId_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnAccessionIdTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSpcmnAccessionIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getAccessionIdentifier().getType().getCoding().size() < i0+1) { specimen.getAccessionIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getAccessionIdentifier().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Spcmn_AccessionId_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnAccessionIdTypCdgSys() != null ) {

			String[] arrayi0 = s.getSpcmnAccessionIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getAccessionIdentifier().getType().getCoding().size() < i0+1) { specimen.getAccessionIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getAccessionIdentifier().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Spcmn_AccessionId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnAccessionIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSpcmnAccessionIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getAccessionIdentifier().getType().getCoding().size() < i0+1) { specimen.getAccessionIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getAccessionIdentifier().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Spcmn_AccessionId_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnAccessionIdTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSpcmnAccessionIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getAccessionIdentifier().getType().getCoding().size() < i0+1) { specimen.getAccessionIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getAccessionIdentifier().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Spcmn_AccessionId_Typ_Txt ********************************************************************************/
		if(s.getSpcmnAccessionIdTypTxt() != null ) {

			if(s.getSpcmnAccessionIdTypTxt().replace("[","").replace("]","").equals("NULL") | s.getSpcmnAccessionIdTypTxt()==null) {} else {
			specimen.getAccessionIdentifier().getType().setText(s.getSpcmnAccessionIdTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Spcmn_AccessionId_Use ********************************************************************************/
		if(s.getSpcmnAccessionIdUse() != null ) {

			if(s.getSpcmnAccessionIdUse().replace("[","").replace("]","").equals("NULL") | s.getSpcmnAccessionIdUse()==null) {} else {
			specimen.getAccessionIdentifier().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(s.getSpcmnAccessionIdUse().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Spcmn_AccessionId_Vl ********************************************************************************/
		if(s.getSpcmnAccessionIdVl() != null ) {

			if(s.getSpcmnAccessionIdVl().replace("[","").replace("]","").equals("NULL") | s.getSpcmnAccessionIdVl()==null) {} else {
			specimen.getAccessionIdentifier().setValue(s.getSpcmnAccessionIdVl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Spcmn_Collection_BodySite_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnCollectionBodySiteCdgCd() != null ) {

			String[] arrayi0 = s.getSpcmnCollectionBodySiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getCollection().getBodySite().getCoding().size() < i0+1) { specimen.getCollection().getBodySite().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getCollection().getBodySite().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Spcmn_Collection_BodySite_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnCollectionBodySiteCdgDsply() != null ) {

			String[] arrayi0 = s.getSpcmnCollectionBodySiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getCollection().getBodySite().getCoding().size() < i0+1) { specimen.getCollection().getBodySite().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getCollection().getBodySite().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Spcmn_Collection_BodySite_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnCollectionBodySiteCdgSys() != null ) {

			String[] arrayi0 = s.getSpcmnCollectionBodySiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getCollection().getBodySite().getCoding().size() < i0+1) { specimen.getCollection().getBodySite().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getCollection().getBodySite().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Spcmn_Collection_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnCollectionBodySiteCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSpcmnCollectionBodySiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getCollection().getBodySite().getCoding().size() < i0+1) { specimen.getCollection().getBodySite().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getCollection().getBodySite().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Spcmn_Collection_BodySite_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnCollectionBodySiteCdgVrsn() != null ) {

			String[] arrayi0 = s.getSpcmnCollectionBodySiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getCollection().getBodySite().getCoding().size() < i0+1) { specimen.getCollection().getBodySite().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getCollection().getBodySite().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Spcmn_Collection_BodySite_Txt ********************************************************************************/
		if(s.getSpcmnCollectionBodySiteTxt() != null ) {

			if(s.getSpcmnCollectionBodySiteTxt().replace("[","").replace("]","").equals("NULL") | s.getSpcmnCollectionBodySiteTxt()==null) {} else {
			specimen.getCollection().getBodySite().setText(s.getSpcmnCollectionBodySiteTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Spcmn_Collection_CollectedDtTimeTyp ********************************************************************************/
		if(s.getSpcmnCollectionCollectedDtTimeTyp() != null ) {

			if(s.getSpcmnCollectionCollectedDtTimeTyp().replace("[","").replace("]","").equals("NULL") | s.getSpcmnCollectionCollectedDtTimeTyp()==null) {} else {
			specimen.getCollection().setCollected(new org.hl7.fhir.r4.model.DateTimeType(s.getSpcmnCollectionCollectedDtTimeTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Spcmn_Collection_CollectedPrd_End ********************************************************************************/
		if(s.getSpcmnCollectionCollectedPrdEnd() != null ) {

			if(s.getSpcmnCollectionCollectedPrdEnd().replace("[","").replace("]","").equals("NULL") | s.getSpcmnCollectionCollectedPrdEnd()==null) {} else {
			specimen.getCollection().getCollectedPeriod().setEnd(s.getSpcmnCollectionCollectedPrdEnd().replace("[","").replace("]","").equals("NULL") | s.getSpcmnCollectionCollectedPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(s.getSpcmnCollectionCollectedPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Spcmn_Collection_CollectedPrd_Strt ********************************************************************************/
		if(s.getSpcmnCollectionCollectedPrdStrt() != null ) {

			if(s.getSpcmnCollectionCollectedPrdStrt().replace("[","").replace("]","").equals("NULL") | s.getSpcmnCollectionCollectedPrdStrt()==null) {} else {
			specimen.getCollection().getCollectedPeriod().setStart(s.getSpcmnCollectionCollectedPrdStrt().replace("[","").replace("]","").equals("NULL") | s.getSpcmnCollectionCollectedPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(s.getSpcmnCollectionCollectedPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Spcmn_Collection_Collector ********************************************************************************/
		if(s.getSpcmnCollectionCollector() != null ) {

			if(s.getSpcmnCollectionCollector().replace("[","").replace("]","").equals("NULL") | s.getSpcmnCollectionCollector()==null) {} else {
			specimen.getCollection().setCollector(new org.hl7.fhir.r4.model.Reference(s.getSpcmnCollectionCollector().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Spcmn_Collection_Duration_Cd ********************************************************************************/
		if(s.getSpcmnCollectionDurationCd() != null ) {

			if(s.getSpcmnCollectionDurationCd().replace("[","").replace("]","").equals("NULL") | s.getSpcmnCollectionDurationCd()==null) {} else {
			specimen.getCollection().getDuration().setCode(s.getSpcmnCollectionDurationCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Spcmn_Collection_Duration_Cmprtr ********************************************************************************/
		if(s.getSpcmnCollectionDurationCmprtr() != null ) {

			if(s.getSpcmnCollectionDurationCmprtr().replace("[","").replace("]","").equals("NULL") | s.getSpcmnCollectionDurationCmprtr()==null) {} else {
			specimen.getCollection().getDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(s.getSpcmnCollectionDurationCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Spcmn_Collection_Duration_Sys ********************************************************************************/
		if(s.getSpcmnCollectionDurationSys() != null ) {

			if(s.getSpcmnCollectionDurationSys().replace("[","").replace("]","").equals("NULL") | s.getSpcmnCollectionDurationSys()==null) {} else {
			specimen.getCollection().getDuration().setSystem(s.getSpcmnCollectionDurationSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Spcmn_Collection_Duration_Unt ********************************************************************************/
		if(s.getSpcmnCollectionDurationUnt() != null ) {

			if(s.getSpcmnCollectionDurationUnt().replace("[","").replace("]","").equals("NULL") | s.getSpcmnCollectionDurationUnt()==null) {} else {
			specimen.getCollection().getDuration().setUnit(s.getSpcmnCollectionDurationUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Spcmn_Collection_Duration_Vl ********************************************************************************/
		if(s.getSpcmnCollectionDurationVl() != null ) {

			if(s.getSpcmnCollectionDurationVl().replace("[","").replace("]","").equals("NULL") | s.getSpcmnCollectionDurationVl()==null) {} else {
			specimen.getCollection().getDuration().setValue((new java.math.BigDecimal((s.getSpcmnCollectionDurationVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Spcmn_Collection_FastingStsCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnCollectionFastingStsCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = s.getSpcmnCollectionFastingStsCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getCollection().getFastingStatusCodeableConcept().getCoding().size() < i0+1) { specimen.getCollection().getFastingStatusCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getCollection().getFastingStatusCodeableConcept().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Spcmn_Collection_FastingStsCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnCollectionFastingStsCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = s.getSpcmnCollectionFastingStsCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getCollection().getFastingStatusCodeableConcept().getCoding().size() < i0+1) { specimen.getCollection().getFastingStatusCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getCollection().getFastingStatusCodeableConcept().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Spcmn_Collection_FastingStsCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnCollectionFastingStsCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = s.getSpcmnCollectionFastingStsCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getCollection().getFastingStatusCodeableConcept().getCoding().size() < i0+1) { specimen.getCollection().getFastingStatusCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getCollection().getFastingStatusCodeableConcept().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Spcmn_Collection_FastingStsCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnCollectionFastingStsCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSpcmnCollectionFastingStsCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getCollection().getFastingStatusCodeableConcept().getCoding().size() < i0+1) { specimen.getCollection().getFastingStatusCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getCollection().getFastingStatusCodeableConcept().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Spcmn_Collection_FastingStsCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnCollectionFastingStsCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = s.getSpcmnCollectionFastingStsCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getCollection().getFastingStatusCodeableConcept().getCoding().size() < i0+1) { specimen.getCollection().getFastingStatusCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getCollection().getFastingStatusCodeableConcept().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Spcmn_Collection_FastingStsCdbleCncpt_Txt ********************************************************************************/
		if(s.getSpcmnCollectionFastingStsCdbleCncptTxt() != null ) {

			if(s.getSpcmnCollectionFastingStsCdbleCncptTxt().replace("[","").replace("]","").equals("NULL") | s.getSpcmnCollectionFastingStsCdbleCncptTxt()==null) {} else {
			specimen.getCollection().getFastingStatusCodeableConcept().setText(s.getSpcmnCollectionFastingStsCdbleCncptTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Spcmn_Collection_FastingStsDuration_Cd ********************************************************************************/
		if(s.getSpcmnCollectionFastingStsDurationCd() != null ) {

			if(s.getSpcmnCollectionFastingStsDurationCd().replace("[","").replace("]","").equals("NULL") | s.getSpcmnCollectionFastingStsDurationCd()==null) {} else {
			specimen.getCollection().getFastingStatusDuration().setCode(s.getSpcmnCollectionFastingStsDurationCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Spcmn_Collection_FastingStsDuration_Cmprtr ********************************************************************************/
		if(s.getSpcmnCollectionFastingStsDurationCmprtr() != null ) {

			if(s.getSpcmnCollectionFastingStsDurationCmprtr().replace("[","").replace("]","").equals("NULL") | s.getSpcmnCollectionFastingStsDurationCmprtr()==null) {} else {
			specimen.getCollection().getFastingStatusDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(s.getSpcmnCollectionFastingStsDurationCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Spcmn_Collection_FastingStsDuration_Sys ********************************************************************************/
		if(s.getSpcmnCollectionFastingStsDurationSys() != null ) {

			if(s.getSpcmnCollectionFastingStsDurationSys().replace("[","").replace("]","").equals("NULL") | s.getSpcmnCollectionFastingStsDurationSys()==null) {} else {
			specimen.getCollection().getFastingStatusDuration().setSystem(s.getSpcmnCollectionFastingStsDurationSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Spcmn_Collection_FastingStsDuration_Unt ********************************************************************************/
		if(s.getSpcmnCollectionFastingStsDurationUnt() != null ) {

			if(s.getSpcmnCollectionFastingStsDurationUnt().replace("[","").replace("]","").equals("NULL") | s.getSpcmnCollectionFastingStsDurationUnt()==null) {} else {
			specimen.getCollection().getFastingStatusDuration().setUnit(s.getSpcmnCollectionFastingStsDurationUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Spcmn_Collection_FastingStsDuration_Vl ********************************************************************************/
		if(s.getSpcmnCollectionFastingStsDurationVl() != null ) {

			if(s.getSpcmnCollectionFastingStsDurationVl().replace("[","").replace("]","").equals("NULL") | s.getSpcmnCollectionFastingStsDurationVl()==null) {} else {
			specimen.getCollection().getFastingStatusDuration().setValue((new java.math.BigDecimal((s.getSpcmnCollectionFastingStsDurationVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Spcmn_Collection_Mthd_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnCollectionMthdCdgCd() != null ) {

			String[] arrayi0 = s.getSpcmnCollectionMthdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getCollection().getMethod().getCoding().size() < i0+1) { specimen.getCollection().getMethod().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getCollection().getMethod().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Spcmn_Collection_Mthd_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnCollectionMthdCdgDsply() != null ) {

			String[] arrayi0 = s.getSpcmnCollectionMthdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getCollection().getMethod().getCoding().size() < i0+1) { specimen.getCollection().getMethod().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getCollection().getMethod().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Spcmn_Collection_Mthd_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnCollectionMthdCdgSys() != null ) {

			String[] arrayi0 = s.getSpcmnCollectionMthdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getCollection().getMethod().getCoding().size() < i0+1) { specimen.getCollection().getMethod().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getCollection().getMethod().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Spcmn_Collection_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnCollectionMthdCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSpcmnCollectionMthdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getCollection().getMethod().getCoding().size() < i0+1) { specimen.getCollection().getMethod().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getCollection().getMethod().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Spcmn_Collection_Mthd_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnCollectionMthdCdgVrsn() != null ) {

			String[] arrayi0 = s.getSpcmnCollectionMthdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getCollection().getMethod().getCoding().size() < i0+1) { specimen.getCollection().getMethod().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getCollection().getMethod().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Spcmn_Collection_Mthd_Txt ********************************************************************************/
		if(s.getSpcmnCollectionMthdTxt() != null ) {

			if(s.getSpcmnCollectionMthdTxt().replace("[","").replace("]","").equals("NULL") | s.getSpcmnCollectionMthdTxt()==null) {} else {
			specimen.getCollection().getMethod().setText(s.getSpcmnCollectionMthdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Spcmn_Collection_Qnty_Cd ********************************************************************************/
		if(s.getSpcmnCollectionQntyCd() != null ) {

			if(s.getSpcmnCollectionQntyCd().replace("[","").replace("]","").equals("NULL") | s.getSpcmnCollectionQntyCd()==null) {} else {
			specimen.getCollection().getQuantity().setCode(s.getSpcmnCollectionQntyCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Spcmn_Collection_Qnty_Cmprtr ********************************************************************************/
		if(s.getSpcmnCollectionQntyCmprtr() != null ) {

			if(s.getSpcmnCollectionQntyCmprtr().replace("[","").replace("]","").equals("NULL") | s.getSpcmnCollectionQntyCmprtr()==null) {} else {
			specimen.getCollection().getQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(s.getSpcmnCollectionQntyCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Spcmn_Collection_Qnty_Sys ********************************************************************************/
		if(s.getSpcmnCollectionQntySys() != null ) {

			if(s.getSpcmnCollectionQntySys().replace("[","").replace("]","").equals("NULL") | s.getSpcmnCollectionQntySys()==null) {} else {
			specimen.getCollection().getQuantity().setSystem(s.getSpcmnCollectionQntySys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Spcmn_Collection_Qnty_Unt ********************************************************************************/
		if(s.getSpcmnCollectionQntyUnt() != null ) {

			if(s.getSpcmnCollectionQntyUnt().replace("[","").replace("]","").equals("NULL") | s.getSpcmnCollectionQntyUnt()==null) {} else {
			specimen.getCollection().getQuantity().setUnit(s.getSpcmnCollectionQntyUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Spcmn_Collection_Qnty_Vl ********************************************************************************/
		if(s.getSpcmnCollectionQntyVl() != null ) {

			if(s.getSpcmnCollectionQntyVl().replace("[","").replace("]","").equals("NULL") | s.getSpcmnCollectionQntyVl()==null) {} else {
			specimen.getCollection().getQuantity().setValue((new java.math.BigDecimal((s.getSpcmnCollectionQntyVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** Spcmn_Cndtn_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnCndtnCdgCd() != null ) {

			String[] arrayi0 = s.getSpcmnCndtnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getCondition().size() < i0+1) { specimen.addCondition(); }
				String[] arrayi1 = s.getSpcmnCndtnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getCondition().get(i0).getCoding().size() < i1+1) { specimen.getCondition().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimen.getCondition().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Spcmn_Cndtn_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnCndtnCdgDsply() != null ) {

			String[] arrayi0 = s.getSpcmnCndtnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getCondition().size() < i0+1) { specimen.addCondition(); }
				String[] arrayi1 = s.getSpcmnCndtnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getCondition().get(i0).getCoding().size() < i1+1) { specimen.getCondition().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimen.getCondition().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Spcmn_Cndtn_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnCndtnCdgSys() != null ) {

			String[] arrayi0 = s.getSpcmnCndtnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getCondition().size() < i0+1) { specimen.addCondition(); }
				String[] arrayi1 = s.getSpcmnCndtnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getCondition().get(i0).getCoding().size() < i1+1) { specimen.getCondition().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimen.getCondition().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Spcmn_Cndtn_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnCndtnCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSpcmnCndtnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getCondition().size() < i0+1) { specimen.addCondition(); }
				String[] arrayi1 = s.getSpcmnCndtnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getCondition().get(i0).getCoding().size() < i1+1) { specimen.getCondition().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimen.getCondition().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Spcmn_Cndtn_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnCndtnCdgVrsn() != null ) {

			String[] arrayi0 = s.getSpcmnCndtnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getCondition().size() < i0+1) { specimen.addCondition(); }
				String[] arrayi1 = s.getSpcmnCndtnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getCondition().get(i0).getCoding().size() < i1+1) { specimen.getCondition().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimen.getCondition().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Spcmn_Cndtn_Txt ********************************************************************************/
		if(s.getSpcmnCndtnTxt() != null ) {

			String[] arrayi0 = s.getSpcmnCndtnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getCondition().size() < i0+1) { specimen.addCondition(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getCondition().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Spcmn_Cntainer_AddtvCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnCntainerAddtvCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = s.getSpcmnCntainerAddtvCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getContainer().size() < i0+1) { specimen.addContainer(); }
				String[] arrayi1 = s.getSpcmnCntainerAddtvCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getContainer().get(i0).getAdditiveCodeableConcept().getCoding().size() < i1+1) { specimen.getContainer().get(i0).getAdditiveCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimen.getContainer().get(i0).getAdditiveCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Spcmn_Cntainer_AddtvCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnCntainerAddtvCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = s.getSpcmnCntainerAddtvCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getContainer().size() < i0+1) { specimen.addContainer(); }
				String[] arrayi1 = s.getSpcmnCntainerAddtvCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getContainer().get(i0).getAdditiveCodeableConcept().getCoding().size() < i1+1) { specimen.getContainer().get(i0).getAdditiveCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimen.getContainer().get(i0).getAdditiveCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Spcmn_Cntainer_AddtvCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnCntainerAddtvCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = s.getSpcmnCntainerAddtvCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getContainer().size() < i0+1) { specimen.addContainer(); }
				String[] arrayi1 = s.getSpcmnCntainerAddtvCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getContainer().get(i0).getAdditiveCodeableConcept().getCoding().size() < i1+1) { specimen.getContainer().get(i0).getAdditiveCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimen.getContainer().get(i0).getAdditiveCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Spcmn_Cntainer_AddtvCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnCntainerAddtvCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSpcmnCntainerAddtvCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getContainer().size() < i0+1) { specimen.addContainer(); }
				String[] arrayi1 = s.getSpcmnCntainerAddtvCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getContainer().get(i0).getAdditiveCodeableConcept().getCoding().size() < i1+1) { specimen.getContainer().get(i0).getAdditiveCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimen.getContainer().get(i0).getAdditiveCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Spcmn_Cntainer_AddtvCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnCntainerAddtvCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = s.getSpcmnCntainerAddtvCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getContainer().size() < i0+1) { specimen.addContainer(); }
				String[] arrayi1 = s.getSpcmnCntainerAddtvCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getContainer().get(i0).getAdditiveCodeableConcept().getCoding().size() < i1+1) { specimen.getContainer().get(i0).getAdditiveCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimen.getContainer().get(i0).getAdditiveCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Spcmn_Cntainer_AddtvCdbleCncpt_Txt ********************************************************************************/
		if(s.getSpcmnCntainerAddtvCdbleCncptTxt() != null ) {

			String[] arrayi0 = s.getSpcmnCntainerAddtvCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getContainer().size() < i0+1) { specimen.addContainer(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getContainer().get(i0).getAdditiveCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Spcmn_Cntainer_AddtvRfrnc ********************************************************************************/
		if(s.getSpcmnCntainerAddtvRfrnc() != null ) {

			String[] arrayi0 = s.getSpcmnCntainerAddtvRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getContainer().size() < i0+1) { specimen.addContainer(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getContainer().get(i0).setAdditive(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Spcmn_Cntainer_Capacity_Cd ********************************************************************************/
		if(s.getSpcmnCntainerCapacityCd() != null ) {

			String[] arrayi0 = s.getSpcmnCntainerCapacityCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getContainer().size() < i0+1) { specimen.addContainer(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getContainer().get(i0).getCapacity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Spcmn_Cntainer_Capacity_Cmprtr ********************************************************************************/
		if(s.getSpcmnCntainerCapacityCmprtr() != null ) {

			String[] arrayi0 = s.getSpcmnCntainerCapacityCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getContainer().size() < i0+1) { specimen.addContainer(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getContainer().get(i0).getCapacity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Spcmn_Cntainer_Capacity_Sys ********************************************************************************/
		if(s.getSpcmnCntainerCapacitySys() != null ) {

			String[] arrayi0 = s.getSpcmnCntainerCapacitySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getContainer().size() < i0+1) { specimen.addContainer(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getContainer().get(i0).getCapacity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Spcmn_Cntainer_Capacity_Unt ********************************************************************************/
		if(s.getSpcmnCntainerCapacityUnt() != null ) {

			String[] arrayi0 = s.getSpcmnCntainerCapacityUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getContainer().size() < i0+1) { specimen.addContainer(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getContainer().get(i0).getCapacity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Spcmn_Cntainer_Capacity_Vl ********************************************************************************/
		if(s.getSpcmnCntainerCapacityVl() != null ) {

			String[] arrayi0 = s.getSpcmnCntainerCapacityVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getContainer().size() < i0+1) { specimen.addContainer(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getContainer().get(i0).getCapacity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Spcmn_Cntainer_Dscrptn ********************************************************************************/
		if(s.getSpcmnCntainerDscrptn() != null ) {

			String[] arrayi0 = s.getSpcmnCntainerDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getContainer().size() < i0+1) { specimen.addContainer(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getContainer().get(i0).setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Spcmn_Cntainer_Id_Assigner ********************************************************************************/
		if(s.getSpcmnCntainerIdAssigner() != null ) {

			String[] arrayi0 = s.getSpcmnCntainerIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getContainer().size() < i0+1) { specimen.addContainer(); }
				String[] arrayi1 = s.getSpcmnCntainerIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getContainer().get(i0).getIdentifier().size() < i1+1) { specimen.getContainer().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimen.getContainer().get(i0).getIdentifier().get(i1).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Spcmn_Cntainer_Id_Prd_End ********************************************************************************/
		if(s.getSpcmnCntainerIdPrdEnd() != null ) {

			String[] arrayi0 = s.getSpcmnCntainerIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getContainer().size() < i0+1) { specimen.addContainer(); }
				String[] arrayi1 = s.getSpcmnCntainerIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getContainer().get(i0).getIdentifier().size() < i1+1) { specimen.getContainer().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimen.getContainer().get(i0).getIdentifier().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Spcmn_Cntainer_Id_Prd_Strt ********************************************************************************/
		if(s.getSpcmnCntainerIdPrdStrt() != null ) {

			String[] arrayi0 = s.getSpcmnCntainerIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getContainer().size() < i0+1) { specimen.addContainer(); }
				String[] arrayi1 = s.getSpcmnCntainerIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getContainer().get(i0).getIdentifier().size() < i1+1) { specimen.getContainer().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimen.getContainer().get(i0).getIdentifier().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Spcmn_Cntainer_Id_Sys ********************************************************************************/
		if(s.getSpcmnCntainerIdSys() != null ) {

			String[] arrayi0 = s.getSpcmnCntainerIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getContainer().size() < i0+1) { specimen.addContainer(); }
				String[] arrayi1 = s.getSpcmnCntainerIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getContainer().get(i0).getIdentifier().size() < i1+1) { specimen.getContainer().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimen.getContainer().get(i0).getIdentifier().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Spcmn_Cntainer_Id_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnCntainerIdTypCdgCd() != null ) {

			String[] arrayi0 = s.getSpcmnCntainerIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getContainer().size() < i0+1) { specimen.addContainer(); }
				String[] arrayi1 = s.getSpcmnCntainerIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getContainer().get(i0).getIdentifier().size() < i1+1) { specimen.getContainer().get(i0).addIdentifier(); }
					String[] arrayi2 = s.getSpcmnCntainerIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(specimen.getContainer().get(i0).getIdentifier().get(i1).getType().getCoding().size() < i2+1) { specimen.getContainer().get(i0).getIdentifier().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {specimen.getContainer().get(i0).getIdentifier().get(i1).getType().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Spcmn_Cntainer_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnCntainerIdTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSpcmnCntainerIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getContainer().size() < i0+1) { specimen.addContainer(); }
				String[] arrayi1 = s.getSpcmnCntainerIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getContainer().get(i0).getIdentifier().size() < i1+1) { specimen.getContainer().get(i0).addIdentifier(); }
					String[] arrayi2 = s.getSpcmnCntainerIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(specimen.getContainer().get(i0).getIdentifier().get(i1).getType().getCoding().size() < i2+1) { specimen.getContainer().get(i0).getIdentifier().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {specimen.getContainer().get(i0).getIdentifier().get(i1).getType().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Spcmn_Cntainer_Id_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnCntainerIdTypCdgSys() != null ) {

			String[] arrayi0 = s.getSpcmnCntainerIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getContainer().size() < i0+1) { specimen.addContainer(); }
				String[] arrayi1 = s.getSpcmnCntainerIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getContainer().get(i0).getIdentifier().size() < i1+1) { specimen.getContainer().get(i0).addIdentifier(); }
					String[] arrayi2 = s.getSpcmnCntainerIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(specimen.getContainer().get(i0).getIdentifier().get(i1).getType().getCoding().size() < i2+1) { specimen.getContainer().get(i0).getIdentifier().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {specimen.getContainer().get(i0).getIdentifier().get(i1).getType().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Spcmn_Cntainer_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnCntainerIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSpcmnCntainerIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getContainer().size() < i0+1) { specimen.addContainer(); }
				String[] arrayi1 = s.getSpcmnCntainerIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getContainer().get(i0).getIdentifier().size() < i1+1) { specimen.getContainer().get(i0).addIdentifier(); }
					String[] arrayi2 = s.getSpcmnCntainerIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(specimen.getContainer().get(i0).getIdentifier().get(i1).getType().getCoding().size() < i2+1) { specimen.getContainer().get(i0).getIdentifier().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {specimen.getContainer().get(i0).getIdentifier().get(i1).getType().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Spcmn_Cntainer_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnCntainerIdTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSpcmnCntainerIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getContainer().size() < i0+1) { specimen.addContainer(); }
				String[] arrayi1 = s.getSpcmnCntainerIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getContainer().get(i0).getIdentifier().size() < i1+1) { specimen.getContainer().get(i0).addIdentifier(); }
					String[] arrayi2 = s.getSpcmnCntainerIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(specimen.getContainer().get(i0).getIdentifier().get(i1).getType().getCoding().size() < i2+1) { specimen.getContainer().get(i0).getIdentifier().get(i1).getType().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {specimen.getContainer().get(i0).getIdentifier().get(i1).getType().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Spcmn_Cntainer_Id_Typ_Txt ********************************************************************************/
		if(s.getSpcmnCntainerIdTypTxt() != null ) {

			String[] arrayi0 = s.getSpcmnCntainerIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getContainer().size() < i0+1) { specimen.addContainer(); }
				String[] arrayi1 = s.getSpcmnCntainerIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getContainer().get(i0).getIdentifier().size() < i1+1) { specimen.getContainer().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimen.getContainer().get(i0).getIdentifier().get(i1).getType().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Spcmn_Cntainer_Id_Use ********************************************************************************/
		if(s.getSpcmnCntainerIdUse() != null ) {

			String[] arrayi0 = s.getSpcmnCntainerIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getContainer().size() < i0+1) { specimen.addContainer(); }
				String[] arrayi1 = s.getSpcmnCntainerIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getContainer().get(i0).getIdentifier().size() < i1+1) { specimen.getContainer().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimen.getContainer().get(i0).getIdentifier().get(i1).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Spcmn_Cntainer_Id_Vl ********************************************************************************/
		if(s.getSpcmnCntainerIdVl() != null ) {

			String[] arrayi0 = s.getSpcmnCntainerIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getContainer().size() < i0+1) { specimen.addContainer(); }
				String[] arrayi1 = s.getSpcmnCntainerIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getContainer().get(i0).getIdentifier().size() < i1+1) { specimen.getContainer().get(i0).addIdentifier(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimen.getContainer().get(i0).getIdentifier().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Spcmn_Cntainer_SpcmnQnty_Cd ********************************************************************************/
		if(s.getSpcmnCntainerSpcmnQntyCd() != null ) {

			String[] arrayi0 = s.getSpcmnCntainerSpcmnQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getContainer().size() < i0+1) { specimen.addContainer(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getContainer().get(i0).getSpecimenQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Spcmn_Cntainer_SpcmnQnty_Cmprtr ********************************************************************************/
		if(s.getSpcmnCntainerSpcmnQntyCmprtr() != null ) {

			String[] arrayi0 = s.getSpcmnCntainerSpcmnQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getContainer().size() < i0+1) { specimen.addContainer(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getContainer().get(i0).getSpecimenQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Spcmn_Cntainer_SpcmnQnty_Sys ********************************************************************************/
		if(s.getSpcmnCntainerSpcmnQntySys() != null ) {

			String[] arrayi0 = s.getSpcmnCntainerSpcmnQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getContainer().size() < i0+1) { specimen.addContainer(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getContainer().get(i0).getSpecimenQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Spcmn_Cntainer_SpcmnQnty_Unt ********************************************************************************/
		if(s.getSpcmnCntainerSpcmnQntyUnt() != null ) {

			String[] arrayi0 = s.getSpcmnCntainerSpcmnQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getContainer().size() < i0+1) { specimen.addContainer(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getContainer().get(i0).getSpecimenQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Spcmn_Cntainer_SpcmnQnty_Vl ********************************************************************************/
		if(s.getSpcmnCntainerSpcmnQntyVl() != null ) {

			String[] arrayi0 = s.getSpcmnCntainerSpcmnQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getContainer().size() < i0+1) { specimen.addContainer(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getContainer().get(i0).getSpecimenQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Spcmn_Cntainer_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnCntainerTypCdgCd() != null ) {

			String[] arrayi0 = s.getSpcmnCntainerTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getContainer().size() < i0+1) { specimen.addContainer(); }
				String[] arrayi1 = s.getSpcmnCntainerTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getContainer().get(i0).getType().getCoding().size() < i1+1) { specimen.getContainer().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimen.getContainer().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Spcmn_Cntainer_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnCntainerTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSpcmnCntainerTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getContainer().size() < i0+1) { specimen.addContainer(); }
				String[] arrayi1 = s.getSpcmnCntainerTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getContainer().get(i0).getType().getCoding().size() < i1+1) { specimen.getContainer().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimen.getContainer().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Spcmn_Cntainer_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnCntainerTypCdgSys() != null ) {

			String[] arrayi0 = s.getSpcmnCntainerTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getContainer().size() < i0+1) { specimen.addContainer(); }
				String[] arrayi1 = s.getSpcmnCntainerTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getContainer().get(i0).getType().getCoding().size() < i1+1) { specimen.getContainer().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimen.getContainer().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Spcmn_Cntainer_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnCntainerTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSpcmnCntainerTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getContainer().size() < i0+1) { specimen.addContainer(); }
				String[] arrayi1 = s.getSpcmnCntainerTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getContainer().get(i0).getType().getCoding().size() < i1+1) { specimen.getContainer().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimen.getContainer().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Spcmn_Cntainer_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnCntainerTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSpcmnCntainerTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getContainer().size() < i0+1) { specimen.addContainer(); }
				String[] arrayi1 = s.getSpcmnCntainerTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getContainer().get(i0).getType().getCoding().size() < i1+1) { specimen.getContainer().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimen.getContainer().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Spcmn_Cntainer_Typ_Txt ********************************************************************************/
		if(s.getSpcmnCntainerTypTxt() != null ) {

			String[] arrayi0 = s.getSpcmnCntainerTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getContainer().size() < i0+1) { specimen.addContainer(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getContainer().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Spcmn_Id_Assigner ********************************************************************************/
		if(s.getSpcmnIdAssigner() != null ) {

			String[] arrayi0 = s.getSpcmnIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getIdentifier().size() < i0+1) { specimen.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Spcmn_Id_Prd_End ********************************************************************************/
		if(s.getSpcmnIdPrdEnd() != null ) {

			String[] arrayi0 = s.getSpcmnIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getIdentifier().size() < i0+1) { specimen.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Spcmn_Id_Prd_Strt ********************************************************************************/
		if(s.getSpcmnIdPrdStrt() != null ) {

			String[] arrayi0 = s.getSpcmnIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getIdentifier().size() < i0+1) { specimen.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Spcmn_Id_Sys ********************************************************************************/
		if(s.getSpcmnIdSys() != null ) {

			String[] arrayi0 = s.getSpcmnIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getIdentifier().size() < i0+1) { specimen.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Spcmn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnIdTypCdgCd() != null ) {

			String[] arrayi0 = s.getSpcmnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getIdentifier().size() < i0+1) { specimen.addIdentifier(); }
				String[] arrayi1 = s.getSpcmnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { specimen.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimen.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Spcmn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnIdTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSpcmnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getIdentifier().size() < i0+1) { specimen.addIdentifier(); }
				String[] arrayi1 = s.getSpcmnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { specimen.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimen.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Spcmn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnIdTypCdgSys() != null ) {

			String[] arrayi0 = s.getSpcmnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getIdentifier().size() < i0+1) { specimen.addIdentifier(); }
				String[] arrayi1 = s.getSpcmnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { specimen.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimen.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Spcmn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSpcmnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getIdentifier().size() < i0+1) { specimen.addIdentifier(); }
				String[] arrayi1 = s.getSpcmnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { specimen.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimen.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Spcmn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnIdTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSpcmnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getIdentifier().size() < i0+1) { specimen.addIdentifier(); }
				String[] arrayi1 = s.getSpcmnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { specimen.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimen.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Spcmn_Id_Typ_Txt ********************************************************************************/
		if(s.getSpcmnIdTypTxt() != null ) {

			String[] arrayi0 = s.getSpcmnIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getIdentifier().size() < i0+1) { specimen.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Spcmn_Id_Use ********************************************************************************/
		if(s.getSpcmnIdUse() != null ) {

			String[] arrayi0 = s.getSpcmnIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getIdentifier().size() < i0+1) { specimen.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Spcmn_Id_Vl ********************************************************************************/
		if(s.getSpcmnIdVl() != null ) {

			String[] arrayi0 = s.getSpcmnIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getIdentifier().size() < i0+1) { specimen.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Spcmn_Nt_AthrRfrnc ********************************************************************************/
		if(s.getSpcmnNtAthrRfrnc() != null ) {

			String[] arrayi0 = s.getSpcmnNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getNote().size() < i0+1) { specimen.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Spcmn_Nt_AthrStrgTyp ********************************************************************************/
		if(s.getSpcmnNtAthrStrgTyp() != null ) {

			String[] arrayi0 = s.getSpcmnNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getNote().size() < i0+1) { specimen.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Spcmn_Nt_Txt ********************************************************************************/
		if(s.getSpcmnNtTxt() != null ) {

			String[] arrayi0 = s.getSpcmnNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getNote().size() < i0+1) { specimen.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Spcmn_Nt_Time ********************************************************************************/
		if(s.getSpcmnNtTime() != null ) {

			String[] arrayi0 = s.getSpcmnNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getNote().size() < i0+1) { specimen.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Spcmn_Parent ********************************************************************************/
		if(s.getSpcmnParent() != null ) {

				for( String currListStrSplit : s.getSpcmnParent().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			specimen.addParent(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Spcmn_Processing_Addtv ********************************************************************************/
		if(s.getSpcmnProcessingAddtv() != null ) {

			String[] arrayi0 = s.getSpcmnProcessingAddtv().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getProcessing().size() < i0+1) { specimen.addProcessing(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {specimen.getProcessing().get(i0).addAdditive(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Spcmn_Processing_Dscrptn ********************************************************************************/
		if(s.getSpcmnProcessingDscrptn() != null ) {

			String[] arrayi0 = s.getSpcmnProcessingDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getProcessing().size() < i0+1) { specimen.addProcessing(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getProcessing().get(i0).setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Spcmn_Processing_Prcdr_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnProcessingPrcdrCdgCd() != null ) {

			String[] arrayi0 = s.getSpcmnProcessingPrcdrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getProcessing().size() < i0+1) { specimen.addProcessing(); }
				String[] arrayi1 = s.getSpcmnProcessingPrcdrCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getProcessing().get(i0).getProcedure().getCoding().size() < i1+1) { specimen.getProcessing().get(i0).getProcedure().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimen.getProcessing().get(i0).getProcedure().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Spcmn_Processing_Prcdr_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnProcessingPrcdrCdgDsply() != null ) {

			String[] arrayi0 = s.getSpcmnProcessingPrcdrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getProcessing().size() < i0+1) { specimen.addProcessing(); }
				String[] arrayi1 = s.getSpcmnProcessingPrcdrCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getProcessing().get(i0).getProcedure().getCoding().size() < i1+1) { specimen.getProcessing().get(i0).getProcedure().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimen.getProcessing().get(i0).getProcedure().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Spcmn_Processing_Prcdr_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnProcessingPrcdrCdgSys() != null ) {

			String[] arrayi0 = s.getSpcmnProcessingPrcdrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getProcessing().size() < i0+1) { specimen.addProcessing(); }
				String[] arrayi1 = s.getSpcmnProcessingPrcdrCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getProcessing().get(i0).getProcedure().getCoding().size() < i1+1) { specimen.getProcessing().get(i0).getProcedure().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimen.getProcessing().get(i0).getProcedure().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Spcmn_Processing_Prcdr_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnProcessingPrcdrCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSpcmnProcessingPrcdrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getProcessing().size() < i0+1) { specimen.addProcessing(); }
				String[] arrayi1 = s.getSpcmnProcessingPrcdrCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getProcessing().get(i0).getProcedure().getCoding().size() < i1+1) { specimen.getProcessing().get(i0).getProcedure().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimen.getProcessing().get(i0).getProcedure().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Spcmn_Processing_Prcdr_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnProcessingPrcdrCdgVrsn() != null ) {

			String[] arrayi0 = s.getSpcmnProcessingPrcdrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getProcessing().size() < i0+1) { specimen.addProcessing(); }
				String[] arrayi1 = s.getSpcmnProcessingPrcdrCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(specimen.getProcessing().get(i0).getProcedure().getCoding().size() < i1+1) { specimen.getProcessing().get(i0).getProcedure().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {specimen.getProcessing().get(i0).getProcedure().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Spcmn_Processing_Prcdr_Txt ********************************************************************************/
		if(s.getSpcmnProcessingPrcdrTxt() != null ) {

			String[] arrayi0 = s.getSpcmnProcessingPrcdrTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getProcessing().size() < i0+1) { specimen.addProcessing(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getProcessing().get(i0).getProcedure().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Spcmn_Processing_TimeDtTimeTyp ********************************************************************************/
		if(s.getSpcmnProcessingTimeDtTimeTyp() != null ) {

			String[] arrayi0 = s.getSpcmnProcessingTimeDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getProcessing().size() < i0+1) { specimen.addProcessing(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getProcessing().get(i0).setTime(new org.hl7.fhir.r4.model.DateTimeType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Spcmn_Processing_TimePrd_End ********************************************************************************/
		if(s.getSpcmnProcessingTimePrdEnd() != null ) {

			String[] arrayi0 = s.getSpcmnProcessingTimePrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getProcessing().size() < i0+1) { specimen.addProcessing(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getProcessing().get(i0).getTimePeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Spcmn_Processing_TimePrd_Strt ********************************************************************************/
		if(s.getSpcmnProcessingTimePrdStrt() != null ) {

			String[] arrayi0 = s.getSpcmnProcessingTimePrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getProcessing().size() < i0+1) { specimen.addProcessing(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getProcessing().get(i0).getTimePeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Spcmn_ReceivedTime ********************************************************************************/
		if(s.getSpcmnReceivedTime() != null ) {

			if(s.getSpcmnReceivedTime().replace("[","").replace("]","").equals("NULL") | s.getSpcmnReceivedTime()==null) {} else {
			specimen.setReceivedTime(s.getSpcmnReceivedTime().replace("[","").replace("]","").equals("NULL") | s.getSpcmnReceivedTime()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(s.getSpcmnReceivedTime().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Spcmn_Rqst ********************************************************************************/
		if(s.getSpcmnRqst() != null ) {

				for( String currListStrSplit : s.getSpcmnRqst().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			specimen.addRequest(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Spcmn_Sts ********************************************************************************/
		if(s.getSpcmnSts() != null ) {

			if(s.getSpcmnSts().replace("[","").replace("]","").equals("NULL") | s.getSpcmnSts()==null) {} else {
			specimen.setStatus(new org.hl7.fhir.r4.model.Specimen.SpecimenStatusEnumFactory().fromCode(s.getSpcmnSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Spcmn_Sbjct ********************************************************************************/
		if(s.getSpcmnSbjct() != null ) {

			if(s.getSpcmnSbjct().replace("[","").replace("]","").equals("NULL") | s.getSpcmnSbjct()==null) {} else {
			specimen.setSubject(new org.hl7.fhir.r4.model.Reference(s.getSpcmnSbjct().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Spcmn_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSpcmnTypCdgCd() != null ) {

			String[] arrayi0 = s.getSpcmnTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getType().getCoding().size() < i0+1) { specimen.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Spcmn_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSpcmnTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSpcmnTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getType().getCoding().size() < i0+1) { specimen.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Spcmn_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSpcmnTypCdgSys() != null ) {

			String[] arrayi0 = s.getSpcmnTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getType().getCoding().size() < i0+1) { specimen.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Spcmn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpcmnTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSpcmnTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getType().getCoding().size() < i0+1) { specimen.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Spcmn_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSpcmnTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSpcmnTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(specimen.getType().getCoding().size() < i0+1) { specimen.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {specimen.getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Spcmn_Typ_Txt ********************************************************************************/
		if(s.getSpcmnTypTxt() != null ) {

			if(s.getSpcmnTypTxt().replace("[","").replace("]","").equals("NULL") | s.getSpcmnTypTxt()==null) {} else {
			specimen.getType().setText(s.getSpcmnTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return specimen;
	}
}
