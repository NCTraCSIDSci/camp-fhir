package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.CarePlan;
public class CarePlanConversion 
{
	public org.hl7.fhir.r4.model.CarePlan CarePlans(CarePlan c) throws ParseException
	{
		org.hl7.fhir.r4.model.CarePlan careplan = new org.hl7.fhir.r4.model.CarePlan();

		/******************** id ********************************************************************************/
		careplan.setId(c.getId());

		/******************** CarePln_Actvty_Dtl_Cd_Cdg_Cd ********************************************************************************/
		if(c.getCarePlnActvtyDtlCdCdgCd() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				String[] arrayi1 = c.getCarePlnActvtyDtlCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getActivity().get(i0).getDetail().getCode().getCoding().size() < i1+1) { careplan.getActivity().get(i0).getDetail().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careplan.getActivity().get(i0).getDetail().getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CarePln_Actvty_Dtl_Cd_Cdg_Dsply ********************************************************************************/
		if(c.getCarePlnActvtyDtlCdCdgDsply() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				String[] arrayi1 = c.getCarePlnActvtyDtlCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getActivity().get(i0).getDetail().getCode().getCoding().size() < i1+1) { careplan.getActivity().get(i0).getDetail().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careplan.getActivity().get(i0).getDetail().getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CarePln_Actvty_Dtl_Cd_Cdg_Sys ********************************************************************************/
		if(c.getCarePlnActvtyDtlCdCdgSys() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				String[] arrayi1 = c.getCarePlnActvtyDtlCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getActivity().get(i0).getDetail().getCode().getCoding().size() < i1+1) { careplan.getActivity().get(i0).getDetail().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careplan.getActivity().get(i0).getDetail().getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CarePln_Actvty_Dtl_Cd_Cdg_UsrSltd ********************************************************************************/
		if(c.getCarePlnActvtyDtlCdCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				String[] arrayi1 = c.getCarePlnActvtyDtlCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getActivity().get(i0).getDetail().getCode().getCoding().size() < i1+1) { careplan.getActivity().get(i0).getDetail().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careplan.getActivity().get(i0).getDetail().getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CarePln_Actvty_Dtl_Cd_Cdg_Vrsn ********************************************************************************/
		if(c.getCarePlnActvtyDtlCdCdgVrsn() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				String[] arrayi1 = c.getCarePlnActvtyDtlCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getActivity().get(i0).getDetail().getCode().getCoding().size() < i1+1) { careplan.getActivity().get(i0).getDetail().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careplan.getActivity().get(i0).getDetail().getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CarePln_Actvty_Dtl_Cd_Txt ********************************************************************************/
		if(c.getCarePlnActvtyDtlCdTxt() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CarePln_Actvty_Dtl_DailyAmnt_Cd ********************************************************************************/
		if(c.getCarePlnActvtyDtlDailyAmntCd() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlDailyAmntCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getDailyAmount().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CarePln_Actvty_Dtl_DailyAmnt_Cmprtr ********************************************************************************/
		if(c.getCarePlnActvtyDtlDailyAmntCmprtr() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlDailyAmntCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getDailyAmount().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CarePln_Actvty_Dtl_DailyAmnt_Sys ********************************************************************************/
		if(c.getCarePlnActvtyDtlDailyAmntSys() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlDailyAmntSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getDailyAmount().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CarePln_Actvty_Dtl_DailyAmnt_Unt ********************************************************************************/
		if(c.getCarePlnActvtyDtlDailyAmntUnt() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlDailyAmntUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getDailyAmount().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CarePln_Actvty_Dtl_DailyAmnt_Vl ********************************************************************************/
		if(c.getCarePlnActvtyDtlDailyAmntVl() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlDailyAmntVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getDailyAmount().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** CarePln_Actvty_Dtl_Dscrptn ********************************************************************************/
		if(c.getCarePlnActvtyDtlDscrptn() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CarePln_Actvty_Dtl_DoNotPerform ********************************************************************************/
		if(c.getCarePlnActvtyDtlDoNotPerform() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlDoNotPerform().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().setDoNotPerform(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CarePln_Actvty_Dtl_Goal ********************************************************************************/
		if(c.getCarePlnActvtyDtlGoal() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlGoal().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {careplan.getActivity().get(i0).getDetail().addGoal(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CarePln_Actvty_Dtl_InstantiatesCanonical ********************************************************************************/
		if(c.getCarePlnActvtyDtlInstantiatesCanonical() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlInstantiatesCanonical().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {careplan.getActivity().get(i0).getDetail().addInstantiatesCanonical(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CarePln_Actvty_Dtl_InstantiatesUri ********************************************************************************/
		if(c.getCarePlnActvtyDtlInstantiatesUri() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlInstantiatesUri().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {careplan.getActivity().get(i0).getDetail().addInstantiatesUri(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CarePln_Actvty_Dtl_Kind ********************************************************************************/
		if(c.getCarePlnActvtyDtlKind() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlKind().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().setKind(new org.hl7.fhir.r4.model.CarePlan.CarePlanActivityKindEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CarePln_Actvty_Dtl_Lctn ********************************************************************************/
		if(c.getCarePlnActvtyDtlLctn() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlLctn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().setLocation(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CarePln_Actvty_Dtl_Prfrmr ********************************************************************************/
		if(c.getCarePlnActvtyDtlPrfrmr() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlPrfrmr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {careplan.getActivity().get(i0).getDetail().addPerformer(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CarePln_Actvty_Dtl_PrdctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(c.getCarePlnActvtyDtlPrdctCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlPrdctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				String[] arrayi1 = c.getCarePlnActvtyDtlPrdctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getActivity().get(i0).getDetail().getProductCodeableConcept().getCoding().size() < i1+1) { careplan.getActivity().get(i0).getDetail().getProductCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careplan.getActivity().get(i0).getDetail().getProductCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CarePln_Actvty_Dtl_PrdctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(c.getCarePlnActvtyDtlPrdctCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlPrdctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				String[] arrayi1 = c.getCarePlnActvtyDtlPrdctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getActivity().get(i0).getDetail().getProductCodeableConcept().getCoding().size() < i1+1) { careplan.getActivity().get(i0).getDetail().getProductCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careplan.getActivity().get(i0).getDetail().getProductCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CarePln_Actvty_Dtl_PrdctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(c.getCarePlnActvtyDtlPrdctCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlPrdctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				String[] arrayi1 = c.getCarePlnActvtyDtlPrdctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getActivity().get(i0).getDetail().getProductCodeableConcept().getCoding().size() < i1+1) { careplan.getActivity().get(i0).getDetail().getProductCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careplan.getActivity().get(i0).getDetail().getProductCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CarePln_Actvty_Dtl_PrdctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(c.getCarePlnActvtyDtlPrdctCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlPrdctCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				String[] arrayi1 = c.getCarePlnActvtyDtlPrdctCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getActivity().get(i0).getDetail().getProductCodeableConcept().getCoding().size() < i1+1) { careplan.getActivity().get(i0).getDetail().getProductCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careplan.getActivity().get(i0).getDetail().getProductCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CarePln_Actvty_Dtl_PrdctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(c.getCarePlnActvtyDtlPrdctCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlPrdctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				String[] arrayi1 = c.getCarePlnActvtyDtlPrdctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getActivity().get(i0).getDetail().getProductCodeableConcept().getCoding().size() < i1+1) { careplan.getActivity().get(i0).getDetail().getProductCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careplan.getActivity().get(i0).getDetail().getProductCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CarePln_Actvty_Dtl_PrdctCdbleCncpt_Txt ********************************************************************************/
		if(c.getCarePlnActvtyDtlPrdctCdbleCncptTxt() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlPrdctCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getProductCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CarePln_Actvty_Dtl_PrdctRfrnc ********************************************************************************/
		if(c.getCarePlnActvtyDtlPrdctRfrnc() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlPrdctRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().setProduct(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CarePln_Actvty_Dtl_Qnty_Cd ********************************************************************************/
		if(c.getCarePlnActvtyDtlQntyCd() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CarePln_Actvty_Dtl_Qnty_Cmprtr ********************************************************************************/
		if(c.getCarePlnActvtyDtlQntyCmprtr() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CarePln_Actvty_Dtl_Qnty_Sys ********************************************************************************/
		if(c.getCarePlnActvtyDtlQntySys() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CarePln_Actvty_Dtl_Qnty_Unt ********************************************************************************/
		if(c.getCarePlnActvtyDtlQntyUnt() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CarePln_Actvty_Dtl_Qnty_Vl ********************************************************************************/
		if(c.getCarePlnActvtyDtlQntyVl() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** CarePln_Actvty_Dtl_RsnCd_Cdg_Cd ********************************************************************************/
		if(c.getCarePlnActvtyDtlRsnCdCdgCd() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				String[] arrayi1 = c.getCarePlnActvtyDtlRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getActivity().get(i0).getDetail().getReasonCode().size() < i1+1) { careplan.getActivity().get(i0).getDetail().addReasonCode(); }
					String[] arrayi2 = c.getCarePlnActvtyDtlRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(careplan.getActivity().get(i0).getDetail().getReasonCode().get(i1).getCoding().size() < i2+1) { careplan.getActivity().get(i0).getDetail().getReasonCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {careplan.getActivity().get(i0).getDetail().getReasonCode().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CarePln_Actvty_Dtl_RsnCd_Cdg_Dsply ********************************************************************************/
		if(c.getCarePlnActvtyDtlRsnCdCdgDsply() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				String[] arrayi1 = c.getCarePlnActvtyDtlRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getActivity().get(i0).getDetail().getReasonCode().size() < i1+1) { careplan.getActivity().get(i0).getDetail().addReasonCode(); }
					String[] arrayi2 = c.getCarePlnActvtyDtlRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(careplan.getActivity().get(i0).getDetail().getReasonCode().get(i1).getCoding().size() < i2+1) { careplan.getActivity().get(i0).getDetail().getReasonCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {careplan.getActivity().get(i0).getDetail().getReasonCode().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CarePln_Actvty_Dtl_RsnCd_Cdg_Sys ********************************************************************************/
		if(c.getCarePlnActvtyDtlRsnCdCdgSys() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				String[] arrayi1 = c.getCarePlnActvtyDtlRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getActivity().get(i0).getDetail().getReasonCode().size() < i1+1) { careplan.getActivity().get(i0).getDetail().addReasonCode(); }
					String[] arrayi2 = c.getCarePlnActvtyDtlRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(careplan.getActivity().get(i0).getDetail().getReasonCode().get(i1).getCoding().size() < i2+1) { careplan.getActivity().get(i0).getDetail().getReasonCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {careplan.getActivity().get(i0).getDetail().getReasonCode().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CarePln_Actvty_Dtl_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(c.getCarePlnActvtyDtlRsnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				String[] arrayi1 = c.getCarePlnActvtyDtlRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getActivity().get(i0).getDetail().getReasonCode().size() < i1+1) { careplan.getActivity().get(i0).getDetail().addReasonCode(); }
					String[] arrayi2 = c.getCarePlnActvtyDtlRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(careplan.getActivity().get(i0).getDetail().getReasonCode().get(i1).getCoding().size() < i2+1) { careplan.getActivity().get(i0).getDetail().getReasonCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {careplan.getActivity().get(i0).getDetail().getReasonCode().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** CarePln_Actvty_Dtl_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(c.getCarePlnActvtyDtlRsnCdCdgVrsn() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				String[] arrayi1 = c.getCarePlnActvtyDtlRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getActivity().get(i0).getDetail().getReasonCode().size() < i1+1) { careplan.getActivity().get(i0).getDetail().addReasonCode(); }
					String[] arrayi2 = c.getCarePlnActvtyDtlRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(careplan.getActivity().get(i0).getDetail().getReasonCode().get(i1).getCoding().size() < i2+1) { careplan.getActivity().get(i0).getDetail().getReasonCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {careplan.getActivity().get(i0).getDetail().getReasonCode().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CarePln_Actvty_Dtl_RsnCd_Txt ********************************************************************************/
		if(c.getCarePlnActvtyDtlRsnCdTxt() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlRsnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				String[] arrayi1 = c.getCarePlnActvtyDtlRsnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getActivity().get(i0).getDetail().getReasonCode().size() < i1+1) { careplan.getActivity().get(i0).getDetail().addReasonCode(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careplan.getActivity().get(i0).getDetail().getReasonCode().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CarePln_Actvty_Dtl_RsnRfrnc ********************************************************************************/
		if(c.getCarePlnActvtyDtlRsnRfrnc() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlRsnRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {careplan.getActivity().get(i0).getDetail().addReasonReference(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldPrd_End ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldPrdEnd() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldPrd_Strt ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldPrdStrt() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldStrgTyp ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldStrgTyp() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().setScheduled(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Cd_Cdg_Cd ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgCdCdgCd() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				String[] arrayi1 = c.getCarePlnActvtyDtlSchdldTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getActivity().get(i0).getDetail().getScheduledTiming().getCode().getCoding().size() < i1+1) { careplan.getActivity().get(i0).getDetail().getScheduledTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledTiming().getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgCdCdgDsply() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				String[] arrayi1 = c.getCarePlnActvtyDtlSchdldTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getActivity().get(i0).getDetail().getScheduledTiming().getCode().getCoding().size() < i1+1) { careplan.getActivity().get(i0).getDetail().getScheduledTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledTiming().getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Cd_Cdg_Sys ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgCdCdgSys() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				String[] arrayi1 = c.getCarePlnActvtyDtlSchdldTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getActivity().get(i0).getDetail().getScheduledTiming().getCode().getCoding().size() < i1+1) { careplan.getActivity().get(i0).getDetail().getScheduledTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledTiming().getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgCdCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				String[] arrayi1 = c.getCarePlnActvtyDtlSchdldTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getActivity().get(i0).getDetail().getScheduledTiming().getCode().getCoding().size() < i1+1) { careplan.getActivity().get(i0).getDetail().getScheduledTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledTiming().getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgCdCdgVrsn() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				String[] arrayi1 = c.getCarePlnActvtyDtlSchdldTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getActivity().get(i0).getDetail().getScheduledTiming().getCode().getCoding().size() < i1+1) { careplan.getActivity().get(i0).getDetail().getScheduledTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledTiming().getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Cd_Txt ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgCdTxt() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldTmgCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledTiming().getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Evnt ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgEvnt() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldTmgEvnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledTiming().addEvent(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptBndsDurationCd() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldTmgRptBndsDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledTiming().getRepeat().getBoundsDuration().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsDuration_Cmprtr ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptBndsDurationCmprtr() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldTmgRptBndsDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledTiming().getRepeat().getBoundsDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptBndsDurationSys() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldTmgRptBndsDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledTiming().getRepeat().getBoundsDuration().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptBndsDurationUnt() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldTmgRptBndsDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledTiming().getRepeat().getBoundsDuration().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptBndsDurationVl() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldTmgRptBndsDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledTiming().getRepeat().getBoundsDuration().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptBndsPrdEnd() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldTmgRptBndsPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledTiming().getRepeat().getBoundsPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptBndsPrdStrt() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldTmgRptBndsPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledTiming().getRepeat().getBoundsPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptBndsRngHiCd() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldTmgRptBndsRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledTiming().getRepeat().getBoundsRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsRng_Hi_Cmprtr ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptBndsRngHiCmprtr() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldTmgRptBndsRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledTiming().getRepeat().getBoundsRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptBndsRngHiSys() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldTmgRptBndsRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledTiming().getRepeat().getBoundsRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptBndsRngHiUnt() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldTmgRptBndsRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledTiming().getRepeat().getBoundsRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptBndsRngHiVl() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldTmgRptBndsRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledTiming().getRepeat().getBoundsRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptBndsRngLwCd() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldTmgRptBndsRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledTiming().getRepeat().getBoundsRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsRng_Lw_Cmprtr ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptBndsRngLwCmprtr() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldTmgRptBndsRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledTiming().getRepeat().getBoundsRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptBndsRngLwSys() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldTmgRptBndsRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledTiming().getRepeat().getBoundsRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptBndsRngLwUnt() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldTmgRptBndsRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledTiming().getRepeat().getBoundsRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptBndsRngLwVl() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldTmgRptBndsRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledTiming().getRepeat().getBoundsRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_Cnt ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptCnt() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldTmgRptCnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledTiming().getRepeat().setCount(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_CntMx ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptCntMx() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldTmgRptCntMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledTiming().getRepeat().setCountMax(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_Duration ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptDuration() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldTmgRptDuration().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledTiming().getRepeat().setDuration((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_DurationMx ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptDurationMx() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldTmgRptDurationMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledTiming().getRepeat().setDurationMax((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_DurationUnt ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptDurationUnt() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldTmgRptDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledTiming().getRepeat().setDurationUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_Frqncy ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptFrqncy() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldTmgRptFrqncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledTiming().getRepeat().setFrequency(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_FrqncyMx ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptFrqncyMx() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldTmgRptFrqncyMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledTiming().getRepeat().setFrequencyMax(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_Off ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptOff() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldTmgRptOff().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledTiming().getRepeat().setOffset(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_Prd ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptPrd() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldTmgRptPrd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledTiming().getRepeat().setPeriod((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_PrdMx ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptPrdMx() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldTmgRptPrdMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledTiming().getRepeat().setPeriodMax((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_PrdUnt ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptPrdUnt() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldTmgRptPrdUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledTiming().getRepeat().setPeriodUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_TimeOfDay ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptTimeOfDay() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSchdldTmgRptTimeOfDay().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {careplan.getActivity().get(i0).getDetail().getScheduledTiming().getRepeat().addTimeOfDay(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CarePln_Actvty_Dtl_Sts ********************************************************************************/
		if(c.getCarePlnActvtyDtlSts() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlSts().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().setStatus(new org.hl7.fhir.r4.model.CarePlan.CarePlanActivityStatusEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CarePln_Actvty_Dtl_StsRsn_Cdg_Cd ********************************************************************************/
		if(c.getCarePlnActvtyDtlStsRsnCdgCd() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlStsRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				String[] arrayi1 = c.getCarePlnActvtyDtlStsRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getActivity().get(i0).getDetail().getStatusReason().getCoding().size() < i1+1) { careplan.getActivity().get(i0).getDetail().getStatusReason().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careplan.getActivity().get(i0).getDetail().getStatusReason().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CarePln_Actvty_Dtl_StsRsn_Cdg_Dsply ********************************************************************************/
		if(c.getCarePlnActvtyDtlStsRsnCdgDsply() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlStsRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				String[] arrayi1 = c.getCarePlnActvtyDtlStsRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getActivity().get(i0).getDetail().getStatusReason().getCoding().size() < i1+1) { careplan.getActivity().get(i0).getDetail().getStatusReason().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careplan.getActivity().get(i0).getDetail().getStatusReason().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CarePln_Actvty_Dtl_StsRsn_Cdg_Sys ********************************************************************************/
		if(c.getCarePlnActvtyDtlStsRsnCdgSys() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlStsRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				String[] arrayi1 = c.getCarePlnActvtyDtlStsRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getActivity().get(i0).getDetail().getStatusReason().getCoding().size() < i1+1) { careplan.getActivity().get(i0).getDetail().getStatusReason().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careplan.getActivity().get(i0).getDetail().getStatusReason().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CarePln_Actvty_Dtl_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(c.getCarePlnActvtyDtlStsRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlStsRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				String[] arrayi1 = c.getCarePlnActvtyDtlStsRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getActivity().get(i0).getDetail().getStatusReason().getCoding().size() < i1+1) { careplan.getActivity().get(i0).getDetail().getStatusReason().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careplan.getActivity().get(i0).getDetail().getStatusReason().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CarePln_Actvty_Dtl_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(c.getCarePlnActvtyDtlStsRsnCdgVrsn() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlStsRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				String[] arrayi1 = c.getCarePlnActvtyDtlStsRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getActivity().get(i0).getDetail().getStatusReason().getCoding().size() < i1+1) { careplan.getActivity().get(i0).getDetail().getStatusReason().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careplan.getActivity().get(i0).getDetail().getStatusReason().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CarePln_Actvty_Dtl_StsRsn_Txt ********************************************************************************/
		if(c.getCarePlnActvtyDtlStsRsnTxt() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyDtlStsRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).getDetail().getStatusReason().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CarePln_Actvty_OutcomeCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(c.getCarePlnActvtyOutcomeCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyOutcomeCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				String[] arrayi1 = c.getCarePlnActvtyOutcomeCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getActivity().get(i0).getOutcomeCodeableConcept().size() < i1+1) { careplan.getActivity().get(i0).addOutcomeCodeableConcept(); }
					String[] arrayi2 = c.getCarePlnActvtyOutcomeCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(careplan.getActivity().get(i0).getOutcomeCodeableConcept().get(i1).getCoding().size() < i2+1) { careplan.getActivity().get(i0).getOutcomeCodeableConcept().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {careplan.getActivity().get(i0).getOutcomeCodeableConcept().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CarePln_Actvty_OutcomeCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(c.getCarePlnActvtyOutcomeCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyOutcomeCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				String[] arrayi1 = c.getCarePlnActvtyOutcomeCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getActivity().get(i0).getOutcomeCodeableConcept().size() < i1+1) { careplan.getActivity().get(i0).addOutcomeCodeableConcept(); }
					String[] arrayi2 = c.getCarePlnActvtyOutcomeCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(careplan.getActivity().get(i0).getOutcomeCodeableConcept().get(i1).getCoding().size() < i2+1) { careplan.getActivity().get(i0).getOutcomeCodeableConcept().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {careplan.getActivity().get(i0).getOutcomeCodeableConcept().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CarePln_Actvty_OutcomeCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(c.getCarePlnActvtyOutcomeCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyOutcomeCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				String[] arrayi1 = c.getCarePlnActvtyOutcomeCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getActivity().get(i0).getOutcomeCodeableConcept().size() < i1+1) { careplan.getActivity().get(i0).addOutcomeCodeableConcept(); }
					String[] arrayi2 = c.getCarePlnActvtyOutcomeCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(careplan.getActivity().get(i0).getOutcomeCodeableConcept().get(i1).getCoding().size() < i2+1) { careplan.getActivity().get(i0).getOutcomeCodeableConcept().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {careplan.getActivity().get(i0).getOutcomeCodeableConcept().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CarePln_Actvty_OutcomeCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(c.getCarePlnActvtyOutcomeCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyOutcomeCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				String[] arrayi1 = c.getCarePlnActvtyOutcomeCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getActivity().get(i0).getOutcomeCodeableConcept().size() < i1+1) { careplan.getActivity().get(i0).addOutcomeCodeableConcept(); }
					String[] arrayi2 = c.getCarePlnActvtyOutcomeCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(careplan.getActivity().get(i0).getOutcomeCodeableConcept().get(i1).getCoding().size() < i2+1) { careplan.getActivity().get(i0).getOutcomeCodeableConcept().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {careplan.getActivity().get(i0).getOutcomeCodeableConcept().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** CarePln_Actvty_OutcomeCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(c.getCarePlnActvtyOutcomeCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyOutcomeCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				String[] arrayi1 = c.getCarePlnActvtyOutcomeCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getActivity().get(i0).getOutcomeCodeableConcept().size() < i1+1) { careplan.getActivity().get(i0).addOutcomeCodeableConcept(); }
					String[] arrayi2 = c.getCarePlnActvtyOutcomeCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(careplan.getActivity().get(i0).getOutcomeCodeableConcept().get(i1).getCoding().size() < i2+1) { careplan.getActivity().get(i0).getOutcomeCodeableConcept().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {careplan.getActivity().get(i0).getOutcomeCodeableConcept().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** CarePln_Actvty_OutcomeCdbleCncpt_Txt ********************************************************************************/
		if(c.getCarePlnActvtyOutcomeCdbleCncptTxt() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyOutcomeCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				String[] arrayi1 = c.getCarePlnActvtyOutcomeCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getActivity().get(i0).getOutcomeCodeableConcept().size() < i1+1) { careplan.getActivity().get(i0).addOutcomeCodeableConcept(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careplan.getActivity().get(i0).getOutcomeCodeableConcept().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CarePln_Actvty_OutcomeRfrnc ********************************************************************************/
		if(c.getCarePlnActvtyOutcomeRfrnc() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyOutcomeRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {careplan.getActivity().get(i0).addOutcomeReference(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CarePln_Actvty_Progress_AthrRfrnc ********************************************************************************/
		if(c.getCarePlnActvtyProgressAthrRfrnc() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyProgressAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				String[] arrayi1 = c.getCarePlnActvtyProgressAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getActivity().get(i0).getProgress().size() < i1+1) { careplan.getActivity().get(i0).addProgress(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careplan.getActivity().get(i0).getProgress().get(i1).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CarePln_Actvty_Progress_AthrStrgTyp ********************************************************************************/
		if(c.getCarePlnActvtyProgressAthrStrgTyp() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyProgressAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				String[] arrayi1 = c.getCarePlnActvtyProgressAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getActivity().get(i0).getProgress().size() < i1+1) { careplan.getActivity().get(i0).addProgress(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careplan.getActivity().get(i0).getProgress().get(i1).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CarePln_Actvty_Progress_Txt ********************************************************************************/
		if(c.getCarePlnActvtyProgressTxt() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyProgressTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				String[] arrayi1 = c.getCarePlnActvtyProgressTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getActivity().get(i0).getProgress().size() < i1+1) { careplan.getActivity().get(i0).addProgress(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careplan.getActivity().get(i0).getProgress().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CarePln_Actvty_Progress_Time ********************************************************************************/
		if(c.getCarePlnActvtyProgressTime() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyProgressTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				String[] arrayi1 = c.getCarePlnActvtyProgressTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getActivity().get(i0).getProgress().size() < i1+1) { careplan.getActivity().get(i0).addProgress(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careplan.getActivity().get(i0).getProgress().get(i1).setTime(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CarePln_Actvty_Rfrnc ********************************************************************************/
		if(c.getCarePlnActvtyRfrnc() != null ) {

			String[] arrayi0 = c.getCarePlnActvtyRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getActivity().size() < i0+1) { careplan.addActivity(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getActivity().get(i0).setReference(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CarePln_Addres ********************************************************************************/
		if(c.getCarePlnAddres() != null ) {

				for( String currListStrSplit : c.getCarePlnAddres().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			careplan.addAddresses(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** CarePln_Athr ********************************************************************************/
		if(c.getCarePlnAthr() != null ) {

			if(c.getCarePlnAthr().replace("[","").replace("]","").equals("NULL") | c.getCarePlnAthr()==null) {} else {
			careplan.setAuthor(new org.hl7.fhir.r4.model.Reference(c.getCarePlnAthr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CarePln_BasedOn ********************************************************************************/
		if(c.getCarePlnBasedOn() != null ) {

				for( String currListStrSplit : c.getCarePlnBasedOn().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			careplan.addBasedOn(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** CarePln_CareTeam ********************************************************************************/
		if(c.getCarePlnCareTeam() != null ) {

				for( String currListStrSplit : c.getCarePlnCareTeam().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			careplan.addCareTeam(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** CarePln_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getCarePlnCtgryCdgCd() != null ) {

			String[] arrayi0 = c.getCarePlnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getCategory().size() < i0+1) { careplan.addCategory(); }
				String[] arrayi1 = c.getCarePlnCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getCategory().get(i0).getCoding().size() < i1+1) { careplan.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careplan.getCategory().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CarePln_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getCarePlnCtgryCdgDsply() != null ) {

			String[] arrayi0 = c.getCarePlnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getCategory().size() < i0+1) { careplan.addCategory(); }
				String[] arrayi1 = c.getCarePlnCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getCategory().get(i0).getCoding().size() < i1+1) { careplan.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careplan.getCategory().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CarePln_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getCarePlnCtgryCdgSys() != null ) {

			String[] arrayi0 = c.getCarePlnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getCategory().size() < i0+1) { careplan.addCategory(); }
				String[] arrayi1 = c.getCarePlnCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getCategory().get(i0).getCoding().size() < i1+1) { careplan.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careplan.getCategory().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CarePln_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getCarePlnCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCarePlnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getCategory().size() < i0+1) { careplan.addCategory(); }
				String[] arrayi1 = c.getCarePlnCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getCategory().get(i0).getCoding().size() < i1+1) { careplan.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careplan.getCategory().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CarePln_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getCarePlnCtgryCdgVrsn() != null ) {

			String[] arrayi0 = c.getCarePlnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getCategory().size() < i0+1) { careplan.addCategory(); }
				String[] arrayi1 = c.getCarePlnCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getCategory().get(i0).getCoding().size() < i1+1) { careplan.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careplan.getCategory().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CarePln_Ctgry_Txt ********************************************************************************/
		if(c.getCarePlnCtgryTxt() != null ) {

			String[] arrayi0 = c.getCarePlnCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getCategory().size() < i0+1) { careplan.addCategory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getCategory().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CarePln_Contributor ********************************************************************************/
		if(c.getCarePlnContributor() != null ) {

				for( String currListStrSplit : c.getCarePlnContributor().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			careplan.addContributor(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** CarePln_Created ********************************************************************************/
		if(c.getCarePlnCreated() != null ) {

			if(c.getCarePlnCreated().replace("[","").replace("]","").equals("NULL") | c.getCarePlnCreated()==null) {} else {
			careplan.setCreated(c.getCarePlnCreated().replace("[","").replace("]","").equals("NULL") | c.getCarePlnCreated()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCarePlnCreated().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CarePln_Dscrptn ********************************************************************************/
		if(c.getCarePlnDscrptn() != null ) {

			if(c.getCarePlnDscrptn().replace("[","").replace("]","").equals("NULL") | c.getCarePlnDscrptn()==null) {} else {
			careplan.setDescription(c.getCarePlnDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** CarePln_Enc ********************************************************************************/
		if(c.getCarePlnEnc() != null ) {

			if(c.getCarePlnEnc().replace("[","").replace("]","").equals("NULL") | c.getCarePlnEnc()==null) {} else {
			careplan.setEncounter(new org.hl7.fhir.r4.model.Reference(c.getCarePlnEnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CarePln_Goal ********************************************************************************/
		if(c.getCarePlnGoal() != null ) {

				for( String currListStrSplit : c.getCarePlnGoal().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			careplan.addGoal(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** CarePln_Id_Assigner ********************************************************************************/
		if(c.getCarePlnIdAssigner() != null ) {

			String[] arrayi0 = c.getCarePlnIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getIdentifier().size() < i0+1) { careplan.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CarePln_Id_Prd_End ********************************************************************************/
		if(c.getCarePlnIdPrdEnd() != null ) {

			String[] arrayi0 = c.getCarePlnIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getIdentifier().size() < i0+1) { careplan.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CarePln_Id_Prd_Strt ********************************************************************************/
		if(c.getCarePlnIdPrdStrt() != null ) {

			String[] arrayi0 = c.getCarePlnIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getIdentifier().size() < i0+1) { careplan.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CarePln_Id_Sys ********************************************************************************/
		if(c.getCarePlnIdSys() != null ) {

			String[] arrayi0 = c.getCarePlnIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getIdentifier().size() < i0+1) { careplan.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CarePln_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCarePlnIdTypCdgCd() != null ) {

			String[] arrayi0 = c.getCarePlnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getIdentifier().size() < i0+1) { careplan.addIdentifier(); }
				String[] arrayi1 = c.getCarePlnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { careplan.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careplan.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CarePln_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCarePlnIdTypCdgDsply() != null ) {

			String[] arrayi0 = c.getCarePlnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getIdentifier().size() < i0+1) { careplan.addIdentifier(); }
				String[] arrayi1 = c.getCarePlnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { careplan.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careplan.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CarePln_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCarePlnIdTypCdgSys() != null ) {

			String[] arrayi0 = c.getCarePlnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getIdentifier().size() < i0+1) { careplan.addIdentifier(); }
				String[] arrayi1 = c.getCarePlnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { careplan.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careplan.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CarePln_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCarePlnIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getCarePlnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getIdentifier().size() < i0+1) { careplan.addIdentifier(); }
				String[] arrayi1 = c.getCarePlnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { careplan.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careplan.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** CarePln_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCarePlnIdTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getCarePlnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getIdentifier().size() < i0+1) { careplan.addIdentifier(); }
				String[] arrayi1 = c.getCarePlnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(careplan.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { careplan.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {careplan.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** CarePln_Id_Typ_Txt ********************************************************************************/
		if(c.getCarePlnIdTypTxt() != null ) {

			String[] arrayi0 = c.getCarePlnIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getIdentifier().size() < i0+1) { careplan.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CarePln_Id_Use ********************************************************************************/
		if(c.getCarePlnIdUse() != null ) {

			String[] arrayi0 = c.getCarePlnIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getIdentifier().size() < i0+1) { careplan.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CarePln_Id_Vl ********************************************************************************/
		if(c.getCarePlnIdVl() != null ) {

			String[] arrayi0 = c.getCarePlnIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getIdentifier().size() < i0+1) { careplan.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CarePln_InstantiatesCanonical ********************************************************************************/
		if(c.getCarePlnInstantiatesCanonical() != null ) {

				for( String currListStrSplit : c.getCarePlnInstantiatesCanonical().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			careplan.addInstantiatesCanonical(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** CarePln_InstantiatesUri ********************************************************************************/
		if(c.getCarePlnInstantiatesUri() != null ) {

				for( String currListStrSplit : c.getCarePlnInstantiatesUri().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			careplan.addInstantiatesUri(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** CarePln_Intent ********************************************************************************/
		if(c.getCarePlnIntent() != null ) {

			if(c.getCarePlnIntent().replace("[","").replace("]","").equals("NULL") | c.getCarePlnIntent()==null) {} else {
			careplan.setIntent(new org.hl7.fhir.r4.model.CarePlan.CarePlanIntentEnumFactory().fromCode(c.getCarePlnIntent().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CarePln_Nt_AthrRfrnc ********************************************************************************/
		if(c.getCarePlnNtAthrRfrnc() != null ) {

			String[] arrayi0 = c.getCarePlnNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getNote().size() < i0+1) { careplan.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CarePln_Nt_AthrStrgTyp ********************************************************************************/
		if(c.getCarePlnNtAthrStrgTyp() != null ) {

			String[] arrayi0 = c.getCarePlnNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getNote().size() < i0+1) { careplan.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CarePln_Nt_Txt ********************************************************************************/
		if(c.getCarePlnNtTxt() != null ) {

			String[] arrayi0 = c.getCarePlnNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getNote().size() < i0+1) { careplan.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** CarePln_Nt_Time ********************************************************************************/
		if(c.getCarePlnNtTime() != null ) {

			String[] arrayi0 = c.getCarePlnNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(careplan.getNote().size() < i0+1) { careplan.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {careplan.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** CarePln_PartOf ********************************************************************************/
		if(c.getCarePlnPartOf() != null ) {

				for( String currListStrSplit : c.getCarePlnPartOf().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			careplan.addPartOf(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** CarePln_Prd_End ********************************************************************************/
		if(c.getCarePlnPrdEnd() != null ) {

			if(c.getCarePlnPrdEnd().replace("[","").replace("]","").equals("NULL") | c.getCarePlnPrdEnd()==null) {} else {
			careplan.getPeriod().setEnd(c.getCarePlnPrdEnd().replace("[","").replace("]","").equals("NULL") | c.getCarePlnPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCarePlnPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CarePln_Prd_Strt ********************************************************************************/
		if(c.getCarePlnPrdStrt() != null ) {

			if(c.getCarePlnPrdStrt().replace("[","").replace("]","").equals("NULL") | c.getCarePlnPrdStrt()==null) {} else {
			careplan.getPeriod().setStart(c.getCarePlnPrdStrt().replace("[","").replace("]","").equals("NULL") | c.getCarePlnPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getCarePlnPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CarePln_Replaces ********************************************************************************/
		if(c.getCarePlnReplaces() != null ) {

				for( String currListStrSplit : c.getCarePlnReplaces().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			careplan.addReplaces(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** CarePln_Sts ********************************************************************************/
		if(c.getCarePlnSts() != null ) {

			if(c.getCarePlnSts().replace("[","").replace("]","").equals("NULL") | c.getCarePlnSts()==null) {} else {
			careplan.setStatus(new org.hl7.fhir.r4.model.CarePlan.CarePlanStatusEnumFactory().fromCode(c.getCarePlnSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CarePln_Sbjct ********************************************************************************/
		if(c.getCarePlnSbjct() != null ) {

			if(c.getCarePlnSbjct().replace("[","").replace("]","").equals("NULL") | c.getCarePlnSbjct()==null) {} else {
			careplan.setSubject(new org.hl7.fhir.r4.model.Reference(c.getCarePlnSbjct().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** CarePln_SprtingInfo ********************************************************************************/
		if(c.getCarePlnSprtingInfo() != null ) {

				for( String currListStrSplit : c.getCarePlnSprtingInfo().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			careplan.addSupportingInfo(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** CarePln_Ttl ********************************************************************************/
		if(c.getCarePlnTtl() != null ) {

			if(c.getCarePlnTtl().replace("[","").replace("]","").equals("NULL") | c.getCarePlnTtl()==null) {} else {
			careplan.setTitle(c.getCarePlnTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return careplan;
	}
}
